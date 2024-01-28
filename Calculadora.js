let display = document.querySelector('.display');

function appendChar(char) {
    display.value += char;
    }

    function clearDisplay() {
        display.value = '';
        }

        function deleteChar() {
            display.value = display.value.slice(0, -1);
            }

            function calculateResult() {
                try {
                        display.value = eval(display.value);
                            } catch (error) {
                                    alert('Invalid input');
                                        }
                                        }