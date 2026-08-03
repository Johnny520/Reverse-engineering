package p000;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.InputStream;

/* JADX INFO: renamed from: J5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0393J5 implements InterfaceC2819zw, InterfaceC1233bs {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1329a;

    /* JADX INFO: renamed from: b */
    public final Resources f1330b;

    public /* synthetic */ C0393J5(Resources resources, int i) {
        this.f1329a = i;
        this.f1330b = resources;
    }

    @Override // p000.InterfaceC2819zw
    /* JADX INFO: renamed from: i */
    public InterfaceC2389pw mo660i(InterfaceC2389pw interfaceC2389pw, C2644vt c2644vt) {
        if (interfaceC2389pw == null) {
            return null;
        }
        return new C0608O5(this.f1330b, interfaceC2389pw);
    }

    @Override // p000.InterfaceC1233bs
    /* JADX INFO: renamed from: p */
    public InterfaceC1189as mo88p(C2428qs c2428qs) {
        switch (this.f1329a) {
            case 1:
                return new C0907V4(this.f1330b, c2428qs.m4872j(Uri.class, AssetFileDescriptor.class));
            case 2:
                return new C0907V4(this.f1330b, c2428qs.m4872j(Uri.class, InputStream.class));
            default:
                return new C0907V4(this.f1330b, C0872UC.f2757b);
        }
    }
}
