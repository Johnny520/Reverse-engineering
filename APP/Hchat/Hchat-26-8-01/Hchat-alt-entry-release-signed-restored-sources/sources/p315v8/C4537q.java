package p315v8;

import af.C0081d;
import android.content.Context;
import androidx.lifecycle.C0119x;
import bb.C0240b;
import be.C0285i;
import ca.C0512c;
import ca.C0532s;
import gg.AbstractC1416l;
import gg.C1423s;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import ng.AbstractC3015m;
import ng.C3010h;
import ng.C3011i;
import ng.C3022t;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p015b0.C0153s;
import p015b0.RunnableC0133c;
import p020b5.C0184c;
import p024b9.RunnableC0217c;
import p036c9.ThreadFactoryC0478q;
import p054dg.C0795n;
import p068eh.AbstractC0921a;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1220a;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.model.WeChatFileMsg;
import p099h.Hchat.hooks.api.model.WeChatImageMsg;
import p099h.Hchat.hooks.api.model.WeChatMessage;
import p099h.Hchat.hooks.api.model.WeChatVideoMsg;
import p099h.Hchat.hooks.api.runtime.WeChatDatabaseApi;
import p119i2.C1954y;
import p136j8.AbstractC2094e;
import p136j8.C2095f;
import p136j8.C2103n;
import p136j8.C2105p;
import p136j8.C2107r;
import p136j8.C2114y;
import p153k8.C2343g;
import p153k8.C2355s;
import p153k8.C2356t;
import p167l8.C2529d;
import p198nb.C2924a;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p218og.C3147k;
import p222p.AbstractC3199a;
import p227p4.C3315t;
import p259r9.C3766p;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p307v0.C4361a;
import tf.AbstractC4151b;
import tf.AbstractC4165l;
import tf.AbstractC4166m;
import tf.C4173t;
import tf.C4174u;

