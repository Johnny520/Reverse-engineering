package bsh;

import androidx.activity.AbstractC0053;
import java.lang.reflect.Array;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
class BSHType extends SimpleNode implements InterfaceC2657 {
    private static final long serialVersionUID = 1;
    private int arrayDims;
    private Class<?> baseType;
    String descriptor;
    private boolean isListener;
    private Class<?> type;

    public BSHType(int i) {
        super(i);
        this.isListener = false;
    }

    public void addArrayDimension() {
        this.arrayDims++;
    }

    @Override // bsh.InterfaceC2657
    public void classLoaderChanged() {
        this.type = null;
        this.baseType = null;
    }

    public int getArrayDims() {
        return this.arrayDims;
    }

    public Class<?> getBaseType() {
        return this.baseType;
    }

    public Class<?> getType(CallStack callStack, Interpreter interpreter) throws EvalError {
        Class<?> cls = this.type;
        if (cls != null) {
            return cls;
        }
        InterfaceC2619 typeNode = getTypeNode();
        Class<?> cls2 = Object.class;
        if (typeNode instanceof BSHPrimitiveType) {
            this.baseType = ((BSHPrimitiveType) typeNode).getType();
        } else {
            try {
                this.baseType = ((BSHAmbiguousName) typeNode).toClass(callStack, interpreter);
            } catch (EvalError e) {
                if (typeNode.getText().trim().length() != 1 || !(e.getCause() instanceof ClassNotFoundException)) {
                    throw e;
                }
                this.baseType = cls2;
            }
        }
        int i = this.arrayDims;
        if (i > 0) {
            try {
                int[] iArr = new int[i];
                Class<?> cls3 = this.baseType;
                if (cls3 != null) {
                    cls2 = cls3;
                }
                this.type = Array.newInstance(cls2, iArr).getClass();
            } catch (Exception e2) {
                throw new EvalException("Couldn't construct array type", this, callStack, e2);
            }
        } else {
            this.type = this.baseType;
        }
        if (!this.isListener) {
            interpreter.getClassManager().mo5135(this);
            this.isListener = true;
        }
        return this.type;
    }

    public String getTypeDescriptor(CallStack callStack, Interpreter interpreter, String str) {
        String strM151;
        String str2 = this.descriptor;
        if (str2 != null) {
            return str2;
        }
        InterfaceC2619 typeNode = getTypeNode();
        if (typeNode instanceof BSHPrimitiveType) {
            strM151 = getTypeDescriptor(((BSHPrimitiveType) typeNode).type);
        } else {
            String strReplace = ((BSHAmbiguousName) typeNode).text;
            String str3 = callStack.top().importedClasses.get(strReplace);
            Class<?> cls = null;
            if (str3 == null) {
                try {
                    cls = ((BSHAmbiguousName) typeNode).toClass(callStack, interpreter);
                } catch (EvalError unused) {
                    if (strReplace.length() == 1) {
                        strReplace = "java.lang.Object";
                    }
                }
            } else {
                strReplace = str3.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '$');
            }
            if (cls != null) {
                strM151 = getTypeDescriptor(cls);
            } else if (str == null || Name.isCompound(strReplace)) {
                strM151 = "L" + strReplace.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/') + ";";
            } else {
                StringBuilder sb = new StringBuilder("L");
                sb.append(str.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/'));
                sb.append("/");
                strM151 = AbstractC0053.m151(sb, strReplace, ";");
            }
        }
        for (int i = 0; i < this.arrayDims; i++) {
            strM151 = AbstractC0053.m157("[", strM151);
        }
        this.descriptor = strM151;
        return strM151;
    }

    public InterfaceC2619 getTypeNode() {
        return jjtGetChild(0);
    }

    public static String getTypeDescriptor(Class<?> cls) {
        if (cls == Boolean.TYPE) {
            return "Z";
        }
        if (cls == Character.TYPE) {
            return "C";
        }
        if (cls == Byte.TYPE) {
            return "B";
        }
        if (cls == Short.TYPE) {
            return "S";
        }
        if (cls == Integer.TYPE) {
            return "I";
        }
        if (cls == Long.TYPE) {
            return "J";
        }
        if (cls == Float.TYPE) {
            return "F";
        }
        if (cls == Double.TYPE) {
            return "D";
        }
        if (cls == Void.TYPE) {
            return "V";
        }
        String strReplace = cls.getName().replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/');
        if (strReplace.startsWith("[") || strReplace.endsWith(";")) {
            return strReplace;
        }
        return "L" + strReplace.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/') + ";";
    }
}
