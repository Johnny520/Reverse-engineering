package p077f8;

import com.alibaba.fastjson2.writer.C0640b;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p025bc.AbstractC0255e;

/* JADX INFO: renamed from: f8.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1083c {

    /* JADX INFO: renamed from: c */
    public static final C1083c f3473c = new C1083c();

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f3474a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f3475b = new ConcurrentHashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m2714a(Class cls, InterfaceC1084d interfaceC1084d, Throwable th2) {
        StringBuilder sb2 = new StringBuilder("[Hchat:EventBus] 处理事件异常: ");
        sb2.append(cls.getSimpleName());
        sb2.append(", handler=");
        sb2.append(interfaceC1084d.getClass().getSimpleName());
        sb2.append(", error=");
        AbstractC0255e.m1030s(th2, sb2, th2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m2715b(Object obj) {
        Class<?> cls = obj.getClass();
        if (cls == C1085e.class) {
            this.f3475b.put(cls, obj);
        }
        List list = (List) this.f3474a.get(cls);
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC1084d interfaceC1084d = ((C1081a) it.next()).f3472a;
            try {
                interfaceC1084d.mo468b(obj);
            } catch (Throwable th2) {
                m2714a(obj.getClass(), interfaceC1084d, th2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final C1082b m2716c(Class cls, InterfaceC1084d interfaceC1084d) {
        C1081a c1081a = new C1081a(interfaceC1084d);
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f3474a.computeIfAbsent(cls, new C0640b(18));
        int i9 = 0;
        for (int i10 = 0; i10 < copyOnWriteArrayList.size(); i10++) {
            ((C1081a) copyOnWriteArrayList.get(i10)).getClass();
            i9 = i10 + 1;
        }
        if (i9 >= copyOnWriteArrayList.size()) {
            copyOnWriteArrayList.add(c1081a);
        } else {
            copyOnWriteArrayList.add(i9, c1081a);
        }
        Object obj = this.f3475b.get(cls);
        if (obj != null) {
            try {
                interfaceC1084d.mo468b(cls.cast(obj));
            } catch (Throwable th2) {
                m2714a(cls, interfaceC1084d, th2);
            }
        }
        return new C1082b();
    }
}
