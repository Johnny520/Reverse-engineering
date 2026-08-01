package p003A2;

import p002A1.C0115D;
import p089R2.C1227b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: A2.a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0154a {

    /* JADX INFO: renamed from: e */
    public static final C0115D f551e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ EnumC0154a[] f552f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ C1227b f553g;

    /* JADX INFO: renamed from: d */
    public final int f554d;

    static {
        EnumC0154a[] enumC0154aArr = {new EnumC0154a(0, 1, "PUBLIC"), new EnumC0154a(1, 2, "PRIVATE"), new EnumC0154a(2, 4, "PROTECTED"), new EnumC0154a(3, 8, "STATIC"), new EnumC0154a(4, 16, "FINAL"), new EnumC0154a(5, 32, "SYNCHRONIZED"), new EnumC0154a(6, 64, "VOLATILE"), new EnumC0154a(7, 128, "TRANSIENT"), new EnumC0154a(8, 256, "NATIVE"), new EnumC0154a(9, 512, "INTERFACE"), new EnumC0154a(10, 1024, "ABSTRACT"), new EnumC0154a(11, 2048, "STRICT")};
        f552f = enumC0154aArr;
        f553g = new C1227b(enumC0154aArr);
        f551e = new C0115D(5);
    }

    public EnumC0154a(int i5, int i6, String str) {
        this.f554d = i6;
    }

    public static EnumC0154a valueOf(String str) {
        return (EnumC0154a) Enum.valueOf(EnumC0154a.class, str);
    }

    public static EnumC0154a[] values() {
        return (EnumC0154a[]) f552f.clone();
    }
}
