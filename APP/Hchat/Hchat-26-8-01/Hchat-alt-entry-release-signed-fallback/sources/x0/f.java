package x0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends java.lang.RuntimeException {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x0.a f20828g;

    public f(x0.a r13) {
            r12 = this;
            r12.<init>()
            r12.f20828g = r13
            boolean r0 = r13.f20822b
            if (r0 != 0) goto L8c
            r0 = 9
            int[] r1 = new int[r0]
            r1 = {x008e: FILL_ARRAY_DATA , data: [201, 202, 204, 206, 207, 125, -127, 126665345, 200} // fill-array
            java.util.List r13 = r13.f20821a
            int r2 = r13.size()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4 = 0
            r5 = r4
        L1d:
            r6 = 1
            if (r5 >= r2) goto L5d
            int r7 = r5 + 1
            java.lang.Object r8 = r13.get(r5)
            x0.b r8 = (x0.b) r8
            int r9 = r8.f20823a
            r10 = r4
        L2b:
            if (r10 >= r0) goto L35
            r11 = r1[r10]
            if (r9 != r11) goto L32
            goto L36
        L32:
            int r10 = r10 + 1
            goto L2b
        L35:
            r10 = -1
        L36:
            if (r10 < 0) goto L3a
            r9 = r6
            goto L3b
        L3a:
            r9 = r4
        L3b:
            if (r9 != 0) goto L5b
            int r9 = r8.f20823a
            r10 = 100
            if (r9 != r10) goto L58
            int r5 = r5 + 2
            if (r5 >= r2) goto L54
            java.lang.Object r5 = r13.get(r5)
            x0.b r5 = (x0.b) r5
            int r5 = r5.f20823a
            r8 = 1000(0x3e8, float:1.401E-42)
            if (r5 != r8) goto L54
            goto L5d
        L54:
            tf.r.j1(r3)
            goto L5b
        L58:
            r3.add(r8)
        L5b:
            r5 = r7
            goto L1d
        L5d:
            int r13 = r3.size()
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r13]
        L63:
            if (r4 >= r13) goto L89
            java.lang.Object r1 = r3.get(r4)
            x0.b r1 = (x0.b) r1
            java.lang.StackTraceElement r2 = new java.lang.StackTraceElement
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "m$"
            r5.<init>(r7)
            int r1 = r1.f20823a
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            java.lang.String r5 = "SourceFile"
            java.lang.String r7 = "$$compose"
            r2.<init>(r7, r1, r5, r6)
            r0[r4] = r2
            int r4 = r4 + 1
            goto L63
        L89:
            r12.setStackTrace(r0)
        L8c:
            return
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable fillInStackTrace() {
            r1 = this;
            r0 = 0
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r0]
            r1.setStackTrace(r0)
            return r1
    }

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
            r7 = this;
            x0.a r0 = r7.f20828g
            boolean r1 = r0.f20822b
            if (r1 == 0) goto L5c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Composition stack when thrown:\n"
            r1.<init>(r2)
            uf.c r2 = a.a.E()
            java.util.List r0 = r0.f20821a
            r0.getClass()
            og.g r3 = new og.g
            r3.<init>(r0)
            int r0 = r3.size()
            r4 = 0
            r5 = r4
        L21:
            if (r5 >= r0) goto L2f
            java.lang.Object r6 = r3.get(r5)
            x0.b r6 = (x0.b) r6
            r6.getClass()
            int r5 = r5 + 1
            goto L21
        L2f:
            uf.c r0 = a.a.t(r2)
            r0.getClass()
            og.g r2 = new og.g
            r2.<init>(r0)
            int r0 = r2.size()
        L3f:
            if (r4 >= r0) goto L57
            java.lang.Object r3 = r2.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r5 = "\tat "
            r1.append(r5)
            r1.append(r3)
            r3 = 10
            r1.append(r3)
            int r4 = r4 + 1
            goto L3f
        L57:
            java.lang.String r0 = r1.toString()
            return r0
        L5c:
            java.lang.String r0 = "Composition stack when thrown:"
            return r0
    }
}
