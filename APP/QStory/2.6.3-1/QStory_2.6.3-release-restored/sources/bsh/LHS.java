package bsh;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import p297.C9201;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
class LHS implements InterfaceC3448, Serializable {
    static final int FIELD = 1;
    static final int INDEX = 3;
    static final int LOOSETYPE_FIELD = 5;
    static final int MAP_ENTRY = 6;
    static final int METHOD_EVAL = 4;
    static final int PROPERTY = 2;
    static final int VARIABLE = 0;
    private static final long serialVersionUID = 1;
    AbstractC3458 field;
    int index;
    boolean localVar;
    NameSpace nameSpace;
    Object object;
    Object propName;
    int type;
    Variable var;
    String varName;

    public LHS(Object obj, AbstractC3458 abstractC3458) {
        if (obj == null) {
            C3466.m5903("constructed empty LHS");
            throw null;
        }
        this.type = 1;
        this.object = obj;
        this.field = abstractC3458;
        if (abstractC3458 != null) {
            this.varName = abstractC3458.f8225;
        }
    }

    private Object getValueImpl() throws UtilEvalError {
        int i = this.type;
        if (i == 0) {
            return this.nameSpace.getVariableOrProperty(this.varName, null);
        }
        if (i == 1) {
            try {
                AbstractC3458 abstractC3458 = this.field;
                Objects.requireNonNull(abstractC3458, "get value, field cannot be null");
                return abstractC3458.mo5877(this.object, new Object[0]);
            } catch (ReflectiveOperationException e) {
                throw new UtilEvalError("Can't read field: " + this.field, e);
            }
        }
        if (i == 2) {
            try {
                return AbstractC3500.m6012(this.object, this.propName);
            } catch (ReflectError e2) {
                Interpreter.debug(e2.getMessage());
                throw new UtilEvalError("No such property: " + this.propName, e2);
            }
        }
        if (i != 3) {
            if (i == 5) {
                return this.nameSpace.getVariable(this.varName);
            }
            C3466.m5902("LHS type");
            return null;
        }
        try {
            return AbstractC3462.m5880(this.index, this.object);
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
        C3489 c3489 = (C3489) C3493.f8305.m14429(cls);
        String str = this.varName;
        ConcurrentHashMap concurrentHashMap = c3489.f8293;
        this.field = !concurrentHashMap.containsKey(str) ? null : (AbstractC3458) concurrentHashMap.get(str);
    }

    private synchronized void writeObject(ObjectOutputStream objectOutputStream) {
        try {
            AbstractC3458 abstractC3458 = this.field;
            if (abstractC3458 != null) {
                this.object = abstractC3458.f8230;
                this.varName = abstractC3458.f8225;
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
                AbstractC3458 abstractC3458 = this.field;
                Object[] objArr = AbstractC3500.f8347;
                if (Modifier.isStatic(abstractC3458.getModifiers())) {
                    C9201 c9201 = Interpreter.mainSecurityGuard;
                    AbstractC3458 abstractC34582 = this.field;
                    c9201.m14436(abstractC34582.f8230, abstractC34582.f8225, obj);
                } else {
                    Interpreter.mainSecurityGuard.m14430(this.object, this.field.f8225, obj);
                }
                AbstractC3458 abstractC34583 = this.field;
                Objects.requireNonNull(abstractC34583, "assign value, field cannot be null");
                abstractC34583.mo5877(this.object, obj);
                return getValueImpl();
            } catch (ReflectiveOperationException e) {
                throw new UtilEvalError("LHS (" + this.field.f8225 + ") can't access field: " + e, e);
            }
        }
        if (i == 2) {
            try {
                Object obj2 = this.propName;
                boolean z3 = obj2 instanceof String;
                Object obj3 = this.object;
                if (!z3) {
                    return AbstractC3500.m5996(obj3, obj2, obj);
                }
                String str2 = (String) obj2;
                Object[] objArr2 = AbstractC3500.f8347;
                Map map = AbstractC3495.f8317;
                return ((obj3 instanceof Map.Entry) && (str2.equals("val") || str2.equals("value"))) ? ((Map.Entry) obj3).setValue(obj) : AbstractC3500.m5996(obj3, str2, obj);
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
                C3466.m5902("unknown lhs type");
                return null;
            }
            Modifiers modifiers = new Modifiers(3);
            modifiers.addModifier("public");
            if (this.nameSpace.isInterface) {
                modifiers.setConstant();
            }
            this.nameSpace.setTypedVariable(this.varName, AbstractC3495.m5955(obj, false), obj, modifiers);
            return obj;
        }
        try {
            if (this.object.getClass().isArray() && obj != null) {
                try {
                    obj = AbstractC3495.m5933(obj, AbstractC3495.m5936(this.object.getClass()), 1);
                } catch (Exception unused) {
                }
            }
            AbstractC3462.m5886(this.object, this.index, obj);
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
        AbstractC3458 abstractC3458 = this.field;
        if (abstractC3458 != null) {
            return abstractC3458.f8225;
        }
        Variable variable = this.var;
        return variable != null ? variable.getName() : this.varName;
    }

    public Class<?> getType() {
        AbstractC3458 abstractC3458 = this.field;
        if (abstractC3458 != null) {
            return abstractC3458.mo5856();
        }
        if (getVariable() != null) {
            return this.var.getType();
        }
        try {
            return AbstractC3495.m5955(getValueImpl(), false);
        } catch (UtilEvalError unused) {
            return null;
        }
    }

    public Object getValue() {
        if (this.type == 1) {
            AbstractC3458 abstractC3458 = this.field;
            Object[] objArr = AbstractC3500.f8347;
            if (Modifier.isStatic(abstractC3458.getModifiers())) {
                C9201 c9201 = Interpreter.mainSecurityGuard;
                AbstractC3458 abstractC34582 = this.field;
                c9201.m14433(abstractC34582.f8230, abstractC34582.f8225);
            } else {
                C9201 c92012 = Interpreter.mainSecurityGuard;
                String str = this.field.f8225;
                c92012.m14434();
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
            Object[] objArr = AbstractC3500.f8347;
            try {
                variableImpl = nameSpace.getVariableImpl(name, false);
            } catch (Exception unused) {
            }
            this.var = variableImpl;
        } else if (isStatic()) {
            boolean zM5992 = AbstractC3500.m5992(this.field.f8230);
            AbstractC3458 abstractC3458 = this.field;
            if (zM5992) {
                Class cls = abstractC3458.f8230;
                String name2 = getName();
                NameSpace nameSpaceM6005 = AbstractC3500.m6005(cls);
                if (nameSpaceM6005 != null) {
                    try {
                        variableImpl = nameSpaceM6005.getVariableImpl(name2, false);
                    } catch (Exception unused2) {
                    }
                }
                this.var = variableImpl;
            } else {
                this.var = new Variable(abstractC3458.f8225, (Class<?>) abstractC3458.mo5856(), this);
            }
        } else if (AbstractC3500.m5992(this.object.getClass())) {
            Object obj = this.object;
            String name3 = getName();
            NameSpace nameSpaceM6004 = AbstractC3500.m6004(obj);
            if (nameSpaceM6004 != null) {
                try {
                    variableImpl = nameSpaceM6004.getVariableImpl(name3, false);
                } catch (Exception unused3) {
                }
            }
            this.var = variableImpl;
        } else {
            AbstractC3458 abstractC34582 = this.field;
            if (abstractC34582 != null) {
                this.var = new Variable(abstractC34582.f8225, (Class<?>) abstractC34582.mo5856(), this);
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
        AbstractC3458 abstractC3458 = this.field;
        if (abstractC3458 != null) {
            return abstractC3458.mo5873();
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
            str = "field = " + this.field.f8226;
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

    public LHS(AbstractC3458 abstractC3458) {
        this.type = 1;
        this.object = abstractC3458.f8230;
        this.field = abstractC3458;
        this.varName = abstractC3458.f8225;
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
        C3466.m5903("constructed empty LHS");
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
