package p000;

/* JADX INFO: renamed from: cn */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1271cn implements InterfaceC0415Jl {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f4332a;

    EnumC1271cn(int i) {
        this.f4332a = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m2409a() {
        if (this != UNRECOGNIZED) {
            return this.f4332a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
