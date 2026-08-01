package p000;

/* JADX INFO: renamed from: oo */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0630oo {

    /* JADX INFO: renamed from: α */
    public boolean f8163;

    /* JADX INFO: renamed from: β */
    public boolean f8164;

    /* JADX INFO: renamed from: γ */
    public java.lang.Object f8165;

    /* JADX INFO: renamed from: δ */
    public java.io.Serializable f8166;

    public C0630oo() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f8163 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public p000.C0694po m4256() {
            r4 = this;
            po r0 = new po
            boolean r1 = r4.f8163
            boolean r2 = r4.f8164
            java.lang.Object r3 = r4.f8165
            java.lang.String[] r3 = (java.lang.String[]) r3
            java.io.Serializable r4 = r4.f8166
            java.lang.String[] r4 = (java.lang.String[]) r4
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    /* JADX INFO: renamed from: β */
    public void m4257(p000.C0870uf... r6) {
            r5 = this;
            boolean r0 = r5.f8163
            if (r0 == 0) goto L45
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r6.length
            r0.<init>(r1)
            int r1 = r6.length
            r2 = 0
            r3 = r2
        Ld:
            if (r3 >= r1) goto L19
            r4 = r6[r3]
            java.lang.String r4 = r4.f10737
            r0.add(r4)
            int r3 = r3 + 1
            goto Ld
        L19:
            java.lang.String[] r6 = new java.lang.String[r2]
            java.lang.Object[] r6 = r0.toArray(r6)
            java.lang.String[] r6 = (java.lang.String[]) r6
            int r0 = r6.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r0)
            java.lang.String[] r6 = (java.lang.String[]) r6
            boolean r0 = r5.f8163
            if (r0 == 0) goto L3f
            int r0 = r6.length
            if (r0 == 0) goto L39
            int r0 = r6.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r0)
            java.lang.String[] r6 = (java.lang.String[]) r6
            r5.f8165 = r6
            goto L44
        L39:
            java.lang.String r5 = "At least one cipher suite is required"
            p000.C1080.m7275(r5)
            goto L44
        L3f:
            java.lang.String r5 = "no cipher suites for cleartext connections"
            p000.C1080.m7275(r5)
        L44:
            return
        L45:
            java.lang.String r5 = "no cipher suites for cleartext connections"
            p000.C1080.m7275(r5)
            return
    }

    /* JADX INFO: renamed from: γ */
    public void m4258(p000.q42... r6) {
            r5 = this;
            boolean r0 = r5.f8163
            if (r0 == 0) goto L45
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r6.length
            r0.<init>(r1)
            int r1 = r6.length
            r2 = 0
            r3 = r2
        Ld:
            if (r3 >= r1) goto L19
            r4 = r6[r3]
            java.lang.String r4 = r4.f8867
            r0.add(r4)
            int r3 = r3 + 1
            goto Ld
        L19:
            java.lang.String[] r6 = new java.lang.String[r2]
            java.lang.Object[] r6 = r0.toArray(r6)
            java.lang.String[] r6 = (java.lang.String[]) r6
            int r0 = r6.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r0)
            java.lang.String[] r6 = (java.lang.String[]) r6
            boolean r0 = r5.f8163
            if (r0 == 0) goto L3f
            int r0 = r6.length
            if (r0 == 0) goto L39
            int r0 = r6.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r0)
            java.lang.String[] r6 = (java.lang.String[]) r6
            r5.f8166 = r6
            goto L44
        L39:
            java.lang.String r5 = "At least one TLS version is required"
            p000.C1080.m7275(r5)
            goto L44
        L3f:
            java.lang.String r5 = "no TLS versions for cleartext connections"
            p000.C1080.m7275(r5)
        L44:
            return
        L45:
            java.lang.String r5 = "no TLS versions for cleartext connections"
            p000.C1080.m7275(r5)
            return
    }
}
