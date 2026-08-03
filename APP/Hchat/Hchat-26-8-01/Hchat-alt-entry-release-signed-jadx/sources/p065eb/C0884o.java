package p065eb;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import ca.RunnableC0537x;
import gg.AbstractC1416l;
import gg.C1421q;
import gg.C1422r;
import gg.C1425u;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import org.json.JSONException;
import p000a.AbstractC0000a;
import p014b.C0126e;
import p015b0.C0153s;
import p020b5.C0192k;
import p036c9.C0443h0;
import p036c9.C0455k0;
import p051db.C0768f;
import p057e1.C0808c;
import p063e9.C0832c;
import p063e9.C0848s;
import p070f0.C0971c;
import p070f0.C0976h;
import p070f0.C0978j;
import p070f0.C0984p;
import p070f0.C0989u;
import p071f1.AbstractC0996c0;
import p071f1.AbstractC1027s;
import p071f1.C1005h;
import p071f1.C1017n;
import p071f1.InterfaceC1031u;
import p080fb.C1103b;
import p080fb.C1113d1;
import p080fb.C1142k2;
import p080fb.EnumC1182u2;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p099h.Hchat.hooks.api.model.ContactLabelBean;
import p099h.Hchat.hooks.items.script.ScriptPluginBridge;
import p101h1.C1565b;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p119i2.C1939m0;
import p126ia.C2023q;
import p144k.C2209s1;
import p174m.AbstractC2628m1;
import p174m.C2608h1;
import p174m.C2624l1;
import p174m.C2637o2;
import p190n2.C2875j;
import p190n2.C2884s;
import p211o9.C3104q;
import p211o9.C3105r;
import p218og.AbstractC3149m;
import p230p8.C3360l;
import p243q9.C3471g;
import p244qb.C3490k;
import p251r.C3619d;
import p251r.C3623h;
import p258r8.RunnableC3737b;
import p259r9.AbstractC3754e0;
import p266s0.AbstractC3879i;
import p266s0.C3874d;
import p276sf.C3967n;
import p276sf.InterfaceC3955b;
import p279t1.C4084d;
import p315v8.C4521a;
import p315v8.C4538r;
import p321w.AbstractC4649z0;
import p321w.C4618m1;
import p321w.C4629q0;
import p332wb.AbstractC4855en;
import p332wb.AbstractC4955ho;
import p332wb.AbstractC5065l4;
import p332wb.AbstractC5151no;
import p332wb.AbstractC5193p0;
import p332wb.AbstractC5230q4;
import p332wb.AbstractC5261r2;
import p332wb.AbstractC5349to;
import p332wb.C4731au;
import p332wb.C4771c4;
import p332wb.C4935h4;
import p332wb.C4936h5;
import p332wb.C5026jv;
import p332wb.C5032k4;
import p332wb.C5085lo;
import p332wb.C5118mo;
import p332wb.C5124mu;
import p332wb.C5164o4;
import p332wb.C5195p2;
import p332wb.C5197p4;
import p332wb.C5228q2;
import p332wb.C5238qc;
import p332wb.C5283ro;
import p332wb.C5292s0;
import p332wb.C5293s1;
import p332wb.C5316so;
import p332wb.C5437wd;
import p332wb.C5463x6;
import p332wb.C5491y2;
import p332wb.EnumC4897g;
import p339x1.AbstractC5618k;
import p339x1.C5610h0;
import p343x6.AbstractC5700d;
import p345x8.C5709b;
import p345x8.C5725r;
import p346x9.C5738e;
import p346x9.C5739f;
import p357y1.AbstractC5888h1;
import p357y1.InterfaceC5905l2;
import tf.AbstractC4156d0;
import tf.AbstractC4166m;
import tf.AbstractC4167n;

