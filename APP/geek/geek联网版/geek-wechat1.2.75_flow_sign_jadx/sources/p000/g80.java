package p000;

import android.app.Activity;
import android.app.Dialog;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.ljx.wechatmod.R;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes.dex */
public abstract class g80 {

    /* JADX INFO: renamed from: d */
    public static final C0431l0 f1910d;

    /* JADX INFO: renamed from: e */
    public static final C0431l0 f1911e;

    /* JADX INFO: renamed from: g */
    public static final C0431l0 f1913g;

    /* JADX INFO: renamed from: r */
    public static RippleDrawable f1924r;

    /* JADX INFO: renamed from: s */
    public static int f1925s;

    /* JADX INFO: renamed from: t */
    public static int f1926t;

    /* JADX INFO: renamed from: u */
    public static int f1927u;

    /* JADX INFO: renamed from: a */
    public static final double[][] f1907a = {new double[]{0.401288d, 0.650173d, -0.051461d}, new double[]{-0.250268d, 1.204414d, 0.045854d}, new double[]{-0.002079d, 0.048952d, 0.953127d}};

    /* JADX INFO: renamed from: b */
    public static final double[][] f1908b = {new double[]{0.41233895d, 0.35762064d, 0.18051042d}, new double[]{0.2126d, 0.7152d, 0.0722d}, new double[]{0.01932141d, 0.11916382d, 0.95034478d}};

    /* JADX INFO: renamed from: c */
    public static final double[] f1909c = {95.047d, 100.0d, 108.883d};

    /* JADX INFO: renamed from: f */
    public static final C0821vk f1912f = new C0821vk();

    /* JADX INFO: renamed from: h */
    public static final boolean[] f1914h = new boolean[3];

    /* JADX INFO: renamed from: i */
    public static final byte[] f1915i = {48, 49, 53, 0};

    /* JADX INFO: renamed from: j */
    public static final byte[] f1916j = {48, 49, 48, 0};

    /* JADX INFO: renamed from: k */
    public static final byte[] f1917k = {48, 48, 57, 0};

    /* JADX INFO: renamed from: l */
    public static final byte[] f1918l = {48, 48, 53, 0};

    /* JADX INFO: renamed from: m */
    public static final byte[] f1919m = {48, 48, 49, 0};

    /* JADX INFO: renamed from: n */
    public static final byte[] f1920n = {48, 48, 49, 0};

    /* JADX INFO: renamed from: o */
    public static final byte[] f1921o = {48, 48, 50, 0};

    /* JADX INFO: renamed from: p */
    public static final int[] f1922p = {R.attr.colorPrimary};

    /* JADX INFO: renamed from: q */
    public static final int[] f1923q = {R.attr.colorPrimaryVariant};

    static {
        int i = 27;
        f1910d = new C0431l0(i, "UNDEFINED");
        f1911e = new C0431l0(i, "REUSABLE_CLAIMED");
        f1913g = new C0431l0(i, "CONDITION_FALSE");
    }

    /* JADX INFO: renamed from: A */
    public static TypedArray m1170A(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m1188c(context, attributeSet, i, i2);
        m1190e(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    /* JADX INFO: renamed from: B */
    public static void m1171B(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    /* JADX INFO: renamed from: C */
    public static InterfaceC0295he m1172C(InterfaceC0221fe interfaceC0221fe, InterfaceC0295he interfaceC0295he) {
        AbstractC0493mp.m1857g("context", interfaceC0295he);
        return AbstractC0493mp.m1827A(interfaceC0221fe, interfaceC0295he);
    }

    /* JADX INFO: renamed from: D */
    public static byte[] m1173D(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                throw new IllegalStateException("Not enough bytes to read: " + i);
            }
            i2 += i3;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: E */
    public static byte[] m1174E(FileInputStream fileInputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int i4 = fileInputStream.read(bArr2);
                if (i4 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, i4);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i2 - iInflate);
                    i3 += i4;
                } catch (DataFormatException e) {
                    throw new IllegalStateException(e.getMessage());
                }
            }
            if (i3 == i) {
                if (inflater.finished()) {
                    return bArr;
                }
                throw new IllegalStateException("Inflater did not finish");
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } finally {
            inflater.end();
        }
    }

    /* JADX INFO: renamed from: F */
    public static long m1175F(InputStream inputStream, int i) {
        byte[] bArrM1173D = m1173D(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += ((long) (bArrM1173D[i2] & 255)) << (i2 * 8);
        }
        return j;
    }

