package p000;

/* JADX INFO: renamed from: qs */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0735qs extends java.lang.RuntimeException {

    /* JADX INFO: renamed from: ε */
    public final p000.C0365hn f9094;

    public C0735qs(p000.C0365hn r13) {
            r12 = this;
            r12.<init>()
            r12.f9094 = r13
            boolean r0 = r13.f4779
            if (r0 != 0) goto L98
            r0 = 9
            int[] r1 = new int[r0]
            r1 = {x009a: FILL_ARRAY_DATA , data: [201, 202, 204, 206, 207, 125, -127, 126665345, 200} // fill-array
            java.util.List r13 = r13.f4778
            int r2 = r13.size()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4 = 0
            r5 = r4
        L1d:
            r6 = 1
            if (r5 >= r2) goto L69
            int r7 = r5 + 1
            java.lang.Object r8 = r13.get(r5)
            jn r8 = (p000.C0437jn) r8
            int r9 = r8.f5526
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
            if (r9 != 0) goto L67
            int r9 = r8.f5526
            r10 = 100
            if (r9 != r10) goto L64
            int r5 = r5 + 2
            if (r5 >= r2) goto L54
            java.lang.Object r5 = r13.get(r5)
            jn r5 = (p000.C0437jn) r5
            int r5 = r5.f5526
            r8 = 1000(0x3e8, float:1.401E-42)
            if (r5 != r8) goto L54
            goto L69
        L54:
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L5b
            goto L67
        L5b:
            int r5 = r3.size()
            int r5 = r5 - r6
            r3.remove(r5)
            goto L67
        L64:
            r3.add(r8)
        L67:
            r5 = r7
            goto L1d
        L69:
            int r13 = r3.size()
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r13]
        L6f:
            if (r4 >= r13) goto L95
            java.lang.Object r1 = r3.get(r4)
            jn r1 = (p000.C0437jn) r1
            java.lang.StackTraceElement r2 = new java.lang.StackTraceElement
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "m$"
            r5.<init>(r7)
            int r1 = r1.f5526
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            java.lang.String r5 = "SourceFile"
            java.lang.String r7 = "$$compose"
            r2.<init>(r7, r1, r5, r6)
            r0[r4] = r2
            int r4 = r4 + 1
            goto L6f
        L95:
            r12.setStackTrace(r0)
        L98:
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
            r6 = this;
            hn r6 = r6.f9094
            boolean r0 = r6.f4779
            if (r0 == 0) goto L5c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Composition stack when thrown:\n"
            r0.<init>(r1)
            zt0 r1 = p000.AbstractC1021yh.m6893()
            java.util.List r6 = r6.f4778
            r6.getClass()
            gx0 r2 = new gx0
            r2.<init>(r6)
            int r6 = r2.mo2340()
            r3 = 0
            r4 = r3
        L21:
            if (r4 >= r6) goto L2f
            java.lang.Object r5 = r2.get(r4)
            jn r5 = (p000.C0437jn) r5
            r5.getClass()
            int r4 = r4 + 1
            goto L21
        L2f:
            zt0 r6 = p000.AbstractC1021yh.m6883(r1)
            r6.getClass()
            gx0 r1 = new gx0
            r1.<init>(r6)
            int r6 = r1.mo2340()
        L3f:
            if (r3 >= r6) goto L57
            java.lang.Object r2 = r1.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r4 = "\tat "
            r0.append(r4)
            r0.append(r2)
            r2 = 10
            r0.append(r2)
            int r3 = r3 + 1
            goto L3f
        L57:
            java.lang.String r6 = r0.toString()
            return r6
        L5c:
            java.lang.String r6 = "Composition stack when thrown:"
            return r6
    }
}
