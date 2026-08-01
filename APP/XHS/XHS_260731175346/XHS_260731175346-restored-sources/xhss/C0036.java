package xhss;

/* JADX INFO: renamed from: xhss.ᛱᛴᛳᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public class C0036 extends com.kongzue.dialogx.interfaces.AbstractC0001 {

    /* JADX INFO: renamed from: ᛱᛳᲁᲈ, reason: contains not printable characters */
    public xhss.C0036 f225;

    /* JADX INFO: renamed from: ᛱᲈᛳᛴ, reason: contains not printable characters */
    public xhss.C0935 f226;

    /* JADX INFO: renamed from: ᛲᛴᲀᲈ, reason: contains not printable characters */
    public xhss.C0614 f227;

    /* JADX INFO: renamed from: ᛲᛴᲇᛲ, reason: contains not printable characters */
    public java.lang.String f228;

    /* JADX INFO: renamed from: ᛳᛸᛵᲀ, reason: contains not printable characters */
    public java.lang.String f229;

    /* JADX INFO: renamed from: ᛵᛲᲁᛶ, reason: contains not printable characters */
    public float f230;

    /* JADX INFO: renamed from: ᛵᛷᛲᛸ, reason: contains not printable characters */
    public xhss.InterfaceC0719 f231;

    /* JADX INFO: renamed from: ᲀᛷᲁᲀ, reason: contains not printable characters */
    public xhss.AbstractC0954 f232;

    /* JADX INFO: renamed from: ᲁᛴᛴᛸ, reason: contains not printable characters */
    public java.lang.String f233;

    /* JADX INFO: renamed from: ᲁᛴᲇᛲ, reason: contains not printable characters */
    public boolean f234;

    /* JADX INFO: renamed from: ᲁᲁᛴᲁ, reason: contains not printable characters */
    public java.lang.String f235;

    /* JADX INFO: renamed from: ᛴᲀᛸᛵ, reason: contains not printable characters */
    public static xhss.C0036 m143(android.content.Context r2) {
            xhss.ᛱᛴᛳᛴ r0 = new xhss.ᛱᛴᛳᛴ
            r0.<init>()
            r1 = 1
            r0.f234 = r1
            r0.f225 = r0
            int r1 = xhss.AbstractC1069.f3454
            float r1 = (float) r1
            r0.f230 = r1
            r0.f87 = r2
            return r0
    }

    /* JADX INFO: renamed from: ᛱᛱᛴᲀ, reason: contains not printable characters */
    public xhss.C0935 mo144() {
            r0 = this;
            xhss.ᲁᛳᛵᛷ r0 = r0.f226
            return r0
    }

    /* JADX INFO: renamed from: ᛱᛲᛸᲇ, reason: contains not printable characters */
    public boolean mo145() {
            r0 = this;
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᛱᲁᛳᛲ, reason: contains not printable characters */
    public boolean mo146() {
            r0 = this;
            boolean r0 = r0.f86
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC0001
    /* JADX INFO: renamed from: ᛳᛸᛵᲀ */
    public final void mo52() {
            r4 = this;
            android.view.View r0 = r4.m59()
            if (r0 == 0) goto L10
            android.view.View r0 = r4.m59()
            com.kongzue.dialogx.interfaces.AbstractC0001.m42(r0)
            r0 = 0
            r4.f90 = r0
        L10:
            xhss.ᲁᛳᛵᛷ r0 = r4.mo144()
            android.widget.RelativeLayout r0 = r0.f3030
            if (r0 == 0) goto L21
            xhss.ᲁᛳᛵᛷ r0 = r4.mo144()
            android.widget.RelativeLayout r0 = r0.f3030
            r0.removeAllViews()
        L21:
            xhss.ᲁᛳᛵᛷ r0 = r4.mo144()
            android.view.ViewGroup r0 = r0.f3033
            if (r0 == 0) goto L32
            xhss.ᲁᛳᛵᛷ r0 = r4.mo144()
            android.view.ViewGroup r0 = r0.f3033
            r0.removeAllViews()
        L32:
            boolean r0 = r4.mo50()
            int r0 = r4.m65(r0)
            r1 = 1678442550(0x640b0036, float:1.025645E22)
            r2 = 1678442549(0x640b0035, float:1.0256449E22)
            if (r0 == 0) goto L4b
            boolean r0 = r4.mo50()
            int r0 = r4.m65(r0)
            goto L59
        L4b:
            boolean r0 = r4.mo50()
            xhss.ᛶᛵᲇᛸ r3 = r4.f95
            r3.getClass()
            if (r0 == 0) goto L58
            r0 = r2
            goto L59
        L58:
            r0 = r1
        L59:
            if (r0 != 0) goto L63
            boolean r0 = r4.mo50()
            if (r0 == 0) goto L64
            r1 = r2
            goto L64
        L63:
            r1 = r0
        L64:
            r2 = 0
            r4.f85 = r2
            android.view.View r0 = r4.m53(r1)
            xhss.ᲁᛳᛵᛷ r1 = new xhss.ᲁᛳᛵᛷ
            r1.<init>(r4, r0)
            r4.f226 = r1
            if (r0 == 0) goto L7a
            xhss.ᛱᛴᛳᛴ r4 = r4.f225
            r0.setTag(r4)
        L7a:
            com.kongzue.dialogx.interfaces.AbstractC0001.m32(r0)
            return
    }

    /* JADX INFO: renamed from: ᛴᛷᛵᛴ, reason: contains not printable characters */
    public xhss.C0036 mo147(java.lang.CharSequence r1) {
            r0 = this;
            java.lang.String r1 = (java.lang.String) r1
            r0.f233 = r1
            r0.mo148()
            return r0
    }

    /* JADX INFO: renamed from: ᛴᲈᲀᲀ, reason: contains not printable characters */
    public void mo148() {
            r2 = this;
            xhss.ᲁᛳᛵᛷ r0 = r2.mo144()
            if (r0 != 0) goto L7
            return
        L7:
            xhss.ᲇᛶᲈᛸ r0 = new xhss.ᲇᛶᲈᛸ
            r1 = 0
            r0.<init>(r2, r1)
            com.kongzue.dialogx.interfaces.AbstractC0001.m43(r0)
            return
    }

    /* JADX INFO: renamed from: ᛶᲀᛵᲇ, reason: contains not printable characters */
    public final void m149(android.content.Context r5) {
            r4 = this;
            r4.f87 = r5
            r4.m49()
            android.view.View r0 = r4.m59()
            if (r0 != 0) goto L7d
            boolean r0 = r4.mo50()
            int r0 = r4.m65(r0)
            r1 = 1678442550(0x640b0036, float:1.025645E22)
            r2 = 1678442549(0x640b0035, float:1.0256449E22)
            if (r0 == 0) goto L24
            boolean r0 = r4.mo50()
            int r0 = r4.m65(r0)
            goto L32
        L24:
            boolean r0 = r4.mo50()
            xhss.ᛶᛵᲇᛸ r3 = r4.f95
            r3.getClass()
            if (r0 == 0) goto L31
            r0 = r2
            goto L32
        L31:
            r0 = r1
        L32:
            if (r0 != 0) goto L3c
            boolean r0 = r4.mo50()
            if (r0 == 0) goto L3d
            r1 = r2
            goto L3d
        L3c:
            r1 = r0
        L3d:
            boolean r0 = r4.m61()
            r2 = 0
            if (r0 == 0) goto L5e
            android.app.Activity r0 = r4.m54()
            if (r0 != 0) goto L50
            java.lang.String r5 = "DialogX 未初始化(E3)。\n请检查是否在启动对话框前进行初始化操作，使用以下代码进行初始化：\nDialogX.init(context);\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX"
            com.kongzue.dialogx.interfaces.AbstractC0001.m40(r5)
            goto L6b
        L50:
            android.content.Context r0 = r4.f87
            if (r0 == 0) goto L55
            r5 = r0
        L55:
            android.view.LayoutInflater r5 = xhss.AbstractC0968.m1604(r5)
            android.view.View r2 = r5.inflate(r1, r2)
            goto L6b
        L5e:
            android.content.Context r0 = r4.f87
            if (r0 == 0) goto L63
            r5 = r0
        L63:
            android.view.LayoutInflater r5 = xhss.AbstractC0968.m1604(r5)
            android.view.View r2 = r5.inflate(r1, r2)
        L6b:
            xhss.ᲁᛳᛵᛷ r5 = new xhss.ᲁᛳᛵᛷ
            r5.<init>(r4, r2)
            r4.f226 = r5
            if (r2 == 0) goto L79
            xhss.ᛱᛴᛳᛴ r4 = r4.f225
            r2.setTag(r4)
        L79:
            com.kongzue.dialogx.interfaces.AbstractC0001.m32(r2)
            return
        L7d:
            android.view.View r4 = r4.m59()
            com.kongzue.dialogx.interfaces.AbstractC0001.m32(r4)
            return
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC0001
    /* JADX INFO: renamed from: ᛷᛴᛷᛱ */
    public java.lang.String mo56() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.Class r1 = r2.getClass()
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

    /* JADX INFO: renamed from: ᛷᛸᛷ, reason: contains not printable characters */
    public xhss.C0036 mo150(java.lang.CharSequence r1, xhss.InterfaceC0826 r2) {
            r0 = this;
            java.lang.String r1 = (java.lang.String) r1
            r0.f229 = r1
            r0.f231 = r2
            r0.mo148()
            return r0
    }

    /* JADX INFO: renamed from: ᲁᛲᲈᛵ, reason: contains not printable characters */
    public final void m151() {
            r4 = this;
            r4.m49()
            android.view.View r0 = r4.m59()
            if (r0 != 0) goto L51
            boolean r0 = r4.mo50()
            int r0 = r4.m65(r0)
            r1 = 1678442550(0x640b0036, float:1.025645E22)
            r2 = 1678442549(0x640b0035, float:1.0256449E22)
            if (r0 == 0) goto L22
            boolean r0 = r4.mo50()
            int r0 = r4.m65(r0)
            goto L30
        L22:
            boolean r0 = r4.mo50()
            xhss.ᛶᛵᲇᛸ r3 = r4.f95
            r3.getClass()
            if (r0 == 0) goto L2f
            r0 = r2
            goto L30
        L2f:
            r0 = r1
        L30:
            if (r0 != 0) goto L3a
            boolean r0 = r4.mo50()
            if (r0 == 0) goto L3b
            r1 = r2
            goto L3b
        L3a:
            r1 = r0
        L3b:
            android.view.View r0 = r4.m53(r1)
            xhss.ᲁᛳᛵᛷ r1 = new xhss.ᲁᛳᛵᛷ
            r1.<init>(r4, r0)
            r4.f226 = r1
            if (r0 == 0) goto L4d
            xhss.ᛱᛴᛳᛴ r4 = r4.f225
            r0.setTag(r4)
        L4d:
            com.kongzue.dialogx.interfaces.AbstractC0001.m32(r0)
            return
        L51:
            android.view.View r4 = r4.m59()
            com.kongzue.dialogx.interfaces.AbstractC0001.m32(r4)
            return
    }
}
