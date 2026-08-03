package p000;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import io.github.cherrywechat.R;
import io.github.cherrywechat.p002ui.activity.TestActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: Z4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC1079Z4 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3444a;

    public /* synthetic */ ViewOnClickListenerC1079Z4(int i) {
        this.f3444a = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ArrayList arrayList;
        int iIntValue;
        Activity activity;
        int i = 1;
        int i2 = 0;
        switch (this.f3444a) {
            case 0:
                Context context = view.getContext();
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.setPadding(AbstractC0295Gu.m616i(30), AbstractC0295Gu.m616i(10), AbstractC0295Gu.m616i(30), AbstractC0295Gu.m616i(10));
                linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                C1128aA c1128aA = new C1128aA(context);
                c1128aA.setKey(AbstractC0295Gu.m625r(-187157494888501L));
                c1128aA.setTitle(AbstractC0295Gu.m625r(-187758790309941L));
                SharedPreferences sharedPreferences = AbstractC0599Nx.f1939a;
                c1128aA.setChecked(AbstractC0599Nx.m1172a(AbstractC0295Gu.m625r(-187788855081013L), false));
                linearLayout.addView(c1128aA);
                C1128aA c1128aA2 = new C1128aA(context);
                c1128aA2.setKey(AbstractC0295Gu.m625r(-187840394688565L));
                c1128aA2.setTitle(AbstractC0295Gu.m625r(-187909114165301L));
                c1128aA2.setChecked(AbstractC0599Nx.m1172a(AbstractC0295Gu.m625r(-187939178936373L), false));
                linearLayout.addView(c1128aA2);
                C1128aA c1128aA3 = new C1128aA(context);
                c1128aA3.setKey(AbstractC0295Gu.m625r(-188007898413109L));
                c1128aA3.setTitle(AbstractC0295Gu.m625r(-187526862075957L));
                c1128aA3.setChecked(AbstractC0599Nx.m1172a(AbstractC0295Gu.m625r(-187561221814325L), false));
                linearLayout.addView(c1128aA3);
                new AlertDialog.Builder(context).setTitle(AbstractC0295Gu.m625r(-187629941291061L)).setView(linearLayout).create().show();
                break;
            case 1:
                C0781S7 c0781s7 = C0781S7.f2467b;
                Context context2 = view.getContext();
                AbstractC0295Gu.m625r(-250147485251637L);
                c0781s7.getClass();
                C0867U7 c0867u7 = ViewOnClickListenerC0996X7.f3170f;
                ArrayList arrayListM619l = AbstractC0295Gu.m619l();
                String string = AbstractC0599Nx.f1939a.getString(AbstractC0295Gu.m625r(-839416998262837L), AbstractC0295Gu.m625r(-838935961925685L));
                if (string.length() == 0) {
                    C0286Gl c0286GlM4975Z = AbstractC2496sa.m4975Z(arrayListM619l);
                    arrayList = new ArrayList(AbstractC2539ta.m5019d0(c0286GlM4975Z, 10));
                    Iterator it = c0286GlM4975Z.iterator();
                    while (true) {
                        C0200El c0200El = (C0200El) it;
                        if (c0200El.f605c) {
                            arrayList.add(String.valueOf(c0200El.nextInt()));
                        }
                    }
                } else {
                    List listM5065Z = AbstractC2564tz.m5065Z(string, new String[]{AbstractC0295Gu.m625r(-250031521134645L)}, 6);
                    arrayList = new ArrayList();
                    for (Object obj : listM5065Z) {
                        if (((String) obj).length() > 0) {
                            arrayList.add(obj);
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Integer numM61H = AbstractC0042Az.m61H((String) it2.next());
                    if (numM61H != null && (iIntValue = numM61H.intValue()) >= 0 && iIntValue < arrayListM619l.size()) {
                        arrayList2.add(new C0610O7(iIntValue, ((C0867U7) arrayListM619l.get(iIntValue)).f2737a, true));
                    }
                }
                Iterator it3 = AbstractC2496sa.m4975Z(arrayListM619l).iterator();
                while (true) {
                    C0200El c0200El2 = (C0200El) it3;
                    if (!c0200El2.f605c) {
                        C0696Q7 c0696q7 = new C0696Q7(arrayList2, context2, i2);
                        RecyclerView recyclerView = new RecyclerView(context2);
                        recyclerView.setLayoutManager(new LinearLayoutManager(1));
                        recyclerView.setAdapter(c0696q7);
                        new C0973Wl(new C0738R7(c0696q7, 0)).m1850d(recyclerView);
                        LinearLayout linearLayout2 = new LinearLayout(context2);
                        linearLayout2.setOrientation(1);
                        linearLayout2.setPadding(AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(8));
                        TextView textView = new TextView(context2);
                        AbstractC0213Ey.m414l(-250040111069237L, textView, 13.0f);
                        textView.setTextColor(context2.getColor(R.color.textSummary));
                        textView.setPadding(0, 0, 0, AbstractC0295Gu.m616i(12));
                        linearLayout2.addView(textView);
                        linearLayout2.addView(recyclerView);
                        AlertDialog alertDialogCreate = new AlertDialog.Builder(context2).setTitle(AbstractC0295Gu.m625r(-250108830545973L)).setView(linearLayout2).setPositiveButton(AbstractC0295Gu.m625r(-249593434470453L), new DialogInterfaceOnClickListenerC0567N7(arrayList2, context2, i2)).setNegativeButton(AbstractC0295Gu.m625r(-249606319372341L), (DialogInterface.OnClickListener) null).setNeutralButton(AbstractC0295Gu.m625r(-249619204274229L), new DialogInterfaceOnClickListenerC0567N7(arrayListM619l, context2, i)).create();
                        alertDialogCreate.show();
                        C1456gf.m2802T(alertDialogCreate, false);
                    } else {
                        int iNextInt = c0200El2.nextInt();
                        if (!arrayList2.isEmpty()) {
                            Iterator it4 = arrayList2.iterator();
                            while (it4.hasNext()) {
                                if (((C0610O7) it4.next()).f1954a == iNextInt) {
                                }
                                break;
                            }
                        }
                        arrayList2.add(new C0610O7(iNextInt, ((C0867U7) arrayListM619l.get(iNextInt)).f2737a, false));
                    }
                    break;
                }
                break;
            case 2:
                AbstractC0295Gu.m625r(-258402412394549L);
                Context context3 = view.getContext();
                AbstractC0295Gu.m625r(-258411002329141L);
                String strM625r = AbstractC0295Gu.m625r(-258479721805877L);
                String strM625r2 = AbstractC0295Gu.m625r(-258514081544245L);
                String strM625r3 = AbstractC0295Gu.m625r(-259227046115381L);
                C1442g8.f5046b.getClass();
                C1456gf.m2800R(context3, strM625r, strM625r2, strM625r3, C1442g8.f5047c, C1442g8.f5052h, new C2220m6(6));
                break;
            case 3:
                Context context4 = view.getContext();
                AbstractC0295Gu.m625r(-259338715265077L);
                String strM625r4 = AbstractC0295Gu.m625r(-259407434741813L);
                List listM4977b0 = AbstractC2496sa.m4977b0(AbstractC0295Gu.m625r(-259437499512885L), AbstractC0295Gu.m625r(-259458974349365L));
                C1442g8.f5046b.getClass();
                boolean zM2759m = C1442g8.m2759m();
                C0223F7 c0223f7 = new C0223F7(14);
                AbstractC0295Gu.m625r(-844218771699765L);
                AbstractC0295Gu.m625r(-844253131438133L);
                AbstractC0295Gu.m625r(-844287491176501L);
                AlertDialog alertDialogCreate2 = new AlertDialog.Builder(context4, android.R.style.Theme.Material.Light.Dialog.Alert).setTitle(strM625r4).setSingleChoiceItems((CharSequence[]) listM4977b0.toArray(new String[0]), zM2759m ? 1 : 0, new DialogInterfaceOnClickListenerC0536Md(i2, c0223f7)).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).create();
                alertDialogCreate2.show();
                C1456gf.m2802T(alertDialogCreate2, false);
                break;
            case 4:
                Context context5 = view.getContext();
                activity = context5 instanceof Activity ? (Activity) context5 : null;
                if (activity == null) {
                    AbstractC0213Ey.m413k(-259480449185845L, view.getContext(), 0);
                } else {
                    Intent intent = new Intent(AbstractC0295Gu.m625r(-258973643044917L));
                    intent.addCategory(AbstractC0295Gu.m625r(-259128261867573L));
                    intent.setType(AbstractC0295Gu.m625r(-257620728346677L));
                    activity.startActivityForResult(intent, 18754);
                }
                break;
            case 5:
                Context context6 = view.getContext();
                AbstractC0295Gu.m625r(-257655088085045L);
                String strM625r5 = AbstractC0295Gu.m625r(-257723807561781L);
                String strM625r6 = AbstractC0295Gu.m625r(-257758167300149L);
                String strM625r7 = AbstractC0295Gu.m625r(-257358735341621L);
                C1442g8.f5046b.getClass();
                C1456gf.m2800R(context6, strM625r5, strM625r6, strM625r7, C1442g8.m2756i(), C1442g8.f5051g, new C2220m6(7));
                break;
            case 6:
                Context context7 = view.getContext();
                C0276Gb.f894g.getClass();
                EnumC1400fA[] enumC1400fAArrValues = EnumC1400fA.values();
                ArrayList arrayList3 = new ArrayList(enumC1400fAArrValues.length);
                for (EnumC1400fA enumC1400fA : enumC1400fAArrValues) {
                    arrayList3.add(enumC1400fA.f4968a);
                }
                String[] strArr = (String[]) arrayList3.toArray(new String[0]);
                SharedPreferences sharedPreferences2 = AbstractC0599Nx.f1939a;
                int iM1312G = AbstractC0650P4.m1312G(AbstractC0599Nx.m1173b(AbstractC0295Gu.m625r(-23317377447989L), AbstractC0295Gu.m625r(-24008867182645L)), strArr);
                Integer numValueOf = Integer.valueOf(iM1312G);
                if (iM1312G < 0) {
                    numValueOf = null;
                }
                AlertDialog alertDialogCreate3 = new AlertDialog.Builder(context7).setTitle(AbstractC0295Gu.m625r(-24034636986421L)).setSingleChoiceItems(strArr, numValueOf != null ? numValueOf.intValue() : 0, new DialogInterfaceOnClickListenerC0534Mb(strArr, view, context7, i2)).setNegativeButton(AbstractC0295Gu.m625r(-24073291692085L), (DialogInterface.OnClickListener) null).create();
                alertDialogCreate3.show();
                C1456gf.m2802T(alertDialogCreate3, false);
                break;
            case 7:
                Context context8 = view.getContext();
                AbstractC0295Gu.m625r(-29553669961781L);
                C1456gf.m2799Q(context8, AbstractC0295Gu.m625r(-29622389438517L), AbstractC0295Gu.m625r(-29656749176885L), AbstractC0295Gu.m625r(-29154238003253L), AbstractC0295Gu.m625r(-29270202120245L), new C0438K7(view, 1));
                break;
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                Context context9 = view.getContext();
                AbstractC0295Gu.m625r(-28059021342773L);
                C1456gf.m2799Q(context9, AbstractC0295Gu.m625r(-28127740819509L), AbstractC0295Gu.m625r(-28157805590581L), AbstractC0295Gu.m625r(-28230820034613L), AbstractC0295Gu.m625r(-26667451938869L), new C0438K7(view, 2));
                break;
            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                Context context10 = view.getContext();
                activity = context10 instanceof Activity ? (Activity) context10 : null;
                if (activity == null) {
                    AbstractC0213Ey.m413k(-8628589295669L, view.getContext(), 0);
                } else {
                    Intent intent2 = new Intent(AbstractC0295Gu.m625r(-8671538968629L));
                    intent2.addCategory(AbstractC0295Gu.m625r(-8276401977397L));
                    intent2.setType(AbstractC0295Gu.m625r(-8418135898165L));
                    intent2.putExtra(AbstractC0295Gu.m625r(-8435315767349L), new String[]{AbstractC0295Gu.m625r(-6923487279157L), AbstractC0295Gu.m625r(-6962141984821L), AbstractC0295Gu.m625r(-7000796690485L), AbstractC0295Gu.m625r(-7043746363445L), AbstractC0295Gu.m625r(-7142530611253L), AbstractC0295Gu.m625r(-6713033881653L)});
                    activity.startActivityForResult(intent2, 20302);
                }
                break;
            default:
                int i3 = TestActivity.f5577A;
                break;
        }
    }
}
