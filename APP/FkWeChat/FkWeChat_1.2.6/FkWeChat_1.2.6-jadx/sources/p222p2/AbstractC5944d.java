package p222p2;

import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import p191n1.InterfaceC5486o;

/* JADX INFO: renamed from: p2.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5944d {

    /* JADX INFO: renamed from: p2.d$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static AutofillId m23901a(View view) {
            return view.getAutofillId();
        }
    }

    /* JADX INFO: renamed from: p2.d$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static ContentCaptureSession m23902a(View view) {
            return view.getContentCaptureSession();
        }
    }

    /* JADX INFO: renamed from: p2.d$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class c {
        /* JADX INFO: renamed from: a */
        public static void m23903a(View view, int i10) {
            view.setImportantForContentCapture(i10);
        }
    }

    /* JADX INFO: renamed from: a */
    public static C5941a m23898a(View view) {
        return C5941a.m23888b(a.m23901a(view));
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC5486o m23899b(View view) {
        ContentCaptureSession contentCaptureSessionM23902a;
        if (Build.VERSION.SDK_INT < 29 || (contentCaptureSessionM23902a = b.m23902a(view)) == null) {
            return null;
        }
        return C5943c.m23891f(contentCaptureSessionM23902a, view);
    }

    /* JADX INFO: renamed from: c */
    public static void m23900c(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 30) {
            c.m23903a(view, i10);
        }
    }
}
