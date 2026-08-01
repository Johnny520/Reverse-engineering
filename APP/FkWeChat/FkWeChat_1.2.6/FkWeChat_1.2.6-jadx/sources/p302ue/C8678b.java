package p302ue;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import org.luckypray.dexkit.C5823a;
import p010a9.InterfaceC0173a;

/* JADX INFO: renamed from: ue.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8678b {

    /* JADX INFO: renamed from: a */
    public static final C8678b f28775a = new C8678b();

    /* JADX INFO: renamed from: b */
    public static final ConcurrentHashMap f28776b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c */
    public static final ConcurrentHashMap f28777c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d */
    public static final ReferenceQueue f28778d = new ReferenceQueue();

    /* JADX INFO: renamed from: ue.b$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends WeakReference {

        /* JADX INFO: renamed from: a */
        public final String f28779a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, C5823a.e eVar, ReferenceQueue referenceQueue) {
            super(eVar, referenceQueue);
            str.getClass();
            eVar.getClass();
            referenceQueue.getClass();
            this.f28779a = str;
        }

        /* JADX INFO: renamed from: a */
        public final String m33339a() {
            return this.f28779a;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m33333a(String str, C5823a.e eVar) {
        str.getClass();
        eVar.getClass();
        f28776b.remove(str, eVar);
        m33335c(str, eVar);
    }

    /* JADX INFO: renamed from: b */
    public final C5823a.e m33334b(String str, InterfaceC0173a interfaceC0173a) {
        str.getClass();
        interfaceC0173a.getClass();
        while (true) {
            ConcurrentHashMap concurrentHashMap = f28776b;
            C5823a.e eVar = (C5823a.e) concurrentHashMap.get(str);
            if (eVar != null) {
                if (!eVar.m23447L()) {
                    return eVar;
                }
                concurrentHashMap.remove(str, eVar);
            }
            C5823a.e eVarM33338f = m33338f(str);
            if (eVarM33338f != null) {
                return eVarM33338f;
            }
            C5823a.e eVar2 = (C5823a.e) interfaceC0173a.invoke();
            C5823a.e eVar3 = (C5823a.e) concurrentHashMap.putIfAbsent(str, eVar2);
            if (eVar3 == null) {
                return eVar2;
            }
            if (!eVar3.m23447L()) {
                return eVar3;
            }
            concurrentHashMap.remove(str, eVar3);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m33335c(String str, C5823a.e eVar) {
        str.getClass();
        eVar.getClass();
        m33336d();
        f28777c.put(str, new a(str, eVar, f28778d));
    }

    /* JADX INFO: renamed from: d */
    public final void m33336d() {
        while (true) {
            Reference referencePoll = f28778d.poll();
            if (referencePoll == null) {
                return;
            }
            a aVar = referencePoll instanceof a ? (a) referencePoll : null;
            if (aVar != null) {
                f28777c.remove(aVar.m33339a(), aVar);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m33337e(String str, C5823a.e eVar) {
        str.getClass();
        eVar.getClass();
        return f28776b.remove(str, eVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public final C5823a.e m33338f(String str) {
        m33336d();
        ConcurrentHashMap concurrentHashMap = f28777c;
        a aVar = (a) concurrentHashMap.get(str);
        if (aVar == null) {
            return null;
        }
        C5823a.e eVar = (C5823a.e) aVar.get();
        if (eVar == null) {
            concurrentHashMap.remove(str, aVar);
            return null;
        }
        if (eVar.m23447L()) {
            concurrentHashMap.remove(str, aVar);
            return null;
        }
        ConcurrentHashMap concurrentHashMap2 = f28776b;
        C5823a.e eVar2 = (C5823a.e) concurrentHashMap2.putIfAbsent(str, eVar);
        if (eVar2 == null) {
            return eVar;
        }
        if (!eVar2.m23447L()) {
            return eVar2;
        }
        concurrentHashMap2.remove(str, eVar2);
        return null;
    }
}
