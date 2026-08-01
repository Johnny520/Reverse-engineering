package p214;

import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.compose.ui.contentcapture.InterfaceC1419;
import androidx.core.os.AbstractC2175;
import p164.AbstractC7665;

/* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7953 implements InterfaceC1419 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final View f22023;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f22024;

    public C7953(ContentCaptureSession contentCaptureSession, View view) {
        this.f22024 = contentCaptureSession;
        this.f22023 = view;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AutofillId m13421(long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC2175.m3956(AbstractC7665.m12943(this.f22024), this.f22023.getAutofillId(), j);
        }
        return null;
    }
}
