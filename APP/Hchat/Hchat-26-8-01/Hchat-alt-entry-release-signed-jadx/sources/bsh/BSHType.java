package bsh;

import bsh.BshClassManager;
import java.lang.reflect.Array;
import p068eh.AbstractC0921a;
import p332wb.AbstractC4855en;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHType extends SimpleNode implements BshClassManager.Listener {
    private static final long serialVersionUID = 1;
    private int arrayDims;
    private Class<?> baseType;
    String descriptor;
    private boolean isListener;
    private Class<?> type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BSHType(int i9) {
        super(i9);
        this.isListener = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void addArrayDimension() {
        this.arrayDims++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.BshClassManager.Listener
    public void classLoaderChanged() {
        this.type = null;
        this.baseType = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getArrayDims() {
        return this.arrayDims;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Class<?> getBaseType() {
        return this.baseType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Class<?> getType(CallStack callStack, Interpreter interpreter) throws EvalError {
        Class<?> cls = this.type;
        if (cls != null) {
            return cls;
        }
        Node typeNode = getTypeNode();
        Class<?> cls2 = Object.class;
        if (typeNode instanceof BSHPrimitiveType) {
            this.baseType = ((BSHPrimitiveType) typeNode).getType();
        } else {
            try {
                this.baseType = ((BSHAmbiguousName) typeNode).toClass(callStack, interpreter);
            } catch (EvalError e6) {
                if (typeNode.getText().trim().length() != 1 || !(e6.getCause() instanceof ClassNotFoundException)) {
                    throw e6;
                }
                this.baseType = cls2;
            }
        }
        int i9 = this.arrayDims;
        if (i9 > 0) {
            try {
                int[] iArr = new int[i9];
                Class<?> cls3 = this.baseType;
                if (cls3 != null) {
                    cls2 = cls3;
                }
                this.type = Array.newInstance(cls2, iArr).getClass();
            } catch (Exception e7) {
                throw new EvalException("Couldn't construct array type", this, callStack, e7);
            }
        } else {
            this.type = this.baseType;
        }
        if (!this.isListener) {
            interpreter.getClassManager().addListener(this);
            this.isListener = true;
        }
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getTypeDescriptor(CallStack callStack, Interpreter interpreter, String str) {
        String strM2255r;
        String str2 = this.descriptor;
        if (str2 != null) {
            return str2;
        }
        Node typeNode = getTypeNode();
        if (typeNode instanceof BSHPrimitiveType) {
            strM2255r = getTypeDescriptor(((BSHPrimitiveType) typeNode).type);
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
                strReplace = str3.replace('.', '$');
            }
            if (cls != null) {
                strM2255r = getTypeDescriptor(cls);
            } else if (str == null || Name.isCompound(strReplace)) {
                strM2255r = "L" + strReplace.replace('.', '/') + ";";
            } else {
                StringBuilder sb2 = new StringBuilder("L");
                sb2.append(str.replace('.', '/'));
                sb2.append("/");
                strM2255r = AbstractC0921a.m2255r(sb2, strReplace, ";");
            }
        }
        for (int i9 = 0; i9 < this.arrayDims; i9++) {
            strM2255r = AbstractC4855en.m9263g("[", strM2255r);
        }
        this.descriptor = strM2255r;
        return strM2255r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Node getTypeNode() {
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
        String strReplace = cls.getName().replace('.', '/');
        if (strReplace.startsWith("[") || strReplace.endsWith(";")) {
            return strReplace;
        }
        return "L" + strReplace.replace('.', '/') + ";";
    }
}
