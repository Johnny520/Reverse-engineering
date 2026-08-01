package defpackage;

import android.content.Context;
import de.robv.android.xposed.XposedHelpers;
import io.fastkv.TagExecutor;
import java.util.Arrays;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fi implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fi(Object r1, Object r2, Object r3, int r4) {
        this.a = r4;
        this.b = r1;
        this.c = r2;
        this.d = r3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.a) {
            case 0: goto L36;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        TagExecutor.a((TagExecutor) this.b, (Runnable) this.c, (String) this.d);
        return;
    L6:
        ClassLoader r0 = (ClassLoader) this.b;
        Object r1 = this.c;
        String r9 = (String) this.d;
        hs r2 = hs.a;
        ip.l(r1);
        Object r3 = XposedHelpers.getObjectField(r1, pb0.z);     // Catch: Throwable -> L54
        String r5 = null;
        if ((r3 instanceof String) == false) goto L10;
        String r4 = (String) r3;     // Catch: Throwable -> L54
    L11:
        if (r4 == null) goto L60;
        Object r32 = XposedHelpers.getObjectField(r1, pb0.B);     // Catch: Throwable -> L54
        if (r32 == null) goto L61;
        String r6 = r32.toString();     // Catch: Throwable -> L54
        if (r6 == null) goto L62;
        int r33 = XposedHelpers.getIntField(r1, pb0.C);     // Catch: Throwable -> L54
        Object r12 = XposedHelpers.getObjectField(r1, pb0.A);     // Catch: Throwable -> L54
        if ((r12 instanceof String) == false) goto L21;
        r5 = (String) r12;     // Catch: Throwable -> L54
    L21:
        if (r5 != null) goto L23;
        String r7 = "";
    L24:
        String r13 = (String) hs.c.get(r4);     // Catch: Throwable -> L54
        if (r13 != null) goto L27;
        String r8 = "";
    L28:
        Class r14 = XposedHelpers.findClassIfExists(pb0.n, r0);     // Catch: Throwable -> L54
        if (r14 == null) goto L63;
        Object[] r22 = (Object[]) pb0.X0.c(r4, Integer.valueOf(r33), r6, r7, r8, r9);     // Catch: Throwable -> L54
        if (r22.length == 0) goto L64;
        Object r15 = XposedHelpers.newInstance(r14, Arrays.copyOf(r22, r22.length));     // Catch: Throwable -> L54
        ip.l(r15);     // Catch: Throwable -> L54
        hs.e(r0, r15);     // Catch: Throwable -> L54
        return;
    L64:
        return;
    L63:
        return;
    L27:
        r8 = r13;
        goto L28
    L23:
        r7 = r5;
        goto L24
    L62:
        return;
    L61:
        return;
    L60:
        return;
    L10:
        r4 = null;
    L65:
        return;
    L36:
        l0 r02 = (l0) this.b;
        ip r16 = (ip) this.c;
        ThreadPoolExecutor r23 = (ThreadPoolExecutor) this.d;
        wk r03 = a80.g((Context) r02.b);     // Catch: Throwable -> L45
        if (r03 == null) goto L51;
        vk r34 = (vk) ((di) r03.b);     // Catch: Throwable -> L45
        Object r42 = r34.d;     // Catch: Throwable -> L45
        monitor-enter(r42);     // Catch: Throwable -> L45
        r34.f = r23;     // Catch: Throwable -> L47
        monitor-exit(r42);     // Catch: Throwable -> L47
        ((di) r03.b).e(new gi(r16, r23));     // Catch: Throwable -> L45
        return;
    L47:
        th = move-exception;
        throw th;     // Catch: Throwable -> L45
    L51:
        throw new RuntimeException("EmojiCompat font provider not available on this device.");     // Catch: Throwable -> L45
    L45:
        th = move-exception;
        r16.F(th);
        r23.shutdown();
    }
}
