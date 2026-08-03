package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f19583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wb.u0 f19584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f19585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f19586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fg.l f19587e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f19588f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f19589g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f19590h;

    public /* synthetic */ v0(java.lang.String r12, wb.u0 r13, boolean r14, java.lang.String r15, fg.l r16, boolean r17, int r18) {
            r11 = this;
            r0 = r18 & 32
            r1 = 0
            if (r0 == 0) goto L7
            r8 = r1
            goto L9
        L7:
            r8 = r17
        L9:
            r0 = r18 & 64
            if (r0 == 0) goto Le
            r1 = 1
        Le:
            r9 = r1
            java.lang.String r10 = "发送"
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public v0(java.lang.String r1, wb.u0 r2, boolean r3, java.lang.String r4, fg.l r5, boolean r6, boolean r7, java.lang.String r8) {
            r0 = this;
            r4.getClass()
            r5.getClass()
            r0.<init>()
            r0.f19583a = r1
            r0.f19584b = r2
            r0.f19585c = r3
            r0.f19586d = r4
            r0.f19587e = r5
            r0.f19588f = r6
            r0.f19589g = r7
            r0.f19590h = r8
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L53
        L3:
            boolean r0 = r3 instanceof wb.v0
            if (r0 != 0) goto L8
            goto L51
        L8:
            wb.v0 r3 = (wb.v0) r3
            java.lang.String r0 = r2.f19583a
            java.lang.String r1 = r3.f19583a
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L15
            goto L51
        L15:
            wb.u0 r0 = r2.f19584b
            wb.u0 r1 = r3.f19584b
            if (r0 == r1) goto L1c
            goto L51
        L1c:
            boolean r0 = r2.f19585c
            boolean r1 = r3.f19585c
            if (r0 == r1) goto L23
            goto L51
        L23:
            java.lang.String r0 = r2.f19586d
            java.lang.String r1 = r3.f19586d
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L2e
            goto L51
        L2e:
            fg.l r0 = r2.f19587e
            fg.l r1 = r3.f19587e
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L39
            goto L51
        L39:
            boolean r0 = r2.f19588f
            boolean r1 = r3.f19588f
            if (r0 == r1) goto L40
            goto L51
        L40:
            boolean r0 = r2.f19589g
            boolean r1 = r3.f19589g
            if (r0 == r1) goto L47
            goto L51
        L47:
            java.lang.String r0 = r2.f19590h
            java.lang.String r3 = r3.f19590h
            boolean r3 = gg.l.a(r0, r3)
            if (r3 != 0) goto L53
        L51:
            r3 = 0
            return r3
        L53:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f19583a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            wb.u0 r2 = r3.f19584b
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            boolean r0 = r3.f19585c
            int r0 = eh.a.h(r2, r1, r0)
            java.lang.String r2 = r3.f19586d
            int r0 = eh.a.g(r0, r1, r2)
            fg.l r2 = r3.f19587e
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            boolean r0 = r3.f19588f
            int r0 = eh.a.h(r2, r1, r0)
            boolean r2 = r3.f19589g
            int r0 = eh.a.h(r0, r1, r2)
            java.lang.String r1 = r3.f19590h
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ContactPickerRequest(title="
            r0.<init>(r1)
            java.lang.String r1 = r2.f19583a
            r0.append(r1)
            java.lang.String r1 = ", mode="
            r0.append(r1)
            wb.u0 r1 = r2.f19584b
            r0.append(r1)
            java.lang.String r1 = ", multiSelect="
            r0.append(r1)
            boolean r1 = r2.f19585c
            r0.append(r1)
            java.lang.String r1 = ", existingValue="
            r0.append(r1)
            java.lang.String r1 = r2.f19586d
            r0.append(r1)
            java.lang.String r1 = ", onValue="
            r0.append(r1)
            fg.l r1 = r2.f19587e
            r0.append(r1)
            java.lang.String r1 = ", enableLabels="
            r0.append(r1)
            boolean r1 = r2.f19588f
            r0.append(r1)
            java.lang.String r1 = ", enableGroupLabels="
            r0.append(r1)
            boolean r1 = r2.f19589g
            r0.append(r1)
            java.lang.String r1 = ", singleConfirmText="
            r0.append(r1)
            java.lang.String r1 = r2.f19590h
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
