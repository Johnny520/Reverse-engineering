package bsh;

import androidx.activity.AbstractC0053;
import p007.AbstractC6136;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class EvalError extends Exception {
    private final CallStack callstack;
    private String message;
    private InterfaceC2618 node;

    public EvalError(String str, InterfaceC2618 interfaceC2618, CallStack callStack) {
        this.message = str;
        this.node = interfaceC2618;
        this.callstack = callStack == null ? null : callStack.copy();
    }

    public int getErrorLineNumber() {
        InterfaceC2618 interfaceC2618 = this.node;
        if (interfaceC2618 != null) {
            return interfaceC2618.getLineNumber();
        }
        return -1;
    }

    public String getErrorSourceFile() {
        InterfaceC2618 interfaceC2618 = this.node;
        return interfaceC2618 != null ? interfaceC2618.getSourceFile() : "<unknown file>";
    }

    public String getErrorText() {
        InterfaceC2618 interfaceC2618 = this.node;
        return interfaceC2618 != null ? interfaceC2618.getText() : "<unknown error>";
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
            StringBuilder sbM149 = AbstractC0053.m149(string);
            sbM149.append(getScriptStackTrace());
            string = sbM149.toString();
        }
        return getRawMessage() + string;
    }

    public InterfaceC2618 getNode() {
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
            InterfaceC2618 node = nameSpacePop.getNode();
            if (nameSpacePop.isMethod) {
                StringBuilder sbM11553 = AbstractC6136.m11553(string, "\nCalled from method: ");
                sbM11553.append(nameSpacePop.getName());
                string = sbM11553.toString();
                if (node != null) {
                    StringBuilder sbM115532 = AbstractC6136.m11553(string, "\n\tat ");
                    sbM115532.append(node.getText());
                    sbM115532.append(" (");
                    sbM115532.append(node.getSourceFile());
                    sbM115532.append(":");
                    sbM115532.append(node.getLineNumber());
                    sbM115532.append(")");
                    string = sbM115532.toString();
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
        StringBuilder sbM11553 = AbstractC6136.m11553(str, " : ");
        sbM11553.append(this.message);
        this.message = sbM11553.toString();
    }

    public EvalError reThrow(String str) {
        prependMessage(str);
        return this;
    }

    public void setNode(InterfaceC2618 interfaceC2618) {
        this.node = interfaceC2618;
    }

    public EvalError(String str, InterfaceC2618 interfaceC2618, CallStack callStack, Throwable th) {
        this(str, interfaceC2618, callStack);
        initCause(th);
    }
}
