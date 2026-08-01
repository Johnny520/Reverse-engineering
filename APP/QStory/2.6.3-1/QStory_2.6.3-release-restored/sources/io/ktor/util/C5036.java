package io.ktor.util;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p068.InterfaceC7372;
import p160.C8376;

/* JADX INFO: renamed from: io.ktor.util.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5036 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractMap f13036;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f13037;

    public C5036(int i) {
        this.f13037 = i;
        switch (i) {
            case 1:
                this.f13036 = new HashMap();
                break;
            default:
                this.f13036 = new ConcurrentHashMap();
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m9145(C5041 c5041, Object obj) {
        c5041.getClass();
        obj.getClass();
        m9147().put(c5041, obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object m9146(C5041 c5041) {
        c5041.getClass();
        return m9147().get(c5041);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Map m9147() {
        switch (this.f13037) {
            case 0:
                return (ConcurrentHashMap) this.f13036;
            default:
                return (HashMap) this.f13036;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object m9148(C5041 c5041) {
        c5041.getClass();
        Object obj = m9147().get(c5041);
        if (obj != null) {
            return obj;
        }
        C8376.m13333(c5041, "No instance for key ");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object m9149(C5041 c5041, InterfaceC7372 interfaceC7372) {
        int i = this.f13037;
        AbstractMap abstractMap = this.f13036;
        switch (i) {
            case 0:
                c5041.getClass();
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) abstractMap;
                Object obj = concurrentHashMap.get(c5041);
                if (obj == null) {
                    Object objInvoke = interfaceC7372.invoke();
                    Object objPutIfAbsent = concurrentHashMap.putIfAbsent(c5041, objInvoke);
                    obj = objPutIfAbsent == null ? objInvoke : objPutIfAbsent;
                    obj.getClass();
                }
                return obj;
            default:
                c5041.getClass();
                HashMap map = (HashMap) abstractMap;
                Object obj2 = map.get(c5041);
                if (obj2 == null) {
                    Object objInvoke2 = interfaceC7372.invoke();
                    Object objPut = map.put(c5041, objInvoke2);
                    obj2 = objPut == null ? objInvoke2 : objPut;
                    obj2.getClass();
                }
                return obj2;
        }
    }
}
