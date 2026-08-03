package p000;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import io.github.cherrywechat.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: Ib */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0362Ib implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1227a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f1228b;

    public /* synthetic */ ViewOnClickListenerC0362Ib(Context r1, int r2) {
        this.f1227a = r2;
        this.f1228b = r1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r17) {
        switch(this.f1227a) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        this.f1228b.startActivity(new Intent(AbstractC0295Gu.m625r(-812453193578549L), Uri.parse(AbstractC0295Gu.m625r(-812272804952117L))));
        return;
    L6:
        C0577Nb.f1872b.getClass();
        C0276Gb.f894g.getClass();
        ArrayList r2 = new ArrayList(C2220m6.m4467k());
        final Context r4 = this.f1228b;
        C0696Q7 r1 = new C0696Q7(r2, r4, 1);
        RecyclerView r3 = new RecyclerView(r4);
        r3.setLayoutManager(new LinearLayoutManager(1));
        r3.setAdapter(r1);
        new C0973Wl(new C0738R7(r1, 1)).m1850d(r3);
        LinearLayout r12 = new LinearLayout(r4);
        r12.setOrientation(1);
        r12.setPadding(AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(8));
        TextView r5 = new TextView(r4);
        AbstractC0213Ey.m414l(-25043954300981L, r5, 13.0f);
        r5.setTextColor(r4.getColor(R.color.textSummary));
        r5.setPadding(0, 0, 0, AbstractC0295Gu.m616i(12));
        r12.addView(r5);
        r12.addView(r3);
        final int r52 = 0;
        AlertDialog r13 = new AlertDialog.Builder(r4).setTitle(AbstractC0295Gu.m625r(-25082609006645L)).setView(r12).setPositiveButton(AbstractC0295Gu.m625r(-25116968745013L), new DialogInterfaceOnClickListenerC0567N7(r2, r4, 2)).setNegativeButton(AbstractC0295Gu.m625r(-25129853646901L), null).setNeutralButton(AbstractC0295Gu.m625r(-25142738548789L), new DialogInterfaceOnClickListenerC0405Jb(r4, r52)).create();
        r13.show();
        C1456gf.m2802T(r13, false);
        return;
    L8:
        C0577Nb.f1872b.getClass();
        C0276Gb.f894g.getClass();
        LinkedHashMap r42 = new LinkedHashMap(C2220m6.m4466j());
        List r32 = C2220m6.m4467k();
        final Context r6 = this.f1228b;
        LinearLayout r53 = new LinearLayout(r6);
        r53.setOrientation(1);
        r53.setPadding(AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(20), 0);
        LinkedHashMap r8 = new LinkedHashMap();
        Iterator r33 = r32.iterator();
    L10:
        if (r33.hasNext() == false) goto L15;
        EnumC0319Hb r9 = (EnumC0319Hb) r33.next();
        LinearLayout r122 = new LinearLayout(r6);
        r122.setOrientation(1);
        r122.setPadding(AbstractC0295Gu.m616i(14), AbstractC0295Gu.m616i(10), AbstractC0295Gu.m616i(14), AbstractC0295Gu.m616i(10));
        GradientDrawable r11 = new GradientDrawable();
        r11.setColor(r6.getColor(R.color.cardBackground));
        r11.setStroke(AbstractC0295Gu.m616i(1), r6.getColor(R.color.cardStroke));
        r11.setCornerRadius(AbstractC0295Gu.m616i(10));
        r122.setBackground(r11);
        LinearLayout.LayoutParams r112 = new LinearLayout.LayoutParams(-1, -2);
        r112.bottomMargin = AbstractC0295Gu.m616i(8);
        r122.setLayoutParams(r112);
        TextView r113 = new TextView(r6);
        r113.setText(r9.f1054a);
        r113.setTextSize(12.0f);
        r113.setTextColor(r6.getColor(R.color.textSummary));
        r122.addView(r113);
        EditText r114 = new EditText(r6);
        String r15 = (String) r42.get(r9);
        if (r15 != null) goto L14;
        r15 = r9.f1054a;
    L14:
        r114.setText(r15);
        r114.setTextSize(15.0f);
        r114.setTextColor(r6.getColor(R.color.textTitle));
        r114.setSingleLine(true);
        r114.setBackground(null);
        r114.setPadding(0, AbstractC0295Gu.m616i(4), 0, 0);
        r114.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        r8.put(r9, r114);
        r122.addView(r114);
        r53.addView(r122);
        goto L10
    L15:
        ScrollView r14 = new ScrollView(r6);
        r14.addView(r53);
        final int r43 = 1;
        AlertDialog r16 = new AlertDialog.Builder(r6).setTitle(AbstractC0295Gu.m625r(-25164213385269L)).setView(r14).setPositiveButton(AbstractC0295Gu.m625r(-25198573123637L), new DialogInterfaceOnClickListenerC0448Kb(0, r8, r6)).setNegativeButton(AbstractC0295Gu.m625r(-25211458025525L), null).setNeutralButton(AbstractC0295Gu.m625r(-25224342927413L), new DialogInterfaceOnClickListenerC0405Jb(r6, r43)).create();
        r16.show();
        C1456gf.m2802T(r16, false);
    }
}
