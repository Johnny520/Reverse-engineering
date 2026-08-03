package p000;

import android.app.Activity;
import android.app.AndroidAppHelper;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Space;
import android.widget.TextView;
import de.robv.android.xposed.XposedHelpers;
import io.github.cherrywechat.R;
import io.github.cherrywechat.application.MainApplication;
import io.github.cherrywechat.lua.LuaUiScheduler;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.NoSuchElementException;
import org.json.JSONObject;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1197b implements InterfaceC1416fj {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4108a;

    public /* synthetic */ C1197b(int i) {
        this.f4108a = i;
    }

    /* JADX INFO: renamed from: c */
    private final Object m2317c(Object obj) throws IllegalAccessException {
        Drawable drawableM2890b;
        Drawable drawableM2890b2;
        TextView textView;
        TextView textView2;
        AbstractC0295Gu.m625r(-197856258422837L);
        C2428qs c2428qs = ((C1494hG) obj).f5263a;
        Object[] objArr = (Object[]) c2428qs.f8522c;
        int i = 0;
        Object obj2 = objArr[0];
        Object obj3 = objArr[1];
        AbstractC0295Gu.m625r(-197907798030389L);
        Integer num = (Integer) obj3;
        num.getClass();
        C2648vx c2648vx = new C2648vx();
        View view = null;
        if (obj2 instanceof Class) {
            c2648vx.f9163b = (Class) obj2;
        } else {
            c2648vx.f9164c = obj2;
            c2648vx.f9163b = obj2 != null ? obj2.getClass() : null;
        }
        c2648vx.f9165d = View.class;
        C0089C2 c0089c2 = new C0089C2(1, ((View) c2648vx.m5178a()).getTag());
        C1538iG c1538iG = new C1538iG(c2428qs.f8521b);
        c1538iG.m2921f(AbstractC0295Gu.m625r(-197564200646709L));
        C0089C2 c0089c22 = new C0089C2(3, c1538iG.m2918c(null, num));
        HashMap map = AbstractC0999XA.f3193a;
        int iM2889a = C1517hw.m2889a(0, AbstractC0295Gu.m625r(-197160473720885L));
        if (iM2889a != 0 && (textView2 = (TextView) c0089c2.f201g) != null) {
            textView2.setTextColor(iM2889a);
        }
        Integer num2 = (Integer) c0089c22.f199e;
        if (num2 != null && num2.intValue() == 1) {
            AbstractC0671Pj.m1350h(c0089c2, c0089c22);
        } else if (num2 != null && num2.intValue() == 16777265) {
            AbstractC0671Pj.m1350h(c0089c2, c0089c22);
        } else if (num2 != null && num2.intValue() == 822083633) {
            AbstractC0671Pj.m1350h(c0089c2, c0089c22);
        } else if (num2 != null && num2.intValue() == 805306417) {
            AbstractC0671Pj.m1350h(c0089c2, c0089c22);
        } else if (num2 != null && num2.intValue() == 570425393) {
            AbstractC0671Pj.m1349g(c0089c2);
        } else if (num2 != null && num2.intValue() == 10000) {
            AbstractC0671Pj.m1349g(c0089c2);
        } else if (num2 != null && num2.intValue() == 268445456) {
            AbstractC0671Pj.m1349g(c0089c2);
        } else if (num2 != null && num2.intValue() == 922746929) {
            AbstractC0671Pj.m1349g(c0089c2);
        } else if (num2 != null && num2.intValue() == 1090519089) {
            Drawable drawableM2890b3 = c0089c22.m142d() ? C1517hw.m2890b(AbstractC0295Gu.m625r(-199209173121077L)) : C1517hw.m2890b(AbstractC0295Gu.m625r(-199883482986549L));
            if (drawableM2890b3 != null) {
                View viewM141c = c0089c2.m141c();
                Object obj4 = c0089c2.f202h;
                View viewM1351k = AbstractC0671Pj.m1351k(viewM141c);
                if (viewM1351k != null) {
                    viewM1351k.setBackground(drawableM2890b3);
                    viewM1351k.setForeground(null);
                }
                Field[] declaredFields = obj4.getClass().getDeclaredFields();
                AbstractC0295Gu.m625r(-200003742070837L);
                for (Field field : declaredFields) {
                    if (AbstractC0585Nj.m1134a(field.getType(), LinearLayout.class)) {
                        field.setAccessible(true);
                        Object obj5 = field.get(obj4);
                        View view2 = obj5 instanceof View ? (View) obj5 : null;
                        if (view2 != null) {
                            view2.setBackground(null);
                        }
                    }
                }
                HashMap map2 = AbstractC0999XA.f3193a;
                int iM2889a2 = C1517hw.m2889a(0, AbstractC0295Gu.m625r(c0089c22.m142d() ? -200102526318645L : -199694504425525L));
                if (iM2889a2 != 0) {
                    C2648vx c2648vx2 = new C2648vx();
                    if (obj4 instanceof Class) {
                        c2648vx2.f9163b = (Class) obj4;
                    } else {
                        c2648vx2.f9164c = obj4;
                        c2648vx2.f9163b = obj4.getClass();
                    }
                    c2648vx2.m5182e(AbstractC0295Gu.m625r(-198191265871925L));
                    View view3 = (View) c2648vx2.m5178a();
                    if (view3 != null) {
                        String strM625r = AbstractC0295Gu.m625r(-198363064563765L);
                        Object[] objArr2 = {Integer.valueOf(iM2889a2)};
                        AbstractC0295Gu.m625r(-578325936338997L);
                        XposedHelpers.callMethod(view3, strM625r, Arrays.copyOf(objArr2, 1));
                    }
                }
                ViewParent parent = c0089c2.m141c().getParent().getParent();
                AbstractC0295Gu.m625r(-198418899138613L);
                AbstractC0671Pj.m1348f((ViewGroup) parent, iM2889a2, iM2889a2 != 0, c0089c22.m142d());
            }
        } else if (num2 != null && num2.intValue() == 34) {
            View viewM141c2 = c0089c2.m141c();
            Object obj6 = c0089c2.f202h;
            AbstractC0295Gu.m625r(-200635102263349L);
            ViewGroup viewGroup = (ViewGroup) viewM141c2;
            viewGroup.getChildAt(0).setBackground(null);
            Drawable drawableM2890b4 = c0089c22.m142d() ? C1517hw.m2890b(AbstractC0295Gu.m625r(-200343044487221L)) : C1517hw.m2890b(AbstractC0295Gu.m625r(-201025944287285L));
            viewGroup.setBackground(drawableM2890b4);
            AbstractC0671Pj.m1347e(viewGroup, c0089c22.m142d());
            Field[] declaredFields2 = obj6.getClass().getDeclaredFields();
            AbstractC0295Gu.m625r(-201154793306165L);
            int length = declaredFields2.length;
            int i2 = 0;
            while (i2 < length) {
                Field field2 = declaredFields2[i2];
                field2.setAccessible(z);
                if (field2.getType().getName().equals(AbstractC0295Gu.m625r(-200703821740085L))) {
                    Object obj7 = field2.get(obj6);
                    View view4 = obj7 instanceof View ? (View) obj7 : view;
                    if (view4 != null && (view4.getParent() instanceof FrameLayout)) {
                        view4.setBackground(drawableM2890b4);
                        ViewParent parent2 = view4.getParent();
                        AbstractC0295Gu.m625r(-200862735530037L);
                        ViewGroup viewGroup2 = (ViewGroup) parent2;
                        int childCount = viewGroup2.getChildCount();
                        int i3 = i;
                        while (i3 < childCount) {
                            View childAt = viewGroup2.getChildAt(i3);
                            if ((childAt instanceof TextView) && childAt.getClass().getName().equals(TextView.class.getName())) {
                                HashMap map3 = AbstractC0999XA.f3193a;
                                int iM2889a3 = C1517hw.m2889a(i, AbstractC0295Gu.m625r(c0089c22.m142d() ? -199471166126133L : -199067439200309L));
                                if (iM2889a3 != 0) {
                                    TextView textView3 = (TextView) childAt;
                                    Drawable drawable = textView3.getCompoundDrawables()[c0089c22.m142d() ? 2 : i];
                                    if (drawable != null) {
                                        drawable.setColorFilter(new PorterDuffColorFilter(iM2889a3, PorterDuff.Mode.SRC_ATOP));
                                    }
                                    textView3.setTextColor(iM2889a3);
                                }
                            }
                            i3++;
                            i = 0;
                        }
                    }
                }
                i2++;
                i = 0;
                z = true;
                view = null;
            }
        } else if (num2 != null && num2.intValue() == 419430449) {
            Object obj8 = c0089c2.f202h;
            Field[] declaredFields3 = (obj8 != null ? obj8.getClass() : null).getDeclaredFields();
            AbstractC0295Gu.m625r(-151642410317877L);
            boolean z = false;
            for (Field field3 : declaredFields3) {
                if (AbstractC0585Nj.m1134a(field3.getType(), TextView.class)) {
                    Object obj9 = field3.get(obj8);
                    AbstractC0295Gu.m625r(-151191438751797L);
                    CharSequence text = ((TextView) obj9).getText();
                    AbstractC0295Gu.m625r(-151453431756853L);
                    if (AbstractC2564tz.m5051L(text, AbstractC0295Gu.m625r(-149859998890037L), false)) {
                        z = true;
                    }
                }
            }
            if (z) {
                if (c0089c22.m142d()) {
                    HashMap map4 = AbstractC0999XA.f3193a;
                    drawableM2890b = C1517hw.m2890b(AbstractC0295Gu.m625r(-149868588824629L));
                } else {
                    HashMap map5 = AbstractC0999XA.f3193a;
                    drawableM2890b = C1517hw.m2890b(AbstractC0295Gu.m625r(-150044682483765L));
                }
            } else if (c0089c22.m142d()) {
                HashMap map6 = AbstractC0999XA.f3193a;
                drawableM2890b = C1517hw.m2890b(AbstractC0295Gu.m625r(-149666725361717L));
            } else {
                HashMap map7 = AbstractC0999XA.f3193a;
                drawableM2890b = C1517hw.m2890b(AbstractC0295Gu.m625r(-149808459282485L));
            }
            if (drawableM2890b != null) {
                View viewM141c3 = c0089c2.m141c();
                if (viewM141c3 != null) {
                    viewM141c3.setBackground(drawableM2890b);
                    AbstractC0671Pj.m1347e(viewM141c3, c0089c22.m142d());
                }
                HashMap map8 = AbstractC0999XA.f3193a;
                int iM2889a4 = C1517hw.m2889a(-65536, z ? AbstractC0295Gu.m625r(c0089c22.m142d() ? -150495654049845L : -150143466731573L) : AbstractC0295Gu.m625r(c0089c22.m142d() ? -150336740259893L : -201627239708725L));
                if (iM2889a4 != 0) {
                    Field[] declaredFields4 = (obj8 != null ? obj8.getClass() : null).getDeclaredFields();
                    AbstractC0295Gu.m625r(-201236397684789L);
                    for (Field field4 : declaredFields4) {
                        if (AbstractC0585Nj.m1134a(field4.getType(), TextView.class)) {
                            Object obj10 = field4.get(obj8);
                            AbstractC0295Gu.m625r(-201335181932597L);
                            ((TextView) obj10).setTextColor(iM2889a4);
                        }
                    }
                }
                if (c0089c22.m142d()) {
                    HashMap map9 = AbstractC0999XA.f3193a;
                    drawableM2890b2 = C1517hw.m2890b(AbstractC0295Gu.m625r(-202146930751541L));
                } else {
                    HashMap map10 = AbstractC0999XA.f3193a;
                    drawableM2890b2 = C1517hw.m2890b(AbstractC0295Gu.m625r(-202310139508789L));
                }
                if (drawableM2890b2 != null) {
                    Field[] declaredFields5 = (obj8 != null ? obj8.getClass() : null).getDeclaredFields();
                    AbstractC0295Gu.m625r(-201919297484853L);
                    for (Field field5 : declaredFields5) {
                        if (AbstractC0585Nj.m1134a(field5.getType(), ImageView.class)) {
                            Object obj11 = field5.get(obj8);
                            AbstractC0295Gu.m625r(-202018081732661L);
                            ((ImageView) obj11).setImageDrawable(drawableM2890b2);
                        }
                    }
                }
            }
        } else if (num2 != null && num2.intValue() == 436207665) {
            View viewM141c4 = c0089c2.m141c();
            View view5 = (View) c0089c2.f198d;
            AbstractC0295Gu.m625r(-155701154412597L);
            ViewParent parent3 = C1456gf.m2810v((ViewGroup) viewM141c4, AbstractC0295Gu.m625r(-154309585008693L)).getParent();
            AbstractC0295Gu.m625r(-154464203831349L);
            ViewGroup viewGroup3 = (ViewGroup) parent3;
            int iM2889a5 = C1517hw.m2889a(0, AbstractC0295Gu.m625r(-154172146055221L));
            if (iM2889a5 != 0) {
                View childAt2 = viewGroup3.getChildAt(0);
                AbstractC0295Gu.m625r(-154889405593653L);
                ((TextView) childAt2).setTextColor(iM2889a5);
            }
            int iM2889a6 = C1517hw.m2889a(0, AbstractC0295Gu.m625r(-154601642784821L));
            if (iM2889a6 != 0) {
                View childAt3 = viewGroup3.getChildAt(1);
                AbstractC0295Gu.m625r(-153124174034997L);
                ((TextView) childAt3).setTextColor(iM2889a6);
            }
            View childAt4 = viewGroup3.getChildAt(1);
            AbstractC0295Gu.m625r(-152836411226165L);
            Drawable drawableM2890b5 = childAt4.getVisibility() == 0 ? c0089c22.m142d() ? C1517hw.m2890b(AbstractC0295Gu.m625r(-152905130702901L)) : C1517hw.m2890b(AbstractC0295Gu.m625r(-153089814296629L)) : c0089c22.m142d() ? C1517hw.m2890b(AbstractC0295Gu.m625r(-153819958736949L)) : C1517hw.m2890b(AbstractC0295Gu.m625r(-153420526778421L));
            if (drawableM2890b5 != null) {
                ViewParent parent4 = viewGroup3.getParent();
                AbstractC0295Gu.m625r(-153566555666485L);
                View childAt5 = ((ViewGroup) parent4).getChildAt(0);
                AbstractC0295Gu.m625r(-152174986262581L);
                ((ImageView) childAt5).setImageDrawable(C1517hw.m2890b(AbstractC0295Gu.m625r(-151891518421045L)));
                if (view5 != null) {
                    view5.setBackground(drawableM2890b5);
                    AbstractC0671Pj.m1347e(view5, c0089c22.m142d());
                }
                View viewM141c5 = c0089c2.m141c();
                AbstractC0295Gu.m625r(-152578713188405L);
                View viewM2810v = C1456gf.m2810v((ViewGroup) viewM141c5, AbstractC0295Gu.m625r(-152286655412277L));
                ViewParent parent5 = viewM2810v != null ? viewM2810v.getParent() : null;
                AbstractC0295Gu.m625r(-152505698744373L);
                ((ViewGroup) parent5).setAlpha(0.0f);
                AbstractC0295Gu.m625r(-151114129340469L);
                TextView textViewM2811w = C1456gf.m2811w((ViewGroup) view5, AbstractC0295Gu.m625r(-150822071564341L));
                ViewParent parent6 = textViewM2811w != null ? textViewM2811w.getParent() : null;
                AbstractC0295Gu.m625r(-150834956466229L);
                ((ViewGroup) parent6).setAlpha(0.0f);
            }
        } else if (num2 != null && num2.intValue() == 50) {
            c0089c2.m141c().setBackground(c0089c22.m142d() ? C1517hw.m2890b(AbstractC0295Gu.m625r(-155443456374837L)) : C1517hw.m2890b(AbstractC0295Gu.m625r(-155576600361013L)));
            AbstractC0671Pj.m1347e(c0089c2.m141c(), c0089c22.m142d());
            int iM2889a7 = C1517hw.m2889a(0, c0089c22.m142d() ? AbstractC0295Gu.m625r(-155155693566005L) : AbstractC0295Gu.m625r(-155301722454069L));
            if (iM2889a7 != 0) {
                View viewM141c6 = c0089c2.m141c();
                AbstractC0295Gu.m625r(-155993212188725L);
                ViewGroup viewGroup4 = (ViewGroup) viewM141c6;
                int childCount2 = viewGroup4.getChildCount();
                for (int i4 = 0; i4 < childCount2; i4++) {
                    View childAt6 = viewGroup4.getChildAt(i4);
                    if (childAt6 instanceof TextView) {
                        ((TextView) childAt6).setTextColor(iM2889a7);
                    } else {
                        Drawable drawableMutate = childAt6.getBackground().mutate();
                        drawableMutate.setColorFilter(new PorterDuffColorFilter(Color.argb(255, Color.red(iM2889a7), Color.green(iM2889a7), Color.blue(iM2889a7)), PorterDuff.Mode.SRC_ATOP));
                        drawableMutate.setAlpha(Color.alpha(iM2889a7));
                        childAt6.setBackground(drawableMutate);
                    }
                }
            }
        }
        HashMap map11 = AbstractC0999XA.f3193a;
        int iM2889a8 = C1517hw.m2889a(0, AbstractC0295Gu.m625r(-155331787225141L));
        if (iM2889a8 != 0 && (textView = (TextView) c0089c2.f200f) != null) {
            textView.setTextColor(iM2889a8);
        }
        return C0829TC.f2620a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03b9  */
    @Override // p000.InterfaceC1416fj
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo90g(Object obj) throws IllegalAccessException {
        Field[] fields;
        Object[] objArr;
        int i = this.f4108a;
        final int i2 = 1;
        final int i3 = 0;
        C0829TC c0829tc = C0829TC.f2620a;
        switch (i) {
            case 0:
                C1494hG c1494hG = (C1494hG) obj;
                AbstractC0295Gu.m625r(-189781719906357L);
                if (C1240c.f4218b.m2024e()) {
                    c1494hG.f5263a.m4864C(null);
                }
                return c0829tc;
            case 1:
                AbstractC0295Gu.m625r(-188493229717557L);
                C2428qs c2428qs = ((C1494hG) obj).f5263a;
                if (C1240c.f4218b.m2024e()) {
                    Object[] objArr2 = (Object[]) c2428qs.f8522c;
                    int length = objArr2.length;
                    while (i3 < length) {
                        Object obj2 = objArr2[i3];
                        if ((obj2 instanceof String) && ((String) obj2).startsWith(AbstractC0295Gu.m625r(-188076617889845L))) {
                            try {
                                JSONObject jSONObject = new JSONObject((String) obj2);
                                if (AbstractC0585Nj.m1134a(jSONObject.getString(AbstractC0295Gu.m625r(-188085207824437L)), AbstractC0295Gu.m625r(-188123862530101L))) {
                                    JSONObject jSONObject2 = jSONObject.getJSONObject(AbstractC0295Gu.m625r(-188196876974133L));
                                    jSONObject2.put(AbstractC0295Gu.m625r(-188218351810613L), AbstractC0295Gu.m625r(-188265596450869L));
                                    jSONObject.put(AbstractC0295Gu.m625r(-188269891418165L), jSONObject2);
                                    Object[] objArr3 = (Object[]) c2428qs.f8522c;
                                    objArr3[AbstractC0650P4.m1312G(obj2, objArr3)] = jSONObject.toString();
                                }
                            } catch (Exception unused) {
                            }
                        }
                        i3++;
                    }
                }
                return c0829tc;
            case 2:
                C1494hG c1494hG2 = (C1494hG) obj;
                AbstractC0295Gu.m625r(-188291366254645L);
                if (C1240c.f4218b.m2024e()) {
                    c1494hG2.f5263a.m4864C(Boolean.FALSE);
                }
                return c0829tc;
            case 3:
                C1494hG c1494hG3 = (C1494hG) obj;
                AbstractC0295Gu.m625r(-189837554481205L);
                if (C1240c.f4218b.m2024e()) {
                    Object obj3 = ((Object[]) c1494hG3.f5263a.f8522c)[0];
                    if (C1240c.f4219c == null) {
                        Field[] fields2 = obj3.getClass().getFields();
                        AbstractC0295Gu.m625r(-189893389056053L);
                        for (Field field : fields2) {
                            try {
                                C1538iG c1538iG = new C1538iG(field.getType());
                                c1538iG.m2921f(AbstractC0295Gu.m625r(-188308546123829L));
                                if (c1538iG.m2920e() != null) {
                                    C1240c.f4219c = field;
                                }
                            } catch (Exception unused2) {
                            }
                        }
                    }
                    Field field2 = C1240c.f4219c;
                    Object obj4 = field2 != null ? field2.get(obj3) : null;
                    if (obj4 != null && (fields = obj4.getClass().getFields()) != null) {
                        int length2 = fields.length;
                        while (i3 < length2) {
                            Field field3 = fields[i3];
                            try {
                                if (AbstractC0585Nj.m1134a(field3.getType(), String.class)) {
                                    Object obj5 = field3.get(obj4);
                                    String str = obj5 instanceof String ? (String) obj5 : null;
                                    if (str != null && str.length() != 0) {
                                        AbstractC0295Gu.m625r(-188372970633269L);
                                        if (new JSONObject(str).has(AbstractC0295Gu.m625r(-188424510240821L))) {
                                            field3.set(obj4, AbstractC0295Gu.m625r(-188480344815669L));
                                        }
                                    }
                                }
                            } catch (Exception unused3) {
                            }
                            i3++;
                        }
                    }
                }
                return c0829tc;
            case 4:
                AbstractC0295Gu.m625r(-462525028104245L);
                Object obj6 = ((C1494hG) obj).f5263a.f8521b;
                AbstractC0295Gu.m625r(-462580862679093L);
                Activity activity = (Activity) obj6;
                if (activity == null) {
                    C1456gf.f5173q = null;
                } else {
                    C1456gf.f5173q = new WeakReference(activity);
                }
                return c0829tc;
            case 5:
                AbstractC0295Gu.m625r(-461180703340597L);
                Object obj7 = ((C1494hG) obj).f5263a.f8521b;
                AbstractC0295Gu.m625r(-461236537915445L);
                Activity activity2 = (Activity) obj7;
                if (activity2 == null) {
                    C1456gf.f5173q = null;
                } else {
                    C1456gf.f5173q = new WeakReference(activity2);
                }
                return c0829tc;
            case 6:
                AbstractC0295Gu.m625r(-460935890204725L);
                Object obj8 = ((C1494hG) obj).f5263a.f8521b;
                AbstractC0295Gu.m625r(-461541480593461L);
                Activity activity3 = (Activity) obj8;
                if (activity3 == null) {
                    C1456gf.f5173q = null;
                } else {
                    C1456gf.f5173q = new WeakReference(activity3);
                }
                LuaUiScheduler.INSTANCE.onActivityResumed();
                return c0829tc;
            case 7:
                AbstractC0295Gu.m625r(-461790588696629L);
                Object obj9 = ((C1494hG) obj).f5263a.f8521b;
                AbstractC0295Gu.m625r(-461296667457589L);
                Activity activity4 = (Activity) obj9;
                if (activity4 == null) {
                    C1456gf.f5173q = null;
                } else {
                    C1456gf.f5173q = new WeakReference(activity4);
                }
                LuaUiScheduler.INSTANCE.onActivityResumed();
                return c0829tc;
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                AbstractC0295Gu.m625r(-459896508119093L);
                LuaUiScheduler.INSTANCE.onActivityPaused();
                return c0829tc;
            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                AbstractC0295Gu.m625r(-459952342693941L);
                LuaUiScheduler.INSTANCE.onActivityPaused();
                return c0829tc;
            case 10:
                AbstractC0295Gu.m625r(-460008177268789L);
                Object obj10 = ((C1494hG) obj).f5263a.f8521b;
                AbstractC0295Gu.m625r(-460064011843637L);
                Activity activity5 = (Activity) obj10;
                if (activity5 == null) {
                    C1456gf.f5173q = null;
                } else {
                    C1456gf.f5173q = new WeakReference(activity5);
                }
                return c0829tc;
            case 11:
                AbstractC0295Gu.m625r(-459763364132917L);
                Object obj11 = ((C1494hG) obj).f5263a.f8521b;
                AbstractC0295Gu.m625r(-459819198707765L);
                Activity activity6 = (Activity) obj11;
                if (activity6 == null) {
                    C1456gf.f5173q = null;
                } else {
                    C1456gf.f5173q = new WeakReference(activity6);
                }
                return c0829tc;
            case 12:
                Byte b = (Byte) obj;
                b.byteValue();
                String str2 = String.format(AbstractC0295Gu.m625r(-391632297916469L), Arrays.copyOf(new Object[]{b}, 1));
                AbstractC0295Gu.m625r(-391653772752949L);
                return str2;
            case 13:
                C1494hG c1494hG4 = (C1494hG) obj;
                AbstractC0295Gu.m625r(-187651416127541L);
                if (C1123a5.f3536b.m2024e()) {
                    Object obj12 = c1494hG4.f5263a.f8521b;
                    AbstractC0295Gu.m625r(-187707250702389L);
                    Activity activity7 = (Activity) obj12;
                    SharedPreferences sharedPreferences = AbstractC0599Nx.f1939a;
                    boolean zM1172a = AbstractC0599Nx.m1172a(AbstractC0295Gu.m625r(-186307091363893L), false);
                    boolean zM1172a2 = AbstractC0599Nx.m1172a(AbstractC0295Gu.m625r(-186358630971445L), false);
                    boolean zM1172a3 = AbstractC0599Nx.m1172a(AbstractC0295Gu.m625r(-185877594634293L), false);
                    int i4 = zM1172a;
                    if (zM1172a2) {
                        i4 = (zM1172a ? 1 : 0) | 2;
                    }
                    if (zM1172a3) {
                        i4 = (i4 == true ? 1 : 0) | 4;
                    }
                    activity7.getIntent().putExtra(AbstractC0295Gu.m625r(-185946314111029L), i4);
                }
                return c0829tc;
            case 14:
                C1494hG c1494hG5 = (C1494hG) obj;
                AbstractC0295Gu.m625r(-186066573195317L);
                if (C1123a5.f3536b.m2024e()) {
                    Object obj13 = c1494hG5.f5263a.f8521b;
                    C2648vx c2648vx = new C2648vx();
                    if (obj13 instanceof Class) {
                        c2648vx.f9163b = (Class) obj13;
                    } else {
                        c2648vx.f9164c = obj13;
                        c2648vx.f9163b = obj13 != null ? obj13.getClass() : null;
                    }
                    c2648vx.f9165d = Button.class;
                    Button button = (Button) c2648vx.m5178a();
                    if (button != null) {
                        button.callOnClick();
                    }
                }
                return c0829tc;
            case 15:
                C1494hG c1494hG6 = (C1494hG) obj;
                AbstractC0295Gu.m625r(-185168925030453L);
                if (C1246c5.f4237b.m2024e()) {
                    Object obj14 = c1494hG6.f5263a.f8521b;
                    AbstractC0295Gu.m625r(-185224759605301L);
                    ((Activity) obj14).getIntent().putExtra(AbstractC0295Gu.m625r(-184924111894581L), true);
                }
                return c0829tc;
            case 16:
                AbstractC0295Gu.m625r(-236708532582453L);
                C2428qs c2428qs2 = ((C1494hG) obj).f5263a;
                Field[] declaredFields = c2428qs2.f8521b.getClass().getDeclaredFields();
                AbstractC0295Gu.m625r(-236760072190005L);
                for (Field field4 : declaredFields) {
                    if (AbstractC0585Nj.m1134a(field4.getType(), Button.class)) {
                        field4.setAccessible(true);
                        Object obj15 = field4.get(c2428qs2.f8521b);
                        AbstractC0295Gu.m625r(-236858856437813L);
                        Button button2 = (Button) obj15;
                        button2.addTextChangedListener(new C1351e5(i3, button2));
                    }
                }
                return c0829tc;
            case 17:
                AbstractC0295Gu.m625r(-168555991529525L);
                C2428qs c2428qs3 = ((C1494hG) obj).f5263a;
                Object obj16 = c2428qs3.f8521b;
                AbstractC0295Gu.m625r(-168611826104373L);
                View view = (View) obj16;
                if (view == null ? false : Object.class.equals(view.getTag(R.id.tag_view_bg_ban))) {
                    ((Object[]) c2428qs3.f8522c)[0] = null;
                }
                return c0829tc;
            case 18:
                AbstractC0295Gu.m625r(-458655262570549L);
                C2428qs c2428qs4 = ((C1494hG) obj).f5263a;
                Object obj17 = c2428qs4.f8521b;
                AbstractC0295Gu.m625r(-458711097145397L);
                if (((View) obj17).getContext().getClass().getName().equals(AbstractC0295Gu.m625r(-459497076160565L)) && (objArr = (Object[]) c2428qs4.f8522c) != null) {
                    objArr[0] = 0;
                }
                return c0829tc;
            case 19:
                AbstractC0295Gu.m625r(-142824842459189L);
                ViewGroup viewGroup = (ViewGroup) ((Object[]) ((C1494hG) obj).f5263a.f8522c)[0];
                Context context = viewGroup.getContext();
                AbstractC0295Gu.m625r(-142876382066741L);
                Activity activity8 = (Activity) context;
                String name = activity8.getClass().getName();
                if (name.equals(AbstractC0295Gu.m625r(-142575734356021L))) {
                    final View view2 = new View(activity8);
                    HashMap map = AbstractC0999XA.f3193a;
                    view2.setBackground(C1517hw.m2890b(AbstractC0295Gu.m625r(-146922241259573L)));
                    View viewM2810v = C1456gf.m2810v(viewGroup, AbstractC0295Gu.m625r(-147055385245749L));
                    AbstractC0295Gu.m625r(-145620866168885L);
                    final ViewGroup viewGroup2 = (ViewGroup) viewM2810v;
                    C1456gf.m2807r(viewGroup2);
                    View childAt = viewGroup2.getChildAt(0);
                    AbstractC0295Gu.m625r(-145328808392757L);
                    final ViewGroup viewGroup3 = (ViewGroup) childAt;
                    ViewParent parent = viewGroup2.getParent();
                    AbstractC0295Gu.m625r(-146136262244405L);
                    C1456gf.m2805o(viewGroup3);
                    ((ViewGroup) parent).addView(view2, 0, new ViewGroup.LayoutParams(-1, C1456gf.m2814z(activity8) + new C2262n5(activity8).f7974a));
                    viewGroup3.post(new RunnableC0137D7(viewGroup3, activity8, i3));
                    viewGroup3.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: A7
                        @Override // android.view.View.OnLayoutChangeListener
                        public final void onLayoutChange(View view3, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
                            switch (i2) {
                                case 0:
                                    final int i13 = 1;
                                    final ViewGroup viewGroup4 = viewGroup3;
                                    final ViewGroup viewGroup5 = viewGroup2;
                                    final View view4 = view2;
                                    viewGroup4.post(new Runnable() { // from class: B7
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i13) {
                                                case 0:
                                                    Rect rect = new Rect();
                                                    Rect rect2 = new Rect();
                                                    viewGroup4.getGlobalVisibleRect(rect);
                                                    viewGroup5.getGlobalVisibleRect(rect2);
                                                    int i14 = rect.bottom - rect2.top;
                                                    if (i14 > 0) {
                                                        View view5 = view4;
                                                        ViewGroup.LayoutParams layoutParams = view5.getLayoutParams();
                                                        if (layoutParams.height != i14) {
                                                            layoutParams.height = i14;
                                                            view5.setLayoutParams(layoutParams);
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    Rect rect3 = new Rect();
                                                    Rect rect4 = new Rect();
                                                    viewGroup4.getGlobalVisibleRect(rect3);
                                                    viewGroup5.getGlobalVisibleRect(rect4);
                                                    int i15 = rect3.bottom - rect4.top;
                                                    if (i15 > 0) {
                                                        View view6 = view4;
                                                        ViewGroup.LayoutParams layoutParams2 = view6.getLayoutParams();
                                                        if (layoutParams2.height != i15) {
                                                            layoutParams2.height = i15;
                                                            view6.setLayoutParams(layoutParams2);
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                default:
                                    final int i14 = 0;
                                    final ViewGroup viewGroup6 = viewGroup3;
                                    final ViewGroup viewGroup7 = viewGroup2;
                                    final View view5 = view2;
                                    viewGroup6.post(new Runnable() { // from class: B7
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i14) {
                                                case 0:
                                                    Rect rect = new Rect();
                                                    Rect rect2 = new Rect();
                                                    viewGroup6.getGlobalVisibleRect(rect);
                                                    viewGroup7.getGlobalVisibleRect(rect2);
                                                    int i142 = rect.bottom - rect2.top;
                                                    if (i142 > 0) {
                                                        View view52 = view5;
                                                        ViewGroup.LayoutParams layoutParams = view52.getLayoutParams();
                                                        if (layoutParams.height != i142) {
                                                            layoutParams.height = i142;
                                                            view52.setLayoutParams(layoutParams);
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    Rect rect3 = new Rect();
                                                    Rect rect4 = new Rect();
                                                    viewGroup6.getGlobalVisibleRect(rect3);
                                                    viewGroup7.getGlobalVisibleRect(rect4);
                                                    int i15 = rect3.bottom - rect4.top;
                                                    if (i15 > 0) {
                                                        View view6 = view5;
                                                        ViewGroup.LayoutParams layoutParams2 = view6.getLayoutParams();
                                                        if (layoutParams2.height != i15) {
                                                            layoutParams2.height = i15;
                                                            view6.setLayoutParams(layoutParams2);
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                            }
                        }
                    });
                    View viewM2810v2 = C1456gf.m2810v(viewGroup, AbstractC0295Gu.m625r(-145844204468277L));
                    AbstractC0295Gu.m625r(-144383915587637L);
                    ViewGroup viewGroup4 = (ViewGroup) viewM2810v2;
                    AbstractC0295Gu.m625r(-210582246520885L);
                    viewGroup4.post(new RunnableC2745y7(viewGroup4, i2));
                } else if (name.equals(AbstractC0295Gu.m625r(-141051020965941L))) {
                    ViewGroup viewGroup5 = (ViewGroup) activity8.findViewById(android.R.id.content);
                    C1456gf.m2805o(viewGroup5);
                    ViewParent parent2 = viewGroup5.getParent();
                    AbstractC0295Gu.m625r(-144091857811509L);
                    View childAt2 = ((ViewGroup) parent2).getChildAt(1);
                    AbstractC0295Gu.m625r(-144899311663157L);
                    ViewGroup viewGroup6 = (ViewGroup) childAt2;
                    viewGroup.post(new RunnableC0137D7(activity8, viewGroup5));
                    viewGroup6.post(new RunnableC0137D7(viewGroup6, activity8, 2));
                    C1456gf.m2805o(viewGroup6);
                    ImageView imageView = new ImageView(activity8);
                    HashMap map2 = AbstractC0999XA.f3193a;
                    imageView.setBackground(C1517hw.m2890b(AbstractC0295Gu.m625r(-144607253887029L)));
                    imageView.setElevation(1.0f);
                    viewGroup5.addView(imageView, 0, new ViewGroup.LayoutParams(-1, C1456gf.m2814z(activity8) + new C2262n5(activity8).f7974a));
                    View viewM2810v3 = C1456gf.m2810v(viewGroup5, ListView.class.getName());
                    if (viewM2810v3 != null) {
                        viewM2810v3.setPadding(0, C1456gf.m2814z(activity8), 0, 0);
                        ImageView imageView2 = new ImageView(viewM2810v3.getContext());
                        imageView2.setImageDrawable(C1517hw.m2890b(AbstractC0295Gu.m625r(-142081813116981L)));
                        imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        viewGroup5.addView(imageView2, 0, new ViewGroup.LayoutParams(-1, -1));
                    }
                    View viewM2810v4 = C1456gf.m2810v(viewGroup, AbstractC0295Gu.m625r(-144753282775093L));
                    AbstractC0295Gu.m625r(-143318763698229L);
                    ViewGroup viewGroup7 = (ViewGroup) viewM2810v4;
                    C1456gf.m2807r(viewGroup7);
                    View viewM2810v5 = C1456gf.m2810v(viewGroup, AbstractC0295Gu.m625r(-143026705922101L));
                    AbstractC0295Gu.m625r(-143765440297013L);
                    ViewGroup viewGroup8 = (ViewGroup) viewM2810v5;
                    AbstractC0295Gu.m625r(-210582246520885L);
                    viewGroup8.post(new RunnableC2745y7(viewGroup8, i2));
                    ViewParent parent3 = viewGroup7.getParent();
                    AbstractC0295Gu.m625r(-144023138334773L);
                    ViewGroup viewGroup9 = (ViewGroup) parent3;
                    View childAt3 = viewGroup7.getChildAt(0);
                    AbstractC0295Gu.m625r(-143731080558645L);
                    ViewGroup viewGroup10 = (ViewGroup) childAt3;
                    viewGroup10.post(new RunnableC2745y7(viewGroup10, i3));
                    C1456gf.m2805o(viewGroup10);
                    FrameLayout frameLayout = new FrameLayout(viewGroup8.getContext());
                    frameLayout.setElevation(1.0f);
                    ImageView imageView3 = new ImageView(viewGroup8.getContext());
                    imageView3.setBackground(C1517hw.m2890b(AbstractC0295Gu.m625r(-142339511154741L)));
                    frameLayout.addView(imageView3, 0, new ViewGroup.LayoutParams(-1, C1456gf.m2814z(activity8) + C2262n5.m4599a(viewGroup8.getContext(), "status_bar_height")));
                    LinearLayout linearLayout = new LinearLayout(viewGroup8.getContext());
                    linearLayout.setOrientation(1);
                    Space space = new Space(viewGroup8.getContext());
                    Context contextCurrentApplication = MainApplication.f5549a;
                    if (contextCurrentApplication == null && (contextCurrentApplication = C1456gf.f5172p) == null) {
                        contextCurrentApplication = AndroidAppHelper.currentApplication();
                        AbstractC0295Gu.m625r(-836852902787125L);
                    }
                    AbstractC0295Gu.m625r(-838600954476597L);
                    linearLayout.addView(space, -1, C2262n5.m4599a(contextCurrentApplication, "status_bar_height"));
                    viewGroup7.removeView(viewGroup10);
                    linearLayout.addView(viewGroup10, -1, -2);
                    frameLayout.addView(linearLayout, -1, -2);
                    viewGroup9.addView(frameLayout, 0, new ViewGroup.LayoutParams(-1, -2));
                    viewGroup7.addView(new Space(activity8), 0, new ViewGroup.LayoutParams(-1, C1456gf.m2814z(activity8)));
                } else {
                    final ViewGroup viewGroup11 = (ViewGroup) activity8.findViewById(android.R.id.content);
                    ViewParent parent4 = viewGroup11.getParent();
                    AbstractC0295Gu.m625r(-149039660136501L);
                    View childAt4 = ((ViewGroup) parent4).getChildAt(1);
                    AbstractC0295Gu.m625r(-147648090732597L);
                    final ViewGroup viewGroup12 = (ViewGroup) childAt4;
                    View viewM2810v6 = C1456gf.m2810v(viewGroup, AbstractC0295Gu.m625r(-147356032956469L));
                    AbstractC0295Gu.m625r(-147570781321269L);
                    C1456gf.m2807r((ViewGroup) viewM2810v6);
                    if (activity8.getClass().getName().equals(AbstractC0295Gu.m625r(-148378235172917L))) {
                        View viewM2810v7 = C1456gf.m2810v(viewGroup, AbstractC0295Gu.m625r(-147991688116277L));
                        ViewGroup.LayoutParams layoutParams = viewM2810v7 != null ? viewM2810v7.getLayoutParams() : null;
                        AbstractC0295Gu.m625r(-146561464006709L);
                        ((FrameLayout.LayoutParams) layoutParams).topMargin = C1456gf.m2814z(activity8);
                    }
                    C1456gf.m2805o(viewGroup12);
                    final View view3 = new View(activity8);
                    HashMap map3 = AbstractC0999XA.f3193a;
                    view3.setBackground(C1517hw.m2890b(AbstractC0295Gu.m625r(-146342420674613L)));
                    view3.setElevation(1.0f);
                    viewGroup11.addView(view3, 0, new ViewGroup.LayoutParams(-1, C1456gf.m2814z(activity8) + new C2262n5(activity8).f7974a));
                    viewGroup12.post(new RunnableC2788z7(viewGroup12, activity8, viewGroup11, i3));
                    viewGroup12.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: A7
                        @Override // android.view.View.OnLayoutChangeListener
                        public final void onLayoutChange(View view32, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
                            switch (i3) {
                                case 0:
                                    final int i13 = 1;
                                    final ViewGroup viewGroup42 = viewGroup12;
                                    final ViewGroup viewGroup52 = viewGroup11;
                                    final View view4 = view3;
                                    viewGroup42.post(new Runnable() { // from class: B7
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i13) {
                                                case 0:
                                                    Rect rect = new Rect();
                                                    Rect rect2 = new Rect();
                                                    viewGroup42.getGlobalVisibleRect(rect);
                                                    viewGroup52.getGlobalVisibleRect(rect2);
                                                    int i142 = rect.bottom - rect2.top;
                                                    if (i142 > 0) {
                                                        View view52 = view4;
                                                        ViewGroup.LayoutParams layoutParams2 = view52.getLayoutParams();
                                                        if (layoutParams2.height != i142) {
                                                            layoutParams2.height = i142;
                                                            view52.setLayoutParams(layoutParams2);
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    Rect rect3 = new Rect();
                                                    Rect rect4 = new Rect();
                                                    viewGroup42.getGlobalVisibleRect(rect3);
                                                    viewGroup52.getGlobalVisibleRect(rect4);
                                                    int i15 = rect3.bottom - rect4.top;
                                                    if (i15 > 0) {
                                                        View view6 = view4;
                                                        ViewGroup.LayoutParams layoutParams22 = view6.getLayoutParams();
                                                        if (layoutParams22.height != i15) {
                                                            layoutParams22.height = i15;
                                                            view6.setLayoutParams(layoutParams22);
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                default:
                                    final int i14 = 0;
                                    final ViewGroup viewGroup62 = viewGroup12;
                                    final ViewGroup viewGroup72 = viewGroup11;
                                    final View view5 = view3;
                                    viewGroup62.post(new Runnable() { // from class: B7
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i14) {
                                                case 0:
                                                    Rect rect = new Rect();
                                                    Rect rect2 = new Rect();
                                                    viewGroup62.getGlobalVisibleRect(rect);
                                                    viewGroup72.getGlobalVisibleRect(rect2);
                                                    int i142 = rect.bottom - rect2.top;
                                                    if (i142 > 0) {
                                                        View view52 = view5;
                                                        ViewGroup.LayoutParams layoutParams2 = view52.getLayoutParams();
                                                        if (layoutParams2.height != i142) {
                                                            layoutParams2.height = i142;
                                                            view52.setLayoutParams(layoutParams2);
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    Rect rect3 = new Rect();
                                                    Rect rect4 = new Rect();
                                                    viewGroup62.getGlobalVisibleRect(rect3);
                                                    viewGroup72.getGlobalVisibleRect(rect4);
                                                    int i15 = rect3.bottom - rect4.top;
                                                    if (i15 > 0) {
                                                        View view6 = view5;
                                                        ViewGroup.LayoutParams layoutParams22 = view6.getLayoutParams();
                                                        if (layoutParams22.height != i15) {
                                                            layoutParams22.height = i15;
                                                            view6.setLayoutParams(layoutParams22);
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                            }
                        }
                    });
                    View viewM2810v8 = C1456gf.m2810v(viewGroup, AbstractC0295Gu.m625r(-146475564660789L));
                    AbstractC0295Gu.m625r(-147214299035701L);
                    ViewGroup viewGroup13 = (ViewGroup) viewM2810v8;
                    AbstractC0295Gu.m625r(-210582246520885L);
                    viewGroup13.post(new RunnableC2745y7(viewGroup13, i2));
                }
                return c0829tc;
            case LuaJitConsts.LUA_MINSTACK /* 20 */:
                AbstractC0295Gu.m625r(-140758963189813L);
                Object obj18 = ((C1494hG) obj).f5263a.f8521b;
                AbstractC0295Gu.m625r(-140887812208693L);
                ViewGroup viewGroup14 = (ViewGroup) obj18;
                String name2 = viewGroup14.getContext().getClass().getName();
                switch (name2.hashCode()) {
                    case -1539430146:
                        if (name2.equals(AbstractC0295Gu.m625r(-141695266060341L))) {
                            HashMap map4 = AbstractC0999XA.f3193a;
                            Drawable drawableM2890b = C1517hw.m2890b(AbstractC0295Gu.m625r(-142734648145973L));
                            if (drawableM2890b != null) {
                                viewGroup14.post(new RunnableC2260n3(i2, viewGroup14, drawableM2890b));
                            }
                        }
                        return c0829tc;
                    case 831517504:
                        if (name2.equals(AbstractC0295Gu.m625r(-157689724270645L))) {
                        }
                        return c0829tc;
                    case 1414355821:
                        if (name2.equals(AbstractC0295Gu.m625r(-141403208284213L))) {
                        }
                        return c0829tc;
                    case 1617560950:
                        if (name2.equals(AbstractC0295Gu.m625r(-157565170219061L))) {
                        }
                        return c0829tc;
                    default:
                        return c0829tc;
                }
            case 21:
                AbstractC0295Gu.m625r(-157303177214005L);
                Object obj19 = ((C1494hG) obj).f5263a.f8521b;
                AbstractC0295Gu.m625r(-157432026232885L);
                ((View) obj19).setAlpha(0.0f);
                return c0829tc;
            case 22:
                C1494hG c1494hG7 = (C1494hG) obj;
                AbstractC0295Gu.m625r(-158218005248053L);
                HashMap map5 = AbstractC0999XA.f3193a;
                Drawable drawableM2890b2 = C1517hw.m2890b(AbstractC0295Gu.m625r(-142734648145973L));
                if (drawableM2890b2 != null) {
                    Object obj20 = c1494hG7.f5263a.f8521b;
                    C2648vx c2648vx2 = new C2648vx();
                    if (obj20 instanceof Class) {
                        c2648vx2.f9163b = (Class) obj20;
                    } else {
                        c2648vx2.f9164c = obj20;
                        c2648vx2.f9163b = obj20 != null ? obj20.getClass() : null;
                    }
                    c2648vx2.f9165d = ImageView.class;
                    ImageView imageView4 = (ImageView) c2648vx2.m5178a();
                    if (imageView4 != null) {
                        ViewParent parent5 = imageView4.getParent();
                        AbstractC0295Gu.m625r(-158269544855605L);
                        View childAt5 = ((ViewGroup) parent5).getChildAt(0);
                        AbstractC0295Gu.m625r(-157977487079477L);
                        ImageView imageView5 = (ImageView) childAt5;
                        if (imageView5.getDrawable() instanceof ColorDrawable) {
                            imageView5.setImageDrawable(drawableM2890b2);
                        }
                    }
                }
                return c0829tc;
            case 23:
                C1494hG c1494hG8 = (C1494hG) obj;
                AbstractC0295Gu.m625r(-156594507610165L);
                HashMap map6 = AbstractC0999XA.f3193a;
                Drawable drawableM2890b3 = C1517hw.m2890b(AbstractC0295Gu.m625r(-142734648145973L));
                if (drawableM2890b3 != null) {
                    Object obj21 = c1494hG8.f5263a.f8521b;
                    AbstractC0295Gu.m625r(-156173600815157L);
                    ((ImageView) obj21).setImageDrawable(drawableM2890b3);
                }
                return c0829tc;
            case 24:
                return m2317c(obj);
            case 25:
                AbstractC0295Gu.m625r(-197598560385077L);
                C2428qs c2428qs5 = ((C1494hG) obj).f5263a;
                Object obj22 = c2428qs5.f8521b;
                Object[] objArr4 = (Object[]) c2428qs5.f8522c;
                Class<? super Object> superclass = obj22.getClass().getSuperclass();
                if (AbstractC0585Nj.m1134a(superclass != null ? superclass.getCanonicalName() : null, ClickableSpan.class.getCanonicalName())) {
                    HashMap map7 = AbstractC0999XA.f3193a;
                    int iM2889a = C1517hw.m2889a(0, AbstractC0295Gu.m625r(-196005127518261L));
                    if (iM2889a != 0) {
                        Object obj23 = objArr4[0];
                        AbstractC0295Gu.m625r(-196125386602549L);
                        int iIntValue = ((Integer) obj23).intValue();
                        Object obj24 = objArr4[1];
                        AbstractC0295Gu.m625r(-195781789218869L);
                        int iIntValue2 = ((Integer) obj24).intValue();
                        if ((iIntValue == -11048043 && iIntValue2 == 436207616) || (iIntValue == -13152126 && iIntValue2 == 234881023)) {
                            String strM625r = AbstractC0295Gu.m625r(-195987947649077L);
                            AbstractC0295Gu.m625r(-836659629258805L);
                            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                            int i5 = 0;
                            while (true) {
                                if (i5 < stackTrace.length) {
                                    int i6 = i5 + 1;
                                    try {
                                        String string = stackTrace[i5].toString();
                                        AbstractC0295Gu.m625r(-836681104095285L);
                                        if (!AbstractC2564tz.m5051L(string, strM625r, false)) {
                                            i5 = i6;
                                        }
                                    } catch (ArrayIndexOutOfBoundsException e) {
                                        throw new NoSuchElementException(e.getMessage());
                                    }
                                } else {
                                    objArr4[0] = Integer.valueOf(iM2889a);
                                    objArr4[1] = Integer.valueOf(Color.argb(66, Color.red(iM2889a), Color.green(iM2889a), Color.blue(iM2889a)));
                                }
                            }
                        }
                    }
                }
                return c0829tc;
            case 26:
                AbstractC0295Gu.m625r(-274169237338165L);
                Object obj25 = ((C1494hG) obj).f5263a.f8521b;
                AbstractC0295Gu.m625r(-274298086357045L);
                EditText editText = (EditText) obj25;
                if (editText.getClass().getName().equals(AbstractC0295Gu.m625r(-274010323548213L))) {
                    C0180E7 c0180e7 = C0180E7.f531b;
                    if (c0180e7.m2024e()) {
                        String strM2023c = c0180e7.m2023c();
                        if (strM2023c != null && strM2023c.length() != 0) {
                            editText.setHint(strM2023c);
                        }
                    } else {
                        HashMap map8 = AbstractC0999XA.f3193a;
                        String strM2892d = C1517hw.m2892d(AbstractC0295Gu.m625r(-274714698184757L), AbstractC0295Gu.m625r(-274830662301749L));
                        if (strM2892d.length() > 0) {
                            editText.setHint(strM2892d);
                        }
                    }
                }
                return c0829tc;
            case 27:
                AbstractC0295Gu.m625r(-274834957269045L);
                C2428qs c2428qs6 = ((C1494hG) obj).f5263a;
                Object obj26 = c2428qs6.f8521b;
                Object[] objArr5 = (Object[]) c2428qs6.f8522c;
                AbstractC0295Gu.m625r(-274341036030005L);
                if (((TextView) obj26).getClass().getName().equals(AbstractC0295Gu.m625r(-274603029035061L))) {
                    C0180E7 c0180e72 = C0180E7.f531b;
                    if (c0180e72.m2024e()) {
                        String strM2023c2 = c0180e72.m2023c();
                        if (strM2023c2 != null && strM2023c2.length() != 0) {
                            objArr5[0] = strM2023c2;
                        }
                    } else {
                        HashMap map9 = AbstractC0999XA.f3193a;
                        String strM2892d2 = C1517hw.m2892d(AbstractC0295Gu.m625r(-273108380416053L), AbstractC0295Gu.m625r(-273224344533045L));
                        if (strM2892d2.length() > 0) {
                            objArr5[0] = strM2892d2;
                        }
                    }
                }
                return c0829tc;
            case 28:
                AbstractC0295Gu.m625r(-196769631696949L);
                Object obj27 = ((C1494hG) obj).f5263a.f8521b;
                AbstractC0295Gu.m625r(-196348724901941L);
                EditText editText2 = (EditText) obj27;
                if (editText2.getClass().getName().equals(AbstractC0295Gu.m625r(-194961450465333L))) {
                    HashMap map10 = AbstractC0999XA.f3193a;
                    String strM2892d3 = C1517hw.m2892d(AbstractC0295Gu.m625r(-195116069287989L), AbstractC0295Gu.m625r(-194682277591093L));
                    if (strM2892d3.length() > 0 && !C0180E7.f531b.m2024e()) {
                        editText2.setHint(strM2892d3);
                    }
                    editText2.setHintTextColor(C1517hw.m2889a(-7829368, AbstractC0295Gu.m625r(-194686572558389L)));
                    int iM2889a2 = C1517hw.m2889a(0, AbstractC0295Gu.m625r(-194806831642677L));
                    if (iM2889a2 != 0) {
                        editText2.setTag(R.id.tag_textview_color_ban, null);
                        editText2.setTextColor(iM2889a2);
                        editText2.setTag(R.id.tag_textview_color_ban, TextView.class);
                    }
                }
                return c0829tc;
            default:
                AbstractC0295Gu.m625r(-195476846540853L);
                Object obj28 = ((C1494hG) obj).f5263a.f8521b;
                AbstractC0295Gu.m625r(-195605695559733L);
                FrameLayout frameLayout2 = (FrameLayout) obj28;
                HashMap map11 = AbstractC0999XA.f3193a;
                Drawable drawableM2890b4 = C1517hw.m2890b(AbstractC0295Gu.m625r(-195330817652789L));
                if (drawableM2890b4 != null) {
                    frameLayout2.getChildAt(0).setAlpha(0.0f);
                    Context context2 = frameLayout2.getContext();
                    AbstractC0295Gu.m625r(-193827579099189L);
                    ImageView imageViewM2808t = C1456gf.m2808t(context2, drawableM2890b4);
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(AbstractC0295Gu.m616i(25), AbstractC0295Gu.m616i(25));
                    layoutParams2.gravity = 17;
                    frameLayout2.addView(imageViewM2808t, layoutParams2);
                }
                return c0829tc;
        }
    }
}
