package p287ta;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import na.C2913a;
import na.C2914b;
import na.C2920h;
import na.C2923k;
import okhttp3.HttpUrl;
import p007a7.AbstractC0018a;
import p020b5.C0184c;
import p082fd.C1211h;
import p099h.Hchat.crash.RunnableC1436e;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p136j8.C2105p;
import p142jg.AbstractC2136d;
import p153k8.C2343g;
import p162l3.C2458l;
import p210o8.C3086j;
import p222p.AbstractC3199a;
import p243q9.C3465a;
import p332wb.AbstractC4855en;

/* JADX INFO: renamed from: ta.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4140c {

    /* JADX INFO: renamed from: g */
    public static final String[] f13645g = {"{@发红包的人}", "{@sender}", "{@成员}"};

    /* JADX INFO: renamed from: a */
    public final C2458l f13646a;

    /* JADX INFO: renamed from: b */
    public final C2923k f13647b;

    /* JADX INFO: renamed from: c */
    public final C2914b f13648c;

    /* JADX INFO: renamed from: d */
    public final C2914b f13649d;

    /* JADX INFO: renamed from: e */
    public final C0184c f13650e;

    /* JADX INFO: renamed from: f */
    public final Random f13651f = new Random();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4140c(C2458l c2458l, C2923k c2923k, C2914b c2914b, C2914b c2914b2) {
        this.f13646a = c2458l;
        this.f13647b = c2923k;
        this.f13648c = c2914b;
        this.f13649d = c2914b2;
        this.f13650e = new C0184c(c2923k, c2458l, new C3465a(this, 8));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static boolean m8328f(int i9, String str, String str2, String str3, boolean z9) {
        C2343g c2343gM6844q = AbstractC3199a.m6844q();
        C2105p c2105pMedia = WeChatApis.media();
        switch (i9) {
            case 1:
                if (c2343gM6844q == null) {
                    return false;
                }
                if (!z9 || TextUtils.isEmpty(str3)) {
                    return c2343gM6844q.m5601x(str, str2);
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(str3);
                return c2343gM6844q.m5602y(str, str2, arrayList);
            case 2:
            default:
                return false;
            case 3:
                return c2105pMedia != null && c2105pMedia.m5301a(str, str2);
            case 4:
                return c2105pMedia != null && c2105pMedia.f7036b.m5324t(str, str2);
            case 5:
                return c2105pMedia != null && c2105pMedia.f7037c.m972q(str, str2);
            case 6:
                return c2105pMedia != null && c2105pMedia.f7038d.m5219v(str, str2);
            case 7:
                return c2105pMedia != null && c2105pMedia.f7039e.m588T(str, str2, HttpUrl.FRAGMENT_ENCODE_SET);
            case 8:
                return c2343gM6844q != null && c2343gM6844q.m5603z(str, str2);
            case 9:
                return c2105pMedia != null && c2105pMedia.f7040f.m5236A(str, str2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final ArrayList m8329a(String str, List list, String str2, String str3) {
        C1211h c1211h;
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C2920h c2920h = (C2920h) it.next();
                String strTrim = c2920h.f9490c;
                int i9 = c2920h.f9489b;
                boolean z9 = false;
                if (TextUtils.isEmpty(strTrim)) {
                    strTrim = HttpUrl.FRAGMENT_ENCODE_SET;
                } else {
                    try {
                        String[] strArrSplit = strTrim.split("\\|");
                        ArrayList arrayList2 = new ArrayList();
                        for (String str4 : strArrSplit) {
                            if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str4.trim())) {
                                arrayList2.add(str4.trim());
                            }
                        }
                        strTrim = arrayList2.isEmpty() ? strTrim.trim() : (String) arrayList2.get(this.f13651f.nextInt(arrayList2.size()));
                    } catch (Throwable unused) {
                    }
                }
                if (TextUtils.isEmpty(strTrim)) {
                    c1211h = null;
                } else {
                    boolean z10 = i9 == 2;
                    String[] strArr = f13645g;
                    if (z10) {
                        if (TextUtils.isEmpty(strTrim)) {
                            strTrim = AbstractC4855en.m9263g("{@发红包的人}", strTrim);
                        } else {
                            for (int i10 = 0; i10 < 3; i10++) {
                                if (strTrim.contains(strArr[i10])) {
                                    break;
                                }
                            }
                            strTrim = AbstractC4855en.m9263g("{@发红包的人}", strTrim);
                        }
                    }
                    if ((i9 == 1 || z10) && !TextUtils.isEmpty(strTrim)) {
                        int i11 = 0;
                        while (true) {
                            if (i11 >= 3) {
                                break;
                            }
                            if (strTrim.contains(strArr[i11])) {
                                z9 = true;
                                break;
                            }
                            i11++;
                        }
                    }
                    if (i9 == 1 || i9 == 2 || i9 == 8) {
                        strTrim = this.f13650e.m817n(strTrim, str, str2, str3);
                    }
                    c1211h = new C1211h(strTrim, z9);
                }
                if (c1211h != null && !TextUtils.isEmpty((String) c1211h.f4072h)) {
                    int i12 = i9 == 2 ? 1 : i9;
                    String str5 = (String) c1211h.f4072h;
                    boolean z11 = c1211h.f4071g;
                    long jMo5362e = c2920h.f9491d;
                    if (jMo5362e < 0) {
                        jMo5362e = 0;
                    }
                    Iterator it2 = it;
                    if (c2920h.f9492e) {
                        jMo5362e += AbstractC2136d.f7122g.mo5362e(0L, 2001L);
                    }
                    arrayList.add(new C4139b(i12, jMo5362e, str5, z11));
                    it = it2;
                }
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m8330b(String str) {
        C2914b c2914b = this.f13649d;
        if (c2914b != null) {
            c2914b.f9449h.m6327d(str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m8331c(String str, String str2, String str3, boolean z9) {
        boolean z10;
        try {
            C2458l c2458l = this.f13646a;
            c2458l.getClass();
            boolean z11 = false;
            try {
                z10 = c2458l.m5853b().getBoolean("hb_reply_enable", false);
            } catch (Throwable unused) {
                z10 = false;
            }
            if (z10) {
                boolean zIsEmpty = TextUtils.isEmpty(str);
                C2923k c2923k = this.f13647b;
                C2913a c2913a = !zIsEmpty ? (C2913a) c2923k.f9546i.get(str) : null;
                if (c2913a == null || c2913a.f9423b) {
                    if (!z9) {
                        boolean zIsEmpty2 = TextUtils.isEmpty(str);
                        String str4 = HttpUrl.FRAGMENT_ENCODE_SET;
                        if (!zIsEmpty2) {
                            String str5 = (String) c2923k.f9543f.get(str);
                            C2914b c2914b = this.f13648c;
                            String strM6324a = c2914b != null ? c2914b.f9449h.m6324a() : HttpUrl.FRAGMENT_ENCODE_SET;
                            if (!TextUtils.isEmpty(str5) && !TextUtils.isEmpty(strM6324a) && str5.equals(strM6324a)) {
                            }
                        }
                        String str6 = TextUtils.isEmpty(str) ? null : (String) c2923k.f9545h.get(str);
                        if (TextUtils.isEmpty(str6)) {
                            str6 = str2;
                        }
                        if (TextUtils.isEmpty(str6)) {
                            return;
                        }
                        if (!TextUtils.isEmpty(str6) && (str6.endsWith("@chatroom") || str6.endsWith("@im.chatroom"))) {
                            z11 = true;
                        }
                        ArrayList<C4139b> arrayListM8329a = m8329a(str3, m8332d(c2913a, z11), str6, str);
                        if (arrayListM8329a.isEmpty()) {
                            return;
                        }
                        C0184c c0184c = this.f13650e;
                        c0184c.getClass();
                        if (!TextUtils.isEmpty(str)) {
                            str4 = (String) ((C2923k) c0184c.f469a).f9544g.get(str);
                        }
                        String strM793K = c0184c.m793K(str, str4);
                        StringBuilder sb2 = new StringBuilder("redpacket_reply:");
                        sb2.append(TextUtils.isEmpty(str) ? str6 + ":" + str3 : str);
                        String string = sb2.toString();
                        WeChatApis.runtime().getClass();
                        C3086j c3086j = WeChatApis.taskApi;
                        if (c3086j == null) {
                            for (C4139b c4139b : arrayListM8329a) {
                                String str7 = str6;
                                m8334g(c4139b.f13641a, c4139b.f13644d, str7, c4139b.f13642b, strM793K, c4139b.f13643c);
                                str6 = str7;
                            }
                            return;
                        }
                        String str8 = str6;
                        RunnableC1436e runnableC1436e = new RunnableC1436e(4);
                        if (!TextUtils.isEmpty(string) && ((Long) c3086j.f9969e.putIfAbsent(string, Long.valueOf(System.currentTimeMillis()))) == null) {
                            c3086j.m6556g(runnableC1436e);
                            m8333e(c3086j, string, str8, strM793K, arrayListM8329a, 0);
                            return;
                        }
                        m8330b("自动回复跳过: 已处理 ".concat(string));
                        return;
                    }
                    m8330b("自动回复跳过: 自己发的红包");
                }
            }
        } catch (Throwable th2) {
            m8330b("自动回复失败: " + th2.getMessage());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final List m8332d(C2913a c2913a, boolean z9) {
        boolean z10;
        int i9;
        boolean z11;
        long jNextInt;
        boolean z12;
        int i10;
        int i11;
        if (c2913a != null) {
            List list = z9 ? c2913a.f9443v : c2913a.f9442u;
            return list != null ? list : new ArrayList();
        }
        C2458l c2458l = this.f13646a;
        c2458l.getClass();
        boolean z13 = false;
        try {
            z10 = c2458l.m5853b().getBoolean("hb_reply_enable", false);
        } catch (Throwable unused) {
            z10 = false;
        }
        if (!z10) {
            return new ArrayList();
        }
        if (z9) {
            boolean z14 = c2458l.m5853b().contains("hb_reply_group_items_v1");
            if (z14) {
                return AbstractC0018a.m222J(c2458l.m5855d("hb_reply_group_items_v1", HttpUrl.FRAGMENT_ENCODE_SET));
            }
        }
        String strM5855d = c2458l.m5855d("hb_reply_items_v1", HttpUrl.FRAGMENT_ENCODE_SET);
        if (!TextUtils.isEmpty(strM5855d)) {
            return AbstractC0018a.m222J(strM5855d);
        }
        try {
            i9 = c2458l.m5853b().getInt("hb_reply_type", 1);
        } catch (Throwable unused2) {
            i9 = 1;
        }
        String strM5855d2 = (i9 == 3 || i9 == 4 || i9 == 5 || i9 == 6 || i9 == 7 || i9 == 8 || i9 == 9) ? c2458l.m5855d("hb_reply_media_paths", HttpUrl.FRAGMENT_ENCODE_SET) : c2458l.m5855d("hb_reply_templates", c2458l.m5855d("hb_reply_text", "谢谢老板"));
        try {
            z11 = c2458l.m5853b().getBoolean("hb_reply_custom_enable", false);
        } catch (Throwable unused3) {
            z11 = false;
        }
        if (z11) {
            try {
                i10 = c2458l.m5853b().getInt("hb_reply_delay_value", 1);
            } catch (Throwable unused4) {
                i10 = 1;
            }
            int iMax = Math.max(0, i10);
            try {
                i11 = c2458l.m5853b().getInt("hb_reply_delay_unit", 1);
            } catch (Throwable unused5) {
                i11 = 1;
            }
            jNextInt = i11 == 1 ? ((long) iMax) * 1000 : iMax;
        } else {
            jNextInt = 0;
        }
        try {
            z12 = c2458l.m5853b().getBoolean("hb_reply_random", false);
        } catch (Throwable unused6) {
            z12 = false;
        }
        if (z12) {
            jNextInt += (long) this.f13651f.nextInt(2000);
        }
        try {
            z13 = c2458l.m5853b().getBoolean("hb_reply_random", false);
        } catch (Throwable unused7) {
        }
        return AbstractC0018a.m216B(i9, jNextInt, strM5855d2, z13);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m8333e(final C3086j c3086j, final String str, final String str2, final String str3, final ArrayList arrayList, final int i9) {
        if (i9 >= arrayList.size()) {
            return;
        }
        final C4139b c4139b = (C4139b) arrayList.get(i9);
        c3086j.m6555f(str + ":step:" + i9, c4139b.f13644d, new Runnable() { // from class: ta.a
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.lang.Runnable
            public final void run() {
                boolean z9;
                C4140c c4140c = this.f13633g;
                C2458l c2458l = c4140c.f13646a;
                c2458l.getClass();
                boolean z10 = false;
                try {
                    z9 = c2458l.m5853b().getBoolean("hb_reply_enable", false);
                } catch (Throwable unused) {
                    z9 = false;
                }
                if (!z9) {
                    c4140c.m8330b("自动回复跳过: 全局开关已关闭");
                    return;
                }
                C4139b c4139b2 = c4139b;
                String str4 = c4139b2.f13642b;
                boolean z11 = c4139b2.f13643c;
                int i10 = c4139b2.f13641a;
                long j3 = c4139b2.f13644d;
                String str5 = str2;
                String str6 = str3;
                c4140c.m8334g(i10, j3, str5, str4, str6, z11);
                c2458l.getClass();
                try {
                    z10 = c2458l.m5853b().getBoolean("hb_reply_enable", false);
                } catch (Throwable unused2) {
                }
                if (z10) {
                    c4140c.m8333e(c3086j, str, str5, str6, arrayList, i9 + 1);
                }
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m8334g(int i9, long j3, String str, String str2, String str3, boolean z9) {
        String str4;
        try {
            C2458l c2458l = this.f13646a;
            c2458l.getClass();
            boolean z10 = false;
            try {
                z10 = c2458l.m5853b().getBoolean("hb_reply_enable", false);
            } catch (Throwable unused) {
            }
            if (!z10) {
                m8330b("自动回复跳过: 全局开关已关闭");
                return;
            }
            boolean zM8328f = m8328f(i9, str, str2, str3, z9);
            StringBuilder sb2 = new StringBuilder("自动回复");
            switch (i9) {
                case 3:
                    str4 = "图片";
                    break;
                case 4:
                    str4 = "语音";
                    break;
                case 5:
                    str4 = "视频";
                    break;
                case 6:
                    str4 = "表情";
                    break;
                case 7:
                    str4 = "文件";
                    break;
                case 8:
                    str4 = "XML";
                    break;
                case 9:
                    str4 = "收藏";
                    break;
                default:
                    str4 = "文本";
                    break;
            }
            sb2.append(str4);
            sb2.append(zM8328f ? "已发送" : "发送失败");
            sb2.append(": ");
            sb2.append(str2);
            sb2.append(" -> ");
            sb2.append(str);
            sb2.append(z9 ? " at=".concat(str3) : HttpUrl.FRAGMENT_ENCODE_SET);
            sb2.append(" delay=");
            sb2.append(j3);
            sb2.append("ms");
            m8330b(sb2.toString());
        } catch (Throwable th2) {
            m8330b("自动回复异常: " + th2.getMessage());
        }
    }
}