/* JADX INFO: renamed from: v8.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4537q {

    /* JADX INFO: renamed from: i */
    public static final C3147k f14969i = new C3147k("[0-9a-fA-F]{32}");

    /* JADX INFO: renamed from: a */
    public final C1954y f14970a;

    /* JADX INFO: renamed from: b */
    public final Context f14971b;

    /* JADX INFO: renamed from: c */
    public final ScheduledThreadPoolExecutor f14972c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f14973d;

    /* JADX INFO: renamed from: e */
    public final ConcurrentHashMap.KeySetView f14974e;

    /* JADX INFO: renamed from: f */
    public final ConcurrentHashMap.KeySetView f14975f;

    /* JADX INFO: renamed from: g */
    public final ConcurrentLinkedDeque f14976g;

    /* JADX INFO: renamed from: h */
    public long f14977h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4537q(Context context, C1954y c1954y) {
        this.f14970a = c1954y;
        Context applicationContext = context.getApplicationContext();
        this.f14971b = applicationContext != null ? applicationContext : context;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC0478q(26));
        scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(true);
        this.f14972c = scheduledThreadPoolExecutor;
        this.f14973d = new LinkedHashMap();
        this.f14974e = ConcurrentHashMap.newKeySet();
        this.f14975f = ConcurrentHashMap.newKeySet();
        this.f14976g = new ConcurrentLinkedDeque();
        m8962o(0L, new C4361a(this, 2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static String m8947c(String... strArr) {
        Object objInvoke;
        C3022t c3022tM6413W = AbstractC3015m.m6413W(new C3011i(AbstractC3015m.m6413W(AbstractC4165l.m8376k0(strArr), new C3766p(12)), true, new C3766p(13)), C4536p.f14968n);
        Iterator it = c3022tM6413W.f9822a.iterator();
        while (true) {
            if (!it.hasNext()) {
                objInvoke = null;
                break;
            }
            objInvoke = c3022tM6413W.f9823b.invoke(it.next());
            if (((File) objInvoke).isFile()) {
                break;
            }
        }
        File file = (File) objInvoke;
        String absolutePath = file != null ? file.getAbsolutePath() : null;
        return absolutePath == null ? HttpUrl.FRAGMENT_ENCODE_SET : absolutePath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static String m8948e(String... strArr) {
        String str;
        int length = strArr.length;
        int i9 = 0;
        while (true) {
            if (i9 >= length) {
                str = null;
                break;
            }
            str = strArr[i9];
            if (!(str == null || AbstractC3149m.m6721t0(str))) {
                break;
            }
            i9++;
        }
        return str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static boolean m8949f(C4528h c4528h, String str, long j3) {
        File file = new File(str);
        long length = file.isFile() ? file.length() : -1L;
        if (length > 0 && (j3 <= 0 || length >= j3)) {
            if (c4528h.f14959t.equals(file.getAbsolutePath()) && c4528h.f14960u == length) {
                c4528h.f14961v++;
            } else {
                String absolutePath = file.getAbsolutePath();
                absolutePath.getClass();
                c4528h.f14959t = absolutePath;
                c4528h.f14960u = length;
                c4528h.f14961v = 0;
            }
            if (c4528h.f14961v >= 1) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static long m8950h(WeChatMessage weChatMessage, String str) {
        Long lM6743g0 = AbstractC3156t.m6743g0(m8951i(weChatMessage, str));
        if (lM6743g0 != null) {
            long jLongValue = lM6743g0.longValue();
            if (jLongValue >= 0) {
                return jLongValue;
            }
        }
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static String m8951i(WeChatMessage weChatMessage, String str) {
        Object objInvoke;
        C3022t c3022tM6413W = AbstractC3015m.m6413W(AbstractC4165l.m8376k0(new String[]{weChatMessage.bodyContent(), weChatMessage.reserved, weChatMessage.translatedContent, weChatMessage.msgSource}), new C0532s(str, 17));
        Iterator it = c3022tM6413W.f9822a.iterator();
        while (true) {
            if (!it.hasNext()) {
                objInvoke = null;
                break;
            }
            objInvoke = c3022tM6413W.f9823b.invoke(it.next());
            if (!AbstractC3149m.m6721t0((String) objInvoke)) {
                break;
            }
        }
        String str2 = (String) objInvoke;
        return str2 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static ArrayList m8952l(int i9, String str) {
        C2355s c2355sMessageStore = WeChatApis.messageStore();
        Iterable iterableM5664f = c2355sMessageStore != null ? c2355sMessageStore.m5664f(24, str) : null;
        if (iterableM5664f == null) {
            iterableM5664f = C4173t.f13710g;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterableM5664f) {
            WeChatMessage weChatMessage = (WeChatMessage) obj;
            if (weChatMessage.isOutgoing()) {
                int i10 = weChatMessage.type;
                if (i10 > 0) {
                    int i11 = i10 & 255;
                    int i12 = 65535 & i10;
                    if ((i10 >>> 16) != 0) {
                        if (i12 == 10000 || i12 == 10002) {
                            i10 = i12;
                        } else if (i11 != 0 && i12 == i11) {
                            i10 = i11;
                        }
                    }
                }
                if (i10 == i9) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bd  */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m8953n(C4521a c4521a, String str, String str2, int i9, String str3, boolean z9, String str4) {
        boolean z10 = c4521a.f14899c;
        Set set = c4521a.f14902f;
        if (z10 && c4521a.f14901e.contains(str) && (!z9 || c4521a.f14900d)) {
            if (!set.isEmpty()) {
                WeChatMessage.Companion.getClass();
                if (C2529d.m5941g(str) && !AbstractC3149m.m6721t0(str4)) {
                    if (set.contains(str + "/" + str4)) {
                        Set set2 = c4521a.f14904h;
                        if (!set2.contains(str2)) {
                            if (i9 > 0) {
                                int i10 = i9 & 255;
                                int i11 = 65535 & i9;
                                if ((i9 >>> 16) != 0) {
                                    if (i11 == 10000 || i11 == 10002) {
                                        i9 = i11;
                                    } else if (i10 != 0 && i11 == i10) {
                                        i9 = i10;
                                    }
                                }
                            }
                            boolean z11 = i9 == 62 && set2.contains("video_number_video");
                            if (z11) {
                                if (c4521a.f14907k) {
                                    C4538r c4538r = C4538r.f14978a;
                                    ArrayList arrayListM8968c = C4538r.m8968c(c4521a.f14908l);
                                    if (arrayListM8968c.isEmpty()) {
                                        if (c4521a.f14909m) {
                                            C4538r c4538r2 = C4538r.f14978a;
                                            ArrayList arrayListM8968c2 = C4538r.m8968c(c4521a.f14910n);
                                            if (!arrayListM8968c2.isEmpty()) {
                                                Iterator it = arrayListM8968c2.iterator();
                                                while (it.hasNext()) {
                                                    if (AbstractC3149m.m6709h0(str3, (String) it.next(), true)) {
                                                    }
                                                }
                                            }
                                        }
                                        return true;
                                    }
                                    if (!arrayListM8968c.isEmpty()) {
                                        Iterator it2 = arrayListM8968c.iterator();
                                        while (it2.hasNext()) {
                                            if (AbstractC3149m.m6709h0(str3, (String) it2.next(), true)) {
                                                if (c4521a.f14909m) {
                                                }
                                                return true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0061  */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m8954p(C4526f c4526f, String str) {
        C2103n c2103n;
        C2114y c2114y;
        C0240b c0240b;
        C2095f c2095f;
        C0119x c0119x;
        C2343g c2343gM6844q = AbstractC3199a.m6844q();
        if (c2343gM6844q == null) {
            return false;
        }
        C2105p c2105pMedia = WeChatApis.media();
        int i9 = c4526f.f14928a;
        String str2 = c4526f.f14929b;
        String str3 = c4526f.f14930c;
        if (i9 == 1) {
            return c2343gM6844q.m5601x(str, str2);
        }
        if (i9 != 3) {
            if (i9 != 34) {
                if (i9 == 62) {
                    if (c2105pMedia == null || (c0240b = c2105pMedia.f7037c) == null || !c0240b.m972q(str, str3)) {
                        return false;
                    }
                } else {
                    if (i9 == 66 || i9 == 42) {
                        return c2343gM6844q.m5599v(i9, str, str2);
                    }
                    if (i9 != 43) {
                        switch (i9) {
                            case 47:
                                if (c2105pMedia == null || (c2095f = c2105pMedia.f7038d) == null || !c2095f.m5219v(str, str3)) {
                                    return false;
                                }
                                break;
                            case 48:
                                return c2343gM6844q.m5599v(48, str, str2);
                            case 49:
                                if (AbstractC3149m.m6721t0(str3)) {
                                    return c2343gM6844q.m5603z(str, str2);
                                }
                                if (c2105pMedia == null || (c0119x = c2105pMedia.f7039e) == null || !c0119x.m588T(str, str3, c4526f.f14932e)) {
                                    return false;
                                }
                                break;
                            default:
                                return false;
                        }
                    }
                }
            } else if (c2105pMedia == null || (c2114y = c2105pMedia.f7036b) == null || !c2114y.m5323s(c4526f.f14931d, str, str3)) {
                return false;
            }
        } else if (c2105pMedia == null || (c2103n = c2105pMedia.f7035a) == null || !c2103n.m5274r(str, str3, HttpUrl.FRAGMENT_ENCODE_SET, true)) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m8955a(File file) {
        String strM8958g = m8958g(file);
        if (strM8958g != null) {
            if (file.isFile()) {
                file.delete();
            }
            this.f14975f.remove(strM8958g);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m8956b(C4528h c4528h, C4523c c4523c, InterfaceC1220a interfaceC1220a) {
        C4523c c4523c2;
        Object c3959f;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f14972c;
        if (scheduledThreadPoolExecutor.isShutdown()) {
            if (c4523c != null) {
                c4523c.invoke();
                return;
            }
            return;
        }
        try {
            c4523c2 = c4523c;
        } catch (Throwable th2) {
            th = th2;
            c4523c2 = c4523c;
        }
        try {
            scheduledThreadPoolExecutor.execute(new RunnableC0217c(c4528h, this, c4523c2, interfaceC1220a, 18));
            c3959f = C3967n.f12976a;
        } catch (Throwable th3) {
            th = th3;
            c3959f = new C3959f(th);
        }
        if (C3960g.m8182b(c3959f) == null || c4523c2 == null) {
            return;
        }
        c4523c2.invoke();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m8957d(C4528h c4528h) {
        if (this.f14974e.remove(c4528h.f14940a)) {
            c4528h.f14956q = false;
            if (c4528h.f14955p || !AbstractC3149m.m6721t0(c4528h.f14954o)) {
                m8962o(3600000L, new C4522b(this, c4528h, 1));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final String m8958g(File file) {
        Object c3959f;
        File file2 = new File(this.f14971b.getCacheDir(), "Hchat_auto_message_forward");
        try {
            File canonicalFile = file.getCanonicalFile();
            c3959f = canonicalFile.getPath();
            if (!Boolean.valueOf(AbstractC1416l.m3825a(canonicalFile.getParentFile(), file2.getCanonicalFile())).booleanValue()) {
                c3959f = null;
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        return (String) (c3959f instanceof C3959f ? null : c3959f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03f7 A[PHI: r31
  0x03f7: PHI (r31v1 v8.m) = (r31v0 v8.m), (r31v0 v8.m), (r31v0 v8.m), (r31v0 v8.m), (r31v0 v8.m), (r31v0 v8.m), (r31v2 v8.m), (r31v4 v8.m) binds: [B:416:0x071b, B:405:0x06e9, B:371:0x0664, B:240:0x0416, B:242:0x041a, B:357:0x0634, B:229:0x03fa, B:222:0x03e5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:324:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0632  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e7  */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC4534n m8959j(WeChatMessage weChatMessage, C4528h c4528h) {
        int i9;
        Object obj;
        C4533m c4533m;
        C4531k c4531k;
        Object next;
        InterfaceC4534n c4530j;
        C0240b c0240b;
        String str;
        C4525e c4525e;
        long jLongValue;
        long jLongValue2;
        Object c3959f;
        C2103n c2103n;
        String str2;
        C4525e c4525e2;
        C4525e c4525e3;
        long jM8950h;
        String strM8947c;
        C2114y c2114y;
        String strM5321q;
        Object c3959f2;
        int i10 = weChatMessage.type;
        if (i10 <= 0) {
            i9 = i10;
        } else {
            int i11 = i10 & 255;
            int i12 = 65535 & i10;
            if ((i10 >>> 16) != 0) {
                if (i12 == 10000 || i12 == 10002) {
                    i9 = i12;
                } else if (i11 != 0 && i12 == i11) {
                    i9 = i11;
                }
            }
        }
        long j3 = weChatMessage.msgId;
        Long lValueOf = Long.valueOf(j3);
        if (j3 <= 0) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            long jLongValue3 = lValueOf.longValue();
            try {
                WeChatDatabaseApi weChatDatabaseApiDatabase = WeChatApis.database();
                c3959f2 = weChatDatabaseApiDatabase != null ? weChatDatabaseApiDatabase.nativeMessageById(jLongValue3) : null;
            } catch (Throwable th2) {
                c3959f2 = new C3959f(th2);
            }
            if (c3959f2 instanceof C3959f) {
                c3959f2 = null;
            }
            obj = c3959f2;
        } else {
            obj = null;
        }
        boolean zIsVoice = weChatMessage.isVoice();
        C4533m c4533m2 = C4533m.f14966a;
        String str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (zIsVoice) {
            String string = AbstractC3149m.m6703R0(weChatMessage.imagePath).toString();
            if (AbstractC3149m.m6721t0(string)) {
                string = null;
            }
            if (string == null) {
                String strM6706U0 = AbstractC3149m.m6706U0(weChatMessage.bodyContent(), '\n', '\r');
                List listM6691F0 = AbstractC3149m.m6691F0(strM6706U0, new char[]{':'}, 6);
                if (listM6691F0.size() < 3 || AbstractC3149m.m6710i0(strM6706U0, '<')) {
                    WeChatMessage.Companion.getClass();
                    String strM5947m = C2529d.m5947m(strM6706U0, "filename");
                    if (AbstractC3149m.m6721t0(strM5947m)) {
                        strM5947m = C2529d.m5947m(strM6706U0, "voiceurl");
                    }
                    string = AbstractC3149m.m6721t0(strM5947m) ? C2529d.m5949o(strM6706U0, "filename") : strM5947m;
                } else {
                    string = AbstractC3149m.m6703R0((String) (listM6691F0.size() == 4 ? listM6691F0.get(1) : listM6691F0.get(0))).toString();
                }
            }
            if (AbstractC3149m.m6721t0(string)) {
                strM8947c = HttpUrl.FRAGMENT_ENCODE_SET;
            } else {
                strM8947c = m8947c(string);
                if (AbstractC3149m.m6721t0(strM8947c)) {
                    strM8947c = null;
                }
                if (strM8947c == null) {
                    C2105p c2105pMedia = WeChatApis.media();
                    String str4 = (c2105pMedia == null || (c2114y = c2105pMedia.f7036b) == null || (strM5321q = c2114y.m5321q(string)) == null || !AbstractC0921a.m2262y(strM5321q)) ? null : strM5321q;
                    if (str4 != null) {
                        strM8947c = str4;
                    }
                }
            }
            if (AbstractC3149m.m6721t0(strM8947c)) {
                return c4533m2;
            }
            ConcurrentHashMap concurrentHashMap = AbstractC2094e.f6999a;
            return new C4531k(new C4526f(i9, null, strM8947c, AbstractC2094e.m5193d(obj, string, weChatMessage.msgId, AbstractC0000a.m101y0(weChatMessage.content, weChatMessage.bodyContent()), 1000), null, 18));
        }
        C2356t c2356tM3195e = AbstractC1184v0.m3195e(weChatMessage, obj);
        boolean zIsText = weChatMessage.isText();
        C4532l c4532l = C4532l.f14965a;
        if (zIsText) {
            String str5 = c2356tM3195e != null ? c2356tM3195e.f7743c : null;
            if (str5 != null) {
                str3 = str5;
            }
            String str6 = !AbstractC3149m.m6721t0(str3) ? str3 : null;
            return str6 != null ? new C4531k(new C4526f(i9, str6, null, 0, null, 28)) : c4532l;
        }
        boolean zIsImage = weChatMessage.isImage();
        ConcurrentHashMap.KeySetView keySetView = this.f14975f;
        Context context = this.f14971b;
        C4529i c4529i = C4529i.f14962a;
        if (zIsImage) {
            String str7 = c2356tM3195e != null ? c2356tM3195e.f7746f : null;
            if (str7 != null) {
                str3 = str7;
            }
            C2105p c2105pMedia2 = WeChatApis.media();
            if (c2105pMedia2 == null || (c2103n = c2105pMedia2.f7035a) == null) {
                c4533m = c4533m2;
            } else {
                WeChatImageMsg imageMsg = weChatMessage.getImageMsg();
                String strM8947c2 = m8947c(c2103n.m5272p(obj));
                if (AbstractC3149m.m6721t0(strM8947c2)) {
                    c4533m = c4533m2;
                    str2 = str3;
                } else {
                    if (imageMsg != null) {
                        c4533m = c4533m2;
                        str2 = str3;
                        long j4 = imageMsg.bigLength;
                        Long lValueOf2 = Long.valueOf(j4);
                        if (j4 <= 0) {
                            lValueOf2 = null;
                        }
                        if (lValueOf2 != null) {
                            jM8950h = lValueOf2.longValue();
                        }
                        if (!m8949f(c4528h, strM8947c2, jM8950h)) {
                            c4530j = new C4531k(new C4526f(3, null, strM8947c2, 0, null, 26));
                        }
                    } else {
                        c4533m = c4533m2;
                        str2 = str3;
                    }
                    jM8950h = m8950h(weChatMessage, "hdlength");
                    if (!m8949f(c4528h, strM8947c2, jM8950h)) {
                    }
                }
                String strM8947c3 = m8947c(c4528h.f14954o);
                String str8 = !AbstractC3149m.m6721t0(strM8947c3) ? strM8947c3 : null;
                if (str8 != null) {
                    c4530j = new C4531k(new C4526f(3, null, str8, 0, null, 26));
                } else {
                    WeChatImageMsg imageMsg2 = weChatMessage.getImageMsg();
                    String strM8948e = m8948e(imageMsg2 != null ? imageMsg2.key : null, m8951i(weChatMessage, "aeskey"));
                    if (AbstractC3149m.m6721t0(strM8948e)) {
                        c4525e3 = null;
                        if (c4525e3 != null) {
                        }
                    } else {
                        String strM8948e2 = m8948e(imageMsg2 != null ? imageMsg2.bigImgUrl : null, m8951i(weChatMessage, "cdnbigimgurl"));
                        if (AbstractC3149m.m6721t0(strM8948e2)) {
                            String strM8948e3 = m8948e(imageMsg2 != null ? imageMsg2.midImgUrl : null, m8951i(weChatMessage, "cdnmidimgurl"));
                            if (!AbstractC3149m.m6721t0(strM8948e3)) {
                                String strM8948e4 = m8948e(imageMsg2 != null ? imageMsg2.md5 : null, m8951i(weChatMessage, "md5"));
                                long j5 = imageMsg2 != null ? imageMsg2.midLength : 0L;
                                Long lValueOf3 = Long.valueOf(j5);
                                if (j5 <= 0) {
                                    lValueOf3 = null;
                                }
                                c4525e2 = new C4525e(strM8948e4, strM8948e3, strM8948e, 2, lValueOf3 != null ? lValueOf3.longValue() : m8950h(weChatMessage, "length"));
                            }
                            c4525e3 = null;
                            if (c4525e3 != null && !c4528h.f14955p) {
                                File file = new File(context.getCacheDir(), "Hchat_auto_message_forward");
                                file.mkdirs();
                                String absolutePath = new File(file, AbstractC0921a.m2251n("image_", c4528h.f14952m, ".jpg")).getAbsolutePath();
                                absolutePath.getClass();
                                c4528h.f14953n = absolutePath;
                                String strM8958g = m8958g(new File(absolutePath));
                                if (strM8958g != null) {
                                    keySetView.getClass();
                                    keySetView.add(strM8958g);
                                }
                                c4528h.f14955p = true;
                                c4528h.f14956q = true;
                                if (c2103n.m5265e(c4525e3.f14924b, c4525e3.f14925c, absolutePath, c4525e3.f14926d, new C3315t(this, 13, c4528h))) {
                                    m8962o(60000L, new C4522b(c4528h, this));
                                    c4530j = c4529i;
                                } else {
                                    c4528h.f14956q = false;
                                    c4528h.f14957r = true;
                                    c4528h.f14958s = "CDN任务提交失败";
                                    if (c4528h.f14956q) {
                                    }
                                }
                            } else if (c4528h.f14956q) {
                                c4530j = c4529i;
                            } else {
                                if (!c4528h.f14957r || c4525e3 == null) {
                                    String strM8947c4 = m8947c(str2, strM8947c2, weChatMessage.imagePath);
                                    if (AbstractC3149m.m6721t0(strM8947c4)) {
                                        if (c4528h.f14957r) {
                                            String str9 = c4528h.f14958s;
                                            c4530j = new C4530j(AbstractC3149m.m6721t0(str9) ? "图片下载失败" : str9);
                                        }
                                    } else if (imageMsg != null) {
                                        long j10 = imageMsg.midLength;
                                        Long lValueOf4 = j10 > 0 ? Long.valueOf(j10) : null;
                                        long jLongValue4 = lValueOf4 != null ? lValueOf4.longValue() : m8950h(weChatMessage, "length");
                                        if (m8949f(c4528h, strM8947c4, jLongValue4)) {
                                            c4530j = new C4531k(new C4526f(3, null, strM8947c4, 0, null, 26));
                                        }
                                    }
                                } else {
                                    String str10 = c4528h.f14958s;
                                    c4530j = new C4530j(AbstractC3149m.m6721t0(str10) ? "图片下载失败" : str10);
                                }
                            }
                        } else {
                            String strM8948e5 = m8948e(imageMsg2 != null ? imageMsg2.md5 : null, m8951i(weChatMessage, "md5"));
                            long j11 = imageMsg2 != null ? imageMsg2.bigLength : 0L;
                            Long lValueOf5 = Long.valueOf(j11);
                            if (j11 <= 0) {
                                lValueOf5 = null;
                            }
                            c4525e2 = new C4525e(strM8948e5, strM8948e2, strM8948e, 1, lValueOf5 != null ? lValueOf5.longValue() : m8950h(weChatMessage, "hdlength"));
                        }
                        c4525e3 = c4525e2;
                        if (c4525e3 != null) {
                            if (c4528h.f14956q) {
                            }
                        }
                    }
                }
            }
            c4530j = c4533m;
        } else {
            c4533m = c4533m2;
            if (weChatMessage.isVideo()) {
                String str11 = c2356tM3195e != null ? c2356tM3195e.f7746f : null;
                if (str11 != null) {
                    str3 = str11;
                }
                C2105p c2105pMedia3 = WeChatApis.media();
                if (c2105pMedia3 == null || (c0240b = c2105pMedia3.f7037c) == null) {
                    c4530j = c4533m;
                } else {
                    Iterator it = AbstractC3015m.m6409S(new C3011i(AbstractC3015m.m6413W(AbstractC4165l.m8376k0(new String[]{weChatMessage.imagePath, str3}), new C3766p(14)), true, new C3766p(15))).iterator();
                    C2107r c2107r = null;
                    while (true) {
                        AbstractC4151b abstractC4151b = (AbstractC4151b) it;
                        if (!abstractC4151b.hasNext()) {
                            break;
                        }
                        try {
                            c3959f = c0240b.m969n((String) abstractC4151b.next());
                        } catch (Throwable th3) {
                            c3959f = new C3959f(th3);
                        }
                        if (c3959f instanceof C3959f) {
                            c3959f = null;
                        }
                        C2107r c2107r2 = (C2107r) c3959f;
                        if (c2107r2 != null) {
                            if (c2107r == null) {
                                c2107r = c2107r2;
                            }
                            String str12 = c2107r2.f7042b;
                            str12.getClass();
                            if (AbstractC3149m.m6721t0(str12)) {
                                continue;
                            } else {
                                String str13 = c2107r2.f7043c;
                                str13.getClass();
                                if (!AbstractC3149m.m6721t0(str13)) {
                                    c2107r = c2107r2;
                                    break;
                                }
                            }
                        }
                    }
                    WeChatVideoMsg videoMsg = weChatMessage.getVideoMsg();
                    int i13 = i9;
                    String strM8948e6 = m8948e(c2107r != null ? c2107r.f7042b : null, videoMsg != null ? videoMsg.cdnVideoUrl : null, m8951i(weChatMessage, "cdnvideourl"));
                    String strM8948e7 = m8948e(c2107r != null ? c2107r.f7043c : null, videoMsg != null ? videoMsg.aesKey : null, m8951i(weChatMessage, "aeskey"));
                    if (AbstractC3149m.m6721t0(strM8948e6) || AbstractC3149m.m6721t0(strM8948e7)) {
                        str = "CDN任务提交失败";
                        c4525e = null;
                    } else {
                        String strM8948e8 = m8948e(c2107r != null ? c2107r.f7041a : null, videoMsg != null ? videoMsg.md5 : null, videoMsg != null ? videoMsg.newMd5 : null, m8951i(weChatMessage, "md5"), m8951i(weChatMessage, "newmd5"));
                        str = "CDN任务提交失败";
                        long j12 = c2107r != null ? c2107r.f7044d : 0L;
                        Long lValueOf6 = Long.valueOf(j12);
                        if (j12 <= 0) {
                            lValueOf6 = null;
                        }
                        if (lValueOf6 != null) {
                            jLongValue2 = lValueOf6.longValue();
                        } else {
                            long j13 = videoMsg != null ? videoMsg.length : 0L;
                            Long lValueOf7 = Long.valueOf(j13);
                            if (j13 <= 0) {
                                lValueOf7 = null;
                            }
                            jLongValue2 = lValueOf7 != null ? lValueOf7.longValue() : m8950h(weChatMessage, "length");
                        }
                        c4525e = new C4525e(strM8948e8, strM8948e6, strM8948e7, 4, jLongValue2);
                    }
                    String str14 = weChatMessage.imagePath;
                    String strM8947c5 = m8947c(str3, str14, c0240b.m970o(str14));
                    if (AbstractC3149m.m6721t0(strM8947c5)) {
                        String strM8947c6 = m8947c(c4528h.f14954o);
                        String str15 = !AbstractC3149m.m6721t0(strM8947c6) ? strM8947c6 : null;
                        if (str15 != null) {
                            c4531k = new C4531k(new C4526f(i13, null, str15, 0, null, 26));
                            c4530j = c4531k;
                        } else if (c4525e != null && !c4528h.f14955p) {
                            File file2 = new File(context.getCacheDir(), "Hchat_auto_message_forward");
                            file2.mkdirs();
                            String absolutePath2 = new File(file2, AbstractC0921a.m2251n("video_", c4528h.f14952m, ".mp4")).getAbsolutePath();
                            absolutePath2.getClass();
                            c4528h.f14953n = absolutePath2;
                            String strM8958g2 = m8958g(new File(absolutePath2));
                            if (strM8958g2 != null) {
                                keySetView.getClass();
                                keySetView.add(strM8958g2);
                            }
                            c4528h.f14955p = true;
                            c4528h.f14956q = true;
                            if (((C2103n) c0240b.f640d).m5265e(c4525e.f14924b, c4525e.f14925c, absolutePath2, 4, new C0119x(new C0184c(c4525e, this, c4528h), 27))) {
                                m8962o(60000L, new C4522b(c4528h, this));
                                c4530j = c4529i;
                            } else {
                                c4528h.f14956q = false;
                                c4528h.f14957r = true;
                                c4528h.f14958s = str;
                                if (c4528h.f14956q) {
                                }
                            }
                        } else if (c4528h.f14956q) {
                            if (c4528h.f14957r) {
                                String str16 = c4528h.f14958s;
                                if (AbstractC3149m.m6721t0(str16)) {
                                    str16 = "视频下载失败";
                                }
                                c4530j = new C4530j(str16);
                            }
                        }
                    } else if (c2107r != null) {
                        long j14 = c2107r.f7044d;
                        Long lValueOf8 = Long.valueOf(j14);
                        if (j14 <= 0) {
                            lValueOf8 = null;
                        }
                        if (lValueOf8 != null) {
                            jLongValue = lValueOf8.longValue();
                        } else if (c4525e != null) {
                            jLongValue = c4525e.f14927e;
                        } else {
                            WeChatVideoMsg videoMsg2 = weChatMessage.getVideoMsg();
                            Long lValueOf9 = videoMsg2 != null ? Long.valueOf(videoMsg2.length) : null;
                            jLongValue = lValueOf9 != null ? lValueOf9.longValue() : 0L;
                        }
                        if (m8949f(c4528h, strM8947c5, jLongValue)) {
                            c4531k = new C4531k(new C4526f(i13, null, strM8947c5, 0, null, 26));
                        }
                        c4530j = c4531k;
                    }
                }
            } else if (i9 == 62) {
                String strM8947c7 = m8947c(c2356tM3195e != null ? c2356tM3195e.f7746f : null, weChatMessage.imagePath);
                String str17 = !AbstractC3149m.m6721t0(strM8947c7) ? strM8947c7 : null;
                if (str17 != null) {
                    c4531k = new C4531k(new C4526f(i9, null, str17, 0, null, 26));
                    c4530j = c4531k;
                }
                c4530j = c4533m;
            } else if (weChatMessage.isEmoji()) {
                String str18 = c2356tM3195e != null ? c2356tM3195e.f7746f : null;
                if (str18 != null) {
                    str3 = str18;
                }
                String strM8947c8 = m8947c(str3, weChatMessage.imagePath);
                if (AbstractC3149m.m6721t0(strM8947c8)) {
                    strM8947c8 = null;
                }
                if (strM8947c8 == null) {
                    Iterator it2 = AbstractC0000a.m101y0(str3, weChatMessage.imagePath).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        if (f14969i.m6683d((String) next)) {
                            break;
                        }
                    }
                    strM8947c8 = (String) next;
                    if (strM8947c8 == null) {
                        String strBodyContent = weChatMessage.bodyContent();
                        WeChatMessage.Companion.getClass();
                        String strM5947m2 = C2529d.m5947m(strBodyContent, "md5");
                        strM8947c8 = AbstractC3149m.m6721t0(strM5947m2) ? C2529d.m5949o(strBodyContent, "md5") : strM5947m2;
                    }
                }
                String str19 = !AbstractC3149m.m6721t0(strM8947c8) ? strM8947c8 : null;
                if (str19 != null) {
                    c4531k = new C4531k(new C4526f(i9, null, str19, 0, null, 26));
                    c4530j = c4531k;
                }
                c4530j = c4533m;
            } else {
                if (!weChatMessage.isFile()) {
                    if (weChatMessage.isShareCard() || weChatMessage.isLocation()) {
                        String str20 = c2356tM3195e != null ? c2356tM3195e.f7743c : null;
                        if (str20 != null) {
                            str3 = str20;
                        }
                        String str21 = !AbstractC3149m.m6721t0(str3) ? str3 : null;
                        return str21 != null ? new C4531k(new C4526f(i9, str21, null, 0, null, 28)) : c4532l;
                    }
                    if (!AbstractC1184v0.m3215y(weChatMessage)) {
                        return c4532l;
                    }
                    String str22 = c2356tM3195e != null ? c2356tM3195e.f7743c : null;
                    if (str22 != null) {
                        str3 = str22;
                    }
                    String str23 = !AbstractC3149m.m6721t0(str3) ? str3 : null;
                    return str23 != null ? new C4531k(new C4526f(i9, str23, null, 0, null, 28)) : c4532l;
                }
                String strM8947c9 = m8947c(c2356tM3195e != null ? c2356tM3195e.f7746f : null, weChatMessage.imagePath);
                String str24 = !AbstractC3149m.m6721t0(strM8947c9) ? strM8947c9 : null;
                if (str24 != null) {
                    WeChatFileMsg fileMsg = weChatMessage.getFileMsg();
                    String str25 = fileMsg != null ? fileMsg.title : null;
                    c4531k = new C4531k(new C4526f(i9, null, str24, 0, str25 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str25, 10));
                    c4530j = c4531k;
                }
                c4530j = c4533m;
            }
        }
        return c4530j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m8960k(C4528h c4528h) {
        WeChatMessage weChatMessageM5661c;
        C1954y c1954y = this.f14970a;
        C4538r c4538r = C4538r.f14978a;
        if (!C4538r.m8966a(this.f14971b)) {
            m8957d(c4528h);
            return;
        }
        try {
            C2355s c2355sMessageStore = WeChatApis.messageStore();
            if (c2355sMessageStore != null) {
                long j3 = c4528h.f14942c;
                if (j3 > 0) {
                    weChatMessageM5661c = c2355sMessageStore.m5663e(j3, c4528h.f14941b);
                    if (weChatMessageM5661c == null) {
                        weChatMessageM5661c = c2355sMessageStore.m5662d(c4528h.f14942c);
                    }
                } else {
                    long j4 = c4528h.f14943d.msgId;
                    weChatMessageM5661c = j4 > 0 ? c2355sMessageStore.m5661c(j4) : null;
                }
            }
            if (weChatMessageM5661c == null) {
                weChatMessageM5661c = c4528h.f14943d;
            }
            InterfaceC4534n interfaceC4534nM8959j = m8959j(weChatMessageM5661c, c4528h);
            int i9 = 0;
            if (interfaceC4534nM8959j instanceof C4531k) {
                m8963q(c4528h, ((C4531k) interfaceC4534nM8959j).f14964a, 0);
                return;
            }
            if (interfaceC4534nM8959j.equals(C4533m.f14966a)) {
                if (System.currentTimeMillis() < c4528h.f14951l) {
                    if (m8962o(500L, new C4522b(this, c4528h, i9))) {
                        return;
                    }
                    m8957d(c4528h);
                    return;
                }
                m8957d(c4528h);
                c1954y.invoke("等待消息媒体文件超时: talker=" + c4528h.f14941b + " msgSvrId=" + c4528h.f14942c, null);
                return;
            }
            if (interfaceC4534nM8959j.equals(C4529i.f14962a)) {
                return;
            }
            if (!(interfaceC4534nM8959j instanceof C4530j)) {
                if (!interfaceC4534nM8959j.equals(C4532l.f14965a)) {
                    throw new C0081d();
                }
                m8957d(c4528h);
                c1954y.invoke("消息类型暂不支持静默转发: talker=" + c4528h.f14941b + " type=" + weChatMessageM5661c.type, null);
                return;
            }
            m8957d(c4528h);
            c1954y.invoke("消息媒体准备失败: talker=" + c4528h.f14941b + " msgSvrId=" + c4528h.f14942c + " reason=" + ((C4530j) interfaceC4534nM8959j).f14963a, null);
        } catch (Throwable th2) {
            m8957d(c4528h);
            c1954y.invoke("准备转发消息异常: talker=" + c4528h.f14941b + " msgSvrId=" + c4528h.f14942c, th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m8961m(C4527g c4527g) {
        C3010h c3010h = new C3010h(new C3011i(new C0795n(m8952l(c4527g.f14934b, c4527g.f14933a), 6), true, new C2924a(c4527g, 17, this)));
        while (c3010h.hasNext()) {
            WeChatMessage weChatMessage = (WeChatMessage) c3010h.next();
            c4527g.f14938f.add(Long.valueOf(weChatMessage.msgId));
            long j3 = weChatMessage.msgSvrId;
            if (j3 > 0) {
                c4527g.f14939g.add(Long.valueOf(j3));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final boolean m8962o(long j3, InterfaceC1220a interfaceC1220a) {
        Object c3959f;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f14972c;
        if (scheduledThreadPoolExecutor.isShutdown()) {
            return false;
        }
        try {
            RunnableC0133c runnableC0133c = new RunnableC0133c(interfaceC1220a, 3);
            if (j3 < 0) {
                j3 = 0;
            }
            scheduledThreadPoolExecutor.schedule(runnableC0133c, j3, TimeUnit.MILLISECONDS);
            c3959f = Boolean.TRUE;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Object obj = Boolean.FALSE;
        if (c3959f instanceof C3959f) {
            c3959f = obj;
        }
        return ((Boolean) c3959f).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final void m8963q(C4528h c4528h, C4526f c4526f, int i9) {
        Object c3959f;
        try {
            m8964r(c4528h, c4526f, i9);
            c3959f = C3967n.f12976a;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            m8957d(c4528h);
            this.f14970a.invoke("执行转发任务异常: talker=" + c4528h.f14941b + " msgSvrId=" + c4528h.f14942c, thM8182b);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0097  */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m8964r(final C4528h c4528h, final C4526f c4526f, int i9) {
        List list;
        long j3;
        long jLongValue;
        Object c3959f;
        Comparable comparable;
        int i10 = c4526f.f14928a;
        C4538r c4538r = C4538r.f14978a;
        Context context = this.f14971b;
        if (!C4538r.m8966a(context)) {
            m8957d(c4528h);
            return;
        }
        final C1423s c1423s = new C1423s();
        c1423s.f4736g = i9;
        Long l10 = null;
        while (true) {
            int i11 = c1423s.f4736g;
            list = c4528h.f14944e;
            if (i11 >= list.size()) {
                break;
            }
            String str = (String) list.get(c1423s.f4736g);
            Map map = (Map) c4528h.f14945f.get(str);
            if (map == null) {
                map = C4174u.f13711g;
            }
            if (!map.isEmpty()) {
                C4538r c4538r2 = C4538r.f14978a;
                if (C4538r.m8966a(context)) {
                    C3010h c3010h = new C3010h(AbstractC3015m.m6414X(new C3011i(AbstractC4166m.m8415m1(C4538r.m8967b(context)), true, new C0153s(map, str, this, c4528h)), new C2924a(map, 18)));
                    if (c3010h.hasNext()) {
                        comparable = (Comparable) c3010h.next();
                        while (c3010h.hasNext()) {
                            Comparable comparable2 = (Comparable) c3010h.next();
                            if (comparable.compareTo(comparable2) > 0) {
                                comparable = comparable2;
                            }
                        }
                    } else {
                        comparable = null;
                    }
                    l10 = (Long) comparable;
                } else {
                    l10 = null;
                }
                if (l10 != null) {
                    break;
                } else {
                    c1423s.f4736g++;
                }
            }
        }
        if (c1423s.f4736g >= list.size()) {
            m8957d(c4528h);
            return;
        }
        String str2 = (String) list.get(c1423s.f4736g);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j4 = this.f14977h;
        if (l10 != null) {
            j3 = jCurrentTimeMillis;
            jLongValue = l10.longValue();
        } else {
            j3 = jCurrentTimeMillis;
            jLongValue = j3;
        }
        long jMax = Math.max(j4, jLongValue) - j3;
        if (jMax < 0) {
            jMax = 0;
        }
        if (jMax > 0) {
            final int i12 = 0;
            if (m8962o(jMax, new InterfaceC1220a(this) { // from class: v8.d

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ C4537q f14919h;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.f14919h = this;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p085fg.InterfaceC1220a
                public final Object invoke() {
                    switch (i12) {
                        case 0:
                            this.f14919h.m8963q(c4528h, c4526f, c1423s.f4736g);
                            break;
                        default:
                            this.f14919h.m8963q(c4528h, c4526f, c1423s.f4736g + 1);
                            break;
                    }
                    return C3967n.f12976a;
                }
            })) {
                return;
            }
            m8957d(c4528h);
            return;
        }
        try {
            c3959f = Boolean.valueOf(m8965s(c4526f, str2));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        C1954y c1954y = this.f14970a;
        if (thM8182b != null) {
            c1954y.invoke("转发消息异常: target=" + str2 + " type=" + i10, thM8182b);
        }
        if (!(c3959f instanceof C3959f) && !((Boolean) c3959f).booleanValue()) {
            c1954y.invoke("转发消息失败: target=" + str2 + " type=" + i10, null);
        }
        this.f14977h = System.currentTimeMillis() + 500;
        if (c1423s.f4736g + 1 >= list.size()) {
            m8957d(c4528h);
            return;
        }
        final int i13 = 1;
        if (m8962o(500L, new InterfaceC1220a(this) { // from class: v8.d

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ C4537q f14919h;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f14919h = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p085fg.InterfaceC1220a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        this.f14919h.m8963q(c4528h, c4526f, c1423s.f4736g);
                        break;
                    default:
                        this.f14919h.m8963q(c4528h, c4526f, c1423s.f4736g + 1);
                        break;
                }
                return C3967n.f12976a;
            }
        })) {
            return;
        }
        m8957d(c4528h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final boolean m8965s(C4526f c4526f, String str) {
        C0285i c0285i = new C0285i(new C0512c(System.currentTimeMillis() - 10000, 14), 28);
        ConcurrentLinkedDeque concurrentLinkedDeque = this.f14976g;
        concurrentLinkedDeque.removeIf(c0285i);
        while (concurrentLinkedDeque.size() >= 128) {
            concurrentLinkedDeque.pollFirst();
        }
        int i9 = c4526f.f14928a;
        if (i9 == 62) {
            i9 = 43;
        } else if (i9 > 0) {
            int i10 = i9 & 255;
            int i11 = 65535 & i9;
            if ((i9 >>> 16) != 0) {
                if (i11 == 10000 || i11 == 10002) {
                    i9 = i11;
                } else if (i10 != 0 && i11 == i10) {
                    i9 = i10;
                }
            }
        }
        int i12 = i9;
        String str2 = c4526f.f14929b;
        ArrayList arrayListM8952l = m8952l(i12, str);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = arrayListM8952l.iterator();
        while (it.hasNext()) {
            long j3 = ((WeChatMessage) it.next()).msgId;
            Long lValueOf = Long.valueOf(j3);
            if (j3 <= 0) {
                lValueOf = null;
            }
            if (lValueOf != null) {
                linkedHashSet.add(lValueOf);
            }
        }
        C4527g c4527g = new C4527g(str, i12, str2, linkedHashSet, System.currentTimeMillis());
        concurrentLinkedDeque.addLast(c4527g);
        try {
            boolean zM8954p = m8954p(c4526f, str);
            if (zM8954p) {
                m8961m(c4527g);
                return zM8954p;
            }
            concurrentLinkedDeque.remove(c4527g);
            return zM8954p;
        } catch (Throwable th2) {
            concurrentLinkedDeque.remove(c4527g);
            throw th2;
        }
    }
}
