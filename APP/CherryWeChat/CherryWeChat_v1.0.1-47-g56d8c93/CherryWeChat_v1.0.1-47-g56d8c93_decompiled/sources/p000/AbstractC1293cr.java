package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC1160i;
import io.github.cherrywechat.R;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: cr */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1293cr {

    /* JADX INFO: renamed from: a */
    public static final byte[] f4725a = new byte[0];

    /* JADX INFO: renamed from: b */
    public static final C0061Bb f4726b = new C0061Bb((Object) new C2438r1(8));

    /* JADX INFO: renamed from: c */
    public static final InterfaceC0126Cx[] f4727c = new InterfaceC0126Cx[0];

    /* JADX INFO: renamed from: d */
    public static final int[] f4728d = {R.attr.colorPrimary};

    /* JADX INFO: renamed from: e */
    public static final int[] f4729e = {R.attr.colorPrimaryVariant};

    public AbstractC1293cr() {
        new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: A */
    public static String m2530A(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    /* JADX INFO: renamed from: D */
    public static void m2531D(ViewGroup viewGroup) {
        Float fValueOf = Float.valueOf(32.0f);
        if (viewGroup != null) {
            viewGroup.setBackground(null);
            viewGroup.setTag(R.id.tag_view_bg_ban, Object.class);
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                m2531D((ViewGroup) childAt);
            } else {
                int i2 = 1;
                if (childAt instanceof TextView) {
                    TextView textView = (TextView) childAt;
                    HashMap map = AbstractC0999XA.f3193a;
                    int iM2889a = C1517hw.m2889a(-16777216, AbstractC0295Gu.m625r(-190314295851061L));
                    textView.setTag(R.id.tag_textview_color_ban, null);
                    textView.setTextColor(iM2889a);
                    textView.setTag(R.id.tag_textview_color_ban, TextView.class);
                } else if (childAt instanceof ImageView) {
                    ImageView imageView = (ImageView) childAt;
                    if (AbstractC0295Gu.m625r(-190413080098869L).equals(imageView.getContentDescription()) && imageView.getLayoutParams().width != 0) {
                        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                        layoutParams.width = 0;
                        layoutParams.height = 0;
                        Context context = imageView.getContext();
                        AbstractC0295Gu.m625r(-190443144869941L);
                        HashMap map2 = AbstractC0999XA.f3193a;
                        ImageView imageViewM2808t = C1456gf.m2808t(context, C1517hw.m2890b(AbstractC0295Gu.m625r(-191061620160565L)));
                        ViewParent parent = imageView.getParent();
                        AbstractC0295Gu.m625r(-191272073558069L);
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(fValueOf), AbstractC0295Gu.m616i(fValueOf));
                        layoutParams2.gravity = 16;
                        ((ViewGroup) parent).addView(imageViewM2808t, layoutParams2);
                        imageViewM2808t.setOnClickListener(new ViewOnClickListenerC1477h(i2, imageView));
                    }
                }
                if (childAt.getLayoutParams().width > AbstractC0295Gu.m616i(1)) {
                    childAt.setBackground(null);
                    childAt.setTag(R.id.tag_view_bg_ban, Object.class);
                }
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public static final void m2532E(C2341oz c2341oz, String str) {
        c2341oz.m4762l(c2341oz.f8216a - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw null;
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m2533F(C2341oz c2341oz) {
        m2532E(c2341oz, "object");
        throw null;
    }

    /* JADX INFO: renamed from: G */
    public static TypedArray m2534G(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m2547f(context, attributeSet, i, i2);
        m2549h(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0117 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:194:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX INFO: renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static InterfaceC0883Uh m2535N(XmlResourceParser xmlResourceParser, Resources resources) throws Exception {
        int next;
        int i;
        int i2;
        String str;
        String str2;
        ?? r3;
        long j;
        Throwable th;
        ?? r32;
        boolean zIsTerminated;
        boolean zIsTerminated2;
        do {
            next = xmlResourceParser.next();
            i = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            m2540U(xmlResourceParser);
            return null;
        }
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC0725Qu.f2311b);
        int i3 = 0;
        String string = typedArrayObtainAttributes.getString(0);
        String string2 = typedArrayObtainAttributes.getString(5);
        String string3 = typedArrayObtainAttributes.getString(6);
        String string4 = typedArrayObtainAttributes.getString(2);
        int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
        int i4 = 3;
        int integer = typedArrayObtainAttributes.getInteger(3, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(4, 500);
        String string5 = typedArrayObtainAttributes.getString(7);
        typedArrayObtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC0725Qu.f2312c);
                        int i5 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i6 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                        String string6 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                        int i7 = typedArrayObtainAttributes2.getInt(i6, 0);
                        int i8 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = typedArrayObtainAttributes2.getResourceId(i8, 0);
                        String string7 = typedArrayObtainAttributes2.getString(i8);
                        typedArrayObtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            m2540U(xmlResourceParser);
                        }
                        arrayList.add(new C0969Wh(i5, i7, resourceId2, string7, string6, z));
                    } else {
                        m2540U(xmlResourceParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new C0926Vh((C0969Wh[]) arrayList.toArray(new C0969Wh[0]));
        }
        List listM2536O = m2536O(resources, resourceId);
        ArrayList arrayList2 = new ArrayList();
        while (xmlResourceParser.next() != i4) {
            if (xmlResourceParser.getEventType() == i) {
                if (xmlResourceParser.getName().equals("fallback")) {
                    TypedArray typedArrayObtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC0725Qu.f2313d);
                    int i9 = integer;
                    try {
                        String string8 = typedArrayObtainAttributes3.getString(i3);
                        String string9 = typedArrayObtainAttributes3.getString(1);
                        String string10 = typedArrayObtainAttributes3.getString(i);
                        if (string8 == null) {
                            r3 = typedArrayObtainAttributes3;
                            j = 1;
                            throw new XmlPullParserException("query attribute must be set in fallback element");
                        }
                        while (xmlResourceParser.next() != 3) {
                            try {
                                m2540U(xmlResourceParser);
                            } catch (Throwable th2) {
                                th = th2;
                                r32 = typedArrayObtainAttributes3;
                                j = 1;
                            }
                        }
                        try {
                            r3 = typedArrayObtainAttributes3;
                            str2 = string4;
                            i2 = i9;
                            str = string3;
                            j = 1;
                            try {
                                C0583Nh c0583Nh = new C0583Nh(string, string2, string8, listM2536O, string9, string10);
                                if (r3 instanceof AutoCloseable) {
                                    ((AutoCloseable) r3).close();
                                } else if (r3 instanceof ExecutorService) {
                                    ExecutorService executorService = (ExecutorService) r3;
                                    if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated2 = executorService.isTerminated())) {
                                        executorService.shutdown();
                                        boolean z2 = false;
                                        while (!zIsTerminated2) {
                                            try {
                                                zIsTerminated2 = executorService.awaitTermination(1L, TimeUnit.DAYS);
                                            } catch (InterruptedException unused) {
                                                if (!z2) {
                                                    executorService.shutdownNow();
                                                    z2 = true;
                                                }
                                            }
                                        }
                                        if (z2) {
                                            Thread.currentThread().interrupt();
                                        }
                                    }
                                } else {
                                    r3.recycle();
                                }
                                arrayList2.add(c0583Nh);
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            r3 = typedArrayObtainAttributes3;
                            j = 1;
                            th = th;
                            r32 = r3;
                            if (r32 != 0) {
                            }
                        }
                        th = th3;
                    } catch (Throwable th5) {
                        th = th5;
                        r3 = typedArrayObtainAttributes3;
                    }
                    th = th;
                    r32 = r3;
                    if (r32 != 0) {
                        throw th;
                    }
                    try {
                        if (r32 instanceof AutoCloseable) {
                            ((AutoCloseable) r32).close();
                            throw th;
                        }
                        if (!(r32 instanceof ExecutorService)) {
                            r32.recycle();
                            throw th;
                        }
                        ExecutorService executorService2 = (ExecutorService) r32;
                        if (executorService2 == ForkJoinPool.commonPool() || (zIsTerminated = executorService2.isTerminated())) {
                            throw th;
                        }
                        executorService2.shutdown();
                        boolean z3 = false;
                        while (!zIsTerminated) {
                            try {
                                zIsTerminated = executorService2.awaitTermination(j, TimeUnit.DAYS);
                            } catch (InterruptedException unused2) {
                                if (!z3) {
                                    executorService2.shutdownNow();
                                    z3 = true;
                                }
                            }
                        }
                        if (!z3) {
                            throw th;
                        }
                        Thread.currentThread().interrupt();
                        throw th;
                    } catch (Throwable th6) {
                        th.addSuppressed(th6);
                        throw th;
                    }
                }
                i2 = integer;
                str = string3;
                str2 = string4;
                m2540U(xmlResourceParser);
                integer = i2;
                string3 = str;
                string4 = str2;
                i = 2;
                i3 = 0;
                i4 = 3;
            }
        }
        int i10 = integer;
        String str3 = string3;
        String str4 = string4;
        if (!arrayList2.isEmpty()) {
            return new C1012Xh(arrayList2, i10, integer2, string5);
        }
        if (str3 == null) {
            throw new IllegalArgumentException("The provider font XML requires query attribute or fallback children.");
        }
        arrayList2.add(new C0583Nh(string, string2, str3, listM2536O, null, null));
        if (str4 != null) {
            arrayList2.add(new C0583Nh(string, string2, str4, listM2536O, null, null));
        }
        return new C1012Xh(arrayList2, i10, integer2, string5);
    }

    /* JADX INFO: renamed from: O */
    public static List m2536O(Resources resources, int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
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

    /* JADX INFO: renamed from: P */
    public static TypedValue m2537P(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* JADX INFO: renamed from: Q */
    public static boolean m2538Q(Context context, int i, boolean z) {
        TypedValue typedValueM2537P = m2537P(context, i);
        return (typedValueM2537P == null || typedValueM2537P.type != 18) ? z : typedValueM2537P.data != 0;
    }

    /* JADX INFO: renamed from: R */
    public static TypedValue m2539R(Context context, int i, String str) {
        TypedValue typedValueM2537P = m2537P(context, i);
        if (typedValueM2537P != null) {
            return typedValueM2537P;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    /* JADX INFO: renamed from: U */
    public static void m2540U(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
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

    /* JADX INFO: renamed from: V */
    public static String m2541V(int i) {
        Object[] objArr = {Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Double.valueOf(((double) Color.alpha(i)) / 255.0d)};
        int i2 = AbstractC2665wD.f9229a;
        return String.format(Locale.US, "rgba(%d,%d,%d,%.3f)", objArr);
    }

    /* JADX INFO: renamed from: a */
    public static final C2723xm m2542a(InterfaceC0126Cx interfaceC0126Cx) {
        return new C2723xm("Value of type '" + interfaceC0126Cx.mo203b() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + interfaceC0126Cx.mo204c() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    /* JADX INFO: renamed from: b */
    public static final C2465rm m2543b(int i, CharSequence charSequence, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("\nJSON input: ");
        if (charSequence.length() >= 200) {
            if (i == -1) {
                int length = charSequence.length() - 60;
                if (length > 0) {
                    charSequence = "....." + charSequence.subSequence(length, charSequence.length()).toString();
                }
            } else {
                int i2 = i - 30;
                int i3 = i + 30;
                String str2 = i2 <= 0 ? "" : ".....";
                String str3 = i3 >= charSequence.length() ? "" : ".....";
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                if (i2 < 0) {
                    i2 = 0;
                }
                int length2 = charSequence.length();
                if (i3 > length2) {
                    i3 = length2;
                }
                sb2.append(charSequence.subSequence(i2, i3).toString());
                sb2.append(str3);
                charSequence = sb2.toString();
            }
        }
        sb.append((Object) charSequence);
        String string = sb.toString();
        if (i >= 0) {
            string = "Unexpected JSON token at offset " + i + ": " + string;
        }
        return new C2465rm(string);
    }

    /* JADX INFO: renamed from: c */
    public static final Set m2544c(InterfaceC0126Cx interfaceC0126Cx) {
        if (interfaceC0126Cx instanceof InterfaceC0050B6) {
            return ((InterfaceC0050B6) interfaceC0126Cx).mo89g();
        }
        HashSet hashSet = new HashSet(interfaceC0126Cx.mo205d());
        int iMo205d = interfaceC0126Cx.mo205d();
        for (int i = 0; i < iMo205d; i++) {
            hashSet.add(interfaceC0126Cx.mo206e(i));
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: d */
    public static void m2545d(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m2546e(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m2547f(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0939Vu.f2931E, i, i2);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m2550i(context, f4729e, "Theme.MaterialComponents");
            }
        }
        m2550i(context, f4728d, "Theme.AppCompat");
    }

    /* JADX INFO: renamed from: g */
    public static void m2548g(String str, Object obj) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m2549h(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0939Vu.f2931E, i, i2);
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

    /* JADX INFO: renamed from: i */
    public static void m2550i(Context context, int[] iArr, String str) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i)) {
                typedArrayObtainStyledAttributes.recycle();
                throw new IllegalArgumentException(AbstractC2374ph.m4814k("The style on this component requires your app theme to be ", str, " (or a descendant)."));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: l */
    public static final InterfaceC0126Cx[] m2551l(List list) {
        InterfaceC0126Cx[] interfaceC0126CxArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (interfaceC0126CxArr = (InterfaceC0126Cx[]) list.toArray(new InterfaceC0126Cx[0])) == null) ? f4727c : interfaceC0126CxArr;
    }

    /* JADX INFO: renamed from: m */
    public static int m2552m(C0038Av c0038Av, AbstractC2730xt abstractC2730xt, View view, View view2, AbstractC1160i abstractC1160i, boolean z) {
        if (abstractC1160i.getChildCount() == 0 || c0038Av.m58b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(abstractC1160i.getPosition(view) - abstractC1160i.getPosition(view2)) + 1;
        }
        return Math.min(abstractC2730xt.mo5261l(), abstractC2730xt.mo5251b(view2) - abstractC2730xt.mo5254e(view));
    }

    /* JADX INFO: renamed from: n */
    public static int m2553n(C0038Av c0038Av, AbstractC2730xt abstractC2730xt, View view, View view2, AbstractC1160i abstractC1160i, boolean z, boolean z2) {
        if (abstractC1160i.getChildCount() == 0 || c0038Av.m58b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (c0038Av.m58b() - Math.max(abstractC1160i.getPosition(view), abstractC1160i.getPosition(view2))) - 1) : Math.max(0, Math.min(abstractC1160i.getPosition(view), abstractC1160i.getPosition(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(abstractC2730xt.mo5251b(view2) - abstractC2730xt.mo5254e(view)) / (Math.abs(abstractC1160i.getPosition(view) - abstractC1160i.getPosition(view2)) + 1))) + (abstractC2730xt.mo5260k() - abstractC2730xt.mo5254e(view)));
        }
        return iMax;
    }

    /* JADX INFO: renamed from: o */
    public static int m2554o(C0038Av c0038Av, AbstractC2730xt abstractC2730xt, View view, View view2, AbstractC1160i abstractC1160i, boolean z) {
        if (abstractC1160i.getChildCount() == 0 || c0038Av.m58b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return c0038Av.m58b();
        }
        return (int) (((abstractC2730xt.mo5251b(view2) - abstractC2730xt.mo5254e(view)) / (Math.abs(abstractC1160i.getPosition(view) - abstractC1160i.getPosition(view2)) + 1)) * c0038Av.m58b());
    }

    /* JADX INFO: renamed from: p */
    public static final long m2555p(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        int i = inputStream.read(bArr);
        long j = 0;
        while (i >= 0) {
            outputStream.write(bArr, 0, i);
            j += (long) i;
            i = inputStream.read(bArr);
        }
        return j;
    }

    /* JADX INFO: renamed from: u */
    public static byte[] m2556u(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        for (int i = 0; i < 16; i++) {
            byte b = (byte) ((bArr[i] << 1) & 254);
            bArr2[i] = b;
            if (i < 15) {
                bArr2[i] = (byte) (((byte) ((bArr[i + 1] >> 7) & 1)) | b);
            }
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }

    /* JADX INFO: renamed from: v */
    public static final Object m2557v(long j, AbstractC0233Fb abstractC0233Fb) throws Throwable {
        EnumC1453gc enumC1453gc;
        InterfaceC1332dm interfaceC1332dm;
        Object objMo1014g;
        if (j > 0) {
            C0523M6 c0523m6 = new C0523M6(AbstractC0628Oj.m1225E(abstractC0233Fb));
            InterfaceC2100je interfaceC2100jeM1019m = c0523m6.m1019m();
            if (interfaceC2100jeM1019m != null && !(C0523M6.f1708g.get(c0523m6) instanceof InterfaceC0980Ws)) {
                interfaceC2100jeM1019m.mo1795a();
                C0523M6.f1709h.set(c0523m6, C0937Vs.f2926a);
            }
            InterfaceC1137ac interfaceC1137ac = c0523m6.f1711e;
            if (j < Long.MAX_VALUE) {
                InterfaceC1049Yb interfaceC1049YbMo24m = interfaceC1137ac.mo24m(C1456gf.f5158b);
                InterfaceC2413qd interfaceC2413qd = interfaceC1049YbMo24m instanceof InterfaceC2413qd ? (InterfaceC2413qd) interfaceC1049YbMo24m : null;
                if (interfaceC2413qd == null) {
                    interfaceC2413qd = AbstractC0707Qc.f2273a;
                }
                interfaceC2413qd.mo2668f(j, c0523m6);
            }
            boolean zM1020n = c0523m6.m1020n();
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C0523M6.f1707f;
            while (true) {
                int i = atomicIntegerFieldUpdater.get(c0523m6);
                int i2 = i >> 29;
                enumC1453gc = EnumC1453gc.f5148a;
                if (i2 != 0) {
                    if (i2 != 2) {
                        throw new IllegalStateException("Already suspended");
                    }
                    if (zM1020n) {
                        c0523m6.m1021p();
                    }
                    Object obj = C0523M6.f1708g.get(c0523m6);
                    if (obj instanceof C0189Ea) {
                        throw ((C0189Ea) obj).f575a;
                    }
                    int i3 = c0523m6.f5157c;
                    if ((i3 == 1 || i3 == 2) && (interfaceC1332dm = (InterfaceC1332dm) interfaceC1137ac.mo24m(C1456gf.f5162f)) != null && !interfaceC1332dm.mo1745d()) {
                        CancellationException cancellationExceptionMo1748p = interfaceC1332dm.mo1748p();
                        c0523m6.mo1010a(cancellationExceptionMo1748p);
                        throw cancellationExceptionMo1748p;
                    }
                    objMo1014g = c0523m6.mo1014g(obj);
                } else if (atomicIntegerFieldUpdater.compareAndSet(c0523m6, i, 536870912 + (536870911 & i))) {
                    if (((InterfaceC2100je) C0523M6.f1709h.get(c0523m6)) == null) {
                        c0523m6.m1019m();
                    }
                    if (zM1020n) {
                        c0523m6.m1021p();
                    }
                    objMo1014g = enumC1453gc;
                }
            }
            if (objMo1014g == enumC1453gc) {
                return objMo1014g;
            }
        }
        return C0829TC.f2620a;
    }

    /* JADX INFO: renamed from: x */
    public static final InterfaceC0502Lm m2558x(InterfaceC0126Cx interfaceC0126Cx) {
        if (interfaceC0126Cx instanceof C0169Dx) {
            return m2558x(((C0169Dx) interfaceC0126Cx).f450a);
        }
        return null;
    }

    /* JADX INFO: renamed from: y */
    public static Intent m2559y(AbstractActivityC1244c3 abstractActivityC1244c3) {
        Intent parentActivityIntent = abstractActivityC1244c3.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String strM2530A = m2530A(abstractActivityC1244c3, abstractActivityC1244c3.getComponentName());
            if (strM2530A == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(abstractActivityC1244c3, strM2530A);
            try {
                return m2530A(abstractActivityC1244c3, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: z */
    public static Intent m2560z(AbstractActivityC1244c3 abstractActivityC1244c3, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strM2530A = m2530A(abstractActivityC1244c3, componentName);
        if (strM2530A == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strM2530A);
        return m2530A(abstractActivityC1244c3, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    /* JADX INFO: renamed from: B */
    public int mo1385B(View view) {
        return 0;
    }

    /* JADX INFO: renamed from: C */
    public int mo2017C() {
        return 0;
    }

    /* JADX INFO: renamed from: H */
    public abstract void mo2561H(Throwable th);

    /* JADX INFO: renamed from: I */
    public abstract void mo2562I(C2428qs c2428qs);

    /* JADX INFO: renamed from: J */
    public void mo1386J(View view, int i) {
    }

    /* JADX INFO: renamed from: K */
    public abstract void mo1387K(int i);

    /* JADX INFO: renamed from: L */
    public abstract void mo1388L(View view, int i, int i2);

    /* JADX INFO: renamed from: M */
    public abstract void mo1389M(View view, float f, float f2);

    /* JADX INFO: renamed from: S */
    public abstract void mo1027S(boolean z);

    /* JADX INFO: renamed from: T */
    public abstract void mo1028T(boolean z);

    /* JADX INFO: renamed from: W */
    public abstract boolean mo1390W(View view, int i);

    /* JADX INFO: renamed from: j */
    public abstract int mo1391j(View view, int i);

    /* JADX INFO: renamed from: k */
    public abstract int mo1392k(View view, int i);

    /* JADX INFO: renamed from: q */
    public abstract Typeface mo1762q(Context context, C0926Vh c0926Vh, Resources resources, int i);

    /* JADX INFO: renamed from: r */
    public abstract Typeface mo1763r(Context context, C1098Zh[] c1098ZhArr, int i);

    /* JADX INFO: renamed from: s */
    public Typeface mo1831s(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    /* JADX INFO: renamed from: t */
    public Typeface mo1764t(Context context, Resources resources, int i, String str, int i2) {
        File fileM626s = AbstractC0295Gu.m626s(context);
        if (fileM626s == null) {
            return null;
        }
        try {
            if (AbstractC0295Gu.m614g(fileM626s, resources, i)) {
                return Typeface.createFromFile(fileM626s.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM626s.delete();
        }
    }

    /* JADX INFO: renamed from: w */
    public C1098Zh mo1832w(C1098Zh[] c1098ZhArr, int i) {
        new C1517hw(16);
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        C1098Zh c1098Zh = null;
        int i3 = Integer.MAX_VALUE;
        for (C1098Zh c1098Zh2 : c1098ZhArr) {
            int iAbs = (Math.abs(c1098Zh2.f3487c - i2) * 2) + (c1098Zh2.f3488d == z ? 0 : 1);
            if (c1098Zh == null || i3 > iAbs) {
                c1098Zh = c1098Zh2;
                i3 = iAbs;
            }
        }
        return c1098Zh;
    }
}
