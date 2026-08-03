package p0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends f.s {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m1.f0 f10047j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public java.lang.Object f10048k;

    public a(m1.f0 r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            r0 = 1
            r1.<init>(r3, r0, r4)
            r1.f10047j = r2
            r1.f10048k = r4
            return
    }

    @Override // f.s, java.util.Map.Entry
    public final java.lang.Object getValue() {
            r1 = this;
            java.lang.Object r0 = r1.f10048k
            return r0
    }

    @Override // f.s, java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object r7) {
            r6 = this;
            java.lang.Object r0 = r6.f10048k
            r6.f10048k = r7
            m1.f0 r1 = r6.f10047j
            java.lang.Object r1 = r1.f8573h
            p0.d r1 = (p0.d) r1
            s0.g r2 = r1.f10055j
            java.lang.Object r3 = r6.f2897h
            boolean r4 = r2.containsKey(r3)
            if (r4 != 0) goto L15
            return r0
        L15:
            boolean r4 = r1.f10054i
            if (r4 == 0) goto L3e
            if (r4 == 0) goto L39
            p0.k[] r4 = r1.f10052g
            int r5 = r1.f10053h
            r4 = r4[r5]
            java.lang.Object[] r5 = r4.f10070g
            int r4 = r4.f10072i
            r4 = r5[r4]
            r2.put(r3, r7)
            r7 = 0
            if (r4 == 0) goto L32
            int r3 = r4.hashCode()
            goto L33
        L32:
            r3 = r7
        L33:
            p0.j r5 = r2.f12190h
            r1.d(r3, r5, r4, r7)
            goto L41
        L39:
            bsh.j.e()
            r7 = 0
            return r7
        L3e:
            r2.put(r3, r7)
        L41:
            int r7 = r2.f12192j
            r1.f10058m = r7
            return r0
    }
}
