package p000;

import android.app.Activity;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import io.github.cherrywechat.R;
import io.github.cherrywechat.network.model.ApiResponse;
import io.github.cherrywechat.network.model.FriendLinkData;
import io.github.cherrywechat.network.model.FriendLinkItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: Pi */
/* JADX INFO: loaded from: classes.dex */
public final class C0670Pi extends LinearLayout implements InterfaceC0972Wk {

    /* JADX INFO: renamed from: a */
    public LinearLayout f2137a;

    static {
        AbstractC0295Gu.m625r(-77519864723509L);
    }

    /* JADX INFO: renamed from: a */
    public static final List m1335a(C0670Pi r3, String r4) {
        C0452Kf r32 = C0452Kf.f1484a;
        C0029Am r0 = AbstractC2809zm.f9524a;     // Catch: Exception -> L5
        r0.getClass();     // Catch: Exception -> L5
        Object r42 = r0.m4550a(ApiResponse.Companion.serializer(FriendLinkData.Companion.serializer()), r4);     // Catch: Exception -> L5
    L8:
        ApiResponse r43 = (ApiResponse) r42;     // Catch: Exception -> L26
        if (r43 != null) goto L12;
        return r32;
    L12:
        if (r43.getCode() == 0) goto L14;
        AbstractC0295Gu.m625r(-78881369356341L);     // Catch: Exception -> L26
        AbstractC0295Gu.m625r(-77262166685749L);     // Catch: Exception -> L26
        r43.getMessage();     // Catch: Exception -> L26
        return r32;
    L14:
        FriendLinkData r44 = (FriendLinkData) r43.getData();     // Catch: Exception -> L26
        if (r44 == null) goto L37;
        List<FriendLinkItem> r45 = r44.getItems();     // Catch: Exception -> L26
        if (r45 == null) goto L38;
        ArrayList r02 = new ArrayList();     // Catch: Exception -> L26
        Iterator<T> r46 = r45.iterator();     // Catch: Exception -> L26
    L20:
        if (r46.hasNext() == false) goto L39;
        Object r1 = r46.next();     // Catch: Exception -> L26
        if (AbstractC2564tz.m5059T(((FriendLinkItem) r1).getUrl()) == true) goto L20;
        r02.add(r1);     // Catch: Exception -> L26
        goto L20
    L39:
        return r02;
    L38:
        return r32;
    L37:
        return r32;
    L26:
        AbstractC0295Gu.m625r(-77305116358709L);
        AbstractC0295Gu.m625r(-77335181129781L);
        return r32;
    L5:
        e = move-exception;
        AbstractC0295Gu.m625r(-78748225370165L);     // Catch: Exception -> L26
        AbstractC0425Jv.m881a(ApiResponse.class).m445b();     // Catch: Exception -> L26
        AbstractC0295Gu.m625r(-78864189487157L);     // Catch: Exception -> L26
        e.getMessage();     // Catch: Exception -> L26
        r42 = null;
        goto L8
    }

