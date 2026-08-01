package bsh;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import p281.C8371;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
class LHS implements InterfaceC2614, Serializable {
    static final int FIELD = 1;
    static final int INDEX = 3;
    static final int LOOSETYPE_FIELD = 5;
    static final int MAP_ENTRY = 6;
    static final int METHOD_EVAL = 4;
    static final int PROPERTY = 2;
    static final int VARIABLE = 0;
    private static final long serialVersionUID = 1;
    AbstractC2624 field;
    int index;
    boolean localVar;
    NameSpace nameSpace;
    Object object;
    Object propName;
    int type;
    Variable var;
    String varName;

    public LHS(Object obj, AbstractC2624 abstractC2624) {
        if (obj == null) {
            C2632.m5298("constructed empty LHS");
            throw null;
        }
        this.type = 1;
        this.object = obj;
        this.field = abstractC2624;
        if (abstractC2624 != null) {
            this.varName = abstractC2624.f7878;
        }
    }

    private Object getValueImpl() throws UtilEvalError {
        int i = this.type;
        if (i == 0) {
            return this.nameSpace.getVariableOrProperty(this.varName, null);
        }
        if (i == 1) {
            try {
                AbstractC2624 abstractC2624 = this.field;
                Objects.requireNonNull(abstractC2624, "get value, field cannot be null");
                return abstractC2624.mo5272(this.object, new Object[0]);
            } catch (ReflectiveOperationException e) {
                throw new UtilEvalError("Can't read field: " + this.field, e);
            }
        }
        if (i == 2) {
            try {
                return AbstractC2666.m5407(this.object, this.propName);
            } catch (ReflectError e2) {
                Interpreter.debug(e2.getMessage());
                throw new UtilEvalError("No such property: " + this.propName, e2);
            }
        }
        if (i != 3) {
            if (i == 5) {
                return this.nameSpace.getVariable(this.varName);
            }
            C2632.m5297("LHS type");
            return null;
        }
        try {
            return AbstractC2628.m5275(this.index, this.object);
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
        C2655 c2655 = (C2655) C2659.f7958.m13853(cls);
        String str = this.varName;
        ConcurrentHashMap concurrentHashMap = c2655.f7946;
        this.field = !concurrentHashMap.containsKey(str) ? null : (AbstractC2624) concurrentHashMap.get(str);
    }

    private synchronized void writeObject(ObjectOutputStream objectOutputStream) {
        try {
            AbstractC2624 abstractC2624 = this.field;
            if (abstractC2624 != null) {
                this.object = abstractC2624.f7883;
                this.varName = abstractC2624.f7878;
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
                AbstractC2624 abstractC2624 = this.field;
                Object[] objArr = AbstractC2666.f8000;
                if (Modifier.isStatic(abstractC2624.getModifiers())) {
                    C8371 c8371 = Interpreter.mainSecurityGuard;
                    AbstractC2624 abstractC26242 = this.field;
                    c8371.m13860(abstractC26242.f7883, abstractC26242.f7878, obj);
                } else {
                    Interpreter.mainSecurityGuard.m13854(this.object, this.field.f7878, obj);
                }
                AbstractC2624 abstractC26243 = this.field;
                Objects.requireNonNull(abstractC26243, "assign value, field cannot be null");
                abstractC26243.mo5272(this.object, obj);
                return getValueImpl();
            } catch (ReflectiveOperationException e) {
                throw new UtilEvalError("LHS (" + this.field.f7878 + ") can't access field: " + e, e);
            }
        }
        if (i == 2) {
            try {
                Object obj2 = this.propName;
                boolean z3 = obj2 instanceof String;
                Object obj3 = this.object;
                if (!z3) {
                    return AbstractC2666.m5391(obj3, obj2, obj);
                }
                String str2 = (String) obj2;
                Object[] objArr2 = AbstractC2666.f8000;
                Map map = AbstractC2661.f7970;
                return ((obj3 instanceof Map.Entry) && (str2.equals("val") || str2.equals("value"))) ? ((Map.Entry) obj3).setValue(obj) : AbstractC2666.m5391(obj3, str2, obj);
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
                C2632.m5297("unknown lhs type");
                return null;
            }
            Modifiers modifiers = new Modifiers(3);
            modifiers.addModifier("public");
            if (this.nameSpace.isInterface) {
                modifiers.setConstant();
            }
            this.nameSpace.setTypedVariable(this.varName, AbstractC2661.m5350(obj, false), obj, modifiers);
            return obj;
        }
        try {
            if (this.object.getClass().isArray() && obj != null) {
                try {
                    obj = AbstractC2661.m5328(obj, AbstractC2661.m5331(this.object.getClass()), 1);
                } catch (Exception unused) {
                }
            }
            AbstractC2628.m5281(this.object, this.index, obj);
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
        AbstractC2624 abstractC2624 = this.field;
        if (abstractC2624 != null) {
            return abstractC2624.f7878;
        }
        Variable variable = this.var;
        return variable != null ? variable.getName() : this.varName;
    }

    public Class<?> getType() {
        AbstractC2624 abstractC2624 = this.field;
        if (abstractC2624 != null) {
            return abstractC2624.mo5251();
        }
        if (getVariable() != null) {
            return this.var.getType();
        }
        try {
            return AbstractC2661.m5350(getValueImpl(), false);
        } catch (UtilEvalError unused) {
            return null;
        }
    }

    public Object getValue() {
        if (this.type == 1) {
            AbstractC2624 abstractC2624 = this.field;
            Object[] objArr = AbstractC2666.f8000;
            if (Modifier.isStatic(abstractC2624.getModifiers())) {
                C8371 c8371 = Interpreter.mainSecurityGuard;
                AbstractC2624 abstractC26242 = this.field;
                c8371.m13857(abstractC26242.f7883, abstractC26242.f7878);
            } else {
                C8371 c83712 = Interpreter.mainSecurityGuard;
                String str = this.field.f7878;
                c83712.m13858();
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
            Object[] objArr = AbstractC2666.f8000;
            try {
                variableImpl = nameSpace.getVariableImpl(name, false);
            } catch (Exception unused) {
            }
            this.var = variableImpl;
        } else if (isStatic()) {
            boolean zM5387 = AbstractC2666.m5387(this.field.f7883);
            AbstractC2624 abstractC2624 = this.field;
            if (zM5387) {
                Class cls = abstractC2624.f7883;
                String name2 = getName();
                NameSpace nameSpaceM5400 = AbstractC2666.m5400(cls);
                if (nameSpaceM5400 != null) {
                    try {
                        variableImpl = nameSpaceM5400.getVariableImpl(name2, false);
                    } catch (Exception unused2) {
                    }
                }
                this.var = variableImpl;
            } else {
                this.var = new Variable(abstractC2624.f7878, (Class<?>) abstractC2624.mo5251(), this);
            }
        } else if (AbstractC2666.m5387(this.object.getClass())) {
            Object obj = this.object;
            String name3 = getName();
            NameSpace nameSpaceM5399 = AbstractC2666.m5399(obj);
            if (nameSpaceM5399 != null) {
                try {
                    variableImpl = nameSpaceM5399.getVariableImpl(name3, false);
                } catch (Exception unused3) {
                }
            }
            this.var = variableImpl;
        } else {
            AbstractC2624 abstractC26242 = this.field;
            if (abstractC26242 != null) {
                this.var = new Variable(abstractC26242.f7878, (Class<?>) abstractC26242.mo5251(), this);
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
        AbstractC2624 abstractC2624 = this.field;
        if (abstractC2624 != null) {
            return abstractC2624.mo5268();
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
            str = "field = " + this.field.f7879;
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

    public LHS(AbstractC2624 abstractC2624) {
        this.type = 1;
        this.object = abstractC2624.f7883;
        this.field = abstractC2624;
        this.varName = abstractC2624.f7878;
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
        C2632.m5298("constructed empty LHS");
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
