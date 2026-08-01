package p000;

/* JADX INFO: renamed from: h4 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0346h4 {

    /* JADX INFO: renamed from: α */
    public static final /* synthetic */ int f4568 = 0;

    static {
            g4 r0 = new g4
            java.lang.String r1 = ""
            r0.<init>(r1)
            return
    }

    /* JADX INFO: renamed from: α */
    public static final boolean m2359(int r4, int r5, int r6, int r7) {
            r0 = 0
            r1 = 1
            if (r4 != r5) goto L6
            r2 = r1
            goto L7
        L6:
            r2 = r0
        L7:
            if (r6 != r7) goto Lb
            r3 = r1
            goto Lc
        Lb:
            r3 = r0
        Lc:
            r2 = r2 | r3
            if (r4 != r6) goto L11
            r3 = r1
            goto L12
        L11:
            r3 = r0
        L12:
            r2 = r2 & r3
            if (r4 >= r7) goto L17
            r4 = r1
            goto L18
        L17:
            r4 = r0
        L18:
            if (r6 >= r5) goto L1b
            r0 = r1
        L1b:
            r4 = r4 & r0
            r4 = r4 | r2
            return r4
    }
}
