package p000;

/* JADX INFO: renamed from: yt */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC2773yt implements InterfaceC0415Jl {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f9424a;

    EnumC2773yt(int i) {
        this.f9424a = i;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC2773yt m5344a(int i) {
        if (i == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i == 1) {
            return TINK;
        }
        if (i == 2) {
            return LEGACY;
        }
        if (i == 3) {
            return RAW;
        }
        if (i != 4) {
            return null;
        }
        return CRUNCHY;
    }

    /* JADX INFO: renamed from: b */
    public final int m5345b() {
        if (this != UNRECOGNIZED) {
            return this.f9424a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
