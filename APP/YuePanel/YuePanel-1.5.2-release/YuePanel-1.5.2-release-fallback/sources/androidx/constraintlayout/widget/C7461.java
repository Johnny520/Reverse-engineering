package androidx.constraintlayout.widget;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.ۥ۟۟۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7461 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f26106 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f26107 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f26108 = 3;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int f26109 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int f26110 = 5;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int f26111 = 6;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f26112 = 7;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int f26113 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final int f26114 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final int f26115 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int f26116 = -2;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final int f26117 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final int f26118 = 0;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public androidx.constraintlayout.widget.ConstraintLayout.C7450 f26119;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public android.view.View f26120;

    public C7461(android.view.View r3) {
            r2 = this;
            r2.<init>()
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            boolean r1 = r0 instanceof androidx.constraintlayout.widget.ConstraintLayout.C7450
            if (r1 == 0) goto L12
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r0 = (androidx.constraintlayout.widget.ConstraintLayout.C7450) r0
            r2.f26119 = r0
            r2.f26120 = r3
            return
        L12:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r0 = "Only children of ConstraintLayout.LayoutParams supported"
            r3.<init>(r0)
            throw r3
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public androidx.constraintlayout.widget.C7461 m28551(int r5, int r6) {
            r4 = this;
            r0 = 2
            r1 = 1
            if (r5 != 0) goto L6
            r2 = r1
            goto L7
        L6:
            r2 = r0
        L7:
            r3 = 0
            r4.m28563(r1, r5, r2, r3)
            if (r6 != 0) goto Lf
            r2 = r0
            goto L10
        Lf:
            r2 = r1
        L10:
            r4.m28563(r0, r6, r2, r3)
            if (r5 == 0) goto L2f
            android.view.View r2 = r4.f26120
            android.view.ViewParent r2 = r2.getParent()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            android.view.View r5 = r2.findViewById(r5)
            androidx.constraintlayout.widget.ۥ۟۟۟۟ r2 = new androidx.constraintlayout.widget.ۥ۟۟۟۟
            r2.<init>(r5)
            android.view.View r5 = r4.f26120
            int r5 = r5.getId()
            r2.m28563(r0, r5, r1, r3)
        L2f:
            if (r6 == 0) goto L4b
            android.view.View r5 = r4.f26120
            android.view.ViewParent r5 = r5.getParent()
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            android.view.View r5 = r5.findViewById(r6)
            androidx.constraintlayout.widget.ۥ۟۟۟۟ r6 = new androidx.constraintlayout.widget.ۥ۟۟۟۟
            r6.<init>(r5)
            android.view.View r5 = r4.f26120
            int r5 = r5.getId()
            r6.m28563(r1, r5, r0, r3)
        L4b:
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public androidx.constraintlayout.widget.C7461 m28552(int r5, int r6) {
            r4 = this;
            r0 = 7
            r1 = 6
            if (r5 != 0) goto L6
            r2 = r1
            goto L7
        L6:
            r2 = r0
        L7:
            r3 = 0
            r4.m28563(r1, r5, r2, r3)
            if (r6 != 0) goto Lf
            r2 = r0
            goto L10
        Lf:
            r2 = r1
        L10:
            r4.m28563(r0, r6, r2, r3)
            if (r5 == 0) goto L2f
            android.view.View r2 = r4.f26120
            android.view.ViewParent r2 = r2.getParent()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            android.view.View r5 = r2.findViewById(r5)
            androidx.constraintlayout.widget.ۥ۟۟۟۟ r2 = new androidx.constraintlayout.widget.ۥ۟۟۟۟
            r2.<init>(r5)
            android.view.View r5 = r4.f26120
            int r5 = r5.getId()
            r2.m28563(r0, r5, r1, r3)
        L2f:
            if (r6 == 0) goto L4b
            android.view.View r5 = r4.f26120
            android.view.ViewParent r5 = r5.getParent()
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            android.view.View r5 = r5.findViewById(r6)
            androidx.constraintlayout.widget.ۥ۟۟۟۟ r6 = new androidx.constraintlayout.widget.ۥ۟۟۟۟
            r6.<init>(r5)
            android.view.View r5 = r4.f26120
            int r5 = r5.getId()
            r6.m28563(r1, r5, r0, r3)
        L4b:
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public androidx.constraintlayout.widget.C7461 m28553(int r5, int r6) {
            r4 = this;
            r0 = 4
            r1 = 3
            if (r5 != 0) goto L6
            r2 = r1
            goto L7
        L6:
            r2 = r0
        L7:
            r3 = 0
            r4.m28563(r1, r5, r2, r3)
            if (r6 != 0) goto Lf
            r2 = r0
            goto L10
        Lf:
            r2 = r1
        L10:
            r4.m28563(r0, r6, r2, r3)
            if (r5 == 0) goto L2f
            android.view.View r2 = r4.f26120
            android.view.ViewParent r2 = r2.getParent()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            android.view.View r5 = r2.findViewById(r5)
            androidx.constraintlayout.widget.ۥ۟۟۟۟ r2 = new androidx.constraintlayout.widget.ۥ۟۟۟۟
            r2.<init>(r5)
            android.view.View r5 = r4.f26120
            int r5 = r5.getId()
            r2.m28563(r0, r5, r1, r3)
        L2f:
            if (r6 == 0) goto L4b
            android.view.View r5 = r4.f26120
            android.view.ViewParent r5 = r5.getParent()
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            android.view.View r5 = r5.findViewById(r6)
            androidx.constraintlayout.widget.ۥ۟۟۟۟ r6 = new androidx.constraintlayout.widget.ۥ۟۟۟۟
            r6.<init>(r5)
            android.view.View r5 = r4.f26120
            int r5 = r5.getId()
            r6.m28563(r1, r5, r0, r3)
        L4b:
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public androidx.constraintlayout.widget.C7461 m28554(float r2) {
            r1 = this;
            android.view.View r0 = r1.f26120
            r0.setAlpha(r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m28555() {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public androidx.constraintlayout.widget.C7461 m28556(int r3, int r4, int r5, int r6, int r7, int r8, float r9) {
            r2 = this;
            java.lang.String r0 = "margin must be > 0"
            if (r5 < 0) goto L50
            if (r8 < 0) goto L4a
            r0 = 0
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L42
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 > 0) goto L42
            r0 = 2
            r1 = 1
            if (r4 == r1) goto L37
            if (r4 != r0) goto L18
            goto L37
        L18:
            r0 = 7
            r1 = 6
            if (r4 == r1) goto L2c
            if (r4 != r0) goto L1f
            goto L2c
        L1f:
            r0 = 3
            r2.m28563(r0, r3, r4, r5)
            r3 = 4
            r2.m28563(r3, r6, r7, r8)
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r3 = r2.f26119
            r3.f25949 = r9
            goto L41
        L2c:
            r2.m28563(r1, r3, r4, r5)
            r2.m28563(r0, r6, r7, r8)
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r3 = r2.f26119
            r3.f25948 = r9
            goto L41
        L37:
            r2.m28563(r1, r3, r4, r5)
            r2.m28563(r0, r6, r7, r8)
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r3 = r2.f26119
            r3.f25948 = r9
        L41:
            return r2
        L42:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "bias must be between 0 and 1 inclusive"
            r3.<init>(r4)
            throw r3
        L4a:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>(r0)
            throw r3
        L50:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>(r0)
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public androidx.constraintlayout.widget.C7461 m28557(int r9) {
            r8 = this;
            if (r9 != 0) goto Lf
            r6 = 0
            r7 = 1056964608(0x3f000000, float:0.5)
            r1 = 0
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 2
            r0 = r8
            r0.m28556(r1, r2, r3, r4, r5, r6, r7)
            goto L1b
        Lf:
            r6 = 0
            r7 = 1056964608(0x3f000000, float:0.5)
            r2 = 2
            r3 = 0
            r5 = 1
            r0 = r8
            r1 = r9
            r4 = r9
            r0.m28556(r1, r2, r3, r4, r5, r6, r7)
        L1b:
            return r8
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public androidx.constraintlayout.widget.C7461 m28558(int r2, int r3, int r4, int r5, int r6, int r7, float r8) {
            r1 = this;
            r0 = 1
            r1.m28563(r0, r2, r3, r4)
            r2 = 2
            r1.m28563(r2, r5, r6, r7)
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r2 = r1.f26119
            r2.f25948 = r8
            return r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public androidx.constraintlayout.widget.C7461 m28559(int r9) {
            r8 = this;
            if (r9 != 0) goto Lf
            r6 = 0
            r7 = 1056964608(0x3f000000, float:0.5)
            r1 = 0
            r2 = 6
            r3 = 0
            r4 = 0
            r5 = 7
            r0 = r8
            r0.m28556(r1, r2, r3, r4, r5, r6, r7)
            goto L1b
        Lf:
            r6 = 0
            r7 = 1056964608(0x3f000000, float:0.5)
            r2 = 7
            r3 = 0
            r5 = 6
            r0 = r8
            r1 = r9
            r4 = r9
            r0.m28556(r1, r2, r3, r4, r5, r6, r7)
        L1b:
            return r8
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public androidx.constraintlayout.widget.C7461 m28560(int r2, int r3, int r4, int r5, int r6, int r7, float r8) {
            r1 = this;
            r0 = 6
            r1.m28563(r0, r2, r3, r4)
            r2 = 7
            r1.m28563(r2, r5, r6, r7)
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r2 = r1.f26119
            r2.f25948 = r8
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public androidx.constraintlayout.widget.C7461 m28561(int r9) {
            r8 = this;
            if (r9 != 0) goto Lf
            r6 = 0
            r7 = 1056964608(0x3f000000, float:0.5)
            r1 = 0
            r2 = 3
            r3 = 0
            r4 = 0
            r5 = 4
            r0 = r8
            r0.m28556(r1, r2, r3, r4, r5, r6, r7)
            goto L1b
        Lf:
            r6 = 0
            r7 = 1056964608(0x3f000000, float:0.5)
            r2 = 4
            r3 = 0
            r5 = 3
            r0 = r8
            r1 = r9
            r4 = r9
            r0.m28556(r1, r2, r3, r4, r5, r6, r7)
        L1b:
            return r8
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public androidx.constraintlayout.widget.C7461 m28562(int r2, int r3, int r4, int r5, int r6, int r7, float r8) {
            r1 = this;
            r0 = 3
            r1.m28563(r0, r2, r3, r4)
            r2 = 4
            r1.m28563(r2, r5, r6, r7)
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r2 = r1.f26119
            r2.f25949 = r8
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public androidx.constraintlayout.widget.C7461 m28563(int r10, int r11, int r12, int r13) {
            r9 = this;
            r0 = 2
            r1 = 1
            r2 = 3
            r3 = 4
            r4 = 6
            r5 = 7
            java.lang.String r6 = "right to "
            java.lang.String r7 = " undefined"
            r8 = -1
            switch(r10) {
                case 1: goto L169;
                case 2: goto L137;
                case 3: goto L101;
                case 4: goto Lca;
                case 5: goto L9d;
                case 6: goto L69;
                case 7: goto L35;
                default: goto Le;
            }
        Le:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r10 = r9.m28587(r10)
            r13.append(r10)
            java.lang.String r10 = " to "
            r13.append(r10)
            java.lang.String r10 = r9.m28587(r12)
            r13.append(r10)
            java.lang.String r10 = " unknown"
            r13.append(r10)
            java.lang.String r10 = r13.toString()
            r11.<init>(r10)
            throw r11
        L35:
            if (r12 != r5) goto L3e
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r10 = r9.f26119
            r10.f25941 = r11
            r10.f25940 = r8
            goto L46
        L3e:
            if (r12 != r4) goto L4d
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r10 = r9.f26119
            r10.f25940 = r11
            r10.f25941 = r8
        L46:
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r10 = r9.f26119
            r10.setMarginEnd(r13)
            goto L17e
        L4d:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r6)
            java.lang.String r12 = r9.m28587(r12)
            r11.append(r12)
            r11.append(r7)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L69:
            if (r12 != r4) goto L72
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r10 = r9.f26119
            r10.f25939 = r11
            r10.f25938 = r8
            goto L7a
        L72:
            if (r12 != r5) goto L81
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r10 = r9.f26119
            r10.f25938 = r11
            r10.f25939 = r8
        L7a:
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r10 = r9.f26119
            r10.setMarginStart(r13)
            goto L17e
        L81:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r6)
            java.lang.String r12 = r9.m28587(r12)
            r11.append(r12)
            r11.append(r7)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L9d:
            r10 = 5
            if (r12 != r10) goto Lae
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r10 = r9.f26119
            r10.f25934 = r11
            r10.f25933 = r8
            r10.f25932 = r8
            r10.f25930 = r8
            r10.f25931 = r8
            goto L17e
        Lae:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r6)
            java.lang.String r12 = r9.m28587(r12)
            r11.append(r12)
            r11.append(r7)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        Lca:
            if (r12 != r3) goto Ld5
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r10 = r9.f26119
            r10.f25933 = r11
            r10.f25932 = r8
            r10.f25934 = r8
            goto Ldf
        Ld5:
            if (r12 != r2) goto Le5
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r10 = r9.f26119
            r10.f25932 = r11
            r10.f25933 = r8
            r10.f25934 = r8
        Ldf:
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r10 = r9.f26119
            r10.bottomMargin = r13
            goto L17e
        Le5:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r6)
            java.lang.String r12 = r9.m28587(r12)
            r11.append(r12)
            r11.append(r7)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L101:
            if (r12 != r2) goto L10c
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r10 = r9.f26119
            r10.f25930 = r11
            r10.f25931 = r8
            r10.f25934 = r8
            goto L116
        L10c:
            if (r12 != r3) goto L11b
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r10 = r9.f26119
            r10.f25931 = r11
            r10.f25930 = r8
            r10.f25934 = r8
        L116:
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r10 = r9.f26119
            r10.topMargin = r13
            goto L17e
        L11b:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r6)
            java.lang.String r12 = r9.m28587(r12)
            r11.append(r12)
            r11.append(r7)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L137:
            if (r12 != r1) goto L140
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r10 = r9.f26119
            r10.f25928 = r11
            r10.f25929 = r8
            goto L148
        L140:
            if (r12 != r0) goto L14d
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r10 = r9.f26119
            r10.f25929 = r11
            r10.f25928 = r8
        L148:
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r10 = r9.f26119
            r10.rightMargin = r13
            goto L17e
        L14d:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r6)
            java.lang.String r12 = r9.m28587(r12)
            r11.append(r12)
            r11.append(r7)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L169:
            if (r12 != r1) goto L172
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r10 = r9.f26119
            r10.f25926 = r11
            r10.f25927 = r8
            goto L17a
        L172:
            if (r12 != r0) goto L17f
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r10 = r9.f26119
            r10.f25927 = r11
            r10.f25926 = r8
        L17a:
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r10 = r9.f26119
            r10.leftMargin = r13
        L17e:
            return r9
        L17f:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r13 = "Left to "
            r11.append(r13)
            java.lang.String r12 = r9.m28587(r12)
            r11.append(r12)
            r11.append(r7)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public androidx.constraintlayout.widget.C7461 m28564(int r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r0 = r1.f26119
            r0.f25958 = r2
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public androidx.constraintlayout.widget.C7461 m28565(int r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r0 = r1.f26119
            r0.f25957 = r2
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public androidx.constraintlayout.widget.C7461 m28566(int r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r0 = r1.f26119
            r0.height = r2
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public androidx.constraintlayout.widget.C7461 m28567(int r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r0 = r1.f26119
            r0.f25962 = r2
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public androidx.constraintlayout.widget.C7461 m28568(int r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r0 = r1.f26119
            r0.f25961 = r2
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public androidx.constraintlayout.widget.C7461 m28569(int r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r0 = r1.f26119
            r0.f25960 = r2
            return r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public androidx.constraintlayout.widget.C7461 m28570(int r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r0 = r1.f26119
            r0.f25959 = r2
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public androidx.constraintlayout.widget.C7461 m28571(int r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r0 = r1.f26119
            r0.width = r2
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public androidx.constraintlayout.widget.C7461 m28572(java.lang.String r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r0 = r1.f26119
            r0.f25950 = r2
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public androidx.constraintlayout.widget.C7461 m28573(float r2) {
            r1 = this;
            android.view.View r0 = r1.f26120
            r0.setElevation(r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public androidx.constraintlayout.widget.C7461 m28574(int r1, int r2) {
            r0 = this;
            switch(r1) {
                case 1: goto L2c;
                case 2: goto L27;
                case 3: goto L22;
                case 4: goto L1d;
                case 5: goto L15;
                case 6: goto L10;
                case 7: goto Lb;
                default: goto L3;
            }
        L3:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "unknown constraint"
            r1.<init>(r2)
            throw r1
        Lb:
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r1 = r0.f26119
            r1.f25947 = r2
            goto L30
        L10:
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r1 = r0.f26119
            r1.f25946 = r2
            goto L30
        L15:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "baseline does not support margins"
            r1.<init>(r2)
            throw r1
        L1d:
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r1 = r0.f26119
            r1.f25945 = r2
            goto L30
        L22:
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r1 = r0.f26119
            r1.f25943 = r2
            goto L30
        L27:
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r1 = r0.f26119
            r1.f25944 = r2
            goto L30
        L2c:
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r1 = r0.f26119
            r1.f25942 = r2
        L30:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public androidx.constraintlayout.widget.C7461 m28575(float r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r0 = r1.f26119
            r0.f25948 = r2
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public androidx.constraintlayout.widget.C7461 m28576(int r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r0 = r1.f26119
            r0.f25955 = r2
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public androidx.constraintlayout.widget.C7461 m28577(float r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r0 = r1.f26119
            r0.f25953 = r2
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public androidx.constraintlayout.widget.C7461 m28578(int r1, int r2) {
            r0 = this;
            switch(r1) {
                case 1: goto L2e;
                case 2: goto L29;
                case 3: goto L24;
                case 4: goto L1f;
                case 5: goto L17;
                case 6: goto L11;
                case 7: goto Lb;
                default: goto L3;
            }
        L3:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "unknown constraint"
            r1.<init>(r2)
            throw r1
        Lb:
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r1 = r0.f26119
            r1.setMarginEnd(r2)
            goto L32
        L11:
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r1 = r0.f26119
            r1.setMarginStart(r2)
            goto L32
        L17:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "baseline does not support margins"
            r1.<init>(r2)
            throw r1
        L1f:
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r1 = r0.f26119
            r1.bottomMargin = r2
            goto L32
        L24:
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r1 = r0.f26119
            r1.topMargin = r2
            goto L32
        L29:
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r1 = r0.f26119
            r1.rightMargin = r2
            goto L32
        L2e:
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r1 = r0.f26119
            r1.leftMargin = r2
        L32:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public androidx.constraintlayout.widget.C7461 m28579(int r2) {
            r1 = this;
            r0 = -1
            switch(r2) {
                case 1: goto L4e;
                case 2: goto L43;
                case 3: goto L38;
                case 4: goto L2d;
                case 5: goto L28;
                case 6: goto L1a;
                case 7: goto Lc;
                default: goto L4;
            }
        L4:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "unknown constraint"
            r2.<init>(r0)
            throw r2
        Lc:
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r2 = r1.f26119
            r2.f25940 = r0
            r2.f25941 = r0
            r2.setMarginEnd(r0)
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r2 = r1.f26119
            r2.f25947 = r0
            goto L58
        L1a:
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r2 = r1.f26119
            r2.f25938 = r0
            r2.f25939 = r0
            r2.setMarginStart(r0)
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r2 = r1.f26119
            r2.f25946 = r0
            goto L58
        L28:
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r2 = r1.f26119
            r2.f25934 = r0
            goto L58
        L2d:
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r2 = r1.f26119
            r2.f25932 = r0
            r2.f25933 = r0
            r2.bottomMargin = r0
            r2.f25945 = r0
            goto L58
        L38:
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r2 = r1.f26119
            r2.f25931 = r0
            r2.f25930 = r0
            r2.topMargin = r0
            r2.f25943 = r0
            goto L58
        L43:
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r2 = r1.f26119
            r2.f25929 = r0
            r2.f25928 = r0
            r2.rightMargin = r0
            r2.f25944 = r0
            goto L58
        L4e:
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r2 = r1.f26119
            r2.f25927 = r0
            r2.f25926 = r0
            r2.leftMargin = r0
            r2.f25942 = r0
        L58:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public androidx.constraintlayout.widget.C7461 m28580() {
            r10 = this;
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r0 = r10.f26119
            int r1 = r0.f25927
            int r2 = r0.f25928
            r3 = 0
            r4 = -1
            if (r1 != r4) goto L60
            if (r2 == r4) goto Ld
            goto L60
        Ld:
            int r2 = r0.f25938
            int r0 = r0.f25940
            r5 = 6
            r6 = 7
            if (r2 != r4) goto L17
            if (r0 == r4) goto L59
        L17:
            android.view.View r7 = r10.f26120
            android.view.ViewParent r7 = r7.getParent()
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            android.view.View r7 = r7.findViewById(r2)
            androidx.constraintlayout.widget.ۥ۟۟۟۟ r8 = new androidx.constraintlayout.widget.ۥ۟۟۟۟
            r8.<init>(r7)
            android.view.View r7 = r10.f26120
            android.view.ViewParent r7 = r7.getParent()
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            android.view.View r7 = r7.findViewById(r0)
            androidx.constraintlayout.widget.ۥ۟۟۟۟ r9 = new androidx.constraintlayout.widget.ۥ۟۟۟۟
            r9.<init>(r7)
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r7 = r10.f26119
            if (r2 == r4) goto L46
            if (r0 == r4) goto L46
            r8.m28563(r6, r0, r5, r3)
            r9.m28563(r5, r1, r6, r3)
            goto L59
        L46:
            if (r1 != r4) goto L4a
            if (r0 == r4) goto L59
        L4a:
            int r0 = r7.f25929
            if (r0 == r4) goto L52
            r8.m28563(r6, r0, r6, r3)
            goto L59
        L52:
            int r0 = r7.f25926
            if (r0 == r4) goto L59
            r9.m28563(r5, r0, r5, r3)
        L59:
            r10.m28579(r5)
            r10.m28579(r6)
            goto Laa
        L60:
            android.view.View r0 = r10.f26120
            android.view.ViewParent r0 = r0.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r0 = r0.findViewById(r1)
            androidx.constraintlayout.widget.ۥ۟۟۟۟ r5 = new androidx.constraintlayout.widget.ۥ۟۟۟۟
            r5.<init>(r0)
            android.view.View r0 = r10.f26120
            android.view.ViewParent r0 = r0.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r0 = r0.findViewById(r2)
            androidx.constraintlayout.widget.ۥ۟۟۟۟ r6 = new androidx.constraintlayout.widget.ۥ۟۟۟۟
            r6.<init>(r0)
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r0 = r10.f26119
            r7 = 1
            r8 = 2
            if (r1 == r4) goto L91
            if (r2 == r4) goto L91
            r5.m28563(r8, r2, r7, r3)
            r6.m28563(r7, r1, r8, r3)
            goto La4
        L91:
            if (r1 != r4) goto L95
            if (r2 == r4) goto La4
        L95:
            int r1 = r0.f25929
            if (r1 == r4) goto L9d
            r5.m28563(r8, r1, r8, r3)
            goto La4
        L9d:
            int r0 = r0.f25926
            if (r0 == r4) goto La4
            r6.m28563(r7, r0, r7, r3)
        La4:
            r10.m28579(r7)
            r10.m28579(r8)
        Laa:
            return r10
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public androidx.constraintlayout.widget.C7461 m28581() {
            r9 = this;
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r0 = r9.f26119
            int r1 = r0.f25931
            int r0 = r0.f25932
            r2 = 3
            r3 = 4
            r4 = -1
            if (r1 != r4) goto Ld
            if (r0 == r4) goto L50
        Ld:
            android.view.View r5 = r9.f26120
            android.view.ViewParent r5 = r5.getParent()
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            android.view.View r5 = r5.findViewById(r1)
            androidx.constraintlayout.widget.ۥ۟۟۟۟ r6 = new androidx.constraintlayout.widget.ۥ۟۟۟۟
            r6.<init>(r5)
            android.view.View r5 = r9.f26120
            android.view.ViewParent r5 = r5.getParent()
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            android.view.View r5 = r5.findViewById(r0)
            androidx.constraintlayout.widget.ۥ۟۟۟۟ r7 = new androidx.constraintlayout.widget.ۥ۟۟۟۟
            r7.<init>(r5)
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r5 = r9.f26119
            r8 = 0
            if (r1 == r4) goto L3d
            if (r0 == r4) goto L3d
            r6.m28563(r3, r0, r2, r8)
            r7.m28563(r2, r1, r3, r8)
            goto L50
        L3d:
            if (r1 != r4) goto L41
            if (r0 == r4) goto L50
        L41:
            int r0 = r5.f25933
            if (r0 == r4) goto L49
            r6.m28563(r3, r0, r3, r8)
            goto L50
        L49:
            int r0 = r5.f25930
            if (r0 == r4) goto L50
            r7.m28563(r2, r0, r2, r8)
        L50:
            r9.m28579(r2)
            r9.m28579(r3)
            return r9
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public androidx.constraintlayout.widget.C7461 m28582(float r2) {
            r1 = this;
            android.view.View r0 = r1.f26120
            r0.setRotation(r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public androidx.constraintlayout.widget.C7461 m28583(float r2) {
            r1 = this;
            android.view.View r0 = r1.f26120
            r0.setRotationX(r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public androidx.constraintlayout.widget.C7461 m28584(float r2) {
            r1 = this;
            android.view.View r0 = r1.f26120
            r0.setRotationY(r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public androidx.constraintlayout.widget.C7461 m28585(float r2) {
            r1 = this;
            android.view.View r0 = r1.f26120
            r0.setScaleY(r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public androidx.constraintlayout.widget.C7461 m28586(float r1) {
            r0 = this;
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public final java.lang.String m28587(int r1) {
            r0 = this;
            switch(r1) {
                case 1: goto L18;
                case 2: goto L15;
                case 3: goto L12;
                case 4: goto Lf;
                case 5: goto Lc;
                case 6: goto L9;
                case 7: goto L6;
                default: goto L3;
            }
        L3:
            java.lang.String r1 = "undefined"
            return r1
        L6:
            java.lang.String r1 = "end"
            return r1
        L9:
            java.lang.String r1 = "start"
            return r1
        Lc:
            java.lang.String r1 = "baseline"
            return r1
        Lf:
            java.lang.String r1 = "bottom"
            return r1
        L12:
            java.lang.String r1 = "top"
            return r1
        L15:
            java.lang.String r1 = "right"
            return r1
        L18:
            java.lang.String r1 = "left"
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public androidx.constraintlayout.widget.C7461 m28588(float r2, float r3) {
            r1 = this;
            android.view.View r0 = r1.f26120
            r0.setPivotX(r2)
            android.view.View r2 = r1.f26120
            r2.setPivotY(r3)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public androidx.constraintlayout.widget.C7461 m28589(float r2) {
            r1 = this;
            android.view.View r0 = r1.f26120
            r0.setPivotX(r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public androidx.constraintlayout.widget.C7461 m28590(float r2) {
            r1 = this;
            android.view.View r0 = r1.f26120
            r0.setPivotY(r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public androidx.constraintlayout.widget.C7461 m28591(float r2, float r3) {
            r1 = this;
            android.view.View r0 = r1.f26120
            r0.setTranslationX(r2)
            android.view.View r2 = r1.f26120
            r2.setTranslationY(r3)
            return r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public androidx.constraintlayout.widget.C7461 m28592(float r2) {
            r1 = this;
            android.view.View r0 = r1.f26120
            r0.setTranslationX(r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public androidx.constraintlayout.widget.C7461 m28593(float r2) {
            r1 = this;
            android.view.View r0 = r1.f26120
            r0.setTranslationY(r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public androidx.constraintlayout.widget.C7461 m28594(float r2) {
            r1 = this;
            android.view.View r0 = r1.f26120
            r0.setTranslationZ(r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public androidx.constraintlayout.widget.C7461 m28595(float r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r0 = r1.f26119
            r0.f25949 = r2
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public androidx.constraintlayout.widget.C7461 m28596(int r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r0 = r1.f26119
            r0.f25956 = r2
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public androidx.constraintlayout.widget.C7461 m28597(float r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r0 = r1.f26119
            r0.f25954 = r2
            return r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public androidx.constraintlayout.widget.C7461 m28598(int r2) {
            r1 = this;
            android.view.View r0 = r1.f26120
            r0.setVisibility(r2)
            return r1
    }
}
