package p126ia;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;
import gg.AbstractC1416l;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import ng.C3004b;
import ng.C3011i;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p011ab.C0042b;
import p020b5.C0184c;
import p036c9.C0415a0;
import p036c9.C0454k;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1231l;
import p096g8.C1368i;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p119i2.C1955z;
import p142jg.AbstractC2133a;
import p142jg.AbstractC2136d;
import p144k.C2209s1;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p230p8.C3360l;
import p276sf.C3958e;
import p276sf.C3959f;
import p276sf.C3967n;
import p300ub.AbstractC4302b;
import p304uf.C4329c;
import p332wb.AbstractC4855en;
import p332wb.C5026jv;
import p332wb.C5491y2;
import tf.AbstractC4165l;
import tf.AbstractC4166m;
import tf.C4173t;
import tf.C4175v;

/* JADX INFO: renamed from: ia.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2023q {

    /* JADX INFO: renamed from: f */
    public static final String[] f6839f = {"林", "陈", "周", "吴", "许", "沈", "顾", "江", "苏", "叶", "陆", "夏", "宋", "唐", "程", "韩", "乔", "余", "温", "方"};

    /* JADX INFO: renamed from: g */
    public static final String[] f6840g = {"安", "宁", "然", "辰", "希", "言", "清", "予", "景", "知", "一", "若", "雨", "星", "月", "晨", "乐", "念", "可", "禾"};

    /* JADX INFO: renamed from: a */
    public final C0184c f6841a;

    /* JADX INFO: renamed from: b */
    public final C2007a0 f6842b;

    /* JADX INFO: renamed from: c */
    public final C0042b f6843c;

    /* JADX INFO: renamed from: d */
    public final SharedPreferences f6844d;

    /* JADX INFO: renamed from: e */
    public final ConcurrentHashMap f6845e = new ConcurrentHashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2023q(Context context, C0184c c0184c, C2007a0 c2007a0, C0042b c0042b) {
        this.f6841a = c0184c;
        this.f6842b = c2007a0;
        this.f6843c = c0042b;
        this.f6844d = AbstractC4302b.m8640c(context, "Hchat_moments_fake_interaction_config");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static String m4973c(long j3) {
        Object c3959f;
        try {
            c3959f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA).format(new Date(j3));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (c3959f instanceof C3959f) {
            c3959f = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return (String) c3959f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static String m4974f() {
        AbstractC2133a abstractC2133a = AbstractC2136d.f7122g;
        String str = (String) AbstractC4165l.m8370G0(f6839f);
        String[] strArr = f6840g;
        return AbstractC4855en.m9264h(str, (String) AbstractC4165l.m8370G0(strArr), AbstractC2136d.f7122g.mo5359f().nextBoolean() ? (String) AbstractC4165l.m8370G0(strArr) : HttpUrl.FRAGMENT_ENCODE_SET);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static void m4975j(Activity activity, String str) {
        Toast.makeText(activity, str, 0).show();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m4976a(C2008b c2008b) {
        Object c3959f;
        Object objPutIfAbsent;
        String str = c2008b.f6775c;
        String str2 = c2008b.f6774b;
        String string = AbstractC3149m.m6703R0(str).toString();
        if (string.length() > 0 && !AbstractC1416l.m3825a(string, str2)) {
            return string;
        }
        ConcurrentHashMap concurrentHashMap = this.f6845e;
        Object obj = concurrentHashMap.get(str2);
        if (obj == null) {
            try {
                C1368i c1368iContacts = WeChatApis.contacts();
                c3959f = c1368iContacts != null ? c1368iContacts.m3729r(str2) : null;
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            if (c3959f instanceof C3959f) {
                c3959f = null;
            }
            String str3 = (String) c3959f;
            if (str3 == null) {
                obj = str2;
                objPutIfAbsent = concurrentHashMap.putIfAbsent(str2, obj);
                if (objPutIfAbsent != null) {
                    obj = objPutIfAbsent;
                }
            } else {
                obj = Boolean.valueOf(AbstractC3149m.m6721t0(str3) ^ true).booleanValue() ? str3 : null;
                if (obj == null) {
                }
                objPutIfAbsent = concurrentHashMap.putIfAbsent(str2, obj);
                if (objPutIfAbsent != null) {
                }
            }
        }
        obj.getClass();
        return (String) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final List m4977b(List list) {
        SharedPreferences sharedPreferences = this.f6844d;
        Set<String> set = C4175v.f13712g;
        Set<String> stringSet = sharedPreferences.getStringSet("fake_like_excluded_ids", set);
        if (stringSet != null) {
            set = stringSet;
        }
        C3011i c3011i = new C3011i(AbstractC4166m.m8415m1(list), false, new C2022p(set, 0));
        C3004b c3004b = new C3004b(c3011i.iterator(), new C1955z(7));
        if (!c3004b.hasNext()) {
            return C4173t.f13710g;
        }
        Object next = c3004b.next();
        if (!c3004b.hasNext()) {
            return AbstractC0000a.m99x0(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (c3004b.hasNext()) {
            arrayList.add(c3004b.next());
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final List m4978d(List list, int i9, boolean z9, boolean z10) {
        List listM8403L1;
        int size;
        String str;
        String str2;
        int i10 = i9;
        if (i10 < 1) {
            i10 = 1;
        }
        if (z10) {
            listM8403L1 = C4173t.f13710g;
        } else {
            List listM8410S1 = AbstractC4166m.m8410S1(m4977b(list));
            Collections.shuffle(listM8410S1);
            listM8403L1 = AbstractC4166m.m8403L1(i10, listM8410S1);
        }
        if ((!z10 && !z9) || (size = i10 - listM8403L1.size()) < 0) {
            size = 0;
        }
        HashSet hashSet = new HashSet();
        Iterator it = listM8403L1.iterator();
        while (it.hasNext()) {
            hashSet.add(((C5026jv) it.next()).f18250b);
        }
        C4329c c4329cM7E = AbstractC0000a.m7E();
        for (int i11 = 0; i11 < size; i11++) {
            String strM4974f = m4974f();
            for (int i12 = 0; hashSet.contains(strM4974f) && i12 < 20; i12++) {
                strM4974f = m4974f();
            }
            if (hashSet.contains(strM4974f)) {
                int i13 = 1;
                do {
                    str2 = strM4974f + i13;
                    i13++;
                } while (hashSet.contains(str2));
                str = str2;
            } else {
                str = strM4974f;
            }
            hashSet.add(str);
            String string = UUID.randomUUID().toString();
            string.getClass();
            c4329cM7E.add(new C5026jv("wxid_hchat_fake_like_".concat(AbstractC3156t.m6737a0(string, "-", HttpUrl.FRAGMENT_ENCODE_SET, false)), str, false, null, null, null, false, AbstractC0000a.m99x0("虚拟点赞人"), 120));
        }
        ArrayList arrayListM8397F1 = AbstractC4166m.m8397F1(listM8403L1, AbstractC0000a.m90t(c4329cM7E));
        if (!this.f6844d.getBoolean("fake_like_random_order", false)) {
            return arrayListM8397F1;
        }
        List listM8410S12 = AbstractC4166m.m8410S1(arrayListM8397F1);
        Collections.shuffle(listM8410S12);
        return listM8410S12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m4979e(Activity activity, C3360l c3360l, int i9, int i10) {
        String str = c3360l.f10844a;
        if (str != null) {
            C0184c c0184c = this.f6841a;
            C2009c c2009cM815l = c0184c.m815l(str);
            ArrayList arrayListM8409R1 = AbstractC4166m.m8409R1(c2009cM815l.f6779b);
            if (i9 < 0 || i9 >= arrayListM8409R1.size() || i10 < 0 || i10 >= arrayListM8409R1.size()) {
                return;
            }
            arrayListM8409R1.add(i10, (C2008b) arrayListM8409R1.remove(i9));
            c0184c.m799Q(str, arrayListM8409R1);
            this.f6842b.m4947a(activity, c3360l, c2009cM815l);
            m4980g(activity, c3360l);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m4980g(Activity activity, C3360l c3360l) {
        activity.getClass();
        c3360l.getClass();
        String str = c3360l.f10844a;
        if (str != null) {
            List<C2008b> list = this.f6841a.m815l(str).f6779b;
            C4329c c4329cM7E = AbstractC0000a.m7E();
            c4329cM7E.add(new C3958e("新增伪评论", "选择好友、填写评论并设置评论时间"));
            for (C2008b c2008b : list) {
                c4329cM7E.add(new C3958e(AbstractC4855en.m9264h(m4976a(c2008b), " · ", m4973c(c2008b.f6777e)), c2008b.f6776d));
            }
            if (!list.isEmpty()) {
                c4329cM7E.add(new C3958e("清空伪评论", "移除该朋友圈的全部伪评论，恢复真实评论显示"));
            }
            C5491y2.m9811W1(activity, "朋友圈伪评论", list.isEmpty() ? "暂无伪评论" : AbstractC0921a.m2250m(list.size(), "共 ", " 条，列表顺序即显示顺序"), AbstractC0000a.m90t(c4329cM7E), new C0454k(this, activity, false, c3360l, list, 7), new C2209s1(7));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m4981h(Activity activity, C3360l c3360l, ArrayList arrayList, LinkedHashSet linkedHashSet, String str) {
        String str2 = c3360l.f10844a;
        if (str2 != null) {
            C5491y2.m9807U1(activity, AbstractC4166m.m8402K1(arrayList, new C0415a0(linkedHashSet, 20)), new C2016j(this, str2, activity, c3360l), new C2209s1(7), str, "保存", false, null, linkedHashSet, false, 1152);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m4982i(final Activity activity, final C3360l c3360l, List list, int i9, final boolean z9, final boolean z10) {
        Integer numValueOf;
        int iMin;
        int iIntValue;
        final List listM4977b = m4977b(list);
        if (listM4977b.isEmpty() && !z9) {
            m4975j(activity, "没有可选择的好友");
            return;
        }
        if (z9) {
            numValueOf = null;
        } else {
            int size = listM4977b.size();
            if (size < 1) {
                size = 1;
            }
            numValueOf = Integer.valueOf(size);
        }
        String str = z10 ? "凭空生成点赞数量" : "设置伪造点赞数量";
        Integer numValueOf2 = i9 > 0 ? Integer.valueOf(i9) : null;
        if (numValueOf2 != null) {
            iMin = numValueOf2.intValue();
            if (numValueOf != null && iMin > (iIntValue = numValueOf.intValue())) {
                iMin = iIntValue;
            }
        } else {
            iMin = 50;
            if (numValueOf != null) {
                iMin = Math.min(50, numValueOf.intValue());
            }
        }
        C5491y2.m9820a2(activity, str, iMin, 1, numValueOf, new InterfaceC1231l() { // from class: ia.k
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p085fg.InterfaceC1231l
            public final Object invoke(Object obj) {
                int iIntValue2 = ((Integer) obj).intValue();
                C2023q c2023q = this.f6806g;
                List list2 = listM4977b;
                boolean z11 = z9;
                boolean z12 = z10;
                List listM4978d = c2023q.m4978d(list2, iIntValue2, z11, z12);
                ArrayList arrayListM8397F1 = AbstractC4166m.m8397F1(listM4978d, list2);
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : arrayListM8397F1) {
                    if (hashSet.add(((C5026jv) obj2).f18249a)) {
                        arrayList.add(obj2);
                    }
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it = ((ArrayList) listM4978d).iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(((C5026jv) it.next()).f18249a);
                }
                c2023q.m4981h(activity, c3360l, arrayList, linkedHashSet, z12 ? "凭空生成伪集赞" : "随机伪集赞");
                return C3967n.f12976a;
            }
        }, new C2209s1(7));
    }
}
