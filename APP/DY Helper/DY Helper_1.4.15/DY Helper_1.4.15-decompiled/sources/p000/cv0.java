package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class cv0 {

    /* JADX INFO: renamed from: β */
    public static final p000.cv0 f2778 = null;

    /* JADX INFO: renamed from: α */
    public final p000.dv0 f2779;

    static {
            r0 = 0
            java.util.Locale[] r0 = new java.util.Locale[r0]
            android.os.LocaleList r1 = new android.os.LocaleList
            r1.<init>(r0)
            cv0 r0 = new cv0
            dv0 r2 = new dv0
            r2.<init>(r1)
            r0.<init>(r2)
            p000.cv0.f2778 = r0
            return
    }

    public cv0(p000.dv0 r1) {
            r0 = this;
            r0.<init>()
            r0.f2779 = r1
            return
    }

    /* JADX INFO: renamed from: α */
    public static p000.cv0 m1616(java.lang.String r5) {
            if (r5 == 0) goto L33
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L9
            goto L33
        L9:
            java.lang.String r0 = ","
            r1 = -1
            java.lang.String[] r5 = r5.split(r0, r1)
            int r0 = r5.length
            java.util.Locale[] r1 = new java.util.Locale[r0]
            r2 = 0
        L14:
            if (r2 >= r0) goto L23
            r3 = r5[r2]
            int r4 = p000.bv0.f1852
            java.util.Locale r3 = java.util.Locale.forLanguageTag(r3)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L14
        L23:
            android.os.LocaleList r5 = new android.os.LocaleList
            r5.<init>(r1)
            cv0 r0 = new cv0
            dv0 r1 = new dv0
            r1.<init>(r5)
            r0.<init>(r1)
            return r0
        L33:
            cv0 r5 = p000.cv0.f2778
            return r5
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p000.cv0
            if (r0 == 0) goto L12
            cv0 r2 = (p000.cv0) r2
            dv0 r2 = r2.f2779
            dv0 r1 = r1.f2779
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    public final int hashCode() {
            r0 = this;
            dv0 r0 = r0.f2779
            android.os.LocaleList r0 = r0.f3300
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r0 = this;
            dv0 r0 = r0.f2779
            android.os.LocaleList r0 = r0.f3300
            java.lang.String r0 = r0.toString()
            return r0
    }
}
