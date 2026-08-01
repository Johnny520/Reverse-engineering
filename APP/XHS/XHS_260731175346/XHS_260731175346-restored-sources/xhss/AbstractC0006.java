package xhss;

/* JADX INFO: renamed from: xhss.ᛱᛱᛶᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0006 implements xhss.InterfaceC0957, java.io.Serializable {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public transient xhss.InterfaceC0957 f142;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final java.lang.Object f143;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final java.lang.String f144;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final boolean f145;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final java.lang.Class f146;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final java.lang.String f147;

    public AbstractC0006(java.lang.Object r1, java.lang.Class r2, java.lang.String r3, java.lang.String r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.f143 = r1
            r0.f146 = r2
            r0.f144 = r3
            r0.f147 = r4
            r0.f145 = r5
            return
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public abstract xhss.InterfaceC0957 mo92();

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final xhss.InterfaceC0162 m93() {
            r1 = this;
            boolean r0 = r1.f145
            java.lang.Class r1 = r1.f146
            if (r0 == 0) goto L11
            xhss.ᛷᛸᲈᛳ r0 = xhss.AbstractC0256.f946
            r0.getClass()
            xhss.ᛳᲁ r0 = new xhss.ᛳᲁ
            r0.<init>(r1)
            return r0
        L11:
            xhss.ᛱᛸᛷᛸ r1 = xhss.AbstractC0256.m565(r1)
            return r1
    }
}
