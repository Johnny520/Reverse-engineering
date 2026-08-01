package androidx.compose.ui.platform;

import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import androidx.compose.ui.contentcapture.InterfaceC1419;
import androidx.core.os.AbstractC2173;
import androidx.core.os.AbstractC2175;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p052.InterfaceC6543;
import p052.InterfaceC6558;
import p214.C7954;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class AndroidComposeView$contentCaptureManager$1 extends FunctionReferenceImpl implements InterfaceC6543 {
    public AndroidComposeView$contentCaptureManager$1(Object obj) {
        super(0, obj, AbstractC1836.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1);
    }

    @Override // p052.InterfaceC6543
    public final InterfaceC1419 invoke() {
        ContentCaptureSession contentCaptureSessionM3968;
        View view = (View) this.receiver;
        InterfaceC6558 interfaceC6558 = AbstractC1836.f5338;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            AbstractC2173.m3957(view);
        }
        if (i < 29 || (contentCaptureSessionM3968 = AbstractC2175.m3968(view)) == null) {
            return null;
        }
        return new C7954(contentCaptureSessionM3968, view);
    }
}
