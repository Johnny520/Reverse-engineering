package bsh;

import bsh.org.objectweb.asm.Opcodes;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;
import okhttp3.HttpUrl;
import p068eh.AbstractC0921a;
import p136j8.C2104o;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class Modifiers implements Serializable, Cloneable {
    private static final int ACCESS_MODIFIERS = 7;
    public static final int CLASS = 0;
    public static final Map<String, Integer> CONST;
    public static final int CONSTRUCTOR = 5;
    public static final int FIELD = 3;
    public static final int INTERFACE = 1;
    public static final int METHOD = 2;
    public static final int PARAMETER = 4;
    private static final long serialVersionUID = 1;
    private int context;
    private int modifiers = 0;
    private String type;
    private int valid;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        HashMap map = new HashMap(17);
        CONST = map;
        map.put("public", 1);
        map.put("private", 2);
        map.put("protected", 4);
        map.put("static", 8);
        map.put("final", 16);
        map.put("synchronized", 32);
        map.put("volatile", 64);
        map.put("transient", 128);
        map.put("native", Integer.valueOf(Opcodes.ACC_NATIVE));
        map.put("interface", Integer.valueOf(Opcodes.ACC_INTERFACE));
        map.put("abstract", 1024);
        map.put("strict", Integer.valueOf(Opcodes.ACC_STRICT));
        map.put("synthetic", 4096);
        map.put("annotation", 8192);
        map.put("enum", 16384);
        map.put("mandated", 32768);
        map.put("default", 65536);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Modifiers(int i9) {
        appliedContext(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void appliedContext(int i9) {
        this.context = i9;
        if (i9 == 0) {
            this.valid = Modifier.classModifiers();
            this.type = "Class";
            return;
        }
        if (i9 == 1) {
            this.valid = Modifier.interfaceModifiers();
            this.type = "Interface";
            return;
        }
        if (i9 == 2) {
            this.valid = Modifier.methodModifiers() | CONST.get("default").intValue();
            this.type = "Method";
            return;
        }
        if (i9 == 3) {
            this.valid = Modifier.fieldModifiers() | CONST.get("enum").intValue();
            this.type = "Field";
        } else if (i9 == 4) {
            this.valid = Modifier.parameterModifiers();
            this.type = "Parameter";
        } else if (i9 != 5) {
            this.valid = 0;
            this.type = "Unknown";
        } else {
            this.valid = Modifier.constructorModifiers();
            this.type = "Constructor";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private String toModifier(int i9) {
        for (String str : CONST.keySet()) {
            if (i9 == CONST.get(str).intValue()) {
                return str;
            }
        }
        return String.valueOf(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void addModifier(int i9) {
        if ((this.valid & i9) == 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.type);
            sb2.append(" cannot be declared '");
            C2104o.m5276A(AbstractC0921a.m2255r(sb2, toModifier(i9), "'"));
            return;
        }
        if (i9 < 7) {
            int i10 = this.modifiers;
            if ((i10 & 7) > 0 && (i10 | i9) != i10) {
                C2104o.m5276A("public/private/protected cannot be used in combination.");
                return;
            }
        }
        this.modifiers = i9 | this.modifiers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void addModifiers(int i9) {
        for (int i10 = 1; i10 <= i9; i10 *= 2) {
            if ((i9 & i10) != 0) {
                addModifier(i10);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void changeContext(int i9) {
        int i10 = this.modifiers;
        this.modifiers = 0;
        appliedContext(i9);
        addModifiers(i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Modifiers m10911clone() {
        return (Modifiers) super.clone();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getModifiers() {
        return this.modifiers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean hasModifier(String str) {
        return hasModifier(toModifier(str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean isAppliedContext(int i9) {
        return this.context == i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setConstant() {
        this.modifiers = 25;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Modifiers: ");
        sb2.append(Modifier.toString(this.modifiers));
        int i9 = this.modifiers;
        Map<String, Integer> map = CONST;
        sb2.append((i9 & map.get("enum").intValue()) != 0 ? " enum" : (this.modifiers & map.get("default").intValue()) != 0 ? " default" : HttpUrl.FRAGMENT_ENCODE_SET);
        return sb2.toString();
    }

    public boolean hasModifier(int i9) {
        return (i9 & this.modifiers) != 0;
    }

    private int toModifier(String str) {
        Integer num = CONST.get(str);
        if (num != null) {
            return num.intValue();
        }
        C2104o.m5276A(AbstractC0921a.m2251n("Unknown modifier: '", str, "'"));
        return 0;
    }

    public void addModifier(String str) {
        addModifier(toModifier(str));
    }
}
