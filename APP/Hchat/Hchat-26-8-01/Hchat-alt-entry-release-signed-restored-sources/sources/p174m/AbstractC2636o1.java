package p174m;

import ci.C0589j;
import gg.AbstractC1405a;
import p014b.C0126e;
import p077f8.AbstractC1089i;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1235p;
import p136j8.C2104o;
import p249qg.C3563f1;
import p267s1.C3903k;
import p267s1.C3914t;
import p276sf.C3967n;
import p293u2.InterfaceC4233c;
import p352xf.EnumC5799a;
import p370yf.AbstractC6038c;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: m.o1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2636o1 {

    /* JADX INFO: renamed from: a */
    public final C2637o2 f8583a;

    /* JADX INFO: renamed from: b */
    public final AbstractC1405a f8584b;

    /* JADX INFO: renamed from: c */
    public InterfaceC4233c f8585c;

    /* JADX INFO: renamed from: d */
    public boolean f8586d;

    /* JADX INFO: renamed from: e */
    public final C0126e f8587e = new C0126e(22);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: fg.p */
    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC2636o1(C2637o2 c2637o2, InterfaceC1235p interfaceC1235p, InterfaceC4233c interfaceC4233c) {
        this.f8583a = c2637o2;
        this.f8584b = (AbstractC1405a) interfaceC1235p;
        this.f8585c = interfaceC4233c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX INFO: renamed from: a */
    public static void m6086a(C3903k c3903k) {
        ?? r32 = c3903k.f12800a;
        int size = r32.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((C3914t) r32.get(i9)).m8118a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m6087b(InterfaceC1235p interfaceC1235p, AbstractC6038c abstractC6038c) throws Throwable {
        C2632n1 c2632n1;
        if (abstractC6038c instanceof C2632n1) {
            c2632n1 = (C2632n1) abstractC6038c;
            int i9 = c2632n1.f8566i;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c2632n1.f8566i = i9 - Integer.MIN_VALUE;
            } else {
                c2632n1 = new C2632n1(this, abstractC6038c);
            }
        }
        Object obj = c2632n1.f8564g;
        int i10 = c2632n1.f8566i;
        if (i10 == 0) {
            AbstractC1089i.m2732I0(obj);
            this.f8586d = true;
            C0589j c0589j = new C0589j(this, interfaceC1235p, (InterfaceC5557c) null, 10);
            c2632n1.f8566i = 1;
            C3563f1 c3563f1 = new C3563f1(c2632n1, c2632n1.getContext());
            Object objM3185L = AbstractC1184v0.m3185L(c3563f1, c3563f1, c0589j);
            EnumC5799a enumC5799a = EnumC5799a.f23547g;
            if (objM3185L == enumC5799a) {
                return enumC5799a;
            }
        } else {
            if (i10 != 1) {
                C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC1089i.m2732I0(obj);
        }
        this.f8586d = false;
        return C3967n.f12976a;
    }
}
