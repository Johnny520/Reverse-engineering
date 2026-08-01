package top.suzhelan.qstory.hook.item.chat;

import android.app.Dialog;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson2.AbstractC2904;
import com.bumptech.glide.AbstractC3056;
import com.google.android.flexbox.FlexboxLayout;
import java.util.ArrayList;
import kotlin.text.AbstractC5143;
import p007.C6132;
import p010.AbstractC6154;
import p027.DialogC6300;
import p028.C6301;
import p257.C8211;
import p391.C9114;
import top.suzhelan.qstory.ui.views.CustomChipGroup;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC5839 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f15989;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ View f15990;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f15991;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f15992;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15993;

    public /* synthetic */ ViewOnClickListenerC5839(FlexboxLayout flexboxLayout, LinearLayout linearLayout, TextView textView, EditText editText, Dialog dialog) {
        this.f15993 = 1;
        this.f15992 = flexboxLayout;
        this.f15990 = linearLayout;
        this.f15989 = textView;
        this.f15991 = editText;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f15993;
        Object obj = this.f15989;
        View view2 = this.f15990;
        Object obj2 = this.f15992;
        Object obj3 = this.f15991;
        switch (i) {
            case 0:
                DialogC6300 dialogC6300 = (DialogC6300) obj2;
                CheckBox checkBox = (CheckBox) view2;
                C5837 c5837 = (C5837) obj;
                String string = ((EditText) obj3).getText().toString();
                if (string.length() != 0) {
                    int i2 = Integer.parseInt(string);
                    boolean zIsChecked = checkBox.isChecked();
                    C6301 c6301 = c5837.f15985;
                    c6301.getClass();
                    c6301.m11808(Integer.valueOf(i2), AbstractC3056.m6668(-3937783015292536231L));
                    C6301 c63012 = c5837.f15985;
                    c63012.getClass();
                    c63012.m11808(Boolean.valueOf(zIsChecked), AbstractC3056.m6668(-3937783337415083431L));
                    C6301 c63013 = c5837.f15985;
                    c63013.getClass();
                    c63013.mo11807();
                    AbstractC6154.m11561(AbstractC3056.m6668(-3937608798534108583L));
                    dialogC6300.dismiss();
                } else {
                    AbstractC6154.m11561(AbstractC3056.m6668(-3937782413997114791L));
                    dialogC6300.dismiss();
                }
                break;
            case 1:
                C6132.f16715.getClass();
                C9114 c9114 = C6132.f16714;
                String strM6668 = AbstractC3056.m6668(-3937688255429084583L);
                c9114.getClass();
                c9114.f25485.remove(strM6668);
                C6132.m11524((FlexboxLayout) obj2, (LinearLayout) view2, (TextView) obj, (EditText) obj3);
                break;
            case 2:
                EditText editText = (EditText) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                CustomChipGroup customChipGroup = (CustomChipGroup) view2;
                View view3 = (View) obj;
                String string2 = AbstractC5143.m10150(editText.getText().toString()).toString();
                if (string2.length() == 0) {
                    C8211.m13720(AbstractC3056.m6668(-3937830775328867751L)).m13724();
                } else if (!arrayList.contains(string2)) {
                    arrayList.add(string2);
                    editText.getText().clear();
                    AbstractC2904.m6252(customChipGroup, arrayList, view3);
                } else {
                    C8211.m13720(AbstractC3056.m6668(-3937830667954685351L)).m13724();
                }
                break;
            default:
                ArrayList arrayList2 = (ArrayList) obj3;
                arrayList2.remove((String) obj2);
                AbstractC2904.m6252((CustomChipGroup) view2, arrayList2, (View) obj);
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC5839(Object obj, Object obj2, View view, Object obj3, int i) {
        this.f15993 = i;
        this.f15991 = obj;
        this.f15992 = obj2;
        this.f15990 = view;
        this.f15989 = obj3;
    }
}
