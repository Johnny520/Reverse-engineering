package p258r8;

import java.util.ArrayList;

/* JADX INFO: renamed from: r8.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3743h {

    /* JADX INFO: renamed from: a */
    public final ArrayList f12152a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final ArrayList f12153b = new ArrayList();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static String m7760b(InterfaceC3741f interfaceC3741f) {
        try {
            String strName = interfaceC3741f.name();
            return strName.length() == 0 ? interfaceC3741f.getClass().getName() : strName;
        } catch (Throwable unused) {
            return interfaceC3741f.getClass().getName();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m7761a(InterfaceC3741f interfaceC3741f) {
        this.f12152a.add(interfaceC3741f);
    }
}
