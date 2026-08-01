package p182m5;

import p254r5.C6508m;

/* JADX INFO: renamed from: m5.v */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5021v extends AbstractC4988e0 {
    public C5021v(C6508m c6508m) {
        super(c6508m);
    }

    @Override // p182m5.AbstractC4988e0, p182m5.AbstractC5029z, p182m5.AbstractC4982b0
    /* JADX INFO: renamed from: a */
    public void mo20090a(C5009p c5009p) {
        super.mo20090a(c5009p);
        c5009p.m20260u().m20314v(m20305t().getType());
    }

    @Override // p182m5.AbstractC4982b0
    /* JADX INFO: renamed from: c */
    public EnumC4984c0 mo20091c() {
        return EnumC4984c0.TYPE_FIELD_ID_ITEM;
    }

    @Override // p182m5.AbstractC4988e0
    /* JADX INFO: renamed from: r */
    public int mo20133r(C5009p c5009p) {
        return c5009p.m20260u().m20312t(m20305t().getType());
    }

    @Override // p182m5.AbstractC4988e0
    /* JADX INFO: renamed from: s */
    public String mo20134s() {
        return "type_idx";
    }

    /* JADX INFO: renamed from: t */
    public C6508m m20305t() {
        return (C6508m) m20132p();
    }
}
