package p000;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
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
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: l5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC2176l5 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7584a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f7585b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f7586c;

    public /* synthetic */ ViewOnClickListenerC2176l5(int r1, Object r2, Object r3) {
        this.f7584a = r1;
        this.f7585b = r2;
        this.f7586c = r3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View r21) {
        int r1 = this.f7584a;
        LinearLayout r2 = null;
        int r3 = 2;
        int r5 = 3;
        int r6 = 8;
        boolean r7 = false;
        Object[] r72 = 0;
        final int r8 = 1;
        Object r9 = this.f7586c;
        Object r10 = this.f7585b;
        switch(r1) {
            case 0: goto L172;
            case 1: goto L168;
            case 2: goto L161;
            case 3: goto L156;
            case 4: goto L154;
            case 5: goto L147;
            case 6: goto L134;
            case 7: goto L132;
            case 8: goto L130;
            case 9: goto L128;
            case 10: goto L126;
            case 11: goto L124;
            case 12: goto L117;
            case 13: goto L108;
            case 14: goto L104;
            case 15: goto L90;
            case 16: goto L75;
            case 17: goto L73;
            case 18: goto L71;
            case 19: goto L69;
            case 20: goto L67;
            case 21: goto L60;
            case 22: goto L32;
            case 23: goto L6;
            default: goto L4;
        };
    L4:
        ((AlertDialog) r10).dismiss();
        AbstractC1208bA.m2329b(new RunnableC2126k3((Context) r9, r5), 100);
        return;
    L6:
        final C0701QC r102 = (C0701QC) r10;
        EnumC0142DC r92 = (EnumC0142DC) r9;
        long r12 = System.currentTimeMillis();
        if ((r12 - r102.f2262i) >= 300) goto L9;
        return;
    L9:
        if (r102.f2263j == false) goto L12;
        return;
    L12:
        if (r102.f2264k == r92) goto L175;
        r102.f2262i = r12;
        r102.f2263j = true;
        r102.f2264k = r92;
        r102.m1436j();
        RecyclerView r13 = r102.f2259f;
        if (r13 == null) goto L16;
        r13.setAlpha(0.7f);
    L16:
        RecyclerView r14 = r102.f2259f;
        if (r14 == null) goto L176;
        ViewPropertyAnimator r15 = r14.animate();
        if (r15 == null) goto L177;
        ViewPropertyAnimator r16 = r15.alpha(1.0f);
        if (r16 == null) goto L178;
        ViewPropertyAnimator r17 = r16.setDuration(200);
        if (r17 == null) goto L179;
        ViewPropertyAnimator r18 = r17.setInterpolator(new AccelerateDecelerateInterpolator());
        if (r18 == null) goto L180;
        final Object[] r73 = r72 == true ? 1 : 0;
        ViewPropertyAnimator r19 = r18.withStartAction(new RunnableC0443KC(r102, r73));
        if (r19 == null) goto L181;
        ViewPropertyAnimator r110 = r19.withEndAction(new RunnableC0443KC(r102, r8));
        if (r110 == null) goto L182;
        r110.start();
        return;
    L182:
        return;
    L181:
        return;
    L180:
        return;
    L179:
        return;
    L178:
        return;
    L177:
        return;
    L176:
        return;
    L175:
        return;
    L32:
        C0701QC r103 = (C0701QC) r10;
        Activity r93 = (Activity) r9;
        int r111 = r103.f2264k.ordinal();
        if (r111 == 0) goto L38;
        if (r111 != 1) goto L37;
        String[] r112 = {AbstractC0295Gu.m625r(-484476605954101L), AbstractC0295Gu.m625r(-484489490855989L), AbstractC0295Gu.m625r(-484506670725173L), AbstractC0295Gu.m625r(-484519555627061L), AbstractC0295Gu.m625r(-484545325430837L)};
    L39:
        int r22 = r103.f2264k.ordinal();
        if (r22 == 0) goto L54;
        if (r22 != 1) goto L53;
        int r23 = r103.f2268o.ordinal();
        if (r23 == 0) goto L51;
        if (r23 == 1) goto L50;
        if (r23 == 2) goto L48;
        if (r23 == 3) goto L58;
        if (r23 != 4) goto L48;
    L49:
        r3 = 1;
    L58:
        AlertDialog r113 = new AlertDialog.Builder(r93).setTitle(AbstractC0295Gu.m625r(-484571095234613L)).setSingleChoiceItems(r112, r3, new DialogInterfaceOnClickListenerC0536Md(r5, r103)).create();
        r113.show();
        C1456gf.m2802T(r113, false);
        return;
    L48:
        r3 = 0;
        goto L58
    L50:
        r3 = 4;
        goto L58
    L51:
        r3 = 3;
        goto L58
    L53:
        throw new C0232Fa();
    L54:
        int r24 = r103.f2268o.ordinal();
        if (r24 == 0) goto L49;
        if (r24 == 1) goto L58;
    L37:
        throw new C0232Fa();
    L38:
        r112 = new String[]{AbstractC0295Gu.m625r(-484412181444661L), AbstractC0295Gu.m625r(-484425066346549L), AbstractC0295Gu.m625r(-484450836150325L)};
        goto L39
    L60:
        ImageView r94 = (ImageView) r9;
        EditText r114 = ((C0701QC) r10).f2258e;
        if (r114 == null) goto L65;
        Editable r115 = r114.getText();
        if (r115 == null) goto L65;
        r115.clear();
    L65:
        r94.setVisibility(8);
        return;
    L67:
        C1337ds r116 = C1337ds.f4821a;
        Context r25 = ((C0827TA) r10).getContext();
        AbstractC0295Gu.m625r(-488226112403509L);
        String r32 = ((ThemeStoreItem) r9).getId();
        r116.getClass();
        C1337ds.m2591c(r25, 1006, r32);
        return;
    L69:
        ((C0784SA) r10).m1606g((Activity) r9);
        return;
    L71:
        SharedPreferences r117 = AbstractC0599Nx.f1939a;
        AbstractC0599Nx.m1174c(AbstractC0295Gu.m625r(-826141254350901L), true);
        ((AlertDialog) r10).dismiss();
        ((C1389f) r9).mo6a();
        return;
    L73:
        LinearLayout r104 = (LinearLayout) r10;
        AbstractC0295Gu.m625r(-782302523160629L);
        ScaleAnimation r11 = new ScaleAnimation(1.0f, 0.95f, 1.0f, 0.95f, 1, 0.5f, 1, 0.5f);
        r11.setDuration(150);
        r11.setInterpolator(new AccelerateDecelerateInterpolator());
        r11.setAnimationListener(new AnimationAnimationListenerC1511hq(r104, (C2112jq) r9));
        r104.startAnimation(r11);
        return;
    L75:
        C2112jq r95 = (C2112jq) r9;
        int r118 = ((C1379eq) r10).f4918a;
        if (r118 == 2) goto L88;
        if (r118 != 4) goto L79;
        C1337ds r119 = C1337ds.f4821a;
        Context r26 = r95.getContext();
        AbstractC0295Gu.m625r(-825673102915637L);
        C1337ds.m2592d(r119, r26, 7);
        return;
    L79:
        if (r118 == 6) goto L86;
        if (r118 != 8) goto L82;
        C1337ds r120 = C1337ds.f4821a;
        Context r27 = r95.getContext();
        AbstractC0295Gu.m625r(-825260786055221L);
        C1337ds.m2592d(r120, r27, 1005);
        return;
    L82:
        if (r118 != 10) goto L188;
        C1337ds r121 = C1337ds.f4821a;
        Context r28 = r95.getContext();
        AbstractC0295Gu.m625r(-825329505531957L);
        C1337ds.m2592d(r121, r28, 1008);
        return;
    L188:
        return;
    L86:
        C1337ds r122 = C1337ds.f4821a;
        Context r29 = r95.getContext();
        AbstractC0295Gu.m625r(-825192066578485L);
        C1337ds.m2592d(r122, r29, r95.getViewId());
        return;
    L88:
        C1337ds r123 = C1337ds.f4821a;
        Context r210 = r95.getContext();
        AbstractC0295Gu.m625r(-824023835473973L);
        C1337ds.m2592d(r123, r210, 1003);
        return;
    L90:
        C0762Rp r105 = (C0762Rp) r10;
        TextView r96 = (TextView) r9;
        boolean r124 = r105.f2423o;
        r105.f2423o = !r124;
        if (r124 == true) goto L94;
        long r33 = -483201000667189L;
    L95:
        r96.setText(AbstractC0295Gu.m625r(r33));
        LinearLayout r125 = r105.f2421m;
        if (r125 != null) goto L98;
        AbstractC0295Gu.m625r(-483218180536373L);
    L100:
        if (r105.f2423o == false) goto L102;
        r6 = 0;
    L102:
        r2.setVisibility(r6);
        return;
    L98:
        r2 = r125;
        goto L100
    L94:
        r33 = -483209590601781L;
        goto L95
    L104:
        Activity r106 = (Activity) r10;
        C0762Rp r97 = (C0762Rp) r9;
        if (ScriptManager.INSTANCE.getLoadedScripts().isEmpty() == true) goto L189;
        new AlertDialog.Builder(r106).setTitle(AbstractC0295Gu.m625r(-482840223414325L)).setMessage(AbstractC0295Gu.m625r(-482861698250805L)).setPositiveButton(AbstractC0295Gu.m625r(-482913237858357L), new DialogInterfaceOnClickListenerC0505Lp(r97, r8)).setNegativeButton(AbstractC0295Gu.m625r(-482926122760245L), null).show();
        return;
    L189:
        return;
    L108:
        C0976Wo r107 = (C0976Wo) r10;
        C0097CA r98 = (C0097CA) r9;
        r107.getClass();
        C0183EA.f539a.getClass();
        String r126 = C0183EA.m373a();
        String r211 = r98.f223a;
        if (AbstractC0585Nj.m1134a(r211, r126) == false) goto L113;
        Context r127 = r107.getContext();
        long r212 = -83004537960501L;
    L111:
        AbstractC0213Ey.m413k(r212, r127, 0);
        return;
    L113:
        if (C0183EA.m379g(r211) == true) goto L115;
        r127 = r107.getContext();
        r212 = -82489141884981L;
        goto L111
    L115:
        Context r128 = r107.getContext();
        AbstractC0295Gu.m625r(-82592221100085L);
        String r213 = AbstractC0295Gu.m625r(-82660940576821L);
        StringBuilder r34 = new StringBuilder();
        r34.append(AbstractC0295Gu.m625r(-82673825478709L));
        C1456gf.m2801S(r128, r213, AbstractC2374ph.m4815l(r34, r98.f224b, 65311), new DialogInterfaceOnClickListenerC0933Vo(r8, r107, r98), false);
        return;
    L117:
        ImageView r99 = (ImageView) r9;
        EditText r129 = ((C1495ha) r10).f5267d;
        if (r129 == null) goto L122;
        Editable r130 = r129.getText();
        if (r130 == null) goto L122;
        r130.clear();
    L122:
        r99.setVisibility(8);
        return;
    L124:
        C0841Ti r108 = (C0841Ti) r10;
        r108.f2679g = ((C0755Ri) r9).f2393b;
        r108.m1665f();
        r108.m1663a();
        return;
    L126:
        Context r131 = ((LinearLayout) r10).getContext();
        AbstractC0295Gu.m625r(-78000901060661L);
        C1456gf.m2803U(r131, ((FriendLinkItem) r9).getUrl());
        return;
    L128:
        Context r132 = ((TextView) r10).getContext();
        AbstractC0295Gu.m625r(-77932181583925L);
        C1456gf.m2803U(r132, ((FriendLinkItem) r9).getUrl());
        return;
    L130:
        TextView r109 = (TextView) r10;
        Object r133 = r109.getContext().getSystemService(AbstractC0295Gu.m625r(-97427038140469L));
        AbstractC0295Gu.m625r(-97469987813429L);
        ((ClipboardManager) r133).setPrimaryClip(ClipData.newPlainText(AbstractC0295Gu.m625r(-78529182038069L), ((C0185EC) r9).f564p));
        AbstractC0213Ey.m413k(-78580721645621L, r109.getContext(), 0);
        return;
    L132:
        ((C0625Og) r10).m1215a(((C0140DA) r9).f364a);
        return;
    L134:
        ScrollView r1010 = (ScrollView) r10;
        TextView r910 = (TextView) r9;
        if (r1010.getVisibility() != 0) goto L138;
        r8 = 0;
    L138:
        if (r8 == 0) goto L140;
        r6 = 0;
    L140:
        r1010.setVisibility(r6);
        if (r8 == 0) goto L144;
        long r134 = -844364800587829L;
    L145:
        r910.setText(AbstractC0295Gu.m625r(r134));
        return;
    L144:
        r134 = -844412045228085L;
        goto L145
    L147:
        EnumC0319Hb r1011 = (EnumC0319Hb) r10;
        C0276Gb r911 = (C0276Gb) r9;
        if (r1011 == r911.f898d) goto L191;
        InterfaceC1416fj r135 = r911.f896b;
        if (r135 == null) goto L152;
        r135.mo90g(r1011);
    L152:
        r911.m558a(r1011);
        SharedPreferences r136 = AbstractC0599Nx.f1939a;
        AbstractC0599Nx.m1176e(AbstractC0295Gu.m625r(-495664995760181L), r1011.name());
        return;
    L191:
        return;
    L154:
        TextView r1012 = (TextView) r10;
        Object r137 = r1012.getContext().getSystemService(AbstractC0295Gu.m625r(-102306120988725L));
        AbstractC0295Gu.m625r(-102349070661685L);
        ((ClipboardManager) r137).setPrimaryClip(ClipData.newPlainText(AbstractC0295Gu.m625r(-103199474186293L), ((C0054BA) r9).f123d));
        AbstractC0213Ey.m413k(-103251013793845L, r1012.getContext(), 0);
        return;
    L156:
        C1258ca r1013 = (C1258ca) r10;
        C1215ba r912 = (C1215ba) r9;
        LinkedHashMap r138 = r1013.f4262b;
        Integer r214 = Integer.valueOf(r912.getAdapterPosition());
        Boolean r35 = (Boolean) r1013.f4262b.get(Integer.valueOf(r912.getAdapterPosition()));
        if (r35 == null) goto L159;
        r7 = r35.booleanValue();
    L159:
        r138.put(r214, Boolean.valueOf(!r7));
        r1013.notifyItemChanged(r912.getAdapterPosition());
        return;
    L161:
        ImageView r913 = (ImageView) r9;
        EditText r139 = ((C1495ha) r10).f5267d;
        if (r139 == null) goto L166;
        Editable r140 = r139.getText();
        if (r140 == null) goto L166;
        r140.clear();
    L166:
        r913.setVisibility(8);
        return;
    L168:
        List r141 = C1206b8.m2325a();
        SharedPreferences r215 = AbstractC0599Nx.f1939a;
        AbstractC0599Nx.m1175d(AbstractC2453ra.m4901k0(r141, AbstractC0295Gu.m625r(-90138478639157L), null, null, null, 62));
        ((C1206b8) r10).m2326e((Activity) r9);
        ViewOnClickListenerC0996X7 r142 = AbstractC0828TB.f2613e;
        if (r142 == null) goto L192;
        r142.m1890c();
        return;
    L192:
        return;
    L172:
        BannerAdapter.m2520b((BannerAdapter) r10, (AbstractC1166o) r9, r21);
    }

    public /* synthetic */ ViewOnClickListenerC2176l5(C0625Og r1, C0140DA r2, C0185EC r3) {
        this.f7584a = 7;
        this.f7585b = r1;
        this.f7586c = r2;
    }
}
