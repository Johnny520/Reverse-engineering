package bsh;

import bsh.Types;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;
import java.util.Objects;
import okhttp3.HttpUrl;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class LHS implements ParserConstants, Serializable {
    static final int FIELD = 1;
    static final int INDEX = 3;
    static final int LOOSETYPE_FIELD = 5;
    static final int MAP_ENTRY = 6;
    static final int METHOD_EVAL = 4;
    static final int PROPERTY = 2;
    static final int VARIABLE = 0;
    private static final long serialVersionUID = 1;
    Invocable field;
    int index;
    boolean localVar;
    NameSpace nameSpace;
    Object object;
    Object propName;
    int type;
    Variable var;
    String varName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public LHS(Object obj, Invocable invocable) {
        if (obj == null) {
            C0353j.m1305c("constructed empty LHS");
            throw null;
        }
        this.type = 1;
        this.object = obj;
        this.field = invocable;
        if (invocable != null) {
            this.varName = invocable.getName();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Object getValueImpl() throws UtilEvalError {
        int i9 = this.type;
        if (i9 == 0) {
            return this.nameSpace.getVariableOrProperty(this.varName, null);
        }
        if (i9 == 1) {
            try {
                Invocable invocable = this.field;
                Objects.requireNonNull(invocable, "get value, field cannot be null");
                return invocable.invoke(this.object, new Object[0]);
            } catch (ReflectiveOperationException e6) {
                throw new UtilEvalError("Can't read field: " + this.field, e6);
            }
        }
        if (i9 == 2) {
            try {
                return Reflect.getObjectProperty(this.object, this.propName);
            } catch (ReflectError e7) {
                Interpreter.debug(e7.getMessage());
                throw new UtilEvalError("No such property: " + this.propName, e7);
            }
        }
        if (i9 != 3) {
            if (i9 == 5) {
                return this.nameSpace.getVariable(this.varName);
            }
            C0353j.m1308f("LHS type");
            return null;
        }
        try {
            return BshArray.getIndex(this.object, this.index);
        } catch (Exception e10) {
            throw new UtilEvalError("Array access: " + e10, e10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object obj = this.object;
        if (obj == null) {
            return;
        }
        Class<?> cls = obj.getClass();
        Object obj2 = this.object;
        if (obj2 instanceof Class) {
            cls = (Class) obj2;
        }
        this.field = BshClassManager.memberCache.get(cls).findField(this.varName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private synchronized void writeObject(ObjectOutputStream objectOutputStream) {
        try {
            Invocable invocable = this.field;
            if (invocable != null) {
                this.object = invocable.getDeclaringClass();
                this.varName = this.field.getName();
                this.field = null;
            }
            objectOutputStream.defaultWriteObject();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object assign(Object obj, boolean z9) {
        int i9 = this.type;
        if (i9 == 0) {
            boolean z10 = this.localVar;
            NameSpace nameSpace = this.nameSpace;
            if (z10) {
                nameSpace.setLocalVariableOrProperty(this.varName, obj, z9);
            } else {
                nameSpace.setVariableOrProperty(this.varName, obj, z9);
            }
            return getValueImpl();
        }
        if (i9 == 1) {
            try {
                if (Reflect.isStatic(this.field)) {
                    Interpreter.mainSecurityGuard.canSetStaticField(this.field.getDeclaringClass(), this.field.getName(), obj);
                } else {
                    Interpreter.mainSecurityGuard.canSetField(this.object, this.field.getName(), obj);
                }
                Invocable invocable = this.field;
                Objects.requireNonNull(invocable, "assign value, field cannot be null");
                invocable.invoke(this.object, obj);
                return getValueImpl();
            } catch (ReflectiveOperationException e6) {
                throw new UtilEvalError("LHS (" + this.field.getName() + ") can't access field: " + e6, e6);
            }
        }
        if (i9 == 2) {
            try {
                Object obj2 = this.propName;
                boolean z11 = obj2 instanceof String;
                Object obj3 = this.object;
                return z11 ? Reflect.setObjectProperty(obj3, (String) obj2, obj) : Reflect.setObjectProperty(obj3, obj2, obj);
            } catch (ReflectError e7) {
                Interpreter.debug("Assignment: " + e7.getMessage());
                throw new UtilEvalError("No such property: " + this.propName, e7);
            }
        }
        if (i9 != 3) {
            if (i9 != 5) {
                if (i9 == 6) {
                    Object obj4 = this.object;
                    return obj4 instanceof Map.Entry ? ((Map.Entry) obj4).setValue(obj) : new Types.MapEntry(this.object, obj);
                }
                C0353j.m1308f("unknown lhs type");
                return null;
            }
            Modifiers modifiers = new Modifiers(3);
            modifiers.addModifier("public");
            if (this.nameSpace.isInterface) {
                modifiers.setConstant();
            }
            this.nameSpace.setTypedVariable(this.varName, Types.getType(obj), obj, modifiers);
            return obj;
        }
        try {
            if (this.object.getClass().isArray() && obj != null) {
                try {
                    obj = Types.castObject(obj, Types.arrayElementType(this.object.getClass()), 1);
                } catch (Exception unused) {
                }
            }
            BshArray.setIndex(this.object, this.index, obj);
            return obj;
        } catch (UtilTargetError e10) {
            if (!IndexOutOfBoundsException.class.isAssignableFrom(e10.getCause().getClass())) {
                throw e10;
            }
            throw new UtilEvalError("Error array set index: " + e10.getMessage(), e10);
        } catch (Exception e11) {
            throw new UtilEvalError("Assignment: " + e11.getMessage(), e11);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getName() {
        Invocable invocable = this.field;
        if (invocable != null) {
            return invocable.getName();
        }
        Variable variable = this.var;
        return variable != null ? variable.getName() : this.varName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Class<?> getType() {
        Invocable invocable = this.field;
        if (invocable != null) {
            return invocable.getReturnType();
        }
        if (getVariable() != null) {
            return this.var.getType();
        }
        try {
            return Types.getType(getValueImpl());
        } catch (UtilEvalError unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object getValue() {
        if (this.type == 1) {
            if (Reflect.isStatic(this.field)) {
                Interpreter.mainSecurityGuard.canGetStaticField(this.field.getDeclaringClass(), this.field.getName());
            } else {
                Interpreter.mainSecurityGuard.canGetField(this.object, this.field.getName());
            }
        }
        return getValueImpl();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Variable getVariable() {
        Variable variable = this.var;
        if (variable != null) {
            return variable;
        }
        NameSpace nameSpace = this.nameSpace;
        if (nameSpace != null) {
            this.var = Reflect.getVariable(nameSpace, getName());
        } else if (isStatic()) {
            boolean zIsGeneratedClass = Reflect.isGeneratedClass(this.field.getDeclaringClass());
            Invocable invocable = this.field;
            if (zIsGeneratedClass) {
                this.var = Reflect.getVariable(invocable.getDeclaringClass(), getName());
            } else {
                this.var = new Variable(invocable.getName(), this.field.getReturnType(), this);
            }
        } else if (Reflect.isGeneratedClass(this.object.getClass())) {
            this.var = Reflect.getVariable(this.object, getName());
        } else {
            Invocable invocable2 = this.field;
            if (invocable2 != null) {
                this.var = new Variable(invocable2.getName(), this.field.getReturnType(), this);
            }
        }
        return this.var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean isFinal() {
        if (getVariable() == null) {
            return false;
        }
        return this.var.hasModifier("final");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean isStatic() {
        Invocable invocable = this.field;
        if (invocable != null) {
            return invocable.isStatic();
        }
        Variable variable = this.var;
        if (variable == null) {
            return false;
        }
        return variable.hasModifier("static");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("LHS: ");
        Invocable invocable = this.field;
        String str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (invocable != null) {
            str = "field = " + this.field.toString();
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        sb2.append(str);
        if (this.varName != null) {
            str2 = " varName = " + this.varName;
        } else {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        sb2.append(str2);
        if (this.nameSpace != null) {
            str3 = " nameSpace = " + this.nameSpace.toString();
        }
        sb2.append(str3);
        return sb2.toString();
    }

    public LHS(NameSpace nameSpace, String str) {
        this.type = 5;
        this.varName = str;
        this.nameSpace = nameSpace;
    }

    public LHS(Invocable invocable) {
        this.type = 1;
        this.object = invocable.getDeclaringClass();
        this.field = invocable;
        this.varName = invocable.getName();
    }

    public LHS(NameSpace nameSpace, String str, boolean z9) {
        this.type = 0;
        this.localVar = z9;
        this.varName = str;
        this.nameSpace = nameSpace;
    }

    public LHS(Object obj, Object obj2) {
        if (obj != null) {
            this.type = 2;
            this.object = obj;
            this.propName = obj2;
            return;
        }
        C0353j.m1305c("constructed empty LHS");
        throw null;
    }

    public LHS(Object obj) {
        this.type = 6;
        this.object = obj;
    }

    public LHS(Object obj, int i9) {
        this.type = 3;
        this.object = obj;
        this.index = i9;
    }

    public Object assign(Object obj) {
        return assign(obj, false);
    }
}
