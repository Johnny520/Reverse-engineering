package p000;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import io.github.cherrywechat.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.AbstractC2156b;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: Ob */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0620Ob implements InterfaceC1416fj {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1983a;

    public /* synthetic */ C0620Ob(int i) {
        this.f1983a = i;
    }

    @Override // p000.InterfaceC1416fj
    /* JADX INFO: renamed from: g */
    public final Object mo90g(Object obj) throws IllegalAccessException {
        Drawable drawableM2890b;
        int iM2889a;
        Drawable drawableM2890b2;
        int i = this.f1983a;
        int i2 = 3;
        int i3 = 13;
        int i4 = 2;
        int i5 = 0;
        C0829TC c0829tc = C0829TC.f2620a;
        switch (i) {
            case 0:
                AbstractC0295Gu.m625r(-67233418049589L);
                break;
            case 1:
                AbstractC0295Gu.m625r(-54893977008181L);
                Object obj2 = ((C1494hG) obj).f5263a.f8521b;
                Field[] fields = obj2.getClass().getFields();
                AbstractC0295Gu.m625r(-54473070213173L);
                for (Field field : fields) {
                    if (AbstractC0585Nj.m1134a(field.getType(), Paint.class)) {
                        field.setAccessible(true);
                        C0663Pb c0663Pb = new C0663Pb(1);
                        c0663Pb.setColor(0);
                        field.set(obj2, c0663Pb);
                    }
                }
                break;
            case 2:
                AbstractC0295Gu.m625r(-67246302951477L);
                Object obj3 = ((C1494hG) obj).f5263a.f8521b;
                AbstractC0295Gu.m625r(-67924907784245L);
                ViewGroup viewGroup = (ViewGroup) obj3;
                View view = new View(viewGroup.getContext());
                HashMap map = AbstractC0999XA.f3193a;
                view.setBackground(new ColorDrawable(C1517hw.m2889a(1426063360, AbstractC0295Gu.m625r(-67632850008117L))));
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.bottomMargin = AbstractC0295Gu.m616i(100);
                viewGroup.addView(view, 0, layoutParams);
                break;
            case 3:
                AbstractC0295Gu.m625r(-53751515707445L);
                C2428qs c2428qs = ((C1494hG) obj).f5263a;
                Object result = ((XC_MethodHook.MethodHookParam) c2428qs.f8523d).getResult();
                AbstractC0295Gu.m625r(-53803055314997L);
                View view2 = (View) result;
                if (view2.getContext().getClass().getName().equals(AbstractC0295Gu.m625r(-53489522702389L)) && (view2 instanceof ViewGroup)) {
                    ViewGroup viewGroup2 = (ViewGroup) view2;
                    Object tag = viewGroup2.getTag();
                    if (tag != null) {
                        AbstractC0295Gu.m625r(-166777875068981L);
                        AbstractC0295Gu.m625r(-166795054938165L);
                        C2648vx c2648vx = new C2648vx();
                        if (tag instanceof Class) {
                            c2648vx.f9163b = (Class) tag;
                        } else {
                            c2648vx.f9164c = tag;
                            c2648vx.f9163b = tag.getClass();
                        }
                        c2648vx.f9165d = Boolean.TYPE;
                        Object objM5178a = c2648vx.m5178a();
                        AbstractC0295Gu.m625r(-166838004611125L);
                        boolean zBooleanValue = ((Boolean) objM5178a).booleanValue();
                        View viewFindViewWithTag = viewGroup2.findViewWithTag(AbstractC0295Gu.m625r(-165412075468853L));
                        View viewFindViewWithTag2 = viewGroup2.findViewWithTag(AbstractC0295Gu.m625r(-165463615076405L));
                        View viewFindViewWithTag3 = viewGroup2.findViewWithTag(AbstractC0295Gu.m625r(-164978283771957L));
                        View viewM2788F = C1456gf.m2788F(viewGroup2, 0, 0, 2);
                        AbstractC0295Gu.m625r(-165029823379509L);
                        ImageView imageView = (ImageView) viewM2788F;
                        View viewM2788F2 = C1456gf.m2788F(viewGroup2, 0, 0, 1);
                        AbstractC0295Gu.m625r(-165845867165749L);
                        TextView textView = (TextView) viewM2788F2;
                        Object obj4 = c2428qs.f8521b;
                        AbstractC0295Gu.m625r(-69556995356725L);
                        ListAdapter wrappedAdapter = ((HeaderViewListAdapter) obj4).getWrappedAdapter();
                        Object obj5 = ((Object[]) c2428qs.f8522c)[0];
                        AbstractC0295Gu.m625r(-69325067122741L);
                        Object item = wrappedAdapter.getItem(((Integer) obj5).intValue());
                        if (item != null) {
                            String strM625r = AbstractC0295Gu.m625r(-69531225552949L);
                            AbstractC0295Gu.m625r(-578325936338997L);
                            Object objCallMethod = XposedHelpers.callMethod(item, strM625r, Arrays.copyOf(new Object[0], 0));
                            AbstractC0295Gu.m625r(-70123931039797L);
                            ((ContentValues) objCallMethod).getAsString(AbstractC0295Gu.m625r(-69861938034741L));
                        }
                        viewGroup2.setBackgroundTintList(ColorStateList.valueOf(0));
                        View childAt = viewGroup2.getChildAt(0);
                        if (zBooleanValue) {
                            HashMap map2 = AbstractC0999XA.f3193a;
                            drawableM2890b = C1517hw.m2890b(AbstractC0295Gu.m625r(-69900592740405L));
                        } else {
                            HashMap map3 = AbstractC0999XA.f3193a;
                            drawableM2890b = C1517hw.m2890b(AbstractC0295Gu.m625r(-70085276334133L));
                        }
                        childAt.setBackground(drawableM2890b);
                        HashMap map4 = AbstractC0999XA.f3193a;
                        int iM2889a2 = C1517hw.m2889a(0, AbstractC0295Gu.m625r(-68633577388085L));
                        if (iM2889a2 != 0 && imageView != null) {
                            imageView.setBackgroundTintList(ColorStateList.valueOf(iM2889a2));
                        }
                        Drawable drawableM2890b3 = C1517hw.m2890b(AbstractC0295Gu.m625r(-68242735364149L));
                        if (drawableM2890b3 != null && textView != null) {
                            CharSequence text = textView.getText();
                            if ((text == null || text.length() == 0) && textView.getVisibility() == 0) {
                                textView.setText(AbstractC0295Gu.m625r(-69002944575541L));
                            }
                            textView.setBackground(drawableM2890b3);
                            int iM2889a3 = C1517hw.m2889a(0, AbstractC0295Gu.m625r(-69020124444725L));
                            if (iM2889a3 != 0) {
                                textView.setTextColor(iM2889a3);
                            }
                        }
                        int iM2889a4 = C1517hw.m2889a(0, AbstractC0295Gu.m625r(-69209103005749L));
                        if (iM2889a4 != 0 && viewFindViewWithTag != null) {
                            String strM625r2 = AbstractC0295Gu.m625r(-68809671047221L);
                            Object[] objArr = {Integer.valueOf(iM2889a4)};
                            AbstractC0295Gu.m625r(-578325936338997L);
                            XposedHelpers.callMethod(viewFindViewWithTag, strM625r2, Arrays.copyOf(objArr, 1));
                        }
                        int iM2889a5 = C1517hw.m2889a(0, AbstractC0295Gu.m625r(-68865505622069L));
                        if (iM2889a5 != 0) {
                            if (viewFindViewWithTag2 != null) {
                                String strM625r3 = AbstractC0295Gu.m625r(-67362267068469L);
                                Object[] objArr2 = {Integer.valueOf(iM2889a5)};
                                AbstractC0295Gu.m625r(-578325936338997L);
                                XposedHelpers.callMethod(viewFindViewWithTag2, strM625r3, Arrays.copyOf(objArr2, 1));
                            }
                            if (viewFindViewWithTag3 != null) {
                                String strM625r4 = AbstractC0295Gu.m625r(-67418101643317L);
                                Object[] objArr3 = {Integer.valueOf(iM2889a5)};
                                AbstractC0295Gu.m625r(-578325936338997L);
                                XposedHelpers.callMethod(viewFindViewWithTag3, strM625r4, Arrays.copyOf(objArr3, 1));
                            }
                        }
                    }
                    View childAt2 = viewGroup2.getChildAt(viewGroup2.getChildCount() - 1);
                    if (childAt2 instanceof ViewGroup) {
                        C1456gf.m2805o((ViewGroup) childAt2);
                        if (view2.findViewWithTag(Integer.valueOf(R.id.tag_home_main_conversation_list_driver)) == null) {
                            ArrayList arrayList = new ArrayList();
                            C1456gf.m2812x(viewGroup2, arrayList);
                            View view3 = (View) (arrayList.isEmpty() ? null : arrayList.get(0));
                            if (view3 != null) {
                                view3.setAlpha(0.0f);
                                view2.setTag(R.id.tag_home_main_conversation_list_driver, view3);
                            }
                        }
                    }
                }
                break;
            case 4:
                AbstractC0295Gu.m625r(-67473936218165L);
                Object result2 = ((XC_MethodHook.MethodHookParam) ((C1494hG) obj).f5263a.f8523d).getResult();
                AbstractC0295Gu.m625r(-67525475825717L);
                C1456gf.m2805o((ViewGroup) result2);
                break;
            case 5:
                AbstractC0295Gu.m625r(-55606941579317L);
                break;
            case 6:
                AbstractC0295Gu.m625r(-55658481186869L);
                Object obj6 = ((C1494hG) obj).f5263a.f8521b;
                C2648vx c2648vx2 = new C2648vx();
                if (obj6 instanceof Class) {
                    c2648vx2.f9163b = (Class) obj6;
                } else {
                    c2648vx2.f9164c = obj6;
                    c2648vx2.f9163b = obj6 != null ? obj6.getClass() : null;
                }
                c2648vx2.m5182e(AbstractC0295Gu.m625r(-55710020794421L));
                View view4 = (View) c2648vx2.m5178a();
                if (view4 != null) {
                    view4.setBackground(null);
                    view4.setTag(R.id.tag_view_bg_ban, Object.class);
                }
                ViewParent parent = view4 != null ? view4.getParent() : null;
                AbstractC0295Gu.m625r(-54284091652149L);
                View childAt3 = ((ViewGroup) parent).getChildAt(3);
                if (childAt3 != null) {
                    childAt3.setBackground(null);
                    childAt3.setTag(R.id.tag_view_bg_ban, Object.class);
                }
                break;
            case 7:
                AbstractC0295Gu.m625r(-66640712562741L);
                Object obj7 = ((Object[]) ((C1494hG) obj).f5263a.f8522c)[0];
                AbstractC0295Gu.m625r(-66692252170293L);
                ViewGroup viewGroup3 = (ViewGroup) obj7;
                C1456gf.m2805o(viewGroup3);
                HashMap map5 = AbstractC0999XA.f3193a;
                Context context = viewGroup3.getContext();
                AbstractC0295Gu.m625r(-65300682766389L);
                C1456gf.m2796N(viewGroup3, new ColorDrawable(!C1517hw.m2894f(context) ? -285212673 : -301989888));
                break;
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                AbstractC0295Gu.m625r(-54537494722613L);
                Object obj8 = ((C1494hG) obj).f5263a.f8521b;
                AbstractC0295Gu.m625r(-54666343741493L);
                ViewGroup viewGroup4 = (ViewGroup) obj8;
                C2648vx c2648vx3 = new C2648vx();
                c2648vx3.f9164c = viewGroup4;
                c2648vx3.f9163b = viewGroup4 != null ? viewGroup4.getClass() : null;
                c2648vx3.m5182e(AbstractC0295Gu.m625r(-53274774337589L));
                View view5 = (View) c2648vx3.m5178a();
                ViewParent parent2 = view5 != null ? view5.getParent() : null;
                AbstractC0295Gu.m625r(-52944061855797L);
                ViewGroup viewGroup5 = (ViewGroup) parent2;
                int childCount = viewGroup5.getChildCount();
                for (int i6 = 0; i6 < childCount; i6++) {
                    ViewGroup.LayoutParams layoutParams2 = viewGroup5.getChildAt(i6).getLayoutParams();
                    layoutParams2.width = 0;
                    layoutParams2.height = 0;
                }
                break;
            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                C1494hG c1494hG = (C1494hG) obj;
                AbstractC0295Gu.m625r(-29274497087541L);
                if (C1265ch.f4301b.m2024e()) {
                    Object obj9 = ((Object[]) c1494hG.f5263a.f8522c)[0];
                    AbstractC0295Gu.m625r(-29326036695093L);
                    ViewGroup viewGroup6 = (ViewGroup) obj9;
                    viewGroup6.post(new RunnableC2745y7(viewGroup6, i2));
                }
                break;
            case 10:
                C1494hG c1494hG2 = (C1494hG) obj;
                AbstractC0295Gu.m625r(-26684631808053L);
                if (C1055Yh.f3357b.m2024e()) {
                    c1494hG2.f5263a.m4864C(Float.valueOf(C1055Yh.f3358c));
                }
                break;
            case 11:
                AbstractC0295Gu.m625r(-6859062769717L);
                Object obj10 = ((C1494hG) obj).f5263a.f8521b;
                AbstractC0295Gu.m625r(-7537667602485L);
                ((TextView) obj10).setTypeface(C1145ak.f3637c);
                break;
            case 12:
                AbstractC0295Gu.m625r(-7249904793653L);
                ((Object[]) ((C1494hG) obj).f5263a.f8522c)[0] = C1145ak.f3637c;
                break;
            case 13:
                AbstractC0295Gu.m625r(-7305739368501L);
                ((Object[]) ((C1494hG) obj).f5263a.f8522c)[0] = C1145ak.f3637c;
                break;
            case 14:
                AbstractC0295Gu.m625r(-7361573943349L);
                Object obj11 = ((C1494hG) obj).f5263a.f8521b;
                AbstractC0295Gu.m625r(-5841155520565L);
                ((Paint) obj11).setTypeface(C1145ak.f3637c);
                break;
            case 15:
                AbstractC0295Gu.m625r(-5549097744437L);
                ((Object[]) ((C1494hG) obj).f5263a.f8522c)[0] = C1145ak.f3637c;
                break;
            case 16:
                AbstractC0295Gu.m625r(-51445118269493L);
                Object obj12 = ((C1494hG) obj).f5263a.f8521b;
                AbstractC0295Gu.m625r(-51573967288373L);
                HashMap map6 = AbstractC0999XA.f3193a;
                ((View) obj12).setBackground(new ColorDrawable(C1517hw.m2889a(1426063360, AbstractC0295Gu.m625r(-51260434675765L))));
                break;
            case 17:
                AbstractC0295Gu.m625r(-37641093380149L);
                C2428qs c2428qs2 = ((C1494hG) obj).f5263a;
                Object obj13 = c2428qs2 != null ? c2428qs2.f8521b : null;
                AbstractC0295Gu.m625r(-38242388801589L);
                Object obj14 = ((Object[]) c2428qs2.f8522c)[0];
                AbstractC0295Gu.m625r(-37950331025461L);
                int iIntValue = ((Integer) obj14).intValue();
                View childAt4 = ((ViewGroup) obj13).getChildAt(0);
                AbstractC0295Gu.m625r(-38156489455669L);
                LinearLayout linearLayout = (LinearLayout) childAt4;
                int childCount2 = linearLayout.getChildCount();
                while (i5 < childCount2) {
                    View childAt5 = linearLayout.getChildAt(i5);
                    AbstractC0295Gu.m625r(-36786394888245L);
                    ViewGroup viewGroup7 = (ViewGroup) childAt5;
                    TextView textView2 = (TextView) viewGroup7.findViewById(AbstractC0828TB.f2615g);
                    if (i5 == iIntValue) {
                        HashMap map7 = AbstractC0999XA.f3193a;
                        iM2889a = C1517hw.m2889a(-16777216, AbstractC0295Gu.m625r(-36494337112117L));
                    } else {
                        HashMap map8 = AbstractC0999XA.f3193a;
                        iM2889a = C1517hw.m2889a(-7829368, AbstractC0295Gu.m625r(-37168646977589L));
                    }
                    if (textView2 != null) {
                        textView2.setTag(R.id.tag_textview_color_ban, null);
                        textView2.setTextColor(iM2889a);
                        textView2.setTag(R.id.tag_textview_color_ban, TextView.class);
                    }
                    Object tag2 = viewGroup7.getTag();
                    ImageView imageView2 = tag2 instanceof ImageView ? (ImageView) tag2 : null;
                    if (imageView2 != null) {
                        if (i5 == 0) {
                            HashMap map9 = AbstractC0999XA.f3193a;
                            drawableM2890b2 = C1517hw.m2890b(i5 == iIntValue ? AbstractC0295Gu.m625r(-37301790963765L) : AbstractC0295Gu.m625r(-36953898612789L));
                        } else if (i5 == 1) {
                            HashMap map10 = AbstractC0999XA.f3193a;
                            drawableM2890b2 = C1517hw.m2890b(i5 == iIntValue ? AbstractC0295Gu.m625r(-35515084568629L) : AbstractC0295Gu.m625r(-35695473195061L));
                        } else if (i5 != 2) {
                            HashMap map11 = AbstractC0999XA.f3193a;
                            drawableM2890b2 = C1517hw.m2890b(i5 == iIntValue ? AbstractC0295Gu.m625r(-36270998812725L) : AbstractC0295Gu.m625r(-35880156788789L));
                        } else {
                            HashMap map12 = AbstractC0999XA.f3193a;
                            drawableM2890b2 = C1517hw.m2890b(i5 == iIntValue ? AbstractC0295Gu.m625r(-35334695942197L) : AbstractC0295Gu.m625r(-36082020251701L));
                        }
                        imageView2.setImageDrawable(drawableM2890b2);
                    }
                    i5++;
                }
                break;
            case 18:
                AbstractC0295Gu.m625r(-52295521794101L);
                Object obj15 = ((C1494hG) obj).f5263a.f8521b;
                C2648vx c2648vx4 = new C2648vx();
                if (obj15 instanceof Class) {
                    c2648vx4.f9163b = (Class) obj15;
                } else {
                    c2648vx4.f9164c = obj15;
                    c2648vx4.f9163b = obj15 != null ? obj15.getClass() : null;
                }
                c2648vx4.m5182e(AbstractC0295Gu.m625r(-52347061401653L));
                ((Activity) c2648vx4.m5178a()).getWindow().setStatusBarColor(0);
                break;
            case 19:
                AbstractC0295Gu.m625r(-50856707749941L);
                Object obj16 = ((C1494hG) obj).f5263a.f8521b;
                C2648vx c2648vx5 = new C2648vx();
                if (obj16 instanceof Class) {
                    c2648vx5.f9163b = (Class) obj16;
                } else {
                    c2648vx5.f9164c = obj16;
                    c2648vx5.f9163b = obj16 != null ? obj16.getClass() : null;
                }
                c2648vx5.m5182e(AbstractC0295Gu.m625r(-50908247357493L));
                ((Activity) c2648vx5.m5178a()).getWindow().setStatusBarColor(0);
                break;
            case LuaJitConsts.LUA_MINSTACK /* 20 */:
                AbstractC0295Gu.m625r(-40428527155253L);
                Object obj17 = ((C1494hG) obj).f5263a.f8521b;
                AbstractC0295Gu.m625r(-40480066762805L);
                Activity activity = (Activity) obj17;
                ViewGroup viewGroup8 = (ViewGroup) activity.findViewById(android.R.id.content);
                if (!AbstractC0585Nj.m1134a(viewGroup8.getTag(R.id.tag_main_init), Object.class)) {
                    viewGroup8.setTag(R.id.tag_main_init, Object.class);
                    ViewParent parent3 = viewGroup8.getParent();
                    AbstractC0295Gu.m625r(-40179419052085L);
                    View childAt6 = ((ViewGroup) parent3).getChildAt(1);
                    AbstractC0295Gu.m625r(-38787849648181L);
                    ViewGroup viewGroup9 = (ViewGroup) childAt6;
                    View viewM2810v = C1456gf.m2810v(viewGroup8, AbstractC0295Gu.m625r(-38495791872053L));
                    AbstractC0295Gu.m625r(-38676180498485L);
                    ViewGroup viewGroup10 = (ViewGroup) viewM2810v;
                    View viewM2810v2 = C1456gf.m2810v(viewGroup8, AbstractC0295Gu.m625r(-39483634350133L));
                    AbstractC0295Gu.m625r(-39101382260789L);
                    ViewParent parent4 = viewGroup10.getParent();
                    AbstractC0295Gu.m625r(-37709812856885L);
                    ViewGroup viewGroup11 = (ViewGroup) parent4;
                    ImageView imageView3 = new ImageView(viewGroup11.getContext());
                    HashMap map13 = AbstractC0999XA.f3193a;
                    imageView3.setBackground(C1517hw.m2890b(AbstractC0295Gu.m625r(-37417755080757L)));
                    imageView3.setElevation(1.0f);
                    viewGroup11.addView(imageView3, 0, new ViewGroup.LayoutParams(-1, C1456gf.m2814z(activity) + C2262n5.m4599a(viewGroup11.getContext(), "status_bar_height")));
                    viewGroup9.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0543Mk(viewGroup9, viewGroup8, imageView3, 0));
                    ImageView imageView4 = new ImageView(activity);
                    imageView4.setImageDrawable(C1517hw.m2890b(AbstractC0295Gu.m625r(-37550899066933L)));
                    imageView4.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
                    layoutParams3.addRule(13);
                    viewGroup11.addView(imageView4, 0, layoutParams3);
                    viewGroup11.post(new RunnableC0586Nk(viewGroup9, imageView3, viewGroup10, (ViewGroup) viewM2810v2));
                }
                break;
            case 21:
                AbstractC0295Gu.m625r(-51689931405365L);
                Object obj18 = ((Object[]) ((C1494hG) obj).f5263a.f8522c)[0];
                AbstractC0295Gu.m625r(-51741471012917L);
                Menu menu = (Menu) obj18;
                if (menu.size() == 2) {
                    MenuItem item2 = menu.getItem(0);
                    MenuItem item3 = menu.getItem(1);
                    menu.clear();
                    MenuItem menuItemAdd = menu.add(0, item2.getItemId(), 0, item2.getTitle());
                    HashMap map14 = AbstractC0999XA.f3193a;
                    Drawable drawableM2890b4 = C1517hw.m2890b(AbstractC0295Gu.m625r(-52527450028085L));
                    if (drawableM2890b4 == null) {
                        drawableM2890b4 = item2.getIcon();
                    }
                    menuItemAdd.setIcon(drawableM2890b4);
                    MenuItem menuItemAdd2 = menu.add(0, item3.getItemId(), 0, item3.getTitle());
                    Drawable drawableM2890b5 = C1517hw.m2890b(AbstractC0295Gu.m625r(-52690658785333L));
                    if (drawableM2890b5 == null) {
                        drawableM2890b5 = item3.getIcon();
                    }
                    menuItemAdd2.setIcon(drawableM2890b5);
                }
                break;
            case 22:
                AbstractC0295Gu.m625r(-51067161147445L);
                Object obj19 = ((C1494hG) obj).f5263a.f8521b;
                String strM625r5 = AbstractC0295Gu.m625r(-51118700754997L);
                AbstractC0295Gu.m625r(-578325936338997L);
                Object objCallMethod2 = XposedHelpers.callMethod(obj19, strM625r5, Arrays.copyOf(new Object[0], 0));
                AbstractC0295Gu.m625r(-50689204025397L);
                C1456gf.f5171o = ((Integer) objCallMethod2).intValue();
                break;
            case 23:
                C0268G9 c0268g9 = (C0268G9) obj;
                C0268G9.m551a(c0268g9, "JsonPrimitive", new C2680wm(new C1302d(i3)));
                C0268G9.m551a(c0268g9, "JsonNull", new C2680wm(new C1302d(14)));
                C0268G9.m551a(c0268g9, "JsonLiteral", new C2680wm(new C1302d(15)));
                C0268G9.m551a(c0268g9, "JsonObject", new C2680wm(new C1302d(16)));
                C0268G9.m551a(c0268g9, "JsonArray", new C2680wm(new C1302d(17)));
                break;
            case 24:
                Map.Entry entry = (Map.Entry) obj;
                String str = (String) entry.getKey();
                AbstractC2156b abstractC2156b = (AbstractC2156b) entry.getValue();
                StringBuilder sb = new StringBuilder();
                AbstractC2478rz.m4964a(sb, str);
                sb.append(':');
                sb.append(abstractC2156b);
                break;
            case 25:
                AbstractC0295Gu.m625r(-47983374628917L);
                C2227mD c2227mD = C2227mD.f7746a;
                Object obj20 = ((C1494hG) obj).f5263a.f8521b;
                AbstractC0295Gu.m625r(-48034914236469L);
                Activity activity2 = (Activity) obj20;
                c2227mD.getClass();
                AbstractC0295Gu.m625r(-463422676269109L);
                if (!C2227mD.m4485d().getBoolean(AbstractC0295Gu.m625r(-462907280193589L), false)) {
                    if (System.currentTimeMillis() - C2227mD.m4485d().getLong(AbstractC0295Gu.m625r(-462984589604917L), 0L) >= 600000) {
                        C2227mD.m4484c(activity2, false);
                    }
                }
                break;
            case 26:
                AbstractC0295Gu.m625r(-46231027972149L);
                Object obj21 = ((C1494hG) obj).f5263a.f8521b;
                AbstractC0295Gu.m625r(-46282567579701L);
                Activity activity3 = (Activity) obj21;
                String strM2791I = C1456gf.m2791I();
                C0183EA.f539a.getClass();
                if (!AbstractC0585Nj.m1134a(C0183EA.f540b, strM2791I)) {
                    C2214m0.f7706a.getClass();
                    if (C2214m0.m4455b(activity3, strM2791I)) {
                        try {
                            C1036Y4 c1036y4 = C1036Y4.f3308a;
                            C0620Ob c0620Ob = new C0620Ob(27);
                            C1407fa c1407fa = new C1407fa(activity3, 1);
                            c1036y4.getClass();
                            C1036Y4.m1982a(activity3, c0620Ob, c1407fa, false);
                        } catch (Exception unused) {
                        }
                    }
                }
                break;
            case 27:
                String str2 = (String) obj;
                AbstractC0295Gu.m625r(-46634754897973L);
                if (str2.length() > 0) {
                    C0183EA.f539a.getClass();
                    C0183EA.m382j(str2);
                }
                break;
            case 28:
                AbstractC0295Gu.m625r(-527516473227317L);
                C2428qs c2428qs3 = ((C1494hG) obj).f5263a;
                Object objCallMethod3 = XposedHelpers.callMethod(c2428qs3.f8521b, AbstractC0295Gu.m625r(-527568012834869L), new Object[0]);
                AbstractC0295Gu.m625r(-527632437344309L);
                ViewGroup viewGroup12 = (ViewGroup) objCallMethod3;
                Object obj22 = c2428qs3.f8521b;
                AbstractC0295Gu.m625r(-527340379568181L);
                Activity activity4 = (Activity) obj22;
                if (C2128k5.m4313d(activity4)) {
                    Object objCallMethod4 = XposedHelpers.callMethod(obj22, AbstractC0295Gu.m625r(-525940220229685L), new Object[0]);
                    AbstractC0295Gu.m625r(-526021824608309L);
                    View childAt7 = ((ViewGroup) objCallMethod4).getChildAt(0);
                    AbstractC0295Gu.m625r(-525729766832181L);
                    viewGroup12.post(new RunnableC2788z7(activity4, viewGroup12, (ViewGroup) childAt7, i4));
                }
                break;
            default:
                AbstractC0295Gu.m625r(-526537220683829L);
                C2428qs c2428qs4 = ((C1494hG) obj).f5263a;
                Object obj23 = c2428qs4.f8521b;
                AbstractC0295Gu.m625r(-526593055258677L);
                if (C2128k5.m4313d((Activity) obj23)) {
                    Object obj24 = c2428qs4.f8521b;
                    C2648vx c2648vx6 = new C2648vx();
                    if (obj24 instanceof Class) {
                        c2648vx6.f9163b = (Class) obj24;
                    } else {
                        c2648vx6.f9164c = obj24;
                        c2648vx6.f9163b = obj24 != null ? obj24.getClass() : null;
                    }
                    c2648vx6.m5180c(AbstractC0295Gu.m625r(-526292407547957L));
                    c2648vx6.m5181d(Boolean.FALSE);
                }
                break;
        }
        return c0829tc;
        return c0829tc;
    }
}
