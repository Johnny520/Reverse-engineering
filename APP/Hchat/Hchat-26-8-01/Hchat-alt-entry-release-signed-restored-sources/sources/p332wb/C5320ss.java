package p332wb;

import android.app.Activity;
import android.content.Context;
import gg.AbstractC1416l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000a.AbstractC0000a;
import p080fb.C1113d1;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p117i0.C1845j1;
import p117i0.InterfaceC1809a1;
import p251r.C3623h;
import p258r8.RunnableC3737b;
import p266s0.C3874d;
import p276sf.C3958e;
import p276sf.C3967n;
import tf.AbstractC4167n;

/* JADX INFO: renamed from: wb.ss */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5320ss implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f20713g = 0;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f20714h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f20715i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f20716j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f20717k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5320ss(String str, C1845j1 c1845j1, Context context, InterfaceC1809a1 interfaceC1809a1) {
        this.f20714h = str;
        this.f20715i = c1845j1;
        this.f20717k = context;
        this.f20716j = interfaceC1809a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        Long lValueOf;
        switch (this.f20713g) {
            case 0:
                String str = (String) this.f20714h;
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f20715i;
                Context context = (Context) this.f20717k;
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f20716j;
                List list = (List) obj;
                list.getClass();
                Iterator it = list.iterator();
                Object obj2 = null;
                if (it.hasNext()) {
                    lValueOf = Long.valueOf(((C1113d1) it.next()).f3649n);
                    while (it.hasNext()) {
                        Long lValueOf2 = Long.valueOf(((C1113d1) it.next()).f3649n);
                        if (lValueOf.compareTo(lValueOf2) < 0) {
                            lValueOf = lValueOf2;
                        }
                    }
                } else {
                    lValueOf = null;
                }
                long jLongValue = (lValueOf != null ? lValueOf.longValue() : System.currentTimeMillis()) + ((long) list.size()) + 1;
                ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list));
                int i9 = 0;
                for (Object obj3 : list) {
                    int i10 = i9 + 1;
                    if (i9 < 0) {
                        AbstractC0000a.m32Q0();
                        throw null;
                    }
                    arrayList.add(C1113d1.m2848a((C1113d1) obj3, null, false, false, jLongValue - ((long) i9), 57343));
                    i9 = i10;
                }
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object next = it2.next();
                        if (AbstractC1416l.m3825a(((C1113d1) next).f3636a, str)) {
                            obj2 = next;
                        }
                    }
                }
                C1113d1 c1113d1 = (C1113d1) obj2;
                if (c1113d1 != null) {
                    interfaceC1809a1.setValue(Long.valueOf(c1113d1.f3649n));
                }
                new Thread(new RunnableC3737b(arrayList, context, interfaceC1809a12, 8), "Hchat-Agent-Session-Order").start();
                return C3967n.f12976a;
            default:
                List list2 = (List) this.f20714h;
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f20715i;
                Activity activity = (Activity) this.f20716j;
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f20717k;
                C3623h c3623h = (C3623h) obj;
                c3623h.getClass();
                int i11 = 0;
                for (Object obj4 : list2) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        AbstractC0000a.m32Q0();
                        throw null;
                    }
                    C3623h.m7604a(c3623h, Integer.valueOf(i11), new C3874d(1080710003, new C4893fs((C3958e) obj4, interfaceC1220a, activity, interfaceC1231l, i11), true), 2);
                    i11 = i12;
                }
                return C3967n.f12976a;
        }
    }

    public /* synthetic */ C5320ss(List list, InterfaceC1220a interfaceC1220a, Activity activity, InterfaceC1231l interfaceC1231l) {
        this.f20714h = list;
        this.f20715i = interfaceC1220a;
        this.f20716j = activity;
        this.f20717k = interfaceC1231l;
    }
}
