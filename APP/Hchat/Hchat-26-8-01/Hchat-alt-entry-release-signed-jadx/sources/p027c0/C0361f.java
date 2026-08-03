package p027c0;

import ca.C0509a0;
import gg.AbstractC1416l;
import gg.C1414j;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p036c9.C0429d2;
import p040d0.AbstractC0649f;
import p040d0.InterfaceC0648e;
import p054dg.AbstractC0793l;
import p057e1.C0807b;
import p068eh.AbstractC0921a;
import p069f.C0968z;
import p080fb.C1174s2;
import p080fb.C1178t2;
import p085fg.InterfaceC1231l;
import p099h.Hchat.hooks.items.script.ScriptPluginRuntime;
import p099h.Hchat.utils.KavaReflector;
import p108ha.C1659s;
import p108ha.C1666z;
import p126ia.C2027u;
import p136j8.C2090a;
import p136j8.C2104o;
import p144k.AbstractC2171g;
import p144k.C2165e;
import p187n.C2859m;
import p218og.AbstractC3137a;
import p230p8.C3359k;
import p230p8.C3360l;
import p230p8.C3365q;
import p249qg.AbstractC3603v;
import p276sf.C3967n;
import p339x1.AbstractC5618k;
import p355y.C5838a;
import tf.AbstractC4166m;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: c0.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0361f extends C1414j implements InterfaceC1231l {

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int f1012n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0361f(int i9, Object obj, Class cls, String str, String str2, int i10, int i11, int i12) {
        super(i9, obj, cls, str, str2, i10, i11);
        this.f1012n = i12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d7  */
    @Override // p085fg.InterfaceC1231l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) throws IOException {
        Object obj2;
        Object obj3;
        int i9;
        boolean z9;
        int i10 = this.f1012n;
        C3967n c3967n = C3967n.f12976a;
        InterfaceC5557c interfaceC5557c = null;
        boolean z10 = false;
        z = false;
        boolean z11 = false;
        z10 = false;
        Object obj4 = this.f4723h;
        switch (i10) {
            case 0:
                long j3 = ((C0807b) obj).f2414a;
                C0365j c0365j = (C0365j) obj4;
                c0365j.getClass();
                InterfaceC0648e interfaceC0648e = (InterfaceC0648e) AbstractC5618k.m10152h(c0365j, AbstractC0649f.f2014a);
                if (interfaceC0648e != null) {
                    AbstractC3603v.m7563q(c0365j.m10550Y0(), null, new C0364i(c0365j, j3, interfaceC0648e, new C0363h(c0365j, j3), (InterfaceC5557c) null), 3);
                }
                return c3967n;
            case 1:
                ((C5838a) obj4).f23758b.m2286a((InterfaceC1231l) obj);
                return c3967n;
            case 2:
                Method method = (Method) obj;
                method.getClass();
                return Boolean.valueOf(C0429d2.m1422a((C0429d2) obj4, method));
            case 3:
                Method method2 = (Method) obj;
                method2.getClass();
                return Boolean.valueOf(C0429d2.m1422a((C0429d2) obj4, method2));
            case 4:
                Method method3 = (Method) obj;
                method3.getClass();
                return Boolean.valueOf(C0429d2.m1423b((C0429d2) obj4, method3));
            case 5:
                Method method4 = (Method) obj;
                method4.getClass();
                return Boolean.valueOf(C0429d2.m1424c((C0429d2) obj4, method4));
            case 6:
                Method method5 = (Method) obj;
                method5.getClass();
                return Boolean.valueOf(C0429d2.m1425d((C0429d2) obj4, method5));
            case 7:
                Method method6 = (Method) obj;
                method6.getClass();
                return Boolean.valueOf(C0429d2.m1426e((C0429d2) obj4, method6));
            case 8:
                Method method7 = (Method) obj;
                method7.getClass();
                return Boolean.valueOf(C0429d2.m1427f((C0429d2) obj4, method7));
            case 9:
                Method method8 = (Method) obj;
                method8.getClass();
                return Boolean.valueOf(C0429d2.m1428g((C0429d2) obj4, method8));
            case 10:
                return (C0509a0) AbstractC4166m.m8425w1(((Number) obj).intValue(), (List) obj4);
            case 11:
                String str = (String) obj;
                str.getClass();
                return Boolean.valueOf(((Map) obj4).containsKey(str));
            case 12:
                File file = (File) obj;
                file.getClass();
                return Boolean.valueOf(((ScriptPluginRuntime) obj4).isPluginDirectory(file));
            case 13:
                File file2 = (File) obj;
                file2.getClass();
                return Boolean.valueOf(((ScriptPluginRuntime) obj4).isPluginDirectory(file2));
            case 14:
                String str2 = (String) obj;
                str2.getClass();
                C1174s2 c1174s2 = (C1174s2) obj4;
                c1174s2.getClass();
                File fileM2996D = c1174s2.m2996D(str2, false);
                if (!fileM2996D.exists()) {
                    return null;
                }
                if (!fileM2996D.isFile()) {
                    C2104o.m5291q("统一补丁只能操作文本文件: ".concat(str2));
                    return null;
                }
                if (fileM2996D.length() > 2097152) {
                    C2104o.m5291q("文件超过 2 MB: ".concat(str2));
                    return null;
                }
                byte[] bArrM2027g0 = AbstractC0793l.m2027g0(fileM2996D);
                ConcurrentHashMap concurrentHashMap = C1178t2.f3961a;
                if (C1178t2.m3037C(bArrM2027g0)) {
                    return new String(bArrM2027g0, AbstractC3137a.f10177a);
                }
                C2104o.m5291q("文件不是可修改的文本文件: ".concat(str2));
                return null;
            case 15:
                Method method9 = (Method) obj;
                method9.getClass();
                ((C1659s) obj4).getClass();
                return Boolean.valueOf(C1659s.m4231d(method9));
            case 16:
                Method method10 = (Method) obj;
                method10.getClass();
                ((C1659s) obj4).getClass();
                return Boolean.valueOf(C1659s.m4233f(method10));
            case 17:
                Method method11 = (Method) obj;
                method11.getClass();
                ((C1659s) obj4).getClass();
                return Boolean.valueOf(C1659s.m4235h(method11));
            case 18:
                Method method12 = (Method) obj;
                method12.getClass();
                ((C1666z) obj4).getClass();
                return Boolean.valueOf(C1666z.m4247f(method12));
            case 19:
                Method method13 = (Method) obj;
                method13.getClass();
                return Boolean.valueOf(((C1666z) obj4).m4253g(method13));
            case 20:
                Method method14 = (Method) obj;
                method14.getClass();
                ((C1666z) obj4).getClass();
                return Boolean.valueOf(C1666z.m4248h(method14));
            case 21:
                Method method15 = (Method) obj;
                method15.getClass();
                ((C1666z) obj4).getClass();
                return Boolean.valueOf(C1666z.m4249i(method15));
            case 22:
                C3360l c3360l = (C3360l) obj;
                c3360l.getClass();
                ((C2027u) obj4).getClass();
                if (c3360l.f10844a != null && (obj2 = c3360l.f10846c) != null) {
                    z10 = !AbstractC1416l.m3825a(KavaReflector.invokeMethod(obj2, "isAd", new Object[0]), Boolean.TRUE);
                }
                return Boolean.valueOf(z10);
            case 23:
                C3360l c3360l2 = (C3360l) obj;
                c3360l2.getClass();
                ((C2027u) obj4).getClass();
                if (c3360l2.f10844a != null && (obj3 = c3360l2.f10846c) != null) {
                    z11 = !AbstractC1416l.m3825a(KavaReflector.invokeMethod(obj3, "isAd", new Object[0]), Boolean.TRUE);
                }
                return Boolean.valueOf(z11);
            case 24:
                Method method16 = (Method) obj;
                method16.getClass();
                ((C2090a) obj4).getClass();
                return Boolean.valueOf(C2090a.m5148c(method16));
            case 25:
                Method method17 = (Method) obj;
                method17.getClass();
                ((C2090a) obj4).getClass();
                return Boolean.valueOf(C2090a.m5150e(method17));
            case 26:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                AbstractC2171g abstractC2171g = (AbstractC2171g) obj4;
                C0968z c0968z = abstractC2171g.f7199K;
                if (zBooleanValue) {
                    abstractC2171g.m5397v1();
                } else {
                    if (abstractC2171g.f7205w != null) {
                        Object[] objArr = c0968z.f3047c;
                        long[] jArr = c0968z.f3045a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i11 = 0;
                            while (true) {
                                long j4 = jArr[i11];
                                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i12 = 8;
                                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                                    int i14 = 0;
                                    while (i14 < i13) {
                                        if ((j4 & 255) < 128) {
                                            i9 = i12;
                                            AbstractC3603v.m7563q(abstractC2171g.m10550Y0(), null, new C2165e(abstractC2171g, (C2859m) objArr[(i11 << 3) + i14], interfaceC5557c, z10 ? 1 : 0), 3);
                                        } else {
                                            i9 = i12;
                                        }
                                        j4 >>= i9;
                                        i14++;
                                        i12 = i9;
                                    }
                                    if (i13 == i12) {
                                        if (i11 != length) {
                                            i11++;
                                        }
                                    }
                                }
                            }
                        }
                        C2859m c2859m = abstractC2171g.f7200L;
                        if (c2859m != null) {
                            AbstractC3603v.m7563q(abstractC2171g.m10550Y0(), null, new C2165e(abstractC2171g, c2859m, interfaceC5557c, 1), 3);
                        }
                    }
                    c0968z.m2387a();
                    abstractC2171g.f7200L = null;
                    abstractC2171g.mo5380w1();
                }
                return c3967n;
            case 27:
                Method method18 = (Method) obj;
                method18.getClass();
                ((C3359k) obj4).getClass();
                return Boolean.valueOf(C3359k.m7114c(method18));
            case 28:
                Method method19 = (Method) obj;
                method19.getClass();
                ((C3359k) obj4).getClass();
                return Boolean.valueOf(C3359k.m7115d(method19));
            default:
                Method method20 = (Method) obj;
                method20.getClass();
                ((C3365q) obj4).getClass();
                if (C3365q.m7141a(method20)) {
                    Class<?>[] parameterTypes = method20.getParameterTypes();
                    parameterTypes.getClass();
                    z9 = parameterTypes.length == 0 && AbstractC0921a.m2236A(method20, false, "com.tencent.mm.plugin.sns.model.");
                }
                return Boolean.valueOf(z9);
        }
    }
}
