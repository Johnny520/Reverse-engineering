package androidx.compose.runtime;

import p010a9.InterfaceC0188p;
import p024b9.AbstractC1064u0;
import p117i.AbstractC3071m;
import p117i.AbstractC3092w0;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p185m8.AbstractC5081g0;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6542k;
import p299ub.AbstractC8638t;
import p376zd.C10010p0;
import sb.AbstractC7284j;
import sb.AbstractC7285k;
import sb.AbstractC7294t;
import sb.InterfaceC7282h;

/* JADX INFO: renamed from: androidx.compose.runtime.o */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0551o extends RuntimeException {

    /* JADX INFO: renamed from: q */
    public final AbstractC3092w0 f1508q;

    /* JADX INFO: renamed from: r */
    public final AbstractC3092w0 f1509r;

    /* JADX INFO: renamed from: s */
    public final AbstractC3071m f1510s;

    /* JADX INFO: renamed from: t */
    public final int f1511t;

    /* JADX INFO: renamed from: androidx.compose.runtime.o$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6542k implements InterfaceC0188p {

        /* JADX INFO: renamed from: r */
        public int f1512r;

        /* JADX INFO: renamed from: s */
        public int f1513s;

        /* JADX INFO: renamed from: t */
        public int f1514t;

        /* JADX INFO: renamed from: u */
        public int f1515u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f1516v;

        public a(InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            a aVar = C0551o.this.new a(interfaceC5976f);
            aVar.f1516v = obj;
            return aVar;
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i10;
            AbstractC7284j abstractC7284j;
            int i11;
            int i12;
            String str;
            int i13;
            int i14;
            Object objM24992g = AbstractC6325c.m24992g();
            int i15 = this.f1515u;
            if (i15 == 0) {
                AbstractC4713t.m18808b(obj);
                i10 = 0;
                abstractC7284j = (AbstractC7284j) this.f1516v;
                i11 = 0;
                i12 = 0;
            } else {
                if (i15 != 1) {
                    C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i16 = this.f1514t;
                int i17 = this.f1513s;
                int i18 = this.f1512r;
                abstractC7284j = (AbstractC7284j) this.f1516v;
                AbstractC4713t.m18808b(obj);
                i11 = i17;
                i12 = i16;
                i10 = i18;
            }
            while (i10 < Math.min(C0551o.this.f1511t + 10, C0551o.this.f1510s.f8151b)) {
                int i19 = i10 + 1;
                int iM11417e = C0551o.this.f1510s.m11417e(i10);
                switch (iM11417e) {
                    case 0:
                        str = "up";
                        break;
                    case 1:
                        int i20 = i11 + 1;
                        str = "down " + C0551o.this.f1508q.m11586d(i11);
                        i11 = i20;
                        break;
                    case 2:
                        str = "remove " + C0551o.this.f1510s.m11417e(i19) + ' ' + C0551o.this.f1510s.m11417e(i10 + 2);
                        i19 = i10 + 3;
                        break;
                    case 3:
                        str = "move " + C0551o.this.f1510s.m11417e(i19) + ' ' + C0551o.this.f1510s.m11417e(i10 + 2) + ' ' + C0551o.this.f1510s.m11417e(i10 + 3);
                        i19 = i10 + 4;
                        break;
                    case 4:
                        str = "clear";
                        break;
                    case 5:
                        i13 = i10 + 2;
                        i14 = i11 + 1;
                        str = "insertBottomUp " + C0551o.this.f1510s.m11417e(i19) + ' ' + C0551o.this.f1508q.m11586d(i11);
                        i19 = i13;
                        i11 = i14;
                        break;
                    case 6:
                        i13 = i10 + 2;
                        i14 = i11 + 1;
                        str = "insertTopDown " + C0551o.this.f1510s.m11417e(i19) + ' ' + C0551o.this.f1508q.m11586d(i11);
                        i19 = i13;
                        i11 = i14;
                        break;
                    case 7:
                        Object objM11586d = C0551o.this.f1508q.m11586d(i11);
                        objM11586d.getClass();
                        i11 += 2;
                        str = "apply " + ((InterfaceC0188p) AbstractC1064u0.m3858f(objM11586d, 2));
                        break;
                    case 8:
                        str = "reuse " + C0551o.this.f1509r.m11586d(i12);
                        i12++;
                        break;
                    case 9:
                        str = "recompose pending";
                        break;
                    default:
                        str = "unknown op: " + iM11417e;
                        break;
                }
                String str2 = i10 + ": " + str;
                this.f1516v = abstractC7284j;
                this.f1512r = i19;
                this.f1513s = i11;
                this.f1514t = i12;
                this.f1515u = 1;
                if (abstractC7284j.mo28871x(str2, this) == objM24992g) {
                    return objM24992g;
                }
                i10 = i19;
            }
            return C4700i0.f13910a;
        }

        @Override // p010a9.InterfaceC0188p
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC7284j abstractC7284j, InterfaceC5976f interfaceC5976f) {
            return ((a) create(abstractC7284j, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }
    }

    public C0551o(AbstractC3092w0 abstractC3092w0, AbstractC3092w0 abstractC3092w02, AbstractC3071m abstractC3071m, int i10, Throwable th) {
        super(th);
        this.f1508q = abstractC3092w0;
        this.f1509r = abstractC3092w02;
        this.f1510s = abstractC3071m;
        this.f1511t = i10;
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC7282h m1971e() {
        return AbstractC7285k.m28874b(new a(null));
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return AbstractC8638t.m33246m("\n            |Failed to execute op number " + this.f1511t + ":\n            |" + AbstractC5081g0.m20585s0(AbstractC5081g0.m20545Q0(AbstractC7294t.m28908P(m1971e()), 50), "\n", null, null, 0, null, null, 62, null) + "\n            ", null, 1, null);
    }
}
