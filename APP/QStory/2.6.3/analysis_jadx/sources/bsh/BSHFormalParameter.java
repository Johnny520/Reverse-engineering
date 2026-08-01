package bsh;

import java.lang.reflect.Array;
import net.bytebuddy.implementation.auxiliary.TypeProxy;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
class BSHFormalParameter extends SimpleNode {
    public static final Class UNTYPED = null;
    int dimensions;
    boolean isFinal;
    boolean isVarArgs;
    public String name;
    public Class type;

    public BSHFormalParameter(int i) {
        super(i);
        this.isFinal = false;
        this.isVarArgs = false;
        this.dimensions = 0;
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2619
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

    public String getTypeDescriptor(CallStack callStack, Interpreter interpreter, String str) {
        int iJjtGetNumChildren = jjtGetNumChildren();
        boolean z = this.isVarArgs;
        if (iJjtGetNumChildren <= 0) {
            return (z ? "[" : "").concat(TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(z ? "[" : "");
        sb.append(((BSHType) jjtGetChild(0)).getTypeDescriptor(callStack, interpreter, str));
        return sb.toString();
    }

    @Override // bsh.SimpleNode
    public String toString() {
        return super.toString() + ": " + this.name + ", final=" + this.isFinal + ", varargs=" + this.isVarArgs;
    }
}
