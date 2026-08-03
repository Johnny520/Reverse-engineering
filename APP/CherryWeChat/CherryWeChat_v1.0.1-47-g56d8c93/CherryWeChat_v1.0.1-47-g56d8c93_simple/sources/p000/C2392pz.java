package p000;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.net.URL;

/* JADX INFO: renamed from: pz */
/* JADX INFO: loaded from: classes.dex */
public final class C2392pz implements InterfaceC1189as {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8394a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1189as f8395b;

    public /* synthetic */ C2392pz(InterfaceC1189as r1, int r2) {
        this.f8394a = r2;
        this.f8395b = r1;
    }

    @Override // p000.InterfaceC1189as
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo994a(Object r2) {
        switch(this.f8394a) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        URL r22 = (URL) r2;
        return true;
    L7:
        String r23 = (String) r2;
        return true;
    }

    @Override // p000.InterfaceC1189as
    /* JADX INFO: renamed from: b */
    public final C1108Zr mo995b(Object r4, int r5, int r6, C2644vt r7) {
        switch(this.f8394a) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        String r42 = (String) r4;
        if (TextUtils.isEmpty(r42) == false) goto L10;
        Uri r43 = null;
    L16:
        if (r43 == null) goto L22;
        InterfaceC1189as r0 = this.f8395b;
        if (r0.mo994a(r43) == true) goto L21;
        return null;
    L21:
        return r0.mo995b(r43, r5, r6, r7);
    L22:
        return null;
    L10:
        if (r42.charAt(0) != '/') goto L12;
        r43 = Uri.fromFile(new File(r42));
        goto L16
    L12:
        Uri r02 = Uri.parse(r42);
        if (r02.getScheme() != null) goto L15;
        r43 = Uri.fromFile(new File(r42));
        goto L16
    L15:
        r43 = r02;
        goto L16
    L5:
        return this.f8395b.mo995b(new C1057Yj((URL) r4), r5, r6, r7);
    }
}
