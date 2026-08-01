package top.suzhelan.qstory.hook.item.chat;

import android.app.Dialog;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.window.area.AbstractC2567;
import com.google.android.flexbox.FlexboxLayout;
import java.util.ArrayList;
import kotlin.text.AbstractC5144;
import p009.C6170;
import p010.AbstractC6185;
import p028.DialogC6319;
import p029.C6320;
import p257.C8212;
import p287.AbstractC8405;
import p391.C9095;
import top.suzhelan.qstory.ui.views.CustomChipGroup;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC5832 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f15966;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ View f15967;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f15968;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f15969;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15970;

    public /* synthetic */ ViewOnClickListenerC5832(FlexboxLayout flexboxLayout, LinearLayout linearLayout, TextView textView, EditText editText, Dialog dialog) {
        this.f15970 = 1;
        this.f15969 = flexboxLayout;
        this.f15967 = linearLayout;
        this.f15966 = textView;
        this.f15968 = editText;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f15970;
        Object obj = this.f15966;
        View view2 = this.f15967;
        Object obj2 = this.f15969;
        Object obj3 = this.f15968;
        switch (i) {
            case 0:
                DialogC6319 dialogC6319 = (DialogC6319) obj2;
                CheckBox checkBox = (CheckBox) view2;
                C5834 c5834 = (C5834) obj;
                String string = ((EditText) obj3).getText().toString();
                if (string.length() != 0) {
                    int i2 = Integer.parseInt(string);
                    boolean zIsChecked = checkBox.isChecked();
                    C6320 c6320 = c5834.f15975;
                    c6320.getClass();
                    c6320.m11836(Integer.valueOf(i2), AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵喵呜呜喵呜"));
                    C6320 c63202 = c5834.f15975;
                    c63202.getClass();
                    c63202.m11836(Boolean.valueOf(zIsChecked), AbstractC8405.m13972(2206));
                    C6320 c63203 = c5834.f15975;
                    c63203.getClass();
                    c63203.mo11835();
                    AbstractC6185.m11592(AbstractC8405.m13972(516));
                    dialogC6319.dismiss();
                } else {
                    AbstractC6185.m11592(AbstractC8405.m13972(2217));
                    dialogC6319.dismiss();
                }
                break;
            case 1:
                C6170.f16967.getClass();
                C9095 c9095 = C6170.f16966;
                String strM13973 = AbstractC8405.m13973("喵喵喵呜呜喵呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜喵呜喵~喵喵喵呜呜呜呜喵~喵喵喵呜呜喵喵喵");
                c9095.getClass();
                c9095.f25489.remove(strM13973);
                C6170.m11562((FlexboxLayout) obj2, (LinearLayout) view2, (TextView) obj, (EditText) obj3);
                break;
            case 2:
                EditText editText = (EditText) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                CustomChipGroup customChipGroup = (CustomChipGroup) view2;
                View view3 = (View) obj;
                String string2 = AbstractC5144.m10155(editText.getText().toString()).toString();
                if (string2.length() == 0) {
                    C8212.m13737(AbstractC8405.m13972(2735)).m13741();
                } else if (!arrayList.contains(string2)) {
                    arrayList.add(string2);
                    editText.getText().clear();
                    AbstractC2567.m5073(customChipGroup, arrayList, view3);
                } else {
                    C8212.m13737(AbstractC8405.m13972(2736)).m13741();
                }
                break;
            default:
                ArrayList arrayList2 = (ArrayList) obj3;
                arrayList2.remove((String) obj2);
                AbstractC2567.m5073((CustomChipGroup) view2, arrayList2, (View) obj);
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC5832(Object obj, Object obj2, View view, Object obj3, int i) {
        this.f15970 = i;
        this.f15968 = obj;
        this.f15969 = obj2;
        this.f15967 = view;
        this.f15966 = obj3;
    }
}
