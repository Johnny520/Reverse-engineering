package p099y;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;
import p004C.C0066j;

/* JADX INFO: renamed from: y.H */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1044H {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static String[] m2277a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static C1074g m2278b(View view, C1074g c1074g) {
        ContentInfo contentInfoMo148t = c1074g.f3703a.mo148t();
        Objects.requireNonNull(contentInfoMo148t);
        ContentInfo contentInfoM2333e = AbstractC1066c.m2333e(contentInfoMo148t);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoM2333e);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoM2333e ? c1074g : new C1074g(new C0066j(contentInfoPerformReceiveContent));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m2279c(View view, String[] strArr, InterfaceC1085q interfaceC1085q) {
        if (interfaceC1085q == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new OnReceiveContentListenerC1045I(interfaceC1085q));
        }
    }
}
