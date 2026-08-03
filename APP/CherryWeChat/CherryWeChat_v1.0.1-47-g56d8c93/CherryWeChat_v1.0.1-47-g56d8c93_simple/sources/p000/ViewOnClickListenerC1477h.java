package p000;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import io.github.cherrywechat.R;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: h */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC1477h implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5226a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5227b;

    public /* synthetic */ ViewOnClickListenerC1477h(int r1, Object r2) {
        this.f5226a = r1;
        this.f5227b = r2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r21) {
        int r1 = this.f5226a;
        int r4 = 8;
        final int r5 = 0;
        InterfaceC0190Eb r6 = null;
        final int r7 = 1;
        Object r8 = this.f5227b;
        switch(r1) {
            case 0: goto L77;
            case 1: goto L75;
            case 2: goto L73;
            case 3: goto L65;
            case 4: goto L63;
            case 5: goto L46;
            case 6: goto L36;
            case 7: goto L34;
            case 8: goto L21;
            case 9: goto L16;
            case 10: goto L8;
            case 11: goto L6;
            default: goto L4;
        };
    L4:
        ((AlertDialog) r8).dismiss();
        return;
    L6:
        C1337ds r12 = C1337ds.f4821a;
        Context r2 = ((LinearLayout) r8).getContext();
        AbstractC0295Gu.m625r(-477050607499317L);
        C1337ds.m2592d(r12, r2, 1003);
        return;
    L8:
        C2340oy r82 = (C2340oy) r8;
        if (C2340oy.f8211e == true) goto L81;
        TextView r13 = r82.f8212a;
        if (r13 != null) goto L14;
        AbstractC0295Gu.m625r(-476595340965941L);
        r13 = null;
    L14:
        r13.setText(AbstractC0295Gu.m625r(-476101419726901L));
        r13.setClickable(false);
        r13.setAlpha(0.6f);
        GradientDrawable r22 = new GradientDrawable();
        r22.setColor(-6381922);
        r22.setCornerRadius(AbstractC0295Gu.m616i(8));
        r13.setBackground(r22);
        C2340oy.f8211e = true;
        C1498hd r14 = AbstractC1499he.f5282a;
        AbstractC0585Nj.m1128G(AbstractC0671Pj.m1343a(AbstractC1106Zp.f3500a), new C2297ny(r82, r6, r7), 3);
        return;
    L81:
        return;
    L16:
        C1337ds r15 = C1337ds.f4821a;
        Context r23 = ((FrameLayout) r8).getContext();
        AbstractC0295Gu.m625r(-91873645426741L);
        Context r3 = r21.getContext();
        AbstractC0295Gu.m625r(-91942364903477L);
        AbstractC0295Gu.m625r(-44882408241205L);
        C1036Y4.f3308a.getClass();
        if (C1036Y4.m1983b(r3) == false) goto L19;
        r7 = 1007;
    L19:
        C1337ds.m2592d(r15, r23, r7);
        return;
    L21:
        C0509Lt r83 = (C0509Lt) r8;
        EditText r16 = r83.f1666f;
        if (r16 == null) goto L82;
        int r17 = r16.getSelectionEnd();
        EditText r24 = r83.f1666f;
        if (r24 != null) goto L27;
    L29:
        r83.f1666f.setTransformationMethod(PasswordTransformationMethod.getInstance());
    L30:
        if (r17 < 0) goto L32;
        r83.f1666f.setSelection(r17);
    L32:
        r83.m2348p();
        return;
    L27:
        if ((r24.getTransformationMethod() instanceof PasswordTransformationMethod) == false) goto L29;
        r83.f1666f.setTransformationMethod(null);
        goto L30
    L82:
        return;
    L34:
        ((C0806Sq) r8).m1613D();
        throw null;
    L36:
        final C2112jq r9 = (C2112jq) r8;
        ScrollView r18 = new ScrollView(r9.getContext());
        r18.setPadding(AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(16));
        LinearLayout r10 = new LinearLayout(r9.getContext());
        r10.setOrientation(1);
        LinearLayout r122 = new LinearLayout(r9.getContext());
        r122.setOrientation(1);
        int r132 = C2112jq.m4304g(r122.getContext().getColor(R.color.colorWarning), 0.08f);
        GradientDrawable r152 = new GradientDrawable();
        r152.setColor(r132);
        r152.setCornerRadius(AbstractC0295Gu.m616i(16));
        r152.setStroke(AbstractC0295Gu.m616i(3), C2112jq.m4304g(r122.getContext().getColor(R.color.colorWarning), 0.4f));
        r122.setBackground(r152);
        r122.setPadding(AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(18), AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(18));
        LinearLayout.LayoutParams r42 = new LinearLayout.LayoutParams(-1, -2);
        r42.bottomMargin = AbstractC0295Gu.m616i(20);
        r122.setLayoutParams(r42);
        LinearLayout r32 = new LinearLayout(r122.getContext());
        r32.setOrientation(0);
        r32.setGravity(16);
        TextView r43 = new TextView(r32.getContext());
        r43.setText(AbstractC0295Gu.m625r(-822786884892725L));
        r43.setTextSize(18.0f);
        r43.setPadding(0, 0, AbstractC0295Gu.m616i(8), 0);
        r32.addView(r43);
        TextView r44 = new TextView(r32.getContext());
        r44.setText(AbstractC0295Gu.m625r(-822799769794613L));
        r44.setTextSize(16.0f);
        r44.setTextColor(r44.getContext().getColor(R.color.colorWarning));
        Typeface r142 = Typeface.DEFAULT_BOLD;
        r44.setTypeface(r142);
        r32.addView(r44);
        r122.addView(r32);
        TextView r33 = new TextView(r122.getContext());
        r33.setText(AbstractC0295Gu.m625r(-822821244631093L));
        r33.setTextSize(13.0f);
        r33.setTextColor(r33.getContext().getColor(R.color.textSummary));
        r33.setLineSpacing(8.0f, 1.0f);
        r33.setPadding(0, AbstractC0295Gu.m616i(10), 0, 0);
        r122.addView(r33);
        r10.addView(r122);
        r10.addView(r9.m4306i(AbstractC0295Gu.m625r(-824101144885301L), AbstractC0295Gu.m625r(-824114029787189L), AbstractC0295Gu.m625r(-824135504623669L), r9.getContext().getColor(R.color.colorPrimary), AbstractC0295Gu.m625r(-824182749263925L), new C1292cq(r9, r5)));
        r10.addView(r9.m4306i(AbstractC0295Gu.m625r(-824195634165813L), AbstractC0295Gu.m625r(-824208519067701L), AbstractC0295Gu.m625r(-824229993904181L), r9.getContext().getColor(R.color.colorSuccess), AbstractC0295Gu.m625r(-824268648609845L), new C1292cq(r9, r7)));
        final int r72 = 2;
        r10.addView(r9.m4306i(AbstractC0295Gu.m625r(-824281533511733L), AbstractC0295Gu.m625r(-824294418413621L), AbstractC0295Gu.m625r(-824320188217397L), r9.getContext().getColor(R.color.colorInfo), AbstractC0295Gu.m625r(-822713870448693L), new C1292cq(r9, r72)));
        r18.addView(r10);
        AlertDialog r19 = new AlertDialog.Builder(r9.getContext(), android.R.style.Theme.Material.Light.Dialog.Alert).setTitle(AbstractC0295Gu.m625r(-822726755350581L)).setView(r18).setPositiveButton(AbstractC0295Gu.m625r(-822773999990837L), null).create();
        r19.show();
        TextView r34 = (TextView) r19.findViewById(android.R.id.title);
        if (r34 == null) goto L39;
        r34.setTextSize(18.0f);
        r34.setTextColor(r34.getContext().getColor(R.color.textTitle));
        r34.setTypeface(r142);
        r34.setPadding(AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(16));
    L39:
        Button r25 = r19.getButton(-1);
        if (r25 == null) goto L42;
        r25.setTextColor(r25.getContext().getColor(R.color.colorPrimary));
        r25.setTextSize(16.0f);
        r25.setAllCaps(false);
    L42:
        Window r110 = r19.getWindow();
        if (r110 == null) goto L83;
        GradientDrawable r26 = new GradientDrawable();
        r26.setColor(r110.getContext().getColor(R.color.colorForeground));
        r26.setCornerRadius(AbstractC0295Gu.m616i(16));
        r110.setBackgroundDrawable(r26);
        r110.setLayout((int) (((double) r110.getContext().getResources().getDisplayMetrics().widthPixels) * 0.9d), -2);
        r110.setDimAmount(0.5f);
        return;
    L83:
        return;
    L46:
        int r35 = 0;
        C0625Og r84 = (C0625Og) r8;
        C0185EC r111 = r84.f1998j;
        if (r111 == null) goto L84;
        C1258ca r45 = r84.f1989a;
        String r112 = r111.f549a;
        r45.getClass();
        AbstractC0295Gu.m625r(-487719306262581L);
        LinkedHashMap r52 = r45.f4262b;
        Boolean r62 = (Boolean) r52.get(r112);
        if (r62 == null) goto L51;
        boolean r63 = r62.booleanValue();
    L52:
        r52.put(r112, Boolean.valueOf(!r63));
        Iterator r53 = r45.f4264d.iterator();
    L54:
        if (r53.hasNext() == false) goto L59;
        if (AbstractC0585Nj.m1134a(((C0185EC) r53.next()).f549a, r112) == true) goto L60;
        r35 = r35 + 1;
    L60:
        if (r35 == (-1)) goto L85;
        r45.notifyItemChanged(r35);
        return;
    L85:
        return;
    L59:
        r35 = -1;
        goto L60
    L51:
        r63 = false;
        goto L52
    L84:
        return;
    L63:
        ((C0494Le) r8).m960t();
        return;
    L65:
        C0569N9 r85 = (C0569N9) r8;
        EditText r113 = r85.f1857i;
        if (r113 == null) goto L86;
        Editable r114 = r113.getText();
        if (r114 == null) goto L71;
        r114.clear();
    L71:
        r85.m2348p();
        return;
    L86:
        return;
    L73:
        ViewOnClickListenerC0996X7 r86 = (ViewOnClickListenerC0996X7) r8;
        Context r115 = r86.getContext();
        AbstractC0295Gu.m625r(-497455997122613L);
        C1456gf.m2798P(r115, AbstractC0295Gu.m625r(-497524716599349L), null, AbstractC0295Gu.m625r(-497005025556533L), new C0132D2(r4, r86));
        return;
    L75:
        ((ImageView) r8).performClick();
        return;
    L77:
        ((C2078j) r8).f7337c.mo6a();
    }
}
