package p000;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.AbstractC1158g;
import androidx.recyclerview.widget.AbstractC1166o;
import com.bumptech.glide.ComponentCallbacks2C1273a;
import io.github.cherrywechat.R;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: ca */
/* JADX INFO: loaded from: classes.dex */
public final class C1258ca extends AbstractC1158g {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4261a = 1;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f4262b;

    /* JADX INFO: renamed from: c */
    public final Object f4263c;

    /* JADX INFO: renamed from: d */
    public List f4264d;

    public C1258ca(Activity activity, ArrayList arrayList) {
        AbstractC0295Gu.m625r(-103014790592565L);
        AbstractC0295Gu.m625r(-103049150330933L);
        this.f4263c = activity;
        this.f4264d = arrayList;
        this.f4262b = new LinkedHashMap();
    }

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public final int getItemCount() {
        switch (this.f4261a) {
            case 0:
                return ((ArrayList) this.f4264d).size();
            default:
                return this.f4264d.size();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public int getItemViewType(int i) {
        switch (this.f4261a) {
            case 1:
                if (AbstractC0585Nj.m1134a(((C0185EC) this.f4264d.get(i)).f549a, AbstractC0295Gu.m625r(-487289809532981L))) {
                    return 4;
                }
                int iOrdinal = ((C0701QC) this.f4263c).f2264k.ordinal();
                if (iOrdinal != 0) {
                    return iOrdinal != 1 ? 2 : 1;
                }
                return 3;
            default:
                return super.getItemViewType(i);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public final void onBindViewHolder(AbstractC1166o abstractC1166o, int i) {
        String str;
        Integer num;
        ArrayList<C0140DA> arrayList;
        Bitmap bitmapDecodeFile;
        Bitmap bitmapDecodeFile2;
        Bitmap bitmapDecodeFile3;
        switch (this.f4261a) {
            case 0:
                final C1215ba c1215ba = (C1215ba) abstractC1166o;
                AbstractC0295Gu.m625r(-101533026875445L);
                final C0054BA c0054ba = (C0054BA) ((ArrayList) this.f4264d).get(i);
                AbstractC0295Gu.m625r(-102654013339701L);
                ArrayList arrayList2 = c0054ba.f126g;
                LinearLayout linearLayout = c1215ba.f4149a;
                linearLayout.removeAllViews();
                final C1258ca c1258ca = c1215ba.f4150b;
                Context context = (Context) c1258ca.f4263c;
                LinkedHashMap linkedHashMap = c1258ca.f4262b;
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(1);
                linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                LinearLayout linearLayout3 = new LinearLayout(linearLayout2.getContext());
                linearLayout3.setOrientation(1);
                linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                LinearLayout linearLayout4 = new LinearLayout(linearLayout3.getContext());
                linearLayout4.setOrientation(0);
                linearLayout4.setGravity(16);
                linearLayout4.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                LinearLayout linearLayout5 = new LinearLayout(linearLayout4.getContext());
                linearLayout5.setOrientation(1);
                linearLayout5.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
                LinearLayout linearLayout6 = new LinearLayout(linearLayout5.getContext());
                linearLayout6.setOrientation(0);
                linearLayout6.setGravity(16);
                TextView textView = new TextView(linearLayout6.getContext());
                textView.setText(c0054ba.f121b);
                textView.setTextSize(16.0f);
                textView.setTextColor(textView.getContext().getColor(R.color.textTitle));
                textView.setTypeface(Typeface.DEFAULT_BOLD);
                linearLayout6.addView(textView);
                String str2 = c0054ba.f123d;
                if (str2.length() > 0) {
                    TextView textView2 = new TextView(linearLayout6.getContext());
                    textView2.setText(AbstractC0295Gu.m625r(-102679783143477L));
                    textView2.setTextSize(10.0f);
                    str = str2;
                    textView2.setTextColor(textView2.getContext().getColor(android.R.color.black));
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setCornerRadius(AbstractC0295Gu.m616i(5));
                    num = 4;
                    gradientDrawable.setColor(textView2.getContext().getColor(android.R.color.holo_orange_light));
                    textView2.setBackground(gradientDrawable);
                    arrayList = arrayList2;
                    textView2.setPadding(AbstractC0295Gu.m616i(6), AbstractC0295Gu.m616i(2), AbstractC0295Gu.m616i(6), AbstractC0295Gu.m616i(2));
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.setMarginStart(AbstractC0295Gu.m616i(8));
                    textView2.setLayoutParams(layoutParams);
                    linearLayout6.addView(textView2);
                } else {
                    str = str2;
                    num = 4;
                    arrayList = arrayList2;
                }
                linearLayout5.addView(linearLayout6);
                TextView textView3 = new TextView(linearLayout5.getContext());
                textView3.setText(AbstractC0295Gu.m625r(-102696963012661L) + c0054ba.f122c);
                float f = 14.0f;
                textView3.setTextSize(14.0f);
                textView3.setTextColor(textView3.getContext().getColor(R.color.textSummary));
                textView3.setPadding(0, AbstractC0295Gu.m616i(num), 0, 0);
                linearLayout5.addView(textView3);
                linearLayout4.addView(linearLayout5);
                if (!arrayList.isEmpty() || str.length() > 0) {
                    ImageView imageView = new ImageView(linearLayout4.getContext());
                    imageView.setImageResource(R.drawable.ic_expand);
                    imageView.setLayoutParams(new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(24)));
                    Object obj = linkedHashMap.get(Integer.valueOf(c1215ba.getAdapterPosition()));
                    Boolean bool = Boolean.TRUE;
                    imageView.setRotation(AbstractC0585Nj.m1134a(obj, bool) ? 180.0f : 0.0f);
                    imageView.animate().rotation(AbstractC0585Nj.m1134a(linkedHashMap.get(Integer.valueOf(c1215ba.getAdapterPosition())), bool) ? 180.0f : 0.0f).setDuration(500L).start();
                    imageView.setOnClickListener(new ViewOnClickListenerC2176l5(3, c1258ca, c1215ba));
                    linearLayout4.addView(imageView);
                }
                linearLayout3.addView(linearLayout4);
                linearLayout2.addView(linearLayout3);
                linearLayout.addView(linearLayout2);
                boolean zIsEmpty = arrayList.isEmpty();
                boolean z = str.length() > 0;
                if ((!zIsEmpty || z) && AbstractC0585Nj.m1134a(linkedHashMap.get(Integer.valueOf(c1215ba.getAdapterPosition())), Boolean.TRUE)) {
                    if (z) {
                        LinearLayout linearLayout7 = new LinearLayout(context);
                        linearLayout7.setOrientation(0);
                        linearLayout7.setGravity(16);
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                        layoutParams2.topMargin = AbstractC0295Gu.m616i(num);
                        layoutParams2.bottomMargin = AbstractC0295Gu.m616i(num);
                        linearLayout7.setLayoutParams(layoutParams2);
                        LinearLayout linearLayout8 = new LinearLayout(linearLayout7.getContext());
                        linearLayout8.setOrientation(1);
                        linearLayout8.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
                        TextView textView4 = new TextView(linearLayout8.getContext());
                        textView4.setText(AbstractC0295Gu.m625r(-102714142881845L));
                        textView4.setTextSize(14.0f);
                        textView4.setTextColor(textView4.getContext().getColor(R.color.textTitle));
                        linearLayout8.addView(textView4);
                        linearLayout7.addView(linearLayout8);
                        TextView textView5 = new TextView(linearLayout7.getContext());
                        textView5.setText(AbstractC0295Gu.m625r(-102748502620213L));
                        textView5.setTextSize(13.0f);
                        textView5.setTextColor(textView5.getContext().getColor(R.color.buttonTextPrimary));
                        GradientDrawable gradientDrawable2 = new GradientDrawable();
                        gradientDrawable2.setCornerRadius(AbstractC0295Gu.m616i(8));
                        gradientDrawable2.setColor(textView5.getContext().getColor(R.color.buttonPrimary));
                        textView5.setBackground(gradientDrawable2);
                        textView5.setPadding(AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(6), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(6));
                        textView5.setMinWidth(AbstractC0295Gu.m616i(50));
                        textView5.setGravity(17);
                        textView5.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                        textView5.setOnClickListener(new ViewOnClickListenerC2176l5(4, textView5, c0054ba));
                        linearLayout7.addView(textView5);
                        linearLayout.addView(linearLayout7);
                    }
                    if (!zIsEmpty) {
                        for (final C0140DA c0140da : arrayList) {
                            LinearLayout linearLayout9 = new LinearLayout(context);
                            linearLayout9.setOrientation(0);
                            linearLayout9.setGravity(16);
                            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                            layoutParams3.topMargin = AbstractC0295Gu.m616i(num);
                            layoutParams3.bottomMargin = AbstractC0295Gu.m616i(num);
                            linearLayout9.setLayoutParams(layoutParams3);
                            LinearLayout linearLayout10 = new LinearLayout(linearLayout9.getContext());
                            linearLayout10.setOrientation(1);
                            linearLayout10.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
                            TextView textView6 = new TextView(linearLayout10.getContext());
                            textView6.setText(c0140da.f365b);
                            textView6.setTextSize(f);
                            textView6.setTextColor(textView6.getContext().getColor(R.color.textTitle));
                            linearLayout10.addView(textView6);
                            linearLayout9.addView(linearLayout10);
                            Context context2 = linearLayout9.getContext();
                            AbstractC0295Gu.m625r(-102761387522101L);
                            final C2414qe c2414qe = new C2414qe(context2);
                            c2414qe.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                            Context context3 = context;
                            C0183EA c0183ea = C0183EA.f539a;
                            String str3 = c0140da.f364a;
                            c0183ea.getClass();
                            final File file = new File(C0183EA.m378f(str3));
                            if (file.exists()) {
                                c2414qe.setText(AbstractC0295Gu.m625r(-102280351184949L));
                                c2414qe.setBackgroundColor(c2414qe.getContext().getColor(android.R.color.holo_red_light));
                            } else {
                                c2414qe.setText(AbstractC0295Gu.m625r(-102293236086837L));
                                c2414qe.setBackgroundColor(c2414qe.getContext().getColor(R.color.buttonPrimary));
                            }
                            c2414qe.setOnClickListener(new View.OnClickListener() { // from class: U9
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    C0140DA c0140da2 = c0140da;
                                    String str4 = c0140da2.f364a;
                                    File file2 = file;
                                    boolean zExists = file2.exists();
                                    C2414qe c2414qe2 = c2414qe;
                                    C1258ca c1258ca2 = c1258ca;
                                    C0054BA c0054ba2 = c0054ba;
                                    if (!zExists) {
                                        C0183EA.f539a.getClass();
                                        if (!C0183EA.m380h()) {
                                            AbstractC0213Ey.m413k(-102989020788789L, view.getContext(), 0);
                                            return;
                                        }
                                        AbstractC1208bA.m2328a(new RunnableC2320oe(c2414qe2, 0));
                                        C1498hd c1498hd = AbstractC1499he.f5282a;
                                        AbstractC0585Nj.m1128G(AbstractC0671Pj.m1343a(ExecutorC0921Vc.f2876b), new C1135aa(c1258ca2, null, c2414qe2, c0054ba2, c0140da2, view), 3);
                                        return;
                                    }
                                    C0183EA.f539a.getClass();
                                    if (C0183EA.m373a().equals(str4)) {
                                        AbstractC0213Ey.m413k(-103293963466805L, c2414qe2.getContext(), 0);
                                        return;
                                    }
                                    File parentFile = file2.getParentFile();
                                    File[] fileArrListFiles = parentFile != null ? parentFile.listFiles() : null;
                                    if (fileArrListFiles != null) {
                                        for (File file3 : fileArrListFiles) {
                                        }
                                    }
                                    C1215ba c1215ba2 = c1215ba;
                                    if (fileArrListFiles != null) {
                                        for (File file4 : fileArrListFiles) {
                                            if (file4.isDirectory() && !AbstractC0585Nj.m1134a(file4.getName(), str4)) {
                                                if (!file2.delete()) {
                                                    Toast.makeText(c2414qe2.getContext(), AbstractC0295Gu.m625r(-102842991900725L), 0).show();
                                                    return;
                                                }
                                                Toast.makeText(c2414qe2.getContext(), AbstractC0295Gu.m625r(-103345503074357L) + c0140da2.f365b + AbstractC0295Gu.m625r(-102821517064245L), 0).show();
                                                c1258ca2.notifyItemChanged(c1215ba2.getAdapterPosition());
                                                return;
                                            }
                                            try {
                                            } catch (Exception e) {
                                                Toast.makeText(c2414qe2.getContext(), AbstractC0213Ey.m405c(-102950366083125L, new StringBuilder(), e), 0).show();
                                                return;
                                            }
                                        }
                                    }
                                    if (parentFile == null || !AbstractC2675wh.m5239b0(parentFile)) {
                                        Toast.makeText(c2414qe2.getContext(), AbstractC0295Gu.m625r(-102920301312053L), 0).show();
                                        return;
                                    }
                                    Toast.makeText(c2414qe2.getContext(), AbstractC0295Gu.m625r(-102881646606389L) + c0054ba2.f121b + AbstractC0295Gu.m625r(-102898826475573L), 0).show();
                                    c1258ca2.notifyItemChanged(c1215ba2.getAdapterPosition());
                                }
                            });
                            linearLayout9.addView(c2414qe);
                            linearLayout.addView(linearLayout9);
                            context = context3;
                            f = 14.0f;
                        }
                    }
                }
                break;
            default:
                AbstractC0295Gu.m625r(-487654881753141L);
                C0185EC c0185ec = (C0185EC) this.f4264d.get(i);
                if (abstractC1166o instanceof C0013AC) {
                    AbstractC0295Gu.m625r(-487362823977013L);
                    C1505hk c1505hk = ((C0013AC) abstractC1166o).f17a;
                    c1505hk.getClass();
                    AbstractC0295Gu.m625r(-71850507892789L);
                    double d = c0185ec.f559k;
                    AbstractC0295Gu.m625r(-71876277696565L);
                    AbstractC0295Gu.m625r(-71949292140597L);
                    AbstractC0295Gu.m625r(-71494025607221L);
                    AbstractC0295Gu.m625r(-71519795410997L);
                    EnumC0099CC enumC0099CC = c0185ec.f567s;
                    Objects.toString(enumC0099CC);
                    AbstractC0295Gu.m625r(-71562745083957L);
                    c1505hk.f5338b.setText(c0185ec.f551c);
                    c1505hk.f5339c.setText(c0185ec.f552d);
                    ImageView imageView2 = c1505hk.f5337a;
                    String str4 = c0185ec.f554f;
                    String str5 = c0185ec.f555g;
                    if (str4.length() <= 0) {
                        if (str5.length() > 0) {
                            try {
                                File file2 = new File(str5);
                                if (file2.exists()) {
                                    String absolutePath = file2.getAbsolutePath();
                                    AbstractC0295Gu.m625r(-71652939397173L);
                                    AbstractC0295Gu.m625r(-779729837750325L);
                                    try {
                                        bitmapDecodeFile3 = BitmapFactory.decodeFile(absolutePath);
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                        bitmapDecodeFile3 = null;
                                    }
                                    imageView2.setImageBitmap(bitmapDecodeFile3);
                                } else {
                                    C0183EA.f539a.getClass();
                                    imageView2.setImageBitmap(C0183EA.m375c());
                                }
                            } catch (Exception unused) {
                                C0183EA.f539a.getClass();
                                imageView2.setImageBitmap(C0183EA.m375c());
                            }
                        } else {
                            C0183EA.f539a.getClass();
                            imageView2.setImageBitmap(C0183EA.m375c());
                        }
                        break;
                    } else {
                        C0357IC.f1218a.getClass();
                        AbstractC0295Gu.m625r(-802123797231669L);
                        Bitmap bitmap = (Bitmap) C0357IC.f1221d.get(str4);
                        if (bitmap == null || bitmap.isRecycled()) {
                            ((C1193aw) ((C1193aw) ((C1193aw) ((C1193aw) ComponentCallbacks2C1273a.m2415d(imageView2).m2833n(str4).m5311e(C0922Vd.f2878b)).m5309b()).m5316k()).m5312f(R.drawable.ic_theme)).m2299B(new C1461gk(0, c0185ec)).m2298A(imageView2);
                        } else {
                            imageView2.setImageBitmap(bitmap);
                        }
                    }
                    c1505hk.f5342f.setText(d > 0.0d ? "¥" + d : AbstractC0295Gu.m625r(-71640054495285L));
                    TextView textView7 = c1505hk.f5340d;
                    int iOrdinal = enumC0099CC.ordinal();
                    if (iOrdinal == 1) {
                        textView7.setText(AbstractC0295Gu.m625r(-72327249262645L));
                        textView7.setTextColor(c1505hk.getContext().getColor(android.R.color.white));
                        GradientDrawable gradientDrawable3 = new GradientDrawable();
                        gradientDrawable3.setCornerRadius(AbstractC0295Gu.m616i(8));
                        gradientDrawable3.setColor(c1505hk.getContext().getColor(R.color.colorInfo));
                        textView7.setBackground(gradientDrawable3);
                        textView7.setVisibility(0);
                    } else if (iOrdinal == 3) {
                        textView7.setText(AbstractC0295Gu.m625r(-72310069393461L));
                        textView7.setTextColor(c1505hk.getContext().getColor(android.R.color.white));
                        GradientDrawable gradientDrawable4 = new GradientDrawable();
                        gradientDrawable4.setCornerRadius(AbstractC0295Gu.m616i(8));
                        gradientDrawable4.setColor(c1505hk.getContext().getColor(R.color.colorSuccess));
                        textView7.setBackground(gradientDrawable4);
                        textView7.setVisibility(0);
                    } else if (iOrdinal != 4) {
                        textView7.setVisibility(8);
                    } else {
                        textView7.setText(AbstractC0295Gu.m625r(-71743133710389L));
                        textView7.setTextColor(c1505hk.getContext().getColor(android.R.color.white));
                        GradientDrawable gradientDrawable5 = new GradientDrawable();
                        gradientDrawable5.setCornerRadius(AbstractC0295Gu.m616i(8));
                        gradientDrawable5.setColor(c1505hk.getContext().getColor(R.color.colorPrimary));
                        textView7.setBackground(gradientDrawable5);
                        textView7.setVisibility(0);
                    }
                    TextView textView8 = c1505hk.f5341e;
                    AbstractC0295Gu.m625r(-72344429131829L);
                    AbstractC0295Gu.m625r(-72417443575861L);
                    AbstractC0295Gu.m625r(-72022306584629L);
                    AbstractC0295Gu.m625r(-72048076388405L);
                    Objects.toString(enumC0099CC);
                    AbstractC0295Gu.m625r(-72091026061365L);
                    int iOrdinal2 = enumC0099CC.ordinal();
                    if (iOrdinal2 == 0) {
                        textView8.setText(AbstractC0295Gu.m625r(-72168335472693L));
                        textView8.setTextColor(c1505hk.getContext().getColor(R.color.buttonTextPrimary));
                        GradientDrawable gradientDrawable6 = new GradientDrawable();
                        gradientDrawable6.setCornerRadius(AbstractC0295Gu.m616i(12));
                        gradientDrawable6.setColor(c1505hk.getContext().getColor(R.color.buttonPrimary));
                        textView8.setBackground(gradientDrawable6);
                        textView8.setOnClickListener(new ViewOnClickListenerC1268ck(c1505hk, c0185ec, 1));
                    } else if (iOrdinal2 == 1) {
                        textView8.setText(AbstractC0295Gu.m625r(-72181220374581L));
                        textView8.setTextColor(c1505hk.getContext().getColor(R.color.buttonTextPrimary));
                        GradientDrawable gradientDrawable7 = new GradientDrawable();
                        gradientDrawable7.setCornerRadius(AbstractC0295Gu.m616i(12));
                        gradientDrawable7.setColor(c1505hk.getContext().getColor(R.color.buttonPrimary));
                        textView8.setBackground(gradientDrawable7);
                        textView8.setOnClickListener(new ViewOnClickListenerC1268ck(c1505hk, c0185ec, 2));
                    } else if (iOrdinal2 == 3) {
                        textView8.setText(AbstractC0295Gu.m625r(-72194105276469L));
                        textView8.setTextColor(c1505hk.getContext().getColor(R.color.buttonTextPrimary));
                        GradientDrawable gradientDrawable8 = new GradientDrawable();
                        gradientDrawable8.setCornerRadius(AbstractC0295Gu.m616i(12));
                        gradientDrawable8.setColor(c1505hk.getContext().getColor(R.color.buttonPrimary));
                        textView8.setBackground(gradientDrawable8);
                        textView8.setOnClickListener(new ViewOnClickListenerC1268ck(c1505hk, c0185ec, 3));
                    } else if (iOrdinal2 != 4) {
                        AbstractC0295Gu.m625r(-72224170047541L);
                        AbstractC0295Gu.m625r(-70647917049909L);
                        AbstractC0295Gu.m625r(-70750996265013L);
                        if (c0185ec.f568t) {
                            AbstractC0295Gu.m625r(-70828305676341L);
                            AbstractC0295Gu.m625r(-70901320120373L);
                            textView8.setText(AbstractC0295Gu.m625r(-70446053586997L));
                            textView8.setTextColor(c1505hk.getContext().getColor(R.color.buttonTextSecondary));
                            GradientDrawable gradientDrawable9 = new GradientDrawable();
                            gradientDrawable9.setCornerRadius(AbstractC0295Gu.m616i(12));
                            gradientDrawable9.setColor(c1505hk.getContext().getColor(R.color.buttonSecondary));
                            gradientDrawable9.setStroke(AbstractC0295Gu.m616i(1), c1505hk.getContext().getColor(R.color.cardStroke));
                            textView8.setBackground(gradientDrawable9);
                            textView8.setOnClickListener(null);
                        } else {
                            AbstractC0295Gu.m625r(-70463233456181L);
                            AbstractC0295Gu.m625r(-70536247900213L);
                            textView8.setText(AbstractC0295Gu.m625r(-70630737180725L));
                            textView8.setTextColor(c1505hk.getContext().getColor(R.color.buttonTextPrimary));
                            GradientDrawable gradientDrawable10 = new GradientDrawable();
                            gradientDrawable10.setCornerRadius(AbstractC0295Gu.m616i(12));
                            gradientDrawable10.setColor(c1505hk.getContext().getColor(R.color.buttonPrimary));
                            textView8.setBackground(gradientDrawable10);
                            textView8.setOnClickListener(new ViewOnClickListenerC1268ck(c1505hk, c0185ec, 4));
                        }
                    } else {
                        textView8.setText(AbstractC0295Gu.m625r(-72206990178357L));
                        textView8.setTextColor(c1505hk.getContext().getColor(R.color.buttonTextSecondary));
                        GradientDrawable gradientDrawable11 = new GradientDrawable();
                        gradientDrawable11.setCornerRadius(AbstractC0295Gu.m616i(12));
                        gradientDrawable11.setColor(c1505hk.getContext().getColor(R.color.buttonSecondary));
                        gradientDrawable11.setStroke(AbstractC0295Gu.m616i(1), c1505hk.getContext().getColor(R.color.cardStroke));
                        textView8.setBackground(gradientDrawable11);
                        textView8.setOnClickListener(null);
                    }
                    c1505hk.setOnClickListener(new ViewOnClickListenerC1268ck(c0185ec, c1505hk));
                } else if (abstractC1166o instanceof C2793zC) {
                    AbstractC0295Gu.m625r(-488964846778421L);
                    C0625Og c0625Og = ((C2793zC) abstractC1166o).f9461a;
                    C1258ca c1258ca2 = c0625Og.f1989a;
                    TextView textView9 = c0625Og.f1997i;
                    ImageView imageView3 = c0625Og.f1995g;
                    LinearLayout linearLayout11 = c0625Og.f1996h;
                    LinearLayout linearLayout12 = c0625Og.f1990b;
                    AbstractC0295Gu.m625r(-99763500349493L);
                    String str6 = c0185ec.f549a;
                    c0625Og.f1998j = c0185ec;
                    c0625Og.f1992d.setText(c0185ec.f551c);
                    c0625Og.f1993e.setText(AbstractC0295Gu.m625r(-98140002711605L) + c0185ec.f552d);
                    ImageView imageView4 = c0625Og.f1991c;
                    String str7 = c0185ec.f554f;
                    String str8 = c0185ec.f555g;
                    if (str7.length() > 0) {
                        ((C1193aw) ((C1193aw) ((C1193aw) ComponentCallbacks2C1273a.m2415d(imageView4).m2833n(str7).m5309b()).m5316k()).m5312f(R.drawable.ic_theme)).m2298A(imageView4);
                    } else if (str8.length() > 0) {
                        try {
                            File file3 = new File(str8);
                            if (file3.exists()) {
                                String absolutePath2 = file3.getAbsolutePath();
                                AbstractC0295Gu.m625r(-98165772515381L);
                                AbstractC0295Gu.m625r(-779729837750325L);
                                try {
                                    bitmapDecodeFile2 = BitmapFactory.decodeFile(absolutePath2);
                                } catch (Exception e2) {
                                    e2.printStackTrace();
                                    bitmapDecodeFile2 = null;
                                }
                                imageView4.setImageBitmap(bitmapDecodeFile2);
                            } else {
                                C0183EA.f539a.getClass();
                                imageView4.setImageBitmap(C0183EA.m375c());
                            }
                        } catch (Exception unused2) {
                            C0183EA.f539a.getClass();
                            imageView4.setImageBitmap(C0183EA.m375c());
                        }
                    } else {
                        C0183EA.f539a.getClass();
                        imageView4.setImageBitmap(C0183EA.m375c());
                    }
                    TextView textView10 = c0625Og.f1994f;
                    AbstractC0295Gu.m625r(-98255966828597L);
                    AbstractC0295Gu.m625r(-98328981272629L);
                    AbstractC0295Gu.m625r(-97959614085173L);
                    AbstractC0295Gu.m625r(-97985383888949L);
                    Objects.toString(c0185ec.f567s);
                    AbstractC0295Gu.m625r(-98028333561909L);
                    if (AbstractC0585Nj.m1134a(str6, AbstractC0295Gu.m625r(-98105642973237L))) {
                        if (c0185ec.f568t) {
                            AbstractC0295Gu.m625r(-98114232907829L);
                            AbstractC0295Gu.m625r(-98737003165749L);
                            textView10.setText(AbstractC0295Gu.m625r(-98878737086517L));
                            textView10.setTextColor(c0625Og.getContext().getColor(R.color.buttonTextSecondary));
                            GradientDrawable gradientDrawable12 = new GradientDrawable();
                            gradientDrawable12.setCornerRadius(AbstractC0295Gu.m616i(16));
                            gradientDrawable12.setColor(c0625Og.getContext().getColor(R.color.buttonSecondary));
                            gradientDrawable12.setStroke(AbstractC0295Gu.m616i(1), c0625Og.getContext().getColor(R.color.cardStroke));
                            textView10.setBackground(gradientDrawable12);
                            textView10.setOnClickListener(null);
                        } else {
                            AbstractC0295Gu.m625r(-98895916955701L);
                            AbstractC0295Gu.m625r(-98419175585845L);
                            textView10.setText(AbstractC0295Gu.m625r(-98548024604725L));
                            textView10.setTextColor(c0625Og.getContext().getColor(R.color.buttonTextPrimary));
                            GradientDrawable gradientDrawable13 = new GradientDrawable();
                            gradientDrawable13.setCornerRadius(AbstractC0295Gu.m616i(16));
                            gradientDrawable13.setColor(c0625Og.getContext().getColor(R.color.buttonPrimary));
                            textView10.setBackground(gradientDrawable13);
                            textView10.setOnClickListener(new ViewOnClickListenerC0453Kg(c0625Og, c0185ec, 0));
                        }
                        textView10.setVisibility(0);
                    } else {
                        AbstractC0295Gu.m625r(-98560909506613L);
                        AbstractC0295Gu.m625r(-98633923950645L);
                        textView10.setVisibility(8);
                    }
                    boolean zIsEmpty2 = c0185ec.f558j.isEmpty();
                    boolean z2 = c0185ec.f564p.length() > 0;
                    boolean zM1134a = AbstractC0585Nj.m1134a(str6, AbstractC0295Gu.m625r(-98157182580789L));
                    if (((!zIsEmpty2 || z2) && !(zM1134a && zIsEmpty2 && !z2)) || !(zM1134a || !zIsEmpty2 || z2)) {
                        linearLayout12.setOnClickListener(new ViewOnClickListenerC1477h(5, c0625Og));
                        linearLayout12.setClickable(true);
                        linearLayout12.setFocusable(true);
                    } else {
                        linearLayout12.setOnClickListener(null);
                        linearLayout12.setClickable(false);
                        linearLayout12.setFocusable(false);
                        ColorStateList colorStateListValueOf = ColorStateList.valueOf(c0625Og.getContext().getColor(R.color.colorPrimary) & 100663295);
                        GradientDrawable gradientDrawable14 = new GradientDrawable();
                        gradientDrawable14.setCornerRadius(AbstractC0295Gu.m616i(12));
                        linearLayout12.setBackground(new RippleDrawable(colorStateListValueOf, null, gradientDrawable14));
                    }
                    if ((!zIsEmpty2 || z2) && !(zM1134a && zIsEmpty2 && !z2)) {
                        imageView3.setVisibility((zM1134a && zIsEmpty2 && !z2) ? 8 : 0);
                        c1258ca2.getClass();
                        AbstractC0295Gu.m625r(-487684946524213L);
                        Boolean bool2 = (Boolean) c1258ca2.f4262b.get(str6);
                        boolean zBooleanValue = bool2 != null ? bool2.booleanValue() : false;
                        c0625Og.m1217c(zBooleanValue);
                        if (zBooleanValue) {
                            c0625Og.m1216b(c0185ec);
                        } else {
                            linearLayout11.setVisibility(8);
                            linearLayout11.removeAllViews();
                        }
                    } else if (zM1134a) {
                        imageView3.setVisibility(8);
                        textView9.setVisibility(8);
                        linearLayout11.setVisibility(8);
                        linearLayout11.removeAllViews();
                    } else {
                        imageView3.setVisibility(0);
                        textView9.setVisibility(8);
                        c1258ca2.getClass();
                        AbstractC0295Gu.m625r(-487684946524213L);
                        Boolean bool3 = (Boolean) c1258ca2.f4262b.get(str6);
                        boolean zBooleanValue2 = bool3 != null ? bool3.booleanValue() : false;
                        c0625Og.m1217c(zBooleanValue2);
                        if (zBooleanValue2) {
                            c0625Og.m1216b(c0185ec);
                        } else {
                            linearLayout11.setVisibility(8);
                            linearLayout11.removeAllViews();
                        }
                    }
                } else {
                    if (abstractC1166o instanceof C2750yC) {
                        AbstractC0295Gu.m625r(-488917602138165L);
                        ((C2750yC) abstractC1166o).f9381a.getClass();
                        AbstractC0295Gu.m625r(-100489349822517L);
                    } else if (abstractC1166o instanceof C0056BC) {
                        AbstractC0295Gu.m625r(-487135190710325L);
                        C0461Ko c0461Ko = ((C0056BC) abstractC1166o).f130a;
                        c0461Ko.getClass();
                        AbstractC0295Gu.m625r(-87170656237621L);
                        String str9 = c0185ec.f554f;
                        AbstractC0295Gu.m625r(-87196426041397L);
                        AbstractC0295Gu.m625r(-87269440485429L);
                        AbstractC0295Gu.m625r(-87363929765941L);
                        AbstractC0295Gu.m625r(-87389699569717L);
                        EnumC0099CC enumC0099CC2 = c0185ec.f567s;
                        Objects.toString(enumC0099CC2);
                        AbstractC0295Gu.m625r(-86882893428789L);
                        c0461Ko.f1503c.setText(c0185ec.f551c);
                        c0461Ko.f1504d.setText(c0185ec.f552d);
                        c0461Ko.f1506f.setText("v" + c0185ec.f557i);
                        TextView textView11 = c0461Ko.f1505e;
                        String str10 = c0185ec.f553e;
                        textView11.setText(str10);
                        textView11.setVisibility(str10.length() > 0 ? 0 : 8);
                        ImageView imageView5 = c0461Ko.f1502b;
                        String str11 = c0185ec.f555g;
                        if (str9.length() > 0) {
                            ((C1193aw) ((C1193aw) ((C1193aw) ComponentCallbacks2C1273a.m2415d(imageView5).m2833n(str9).m5309b()).m5316k()).m5312f(R.drawable.ic_theme)).m2298A(imageView5);
                        } else if (str11.length() > 0) {
                            try {
                                File file4 = new File(str11);
                                if (file4.exists()) {
                                    String absolutePath3 = file4.getAbsolutePath();
                                    AbstractC0295Gu.m625r(-86960202840117L);
                                    AbstractC0295Gu.m625r(-779729837750325L);
                                    try {
                                        bitmapDecodeFile = BitmapFactory.decodeFile(absolutePath3);
                                    } catch (Exception e3) {
                                        e3.printStackTrace();
                                        bitmapDecodeFile = null;
                                    }
                                    imageView5.setImageBitmap(bitmapDecodeFile);
                                } else {
                                    C0183EA.f539a.getClass();
                                    imageView5.setImageBitmap(C0183EA.m375c());
                                }
                            } catch (Exception unused3) {
                                C0183EA.f539a.getClass();
                                imageView5.setImageBitmap(C0183EA.m375c());
                            }
                        } else {
                            C0183EA.f539a.getClass();
                            imageView5.setImageBitmap(C0183EA.m375c());
                        }
                        TextView textView12 = c0461Ko.f1507g;
                        int iOrdinal3 = enumC0099CC2.ordinal();
                        if (iOrdinal3 == 1) {
                            textView12.setText(AbstractC0295Gu.m625r(-87084756891701L));
                            textView12.setTextColor(c0461Ko.getContext().getColor(R.color.colorInfo));
                        } else if (iOrdinal3 == 3) {
                            textView12.setText(AbstractC0295Gu.m625r(-87067577022517L));
                            textView12.setTextColor(c0461Ko.getContext().getColor(R.color.colorSuccess));
                        } else if (iOrdinal3 != 4) {
                            textView12.setText(AbstractC0295Gu.m625r(-87101936760885L));
                        } else {
                            textView12.setText(AbstractC0295Gu.m625r(-87050397153333L));
                            textView12.setTextColor(c0461Ko.getContext().getColor(R.color.colorPrimary));
                        }
                        AbstractC0295Gu.m625r(-87106231728181L);
                        AbstractC0295Gu.m625r(-87729001986101L);
                        AbstractC0295Gu.m625r(-87883620808757L);
                        AbstractC0295Gu.m625r(-87909390612533L);
                        Objects.toString(enumC0099CC2);
                        AbstractC0295Gu.m625r(-87952340285493L);
                        if (c0185ec.f568t) {
                            AbstractC0295Gu.m625r(-87479893882933L);
                            AbstractC0295Gu.m625r(-87552908326965L);
                            c0461Ko.m910b(c0185ec, true);
                        } else {
                            AbstractC0295Gu.m625r(-86088324479029L);
                            AbstractC0295Gu.m625r(-86161338923061L);
                            c0461Ko.m910b(c0185ec, false);
                        }
                    }
                }
                break;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public final AbstractC1166o onCreateViewHolder(ViewGroup viewGroup, int i) {
        switch (this.f4261a) {
            case 0:
                AbstractC0295Gu.m625r(-101502962104373L);
                C0780S6 c0780s6 = new C0780S6((Context) this.f4263c);
                c0780s6.setRadius(AbstractC0295Gu.m616i(12));
                c0780s6.setCardElevation(0.0f);
                c0780s6.setUseCompatPadding(true);
                c0780s6.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                return new C1215ba(this, c0780s6);
            default:
                AbstractC0295Gu.m625r(-487349939075125L);
                if (i == 1) {
                    Context context = viewGroup.getContext();
                    AbstractC0295Gu.m625r(-487929759660085L);
                    return new C0013AC(new C1505hk(context));
                }
                if (i == 3) {
                    Context context2 = viewGroup.getContext();
                    AbstractC0295Gu.m625r(-487998479136821L);
                    return new C2793zC(new C0625Og(context2, this));
                }
                if (i != 4) {
                    Context context3 = viewGroup.getContext();
                    AbstractC0295Gu.m625r(-488135918090293L);
                    return new C0056BC(this, new C0461Ko(context3));
                }
                Context context4 = viewGroup.getContext();
                AbstractC0295Gu.m625r(-488067198613557L);
                return new C2750yC(new C2717xg(context4, (C0701QC) this.f4263c));
        }
    }

    public C1258ca(C0701QC c0701qc) {
        AbstractC0295Gu.m625r(-487160960514101L);
        AbstractC0295Gu.m625r(-487199615219765L);
        this.f4263c = c0701qc;
        this.f4264d = C0452Kf.f1484a;
        this.f4262b = new LinkedHashMap();
    }
}
