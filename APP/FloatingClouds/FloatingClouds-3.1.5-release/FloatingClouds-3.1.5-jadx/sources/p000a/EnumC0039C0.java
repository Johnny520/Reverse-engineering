package p000a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: a.C0 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0039C0 {

    /* JADX INFO: renamed from: a */
    public static final EnumC0039C0 f140a;

    /* JADX INFO: renamed from: b */
    public static final EnumC0039C0 f141b;

    /* JADX INFO: renamed from: c */
    public static final EnumC0039C0 f142c;

    /* JADX INFO: renamed from: d */
    public static final EnumC0039C0 f143d;

    /* JADX INFO: renamed from: e */
    public static final EnumC0039C0 f144e;

    /* JADX INFO: renamed from: f */
    public static final EnumC0039C0 f145f;

    /* JADX INFO: renamed from: g */
    public static final EnumC0039C0 f146g;

    /* JADX INFO: renamed from: h */
    public static final EnumC0039C0 f147h;

    /* JADX INFO: renamed from: i */
    public static final EnumC0039C0 f148i;

    /* JADX INFO: renamed from: j */
    public static final EnumC0039C0 f149j;

    /* JADX INFO: renamed from: k */
    public static final EnumC0039C0 f150k;

    /* JADX INFO: renamed from: l */
    public static final EnumC0039C0 f151l;

    /* JADX INFO: renamed from: m */
    public static final EnumC0039C0 f152m;

    /* JADX INFO: renamed from: n */
    public static final EnumC0039C0 f153n;

    /* JADX INFO: renamed from: o */
    public static final EnumC0039C0 f154o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ EnumC0039C0[] f155p;

    /* JADX INFO: renamed from: a.C0$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static EnumC0039C0 m121a(byte b) {
            if (b == 1) {
                return EnumC0039C0.f140a;
            }
            if (b == 2) {
                return EnumC0039C0.f141b;
            }
            if (b == 3) {
                return EnumC0039C0.f142c;
            }
            if (b == 4) {
                return EnumC0039C0.f143d;
            }
            if (b == 5) {
                return EnumC0039C0.f144e;
            }
            if (b == 6) {
                return EnumC0039C0.f145f;
            }
            if (b == 7) {
                return EnumC0039C0.f146g;
            }
            if (b == 8) {
                return EnumC0039C0.f147h;
            }
            if (b == 9) {
                return EnumC0039C0.f148i;
            }
            if (b == 10) {
                return EnumC0039C0.f149j;
            }
            if (b == 11) {
                return EnumC0039C0.f150k;
            }
            if (b == 12) {
                return EnumC0039C0.f151l;
            }
            if (b == 13) {
                return EnumC0039C0.f152m;
            }
            if (b == 14) {
                return EnumC0039C0.f153n;
            }
            if (b == 15) {
                return EnumC0039C0.f154o;
            }
            throw new IllegalArgumentException(C0944z.m2231k("Unknown AnnotationEncodeValueType: ", String.valueOf(b & 255)));
        }
    }

    static {
        EnumC0039C0 enumC0039C0 = new EnumC0039C0("ByteValue", 0);
        f140a = enumC0039C0;
        EnumC0039C0 enumC0039C02 = new EnumC0039C0("ShortValue", 1);
        f141b = enumC0039C02;
        EnumC0039C0 enumC0039C03 = new EnumC0039C0("CharValue", 2);
        f142c = enumC0039C03;
        EnumC0039C0 enumC0039C04 = new EnumC0039C0("IntValue", 3);
        f143d = enumC0039C04;
        EnumC0039C0 enumC0039C05 = new EnumC0039C0("LongValue", 4);
        f144e = enumC0039C05;
        EnumC0039C0 enumC0039C06 = new EnumC0039C0("FloatValue", 5);
        f145f = enumC0039C06;
        EnumC0039C0 enumC0039C07 = new EnumC0039C0("DoubleValue", 6);
        f146g = enumC0039C07;
        EnumC0039C0 enumC0039C08 = new EnumC0039C0("StringValue", 7);
        f147h = enumC0039C08;
        EnumC0039C0 enumC0039C09 = new EnumC0039C0("TypeValue", 8);
        f148i = enumC0039C09;
        EnumC0039C0 enumC0039C010 = new EnumC0039C0("MethodValue", 9);
        f149j = enumC0039C010;
        EnumC0039C0 enumC0039C011 = new EnumC0039C0("EnumValue", 10);
        f150k = enumC0039C011;
        EnumC0039C0 enumC0039C012 = new EnumC0039C0("ArrayValue", 11);
        f151l = enumC0039C012;
        EnumC0039C0 enumC0039C013 = new EnumC0039C0("AnnotationValue", 12);
        f152m = enumC0039C013;
        EnumC0039C0 enumC0039C014 = new EnumC0039C0("NullValue", 13);
        f153n = enumC0039C014;
        EnumC0039C0 enumC0039C015 = new EnumC0039C0("BoolValue", 14);
        f154o = enumC0039C015;
        f155p = new EnumC0039C0[]{enumC0039C0, enumC0039C02, enumC0039C03, enumC0039C04, enumC0039C05, enumC0039C06, enumC0039C07, enumC0039C08, enumC0039C09, enumC0039C010, enumC0039C011, enumC0039C012, enumC0039C013, enumC0039C014, enumC0039C015};
    }

    public EnumC0039C0() {
        throw null;
    }

    public static EnumC0039C0 valueOf(String str) {
        return (EnumC0039C0) Enum.valueOf(EnumC0039C0.class, str);
    }

    public static EnumC0039C0[] values() {
        return (EnumC0039C0[]) f155p.clone();
    }
}
