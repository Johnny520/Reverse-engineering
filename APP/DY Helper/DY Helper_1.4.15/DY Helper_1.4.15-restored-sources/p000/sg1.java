package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class sg1 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f9899;

    /* JADX INFO: renamed from: β */
    public final org.json.JSONArray f9900;

    /* JADX INFO: renamed from: γ */
    public final java.util.LinkedHashMap f9901;

    public sg1(java.lang.String r1, org.json.JSONArray r2, java.util.LinkedHashMap r3) {
            r0 = this;
            r0.<init>()
            r0.f9899 = r1
            r0.f9900 = r2
            r0.f9901 = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2c
        L3:
            boolean r0 = r3 instanceof p000.sg1
            if (r0 != 0) goto L8
            goto L2a
        L8:
            sg1 r3 = (p000.sg1) r3
            java.lang.String r0 = r2.f9899
            java.lang.String r1 = r3.f9899
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L2a
        L15:
            org.json.JSONArray r0 = r2.f9900
            org.json.JSONArray r1 = r3.f9900
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L2a
        L20:
            java.util.LinkedHashMap r2 = r2.f9901
            java.util.LinkedHashMap r3 = r3.f9901
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2c
        L2a:
            r2 = 0
            return r2
        L2c:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.f9899
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            org.json.JSONArray r1 = r2.f9900
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.LinkedHashMap r2 = r2.f9901
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TaskArraySelection(key="
            r0.<init>(r1)
            java.lang.String r1 = r2.f9899
            r0.append(r1)
            java.lang.String r1 = ", array="
            r0.append(r1)
            org.json.JSONArray r1 = r2.f9900
            r0.append(r1)
            java.lang.String r1 = ", candidateCounts="
            r0.append(r1)
            java.util.LinkedHashMap r2 = r2.f9901
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
