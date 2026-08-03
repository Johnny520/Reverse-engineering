package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Process;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: k3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2126k3 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7458a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f7459b;

    public /* synthetic */ RunnableC2126k3(Context r1, int r2) {
        this.f7458a = r2;
        this.f7459b = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f7458a) {
            case 0: goto L13;
            case 1: goto L11;
            case 2: goto L9;
            default: goto L4;
        };
    L4:
        Context r0 = this.f7459b;
        Intent r1 = r0.getPackageManager().getLaunchIntentForPackage(r0.getPackageName());
        if (r1 == null) goto L7;
        r1.addFlags(335544320);
    L7:
        r0.startActivity(r1);
        Process.killProcess(Process.myPid());
        return;
    L9:
        ExecutorC0037Au r02 = new ExecutorC0037Au();
        C0668Pg r12 = AbstractC0828TB.f2611c;
        AbstractC0828TB.m1634M(this.f7459b, r02, r12, false);
        return;
    L11:
        ThreadPoolExecutor r4 = new ThreadPoolExecutor(0, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
        Context r2 = this.f7459b;
        r4.execute(new RunnableC2126k3(r2, 2));
        return;
    L13:
        int r03 = Build.VERSION.SDK_INT;
        if (r03 < 33) goto L40;
        Context r5 = this.f7459b;
        ComponentName r3 = new ComponentName(r5, "androidx.appcompat.app.AppLocalesMetadataHolderService");
        if (r5.getPackageManager().getComponentEnabledSetting(r3) == 1) goto L40;
        if (r03 < 33) goto L30;
        C0607O4 r04 = AbstractC2397q3.f8404g;
        r04.getClass();
        C0349I4 r22 = new C0349I4(r04);
    L21:
        if (r22.hasNext() == false) goto L27;
        AbstractC2397q3 r05 = (AbstractC2397q3) ((WeakReference) r22.next()).get();
        if (r05 == null) goto L21;
        Context r06 = ((LayoutInflaterFactory2C0176E3) r05).f494k;
        if (r06 == null) goto L21;
        Object r07 = r06.getSystemService("locale");
    L28:
        if (r07 == null) goto L33;
        C1105Zo r23 = new C1105Zo(new C1186ap(AbstractC2217m3.m4461a(r07)));
    L35:
        if (r23.f3499a.f4071a.isEmpty() == false) goto L39;
        String r08 = AbstractC0585Nj.m1131L(r5);
        Object r24 = r5.getSystemService("locale");
        if (r24 == null) goto L39;
        AbstractC2217m3.m4462b(r24, AbstractC2174l3.m4371a(r08));
    L39:
        r5.getPackageManager().setComponentEnabledSetting(r3, 1, 1);
    L33:
        r23 = C1105Zo.f3498b;
        goto L35
    L27:
        r07 = null;
        goto L28
    L30:
        r23 = AbstractC2397q3.f8400c;
        if (r23 == null) goto L33;
    L40:
        AbstractC2397q3.f8403f = true;
    }
}
