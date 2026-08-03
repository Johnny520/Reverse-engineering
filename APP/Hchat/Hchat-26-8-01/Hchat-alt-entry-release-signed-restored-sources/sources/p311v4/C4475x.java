package p311v4;

import p068eh.AbstractC0921a;
import p136j8.C2104o;
import p326w4.C4683c;

/* JADX INFO: renamed from: v4.x */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4475x extends AbstractC4457f0 {

    /* JADX INFO: renamed from: i */
    public static final String[] f14823i = {"static-put", "static-get", "instance-put", "instance-get", "invoke-static", "invoke-instance", "invoke-constructor", "invoke-direct", "invoke-interface"};

    /* JADX INFO: renamed from: g */
    public final int f14824g;

    /* JADX INFO: renamed from: h */
    public final AbstractC4446a f14825h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4475x(int i9, AbstractC4446a abstractC4446a) {
        this.f14824g = i9;
        this.f14825h = abstractC4446a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static boolean m8915k(int i9) {
        return i9 == 0 || i9 == 1 || i9 == 2 || i9 == 3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static C4475x m8916l(int i9, AbstractC4446a abstractC4446a) {
        if (!m8915k(i9)) {
            switch (i9) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    if (!(abstractC4446a instanceof AbstractC4454e)) {
                        C2104o.m5298x(abstractC4446a.getClass(), "ref has wrong type: ");
                        return null;
                    }
                    break;
                default:
                    C2104o.m5294t(AbstractC0921a.m2249l(i9, "type is out of range: "));
                    return null;
            }
        } else if (!(abstractC4446a instanceof C4464m)) {
            C2104o.m5298x(abstractC4446a.getClass(), "ref has wrong type: ");
            return null;
        }
        return new C4475x(i9, abstractC4446a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p376z4.InterfaceC6097k
    /* JADX INFO: renamed from: a */
    public final String mo4901a() {
        return f14823i[this.f14824g] + "," + this.f14825h.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p311v4.AbstractC4446a
    /* JADX INFO: renamed from: e */
    public final int mo8896e(AbstractC4446a abstractC4446a) {
        C4475x c4475x = (C4475x) abstractC4446a;
        int i9 = c4475x.f14824g;
        int i10 = this.f14824g;
        return i10 == i9 ? this.f14825h.compareTo(c4475x.f14825h) : Integer.compare(i10, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p326w4.InterfaceC4684d
    public final C4683c getType() {
        return C4683c.f15610B;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p311v4.AbstractC4446a
    /* JADX INFO: renamed from: i */
    public final boolean mo8897i() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p311v4.AbstractC4446a
    /* JADX INFO: renamed from: j */
    public final String mo8898j() {
        return "method handle";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "method-handle{" + mo4901a() + "}";
    }
}
