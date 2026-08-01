package p027E4;

import java.lang.reflect.Array;
import java.util.Iterator;

/* JADX INFO: renamed from: E4.D */
/* JADX INFO: loaded from: classes.dex */
public final class C0290D extends AbstractC0315b0 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f931d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractC0315b0 f932e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0290D(AbstractC0315b0 abstractC0315b0, int i5) {
        this.f931d = i5;
        this.f932e = abstractC0315b0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p027E4.AbstractC0315b0
    /* JADX INFO: renamed from: a */
    public final void mo515a(C0303Q c0303q, Object obj) {
        switch (this.f931d) {
            case 0:
                Iterable iterable = (Iterable) obj;
                if (iterable != null) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        this.f932e.mo515a(c0303q, it.next());
                    }
                    break;
                }
                break;
            default:
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i5 = 0; i5 < length; i5++) {
                        this.f932e.mo515a(c0303q, Array.get(obj, i5));
                    }
                    break;
                }
                break;
        }
    }
}
