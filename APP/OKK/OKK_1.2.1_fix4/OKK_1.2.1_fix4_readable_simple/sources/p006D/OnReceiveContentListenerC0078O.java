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

    public OnReceiveContentListenerC0078O(InterfaceC0123r r1) {
        this.f218a = r1;
    }

    public final ContentInfo onReceiveContent(View r3, ContentInfo r4) {
        C0103h r02 = new C0103h(new C0095d(r4));
        C0103h r32 = ((C0230s) this.f218a).m630a(r3, r02);
        if (r32 != null) goto L6;
        return null;
    L6:
        if (r32 != r02) goto L8;
        return r4;
    L8:
        ContentInfo r33 = r32.f270a.mo354t();
        Objects.requireNonNull(r33);
        return AbstractC0093c.m330g(r33);
    }
}
