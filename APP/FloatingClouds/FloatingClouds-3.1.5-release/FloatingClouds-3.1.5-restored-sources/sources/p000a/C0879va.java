package p000a;

import android.content.Context;
import android.media.AudioAttributes;
import android.os.VibrationEffect;
import android.os.Vibrator;
import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import p000a.C0186K3;
import p000a.C0582fh;
import p000a.C0901wd;
import top.mmjz.floatingclouds.plugin.IPlugin;

/* JADX INFO: renamed from: a.va */
/* JADX INFO: loaded from: classes.dex */
public final class C0879va implements IPlugin {

    /* JADX INFO: renamed from: g */
    public static final a f3444g = new a();

    /* JADX INFO: renamed from: h */
    public static final AudioAttributes f3445h = new AudioAttributes.Builder().setUsage(4).setContentType(4).build();

    /* JADX INFO: renamed from: a */
    public volatile Field f3446a;

    /* JADX INFO: renamed from: b */
    public volatile Field f3447b;

    /* JADX INFO: renamed from: c */
    public volatile Field f3448c;

    /* JADX INFO: renamed from: d */
    public boolean f3449d;

    /* JADX INFO: renamed from: e */
    public long f3450e;

    /* JADX INFO: renamed from: f */
    public long f3451f;

    /* JADX INFO: renamed from: a.va$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static void m2105a(Vibrator vibrator, int i) {
            VibrationEffect vibrationEffectCreateOneShot;
            int iM748C = C0267Oc.m748C(i, 0, 100);
            long j = iM748C > 0 ? 30 + ((((long) iM748C) * 270) / ((long) 100)) : 30L;
            if (vibrator.hasAmplitudeControl()) {
                vibrationEffectCreateOneShot = VibrationEffect.createOneShot(j, iM748C > 0 ? C0267Oc.m748C((((iM748C * 254) * iM748C) / 10000) + 1, 1, 255) : 1);
            } else {
                vibrationEffectCreateOneShot = VibrationEffect.createOneShot(j, -1);
            }
            vibrator.vibrate(vibrationEffectCreateOneShot, C0879va.f3445h);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2103a(String str) {
        C0908x1.m2194b(Arrays.copyOf(new Object[]{C0944z.m2231k("[MaskedMsgVibrate] ", str)}, 1));
    }

    /* JADX INFO: renamed from: b */
    public final void m2104b(Object obj, ClassLoader classLoader) {
        Object objM2206a;
        Boolean bool;
        Object objM2206a2;
        Object objM2206a3;
        if (obj == null) {
            m2103a("onInsert skip: msgObj null");
            return;
        }
        C0186K3.f638a.getClass();
        if (!C0186K3.a.m511l()) {
            m2103a("onInsert skip: master disabled");
            return;
        }
        if (!C0186K3.a.m508i().f2418J) {
            m2103a("onInsert skip: switch off");
            return;
        }
        Object objM19h = C0002A1.m19h(obj, "field_talker");
        String str = objM19h instanceof String ? (String) objM19h : null;
        if (str != null) {
            if (C0034Be.m101P(str)) {
                str = null;
            }
            if (str != null) {
                ExecutorService executorService = C0582fh.f2149G;
                if (!C0582fh.a.m1423a(str)) {
                    m2103a("onInsert skip: not masked (" + str + ")");
                    return;
                }
                Field field = this.f3447b;
                boolean zBooleanValue = false;
                if (field != null) {
                    try {
                        Object obj2 = field.get(obj);
                        if (obj2 instanceof Boolean) {
                            zBooleanValue = ((Boolean) obj2).booleanValue();
                        } else if ((obj2 instanceof Number) && ((Number) obj2).intValue() != 0) {
                            zBooleanValue = true;
                        }
                        objM2206a = Boolean.valueOf(zBooleanValue);
                    } catch (Throwable th) {
                        objM2206a = C0920xd.m2206a(th);
                    }
                    Object obj3 = Boolean.FALSE;
                    if (objM2206a instanceof C0901wd.a) {
                        objM2206a = obj3;
                    }
                    zBooleanValue = ((Boolean) objM2206a).booleanValue();
                }
                if (zBooleanValue) {
                    m2103a("onInsert skip: self-sent (" + str + ")");
                    return;
                }
                ExecutorService executorService2 = C0582fh.f2149G;
                C0631i9.m1482e(classLoader, "cl");
                C0122Gb.f389a.getClass();
                if (C0122Gb.f393e == null || C0122Gb.f394f == null) {
                    bool = null;
                } else {
                    try {
                        Method method = C0122Gb.f393e;
                        C0631i9.m1479b(method);
                        Object objInvoke = method.invoke(C0122Gb.f391c, str);
                        if (objInvoke == null) {
                            bool = null;
                        } else {
                            Field field2 = C0122Gb.f394f;
                            C0631i9.m1479b(field2);
                            Object obj4 = field2.get(objInvoke);
                            objM2206a3 = Boolean.valueOf(C0631i9.m1478a(obj4 instanceof String ? (String) obj4 : null, "hidden_conv_parent"));
                        }
                    } catch (Throwable th2) {
                        objM2206a3 = C0920xd.m2206a(th2);
                    }
                    if (objM2206a3 instanceof C0901wd.a) {
                        objM2206a3 = null;
                    }
                    bool = (Boolean) objM2206a3;
                }
                if (C0631i9.m1478a(bool, Boolean.FALSE)) {
                    m2103a("onInsert skip: not hidden, wechat will notify (" + str + ")");
                    return;
                }
                Object objM19h2 = C0002A1.m19h(obj, "field_msgId");
                Long l = objM19h2 instanceof Long ? (Long) objM19h2 : null;
                long jLongValue = l != null ? l.longValue() : -1L;
                long jCurrentTimeMillis = System.currentTimeMillis();
                synchronized (this) {
                    if (jLongValue != -1) {
                        if (jLongValue == this.f3450e && jCurrentTimeMillis - this.f3451f < 1500) {
                            m2103a("onInsert skip: dedup (" + str + " msgId=" + jLongValue + ")");
                            return;
                        }
                    }
                    this.f3450e = jLongValue;
                    this.f3451f = jCurrentTimeMillis;
                    C0413Wf c0413Wf = C0413Wf.f1577a;
                    m2103a("onInsert TRIGGER vibrate: talker=" + str + " msgId=" + jLongValue + " hidden=" + bool);
                    Context context = C0889w1.f3488p;
                    if (context == null) {
                        m2103a("doVibrate skip: AppContext null");
                        return;
                    }
                    C0186K3.f638a.getClass();
                    int i = C0186K3.a.m508i().f2419K;
                    try {
                        Object systemService = context.getSystemService("vibrator");
                        Vibrator vibrator = systemService instanceof Vibrator ? (Vibrator) systemService : null;
                        if (vibrator == null) {
                            return;
                        }
                        f3444g.getClass();
                        a.m2105a(vibrator, i);
                        objM2206a2 = C0413Wf.f1577a;
                    } catch (Throwable th3) {
                        objM2206a2 = C0920xd.m2206a(th3);
                    }
                    Throwable thM2189a = C0901wd.m2189a(objM2206a2);
                    if (thM2189a != null) {
                        C0908x1.m2193a(Arrays.copyOf(new Object[]{"[MaskedMsgVibrate] vibrate fail", thM2189a}, 2));
                        return;
                    }
                    return;
                }
            }
        }
        m2103a("onInsert skip: talker empty");
    }

    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    public final void handleHook(C0173J8 c0173j8) {
        Class<?> cls;
        XposedInterface.HookHandle hookHandleM2206a;
        C0631i9.m1482e(c0173j8, "session");
        m2103a("handleHook started");
        ClassLoader classLoader = c0173j8.f608a;
        int i = -1;
        if (C0021B1.f64a == -1) {
            try {
                Context context = C0889w1.f3488p;
                C0631i9.m1479b(context);
                i = context.getPackageManager().getPackageInfo("com.tencent.mm", 0).versionCode;
            } catch (Exception e) {
                C0908x1.m2193a(Arrays.copyOf(new Object[]{e}, 1));
            }
            C0021B1.f64a = i;
        }
        C0578fd c0578fd = new C0578fd(C0021B1.f64a, classLoader);
        C0616hd.f2278a.getClass();
        C0597gd c0597gdM1467a = C0616hd.m1467a("F017_msg_storage", c0578fd);
        if (!c0597gdM1467a.f2208a || (cls = c0597gdM1467a.f2209b) == null) {
            C0647j6 c0647j6 = c0597gdM1467a.f2210c;
            m2103a("F017_msg_storage resolve FAILED: " + (c0647j6 != null ? c0647j6.f2390c : null));
            return;
        }
        String name = cls.getName();
        String strM1427b = c0597gdM1467a.m1427b("insertMethod");
        if (strM1427b == null) {
            strM1427b = "H9";
        }
        Class<?> clsM1426a = c0597gdM1467a.m1426a("msgInfoClass");
        m2103a("hook via=ENGINE path=" + c0597gdM1467a.f2211d + " storage=" + name + " method=" + strM1427b + " msgInfo=" + (clsM1426a != null ? clsM1426a.getName() : null));
        if (clsM1426a == null) {
            m2103a("msgInfoClass from Engine extras is null, skip vibrate hook");
            return;
        }
        synchronized (this) {
            try {
                if (!this.f3449d) {
                    for (Class<?> superclass = clsM1426a; superclass != null; superclass = superclass.getSuperclass()) {
                        C0112G1 c0112g1M2122I = C0889w1.m2122I(superclass.getDeclaredFields());
                        while (c0112g1M2122I.hasNext()) {
                            Field field = (Field) c0112g1M2122I.next();
                            String name2 = field.getName();
                            if (name2 != null) {
                                int iHashCode = name2.hashCode();
                                if (iHashCode != -8660297) {
                                    if (iHashCode != 290387262) {
                                        if (iHashCode == 696169719 && name2.equals("field_msgId") && this.f3448c == null) {
                                            field.setAccessible(true);
                                            this.f3448c = field;
                                        }
                                    } else if (name2.equals("field_talker") && this.f3446a == null) {
                                        field.setAccessible(true);
                                        this.f3446a = field;
                                    }
                                } else if (name2.equals("field_isSend") && this.f3447b == null) {
                                    field.setAccessible(true);
                                    this.f3447b = field;
                                }
                            }
                        }
                    }
                    this.f3449d = true;
                    Field field2 = this.f3446a;
                    String name3 = field2 != null ? field2.getName() : null;
                    Field field3 = this.f3447b;
                    String name4 = field3 != null ? field3.getName() : null;
                    Field field4 = this.f3448c;
                    m2103a("resolveFields done: talker=" + name3 + " isSend=" + name4 + " msgId=" + (field4 != null ? field4.getName() : null));
                    C0413Wf c0413Wf = C0413Wf.f1577a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            hookHandleM2206a = C0173J8.m463a(c0173j8, name, strM1427b, new Class[]{clsM1426a}, new C0683l4(this, 6, classLoader));
        } catch (Throwable th2) {
            hookHandleM2206a = C0920xd.m2206a(th2);
        }
        Throwable thM2189a = C0901wd.m2189a(hookHandleM2206a);
        if (thM2189a != null) {
            String message = thM2189a.getMessage();
            StringBuilder sbM2229i = C0944z.m2229i("hook ", name, ".", strM1427b, " fail: ");
            sbM2229i.append(message);
            m2103a(sbM2229i.toString());
        }
        Field field5 = this.f3446a;
        String name5 = field5 != null ? field5.getName() : null;
        Field field6 = this.f3447b;
        String name6 = field6 != null ? field6.getName() : null;
        Field field7 = this.f3448c;
        String name7 = field7 != null ? field7.getName() : null;
        StringBuilder sbM2229i2 = C0944z.m2229i("hook installed (", name, ".", strM1427b, ", talker=");
        sbM2229i2.append(name5);
        sbM2229i2.append(" isSend=");
        sbM2229i2.append(name6);
        sbM2229i2.append(" msgId=");
        sbM2229i2.append(name7);
        sbM2229i2.append(")");
        m2103a(sbM2229i2.toString());
    }
}
