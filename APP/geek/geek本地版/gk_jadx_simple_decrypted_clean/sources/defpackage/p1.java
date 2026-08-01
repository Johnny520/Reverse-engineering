package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.a;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p1(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r7v0, types: [int] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // java.lang.Runnable
    public final void run() {
        ?? r4 = 1;
        r4 = 1;
        switch(this.a) {
            case 0: goto L115;
            case 1: goto L113;
            case 2: goto L111;
            case 3: goto L109;
            case 4: goto L105;
            case 5: goto L103;
            case 6: goto L101;
            case 7: goto L39;
            case 8: goto L37;
            case 9: goto L30;
            case 10: goto L21;
            case 11: goto L19;
            case 12: goto L10;
            case 13: goto L8;
            default: goto L4;
        };
    L4:
        mb0 r0 = (mb0) this.b;
        if (ip.i(r0.a.getTag(2114322440), Long.valueOf(r0.d)) == false) goto L175;
        r0.a.setTag(2114322440, null);
        return;
    L175:
        return;
    L8:
        ((TextInputLayout) this.b).d.requestLayout();
        return;
    L10:
        u7 r02 = (u7) this.b;
        r02.c = false;
        SideSheetBehavior r2 = (SideSheetBehavior) r02.e;
        ma0 r42 = r2.i;
        if (r42 == null) goto L16;
        if (r42.f() == false) goto L16;
        r02.a(r02.b);
        return;
    L16:
        if (r2.h != 2) goto L177;
        r2.r(r02.b);
        return;
    L177:
        return;
    L19:
        ((yy) this.b).e();
        return;
    L21:
        gy r03 = (gy) this.b;
        a r22 = r03.f;
        if (r03.b != 0) goto L25;
        r03.c = true;
        r22.d(iq.ON_PAUSE);
    L25:
        if (r03.a == 0) goto L27;
        return;
    L27:
        if (r03.c == false) goto L179;
        r22.d(iq.ON_STOP);
        r03.d = true;
        return;
    L179:
        return;
    L30:
        String r04 = (String) ((i00) this.b).b;
        gn.a.getClass();
        WeakReference r23 = gn.f;
        if (r23 == null) goto L180;
        Activity r24 = (Activity) r23.get();
        if (r24 == null) goto L181;
        Intent r3 = new Intent();     // Catch: Throwable -> L155
        r3.setClassName(r24.getPackageName(), pb0.b0);     // Catch: Throwable -> L155
        r3.putExtra("key_native_url", r04);     // Catch: Throwable -> L155
        r3.putExtra("key_way", 1);     // Catch: Throwable -> L155
        r3.addFlags(268435456);     // Catch: Throwable -> L155
        r24.startActivity(r3);     // Catch: Throwable -> L155
        return;
    L182:
        return;
    L181:
        return;
    L180:
        return;
    L37:
        ((e00) this.b).a = false;
        return;
    L39:
        vk r25 = (vk) this.b;
        Object r43 = r25.d;
        monitor-enter(r43);
    L45:
        th = move-exception;
        throw th;
    L42:
        if (r25.h != null) goto L47;
        monitor-exit(r43);     // Catch: Throwable -> L45
        return;
    L47:
        monitor-exit(r43);     // Catch: Throwable -> L45
        gl r44 = r25.b();     // Catch: Throwable -> L57
        int r6 = r44.e;     // Catch: Throwable -> L57
        if (r6 != 2) goto L59;
        Object r32 = r25.d;     // Catch: Throwable -> L57
        monitor-enter(r32);     // Catch: Throwable -> L57
        monitor-exit(r32);     // Catch: Throwable -> L54
    L54:
        th = move-exception;
        throw th;     // Catch: Throwable -> L57
    L59:
        if (r6 != 0) goto L86;
        int r33 = n70.a;     // Catch: Throwable -> L82
        m70.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");     // Catch: Throwable -> L82
        vh r05 = r25.c;     // Catch: Throwable -> L82
        Context r34 = r25.a;     // Catch: Throwable -> L82
        r05.getClass();     // Catch: Throwable -> L82
        Typeface r06 = b80.a.h(r34, new gl[]{r44}, 0);     // Catch: Throwable -> L82
        MappedByteBuffer r35 = gt.o(r25.a, r44.a);     // Catch: Throwable -> L82
        if (r35 == null) goto L81;
        if (r06 == null) goto L81;
        m70.a("EmojiCompat.MetadataRepo.create");     // Catch: Throwable -> L77
        a8 r45 = new a8(r06, gt.x(r35));     // Catch: Throwable -> L77
        m70.b();     // Catch: Throwable -> L82
        m70.b();     // Catch: Throwable -> L57
        Object r36 = r25.d;     // Catch: Throwable -> L57
        monitor-enter(r36);     // Catch: Throwable -> L57
        ip r07 = r25.h;     // Catch: Throwable -> L70
        if (r07 == null) goto L72;
        r07.I(r45);     // Catch: Throwable -> L70
    L72:
        monitor-exit(r36);     // Catch: Throwable -> L70
        r25.a();     // Catch: Throwable -> L57
        return;
    L70:
        th = move-exception;
        throw th;     // Catch: Throwable -> L57
    L77:
        th = move-exception;
        int r37 = n70.a;     // Catch: Throwable -> L82
        m70.b();     // Catch: Throwable -> L82
        throw th;     // Catch: Throwable -> L82
    L81:
        throw new RuntimeException("Unable to open file.");     // Catch: Throwable -> L82
    L82:
        th = move-exception;
        int r38 = n70.a;     // Catch: Throwable -> L57
        m70.b();     // Catch: Throwable -> L57
        throw th;     // Catch: Throwable -> L57
    L86:
        throw new RuntimeException("fetchFonts result is not OK. (" + r6 + ")");     // Catch: Throwable -> L57
    L57:
        th = move-exception;
        monitor-enter(r25.d);
        ip r46 = r25.h;     // Catch: Throwable -> L92
        if (r46 == null) goto L94;
        r46.F(th);     // Catch: Throwable -> L92
    L94:
        r25.a();
        return;
    L92:
        th = move-exception;
        throw th;
    L101:
        ph r08 = (ph) this.b;
        boolean r26 = r08.h.isPopupShowing();
        r08.s(r26);
        r08.m = r26;
        return;
    L103:
        g2.a((g2) this.b);
        return;
    L105:
        vb r09 = (vb) this.b;
        Runnable r39 = r09.b;
        if (r39 == null) goto L185;
        r39.run();
        r09.b = null;
        return;
    L185:
        return;
    L109:
        ((ComponentActivity) this.b).invalidateOptionsMenu();
        return;
    L111:
        ((ua) this.b).s(true);
        return;
    L113:
        ((CarouselLayoutManager) this.b).j0();
        return;
    L115:
        Activity r27 = (Activity) this.b;
        if (r27.isFinishing() == true) goto L186;
        Handler r62 = s1.g;
        Method r010 = s1.f;
        ?? r7 = Build.VERSION.SDK_INT;
        if (r7 < 28) goto L121;
        r27.recreate();
        return;
    L121:
        if (r7 == 26) goto L123;
        if (r7 == 27) goto L123;
    L126:
        if (s1.e == null) goto L128;
    L168:
        Object r11 = s1.c.get(r27);     // Catch: Throwable -> L156
        if (r11 == null) goto L153;
        Object r10 = s1.b.get(r27);     // Catch: Throwable -> L156
        if (r10 == null) goto L153;
        Application r12 = r27.getApplication();     // Catch: Throwable -> L156
        r1 r13 = new r1(r27);     // Catch: Throwable -> L156
        r12.registerActivityLifecycleCallbacks(r13);     // Catch: Throwable -> L156
        r62.post(new h1(r13, r11, 1, false));     // Catch: Throwable -> L156
        if (r7 == 26) goto L173;
        if (r7 == 27) goto L173;
        r4 = 0;
    L173:
        if (r4 != 0) goto L157;
        r4 = r12;
        r7 = r13;
        r27.recreate();     // Catch: Throwable -> L145
    L150:
        r62.post(new h1(r4, r7, 2, false));     // Catch: Throwable -> L156
        return;
    L157:
        Boolean r15 = Boolean.FALSE;     // Catch: Throwable -> L147
        r4 = r12;
        r7 = r13;
        r010.invoke(r10, new Object[]{r11, null, null, 0, r15, null, null, r15, r15});     // Catch: Throwable -> L145
    L147:
        th = th;
        ?? r47 = r12;
        ?? r72 = r13;
    L151:
        r62.post(new h1(r47, r72, 2, false));     // Catch: Throwable -> L156
        throw th;     // Catch: Throwable -> L156
    L145:
        th = th;
        r47 = r4;
        r72 = r7;
    L153:
        r27.recreate();
        return;
    L128:
        if (s1.d != null) goto L168;
    L123:
        if (r010 != null) goto L126;
    }
}
