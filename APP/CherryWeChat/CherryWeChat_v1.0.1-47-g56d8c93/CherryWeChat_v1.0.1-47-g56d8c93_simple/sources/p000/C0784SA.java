package p000;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import io.github.cherrywechat.R;

/* JADX INFO: renamed from: SA */
/* JADX INFO: loaded from: classes.dex */
public final class C0784SA implements InterfaceC0972Wk {

    /* JADX INFO: renamed from: a */
    public FrameLayout f2474a;

    /* JADX INFO: renamed from: b */
    public String f2475b;

    /* JADX INFO: renamed from: c */
    public RecyclerView f2476c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f2477d;

    /* JADX INFO: renamed from: e */
    public TextView f2478e;

    /* JADX INFO: renamed from: f */
    public TextView f2479f;

    /* JADX INFO: renamed from: g */
    public TextView f2480g;

    /* JADX INFO: renamed from: h */
    public ProgressBar f2481h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f2482i;

    /* JADX INFO: renamed from: j */
    public NestedScrollView f2483j;

    /* JADX INFO: renamed from: a */
    public static final void m1603a(C0784SA r7) {
        ProgressBar r0 = r7.f2481h;
        if (r0 == null) goto L5;
        r0.setVisibility(8);
    L5:
        LinearLayout r02 = r7.f2482i;
        if (r02 == null) goto L8;
        r02.setVisibility(8);
    L8:
        NestedScrollView r03 = r7.f2483j;
        if (r03 == null) goto L11;
        r03.setAlpha(0.0f);
        r03.setVisibility(0);
        r03.animate().alpha(1.0f).setDuration(300).setInterpolator(new DecelerateInterpolator()).start();
    L11:
        LinearLayout r72 = r7.f2477d;
        if (r72 == null) goto L15;
        r72.setAlpha(0.0f);
        r72.setVisibility(0);
        r72.animate().alpha(1.0f).setDuration(300).setStartDelay(150).setInterpolator(new DecelerateInterpolator()).start();
        return;
    }

    /* JADX INFO: renamed from: e */
    public static final void m1604e(C0784SA r3) {
        ProgressBar r0 = r3.f2481h;
        if (r0 == null) goto L5;
        r0.setVisibility(8);
    L5:
        LinearLayout r02 = r3.f2482i;
        if (r02 == null) goto L8;
        r02.setVisibility(0);
    L8:
        NestedScrollView r03 = r3.f2483j;
        if (r03 == null) goto L11;
        r03.setVisibility(8);
    L11:
        LinearLayout r32 = r3.f2477d;
        if (r32 == null) goto L15;
        r32.setVisibility(8);
        return;
    }

