package p143ja;

import qa.AbstractC6354k;

/* JADX INFO: renamed from: ja.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC3778k implements AbstractC6354k.a {
    DECLARATION(0, 0),
    FAKE_OVERRIDE(1, 1),
    DELEGATION(2, 2),
    SYNTHESIZED(3, 3);


    /* JADX INFO: renamed from: v */
    public static AbstractC6354k.b f10665v = new AbstractC6354k.b() { // from class: ja.k.a
        @Override // qa.AbstractC6354k.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public EnumC3778k mo14093a(int i10) {
            return EnumC3778k.m14526a(i10);
        }
    };

    /* JADX INFO: renamed from: q */
    public final int f10667q;

    EnumC3778k(int i10, int i11) {
        this.f10667q = i11;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC3778k m14526a(int i10) {
        if (i10 == 0) {
            return DECLARATION;
        }
        if (i10 == 1) {
            return FAKE_OVERRIDE;
        }
        if (i10 == 2) {
            return DELEGATION;
        }
        if (i10 != 3) {
            return null;
        }
        return SYNTHESIZED;
    }

    @Override // qa.AbstractC6354k.a
    /* JADX INFO: renamed from: b */
    public final int mo14092b() {
        return this.f10667q;
    }
}