    /* JADX INFO: renamed from: G */
    public static final Object m1176G(Object obj) {
        return obj instanceof C0850wb ? AbstractC0274gu.m1311e(((C0850wb) obj).f5079a) : obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0099 A[Catch: all -> 0x0079, DONT_GENERATE, TryCatch #2 {all -> 0x0079, blocks: (B:19:0x0055, B:21:0x0062, B:23:0x0068, B:36:0x009c, B:26:0x007b, B:28:0x0088, B:33:0x0093, B:35:0x0099, B:41:0x00a9, B:44:0x00b2, B:43:0x00af, B:31:0x008e), top: B:57:0x0055, inners: #0 }] */
    /* JADX INFO: renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1177H(p000.InterfaceC0814vd r10, java.lang.Object r11) {
        /*
            boolean r0 = r10 instanceof p000.C0817vg
            if (r0 == 0) goto Lbd
            vg r10 = (p000.C0817vg) r10
            le r0 = r10.f4955d
            t50 r1 = r10.f4956e
            java.lang.Throwable r2 = p000.m10.m1794a(r11)
            if (r2 != 0) goto L12
            r3 = r11
            goto L18
        L12:
            wb r3 = new wb
            r4 = 0
            r3.<init>(r2, r4)
        L18:
            r1.mo1117d()
            he r2 = r1.f4415b
            boolean r4 = r0.mo1760e()
            r5 = 1
            if (r4 == 0) goto L2f
            r10.f4957f = r3
            r10.f5245c = r5
            p000.AbstractC0493mp.m1854d(r2)
            r0.mo584d(r2, r10)
            return
        L2f:
            mj r0 = p000.z60.m2797a()
            long r6 = r0.f3149c
            r8 = 4294967296(0x100000000, double:2.121995791E-314)
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 < 0) goto L51
            r10.f4957f = r3
            r10.f5245c = r5
            k6 r11 = r0.f3151e
            if (r11 != 0) goto L4d
            k6 r11 = new k6
            r11.<init>()
            r0.f3151e = r11
        L4d:
            r11.addLast(r10)
            goto Lb7
        L51:
            r0.m1825k(r5)
            r4 = 0
            p000.AbstractC0493mp.m1854d(r2)     // Catch: java.lang.Throwable -> L79
            xh r5 = p000.C0893xh.f5252h     // Catch: java.lang.Throwable -> L79
            fe r5 = r2.mo447b(r5)     // Catch: java.lang.Throwable -> L79
            qp r5 = (p000.InterfaceC0641qp) r5     // Catch: java.lang.Throwable -> L79
            if (r5 == 0) goto L7b
            boolean r6 = r5.mo446a()     // Catch: java.lang.Throwable -> L79
            if (r6 != 0) goto L7b
            aq r5 = (p000.C0040aq) r5     // Catch: java.lang.Throwable -> L79
            java.util.concurrent.CancellationException r11 = r5.m461t()     // Catch: java.lang.Throwable -> L79
            r10.mo2313a(r3, r11)     // Catch: java.lang.Throwable -> L79
            l10 r11 = p000.AbstractC0274gu.m1311e(r11)     // Catch: java.lang.Throwable -> L79
            r10.mo1118f(r11)     // Catch: java.lang.Throwable -> L79
            goto L9c
        L79:
            r11 = move-exception
            goto Lb3
        L7b:
            java.lang.Object r3 = r10.f4958g     // Catch: java.lang.Throwable -> L79
            p000.AbstractC0493mp.m1854d(r2)     // Catch: java.lang.Throwable -> L79
            java.lang.Object r3 = p000.AbstractC0259gf.m1242a0(r2, r3)     // Catch: java.lang.Throwable -> L79
            l0 r5 = p000.AbstractC0259gf.f1979x     // Catch: java.lang.Throwable -> L79
            if (r3 == r5) goto L8d
            t80 r5 = p000.AbstractC0259gf.m1243b0(r1, r2, r3)     // Catch: java.lang.Throwable -> L79
            goto L8e
        L8d:
            r5 = r4
        L8e:
            r1.mo1118f(r11)     // Catch: java.lang.Throwable -> La6
            if (r5 == 0) goto L99
            boolean r11 = r5.m2403K()     // Catch: java.lang.Throwable -> L79
            if (r11 == 0) goto L9c
        L99:
            p000.AbstractC0259gf.m1234R(r2, r3)     // Catch: java.lang.Throwable -> L79
        L9c:
            boolean r11 = r0.m1826l()     // Catch: java.lang.Throwable -> L79
            if (r11 != 0) goto L9c
        La2:
            r0.m1824f()
            goto Lb7
        La6:
            r11 = move-exception
            if (r5 == 0) goto Laf
            boolean r1 = r5.m2403K()     // Catch: java.lang.Throwable -> L79
            if (r1 == 0) goto Lb2
        Laf:
            p000.AbstractC0259gf.m1234R(r2, r3)     // Catch: java.lang.Throwable -> L79
        Lb2:
            throw r11     // Catch: java.lang.Throwable -> L79
        Lb3:
            r10.m2681h(r11, r4)     // Catch: java.lang.Throwable -> Lb8
            goto La2
        Lb7:
            return
        Lb8:
            r10 = move-exception
            r0.m1824f()
            throw r10
        Lbd:
            r10.mo1118f(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.g80.m1177H(vd, java.lang.Object):void");
    }

    /* JADX INFO: renamed from: I */
    public static void m1178I(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    /* JADX INFO: renamed from: J */
    public static void m1179J(Activity activity, Dialog dialog, C0713sn c0713sn) {
        AbstractC0493mp.m1857g(b50.m492a("Fj3q\n", "d16etnh9j+M=\n"), activity);
        AbstractC0493mp.m1857g(b50.m492a("myjsTgs=\n", "70CJI259kMQ=\n"), c0713sn);
        Dialog dialog2 = new Dialog(activity, android.R.style.Theme.Translucent.NoTitleBar);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setBackgroundColor(0);
        frameLayout.setOnClickListener(new ViewOnClickListenerC0177e7(dialog2, 5));
        int i = (int) (((double) activity.getResources().getDisplayMetrics().heightPixels) * 0.9d);
        int i2 = 1;
        LinearLayout linearLayoutM1144g = g40.m1144g(activity, 1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, i);
        layoutParams.gravity = 80;
        linearLayoutM1144g.setLayoutParams(layoutParams);
        linearLayoutM1144g.setClickable(true);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(c0713sn.f4341b);
        gradientDrawable.setCornerRadii(new float[]{AbstractC0493mp.m1866p(32.0f), AbstractC0493mp.m1866p(32.0f), AbstractC0493mp.m1866p(32.0f), AbstractC0493mp.m1866p(32.0f), 0.0f, 0.0f, 0.0f, 0.0f});
        linearLayoutM1144g.setBackground(gradientDrawable);
        View view = new View(activity);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(AbstractC0493mp.m1867q(40), AbstractC0493mp.m1867q(5));
        layoutParams2.gravity = 1;
        layoutParams2.topMargin = AbstractC0493mp.m1867q(16);
        layoutParams2.bottomMargin = AbstractC0493mp.m1867q(16);
        view.setLayoutParams(layoutParams2);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(c0713sn.f4345f);
        gradientDrawable2.setAlpha(80);
        gradientDrawable2.setCornerRadius(AbstractC0493mp.m1866p(10.0f));
        view.setBackground(gradientDrawable2);
        linearLayoutM1144g.addView(view);
        TextView textView = new TextView(activity);
        textView.setText(b50.m492a("CWm+yrDLWJp6DbKj7dU+xVVN94Kh\n", "7+sSLAVlvSA=\n"));
        textView.setTextSize(24.0f);
        textView.setTypeface(Typeface.create(b50.m492a("hgrX733sdzCcDZT+PP5xKQ==\n", "9Wu5nFCfEkI=\n"), 0), 0);
        textView.setTextColor(c0713sn.f4344e);
        textView.setPadding(AbstractC0493mp.m1867q(24), AbstractC0493mp.m1867q(8), AbstractC0493mp.m1867q(24), AbstractC0493mp.m1867q(16));
        linearLayoutM1144g.addView(textView);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, 0, 0, AbstractC0493mp.m1867q(80));
        Typeface typeface = C0075bo.f745a;
        C0075bo.m524a(activity, linearLayout, b50.m492a("93Uj+0z5+L6eKw2/NP2d\n", "EM6wHdJ9HAY=\n"), c0713sn, new C0488mk(activity, c0713sn, dialog2, dialog, 2));
        C0075bo.m524a(activity, linearLayout, b50.m492a("lspgnKP+TyHDpHHS7vkgTsX/\n", "cUHMewh1p6g=\n"), c0713sn, new C0488mk(activity, c0713sn, dialog2, dialog, 3));
        C0075bo.m524a(activity, linearLayout, b50.m492a("7o4By5xEce24zTiN\n", "BimHIzvNll8=\n"), c0713sn, new C0488mk(activity, c0713sn, dialog2, dialog, 4));
        ScrollView scrollView = new ScrollView(activity);
        scrollView.setVerticalScrollBarEnabled(false);
        scrollView.addView(linearLayout);
        linearLayoutM1144g.addView(scrollView);
        frameLayout.addView(linearLayoutM1144g);
        dialog2.setContentView(frameLayout);
        Window window = dialog2.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.addFlags(512);
            if (Build.VERSION.SDK_INT >= 31) {
                window.addFlags(4);
                window.getAttributes().setBlurBehindRadius(50);
            }
        }
        dialog2.setOnShowListener(new DialogInterfaceOnShowListenerC0562ok(linearLayoutM1144g, i, i2));
        dialog2.show();
    }

    /* JADX INFO: renamed from: K */
    public static final void m1180K(C0713sn c0713sn, p00 p00Var, View view, TextView textView, TextView textView2, String str, ArrayList arrayList) {
        int color;
        int color2;
        String str2;
        String str3;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            LinearLayout linearLayout = (LinearLayout) obj;
            Object tag = linearLayout.getTag();
            AbstractC0493mp.m1855e(b50.m492a("4qnJFj+Ii8Pis9FafY7Kzu2v0VprhMrD47KIFGqHho34pdUfP4CF2eC1y1RMn5jE4rs=\n", "jNyleh/r6q0=\n"), tag);
            String strM492a = (String) tag;
            boolean zEquals = strM492a.equals(p00Var.f3560b);
            View childAt = linearLayout.getChildAt(0);
            AbstractC0493mp.m1855e(b50.m492a("vwGG82qlTBa/G56/KKMNG7AHnr8+qQ0WvhrH8T+qQVilDZr6aqdDHKMbg/tksUQcthGesQy0TBW0\nOIvmJbNZ\n", "0XTqn0rGLXg=\n"), childAt);
            FrameLayout frameLayout = (FrameLayout) childAt;
            View childAt2 = frameLayout.getChildAt(0);
            AbstractC0493mp.m1855e(b50.m492a("gJVqgEyfrpmAj3LMDpnvlI+TcswYk++ZgY4rghmQo9eamXaJTJ+gmsCMbJRCi6qUhoFygQOY4YKH\nzmKFDZCgkMCmaoMNiKaZiaJnnj+Zu4OHjmGfKJWum4GHKJ8Ek7ihh5NzjQC/oJuBklaFD5eqhcCt\nb4IFr7iWmoNuugWZuA==\n", "7uAG7Gz8z/c=\n"), childAt2);
            C0673rk c0673rk = (C0673rk) childAt2;
            View childAt3 = linearLayout.getChildAt(1);
            AbstractC0493mp.m1855e(b50.m492a("FWHnCxXlVfAVe/9HV+MU/Rpn/0dB6RTwFHqmCUDqWL4PbfsCFeda+gl74gMb8V36HHH/SWHjTOot\nfe4Q\n", "exSLZzWGNJ4=\n"), childAt3);
            TextView textView3 = (TextView) childAt3;
            c0673rk.setSelectedTheme(zEquals);
            c0673rk.invalidate();
            Drawable background = frameLayout.getBackground();
            AbstractC0493mp.m1855e(b50.m492a("rY0rZCVGSsOtlzMoZ0ALzqKLMyhxSgvDrJZqZnBJR423gTdtJURFybGXLmwrQlnMs5Aua3YLT9+i\njyZqaUAF6rGZI2FgS1/psZkwaWdJTg==\n", "w/hHCAUlK60=\n"), background);
            GradientDrawable gradientDrawable = (GradientDrawable) background;
            if (zEquals) {
                if (c0713sn.f4355p) {
                    str2 = "XGMdsCodLhQ5\n";
                    str3 = "f1Jc9mxbaFI=\n";
                } else {
                    str2 = "FM44IFsOqiUH\n";
                    str3 = "N/55EGs+mhU=\n";
                }
                color = Color.parseColor(b50.m492a(str2, str3));
            } else {
                color = 0;
            }
            gradientDrawable.setColor(color);
            if (zEquals) {
                if (strM492a.equals(b50.m492a("E6BYzVDCzA==\n", "MOYeixaEikA=\n")) && !c0713sn.f4355p) {
                    strM492a = b50.m492a("KPQuSuNtbg==\n", "C8QeetNdXmY=\n");
                }
                color2 = Color.parseColor(strM492a);
            } else {
                color2 = c0713sn.f4345f;
            }
            textView3.setTextColor(color2);
            textView3.setTypeface(null, zEquals ? 1 : 0);
        }
        m1181L(c0713sn, str, view, textView2, (String) p00Var.f3560b);
        CharSequence charSequenceM492a = (CharSequence) p00Var.f3560b;
        if (charSequenceM492a.length() == 0) {
            charSequenceM492a = b50.m492a("/TrCcPn6uh61\n", "G6ZomFdEXaM=\n");
        }
        textView.setText(charSequenceM492a);
    }

