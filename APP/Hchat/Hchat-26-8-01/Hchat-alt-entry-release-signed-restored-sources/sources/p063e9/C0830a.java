package p063e9;

import ad.C0069c;
import ae.C0070a;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import bsh.org.objectweb.asm.Opcodes;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import md.EnumC2824a;
import na.C2915c;
import okhttp3.HttpUrl;
import okio.C3193a;
import p003a2.C0014a;
import p010aa.C0035c;
import p012ah.C0086a;
import p020b5.C0192k;
import p024b9.C0215a;
import p025bc.AbstractC0255e;
import p025bc.C0257g;
import p025bc.C0265o;
import p025bc.C0267q;
import p025bc.EnumC0256f;
import p025bc.EnumC0266p;
import p036c9.C0434f;
import p036c9.C0438g;
import p036c9.C0472o1;
import p053df.C0773a;
import p053df.C0777e;
import p053df.C0778f;
import p053df.C0779g;
import p053df.C0780h;
import p053df.C0781i;
import p065eb.C0876k;
import p067ef.C0916a;
import p067ef.C0917b;
import p067ef.C0918c;
import p068eh.AbstractC0921a;
import p077f8.AbstractC1089i;
import p077f8.C1085e;
import p077f8.InterfaceC1084d;
import p080fb.AbstractC1184v0;
import p096g8.C1368i;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.model.WeChatMessage;
import p116i.C1746e0;
import p117i0.InterfaceC1826e2;
import p119i2.C1954y;
import p126ia.C2027u;
import p136j8.AbstractC2091b;
import p136j8.C2104o;
import p152k7.AbstractC2331a;
import p152k7.InterfaceC2336f;
import p153k8.C2351o;
import p153k8.C2352p;
import p153k8.InterfaceC2350n;
import p157kd.AbstractC2390d;
import p213ob.C3113f;
import p215od.C3129b;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p219oh.AbstractC3165h;
import p229p7.C3339i;
import p242q8.C3458m;
import p242q8.C3460o;
import p257r7.C3725o;
import p257r7.C3727q;
import p257r7.C3734x;
import p257r7.C3735y;
import p258r8.C3740e;
import p258r8.C3742g;
import p258r8.EnumC3738c;
import p258r8.RunnableC3737b;
import p265s.C3818c;
import p265s.C3870z0;
import p274s8.C3943c;
import p276sf.C3959f;
import p281t3.AbstractC4106c;
import p286t8.AbstractC4137b;
import p300ub.AbstractC4302b;
import p302ud.C4311g;
import p302ud.C4325u;
import p302ud.InterfaceC4316l;
import p315v8.C4537q;
import p332wb.AbstractC4855en;
import p345x8.C5724q;
import p345x8.C5725r;
import p346x9.AbstractC5737d;
import p351xe.AbstractC5780a;
import p351xe.C5796q;
import p382zc.EnumC6135a;
import sh.C4056v1;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import ua.C4291b;

