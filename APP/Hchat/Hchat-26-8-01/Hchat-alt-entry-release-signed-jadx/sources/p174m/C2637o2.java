package p174m;

import android.view.ViewTreeObserver;
import gg.C1424t;
import java.lang.reflect.Method;
import p015b0.C0136d0;
import p027c0.C0368m;
import p057e1.C0807b;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p119i2.C1955z;
import p136j8.C2104o;
import p144k.EnumC2164d1;
import p144k.InterfaceC2185k1;
import p253r1.C3647d;
import p276sf.C3967n;
import p293u2.C4247q;
import p339x1.AbstractC5618k;
import p352xf.EnumC5799a;
import p357y1.ViewTreeObserverOnGlobalLayoutListenerC5934t;
import p370yf.AbstractC6038c;
import p370yf.AbstractC6044i;

/* JADX INFO: renamed from: m.o2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2637o2 {

    /* JADX INFO: renamed from: a */
    public InterfaceC2613i2 f8588a;

    /* JADX INFO: renamed from: b */
    public InterfaceC2185k1 f8589b;

    /* JADX INFO: renamed from: c */
    public C2638p f8590c;

    /* JADX INFO: renamed from: d */
    public EnumC2640p1 f8591d;

    /* JADX INFO: renamed from: e */
    public boolean f8592e;

    /* JADX INFO: renamed from: f */
    public C3647d f8593f;

    /* JADX INFO: renamed from: g */
    public final C2609h2 f8594g;

    /* JADX INFO: renamed from: h */
    public final C2584c2 f8595h;

    /* JADX INFO: renamed from: i */
    public boolean f8596i;

    /* JADX INFO: renamed from: j */
    public int f8597j = 1;

    /* JADX INFO: renamed from: k */
    public InterfaceC2660u1 f8598k = AbstractC2574a2.f8344b;

    /* JADX INFO: renamed from: l */
    public final C2629m2 f8599l = new C2629m2(this);

    /* JADX INFO: renamed from: m */
    public final C0136d0 f8600m = new C0136d0(this, 27);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2637o2(InterfaceC2613i2 interfaceC2613i2, InterfaceC2185k1 interfaceC2185k1, C2638p c2638p, EnumC2640p1 enumC2640p1, boolean z9, C3647d c3647d, C2609h2 c2609h2, C2584c2 c2584c2) {
        this.f8588a = interfaceC2613i2;
        this.f8589b = interfaceC2185k1;
        this.f8590c = c2638p;
        this.f8591d = enumC2640p1;
        this.f8592e = z9;
        this.f8593f = c3647d;
        this.f8594g = c2609h2;
        this.f8595h = c2584c2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m6088a(long j3, AbstractC6038c abstractC6038c) {
        C2617j2 c2617j2;
        C2637o2 c2637o2;
        Throwable th2;
        C1424t c1424t;
        if (abstractC6038c instanceof C2617j2) {
            c2617j2 = (C2617j2) abstractC6038c;
            int i9 = c2617j2.f8513j;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c2617j2.f8513j = i9 - Integer.MIN_VALUE;
            } else {
                c2617j2 = new C2617j2(this, abstractC6038c);
            }
        }
        Object obj = c2617j2.f8511h;
        int i10 = c2617j2.f8513j;
        if (i10 != 0) {
            if (i10 != 1) {
                C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c1424t = c2617j2.f8510g;
            try {
                AbstractC1089i.m2732I0(obj);
                c2637o2 = this;
                c2637o2.f8596i = false;
                return new C4247q(c1424t.f4737g);
            } catch (Throwable th3) {
                th2 = th3;
                c2637o2 = this;
                c2637o2.f8596i = false;
                throw th2;
            }
        }
        AbstractC1089i.m2732I0(obj);
        C1424t c1424t2 = new C1424t();
        c1424t2.f4737g = j3;
        this.f8596i = true;
        try {
            EnumC2164d1 enumC2164d1 = EnumC2164d1.f7173g;
            c2637o2 = this;
            try {
                C2625l2 c2625l2 = new C2625l2(c2637o2, c1424t2, j3, null);
                c2617j2.f8510g = c1424t2;
                c2617j2.f8513j = 1;
                Object objM6093f = m6093f(enumC2164d1, c2625l2, c2617j2);
                EnumC5799a enumC5799a = EnumC5799a.f23547g;
                if (objM6093f == enumC5799a) {
                    return enumC5799a;
                }
                c1424t = c1424t2;
                c2637o2.f8596i = false;
                return new C4247q(c1424t.f4737g);
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                c2637o2.f8596i = false;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            c2637o2 = this;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000d  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m6089b(long j3, boolean z9, AbstractC6044i abstractC6044i) {
        C3967n c3967n = C3967n.f12976a;
        if (z9) {
            C2638p c2638p = this.f8590c;
            C1955z c1955z = AbstractC2574a2.f8343a;
            if (!(c2638p instanceof C2638p)) {
                long jM8543a = C4247q.m8543a(0.0f, 0.0f, this.f8591d == EnumC2640p1.f8623h ? 1 : 2, j3);
                C2633n2 c2633n2 = new C2633n2(this, null);
                InterfaceC2185k1 interfaceC2185k1 = this.f8589b;
                EnumC5799a enumC5799a = EnumC5799a.f23547g;
                if (interfaceC2185k1 == null || !(this.f8588a.mo5461d() || this.f8588a.mo5460c())) {
                    C2633n2 c2633n22 = new C2633n2(this, abstractC6044i);
                    c2633n22.f8569j = jM8543a;
                    Object objInvokeSuspend = c2633n22.invokeSuspend(c3967n);
                    if (objInvokeSuspend == enumC5799a) {
                        return objInvokeSuspend;
                    }
                } else {
                    Object objMo1615a = interfaceC2185k1.mo1615a(jM8543a, c2633n2, abstractC6044i);
                    if (objMo1615a == enumC5799a) {
                        return objMo1615a;
                    }
                }
            }
        }
        return c3967n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final long m6090c(InterfaceC2660u1 interfaceC2660u1, long j3, int i9) {
        long jM7629d = this.f8593f.m7629d(i9, j3);
        long jM2041d = C0807b.m2041d(j3, jM7629d);
        long jM6092e = m6092e(m6095h(interfaceC2660u1.mo6077a(m6094g(m6092e(this.f8591d == EnumC2640p1.f8623h ? C0807b.m2038a(jM2041d, 0.0f, 1) : C0807b.m2038a(jM2041d, 0.0f, 2))))));
        C2609h2 c2609h2 = this.f8594g;
        if (c2609h2.f23801t) {
            ViewTreeObserver viewTreeObserver = ((ViewTreeObserverOnGlobalLayoutListenerC5934t) AbstractC5618k.m10168x(c2609h2)).getViewTreeObserver();
            try {
                if (ViewTreeObserverOnGlobalLayoutListenerC5934t.f24061Y0 == null) {
                    Method declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    declaredMethod.setAccessible(true);
                    ViewTreeObserverOnGlobalLayoutListenerC5934t.f24061Y0 = declaredMethod;
                }
                Method method = ViewTreeObserverOnGlobalLayoutListenerC5934t.f24061Y0;
                if (method != null) {
                    method.invoke(viewTreeObserver, null);
                }
            } catch (Exception unused) {
            }
        }
        return C0807b.m2042e(C0807b.m2042e(jM7629d, jM6092e), this.f8593f.m7627b(jM6092e, C0807b.m2041d(jM2041d, jM6092e), i9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final float m6091d(float f3) {
        return this.f8592e ? f3 * (-1) : f3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final long m6092e(long j3) {
        return this.f8592e ? C0807b.m2043f(j3, -1.0f) : j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final Object m6093f(EnumC2164d1 enumC2164d1, InterfaceC1235p interfaceC1235p, AbstractC6038c abstractC6038c) {
        Object objMo5459b = this.f8588a.mo5459b(enumC2164d1, new C0368m(this, interfaceC1235p, null, 14), abstractC6038c);
        return objMo5459b == EnumC5799a.f23547g ? objMo5459b : C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final float m6094g(long j3) {
        return Float.intBitsToFloat((int) (this.f8591d == EnumC2640p1.f8623h ? j3 >> 32 : j3 & 4294967295L));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final long m6095h(float f3) {
        long jFloatToRawIntBits;
        long j3;
        if (f3 == 0.0f) {
            return 0L;
        }
        if (this.f8591d == EnumC2640p1.f8623h) {
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(f3);
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j3 = jFloatToRawIntBits2 << 32;
        } else {
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(f3);
            j3 = jFloatToRawIntBits3 << 32;
        }
        return j3 | (jFloatToRawIntBits & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final float m6096i(long j3) {
        int i9 = (int) (4294967295L & j3);
        int i10 = (int) (j3 >> 32);
        double dAtan2 = (float) Math.atan2(Math.abs(Float.intBitsToFloat(i9)), Math.abs(Float.intBitsToFloat(i10)));
        EnumC2640p1 enumC2640p1 = this.f8591d;
        if (dAtan2 >= 0.7853981633974483d) {
            if (enumC2640p1 == EnumC2640p1.f8622g) {
                return Float.intBitsToFloat(i9);
            }
            return 0.0f;
        }
        if (enumC2640p1 == EnumC2640p1.f8623h) {
            return Float.intBitsToFloat(i10);
        }
        return 0.0f;
    }
}
