package p143ja;

import qa.AbstractC6354k;

/* JADX INFO: renamed from: ja.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC3779l implements AbstractC6354k.a {
    FINAL(0, 0),
    OPEN(1, 1),
    ABSTRACT(2, 2),
    SEALED(3, 3);


    /* JADX INFO: renamed from: v */
    public static AbstractC6354k.b f10672v = new AbstractC6354k.b() { // from class: ja.l.a
        @Override // qa.AbstractC6354k.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public EnumC3779l mo14093a(int i10) {
            return EnumC3779l.m14528a(i10);
        }
    };

    /* JADX INFO: renamed from: q */
    public final int f10674q;

    EnumC3779l(int i10, int i11) {
        this.f10674q = i11;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC3779l m14528a(int i10) {
        if (i10 == 0) {
            return FINAL;
        }
        if (i10 == 1) {
            return OPEN;
        }
        if (i10 == 2) {
            return ABSTRACT;
        }
        if (i10 != 3) {
            return null;
        }
        return SEALED;
    }

    @Override // qa.AbstractC6354k.a
    /* JADX INFO: renamed from: b */
    public final int mo14092b() {
        return this.f10674q;
    }
}
