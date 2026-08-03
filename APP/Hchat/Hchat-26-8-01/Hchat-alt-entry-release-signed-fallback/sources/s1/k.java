package s1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f12262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0.q0 f12263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f12266e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12267f;

    public k(java.util.List r10, h0.q0 r11) {
            r9 = this;
            r9.<init>()
            r9.f12262a = r10
            r9.f12263b = r11
            int r11 = android.os.Build.VERSION.SDK_INT
            r0 = 0
            r1 = 29
            if (r11 < r1) goto L19
            android.view.MotionEvent r2 = r9.a()
            if (r2 == 0) goto L19
            int r2 = j2.b.d(r2)
            goto L1a
        L19:
            r2 = r0
        L1a:
            r9.f12264c = r2
            android.view.MotionEvent r2 = r9.a()
            if (r2 == 0) goto L27
            int r2 = r2.getButtonState()
            goto L28
        L27:
            r2 = r0
        L28:
            r9.f12265d = r2
            android.view.MotionEvent r2 = r9.a()
            if (r2 == 0) goto L35
            int r2 = r2.getMetaState()
            goto L36
        L35:
            r2 = r0
        L36:
            r9.f12266e = r2
            android.view.MotionEvent r2 = r9.a()
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto La2
            if (r11 < r1) goto L4b
            int r10 = j2.b.d(r2)
            if (r10 != r3) goto L4b
            r10 = r5
            goto L4c
        L4b:
            r10 = r0
        L4c:
            r6 = 5
            if (r11 < r1) goto L57
            int r11 = j2.b.d(r2)
            if (r11 != r6) goto L57
            r11 = r5
            goto L58
        L57:
            r11 = r0
        L58:
            int r1 = r2.getActionMasked()
            r2 = 10
            if (r1 == 0) goto L9b
            r7 = 12
            if (r1 == r5) goto L93
            r8 = 8
            if (r1 == r4) goto L89
            switch(r1) {
                case 5: goto L80;
                case 6: goto L76;
                case 7: goto L89;
                case 8: goto L73;
                case 9: goto L70;
                case 10: goto L6d;
                default: goto L6b;
            }
        L6b:
            goto Lbf
        L6d:
            r0 = r6
            goto Lbf
        L70:
            r0 = 4
            goto Lbf
        L73:
            r0 = 6
            goto Lbf
        L76:
            if (r10 == 0) goto L7a
        L78:
            r0 = r7
            goto Lbf
        L7a:
            if (r11 == 0) goto L7e
        L7c:
            r0 = r8
            goto Lbf
        L7e:
            r0 = r4
            goto Lbf
        L80:
            if (r10 == 0) goto L84
        L82:
            r0 = r2
            goto Lbf
        L84:
            if (r11 == 0) goto L87
            goto L7c
        L87:
            r0 = r5
            goto Lbf
        L89:
            if (r10 == 0) goto L8e
            r0 = 11
            goto Lbf
        L8e:
            if (r11 == 0) goto L91
            goto L7c
        L91:
            r0 = r3
            goto Lbf
        L93:
            if (r10 == 0) goto L96
            goto L78
        L96:
            if (r11 == 0) goto L7e
            r0 = 9
            goto Lbf
        L9b:
            if (r10 == 0) goto L9e
            goto L82
        L9e:
            if (r11 == 0) goto L87
            r0 = 7
            goto Lbf
        La2:
            int r11 = r10.size()
        La6:
            if (r0 >= r11) goto L91
            java.lang.Object r1 = r10.get(r0)
            s1.t r1 = (s1.t) r1
            boolean r2 = s1.s.d(r1)
            if (r2 == 0) goto Lb5
            goto L7e
        Lb5:
            boolean r1 = s1.s.b(r1)
            if (r1 == 0) goto Lbc
            goto L87
        Lbc:
            int r0 = r0 + 1
            goto La6
        Lbf:
            r9.f12267f = r0
            return
    }

    public final android.view.MotionEvent a() {
            r1 = this;
            h0.q0 r0 = r1.f12263b
            if (r0 == 0) goto Ld
            java.lang.Object r0 = r0.f4972d
            p4.t r0 = (p4.t) r0
            java.lang.Object r0 = r0.f10225i
            android.view.MotionEvent r0 = (android.view.MotionEvent) r0
            return r0
        Ld:
            r0 = 0
            return r0
    }
}