/* JADX INFO: renamed from: e9.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0830a implements InterfaceC1084d, InterfaceC1826e2, InterfaceC2336f {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f2505g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f2506h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f2507i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0830a(Object obj, int i9, Object obj2) {
        this.f2505g = i9;
        this.f2507i = obj;
        this.f2506h = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1826e2
    /* JADX INFO: renamed from: a */
    public boolean mo2112a() {
        C3870z0 c3870z0 = (C3870z0) this.f2507i;
        C3818c c3818c = (C3818c) this.f2506h;
        if (!c3870z0.f12711q) {
            c3870z0.m8054h();
            c3818c.f12520a = C3818c.m8006a(c3870z0.f12709o, c3818c.f12520a);
            c3870z0.f12711q = !c3870z0.m8053g(c3870z0.f12708n, r2 + c3818c.f12521b);
        }
        return c3870z0.f12711q;
    }

    /* JADX DEBUG: Class process forced to load method for inline: r8.e.f(int, fg.a, java.lang.String, java.lang.String, r8.c):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p077f8.InterfaceC1084d
    /* JADX INFO: renamed from: b */
    public void mo468b(Object obj) {
        int i9 = this.f2505g;
        final int i10 = 1;
        final int i11 = 3;
        EnumC3738c enumC3738c = EnumC3738c.WARMUP;
        Object obj2 = this.f2506h;
        Object obj3 = this.f2507i;
        switch (i9) {
            case 0:
                C0438g c0438g = (C0438g) obj3;
                final C3742g c3742g = (C3742g) obj2;
                ((C1085e) obj).getClass();
                WeChatApis.message().getClass();
                C2352p c2352p = WeChatApis.messageObserveApi;
                if (c2352p != null) {
                    final int i12 = 0;
                    c0438g.m7753j(c2352p.m5640e(new InterfaceC2350n() { // from class: e9.b
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        /* JADX WARN: Removed duplicated region for block: B:155:0x0251  */
                        /* JADX WARN: Removed duplicated region for block: B:159:0x025c  */
                        /* JADX WARN: Removed duplicated region for block: B:186:0x02a3  */
                        /* JADX WARN: Removed duplicated region for block: B:195:0x02bf  */
                        /* JADX WARN: Removed duplicated region for block: B:217:0x0305  */
                        /* JADX WARN: Removed duplicated region for block: B:219:0x0308  */
                        /* JADX WARN: Removed duplicated region for block: B:222:0x030f  */
                        /* JADX WARN: Removed duplicated region for block: B:226:0x0317  */
                        /* JADX WARN: Removed duplicated region for block: B:229:0x031e  */
                        /* JADX WARN: Removed duplicated region for block: B:231:0x0326  */
                        /* JADX WARN: Removed duplicated region for block: B:232:0x0328  */
                        /* JADX WARN: Removed duplicated region for block: B:237:0x0337  */
                        /* JADX WARN: Removed duplicated region for block: B:242:0x0347  */
                        @Override // p153k8.InterfaceC2350n
                        /* JADX INFO: renamed from: a */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void mo973a(C2351o c2351o) {
                            C0832c c0832cM2150a;
                            boolean zBooleanValue;
                            String strM3731t;
                            String strBodyContent;
                            Object c3959f;
                            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
                            Object next;
                            int i13;
                            WeChatMessage weChatMessage;
                            int i14 = i12;
                            boolean z9 = false;
                            String str = HttpUrl.FRAGMENT_ENCODE_SET;
                            switch (i14) {
                                case 0:
                                    C3742g c3742g2 = c3742g;
                                    AtomicBoolean atomicBoolean = C0846q.f2580a;
                                    Context context = c3742g2.f12143a;
                                    String str2 = c2351o.f7717e;
                                    WeChatMessage weChatMessage2 = c2351o.f7723k;
                                    String strM5617d = c2351o.f7715c;
                                    ConcurrentHashMap concurrentHashMap = AbstractC4137b.f13632a;
                                    if (AbstractC4302b.m8640c(context, "Hchat_block_at_all_notification_config").getBoolean("block_at_all_notification_enable", false)) {
                                        String strM5617d2 = AbstractC3149m.m6721t0(strM5617d) ? c2351o.m5617d() : strM5617d;
                                        strM5617d2.getClass();
                                        if (AbstractC3165h.m6782i(context, strM5617d2) && AbstractC4137b.m8325a(c2351o, strM5617d2)) {
                                        }
                                    }
                                    C0848s c0848s = new C0848s(context);
                                    if (c0848s.m2151b("custom_notification_enable") && !c2351o.f7721i && !c2351o.m5630q()) {
                                        String strM5617d3 = AbstractC3149m.m6721t0(strM5617d) ? c2351o.m5617d() : strM5617d;
                                        strM5617d3.getClass();
                                        if (!AbstractC3149m.m6721t0(strM5617d3)) {
                                            String strBodyContent2 = weChatMessage2 != null ? weChatMessage2.bodyContent() : null;
                                            if (strBodyContent2 == null) {
                                                strBodyContent2 = HttpUrl.FRAGMENT_ENCODE_SET;
                                            }
                                            if (AbstractC3149m.m6721t0(strBodyContent2)) {
                                                strBodyContent2 = str2;
                                            }
                                            WeChatMessage weChatMessage3 = c2351o.f7723k;
                                            if ((weChatMessage3 != null ? weChatMessage3.getType() : 0) != 37) {
                                                strBodyContent2.getClass();
                                                if (!AbstractC3149m.m6709h0(strBodyContent2, "antispamticket", true) && !AbstractC3149m.m6709h0(strBodyContent2, "verify_ticket", true) && !AbstractC3149m.m6709h0(strBodyContent2, "encryptusername", true) && !AbstractC3149m.m6709h0(strBodyContent2, "fmessage", true) && (c0832cM2150a = c0848s.m2150a(strM5617d3)) != null && c0832cM2150a.f2515f && c0832cM2150a.f2516g != 0 && !c2351o.m5632s() && !c2351o.m5628o()) {
                                                    if (!("recalled".equals(c2351o.f7714b) || ((weChatMessage = c2351o.f7723k) != null && weChatMessage.isRecalled()))) {
                                                        WeChatApis.interaction().getClass();
                                                        C3458m c3458m = WeChatApis.chatPageApi;
                                                        String strM7258a = c3458m != null ? c3458m.m7258a() : null;
                                                        if (strM7258a == null) {
                                                            strM7258a = HttpUrl.FRAGMENT_ENCODE_SET;
                                                        }
                                                        if (!strM7258a.equals(strM5617d3) || c3458m == null) {
                                                            zBooleanValue = false;
                                                        } else {
                                                            C3460o c3460o = c3458m.f11212b;
                                                            Activity activityM7263a = c3460o != null ? c3460o.m7263a() : null;
                                                            if (activityM7263a == null) {
                                                                boolean z10 = !TextUtils.isEmpty(c3458m.f11220j);
                                                                if (z10) {
                                                                    Object systemService = context.getSystemService("activity");
                                                                    ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
                                                                    if (activityManager != null) {
                                                                        int iMyPid = Process.myPid();
                                                                        try {
                                                                            runningAppProcesses = activityManager.getRunningAppProcesses();
                                                                        } catch (Throwable th2) {
                                                                            c3959f = new C3959f(th2);
                                                                        }
                                                                        if (runningAppProcesses != null) {
                                                                            Iterator<T> it = runningAppProcesses.iterator();
                                                                            while (true) {
                                                                                if (it.hasNext()) {
                                                                                    next = it.next();
                                                                                    if (((ActivityManager.RunningAppProcessInfo) next).pid == iMyPid) {
                                                                                    }
                                                                                } else {
                                                                                    next = null;
                                                                                }
                                                                            }
                                                                            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) next;
                                                                            boolean z11 = runningAppProcessInfo == null || (i13 = runningAppProcessInfo.importance) == 100 || i13 == 200;
                                                                            c3959f = Boolean.valueOf(z11);
                                                                            Object obj4 = Boolean.TRUE;
                                                                            if (c3959f instanceof C3959f) {
                                                                                c3959f = obj4;
                                                                            }
                                                                            zBooleanValue = ((Boolean) c3959f).booleanValue();
                                                                        }
                                                                    } else {
                                                                        zBooleanValue = true;
                                                                    }
                                                                }
                                                            } else {
                                                                String name = activityM7263a.getClass().getName();
                                                                if ("com.tencent.mm.ui.chatting.ChattingUI".equals(name) || name.contains(".ui.chatting.")) {
                                                                }
                                                            }
                                                        }
                                                        if (!zBooleanValue && !C0846q.m2126k(c0832cM2150a)) {
                                                            boolean z12 = c0832cM2150a.f2513d;
                                                            String str3 = c0832cM2150a.f2532w;
                                                            String str4 = c0832cM2150a.f2531v;
                                                            if (z12) {
                                                                if (AbstractC3149m.m6721t0(strM5617d)) {
                                                                    strM5617d = c2351o.m5617d();
                                                                }
                                                                String strM5616c = c2351o.f7716d;
                                                                if (AbstractC3149m.m6721t0(strM5616c)) {
                                                                    strM5616c = c2351o.m5616c();
                                                                }
                                                                strM5616c.getClass();
                                                                if (AbstractC3149m.m6721t0(strM5616c)) {
                                                                    strM3731t = HttpUrl.FRAGMENT_ENCODE_SET;
                                                                    strBodyContent = weChatMessage2 != null ? weChatMessage2.bodyContent() : null;
                                                                    if (strBodyContent != null) {
                                                                        str = strBodyContent;
                                                                    }
                                                                    if (!AbstractC3149m.m6721t0(str)) {
                                                                        str2 = str;
                                                                    }
                                                                    if (AbstractC3149m.m6721t0(str4)) {
                                                                        Set set = C0848s.f2595b;
                                                                        if (!C0847r.m2144c(str4, strM5616c, strM3731t, str2)) {
                                                                            z9 = true;
                                                                        } else if (!AbstractC3149m.m6721t0(str3)) {
                                                                            Set set2 = C0848s.f2595b;
                                                                            if (!C0847r.m2144c(str3, strM5616c, strM3731t, str2)) {
                                                                                if (c0832cM2150a.f2529t) {
                                                                                    ConcurrentHashMap concurrentHashMap2 = AbstractC4137b.f13632a;
                                                                                    strM5617d.getClass();
                                                                                    if (!AbstractC4137b.m8325a(c2351o, strM5617d)) {
                                                                                        if (!c0832cM2150a.f2530u || !c2351o.m5620g()) {
                                                                                            z9 = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    C1368i c1368iM9259c = AbstractC4855en.m9259c();
                                                                    strM3731t = c1368iM9259c != null ? c1368iM9259c.m3731t(c0832cM2150a.f2511b, strM5616c) : null;
                                                                    if (strM3731t == null) {
                                                                    }
                                                                    if (weChatMessage2 != null) {
                                                                    }
                                                                    if (strBodyContent != null) {
                                                                    }
                                                                    if (!AbstractC3149m.m6721t0(str)) {
                                                                    }
                                                                    if (AbstractC3149m.m6721t0(str4)) {
                                                                    }
                                                                }
                                                            }
                                                            if (!z9) {
                                                                C0846q.f2585f.postDelayed(new RunnableC0833d(strM5617d3, c0832cM2150a, context, c2351o, 1), 900L);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    break;
                                case 1:
                                    C3742g c3742g3 = c3742g;
                                    ConcurrentHashMap concurrentHashMap3 = AbstractC4137b.f13632a;
                                    Context context2 = c3742g3.f12143a;
                                    if (!AbstractC4302b.m8640c(context2, "Hchat_block_at_all_notification_config").getBoolean("block_at_all_notification_enable", false)) {
                                        AbstractC4137b.f13632a.clear();
                                        break;
                                    } else {
                                        String strM5617d4 = c2351o.f7715c;
                                        if (AbstractC3149m.m6721t0(strM5617d4)) {
                                            strM5617d4 = c2351o.m5617d();
                                        }
                                        strM5617d4.getClass();
                                        boolean zM6782i = AbstractC3165h.m6782i(context2, strM5617d4);
                                        boolean zM8325a = AbstractC4137b.m8325a(c2351o, strM5617d4);
                                        WeChatMessage weChatMessage4 = c2351o.f7723k;
                                        long j3 = weChatMessage4 != null ? weChatMessage4.msgSvrId : 0L;
                                        if (zM6782i && zM8325a) {
                                            AbstractC4137b.m8327c(context2, strM5617d4, j3);
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    C3742g c3742g4 = c3742g;
                                    ExecutorService executorService = C5724q.f23297a;
                                    Context context3 = c3742g4.f12143a;
                                    C5725r c5725r = new C5725r(context3);
                                    if (c5725r.m10385e("auto_reply_enable") && !c2351o.m5630q()) {
                                        String strM5617d5 = c2351o.f7715c;
                                        if (AbstractC3149m.m6721t0(strM5617d5)) {
                                            strM5617d5 = c2351o.m5617d();
                                        }
                                        if (c5725r.m10385e("excluded_talkers_enable")) {
                                            strBodyContent = strM5617d5 != null ? AbstractC3149m.m6703R0(strM5617d5).toString() : null;
                                            if (strBodyContent == null) {
                                                strBodyContent = HttpUrl.FRAGMENT_ENCODE_SET;
                                            }
                                            if (strBodyContent.length() != 0) {
                                                List listM6691F0 = AbstractC3149m.m6691F0(c5725r.m10388h("excluded_talkers", HttpUrl.FRAGMENT_ENCODE_SET), new char[]{',', 65292, ';', 65307, '\n', '\r'}, 6);
                                                ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(listM6691F0));
                                                Iterator it2 = listM6691F0.iterator();
                                                while (it2.hasNext()) {
                                                    AbstractC2091b.m5171r((String) it2.next(), arrayList);
                                                }
                                                ArrayList arrayList2 = new ArrayList();
                                                for (Object obj5 : arrayList) {
                                                    if (((String) obj5).length() > 0) {
                                                        arrayList2.add(obj5);
                                                    }
                                                }
                                                Set setM8412U1 = AbstractC4166m.m8412U1(arrayList2);
                                                if (!(setM8412U1 instanceof Collection) || !setM8412U1.isEmpty()) {
                                                    Iterator it3 = setM8412U1.iterator();
                                                    while (it3.hasNext()) {
                                                        if (AbstractC3156t.m6734X((String) it3.next(), strBodyContent)) {
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        C5724q.f23297a.execute(new RunnableC3737b(context3, c5725r, c2351o, 11));
                                    }
                                    break;
                                default:
                                    C3742g c3742g5 = c3742g;
                                    AtomicInteger atomicInteger = AbstractC5737d.f23377a;
                                    AbstractC5737d.m10419c(c3742g5.f12143a, c2351o);
                                    break;
                            }
                        }
                    }));
                } else {
                    AbstractC1184v0.m3203m("[Hchat:CustomNotification] 消息观察 API 未就绪");
                }
                break;
            case 1:
                ((C1085e) obj).getClass();
                C3740e.m7759f(12, new C0035c((C2027u) obj3, 18, (C3742g) obj2), "moments_fake_interaction_sns_menu", "朋友圈伪互动", null);
                break;
            case 2:
                ((C1085e) obj).getClass();
                Handler handler = C3740e.f12138a;
                C3740e.m7759f(8, new C0035c((C0215a) obj3, 22, (C3742g) obj2), "auto_redpacket", "自动抢红包", enumC3738c);
                break;
            case 3:
            case 5:
            case 6:
            case 10:
            case 12:
            default:
                C0438g c0438g2 = (C0438g) obj3;
                final C3742g c3742g2 = (C3742g) obj2;
                ((C1085e) obj).getClass();
                WeChatApis.message().getClass();
                C2352p c2352p2 = WeChatApis.messageObserveApi;
                if (c2352p2 != null) {
                    c0438g2.m7753j(c2352p2.m5640e(new InterfaceC2350n() { // from class: e9.b
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        /* JADX WARN: Removed duplicated region for block: B:155:0x0251  */
                        /* JADX WARN: Removed duplicated region for block: B:159:0x025c  */
                        /* JADX WARN: Removed duplicated region for block: B:186:0x02a3  */
                        /* JADX WARN: Removed duplicated region for block: B:195:0x02bf  */
                        /* JADX WARN: Removed duplicated region for block: B:217:0x0305  */
                        /* JADX WARN: Removed duplicated region for block: B:219:0x0308  */
                        /* JADX WARN: Removed duplicated region for block: B:222:0x030f  */
                        /* JADX WARN: Removed duplicated region for block: B:226:0x0317  */
                        /* JADX WARN: Removed duplicated region for block: B:229:0x031e  */
                        /* JADX WARN: Removed duplicated region for block: B:231:0x0326  */
                        /* JADX WARN: Removed duplicated region for block: B:232:0x0328  */
                        /* JADX WARN: Removed duplicated region for block: B:237:0x0337  */
                        /* JADX WARN: Removed duplicated region for block: B:242:0x0347  */
                        @Override // p153k8.InterfaceC2350n
                        /* JADX INFO: renamed from: a */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void mo973a(C2351o c2351o) {
                            C0832c c0832cM2150a;
                            boolean zBooleanValue;
                            String strM3731t;
                            String strBodyContent;
                            Object c3959f;
                            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
                            Object next;
                            int i13;
                            WeChatMessage weChatMessage;
                            int i14 = i11;
                            boolean z9 = false;
                            String str = HttpUrl.FRAGMENT_ENCODE_SET;
                            switch (i14) {
                                case 0:
                                    C3742g c3742g22 = c3742g2;
                                    AtomicBoolean atomicBoolean = C0846q.f2580a;
                                    Context context = c3742g22.f12143a;
                                    String str2 = c2351o.f7717e;
                                    WeChatMessage weChatMessage2 = c2351o.f7723k;
                                    String strM5617d = c2351o.f7715c;
                                    ConcurrentHashMap concurrentHashMap = AbstractC4137b.f13632a;
                                    if (AbstractC4302b.m8640c(context, "Hchat_block_at_all_notification_config").getBoolean("block_at_all_notification_enable", false)) {
                                        String strM5617d2 = AbstractC3149m.m6721t0(strM5617d) ? c2351o.m5617d() : strM5617d;
                                        strM5617d2.getClass();
                                        if (AbstractC3165h.m6782i(context, strM5617d2) && AbstractC4137b.m8325a(c2351o, strM5617d2)) {
                                        }
                                    }
                                    C0848s c0848s = new C0848s(context);
                                    if (c0848s.m2151b("custom_notification_enable") && !c2351o.f7721i && !c2351o.m5630q()) {
                                        String strM5617d3 = AbstractC3149m.m6721t0(strM5617d) ? c2351o.m5617d() : strM5617d;
                                        strM5617d3.getClass();
                                        if (!AbstractC3149m.m6721t0(strM5617d3)) {
                                            String strBodyContent2 = weChatMessage2 != null ? weChatMessage2.bodyContent() : null;
                                            if (strBodyContent2 == null) {
                                                strBodyContent2 = HttpUrl.FRAGMENT_ENCODE_SET;
                                            }
                                            if (AbstractC3149m.m6721t0(strBodyContent2)) {
                                                strBodyContent2 = str2;
                                            }
                                            WeChatMessage weChatMessage3 = c2351o.f7723k;
                                            if ((weChatMessage3 != null ? weChatMessage3.getType() : 0) != 37) {
                                                strBodyContent2.getClass();
                                                if (!AbstractC3149m.m6709h0(strBodyContent2, "antispamticket", true) && !AbstractC3149m.m6709h0(strBodyContent2, "verify_ticket", true) && !AbstractC3149m.m6709h0(strBodyContent2, "encryptusername", true) && !AbstractC3149m.m6709h0(strBodyContent2, "fmessage", true) && (c0832cM2150a = c0848s.m2150a(strM5617d3)) != null && c0832cM2150a.f2515f && c0832cM2150a.f2516g != 0 && !c2351o.m5632s() && !c2351o.m5628o()) {
                                                    if (!("recalled".equals(c2351o.f7714b) || ((weChatMessage = c2351o.f7723k) != null && weChatMessage.isRecalled()))) {
                                                        WeChatApis.interaction().getClass();
                                                        C3458m c3458m = WeChatApis.chatPageApi;
                                                        String strM7258a = c3458m != null ? c3458m.m7258a() : null;
                                                        if (strM7258a == null) {
                                                            strM7258a = HttpUrl.FRAGMENT_ENCODE_SET;
                                                        }
                                                        if (!strM7258a.equals(strM5617d3) || c3458m == null) {
                                                            zBooleanValue = false;
                                                        } else {
                                                            C3460o c3460o = c3458m.f11212b;
                                                            Activity activityM7263a = c3460o != null ? c3460o.m7263a() : null;
                                                            if (activityM7263a == null) {
                                                                boolean z10 = !TextUtils.isEmpty(c3458m.f11220j);
                                                                if (z10) {
                                                                    Object systemService = context.getSystemService("activity");
                                                                    ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
                                                                    if (activityManager != null) {
                                                                        int iMyPid = Process.myPid();
                                                                        try {
                                                                            runningAppProcesses = activityManager.getRunningAppProcesses();
                                                                        } catch (Throwable th2) {
                                                                            c3959f = new C3959f(th2);
                                                                        }
                                                                        if (runningAppProcesses != null) {
                                                                            Iterator<T> it = runningAppProcesses.iterator();
                                                                            while (true) {
                                                                                if (it.hasNext()) {
                                                                                    next = it.next();
                                                                                    if (((ActivityManager.RunningAppProcessInfo) next).pid == iMyPid) {
                                                                                    }
                                                                                } else {
                                                                                    next = null;
                                                                                }
                                                                            }
                                                                            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) next;
                                                                            boolean z11 = runningAppProcessInfo == null || (i13 = runningAppProcessInfo.importance) == 100 || i13 == 200;
                                                                            c3959f = Boolean.valueOf(z11);
                                                                            Object obj4 = Boolean.TRUE;
                                                                            if (c3959f instanceof C3959f) {
                                                                                c3959f = obj4;
                                                                            }
                                                                            zBooleanValue = ((Boolean) c3959f).booleanValue();
                                                                        }
                                                                    } else {
                                                                        zBooleanValue = true;
                                                                    }
                                                                }
                                                            } else {
                                                                String name = activityM7263a.getClass().getName();
                                                                if ("com.tencent.mm.ui.chatting.ChattingUI".equals(name) || name.contains(".ui.chatting.")) {
                                                                }
                                                            }
                                                        }
                                                        if (!zBooleanValue && !C0846q.m2126k(c0832cM2150a)) {
                                                            boolean z12 = c0832cM2150a.f2513d;
                                                            String str3 = c0832cM2150a.f2532w;
                                                            String str4 = c0832cM2150a.f2531v;
                                                            if (z12) {
                                                                if (AbstractC3149m.m6721t0(strM5617d)) {
                                                                    strM5617d = c2351o.m5617d();
                                                                }
                                                                String strM5616c = c2351o.f7716d;
                                                                if (AbstractC3149m.m6721t0(strM5616c)) {
                                                                    strM5616c = c2351o.m5616c();
                                                                }
                                                                strM5616c.getClass();
                                                                if (AbstractC3149m.m6721t0(strM5616c)) {
                                                                    strM3731t = HttpUrl.FRAGMENT_ENCODE_SET;
                                                                    strBodyContent = weChatMessage2 != null ? weChatMessage2.bodyContent() : null;
                                                                    if (strBodyContent != null) {
                                                                        str = strBodyContent;
                                                                    }
                                                                    if (!AbstractC3149m.m6721t0(str)) {
                                                                        str2 = str;
                                                                    }
                                                                    if (AbstractC3149m.m6721t0(str4)) {
                                                                        Set set = C0848s.f2595b;
                                                                        if (!C0847r.m2144c(str4, strM5616c, strM3731t, str2)) {
                                                                            z9 = true;
                                                                        } else if (!AbstractC3149m.m6721t0(str3)) {
                                                                            Set set2 = C0848s.f2595b;
                                                                            if (!C0847r.m2144c(str3, strM5616c, strM3731t, str2)) {
                                                                                if (c0832cM2150a.f2529t) {
                                                                                    ConcurrentHashMap concurrentHashMap2 = AbstractC4137b.f13632a;
                                                                                    strM5617d.getClass();
                                                                                    if (!AbstractC4137b.m8325a(c2351o, strM5617d)) {
                                                                                        if (!c0832cM2150a.f2530u || !c2351o.m5620g()) {
                                                                                            z9 = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    C1368i c1368iM9259c = AbstractC4855en.m9259c();
                                                                    strM3731t = c1368iM9259c != null ? c1368iM9259c.m3731t(c0832cM2150a.f2511b, strM5616c) : null;
                                                                    if (strM3731t == null) {
                                                                    }
                                                                    if (weChatMessage2 != null) {
                                                                    }
                                                                    if (strBodyContent != null) {
                                                                    }
                                                                    if (!AbstractC3149m.m6721t0(str)) {
                                                                    }
                                                                    if (AbstractC3149m.m6721t0(str4)) {
                                                                    }
                                                                }
                                                            }
                                                            if (!z9) {
                                                                C0846q.f2585f.postDelayed(new RunnableC0833d(strM5617d3, c0832cM2150a, context, c2351o, 1), 900L);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    break;
                                case 1:
                                    C3742g c3742g3 = c3742g2;
                                    ConcurrentHashMap concurrentHashMap3 = AbstractC4137b.f13632a;
                                    Context context2 = c3742g3.f12143a;
                                    if (!AbstractC4302b.m8640c(context2, "Hchat_block_at_all_notification_config").getBoolean("block_at_all_notification_enable", false)) {
                                        AbstractC4137b.f13632a.clear();
                                        break;
                                    } else {
                                        String strM5617d4 = c2351o.f7715c;
                                        if (AbstractC3149m.m6721t0(strM5617d4)) {
                                            strM5617d4 = c2351o.m5617d();
                                        }
                                        strM5617d4.getClass();
                                        boolean zM6782i = AbstractC3165h.m6782i(context2, strM5617d4);
                                        boolean zM8325a = AbstractC4137b.m8325a(c2351o, strM5617d4);
                                        WeChatMessage weChatMessage4 = c2351o.f7723k;
                                        long j3 = weChatMessage4 != null ? weChatMessage4.msgSvrId : 0L;
                                        if (zM6782i && zM8325a) {
                                            AbstractC4137b.m8327c(context2, strM5617d4, j3);
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    C3742g c3742g4 = c3742g2;
                                    ExecutorService executorService = C5724q.f23297a;
                                    Context context3 = c3742g4.f12143a;
                                    C5725r c5725r = new C5725r(context3);
                                    if (c5725r.m10385e("auto_reply_enable") && !c2351o.m5630q()) {
                                        String strM5617d5 = c2351o.f7715c;
                                        if (AbstractC3149m.m6721t0(strM5617d5)) {
                                            strM5617d5 = c2351o.m5617d();
                                        }
                                        if (c5725r.m10385e("excluded_talkers_enable")) {
                                            strBodyContent = strM5617d5 != null ? AbstractC3149m.m6703R0(strM5617d5).toString() : null;
                                            if (strBodyContent == null) {
                                                strBodyContent = HttpUrl.FRAGMENT_ENCODE_SET;
                                            }
                                            if (strBodyContent.length() != 0) {
                                                List listM6691F0 = AbstractC3149m.m6691F0(c5725r.m10388h("excluded_talkers", HttpUrl.FRAGMENT_ENCODE_SET), new char[]{',', 65292, ';', 65307, '\n', '\r'}, 6);
                                                ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(listM6691F0));
                                                Iterator it2 = listM6691F0.iterator();
                                                while (it2.hasNext()) {
                                                    AbstractC2091b.m5171r((String) it2.next(), arrayList);
                                                }
                                                ArrayList arrayList2 = new ArrayList();
                                                for (Object obj5 : arrayList) {
                                                    if (((String) obj5).length() > 0) {
                                                        arrayList2.add(obj5);
                                                    }
                                                }
                                                Set setM8412U1 = AbstractC4166m.m8412U1(arrayList2);
                                                if (!(setM8412U1 instanceof Collection) || !setM8412U1.isEmpty()) {
                                                    Iterator it3 = setM8412U1.iterator();
                                                    while (it3.hasNext()) {
                                                        if (AbstractC3156t.m6734X((String) it3.next(), strBodyContent)) {
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        C5724q.f23297a.execute(new RunnableC3737b(context3, c5725r, c2351o, 11));
                                    }
                                    break;
                                default:
                                    C3742g c3742g5 = c3742g2;
                                    AtomicInteger atomicInteger = AbstractC5737d.f23377a;
                                    AbstractC5737d.m10419c(c3742g5.f12143a, c2351o);
                                    break;
                            }
                        }
                    }));
                } else {
                    AbstractC1184v0.m3203m("[Hchat:KeywordNotification] 消息观察 API 未就绪");
                }
                break;
            case 4:
                ((C1085e) obj).getClass();
                Handler handler2 = C3740e.f12138a;
                C3740e.m7759f(8, new C0434f((C3742g) obj2, 6), "shared:send_button", "聊天发送按钮", enumC3738c);
                C3740e.m7759f(12, new C1746e0((C3113f) obj3, 10), "text_voice", "文本转语音", null);
                break;
            case 7:
                ((C1085e) obj).getClass();
                C3740e.m7759f(12, new C0035c((C3943c) obj3, 29, (C3742g) obj2), "anti_recall", "防撤回", null);
                break;
            case 8:
                C0438g c0438g3 = (C0438g) obj3;
                final C3742g c3742g3 = (C3742g) obj2;
                ((C1085e) obj).getClass();
                WeChatApis.message().getClass();
                C2352p c2352p3 = WeChatApis.messageObserveApi;
                if (c2352p3 != null) {
                    c0438g3.m7753j(c2352p3.m5640e(new InterfaceC2350n() { // from class: e9.b
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        /* JADX WARN: Removed duplicated region for block: B:155:0x0251  */
                        /* JADX WARN: Removed duplicated region for block: B:159:0x025c  */
                        /* JADX WARN: Removed duplicated region for block: B:186:0x02a3  */
                        /* JADX WARN: Removed duplicated region for block: B:195:0x02bf  */
                        /* JADX WARN: Removed duplicated region for block: B:217:0x0305  */
                        /* JADX WARN: Removed duplicated region for block: B:219:0x0308  */
                        /* JADX WARN: Removed duplicated region for block: B:222:0x030f  */
                        /* JADX WARN: Removed duplicated region for block: B:226:0x0317  */
                        /* JADX WARN: Removed duplicated region for block: B:229:0x031e  */
                        /* JADX WARN: Removed duplicated region for block: B:231:0x0326  */
                        /* JADX WARN: Removed duplicated region for block: B:232:0x0328  */
                        /* JADX WARN: Removed duplicated region for block: B:237:0x0337  */
                        /* JADX WARN: Removed duplicated region for block: B:242:0x0347  */
                        @Override // p153k8.InterfaceC2350n
                        /* JADX INFO: renamed from: a */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void mo973a(C2351o c2351o) {
                            C0832c c0832cM2150a;
                            boolean zBooleanValue;
                            String strM3731t;
                            String strBodyContent;
                            Object c3959f;
                            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
                            Object next;
                            int i13;
                            WeChatMessage weChatMessage;
                            int i14 = i10;
                            boolean z9 = false;
                            String str = HttpUrl.FRAGMENT_ENCODE_SET;
                            switch (i14) {
                                case 0:
                                    C3742g c3742g22 = c3742g3;
                                    AtomicBoolean atomicBoolean = C0846q.f2580a;
                                    Context context = c3742g22.f12143a;
                                    String str2 = c2351o.f7717e;
                                    WeChatMessage weChatMessage2 = c2351o.f7723k;
                                    String strM5617d = c2351o.f7715c;
                                    ConcurrentHashMap concurrentHashMap = AbstractC4137b.f13632a;
                                    if (AbstractC4302b.m8640c(context, "Hchat_block_at_all_notification_config").getBoolean("block_at_all_notification_enable", false)) {
                                        String strM5617d2 = AbstractC3149m.m6721t0(strM5617d) ? c2351o.m5617d() : strM5617d;
                                        strM5617d2.getClass();
                                        if (AbstractC3165h.m6782i(context, strM5617d2) && AbstractC4137b.m8325a(c2351o, strM5617d2)) {
                                        }
                                    }
                                    C0848s c0848s = new C0848s(context);
                                    if (c0848s.m2151b("custom_notification_enable") && !c2351o.f7721i && !c2351o.m5630q()) {
                                        String strM5617d3 = AbstractC3149m.m6721t0(strM5617d) ? c2351o.m5617d() : strM5617d;
                                        strM5617d3.getClass();
                                        if (!AbstractC3149m.m6721t0(strM5617d3)) {
                                            String strBodyContent2 = weChatMessage2 != null ? weChatMessage2.bodyContent() : null;
                                            if (strBodyContent2 == null) {
                                                strBodyContent2 = HttpUrl.FRAGMENT_ENCODE_SET;
                                            }
                                            if (AbstractC3149m.m6721t0(strBodyContent2)) {
                                                strBodyContent2 = str2;
                                            }
                                            WeChatMessage weChatMessage3 = c2351o.f7723k;
                                            if ((weChatMessage3 != null ? weChatMessage3.getType() : 0) != 37) {
                                                strBodyContent2.getClass();
                                                if (!AbstractC3149m.m6709h0(strBodyContent2, "antispamticket", true) && !AbstractC3149m.m6709h0(strBodyContent2, "verify_ticket", true) && !AbstractC3149m.m6709h0(strBodyContent2, "encryptusername", true) && !AbstractC3149m.m6709h0(strBodyContent2, "fmessage", true) && (c0832cM2150a = c0848s.m2150a(strM5617d3)) != null && c0832cM2150a.f2515f && c0832cM2150a.f2516g != 0 && !c2351o.m5632s() && !c2351o.m5628o()) {
                                                    if (!("recalled".equals(c2351o.f7714b) || ((weChatMessage = c2351o.f7723k) != null && weChatMessage.isRecalled()))) {
                                                        WeChatApis.interaction().getClass();
                                                        C3458m c3458m = WeChatApis.chatPageApi;
                                                        String strM7258a = c3458m != null ? c3458m.m7258a() : null;
                                                        if (strM7258a == null) {
                                                            strM7258a = HttpUrl.FRAGMENT_ENCODE_SET;
                                                        }
                                                        if (!strM7258a.equals(strM5617d3) || c3458m == null) {
                                                            zBooleanValue = false;
                                                        } else {
                                                            C3460o c3460o = c3458m.f11212b;
                                                            Activity activityM7263a = c3460o != null ? c3460o.m7263a() : null;
                                                            if (activityM7263a == null) {
                                                                boolean z10 = !TextUtils.isEmpty(c3458m.f11220j);
                                                                if (z10) {
                                                                    Object systemService = context.getSystemService("activity");
                                                                    ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
                                                                    if (activityManager != null) {
                                                                        int iMyPid = Process.myPid();
                                                                        try {
                                                                            runningAppProcesses = activityManager.getRunningAppProcesses();
                                                                        } catch (Throwable th2) {
                                                                            c3959f = new C3959f(th2);
                                                                        }
                                                                        if (runningAppProcesses != null) {
                                                                            Iterator<T> it = runningAppProcesses.iterator();
                                                                            while (true) {
                                                                                if (it.hasNext()) {
                                                                                    next = it.next();
                                                                                    if (((ActivityManager.RunningAppProcessInfo) next).pid == iMyPid) {
                                                                                    }
                                                                                } else {
                                                                                    next = null;
                                                                                }
                                                                            }
                                                                            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) next;
                                                                            boolean z11 = runningAppProcessInfo == null || (i13 = runningAppProcessInfo.importance) == 100 || i13 == 200;
                                                                            c3959f = Boolean.valueOf(z11);
                                                                            Object obj4 = Boolean.TRUE;
                                                                            if (c3959f instanceof C3959f) {
                                                                                c3959f = obj4;
                                                                            }
                                                                            zBooleanValue = ((Boolean) c3959f).booleanValue();
                                                                        }
                                                                    } else {
                                                                        zBooleanValue = true;
                                                                    }
                                                                }
                                                            } else {
                                                                String name = activityM7263a.getClass().getName();
                                                                if ("com.tencent.mm.ui.chatting.ChattingUI".equals(name) || name.contains(".ui.chatting.")) {
                                                                }
                                                            }
                                                        }
                                                        if (!zBooleanValue && !C0846q.m2126k(c0832cM2150a)) {
                                                            boolean z12 = c0832cM2150a.f2513d;
                                                            String str3 = c0832cM2150a.f2532w;
                                                            String str4 = c0832cM2150a.f2531v;
                                                            if (z12) {
                                                                if (AbstractC3149m.m6721t0(strM5617d)) {
                                                                    strM5617d = c2351o.m5617d();
                                                                }
                                                                String strM5616c = c2351o.f7716d;
                                                                if (AbstractC3149m.m6721t0(strM5616c)) {
                                                                    strM5616c = c2351o.m5616c();
                                                                }
                                                                strM5616c.getClass();
                                                                if (AbstractC3149m.m6721t0(strM5616c)) {
                                                                    strM3731t = HttpUrl.FRAGMENT_ENCODE_SET;
                                                                    strBodyContent = weChatMessage2 != null ? weChatMessage2.bodyContent() : null;
                                                                    if (strBodyContent != null) {
                                                                        str = strBodyContent;
                                                                    }
                                                                    if (!AbstractC3149m.m6721t0(str)) {
                                                                        str2 = str;
                                                                    }
                                                                    if (AbstractC3149m.m6721t0(str4)) {
                                                                        Set set = C0848s.f2595b;
                                                                        if (!C0847r.m2144c(str4, strM5616c, strM3731t, str2)) {
                                                                            z9 = true;
                                                                        } else if (!AbstractC3149m.m6721t0(str3)) {
                                                                            Set set2 = C0848s.f2595b;
                                                                            if (!C0847r.m2144c(str3, strM5616c, strM3731t, str2)) {
                                                                                if (c0832cM2150a.f2529t) {
                                                                                    ConcurrentHashMap concurrentHashMap2 = AbstractC4137b.f13632a;
                                                                                    strM5617d.getClass();
                                                                                    if (!AbstractC4137b.m8325a(c2351o, strM5617d)) {
                                                                                        if (!c0832cM2150a.f2530u || !c2351o.m5620g()) {
                                                                                            z9 = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    C1368i c1368iM9259c = AbstractC4855en.m9259c();
                                                                    strM3731t = c1368iM9259c != null ? c1368iM9259c.m3731t(c0832cM2150a.f2511b, strM5616c) : null;
                                                                    if (strM3731t == null) {
                                                                    }
                                                                    if (weChatMessage2 != null) {
                                                                    }
                                                                    if (strBodyContent != null) {
                                                                    }
                                                                    if (!AbstractC3149m.m6721t0(str)) {
                                                                    }
                                                                    if (AbstractC3149m.m6721t0(str4)) {
                                                                    }
                                                                }
                                                            }
                                                            if (!z9) {
                                                                C0846q.f2585f.postDelayed(new RunnableC0833d(strM5617d3, c0832cM2150a, context, c2351o, 1), 900L);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    break;
                                case 1:
                                    C3742g c3742g32 = c3742g3;
                                    ConcurrentHashMap concurrentHashMap3 = AbstractC4137b.f13632a;
                                    Context context2 = c3742g32.f12143a;
                                    if (!AbstractC4302b.m8640c(context2, "Hchat_block_at_all_notification_config").getBoolean("block_at_all_notification_enable", false)) {
                                        AbstractC4137b.f13632a.clear();
                                        break;
                                    } else {
                                        String strM5617d4 = c2351o.f7715c;
                                        if (AbstractC3149m.m6721t0(strM5617d4)) {
                                            strM5617d4 = c2351o.m5617d();
                                        }
                                        strM5617d4.getClass();
                                        boolean zM6782i = AbstractC3165h.m6782i(context2, strM5617d4);
                                        boolean zM8325a = AbstractC4137b.m8325a(c2351o, strM5617d4);
                                        WeChatMessage weChatMessage4 = c2351o.f7723k;
                                        long j3 = weChatMessage4 != null ? weChatMessage4.msgSvrId : 0L;
                                        if (zM6782i && zM8325a) {
                                            AbstractC4137b.m8327c(context2, strM5617d4, j3);
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    C3742g c3742g4 = c3742g3;
                                    ExecutorService executorService = C5724q.f23297a;
                                    Context context3 = c3742g4.f12143a;
                                    C5725r c5725r = new C5725r(context3);
                                    if (c5725r.m10385e("auto_reply_enable") && !c2351o.m5630q()) {
                                        String strM5617d5 = c2351o.f7715c;
                                        if (AbstractC3149m.m6721t0(strM5617d5)) {
                                            strM5617d5 = c2351o.m5617d();
                                        }
                                        if (c5725r.m10385e("excluded_talkers_enable")) {
                                            strBodyContent = strM5617d5 != null ? AbstractC3149m.m6703R0(strM5617d5).toString() : null;
                                            if (strBodyContent == null) {
                                                strBodyContent = HttpUrl.FRAGMENT_ENCODE_SET;
                                            }
                                            if (strBodyContent.length() != 0) {
                                                List listM6691F0 = AbstractC3149m.m6691F0(c5725r.m10388h("excluded_talkers", HttpUrl.FRAGMENT_ENCODE_SET), new char[]{',', 65292, ';', 65307, '\n', '\r'}, 6);
                                                ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(listM6691F0));
                                                Iterator it2 = listM6691F0.iterator();
                                                while (it2.hasNext()) {
                                                    AbstractC2091b.m5171r((String) it2.next(), arrayList);
                                                }
                                                ArrayList arrayList2 = new ArrayList();
                                                for (Object obj5 : arrayList) {
                                                    if (((String) obj5).length() > 0) {
                                                        arrayList2.add(obj5);
                                                    }
                                                }
                                                Set setM8412U1 = AbstractC4166m.m8412U1(arrayList2);
                                                if (!(setM8412U1 instanceof Collection) || !setM8412U1.isEmpty()) {
                                                    Iterator it3 = setM8412U1.iterator();
                                                    while (it3.hasNext()) {
                                                        if (AbstractC3156t.m6734X((String) it3.next(), strBodyContent)) {
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        C5724q.f23297a.execute(new RunnableC3737b(context3, c5725r, c2351o, 11));
                                    }
                                    break;
                                default:
                                    C3742g c3742g5 = c3742g3;
                                    AtomicInteger atomicInteger = AbstractC5737d.f23377a;
                                    AbstractC5737d.m10419c(c3742g5.f12143a, c2351o);
                                    break;
                            }
                        }
                    }));
                } else {
                    AbstractC1184v0.m3203m("[Hchat:BlockAtAllNotification] 消息观察 API 未就绪");
                }
                break;
            case 9:
                ((C1085e) obj).getClass();
                Handler handler3 = C3740e.f12138a;
                C3740e.m7759f(8, new C4056v1((C3742g) obj2, i10, (C4291b) obj3), "auto_transfer", "自动收款", enumC3738c);
                break;
            case 11:
                C0215a c0215a = (C0215a) obj3;
                C3742g c3742g4 = (C3742g) obj2;
                ((C1085e) obj).getClass();
                if (((C4537q) c0215a.f524f) == null) {
                    WeChatApis.message().getClass();
                    C2352p c2352p4 = WeChatApis.messageObserveApi;
                    if (c2352p4 != null) {
                        C4537q c4537q = new C4537q(c3742g4.f12143a, new C1954y(28));
                        c0215a.f524f = c4537q;
                        c0215a.m7753j(c2352p4.m5640e(new C2915c(c4537q, i11)));
                    } else {
                        AbstractC1184v0.m3203m("[Hchat:AutoMessageForward] 消息观察 API 未就绪");
                    }
                    break;
                }
                break;
            case 13:
                ((C1085e) obj).getClass();
                Handler handler4 = C3740e.f12138a;
                C3740e.m7759f(8, new C4056v1((C3742g) obj2, 5, (C0438g) obj3), "protobuf_packet", "Protobuf", enumC3738c);
                break;
            case 14:
                C0438g c0438g4 = (C0438g) obj3;
                final C3742g c3742g5 = (C3742g) obj2;
                ((C1085e) obj).getClass();
                WeChatApis.message().getClass();
                C2352p c2352p5 = WeChatApis.messageObserveApi;
                if (c2352p5 == null) {
                    AbstractC1184v0.m3203m("[Hchat:AutoReply] 消息观察 API 未就绪");
                } else {
                    final int i13 = 2;
                    c0438g4.m7753j(c2352p5.m5640e(new InterfaceC2350n() { // from class: e9.b
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        /* JADX WARN: Removed duplicated region for block: B:155:0x0251  */
                        /* JADX WARN: Removed duplicated region for block: B:159:0x025c  */
                        /* JADX WARN: Removed duplicated region for block: B:186:0x02a3  */
                        /* JADX WARN: Removed duplicated region for block: B:195:0x02bf  */
                        /* JADX WARN: Removed duplicated region for block: B:217:0x0305  */
                        /* JADX WARN: Removed duplicated region for block: B:219:0x0308  */
                        /* JADX WARN: Removed duplicated region for block: B:222:0x030f  */
                        /* JADX WARN: Removed duplicated region for block: B:226:0x0317  */
                        /* JADX WARN: Removed duplicated region for block: B:229:0x031e  */
                        /* JADX WARN: Removed duplicated region for block: B:231:0x0326  */
                        /* JADX WARN: Removed duplicated region for block: B:232:0x0328  */
                        /* JADX WARN: Removed duplicated region for block: B:237:0x0337  */
                        /* JADX WARN: Removed duplicated region for block: B:242:0x0347  */
                        @Override // p153k8.InterfaceC2350n
                        /* JADX INFO: renamed from: a */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void mo973a(C2351o c2351o) {
                            C0832c c0832cM2150a;
                            boolean zBooleanValue;
                            String strM3731t;
                            String strBodyContent;
                            Object c3959f;
                            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
                            Object next;
                            int i132;
                            WeChatMessage weChatMessage;
                            int i14 = i13;
                            boolean z9 = false;
                            String str = HttpUrl.FRAGMENT_ENCODE_SET;
                            switch (i14) {
                                case 0:
                                    C3742g c3742g22 = c3742g5;
                                    AtomicBoolean atomicBoolean = C0846q.f2580a;
                                    Context context = c3742g22.f12143a;
                                    String str2 = c2351o.f7717e;
                                    WeChatMessage weChatMessage2 = c2351o.f7723k;
                                    String strM5617d = c2351o.f7715c;
                                    ConcurrentHashMap concurrentHashMap = AbstractC4137b.f13632a;
                                    if (AbstractC4302b.m8640c(context, "Hchat_block_at_all_notification_config").getBoolean("block_at_all_notification_enable", false)) {
                                        String strM5617d2 = AbstractC3149m.m6721t0(strM5617d) ? c2351o.m5617d() : strM5617d;
                                        strM5617d2.getClass();
                                        if (AbstractC3165h.m6782i(context, strM5617d2) && AbstractC4137b.m8325a(c2351o, strM5617d2)) {
                                        }
                                    }
                                    C0848s c0848s = new C0848s(context);
                                    if (c0848s.m2151b("custom_notification_enable") && !c2351o.f7721i && !c2351o.m5630q()) {
                                        String strM5617d3 = AbstractC3149m.m6721t0(strM5617d) ? c2351o.m5617d() : strM5617d;
                                        strM5617d3.getClass();
                                        if (!AbstractC3149m.m6721t0(strM5617d3)) {
                                            String strBodyContent2 = weChatMessage2 != null ? weChatMessage2.bodyContent() : null;
                                            if (strBodyContent2 == null) {
                                                strBodyContent2 = HttpUrl.FRAGMENT_ENCODE_SET;
                                            }
                                            if (AbstractC3149m.m6721t0(strBodyContent2)) {
                                                strBodyContent2 = str2;
                                            }
                                            WeChatMessage weChatMessage3 = c2351o.f7723k;
                                            if ((weChatMessage3 != null ? weChatMessage3.getType() : 0) != 37) {
                                                strBodyContent2.getClass();
                                                if (!AbstractC3149m.m6709h0(strBodyContent2, "antispamticket", true) && !AbstractC3149m.m6709h0(strBodyContent2, "verify_ticket", true) && !AbstractC3149m.m6709h0(strBodyContent2, "encryptusername", true) && !AbstractC3149m.m6709h0(strBodyContent2, "fmessage", true) && (c0832cM2150a = c0848s.m2150a(strM5617d3)) != null && c0832cM2150a.f2515f && c0832cM2150a.f2516g != 0 && !c2351o.m5632s() && !c2351o.m5628o()) {
                                                    if (!("recalled".equals(c2351o.f7714b) || ((weChatMessage = c2351o.f7723k) != null && weChatMessage.isRecalled()))) {
                                                        WeChatApis.interaction().getClass();
                                                        C3458m c3458m = WeChatApis.chatPageApi;
                                                        String strM7258a = c3458m != null ? c3458m.m7258a() : null;
                                                        if (strM7258a == null) {
                                                            strM7258a = HttpUrl.FRAGMENT_ENCODE_SET;
                                                        }
                                                        if (!strM7258a.equals(strM5617d3) || c3458m == null) {
                                                            zBooleanValue = false;
                                                        } else {
                                                            C3460o c3460o = c3458m.f11212b;
                                                            Activity activityM7263a = c3460o != null ? c3460o.m7263a() : null;
                                                            if (activityM7263a == null) {
                                                                boolean z10 = !TextUtils.isEmpty(c3458m.f11220j);
                                                                if (z10) {
                                                                    Object systemService = context.getSystemService("activity");
                                                                    ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
                                                                    if (activityManager != null) {
                                                                        int iMyPid = Process.myPid();
                                                                        try {
                                                                            runningAppProcesses = activityManager.getRunningAppProcesses();
                                                                        } catch (Throwable th2) {
                                                                            c3959f = new C3959f(th2);
                                                                        }
                                                                        if (runningAppProcesses != null) {
                                                                            Iterator<T> it = runningAppProcesses.iterator();
                                                                            while (true) {
                                                                                if (it.hasNext()) {
                                                                                    next = it.next();
                                                                                    if (((ActivityManager.RunningAppProcessInfo) next).pid == iMyPid) {
                                                                                    }
                                                                                } else {
                                                                                    next = null;
                                                                                }
                                                                            }
                                                                            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) next;
                                                                            boolean z11 = runningAppProcessInfo == null || (i132 = runningAppProcessInfo.importance) == 100 || i132 == 200;
                                                                            c3959f = Boolean.valueOf(z11);
                                                                            Object obj4 = Boolean.TRUE;
                                                                            if (c3959f instanceof C3959f) {
                                                                                c3959f = obj4;
                                                                            }
                                                                            zBooleanValue = ((Boolean) c3959f).booleanValue();
                                                                        }
                                                                    } else {
                                                                        zBooleanValue = true;
                                                                    }
                                                                }
                                                            } else {
                                                                String name = activityM7263a.getClass().getName();
                                                                if ("com.tencent.mm.ui.chatting.ChattingUI".equals(name) || name.contains(".ui.chatting.")) {
                                                                }
                                                            }
                                                        }
                                                        if (!zBooleanValue && !C0846q.m2126k(c0832cM2150a)) {
                                                            boolean z12 = c0832cM2150a.f2513d;
                                                            String str3 = c0832cM2150a.f2532w;
                                                            String str4 = c0832cM2150a.f2531v;
                                                            if (z12) {
                                                                if (AbstractC3149m.m6721t0(strM5617d)) {
                                                                    strM5617d = c2351o.m5617d();
                                                                }
                                                                String strM5616c = c2351o.f7716d;
                                                                if (AbstractC3149m.m6721t0(strM5616c)) {
                                                                    strM5616c = c2351o.m5616c();
                                                                }
                                                                strM5616c.getClass();
                                                                if (AbstractC3149m.m6721t0(strM5616c)) {
                                                                    strM3731t = HttpUrl.FRAGMENT_ENCODE_SET;
                                                                    strBodyContent = weChatMessage2 != null ? weChatMessage2.bodyContent() : null;
                                                                    if (strBodyContent != null) {
                                                                        str = strBodyContent;
                                                                    }
                                                                    if (!AbstractC3149m.m6721t0(str)) {
                                                                        str2 = str;
                                                                    }
                                                                    if (AbstractC3149m.m6721t0(str4)) {
                                                                        Set set = C0848s.f2595b;
                                                                        if (!C0847r.m2144c(str4, strM5616c, strM3731t, str2)) {
                                                                            z9 = true;
                                                                        } else if (!AbstractC3149m.m6721t0(str3)) {
                                                                            Set set2 = C0848s.f2595b;
                                                                            if (!C0847r.m2144c(str3, strM5616c, strM3731t, str2)) {
                                                                                if (c0832cM2150a.f2529t) {
                                                                                    ConcurrentHashMap concurrentHashMap2 = AbstractC4137b.f13632a;
                                                                                    strM5617d.getClass();
                                                                                    if (!AbstractC4137b.m8325a(c2351o, strM5617d)) {
                                                                                        if (!c0832cM2150a.f2530u || !c2351o.m5620g()) {
                                                                                            z9 = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    C1368i c1368iM9259c = AbstractC4855en.m9259c();
                                                                    strM3731t = c1368iM9259c != null ? c1368iM9259c.m3731t(c0832cM2150a.f2511b, strM5616c) : null;
                                                                    if (strM3731t == null) {
                                                                    }
                                                                    if (weChatMessage2 != null) {
                                                                    }
                                                                    if (strBodyContent != null) {
                                                                    }
                                                                    if (!AbstractC3149m.m6721t0(str)) {
                                                                    }
                                                                    if (AbstractC3149m.m6721t0(str4)) {
                                                                    }
                                                                }
                                                            }
                                                            if (!z9) {
                                                                C0846q.f2585f.postDelayed(new RunnableC0833d(strM5617d3, c0832cM2150a, context, c2351o, 1), 900L);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    break;
                                case 1:
                                    C3742g c3742g32 = c3742g5;
                                    ConcurrentHashMap concurrentHashMap3 = AbstractC4137b.f13632a;
                                    Context context2 = c3742g32.f12143a;
                                    if (!AbstractC4302b.m8640c(context2, "Hchat_block_at_all_notification_config").getBoolean("block_at_all_notification_enable", false)) {
                                        AbstractC4137b.f13632a.clear();
                                        break;
                                    } else {
                                        String strM5617d4 = c2351o.f7715c;
                                        if (AbstractC3149m.m6721t0(strM5617d4)) {
                                            strM5617d4 = c2351o.m5617d();
                                        }
                                        strM5617d4.getClass();
                                        boolean zM6782i = AbstractC3165h.m6782i(context2, strM5617d4);
                                        boolean zM8325a = AbstractC4137b.m8325a(c2351o, strM5617d4);
                                        WeChatMessage weChatMessage4 = c2351o.f7723k;
                                        long j3 = weChatMessage4 != null ? weChatMessage4.msgSvrId : 0L;
                                        if (zM6782i && zM8325a) {
                                            AbstractC4137b.m8327c(context2, strM5617d4, j3);
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    C3742g c3742g42 = c3742g5;
                                    ExecutorService executorService = C5724q.f23297a;
                                    Context context3 = c3742g42.f12143a;
                                    C5725r c5725r = new C5725r(context3);
                                    if (c5725r.m10385e("auto_reply_enable") && !c2351o.m5630q()) {
                                        String strM5617d5 = c2351o.f7715c;
                                        if (AbstractC3149m.m6721t0(strM5617d5)) {
                                            strM5617d5 = c2351o.m5617d();
                                        }
                                        if (c5725r.m10385e("excluded_talkers_enable")) {
                                            strBodyContent = strM5617d5 != null ? AbstractC3149m.m6703R0(strM5617d5).toString() : null;
                                            if (strBodyContent == null) {
                                                strBodyContent = HttpUrl.FRAGMENT_ENCODE_SET;
                                            }
                                            if (strBodyContent.length() != 0) {
                                                List listM6691F0 = AbstractC3149m.m6691F0(c5725r.m10388h("excluded_talkers", HttpUrl.FRAGMENT_ENCODE_SET), new char[]{',', 65292, ';', 65307, '\n', '\r'}, 6);
                                                ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(listM6691F0));
                                                Iterator it2 = listM6691F0.iterator();
                                                while (it2.hasNext()) {
                                                    AbstractC2091b.m5171r((String) it2.next(), arrayList);
                                                }
                                                ArrayList arrayList2 = new ArrayList();
                                                for (Object obj5 : arrayList) {
                                                    if (((String) obj5).length() > 0) {
                                                        arrayList2.add(obj5);
                                                    }
                                                }
                                                Set setM8412U1 = AbstractC4166m.m8412U1(arrayList2);
                                                if (!(setM8412U1 instanceof Collection) || !setM8412U1.isEmpty()) {
                                                    Iterator it3 = setM8412U1.iterator();
                                                    while (it3.hasNext()) {
                                                        if (AbstractC3156t.m6734X((String) it3.next(), strBodyContent)) {
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        C5724q.f23297a.execute(new RunnableC3737b(context3, c5725r, c2351o, 11));
                                    }
                                    break;
                                default:
                                    C3742g c3742g52 = c3742g5;
                                    AtomicInteger atomicInteger = AbstractC5737d.f23377a;
                                    AbstractC5737d.m10419c(c3742g52.f12143a, c2351o);
                                    break;
                            }
                        }
                    }));
                }
                C0876k.f2687a.m2191j(c3742g5);
                C0876k.f2690d.add(new C0472o1(c3742g5));
                c0438g4.m7753j(new C0014a(9));
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:328:0x06c1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x06d5  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x06e0  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x06e2  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x06ff  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0164  */
    /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v44, types: [ef.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v56 */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r24v9 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r25v7 */
    /* JADX WARN: Type inference failed for: r25v8 */
    /* JADX WARN: Type inference failed for: r25v9 */
    /* JADX WARN: Type inference failed for: r2v115 */
    /* JADX WARN: Type inference failed for: r2v116 */
    /* JADX WARN: Type inference failed for: r2v40, types: [rf.b] */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v49, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v64 */
    /* JADX WARN: Type inference failed for: r2v65, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v70 */
    /* JADX WARN: Type inference failed for: r4v4, types: [mh.b] */
    /* JADX WARN: Type inference failed for: r5v33, types: [ef.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v34, types: [ef.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v55 */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v29, types: [java.util.TreeMap] */
    /* JADX WARN: Type inference failed for: r6v31, types: [ef.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v37, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m2113c(InputStream inputStream, long j3) throws IOException {
        long j4;
        C0257g c0257g;
        int i9;
        int i10;
        C4325u c4325u;
        C0773a c0773aM1996b;
        C0773a c0773aM1996b2;
        String str;
        C0773a c0773a;
        C0773a c0773a2;
        C0257g c0257g2;
        long j5;
        String str2;
        C4325u c4325u2;
        int i11;
        C0257g c0257g3;
        int i12;
        C4325u c4325u3;
        long j10;
        HashSet hashSet;
        Iterator it;
        ?? M10465a;
        ?? Concat;
        ?? r24;
        char c10;
        boolean z9;
        int iCharCount;
        ?? r62;
        ?? r25;
        ?? r12;
        ?? r2;
        C0267q c0267q = (C0267q) this.f2507i;
        C0265o c0265o = (C0265o) this.f2506h;
        c0267q.getClass();
        EnumC0266p enumC0266p = c0265o.f784b;
        String str3 = c0265o.f783a;
        if (enumC0266p != EnumC0266p.ARSC) {
            C2104o.m5294t(AbstractC0921a.m2251n("Unexpected resource type for decode: ", String.valueOf(enumC0266p), ", expect '.pb'/'.arsc'"));
            return null;
        }
        C0779g c0779g = null;
        for (C0780h c0780h : c0267q.f794b) {
            c0780h.getClass();
            c0779g = !str3.endsWith(".arsc") ? null : new C0779g(c0780h.f2349a);
            if (c0779g != null) {
                break;
            }
        }
        if (c0779g == null) {
            C0086a.m452k(AbstractC4855en.m9263g("Unknown type of resource file: ", str3));
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        c0779g.f2330b = new C0777e(new BufferedInputStream(inputStream, 32768));
        C4325u c4325u4 = c0779g.f2346d;
        C0257g c0257g4 = c4325u4.f14435a;
        c0779g.f2347e = new C0781i(c0257g4.f725K);
        ?? r42 = C0779g.f2344g;
        int i13 = 2;
        c0779g.f2330b.m2003a(2, "Not a table chunk");
        c0779g.f2330b.m2003a(12, "Unexpected table header size");
        int iM2006e = c0779g.f2330b.m2006e();
        int iM2006e2 = c0779g.f2330b.m2006e();
        int i14 = 0;
        while (true) {
            C0777e c0777e = c0779g.f2330b;
            int i15 = i14;
            long j11 = c0777e.f2340h;
            C4325u c4325u5 = c4325u4;
            if (j11 >= iM2006e) {
                long j12 = jCurrentTimeMillis;
                int i16 = iM2006e2;
                if (i15 != i16) {
                    r42.mo6265s(Integer.valueOf(i15), "Unexpected package chunks, read: {}, expected: {}", Integer.valueOf(i16));
                }
                C0781i c0781i = c0779g.f2347e;
                c0781i.f2351a.sort(Comparator.comparingInt(new C0070a(7)));
                c0781i.f2354d.clear();
                c0781i.f2355e.clear();
                if (r42.mo6250d()) {
                    r42.mo6271y(Integer.valueOf(c0779g.f2347e.f2351a.size()), "Resource table parsed: size: {}, time: {}ms", Long.valueOf(System.currentTimeMillis() - j12));
                }
                return c0779g;
            }
            int iM2005c = c0777e.m2005c();
            int iM2005c2 = c0779g.f2330b.m2005c();
            int i17 = i13;
            long jM2006e = (((long) c0779g.f2330b.m2006e()) & 4294967295L) + j11;
            if (iM2005c == 1) {
                j4 = jCurrentTimeMillis;
                c0257g = c0257g4;
                i9 = iM2006e;
                i10 = iM2006e2;
                c4325u = c4325u5;
                c0779g.f2348f = c0779g.m1997c(j11, jM2006e);
            } else if (iM2005c != 512) {
                j4 = jCurrentTimeMillis;
                c0257g = c0257g4;
                i9 = iM2006e;
                i10 = iM2006e2;
                c4325u = c4325u5;
            } else {
                C0777e c0777e2 = c0779g.f2330b;
                if (iM2005c2 < 284) {
                    C2104o.m5299y(AbstractC4855en.m9263g("Decode error: Package header size too small, position: 0x", Long.toHexString(c0777e2.f2340h)));
                    return null;
                }
                int iM2006e3 = c0777e2.m2006e();
                String strM2009i = c0779g.f2330b.m2009i(128);
                j4 = jCurrentTimeMillis;
                long jM2006e2 = ((long) c0779g.f2330b.m2006e()) + j11;
                c0779g.f2330b.m2006e();
                i9 = iM2006e;
                i10 = iM2006e2;
                long jM2006e3 = ((long) c0779g.f2330b.m2006e()) + j11;
                c0779g.f2330b.m2006e();
                if (iM2005c2 >= 288) {
                    c0779g.f2330b.m2006e();
                }
                c0779g.f2330b.m2010k(j11 + ((long) iM2005c2), "package header end");
                if (jM2006e2 != 0) {
                    c0779g.f2330b.m2010k(jM2006e2, "Expected typeStrings string pool");
                    c0773aM1996b = c0779g.m1996b();
                } else {
                    c0773aM1996b = null;
                }
                if (jM2006e3 != 0) {
                    c0779g.f2330b.m2010k(jM2006e3, "Expected keyStrings string pool");
                    c0773aM1996b2 = c0779g.m1996b();
                } else {
                    c0773aM1996b2 = null;
                }
                C0781i c0781i2 = c0779g.f2347e;
                if (c0781i2.f2352b.f225a.contains(EnumC6135a.f24716g)) {
                    Pattern pattern = AbstractC2390d.f7853a;
                    C5796q c5796q = C5796q.f23542b;
                    if (strM2009i == null || strM2009i.isEmpty() || AbstractC2390d.f7855c.contains(strM2009i) || !AbstractC2390d.f7854b.matcher(strM2009i).matches()) {
                        C0069c.f224c.mo6254h(strM2009i, "App package '{}' has invalid format and will be ignored");
                        str = "INVALID_PACKAGE";
                    } else {
                        str = strM2009i;
                    }
                    c0781i2.f2353c = str;
                    while (true) {
                        C0777e c0777e3 = c0779g.f2330b;
                        long j13 = c0777e3.f2340h;
                        if (j13 < jM2006e) {
                            int iM2005c3 = c0777e3.m2005c();
                            r42.mo6262p(Long.valueOf(j13), "res package chunk start at {} type {}", Integer.valueOf(iM2005c3));
                            if (iM2005c3 != 0) {
                                switch (iM2005c3) {
                                    case 513:
                                        c0779g.f2330b.m2005c();
                                        long jM2006e4 = ((long) c0779g.f2330b.m2006e()) & 4294967295L;
                                        long j14 = j13 + jM2006e4;
                                        c0779g.f2330b.mark((int) jM2006e4);
                                        int iM2007g = c0779g.f2330b.m2007g();
                                        int i18 = iM2007g - 1;
                                        String strM1995a = c0773aM1996b.m1995a(i18);
                                        int iM2007g2 = c0779g.f2330b.m2007g();
                                        boolean z10 = (iM2007g2 & 1) != 0;
                                        boolean z11 = (iM2007g2 & 2) != 0;
                                        c0779g.f2330b.m2005c();
                                        int iM2006e4 = c0779g.f2330b.m2006e();
                                        long jM2006e5 = j13 + ((long) c0779g.f2330b.m2006e());
                                        str2 = strM2009i;
                                        C0777e c0777e4 = c0779g.f2330b;
                                        j5 = jM2006e;
                                        long j15 = c0777e4.f2340h;
                                        int iM2006e5 = c0777e4.m2006e();
                                        if (iM2006e5 < 4) {
                                            C2104o.m5299y("Config size < 4");
                                            return null;
                                        }
                                        int i19 = iM2006e5 - 4;
                                        byte[] bArr = new byte[Math.max(52, i19)];
                                        C4325u c4325u6 = c4325u5;
                                        C0777e c0777e5 = c0779g.f2330b;
                                        c0777e5.f2340h += (long) i19;
                                        if (i19 < 0) {
                                            throw new IndexOutOfBoundsException();
                                        }
                                        int i20 = 0;
                                        while (i20 < i19) {
                                            int i21 = i19;
                                            int i22 = c0777e5.f2339g.read(bArr, i20, i21 - i20);
                                            if (i22 < 0) {
                                                C2104o.m5277a();
                                                return null;
                                            }
                                            i20 += i22;
                                            i19 = i21;
                                        }
                                        C0777e c0777e6 = new C0777e(new ByteArrayInputStream(bArr));
                                        short sM2005c = (short) c0777e6.m2005c();
                                        short sM2005c2 = (short) c0777e6.m2005c();
                                        char[] cArrM2013f = C0779g.m2013f((byte) c0777e6.m2007g(), (byte) c0777e6.m2007g(), 'a');
                                        char[] cArrM2013f2 = C0779g.m2013f((byte) c0777e6.m2007g(), (byte) c0777e6.m2007g(), '0');
                                        byte bM2007g = (byte) c0777e6.m2007g();
                                        byte bM2007g2 = (byte) c0777e6.m2007g();
                                        int iM2005c4 = c0777e6.m2005c();
                                        byte bM2007g3 = (byte) c0777e6.m2007g();
                                        byte bM2007g4 = (byte) c0777e6.m2007g();
                                        byte bM2007g5 = (byte) c0777e6.m2007g();
                                        byte bM2007g6 = (byte) c0777e6.m2007g();
                                        short sM2005c3 = (short) c0777e6.m2005c();
                                        short sM2005c4 = (short) c0777e6.m2005c();
                                        short sM2005c5 = (short) c0777e6.m2005c();
                                        c0777e6.m2005c();
                                        byte bM2007g7 = (byte) c0777e6.m2007g();
                                        byte bM2007g8 = (byte) c0777e6.m2007g();
                                        short sM2005c6 = (short) c0777e6.m2005c();
                                        short sM2005c7 = (short) c0777e6.m2005c();
                                        short sM2005c8 = (short) c0777e6.m2005c();
                                        char[] charArray = C0779g.m2012e(4, c0777e6).toCharArray();
                                        char[] charArray2 = C0779g.m2012e(8, c0777e6).toCharArray();
                                        byte bM2007g9 = (byte) c0777e6.m2007g();
                                        byte bM2007g10 = (byte) c0777e6.m2007g();
                                        c0777e6.m2005c();
                                        c0773a = c0773aM1996b;
                                        c0773a2 = c0773aM1996b2;
                                        c0779g.f2330b.m2004b(j15 + ((long) iM2006e5), "Config skip trailing bytes");
                                        C0916a c0916a = new C0916a(sM2005c, sM2005c2, cArrM2013f, cArrM2013f2, bM2007g, bM2007g2, iM2005c4, bM2007g3, bM2007g4, bM2007g5, bM2007g6, sM2005c3, sM2005c4, sM2005c5, bM2007g7, bM2007g8, sM2005c6, sM2005c7, sM2005c8, charArray.length == 0 ? null : charArray, charArray2.length == 0 ? null : charArray2, bM2007g9, bM2007g10, iM2006e5);
                                        if (c0916a.f2869k) {
                                            r42.mo6265s(strM1995a, "Invalid config flags detected: {}{}", c0916a.f2870l);
                                        }
                                        ArrayList arrayList = new ArrayList(iM2006e4);
                                        if (z10) {
                                            for (int i23 = 0; i23 < iM2006e4; i23++) {
                                                arrayList.add(new C0778f(c0779g.f2330b.m2005c(), c0779g.f2330b.m2005c() * 4));
                                            }
                                        } else if (z11) {
                                            for (int i24 = 0; i24 < iM2006e4; i24++) {
                                                int iM2005c5 = c0779g.f2330b.m2005c();
                                                if (iM2005c5 != 65535) {
                                                    arrayList.add(new C0778f(i24, iM2005c5 * 4));
                                                }
                                            }
                                        } else {
                                            for (int i25 = 0; i25 < iM2006e4; i25++) {
                                                arrayList.add(new C0778f(i25, c0779g.f2330b.m2006e()));
                                            }
                                        }
                                        c0779g.f2330b.m2010k(jM2006e5, "Failed to skip to entries start");
                                        HashSet hashSet2 = new HashSet(arrayList.size() * 2);
                                        Iterator it2 = arrayList.iterator();
                                        int i26 = 0;
                                        while (it2.hasNext()) {
                                            C0778f c0778f = (C0778f) it2.next();
                                            int i27 = c0778f.f2343b;
                                            if (i27 != -1) {
                                                int i28 = c0778f.f2342a;
                                                if (!z10 || hashSet2.add(Integer.valueOf(i28))) {
                                                    long j16 = ((long) i27) + jM2006e5;
                                                    if (j16 >= j14) {
                                                        i26++;
                                                    } else {
                                                        C0777e c0777e7 = c0779g.f2330b;
                                                        if (j16 < c0777e7.f2340h) {
                                                            c0777e7.reset();
                                                        }
                                                        c0779g.f2330b.m2010k(j16, "Expected start of entry " + i28);
                                                        int iM2005c6 = c0779g.f2330b.m2005c();
                                                        int iM2005c7 = c0779g.f2330b.m2005c();
                                                        boolean z12 = (iM2005c7 & 1) != 0;
                                                        boolean z13 = (iM2005c7 & 8) != 0;
                                                        it = it2;
                                                        int iM2006e6 = z13 ? iM2005c6 : c0779g.f2330b.m2006e();
                                                        hashSet = hashSet2;
                                                        if (iM2006e6 == -1) {
                                                            j10 = jM2006e5;
                                                            c0257g3 = c0257g4;
                                                            i12 = i18;
                                                            i11 = i26;
                                                            c4325u3 = c4325u6;
                                                        } else {
                                                            int i29 = (iM2006e3 << 24) | (iM2007g << 16) | i28;
                                                            String str4 = str2;
                                                            String strM1995a2 = c0773a.m1995a(i18);
                                                            C0773a c0773a3 = c0773a2;
                                                            ?? M1995a = c0773a3.m1995a(iM2006e6);
                                                            if (c0257g4.f725K.f226b.mo439c(M1995a)) {
                                                                j10 = jM2006e5;
                                                                String str5 = (String) c0779g.f2347e.f2355e.get(Integer.valueOf(i29));
                                                                if (str5 != null) {
                                                                    r24 = str5;
                                                                    c0257g3 = c0257g4;
                                                                    i12 = i18;
                                                                    i11 = i26;
                                                                    c0773a2 = c0773a3;
                                                                    c4325u3 = c4325u6;
                                                                } else {
                                                                    C4325u c4325u7 = c4325u6;
                                                                    InterfaceC4316l interfaceC4316l = (InterfaceC4316l) ((C3129b) c4325u7.f14438d.f7001b).f10144a.get(Integer.valueOf(i29));
                                                                    C4311g c4311g = interfaceC4316l instanceof C4311g ? (C4311g) interfaceC4316l : null;
                                                                    if (c4311g != null) {
                                                                        c4325u3 = c4325u7;
                                                                        if (!c4311g.f14389k.m8656a0().f9217g.mo6235a(EnumC2824a.f9159m)) {
                                                                            int i30 = c0257g4.f734T;
                                                                            String str6 = c4311g.f14390l.f10147h;
                                                                            int iM8279b = AbstractC4106c.m8279b(i30);
                                                                            if (iM8279b != 0) {
                                                                                i12 = i18;
                                                                                if (iM8279b != 1) {
                                                                                    M10465a = str6;
                                                                                    if (iM8279b != i17) {
                                                                                        C0086a.m452k("Unexpected ResourceNameSource value: ".concat(AbstractC0255e.m1034w(i30)));
                                                                                        return null;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                i12 = i18;
                                                                                M10465a = AbstractC5780a.m10465a(M1995a, str6);
                                                                            }
                                                                            if (c0257g4.m1036a()) {
                                                                                boolean zContains = c0257g4.f718D.contains(EnumC0256f.f710i);
                                                                                boolean z14 = !zContains;
                                                                                c0257g3 = c0257g4;
                                                                                String str7 = String.format("_res_0x%08x", Integer.valueOf(i29));
                                                                                if (M10465a.isEmpty()) {
                                                                                    i11 = i26;
                                                                                    c0773a2 = c0773a3;
                                                                                    Concat = str7;
                                                                                } else {
                                                                                    i11 = i26;
                                                                                    StringBuilder sb2 = new StringBuilder(M10465a.length() + 1);
                                                                                    c0773a2 = c0773a3;
                                                                                    int iCodePointAt = M10465a.codePointAt(0);
                                                                                    if (!zContains || AbstractC2390d.m5713b(iCodePointAt)) {
                                                                                        if (iCodePointAt >= 880 || !Character.isUnicodeIdentifierStart(iCodePointAt)) {
                                                                                            c10 = '_';
                                                                                            if (iCodePointAt == 95) {
                                                                                            }
                                                                                        } else {
                                                                                            c10 = '_';
                                                                                        }
                                                                                        Pattern pattern2 = AbstractC2390d.f7853a;
                                                                                        if (Character.isJavaIdentifierStart(iCodePointAt)) {
                                                                                            sb2.appendCodePoint(iCodePointAt);
                                                                                            z9 = false;
                                                                                        }
                                                                                        iCharCount = Character.charCount(iCodePointAt);
                                                                                        boolean z15 = z9;
                                                                                        r62 = M10465a;
                                                                                        while (iCharCount < r62.length()) {
                                                                                            int iCodePointAt2 = r62.codePointAt(iCharCount);
                                                                                            if (AbstractC1089i.m2759b0(iCodePointAt2, z14)) {
                                                                                                sb2.appendCodePoint(iCodePointAt2);
                                                                                                r25 = r62;
                                                                                            } else {
                                                                                                r25 = r62;
                                                                                                sb2.append('_');
                                                                                                z15 = true;
                                                                                            }
                                                                                            iCharCount += Character.charCount(iCodePointAt2);
                                                                                            r62 = r25;
                                                                                        }
                                                                                        String string = sb2.toString();
                                                                                        Concat = !(!AbstractC2390d.f7855c.contains(string) ? true : z15) ? string.concat(str7) : string;
                                                                                    } else {
                                                                                        c10 = '_';
                                                                                    }
                                                                                    sb2.append(c10);
                                                                                    if (AbstractC1089i.m2759b0(iCodePointAt, z14)) {
                                                                                        sb2.appendCodePoint(iCodePointAt);
                                                                                    }
                                                                                    z9 = true;
                                                                                    iCharCount = Character.charCount(iCodePointAt);
                                                                                    boolean z152 = z9;
                                                                                    r62 = M10465a;
                                                                                    while (iCharCount < r62.length()) {
                                                                                    }
                                                                                    String string2 = sb2.toString();
                                                                                    if (!(!AbstractC2390d.f7855c.contains(string2) ? true : z152)) {
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                c0257g3 = c0257g4;
                                                                                i11 = i26;
                                                                                c0773a2 = c0773a3;
                                                                                Concat = M10465a;
                                                                            }
                                                                            if (!M1995a.equals(Concat)) {
                                                                                c0779g.f2347e.f2355e.put(Integer.valueOf(i29), Concat);
                                                                            }
                                                                            if (c4311g != null) {
                                                                                c4311g.f14390l.f10149j = Concat.replace('.', '_');
                                                                                c4311g.m6231w(EnumC2824a.f9171x);
                                                                            }
                                                                            r24 = Concat;
                                                                        }
                                                                        M10465a = M1995a;
                                                                        if (c0257g4.m1036a()) {
                                                                        }
                                                                        if (!M1995a.equals(Concat)) {
                                                                        }
                                                                        if (c4311g != null) {
                                                                        }
                                                                        r24 = Concat;
                                                                    } else {
                                                                        c4325u3 = c4325u7;
                                                                    }
                                                                    i12 = i18;
                                                                    M10465a = M1995a;
                                                                    if (c0257g4.m1036a()) {
                                                                    }
                                                                    if (!M1995a.equals(Concat)) {
                                                                    }
                                                                    if (c4311g != null) {
                                                                    }
                                                                    r24 = Concat;
                                                                }
                                                                ?? c0918c = new C0918c(i29, str4, strM1995a2, r24, c0916a.f2870l);
                                                                str2 = str4;
                                                                ?? r63 = (C0918c) c0779g.f2347e.f2354d.get(c0918c);
                                                                ?? r5 = c0918c;
                                                                if (r63 != 0) {
                                                                    if (r63.f2873a == i29) {
                                                                        r42.mo6260n(r63, "ResourceEntries with duplicate resource id found: {} {}", c0918c);
                                                                        r2 = M1995a;
                                                                    } else {
                                                                        r2 = r24;
                                                                    }
                                                                    C0918c c0918cM2235a = c0918c.m2235a(r2);
                                                                    C0918c c0918cM2235a2 = r63.m2235a(r2);
                                                                    String str8 = c0918cM2235a2.f2876d;
                                                                    r42.mo6262p(c0918cM2235a.f2876d, "Resource name collision - renamed to {} and {}", str8);
                                                                    ?? r82 = c0779g.f2347e.f2351a;
                                                                    int iIndexOf = r82.indexOf(r63);
                                                                    if (iIndexOf != -1) {
                                                                        r82.set(iIndexOf, c0918cM2235a2);
                                                                    }
                                                                    C0781i c0781i3 = c0779g.f2347e;
                                                                    c0781i3.getClass();
                                                                    c0781i3.f2355e.put(Integer.valueOf(c0918cM2235a2.f2873a), str8);
                                                                    r5 = c0918cM2235a;
                                                                }
                                                                String str9 = r5.f2876d;
                                                                if (!M1995a.equals(str9)) {
                                                                    C0781i c0781i4 = c0779g.f2347e;
                                                                    c0781i4.getClass();
                                                                    c0781i4.f2355e.put(Integer.valueOf(r5.f2873a), str9);
                                                                }
                                                                C0781i c0781i5 = c0779g.f2347e;
                                                                c0781i5.f2351a.add(r5);
                                                                c0781i5.f2354d.put(r5, r5);
                                                                r12 = r5;
                                                            } else {
                                                                j10 = jM2006e5;
                                                                c0257g3 = c0257g4;
                                                                i12 = i18;
                                                                i11 = i26;
                                                                c0773a2 = c0773a3;
                                                                str2 = str4;
                                                                c4325u3 = c4325u6;
                                                                r12 = C0779g.f2345h;
                                                            }
                                                            if (z13) {
                                                                r12.f2878f = new C0192k(iM2005c7 >> 8, c0779g.f2330b.m2006e(), 1);
                                                            } else if (z12 || iM2005c6 == 16) {
                                                                c0779g.f2330b.m2006e();
                                                                int iM2006e7 = c0779g.f2330b.m2006e();
                                                                r12.getClass();
                                                                ArrayList arrayList2 = new ArrayList(iM2006e7);
                                                                for (int i31 = 0; i31 < iM2006e7; i31++) {
                                                                    arrayList2.add(new C0917b(c0779g.f2330b.m2006e(), c0779g.m2014d()));
                                                                }
                                                                r12.f2879g = arrayList2;
                                                            } else {
                                                                r12.f2878f = c0779g.m2014d();
                                                            }
                                                        }
                                                        it2 = it;
                                                        hashSet2 = hashSet;
                                                        jM2006e5 = j10;
                                                        c4325u6 = c4325u3;
                                                        i18 = i12;
                                                        c0257g4 = c0257g3;
                                                        i26 = i11;
                                                        i17 = 2;
                                                    }
                                                }
                                            }
                                            it = it2;
                                            hashSet = hashSet2;
                                            j10 = jM2006e5;
                                            c0257g3 = c0257g4;
                                            i12 = i18;
                                            i11 = i26;
                                            c4325u3 = c4325u6;
                                            it2 = it;
                                            hashSet2 = hashSet;
                                            jM2006e5 = j10;
                                            c4325u6 = c4325u3;
                                            i18 = i12;
                                            c0257g4 = c0257g3;
                                            i26 = i11;
                                            i17 = 2;
                                        }
                                        c0257g2 = c0257g4;
                                        int i32 = i26;
                                        c4325u2 = c4325u6;
                                        if (i32 > 0) {
                                            r42.mo6265s(Integer.valueOf(i32), "{} entries of type {} has been ignored (invalid offset)", strM1995a);
                                        }
                                        c0779g.f2330b.m2010k(j14, "End of chunk");
                                        break;
                                        break;
                                    case 514:
                                        c0779g.f2330b.m2003a(16, "Unexpected type spec header size");
                                        long jM2006e6 = ((long) c0779g.f2330b.m2006e()) + j13;
                                        c0779g.f2330b.m2007g();
                                        c0779g.f2330b.skip(3L);
                                        int iM2006e8 = c0779g.f2330b.m2006e();
                                        int i33 = 0;
                                        while (true) {
                                            C0777e c0777e8 = c0779g.f2330b;
                                            if (i33 >= iM2006e8) {
                                                if (c0777e8.f2340h != jM2006e6) {
                                                    throw new IOException(String.format("Error reading type spec chunk at offset 0x%x", Long.valueOf(j13)));
                                                }
                                                c0773a = c0773aM1996b;
                                                c0773a2 = c0773aM1996b2;
                                                c0257g2 = c0257g4;
                                                j5 = jM2006e;
                                                str2 = strM2009i;
                                                c4325u2 = c4325u5;
                                            } else {
                                                c0777e8.m2006e();
                                                i33++;
                                            }
                                            break;
                                        }
                                        break;
                                    case 515:
                                        r42.mo6257k("parsing library type chunk starting at offset {}", Long.valueOf(j13));
                                        c0779g.f2330b.m2003a(12, "Unexpected header size");
                                        long jM2006e7 = ((long) c0779g.f2330b.m2006e()) + j13;
                                        int iM2006e9 = c0779g.f2330b.m2006e();
                                        int i34 = 0;
                                        while (true) {
                                            C0777e c0777e9 = c0779g.f2330b;
                                            if (i34 < iM2006e9) {
                                                int i35 = iM2006e9;
                                                int i36 = i34;
                                                r42.mo6252f(Integer.valueOf(c0777e9.m2006e()), c0779g.f2330b.m2009i(128));
                                                if (c0779g.f2330b.f2340h > jM2006e7) {
                                                    C2104o.m5299y("reading after chunk end");
                                                    return null;
                                                }
                                                i34 = i36 + 1;
                                                iM2006e9 = i35;
                                            } else if (c0777e9.f2340h != jM2006e7) {
                                                throw new IOException(String.format("Error reading library chunk at offset 0x%x", Long.valueOf(j13)));
                                            }
                                        }
                                        break;
                                    case 516:
                                        r42.mo6257k("parsing overlay type chunk starting at offset {}", Long.valueOf(j13));
                                        c0779g.f2330b.m2005c();
                                        long jM2006e8 = j13 + ((long) c0779g.f2330b.m2006e());
                                        r42.mo6262p(c0779g.f2330b.m2009i(Opcodes.ACC_NATIVE), "Overlay header data: name={} actor={}", c0779g.f2330b.m2009i(Opcodes.ACC_NATIVE));
                                        c0779g.f2330b.m2010k(jM2006e8, "overlay chunk end");
                                        c0773a = c0773aM1996b;
                                        c0773a2 = c0773aM1996b2;
                                        c0257g2 = c0257g4;
                                        j5 = jM2006e;
                                        str2 = strM2009i;
                                        c4325u2 = c4325u5;
                                        break;
                                    case 517:
                                        throw new IOException(String.format("Encountered unsupported chunk type RES_TABLE_TYPE_OVERLAY_POLICY at offset 0x%x ", Long.valueOf(j13)));
                                    case 518:
                                        r42.mo6257k("parsing staged alias chunk starting at offset {}", Long.valueOf(j13));
                                        c0779g.f2330b.m2005c();
                                        long jM2006e9 = j13 + ((long) c0779g.f2330b.m2006e());
                                        int iM2006e10 = c0779g.f2330b.m2006e();
                                        int i37 = 0;
                                        while (true) {
                                            C0777e c0777e10 = c0779g.f2330b;
                                            if (i37 >= iM2006e10) {
                                                c0777e10.m2010k(jM2006e9, "staged alias chunk end");
                                                c0773a = c0773aM1996b;
                                                c0773a2 = c0773aM1996b2;
                                                c0257g2 = c0257g4;
                                                j5 = jM2006e;
                                                str2 = strM2009i;
                                                c4325u2 = c4325u5;
                                            } else {
                                                r42.mo6271y(Integer.valueOf(c0777e10.m2006e()), "Staged alias: stagedResId {} finalizedResId {}", Integer.valueOf(c0779g.f2330b.m2006e()));
                                                i37++;
                                            }
                                            break;
                                        }
                                        break;
                                    default:
                                        r42.mo6265s(Integer.valueOf(iM2005c3), "Unknown chunk type {} encountered at offset {}", Long.valueOf(j13));
                                        c0773a = c0773aM1996b;
                                        c0773a2 = c0773aM1996b2;
                                        c0257g2 = c0257g4;
                                        j5 = jM2006e;
                                        str2 = strM2009i;
                                        c4325u2 = c4325u5;
                                        break;
                                }
                            } else {
                                c0773a = c0773aM1996b;
                                c0773a2 = c0773aM1996b2;
                                c0257g2 = c0257g4;
                                j5 = jM2006e;
                                str2 = strM2009i;
                                c4325u2 = c4325u5;
                                r42.mo6247a(Long.valueOf(j13), "Null chunk type encountered at offset {}");
                            }
                            strM2009i = str2;
                            jM2006e = j5;
                            c4325u5 = c4325u2;
                            c0257g4 = c0257g2;
                            c0773aM1996b = c0773a;
                            c0773aM1996b2 = c0773a2;
                            i17 = 2;
                        } else {
                            c0257g = c0257g4;
                            c4325u = c4325u5;
                            i14 = i15 + 1;
                        }
                    }
                }
                c0779g.f2330b.m2010k(jM2006e, "Skip to table chunk end");
                jCurrentTimeMillis = j4;
                iM2006e = i9;
                iM2006e2 = i10;
                c4325u4 = c4325u;
                c0257g4 = c0257g;
                i13 = 2;
            }
            i14 = i15;
            c0779g.f2330b.m2010k(jM2006e, "Skip to table chunk end");
            jCurrentTimeMillis = j4;
            iM2006e = i9;
            iM2006e2 = i10;
            c4325u4 = c4325u;
            c0257g4 = c0257g;
            i13 = 2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.InterfaceC2334d
    /* JADX INFO: renamed from: n */
    public AbstractC2331a mo1892n() {
        C3193a c3193a = (C3193a) this.f2507i;
        boolean z9 = (((C3339i) this.f2506h).f10745u.f12076k[0] & 1) != 0;
        switch (c3193a.f10232g) {
            case 16:
                return new C3725o(z9);
            case 17:
                return new C3727q(z9);
            case 18:
                return new C3734x(z9);
            default:
                return new C3735y(z9);
        }
    }
}
