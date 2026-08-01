package io.ktor.util;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p052.InterfaceC6543;
import p144.C7547;

/* JADX INFO: renamed from: io.ktor.util.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4204 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractMap f12691;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f12692;

    public C4204(int i) {
        this.f12692 = i;
        switch (i) {
            case 1:
                this.f12691 = new HashMap();
                break;
            default:
                this.f12691 = new ConcurrentHashMap();
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m8586(C4209 c4209, Object obj) {
        c4209.getClass();
        obj.getClass();
        m8588().put(c4209, obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object m8587(C4209 c4209) {
        c4209.getClass();
        return m8588().get(c4209);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Map m8588() {
        switch (this.f12692) {
            case 0:
                return (ConcurrentHashMap) this.f12691;
            default:
                return (HashMap) this.f12691;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object m8589(C4209 c4209) {
        c4209.getClass();
        Object obj = m8588().get(c4209);
        if (obj != null) {
            return obj;
        }
        C7547.m12774(c4209, "No instance for key ");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object m8590(C4209 c4209, InterfaceC6543 interfaceC6543) {
        int i = this.f12692;
        AbstractMap abstractMap = this.f12691;
        switch (i) {
            case 0:
                c4209.getClass();
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) abstractMap;
                Object obj = concurrentHashMap.get(c4209);
                if (obj == null) {
                    Object objInvoke = interfaceC6543.invoke();
                    Object objPutIfAbsent = concurrentHashMap.putIfAbsent(c4209, objInvoke);
                    obj = objPutIfAbsent == null ? objInvoke : objPutIfAbsent;
                    obj.getClass();
                }
                return obj;
            default:
                c4209.getClass();
                HashMap map = (HashMap) abstractMap;
                Object obj2 = map.get(c4209);
                if (obj2 == null) {
                    Object objInvoke2 = interfaceC6543.invoke();
                    Object objPut = map.put(c4209, objInvoke2);
                    obj2 = objPut == null ? objInvoke2 : objPut;
                    obj2.getClass();
                }
                return obj2;
        }
    }
}
