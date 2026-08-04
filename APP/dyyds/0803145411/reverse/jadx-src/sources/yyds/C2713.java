package yyds;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000ss.android.ugc.aweme.yyds.R;
import com.p000ss.android.ugc.awemes.MainApp;
import com.p000ss.android.ugc.awemes.ModuleMain;
import com.ss.android.ugc.aweme.comment.model.Comment;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᲈᛷᲈᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2713 implements InterfaceC1549 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f13334;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ Object f13335;

    public /* synthetic */ C2713(C2255 c2255, C1698 c1698) {
        this.f13334 = 10;
        this.f13335 = c2255;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0136  */
    @Override // yyds.InterfaceC1549
    /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo371(Object obj) throws Exception {
        ViewGroup viewGroupM2902;
        ViewGroup viewGroupM29022;
        Object objM1375;
        String strM4341;
        int i = this.f13334;
        Object obj2 = this.f13335;
        switch (i) {
            case 0:
                return obj == ((AbstractC0280) obj2) ? "(this Collection)" : String.valueOf(obj);
            case 1:
                InterfaceC1549 interfaceC1549 = (InterfaceC1549) obj2;
                AbstractC2328.m4341(-158793103737710L);
                C2089 c2089 = (C2089) AbstractC1595.m3281((List) obj);
                if (c2089 != null) {
                    interfaceC1549.mo371(c2089);
                }
                return C2746.f13459;
            case 2:
                ImageView imageView = (ImageView) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        bitmap.compress(Bitmap.CompressFormat.JPEG, 85, byteArrayOutputStream);
                        String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                        C1509.f7142.getClass();
                        AbstractC2328.m4341(-26636960039790L);
                        C1509.f7201.m1581(C1509.f7179[72], strEncodeToString);
                        C0644.m1546(imageView);
                        C1435.m2931(C1435.f6790);
                    } catch (Exception e) {
                        C2336.f11496.m4358(AbstractC2328.m4341(-169835464655726L), e);
                        AbstractC1960.m3789(AbstractC2328.m4341(-169869824394094L));
                    }
                    break;
                }
                return C2746.f13459;
            case 3:
                Comment comment = (Comment) obj;
                AbstractC2328.m4341(-795320141906798L);
                C1332 c1332 = C1332.f6157;
                return Boolean.valueOf(C1332.m2735(comment, (C2219) obj2));
            case 4:
                C2014 c2014 = (C2014) obj2;
                C2746 c2746 = C2746.f13459;
                AbstractC2328.m4341(-1032879078015854L);
                C0351 c0351 = C0351.f1823;
                Object obj3 = ((C0488) obj).f2405;
                String strM43412 = AbstractC2328.m4341(-1032930617623406L);
                c0351.getClass();
                View view = (View) AbstractC0145.m671(obj3, strM43412);
                if (view != null && (viewGroupM2902 = AbstractC1426.m2902(view)) != null && (viewGroupM29022 = AbstractC1426.m2902(viewGroupM2902)) != null) {
                    String strM43413 = AbstractC2328.m4341(-1033007927034734L);
                    AbstractC2328.m4341(-762772879737710L);
                    AbstractC2328.m4341(-762802944508782L);
                    Context context = viewGroupM29022.getContext();
                    AbstractC2328.m4341(-762824419345262L);
                    String strM43414 = AbstractC2328.m4341(-762759994835822L);
                    AbstractC2328.m4341(-762699865293678L);
                    AbstractC2328.m4341(-762721340130158L);
                    AbstractC2328.m4341(-762742814966638L);
                    int identifier = context.getResources().getIdentifier(strM43413, strM43414, context.getPackageName());
                    View viewFindViewById = identifier == 0 ? null : viewGroupM29022.findViewById(identifier);
                    ViewGroup viewGroup = viewFindViewById instanceof ViewGroup ? (ViewGroup) viewFindViewById : null;
                    if (viewGroup != null) {
                        View viewM3193 = AbstractC1544.m3193(viewGroup, new C2460(11));
                        ViewGroup viewGroup2 = viewM3193 instanceof ViewGroup ? (ViewGroup) viewM3193 : null;
                        if (viewGroup2 != null && obj3 != null) {
                            int i2 = AbstractC2293.f11258;
                            C1189 c1189M3892 = AbstractC0476.m1327(obj3).m3892();
                            ((C0903) c2014.f10074).f4118 = 2;
                            c1189M3892.f5455 = AbstractC2328.m4341(-1033068056576878L);
                            C0536 c0536 = (C0536) AbstractC1595.m3281(c1189M3892.mo736());
                            if (c0536 != null && (objM1375 = c0536.m1375(new Object[0])) != null) {
                                Context context2 = viewGroup2.getContext();
                                C2701.f13261.getClass();
                                C2701.m4807(context2);
                                View viewInflate = AbstractC1115.m2309(context2).inflate(R.layout.user_chat_profile_layout, viewGroup2, false);
                                viewGroup2.addView(viewInflate);
                                int i3 = R.id.keep_fire_days;
                                TextView textView = (TextView) AbstractC1741.m3479(viewInflate, R.id.keep_fire_days);
                                if (textView != null) {
                                    i3 = R.id.keep_fire_details;
                                    LinearLayout linearLayout = (LinearLayout) AbstractC1741.m3479(viewInflate, R.id.keep_fire_details);
                                    if (linearLayout != null) {
                                        i3 = R.id.keep_fire_icon;
                                        ImageView imageView2 = (ImageView) AbstractC1741.m3479(viewInflate, R.id.keep_fire_icon);
                                        if (imageView2 != null) {
                                            i3 = R.id.keep_fire_last_time;
                                            TextView textView2 = (TextView) AbstractC1741.m3479(viewInflate, R.id.keep_fire_last_time);
                                            if (textView2 != null) {
                                                i3 = R.id.keep_fire_layout;
                                                LinearLayout linearLayout2 = (LinearLayout) AbstractC1741.m3479(viewInflate, R.id.keep_fire_layout);
                                                if (linearLayout2 != null) {
                                                    i3 = R.id.keep_fire_status;
                                                    TextView textView3 = (TextView) AbstractC1741.m3479(viewInflate, R.id.keep_fire_status);
                                                    if (textView3 != null) {
                                                        i3 = R.id.uid;
                                                        TextView textView4 = (TextView) AbstractC1741.m3479(viewInflate, R.id.uid);
                                                        if (textView4 != null) {
                                                            C2803 c2803 = new C2803((LinearLayout) viewInflate, textView, linearLayout, imageView2, textView2, linearLayout2, textView3, textView4);
                                                            AbstractC2328.m4341(-1033278509974382L);
                                                            textView4.setText(C2701.m4799(objM1375, AbstractC2328.m4341(-1033334344549230L)));
                                                            C1776 c1776 = C1776.f8917;
                                                            AbstractC2328.m4341(-624964559078254L);
                                                            AbstractC2328.m4341(-624998918816622L);
                                                            AbstractC2328.m4341(-625020393653102L);
                                                            String strM4799 = C2701.m4799(objM1375, AbstractC2328.m4341(-625054753391470L));
                                                            if (strM4799 == null) {
                                                                strM4799 = AbstractC2328.m4341(-625071933260654L);
                                                            }
                                                            String str = strM4799;
                                                            String strM47992 = C2701.m4799(objM1375, AbstractC2328.m4341(-625076228227950L));
                                                            if (strM47992 == null) {
                                                                strM47992 = AbstractC2328.m4341(-625114882933614L);
                                                            }
                                                            String str2 = strM47992;
                                                            Object objM4794 = C2701.m4794(objM1375, AbstractC2328.m4341(-625127767835502L));
                                                            List list = objM4794 != null ? (List) C2701.m4794(objM4794, AbstractC2328.m4341(-625183602410350L)) : null;
                                                            if (list == null || (strM4341 = (String) AbstractC1595.m3281(list)) == null) {
                                                                strM4341 = AbstractC2328.m4341(-625217962148718L);
                                                            }
                                                            C1776.m3532(c2803, context2, str);
                                                            linearLayout2.setOnClickListener(new ViewOnClickListenerC0365(context2, strM4341, str2, str, c2803, 3));
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                C0188.m789(AbstractC2328.m4341(-1739564406965102L).concat(viewInflate.getResources().getResourceName(i3)));
                                return null;
                            }
                        }
                    }
                }
                return c2746;
            case 5:
                AbstractC2328.m4341(-156748699304814L);
                C0135.m600((EnumMap) obj2, (EnumC0868) obj);
                return C2746.f13459;
            case 6:
                AbstractC2328.m4341(-718590551163758L);
                return Boolean.valueOf(AbstractC1544.m3188(((C1981) obj).m3819(), ((C1981) obj2).m3819()));
            case 7:
                C1416 c1416 = MainApp.f486;
                AbstractC2328.m4341(-1297449063449454L);
                return ((MainApp) obj2).m1e((byte[]) obj);
            case 8:
                return ((C2653) obj2).m4751(((Integer) obj).intValue());
            case 9:
                int i4 = ModuleMain.f488;
                AbstractC2328.m4341(-1143100823733102L);
                return ((ModuleMain) obj2).mo2e((byte[]) obj);
            case 10:
                ((C2255) obj2).mo2251(null);
                return C2746.f13459;
            case 11:
                C1664 c1664 = (C1664) obj2;
                C1829 c1829 = (C1829) obj;
                C2746 c27462 = C2746.f13459;
                AbstractC2328.m4341(-849316470752110L);
                Object objM3281 = AbstractC1595.m3281(c1829.f9185);
                MotionEvent motionEvent = objM3281 instanceof MotionEvent ? (MotionEvent) objM3281 : null;
                if (motionEvent != null && c1829.f9184 == C1664.f8512.get() && motionEvent.getActionMasked() == 0 && C1664.f8487) {
                    C0302 c0302 = (C0302) C1664.f8484.get();
                    if (c0302 == null) {
                        C1664.m3387(c1664, null, 2);
                    } else {
                        if (!c0302.isShown() || !c0302.isAttachedToWindow()) {
                            c0302 = null;
                        }
                        if (c0302 != null) {
                            int[] iArr = new int[2];
                            c0302.getLocationOnScreen(iArr);
                            float rawX = motionEvent.getRawX();
                            float rawY = motionEvent.getRawY();
                            if (rawX >= iArr[0] && rawX < c0302.getWidth() + r5) {
                                if (rawY < iArr[1] || rawY >= c0302.getHeight() + r3) {
                                }
                            }
                        }
                    }
                }
                return c27462;
            case 12:
                Method method = (Method) obj;
                Method[] methods = ((ViewParent) obj2).getClass().getMethods();
                AbstractC2328.m4341(-849552693953390L);
                boolean z = false;
                Method method2 = null;
                for (Method method3 : methods) {
                    if (AbstractC1544.m3188(method3.getName(), method.getName()) && AbstractC1544.m3188(method3.getReturnType(), method.getReturnType()) && Arrays.equals(method3.getParameterTypes(), method.getParameterTypes())) {
                        if (z) {
                            return null;
                        }
                        z = true;
                        method2 = method3;
                    }
                }
                if (z) {
                    return method2;
                }
                return null;
            case 13:
                ((C1491) obj2).f7036 = (C0574) obj;
                return C2746.f13459;
            case 14:
                ((C1223) obj2).mo731();
                return C2746.f13459;
            default:
                List list2 = (List) obj2;
                InterfaceC0124 interfaceC0124 = (InterfaceC0124) obj;
                AbstractC2328.m4341(-1403783863763822L);
                if (list2 != null) {
                    InterfaceC1212 interfaceC1212Mo575 = interfaceC0124.mo575(AbstractC2328.m4341(-20495156806510L));
                    try {
                        for (Object obj4 : list2) {
                            if (obj4 != null) {
                                C1586.m3255(interfaceC1212Mo575, obj4);
                                interfaceC1212Mo575.mo433();
                                interfaceC1212Mo575.reset();
                            }
                            break;
                        }
                        AbstractC0797.m1819(interfaceC1212Mo575, null);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            AbstractC0797.m1819(interfaceC1212Mo575, th);
                            throw th2;
                        }
                    }
                }
                return C2746.f13459;
        }
    }

    public /* synthetic */ C2713(int i, Object obj) {
        this.f13334 = i;
        this.f13335 = obj;
    }

    public /* synthetic */ C2713(C0380 c0380, List list) {
        this.f13334 = 15;
        this.f13335 = list;
    }
}
