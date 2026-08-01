package defpackage;

/* JADX INFO: renamed from: ᛱᲁᛲᛸ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C0177 extends defpackage.AbstractC1191 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public int f1208;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C1038 f1209;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C1038 f1210;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.util.ArrayList f1211;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.C1290 f1212;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final java.text.SimpleDateFormat f1213;

    static {
            r0 = 121(0x79, float:1.7E-43)
            com.android.NativeUtil.classesInit0(r0)
            return
    }

    public C0177(java.util.ArrayList r3, defpackage.C1290 r4, defpackage.C1038 r5, defpackage.C1038 r6) {
            r2 = this;
            r0 = -119048188108334(0xffff93b9ef0961d2, double:NaN)
            r0 = -119073957912110(0xffff93b3ef0961d2, double:NaN)
            r0 = -119125497519662(0xffff93a7ef0961d2, double:NaN)
            r0 = -119185627061806(0xffff9399ef0961d2, double:NaN)
            r2.<init>()
            r2.f1211 = r3
            r2.f1212 = r4
            r2.f1210 = r5
            r2.f1209 = r6
            r3 = -1
            r2.f1208 = r3
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat
            r4 = -119245756603950(0xffff938bef0961d2, double:NaN)
            java.lang.String r4 = "MM-dd HH:mm"
            java.util.Locale r5 = java.util.Locale.getDefault()
            r3.<init>(r4, r5)
            r2.f1213 = r3
            return
    }

    @Override // defpackage.AbstractC1191
    public final native int getItemCount();

    @Override // defpackage.AbstractC1191
    public final native void onBindViewHolder(defpackage.AbstractC2316 r1, int r2);

    @Override // defpackage.AbstractC1191
    public final native defpackage.AbstractC2316 onCreateViewHolder(android.view.ViewGroup r1, int r2);

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final native void m710(int r1);
}
