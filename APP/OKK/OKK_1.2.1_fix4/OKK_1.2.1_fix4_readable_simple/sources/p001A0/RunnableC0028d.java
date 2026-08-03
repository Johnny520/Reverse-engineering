package p001A0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.Trace;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.emoji2.text.C0492q;
import androidx.fragment.app.C0501a;
import androidx.lifecycle.C0512A;
import androidx.lifecycle.C0543t;
import androidx.lifecycle.EnumC0535l;
import com.abc.core.features.C0599J1;
import com.abc.core.features.HomeAvatarHook;
import com.abc.core.features.RunnableC0705w0;
import com.abc.core.features.WallpaperOverlayHook;
import com.abc.core.runtime.AbstractC0805P;
import com.abc.core.runtime.DialogC0823e;
import com.abc.core.runtime.HookDiagnostics;
import com.abc.ui.FloatingBottomTabView;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.timepicker.AbstractC0727e;
import java.nio.MappedByteBuffer;
import p000A.C0011l;
import p007D0.AbstractC0141g;
import p007D0.C0146l;
import p021L.C0245e;
import p031Q0.AbstractC0307g;
import p037U.AbstractC0358S;
import p042W0.AbstractC0425j;
import p043Y.C0463v;
import p085v.AbstractC1106g;
import p089x0.C1121e;
import p091z.AbstractC1142a;

