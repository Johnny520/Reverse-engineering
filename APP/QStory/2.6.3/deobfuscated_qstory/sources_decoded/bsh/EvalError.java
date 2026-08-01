package bsh;

import androidx.activity.AbstractC0053;
import p009.AbstractC6183;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class EvalError extends Exception {
    private final CallStack callstack;
    private String message;
    private InterfaceC2619 node;

    public EvalError(String str, InterfaceC2619 interfaceC2619, CallStack callStack) {
        this.message = str;
        this.node = interfaceC2619;
        this.callstack = callStack == null ? null : callStack.copy();
    }

    public int getErrorLineNumber() {
        InterfaceC2619 interfaceC2619 = this.node;
        if (interfaceC2619 != null) {
            return interfaceC2619.getLineNumber();
        }
        return -1;
    }

    public String getErrorSourceFile() {
        InterfaceC2619 interfaceC2619 = this.node;
        return interfaceC2619 != null ? interfaceC2619.getSourceFile() : "<unknown file>";
    }

    public String getErrorText() {
        InterfaceC2619 interfaceC2619 = this.node;
        return interfaceC2619 != null ? interfaceC2619.getText() : "<unknown error>";
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
            StringBuilder sbM140 = AbstractC0053.m140(string);
            sbM140.append(getScriptStackTrace());
            string = sbM140.toString();
        }
        return getRawMessage() + string;
    }

    public InterfaceC2619 getNode() {
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
            InterfaceC2619 node = nameSpacePop.getNode();
            if (nameSpacePop.isMethod) {
                StringBuilder sbM11584 = AbstractC6183.m11584(string, "\nCalled from method: ");
                sbM11584.append(nameSpacePop.getName());
                string = sbM11584.toString();
                if (node != null) {
                    StringBuilder sbM115842 = AbstractC6183.m11584(string, "\n\tat ");
                    sbM115842.append(node.getText());
                    sbM115842.append(" (");
                    sbM115842.append(node.getSourceFile());
                    sbM115842.append(":");
                    sbM115842.append(node.getLineNumber());
                    sbM115842.append(")");
                    string = sbM115842.toString();
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
        StringBuilder sbM11584 = AbstractC6183.m11584(str, " : ");
        sbM11584.append(this.message);
        this.message = sbM11584.toString();
    }

    public EvalError reThrow(String str) {
        prependMessage(str);
        return this;
    }

    public void setNode(InterfaceC2619 interfaceC2619) {
        this.node = interfaceC2619;
    }

    public EvalError(String str, InterfaceC2619 interfaceC2619, CallStack callStack, Throwable th) {
        this(str, interfaceC2619, callStack);
        initCause(th);
    }
}
