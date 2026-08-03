package sh;

import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p117i0.InterfaceC1809a1;
import p136j8.C2104o;
import p187n.C2857k;
import p187n.InterfaceC2856j;
import p249qg.InterfaceC3599t;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6038c;
import p370yf.AbstractC6044i;
import p387zh.C6145a;
import p387zh.C6146b;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: sh.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4036p extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public int f13304h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean f13305i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f13306j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C2857k f13307k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4036p(boolean z9, InterfaceC1809a1 interfaceC1809a1, C2857k c2857k, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f13305i = z9;
        this.f13306j = interfaceC1809a1;
        this.f13307k = c2857k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m8234f(InterfaceC1809a1 interfaceC1809a1, C2857k c2857k, AbstractC6038c abstractC6038c) throws Throwable {
        C4033o c4033o;
        if (abstractC6038c instanceof C4033o) {
            c4033o = (C4033o) abstractC6038c;
            int i9 = c4033o.f13297i;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c4033o.f13297i = i9 - Integer.MIN_VALUE;
            } else {
                c4033o = new C4033o(abstractC6038c);
            }
        }
        Object obj = c4033o.f13296h;
        int i10 = c4033o.f13297i;
        if (i10 == 0) {
            AbstractC1089i.m2732I0(obj);
            if (((C6145a) interfaceC1809a1.getValue()) != null) {
                InterfaceC2856j c6146b = new C6146b();
                c4033o.f13295g = interfaceC1809a1;
                c4033o.f13297i = 1;
                Object objM6281a = c2857k.m6281a(c6146b, c4033o);
                Object obj2 = EnumC5799a.f23547g;
                if (objM6281a == obj2) {
                    return obj2;
                }
            }
            return C3967n.f12976a;
        }
        if (i10 != 1) {
            C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        interfaceC1809a1 = c4033o.f13295g;
        AbstractC1089i.m2732I0(obj);
        interfaceC1809a1.setValue(null);
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        return new C4036p(this.f13305i, this.f13306j, this.f13307k, interfaceC5557c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        return ((C4036p) create((InterfaceC3599t) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        if (r5.m6281a(r8, r7) != r6) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (m8234f(r1, r5, r7) == r6) goto L22;
     */
    @Override // p370yf.AbstractC6036a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i9 = this.f13304h;
        InterfaceC1809a1 interfaceC1809a1 = this.f13306j;
        C2857k c2857k = this.f13307k;
        EnumC5799a enumC5799a = EnumC5799a.f23547g;
        if (i9 == 0) {
            AbstractC1089i.m2732I0(obj);
            if (this.f13305i) {
                this.f13304h = 1;
                if (m8234f(interfaceC1809a1, c2857k, this) != enumC5799a) {
                    C6145a c6145a = new C6145a();
                    interfaceC1809a1.setValue(c6145a);
                    this.f13304h = 2;
                }
            } else {
                this.f13304h = 3;
            }
            return enumC5799a;
        }
        if (i9 != 1) {
            if (i9 == 2 || i9 == 3) {
                AbstractC1089i.m2732I0(obj);
                return C3967n.f12976a;
            }
            C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC1089i.m2732I0(obj);
        C6145a c6145a2 = new C6145a();
        interfaceC1809a1.setValue(c6145a2);
        this.f13304h = 2;
    }
}
