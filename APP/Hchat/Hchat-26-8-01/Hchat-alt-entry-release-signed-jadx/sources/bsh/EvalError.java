package bsh;

import okhttp3.HttpUrl;
import p025bc.AbstractC0255e;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class EvalError extends Exception {
    private final CallStack callstack;
    private String message;
    private Node node;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public EvalError(String str, Node node, CallStack callStack) {
        this.message = str;
        this.node = node;
        this.callstack = callStack == null ? null : callStack.copy();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getErrorLineNumber() {
        Node node = this.node;
        if (node != null) {
            return node.getLineNumber();
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getErrorSourceFile() {
        Node node = this.node;
        return node != null ? node.getSourceFile() : "<unknown file>";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getErrorText() {
        Node node = this.node;
        return node != null ? node.getText() : "<unknown error>";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Throwable
    public String getMessage() {
        String str;
        if (this.node != null) {
            str = "\n\tat " + this.node.getText() + " (" + this.node.getSourceFile() + ":" + this.node.getLineNumber() + ")";
        } else {
            str = ": <at unknown location>";
        }
        if (this.callstack != null) {
            str = str + getScriptStackTrace();
        }
        return getRawMessage() + str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Node getNode() {
        return this.node;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getRawMessage() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getScriptStackTrace() {
        CallStack callStack = this.callstack;
        if (callStack == null) {
            return "<Unknown>";
        }
        CallStack callStackCopy = callStack.copy();
        String string = HttpUrl.FRAGMENT_ENCODE_SET;
        while (callStackCopy.depth() > 0) {
            NameSpace nameSpacePop = callStackCopy.pop();
            Node node = nameSpacePop.getNode();
            if (nameSpacePop.isMethod) {
                StringBuilder sbM1025n = AbstractC0255e.m1025n(string, "\nCalled from method: ");
                sbM1025n.append(nameSpacePop.getName());
                string = sbM1025n.toString();
                if (node != null) {
                    StringBuilder sbM1025n2 = AbstractC0255e.m1025n(string, "\n\tat ");
                    sbM1025n2.append(node.getText());
                    sbM1025n2.append(" (");
                    sbM1025n2.append(node.getSourceFile());
                    sbM1025n2.append(":");
                    sbM1025n2.append(node.getLineNumber());
                    sbM1025n2.append(")");
                    string = sbM1025n2.toString();
                }
            }
        }
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void prependMessage(String str) {
        if (str == null) {
            return;
        }
        if (this.message == null) {
            this.message = str;
            return;
        }
        StringBuilder sbM1025n = AbstractC0255e.m1025n(str, " : ");
        sbM1025n.append(this.message);
        this.message = sbM1025n.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public EvalError reThrow(String str) {
        prependMessage(str);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setNode(Node node) {
        this.node = node;
    }

    public EvalError(String str, Node node, CallStack callStack, Throwable th2) {
        this(str, node, callStack);
        initCause(th2);
    }
}
