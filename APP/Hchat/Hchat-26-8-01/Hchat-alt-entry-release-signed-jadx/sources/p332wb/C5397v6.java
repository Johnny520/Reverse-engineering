package p332wb;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;
import be.AbstractC0283h;
import bsh.org.objectweb.asm.Opcodes;
import gg.AbstractC1416l;
import gg.C1414j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p000a.AbstractC0000a;
import p003a2.C0014a;
import p025bc.AbstractC0255e;
import p036c9.C0454k;
import p036c9.C0467n0;
import p036c9.C0482r0;
import p036c9.C0485s0;
import p036c9.C0491u0;
import p036c9.C0497w0;
import p037cb.C0545f;
import p051db.C0765c;
import p051db.C0769g;
import p051db.RunnableC0766d;
import p065eb.C0884o;
import p065eb.C0886p;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p210o8.C3086j;
import p218og.AbstractC3156t;
import p222p.AbstractC3208d;
import p222p.AbstractC3222h1;
import p222p.C3272z0;
import p222p.InterfaceC3268x0;
import p243q9.C3471g;
import p249qg.InterfaceC3599t;
import p251r.C3619d;
import p251r.C3641z;
import p253r1.AbstractC3649f;
import p266s0.AbstractC3879i;
import p276sf.C3967n;
import p315v8.C4521a;
import p315v8.C4538r;
import p317vb.InterfaceC4544a;
import p345x8.C5725r;
import p346x9.C5738e;
import p346x9.C5739f;
import p356y0.InterfaceC5853o;
import sh.C4029m1;
import sh.C4060x;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.C4175v;
import th.InterfaceC4209a;

