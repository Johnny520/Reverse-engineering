package p000;

/* JADX INFO: renamed from: rk */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC2463rk implements InterfaceC0415Jl {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f8685a;

    EnumC2463rk(int i) {
        this.f8685a = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m4953a() {
        if (this != UNRECOGNIZED) {
            return this.f8685a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
