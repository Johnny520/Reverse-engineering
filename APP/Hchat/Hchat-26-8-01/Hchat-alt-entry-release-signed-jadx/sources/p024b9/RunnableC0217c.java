package p024b9;

import ac.RunnableC0059l;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import bb.C0245g;
import bb.C0249k;
import ca.RunnableC0537x;
import gg.AbstractC1416l;
import gg.C1425u;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import na.C2923k;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p011ab.C0045e;
import p015b0.C0153s;
import p025bc.AbstractC0255e;
import p036c9.C0452j1;
import p036c9.C0490u;
import p036c9.C0502y;
import p065eb.C0881m0;
import p068eh.AbstractC0921a;
import p077f8.C1083c;
import p077f8.C1087g;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p096g8.C1368i;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.model.ContactLabelBean;
import p099h.Hchat.hooks.api.model.WeChatContact;
import p109hb.C1683i;
import p109hb.C1685j;
import p109hb.C1687k;
import p116i.C1746e0;
import p117i0.InterfaceC1809a1;
import p125i8.C2005i;
import p126ia.C2007a0;
import p136j8.C2092c;
import p136j8.C2097h;
import p136j8.C2105p;
import p136j8.C2114y;
import p136j8.InterfaceC2112w;
import p144k.C2209s1;
import p153k8.C2342f;
import p153k8.C2343g;
import p153k8.C2351o;
import p154k9.C2374r;
import p183m8.C2815c;
import p184m9.C2817b;
import p184m9.C2819d;
import p184m9.C2820e;
import p184m9.EnumC2818c;
import p210o8.C3086j;
import p213ob.C3118k;
import p213ob.C3121n;
import p218og.AbstractC3149m;
import p218og.C3147k;
import p244qb.C3485f;
import p244qb.C3488i;
import p244qb.C3490k;
import p249qg.InterfaceC3599t;
import p260ra.C3779c;
import p260ra.RunnableC3777a;
import p261rb.RunnableC3791g;
import p276sf.C3958e;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p315v8.C4528h;
import p315v8.C4537q;
import p332wb.AbstractC4855en;
import p332wb.AbstractC4955ho;
import p332wb.C4834e2;
import p332wb.C5026jv;
import p332wb.C5068l7;
import p332wb.C5071la;
import p332wb.C5108me;
import p332wb.C5292s0;
import p332wb.C5491y2;
import p332wb.C5538zh;
import p332wb.EnumC5092lv;
import p332wb.InterfaceC5059kv;
import p332wb.RunnableC5421vu;
import p346x9.AbstractC5737d;
import p346x9.C5738e;
import p347xa.C5748i;
import p347xa.C5749j;
import p347xa.C5751l;
import p347xa.C5752m;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.C4173t;

