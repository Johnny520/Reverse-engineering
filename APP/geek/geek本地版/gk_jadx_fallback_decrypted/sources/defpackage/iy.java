package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class iy implements defpackage.jy {
    public static defpackage.iy b;
    public final /* synthetic */ int a;

    public /* synthetic */ iy(int r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    public iy(androidx.recyclerview.widget.RecyclerView r1) {
            r0 = this;
            r1 = 4
            r0.a = r1
            r0.<init>()
            return
    }

    public static android.graphics.Path a(float r1, float r2, float r3, float r4) {
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r0.moveTo(r1, r2)
            r0.lineTo(r3, r4)
            return r0
    }

    private final void c() {
            r0 = this;
            return
    }

    private final void d(int r1, java.lang.Object r2) {
            r0 = this;
            return
    }

    public boolean b(java.lang.CharSequence r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // defpackage.jy
    public void g() {
            r2 = this;
            int r0 = r2.a
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = "DIAGNOSTIC_PROFILE_IS_COMPRESSED"
            java.lang.String r1 = "ProfileInstaller"
            android.util.Log.d(r1, r0)
        Lc:
            return
    }

    @Override // defpackage.jy
    public void i(int r4, java.lang.Object r5) {
            r3 = this;
            int r0 = r3.a
            switch(r0) {
                case 0: goto L3d;
                default: goto L5;
            }
        L5:
            switch(r4) {
                case 1: goto L26;
                case 2: goto L23;
                case 3: goto L20;
                case 4: goto L1d;
                case 5: goto L1a;
                case 6: goto L17;
                case 7: goto L14;
                case 8: goto L11;
                case 9: goto L8;
                case 10: goto Le;
                case 11: goto Lb;
                default: goto L8;
            }
        L8:
            java.lang.String r0 = ""
            goto L28
        Lb:
            java.lang.String r0 = "RESULT_DELETE_SKIP_FILE_SUCCESS"
            goto L28
        Le:
            java.lang.String r0 = "RESULT_INSTALL_SKIP_FILE_SUCCESS"
            goto L28
        L11:
            java.lang.String r0 = "RESULT_PARSE_EXCEPTION"
            goto L28
        L14:
            java.lang.String r0 = "RESULT_IO_EXCEPTION"
            goto L28
        L17:
            java.lang.String r0 = "RESULT_BASELINE_PROFILE_NOT_FOUND"
            goto L28
        L1a:
            java.lang.String r0 = "RESULT_DESIRED_FORMAT_UNSUPPORTED"
            goto L28
        L1d:
            java.lang.String r0 = "RESULT_NOT_WRITABLE"
            goto L28
        L20:
            java.lang.String r0 = "RESULT_UNSUPPORTED_ART_VERSION"
            goto L28
        L23:
            java.lang.String r0 = "RESULT_ALREADY_INSTALLED"
            goto L28
        L26:
            java.lang.String r0 = "RESULT_INSTALL_SUCCESS"
        L28:
            r1 = 6
            java.lang.String r2 = "ProfileInstaller"
            if (r4 == r1) goto L38
            r1 = 7
            if (r4 == r1) goto L38
            r1 = 8
            if (r4 == r1) goto L38
            android.util.Log.d(r2, r0)
            goto L3d
        L38:
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            android.util.Log.e(r2, r0, r5)
        L3d:
            return
    }
}
