package androidx.compose.p001ui.platform;

import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import androidx.compose.p001ui.contentcapture.InterfaceC2254;
import androidx.core.os.AbstractC3006;
import androidx.core.os.AbstractC3008;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p068.InterfaceC7372;
import p068.InterfaceC7387;
import p230.C8783;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final /* synthetic */ class AndroidComposeView$contentCaptureManager$1 extends FunctionReferenceImpl implements InterfaceC7372 {
    public AndroidComposeView$contentCaptureManager$1(Object obj) {
        super(0, obj, AbstractC2671.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1);
    }

    @Override // p068.InterfaceC7372
    public final InterfaceC2254 invoke() {
        ContentCaptureSession contentCaptureSessionM4528;
        View view = (View) this.receiver;
        InterfaceC7387 interfaceC7387 = AbstractC2671.f5683;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            AbstractC3006.m4517(view);
        }
        if (i < 29 || (contentCaptureSessionM4528 = AbstractC3008.m4528(view)) == null) {
            return null;
        }
        return new C8783(contentCaptureSessionM4528, view);
    }
}
