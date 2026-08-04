package yyds;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.NativeUtil;
import com.android.app.CustomRecyclerView;
import com.bumptech.glide.ComponentCallbacks2C0040;
import com.p000ss.android.ugc.awemes.MainActivity;
import com.ss.android.ugc.aweme.profile.model.User;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: renamed from: yyds.ᲀᛵᛱᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2001 implements InterfaceC1549 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ Object f10013;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f10014;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ Object f10015;

    public /* synthetic */ C2001(View view, Context context, C0246 c0246) {
        this.f10014 = 14;
        this.f10015 = view;
        this.f10013 = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object m3876(Object obj) {
        String strM4341;
        C0172 c0172 = (C0172) this.f10015;
        C1127 c1127 = (C1127) this.f10013;
        AbstractC2328.m4341(-133920948126574L);
        Object objM3281 = AbstractC1595.m3281((List) obj);
        c0172.f997 = objM3281;
        C1132 c1132 = (C1132) objM3281;
        TextView textView = c1127.f5191;
        ImageView imageView = (ImageView) c1127.f5192;
        if (c1132 == null || (strM4341 = c1132.m2318()) == null) {
            strM4341 = AbstractC2328.m4341(-133959602832238L);
        } else {
            if (AbstractC0473.m1313(strM4341)) {
                strM4341 = c1132.m2320();
            }
            if (strM4341 == null) {
            }
        }
        textView.setText(strM4341);
        String strM2317 = c1132 != null ? c1132.m2317() : null;
        if (strM2317 == null) {
            strM2317 = AbstractC2328.m4341(-134006847472494L);
        }
        imageView.setVisibility(AbstractC0473.m1313(strM2317) ? 8 : 0);
        if (AbstractC0473.m1313(strM2317)) {
            ComponentCallbacks2C2272 componentCallbacks2C2272M248 = ComponentCallbacks2C0040.m248(imageView);
            componentCallbacks2C2272M248.getClass();
            componentCallbacks2C2272M248.m4281(new C1141(imageView));
            imageView.setImageDrawable(null);
        } else {
            ComponentCallbacks2C0040.m248(imageView).m4277(strM2317).m1283(imageView);
        }
        return C2746.f13459;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    private final Object m3877(Object obj) {
        String strM4000;
        View view = (View) this.f10015;
        Context context = (Context) this.f10013;
        Integer num = (Integer) obj;
        if (num != null) {
            C1509 c1509 = C1509.f7142;
            int iIntValue = num.intValue();
            if (Color.alpha(iIntValue) == 255) {
                strM4000 = AbstractC2104.m4000(new Object[]{Integer.valueOf(iIntValue & 16777215)}, 1, AbstractC2328.m4341(-103748802872174L), -103774572675950L);
            } else {
                strM4000 = AbstractC2104.m4000(new Object[]{Long.valueOf(((long) iIntValue) & 4294967295L)}, 1, AbstractC2328.m4341(-103826112283502L), -103851882087278L);
            }
            c1509.getClass();
            AbstractC2328.m4341(-27530313237358L);
            C1509.f7261.m1581(C1509.f7179[162], strM4000);
            C0246.m892(context, view);
            AbstractC1960.m3789(AbstractC2328.m4341(-118025274164078L));
        }
        return C2746.f13459;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    private final Object m3878(Object obj) {
        Object c2658;
        Object objValueOf;
        Object objInvoke;
        Object c26582;
        Field field = (Field) this.f10015;
        Method method = (Method) this.f10013;
        C0488 c0488 = (C0488) obj;
        AbstractC2328.m4341(-906473895527278L);
        ArrayList arrayList = c0488.f2406;
        if (!AbstractC1544.m3188(c0488.f2407, Boolean.TRUE)) {
            Object objM3276 = AbstractC1595.m3276(0, arrayList);
            User user = objM3276 instanceof User ? (User) objM3276 : null;
            if (user != null) {
                Object objM32762 = AbstractC1595.m3276(1, arrayList);
                Boolean bool = objM32762 instanceof Boolean ? (Boolean) objM32762 : null;
                if (bool != null) {
                    boolean zBooleanValue = bool.booleanValue();
                    if (field != null) {
                        try {
                            objValueOf = Integer.valueOf(field.getInt(user));
                        } catch (Throwable th) {
                            c2658 = new C2658(th);
                        }
                    } else {
                        objValueOf = null;
                    }
                    c2658 = objValueOf;
                    if (c2658 instanceof C2658) {
                        c2658 = null;
                    }
                    Integer num = (Integer) c2658;
                    if (num != null) {
                        int iIntValue = num.intValue();
                        if (method != null) {
                            try {
                                objInvoke = method.invoke(null, user);
                            } catch (Throwable th2) {
                                c26582 = new C2658(th2);
                            }
                        } else {
                            objInvoke = null;
                        }
                        c26582 = objInvoke instanceof Boolean ? (Boolean) objInvoke : null;
                        Boolean bool2 = (Boolean) (c26582 instanceof C2658 ? null : c26582);
                        if (bool2 != null) {
                            boolean zBooleanValue2 = bool2.booleanValue();
                            if (!zBooleanValue && iIntValue > 0 && !zBooleanValue2) {
                                c0488.f2407 = Boolean.TRUE;
                            }
                        }
                    }
                }
            }
        }
        return C2746.f13459;
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    private final Object m3879(Object obj) {
        String strM4341;
        Method method = (Method) this.f10015;
        C0757 c0757 = (C0757) this.f10013;
        C1829 c1829 = (C1829) obj;
        AbstractC2328.m4341(-972010801496942L);
        ArrayList arrayList = c1829.f9185;
        C2336.f11496.m4357(AbstractC2328.m4341(-972066636071790L) + c1829.f9184);
        C1509.f7142.getClass();
        Set set = (Set) C1509.f7177.m1579(C1509.f7179[102]);
        if (!set.isEmpty()) {
            Object obj2 = arrayList.get(0);
            AbstractC2328.m4341(-972113880712046L);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : (List) obj2) {
                int i = AbstractC2293.f11258;
                C0802 c0802M3893 = AbstractC0476.m1327(obj3).m3893();
                c0802M3893.f3681 = method.getDeclaringClass().getSuperclass().getName();
                Object objM3209 = ((C1558) AbstractC1595.m3280(c0802M3893.mo736())).m3209();
                if (objM3209 != null) {
                    C1189 c1189M3892 = AbstractC0476.m1327(objM3209).m3892();
                    c1189M3892.f12003 = method.getName();
                    c1189M3892.m4478();
                    String str = (String) ((C0536) AbstractC1595.m3280(c1189M3892.mo736())).m1376(new Object[0]);
                    try {
                        C1189 c1189M38922 = AbstractC0476.m1327(objM3209).m3892();
                        c1189M38922.f12003 = c0757.f3503;
                        c1189M38922.m4478();
                        strM4341 = (String) ((C0536) AbstractC1595.m3280(c1189M38922.mo736())).m1376(new Object[0]);
                    } catch (Exception unused) {
                        strM4341 = AbstractC2328.m4341(-972427413324654L);
                    }
                    if (!AbstractC1595.m3286(set, str)) {
                        arrayList2.add(obj3);
                    }
                    C1509.f7142.getClass();
                    if (C1509.m3054()) {
                        C2336.f11496.m4354(AbstractC2328.m4341(-972431708291950L) + obj3.getClass().getName() + ' ' + objM3209 + ' ' + str + ' ' + strM4341);
                    }
                    if (str != null && !AbstractC0473.m1313(str) && strM4341 != null && !AbstractC0473.m1313(strM4341)) {
                        AbstractC1142.f5236.put(str, strM4341);
                    }
                }
            }
            arrayList.set(0, arrayList2);
            boolean z = AbstractC0606.f2913;
            AbstractC0606.f2917 = !arrayList2.isEmpty();
            LinkedHashMap linkedHashMap = AbstractC1142.f5236;
            try {
                AbstractC0027.m3912().putString(AbstractC2328.m4341(-783938478572398L), AbstractC2797.m4923().m515(AbstractC1142.f5236));
            } catch (Exception e) {
                C2336.f11496.m4355(AbstractC2328.m4341(-783990018179950L), e);
            }
        }
        return C2746.f13459;
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    private final Object m3880(Object obj) {
        Object objM3281;
        Object c2658;
        C0494 c0494 = (C0494) this.f10015;
        C2390 c2390 = (C2390) this.f10013;
        C1829 c1829 = (C1829) obj;
        AbstractC2328.m4341(-939107057042286L);
        C1509.f7142.getClass();
        int iM3047 = C1509.m3047();
        C2746 c2746 = C2746.f13459;
        if (iM3047 == 1 && (objM3281 = AbstractC1595.m3281(c1829.f9185)) != null) {
            try {
                C2150.f10601.getClass();
                Pair pairM4094 = C2150.m4094(objM3281, c0494, c2390);
                if (pairM4094 != null) {
                    String str = (String) pairM4094.component1();
                    Object objComponent2 = pairM4094.component2();
                    if (!C2150.m4102(objM3281, objComponent2, c2390)) {
                        throw new IllegalStateException(AbstractC2328.m4341(-939180071486318L).concat(objM3281.getClass().getName()).toString());
                    }
                    C2150.m4096(objComponent2, str);
                }
                c2658 = c2746;
            } catch (Throwable th) {
                c2658 = new C2658(th);
            }
            Throwable thM4249 = C2248.m4249(c2658);
            if (thM4249 != null) {
                C2336.f11496.m4355(AbstractC2328.m4341(-939291740636014L).concat(objM3281.getClass().getName()), thM4249);
            }
        }
        return c2746;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    private final Object m3881(Object obj) {
        Class<?> declaringClass;
        Object next;
        Object c2658;
        ThreadLocal threadLocal = (ThreadLocal) this.f10015;
        Method method = (Method) this.f10013;
        C1829 c1829 = (C1829) obj;
        AbstractC2328.m4341(-904914822398830L);
        threadLocal.remove();
        C0813 c0813 = C0813.f3738;
        LinkedHashSet linkedHashSetM3095 = C1509.m3095(C1509.f7142);
        c0813.getClass();
        C0919 c0919M1876 = C0813.m1876(linkedHashSetM3095);
        if (!c0919M1876.m2037() && method != null && (declaringClass = method.getDeclaringClass()) != null) {
            Iterator it = c1829.f9185.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (declaringClass.isInstance(next)) {
                    break;
                }
            }
            if (next != null) {
                try {
                    Object objInvoke = method.invoke(next, null);
                    c2658 = objInvoke instanceof Uri ? (Uri) objInvoke : null;
                } catch (Throwable th) {
                    c2658 = new C2658(th);
                }
                Object obj2 = c2658 instanceof C2658 ? null : c2658;
                C0813.f3738.getClass();
                if (C0813.m1879((Uri) obj2)) {
                    threadLocal.set(new C2180(next, c0919M1876));
                }
            }
        }
        return C2746.f13459;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // yyds.InterfaceC1549
    /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
    public final Object mo371(Object obj) {
        ArrayList arrayList;
        Iterator it;
        AlertDialog alertDialog;
        AlertDialog alertDialog2;
        Object c2658;
        Object c26582;
        EnumC2097 enumC2097;
        Object c26583;
        Object c26584;
        Object next;
        C0479 c0479;
        Object c26585;
        Object c26586;
        Object next2;
        Object next3;
        Object c26587;
        PackageInfo packageInfo;
        List listM3271;
        Object obj2;
        boolean z = false;
        z = false;
        boolean z2 = false;
        final int i = 1;
        switch (this.f10014) {
            case 0:
                ((C1158) this.f10015).f5341.removeCallbacks((RunnableC2660) this.f10013);
                return C2746.f13459;
            case 1:
                Context context = (Context) this.f10015;
                String str = (String) this.f10013;
                AbstractC2328.m4341(-838905470026606L);
                Object obj3 = ((C0488) obj).f2405;
                AbstractC2328.m4341(-838957009634158L);
                final Activity activity = (Activity) obj3;
                String packageName = context.getPackageName();
                AbstractC2328.m4341(-839206117737326L);
                if (!activity.isFinishing() && !activity.isDestroyed()) {
                    List list = C1860.f9345;
                    try {
                        LinkedHashMap linkedHashMap = AbstractC1718.f8702;
                        String strM3456 = AbstractC1718.m3456(AbstractC2328.m4341(-838699311596398L));
                        if (strM3456 != null) {
                            List list2 = (List) new C0114().m516(strM3456, new C0128().f13683);
                            if (list2 != null) {
                                list = list2;
                            }
                        }
                    } catch (Exception e) {
                        C2336.f11496.m4355(AbstractC2328.m4341(-838785210942318L), e);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj4 : list) {
                        if (AbstractC1544.m3188(((C2268) obj4).m4275(), packageName)) {
                            arrayList2.add(obj4);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(AbstractC0055.m419(arrayList2, 10));
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(((C2268) it2.next()).m4276());
                    }
                    List listM3272 = AbstractC1595.m3272(AbstractC1595.m3270(arrayList3), C2055.f10195);
                    final C0172 c0172 = new C0172();
                    C2701.f13261.getClass();
                    String strM4809 = C2701.m4809(activity);
                    final C1223 c1223 = new C1223(z ? 1 : 0, c0172);
                    LinearLayout linearLayout = new LinearLayout(activity);
                    linearLayout.setOrientation(1);
                    linearLayout.setBackground(C0135.m598(Color.parseColor(AbstractC2328.m4341(-837664224478062L)), AbstractC1426.m2904(20), null));
                    linearLayout.setPadding(AbstractC1426.m2904(22), AbstractC1426.m2904(22), AbstractC1426.m2904(22), AbstractC1426.m2904(20));
                    LinearLayout linearLayout2 = new LinearLayout(activity);
                    linearLayout2.setOrientation(0);
                    linearLayout2.setGravity(16);
                    int i2 = -2;
                    linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                    TextView textView = new TextView(activity);
                    int i3 = 2;
                    textView.setText(AbstractC2328.m4341(-837698584216430L));
                    textView.setTextSize(19.0f);
                    Typeface typeface = Typeface.DEFAULT_BOLD;
                    textView.setTypeface(typeface);
                    textView.setIncludeFontPadding(false);
                    textView.setTextColor(Color.parseColor(AbstractC2328.m4341(-837728648987502L)));
                    textView.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
                    linearLayout2.addView(textView);
                    TextView textView2 = new TextView(activity);
                    textView2.setText(AbstractC2328.m4341(-837763008725870L));
                    textView2.setTextSize(24.0f);
                    textView2.setGravity(17);
                    textView2.setIncludeFontPadding(false);
                    textView2.setTextColor(Color.parseColor(AbstractC2328.m4341(-837771598660462L)));
                    textView2.setBackground(C0135.m598(Color.parseColor(AbstractC2328.m4341(-837805958398830L)), AbstractC1426.m2904(999), null));
                    textView2.setLayoutParams(new LinearLayout.LayoutParams(AbstractC1426.m2904(32), AbstractC1426.m2904(32)));
                    textView2.setClickable(true);
                    textView2.setFocusable(true);
                    textView2.setOnClickListener(new View.OnClickListener() { // from class: yyds.ᲀᛱᛴᛸ
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i4 = i;
                            C1223 c12232 = c1223;
                            switch (i4) {
                                case 0:
                                    c12232.mo731();
                                    break;
                                default:
                                    c12232.mo731();
                                    break;
                            }
                        }
                    });
                    linearLayout2.addView(textView2);
                    linearLayout.addView(linearLayout2);
                    TextView textView3 = new TextView(activity);
                    textView3.setText(AbstractC2328.m4341(-837840318137198L) + strM4809 + AbstractC2328.m4341(-837857498006382L));
                    textView3.setTextSize(14.0f);
                    textView3.setTextColor(Color.parseColor(AbstractC2328.m4341(-837956282254190L)));
                    textView3.setLineSpacing((float) AbstractC1426.m2904(2), 1.05f);
                    textView3.setPadding(0, AbstractC1426.m2904(12), 0, 0);
                    textView3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                    linearLayout.addView(textView3);
                    LinearLayout linearLayout3 = new LinearLayout(activity);
                    linearLayout3.setOrientation(0);
                    linearLayout3.setGravity(16);
                    linearLayout3.setPadding(AbstractC1426.m2904(16), AbstractC1426.m2904(14), AbstractC1426.m2904(14), AbstractC1426.m2904(14));
                    linearLayout3.setBackground(C0135.m598(Color.parseColor(AbstractC2328.m4341(-837990641992558L)), AbstractC1426.m2904(14), Integer.valueOf(Color.parseColor(AbstractC2328.m4341(-838025001730926L)))));
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams.topMargin = AbstractC1426.m2904(18);
                    linearLayout3.setLayoutParams(layoutParams);
                    LinearLayout linearLayout4 = new LinearLayout(activity);
                    linearLayout4.setOrientation(1);
                    linearLayout4.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
                    TextView textView4 = new TextView(activity);
                    textView4.setText(AbstractC2328.m4341(-838059361469294L));
                    textView4.setTextSize(12.0f);
                    textView4.setIncludeFontPadding(false);
                    textView4.setTextColor(Color.parseColor(AbstractC2328.m4341(-838080836305774L)));
                    linearLayout4.addView(textView4);
                    TextView textView5 = new TextView(activity);
                    textView5.setText(str);
                    textView5.setTextSize(20.0f);
                    textView5.setTypeface(typeface);
                    textView5.setIncludeFontPadding(false);
                    textView5.setTextColor(Color.parseColor(AbstractC2328.m4341(-838115196044142L)));
                    textView5.setTextIsSelectable(true);
                    textView5.setEllipsize(TextUtils.TruncateAt.END);
                    textView5.setMaxLines(1);
                    textView5.setPadding(0, AbstractC1426.m2904(6), AbstractC1426.m2904(8), 0);
                    linearLayout4.addView(textView5);
                    linearLayout3.addView(linearLayout4);
                    TextView textView6 = new TextView(activity);
                    textView6.setText(AbstractC2328.m4341(-838149555782510L));
                    textView6.setTextSize(12.0f);
                    textView6.setTypeface(typeface);
                    textView6.setGravity(17);
                    textView6.setIncludeFontPadding(false);
                    textView6.setTextColor(Color.parseColor(AbstractC2328.m4341(-838166735651694L)));
                    textView6.setPadding(AbstractC1426.m2904(10), AbstractC1426.m2904(6), AbstractC1426.m2904(10), AbstractC1426.m2904(6));
                    textView6.setBackground(C0135.m598(Color.parseColor(AbstractC2328.m4341(-838201095390062L)), AbstractC1426.m2904(999), null));
                    linearLayout3.addView(textView6);
                    linearLayout.addView(linearLayout3);
                    int size = listM3272.size();
                    LinearLayout linearLayout5 = new LinearLayout(activity);
                    linearLayout5.setOrientation(0);
                    linearLayout5.setGravity(16);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams2.topMargin = AbstractC1426.m2904(20);
                    layoutParams2.bottomMargin = AbstractC1426.m2904(10);
                    linearLayout5.setLayoutParams(layoutParams2);
                    TextView textView7 = new TextView(activity);
                    textView7.setText(AbstractC2328.m4341(-838244045063022L));
                    textView7.setTextSize(15.0f);
                    textView7.setTypeface(typeface);
                    textView7.setIncludeFontPadding(false);
                    textView7.setTextColor(Color.parseColor(AbstractC2328.m4341(-838269814866798L)));
                    textView7.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
                    linearLayout5.addView(textView7);
                    TextView textView8 = new TextView(activity);
                    textView8.setText(AbstractC2328.m4341(-838304174605166L) + size + AbstractC2328.m4341(-838317059507054L));
                    textView8.setTextSize(12.0f);
                    textView8.setIncludeFontPadding(false);
                    textView8.setTextColor(Color.parseColor(AbstractC2328.m4341(-838329944408942L)));
                    textView8.setPadding(AbstractC1426.m2904(9), AbstractC1426.m2904(5), AbstractC1426.m2904(9), AbstractC1426.m2904(5));
                    textView8.setBackground(C0135.m598(Color.parseColor(AbstractC2328.m4341(-838364304147310L)), AbstractC1426.m2904(999), null));
                    linearLayout5.addView(textView8);
                    linearLayout.addView(linearLayout5);
                    LinearLayout linearLayout6 = new LinearLayout(activity);
                    linearLayout6.setOrientation(1);
                    linearLayout6.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                    if (listM3272.isEmpty()) {
                        TextView textView9 = new TextView(activity);
                        textView9.setText(AbstractC2328.m4341(-838398663885678L));
                        textView9.setTextSize(14.0f);
                        textView9.setGravity(17);
                        textView9.setTextColor(Color.parseColor(AbstractC2328.m4341(-838441613558638L)));
                        textView9.setPadding(AbstractC1426.m2904(14), AbstractC1426.m2904(14), AbstractC1426.m2904(14), AbstractC1426.m2904(14));
                        textView9.setBackground(C0135.m598(Color.parseColor(AbstractC2328.m4341(-838475973297006L)), AbstractC1426.m2904(12), Integer.valueOf(Color.parseColor(AbstractC2328.m4341(-838510333035374L)))));
                        textView9.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                        linearLayout6.addView(textView9);
                    } else {
                        if (listM3272 instanceof RandomAccess) {
                            int size2 = listM3272.size();
                            arrayList = new ArrayList((size2 / 2) + (size2 % 2 == 0 ? 0 : 1));
                            int i4 = 0;
                            while (i4 >= 0 && i4 < size2) {
                                int i5 = size2 - i4;
                                if (i3 <= i5) {
                                    i5 = 2;
                                }
                                ArrayList arrayList4 = new ArrayList(i5);
                                for (int i6 = 0; i6 < i5; i6++) {
                                    arrayList4.add(listM3272.get(i6 + i4));
                                }
                                arrayList.add(arrayList4);
                                i4 += 2;
                                i3 = 2;
                            }
                        } else {
                            arrayList = new ArrayList();
                            Iterator it3 = listM3272.iterator();
                            if (it3.hasNext()) {
                                C1728 c1728 = new C1728();
                                C2316 c2316 = new C2316(it3, c1728);
                                c2316.f11356 = c1728;
                                c1728.f8730 = c2316;
                                it = c1728;
                            } else {
                                it = C2593.f12777;
                            }
                            while (it.hasNext()) {
                                arrayList.add((List) it.next());
                            }
                        }
                        int i7 = 0;
                        for (Object obj5 : arrayList) {
                            int i8 = i7 + 1;
                            if (i7 < 0) {
                                AbstractC2725.m4853();
                                throw null;
                            }
                            List list3 = (List) obj5;
                            LinearLayout linearLayout7 = new LinearLayout(activity);
                            linearLayout7.setOrientation(z ? 1 : 0);
                            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, i2);
                            if (i7 < AbstractC2725.m4850(listM3272) / 2) {
                                layoutParams3.bottomMargin = AbstractC1426.m2904(8);
                            }
                            linearLayout7.setLayoutParams(layoutParams3);
                            int i9 = z ? 1 : 0;
                            for (Object obj6 : list3) {
                                int i10 = i9 + 1;
                                if (i9 < 0) {
                                    AbstractC2725.m4853();
                                    throw null;
                                }
                                TextView textView10 = new TextView(activity);
                                textView10.setText((String) obj6);
                                textView10.setTextSize(13.0f);
                                textView10.setTypeface(Typeface.DEFAULT_BOLD);
                                textView10.setGravity(17);
                                textView10.setIncludeFontPadding(z);
                                textView10.setTextColor(Color.parseColor(AbstractC2328.m4341(-838544692773742L)));
                                List list4 = listM3272;
                                textView10.setPadding(AbstractC1426.m2904(8), AbstractC1426.m2904(7), AbstractC1426.m2904(8), AbstractC1426.m2904(7));
                                textView10.setMaxLines(1);
                                textView10.setEllipsize(TextUtils.TruncateAt.END);
                                textView10.setBackground(C0135.m598(Color.parseColor(AbstractC2328.m4341(-838579052512110L)), AbstractC1426.m2904(12), Integer.valueOf(Color.parseColor(AbstractC2328.m4341(-838613412250478L)))));
                                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, AbstractC1426.m2904(40), 1.0f);
                                if (i9 == 0) {
                                    layoutParams4.rightMargin = AbstractC1426.m2904(8);
                                }
                                textView10.setLayoutParams(layoutParams4);
                                linearLayout7.addView(textView10);
                                i9 = i10;
                                listM3272 = list4;
                                z = false;
                            }
                            List list5 = listM3272;
                            if (list3.size() == 1) {
                                View view = new View(activity);
                                view.setLayoutParams(new LinearLayout.LayoutParams(0, AbstractC1426.m2904(40), 1.0f));
                                linearLayout7.addView(view);
                            }
                            linearLayout6.addView(linearLayout7);
                            i7 = i8;
                            listM3272 = list5;
                            z = false;
                            i2 = -2;
                        }
                    }
                    C0866 c0866 = new C0866(activity, AbstractC1426.m2904(220));
                    c0866.setOverScrollMode(1);
                    c0866.setFillViewport(false);
                    c0866.addView(linearLayout6);
                    c0866.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                    linearLayout.addView(c0866);
                    TextView textView11 = new TextView(activity);
                    textView11.setText(AbstractC2328.m4341(-838647771988846L));
                    textView11.setTextSize(15.0f);
                    textView11.setTypeface(Typeface.DEFAULT_BOLD);
                    textView11.setGravity(17);
                    textView11.setIncludeFontPadding(false);
                    textView11.setTextColor(-1);
                    textView11.setPadding(0, AbstractC1426.m2904(13), 0, AbstractC1426.m2904(13));
                    textView11.setBackground(C0135.m598(Color.parseColor(AbstractC2328.m4341(-838664951858030L)), AbstractC1426.m2904(12), null));
                    LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams5.topMargin = AbstractC1426.m2904(22);
                    textView11.setLayoutParams(layoutParams5);
                    textView11.setClickable(true);
                    textView11.setFocusable(true);
                    final int i11 = 0;
                    textView11.setOnClickListener(new View.OnClickListener() { // from class: yyds.ᲀᛱᛴᛸ
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i42 = i11;
                            C1223 c12232 = c1223;
                            switch (i42) {
                                case 0:
                                    c12232.mo731();
                                    break;
                                default:
                                    c12232.mo731();
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(textView11);
                    AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).create();
                    alertDialogCreate.setCanceledOnTouchOutside(true);
                    AbstractC2328.m4341(-837526785524590L);
                    c0172.f997 = alertDialogCreate;
                    alertDialogCreate.setView(linearLayout, 0, 0, 0, 0);
                    Object obj7 = c0172.f997;
                    if (obj7 == null) {
                        AbstractC2328.m4341(-837604094935918L);
                        alertDialog = null;
                    } else {
                        alertDialog = (AlertDialog) obj7;
                    }
                    alertDialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: yyds.ᛸᛲᲀᲈ
                        @Override // android.content.DialogInterface.OnShowListener
                        public final void onShow(DialogInterface dialogInterface) {
                            AlertDialog alertDialog3;
                            Object obj8 = c0172.f997;
                            if (obj8 == null) {
                                AbstractC2328.m4341(-839369326494574L);
                                alertDialog3 = null;
                            } else {
                                alertDialog3 = (AlertDialog) obj8;
                            }
                            Window window = alertDialog3.getWindow();
                            if (window != null) {
                                window.setBackgroundDrawable(new ColorDrawable(0));
                                window.setLayout(Math.min((int) (activity.getResources().getDisplayMetrics().widthPixels * 0.9f), AbstractC1426.m2904(370)), -2);
                                window.setDimAmount(0.45f);
                            }
                        }
                    });
                    Object obj8 = c0172.f997;
                    if (obj8 == null) {
                        AbstractC2328.m4341(-837634159706990L);
                        alertDialog2 = null;
                    } else {
                        alertDialog2 = (AlertDialog) obj8;
                    }
                    alertDialog2.show();
                }
                C0174.f998.getClass();
                C0174.m735();
                return C2746.f13459;
            case 2:
                final C2014 c2014 = (C2014) this.f10015;
                final String str2 = (String) this.f10013;
                C0488 c0488 = (C0488) obj;
                AbstractC2328.m4341(-862459070677870L);
                Object obj9 = c0488.f2407;
                AbstractC2328.m4341(-862510610285422L);
                final Dialog dialog = (Dialog) obj9;
                final Object obj10 = c0488.f2405;
                dialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: yyds.ᲈᛲᲇ
                    static {
                        NativeUtil.classesInit0(37);
                    }

                    @Override // android.content.DialogInterface.OnShowListener
                    public final native void onShow(DialogInterface dialogInterface);
                });
                return C2746.f13459;
            case 3:
                C0668 c0668 = (C0668) this.f10015;
                InterfaceC2418 interfaceC2418 = (InterfaceC1989) this.f10013;
                C0668.f3169 = System.currentTimeMillis();
                c0668.f3172.mo511(((AbstractC0227) interfaceC2418).f1247, obj);
                return C2746.f13459;
            case 4:
                Class cls = (Class) this.f10015;
                try {
                    c2658 = ((Method) obj).invoke(this.f10013, null);
                    break;
                } catch (Throwable th) {
                    c2658 = new C2658(th);
                }
                if (c2658 instanceof C2658) {
                    c2658 = null;
                }
                if (c2658 == null || !cls.isInstance(c2658)) {
                    return null;
                }
                return c2658;
            case 5:
                EnumC2097 enumC20972 = (EnumC2097) this.f10015;
                String str3 = (String) this.f10013;
                C0488 c04882 = (C0488) obj;
                AbstractC2328.m4341(-1008191605998446L);
                try {
                    Object obj11 = c04882.f2407;
                    ViewGroup viewGroup = obj11 instanceof ViewGroup ? (ViewGroup) obj11 : null;
                    if (viewGroup != null) {
                        Object obj12 = c04882.f2405;
                        if (obj12 != null) {
                            C1784.f9011.getClass();
                            EnumC2097 enumC2097M3565 = C1784.m3565(obj12);
                            if (enumC2097M3565 != null) {
                                enumC20972 = enumC2097M3565;
                            }
                        }
                        C1784 c1784 = C1784.f9011;
                        c1784.getClass();
                        Map map = C1784.f8997;
                        AbstractC2328.m4341(-1001525816755054L);
                        synchronized (map) {
                            enumC2097 = (EnumC2097) map.put(viewGroup, enumC20972);
                        }
                        if (enumC2097 != null && enumC2097 != enumC20972) {
                            C1784.m3543(viewGroup);
                        }
                        c1784.m3567(viewGroup, enumC20972, true, true);
                    }
                    c26582 = C2746.f13459;
                } catch (Throwable th2) {
                    c26582 = new C2658(th2);
                }
                Throwable thM4249 = C2248.m4249(c26582);
                if (thM4249 != null) {
                    C2336.f11496.m4355(AbstractC2328.m4341(-1008260325475182L).concat(str3), thM4249);
                }
                return C2746.f13459;
            case 6:
                EnumC0868 enumC0868 = (EnumC0868) this.f10015;
                String str4 = (String) this.f10013;
                C0488 c04883 = (C0488) obj;
                C2746 c2746 = C2746.f13459;
                C2153 c2153 = C2153.f10615;
                AbstractC2328.m4341(-820557369738094L);
                try {
                    Object obj13 = c04883.f2407;
                    ViewGroup viewGroup2 = obj13 instanceof ViewGroup ? (ViewGroup) obj13 : null;
                    if (viewGroup2 != null) {
                        Object obj14 = c04883.f2405;
                        if (obj14 != null) {
                            c2153.getClass();
                            EnumC0868 enumC0868M4112 = C2153.m4112(obj14);
                            if (enumC0868M4112 != null) {
                                enumC0868 = enumC0868M4112;
                            }
                        }
                        c2153.getClass();
                        C2153.m4116(viewGroup2, enumC0868);
                        break;
                    }
                    c26583 = c2746;
                } catch (Throwable th3) {
                    c26583 = new C2658(th3);
                }
                Throwable thM42492 = C2248.m4249(c26583);
                if (thM42492 != null) {
                    C2336.f11496.m4355(AbstractC2328.m4341(-820626089214830L).concat(str4), thM42492);
                }
                return c2746;
            case 7:
                Object obj15 = this.f10015;
                ImageView imageView = (ImageView) this.f10013;
                Field field = (Field) obj;
                AbstractC2328.m4341(-831840248824686L);
                if (ImageView.class.isAssignableFrom(field.getType())) {
                    try {
                        field.setAccessible(true);
                        c26584 = Boolean.valueOf(field.get(obj15) == imageView);
                    } catch (Throwable th4) {
                        c26584 = new C2658(th4);
                    }
                    Boolean bool = Boolean.FALSE;
                    boolean z3 = c26584 instanceof C2658;
                    Object obj16 = c26584;
                    if (z3) {
                        obj16 = bool;
                    }
                    if (((Boolean) obj16).booleanValue()) {
                        z2 = true;
                    }
                    break;
                }
                return Boolean.valueOf(z2);
            case 8:
                AbstractC2408.m4452((C0644) this.f10015, (List) this.f10013, ((Integer) obj).intValue());
                return C2746.f13459;
            case 9:
                C0172 c01722 = (C0172) this.f10015;
                C2086 c2086 = (C2086) this.f10013;
                List list6 = (List) obj;
                AbstractC2328.m4341(-186633081750382L);
                C2615.f12860.getClass();
                String strM4715 = C2615.m4715();
                Iterable iterable = (Iterable) c01722.f997;
                ArrayList arrayList5 = new ArrayList();
                for (Object obj17 : iterable) {
                    C1132 c1132 = (C1132) obj17;
                    String strM2321 = c1132.m2321();
                    if (strM2321 != null && !AbstractC0473.m1313(strM2321) && !AbstractC1544.m3188(c1132.m2321(), strM4715)) {
                        arrayList5.add(obj17);
                    }
                }
                ArrayList arrayListM3284 = AbstractC1595.m3284(arrayList5, list6);
                HashSet hashSet = new HashSet();
                ArrayList arrayList6 = new ArrayList();
                for (Object obj18 : arrayListM3284) {
                    C1132 c11322 = (C1132) obj18;
                    if (hashSet.add(c11322.m2321() + ':' + c11322.m2320())) {
                        arrayList6.add(obj18);
                    }
                }
                c01722.f997 = new ArrayList(arrayList6);
                AbstractC0797.m1828(c2086, c01722);
                return C2746.f13459;
            case 10:
                Class cls2 = (Class) this.f10015;
                Method method = (Method) this.f10013;
                C2746 c27462 = C2746.f13459;
                AbstractC2328.m4341(-1065993275868014L);
                Object objM3281 = AbstractC1595.m3281(((C0488) obj).f2406);
                if (objM3281 != null) {
                    C2336 c2336 = C2336.f11496;
                    StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-1066061995344750L));
                    C1509.f7142.getClass();
                    sb.append(C1509.m3060());
                    c2336.m4354(sb.toString());
                    C1988.f9997.getClass();
                    int iM3060 = C1509.m3060();
                    if (iM3060 != 0) {
                        List list7 = C1860.f9345;
                        Field[] declaredFields = cls2.getDeclaredFields();
                        AbstractC2328.m4341(-1052790546400110L);
                        C1119 c1119 = new C1119(AbstractC1529.m3163(AbstractC2070.m3935(declaredFields), new C0583(16)));
                        while (true) {
                            if (c1119.hasNext()) {
                                Field field2 = (Field) c1119.next();
                                field2.setAccessible(true);
                                try {
                                    Object obj19 = field2.get(null);
                                    c26587 = obj19 instanceof List ? (List) obj19 : null;
                                } catch (Throwable th5) {
                                    c26587 = new C2658(th5);
                                }
                                boolean z4 = c26587 instanceof C2658;
                                Object obj20 = c26587;
                                if (z4) {
                                    obj20 = null;
                                }
                                List list8 = (List) obj20;
                                if (list8 == null) {
                                    list8 = list7;
                                }
                                ArrayList arrayListM3260 = AbstractC1595.m3260(list8);
                                if (!arrayListM3260.isEmpty() && C1988.m3861(AbstractC1595.m3280(arrayListM3260)) != null) {
                                    list7 = arrayListM3260;
                                }
                            }
                        }
                        if (list7.isEmpty()) {
                            C2336.f11496.m4354(AbstractC2328.m4341(-1052120531501934L));
                        } else {
                            ArrayList arrayList7 = new ArrayList();
                            Iterator it4 = list7.iterator();
                            while (it4.hasNext()) {
                                C0479 c0479M3861 = C1988.m3861(it4.next());
                                if (c0479M3861 != null) {
                                    arrayList7.add(c0479M3861);
                                }
                            }
                            ArrayList arrayList8 = new ArrayList();
                            for (Object obj21 : arrayList7) {
                                if (((C0479) obj21).f2390) {
                                    arrayList8.add(obj21);
                                }
                            }
                            if (arrayList8.isEmpty()) {
                                arrayList8 = new ArrayList();
                                Iterator it5 = list7.iterator();
                                while (it5.hasNext()) {
                                    C0479 c0479M38612 = C1988.m3861(it5.next());
                                    if (c0479M38612 != null) {
                                        arrayList8.add(c0479M38612);
                                    }
                                }
                            }
                            if (arrayList8.isEmpty()) {
                                C2336.f11496.m4354(AbstractC2328.m4341(-1052197840913262L));
                            } else {
                                if (iM3060 == 1) {
                                    C1509.f7142.getClass();
                                    String strM3114 = C1509.m3114();
                                    if (AbstractC0473.m1313(strM3114)) {
                                        C2336.f11496.m4354(AbstractC2328.m4341(-1052270855357294L));
                                    }
                                    Iterator it6 = arrayList8.iterator();
                                    while (true) {
                                        if (it6.hasNext()) {
                                            next = it6.next();
                                            if (((C0479) next).f2388.equals(strM3114)) {
                                            }
                                        } else {
                                            next = null;
                                        }
                                    }
                                    c0479 = (C0479) next;
                                } else if (iM3060 == 2) {
                                    Iterator it7 = arrayList8.iterator();
                                    if (it7.hasNext()) {
                                        next2 = it7.next();
                                        if (it7.hasNext()) {
                                            int i12 = ((C0479) next2).f2389;
                                            do {
                                                Object next4 = it7.next();
                                                int i13 = ((C0479) next4).f2389;
                                                if (i12 < i13) {
                                                    next2 = next4;
                                                    i12 = i13;
                                                }
                                            } while (it7.hasNext());
                                        }
                                    } else {
                                        next2 = null;
                                    }
                                    c0479 = (C0479) next2;
                                } else if (iM3060 != 3) {
                                    c0479 = null;
                                } else {
                                    Iterator it8 = arrayList8.iterator();
                                    if (it8.hasNext()) {
                                        next3 = it8.next();
                                        if (it8.hasNext()) {
                                            int i14 = ((C0479) next3).f2389;
                                            do {
                                                Object next5 = it8.next();
                                                int i15 = ((C0479) next5).f2389;
                                                if (i14 > i15) {
                                                    next3 = next5;
                                                    i14 = i15;
                                                }
                                            } while (it8.hasNext());
                                        }
                                    } else {
                                        next3 = null;
                                    }
                                    c0479 = (C0479) next3;
                                }
                                if (c0479 == null) {
                                    C2336 c23362 = C2336.f11496;
                                    StringBuilder sb2 = new StringBuilder(AbstractC2328.m4341(-1052343869801326L));
                                    AbstractC2104.m4007(sb2, iM3060, -1052438359081838L);
                                    C1509.f7142.getClass();
                                    sb2.append(C1509.m3114());
                                    c23362.m4354(sb2.toString());
                                } else {
                                    String str5 = c0479.f2388;
                                    Class<?> cls3 = c0479.f2387.getClass();
                                    Field[] declaredFields2 = cls2.getDeclaredFields();
                                    AbstractC2328.m4341(-1053426201559918L);
                                    C1119 c11192 = new C1119(AbstractC1529.m3163(AbstractC2070.m3935(declaredFields2), new C2553(cls3, 1)));
                                    while (true) {
                                        if (c11192.hasNext()) {
                                            Field field3 = (Field) c11192.next();
                                            field3.setAccessible(true);
                                            try {
                                                c26585 = field3.get(null);
                                            } catch (Throwable th6) {
                                                c26585 = new C2658(th6);
                                            }
                                            if (c26585 instanceof C2658) {
                                                c26585 = null;
                                            }
                                            if (c26585 != null) {
                                            }
                                        } else {
                                            c26585 = null;
                                        }
                                        break;
                                    }
                                    C0479 c0479M38613 = c26585 != null ? C1988.m3861(c26585) : null;
                                    if (AbstractC1544.m3188(c0479M38613 != null ? c0479M38613.f2388 : null, str5)) {
                                        C2336.f11496.m4354(AbstractC2328.m4341(-1052498488623982L) + str5 + AbstractC2328.m4341(-1052558618166126L) + iM3060);
                                    } else {
                                        try {
                                            c26586 = method.invoke(null, objM3281, str5, AbstractC2328.m4341(-1052592977904494L), Boolean.FALSE);
                                        } catch (Throwable th7) {
                                            c26586 = new C2658(th7);
                                        }
                                        if (!(c26586 instanceof C2658)) {
                                            C2336.f11496.m4354(AbstractC2328.m4341(-1052670287315822L) + str5 + AbstractC2328.m4341(-1052708942021486L) + iM3060);
                                        }
                                        Throwable thM42493 = C2248.m4249(c26586);
                                        if (thM42493 != null) {
                                            C2336.f11496.m4355(AbstractC2328.m4341(-1052743301759854L), thM42493);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    break;
                }
                return c27462;
            case 11:
                PackageManager packageManager = (PackageManager) this.f10015;
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.f10013;
                ApplicationInfo applicationInfo = (ApplicationInfo) obj;
                List list9 = MainActivity.f451;
                AbstractC2328.m4341(-273060708647790L);
                String str6 = applicationInfo.packageName;
                AbstractC2328.m4341(-273095068386158L);
                try {
                    packageInfo = Build.VERSION.SDK_INT >= 33 ? packageManager.getPackageInfo(str6, PackageManager.PackageInfoFlags.of(0L)) : packageManager.getPackageInfo(str6, 0);
                    break;
                } catch (Throwable unused) {
                    packageInfo = null;
                }
                List list10 = (List) linkedHashMap2.get(applicationInfo.packageName);
                List list11 = list10;
                if (list10 == null) {
                    list11 = C1860.f9345;
                }
                Bundle bundle = applicationInfo.metaData;
                String string = (bundle == null || (obj2 = bundle.get(AbstractC2328.m4341(-273146607993710L))) == null) ? null : obj2.toString();
                if (string == null) {
                    string = AbstractC2328.m4341(-273232507339630L);
                }
                String str7 = string;
                String string2 = applicationInfo.loadLabel(packageManager).toString();
                String str8 = applicationInfo.packageName;
                AbstractC2328.m4341(-273236802306926L);
                String strM4341 = packageInfo != null ? packageInfo.versionName : null;
                if (strM4341 == null) {
                    strM4341 = AbstractC2328.m4341(-273288341914478L);
                }
                String str9 = strM4341;
                String strValueOf = packageInfo != null ? String.valueOf(packageInfo.getLongVersionCode()) : null;
                if (strValueOf == null) {
                    strValueOf = AbstractC2328.m4341(-273292636881774L);
                }
                String str10 = strValueOf;
                Drawable drawableLoadIcon = applicationInfo.loadIcon(packageManager);
                AbstractC2328.m4341(-273296931849070L);
                List listM3265 = AbstractC1595.m3265(list11);
                if (listM3265.size() <= 1) {
                    listM3271 = AbstractC1595.m3269(listM3265);
                } else {
                    listM3271 = AbstractC1595.m3271(listM3265);
                    Collections.reverse(listM3271);
                }
                return new C0178(string2, str8, str9, str10, str7, drawableLoadIcon, listM3271, !AbstractC0473.m1313(str7) && list11.contains(str7));
            case 12:
                return m3878(obj);
            case 13:
                return m3881(obj);
            case 14:
                return m3877(obj);
            case 15:
                return m3876(obj);
            case 16:
                return m3879(obj);
            case 17:
                return m3880(obj);
            default:
                CustomRecyclerView customRecyclerView = (CustomRecyclerView) this.f10015;
                C0947 c0947 = (C0947) this.f10013;
                List list12 = (List) obj;
                AbstractC2328.m4341(-982889953657710L);
                if (list12.isEmpty()) {
                    AbstractC0359 adapter = customRecyclerView.getAdapter();
                    C2343 c2343 = adapter instanceof C2343 ? (C2343) adapter : null;
                    if (c2343 != null) {
                        c2343.f11516 = false;
                    }
                } else {
                    AbstractC0359 adapter2 = customRecyclerView.getAdapter();
                    C2343 c23432 = adapter2 instanceof C2343 ? (C2343) adapter2 : null;
                    if (c23432 != null) {
                        AbstractC2328.m4341(-1668809115730798L);
                        ArrayList arrayList9 = c23432.f11512;
                        int size3 = arrayList9.size();
                        arrayList9.addAll(list12);
                        c23432.f11516 = false;
                        c23432.f1869.m1870(size3, list12.size());
                    }
                    c0947.f4410++;
                }
                return C2746.f13459;
        }
    }

    public /* synthetic */ C2001(MainActivity mainActivity, PackageManager packageManager, LinkedHashMap linkedHashMap) {
        this.f10014 = 11;
        this.f10015 = packageManager;
        this.f10013 = linkedHashMap;
    }

    public /* synthetic */ C2001(Object obj, int i, Object obj2) {
        this.f10014 = i;
        this.f10015 = obj;
        this.f10013 = obj2;
    }
}
