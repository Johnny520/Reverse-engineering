package top.suzhelan.qstory.hook.item.chat;

import android.app.Dialog;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.window.area.AbstractC3400;
import com.google.android.flexbox.FlexboxLayout;
import java.util.ArrayList;
import kotlin.text.AbstractC5976;
import p025.C6999;
import p026.AbstractC7014;
import p044.DialogC7148;
import p045.C7149;
import p273.C9041;
import p303.AbstractC9234;
import p407.C9924;
import top.suzhelan.qstory.p015ui.views.CustomChipGroup;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC6662 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f16311;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ View f16312;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f16313;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f16314;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16315;

    public /* synthetic */ ViewOnClickListenerC6662(FlexboxLayout flexboxLayout, LinearLayout linearLayout, TextView textView, EditText editText, Dialog dialog) {
        this.f16315 = 1;
        this.f16314 = flexboxLayout;
        this.f16312 = linearLayout;
        this.f16311 = textView;
        this.f16313 = editText;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f16315;
        Object obj = this.f16311;
        View view2 = this.f16312;
        Object obj2 = this.f16314;
        Object obj3 = this.f16313;
        switch (i) {
            case 0:
                DialogC7148 dialogC7148 = (DialogC7148) obj2;
                CheckBox checkBox = (CheckBox) view2;
                C6664 c6664 = (C6664) obj;
                String string = ((EditText) obj3).getText().toString();
                if (string.length() != 0) {
                    int i2 = Integer.parseInt(string);
                    boolean zIsChecked = checkBox.isChecked();
                    C7149 c7149 = c6664.f16320;
                    c7149.getClass();
                    c7149.m12395(Integer.valueOf(i2), AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵喵呜呜喵呜"));
                    C7149 c71492 = c6664.f16320;
                    c71492.getClass();
                    c71492.m12395(Boolean.valueOf(zIsChecked), AbstractC9234.m14531(2206));
                    C7149 c71493 = c6664.f16320;
                    c71493.getClass();
                    c71493.mo12394();
                    AbstractC7014.m12151(AbstractC9234.m14531(516));
                    dialogC7148.dismiss();
                } else {
                    AbstractC7014.m12151(AbstractC9234.m14531(2217));
                    dialogC7148.dismiss();
                }
                break;
            case 1:
                C6999.f17312.getClass();
                C9924 c9924 = C6999.f17311;
                String strM14532 = AbstractC9234.m14532("喵喵喵呜呜喵呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜喵呜喵~喵喵喵呜呜呜呜喵~喵喵喵呜呜喵喵喵");
                c9924.getClass();
                c9924.f25834.remove(strM14532);
                C6999.m12121((FlexboxLayout) obj2, (LinearLayout) view2, (TextView) obj, (EditText) obj3);
                break;
            case 2:
                EditText editText = (EditText) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                CustomChipGroup customChipGroup = (CustomChipGroup) view2;
                View view3 = (View) obj;
                String string2 = AbstractC5976.m10714(editText.getText().toString()).toString();
                if (string2.length() == 0) {
                    C9041.m14296(AbstractC9234.m14531(2735)).m14300();
                } else if (!arrayList.contains(string2)) {
                    arrayList.add(string2);
                    editText.getText().clear();
                    AbstractC3400.m5633(customChipGroup, arrayList, view3);
                } else {
                    C9041.m14296(AbstractC9234.m14531(2736)).m14300();
                }
                break;
            default:
                ArrayList arrayList2 = (ArrayList) obj3;
                arrayList2.remove((String) obj2);
                AbstractC3400.m5633((CustomChipGroup) view2, arrayList2, (View) obj);
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC6662(Object obj, Object obj2, View view, Object obj3, int i) {
        this.f16315 = i;
        this.f16313 = obj;
        this.f16314 = obj2;
        this.f16312 = view;
        this.f16311 = obj3;
    }
}
