package defpackage;

/* JADX INFO: renamed from: ᛶᛸᲀᛸ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C1131 extends defpackage.AbstractC1191 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final java.util.ArrayList f5024;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final java.text.SimpleDateFormat f5025;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final defpackage.C1557 f5026;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C1977 f5027;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C1684 f5028;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final android.content.Context f5029;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public boolean f5030;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.C1772 f5031;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final defpackage.C1772 f5032;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final defpackage.C0516 f5033;

    static {
            r0 = 43
            com.android.NativeUtil.classesInit0(r0)
            return
    }

    public C1131(android.content.Context r3, defpackage.C1772 r4, defpackage.C1684 r5, defpackage.C1977 r6, defpackage.C1557 r7, defpackage.C1772 r8, defpackage.C0516 r9) {
            r2 = this;
            r0 = -1111417561718318(0xfffc0d2bef0961d2, double:NaN)
            r0 = -1111451921456686(0xfffc0d23ef0961d2, double:NaN)
            r0 = -1111503461064238(0xfffc0d17ef0961d2, double:NaN)
            r0 = -1111572180540974(0xfffc0d07ef0961d2, double:NaN)
            r0 = -1111623720148526(0xfffc0cfbef0961d2, double:NaN)
            r0 = -1111683849690670(0xfffc0cedef0961d2, double:NaN)
            r2.<init>()
            r2.f5029 = r3
            r2.f5031 = r4
            r2.f5028 = r5
            r2.f5027 = r6
            r2.f5026 = r7
            r2.f5032 = r8
            r2.f5033 = r9
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.f5024 = r3
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat
            r4 = -1111739684265518(0xfffc0ce0ef0961d2, double:NaN)
            java.lang.String r4 = "yyyy-MM-dd HH:mm:ss"
            java.util.Locale r5 = java.util.Locale.getDefault()
            r3.<init>(r4, r5)
            r2.f5025 = r3
            return
    }

    @Override // defpackage.AbstractC1191
    public final native int getItemCount();

    @Override // defpackage.AbstractC1191
    public final native void onBindViewHolder(defpackage.AbstractC2316 r1, int r2);

    @Override // defpackage.AbstractC1191
    public final native defpackage.AbstractC2316 onCreateViewHolder(android.view.ViewGroup r1, int r2);
}
