package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public enum o10 extends java.lang.Enum {

    /* JADX INFO: renamed from: ζ */
    public static final p000.o10 f7858 = null;

    /* JADX INFO: renamed from: η */
    public static final p000.o10 f7859 = null;

    /* JADX INFO: renamed from: θ */
    public static final p000.o10 f7860 = null;

    /* JADX INFO: renamed from: ι */
    public static final p000.o10 f7861 = null;

    /* JADX INFO: renamed from: κ */
    public static final p000.o10 f7862 = null;

    /* JADX INFO: renamed from: λ */
    public static final p000.o10 f7863 = null;

    /* JADX INFO: renamed from: μ */
    public static final /* synthetic */ p000.o10[] f7864 = null;

    /* JADX INFO: renamed from: ε */
    public final java.lang.String f7865;

    static {
            o10 r0 = new o10
            r1 = 0
            java.lang.String r2 = "点赞"
            java.lang.String r3 = "LIKE"
            r0.<init>(r1, r3, r2)
            p000.o10.f7858 = r0
            o10 r1 = new o10
            r2 = 1
            java.lang.String r3 = "评论"
            java.lang.String r4 = "COMMENT"
            r1.<init>(r2, r4, r3)
            p000.o10.f7859 = r1
            o10 r2 = new o10
            r3 = 2
            java.lang.String r4 = "收藏"
            java.lang.String r5 = "COLLECT"
            r2.<init>(r3, r5, r4)
            p000.o10.f7860 = r2
            o10 r3 = new o10
            r4 = 3
            java.lang.String r5 = "分享"
            java.lang.String r6 = "SHARE"
            r3.<init>(r4, r6, r5)
            p000.o10.f7861 = r3
            o10 r4 = new o10
            r5 = 4
            java.lang.String r6 = "作者主页"
            java.lang.String r7 = "AUTHOR"
            r4.<init>(r5, r7, r6)
            p000.o10.f7862 = r4
            o10 r5 = new o10
            r6 = 5
            java.lang.String r7 = "关注"
            java.lang.String r8 = "FOLLOW"
            r5.<init>(r6, r8, r7)
            p000.o10.f7863 = r5
            o10[] r0 = new p000.o10[]{r0, r1, r2, r3, r4, r5}
            p000.o10.f7864 = r0
            return
    }

    o10(int r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r2, r1)
            r0.f7865 = r3
            return
    }

    public static p000.o10 valueOf(java.lang.String r1) {
            java.lang.Class<o10> r0 = p000.o10.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            o10 r1 = (p000.o10) r1
            return r1
    }

    public static p000.o10[] values() {
            o10[] r0 = p000.o10.f7864
            java.lang.Object r0 = r0.clone()
            o10[] r0 = (p000.o10[]) r0
            return r0
    }
}
