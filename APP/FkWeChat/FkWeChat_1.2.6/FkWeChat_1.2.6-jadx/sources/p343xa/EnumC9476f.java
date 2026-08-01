package p343xa;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p186m9.EnumC5132m;
import p213oa.C5692c;

/* JADX INFO: renamed from: xa.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC9476f {
    BOOLEAN(EnumC5132m.f15466w, "boolean", "Z", "java.lang.Boolean"),
    CHAR(EnumC5132m.f15467x, "char", "C", "java.lang.Character"),
    BYTE(EnumC5132m.f15468y, "byte", "B", "java.lang.Byte"),
    SHORT(EnumC5132m.f15469z, "short", "S", "java.lang.Short"),
    INT(EnumC5132m.f15458A, "int", "I", "java.lang.Integer"),
    FLOAT(EnumC5132m.f15459B, "float", "F", "java.lang.Float"),
    LONG(EnumC5132m.f15460C, "long", "J", "java.lang.Long"),
    DOUBLE(EnumC5132m.f15461D, "double", "D", "java.lang.Double");


    /* JADX INFO: renamed from: C */
    public static final Map f32190C = new HashMap();

    /* JADX INFO: renamed from: D */
    public static final Map f32191D = new EnumMap(EnumC5132m.class);

    /* JADX INFO: renamed from: E */
    public static final Map f32192E = new HashMap();

    /* JADX INFO: renamed from: F */
    public static final Set f32193F = new HashSet();

    /* JADX INFO: renamed from: G */
    public static final Map f32194G = new HashMap();

    /* JADX INFO: renamed from: q */
    public final EnumC5132m f32202q;

    /* JADX INFO: renamed from: r */
    public final String f32203r;

    /* JADX INFO: renamed from: s */
    public final String f32204s;

    /* JADX INFO: renamed from: t */
    public final C5692c f32205t;

    static {
        for (EnumC9476f enumC9476f : values()) {
            f32190C.put(enumC9476f.m36915i(), enumC9476f);
            f32191D.put(enumC9476f.m36916j(), enumC9476f);
            f32192E.put(enumC9476f.m36914h(), enumC9476f);
            String strReplace = enumC9476f.f32205t.m22994a().replace('.', '/');
            f32193F.add(strReplace);
            f32194G.put(strReplace, "(" + enumC9476f.f32204s + ")L" + strReplace + ";");
        }
    }

    EnumC9476f(EnumC5132m enumC5132m, String str, String str2, String str3) {
        if (enumC5132m == null) {
            m36911a(8);
        }
        if (str == null) {
            m36911a(9);
        }
        if (str2 == null) {
            m36911a(10);
        }
        if (str3 == null) {
            m36911a(11);
        }
        this.f32202q = enumC5132m;
        this.f32203r = str;
        this.f32204s = str2;
        this.f32205t = new C5692c(str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m36911a(int r8) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p343xa.EnumC9476f.m36911a(int):void");
    }

    /* JADX INFO: renamed from: c */
    public static EnumC9476f m36912c(String str) {
        if (str == null) {
            m36911a(3);
        }
        EnumC9476f enumC9476f = (EnumC9476f) f32190C.get(str);
        if (enumC9476f != null) {
            return enumC9476f;
        }
        C9475e.m36910a("Non-primitive type name passed: ", str);
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static EnumC9476f m36913g(EnumC5132m enumC5132m) {
        if (enumC5132m == null) {
            m36911a(5);
        }
        EnumC9476f enumC9476f = (EnumC9476f) f32191D.get(enumC5132m);
        if (enumC9476f == null) {
            m36911a(6);
        }
        return enumC9476f;
    }

    /* JADX INFO: renamed from: h */
    public String m36914h() {
        String str = this.f32204s;
        if (str == null) {
            m36911a(14);
        }
        return str;
    }

    /* JADX INFO: renamed from: i */
    public String m36915i() {
        String str = this.f32203r;
        if (str == null) {
            m36911a(13);
        }
        return str;
    }

    /* JADX INFO: renamed from: j */
    public EnumC5132m m36916j() {
        EnumC5132m enumC5132m = this.f32202q;
        if (enumC5132m == null) {
            m36911a(12);
        }
        return enumC5132m;
    }

    /* JADX INFO: renamed from: k */
    public C5692c m36917k() {
        C5692c c5692c = this.f32205t;
        if (c5692c == null) {
            m36911a(15);
        }
        return c5692c;
    }
}
