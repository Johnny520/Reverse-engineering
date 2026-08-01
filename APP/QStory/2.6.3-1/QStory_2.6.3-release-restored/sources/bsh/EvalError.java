package bsh;

import androidx.activity.AbstractC0900;
import p025.AbstractC7012;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class EvalError extends Exception {
    private final CallStack callstack;
    private String message;
    private InterfaceC3452 node;

    public EvalError(String str, InterfaceC3452 interfaceC3452, CallStack callStack) {
        this.message = str;
        this.node = interfaceC3452;
        this.callstack = callStack == null ? null : callStack.copy();
    }

    public int getErrorLineNumber() {
        InterfaceC3452 interfaceC3452 = this.node;
        if (interfaceC3452 != null) {
            return interfaceC3452.getLineNumber();
        }
        return -1;
    }

    public String getErrorSourceFile() {
        InterfaceC3452 interfaceC3452 = this.node;
        return interfaceC3452 != null ? interfaceC3452.getSourceFile() : "<unknown file>";
    }

    public String getErrorText() {
        InterfaceC3452 interfaceC3452 = this.node;
        return interfaceC3452 != null ? interfaceC3452.getText() : "<unknown error>";
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String string;
        if (this.node != null) {
            string = "\n\tat " + this.node.getText() + " (" + this.node.getSourceFile() + ":" + this.node.getLineNumber() + ")";
        } else {
            string = ": <at unknown location>";
        }
        if (this.callstack != null) {
            StringBuilder sbM700 = AbstractC0900.m700(string);
            sbM700.append(getScriptStackTrace());
            string = sbM700.toString();
        }
        return getRawMessage() + string;
    }

    public InterfaceC3452 getNode() {
        return this.node;
    }

    public String getRawMessage() {
        return this.message;
    }

    public String getScriptStackTrace() {
        CallStack callStack = this.callstack;
        if (callStack == null) {
            return "<Unknown>";
        }
        CallStack callStackCopy = callStack.copy();
        String string = "";
        while (callStackCopy.depth() > 0) {
            NameSpace nameSpacePop = callStackCopy.pop();
            InterfaceC3452 node = nameSpacePop.getNode();
            if (nameSpacePop.isMethod) {
                StringBuilder sbM12143 = AbstractC7012.m12143(string, "\nCalled from method: ");
                sbM12143.append(nameSpacePop.getName());
                string = sbM12143.toString();
                if (node != null) {
                    StringBuilder sbM121432 = AbstractC7012.m12143(string, "\n\tat ");
                    sbM121432.append(node.getText());
                    sbM121432.append(" (");
                    sbM121432.append(node.getSourceFile());
                    sbM121432.append(":");
                    sbM121432.append(node.getLineNumber());
                    sbM121432.append(")");
                    string = sbM121432.toString();
                }
            }
        }
        return string;
    }

    public void prependMessage(String str) {
        if (str == null) {
            return;
        }
        if (this.message == null) {
            this.message = str;
            return;
        }
        StringBuilder sbM12143 = AbstractC7012.m12143(str, " : ");
        sbM12143.append(this.message);
        this.message = sbM12143.toString();
    }

    public EvalError reThrow(String str) {
        prependMessage(str);
        return this;
    }

    public void setNode(InterfaceC3452 interfaceC3452) {
        this.node = interfaceC3452;
    }

    public EvalError(String str, InterfaceC3452 interfaceC3452, CallStack callStack, Throwable th) {
        this(str, interfaceC3452, callStack);
        initCause(th);
    }
}
