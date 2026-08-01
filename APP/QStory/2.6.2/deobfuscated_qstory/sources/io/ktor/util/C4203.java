package io.ktor.util;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p052.InterfaceC6542;
import p144.C7546;

/* JADX INFO: renamed from: io.ktor.util.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4203 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractMap f12687;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f12688;

    public C4203(int i) {
        this.f12688 = i;
        switch (i) {
            case 1:
                this.f12687 = new HashMap();
                break;
            default:
                this.f12687 = new ConcurrentHashMap();
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m8596(C4208 c4208, Object obj) {
        c4208.getClass();
        obj.getClass();
        m8598().put(c4208, obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object m8597(C4208 c4208) {
        c4208.getClass();
        return m8598().get(c4208);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Map m8598() {
        switch (this.f12688) {
            case 0:
                return (ConcurrentHashMap) this.f12687;
            default:
                return (HashMap) this.f12687;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object m8599(C4208 c4208) {
        c4208.getClass();
        Object obj = m8598().get(c4208);
        if (obj != null) {
            return obj;
        }
        C7546.m12745(c4208, "No instance for key ");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object m8600(C4208 c4208, InterfaceC6542 interfaceC6542) {
        int i = this.f12688;
        AbstractMap abstractMap = this.f12687;
        switch (i) {
            case 0:
                c4208.getClass();
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) abstractMap;
                Object obj = concurrentHashMap.get(c4208);
                if (obj == null) {
                    Object objInvoke = interfaceC6542.invoke();
                    Object objPutIfAbsent = concurrentHashMap.putIfAbsent(c4208, objInvoke);
                    obj = objPutIfAbsent == null ? objInvoke : objPutIfAbsent;
                    obj.getClass();
                }
                return obj;
            default:
                c4208.getClass();
                HashMap map = (HashMap) abstractMap;
                Object obj2 = map.get(c4208);
                if (obj2 == null) {
                    Object objInvoke2 = interfaceC6542.invoke();
                    Object objPut = map.put(c4208, objInvoke2);
                    obj2 = objPut == null ? objInvoke2 : objPut;
                    obj2.getClass();
                }
                return obj2;
        }
    }
}
