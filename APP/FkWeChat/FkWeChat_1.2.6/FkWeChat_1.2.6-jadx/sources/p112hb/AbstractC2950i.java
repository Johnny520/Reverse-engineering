package p112hb;

import gb.AbstractC2706r0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p185m8.AbstractC5116y;
import p229p9.C6002g0;

/* JADX INFO: renamed from: hb.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2950i {

    /* JADX INFO: renamed from: a */
    public static final C6002g0 f7785a = new C6002g0("KotlinTypeRefiner");

    /* JADX INFO: renamed from: a */
    public static final C6002g0 m10854a() {
        return f7785a;
    }

    /* JADX INFO: renamed from: b */
    public static final List m10855b(AbstractC2949h abstractC2949h, Iterable iterable) {
        abstractC2949h.getClass();
        iterable.getClass();
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(abstractC2949h.mo9586a((AbstractC2706r0) it.next()));
        }
        return arrayList;
    }
}
