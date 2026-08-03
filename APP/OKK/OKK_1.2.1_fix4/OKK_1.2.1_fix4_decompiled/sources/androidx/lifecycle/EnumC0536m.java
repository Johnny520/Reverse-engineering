package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: androidx.lifecycle.m */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0536m {

    /* JADX INFO: renamed from: a */
    public static final EnumC0536m f1482a;

    /* JADX INFO: renamed from: b */
    public static final EnumC0536m f1483b;

    /* JADX INFO: renamed from: c */
    public static final EnumC0536m f1484c;

    /* JADX INFO: renamed from: d */
    public static final EnumC0536m f1485d;

    /* JADX INFO: renamed from: e */
    public static final EnumC0536m f1486e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ EnumC0536m[] f1487f;

    static {
        EnumC0536m enumC0536m = new EnumC0536m("DESTROYED", 0);
        f1482a = enumC0536m;
        EnumC0536m enumC0536m2 = new EnumC0536m("INITIALIZED", 1);
        f1483b = enumC0536m2;
        EnumC0536m enumC0536m3 = new EnumC0536m("CREATED", 2);
        f1484c = enumC0536m3;
        EnumC0536m enumC0536m4 = new EnumC0536m("STARTED", 3);
        f1485d = enumC0536m4;
        EnumC0536m enumC0536m5 = new EnumC0536m("RESUMED", 4);
        f1486e = enumC0536m5;
        f1487f = new EnumC0536m[]{enumC0536m, enumC0536m2, enumC0536m3, enumC0536m4, enumC0536m5};
    }

    public static EnumC0536m valueOf(String str) {
        return (EnumC0536m) Enum.valueOf(EnumC0536m.class, str);
    }

    public static EnumC0536m[] values() {
        return (EnumC0536m[]) f1487f.clone();
    }
}
