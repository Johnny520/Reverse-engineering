package p006D;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;
import p017J.C0230s;

/* JADX INFO: renamed from: D.O */
/* JADX INFO: loaded from: classes.dex */
public final class OnReceiveContentListenerC0078O implements OnReceiveContentListener {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0123r f218a;

    public OnReceiveContentListenerC0078O(InterfaceC0123r interfaceC0123r) {
        this.f218a = interfaceC0123r;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        C0103h c0103h = new C0103h(new C0095d(contentInfo));
        C0103h c0103hM630a = ((C0230s) this.f218a).m630a(view, c0103h);
        if (c0103hM630a == null) {
            return null;
        }
        if (c0103hM630a == c0103h) {
            return contentInfo;
        }
        ContentInfo contentInfoMo354t = c0103hM630a.f270a.mo354t();
        Objects.requireNonNull(contentInfoMo354t);
        return AbstractC0093c.m330g(contentInfoMo354t);
    }
}
