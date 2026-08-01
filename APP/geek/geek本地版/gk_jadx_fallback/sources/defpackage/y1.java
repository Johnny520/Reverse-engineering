package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y1 {
    public final /* synthetic */ int a;
    public final java.lang.Object b;
    public final java.io.Serializable c;
    public final java.io.Serializable d;
    public final java.lang.Object e;
    public final java.lang.Object f;

    public y1(defpackage.ez r3) {
            r2 = this;
            r0 = 0
            r2.a = r0
            r2.<init>()
            sx r0 = new sx
            r1 = 30
            r0.<init>(r1)
            r2.b = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.c = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.d = r0
            r2.e = r3
            l0 r3 = new l0
            r0 = 22
            r3.<init>(r0, r2)
            r2.f = r3
            return
    }

    public y1(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.util.List r5) {
            r1 = this;
            r0 = 1
            r1.a = r0
            r1.<init>()
            r2.getClass()
            r1.b = r2
            r3.getClass()
            r1.c = r3
            r1.d = r4
            r5.getClass()
            r1.e = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r2)
            java.lang.String r2 = "-"
            r5.append(r2)
            r5.append(r3)
            r5.append(r2)
            r5.append(r4)
            java.lang.String r2 = r5.toString()
            r1.f = r2
            return
    }

    public boolean a(int r9) {
            r8 = this;
            java.io.Serializable r0 = r8.d
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        La:
            if (r3 >= r1) goto L3c
            java.lang.Object r4 = r0.get(r3)
            x1 r4 = (defpackage.x1) r4
            int r5 = r4.a
            r6 = 8
            r7 = 1
            if (r5 != r6) goto L24
            int r4 = r4.c
            int r5 = r3 + 1
            int r4 = r8.e(r4, r5)
            if (r4 != r9) goto L39
            goto L35
        L24:
            if (r5 != r7) goto L39
            int r5 = r4.b
            int r4 = r4.c
            int r4 = r4 + r5
        L2b:
            if (r5 >= r4) goto L39
            int r6 = r3 + 1
            int r6 = r8.e(r5, r6)
            if (r6 != r9) goto L36
        L35:
            return r7
        L36:
            int r5 = r5 + 1
            goto L2b
        L39:
            int r3 = r3 + 1
            goto La
        L3c:
            return r2
    }

    public void b() {
            r8 = this;
            java.lang.Object r0 = r8.e
            ez r0 = (defpackage.ez) r0
            java.io.Serializable r1 = r8.d
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r2 = r1.size()
            r3 = 0
        Ld:
            if (r3 >= r2) goto L1f
            java.lang.Object r4 = r8.e
            ez r4 = (defpackage.ez) r4
            java.lang.Object r5 = r1.get(r3)
            x1 r5 = (defpackage.x1) r5
            r4.a(r5)
            int r3 = r3 + 1
            goto Ld
        L1f:
            r8.i(r1)
            java.io.Serializable r1 = r8.c
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r2 = r1.size()
            r3 = 0
        L2b:
            if (r3 >= r2) goto L7c
            java.lang.Object r4 = r1.get(r3)
            x1 r4 = (defpackage.x1) r4
            int r5 = r4.a
            r6 = 1
            if (r5 == r6) goto L6f
            r7 = 2
            if (r5 == r7) goto L59
            r6 = 4
            if (r5 == r6) goto L4e
            r6 = 8
            if (r5 == r6) goto L43
            goto L79
        L43:
            r0.a(r4)
            int r5 = r4.b
            int r4 = r4.c
            r0.e(r5, r4)
            goto L79
        L4e:
            r0.a(r4)
            int r5 = r4.b
            int r4 = r4.c
            r0.c(r5, r4)
            goto L79
        L59:
            r0.a(r4)
            int r5 = r4.b
            int r4 = r4.c
            androidx.recyclerview.widget.RecyclerView r7 = r0.a
            r7.O(r5, r4, r6)
            r7.f0 = r6
            yz r5 = r7.c0
            int r6 = r5.c
            int r6 = r6 + r4
            r5.c = r6
            goto L79
        L6f:
            r0.a(r4)
            int r5 = r4.b
            int r4 = r4.c
            r0.d(r5, r4)
        L79:
            int r3 = r3 + 1
            goto L2b
        L7c:
            r8.i(r1)
            return
    }

    public void c(defpackage.x1 r13) {
            r12 = this;
            java.lang.Object r0 = r12.b
            sx r0 = (defpackage.sx) r0
            int r1 = r13.a
            r2 = 1
            if (r1 == r2) goto L7c
            r3 = 8
            if (r1 == r3) goto L7c
            int r3 = r13.b
            int r1 = r12.j(r3, r1)
            int r3 = r13.b
            int r4 = r13.a
            r5 = 2
            r6 = 4
            if (r4 == r5) goto L33
            if (r4 != r6) goto L1f
            r4 = r2
            goto L34
        L1f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "op should be remove or update."
            r1.<init>(r2)
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            r0.<init>(r13)
            throw r0
        L33:
            r4 = 0
        L34:
            r7 = r2
            r8 = r7
        L36:
            int r9 = r13.c
            if (r7 >= r9) goto L6a
            int r9 = r13.b
            int r10 = r4 * r7
            int r10 = r10 + r9
            int r9 = r13.a
            int r9 = r12.j(r10, r9)
            int r10 = r13.a
            if (r10 == r5) goto L51
            if (r10 == r6) goto L4c
            goto L56
        L4c:
            int r11 = r1 + 1
            if (r9 != r11) goto L56
            goto L53
        L51:
            if (r9 != r1) goto L56
        L53:
            int r8 = r8 + 1
            goto L67
        L56:
            x1 r1 = r12.g(r10, r1, r8)
            r12.d(r1, r3)
            r0.c(r1)
            int r1 = r13.a
            if (r1 != r6) goto L65
            int r3 = r3 + r8
        L65:
            r8 = r2
            r1 = r9
        L67:
            int r7 = r7 + 1
            goto L36
        L6a:
            r0.c(r13)
            if (r8 <= 0) goto L7b
            int r13 = r13.a
            x1 r13 = r12.g(r13, r1, r8)
            r12.d(r13, r3)
            r0.c(r13)
        L7b:
            return
        L7c:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "should not dispatch add or move for pre layout"
            r13.<init>(r0)
            throw r13
    }

    public void d(defpackage.x1 r4, int r5) {
            r3 = this;
            java.lang.Object r0 = r3.e
            ez r0 = (defpackage.ez) r0
            r0.a(r4)
            int r1 = r4.a
            r2 = 2
            if (r1 == r2) goto L1d
            r2 = 4
            if (r1 != r2) goto L15
            int r4 = r4.c
            r0.c(r5, r4)
            return
        L15:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "only remove and update ops can be dispatched in first pass"
            r4.<init>(r5)
            throw r4
        L1d:
            int r4 = r4.c
            androidx.recyclerview.widget.RecyclerView r0 = r0.a
            r1 = 1
            r0.O(r5, r4, r1)
            r0.f0 = r1
            yz r5 = r0.c0
            int r0 = r5.c
            int r0 = r0 + r4
            r5.c = r0
            return
    }

    public int e(int r7, int r8) {
            r6 = this;
            java.io.Serializable r0 = r6.d
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r0.size()
        L8:
            if (r8 >= r1) goto L41
            java.lang.Object r2 = r0.get(r8)
            x1 r2 = (defpackage.x1) r2
            int r3 = r2.a
            r4 = 8
            if (r3 != r4) goto L28
            int r3 = r2.b
            if (r3 != r7) goto L1d
            int r7 = r2.c
            goto L3e
        L1d:
            if (r3 >= r7) goto L21
            int r7 = r7 + (-1)
        L21:
            int r2 = r2.c
            if (r2 > r7) goto L3e
            int r7 = r7 + 1
            goto L3e
        L28:
            int r4 = r2.b
            if (r4 > r7) goto L3e
            r5 = 2
            if (r3 != r5) goto L38
            int r2 = r2.c
            int r4 = r4 + r2
            if (r7 >= r4) goto L36
            r7 = -1
            return r7
        L36:
            int r7 = r7 - r2
            goto L3e
        L38:
            r4 = 1
            if (r3 != r4) goto L3e
            int r2 = r2.c
            int r7 = r7 + r2
        L3e:
            int r8 = r8 + 1
            goto L8
        L41:
            return r7
    }

    public boolean f() {
            r1 = this;
            java.io.Serializable r0 = r1.c
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            if (r0 <= 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public defpackage.x1 g(int r2, int r3, int r4) {
            r1 = this;
            java.lang.Object r0 = r1.b
            sx r0 = (defpackage.sx) r0
            java.lang.Object r0 = r0.a()
            x1 r0 = (defpackage.x1) r0
            if (r0 != 0) goto L18
            x1 r0 = new x1
            r0.<init>()
            r0.a = r2
            r0.b = r3
            r0.c = r4
            return r0
        L18:
            r0.a = r2
            r0.b = r3
            r0.c = r4
            return r0
    }

    public void h(defpackage.x1 r5) {
            r4 = this;
            java.lang.Object r0 = r4.e
            ez r0 = (defpackage.ez) r0
            java.io.Serializable r1 = r4.d
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.add(r5)
            int r1 = r5.a
            r2 = 1
            if (r1 == r2) goto L4b
            r3 = 2
            if (r1 == r3) goto L3e
            r2 = 4
            if (r1 == r2) goto L36
            r2 = 8
            if (r1 != r2) goto L22
            int r1 = r5.b
            int r5 = r5.c
            r0.e(r1, r5)
            return
        L22:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown update op type for "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L36:
            int r1 = r5.b
            int r5 = r5.c
            r0.c(r1, r5)
            return
        L3e:
            int r1 = r5.b
            int r5 = r5.c
            androidx.recyclerview.widget.RecyclerView r0 = r0.a
            r3 = 0
            r0.O(r1, r5, r3)
            r0.f0 = r2
            return
        L4b:
            int r1 = r5.b
            int r5 = r5.c
            r0.d(r1, r5)
            return
    }

    public void i(java.util.ArrayList r5) {
            r4 = this;
            int r0 = r5.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L1a
            java.lang.Object r2 = r5.get(r1)
            x1 r2 = (defpackage.x1) r2
            r2.getClass()
            java.lang.Object r3 = r4.b
            sx r3 = (defpackage.sx) r3
            r3.c(r2)
            int r1 = r1 + 1
            goto L5
        L1a:
            r5.clear()
            return
    }

    public int j(int r11, int r12) {
            r10 = this;
            java.lang.Object r0 = r10.b
            sx r0 = (defpackage.sx) r0
            java.io.Serializable r1 = r10.d
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r2 = r1.size()
            r3 = 1
            int r2 = r2 - r3
        Le:
            r4 = 8
            if (r2 < 0) goto L86
            java.lang.Object r5 = r1.get(r2)
            x1 r5 = (defpackage.x1) r5
            int r6 = r5.a
            r7 = 2
            if (r6 != r4) goto L66
            int r4 = r5.b
            int r6 = r5.c
            if (r4 >= r6) goto L26
            r8 = r4
            r9 = r6
            goto L28
        L26:
            r9 = r4
            r8 = r6
        L28:
            if (r11 < r8) goto L4e
            if (r11 > r9) goto L4e
            if (r8 != r4) goto L3e
            if (r12 != r3) goto L35
            int r6 = r6 + 1
            r5.c = r6
            goto L3b
        L35:
            if (r12 != r7) goto L3b
            int r6 = r6 + (-1)
            r5.c = r6
        L3b:
            int r11 = r11 + 1
            goto L83
        L3e:
            if (r12 != r3) goto L45
            int r4 = r4 + 1
            r5.b = r4
            goto L4b
        L45:
            if (r12 != r7) goto L4b
            int r4 = r4 + (-1)
            r5.b = r4
        L4b:
            int r11 = r11 + (-1)
            goto L83
        L4e:
            if (r11 >= r4) goto L83
            if (r12 != r3) goto L5b
            int r4 = r4 + 1
            r5.b = r4
            int r6 = r6 + 1
            r5.c = r6
            goto L83
        L5b:
            if (r12 != r7) goto L83
            int r4 = r4 + (-1)
            r5.b = r4
            int r6 = r6 + (-1)
            r5.c = r6
            goto L83
        L66:
            int r4 = r5.b
            if (r4 > r11) goto L76
            if (r6 != r3) goto L70
            int r4 = r5.c
            int r11 = r11 - r4
            goto L83
        L70:
            if (r6 != r7) goto L83
            int r4 = r5.c
            int r11 = r11 + r4
            goto L83
        L76:
            if (r12 != r3) goto L7d
            int r4 = r4 + 1
            r5.b = r4
            goto L83
        L7d:
            if (r12 != r7) goto L83
            int r4 = r4 + (-1)
            r5.b = r4
        L83:
            int r2 = r2 + (-1)
            goto Le
        L86:
            int r12 = r1.size()
            int r12 = r12 - r3
        L8b:
            if (r12 < 0) goto Lb3
            java.lang.Object r2 = r1.get(r12)
            x1 r2 = (defpackage.x1) r2
            int r3 = r2.a
            if (r3 != r4) goto La6
            int r3 = r2.c
            int r5 = r2.b
            if (r3 == r5) goto L9f
            if (r3 >= 0) goto Lb0
        L9f:
            r1.remove(r12)
            r0.c(r2)
            goto Lb0
        La6:
            int r3 = r2.c
            if (r3 > 0) goto Lb0
            r1.remove(r12)
            r0.c(r2)
        Lb0:
            int r12 = r12 + (-1)
            goto L8b
        Lb3:
            return r11
    }

    public java.lang.String toString() {
            r7 = this;
            int r0 = r7.a
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = super.toString()
            return r0
        La:
            java.lang.Object r0 = r7.e
            java.util.List r0 = (java.util.List) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "FontRequest {mProviderAuthority: "
            r2.<init>(r3)
            java.lang.Object r3 = r7.b
            java.lang.String r3 = (java.lang.String) r3
            r2.append(r3)
            java.lang.String r3 = ", mProviderPackage: "
            r2.append(r3)
            java.io.Serializable r3 = r7.c
            java.lang.String r3 = (java.lang.String) r3
            r2.append(r3)
            java.lang.String r3 = ", mQuery: "
            r2.append(r3)
            java.io.Serializable r3 = r7.d
            java.lang.String r3 = (java.lang.String) r3
            r2.append(r3)
            java.lang.String r3 = ", mCertificates:"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            r2 = 0
            r3 = r2
        L47:
            int r4 = r0.size()
            if (r3 >= r4) goto L81
            java.lang.String r4 = " ["
            r1.append(r4)
            java.lang.Object r4 = r0.get(r3)
            java.util.List r4 = (java.util.List) r4
            r5 = r2
        L59:
            int r6 = r4.size()
            if (r5 >= r6) goto L79
            java.lang.String r6 = " \""
            r1.append(r6)
            java.lang.Object r6 = r4.get(r5)
            byte[] r6 = (byte[]) r6
            java.lang.String r6 = android.util.Base64.encodeToString(r6, r2)
            r1.append(r6)
            java.lang.String r6 = "\""
            r1.append(r6)
            int r5 = r5 + 1
            goto L59
        L79:
            java.lang.String r4 = " ]"
            r1.append(r4)
            int r3 = r3 + 1
            goto L47
        L81:
            java.lang.String r0 = "}mCertificatesArray: 0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
