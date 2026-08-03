package n1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements n1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.view.View f8918a;

    public c(android.view.View r1) {
            r0 = this;
            r0.<init>()
            r0.f8918a = r1
            return
    }

    public final void a(int r10) {
            r9 = this;
            r0 = -1
            r1 = 0
            r2 = 1
            r3 = 17
            r4 = 13
            r5 = 6
            r6 = 16
            if (r10 != r6) goto Le
            r7 = r6
            goto L45
        Le:
            if (r10 != r5) goto L12
            r7 = r5
            goto L45
        L12:
            if (r10 != r4) goto L16
            r7 = r4
            goto L45
        L16:
            r7 = 23
            if (r10 != r7) goto L1b
            goto L45
        L1b:
            r7 = 3
            if (r10 != r7) goto L1f
            goto L45
        L1f:
            if (r10 != 0) goto L23
            r7 = r1
            goto L45
        L23:
            if (r10 != r3) goto L27
            r7 = r3
            goto L45
        L27:
            r7 = 27
            if (r10 != r7) goto L2c
            goto L45
        L2c:
            r7 = 26
            if (r10 != r7) goto L31
            goto L45
        L31:
            r7 = 9
            if (r10 != r7) goto L36
            goto L45
        L36:
            r7 = 22
            if (r10 != r7) goto L3b
            goto L45
        L3b:
            r7 = 21
            if (r10 != r7) goto L40
            goto L45
        L40:
            if (r10 != r2) goto L44
            r7 = r2
            goto L45
        L44:
            r7 = r0
        L45:
            int r10 = g3.q.f4227a
            if (r7 != r0) goto L4b
            r1 = r0
            goto L6e
        L4b:
            int r10 = android.os.Build.VERSION.SDK_INT
            r8 = 34
            if (r10 >= r8) goto L5a
            switch(r7) {
                case 21: goto L59;
                case 22: goto L57;
                case 23: goto L59;
                case 24: goto L57;
                case 25: goto L55;
                case 26: goto L59;
                case 27: goto L57;
                default: goto L54;
            }
        L54:
            goto L5a
        L55:
            r7 = r1
            goto L5a
        L57:
            r7 = 4
            goto L5a
        L59:
            r7 = r5
        L5a:
            r8 = 30
            if (r10 >= r8) goto L6d
            r10 = 12
            if (r7 == r10) goto L6b
            if (r7 == r4) goto L69
            if (r7 == r6) goto L6b
            if (r7 == r3) goto L6e
            goto L6d
        L69:
            r1 = r5
            goto L6e
        L6b:
            r1 = r2
            goto L6e
        L6d:
            r1 = r7
        L6e:
            if (r1 != r0) goto L71
            return
        L71:
            android.view.View r10 = r9.f8918a
            r10.performHapticFeedback(r1)
            return
    }
}