    /* JADX INFO: renamed from: f */
    public static GradientDrawable m1605f(Activity r3) {
        GradientDrawable r0 = new GradientDrawable();
        r0.setColor(r3.getColor(R.color.cardBackground));
        r0.setCornerRadius(AbstractC0295Gu.m616i(20));
        r0.setStroke(AbstractC0295Gu.m616i(1), r3.getColor(R.color.cardStroke));
        return r0;
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: b */
    public final void mo1337b() {
        AbstractC0295Gu.m625r(-490184617490485L);
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: c */
    public final void mo1338c(Activity r3, int r4, int r5, Intent r6) {
        AbstractC0295Gu.m625r(-490223272196149L);
        if (r4 == 10086) goto L5;
        return;
    L5:
        if (r5 != (-1)) goto L9;
        Toast.makeText(r3, AbstractC0295Gu.m625r(-490261926901813L), 1).show();
        return;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: d */
    public final void mo1339d(Activity r21) {
        AbstractC0295Gu.m625r(-490635589056565L);
        this.f2475b = r21.getIntent().getStringExtra(AbstractC0295Gu.m625r(-491223999576117L));
        FrameLayout r8 = new FrameLayout(r21);
        r8.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        r8.setBackgroundColor(r21.getColor(R.color.colorBackground));
        this.f2474a = r8;
        ProgressBar r82 = new ProgressBar(r21);
        r82.setLayoutParams(new FrameLayout.LayoutParams(AbstractC0295Gu.m616i(60), AbstractC0295Gu.m616i(60), 17));
        r82.setIndeterminate(true);
        this.f2481h = r82;
        FrameLayout r11 = this.f2474a;
        if (r11 == null) goto L5;
        r11.addView(r82);
    L5:
        LinearLayout r83 = new LinearLayout(r21);
        r83.setOrientation(1);
        r83.setGravity(17);
        r83.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        r83.setVisibility(8);
        r83.setPadding(AbstractC0295Gu.m616i(40), AbstractC0295Gu.m616i(40), AbstractC0295Gu.m616i(40), AbstractC0295Gu.m616i(40));
        TextView r112 = new TextView(r21);
        r112.setText(AbstractC0295Gu.m625r(-491284129118261L));
        r112.setTextSize(48.0f);
        r112.setGravity(17);
        LinearLayout.LayoutParams r12 = new LinearLayout.LayoutParams(-2, -2);
        r12.bottomMargin = AbstractC0295Gu.m616i(16);
        r112.setLayoutParams(r12);
        r83.addView(r112);
        TextView r113 = new TextView(r21);
        r113.setText(AbstractC0295Gu.m625r(-491297014020149L));
        r113.setTextSize(18.0f);
        r113.setGravity(17);
        r113.setTextColor(r21.getColor(R.color.textTitle));
        LinearLayout.LayoutParams r122 = new LinearLayout.LayoutParams(-2, -2);
        r122.bottomMargin = AbstractC0295Gu.m616i(8);
        r113.setLayoutParams(r122);
        r83.addView(r113);
        TextView r114 = new TextView(r21);
        r114.setText(AbstractC0295Gu.m625r(-491318488856629L));
        r114.setTextSize(14.0f);
        r114.setGravity(17);
        r114.setTextColor(r21.getColor(R.color.buttonPrimary));
        GradientDrawable r13 = new GradientDrawable();
        r13.setColor(0);
        r13.setStroke(AbstractC0295Gu.m616i(2), r21.getColor(R.color.buttonPrimary));
        r13.setCornerRadius(AbstractC0295Gu.m616i(12));
        r114.setBackground(r13);
        r114.setPadding(AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(12));
        LinearLayout.LayoutParams r5 = new LinearLayout.LayoutParams(-2, -2);
        r5.topMargin = AbstractC0295Gu.m616i(16);
        r114.setLayoutParams(r5);
        r114.setOnClickListener(new ViewOnClickListenerC2176l5(19, this, r21));
        r83.addView(r114);
        this.f2482i = r83;
        FrameLayout r52 = this.f2474a;
        if (r52 == null) goto L8;
        r52.addView(r83);
    L8:
        NestedScrollView r53 = new NestedScrollView(r21, null);
        FrameLayout.LayoutParams r84 = new FrameLayout.LayoutParams(-1, -1);
        r84.bottomMargin = AbstractC0295Gu.m616i(120);
        r53.setLayoutParams(r84);
        r53.setOverScrollMode(2);
        r53.setVisibility(8);
        this.f2483j = r53;
        LinearLayout r54 = new LinearLayout(r21);
        r54.setOrientation(1);
        r54.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        r54.setPadding(AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20));
        NestedScrollView r85 = this.f2483j;
        if (r85 == null) goto L11;
        r85.addView(r54);
    L11:
        FrameLayout r86 = this.f2474a;
        if (r86 == null) goto L14;
        r86.addView(this.f2483j);
    L14:
        LinearLayout r87 = new LinearLayout(r21);
        r87.setOrientation(1);
        r87.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        r87.setBackground(m1605f(r21));
        r87.setPadding(AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20));
        TextView r9 = new TextView(r21);
        r9.setTextSize(24.0f);
        Typeface r115 = Typeface.DEFAULT_BOLD;
        r9.setTypeface(r115);
        r9.setTextColor(r21.getColor(R.color.textTitle));
        r9.setMaxLines(2);
        TextUtils.TruncateAt r132 = TextUtils.TruncateAt.END;
        r9.setEllipsize(r132);
        r9.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f2478e = r9;
        r87.addView(r9);
        TextView r92 = new TextView(r21);
        r92.setTextSize(14.0f);
        r92.setTextColor(r21.getColor(R.color.textSummary));
        r92.setMaxLines(1);
        r92.setEllipsize(r132);
        LinearLayout.LayoutParams r133 = new LinearLayout.LayoutParams(-1, -2);
        r133.topMargin = AbstractC0295Gu.m616i(8);
        r92.setLayoutParams(r133);
        this.f2479f = r92;
        r87.addView(r92);
        r54.addView(r87);
        LinearLayout r6 = new LinearLayout(r21);
        r6.setOrientation(1);
        LinearLayout.LayoutParams r88 = new LinearLayout.LayoutParams(-1, -2);
        r88.topMargin = AbstractC0295Gu.m616i(24);
        r6.setLayoutParams(r88);
        r6.setBackground(m1605f(r21));
        r6.setPadding(AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20));
        TextView r7 = new TextView(r21);
        r7.setText(AbstractC0295Gu.m625r(-491262654281781L));
        r7.setTextSize(16.0f);
        r7.setTypeface(r115);
        r7.setTextColor(r21.getColor(R.color.textTitle));
        LinearLayout.LayoutParams r89 = new LinearLayout.LayoutParams(-1, -2);
        r89.bottomMargin = AbstractC0295Gu.m616i(12);
        r7.setLayoutParams(r89);
        r6.addView(r7);
        RecyclerView r2 = new RecyclerView(r21);
        r2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        r2.setOverScrollMode(2);
        r2.setLayoutManager(new LinearLayoutManager(0));
        r2.setNestedScrollingEnabled(false);
        this.f2476c = r2;
        r6.addView(r2);
        r54.addView(r6);
        LinearLayout r22 = new LinearLayout(r21);
        r22.setOrientation(1);
        r22.setBackgroundResource(R.color.cardBackground);
        FrameLayout.LayoutParams r55 = new FrameLayout.LayoutParams(-1, -2);
        r55.gravity = 80;
        r22.setLayoutParams(r55);
        r22.setPadding(AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(24));
        r22.setVisibility(8);
        TextView r4 = new TextView(r21);
        r4.setText(AbstractC0295Gu.m625r(-491339963693109L));
        r4.setTextSize(18.0f);
        r4.setTypeface(r115);
        r4.setGravity(17);
        r4.setTextColor(r21.getColor(R.color.buttonTextPrimary));
        GradientDrawable r56 = new GradientDrawable();
        r56.setColors(new int[]{r21.getColor(R.color.buttonPrimary), Color.parseColor(AbstractC0295Gu.m625r(-491361438529589L))});
        r56.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        r56.setCornerRadius(AbstractC0295Gu.m616i(16));
        r4.setBackground(r56);
        r4.setLayoutParams(new LinearLayout.LayoutParams(-1, AbstractC0295Gu.m616i(56)));
        this.f2480g = r4;
        r22.addView(r4);
        this.f2477d = r22;
        FrameLayout r3 = this.f2474a;
        if (r3 == null) goto L17;
        r3.addView(r22);
    L17:
        m1606g(r21);
    }

    /* JADX INFO: renamed from: g */
    public final void m1606g(Activity r8) {
        String r1 = this.f2475b;
        if (r1 != null) goto L5;
        return;
    L5:
        ProgressBar r0 = this.f2481h;
        if (r0 == null) goto L8;
        r0.setVisibility(0);
    L8:
        LinearLayout r02 = this.f2482i;
        if (r02 == null) goto L11;
        r02.setVisibility(8);
    L11:
        NestedScrollView r03 = this.f2483j;
        if (r03 == null) goto L14;
        r03.setVisibility(8);
    L14:
        LinearLayout r04 = this.f2477d;
        if (r04 == null) goto L17;
        r04.setVisibility(8);
    L17:
        C1498hd r05 = AbstractC1499he.f5282a;
        AbstractC0585Nj.m1128G(AbstractC0671Pj.m1343a(AbstractC1106Zp.f3500a), new C1417fk(r1, this, r8, null, 3), 3);
    }

    @Override // p000.InterfaceC0972Wk
    public final View getContentView() {
        return this.f2474a;
    }

    @Override // p000.InterfaceC0972Wk
    public final String getTitle() {
        return AbstractC0295Gu.m625r(-490330646378549L);
    }
}
