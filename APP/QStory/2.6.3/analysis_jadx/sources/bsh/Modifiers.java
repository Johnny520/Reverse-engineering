package bsh;

import androidx.activity.AbstractC0053;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
        map.put("native", 256);
        map.put("interface", 512);
        map.put("abstract", 1024);
        map.put("strict", 2048);
        map.put("synthetic", 4096);
        map.put("annotation", 8192);
        map.put("enum", 16384);
        map.put("mandated", 32768);
        map.put("default", 65536);
    }

    public Modifiers(int i) {
        appliedContext(i);
    }

    private void appliedContext(int i) {
        this.context = i;
        if (i == 0) {
            this.valid = Modifier.classModifiers();
            this.type = "Class";
            return;
        }
        if (i == 1) {
            this.valid = Modifier.interfaceModifiers();
            this.type = "Interface";
            return;
        }
        if (i == 2) {
            this.valid = Modifier.methodModifiers() | CONST.get("default").intValue();
            this.type = "Method";
            return;
        }
        if (i == 3) {
            this.valid = Modifier.fieldModifiers() | CONST.get("enum").intValue();
            this.type = "Field";
        } else if (i == 4) {
            this.valid = Modifier.parameterModifiers();
            this.type = "Parameter";
        } else if (i != 5) {
            this.valid = 0;
            this.type = "Unknown";
        } else {
            this.valid = Modifier.constructorModifiers();
            this.type = "Constructor";
        }
    }

    private String toModifier(int i) {
        for (String str : CONST.keySet()) {
            if (i == CONST.get(str).intValue()) {
                return str;
            }
        }
        return String.valueOf(i);
    }

    public void addModifier(int i) {
        if ((this.valid & i) == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.type);
            sb.append(" cannot be declared '");
            C5925.m11311(AbstractC0053.m151(sb, toModifier(i), "'"));
            return;
        }
        if (i < 7) {
            int i2 = this.modifiers;
            if ((i2 & 7) > 0 && (i2 | i) != i2) {
                C5925.m11311("public/private/protected cannot be used in combination.");
                return;
            }
        }
        this.modifiers = i | this.modifiers;
    }

    public void addModifiers(int i) {
        for (int i2 = 1; i2 <= i; i2 *= 2) {
            if ((i & i2) != 0) {
                addModifier(i2);
            }
        }
    }

    public void changeContext(int i) {
        int i2 = this.modifiers;
        this.modifiers = 0;
        appliedContext(i);
        addModifiers(i2);
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Modifiers m5122clone() {
        return (Modifiers) super.clone();
    }

    public int getModifiers() {
        return this.modifiers;
    }

    public boolean hasModifier(String str) {
        return hasModifier(toModifier(str));
    }

    public boolean isAppliedContext(int i) {
        return this.context == i;
    }

    public void setConstant() {
        this.modifiers = 25;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Modifiers: ");
        sb.append(Modifier.toString(this.modifiers));
        int i = this.modifiers;
        Map<String, Integer> map = CONST;
        sb.append((i & map.get("enum").intValue()) != 0 ? " enum" : (this.modifiers & map.get("default").intValue()) != 0 ? " default" : "");
        return sb.toString();
    }

    public boolean hasModifier(int i) {
        return (this.modifiers & i) != 0;
    }

    private int toModifier(String str) {
        Integer num = CONST.get(str);
        if (num != null) {
            return num.intValue();
        }
        C5925.m11311(AbstractC0053.m158("Unknown modifier: '", str, "'"));
        return 0;
    }

    public void addModifier(String str) {
        addModifier(toModifier(str));
    }
}
