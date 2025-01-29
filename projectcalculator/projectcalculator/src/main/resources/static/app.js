const calculate = async (operation) => {
  const number1 = parseFloat(document.getElementById("number1").value);
  const number2 = parseFloat(document.getElementById("number2").value);

  if (isNaN(number1) || isNaN(number2)) {
      alert("Please enter valid numbers.");
      return;
  }

  const requestBody = {
      number1: number1,
      number2: number2
  };

  try {
      const response = await fetch(`/api/calculator/${operation}`, {
          method: "POST",
          headers: {
              "Content-Type": "application/json"
          },
          body: JSON.stringify(requestBody)
      });

      if (!response.ok) {
          throw new Error("Error performing operation");
      }

      const result = await response.text();
      document.getElementById("result").textContent = result;
  } catch (error) {
      alert("Something went wrong: " + error.message);
  }
};
