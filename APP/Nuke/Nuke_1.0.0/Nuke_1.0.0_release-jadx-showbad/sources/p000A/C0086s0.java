package p000A;

import android.app.PendingIntent;
import java.util.concurrent.CancellationException;
import me.dartcv.nuke.BuildConfig;
import p007B0.AbstractC0208v;
import p007B0.C0185S;
import p007B0.C0200n;
import p007B0.C0209w;
import p007B0.EnumC0201o;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p074O2.InterfaceC1051i;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1183h;
import p112W2.InterfaceC1603e;
import p127Z2.AbstractC1784a;
import p143c3.C1906h;
import p160f3.AbstractC2162v;
import p179i4.AbstractC2352g;
import p227r.AbstractC2958J0;

/* JADX INFO: renamed from: A.s0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0086s0 extends AbstractC1183h implements InterfaceC1603e {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f389f;

    /* JADX INFO: renamed from: g */
    public int f390g;

    /* JADX INFO: renamed from: h */
    public Object f391h;

    /* JADX INFO: renamed from: i */
    public Object f392i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f393j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: W2.e */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0086s0(InterfaceC1051i interfaceC1051i, InterfaceC1603e interfaceC1603e, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f389f = 1;
        this.f392i = interfaceC1051i;
        this.f393j = (AbstractC1183h) interfaceC1603e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        switch (this.f389f) {
            case 0:
                return ((C0086s0) mo7n((InterfaceC1046d) obj2, (C0185S) obj)).mo8p(C0891q.f2780a);
            case BuildConfig.VERSION_CODE /* 1 */:
                return ((C0086s0) mo7n((InterfaceC1046d) obj2, (C0185S) obj)).mo8p(C0891q.f2780a);
            default:
                return ((C0086s0) mo7n((InterfaceC1046d) obj2, (C1906h) obj)).mo8p(C0891q.f2780a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [Q2.h, W2.e] */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        switch (this.f389f) {
            case 0:
                C0086s0 c0086s0 = new C0086s0((InterfaceC0092v0) this.f393j, interfaceC1046d, 0);
                c0086s0.f391h = obj;
                return c0086s0;
            case BuildConfig.VERSION_CODE /* 1 */:
                C0086s0 c0086s02 = new C0086s0((InterfaceC1051i) this.f392i, (InterfaceC1603e) this.f393j, interfaceC1046d);
                c0086s02.f391h = obj;
                return c0086s02;
            default:
                C0086s0 c0086s03 = new C0086s0((C0099z) this.f393j, interfaceC1046d, 2);
                c0086s03.f392i = obj;
                return c0086s03;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:29:0x0070 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:79:0x004f */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r14v9, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [B0.S, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [B0.S, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v19, types: [Q2.h, W2.e] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x003c -> B:15:0x003d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x009f -> B:28:0x006e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00b4 -> B:28:0x006e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x010f -> B:69:0x0112). Please report as a decompilation issue!!! */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo8p(Object obj) throws PendingIntent.CanceledException {
        C0185S c0185s;
        C0185S c0185s2;
        C0209w c0209w;
        int size;
        int i5;
        Object objM4196i;
        ?? r14;
        ?? r12;
        C1906h c1906h;
        Object objMo6a;
        switch (this.f389f) {
            case 0:
                InterfaceC0092v0 interfaceC0092v0 = (InterfaceC0092v0) this.f393j;
                int i6 = this.f390g;
                EnumC1152a enumC1152a = EnumC1152a.f3788d;
                if (i6 == 0) {
                    AbstractC1784a.m3205S(obj);
                    c0185s = (C0185S) this.f391h;
                    this.f391h = c0185s;
                    this.f390g = 1;
                    obj = AbstractC2958J0.m5157a(c0185s, (2 & 1) != 0, EnumC0201o.f703e, this);
                    if (obj == enumC1152a) {
                        return enumC1152a;
                    }
                } else {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c0209w = (C0209w) this.f392i;
                        c0185s2 = (C0185S) this.f391h;
                        AbstractC1784a.m3205S(obj);
                        ?? r142 = ((C0200n) obj).f696a;
                        size = r142.size();
                        i5 = 0;
                        while (i5 < size) {
                            C0209w c0209w2 = (C0209w) r142.get(i5);
                            if (AbstractC0208v.m315e(c0209w2.f711a, c0209w.f711a) && c0209w2.f714d) {
                                this.f391h = c0185s2;
                                this.f392i = c0209w;
                                this.f390g = 2;
                                obj = c0185s2.m271a(EnumC0201o.f703e, this);
                                if (obj == enumC1152a) {
                                    return enumC1152a;
                                }
                                ?? r1422 = ((C0200n) obj).f696a;
                                size = r1422.size();
                                i5 = 0;
                                while (i5 < size) {
                                }
                            } else {
                                i5++;
                            }
                        }
                        interfaceC0092v0.mo130c();
                        return C0891q.f2780a;
                    }
                    c0185s = (C0185S) this.f391h;
                    AbstractC1784a.m3205S(obj);
                }
                C0209w c0209w3 = (C0209w) obj;
                long j5 = c0209w3.f713c;
                interfaceC0092v0.mo131d();
                c0185s2 = c0185s;
                c0209w = c0209w3;
                this.f391h = c0185s2;
                this.f392i = c0209w;
                this.f390g = 2;
                obj = c0185s2.m271a(EnumC0201o.f703e, this);
                if (obj == enumC1152a) {
                }
                ?? r14222 = ((C0200n) obj).f696a;
                size = r14222.size();
                i5 = 0;
                while (i5 < size) {
                }
                interfaceC0092v0.mo130c();
                return C0891q.f2780a;
            case BuildConfig.VERSION_CODE /* 1 */:
                InterfaceC1051i interfaceC1051i = (InterfaceC1051i) this.f392i;
                ?? r13 = this.f390g;
                EnumC0201o enumC0201o = EnumC0201o.f704f;
                EnumC1152a enumC1152a2 = EnumC1152a.f3788d;
                try {
                } catch (CancellationException e5) {
                    e = e5;
                    if (AbstractC2162v.m3992n(interfaceC1051i)) {
                        throw e;
                    }
                    this.f391h = r13;
                    this.f390g = 3;
                    Object objM4196i2 = AbstractC2352g.m4196i(r13, enumC0201o, this);
                    r12 = r13;
                    if (objM4196i2 == enumC1152a2) {
                        return enumC1152a2;
                    }
                }
                if (r13 == 0) {
                    AbstractC1784a.m3205S(obj);
                    r14 = (C0185S) this.f391h;
                    if (!AbstractC2162v.m3992n(interfaceC1051i)) {
                    }
                } else if (r13 != 1) {
                    if (r13 == 2) {
                        C0185S c0185s3 = (C0185S) this.f391h;
                        AbstractC1784a.m3205S(obj);
                        r12 = c0185s3;
                    } else {
                        if (r13 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C0185S c0185s4 = (C0185S) this.f391h;
                        AbstractC1784a.m3205S(obj);
                        r12 = c0185s4;
                    }
                    r14 = r12;
                    if (!AbstractC2162v.m3992n(interfaceC1051i)) {
                        try {
                        } catch (CancellationException e6) {
                            r13 = r14;
                            e = e6;
                            if (AbstractC2162v.m3992n(interfaceC1051i)) {
                            }
                        }
                        ?? r15 = (AbstractC1183h) this.f393j;
                        this.f391h = r14;
                        this.f390g = 1;
                        if (r15.mo0g(r14, this) == enumC1152a2) {
                            return enumC1152a2;
                        }
                        r13 = r14;
                        this.f391h = r13;
                        this.f390g = 2;
                        objM4196i = AbstractC2352g.m4196i(r13, enumC0201o, this);
                        r12 = r13;
                        if (objM4196i == enumC1152a2) {
                            return enumC1152a2;
                        }
                        r14 = r12;
                        if (!AbstractC2162v.m3992n(interfaceC1051i)) {
                            return C0891q.f2780a;
                        }
                    }
                } else {
                    C0185S c0185s5 = (C0185S) this.f391h;
                    AbstractC1784a.m3205S(obj);
                    r13 = c0185s5;
                    this.f391h = r13;
                    this.f390g = 2;
                    objM4196i = AbstractC2352g.m4196i(r13, enumC0201o, this);
                    r12 = r13;
                    if (objM4196i == enumC1152a2) {
                    }
                    r14 = r12;
                    if (!AbstractC2162v.m3992n(interfaceC1051i)) {
                    }
                }
                break;
            default:
                int i7 = this.f390g;
                if (i7 == 0) {
                    AbstractC1784a.m3205S(obj);
                    c1906h = (C1906h) this.f392i;
                    objMo6a = ((C0099z) this.f393j).mo6a();
                    if (objMo6a != null) {
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj2 = this.f391h;
                    c1906h = (C1906h) this.f392i;
                    AbstractC1784a.m3205S(obj);
                    if (obj2 == null) {
                        return C0891q.f2780a;
                    }
                    objMo6a = ((C0099z) this.f393j).mo6a();
                    if (objMo6a != null) {
                        this.f392i = c1906h;
                        this.f391h = objMo6a;
                        this.f390g = 1;
                        c1906h.m3391b(this, objMo6a);
                        return EnumC1152a.f3788d;
                    }
                    obj2 = null;
                    if (obj2 == null) {
                    }
                    objMo6a = ((C0099z) this.f393j).mo6a();
                    if (objMo6a != null) {
                    }
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0086s0(Object obj, InterfaceC1046d interfaceC1046d, int i5) {
        super(2, interfaceC1046d);
        this.f389f = i5;
        this.f393j = obj;
    }
}
