package p000;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import me.dartcv.nuke.R;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: renamed from: jr */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0360jr extends gx2 {

    /* JADX INFO: renamed from: d */
    public static final C0360jr f5166d = new C0360jr(false);

    /* JADX INFO: renamed from: e */
    public static final int f5167e = R.string.chat_auto_reply;

    /* JADX INFO: renamed from: f */
    public static final int f5168f = R.string.chat_auto_reply_description;

    /* JADX INFO: renamed from: g */
    public static final wm0 f5169g = wm0.f12575i;

    /* JADX INFO: renamed from: h */
    public static final String f5170h = "ChatAutoReply";

    /* JADX INFO: renamed from: i */
    public static final boolean f5171i = true;

    /* JADX INFO: renamed from: j */
    public static final z52 f5172j = new z52();

    /* JADX INFO: renamed from: k */
    public static final ConcurrentHashMap f5173k = new ConcurrentHashMap();

    /* JADX INFO: renamed from: l */
    public static final AtomicLong f5174l = new AtomicLong();

    /* JADX INFO: renamed from: m */
    public static final ExecutorService f5175m = Executors.newSingleThreadExecutor(new ThreadFactoryC0714t(1));

    /* JADX INFO: renamed from: q */
    public static C0103cr m2547q() {
        pp1 pp1Var = pp1.f8445a;
        C0103cr c0103cr = (C0103cr) pp1.m3931c().m3605b(AbstractC0691se.m4815D(C0103cr.Companion.serializer()), new C0103cr(), "ChatAutoReply/config");
        return c0103cr == null ? new C0103cr() : c0103cr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x018c, code lost:
    
        r8 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bc  */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m2548r(by0 by0Var, long j) throws InterruptedException {
        AtomicLong atomicLong;
        String str;
        boolean zContains;
        boolean z;
        boolean z2;
        boolean zM3995h0;
        Iterable iterableM5065Q;
        Object x92Var;
        EnumC0323ir enumC0323ir;
        so2 so2VarM1838l;
        Class cls;
        po2 po2Var;
        AtomicLong atomicLong2 = f5174l;
        if (j != atomicLong2.get()) {
            return;
        }
        String str2 = by0Var.f1075b;
        String str3 = by0Var.f1074a;
        for (C0971zq c0971zq : m2547q().f1692a) {
            if (j != atomicLong2.get()) {
                return;
            }
            boolean z3 = c0971zq.f14024c;
            EnumC0323ir enumC0323ir2 = c0971zq.f14030i;
            String str4 = c0971zq.f14023b;
            if (z3) {
                f5166d.getClass();
                EnumC0176er enumC0176er = c0971zq.f14028g;
                Set set = c0971zq.f14029h;
                int iOrdinal = enumC0176er.ordinal();
                int i = 1;
                if (iOrdinal == 0) {
                    zContains = !set.contains(str3);
                } else {
                    if (iOrdinal != 1) {
                        c80.m675s();
                        return;
                    }
                    zContains = set.contains(str3);
                }
                if (zContains) {
                    List list = c0971zq.f14026e;
                    EnumC0250gr enumC0250gr = c0971zq.f14025d;
                    boolean z4 = c0971zq.f14027f;
                    ArrayList arrayList = new ArrayList(AbstractC0179eu.m1421B(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(pv2.m3993I0((String) it.next()).toString());
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        if (((String) obj).length() > 0) {
                            arrayList2.add(obj);
                        }
                    }
                    boolean zIsEmpty = arrayList2.isEmpty();
                    String str5 = f5170h;
                    int i2 = 2;
                    if (!zIsEmpty) {
                        String string = enumC0250gr == EnumC0250gr.f3671j ? pv2.m3993I0(str2).toString() : str2;
                        if (!arrayList2.isEmpty()) {
                            Iterator it2 = arrayList2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    atomicLong = atomicLong2;
                                    z = false;
                                    break;
                                }
                                String str6 = (String) it2.next();
                                int iOrdinal2 = enumC0250gr.ordinal();
                                if (iOrdinal2 == 0) {
                                    atomicLong = atomicLong2;
                                    zM3995h0 = pv2.m3995h0(string, str6, z4);
                                } else if (iOrdinal2 == i) {
                                    atomicLong = atomicLong2;
                                    zM3995h0 = wv2.m6006X(string, str6, z4);
                                } else {
                                    if (iOrdinal2 != i2) {
                                        c80.m675s();
                                        return;
                                    }
                                    if (z4) {
                                        try {
                                            iterableM5065Q = t11.m5065Q(p72.IGNORE_CASE);
                                        } catch (Throwable th) {
                                            x92Var = new x92(th);
                                        }
                                    } else {
                                        iterableM5065Q = fe0.f2918h;
                                    }
                                    str6.getClass();
                                    Iterator it3 = iterableM5065Q.iterator();
                                    int i3 = 0;
                                    while (it3.hasNext()) {
                                        i3 |= ((p72) it3.next()).f8015h;
                                    }
                                    if ((i3 & 2) != 0) {
                                        i3 |= 64;
                                    }
                                    Pattern patternCompile = Pattern.compile(str6, i3);
                                    patternCompile.getClass();
                                    string.getClass();
                                    x92Var = Boolean.valueOf(patternCompile.matcher(string).find());
                                    Throwable thM6237a = y92.m6237a(x92Var);
                                    if (thM6237a == null) {
                                        atomicLong = atomicLong2;
                                    } else {
                                        String message = thM6237a.getMessage();
                                        atomicLong = atomicLong2;
                                        StringBuilder sbM5696o = vi0.m5696o("Invalid regular expression in task ", str4, ": ", str6, ", reason=");
                                        sbM5696o.append(message);
                                        hg3.m2166d(str5, sbM5696o.toString());
                                        x92Var = Boolean.FALSE;
                                    }
                                    zM3995h0 = ((Boolean) x92Var).booleanValue();
                                }
                                if (zM3995h0) {
                                    z = true;
                                    break;
                                } else {
                                    atomicLong2 = atomicLong;
                                    i = 1;
                                    i2 = 2;
                                }
                            }
                        } else {
                            atomicLong = atomicLong2;
                            z2 = false;
                        }
                        if (z2) {
                            String str7 = c0971zq.f14022a + ":" + str3;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            Long l = (Long) f5173k.get(str7);
                            if (l != null) {
                                long jLongValue = jCurrentTimeMillis - l.longValue();
                                str = str2;
                                enumC0323ir = enumC0323ir2;
                                long j2 = c0971zq.f14034m;
                                if (j2 < 0) {
                                    j2 = 0;
                                }
                                if (jLongValue < j2) {
                                    hg3.m2168f(str5, "Task skipped by cooldown: task=" + str4 + ", talker=" + str3);
                                }
                            } else {
                                str = str2;
                                enumC0323ir = enumC0323ir2;
                            }
                            String lowerCase = enumC0323ir.name().toLowerCase(Locale.ROOT);
                            lowerCase.getClass();
                            hg3.m2168f(str5, "Task matched: task=" + str4 + ", talker=" + str3 + ", replyType=" + lowerCase);
                            long j3 = c0971zq.f14033l;
                            if (j3 > 0) {
                                if (j3 > AIChatConfig.MaxReplyDelayMs) {
                                    j3 = 60000;
                                }
                                Thread.sleep(j3);
                            }
                            if (j != atomicLong.get()) {
                                return;
                            }
                            String string2 = pv2.m3993I0(c0971zq.f14031j).toString();
                            int iOrdinal3 = enumC0323ir.ordinal();
                            if (iOrdinal3 != 0) {
                                io2 io2Var = io2.f4718j;
                                io2 io2Var2 = io2.f4721m;
                                io2 io2Var3 = io2.f4720l;
                                io2 io2Var4 = io2.f4716h;
                                if (iOrdinal3 == 1) {
                                    string2.getClass();
                                    boolean zM4006s0 = pv2.m4006s0(str3);
                                    po2 po2Var2 = po2.f8425i;
                                    if (zM4006s0) {
                                        so2VarM1838l = gd3.m1836i(po2Var2, io2Var4, "Talker is empty", str3, string2, null, 32);
                                    } else {
                                        try {
                                            Path path = Paths.get(string2, new String[0]);
                                            if (!Files.isRegularFile(path, new LinkOption[0])) {
                                                so2VarM1838l = gd3.m1836i(po2Var2, io2Var3, "Image source does not exist: ".concat(string2), str3, string2, null, 32);
                                            } else if (Files.isReadable(path)) {
                                                try {
                                                    hp2 hp2Var = hp2.f4103d;
                                                    px0.f8630d.getClass();
                                                    Class cls2 = (Class) px0.f8633g.getValue();
                                                    hp2Var.getClass();
                                                    Object objM2227j = hp2.m2227j(cls2);
                                                    Object objM4014j = px0.m4014j(string2, str3);
                                                    ((Method) px0.f8634h.getValue()).invoke(objM2227j, objM4014j);
                                                    so2VarM1838l = new ro2(new ko2(str3, string2, objM4014j.getClass().getName()));
                                                } catch (Throwable th2) {
                                                    so2VarM1838l = gd3.m1837k(po2Var2, str3, string2, th2);
                                                }
                                            } else {
                                                so2VarM1838l = gd3.m1836i(po2Var2, io2Var2, "Image source is not readable: ".concat(string2), str3, string2, null, 32);
                                            }
                                        } catch (InvalidPathException e) {
                                            String message2 = e.getMessage();
                                            if (message2 == null) {
                                                message2 = string2;
                                            }
                                            so2VarM1838l = gd3.m1835h(po2Var2, io2Var, "Invalid image path: ".concat(message2), str3, string2, e);
                                        }
                                    }
                                } else {
                                    if (iOrdinal3 != 2) {
                                        c80.m675s();
                                        return;
                                    }
                                    int i4 = c0971zq.f14032k;
                                    cls = gd3.class;
                                    string2.getClass();
                                    boolean zM4006s02 = pv2.m4006s0(str3);
                                    po2 po2Var3 = po2.f8426j;
                                    if (zM4006s02) {
                                        so2VarM1838l = gd3.m1836i(po2Var3, io2Var4, "Talker is empty", str3, string2, null, 32);
                                    } else if (1 > i4 || i4 >= 60001) {
                                        so2VarM1838l = gd3.m1836i(po2Var3, io2.f4719k, vi0.m5688g("Voice duration must be in 1..60000 ms: ", i4), str3, string2, null, 32);
                                    } else {
                                        try {
                                            Path path2 = Paths.get(string2, new String[0]);
                                            if (!Files.isRegularFile(path2, new LinkOption[0])) {
                                                so2VarM1838l = gd3.m1836i(po2Var3, io2Var3, "Voice source does not exist: ".concat(string2), str3, string2, null, 32);
                                            } else if (Files.isReadable(path2)) {
                                                try {
                                                    HashSet hashSet = b80.f729a;
                                                    Class<gd3> clsM3691A = p40.m3691A(d72.m967a(cls));
                                                    b80.m484a(clsM3691A != null ? clsM3691A : gd3.class, "silk_codec", false);
                                                    dc3.f1989d.getClass();
                                                    Object objInvoke = ((Method) dc3.f1991f.getValue()).invoke(null, str3, "amr_");
                                                    String str8 = objInvoke instanceof String ? (String) objInvoke : null;
                                                    if (str8 == null) {
                                                        throw new IllegalStateException("VoiceLogic returned an empty voice name");
                                                    }
                                                    Path path3 = Paths.get(dc3.m991j(str8), new String[0]);
                                                    Path parent = path3.getParent();
                                                    if (parent != null) {
                                                        Files.createDirectories(parent, new FileAttribute[0]);
                                                    }
                                                    Files.copy(path2, path3, StandardCopyOption.REPLACE_EXISTING);
                                                    if (dc3.m992k(str8, i4)) {
                                                        po2Var = po2Var3;
                                                        try {
                                                            Object objInvoke2 = ((Method) dc3.f1996k.getValue()).invoke(null, null);
                                                            if (objInvoke2 == null) {
                                                                throw new IllegalArgumentException("SceneVoiceService getter returned null");
                                                            }
                                                            ((Method) dc3.f1995j.getValue()).invoke(objInvoke2, null);
                                                            String string3 = path3.toString();
                                                            String str9 = str3;
                                                            try {
                                                                str3 = str9;
                                                                so2VarM1838l = new ro2(new no2(i4, str9, str8, string2, string3));
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                                str3 = str9;
                                                                so2VarM1838l = gd3.m1837k(po2Var, str3, string2, th);
                                                            }
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                        }
                                                    } else {
                                                        so2VarM1838l = gd3.m1836i(po2Var3, io2.f4724p, "WeChat rejected voice metadata registration: ".concat(str8), str3, string2, null, 32);
                                                    }
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    po2Var = po2Var3;
                                                }
                                            } else {
                                                so2VarM1838l = gd3.m1836i(po2Var3, io2Var2, "Voice source is not readable: ".concat(string2), str3, string2, null, 32);
                                            }
                                        } catch (InvalidPathException e2) {
                                            String message3 = e2.getMessage();
                                            if (message3 == null) {
                                                message3 = string2;
                                            }
                                            so2VarM1838l = gd3.m1835h(po2Var3, io2Var, "Invalid voice path: ".concat(message3), str3, string2, e2);
                                        }
                                    }
                                }
                            } else {
                                so2VarM1838l = gd3.m1838l(str3, string2);
                            }
                            so2VarM1838l.m4900a(new C0444m0(3, c0971zq, by0Var, str7), new C0115d2(9, c0971zq, by0Var));
                            if (c0971zq.f14035n) {
                                return;
                            }
                        }
                    }
                } else {
                    atomicLong = atomicLong2;
                }
                str = str2;
            }
            str2 = str;
            atomicLong2 = atomicLong;
        }
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: d */
    public final String mo9d() {
        return f5170h;
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: h */
    public final void mo319h(vb1 vb1Var) {
        f5174l.incrementAndGet();
        m2547q();
        vb1Var.m5664a(id3.f4575e, new C0829w(27));
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: i */
    public final void mo320i() {
        f5174l.incrementAndGet();
        f5172j.f13735d.clear();
        f5173k.clear();
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: j */
    public final String mo321j(Context context) {
        context.getClass();
        List list = m2547q().f1692a;
        int i = 0;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((C0971zq) it.next()).f14024c && (i = i + 1) < 0) {
                    AbstractC0179eu.m1445Z();
                    throw null;
                }
            }
        }
        String string = context.getString(R.string.chat_auto_reply_config_summary, Integer.valueOf(i), Integer.valueOf(list.size()));
        string.getClass();
        return string;
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: k */
    public final Integer mo141k() {
        return Integer.valueOf(f5168f);
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: l */
    public final boolean mo322l() {
        return f5171i;
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: m */
    public final int mo142m() {
        return f5167e;
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: n */
    public final wm0 mo143n() {
        return f5169g;
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: p */
    public final void mo323p(View view, xm0 xm0Var) {
        Activity activity;
        view.getClass();
        xm0Var.getClass();
        Context context = view.getContext();
        context.getClass();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            } else if (context instanceof Activity) {
                activity = (Activity) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
                context.getClass();
            }
        }
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new RunnableC0724t7(4, activity, new C0402kw(-2006994775, true, new C0866x(6, m2547q(), xm0Var))));
    }
}
