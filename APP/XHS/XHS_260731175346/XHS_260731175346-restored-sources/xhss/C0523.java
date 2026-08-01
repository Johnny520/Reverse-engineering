package xhss;

/* JADX INFO: renamed from: xhss.ᛵᲇᲀᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0523 extends com.kongzue.dialogx.interfaces.AbstractC0001 {

    /* JADX INFO: renamed from: ᛱᛱᛴᲀ, reason: contains not printable characters */
    public xhss.C0158 f1897;

    /* JADX INFO: renamed from: ᛱᛳᲁᲈ, reason: contains not printable characters */
    public java.lang.String f1898;

    /* JADX INFO: renamed from: ᛱᲈᛳᛴ, reason: contains not printable characters */
    public xhss.C0584 f1899;

    /* JADX INFO: renamed from: ᛲᛴᲀᲈ, reason: contains not printable characters */
    public java.lang.String f1900;

    /* JADX INFO: renamed from: ᛲᛴᲇᛲ, reason: contains not printable characters */
    public boolean f1901;

    /* JADX INFO: renamed from: ᛳᛸᛵᲀ, reason: contains not printable characters */
    public boolean f1902;

    /* JADX INFO: renamed from: ᛴᲀᛸᛵ, reason: contains not printable characters */
    public xhss.C0523 f1903;

    /* JADX INFO: renamed from: ᛵᛲᲁᛶ, reason: contains not printable characters */
    public xhss.C0614 f1904;

    /* JADX INFO: renamed from: ᛵᛷᛲᛸ, reason: contains not printable characters */
    public boolean f1905;

    /* JADX INFO: renamed from: ᛸᛴᛸᛲ, reason: contains not printable characters */
    public xhss.C0584 f1906;

    /* JADX INFO: renamed from: ᲀᛷᲁᲀ, reason: contains not printable characters */
    public java.lang.String f1907;

    /* JADX INFO: renamed from: ᲁᛴᛴᛸ, reason: contains not printable characters */
    public float f1908;

    /* JADX INFO: renamed from: ᲁᛴᲇᛲ, reason: contains not printable characters */
    public xhss.AbstractC0954 f1909;

    /* JADX INFO: renamed from: ᲁᛷᲇᲇ, reason: contains not printable characters */
    public xhss.C0584 f1910;

    /* JADX INFO: renamed from: ᲁᲁᛴᲁ, reason: contains not printable characters */
    public xhss.C0125 f1911;

    /* JADX INFO: renamed from: ᛴᲀᛸᛵ, reason: contains not printable characters */
    public static xhss.C0523 m931(android.content.Context r3) {
            xhss.ᛵᲇᲀᛳ r0 = new xhss.ᛵᲇᲀᛳ
            r0.<init>()
            r1 = 1
            r0.f1901 = r1
            r0.f1902 = r1
            int r2 = xhss.AbstractC1069.f3450
            float r2 = (float) r2
            r0.f1908 = r2
            r0.f1905 = r1
            xhss.ᛶᛸᛸᛵ r2 = new xhss.ᛶᛸᛸᛵ
            r2.<init>()
            r2.f2038 = r1
            r0.f1899 = r2
            xhss.ᛶᛸᛸᛵ r2 = new xhss.ᛶᛸᛸᛵ
            r2.<init>()
            r2.f2038 = r1
            r0.f1906 = r2
            xhss.ᛶᛸᛸᛵ r2 = new xhss.ᛶᛸᛸᛵ
            r2.<init>()
            r2.f2038 = r1
            r0.f1910 = r2
            r0.f1903 = r0
            r0.f87 = r3
            return r0
    }

    /* JADX INFO: renamed from: ᛱᛱᛴᲀ, reason: contains not printable characters */
    public final void m932() {
            r2 = this;
            xhss.ᛲᛲᛶ r0 = new xhss.ᛲᛲᛶ
            r1 = 1
            r0.<init>(r2, r1)
            com.kongzue.dialogx.interfaces.AbstractC0001.m43(r0)
            return
    }

    /* JADX INFO: renamed from: ᛱᛲᛸᲇ, reason: contains not printable characters */
    public final void m933() {
            r2 = this;
            xhss.ᛲᛵᛶᲁ r0 = r2.f1897
            if (r0 != 0) goto L5
            return
        L5:
            xhss.ᛲᛲᛶ r0 = new xhss.ᛲᛲᛶ
            r1 = 0
            r0.<init>(r2, r1)
            com.kongzue.dialogx.interfaces.AbstractC0001.m43(r0)
            return
    }

    /* JADX INFO: renamed from: ᛱᲁᛳᛲ, reason: contains not printable characters */
    public final boolean m934() {
            r1 = this;
            xhss.ᛶᛵᲇᛸ r0 = r1.f95
            r0.getClass()
            boolean r1 = r1.f1901
            if (r1 == 0) goto Lb
            r1 = 1
            return r1
        Lb:
            r1 = 0
            return r1
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC0001
    /* JADX INFO: renamed from: ᛳᛸᛵᲀ */
    public final void mo52() {
            r3 = this;
            android.view.View r0 = r3.m59()
            if (r0 == 0) goto L10
            android.view.View r0 = r3.m59()
            com.kongzue.dialogx.interfaces.AbstractC0001.m42(r0)
            r0 = 0
            r3.f90 = r0
        L10:
            xhss.ᛲᛵᛶᲁ r0 = r3.f1897
            android.widget.RelativeLayout r0 = r0.f658
            if (r0 == 0) goto L19
            r0.removeAllViews()
        L19:
            xhss.ᛲᛵᛶᲁ r0 = r3.f1897
            android.view.ViewGroup r0 = r0.f652
            if (r0 == 0) goto L22
            r0.removeAllViews()
        L22:
            r3.mo50()
            xhss.ᛶᛵᲇᛸ r0 = r3.f95
            r0.getClass()
            r0.getClass()
            boolean r0 = r3.mo50()
            if (r0 == 0) goto L37
            r0 = 1678442543(0x640b002f, float:1.0256443E22)
            goto L3a
        L37:
            r0 = 1678442544(0x640b0030, float:1.0256444E22)
        L3a:
            boolean r1 = r3.mo50()
            int r1 = r3.m65(r1)
            if (r1 == 0) goto L4c
            boolean r0 = r3.mo50()
            int r0 = r3.m65(r0)
        L4c:
            r1 = 0
            r3.f85 = r1
            android.view.View r0 = r3.m53(r0)
            xhss.ᛲᛵᛶᲁ r1 = new xhss.ᛲᛵᛶᲁ
            r1.<init>(r3, r0)
            r3.f1897 = r1
            if (r0 == 0) goto L62
            xhss.ᛵᲇᲀᛳ r3 = r3.f1903
            r0.setTag(r3)
        L62:
            com.kongzue.dialogx.interfaces.AbstractC0001.m32(r0)
            return
    }

    /* JADX INFO: renamed from: ᛴᲈᲀᲀ, reason: contains not printable characters */
    public final void m935() {
            r2 = this;
            r2.m49()
            android.view.View r0 = r2.m59()
            if (r0 != 0) goto L46
            r2.mo50()
            xhss.ᛶᛵᲇᛸ r0 = r2.f95
            r0.getClass()
            boolean r0 = r2.mo50()
            if (r0 == 0) goto L1b
            r0 = 1678442543(0x640b002f, float:1.0256443E22)
            goto L1e
        L1b:
            r0 = 1678442544(0x640b0030, float:1.0256444E22)
        L1e:
            boolean r1 = r2.mo50()
            int r1 = r2.m65(r1)
            if (r1 == 0) goto L30
            boolean r0 = r2.mo50()
            int r0 = r2.m65(r0)
        L30:
            android.view.View r0 = r2.m53(r0)
            xhss.ᛲᛵᛶᲁ r1 = new xhss.ᛲᛵᛶᲁ
            r1.<init>(r2, r0)
            r2.f1897 = r1
            if (r0 == 0) goto L42
            xhss.ᛵᲇᲀᛳ r2 = r2.f1903
            r0.setTag(r2)
        L42:
            com.kongzue.dialogx.interfaces.AbstractC0001.m32(r0)
            return
        L46:
            android.view.View r2 = r2.m59()
            com.kongzue.dialogx.interfaces.AbstractC0001.m32(r2)
            return
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC0001
    /* JADX INFO: renamed from: ᛷᛴᛷᛱ */
    public final java.lang.String mo56() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.Class<xhss.ᛵᲇᲀᛳ> r1 = xhss.C0523.class
            java.lang.String r1 = r1.getSimpleName()
            r0.<init>(r1)
            java.lang.String r1 = "("
            r0.append(r1)
            int r2 = r2.hashCode()
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
