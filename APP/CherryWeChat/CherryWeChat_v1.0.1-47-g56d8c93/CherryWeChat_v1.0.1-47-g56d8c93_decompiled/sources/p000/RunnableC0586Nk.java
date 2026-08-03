package p000;

import android.R;
import android.app.AlertDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import de.robv.android.xposed.XposedHelpers;
import io.github.cherrywechat.lua.loader.LoadedScript;
import io.github.cherrywechat.lua.loader.ScriptManager;
import io.sentry.android.core.C1666I;
import io.sentry.android.core.internal.util.ViewTreeObserverOnDrawListenerC1720h;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: Nk */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0586Nk implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1905a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f1906b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f1907c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f1908d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f1909e;

    public /* synthetic */ RunnableC0586Nk(ViewGroup viewGroup, ImageView imageView, ViewGroup viewGroup2, ViewGroup viewGroup3) {
        this.f1905a = 0;
        this.f1906b = viewGroup;
        this.f1909e = imageView;
        this.f1907c = viewGroup2;
        this.f1908d = viewGroup3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int iM2889a;
        String strM2892d;
        Object objMo446d;
        int i = this.f1905a;
        int i2 = 17;
        Object obj = this.f1909e;
        Object obj2 = this.f1908d;
        Object obj3 = this.f1907c;
        Object obj4 = this.f1906b;
        switch (i) {
            case 0:
                final ViewGroup viewGroup = (ViewGroup) obj4;
                final ImageView imageView = (ImageView) obj;
                final ViewGroup viewGroup2 = (ViewGroup) obj3;
                ViewGroup viewGroup3 = (ViewGroup) obj2;
                C1456gf.m2805o(viewGroup);
                final TextView textView = (TextView) viewGroup.findViewById(R.id.text1);
                String string = textView.getText().toString();
                String strM625r = AbstractC0295Gu.m625r(-42563125901365L);
                HashMap map = AbstractC0999XA.f3193a;
                textView.setText(AbstractC0085Bz.m133K(string, strM625r, C1517hw.m2892d(AbstractC0295Gu.m625r(-42576010803253L), AbstractC0295Gu.m625r(-41016937674805L))));
                if (C1517hw.m2889a(-16777216, AbstractC0295Gu.m625r(-41029822576693L)) != 0) {
                    C1456gf.m2797O(textView, C1517hw.m2889a(-16777216, AbstractC0295Gu.m625r(-41145786693685L)));
                }
                textView.addTextChangedListener(new C1351e5(3, textView));
                viewGroup.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: Lk
                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                    public final boolean onPreDraw() {
                        String strM625r2 = AbstractC0295Gu.m625r(-51990579116085L);
                        AbstractC0295Gu.m625r(-578325936338997L);
                        Object objCallMethod = XposedHelpers.callMethod(viewGroup2, strM625r2, Arrays.copyOf(new Object[0], 0));
                        AbstractC0295Gu.m625r(-52033528789045L);
                        int iIntValue = ((Integer) objCallMethod).intValue();
                        ImageView imageView2 = imageView;
                        if (iIntValue == 3 || textView.getVisibility() == 8) {
                            if (imageView2.getVisibility() != 8) {
                                imageView2.setVisibility(8);
                            }
                        } else if (imageView2.getVisibility() == 8) {
                            imageView2.setVisibility(0);
                        }
                        ViewGroup viewGroup4 = viewGroup;
                        if (viewGroup4.getTranslationY() != imageView2.getTranslationY()) {
                            imageView2.setTranslationY(viewGroup4.getTranslationY());
                        }
                        if (viewGroup4.getVisibility() == imageView2.getVisibility() || viewGroup4.getTranslationY() == 0.0f) {
                            return true;
                        }
                        imageView2.setVisibility(viewGroup4.getVisibility());
                        return true;
                    }
                });
                viewGroup2.getLayoutParams().height = AbstractC0295Gu.m616i(56);
                Drawable drawableM2890b = C1517hw.m2890b(AbstractC0295Gu.m625r(-63694364997685L));
                viewGroup2.setTag(io.github.cherrywechat.R.id.tag_view_bg_ban, null);
                viewGroup2.setBackground(drawableM2890b);
                viewGroup2.setTag(io.github.cherrywechat.R.id.tag_view_bg_ban, Object.class);
                View childAt = viewGroup2.getChildAt(0);
                AbstractC0295Gu.m625r(-63282048137269L);
                LinearLayout linearLayout = (LinearLayout) childAt;
                if (linearLayout != null) {
                    linearLayout.setBackground(null);
                    linearLayout.setTag(io.github.cherrywechat.R.id.tag_view_bg_ban, Object.class);
                }
                int childCount = linearLayout.getChildCount();
                int i3 = 0;
                while (i3 < childCount) {
                    View childAt2 = linearLayout.getChildAt(i3);
                    AbstractC0295Gu.m625r(-61911953569845L);
                    ViewGroup viewGroup4 = (ViewGroup) childAt2;
                    C1456gf.m2807r(viewGroup4);
                    TextView textView2 = (TextView) viewGroup4.findViewById(AbstractC0828TB.f2618j);
                    textView2.setVisibility(8);
                    TextView textView3 = new TextView(textView2.getContext());
                    textView3.setTextSize(1, 12.0f);
                    textView3.setId(AbstractC0828TB.f2615g);
                    if (i3 == 0) {
                        HashMap map2 = AbstractC0999XA.f3193a;
                        iM2889a = C1517hw.m2889a(-16777216, AbstractC0295Gu.m625r(-61619895793717L));
                    } else {
                        HashMap map3 = AbstractC0999XA.f3193a;
                        iM2889a = C1517hw.m2889a(-7829368, AbstractC0295Gu.m625r(-61744449845301L));
                    }
                    C1456gf.m2797O(textView3, iM2889a);
                    if (i3 == 0) {
                        HashMap map4 = AbstractC0999XA.f3193a;
                        strM2892d = C1517hw.m2892d(AbstractC0295Gu.m625r(-62427349645365L), AbstractC0295Gu.m625r(-62517543958581L));
                    } else if (i3 == 1) {
                        HashMap map5 = AbstractC0999XA.f3193a;
                        strM2892d = C1517hw.m2892d(AbstractC0295Gu.m625r(-62530428860469L), AbstractC0295Gu.m625r(-62624918140981L));
                    } else if (i3 != 2) {
                        HashMap map6 = AbstractC0999XA.f3193a;
                        strM2892d = C1517hw.m2892d(AbstractC0295Gu.m625r(-62208306313269L), AbstractC0295Gu.m625r(-62281320757301L));
                    } else {
                        HashMap map7 = AbstractC0999XA.f3193a;
                        strM2892d = C1517hw.m2892d(AbstractC0295Gu.m625r(-62642098010165L), AbstractC0295Gu.m625r(-62195421411381L));
                    }
                    textView3.setText(strM2892d);
                    ViewParent parent = textView2.getParent();
                    AbstractC0295Gu.m625r(-62289910691893L);
                    ((ViewGroup) parent).addView(textView3, textView2.getLayoutParams());
                    ViewParent parent2 = textView2.getParent();
                    AbstractC0295Gu.m625r(-43306155243573L);
                    View childAt3 = ((ViewGroup) parent2).getChildAt(0);
                    AbstractC0295Gu.m625r(-43014097467445L);
                    ViewGroup viewGroup5 = (ViewGroup) childAt3;
                    viewGroup5.getChildAt(0).setAlpha(0.0f);
                    View childAt4 = viewGroup5.getChildAt(1);
                    AbstractC0295Gu.m625r(-43821551319093L);
                    TextView textView4 = (TextView) childAt4;
                    textView4.setAlpha(0.0f);
                    TextView textView5 = new TextView(textView4.getContext());
                    textView5.setTextSize(1, 12.0f);
                    HashMap map8 = AbstractC0999XA.f3193a;
                    textView5.setTextColor(C1517hw.m2889a(-16777216, AbstractC0295Gu.m625r(-43533788510261L)));
                    textView5.setGravity(17);
                    textView5.setVisibility(8);
                    textView5.setSingleLine(true);
                    textView5.setIncludeFontPadding(false);
                    textView5.setBackground(C1517hw.m2890b(AbstractC0295Gu.m625r(-43662637529141L)));
                    viewGroup5.addView(textView5, textView4.getLayoutParams());
                    textView4.addTextChangedListener(new C0672Pk(textView5, textView4));
                    View childAt5 = viewGroup5.getChildAt(2);
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(1);
                    gradientDrawable.setColor(C1517hw.m2889a(-65536, AbstractC0295Gu.m625r(-42163693942837L)));
                    C1456gf.m2796N(childAt5, gradientDrawable);
                    Context context = viewGroup5.getContext();
                    AbstractC0295Gu.m625r(-42296837929013L);
                    ImageView imageViewM2808t = C1456gf.m2808t(context, i3 != 0 ? i3 != 1 ? i3 != 2 ? C1517hw.m2890b(AbstractC0295Gu.m625r(-42395622176821L)) : C1517hw.m2890b(AbstractC0295Gu.m625r(-42756399429685L)) : C1517hw.m2890b(AbstractC0295Gu.m625r(-42017665054773L)) : C1517hw.m2890b(AbstractC0295Gu.m625r(-41815801591861L)));
                    textView3.setTag(imageViewM2808t);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AbstractC0295Gu.m616i(34), AbstractC0295Gu.m616i(34));
                    layoutParams.addRule(13);
                    viewGroup5.addView(imageViewM2808t, 0, layoutParams);
                    i3++;
                }
                View childAt6 = viewGroup3.getChildAt(1);
                AbstractC0295Gu.m625r(-41304700483637L);
                C1456gf.m2805o((ViewGroup) childAt6);
                View childAt7 = viewGroup3.getChildAt(2);
                AbstractC0295Gu.m625r(-39913131079733L);
                C1456gf.m2805o((ViewGroup) childAt7);
                View childAt8 = viewGroup3.getChildAt(3);
                AbstractC0295Gu.m625r(-39621073303605L);
                C1456gf.m2805o((ViewGroup) childAt8);
                HashMap map9 = AbstractC0999XA.f3193a;
                Drawable drawableM2890b2 = C1517hw.m2890b(AbstractC0295Gu.m625r(-65524021065781L));
                if (drawableM2890b2 != null) {
                    View childAt9 = viewGroup3.getChildAt(0);
                    AbstractC0295Gu.m625r(-65670049953845L);
                    Context context2 = viewGroup3.getContext();
                    AbstractC0295Gu.m625r(-64278480549941L);
                    ((ViewGroup) childAt9).addView(C1456gf.m2808t(context2, drawableM2890b2), 0, new ViewGroup.LayoutParams(-1, -1));
                }
                Drawable drawableM2890b3 = C1517hw.m2890b(AbstractC0295Gu.m625r(-63797444212789L));
                if (drawableM2890b3 != null) {
                    View childAt10 = viewGroup3.getChildAt(1);
                    AbstractC0295Gu.m625r(-63921998264373L);
                    Context context3 = viewGroup3.getContext();
                    AbstractC0295Gu.m625r(-64729452116021L);
                    ((ViewGroup) childAt10).addView(C1456gf.m2808t(context3, drawableM2890b3), 0, new ViewGroup.LayoutParams(-1, -1));
                }
                Drawable drawableM2890b4 = C1517hw.m2890b(AbstractC0295Gu.m625r(-64798171592757L));
                if (drawableM2890b4 != null) {
                    View childAt11 = viewGroup3.getChildAt(2);
                    AbstractC0295Gu.m625r(-64381559765045L);
                    Context context4 = viewGroup3.getContext();
                    AbstractC0295Gu.m625r(-62989990361141L);
                    ((ViewGroup) childAt11).addView(C1456gf.m2808t(context4, drawableM2890b4), 0, new ViewGroup.LayoutParams(-1, -1));
                }
                Drawable drawableM2890b5 = C1517hw.m2890b(AbstractC0295Gu.m625r(-63058709837877L));
                if (drawableM2890b5 != null) {
                    View childAt12 = viewGroup3.getChildAt(3);
                    AbstractC0295Gu.m625r(-63161789052981L);
                    Context context5 = viewGroup3.getContext();
                    AbstractC0295Gu.m625r(-62869731276853L);
                    ((ViewGroup) childAt12).addView(C1456gf.m2808t(context5, drawableM2890b5), 0, new ViewGroup.LayoutParams(-1, -1));
                }
                break;
            case 1:
                ScriptManager.executeScript$lambda$5$lambda$3(obj4, (LoadedScript) obj3, (String) obj2, (InterfaceC1416fj) obj);
                break;
            case 2:
                TextView textView6 = (TextView) obj4;
                C0339Hv c0339Hv = (C0339Hv) obj3;
                AlertDialog alertDialog = (AlertDialog) obj2;
                Context context6 = (Context) obj;
                LinkedHashMap linkedHashMap = AbstractC1257cG.f4258a;
                DexKitBridge dexKitBridge = new DexKitBridge(AbstractC1450gG.f5069c);
                Iterator it = AbstractC1257cG.f4258a.entrySet().iterator();
                while (it.hasNext()) {
                    C1214bG c1214bG = (C1214bG) ((Map.Entry) it.next()).getValue();
                    try {
                        objMo446d = c1214bG.f4148c.mo446d(dexKitBridge, AbstractC1450gG.f5069c);
                    } catch (Throwable unused) {
                        AbstractC0295Gu.m625r(-579919369205813L);
                        String str = c1214bG.f4147b;
                        AbstractC0295Gu.m625r(-579940844042293L);
                        objMo446d = null;
                    }
                    if (objMo446d != null) {
                        try {
                            c1214bG.f4146a = objMo446d;
                            SharedPreferences.Editor editorEdit = AbstractC1257cG.m2376d().edit();
                            editorEdit.putString(c1214bG.f4147b, objMo446d instanceof Method ? new C0149Dd((Method) objMo446d).toString() : objMo446d instanceof Class ? AbstractC0235Fd.m481d(AbstractC0235Fd.m478a((Class) objMo446d)) : objMo446d instanceof String ? (String) objMo446d : null);
                            editorEdit.apply();
                        } catch (Throwable th) {
                            textView6.post(new RunnableC2445r8(textView6, th, alertDialog, 6));
                            return;
                        }
                    } else {
                        textView6.post(new RunnableC2260n3(i2, textView6, c1214bG));
                    }
                    c0339Hv.f1147a++;
                    textView6.post(new RunnableC2260n3(18, textView6, c0339Hv));
                    break;
                }
                SharedPreferences.Editor editorEdit2 = AbstractC1257cG.m2376d().edit();
                editorEdit2.putInt(AbstractC0295Gu.m625r(-579966613846069L), 115);
                editorEdit2.apply();
                dexKitBridge.close();
                textView6.post(new RunnableC2445r8(textView6, alertDialog, context6));
                break;
            default:
                Window window = (Window) obj4;
                Window.Callback callback = (Window.Callback) obj3;
                Runnable runnable = (Runnable) obj2;
                C1666I c1666i = (C1666I) obj;
                View viewPeekDecorView = window.peekDecorView();
                if (viewPeekDecorView != null) {
                    window.setCallback(callback);
                    ViewTreeObserverOnDrawListenerC1720h viewTreeObserverOnDrawListenerC1720h = new ViewTreeObserverOnDrawListenerC1720h(viewPeekDecorView, runnable);
                    c1666i.getClass();
                    viewPeekDecorView.getViewTreeObserver().addOnDrawListener(viewTreeObserverOnDrawListenerC1720h);
                }
                break;
        }
    }

    public /* synthetic */ RunnableC0586Nk(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f1905a = i;
        this.f1906b = obj;
        this.f1907c = obj2;
        this.f1908d = obj3;
        this.f1909e = obj4;
    }
}