/* JADX INFO: renamed from: wb.v6 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5397v6 implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f21277g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f21278h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f21279i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f21280j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f21281k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f21282l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f21283m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f21284n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f21285o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f21286p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f21287q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Object f21288r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Object f21289s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5397v6(SharedPreferences sharedPreferences, Context context, InterfaceC1220a interfaceC1220a, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19) {
        this.f21277g = 8;
        this.f21284n = sharedPreferences;
        this.f21278h = context;
        this.f21288r = interfaceC1220a;
        this.f21279i = interfaceC1809a1;
        this.f21280j = interfaceC1809a12;
        this.f21281k = interfaceC1809a13;
        this.f21282l = interfaceC1809a14;
        this.f21283m = interfaceC1809a15;
        this.f21285o = interfaceC1809a16;
        this.f21286p = interfaceC1809a17;
        this.f21287q = interfaceC1809a18;
        this.f21289s = interfaceC1809a19;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    private final Object m9750e(Object obj, Object obj2, Object obj3) {
        InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f21279i;
        Context context = (Context) this.f21284n;
        InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f21278h;
        C3471g c3471g = (C3471g) this.f21288r;
        InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f21280j;
        InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f21281k;
        InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) this.f21282l;
        InterfaceC1809a1 interfaceC1809a15 = (InterfaceC1809a1) this.f21283m;
        InterfaceC1809a1 interfaceC1809a16 = (InterfaceC1809a1) this.f21285o;
        InterfaceC1809a1 interfaceC1809a17 = (InterfaceC1809a1) this.f21286p;
        InterfaceC1809a1 interfaceC1809a18 = (InterfaceC1809a1) this.f21287q;
        InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f21289s;
        C1836h0 c1836h0 = (C1836h0) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((InterfaceC4209a) obj).getClass();
        if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 17) != 16)) {
            boolean zM4534f = c1836h0.m4534f(interfaceC1809a1) | c1836h0.m4538h(context) | c1836h0.m4534f(interfaceC1231l) | c1836h0.m4538h(c3471g) | c1836h0.m4534f(interfaceC1809a12) | c1836h0.m4534f(interfaceC1809a13) | c1836h0.m4534f(interfaceC1809a14) | c1836h0.m4534f(interfaceC1809a15) | c1836h0.m4534f(interfaceC1809a16) | c1836h0.m4534f(interfaceC1809a17) | c1836h0.m4534f(interfaceC1809a18);
            Object objM4514P = c1836h0.m4514P();
            if (zM4534f || objM4514P == C1851l.f6155a) {
                objM4514P = new C5236qa(context, interfaceC1231l, c3471g, interfaceC1809a1, interfaceC1809a12, interfaceC1809a13, interfaceC1809a14, interfaceC1809a15, interfaceC1809a16, interfaceC1809a17, interfaceC1809a18);
                c1836h0.m4545k0(objM4514P);
            }
            AbstractC4955ho.m9382M("保存模板", (InterfaceC1220a) objM4514P, "返回", interfaceC1220a, null, null, c1836h0, 390, 48);
        } else {
            c1836h0.m4519V();
        }
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    private final Object m9751f(Object obj, Object obj2, Object obj3) {
        C4060x c4060x = (C4060x) this.f21284n;
        C3641z c3641z = (C3641z) this.f21278h;
        List list = (List) this.f21285o;
        InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f21279i;
        ArrayList arrayList = (ArrayList) this.f21288r;
        InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f21280j;
        InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f21281k;
        List list2 = (List) this.f21286p;
        ArrayList arrayList2 = (ArrayList) this.f21287q;
        InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) this.f21282l;
        List list3 = (List) this.f21289s;
        InterfaceC1809a1 interfaceC1809a15 = (InterfaceC1809a1) this.f21283m;
        InterfaceC3268x0 interfaceC3268x0 = (InterfaceC3268x0) obj;
        C1836h0 c1836h0 = (C1836h0) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        interfaceC3268x0.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= c1836h0.m4534f(interfaceC3268x0) ? 4 : 2;
        }
        if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 19) != 18)) {
            InterfaceC5853o interfaceC5853oM7631a = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, c4060x.f13440e, null);
            C3272z0 c3272z0M6872b = AbstractC3208d.m6872b(interfaceC3268x0.mo6924c() + 8, interfaceC3268x0.mo6922a() + 84, 5);
            boolean zM4538h = c1836h0.m4538h(list) | c1836h0.m4534f(interfaceC1809a1) | c1836h0.m4538h(arrayList) | c1836h0.m4534f(interfaceC1809a12) | c1836h0.m4534f(interfaceC1809a13) | c1836h0.m4538h(list2) | c1836h0.m4538h(arrayList2) | c1836h0.m4534f(interfaceC1809a14) | c1836h0.m4538h(list3);
            Object objM4514P = c1836h0.m4514P();
            if (zM4538h || objM4514P == C1851l.f6155a) {
                objM4514P = new C4940h9(list, arrayList, interfaceC1809a1, interfaceC1809a15, list2, arrayList2, interfaceC1809a12, interfaceC1809a13, list3, interfaceC1809a14);
                c1836h0.m4545k0(objM4514P);
            }
            AbstractC0000a.m53b(interfaceC5853oM7631a, c3641z, c3272z0M6872b, null, null, null, false, null, (InterfaceC1231l) objM4514P, c1836h0, 0, 504);
        } else {
            c1836h0.m4519V();
        }
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    private final Object m9752g(Object obj, Object obj2, Object obj3) {
        C1836h0 c1836h0;
        Object c5512yn;
        C1823e c1823e;
        SharedPreferences sharedPreferences = (SharedPreferences) this.f21284n;
        Context context = (Context) this.f21278h;
        InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f21288r;
        InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f21279i;
        InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f21280j;
        InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f21281k;
        InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) this.f21282l;
        InterfaceC1809a1 interfaceC1809a15 = (InterfaceC1809a1) this.f21283m;
        InterfaceC1809a1 interfaceC1809a16 = (InterfaceC1809a1) this.f21285o;
        InterfaceC1809a1 interfaceC1809a17 = (InterfaceC1809a1) this.f21286p;
        InterfaceC1809a1 interfaceC1809a18 = (InterfaceC1809a1) this.f21287q;
        InterfaceC1809a1 interfaceC1809a19 = (InterfaceC1809a1) this.f21289s;
        C1836h0 c1836h02 = (C1836h0) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((InterfaceC4209a) obj).getClass();
        if (c1836h02.m4516S(iIntValue & 1, (iIntValue & 17) != 16)) {
            boolean zM4538h = c1836h02.m4538h(sharedPreferences) | c1836h02.m4538h(context) | c1836h02.m4534f(interfaceC1220a);
            Object objM4514P = c1836h02.m4514P();
            C1823e c1823e2 = C1851l.f6155a;
            if (zM4538h || objM4514P == c1823e2) {
                c1836h0 = c1836h02;
                c1823e = c1823e2;
                c5512yn = new C5512yn(sharedPreferences, context, interfaceC1220a, interfaceC1809a1, interfaceC1809a12, interfaceC1809a13, interfaceC1809a14, interfaceC1809a15, interfaceC1809a16, interfaceC1809a17, interfaceC1809a18, interfaceC1809a19);
                interfaceC1809a18 = interfaceC1809a18;
                interfaceC1809a17 = interfaceC1809a17;
                interfaceC1809a16 = interfaceC1809a16;
                c1836h0.m4545k0(c5512yn);
            } else {
                c1836h0 = c1836h02;
                c5512yn = objM4514P;
                c1823e = c1823e2;
            }
            InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) ((C1414j) c5512yn);
            Object objM4514P2 = c1836h0.m4514P();
            if (objM4514P2 == c1823e) {
                C0491u0 c0491u0 = new C0491u0(interfaceC1809a1, interfaceC1809a12, interfaceC1809a13, interfaceC1809a14, interfaceC1809a15, interfaceC1809a16, interfaceC1809a17, interfaceC1809a18, interfaceC1809a19);
                c1836h0.m4545k0(c0491u0);
                objM4514P2 = c0491u0;
            }
            AbstractC4955ho.m9382M("保存", interfaceC1220a2, "返回", interfaceC1220a, "恢复默认", (InterfaceC1220a) objM4514P2, c1836h0, 221574, 0);
        } else {
            c1836h02.m4519V();
        }
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:217:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x06ec  */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        Object obj4;
        boolean z9;
        boolean z10;
        final InterfaceC1809a1 interfaceC1809a1;
        InterfaceC1220a interfaceC1220a;
        InterfaceC1809a1 interfaceC1809a12;
        C1823e c1823e;
        C1836h0 c1836h0;
        C1836h0 c1836h02;
        Context context;
        C5739f c5739f;
        InterfaceC1809a1 interfaceC1809a13;
        Object c0884o;
        C1823e c1823e2;
        Object next;
        List list;
        switch (this.f21277g) {
            case 0:
                C4060x c4060x = (C4060x) this.f21284n;
                C3641z c3641z = (C3641z) this.f21278h;
                InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) this.f21279i;
                InterfaceC1809a1 interfaceC1809a15 = (InterfaceC1809a1) this.f21280j;
                InterfaceC1809a1 interfaceC1809a16 = (InterfaceC1809a1) this.f21281k;
                ArrayList arrayList = (ArrayList) this.f21288r;
                InterfaceC1809a1 interfaceC1809a17 = (InterfaceC1809a1) this.f21282l;
                InterfaceC1809a1 interfaceC1809a18 = (InterfaceC1809a1) this.f21283m;
                InterfaceC1809a1 interfaceC1809a19 = (InterfaceC1809a1) this.f21285o;
                InterfaceC1809a1 interfaceC1809a110 = (InterfaceC1809a1) this.f21286p;
                C4737b3 c4737b3 = (C4737b3) this.f21289s;
                InterfaceC1809a1 interfaceC1809a111 = (InterfaceC1809a1) this.f21287q;
                InterfaceC3268x0 interfaceC3268x0 = (InterfaceC3268x0) obj;
                C1836h0 c1836h03 = (C1836h0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                interfaceC3268x0.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c1836h03.m4534f(interfaceC3268x0) ? 4 : 2;
                }
                if (c1836h03.m4516S(iIntValue & 1, (iIntValue & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, c4060x.f13440e, null);
                    C3272z0 c3272z0M6872b = AbstractC3208d.m6872b(interfaceC3268x0.mo6924c() + 8, interfaceC3268x0.mo6922a() + 84, 5);
                    boolean zM4534f = c1836h03.m4534f(interfaceC1809a14) | c1836h03.m4534f(interfaceC1809a15) | c1836h03.m4534f(interfaceC1809a16) | c1836h03.m4538h(arrayList) | c1836h03.m4534f(interfaceC1809a17) | c1836h03.m4534f(interfaceC1809a18) | c1836h03.m4534f(interfaceC1809a19) | c1836h03.m4534f(interfaceC1809a110) | c1836h03.m4534f(c4737b3) | c1836h03.m4534f(interfaceC1809a111);
                    Object objM4514P = c1836h03.m4514P();
                    if (zM4534f || objM4514P == C1851l.f6155a) {
                        objM4514P = new C4940h9(arrayList, interfaceC1809a14, interfaceC1809a15, interfaceC1809a16, interfaceC1809a17, interfaceC1809a18, interfaceC1809a19, c4737b3, interfaceC1809a111, interfaceC1809a110);
                        c1836h03.m4545k0(objM4514P);
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a, c3641z, c3272z0M6872b, null, null, null, false, null, (InterfaceC1231l) objM4514P, c1836h03, 0, 504);
                } else {
                    c1836h03.m4519V();
                }
                return C3967n.f12976a;
            case 1:
                InterfaceC4544a interfaceC4544a = (InterfaceC4544a) this.f21284n;
                C3641z c3641z2 = (C3641z) this.f21278h;
                InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) this.f21285o;
                SharedPreferences sharedPreferences = (SharedPreferences) this.f21286p;
                final Context context2 = (Context) this.f21287q;
                C3641z c3641z3 = (C3641z) this.f21288r;
                final C0769g c0769g = (C0769g) this.f21289s;
                InterfaceC1809a1 interfaceC1809a112 = (InterfaceC1809a1) this.f21279i;
                InterfaceC1809a1 interfaceC1809a113 = (InterfaceC1809a1) this.f21280j;
                InterfaceC1809a1 interfaceC1809a114 = (InterfaceC1809a1) this.f21281k;
                final InterfaceC1809a1 interfaceC1809a115 = (InterfaceC1809a1) this.f21282l;
                final InterfaceC1809a1 interfaceC1809a116 = (InterfaceC1809a1) this.f21283m;
                AbstractC5547zq abstractC5547zq = (AbstractC5547zq) obj;
                C1836h0 c1836h04 = (C1836h0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                abstractC5547zq.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= (iIntValue2 & 8) == 0 ? c1836h04.m4534f(abstractC5547zq) : c1836h04.m4538h(abstractC5547zq) ? 4 : 2;
                }
                if (c1836h04.m4516S(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    boolean zEquals = abstractC5547zq.equals(C5483xq.f22029c);
                    C1823e c1823e3 = C1851l.f6155a;
                    if (zEquals) {
                        c1836h04.m4525a0(-1281745457);
                        boolean zBooleanValue = ((Boolean) interfaceC1809a112.getValue()).booleanValue();
                        List list2 = (List) interfaceC1809a113.getValue();
                        boolean zM4538h = c1836h04.m4538h(sharedPreferences);
                        Object objM4514P2 = c1836h04.m4514P();
                        if (zM4538h || objM4514P2 == c1823e3) {
                            objM4514P2 = new C4818di(sharedPreferences, interfaceC1809a112, 14);
                            c1836h04.m4545k0(objM4514P2);
                        }
                        InterfaceC1231l interfaceC1231l = (InterfaceC1231l) objM4514P2;
                        Object objM4514P3 = c1836h04.m4514P();
                        if (objM4514P3 == c1823e3) {
                            objM4514P3 = new C0497w0(interfaceC1809a114, interfaceC1809a115, interfaceC1809a116, 3);
                            c1836h04.m4545k0(objM4514P3);
                        }
                        InterfaceC1220a interfaceC1220a3 = (InterfaceC1220a) objM4514P3;
                        Object objM4514P4 = c1836h04.m4514P();
                        if (objM4514P4 == c1823e3) {
                            objM4514P4 = new C4714ad(interfaceC1809a114, interfaceC1809a115, interfaceC1809a116, 4);
                            c1836h04.m4545k0(objM4514P4);
                        }
                        AbstractC4955ho.m9597l3(interfaceC4544a, zBooleanValue, list2, c3641z2, interfaceC1220a2, interfaceC1231l, interfaceC1220a3, (InterfaceC1231l) objM4514P4, c1836h04, 14155776);
                        c1836h04.m4553p(false);
                    } else if (abstractC5547zq.equals(C5483xq.f22028b)) {
                        c1836h04.m4525a0(-1280642973);
                        C0765c c0765c = (C0765c) interfaceC1809a115.getValue();
                        boolean z11 = ((String) interfaceC1809a114.getValue()) != null;
                        Object objM4514P5 = c1836h04.m4514P();
                        if (objM4514P5 == c1823e3) {
                            objM4514P5 = new C5509yk(interfaceC1809a116, 8);
                            c1836h04.m4545k0(objM4514P5);
                        }
                        InterfaceC1220a interfaceC1220a4 = (InterfaceC1220a) objM4514P5;
                        Object objM4514P6 = c1836h04.m4514P();
                        if (objM4514P6 == c1823e3) {
                            objM4514P6 = new C4917gj(interfaceC1809a115, 21);
                            c1836h04.m4545k0(objM4514P6);
                        }
                        InterfaceC1231l interfaceC1231l2 = (InterfaceC1231l) objM4514P6;
                        Object objM4514P7 = c1836h04.m4514P();
                        if (objM4514P7 == c1823e3) {
                            objM4514P7 = new C5509yk(interfaceC1809a116, 9);
                            c1836h04.m4545k0(objM4514P7);
                        }
                        InterfaceC1220a interfaceC1220a5 = (InterfaceC1220a) objM4514P7;
                        boolean zM4538h2 = c1836h04.m4538h(context2);
                        Object objM4514P8 = c1836h04.m4514P();
                        if (zM4538h2 || objM4514P8 == c1823e3) {
                            objM4514P8 = new C4776c9(context2, interfaceC1809a115, 7);
                            c1836h04.m4545k0(objM4514P8);
                        }
                        InterfaceC1235p interfaceC1235p = (InterfaceC1235p) objM4514P8;
                        boolean zM4538h3 = c1836h04.m4538h(context2);
                        Object objM4514P9 = c1836h04.m4514P();
                        if (zM4538h3 || objM4514P9 == c1823e3) {
                            objM4514P9 = new C5227q1(context2, interfaceC1809a115, 6);
                            c1836h04.m4545k0(objM4514P9);
                        }
                        InterfaceC1231l interfaceC1231l3 = (InterfaceC1231l) objM4514P9;
                        Object objM4514P10 = c1836h04.m4514P();
                        if (objM4514P10 == c1823e3) {
                            objM4514P10 = new C4029m1(25, interfaceC1809a115, interfaceC1809a116);
                            c1836h04.m4545k0(objM4514P10);
                        }
                        InterfaceC1231l interfaceC1231l4 = (InterfaceC1231l) objM4514P10;
                        boolean zM4538h4 = c1836h04.m4538h(context2) | c1836h04.m4538h(c0769g);
                        Object objM4514P11 = c1836h04.m4514P();
                        if (zM4538h4 || objM4514P11 == c1823e3) {
                            final int i9 = 2;
                            z9 = z11;
                            z10 = false;
                            interfaceC1809a1 = interfaceC1809a113;
                            obj4 = new InterfaceC1220a() { // from class: wb.al
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // p085fg.InterfaceC1220a
                                public final Object invoke() {
                                    C0765c c0765cM1982b;
                                    switch (i9) {
                                        case 0:
                                            Context context3 = context2;
                                            InterfaceC1809a1 interfaceC1809a117 = interfaceC1809a115;
                                            InterfaceC1809a1 interfaceC1809a118 = interfaceC1809a1;
                                            C0769g c0769g2 = c0769g;
                                            InterfaceC1809a1 interfaceC1809a119 = interfaceC1809a116;
                                            List list3 = (List) interfaceC1809a117.getValue();
                                            ArrayList arrayList2 = new ArrayList();
                                            for (Object obj5 : list3) {
                                                if (!AbstractC1416l.m3825a(((C0765c) obj5).f2288a, ((C0765c) interfaceC1809a118.getValue()).f2288a)) {
                                                    arrayList2.add(obj5);
                                                }
                                            }
                                            c0769g2.m1985e(arrayList2);
                                            interfaceC1809a117.setValue(c0769g2.m1986f());
                                            C0545f c0545f = AbstractC0283h.f824a;
                                            if (c0545f != null) {
                                                c0545f.m1554r();
                                            }
                                            interfaceC1809a119.setValue(C5483xq.f22029c);
                                            Toast.makeText(context3, "任务已删除", 0).show();
                                            break;
                                        case 1:
                                            Context context4 = context2;
                                            InterfaceC1809a1 interfaceC1809a120 = interfaceC1809a115;
                                            if (AbstractC4955ho.m9615n3(context4, interfaceC1809a120, interfaceC1809a1, c0769g, interfaceC1809a116, false)) {
                                                String str = ((C0765c) interfaceC1809a120.getValue()).f2288a;
                                                str.getClass();
                                                C0545f c0545f2 = AbstractC0283h.f824a;
                                                if (c0545f2 != null) {
                                                    synchronized (c0545f2) {
                                                        try {
                                                            if (!((C0769g) c0545f2.f1722e).m1983c() || (c0765cM1982b = ((C0769g) c0545f2.f1722e).m1982b(str)) == null || c0765cM1982b.f2300m.equals("running")) {
                                                                Toast.makeText(context4, "立即执行失败", 0).show();
                                                            } else {
                                                                String strConcat = "scheduled_task:".concat(str);
                                                                ((ConcurrentHashMap) c0545f2.f1723f).remove(strConcat);
                                                                C3086j c3086jM1542u = C0545f.m1542u();
                                                                if (c3086jM1542u != null) {
                                                                    c3086jM1542u.m6550a(strConcat);
                                                                }
                                                                C0765c c0765cM1980a = C0765c.m1980a(C0014a.m184r(c0765cM1982b), 0, null, null, null, null, 0L, 0, null, 0, 0, false, "running", 0L, 0, 0, null, 0, 0, null, 0, null, 4190207);
                                                                ((C0769g) c0545f2.f1722e).m1984d(c0765cM1980a);
                                                                RunnableC0766d runnableC0766d = new RunnableC0766d(c0545f2, c0765cM1980a, 0);
                                                                C3086j c3086jM1542u2 = C0545f.m1542u();
                                                                if (c3086jM1542u2 != null) {
                                                                    c3086jM1542u2.m6553d(runnableC0766d);
                                                                } else {
                                                                    Thread thread = new Thread(runnableC0766d, "Hchat-ScheduledTask-Now-".concat(str));
                                                                    thread.setDaemon(true);
                                                                    thread.start();
                                                                }
                                                                Toast.makeText(context4, "任务已加入立即执行队列", 0).show();
                                                            }
                                                        } catch (Throwable th2) {
                                                            throw th2;
                                                        }
                                                    }
                                                } else {
                                                    Toast.makeText(context4, "立即执行失败", 0).show();
                                                }
                                            }
                                            return C3967n.f12976a;
                                        default:
                                            AbstractC4955ho.m9615n3(context2, interfaceC1809a115, interfaceC1809a1, c0769g, interfaceC1809a116, true);
                                            break;
                                    }
                                    return C3967n.f12976a;
                                }
                            };
                            c1836h04.m4545k0(obj4);
                        } else {
                            z9 = z11;
                            obj4 = objM4514P11;
                            z10 = false;
                            interfaceC1809a1 = interfaceC1809a113;
                        }
                        InterfaceC1220a interfaceC1220a6 = (InterfaceC1220a) obj4;
                        InterfaceC1220a interfaceC1220a7 = null;
                        if (((String) interfaceC1809a114.getValue()) == null) {
                            c1836h04.m4525a0(-1277789144);
                            c1836h04.m4553p(z10);
                            interfaceC1220a = null;
                        } else {
                            c1836h04.m4525a0(-1277723827);
                            boolean zM4538h5 = c1836h04.m4538h(c0769g) | c1836h04.m4538h(context2);
                            Object objM4514P12 = c1836h04.m4514P();
                            if (zM4538h5 || objM4514P12 == c1823e3) {
                                final int i10 = 0;
                                final InterfaceC1809a1 interfaceC1809a117 = interfaceC1809a1;
                                InterfaceC1220a interfaceC1220a8 = new InterfaceC1220a() { // from class: wb.al
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    @Override // p085fg.InterfaceC1220a
                                    public final Object invoke() {
                                        C0765c c0765cM1982b;
                                        switch (i10) {
                                            case 0:
                                                Context context3 = context2;
                                                InterfaceC1809a1 interfaceC1809a1172 = interfaceC1809a117;
                                                InterfaceC1809a1 interfaceC1809a118 = interfaceC1809a115;
                                                C0769g c0769g2 = c0769g;
                                                InterfaceC1809a1 interfaceC1809a119 = interfaceC1809a116;
                                                List list3 = (List) interfaceC1809a1172.getValue();
                                                ArrayList arrayList2 = new ArrayList();
                                                for (Object obj5 : list3) {
                                                    if (!AbstractC1416l.m3825a(((C0765c) obj5).f2288a, ((C0765c) interfaceC1809a118.getValue()).f2288a)) {
                                                        arrayList2.add(obj5);
                                                    }
                                                }
                                                c0769g2.m1985e(arrayList2);
                                                interfaceC1809a1172.setValue(c0769g2.m1986f());
                                                C0545f c0545f = AbstractC0283h.f824a;
                                                if (c0545f != null) {
                                                    c0545f.m1554r();
                                                }
                                                interfaceC1809a119.setValue(C5483xq.f22029c);
                                                Toast.makeText(context3, "任务已删除", 0).show();
                                                break;
                                            case 1:
                                                Context context4 = context2;
                                                InterfaceC1809a1 interfaceC1809a120 = interfaceC1809a117;
                                                if (AbstractC4955ho.m9615n3(context4, interfaceC1809a120, interfaceC1809a115, c0769g, interfaceC1809a116, false)) {
                                                    String str = ((C0765c) interfaceC1809a120.getValue()).f2288a;
                                                    str.getClass();
                                                    C0545f c0545f2 = AbstractC0283h.f824a;
                                                    if (c0545f2 != null) {
                                                        synchronized (c0545f2) {
                                                            try {
                                                                if (!((C0769g) c0545f2.f1722e).m1983c() || (c0765cM1982b = ((C0769g) c0545f2.f1722e).m1982b(str)) == null || c0765cM1982b.f2300m.equals("running")) {
                                                                    Toast.makeText(context4, "立即执行失败", 0).show();
                                                                } else {
                                                                    String strConcat = "scheduled_task:".concat(str);
                                                                    ((ConcurrentHashMap) c0545f2.f1723f).remove(strConcat);
                                                                    C3086j c3086jM1542u = C0545f.m1542u();
                                                                    if (c3086jM1542u != null) {
                                                                        c3086jM1542u.m6550a(strConcat);
                                                                    }
                                                                    C0765c c0765cM1980a = C0765c.m1980a(C0014a.m184r(c0765cM1982b), 0, null, null, null, null, 0L, 0, null, 0, 0, false, "running", 0L, 0, 0, null, 0, 0, null, 0, null, 4190207);
                                                                    ((C0769g) c0545f2.f1722e).m1984d(c0765cM1980a);
                                                                    RunnableC0766d runnableC0766d = new RunnableC0766d(c0545f2, c0765cM1980a, 0);
                                                                    C3086j c3086jM1542u2 = C0545f.m1542u();
                                                                    if (c3086jM1542u2 != null) {
                                                                        c3086jM1542u2.m6553d(runnableC0766d);
                                                                    } else {
                                                                        Thread thread = new Thread(runnableC0766d, "Hchat-ScheduledTask-Now-".concat(str));
                                                                        thread.setDaemon(true);
                                                                        thread.start();
                                                                    }
                                                                    Toast.makeText(context4, "任务已加入立即执行队列", 0).show();
                                                                }
                                                            } catch (Throwable th2) {
                                                                throw th2;
                                                            }
                                                        }
                                                    } else {
                                                        Toast.makeText(context4, "立即执行失败", 0).show();
                                                    }
                                                }
                                                return C3967n.f12976a;
                                            default:
                                                AbstractC4955ho.m9615n3(context2, interfaceC1809a117, interfaceC1809a115, c0769g, interfaceC1809a116, true);
                                                break;
                                        }
                                        return C3967n.f12976a;
                                    }
                                };
                                interfaceC1809a1 = interfaceC1809a117;
                                interfaceC1809a115 = interfaceC1809a115;
                                c1836h04.m4545k0(interfaceC1220a8);
                                objM4514P12 = interfaceC1220a8;
                            }
                            c1836h04.m4553p(z10);
                            interfaceC1220a = (InterfaceC1220a) objM4514P12;
                        }
                        if (((String) interfaceC1809a114.getValue()) == null) {
                            c1836h04.m4525a0(-1277367544);
                        } else {
                            c1836h04.m4525a0(-1277294880);
                            boolean zM4538h6 = c1836h04.m4538h(context2) | c1836h04.m4538h(c0769g);
                            Object objM4514P13 = c1836h04.m4514P();
                            if (zM4538h6 || objM4514P13 == c1823e3) {
                                final int i11 = 1;
                                InterfaceC1220a interfaceC1220a9 = new InterfaceC1220a() { // from class: wb.al
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    @Override // p085fg.InterfaceC1220a
                                    public final Object invoke() {
                                        C0765c c0765cM1982b;
                                        switch (i11) {
                                            case 0:
                                                Context context3 = context2;
                                                InterfaceC1809a1 interfaceC1809a1172 = interfaceC1809a115;
                                                InterfaceC1809a1 interfaceC1809a118 = interfaceC1809a1;
                                                C0769g c0769g2 = c0769g;
                                                InterfaceC1809a1 interfaceC1809a119 = interfaceC1809a116;
                                                List list3 = (List) interfaceC1809a1172.getValue();
                                                ArrayList arrayList2 = new ArrayList();
                                                for (Object obj5 : list3) {
                                                    if (!AbstractC1416l.m3825a(((C0765c) obj5).f2288a, ((C0765c) interfaceC1809a118.getValue()).f2288a)) {
                                                        arrayList2.add(obj5);
                                                    }
                                                }
                                                c0769g2.m1985e(arrayList2);
                                                interfaceC1809a1172.setValue(c0769g2.m1986f());
                                                C0545f c0545f = AbstractC0283h.f824a;
                                                if (c0545f != null) {
                                                    c0545f.m1554r();
                                                }
                                                interfaceC1809a119.setValue(C5483xq.f22029c);
                                                Toast.makeText(context3, "任务已删除", 0).show();
                                                break;
                                            case 1:
                                                Context context4 = context2;
                                                InterfaceC1809a1 interfaceC1809a120 = interfaceC1809a115;
                                                if (AbstractC4955ho.m9615n3(context4, interfaceC1809a120, interfaceC1809a1, c0769g, interfaceC1809a116, false)) {
                                                    String str = ((C0765c) interfaceC1809a120.getValue()).f2288a;
                                                    str.getClass();
                                                    C0545f c0545f2 = AbstractC0283h.f824a;
                                                    if (c0545f2 != null) {
                                                        synchronized (c0545f2) {
                                                            try {
                                                                if (!((C0769g) c0545f2.f1722e).m1983c() || (c0765cM1982b = ((C0769g) c0545f2.f1722e).m1982b(str)) == null || c0765cM1982b.f2300m.equals("running")) {
                                                                    Toast.makeText(context4, "立即执行失败", 0).show();
                                                                } else {
                                                                    String strConcat = "scheduled_task:".concat(str);
                                                                    ((ConcurrentHashMap) c0545f2.f1723f).remove(strConcat);
                                                                    C3086j c3086jM1542u = C0545f.m1542u();
                                                                    if (c3086jM1542u != null) {
                                                                        c3086jM1542u.m6550a(strConcat);
                                                                    }
                                                                    C0765c c0765cM1980a = C0765c.m1980a(C0014a.m184r(c0765cM1982b), 0, null, null, null, null, 0L, 0, null, 0, 0, false, "running", 0L, 0, 0, null, 0, 0, null, 0, null, 4190207);
                                                                    ((C0769g) c0545f2.f1722e).m1984d(c0765cM1980a);
                                                                    RunnableC0766d runnableC0766d = new RunnableC0766d(c0545f2, c0765cM1980a, 0);
                                                                    C3086j c3086jM1542u2 = C0545f.m1542u();
                                                                    if (c3086jM1542u2 != null) {
                                                                        c3086jM1542u2.m6553d(runnableC0766d);
                                                                    } else {
                                                                        Thread thread = new Thread(runnableC0766d, "Hchat-ScheduledTask-Now-".concat(str));
                                                                        thread.setDaemon(true);
                                                                        thread.start();
                                                                    }
                                                                    Toast.makeText(context4, "任务已加入立即执行队列", 0).show();
                                                                }
                                                            } catch (Throwable th2) {
                                                                throw th2;
                                                            }
                                                        }
                                                    } else {
                                                        Toast.makeText(context4, "立即执行失败", 0).show();
                                                    }
                                                }
                                                return C3967n.f12976a;
                                            default:
                                                AbstractC4955ho.m9615n3(context2, interfaceC1809a115, interfaceC1809a1, c0769g, interfaceC1809a116, true);
                                                break;
                                        }
                                        return C3967n.f12976a;
                                    }
                                };
                                c1836h04.m4545k0(interfaceC1220a9);
                                objM4514P13 = interfaceC1220a9;
                            }
                            interfaceC1220a7 = (InterfaceC1220a) objM4514P13;
                        }
                        c1836h04.m4553p(z10);
                        AbstractC4955ho.m9588k3(context2, c0765c, z9, c3641z3, interfaceC1220a4, interfaceC1231l2, interfaceC1220a5, interfaceC1235p, interfaceC1231l3, interfaceC1231l4, interfaceC1220a6, interfaceC1220a, interfaceC1220a7, c1836h04, 807100416);
                        c1836h04.m4553p(z10);
                    } else {
                        if (abstractC5547zq.equals(C5483xq.f22027a)) {
                            c1836h04.m4525a0(-1276667006);
                            boolean z12 = ((C0765c) interfaceC1809a115.getValue()).f2308u == 1;
                            String str = z12 ? "选择原生群发好友" : "选择发送对象";
                            EnumC5358u0 enumC5358u0 = z12 ? EnumC5358u0.f20978g : EnumC5358u0.f20981j;
                            String strM9316D5 = AbstractC4955ho.m9316D5(((C0765c) interfaceC1809a115.getValue()).f2293f);
                            Object objM4514P14 = c1836h04.m4514P();
                            if (objM4514P14 == c1823e3) {
                                objM4514P14 = new C5015jk(2);
                                c1836h04.m4545k0(objM4514P14);
                            }
                            C5391v0 c5391v0 = new C5391v0(str, enumC5358u0, true, strM9316D5, (InterfaceC1231l) objM4514P14, true, Opcodes.CHECKCAST);
                            Object objM4514P15 = c1836h04.m4514P();
                            if (objM4514P15 == c1823e3) {
                                objM4514P15 = new C5509yk(interfaceC1809a116, 6);
                                c1836h04.m4545k0(objM4514P15);
                            }
                            InterfaceC1220a interfaceC1220a10 = (InterfaceC1220a) objM4514P15;
                            Object objM4514P16 = c1836h04.m4514P();
                            if (objM4514P16 == c1823e3) {
                                objM4514P16 = new C4029m1(24, interfaceC1809a115, interfaceC1809a116);
                                c1836h04.m4545k0(objM4514P16);
                            }
                            AbstractC4955ho.m9504b0(context2, c5391v0, interfaceC1220a10, (InterfaceC1231l) objM4514P16, c1836h04, 3456);
                            c1836h04.m4553p(false);
                        } else {
                            if (!(abstractC5547zq instanceof C5515yq)) {
                                throw AbstractC0255e.m1015d(c1836h04, -1426816519, false);
                            }
                            c1836h04.m4525a0(-1275722560);
                            C4737b3 c4737b32 = ((C5515yq) abstractC5547zq).f22239b;
                            Object objM4514P17 = c1836h04.m4514P();
                            if (objM4514P17 == c1823e3) {
                                objM4514P17 = new C5509yk(interfaceC1809a116, 7);
                                c1836h04.m4545k0(objM4514P17);
                            }
                            AbstractC4955ho.m9319E0(c4737b32, (InterfaceC1220a) objM4514P17, c1836h04, 48);
                            c1836h04.m4553p(false);
                        }
                    }
                } else {
                    c1836h04.m4519V();
                }
                return C3967n.f12976a;
            case 2:
                InterfaceC4544a interfaceC4544a2 = (InterfaceC4544a) this.f21284n;
                InterfaceC1220a interfaceC1220a11 = (InterfaceC1220a) this.f21286p;
                Context context3 = (Context) this.f21287q;
                C3641z c3641z4 = (C3641z) this.f21278h;
                C3641z c3641z5 = (C3641z) this.f21288r;
                InterfaceC1809a1 interfaceC1809a118 = (InterfaceC1809a1) this.f21279i;
                InterfaceC1809a1 interfaceC1809a119 = (InterfaceC1809a1) this.f21280j;
                C4538r c4538r = (C4538r) this.f21289s;
                final InterfaceC1809a1 interfaceC1809a120 = (InterfaceC1809a1) this.f21281k;
                InterfaceC1809a1 interfaceC1809a121 = (InterfaceC1809a1) this.f21282l;
                final InterfaceC1809a1 interfaceC1809a122 = (InterfaceC1809a1) this.f21283m;
                final InterfaceC1809a1 interfaceC1809a123 = (InterfaceC1809a1) this.f21285o;
                EnumC4897g enumC4897g = (EnumC4897g) obj;
                C1836h0 c1836h05 = (C1836h0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                enumC4897g.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= c1836h05.m4530d(enumC4897g.ordinal()) ? 4 : 2;
                }
                if (c1836h05.m4516S(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    int iOrdinal = enumC4897g.ordinal();
                    C1823e c1823e4 = C1851l.f6155a;
                    if (iOrdinal == 0) {
                        c1836h05.m4525a0(1677597256);
                        boolean zBooleanValue2 = ((Boolean) interfaceC1809a118.getValue()).booleanValue();
                        List list3 = (List) interfaceC1809a119.getValue();
                        boolean zM4538h7 = c1836h05.m4538h(context3);
                        Object objM4514P18 = c1836h05.m4514P();
                        if (zM4538h7 || objM4514P18 == c1823e4) {
                            objM4514P18 = new C5279rk(context3, interfaceC1809a118, c4538r);
                            c1836h05.m4545k0(objM4514P18);
                        }
                        InterfaceC1231l interfaceC1231l5 = (InterfaceC1231l) objM4514P18;
                        Object objM4514P19 = c1836h05.m4514P();
                        if (objM4514P19 == c1823e4) {
                            objM4514P19 = new C4885fk(interfaceC1809a120, 22);
                            c1836h05.m4545k0(objM4514P19);
                        }
                        AbstractC4955ho.m9566i(interfaceC4544a2, zBooleanValue2, list3, interfaceC1220a11, interfaceC1231l5, (InterfaceC1220a) objM4514P19, c1836h05, 196608);
                        c1836h05.m4553p(false);
                    } else if (iOrdinal == 1) {
                        c1836h05.m4525a0(1677612058);
                        List list4 = (List) interfaceC1809a119.getValue();
                        String str2 = (String) interfaceC1809a121.getValue();
                        Object objM4514P20 = c1836h05.m4514P();
                        if (objM4514P20 == c1823e4) {
                            objM4514P20 = new C4917gj(interfaceC1809a121, 20);
                            c1836h05.m4545k0(objM4514P20);
                        }
                        InterfaceC1231l interfaceC1231l6 = (InterfaceC1231l) objM4514P20;
                        Object objM4514P21 = c1836h05.m4514P();
                        if (objM4514P21 == c1823e4) {
                            objM4514P21 = new C4885fk(interfaceC1809a120, 24);
                            c1836h05.m4545k0(objM4514P21);
                        }
                        InterfaceC1220a interfaceC1220a12 = (InterfaceC1220a) objM4514P21;
                        Object objM4514P22 = c1836h05.m4514P();
                        if (objM4514P22 == c1823e4) {
                            interfaceC1809a12 = interfaceC1809a122;
                            c1823e = c1823e4;
                            C0467n0 c0467n0 = new C0467n0(c4538r, interfaceC1809a119, interfaceC1809a12, interfaceC1809a120, 21);
                            c4538r = c4538r;
                            interfaceC1809a119 = interfaceC1809a119;
                            c1836h05.m4545k0(c0467n0);
                            objM4514P22 = c0467n0;
                        } else {
                            interfaceC1809a12 = interfaceC1809a122;
                            c1823e = c1823e4;
                        }
                        InterfaceC1220a interfaceC1220a13 = (InterfaceC1220a) objM4514P22;
                        Object objM4514P23 = c1836h05.m4514P();
                        if (objM4514P23 == c1823e) {
                            objM4514P23 = new C4029m1(23, interfaceC1809a12, interfaceC1809a120);
                            c1836h05.m4545k0(objM4514P23);
                        }
                        InterfaceC1231l interfaceC1231l7 = (InterfaceC1231l) objM4514P23;
                        boolean zM4538h8 = c1836h05.m4538h(context3);
                        Object objM4514P24 = c1836h05.m4514P();
                        if (zM4538h8 || objM4514P24 == c1823e) {
                            objM4514P24 = new C5278rj(context3, interfaceC1809a119, c4538r);
                            c1836h05.m4545k0(objM4514P24);
                        }
                        InterfaceC1235p interfaceC1235p2 = (InterfaceC1235p) objM4514P24;
                        boolean zM4538h9 = c1836h05.m4538h(context3);
                        Object objM4514P25 = c1836h05.m4514P();
                        if (zM4538h9 || objM4514P25 == c1823e) {
                            objM4514P25 = new C5279rk(context3, interfaceC1809a119, c4538r, 1);
                            c1836h05.m4545k0(objM4514P25);
                        }
                        InterfaceC1231l interfaceC1231l8 = (InterfaceC1231l) objM4514P25;
                        boolean zM4538h10 = c1836h05.m4538h(context3);
                        Object objM4514P26 = c1836h05.m4514P();
                        if (zM4538h10 || objM4514P26 == c1823e) {
                            objM4514P26 = new C5279rk(context3, interfaceC1809a119, c4538r, 2);
                            c1836h05.m4545k0(objM4514P26);
                        }
                        AbstractC4955ho.m9602m(1797120, interfaceC1220a12, interfaceC1220a13, interfaceC1231l6, interfaceC1231l7, interfaceC1231l8, (InterfaceC1231l) objM4514P26, interfaceC1235p2, c1836h05, str2, list4, c3641z4);
                        c1836h05.m4553p(false);
                    } else if (iOrdinal != 2) {
                        EnumC4897g enumC4897g2 = EnumC4897g.f17315i;
                        if (iOrdinal == 3) {
                            c1836h05.m4525a0(470516528);
                            final C4521a c4521a = (C4521a) interfaceC1809a122.getValue();
                            EnumC4864f enumC4864f = (EnumC4864f) interfaceC1809a123.getValue();
                            if (c4521a != null) {
                                Set set = c4521a.f14903g;
                                Set set2 = c4521a.f14901e;
                                if (enumC4864f == null) {
                                    c1836h0 = c1836h05;
                                    c1836h0.m4525a0(470572018);
                                    c1836h0.m4553p(false);
                                    interfaceC1809a120.setValue(enumC4897g2);
                                } else {
                                    c1836h05.m4525a0(470723670);
                                    final boolean z13 = enumC4864f == EnumC4864f.f17035g;
                                    boolean zM4530d = c1836h05.m4530d(enumC4864f.ordinal()) | c1836h05.m4534f(c4521a.f14897a) | c1836h05.m4534f(set2) | c1836h05.m4534f(set);
                                    Object objM4514P27 = c1836h05.m4514P();
                                    if (zM4530d || objM4514P27 == c1823e4) {
                                        String str3 = z13 ? "选择监听会话" : "选择转发会话";
                                        EnumC5358u0 enumC5358u02 = z13 ? EnumC5358u0.f20981j : EnumC5358u0.f20980i;
                                        if (z13) {
                                            set = set2;
                                        }
                                        final int i12 = 0;
                                        objM4514P27 = new C5391v0(str3, enumC5358u02, true, AbstractC4955ho.m9316D5(set), new InterfaceC1231l() { // from class: wb.sk
                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                            @Override // p085fg.InterfaceC1231l
                                            public final Object invoke(Object obj5) {
                                                switch (i12) {
                                                    case 0:
                                                        String str4 = (String) obj5;
                                                        str4.getClass();
                                                        Set setM9715y6 = AbstractC4955ho.m9715y6(str4);
                                                        boolean z14 = z13;
                                                        C4521a c4521a2 = c4521a;
                                                        interfaceC1809a122.setValue(z14 ? C4521a.m8946a(c4521a2, null, false, false, setM9715y6, AbstractC4955ho.m9413P6(c4521a2.f14902f, setM9715y6), null, null, false, 0L, false, null, false, null, 16335) : C4521a.m8946a(c4521a2, null, false, false, null, null, setM9715y6, null, false, 0L, false, null, false, null, 16319));
                                                        interfaceC1809a123.setValue(null);
                                                        interfaceC1809a120.setValue(EnumC4897g.f17315i);
                                                        break;
                                                    default:
                                                        List list5 = (List) obj5;
                                                        list5.getClass();
                                                        ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(list5));
                                                        Iterator it = list5.iterator();
                                                        while (it.hasNext()) {
                                                            arrayList2.add(((C5292s0) it.next()).f20550a);
                                                        }
                                                        Set setM9715y62 = AbstractC4955ho.m9715y6(AbstractC4955ho.m9316D5(arrayList2));
                                                        boolean z15 = z13;
                                                        C4521a c4521a3 = c4521a;
                                                        interfaceC1809a122.setValue(z15 ? C4521a.m8946a(c4521a3, null, false, false, setM9715y62, AbstractC4955ho.m9413P6(c4521a3.f14902f, setM9715y62), null, null, false, 0L, false, null, false, null, 16335) : C4521a.m8946a(c4521a3, null, false, false, null, null, setM9715y62, null, false, 0L, false, null, false, null, 16319));
                                                        interfaceC1809a123.setValue(null);
                                                        interfaceC1809a120.setValue(EnumC4897g.f17315i);
                                                        break;
                                                }
                                                return C3967n.f12976a;
                                            }
                                        }, true, Opcodes.CHECKCAST);
                                        c1836h05.m4545k0(objM4514P27);
                                    }
                                    C5391v0 c5391v02 = (C5391v0) objM4514P27;
                                    Object objM4514P28 = c1836h05.m4514P();
                                    if (objM4514P28 == c1823e4) {
                                        objM4514P28 = new C5213pk(2, interfaceC1809a123, interfaceC1809a120);
                                        c1836h05.m4545k0(objM4514P28);
                                    }
                                    InterfaceC1220a interfaceC1220a14 = (InterfaceC1220a) objM4514P28;
                                    boolean zM4536g = c1836h05.m4536g(z13) | c1836h05.m4538h(c4521a);
                                    Object objM4514P29 = c1836h05.m4514P();
                                    if (zM4536g || objM4514P29 == c1823e4) {
                                        final int i13 = 1;
                                        InterfaceC1231l interfaceC1231l9 = new InterfaceC1231l() { // from class: wb.sk
                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                            @Override // p085fg.InterfaceC1231l
                                            public final Object invoke(Object obj5) {
                                                switch (i13) {
                                                    case 0:
                                                        String str4 = (String) obj5;
                                                        str4.getClass();
                                                        Set setM9715y6 = AbstractC4955ho.m9715y6(str4);
                                                        boolean z14 = z13;
                                                        C4521a c4521a2 = c4521a;
                                                        interfaceC1809a122.setValue(z14 ? C4521a.m8946a(c4521a2, null, false, false, setM9715y6, AbstractC4955ho.m9413P6(c4521a2.f14902f, setM9715y6), null, null, false, 0L, false, null, false, null, 16335) : C4521a.m8946a(c4521a2, null, false, false, null, null, setM9715y6, null, false, 0L, false, null, false, null, 16319));
                                                        interfaceC1809a123.setValue(null);
                                                        interfaceC1809a120.setValue(EnumC4897g.f17315i);
                                                        break;
                                                    default:
                                                        List list5 = (List) obj5;
                                                        list5.getClass();
                                                        ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(list5));
                                                        Iterator it = list5.iterator();
                                                        while (it.hasNext()) {
                                                            arrayList2.add(((C5292s0) it.next()).f20550a);
                                                        }
                                                        Set setM9715y62 = AbstractC4955ho.m9715y6(AbstractC4955ho.m9316D5(arrayList2));
                                                        boolean z15 = z13;
                                                        C4521a c4521a3 = c4521a;
                                                        interfaceC1809a122.setValue(z15 ? C4521a.m8946a(c4521a3, null, false, false, setM9715y62, AbstractC4955ho.m9413P6(c4521a3.f14902f, setM9715y62), null, null, false, 0L, false, null, false, null, 16335) : C4521a.m8946a(c4521a3, null, false, false, null, null, setM9715y62, null, false, 0L, false, null, false, null, 16319));
                                                        interfaceC1809a123.setValue(null);
                                                        interfaceC1809a120.setValue(EnumC4897g.f17315i);
                                                        break;
                                                }
                                                return C3967n.f12976a;
                                            }
                                        };
                                        c1836h05.m4545k0(interfaceC1231l9);
                                        objM4514P29 = interfaceC1231l9;
                                    }
                                    AbstractC4955ho.m9504b0(context3, c5391v02, interfaceC1220a14, (InterfaceC1231l) objM4514P29, c1836h05, 384);
                                    c1836h0 = c1836h05;
                                    c1836h0.m4553p(false);
                                }
                                c1836h0.m4553p(false);
                            }
                        } else if (iOrdinal == 4) {
                            c1836h05.m4525a0(473019561);
                            C4521a c4521a2 = (C4521a) interfaceC1809a122.getValue();
                            Set set3 = c4521a2 != null ? c4521a2.f14901e : null;
                            if (set3 == null) {
                                set3 = C4175v.f13712g;
                            }
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            for (Object obj5 : set3) {
                                String str4 = (String) obj5;
                                if (AbstractC3156t.m6733W(str4, "@chatroom", false) || AbstractC3156t.m6733W(str4, "@im.chatroom", false)) {
                                    linkedHashSet.add(obj5);
                                }
                            }
                            if (c4521a2 != null) {
                                Set set4 = c4521a2.f14902f;
                                if (linkedHashSet.isEmpty()) {
                                    c1836h02 = c1836h05;
                                    c1836h02.m4525a0(473198834);
                                    c1836h02.m4553p(false);
                                    interfaceC1809a120.setValue(enumC4897g2);
                                } else {
                                    c1836h05.m4525a0(473311271);
                                    boolean zM4534f2 = c1836h05.m4534f(c4521a2.f14897a) | c1836h05.m4534f(set4) | c1836h05.m4534f(linkedHashSet);
                                    Object objM4514P30 = c1836h05.m4514P();
                                    if (zM4534f2 || objM4514P30 == c1823e4) {
                                        ArrayList arrayList2 = new ArrayList();
                                        Iterator it = set4.iterator();
                                        while (it.hasNext()) {
                                            String strM9636p6 = AbstractC4955ho.m9636p6((String) it.next());
                                            if (strM9636p6 != null) {
                                                arrayList2.add(strM9636p6);
                                            }
                                        }
                                        objM4514P30 = new C4804d4("选择监听群成员", AbstractC4166m.m8392A1(AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList2)), "|", null, null, null, 62), new C5015jk(1), linkedHashSet);
                                        c1836h05.m4545k0(objM4514P30);
                                    }
                                    C4804d4 c4804d4 = (C4804d4) objM4514P30;
                                    Object objM4514P31 = c1836h05.m4514P();
                                    if (objM4514P31 == c1823e4) {
                                        objM4514P31 = new C4885fk(interfaceC1809a120, 21);
                                        c1836h05.m4545k0(objM4514P31);
                                    }
                                    InterfaceC1220a interfaceC1220a15 = (InterfaceC1220a) objM4514P31;
                                    boolean zM4538h11 = c1836h05.m4538h(c4521a2) | c1836h05.m4538h(context3);
                                    Object objM4514P32 = c1836h05.m4514P();
                                    if (zM4538h11 || objM4514P32 == c1823e4) {
                                        C0454k c0454k = new C0454k(c4521a2, context3, interfaceC1809a122, interfaceC1809a120, 23);
                                        context = context3;
                                        c1836h05.m4545k0(c0454k);
                                        objM4514P32 = c0454k;
                                    } else {
                                        context = context3;
                                    }
                                    AbstractC4955ho.m9622o1(context, c4804d4, interfaceC1220a15, (InterfaceC1231l) objM4514P32, c1836h05, 384);
                                    c1836h02 = c1836h05;
                                    c1836h02.m4553p(false);
                                }
                                c1836h02.m4553p(false);
                            }
                        } else {
                            if (iOrdinal != 5) {
                                throw AbstractC0255e.m1015d(c1836h05, 1677603957, false);
                            }
                            c1836h05.m4525a0(474366914);
                            C4521a c4521a3 = (C4521a) interfaceC1809a122.getValue();
                            if (c4521a3 == null) {
                                c1836h05.m4525a0(474424946);
                                c1836h05.m4553p(false);
                                interfaceC1809a120.setValue(enumC4897g2);
                            } else {
                                c1836h05.m4525a0(474519279);
                                Set set5 = c4521a3.f14904h;
                                Object objM4514P33 = c1836h05.m4514P();
                                if (objM4514P33 == c1823e4) {
                                    objM4514P33 = new C4885fk(interfaceC1809a120, 23);
                                    c1836h05.m4545k0(objM4514P33);
                                }
                                InterfaceC1220a interfaceC1220a16 = (InterfaceC1220a) objM4514P33;
                                boolean zM4538h12 = c1836h05.m4538h(c4521a3);
                                Object objM4514P34 = c1836h05.m4514P();
                                if (zM4538h12 || objM4514P34 == c1823e4) {
                                    objM4514P34 = new C4819dj(c4521a3, interfaceC1809a122, interfaceC1809a120, 3);
                                    c1836h05.m4545k0(objM4514P34);
                                }
                                AbstractC4955ho.m9611n(set5, interfaceC1220a16, (InterfaceC1231l) objM4514P34, c1836h05, 48);
                                c1836h05.m4553p(false);
                            }
                            c1836h05.m4553p(false);
                        }
                    } else {
                        c1836h05.m4525a0(467691560);
                        C4521a c4521a4 = (C4521a) interfaceC1809a122.getValue();
                        if (c4521a4 == null) {
                            c1836h05.m4525a0(467681299);
                            c1836h05.m4553p(false);
                            interfaceC1809a120.setValue(EnumC4897g.f17314h);
                        } else {
                            c1836h05.m4525a0(467842964);
                            Object objM4514P35 = c1836h05.m4514P();
                            if (objM4514P35 == c1823e4) {
                                objM4514P35 = new C4885fk(interfaceC1809a120, 25);
                                c1836h05.m4545k0(objM4514P35);
                            }
                            InterfaceC1220a interfaceC1220a17 = (InterfaceC1220a) objM4514P35;
                            Object objM4514P36 = c1836h05.m4514P();
                            if (objM4514P36 == c1823e4) {
                                objM4514P36 = new C4917gj(interfaceC1809a122, 19);
                                c1836h05.m4545k0(objM4514P36);
                            }
                            InterfaceC1231l interfaceC1231l10 = (InterfaceC1231l) objM4514P36;
                            Object objM4514P37 = c1836h05.m4514P();
                            if (objM4514P37 == c1823e4) {
                                objM4514P37 = new C5071la(interfaceC1809a122, interfaceC1809a123, interfaceC1809a120, 13);
                                c1836h05.m4545k0(objM4514P37);
                            }
                            InterfaceC1235p interfaceC1235p3 = (InterfaceC1235p) objM4514P37;
                            Object objM4514P38 = c1836h05.m4514P();
                            if (objM4514P38 == c1823e4) {
                                objM4514P38 = new C4029m1(21, interfaceC1809a122, interfaceC1809a120);
                                c1836h05.m4545k0(objM4514P38);
                            }
                            InterfaceC1231l interfaceC1231l11 = (InterfaceC1231l) objM4514P38;
                            Object objM4514P39 = c1836h05.m4514P();
                            if (objM4514P39 == c1823e4) {
                                objM4514P39 = new C4029m1(22, interfaceC1809a122, interfaceC1809a120);
                                c1836h05.m4545k0(objM4514P39);
                            }
                            InterfaceC1231l interfaceC1231l12 = (InterfaceC1231l) objM4514P39;
                            boolean zM4538h13 = c1836h05.m4538h(context3);
                            Object objM4514P40 = c1836h05.m4514P();
                            if (zM4538h13 || objM4514P40 == c1823e4) {
                                C0884o c0884o2 = new C0884o(context3, interfaceC1809a119, c4538r, interfaceC1809a122, interfaceC1809a120, 14);
                                c1836h05.m4545k0(c0884o2);
                                objM4514P40 = c0884o2;
                            }
                            AbstractC4955ho.m9593l(c4521a4, c3641z5, interfaceC1220a17, interfaceC1231l10, interfaceC1235p3, interfaceC1231l11, interfaceC1231l12, (InterfaceC1231l) objM4514P40, c1836h05, 1797504);
                            c1836h05.m4553p(false);
                        }
                        c1836h05.m4553p(false);
                    }
                } else {
                    c1836h05.m4519V();
                }
                return C3967n.f12976a;
            case 3:
                Context context4 = (Context) this.f21284n;
                InterfaceC3599t interfaceC3599t = (InterfaceC3599t) this.f21278h;
                InterfaceC1809a1 interfaceC1809a124 = (InterfaceC1809a1) this.f21279i;
                InterfaceC1809a1 interfaceC1809a125 = (InterfaceC1809a1) this.f21280j;
                InterfaceC1809a1 interfaceC1809a126 = (InterfaceC1809a1) this.f21281k;
                InterfaceC1809a1 interfaceC1809a127 = (InterfaceC1809a1) this.f21282l;
                InterfaceC1809a1 interfaceC1809a128 = (InterfaceC1809a1) this.f21283m;
                InterfaceC1809a1 interfaceC1809a129 = (InterfaceC1809a1) this.f21285o;
                InterfaceC1809a1 interfaceC1809a130 = (InterfaceC1809a1) this.f21286p;
                InterfaceC1809a1 interfaceC1809a131 = (InterfaceC1809a1) this.f21287q;
                InterfaceC1809a1 interfaceC1809a132 = (InterfaceC1809a1) this.f21288r;
                InterfaceC1809a1 interfaceC1809a133 = (InterfaceC1809a1) this.f21289s;
                C1836h0 c1836h06 = (C1836h0) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h06.m4516S(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-1788192155, new C0485s0(context4, interfaceC3599t, interfaceC1809a124, interfaceC1809a125, interfaceC1809a126, interfaceC1809a127, interfaceC1809a128, interfaceC1809a129, interfaceC1809a130, interfaceC1809a131, interfaceC1809a132, interfaceC1809a133, 2), c1836h06), c1836h06, 48, 1);
                } else {
                    c1836h06.m4519V();
                }
                return C3967n.f12976a;
            case 4:
                C5725r c5725r = (C5725r) this.f21284n;
                Context context5 = (Context) this.f21278h;
                InterfaceC1809a1 interfaceC1809a134 = (InterfaceC1809a1) this.f21279i;
                InterfaceC1809a1 interfaceC1809a135 = (InterfaceC1809a1) this.f21280j;
                InterfaceC1809a1 interfaceC1809a136 = (InterfaceC1809a1) this.f21281k;
                InterfaceC1809a1 interfaceC1809a137 = (InterfaceC1809a1) this.f21282l;
                InterfaceC1809a1 interfaceC1809a138 = (InterfaceC1809a1) this.f21283m;
                InterfaceC1809a1 interfaceC1809a139 = (InterfaceC1809a1) this.f21285o;
                InterfaceC1809a1 interfaceC1809a140 = (InterfaceC1809a1) this.f21286p;
                InterfaceC1809a1 interfaceC1809a141 = (InterfaceC1809a1) this.f21287q;
                InterfaceC1809a1 interfaceC1809a142 = (InterfaceC1809a1) this.f21288r;
                InterfaceC1809a1 interfaceC1809a143 = (InterfaceC1809a1) this.f21289s;
                C1836h0 c1836h07 = (C1836h0) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h07.m4516S(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-1989030073, new C0485s0(c5725r, context5, interfaceC1809a134, interfaceC1809a135, interfaceC1809a136, interfaceC1809a137, interfaceC1809a138, interfaceC1809a139, interfaceC1809a140, interfaceC1809a141, interfaceC1809a142, interfaceC1809a143, 1), c1836h07), c1836h07, 48, 1);
                } else {
                    c1836h07.m4519V();
                }
                return C3967n.f12976a;
            case 5:
                Context context6 = (Context) this.f21284n;
                InterfaceC4544a interfaceC4544a3 = (InterfaceC4544a) this.f21285o;
                SharedPreferences sharedPreferences2 = (SharedPreferences) this.f21286p;
                C3641z c3641z6 = (C3641z) this.f21278h;
                InterfaceC1220a interfaceC1220a18 = (InterfaceC1220a) this.f21287q;
                C5738e c5738e = (C5738e) this.f21288r;
                C3641z c3641z7 = (C3641z) this.f21289s;
                InterfaceC1809a1 interfaceC1809a144 = (InterfaceC1809a1) this.f21279i;
                InterfaceC1809a1 interfaceC1809a145 = (InterfaceC1809a1) this.f21280j;
                InterfaceC1809a1 interfaceC1809a146 = (InterfaceC1809a1) this.f21281k;
                InterfaceC1809a1 interfaceC1809a147 = (InterfaceC1809a1) this.f21282l;
                InterfaceC1809a1 interfaceC1809a148 = (InterfaceC1809a1) this.f21283m;
                AbstractC5230q4 abstractC5230q4 = (AbstractC5230q4) obj;
                C1836h0 c1836h08 = (C1836h0) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                abstractC5230q4.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= (iIntValue6 & 8) == 0 ? c1836h08.m4534f(abstractC5230q4) : c1836h08.m4538h(abstractC5230q4) ? 4 : 2;
                }
                boolean z14 = true;
                int i14 = iIntValue6;
                if (c1836h08.m4516S(i14 & 1, (iIntValue6 & 19) != 18)) {
                    boolean zEquals2 = abstractC5230q4.equals(C5197p4.f19927b);
                    C1823e c1823e5 = C1851l.f6155a;
                    if (zEquals2) {
                        c1836h08.m4525a0(-1366513311);
                        List list5 = (List) interfaceC1809a144.getValue();
                        Set set6 = (Set) interfaceC1809a145.getValue();
                        Set set7 = (Set) interfaceC1809a146.getValue();
                        Object objM4514P41 = c1836h08.m4514P();
                        if (objM4514P41 == c1823e5) {
                            objM4514P41 = new C4753bj(interfaceC1809a147, 15);
                            c1836h08.m4545k0(objM4514P41);
                        }
                        InterfaceC1220a interfaceC1220a19 = (InterfaceC1220a) objM4514P41;
                        Object objM4514P42 = c1836h08.m4514P();
                        if (objM4514P42 == c1823e5) {
                            objM4514P42 = new C4753bj(interfaceC1809a147, 18);
                            c1836h08.m4545k0(objM4514P42);
                        }
                        InterfaceC1220a interfaceC1220a20 = (InterfaceC1220a) objM4514P42;
                        Object objM4514P43 = c1836h08.m4514P();
                        if (objM4514P43 == c1823e5) {
                            list = list5;
                            objM4514P43 = new C4714ad(interfaceC1809a146, interfaceC1809a145, interfaceC1809a147, 3);
                            c1836h08.m4545k0(objM4514P43);
                        } else {
                            list = list5;
                        }
                        InterfaceC1231l interfaceC1231l13 = (InterfaceC1231l) objM4514P43;
                        boolean zM4538h14 = c1836h08.m4538h(c5738e) | c1836h08.m4538h(context6);
                        Object objM4514P44 = c1836h08.m4514P();
                        if (zM4538h14 || objM4514P44 == c1823e5) {
                            C0454k c0454k2 = new C0454k(context6, c5738e, interfaceC1809a146, interfaceC1809a145, 21);
                            c1836h08.m4545k0(c0454k2);
                            objM4514P44 = c0454k2;
                        }
                        AbstractC4955ho.m9344H1(context6, interfaceC4544a3, sharedPreferences2, list, set6, set7, c3641z6, interfaceC1220a18, interfaceC1220a19, interfaceC1220a20, interfaceC1231l13, (InterfaceC1231l) objM4514P44, c1836h08, 905969664);
                        c1836h08.m4553p(false);
                    } else if (abstractC5230q4.equals(C5197p4.f19926a)) {
                        c1836h08.m4525a0(-1366464509);
                        List list6 = (List) interfaceC1809a144.getValue();
                        String str5 = (String) interfaceC1809a148.getValue();
                        Object objM4514P45 = c1836h08.m4514P();
                        if (objM4514P45 == c1823e5) {
                            objM4514P45 = new C4917gj(interfaceC1809a148, 12);
                            c1836h08.m4545k0(objM4514P45);
                        }
                        InterfaceC1231l interfaceC1231l14 = (InterfaceC1231l) objM4514P45;
                        Object objM4514P46 = c1836h08.m4514P();
                        if (objM4514P46 == c1823e5) {
                            objM4514P46 = new C4753bj(interfaceC1809a147, 19);
                            c1836h08.m4545k0(objM4514P46);
                        }
                        InterfaceC1220a interfaceC1220a21 = (InterfaceC1220a) objM4514P46;
                        Object objM4514P47 = c1836h08.m4514P();
                        if (objM4514P47 == c1823e5) {
                            objM4514P47 = new C4753bj(interfaceC1809a147, 20);
                            c1836h08.m4545k0(objM4514P47);
                        }
                        InterfaceC1220a interfaceC1220a22 = (InterfaceC1220a) objM4514P47;
                        Object objM4514P48 = c1836h08.m4514P();
                        if (objM4514P48 == c1823e5) {
                            objM4514P48 = new C4917gj(interfaceC1809a147, 13);
                            c1836h08.m4545k0(objM4514P48);
                        }
                        InterfaceC1231l interfaceC1231l15 = (InterfaceC1231l) objM4514P48;
                        boolean zM4538h15 = c1836h08.m4538h(c5738e) | c1836h08.m4538h(context6);
                        Object objM4514P49 = c1836h08.m4514P();
                        if (zM4538h15 || objM4514P49 == c1823e5) {
                            objM4514P49 = new C5538zh(5, context6, c5738e, interfaceC1809a144);
                            c1836h08.m4545k0(objM4514P49);
                        }
                        AbstractC4955ho.m9336G1(list6, str5, interfaceC1231l14, c3641z7, interfaceC1220a21, interfaceC1220a22, interfaceC1231l15, (InterfaceC1220a) objM4514P49, c1836h08, 1794432);
                        c1836h08.m4553p(false);
                    } else if (abstractC5230q4 instanceof C5164o4) {
                        c1836h08.m4525a0(589997188);
                        String str6 = ((C5164o4) abstractC5230q4).f19314a;
                        InterfaceC1220a interfaceC1220a23 = null;
                        if (str6 != null) {
                            Iterator it2 = ((List) interfaceC1809a144.getValue()).iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    if (AbstractC1416l.m3825a(((C5739f) next).f23384a, str6)) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            c5739f = (C5739f) next;
                        } else {
                            c5739f = null;
                        }
                        Object objM4514P50 = c1836h08.m4514P();
                        if (objM4514P50 == c1823e5) {
                            objM4514P50 = new C4753bj(interfaceC1809a147, 21);
                            c1836h08.m4545k0(objM4514P50);
                        }
                        InterfaceC1220a interfaceC1220a24 = (InterfaceC1220a) objM4514P50;
                        boolean zM4538h16 = c1836h08.m4538h(context6);
                        if ((i14 & 14) != 4 && ((i14 & 8) == 0 || !c1836h08.m4538h(abstractC5230q4))) {
                            z14 = false;
                        }
                        boolean zM4538h17 = zM4538h16 | z14 | c1836h08.m4538h(c5738e);
                        Object objM4514P51 = c1836h08.m4514P();
                        if (zM4538h17 || objM4514P51 == c1823e5) {
                            interfaceC1809a13 = interfaceC1809a147;
                            c1823e2 = c1823e5;
                            c0884o = new C0884o(context6, abstractC5230q4, interfaceC1809a144, c5738e, interfaceC1809a13, 12);
                            interfaceC1809a144 = interfaceC1809a144;
                            c1836h08.m4545k0(c0884o);
                        } else {
                            interfaceC1809a13 = interfaceC1809a147;
                            c0884o = objM4514P51;
                            c1823e2 = c1823e5;
                        }
                        InterfaceC1231l interfaceC1231l16 = (InterfaceC1231l) c0884o;
                        if (c5739f == null) {
                            c1836h08.m4525a0(591267816);
                        } else {
                            c1836h08.m4525a0(591333908);
                            boolean zM4538h18 = c1836h08.m4538h(c5738e) | c1836h08.m4538h(c5739f) | c1836h08.m4538h(context6);
                            Object objM4514P52 = c1836h08.m4514P();
                            if (zM4538h18 || objM4514P52 == c1823e2) {
                                C0482r0 c0482r0 = new C0482r0(context6, interfaceC1809a144, c5739f, c5738e, interfaceC1809a13, 22);
                                c1836h08.m4545k0(c0482r0);
                                objM4514P52 = c0482r0;
                            }
                            interfaceC1220a23 = (InterfaceC1220a) objM4514P52;
                        }
                        c1836h08.m4553p(false);
                        AbstractC4955ho.m9328F1(c5739f, interfaceC1220a24, interfaceC1231l16, interfaceC1220a23, c1836h08, 48);
                        c1836h08.m4553p(false);
                    } else if (abstractC5230q4.equals(C5197p4.f19928c)) {
                        c1836h08.m4525a0(-1366384877);
                        Object objM4514P53 = c1836h08.m4514P();
                        if (objM4514P53 == c1823e5) {
                            objM4514P53 = new C4753bj(interfaceC1809a147, 16);
                            c1836h08.m4545k0(objM4514P53);
                        }
                        AbstractC4955ho.m9376L1(context6, sharedPreferences2, (InterfaceC1220a) objM4514P53, c1836h08, 384);
                        c1836h08.m4553p(false);
                    } else {
                        if (!(abstractC5230q4 instanceof C5131n4)) {
                            throw AbstractC0255e.m1015d(c1836h08, -1366512062, false);
                        }
                        c1836h08.m4525a0(-1366377129);
                        C5391v0 c5391v03 = ((C5131n4) abstractC5230q4).f19103a;
                        Object objM4514P54 = c1836h08.m4514P();
                        if (objM4514P54 == c1823e5) {
                            objM4514P54 = new C4753bj(interfaceC1809a147, 17);
                            c1836h08.m4545k0(objM4514P54);
                        }
                        InterfaceC1220a interfaceC1220a25 = (InterfaceC1220a) objM4514P54;
                        boolean zM4538h19 = c1836h08.m4538h(c5738e);
                        if ((i14 & 14) != 4 && ((i14 & 8) == 0 || !c1836h08.m4538h(abstractC5230q4))) {
                            z14 = false;
                        }
                        boolean zM4538h20 = zM4538h19 | z14 | c1836h08.m4538h(context6);
                        Object objM4514P55 = c1836h08.m4514P();
                        if (zM4538h20 || objM4514P55 == c1823e5) {
                            C0886p c0886p = new C0886p(abstractC5230q4, context6, c5738e, interfaceC1809a146, interfaceC1809a145, interfaceC1809a147, 9);
                            context6 = context6;
                            c1836h08.m4545k0(c0886p);
                            objM4514P55 = c0886p;
                        }
                        AbstractC4955ho.m9504b0(context6, c5391v03, interfaceC1220a25, (InterfaceC1231l) objM4514P55, c1836h08, 384);
                        c1836h08.m4553p(false);
                    }
                } else {
                    c1836h08.m4519V();
                }
                return C3967n.f12976a;
            case 6:
                return m9750e(obj, obj2, obj3);
            case 7:
                return m9751f(obj, obj2, obj3);
            case 8:
                return m9752g(obj, obj2, obj3);
            default:
                String str7 = (String) this.f21284n;
                InterfaceC1231l interfaceC1231l17 = (InterfaceC1231l) this.f21278h;
                String str8 = (String) this.f21279i;
                InterfaceC1231l interfaceC1231l18 = (InterfaceC1231l) this.f21280j;
                String str9 = (String) this.f21281k;
                String str10 = (String) this.f21282l;
                InterfaceC1231l interfaceC1231l19 = (InterfaceC1231l) this.f21283m;
                String str11 = (String) this.f21285o;
                InterfaceC1231l interfaceC1231l20 = (InterfaceC1231l) this.f21286p;
                InterfaceC1220a interfaceC1220a26 = (InterfaceC1220a) this.f21287q;
                String str12 = (String) this.f21288r;
                InterfaceC1231l interfaceC1231l21 = (InterfaceC1231l) this.f21289s;
                C1836h0 c1836h09 = (C1836h0) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h09.m4516S(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-1178655586, new C0485s0(str7, interfaceC1231l17, str8, interfaceC1231l18, str9, str10, interfaceC1231l19, str11, interfaceC1231l20, interfaceC1220a26, str12, interfaceC1231l21), c1836h09), c1836h09, 48, 1);
                } else {
                    c1836h09.m4519V();
                }
                return C3967n.f12976a;
        }
    }

    public /* synthetic */ C5397v6(Context context, InterfaceC4544a interfaceC4544a, SharedPreferences sharedPreferences, C3641z c3641z, InterfaceC1220a interfaceC1220a, C5738e c5738e, C3641z c3641z2, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15) {
        this.f21277g = 5;
        this.f21284n = context;
        this.f21285o = interfaceC4544a;
        this.f21286p = sharedPreferences;
        this.f21278h = c3641z;
        this.f21287q = interfaceC1220a;
        this.f21288r = c5738e;
        this.f21289s = c3641z2;
        this.f21279i = interfaceC1809a1;
        this.f21280j = interfaceC1809a12;
        this.f21281k = interfaceC1809a13;
        this.f21282l = interfaceC1809a14;
        this.f21283m = interfaceC1809a15;
    }

    public /* synthetic */ C5397v6(InterfaceC1809a1 interfaceC1809a1, Context context, InterfaceC1231l interfaceC1231l, C3471g c3471g, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1220a interfaceC1220a) {
        this.f21277g = 6;
        this.f21279i = interfaceC1809a1;
        this.f21284n = context;
        this.f21278h = interfaceC1231l;
        this.f21288r = c3471g;
        this.f21280j = interfaceC1809a12;
        this.f21281k = interfaceC1809a13;
        this.f21282l = interfaceC1809a14;
        this.f21283m = interfaceC1809a15;
        this.f21285o = interfaceC1809a16;
        this.f21286p = interfaceC1809a17;
        this.f21287q = interfaceC1809a18;
        this.f21289s = interfaceC1220a;
    }

    public /* synthetic */ C5397v6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, int i9) {
        this.f21277g = i9;
        this.f21284n = obj;
        this.f21278h = obj2;
        this.f21279i = obj3;
        this.f21280j = obj4;
        this.f21281k = obj5;
        this.f21282l = obj6;
        this.f21283m = obj7;
        this.f21285o = obj8;
        this.f21286p = obj9;
        this.f21287q = obj10;
        this.f21288r = obj11;
        this.f21289s = obj12;
    }

    public /* synthetic */ C5397v6(C4060x c4060x, C3641z c3641z, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, ArrayList arrayList, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, C4737b3 c4737b3, InterfaceC1809a1 interfaceC1809a18) {
        this.f21277g = 0;
        this.f21284n = c4060x;
        this.f21278h = c3641z;
        this.f21279i = interfaceC1809a1;
        this.f21280j = interfaceC1809a12;
        this.f21281k = interfaceC1809a13;
        this.f21288r = arrayList;
        this.f21282l = interfaceC1809a14;
        this.f21283m = interfaceC1809a15;
        this.f21285o = interfaceC1809a16;
        this.f21286p = interfaceC1809a17;
        this.f21289s = c4737b3;
        this.f21287q = interfaceC1809a18;
    }

    public /* synthetic */ C5397v6(C4060x c4060x, C3641z c3641z, List list, InterfaceC1809a1 interfaceC1809a1, ArrayList arrayList, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, List list2, ArrayList arrayList2, InterfaceC1809a1 interfaceC1809a14, List list3, InterfaceC1809a1 interfaceC1809a15) {
        this.f21277g = 7;
        this.f21284n = c4060x;
        this.f21278h = c3641z;
        this.f21285o = list;
        this.f21279i = interfaceC1809a1;
        this.f21288r = arrayList;
        this.f21280j = interfaceC1809a12;
        this.f21281k = interfaceC1809a13;
        this.f21286p = list2;
        this.f21287q = arrayList2;
        this.f21282l = interfaceC1809a14;
        this.f21289s = list3;
        this.f21283m = interfaceC1809a15;
    }

    public /* synthetic */ C5397v6(InterfaceC4544a interfaceC4544a, InterfaceC1220a interfaceC1220a, Context context, C3641z c3641z, C3641z c3641z2, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, C4538r c4538r, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16) {
        this.f21277g = 2;
        this.f21284n = interfaceC4544a;
        this.f21286p = interfaceC1220a;
        this.f21287q = context;
        this.f21278h = c3641z;
        this.f21288r = c3641z2;
        this.f21279i = interfaceC1809a1;
        this.f21280j = interfaceC1809a12;
        this.f21289s = c4538r;
        this.f21281k = interfaceC1809a13;
        this.f21282l = interfaceC1809a14;
        this.f21283m = interfaceC1809a15;
        this.f21285o = interfaceC1809a16;
    }

    public /* synthetic */ C5397v6(InterfaceC4544a interfaceC4544a, C3641z c3641z, InterfaceC1220a interfaceC1220a, SharedPreferences sharedPreferences, Context context, C3641z c3641z2, C0769g c0769g, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15) {
        this.f21277g = 1;
        this.f21284n = interfaceC4544a;
        this.f21278h = c3641z;
        this.f21285o = interfaceC1220a;
        this.f21286p = sharedPreferences;
        this.f21287q = context;
        this.f21288r = c3641z2;
        this.f21289s = c0769g;
        this.f21279i = interfaceC1809a1;
        this.f21280j = interfaceC1809a12;
        this.f21281k = interfaceC1809a13;
        this.f21282l = interfaceC1809a14;
        this.f21283m = interfaceC1809a15;
    }
}
