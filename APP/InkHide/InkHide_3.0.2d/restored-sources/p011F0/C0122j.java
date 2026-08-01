package p011F0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import p027N0.AbstractC0231o;
import p038T0.InterfaceC0283h;

/* JADX INFO: renamed from: F0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0122j implements InterfaceC0283h {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f423a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f424b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0122j(int i2, Object obj) {
        this.f423a = i2;
        this.f424b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p038T0.InterfaceC0283h
    public final Iterator iterator() {
        switch (this.f423a) {
            case 0:
                return AbstractC0231o.m428d((Object[]) this.f424b);
            case 1:
                return ((Collection) this.f424b).iterator();
            case 2:
                return (Iterator) this.f424b;
            default:
                InterfaceC0283h interfaceC0283h = (InterfaceC0283h) this.f424b;
                ArrayList arrayList = new ArrayList();
                Iterator it = interfaceC0283h.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
                if (arrayList.size() > 1) {
                    Collections.sort(arrayList);
                }
                return arrayList.iterator();
        }
    }
}
