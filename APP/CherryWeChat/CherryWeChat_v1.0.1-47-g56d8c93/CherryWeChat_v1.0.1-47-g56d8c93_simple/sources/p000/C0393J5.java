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

    public /* synthetic */ C0393J5(Resources r1, int r2) {
        this.f1329a = r2;
        this.f1330b = r1;
    }

    @Override // p000.InterfaceC2819zw
    /* JADX INFO: renamed from: i */
    public InterfaceC2389pw mo660i(InterfaceC2389pw r2, C2644vt r3) {
        if (r2 != null) goto L6;
        return null;
    L6:
        return new C0608O5(this.f1330b, r2);
    }

    @Override // p000.InterfaceC1233bs
    /* JADX INFO: renamed from: p */
    public InterfaceC1189as mo88p(C2428qs r4) {
        switch(this.f1329a) {
            case 1: goto L8;
            case 2: goto L6;
            default: goto L5;
        };
    L6:
        InterfaceC1189as r42 = r4.m4872j(Uri.class, InputStream.class);
        return new C0907V4(this.f1330b, r42);
    L8:
        InterfaceC1189as r43 = r4.m4872j(Uri.class, AssetFileDescriptor.class);
        return new C0907V4(this.f1330b, r43);
    L5:
        return new C0907V4(this.f1330b, C0872UC.f2757b);
    }
}
