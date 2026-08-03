package p000;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import io.github.cherrywechat.R;
import io.github.cherrywechat.lua.api.CherryMessageAPI;
import io.github.cherrywechat.lua.api.NetworkAPI;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: Tp */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0848Tp implements InterfaceC1416fj {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2693a;

    public /* synthetic */ C0848Tp(int i) {
        this.f2693a = i;
    }

    /* JADX INFO: renamed from: c */
    private final Object m1670c(Object obj) {
        AbstractC0295Gu.m625r(-50470160693301L);
        C2428qs c2428qs = ((C1494hG) obj).f5263a;
        Field[] fields = c2428qs.f8521b.getClass().getFields();
        int i = 0;
        while (i < fields.length) {
            int i2 = i + 1;
            try {
                Field field = fields[i];
                if (AbstractC0585Nj.m1134a(field.getType(), View.class)) {
                    try {
                        Object obj2 = field.get(c2428qs.f8521b);
                        View view = obj2 instanceof View ? (View) obj2 : null;
                        if (view != null) {
                            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                            if ((layoutParams instanceof RelativeLayout.LayoutParams) && ((RelativeLayout.LayoutParams) layoutParams).width == -1 && ((RelativeLayout.LayoutParams) layoutParams).height == -1) {
                                view.setBackground(null);
                                view.setTag(R.id.tag_view_bg_ban, Object.class);
                                ViewParent parent = view.getParent();
                                AbstractC0295Gu.m625r(-50521700300853L);
                                ((ViewGroup) parent).setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC2071is());
                            }
                        }
                    } catch (IllegalAccessException unused) {
                    }
                }
                i = i2;
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new NoSuchElementException(e.getMessage());
            }
        }
        return C0829TC.f2620a;
    }

    /* JADX INFO: renamed from: e */
    private final Object m1671e(Object obj) {
        C1494hG c1494hG = (C1494hG) obj;
        AbstractC0295Gu.m625r(-474542346598453L);
        String strM625r = AbstractC0295Gu.m625r(-474598181173301L);
        AbstractC0295Gu.m625r(-836659629258805L);
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        int i = 0;
        while (true) {
            if (i >= stackTrace.length) {
                break;
            }
            int i2 = i + 1;
            try {
                String string = stackTrace[i].toString();
                AbstractC0295Gu.m625r(-836681104095285L);
                if (AbstractC2564tz.m5051L(string, strM625r, false)) {
                    HashMap map = AbstractC0999XA.f3193a;
                    Drawable drawableM2890b = C1517hw.m2890b(AbstractC0295Gu.m625r(-474692670453813L));
                    if (drawableM2890b != null) {
                        ((Object[]) c1494hG.f5263a.f8522c)[0] = drawableM2890b;
                    }
                } else {
                    i = i2;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new NoSuchElementException(e.getMessage());
            }
        }
        return C0829TC.f2620a;
    }

    /* JADX INFO: renamed from: f */
    private final Object m1672f(Object obj) {
        AbstractC0295Gu.m625r(-473155072161845L);
        int i = 0;
        Object obj2 = ((Object[]) ((C1494hG) obj).f5263a.f8522c)[0];
        ViewGroup viewGroup = obj2 instanceof ViewGroup ? (ViewGroup) obj2 : null;
        if (viewGroup != null) {
            String name = viewGroup.getContext().getClass().getName();
            if (name.equals(AbstractC0295Gu.m625r(-837870810036277L)) || name.equals(AbstractC0295Gu.m625r(-837995364087861L)) || name.equals(AbstractC0295Gu.m625r(-838708328658997L))) {
                int i2 = 1;
                if (viewGroup.getChildCount() == 3 && (viewGroup.getChildAt(0) instanceof ImageView) && (viewGroup.getChildAt(1) instanceof LinearLayout) && (viewGroup.getChildAt(2) instanceof ImageView)) {
                    View childAt = viewGroup.getChildAt(1);
                    AbstractC0295Gu.m625r(-473210906736693L);
                    ViewGroup viewGroup2 = (ViewGroup) childAt;
                    HashMap map = AbstractC0999XA.f3193a;
                    Drawable drawableM2890b = C1517hw.m2890b(AbstractC0295Gu.m625r(-472918848960565L));
                    if (drawableM2890b != null) {
                        viewGroup.getChildAt(1).setBackground(drawableM2890b);
                        Drawable drawableM2890b2 = C1517hw.m2890b(AbstractC0295Gu.m625r(-473627518564405L));
                        if (drawableM2890b2 != null) {
                            View childAt2 = viewGroup.getChildAt(0);
                            AbstractC0295Gu.m625r(-473825087060021L);
                            ImageView imageView = (ImageView) childAt2;
                            String strM625r = AbstractC0295Gu.m625r(-473541619218485L);
                            Object[] objArr = {Boolean.FALSE};
                            AbstractC0295Gu.m625r(-578325936338997L);
                            XposedHelpers.callMethod(imageView, strM625r, Arrays.copyOf(objArr, 1));
                            imageView.setImageDrawable(drawableM2890b2);
                        }
                        Drawable drawableM2890b3 = C1517hw.m2890b(AbstractC0295Gu.m625r(-471982546090037L));
                        if (drawableM2890b3 != null) {
                            View childAt3 = viewGroup.getChildAt(2);
                            AbstractC0295Gu.m625r(-472188704520245L);
                            ImageView imageView2 = (ImageView) childAt3;
                            String strM625r2 = AbstractC0295Gu.m625r(-471905236678709L);
                            Object[] objArr2 = {Boolean.FALSE};
                            AbstractC0295Gu.m625r(-578325936338997L);
                            XposedHelpers.callMethod(imageView2, strM625r2, Arrays.copyOf(objArr2, 1));
                            imageView2.setImageDrawable(drawableM2890b3);
                        }
                        viewGroup2.getChildAt(1).setAlpha(0.0f);
                        int iM2889a = C1517hw.m2889a(0, AbstractC0295Gu.m625r(-472545186805813L));
                        if (iM2889a != 0) {
                            View childAt4 = viewGroup2.getChildAt(0);
                            AbstractC0295Gu.m625r(-472682625759285L);
                            ViewGroup viewGroup3 = (ViewGroup) childAt4;
                            View childAt5 = viewGroup2.getChildAt(2);
                            AbstractC0295Gu.m625r(-472390567983157L);
                            ViewGroup viewGroup4 = (ViewGroup) childAt5;
                            int childCount = viewGroup3.getChildCount();
                            for (int i3 = 0; i3 < childCount; i3++) {
                                View childAt6 = viewGroup3.getChildAt(i3);
                                AbstractC0295Gu.m625r(-470998998579253L);
                                ViewGroup viewGroup5 = (ViewGroup) childAt6;
                                View viewFindViewById = viewGroup5.findViewById(AbstractC0828TB.f2614f);
                                String strM625r3 = AbstractC0295Gu.m625r(-470706940803125L);
                                Object[] objArr3 = {Integer.valueOf(iM2889a)};
                                AbstractC0295Gu.m625r(-578325936338997L);
                                XposedHelpers.callMethod(viewFindViewById, strM625r3, Arrays.copyOf(objArr3, 1));
                                ((TextView) viewGroup5.findViewById(AbstractC0828TB.f2616h)).setTextColor(iM2889a);
                            }
                            viewGroup3.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC1191au(iM2889a, i));
                            int childCount2 = viewGroup4.getChildCount();
                            while (i < childCount2) {
                                View childAt7 = viewGroup4.getChildAt(i);
                                AbstractC0295Gu.m625r(-470762775377973L);
                                ViewGroup viewGroup6 = (ViewGroup) childAt7;
                                View viewFindViewById2 = viewGroup6.findViewById(AbstractC0828TB.f2614f);
                                String strM625r4 = AbstractC0295Gu.m625r(-471570229229621L);
                                Object[] objArr4 = {Integer.valueOf(iM2889a)};
                                AbstractC0295Gu.m625r(-578325936338997L);
                                XposedHelpers.callMethod(viewFindViewById2, strM625r4, Arrays.copyOf(objArr4, 1));
                                ((TextView) viewGroup6.findViewById(AbstractC0828TB.f2616h)).setTextColor(iM2889a);
                                i++;
                            }
                            viewGroup4.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC1191au(iM2889a, i2));
                        }
                    }
                } else if (viewGroup.getChildCount() == 2 && (viewGroup.getChildAt(0) instanceof LinearLayout) && (viewGroup.getChildAt(1) instanceof ImageView)) {
                    View childAt8 = viewGroup.getChildAt(0);
                    AbstractC0295Gu.m625r(-471626063804469L);
                    LinearLayout linearLayout = (LinearLayout) childAt8;
                    View childAt9 = linearLayout.getChildAt(0);
                    if (childAt9 instanceof TextView) {
                        TextView textView = (TextView) childAt9;
                        if (AbstractC0585Nj.m1134a(textView.getText(), AbstractC0295Gu.m625r(-471355480864821L))) {
                            HashMap map2 = AbstractC0999XA.f3193a;
                            Drawable drawableM2890b4 = C1517hw.m2890b(AbstractC0295Gu.m625r(-471389840603189L));
                            if (drawableM2890b4 != null) {
                                linearLayout.setBackground(drawableM2890b4);
                                Drawable drawableM2890b5 = C1517hw.m2890b(AbstractC0295Gu.m625r(-469899486951477L));
                                if (drawableM2890b5 != null) {
                                    View childAt10 = viewGroup.getChildAt(1);
                                    AbstractC0295Gu.m625r(-469555889567797L);
                                    ImageView imageView3 = (ImageView) childAt10;
                                    String strM625r5 = AbstractC0295Gu.m625r(-470371933354037L);
                                    Object[] objArr5 = {Boolean.FALSE};
                                    AbstractC0295Gu.m625r(-578325936338997L);
                                    XposedHelpers.callMethod(imageView3, strM625r5, Arrays.copyOf(objArr5, 1));
                                    imageView3.setImageDrawable(drawableM2890b5);
                                }
                                int iM2889a2 = C1517hw.m2889a(0, AbstractC0295Gu.m625r(-470462127667253L));
                                if (iM2889a2 != 0) {
                                    textView.setTextColor(iM2889a2);
                                }
                            }
                        }
                    }
                }
            }
        }
        return C0829TC.f2620a;
    }

    /* JADX INFO: renamed from: h */
    private final Object m1673h(Object obj) {
        String strM625r;
        String str;
        AbstractC0295Gu.m625r(-524733334419509L);
        C2428qs c2428qs = ((C1494hG) obj).f5263a;
        Object result = ((XC_MethodHook.MethodHookParam) c2428qs.f8523d).getResult();
        View view = result instanceof View ? (View) result : null;
        if (view != null) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                C1456gf.m2806q(viewGroup);
                TextView textView = (TextView) view.findViewById(android.R.id.title);
                if (textView != null) {
                    C1339du c1339du = C1339du.f4823a;
                    ImageView imageViewM2594c = C1339du.m2594c(viewGroup);
                    if (imageViewM2594c != null && imageViewM2594c.getContext().getClass().getName().equals(AbstractC0295Gu.m625r(-838296011798581L)) && imageViewM2594c.getVisibility() == 0) {
                        HashMap map = AbstractC0999XA.f3193a;
                        Map mapM5110L = AbstractC2598uq.m5110L(new C0208Et(AbstractC0295Gu.m625r(-770637391984693L), AbstractC0295Gu.m625r(-770658866821173L)), new C0208Et(AbstractC0295Gu.m625r(-770276614731829L), AbstractC0295Gu.m625r(-770306679502901L)), new C0208Et(AbstractC0295Gu.m625r(-770474183227445L), AbstractC0295Gu.m625r(-768837800687669L)), new C0208Et(AbstractC0295Gu.m625r(-768988124543029L), AbstractC0295Gu.m625r(-769001009444917L)), new C0208Et(AbstractC0295Gu.m625r(-768601577486389L), AbstractC0295Gu.m625r(-768618757355573L)), new C0208Et(AbstractC0295Gu.m625r(-768816325851189L), AbstractC0295Gu.m625r(-768833505720373L)), new C0208Et(AbstractC0295Gu.m625r(-769576535062581L), AbstractC0295Gu.m625r(-769610894800949L)), new C0208Et(AbstractC0295Gu.m625r(-769245822580789L), AbstractC0295Gu.m625r(-769357491730485L)), new C0208Et(AbstractC0295Gu.m625r(-767875728013365L), AbstractC0295Gu.m625r(-767974512261173L)), new C0208Et(AbstractC0295Gu.m625r(-767583670237237L), AbstractC0295Gu.m625r(-767703929321525L)), new C0208Et(AbstractC0295Gu.m625r(-768408303958069L), AbstractC0295Gu.m625r(-768507088205877L)), new C0208Et(AbstractC0295Gu.m625r(-768111951214645L), AbstractC0295Gu.m625r(-768202145527861L)), new C0208Et(AbstractC0295Gu.m625r(-766716086843445L), AbstractC0295Gu.m625r(-766806281156661L)), new C0208Et(AbstractC0295Gu.m625r(-766411144165429L), AbstractC0295Gu.m625r(-766509928413237L)), new C0208Et(AbstractC0295Gu.m625r(-767222892984373L), AbstractC0295Gu.m625r(-767334562134069L)), new C0208Et(AbstractC0295Gu.m625r(-766939425142837L), AbstractC0295Gu.m625r(-767029619456053L)), new C0208Et(AbstractC0295Gu.m625r(-767184238278709L), AbstractC0295Gu.m625r(-765638050052149L)), new C0208Et(AbstractC0295Gu.m625r(-765792668874805L), AbstractC0295Gu.m625r(-765324517439541L)), new C0208Et(AbstractC0295Gu.m625r(-765479136262197L), AbstractC0295Gu.m625r(-766131971291189L)), new C0208Et(AbstractC0295Gu.m625r(-766286590113845L), AbstractC0295Gu.m625r(-765818438678581L)), new C0208Et(AbstractC0295Gu.m625r(-765985942403125L), AbstractC0295Gu.m625r(-766067546781749L)), new C0208Et(AbstractC0295Gu.m625r(-746963532249141L), AbstractC0295Gu.m625r(-747053726562357L)), new C0208Et(AbstractC0295Gu.m625r(-746624229832757L), AbstractC0295Gu.m625r(-746701539244085L)), new C0208Et(AbstractC0295Gu.m625r(-746838978197557L), AbstractC0295Gu.m625r(-747496108193845L)), new C0208Et(AbstractC0295Gu.m625r(-747633547147317L), AbstractC0295Gu.m625r(-747199755450421L)), new C0208Et(AbstractC0295Gu.m625r(-747337194403893L), AbstractC0295Gu.m625r(-745791006177333L)), new C0208Et(AbstractC0295Gu.m625r(-745915560228917L), AbstractC0295Gu.m625r(-745486063499317L)), new C0208Et(AbstractC0295Gu.m625r(-745610617550901L), AbstractC0295Gu.m625r(-745700811864117L)), new C0208Et(AbstractC0295Gu.m625r(-746370826762293L), AbstractC0295Gu.m625r(-746426661337141L)));
                        Object obj2 = c2428qs.f8521b;
                        if (C1339du.f4824b.length() <= 0) {
                            int i = AbstractC1450gG.f5067a;
                            Field[] fields = AbstractC1406fG.m2718r0(AbstractC0295Gu.m625r(-524956672718901L)).getFields();
                            AbstractC0295Gu.m625r(-524600190433333L);
                            int length = fields.length;
                            int i2 = 0;
                            while (true) {
                                if (i2 >= length) {
                                    strM625r = AbstractC0295Gu.m625r(-524729039452213L);
                                    break;
                                }
                                Field field = fields[i2];
                                if (AbstractC0585Nj.m1134a(field.getType(), String.class) && (str = (String) field.get(obj2)) != null && AbstractC2564tz.m5051L(str, AbstractC0295Gu.m625r(-524664614942773L), false)) {
                                    String name = field.getName();
                                    AbstractC0295Gu.m625r(-524673204877365L);
                                    C1339du.f4824b = name;
                                    strM625r = str;
                                    break;
                                }
                                i2++;
                            }
                        } else {
                            C2648vx c2648vx = new C2648vx();
                            if (obj2 instanceof Class) {
                                c2648vx.f9163b = (Class) obj2;
                            } else {
                                c2648vx.f9164c = obj2;
                                c2648vx.f9163b = obj2 != null ? obj2.getClass() : null;
                            }
                            c2648vx.m5180c(C1339du.f4824b);
                            strM625r = (String) c2648vx.m5178a();
                        }
                        Drawable drawableM2890b = C1517hw.m2890b((String) mapM5110L.get(strM625r));
                        if (drawableM2890b != null) {
                            HashMap map2 = AbstractC0999XA.f3193a;
                            int iM2889a = C1517hw.m2889a(0, AbstractC0295Gu.m625r(-525334629840949L));
                            if (iM2889a != 0) {
                                textView.setTextColor(iM2889a);
                            }
                            imageViewM2594c.setLayerPaint(null);
                            ViewGroup.LayoutParams layoutParams = imageViewM2594c.getLayoutParams();
                            layoutParams.width = AbstractC0295Gu.m616i(32);
                            layoutParams.height = AbstractC0295Gu.m616i(32);
                            imageViewM2594c.setImageDrawable(drawableM2890b);
                        }
                    }
                }
            } else {
                view.setBackground(null);
                view.setTag(R.id.tag_view_bg_ban, Object.class);
            }
        }
        return C0829TC.f2620a;
    }

    /* JADX INFO: renamed from: i */
    private final Object m1674i(Object obj) {
        C1494hG c1494hG = (C1494hG) obj;
        AbstractC0295Gu.m625r(-3045131810869L);
        if (C0811Sv.f2565b.m2024e()) {
            c1494hG.f5263a.m4864C(Boolean.FALSE);
        }
        return C0829TC.f2620a;
    }

    /* JADX INFO: renamed from: j */
    private final Object m1675j(Object obj) throws JSONException {
        AbstractC0295Gu.m625r(-2838973380661L);
        C2428qs c2428qs = ((C1494hG) obj).f5263a;
        if (C0469Kw.f1524b.m2024e()) {
            Object[] objArr = (Object[]) c2428qs.f8522c;
            Object obj2 = objArr[0];
            AbstractC0295Gu.m625r(-2894807955509L);
            String str = (String) obj2;
            Object obj3 = objArr[3];
            AbstractC0295Gu.m625r(-1464583845941L);
            String str2 = (String) obj3;
            Object obj4 = objArr[1];
            AbstractC0295Gu.m625r(-1133871364149L);
            long jLongValue = ((Long) obj4).longValue();
            C2813zq c2813zqM2680E = AbstractC1406fG.m2680E(Pattern.compile(AbstractC0295Gu.m625r(-1344324761653L)).matcher(str2), 0, str2);
            if (c2813zqM2680E != null) {
                c2428qs.m4864C(null);
                String str3 = (String) ((C2770yq) c2813zqM2680E.m5446a()).get(1);
                JSONObject jSONObject = new JSONObject();
                String strM625r = AbstractC0295Gu.m625r(-1971389986869L);
                StringBuilder sb = new StringBuilder("\"");
                sb.append(str3);
                sb.append('\"');
                SharedPreferences sharedPreferences = AbstractC0599Nx.f1939a;
                sb.append(AbstractC0599Nx.m1173b(AbstractC0295Gu.m625r(-1992864823349L), AbstractC0295Gu.m625r(-2057289332789L)));
                jSONObject.put(strM625r, sb.toString());
                jSONObject.put(AbstractC0295Gu.m625r(-2095944038453L), jLongValue);
                jSONObject.put(AbstractC0295Gu.m625r(-2134598744117L), str);
                C0668Pg c0668Pg = AbstractC2248ms.f7951a;
                String string = jSONObject.toString();
                AbstractC0295Gu.m625r(-2164663515189L);
                c0668Pg.getClass();
                C0668Pg.m1328h(str, string);
            }
        }
        return C0829TC.f2620a;
    }

    /* JADX INFO: renamed from: k */
    private final Object m1676k(Object obj) {
        C1494hG c1494hG = (C1494hG) obj;
        AbstractC0295Gu.m625r(-1675037243445L);
        if (C0469Kw.f1524b.m2024e()) {
            C2428qs c2428qs = c1494hG.f5263a;
            Object obj2 = c2428qs.f8521b;
            Object obj3 = ((Object[]) c2428qs.f8522c)[0];
            try {
                JSONObject jSONObject = new JSONObject((String) AbstractC0213Ey.m404b(-1730871818293L, AbstractC1406fG.m2685J(obj3)));
                long jOptLong = jSONObject.optLong(AbstractC0295Gu.m625r(-1791001360437L));
                if (jOptLong != 0) {
                    String strOptString = jSONObject.optString(AbstractC0295Gu.m625r(-1829656066101L));
                    String strOptString2 = jSONObject.optString(AbstractC0295Gu.m625r(-1859720837173L));
                    C1214bG c1214bG = (C1214bG) AbstractC1257cG.f4258a.get(AbstractC0295Gu.m625r(-587603065698357L));
                    Object obj4 = c1214bG != null ? c1214bG.f4146a : null;
                    Method method = obj4 instanceof Method ? (Method) obj4 : null;
                    Object objInvoke = method != null ? method.invoke(obj2, strOptString, Long.valueOf(jOptLong)) : null;
                    if (objInvoke != null) {
                        C2648vx c2648vxM2685J = AbstractC1406fG.m2685J(objInvoke);
                        c2648vxM2685J.m5180c(AbstractC0295Gu.m625r(-1881195673653L));
                        long jLongValue = ((Number) c2648vxM2685J.m5178a()).longValue();
                        C2648vx c2648vxM2685J2 = AbstractC1406fG.m2685J(obj3);
                        c2648vxM2685J2.m5180c(AbstractC0295Gu.m625r(-304942676021L));
                        c2648vxM2685J2.m5181d(Long.valueOf(jLongValue + 1));
                        C2648vx c2648vxM2685J3 = AbstractC1406fG.m2685J(obj3);
                        c2648vxM2685J3.m5180c(AbstractC0295Gu.m625r(-377957120053L));
                        c2648vxM2685J3.m5181d(strOptString2);
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return C0829TC.f2620a;
    }

    /* JADX INFO: renamed from: l */
    private final Object m1677l(Object obj) {
        AbstractC0295Gu.m625r(-816043784245L);
        C2428qs c2428qs = ((C1494hG) obj).f5263a;
        if (AbstractC0585Nj.m1134a(((Object[]) c2428qs.f8522c)[3], Boolean.FALSE)) {
            Object[] objArr = (Object[]) c2428qs.f8522c;
            if (objArr[4] == null) {
                int i = 0;
                Object obj2 = objArr[0];
                Bitmap bitmap = obj2 instanceof Bitmap ? (Bitmap) obj2 : null;
                if (bitmap != null && !bitmap.isRecycled()) {
                    C0555Mw.f1823b.getClass();
                    StackTraceElement[] stackTrace = new Throwable().getStackTrace();
                    AbstractC0295Gu.m625r(-635655157813L);
                    int length = stackTrace.length;
                    while (true) {
                        if (i >= length) {
                            SharedPreferences sharedPreferences = AbstractC0599Nx.f1939a;
                            String strM625r = AbstractC0295Gu.m625r(-16814796961845L);
                            AbstractC0295Gu.m625r(-839953869174837L);
                            c2428qs.m4864C(AbstractC0148Dc.m279m(bitmap, AbstractC0599Nx.f1939a.getInt(strM625r, 100)));
                            break;
                        }
                        String className = stackTrace[i].getClassName();
                        C1214bG c1214bG = (C1214bG) AbstractC1257cG.f4258a.get(AbstractC0295Gu.m625r(-585691805251637L));
                        Object obj3 = c1214bG != null ? c1214bG.f4146a : null;
                        Class cls = obj3 instanceof Class ? (Class) obj3 : null;
                        if (AbstractC0585Nj.m1134a(className, cls != null ? cls.getName() : null)) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return C0829TC.f2620a;
    }

    /* JADX INFO: renamed from: m */
    private final Object m1678m(Object obj) {
        AbstractC0295Gu.m625r(-16917876176949L);
        Object obj2 = ((C1494hG) obj).f5263a.f8521b;
        String strM625r = AbstractC0295Gu.m625r(-16969415784501L);
        AbstractC0295Gu.m625r(-578325936338997L);
        Object objCallMethod = XposedHelpers.callMethod(obj2, strM625r, Arrays.copyOf(new Object[0], 0));
        AbstractC0295Gu.m625r(-17033840293941L);
        View view = (View) objCallMethod;
        SharedPreferences sharedPreferences = AbstractC0599Nx.f1939a;
        String strM625r2 = AbstractC0295Gu.m625r(-16720307681333L);
        AbstractC0295Gu.m625r(-839953869174837L);
        view.setOutlineProvider(new C0512Lw((view.getLayoutParams().width / 2.0f) * (AbstractC0828TB.m1639f(AbstractC0599Nx.f1939a.getInt(strM625r2, 100), 100) / 100.0f)));
        view.setClipToOutline(true);
        return C0829TC.f2620a;
    }

    /* JADX INFO: renamed from: n */
    private final Object m1679n(Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        if (iIntValue <= 0) {
            return AbstractC0295Gu.m625r(-717259536437L);
        }
        if (iIntValue >= 100) {
            return AbstractC0295Gu.m625r(-730144438325L);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(iIntValue);
        sb.append('%');
        return sb.toString();
    }

    /* JADX INFO: renamed from: o */
    private final Object m1680o(Object obj) {
        String strM1911h;
        String strM1909e;
        int iM5057R;
        int iM5057R2;
        AbstractC0295Gu.m625r(-517444774918197L);
        C2428qs c2428qs = ((C1494hG) obj).f5263a;
        Object obj2 = c2428qs.f8521b;
        Object[] objArr = (Object[]) c2428qs.f8522c;
        if (obj2 != null) {
            try {
                String strM625r = AbstractC0295Gu.m625r(-727584639809589L);
                AbstractC0295Gu.m625r(-578325936338997L);
                Object objCallMethod = XposedHelpers.callMethod(obj2, strM625r, Arrays.copyOf(new Object[0], 0));
                String str = objCallMethod instanceof String ? (String) objCallMethod : null;
                if (str != null && AbstractC2564tz.m5051L(str, AbstractC0295Gu.m625r(-725969732106293L), false)) {
                    AbstractC0671Pj.f2143f = obj2;
                }
            } catch (Exception unused) {
            }
        }
        Object obj3 = objArr[0];
        AbstractC0295Gu.m625r(-517500609493045L);
        if (AbstractC0585Nj.m1134a((String) obj3, AbstractC0295Gu.m625r(-516070385383477L))) {
            Object obj4 = objArr[2];
            AbstractC0295Gu.m625r(-516104745121845L);
            C1017Xm c1017Xm = new C1017Xm((ContentValues) obj4);
            ContentValues contentValues = (ContentValues) c1017Xm.f3226b;
            C0852Tt.f2702a.getClass();
            AbstractC0295Gu.m625r(-727021999093813L);
            try {
                int i = AbstractC0085Bz.m132J(c1017Xm.m1911h(), false, AbstractC0295Gu.m625r(-727606114646069L)) ? 1 : c1017Xm.m1911h().startsWith(AbstractC0295Gu.m625r(-727649064319029L)) ? 2 : 0;
                if (i != 1 || c1017Xm.m1912i() || (iM5057R2 = AbstractC2564tz.m5057R(c1017Xm.m1909e(), AbstractC0295Gu.m625r(-727666244188213L), 0, false, 6)) <= 0) {
                    strM1911h = c1017Xm.m1911h();
                } else {
                    strM1911h = c1017Xm.m1909e().substring(0, iM5057R2);
                    AbstractC0295Gu.m625r(-727679129090101L);
                }
                String str2 = strM1911h;
                if (i != 1 || c1017Xm.m1912i() || (iM5057R = AbstractC2564tz.m5057R(c1017Xm.m1909e(), AbstractC0295Gu.m625r(-727743553599541L), 0, false, 6)) <= 0) {
                    strM1909e = c1017Xm.m1909e();
                } else {
                    strM1909e = c1017Xm.m1909e().substring(iM5057R + 2);
                    AbstractC0295Gu.m625r(-727756438501429L);
                }
                String str3 = strM1909e;
                String strM1911h2 = c1017Xm.m1911h();
                boolean zM1912i = c1017Xm.m1912i();
                Integer asInteger = contentValues.getAsInteger(AbstractC0295Gu.m625r(-729873857378357L));
                int iIntValue = asInteger != null ? asInteger.intValue() : 0;
                Integer asInteger2 = contentValues.getAsInteger(AbstractC0295Gu.m625r(-729500195223605L));
                int iIntValue2 = asInteger2 != null ? asInteger2.intValue() : 0;
                Long asLong = contentValues.getAsLong(AbstractC0295Gu.m625r(-729435770714165L));
                long jLongValue = asLong != null ? asLong.longValue() : 0L;
                Long asLong2 = contentValues.getAsLong(AbstractC0295Gu.m625r(-729083583395893L));
                CherryMessageAPI.INSTANCE.dispatchMessage(new CherryMessageAPI.MessageData(strM1911h2, str2, zM1912i ? 1 : 0, iIntValue, iIntValue2, jLongValue, asLong2 != null ? asLong2.longValue() : 0L, str3, i, (ContentValues) c1017Xm.f3226b));
            } catch (Exception unused2) {
                AbstractC0295Gu.m625r(-727820863010869L);
                AbstractC0295Gu.m625r(-727331236739125L);
            }
        }
        return C0829TC.f2620a;
    }

    /* JADX INFO: renamed from: p */
    private final Object m1681p(Object obj) {
        Set setM4909s0;
        AbstractC0295Gu.m625r(-515842752116789L);
        C2428qs c2428qs = ((C1494hG) obj).f5263a;
        Object obj2 = c2428qs.f8521b;
        if (obj2 != null) {
            try {
                String strM625r = AbstractC0295Gu.m625r(-727584639809589L);
                AbstractC0295Gu.m625r(-578325936338997L);
                Object objCallMethod = XposedHelpers.callMethod(obj2, strM625r, Arrays.copyOf(new Object[0], 0));
                String str = objCallMethod instanceof String ? (String) objCallMethod : null;
                if (str != null && AbstractC2564tz.m5051L(str, AbstractC0295Gu.m625r(-725969732106293L), false)) {
                    AbstractC0671Pj.f2143f = obj2;
                }
            } catch (Exception unused) {
            }
        }
        Object[] objArr = (Object[]) c2428qs.f8522c;
        Object obj3 = objArr[0];
        AbstractC0295Gu.m625r(-515898586691637L);
        Object obj4 = objArr[1];
        AbstractC0295Gu.m625r(-516667385837621L);
        ContentValues contentValues = (ContentValues) obj4;
        if (AbstractC0585Nj.m1134a((String) obj3, AbstractC0295Gu.m625r(-516405392832565L))) {
            String asString = contentValues.getAsString(AbstractC0295Gu.m625r(-516444047538229L));
            String asString2 = contentValues.getAsString(AbstractC0295Gu.m625r(-514850614671413L));
            Integer asInteger = contentValues.getAsInteger(AbstractC0295Gu.m625r(-514897859311669L));
            Cursor cursorM1357w = AbstractC0671Pj.m1357w(AbstractC0295Gu.m625r(-514949398919221L), new String[]{asString});
            if (cursorM1357w != null) {
                if (cursorM1357w.moveToFirst()) {
                    int i = cursorM1357w.getInt(cursorM1357w.getColumnIndex(AbstractC0295Gu.m625r(-514691700881461L)));
                    String string = cursorM1357w.getString(cursorM1357w.getColumnIndex(AbstractC0295Gu.m625r(-514743240489013L)));
                    if (asInteger == null || i != asInteger.intValue()) {
                        Set setM4909s02 = C0538Mf.f1751a;
                        if (string != null) {
                            List listM5066a0 = AbstractC2564tz.m5066a0(string, new char[]{';'});
                            ArrayList arrayList = new ArrayList();
                            for (Object obj5 : listM5066a0) {
                                if (!AbstractC2564tz.m5059T((String) obj5)) {
                                    arrayList.add(obj5);
                                }
                            }
                            setM4909s0 = AbstractC2453ra.m4909s0(arrayList);
                        } else {
                            setM4909s0 = setM4909s02;
                        }
                        if (asString2 != null) {
                            List listM5066a02 = AbstractC2564tz.m5066a0(asString2, new char[]{';'});
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj6 : listM5066a02) {
                                if (!AbstractC2564tz.m5059T((String) obj6)) {
                                    arrayList2.add(obj6);
                                }
                            }
                            setM4909s02 = AbstractC2453ra.m4909s0(arrayList2);
                        }
                        Set<String> setM996A = AbstractC0513Lx.m996A(setM4909s02, setM4909s0);
                        Set<String> setM996A2 = AbstractC0513Lx.m996A(setM4909s0, setM4909s02);
                        for (String str2 : setM996A) {
                            C0852Tt.f2702a.getClass();
                            AbstractC0295Gu.m625r(-727442905888821L);
                            AbstractC0295Gu.m625r(-727485855561781L);
                        }
                        for (String str3 : setM996A2) {
                            C0852Tt.f2702a.getClass();
                            AbstractC0295Gu.m625r(-727442905888821L);
                            AbstractC0295Gu.m625r(-727485855561781L);
                        }
                    }
                }
                cursorM1357w.close();
            }
        }
        return C0829TC.f2620a;
    }

    /* JADX INFO: renamed from: q */
    private final Object m1682q(Object obj) {
        AbstractC0295Gu.m625r(-522147764107317L);
        Object obj2 = ((Object[]) ((C1494hG) obj).f5263a.f8522c)[0];
        AbstractC0295Gu.m625r(-522199303714869L);
        ViewGroup viewGroup = (ViewGroup) obj2;
        Context context = viewGroup.getContext();
        AbstractC0295Gu.m625r(-521907245938741L);
        String name = ((Activity) context).getClass().getName();
        if (!name.equals(AbstractC0295Gu.m625r(-522920858220597L)) && !name.equals(AbstractC0295Gu.m625r(-521486339143733L))) {
            viewGroup.post(new RunnableC2745y7(viewGroup, 4));
        }
        return C0829TC.f2620a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v170 */
    /* JADX WARN: Type inference failed for: r0v171 */
    /* JADX WARN: Type inference failed for: r0v172 */
    /* JADX WARN: Type inference failed for: r0v173 */
    /* JADX WARN: Type inference failed for: r0v174 */
    /* JADX WARN: Type inference failed for: r0v175 */
    /* JADX WARN: Type inference failed for: r0v176 */
    /* JADX WARN: Type inference failed for: r0v177 */
    /* JADX WARN: Type inference failed for: r0v178 */
    /* JADX WARN: Type inference failed for: r0v179 */
    /* JADX WARN: Type inference failed for: r0v180 */
    /* JADX WARN: Type inference failed for: r0v181 */
    /* JADX WARN: Type inference failed for: r0v182 */
    /* JADX WARN: Type inference failed for: r0v183 */
    /* JADX WARN: Type inference failed for: r0v184 */
    /* JADX WARN: Type inference failed for: r0v185 */
    /* JADX WARN: Type inference failed for: r0v186 */
    /* JADX WARN: Type inference failed for: r0v41, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout, java.lang.Object, oy] */
    /* JADX WARN: Type inference failed for: r0v42, types: [Pi, Wk, android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r0v45, types: [Wk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v45, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r2v46, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v69, types: [android.view.View, android.view.ViewGroup] */
    @Override // p000.InterfaceC1416fj
    /* JADX INFO: renamed from: g */
    public final Object mo90g(Object obj) throws IllegalAccessException {
        Object obj2;
        C2322og c2322og;
        ?? c2112jq;
        Uri data;
        int columnIndex;
        Uri data2;
        int columnIndex2;
        int i = this.f2693a;
        int i2 = 3;
        C0829TC c0829tc = C0829TC.f2620a;
        int i3 = 0;
        switch (i) {
            case 0:
                AbstractC0295Gu.m625r(-457585815713845L);
                Object obj3 = ((C1494hG) obj).f5263a.f8521b;
                HashMap map = AbstractC0999XA.f3193a;
                int iM2889a = C1517hw.m2889a(0, AbstractC0295Gu.m625r(-458264420546613L));
                if (iM2889a != 0) {
                    int i4 = AbstractC1450gG.f5067a;
                    Field[] declaredFields = AbstractC1406fG.m2718r0(AbstractC0295Gu.m625r(-458380384663605L)).getDeclaredFields();
                    AbstractC0295Gu.m625r(-457989542639669L);
                    int length = declaredFields.length;
                    while (i3 < length) {
                        Field field = declaredFields[i3];
                        if (AbstractC0585Nj.m1134a(field.getType(), Integer.TYPE)) {
                            field.setAccessible(true);
                            Object obj4 = field.get(obj3);
                            AbstractC0295Gu.m625r(-458088326887477L);
                            if (((Integer) obj4).intValue() == -16268960) {
                                field.set(obj3, Integer.valueOf(iM2889a));
                            }
                        }
                        i3++;
                    }
                }
                return c0829tc;
            case 1:
                AbstractC0295Gu.m625r(-46793668687925L);
                C2428qs c2428qs = ((C1494hG) obj).f5263a;
                Object result = ((XC_MethodHook.MethodHookParam) c2428qs.f8523d).getResult();
                AbstractC0295Gu.m625r(-46845208295477L);
                c2428qs.m4864C(Integer.valueOf(((Integer) result).intValue() + 1));
                return c0829tc;
            case 2:
                AbstractC0295Gu.m625r(-45402099284021L);
                C2428qs c2428qs2 = ((C1494hG) obj).f5263a;
                Object[] objArr = (Object[]) c2428qs2.f8522c;
                Object obj5 = objArr[0];
                AbstractC0295Gu.m625r(-45449343924277L);
                int iIntValue = ((Integer) obj5).intValue();
                Object obj6 = c2428qs2.f8521b;
                AbstractC0295Gu.m625r(-45105746540597L);
                BaseAdapter baseAdapter = (BaseAdapter) obj6;
                if (iIntValue == baseAdapter.getCount() - 1) {
                    objArr[0] = Integer.valueOf(iIntValue - 1);
                    Object objInvokeOriginalMethod = XposedBridge.invokeOriginalMethod((Member) c2428qs2.f8520a, baseAdapter, objArr);
                    AbstractC0295Gu.m625r(-45930380261429L);
                    ViewGroup viewGroup = (ViewGroup) objInvokeOriginalMethod;
                    c2428qs2.m4864C(viewGroup);
                    Context context = viewGroup.getContext();
                    AbstractC0295Gu.m625r(-45638322485301L);
                    viewGroup.setOnClickListener(new ViewOnClickListenerC0094C7((Activity) context, 3));
                    TextView textView = (TextView) viewGroup.findViewById(AbstractC0828TB.f2616h);
                    if (textView != null) {
                        if (iIntValue == baseAdapter.getCount() - 1) {
                            textView.setText(AbstractC0295Gu.m625r(-45887430588469L));
                        }
                        C2111jp.m4300c(viewGroup, iIntValue);
                    }
                }
                return c0829tc;
            case 3:
                AbstractC0295Gu.m625r(-44276817852469L);
                C2428qs c2428qs3 = ((C1494hG) obj).f5263a;
                Object obj7 = ((Object[]) c2428qs3.f8522c)[0];
                AbstractC0295Gu.m625r(-44324062492725L);
                int iIntValue2 = ((Integer) obj7).intValue();
                Object result2 = ((XC_MethodHook.MethodHookParam) c2428qs3.f8523d).getResult();
                AbstractC0295Gu.m625r(-44530220922933L);
                C2111jp.m4300c((ViewGroup) result2, iIntValue2);
                return c0829tc;
            case 4:
                C1494hG c1494hG = (C1494hG) obj;
                AbstractC0295Gu.m625r(-6536940222517L);
                if (C0979Wr.f3063b.m2024e()) {
                    Object[] objArr2 = (Object[]) c1494hG.f5263a.f8522c;
                    if (objArr2.length >= 4) {
                        int length2 = objArr2.length - 2;
                        while (true) {
                            if (-1 < length2) {
                                Object obj8 = objArr2[length2];
                                Object obj9 = objArr2[length2 + 1];
                                if ((obj8 instanceof Integer) && (obj9 instanceof Integer) && ((c2322og = EnumC0936Vr.f2923g) == null || !c2322og.isEmpty())) {
                                    c2322og.getClass();
                                    C2694x c2694x = new C2694x(0, c2322og);
                                    while (c2694x.hasNext()) {
                                        EnumC0936Vr enumC0936Vr = (EnumC0936Vr) c2694x.next();
                                        if (enumC0936Vr.f2924a != ((Number) obj8).intValue() || enumC0936Vr.f2925b != ((Number) obj9).intValue()) {
                                        }
                                    }
                                }
                                length2--;
                            } else {
                                length2 = -1;
                            }
                        }
                        if (length2 != -1) {
                            Object obj10 = objArr2[length2];
                            AbstractC0295Gu.m625r(-6592774797365L);
                            int iIntValue3 = ((Integer) obj10).intValue();
                            int i5 = length2 + 1;
                            Object obj11 = objArr2[i5];
                            AbstractC0295Gu.m625r(-6249177413685L);
                            int iIntValue4 = ((Integer) obj11).intValue();
                            C2322og c2322og2 = EnumC0936Vr.f2923g;
                            c2322og2.getClass();
                            C2694x c2694x2 = new C2694x(0, c2322og2);
                            while (true) {
                                if (c2694x2.hasNext()) {
                                    Object next = c2694x2.next();
                                    EnumC0936Vr enumC0936Vr2 = (EnumC0936Vr) next;
                                    if (enumC0936Vr2.f2924a == iIntValue3 && enumC0936Vr2.f2925b == iIntValue4) {
                                        obj2 = next;
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            EnumC0936Vr enumC0936Vr3 = (EnumC0936Vr) obj2;
                            if (enumC0936Vr3 == EnumC0936Vr.f2920d || enumC0936Vr3 == EnumC0936Vr.f2921e) {
                                EnumC0936Vr enumC0936Vr4 = EnumC0936Vr.f2919c;
                                objArr2[length2] = Integer.valueOf(enumC0936Vr4.f2924a);
                                objArr2[i5] = Integer.valueOf(enumC0936Vr4.f2925b);
                            }
                        }
                    }
                }
                return c0829tc;
            case 5:
                AbstractC0295Gu.m625r(-94845762795573L);
                C2428qs c2428qs4 = ((C1494hG) obj).f5263a;
                Object obj12 = c2428qs4.f8521b;
                AbstractC0295Gu.m625r(-94897302403125L);
                Activity activity = (Activity) obj12;
                Object obj13 = ((Object[]) c2428qs4.f8522c)[0];
                int intExtra = activity.getIntent().getIntExtra(AbstractC0295Gu.m625r(-94596654692405L), -1);
                if (intExtra != -1) {
                    C1337ds.f4821a.getClass();
                    switch (intExtra) {
                        case 1:
                            c2112jq = new C2112jq(activity);
                            break;
                        case 2:
                            c2112jq = new C2213m(activity);
                            break;
                        case 3:
                            C1495ha c1495ha = new C1495ha(0);
                            c1495ha.f5272i = C0452Kf.f1484a;
                            c2112jq = c1495ha;
                            break;
                        case 4:
                            c2112jq = new C1011Xg(activity);
                            break;
                        case 5:
                            c2112jq = new C2136kD();
                            break;
                        case 6:
                            AbstractC0295Gu.m625r(-477712032462901L);
                            ?? c2340oy = new C2340oy(activity);
                            c2340oy.setOrientation(1);
                            c2340oy.setClickable(true);
                            c2340oy.setBackgroundColor(c2340oy.getContext().getColor(R.color.colorBackground));
                            c2340oy.setPadding(AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(24));
                            ?? linearLayout = new LinearLayout(c2340oy.getContext());
                            linearLayout.setOrientation(1);
                            GradientDrawable gradientDrawable = new GradientDrawable();
                            linearLayout.setBackgroundColor(linearLayout.getContext().getColor(R.color.colorForeground));
                            gradientDrawable.setCornerRadius(AbstractC0295Gu.m616i(16));
                            linearLayout.setBackground(gradientDrawable);
                            linearLayout.setPadding(AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20));
                            TextView textView2 = new TextView(linearLayout.getContext());
                            textView2.setTextSize(16.0f);
                            textView2.setTextColor(textView2.getContext().getColor(R.color.textTitle));
                            textView2.setGravity(17);
                            textView2.setPadding(0, 0, 0, AbstractC0295Gu.m616i(16));
                            c2340oy.f8213b = textView2;
                            linearLayout.addView(textView2);
                            TextView textView3 = new TextView(linearLayout.getContext());
                            textView3.setTextSize(14.0f);
                            textView3.setTextColor(textView3.getContext().getColor(R.color.colorSuccess));
                            textView3.setGravity(17);
                            textView3.setPadding(0, 0, 0, AbstractC0295Gu.m616i(16));
                            c2340oy.f8214c = textView3;
                            linearLayout.addView(textView3);
                            TextView textView4 = new TextView(linearLayout.getContext());
                            textView4.setTextSize(16.0f);
                            textView4.setTextColor(-1);
                            textView4.setGravity(17);
                            textView4.setPadding(0, AbstractC0295Gu.m616i(10), 0, AbstractC0295Gu.m616i(10));
                            textView4.setOnClickListener(new ViewOnClickListenerC1477h(10, c2340oy));
                            GradientDrawable gradientDrawable2 = new GradientDrawable();
                            gradientDrawable2.setColor(-1499549);
                            gradientDrawable2.setCornerRadius(AbstractC0295Gu.m616i(45));
                            textView4.setBackground(gradientDrawable2);
                            c2340oy.f8212a = textView4;
                            linearLayout.addView(textView4);
                            c2340oy.addView(linearLayout);
                            ?? linearLayout2 = new LinearLayout(c2340oy.getContext());
                            linearLayout2.setOrientation(0);
                            GradientDrawable gradientDrawable3 = new GradientDrawable();
                            gradientDrawable3.setColor(linearLayout2.getContext().getColor(R.color.colorForeground));
                            gradientDrawable3.setCornerRadius(AbstractC0295Gu.m616i(16));
                            linearLayout2.setBackground(gradientDrawable3);
                            linearLayout2.setPadding(AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20));
                            linearLayout2.setOnClickListener(new ViewOnClickListenerC1477h(11, linearLayout2));
                            linearLayout2.setOnTouchListener(new ViewOnTouchListenerC2586ue(2, linearLayout2));
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                            layoutParams.topMargin = AbstractC0295Gu.m616i(16);
                            linearLayout2.setLayoutParams(layoutParams);
                            linearLayout2.setVisibility(8);
                            ImageView imageView = new ImageView(linearLayout2.getContext());
                            imageView.setImageResource(R.drawable.ic_settings);
                            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                            imageView.setColorFilter(imageView.getContext().getColor(R.color.textTitle));
                            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(24));
                            layoutParams2.gravity = 16;
                            linearLayout2.addView(imageView, layoutParams2);
                            TextView textView5 = new TextView(linearLayout2.getContext());
                            textView5.setText(AbstractC0295Gu.m625r(-477398499850293L));
                            textView5.setTextSize(16.0f);
                            textView5.setTextColor(textView5.getContext().getColor(R.color.textTitle));
                            Typeface typeface = Typeface.DEFAULT_BOLD;
                            textView5.setTypeface(typeface);
                            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
                            layoutParams3.setMarginStart(AbstractC0295Gu.m616i(12));
                            layoutParams3.gravity = 16;
                            textView5.setLayoutParams(layoutParams3);
                            linearLayout2.addView(textView5);
                            c2340oy.f8215d = linearLayout2;
                            c2340oy.addView(linearLayout2);
                            LinearLayout linearLayout3 = new LinearLayout(c2340oy.getContext());
                            linearLayout3.setOrientation(1);
                            GradientDrawable gradientDrawable4 = new GradientDrawable();
                            gradientDrawable4.setColor(linearLayout3.getContext().getColor(R.color.colorForeground));
                            gradientDrawable4.setCornerRadius(AbstractC0295Gu.m616i(16));
                            linearLayout3.setBackground(gradientDrawable4);
                            linearLayout3.setPadding(AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20));
                            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                            layoutParams4.topMargin = AbstractC0295Gu.m616i(16);
                            linearLayout3.setLayoutParams(layoutParams4);
                            TextView textView6 = new TextView(linearLayout3.getContext());
                            textView6.setText(AbstractC0295Gu.m625r(-478047039911989L));
                            textView6.setTextSize(16.0f);
                            textView6.setTextColor(textView6.getContext().getColor(R.color.textTitle));
                            textView6.setTypeface(typeface);
                            textView6.setPadding(0, 0, 0, AbstractC0295Gu.m616i(12));
                            linearLayout3.addView(textView6);
                            TextView textView7 = new TextView(linearLayout3.getContext());
                            textView7.setText(AbstractC0295Gu.m625r(-478068514748469L));
                            textView7.setTextSize(14.0f);
                            textView7.setTextColor(textView7.getContext().getColor(R.color.textSummary));
                            textView7.setPadding(AbstractC0295Gu.m616i(8), 0, 0, 0);
                            textView7.setLineSpacing(6.0f, 1.0f);
                            linearLayout3.addView(textView7);
                            c2340oy.addView(linearLayout3);
                            C1498hd c1498hd = AbstractC1499he.f5282a;
                            AbstractC0585Nj.m1128G(AbstractC0671Pj.m1343a(AbstractC1106Zp.f3500a), new C2297ny((C2340oy) c2340oy, (InterfaceC0190Eb) null, i3), 3);
                            c2112jq = c2340oy;
                            break;
                        case 7:
                            AbstractC0295Gu.m625r(-78980153604149L);
                            ?? c0670Pi = new C0670Pi(activity);
                            c0670Pi.setOrientation(1);
                            c0670Pi.setBackgroundColor(c0670Pi.getContext().getColor(R.color.colorBackground));
                            ScrollView scrollView = new ScrollView(c0670Pi.getContext());
                            scrollView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                            scrollView.setVerticalScrollBarEnabled(false);
                            scrollView.setOverScrollMode(2);
                            c0670Pi.addView(scrollView);
                            LinearLayout linearLayout4 = new LinearLayout(c0670Pi.getContext());
                            linearLayout4.setOrientation(1);
                            linearLayout4.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                            linearLayout4.setPadding(AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(24));
                            c0670Pi.f2137a = linearLayout4;
                            scrollView.addView(linearLayout4);
                            LinearLayout linearLayout5 = c0670Pi.f2137a;
                            if (linearLayout5 == null) {
                                AbstractC0295Gu.m625r(-79074642884661L);
                                linearLayout5 = null;
                            }
                            LinearLayout linearLayout6 = new LinearLayout(c0670Pi.getContext());
                            linearLayout6.setOrientation(0);
                            linearLayout6.setGravity(16);
                            linearLayout6.setPadding(0, 0, 0, AbstractC0295Gu.m616i(24));
                            TextView textView8 = new TextView(linearLayout6.getContext());
                            textView8.setText(AbstractC0295Gu.m625r(-79134772426805L));
                            textView8.setTextSize(24.0f);
                            textView8.setPadding(0, 0, AbstractC0295Gu.m616i(12), 0);
                            linearLayout6.addView(textView8);
                            TextView textView9 = new TextView(linearLayout6.getContext());
                            textView9.setText(AbstractC0295Gu.m625r(-79147657328693L));
                            textView9.setTextSize(22.0f);
                            textView9.setTextColor(textView9.getContext().getColor(R.color.textTitle));
                            textView9.setTypeface(Typeface.DEFAULT_BOLD);
                            linearLayout6.addView(textView9);
                            linearLayout5.addView(linearLayout6);
                            LinearLayout linearLayout7 = c0670Pi.f2137a;
                            if (linearLayout7 == null) {
                                AbstractC0295Gu.m625r(-78619376351285L);
                                linearLayout7 = null;
                            }
                            TextView textView10 = new TextView(c0670Pi.getContext());
                            textView10.setText(AbstractC0295Gu.m625r(-78679505893429L));
                            textView10.setTextSize(14.0f);
                            textView10.setTextColor(textView10.getContext().getColor(R.color.textSummary));
                            textView10.setPadding(0, 0, 0, AbstractC0295Gu.m616i(20));
                            linearLayout7.addView(textView10);
                            C1498hd c1498hd2 = AbstractC1499he.f5282a;
                            AbstractC0585Nj.m1128G(AbstractC0671Pj.m1343a(AbstractC1106Zp.f3500a), new C2170l(c0670Pi, null, 3), 3);
                            c2112jq = c0670Pi;
                            break;
                        case LuaJitConsts.LUA_TTHREAD /* 8 */:
                            c2112jq = new C1495ha(1);
                            break;
                        case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                            c2112jq = new C1495ha(1);
                            break;
                        default:
                            switch (intExtra) {
                                case 1002:
                                    c2112jq = new C0762Rp();
                                    break;
                                case 1003:
                                    c2112jq = new C0841Ti();
                                    break;
                                case 1004:
                                    c2112jq = new C1206b8();
                                    break;
                                case 1005:
                                    c2112jq = new C0956WA();
                                    break;
                                case 1006:
                                    c2112jq = new C0784SA();
                                    break;
                                case 1007:
                                    c2112jq = new C2288np();
                                    break;
                                case 1008:
                                    c2112jq = new C0701QC();
                                    break;
                                default:
                                    c2112jq = new C2112jq(activity);
                                    break;
                            }
                            break;
                    }
                    c2112jq.mo1339d(activity);
                    String strM625r = AbstractC0295Gu.m625r(-94656784234549L);
                    Object[] objArr3 = {c2112jq.getTitle()};
                    AbstractC0295Gu.m625r(-578325936338997L);
                    XposedHelpers.callMethod(activity, strM625r, Arrays.copyOf(objArr3, 1));
                    String strM625r2 = AbstractC0295Gu.m625r(-94704028874805L);
                    AbstractC0295Gu.m625r(-578325936338997L);
                    Object objCallMethod = XposedHelpers.callMethod(activity, strM625r2, Arrays.copyOf(new Object[0], 0));
                    AbstractC0295Gu.m625r(-94768453384245L);
                    ?? r2 = (ViewGroup) objCallMethod;
                    r2.setTag(c2112jq);
                    r2.addView(c2112jq.getContentView(), -1, -1);
                }
                return c0829tc;
            case 6:
                AbstractC0295Gu.m625r(-95575907235893L);
                Object obj14 = ((C1494hG) obj).f5263a.f8521b;
                AbstractC0295Gu.m625r(-95627446843445L);
                String strM625r3 = AbstractC0295Gu.m625r(-95326799132725L);
                AbstractC0295Gu.m625r(-578325936338997L);
                Object objCallMethod2 = XposedHelpers.callMethod((Activity) obj14, strM625r3, Arrays.copyOf(new Object[0], 0));
                AbstractC0295Gu.m625r(-93741956200501L);
                ViewGroup viewGroup2 = (ViewGroup) objCallMethod2;
                if (viewGroup2.getTag() instanceof InterfaceC0972Wk) {
                    Object tag = viewGroup2.getTag();
                    AbstractC0295Gu.m625r(-93999654238261L);
                    ((InterfaceC0972Wk) tag).mo1337b();
                }
                return c0829tc;
            case 7:
                AbstractC0295Gu.m625r(-94373316393013L);
                C2428qs c2428qs5 = ((C1494hG) obj).f5263a;
                Object obj15 = c2428qs5.f8521b;
                Object[] objArr4 = (Object[]) c2428qs5.f8522c;
                AbstractC0295Gu.m625r(-94424856000565L);
                Activity activity2 = (Activity) obj15;
                String strM625r4 = AbstractC0295Gu.m625r(-94124208289845L);
                AbstractC0295Gu.m625r(-578325936338997L);
                Object objCallMethod3 = XposedHelpers.callMethod(activity2, strM625r4, Arrays.copyOf(new Object[0], 0));
                AbstractC0295Gu.m625r(-94188632799285L);
                ViewGroup viewGroup3 = (ViewGroup) objCallMethod3;
                if (viewGroup3.getTag() instanceof InterfaceC0972Wk) {
                    Object tag2 = viewGroup3.getTag();
                    AbstractC0295Gu.m625r(-92797063395381L);
                    InterfaceC0972Wk interfaceC0972Wk = (InterfaceC0972Wk) tag2;
                    Object obj16 = objArr4[0];
                    AbstractC0295Gu.m625r(-92620969736245L);
                    int iIntValue5 = ((Integer) obj16).intValue();
                    Object obj17 = objArr4[1];
                    AbstractC0295Gu.m625r(-93376883980341L);
                    int iIntValue6 = ((Integer) obj17).intValue();
                    Object obj18 = objArr4[2];
                    interfaceC0972Wk.mo1338c(activity2, iIntValue5, iIntValue6, obj18 instanceof Intent ? (Intent) obj18 : null);
                }
                for (C1354e8 c1354e8 : C1337ds.f4822b) {
                    Object obj19 = objArr4[0];
                    AbstractC0295Gu.m625r(-93033286596661L);
                    Integer num = (Integer) obj19;
                    Object obj20 = objArr4[1];
                    AbstractC0295Gu.m625r(-91590177585205L);
                    Integer num2 = (Integer) obj20;
                    Object obj21 = objArr4[2];
                    Intent intent = obj21 instanceof Intent ? (Intent) obj21 : null;
                    switch (c1354e8.f4856a) {
                        case 0:
                            int iIntValue7 = num.intValue();
                            int iIntValue8 = num2.intValue();
                            AbstractC0295Gu.m625r(-257470404491317L);
                            if (iIntValue7 == 18754 && iIntValue8 == -1) {
                                C1442g8.f5046b.getClass();
                                if (intent != null && (data2 = intent.getData()) != null) {
                                    try {
                                        String strM625r5 = AbstractC0295Gu.m625r(-261249975711797L);
                                        Cursor cursorQuery = activity2.getContentResolver().query(data2, null, null, null, null);
                                        if (cursorQuery != null) {
                                            try {
                                                if (cursorQuery.moveToFirst() && (columnIndex2 = cursorQuery.getColumnIndex(AbstractC0295Gu.m625r(-261314400221237L))) >= 0) {
                                                    strM625r5 = cursorQuery.getString(columnIndex2);
                                                    AbstractC0295Gu.m625r(-261374529763381L);
                                                }
                                                cursorQuery.close();
                                            } finally {
                                            }
                                        }
                                        File file = new File(activity2.getFilesDir(), AbstractC0295Gu.m625r(-259789686831157L));
                                        if (!file.exists()) {
                                            file.mkdirs();
                                        }
                                        File file2 = new File(file, strM625r5);
                                        InputStream inputStreamOpenInputStream = activity2.getContentResolver().openInputStream(data2);
                                        if (inputStreamOpenInputStream != null) {
                                            try {
                                                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                                try {
                                                    AbstractC1293cr.m2555p(inputStreamOpenInputStream, fileOutputStream);
                                                    fileOutputStream.close();
                                                    inputStreamOpenInputStream.close();
                                                } catch (Throwable th) {
                                                }
                                            } finally {
                                            }
                                        }
                                        BitmapFactory.Options options = new BitmapFactory.Options();
                                        options.inJustDecodeBounds = true;
                                        BitmapFactory.decodeFile(file2.getAbsolutePath(), options);
                                        if (options.outWidth <= 0 || options.outHeight <= 0) {
                                            Toast.makeText(activity2, AbstractC0295Gu.m625r(-259854111340597L), 0).show();
                                            file2.delete();
                                        } else {
                                            SharedPreferences sharedPreferences = AbstractC0599Nx.f1939a;
                                            String strM625r6 = AbstractC0295Gu.m625r(-259875586177077L);
                                            String absolutePath = file2.getAbsolutePath();
                                            AbstractC0295Gu.m625r(-259974370424885L);
                                            AbstractC0599Nx.m1176e(strM625r6, absolutePath);
                                            C1442g8.m2761o();
                                            C1442g8.m2760n();
                                            Toast.makeText(activity2, AbstractC0295Gu.m625r(-259514808924213L) + strM625r5 + AbstractC0295Gu.m625r(-259557758597173L), 1).show();
                                        }
                                    } catch (Exception e) {
                                        Toast.makeText(activity2, AbstractC0213Ey.m405c(-259647952910389L, new StringBuilder(), e), 0).show();
                                    }
                                }
                            }
                            break;
                        default:
                            int iIntValue9 = num.intValue();
                            int iIntValue10 = num2.intValue();
                            AbstractC0295Gu.m625r(-6820408064053L);
                            if (C1145ak.f3636b.m2024e() && iIntValue9 == 20302 && iIntValue10 == -1 && intent != null && (data = intent.getData()) != null) {
                                try {
                                    String strM625r7 = AbstractC0295Gu.m625r(-27324581935157L);
                                    Cursor cursorQuery2 = activity2.getContentResolver().query(data, null, null, null, null);
                                    if (cursorQuery2 != null) {
                                        try {
                                            if (cursorQuery2.moveToFirst() && (columnIndex = cursorQuery2.getColumnIndex(AbstractC0295Gu.m625r(-27393301411893L))) >= 0) {
                                                strM625r7 = cursorQuery2.getString(columnIndex);
                                                AbstractC0295Gu.m625r(-27453430954037L);
                                            }
                                            cursorQuery2.close();
                                        } finally {
                                        }
                                    }
                                    if (AbstractC0085Bz.m132J(strM625r7, true, AbstractC0295Gu.m625r(-26968099649589L)) || AbstractC0085Bz.m132J(strM625r7, true, AbstractC0295Gu.m625r(-26989574486069L))) {
                                        File file3 = new File(activity2.getFilesDir(), AbstractC0295Gu.m625r(-27268747360309L));
                                        if (!file3.exists()) {
                                            file3.mkdirs();
                                        }
                                        File file4 = new File(file3, strM625r7);
                                        InputStream inputStreamOpenInputStream2 = activity2.getContentResolver().openInputStream(data);
                                        if (inputStreamOpenInputStream2 != null) {
                                            try {
                                                FileOutputStream fileOutputStream2 = new FileOutputStream(file4);
                                                try {
                                                    AbstractC1293cr.m2555p(inputStreamOpenInputStream2, fileOutputStream2);
                                                    fileOutputStream2.close();
                                                    inputStreamOpenInputStream2.close();
                                                } finally {
                                                    try {
                                                        throw th;
                                                    } finally {
                                                        AbstractC0585Nj.m1138f(fileOutputStream2, th);
                                                    }
                                                }
                                            } finally {
                                                try {
                                                    throw th;
                                                } finally {
                                                }
                                            }
                                        }
                                        if (Typeface.createFromFile(file4) == null) {
                                            Toast.makeText(activity2, AbstractC0295Gu.m625r(-27101243635765L), 0).show();
                                            file4.delete();
                                        } else {
                                            SharedPreferences sharedPreferences2 = AbstractC0599Nx.f1939a;
                                            String strM625r8 = AbstractC0295Gu.m625r(-27131308406837L);
                                            String absolutePath2 = file4.getAbsolutePath();
                                            AbstractC0295Gu.m625r(-7997229103157L);
                                            AbstractC0599Nx.m1176e(strM625r8, absolutePath2);
                                            Toast.makeText(activity2, AbstractC0295Gu.m625r(-8087423416373L) + strM625r7 + AbstractC0295Gu.m625r(-8121783154741L), 1).show();
                                        }
                                    } else {
                                        Toast.makeText(activity2, AbstractC0295Gu.m625r(-27011049322549L), 0).show();
                                    }
                                } catch (Exception e2) {
                                    Toast.makeText(activity2, AbstractC0213Ey.m405c(-8156142893109L, new StringBuilder(), e2), 0).show();
                                }
                            }
                            break;
                    }
                }
                return c0829tc;
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                AbstractC0295Gu.m625r(-91796336015413L);
                return Boolean.valueOf(((Class[]) obj).length == 0);
            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                AbstractC0295Gu.m625r(-91809220917301L);
                C2428qs c2428qs6 = ((C1494hG) obj).f5263a;
                Object obj22 = c2428qs6.f8521b;
                AbstractC0295Gu.m625r(-91315299678261L);
                if (((Activity) obj22).getIntent().getIntExtra(AbstractC0295Gu.m625r(-92114163595317L), -1) != -1) {
                    c2428qs6.m4864C(null);
                }
                return c0829tc;
            case 10:
                AbstractC0295Gu.m625r(-50229642524725L);
                ((C1494hG) obj).f5263a.m4864C(null);
                return c0829tc;
            case 11:
                C1494hG c1494hG2 = (C1494hG) obj;
                AbstractC0295Gu.m625r(-49091476191285L);
                Object obj23 = ((Object[]) c1494hG2.f5263a.f8522c)[0];
                AbstractC0295Gu.m625r(-49143015798837L);
                ViewGroup viewGroup4 = (ViewGroup) obj23;
                viewGroup4.post(new RunnableC2260n3(14, viewGroup4, c1494hG2));
                return c0829tc;
            case 12:
                AbstractC0295Gu.m625r(-49611167234101L);
                C2428qs c2428qs7 = ((C1494hG) obj).f5263a;
                Field[] fields = c2428qs7.f8521b.getClass().getFields();
                while (i3 < fields.length) {
                    int i6 = i3 + 1;
                    try {
                        Field field2 = fields[i3];
                        if (AbstractC0585Nj.m1134a(field2.getType(), View.class)) {
                            try {
                                Object obj24 = field2.get(c2428qs7.f8521b);
                                View view = obj24 instanceof View ? (View) obj24 : null;
                                if (view != null) {
                                    ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
                                    if (!(view instanceof ViewGroup) && (layoutParams5 instanceof RelativeLayout.LayoutParams) && ((RelativeLayout.LayoutParams) layoutParams5).width == -1 && ((RelativeLayout.LayoutParams) layoutParams5).height == -1) {
                                        ViewParent parent = view.getParent();
                                        AbstractC0295Gu.m625r(-49662706841653L);
                                        C1456gf.m2805o((ViewGroup) parent);
                                    }
                                }
                            } catch (IllegalAccessException unused) {
                            }
                        }
                        i3 = i6;
                    } catch (ArrayIndexOutOfBoundsException e3) {
                        throw new NoSuchElementException(e3.getMessage());
                    }
                }
                return c0829tc;
            case 13:
                return m1670c(obj);
            case 14:
                AbstractC0295Gu.m625r(-4453881083957L);
                C2428qs c2428qs8 = ((C1494hG) obj).f5263a;
                if (C2471rs.f8696b.m2024e()) {
                    Object obj25 = ((Object[]) c2428qs8.f8522c)[2];
                    AbstractC0295Gu.m625r(-4509715658805L);
                    if (AbstractC0585Nj.m1134a((String) obj25, AbstractC0295Gu.m625r(-5278514804789L))) {
                        Object obj26 = ((Object[]) c2428qs8.f8522c)[3];
                        AbstractC0295Gu.m625r(-5450313496629L);
                        Intent intent2 = (Intent) obj26;
                        intent2.addFlags(524288);
                        intent2.addFlags(134217728);
                    }
                }
                return c0829tc;
            case 15:
                return NetworkAPI.register$lambda$2$lambda$1((Map.Entry) obj);
            case 16:
                return m1671e(obj);
            case 17:
                return m1672f(obj);
            case 18:
                return m1673h(obj);
            case 19:
                return m1674i(obj);
            case LuaJitConsts.LUA_MINSTACK /* 20 */:
                return m1675j(obj);
            case 21:
                return m1676k(obj);
            case 22:
                return m1677l(obj);
            case 23:
                return m1678m(obj);
            case 24:
                return m1679n(obj);
            case 25:
                return m1680o(obj);
            case 26:
                return m1681p(obj);
            case 27:
                AbstractC1111Zu.f3507a.getClass();
                return Integer.valueOf(AbstractC1111Zu.f3508b.mo134a().nextInt(2147418112) + 65536);
            case 28:
                return m1682q(obj);
            default:
                AbstractC0295Gu.m625r(-519171351771189L);
                Object obj27 = ((C1494hG) obj).f5263a.f8521b;
                AbstractC0295Gu.m625r(-519222891378741L);
                Activity activity3 = (Activity) obj27;
                View decorView = activity3.getWindow().getDecorView();
                AbstractC0295Gu.m625r(-520021755295797L);
                ViewGroup viewGroup5 = (ViewGroup) decorView;
                viewGroup5.post(new RunnableC0137D7(viewGroup5, activity3, i2));
                return c0829tc;
        }
    }
}
