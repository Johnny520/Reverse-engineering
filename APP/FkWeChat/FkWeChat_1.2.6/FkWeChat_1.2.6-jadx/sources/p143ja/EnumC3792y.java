package p143ja;

import qa.AbstractC6354k;

/* JADX INFO: renamed from: ja.y */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC3792y implements AbstractC6354k.a {
    INTERNAL(0, 0),
    PRIVATE(1, 1),
    PROTECTED(2, 2),
    PUBLIC(3, 3),
    PRIVATE_TO_THIS(4, 4),
    LOCAL(5, 5);


    /* JADX INFO: renamed from: x */
    public static AbstractC6354k.b f10963x = new AbstractC6354k.b() { // from class: ja.y.a
        @Override // qa.AbstractC6354k.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public EnumC3792y mo14093a(int i10) {
            return EnumC3792y.m15120a(i10);
        }
    };

    /* JADX INFO: renamed from: q */
    public final int f10965q;

    EnumC3792y(int i10, int i11) {
        this.f10965q = i11;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC3792y m15120a(int i10) {
        if (i10 == 0) {
            return INTERNAL;
        }
        if (i10 == 1) {
            return PRIVATE;
        }
        if (i10 == 2) {
            return PROTECTED;
        }
        if (i10 == 3) {
            return PUBLIC;
        }
        if (i10 == 4) {
            return PRIVATE_TO_THIS;
        }
        if (i10 != 5) {
            return null;
        }
        return LOCAL;
    }

    @Override // qa.AbstractC6354k.a
    /* JADX INFO: renamed from: b */
    public final int mo14092b() {
        return this.f10965q;
    }
}
