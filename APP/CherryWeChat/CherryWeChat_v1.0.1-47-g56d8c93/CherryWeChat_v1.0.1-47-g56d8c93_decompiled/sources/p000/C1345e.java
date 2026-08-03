package p000;

import android.R;
import android.app.AlertDialog;
import android.app.AndroidAppHelper;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.bumptech.glide.ComponentCallbacks2C1273a;
import de.robv.android.xposed.XposedBridge;
import io.github.cherrywechat.application.MainApplication;
import io.github.cherrywechat.network.model.Developer;

/* JADX INFO: renamed from: e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1345e implements InterfaceC0884Ui {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4839a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2213m f4840b;

    public /* synthetic */ C1345e(C2213m c2213m, int i) {
        this.f4839a = i;
        this.f4840b = c2213m;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x040a  */
    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo6a() {
        Integer num;
        switch (this.f4839a) {
            case 0:
                AlertDialog.Builder title = new AlertDialog.Builder(this.f4840b.getContext(), R.style.Theme.Material.Light.Dialog.Alert).setTitle(AbstractC0295Gu.m625r(-816060966107189L));
                StringBuilder sb = new StringBuilder();
                sb.append(AbstractC0295Gu.m625r(-816091030878261L));
                sb.append(XposedBridge.getXposedVersion());
                sb.append(AbstractC0295Gu.m625r(-815017289054261L));
                sb.append(AbstractC0295Gu.m625r(AbstractC1450gG.f5073g.isEmpty() ? -815214857549877L : -815227742451765L));
                sb.append(AbstractC0295Gu.m625r(-815240627353653L));
                AlertDialog alertDialogCreate = title.setMessage(AbstractC2607uz.m5118D(sb.toString())).setPositiveButton(AbstractC0295Gu.m625r(-814751001081909L), (DialogInterface.OnClickListener) null).create();
                alertDialogCreate.show();
                C2213m.m4449k(alertDialogCreate);
                break;
            case 1:
                AlertDialog.Builder title2 = new AlertDialog.Builder(this.f4840b.getContext(), R.style.Theme.Material.Light.Dialog.Alert).setTitle(AbstractC0295Gu.m625r(-814763885983797L));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(AbstractC0295Gu.m625r(-814793950754869L));
                AbstractC2374ph.m4817n(sb2, AbstractC1450gG.f5068b, -815012994086965L);
                Context contextCurrentApplication = MainApplication.f5549a;
                if (contextCurrentApplication == null && (contextCurrentApplication = C1456gf.f5172p) == null) {
                    contextCurrentApplication = AndroidAppHelper.currentApplication();
                    AbstractC0295Gu.m625r(-836852902787125L);
                }
                String str = contextCurrentApplication.getApplicationInfo().packageName;
                AbstractC0295Gu.m625r(-837656061671477L);
                AbstractC2374ph.m4817n(sb2, str, -815687303952437L);
                sb2.append(AbstractC0295Gu.m625r(AbstractC1450gG.f5073g.isEmpty() ? -815489735456821L : -815502620358709L));
                sb2.append(AbstractC0295Gu.m625r(-815515505260597L));
                AlertDialog alertDialogCreate2 = title2.setMessage(AbstractC2607uz.m5118D(sb2.toString())).setPositiveButton(AbstractC0295Gu.m625r(-813926367361077L), (DialogInterface.OnClickListener) null).create();
                alertDialogCreate2.show();
                C2213m.m4449k(alertDialogCreate2);
                break;
            case 2:
                C2227mD c2227mD = C2227mD.f7746a;
                Context context = this.f4840b.getContext();
                AbstractC0295Gu.m625r(-814686576572469L);
                c2227mD.getClass();
                AbstractC0295Gu.m625r(-463053309081653L);
                C2227mD.m4484c(context, true);
                break;
            default:
                Integer num2 = 12;
                Integer num3 = 40;
                final C2213m c2213m = this.f4840b;
                ScrollView scrollView = new ScrollView(c2213m.getContext());
                scrollView.setLayoutParams(new LinearLayout.LayoutParams(-1, Math.min((int) (((double) scrollView.getContext().getResources().getDisplayMetrics().heightPixels) * 0.6d), -2)));
                int i = 0;
                scrollView.setVerticalScrollBarEnabled(false);
                scrollView.setOverScrollMode(2);
                LinearLayout linearLayout = new LinearLayout(c2213m.getContext());
                linearLayout.setOrientation(1);
                linearLayout.setPadding(AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(16));
                TextView textView = new TextView(linearLayout.getContext());
                textView.setText(AbstractC0295Gu.m625r(-815893462382645L));
                textView.setTextSize(16.0f);
                textView.setTextColor(textView.getContext().getColor(io.github.cherrywechat.R.color.textTitle));
                textView.setTypeface(Typeface.DEFAULT_BOLD);
                textView.setPadding(0, 0, 0, AbstractC0295Gu.m616i(8));
                linearLayout.addView(textView);
                for (Developer developer : c2213m.f7704d) {
                    LinearLayout linearLayout2 = new LinearLayout(linearLayout.getContext());
                    linearLayout2.setOrientation(i);
                    Integer num4 = num2;
                    linearLayout2.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8));
                    FrameLayout frameLayout = new FrameLayout(linearLayout2.getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(num3), AbstractC0295Gu.m616i(num3));
                    layoutParams.setMarginEnd(AbstractC0295Gu.m616i(num4));
                    frameLayout.setLayoutParams(layoutParams);
                    ImageView imageView = new ImageView(frameLayout.getContext());
                    imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    imageView.setOutlineProvider(new C2122k(1));
                    imageView.setClipToOutline(true);
                    if (developer.getAvatar().length() > 0) {
                        num = num3;
                        ((C1193aw) ((C1193aw) ComponentCallbacks2C1273a.m2414c(imageView.getContext()).m2833n(developer.getAvatar()).m5324s(new C2446r9(), true)).m5312f(R.drawable.ic_menu_myplaces)).m2298A(imageView);
                    } else {
                        num = num3;
                        imageView.setImageResource(R.drawable.ic_menu_myplaces);
                    }
                    frameLayout.addView(imageView);
                    linearLayout2.addView(frameLayout);
                    LinearLayout linearLayout3 = new LinearLayout(linearLayout2.getContext());
                    linearLayout3.setOrientation(1);
                    linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
                    TextView textView2 = new TextView(linearLayout3.getContext());
                    textView2.setText(developer.getName());
                    textView2.setTextSize(15.0f);
                    textView2.setTextColor(textView2.getContext().getColor(io.github.cherrywechat.R.color.textTitle));
                    textView2.setTypeface(Typeface.DEFAULT_BOLD);
                    linearLayout3.addView(textView2);
                    TextView textView3 = new TextView(linearLayout3.getContext());
                    textView3.setText(developer.getRole());
                    textView3.setTextSize(13.0f);
                    textView3.setTextColor(textView3.getContext().getColor(io.github.cherrywechat.R.color.textSummary));
                    textView3.setPadding(0, AbstractC0295Gu.m616i(2), 0, 0);
                    linearLayout3.addView(textView3);
                    linearLayout2.addView(linearLayout3);
                    final String link = developer.getLink();
                    if (link != null) {
                        if (AbstractC2564tz.m5059T(link)) {
                            link = null;
                        }
                        if (link != null) {
                            StateListDrawable stateListDrawable = new StateListDrawable();
                            stateListDrawable.addState(new int[]{R.attr.state_pressed}, new ColorDrawable(linearLayout2.getContext().getColor(io.github.cherrywechat.R.color.pressedStateColor)));
                            stateListDrawable.addState(new int[0], new ColorDrawable(linearLayout2.getContext().getColor(io.github.cherrywechat.R.color.colorForeground)));
                            linearLayout2.setBackground(stateListDrawable);
                            linearLayout2.setClickable(true);
                            linearLayout2.setFocusable(true);
                            final int i2 = 0;
                            linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: i
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i2) {
                                        case 0:
                                            c2213m.m4453j(link);
                                            break;
                                        default:
                                            c2213m.m4453j(link);
                                            break;
                                    }
                                }
                            });
                        }
                    }
                    linearLayout.addView(linearLayout2);
                    num2 = num4;
                    num3 = num;
                    i = 0;
                }
                Integer num5 = num2;
                Integer num6 = num3;
                if (!c2213m.f7705e.isEmpty()) {
                    TextView textView4 = new TextView(linearLayout.getContext());
                    textView4.setText(AbstractC0295Gu.m625r(-815923527153717L));
                    textView4.setTextSize(16.0f);
                    textView4.setTextColor(textView4.getContext().getColor(io.github.cherrywechat.R.color.textTitle));
                    textView4.setTypeface(Typeface.DEFAULT_BOLD);
                    textView4.setPadding(0, AbstractC0295Gu.m616i(16), 0, AbstractC0295Gu.m616i(8));
                    linearLayout.addView(textView4);
                    for (Developer developer2 : c2213m.f7705e) {
                        LinearLayout linearLayout4 = new LinearLayout(linearLayout.getContext());
                        linearLayout4.setOrientation(0);
                        linearLayout4.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8));
                        FrameLayout frameLayout2 = new FrameLayout(linearLayout4.getContext());
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(num6), AbstractC0295Gu.m616i(num6));
                        layoutParams2.setMarginEnd(AbstractC0295Gu.m616i(num5));
                        frameLayout2.setLayoutParams(layoutParams2);
                        ImageView imageView2 = new ImageView(frameLayout2.getContext());
                        imageView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                        imageView2.setOutlineProvider(new C2122k(2));
                        imageView2.setClipToOutline(true);
                        if (developer2.getAvatar().length() > 0) {
                            ((C1193aw) ((C1193aw) ComponentCallbacks2C1273a.m2414c(imageView2.getContext()).m2833n(developer2.getAvatar()).m5324s(new C2446r9(), true)).m5312f(R.drawable.ic_menu_myplaces)).m2298A(imageView2);
                        } else {
                            imageView2.setImageResource(R.drawable.ic_menu_myplaces);
                        }
                        frameLayout2.addView(imageView2);
                        linearLayout4.addView(frameLayout2);
                        LinearLayout linearLayout5 = new LinearLayout(linearLayout4.getContext());
                        linearLayout5.setOrientation(1);
                        linearLayout5.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
                        TextView textView5 = new TextView(linearLayout5.getContext());
                        textView5.setText(developer2.getName());
                        textView5.setTextSize(15.0f);
                        textView5.setTextColor(textView5.getContext().getColor(io.github.cherrywechat.R.color.textTitle));
                        textView5.setTypeface(Typeface.DEFAULT_BOLD);
                        linearLayout5.addView(textView5);
                        TextView textView6 = new TextView(linearLayout5.getContext());
                        textView6.setText(developer2.getRole());
                        textView6.setTextSize(13.0f);
                        textView6.setTextColor(textView6.getContext().getColor(io.github.cherrywechat.R.color.textSummary));
                        textView6.setPadding(0, AbstractC0295Gu.m616i(2), 0, 0);
                        linearLayout5.addView(textView6);
                        linearLayout4.addView(linearLayout5);
                        final String link2 = developer2.getLink();
                        if (link2 != null) {
                            if (AbstractC2564tz.m5059T(link2)) {
                                link2 = null;
                            }
                            if (link2 != null) {
                                StateListDrawable stateListDrawable2 = new StateListDrawable();
                                stateListDrawable2.addState(new int[]{R.attr.state_pressed}, new ColorDrawable(linearLayout4.getContext().getColor(io.github.cherrywechat.R.color.pressedStateColor)));
                                stateListDrawable2.addState(new int[0], new ColorDrawable(linearLayout4.getContext().getColor(io.github.cherrywechat.R.color.colorForeground)));
                                linearLayout4.setBackground(stateListDrawable2);
                                linearLayout4.setClickable(true);
                                linearLayout4.setFocusable(true);
                                final int i3 = 1;
                                linearLayout4.setOnClickListener(new View.OnClickListener() { // from class: i
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        switch (i3) {
                                            case 0:
                                                c2213m.m4453j(link2);
                                                break;
                                            default:
                                                c2213m.m4453j(link2);
                                                break;
                                        }
                                    }
                                });
                            }
                        }
                        linearLayout.addView(linearLayout4);
                    }
                }
                TextView textView7 = new TextView(linearLayout.getContext());
                textView7.setText(AbstractC0295Gu.m625r(-815949296957493L));
                textView7.setTextSize(14.0f);
                textView7.setTextColor(textView7.getContext().getColor(io.github.cherrywechat.R.color.textSummary));
                textView7.setGravity(17);
                textView7.setPadding(0, AbstractC0295Gu.m616i(24), 0, AbstractC0295Gu.m616i(8));
                linearLayout.addView(textView7);
                scrollView.addView(linearLayout);
                AlertDialog alertDialogCreate3 = new AlertDialog.Builder(c2213m.getContext(), R.style.Theme.Material.Light.Dialog.Alert).setTitle(AbstractC0295Gu.m625r(-816022311401525L)).setView(scrollView).setPositiveButton(AbstractC0295Gu.m625r(-816048081205301L), (DialogInterface.OnClickListener) null).create();
                alertDialogCreate3.show();
                C2213m.m4449k(alertDialogCreate3);
                break;
        }
        return C0829TC.f2620a;
    }
}