/* JADX INFO: renamed from: eb.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0884o implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f2725g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f2726h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f2727i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f2728j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f2729k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f2730l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0884o(C1103b c1103b, String str, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13) {
        this.f2725g = 20;
        this.f2727i = c1103b;
        this.f2726h = str;
        this.f2728j = interfaceC1809a1;
        this.f2729k = interfaceC1809a12;
        this.f2730l = interfaceC1809a13;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:389:0x0743 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v60, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0658  */
    /* JADX WARN: Type inference failed for: r1v59, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v61, types: [java.util.ArrayList] */
    @Override // p085fg.InterfaceC1231l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) throws JSONException {
        boolean z9;
        Object objM9646q7;
        ArrayList arrayListM8398G1;
        ArrayList arrayListM8398G12;
        List list;
        Object obj2;
        ArrayList arrayList;
        ArrayList arrayListM8398G13;
        int i9 = this.f2725g;
        int i10 = 7;
        int i11 = 6;
        int i12 = 3;
        final int i13 = 1;
        final int i14 = 0;
        C3967n c3967n = C3967n.f12976a;
        Object obj3 = this.f2730l;
        Object obj4 = this.f2729k;
        Object obj5 = this.f2728j;
        Object obj6 = this.f2727i;
        Object obj7 = this.f2726h;
        switch (i9) {
            case 0:
                return ScriptPluginBridge.showModuleConfirmDialog$lambda$0((String) obj7, (String) obj6, (String) obj5, (ScriptPluginBridge) obj4, (Consumer) obj3, (Activity) obj);
            case 1:
                C0989u c0989u = (C0989u) obj;
                C0984p c0984p = ((C0971c) obj6).f3059a;
                c0989u.f3130h = (C2884s) obj7;
                c0989u.f3131i = (C2875j) obj5;
                c0989u.f3125c = (C0153s) obj4;
                c0989u.f3126d = (InterfaceC1231l) obj3;
                c0989u.f3127e = c0984p != null ? c0984p.f3101v : null;
                c0989u.f3128f = c0984p != null ? c0984p.f3102w : null;
                c0989u.f3129g = c0984p != null ? (InterfaceC5905l2) AbstractC5618k.m10152h(c0984p, AbstractC5888h1.f23938t) : null;
                return c3967n;
            case 2:
                Activity activity = (Activity) obj6;
                String str = (String) obj;
                str.getClass();
                C5491y2.m9809V1(activity, "设置评论时间", System.currentTimeMillis(), new C0886p((C2023q) obj5, (String) obj7, (C5026jv) obj4, str, activity, (C3360l) obj3), new C2209s1(7));
                return c3967n;
            case 3:
                C2624l1 c2624l1 = (C2624l1) obj7;
                C1425u c1425u = (C1425u) obj6;
                C1422r c1422r = (C1422r) obj5;
                C2637o2 c2637o2 = (C2637o2) obj4;
                C1421q c1421q = (C1421q) obj3;
                float fFloatValue = ((Float) obj).floatValue();
                C2608h1 c2608h1M6081g = C2624l1.m6081g(c2624l1.f8538g);
                if (c2608h1M6081g != null) {
                    C0126e c0126e = c2624l1.f8587e;
                    long j3 = c2608h1M6081g.f8453b;
                    long j4 = c2608h1M6081g.f8452a;
                    ((C4084d) c0126e.f332h).m8265a(j3, Float.intBitsToFloat((int) (j4 >> 32)));
                    ((C4084d) c0126e.f333i).m8265a(j3, Float.intBitsToFloat((int) (j4 & 4294967295L)));
                    C2608h1 c2608h1M6058a = ((C2608h1) c1425u.f4738g).m6058a(c2608h1M6081g);
                    c1425u.f4738g = c2608h1M6058a;
                    c1422r.f4735g = c2637o2.m6096i(c2637o2.m6092e(c2608h1M6058a.f8452a));
                    z9 = true;
                    c1421q.f4734g = !AbstractC2628m1.m6084a(r2 - fFloatValue);
                } else {
                    z9 = true;
                }
                return Boolean.valueOf(c2608h1M6081g != null ? z9 : false);
            case 4:
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) obj7;
                C3490k c3490k = (C3490k) obj6;
                Activity activity2 = (Activity) obj5;
                ArrayList arrayList2 = (ArrayList) obj4;
                C0126e c0126e2 = (C0126e) obj3;
                List list2 = (List) obj;
                list2.getClass();
                if (interfaceC1231l != null) {
                    interfaceC1231l.invoke(list2);
                } else {
                    c3490k.m7316H(activity2, arrayList2, list2);
                    c0126e2.m640r(c3490k.f11331b);
                }
                return c3967n;
            case 5:
                C0192k c0192k = (C0192k) obj6;
                C2884s c2884s = (C2884s) obj5;
                C4629q0 c4629q0 = (C4629q0) obj4;
                AbstractC1027s abstractC1027s = (AbstractC1027s) obj3;
                C5610h0 c5610h0 = (C5610h0) obj;
                c5610h0.m10064e();
                C1565b c1565b = c5610h0.f22833g;
                float fM4488g = ((C0978j) obj7).f3090c.m4488g();
                if (fM4488g != 0.0f) {
                    long j5 = c2884s.f9317b;
                    int i15 = C1939m0.f6574c;
                    int i16 = (int) (j5 >> 32);
                    c0192k.m859l(i16);
                    C4618m1 c4618m1M9051d = c4629q0.m9051d();
                    C0808c c0808cM4803c = c4618m1M9051d != null ? c4618m1M9051d.f15293a.m4803c(i16) : new C0808c(0.0f, 0.0f, 0.0f, 0.0f);
                    float fFloor = (float) Math.floor(c5610h0.mo1601x0(AbstractC4649z0.f15472a));
                    if (fFloor < 1.0f) {
                        fFloor = 1.0f;
                    }
                    float f3 = fFloor / 2;
                    float f10 = c0808cM4803c.f2416a + f3;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (c1565b.mo4091a() >> 32)) - f3;
                    if (f10 > fIntBitsToFloat) {
                        f10 = fIntBitsToFloat;
                    }
                    if (f10 >= f3) {
                        f3 = f10;
                    }
                    float fFloor2 = ((int) fFloor) % 2 == 1 ? ((float) Math.floor(f3)) + 0.5f : (float) Math.rint(f3);
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(c0808cM4803c.f2417b)) & 4294967295L);
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(c0808cM4803c.f2419d)) & 4294967295L);
                    InterfaceC1031u interfaceC1031u = c1565b.f5219g.f5217c;
                    C1005h c1005hM2510f = c1565b.f5222j;
                    if (c1005hM2510f == null) {
                        c1005hM2510f = AbstractC0996c0.m2510f();
                        c1005hM2510f.m2565D(1);
                        c1565b.f5222j = c1005hM2510f;
                    }
                    Paint paint = (Paint) c1005hM2510f.f3182i;
                    if (abstractC1027s != null) {
                        abstractC1027s.mo2628a(fM4488g, c1565b.mo4091a(), c1005hM2510f);
                    } else if (paint.getAlpha() / 255.0f != fM4488g) {
                        c1005hM2510f.m2586u(fM4488g);
                    }
                    if (!AbstractC1416l.m3825a((C1017n) c1005hM2510f.f3184k, null)) {
                        c1005hM2510f.m2589x(null);
                    }
                    if (c1005hM2510f.f3181h != 3) {
                        c1005hM2510f.m2587v(3);
                    }
                    if (paint.getStrokeWidth() != fFloor) {
                        c1005hM2510f.m2564C(fFloor);
                    }
                    if (paint.getStrokeMiter() != 4.0f) {
                        paint.setStrokeMiter(4.0f);
                    }
                    if (c1005hM2510f.m2581p() != 0) {
                        c1005hM2510f.m2562A(0);
                    }
                    if (c1005hM2510f.m2582q() != 0) {
                        c1005hM2510f.m2563B(0);
                    }
                    if (!paint.isFilterBitmap()) {
                        c1005hM2510f.m2590y(1);
                    }
                    interfaceC1031u.mo2496o(jFloatToRawIntBits, jFloatToRawIntBits2, c1005hM2510f);
                }
                return c3967n;
            case 6:
                C5124mu c5124mu = (C5124mu) obj7;
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) obj3;
                C3623h c3623h = (C3623h) obj;
                c3623h.getClass();
                C3623h.m7604a(c3623h, null, AbstractC5193p0.f19877t5, 3);
                C3623h.m7604a(c3623h, null, new C3874d(1217160669, new C0768f(c5124mu, i10, (InterfaceC1809a1) obj6), true), 3);
                C3623h.m7604a(c3623h, null, AbstractC5193p0.f19884u5, 3);
                C3623h.m7604a(c3623h, null, new C3874d(733766043, new C5238qc((InterfaceC1809a1) obj5, (List) obj4, 1), true), 3);
                if (c5124mu.f19085c) {
                    C3623h.m7604a(c3623h, null, AbstractC5193p0.f19891v5, 3);
                    C3623h.m7604a(c3623h, null, new C3874d(-759746590, new C5463x6(interfaceC1220a, 12), true), 3);
                }
                return c3967n;
            case 7:
                C4936h5 c4936h5 = (C4936h5) obj7;
                C3623h c3623h2 = (C3623h) obj;
                c3623h2.getClass();
                C3623h.m7604a(c3623h2, null, AbstractC5193p0.f19666S2, 3);
                C3623h.m7604a(c3623h2, null, new C3874d(1155830236, new C0443h0(c4936h5, (InterfaceC1809a1) obj6, (InterfaceC1809a1) obj5, 18), true), 3);
                C3623h.m7604a(c3623h2, null, AbstractC5193p0.f19673T2, 3);
                C3623h.m7604a(c3623h2, null, new C3874d(470062618, new C5238qc((List) obj4, (InterfaceC1809a1) obj3, i12), true), 3);
                C3623h.m7604a(c3623h2, null, AbstractC5193p0.f19680U2, 3);
                C3623h.m7604a(c3623h2, null, new C3874d(-215705000, new C0976h(c4936h5, i10), true), 3);
                return c3967n;
            case 8:
                ArrayList<ContactLabelBean> arrayList3 = (ArrayList) obj7;
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) obj4;
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) obj3;
                C3623h c3623h3 = (C3623h) obj;
                c3623h3.getClass();
                C3623h.m7604a(c3623h3, null, AbstractC5193p0.f19699X0, 3);
                C3623h.m7604a(c3623h3, null, new C3874d(-2020699171, new C5293s1((InterfaceC1809a1) obj6, 19), true), 3);
                C3623h.m7604a(c3623h3, null, AbstractC5193p0.f19706Y0, 3);
                if (((Boolean) ((InterfaceC1809a1) obj5).getValue()).booleanValue()) {
                    C3623h.m7604a(c3623h3, null, AbstractC5193p0.f19721a1, 3);
                } else if (((String) interfaceC1809a1.getValue()).length() > 0) {
                    C3623h.m7604a(c3623h3, null, new C3874d(-1779912077, new C5293s1(interfaceC1809a1, 20), true), 3);
                } else if (arrayList3.isEmpty()) {
                    C3623h.m7604a(c3623h3, null, AbstractC5193p0.f19737c1, 3);
                } else {
                    for (ContactLabelBean contactLabelBean : arrayList3) {
                        String str2 = contactLabelBean.labelName;
                        if (AbstractC3149m.m6721t0(str2)) {
                            str2 = contactLabelBean.labelId;
                        }
                        C3623h.m7604a(c3623h3, null, new C3874d(-1795760110, new C5437wd(str2, contactLabelBean, interfaceC1809a12, i14), true), 3);
                    }
                }
                return c3967n;
            case 9:
                final C5709b c5709b = (C5709b) obj7;
                final InterfaceC1231l interfaceC1231l2 = (InterfaceC1231l) obj6;
                C3623h c3623h4 = (C3623h) obj;
                c3623h4.getClass();
                C3623h.m7604a(c3623h4, null, AbstractC5193p0.f19671T0, 3);
                C3623h.m7604a(c3623h4, null, new C3874d(-1753861390, new InterfaceC1236q() { // from class: wb.xh
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // p085fg.InterfaceC1236q
                    /* JADX INFO: renamed from: b */
                    public final Object mo734b(Object obj8, Object obj9, Object obj10) {
                        int i17 = i14;
                        C1836h0 c1836h0 = (C1836h0) obj9;
                        int iIntValue = ((Integer) obj10).intValue();
                        ((C3619d) obj8).getClass();
                        int i18 = iIntValue & 17;
                        switch (i17) {
                            case 0:
                                if (c1836h0.m4516S(iIntValue & 1, i18 != 16)) {
                                    final int i19 = 1;
                                    final InterfaceC1231l interfaceC1231l3 = interfaceC1231l2;
                                    final C5709b c5709b2 = c5709b;
                                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-1324361709, new InterfaceC1235p() { // from class: wb.ri
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                        @Override // p085fg.InterfaceC1235p
                                        public final Object invoke(Object obj11, Object obj12) {
                                            Object obj13;
                                            Object next;
                                            String str3;
                                            String str4;
                                            switch (i19) {
                                                case 0:
                                                    C1836h0 c1836h02 = (C1836h0) obj11;
                                                    int iIntValue2 = ((Integer) obj12).intValue();
                                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                        C5709b c5709b3 = c5709b2;
                                                        int i20 = c5709b3.f23210l;
                                                        Iterator it = AbstractC4955ho.m9363J4().iterator();
                                                        while (true) {
                                                            obj13 = null;
                                                            if (it.hasNext()) {
                                                                next = it.next();
                                                                if (((C4759bp) next).f16109b == i20) {
                                                                }
                                                            } else {
                                                                next = null;
                                                            }
                                                        }
                                                        C4759bp c4759bp = (C4759bp) next;
                                                        String str5 = (c4759bp == null || (str4 = c4759bp.f16108a) == null) ? "不限" : str4;
                                                        List listM9363J4 = AbstractC4955ho.m9363J4();
                                                        int i21 = c5709b3.f23210l;
                                                        InterfaceC1231l interfaceC1231l4 = interfaceC1231l3;
                                                        boolean zM4534f = c1836h02.m4534f(interfaceC1231l4) | c1836h02.m4538h(c5709b3);
                                                        Object objM4514P = c1836h02.m4514P();
                                                        C1823e c1823e = C1851l.f6155a;
                                                        if (zM4534f || objM4514P == c1823e) {
                                                            objM4514P = new C5113mj(6, interfaceC1231l4, c5709b3);
                                                            c1836h02.m4545k0(objM4514P);
                                                        }
                                                        AbstractC4955ho.m9361J2("@ 触发", str5, listM9363J4, i21, (InterfaceC1231l) objM4514P, false, c1836h02, 6);
                                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                                        int i22 = c5709b3.f23211m;
                                                        Iterator it2 = AbstractC4955ho.m9387M4().iterator();
                                                        while (true) {
                                                            if (it2.hasNext()) {
                                                                Object next2 = it2.next();
                                                                if (((C4759bp) next2).f16109b == i22) {
                                                                    obj13 = next2;
                                                                }
                                                            }
                                                        }
                                                        C4759bp c4759bp2 = (C4759bp) obj13;
                                                        if (c4759bp2 == null || (str3 = c4759bp2.f16108a) == null) {
                                                            str3 = "不限";
                                                        }
                                                        List listM9387M4 = AbstractC4955ho.m9387M4();
                                                        int i23 = c5709b3.f23211m;
                                                        boolean zM4534f2 = c1836h02.m4534f(interfaceC1231l4) | c1836h02.m4538h(c5709b3);
                                                        Object objM4514P2 = c1836h02.m4514P();
                                                        if (zM4534f2 || objM4514P2 == c1823e) {
                                                            objM4514P2 = new C5113mj(7, interfaceC1231l4, c5709b3);
                                                            c1836h02.m4545k0(objM4514P2);
                                                        }
                                                        AbstractC4955ho.m9361J2("拍一拍", str3, listM9387M4, i23, (InterfaceC1231l) objM4514P2, false, c1836h02, 6);
                                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                                        String str6 = c5709b3.f23212n;
                                                        boolean zM4534f3 = c1836h02.m4534f(interfaceC1231l4) | c1836h02.m4538h(c5709b3);
                                                        Object objM4514P3 = c1836h02.m4514P();
                                                        if (zM4534f3 || objM4514P3 == c1823e) {
                                                            objM4514P3 = new C5113mj(8, interfaceC1231l4, c5709b3);
                                                            c1836h02.m4545k0(objM4514P3);
                                                        }
                                                        AbstractC4955ho.m9474X3(390, 0, (InterfaceC1231l) objM4514P3, c1836h02, "开始时间", str6, true);
                                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                                        String str7 = c5709b3.f23213o;
                                                        boolean zM4534f4 = c1836h02.m4534f(interfaceC1231l4) | c1836h02.m4538h(c5709b3);
                                                        Object objM4514P4 = c1836h02.m4514P();
                                                        if (zM4534f4 || objM4514P4 == c1823e) {
                                                            objM4514P4 = new C5113mj(9, interfaceC1231l4, c5709b3);
                                                            c1836h02.m4545k0(objM4514P4);
                                                        }
                                                        AbstractC4955ho.m9474X3(390, 0, (InterfaceC1231l) objM4514P4, c1836h02, "结束时间", str7, true);
                                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                                        String strValueOf = String.valueOf(c5709b3.f23214p);
                                                        boolean zM4534f5 = c1836h02.m4534f(interfaceC1231l4) | c1836h02.m4538h(c5709b3);
                                                        Object objM4514P5 = c1836h02.m4514P();
                                                        if (zM4534f5 || objM4514P5 == c1823e) {
                                                            objM4514P5 = new C5113mj(10, interfaceC1231l4, c5709b3);
                                                            c1836h02.m4545k0(objM4514P5);
                                                        }
                                                        AbstractC4955ho.m9695w2("最大回复次数", "0 表示不限制，按规则/会话/发送者统计", strValueOf, (InterfaceC1231l) objM4514P5, c1836h02, 54);
                                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                                        String strValueOf2 = String.valueOf(c5709b3.f23215q);
                                                        boolean zM4534f6 = c1836h02.m4534f(interfaceC1231l4) | c1836h02.m4538h(c5709b3);
                                                        Object objM4514P6 = c1836h02.m4514P();
                                                        if (zM4534f6 || objM4514P6 == c1823e) {
                                                            objM4514P6 = new C5113mj(11, interfaceC1231l4, c5709b3);
                                                            c1836h02.m4545k0(objM4514P6);
                                                        }
                                                        AbstractC4955ho.m9695w2("回复冷却时间", "单位秒，0 表示不限制；同一规则在同一会话内冷却", strValueOf2, (InterfaceC1231l) objM4514P6, c1836h02, 54);
                                                    } else {
                                                        c1836h02.m4519V();
                                                    }
                                                    break;
                                                default:
                                                    C1836h0 c1836h03 = (C1836h0) obj11;
                                                    int iIntValue3 = ((Integer) obj12).intValue();
                                                    if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                        C5709b c5709b4 = c5709b2;
                                                        boolean z10 = c5709b4.f23201c;
                                                        int i24 = c5709b4.f23204f;
                                                        InterfaceC1231l interfaceC1231l5 = interfaceC1231l3;
                                                        boolean zM4534f7 = c1836h03.m4534f(interfaceC1231l5) | c1836h03.m4538h(c5709b4);
                                                        Object objM4514P7 = c1836h03.m4514P();
                                                        C1823e c1823e2 = C1851l.f6155a;
                                                        if (zM4534f7 || objM4514P7 == c1823e2) {
                                                            objM4514P7 = new C5113mj(0, interfaceC1231l5, c5709b4);
                                                            c1836h03.m4545k0(objM4514P7);
                                                        }
                                                        AbstractC4955ho.m9410P3(z10, "启用规则", "关闭后保留配置但不触发", false, (InterfaceC1231l) objM4514P7, c1836h03, 432, 8);
                                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                        String str8 = c5709b4.f23200b;
                                                        boolean zM4534f8 = c1836h03.m4534f(interfaceC1231l5) | c1836h03.m4538h(c5709b4);
                                                        Object objM4514P8 = c1836h03.m4514P();
                                                        if (zM4534f8 || objM4514P8 == c1823e2) {
                                                            objM4514P8 = new C5113mj(1, interfaceC1231l5, c5709b4);
                                                            c1836h03.m4545k0(objM4514P8);
                                                        }
                                                        AbstractC4955ho.m9304C1("规则名称", "用于列表里识别规则", str8, 0, (InterfaceC1231l) objM4514P8, c1836h03, 54, 8);
                                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                        String strM9371K4 = AbstractC4955ho.m9371K4(i24);
                                                        List listM9379L4 = AbstractC4955ho.m9379L4();
                                                        int i25 = c5709b4.f23204f;
                                                        boolean zM4534f9 = c1836h03.m4534f(interfaceC1231l5) | c1836h03.m4538h(c5709b4);
                                                        Object objM4514P9 = c1836h03.m4514P();
                                                        if (zM4534f9 || objM4514P9 == c1823e2) {
                                                            objM4514P9 = new C5113mj(2, interfaceC1231l5, c5709b4);
                                                            c1836h03.m4545k0(objM4514P9);
                                                        }
                                                        AbstractC4955ho.m9361J2("匹配方式", strM9371K4, listM9379L4, i25, (InterfaceC1231l) objM4514P9, false, c1836h03, 6);
                                                        if (i24 != 3) {
                                                            c1836h03.m4525a0(-489054315);
                                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                            String str9 = c5709b4.f23202d;
                                                            boolean zM4534f10 = c1836h03.m4534f(interfaceC1231l5) | c1836h03.m4538h(c5709b4);
                                                            Object objM4514P10 = c1836h03.m4514P();
                                                            if (zM4534f10 || objM4514P10 == c1823e2) {
                                                                objM4514P10 = new C5113mj(3, interfaceC1231l5, c5709b4);
                                                                c1836h03.m4545k0(objM4514P10);
                                                            }
                                                            AbstractC4955ho.m9304C1("关键词", "多个关键词用 |、逗号或换行分隔", str9, 2, (InterfaceC1231l) objM4514P10, c1836h03, 3126, 0);
                                                            c1836h03.m4553p(false);
                                                        } else {
                                                            c1836h03.m4525a0(-488799464);
                                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                            String str10 = c5709b4.f23203e;
                                                            boolean zM4534f11 = c1836h03.m4534f(interfaceC1231l5) | c1836h03.m4538h(c5709b4);
                                                            Object objM4514P11 = c1836h03.m4514P();
                                                            if (zM4534f11 || objM4514P11 == c1823e2) {
                                                                objM4514P11 = new C5113mj(4, interfaceC1231l5, c5709b4);
                                                                c1836h03.m4545k0(objM4514P11);
                                                            }
                                                            AbstractC4955ho.m9304C1("排除关键词", "包含任一关键词时不触发，多个用 |、逗号或换行分隔", str10, 2, (InterfaceC1231l) objM4514P11, c1836h03, 3126, 0);
                                                            c1836h03.m4553p(false);
                                                        }
                                                    } else {
                                                        c1836h03.m4519V();
                                                    }
                                                    break;
                                            }
                                            return C3967n.f12976a;
                                        }
                                    }, c1836h0), c1836h0, 48, 1);
                                } else {
                                    c1836h0.m4519V();
                                }
                                break;
                            default:
                                if (c1836h0.m4516S(iIntValue & 1, i18 != 16)) {
                                    final int i20 = 0;
                                    final InterfaceC1231l interfaceC1231l4 = interfaceC1231l2;
                                    final C5709b c5709b3 = c5709b;
                                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(984421143, new InterfaceC1235p() { // from class: wb.ri
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                        @Override // p085fg.InterfaceC1235p
                                        public final Object invoke(Object obj11, Object obj12) {
                                            Object obj13;
                                            Object next;
                                            String str3;
                                            String str4;
                                            switch (i20) {
                                                case 0:
                                                    C1836h0 c1836h02 = (C1836h0) obj11;
                                                    int iIntValue2 = ((Integer) obj12).intValue();
                                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                        C5709b c5709b32 = c5709b3;
                                                        int i202 = c5709b32.f23210l;
                                                        Iterator it = AbstractC4955ho.m9363J4().iterator();
                                                        while (true) {
                                                            obj13 = null;
                                                            if (it.hasNext()) {
                                                                next = it.next();
                                                                if (((C4759bp) next).f16109b == i202) {
                                                                }
                                                            } else {
                                                                next = null;
                                                            }
                                                        }
                                                        C4759bp c4759bp = (C4759bp) next;
                                                        String str5 = (c4759bp == null || (str4 = c4759bp.f16108a) == null) ? "不限" : str4;
                                                        List listM9363J4 = AbstractC4955ho.m9363J4();
                                                        int i21 = c5709b32.f23210l;
                                                        InterfaceC1231l interfaceC1231l42 = interfaceC1231l4;
                                                        boolean zM4534f = c1836h02.m4534f(interfaceC1231l42) | c1836h02.m4538h(c5709b32);
                                                        Object objM4514P = c1836h02.m4514P();
                                                        C1823e c1823e = C1851l.f6155a;
                                                        if (zM4534f || objM4514P == c1823e) {
                                                            objM4514P = new C5113mj(6, interfaceC1231l42, c5709b32);
                                                            c1836h02.m4545k0(objM4514P);
                                                        }
                                                        AbstractC4955ho.m9361J2("@ 触发", str5, listM9363J4, i21, (InterfaceC1231l) objM4514P, false, c1836h02, 6);
                                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                                        int i22 = c5709b32.f23211m;
                                                        Iterator it2 = AbstractC4955ho.m9387M4().iterator();
                                                        while (true) {
                                                            if (it2.hasNext()) {
                                                                Object next2 = it2.next();
                                                                if (((C4759bp) next2).f16109b == i22) {
                                                                    obj13 = next2;
                                                                }
                                                            }
                                                        }
                                                        C4759bp c4759bp2 = (C4759bp) obj13;
                                                        if (c4759bp2 == null || (str3 = c4759bp2.f16108a) == null) {
                                                            str3 = "不限";
                                                        }
                                                        List listM9387M4 = AbstractC4955ho.m9387M4();
                                                        int i23 = c5709b32.f23211m;
                                                        boolean zM4534f2 = c1836h02.m4534f(interfaceC1231l42) | c1836h02.m4538h(c5709b32);
                                                        Object objM4514P2 = c1836h02.m4514P();
                                                        if (zM4534f2 || objM4514P2 == c1823e) {
                                                            objM4514P2 = new C5113mj(7, interfaceC1231l42, c5709b32);
                                                            c1836h02.m4545k0(objM4514P2);
                                                        }
                                                        AbstractC4955ho.m9361J2("拍一拍", str3, listM9387M4, i23, (InterfaceC1231l) objM4514P2, false, c1836h02, 6);
                                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                                        String str6 = c5709b32.f23212n;
                                                        boolean zM4534f3 = c1836h02.m4534f(interfaceC1231l42) | c1836h02.m4538h(c5709b32);
                                                        Object objM4514P3 = c1836h02.m4514P();
                                                        if (zM4534f3 || objM4514P3 == c1823e) {
                                                            objM4514P3 = new C5113mj(8, interfaceC1231l42, c5709b32);
                                                            c1836h02.m4545k0(objM4514P3);
                                                        }
                                                        AbstractC4955ho.m9474X3(390, 0, (InterfaceC1231l) objM4514P3, c1836h02, "开始时间", str6, true);
                                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                                        String str7 = c5709b32.f23213o;
                                                        boolean zM4534f4 = c1836h02.m4534f(interfaceC1231l42) | c1836h02.m4538h(c5709b32);
                                                        Object objM4514P4 = c1836h02.m4514P();
                                                        if (zM4534f4 || objM4514P4 == c1823e) {
                                                            objM4514P4 = new C5113mj(9, interfaceC1231l42, c5709b32);
                                                            c1836h02.m4545k0(objM4514P4);
                                                        }
                                                        AbstractC4955ho.m9474X3(390, 0, (InterfaceC1231l) objM4514P4, c1836h02, "结束时间", str7, true);
                                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                                        String strValueOf = String.valueOf(c5709b32.f23214p);
                                                        boolean zM4534f5 = c1836h02.m4534f(interfaceC1231l42) | c1836h02.m4538h(c5709b32);
                                                        Object objM4514P5 = c1836h02.m4514P();
                                                        if (zM4534f5 || objM4514P5 == c1823e) {
                                                            objM4514P5 = new C5113mj(10, interfaceC1231l42, c5709b32);
                                                            c1836h02.m4545k0(objM4514P5);
                                                        }
                                                        AbstractC4955ho.m9695w2("最大回复次数", "0 表示不限制，按规则/会话/发送者统计", strValueOf, (InterfaceC1231l) objM4514P5, c1836h02, 54);
                                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                                        String strValueOf2 = String.valueOf(c5709b32.f23215q);
                                                        boolean zM4534f6 = c1836h02.m4534f(interfaceC1231l42) | c1836h02.m4538h(c5709b32);
                                                        Object objM4514P6 = c1836h02.m4514P();
                                                        if (zM4534f6 || objM4514P6 == c1823e) {
                                                            objM4514P6 = new C5113mj(11, interfaceC1231l42, c5709b32);
                                                            c1836h02.m4545k0(objM4514P6);
                                                        }
                                                        AbstractC4955ho.m9695w2("回复冷却时间", "单位秒，0 表示不限制；同一规则在同一会话内冷却", strValueOf2, (InterfaceC1231l) objM4514P6, c1836h02, 54);
                                                    } else {
                                                        c1836h02.m4519V();
                                                    }
                                                    break;
                                                default:
                                                    C1836h0 c1836h03 = (C1836h0) obj11;
                                                    int iIntValue3 = ((Integer) obj12).intValue();
                                                    if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                        C5709b c5709b4 = c5709b3;
                                                        boolean z10 = c5709b4.f23201c;
                                                        int i24 = c5709b4.f23204f;
                                                        InterfaceC1231l interfaceC1231l5 = interfaceC1231l4;
                                                        boolean zM4534f7 = c1836h03.m4534f(interfaceC1231l5) | c1836h03.m4538h(c5709b4);
                                                        Object objM4514P7 = c1836h03.m4514P();
                                                        C1823e c1823e2 = C1851l.f6155a;
                                                        if (zM4534f7 || objM4514P7 == c1823e2) {
                                                            objM4514P7 = new C5113mj(0, interfaceC1231l5, c5709b4);
                                                            c1836h03.m4545k0(objM4514P7);
                                                        }
                                                        AbstractC4955ho.m9410P3(z10, "启用规则", "关闭后保留配置但不触发", false, (InterfaceC1231l) objM4514P7, c1836h03, 432, 8);
                                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                        String str8 = c5709b4.f23200b;
                                                        boolean zM4534f8 = c1836h03.m4534f(interfaceC1231l5) | c1836h03.m4538h(c5709b4);
                                                        Object objM4514P8 = c1836h03.m4514P();
                                                        if (zM4534f8 || objM4514P8 == c1823e2) {
                                                            objM4514P8 = new C5113mj(1, interfaceC1231l5, c5709b4);
                                                            c1836h03.m4545k0(objM4514P8);
                                                        }
                                                        AbstractC4955ho.m9304C1("规则名称", "用于列表里识别规则", str8, 0, (InterfaceC1231l) objM4514P8, c1836h03, 54, 8);
                                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                        String strM9371K4 = AbstractC4955ho.m9371K4(i24);
                                                        List listM9379L4 = AbstractC4955ho.m9379L4();
                                                        int i25 = c5709b4.f23204f;
                                                        boolean zM4534f9 = c1836h03.m4534f(interfaceC1231l5) | c1836h03.m4538h(c5709b4);
                                                        Object objM4514P9 = c1836h03.m4514P();
                                                        if (zM4534f9 || objM4514P9 == c1823e2) {
                                                            objM4514P9 = new C5113mj(2, interfaceC1231l5, c5709b4);
                                                            c1836h03.m4545k0(objM4514P9);
                                                        }
                                                        AbstractC4955ho.m9361J2("匹配方式", strM9371K4, listM9379L4, i25, (InterfaceC1231l) objM4514P9, false, c1836h03, 6);
                                                        if (i24 != 3) {
                                                            c1836h03.m4525a0(-489054315);
                                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                            String str9 = c5709b4.f23202d;
                                                            boolean zM4534f10 = c1836h03.m4534f(interfaceC1231l5) | c1836h03.m4538h(c5709b4);
                                                            Object objM4514P10 = c1836h03.m4514P();
                                                            if (zM4534f10 || objM4514P10 == c1823e2) {
                                                                objM4514P10 = new C5113mj(3, interfaceC1231l5, c5709b4);
                                                                c1836h03.m4545k0(objM4514P10);
                                                            }
                                                            AbstractC4955ho.m9304C1("关键词", "多个关键词用 |、逗号或换行分隔", str9, 2, (InterfaceC1231l) objM4514P10, c1836h03, 3126, 0);
                                                            c1836h03.m4553p(false);
                                                        } else {
                                                            c1836h03.m4525a0(-488799464);
                                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                            String str10 = c5709b4.f23203e;
                                                            boolean zM4534f11 = c1836h03.m4534f(interfaceC1231l5) | c1836h03.m4538h(c5709b4);
                                                            Object objM4514P11 = c1836h03.m4514P();
                                                            if (zM4534f11 || objM4514P11 == c1823e2) {
                                                                objM4514P11 = new C5113mj(4, interfaceC1231l5, c5709b4);
                                                                c1836h03.m4545k0(objM4514P11);
                                                            }
                                                            AbstractC4955ho.m9304C1("排除关键词", "包含任一关键词时不触发，多个用 |、逗号或换行分隔", str10, 2, (InterfaceC1231l) objM4514P11, c1836h03, 3126, 0);
                                                            c1836h03.m4553p(false);
                                                        }
                                                    } else {
                                                        c1836h03.m4519V();
                                                    }
                                                    break;
                                            }
                                            return C3967n.f12976a;
                                        }
                                    }, c1836h0), c1836h0, 48, 1);
                                } else {
                                    c1836h0.m4519V();
                                }
                                break;
                        }
                        return C3967n.f12976a;
                    }
                }, true), 3);
                C3623h.m7604a(c3623h4, null, AbstractC5193p0.f19678U0, 3);
                C3623h.m7604a(c3623h4, null, new C3874d(-599469964, new C0455k0((Object) c5709b, interfaceC1231l2, (InterfaceC3955b) obj5, (InterfaceC3955b) obj4, 17), true), 3);
                C3623h.m7604a(c3623h4, null, AbstractC5193p0.f19685V0, 3);
                C3623h.m7604a(c3623h4, null, new C3874d(554921462, new InterfaceC1236q() { // from class: wb.xh
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // p085fg.InterfaceC1236q
                    /* JADX INFO: renamed from: b */
                    public final Object mo734b(Object obj8, Object obj9, Object obj10) {
                        int i17 = i13;
                        C1836h0 c1836h0 = (C1836h0) obj9;
                        int iIntValue = ((Integer) obj10).intValue();
                        ((C3619d) obj8).getClass();
                        int i18 = iIntValue & 17;
                        switch (i17) {
                            case 0:
                                if (c1836h0.m4516S(iIntValue & 1, i18 != 16)) {
                                    final int i19 = 1;
                                    final InterfaceC1231l interfaceC1231l3 = interfaceC1231l2;
                                    final C5709b c5709b2 = c5709b;
                                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-1324361709, new InterfaceC1235p() { // from class: wb.ri
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                        @Override // p085fg.InterfaceC1235p
                                        public final Object invoke(Object obj11, Object obj12) {
                                            Object obj13;
                                            Object next;
                                            String str3;
                                            String str4;
                                            switch (i19) {
                                                case 0:
                                                    C1836h0 c1836h02 = (C1836h0) obj11;
                                                    int iIntValue2 = ((Integer) obj12).intValue();
                                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                        C5709b c5709b32 = c5709b2;
                                                        int i202 = c5709b32.f23210l;
                                                        Iterator it = AbstractC4955ho.m9363J4().iterator();
                                                        while (true) {
                                                            obj13 = null;
                                                            if (it.hasNext()) {
                                                                next = it.next();
                                                                if (((C4759bp) next).f16109b == i202) {
                                                                }
                                                            } else {
                                                                next = null;
                                                            }
                                                        }
                                                        C4759bp c4759bp = (C4759bp) next;
                                                        String str5 = (c4759bp == null || (str4 = c4759bp.f16108a) == null) ? "不限" : str4;
                                                        List listM9363J4 = AbstractC4955ho.m9363J4();
                                                        int i21 = c5709b32.f23210l;
                                                        InterfaceC1231l interfaceC1231l42 = interfaceC1231l3;
                                                        boolean zM4534f = c1836h02.m4534f(interfaceC1231l42) | c1836h02.m4538h(c5709b32);
                                                        Object objM4514P = c1836h02.m4514P();
                                                        C1823e c1823e = C1851l.f6155a;
                                                        if (zM4534f || objM4514P == c1823e) {
                                                            objM4514P = new C5113mj(6, interfaceC1231l42, c5709b32);
                                                            c1836h02.m4545k0(objM4514P);
                                                        }
                                                        AbstractC4955ho.m9361J2("@ 触发", str5, listM9363J4, i21, (InterfaceC1231l) objM4514P, false, c1836h02, 6);
                                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                                        int i22 = c5709b32.f23211m;
                                                        Iterator it2 = AbstractC4955ho.m9387M4().iterator();
                                                        while (true) {
                                                            if (it2.hasNext()) {
                                                                Object next2 = it2.next();
                                                                if (((C4759bp) next2).f16109b == i22) {
                                                                    obj13 = next2;
                                                                }
                                                            }
                                                        }
                                                        C4759bp c4759bp2 = (C4759bp) obj13;
                                                        if (c4759bp2 == null || (str3 = c4759bp2.f16108a) == null) {
                                                            str3 = "不限";
                                                        }
                                                        List listM9387M4 = AbstractC4955ho.m9387M4();
                                                        int i23 = c5709b32.f23211m;
                                                        boolean zM4534f2 = c1836h02.m4534f(interfaceC1231l42) | c1836h02.m4538h(c5709b32);
                                                        Object objM4514P2 = c1836h02.m4514P();
                                                        if (zM4534f2 || objM4514P2 == c1823e) {
                                                            objM4514P2 = new C5113mj(7, interfaceC1231l42, c5709b32);
                                                            c1836h02.m4545k0(objM4514P2);
                                                        }
                                                        AbstractC4955ho.m9361J2("拍一拍", str3, listM9387M4, i23, (InterfaceC1231l) objM4514P2, false, c1836h02, 6);
                                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                                        String str6 = c5709b32.f23212n;
                                                        boolean zM4534f3 = c1836h02.m4534f(interfaceC1231l42) | c1836h02.m4538h(c5709b32);
                                                        Object objM4514P3 = c1836h02.m4514P();
                                                        if (zM4534f3 || objM4514P3 == c1823e) {
                                                            objM4514P3 = new C5113mj(8, interfaceC1231l42, c5709b32);
                                                            c1836h02.m4545k0(objM4514P3);
                                                        }
                                                        AbstractC4955ho.m9474X3(390, 0, (InterfaceC1231l) objM4514P3, c1836h02, "开始时间", str6, true);
                                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                                        String str7 = c5709b32.f23213o;
                                                        boolean zM4534f4 = c1836h02.m4534f(interfaceC1231l42) | c1836h02.m4538h(c5709b32);
                                                        Object objM4514P4 = c1836h02.m4514P();
                                                        if (zM4534f4 || objM4514P4 == c1823e) {
                                                            objM4514P4 = new C5113mj(9, interfaceC1231l42, c5709b32);
                                                            c1836h02.m4545k0(objM4514P4);
                                                        }
                                                        AbstractC4955ho.m9474X3(390, 0, (InterfaceC1231l) objM4514P4, c1836h02, "结束时间", str7, true);
                                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                                        String strValueOf = String.valueOf(c5709b32.f23214p);
                                                        boolean zM4534f5 = c1836h02.m4534f(interfaceC1231l42) | c1836h02.m4538h(c5709b32);
                                                        Object objM4514P5 = c1836h02.m4514P();
                                                        if (zM4534f5 || objM4514P5 == c1823e) {
                                                            objM4514P5 = new C5113mj(10, interfaceC1231l42, c5709b32);
                                                            c1836h02.m4545k0(objM4514P5);
                                                        }
                                                        AbstractC4955ho.m9695w2("最大回复次数", "0 表示不限制，按规则/会话/发送者统计", strValueOf, (InterfaceC1231l) objM4514P5, c1836h02, 54);
                                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                                        String strValueOf2 = String.valueOf(c5709b32.f23215q);
                                                        boolean zM4534f6 = c1836h02.m4534f(interfaceC1231l42) | c1836h02.m4538h(c5709b32);
                                                        Object objM4514P6 = c1836h02.m4514P();
                                                        if (zM4534f6 || objM4514P6 == c1823e) {
                                                            objM4514P6 = new C5113mj(11, interfaceC1231l42, c5709b32);
                                                            c1836h02.m4545k0(objM4514P6);
                                                        }
                                                        AbstractC4955ho.m9695w2("回复冷却时间", "单位秒，0 表示不限制；同一规则在同一会话内冷却", strValueOf2, (InterfaceC1231l) objM4514P6, c1836h02, 54);
                                                    } else {
                                                        c1836h02.m4519V();
                                                    }
                                                    break;
                                                default:
                                                    C1836h0 c1836h03 = (C1836h0) obj11;
                                                    int iIntValue3 = ((Integer) obj12).intValue();
                                                    if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                        C5709b c5709b4 = c5709b2;
                                                        boolean z10 = c5709b4.f23201c;
                                                        int i24 = c5709b4.f23204f;
                                                        InterfaceC1231l interfaceC1231l5 = interfaceC1231l3;
                                                        boolean zM4534f7 = c1836h03.m4534f(interfaceC1231l5) | c1836h03.m4538h(c5709b4);
                                                        Object objM4514P7 = c1836h03.m4514P();
                                                        C1823e c1823e2 = C1851l.f6155a;
                                                        if (zM4534f7 || objM4514P7 == c1823e2) {
                                                            objM4514P7 = new C5113mj(0, interfaceC1231l5, c5709b4);
                                                            c1836h03.m4545k0(objM4514P7);
                                                        }
                                                        AbstractC4955ho.m9410P3(z10, "启用规则", "关闭后保留配置但不触发", false, (InterfaceC1231l) objM4514P7, c1836h03, 432, 8);
                                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                        String str8 = c5709b4.f23200b;
                                                        boolean zM4534f8 = c1836h03.m4534f(interfaceC1231l5) | c1836h03.m4538h(c5709b4);
                                                        Object objM4514P8 = c1836h03.m4514P();
                                                        if (zM4534f8 || objM4514P8 == c1823e2) {
                                                            objM4514P8 = new C5113mj(1, interfaceC1231l5, c5709b4);
                                                            c1836h03.m4545k0(objM4514P8);
                                                        }
                                                        AbstractC4955ho.m9304C1("规则名称", "用于列表里识别规则", str8, 0, (InterfaceC1231l) objM4514P8, c1836h03, 54, 8);
                                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                        String strM9371K4 = AbstractC4955ho.m9371K4(i24);
                                                        List listM9379L4 = AbstractC4955ho.m9379L4();
                                                        int i25 = c5709b4.f23204f;
                                                        boolean zM4534f9 = c1836h03.m4534f(interfaceC1231l5) | c1836h03.m4538h(c5709b4);
                                                        Object objM4514P9 = c1836h03.m4514P();
                                                        if (zM4534f9 || objM4514P9 == c1823e2) {
                                                            objM4514P9 = new C5113mj(2, interfaceC1231l5, c5709b4);
                                                            c1836h03.m4545k0(objM4514P9);
                                                        }
                                                        AbstractC4955ho.m9361J2("匹配方式", strM9371K4, listM9379L4, i25, (InterfaceC1231l) objM4514P9, false, c1836h03, 6);
                                                        if (i24 != 3) {
                                                            c1836h03.m4525a0(-489054315);
                                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                            String str9 = c5709b4.f23202d;
                                                            boolean zM4534f10 = c1836h03.m4534f(interfaceC1231l5) | c1836h03.m4538h(c5709b4);
                                                            Object objM4514P10 = c1836h03.m4514P();
                                                            if (zM4534f10 || objM4514P10 == c1823e2) {
                                                                objM4514P10 = new C5113mj(3, interfaceC1231l5, c5709b4);
                                                                c1836h03.m4545k0(objM4514P10);
                                                            }
                                                            AbstractC4955ho.m9304C1("关键词", "多个关键词用 |、逗号或换行分隔", str9, 2, (InterfaceC1231l) objM4514P10, c1836h03, 3126, 0);
                                                            c1836h03.m4553p(false);
                                                        } else {
                                                            c1836h03.m4525a0(-488799464);
                                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                            String str10 = c5709b4.f23203e;
                                                            boolean zM4534f11 = c1836h03.m4534f(interfaceC1231l5) | c1836h03.m4538h(c5709b4);
                                                            Object objM4514P11 = c1836h03.m4514P();
                                                            if (zM4534f11 || objM4514P11 == c1823e2) {
                                                                objM4514P11 = new C5113mj(4, interfaceC1231l5, c5709b4);
                                                                c1836h03.m4545k0(objM4514P11);
                                                            }
                                                            AbstractC4955ho.m9304C1("排除关键词", "包含任一关键词时不触发，多个用 |、逗号或换行分隔", str10, 2, (InterfaceC1231l) objM4514P11, c1836h03, 3126, 0);
                                                            c1836h03.m4553p(false);
                                                        }
                                                    } else {
                                                        c1836h03.m4519V();
                                                    }
                                                    break;
                                            }
                                            return C3967n.f12976a;
                                        }
                                    }, c1836h0), c1836h0, 48, 1);
                                } else {
                                    c1836h0.m4519V();
                                }
                                break;
                            default:
                                if (c1836h0.m4516S(iIntValue & 1, i18 != 16)) {
                                    final int i20 = 0;
                                    final InterfaceC1231l interfaceC1231l4 = interfaceC1231l2;
                                    final C5709b c5709b3 = c5709b;
                                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(984421143, new InterfaceC1235p() { // from class: wb.ri
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                        @Override // p085fg.InterfaceC1235p
                                        public final Object invoke(Object obj11, Object obj12) {
                                            Object obj13;
                                            Object next;
                                            String str3;
                                            String str4;
                                            switch (i20) {
                                                case 0:
                                                    C1836h0 c1836h02 = (C1836h0) obj11;
                                                    int iIntValue2 = ((Integer) obj12).intValue();
                                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                        C5709b c5709b32 = c5709b3;
                                                        int i202 = c5709b32.f23210l;
                                                        Iterator it = AbstractC4955ho.m9363J4().iterator();
                                                        while (true) {
                                                            obj13 = null;
                                                            if (it.hasNext()) {
                                                                next = it.next();
                                                                if (((C4759bp) next).f16109b == i202) {
                                                                }
                                                            } else {
                                                                next = null;
                                                            }
                                                        }
                                                        C4759bp c4759bp = (C4759bp) next;
                                                        String str5 = (c4759bp == null || (str4 = c4759bp.f16108a) == null) ? "不限" : str4;
                                                        List listM9363J4 = AbstractC4955ho.m9363J4();
                                                        int i21 = c5709b32.f23210l;
                                                        InterfaceC1231l interfaceC1231l42 = interfaceC1231l4;
                                                        boolean zM4534f = c1836h02.m4534f(interfaceC1231l42) | c1836h02.m4538h(c5709b32);
                                                        Object objM4514P = c1836h02.m4514P();
                                                        C1823e c1823e = C1851l.f6155a;
                                                        if (zM4534f || objM4514P == c1823e) {
                                                            objM4514P = new C5113mj(6, interfaceC1231l42, c5709b32);
                                                            c1836h02.m4545k0(objM4514P);
                                                        }
                                                        AbstractC4955ho.m9361J2("@ 触发", str5, listM9363J4, i21, (InterfaceC1231l) objM4514P, false, c1836h02, 6);
                                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                                        int i22 = c5709b32.f23211m;
                                                        Iterator it2 = AbstractC4955ho.m9387M4().iterator();
                                                        while (true) {
                                                            if (it2.hasNext()) {
                                                                Object next2 = it2.next();
                                                                if (((C4759bp) next2).f16109b == i22) {
                                                                    obj13 = next2;
                                                                }
                                                            }
                                                        }
                                                        C4759bp c4759bp2 = (C4759bp) obj13;
                                                        if (c4759bp2 == null || (str3 = c4759bp2.f16108a) == null) {
                                                            str3 = "不限";
                                                        }
                                                        List listM9387M4 = AbstractC4955ho.m9387M4();
                                                        int i23 = c5709b32.f23211m;
                                                        boolean zM4534f2 = c1836h02.m4534f(interfaceC1231l42) | c1836h02.m4538h(c5709b32);
                                                        Object objM4514P2 = c1836h02.m4514P();
                                                        if (zM4534f2 || objM4514P2 == c1823e) {
                                                            objM4514P2 = new C5113mj(7, interfaceC1231l42, c5709b32);
                                                            c1836h02.m4545k0(objM4514P2);
                                                        }
                                                        AbstractC4955ho.m9361J2("拍一拍", str3, listM9387M4, i23, (InterfaceC1231l) objM4514P2, false, c1836h02, 6);
                                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                                        String str6 = c5709b32.f23212n;
                                                        boolean zM4534f3 = c1836h02.m4534f(interfaceC1231l42) | c1836h02.m4538h(c5709b32);
                                                        Object objM4514P3 = c1836h02.m4514P();
                                                        if (zM4534f3 || objM4514P3 == c1823e) {
                                                            objM4514P3 = new C5113mj(8, interfaceC1231l42, c5709b32);
                                                            c1836h02.m4545k0(objM4514P3);
                                                        }
                                                        AbstractC4955ho.m9474X3(390, 0, (InterfaceC1231l) objM4514P3, c1836h02, "开始时间", str6, true);
                                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                                        String str7 = c5709b32.f23213o;
                                                        boolean zM4534f4 = c1836h02.m4534f(interfaceC1231l42) | c1836h02.m4538h(c5709b32);
                                                        Object objM4514P4 = c1836h02.m4514P();
                                                        if (zM4534f4 || objM4514P4 == c1823e) {
                                                            objM4514P4 = new C5113mj(9, interfaceC1231l42, c5709b32);
                                                            c1836h02.m4545k0(objM4514P4);
                                                        }
                                                        AbstractC4955ho.m9474X3(390, 0, (InterfaceC1231l) objM4514P4, c1836h02, "结束时间", str7, true);
                                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                                        String strValueOf = String.valueOf(c5709b32.f23214p);
                                                        boolean zM4534f5 = c1836h02.m4534f(interfaceC1231l42) | c1836h02.m4538h(c5709b32);
                                                        Object objM4514P5 = c1836h02.m4514P();
                                                        if (zM4534f5 || objM4514P5 == c1823e) {
                                                            objM4514P5 = new C5113mj(10, interfaceC1231l42, c5709b32);
                                                            c1836h02.m4545k0(objM4514P5);
                                                        }
                                                        AbstractC4955ho.m9695w2("最大回复次数", "0 表示不限制，按规则/会话/发送者统计", strValueOf, (InterfaceC1231l) objM4514P5, c1836h02, 54);
                                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                                        String strValueOf2 = String.valueOf(c5709b32.f23215q);
                                                        boolean zM4534f6 = c1836h02.m4534f(interfaceC1231l42) | c1836h02.m4538h(c5709b32);
                                                        Object objM4514P6 = c1836h02.m4514P();
                                                        if (zM4534f6 || objM4514P6 == c1823e) {
                                                            objM4514P6 = new C5113mj(11, interfaceC1231l42, c5709b32);
                                                            c1836h02.m4545k0(objM4514P6);
                                                        }
                                                        AbstractC4955ho.m9695w2("回复冷却时间", "单位秒，0 表示不限制；同一规则在同一会话内冷却", strValueOf2, (InterfaceC1231l) objM4514P6, c1836h02, 54);
                                                    } else {
                                                        c1836h02.m4519V();
                                                    }
                                                    break;
                                                default:
                                                    C1836h0 c1836h03 = (C1836h0) obj11;
                                                    int iIntValue3 = ((Integer) obj12).intValue();
                                                    if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                        C5709b c5709b4 = c5709b3;
                                                        boolean z10 = c5709b4.f23201c;
                                                        int i24 = c5709b4.f23204f;
                                                        InterfaceC1231l interfaceC1231l5 = interfaceC1231l4;
                                                        boolean zM4534f7 = c1836h03.m4534f(interfaceC1231l5) | c1836h03.m4538h(c5709b4);
                                                        Object objM4514P7 = c1836h03.m4514P();
                                                        C1823e c1823e2 = C1851l.f6155a;
                                                        if (zM4534f7 || objM4514P7 == c1823e2) {
                                                            objM4514P7 = new C5113mj(0, interfaceC1231l5, c5709b4);
                                                            c1836h03.m4545k0(objM4514P7);
                                                        }
                                                        AbstractC4955ho.m9410P3(z10, "启用规则", "关闭后保留配置但不触发", false, (InterfaceC1231l) objM4514P7, c1836h03, 432, 8);
                                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                        String str8 = c5709b4.f23200b;
                                                        boolean zM4534f8 = c1836h03.m4534f(interfaceC1231l5) | c1836h03.m4538h(c5709b4);
                                                        Object objM4514P8 = c1836h03.m4514P();
                                                        if (zM4534f8 || objM4514P8 == c1823e2) {
                                                            objM4514P8 = new C5113mj(1, interfaceC1231l5, c5709b4);
                                                            c1836h03.m4545k0(objM4514P8);
                                                        }
                                                        AbstractC4955ho.m9304C1("规则名称", "用于列表里识别规则", str8, 0, (InterfaceC1231l) objM4514P8, c1836h03, 54, 8);
                                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                        String strM9371K4 = AbstractC4955ho.m9371K4(i24);
                                                        List listM9379L4 = AbstractC4955ho.m9379L4();
                                                        int i25 = c5709b4.f23204f;
                                                        boolean zM4534f9 = c1836h03.m4534f(interfaceC1231l5) | c1836h03.m4538h(c5709b4);
                                                        Object objM4514P9 = c1836h03.m4514P();
                                                        if (zM4534f9 || objM4514P9 == c1823e2) {
                                                            objM4514P9 = new C5113mj(2, interfaceC1231l5, c5709b4);
                                                            c1836h03.m4545k0(objM4514P9);
                                                        }
                                                        AbstractC4955ho.m9361J2("匹配方式", strM9371K4, listM9379L4, i25, (InterfaceC1231l) objM4514P9, false, c1836h03, 6);
                                                        if (i24 != 3) {
                                                            c1836h03.m4525a0(-489054315);
                                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                            String str9 = c5709b4.f23202d;
                                                            boolean zM4534f10 = c1836h03.m4534f(interfaceC1231l5) | c1836h03.m4538h(c5709b4);
                                                            Object objM4514P10 = c1836h03.m4514P();
                                                            if (zM4534f10 || objM4514P10 == c1823e2) {
                                                                objM4514P10 = new C5113mj(3, interfaceC1231l5, c5709b4);
                                                                c1836h03.m4545k0(objM4514P10);
                                                            }
                                                            AbstractC4955ho.m9304C1("关键词", "多个关键词用 |、逗号或换行分隔", str9, 2, (InterfaceC1231l) objM4514P10, c1836h03, 3126, 0);
                                                            c1836h03.m4553p(false);
                                                        } else {
                                                            c1836h03.m4525a0(-488799464);
                                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                            String str10 = c5709b4.f23203e;
                                                            boolean zM4534f11 = c1836h03.m4534f(interfaceC1231l5) | c1836h03.m4538h(c5709b4);
                                                            Object objM4514P11 = c1836h03.m4514P();
                                                            if (zM4534f11 || objM4514P11 == c1823e2) {
                                                                objM4514P11 = new C5113mj(4, interfaceC1231l5, c5709b4);
                                                                c1836h03.m4545k0(objM4514P11);
                                                            }
                                                            AbstractC4955ho.m9304C1("排除关键词", "包含任一关键词时不触发，多个用 |、逗号或换行分隔", str10, 2, (InterfaceC1231l) objM4514P11, c1836h03, 3126, 0);
                                                            c1836h03.m4553p(false);
                                                        }
                                                    } else {
                                                        c1836h03.m4519V();
                                                    }
                                                    break;
                                            }
                                            return C3967n.f12976a;
                                        }
                                    }, c1836h0), c1836h0, 48, 1);
                                } else {
                                    c1836h0.m4519V();
                                }
                                break;
                        }
                        return C3967n.f12976a;
                    }
                }, true), 3);
                C3623h.m7604a(c3623h4, null, AbstractC5193p0.f19692W0, 3);
                C3623h.m7604a(c3623h4, null, new C3874d(1709312888, new C0443h0(24, c5709b, interfaceC1231l2, (InterfaceC1220a) obj3, false), true), 3);
                return c3967n;
            case 10:
                List list3 = (List) obj5;
                String str3 = (String) obj7;
                String str4 = (String) obj6;
                InterfaceC1231l interfaceC1231l3 = (InterfaceC1231l) obj4;
                Context context = (Context) obj3;
                String str5 = (String) obj;
                str5.getClass();
                if (AbstractC3149m.m6721t0(str5)) {
                    objM9646q7 = new ArrayList();
                    for (Object obj8 : list3) {
                        if (!AbstractC1416l.m3825a(((C3105r) obj8).f10071a, str3)) {
                            objM9646q7.add(obj8);
                        }
                    }
                } else {
                    objM9646q7 = AbstractC4955ho.m9646q7(list3, AbstractC0000a.m99x0(new C3105r(str3, str4, str5)));
                }
                interfaceC1231l3.invoke(objM9646q7);
                Toast.makeText(context, AbstractC3149m.m6721t0(str5) ? "已取消模板绑定" : "模板已绑定", 0).show();
                return c3967n;
            case 11:
                SharedPreferences sharedPreferences = (SharedPreferences) obj6;
                Context context2 = (Context) obj5;
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) obj4;
                InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) obj3;
                C3471g c3471g = (C3471g) obj;
                c3471g.getClass();
                int size = ((List) interfaceC1809a13.getValue()).size();
                C5032k4 c5032k4 = (C5032k4) ((AbstractC5065l4) obj7);
                int i17 = c5032k4.f18302a;
                if (i17 < 0 || i17 >= size) {
                    arrayListM8398G1 = AbstractC4166m.m8398G1((List) interfaceC1809a13.getValue(), c3471g);
                } else {
                    arrayListM8398G1 = AbstractC4166m.m8409R1((List) interfaceC1809a13.getValue());
                    arrayListM8398G1.set(c5032k4.f18302a, c3471g);
                }
                interfaceC1809a13.setValue(arrayListM8398G1);
                sharedPreferences.edit().putString("group_rename_templates", AbstractC5700d.m10295v((List) interfaceC1809a13.getValue())).apply();
                Toast.makeText(context2, "改名模板已保存", 0).show();
                interfaceC1809a14.setValue(C4935h4.f17525d);
                return c3967n;
            case 12:
                Context context3 = (Context) obj7;
                AbstractC5230q4 abstractC5230q4 = (AbstractC5230q4) obj6;
                InterfaceC1809a1 interfaceC1809a15 = (InterfaceC1809a1) obj5;
                C5738e c5738e = (C5738e) obj4;
                InterfaceC1809a1 interfaceC1809a16 = (InterfaceC1809a1) obj3;
                C5739f c5739f = (C5739f) obj;
                c5739f.getClass();
                String str6 = c5739f.f23384a;
                if (AbstractC3149m.m6721t0(str6)) {
                    Toast.makeText(context3, "关键词不能为空", 0).show();
                } else {
                    String str7 = ((C5164o4) abstractC5230q4).f19314a;
                    if (AbstractC1416l.m3825a(str7, str6) || ((list = (List) interfaceC1809a15.getValue()) != null && list.isEmpty())) {
                        if (str7 != null) {
                            arrayListM8398G12 = AbstractC4166m.m8398G1((List) interfaceC1809a15.getValue(), c5739f);
                        } else {
                            List<C5739f> list4 = (List) interfaceC1809a15.getValue();
                            ArrayList arrayList4 = new ArrayList(AbstractC4167n.m8429e1(list4));
                            for (C5739f c5739f2 : list4) {
                                if (AbstractC1416l.m3825a(c5739f2.f23384a, str7)) {
                                    c5739f2 = c5739f;
                                }
                                arrayList4.add(c5739f2);
                            }
                            arrayListM8398G12 = arrayList4;
                        }
                        AbstractC4955ho.m9368K1(c5738e, interfaceC1809a15, arrayListM8398G12);
                        Toast.makeText(context3, "关键词已保存", 0).show();
                        interfaceC1809a16.setValue(C5197p4.f19926a);
                    } else {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (AbstractC1416l.m3825a(((C5739f) it.next()).f23384a, str6)) {
                                Toast.makeText(context3, "该关键词已存在", 0).show();
                            }
                        }
                        if (str7 != null) {
                        }
                        AbstractC4955ho.m9368K1(c5738e, interfaceC1809a15, arrayListM8398G12);
                        Toast.makeText(context3, "关键词已保存", 0).show();
                        interfaceC1809a16.setValue(C5197p4.f19926a);
                    }
                }
                return c3967n;
            case 13:
                InterfaceC1809a1 interfaceC1809a17 = (InterfaceC1809a1) obj6;
                Context context4 = (Context) obj5;
                C0848s c0848s = (C0848s) obj4;
                InterfaceC1809a1 interfaceC1809a18 = (InterfaceC1809a1) obj3;
                List list5 = (List) obj;
                list5.getClass();
                C5195p2 c5195p2 = (C5195p2) ((AbstractC5261r2) obj7);
                String str8 = c5195p2.f19924a;
                ArrayList arrayList5 = new ArrayList();
                Iterator it2 = list5.iterator();
                while (it2.hasNext()) {
                    String string = AbstractC3149m.m6703R0((String) it2.next()).toString();
                    int i18 = i13;
                    char[] cArr = {'/', '#', ':', 65306};
                    ArrayList arrayList6 = new ArrayList(4);
                    int i19 = 0;
                    for (int i20 = 4; i19 < i20; i20 = 4) {
                        arrayList6.add(Integer.valueOf(AbstractC3149m.m6718q0(string, cArr[i19], 0, 6)));
                        i19++;
                    }
                    ArrayList arrayList7 = new ArrayList();
                    for (Object obj9 : arrayList6) {
                        if (((Number) obj9).intValue() > 0) {
                            arrayList7.add(obj9);
                        }
                    }
                    Integer num = (Integer) AbstractC4166m.m8395D1(arrayList7);
                    if (num != null) {
                        int iIntValue = num.intValue();
                        String string2 = AbstractC3149m.m6703R0(string.substring(0, iIntValue)).toString();
                        string = AbstractC3149m.m6703R0(string.substring(iIntValue + 1)).toString();
                        if (!AbstractC1416l.m3825a(string2, str8) || AbstractC3149m.m6721t0(string)) {
                            string = null;
                        }
                    } else if (AbstractC3149m.m6721t0(string)) {
                    }
                    if (string != null) {
                        arrayList5.add(string);
                    }
                    i13 = i18;
                }
                String strM8392A1 = AbstractC4166m.m8392A1(AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList5)), ",", null, null, null, 62);
                String str9 = c5195p2.f19925b.f16498a;
                Iterator it3 = ((List) interfaceC1809a17.getValue()).iterator();
                while (true) {
                    if (it3.hasNext()) {
                        Object next = it3.next();
                        if (AbstractC1416l.m3825a(((C0832c) next).f2511b, str8)) {
                            obj2 = next;
                        }
                    } else {
                        obj2 = null;
                    }
                }
                C0832c c0832c = (C0832c) obj2;
                if (c0832c != null) {
                    C0832c c0832cM2114a = AbstractC3149m.m6709h0(str9, "屏蔽", false) ? C0832c.m2114a(c0832c, null, null, null, false, false, false, 0, false, false, false, false, false, false, false, false, false, null, null, null, false, false, null, strM8392A1, 4194303) : C0832c.m2114a(c0832c, null, null, null, false, false, false, 0, false, false, false, false, false, false, false, false, false, null, null, null, false, false, strM8392A1, null, 6291455);
                    List<C0832c> list6 = (List) interfaceC1809a17.getValue();
                    ArrayList arrayList8 = new ArrayList(AbstractC4167n.m8429e1(list6));
                    for (C0832c c0832c2 : list6) {
                        if (AbstractC1416l.m3825a(c0832c2.f2511b, str8)) {
                            c0832c2 = c0832cM2114a;
                        }
                        arrayList8.add(c0832c2);
                    }
                    AbstractC4955ho.m9603m0(c0848s, interfaceC1809a17, arrayList8);
                    Toast.makeText(context4, "成员规则已保存", 0).show();
                }
                interfaceC1809a18.setValue(new C5228q2(str8));
                return c3967n;
            case 14:
                Context context5 = (Context) obj7;
                InterfaceC1809a1 interfaceC1809a19 = (InterfaceC1809a1) obj6;
                C4538r c4538r = (C4538r) obj5;
                InterfaceC1809a1 interfaceC1809a110 = (InterfaceC1809a1) obj4;
                InterfaceC1809a1 interfaceC1809a111 = (InterfaceC1809a1) obj3;
                C4521a c4521a = (C4521a) obj;
                c4521a.getClass();
                C4521a c4521aM8946a = C4521a.m8946a(c4521a, AbstractC3149m.m6703R0(c4521a.f14898b).toString(), false, false, null, AbstractC4955ho.m9413P6(c4521a.f14902f, c4521a.f14901e), null, null, false, 0L, false, null, false, null, 16349);
                String str10 = c4521aM8946a.f14897a;
                if (AbstractC3149m.m6721t0(c4521aM8946a.f14898b)) {
                    Toast.makeText(context5, "请输入规则名称", 0).show();
                } else if (c4521aM8946a.f14901e.isEmpty()) {
                    Toast.makeText(context5, "请选择监听会话", 0).show();
                } else if (c4521aM8946a.f14903g.isEmpty()) {
                    Toast.makeText(context5, "请选择转发会话", 0).show();
                } else if (c4521aM8946a.f14904h.isEmpty()) {
                    Toast.makeText(context5, "至少选择一种消息类型", 0).show();
                } else {
                    List list7 = (List) interfaceC1809a19.getValue();
                    if (list7 == null || !list7.isEmpty()) {
                        Iterator it4 = list7.iterator();
                        while (it4.hasNext()) {
                            if (((C4521a) it4.next()).f14897a.equals(str10)) {
                                List<C4521a> list8 = (List) interfaceC1809a19.getValue();
                                arrayList = new ArrayList(AbstractC4167n.m8429e1(list8));
                                for (C4521a c4521a2 : list8) {
                                    if (c4521a2.f14897a.equals(str10)) {
                                        c4521a2 = c4521aM8946a;
                                    }
                                    arrayList.add(c4521a2);
                                }
                                AbstractC4955ho.m9584k(c4538r, context5, interfaceC1809a19, arrayList);
                                interfaceC1809a110.setValue(null);
                                Toast.makeText(context5, "规则已保存", 0).show();
                                interfaceC1809a111.setValue(EnumC4897g.f17314h);
                            }
                        }
                        arrayList = AbstractC4166m.m8398G1((List) interfaceC1809a19.getValue(), c4521aM8946a);
                        AbstractC4955ho.m9584k(c4538r, context5, interfaceC1809a19, arrayList);
                        interfaceC1809a110.setValue(null);
                        Toast.makeText(context5, "规则已保存", 0).show();
                        interfaceC1809a111.setValue(EnumC4897g.f17314h);
                    } else {
                        arrayList = AbstractC4166m.m8398G1((List) interfaceC1809a19.getValue(), c4521aM8946a);
                        AbstractC4955ho.m9584k(c4538r, context5, interfaceC1809a19, arrayList);
                        interfaceC1809a110.setValue(null);
                        Toast.makeText(context5, "规则已保存", 0).show();
                        interfaceC1809a111.setValue(EnumC4897g.f17314h);
                    }
                }
                return c3967n;
            case 15:
                SharedPreferences sharedPreferences2 = (SharedPreferences) obj6;
                Context context6 = (Context) obj5;
                InterfaceC1809a1 interfaceC1809a112 = (InterfaceC1809a1) obj4;
                InterfaceC1809a1 interfaceC1809a113 = (InterfaceC1809a1) obj3;
                C3104q c3104q = (C3104q) obj;
                c3104q.getClass();
                int size2 = ((List) interfaceC1809a112.getValue()).size();
                int i21 = ((C4771c4) obj7).f16187a;
                if (i21 < 0 || i21 >= size2) {
                    arrayListM8398G13 = AbstractC4166m.m8398G1((List) interfaceC1809a112.getValue(), c3104q);
                } else {
                    arrayListM8398G13 = AbstractC4166m.m8409R1((List) interfaceC1809a112.getValue());
                    arrayListM8398G13.set(i21, c3104q);
                }
                interfaceC1809a112.setValue(arrayListM8398G13);
                sharedPreferences2.edit().putString("group_member_reply_templates", AbstractC3754e0.m7861D(arrayListM8398G13)).apply();
                Toast.makeText(context6, "模板已保存", 0).show();
                interfaceC1809a113.setValue(null);
                return c3967n;
            case 16:
                Context context7 = (Context) obj7;
                InterfaceC1809a1 interfaceC1809a114 = (InterfaceC1809a1) obj6;
                InterfaceC1809a1 interfaceC1809a115 = (InterfaceC1809a1) obj5;
                SharedPreferences sharedPreferences3 = (SharedPreferences) obj4;
                Map map = (Map) obj3;
                List list9 = (List) obj;
                list9.getClass();
                HashSet<String> hashSet = new HashSet();
                Iterator it5 = list9.iterator();
                while (it5.hasNext()) {
                    hashSet.add(((C5292s0) it5.next()).f20550a);
                }
                String strM9316D5 = AbstractC4955ho.m9316D5(AbstractC4156d0.m8352T(AbstractC4955ho.m9715y6((String) interfaceC1809a114.getValue()), hashSet));
                List list10 = (List) interfaceC1809a115.getValue();
                ArrayList arrayList9 = new ArrayList();
                for (Object obj10 : list10) {
                    if (!hashSet.contains(((C3105r) obj10).f10071a)) {
                        arrayList9.add(obj10);
                    }
                }
                for (String str11 : hashSet) {
                    AbstractC4955ho.m9572i5(sharedPreferences3, str11, strM9316D5, arrayList9);
                    map.remove(str11);
                }
                interfaceC1809a114.setValue(strM9316D5);
                interfaceC1809a115.setValue(arrayList9);
                AbstractC4855en.m9271o("已删除 ", list9.size(), " 个监听群", context7, 0);
                return c3967n;
            case 17:
                Context context8 = (Context) obj7;
                InterfaceC1809a1 interfaceC1809a116 = (InterfaceC1809a1) obj6;
                C5725r c5725r = (C5725r) obj5;
                InterfaceC1809a1 interfaceC1809a117 = (InterfaceC1809a1) obj4;
                InterfaceC1809a1 interfaceC1809a118 = (InterfaceC1809a1) obj3;
                C5709b c5709b2 = (C5709b) obj;
                c5709b2.getClass();
                List<C5709b> list11 = (List) interfaceC1809a116.getValue();
                ArrayList arrayList10 = new ArrayList(AbstractC4167n.m8429e1(list11));
                for (C5709b c5709b3 : list11) {
                    if (AbstractC1416l.m3825a(c5709b3.f23199a, c5709b2.f23199a)) {
                        c5709b3 = c5709b2;
                    }
                    arrayList10.add(c5709b3);
                }
                AbstractC4955ho.m9294B(c5725r, interfaceC1809a116, arrayList10);
                interfaceC1809a117.setValue(null);
                Toast.makeText(context8, "规则已保存", 0).show();
                interfaceC1809a118.setValue("rules");
                return c3967n;
            case 18:
                AbstractC5349to abstractC5349to = (AbstractC5349to) obj7;
                SharedPreferences sharedPreferences4 = (SharedPreferences) obj6;
                InterfaceC1809a1 interfaceC1809a119 = (InterfaceC1809a1) obj5;
                InterfaceC1809a1 interfaceC1809a120 = (InterfaceC1809a1) obj4;
                InterfaceC1809a1 interfaceC1809a121 = (InterfaceC1809a1) obj3;
                List list12 = (List) obj;
                list12.getClass();
                ArrayList arrayList11 = new ArrayList(AbstractC4167n.m8429e1(list12));
                Iterator it6 = list12.iterator();
                while (it6.hasNext()) {
                    arrayList11.add(((C5292s0) it6.next()).f20550a);
                }
                ArrayList arrayList12 = new ArrayList();
                for (Object obj11 : arrayList11) {
                    if (!AbstractC3149m.m6721t0((String) obj11)) {
                        arrayList12.add(obj11);
                    }
                }
                Set setM8412U1 = AbstractC4166m.m8412U1(arrayList12);
                if (((C5283ro) abstractC5349to).f20508a == 1) {
                    interfaceC1809a119.setValue(setM8412U1);
                    sharedPreferences4.edit().putString("blacklist", AbstractC4955ho.m9316D5(setM8412U1)).apply();
                } else {
                    interfaceC1809a120.setValue(setM8412U1);
                    sharedPreferences4.edit().putString("whitelist", AbstractC4955ho.m9316D5(setM8412U1)).apply();
                }
                interfaceC1809a121.setValue(C5316so.f20704a);
                return c3967n;
            case 19:
                AbstractC5151no abstractC5151no = (AbstractC5151no) obj7;
                SharedPreferences sharedPreferences5 = (SharedPreferences) obj6;
                InterfaceC1809a1 interfaceC1809a122 = (InterfaceC1809a1) obj5;
                InterfaceC1809a1 interfaceC1809a123 = (InterfaceC1809a1) obj4;
                InterfaceC1809a1 interfaceC1809a124 = (InterfaceC1809a1) obj3;
                List list13 = (List) obj;
                list13.getClass();
                ArrayList arrayList13 = new ArrayList(AbstractC4167n.m8429e1(list13));
                Iterator it7 = list13.iterator();
                while (it7.hasNext()) {
                    arrayList13.add(((C5292s0) it7.next()).f20550a);
                }
                ArrayList arrayList14 = new ArrayList();
                for (Object obj12 : arrayList13) {
                    if (!AbstractC3149m.m6721t0((String) obj12)) {
                        arrayList14.add(obj12);
                    }
                }
                Set setM8412U12 = AbstractC4166m.m8412U1(arrayList14);
                if (((C5085lo) abstractC5151no).f18767a == 1) {
                    interfaceC1809a122.setValue(setM8412U12);
                    sharedPreferences5.edit().putString("comment_blacklist", AbstractC4955ho.m9316D5(setM8412U12)).apply();
                } else {
                    interfaceC1809a123.setValue(setM8412U12);
                    sharedPreferences5.edit().putString("comment_whitelist", AbstractC4955ho.m9316D5(setM8412U12)).apply();
                }
                interfaceC1809a124.setValue(C5118mo.f19001a);
                return c3967n;
            case 20:
                C1103b c1103b = (C1103b) obj6;
                InterfaceC1809a1 interfaceC1809a125 = (InterfaceC1809a1) obj4;
                InterfaceC1809a1 interfaceC1809a126 = (InterfaceC1809a1) obj3;
                C1142k2 c1142k2 = (C1142k2) obj;
                c1142k2.getClass();
                C4731au c4731au = new C4731au(c1142k2);
                new Handler(Looper.getMainLooper()).post(new RunnableC0537x((String) obj7, c4731au, (InterfaceC1809a1) obj5, interfaceC1809a125, interfaceC1809a126, 18));
                while (!c4731au.f15943c.await(200L, TimeUnit.MILLISECONDS)) {
                    try {
                        c1103b.m2828d();
                    } finally {
                        new Handler(Looper.getMainLooper()).post(new RunnableC3737b(c4731au, interfaceC1809a125, interfaceC1809a126, i11));
                    }
                }
                c1103b.m2828d();
                EnumC1182u2 enumC1182u2 = (EnumC1182u2) c4731au.f15942b.get();
                if (enumC1182u2 == null) {
                    enumC1182u2 = EnumC1182u2.f3972g;
                    break;
                }
                return enumC1182u2;
            default:
                String str12 = ((C1113d1) obj7).f3636a;
                InterfaceC1231l interfaceC1231l4 = (InterfaceC1231l) obj6;
                InterfaceC1809a1 interfaceC1809a127 = (InterfaceC1809a1) obj5;
                InterfaceC1809a1 interfaceC1809a128 = (InterfaceC1809a1) obj4;
                InterfaceC1809a1 interfaceC1809a129 = (InterfaceC1809a1) obj3;
                if (((Boolean) obj).booleanValue()) {
                    interfaceC1809a127.setValue(str12);
                    interfaceC1809a128.setValue(Boolean.FALSE);
                } else if (AbstractC1416l.m3825a((String) interfaceC1809a127.getValue(), str12)) {
                    interfaceC1809a127.setValue(null);
                    if (((Boolean) interfaceC1809a128.getValue()).booleanValue()) {
                        interfaceC1231l4.invoke((List) interfaceC1809a129.getValue());
                    }
                }
                return c3967n;
        }
    }

    public /* synthetic */ C0884o(Activity activity, C2023q c2023q, String str, C5026jv c5026jv, C3360l c3360l) {
        this.f2725g = 2;
        this.f2727i = activity;
        this.f2728j = c2023q;
        this.f2726h = str;
        this.f2729k = c5026jv;
        this.f2730l = c3360l;
    }

    public /* synthetic */ C0884o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i9) {
        this.f2725g = i9;
        this.f2726h = obj;
        this.f2727i = obj2;
        this.f2728j = obj3;
        this.f2729k = obj4;
        this.f2730l = obj5;
    }

    public /* synthetic */ C0884o(List list, String str, String str2, InterfaceC1231l interfaceC1231l, Context context) {
        this.f2725g = 10;
        this.f2728j = list;
        this.f2726h = str;
        this.f2727i = str2;
        this.f2729k = interfaceC1231l;
        this.f2730l = context;
    }
}
