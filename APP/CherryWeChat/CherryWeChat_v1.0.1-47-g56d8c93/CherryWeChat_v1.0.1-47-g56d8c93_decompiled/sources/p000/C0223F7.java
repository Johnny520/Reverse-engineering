package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import io.github.cherrywechat.R;
import io.github.cherrywechat.lua.api.CherryGlobalAPI;
import io.github.cherrywechat.lua.api.CherryNetworkAPI;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: F7 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0223F7 implements InterfaceC1416fj {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f657a;

    public /* synthetic */ C0223F7(int i) {
        this.f657a = i;
    }

    /* JADX INFO: renamed from: c */
    private final Object m438c(Object obj) {
        AbstractC0295Gu.m625r(-494947736221749L);
        return ((EnumC0319Hb) obj).name();
    }

    /* JADX INFO: renamed from: e */
    private final Object m439e(Object obj) {
        Class[] clsArr = (Class[]) obj;
        AbstractC0295Gu.m625r(-21500606281781L);
        boolean z = false;
        if (clsArr.length == 3 && AbstractC0585Nj.m1134a(clsArr[0], String.class) && AbstractC0585Nj.m1134a(clsArr[2], Integer.TYPE)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: f */
    private final Object m440f(Object obj) {
        C1494hG c1494hG = (C1494hG) obj;
        AbstractC0295Gu.m625r(-21513491183669L);
        if (C0577Nb.f1872b.m2024e()) {
            try {
                Object obj2 = ((Object[]) c1494hG.f5263a.f8522c)[0];
                String str = obj2 instanceof String ? (String) obj2 : null;
                if (str != null && (str.startsWith(AbstractC0295Gu.m625r(-21569325758517L)) || str.startsWith(AbstractC0295Gu.m625r(-20551418509365L)))) {
                    if (C0577Nb.f1873c == EnumC0319Hb.f1048c) {
                        ((Object[]) c1494hG.f5263a.f8522c)[0] = AbstractC0085Bz.m133K(str, AbstractC0295Gu.m625r(-19378892437557L), AbstractC0295Gu.m625r(-17888538785845L));
                    } else if (C0577Nb.f1873c == EnumC0319Hb.f1049d) {
                        ((Object[]) c1494hG.f5263a.f8522c)[0] = AbstractC0085Bz.m133K(str, AbstractC0295Gu.m625r(-17721035061301L), AbstractC0295Gu.m625r(-18429704665141L));
                    } else if (C0577Nb.f1873c == EnumC0319Hb.f1050e) {
                        ((Object[]) c1494hG.f5263a.f8522c)[0] = AbstractC0085Bz.m133K(AbstractC0085Bz.m133K(str, AbstractC0295Gu.m625r(-18184891529269L), AbstractC0295Gu.m625r(-18373870090293L)), AbstractC0295Gu.m625r(-18378165057589L), C0577Nb.m1119g(false));
                    } else if (C0577Nb.f1873c == EnumC0319Hb.f1051f) {
                        ((Object[]) c1494hG.f5263a.f8522c)[0] = AbstractC0085Bz.m133K(str, AbstractC0295Gu.m625r(-34479997450293L), AbstractC0295Gu.m625r(-34089155426357L) + C0577Nb.m1119g(false));
                    } else if (C0577Nb.f1873c == EnumC0319Hb.f1052g) {
                        ((Object[]) c1494hG.f5263a.f8522c)[0] = AbstractC0085Bz.m133K(AbstractC0085Bz.m133K(str, AbstractC0295Gu.m625r(-34286723921973L), AbstractC0295Gu.m625r(-35025458296885L)), AbstractC0295Gu.m625r(-35029753264181L), C0577Nb.m1119g(true));
                    }
                }
            } catch (Exception unused) {
            }
        }
        return C0829TC.f2620a;
    }

    /* JADX INFO: renamed from: h */
    private final Object m441h(Object obj) {
        AbstractC0295Gu.m625r(-34638911240245L);
        return AbstractC0295Gu.m625r(-34668976011317L) + ((String) obj) + '\'';
    }

    /* JADX INFO: renamed from: i */
    private final Object m442i(Object obj) {
        AbstractC0295Gu.m625r(-34789235095605L);
        return AbstractC0295Gu.m625r(-34819299866677L) + ((String) obj) + '\'';
    }

    /* JADX INFO: renamed from: j */
    private final Object m443j(Object obj) throws IllegalAccessException {
        AbstractC0295Gu.m625r(-53992033876021L);
        C2428qs c2428qs = ((C1494hG) obj).f5263a;
        Field[] fields = c2428qs.f8521b.getClass().getFields();
        AbstractC0295Gu.m625r(-54043573483573L);
        for (Field field : fields) {
            if (AbstractC0585Nj.m1134a(field.getType(), View.class)) {
                Object obj2 = field.get(c2428qs.f8521b);
                AbstractC0295Gu.m625r(-54107997993013L);
                View view = (View) obj2;
                if (view.getClass().equals(View.class)) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if ((layoutParams instanceof FrameLayout.LayoutParams) && ((FrameLayout.LayoutParams) layoutParams).width == -1) {
                        view.setBackground(null);
                        view.setTag(R.id.tag_view_bg_ban, Object.class);
                    }
                }
            }
        }
        return C0829TC.f2620a;
    }

    /* JADX WARN: Removed duplicated region for block: B:301:0x0eb4  */
    /* JADX WARN: Type inference failed for: r3v95, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v41, types: [java.lang.Object, java.util.Map] */
    @Override // p000.InterfaceC1416fj
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo90g(Object obj) throws IllegalAccessException {
        ImageView imageView;
        Object tag;
        int i;
        SimpleDateFormat simpleDateFormat;
        int i2 = this.f657a;
        int i3 = 3;
        int i4 = 2;
        int i5 = 8;
        int i6 = 1;
        C0829TC c0829tc = C0829TC.f2620a;
        switch (i2) {
            case 0:
                AbstractC0295Gu.m625r(-193969313019957L);
                Object[] objArr = (Object[]) ((C1494hG) obj).f5263a.f8522c;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                AbstractC0295Gu.m625r(-194020852627509L);
                int iIntValue = ((Integer) obj3).intValue();
                Field[] fields = obj2.getClass().getFields();
                AbstractC0295Gu.m625r(-193677255243829L);
                int length = fields.length;
                int i7 = 0;
                while (i7 < length) {
                    Field field = fields[i7];
                    if (AbstractC0585Nj.m1134a(field.getType(), ImageView.class)) {
                        Object obj4 = field.get(obj2);
                        AbstractC0295Gu.m625r(-193741679753269L);
                        ViewParent parent = ((ImageView) obj4).getParent();
                        AbstractC0295Gu.m625r(-194557723539509L);
                        ViewGroup viewGroup = (ViewGroup) parent;
                        HashMap map = AbstractC0999XA.f3193a;
                        Drawable drawableM2890b = C1517hw.m2890b(iIntValue != 0 ? iIntValue != 1 ? iIntValue != 2 ? iIntValue != i3 ? AbstractC0295Gu.m625r(-210870009329717L) : AbstractC0295Gu.m625r(-210161339725877L) : AbstractC0295Gu.m625r(-210552181749813L) : AbstractC0295Gu.m625r(-210380383057973L) : AbstractC0295Gu.m625r(-194265665763381L));
                        if (drawableM2890b != null) {
                            if (!AbstractC0585Nj.m1134a(viewGroup.getChildAt(viewGroup.getChildCount() - 1).getTag(), AbstractC0295Gu.m625r(-211028923119669L))) {
                                int childCount = viewGroup.getChildCount();
                                for (int i8 = 0; i8 < childCount; i8++) {
                                    viewGroup.getChildAt(i8).setAlpha(0.0f);
                                }
                                Context context = viewGroup.getContext();
                                AbstractC0295Gu.m625r(-211046102988853L);
                                View viewM2808t = C1456gf.m2808t(context, drawableM2890b);
                                viewM2808t.setTag(AbstractC0295Gu.m625r(-210565066651701L));
                                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AbstractC0295Gu.m616i(30), AbstractC0295Gu.m616i(30));
                                layoutParams.addRule(13);
                                viewGroup.addView(viewM2808t, layoutParams);
                            }
                        }
                    }
                    i7++;
                    i3 = 3;
                }
                return c0829tc;
            case 1:
                AbstractC0295Gu.m625r(-182020714002485L);
                Object result = ((XC_MethodHook.MethodHookParam) ((C1494hG) obj).f5263a.f8523d).getResult();
                View view = result instanceof View ? (View) result : null;
                if (view != null) {
                    AbstractC0295Gu.m625r(-191697275320373L);
                    for (String str : AbstractC0585Nj.m1157y().keySet()) {
                        ImageView imageViewM2813y = C1456gf.m2813y((ViewGroup) view, str);
                        if (imageViewM2813y != null) {
                            ViewParent parent2 = imageViewM2813y.getParent().getParent();
                            AbstractC0295Gu.m625r(-191718750156853L);
                            ViewGroup viewGroup2 = (ViewGroup) parent2;
                            View childAt = viewGroup2.getChildAt(0);
                            AbstractC0295Gu.m625r(-191426692380725L);
                            ViewGroup viewGroup3 = (ViewGroup) childAt;
                            HashMap map2 = AbstractC0999XA.f3193a;
                            int iM2889a = C1517hw.m2889a(0, AbstractC0295Gu.m625r(-192234146232373L));
                            if (iM2889a != 0) {
                                View childAt2 = viewGroup2.getChildAt(1);
                                AbstractC0295Gu.m625r(-192345815382069L);
                                C1456gf.m2797O((TextView) childAt2, iM2889a);
                            }
                            Float fValueOf = Float.valueOf(40.0f);
                            if (viewGroup3.getChildCount() == 3) {
                                viewGroup3.getChildAt(2).setAlpha(0.0f);
                                viewGroup3.getChildAt(1).setAlpha(0.0f);
                                viewGroup3.getChildAt(0).setAlpha(0.0f);
                                imageView = new ImageView(viewGroup3.getContext());
                                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(AbstractC0295Gu.m616i(fValueOf), AbstractC0295Gu.m616i(fValueOf));
                                layoutParams2.addRule(13);
                                viewGroup3.addView(imageView, layoutParams2);
                            } else {
                                View childAt3 = viewGroup3.getChildAt(3);
                                AbstractC0295Gu.m625r(-192058052573237L);
                                imageView = (ImageView) childAt3;
                            }
                            Drawable drawableM2890b2 = C1517hw.m2890b((String) AbstractC0585Nj.m1157y().get(str));
                            if (drawableM2890b2 != null) {
                                imageView.setImageDrawable(drawableM2890b2);
                            }
                        }
                    }
                }
                return c0829tc;
            case 2:
                AbstractC0295Gu.m625r(-181818850539573L);
                Object obj5 = ((C1494hG) obj).f5263a.f8521b;
                AbstractC0295Gu.m625r(-181947699558453L);
                C1456gf.m2805o((ViewGroup) obj5);
                return c0829tc;
            case 3:
                AbstractC0295Gu.m625r(-181655641782325L);
                Object obj6 = ((C1494hG) obj).f5263a.f8521b;
                AbstractC0295Gu.m625r(-182334246615093L);
                View view2 = (View) obj6;
                if (view2 != null) {
                    view2.setBackground(null);
                    view2.setTag(R.id.tag_view_bg_ban, Object.class);
                }
                return c0829tc;
            case 4:
                AbstractC0295Gu.m625r(-180521770416181L);
                Object obj7 = ((C1494hG) obj).f5263a.f8521b;
                AbstractC0295Gu.m625r(-180577604991029L);
                Intent intent = ((Activity) obj7).getIntent();
                intent.removeExtra(AbstractC0295Gu.m625r(-181376468908085L));
                intent.putExtra(AbstractC0295Gu.m625r(-180972741982261L), 0);
                intent.putExtra(AbstractC0295Gu.m625r(-181050051393589L), false);
                intent.putExtra(AbstractC0295Gu.m625r(-181110180935733L), 0);
                intent.putExtra(AbstractC0295Gu.m625r(-181144540674101L), 0);
                intent.removeExtra(AbstractC0295Gu.m625r(-179667071924277L));
                intent.removeExtra(AbstractC0295Gu.m625r(-179259050031157L));
                intent.putExtra(AbstractC0295Gu.m625r(-179400783951925L), 0);
                intent.putExtra(AbstractC0295Gu.m625r(-179478093363253L), 0);
                intent.removeExtra(AbstractC0295Gu.m625r(-180173878065205L));
                intent.removeExtra(AbstractC0295Gu.m625r(-180234007607349L));
                intent.removeExtra(AbstractC0295Gu.m625r(-179791625975861L));
                intent.removeExtra(AbstractC0295Gu.m625r(-179899000158261L));
                intent.removeExtra(AbstractC0295Gu.m625r(-180002079373365L));
                intent.removeExtra(AbstractC0295Gu.m625r(-178455891146805L));
                intent.removeExtra(AbstractC0295Gu.m625r(-178593330100277L));
                intent.removeExtra(AbstractC0295Gu.m625r(-178181013239861L));
                intent.removeExtra(AbstractC0295Gu.m625r(-178318452193333L));
                intent.removeExtra(AbstractC0295Gu.m625r(-179005646960693L));
                intent.removeExtra(AbstractC0295Gu.m625r(-179065776502837L));
                intent.removeExtra(AbstractC0295Gu.m625r(-178704999249973L));
                String stringExtra = intent.getStringExtra(AbstractC0295Gu.m625r(-178889682843701L));
                intent.putExtra(AbstractC0295Gu.m625r(-177304839911477L), stringExtra != null ? AbstractC0085Bz.m133K(stringExtra, AbstractC0295Gu.m625r(-177369264420917L), AbstractC0295Gu.m625r(-177429393963061L)) : null);
                return c0829tc;
            case 5:
                AbstractC0295Gu.m625r(-177437983897653L);
                Object obj8 = ((C1494hG) obj).f5263a.f8521b;
                AbstractC0295Gu.m625r(-177489523505205L);
                Activity activity = (Activity) obj8;
                C2648vx c2648vx = new C2648vx();
                c2648vx.f9164c = activity;
                c2648vx.f9163b = activity != null ? activity.getClass() : null;
                c2648vx.f9165d = ViewGroup.class;
                ViewGroup viewGroup4 = (ViewGroup) c2648vx.m5178a();
                HashMap map3 = AbstractC0999XA.f3193a;
                Drawable drawableM2890b3 = C1517hw.m2890b(AbstractC0295Gu.m625r(-177188875794485L));
                if (drawableM2890b3 != null) {
                    activity.getIntent().putExtra(AbstractC0295Gu.m625r(-177897545398325L), true);
                    ViewGroup viewGroupM1493o = AbstractC0714Qj.m1493o(viewGroup4);
                    if (viewGroupM1493o != null) {
                        viewGroupM1493o.setBackground(drawableM2890b3);
                        viewGroupM1493o.getChildAt(1).setAlpha(0.0f);
                    }
                    Drawable drawableM2890b4 = C1517hw.m2890b(AbstractC0295Gu.m625r(-177919020234805L));
                    if (drawableM2890b4 != null) {
                        View viewM1495q = AbstractC0714Qj.m1495q(viewGroup4);
                        if (viewM1495q != null) {
                            viewM1495q.setAlpha(0.0f);
                        }
                        View viewM1494p = AbstractC0714Qj.m1494p(viewGroup4);
                        if (viewM1494p != null) {
                            viewM1494p.setBackground(drawableM2890b4);
                        }
                    }
                    int iM2889a2 = C1517hw.m2889a(0, AbstractC0295Gu.m625r(-178077934024757L));
                    if (iM2889a2 != 0) {
                        C1456gf.m2795M(viewGroup4, iM2889a2, iM2889a2, true);
                    }
                }
                return c0829tc;
            case 6:
                AbstractC0295Gu.m625r(-273404733159477L);
                C2428qs c2428qs = ((C1494hG) obj).f5263a;
                try {
                    Object[] objArr2 = (Object[]) c2428qs.f8522c;
                    Object obj9 = c2428qs.f8521b;
                    Object obj10 = objArr2[0];
                    Object obj11 = objArr2[1];
                    AbstractC0295Gu.m625r(-273456272767029L);
                    Integer num = (Integer) obj11;
                    int iIntValue2 = num.intValue();
                    C2648vx c2648vx2 = new C2648vx();
                    if (obj10 instanceof Class) {
                        c2648vx2.f9163b = (Class) obj10;
                    } else {
                        c2648vx2.f9164c = obj10;
                        c2648vx2.f9163b = obj10 != null ? obj10.getClass() : null;
                    }
                    c2648vx2.f9165d = View.class;
                    View view3 = (View) c2648vx2.m5178a();
                    if (view3 != null && (tag = view3.getTag()) != null) {
                        C0089C2 c0089c2 = new C0089C2(1, tag);
                        ImageView imageView2 = (ImageView) c0089c2.f196b;
                        if (imageView2 != null) {
                            if (!C0395J7.f1333b.m2024e()) {
                                imageView2.setVisibility(0);
                            } else if (C0395J7.m832f(c0089c2, obj9, iIntValue2)) {
                                imageView2.setVisibility(0);
                                TextView textView = (TextView) c0089c2.f201g;
                                if (textView != null) {
                                    C1538iG c1538iG = new C1538iG(obj9);
                                    c1538iG.m2921f(AbstractC0295Gu.m625r(-254420977711157L));
                                    Object objM2918c = c1538iG.m2918c(null, num);
                                    AbstractC0295Gu.m625r(-165558104356917L);
                                    String strM625r = AbstractC0295Gu.m625r(-165579579193397L);
                                    AbstractC0295Gu.m625r(-578325936338997L);
                                    Object objCallMethod = XposedHelpers.callMethod(objM2918c, strM625r, Arrays.copyOf(new Object[0], 0));
                                    AbstractC0295Gu.m625r(-165639708735541L);
                                    String strM625r2 = AbstractC0295Gu.m625r(-164200894691381L);
                                    AbstractC0295Gu.m625r(-578325936338997L);
                                    Object objCallMethod2 = XposedHelpers.callMethod(objM2918c, strM625r2, Arrays.copyOf(new Object[0], 0));
                                    AbstractC0295Gu.m625r(-164235254429749L);
                                    C2648vx c2648vxM2685J = AbstractC1406fG.m2685J(objM2918c);
                                    c2648vxM2685J.m5180c(AbstractC0295Gu.m625r(-163891657046069L));
                                    C2648vx c2648vxM2685J2 = AbstractC1406fG.m2685J(objM2918c);
                                    c2648vxM2685J2.m5180c(AbstractC0295Gu.m625r(-163951786588213L));
                                    String str2 = (String) c2648vxM2685J2.m5178a();
                                    C2648vx c2648vxM2685J3 = AbstractC1406fG.m2685J(objM2918c);
                                    c2648vxM2685J3.m5180c(AbstractC0295Gu.m625r(-164007621163061L));
                                    C2648vx c2648vxM2685J4 = AbstractC1406fG.m2685J(objM2918c);
                                    c2648vxM2685J4.m5180c(AbstractC0295Gu.m625r(-164059160770613L));
                                    if (str2 != null) {
                                        if (AbstractC2564tz.m5051L(str2, AbstractC0295Gu.m625r(-254455337449525L), false)) {
                                            textView.setVisibility(0);
                                        } else {
                                            textView.setVisibility(8);
                                        }
                                    }
                                }
                            } else {
                                imageView2.setVisibility(4);
                                TextView textView2 = (TextView) c0089c2.f201g;
                                if (textView2 != null) {
                                    textView2.setVisibility(8);
                                }
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
                return c0829tc;
            case 7:
                AbstractC0295Gu.m625r(-253308581181493L);
                C2428qs c2428qs2 = ((C1494hG) obj).f5263a;
                Object[] objArr3 = (Object[]) c2428qs2.f8522c;
                Object obj12 = c2428qs2.f8521b;
                Object obj13 = objArr3[0];
                Object obj14 = objArr3[1];
                AbstractC0295Gu.m625r(-253360120789045L);
                Integer num2 = (Integer) obj14;
                int iIntValue3 = num2.intValue();
                C2648vx c2648vx3 = new C2648vx();
                if (obj13 instanceof Class) {
                    c2648vx3.f9163b = (Class) obj13;
                } else {
                    c2648vx3.f9164c = obj13;
                    c2648vx3.f9163b = obj13 != null ? obj13.getClass() : null;
                }
                c2648vx3.f9165d = View.class;
                Object tag2 = ((View) c2648vx3.m5178a()).getTag();
                C1538iG c1538iG2 = new C1538iG(obj12);
                c1538iG2.m2921f(AbstractC0295Gu.m625r(-253016523405365L));
                Object objM2918c2 = c1538iG2.m2918c(null, num2);
                String strM625r3 = AbstractC0295Gu.m625r(-253050883143733L);
                AbstractC0295Gu.m625r(-578325936338997L);
                Object objCallMethod3 = XposedHelpers.callMethod(objM2918c2, strM625r3, Arrays.copyOf(new Object[0], 0));
                AbstractC0295Gu.m625r(-253111012685877L);
                long jLongValue = ((Long) objCallMethod3).longValue();
                C2648vx c2648vx4 = new C2648vx();
                if (tag2 instanceof Class) {
                    c2648vx4.f9163b = (Class) tag2;
                } else {
                    c2648vx4.f9164c = tag2;
                    c2648vx4.f9163b = tag2 != null ? tag2.getClass() : null;
                }
                View view4 = (ImageView) AbstractC0213Ey.m404b(-253871221897269L, c2648vx4);
                if (view4 != null) {
                    ViewParent parent3 = view4.getParent();
                    AbstractC0295Gu.m625r(-253909876602933L);
                    ViewGroup viewGroup5 = (ViewGroup) parent3;
                    ViewParent parent4 = viewGroup5.getParent();
                    AbstractC0295Gu.m625r(-253617818826805L);
                    ViewGroup viewGroup6 = (ViewGroup) parent4;
                    TextView textView3 = (TextView) viewGroup6.findViewWithTag(AbstractC0295Gu.m625r(-252226249422901L));
                    if (textView3 == null) {
                        textView3 = new TextView(view4.getContext());
                        textView3.setTag(AbstractC0295Gu.m625r(-252277789030453L));
                        textView3.setGravity(1);
                        SimpleDateFormat simpleDateFormat2 = C0524M7.f1713c;
                        if (simpleDateFormat2 == null) {
                            AbstractC0295Gu.m625r(-252329328638005L);
                            simpleDateFormat2 = null;
                        }
                        textView3.setText(simpleDateFormat2.format(new Date(jLongValue)));
                        HashMap map4 = AbstractC0999XA.f3193a;
                        textView3.setTextColor(C1517hw.m2889a(-16777216, AbstractC0295Gu.m625r(-251822522497077L)));
                        textView3.setTextSize(10.0f);
                        if (viewGroup6 instanceof RelativeLayout) {
                            String strM625r4 = AbstractC0295Gu.m625r(-251934191646773L);
                            AbstractC0295Gu.m625r(-578325936338997L);
                            Object objCallMethod4 = XposedHelpers.callMethod(objM2918c2, strM625r4, Arrays.copyOf(new Object[0], 0));
                            AbstractC0295Gu.m625r(-251968551385141L);
                            if (((Integer) objCallMethod4).intValue() == 43) {
                                int iIndexOfChild = viewGroup5.indexOfChild(view4);
                                ViewGroup.LayoutParams layoutParams3 = view4.getLayoutParams();
                                viewGroup5.removeView(view4);
                                i = 0;
                                RelativeLayout relativeLayout = new RelativeLayout(view4.getContext());
                                relativeLayout.addView(view4, layoutParams3.width, layoutParams3.height);
                                RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
                                layoutParams4.addRule(3, view4.getId());
                                layoutParams4.addRule(7, view4.getId());
                                layoutParams4.addRule(5, view4.getId());
                                relativeLayout.addView(textView3, layoutParams4);
                                viewGroup5.addView(relativeLayout, iIndexOfChild, new ViewGroup.LayoutParams(-2, -2));
                            } else {
                                i = 0;
                                RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
                                layoutParams5.addRule(3, viewGroup5.getId());
                                layoutParams5.addRule(7, viewGroup5.getId());
                                layoutParams5.addRule(5, viewGroup5.getId());
                                viewGroup6.addView(textView3, layoutParams5);
                            }
                        } else {
                            i = 0;
                            int iIndexOfChild2 = viewGroup6.indexOfChild(viewGroup5);
                            ViewGroup.LayoutParams layoutParams6 = viewGroup5.getLayoutParams();
                            viewGroup6.removeView(viewGroup5);
                            LinearLayout linearLayout = new LinearLayout(view4.getContext());
                            linearLayout.setOrientation(1);
                            linearLayout.addView(viewGroup5, layoutParams6.width, layoutParams6.height);
                            LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(layoutParams6.width, -2);
                            layoutParams7.gravity = 1;
                            linearLayout.addView(textView3, layoutParams7);
                            viewGroup6.addView(linearLayout, iIndexOfChild2, new ViewGroup.LayoutParams(-2, -2));
                        }
                    } else {
                        i = 0;
                        SimpleDateFormat simpleDateFormat3 = C0524M7.f1713c;
                        if (simpleDateFormat3 == null) {
                            AbstractC0295Gu.m625r(-252724465629237L);
                            simpleDateFormat = null;
                        } else {
                            simpleDateFormat = simpleDateFormat3;
                        }
                        textView3.setText(simpleDateFormat.format(new Date(jLongValue)));
                    }
                    if (C0395J7.f1333b.m2024e()) {
                        textView3.setVisibility(C0395J7.m832f(new C0089C2(1, tag2), obj12, iIntValue3) ? i : 8);
                    }
                }
                return c0829tc;
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                AbstractC0295Gu.m625r(-176583285405749L);
                Object obj15 = ((C1494hG) obj).f5263a.f8521b;
                C2648vx c2648vx5 = new C2648vx();
                if (obj15 instanceof Class) {
                    c2648vx5.f9163b = (Class) obj15;
                } else {
                    c2648vx5.f9164c = obj15;
                    c2648vx5.f9163b = obj15 != null ? obj15.getClass() : null;
                }
                c2648vx5.f9165d = TextView.class;
                TextView textView4 = (TextView) c2648vx5.m5178a();
                if (textView4 != null) {
                    HashMap map5 = AbstractC0999XA.f3193a;
                    int iM2889a3 = C1517hw.m2889a(0, AbstractC0295Gu.m625r(-176634825013301L));
                    if (iM2889a3 != 0) {
                        textView4.setTextColor(iM2889a3);
                    }
                    ViewParent parent5 = textView4.getParent();
                    AbstractC0295Gu.m625r(-192693707733045L);
                    ViewGroup viewGroup7 = (ViewGroup) parent5;
                    Drawable drawableM2890b5 = C1517hw.m2890b(AbstractC0295Gu.m625r(-192951405770805L));
                    if (drawableM2890b5 != null) {
                        viewGroup7.setBackground(drawableM2890b5);
                    }
                    View viewM618k = AbstractC0295Gu.m618k(viewGroup7, 0);
                    AbstractC0295Gu.m625r(-192539088910389L);
                    ImageView imageView3 = (ImageView) viewM618k;
                    Drawable drawableM2890b6 = C1517hw.m2890b(AbstractC0295Gu.m625r(-193355132696629L));
                    if (drawableM2890b6 == null || imageView3.getRotation() != 0.0f) {
                        Drawable drawableM2890b7 = C1517hw.m2890b(AbstractC0295Gu.m625r(-193071664855093L));
                        if (drawableM2890b7 != null && imageView3.getRotation() == 180.0f) {
                            String strM625r5 = AbstractC0295Gu.m625r(-191607081007157L);
                            Object[] objArr4 = {Boolean.FALSE};
                            AbstractC0295Gu.m625r(-578325936338997L);
                            XposedHelpers.callMethod(imageView3, strM625r5, Arrays.copyOf(objArr4, 1));
                            imageView3.setImageDrawable(drawableM2890b7);
                            ViewGroup.LayoutParams layoutParams8 = imageView3.getLayoutParams();
                            layoutParams8.width = AbstractC0295Gu.m616i(20);
                            layoutParams8.height = AbstractC0295Gu.m616i(20);
                        }
                    } else {
                        String strM625r6 = AbstractC0295Gu.m625r(-192981470541877L);
                        Object[] objArr5 = {Boolean.FALSE};
                        AbstractC0295Gu.m625r(-578325936338997L);
                        XposedHelpers.callMethod(imageView3, strM625r6, Arrays.copyOf(objArr5, 1));
                        imageView3.setImageDrawable(drawableM2890b6);
                        ViewGroup.LayoutParams layoutParams9 = imageView3.getLayoutParams();
                        layoutParams9.width = AbstractC0295Gu.m616i(20);
                        layoutParams9.height = AbstractC0295Gu.m616i(20);
                    }
                }
                return c0829tc;
            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                AbstractC0295Gu.m625r(-189451007424565L);
                Object obj16 = ((C1494hG) obj).f5263a.f8521b;
                AbstractC0295Gu.m625r(-189579856443445L);
                ViewGroup viewGroup8 = (ViewGroup) obj16;
                viewGroup8.postDelayed(new RunnableC2745y7(viewGroup8, i4), 100L);
                return c0829tc;
            case 10:
                C1494hG c1494hG = (C1494hG) obj;
                AbstractC0295Gu.m625r(-249348621334581L);
                if (C0781S7.f2467b.m2024e()) {
                    Object obj17 = ((Object[]) c1494hG.f5263a.f8522c)[0];
                    AbstractC0295Gu.m625r(-249400160942133L);
                    ViewGroup viewGroup9 = (ViewGroup) obj17;
                    Context context2 = viewGroup9.getContext();
                    AbstractC0295Gu.m625r(-249108103166005L);
                    View viewM2810v = C1456gf.m2810v(viewGroup9, AbstractC0295Gu.m625r(-247707943827509L));
                    AbstractC0295Gu.m625r(-247896922388533L);
                    ViewGroup viewGroup10 = (ViewGroup) viewM2810v;
                    viewGroup10.postDelayed(new RunnableC2788z7(viewGroup10, (Activity) context2, viewGroup9, i6), 200L);
                }
                return c0829tc;
            case 11:
                C1494hG c1494hG2 = (C1494hG) obj;
                AbstractC0295Gu.m625r(-247604864612405L);
                if (C0781S7.f2467b.m2024e()) {
                    C2428qs c2428qs3 = c1494hG2.f5263a;
                    Object obj18 = ((Object[]) c2428qs3.f8522c)[0];
                    String str3 = obj18 instanceof String ? (String) obj18 : null;
                    if (str3 != null) {
                        Object obj19 = c2428qs3.f8521b;
                        AbstractC0295Gu.m625r(-247656404219957L);
                        ((ViewGroup) obj19).setTag(R.id.tag_chat_foot_userName, str3);
                    }
                }
                return c0829tc;
            case 12:
                AbstractC0295Gu.m625r(-248463858071605L);
                C2428qs c2428qs4 = ((C1494hG) obj).f5263a;
                if (C0781S7.f2467b.m2024e()) {
                    Object obj20 = ((Object[]) c2428qs4.f8522c)[0];
                    AbstractC0295Gu.m625r(-247965641865269L);
                    if (AbstractC0295Gu.m625r(-248184685197365L).equals((String) obj20)) {
                        AbstractC0295Gu.m625r(-246664266774581L);
                        Objects.toString(((XC_MethodHook.MethodHookParam) c2428qs4.f8523d).getResult());
                        c2428qs4.m4864C(1);
                    }
                }
                return c0829tc;
            case 13:
                C1494hG c1494hG3 = (C1494hG) obj;
                AbstractC0295Gu.m625r(-257509059196981L);
                if (C1442g8.f5046b.m2762j()) {
                    Object obj21 = c1494hG3.f5263a.f8521b;
                    AbstractC0295Gu.m625r(-258187664029749L);
                    View view5 = (View) obj21;
                    C0693Q4 c0693q4 = new C0693Q4(1, view5);
                    if (view5.isAttachedToWindow()) {
                        view5.post(new RunnableC1398f8(c0693q4, 0));
                    } else {
                        view5.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0995X6(i6, c0693q4));
                    }
                }
                return c0829tc;
            case 14:
                int iIntValue4 = ((Integer) obj).intValue();
                C1442g8 c1442g8 = C1442g8.f5046b;
                c1442g8.getClass();
                if (iIntValue4 == 1) {
                    C1442g8.m2761o();
                } else {
                    SharedPreferences sharedPreferences = AbstractC0599Nx.f1939a;
                    AbstractC0599Nx.m1174c(AbstractC0295Gu.m625r(-262783279036469L), false);
                    AbstractC0599Nx.m1176e(AbstractC0295Gu.m625r(-262328012503093L), AbstractC0295Gu.m625r(-262426796750901L));
                    AbstractC0599Nx.m1176e(AbstractC0295Gu.m625r(-262431091718197L), AbstractC0295Gu.m625r(-260893493426229L));
                }
                c1442g8.getClass();
                C1442g8.m2760n();
                return c0829tc;
            case 15:
                return CherryGlobalAPI.register$lambda$15$lambda$14$lambda$13$lambda$12((Class) obj);
            case 16:
                return CherryNetworkAPI.tableToFormData$lambda$41((Map.Entry) obj);
            case 17:
                AbstractC0295Gu.m625r(-12257836660789L);
                Object obj22 = ((C1494hG) obj).f5263a.f8521b;
                C2648vx c2648vx6 = new C2648vx();
                if (obj22 instanceof Class) {
                    c2648vx6.f9163b = (Class) obj22;
                } else {
                    c2648vx6.f9164c = obj22;
                    c2648vx6.f9163b = obj22 != null ? obj22.getClass() : null;
                }
                c2648vx6.m5182e(AbstractC0295Gu.m625r(-12309376268341L));
                View view6 = (View) c2648vx6.m5178a();
                ViewParent parent6 = view6 != null ? view6.getParent() : null;
                AbstractC0295Gu.m625r(-13069585479733L);
                LinearLayout linearLayout2 = (LinearLayout) parent6;
                int childCount2 = linearLayout2.getChildCount();
                for (int i9 = 0; i9 < childCount2; i9++) {
                    View childAt4 = linearLayout2.getChildAt(i9);
                    AbstractC0295Gu.m625r(-12799002540085L);
                    ViewGroup viewGroup11 = (ViewGroup) childAt4;
                    if (viewGroup11 instanceof LinearLayout) {
                        viewGroup11.postDelayed(new RunnableC0562N2(i5, (LinearLayout) viewGroup11), 150L);
                    } else {
                        C1456gf.m2805o(viewGroup11);
                    }
                    ArrayList<View> arrayList = new ArrayList<>();
                    Iterator it = AbstractC2496sa.m4977b0(AbstractC0295Gu.m625r(-11407433136181L), AbstractC0295Gu.m625r(-11428907972661L), AbstractC0295Gu.m625r(-11458972743733L), AbstractC0295Gu.m625r(-11471857645621L), AbstractC0295Gu.m625r(-11484742547509L), AbstractC0295Gu.m625r(-11501922416693L)).iterator();
                    while (it.hasNext()) {
                        viewGroup11.findViewsWithText(arrayList, (String) it.next(), 1);
                    }
                    if (!arrayList.isEmpty()) {
                        View view7 = arrayList.get(0);
                        AbstractC0295Gu.m625r(-11519102285877L);
                        TextView textView5 = (TextView) view7;
                        HashMap map6 = AbstractC0999XA.f3193a;
                        int iM2889a4 = C1517hw.m2889a(0, AbstractC0295Gu.m625r(-11231339477045L));
                        if (iM2889a4 != 0) {
                            textView5.setTextColor(iM2889a4);
                        }
                        Drawable drawableM2890b8 = C1517hw.m2890b((String) AbstractC0457Kk.f1500a.get(textView5.getText()));
                        if (drawableM2890b8 != null) {
                            View viewM2810v2 = C1456gf.m2810v(viewGroup11, AbstractC0295Gu.m625r(-11905649342517L));
                            String strM625r7 = AbstractC0295Gu.m625r(-12051678230581L);
                            AbstractC0295Gu.m625r(-578325936338997L);
                            Object objCallMethod5 = XposedHelpers.callMethod(viewM2810v2, strM625r7, Arrays.copyOf(new Object[0], 0));
                            AbstractC0295Gu.m625r(-11566346926133L);
                            ((ImageView) objCallMethod5).setImageDrawable(drawableM2890b8);
                        }
                    }
                }
                return c0829tc;
            case 18:
                AbstractC0295Gu.m625r(-10183367456821L);
                Object obj23 = ((Object[]) ((C1494hG) obj).f5263a.f8522c)[1];
                AbstractC0295Gu.m625r(-10234907064373L);
                ViewGroup viewGroup12 = (ViewGroup) obj23;
                C1456gf.m2805o(viewGroup12);
                C1456gf.m2806q(viewGroup12);
                HashMap map7 = AbstractC0999XA.f3193a;
                C1456gf.m2795M(viewGroup12, C1517hw.m2889a(0, AbstractC0295Gu.m625r(-9942849288245L)), C1517hw.m2889a(0, AbstractC0295Gu.m625r(-10067403339829L)), false);
                return c0829tc;
            case 19:
                AbstractC0295Gu.m625r(-10737418238005L);
                Object obj24 = ((C1494hG) obj).f5263a.f8521b;
                AbstractC0295Gu.m625r(-10866267256885L);
                ViewGroup viewGroup13 = (ViewGroup) obj24;
                C1456gf.m2805o(viewGroup13);
                HashMap map8 = AbstractC0999XA.f3193a;
                C1456gf.m2795M(viewGroup13, C1517hw.m2889a(0, AbstractC0295Gu.m625r(-10574209480757L)), C1517hw.m2889a(0, AbstractC0295Gu.m625r(-10698763532341L)), false);
                return c0829tc;
            case LuaJitConsts.LUA_MINSTACK /* 20 */:
                AbstractC0295Gu.m625r(-9169755174965L);
                Object obj25 = ((C1494hG) obj).f5263a.f8521b;
                AbstractC0295Gu.m625r(-9221294782517L);
                ViewGroup viewGroup14 = (ViewGroup) obj25;
                C1456gf.m2805o(viewGroup14);
                ArrayList<View> arrayList2 = new ArrayList<>();
                Iterator it2 = Collections.singletonList(AbstractC0295Gu.m625r(-8929237006389L)).iterator();
                while (it2.hasNext()) {
                    viewGroup14.findViewsWithText(arrayList2, (String) it2.next(), 1);
                }
                if (!arrayList2.isEmpty()) {
                    View view8 = arrayList2.get(0);
                    AbstractC0295Gu.m625r(-8950711842869L);
                    TextView textView6 = (TextView) view8;
                    HashMap map9 = AbstractC0999XA.f3193a;
                    int iM2889a5 = C1517hw.m2889a(0, AbstractC0295Gu.m625r(-9762460661813L));
                    if (iM2889a5 != 0) {
                        textView6.setTextColor(iM2889a5);
                    }
                    Drawable drawableM2890b9 = C1517hw.m2890b((String) AbstractC0457Kk.f1500a.get(textView6.getText()));
                    if (drawableM2890b9 != null) {
                        View viewM2810v3 = C1456gf.m2810v(viewGroup14, AbstractC0295Gu.m625r(-9887014713397L));
                        String strM625r8 = AbstractC0295Gu.m625r(-9483287787573L);
                        AbstractC0295Gu.m625r(-578325936338997L);
                        Object objCallMethod6 = XposedHelpers.callMethod(viewM2810v3, strM625r8, Arrays.copyOf(new Object[0], 0));
                        AbstractC0295Gu.m625r(-9547712297013L);
                        ((ImageView) objCallMethod6).setImageDrawable(drawableM2890b9);
                    }
                }
                return c0829tc;
            case 21:
                AbstractC0295Gu.m625r(-60941290960949L);
                Object obj26 = ((C1494hG) obj).f5263a.f8521b;
                AbstractC0295Gu.m625r(-60520384165941L);
                ViewGroup viewGroup15 = (ViewGroup) obj26;
                C1456gf.m2805o(viewGroup15);
                ViewParent parent7 = C1456gf.m2810v(viewGroup15, AbstractC0295Gu.m625r(-61327838017589L)).getParent();
                AbstractC0295Gu.m625r(-61473866905653L);
                View childAt5 = ((ViewGroup) parent7).getChildAt(1);
                AbstractC0295Gu.m625r(-61181809129525L);
                TextView textView7 = (TextView) childAt5;
                HashMap map10 = AbstractC0999XA.f3193a;
                int iM2889a6 = C1517hw.m2889a(0, AbstractC0295Gu.m625r(-59794534692917L));
                if (iM2889a6 != 0) {
                    textView7.setTextColor(iM2889a6);
                }
                return c0829tc;
            case 22:
                AbstractC0295Gu.m625r(-59919088744501L);
                Object obj27 = ((C1494hG) obj).f5263a.f8521b;
                AbstractC0295Gu.m625r(-59498181949493L);
                ViewGroup viewGroup16 = (ViewGroup) obj27;
                C1456gf.m2805o(viewGroup16);
                ViewParent parent8 = C1456gf.m2810v(viewGroup16, AbstractC0295Gu.m625r(-60305635801141L)).getParent();
                AbstractC0295Gu.m625r(-60451664689205L);
                View childAt6 = ((ViewGroup) parent8).getChildAt(1);
                AbstractC0295Gu.m625r(-60159606913077L);
                View childAt7 = ((ViewGroup) childAt6).getChildAt(0);
                AbstractC0295Gu.m625r(-58768037509173L);
                TextView textView8 = (TextView) childAt7;
                HashMap map11 = AbstractC0999XA.f3193a;
                int iM2889a7 = C1517hw.m2889a(0, AbstractC0295Gu.m625r(-58480274700341L));
                if (iM2889a7 != 0) {
                    textView8.setTextColor(iM2889a7);
                }
                Drawable drawableM2890b10 = C1517hw.m2890b(AbstractC0295Gu.m625r(-59154584565813L));
                if (drawableM2890b10 != null) {
                    View viewM2810v4 = C1456gf.m2810v(viewGroup16, AbstractC0295Gu.m625r(-59339268159541L));
                    String strM625r9 = AbstractC0295Gu.m625r(-58935541233717L);
                    AbstractC0295Gu.m625r(-578325936338997L);
                    Object objCallMethod7 = XposedHelpers.callMethod(viewM2810v4, strM625r9, Arrays.copyOf(new Object[0], 0));
                    AbstractC0295Gu.m625r(-58999965743157L);
                    ((ImageView) objCallMethod7).setImageDrawable(drawableM2890b10);
                }
                return c0829tc;
            case 23:
                return m438c(obj);
            case 24:
                return m439e(obj);
            case 25:
                return m440f(obj);
            case 26:
                return m441h(obj);
            case 27:
                return m442i(obj);
            case 28:
                return m443j(obj);
            default:
                AbstractC0295Gu.m625r(-67761699026997L);
                Object obj28 = ((C1494hG) obj).f5263a.f8521b;
                AbstractC0295Gu.m625r(-67890548045877L);
                View childAt8 = ((ViewGroup) obj28).getChildAt(0);
                AbstractC0295Gu.m625r(-66498978641973L);
                ViewGroup viewGroup17 = (ViewGroup) childAt8;
                Context context3 = viewGroup17.getContext();
                AbstractC0295Gu.m625r(-66206920865845L);
                AbstractC0295Gu.m625r(-494385095505973L);
                C2684wq c2684wq = new C2684wq(context3);
                HashMap map12 = AbstractC0999XA.f3193a;
                Drawable drawableM2890b11 = C1517hw.m2890b(AbstractC0295Gu.m625r(-66825396156469L));
                if (drawableM2890b11 == null) {
                    drawableM2890b11 = C1517hw.m2890b(AbstractC0295Gu.m625r(-66971425044533L));
                }
                c2684wq.setImageDrawable(drawableM2890b11);
                c2684wq.setScaleType(ImageView.ScaleType.CENTER_CROP);
                c2684wq.setMaskColor(C1517hw.m2889a(1426063360, AbstractC0295Gu.m625r(-67061619357749L)));
                viewGroup17.addView(c2684wq, 0, new ViewGroup.LayoutParams(-1, -1));
                return c0829tc;
        }
    }
}