    /* JADX INFO: renamed from: e */
    public static final void m1336e(C0670Pi r20, List r21) {
        LinearLayout r1 = r20.f2137a;
        if (r1 != null) goto L5;
        AbstractC0295Gu.m625r(-77373835835445L);
        r1 = null;
    L5:
        int r12 = r1.getChildCount();
        if (r12 <= 2) goto L11;
        LinearLayout r4 = r20.f2137a;
        if (r4 != null) goto L10;
        AbstractC0295Gu.m625r(-77433965377589L);
        r4 = null;
    L10:
        r4.removeViews(2, r12 - 2);
    L11:
        Iterator r13 = r21.iterator();
    L13:
        if (r13.hasNext() == false) goto L30;
        FriendLinkItem r3 = (FriendLinkItem) r13.next();
        ViewGroup r42 = r20.f2137a;
        ViewGroup r43 = r42;
        if (r42 != null) goto L17;
        AbstractC0295Gu.m625r(-77494094919733L);
        r43 = null;
    L17:
        LinearLayout r6 = new LinearLayout(r20.getContext());
        r6.setOrientation(0);
        GradientDrawable r8 = new GradientDrawable();
        r8.setColor(r6.getContext().getColor(R.color.colorForeground));
        r8.setCornerRadius(AbstractC0295Gu.m616i(16));
        r6.setBackground(r8);
        r6.setPadding(AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20));
        LinearLayout.LayoutParams r82 = new LinearLayout.LayoutParams(-1, -2);
        r82.bottomMargin = AbstractC0295Gu.m616i(16);
        r6.setLayoutParams(r82);
        LinearLayout r83 = new LinearLayout(r6.getContext());
        r83.setGravity(17);
        r83.setLayoutParams(new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(48), AbstractC0295Gu.m616i(48)));
        int r11 = r3.getColor();
        if (Color.alpha(r11) != 0) goto L20;
        int r14 = 255;
    L21:
        int r112 = (r11 & 16777215) | (AbstractC0828TB.m1639f((int) (r14 * 0.15f), 255) << 24);
        GradientDrawable r142 = new GradientDrawable();
        r142.setColor(r112);
        r142.setCornerRadius(AbstractC0295Gu.m616i(12));
        r83.setBackground(r142);
        TextView r113 = new TextView(r83.getContext());
        r113.setText(r3.getIcon());
        r113.setTextSize(24.0f);
        r113.setGravity(17);
        r83.addView(r113);
        r6.addView(r83);
        LinearLayout r84 = new LinearLayout(r6.getContext());
        r84.setOrientation(1);
        LinearLayout.LayoutParams r143 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        r143.setMarginStart(AbstractC0295Gu.m616i(16));
        r84.setLayoutParams(r143);
        TextView r9 = new TextView(r84.getContext());
        r9.setText(r3.getName());
        r9.setTextSize(16.0f);
        r9.setTextColor(r9.getContext().getColor(R.color.textTitle));
        r9.setTypeface(Typeface.DEFAULT_BOLD);
        r84.addView(r9);
        TextView r92 = new TextView(r84.getContext());
        r92.setText(r3.getDescription());
        r92.setTextSize(14.0f);
        r92.setTextColor(r92.getContext().getColor(R.color.textSummary));
        r92.setPadding(0, AbstractC0295Gu.m616i(4), 0, 0);
        r84.addView(r92);
        r6.addView(r84);
        TextView r2 = new TextView(r6.getContext());
        r2.setText(AbstractC0295Gu.m625r(-77232101914677L));
        r2.setTextSize(14.0f);
        if (Color.alpha(r3.getColor()) != 0) goto L24;
        int r7 = r3.getColor() | (-16777216);
    L26:
        if ((((double) 1) - (((((double) Color.blue(r7)) * 0.114d) + ((((double) Color.green(r7)) * 0.587d) + (((double) Color.red(r7)) * 0.299d))) / ((double) 255))) < 0.5d) goto L28;
        int r114 = -1;
    L29:
        r2.setTextColor(r114);
        r2.setGravity(17);
        ColorStateList r93 = ColorStateList.valueOf(520093696);
        GradientDrawable r115 = new GradientDrawable();
        r115.setColor(r7);
        r115.setCornerRadius(AbstractC0295Gu.m616i(16));
        r2.setBackground(new RippleDrawable(r93, r115, null));
        LinearLayout.LayoutParams r72 = new LinearLayout.LayoutParams(-2, -2);
        r72.gravity = 16;
        r72.setMarginStart(AbstractC0295Gu.m616i(16));
        r2.setLayoutParams(r72);
        r2.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8));
        r2.setClickable(true);
        r2.setFocusable(true);
        r2.setOnClickListener(new ViewOnClickListenerC2176l5(9, r2, r3));
        r6.addView(r2);
        r6.setBackground(new RippleDrawable(ColorStateList.valueOf(520093696), r6.getBackground(), null));
        r6.setClickable(true);
        r6.setFocusable(true);
        r6.setOnClickListener(new ViewOnClickListenerC2176l5(10, r6, r3));
        r43.addView(r6);
        goto L13
    L28:
        r114 = -16777216;
        goto L29
    L24:
        r7 = r3.getColor();
        goto L26
    L20:
        r14 = Color.alpha(r11);
        goto L21
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: b */
    public final void mo1337b() {
        AbstractC0295Gu.m625r(-77833397336117L);
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: c */
    public final void mo1338c(Activity r1, int r2, int r3, Intent r4) {
        AbstractC0295Gu.m625r(-77872052041781L);
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: d */
    public final void mo1339d(Activity r3) {
        AbstractC0295Gu.m625r(-77794742630453L);
    }

    @Override // p000.InterfaceC0972Wk
    public View getContentView() {
        return this;
    }

    @Override // p000.InterfaceC0972Wk
    public String getTitle() {
        return AbstractC0295Gu.m625r(-77910706747445L);
    }

    public int getViewId() {
        return 7;
    }
}
