package p036c9;

import af.C0081d;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.lifecycle.C0119x;
import ba.C0238r;
import ba.EnumC0234n;
import gg.AbstractC1416l;
import gg.C1421q;
import gg.C1422r;
import gg.C1425u;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import ng.AbstractC3015m;
import ng.C3011i;
import ng.C3022t;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import p000a.AbstractC0000a;
import p003a2.C0014a;
import p010aa.C0033a;
import p010aa.C0035c;
import p010aa.C0040h;
import p014b.C0126e;
import p015b0.C0153s;
import p020b5.C0184c;
import p049d9.AbstractC0754o;
import p049d9.C0745f;
import p054dg.C0795n;
import p065eb.C0859c0;
import p065eb.C0884o;
import p071f1.AbstractC0996c0;
import p071f1.AbstractC1013l;
import p071f1.C1009j;
import p071f1.C1010j0;
import p071f1.C1012k0;
import p071f1.C1014l0;
import p071f1.InterfaceC0998d0;
import p071f1.InterfaceC1026r0;
import p080fb.AbstractC1179u;
import p080fb.C1161p1;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p099h.Hchat.hooks.items.script.ScriptWaBridge;
import p101h1.C1565b;
import p116i.AbstractC1742d;
import p116i.C1739c;
import p116i.C1743d0;
import p116i.C1752g0;
import p116i.C1760j;
import p116i.C1766l;
import p117i0.C1845j1;
import p117i0.InterfaceC1809a1;
import p117i0.InterfaceC1854l2;
import p126ia.C2008b;
import p126ia.C2016j;
import p126ia.C2019m;
import p126ia.C2023q;
import p126ia.RunnableC2018l;
import p131j0.C2046b;
import p136j8.C2105p;
import p144k.C2209s1;
import p155ka.C2381g;
import p174m.AbstractC2628m1;
import p174m.C2621k2;
import p174m.C2624l1;
import p174m.C2629m2;
import p174m.C2638p;
import p190n2.C2875j;
import p190n2.C2884s;
import p190n2.C2885t;
import p190n2.C2890y;
import p190n2.InterfaceC2879n;
import p197n9.C2912a;
import p198nb.C2955x;
import p198nb.C2956y;
import p198nb.C2957z;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p222p.AbstractC3199a;
import p230p8.C3360l;
import p243q9.C3472h;
import p249qg.InterfaceC3599t;
import p251r.C3623h;
import p259r9.C3752d0;
import p266s0.C3874d;
import p276sf.C3958e;
import p276sf.C3967n;
import p293u2.InterfaceC4233c;
import p304uf.C4329c;
import p306v.AbstractC4360e;
import p315v8.C4521a;
import p317vb.InterfaceC4544a;
import p321w.C4584b0;
import p321w.C4629q0;
import p321w.C4642w;
import p332wb.AbstractC4702a1;
import p332wb.AbstractC4855en;
import p332wb.AbstractC4955ho;
import p332wb.AbstractC5193p0;
import p332wb.AbstractC5394v3;
import p332wb.C4720aj;
import p332wb.C4806d6;
import p332wb.C4891fq;
import p332wb.C4893fs;
import p332wb.C4961hu;
import p332wb.C4969i5;
import p332wb.C5026jv;
import p332wb.C5237qb;
import p332wb.C5288rt;
import p332wb.C5292s0;
import p332wb.C5295s3;
import p332wb.C5361u3;
import p332wb.C5457x0;
import p332wb.C5489y0;
import p332wb.C5491y2;
import p332wb.EnumC4897g;
import p332wb.EnumC5092lv;
import p339x1.C5610h0;
import p346x9.C5738e;
import sh.C4007f0;
import tf.AbstractC4151b;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.C4175v;

