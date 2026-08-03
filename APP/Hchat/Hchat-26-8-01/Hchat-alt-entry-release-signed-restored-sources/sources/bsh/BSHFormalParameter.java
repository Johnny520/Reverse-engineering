package bsh;

import java.lang.reflect.Array;
import okhttp3.HttpUrl;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHFormalParameter extends SimpleNode {
    public static final Class UNTYPED = null;
    private static final long serialVersionUID = 1;
    int dimensions;
    boolean isFinal;
    boolean isVarArgs;
    public String name;
    public Class type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BSHFormalParameter(int i9) {
        super(i9);
        this.isFinal = false;
        this.isVarArgs = false;
        this.dimensions = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(CallStack callStack, Interpreter interpreter) throws EvalError {
        if (jjtGetNumChildren() > 0) {
            Class<?> type = ((BSHType) jjtGetChild(0)).getType(callStack, interpreter);
            this.type = type;
            if (this.dimensions > 0) {
                if (type.isArray()) {
                    throw new EvalError("Array dimensions not allowed on both type and name: " + this.name, this, null);
                }
                this.type = Array.newInstance((Class<?>) this.type, new int[this.dimensions]).getClass();
            }
        } else {
            this.type = UNTYPED;
        }
        if (this.isVarArgs) {
            this.type = Array.newInstance((Class<?>) this.type, 0).getClass();
        }
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getTypeDescriptor(CallStack callStack, Interpreter interpreter, String str) {
        int iJjtGetNumChildren = jjtGetNumChildren();
        boolean z9 = this.isVarArgs;
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (iJjtGetNumChildren <= 0) {
            if (z9) {
                str2 = "[";
            }
            return str2.concat("Ljava/lang/Object;");
        }
        StringBuilder sb2 = new StringBuilder();
        if (z9) {
            str2 = "[";
        }
        sb2.append(str2);
        sb2.append(((BSHType) jjtGetChild(0)).getTypeDescriptor(callStack, interpreter, str));
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode
    public String toString() {
        return super.toString() + ": " + this.name + ", final=" + this.isFinal + ", varargs=" + this.isVarArgs;
    }
}
