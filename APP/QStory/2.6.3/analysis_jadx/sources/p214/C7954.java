package p214;

import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.compose.ui.contentcapture.InterfaceC1419;
import androidx.core.os.AbstractC2175;
import p164.AbstractC7666;

/* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7954 implements InterfaceC1419 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final View f22020;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f22021;

    public C7954(ContentCaptureSession contentCaptureSession, View view) {
        this.f22021 = contentCaptureSession;
        this.f22020 = view;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AutofillId m13449(long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC2175.m3966(AbstractC7666.m12972(this.f22021), this.f22020.getAutofillId(), j);
        }
        return null;
    }
}
