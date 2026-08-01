package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public enum bi0 extends java.lang.Enum {

    /* JADX INFO: renamed from: θ */
    public static final p000.bi0 f1721 = null;

    /* JADX INFO: renamed from: ι */
    public static final p000.bi0 f1722 = null;

    /* JADX INFO: renamed from: κ */
    public static final p000.bi0 f1723 = null;

    /* JADX INFO: renamed from: λ */
    public static final p000.bi0 f1724 = null;

    /* JADX INFO: renamed from: μ */
    public static final /* synthetic */ p000.bi0[] f1725 = null;

    /* JADX INFO: renamed from: ε */
    public final p000.EnumC0491kx f1726;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.String f1727;

    /* JADX INFO: renamed from: η */
    public final int f1728;

    static {
            bi0 r0 = new bi0
            java.lang.String r4 = "IConversationListModel 入口"
            r5 = 8000(0x1f40, float:1.121E-41)
            java.lang.String r1 = "MODEL_PROVIDER"
            r2 = 0
            kx r3 = p000.EnumC0491kx.f6188
            r0.<init>(r1, r2, r3, r4, r5)
            p000.bi0.f1721 = r0
            bi0 r1 = new bi0
            java.lang.String r5 = "全量会话读取方法"
            r6 = 9000(0x2328, float:1.2612E-41)
            java.lang.String r2 = "ALL_CONVERSATION"
            r3 = 1
            kx r4 = p000.EnumC0491kx.f6189
            r1.<init>(r2, r3, r4, r5, r6)
            p000.bi0.f1722 = r1
            bi0 r2 = new bi0
            java.lang.String r6 = "会话加载触发方法"
            r7 = 9000(0x2328, float:1.2612E-41)
            java.lang.String r3 = "LOAD_TRIGGER"
            r4 = 2
            kx r5 = p000.EnumC0491kx.f6190
            r2.<init>(r3, r4, r5, r6, r7)
            p000.bi0.f1723 = r2
            bi0 r3 = new bi0
            java.lang.String r7 = "当前 UID 提供方法"
            r8 = 8500(0x2134, float:1.1911E-41)
            java.lang.String r4 = "CURRENT_UID_PROVIDER"
            r5 = 3
            kx r6 = p000.EnumC0491kx.f6192
            r3.<init>(r4, r5, r6, r7, r8)
            p000.bi0.f1724 = r3
            bi0[] r0 = new p000.bi0[]{r0, r1, r2, r3}
            p000.bi0.f1725 = r0
            return
    }

    bi0(java.lang.String r1, int r2, p000.EnumC0491kx r3, java.lang.String r4, int r5) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.f1726 = r3
            r0.f1727 = r4
            r0.f1728 = r5
            return
    }

    public static p000.bi0 valueOf(java.lang.String r1) {
            java.lang.Class<bi0> r0 = p000.bi0.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            bi0 r1 = (p000.bi0) r1
            return r1
    }

    public static p000.bi0[] values() {
            bi0[] r0 = p000.bi0.f1725
            java.lang.Object r0 = r0.clone()
            bi0[] r0 = (p000.bi0[]) r0
            return r0
    }
}
