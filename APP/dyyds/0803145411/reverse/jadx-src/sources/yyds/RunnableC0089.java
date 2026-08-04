package yyds;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: yyds.ᛱᛳᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0089 implements Runnable {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f684;

    public /* synthetic */ RunnableC0089(C1849 c1849) {
        this.f684 = 5;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    private final void m487() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        switch (this.f684) {
            case 0:
                C1621 c1621 = C1586.f8042;
                if (c1621 != null) {
                    c1621.mo731();
                }
                AbstractC1960.m3789(AbstractC2328.m4341(-152608350831470L));
                break;
            case 1:
                AbstractC1960.m3789(AbstractC2328.m4341(-152642710569838L));
                break;
            case 2:
                AbstractC1960.m3789(AbstractC2328.m4341(-196674715288430L));
                break;
            case 3:
                Iterator it = C1082.f4985.iterator();
                while (it.hasNext()) {
                    try {
                        ((InterfaceC2266) it.next()).mo731();
                    } catch (Throwable unused) {
                    }
                }
                break;
            case 4:
                ArrayList<Map.Entry> arrayList = new ArrayList();
                arrayList.addAll(C1664.f8500.entrySet());
                for (Map.Entry entry : arrayList) {
                    WeakReference weakReference = (WeakReference) C1664.f8498.get(entry.getKey());
                    if (weakReference != null && (obj = weakReference.get()) != null) {
                        C1664.f8513.m3405(obj, ((WeakReference) entry.getValue()).get());
                    }
                }
                break;
        }
    }
}
