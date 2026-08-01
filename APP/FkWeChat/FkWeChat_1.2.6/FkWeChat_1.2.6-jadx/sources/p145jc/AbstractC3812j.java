package p145jc;

import java.util.ArrayList;
import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: jc.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3812j {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m15184b(Object obj, int i10, AbstractC1043k abstractC1043k) {
        if ((i10 & 1) != 0) {
            obj = null;
        }
        return m15183a(obj);
    }

    /* JADX INFO: renamed from: c */
    public static final Object m15185c(Object obj, Object obj2) {
        if (obj == null) {
            return m15183a(obj2);
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return m15183a(obj);
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return m15183a(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public static Object m15183a(Object obj) {
        return obj;
    }
}
