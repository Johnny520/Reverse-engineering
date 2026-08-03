package p000;

import android.app.AlertDialog;
import android.app.AndroidAppHelper;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.bumptech.glide.ComponentCallbacks2C1273a;
import de.robv.android.xposed.XposedBridge;
import io.github.cherrywechat.R;
import io.github.cherrywechat.application.MainApplication;
import io.github.cherrywechat.network.model.Developer;
import java.util.Iterator;

/* JADX INFO: renamed from: e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1345e implements InterfaceC0884Ui {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4839a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2213m f4840b;

    public /* synthetic */ C1345e(C2213m r1, int r2) {
        this.f4839a = r2;
        this.f4840b = r1;
    }

    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch(this.f4839a) {
            case 0: goto L56;
            case 1: goto L43;
            case 2: goto L42;
            default: goto L4;
        };
    L4:
        Integer r1 = 12;
        Integer r2 = 40;
        final C2213m r4 = this.f4840b;
        ScrollView r3 = new ScrollView(r4.getContext());
        r3.setLayoutParams(new LinearLayout.LayoutParams(-1, Math.min((int) (((double) r3.getContext().getResources().getDisplayMetrics().heightPixels) * 0.6d), -2)));
        int r5 = 0;
        r3.setVerticalScrollBarEnabled(false);
        r3.setOverScrollMode(2);
        LinearLayout r6 = new LinearLayout(r4.getContext());
        r6.setOrientation(1);
        r6.setPadding(AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(16));
        TextView r7 = new TextView(r6.getContext());
        r7.setText(AbstractC0295Gu.m625r(-815893462382645L));
        r7.setTextSize(16.0f);
        r7.setTextColor(r7.getContext().getColor(R.color.textTitle));
        r7.setTypeface(Typeface.DEFAULT_BOLD);
        r7.setPadding(0, 0, 0, AbstractC0295Gu.m616i(8));
        r6.addView(r7);
        Iterator r72 = r4.f7704d.iterator();
    L6:
        if (r72.hasNext() == false) goto L20;
        Developer r12 = (Developer) r72.next();
        LinearLayout r15 = new LinearLayout(r6.getContext());
        r15.setOrientation(r5);
        Integer r17 = r1;
        r15.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8));
        FrameLayout r13 = new FrameLayout(r15.getContext());
        LinearLayout.LayoutParams r52 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(r2), AbstractC0295Gu.m616i(r2));
        r52.setMarginEnd(AbstractC0295Gu.m616i(r17));
        r13.setLayoutParams(r52);
        ImageView r53 = new ImageView(r13.getContext());
        r53.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        r53.setOutlineProvider(new C2122k(1));
        r53.setClipToOutline(true);
        if (r12.getAvatar().length() <= 0) goto L10;
        Integer r18 = r2;
        ((C1193aw) ((C1193aw) ComponentCallbacks2C1273a.m2414c(r53.getContext()).m2833n(r12.getAvatar()).m5324s(new C2446r9(), true)).m5312f(android.R.drawable.ic_menu_myplaces)).m2298A(r53);
    L11:
        r13.addView(r53);
        r15.addView(r13);
        LinearLayout r14 = new LinearLayout(r15.getContext());
        r14.setOrientation(1);
        r14.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView r22 = new TextView(r14.getContext());
        r22.setText(r12.getName());
        r22.setTextSize(15.0f);
        r22.setTextColor(r22.getContext().getColor(R.color.textTitle));
        r22.setTypeface(Typeface.DEFAULT_BOLD);
        r14.addView(r22);
        TextView r23 = new TextView(r14.getContext());
        r23.setText(r12.getRole());
        r23.setTextSize(13.0f);
        r23.setTextColor(r23.getContext().getColor(R.color.textSummary));
        r23.setPadding(0, AbstractC0295Gu.m616i(2), 0, 0);
        r14.addView(r23);
        r15.addView(r14);
        final String r16 = r12.getLink();
        if (r16 == null) goto L19;
        if (AbstractC2564tz.m5059T(r16) == false) goto L17;
        r16 = null;
    L17:
        if (r16 == null) goto L19;
        StateListDrawable r24 = new StateListDrawable();
        r24.addState(new int[]{android.R.attr.state_pressed}, new ColorDrawable(r15.getContext().getColor(R.color.pressedStateColor)));
        r24.addState(new int[0], new ColorDrawable(r15.getContext().getColor(R.color.colorForeground)));
        r15.setBackground(r24);
        r15.setClickable(true);
        r15.setFocusable(true);
        final int r54 = 0;
        r15.setOnClickListener(new ViewOnClickListenerC1521i(r4, r16, r54));
    L19:
        r6.addView(r15);
        r1 = r17;
        r2 = r18;
        r5 = 0;
        goto L6
    L10:
        r18 = r2;
        r53.setImageResource(android.R.drawable.ic_menu_myplaces);
        goto L11
    L20:
        Integer r172 = r1;
        Integer r182 = r2;
        if (r4.f7705e.isEmpty() == true) goto L39;
        TextView r19 = new TextView(r6.getContext());
        r19.setText(AbstractC0295Gu.m625r(-815923527153717L));
        r19.setTextSize(16.0f);
        r19.setTextColor(r19.getContext().getColor(R.color.textTitle));
        r19.setTypeface(Typeface.DEFAULT_BOLD);
        r19.setPadding(0, AbstractC0295Gu.m616i(16), 0, AbstractC0295Gu.m616i(8));
        r6.addView(r19);
        Iterator r110 = r4.f7705e.iterator();
    L24:
        if (r110.hasNext() == false) goto L39;
        Developer r25 = (Developer) r110.next();
        LinearLayout r55 = new LinearLayout(r6.getContext());
        r55.setOrientation(0);
        r55.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8));
        FrameLayout r73 = new FrameLayout(r55.getContext());
        LinearLayout.LayoutParams r8 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(r182), AbstractC0295Gu.m616i(r182));
        r8.setMarginEnd(AbstractC0295Gu.m616i(r172));
        r73.setLayoutParams(r8);
        ImageView r82 = new ImageView(r73.getContext());
        r82.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        r82.setOutlineProvider(new C2122k(2));
        r82.setClipToOutline(true);
        if (r25.getAvatar().length() <= 0) goto L28;
        ((C1193aw) ((C1193aw) ComponentCallbacks2C1273a.m2414c(r82.getContext()).m2833n(r25.getAvatar()).m5324s(new C2446r9(), true)).m5312f(android.R.drawable.ic_menu_myplaces)).m2298A(r82);
    L29:
        r73.addView(r82);
        r55.addView(r73);
        LinearLayout r74 = new LinearLayout(r55.getContext());
        r74.setOrientation(1);
        r74.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView r83 = new TextView(r74.getContext());
        r83.setText(r25.getName());
        r83.setTextSize(15.0f);
        r83.setTextColor(r83.getContext().getColor(R.color.textTitle));
        r83.setTypeface(Typeface.DEFAULT_BOLD);
        r74.addView(r83);
        TextView r84 = new TextView(r74.getContext());
        r84.setText(r25.getRole());
        r84.setTextSize(13.0f);
        r84.setTextColor(r84.getContext().getColor(R.color.textSummary));
        r84.setPadding(0, AbstractC0295Gu.m616i(2), 0, 0);
        r74.addView(r84);
        r55.addView(r74);
        final String r26 = r25.getLink();
        if (r26 == null) goto L38;
        if (AbstractC2564tz.m5059T(r26) == false) goto L35;
        r26 = null;
    L35:
        if (r26 == null) goto L38;
        StateListDrawable r75 = new StateListDrawable();
        r75.addState(new int[]{android.R.attr.state_pressed}, new ColorDrawable(r55.getContext().getColor(R.color.pressedStateColor)));
        r75.addState(new int[0], new ColorDrawable(r55.getContext().getColor(R.color.colorForeground)));
        r55.setBackground(r75);
        r55.setClickable(true);
        r55.setFocusable(true);
        final int r10 = 1;
        r55.setOnClickListener(new ViewOnClickListenerC1521i(r4, r26, r10));
    L38:
        r6.addView(r55);
        goto L24
    L28:
        r82.setImageResource(android.R.drawable.ic_menu_myplaces);
    L39:
        TextView r111 = new TextView(r6.getContext());
        r111.setText(AbstractC0295Gu.m625r(-815949296957493L));
        r111.setTextSize(14.0f);
        r111.setTextColor(r111.getContext().getColor(R.color.textSummary));
        r111.setGravity(17);
        r111.setPadding(0, AbstractC0295Gu.m616i(24), 0, AbstractC0295Gu.m616i(8));
        r6.addView(r111);
        r3.addView(r6);
        AlertDialog r112 = new AlertDialog.Builder(r4.getContext(), android.R.style.Theme.Material.Light.Dialog.Alert).setTitle(AbstractC0295Gu.m625r(-816022311401525L)).setView(r3).setPositiveButton(AbstractC0295Gu.m625r(-816048081205301L), null).create();
        r112.show();
        C2213m.m4449k(r112);
    L41:
        return C0829TC.f2620a;
    L42:
        C2227mD r113 = C2227mD.f7746a;
        Context r27 = this.f4840b.getContext();
        AbstractC0295Gu.m625r(-814686576572469L);
        r113.getClass();
        AbstractC0295Gu.m625r(-463053309081653L);
        C2227mD.m4484c(r27, true);
        goto L41
    L43:
        AlertDialog.Builder r114 = new AlertDialog.Builder(this.f4840b.getContext(), android.R.style.Theme.Material.Light.Dialog.Alert).setTitle(AbstractC0295Gu.m625r(-814763885983797L));
        StringBuilder r28 = new StringBuilder();
        r28.append(AbstractC0295Gu.m625r(-814793950754869L));
        AbstractC2374ph.m4817n(r28, AbstractC1450gG.f5068b, -815012994086965L);
        Context r32 = MainApplication.f5549a;
        if (r32 != null) goto L50;
        r32 = C1456gf.f5172p;
        if (r32 != null) goto L50;
        r32 = AndroidAppHelper.currentApplication();
        AbstractC0295Gu.m625r(-836852902787125L);
    L50:
        String r33 = r32.getApplicationInfo().packageName;
        AbstractC0295Gu.m625r(-837656061671477L);
        AbstractC2374ph.m4817n(r28, r33, -815687303952437L);
        if (AbstractC1450gG.f5073g.isEmpty() == false) goto L54;
        long r34 = -815489735456821L;
    L55:
        r28.append(AbstractC0295Gu.m625r(r34));
        r28.append(AbstractC0295Gu.m625r(-815515505260597L));
        AlertDialog r115 = r114.setMessage(AbstractC2607uz.m5118D(r28.toString())).setPositiveButton(AbstractC0295Gu.m625r(-813926367361077L), null).create();
        r115.show();
        C2213m.m4449k(r115);
        goto L41
    L54:
        r34 = -815502620358709L;
        goto L55
    L56:
        AlertDialog.Builder r116 = new AlertDialog.Builder(this.f4840b.getContext(), android.R.style.Theme.Material.Light.Dialog.Alert).setTitle(AbstractC0295Gu.m625r(-816060966107189L));
        StringBuilder r29 = new StringBuilder();
        r29.append(AbstractC0295Gu.m625r(-816091030878261L));
        r29.append(XposedBridge.getXposedVersion());
        r29.append(AbstractC0295Gu.m625r(-815017289054261L));
        if (AbstractC1450gG.f5073g.isEmpty() == false) goto L60;
        long r35 = -815214857549877L;
    L61:
        r29.append(AbstractC0295Gu.m625r(r35));
        r29.append(AbstractC0295Gu.m625r(-815240627353653L));
        AlertDialog r117 = r116.setMessage(AbstractC2607uz.m5118D(r29.toString())).setPositiveButton(AbstractC0295Gu.m625r(-814751001081909L), null).create();
        r117.show();
        C2213m.m4449k(r117);
        goto L41
    L60:
        r35 = -815227742451765L;
        goto L61
    }
}
