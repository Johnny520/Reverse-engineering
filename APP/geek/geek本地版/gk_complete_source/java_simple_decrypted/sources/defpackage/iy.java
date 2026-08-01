package defpackage;

import android.graphics.Path;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public class iy implements jy {
    public static iy b;
    public final /* synthetic */ int a;

    public /* synthetic */ iy(int r1) {
        this.a = r1;
    }

    public static Path a(float r1, float r2, float r3, float r4) {
        Path r0 = new Path();
        r0.moveTo(r1, r2);
        r0.lineTo(r3, r4);
        return r0;
    }

    public boolean b(CharSequence r1) {
        return false;
    }

    @Override // defpackage.jy
    public void g() {
        switch(this.a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
        return;
    }

    @Override // defpackage.jy
    public void i(int r4, Object r5) {
        switch(this.a) {
            case 0: goto L25;
            default: goto L4;
        };
    L4:
        switch(r4) {
            case 1: goto L15;
            case 2: goto L14;
            case 3: goto L13;
            case 4: goto L12;
            case 5: goto L11;
            case 6: goto L10;
            case 7: goto L9;
            case 8: goto L8;
            case 9: goto L5;
            case 10: goto L7;
            case 11: goto L6;
            default: goto L5;
        };
    L5:
        String r0 = "";
    L17:
        if (r4 != 6) goto L19;
    L23:
        Log.e("ProfileInstaller", r0, (Throwable) r5);
        return;
    L19:
        if (r4 == 7) goto L23;
        if (r4 == 8) goto L23;
        Log.d("ProfileInstaller", r0);
        return;
    L6:
        r0 = "RESULT_DELETE_SKIP_FILE_SUCCESS";
        goto L17
    L7:
        r0 = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
        goto L17
    L8:
        r0 = "RESULT_PARSE_EXCEPTION";
        goto L17
    L9:
        r0 = "RESULT_IO_EXCEPTION";
        goto L17
    L10:
        r0 = "RESULT_BASELINE_PROFILE_NOT_FOUND";
        goto L17
    L11:
        r0 = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
        goto L17
    L12:
        r0 = "RESULT_NOT_WRITABLE";
        goto L17
    L13:
        r0 = "RESULT_UNSUPPORTED_ART_VERSION";
        goto L17
    L14:
        r0 = "RESULT_ALREADY_INSTALLED";
        goto L17
    L15:
        r0 = "RESULT_INSTALL_SUCCESS";
        goto L17
    }

    public iy(RecyclerView r1) {
        this.a = 4;
    }

    private final void c() {
    }

    private final void d(int r1, Object r2) {
    }
}
