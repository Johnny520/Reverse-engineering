package p047I0;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings;
import java.util.Set;
import p000A.C0002B;
import p000A.C0049a;
import p056K2.C0891q;
import p061L2.AbstractC0973m;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1184i;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;
import p127Z2.AbstractC1784a;
import p135b.C1836x;
import p158f0.AbstractC2074f;
import p158f0.AbstractC2082n;
import p172h3.AbstractC2250j;
import p172h3.C2242b;
import p172h3.C2243c;
import p172h3.C2249i;
import p172h3.InterfaceC2247g;
import p178i3.InterfaceC2324e;
import p186k.C2409F;

/* JADX INFO: renamed from: I0.g1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0730g1 extends AbstractC1184i implements InterfaceC1603e {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f2301h = 1;

    /* JADX INFO: renamed from: i */
    public Object f2302i;

    /* JADX INFO: renamed from: j */
    public int f2303j;

    /* JADX INFO: renamed from: k */
    public Object f2304k;

    /* JADX INFO: renamed from: l */
    public Object f2305l;

    /* JADX INFO: renamed from: m */
    public Object f2306m;

    /* JADX INFO: renamed from: n */
    public Object f2307n;

    /* JADX INFO: renamed from: o */
    public /* synthetic */ Object f2308o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f2309p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0730g1(InterfaceC1599a interfaceC1599a, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f2309p = interfaceC1599a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) throws Throwable {
        InterfaceC2324e interfaceC2324e = (InterfaceC2324e) obj;
        InterfaceC1046d interfaceC1046d = (InterfaceC1046d) obj2;
        switch (this.f2301h) {
            case 0:
                return ((C0730g1) mo7n(interfaceC1046d, interfaceC2324e)).mo8p(C0891q.f2780a);
            default:
                ((C0730g1) mo7n(interfaceC1046d, interfaceC2324e)).mo8p(C0891q.f2780a);
                return EnumC1152a.f3788d;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        switch (this.f2301h) {
            case 0:
                C0730g1 c0730g1 = new C0730g1((ContentResolver) this.f2305l, (Uri) this.f2306m, (C0733h1) this.f2307n, (C2243c) this.f2308o, (Context) this.f2309p, interfaceC1046d);
                c0730g1.f2302i = obj;
                return c0730g1;
            default:
                C0730g1 c0730g12 = new C0730g1((InterfaceC1599a) this.f2309p, interfaceC1046d);
                c0730g12.f2308o = obj;
                return c0730g12;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:90:0x01be) to fix multi-entry loop: BACK_EDGE: B:90:0x01be -> B:87:0x01b6 */
    /* JADX DEBUG: Incorrect finally slice size: {[MOVE, CONST] complete}, expected: {[MOVE] complete} */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x01b6, code lost:
    
        r7 = r18;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Path cross not found for [B:47:0x011f, B:59:0x0150], limit reached: 164 */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d2 A[LOOP:0: B:40:0x00fa->B:100:0x01d2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x025d A[Catch: all -> 0x0211, TRY_LEAVE, TryCatch #0 {all -> 0x0211, blocks: (B:118:0x020b, B:129:0x0243, B:133:0x0255, B:135:0x025d, B:125:0x0224, B:128:0x023a), top: B:143:0x01fd }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0178 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01be  */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:138:0x0282 -> B:129:0x0243). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x01b5 -> B:87:0x01b6). Please report as a decompilation issue!!! */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo8p(Object obj) throws Throwable {
        InterfaceC2324e interfaceC2324e;
        C2242b c2242b;
        InterfaceC2324e interfaceC2324e2;
        Object objM4068b;
        C2242b c2242b2;
        C1836x c1836x;
        InterfaceC2324e interfaceC2324e3;
        C2409F c2409f;
        InterfaceC1601c c0049a;
        InterfaceC2247g interfaceC2247gM4101a;
        AbstractC2074f abstractC2074fMo3797u;
        AbstractC2074f abstractC2074fM3813j;
        Object obj2;
        Object objMo4091p;
        Set set;
        boolean z5;
        C1836x c1836x2;
        int i5;
        int i6;
        Object objMo4082g;
        switch (this.f2301h) {
            case 0:
                C0733h1 c0733h1 = (C0733h1) this.f2307n;
                ContentResolver contentResolver = (ContentResolver) this.f2305l;
                EnumC1152a enumC1152a = EnumC1152a.f3788d;
                int i7 = this.f2303j;
                try {
                    if (i7 == 0) {
                        AbstractC1784a.m3205S(obj);
                        interfaceC2324e = (InterfaceC2324e) this.f2302i;
                        contentResolver.registerContentObserver((Uri) this.f2306m, false, c0733h1);
                        c2242b = new C2242b((C2243c) this.f2308o);
                    } else if (i7 == 1) {
                        c2242b2 = (C2242b) this.f2304k;
                        InterfaceC2324e interfaceC2324e4 = (InterfaceC2324e) this.f2302i;
                        AbstractC1784a.m3205S(obj);
                        interfaceC2324e2 = interfaceC2324e4;
                        objM4068b = obj;
                        if (((Boolean) objM4068b).booleanValue()) {
                            contentResolver.unregisterContentObserver(c0733h1);
                            return C0891q.f2780a;
                        }
                        c2242b2.m4069c();
                        Float f2 = new Float(Settings.Global.getFloat(((Context) this.f2309p).getContentResolver(), "animator_duration_scale", 1.0f));
                        this.f2302i = interfaceC2324e2;
                        this.f2304k = c2242b2;
                        this.f2303j = 2;
                        if (interfaceC2324e2.mo9c(f2, this) == enumC1152a) {
                            return enumC1152a;
                        }
                        InterfaceC2324e interfaceC2324e5 = interfaceC2324e2;
                        c2242b = c2242b2;
                        interfaceC2324e = interfaceC2324e5;
                    } else {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C2242b c2242b3 = (C2242b) this.f2304k;
                        InterfaceC2324e interfaceC2324e6 = (InterfaceC2324e) this.f2302i;
                        AbstractC1784a.m3205S(obj);
                        c2242b = c2242b3;
                        interfaceC2324e = interfaceC2324e6;
                    }
                    this.f2302i = interfaceC2324e;
                    this.f2304k = c2242b;
                    this.f2303j = 1;
                    objM4068b = c2242b.m4068b(this);
                    if (objM4068b == enumC1152a) {
                        return enumC1152a;
                    }
                    C2242b c2242b4 = c2242b;
                    interfaceC2324e2 = interfaceC2324e;
                    c2242b2 = c2242b4;
                    if (((Boolean) objM4068b).booleanValue()) {
                    }
                } catch (Throwable th) {
                    contentResolver.unregisterContentObserver(c0733h1);
                    throw th;
                }
                break;
            default:
                EnumC1152a enumC1152a2 = EnumC1152a.f3788d;
                int i8 = this.f2303j;
                int i9 = 2;
                try {
                    if (i8 == 0) {
                        AbstractC1784a.m3205S(obj);
                        interfaceC2324e3 = (InterfaceC2324e) this.f2308o;
                        c2409f = new C2409F();
                        c0049a = new C0049a(14, c2409f);
                        interfaceC2247gM4101a = AbstractC2250j.m4101a(Integer.MAX_VALUE, 6, null);
                        C0002B c0002b = new C0002B(10, interfaceC2247gM4101a);
                        AbstractC2082n.m3829e(AbstractC2082n.f6970a);
                        synchronized (AbstractC2082n.f6972c) {
                            AbstractC2082n.f6977h = AbstractC0973m.m2020a0(AbstractC2082n.f6977h, c0002b);
                        }
                        c1836x = new C1836x(2, c0002b);
                        abstractC2074fMo3797u = AbstractC2082n.m3834j().mo3797u(c0049a);
                        InterfaceC1599a interfaceC1599a = (InterfaceC1599a) this.f2309p;
                        try {
                            abstractC2074fM3813j = abstractC2074fMo3797u.m3813j();
                            try {
                                Object objMo6a = interfaceC1599a.mo6a();
                                abstractC2074fMo3797u.mo3787c();
                                this.f2308o = interfaceC2324e3;
                                this.f2304k = c2409f;
                                this.f2305l = c0049a;
                                this.f2306m = interfaceC2247gM4101a;
                                this.f2307n = c1836x;
                                this.f2302i = objMo6a;
                                this.f2303j = 1;
                                if (interfaceC2324e3.mo9c(objMo6a, this) == enumC1152a2) {
                                    return enumC1152a2;
                                }
                                obj2 = objMo6a;
                            } finally {
                                AbstractC2074f.m3811q(abstractC2074fM3813j);
                            }
                        } finally {
                            abstractC2074fMo3797u.mo3787c();
                        }
                    } else if (i8 == 1) {
                        obj2 = this.f2302i;
                        c1836x = (C1836x) this.f2307n;
                        interfaceC2247gM4101a = (InterfaceC2247g) this.f2306m;
                        c0049a = (InterfaceC1601c) this.f2305l;
                        c2409f = (C2409F) this.f2304k;
                        interfaceC2324e3 = (InterfaceC2324e) this.f2308o;
                        AbstractC1784a.m3205S(obj);
                    } else if (i8 == 2) {
                        obj2 = this.f2302i;
                        c1836x = (C1836x) this.f2307n;
                        interfaceC2247gM4101a = (InterfaceC2247g) this.f2306m;
                        c0049a = (InterfaceC1601c) this.f2305l;
                        c2409f = (C2409F) this.f2304k;
                        interfaceC2324e3 = (InterfaceC2324e) this.f2308o;
                        AbstractC1784a.m3205S(obj);
                        objMo4091p = obj;
                        set = (Set) objMo4091p;
                        z5 = false;
                        while (true) {
                            if (z5) {
                                try {
                                    Object[] objArr = c2409f.f7794b;
                                    long[] jArr = c2409f.f7793a;
                                    i5 = i9;
                                    int length = jArr.length - 2;
                                    if (length >= 0) {
                                        int i10 = 0;
                                        while (true) {
                                            long j5 = jArr[i10];
                                            c1836x2 = c1836x;
                                            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i11 = 8;
                                                int i12 = 8 - ((~(i10 - length)) >>> 31);
                                                int i13 = 0;
                                                while (i13 < i12) {
                                                    if ((j5 & 255) < 128) {
                                                        i6 = i11;
                                                        try {
                                                            if (set.contains(objArr[(i10 << 3) + i13])) {
                                                            }
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            c1836x = c1836x2;
                                                            c1836x.m3299a();
                                                            throw th;
                                                        }
                                                    } else {
                                                        i6 = i11;
                                                    }
                                                    j5 >>= i6;
                                                    i13++;
                                                    i11 = i6;
                                                }
                                                if (i12 == i11) {
                                                }
                                            }
                                            if (i10 != length) {
                                                i10++;
                                                c1836x = c1836x2;
                                            }
                                        }
                                    } else {
                                        c1836x2 = c1836x;
                                    }
                                    z5 = false;
                                    objMo4082g = interfaceC2247gM4101a.mo4082g();
                                    if (objMo4082g instanceof C2249i) {
                                        objMo4082g = null;
                                    }
                                    set = (Set) objMo4082g;
                                    if (set != null) {
                                        i9 = i5;
                                        c1836x = c1836x2;
                                    } else {
                                        if (z5) {
                                            try {
                                                c2409f.m4280b();
                                                abstractC2074fMo3797u = AbstractC2082n.m3834j().mo3797u(c0049a);
                                                InterfaceC1599a interfaceC1599a2 = (InterfaceC1599a) this.f2309p;
                                                try {
                                                    Object objMo6a2 = interfaceC1599a2.mo6a();
                                                    abstractC2074fMo3797u.mo3787c();
                                                    if (!AbstractC1665j.m2981a(objMo6a2, obj2)) {
                                                        this.f2308o = interfaceC2324e3;
                                                        this.f2304k = c2409f;
                                                        this.f2305l = c0049a;
                                                        this.f2306m = interfaceC2247gM4101a;
                                                        c1836x = c1836x2;
                                                        this.f2307n = c1836x;
                                                        this.f2302i = objMo6a2;
                                                        this.f2303j = 3;
                                                        if (interfaceC2324e3.mo9c(objMo6a2, this) != enumC1152a2) {
                                                            obj2 = objMo6a2;
                                                        }
                                                        return enumC1152a2;
                                                    }
                                                    c1836x = c1836x2;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                }
                                            } catch (Throwable th4) {
                                                try {
                                                    throw th4;
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    throw th;
                                                }
                                            }
                                            abstractC2074fM3813j = abstractC2074fMo3797u.m3813j();
                                            break;
                                        }
                                        i9 = i5;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    c1836x2 = c1836x;
                                }
                            } else {
                                i5 = i9;
                                c1836x2 = c1836x;
                            }
                            z5 = true;
                            objMo4082g = interfaceC2247gM4101a.mo4082g();
                            if (objMo4082g instanceof C2249i) {
                            }
                            set = (Set) objMo4082g;
                            if (set != null) {
                            }
                        }
                    } else {
                        if (i8 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj2 = this.f2302i;
                        c1836x = (C1836x) this.f2307n;
                        interfaceC2247gM4101a = (InterfaceC2247g) this.f2306m;
                        c0049a = (InterfaceC1601c) this.f2305l;
                        c2409f = (C2409F) this.f2304k;
                        interfaceC2324e3 = (InterfaceC2324e) this.f2308o;
                        AbstractC1784a.m3205S(obj);
                        i5 = 2;
                        i9 = i5;
                    }
                    this.f2308o = interfaceC2324e3;
                    this.f2304k = c2409f;
                    this.f2305l = c0049a;
                    this.f2306m = interfaceC2247gM4101a;
                    this.f2307n = c1836x;
                    this.f2302i = obj2;
                    this.f2303j = i9;
                    objMo4091p = interfaceC2247gM4101a.mo4091p(this);
                    if (objMo4091p != enumC1152a2) {
                        set = (Set) objMo4091p;
                        z5 = false;
                        while (true) {
                            if (z5) {
                            }
                            z5 = true;
                            objMo4082g = interfaceC2247gM4101a.mo4082g();
                            if (objMo4082g instanceof C2249i) {
                            }
                            set = (Set) objMo4082g;
                            if (set != null) {
                            }
                            i9 = i5;
                            c1836x = c1836x2;
                        }
                    }
                    return enumC1152a2;
                } catch (Throwable th7) {
                    th = th7;
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0730g1(ContentResolver contentResolver, Uri uri, C0733h1 c0733h1, C2243c c2243c, Context context, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f2305l = contentResolver;
        this.f2306m = uri;
        this.f2307n = c0733h1;
        this.f2308o = c2243c;
        this.f2309p = context;
    }
}
