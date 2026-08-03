package p000;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import io.github.cherrywechat.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONException;

/* JADX INFO: renamed from: Ib */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0362Ib implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1227a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f1228b;

    public /* synthetic */ ViewOnClickListenerC0362Ib(Context context, int i) {
        this.f1227a = i;
        this.f1228b = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1227a) {
            case 0:
                C0577Nb.f1872b.getClass();
                C0276Gb.f894g.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap(C2220m6.m4466j());
                List<EnumC0319Hb> listM4467k = C2220m6.m4467k();
                final Context context = this.f1228b;
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.setPadding(AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(20), 0);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (EnumC0319Hb enumC0319Hb : listM4467k) {
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.setOrientation(1);
                    linearLayout2.setPadding(AbstractC0295Gu.m616i(14), AbstractC0295Gu.m616i(10), AbstractC0295Gu.m616i(14), AbstractC0295Gu.m616i(10));
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setColor(context.getColor(R.color.cardBackground));
                    gradientDrawable.setStroke(AbstractC0295Gu.m616i(1), context.getColor(R.color.cardStroke));
                    gradientDrawable.setCornerRadius(AbstractC0295Gu.m616i(10));
                    linearLayout2.setBackground(gradientDrawable);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams.bottomMargin = AbstractC0295Gu.m616i(8);
                    linearLayout2.setLayoutParams(layoutParams);
                    TextView textView = new TextView(context);
                    textView.setText(enumC0319Hb.f1054a);
                    textView.setTextSize(12.0f);
                    textView.setTextColor(context.getColor(R.color.textSummary));
                    linearLayout2.addView(textView);
                    EditText editText = new EditText(context);
                    String str = (String) linkedHashMap.get(enumC0319Hb);
                    if (str == null) {
                        str = enumC0319Hb.f1054a;
                    }
                    editText.setText(str);
                    editText.setTextSize(15.0f);
                    editText.setTextColor(context.getColor(R.color.textTitle));
                    editText.setSingleLine(true);
                    editText.setBackground(null);
                    editText.setPadding(0, AbstractC0295Gu.m616i(4), 0, 0);
                    editText.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                    linkedHashMap2.put(enumC0319Hb, editText);
                    linearLayout2.addView(editText);
                    linearLayout.addView(linearLayout2);
                }
                ScrollView scrollView = new ScrollView(context);
                scrollView.addView(linearLayout);
                final int i = 1;
                AlertDialog alertDialogCreate = new AlertDialog.Builder(context).setTitle(AbstractC0295Gu.m625r(-25164213385269L)).setView(scrollView).setPositiveButton(AbstractC0295Gu.m625r(-25198573123637L), new DialogInterfaceOnClickListenerC0448Kb(0, linkedHashMap2, context)).setNegativeButton(AbstractC0295Gu.m625r(-25211458025525L), (DialogInterface.OnClickListener) null).setNeutralButton(AbstractC0295Gu.m625r(-25224342927413L), new DialogInterface.OnClickListener() { // from class: Jb
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) throws JSONException {
                        switch (i) {
                            case 0:
                                C2220m6 c2220m6 = C0276Gb.f894g;
                                List listM1316K = AbstractC0650P4.m1316K(EnumC0319Hb.values());
                                c2220m6.getClass();
                                C2220m6.m4469m(listM1316K);
                                Toast.makeText(context, AbstractC0295Gu.m625r(-24116241365045L), 0).show();
                                break;
                            default:
                                C0276Gb.f894g.getClass();
                                C2220m6.m4468l(C0495Lf.f1620a);
                                Toast.makeText(context, AbstractC0295Gu.m625r(-23660974831669L), 0).show();
                                break;
                        }
                    }
                }).create();
                alertDialogCreate.show();
                C1456gf.m2802T(alertDialogCreate, false);
                break;
            case 1:
                C0577Nb.f1872b.getClass();
                C0276Gb.f894g.getClass();
                ArrayList arrayList = new ArrayList(C2220m6.m4467k());
                final Context context2 = this.f1228b;
                C0696Q7 c0696q7 = new C0696Q7(arrayList, context2, 1);
                RecyclerView recyclerView = new RecyclerView(context2);
                recyclerView.setLayoutManager(new LinearLayoutManager(1));
                recyclerView.setAdapter(c0696q7);
                new C0973Wl(new C0738R7(c0696q7, 1)).m1850d(recyclerView);
                LinearLayout linearLayout3 = new LinearLayout(context2);
                linearLayout3.setOrientation(1);
                linearLayout3.setPadding(AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(8));
                TextView textView2 = new TextView(context2);
                AbstractC0213Ey.m414l(-25043954300981L, textView2, 13.0f);
                textView2.setTextColor(context2.getColor(R.color.textSummary));
                textView2.setPadding(0, 0, 0, AbstractC0295Gu.m616i(12));
                linearLayout3.addView(textView2);
                linearLayout3.addView(recyclerView);
                final int i2 = 0;
                AlertDialog alertDialogCreate2 = new AlertDialog.Builder(context2).setTitle(AbstractC0295Gu.m625r(-25082609006645L)).setView(linearLayout3).setPositiveButton(AbstractC0295Gu.m625r(-25116968745013L), new DialogInterfaceOnClickListenerC0567N7(arrayList, context2, 2)).setNegativeButton(AbstractC0295Gu.m625r(-25129853646901L), (DialogInterface.OnClickListener) null).setNeutralButton(AbstractC0295Gu.m625r(-25142738548789L), new DialogInterface.OnClickListener() { // from class: Jb
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i22) throws JSONException {
                        switch (i2) {
                            case 0:
                                C2220m6 c2220m6 = C0276Gb.f894g;
                                List listM1316K = AbstractC0650P4.m1316K(EnumC0319Hb.values());
                                c2220m6.getClass();
                                C2220m6.m4469m(listM1316K);
                                Toast.makeText(context2, AbstractC0295Gu.m625r(-24116241365045L), 0).show();
                                break;
                            default:
                                C0276Gb.f894g.getClass();
                                C2220m6.m4468l(C0495Lf.f1620a);
                                Toast.makeText(context2, AbstractC0295Gu.m625r(-23660974831669L), 0).show();
                                break;
                        }
                    }
                }).create();
                alertDialogCreate2.show();
                C1456gf.m2802T(alertDialogCreate2, false);
                break;
            default:
                this.f1228b.startActivity(new Intent(AbstractC0295Gu.m625r(-812453193578549L), Uri.parse(AbstractC0295Gu.m625r(-812272804952117L))));
                break;
        }
    }
}
