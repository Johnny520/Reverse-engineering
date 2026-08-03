package p002a1;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Trace;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;
import androidx.lifecycle.C0114s;
import androidx.lifecycle.C0119x;
import androidx.lifecycle.C0120y;
import androidx.lifecycle.EnumC0106k;
import be.AbstractC0283h;
import gg.AbstractC1416l;
import gg.C1421q;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;
import okio.C3193a;
import org.luckypray.dexkit.DexKitBridge;
import p000a.AbstractC0000a;
import p003a2.C0014a;
import p007a7.AbstractC0018a;
import p010aa.C0035c;
import p011ab.C0041a;
import p015b0.C0142h;
import p018b3.AbstractC0173c;
import p020b5.C0184c;
import p036c9.AbstractC0473o2;
import p036c9.C0414a;
import p036c9.C0429d2;
import p036c9.C0452j1;
import p036c9.C0482r0;
import p036c9.C0483r1;
import p036c9.C0492u1;
import p036c9.C0501x1;
import p036c9.EnumC0495v1;
import p043d3.AbstractC0687c;
import p059e3.C0823d;
import p062e8.C0829c;
import p065eb.C0901w0;
import p068eh.AbstractC0921a;
import p069f.C0965w;
import p077f8.AbstractC1089i;
import p080fb.AbstractC1184v0;
import p096g8.C1364e;
import p096g8.C1366g;
import p096g8.C1369j;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.items.protobuf.ProtobufPacketRuntime$Packet;
import p099h.Hchat.hooks.items.script.ScriptMessageBean;
import p099h.Hchat.hooks.items.script.ScriptPluginRuntime;
import p099h.Hchat.hooks.items.script.ScriptWaBridge;
import p099h.Hchat.utils.KavaReflector;
import p106h8.C1625b;
import p108ha.C1653m;
import p108ha.C1666z;
import p109hb.C1671c;
import p125i8.C2005i;
import p126ia.C2007a0;
import p127ib.C2034b;
import p127ib.C2035c;
import p131j0.C2046b;
import p153k8.C2345i;
import p153k8.C2352p;
import p162l3.C2464r;
import p183m8.C2813a;
import p190n2.C2887v;
import p190n2.EnumC2886u;
import p210o8.C3080d;
import p218og.AbstractC3149m;
import p230p8.C3351d0;
import p242q8.C3453h;
import p242q8.C3454i;
import p242q8.C3455j;
import p242q8.C3458m;
import p242q8.C3459n;
import p242q8.C3460o;
import p242q8.C3462q;
import p242q8.InterfaceC3461p;
import p258r8.C3742g;
import p258r8.C3744i;
import p259r9.AbstractC3754e0;
import p260ra.C3779c;
import p261rb.C3787c;
import p261rb.C3788d;
import p261rb.C3792h;
import p261rb.C3794j;
import p261rb.C3795k;
import p261rb.EnumC3789e;
import p261rb.RunnableC3791g;
import p276sf.C3958e;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p299u9.C4287f;
import p357y1.ViewTreeObserverOnGlobalLayoutListenerC5934t;
import p358y2.DialogC5987v;
import p366ya.AbstractC6019i;
import tf.AbstractC4166m;
import tf.AbstractC4167n;

