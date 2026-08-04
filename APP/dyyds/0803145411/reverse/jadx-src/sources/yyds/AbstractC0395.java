package yyds;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: yyds.ᛲᛷᛵᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0395 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final C0415 f2033;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final C0415 f2034;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final C0415 f2035;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final C0415 f2037;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final C0415 f2039;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final C2631 f2038 = new C2631(false);

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static final C2631 f2036 = new C2631(true);

    static {
        int i = 1;
        f2034 = new C0415("COMPLETING_ALREADY", i);
        f2035 = new C0415("COMPLETING_WAITING_CHILDREN", i);
        f2037 = new C0415("COMPLETING_RETRY", i);
        f2039 = new C0415("TOO_LATE_TO_CANCEL", i);
        f2033 = new C0415("SEALED", i);
    }

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public static final void m1130(Set set, C0901 c0901) {
        boolean zContains = set.contains(c0901.f4109.f7320);
        c0901.f4110.setVisibility(0);
        for (C0889 c0889 : c0901.f4111) {
            c0889.f4072.setVisibility(!zContains ? c0889.f4073 : 8);
        }
        c0901.f4109.f7322.setRotation(!zContains ? 90.0f : 0.0f);
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static EnumC0940 m1131(String str) throws IOException {
        if (str.equals("http/1.0")) {
            return EnumC0940.HTTP_1_0;
        }
        if (str.equals("http/1.1")) {
            return EnumC0940.HTTP_1_1;
        }
        if (str.equals("h2_prior_knowledge")) {
            return EnumC0940.H2_PRIOR_KNOWLEDGE;
        }
        if (str.equals("h2")) {
            return EnumC0940.HTTP_2;
        }
        if (str.equals("spdy/3.1")) {
            return EnumC0940.SPDY_3;
        }
        if (str.equals("quic")) {
            return EnumC0940.QUIC;
        }
        if (str.startsWith("h3")) {
            return EnumC0940.HTTP_3;
        }
        C0188.m804("Unexpected protocol: ".concat(str));
        return null;
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static int m1132(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        try {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            ColorStateList colorStateListM4942 = resourceId != 0 ? C2810.m4942(context, resourceId) : typedArrayObtainStyledAttributes.getColorStateList(0);
            if (colorStateListM4942 != null) {
                return colorStateListM4942.getDefaultColor();
            }
            return 0;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static Set m1133(Object obj) {
        if ((obj instanceof InterfaceC0527) && !(obj instanceof InterfaceC1750)) {
            m1141(obj, "kotlin.collections.MutableSet");
            throw null;
        }
        try {
            return (Set) obj;
        } catch (ClassCastException e) {
            AbstractC1544.m3195(e, AbstractC0395.class.getName());
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public static final void m1134(View view, StringBuilder sb) {
        String string;
        String string2;
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            CharSequence text = textView.getText();
            if (text != null && (string2 = text.toString()) != null) {
                if (AbstractC0473.m1313(string2)) {
                    string2 = null;
                }
                if (string2 != null) {
                    sb.append(string2);
                    sb.append(' ');
                }
            }
            CharSequence hint = textView.getHint();
            if (hint != null && (string = hint.toString()) != null) {
                String str = AbstractC0473.m1313(string) ? null : string;
                if (str != null) {
                    sb.append(str);
                    sb.append(' ');
                }
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                AbstractC2328.m4341(-119820570493806L);
                m1134(childAt, sb);
            }
        }
    }

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public static boolean m1135(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static void m1136(Object obj) {
        if (obj == null || m1139(2, obj)) {
            return;
        }
        m1141(obj, "kotlin.jvm.functions.Function2");
        throw null;
    }

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public static final Object m1137(Object obj) {
        C2455 c2455 = obj instanceof C2455 ? (C2455) obj : null;
        return c2455 != null ? c2455.f12094 : obj;
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static C2183 m1138(C0944 c0944, int i, ArrayList arrayList, C2183 c2183) {
        int i2;
        int i3 = i == 0 ? c0944.f4397 : c0944.f4372;
        if (i3 != -1 && (c2183 == null || i3 != c2183.f10736)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                C2183 c21832 = (C2183) arrayList.get(i4);
                if (c21832.f10736 == i3) {
                    if (c2183 != null) {
                        c2183.m4174(i, c21832);
                        arrayList.remove(c2183);
                    }
                    c2183 = c21832;
                } else {
                    i4++;
                }
            }
        } else if (i3 != -1) {
            return c2183;
        }
        if (c2183 == null) {
            if (c0944 instanceof C0411) {
                C0411 c0411 = (C0411) c0944;
                int i5 = 0;
                while (true) {
                    if (i5 >= c0411.f2142) {
                        i2 = -1;
                        break;
                    }
                    C0944 c09442 = c0411.f2143[i5];
                    if ((i == 0 && (i2 = c09442.f4397) != -1) || (i == 1 && (i2 = c09442.f4372) != -1)) {
                        break;
                    }
                    i5++;
                }
                if (i2 != -1) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= arrayList.size()) {
                            break;
                        }
                        C2183 c21833 = (C2183) arrayList.get(i6);
                        if (c21833.f10736 == i2) {
                            c2183 = c21833;
                            break;
                        }
                        i6++;
                    }
                }
            }
            if (c2183 == null) {
                c2183 = new C2183();
                c2183.f10735 = new ArrayList();
                c2183.f10738 = null;
                c2183.f10734 = -1;
                int i7 = C2183.f10733;
                C2183.f10733 = i7 + 1;
                c2183.f10736 = i7;
                c2183.f10737 = i;
            }
            arrayList.add(c2183);
        }
        ArrayList arrayList2 = c2183.f10735;
        if (arrayList2.contains(c0944)) {
            return c2183;
        }
        arrayList2.add(c0944);
        if (c0944 instanceof C2076) {
            C2076 c2076 = (C2076) c0944;
            c2076.f10260.m4084(c2076.f10262 == 0 ? 1 : 0, arrayList, c2183);
        }
        int i8 = c2183.f10736;
        if (i == 0) {
            c0944.f4397 = i8;
            c0944.f4382.m4084(i, arrayList, c2183);
            c0944.f4344.m4084(i, arrayList, c2183);
        } else {
            c0944.f4372 = i8;
            c0944.f4403.m4084(i, arrayList, c2183);
            c0944.f4385.m4084(i, arrayList, c2183);
            c0944.f4341.m4084(i, arrayList, c2183);
        }
        c0944.f4352.m4084(i, arrayList, c2183);
        return c2183;
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public static boolean m1139(int i, Object obj) {
        if (obj instanceof InterfaceC0557) {
            if ((obj instanceof InterfaceC0890 ? ((InterfaceC0890) obj).mo483() : obj instanceof InterfaceC2266 ? 0 : obj instanceof InterfaceC1549 ? 1 : obj instanceof InterfaceC0477 ? 2 : obj instanceof InterfaceC0295 ? 3 : obj instanceof InterfaceC1540 ? 4 : -1) == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static final C1853 m1140(InterfaceC0274 interfaceC0274) {
        Unsafe unsafe;
        C1853 c1853;
        C1853 c18532;
        if (!(interfaceC0274 instanceof C1118)) {
            return new C1853(1, interfaceC0274);
        }
        C1118 c1118 = (C1118) interfaceC0274;
        C0415 c0415 = AbstractC0427.f2178;
        long j = C1118.f5136;
        loop0: while (true) {
            unsafe = AbstractC2112.f10448;
            Object objectVolatile = unsafe.getObjectVolatile(c1118, j);
            c1853 = null;
            if (objectVolatile == null) {
                unsafe.putObjectVolatile(c1118, j, c0415);
                c18532 = null;
                break;
            }
            if (objectVolatile instanceof C1853) {
                do {
                    unsafe = AbstractC2112.f10448;
                    if (unsafe.compareAndSwapObject(c1118, C1118.f5136, objectVolatile, c0415)) {
                        c18532 = (C1853) objectVolatile;
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(c1118, j) == objectVolatile);
            } else if (objectVolatile != c0415 && !(objectVolatile instanceof Throwable)) {
                C0188.m791(objectVolatile, "Inconsistent state ");
                return null;
            }
        }
        if (c18532 != null) {
            long j2 = C1853.f9325;
            Object objectVolatile2 = unsafe.getObjectVolatile(c18532, j2);
            if (!(objectVolatile2 instanceof C0697) || ((C0697) objectVolatile2).f3295 == null) {
                unsafe.putIntVolatile(c18532, C1853.f9323, 536870911);
                unsafe.putObjectVolatile(c18532, j2, C2583.f12732);
                c1853 = c18532;
            } else {
                c18532.m3623();
            }
            if (c1853 != null) {
                return c1853;
            }
        }
        return new C1853(2, interfaceC0274);
    }

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public static void m1141(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(AbstractC2104.m4014(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        AbstractC1544.m3195(classCastException, AbstractC0395.class.getName());
        throw classCastException;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static C0991 m1142(Context context) {
        ProviderInfo providerInfo;
        C1396 c1396;
        ApplicationInfo applicationInfo;
        PackageManager packageManager = context.getPackageManager();
        AbstractC2217.m4200(packageManager, "Package manager required to locate emoji font provider");
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
            c1396 = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArr = packageManager.getPackageInfo(str2, 64).signatures;
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArr) {
                    arrayList.add(signature.toByteArray());
                }
                c1396 = new C1396(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList), null, null);
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
                c1396 = null;
            }
        }
        if (c1396 == null) {
            return null;
        }
        return new C0991(new C1903(context, c1396));
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public abstract void mo1143(C1037 c1037, Thread thread);

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public abstract boolean mo1144(AbstractFutureC2622 abstractFutureC2622, C1037 c1037, C1037 c10372);

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public abstract void mo1145(C1037 c1037, C1037 c10372);

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public abstract boolean mo1146(AbstractFutureC2622 abstractFutureC2622, C1336 c1336);

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public abstract boolean mo1147(AbstractFutureC2622 abstractFutureC2622, Object obj, Object obj2);
}
