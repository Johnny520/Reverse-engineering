package androidx.recyclerview.widget;

/* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۠۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7789 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final androidx.recyclerview.widget.C7789.InterfaceC7790 f30056;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۠۟$ۥ, reason: contains not printable characters */
    public interface InterfaceC7790 {
        /* JADX INFO: renamed from: ۥ */
        void mo29995(androidx.recyclerview.widget.C7726.C7728 r1);

        /* JADX INFO: renamed from: ۥ۟ */
        androidx.recyclerview.widget.C7726.C7728 mo29996(int r1, int r2, int r3, java.lang.Object r4);
    }

    public C7789(androidx.recyclerview.widget.C7789.InterfaceC7790 r1) {
            r0 = this;
            r0.<init>()
            r0.f30056 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final int m30233(java.util.List<androidx.recyclerview.widget.C7726.C7728> r6) {
            r5 = this;
            int r0 = r6.size()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
        L7:
            if (r0 < 0) goto L1c
            java.lang.Object r3 = r6.get(r0)
            androidx.recyclerview.widget.ۥ$ۥ۟ r3 = (androidx.recyclerview.widget.C7726.C7728) r3
            int r3 = r3.f29758
            r4 = 8
            if (r3 != r4) goto L18
            if (r2 == 0) goto L19
            return r0
        L18:
            r2 = r1
        L19:
            int r0 = r0 + (-1)
            goto L7
        L1c:
            r6 = -1
            return r6
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void m30234(java.util.List<androidx.recyclerview.widget.C7726.C7728> r3) {
            r2 = this;
        L0:
            int r0 = r2.m30233(r3)
            r1 = -1
            if (r0 == r1) goto Ld
            int r1 = r0 + 1
            r2.m30236(r3, r0, r1)
            goto L0
        Ld:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m30235(java.util.List<androidx.recyclerview.widget.C7726.C7728> r5, int r6, androidx.recyclerview.widget.C7726.C7728 r7, int r8, androidx.recyclerview.widget.C7726.C7728 r9) {
            r4 = this;
            int r0 = r7.f29761
            int r1 = r9.f29759
            if (r0 >= r1) goto L8
            r2 = -1
            goto L9
        L8:
            r2 = 0
        L9:
            int r3 = r7.f29759
            if (r3 >= r1) goto Lf
            int r2 = r2 + 1
        Lf:
            if (r1 > r3) goto L16
            int r1 = r9.f29761
            int r3 = r3 + r1
            r7.f29759 = r3
        L16:
            int r1 = r9.f29759
            if (r1 > r0) goto L1f
            int r3 = r9.f29761
            int r0 = r0 + r3
            r7.f29761 = r0
        L1f:
            int r1 = r1 + r2
            r9.f29759 = r1
            r5.set(r6, r9)
            r5.set(r8, r7)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m30236(java.util.List<androidx.recyclerview.widget.C7726.C7728> r8, int r9, int r10) {
            r7 = this;
            java.lang.Object r0 = r8.get(r9)
            r4 = r0
            androidx.recyclerview.widget.ۥ$ۥ۟ r4 = (androidx.recyclerview.widget.C7726.C7728) r4
            java.lang.Object r0 = r8.get(r10)
            r6 = r0
            androidx.recyclerview.widget.ۥ$ۥ۟ r6 = (androidx.recyclerview.widget.C7726.C7728) r6
            int r0 = r6.f29758
            r1 = 1
            if (r0 == r1) goto L2a
            r1 = 2
            if (r0 == r1) goto L22
            r1 = 4
            if (r0 == r1) goto L1a
            goto L31
        L1a:
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            r1.m30238(r2, r3, r4, r5, r6)
            goto L31
        L22:
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            r1.m30237(r2, r3, r4, r5, r6)
            goto L31
        L2a:
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            r1.m30235(r2, r3, r4, r5, r6)
        L31:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m30237(java.util.List<androidx.recyclerview.widget.C7726.C7728> r10, int r11, androidx.recyclerview.widget.C7726.C7728 r12, int r13, androidx.recyclerview.widget.C7726.C7728 r14) {
            r9 = this;
            int r0 = r12.f29759
            int r1 = r12.f29761
            r2 = 1
            r3 = 0
            if (r0 >= r1) goto L17
            int r4 = r14.f29759
            if (r4 != r0) goto L15
            int r4 = r14.f29761
            int r0 = r1 - r0
            if (r4 != r0) goto L15
            r0 = r3
            r3 = r2
            goto L26
        L15:
            r0 = r3
            goto L26
        L17:
            int r4 = r14.f29759
            int r5 = r1 + 1
            if (r4 != r5) goto L25
            int r4 = r14.f29761
            int r0 = r0 - r1
            if (r4 != r0) goto L25
            r0 = r2
            r3 = r0
            goto L26
        L25:
            r0 = r2
        L26:
            int r4 = r14.f29759
            r5 = 2
            if (r1 >= r4) goto L2f
            int r4 = r4 - r2
            r14.f29759 = r4
            goto L48
        L2f:
            int r6 = r14.f29761
            int r4 = r4 + r6
            if (r1 >= r4) goto L48
            int r6 = r6 - r2
            r14.f29761 = r6
            r12.f29758 = r5
            r12.f29761 = r2
            int r11 = r14.f29761
            if (r11 != 0) goto L47
            r10.remove(r13)
            androidx.recyclerview.widget.ۥ۟۟۠۟$ۥ r10 = r9.f30056
            r10.mo29995(r14)
        L47:
            return
        L48:
            int r1 = r12.f29759
            int r4 = r14.f29759
            r6 = 0
            if (r1 > r4) goto L53
            int r4 = r4 + r2
            r14.f29759 = r4
            goto L69
        L53:
            int r7 = r14.f29761
            int r8 = r4 + r7
            if (r1 >= r8) goto L69
            int r4 = r4 + r7
            int r4 = r4 - r1
            androidx.recyclerview.widget.ۥ۟۟۠۟$ۥ r7 = r9.f30056
            int r1 = r1 + r2
            androidx.recyclerview.widget.ۥ$ۥ۟ r6 = r7.mo29996(r5, r1, r4, r6)
            int r1 = r12.f29759
            int r2 = r14.f29759
            int r1 = r1 - r2
            r14.f29761 = r1
        L69:
            if (r3 == 0) goto L77
            r10.set(r11, r14)
            r10.remove(r13)
            androidx.recyclerview.widget.ۥ۟۟۠۟$ۥ r10 = r9.f30056
            r10.mo29995(r12)
            return
        L77:
            if (r0 == 0) goto La8
            if (r6 == 0) goto L91
            int r0 = r12.f29759
            int r1 = r6.f29759
            if (r0 <= r1) goto L86
            int r1 = r6.f29761
            int r0 = r0 - r1
            r12.f29759 = r0
        L86:
            int r0 = r12.f29761
            int r1 = r6.f29759
            if (r0 <= r1) goto L91
            int r1 = r6.f29761
            int r0 = r0 - r1
            r12.f29761 = r0
        L91:
            int r0 = r12.f29759
            int r1 = r14.f29759
            if (r0 <= r1) goto L9c
            int r1 = r14.f29761
            int r0 = r0 - r1
            r12.f29759 = r0
        L9c:
            int r0 = r12.f29761
            int r1 = r14.f29759
            if (r0 <= r1) goto Ld6
            int r1 = r14.f29761
            int r0 = r0 - r1
            r12.f29761 = r0
            goto Ld6
        La8:
            if (r6 == 0) goto Lc0
            int r0 = r12.f29759
            int r1 = r6.f29759
            if (r0 < r1) goto Lb5
            int r1 = r6.f29761
            int r0 = r0 - r1
            r12.f29759 = r0
        Lb5:
            int r0 = r12.f29761
            int r1 = r6.f29759
            if (r0 < r1) goto Lc0
            int r1 = r6.f29761
            int r0 = r0 - r1
            r12.f29761 = r0
        Lc0:
            int r0 = r12.f29759
            int r1 = r14.f29759
            if (r0 < r1) goto Lcb
            int r1 = r14.f29761
            int r0 = r0 - r1
            r12.f29759 = r0
        Lcb:
            int r0 = r12.f29761
            int r1 = r14.f29759
            if (r0 < r1) goto Ld6
            int r1 = r14.f29761
            int r0 = r0 - r1
            r12.f29761 = r0
        Ld6:
            r10.set(r11, r14)
            int r14 = r12.f29759
            int r0 = r12.f29761
            if (r14 == r0) goto Le3
            r10.set(r13, r12)
            goto Le6
        Le3:
            r10.remove(r13)
        Le6:
            if (r6 == 0) goto Leb
            r10.add(r11, r6)
        Leb:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m30238(java.util.List<androidx.recyclerview.widget.C7726.C7728> r9, int r10, androidx.recyclerview.widget.C7726.C7728 r11, int r12, androidx.recyclerview.widget.C7726.C7728 r13) {
            r8 = this;
            int r0 = r11.f29761
            int r1 = r13.f29759
            r2 = 4
            r3 = 1
            r4 = 0
            if (r0 >= r1) goto Ld
            int r1 = r1 - r3
            r13.f29759 = r1
            goto L20
        Ld:
            int r5 = r13.f29761
            int r1 = r1 + r5
            if (r0 >= r1) goto L20
            int r5 = r5 - r3
            r13.f29761 = r5
            androidx.recyclerview.widget.ۥ۟۟۠۟$ۥ r0 = r8.f30056
            int r1 = r11.f29759
            java.lang.Object r5 = r13.f29760
            androidx.recyclerview.widget.ۥ$ۥ۟ r0 = r0.mo29996(r2, r1, r3, r5)
            goto L21
        L20:
            r0 = r4
        L21:
            int r1 = r11.f29759
            int r5 = r13.f29759
            if (r1 > r5) goto L2b
            int r5 = r5 + r3
            r13.f29759 = r5
            goto L41
        L2b:
            int r6 = r13.f29761
            int r7 = r5 + r6
            if (r1 >= r7) goto L41
            int r5 = r5 + r6
            int r5 = r5 - r1
            androidx.recyclerview.widget.ۥ۟۟۠۟$ۥ r4 = r8.f30056
            int r1 = r1 + r3
            java.lang.Object r3 = r13.f29760
            androidx.recyclerview.widget.ۥ$ۥ۟ r4 = r4.mo29996(r2, r1, r5, r3)
            int r1 = r13.f29761
            int r1 = r1 - r5
            r13.f29761 = r1
        L41:
            r9.set(r12, r11)
            int r11 = r13.f29761
            if (r11 <= 0) goto L4c
            r9.set(r10, r13)
            goto L54
        L4c:
            r9.remove(r10)
            androidx.recyclerview.widget.ۥ۟۟۠۟$ۥ r11 = r8.f30056
            r11.mo29995(r13)
        L54:
            if (r0 == 0) goto L59
            r9.add(r10, r0)
        L59:
            if (r4 == 0) goto L5e
            r9.add(r10, r4)
        L5e:
            return
    }
}
