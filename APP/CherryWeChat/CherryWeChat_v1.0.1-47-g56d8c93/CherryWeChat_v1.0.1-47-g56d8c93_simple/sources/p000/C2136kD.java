package p000;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import io.github.cherrywechat.R;
import io.github.cherrywechat.network.model.Change;
import io.github.cherrywechat.network.model.UpdateItem;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: kD */
/* JADX INFO: loaded from: classes.dex */
public final class C2136kD implements InterfaceC0972Wk {

    /* JADX INFO: renamed from: a */
    public LinearLayout f7479a;

    /* JADX INFO: renamed from: b */
    public ScrollView f7480b;

    /* JADX INFO: renamed from: c */
    public Activity f7481c;

    /* JADX INFO: renamed from: a */
    public static final void m4317a(C2136kD r21, List r22) {
        LinearLayout r5 = r21.f7479a;
        if (r5 != null) goto L5;
        AbstractC0295Gu.m625r(-821292236273717L);
        r5 = null;
    L5:
        r5.removeAllViews();
        if (r22.isEmpty() == false) goto L9;
        r21.m4318e(AbstractC0295Gu.m625r(-821326596012085L));
        return;
    L9:
        Iterator r52 = r22.iterator();
    L11:
        if (r52.hasNext() == false) goto L65;
        UpdateItem r7 = (UpdateItem) r52.next();
        Activity r9 = r21.f7481c;
        if (r9 != null) goto L15;
        AbstractC0295Gu.m625r(-820806904969269L);
        r9 = null;
    L15:
        LinearLayout r8 = new LinearLayout(r9);
        r8.setOrientation(1);
        GradientDrawable r92 = new GradientDrawable();
        Activity r10 = r21.f7481c;
        if (r10 != null) goto L18;
        AbstractC0295Gu.m625r(-820845559674933L);
        r10 = null;
    L18:
        r92.setColor(r10.getColor(R.color.colorForeground));
        r92.setCornerRadius(AbstractC0295Gu.m616i(12));
        r8.setBackground(r92);
        LinearLayout.LayoutParams r93 = new LinearLayout.LayoutParams(-1, -2);
        r93.setMargins(0, 0, 0, AbstractC0295Gu.m616i(16));
        r8.setLayoutParams(r93);
        r8.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16));
        Activity r12 = r21.f7481c;
        if (r12 != null) goto L21;
        AbstractC0295Gu.m625r(-820884214380597L);
        r12 = null;
    L21:
        LinearLayout r94 = new LinearLayout(r12);
        r94.setOrientation(0);
        r94.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        Activity r14 = r21.f7481c;
        if (r14 != null) goto L24;
        AbstractC0295Gu.m625r(-820922869086261L);
        r14 = null;
    L24:
        TextView r122 = new TextView(r14);
        r122.setText("v" + r7.getVersion());
        r122.setTextSize(18.0f);
        Activity r142 = r21.f7481c;
        if (r142 != null) goto L27;
        AbstractC0295Gu.m625r(-820961523791925L);
        r142 = null;
    L27:
        r122.setTextColor(r142.getColor(R.color.textTitle));
        r122.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        r94.addView(r122);
        Activity r143 = r21.f7481c;
        if (r143 != null) goto L30;
        AbstractC0295Gu.m625r(-821000178497589L);
        r143 = null;
    L30:
        TextView r123 = new TextView(r143);
        r123.setText(r7.getType().getLabel());
        r123.setTextSize(12.0f);
        Activity r6 = r21.f7481c;
        if (r6 != null) goto L33;
        AbstractC0295Gu.m625r(-821038833203253L);
        r6 = null;
    L33:
        r123.setTextColor(r6.getColor(R.color.white));
        r123.setPadding(AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(4), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(4));
        GradientDrawable r62 = new GradientDrawable();
        r62.setColor(Color.parseColor(AbstractC0085Bz.m133K(r7.getType().getColor(), AbstractC0295Gu.m625r(-819428220467253L), AbstractC0295Gu.m625r(-819441105369141L))));
        r62.setCornerRadius(AbstractC0295Gu.m616i(4));
        r123.setBackground(r62);
        LinearLayout.LayoutParams r63 = new LinearLayout.LayoutParams(-2, -2);
        r63.setMarginStart(AbstractC0295Gu.m616i(8));
        r63.gravity = 16;
        r123.setLayoutParams(r63);
        r94.addView(r123);
        Activity r102 = r21.f7481c;
        if (r102 != null) goto L36;
        AbstractC0295Gu.m625r(-819449695303733L);
        r102 = null;
    L36:
        View r64 = new View(r102);
        r64.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        r94.addView(r64);
        Activity r103 = r21.f7481c;
        if (r103 != null) goto L39;
        AbstractC0295Gu.m625r(-819488350009397L);
        r103 = null;
    L39:
        TextView r65 = new TextView(r103);
        r65.setText(r7.getDate());
        r65.setTextSize(12.0f);
        Activity r104 = r21.f7481c;
        if (r104 != null) goto L42;
        AbstractC0295Gu.m625r(-819527004715061L);
        r104 = null;
    L42:
        r65.setTextColor(r104.getColor(R.color.textSecondary));
        LinearLayout.LayoutParams r105 = new LinearLayout.LayoutParams(-2, -2);
        r105.gravity = 16;
        r65.setLayoutParams(r105);
        r94.addView(r65);
        r8.addView(r94);
        Iterator<T> r66 = r7.getChanges().iterator();
    L44:
        if (r66.hasNext() == false) goto L61;
        Change r72 = (Change) r66.next();
        Activity r106 = r21.f7481c;
        if (r106 != null) goto L48;
        AbstractC0295Gu.m625r(-819565659420725L);
        r106 = null;
    L48:
        LinearLayout r95 = new LinearLayout(r106);
        r95.setOrientation(0);
        LinearLayout.LayoutParams r107 = new LinearLayout.LayoutParams(-1, -2);
        r107.setMargins(0, AbstractC0295Gu.m616i(8), 0, 0);
        r95.setLayoutParams(r107);
        Activity r144 = r21.f7481c;
        if (r144 != null) goto L51;
        AbstractC0295Gu.m625r(-819604314126389L);
        r144 = null;
    L51:
        TextView r108 = new TextView(r144);
        r108.setText(r72.getType().getIcon());
        r108.setTextSize(16.0f);
        Activity r145 = r21.f7481c;
        if (r145 != null) goto L54;
        AbstractC0295Gu.m625r(-819642968832053L);
        r145 = null;
    L54:
        r108.setTextColor(r145.getColor(R.color.textTitle));
        r108.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        r95.addView(r108);
        Activity r146 = r21.f7481c;
        if (r146 != null) goto L57;
        AbstractC0295Gu.m625r(-819681623537717L);
        r146 = null;
    L57:
        TextView r109 = new TextView(r146);
        r109.setText(r72.getDescription());
        r109.setTextSize(14.0f);
        Activity r73 = r21.f7481c;
        if (r73 != null) goto L60;
        AbstractC0295Gu.m625r(-819170522429493L);
        r73 = null;
    L60:
        r109.setTextColor(r73.getColor(R.color.textTitle));
        LinearLayout.LayoutParams r74 = new LinearLayout.LayoutParams(-2, -2);
        r74.setMarginStart(AbstractC0295Gu.m616i(8));
        r109.setLayoutParams(r74);
        r95.addView(r109);
        r8.addView(r95);
        goto L44
    L61:
        ViewGroup r67 = r21.f7479a;
        if (r67 != null) goto L64;
        AbstractC0295Gu.m625r(-819209177135157L);
        r67 = null;
    L64:
        r67.addView(r8);
        goto L11
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: b */
    public final void mo1337b() {
        AbstractC0295Gu.m625r(-819389565761589L);
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: c */
    public final void mo1338c(Activity r1, int r2, int r3, Intent r4) {
        AbstractC0295Gu.m625r(-819977976281141L);
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: d */
    public final void mo1339d(Activity r6) {
        AbstractC0295Gu.m625r(-821171977189429L);
        this.f7481c = r6;
        ScrollView r0 = new ScrollView(r6);
        r0.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        r0.setBackgroundColor(r6.getColor(R.color.colorBackground));
        this.f7480b = r0;
        LinearLayout r02 = new LinearLayout(r6);
        r02.setOrientation(1);
        LinearLayout.LayoutParams r62 = new LinearLayout.LayoutParams(-1, -2);
        r02.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16));
        r02.setLayoutParams(r62);
        this.f7479a = r02;
        ScrollView r63 = this.f7480b;
        if (r63 != null) goto L5;
        AbstractC0295Gu.m625r(-821210631895093L);
        r63 = null;
    L5:
        LinearLayout r1 = this.f7479a;
        if (r1 != null) goto L8;
        AbstractC0295Gu.m625r(-821257876535349L);
        r1 = null;
    L8:
        r63.addView(r1);
        C1498hd r64 = AbstractC1499he.f5282a;
        AbstractC0585Nj.m1128G(AbstractC0671Pj.m1343a(AbstractC1106Zp.f3500a), new C2170l(this, null, 7), 3);
    }

    /* JADX INFO: renamed from: e */
    public final void m4318e(String r5) {
        LinearLayout r0 = this.f7479a;
        ViewGroup r1 = null;
        if (r0 != null) goto L5;
        AbstractC0295Gu.m625r(-819243536873525L);
        r0 = null;
    L5:
        r0.removeAllViews();
        Activity r2 = this.f7481c;
        if (r2 != null) goto L8;
        AbstractC0295Gu.m625r(-819277896611893L);
        r2 = null;
    L8:
        TextView r02 = new TextView(r2);
        r02.setText(r5);
        r02.setTextSize(14.0f);
        Activity r52 = this.f7481c;
        if (r52 != null) goto L11;
        AbstractC0295Gu.m625r(-819316551317557L);
        r52 = null;
    L11:
        r02.setTextColor(r52.getColor(R.color.textSecondary));
        r02.setGravity(17);
        LinearLayout.LayoutParams r53 = new LinearLayout.LayoutParams(-1, -2);
        r53.setMargins(0, AbstractC0295Gu.m616i(32), 0, 0);
        r02.setLayoutParams(r53);
        LinearLayout r54 = this.f7479a;
        if (r54 != null) goto L14;
        AbstractC0295Gu.m625r(-819355206023221L);
    L15:
        r1.addView(r02);
        return;
    L14:
        r1 = r54;
        goto L15
    }

    @Override // p000.InterfaceC0972Wk
    public final View getContentView() {
        ScrollView r0 = this.f7480b;
        if (r0 != null) goto L6;
        AbstractC0295Gu.m625r(-820016630986805L);
        return null;
    L6:
        return r0;
    }

    @Override // p000.InterfaceC0972Wk
    public final String getTitle() {
        return AbstractC0295Gu.m625r(-820063875627061L);
    }
}
