package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: h5 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0271h5 extends av0 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: f */
    public int f2143f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f2144g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0343j5 f2145h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0271h5(C0343j5 c0343j5, InterfaceC0322ik interfaceC0322ik) {
        super(interfaceC0322ik);
        this.f2145h = c0343j5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: g */
    public final InterfaceC0322ik mo15g(Object obj, InterfaceC0322ik interfaceC0322ik) {
        C0271h5 c0271h5 = new C0271h5(this.f2145h, interfaceC0322ik);
        c0271h5.f2144g = obj;
        return c0271h5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        return ((C0271h5) mo15g((r51) obj, (InterfaceC0322ik) obj2)).mo16m(na1.f4229a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        if (r13 == r5) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        if (r13 != r5) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        return r5;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:17:0x004f). Please report as a decompilation issue!!! */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo16m(Object obj) {
        r51 r51Var;
        Object obj2;
        int i = this.f2143f;
        C0343j5 c0343j5 = this.f2145h;
        EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
        if (i == 0) {
            w60.m4891M(obj);
            r51Var = (r51) this.f2144g;
            this.f2144g = r51Var;
            this.f2143f = 1;
            obj = m61.m2438b(r51Var, (3 & 1) != 0, jr0.f2934e, this);
        } else if (i == 1) {
            r51Var = (r51) this.f2144g;
            w60.m4891M(obj);
        } else {
            if (i != 2) {
                C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r51Var = (r51) this.f2144g;
            w60.m4891M(obj);
            List list = ((ir0) obj).f2610a;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Object obj3 = list.get(i3);
                if (((nr0) obj3).f4308d) {
                    arrayList.add(obj3);
                }
            }
            int size2 = arrayList.size();
            while (true) {
                if (i2 >= size2) {
                    obj2 = null;
                    break;
                }
                obj2 = arrayList.get(i2);
                if (z60.m5449s(((nr0) obj2).f4305a, c0343j5.f2728h)) {
                    break;
                }
                i2++;
            }
            nr0 nr0Var = (nr0) obj2;
            if (nr0Var == null) {
                nr0Var = (nr0) AbstractC0960ye.m5241K(arrayList);
            }
            if (nr0Var != null) {
                c0343j5.f2728h = nr0Var.f4305a;
                c0343j5.f2722b = nr0Var.f4307c;
            }
            if (arrayList.isEmpty()) {
                c0343j5.f2728h = -1L;
                return na1.f4229a;
            }
            this.f2144g = r51Var;
            this.f2143f = 2;
            obj = r51Var.m3387a(jr0.f2934e, this);
        }
        nr0 nr0Var2 = (nr0) obj;
        c0343j5.f2728h = nr0Var2.f4305a;
        c0343j5.f2722b = nr0Var2.f4307c;
        this.f2144g = r51Var;
        this.f2143f = 2;
        obj = r51Var.m3387a(jr0.f2934e, this);
    }
}
