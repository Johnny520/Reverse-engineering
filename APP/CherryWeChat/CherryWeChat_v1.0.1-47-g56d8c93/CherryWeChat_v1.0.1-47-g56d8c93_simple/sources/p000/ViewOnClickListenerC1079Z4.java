package p000;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import io.github.cherrywechat.p002ui.activity.TestActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: Z4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC1079Z4 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3444a;

    public /* synthetic */ ViewOnClickListenerC1079Z4(int r1) {
        this.f3444a = r1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r20) {
        int r5 = 1;
        Activity r6 = null;
        int r7 = 0;
        switch(this.f3444a) {
            case 0: goto L79;
            case 1: goto L42;
            case 2: goto L40;
            case 3: goto L38;
            case 4: goto L31;
            case 5: goto L29;
            case 6: goto L17;
            case 7: goto L15;
            case 8: goto L13;
            case 9: goto L6;
            default: goto L4;
        };
    L4:
        int r1 = TestActivity.f5577A;
        return;
    L6:
        Context r2 = r20.getContext();
        if ((r2 instanceof Activity) == false) goto L9;
        r6 = (Activity) r2;
    L9:
        if (r6 != null) goto L11;
        AbstractC0213Ey.m413k(-8628589295669L, r20.getContext(), 0);
        return;
    L11:
        Intent r12 = new Intent(AbstractC0295Gu.m625r(-8671538968629L));
        r12.addCategory(AbstractC0295Gu.m625r(-8276401977397L));
        r12.setType(AbstractC0295Gu.m625r(-8418135898165L));
        r12.putExtra(AbstractC0295Gu.m625r(-8435315767349L), new String[]{AbstractC0295Gu.m625r(-6923487279157L), AbstractC0295Gu.m625r(-6962141984821L), AbstractC0295Gu.m625r(-7000796690485L), AbstractC0295Gu.m625r(-7043746363445L), AbstractC0295Gu.m625r(-7142530611253L), AbstractC0295Gu.m625r(-6713033881653L)});
        r6.startActivityForResult(r12, 20302);
        return;
    L13:
        Context r72 = r20.getContext();
        AbstractC0295Gu.m625r(-28059021342773L);
        C1456gf.m2799Q(r72, AbstractC0295Gu.m625r(-28127740819509L), AbstractC0295Gu.m625r(-28157805590581L), AbstractC0295Gu.m625r(-28230820034613L), AbstractC0295Gu.m625r(-26667451938869L), new C0438K7(r20, 2));
        return;
    L15:
        Context r13 = r20.getContext();
        AbstractC0295Gu.m625r(-29553669961781L);
        C1456gf.m2799Q(r13, AbstractC0295Gu.m625r(-29622389438517L), AbstractC0295Gu.m625r(-29656749176885L), AbstractC0295Gu.m625r(-29154238003253L), AbstractC0295Gu.m625r(-29270202120245L), new C0438K7(r20, 1));
        return;
    L17:
        Context r22 = r20.getContext();
        C0276Gb.f894g.getClass();
        EnumC1400fA[] r3 = EnumC1400fA.values();
        ArrayList r4 = new ArrayList(r3.length);
        int r52 = r3.length;
        int r8 = 0;
    L18:
        if (r8 >= r52) goto L20;
        r4.add(r3[r8].f4968a);
        r8 = r8 + 1;
        goto L18
    L20:
        String[] r32 = (String[]) r4.toArray(new String[0]);
        SharedPreferences r42 = AbstractC0599Nx.f1939a;
        int r43 = AbstractC0650P4.m1312G(AbstractC0599Nx.m1173b(AbstractC0295Gu.m625r(-23317377447989L), AbstractC0295Gu.m625r(-24008867182645L)), r32);
        Integer r53 = Integer.valueOf(r43);
        if (r43 >= 0) goto L24;
        r53 = null;
    L24:
        if (r53 == null) goto L26;
        int r44 = r53.intValue();
    L27:
        AlertDialog r14 = new AlertDialog.Builder(r22).setTitle(AbstractC0295Gu.m625r(-24034636986421L)).setSingleChoiceItems(r32, r44, new DialogInterfaceOnClickListenerC0534Mb(r32, r20, r22, r7)).setNegativeButton(AbstractC0295Gu.m625r(-24073291692085L), null).create();
        r14.show();
        C1456gf.m2802T(r14, false);
        return;
    L26:
        r44 = 0;
        goto L27
    L29:
        Context r82 = r20.getContext();
        AbstractC0295Gu.m625r(-257655088085045L);
        String r9 = AbstractC0295Gu.m625r(-257723807561781L);
        String r10 = AbstractC0295Gu.m625r(-257758167300149L);
        String r11 = AbstractC0295Gu.m625r(-257358735341621L);
        C1442g8.f5046b.getClass();
        C1456gf.m2800R(r82, r9, r10, r11, C1442g8.m2756i(), C1442g8.f5051g, new C2220m6(7));
        return;
    L31:
        Context r23 = r20.getContext();
        if ((r23 instanceof Activity) == false) goto L34;
        r6 = (Activity) r23;
    L34:
        if (r6 != null) goto L36;
        AbstractC0213Ey.m413k(-259480449185845L, r20.getContext(), 0);
        return;
    L36:
        Intent r15 = new Intent(AbstractC0295Gu.m625r(-258973643044917L));
        r15.addCategory(AbstractC0295Gu.m625r(-259128261867573L));
        r15.setType(AbstractC0295Gu.m625r(-257620728346677L));
        r6.startActivityForResult(r15, 18754);
        return;
    L38:
        Context r16 = r20.getContext();
        AbstractC0295Gu.m625r(-259338715265077L);
        String r24 = AbstractC0295Gu.m625r(-259407434741813L);
        List r33 = AbstractC2496sa.m4977b0(new String[]{AbstractC0295Gu.m625r(-259437499512885L), AbstractC0295Gu.m625r(-259458974349365L)});
        C1442g8.f5046b.getClass();
        boolean r45 = C1442g8.m2759m();
        C0223F7 r54 = new C0223F7(14);
        AbstractC0295Gu.m625r(-844218771699765L);
        AbstractC0295Gu.m625r(-844253131438133L);
        AbstractC0295Gu.m625r(-844287491176501L);
        AlertDialog r17 = new AlertDialog.Builder(r16, R.style.Theme.Material.Light.Dialog.Alert).setTitle(r24).setSingleChoiceItems((CharSequence[]) r33.toArray(new String[0]), r45 ? 1 : 0, new DialogInterfaceOnClickListenerC0536Md(r7, r54)).setNegativeButton(R.string.cancel, null).create();
        r17.show();
        C1456gf.m2802T(r17, false);
        return;
    L40:
        AbstractC0295Gu.m625r(-258402412394549L);
        Context r55 = r20.getContext();
        AbstractC0295Gu.m625r(-258411002329141L);
        String r62 = AbstractC0295Gu.m625r(-258479721805877L);
        String r73 = AbstractC0295Gu.m625r(-258514081544245L);
        String r83 = AbstractC0295Gu.m625r(-259227046115381L);
        C1442g8.f5046b.getClass();
        C1456gf.m2800R(r55, r62, r73, r83, C1442g8.f5047c, C1442g8.f5052h, new C2220m6(6));
        return;
    L42:
        C0781S7 r25 = C0781S7.f2467b;
        Context r18 = r20.getContext();
        AbstractC0295Gu.m625r(-250147485251637L);
        r25.getClass();
        C0867U7 r84 = ViewOnClickListenerC0996X7.f3170f;
        ArrayList r85 = AbstractC0295Gu.m619l();
        String r92 = AbstractC0599Nx.f1939a.getString(AbstractC0295Gu.m625r(-839416998262837L), AbstractC0295Gu.m625r(-838935961925685L));
        if (r92.length() != 0) goto L48;
        C0286Gl r46 = AbstractC2496sa.m4975Z(r85);
        ArrayList r93 = new ArrayList(AbstractC2539ta.m5019d0(r46, 10));
        Iterator r34 = r46.iterator();
    L45:
        C0200El r47 = (C0200El) r34;
        if (r47.f605c == false) goto L54;
        r93.add(String.valueOf(r47.nextInt()));
    L54:
        ArrayList r35 = new ArrayList();
        Iterator r48 = r93.iterator();
    L56:
        if (r48.hasNext() == false) goto L64;
        Integer r94 = AbstractC0042Az.m61H((String) r48.next());
        if (r94 == null) goto L56;
        int r95 = r94.intValue();
        if (r95 < 0) goto L56;
        if (r95 >= r85.size()) goto L56;
        r35.add(new C0610O7(r95, ((C0867U7) r85.get(r95)).f2737a, true));
        goto L56
    L64:
        Iterator r49 = AbstractC2496sa.m4975Z(r85).iterator();
    L65:
        C0200El r96 = (C0200El) r49;
        if (r96.f605c == false) goto L77;
        int r97 = r96.nextInt();
        if (r35.isEmpty() == true) goto L76;
        Iterator r102 = r35.iterator();
    L72:
        if (r102.hasNext() == false) goto L76;
        if (((C0610O7) r102.next()).f1954a != r97) goto L72;
    L76:
        r35.add(new C0610O7(r97, ((C0867U7) r85.get(r97)).f2737a, false));
        goto L65
    L77:
        C0696Q7 r410 = new C0696Q7(r35, r18, r7);
        RecyclerView r98 = new RecyclerView(r18);
        r98.setLayoutManager(new LinearLayoutManager(1));
        r98.setAdapter(r410);
        new C0973Wl(new C0738R7(r410, 0)).m1850d(r98);
        LinearLayout r411 = new LinearLayout(r18);
        r411.setOrientation(1);
        r411.setPadding(AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(8));
        TextView r26 = new TextView(r18);
        AbstractC0213Ey.m414l(-250040111069237L, r26, 13.0f);
        r26.setTextColor(r18.getColor(io.github.cherrywechat.R.color.textSummary));
        r26.setPadding(0, 0, 0, AbstractC0295Gu.m616i(12));
        r411.addView(r26);
        r411.addView(r98);
        AlertDialog r19 = new AlertDialog.Builder(r18).setTitle(AbstractC0295Gu.m625r(-250108830545973L)).setView(r411).setPositiveButton(AbstractC0295Gu.m625r(-249593434470453L), new DialogInterfaceOnClickListenerC0567N7(r35, r18, r7)).setNegativeButton(AbstractC0295Gu.m625r(-249606319372341L), null).setNeutralButton(AbstractC0295Gu.m625r(-249619204274229L), new DialogInterfaceOnClickListenerC0567N7(r85, r18, r5)).create();
        r19.show();
        C1456gf.m2802T(r19, false);
        return;
    L48:
        List r36 = AbstractC2564tz.m5065Z(r92, new String[]{AbstractC0295Gu.m625r(-250031521134645L)}, 6);
        r93 = new ArrayList();
        Iterator r37 = r36.iterator();
    L50:
        if (r37.hasNext() == false) goto L54;
        Object r412 = r37.next();
        if (((String) r412).length() <= 0) goto L50;
        r93.add(r412);
        goto L50
    L79:
        Context r110 = r20.getContext();
        LinearLayout r27 = new LinearLayout(r110);
        r27.setOrientation(1);
        r27.setPadding(AbstractC0295Gu.m616i(30), AbstractC0295Gu.m616i(10), AbstractC0295Gu.m616i(30), AbstractC0295Gu.m616i(10));
        r27.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        C1128aA r38 = new C1128aA(r110);
        r38.setKey(AbstractC0295Gu.m625r(-187157494888501L));
        r38.setTitle(AbstractC0295Gu.m625r(-187758790309941L));
        SharedPreferences r413 = AbstractC0599Nx.f1939a;
        r38.setChecked(AbstractC0599Nx.m1172a(AbstractC0295Gu.m625r(-187788855081013L), false));
        r27.addView(r38);
        C1128aA r39 = new C1128aA(r110);
        r39.setKey(AbstractC0295Gu.m625r(-187840394688565L));
        r39.setTitle(AbstractC0295Gu.m625r(-187909114165301L));
        r39.setChecked(AbstractC0599Nx.m1172a(AbstractC0295Gu.m625r(-187939178936373L), false));
        r27.addView(r39);
        C1128aA r310 = new C1128aA(r110);
        r310.setKey(AbstractC0295Gu.m625r(-188007898413109L));
        r310.setTitle(AbstractC0295Gu.m625r(-187526862075957L));
        r310.setChecked(AbstractC0599Nx.m1172a(AbstractC0295Gu.m625r(-187561221814325L), false));
        r27.addView(r310);
        new AlertDialog.Builder(r110).setTitle(AbstractC0295Gu.m625r(-187629941291061L)).setView(r27).create().show();
    }
}
