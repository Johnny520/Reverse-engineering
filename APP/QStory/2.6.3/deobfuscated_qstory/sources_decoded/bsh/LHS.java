package bsh;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import p281.C8372;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
class LHS implements InterfaceC2615, Serializable {
    static final int FIELD = 1;
    static final int INDEX = 3;
    static final int LOOSETYPE_FIELD = 5;
    static final int MAP_ENTRY = 6;
    static final int METHOD_EVAL = 4;
    static final int PROPERTY = 2;
    static final int VARIABLE = 0;
    private static final long serialVersionUID = 1;
    AbstractC2625 field;
    int index;
    boolean localVar;
    NameSpace nameSpace;
    Object object;
    Object propName;
    int type;
    Variable var;
    String varName;

    public LHS(Object obj, AbstractC2625 abstractC2625) {
        if (obj == null) {
            C2633.m5343("constructed empty LHS");
            throw null;
        }
        this.type = 1;
        this.object = obj;
        this.field = abstractC2625;
        if (abstractC2625 != null) {
            this.varName = abstractC2625.f7880;
        }
    }

    private Object getValueImpl() throws UtilEvalError {
        int i = this.type;
        if (i == 0) {
            return this.nameSpace.getVariableOrProperty(this.varName, null);
        }
        if (i == 1) {
            try {
                AbstractC2625 abstractC2625 = this.field;
                Objects.requireNonNull(abstractC2625, "get value, field cannot be null");
                return abstractC2625.mo5317(this.object, new Object[0]);
            } catch (ReflectiveOperationException e) {
                throw new UtilEvalError("Can't read field: " + this.field, e);
            }
        }
        if (i == 2) {
            try {
                return AbstractC2667.m5452(this.object, this.propName);
            } catch (ReflectError e2) {
                Interpreter.debug(e2.getMessage());
                throw new UtilEvalError("No such property: " + this.propName, e2);
            }
        }
        if (i != 3) {
            if (i == 5) {
                return this.nameSpace.getVariable(this.varName);
            }
            C2633.m5342("LHS type");
            return null;
        }
        try {
            return AbstractC2629.m5320(this.index, this.object);
        } catch (Exception e3) {
            throw new UtilEvalError("Array access: " + e3, e3);
        }
    }

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
        C2656 c2656 = (C2656) C2660.f7960.m13870(cls);
        String str = this.varName;
        ConcurrentHashMap concurrentHashMap = c2656.f7948;
        this.field = !concurrentHashMap.containsKey(str) ? null : (AbstractC2625) concurrentHashMap.get(str);
    }

    private synchronized void writeObject(ObjectOutputStream objectOutputStream) {
        try {
            AbstractC2625 abstractC2625 = this.field;
            if (abstractC2625 != null) {
                this.object = abstractC2625.f7885;
                this.varName = abstractC2625.f7880;
                this.field = null;
            }
            objectOutputStream.defaultWriteObject();
        } catch (Throwable th) {
            throw th;
        }
    }

    public Object assign(Object obj, boolean z) {
        int i = this.type;
        if (i == 0) {
            boolean z2 = this.localVar;
            NameSpace nameSpace = this.nameSpace;
            String str = this.varName;
            if (z2) {
                nameSpace.setLocalVariableOrProperty(str, obj, z);
            } else {
                nameSpace.setVariableOrProperty(str, obj, z);
            }
            return getValueImpl();
        }
        if (i == 1) {
            try {
                AbstractC2625 abstractC2625 = this.field;
                Object[] objArr = AbstractC2667.f8002;
                if (Modifier.isStatic(abstractC2625.getModifiers())) {
                    C8372 c8372 = Interpreter.mainSecurityGuard;
                    AbstractC2625 abstractC26252 = this.field;
                    c8372.m13877(abstractC26252.f7885, abstractC26252.f7880, obj);
                } else {
                    Interpreter.mainSecurityGuard.m13871(this.object, this.field.f7880, obj);
                }
                AbstractC2625 abstractC26253 = this.field;
                Objects.requireNonNull(abstractC26253, "assign value, field cannot be null");
                abstractC26253.mo5317(this.object, obj);
                return getValueImpl();
            } catch (ReflectiveOperationException e) {
                throw new UtilEvalError("LHS (" + this.field.f7880 + ") can't access field: " + e, e);
            }
        }
        if (i == 2) {
            try {
                Object obj2 = this.propName;
                boolean z3 = obj2 instanceof String;
                Object obj3 = this.object;
                if (!z3) {
                    return AbstractC2667.m5436(obj3, obj2, obj);
                }
                String str2 = (String) obj2;
                Object[] objArr2 = AbstractC2667.f8002;
                Map map = AbstractC2662.f7972;
                return ((obj3 instanceof Map.Entry) && (str2.equals("val") || str2.equals("value"))) ? ((Map.Entry) obj3).setValue(obj) : AbstractC2667.m5436(obj3, str2, obj);
            } catch (ReflectError e2) {
                Interpreter.debug("Assignment: " + e2.getMessage());
                throw new UtilEvalError("No such property: " + this.propName, e2);
            }
        }
        if (i != 3) {
            if (i != 5) {
                if (i == 6) {
                    Object obj4 = this.object;
                    return obj4 instanceof Map.Entry ? ((Map.Entry) obj4).setValue(obj) : new Types$MapEntry(this.object, obj);
                }
                C2633.m5342("unknown lhs type");
                return null;
            }
            Modifiers modifiers = new Modifiers(3);
            modifiers.addModifier("public");
            if (this.nameSpace.isInterface) {
                modifiers.setConstant();
            }
            this.nameSpace.setTypedVariable(this.varName, AbstractC2662.m5395(obj, false), obj, modifiers);
            return obj;
        }
        try {
            if (this.object.getClass().isArray() && obj != null) {
                try {
                    obj = AbstractC2662.m5373(obj, AbstractC2662.m5376(this.object.getClass()), 1);
                } catch (Exception unused) {
                }
            }
            AbstractC2629.m5326(this.object, this.index, obj);
            return obj;
        } catch (UtilTargetError e3) {
            if (!IndexOutOfBoundsException.class.isAssignableFrom(e3.getCause().getClass())) {
                throw e3;
            }
            throw new UtilEvalError("Error array set index: " + e3.getMessage(), e3);
        } catch (Exception e4) {
            throw new UtilEvalError("Assignment: " + e4.getMessage(), e4);
        }
    }

    public String getName() {
        AbstractC2625 abstractC2625 = this.field;
        if (abstractC2625 != null) {
            return abstractC2625.f7880;
        }
        Variable variable = this.var;
        return variable != null ? variable.getName() : this.varName;
    }

    public Class<?> getType() {
        AbstractC2625 abstractC2625 = this.field;
        if (abstractC2625 != null) {
            return abstractC2625.mo5296();
        }
        if (getVariable() != null) {
            return this.var.getType();
        }
        try {
            return AbstractC2662.m5395(getValueImpl(), false);
        } catch (UtilEvalError unused) {
            return null;
        }
    }

    public Object getValue() {
        if (this.type == 1) {
            AbstractC2625 abstractC2625 = this.field;
            Object[] objArr = AbstractC2667.f8002;
            if (Modifier.isStatic(abstractC2625.getModifiers())) {
                C8372 c8372 = Interpreter.mainSecurityGuard;
                AbstractC2625 abstractC26252 = this.field;
                c8372.m13874(abstractC26252.f7885, abstractC26252.f7880);
            } else {
                C8372 c83722 = Interpreter.mainSecurityGuard;
                String str = this.field.f7880;
                c83722.m13875();
            }
        }
        return getValueImpl();
    }

    public Variable getVariable() {
        Variable variable = this.var;
        if (variable != null) {
            return variable;
        }
        NameSpace nameSpace = this.nameSpace;
        Variable variableImpl = null;
        if (nameSpace != null) {
            String name = getName();
            Object[] objArr = AbstractC2667.f8002;
            try {
                variableImpl = nameSpace.getVariableImpl(name, false);
            } catch (Exception unused) {
            }
            this.var = variableImpl;
        } else if (isStatic()) {
            boolean zM5432 = AbstractC2667.m5432(this.field.f7885);
            AbstractC2625 abstractC2625 = this.field;
            if (zM5432) {
                Class cls = abstractC2625.f7885;
                String name2 = getName();
                NameSpace nameSpaceM5445 = AbstractC2667.m5445(cls);
                if (nameSpaceM5445 != null) {
                    try {
                        variableImpl = nameSpaceM5445.getVariableImpl(name2, false);
                    } catch (Exception unused2) {
                    }
                }
                this.var = variableImpl;
            } else {
                this.var = new Variable(abstractC2625.f7880, (Class<?>) abstractC2625.mo5296(), this);
            }
        } else if (AbstractC2667.m5432(this.object.getClass())) {
            Object obj = this.object;
            String name3 = getName();
            NameSpace nameSpaceM5444 = AbstractC2667.m5444(obj);
            if (nameSpaceM5444 != null) {
                try {
                    variableImpl = nameSpaceM5444.getVariableImpl(name3, false);
                } catch (Exception unused3) {
                }
            }
            this.var = variableImpl;
        } else {
            AbstractC2625 abstractC26252 = this.field;
            if (abstractC26252 != null) {
                this.var = new Variable(abstractC26252.f7880, (Class<?>) abstractC26252.mo5296(), this);
            }
        }
        return this.var;
    }

    public boolean isFinal() {
        if (getVariable() == null) {
            return false;
        }
        return this.var.hasModifier("final");
    }

    public boolean isStatic() {
        AbstractC2625 abstractC2625 = this.field;
        if (abstractC2625 != null) {
            return abstractC2625.mo5313();
        }
        Variable variable = this.var;
        if (variable == null) {
            return false;
        }
        return variable.hasModifier("static");
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("LHS: ");
        String str3 = "";
        if (this.field != null) {
            str = "field = " + this.field.f7881;
        } else {
            str = "";
        }
        sb.append(str);
        if (this.varName != null) {
            str2 = " varName = " + this.varName;
        } else {
            str2 = "";
        }
        sb.append(str2);
        if (this.nameSpace != null) {
            str3 = " nameSpace = " + this.nameSpace.toString();
        }
        sb.append(str3);
        return sb.toString();
    }

    public LHS(NameSpace nameSpace, String str) {
        this.type = 5;
        this.varName = str;
        this.nameSpace = nameSpace;
    }

    public LHS(AbstractC2625 abstractC2625) {
        this.type = 1;
        this.object = abstractC2625.f7885;
        this.field = abstractC2625;
        this.varName = abstractC2625.f7880;
    }

    public LHS(NameSpace nameSpace, String str, boolean z) {
        this.type = 0;
        this.localVar = z;
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
        C2633.m5343("constructed empty LHS");
        throw null;
    }

    public LHS(Object obj) {
        this.type = 6;
        this.object = obj;
    }

    public LHS(Object obj, int i) {
        this.type = 3;
        this.object = obj;
        this.index = i;
    }

    public Object assign(Object obj) {
        return assign(obj, false);
    }
}
