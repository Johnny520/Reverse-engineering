package p301uc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import p084ff.C1217c;

/* JADX INFO: renamed from: uc.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4303a implements InterfaceC4304b {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p301uc.InterfaceC4304b
    /* JADX INFO: renamed from: j */
    public final List mo2844j() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ServiceLoader.load(C1217c.class).iterator();
        while (it.hasNext()) {
            arrayList.add((C1217c) it.next());
        }
        return arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