/* JADX INFO: renamed from: b9.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0217c implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f527g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f528h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f529i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f530j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f531k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0217c(C3121n c3121n, C3118k c3118k, String str, String str2) {
        this.f527g = 14;
        this.f528h = c3121n;
        this.f530j = c3118k;
        this.f529i = str;
        this.f531k = str2;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE, MOVE_EXCEPTION, CONSTRUCTOR, INVOKE, INVOKE, INVOKE, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0302 A[Catch: all -> 0x02ff, TryCatch #11 {all -> 0x02ff, blocks: (B:111:0x02ad, B:113:0x02bb, B:115:0x02c9, B:116:0x02d2, B:118:0x02d8, B:123:0x02eb, B:125:0x02f3, B:136:0x030e, B:137:0x0329, B:139:0x032f, B:141:0x033c, B:142:0x0340, B:145:0x035a, B:133:0x0302, B:146:0x035f, B:114:0x02c1), top: B:374:0x02ad }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x032f A[Catch: all -> 0x02ff, TryCatch #11 {all -> 0x02ff, blocks: (B:111:0x02ad, B:113:0x02bb, B:115:0x02c9, B:116:0x02d2, B:118:0x02d8, B:123:0x02eb, B:125:0x02f3, B:136:0x030e, B:137:0x0329, B:139:0x032f, B:141:0x033c, B:142:0x0340, B:145:0x035a, B:133:0x0302, B:146:0x035f, B:114:0x02c1), top: B:374:0x02ad }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        View decorView;
        File file;
        C2114y c2114y;
        Object c3959f;
        C5292s0 c5292s0;
        Object c3959f2;
        Object c3959f3;
        Object c3959f4;
        C1368i c1368iContacts;
        Object c3959f5;
        View decorView2;
        int i9 = this.f527g;
        int i10 = 15;
        int i11 = 8;
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        int i12 = 0;
        boolean zRemove = false;
        switch (i9) {
            case 0:
                TextView textView = (TextView) this.f528h;
                C0220f c0220f = (C0220f) this.f530j;
                C0218d c0218d = (C0218d) this.f531k;
                String str2 = (String) this.f529i;
                if (textView.getParent() != null) {
                    c0218d.getClass();
                    c0220f.m910a(textView, c0218d, str2);
                    return;
                }
                return;
            case 1:
                C0245g c0245g = (C0245g) this.f530j;
                TextView textView2 = (TextView) this.f528h;
                String str3 = (String) this.f529i;
                String str4 = (String) this.f531k;
                if (AbstractC1416l.m3825a(c0245g.f657g.get(textView2), str3)) {
                    c0245g.m980c(textView2, str3, str4);
                    if (c0245g.f653c.f6870a.getBoolean("enable", false)) {
                        c0245g.m979b(textView2);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                C0249k c0249k = (C0249k) this.f528h;
                String str5 = (String) this.f529i;
                String str6 = (String) this.f530j;
                String str7 = (String) this.f531k;
                c0249k.f684j.remove(str5);
                if (c0249k.f675a.m1005e(str6)) {
                    return;
                }
                c0249k.m992c(str7, str6);
                return;
            case 3:
                InterfaceC5059kv interfaceC5059kv = (InterfaceC5059kv) this.f528h;
                Activity activity = (Activity) this.f530j;
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f531k;
                C0502y c0502y = (C0502y) this.f529i;
                interfaceC5059kv.close();
                if (activity.isFinishing() || activity.isDestroyed()) {
                    return;
                }
                interfaceC1231l.invoke(c0502y);
                return;
            case 4:
                Activity activity2 = (Activity) this.f528h;
                String str8 = (String) this.f529i;
                Object obj = this.f530j;
                Context context = (Context) this.f531k;
                if (activity2.isFinishing() || activity2.isDestroyed()) {
                    return;
                }
                C0452j1 c0452j1 = C0452j1.f1326a;
                if (str8 != null) {
                    str = str8;
                }
                C0452j1.m1459v(activity2, str, new C0045e(activity2, obj, context, 4));
                return;
            case 5:
                C1687k c1687k = (C1687k) this.f528h;
                Object obj2 = this.f530j;
                C1685j c1685j = (C1685j) this.f531k;
                C1683i c1683i = (C1683i) this.f529i;
                if (c1687k.f5607h == obj2) {
                    c1687k.f5601b.invoke("微信原生群发助手等待发送完成超时: type=" + c1685j.f5591a.f5647b, null);
                    c1687k.f5607h = null;
                    c1687k.m4297a(c1683i, false);
                    return;
                }
                return;
            case 6:
                InterfaceC5059kv interfaceC5059kv2 = (InterfaceC5059kv) this.f528h;
                Activity activity3 = (Activity) this.f530j;
                C0490u c0490u = (C0490u) this.f531k;
                List list = (List) this.f529i;
                interfaceC5059kv2.close();
                Window window = activity3.getWindow();
                if (window == null || (decorView = window.getDecorView()) == null) {
                    return;
                }
                decorView.postOnAnimation(new RunnableC0059l(activity3, c0490u, list, i10));
                return;
            case 7:
                Activity activity4 = (Activity) this.f528h;
                C2007a0 c2007a0 = (C2007a0) this.f530j;
                View view = (View) this.f531k;
                View view2 = (View) this.f529i;
                if (activity4.isFinishing()) {
                    return;
                }
                Object parent = view;
                if (activity4.isDestroyed()) {
                    return;
                }
                while (true) {
                    if (parent instanceof View) {
                        View view3 = (View) parent;
                        if (!c2007a0.m4954l(view3)) {
                            if (parent instanceof AbsListView) {
                                ((AbsListView) parent).invalidateViews();
                            } else {
                                parent = view3.getParent();
                            }
                        }
                    } else {
                        c2007a0.m4953k(view2);
                    }
                }
                view2.requestLayout();
                view2.invalidate();
                return;
            case 8:
                C2097h c2097h = (C2097h) this.f528h;
                ConcurrentHashMap.KeySetView keySetView = c2097h.f7018l;
                String str9 = (String) this.f529i;
                Object obj3 = this.f530j;
                String str10 = (String) this.f531k;
                while (true) {
                    if (i12 < 120) {
                        try {
                            Thread.sleep(500L);
                            C2092c c2092cM5251y = c2097h.m5251y(obj3);
                            if (c2092cM5251y == null) {
                                i12++;
                            } else if (!c2097h.m5237B(str10, c2092cM5251y)) {
                                C2005i.m4939f("发送收藏语音失败: 下载完成后语音发送未成功");
                            }
                        } finally {
                            keySetView.remove(str9);
                        }
                    } else {
                        C2005i.m4939f("发送收藏语音失败: 等待收藏语音下载超时");
                    }
                }
                return;
            case 9:
                C2114y c2114y2 = (C2114y) this.f528h;
                AtomicReference atomicReference = (AtomicReference) this.f530j;
                InterfaceC2112w interfaceC2112w = (InterfaceC2112w) this.f531k;
                CountDownLatch countDownLatch = (CountDownLatch) this.f529i;
                try {
                    atomicReference.set(Boolean.valueOf(interfaceC2112w.run()));
                    break;
                } finally {
                    try {
                    } finally {
                    }
                    break;
                }
                return;
            case 10:
                String str11 = (String) this.f529i;
                C2342f c2342f = (C2342f) this.f528h;
                C1083c c1083c = (C1083c) this.f530j;
                C1087g c1087g = (C1087g) this.f531k;
                ConcurrentHashMap concurrentHashMap = C2343g.f7685t;
                CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) concurrentHashMap.get(str11);
                if (copyOnWriteArrayList != null) {
                    zRemove = copyOnWriteArrayList.remove(c2342f);
                    if (copyOnWriteArrayList.isEmpty()) {
                        concurrentHashMap.remove(str11, copyOnWriteArrayList);
                    }
                }
                if (zRemove) {
                    try {
                        c1083c.m2715b(c1087g);
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
                return;
            case 11:
                ScrollView scrollView = (ScrollView) this.f528h;
                ViewGroup viewGroup = (ViewGroup) this.f530j;
                Activity activity5 = (Activity) this.f531k;
                FrameLayout frameLayout = (FrameLayout) this.f529i;
                if (C2374r.f7807i.get() == scrollView && scrollView.getParent() == viewGroup) {
                    scrollView.animate().cancel();
                    scrollView.setAlpha(0.0f);
                    scrollView.setScaleX(0.88f);
                    scrollView.setScaleY(0.88f);
                    C2374r c2374r = C2374r.f7799a;
                    scrollView.setTranslationY(C2374r.m5677f(activity5, 8));
                    scrollView.setVisibility(0);
                    scrollView.bringToFront();
                    frameLayout.bringToFront();
                    scrollView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setDuration(180L).start();
                    return;
                }
                return;
            case 12:
                EnumC2818c enumC2818c = EnumC2818c.DICE;
                Activity activity6 = (Activity) this.f528h;
                C2820e c2820e = (C2820e) this.f530j;
                C2819d c2819d = (C2819d) this.f531k;
                EnumC2818c enumC2818c2 = (EnumC2818c) this.f529i;
                if (activity6.isFinishing() || activity6.isDestroyed()) {
                    c2820e.f9109e.set(false);
                    c2820e.m6222c(c2819d, null);
                    return;
                }
                c2820e.getClass();
                List list2 = enumC2818c2 == enumC2818c ? C2820e.f9102j : C2820e.f9101i;
                ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list2));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C3958e(((C2817b) it.next()).f9088b, HttpUrl.FRAGMENT_ENCODE_SET));
                }
                if (C5491y2.m9799Q1(activity6, enumC2818c2 == enumC2818c ? "选择骰子点数" : "选择猜拳结果", HttpUrl.FRAGMENT_ENCODE_SET, arrayList, new C0153s(c2820e, enumC2818c2, c2819d, 11), new C1746e0(c2820e, i11), EnumC5092lv.f18824j).mo7023a()) {
                    return;
                }
                c2820e.f9109e.set(false);
                c2820e.m6222c(c2819d, null);
                return;
            case 13:
                String str12 = (String) this.f529i;
                C3086j c3086j = (C3086j) this.f528h;
                C1425u c1425u = (C1425u) this.f530j;
                Runnable runnable = (Runnable) this.f531k;
                if (str12 != null) {
                    ConcurrentHashMap concurrentHashMap2 = c3086j.f9967c;
                    Object obj4 = c1425u.f4738g;
                    if (obj4 == null) {
                        AbstractC1416l.m3831g("wrapped");
                        throw null;
                    }
                    concurrentHashMap2.remove(str12, (Runnable) obj4);
                }
                c3086j.m6556g(runnable);
                return;
            case 14:
                C3121n c3121n = (C3121n) this.f528h;
                C3118k c3118k = (C3118k) this.f530j;
                String str13 = (String) this.f529i;
                String str14 = (String) this.f531k;
                File fileM6624c = c3121n.m6624c(c3118k);
                AtomicBoolean atomicBoolean = c3121n.f10116g;
                try {
                    c3121n.m6629k(str13, c3118k, fileM6624c);
                    if (!atomicBoolean.get()) {
                        fileM6624c.delete();
                        file = new File(fileM6624c.getParentFile(), AbstractC0255e.m1020i(fileM6624c.getName(), ".part"));
                    } else if (c3121n.m6627i()) {
                        C2105p c2105pMedia = WeChatApis.media();
                        if (c2105pMedia == null || (c2114y = c2105pMedia.f7036b) == null || !c2114y.m5324t(str14, fileM6624c.getAbsolutePath())) {
                            throw new IllegalStateException("微信语音发送失败");
                        }
                        fileM6624c.delete();
                        file = new File(fileM6624c.getParentFile(), AbstractC0255e.m1020i(fileM6624c.getName(), ".part"));
                    } else {
                        C0881m0 c0881m0 = C0881m0.f2707a;
                        C0881m0.m2201k(str14, str13);
                        fileM6624c.delete();
                        file = new File(fileM6624c.getParentFile(), AbstractC0255e.m1020i(fileM6624c.getName(), ".part"));
                    }
                } catch (Throwable th2) {
                    try {
                        if (atomicBoolean.get()) {
                            c3121n.f10111b.invoke("文字转语音发送失败", th2);
                            C0881m0 c0881m02 = C0881m0.f2707a;
                            C0881m0.m2201k(str14, str13);
                            c3121n.m6630l(C3121n.m6622m("文字转语音发送失败", th2));
                        }
                        fileM6624c.delete();
                        file = new File(fileM6624c.getParentFile(), AbstractC0255e.m1020i(fileM6624c.getName(), ".part"));
                    } catch (Throwable th3) {
                        fileM6624c.delete();
                        new File(fileM6624c.getParentFile(), AbstractC0255e.m1020i(fileM6624c.getName(), ".part")).delete();
                        throw th3;
                    }
                    break;
                }
                file.delete();
                return;
            case 15:
                Activity activity7 = (Activity) this.f528h;
                C3490k c3490k = (C3490k) this.f530j;
                Set set = c3490k.f11341l;
                Object obj5 = this.f531k;
                C3488i c3488i = (C3488i) this.f529i;
                if (activity7.isFinishing()) {
                    set.remove(activity7);
                    return;
                }
                if (!(obj5 instanceof C3959f)) {
                    c3490k.m7320L(activity7, c3488i, (List) obj5);
                }
                if (C3960g.m8182b(obj5) != null) {
                    set.remove(activity7);
                    C3490k.m7295N(activity7, "联系人列表不可用");
                    return;
                }
                return;
            case 16:
                C3490k c3490k2 = (C3490k) this.f528h;
                Handler handler = (Handler) this.f530j;
                Activity activity8 = (Activity) this.f531k;
                C3488i c3488i2 = (C3488i) this.f529i;
                try {
                    List listM7308v = C3490k.m7308v();
                    c3490k2.f11347r = new C3485f(listM7308v, System.currentTimeMillis());
                    c3959f = listM7308v;
                } catch (Throwable th4) {
                    c3959f = new C3959f(th4);
                }
                handler.post(new RunnableC0217c(activity8, c3490k2, c3959f, c3488i2, 15));
                return;
            case 17:
                C3779c c3779c = (C3779c) this.f528h;
                String str15 = (String) this.f529i;
                Object obj6 = this.f530j;
                Map map = (Map) this.f531k;
                C2923k c2923k = (C2923k) c3779c.f12375e;
                if (!c2923k.f9553p.contains(str15) || c2923k.f9554q.contains(str15)) {
                    return;
                }
                if (((C2815c) c3779c.f12376f).m6216j(obj6)) {
                    C3779c.m7928t(AbstractC4855en.m9263g("redpacket_open_timeout:", str15), 4500L, new RunnableC3777a(c3779c, str15, 0));
                    return;
                } else {
                    if (c3779c.m7942p(map, str15, "拆红包重试发包失败")) {
                        return;
                    }
                    c3779c.m7940n("拆红包重试发包失败", map);
                    c3779c.m7931d(str15);
                    return;
                }
            case 18:
                C4528h c4528h = (C4528h) this.f528h;
                C4537q c4537q = (C4537q) this.f530j;
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f531k;
                InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) this.f529i;
                if (c4528h.f14956q && c4537q.f14974e.contains(c4528h.f14940a)) {
                    interfaceC1220a2.invoke();
                    return;
                } else {
                    if (interfaceC1220a != null) {
                        interfaceC1220a.invoke();
                        return;
                    }
                    return;
                }
            case 19:
                C3958e c3958e = (C3958e) this.f528h;
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f530j;
                Context context2 = (Context) this.f531k;
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f529i;
                interfaceC1809a1.setValue(Boolean.FALSE);
                AbstractC4955ho.m9557h(context2, interfaceC1809a12, (String) c3958e.f12962h);
                return;
            case 20:
                C1368i c1368i = (C1368i) this.f528h;
                C5292s0 c5292s02 = (C5292s0) this.f530j;
                Handler handler2 = (Handler) this.f531k;
                C5071la c5071la = (C5071la) this.f529i;
                try {
                    LinkedHashMap linkedHashMapM3734w = c1368i.m3734w(c5292s02.f20550a);
                    String str16 = c5292s02.f20550a;
                    ArrayList<WeChatContact> arrayList2 = !C1368i.m3686I(str16) ? new ArrayList() : c1368i.m3728q(c1368i.m3732u(str16));
                    ArrayList arrayList3 = new ArrayList();
                    for (WeChatContact weChatContact : arrayList2) {
                        String str17 = weChatContact.wxId;
                        String str18 = !AbstractC3149m.m6721t0(str17) ? str17 : null;
                        if (str18 != null) {
                            String strDisplayName = (String) linkedHashMapM3734w.get(str18);
                            if (strDisplayName == null) {
                                strDisplayName = weChatContact.displayName();
                                if (strDisplayName.length() == 0) {
                                    strDisplayName = str18;
                                }
                                String str19 = strDisplayName;
                                String str20 = weChatContact.avatarUrl;
                                String str21 = weChatContact.avatarBackupUrl;
                                List listM101y0 = AbstractC0000a.m101y0(weChatContact.remarkName, weChatContact.nickname, weChatContact.customWxId);
                                ArrayList arrayList4 = new ArrayList();
                                for (Object obj7 : listM101y0) {
                                    if (!AbstractC3149m.m6721t0((String) obj7)) {
                                        arrayList4.add(obj7);
                                    }
                                }
                                c5292s0 = new C5292s0(str18, str19, false, str20, str21, (List) null, false, AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList4)), 224);
                            } else {
                                if (AbstractC3149m.m6721t0(strDisplayName)) {
                                    strDisplayName = null;
                                }
                                if (strDisplayName == null) {
                                }
                                String str192 = strDisplayName;
                                String str202 = weChatContact.avatarUrl;
                                String str212 = weChatContact.avatarBackupUrl;
                                List listM101y02 = AbstractC0000a.m101y0(weChatContact.remarkName, weChatContact.nickname, weChatContact.customWxId);
                                ArrayList arrayList42 = new ArrayList();
                                while (r8.hasNext()) {
                                }
                                c5292s0 = new C5292s0(str18, str192, false, str202, str212, (List) null, false, AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList42)), 224);
                            }
                        } else {
                            c5292s0 = null;
                        }
                        if (c5292s0 != null) {
                            arrayList3.add(c5292s0);
                        }
                    }
                    handler2.post(new RunnableC3791g(c5071la, i11, AbstractC4166m.m8402K1(arrayList3, new C4834e2(6))));
                    return;
                } catch (Throwable th5) {
                    handler2.post(new RunnableC3791g(c5071la, 9, th5));
                    return;
                }
            case 21:
                Activity activity9 = (Activity) this.f528h;
                List list3 = (List) this.f530j;
                Set set2 = (Set) this.f531k;
                C5108me c5108me = (C5108me) this.f529i;
                if (activity9.isFinishing() || activity9.isDestroyed()) {
                    return;
                }
                if (list3.isEmpty()) {
                    Toast.makeText(activity9, "没有可选择的联系人", 0).show();
                    return;
                }
                HashSet hashSet = new HashSet();
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    hashSet.add(((C5026jv) it2.next()).f18249a);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (Object obj8 : set2) {
                    if (!hashSet.contains((String) obj8)) {
                        linkedHashSet.add(obj8);
                    }
                }
                C5491y2.m9807U1(activity9, list3, new C5068l7(c5108me, i10, linkedHashSet), new C2209s1(25), "设置排除名单", "保存", false, null, set2, false, 1152);
                return;
            case 22:
                C1368i c1368i2 = (C1368i) this.f528h;
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f530j;
                InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) this.f531k;
                InterfaceC1809a1 interfaceC1809a15 = (InterfaceC1809a1) this.f529i;
                try {
                    c3959f2 = c1368i2.m3727p();
                } catch (Throwable th6) {
                    c3959f2 = new C3959f(th6);
                }
                new Handler(Looper.getMainLooper()).post(new RunnableC0217c(c3959f2, interfaceC1809a13, interfaceC1809a14, interfaceC1809a15, 23));
                return;
            case 23:
                Serializable serializable = (Serializable) this.f528h;
                InterfaceC1809a1 interfaceC1809a16 = (InterfaceC1809a1) this.f530j;
                InterfaceC1809a1 interfaceC1809a17 = (InterfaceC1809a1) this.f531k;
                InterfaceC1809a1 interfaceC1809a18 = (InterfaceC1809a1) this.f529i;
                Serializable serializable2 = C4173t.f13710g;
                if (!(serializable instanceof C3959f)) {
                    serializable2 = serializable;
                }
                ArrayList arrayList5 = new ArrayList();
                for (Object obj9 : (Iterable) serializable2) {
                    ContactLabelBean contactLabelBean = (ContactLabelBean) obj9;
                    if (!AbstractC3149m.m6721t0(contactLabelBean.labelName) || !AbstractC3149m.m6721t0(contactLabelBean.labelId)) {
                        arrayList5.add(obj9);
                    }
                }
                List listM8402K1 = AbstractC4166m.m8402K1(arrayList5, new C4834e2(2));
                C3147k c3147k = AbstractC4955ho.f17686a;
                interfaceC1809a16.setValue(listM8402K1);
                Throwable thM8182b = C3960g.m8182b(serializable);
                String message = thM8182b != null ? thM8182b.getMessage() : null;
                if (message != null) {
                    str = message;
                }
                interfaceC1809a17.setValue(str);
                interfaceC1809a18.setValue(Boolean.FALSE);
                return;
            case 24:
                String str22 = (String) this.f529i;
                InterfaceC1809a1 interfaceC1809a19 = (InterfaceC1809a1) this.f528h;
                InterfaceC1809a1 interfaceC1809a110 = (InterfaceC1809a1) this.f530j;
                InterfaceC1809a1 interfaceC1809a111 = (InterfaceC1809a1) this.f531k;
                if (AbstractC1416l.m3825a((String) interfaceC1809a19.getValue(), str22)) {
                    interfaceC1809a110.setValue(Boolean.TRUE);
                    C5491y2.m9787L0(interfaceC1809a111, System.currentTimeMillis());
                    return;
                }
                return;
            case 25:
                try {
                    AbstractC5737d.m10420d((Context) this.f528h, (C5738e) this.f530j, (C2351o) this.f531k, (String) this.f529i);
                    c3959f3 = C3967n.f12976a;
                    break;
                } catch (Throwable th7) {
                    c3959f3 = new C3959f(th7);
                }
                Throwable thM8182b2 = C3960g.m8182b(c3959f3);
                if (thM8182b2 != null) {
                    AbstractC0921a.m2261x("[Hchat:KeywordNotification] 处理消息失败: ", thM8182b2.getMessage(), thM8182b2);
                    return;
                }
                return;
            case 26:
                C5752m c5752m = (C5752m) this.f528h;
                InterfaceC5059kv interfaceC5059kv3 = (InterfaceC5059kv) this.f530j;
                Activity activity10 = (Activity) this.f531k;
                C5748i c5748i = (C5748i) this.f529i;
                try {
                    c1368iContacts = WeChatApis.contacts();
                } catch (Throwable th8) {
                    c3959f4 = new C3959f(th8);
                }
                if (c1368iContacts == null) {
                    throw new IllegalStateException("联系人标签不可用");
                }
                ArrayList arrayListM3727p = c1368iContacts.m3727p();
                ArrayList arrayList6 = new ArrayList();
                for (Object obj10 : arrayListM3727p) {
                    ContactLabelBean contactLabelBean2 = (ContactLabelBean) obj10;
                    if (!AbstractC3149m.m6721t0(contactLabelBean2.labelName) || !AbstractC3149m.m6721t0(contactLabelBean2.labelId)) {
                        arrayList6.add(obj10);
                    }
                }
                HashSet hashSet2 = new HashSet();
                ArrayList arrayList7 = new ArrayList();
                for (Object obj11 : arrayList6) {
                    ContactLabelBean contactLabelBean3 = (ContactLabelBean) obj11;
                    String str23 = contactLabelBean3.labelName;
                    if (AbstractC3149m.m6721t0(str23)) {
                        str23 = contactLabelBean3.labelId;
                    }
                    if (hashSet2.add(str23)) {
                        arrayList7.add(obj11);
                    }
                }
                c3959f4 = AbstractC4166m.m8402K1(arrayList7, new C5751l());
                c5752m.f23416d.post(new RunnableC0537x(interfaceC5059kv3, c5752m, activity10, c3959f4, c5748i));
                return;
            case 27:
                InterfaceC1220a interfaceC1220a3 = (InterfaceC1220a) this.f528h;
                C5752m c5752m2 = (C5752m) this.f530j;
                InterfaceC5059kv interfaceC5059kv4 = (InterfaceC5059kv) this.f531k;
                Activity activity11 = (Activity) this.f529i;
                try {
                    c3959f5 = interfaceC1220a3.invoke();
                    break;
                } catch (Throwable th9) {
                    c3959f5 = new C3959f(th9);
                }
                Throwable thM8182b3 = C3960g.m8182b(c3959f5);
                if (thM8182b3 != null) {
                    c5752m2.f23414b.invoke("更新好友资料失败", thM8182b3);
                    c3959f5 = new C5749j(false, "更新好友资料失败");
                }
                c5752m2.f23416d.post(new RunnableC0217c(interfaceC5059kv4, c5752m2, activity11, (C5749j) c3959f5, 28));
                return;
            default:
                InterfaceC5059kv interfaceC5059kv5 = (InterfaceC5059kv) this.f528h;
                C5752m c5752m3 = (C5752m) this.f530j;
                Activity activity12 = (Activity) this.f531k;
                C5749j c5749j = (C5749j) this.f529i;
                interfaceC5059kv5.close();
                C5538zh c5538zh = new C5538zh(c5752m3, activity12, c5749j, 14);
                c5752m3.getClass();
                Window window2 = activity12.getWindow();
                if (window2 == null || (decorView2 = window2.getDecorView()) == null) {
                    return;
                }
                decorView2.postOnAnimation(new RunnableC5421vu(c5752m3, activity12, c5538zh));
                return;
        }
    }

    public /* synthetic */ RunnableC0217c(Object obj, Object obj2, Object obj3, Object obj4, int i9) {
        this.f527g = i9;
        this.f528h = obj;
        this.f530j = obj2;
        this.f531k = obj3;
        this.f529i = obj4;
    }

    public /* synthetic */ RunnableC0217c(Object obj, String str, Object obj2, Object obj3, int i9) {
        this.f527g = i9;
        this.f528h = obj;
        this.f529i = str;
        this.f530j = obj2;
        this.f531k = obj3;
    }

    public /* synthetic */ RunnableC0217c(String str, Object obj, Object obj2, Object obj3, int i9) {
        this.f527g = i9;
        this.f529i = str;
        this.f528h = obj;
        this.f530j = obj2;
        this.f531k = obj3;
    }

    public /* synthetic */ RunnableC0217c(C0245g c0245g, TextView textView, String str, String str2) {
        this.f527g = 1;
        this.f530j = c0245g;
        this.f528h = textView;
        this.f529i = str;
        this.f531k = str2;
    }

    public /* synthetic */ RunnableC0217c(InterfaceC3599t interfaceC3599t, C1368i c1368i, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13) {
        this.f527g = 22;
        this.f528h = c1368i;
        this.f530j = interfaceC1809a1;
        this.f531k = interfaceC1809a12;
        this.f529i = interfaceC1809a13;
    }
}
