package p000;

import android.app.Activity;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EdgeEffect;
import android.widget.ImageView;
import android.widget.TextView;
import com.ljx.wechatmod.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class a80 {

    /* JADX INFO: renamed from: d */
    public static final C0431l0 f71d;

    /* JADX INFO: renamed from: e */
    public static final C0431l0 f72e;

    /* JADX INFO: renamed from: g */
    public static final C0431l0 f74g;

    /* JADX INFO: renamed from: r */
    public static RippleDrawable f85r = null;

    /* JADX INFO: renamed from: s */
    public static int f86s = 0;

    /* JADX INFO: renamed from: t */
    public static int f87t = 0;

    /* JADX INFO: renamed from: u */
    public static int f88u = 0;

    /* JADX INFO: renamed from: v */
    public static String f89v = "";

    /* JADX INFO: renamed from: a */
    public static final double[][] f68a = {new double[]{0.401288d, 0.650173d, -0.051461d}, new double[]{-0.250268d, 1.204414d, 0.045854d}, new double[]{-0.002079d, 0.048952d, 0.953127d}};

    /* JADX INFO: renamed from: b */
    public static final double[][] f69b = {new double[]{0.41233895d, 0.35762064d, 0.18051042d}, new double[]{0.2126d, 0.7152d, 0.0722d}, new double[]{0.01932141d, 0.11916382d, 0.95034478d}};

    /* JADX INFO: renamed from: c */
    public static final double[] f70c = {95.047d, 100.0d, 108.883d};

    /* JADX INFO: renamed from: f */
    public static final C0748tk f73f = new C0748tk();

    /* JADX INFO: renamed from: h */
    public static final boolean[] f75h = new boolean[3];

    /* JADX INFO: renamed from: i */
    public static final byte[] f76i = {48, 49, 53, 0};

    /* JADX INFO: renamed from: j */
    public static final byte[] f77j = {48, 49, 48, 0};

    /* JADX INFO: renamed from: k */
    public static final byte[] f78k = {48, 48, 57, 0};

    /* JADX INFO: renamed from: l */
    public static final byte[] f79l = {48, 48, 53, 0};

    /* JADX INFO: renamed from: m */
    public static final byte[] f80m = {48, 48, 49, 0};

    /* JADX INFO: renamed from: n */
    public static final byte[] f81n = {48, 48, 49, 0};

    /* JADX INFO: renamed from: o */
    public static final byte[] f82o = {48, 48, 50, 0};

    /* JADX INFO: renamed from: p */
    public static final int[] f83p = {R.attr.colorPrimary};

    /* JADX INFO: renamed from: q */
    public static final int[] f84q = {R.attr.colorPrimaryVariant};

    static {
        int i = 27;
        f71d = new C0431l0(i, "UNDEFINED");
        f72e = new C0431l0(i, "REUSABLE_CLAIMED");
        f74g = new C0431l0(i, "CONDITION_FALSE");
    }

    /* JADX INFO: renamed from: A */
    public static final Object m29A(Object obj) {
        return obj instanceof C0516nb ? AbstractC0126ct.m812f(((C0516nb) obj).f3368a) : obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0099 A[Catch: all -> 0x0079, DONT_GENERATE, TryCatch #2 {all -> 0x0079, blocks: (B:19:0x0055, B:21:0x0062, B:23:0x0068, B:36:0x009c, B:26:0x007b, B:28:0x0088, B:33:0x0093, B:35:0x0099, B:41:0x00a9, B:44:0x00b2, B:43:0x00af, B:31:0x008e), top: B:57:0x0055, inners: #0 }] */
    /* JADX INFO: renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m30B(p000.InterfaceC0444ld r10, java.lang.Object r11) {
        /*
            boolean r0 = r10 instanceof p000.C0744tg
            if (r0 == 0) goto Lbd
            tg r10 = (p000.C0744tg) r10
            ke r0 = r10.f4572d
            m50 r1 = r10.f4573e
            java.lang.Throwable r2 = p000.f10.m1132a(r11)
            if (r2 != 0) goto L12
            r3 = r11
            goto L18
        L12:
            nb r3 = new nb
            r4 = 0
            r3.<init>(r2, r4)
        L18:
            r1.mo1240d()
            ge r2 = r1.f3143b
            boolean r4 = r0.mo1605e()
            r5 = 1
            if (r4 == 0) goto L2f
            r10.f4574f = r3
            r10.f4842c = r5
            p000.AbstractC0346ip.m1500l(r2)
            r0.mo1598d(r2, r10)
            return
        L2f:
            kj r0 = p000.t60.m2362a()
            long r6 = r0.f2904c
            r8 = 4294967296(0x100000000, double:2.121995791E-314)
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 < 0) goto L51
            r10.f4574f = r3
            r10.f4842c = r5
            k6 r11 = r0.f2906e
            if (r11 != 0) goto L4d
            k6 r11 = new k6
            r11.<init>()
            r0.f2906e = r11
        L4d:
            r11.addLast(r10)
            goto Lb7
        L51:
            r0.m1702k(r5)
            r4 = 0
            p000.AbstractC0346ip.m1500l(r2)     // Catch: java.lang.Throwable -> L79
            vh r5 = p000.C0819vh.f4849h     // Catch: java.lang.Throwable -> L79
            ee r5 = r2.mo1272b(r5)     // Catch: java.lang.Throwable -> L79
            mp r5 = (p000.InterfaceC0493mp) r5     // Catch: java.lang.Throwable -> L79
            if (r5 == 0) goto L7b
            boolean r6 = r5.mo1853a()     // Catch: java.lang.Throwable -> L79
            if (r6 != 0) goto L7b
            wp r5 = (p000.C0864wp) r5     // Catch: java.lang.Throwable -> L79
            java.util.concurrent.CancellationException r11 = r5.m2590t()     // Catch: java.lang.Throwable -> L79
            r10.mo1403a(r3, r11)     // Catch: java.lang.Throwable -> L79
            e10 r11 = p000.AbstractC0126ct.m812f(r11)     // Catch: java.lang.Throwable -> L79
            r10.mo1241f(r11)     // Catch: java.lang.Throwable -> L79
            goto L9c
        L79:
            r11 = move-exception
            goto Lb3
        L7b:
            java.lang.Object r3 = r10.f4575g     // Catch: java.lang.Throwable -> L79
            p000.AbstractC0346ip.m1500l(r2)     // Catch: java.lang.Throwable -> L79
            java.lang.Object r3 = p000.AbstractC0222ff.m1176V(r2, r3)     // Catch: java.lang.Throwable -> L79
            l0 r5 = p000.AbstractC0222ff.f1957x     // Catch: java.lang.Throwable -> L79
            if (r3 == r5) goto L8d
            o80 r5 = p000.AbstractC0346ip.m1489b0(r1, r2, r3)     // Catch: java.lang.Throwable -> L79
            goto L8e
        L8d:
            r5 = r4
        L8e:
            r1.mo1241f(r11)     // Catch: java.lang.Throwable -> La6
            if (r5 == 0) goto L99
            boolean r11 = r5.m2001K()     // Catch: java.lang.Throwable -> L79
            if (r11 == 0) goto L9c
        L99:
            p000.AbstractC0222ff.m1166L(r2, r3)     // Catch: java.lang.Throwable -> L79
        L9c:
            boolean r11 = r0.m1703l()     // Catch: java.lang.Throwable -> L79
            if (r11 != 0) goto L9c
        La2:
            r0.m1701f()
            goto Lb7
        La6:
            r11 = move-exception
            if (r5 == 0) goto Laf
            boolean r1 = r5.m2001K()     // Catch: java.lang.Throwable -> L79
            if (r1 == 0) goto Lb2
        Laf:
            p000.AbstractC0222ff.m1166L(r2, r3)     // Catch: java.lang.Throwable -> L79
        Lb2:
            throw r11     // Catch: java.lang.Throwable -> L79
        Lb3:
            r10.m2508h(r11, r4)     // Catch: java.lang.Throwable -> Lb8
            goto La2
        Lb7:
            return
        Lb8:
            r10 = move-exception
            r0.m1701f()
            throw r10
        Lbd:
            r10.mo1241f(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.a80.m30B(ld, java.lang.Object):void");
    }

    /* JADX INFO: renamed from: E */
    public static void m31E(Drawable drawable, int i) {
        AbstractC0104ch.m687g(drawable, i);
    }

    /* JADX INFO: renamed from: F */
    public static void m32F(Drawable drawable, ColorStateList colorStateList) {
        AbstractC0104ch.m688h(drawable, colorStateList);
    }

    /* JADX INFO: renamed from: G */
    public static void m33G(Drawable drawable, PorterDuff.Mode mode) {
        AbstractC0104ch.m689i(drawable, mode);
    }

    /* JADX INFO: renamed from: H */
    public static void m34H(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public static final Object m35I(InterfaceC0258ge interfaceC0258ge, InterfaceC0861wm interfaceC0861wm, m50 m50Var) throws Throwable {
        InterfaceC0826vo interfaceC0826vo;
        InterfaceC0258ge interfaceC0258ge2 = m50Var.f3143b;
        AbstractC0346ip.m1500l(interfaceC0258ge2);
        InterfaceC0258ge interfaceC0258geMo1275i = !((Boolean) interfaceC0258ge.mo1274h(Boolean.FALSE, C0295he.f2274d)).booleanValue() ? interfaceC0258ge2.mo1275i(interfaceC0258ge) : AbstractC0346ip.m1508t(interfaceC0258ge2, interfaceC0258ge, false);
        InterfaceC0493mp interfaceC0493mp = (InterfaceC0493mp) interfaceC0258geMo1275i.mo1272b(C0819vh.f4849h);
        if (interfaceC0493mp != null && !interfaceC0493mp.mo1853a()) {
            throw ((C0864wp) interfaceC0493mp).m2590t();
        }
        if (interfaceC0258geMo1275i == interfaceC0258ge2) {
            w10 w10Var = new w10(interfaceC0258geMo1275i, m50Var);
            return AbstractC0126ct.m826x(w10Var, w10Var, interfaceC0861wm);
        }
        C0819vh c0819vh = C0819vh.f4843b;
        if (AbstractC0346ip.m1497i(interfaceC0258geMo1275i.mo1272b(c0819vh), interfaceC0258ge2.mo1272b(c0819vh))) {
            o80 o80Var = new o80(interfaceC0258geMo1275i, m50Var);
            InterfaceC0258ge interfaceC0258ge3 = o80Var.f1999c;
            Object objM1176V = AbstractC0222ff.m1176V(interfaceC0258ge3, null);
            try {
                return AbstractC0126ct.m826x(o80Var, o80Var, interfaceC0861wm);
            } finally {
                AbstractC0222ff.m1166L(interfaceC0258ge3, objM1176V);
            }
        }
        C0781ug c0781ug = new C0781ug(interfaceC0258geMo1275i, m50Var);
        AbstractC0346ip.m1485X(interfaceC0861wm, c0781ug, c0781ug);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C0781ug.f4729e;
        do {
            int i = atomicIntegerFieldUpdater.get(c0781ug);
            if (i != 0) {
                if (i != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                Object objM2592x = c0781ug.m2592x();
                C0863wo c0863wo = objM2592x instanceof C0863wo ? (C0863wo) objM2592x : null;
                if (c0863wo != null && (interfaceC0826vo = c0863wo.f4999a) != null) {
                    objM2592x = interfaceC0826vo;
                }
                if (objM2592x instanceof C0516nb) {
                    throw ((C0516nb) objM2592x).f3368a;
                }
                return objM2592x;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(c0781ug, 0, 1));
        return EnumC0594pe.f3883a;
    }

    /* JADX INFO: renamed from: J */
    public static double m36J(double d) {
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
    public static void m37a(p000.C0629qc r40, p000.C0041ar r41, int r42) {
        /*
            Method dump skipped, instruction units count: 1758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.a80.m37a(qc, ar, int):void");
    }

    /* JADX INFO: renamed from: b */
    public static void m38b(m50 m50Var) {
        if (m50Var.mo115b() == 2) {
            return;
        }
        ClassCastException classCastException = new ClassCastException(m50Var.getClass().getName().concat(" cannot be cast to kotlin.jvm.functions.Function2"));
        AbstractC0346ip.m1483U(classCastException, a80.class.getName());
        throw classCastException;
    }

    /* JADX INFO: renamed from: c */
    public static void m39c(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0873wy.f5041B, i, i2);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m42f(context, f84q, "Theme.MaterialComponents");
            }
        }
        m42f(context, f83p, "Theme.AppCompat");
    }

    /* JADX INFO: renamed from: d */
    public static void m40d(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
        }
        if (i <= i2) {
            return;
        }
        throw new IllegalArgumentException("fromIndex: " + i + " > toIndex: " + i2);
    }

    /* JADX INFO: renamed from: e */
    public static void m41e(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0873wy.f5041B, i, i2);
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
    public static void m42f(Context context, int[] iArr, String str) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i)) {
                typedArrayObtainStyledAttributes.recycle();
                throw new IllegalArgumentException(z30.m2765j("The style on this component requires your app theme to be ", str, " (or a descendant)."));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: g */
    public static C0859wk m43g(Context context) {
        ProviderInfo providerInfo;
        C0914y1 c0914y1;
        ApplicationInfo applicationInfo;
        C0819vh c0372jf = Build.VERSION.SDK_INT >= 28 ? new C0372jf(16) : new C0819vh(16);
        PackageManager packageManager = context.getPackageManager();
        AbstractC0979zt.m2825f("Package manager required to locate emoji font provider", packageManager);
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            c0914y1 = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrMo1594g = c0372jf.mo1594g(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrMo1594g) {
                    arrayList.add(signature.toByteArray());
                }
                c0914y1 = new C0914y1(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
                c0914y1 = null;
            }
        }
        if (c0914y1 == null) {
            return null;
        }
        return new C0859wk(new C0822vk(context, c0914y1));
    }

    /* JADX INFO: renamed from: h */
    public static String m44h(String str) {
        AbstractC0346ip.m1503o("hexStr", str);
        if (str.length() == 0) {
            return "";
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            String strSubstring = str.substring(i2, i2 + 2);
            AbstractC0346ip.m1502n("substring(...)", strSubstring);
            AbstractC0222ff.m1186h(16);
            bArr[i] = (byte) (Integer.parseInt(strSubstring, 16) ^ 90);
        }
        return new String(bArr, AbstractC0096c9.f928a);
    }

    /* JADX INFO: renamed from: i */
    public static int m45i(double d) {
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

    /* JADX INFO: renamed from: j */
    public static View m46j(View view) {
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
            AbstractC0346ip.m1502n("getChildAt(...)", childAt);
            View viewM46j = m46j(childAt);
            if (viewM46j != null) {
                return viewM46j;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public static float m47k(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC0782uh.m2456b(edgeEffect);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: m */
    public static C0209f2 m48m(Context context, C0914y1 c0914y1) throws PackageManager.NameNotFoundException {
        Cursor cursorM2458a;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = (String) c0914y1.f5246b;
        String str2 = (String) c0914y1.f5247c;
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
        }
        if (!providerInfoResolveContentProvider.packageName.equals(str2)) {
            throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
        }
        Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        C0748tk c0748tk = f73f;
        Collections.sort(arrayList, c0748tk);
        List listM61z = (List) c0914y1.f5249e;
        if (listM61z == null) {
            listM61z = m61z(resources, 0);
        }
        int i = 0;
        loop1: while (true) {
            cursorM2458a = null;
            if (i >= listM61z.size()) {
                providerInfoResolveContentProvider = null;
                break;
            }
            ArrayList arrayList2 = new ArrayList((Collection) listM61z.get(i));
            Collections.sort(arrayList2, c0748tk);
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
            return new C0209f2(1, (C0265gl[]) null);
        }
        String str3 = providerInfoResolveContentProvider.authority;
        ArrayList arrayList3 = new ArrayList();
        Uri uriBuild = new Uri.Builder().scheme("content").authority(str3).build();
        Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str3).appendPath("file").build();
        try {
            cursorM2458a = AbstractC0785uk.m2458a(context.getContentResolver(), uriBuild, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{(String) c0914y1.f5248d}, null, null);
            if (cursorM2458a != null && cursorM2458a.getCount() > 0) {
                int columnIndex = cursorM2458a.getColumnIndex("result_code");
                arrayList3 = new ArrayList();
                int columnIndex2 = cursorM2458a.getColumnIndex("_id");
                int columnIndex3 = cursorM2458a.getColumnIndex("file_id");
                int columnIndex4 = cursorM2458a.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursorM2458a.getColumnIndex("font_weight");
                int columnIndex6 = cursorM2458a.getColumnIndex("font_italic");
                while (cursorM2458a.moveToNext()) {
                    arrayList3.add(new C0265gl(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorM2458a.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorM2458a.getLong(columnIndex3)), columnIndex4 != -1 ? cursorM2458a.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorM2458a.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorM2458a.getInt(columnIndex6) == 1, columnIndex != -1 ? cursorM2458a.getInt(columnIndex) : 0));
                }
            }
            if (cursorM2458a != null) {
                cursorM2458a.close();
            }
            return new C0209f2(0, (C0265gl[]) arrayList3.toArray(new C0265gl[0]));
        } catch (Throwable th) {
            if (cursorM2458a != null) {
                cursorM2458a.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: n */
    public static int m49n(Activity activity) {
        String str;
        String str2;
        "act";
        C0267gn c0267gn = C0267gn.f2144a;
        String strM2419a = "key_custom_accent_color";
        c0267gn.getClass();
        String strM1284d = C0267gn.m1284d(strM2419a, "");
        if (strM1284d.length() > 0) {
            try {
                return Color.parseColor(strM1284d);
            } catch (Exception unused) {
            }
        }
        if ((activity.getResources().getConfiguration().uiMode & 48) == 32) {
            str = "z8u0MsxsEw==\n";
            str2 = "7POGcfQtI4I=\n";
        } else {
            str = "O1JE1o6DLw==\n";
            str2 = "GGJzlb+1H68=\n";
        }
        return Color.parseColor("#07C160");
    }

    /* JADX INFO: renamed from: o */
    public static final void m50o(InterfaceC0258ge interfaceC0258ge, Throwable th) {
        Throwable runtimeException;
        Iterator it = AbstractC0445le.f3046a.iterator();
        while (it.hasNext()) {
            try {
                ((C0320i2) ((CoroutineExceptionHandler) it.next())).m1385d(th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    AbstractC0346ip.m1494f(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            AbstractC0346ip.m1494f(th, new C0521ng(interfaceC0258ge));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00bd  */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p000.InterfaceC0966zg m51p(p000.InterfaceC0493mp r9, p000.AbstractC0716sp r10, int r11) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.a80.m51p(mp, sp, int):zg");
    }

    /* JADX INFO: renamed from: q */
    public static final C0317i m52q(Object[] objArr) {
        AbstractC0346ip.m1503o("array", objArr);
        return new C0317i(objArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    public static p40 m53r(InterfaceC0556oe interfaceC0556oe, InterfaceC0258ge interfaceC0258ge, InterfaceC0861wm interfaceC0861wm, int i) {
        if ((i & 1) != 0) {
            interfaceC0258ge = C0857wi.f4966a;
        }
        InterfaceC0258ge interfaceC0258geM1508t = AbstractC0346ip.m1508t(interfaceC0556oe.mo271e(), interfaceC0258ge, true);
        C0891xf c0891xf = AbstractC0855wg.f4964a;
        if (interfaceC0258geM1508t != c0891xf && interfaceC0258geM1508t.mo1272b(C0819vh.f4843b) == null) {
            interfaceC0258geM1508t = interfaceC0258geM1508t.mo1275i(c0891xf);
        }
        p40 p40Var = new p40(interfaceC0258geM1508t, true);
        int iM2775t = z30.m2775t(1);
        if (iM2775t == 0) {
            AbstractC0346ip.m1485X(interfaceC0861wm, p40Var, p40Var);
            return p40Var;
        }
        if (iM2775t != 1) {
            if (iM2775t == 2) {
                AbstractC0346ip.m1512z(((m50) interfaceC0861wm).mo471a(p40Var)).mo1241f(C0819vh.f4855n);
            } else {
                if (iM2775t != 3) {
                    throw new C0591pb();
                }
                try {
                    InterfaceC0258ge interfaceC0258ge2 = p40Var.f1999c;
                    Object objM1176V = AbstractC0222ff.m1176V(interfaceC0258ge2, null);
                    try {
                        m38b((m50) interfaceC0861wm);
                        Object objMo472e = interfaceC0861wm.mo472e(p40Var, p40Var);
                        if (objMo472e != EnumC0594pe.f3883a) {
                            p40Var.mo1241f(objMo472e);
                            return p40Var;
                        }
                    } finally {
                        AbstractC0222ff.m1166L(interfaceC0258ge2, objM1176V);
                    }
                } catch (Throwable th) {
                    p40Var.mo1241f(AbstractC0126ct.m812f(th));
                    return p40Var;
                }
            }
        }
        return p40Var;
    }

    /* JADX INFO: renamed from: s */
    public static double m54s(int i) {
        double d = ((double) i) / 255.0d;
        return (d <= 0.040449936d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d)) * 100.0d;
    }

    /* JADX INFO: renamed from: t */
    public static int m55t(float f, int i, int i2) {
        return Color.argb(i2, AbstractC0273gt.m1304e((int) (Color.red(i) * f), 255), AbstractC0273gt.m1304e((int) (Color.green(i) * f), 255), AbstractC0273gt.m1304e((int) (Color.blue(i) * f), 255));
    }

    /* JADX INFO: renamed from: u */
    public static TypedArray m56u(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m39c(context, attributeSet, i, i2);
        m41e(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    /* JADX INFO: renamed from: v */
    public static void m57v(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    /* JADX INFO: renamed from: w */
    public static float m58w(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC0782uh.m2457c(edgeEffect, f, f2);
        }
        AbstractC0745th.m2378a(edgeEffect, f, f2);
        return f;
    }

    /* JADX INFO: renamed from: x */
    public static InterfaceC0108cl m59x(XmlResourceParser xmlResourceParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            m34H(xmlResourceParser);
            return null;
        }
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC0762ty.f4629b);
        String string = typedArrayObtainAttributes.getString(0);
        String string2 = typedArrayObtainAttributes.getString(4);
        String string3 = typedArrayObtainAttributes.getString(5);
        int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
        int integer = typedArrayObtainAttributes.getInteger(2, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(3, 500);
        String string4 = typedArrayObtainAttributes.getString(6);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlResourceParser.next() != 3) {
                m34H(xmlResourceParser);
            }
            return new C0228fl(new C0914y1(string, string2, string3, m61z(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlResourceParser.next() != 3) {
            if (xmlResourceParser.getEventType() == 2) {
                if (xmlResourceParser.getName().equals("font")) {
                    TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC0762ty.f4630c);
                    int i = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, 400);
                    boolean z = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                    int i2 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                    String string5 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                    int i3 = typedArrayObtainAttributes2.getInt(i2, 0);
                    int i4 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                    int resourceId2 = typedArrayObtainAttributes2.getResourceId(i4, 0);
                    String string6 = typedArrayObtainAttributes2.getString(i4);
                    typedArrayObtainAttributes2.recycle();
                    while (xmlResourceParser.next() != 3) {
                        m34H(xmlResourceParser);
                    }
                    arrayList.add(new C0191el(i, i3, resourceId2, string6, string5, z));
                } else {
                    m34H(xmlResourceParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C0155dl((C0191el[]) arrayList.toArray(new C0191el[0]));
    }

    /* JADX INFO: renamed from: y */
    public static InterfaceC0258ge m60y(InterfaceC0258ge interfaceC0258ge, InterfaceC0258ge interfaceC0258ge2) {
        AbstractC0346ip.m1503o("context", interfaceC0258ge2);
        return interfaceC0258ge2 == C0857wi.f4966a ? interfaceC0258ge : (InterfaceC0258ge) interfaceC0258ge2.mo1274h(interfaceC0258ge, new C0368jb(1));
    }

    /* JADX INFO: renamed from: z */
    public static List m61z(Resources resources, int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (AbstractC0072bl.m560a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    /* JADX INFO: renamed from: C */
    public abstract void mo62C(boolean z);

    /* JADX INFO: renamed from: D */
    public abstract void mo63D(boolean z);

    /* JADX INFO: renamed from: l */
    public abstract InputFilter[] mo64l(InputFilter[] inputFilterArr);
}
