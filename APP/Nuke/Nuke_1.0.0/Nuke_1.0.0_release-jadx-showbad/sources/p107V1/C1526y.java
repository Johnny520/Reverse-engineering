package p107V1;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.net.URL;
import p078P1.C1147i;

/* JADX INFO: renamed from: V1.y */
/* JADX INFO: loaded from: classes.dex */
public final class C1526y implements InterfaceC1518q {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5293a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1518q f5294b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1526y(InterfaceC1518q interfaceC1518q, int i5) {
        this.f5293a = i5;
        this.f5294b = interfaceC1518q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p107V1.InterfaceC1518q
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo2773a(Object obj) {
        switch (this.f5293a) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p107V1.InterfaceC1518q
    /* JADX INFO: renamed from: b */
    public final C1517p mo2774b(Object obj, int i5, int i6, C1147i c1147i) {
        Uri uriFromFile;
        switch (this.f5293a) {
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
                InterfaceC1518q interfaceC1518q = this.f5294b;
                if (interfaceC1518q.mo2773a(uriFromFile)) {
                    return interfaceC1518q.mo2774b(uriFromFile, i5, i6, c1147i);
                }
                return null;
            default:
                return this.f5294b.mo2774b(new C1508g((URL) obj), i5, i6, c1147i);
        }
    }
}
