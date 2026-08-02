package defpackage;

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
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class jr extends gx2 {
    public static final jr d = new jr(false);
    public static final int e = R.string.chat_auto_reply;
    public static final int f = R.string.chat_auto_reply_description;
    public static final wm0 g = wm0.i;
    public static final String h = "ChatAutoReply";
    public static final boolean i = true;
    public static final z52 j = new z52();
    public static final ConcurrentHashMap k = new ConcurrentHashMap();
    public static final AtomicLong l = new AtomicLong();
    public static final ExecutorService m = Executors.newSingleThreadExecutor(new t(1));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static cr q() {
        pp1 pp1Var = pp1.a;
        cr crVar = (cr) pp1.c().b(se.D(cr.Companion.serializer()), new cr(), "ChatAutoReply/config");
        return crVar == null ? new cr() : crVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x018c, code lost:
    
        r8 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void r(by0 by0Var, long j2) throws InterruptedException {
        AtomicLong atomicLong;
        String str;
        boolean zContains;
        boolean z;
        boolean z2;
        boolean zH0;
        Iterable iterableQ;
        Object x92Var;
        ir irVar;
        so2 so2VarL;
        Class cls;
        po2 po2Var;
        AtomicLong atomicLong2 = l;
        if (j2 != atomicLong2.get()) {
            return;
        }
        String str2 = by0Var.b;
        String str3 = by0Var.a;
        for (zq zqVar : q().a) {
            if (j2 != atomicLong2.get()) {
                return;
            }
            boolean z3 = zqVar.c;
            ir irVar2 = zqVar.i;
            String str4 = zqVar.b;
            if (z3) {
                d.getClass();
                er erVar = zqVar.g;
                Set set = zqVar.h;
                int iOrdinal = erVar.ordinal();
                int i2 = 1;
                if (iOrdinal == 0) {
                    zContains = !set.contains(str3);
                } else {
                    if (iOrdinal != 1) {
                        c80.s();
                        return;
                    }
                    zContains = set.contains(str3);
                }
                if (zContains) {
                    List list = zqVar.e;
                    gr grVar = zqVar.d;
                    boolean z4 = zqVar.f;
                    ArrayList arrayList = new ArrayList(eu.B(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(pv2.I0((String) it.next()).toString());
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        if (((String) obj).length() > 0) {
                            arrayList2.add(obj);
                        }
                    }
                    boolean zIsEmpty = arrayList2.isEmpty();
                    String str5 = h;
                    int i3 = 2;
                    if (!zIsEmpty) {
                        String string = grVar == gr.j ? pv2.I0(str2).toString() : str2;
                        if (!arrayList2.isEmpty()) {
                            Iterator it2 = arrayList2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    atomicLong = atomicLong2;
                                    z = false;
                                    break;
                                }
                                String str6 = (String) it2.next();
                                int iOrdinal2 = grVar.ordinal();
                                if (iOrdinal2 == 0) {
                                    atomicLong = atomicLong2;
                                    zH0 = pv2.h0(string, str6, z4);
                                } else if (iOrdinal2 == i2) {
                                    atomicLong = atomicLong2;
                                    zH0 = wv2.X(string, str6, z4);
                                } else {
                                    if (iOrdinal2 != i3) {
                                        c80.s();
                                        return;
                                    }
                                    if (z4) {
                                        try {
                                            iterableQ = t11.Q(p72.IGNORE_CASE);
                                        } catch (Throwable th) {
                                            x92Var = new x92(th);
                                        }
                                    } else {
                                        iterableQ = fe0.h;
                                    }
                                    str6.getClass();
                                    Iterator it3 = iterableQ.iterator();
                                    int i4 = 0;
                                    while (it3.hasNext()) {
                                        i4 |= ((p72) it3.next()).h;
                                    }
                                    if ((i4 & 2) != 0) {
                                        i4 |= 64;
                                    }
                                    Pattern patternCompile = Pattern.compile(str6, i4);
                                    patternCompile.getClass();
                                    string.getClass();
                                    x92Var = Boolean.valueOf(patternCompile.matcher(string).find());
                                    Throwable thA = y92.a(x92Var);
                                    if (thA == null) {
                                        atomicLong = atomicLong2;
                                    } else {
                                        String message = thA.getMessage();
                                        atomicLong = atomicLong2;
                                        StringBuilder sbO = vi0.o("Invalid regular expression in task ", str4, ": ", str6, ", reason=");
                                        sbO.append(message);
                                        hg3.d(str5, sbO.toString());
                                        x92Var = Boolean.FALSE;
                                    }
                                    zH0 = ((Boolean) x92Var).booleanValue();
                                }
                                if (zH0) {
                                    z = true;
                                    break;
                                } else {
                                    atomicLong2 = atomicLong;
                                    i2 = 1;
                                    i3 = 2;
                                }
                            }
                        } else {
                            atomicLong = atomicLong2;
                            z2 = false;
                        }
                        if (z2) {
                            String str7 = zqVar.a + ":" + str3;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            Long l2 = (Long) k.get(str7);
                            if (l2 != null) {
                                long jLongValue = jCurrentTimeMillis - l2.longValue();
                                str = str2;
                                irVar = irVar2;
                                long j3 = zqVar.m;
                                if (j3 < 0) {
                                    j3 = 0;
                                }
                                if (jLongValue < j3) {
                                    hg3.f(str5, "Task skipped by cooldown: task=" + str4 + ", talker=" + str3);
                                }
                            } else {
                                str = str2;
                                irVar = irVar2;
                            }
                            String lowerCase = irVar.name().toLowerCase(Locale.ROOT);
                            lowerCase.getClass();
                            hg3.f(str5, "Task matched: task=" + str4 + ", talker=" + str3 + ", replyType=" + lowerCase);
                            long j4 = zqVar.l;
                            if (j4 > 0) {
                                if (j4 > AIChatConfig.MaxReplyDelayMs) {
                                    j4 = 60000;
                                }
                                Thread.sleep(j4);
                            }
                            if (j2 != atomicLong.get()) {
                                return;
                            }
                            String string2 = pv2.I0(zqVar.j).toString();
                            int iOrdinal3 = irVar.ordinal();
                            if (iOrdinal3 != 0) {
                                io2 io2Var = io2.j;
                                io2 io2Var2 = io2.m;
                                io2 io2Var3 = io2.l;
                                io2 io2Var4 = io2.h;
                                if (iOrdinal3 == 1) {
                                    string2.getClass();
                                    boolean zS0 = pv2.s0(str3);
                                    po2 po2Var2 = po2.i;
                                    if (zS0) {
                                        so2VarL = gd3.i(po2Var2, io2Var4, "Talker is empty", str3, string2, null, 32);
                                    } else {
                                        try {
                                            Path path = Paths.get(string2, new String[0]);
                                            if (!Files.isRegularFile(path, new LinkOption[0])) {
                                                so2VarL = gd3.i(po2Var2, io2Var3, "Image source does not exist: ".concat(string2), str3, string2, null, 32);
                                            } else if (Files.isReadable(path)) {
                                                try {
                                                    hp2 hp2Var = hp2.d;
                                                    px0.d.getClass();
                                                    Class cls2 = (Class) px0.g.getValue();
                                                    hp2Var.getClass();
                                                    Object objJ = hp2.j(cls2);
                                                    Object objJ2 = px0.j(string2, str3);
                                                    ((Method) px0.h.getValue()).invoke(objJ, objJ2);
                                                    so2VarL = new ro2(new ko2(str3, string2, objJ2.getClass().getName()));
                                                } catch (Throwable th2) {
                                                    so2VarL = gd3.k(po2Var2, str3, string2, th2);
                                                }
                                            } else {
                                                so2VarL = gd3.i(po2Var2, io2Var2, "Image source is not readable: ".concat(string2), str3, string2, null, 32);
                                            }
                                        } catch (InvalidPathException e2) {
                                            String message2 = e2.getMessage();
                                            if (message2 == null) {
                                                message2 = string2;
                                            }
                                            so2VarL = gd3.h(po2Var2, io2Var, "Invalid image path: ".concat(message2), str3, string2, e2);
                                        }
                                    }
                                } else {
                                    if (iOrdinal3 != 2) {
                                        c80.s();
                                        return;
                                    }
                                    int i5 = zqVar.k;
                                    cls = gd3.class;
                                    string2.getClass();
                                    boolean zS02 = pv2.s0(str3);
                                    po2 po2Var3 = po2.j;
                                    if (zS02) {
                                        so2VarL = gd3.i(po2Var3, io2Var4, "Talker is empty", str3, string2, null, 32);
                                    } else if (1 > i5 || i5 >= 60001) {
                                        so2VarL = gd3.i(po2Var3, io2.k, vi0.g("Voice duration must be in 1..60000 ms: ", i5), str3, string2, null, 32);
                                    } else {
                                        try {
                                            Path path2 = Paths.get(string2, new String[0]);
                                            if (!Files.isRegularFile(path2, new LinkOption[0])) {
                                                so2VarL = gd3.i(po2Var3, io2Var3, "Voice source does not exist: ".concat(string2), str3, string2, null, 32);
                                            } else if (Files.isReadable(path2)) {
                                                try {
                                                    HashSet hashSet = b80.a;
                                                    Class<gd3> clsA = p40.A(d72.a(cls));
                                                    b80.a(clsA != null ? clsA : gd3.class, "silk_codec", false);
                                                    dc3.d.getClass();
                                                    Object objInvoke = ((Method) dc3.f.getValue()).invoke(null, str3, "amr_");
                                                    String str8 = objInvoke instanceof String ? (String) objInvoke : null;
                                                    if (str8 == null) {
                                                        throw new IllegalStateException("VoiceLogic returned an empty voice name");
                                                    }
                                                    Path path3 = Paths.get(dc3.j(str8), new String[0]);
                                                    Path parent = path3.getParent();
                                                    if (parent != null) {
                                                        Files.createDirectories(parent, new FileAttribute[0]);
                                                    }
                                                    Files.copy(path2, path3, StandardCopyOption.REPLACE_EXISTING);
                                                    if (dc3.k(str8, i5)) {
                                                        po2Var = po2Var3;
                                                        try {
                                                            Object objInvoke2 = ((Method) dc3.k.getValue()).invoke(null, null);
                                                            if (objInvoke2 == null) {
                                                                throw new IllegalArgumentException("SceneVoiceService getter returned null");
                                                            }
                                                            ((Method) dc3.j.getValue()).invoke(objInvoke2, null);
                                                            String string3 = path3.toString();
                                                            String str9 = str3;
                                                            try {
                                                                str3 = str9;
                                                                so2VarL = new ro2(new no2(i5, str9, str8, string2, string3));
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                                str3 = str9;
                                                                so2VarL = gd3.k(po2Var, str3, string2, th);
                                                            }
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                        }
                                                    } else {
                                                        so2VarL = gd3.i(po2Var3, io2.p, "WeChat rejected voice metadata registration: ".concat(str8), str3, string2, null, 32);
                                                    }
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    po2Var = po2Var3;
                                                }
                                            } else {
                                                so2VarL = gd3.i(po2Var3, io2Var2, "Voice source is not readable: ".concat(string2), str3, string2, null, 32);
                                            }
                                        } catch (InvalidPathException e3) {
                                            String message3 = e3.getMessage();
                                            if (message3 == null) {
                                                message3 = string2;
                                            }
                                            so2VarL = gd3.h(po2Var3, io2Var, "Invalid voice path: ".concat(message3), str3, string2, e3);
                                        }
                                    }
                                }
                            } else {
                                so2VarL = gd3.l(str3, string2);
                            }
                            so2VarL.a(new m0(3, zqVar, by0Var, str7), new d2(9, zqVar, by0Var));
                            if (zqVar.n) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final String d() {
        return h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final void h(vb1 vb1Var) {
        l.incrementAndGet();
        q();
        vb1Var.a(id3.e, new w(27));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final void i() {
        l.incrementAndGet();
        j.d.clear();
        k.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gw
    public final String j(Context context) {
        context.getClass();
        List list = q().a;
        int i2 = 0;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((zq) it.next()).c && (i2 = i2 + 1) < 0) {
                    eu.Z();
                    throw null;
                }
            }
        }
        String string = context.getString(R.string.chat_auto_reply_config_summary, Integer.valueOf(i2), Integer.valueOf(list.size()));
        string.getClass();
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gw
    public final Integer k() {
        return Integer.valueOf(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gw
    public final boolean l() {
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gw
    public final int m() {
        return e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gw
    public final wm0 n() {
        return g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gw
    public final void p(View view, xm0 xm0Var) {
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
        activity.runOnUiThread(new t7(4, activity, new kw(-2006994775, true, new x(6, q(), xm0Var))));
    }
}
