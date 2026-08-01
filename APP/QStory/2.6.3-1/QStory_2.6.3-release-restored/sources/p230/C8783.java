package p230;

import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.compose.p001ui.contentcapture.InterfaceC2254;
import androidx.core.os.AbstractC3008;
import p180.AbstractC8495;

/* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8783 implements InterfaceC2254 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final View f22365;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f22366;

    public C8783(ContentCaptureSession contentCaptureSession, View view) {
        this.f22366 = contentCaptureSession;
        this.f22365 = view;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AutofillId m14008(long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC3008.m4526(AbstractC8495.m13531(this.f22366), this.f22365.getAutofillId(), j);
        }
        return null;
    }
}
