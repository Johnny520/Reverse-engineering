package bsh;

import bsh.BshClassManager;
import java.io.Serializable;
import p068eh.AbstractC0921a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class Variable implements Serializable, BshClassManager.Listener, Cloneable {
    public static final int ASSIGNMENT = 1;
    public static final int DECLARATION = 0;
    LHS lhs;
    Modifiers modifiers;
    String name;
    Class<?> type;
    String typeDescriptor;
    Object value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Variable(String str, Class<?> cls, Object obj, Modifiers modifiers) {
        this.name = str;
        this.type = cls;
        setModifiers(modifiers);
        setValue(obj, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void setModifiers(Modifiers modifiers) {
        this.modifiers = modifiers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.BshClassManager.Listener
    public void classLoaderChanged() {
        if (Reflect.isGeneratedClass(this.type)) {
            try {
                this.type = Reflect.getThisNS(this.type).getClass(this.type.getName());
            } catch (UtilEvalError unused) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Variable m10912clone() {
        try {
            Variable variable = (Variable) super.clone();
            Modifiers modifiers = variable.modifiers;
            variable.modifiers = modifiers != null ? modifiers.m10911clone() : null;
            return variable;
        } catch (CloneNotSupportedException e6) {
            throw new IllegalArgumentException(e6.getMessage(), e6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Modifiers getModifiers() {
        if (this.modifiers == null) {
            setModifiers(new Modifiers(3));
        }
        return this.modifiers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Class<?> getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getTypeDescriptor() {
        if (this.typeDescriptor == null) {
            Class<?> cls = this.type;
            if (cls == null) {
                cls = Object.class;
            }
            this.typeDescriptor = BSHType.getTypeDescriptor(cls);
        }
        return this.typeDescriptor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object getValue() {
        LHS lhs = this.lhs;
        return lhs != null ? this.type == null ? lhs.getValue() : Primitive.wrap(lhs.getValue(), this.type) : this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean hasModifier(String str) {
        return getModifiers().hasModifier(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setConstant() {
        if (hasModifier("private") || hasModifier("protected")) {
            C0353j.m1304b(getName(), "Illegal modifier for interface field ", ". Only public static & final are permitted.");
        } else {
            getModifiers().setConstant();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setValue(Object obj, int i9) {
        if (hasModifier("final")) {
            if (this.value != null) {
                throw new UtilEvalError(AbstractC0921a.m2255r(new StringBuilder("Cannot re-assign final variable "), this.name, "."));
            }
            if (obj == null) {
                return;
            }
        }
        Class<?> cls = this.type;
        if (cls != null && cls != Object.class && obj != null) {
            obj = Types.castObject(obj, cls, i9 == 0 ? 0 : 1);
            this.value = obj;
        }
        this.value = obj;
        if (obj == null && i9 != 0) {
            this.value = Primitive.getDefaultValue(this.type);
        }
        LHS lhs = this.lhs;
        if (lhs != null) {
            this.value = lhs.assign(this.value, false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return "Variable: " + StringUtil.variableString(this) + ", value:" + this.value + ", lhs = " + this.lhs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void validateFinalIsSet(boolean z9) {
        if (hasModifier("final") && this.value == null && z9 == hasModifier("static")) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(z9 ? "Static f" : "F");
            sb2.append("inal variable ");
            throw new RuntimeException(AbstractC0921a.m2255r(sb2, this.name, " is not initialized."));
        }
    }

    public Variable(String str, Object obj, Modifiers modifiers) {
        this(str, (Class<?>) null, obj, modifiers);
    }

    public Variable(String str, String str2, Object obj, Modifiers modifiers) {
        this(str, (Class<?>) null, obj, modifiers);
        this.typeDescriptor = str2;
    }

    public Variable(String str, Class<?> cls, LHS lhs) {
        this.name = str;
        this.lhs = lhs;
        this.type = cls;
    }
}
