package p000;

/* JADX INFO: renamed from: hq */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0368hq {

    /* JADX INFO: renamed from: α */
    public final java.util.LinkedHashMap f4786;

    public AbstractC0368hq() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.f4786 = r0
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p000.AbstractC0368hq
            if (r0 == 0) goto L12
            hq r2 = (p000.AbstractC0368hq) r2
            java.util.LinkedHashMap r2 = r2.f4786
            java.util.LinkedHashMap r1 = r1.f4786
            boolean r1 = p000.ln0.m3626(r1, r2)
            if (r1 == 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    public final int hashCode() {
            r0 = this;
            java.util.LinkedHashMap r0 = r0.f4786
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CreationExtras(extras="
            r0.<init>(r1)
            java.util.LinkedHashMap r2 = r2.f4786
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