/* JADX INFO: renamed from: a1.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0003a implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f10g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f11h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0003a(C2035c c2035c, C3742g c3742g) {
        this.f10g = 23;
        this.f11h = c3742g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    private final void m106a() {
        C3080d c3080d;
        C1366g c1366g = (C1366g) this.f11h;
        synchronized (c1366g) {
            if (!c1366g.f4529e && (c3080d = c1366g.f4525a) != null) {
                c3080d.m6549g(new C1364e(c1366g, 0));
                c1366g.f4529e = true;
                if (c1366g.f4527c != null) {
                    C2005i.m4939f("[WeChatChatroomChangeApi] ".concat("群聊变更监听已安装"));
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    private final void m107b() {
        C3460o c3460o = (C3460o) this.f11h;
        synchronized (c3460o) {
            if (c3460o.f11227c) {
                return;
            }
            try {
                Method methodFindDeclaredMethod = KavaReflector.findDeclaredMethod(Activity.class, "onResume", new Class[0]);
                Method methodFindDeclaredMethod2 = KavaReflector.findDeclaredMethod(Activity.class, "onPause", new Class[0]);
                Method methodFindDeclaredMethod3 = KavaReflector.findDeclaredMethod(Activity.class, "onDestroy", new Class[0]);
                C3744i c3744i = C3744i.f12154b;
                c3744i.m7763b(methodFindDeclaredMethod, new C3459n(c3460o, 0));
                C3459n c3459n = new C3459n(c3460o, 1);
                c3744i.m7763b(methodFindDeclaredMethod2, c3459n);
                c3744i.m7763b(methodFindDeclaredMethod3, c3459n);
                c3460o.f11227c = true;
                if (c3460o.f11225a != null) {
                    C2005i.m4939f("[WeChatCurrentActivityApi] ".concat("当前Activity Hook已安装"));
                }
            } catch (Throwable th2) {
                String str = "当前Activity Hook失败: " + th2.getMessage();
                if (c3460o.f11225a != null) {
                    C2005i.m4939f("[WeChatCurrentActivityApi] ".concat(str));
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    private final void m108c() {
        C3454i c3454i = (C3454i) this.f11h;
        synchronized (c3454i) {
            if (c3454i.f11205c) {
                return;
            }
            int iM7254a = c3454i.m7254a(Activity.class) + c3454i.m7254a(ContextWrapper.class);
            c3454i.f11205c = iM7254a > 0;
            String str = "Activity启动监听Hook: methods=" + iM7254a;
            if (c3454i.f11203a != null) {
                C2005i.m4939f("[WeChatActivityStartApi] ".concat(str));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    private final void m109d() {
        C3462q c3462q = (C3462q) this.f11h;
        synchronized (c3462q) {
            if (c3462q.f11230c) {
                return;
            }
            int iM7264a = c3462q.m7264a("onResume", "resume") + c3462q.m7264a("onPause", "pause") + c3462q.m7264a("onDestroy", "destroy");
            c3462q.f11230c = iM7264a > 0;
            c3462q.m7265b("生命周期监听Hook: methods=" + iM7264a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    private final void m110e() {
        final C3458m c3458m = (C3458m) this.f11h;
        synchronized (c3458m) {
            try {
                if (c3458m.f11218h) {
                    return;
                }
                c3458m.f11219i = c3458m.m7261d();
                C3454i c3454i = c3458m.f11214d;
                if (c3454i != null) {
                    c3454i.f11204b.addIfAbsent(new C3455j(c3458m));
                }
                C3462q c3462q = c3458m.f11213c;
                if (c3462q != null) {
                    c3462q.f11229b.addIfAbsent(new InterfaceC3461p() { // from class: q8.k
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p242q8.InterfaceC3461p
                        /* JADX INFO: renamed from: a */
                        public final void mo5670a(C0184c c0184c) {
                            C3458m c3458m2 = c3458m;
                            c3458m2.getClass();
                            boolean zEquals = "resume".equals((String) c0184c.f469a);
                            String strM7257g = HttpUrl.FRAGMENT_ENCODE_SET;
                            if (!zEquals || !"com.tencent.mm.ui.chatting.ChattingUI".equals((String) c0184c.f471c)) {
                                if (("pause".equals((String) c0184c.f469a) || "destroy".equals((String) c0184c.f469a)) && "com.tencent.mm.ui.chatting.ChattingUI".equals((String) c0184c.f471c)) {
                                    String str = c3458m2.f11220j;
                                    c3458m2.f11220j = HttpUrl.FRAGMENT_ENCODE_SET;
                                    c3458m2.m7259b("exit", str);
                                    return;
                                }
                                return;
                            }
                            Activity activity = (Activity) c0184c.f470b;
                            if (activity != null) {
                                try {
                                    strM7257g = C3458m.m7257g(activity.getIntent());
                                } catch (Throwable unused) {
                                }
                            }
                            if (TextUtils.isEmpty(strM7257g)) {
                                strM7257g = c3458m2.f11221k;
                            }
                            if (TextUtils.isEmpty(strM7257g)) {
                                return;
                            }
                            c3458m2.m7260c(strM7257g);
                        }
                    });
                }
                c3458m.f11218h = true;
                c3458m.m7262e("聊天页监听已安装: dexMethods=" + c3458m.f11219i);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    private final void m111f() {
        C2464r c2464r = (C2464r) this.f11h;
        synchronized (c2464r.f8083d) {
            try {
                if (c2464r.f8087h == null) {
                    return;
                }
                try {
                    C0823d c0823dM5860c = c2464r.m5860c();
                    int i9 = c0823dM5860c.f2472e;
                    if (i9 == 2) {
                        synchronized (c2464r.f8083d) {
                        }
                    }
                    if (i9 != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + i9 + ")");
                    }
                    try {
                        int i10 = AbstractC0687c.f2094a;
                        Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        C0014a c0014a = c2464r.f8082c;
                        Context context = c2464r.f8080a;
                        c0014a.getClass();
                        C0823d[] c0823dArr = {c0823dM5860c};
                        AbstractC0000a abstractC0000a = AbstractC0173c.f450a;
                        AbstractC0000a.m80o("TypefaceCompat.createFromFontInfo");
                        try {
                            Typeface typefaceMo104D = AbstractC0173c.f450a.mo104D(context, c0823dArr);
                            Trace.endSection();
                            MappedByteBuffer mappedByteBufferM217C = AbstractC0018a.m217C(c2464r.f8080a, c0823dM5860c.f2468a);
                            if (mappedByteBufferM217C == null || typefaceMo104D == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            try {
                                Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                C1671c c1671c = new C1671c(typefaceMo104D, AbstractC0283h.m1140T(mappedByteBufferM217C));
                                Trace.endSection();
                                synchronized (c2464r.f8083d) {
                                    try {
                                        AbstractC0018a abstractC0018a = c2464r.f8087h;
                                        if (abstractC0018a != null) {
                                            abstractC0018a.mo264E(c1671c);
                                        }
                                    } finally {
                                    }
                                }
                                c2464r.m5859b();
                            } finally {
                                int i11 = AbstractC0687c.f2094a;
                            }
                        } finally {
                            Trace.endSection();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } catch (Throwable th3) {
                    synchronized (c2464r.f8083d) {
                        try {
                            AbstractC0018a abstractC0018a2 = c2464r.f8087h;
                            if (abstractC0018a2 != null) {
                                abstractC0018a2.mo263D(th3);
                            }
                            c2464r.m5859b();
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f6  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m112g() {
        Object c3959f;
        Object c3959f2;
        C3787c c3787c;
        boolean z9;
        boolean zM6216j;
        C3795k c3795k = (C3795k) this.f11h;
        synchronized (c3795k.f12444d) {
            if (c3795k.f12453m && c3795k.f12457q == null) {
                C3794j c3794j = c3795k.f12447g.isEmpty() ? null : (C3794j) c3795k.f12447g.removeFirst();
                if (c3794j == null) {
                    c3795k.m7979e();
                    return;
                }
                String str = (String) c3795k.f12450j.get(c3794j.f12439a);
                if (str == null) {
                    str = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                if (AbstractC3149m.m6721t0(str)) {
                    str = c3794j.f12439a;
                }
                try {
                    C3787c c3787c2 = c3795k.f12451k;
                    c3959f = c3787c2 != null ? c3787c2.m7967a(c3794j.f12439a) : null;
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                if (c3959f instanceof C3959f) {
                    c3959f = null;
                }
                if (c3959f == null) {
                    c3795k.m7982i(new C3788d(c3794j.f12439a, str, EnumC3789e.f12424i, "构造检测请求失败"));
                    return;
                }
                C3792h c3792h = new C3792h(c3794j, c3959f);
                synchronized (c3795k.f12444d) {
                    if (c3795k.f12453m) {
                        c3795k.f12457q = c3792h;
                        c3795k.f12455o = str;
                        c3795k.f12454n = "正在检测 " + str;
                        c3795k.m7981h();
                        c3795k.m7986m();
                        try {
                            c3787c = c3795k.f12451k;
                        } catch (Throwable th3) {
                            c3959f2 = new C3959f(th3);
                        }
                        if (c3787c == null) {
                            z9 = false;
                            c3959f2 = Boolean.valueOf(z9);
                            Object obj = Boolean.FALSE;
                            if (c3959f2 instanceof C3959f) {
                                c3959f2 = obj;
                            }
                            if (((Boolean) c3959f2).booleanValue()) {
                                synchronized (c3795k.f12444d) {
                                    try {
                                        if (c3795k.f12457q == c3792h) {
                                            c3795k.f12457q = null;
                                        }
                                        c3795k.f12455o = HttpUrl.FRAGMENT_ENCODE_SET;
                                    } catch (Throwable th4) {
                                        throw th4;
                                    }
                                }
                                c3795k.m7980f(c3792h, "检测请求发送失败");
                            } else {
                                ScheduledFuture<?> scheduledFutureSchedule = c3795k.f12445e.schedule(new RunnableC3791g(c3795k, 0, c3792h), AbstractC3754e0.m7909r(c3795k.f12443c.f12465a.getInt("zombie_check_timeout_seconds", 15), 5, 60), TimeUnit.SECONDS);
                                synchronized (c3795k.f12444d) {
                                    try {
                                        if (c3795k.f12457q == c3792h) {
                                            c3792h.f12436c = scheduledFutureSchedule;
                                        } else {
                                            scheduledFutureSchedule.cancel(false);
                                        }
                                    } catch (Throwable th5) {
                                        throw th5;
                                    }
                                }
                            }
                        } else {
                            C2813a c2813aNetwork = WeChatApis.network();
                            if (c2813aNetwork != null) {
                                c2813aNetwork.m6205a(c3787c.f12410a.f12147e);
                                zM6216j = c2813aNetwork.f9079a.m6216j(c3959f);
                            } else {
                                zM6216j = false;
                            }
                            z9 = true;
                            if (zM6216j) {
                            }
                            c3959f2 = Boolean.valueOf(z9);
                            Object obj2 = Boolean.FALSE;
                            if (c3959f2 instanceof C3959f) {
                            }
                            if (((Boolean) c3959f2).booleanValue()) {
                            }
                        }
                    }
                    c3795k.f12447g.addFirst(c3794j);
                    c3795k.m7981h();
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0587  */
    /* JADX WARN: Type inference failed for: r0v103, types: [java.lang.Object, sf.c] */
    /* JADX WARN: Type inference failed for: r0v115, types: [java.lang.Object, sf.c] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [int] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int[] iArr;
        int[] iArr2;
        boolean z9;
        boolean zM1494r;
        ArrayList arrayListM8397F1;
        Object c3959f;
        ArrayList<C3958e> arrayList;
        C3080d c3080d;
        C3080d c3080d2;
        View viewFindFocus;
        Boolean bool = null;
        int i9 = 2;
        int i10 = 1;
        switch (this.f10g) {
            case 0:
                ViewOnAttachStateChangeListenerC0011i viewOnAttachStateChangeListenerC0011i = (ViewOnAttachStateChangeListenerC0011i) this.f11h;
                boolean zM158i = viewOnAttachStateChangeListenerC0011i.m158i();
                ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t = viewOnAttachStateChangeListenerC0011i.f28g;
                if (zM158i) {
                    Trace.beginSection("ContentCapture:changeChecker");
                    try {
                        viewTreeObserverOnGlobalLayoutListenerC5934t.m10666x(true);
                        C0965w c0965w = viewOnAttachStateChangeListenerC0011i.f38q;
                        int[] iArr3 = c0965w.f2964b;
                        long[] jArr = c0965w.f2963a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i11 = 0;
                            while (true) {
                                long j3 = jArr[i11];
                                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                                    for (?? r12 = z; r12 < i12; r12++) {
                                        if ((255 & j3) < 128) {
                                            int i13 = iArr3[(i11 << 3) + r12];
                                            if (viewOnAttachStateChangeListenerC0011i.m157h().m2312a(i13)) {
                                                iArr2 = iArr3;
                                            } else {
                                                iArr2 = iArr3;
                                                viewOnAttachStateChangeListenerC0011i.f31j.add(new C0012j(i13, viewOnAttachStateChangeListenerC0011i.f37p, EnumC0013k.f47h, null));
                                                viewOnAttachStateChangeListenerC0011i.f35n.mo8208p(C3967n.f12976a);
                                            }
                                        }
                                        j3 >>= 8;
                                        iArr3 = iArr2;
                                    }
                                    iArr = iArr3;
                                    if (i12 == 8) {
                                    }
                                } else {
                                    iArr = iArr3;
                                }
                                if (i11 != length) {
                                    i11++;
                                    iArr3 = iArr;
                                    z = false;
                                }
                            }
                        }
                        Trace.beginSection("ContentCapture:sendAppearEvents");
                        viewOnAttachStateChangeListenerC0011i.m160k(viewTreeObserverOnGlobalLayoutListenerC5934t.getSemanticsOwner().m2668a(), viewOnAttachStateChangeListenerC0011i.f39r);
                        Trace.endSection();
                        viewOnAttachStateChangeListenerC0011i.m155f(viewOnAttachStateChangeListenerC0011i.m157h());
                        viewOnAttachStateChangeListenerC0011i.m164o();
                        viewOnAttachStateChangeListenerC0011i.f40s = false;
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    } finally {
                        Trace.endSection();
                    }
                }
                return;
            case 1:
                C0120y c0120y = (C0120y) this.f11h;
                C0114s c0114s = c0120y.f317l;
                if (c0120y.f313h == 0) {
                    z9 = true;
                    c0120y.f314i = true;
                    c0114s.m555d(EnumC0106k.ON_PAUSE);
                } else {
                    z9 = true;
                }
                if (c0120y.f312g == 0 && c0120y.f314i) {
                    c0114s.m555d(EnumC0106k.ON_STOP);
                    c0120y.f315j = z9;
                    return;
                }
                return;
            case 2:
                DialogC5987v.m10719a((DialogC5987v) this.f11h);
                return;
            case 3:
                ActionMode actionMode = ((C0142h) this.f11h).f374h;
                if (actionMode != null) {
                    actionMode.finish();
                    return;
                }
                return;
            case 4:
                ((C0482r0) this.f11h).invoke();
                return;
            case 5:
                C0501x1 c0501x1 = (C0501x1) this.f11h;
                C0492u1 c0492u1 = c0501x1.f1531a;
                Activity activity = c0492u1.f1491a;
                if (activity.isFinishing() || activity.isDestroyed()) {
                    return;
                }
                int iOrdinal = c0501x1.f1532b.ordinal();
                if (iOrdinal == 0) {
                    boolean zM1495s = AbstractC0473o2.m1495s(activity, c0492u1.f1492b, null);
                    Toast.makeText(activity.getApplicationContext(), zM1495s ? "已移出当前分组" : "移出会话失败", 0).show();
                    if (zM1495s) {
                        C0429d2.m1445y(activity);
                        C0429d2 c0429d2 = C0429d2.f1235a;
                        C0429d2.m1443w(c0492u1.f1494d, activity);
                        return;
                    }
                    return;
                }
                if (iOrdinal == 1) {
                    C0452j1 c0452j1 = C0452j1.f1326a;
                    C0452j1.m1459v(activity, c0492u1.f1492b, new C0035c(activity, 5, c0492u1));
                    return;
                }
                if (iOrdinal != 2 && iOrdinal != 3) {
                    C3193a.m6822k();
                    return;
                }
                boolean z10 = c0501x1.f1532b == EnumC0495v1.f1508i;
                String str = c0492u1.f1493c;
                String str2 = c0492u1.f1492b;
                str.getClass();
                synchronized (AbstractC0473o2.f1396a) {
                    try {
                        String strM1477a = AbstractC0473o2.m1477a();
                        String string = AbstractC3149m.m6703R0(str).toString();
                        String string2 = AbstractC3149m.m6703R0(str2).toString();
                        if (AbstractC3149m.m6721t0(strM1477a) || AbstractC3149m.m6721t0(string) || AbstractC3149m.m6721t0(string2)) {
                            zM1494r = false;
                        } else {
                            List listM1486j = AbstractC0473o2.m1486j(activity, strM1477a);
                            Iterator it = listM1486j.iterator();
                            int i14 = 0;
                            while (true) {
                                if (it.hasNext()) {
                                    C0414a c0414a = (C0414a) it.next();
                                    if (!AbstractC1416l.m3825a(c0414a.f1179a, string) || !c0414a.f1183e.contains(string2)) {
                                        i14++;
                                    }
                                } else {
                                    i14 = -1;
                                }
                            }
                            if (i14 >= 0) {
                                C0414a c0414a2 = (C0414a) listM1486j.get(i14);
                                if (z10) {
                                    List listM99x0 = AbstractC0000a.m99x0(string2);
                                    List list = c0414a2.f1184f;
                                    ArrayList arrayList2 = new ArrayList();
                                    for (Object obj : list) {
                                        if (!AbstractC1416l.m3825a((String) obj, string2)) {
                                            arrayList2.add(obj);
                                        }
                                    }
                                    arrayListM8397F1 = AbstractC4166m.m8397F1(listM99x0, arrayList2);
                                } else {
                                    List list2 = c0414a2.f1184f;
                                    ArrayList arrayList3 = new ArrayList();
                                    for (Object obj2 : list2) {
                                        if (!AbstractC1416l.m3825a((String) obj2, string2)) {
                                            arrayList3.add(obj2);
                                        }
                                    }
                                    arrayListM8397F1 = arrayList3;
                                }
                                if (!arrayListM8397F1.equals(c0414a2.f1184f)) {
                                    ArrayList arrayList4 = new ArrayList(listM1486j);
                                    arrayList4.set(i14, C0414a.m1401a(c0414a2, null, null, null, 0, null, arrayListM8397F1, false, null, false, false, false, 4063));
                                    zM1494r = AbstractC0473o2.m1494r(activity, strM1477a, AbstractC0473o2.m1488l(arrayList4));
                                } else {
                                    zM1494r = true;
                                }
                                break;
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                Toast.makeText(activity.getApplicationContext(), !zM1494r ? "更新分组置顶失败" : z10 ? "已在当前分组置顶" : "已取消当前分组置顶", 0).show();
                if (zM1494r) {
                    C0429d2 c0429d22 = C0429d2.f1235a;
                    C0429d2.m1443w(c0492u1.f1494d, activity);
                    return;
                }
                return;
            case 6:
                C0483r1 c0483r1 = (C0483r1) this.f11h;
                Activity activity2 = c0483r1.f1433a;
                if (activity2.isFinishing() || activity2.isDestroyed()) {
                    return;
                }
                C0452j1 c0452j12 = C0452j1.f1326a;
                C0452j1.m1459v(activity2, c0483r1.f1434b, new C0041a(c0483r1, 9));
                return;
            case 7:
                ScriptMessageBean scriptMessageBean = (ScriptMessageBean) this.f11h;
                try {
                    ScriptPluginRuntime scriptPluginRuntime = ScriptPluginRuntime.INSTANCE;
                    scriptPluginRuntime.dispatchOnHandleMsg(scriptMessageBean);
                    if (scriptPluginRuntime.hasImageDownloadCallback()) {
                        scriptPluginRuntime.dispatchOnImageDownload(scriptMessageBean);
                        return;
                    }
                    return;
                } catch (Throwable th4) {
                    AbstractC0921a.m2261x("[Hchat:Script] 消息监听异步分发失败: ", th4.getMessage(), th4);
                    return;
                }
            case 8:
                ScriptPluginRuntime.dispatchOnProtobufPacket$lambda$1((ProtobufPacketRuntime$Packet) this.f11h);
                return;
            case 9:
                ScriptWaBridge.downloadVideoInternal$lambda$5((C0901w0) this.f11h);
                return;
            case 10:
                C1653m c1653m = (C1653m) this.f11h;
                String str3 = HttpUrl.FRAGMENT_ENCODE_SET;
                SharedPreferences sharedPreferences = c1653m.f5440b;
                if (sharedPreferences.getBoolean("enable", false)) {
                    if (sharedPreferences.getBoolean("time_window_enable", false)) {
                        String string3 = sharedPreferences.getString("start_time", "08:00:00");
                        if (string3 == null) {
                            string3 = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        String string4 = sharedPreferences.getString("end_time", "23:00:00");
                        if (string4 == null) {
                            string4 = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        if (!AbstractC3754e0.m7865H(string3, string4)) {
                            return;
                        }
                    }
                    int i15 = sharedPreferences.getInt("interval_seconds", 300);
                    if (i15 < 0) {
                        i15 = 0;
                    }
                    long j4 = ((long) i15) * 1000;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - c1653m.f5443e < j4) {
                        return;
                    }
                    c1653m.f5443e = jCurrentTimeMillis;
                    try {
                        C3351d0 c3351d0SnsApi = WeChatApis.snsApi();
                        if (c3351d0SnsApi != null && c3351d0SnsApi.m7085s()) {
                            z = true;
                        }
                        c3959f = Boolean.valueOf(z);
                        break;
                    } catch (Throwable th5) {
                        c3959f = new C3959f(th5);
                    }
                    if (!(c3959f instanceof C3959f)) {
                        boolean zBooleanValue = ((Boolean) c3959f).booleanValue();
                        if (!zBooleanValue) {
                            c1653m.f5443e = Math.min(j4, 30000L) + (jCurrentTimeMillis - j4);
                        }
                        sharedPreferences.edit().putLong("last_time", jCurrentTimeMillis).putString("last_result", zBooleanValue ? "刷新请求已提交" : "刷新请求提交失败").apply();
                    }
                    Throwable thM8182b = C3960g.m8182b(c3959f);
                    if (thM8182b != null) {
                        c1653m.f5443e = Math.min(j4, 30000L) + (jCurrentTimeMillis - j4);
                        String message = thM8182b.getMessage();
                        if (message != null) {
                            str3 = message;
                        }
                        sharedPreferences.edit().putLong("last_time", jCurrentTimeMillis).putString("last_result", "刷新异常：".concat(str3)).apply();
                        c1653m.f5439a.invoke("朋友圈自动刷新失败", thM8182b);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                C1666z c1666z = (C1666z) this.f11h;
                Map map = c1666z.f5482g;
                map.getClass();
                synchronized (map) {
                    Set<Map.Entry> setEntrySet = c1666z.f5482g.entrySet();
                    arrayList = new ArrayList(AbstractC4167n.m8429e1(setEntrySet));
                    for (Map.Entry entry : setEntrySet) {
                        arrayList.add(new C3958e(entry.getKey(), entry.getValue()));
                        break;
                    }
                }
                for (C3958e c3958e : arrayList) {
                    View view = (View) c3958e.f12961g;
                    Object obj3 = c3958e.f12962h;
                    view.getClass();
                    c1666z.m4261q(view);
                    obj3.getClass();
                    if (c1666z.m4262r(obj3)) {
                        c1666z.m4252d(view);
                    }
                }
                return;
            case 12:
                ((C3080d) this.f11h).m6547e();
                return;
            case 13:
                ((C2345i) this.f11h).m5606a();
                return;
            case 14:
                C1625b c1625b = (C1625b) this.f11h;
                synchronized (c1625b) {
                    if (!c1625b.f5325e && (c3080d = c1625b.f5321a) != null) {
                        c3080d.m6549g(new C1364e(c1625b, i9));
                        c1625b.f5325e = true;
                        if (c1625b.f5323c != null) {
                            C2005i.m4939f("[WeChatConversationChangeApi] ".concat("会话变更监听已安装"));
                            break;
                        }
                        return;
                    }
                    return;
                }
            case 15:
                C1369j c1369j = (C1369j) this.f11h;
                synchronized (c1369j) {
                    if (!c1369j.f4553e && (c3080d2 = c1369j.f4549a) != null) {
                        c3080d2.m6549g(new C1364e(c1369j, i10));
                        c1369j.f4553e = true;
                        if (c1369j.f4551c != null) {
                            C2005i.m4939f("[WeChatContactChangeApi] ".concat("联系人变更监听已安装"));
                            break;
                        }
                        return;
                    }
                    return;
                }
            case 16:
                m106a();
                return;
            case 17:
                m107b();
                return;
            case 18:
                m108c();
                return;
            case 19:
                m109d();
                return;
            case 20:
                ((C2352p) this.f11h).m5637b();
                return;
            case 21:
                m110e();
                return;
            case 22:
                Toast.makeText(((C2007a0) this.f11h).f6758a.f12143a, "伪评论仅在本机显示，不能回复", 0).show();
                return;
            case 23:
                C3742g c3742g = (C3742g) this.f11h;
                try {
                    DexKitBridge dexKitBridge = c3742g.f12146d;
                    ClassLoader classLoader = c3742g.f12145c;
                    Context context = c3742g.f12143a;
                    C0829c c0829c = new C0829c(dexKitBridge, classLoader, context);
                    C2034b c2034b = new C2034b(context, 0);
                    SharedPreferences sharedPreferences2 = c2034b.f6870a;
                    c0829c.m2108k(sharedPreferences2.getBoolean("plus_menu_enable", false) || sharedPreferences2.getBoolean("plugin_agent_plus_menu_enable", false) || AbstractC6019i.m10782c(context) || AbstractC1089i.m2749T(context));
                    new C3453h(context, classLoader, c0829c, c2034b).m7251r();
                    return;
                } catch (Throwable th6) {
                    AbstractC1184v0.m3204n("[Hchat:Settings] 设置入口安装失败", th6);
                    return;
                }
            case 24:
                m111f();
                return;
            case 25:
                C2887v c2887v = (C2887v) this.f11h;
                C0184c c0184c = c2887v.f9327b;
                c2887v.f9339n = null;
                C2046b c2046b = c2887v.f9338m;
                View view2 = c2887v.f9326a;
                if (!view2.isFocused() && (viewFindFocus = view2.getRootView().findFocus()) != null && viewFindFocus.onCheckIsTextEditor()) {
                    c2046b.m5061g();
                    return;
                }
                Object[] objArr = c2046b.f6891g;
                int i16 = c2046b.f6893i;
                Boolean boolValueOf = null;
                for (int i17 = 0; i17 < i16; i17++) {
                    EnumC2886u enumC2886u = (EnumC2886u) objArr[i17];
                    int iOrdinal2 = enumC2886u.ordinal();
                    if (iOrdinal2 == 0) {
                        bool = Boolean.TRUE;
                    } else if (iOrdinal2 == 1) {
                        bool = Boolean.FALSE;
                    } else if (iOrdinal2 != 2 && iOrdinal2 != 3) {
                        C3193a.m6822k();
                        return;
                    } else {
                        if (!AbstractC1416l.m3825a(bool, Boolean.FALSE)) {
                            boolValueOf = Boolean.valueOf(enumC2886u == EnumC2886u.f9323i);
                        }
                    }
                    boolValueOf = bool;
                }
                c2046b.m5061g();
                if (AbstractC1416l.m3825a(bool, Boolean.TRUE)) {
                    ((InputMethodManager) c0184c.f470b.getValue()).restartInput((View) c0184c.f469a);
                }
                if (boolValueOf != null) {
                    if (boolValueOf.booleanValue()) {
                        ((C0119x) ((C0119x) c0184c.f471c).f310h).mo596b0();
                    } else {
                        ((C0119x) ((C0119x) c0184c.f471c).f310h).mo614y();
                    }
                }
                if (AbstractC1416l.m3825a(bool, Boolean.FALSE)) {
                    ((InputMethodManager) c0184c.f470b.getValue()).restartInput((View) c0184c.f469a);
                    return;
                }
                return;
            case 26:
                m112g();
                return;
            case 27:
                ((C3779c) this.f11h).m7933f();
                return;
            case 28:
                ((C4287f) this.f11h).invoke();
                return;
            default:
                ((C1421q) this.f11h).f4734g = false;
                return;
        }
    }

    public /* synthetic */ RunnableC0003a(Object obj, int i9) {
        this.f10g = i9;
        this.f11h = obj;
    }
}
