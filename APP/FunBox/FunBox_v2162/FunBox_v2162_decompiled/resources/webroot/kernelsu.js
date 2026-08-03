let callbackCounter = 0;

function nextCallbackName() {
    callbackCounter += 1;
    return `funbox_exec_${Date.now()}_${callbackCounter}`;
}

export function exec(command, options = {}) {
    return new Promise((resolve, reject) => {
        const callbackName = nextCallbackName();

        window[callbackName] = (errno, stdout, stderr) => {
            delete window[callbackName];
            resolve({ errno, stdout, stderr });
        };

        try {
            window.ksu.exec(command, JSON.stringify(options), callbackName);
        } catch (error) {
            delete window[callbackName];
            reject(error);
        }
    });
}

export function toast(message) {
    try {
        window.ksu.toast(message);
    } catch (_) {
        // The inline status remains available on managers without toast support.
    }
}
