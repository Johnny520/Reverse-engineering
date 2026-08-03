package p266s0;

import gg.AbstractC1428x;
import java.util.ArrayList;
import p015b0.C0152r;
import p036c9.C0488t0;
import p040d0.C0645b;
import p085fg.InterfaceC1221b;
import p085fg.InterfaceC1222c;
import p085fg.InterfaceC1224e;
import p085fg.InterfaceC1225f;
import p085fg.InterfaceC1226g;
import p085fg.InterfaceC1227h;
import p085fg.InterfaceC1228i;
import p085fg.InterfaceC1229j;
import p085fg.InterfaceC1230k;
import p085fg.InterfaceC1232m;
import p085fg.InterfaceC1233n;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p085fg.InterfaceC1237r;
import p085fg.InterfaceC1238s;
import p085fg.InterfaceC1239t;
import p085fg.InterfaceC1240u;
import p085fg.InterfaceC1241v;
import p085fg.InterfaceC1242w;
import p116i.C1738b1;
import p117i0.C1836h0;
import p117i0.C1876r1;
import p174m.C2589d2;
import p276sf.InterfaceC3955b;

/* JADX INFO: renamed from: s0.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3874d implements InterfaceC1235p, InterfaceC1236q, InterfaceC1237r, InterfaceC1238s, InterfaceC1239t, InterfaceC1240u, InterfaceC1241v, InterfaceC1242w, InterfaceC1221b, InterfaceC1222c, InterfaceC1224e, InterfaceC1225f, InterfaceC1226g, InterfaceC1227h, InterfaceC1228i, InterfaceC1229j, InterfaceC1230k, InterfaceC1232m, InterfaceC1233n {

    /* JADX INFO: renamed from: g */
    public final int f12719g;

    /* JADX INFO: renamed from: h */
    public final boolean f12720h;

    /* JADX INFO: renamed from: i */
    public InterfaceC3955b f12721i;

    /* JADX INFO: renamed from: j */
    public C1876r1 f12722j;

    /* JADX INFO: renamed from: k */
    public ArrayList f12723k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3874d(int i9, InterfaceC3955b interfaceC3955b, boolean z9) {
        this.f12719g = i9;
        this.f12720h = z9;
        this.f12721i = interfaceC3955b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1241v
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo3356a(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, C1836h0 c1836h0, Integer num) {
        return m8058h(obj, bool, obj2, obj3, obj4, c1836h0, num.intValue());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo734b(Object obj, Object obj2, Object obj3) {
        return m8057g(obj, (C1836h0) obj2, ((Number) obj3).intValue());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1237r
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo3355c(Object obj, Object obj2, Object obj3, Object obj4) {
        return m8059i(obj, obj2, (C1836h0) obj3, ((Number) obj4).intValue());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1238s
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo726d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return m8055e((C0645b) obj, obj2, obj3, (C1836h0) obj4, ((Number) obj5).intValue());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final Object m8055e(C0645b c0645b, Object obj, Object obj2, C1836h0 c1836h0, int i9) {
        c1836h0.m4527b0(this.f12719g);
        m8060j(c1836h0);
        int iM8067a = c1836h0.m4534f(this) ? AbstractC3879i.m8067a(2, 3) : AbstractC3879i.m8067a(1, 3);
        InterfaceC3955b interfaceC3955b = this.f12721i;
        AbstractC1428x.m3838c(5, interfaceC3955b);
        Object objMo726d = ((InterfaceC1238s) interfaceC3955b).mo726d(c0645b, obj, obj2, c1836h0, Integer.valueOf(iM8067a | i9));
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C3873c(this, c0645b, obj, obj2, i9, 0);
        }
        return objMo726d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(Unknown Source)
    	at java.base/java.util.ArrayList$Itr.next(Unknown Source)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:130)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    /* JADX INFO: renamed from: f */
    public final Object m8056f(C1836h0 c1836h0, int i9) {
        c1836h0.m4527b0(this.f12719g);
        m8060j(c1836h0);
        int iM8067a = i9 | (c1836h0.m4534f(this) ? AbstractC3879i.m8067a(2, 0) : AbstractC3879i.m8067a(1, 0));
        InterfaceC3955b interfaceC3955b = this.f12721i;
        AbstractC1428x.m3838c(2, interfaceC3955b);
        Object objInvoke = ((InterfaceC1235p) interfaceC3955b).invoke(c1836h0, Integer.valueOf(iM8067a));
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C2589d2(2, this, C3874d.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8, 2);
        }
        return objInvoke;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final Object m8057g(Object obj, C1836h0 c1836h0, int i9) {
        c1836h0.m4527b0(this.f12719g);
        m8060j(c1836h0);
        int iM8067a = c1836h0.m4534f(this) ? AbstractC3879i.m8067a(2, 1) : AbstractC3879i.m8067a(1, 1);
        InterfaceC3955b interfaceC3955b = this.f12721i;
        AbstractC1428x.m3838c(3, interfaceC3955b);
        Object objMo734b = ((InterfaceC1236q) interfaceC3955b).mo734b(obj, c1836h0, Integer.valueOf(iM8067a | i9));
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C1738b1(this, obj, i9, 3);
        }
        return objMo734b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final Object m8058h(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, C1836h0 c1836h0, int i9) {
        c1836h0.m4527b0(this.f12719g);
        m8060j(c1836h0);
        int iM8067a = c1836h0.m4534f(this) ? AbstractC3879i.m8067a(2, 6) : AbstractC3879i.m8067a(1, 6);
        InterfaceC3955b interfaceC3955b = this.f12721i;
        AbstractC1428x.m3838c(8, interfaceC3955b);
        Object objMo3356a = ((InterfaceC1241v) interfaceC3955b).mo3356a(obj, bool, obj2, obj3, obj4, c1836h0, Integer.valueOf(i9 | iM8067a));
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C0488t0(this, obj, bool, obj2, obj3, obj4, i9);
        }
        return objMo3356a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final Object m8059i(Object obj, Object obj2, C1836h0 c1836h0, int i9) {
        c1836h0.m4527b0(this.f12719g);
        m8060j(c1836h0);
        int iM8067a = c1836h0.m4534f(this) ? AbstractC3879i.m8067a(2, 2) : AbstractC3879i.m8067a(1, 2);
        InterfaceC3955b interfaceC3955b = this.f12721i;
        AbstractC1428x.m3838c(4, interfaceC3955b);
        Object objMo3355c = ((InterfaceC1237r) interfaceC3955b).mo3355c(obj, obj2, c1836h0, Integer.valueOf(iM8067a | i9));
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C0152r(this, obj, obj2, i9, 8);
        }
        return objMo3355c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m8056f((C1836h0) obj, ((Number) obj2).intValue());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(Unknown Source)
    	at java.base/java.util.ArrayList$Itr.next(Unknown Source)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:130)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    /* JADX INFO: renamed from: j */
    public final void m8060j(C1836h0 c1836h0) {
        C1876r1 c1876r1M4499A;
        if (!this.f12720h || (c1876r1M4499A = c1836h0.m4499A()) == null) {
            return;
        }
        c1836h0.getClass();
        c1876r1M4499A.f6239b |= 1;
        if (AbstractC3879i.m8072f(this.f12722j, c1876r1M4499A)) {
            this.f12722j = c1876r1M4499A;
            return;
        }
        ArrayList arrayList = this.f12723k;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.f12723k = arrayList2;
            arrayList2.add(c1876r1M4499A);
            return;
        }
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (AbstractC3879i.m8072f((C1876r1) arrayList.get(i9), c1876r1M4499A)) {
                arrayList.set(i9, c1876r1M4499A);
                return;
            }
        }
        arrayList.add(c1876r1M4499A);
    }
}
