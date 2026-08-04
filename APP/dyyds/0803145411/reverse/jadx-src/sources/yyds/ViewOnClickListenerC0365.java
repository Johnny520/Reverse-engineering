package yyds;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import com.android.NativeUtil;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: yyds.ᛲᛶᛱᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0365 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f1880;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ Object f1881;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f1882;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f1883;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ Object f1884;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ Object f1885;

    public /* synthetic */ ViewOnClickListenerC0365(Dialog dialog, Context context, List list, C0172 c0172, Aweme aweme) {
        this.f1883 = 2;
        this.f1882 = dialog;
        this.f1885 = context;
        this.f1881 = list;
        this.f1884 = c0172;
        this.f1880 = aweme;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object c2658;
        String string;
        C0827 c0827;
        Pair pairM4707;
        int i = this.f1883;
        int i2 = 2;
        int i3 = 3;
        Object obj = null;
        Object obj2 = null;
        Object obj3 = this.f1880;
        Object obj4 = this.f1882;
        Object obj5 = this.f1884;
        Object obj6 = this.f1881;
        Object obj7 = this.f1885;
        switch (i) {
            case 0:
                C2531 c2531 = (C2531) obj7;
                C0468 c0468 = (C0468) obj6;
                InterfaceC2266 interfaceC2266 = (InterfaceC2266) obj5;
                Dialog dialog = (Dialog) obj4;
                C2565 c2565 = (C2565) obj3;
                EditText editText = (EditText) c2531.f12462;
                TextView textView = c2531.f12468;
                Editable text = editText.getText();
                String string2 = (text == null || (string = text.toString()) == null) ? null : AbstractC0473.m1314(string).toString();
                if (string2 == null) {
                    string2 = AbstractC2328.m4341(-215301988451182L);
                }
                String str = string2;
                EnumC1841 enumC1841 = (EnumC1841) AbstractC1595.m3276(((Spinner) c2531.f12464).getSelectedItemPosition(), c0468);
                if (enumC1841 == null) {
                    enumC1841 = EnumC1841.f9230;
                }
                EnumC1841 enumC18412 = enumC1841;
                Editable text2 = ((EditText) c2531.f12465).getText();
                String string3 = text2 != null ? text2.toString() : null;
                if (string3 == null) {
                    string3 = AbstractC2328.m4341(-215306283418478L);
                }
                String str2 = string3;
                try {
                    C1937 c1937 = C1937.f9742;
                    C2565 c25652 = new C2565(str, enumC18412, str2, ((Switch) c2531.f12461).isChecked(), System.currentTimeMillis());
                    String str3 = c2565 != null ? c2565.f12649 : null;
                    c1937.getClass();
                    C1937.m3729(c25652, str3);
                    c2658 = C2746.f13459;
                } catch (Throwable th) {
                    c2658 = new C2658(th);
                }
                Throwable thM4249 = C2248.m4249(c2658);
                if (thM4249 == null) {
                    interfaceC2266.mo731();
                    dialog.dismiss();
                    AbstractC1960.m3789(AbstractC2328.m4341(-215332053222254L));
                    return;
                } else {
                    String message = thM4249.getMessage();
                    if (message == null) {
                        message = AbstractC2328.m4341(-215310578385774L);
                    }
                    textView.setText(message);
                    textView.setVisibility(0);
                    return;
                }
            case 1:
                Context context = (Context) obj7;
                String str4 = (String) obj6;
                String str5 = (String) obj5;
                String str6 = (String) obj4;
                C2803 c2803 = (C2803) obj3;
                Iterator it = AbstractC1838.m3608().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        C1981 c1981 = (C1981) next;
                        if (AbstractC1544.m3188(c1981.m3815(), str6) && c1981.m3817() == EnumC0521.f2506) {
                            obj2 = next;
                        }
                    }
                }
                C1981 c19812 = (C1981) obj2;
                if (c19812 != null) {
                    AbstractC0427.m1188(context, c19812, new C2661(c2803, context, str6, i2));
                    return;
                } else {
                    C1586.m3251(context, str4, str5, str6, AbstractC2328.m4341(-928992409060206L), new C2732((Object) c2803, context, (Object) str6, i3));
                    return;
                }
            case 2:
                Context context2 = (Context) obj7;
                List list = (List) obj6;
                Aweme aweme = (Aweme) obj3;
                ((Dialog) obj4).dismiss();
                Object obj8 = ((C0172) obj5).f997;
                if (obj8 == null) {
                    AbstractC2328.m4341(-120975916696430L);
                    c0827 = null;
                } else {
                    c0827 = (C0827) obj8;
                }
                List listM3265 = AbstractC1595.m3265(c0827.f3763);
                AbstractC2328.m4341(-120366031340398L);
                AbstractC2328.m4341(-120400391078766L);
                AbstractC2328.m4341(-120443340751726L);
                AbstractC2328.m4341(-120520650163054L);
                if (list.isEmpty()) {
                    AbstractC1960.m3789(AbstractC2328.m4341(-120546419966830L));
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj9 : listM3265) {
                    int iIntValue = ((Number) obj9).intValue();
                    if (iIntValue >= 0 && iIntValue < list.size()) {
                        arrayList.add(obj9);
                    }
                }
                boolean zIsEmpty = arrayList.isEmpty();
                List listM3269 = arrayList;
                if (zIsEmpty) {
                    listM3269 = AbstractC1595.m3269(AbstractC2725.m4849(list));
                }
                AbstractC2071.m3959(AbstractC2797.m4924(), null, new C1513(listM3269, list, aweme, context2, null), 3);
                return;
            case 3:
                Context context3 = (Context) obj7;
                String str7 = (String) obj6;
                String str8 = (String) obj5;
                String str9 = (String) obj4;
                C2803 c28032 = (C2803) obj3;
                Iterator it2 = AbstractC1838.m3608().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object next2 = it2.next();
                        C1981 c19813 = (C1981) next2;
                        if (AbstractC1544.m3188(c19813.m3815(), str9) && c19813.m3817() == EnumC0521.f2504) {
                            obj = next2;
                        }
                    }
                }
                C1981 c19814 = (C1981) obj;
                if (c19814 != null) {
                    AbstractC0427.m1188(context3, c19814, new C2661(c28032, context3, str9, i3));
                    return;
                } else {
                    C1586.m3251(context3, str7, str8, str9, AbstractC2328.m4341(-625789192799086L), new C2732((Object) c28032, context3, (Object) str9, 4));
                    return;
                }
            case 4:
                C0246.m895((C1417) obj7, (View) obj6, (TextView) obj5, (View) obj4, (View) obj3, !r2.f6702);
                return;
            case 5:
                final String[] strArr = (String[]) obj7;
                final TextView textView2 = (TextView) obj5;
                final View view2 = (View) obj4;
                final Switch r6 = (Switch) obj3;
                C1022 c1022M2210 = C1022.m2210();
                c1022M2210.m2215(strArr);
                c1022M2210.m2211();
                C1509.f7142.getClass();
                c1022M2210.m2225(AbstractC0598.m1487(C1509.m3047(), 0, 2));
                c1022M2210.f3518 = AbstractC2328.m4341(-139783578485614L);
                c1022M2210.m2220();
                c1022M2210.f3527 = AbstractC2328.m4341(-139813643256686L);
                c1022M2210.m2220();
                c1022M2210.f4668 = new InterfaceC0413() { // from class: yyds.ᲈᛴᛳᛱ
                    static {
                        NativeUtil.classesInit0(143);
                    }

                    @Override // yyds.InterfaceC0413
                    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
                    public final native void mo1173(int i4, Object obj10);
                };
                c1022M2210.f3514 = AbstractC2328.m4341(-139895247635310L);
                c1022M2210.m2220();
                c1022M2210.m1715((Context) obj6);
                return;
            default:
                C1127 c1127 = (C1127) obj7;
                C0172 c0172 = (C0172) obj5;
                C0172 c01722 = (C0172) obj4;
                AlertDialog alertDialog = (AlertDialog) obj3;
                String strM2001 = AbstractC0897.m2001((EditText) c1127.f5189);
                String strM20012 = AbstractC0897.m2001((EditText) c1127.f5188);
                C2089 c2089 = (C2089) ((C0172) obj6).f997;
                if (c2089 == null) {
                    AbstractC1960.m3789(AbstractC2328.m4341(-134139991458670L));
                    return;
                }
                boolean z = c2089.f10376;
                if (strM2001.length() == 0) {
                    AbstractC1960.m3789(AbstractC2328.m4341(-134174351197038L));
                    return;
                }
                if (!strM2001.equals(z ? c2089.f10368 : c2089.f10369)) {
                    AbstractC1960.m3789(AbstractC2328.m4341(-134213005902702L));
                    return;
                }
                if (AbstractC1544.m3188(c0172.f997, AbstractC2328.m4341(-134307495183214L)) && strM20012.length() == 0) {
                    AbstractC1960.m3789(AbstractC2328.m4341(-134320380085102L));
                    return;
                }
                if (AbstractC1544.m3188(c0172.f997, AbstractC2328.m4341(-134354739823470L)) && c01722.f997 == null) {
                    AbstractC1960.m3789(AbstractC2328.m4341(-134389099561838L));
                    return;
                }
                String strM4341 = AbstractC2328.m4341(z ? -134444934136686L : -134457819038574L);
                if (AbstractC1544.m3188(c0172.f997, AbstractC2328.m4341(-134470703940462L))) {
                    Object obj10 = c01722.f997;
                    if (obj10 == null) {
                        throw new IllegalStateException(AbstractC2328.m4341(-134505063678830L).toString());
                    }
                    C1132 c1132 = (C1132) obj10;
                    C2336 c2336 = C2336.f11496;
                    StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-134612437861230L));
                    sb.append(strM4341);
                    sb.append(AbstractC2328.m4341(-134663977468782L));
                    sb.append(strM2001);
                    sb.append(AbstractC2328.m4341(-134694042239854L));
                    String strM2318 = c1132.m2318();
                    if (AbstractC0473.m1313(strM2318)) {
                        strM2318 = c1132.m2320();
                    }
                    sb.append(strM2318);
                    c2336.m4354(sb.toString());
                    C2615.f12860.getClass();
                    pairM4707 = C2615.m4721(strM2001, c1132, z);
                } else {
                    C2336.f11496.m4354(AbstractC2328.m4341(-134719812043630L) + strM4341 + AbstractC2328.m4341(-134771351651182L) + strM2001 + AbstractC2328.m4341(-134801416422254L) + strM20012);
                    C2615.f12860.getClass();
                    pairM4707 = C2615.m4707(strM2001, strM20012, z);
                }
                AbstractC1960.m3789(((Boolean) pairM4707.getFirst()).booleanValue() ? AbstractC2328.m4341(-134827186226030L) : (String) pairM4707.getSecond());
                if (((Boolean) pairM4707.getFirst()).booleanValue()) {
                    alertDialog.dismiss();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ ViewOnClickListenerC0365(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f1883 = i;
        this.f1885 = obj;
        this.f1881 = obj2;
        this.f1884 = obj3;
        this.f1882 = obj4;
        this.f1880 = obj5;
    }
}
