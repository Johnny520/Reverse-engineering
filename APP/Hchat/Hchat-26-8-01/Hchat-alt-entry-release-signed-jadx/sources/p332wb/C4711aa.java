package p332wb;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;
import ba.EnumC0221a;
import ba.EnumC0234n;
import ca.C0524k;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import na.C2921i;
import okhttp3.HttpUrl;
import org.json.JSONException;
import p003a2.C0014a;
import p070f0.C0976h;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p099h.Hchat.hooks.items.script.ScriptPluginRuntime;
import p117i0.C1808a0;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p251r.C3619d;
import p251r.C3623h;
import p266s0.AbstractC3879i;
import p266s0.C3874d;
import p276sf.C3967n;
import ua.C4297h;

/* JADX INFO: renamed from: wb.aa */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4711aa implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f15737g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ SharedPreferences f15738h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Context f15739i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f15740j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f15741k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f15742l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4711aa(Context context, SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13) {
        this.f15737g = 0;
        this.f15739i = context;
        this.f15738h = sharedPreferences;
        this.f15740j = interfaceC1809a1;
        this.f15741k = interfaceC1809a12;
        this.f15742l = interfaceC1809a13;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) throws JSONException {
        int size;
        String str;
        switch (this.f15737g) {
            case 0:
                ((C1808a0) obj).getClass();
                ScriptPluginRuntime scriptPluginRuntime = ScriptPluginRuntime.INSTANCE;
                Context context = this.f15739i;
                return new C4758bo(scriptPluginRuntime.subscribePluginCatalog(context, new C4977id(0, context, this.f15738h, this.f15740j, this.f15741k, this.f15742l)), 0);
            case 1:
                Integer num = (Integer) obj;
                int iIntValue = num.intValue();
                this.f15740j.setValue(num);
                InterfaceC1809a1 interfaceC1809a1 = this.f15741k;
                interfaceC1809a1.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                SharedPreferences sharedPreferences = this.f15738h;
                sharedPreferences.edit().putInt("hb_notify_sound_mode", iIntValue).putString("hb_notify_sound_uri", HttpUrl.FRAGMENT_ENCODE_SET).apply();
                this.f15742l.setValue(null);
                Context context2 = this.f15739i;
                Activity activity = context2 instanceof Activity ? (Activity) context2 : null;
                if (activity == null) {
                    Toast.makeText(context2, "当前页面无法打开铃声选择器", 0).show();
                } else {
                    C0524k c0524k = new C0524k(sharedPreferences, context2, interfaceC1809a1, iIntValue);
                    if (iIntValue == 1) {
                        C5417vq.f21502a.m9755c(activity, c0524k);
                    } else {
                        C5417vq.f21502a.m9756d(activity, (String) interfaceC1809a1.getValue(), c0524k);
                    }
                }
                return C3967n.f12976a;
            case 2:
                List list = (List) obj;
                list.getClass();
                HashSet hashSet = new HashSet();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    hashSet.add(((C4297h) it.next()).f14288a);
                }
                InterfaceC1809a1 interfaceC1809a12 = this.f15740j;
                List list2 = (List) interfaceC1809a12.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    if (!hashSet.contains(((C4297h) obj2).f14288a)) {
                        arrayList.add(obj2);
                    }
                }
                interfaceC1809a12.setValue(arrayList);
                AbstractC4955ho.m9358J(this.f15738h, this.f15741k, interfaceC1809a12, this.f15742l, null, (List) interfaceC1809a12.getValue(), null, 80);
                size = list.size();
                str = " 个适用聊天";
                break;
            case 3:
                C3623h c3623h = (C3623h) obj;
                c3623h.getClass();
                C3623h.m7604a(c3623h, null, AbstractC5193p0.f19547B2, 3);
                SharedPreferences sharedPreferences2 = this.f15738h;
                InterfaceC1809a1 interfaceC1809a13 = this.f15740j;
                InterfaceC1809a1 interfaceC1809a14 = this.f15741k;
                C3623h.m7604a(c3623h, null, new C3874d(-1434247720, new C5332t7(sharedPreferences2, interfaceC1809a13, interfaceC1809a14, 12), true), 3);
                if (((Boolean) interfaceC1809a13.getValue()).booleanValue()) {
                    C3623h.m7604a(c3623h, null, AbstractC5193p0.f19554C2, 3);
                    final Context context3 = this.f15739i;
                    final InterfaceC1809a1 interfaceC1809a15 = this.f15742l;
                    C3623h.m7604a(c3623h, null, new C3874d(-1505187021, new C5170oa(context3, interfaceC1809a15, 4), true), 3);
                    if (((Boolean) interfaceC1809a14.getValue()).booleanValue()) {
                        C3623h.m7604a(c3623h, null, AbstractC5193p0.f19561D2, 3);
                        C3623h.m7604a(c3623h, null, new C3874d(1401782990, new C5170oa(context3, interfaceC1809a15, 5), true), 3);
                    }
                    EnumC0221a[] enumC0221aArrValues = EnumC0221a.values();
                    ArrayList<EnumC0221a> arrayList2 = new ArrayList();
                    for (EnumC0221a enumC0221a : enumC0221aArrValues) {
                        if (enumC0221a != EnumC0221a.GENERAL) {
                            arrayList2.add(enumC0221a);
                        }
                    }
                    for (final EnumC0221a enumC0221a2 : arrayList2) {
                        C3623h.m7604a(c3623h, null, new C3874d(-758334516, new C0976h(enumC0221a2, 12), true), 3);
                        final int i9 = 0;
                        C3623h.m7604a(c3623h, null, new C3874d(-1846076605, new InterfaceC1236q() { // from class: wb.zm
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p085fg.InterfaceC1236q
                            /* JADX INFO: renamed from: b */
                            public final Object mo734b(Object obj3, Object obj4, Object obj5) {
                                int i10 = i9;
                                C1836h0 c1836h0 = (C1836h0) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                ((C3619d) obj3).getClass();
                                int i11 = iIntValue2 & 17;
                                switch (i10) {
                                    case 0:
                                        if (c1836h0.m4516S(iIntValue2 & 1, i11 != 16)) {
                                            final int i12 = 0;
                                            final EnumC0221a enumC0221a3 = enumC0221a2;
                                            final Context context4 = context3;
                                            final InterfaceC1809a1 interfaceC1809a16 = interfaceC1809a15;
                                            AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(988680036, new InterfaceC1235p() { // from class: wb.q8
                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                @Override // p085fg.InterfaceC1235p
                                                public final Object invoke(Object obj6, Object obj7) {
                                                    switch (i12) {
                                                        case 0:
                                                            C1836h0 c1836h02 = (C1836h0) obj6;
                                                            int iIntValue3 = ((Integer) obj7).intValue();
                                                            if (c1836h02.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                EnumC0221a enumC0221a4 = EnumC0221a.SYSTEM;
                                                                C0014a c0014a = EnumC0234n.f608l;
                                                                EnumC0221a enumC0221a5 = enumC0221a3;
                                                                Context context5 = context4;
                                                                InterfaceC1809a1 interfaceC1809a17 = interfaceC1809a16;
                                                                C1823e c1823e = C1851l.f6155a;
                                                                if (enumC0221a5 == enumC0221a4) {
                                                                    c1836h02.m4525a0(-1118681774);
                                                                    c0014a.getClass();
                                                                    EnumC0234n enumC0234nM169E = C0014a.m169E(enumC0221a5, false, false);
                                                                    int iM9551g2 = AbstractC4955ho.m9551g2(interfaceC1809a17);
                                                                    Object objM4514P = c1836h02.m4514P();
                                                                    if (objM4514P == c1823e) {
                                                                        objM4514P = new C5070l9(interfaceC1809a17, 29);
                                                                        c1836h02.m4545k0(objM4514P);
                                                                    }
                                                                    AbstractC4955ho.m9533e2(context5, enumC0234nM169E, iM9551g2, (InterfaceC1220a) objM4514P, c1836h02, 3072);
                                                                    c1836h02.m4553p(false);
                                                                } else {
                                                                    c1836h02.m4525a0(-1118335721);
                                                                    c0014a.getClass();
                                                                    EnumC0234n enumC0234nM169E2 = C0014a.m169E(enumC0221a5, false, false);
                                                                    int iM9551g22 = AbstractC4955ho.m9551g2(interfaceC1809a17);
                                                                    Object objM4514P2 = c1836h02.m4514P();
                                                                    if (objM4514P2 == c1823e) {
                                                                        objM4514P2 = new C5371ud(interfaceC1809a17, 0);
                                                                        c1836h02.m4545k0(objM4514P2);
                                                                    }
                                                                    AbstractC4955ho.m9533e2(context5, enumC0234nM169E2, iM9551g22, (InterfaceC1220a) objM4514P2, c1836h02, 3072);
                                                                    AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                                                    EnumC0234n enumC0234nM169E3 = C0014a.m169E(enumC0221a5, true, false);
                                                                    int iIntValue4 = ((Number) interfaceC1809a17.getValue()).intValue();
                                                                    Object objM4514P3 = c1836h02.m4514P();
                                                                    if (objM4514P3 == c1823e) {
                                                                        objM4514P3 = new C5371ud(interfaceC1809a17, 1);
                                                                        c1836h02.m4545k0(objM4514P3);
                                                                    }
                                                                    AbstractC4955ho.m9533e2(context5, enumC0234nM169E3, iIntValue4, (InterfaceC1220a) objM4514P3, c1836h02, 3072);
                                                                    c1836h02.m4553p(false);
                                                                }
                                                            } else {
                                                                c1836h02.m4519V();
                                                            }
                                                            break;
                                                        default:
                                                            C1836h0 c1836h03 = (C1836h0) obj6;
                                                            int iIntValue5 = ((Integer) obj7).intValue();
                                                            if (c1836h03.m4516S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                                                EnumC0221a enumC0221a6 = EnumC0221a.SYSTEM;
                                                                C0014a c0014a2 = EnumC0234n.f608l;
                                                                EnumC0221a enumC0221a7 = enumC0221a3;
                                                                Context context6 = context4;
                                                                InterfaceC1809a1 interfaceC1809a18 = interfaceC1809a16;
                                                                C1823e c1823e2 = C1851l.f6155a;
                                                                if (enumC0221a7 == enumC0221a6) {
                                                                    c1836h03.m4525a0(-39514889);
                                                                    c0014a2.getClass();
                                                                    EnumC0234n enumC0234nM169E4 = C0014a.m169E(enumC0221a7, false, true);
                                                                    int iM9551g23 = AbstractC4955ho.m9551g2(interfaceC1809a18);
                                                                    Object objM4514P4 = c1836h03.m4514P();
                                                                    if (objM4514P4 == c1823e2) {
                                                                        objM4514P4 = new C5371ud(interfaceC1809a18, 2);
                                                                        c1836h03.m4545k0(objM4514P4);
                                                                    }
                                                                    AbstractC4955ho.m9533e2(context6, enumC0234nM169E4, iM9551g23, (InterfaceC1220a) objM4514P4, c1836h03, 3072);
                                                                    c1836h03.m4553p(false);
                                                                } else {
                                                                    c1836h03.m4525a0(-39145307);
                                                                    c0014a2.getClass();
                                                                    EnumC0234n enumC0234nM169E5 = C0014a.m169E(enumC0221a7, false, true);
                                                                    int iM9551g24 = AbstractC4955ho.m9551g2(interfaceC1809a18);
                                                                    Object objM4514P5 = c1836h03.m4514P();
                                                                    if (objM4514P5 == c1823e2) {
                                                                        objM4514P5 = new C5371ud(interfaceC1809a18, 3);
                                                                        c1836h03.m4545k0(objM4514P5);
                                                                    }
                                                                    AbstractC4955ho.m9533e2(context6, enumC0234nM169E5, iM9551g24, (InterfaceC1220a) objM4514P5, c1836h03, 3072);
                                                                    AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                                    EnumC0234n enumC0234nM169E6 = C0014a.m169E(enumC0221a7, true, true);
                                                                    int iIntValue6 = ((Number) interfaceC1809a18.getValue()).intValue();
                                                                    Object objM4514P6 = c1836h03.m4514P();
                                                                    if (objM4514P6 == c1823e2) {
                                                                        objM4514P6 = new C5371ud(interfaceC1809a18, 4);
                                                                        c1836h03.m4545k0(objM4514P6);
                                                                    }
                                                                    AbstractC4955ho.m9533e2(context6, enumC0234nM169E6, iIntValue6, (InterfaceC1220a) objM4514P6, c1836h03, 3072);
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
                                        if (c1836h0.m4516S(iIntValue2 & 1, i11 != 16)) {
                                            final int i13 = 1;
                                            final EnumC0221a enumC0221a4 = enumC0221a2;
                                            final Context context5 = context3;
                                            final InterfaceC1809a1 interfaceC1809a17 = interfaceC1809a15;
                                            AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(1904916360, new InterfaceC1235p() { // from class: wb.q8
                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                @Override // p085fg.InterfaceC1235p
                                                public final Object invoke(Object obj6, Object obj7) {
                                                    switch (i13) {
                                                        case 0:
                                                            C1836h0 c1836h02 = (C1836h0) obj6;
                                                            int iIntValue3 = ((Integer) obj7).intValue();
                                                            if (c1836h02.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                EnumC0221a enumC0221a42 = EnumC0221a.SYSTEM;
                                                                C0014a c0014a = EnumC0234n.f608l;
                                                                EnumC0221a enumC0221a5 = enumC0221a4;
                                                                Context context52 = context5;
                                                                InterfaceC1809a1 interfaceC1809a172 = interfaceC1809a17;
                                                                C1823e c1823e = C1851l.f6155a;
                                                                if (enumC0221a5 == enumC0221a42) {
                                                                    c1836h02.m4525a0(-1118681774);
                                                                    c0014a.getClass();
                                                                    EnumC0234n enumC0234nM169E = C0014a.m169E(enumC0221a5, false, false);
                                                                    int iM9551g2 = AbstractC4955ho.m9551g2(interfaceC1809a172);
                                                                    Object objM4514P = c1836h02.m4514P();
                                                                    if (objM4514P == c1823e) {
                                                                        objM4514P = new C5070l9(interfaceC1809a172, 29);
                                                                        c1836h02.m4545k0(objM4514P);
                                                                    }
                                                                    AbstractC4955ho.m9533e2(context52, enumC0234nM169E, iM9551g2, (InterfaceC1220a) objM4514P, c1836h02, 3072);
                                                                    c1836h02.m4553p(false);
                                                                } else {
                                                                    c1836h02.m4525a0(-1118335721);
                                                                    c0014a.getClass();
                                                                    EnumC0234n enumC0234nM169E2 = C0014a.m169E(enumC0221a5, false, false);
                                                                    int iM9551g22 = AbstractC4955ho.m9551g2(interfaceC1809a172);
                                                                    Object objM4514P2 = c1836h02.m4514P();
                                                                    if (objM4514P2 == c1823e) {
                                                                        objM4514P2 = new C5371ud(interfaceC1809a172, 0);
                                                                        c1836h02.m4545k0(objM4514P2);
                                                                    }
                                                                    AbstractC4955ho.m9533e2(context52, enumC0234nM169E2, iM9551g22, (InterfaceC1220a) objM4514P2, c1836h02, 3072);
                                                                    AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                                                    EnumC0234n enumC0234nM169E3 = C0014a.m169E(enumC0221a5, true, false);
                                                                    int iIntValue4 = ((Number) interfaceC1809a172.getValue()).intValue();
                                                                    Object objM4514P3 = c1836h02.m4514P();
                                                                    if (objM4514P3 == c1823e) {
                                                                        objM4514P3 = new C5371ud(interfaceC1809a172, 1);
                                                                        c1836h02.m4545k0(objM4514P3);
                                                                    }
                                                                    AbstractC4955ho.m9533e2(context52, enumC0234nM169E3, iIntValue4, (InterfaceC1220a) objM4514P3, c1836h02, 3072);
                                                                    c1836h02.m4553p(false);
                                                                }
                                                            } else {
                                                                c1836h02.m4519V();
                                                            }
                                                            break;
                                                        default:
                                                            C1836h0 c1836h03 = (C1836h0) obj6;
                                                            int iIntValue5 = ((Integer) obj7).intValue();
                                                            if (c1836h03.m4516S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                                                EnumC0221a enumC0221a6 = EnumC0221a.SYSTEM;
                                                                C0014a c0014a2 = EnumC0234n.f608l;
                                                                EnumC0221a enumC0221a7 = enumC0221a4;
                                                                Context context6 = context5;
                                                                InterfaceC1809a1 interfaceC1809a18 = interfaceC1809a17;
                                                                C1823e c1823e2 = C1851l.f6155a;
                                                                if (enumC0221a7 == enumC0221a6) {
                                                                    c1836h03.m4525a0(-39514889);
                                                                    c0014a2.getClass();
                                                                    EnumC0234n enumC0234nM169E4 = C0014a.m169E(enumC0221a7, false, true);
                                                                    int iM9551g23 = AbstractC4955ho.m9551g2(interfaceC1809a18);
                                                                    Object objM4514P4 = c1836h03.m4514P();
                                                                    if (objM4514P4 == c1823e2) {
                                                                        objM4514P4 = new C5371ud(interfaceC1809a18, 2);
                                                                        c1836h03.m4545k0(objM4514P4);
                                                                    }
                                                                    AbstractC4955ho.m9533e2(context6, enumC0234nM169E4, iM9551g23, (InterfaceC1220a) objM4514P4, c1836h03, 3072);
                                                                    c1836h03.m4553p(false);
                                                                } else {
                                                                    c1836h03.m4525a0(-39145307);
                                                                    c0014a2.getClass();
                                                                    EnumC0234n enumC0234nM169E5 = C0014a.m169E(enumC0221a7, false, true);
                                                                    int iM9551g24 = AbstractC4955ho.m9551g2(interfaceC1809a18);
                                                                    Object objM4514P5 = c1836h03.m4514P();
                                                                    if (objM4514P5 == c1823e2) {
                                                                        objM4514P5 = new C5371ud(interfaceC1809a18, 3);
                                                                        c1836h03.m4545k0(objM4514P5);
                                                                    }
                                                                    AbstractC4955ho.m9533e2(context6, enumC0234nM169E5, iM9551g24, (InterfaceC1220a) objM4514P5, c1836h03, 3072);
                                                                    AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                                    EnumC0234n enumC0234nM169E6 = C0014a.m169E(enumC0221a7, true, true);
                                                                    int iIntValue6 = ((Number) interfaceC1809a18.getValue()).intValue();
                                                                    Object objM4514P6 = c1836h03.m4514P();
                                                                    if (objM4514P6 == c1823e2) {
                                                                        objM4514P6 = new C5371ud(interfaceC1809a18, 4);
                                                                        c1836h03.m4545k0(objM4514P6);
                                                                    }
                                                                    AbstractC4955ho.m9533e2(context6, enumC0234nM169E6, iIntValue6, (InterfaceC1220a) objM4514P6, c1836h03, 3072);
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
                        if (((Boolean) interfaceC1809a14.getValue()).booleanValue()) {
                            final int i10 = 1;
                            C3623h.m7604a(c3623h, null, new C3874d(-940215193, new InterfaceC1236q() { // from class: wb.zm
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // p085fg.InterfaceC1236q
                                /* JADX INFO: renamed from: b */
                                public final Object mo734b(Object obj3, Object obj4, Object obj5) {
                                    int i102 = i10;
                                    C1836h0 c1836h0 = (C1836h0) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    ((C3619d) obj3).getClass();
                                    int i11 = iIntValue2 & 17;
                                    switch (i102) {
                                        case 0:
                                            if (c1836h0.m4516S(iIntValue2 & 1, i11 != 16)) {
                                                final int i12 = 0;
                                                final EnumC0221a enumC0221a3 = enumC0221a2;
                                                final Context context4 = context3;
                                                final InterfaceC1809a1 interfaceC1809a16 = interfaceC1809a15;
                                                AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(988680036, new InterfaceC1235p() { // from class: wb.q8
                                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                    @Override // p085fg.InterfaceC1235p
                                                    public final Object invoke(Object obj6, Object obj7) {
                                                        switch (i12) {
                                                            case 0:
                                                                C1836h0 c1836h02 = (C1836h0) obj6;
                                                                int iIntValue3 = ((Integer) obj7).intValue();
                                                                if (c1836h02.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                    EnumC0221a enumC0221a42 = EnumC0221a.SYSTEM;
                                                                    C0014a c0014a = EnumC0234n.f608l;
                                                                    EnumC0221a enumC0221a5 = enumC0221a3;
                                                                    Context context52 = context4;
                                                                    InterfaceC1809a1 interfaceC1809a172 = interfaceC1809a16;
                                                                    C1823e c1823e = C1851l.f6155a;
                                                                    if (enumC0221a5 == enumC0221a42) {
                                                                        c1836h02.m4525a0(-1118681774);
                                                                        c0014a.getClass();
                                                                        EnumC0234n enumC0234nM169E = C0014a.m169E(enumC0221a5, false, false);
                                                                        int iM9551g2 = AbstractC4955ho.m9551g2(interfaceC1809a172);
                                                                        Object objM4514P = c1836h02.m4514P();
                                                                        if (objM4514P == c1823e) {
                                                                            objM4514P = new C5070l9(interfaceC1809a172, 29);
                                                                            c1836h02.m4545k0(objM4514P);
                                                                        }
                                                                        AbstractC4955ho.m9533e2(context52, enumC0234nM169E, iM9551g2, (InterfaceC1220a) objM4514P, c1836h02, 3072);
                                                                        c1836h02.m4553p(false);
                                                                    } else {
                                                                        c1836h02.m4525a0(-1118335721);
                                                                        c0014a.getClass();
                                                                        EnumC0234n enumC0234nM169E2 = C0014a.m169E(enumC0221a5, false, false);
                                                                        int iM9551g22 = AbstractC4955ho.m9551g2(interfaceC1809a172);
                                                                        Object objM4514P2 = c1836h02.m4514P();
                                                                        if (objM4514P2 == c1823e) {
                                                                            objM4514P2 = new C5371ud(interfaceC1809a172, 0);
                                                                            c1836h02.m4545k0(objM4514P2);
                                                                        }
                                                                        AbstractC4955ho.m9533e2(context52, enumC0234nM169E2, iM9551g22, (InterfaceC1220a) objM4514P2, c1836h02, 3072);
                                                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                                                        EnumC0234n enumC0234nM169E3 = C0014a.m169E(enumC0221a5, true, false);
                                                                        int iIntValue4 = ((Number) interfaceC1809a172.getValue()).intValue();
                                                                        Object objM4514P3 = c1836h02.m4514P();
                                                                        if (objM4514P3 == c1823e) {
                                                                            objM4514P3 = new C5371ud(interfaceC1809a172, 1);
                                                                            c1836h02.m4545k0(objM4514P3);
                                                                        }
                                                                        AbstractC4955ho.m9533e2(context52, enumC0234nM169E3, iIntValue4, (InterfaceC1220a) objM4514P3, c1836h02, 3072);
                                                                        c1836h02.m4553p(false);
                                                                    }
                                                                } else {
                                                                    c1836h02.m4519V();
                                                                }
                                                                break;
                                                            default:
                                                                C1836h0 c1836h03 = (C1836h0) obj6;
                                                                int iIntValue5 = ((Integer) obj7).intValue();
                                                                if (c1836h03.m4516S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                                                    EnumC0221a enumC0221a6 = EnumC0221a.SYSTEM;
                                                                    C0014a c0014a2 = EnumC0234n.f608l;
                                                                    EnumC0221a enumC0221a7 = enumC0221a3;
                                                                    Context context6 = context4;
                                                                    InterfaceC1809a1 interfaceC1809a18 = interfaceC1809a16;
                                                                    C1823e c1823e2 = C1851l.f6155a;
                                                                    if (enumC0221a7 == enumC0221a6) {
                                                                        c1836h03.m4525a0(-39514889);
                                                                        c0014a2.getClass();
                                                                        EnumC0234n enumC0234nM169E4 = C0014a.m169E(enumC0221a7, false, true);
                                                                        int iM9551g23 = AbstractC4955ho.m9551g2(interfaceC1809a18);
                                                                        Object objM4514P4 = c1836h03.m4514P();
                                                                        if (objM4514P4 == c1823e2) {
                                                                            objM4514P4 = new C5371ud(interfaceC1809a18, 2);
                                                                            c1836h03.m4545k0(objM4514P4);
                                                                        }
                                                                        AbstractC4955ho.m9533e2(context6, enumC0234nM169E4, iM9551g23, (InterfaceC1220a) objM4514P4, c1836h03, 3072);
                                                                        c1836h03.m4553p(false);
                                                                    } else {
                                                                        c1836h03.m4525a0(-39145307);
                                                                        c0014a2.getClass();
                                                                        EnumC0234n enumC0234nM169E5 = C0014a.m169E(enumC0221a7, false, true);
                                                                        int iM9551g24 = AbstractC4955ho.m9551g2(interfaceC1809a18);
                                                                        Object objM4514P5 = c1836h03.m4514P();
                                                                        if (objM4514P5 == c1823e2) {
                                                                            objM4514P5 = new C5371ud(interfaceC1809a18, 3);
                                                                            c1836h03.m4545k0(objM4514P5);
                                                                        }
                                                                        AbstractC4955ho.m9533e2(context6, enumC0234nM169E5, iM9551g24, (InterfaceC1220a) objM4514P5, c1836h03, 3072);
                                                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                                        EnumC0234n enumC0234nM169E6 = C0014a.m169E(enumC0221a7, true, true);
                                                                        int iIntValue6 = ((Number) interfaceC1809a18.getValue()).intValue();
                                                                        Object objM4514P6 = c1836h03.m4514P();
                                                                        if (objM4514P6 == c1823e2) {
                                                                            objM4514P6 = new C5371ud(interfaceC1809a18, 4);
                                                                            c1836h03.m4545k0(objM4514P6);
                                                                        }
                                                                        AbstractC4955ho.m9533e2(context6, enumC0234nM169E6, iIntValue6, (InterfaceC1220a) objM4514P6, c1836h03, 3072);
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
                                            if (c1836h0.m4516S(iIntValue2 & 1, i11 != 16)) {
                                                final int i13 = 1;
                                                final EnumC0221a enumC0221a4 = enumC0221a2;
                                                final Context context5 = context3;
                                                final InterfaceC1809a1 interfaceC1809a17 = interfaceC1809a15;
                                                AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(1904916360, new InterfaceC1235p() { // from class: wb.q8
                                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                    @Override // p085fg.InterfaceC1235p
                                                    public final Object invoke(Object obj6, Object obj7) {
                                                        switch (i13) {
                                                            case 0:
                                                                C1836h0 c1836h02 = (C1836h0) obj6;
                                                                int iIntValue3 = ((Integer) obj7).intValue();
                                                                if (c1836h02.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                    EnumC0221a enumC0221a42 = EnumC0221a.SYSTEM;
                                                                    C0014a c0014a = EnumC0234n.f608l;
                                                                    EnumC0221a enumC0221a5 = enumC0221a4;
                                                                    Context context52 = context5;
                                                                    InterfaceC1809a1 interfaceC1809a172 = interfaceC1809a17;
                                                                    C1823e c1823e = C1851l.f6155a;
                                                                    if (enumC0221a5 == enumC0221a42) {
                                                                        c1836h02.m4525a0(-1118681774);
                                                                        c0014a.getClass();
                                                                        EnumC0234n enumC0234nM169E = C0014a.m169E(enumC0221a5, false, false);
                                                                        int iM9551g2 = AbstractC4955ho.m9551g2(interfaceC1809a172);
                                                                        Object objM4514P = c1836h02.m4514P();
                                                                        if (objM4514P == c1823e) {
                                                                            objM4514P = new C5070l9(interfaceC1809a172, 29);
                                                                            c1836h02.m4545k0(objM4514P);
                                                                        }
                                                                        AbstractC4955ho.m9533e2(context52, enumC0234nM169E, iM9551g2, (InterfaceC1220a) objM4514P, c1836h02, 3072);
                                                                        c1836h02.m4553p(false);
                                                                    } else {
                                                                        c1836h02.m4525a0(-1118335721);
                                                                        c0014a.getClass();
                                                                        EnumC0234n enumC0234nM169E2 = C0014a.m169E(enumC0221a5, false, false);
                                                                        int iM9551g22 = AbstractC4955ho.m9551g2(interfaceC1809a172);
                                                                        Object objM4514P2 = c1836h02.m4514P();
                                                                        if (objM4514P2 == c1823e) {
                                                                            objM4514P2 = new C5371ud(interfaceC1809a172, 0);
                                                                            c1836h02.m4545k0(objM4514P2);
                                                                        }
                                                                        AbstractC4955ho.m9533e2(context52, enumC0234nM169E2, iM9551g22, (InterfaceC1220a) objM4514P2, c1836h02, 3072);
                                                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                                                        EnumC0234n enumC0234nM169E3 = C0014a.m169E(enumC0221a5, true, false);
                                                                        int iIntValue4 = ((Number) interfaceC1809a172.getValue()).intValue();
                                                                        Object objM4514P3 = c1836h02.m4514P();
                                                                        if (objM4514P3 == c1823e) {
                                                                            objM4514P3 = new C5371ud(interfaceC1809a172, 1);
                                                                            c1836h02.m4545k0(objM4514P3);
                                                                        }
                                                                        AbstractC4955ho.m9533e2(context52, enumC0234nM169E3, iIntValue4, (InterfaceC1220a) objM4514P3, c1836h02, 3072);
                                                                        c1836h02.m4553p(false);
                                                                    }
                                                                } else {
                                                                    c1836h02.m4519V();
                                                                }
                                                                break;
                                                            default:
                                                                C1836h0 c1836h03 = (C1836h0) obj6;
                                                                int iIntValue5 = ((Integer) obj7).intValue();
                                                                if (c1836h03.m4516S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                                                    EnumC0221a enumC0221a6 = EnumC0221a.SYSTEM;
                                                                    C0014a c0014a2 = EnumC0234n.f608l;
                                                                    EnumC0221a enumC0221a7 = enumC0221a4;
                                                                    Context context6 = context5;
                                                                    InterfaceC1809a1 interfaceC1809a18 = interfaceC1809a17;
                                                                    C1823e c1823e2 = C1851l.f6155a;
                                                                    if (enumC0221a7 == enumC0221a6) {
                                                                        c1836h03.m4525a0(-39514889);
                                                                        c0014a2.getClass();
                                                                        EnumC0234n enumC0234nM169E4 = C0014a.m169E(enumC0221a7, false, true);
                                                                        int iM9551g23 = AbstractC4955ho.m9551g2(interfaceC1809a18);
                                                                        Object objM4514P4 = c1836h03.m4514P();
                                                                        if (objM4514P4 == c1823e2) {
                                                                            objM4514P4 = new C5371ud(interfaceC1809a18, 2);
                                                                            c1836h03.m4545k0(objM4514P4);
                                                                        }
                                                                        AbstractC4955ho.m9533e2(context6, enumC0234nM169E4, iM9551g23, (InterfaceC1220a) objM4514P4, c1836h03, 3072);
                                                                        c1836h03.m4553p(false);
                                                                    } else {
                                                                        c1836h03.m4525a0(-39145307);
                                                                        c0014a2.getClass();
                                                                        EnumC0234n enumC0234nM169E5 = C0014a.m169E(enumC0221a7, false, true);
                                                                        int iM9551g24 = AbstractC4955ho.m9551g2(interfaceC1809a18);
                                                                        Object objM4514P5 = c1836h03.m4514P();
                                                                        if (objM4514P5 == c1823e2) {
                                                                            objM4514P5 = new C5371ud(interfaceC1809a18, 3);
                                                                            c1836h03.m4545k0(objM4514P5);
                                                                        }
                                                                        AbstractC4955ho.m9533e2(context6, enumC0234nM169E5, iM9551g24, (InterfaceC1220a) objM4514P5, c1836h03, 3072);
                                                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                                        EnumC0234n enumC0234nM169E6 = C0014a.m169E(enumC0221a7, true, true);
                                                                        int iIntValue6 = ((Number) interfaceC1809a18.getValue()).intValue();
                                                                        Object objM4514P6 = c1836h03.m4514P();
                                                                        if (objM4514P6 == c1823e2) {
                                                                            objM4514P6 = new C5371ud(interfaceC1809a18, 4);
                                                                            c1836h03.m4545k0(objM4514P6);
                                                                        }
                                                                        AbstractC4955ho.m9533e2(context6, enumC0234nM169E6, iIntValue6, (InterfaceC1220a) objM4514P6, c1836h03, 3072);
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
                        }
                    }
                }
                return C3967n.f12976a;
            default:
                List list3 = (List) obj;
                list3.getClass();
                HashSet hashSet2 = new HashSet();
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    hashSet2.add(((C2921i) it2.next()).f9493a);
                }
                InterfaceC1809a1 interfaceC1809a16 = this.f15740j;
                List list4 = (List) interfaceC1809a16.getValue();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : list4) {
                    if (!hashSet2.contains(((C2921i) obj3).f9493a)) {
                        arrayList3.add(obj3);
                    }
                }
                interfaceC1809a16.setValue(arrayList3);
                AbstractC4955ho.m9481Y2(this.f15738h, this.f15741k, interfaceC1809a16, this.f15742l, null, arrayList3, null, 80);
                size = list3.size();
                str = " 个适用聊天";
                break;
        }
        AbstractC4855en.m9271o("已删除 ", size, str, this.f15739i, 0);
        return C3967n.f12976a;
    }

    public /* synthetic */ C4711aa(int i9, Context context, SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13) {
        this.f15737g = i9;
        this.f15739i = context;
        this.f15740j = interfaceC1809a1;
        this.f15738h = sharedPreferences;
        this.f15741k = interfaceC1809a12;
        this.f15742l = interfaceC1809a13;
    }

    public /* synthetic */ C4711aa(SharedPreferences sharedPreferences, Context context, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13) {
        this.f15737g = 1;
        this.f15738h = sharedPreferences;
        this.f15739i = context;
        this.f15740j = interfaceC1809a1;
        this.f15741k = interfaceC1809a12;
        this.f15742l = interfaceC1809a13;
    }

    public /* synthetic */ C4711aa(SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, Context context, InterfaceC1809a1 interfaceC1809a13) {
        this.f15737g = 3;
        this.f15738h = sharedPreferences;
        this.f15740j = interfaceC1809a1;
        this.f15741k = interfaceC1809a12;
        this.f15739i = context;
        this.f15742l = interfaceC1809a13;
    }
}
