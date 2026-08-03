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
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import io.github.cherrywechat.lua.loader.LoadedScript;
import io.github.cherrywechat.lua.loader.ScriptManager;
import io.sentry.android.core.C1666I;
import io.sentry.android.core.internal.util.ViewTreeObserverOnDrawListenerC1720h;
import java.lang.reflect.Method;
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

    public /* synthetic */ RunnableC0586Nk(ViewGroup r2, ImageView r3, ViewGroup r4, ViewGroup r5) {
        this.f1905a = 0;
        this.f1906b = r2;
        this.f1909e = r3;
        this.f1907c = r4;
        this.f1908d = r5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.f1905a;
        int r2 = 17;
        Object r5 = this.f1909e;
        Object r6 = this.f1908d;
        Object r7 = this.f1907c;
        Object r8 = this.f1906b;
        switch(r0) {
            case 0: goto L38;
            case 1: goto L36;
            case 2: goto L8;
            default: goto L4;
        };
    L4:
        Window r82 = (Window) r8;
        Window.Callback r72 = (Window.Callback) r7;
        Runnable r62 = (Runnable) r6;
        C1666I r52 = (C1666I) r5;
        View r02 = r82.peekDecorView();
        if (r02 == null) goto L94;
        r82.setCallback(r72);
        ViewTreeObserverOnDrawListenerC1720h r22 = new ViewTreeObserverOnDrawListenerC1720h(r02, r62);
        r52.getClass();
        r02.getViewTreeObserver().addOnDrawListener(r22);
        return;
    L94:
        return;
    L8:
        TextView r83 = (TextView) r8;
        C0339Hv r73 = (C0339Hv) r7;
        AlertDialog r63 = (AlertDialog) r6;
        Context r53 = (Context) r5;
        LinkedHashMap r03 = AbstractC1257cG.f4258a;
        DexKitBridge r9 = new DexKitBridge(AbstractC1450gG.f5069c);
        Iterator r04 = AbstractC1257cG.f4258a.entrySet().iterator();
    L10:
        if (r04.hasNext() == false) goto L34;
        C1214bG r10 = (C1214bG) ((Map.Entry) r04.next()).getValue();
        Object r11 = r10.f4148c.mo446d(r9, AbstractC1450gG.f5069c);     // Catch: Throwable -> L14
    L16:
        if (r11 != null) goto L82;
        r83.post(new RunnableC2260n3(r2, r83, r10));     // Catch: Throwable -> L20
    L31:
        r73.f1147a++;
        r83.post(new RunnableC2260n3(18, r83, r73));     // Catch: Throwable -> L20
        goto L10
    L82:
        r10.f4146a = r11;     // Catch: Throwable -> L20
        SharedPreferences.Editor r12 = AbstractC1257cG.m2376d().edit();     // Catch: Throwable -> L20
        if ((r11 instanceof Method) == false) goto L23;
        String r112 = new C0149Dd((Method) r11).toString();     // Catch: Throwable -> L20
    L29:
        r12.putString(r10.f4147b, r112);     // Catch: Throwable -> L20
        r12.apply();     // Catch: Throwable -> L20
        goto L31
    L23:
        if ((r11 instanceof Class) == false) goto L26;
        r112 = AbstractC0235Fd.m481d(AbstractC0235Fd.m478a((Class) r11));     // Catch: Throwable -> L20
        goto L29
    L26:
        if ((r11 instanceof String) == false) goto L28;
        r112 = (String) r11;     // Catch: Throwable -> L20
        goto L29
    L28:
        r112 = null;
        goto L29
    L20:
        th = move-exception;
        r83.post(new RunnableC2445r8(r83, th, r63, 6));
        return;
    L15:
        AbstractC0295Gu.m625r(-579919369205813L);     // Catch: Throwable -> L20
        String r113 = r10.f4147b;     // Catch: Throwable -> L20
        AbstractC0295Gu.m625r(-579940844042293L);     // Catch: Throwable -> L20
        r11 = null;
        goto L16
    L34:
        SharedPreferences.Editor r05 = AbstractC1257cG.m2376d().edit();
        r05.putInt(AbstractC0295Gu.m625r(-579966613846069L), 115);
        r05.apply();
        r9.close();
        r83.post(new RunnableC2445r8(r83, r63, r53));
        return;
    L36:
        ScriptManager.m3535d(r8, (LoadedScript) r7, (String) r6, (InterfaceC1416fj) r5);
        return;
    L38:
        final ViewGroup r84 = (ViewGroup) r8;
        final ImageView r54 = (ImageView) r5;
        final ViewGroup r74 = (ViewGroup) r7;
        ViewGroup r64 = (ViewGroup) r6;
        C1456gf.m2805o(r84);
        final TextView r06 = (TextView) r84.findViewById(R.id.text1);
        String r92 = r06.getText().toString();
        String r102 = AbstractC0295Gu.m625r(-42563125901365L);
        HashMap r114 = AbstractC0999XA.f3193a;
        r06.setText(AbstractC0085Bz.m133K(r92, r102, C1517hw.m2892d(AbstractC0295Gu.m625r(-42576010803253L), AbstractC0295Gu.m625r(-41016937674805L))));
        if (C1517hw.m2889a(-16777216, AbstractC0295Gu.m625r(-41029822576693L)) == 0) goto L41;
        C1456gf.m2797O(r06, C1517hw.m2889a(-16777216, AbstractC0295Gu.m625r(-41145786693685L)));
    L41:
        r06.addTextChangedListener(new C1351e5(3, r06));
        r84.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC0500Lk(r74, r06, r54, r84));
        r74.getLayoutParams().height = AbstractC0295Gu.m616i(56);
        Drawable r55 = C1517hw.m2890b(AbstractC0295Gu.m625r(-63694364997685L));
        r74.setTag(io.github.cherrywechat.R.id.tag_view_bg_ban, null);
        r74.setBackground(r55);
        r74.setTag(io.github.cherrywechat.R.id.tag_view_bg_ban, Object.class);
        View r75 = r74.getChildAt(0);
        AbstractC0295Gu.m625r(-63282048137269L);
        LinearLayout r76 = (LinearLayout) r75;
        if (r76 == null) goto L44;
        r76.setBackground(null);
        r76.setTag(io.github.cherrywechat.R.id.tag_view_bg_ban, Object.class);
    L44:
        int r3 = r76.getChildCount();
        int r56 = 0;
    L46:
        if (r56 >= r3) goto L69;
        View r122 = r76.getChildAt(r56);
        AbstractC0295Gu.m625r(-61911953569845L);
        ViewGroup r123 = (ViewGroup) r122;
        C1456gf.m2807r(r123);
        TextView r124 = (TextView) r123.findViewById(AbstractC0828TB.f2618j);
        r124.setVisibility(8);
        TextView r14 = new TextView(r124.getContext());
        r14.setTextSize(1, 12.0f);
        r14.setId(AbstractC0828TB.f2615g);
        if (r56 != 0) goto L50;
        HashMap r115 = AbstractC0999XA.f3193a;
        int r116 = C1517hw.m2889a(-16777216, AbstractC0295Gu.m625r(-61619895793717L));
    L51:
        C1456gf.m2797O(r14, r116);
        if (r56 == 0) goto L58;
        if (r56 == 1) goto L57;
        if (r56 == 2) goto L56;
        HashMap r117 = AbstractC0999XA.f3193a;
        String r118 = C1517hw.m2892d(AbstractC0295Gu.m625r(-62208306313269L), AbstractC0295Gu.m625r(-62281320757301L));
    L59:
        r14.setText(r118);
        ViewParent r119 = r124.getParent();
        AbstractC0295Gu.m625r(-62289910691893L);
        ((ViewGroup) r119).addView(r14, r124.getLayoutParams());
        ViewParent r1110 = r124.getParent();
        AbstractC0295Gu.m625r(-43306155243573L);
        View r1111 = ((ViewGroup) r1110).getChildAt(0);
        AbstractC0295Gu.m625r(-43014097467445L);
        ViewGroup r1112 = (ViewGroup) r1111;
        r1112.getChildAt(0).setAlpha(0.0f);
        View r125 = r1112.getChildAt(1);
        AbstractC0295Gu.m625r(-43821551319093L);
        TextView r126 = (TextView) r125;
        r126.setAlpha(0.0f);
        TextView r13 = new TextView(r126.getContext());
        r13.setTextSize(1, 12.0f);
        HashMap r85 = AbstractC0999XA.f3193a;
        r13.setTextColor(C1517hw.m2889a(-16777216, AbstractC0295Gu.m625r(-43533788510261L)));
        r13.setGravity(17);
        r13.setVisibility(8);
        r13.setSingleLine(true);
        r13.setIncludeFontPadding(false);
        r13.setBackground(C1517hw.m2890b(AbstractC0295Gu.m625r(-43662637529141L)));
        r1112.addView(r13, r126.getLayoutParams());
        r126.addTextChangedListener(new C0672Pk(r13, r126));
        View r127 = r1112.getChildAt(2);
        GradientDrawable r86 = new GradientDrawable();
        r86.setShape(1);
        r86.setColor(C1517hw.m2889a(-65536, AbstractC0295Gu.m625r(-42163693942837L)));
        C1456gf.m2796N(r127, r86);
        Context r87 = r1112.getContext();
        AbstractC0295Gu.m625r(-42296837929013L);
        if (r56 == 0) goto L67;
        if (r56 != 1) goto L63;
        Drawable r128 = C1517hw.m2890b(AbstractC0295Gu.m625r(-42017665054773L));
    L68:
        ImageView r88 = C1456gf.m2808t(r87, r128);
        r14.setTag(r88);
        RelativeLayout.LayoutParams r129 = new RelativeLayout.LayoutParams(AbstractC0295Gu.m616i(34), AbstractC0295Gu.m616i(34));
        r129.addRule(13);
        r1112.addView(r88, 0, r129);
        r56 = r56 + 1;
        goto L46
    L63:
        if (r56 == 2) goto L65;
        r128 = C1517hw.m2890b(AbstractC0295Gu.m625r(-42395622176821L));
        goto L68
    L65:
        r128 = C1517hw.m2890b(AbstractC0295Gu.m625r(-42756399429685L));
        goto L68
    L67:
        r128 = C1517hw.m2890b(AbstractC0295Gu.m625r(-41815801591861L));
        goto L68
    L56:
        HashMap r1113 = AbstractC0999XA.f3193a;
        r118 = C1517hw.m2892d(AbstractC0295Gu.m625r(-62642098010165L), AbstractC0295Gu.m625r(-62195421411381L));
        goto L59
    L57:
        HashMap r1114 = AbstractC0999XA.f3193a;
        r118 = C1517hw.m2892d(AbstractC0295Gu.m625r(-62530428860469L), AbstractC0295Gu.m625r(-62624918140981L));
        goto L59
    L58:
        HashMap r1115 = AbstractC0999XA.f3193a;
        r118 = C1517hw.m2892d(AbstractC0295Gu.m625r(-62427349645365L), AbstractC0295Gu.m625r(-62517543958581L));
        goto L59
    L50:
        HashMap r1116 = AbstractC0999XA.f3193a;
        r116 = C1517hw.m2889a(-7829368, AbstractC0295Gu.m625r(-61744449845301L));
        goto L51
    L69:
        View r07 = r64.getChildAt(1);
        AbstractC0295Gu.m625r(-41304700483637L);
        C1456gf.m2805o((ViewGroup) r07);
        View r08 = r64.getChildAt(2);
        AbstractC0295Gu.m625r(-39913131079733L);
        C1456gf.m2805o((ViewGroup) r08);
        View r23 = r64.getChildAt(3);
        AbstractC0295Gu.m625r(-39621073303605L);
        C1456gf.m2805o((ViewGroup) r23);
        HashMap r09 = AbstractC0999XA.f3193a;
        Drawable r010 = C1517hw.m2890b(AbstractC0295Gu.m625r(-65524021065781L));
        if (r010 == null) goto L72;
        View r32 = r64.getChildAt(0);
        AbstractC0295Gu.m625r(-65670049953845L);
        Context r57 = r64.getContext();
        AbstractC0295Gu.m625r(-64278480549941L);
        ((ViewGroup) r32).addView(C1456gf.m2808t(r57, r010), 0, new ViewGroup.LayoutParams(-1, -1));
    L72:
        Drawable r011 = C1517hw.m2890b(AbstractC0295Gu.m625r(-63797444212789L));
        if (r011 == null) goto L75;
        View r33 = r64.getChildAt(1);
        AbstractC0295Gu.m625r(-63921998264373L);
        Context r4 = r64.getContext();
        AbstractC0295Gu.m625r(-64729452116021L);
        ((ViewGroup) r33).addView(C1456gf.m2808t(r4, r011), 0, new ViewGroup.LayoutParams(-1, -1));
    L75:
        Drawable r012 = C1517hw.m2890b(AbstractC0295Gu.m625r(-64798171592757L));
        if (r012 == null) goto L78;
        View r34 = r64.getChildAt(2);
        AbstractC0295Gu.m625r(-64381559765045L);
        Context r42 = r64.getContext();
        AbstractC0295Gu.m625r(-62989990361141L);
        ((ViewGroup) r34).addView(C1456gf.m2808t(r42, r012), 0, new ViewGroup.LayoutParams(-1, -1));
    L78:
        Drawable r013 = C1517hw.m2890b(AbstractC0295Gu.m625r(-63058709837877L));
        if (r013 == null) goto L96;
        View r35 = r64.getChildAt(3);
        AbstractC0295Gu.m625r(-63161789052981L);
        Context r43 = r64.getContext();
        AbstractC0295Gu.m625r(-62869731276853L);
        ((ViewGroup) r35).addView(C1456gf.m2808t(r43, r013), 0, new ViewGroup.LayoutParams(-1, -1));
        return;
    }

    public /* synthetic */ RunnableC0586Nk(Object r1, Object r2, Object r3, Object r4, int r5) {
        this.f1905a = r5;
        this.f1906b = r1;
        this.f1907c = r2;
        this.f1908d = r3;
        this.f1909e = r4;
    }
}
