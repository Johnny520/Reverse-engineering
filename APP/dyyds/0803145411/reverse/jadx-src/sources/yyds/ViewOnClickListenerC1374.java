package yyds;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import com.kongzue.dialogx.interfaces.AbstractC0041;
import com.p000ss.android.ugc.aweme.yyds.R;
import com.p000ss.android.ugc.awemes.MainActivity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: renamed from: yyds.ᛶᛷᛲᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC1374 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ Object f6407;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f6408;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ Object f6409;

    public /* synthetic */ ViewOnClickListenerC1374(Object obj, int i, Object obj2) {
        this.f6408 = i;
        this.f6409 = obj;
        this.f6407 = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        File file;
        Object c2658;
        int i = 3;
        C0312 c0312 = null;
        Object[] objArr = 0;
        final int i2 = 1;
        switch (this.f6408) {
            case 0:
                ((C0312) this.f6409).f1626.mo371((C0324) this.f6407);
                break;
            case 1:
                C1633 c1633 = (C1633) this.f6409;
                Object obj = ((C0172) this.f6407).f997;
                if (obj == null) {
                    AbstractC2328.m4341(-215147369628526L);
                } else {
                    c0312 = (C0312) obj;
                }
                AbstractC2071.m3949(c1633, c0312);
                AbstractC1960.m3789(AbstractC2328.m4341(-215181729366894L));
                break;
            case 2:
                C0144 c0144 = (C0144) this.f6409;
                C2355 c2355 = (C2355) this.f6407;
                ArrayList arrayList = c2355.f11570;
                int iM784 = c0144.m784();
                if (iM784 != -1 && iM784 < arrayList.size()) {
                    c2355.f11569.mo511(Integer.valueOf(iM784), arrayList.get(iM784));
                    break;
                }
                break;
            case 3:
                C0184 c0184 = (C0184) this.f6409;
                AlertDialog alertDialog = (AlertDialog) this.f6407;
                int iOrdinal = c0184.f1085.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        C0188.m801();
                    } else {
                        File file2 = c0184.f1049;
                        if (file2 != null && file2.exists()) {
                            InterfaceC0477 interfaceC0477 = c0184.f1072;
                            if (interfaceC0477 != null) {
                                interfaceC0477.mo511(file2, alertDialog);
                            }
                            c0184.m767();
                        } else {
                            AbstractC1960.m3789(AbstractC2328.m4341(-167838304863086L));
                        }
                    }
                    break;
                } else {
                    C2355 c23552 = c0184.f1047;
                    if (c23552 != null && (file = c23552.f11567) != null) {
                        InterfaceC0477 interfaceC04772 = c0184.f1072;
                        if (interfaceC04772 != null) {
                            interfaceC04772.mo511(file, alertDialog);
                        }
                        c0184.m767();
                        break;
                    }
                }
                break;
            case 4:
                ((TextView) this.f6409).setText((String) this.f6407);
                break;
            case 5:
                ((C0485) ((C1460) this.f6409).f6962).mo371((C2236) this.f6407);
                break;
            case 6:
                ((C1258) this.f6409).f5813.mo371((C2089) this.f6407);
                break;
            case 7:
                C0912 c0912 = (C0912) this.f6409;
                C1223 c1223 = (C1223) this.f6407;
                C0073 c0073 = C0073.f636;
                C0073.f637 = null;
                c0912.m2031();
                c1223.mo731();
                break;
            case 8:
                View view2 = (View) this.f6409;
                TextView textView = (TextView) this.f6407;
                Context context = view2.getContext();
                AbstractC2328.m4341(-1085204664583022L);
                C1509.f7142.getClass();
                Set set = (Set) C1509.f7199.m1579(C1509.f7179[79]);
                final C1161 c1161 = new C1161(textView, i);
                AbstractC2328.m4341(-193956000990062L);
                AbstractC2328.m4341(-193990360728430L);
                AbstractC2328.m4341(-194054785237870L);
                final C0172 c0172 = new C0172();
                c0172.f997 = AbstractC1595.m3273(set);
                C0763 c0763M1709 = C0763.m1709(context);
                c0763M1709.f3532 = false;
                c0763M1709.f3518 = AbstractC2328.m4341(-194127799681902L);
                c0763M1709.mo1719();
                c0763M1709.f3522 = new C1807(set, c0172);
                c0763M1709.mo1719();
                c0763M1709.mo1714(AbstractC2328.m4341(-194157864452974L), new InterfaceC1376() { // from class: yyds.ᛷᛶᛶᛴ
                    @Override // yyds.InterfaceC1376
                    /* JADX INFO: renamed from: ᛲᲈᲁ */
                    public final boolean mo912(AbstractC0041 abstractC0041) {
                        int i3 = i2;
                        Object obj2 = c0172;
                        Object obj3 = c1161;
                        switch (i3) {
                            case 0:
                                String str = (String) obj3;
                                C1829 c1829 = (C1829) obj2;
                                try {
                                    Activity topActivity = ActivityStack.getTopActivity();
                                    C2336.f11496.m4354(AbstractC2328.m4341(-955067155514222L) + AbstractC0606.f2938);
                                    String absolutePath = topActivity.getExternalFilesDir(Environment.DIRECTORY_MUSIC).getAbsolutePath();
                                    AbstractC2328.m4341(-955127285056366L);
                                    C1985.m3846(topActivity, absolutePath, AbstractC2328.m4341(-955217479369582L), new C1182(str, 1, c1829));
                                } catch (Exception e) {
                                    C2336.f11496.m4354(AbstractC2328.m4341(-955238954206062L) + e);
                                    AbstractC1960.m3791(AbstractC2328.m4341(-955316263617390L) + e.getMessage());
                                }
                                break;
                            case 1:
                                ((C1161) obj3).mo371(((C0172) obj2).f997);
                                break;
                            case 2:
                                AbstractC2071.m3959((C2454) obj3, null, new C0853((C1829) obj2, null, 2), 3);
                                break;
                            case 3:
                                TextView textView2 = (TextView) obj2;
                                if (((SeekBar) ((C0172) obj3).f997) != null) {
                                    float progress = r8.getProgress() / 10.0f;
                                    C1509.f7142.getClass();
                                    C1509.f7289.m1581(C1509.f7179[145], Float.valueOf(progress));
                                    textView2.setText(AbstractC2104.m4000(new Object[]{Float.valueOf(progress)}, 1, AbstractC2328.m4341(-181642329752430L), -181663804588910L).concat("x"));
                                    AbstractC1960.m3789(AbstractC2328.m4341(-181715344196462L));
                                }
                                break;
                            default:
                                C0052 c0052 = (C0052) obj2;
                                C1509 c1509 = C1509.f7142;
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj4 : (List) obj3) {
                                    Object objComponent2 = ((Pair) obj4).component2();
                                    AbstractC2328.m4341(-102284219024238L);
                                    if (((Switch) objComponent2).isChecked()) {
                                        arrayList2.add(obj4);
                                    }
                                }
                                ArrayList arrayList3 = new ArrayList(AbstractC0055.m419(arrayList2, 10));
                                Iterator it = arrayList2.iterator();
                                while (it.hasNext()) {
                                    arrayList3.add((String) ((Pair) it.next()).component1());
                                }
                                Set setM3273 = AbstractC1595.m3273(arrayList3);
                                c1509.getClass();
                                AbstractC2328.m4341(-28883227935598L);
                                C0668 c0668 = C1509.f7206;
                                InterfaceC1989[] interfaceC1989Arr = C1509.f7179;
                                c0668.m1581(interfaceC1989Arr[203], setM3273);
                                C1509 c15092 = C1509.f7142;
                                int i4 = ((RadioGroup) c0052.f551).getCheckedRadioButtonId() == R.id.videoInfoMessageDialogRadio ? 0 : 1;
                                c15092.getClass();
                                C1509.f7158.m1581(interfaceC1989Arr[204], Integer.valueOf(i4));
                                AbstractC1960.m3789(AbstractC2328.m4341(-102352938500974L));
                                break;
                        }
                        return false;
                        return false;
                    }
                });
                c0763M1709.mo1713(AbstractC2328.m4341(-194170749354862L));
                c0763M1709.m1715(context);
                break;
            case 9:
                FrameLayout frameLayout = (FrameLayout) this.f6409;
                Aweme aweme = (Aweme) this.f6407;
                Context context2 = frameLayout.getContext();
                AbstractC2328.m4341(-1027622038045550L);
                AbstractC0181.m753(context2, aweme);
                break;
            case 10:
                AbstractC2071.m3959(AbstractC2797.m4924(), null, new C0219((Context) this.f6409, (C1274) this.f6407, objArr == true ? 1 : 0, 6), 3);
                break;
            case 11:
                String str = (String) this.f6409;
                C1633 c16332 = (C1633) this.f6407;
                String strM1299 = AbstractC0473.m1299(str, '/');
                EditText editText = (EditText) c16332.f8332;
                editText.setText(strM1299);
                editText.setSelection(strM1299.length());
                break;
            case 12:
                Context context3 = (Context) this.f6409;
                EditText editText2 = (EditText) ((C1633) this.f6407).f8332;
                AbstractC2328.m4341(-205539527787374L);
                Activity topActivity = context3 instanceof Activity ? (Activity) context3 : null;
                if (topActivity == null) {
                    topActivity = ActivityStack.getTopActivity();
                }
                if (topActivity == null) {
                    AbstractC1960.m3789(AbstractC2328.m4341(-204843743085422L));
                } else {
                    Intent intent = new Intent(AbstractC2328.m4341(-204882397791086L));
                    intent.addFlags(195);
                    try {
                        C1985.f9938 = new WeakReference(editText2);
                        topActivity.startActivityForResult(Intent.createChooser(intent, AbstractC2328.m4341(-205058491450222L)), 6609);
                    } catch (ActivityNotFoundException e) {
                        C1985.f9938 = null;
                        AbstractC1960.m3789(AbstractC2328.m4341(-205092851188590L));
                        C2336.f11496.m4358(AbstractC2328.m4341(-205131505894254L), e);
                        return;
                    }
                }
                break;
            case 13:
                C1096 c1096 = (C1096) this.f6409;
                C0827 c0827 = (C0827) this.f6407;
                int iM7842 = c1096.m784();
                if (iM7842 != -1) {
                    boolean zContains = c0827.f3763.contains(Integer.valueOf(iM7842));
                    boolean z = !zContains;
                    C0827 c08272 = c1096.f5062;
                    LinkedHashSet linkedHashSet = c08272.f3763;
                    if (!zContains ? linkedHashSet.add(Integer.valueOf(iM7842)) : linkedHashSet.remove(Integer.valueOf(iM7842))) {
                        c08272.f3762.mo371(Integer.valueOf(linkedHashSet.size()));
                    }
                    c1096.m2303(z);
                }
                break;
            case 14:
                ((C1232) this.f6409).f5651.mo371((C1981) this.f6407);
                break;
            case 15:
                MainActivity mainActivity = (MainActivity) this.f6409;
                C0539 c0539 = (C0539) this.f6407;
                List list = MainActivity.f451;
                mainActivity.m325(c0539);
                break;
            case 16:
                C0539 c05392 = (C0539) this.f6409;
                C0178 c0178 = (C0178) this.f6407;
                TextView textView2 = c05392.f2581;
                MainActivity mainActivity2 = c05392.f2584;
                C1416 c1416 = mainActivity2.f468;
                if (c1416 != null) {
                    mainActivity2.m325(textView2);
                    textView2.setEnabled(false);
                    textView2.setText(AbstractC2328.m4341(-1341854730322798L));
                    try {
                        c1416.m2879(Collections.singletonList(c0178.f1008), new C2632(mainActivity2, c05392, c0178));
                        c2658 = C2746.f13459;
                    } catch (Throwable th) {
                        c2658 = new C2658(th);
                    }
                    Throwable thM4249 = C2248.m4249(c2658);
                    if (thM4249 != null) {
                        textView2.setEnabled(true);
                        textView2.setText(AbstractC2328.m4341(-1341876205159278L));
                        Context context4 = c05392.getContext();
                        String strM4341 = AbstractC2328.m4341(-1341901974963054L);
                        String message = thM4249.getMessage();
                        if (message == null) {
                            message = AbstractC2328.m4341(-1341940629668718L);
                        }
                        Toast.makeText(context4, strM4341.concat(message), 0).show();
                    }
                } else {
                    Toast.makeText(c05392.getContext(), AbstractC2328.m4341(-1341790305813358L), 0).show();
                }
                break;
            case 17:
                Context context5 = (Context) this.f6409;
                EditText editText3 = (EditText) this.f6407;
                Activity topActivity2 = context5 instanceof Activity ? (Activity) context5 : null;
                if (topActivity2 == null) {
                    topActivity2 = ActivityStack.getTopActivity();
                }
                if (topActivity2 == null) {
                    AbstractC1960.m3789(AbstractC2328.m4341(-143984056501102L));
                } else {
                    Intent intent2 = new Intent(AbstractC2328.m4341(-144022711206766L));
                    intent2.addFlags(195);
                    try {
                        AbstractC0879.f4001 = new WeakReference(editText3);
                        topActivity2.startActivityForResult(Intent.createChooser(intent2, AbstractC2328.m4341(-144198804865902L)), 6608);
                    } catch (ActivityNotFoundException e2) {
                        AbstractC0879.f4001 = null;
                        AbstractC1960.m3789(AbstractC2328.m4341(-144233164604270L));
                        C2336.f11496.m4358(AbstractC2328.m4341(-144271819309934L), e2);
                        return;
                    }
                }
                break;
            case 18:
                C0947 c0947 = (C0947) this.f6409;
                C2214 c2214 = (C2214) this.f6407;
                C1022 c1022M2210 = C1022.m2210();
                c1022M2210.m2225(c0947.f4410);
                c1022M2210.m2222(c2214.f10952);
                c1022M2210.f3514 = AbstractC2328.m4341(-121504197673838L);
                c1022M2210.m2220();
                c1022M2210.m2218(AbstractC2328.m4341(-121517082575726L), new C2202(c0947, c2214, 0));
                c1022M2210.m1715(view.getContext());
                break;
            case 19:
                ArrayList arrayList2 = (ArrayList) this.f6409;
                C0118 c0118 = (C0118) this.f6407;
                List list2 = AbstractC2801.f13670;
                C1509 c1509 = C1509.f7142;
                String strM3285 = AbstractC1595.m3285(AbstractC2801.f13670, AbstractC2328.m4341(-577784343331694L), null, null, new C0514(26), 30);
                c1509.getClass();
                AbstractC2328.m4341(-27289795068782L);
                C0668 c0668 = C1509.f7157;
                InterfaceC1989[] interfaceC1989Arr = C1509.f7179;
                c0668.m1581(interfaceC1989Arr[130], strM3285);
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                AbstractC2328.m4341(-27324154807150L);
                C1509.f7299.m1581(interfaceC1989Arr[131], linkedHashSet2);
                arrayList2.clear();
                arrayList2.addAll(AbstractC2801.m4925());
                c0118.m1058();
                AbstractC1960.m3789(AbstractC2328.m4341(-224682197025646L));
                break;
            case 20:
                C1672 c1672 = (C1672) this.f6409;
                C2715 c2715 = (C2715) this.f6407;
                List list3 = AbstractC2801.f13670;
                C1509.f7142.getClass();
                Set setM3042 = C1509.m3042();
                String str2 = c1672.f8529;
                boolean zContains2 = setM3042.contains(str2);
                AbstractC2328.m4341(-577754278560622L);
                Set setM3273 = AbstractC1595.m3273(C1509.m3042());
                if (zContains2) {
                    setM3273.remove(str2);
                } else {
                    setM3273.add(str2);
                }
                AbstractC2328.m4341(-27324154807150L);
                C1509.f7299.m1581(C1509.f7179[131], setM3273);
                c2715.m4822(zContains2);
                AbstractC1960.m3789(AbstractC2328.m4341(-180564292961134L));
                break;
            case 21:
                AbstractC2071.m3959(AbstractC2797.m4924(), null, new C2429((Context) this.f6409, (Aweme) this.f6407, null, 0), 3);
                break;
            case 22:
                C0912 c09122 = (C0912) this.f6409;
                InterfaceC2266 interfaceC2266 = (InterfaceC2266) this.f6407;
                c09122.m2031();
                interfaceC2266.mo731();
                break;
            default:
                C1417 c1417 = (C1417) this.f6409;
                C1521 c1521 = (C1521) this.f6407;
                c1417.f6702 = !c1417.f6702;
                C1807.m3583(c1521, c1417);
                break;
        }
    }
}
