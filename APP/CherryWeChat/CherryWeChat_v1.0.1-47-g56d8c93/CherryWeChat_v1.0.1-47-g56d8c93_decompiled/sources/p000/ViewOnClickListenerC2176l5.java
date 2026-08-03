package p000;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.text.Editable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC1166o;
import androidx.recyclerview.widget.RecyclerView;
import com.youth.banner.adapter.BannerAdapter;
import io.github.cherrywechat.lua.loader.ScriptManager;
import io.github.cherrywechat.network.model.FriendLinkItem;
import io.github.cherrywechat.network.model.ThemeStoreItem;
import java.util.List;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: l5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC2176l5 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7584a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f7585b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f7586c;

    public /* synthetic */ ViewOnClickListenerC2176l5(int i, Object obj, Object obj2) {
        this.f7584a = i;
        this.f7585b = obj;
        this.f7586c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0120  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        Editable text;
        Editable text2;
        Context context;
        long j;
        Editable text3;
        String[] strArr;
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator interpolator;
        ViewPropertyAnimator viewPropertyAnimatorWithEndAction;
        int i = this.f7584a;
        LinearLayout linearLayout = null;
        int i2 = 2;
        int i3 = 3;
        Object[] objArr = 0;
        Object obj = this.f7586c;
        Object obj2 = this.f7585b;
        switch (i) {
            case 0:
                ((BannerAdapter) obj2).lambda$onCreateViewHolder$1((AbstractC1166o) obj, view);
                return;
            case 1:
                List listM2325a = C1206b8.m2325a();
                SharedPreferences sharedPreferences = AbstractC0599Nx.f1939a;
                AbstractC0599Nx.m1175d(AbstractC2453ra.m4901k0(listM2325a, AbstractC0295Gu.m625r(-90138478639157L), null, null, null, 62));
                ((C1206b8) obj2).m2326e((Activity) obj);
                ViewOnClickListenerC0996X7 viewOnClickListenerC0996X7 = AbstractC0828TB.f2613e;
                if (viewOnClickListenerC0996X7 != null) {
                    viewOnClickListenerC0996X7.m1890c();
                    return;
                }
                return;
            case 2:
                ImageView imageView = (ImageView) obj;
                EditText editText = ((C1495ha) obj2).f5267d;
                if (editText != null && (text = editText.getText()) != null) {
                    text.clear();
                }
                imageView.setVisibility(8);
                return;
            case 3:
                C1258ca c1258ca = (C1258ca) obj2;
                C1215ba c1215ba = (C1215ba) obj;
                c1258ca.f4262b.put(Integer.valueOf(c1215ba.getAdapterPosition()), Boolean.valueOf(!(((Boolean) c1258ca.f4262b.get(Integer.valueOf(c1215ba.getAdapterPosition()))) != null ? r3.booleanValue() : false)));
                c1258ca.notifyItemChanged(c1215ba.getAdapterPosition());
                return;
            case 4:
                TextView textView = (TextView) obj2;
                Object systemService = textView.getContext().getSystemService(AbstractC0295Gu.m625r(-102306120988725L));
                AbstractC0295Gu.m625r(-102349070661685L);
                ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(AbstractC0295Gu.m625r(-103199474186293L), ((C0054BA) obj).f123d));
                AbstractC0213Ey.m413k(-103251013793845L, textView.getContext(), 0);
                return;
            case 5:
                EnumC0319Hb enumC0319Hb = (EnumC0319Hb) obj2;
                C0276Gb c0276Gb = (C0276Gb) obj;
                if (enumC0319Hb != c0276Gb.f898d) {
                    InterfaceC1416fj interfaceC1416fj = c0276Gb.f896b;
                    if (interfaceC1416fj != null) {
                        interfaceC1416fj.mo90g(enumC0319Hb);
                    }
                    c0276Gb.m558a(enumC0319Hb);
                    SharedPreferences sharedPreferences2 = AbstractC0599Nx.f1939a;
                    AbstractC0599Nx.m1176e(AbstractC0295Gu.m625r(-495664995760181L), enumC0319Hb.name());
                    return;
                }
                return;
            case 6:
                ScrollView scrollView = (ScrollView) obj2;
                TextView textView2 = (TextView) obj;
                i = scrollView.getVisibility() == 0 ? 0 : 1;
                scrollView.setVisibility(i != 0 ? 0 : 8);
                textView2.setText(AbstractC0295Gu.m625r(i != 0 ? -844364800587829L : -844412045228085L));
                return;
            case 7:
                ((C0625Og) obj2).m1215a(((C0140DA) obj).f364a);
                return;
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                TextView textView3 = (TextView) obj2;
                Object systemService2 = textView3.getContext().getSystemService(AbstractC0295Gu.m625r(-97427038140469L));
                AbstractC0295Gu.m625r(-97469987813429L);
                ((ClipboardManager) systemService2).setPrimaryClip(ClipData.newPlainText(AbstractC0295Gu.m625r(-78529182038069L), ((C0185EC) obj).f564p));
                AbstractC0213Ey.m413k(-78580721645621L, textView3.getContext(), 0);
                return;
            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                Context context2 = ((TextView) obj2).getContext();
                AbstractC0295Gu.m625r(-77932181583925L);
                C1456gf.m2803U(context2, ((FriendLinkItem) obj).getUrl());
                return;
            case 10:
                Context context3 = ((LinearLayout) obj2).getContext();
                AbstractC0295Gu.m625r(-78000901060661L);
                C1456gf.m2803U(context3, ((FriendLinkItem) obj).getUrl());
                return;
            case 11:
                C0841Ti c0841Ti = (C0841Ti) obj2;
                c0841Ti.f2679g = ((C0755Ri) obj).f2393b;
                c0841Ti.m1665f();
                c0841Ti.m1663a();
                return;
            case 12:
                ImageView imageView2 = (ImageView) obj;
                EditText editText2 = ((C1495ha) obj2).f5267d;
                if (editText2 != null && (text2 = editText2.getText()) != null) {
                    text2.clear();
                }
                imageView2.setVisibility(8);
                return;
            case 13:
                C0976Wo c0976Wo = (C0976Wo) obj2;
                C0097CA c0097ca = (C0097CA) obj;
                c0976Wo.getClass();
                C0183EA.f539a.getClass();
                String strM373a = C0183EA.m373a();
                String str = c0097ca.f223a;
                if (AbstractC0585Nj.m1134a(str, strM373a)) {
                    context = c0976Wo.getContext();
                    j = -83004537960501L;
                } else {
                    if (C0183EA.m379g(str)) {
                        Context context4 = c0976Wo.getContext();
                        AbstractC0295Gu.m625r(-82592221100085L);
                        String strM625r = AbstractC0295Gu.m625r(-82660940576821L);
                        StringBuilder sb = new StringBuilder();
                        sb.append(AbstractC0295Gu.m625r(-82673825478709L));
                        C1456gf.m2801S(context4, strM625r, AbstractC2374ph.m4815l(sb, c0097ca.f224b, (char) 65311), new DialogInterfaceOnClickListenerC0933Vo(i, c0976Wo, c0097ca), false);
                        return;
                    }
                    context = c0976Wo.getContext();
                    j = -82489141884981L;
                }
                AbstractC0213Ey.m413k(j, context, 0);
                return;
            case 14:
                Activity activity = (Activity) obj2;
                C0762Rp c0762Rp = (C0762Rp) obj;
                if (ScriptManager.INSTANCE.getLoadedScripts().isEmpty()) {
                    return;
                }
                new AlertDialog.Builder(activity).setTitle(AbstractC0295Gu.m625r(-482840223414325L)).setMessage(AbstractC0295Gu.m625r(-482861698250805L)).setPositiveButton(AbstractC0295Gu.m625r(-482913237858357L), new DialogInterfaceOnClickListenerC0505Lp(c0762Rp, i)).setNegativeButton(AbstractC0295Gu.m625r(-482926122760245L), (DialogInterface.OnClickListener) null).show();
                return;
            case 15:
                C0762Rp c0762Rp2 = (C0762Rp) obj2;
                TextView textView4 = (TextView) obj;
                boolean z = c0762Rp2.f2423o;
                c0762Rp2.f2423o = !z;
                textView4.setText(AbstractC0295Gu.m625r(!z ? -483201000667189L : -483209590601781L));
                LinearLayout linearLayout2 = c0762Rp2.f2421m;
                if (linearLayout2 == null) {
                    AbstractC0295Gu.m625r(-483218180536373L);
                } else {
                    linearLayout = linearLayout2;
                }
                linearLayout.setVisibility(c0762Rp2.f2423o ? 0 : 8);
                return;
            case 16:
                C2112jq c2112jq = (C2112jq) obj;
                int i4 = ((C1379eq) obj2).f4918a;
                if (i4 == 2) {
                    C1337ds c1337ds = C1337ds.f4821a;
                    Context context5 = c2112jq.getContext();
                    AbstractC0295Gu.m625r(-824023835473973L);
                    C1337ds.m2592d(c1337ds, context5, 1003);
                    return;
                }
                if (i4 == 4) {
                    C1337ds c1337ds2 = C1337ds.f4821a;
                    Context context6 = c2112jq.getContext();
                    AbstractC0295Gu.m625r(-825673102915637L);
                    C1337ds.m2592d(c1337ds2, context6, 7);
                    return;
                }
                if (i4 == 6) {
                    C1337ds c1337ds3 = C1337ds.f4821a;
                    Context context7 = c2112jq.getContext();
                    AbstractC0295Gu.m625r(-825192066578485L);
                    C1337ds.m2592d(c1337ds3, context7, c2112jq.getViewId());
                    return;
                }
                if (i4 == 8) {
                    C1337ds c1337ds4 = C1337ds.f4821a;
                    Context context8 = c2112jq.getContext();
                    AbstractC0295Gu.m625r(-825260786055221L);
                    C1337ds.m2592d(c1337ds4, context8, 1005);
                    return;
                }
                if (i4 != 10) {
                    return;
                }
                C1337ds c1337ds5 = C1337ds.f4821a;
                Context context9 = c2112jq.getContext();
                AbstractC0295Gu.m625r(-825329505531957L);
                C1337ds.m2592d(c1337ds5, context9, 1008);
                return;
            case 17:
                LinearLayout linearLayout3 = (LinearLayout) obj2;
                AbstractC0295Gu.m625r(-782302523160629L);
                ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.95f, 1.0f, 0.95f, 1, 0.5f, 1, 0.5f);
                scaleAnimation.setDuration(150L);
                scaleAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
                scaleAnimation.setAnimationListener(new AnimationAnimationListenerC1511hq(linearLayout3, (C2112jq) obj));
                linearLayout3.startAnimation(scaleAnimation);
                return;
            case 18:
                SharedPreferences sharedPreferences3 = AbstractC0599Nx.f1939a;
                AbstractC0599Nx.m1174c(AbstractC0295Gu.m625r(-826141254350901L), true);
                ((AlertDialog) obj2).dismiss();
                ((C1389f) obj).mo6a();
                return;
            case 19:
                ((C0784SA) obj2).m1606g((Activity) obj);
                return;
            case LuaJitConsts.LUA_MINSTACK /* 20 */:
                C1337ds c1337ds6 = C1337ds.f4821a;
                Context context10 = ((C0827TA) obj2).getContext();
                AbstractC0295Gu.m625r(-488226112403509L);
                String id = ((ThemeStoreItem) obj).getId();
                c1337ds6.getClass();
                C1337ds.m2591c(context10, 1006, id);
                return;
            case 21:
                ImageView imageView3 = (ImageView) obj;
                EditText editText3 = ((C0701QC) obj2).f2258e;
                if (editText3 != null && (text3 = editText3.getText()) != null) {
                    text3.clear();
                }
                imageView3.setVisibility(8);
                return;
            case 22:
                C0701QC c0701qc = (C0701QC) obj2;
                Activity activity2 = (Activity) obj;
                int iOrdinal = c0701qc.f2264k.ordinal();
                if (iOrdinal == 0) {
                    strArr = new String[]{AbstractC0295Gu.m625r(-484412181444661L), AbstractC0295Gu.m625r(-484425066346549L), AbstractC0295Gu.m625r(-484450836150325L)};
                } else {
                    if (iOrdinal != 1) {
                        throw new C0232Fa();
                    }
                    strArr = new String[]{AbstractC0295Gu.m625r(-484476605954101L), AbstractC0295Gu.m625r(-484489490855989L), AbstractC0295Gu.m625r(-484506670725173L), AbstractC0295Gu.m625r(-484519555627061L), AbstractC0295Gu.m625r(-484545325430837L)};
                }
                int iOrdinal2 = c0701qc.f2264k.ordinal();
                if (iOrdinal2 == 0) {
                    int iOrdinal3 = c0701qc.f2268o.ordinal();
                    if (iOrdinal3 != 0) {
                        if (iOrdinal3 != 1) {
                        }
                    }
                } else {
                    if (iOrdinal2 != 1) {
                        throw new C0232Fa();
                    }
                    int iOrdinal4 = c0701qc.f2268o.ordinal();
                    if (iOrdinal4 == 0) {
                        i2 = 3;
                    } else if (iOrdinal4 == 1) {
                        i2 = 4;
                    } else if (iOrdinal4 == 2) {
                        i2 = 0;
                    } else if (iOrdinal4 != 3) {
                        if (iOrdinal4 == 4) {
                            i2 = 1;
                        }
                    }
                }
                AlertDialog alertDialogCreate = new AlertDialog.Builder(activity2).setTitle(AbstractC0295Gu.m625r(-484571095234613L)).setSingleChoiceItems(strArr, i2, new DialogInterfaceOnClickListenerC0536Md(i3, c0701qc)).create();
                alertDialogCreate.show();
                C1456gf.m2802T(alertDialogCreate, false);
                return;
            case 23:
                final C0701QC c0701qc2 = (C0701QC) obj2;
                EnumC0142DC enumC0142DC = (EnumC0142DC) obj;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - c0701qc2.f2262i < 300 || c0701qc2.f2263j || c0701qc2.f2264k == enumC0142DC) {
                    return;
                }
                c0701qc2.f2262i = jCurrentTimeMillis;
                c0701qc2.f2263j = true;
                c0701qc2.f2264k = enumC0142DC;
                c0701qc2.m1436j();
                RecyclerView recyclerView = c0701qc2.f2259f;
                if (recyclerView != null) {
                    recyclerView.setAlpha(0.7f);
                }
                RecyclerView recyclerView2 = c0701qc2.f2259f;
                if (recyclerView2 == null || (viewPropertyAnimatorAnimate = recyclerView2.animate()) == null || (viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(1.0f)) == null || (duration = viewPropertyAnimatorAlpha.setDuration(200L)) == null || (interpolator = duration.setInterpolator(new AccelerateDecelerateInterpolator())) == null) {
                    return;
                }
                final Object[] objArr2 = objArr == true ? 1 : 0;
                ViewPropertyAnimator viewPropertyAnimatorWithStartAction = interpolator.withStartAction(new Runnable() { // from class: KC
                    @Override // java.lang.Runnable
                    public final void run() {
                        String strM625r2;
                        Editable text4;
                        switch (objArr2) {
                            case 0:
                                C0701QC c0701qc3 = c0701qc2;
                                c0701qc3.m1435i();
                                EditText editText4 = c0701qc3.f2258e;
                                if (editText4 == null || (text4 = editText4.getText()) == null || (strM625r2 = text4.toString()) == null) {
                                    strM625r2 = AbstractC0295Gu.m625r(-464994634299445L);
                                }
                                c0701qc3.m1431e(strM625r2);
                                break;
                            default:
                                c0701qc2.f2263j = false;
                                break;
                        }
                    }
                });
                if (viewPropertyAnimatorWithStartAction == null || (viewPropertyAnimatorWithEndAction = viewPropertyAnimatorWithStartAction.withEndAction(new Runnable() { // from class: KC
                    @Override // java.lang.Runnable
                    public final void run() {
                        String strM625r2;
                        Editable text4;
                        switch (i) {
                            case 0:
                                C0701QC c0701qc3 = c0701qc2;
                                c0701qc3.m1435i();
                                EditText editText4 = c0701qc3.f2258e;
                                if (editText4 == null || (text4 = editText4.getText()) == null || (strM625r2 = text4.toString()) == null) {
                                    strM625r2 = AbstractC0295Gu.m625r(-464994634299445L);
                                }
                                c0701qc3.m1431e(strM625r2);
                                break;
                            default:
                                c0701qc2.f2263j = false;
                                break;
                        }
                    }
                })) == null) {
                    return;
                }
                viewPropertyAnimatorWithEndAction.start();
                return;
            default:
                ((AlertDialog) obj2).dismiss();
                AbstractC1208bA.m2329b(new RunnableC2126k3((Context) obj, i3), 100L);
                return;
        }
    }

    public /* synthetic */ ViewOnClickListenerC2176l5(C0625Og c0625Og, C0140DA c0140da, C0185EC c0185ec) {
        this.f7584a = 7;
        this.f7585b = c0625Og;
        this.f7586c = c0140da;
    }
}
