package p099y;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;
import p004C.C0066j;
import p006D.C0092u;

/* JADX INFO: renamed from: y.I */
/* JADX INFO: loaded from: classes.dex */
public final class OnReceiveContentListenerC1045I implements OnReceiveContentListener {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1085q f3657a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public OnReceiveContentListenerC1045I(InterfaceC1085q interfaceC1085q) {
        this.f3657a = interfaceC1085q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        C1074g c1074g = new C1074g(new C0066j(contentInfo));
        C1074g c1074gM241a = ((C0092u) this.f3657a).m241a(view, c1074g);
        if (c1074gM241a == null) {
            return null;
        }
        if (c1074gM241a == c1074g) {
            return contentInfo;
        }
        ContentInfo contentInfoMo148t = c1074gM241a.f3703a.mo148t();
        Objects.requireNonNull(contentInfoMo148t);
        return AbstractC1066c.m2333e(contentInfoMo148t);
    }
}
