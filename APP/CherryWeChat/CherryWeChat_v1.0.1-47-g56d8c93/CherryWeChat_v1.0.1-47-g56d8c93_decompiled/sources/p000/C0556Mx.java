package p000;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AndroidAppHelper;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.gyf.immersionbar.RunnableC1286a;
import io.github.cherrywechat.application.MainApplication;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: Mx */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0556Mx implements InterfaceC1416fj {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1824a;

    public /* synthetic */ C0556Mx(int i) {
        this.f1824a = i;
    }

    @Override // p000.InterfaceC1416fj
    /* JADX INFO: renamed from: g */
    public final Object mo90g(Object obj) {
        int i = this.f1824a;
        char c = 1;
        z = true;
        boolean z = true;
        C0829TC c0829tc = C0829TC.f2620a;
        switch (i) {
            case 0:
                Class[] clsArr = (Class[]) obj;
                AbstractC0295Gu.m625r(-519729697519669L);
                break;
            case 1:
                AbstractC0295Gu.m625r(-519755467323445L);
                Object obj2 = ((Object[]) ((C1494hG) obj).f5263a.f8522c)[0];
                C2648vx c2648vx = new C2648vx();
                if (obj2 instanceof Class) {
                    c2648vx.f9163b = (Class) obj2;
                } else {
                    c2648vx.f9164c = obj2;
                    c2648vx.f9163b = obj2 != null ? obj2.getClass() : null;
                }
                C1456gf.m2806q((ViewGroup) AbstractC0213Ey.m404b(-500565553444917L, c2648vx));
                break;
            case 2:
                AbstractC0295Gu.m625r(-91044716738613L);
                Object obj3 = ((C1494hG) obj).f5263a.f8521b;
                AbstractC0295Gu.m625r(-91096256346165L);
                ListView listView = (ListView) ((Activity) obj3).findViewById(R.id.list);
                Context context = listView.getContext();
                AbstractC0295Gu.m625r(-90795608635445L);
                listView.addHeaderView(AbstractC0585Nj.m1141i(context));
                break;
            case 3:
                AbstractC0295Gu.m625r(-90864328112181L);
                Object[] objArr = (Object[]) ((C1494hG) obj).f5263a.f8522c;
                Object obj4 = objArr[0];
                Object obj5 = objArr[1];
                AbstractC0295Gu.m625r(-90915867719733L);
                Integer num = (Integer) obj5;
                num.getClass();
                C1538iG c1538iG = new C1538iG(obj4);
                c1538iG.m2924i(View.class);
                c1538iG.m2922g(Integer.TYPE);
                ViewGroup viewGroup = (ViewGroup) c1538iG.m2918c(obj4, num);
                C0183EA.f539a.getClass();
                if (!C0183EA.m373a().equals(AbstractC0295Gu.m625r(-89472758708277L))) {
                    C1456gf.m2805o(viewGroup);
                }
                if (viewGroup.findViewById(R.id.title) == null) {
                    View viewM618k = AbstractC0295Gu.m618k(viewGroup, 0);
                    Context context2 = viewGroup.getContext();
                    AbstractC0295Gu.m625r(-89481348642869L);
                    View viewM1141i = AbstractC0585Nj.m1141i(context2);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams.addRule(3, viewM618k.getId());
                    viewGroup.addView(viewM1141i, layoutParams);
                }
                break;
            case 4:
                C1494hG c1494hG = (C1494hG) obj;
                AbstractC0295Gu.m625r(-17188459116597L);
                if (C1343dy.f4836b.m2024e()) {
                    c1494hG.f5263a.m4864C(Boolean.TRUE);
                }
                break;
            case 5:
                AbstractC0295Gu.m625r(-468804270290997L);
                Object obj6 = ((C1494hG) obj).f5263a.f8521b;
                AbstractC0295Gu.m625r(-468860104865845L);
                Activity activity = (Activity) obj6;
                FrameLayout frameLayout = (FrameLayout) activity.findViewById(R.id.content);
                HashMap map = AbstractC0999XA.f3193a;
                Drawable drawableM2890b = C1517hw.m2890b(AbstractC0295Gu.m625r(-468559457155125L));
                if (drawableM2890b != null) {
                    ImageView imageView = new ImageView(frameLayout.getContext());
                    imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    imageView.setImageDrawable(drawableM2890b);
                    imageView.setElevation(1.0f);
                    frameLayout.addView(imageView, -1, -1);
                    RunnableC1286a.m2511i(activity).m2514d();
                    if (Build.VERSION.SDK_INT < 30) {
                        activity.getWindow().setFlags(67108864, 67108864);
                        activity.getWindow().setFlags(134217728, 134217728);
                    } else {
                        WindowInsetsController insetsController = activity.getWindow().getInsetsController();
                        if (insetsController != null) {
                            insetsController.hide(WindowInsets.Type.statusBars());
                            insetsController.hide(WindowInsets.Type.navigationBars());
                        }
                    }
                }
                break;
            case 6:
                AbstractC0295Gu.m625r(-468658241402933L);
                break;
            case 7:
                int iIntValue = ((Integer) obj).intValue();
                break;
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                C1494hG c1494hG2 = (C1494hG) obj;
                AbstractC0295Gu.m625r(-469233767020597L);
                c1494hG2.f5263a.m4864C(null);
                AbstractC1208bA.m2329b(new RunnableC0562N2(25, c1494hG2), 1000L);
                break;
            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                AbstractC0295Gu.m625r(-168482977085493L);
                C2428qs c2428qs = ((C1494hG) obj).f5263a;
                Object obj7 = c2428qs.f8521b;
                AbstractC0295Gu.m625r(-169088567474229L);
                TextView textView = (TextView) obj7;
                if (textView != null ? TextView.class.equals(textView.getTag(io.github.cherrywechat.R.id.tag_textview_color_ban)) : false) {
                    c2428qs.m4864C(null);
                }
                break;
            case 10:
                AbstractC0295Gu.m625r(-168800804665397L);
                C2428qs c2428qs2 = ((C1494hG) obj).f5263a;
                Object obj8 = c2428qs2.f8521b;
                AbstractC0295Gu.m625r(-168856639240245L);
                TextView textView2 = (TextView) obj8;
                if (textView2 != null ? TextView.class.equals(textView2.getTag(io.github.cherrywechat.R.id.tag_textview_color_ban)) : false) {
                    c2428qs2.m4864C(null);
                }
                break;
            case 11:
                Class[] clsArr2 = (Class[]) obj;
                break;
            case 12:
                AbstractC0295Gu.m625r(-464998929266741L);
                break;
            case 13:
                AbstractC0295Gu.m625r(-465011814168629L);
                String lowerCase = ((C0185EC) obj).f551c.toLowerCase(Locale.ROOT);
                AbstractC0295Gu.m625r(-465024699070517L);
                break;
            case 14:
                AbstractC0295Gu.m625r(-464547957700661L);
                String str = ((C0185EC) obj).f549a;
                if (!AbstractC0585Nj.m1134a(str, AbstractC0295Gu.m625r(-464560842602549L)) && !AbstractC0585Nj.m1134a(str, AbstractC0295Gu.m625r(-464620972144693L))) {
                    z = false;
                }
                break;
            case 15:
                C1494hG c1494hG3 = (C1494hG) obj;
                AbstractC0295Gu.m625r(-14946486188085L);
                if (C1133aF.f3583b.m2024e()) {
                    try {
                        SharedPreferences sharedPreferences = AbstractC0599Nx.f1939a;
                        int i2 = Integer.parseInt(AbstractC0599Nx.m1173b(AbstractC0295Gu.m625r(-15002320762933L), AbstractC0295Gu.m625r(-15092515076149L)));
                        if (i2 > 0 && i2 <= 60) {
                            Object[] objArr2 = (Object[]) c1494hG3.f5263a.f8522c;
                            if (objArr2.length == 1 || objArr2.length != 2 || !(objArr2[0] instanceof String)) {
                                c = 0;
                            }
                            Object obj9 = objArr2[c];
                            C2648vx c2648vx2 = new C2648vx();
                            if (obj9 instanceof Class) {
                                c2648vx2.f9163b = (Class) obj9;
                            } else {
                                c2648vx2.f9164c = obj9;
                                c2648vx2.f9163b = obj9 != null ? obj9.getClass() : null;
                            }
                            C1214bG c1214bG = (C1214bG) AbstractC1257cG.f4258a.get(AbstractC0295Gu.m625r(-584257286174773L));
                            Object obj10 = c1214bG != null ? c1214bG.f4146a : null;
                            c2648vx2.m5180c(obj10 instanceof String ? (String) obj10 : null);
                            c2648vx2.m5181d(Integer.valueOf(i2 * 1000));
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                break;
            case 16:
                AbstractC0295Gu.m625r(-468168615131189L);
                C2428qs c2428qs3 = ((C1494hG) obj).f5263a;
                Object obj11 = c2428qs3.f8521b;
                AbstractC0295Gu.m625r(-468220154738741L);
                ImageView imageView2 = (ImageView) obj11;
                AttributeSet attributeSet = (AttributeSet) ((Object[]) c2428qs3.f8522c)[1];
                if (attributeSet != null) {
                    Context context3 = imageView2.getContext();
                    AbstractC0295Gu.m625r(-467936686897205L);
                    TypedArray typedArrayObtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, new int[]{R.attr.src}, 0, 0);
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        Context contextCurrentApplication = MainApplication.f5549a;
                        if (contextCurrentApplication == null && (contextCurrentApplication = C1456gf.f5172p) == null) {
                            contextCurrentApplication = AndroidAppHelper.currentApplication();
                            AbstractC0295Gu.m625r(-836852902787125L);
                        }
                        Resources resources = contextCurrentApplication.getResources();
                        AbstractC0295Gu.m625r(-836955982002229L);
                        String resourceName = resources.getResourceName(resourceId);
                        AbstractC0295Gu.m625r(-468005406373941L);
                        String strM5069d0 = AbstractC2564tz.m5069d0(resourceName, AbstractC0295Gu.m625r(-468095600687157L));
                        imageView2.setTag(io.github.cherrywechat.R.id.tag_we_img_name, strM5069d0);
                        Iterator it = C1213bF.f4145b.iterator();
                        while (it.hasNext()) {
                            ((Function2) it.next()).mo446d(imageView2, strM5069d0);
                        }
                    }
                    typedArrayObtainStyledAttributes.recycle();
                }
                break;
            case 17:
                AbstractC0295Gu.m625r(-468104190621749L);
                C2428qs c2428qs4 = ((C1494hG) obj).f5263a;
                Object obj12 = c2428qs4.f8521b;
                AbstractC0295Gu.m625r(-466506462787637L);
                ImageView imageView3 = (ImageView) obj12;
                Object obj13 = ((Object[]) c2428qs4.f8522c)[0];
                AbstractC0295Gu.m625r(-466222994946101L);
                int iIntValue2 = ((Integer) obj13).intValue();
                if (iIntValue2 != 0) {
                    Context contextCurrentApplication2 = MainApplication.f5549a;
                    if (contextCurrentApplication2 == null && (contextCurrentApplication2 = C1456gf.f5172p) == null) {
                        contextCurrentApplication2 = AndroidAppHelper.currentApplication();
                        AbstractC0295Gu.m625r(-836852902787125L);
                    }
                    Resources resources2 = contextCurrentApplication2.getResources();
                    AbstractC0295Gu.m625r(-836955982002229L);
                    String resourceName2 = resources2.getResourceName(iIntValue2);
                    AbstractC0295Gu.m625r(-466429153376309L);
                    String strM5069d02 = AbstractC2564tz.m5069d0(resourceName2, AbstractC0295Gu.m625r(-467069103503413L));
                    imageView3.setTag(io.github.cherrywechat.R.id.tag_we_img_name, strM5069d02);
                    Iterator it2 = C1213bF.f4145b.iterator();
                    while (it2.hasNext()) {
                        ((Function2) it2.next()).mo446d(imageView3, strM5069d02);
                    }
                }
                break;
            case 18:
                AbstractC0295Gu.m625r(-467077693438005L);
                C2428qs c2428qs5 = ((C1494hG) obj).f5263a;
                Object obj14 = c2428qs5.f8521b;
                AbstractC0295Gu.m625r(-467129233045557L);
                ImageView imageView4 = (ImageView) obj14;
                AttributeSet attributeSet2 = (AttributeSet) ((Object[]) c2428qs5.f8522c)[1];
                if (attributeSet2 != null) {
                    Context context4 = imageView4.getContext();
                    AbstractC0295Gu.m625r(-466845765204021L);
                    TypedArray typedArrayObtainStyledAttributes2 = context4.obtainStyledAttributes(attributeSet2, new int[]{R.attr.src}, 0, 0);
                    int resourceId2 = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                    if (resourceId2 != 0) {
                        Context contextCurrentApplication3 = MainApplication.f5549a;
                        if (contextCurrentApplication3 == null && (contextCurrentApplication3 = C1456gf.f5172p) == null) {
                            contextCurrentApplication3 = AndroidAppHelper.currentApplication();
                            AbstractC0295Gu.m625r(-836852902787125L);
                        }
                        Resources resources3 = contextCurrentApplication3.getResources();
                        AbstractC0295Gu.m625r(-836955982002229L);
                        String resourceName3 = resources3.getResourceName(resourceId2);
                        AbstractC0295Gu.m625r(-466914484680757L);
                        String strM5069d03 = AbstractC2564tz.m5069d0(resourceName3, AbstractC0295Gu.m625r(-467004678993973L));
                        imageView4.setTag(io.github.cherrywechat.R.id.tag_we_img_name, strM5069d03);
                        Iterator it3 = C1213bF.f4145b.iterator();
                        while (it3.hasNext()) {
                            ((Function2) it3.next()).mo446d(imageView4, strM5069d03);
                        }
                    }
                    typedArrayObtainStyledAttributes2.recycle();
                }
                break;
            case 19:
                AbstractC0295Gu.m625r(-467013268928565L);
                C2428qs c2428qs6 = ((C1494hG) obj).f5263a;
                Object obj15 = c2428qs6.f8521b;
                AbstractC0295Gu.m625r(-518192099227701L);
                ImageView imageView5 = (ImageView) obj15;
                Object obj16 = ((Object[]) c2428qs6.f8522c)[0];
                AbstractC0295Gu.m625r(-517908631386165L);
                int iIntValue3 = ((Integer) obj16).intValue();
                if (iIntValue3 != 0) {
                    Context contextCurrentApplication4 = MainApplication.f5549a;
                    if (contextCurrentApplication4 == null && (contextCurrentApplication4 = C1456gf.f5172p) == null) {
                        contextCurrentApplication4 = AndroidAppHelper.currentApplication();
                        AbstractC0295Gu.m625r(-836852902787125L);
                    }
                    Resources resources4 = contextCurrentApplication4.getResources();
                    AbstractC0295Gu.m625r(-836955982002229L);
                    String resourceName4 = resources4.getResourceName(iIntValue3);
                    AbstractC0295Gu.m625r(-518114789816373L);
                    String strM5069d04 = AbstractC2564tz.m5069d0(resourceName4, AbstractC0295Gu.m625r(-518754739943477L));
                    imageView5.setTag(io.github.cherrywechat.R.id.tag_we_img_name, strM5069d04);
                    Iterator it4 = C1213bF.f4145b.iterator();
                    while (it4.hasNext()) {
                        ((Function2) it4.next()).mo446d(imageView5, strM5069d04);
                    }
                }
                break;
            case LuaJitConsts.LUA_MINSTACK /* 20 */:
                AbstractC0295Gu.m625r(-518428322428981L);
                Object obj17 = ((C1494hG) obj).f5263a.f8521b;
                AbstractC0295Gu.m625r(-518479862036533L);
                Activity activity2 = (Activity) obj17;
                if (AbstractC1257cG.f4259b != 115) {
                    AbstractC0295Gu.m625r(-596575252379701L);
                    try {
                        C0339Hv c0339Hv = new C0339Hv();
                        AlertDialog alertDialogCreate = new AlertDialog.Builder(activity2).setTitle(AbstractC0295Gu.m625r(-596609612118069L)).setMessage(AbstractC0295Gu.m625r(-596656856758325L)).setCancelable(false).setPositiveButton(AbstractC0295Gu.m625r(-596661151725621L), (DialogInterface.OnClickListener) null).create();
                        alertDialogCreate.show();
                        C1456gf.m2802T(alertDialogCreate, false);
                        alertDialogCreate.getButton(-1).setOnClickListener(new ViewOnClickListenerC1433g((TextView) alertDialogCreate.findViewById(R.id.message), c0339Hv, alertDialogCreate, activity2, 4));
                    } catch (Exception unused) {
                    }
                    break;
                } else {
                    Iterator it5 = AbstractC1257cG.f4258a.entrySet().iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            break;
                        } else if (((C1214bG) ((Map.Entry) it5.next()).getValue()).f4146a == null) {
                            if (AbstractC1257cG.m2376d().getBoolean(AbstractC0295Gu.m625r(-597004749109301L), true)) {
                                AlertDialog alertDialogCreate2 = new AlertDialog.Builder(activity2, R.style.Theme.Material.Light.Dialog.Alert).setTitle(AbstractC0295Gu.m625r(-517079702698037L)).setMessage(AbstractC0295Gu.m625r(-517092587599925L)).setPositiveButton(AbstractC0295Gu.m625r(-517195666815029L), new DialogInterfaceOnClickListenerC0804So(2)).create();
                                alertDialogCreate2.show();
                                C1456gf.m2802T(alertDialogCreate2, false);
                            }
                            break;
                        }
                    }
                }
                break;
            default:
                AbstractC0295Gu.m625r(-576930071967797L);
                ((C1494hG) obj).f5263a.m4864C(null);
                break;
        }
        return c0829tc;
        return c0829tc;
        return c0829tc;
    }
}
