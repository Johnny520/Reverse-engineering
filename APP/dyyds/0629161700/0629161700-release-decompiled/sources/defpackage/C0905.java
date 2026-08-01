package defpackage;

/* JADX INFO: renamed from: ᛵᛶᛱᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0905 implements defpackage.InterfaceC0674, defpackage.InterfaceC0783 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public android.os.Bundle f4116;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public int f4117;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public android.content.ClipData f4118;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f4119;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public int f4120;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public android.net.Uri f4121;

    public /* synthetic */ C0905() {
            r1 = this;
            r0 = 0
            r1.f4119 = r0
            r1.<init>()
            return
    }

    public C0905(defpackage.C0905 r5) {
            r4 = this;
            r0 = 1
            r4.f4119 = r0
            r4.<init>()
            android.content.ClipData r1 = r5.f4118
            r1.getClass()
            r4.f4118 = r1
            int r1 = r5.f4117
            r2 = 0
            if (r1 < 0) goto L59
            r3 = 5
            if (r1 > r3) goto L51
            r4.f4117 = r1
            int r1 = r5.f4120
            r2 = r1 & 1
            if (r2 != r1) goto L28
            r4.f4120 = r1
            android.net.Uri r0 = r5.f4121
            r4.f4121 = r0
            android.os.Bundle r5 = r5.f4116
            r4.f4116 = r5
            return
        L28:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = java.lang.Integer.toHexString(r1)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Requested flags 0x"
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r5 = ", but only 0x"
            r1.append(r5)
            r1.append(r0)
            java.lang.String r5 = " are allowed"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r4.<init>(r5)
            throw r4
        L51:
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r4 = "source is out of range of [0, 5] (too high)"
            defpackage.C2264.m3684(r4)
            throw r2
        L59:
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r4 = "source is out of range of [0, 5] (too low)"
            defpackage.C2264.m3684(r4)
            throw r2
    }

    @Override // defpackage.InterfaceC0674
    public defpackage.C0406 build() {
            r2 = this;
            ᛳᛱᛴᛸ r0 = new ᛳᛱᛴᛸ
            ᛵᛶᛱᛲ r1 = new ᛵᛶᛱᛲ
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    @Override // defpackage.InterfaceC0783
    public int getSource() {
            r0 = this;
            int r0 = r0.f4117
            return r0
    }

    @Override // defpackage.InterfaceC0674
    public void setExtras(android.os.Bundle r1) {
            r0 = this;
            r0.f4116 = r1
            return
    }

    public java.lang.String toString() {
            r5 = this;
            int r0 = r5.f4119
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r5 = super.toString()
            return r5
        La:
            android.net.Uri r0 = r5.f4121
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "ContentInfoCompat{clip="
            r1.<init>(r2)
            android.content.ClipData r2 = r5.f4118
            android.content.ClipDescription r2 = r2.getDescription()
            r1.append(r2)
            java.lang.String r2 = ", source="
            r1.append(r2)
            int r2 = r5.f4117
            if (r2 == 0) goto L48
            r3 = 1
            if (r2 == r3) goto L45
            r3 = 2
            if (r2 == r3) goto L42
            r3 = 3
            if (r2 == r3) goto L3f
            r3 = 4
            if (r2 == r3) goto L3c
            r3 = 5
            if (r2 == r3) goto L39
            java.lang.String r2 = java.lang.String.valueOf(r2)
            goto L4a
        L39:
            java.lang.String r2 = "SOURCE_PROCESS_TEXT"
            goto L4a
        L3c:
            java.lang.String r2 = "SOURCE_AUTOFILL"
            goto L4a
        L3f:
            java.lang.String r2 = "SOURCE_DRAG_AND_DROP"
            goto L4a
        L42:
            java.lang.String r2 = "SOURCE_INPUT_METHOD"
            goto L4a
        L45:
            java.lang.String r2 = "SOURCE_CLIPBOARD"
            goto L4a
        L48:
            java.lang.String r2 = "SOURCE_APP"
        L4a:
            r1.append(r2)
            java.lang.String r2 = ", flags="
            r1.append(r2)
            int r2 = r5.f4120
            r3 = r2 & 1
            if (r3 == 0) goto L5b
            java.lang.String r2 = "FLAG_CONVERT_TO_PLAIN_TEXT"
            goto L5f
        L5b:
            java.lang.String r2 = java.lang.String.valueOf(r2)
        L5f:
            r1.append(r2)
            java.lang.String r2 = ""
            if (r0 != 0) goto L68
            r0 = r2
            goto L83
        L68:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = ", hasLinkUri("
            r3.<init>(r4)
            java.lang.String r0 = r0.toString()
            int r0 = r0.length()
            r3.append(r0)
            java.lang.String r0 = ")"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
        L83:
            r1.append(r0)
            android.os.Bundle r5 = r5.f4116
            if (r5 != 0) goto L8b
            goto L8d
        L8b:
            java.lang.String r2 = ", hasExtras"
        L8d:
            r1.append(r2)
            java.lang.String r5 = "}"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            return r5
    }

    @Override // defpackage.InterfaceC0674
    /* JADX INFO: renamed from: ᛲᲈᛷᛵ */
    public void mo1520(int r1) {
            r0 = this;
            r0.f4120 = r1
            return
    }

    @Override // defpackage.InterfaceC0674
    /* JADX INFO: renamed from: ᛴᛸᲈᲈ */
    public void mo1521(android.net.Uri r1) {
            r0 = this;
            r0.f4121 = r1
            return
    }

    @Override // defpackage.InterfaceC0783
    /* JADX INFO: renamed from: ᛶᛷᛱᲀ */
    public int mo1703() {
            r0 = this;
            int r0 = r0.f4120
            return r0
    }

    @Override // defpackage.InterfaceC0783
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public android.content.ClipData mo1704() {
            r0 = this;
            android.content.ClipData r0 = r0.f4118
            return r0
    }

    @Override // defpackage.InterfaceC0783
    /* JADX INFO: renamed from: ᲇᲀᛲᛱ */
    public android.view.ContentInfo mo1705() {
            r0 = this;
            r0 = 0
            return r0
    }
}
