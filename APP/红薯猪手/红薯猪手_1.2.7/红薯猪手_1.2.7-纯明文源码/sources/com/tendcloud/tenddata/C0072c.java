package com.tendcloud.tenddata;

import android.app.Activity;
import android.os.Message;
import com.tendcloud.tenddata.C0133zz;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.tendcloud.tenddata.c */
/* JADX INFO: loaded from: classes.dex */
final class C0072c {
    private C0072c() {
    }

    /* JADX INFO: renamed from: a */
    public static void m388a(Activity activity, final AbstractC0018a abstractC0018a) {
        try {
            C0020ab.f139n = 0;
            C0133zz.m795b().removeMessages(0);
            if (activity == null || (activity.getChangingConfigurations() & 128) != 128) {
                C0131y.execute(new Runnable() { // from class: com.tendcloud.tenddata.c.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            C0133zz.a aVar = new C0133zz.a();
                            aVar.paraMap.put("apiType", 10);
                            aVar.paraMap.put("occurTime", Long.valueOf(System.currentTimeMillis()));
                            aVar.paraMap.put("service", abstractC0018a);
                            Message.obtain(C0133zz.m796c(), C0133zz.f658f, aVar).sendToTarget();
                        } catch (Throwable unused) {
                        }
                    }
                });
            } else {
                C0115h.iForDeveloper("Ignore page changing during screen switch");
                C0133zz.f656d = true;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m389a(AbstractC0018a abstractC0018a) {
        if (C0020ab.f100J || !m390a()) {
            return;
        }
        m388a(null, abstractC0018a);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m390a() {
        boolean zBooleanValue = false;
        try {
            zBooleanValue = ((Boolean) Class.forName("android.app.Activity").getDeclaredMethod("isResumed", new Class[0]).invoke(m391b(), new Object[0])).booleanValue();
            C0020ab.f100J = true;
            return zBooleanValue;
        } catch (Throwable th) {
            C0115h.eForInternal(th);
            return zBooleanValue;
        }
    }

    /* JADX INFO: renamed from: b */
    private static Activity m391b() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object objInvoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
        } catch (Throwable unused) {
        }
        for (Object obj : ((Map) declaredField.get(objInvoke)).values()) {
            Class<?> cls2 = obj.getClass();
            Field declaredField2 = cls2.getDeclaredField("paused");
            declaredField2.setAccessible(true);
            if (!declaredField2.getBoolean(obj)) {
                Field declaredField3 = cls2.getDeclaredField("activity");
                declaredField3.setAccessible(true);
                return (Activity) declaredField3.get(obj);
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static void m392b(final Activity activity, final AbstractC0018a abstractC0018a) {
        try {
            if (C0020ab.f100J) {
                C0020ab.f139n = 1;
                C0133zz.m795b().removeMessages(0);
                Message messageObtain = Message.obtain();
                messageObtain.obj = abstractC0018a;
                messageObtain.what = 0;
                C0133zz.m795b().sendMessageDelayed(messageObtain, C0020ab.f118aa);
                C0131y.execute(new Runnable() { // from class: com.tendcloud.tenddata.c.2
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            C0133zz.a aVar = new C0133zz.a();
                            aVar.paraMap.put("apiType", 11);
                            aVar.paraMap.put("service", abstractC0018a);
                            HashMap<String, Object> map = aVar.paraMap;
                            Activity activity2 = activity;
                            map.put("pageName", activity2 != null ? activity2.getLocalClassName() : "");
                            aVar.paraMap.put("occurTime", String.valueOf(System.currentTimeMillis()));
                            Message.obtain(C0133zz.m796c(), C0133zz.f658f, aVar).sendToTarget();
                        } catch (Throwable unused) {
                        }
                    }
                });
            }
        } catch (Throwable unused) {
        }
    }
}