/* JADX INFO: renamed from: c9.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0454k implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1329g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f1330h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f1331i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f1332j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f1333k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0454k(View view, View view2, View view3, C3752d0 c3752d0, ViewGroup viewGroup) {
        this.f1329g = 10;
        this.f1331i = view;
        this.f1333k = view2;
        this.f1330h = view3;
        this.f1332j = viewGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    private final Object m1474e(Object obj) {
        InterfaceC4233c interfaceC4233c = (InterfaceC4233c) this.f1331i;
        InterfaceC1854l2 interfaceC1854l2 = (InterfaceC1854l2) this.f1333k;
        InterfaceC1854l2 interfaceC1854l22 = (InterfaceC1854l2) this.f1330h;
        InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f1332j;
        InterfaceC0998d0 interfaceC0998d0 = (InterfaceC0998d0) obj;
        interfaceC0998d0.getClass();
        interfaceC0998d0.mo2539g(((Number) interfaceC1854l2.getValue()).floatValue());
        interfaceC0998d0.mo2547q(((Number) interfaceC1854l22.getValue()).floatValue());
        interfaceC0998d0.mo2541i(((Number) interfaceC1854l22.getValue()).floatValue());
        interfaceC0998d0.mo2537c(((Boolean) interfaceC1809a1.getValue()).booleanValue() ? interfaceC4233c.mo1601x0(8) : 0.0f);
        interfaceC0998d0.mo2533Q0(AbstractC4360e.m8800a(8));
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    private final Object m1475f(Object obj) {
        List list = (List) this.f1331i;
        InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f1333k;
        InterfaceC1231l interfaceC1231l2 = (InterfaceC1231l) this.f1330h;
        InterfaceC1231l interfaceC1231l3 = (InterfaceC1231l) this.f1332j;
        C3623h c3623h = (C3623h) obj;
        c3623h.getClass();
        int i9 = 0;
        for (Object obj2 : list) {
            int i10 = i9 + 1;
            if (i9 < 0) {
                AbstractC0000a.m32Q0();
                throw null;
            }
            C5288rt c5288rt = (C5288rt) obj2;
            C3623h.m7604a(c3623h, Long.valueOf(c5288rt.f20535a), new C3874d(615267004, new C4893fs(i9, interfaceC1231l, c5288rt, interfaceC1231l2, interfaceC1231l3), true), 2);
            i9 = i10;
        }
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:406:0x0554 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v62, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:171:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0804  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0111  */
    /* JADX WARN: Type inference failed for: r3v60, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v63, types: [java.util.ArrayList] */
    @Override // p085fg.InterfaceC1231l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z9;
        float f3;
        float fIntBitsToFloat;
        long j3;
        C1009j c1009jM2609a;
        boolean zM1497u;
        Object objM9655r7;
        ArrayList arrayListM8398G1;
        List list;
        SharedPreferences.Editor editorEdit;
        ArrayList arrayListM8398G12;
        Object obj2 = null;
        z = true;
        boolean z10 = true;
        int i9 = 0;
        boolean z11 = false;
        switch (this.f1329g) {
            case 0:
                Activity activity = (Activity) this.f1331i;
                String str = (String) this.f1333k;
                ArrayList arrayList = (ArrayList) this.f1330h;
                C0035c c0035c = (C0035c) this.f1332j;
                if (((Boolean) obj).booleanValue()) {
                    Handler handler = C0419b0.f1202a;
                    C0419b0.m1406d(activity, "批量删除消息", "正在清空聊天记录...", new C0153s(activity, str, arrayList, z ? 1 : 0), new C0458l(c0035c, activity, i9));
                }
                return C3967n.f12976a;
            case 1:
                ArrayList arrayList2 = (ArrayList) this.f1330h;
                Activity activity2 = (Activity) this.f1331i;
                List list2 = (List) this.f1333k;
                C0035c c0035c2 = (C0035c) this.f1332j;
                C3958e c3958e = (C3958e) AbstractC4166m.m8425w1(((Integer) obj).intValue(), arrayList2);
                String str2 = c3958e != null ? (String) c3958e.f12961g : null;
                ArrayList arrayList3 = new ArrayList(AbstractC4167n.m8429e1(list2));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((C5026jv) it.next()).f18249a);
                }
                boolean zM1496t = AbstractC0473o2.m1496t(activity2, str2, arrayList3);
                Handler handler2 = C0419b0.f1202a;
                C0419b0.m1410h(activity2, zM1496t ? "会话已移动" : "移动会话失败");
                if (zM1496t) {
                    c0035c2.invoke();
                }
                return C3967n.f12976a;
            case 2:
                ArrayList<C0424c1> arrayList4 = (ArrayList) this.f1330h;
                String str3 = (String) this.f1333k;
                AbstractC0473o2 abstractC0473o2 = (AbstractC0473o2) this.f1331i;
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f1332j;
                C3623h c3623h = (C3623h) obj;
                c3623h.getClass();
                for (C0424c1 c0424c1 : arrayList4) {
                    String str4 = c0424c1.f1216a;
                    if (str4 == null) {
                        str4 = "__wechat_home__";
                    }
                    C3623h.m7604a(c3623h, str4, new C3874d(-286165060, new C0455k0((Object) c0424c1, (Object) str3, (Object) abstractC0473o2, (Object) interfaceC1231l, 0), true), 2);
                }
                return C3967n.f12976a;
            case 3:
                return Boolean.valueOf(ScriptWaBridge.shareFile$lambda$0((String) this.f1333k, (String) this.f1331i, (String) this.f1330h, (String) this.f1332j, (C2105p) obj));
            case 4:
                C5237qb c5237qb = (C5237qb) this.f1331i;
                C1425u c1425u = (C1425u) this.f1330h;
                String str5 = (String) this.f1333k;
                C1425u c1425u2 = (C1425u) this.f1332j;
                C1161p1 c1161p1 = (C1161p1) obj;
                c1161p1.getClass();
                AbstractC1179u.m3102L(c5237qb, c1425u, str5, c1425u2, c1161p1);
                return C3967n.f12976a;
            case 5:
                C1739c c1739c = (C1739c) this.f1331i;
                C1766l c1766l = (C1766l) this.f1333k;
                InterfaceC1231l interfaceC1231l2 = (InterfaceC1231l) this.f1330h;
                C1421q c1421q = (C1421q) this.f1332j;
                C1760j c1760j = (C1760j) obj;
                AbstractC1742d.m4381q(c1760j, c1739c.f5786c);
                C1845j1 c1845j1 = c1760j.f5880e;
                Object objM4357a = C1739c.m4357a(c1739c, c1845j1.getValue());
                if (!AbstractC1416l.m3825a(objM4357a, c1845j1.getValue())) {
                    c1739c.f5786c.f5901h.setValue(objM4357a);
                    c1766l.f5901h.setValue(objM4357a);
                    if (interfaceC1231l2 != null) {
                        interfaceC1231l2.invoke(c1739c);
                    }
                    c1760j.m4409a();
                    c1421q.f4734g = true;
                } else if (interfaceC1231l2 != null) {
                    interfaceC1231l2.invoke(c1739c);
                }
                return C3967n.f12976a;
            case 6:
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f1331i;
                C1752g0 c1752g0 = (C1752g0) this.f1333k;
                C1422r c1422r = (C1422r) this.f1330h;
                InterfaceC3599t interfaceC3599t = (InterfaceC3599t) this.f1332j;
                long jLongValue = ((Long) obj).longValue();
                InterfaceC1854l2 interfaceC1854l2 = (InterfaceC1854l2) interfaceC1809a1.getValue();
                long jLongValue2 = interfaceC1854l2 != null ? ((Number) interfaceC1854l2.getValue()).longValue() : jLongValue;
                long j4 = c1752g0.f5846c;
                C2046b c2046b = c1752g0.f5844a;
                if (j4 == Long.MIN_VALUE || c1422r.f4735g != AbstractC1742d.m4378n(interfaceC3599t.mo4457n())) {
                    c1752g0.f5846c = jLongValue;
                    Object[] objArr = c2046b.f6891g;
                    int i10 = c2046b.f6893i;
                    for (int i11 = 0; i11 < i10; i11++) {
                        ((C1743d0) objArr[i11]).f5824l = true;
                    }
                    c1422r.f4735g = AbstractC1742d.m4378n(interfaceC3599t.mo4457n());
                }
                float f10 = c1422r.f4735g;
                if (f10 == 0.0f) {
                    Object[] objArr2 = c2046b.f6891g;
                    int i12 = c2046b.f6893i;
                    while (i9 < i12) {
                        C1743d0 c1743d0 = (C1743d0) objArr2[i9];
                        c1743d0.f5821i.setValue(c1743d0.f5822j.f6022c);
                        c1743d0.f5824l = true;
                        i9++;
                    }
                } else {
                    long j5 = (long) ((jLongValue2 - c1752g0.f5846c) / f10);
                    Object[] objArr3 = c2046b.f6891g;
                    int i13 = c2046b.f6893i;
                    boolean z12 = true;
                    for (int i14 = 0; i14 < i13; i14++) {
                        C1743d0 c1743d02 = (C1743d0) objArr3[i14];
                        if (!c1743d02.f5823k) {
                            c1743d02.f5826n.f5845b.setValue(Boolean.FALSE);
                            if (c1743d02.f5824l) {
                                c1743d02.f5824l = false;
                                c1743d02.f5825m = j5;
                            }
                            long j10 = j5 - c1743d02.f5825m;
                            c1743d02.f5821i.setValue(c1743d02.f5822j.mo4399f(j10));
                            c1743d02.f5823k = c1743d02.f5822j.m4398e(j10);
                        }
                        if (!c1743d02.f5823k) {
                            z12 = false;
                        }
                    }
                    c1752g0.f5847d.setValue(Boolean.valueOf(!z12));
                }
                return C3967n.f12976a;
            case 7:
                final C2023q c2023q = (C2023q) this.f1333k;
                final Activity activity3 = (Activity) this.f1331i;
                final C3360l c3360l = (C3360l) this.f1330h;
                List list3 = (List) this.f1332j;
                int iIntValue = ((Integer) obj).intValue();
                if (iIntValue == 0) {
                    String str6 = c3360l.f10844a;
                    if (str6 != null) {
                        C2016j c2016j = new C2016j(activity3, c2023q, str6, c3360l, 2);
                        boolean z13 = c2023q.f6844d.getBoolean("fake_comment_use_non_friends", false);
                        Thread thread = new Thread(new RunnableC2018l(c2023q, activity3, z13, C5491y2.m9813X1(activity3, new C2209s1(7), "选择评论好友", z13 ? "正在载入好友和非好友..." : "正在载入好友列表..."), c2016j, 0), "Hchat-MomentsFakeContacts");
                        thread.setDaemon(true);
                        thread.start();
                    }
                } else if (1 > iIntValue || iIntValue > list3.size()) {
                    C5491y2.m9803S1(activity3, "清空伪评论", "清空后恢复该朋友圈的真实评论显示。", new C2019m(z ? 1 : 0, activity3, c2023q, c3360l), new C2209s1(7), EnumC5092lv.f18824j);
                } else {
                    final int i15 = iIntValue - 1;
                    String str7 = c3360l.f10844a;
                    if (str7 != null) {
                        List list4 = c2023q.f6841a.m815l(str7).f6779b;
                        final C2008b c2008b = (C2008b) AbstractC4166m.m8425w1(i15, list4);
                        if (c2008b != null) {
                            long j11 = c2008b.f6777e;
                            C4329c c4329cM7E = AbstractC0000a.m7E();
                            c4329cM7E.add(new C3958e("修改评论内容", c2008b.f6776d));
                            c4329cM7E.add(new C3958e("修改评论时间", C2023q.m4973c(j11)));
                            if (i15 > 0) {
                                c4329cM7E.add(new C3958e("上移", "提前一位显示"));
                            }
                            if (i15 < list4.size() - 1) {
                                c4329cM7E.add(new C3958e("下移", "延后一位显示"));
                            }
                            c4329cM7E.add(new C3958e("删除伪评论", "恢复该位置的真实显示"));
                            final C4329c c4329cM90t = AbstractC0000a.m90t(c4329cM7E);
                            C5491y2.m9799Q1(activity3, c2023q.m4976a(c2008b), C2023q.m4973c(j11) + " · 第 " + iIntValue + " 条", c4329cM90t, new InterfaceC1231l() { // from class: ia.o
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                                /* JADX WARN: Removed duplicated region for block: B:19:0x0084  */
                                @Override // p085fg.InterfaceC1231l
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final Object invoke(Object obj3) {
                                    String str8 = (String) ((C3958e) c4329cM90t.get(((Integer) obj3).intValue())).f12961g;
                                    int iHashCode = str8.hashCode();
                                    C2023q c2023q2 = c2023q;
                                    Activity activity4 = activity3;
                                    C3360l c3360l2 = c3360l;
                                    int i16 = i15;
                                    C2008b c2008b2 = c2008b;
                                    switch (iHashCode) {
                                        case 650545:
                                            if (!str8.equals("上移")) {
                                                C5491y2.m9803S1(activity4, "删除伪评论", "只会删除这条本地伪评论。", new C2015i(i16, activity4, c2023q2, c3360l2), new C2209s1(7), EnumC5092lv.f18824j);
                                            } else {
                                                c2023q2.m4979e(activity4, c3360l2, i16, i16 - 1);
                                            }
                                            break;
                                        case 650576:
                                            if (str8.equals("下移")) {
                                                c2023q2.m4979e(activity4, c3360l2, i16, i16 + 1);
                                                break;
                                            }
                                            break;
                                        case 956498773:
                                            if (str8.equals("修改评论内容")) {
                                                C5491y2.m9824c2(activity4, "修改评论内容", c2023q2.m4976a(c2008b2), c2008b2.f6776d, null, 1000, false, new C2015i(c2023q2, activity4, c3360l2, i16, 2), new C2209s1(7), 592);
                                                break;
                                            }
                                            break;
                                        case 956675903:
                                            if (str8.equals("修改评论时间")) {
                                                C5491y2.m9809V1(activity4, "修改评论时间", c2008b2.f6777e, new C2015i(c2023q2, activity4, c3360l2, i16, 0), new C2209s1(7));
                                                break;
                                            }
                                            break;
                                    }
                                    return C3967n.f12976a;
                                }
                            }, new C2209s1(7), EnumC5092lv.f18824j);
                        }
                    }
                }
                return C3967n.f12976a;
            case 8:
                C1422r c1422r2 = (C1422r) this.f1331i;
                C2621k2 c2621k2 = (C2621k2) this.f1333k;
                C1422r c1422r3 = (C1422r) this.f1330h;
                C2638p c2638p = (C2638p) this.f1332j;
                C1760j c1760j2 = (C1760j) obj;
                float fFloatValue = ((Number) c1760j2.f5880e.getValue()).floatValue() - c1422r2.f4735g;
                float fMo6077a = c2621k2.mo6077a(fFloatValue);
                c1422r2.f4735g = ((Number) c1760j2.f5880e.getValue()).floatValue();
                c1422r3.f4735g = ((Number) c1760j2.f5876a.f5913b.invoke(c1760j2.f5881f)).floatValue();
                if (Math.abs(fFloatValue - fMo6077a) > 0.5f) {
                    c1760j2.m4409a();
                }
                c2638p.getClass();
                return C3967n.f12976a;
            case 9:
                C1422r c1422r4 = (C1422r) this.f1331i;
                C2624l1 c2624l1 = (C2624l1) this.f1333k;
                C2629m2 c2629m2 = (C2629m2) this.f1330h;
                C0884o c0884o = (C0884o) this.f1332j;
                C1760j c1760j3 = (C1760j) obj;
                float fFloatValue2 = ((Number) c1760j3.f5880e.getValue()).floatValue() - c1422r4.f4735g;
                if (AbstractC2628m1.m6084a(fFloatValue2)) {
                    if (((Boolean) c0884o.invoke(Float.valueOf(c1422r4.f4735g))).booleanValue()) {
                        c1760j3.m4409a();
                    }
                } else if (AbstractC2628m1.m6084a(fFloatValue2 - c2624l1.m6082e(c2629m2, fFloatValue2))) {
                    c1422r4.f4735g += fFloatValue2;
                    if (((Boolean) c0884o.invoke(Float.valueOf(c1422r4.f4735g))).booleanValue()) {
                    }
                } else {
                    c1760j3.m4409a();
                }
                return C3967n.f12976a;
            case 10:
                View view = (View) this.f1331i;
                View view2 = (View) this.f1333k;
                View view3 = (View) this.f1330h;
                ViewGroup viewGroup = (ViewGroup) this.f1332j;
                View view4 = (View) obj;
                view4.getClass();
                return Boolean.valueOf((view4 == view || view4 == view2 || view4 == view3 || view4.getVisibility() == 8 || !C3752d0.m7780P(view4, viewGroup)) ? false : true);
            case 11:
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f1331i;
                C4007f0 c4007f0 = (C4007f0) this.f1333k;
                InterfaceC1026r0 interfaceC1026r0 = (InterfaceC1026r0) this.f1330h;
                InterfaceC4233c interfaceC4233c = (InterfaceC4233c) this.f1332j;
                C5610h0 c5610h0 = (C5610h0) obj;
                c5610h0.getClass();
                float fFloatValue3 = ((Number) interfaceC1220a.invoke()).floatValue();
                boolean z14 = c4007f0.f13120a;
                boolean z15 = c4007f0.f13121b;
                C1565b c1565b = c5610h0.f22833g;
                long jMo4091a = c1565b.mo4091a();
                float fIntBitsToFloat2 = z15 ? (1.0f - fFloatValue3) * Float.intBitsToFloat((int) (jMo4091a & 4294967295L)) : 0.0f;
                if (z14) {
                    z9 = z15;
                    f3 = 0.5f;
                    fIntBitsToFloat = Float.intBitsToFloat((int) (jMo4091a & 4294967295L)) * fFloatValue3;
                } else {
                    z9 = z15;
                    f3 = 0.5f;
                    fIntBitsToFloat = z9 ? Float.intBitsToFloat((int) (jMo4091a & 4294967295L)) : Float.intBitsToFloat((int) (jMo4091a & 4294967295L)) * ((fFloatValue3 * 0.5f) + 0.5f);
                }
                if (z14 || z9) {
                    j3 = 4294967295L;
                } else {
                    j3 = 4294967295L;
                    fIntBitsToFloat2 = (f3 - (fFloatValue3 * f3)) * Float.intBitsToFloat((int) (jMo4091a & 4294967295L));
                }
                float f11 = fIntBitsToFloat - fIntBitsToFloat2;
                if (f11 > 0.0f) {
                    AbstractC0996c0 abstractC0996c0Mo2612a = interfaceC1026r0.mo2612a((((long) Float.floatToRawIntBits(f11)) & j3) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jMo4091a >> 32)))) << 32), c5610h0.getLayoutDirection(), interfaceC4233c);
                    ((C0119x) c1565b.f5220h.f469a).m598c0(0.0f, fIntBitsToFloat2);
                    try {
                        if (abstractC0996c0Mo2612a instanceof C1012k0) {
                            c1009jM2609a = AbstractC1013l.m2609a();
                            C1009j.m2600b(c1009jM2609a, ((C1012k0) abstractC0996c0Mo2612a).f3197f);
                        } else if (abstractC0996c0Mo2612a instanceof C1014l0) {
                            c1009jM2609a = AbstractC1013l.m2609a();
                            C1009j.m2601c(c1009jM2609a, ((C1014l0) abstractC0996c0Mo2612a).f3198f);
                        } else {
                            if (!(abstractC0996c0Mo2612a instanceof C1010j0)) {
                                throw new C0081d();
                            }
                            c1009jM2609a = ((C1010j0) abstractC0996c0Mo2612a).f3195f;
                        }
                        C0184c c0184c = c1565b.f5220h;
                        long jM825v = c0184c.m825v();
                        c0184c.m819p().mo2487e();
                        try {
                            ((C0184c) ((C0119x) c0184c.f469a).f310h).m819p().mo2486d(c1009jM2609a);
                            float f12 = -fIntBitsToFloat2;
                            ((C0119x) c1565b.f5220h.f469a).m598c0(0.0f, f12);
                            try {
                                c5610h0.m10064e();
                                ((C0119x) c1565b.f5220h.f469a).m598c0(-0.0f, f12);
                            } finally {
                                ((C0119x) c1565b.f5220h.f469a).m598c0(-0.0f, -f12);
                            }
                        } finally {
                            c0184c.m819p().mo2497p();
                            c0184c.m803U(jM825v);
                        }
                    } catch (Throwable th2) {
                        ((C0119x) c1565b.f5220h.f469a).m598c0(-0.0f, -fIntBitsToFloat2);
                        throw th2;
                    }
                }
                return C3967n.f12976a;
            case 12:
                C4629q0 c4629q0 = (C4629q0) this.f1331i;
                C2885t c2885t = (C2885t) this.f1333k;
                C2884s c2884s = (C2884s) this.f1330h;
                C2875j c2875j = (C2875j) this.f1332j;
                if (c4629q0.m9049b()) {
                    C0126e c0126e = c4629q0.f15329d;
                    C4642w c4642w = c4629q0.f15347v;
                    C4642w c4642w2 = c4629q0.f15348w;
                    C1425u c1425u3 = new C1425u();
                    C0153s c0153s = new C0153s(c0126e, c4642w, c1425u3, 23);
                    InterfaceC2879n interfaceC2879n = c2885t.f9319a;
                    interfaceC2879n.mo2394a(c2884s, c2875j, c0153s, c4642w2);
                    C2890y c2890y = new C2890y(c2885t, interfaceC2879n);
                    c2885t.f9320b.set(c2890y);
                    c1425u3.f4738g = c2890y;
                    c4629q0.f15330e = c2890y;
                }
                return new C4584b0();
            case 13:
                AbstractC4702a1 abstractC4702a1 = (AbstractC4702a1) this.f1331i;
                Context context = (Context) this.f1333k;
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f1330h;
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f1332j;
                C0414a c0414a = (C0414a) obj;
                c0414a.getClass();
                boolean z16 = ((C5457x0) abstractC4702a1).f21843b;
                List<C0414a> list5 = (List) interfaceC1809a12.getValue();
                if (list5 == null || !list5.isEmpty()) {
                    for (C0414a c0414a2 : list5) {
                        if (!AbstractC1416l.m3825a(c0414a2.f1179a, c0414a.f1179a) && AbstractC1416l.m3825a(c0414a2.f1181c, c0414a.f1181c) && AbstractC3156t.m6734X(c0414a2.f1180b, AbstractC3149m.m6703R0(c0414a.f1180b).toString())) {
                            Toast.makeText(context, "同一层级已存在同名分组", 0).show();
                        }
                    }
                    zM1497u = !z16 ? AbstractC0473o2.m1497u(context, c0414a) : AbstractC0473o2.m1478b(context, c0414a);
                    Toast.makeText(context, !zM1497u ? "聊天分组已保存" : "聊天分组保存失败", 0).show();
                    if (zM1497u) {
                        interfaceC1809a12.setValue(AbstractC0473o2.m1485i(context));
                        C0429d2.m1445y(context);
                    }
                    z11 = zM1497u;
                } else {
                    if (!z16) {
                    }
                    Toast.makeText(context, !zM1497u ? "聊天分组已保存" : "聊天分组保存失败", 0).show();
                    if (zM1497u) {
                    }
                    z11 = zM1497u;
                }
                if (z11) {
                    interfaceC1809a13.setValue(C5489y0.f22055a);
                }
                return C3967n.f12976a;
            case 14:
                List list6 = (List) this.f1331i;
                String str8 = (String) this.f1333k;
                String str9 = (String) this.f1330h;
                InterfaceC1231l interfaceC1231l3 = (InterfaceC1231l) this.f1332j;
                String str10 = (String) obj;
                str10.getClass();
                if (AbstractC3149m.m6721t0(str10)) {
                    objM9655r7 = new ArrayList();
                    for (Object obj3 : list6) {
                        if (!AbstractC1416l.m3825a(((C3472h) obj3).f11264a, str8)) {
                            objM9655r7.add(obj3);
                        }
                    }
                } else {
                    if (AbstractC3149m.m6721t0(str9)) {
                        str9 = str8;
                    }
                    objM9655r7 = AbstractC4955ho.m9655r7(list6, AbstractC0000a.m99x0(new C3472h(str8, str9, str10)));
                }
                interfaceC1231l3.invoke(objM9655r7);
                return C3967n.f12976a;
            case 15:
                InterfaceC1231l interfaceC1231l4 = (InterfaceC1231l) this.f1331i;
                SharedPreferences sharedPreferences = (SharedPreferences) this.f1330h;
                String str11 = (String) this.f1333k;
                InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) this.f1332j;
                Integer num = (Integer) obj;
                int iIntValue2 = num.intValue();
                interfaceC1809a14.setValue(num);
                interfaceC1231l4.invoke(num);
                sharedPreferences.edit().putInt(str11, iIntValue2).apply();
                return C3967n.f12976a;
            case 16:
                C0467n0 c0467n0 = (C0467n0) this.f1331i;
                Context context2 = (Context) this.f1333k;
                EnumC0234n enumC0234n = (EnumC0234n) this.f1330h;
                InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) this.f1332j;
                if (((Integer) obj).intValue() == 0) {
                    c0467n0.invoke();
                } else {
                    C0238r c0238r = C0238r.f632a;
                    synchronized (C0238r.class) {
                        context2.getClass();
                        enumC0234n.getClass();
                        C0238r.f633b.remove(enumC0234n);
                        C0238r c0238r2 = C0238r.f632a;
                        File fileM947a = C0238r.m947a(context2, enumC0234n);
                        if (fileM947a.exists()) {
                            if (!fileM947a.delete()) {
                                z10 = false;
                            }
                        }
                    }
                    if (z10) {
                        interfaceC1220a2.invoke();
                        Toast.makeText(context2, "已恢复微信气泡", 0).show();
                    }
                }
                return C3967n.f12976a;
            case 17:
                Activity activity4 = (Activity) this.f1331i;
                C5292s0 c5292s0 = (C5292s0) this.f1333k;
                Context context3 = (Context) this.f1330h;
                InterfaceC1809a1 interfaceC1809a15 = (InterfaceC1809a1) this.f1332j;
                if (((Integer) obj).intValue() == 0) {
                    String str12 = c5292s0.f20550a;
                    C4720aj c4720aj = new C4720aj(interfaceC1809a15, 15);
                    C0745f c0745f = C0745f.f2216a;
                    str12.getClass();
                    C0745f.f2216a.m1935b(activity4, c4720aj, str12, true);
                } else {
                    AbstractC0754o.m1950g(context3, c5292s0.f20550a);
                    AbstractC3199a.m6848u((Number) interfaceC1809a15.getValue(), 1, interfaceC1809a15);
                }
                return C3967n.f12976a;
            case 18:
                C4806d6 c4806d6 = (C4806d6) this.f1331i;
                SharedPreferences sharedPreferences2 = (SharedPreferences) this.f1333k;
                InterfaceC1809a1 interfaceC1809a16 = (InterfaceC1809a1) this.f1330h;
                InterfaceC1809a1 interfaceC1809a17 = (InterfaceC1809a1) this.f1332j;
                C0040h c0040h = (C0040h) obj;
                c0040h.getClass();
                String str13 = c0040h.f141k;
                Set set = c0040h.f140j;
                String str14 = c0040h.f132b;
                String str15 = c0040h.f131a;
                int size = ((List) interfaceC1809a16.getValue()).size();
                int i16 = c4806d6.f16510a;
                if (i16 < 0 || i16 >= size) {
                    List list7 = (List) interfaceC1809a16.getValue();
                    boolean z17 = c0040h.f133c;
                    boolean z18 = c0040h.f139i;
                    set.getClass();
                    str13.getClass();
                    arrayListM8398G1 = AbstractC4166m.m8398G1(list7, new C0040h(str15, str14, z17, 0, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, z18, set, str13));
                } else {
                    ArrayList arrayListM8409R1 = AbstractC4166m.m8409R1((List) interfaceC1809a16.getValue());
                    boolean z19 = c0040h.f133c;
                    boolean z20 = c0040h.f139i;
                    set.getClass();
                    str13.getClass();
                    arrayListM8409R1.set(i16, new C0040h(str15, str14, z19, 0, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, z20, set, str13));
                    arrayListM8398G1 = arrayListM8409R1;
                }
                interfaceC1809a16.setValue(arrayListM8398G1);
                sharedPreferences2.edit().putString("message_block_templates", C0014a.m177g(arrayListM8398G1)).apply();
                interfaceC1809a17.setValue(null);
                return C3967n.f12976a;
            case 19:
                C4969i5 c4969i5 = (C4969i5) this.f1331i;
                SharedPreferences sharedPreferences3 = (SharedPreferences) this.f1333k;
                InterfaceC1809a1 interfaceC1809a18 = (InterfaceC1809a1) this.f1330h;
                InterfaceC1809a1 interfaceC1809a19 = (InterfaceC1809a1) this.f1332j;
                C0033a c0033a = (C0033a) obj;
                c0033a.getClass();
                C0033a c0033aM9672t6 = AbstractC4955ho.m9672t6(c0033a);
                int size2 = ((List) interfaceC1809a18.getValue()).size();
                int i17 = c4969i5.f17771a;
                if (i17 < 0 || i17 >= size2) {
                    list = (List) interfaceC1809a18.getValue();
                } else {
                    ArrayList arrayListM8409R12 = AbstractC4166m.m8409R1((List) interfaceC1809a18.getValue());
                    arrayListM8409R12.remove(i17);
                    list = arrayListM8409R12;
                }
                List listM9664s7 = AbstractC4955ho.m9664s7(list, AbstractC0000a.m99x0(c0033aM9672t6));
                interfaceC1809a18.setValue(listM9664s7);
                sharedPreferences3.edit().putString("message_block_bindings", C0014a.m175e(listM9664s7)).apply();
                interfaceC1809a19.setValue(null);
                return C3967n.f12976a;
            case 20:
                SharedPreferences sharedPreferences4 = (SharedPreferences) this.f1331i;
                String str16 = (String) this.f1333k;
                InterfaceC4544a interfaceC4544a = (InterfaceC4544a) this.f1330h;
                String str17 = (String) this.f1332j;
                C3623h c3623h2 = (C3623h) obj;
                c3623h2.getClass();
                C3623h.m7604a(c3623h2, null, AbstractC5193p0.f19832o0, 3);
                C3623h.m7604a(c3623h2, null, new C3874d(-1087723475, new C0455k0((Object) sharedPreferences4, (Object) str16, (Object) interfaceC4544a, (Object) str17, 21), true), 3);
                return C3967n.f12976a;
            case 21:
                Context context4 = (Context) this.f1331i;
                C5738e c5738e = (C5738e) this.f1333k;
                InterfaceC1809a1 interfaceC1809a110 = (InterfaceC1809a1) this.f1330h;
                InterfaceC1809a1 interfaceC1809a111 = (InterfaceC1809a1) this.f1332j;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                AbstractC4955ho.m9360J1(c5738e, interfaceC1809a110, interfaceC1809a111, zBooleanValue, C4175v.f13712g);
                Toast.makeText(context4, zBooleanValue ? "已清空仅生效名单" : "已清空排除名单", 0).show();
                return C3967n.f12976a;
            case 22:
                InterfaceC1231l interfaceC1231l5 = (InterfaceC1231l) this.f1331i;
                SharedPreferences sharedPreferences5 = (SharedPreferences) this.f1333k;
                InterfaceC1809a1 interfaceC1809a112 = (InterfaceC1809a1) this.f1330h;
                InterfaceC1809a1 interfaceC1809a113 = (InterfaceC1809a1) this.f1332j;
                C0859c0 c0859c0 = (C0859c0) obj;
                c0859c0.getClass();
                AbstractC4955ho.m9346H3(sharedPreferences5, interfaceC1809a112, interfaceC1809a113);
                interfaceC1231l5.invoke(c0859c0);
                return C3967n.f12976a;
            case 23:
                C4521a c4521a = (C4521a) this.f1331i;
                Context context5 = (Context) this.f1333k;
                InterfaceC1809a1 interfaceC1809a114 = (InterfaceC1809a1) this.f1330h;
                InterfaceC1809a1 interfaceC1809a115 = (InterfaceC1809a1) this.f1332j;
                List list8 = (List) obj;
                list8.getClass();
                interfaceC1809a114.setValue(C4521a.m8946a(c4521a, null, false, false, null, AbstractC4166m.m8412U1(list8), null, null, false, 0L, false, null, false, null, 16351));
                AbstractC4855en.m9271o("已选择 ", list8.size(), " 个群成员", context5, 0);
                interfaceC1809a115.setValue(EnumC4897g.f17315i);
                return C3967n.f12976a;
            case 24:
                C2381g c2381g = (C2381g) this.f1331i;
                Context context6 = (Context) this.f1333k;
                InterfaceC1809a1 interfaceC1809a116 = (InterfaceC1809a1) this.f1330h;
                InterfaceC1809a1 interfaceC1809a117 = (InterfaceC1809a1) this.f1332j;
                List list9 = (List) obj;
                list9.getClass();
                ArrayList arrayList5 = new ArrayList(AbstractC4167n.m8429e1(list9));
                Iterator it2 = list9.iterator();
                while (it2.hasNext()) {
                    arrayList5.add(((C5292s0) it2.next()).f20550a);
                }
                ArrayList arrayList6 = new ArrayList();
                for (Object obj4 : arrayList5) {
                    if (!AbstractC3149m.m6721t0((String) obj4)) {
                        arrayList6.add(obj4);
                    }
                }
                interfaceC1809a116.setValue(AbstractC4166m.m8412U1(arrayList6));
                c2381g.m5702c((Set) interfaceC1809a116.getValue());
                Toast.makeText(context6, "点歌范围已保存", 0).show();
                interfaceC1809a117.setValue(C4891fq.f17278a);
                return C3967n.f12976a;
            case 25:
                Context context7 = (Context) this.f1331i;
                C2957z c2957z = (C2957z) this.f1333k;
                InterfaceC1809a1 interfaceC1809a118 = (InterfaceC1809a1) this.f1330h;
                InterfaceC1809a1 interfaceC1809a119 = (InterfaceC1809a1) this.f1332j;
                List list10 = (List) obj;
                list10.getClass();
                ArrayList arrayList7 = new ArrayList(AbstractC4167n.m8429e1(list10));
                Iterator it3 = list10.iterator();
                while (it3.hasNext()) {
                    arrayList7.add(((C5292s0) it3.next()).f20550a);
                }
                ArrayList arrayList8 = new ArrayList();
                for (Object obj5 : arrayList7) {
                    if (!AbstractC3149m.m6721t0((String) obj5)) {
                        arrayList8.add(obj5);
                    }
                }
                Set setM8412U1 = AbstractC4166m.m8412U1(arrayList8);
                interfaceC1809a118.setValue(setM8412U1);
                c2957z.getClass();
                SharedPreferences sharedPreferences6 = c2957z.f9702a;
                if (sharedPreferences6 != null && (editorEdit = sharedPreferences6.edit()) != null) {
                    JSONArray jSONArray = new JSONArray();
                    C3022t c3022tM6413W = AbstractC3015m.m6413W(new C0795n(setM8412U1, 6), C2955x.f9700n);
                    C2956y c2956y = C2956y.f9701n;
                    c2956y.getClass();
                    Iterator it4 = AbstractC3015m.m6409S(new C3011i(c3022tM6413W, true, c2956y)).iterator();
                    while (true) {
                        AbstractC4151b abstractC4151b = (AbstractC4151b) it4;
                        if (abstractC4151b.hasNext()) {
                            jSONArray.put((String) abstractC4151b.next());
                        } else {
                            String string = jSONArray.toString();
                            string.getClass();
                            SharedPreferences.Editor editorPutString = editorEdit.putString("text_speech_allowed_contacts", string);
                            if (editorPutString != null) {
                                editorPutString.apply();
                            }
                        }
                    }
                }
                Toast.makeText(context7, "允许名单已保存", 0).show();
                interfaceC1809a119.setValue(C4961hu.f17742a);
                return C3967n.f12976a;
            case 26:
                Context context8 = (Context) this.f1331i;
                AbstractC5394v3 abstractC5394v3 = (AbstractC5394v3) this.f1333k;
                InterfaceC1809a1 interfaceC1809a120 = (InterfaceC1809a1) this.f1330h;
                InterfaceC1809a1 interfaceC1809a121 = (InterfaceC1809a1) this.f1332j;
                C2912a c2912a = (C2912a) obj;
                c2912a.getClass();
                String str18 = c2912a.f9409a;
                List<C2912a> list11 = (List) interfaceC1809a120.getValue();
                if (list11 == null || !list11.isEmpty()) {
                    for (C2912a c2912a2 : list11) {
                        if (!AbstractC1416l.m3825a(c2912a2.f9409a, str18) && AbstractC3156t.m6734X(c2912a2.f9410b, c2912a.f9410b)) {
                            Toast.makeText(context8, "标签名称已存在", 0).show();
                        }
                    }
                    if (((C5295s3) abstractC5394v3).f20565b) {
                        arrayListM8398G12 = AbstractC4166m.m8398G1((List) interfaceC1809a120.getValue(), c2912a);
                    } else {
                        List<C2912a> list12 = (List) interfaceC1809a120.getValue();
                        arrayListM8398G12 = new ArrayList(AbstractC4167n.m8429e1(list12));
                        for (C2912a c2912a3 : list12) {
                            if (AbstractC1416l.m3825a(c2912a3.f9409a, str18)) {
                                c2912a3 = c2912a;
                            }
                            arrayListM8398G12.add(c2912a3);
                        }
                    }
                    AbstractC4955ho.m9532e1(context8, interfaceC1809a120, arrayListM8398G12);
                    Toast.makeText(context8, "群聊标签已保存", 0).show();
                    interfaceC1809a121.setValue(C5361u3.f20988a);
                } else {
                    if (((C5295s3) abstractC5394v3).f20565b) {
                    }
                    AbstractC4955ho.m9532e1(context8, interfaceC1809a120, arrayListM8398G12);
                    Toast.makeText(context8, "群聊标签已保存", 0).show();
                    interfaceC1809a121.setValue(C5361u3.f20988a);
                }
                return C3967n.f12976a;
            case 27:
                return m1474e(obj);
            case 28:
                return m1475f(obj);
            default:
                C1845j1 c1845j12 = (C1845j1) this.f1331i;
                C1845j1 c1845j13 = (C1845j1) this.f1333k;
                C1845j1 c1845j14 = (C1845j1) this.f1330h;
                C1845j1 c1845j15 = (C1845j1) this.f1332j;
                long jLongValue3 = ((Long) obj).longValue();
                Iterator it5 = ((List) c1845j12.getValue()).iterator();
                while (true) {
                    if (it5.hasNext()) {
                        Object next = it5.next();
                        if (((C5288rt) next).f20535a == jLongValue3) {
                            obj2 = next;
                        }
                    }
                }
                C5288rt c5288rt = (C5288rt) obj2;
                if (c5288rt != null) {
                    List list13 = (List) c1845j12.getValue();
                    ArrayList arrayList9 = new ArrayList();
                    for (Object obj6 : list13) {
                        if (((C5288rt) obj6).f20535a != jLongValue3) {
                            arrayList9.add(obj6);
                        }
                    }
                    c1845j12.setValue(arrayList9);
                    c1845j13.setValue(c5288rt.f20536b);
                    c1845j14.setValue(c5288rt.f20537c);
                    c1845j15.setValue(c5288rt.f20538d);
                }
                return C3967n.f12976a;
        }
    }

    public /* synthetic */ C0454k(InterfaceC1231l interfaceC1231l, Object obj, String str, Object obj2, int i9) {
        this.f1329g = i9;
        this.f1331i = interfaceC1231l;
        this.f1330h = obj;
        this.f1333k = str;
        this.f1332j = obj2;
    }

    public /* synthetic */ C0454k(Object obj, Object obj2, Object obj3, Object obj4, int i9) {
        this.f1329g = i9;
        this.f1331i = obj;
        this.f1333k = obj2;
        this.f1330h = obj3;
        this.f1332j = obj4;
    }

    public /* synthetic */ C0454k(Object obj, Object obj2, boolean z9, Object obj3, Object obj4, int i9) {
        this.f1329g = i9;
        this.f1333k = obj;
        this.f1331i = obj2;
        this.f1330h = obj3;
        this.f1332j = obj4;
    }

    public /* synthetic */ C0454k(ArrayList arrayList, Activity activity, List list, C0035c c0035c) {
        this.f1329g = 1;
        this.f1330h = arrayList;
        this.f1331i = activity;
        this.f1333k = list;
        this.f1332j = c0035c;
    }

    public /* synthetic */ C0454k(ArrayList arrayList, String str, AbstractC0473o2 abstractC0473o2, InterfaceC1231l interfaceC1231l) {
        this.f1329g = 2;
        this.f1330h = arrayList;
        this.f1333k = str;
        this.f1331i = abstractC0473o2;
        this.f1332j = interfaceC1231l;
    }
}
