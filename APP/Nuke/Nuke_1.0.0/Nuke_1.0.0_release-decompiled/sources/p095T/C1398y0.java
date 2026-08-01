package p095T;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p047I0.C0711a0;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1184i;
import p112W2.InterfaceC1604f;
import p186k.C2409F;

/* JADX INFO: renamed from: T.y0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1398y0 extends AbstractC1184i implements InterfaceC1604f {

    /* JADX INFO: renamed from: h */
    public List f4978h;

    /* JADX INFO: renamed from: i */
    public List f4979i;

    /* JADX INFO: renamed from: j */
    public List f4980j;

    /* JADX INFO: renamed from: k */
    public C2409F f4981k;

    /* JADX INFO: renamed from: l */
    public C2409F f4982l;

    /* JADX INFO: renamed from: m */
    public C2409F f4983m;

    /* JADX INFO: renamed from: n */
    public Set f4984n;

    /* JADX INFO: renamed from: o */
    public C2409F f4985o;

    /* JADX INFO: renamed from: p */
    public int f4986p;

    /* JADX INFO: renamed from: q */
    public /* synthetic */ C0711a0 f4987q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ C1400z0 f4988r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1398y0(C1400z0 c1400z0, InterfaceC1046d interfaceC1046d) {
        super(3, interfaceC1046d);
        this.f4988r = c1400z0;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fd  */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2673r(p095T.C1400z0 r22, java.util.List r23, java.util.List r24, java.util.List r25, p186k.C2409F r26, p186k.C2409F r27, p186k.C2409F r28, p186k.C2409F r29) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p095T.C1398y0.m2673r(T.z0, java.util.List, java.util.List, java.util.List, k.F, k.F, k.F, k.F):void");
    }

    /* JADX INFO: renamed from: t */
    public static final void m2674t(List list, C1400z0 c1400z0) {
        list.clear();
        synchronized (c1400z0.f4997c) {
            try {
                ArrayList arrayList = c1400z0.f5005k;
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    list.add((AbstractC1346X) arrayList.get(i5));
                }
                c1400z0.f5005k.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p112W2.InterfaceC1604f
    /* JADX INFO: renamed from: f */
    public final Object mo5f(Object obj, Object obj2, Object obj3) {
        C1398y0 c1398y0 = new C1398y0(this.f4988r, (InterfaceC1046d) obj3);
        c1398y0.f4987q = (C0711a0) obj2;
        c1398y0.mo8p(C0891q.f2780a);
        return EnumC1152a.f3788d;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0099 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0132 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0125 -> B:44:0x012d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x01db -> B:12:0x0094). Please report as a decompilation issue!!! */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo8p(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p095T.C1398y0.mo8p(java.lang.Object):java.lang.Object");
    }
}
