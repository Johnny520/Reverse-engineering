package p000;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.ImageButton;
import io.sentry.C1981r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: Qj */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0714Qj {

    /* JADX INFO: renamed from: a */
    public static final int[] f2294a = new int[0];

    /* JADX INFO: renamed from: b */
    public static final Object[] f2295b = new Object[0];

    /* JADX INFO: renamed from: c */
    public static final C0668Pg f2296c = new C0668Pg(2);

    /* JADX INFO: renamed from: d */
    public static final boolean[] f2297d = new boolean[3];

    /* JADX INFO: renamed from: e */
    public static final Object f2298e = new Object();

    /* JADX INFO: renamed from: A */
    public static int m1470A(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    /* JADX INFO: renamed from: B */
    public static TypedArray m1471B(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* JADX INFO: renamed from: C */
    public static final Object m1472C(Object obj) {
        return obj instanceof C0189Ea ? new C0297Gw(((C0189Ea) obj).f575a) : obj;
    }

    /* JADX INFO: renamed from: D */
    public static int m1473D(Context context, int i, int i2) {
        TypedValue typedValueM2537P = AbstractC1293cr.m2537P(context, i);
        return (typedValueM2537P == null || typedValueM2537P.type != 16) ? i2 : typedValueM2537P.data;
    }

    /* JADX INFO: renamed from: E */
    public static TimeInterpolator m1474E(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!m1503y(strValueOf, "cubic-bezier") && !m1503y(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (m1503y(strValueOf, "cubic-bezier")) {
            String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
            if (strArrSplit.length == 4) {
                return new PathInterpolator(m1497s(strArrSplit, 0), m1497s(strArrSplit, 1), m1497s(strArrSplit, 2), m1497s(strArrSplit, 3));
            }
            throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
        }
        if (!m1503y(strValueOf, "path")) {
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(strValueOf));
        }
        String strSubstring = strValueOf.substring(5, strValueOf.length() - 1);
        Path path = new Path();
        try {
            C0552Mt.m1095b(AbstractC1406fG.m2688M(strSubstring), path);
            return new PathInterpolator(path);
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing ".concat(strSubstring), e);
        }
    }

    /* JADX INFO: renamed from: F */
    public static void m1475F(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    /* JADX INFO: renamed from: G */
    public static final long m1476G(String str, long j, long j2, long j3) {
        String property;
        int i = AbstractC1356eA.f4858a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        Long lM62I = AbstractC0042Az.m62I(property);
        if (lM62I == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lM62I.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + '\'').toString());
    }

    /* JADX INFO: renamed from: H */
    public static int m1477H(String str, int i, int i2) {
        return (int) m1476G(str, i, 1, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    /* JADX INFO: renamed from: I */
    public static C2656w4 m1478I(int i, InterfaceC1054Yg interfaceC1054Yg) {
        return new C2656w4(new C1110Zt(i), interfaceC1054Yg, f2296c);
    }

    /* JADX INFO: renamed from: a */
    public static final C2169kz m1479a(InterfaceC0406Jc interfaceC0406Jc) {
        C2169kz c2169kz = interfaceC0406Jc instanceof C2169kz ? (C2169kz) interfaceC0406Jc : null;
        if (c2169kz != null) {
            return c2169kz;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + AbstractC0425Jv.m881a(interfaceC0406Jc.getClass()));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m1480b(int i, Rect rect, Rect rect2, Rect rect3) {
        int i2;
        int i3;
        boolean zM1481c = m1481c(i, rect, rect2);
        if (m1481c(i, rect, rect3) || !zM1481c) {
            return false;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    if (rect.bottom <= rect3.top) {
                        if (i != 17 && i != 66) {
                            int iM1504z = m1504z(i, rect, rect2);
                            if (i == 17) {
                                i2 = rect.left;
                                i3 = rect3.left;
                            } else if (i == 33) {
                                i2 = rect.top;
                                i3 = rect3.top;
                            } else if (i == 66) {
                                i2 = rect3.right;
                                i3 = rect.right;
                            } else {
                                if (i != 130) {
                                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                }
                                i2 = rect3.bottom;
                                i3 = rect.bottom;
                            }
                            if (iM1504z >= Math.max(1, i2 - i3)) {
                                return false;
                            }
                        }
                    }
                } else if (rect.right <= rect3.left) {
                }
            } else if (rect.top >= rect3.bottom) {
            }
        } else if (rect.left >= rect3.right) {
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m1481c(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* JADX INFO: renamed from: d */
    public static final int m1482d(int i, int i2, int[] iArr) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    /* JADX INFO: renamed from: e */
    public static final int m1483e(long[] jArr, int i, long j) {
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else {
                if (j2 <= j) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    /* JADX INFO: renamed from: f */
    public static void m1484f(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m1485g(int i, String str) {
        if (str.charAt(i) == '-') {
            return;
        }
        StringBuilder sbM4816m = AbstractC2374ph.m4816m(i, "Expected '-' (hyphen) at index ", ", but was '");
        sbM4816m.append(str.charAt(i));
        sbM4816m.append('\'');
        throw new IllegalArgumentException(sbM4816m.toString().toString());
    }

    /* JADX INFO: renamed from: h */
    public static void m1486h(C2497sb c2497sb, C2244mo c2244mo, C2454rb c2454rb) {
        c2454rb.f8634o = -1;
        C1259cb c1259cb = c2454rb.f8592M;
        int[] iArr = c2454rb.f8637p0;
        C1259cb c1259cb2 = c2454rb.f8591L;
        C1259cb c1259cb3 = c2454rb.f8589J;
        C1259cb c1259cb4 = c2454rb.f8590K;
        C1259cb c1259cb5 = c2454rb.f8588I;
        c2454rb.f8636p = -1;
        int[] iArr2 = c2497sb.f8637p0;
        if (iArr2[0] != 2 && iArr[0] == 4) {
            int i = c1259cb5.f4271g;
            int iM4937q = c2497sb.m4937q() - c1259cb4.f4271g;
            c1259cb5.f4273i = c2244mo.m4572k(c1259cb5);
            c1259cb4.f4273i = c2244mo.m4572k(c1259cb4);
            c2244mo.m4565d(c1259cb5.f4273i, i);
            c2244mo.m4565d(c1259cb4.f4273i, iM4937q);
            c2454rb.f8634o = 2;
            c2454rb.f8604Y = i;
            int i2 = iM4937q - i;
            c2454rb.f8600U = i2;
            int i3 = c2454rb.f8609b0;
            if (i2 < i3) {
                c2454rb.f8600U = i3;
            }
        }
        if (iArr2[1] == 2 || iArr[1] != 4) {
            return;
        }
        int i4 = c1259cb3.f4271g;
        int iM4933k = c2497sb.m4933k() - c1259cb2.f4271g;
        c1259cb3.f4273i = c2244mo.m4572k(c1259cb3);
        c1259cb2.f4273i = c2244mo.m4572k(c1259cb2);
        c2244mo.m4565d(c1259cb3.f4273i, i4);
        c2244mo.m4565d(c1259cb2.f4273i, iM4933k);
        if (c2454rb.f8607a0 > 0 || c2454rb.f8619g0 == 8) {
            C0256Fy c0256FyM4572k = c2244mo.m4572k(c1259cb);
            c1259cb.f4273i = c0256FyM4572k;
            c2244mo.m4565d(c0256FyM4572k, c2454rb.f8607a0 + i4);
        }
        c2454rb.f8636p = 2;
        c2454rb.f8605Z = i4;
        int i5 = iM4933k - i4;
        c2454rb.f8601V = i5;
        int i6 = c2454rb.f8611c0;
        if (i5 < i6) {
            c2454rb.f8601V = i6;
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m1487i(Object obj) {
        m1488j("Argument must not be null", obj);
    }

    /* JADX INFO: renamed from: j */
    public static void m1488j(String str, Object obj) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public static final void m1489k(C1981r c1981r, Throwable th) {
        boolean zIsTerminated;
        if (th != null) {
            try {
                AbstractC0213Ey.m416n(c1981r);
                return;
            } catch (Throwable th2) {
                AbstractC0148Dc.m268b(th, th2);
                return;
            }
        }
        if (c1981r instanceof AutoCloseable) {
            c1981r.close();
            return;
        }
        if (!(c1981r instanceof ExecutorService)) {
            throw new IllegalArgumentException();
        }
        ExecutorService executorService = (ExecutorService) c1981r;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: l */
    public static C0669Ph m1490l(Context context) {
        ProviderInfo providerInfo;
        C0583Nh c0583Nh;
        ApplicationInfo applicationInfo;
        PackageManager packageManager = context.getPackageManager();
        AbstractC1293cr.m2548g("Package manager required to locate emoji font provider", packageManager);
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
            c0583Nh = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArr = packageManager.getPackageInfo(str2, 64).signatures;
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArr) {
                    arrayList.add(signature.toByteArray());
                }
                c0583Nh = new C0583Nh(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList), null, null);
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
                c0583Nh = null;
            }
        }
        if (c0583Nh == null) {
            return null;
        }
        return new C0669Ph(new C0626Oh(context, c0583Nh));
    }

    /* JADX INFO: renamed from: m */
    public static C1194ax m1491m(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            if (bundle2 == null) {
                return new C1194ax();
            }
            HashMap map = new HashMap();
            for (String str : bundle2.keySet()) {
                map.put(str, bundle2.get(str));
            }
            return new C1194ax(map);
        }
        bundle.setClassLoader(C1194ax.class.getClassLoader());
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            throw new IllegalStateException("Invalid bundle passed as restored state");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = parcelableArrayList.size();
        for (int i = 0; i < size; i++) {
            linkedHashMap.put((String) parcelableArrayList.get(i), parcelableArrayList2.get(i));
        }
        return new C1194ax(linkedHashMap);
    }

    /* JADX INFO: renamed from: n */
    public static final boolean m1492n(int i, int i2) {
        return (i & i2) == i2;
    }

    /* JADX INFO: renamed from: o */
    public static ViewGroup m1493o(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                ViewGroup viewGroup2 = (ViewGroup) childAt;
                if (viewGroup2.getBackground() != null && childAt.getVisibility() == 0 && viewGroup2.getLayoutParams().height > AbstractC0295Gu.m616i(450)) {
                    return viewGroup2;
                }
                ViewGroup viewGroupM1493o = m1493o(viewGroup2);
                if (viewGroupM1493o != null) {
                    return viewGroupM1493o;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public static View m1494p(ViewGroup viewGroup) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt instanceof ViewGroup) {
                View viewM1494p = m1494p((ViewGroup) childAt);
                if (viewM1494p != null) {
                    return viewM1494p;
                }
            } else if (childAt instanceof Button) {
                ViewGroup.LayoutParams layoutParams = ((Button) childAt).getLayoutParams();
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (i = (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams).width) == marginLayoutParams.height && i > AbstractC0295Gu.m616i(80) && marginLayoutParams.topMargin < 0) {
                    return childAt;
                }
            } else {
                continue;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public static View m1495q(ViewGroup viewGroup) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt instanceof ViewGroup) {
                View viewM1495q = m1495q((ViewGroup) childAt);
                if (viewM1495q != null) {
                    return viewM1495q;
                }
            } else if (childAt instanceof ImageButton) {
                ViewGroup.LayoutParams layoutParams = ((ImageButton) childAt).getLayoutParams();
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (i = (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams).width) == marginLayoutParams.height && i > AbstractC0295Gu.m616i(80) && marginLayoutParams.topMargin < 0) {
                    return childAt;
                }
            } else {
                continue;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: r */
    public static final void m1496r(long j, byte[] bArr, int i, int i2, int i3) {
        int i4 = 7 - i2;
        int i5 = 8 - i3;
        if (i5 > i4) {
            return;
        }
        while (true) {
            int i6 = AbstractC2635vk.f9143a[(int) ((j >> (i4 << 3)) & 255)];
            int i7 = i + 1;
            bArr[i] = (byte) (i6 >> 8);
            i += 2;
            bArr[i7] = (byte) i6;
            if (i4 == i5) {
                return;
            } else {
                i4--;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public static float m1497s(String[] strArr, int i) {
        float f = Float.parseFloat(strArr[i]);
        if (f >= 0.0f && f <= 1.0f) {
            return f;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f);
    }

    /* JADX INFO: renamed from: t */
    public static C0477L3 m1498t(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        C0477L3 c0477l3M932b;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return new C0477L3(null, null, typedValue.data);
            }
            try {
                c0477l3M932b = C0477L3.m932b(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception unused) {
                c0477l3M932b = null;
            }
            if (c0477l3M932b != null) {
                return c0477l3M932b;
            }
        }
        return new C0477L3(null, null, 0);
    }

    /* JADX INFO: renamed from: u */
    public static ArrayList m1499u() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C0469Kw.f1524b);
        arrayList.add(C0781S7.f2467b);
        arrayList.add(C0180E7.f531b);
        arrayList.add(C0524M7.f1712b);
        arrayList.add(C1246c5.f4237b);
        arrayList.add(C1395f5.f4957b);
        arrayList.add(C0811Sv.f2565b);
        arrayList.add(C1133aF.f3583b);
        arrayList.add(C1240c.f4218b);
        arrayList.add(C0680Ps.f2178b);
        arrayList.add(C0555Mw.f1823b);
        arrayList.add(C1442g8.f5046b);
        arrayList.add(C2471rs.f8696b);
        arrayList.add(C0979Wr.f3063b);
        arrayList.add(C1123a5.f3536b);
        arrayList.add(C1343dy.f4836b);
        arrayList.add(C0812Sw.f2566b);
        arrayList.add(C1265ch.f4301b);
        arrayList.add(C0577Nb.f1872b);
        arrayList.add(C0395J7.f1333b);
        arrayList.add(C1055Yh.f3357b);
        arrayList.add(C1145ak.f3636b);
        return arrayList;
    }

    /* JADX INFO: renamed from: v */
    public static boolean m1500v(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* JADX INFO: renamed from: w */
    public static int m1501w(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        throw new IllegalArgumentException(AbstractC2374ph.m4812i(i, "type needs to be >= FIRST and <= LAST, type="));
    }

    /* JADX INFO: renamed from: x */
    public static boolean m1502x(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            return (i2 > i3 || rect.left >= i3) && rect.left > rect2.left;
        }
        if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            return (i4 > i5 || rect.top >= i5) && rect.top > rect2.top;
        }
        if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            return (i6 < i7 || rect.right <= i7) && rect.right < rect2.right;
        }
        if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i8 = rect.top;
        int i9 = rect2.top;
        return (i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom;
    }

    /* JADX INFO: renamed from: y */
    public static boolean m1503y(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    /* JADX INFO: renamed from: z */
    public static int m1504z(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else {
            if (i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i2 = rect2.top;
            i3 = rect.bottom;
        }
        return Math.max(0, i2 - i3);
    }
}
