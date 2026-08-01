package za;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p185m8.AbstractC5070c0;

/* JADX INFO: renamed from: za.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9915m {
    /* JADX INFO: renamed from: a */
    public static final Set m38460a(Iterable iterable) {
        iterable.getClass();
        HashSet hashSet = new HashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Set setMo5517e = ((InterfaceC9913k) it.next()).mo5517e();
            if (setMo5517e == null) {
                return null;
            }
            AbstractC5070c0.m20492E(hashSet, setMo5517e);
        }
        return hashSet;
    }
}
