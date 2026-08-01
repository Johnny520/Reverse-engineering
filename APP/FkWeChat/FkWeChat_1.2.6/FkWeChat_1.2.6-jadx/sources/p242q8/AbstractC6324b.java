package p242q8;

import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p010a9.InterfaceC0189q;
import p024b9.AbstractC1064u0;
import p172l8.AbstractC4713t;
import p228p8.C5981k;
import p228p8.InterfaceC5976f;
import p228p8.InterfaceC5980j;
import p257r8.AbstractC6532a;
import p257r8.AbstractC6535d;
import p257r8.AbstractC6539h;
import p257r8.AbstractC6541j;
import p376zd.C10010p0;

/* JADX INFO: renamed from: q8.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6324b {

    /* JADX INFO: renamed from: q8.b$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6541j {

        /* JADX INFO: renamed from: q */
        public int f19840q;

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ InterfaceC0184l f19841r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC5976f interfaceC5976f, InterfaceC0184l interfaceC0184l) {
            super(interfaceC5976f);
            this.f19841r = interfaceC0184l;
            interfaceC5976f.getClass();
        }

        @Override // p257r8.AbstractC6532a
        public Object invokeSuspend(Object obj) throws Throwable {
            int i10 = this.f19840q;
            if (i10 == 0) {
                this.f19840q = 1;
                AbstractC4713t.m18808b(obj);
                this.f19841r.getClass();
                return ((InterfaceC0184l) AbstractC1064u0.m3858f(this.f19841r, 1)).mo27m(this);
            }
            if (i10 != 1) {
                C10010p0.m38820a("This coroutine had already completed");
                return null;
            }
            this.f19840q = 2;
            AbstractC4713t.m18808b(obj);
            return obj;
        }
    }

    /* JADX INFO: renamed from: q8.b$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public int f19842q;

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ InterfaceC0184l f19843r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC5976f interfaceC5976f, InterfaceC5980j interfaceC5980j, InterfaceC0184l interfaceC0184l) {
            super(interfaceC5976f, interfaceC5980j);
            this.f19843r = interfaceC0184l;
            interfaceC5976f.getClass();
        }

        @Override // p257r8.AbstractC6532a
        public Object invokeSuspend(Object obj) throws Throwable {
            int i10 = this.f19842q;
            if (i10 == 0) {
                this.f19842q = 1;
                AbstractC4713t.m18808b(obj);
                this.f19843r.getClass();
                return ((InterfaceC0184l) AbstractC1064u0.m3858f(this.f19843r, 1)).mo27m(this);
            }
            if (i10 != 1) {
                C10010p0.m38820a("This coroutine had already completed");
                return null;
            }
            this.f19842q = 2;
            AbstractC4713t.m18808b(obj);
            return obj;
        }
    }

    /* JADX INFO: renamed from: q8.b$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends AbstractC6541j {

        /* JADX INFO: renamed from: q */
        public int f19844q;

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ InterfaceC0188p f19845r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ Object f19846s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC5976f interfaceC5976f, InterfaceC0188p interfaceC0188p, Object obj) {
            super(interfaceC5976f);
            this.f19845r = interfaceC0188p;
            this.f19846s = obj;
            interfaceC5976f.getClass();
        }

        @Override // p257r8.AbstractC6532a
        public Object invokeSuspend(Object obj) throws Throwable {
            int i10 = this.f19844q;
            if (i10 == 0) {
                this.f19844q = 1;
                AbstractC4713t.m18808b(obj);
                this.f19845r.getClass();
                return ((InterfaceC0188p) AbstractC1064u0.m3858f(this.f19845r, 2)).invoke(this.f19846s, this);
            }
            if (i10 != 1) {
                C10010p0.m38820a("This coroutine had already completed");
                return null;
            }
            this.f19844q = 2;
            AbstractC4713t.m18808b(obj);
            return obj;
        }
    }

    /* JADX INFO: renamed from: q8.b$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public int f19847q;

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ InterfaceC0188p f19848r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ Object f19849s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC5976f interfaceC5976f, InterfaceC5980j interfaceC5980j, InterfaceC0188p interfaceC0188p, Object obj) {
            super(interfaceC5976f, interfaceC5980j);
            this.f19848r = interfaceC0188p;
            this.f19849s = obj;
            interfaceC5976f.getClass();
        }

        @Override // p257r8.AbstractC6532a
        public Object invokeSuspend(Object obj) throws Throwable {
            int i10 = this.f19847q;
            if (i10 == 0) {
                this.f19847q = 1;
                AbstractC4713t.m18808b(obj);
                this.f19848r.getClass();
                return ((InterfaceC0188p) AbstractC1064u0.m3858f(this.f19848r, 2)).invoke(this.f19849s, this);
            }
            if (i10 != 1) {
                C10010p0.m38820a("This coroutine had already completed");
                return null;
            }
            this.f19847q = 2;
            AbstractC4713t.m18808b(obj);
            return obj;
        }
    }

    /* JADX INFO: renamed from: q8.b$e */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class e extends AbstractC6541j {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
            interfaceC5976f.getClass();
        }

        @Override // p257r8.AbstractC6532a
        public Object invokeSuspend(Object obj) throws Throwable {
            AbstractC4713t.m18808b(obj);
            return obj;
        }
    }

    /* JADX INFO: renamed from: q8.b$f */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class f extends AbstractC6535d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC5976f interfaceC5976f, InterfaceC5980j interfaceC5980j) {
            super(interfaceC5976f, interfaceC5980j);
            interfaceC5976f.getClass();
        }

        @Override // p257r8.AbstractC6532a
        public Object invokeSuspend(Object obj) throws Throwable {
            AbstractC4713t.m18808b(obj);
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static InterfaceC5976f m24986a(InterfaceC0184l interfaceC0184l, InterfaceC5976f interfaceC5976f) {
        interfaceC0184l.getClass();
        interfaceC5976f.getClass();
        InterfaceC5976f interfaceC5976fM25858a = AbstractC6539h.m25858a(interfaceC5976f);
        if (interfaceC0184l instanceof AbstractC6532a) {
            return ((AbstractC6532a) interfaceC0184l).create(interfaceC5976fM25858a);
        }
        InterfaceC5980j context = interfaceC5976fM25858a.getContext();
        return context == C5981k.f18917q ? new a(interfaceC5976fM25858a, interfaceC0184l) : new b(interfaceC5976fM25858a, context, interfaceC0184l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static InterfaceC5976f m24987b(InterfaceC0188p interfaceC0188p, Object obj, InterfaceC5976f interfaceC5976f) {
        interfaceC0188p.getClass();
        interfaceC5976f.getClass();
        InterfaceC5976f interfaceC5976fM25858a = AbstractC6539h.m25858a(interfaceC5976f);
        if (interfaceC0188p instanceof AbstractC6532a) {
            return ((AbstractC6532a) interfaceC0188p).create(obj, interfaceC5976fM25858a);
        }
        InterfaceC5980j context = interfaceC5976fM25858a.getContext();
        return context == C5981k.f18917q ? new c(interfaceC5976fM25858a, interfaceC0188p, obj) : new d(interfaceC5976fM25858a, context, interfaceC0188p, obj);
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC5976f m24988c(InterfaceC5976f interfaceC5976f) {
        InterfaceC5980j context = interfaceC5976f.getContext();
        return context == C5981k.f18917q ? new e(interfaceC5976f) : new f(interfaceC5976f, context);
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC5976f m24989d(InterfaceC5976f interfaceC5976f) {
        InterfaceC5976f interfaceC5976fIntercepted;
        interfaceC5976f.getClass();
        AbstractC6535d abstractC6535d = interfaceC5976f instanceof AbstractC6535d ? (AbstractC6535d) interfaceC5976f : null;
        return (abstractC6535d == null || (interfaceC5976fIntercepted = abstractC6535d.intercepted()) == null) ? interfaceC5976f : interfaceC5976fIntercepted;
    }

    /* JADX INFO: renamed from: e */
    public static Object m24990e(InterfaceC0188p interfaceC0188p, Object obj, InterfaceC5976f interfaceC5976f) {
        interfaceC0188p.getClass();
        interfaceC5976f.getClass();
        return ((InterfaceC0188p) AbstractC1064u0.m3858f(interfaceC0188p, 2)).invoke(obj, m24988c(AbstractC6539h.m25858a(interfaceC5976f)));
    }

    /* JADX INFO: renamed from: f */
    public static Object m24991f(InterfaceC0189q interfaceC0189q, Object obj, Object obj2, InterfaceC5976f interfaceC5976f) {
        interfaceC0189q.getClass();
        interfaceC5976f.getClass();
        return ((InterfaceC0189q) AbstractC1064u0.m3858f(interfaceC0189q, 3)).mo236e(obj, obj2, m24988c(AbstractC6539h.m25858a(interfaceC5976f)));
    }
}
