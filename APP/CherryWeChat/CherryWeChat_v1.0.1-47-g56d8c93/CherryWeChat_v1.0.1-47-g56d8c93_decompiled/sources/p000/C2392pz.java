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

    public /* synthetic */ C2392pz(InterfaceC1189as interfaceC1189as, int i) {
        this.f8394a = i;
        this.f8395b = interfaceC1189as;
    }

    @Override // p000.InterfaceC1189as
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo994a(Object obj) {
        switch (this.f8394a) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }

    @Override // p000.InterfaceC1189as
    /* JADX INFO: renamed from: b */
    public final C1108Zr mo995b(Object obj, int i, int i2, C2644vt c2644vt) {
        Uri uriFromFile;
        switch (this.f8394a) {
            case 0:
                String str = (String) obj;
                if (TextUtils.isEmpty(str)) {
                    uriFromFile = null;
                } else if (str.charAt(0) == '/') {
                    uriFromFile = Uri.fromFile(new File(str));
                } else {
                    Uri uri = Uri.parse(str);
                    uriFromFile = uri.getScheme() == null ? Uri.fromFile(new File(str)) : uri;
                }
                if (uriFromFile == null) {
                    return null;
                }
                InterfaceC1189as interfaceC1189as = this.f8395b;
                if (interfaceC1189as.mo994a(uriFromFile)) {
                    return interfaceC1189as.mo995b(uriFromFile, i, i2, c2644vt);
                }
                return null;
            default:
                return this.f8395b.mo995b(new C1057Yj((URL) obj), i, i2, c2644vt);
        }
    }
}
