package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ b3(Context r1, int r2) {
        this.a = r2;
        this.b = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.a) {
            case 0: goto L15;
            case 1: goto L9;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        ff.X(this.b, new hy(), ff.t, false);
        return;
    L6:
        new ThreadPoolExecutor(0, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new b3(this.b, 3));
        return;
    L9:
        if (Build.VERSION.SDK_INT < 28) goto L11;
        Handler r0 = my.a(Looper.getMainLooper());
    L12:
        int r1 = new Random().nextInt(Math.max(1000, 1));
        r0.postDelayed(new b3(this.b, 2), r1 + 5000);
        return;
    L11:
        r0 = new Handler(Looper.getMainLooper());
        goto L12
    L15:
        if (Build.VERSION.SDK_INT < 33) goto L41;
        Context r3 = this.b;
        ComponentName r02 = new ComponentName(r3, "androidx.appcompat.app.AppLocalesMetadataHolderService");
        if (r3.getPackageManager().getComponentEnabledSetting(r02) == 1) goto L41;
        if (ip.A() == false) goto L31;
        Iterator r12 = e3.g.iterator();
    L21:
        ss r5 = (ss) r12;
        if (r5.hasNext() == false) goto L28;
        e3 r52 = (e3) ((WeakReference) r5.next()).get();
        if (r52 == null) goto L21;
        Context r53 = ((r3) r52).k;
        if (r53 == null) goto L21;
        Object r13 = r53.getSystemService("locale");
    L29:
        if (r13 == null) goto L34;
        sr r54 = new sr(new tr(d3.a(r13)));
    L36:
        if (r54.a.a.isEmpty() == false) goto L40;
        String r14 = ip.L(r3);
        Object r4 = r3.getSystemService("locale");
        if (r4 == null) goto L40;
        d3.b(r4, c3.a(r14));
    L40:
        r3.getPackageManager().setComponentEnabledSetting(r02, 1, 1);
    L34:
        r54 = sr.b;
        goto L36
    L28:
        r13 = null;
        goto L29
    L31:
        r54 = e3.c;
        if (r54 == null) goto L34;
    L41:
        e3.f = true;
    }

    public /* synthetic */ b3(ProfileInstallerInitializer r1, Context r2) {
        this.a = 1;
        this.b = r2;
    }
}
