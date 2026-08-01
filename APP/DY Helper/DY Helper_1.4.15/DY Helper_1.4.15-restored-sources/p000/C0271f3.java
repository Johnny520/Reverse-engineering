package p000;

/* JADX INFO: renamed from: f3 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0271f3 extends java.lang.ThreadLocal {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f3737;

    public /* synthetic */ C0271f3(int r1) {
            r0 = this;
            r0.f3737 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.ThreadLocal
    public final java.lang.Object initialValue() {
            r2 = this;
            int r2 = r2.f3737
            switch(r2) {
                case 0: goto L24;
                case 1: goto L11;
                case 2: goto Lb;
                default: goto L5;
            }
        L5:
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        Lb:
            java.util.Random r2 = new java.util.Random
            r2.<init>()
            return r2
        L11:
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            java.lang.String r0 = "EEE, dd MMM yyyy HH:mm:ss 'GMT'"
            java.util.Locale r1 = java.util.Locale.US
            r2.<init>(r0, r1)
            r0 = 0
            r2.setLenient(r0)
            java.util.TimeZone r0 = p000.ud2.f10709
            r2.setTimeZone(r0)
            return r2
        L24:
            h3 r2 = new h3
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r1 == 0) goto L3e
            android.os.Handler r1 = android.os.Handler.createAsync(r1)
            r2.<init>(r0, r1)
            k3 r0 = r2.f4555
            up r2 = p000.pd2.m4462(r2, r0)
            goto L44
        L3e:
            java.lang.String r2 = "no Looper on this thread"
            p000.C1080.m7279(r2)
            r2 = 0
        L44:
            return r2
    }
}
