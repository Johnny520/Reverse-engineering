package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.C0036a;
import com.github.megatronking.stringfog.Base64;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.ref.WeakReference;
import java.nio.MappedByteBuffer;

/* JADX INFO: renamed from: x8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0884x8 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5222a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5223b;

    public /* synthetic */ RunnableC0884x8(int i, Object obj) {
        this.f5222a = i;
        this.f5223b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity;
        switch (this.f5222a) {
            case Base64.DEFAULT /* 0 */:
                ((CarouselLayoutManager) this.f5223b).m2519j0();
                return;
            case Base64.NO_PADDING /* 1 */:
                ((C0098cb) this.f5223b).m608s(true);
                return;
            case Base64.NO_WRAP /* 2 */:
                ((ComponentActivity) this.f5223b).invalidateOptionsMenu();
                return;
            case 3:
                ExecutorC0182ec executorC0182ec = (ExecutorC0182ec) this.f5223b;
                Runnable runnable = executorC0182ec.f1570b;
                if (runnable != null) {
                    runnable.run();
                    executorC0182ec.f1570b = null;
                    return;
                }
                return;
            case 4:
                DialogC0246g2.m1122a((DialogC0246g2) this.f5223b);
                return;
            case 5:
                C0670rh c0670rh = (C0670rh) this.f5223b;
                boolean zIsPopupShowing = c0670rh.f4133h.isPopupShowing();
                c0670rh.m2291s(zIsPopupShowing);
                c0670rh.f4138m = zIsPopupShowing;
                return;
            case 6:
                C0896xk c0896xk = (C0896xk) this.f5223b;
                synchronized (c0896xk.f5266d) {
                    try {
                        if (c0896xk.f5270h == null) {
                            return;
                        }
                        try {
                            C0338il c0338ilM2700c = c0896xk.m2700c();
                            int i = c0338ilM2700c.f2552e;
                            if (i == 2) {
                                synchronized (c0896xk.f5266d) {
                                }
                            }
                            if (i != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i + ")");
                            }
                            try {
                                int i2 = t70.f4419a;
                                s70.m2309a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                C0893xh c0893xh = c0896xk.f5265c;
                                Context context = c0896xk.f5263a;
                                c0893xh.getClass();
                                Typeface typefaceMo1487h = h80.f2140a.mo1487h(context, new C0338il[]{c0338ilM2700c}, 0);
                                MappedByteBuffer mappedByteBufferM1901v = AbstractC0498mu.m1901v(c0896xk.f5263a, c0338ilM2700c.f2548a);
                                if (mappedByteBufferM1901v == null || typefaceMo1487h == null) {
                                    throw new RuntimeException("Unable to open file.");
                                }
                                try {
                                    s70.m2309a("EmojiCompat.MetadataRepo.create");
                                    C0402k8 c0402k8 = new C0402k8(typefaceMo1487h, AbstractC0387ju.m1630u(mappedByteBufferM1901v));
                                    s70.m2310b();
                                    s70.m2310b();
                                    synchronized (c0896xk.f5266d) {
                                        try {
                                            AbstractC0259gf abstractC0259gf = c0896xk.f5270h;
                                            if (abstractC0259gf != null) {
                                                abstractC0259gf.mo52M(c0402k8);
                                            }
                                        } finally {
                                        }
                                        break;
                                    }
                                    c0896xk.m2699a();
                                    return;
                                } finally {
                                    int i3 = t70.f4419a;
                                    s70.m2310b();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        } catch (Throwable th2) {
                            synchronized (c0896xk.f5266d) {
                                try {
                                    AbstractC0259gf abstractC0259gf2 = c0896xk.f5270h;
                                    if (abstractC0259gf2 != null) {
                                        abstractC0259gf2.mo51J(th2);
                                    }
                                    c0896xk.m2699a();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case 7:
                String str = (String) this.f5223b;
                WeakReference weakReference = C0417kn.f2852f;
                InterfaceC0814vd interfaceC0814vd = null;
                Activity activity2 = weakReference != null ? (Activity) weakReference.get() : null;
                if (activity2 == null || activity2.isFinishing() || activity2.isDestroyed()) {
                    return;
                }
                View decorView = activity2.getWindow().getDecorView();
                ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
                if (viewGroup == null) {
                    return;
                }
                w40 w40Var = C0417kn.f2857k;
                if (w40Var != null) {
                    w40Var.m454m(new C0678rp(w40Var.mo456o(), null, w40Var));
                }
                p00 p00Var = new p00();
                View viewFindViewWithTag = viewGroup.findViewWithTag(b50.m492a("PS180h/kKrIxMUbNL+kspQ==\n", "WkgZuUCIX9E=\n"));
                p00Var.f3560b = viewFindViewWithTag;
                if (viewFindViewWithTag == null) {
                    LinearLayout linearLayout = new LinearLayout(activity2);
                    linearLayout.setTag(b50.m492a("RzW6LDdIsChLKYAzB0W2Pw==\n", "IFDfR2gkxUs=\n"));
                    linearLayout.setOrientation(0);
                    linearLayout.setGravity(16);
                    linearLayout.setPadding(AbstractC0493mp.m1867q(18), AbstractC0493mp.m1867q(12), AbstractC0493mp.m1867q(22), AbstractC0493mp.m1867q(12));
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setColor(Color.parseColor(b50.m492a("Q+m42Cf4OC5R\n", "YKyO6RbJCR8=\n")));
                    gradientDrawable.setCornerRadius(AbstractC0493mp.m1866p(100.0f));
                    gradientDrawable.setStroke(AbstractC0493mp.m1867q(1), Color.parseColor(b50.m492a("MDxbr4kcEQgj\n", "Ew9o6c8vUzs=\n")));
                    linearLayout.setBackground(gradientDrawable);
                    int i4 = Build.VERSION.SDK_INT;
                    linearLayout.setElevation(AbstractC0493mp.m1866p(30.0f));
                    if (i4 >= 28) {
                        linearLayout.setOutlineAmbientShadowColor(Color.parseColor(b50.m492a("2fy6+PES4A==\n", "+syKyMEi0Ns=\n")));
                        linearLayout.setOutlineSpotShadowColor(Color.parseColor(b50.m492a("OVKhMePdo5Qq\n", "GmSXd6Xu4ac=\n")));
                    }
                    p00Var.f3560b = linearLayout;
                    TextView textView = new TextView(activity2);
                    textView.setText(b50.m492a("dD93\n", "m77Xl2bAQhw=\n"));
                    Typeface typeface = C0075bo.f745a;
                    if (typeface != null) {
                        textView.setTypeface(typeface);
                    }
                    textView.setTextSize(16.0f);
                    textView.setTextColor(Color.parseColor(b50.m492a("H1K6r3eFxg==\n", "PBT8nDW29tw=\n")));
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.rightMargin = AbstractC0493mp.m1867q(10);
                    textView.setLayoutParams(layoutParams);
                    linearLayout.addView(textView);
                    LinearLayout linearLayout2 = (LinearLayout) p00Var.f3560b;
                    TextView textView2 = new TextView(activity2);
                    textView2.setTag(b50.m492a("ZAqTwMcFT5ZpDIT0yj9DjVcJmc7J\n", "CH/wq75aO/k=\n"));
                    textView2.setTextSize(13.5f);
                    textView2.setTextColor(Color.parseColor(b50.m492a("mdvU6s130g==\n", "up2SrIsxlAc=\n")));
                    textView2.setTypeface(Typeface.create(b50.m492a("t6Wp3BfITD2tourCX99AOqk=\n", "xMTHrzq7KU8=\n"), 0), 1);
                    textView2.setLetterSpacing(0.02f);
                    linearLayout2.addView(textView2);
                    View view = (View) p00Var.f3560b;
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 49;
                    layoutParams2.topMargin = AbstractC0493mp.m1867q(55);
                    viewGroup.addView(view, layoutParams2);
                }
                TextView textView3 = (TextView) ((LinearLayout) p00Var.f3560b).findViewWithTag(b50.m492a("cIcScW9oPq19gQVFYlIytkOEGH9h\n", "HPJxGhY3SsI=\n"));
                if (textView3 != null) {
                    textView3.setText(str);
                }
                C0417kn.f2847a.getClass();
                C0417kn.m1698i(viewGroup, 1);
                ((LinearLayout) p00Var.f3560b).animate().cancel();
                Object tag = ((LinearLayout) p00Var.f3560b).getTag(2115043332);
                o40 o40Var = tag instanceof o40 ? (o40) tag : null;
                if (o40Var != null) {
                    o40Var.m1986c();
                }
                Object tag2 = ((LinearLayout) p00Var.f3560b).getTag(2115043333);
                o40 o40Var2 = tag2 instanceof o40 ? (o40) tag2 : null;
                if (o40Var2 != null) {
                    o40Var2.m1986c();
                }
                Object tag3 = ((LinearLayout) p00Var.f3560b).getTag(2115043334);
                o40 o40Var3 = tag3 instanceof o40 ? (o40) tag3 : null;
                if (o40Var3 != null) {
                    o40Var3.m1986c();
                }
                ((LinearLayout) p00Var.f3560b).setTranslationY(-AbstractC0493mp.m1866p(60.0f));
                ((LinearLayout) p00Var.f3560b).setAlpha(0.0f);
                ((LinearLayout) p00Var.f3560b).setScaleX(0.85f);
                ((LinearLayout) p00Var.f3560b).setScaleY(0.85f);
                ((LinearLayout) p00Var.f3560b).animate().alpha(1.0f).setDuration(200L).start();
                o40 o40Var4 = new o40(p00Var.f3560b, o40.f3383n);
                o40Var4.f3400k = g40.m1143f(0.0f, 200.0f, 0.6f);
                ((LinearLayout) p00Var.f3560b).setTag(2115043332, o40Var4);
                o40Var4.m1991h();
                o40 o40Var5 = new o40(p00Var.f3560b, o40.f3384o);
                o40Var5.f3400k = g40.m1143f(1.0f, 200.0f, 0.6f);
                ((LinearLayout) p00Var.f3560b).setTag(2115043333, o40Var5);
                o40Var5.m1991h();
                o40 o40Var6 = new o40(p00Var.f3560b, o40.f3385p);
                o40Var6.f3400k = g40.m1143f(1.0f, 200.0f, 0.6f);
                ((LinearLayout) p00Var.f3560b).setTag(2115043334, o40Var6);
                o40Var6.m1991h();
                C0417kn.f2857k = g80.m1206u(C0417kn.f2855i, null, new C0380jn(activity2, p00Var, viewGroup, interfaceC0814vd, 0), 3);
                return;
            case 8:
                ((l00) this.f5223b).f2887a = false;
                return;
            case 9:
                String str2 = (String) ((p00) this.f5223b).f3560b;
                C0417kn.f2847a.getClass();
                WeakReference weakReference2 = C0417kn.f2852f;
                if (weakReference2 == null || (activity = (Activity) weakReference2.get()) == null) {
                    return;
                }
                try {
                    Intent intent = new Intent();
                    intent.setClassName(activity.getPackageName(), ub0.f4736b0);
                    intent.putExtra(b50.m492a("l6j9w85LDIOKqNvp0kY=\n", "/M2EnKAqeOo=\n"), str2);
                    intent.putExtra(b50.m492a("sBmxcfXuog==\n", "23zILoKP2zY=\n"), 1);
                    intent.addFlags(268435456);
                    activity.startActivity(intent);
                    return;
                } catch (Throwable unused) {
                    g40.m1152o("06ke\n", "p8h5VTpLcuY=\n", b50.m492a("2ScHfiWZtVnwKztGNbmvW/QmAVYwvblc\n", "lVJkFVzU2jc=\n"), "tw==\n", "0vI8ySRxU5w=\n");
                    return;
                }
            case 10:
                C0576oy c0576oy = (C0576oy) this.f5223b;
                C0036a c0036a = c0576oy.f3554f;
                if (c0576oy.f3550b == 0) {
                    c0576oy.f3551c = true;
                    c0036a.m262d(EnumC0494mq.ON_PAUSE);
                }
                if (c0576oy.f3549a == 0 && c0576oy.f3551c) {
                    c0036a.m262d(EnumC0494mq.ON_STOP);
                    c0576oy.f3552d = true;
                    return;
                }
                return;
            case 11:
                ((AbstractC0242fz) this.f5223b).mo756e();
                return;
            case 12:
                C0178e8 c0178e8 = (C0178e8) this.f5223b;
                c0178e8.f1528c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) c0178e8.f1530e;
                ra0 ra0Var = sideSheetBehavior.f1078i;
                if (ra0Var != null && ra0Var.m2271f()) {
                    c0178e8.m970a(c0178e8.f1527b);
                    return;
                } else {
                    if (sideSheetBehavior.f1077h == 2) {
                        sideSheetBehavior.m720r(c0178e8.f1527b);
                        return;
                    }
                    return;
                }
            case 13:
                ((TextInputLayout) this.f5223b).f1129d.requestLayout();
                return;
            default:
                rb0 rb0Var = (rb0) this.f5223b;
                if (AbstractC0493mp.m1853c(rb0Var.f4112a.getTag(2114322440), Long.valueOf(rb0Var.f4115d))) {
                    rb0Var.f4112a.setTag(2114322440, null);
                    return;
                }
                return;
        }
    }
}
