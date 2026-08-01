package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ad implements defpackage.zc, defpackage.bd {
    public final /* synthetic */ int a;
    public java.lang.Object b;
    public int c;
    public int d;
    public java.lang.Object e;
    public java.lang.Cloneable f;

    public /* synthetic */ ad() {
            r1 = this;
            r0 = 0
            r1.a = r0
            r1.<init>()
            return
    }

    public ad(defpackage.ad r4) {
            r3 = this;
            r0 = 1
            r3.a = r0
            r3.<init>()
            java.lang.Object r0 = r4.b
            android.content.ClipData r0 = (android.content.ClipData) r0
            r0.getClass()
            r3.b = r0
            int r0 = r4.c
            if (r0 < 0) goto L61
            r1 = 5
            if (r0 > r1) goto L57
            r3.c = r0
            int r0 = r4.d
            r1 = r0 & 1
            if (r1 != r0) goto L2d
            r3.d = r0
            java.lang.Object r0 = r4.e
            android.net.Uri r0 = (android.net.Uri) r0
            r3.e = r0
            java.lang.Cloneable r4 = r4.f
            android.os.Bundle r4 = (android.os.Bundle) r4
            r3.f = r4
            return
        L2d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Requested flags 0x"
            r1.<init>(r2)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r1.append(r0)
            java.lang.String r0 = ", but only 0x"
            r1.append(r0)
            r0 = 1
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r1.append(r0)
            java.lang.String r0 = " are allowed"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.<init>(r0)
            throw r4
        L57:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = "source is out of range of [0, 5] (too high)"
            r4.<init>(r0)
            throw r4
        L61:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = "source is out of range of [0, 5] (too low)"
            r4.<init>(r0)
            throw r4
    }

    public ad(android.view.View r2) {
            r1 = this;
            r0 = 2
            r1.a = r0
            r1.<init>()
            int[] r0 = new int[r0]
            r1.f = r0
            r1.e = r2
            return
    }

    public void a(defpackage.wc0 r2, java.util.List r3) {
            r1 = this;
            java.util.Iterator r2 = r3.iterator()
        L4:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2f
            java.lang.Object r3 = r2.next()
            gc0 r3 = (defpackage.gc0) r3
            fc0 r0 = r3.a
            int r0 = r0.c()
            r0 = r0 & 8
            if (r0 == 0) goto L4
            int r2 = r1.d
            fc0 r3 = r3.a
            float r3 = r3.b()
            r0 = 0
            int r2 = defpackage.q2.c(r3, r2, r0)
            float r2 = (float) r2
            java.lang.Object r3 = r1.e
            android.view.View r3 = (android.view.View) r3
            r3.setTranslationY(r2)
        L2f:
            return
    }

    @Override // defpackage.bd
    public android.content.ClipData b() {
            r1 = this;
            java.lang.Object r0 = r1.b
            android.content.ClipData r0 = (android.content.ClipData) r0
            return r0
    }

    @Override // defpackage.zc
    public defpackage.cd build() {
            r2 = this;
            cd r0 = new cd
            ad r1 = new ad
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    @Override // defpackage.bd
    public int f() {
            r1 = this;
            int r0 = r1.d
            return r0
    }

    @Override // defpackage.bd
    public android.view.ContentInfo h() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.zc
    public void m(android.net.Uri r1) {
            r0 = this;
            r0.e = r1
            return
    }

    @Override // defpackage.bd
    public int o() {
            r1 = this;
            int r0 = r1.c
            return r0
    }

    @Override // defpackage.zc
    public void s(int r1) {
            r0 = this;
            r0.d = r1
            return
    }

    @Override // defpackage.zc
    public void setExtras(android.os.Bundle r1) {
            r0 = this;
            r0.f = r1
            return
    }

    public java.lang.String toString() {
            r5 = this;
            int r0 = r5.a
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = super.toString()
            return r0
        La:
            java.lang.Object r0 = r5.e
            android.net.Uri r0 = (android.net.Uri) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "ContentInfoCompat{clip="
            r1.<init>(r2)
            java.lang.Object r2 = r5.b
            android.content.ClipData r2 = (android.content.ClipData) r2
            android.content.ClipDescription r2 = r2.getDescription()
            r1.append(r2)
            java.lang.String r2 = ", source="
            r1.append(r2)
            int r2 = r5.c
            if (r2 == 0) goto L4c
            r3 = 1
            if (r2 == r3) goto L49
            r3 = 2
            if (r2 == r3) goto L46
            r3 = 3
            if (r2 == r3) goto L43
            r3 = 4
            if (r2 == r3) goto L40
            r3 = 5
            if (r2 == r3) goto L3d
            java.lang.String r2 = java.lang.String.valueOf(r2)
            goto L4e
        L3d:
            java.lang.String r2 = "SOURCE_PROCESS_TEXT"
            goto L4e
        L40:
            java.lang.String r2 = "SOURCE_AUTOFILL"
            goto L4e
        L43:
            java.lang.String r2 = "SOURCE_DRAG_AND_DROP"
            goto L4e
        L46:
            java.lang.String r2 = "SOURCE_INPUT_METHOD"
            goto L4e
        L49:
            java.lang.String r2 = "SOURCE_CLIPBOARD"
            goto L4e
        L4c:
            java.lang.String r2 = "SOURCE_APP"
        L4e:
            r1.append(r2)
            java.lang.String r2 = ", flags="
            r1.append(r2)
            int r2 = r5.d
            r3 = r2 & 1
            if (r3 == 0) goto L5f
            java.lang.String r2 = "FLAG_CONVERT_TO_PLAIN_TEXT"
            goto L63
        L5f:
            java.lang.String r2 = java.lang.String.valueOf(r2)
        L63:
            r1.append(r2)
            java.lang.String r2 = ""
            if (r0 != 0) goto L6c
            r0 = r2
            goto L87
        L6c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = ", hasLinkUri("
            r3.<init>(r4)
            java.lang.String r0 = r0.toString()
            int r0 = r0.length()
            r3.append(r0)
            java.lang.String r0 = ")"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
        L87:
            r1.append(r0)
            java.lang.Cloneable r0 = r5.f
            android.os.Bundle r0 = (android.os.Bundle) r0
            if (r0 != 0) goto L91
            goto L93
        L91:
            java.lang.String r2 = ", hasExtras"
        L93:
            java.lang.String r0 = "}"
            java.lang.String r0 = defpackage.z30.l(r1, r2, r0)
            return r0
    }
}
