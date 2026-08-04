package yyds;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.Display;
import androidx.fragment.app.FragmentActivity;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: yyds.ᛷᲀᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1633 implements InterfaceC1749 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static Boolean f8330;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public Object f8331;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public Object f8332;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public Object f8333;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public Object f8334;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public Object f8335;

    public C1633() {
        this.f8332 = C0805.f3693;
        this.f8335 = "GET";
        this.f8331 = new C2135(2);
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static void m3330(Activity activity, List list, C1155 c1155, C0805 c0805, RunnableC2282 runnableC2282) {
        char c;
        if (list.isEmpty()) {
            runnableC2282.run();
            return;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                c = 1;
                break;
            } else if (((AbstractC0333) it.next()).mo1012(activity) != 1) {
                c = 2;
                break;
            }
        }
        c0805.getClass();
        C0119 c0119 = new C0119(c0805, activity, list, runnableC2282);
        AbstractFragmentC1695 fragmentC0348 = c == 1 ? new FragmentC0348() : new FragmentC0651();
        int iM3675 = AbstractC1885.m3675(65535);
        Bundle bundle = new Bundle();
        bundle.putInt("request_code", iM3675);
        if (list instanceof ArrayList) {
            bundle.putParcelableArrayList("request_permissions", (ArrayList) list);
        } else {
            bundle.putParcelableArrayList("request_permissions", new ArrayList<>(list));
        }
        fragmentC0348.setArguments(bundle);
        fragmentC0348.setRetainInstance(true);
        fragmentC0348.mo1032().f1790 = true;
        fragmentC0348.mo1032().f1792 = c0119;
        FragmentManager fragmentManager = (FragmentManager) c1155.f5304;
        if (fragmentManager == null) {
            return;
        }
        fragmentManager.beginTransaction().add(fragmentC0348, fragmentC0348.toString()).commitAllowingStateLoss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e1  */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.reflect.Field] */
    /* JADX WARN: Type inference failed for: r0v73 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.List] */
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m3331(InterfaceC0017 interfaceC0017) {
        Throwable th;
        Activity activity;
        int rotation;
        int rotation2;
        List listMo1018;
        C0913 c0913M3476;
        C0913 c0913;
        ?? declaredField;
        Integer num;
        Context context = (Context) this.f8335;
        if (((C1586) this.f8331) == null) {
            this.f8331 = new C1586();
        }
        C0805 c0805 = (C0805) this.f8334;
        if (c0805 == null) {
            c0805 = new C0805(11);
            this.f8334 = c0805;
        }
        ArrayList<AbstractC0333> arrayList = new ArrayList((ArrayList) this.f8333);
        Context baseContext = context;
        do {
            th = null;
            if (baseContext instanceof Activity) {
                activity = (Activity) baseContext;
                break;
            } else if (!(baseContext instanceof ContextWrapper)) {
                break;
            } else {
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
        } while (baseContext != null);
        activity = null;
        Boolean boolValueOf = (Boolean) this.f8332;
        if (boolValueOf == null) {
            boolValueOf = f8330;
            if (boolValueOf == null) {
                boolValueOf = Boolean.valueOf((context.getApplicationInfo().flags & 2) != 0);
                f8330 = boolValueOf;
            }
            this.f8332 = boolValueOf;
        }
        if (boolValueOf.booleanValue()) {
            if (activity == null) {
                C0188.m798("The instance of the context must be an activity object");
                return;
            }
            if (activity.isFinishing()) {
                C0188.m800("The activity has been finishing, please manually determine the status of the activity");
                return;
            }
            if (activity.isDestroyed()) {
                C0188.m800("The activity has been destroyed, please manually determine the status of the activity");
                return;
            }
            String str = context.getApplicationInfo().sourceDir;
            AssetManager assets = context.getAssets();
            try {
                int i = context.getApplicationInfo().targetSdkVersion;
                num = (Integer) assets.getClass().getDeclaredMethod("addAssetPath", String.class).invoke(assets, str);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            }
            int iIntValue = num != null ? num.intValue() : 0;
            if (iIntValue == 0) {
                c0913 = null;
                if (!arrayList.isEmpty()) {
                    C0188.m798("The requested permission cannot be empty");
                    return;
                }
                for (AbstractC0333 abstractC0333 : arrayList) {
                    Class<?> cls = abstractC0333.getClass();
                    String name = cls.getName();
                    try {
                        declaredField = abstractC0333.getClass().getDeclaredField("CREATOR");
                    } catch (NoSuchFieldException e4) {
                        e4.printStackTrace();
                        declaredField = th;
                    }
                    if (declaredField == 0) {
                        C0188.m798("This permission class does not define the CREATOR field");
                        return;
                    }
                    try {
                        Object obj = declaredField.get(th);
                        Throwable th2 = th;
                        if (!(obj instanceof Parcelable.Creator)) {
                            C1693.m3440(AbstractC2104.m3998("The CREATOR field in this ", name, " is not of type "), Parcelable.Creator.class.getName());
                            return;
                        }
                        Type genericType = declaredField.getGenericType();
                        if (!(genericType instanceof ParameterizedType)) {
                            C0188.m798(AbstractC2104.m4014("The generic type defined for the CREATOR field in this ", name, " is empty"));
                            return;
                        }
                        Type[] actualTypeArguments = ((ParameterizedType) genericType).getActualTypeArguments();
                        if (actualTypeArguments.length != 1) {
                            C0188.m798(AbstractC2104.m4014("The number of generics defined in the CREATOR field of this ", name, " can only be one"));
                            return;
                        }
                        Type type = actualTypeArguments[0];
                        if (!(type instanceof Class) || !cls.isAssignableFrom((Class) type)) {
                            C0188.m798(AbstractC2104.m4014("The generic type defined in the CREATOR field of this ", name, " is incorrect"));
                            return;
                        }
                        if (((Parcelable.Creator) obj).newArray(0) == null) {
                            C0188.m798(AbstractC2104.m4014("The newArray method of the CREATOR field in this ", name, " returns an empty value. This method cannot return an empty value"));
                            return;
                        }
                        int iMo1023 = abstractC0333.mo1023(activity);
                        if (activity.getApplicationInfo().targetSdkVersion < iMo1023) {
                            throw new IllegalStateException("Request \"" + abstractC0333.mo1021() + "\" permission, The targetSdkVersion SDK must be " + iMo1023 + " or more, if you do not want to upgrade targetSdkVersion, please apply with the old permission");
                        }
                        if (c0913 != null) {
                            ArrayList arrayList2 = (ArrayList) c0913.f4165;
                            abstractC0333.mo1017(activity, arrayList, c0913, arrayList2, AbstractC0333.m1010(abstractC0333.mo1021(), arrayList2));
                        }
                        abstractC0333.mo1022(activity, arrayList);
                        th = th2;
                    } catch (Exception unused) {
                        C0188.m798(AbstractC2104.m4014("The CREATOR field in the ", name, " has an access exception. Please modify CREATOR field with \"public static final\""));
                        return;
                    }
                }
            } else {
                try {
                    c0913M3476 = AbstractC1741.m3476(context, iIntValue);
                    try {
                    } catch (IOException | XmlPullParserException e5) {
                        e = e5;
                        e.printStackTrace();
                    }
                } catch (IOException | XmlPullParserException e6) {
                    e = e6;
                    c0913M3476 = null;
                }
                if (AbstractC0879.m1958(context.getPackageName(), (String) c0913M3476.f4163)) {
                    c0913 = c0913M3476;
                }
                if (!arrayList.isEmpty()) {
                }
            }
        }
        Throwable th3 = th;
        if (AbstractC0879.m1968(activity)) {
            return;
        }
        synchronized (AbstractC1917.class) {
            int i2 = -1;
            while (true) {
                i2++;
                if (i2 >= arrayList.size()) {
                    break;
                }
                AbstractC0333 abstractC03332 = (AbstractC0333) arrayList.get(i2);
                if (Build.VERSION.SDK_INT < abstractC03332.mo1015() && (listMo1018 = abstractC03332.mo1018()) != null) {
                    ArrayList<AbstractC0333> arrayList3 = (ArrayList) listMo1018;
                    if (!arrayList3.isEmpty()) {
                        for (AbstractC0333 abstractC03333 : arrayList3) {
                            if (!AbstractC0879.m1970(arrayList, abstractC03333)) {
                                i2++;
                                arrayList.add(i2, abstractC03333);
                            }
                        }
                    }
                }
            }
        }
        if (AbstractC1917.m3701(context, arrayList)) {
            interfaceC0017.mo611(new ArrayList());
            return;
        }
        if (activity instanceof FragmentActivity) {
            throw th3;
        }
        C1155 c1155 = new C1155(activity, activity.getFragmentManager());
        C1633 c1633 = new C1633();
        c1633.f8333 = activity;
        c1633.f8335 = arrayList;
        c1633.f8331 = c1155;
        c1633.f8334 = c0805;
        c1633.f8332 = interfaceC0017;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList4 = new ArrayList(arrayList.size());
        ArrayList arrayList5 = new ArrayList(arrayList.size());
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            AbstractC0333 abstractC03334 = (AbstractC0333) arrayList.get(i3);
            if (!AbstractC0879.m1970(arrayList5, abstractC03334)) {
                arrayList5.add(abstractC03334);
                if (abstractC03334.mo1016(activity) && !abstractC03334.mo1020(activity, true)) {
                    if (abstractC03334.mo1012(activity) == 2) {
                        arrayList4.add(AbstractC0879.m1963(abstractC03334));
                    } else {
                        String strMo1014 = abstractC03334.mo1014();
                        if (TextUtils.isEmpty(strMo1014)) {
                            arrayList4.add(AbstractC0879.m1963(abstractC03334));
                        } else {
                            int i4 = i3;
                            ?? arrayList6 = th3;
                            while (i4 < arrayList.size()) {
                                AbstractC0333 abstractC03335 = (AbstractC0333) arrayList.get(i4);
                                if (AbstractC0879.m1959(abstractC03335.mo1014(), strMo1014) && abstractC03335.mo1016(activity)) {
                                    arrayList6 = arrayList6;
                                    if (!abstractC03335.mo1020(activity, true)) {
                                        if (arrayList6 == 0) {
                                            arrayList6 = new ArrayList();
                                        }
                                        arrayList6.add(abstractC03335);
                                        if (!AbstractC0879.m1970(arrayList5, abstractC03335)) {
                                            arrayList5.add(abstractC03335);
                                        }
                                    }
                                }
                                i4++;
                                arrayList6 = arrayList6;
                            }
                            if (arrayList6 != 0 && !arrayList6.isEmpty() && !AbstractC1917.m3701(activity, arrayList6)) {
                                Iterator it = arrayList6.iterator();
                                while (it.hasNext()) {
                                    ((AbstractC0333) it.next()).getClass();
                                }
                                if (!arrayList6.isEmpty()) {
                                    arrayList4.add(arrayList6);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arrayList4.isEmpty()) {
            c1633.m3332();
            return;
        }
        Iterator it2 = arrayList4.iterator();
        ?? r10 = th3;
        while (it2.hasNext() && (r10 == 0 || r10.isEmpty())) {
            r10 = (List) it2.next();
        }
        if (r10 == 0 || r10.isEmpty()) {
            c1633.m3332();
            return;
        }
        Activity activity2 = (Activity) c1633.f8333;
        C1155 c11552 = (C1155) c1633.f8331;
        C0805 c08052 = (C0805) c1633.f8334;
        HashMap map = AbstractC0492.f2415;
        synchronized (AbstractC0492.class) {
            try {
            } catch (IllegalStateException e7) {
                e7.printStackTrace();
            } finally {
            }
            if (activity2.getRequestedOrientation() == -1) {
                int i5 = activity2.getResources().getConfiguration().orientation;
                if (i5 == 1) {
                    Display display = activity2.getDisplay();
                    if (display != null && ((rotation = display.getRotation()) == 2 || rotation == 3)) {
                        i = 1;
                    }
                    i = i != 0 ? 9 : 1;
                    activity2.setRequestedOrientation(i);
                    AbstractC0492.f2415.put(Integer.valueOf(activity2.hashCode()), Integer.valueOf(i));
                } else if (i5 == 2) {
                    Display display2 = activity2.getDisplay();
                    if (display2 == null || ((rotation2 = display2.getRotation()) != 2 && rotation2 != 3)) {
                        i = 0;
                    }
                    i = i != 0 ? 8 : 0;
                    activity2.setRequestedOrientation(i);
                    AbstractC0492.f2415.put(Integer.valueOf(activity2.hashCode()), Integer.valueOf(i));
                }
            }
        }
        m3330(activity2, r10, c11552, c08052, new RunnableC2282(c1633, it2, activity2, c11552, c08052));
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public void m3332() {
        final Activity activity = (Activity) this.f8333;
        ArrayList<AbstractC0333> arrayList = (ArrayList) this.f8335;
        if (AbstractC0879.m1968(activity)) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (AbstractC0333 abstractC0333 : arrayList) {
            if (abstractC0333.mo1020(activity, false)) {
                arrayList2.add(abstractC0333);
            } else {
                arrayList3.add(abstractC0333);
            }
        }
        ((InterfaceC0017) this.f8332).mo611(arrayList3);
        final int i = 1;
        AbstractC1143.f5238.postDelayed(new Runnable() { // from class: yyds.ᛶᛱᲇᲁ
            @Override // java.lang.Runnable
            public final void run() {
                Pair pairM4868;
                int i2 = i;
                Activity activity2 = activity;
                switch (i2) {
                    case 0:
                        C2743.f13455.getClass();
                        if (!C2743.f13453 && !activity2.isFinishing() && !activity2.isDestroyed()) {
                            int i3 = 0;
                            try {
                                Object systemService = activity2.getSystemService(AbstractC2328.m4341(-980720995173230L));
                                ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
                                if (clipboardManager != null && (pairM4868 = C2743.m4868(activity2, clipboardManager)) != null) {
                                    C0482 c0482 = (C0482) pairM4868.component1();
                                    String str = (String) pairM4868.component2();
                                    if (!AbstractC1544.m3188(AbstractC0027.m3913().getString(AbstractC2328.m4341(-980763944846190L), AbstractC2328.m4341(-980901383799662L)), str)) {
                                        AbstractC0027.m3913().putString(AbstractC2328.m4341(-980905678766958L), str);
                                        C2743.f13453 = true;
                                        String str2 = c0482.f2399;
                                        String strM4341 = str2.equals(AbstractC2328.m4341(-981043117720430L)) ? AbstractC2328.m4341(-981068887524206L) : str2.equals(AbstractC2328.m4341(-981081772426094L)) ? AbstractC2328.m4341(-981103247262574L) : AbstractC2328.m4341(-981116132164462L);
                                        AbstractC2328.m4341(-191301711201134L);
                                        AbstractC2328.m4341(-191306006168430L);
                                        AbstractC2328.m4341(-191310301135726L);
                                        String strM43412 = AbstractC2328.m4341(-191314596103022L);
                                        AbstractC2328.m4341(-191318891070318L);
                                        String str3 = AbstractC2328.m4341(-981129017066350L) + strM4341 + AbstractC2328.m4341(-981141901968238L);
                                        AbstractC2328.m4341(-191323186037614L);
                                        String str4 = AbstractC2328.m4341(-981154786870126L) + strM4341 + AbstractC2328.m4341(-981197736543086L);
                                        AbstractC2328.m4341(-191331775972206L);
                                        String strM43413 = AbstractC2328.m4341(-981227801314158L);
                                        AbstractC2328.m4341(-191434855187310L);
                                        String strM43414 = AbstractC2328.m4341(-981240686216046L);
                                        C1524 c1524 = new C1524(c0482, 6, activity2);
                                        AbstractC2328.m4341(-191348955841390L);
                                        DialogC1378 dialogC1378 = new DialogC1378(activity2, new C1343(str3, str4, strM43414, strM43412, strM43413, null, c1524, true));
                                        dialogC1378.setOnDismissListener(new DialogInterfaceOnDismissListenerC1709(i3));
                                        dialogC1378.show();
                                    }
                                }
                            } catch (Exception e) {
                                C2743.f13453 = false;
                                C2336.f11496.m4355(AbstractC2328.m4341(-981253571117934L), e);
                                return;
                            }
                            break;
                        }
                        break;
                    default:
                        AbstractC0492.m1346(activity2);
                        break;
                }
            }
        }, 100L);
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public void m3333(String str, String str2) {
        ((C2135) this.f8331).m4070(str, str2);
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public void m3334(String str) {
        String strConcat = str.regionMatches(true, 0, "ws:", 0, 3) ? "http:".concat(str.substring(3)) : str.regionMatches(true, 0, "wss:", 0, 4) ? "https:".concat(str.substring(4)) : str;
        C0074 c0074 = new C0074();
        c0074.m465(null, strConcat);
        this.f8333 = c0074.m462();
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public void m3335(String str, AbstractC0659 abstractC0659) {
        if (str.length() <= 0) {
            C0188.m798("method.isEmpty() == true");
            return;
        }
        if (abstractC0659 == null) {
            if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("QUERY") || str.equals("REPORT")) {
                C0188.m806(AbstractC2104.m4014("method ", str, " must have a request body."));
                return;
            }
        } else if (!AbstractC0598.m1479(str)) {
            C0188.m806(AbstractC2104.m4014("method ", str, " must not have a request body."));
            return;
        }
        this.f8335 = str;
        this.f8334 = abstractC0659;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public void m3336(String str) {
        ((C2135) this.f8331).m4074(str);
    }

    public C1633(Context context) {
        this.f8333 = new ArrayList();
        this.f8335 = context;
    }
}
