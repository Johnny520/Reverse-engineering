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

/* JADX INFO: renamed from: io.sentry.android.replay.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1760a extends AbstractC0073Bn implements InterfaceC0884Ui {

    /* JADX INFO: renamed from: c */
    public static final C1760a f6398c = null;

    /* JADX INFO: renamed from: d */
    public static final C1760a f6399d = null;

    /* JADX INFO: renamed from: e */
    public static final C1760a f6400e = null;

    /* JADX INFO: renamed from: f */
    public static final C1760a f6401f = null;

    /* JADX INFO: renamed from: g */
    public static final C1760a f6402g = null;

    /* JADX INFO: renamed from: h */
    public static final C1760a f6403h = null;

    /* JADX INFO: renamed from: i */
    public static final C1760a f6404i = null;

    /* JADX INFO: renamed from: j */
    public static final C1760a f6405j = null;

    /* JADX INFO: renamed from: k */
    public static final C1760a f6406k = null;

    /* JADX INFO: renamed from: l */
    public static final C1760a f6407l = null;

    /* JADX INFO: renamed from: m */
    public static final C1760a f6408m = null;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f6409b;

    static {
        int r1 = 0;
        f6398c = new C1760a(r1, 0);
        f6399d = new C1760a(r1, 1);
        f6400e = new C1760a(r1, 2);
        f6401f = new C1760a(r1, 3);
        f6402g = new C1760a(r1, 4);
        f6403h = new C1760a(r1, 5);
        f6404i = new C1760a(r1, 6);
        f6405j = new C1760a(r1, 7);
        f6406k = new C1760a(r1, 8);
        f6407l = new C1760a(r1, 9);
        f6408m = new C1760a(r1, 10);
    }

    public /* synthetic */ C1760a(int r1, int r2) {
        this.f6409b = r2;
        super(r1);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [Dn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [Dn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [Dn, java.lang.Object] */
    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch(this.f6409b) {
            case 0: goto L36;
            case 1: goto L34;
            case 2: goto L32;
            case 3: goto L29;
            case 4: goto L28;
            case 5: goto L26;
            case 6: goto L21;
            case 7: goto L39;
            case 8: goto L12;
            case 9: goto L41;
            default: goto L4;
        };
    L4:
        Class r0 = (Class) AbstractC1759D.f6379a.getValue();
        if (r0 == null) goto L45;
        Field r3 = r0.getDeclaredField("mWindow");     // Catch: NoSuchFieldException -> L8
        r3.setAccessible(true);     // Catch: NoSuchFieldException -> L8
        return r3;
    L8:
        r0.toString();
        return null;
    L45:
        return null;
    L12:
        Class r02 = (Class) C1824z.f6597a.getValue();
        if (r02 == null) goto L48;
        Method r03 = r02.getMethod("getInstance", null);
        if (r03 != null) goto L17;
        return null;
    L17:
        return r03.invoke(null, null);
    L48:
        return null;
    L21:
        Class r04 = (Class) C1824z.f6597a.getValue();
        if (r04 == null) goto L51;
        Field r2 = r04.getDeclaredField("mViews");
        r2.setAccessible(true);
        return r2;
    L51:
        return null;
    L29:
        C1798s r05 = new C1798s();
        new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new RunnableC1631S1(9, r05));
        return r05;
    L41:
        return Class.forName("com.android.internal.policy.DecorView");
    L47:
        return null;
    L39:
        return Class.forName("android.view.WindowManagerGlobal");
    L50:
        return null;
    L26:
        return Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
    L28:
        return new Paint();
    L32:
        return Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC1594J(2));
    L34:
        return new C2035g();
    L36:
        return new C0554Mv("_[a-z]");
    }
}