/* JADX INFO: renamed from: A0.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0028d implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f70a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f71b;

    public /* synthetic */ RunnableC0028d() {
        this.f70a = 7;
        this.f71b = C0599J1.f1831a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean r2 = false;
        switch(this.f70a) {
            case 0: goto L124;
            case 1: goto L122;
            case 2: goto L120;
            case 3: goto L58;
            case 4: goto L49;
            case 5: goto L45;
            case 6: goto L30;
            case 7: goto L28;
            case 8: goto L26;
            case 9: goto L17;
            case 10: goto L15;
            case 11: goto L13;
            default: goto L4;
        };
    L4:
        C0501a r1 = (C0501a) this.f71b;
        r1.f1414c = false;
        SideSheetBehavior r22 = (SideSheetBehavior) r1.f1416e;
        C0245e r3 = r22.f2417i;
        if (r3 == null) goto L10;
        if (r3.m674f() == false) goto L10;
        r1.m1226c(r1.f1413b);
        return;
    L10:
        if (r22.f2416h != 2) goto L140;
        r22.m1882r(r1.f1413b);
        return;
    L140:
        return;
    L13:
        ((CarouselLayoutManager) this.f71b).m787S();
        return;
    L15:
        ScrollView r12 = (ScrollView) this.f71b;
        AbstractC0307g.m703e(r12, "$scroll");
        r12.scrollTo(0, 0);
        return;
    L17:
        DialogC0823e r02 = (DialogC0823e) this.f71b;
        AbstractC0307g.m703e(r02, "$progress");
        HookDiagnostics r13 = HookDiagnostics.f3000a;
        r02.show();     // Catch: Throwable -> L20
        HookDiagnostics.m2157g("progress shown async");     // Catch: Throwable -> L20
        Object r03 = C0146l.f339a;     // Catch: Throwable -> L20
    L22:
        Throwable r04 = AbstractC0141g.m465a(r03);
        if (r04 == null) goto L141;
        HookDiagnostics.m2157g("progress show fail: " + r04.getMessage());
        return;
    L141:
        return;
    L20:
        th = move-exception;
        r03 = AbstractC0040p.m116u(th);
        goto L22
    L26:
        ((AbstractC0727e) this.f71b).mo1912f();
        return;
    L28:
        AbstractC0307g.m703e((C0599J1) this.f71b, "$this_runCatching");
        Object r05 = WallpaperOverlayHook.f1792a;
        C0599J1.m1485c(WallpaperOverlayHook.m1452j());
        return;
    L30:
        ClassLoader r06 = (ClassLoader) this.f71b;
        AbstractC0307g.m703e(r06, "$classLoader");
        HomeAvatarHook r32 = HomeAvatarHook.f1723a;
        String r33 = HomeAvatarHook.m1409p(r06);
        if (AbstractC0425j.m1013R0(r33) == false) goto L33;
        HomeAvatarHook.m1412s("prefetch: username empty");
        return;
    L33:
        HomeAvatarHook.f1736n = r33;
        Bitmap r07 = HomeAvatarHook.m1403j(r06, r33);
        if (r07 != null) goto L36;
    L39:
        if (r07 == null) goto L41;
        r2 = true;
    L41:
        HomeAvatarHook.m1412s("prefetch: user=" + r33 + " bmp=" + r2);
        ImageView r08 = HomeAvatarHook.f1730h;
        if (r08 == null) goto L143;
        HomeAvatarHook.f1725c.post(new RunnableC0705w0(r08, 1));
        return;
    L143:
        return;
    L36:
        if (r07.isRecycled() == true) goto L39;
        HomeAvatarHook.f1740r = r07;
        HomeAvatarHook.f1741s = true;
        goto L39
    L45:
        FloatingBottomTabView r09 = (FloatingBottomTabView) this.f71b;
        AbstractC0307g.m703e(r09, "$bar");
        if (r09.isAttachedToWindow() == false) goto L144;
        r09.m1943f();
        return;
    L144:
        return;
    L49:
        C0512A r010 = (C0512A) this.f71b;
        AbstractC0307g.m703e(r010, "this$0");
        int r23 = r010.f1449b;
        C0543t r34 = r010.f1453f;
        if (r23 != 0) goto L53;
        r010.f1450c = true;
        r34.m1257d(EnumC0535l.ON_PAUSE);
    L53:
        if (r010.f1448a == 0) goto L55;
        return;
    L55:
        if (r010.f1450c == false) goto L146;
        r34.m1257d(EnumC0535l.ON_STOP);
        r010.f1451d = true;
        return;
    L146:
        return;
    L58:
        C0492q r14 = (C0492q) this.f71b;
        Object r4 = r14.f1382d;
        monitor-enter(r4);
    L64:
        th = move-exception;
        throw th;
    L61:
        if (r14.f1386h != null) goto L66;
        monitor-exit(r4);     // Catch: Throwable -> L64
        return;
    L66:
        monitor-exit(r4);     // Catch: Throwable -> L64
        C0011l r42 = r14.m1211c();     // Catch: Throwable -> L76
        int r5 = r42.f34e;     // Catch: Throwable -> L76
        if (r5 != 2) goto L78;
        Object r011 = r14.f1382d;     // Catch: Throwable -> L76
        monitor-enter(r011);     // Catch: Throwable -> L76
        monitor-exit(r011);     // Catch: Throwable -> L73
    L73:
        th = move-exception;
        throw th;     // Catch: Throwable -> L76
    L78:
        if (r5 != 0) goto L105;
        int r35 = AbstractC1142a.f4403a;     // Catch: Throwable -> L101
        Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");     // Catch: Throwable -> L101
        C1121e r012 = r14.f1381c;     // Catch: Throwable -> L101
        Context r36 = r14.f1379a;     // Catch: Throwable -> L101
        r012.getClass();     // Catch: Throwable -> L101
        Typeface r013 = AbstractC1106g.f4256a.mo2071k(r36, new C0011l[]{r42}, 0);     // Catch: Throwable -> L101
        MappedByteBuffer r24 = AbstractC0805P.m2035K(r14.f1379a, r42.f30a);     // Catch: Throwable -> L101
        if (r24 == null) goto L100;
        if (r013 == null) goto L100;
        Trace.beginSection("EmojiCompat.MetadataRepo.create");     // Catch: Throwable -> L96
        C0463v r37 = new C0463v(r013, AbstractC0358S.m878b0(r24));     // Catch: Throwable -> L96
        Trace.endSection();     // Catch: Throwable -> L101
        Trace.endSection();     // Catch: Throwable -> L76
        Object r014 = r14.f1382d;     // Catch: Throwable -> L76
        monitor-enter(r014);     // Catch: Throwable -> L76
        AbstractC0358S r25 = r14.f1386h;     // Catch: Throwable -> L89
        if (r25 == null) goto L91;
        r25.mo922V(r37);     // Catch: Throwable -> L89
    L91:
        monitor-exit(r014);     // Catch: Throwable -> L89
        r14.m1209a();     // Catch: Throwable -> L76
        return;
    L89:
        th = move-exception;
        throw th;     // Catch: Throwable -> L76
    L96:
        th = move-exception;
        int r26 = AbstractC1142a.f4403a;     // Catch: Throwable -> L101
        Trace.endSection();     // Catch: Throwable -> L101
        throw th;     // Catch: Throwable -> L101
    L100:
        throw new RuntimeException("Unable to open file.");     // Catch: Throwable -> L101
    L101:
        th = move-exception;
        int r27 = AbstractC1142a.f4403a;     // Catch: Throwable -> L76
        Trace.endSection();     // Catch: Throwable -> L76
        throw th;     // Catch: Throwable -> L76
    L105:
        throw new RuntimeException("fetchFonts result is not OK. (" + r5 + ")");     // Catch: Throwable -> L76
    L76:
        th = move-exception;
        monitor-enter(r14.f1382d);
        AbstractC0358S r38 = r14.f1386h;     // Catch: Throwable -> L111
        if (r38 == null) goto L113;
        r38.mo921U(th);     // Catch: Throwable -> L111
    L113:
        r14.m1209a();
        return;
    L111:
        th = move-exception;
        throw th;
    L120:
        ((TextInputLayout) this.f71b).f2469d.requestLayout();
        return;
    L122:
        C0039o r015 = (C0039o) this.f71b;
        boolean r15 = r015.f97h.isPopupShowing();
        r015.m77t(r15);
        r015.f102m = r15;
        return;
    L124:
        ((C0030f) this.f71b).m67t(true);
    }

    public /* synthetic */ RunnableC0028d(int r1, Object r2) {
        this.f70a = r1;
        this.f71b = r2;
    }
}
