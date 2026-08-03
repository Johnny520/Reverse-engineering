package c8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.lang.Object f1055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public java.lang.Object f1056e;

    public /* synthetic */ a() {
            r1 = this;
            r0 = 3
            r1.f1052a = r0
            r1.<init>()
            return
    }

    public a(int r2, java.lang.String r3, java.lang.String r4, int r5) {
            r1 = this;
            r0 = 1
            r1.f1052a = r0
            r1.<init>()
            r1.f1055d = r3
            r1.f1053b = r2
            r1.f1054c = r5
            r1.f1056e = r4
            return
    }

    public a(c8.a r2, char[] r3, int r4, int r5) {
            r1 = this;
            r0 = 0
            r1.f1052a = r0
            r1.<init>()
            r1.f1055d = r2
            r1.f1056e = r3
            r1.f1053b = r4
            r1.f1054c = r5
            return
    }

    public a(java.lang.CharSequence r3, int r4, java.util.Locale r5) {
            r2 = this;
            r0 = 2
            r2.f1052a = r0
            r2.<init>()
            r2.f1055d = r3
            int r0 = r3.length()
            if (r0 < 0) goto Lf
            goto L14
        Lf:
            java.lang.String r0 = "input start index is outside the CharSequence"
            o2.a.a(r0)
        L14:
            if (r4 < 0) goto L1d
            int r0 = r3.length()
            if (r4 > r0) goto L1d
            goto L22
        L1d:
            java.lang.String r0 = "input end index is outside the CharSequence"
            o2.a.a(r0)
        L22:
            java.text.BreakIterator r5 = java.text.BreakIterator.getWordInstance(r5)
            r2.f1056e = r5
            r0 = -50
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)
            r2.f1053b = r0
            int r0 = r3.length()
            int r1 = r4 + 50
            int r0 = java.lang.Math.min(r0, r1)
            r2.f1054c = r0
            j2.c r0 = new j2.c
            r0.<init>(r3, r4)
            r5.setText(r0)
            return
    }

    public void a(int r6) {
            r5 = this;
            int r0 = r5.f1053b
            int r1 = r5.f1054c
            r2 = 0
            if (r6 > r1) goto La
            if (r0 > r6) goto La
            r2 = 1
        La:
            if (r2 != 0) goto L25
            java.lang.String r2 = ". Valid range is ["
            java.lang.String r3 = " , "
            java.lang.String r4 = "Invalid offset: "
            java.lang.StringBuilder r6 = eh.a.s(r6, r0, r4, r2, r3)
            r6.append(r1)
            r0 = 93
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            o2.a.a(r6)
        L25:
            return
    }

    public int b() {
            r4 = this;
            java.lang.Object r0 = r4.f1056e
            h0.s r0 = (h0.s) r0
            java.lang.Object r1 = r4.f1055d
            java.lang.String r1 = (java.lang.String) r1
            if (r0 != 0) goto Lf
            int r0 = r1.length()
            return r0
        Lf:
            int r1 = r1.length()
            int r2 = r4.f1054c
            int r3 = r4.f1053b
            int r2 = r2 - r3
            int r1 = r1 - r2
            int r2 = r0.f4979b
            int r0 = r0.b()
            int r2 = r2 - r0
            int r2 = r2 + r1
            return r2
    }

    public boolean c(int r5) {
            r4 = this;
            java.lang.Object r0 = r4.f1055d
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r1 = r4.f1053b
            r2 = 1
            int r1 = r1 + r2
            int r3 = r4.f1054c
            if (r5 > r3) goto L3d
            if (r1 > r5) goto L3d
            int r1 = java.lang.Character.codePointBefore(r0, r5)
            boolean r1 = java.lang.Character.isLetterOrDigit(r1)
            if (r1 == 0) goto L19
            goto L3c
        L19:
            int r5 = r5 - r2
            char r1 = r0.charAt(r5)
            boolean r1 = java.lang.Character.isSurrogate(r1)
            if (r1 == 0) goto L25
            goto L3c
        L25:
            boolean r1 = l3.i.d()
            if (r1 == 0) goto L3d
            l3.i r1 = l3.i.a()
            int r3 = r1.c()
            if (r3 != r2) goto L3d
            int r5 = r1.b(r0, r5)
            r0 = -1
            if (r5 == r0) goto L3d
        L3c:
            return r2
        L3d:
            r5 = 0
            return r5
    }

    public boolean d(int r3) {
            r2 = this;
            int r0 = r2.f1053b
            int r0 = r0 + 1
            int r1 = r2.f1054c
            if (r3 > r1) goto L17
            if (r0 > r3) goto L17
            java.lang.Object r0 = r2.f1055d
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r3 = java.lang.Character.codePointBefore(r0, r3)
            boolean r3 = a.a.t0(r3)
            return r3
        L17:
            r3 = 0
            return r3
    }

    public boolean e(int r3) {
            r2 = this;
            r2.a(r3)
            java.lang.Object r0 = r2.f1056e
            java.text.BreakIterator r0 = (java.text.BreakIterator) r0
            boolean r0 = r0.isBoundary(r3)
            if (r0 == 0) goto L3f
            boolean r0 = r2.g(r3)
            if (r0 == 0) goto L23
            int r0 = r3 + (-1)
            boolean r0 = r2.g(r0)
            if (r0 == 0) goto L23
            int r0 = r3 + 1
            boolean r0 = r2.g(r0)
            if (r0 != 0) goto L3f
        L23:
            r0 = 1
            if (r3 <= 0) goto L3e
            java.lang.Object r1 = r2.f1055d
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r1 = r1.length()
            int r1 = r1 - r0
            if (r3 >= r1) goto L3e
            boolean r1 = r2.f(r3)
            if (r1 != 0) goto L3f
            int r3 = r3 + r0
            boolean r3 = r2.f(r3)
            if (r3 != 0) goto L3f
        L3e:
            return r0
        L3f:
            r3 = 0
            return r3
    }

    public boolean f(int r6) {
            r5 = this;
            java.lang.Object r0 = r5.f1055d
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r1 = r6 + (-1)
            char r2 = r0.charAt(r1)
            java.lang.Character$UnicodeBlock r2 = java.lang.Character.UnicodeBlock.of(r2)
            java.lang.Character$UnicodeBlock r3 = java.lang.Character.UnicodeBlock.HIRAGANA
            boolean r2 = gg.l.a(r2, r3)
            if (r2 == 0) goto L26
            char r2 = r0.charAt(r6)
            java.lang.Character$UnicodeBlock r2 = java.lang.Character.UnicodeBlock.of(r2)
            java.lang.Character$UnicodeBlock r4 = java.lang.Character.UnicodeBlock.KATAKANA
            boolean r2 = gg.l.a(r2, r4)
            if (r2 != 0) goto L44
        L26:
            char r6 = r0.charAt(r6)
            java.lang.Character$UnicodeBlock r6 = java.lang.Character.UnicodeBlock.of(r6)
            boolean r6 = gg.l.a(r6, r3)
            if (r6 == 0) goto L46
            char r6 = r0.charAt(r1)
            java.lang.Character$UnicodeBlock r6 = java.lang.Character.UnicodeBlock.of(r6)
            java.lang.Character$UnicodeBlock r0 = java.lang.Character.UnicodeBlock.KATAKANA
            boolean r6 = gg.l.a(r6, r0)
            if (r6 == 0) goto L46
        L44:
            r6 = 1
            return r6
        L46:
            r6 = 0
            return r6
    }

    public boolean g(int r5) {
            r4 = this;
            java.lang.Object r0 = r4.f1055d
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r1 = r4.f1053b
            int r2 = r4.f1054c
            if (r5 >= r2) goto L3b
            if (r1 > r5) goto L3b
            int r1 = java.lang.Character.codePointAt(r0, r5)
            boolean r1 = java.lang.Character.isLetterOrDigit(r1)
            r2 = 1
            if (r1 == 0) goto L18
            goto L3a
        L18:
            char r1 = r0.charAt(r5)
            boolean r1 = java.lang.Character.isSurrogate(r1)
            if (r1 == 0) goto L23
            goto L3a
        L23:
            boolean r1 = l3.i.d()
            if (r1 == 0) goto L3b
            l3.i r1 = l3.i.a()
            int r3 = r1.c()
            if (r3 != r2) goto L3b
            int r5 = r1.b(r0, r5)
            r0 = -1
            if (r5 == r0) goto L3b
        L3a:
            return r2
        L3b:
            r5 = 0
            return r5
    }

    public boolean h(int r3) {
            r2 = this;
            int r0 = r2.f1053b
            int r1 = r2.f1054c
            if (r3 >= r1) goto L15
            if (r0 > r3) goto L15
            java.lang.Object r0 = r2.f1055d
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r3 = java.lang.Character.codePointAt(r0, r3)
            boolean r3 = a.a.t0(r3)
            return r3
        L15:
            r3 = 0
            return r3
    }

    public int i(int r2) {
            r1 = this;
            r1.a(r2)
            java.lang.Object r0 = r1.f1056e
            java.text.BreakIterator r0 = (java.text.BreakIterator) r0
            int r2 = r0.following(r2)
            int r0 = r2 + (-1)
            boolean r0 = r1.g(r0)
            if (r0 == 0) goto L23
            boolean r0 = r1.g(r2)
            if (r0 == 0) goto L23
            boolean r0 = r1.f(r2)
            if (r0 != 0) goto L23
            int r2 = r1.i(r2)
        L23:
            return r2
    }

    public int j(int r2) {
            r1 = this;
            r1.a(r2)
            java.lang.Object r0 = r1.f1056e
            java.text.BreakIterator r0 = (java.text.BreakIterator) r0
            int r2 = r0.preceding(r2)
            boolean r0 = r1.g(r2)
            if (r0 == 0) goto L21
            boolean r0 = r1.c(r2)
            if (r0 == 0) goto L21
            boolean r0 = r1.f(r2)
            if (r0 != 0) goto L21
            int r2 = r1.j(r2)
        L21:
            return r2
    }

    public void k(int r9, int r10, java.lang.String r11) {
            r8 = this;
            if (r9 > r10) goto L3
            goto L1c
        L3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "start index must be less than or equal to end index: "
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r1 = " > "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            o2.a.a(r0)
        L1c:
            if (r9 < 0) goto L1f
            goto L30
        L1f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "start must be non-negative, but was "
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            o2.a.a(r0)
        L30:
            java.lang.Object r0 = r8.f1056e
            h0.s r0 = (h0.s) r0
            r1 = 0
            if (r0 != 0) goto L91
            int r0 = r11.length()
            int r0 = r0 + 128
            r2 = 255(0xff, float:3.57E-43)
            int r0 = java.lang.Math.max(r2, r0)
            char[] r2 = new char[r0]
            r3 = 64
            int r4 = java.lang.Math.min(r9, r3)
            java.lang.Object r5 = r8.f1055d
            java.lang.String r5 = (java.lang.String) r5
            int r5 = r5.length()
            int r5 = r5 - r10
            int r3 = java.lang.Math.min(r5, r3)
            java.lang.Object r5 = r8.f1055d
            java.lang.String r5 = (java.lang.String) r5
            int r6 = r9 - r4
            r5.getClass()
            r5.getChars(r6, r9, r2, r1)
            java.lang.Object r9 = r8.f1055d
            java.lang.String r9 = (java.lang.String) r9
            int r5 = r0 - r3
            int r3 = r3 + r10
            r9.getClass()
            r9.getChars(r10, r3, r2, r5)
            int r9 = r11.length()
            r11.getChars(r1, r9, r2, r4)
            h0.s r9 = new h0.s
            int r10 = r11.length()
            int r10 = r10 + r4
            r9.<init>()
            r9.f4979b = r0
            r9.f4982e = r2
            r9.f4980c = r10
            r9.f4981d = r5
            r8.f1056e = r9
            r8.f1053b = r6
            r8.f1054c = r3
            return
        L91:
            int r2 = r8.f1053b
            int r3 = r9 - r2
            int r2 = r10 - r2
            if (r3 < 0) goto L13e
            int r4 = r0.f4979b
            int r5 = r0.b()
            int r4 = r4 - r5
            if (r2 <= r4) goto La4
            goto L13e
        La4:
            int r9 = r11.length()
            int r10 = r2 - r3
            int r9 = r9 - r10
            int r10 = r0.b()
            if (r9 > r10) goto Lb2
            goto Le3
        Lb2:
            int r10 = r0.b()
            int r9 = r9 - r10
            int r10 = r0.f4979b
        Lb9:
            int r10 = r10 * 2
            int r4 = r0.f4979b
            int r4 = r10 - r4
            if (r4 >= r9) goto Lc2
            goto Lb9
        Lc2:
            char[] r9 = new char[r10]
            java.lang.Object r4 = r0.f4982e
            char[] r4 = (char[]) r4
            int r5 = r0.f4980c
            java.lang.System.arraycopy(r4, r1, r9, r1, r5)
            int r4 = r0.f4979b
            int r5 = r0.f4981d
            int r4 = r4 - r5
            int r6 = r10 - r4
            java.lang.Object r7 = r0.f4982e
            char[] r7 = (char[]) r7
            int r4 = r4 + r5
            int r4 = r4 - r5
            java.lang.System.arraycopy(r7, r5, r9, r6, r4)
            r0.f4982e = r9
            r0.f4979b = r10
            r0.f4981d = r6
        Le3:
            int r9 = r0.f4980c
            if (r3 >= r9) goto Lfc
            if (r2 > r9) goto Lfc
            int r9 = r9 - r2
            java.lang.Object r10 = r0.f4982e
            char[] r10 = (char[]) r10
            int r4 = r0.f4981d
            int r4 = r4 - r9
            java.lang.System.arraycopy(r10, r2, r10, r4, r9)
            r0.f4980c = r3
            int r10 = r0.f4981d
            int r10 = r10 - r9
            r0.f4981d = r10
            goto L127
        Lfc:
            if (r3 >= r9) goto L10a
            if (r2 < r9) goto L10a
            int r9 = r0.b()
            int r9 = r9 + r2
            r0.f4981d = r9
            r0.f4980c = r3
            goto L127
        L10a:
            int r9 = r0.b()
            int r9 = r9 + r3
            int r10 = r0.b()
            int r10 = r10 + r2
            int r2 = r0.f4981d
            int r9 = r9 - r2
            java.lang.Object r3 = r0.f4982e
            char[] r3 = (char[]) r3
            int r4 = r0.f4980c
            java.lang.System.arraycopy(r3, r2, r3, r4, r9)
            int r2 = r0.f4980c
            int r2 = r2 + r9
            r0.f4980c = r2
            r0.f4981d = r10
        L127:
            java.lang.Object r9 = r0.f4982e
            char[] r9 = (char[]) r9
            int r10 = r0.f4980c
            int r2 = r11.length()
            r11.getChars(r1, r2, r9, r10)
            int r9 = r0.f4980c
            int r10 = r11.length()
            int r10 = r10 + r9
            r0.f4980c = r10
            return
        L13e:
            java.lang.String r0 = r8.toString()
            r8.f1055d = r0
            r0 = 0
            r8.f1056e = r0
            r0 = -1
            r8.f1053b = r0
            r8.f1054c = r0
            r8.k(r9, r10, r11)
            return
    }

    public java.lang.String toString() {
            r5 = this;
            int r0 = r5.f1052a
            switch(r0) {
                case 3: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = super.toString()
            return r0
        La:
            java.lang.Object r0 = r5.f1056e
            h0.s r0 = (h0.s) r0
            java.lang.Object r1 = r5.f1055d
            java.lang.String r1 = (java.lang.String) r1
            if (r0 != 0) goto L15
            goto L46
        L15:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r3 = r5.f1053b
            r4 = 0
            r2.append(r1, r4, r3)
            java.lang.Object r1 = r0.f4982e
            char[] r1 = (char[]) r1
            int r3 = r0.f4980c
            r2.append(r1, r4, r3)
            java.lang.Object r1 = r0.f4982e
            char[] r1 = (char[]) r1
            int r3 = r0.f4981d
            int r0 = r0.f4979b
            int r0 = r0 - r3
            r2.append(r1, r3, r0)
            java.lang.Object r0 = r5.f1055d
            java.lang.String r0 = (java.lang.String) r0
            int r1 = r5.f1054c
            int r3 = r0.length()
            r2.append(r0, r1, r3)
            java.lang.String r1 = r2.toString()
        L46:
            return r1
    }
}
