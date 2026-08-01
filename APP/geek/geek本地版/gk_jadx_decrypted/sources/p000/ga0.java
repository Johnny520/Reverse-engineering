package p000;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ga0 implements OnReceiveContentListener {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0047ax f2048a;

    public ga0(InterfaceC0047ax interfaceC0047ax) {
        this.f2048a = interfaceC0047ax;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        C0100cd c0100cd = new C0100cd(new C0431l0(contentInfo));
        C0100cd c0100cdM2045a = ((p60) this.f2048a).m2045a(view, c0100cd);
        if (c0100cdM2045a == null) {
            return null;
        }
        if (c0100cdM2045a == c0100cd) {
            return contentInfo;
        }
        ContentInfo contentInfoMo90h = c0100cdM2045a.f951a.mo90h();
        Objects.requireNonNull(contentInfoMo90h);
        return AbstractC0587p7.m2053h(contentInfoMo90h);
    }
}
