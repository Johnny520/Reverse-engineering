package p243q9;

import java.util.Iterator;
import java.util.List;
import p024b9.AbstractC1061t;
import p036c9.InterfaceC1400a;
import p185m8.AbstractC5114x;
import p213oa.C5692c;

/* JADX INFO: renamed from: q9.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC6333h extends Iterable, InterfaceC1400a {

    /* JADX INFO: renamed from: o */
    public static final a f19873o = a.f19874a;

    /* JADX INFO: renamed from: q9.h$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ a f19874a = new a();

        /* JADX INFO: renamed from: b */
        public static final InterfaceC6333h f19875b = new C10182a();

        /* JADX INFO: renamed from: q9.h$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10182a implements InterfaceC6333h {
            /* JADX INFO: renamed from: a */
            public Void m25004a(C5692c c5692c) {
                c5692c.getClass();
                return null;
            }

            @Override // p243q9.InterfaceC6333h
            /* JADX INFO: renamed from: b */
            public /* bridge */ /* synthetic */ InterfaceC6328c mo3926b(C5692c c5692c) {
                return (InterfaceC6328c) m25004a(c5692c);
            }

            @Override // p243q9.InterfaceC6333h
            /* JADX INFO: renamed from: i */
            public boolean mo3927i(C5692c c5692c) {
                return b.m25006b(this, c5692c);
            }

            @Override // p243q9.InterfaceC6333h
            public boolean isEmpty() {
                return true;
            }

            @Override // java.lang.Iterable
            public Iterator iterator() {
                return AbstractC5114x.m20800o().iterator();
            }

            public String toString() {
                return "EMPTY";
            }
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC6333h m25002a(List list) {
            list.getClass();
            return list.isEmpty() ? f19875b : new C6334i(list);
        }

        /* JADX INFO: renamed from: b */
        public final InterfaceC6333h m25003b() {
            return f19875b;
        }
    }

    /* JADX INFO: renamed from: q9.h$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b {
        /* JADX INFO: renamed from: a */
        public static InterfaceC6328c m25005a(InterfaceC6333h interfaceC6333h, C5692c c5692c) {
            Object next;
            c5692c.getClass();
            Iterator it = interfaceC6333h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (AbstractC1061t.m3842c(((InterfaceC6328c) next).mo5549d(), c5692c)) {
                    break;
                }
            }
            return (InterfaceC6328c) next;
        }

        /* JADX INFO: renamed from: b */
        public static boolean m25006b(InterfaceC6333h interfaceC6333h, C5692c c5692c) {
            c5692c.getClass();
            return interfaceC6333h.mo3926b(c5692c) != null;
        }
    }

    /* JADX INFO: renamed from: b */
    InterfaceC6328c mo3926b(C5692c c5692c);

    /* JADX INFO: renamed from: i */
    boolean mo3927i(C5692c c5692c);

    boolean isEmpty();
}
