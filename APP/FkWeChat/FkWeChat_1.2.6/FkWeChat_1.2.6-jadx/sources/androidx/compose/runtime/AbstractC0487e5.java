package androidx.compose.runtime;

import androidx.compose.runtime.InterfaceC0572r;
import ec.InterfaceC2165o0;
import p010a9.InterfaceC0188p;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6544m;
import p376zd.C10010p0;

/* JADX INFO: renamed from: androidx.compose.runtime.e5 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0487e5 {

    /* JADX INFO: renamed from: androidx.compose.runtime.e5$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public int f1338q;

        /* JADX INFO: renamed from: r */
        public /* synthetic */ Object f1339r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ InterfaceC0188p f1340s;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ InterfaceC0512i2 f1341t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC0188p interfaceC0188p, InterfaceC0512i2 interfaceC0512i2, InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
            this.f1340s = interfaceC0188p;
            this.f1341t = interfaceC0512i2;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            a aVar = new a(this.f1340s, this.f1341t, interfaceC5976f);
            aVar.f1339r = obj;
            return aVar;
        }

        @Override // p010a9.InterfaceC0188p
        public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
            return ((a) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f1338q;
            if (i10 == 0) {
                AbstractC4713t.m18808b(obj);
                InterfaceC2165o0 interfaceC2165o0 = (InterfaceC2165o0) this.f1339r;
                InterfaceC0188p interfaceC0188p = this.f1340s;
                C0499g3 c0499g3 = new C0499g3(this.f1341t, interfaceC2165o0.getCoroutineContext());
                this.f1338q = 1;
                if (interfaceC0188p.invoke(c0499g3, this) == objM24992g) {
                    return objM24992g;
                }
            } else {
                if (i10 != 1) {
                    C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC4713t.m18808b(obj);
            }
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.e5$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public int f1342q;

        /* JADX INFO: renamed from: r */
        public /* synthetic */ Object f1343r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ InterfaceC0188p f1344s;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ InterfaceC0512i2 f1345t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC0188p interfaceC0188p, InterfaceC0512i2 interfaceC0512i2, InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
            this.f1344s = interfaceC0188p;
            this.f1345t = interfaceC0512i2;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            b bVar = new b(this.f1344s, this.f1345t, interfaceC5976f);
            bVar.f1343r = obj;
            return bVar;
        }

        @Override // p010a9.InterfaceC0188p
        public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
            return ((b) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f1342q;
            if (i10 == 0) {
                AbstractC4713t.m18808b(obj);
                InterfaceC2165o0 interfaceC2165o0 = (InterfaceC2165o0) this.f1343r;
                InterfaceC0188p interfaceC0188p = this.f1344s;
                C0499g3 c0499g3 = new C0499g3(this.f1345t, interfaceC2165o0.getCoroutineContext());
                this.f1342q = 1;
                if (interfaceC0188p.invoke(c0499g3, this) == objM24992g) {
                    return objM24992g;
                }
            } else {
                if (i10 != 1) {
                    C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC4713t.m18808b(obj);
            }
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.e5$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public int f1346q;

        /* JADX INFO: renamed from: r */
        public /* synthetic */ Object f1347r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ InterfaceC0188p f1348s;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ InterfaceC0512i2 f1349t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC0188p interfaceC0188p, InterfaceC0512i2 interfaceC0512i2, InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
            this.f1348s = interfaceC0188p;
            this.f1349t = interfaceC0512i2;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            c cVar = new c(this.f1348s, this.f1349t, interfaceC5976f);
            cVar.f1347r = obj;
            return cVar;
        }

        @Override // p010a9.InterfaceC0188p
        public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
            return ((c) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f1346q;
            if (i10 == 0) {
                AbstractC4713t.m18808b(obj);
                InterfaceC2165o0 interfaceC2165o0 = (InterfaceC2165o0) this.f1347r;
                InterfaceC0188p interfaceC0188p = this.f1348s;
                C0499g3 c0499g3 = new C0499g3(this.f1349t, interfaceC2165o0.getCoroutineContext());
                this.f1346q = 1;
                if (interfaceC0188p.invoke(c0499g3, this) == objM24992g) {
                    return objM24992g;
                }
            } else {
                if (i10 != 1) {
                    C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC4713t.m18808b(obj);
            }
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC0564p5 m1643a(Object obj, InterfaceC0188p interfaceC0188p, InterfaceC0572r interfaceC0572r, int i10) {
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(10454275, i10, -1, "androidx.compose.runtime.produceState (ProduceState.kt:77)");
        }
        Object objMo2170f = interfaceC0572r.mo2170f();
        InterfaceC0572r.a aVar = InterfaceC0572r.f1573a;
        if (objMo2170f == aVar.m2191a()) {
            objMo2170f = AbstractC0522j5.m1773e(obj, null, 2, null);
            interfaceC0572r.mo2153L(objMo2170f);
        }
        InterfaceC0512i2 interfaceC0512i2 = (InterfaceC0512i2) objMo2170f;
        C4700i0 c4700i0 = C4700i0.f13910a;
        boolean zMo2175k = interfaceC0572r.mo2175k(interfaceC0188p);
        Object objMo2170f2 = interfaceC0572r.mo2170f();
        if (zMo2175k || objMo2170f2 == aVar.m2191a()) {
            objMo2170f2 = new a(interfaceC0188p, interfaceC0512i2, null);
            interfaceC0572r.mo2153L(objMo2170f2);
        }
        AbstractC0497g1.m1680d(c4700i0, (InterfaceC0188p) objMo2170f2, interfaceC0572r, 6);
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        return interfaceC0512i2;
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC0564p5 m1644b(Object obj, Object obj2, InterfaceC0188p interfaceC0188p, InterfaceC0572r interfaceC0572r, int i10) {
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(-1928268701, i10, -1, "androidx.compose.runtime.produceState (ProduceState.kt:107)");
        }
        Object objMo2170f = interfaceC0572r.mo2170f();
        InterfaceC0572r.a aVar = InterfaceC0572r.f1573a;
        if (objMo2170f == aVar.m2191a()) {
            objMo2170f = AbstractC0522j5.m1773e(obj, null, 2, null);
            interfaceC0572r.mo2153L(objMo2170f);
        }
        InterfaceC0512i2 interfaceC0512i2 = (InterfaceC0512i2) objMo2170f;
        boolean zMo2175k = interfaceC0572r.mo2175k(interfaceC0188p);
        Object objMo2170f2 = interfaceC0572r.mo2170f();
        if (zMo2175k || objMo2170f2 == aVar.m2191a()) {
            objMo2170f2 = new b(interfaceC0188p, interfaceC0512i2, null);
            interfaceC0572r.mo2153L(objMo2170f2);
        }
        AbstractC0497g1.m1680d(obj2, (InterfaceC0188p) objMo2170f2, interfaceC0572r, (i10 >> 3) & 14);
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        return interfaceC0512i2;
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC0564p5 m1645c(Object obj, Object obj2, Object obj3, InterfaceC0188p interfaceC0188p, InterfaceC0572r interfaceC0572r, int i10) {
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(-1703169085, i10, -1, "androidx.compose.runtime.produceState (ProduceState.kt:138)");
        }
        Object objMo2170f = interfaceC0572r.mo2170f();
        InterfaceC0572r.a aVar = InterfaceC0572r.f1573a;
        if (objMo2170f == aVar.m2191a()) {
            objMo2170f = AbstractC0522j5.m1773e(obj, null, 2, null);
            interfaceC0572r.mo2153L(objMo2170f);
        }
        InterfaceC0512i2 interfaceC0512i2 = (InterfaceC0512i2) objMo2170f;
        boolean zMo2175k = interfaceC0572r.mo2175k(interfaceC0188p);
        Object objMo2170f2 = interfaceC0572r.mo2170f();
        if (zMo2175k || objMo2170f2 == aVar.m2191a()) {
            objMo2170f2 = new c(interfaceC0188p, interfaceC0512i2, null);
            interfaceC0572r.mo2153L(objMo2170f2);
        }
        AbstractC0497g1.m1681e(obj2, obj3, (InterfaceC0188p) objMo2170f2, interfaceC0572r, (i10 >> 3) & 126);
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        return interfaceC0512i2;
    }
}
