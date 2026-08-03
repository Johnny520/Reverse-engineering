package p000;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
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
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: h */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC1477h implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5226a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5227b;

    public /* synthetic */ ViewOnClickListenerC1477h(int i, Object obj) {
        this.f5226a = i;
        this.f5227b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f5226a;
        int i2 = 8;
        final int i3 = 0;
        InterfaceC0190Eb interfaceC0190Eb = null;
        Object obj = this.f5227b;
        switch (i) {
            case 0:
                ((C2078j) obj).f7337c.mo6a();
                return;
            case 1:
                ((ImageView) obj).performClick();
                return;
            case 2:
                ViewOnClickListenerC0996X7 viewOnClickListenerC0996X7 = (ViewOnClickListenerC0996X7) obj;
                Context context = viewOnClickListenerC0996X7.getContext();
                AbstractC0295Gu.m625r(-497455997122613L);
                C1456gf.m2798P(context, AbstractC0295Gu.m625r(-497524716599349L), null, AbstractC0295Gu.m625r(-497005025556533L), new C0132D2(i2, viewOnClickListenerC0996X7));
                return;
            case 3:
                C0569N9 c0569n9 = (C0569N9) obj;
                EditText editText = c0569n9.f1857i;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                c0569n9.m2348p();
                return;
            case 4:
                ((C0494Le) obj).m960t();
                return;
            case 5:
                int i4 = 0;
                C0625Og c0625Og = (C0625Og) obj;
                C0185EC c0185ec = c0625Og.f1998j;
                if (c0185ec != null) {
                    C1258ca c1258ca = c0625Og.f1989a;
                    String str = c0185ec.f549a;
                    c1258ca.getClass();
                    AbstractC0295Gu.m625r(-487719306262581L);
                    LinkedHashMap linkedHashMap = c1258ca.f4262b;
                    linkedHashMap.put(str, Boolean.valueOf(!(((Boolean) linkedHashMap.get(str)) != null ? r6.booleanValue() : false)));
                    Iterator it = c1258ca.f4264d.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i4 = -1;
                        } else if (!AbstractC0585Nj.m1134a(((C0185EC) it.next()).f549a, str)) {
                            i4++;
                        }
                    }
                    if (i4 != -1) {
                        c1258ca.notifyItemChanged(i4);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                final C2112jq c2112jq = (C2112jq) obj;
                ScrollView scrollView = new ScrollView(c2112jq.getContext());
                scrollView.setPadding(AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(16));
                LinearLayout linearLayout = new LinearLayout(c2112jq.getContext());
                linearLayout.setOrientation(1);
                LinearLayout linearLayout2 = new LinearLayout(c2112jq.getContext());
                linearLayout2.setOrientation(1);
                int iM4304g = C2112jq.m4304g(linearLayout2.getContext().getColor(R.color.colorWarning), 0.08f);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(iM4304g);
                gradientDrawable.setCornerRadius(AbstractC0295Gu.m616i(16));
                gradientDrawable.setStroke(AbstractC0295Gu.m616i(3), C2112jq.m4304g(linearLayout2.getContext().getColor(R.color.colorWarning), 0.4f));
                linearLayout2.setBackground(gradientDrawable);
                linearLayout2.setPadding(AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(18), AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(18));
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.bottomMargin = AbstractC0295Gu.m616i(20);
                linearLayout2.setLayoutParams(layoutParams);
                LinearLayout linearLayout3 = new LinearLayout(linearLayout2.getContext());
                linearLayout3.setOrientation(0);
                linearLayout3.setGravity(16);
                TextView textView = new TextView(linearLayout3.getContext());
                textView.setText(AbstractC0295Gu.m625r(-822786884892725L));
                textView.setTextSize(18.0f);
                textView.setPadding(0, 0, AbstractC0295Gu.m616i(8), 0);
                linearLayout3.addView(textView);
                TextView textView2 = new TextView(linearLayout3.getContext());
                textView2.setText(AbstractC0295Gu.m625r(-822799769794613L));
                textView2.setTextSize(16.0f);
                textView2.setTextColor(textView2.getContext().getColor(R.color.colorWarning));
                Typeface typeface = Typeface.DEFAULT_BOLD;
                textView2.setTypeface(typeface);
                linearLayout3.addView(textView2);
                linearLayout2.addView(linearLayout3);
                TextView textView3 = new TextView(linearLayout2.getContext());
                textView3.setText(AbstractC0295Gu.m625r(-822821244631093L));
                textView3.setTextSize(13.0f);
                textView3.setTextColor(textView3.getContext().getColor(R.color.textSummary));
                textView3.setLineSpacing(8.0f, 1.0f);
                textView3.setPadding(0, AbstractC0295Gu.m616i(10), 0, 0);
                linearLayout2.addView(textView3);
                linearLayout.addView(linearLayout2);
                linearLayout.addView(c2112jq.m4306i(AbstractC0295Gu.m625r(-824101144885301L), AbstractC0295Gu.m625r(-824114029787189L), AbstractC0295Gu.m625r(-824135504623669L), c2112jq.getContext().getColor(R.color.colorPrimary), AbstractC0295Gu.m625r(-824182749263925L), new InterfaceC0884Ui() { // from class: cq
                    @Override // p000.InterfaceC0884Ui
                    /* JADX INFO: renamed from: a */
                    public final Object mo6a() {
                        switch (i3) {
                            case 0:
                                c2112jq.m4308k(AbstractC0295Gu.m625r(-822430402607157L));
                                break;
                            case 1:
                                c2112jq.m4308k(AbstractC0295Gu.m625r(-822018085746741L));
                                break;
                            default:
                                c2112jq.m4308k(AbstractC0295Gu.m625r(-822138344831029L));
                                break;
                        }
                        return C0829TC.f2620a;
                    }
                }));
                linearLayout.addView(c2112jq.m4306i(AbstractC0295Gu.m625r(-824195634165813L), AbstractC0295Gu.m625r(-824208519067701L), AbstractC0295Gu.m625r(-824229993904181L), c2112jq.getContext().getColor(R.color.colorSuccess), AbstractC0295Gu.m625r(-824268648609845L), new InterfaceC0884Ui() { // from class: cq
                    @Override // p000.InterfaceC0884Ui
                    /* JADX INFO: renamed from: a */
                    public final Object mo6a() {
                        switch (i) {
                            case 0:
                                c2112jq.m4308k(AbstractC0295Gu.m625r(-822430402607157L));
                                break;
                            case 1:
                                c2112jq.m4308k(AbstractC0295Gu.m625r(-822018085746741L));
                                break;
                            default:
                                c2112jq.m4308k(AbstractC0295Gu.m625r(-822138344831029L));
                                break;
                        }
                        return C0829TC.f2620a;
                    }
                }));
                final int i5 = 2;
                linearLayout.addView(c2112jq.m4306i(AbstractC0295Gu.m625r(-824281533511733L), AbstractC0295Gu.m625r(-824294418413621L), AbstractC0295Gu.m625r(-824320188217397L), c2112jq.getContext().getColor(R.color.colorInfo), AbstractC0295Gu.m625r(-822713870448693L), new InterfaceC0884Ui() { // from class: cq
                    @Override // p000.InterfaceC0884Ui
                    /* JADX INFO: renamed from: a */
                    public final Object mo6a() {
                        switch (i5) {
                            case 0:
                                c2112jq.m4308k(AbstractC0295Gu.m625r(-822430402607157L));
                                break;
                            case 1:
                                c2112jq.m4308k(AbstractC0295Gu.m625r(-822018085746741L));
                                break;
                            default:
                                c2112jq.m4308k(AbstractC0295Gu.m625r(-822138344831029L));
                                break;
                        }
                        return C0829TC.f2620a;
                    }
                }));
                scrollView.addView(linearLayout);
                AlertDialog alertDialogCreate = new AlertDialog.Builder(c2112jq.getContext(), android.R.style.Theme.Material.Light.Dialog.Alert).setTitle(AbstractC0295Gu.m625r(-822726755350581L)).setView(scrollView).setPositiveButton(AbstractC0295Gu.m625r(-822773999990837L), (DialogInterface.OnClickListener) null).create();
                alertDialogCreate.show();
                TextView textView4 = (TextView) alertDialogCreate.findViewById(android.R.id.title);
                if (textView4 != null) {
                    textView4.setTextSize(18.0f);
                    textView4.setTextColor(textView4.getContext().getColor(R.color.textTitle));
                    textView4.setTypeface(typeface);
                    textView4.setPadding(AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(16));
                }
                Button button = alertDialogCreate.getButton(-1);
                if (button != null) {
                    button.setTextColor(button.getContext().getColor(R.color.colorPrimary));
                    button.setTextSize(16.0f);
                    button.setAllCaps(false);
                }
                Window window = alertDialogCreate.getWindow();
                if (window != null) {
                    GradientDrawable gradientDrawable2 = new GradientDrawable();
                    gradientDrawable2.setColor(window.getContext().getColor(R.color.colorForeground));
                    gradientDrawable2.setCornerRadius(AbstractC0295Gu.m616i(16));
                    window.setBackgroundDrawable(gradientDrawable2);
                    window.setLayout((int) (((double) window.getContext().getResources().getDisplayMetrics().widthPixels) * 0.9d), -2);
                    window.setDimAmount(0.5f);
                    return;
                }
                return;
            case 7:
                ((C0806Sq) obj).m1613D();
                throw null;
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                C0509Lt c0509Lt = (C0509Lt) obj;
                EditText editText2 = c0509Lt.f1666f;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = c0509Lt.f1666f;
                if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    c0509Lt.f1666f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    c0509Lt.f1666f.setTransformationMethod(null);
                }
                if (selectionEnd >= 0) {
                    c0509Lt.f1666f.setSelection(selectionEnd);
                }
                c0509Lt.m2348p();
                return;
            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                C1337ds c1337ds = C1337ds.f4821a;
                Context context2 = ((FrameLayout) obj).getContext();
                AbstractC0295Gu.m625r(-91873645426741L);
                Context context3 = view.getContext();
                AbstractC0295Gu.m625r(-91942364903477L);
                AbstractC0295Gu.m625r(-44882408241205L);
                C1036Y4.f3308a.getClass();
                C1337ds.m2592d(c1337ds, context2, C1036Y4.m1983b(context3) ? 1007 : 1);
                return;
            case 10:
                C2340oy c2340oy = (C2340oy) obj;
                if (C2340oy.f8211e) {
                    return;
                }
                TextView textView5 = c2340oy.f8212a;
                if (textView5 == null) {
                    AbstractC0295Gu.m625r(-476595340965941L);
                    textView5 = null;
                }
                textView5.setText(AbstractC0295Gu.m625r(-476101419726901L));
                textView5.setClickable(false);
                textView5.setAlpha(0.6f);
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setColor(-6381922);
                gradientDrawable3.setCornerRadius(AbstractC0295Gu.m616i(8));
                textView5.setBackground(gradientDrawable3);
                C2340oy.f8211e = true;
                C1498hd c1498hd = AbstractC1499he.f5282a;
                AbstractC0585Nj.m1128G(AbstractC0671Pj.m1343a(AbstractC1106Zp.f3500a), new C2297ny(c2340oy, interfaceC0190Eb, i), 3);
                return;
            case 11:
                C1337ds c1337ds2 = C1337ds.f4821a;
                Context context4 = ((LinearLayout) obj).getContext();
                AbstractC0295Gu.m625r(-477050607499317L);
                C1337ds.m2592d(c1337ds2, context4, 1003);
                return;
            default:
                ((AlertDialog) obj).dismiss();
                return;
        }
    }
}