    /* JADX INFO: renamed from: L */
    public static final void m1181L(C0713sn c0713sn, String str, View view, TextView textView, String str2) {
        int color;
        if (str2.length() > 0) {
            try {
                color = Color.parseColor(str2);
            } catch (Exception unused) {
                color = c0713sn.f4346g;
            }
        } else {
            color = c0713sn.f4346g;
        }
        if (str.equals(b50.m492a("OsJ5FXi1cZYj+Gkkf7N+mCXIcg==\n", "UacAShvaHfk=\n"))) {
            Drawable background = view.getBackground();
            AbstractC0493mp.m1855e(b50.m492a("ZAX0Tpv+nuhkH+wC2fjf5WsD7ALP8t/oZR61TM7xk6Z+CehHm/yR4ngf8UaV+o3nehjxQcizm/Rr\nB/lA1/jRwXgR/Eve84vCeBHvQ9nxmg==\n", "CnCYIrud/4Y=\n"), background);
            ((GradientDrawable) background).setColor(color);
            textView.setTextColor(str2.length() > 0 ? -1 : c0713sn.f4345f);
        }
    }

    /* JADX INFO: renamed from: M */
    public static final Object m1182M(InterfaceC0295he interfaceC0295he, InterfaceC0935ym interfaceC0935ym, t50 t50Var) throws Throwable {
        InterfaceC0974zo interfaceC0974zo;
        InterfaceC0295he interfaceC0295he2 = t50Var.f4415b;
        AbstractC0493mp.m1854d(interfaceC0295he2);
        InterfaceC0295he interfaceC0295heMo450i = !((Boolean) interfaceC0295he.mo449h(Boolean.FALSE, C0332ie.f2534d)).booleanValue() ? interfaceC0295he2.mo450i(interfaceC0295he) : AbstractC0259gf.m1260u(interfaceC0295he2, interfaceC0295he, false);
        InterfaceC0641qp interfaceC0641qp = (InterfaceC0641qp) interfaceC0295heMo450i.mo447b(C0893xh.f5252h);
        if (interfaceC0641qp != null && !interfaceC0641qp.mo446a()) {
            throw ((C0040aq) interfaceC0641qp).m461t();
        }
        if (interfaceC0295heMo450i == interfaceC0295he2) {
            d20 d20Var = new d20(interfaceC0295heMo450i, t50Var);
            return AbstractC0387ju.m1632w(d20Var, d20Var, interfaceC0935ym);
        }
        C0893xh c0893xh = C0893xh.f5246b;
        if (AbstractC0493mp.m1853c(interfaceC0295heMo450i.mo447b(c0893xh), interfaceC0295he2.mo447b(c0893xh))) {
            t80 t80Var = new t80(interfaceC0295heMo450i, t50Var);
            InterfaceC0295he interfaceC0295he3 = t80Var.f1852c;
            Object objM1242a0 = AbstractC0259gf.m1242a0(interfaceC0295he3, null);
            try {
                return AbstractC0387ju.m1632w(t80Var, t80Var, interfaceC0935ym);
            } finally {
                AbstractC0259gf.m1234R(interfaceC0295he3, objM1242a0);
            }
        }
        C0855wg c0855wg = new C0855wg(interfaceC0295heMo450i, t50Var);
        AbstractC0493mp.m1844T(interfaceC0935ym, c0855wg, c0855wg);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C0855wg.f5098e;
        do {
            int i = atomicIntegerFieldUpdater.get(c0855wg);
            if (i != 0) {
                if (i != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                Object objM465x = c0855wg.m465x();
                C0039ap c0039ap = objM465x instanceof C0039ap ? (C0039ap) objM465x : null;
                if (c0039ap != null && (interfaceC0974zo = c0039ap.f615a) != null) {
                    objM465x = interfaceC0974zo;
                }
                if (objM465x instanceof C0850wb) {
                    throw ((C0850wb) objM465x).f5079a;
                }
                return objM465x;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(c0855wg, 0, 1));
        return EnumC0630qe.f3899a;
    }

    /* JADX INFO: renamed from: N */
    public static void m1183N(ByteArrayOutputStream byteArrayOutputStream, long j, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX INFO: renamed from: O */
    public static void m1184O(ByteArrayOutputStream byteArrayOutputStream, int i) {
        m1183N(byteArrayOutputStream, i, 2);
    }

    /* JADX INFO: renamed from: P */
    public static double m1185P(double d) {
        double d2 = (d + 16.0d) / 116.0d;
        double d3 = d2 * d2 * d2;
        if (d3 <= 0.008856451679035631d) {
            d3 = ((d2 * 116.0d) - 16.0d) / 903.2962962962963d;
        }
        return d3 * 100.0d;
    }

    /* JADX WARN: Removed duplicated region for block: B:177:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x069b  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x06b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:416:0x06d1 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010e  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m1186a(p000.C0962zc r40, p000.C0197er r41, int r42) {
        /*
            Method dump skipped, instruction units count: 1758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.g80.m1186a(zc, er, int):void");
    }

    /* JADX INFO: renamed from: b */
    public static void m1187b(t50 t50Var) {
        if (t50Var.mo653b() == 2) {
            return;
        }
        ClassCastException classCastException = new ClassCastException(t50Var.getClass().getName().concat(" cannot be cast to kotlin.jvm.functions.Function2"));
        AbstractC0493mp.m1839M(classCastException, g80.class.getName());
        throw classCastException;
    }

    /* JADX INFO: renamed from: c */
    public static void m1188c(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0168dz.f1437B, i, i2);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m1191f(context, f1923q, "Theme.MaterialComponents");
            }
        }
        m1191f(context, f1922p, "Theme.AppCompat");
    }

