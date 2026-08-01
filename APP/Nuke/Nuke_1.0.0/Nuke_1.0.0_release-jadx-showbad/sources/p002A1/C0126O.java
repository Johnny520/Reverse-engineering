package p002A1;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: A1.O */
/* JADX INFO: loaded from: classes.dex */
public final class C0126O {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f518a = new LinkedHashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m176a() {
        LinkedHashMap linkedHashMap = this.f518a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((AbstractC0122K) it.next()).m173a();
        }
        linkedHashMap.clear();
    }
}
