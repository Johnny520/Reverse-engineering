package io.sentry.android.replay;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Looper;
import io.sentry.RunnableC1631S1;
import io.sentry.ThreadFactoryC1594J;
import io.sentry.util.C2035g;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.Executors;
import p000.AbstractC0073Bn;
import p000.C0554Mv;
import p000.InterfaceC0884Ui;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: io.sentry.android.replay.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1760a extends AbstractC0073Bn implements InterfaceC0884Ui {

    /* JADX INFO: renamed from: c */
    public static final C1760a f6398c;

    /* JADX INFO: renamed from: d */
    public static final C1760a f6399d;

    /* JADX INFO: renamed from: e */
    public static final C1760a f6400e;

    /* JADX INFO: renamed from: f */
    public static final C1760a f6401f;

    /* JADX INFO: renamed from: g */
    public static final C1760a f6402g;

    /* JADX INFO: renamed from: h */
    public static final C1760a f6403h;

    /* JADX INFO: renamed from: i */
    public static final C1760a f6404i;

    /* JADX INFO: renamed from: j */
    public static final C1760a f6405j;

    /* JADX INFO: renamed from: k */
    public static final C1760a f6406k;

    /* JADX INFO: renamed from: l */
    public static final C1760a f6407l;

    /* JADX INFO: renamed from: m */
    public static final C1760a f6408m;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f6409b;

    static {
        int i = 0;
        f6398c = new C1760a(i, 0);
        f6399d = new C1760a(i, 1);
        f6400e = new C1760a(i, 2);
        f6401f = new C1760a(i, 3);
        f6402g = new C1760a(i, 4);
        f6403h = new C1760a(i, 5);
        f6404i = new C1760a(i, 6);
        f6405j = new C1760a(i, 7);
        f6406k = new C1760a(i, 8);
        f6407l = new C1760a(i, 9);
        f6408m = new C1760a(i, 10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1760a(int i, int i2) {
        super(i);
        this.f6409b = i2;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [Dn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [Dn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [Dn, java.lang.Object] */
    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() throws NoSuchFieldException {
        Method method;
        switch (this.f6409b) {
            case 0:
                return new C0554Mv("_[a-z]");
            case 1:
                return new C2035g();
            case 2:
                return Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC1594J(2));
            case 3:
                C1798s c1798s = new C1798s();
                new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new RunnableC1631S1(9, c1798s));
                return c1798s;
            case 4:
                return new Paint();
            case 5:
                return Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            case 6:
                Class cls = (Class) C1824z.f6597a.getValue();
                if (cls == null) {
                    return null;
                }
                Field declaredField = cls.getDeclaredField("mViews");
                declaredField.setAccessible(true);
                return declaredField;
            case 7:
                try {
                    return Class.forName("android.view.WindowManagerGlobal");
                } catch (Throwable unused) {
                    return null;
                }
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                Class cls2 = (Class) C1824z.f6597a.getValue();
                if (cls2 == null || (method = cls2.getMethod("getInstance", null)) == null) {
                    return null;
                }
                return method.invoke(null, null);
            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                try {
                    return Class.forName("com.android.internal.policy.DecorView");
                } catch (Throwable unused2) {
                    return null;
                }
            default:
                Class cls3 = (Class) AbstractC1759D.f6379a.getValue();
                if (cls3 == null) {
                    return null;
                }
                try {
                    Field declaredField2 = cls3.getDeclaredField("mWindow");
                    declaredField2.setAccessible(true);
                    return declaredField2;
                } catch (NoSuchFieldException unused3) {
                    cls3.toString();
                    return null;
                }
        }
    }
}