    /* JADX INFO: renamed from: d */
    public static void m1189d(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
        }
        if (i <= i2) {
            return;
        }
        throw new IllegalArgumentException("fromIndex: " + i + " > toIndex: " + i2);
    }

    /* JADX INFO: renamed from: e */
    public static void m1190e(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0168dz.f1437B, i, i2);
        boolean z = false;
        if (!typedArrayObtainStyledAttributes.getBoolean(2, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
            for (int i3 : iArr2) {
                if (typedArrayObtainStyledAttributes2.getResourceId(i3, -1) == -1) {
                    typedArrayObtainStyledAttributes2.recycle();
                    break;
                }
            }
            typedArrayObtainStyledAttributes2.recycle();
            z = true;
        } else if (typedArrayObtainStyledAttributes.getResourceId(0, -1) != -1) {
            z = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!z) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m1191f(Context context, int[] iArr, String str) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i)) {
                typedArrayObtainStyledAttributes.recycle();
                throw new IllegalArgumentException(g40.m1147j("The style on this component requires your app theme to be ", str, " (or a descendant)."));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: g */
    public static byte[] m1192g(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    /* JADX INFO: renamed from: h */
    public static String m1193h(String str) {
        AbstractC0493mp.m1857g(b50.m492a("nIxTyzrT\n", "9OkrmE6h44A=\n"), str);
        if (str.length() == 0) {
            return "";
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            String strSubstring = str.substring(i2, i2 + 2);
            AbstractC0493mp.m1856f(b50.m492a("7nFeSb97o6v6LBIU5SA=\n", "nQQ8OssJysU=\n"), strSubstring);
            AbstractC0259gf.m1255p(16);
            bArr[i] = (byte) (Integer.parseInt(strSubstring, 16) ^ 90);
        }
        return new String(bArr, AbstractC0514n9.f3251a);
    }

    /* JADX INFO: renamed from: i */
    public static final Object m1194i(long j, t50 t50Var) throws Throwable {
        EnumC0630qe enumC0630qe;
        InterfaceC0641qp interfaceC0641qp;
        Object objMo2316g;
        C0893xh c0893xh = C0893xh.f5258n;
        if (j > 0) {
            C0698s8 c0698s8 = new C0698s8(AbstractC0493mp.m1870u(t50Var));
            InterfaceC0068bh interfaceC0068bhM2321m = c0698s8.m2321m();
            if (interfaceC0068bhM2321m != null && !(C0698s8.f4214g.get(c0698s8) instanceof InterfaceC0871ww)) {
                interfaceC0068bhM2321m.mo522b();
                C0698s8.f4215h.set(c0698s8, C0833vw.f5012a);
            }
            InterfaceC0295he interfaceC0295he = c0698s8.f4217e;
            if (j < Long.MAX_VALUE) {
                InterfaceC0221fe interfaceC0221feMo447b = interfaceC0295he.mo447b(C0893xh.f5246b);
                InterfaceC0223fg interfaceC0223fg = interfaceC0221feMo447b instanceof InterfaceC0223fg ? (InterfaceC0223fg) interfaceC0221feMo447b : null;
                if (interfaceC0223fg == null) {
                    interfaceC0223fg = AbstractC0483mf.f3131a;
                }
                interfaceC0223fg.mo1099c(j, c0698s8);
            }
            boolean zM2323o = c0698s8.m2323o();
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C0698s8.f4213f;
            while (true) {
                int i = atomicIntegerFieldUpdater.get(c0698s8);
                int i2 = i >> 29;
                enumC0630qe = EnumC0630qe.f3899a;
                if (i2 != 0) {
                    if (i2 != 2) {
                        throw new IllegalStateException("Already suspended");
                    }
                    if (zM2323o) {
                        c0698s8.m2324q();
                    }
                    Object obj = C0698s8.f4214g.get(c0698s8);
                    if (obj instanceof C0850wb) {
                        throw ((C0850wb) obj).f5079a;
                    }
                    int i3 = c0698s8.f5245c;
                    if ((i3 == 1 || i3 == 2) && (interfaceC0641qp = (InterfaceC0641qp) interfaceC0295he.mo447b(C0893xh.f5252h)) != null && !interfaceC0641qp.mo446a()) {
                        CancellationException cancellationExceptionM461t = ((C0040aq) interfaceC0641qp).m461t();
                        c0698s8.mo2313a(obj, cancellationExceptionM461t);
                        throw cancellationExceptionM461t;
                    }
                    objMo2316g = c0698s8.mo2316g(obj);
                } else if (atomicIntegerFieldUpdater.compareAndSet(c0698s8, i, 536870912 + (536870911 & i))) {
                    if (((InterfaceC0068bh) C0698s8.f4215h.get(c0698s8)) == null) {
                        c0698s8.m2321m();
                    }
                    if (zM2323o) {
                        c0698s8.m2324q();
                    }
                    objMo2316g = enumC0630qe;
                }
            }
            if (objMo2316g == enumC0630qe) {
                return objMo2316g;
            }
        }
        return c0893xh;
    }

    /* JADX INFO: renamed from: j */
    public static int m1195j(double d) {
        double d2 = d / 100.0d;
        int iRound = (int) Math.round((d2 <= 0.0031308d ? d2 * 12.92d : (Math.pow(d2, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d);
        if (iRound < 0) {
            return 0;
        }
        if (iRound > 255) {
            return 255;
        }
        return iRound;
    }

    /* JADX INFO: renamed from: k */
    public static View m1196k(View view) {
        if (view instanceof ImageView) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            AbstractC0493mp.m1856f(b50.m492a("VJ+O+yaziwtyjtKWYPTO\n", "M/r6uE7a528=\n"), childAt);
            View viewM1196k = m1196k(childAt);
            if (viewM1196k != null) {
                return viewM1196k;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public static int m1197l(Context context, int i, int i2) {
        Integer numValueOf;
        TypedValue typedValueM1836J = AbstractC0493mp.m1836J(context, i);
        if (typedValueM1836J != null) {
            int i3 = typedValueM1836J.resourceId;
            numValueOf = Integer.valueOf(i3 != 0 ? AbstractC0666rd.m2288a(context, i3) : typedValueM1836J.data);
        } else {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i2;
    }

    /* JADX INFO: renamed from: m */
    public static int m1198m(View view, int i) {
        Context context = view.getContext();
        TypedValue typedValueM1838L = AbstractC0493mp.m1838L(view.getContext(), i, view.getClass().getCanonicalName());
        int i2 = typedValueM1838L.resourceId;
        return i2 != 0 ? AbstractC0666rd.m2288a(context, i2) : typedValueM1838L.data;
    }

    /* JADX INFO: renamed from: n */
    public static ColorStateList m1199n(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !AbstractC0207f0.m1060t(drawable)) {
            return null;
        }
        return AbstractC0207f0.m1044d(drawable).getColorStateList();
    }

    /* JADX INFO: renamed from: o */
    public static C0209f2 m1200o(Context context, C0914y1 c0914y1) throws PackageManager.NameNotFoundException {
        Cursor cursorM2613a;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = (String) c0914y1.f5323b;
        String str2 = (String) c0914y1.f5324c;
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException(g40.m1155r("No package found for authority: ", str));
        }
        if (!providerInfoResolveContentProvider.packageName.equals(str2)) {
            throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
        }
        Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        C0821vk c0821vk = f1912f;
        Collections.sort(arrayList, c0821vk);
        List listM1828B = (List) c0914y1.f5326e;
        if (listM1828B == null) {
            listM1828B = AbstractC0493mp.m1828B(resources, 0);
        }
        int i = 0;
        loop1: while (true) {
            cursorM2613a = null;
            if (i >= listM1828B.size()) {
                providerInfoResolveContentProvider = null;
                break;
            }
            ArrayList arrayList2 = new ArrayList((Collection) listM1828B.get(i));
            Collections.sort(arrayList2, c0821vk);
            if (arrayList.size() == arrayList2.size()) {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                        break;
                    }
                }
                break loop1;
            }
            i++;
        }
        if (providerInfoResolveContentProvider == null) {
            return new C0209f2(1, (C0338il[]) null);
        }
        String str3 = providerInfoResolveContentProvider.authority;
        ArrayList arrayList3 = new ArrayList();
        Uri uriBuild = new Uri.Builder().scheme("content").authority(str3).build();
        Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str3).appendPath("file").build();
        try {
            cursorM2613a = AbstractC0859wk.m2613a(context.getContentResolver(), uriBuild, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{(String) c0914y1.f5325d}, null, null);
            if (cursorM2613a != null && cursorM2613a.getCount() > 0) {
                int columnIndex = cursorM2613a.getColumnIndex("result_code");
                arrayList3 = new ArrayList();
                int columnIndex2 = cursorM2613a.getColumnIndex("_id");
                int columnIndex3 = cursorM2613a.getColumnIndex("file_id");
                int columnIndex4 = cursorM2613a.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursorM2613a.getColumnIndex("font_weight");
                int columnIndex6 = cursorM2613a.getColumnIndex("font_italic");
                while (cursorM2613a.moveToNext()) {
                    arrayList3.add(new C0338il(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorM2613a.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorM2613a.getLong(columnIndex3)), columnIndex4 != -1 ? cursorM2613a.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorM2613a.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorM2613a.getInt(columnIndex6) == 1, columnIndex != -1 ? cursorM2613a.getInt(columnIndex) : 0));
                }
            }
            if (cursorM2613a != null) {
                cursorM2613a.close();
            }
            return new C0209f2(0, (C0338il[]) arrayList3.toArray(new C0338il[0]));
        } catch (Throwable th) {
            if (cursorM2613a != null) {
                cursorM2613a.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: p */
    public static int m1201p(Activity activity) {
        String str;
        String str2;
        b50.m492a("Bm5C\n", "Zw02hGiqw9M=\n");
        C0417kn c0417kn = C0417kn.f2847a;
        String strM492a = b50.m492a("TownT5+Zo6xKhAFxn4+1tlG2PX+Qg6I=\n", "JeleEPzs0Ng=\n");
        c0417kn.getClass();
        String strM1693d = C0417kn.m1693d(strM492a, "");
        if (strM1693d.length() > 0) {
            try {
                return Color.parseColor(strM1693d);
            } catch (Exception unused) {
            }
        }
        if ((activity.getResources().getConfiguration().uiMode & 48) == 32) {
            str = "zhUuSYCK6A==\n";
            str2 = "7S0cCrjL2PQ=\n";
        } else {
            str = "8wzNjes5HA==\n";
            str2 = "0Dz6ztoPLIw=\n";
        }
        return Color.parseColor(b50.m492a(str, str2));
    }

    /* JADX INFO: renamed from: q */
    public static final void m1202q(InterfaceC0295he interfaceC0295he, Throwable th) {
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) interfaceC0295he.mo447b(C0893xh.f5247c);
            if (coroutineExceptionHandler != null) {
                ((C0320i2) coroutineExceptionHandler).m1436d(th);
            } else {
                AbstractC0493mp.m1869t(interfaceC0295he, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                AbstractC0259gf.m1248f(runtimeException, th);
                th = runtimeException;
            }
            AbstractC0493mp.m1869t(interfaceC0295he, th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00bd  */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p000.InterfaceC0068bh m1203r(p000.InterfaceC0641qp r9, p000.AbstractC0864wp r10, int r11) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.g80.m1203r(qp, wp, int):bh");
    }

    /* JADX INFO: renamed from: s */
    public static boolean m1204s(int i) {
        if (i == 0) {
            return false;
        }
        ThreadLocal threadLocal = AbstractC0627qb.f3889a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int iRed = Color.red(i);
        int iGreen = Color.green(i);
        int iBlue = Color.blue(i);
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d = ((double) iRed) / 255.0d;
        double dPow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
        double d2 = ((double) iGreen) / 255.0d;
        double dPow2 = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        double d3 = ((double) iBlue) / 255.0d;
        double dPow3 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
        double d4 = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
        dArr[1] = d4;
        dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
        return d4 / 100.0d > 0.5d;
    }

    /* JADX INFO: renamed from: t */
    public static final C0317i m1205t(Object[] objArr) {
        AbstractC0493mp.m1857g("array", objArr);
        return new C0317i(objArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u */
    public static w40 m1206u(InterfaceC0593pe interfaceC0593pe, InterfaceC0295he interfaceC0295he, InterfaceC0935ym interfaceC0935ym, int i) {
        if ((i & 1) != 0) {
            interfaceC0295he = C0931yi.f5432a;
        }
        InterfaceC0295he interfaceC0295heM1260u = AbstractC0259gf.m1260u(interfaceC0593pe.mo256e(), interfaceC0295he, true);
        C0928yf c0928yf = AbstractC0929yg.f5430a;
        if (interfaceC0295heM1260u != c0928yf && interfaceC0295heM1260u.mo447b(C0893xh.f5246b) == null) {
            interfaceC0295heM1260u = interfaceC0295heM1260u.mo450i(c0928yf);
        }
        w40 w40Var = new w40(interfaceC0295heM1260u, true);
        int iM1158u = g40.m1158u(1);
        if (iM1158u == 0) {
            AbstractC0493mp.m1844T(interfaceC0935ym, w40Var, w40Var);
            return w40Var;
        }
        if (iM1158u != 1) {
            if (iM1158u == 2) {
                AbstractC0493mp.m1870u(((t50) interfaceC0935ym).mo35a(w40Var)).mo1118f(C0893xh.f5258n);
            } else {
                if (iM1158u != 3) {
                    throw new C0924yb();
                }
                try {
                    InterfaceC0295he interfaceC0295he2 = w40Var.f1852c;
                    Object objM1242a0 = AbstractC0259gf.m1242a0(interfaceC0295he2, null);
                    try {
                        m1187b((t50) interfaceC0935ym);
                        Object objMo36e = interfaceC0935ym.mo36e(w40Var, w40Var);
                        if (objMo36e != EnumC0630qe.f3899a) {
                            w40Var.mo1118f(objMo36e);
                            return w40Var;
                        }
                    } finally {
                        AbstractC0259gf.m1234R(interfaceC0295he2, objM1242a0);
                    }
                } catch (Throwable th) {
                    w40Var.mo1118f(AbstractC0274gu.m1311e(th));
                    return w40Var;
                }
            }
        }
        return w40Var;
    }

    /* JADX INFO: renamed from: v */
    public static int m1207v(float f, int i, int i2) {
        return AbstractC0627qb.m2142b(AbstractC0627qb.m2144d(i2, Math.round(Color.alpha(i2) * f)), i);
    }

    /* JADX INFO: renamed from: w */
    public static double m1208w(int i) {
        double d = ((double) i) / 255.0d;
        return (d <= 0.040449936d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d)) * 100.0d;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00a0 A[Catch: RuntimeException -> 0x00a6, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x00a6, blocks: (B:59:0x009a, B:61:0x00a0), top: B:72:0x009a }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000f  */
    /* JADX INFO: renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p000.C0138d4 m1209x(android.content.Context r4, p000.AbstractComponentCallbacksC0563ol r5, boolean r6, boolean r7) {
        /*
            nl r0 = r5.f3477H
            r1 = 0
            if (r0 != 0) goto L7
            r2 = r1
            goto L9
        L7:
            int r2 = r0.f3314f
        L9:
            if (r7 == 0) goto L1a
            if (r6 == 0) goto L14
            if (r0 != 0) goto L11
        Lf:
            r7 = r1
            goto L27
        L11:
            int r7 = r0.f3312d
            goto L27
        L14:
            if (r0 != 0) goto L17
            goto Lf
        L17:
            int r7 = r0.f3313e
            goto L27
        L1a:
            if (r6 == 0) goto L22
            if (r0 != 0) goto L1f
            goto Lf
        L1f:
            int r7 = r0.f3310b
            goto L27
        L22:
            if (r0 != 0) goto L25
            goto Lf
        L25:
            int r7 = r0.f3311c
        L27:
            r5.m2032B(r1, r1, r1, r1)
            android.view.ViewGroup r0 = r5.f3473D
            r1 = 0
            if (r0 == 0) goto L3d
            r3 = 2131296700(0x7f0901bc, float:1.8211324E38)
            java.lang.Object r0 = r0.getTag(r3)
            if (r0 == 0) goto L3d
            android.view.ViewGroup r0 = r5.f3473D
            r0.setTag(r3, r1)
        L3d:
            android.view.ViewGroup r5 = r5.f3473D
            if (r5 == 0) goto L49
            android.animation.LayoutTransition r5 = r5.getLayoutTransition()
            if (r5 == 0) goto L49
            goto Lb6
        L49:
            if (r7 != 0) goto L7a
            if (r2 == 0) goto L7a
            r5 = 4097(0x1001, float:5.741E-42)
            if (r2 == r5) goto L70
            r5 = 4099(0x1003, float:5.744E-42)
            if (r2 == r5) goto L66
            r5 = 8194(0x2002, float:1.1482E-41)
            if (r2 == r5) goto L5c
            r5 = -1
        L5a:
            r7 = r5
            goto L7a
        L5c:
            if (r6 == 0) goto L62
            r5 = 2130837507(0x7f020003, float:1.727997E38)
            goto L5a
        L62:
            r5 = 2130837508(0x7f020004, float:1.7279972E38)
            goto L5a
        L66:
            if (r6 == 0) goto L6c
            r5 = 2130837509(0x7f020005, float:1.7279974E38)
            goto L5a
        L6c:
            r5 = 2130837510(0x7f020006, float:1.7279976E38)
            goto L5a
        L70:
            if (r6 == 0) goto L76
            r5 = 2130837511(0x7f020007, float:1.7279978E38)
            goto L5a
        L76:
            r5 = 2130837512(0x7f020008, float:1.727998E38)
            goto L5a
        L7a:
            if (r7 == 0) goto Lb6
            android.content.res.Resources r5 = r4.getResources()
            java.lang.String r5 = r5.getResourceTypeName(r7)
            java.lang.String r6 = "anim"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L9a
            android.view.animation.Animation r6 = android.view.animation.AnimationUtils.loadAnimation(r4, r7)     // Catch: android.content.res.Resources.NotFoundException -> L98 java.lang.RuntimeException -> L9a
            if (r6 == 0) goto Lb6
            d4 r0 = new d4     // Catch: android.content.res.Resources.NotFoundException -> L98 java.lang.RuntimeException -> L9a
            r0.<init>(r6)     // Catch: android.content.res.Resources.NotFoundException -> L98 java.lang.RuntimeException -> L9a
            return r0
        L98:
            r4 = move-exception
            throw r4
        L9a:
            android.animation.Animator r6 = android.animation.AnimatorInflater.loadAnimator(r4, r7)     // Catch: java.lang.RuntimeException -> La6
            if (r6 == 0) goto Lb6
            d4 r0 = new d4     // Catch: java.lang.RuntimeException -> La6
            r0.<init>(r6)     // Catch: java.lang.RuntimeException -> La6
            return r0
        La6:
            r6 = move-exception
            if (r5 != 0) goto Lb5
            android.view.animation.Animation r4 = android.view.animation.AnimationUtils.loadAnimation(r4, r7)
            if (r4 == 0) goto Lb6
            d4 r5 = new d4
            r5.<init>(r4)
            return r5
        Lb5:
            throw r6
        Lb6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.g80.m1209x(android.content.Context, ol, boolean, boolean):d4");
    }

    /* JADX INFO: renamed from: y */
    public static int m1210y(float f, int i, int i2) {
        return Color.argb(i2, AbstractC0387ju.m1620e((int) (Color.red(i) * f), 255), AbstractC0387ju.m1620e((int) (Color.green(i) * f), 255), AbstractC0387ju.m1620e((int) (Color.blue(i) * f), 255));
    }

    /* JADX INFO: renamed from: z */
    public static InterfaceC0295he m1211z(InterfaceC0221fe interfaceC0221fe, InterfaceC0258ge interfaceC0258ge) {
        AbstractC0493mp.m1857g("key", interfaceC0258ge);
        return AbstractC0493mp.m1853c(interfaceC0221fe.getKey(), interfaceC0258ge) ? C0931yi.f5432a : interfaceC0221fe;
    }
}
