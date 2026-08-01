package androidx.compose.ui.platform;

import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import androidx.compose.ui.contentcapture.InterfaceC1419;
import androidx.core.os.AbstractC2173;
import androidx.core.os.AbstractC2175;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p052.InterfaceC6542;
import p052.InterfaceC6557;
import p214.C7953;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class AndroidComposeView$contentCaptureManager$1 extends FunctionReferenceImpl implements InterfaceC6542 {
    public AndroidComposeView$contentCaptureManager$1(Object obj) {
        super(0, obj, AbstractC1836.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1);
    }

    @Override // p052.InterfaceC6542
    public final InterfaceC1419 invoke() {
        ContentCaptureSession contentCaptureSessionM3958;
        View view = (View) this.receiver;
        InterfaceC6557 interfaceC6557 = AbstractC1836.f5337;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            AbstractC2173.m3947(view);
        }
        if (i < 29 || (contentCaptureSessionM3958 = AbstractC2175.m3958(view)) == null) {
            return null;
        }
        return new C7953(contentCaptureSessionM3958, view);
    }
}
