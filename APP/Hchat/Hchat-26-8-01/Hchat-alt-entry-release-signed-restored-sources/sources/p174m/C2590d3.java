package p174m;

import gg.C1425u;
import java.util.List;
import ng.C3013k;
import p000a.AbstractC0000a;
import p014b.C0126e;
import p049d9.C0750k;
import p070f0.C0970b;
import p077f8.AbstractC1089i;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1235p;
import p136j8.C2104o;
import p249qg.C3560e1;
import p267s1.C3887c;
import p267s1.C3903k;
import p267s1.C3914t;
import p276sf.C3967n;
import p279t1.C4084d;
import p293u2.C4247q;
import p293u2.InterfaceC4233c;
import p352xf.EnumC5799a;
import p370yf.AbstractC6038c;
import sg.AbstractC3978j;
import sg.C3971c;
import sg.C3977i;
import tf.AbstractC4166m;
import tf.C4173t;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: m.d3 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2590d3 extends AbstractC2636o1 {

    /* JADX INFO: renamed from: f */
    public final C3971c f8389f;

    /* JADX INFO: renamed from: g */
    public C3560e1 f8390g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2590d3(C2637o2 c2637o2, C2589d2 c2589d2, InterfaceC4233c interfaceC4233c) {
        super(c2637o2, c2589d2, interfaceC4233c);
        this.f8389f = AbstractC3978j.m8218a(Integer.MAX_VALUE, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00dd, code lost:
    
        if (r0.invoke(r3, r7) == r10) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r0v10, types: [fg.p, gg.a] */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m6053c(C2590d3 c2590d3, C2637o2 c2637o2, C2580b3 c2580b3, AbstractC6038c abstractC6038c) {
        C2585c3 c2585c3;
        c2590d3.getClass();
        C0126e c0126e = c2590d3.f8587e;
        if (abstractC6038c instanceof C2585c3) {
            c2585c3 = (C2585c3) abstractC6038c;
            int i9 = c2585c3.f8381i;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c2585c3.f8381i = i9 - Integer.MIN_VALUE;
            } else {
                c2585c3 = new C2585c3(c2590d3, abstractC6038c);
            }
        }
        C2585c3 c2585c32 = c2585c3;
        Object obj = c2585c32.f8379g;
        int i10 = c2585c32.f8381i;
        Object obj2 = EnumC5799a.f23547g;
        if (i10 == 0) {
            AbstractC1089i.m2732I0(obj);
            C1425u c1425u = new C1425u();
            c1425u.f4738g = c2580b3;
            long j3 = c2580b3.f8369b;
            long j4 = c2580b3.f8368a;
            ((C4084d) c0126e.f332h).m8265a(j3, Float.intBitsToFloat((int) (j4 >> 32)));
            ((C4084d) c0126e.f333i).m8265a(j3, Float.intBitsToFloat((int) (j4 & 4294967295L)));
            C2580b3 c2580b3M6054e = m6054e(c2590d3.f8389f);
            if (c2580b3M6054e != null) {
                long j5 = c2580b3M6054e.f8369b;
                long j10 = c2580b3M6054e.f8368a;
                ((C4084d) c0126e.f332h).m8265a(j5, Float.intBitsToFloat((int) (j10 >> 32)));
                ((C4084d) c0126e.f333i).m8265a(j5, Float.intBitsToFloat((int) (j10 & 4294967295L)));
                c1425u.f4738g = ((C2580b3) c1425u.f4738g).m6050a(c2580b3M6054e);
            }
            InterfaceC1235p c0970b = new C0970b(c2590d3, c2637o2, c1425u, null, 4);
            c2585c32.f8381i = 1;
            if (c2590d3.m6087b(c0970b, c2585c32) != obj2) {
            }
            return obj2;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                AbstractC1089i.m2732I0(obj);
                return C3967n.f12976a;
            }
            C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC1089i.m2732I0(obj);
        ?? r02 = c2590d3.f8584b;
        C4247q c4247q = new C4247q(AbstractC0000a.m59d(((C4084d) c0126e.f332h).m8266b(Float.MAX_VALUE), ((C4084d) c0126e.f333i).m8266b(Float.MAX_VALUE)));
        c2585c32.f8381i = 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static C2580b3 m6054e(C3971c c3971c) {
        C2580b3 c2580b3 = null;
        C3013k c3013kM3175B = AbstractC1184v0.m3175B(new C0750k((Object) new C2603g1(c3971c, 1), (InterfaceC5557c) (0 == true ? 1 : 0), 2));
        while (c3013kM3175B.hasNext()) {
            C2580b3 c2580b3M6050a = (C2580b3) c3013kM3175B.next();
            if (c2580b3 != null) {
                c2580b3M6050a = c2580b3.m6050a(c2580b3M6050a);
            }
            c2580b3 = c2580b3M6050a;
        }
        return c2580b3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: d */
    public final boolean m6055d(C3903k c3903k) {
        boolean z9;
        boolean z10;
        boolean z11;
        C3971c c3971c;
        C2637o2 c2637o2;
        C3914t c3914t = (C3914t) AbstractC4166m.m8424v1(c3903k.f12800a);
        if (c3914t != null) {
            List list = c3914t.f12846m;
            if (list == null) {
                list = C4173t.f13710g;
            }
            int size = list.size();
            int i9 = 0;
            z11 = false;
            while (true) {
                c3971c = this.f8389f;
                c2637o2 = this.f8583a;
                if (i9 >= size) {
                    break;
                }
                C3887c c3887c = (C3887c) list.get(i9);
                long j3 = c3887c.f12751d ^ (-9223372034707292160L);
                if (!(c2637o2.m6096i(c2637o2.m6092e(j3)) == 0.0f)) {
                    z11 = !(c3971c.mo8208p(new C2580b3(j3, c3887c.f12748a, false)) instanceof C3977i) || z11;
                }
                i9++;
            }
            z9 = true;
            z10 = false;
            long j4 = c3914t.f12845l ^ (-9223372034707292160L);
            boolean z12 = c3903k.f12805f == 12;
            if (!(c2637o2.m6096i(c2637o2.m6092e(j4)) == 0.0f) || z12) {
                if (!(c3971c.mo8208p(new C2580b3(j4, c3914t.f12835b, z12)) instanceof C3977i) || z11) {
                    z11 = true;
                }
            }
            return (!z11 || this.f8586d) ? z9 : z10;
        }
        z9 = true;
        z10 = false;
        z11 = z10;
        if (z11) {
        }
    }
}
