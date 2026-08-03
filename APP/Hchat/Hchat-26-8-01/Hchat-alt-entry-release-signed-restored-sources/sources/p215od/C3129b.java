package p215od;

import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import p302ud.InterfaceC4316l;

/* JADX INFO: renamed from: od.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3129b {

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f10144a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public final HashSet f10145b = new HashSet();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m6653a(Object obj, InterfaceC4316l interfaceC4316l) {
        HashSet hashSet = this.f10145b;
        boolean zContains = hashSet.contains(obj);
        ConcurrentHashMap concurrentHashMap = this.f10144a;
        if (zContains) {
            concurrentHashMap.remove(obj);
        } else if (((InterfaceC4316l) concurrentHashMap.put(obj, interfaceC4316l)) != null) {
            concurrentHashMap.remove(obj);
            hashSet.add(obj);
        }
    }
}
