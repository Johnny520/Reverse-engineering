package be;

import ae.C0071b;
import ae.C0077h;
import bsh.ClassGeneratorUtil;
import bsh.Reflect;
import ca.C0512c;
import ca.C0532s;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;
import md.C2825b;
import md.EnumC2824a;
import me.C2837e;
import p000a.AbstractC0000a;
import p020b5.C0184c;
import p025bc.EnumC0251a;
import p038ce.C0561n;
import p077f8.AbstractC1089i;
import p082fd.C1204a;
import p182m7.AbstractC2804q;
import p182m7.C2797j;
import p199nd.AbstractC2963b0;
import p215od.C3130c;
import p233pd.C3399j;
import p233pd.C3406q;
import p233pd.C3408s;
import p246qd.AbstractC3506j;
import p246qd.C3514r;
import p246qd.C3515s;
import p247qe.C3535r;
import p302ud.C4305a;
import p302ud.C4311g;
import p302ud.C4320p;
import p302ud.C4322r;
import p302ud.InterfaceC4314j;
import p302ud.InterfaceC4318n;
import p350xd.C5776c;
import p350xd.C5777d;

/* JADX INFO: renamed from: be.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0285i implements Predicate {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f828g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f829h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0285i(Object obj, int i9) {
        this.f828g = i9;
        this.f829h = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean z9;
        switch (this.f828g) {
            case 0:
                return !((ArrayList) ((C0289k) this.f829h).f840c).contains(((C3514r) obj).f11420j);
            case 1:
                return Objects.equals(((C4311g) obj).f14392n.mo7341h(), (AbstractC3506j) this.f829h);
            case 2:
                return Objects.equals(((C3399j) ((C4320p) obj)).f10948o, (C3130c) this.f829h);
            case 3:
                return ClassGeneratorUtil.lambda$checkAbstractMethodImplementation$1((Method) this.f829h, (Method) obj);
            case 4:
                return Reflect.lambda$getEnumConstants$6((Class) this.f829h, (Field) obj);
            case 5:
                C4305a c4305a = (C4305a) obj;
                Iterator it = ((List) this.f829h).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z9 = false;
                    } else if (AbstractC0000a.m89s0((C4305a) it.next(), c4305a)) {
                        z9 = true;
                    }
                }
                return !z9;
            case 6:
                C0077h c0077h = (C0077h) this.f829h;
                C0071b c0071b = (C0071b) ((C4305a) obj).f9217g.mo6237c(C2825b.f9179F);
                return c0071b != null && Objects.equals(c0071b.f228g, c0077h.f244h);
            case 7:
                return ((Boolean) ((C0512c) this.f829h).invoke(obj)).booleanValue();
            case 8:
                return ((Boolean) ((C0512c) this.f829h).invoke(obj)).booleanValue();
            case 9:
                return ((Boolean) ((C0512c) this.f829h).invoke(obj)).booleanValue();
            case 10:
                return ((Boolean) ((C0512c) this.f829h).invoke(obj)).booleanValue();
            case 11:
                return ((Boolean) ((C0512c) this.f829h).invoke(obj)).booleanValue();
            case 12:
                return ((Boolean) ((C0512c) this.f829h).invoke(obj)).booleanValue();
            case 13:
                return !((AbstractC2963b0) obj).f9217g.mo6235a(EnumC2824a.f9166s) || ((C1204a) this.f829h).f4043d;
            case 14:
                C4305a c4305a2 = (C4305a) obj;
                C4322r c4322r = (C4322r) ((C0184c) this.f829h).f469a;
                return c4305a2.equals(c4322r.f14402B) || c4305a2.equals(c4322r.f14403C);
            case 15:
                C5776c c5776c = (C5776c) obj;
                return !AbstractC1089i.m2780n0(c5776c.f23509b) && (c5776c.f23508a.contains(C5777d.f23510m) || ((C3408s) this.f829h).f11014p);
            case 16:
                AbstractC2804q abstractC2804q = (AbstractC2804q) obj;
                return (abstractC2804q instanceof C2797j) && ((C0561n) this.f829h).test((C2797j) abstractC2804q);
            case 17:
                InterfaceC4314j interfaceC4314j = (InterfaceC4314j) this.f829h;
                C2837e c2837e = (C2837e) obj;
                if (interfaceC4314j == c2837e.f9229b) {
                    return true;
                }
                if (interfaceC4314j instanceof InterfaceC4318n) {
                    return AbstractC1089i.m2757a0(interfaceC4314j, c2837e.f9228a);
                }
                return false;
            case 18:
                return ((EnumC0251a) ((Map.Entry) obj).getKey()).ordinal() <= ((EnumC0251a) this.f829h).ordinal();
            case 19:
                return ((Boolean) ((C0512c) this.f829h).invoke(obj)).booleanValue();
            case 20:
                return ((Boolean) ((C0512c) this.f829h).invoke(obj)).booleanValue();
            case 21:
                return ((Boolean) ((C0532s) this.f829h).invoke(obj)).booleanValue();
            case 22:
                return ((Boolean) ((C0512c) this.f829h).invoke(obj)).booleanValue();
            case 23:
                return ((C3406q) obj) == ((C3406q) this.f829h);
            case 24:
                return ((C3514r) obj) == ((C3514r) this.f829h);
            case 25:
                return ((C3535r) this.f829h).f11499b.m547c((C3515s) obj).f11503b;
            case 26:
                return ((Boolean) ((C0512c) this.f829h).invoke(obj)).booleanValue();
            case 27:
                return ((Boolean) ((C0512c) this.f829h).invoke(obj)).booleanValue();
            case 28:
                return ((Boolean) ((C0512c) this.f829h).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((C0532s) this.f829h).invoke(obj)).booleanValue();
        }
    }
}
