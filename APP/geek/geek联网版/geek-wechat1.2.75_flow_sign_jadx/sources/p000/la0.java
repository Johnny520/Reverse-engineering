package p000;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class la0 implements OnReceiveContentListener {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0353ix f2978a;

    public la0(InterfaceC0353ix interfaceC0353ix) {
        this.f2978a = interfaceC0353ix;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        C0481md c0481md = new C0481md(new C0431l0(contentInfo));
        C0481md c0481mdM2544a = ((v60) this.f2978a).m2544a(view, c0481md);
        if (c0481mdM2544a == null) {
            return null;
        }
        if (c0481mdM2544a == c0481md) {
            return contentInfo;
        }
        ContentInfo contentInfoMo1679h = c0481mdM2544a.f3129a.mo1679h();
        Objects.requireNonNull(contentInfoMo1679h);
        return AbstractC0957z7.m2805h(contentInfoMo1679h);
    }
}
