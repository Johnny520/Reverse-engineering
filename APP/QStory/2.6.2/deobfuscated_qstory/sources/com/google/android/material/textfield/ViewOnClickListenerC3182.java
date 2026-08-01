package com.google.android.material.textfield;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import androidx.compose.ui.platform.RunnableC1898;
import androidx.fragment.app.AbstractC2313;
import androidx.fragment.app.AbstractComponentCallbacksC2338;
import androidx.fragment.app.C2332;
import androidx.fragment.app.C2358;
import com.bumptech.glide.AbstractC3056;
import com.davemorrissey.labs.subscaleview.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC4343;
import lin.xposed.hook.javaplugin.view.C5546;
import lin.xposed.hook.javaplugin.view.ViewOnClickListenerC5543;
import lin.xposed.hook.view.main.MainSettingActivity;
import lin.xposed.hook.view.main.itemview.info.DirectoryUiInfo;
import p007.C6144;
import p008.C6150;
import p008.C6151;
import p010.AbstractC6154;
import p010.AbstractC6157;
import p011.RunnableC6163;
import p011.ViewOnClickListenerC6162;
import p026.AbstractC6293;
import p027.DialogC6300;
import p028.C6301;
import p028.C6302;
import p033.AbstractC6333;
import p035.AbstractC6340;
import p035.C6338;
import p035.C6344;
import p038.C6376;
import p038.ViewOnClickListenerC6375;
import p043.C6447;
import p144.C7546;
import p193.C7827;
import p257.C8197;
import p257.C8204;
import p257.C8207;
import p257.C8227;
import p257.C8232;
import p257.C8239;
import p316.C8675;
import p319.C8700;
import p320.C8708;
import p320.C8710;
import p320.C8712;
import p321.C8721;
import p324.C8748;
import p327.C8773;
import p335.AbstractC8804;
import p352.C8873;
import p352.C8881;
import p356.C8907;
import top.suzhelan.qstory.hook.item.C5879;
import top.suzhelan.qstory.hook.item.C5882;
import top.suzhelan.qstory.hook.item.C5922;
import top.suzhelan.qstory.hook.item.ViewOnClickListenerC5906;
import top.suzhelan.qstory.hook.item.chat.C5837;
import top.suzhelan.qstory.hook.item.chat.C5841;
import top.suzhelan.qstory.hook.item.chat.C5854;
import top.suzhelan.qstory.hook.item.chat.C5863;
import top.suzhelan.qstory.hook.item.chat.ViewOnClickListenerC5830;
import top.suzhelan.qstory.hook.item.chat.ViewOnClickListenerC5839;

/* JADX INFO: renamed from: com.google.android.material.textfield.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC3182 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f10683;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f10684;

    public /* synthetic */ ViewOnClickListenerC3182(Object obj, int i) {
        this.f10684 = i;
        this.f10683 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View.OnClickListener onClickListenerMo11193;
        int i = this.f10684;
        int i2 = 4;
        int i3 = 0;
        Object obj = this.f10683;
        switch (i) {
            case 0:
                C3178 c3178 = (C3178) obj;
                EditText editText = c3178.f10675;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (view.hasFocus()) {
                    c3178.f10675.requestFocus();
                }
                if (text != null) {
                    text.clear();
                }
                c3178.m7268();
                return;
            case 1:
                ((C3198) obj).m7289();
                return;
            case 2:
                C3188 c3188 = (C3188) obj;
                EditText editText2 = c3188.f10738;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = c3188.f10738;
                i = (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) ? 0 : 1;
                EditText editText4 = c3188.f10738;
                if (i != 0) {
                    editText4.setTransformationMethod(null);
                } else {
                    editText4.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                if (selectionEnd >= 0) {
                    c3188.f10738.setSelection(selectionEnd);
                }
                c3188.m7268();
                return;
            case 3:
                C5922 c5922 = (C5922) obj;
                if (c5922.f16107 == null) {
                    c5922.f16107 = new C6302("GrabHb", "LIN_XPOSED_QQ");
                }
                Context context = view.getContext();
                DialogC6300 dialogC6300 = new DialogC6300(context);
                dialogC6300.m11805(dialogC6300.m11806());
                View viewInflate = LayoutInflater.from(context).inflate(R.layout.set_redpacket_params, (ViewGroup) null, false);
                ((TextView) viewInflate.findViewById(R.id.tv_grabHbParamTitle)).setText("\u62a2\u7ea2\u5305\u53c2\u6570(\u65b0)");
                EditText editText5 = (EditText) viewInflate.findViewById(R.id.delay_hb_edit);
                EditText editText6 = (EditText) viewInflate.findViewById(R.id.redpack_blacklistTroop);
                EditText editText7 = (EditText) viewInflate.findViewById(R.id.redpack_blacklistText);
                EditText editText8 = (EditText) viewInflate.findViewById(R.id.hb_reply);
                EditText editText9 = (EditText) viewInflate.findViewById(R.id.hb_reply_delay);
                EditText editText10 = (EditText) viewInflate.findViewById(R.id.hb_average);
                CheckBox checkBox = (CheckBox) viewInflate.findViewById(R.id.grab_hb_toast);
                CheckBox checkBox2 = (CheckBox) viewInflate.findViewById(R.id.ordinary_hb_checkbox);
                CheckBox checkBox3 = (CheckBox) viewInflate.findViewById(R.id.exclusive_hb_checkbox);
                Button button = (Button) viewInflate.findViewById(R.id.save_red_pack_param_btn);
                editText5.setText(String.valueOf(Long.parseLong(String.valueOf(c5922.f16107.m11812(0, "delay")))));
                editText6.setText((CharSequence) c5922.f16107.m11812(null, "blacklistTroop"));
                editText7.setText((CharSequence) c5922.f16107.m11812(null, "blacklistText"));
                editText8.setText((CharSequence) c5922.f16107.m11812(null, "replyText"));
                editText9.setText(String.valueOf(Long.parseLong(String.valueOf(c5922.f16107.m11812(0, "replyDelay")))));
                editText10.setText(String.valueOf(Long.parseLong(String.valueOf(c5922.f16107.m11812(0, "expectAmount")))));
                C6302 c6302 = c5922.f16107;
                String strM6668 = "grabToast";
                Boolean bool = Boolean.TRUE;
                checkBox.setChecked(((Boolean) c6302.m11812(bool, strM6668)).booleanValue());
                checkBox2.setChecked(((Boolean) c5922.f16107.m11812(bool, "ordinary")).booleanValue());
                checkBox3.setChecked(((Boolean) c5922.f16107.m11812(Boolean.FALSE, "exclusiveRedEnvelopes")).booleanValue());
                button.setOnClickListener(new ViewOnClickListenerC5906(c5922, editText5, editText6, editText7, editText8, editText9, editText10, checkBox, checkBox2, checkBox3, dialogC6300));
                dialogC6300.setContentView(viewInflate);
                dialogC6300.show();
                return;
            case 4:
                C5882 c5882 = (C5882) obj;
                Context context2 = view.getContext();
                "getContext(...)";
                context2.getClass();
                String[] strArr = (String[]) c5882.f16055.keySet().toArray(new String[0]);
                C8204 c8204M13701 = C8204.m13701();
                c8204M13701.f22615 = "\u7be1\u6539\u56fe\u7247\u663e\u793a\u5927\u5c0f";
                c8204M13701.m13710();
                c8204M13701.m13711(strArr);
                c8204M13701.f22609 = new C5879(c5882);
                c8204M13701.m13714();
                return;
            case 5:
                C5854 c5854 = (C5854) obj;
                int i4 = C5854.f16010;
                Context context3 = AbstractC6340.f17460;
                "getHostAppContext(...)";
                context3.getClass();
                "context";
                C8227 c8227 = new C8227();
                c8227.f22615 = "\u8bbe\u7f6e\u8f93\u5165\u6846\u63d0\u793a\u6587\u5b57";
                c8227.mo13704();
                c8227.f22627 = "\u8bbe\u7f6e\u65b0\u63d0\u793a\u8bcd\u540e\u9700\u8981\u91cd\u542f\u751f\u6548";
                c8227.mo13704();
                c8227.f22628 = c5854.m11202();
                c8227.mo13704();
                c8227.f22630 = "\u53d6\u6d88";
                c8227.mo13704();
                c8227.f22626 = "\u4fdd\u5b58";
                c8227.mo13704();
                c8227.f22624 = new C5863(c5854, i3);
                c8227.m13714();
                return;
            case 6:
                C5841 c5841 = (C5841) obj;
                if (c5841.f16000 == null) {
                    c5841.f16000 = new C6301("Repetition");
                }
                Context context4 = view.getContext();
                "getContext(...)";
                context4.getClass();
                DialogC6300 dialogC63002 = new DialogC6300(context4);
                View viewInflate2 = LayoutInflater.from(context4).inflate(R.layout.repetition_params, (ViewGroup) null, false);
                CheckBox checkBox4 = (CheckBox) viewInflate2.findViewById(R.id.repetition_doubleClick);
                C6301 c6301 = c5841.f16000;
                c6301.getClass();
                Object objM11812 = c6301.m11812(Boolean.FALSE, "doubleClick");
                "get(...)";
                objM11812.getClass();
                checkBox4.setChecked(((Boolean) objM11812).booleanValue());
                EditText editText11 = (EditText) viewInflate2.findViewById(R.id.repetition_size);
                C6301 c63012 = c5841.f16000;
                c63012.getClass();
                editText11.setText(String.valueOf((Integer) c63012.m11812(26, "size")));
                ((Button) viewInflate2.findViewById(R.id.repetition_save)).setOnClickListener(new ViewOnClickListenerC5830(editText11, dialogC63002, c5841, context4, checkBox4, 0));
                dialogC63002.setContentView(viewInflate2);
                dialogC63002.show();
                return;
            case 7:
                C5837 c5837 = (C5837) obj;
                if (c5837.f15985 == null) {
                    c5837.f15985 = new C6301("RepetitionPlus");
                }
                Context context5 = view.getContext();
                "getContext(...)";
                context5.getClass();
                DialogC6300 dialogC63003 = new DialogC6300(context5);
                View viewInflate3 = LayoutInflater.from(context5).inflate(R.layout.repetition_params, (ViewGroup) null, false);
                CheckBox checkBox5 = (CheckBox) viewInflate3.findViewById(R.id.repetition_doubleClick);
                C6301 c63013 = c5837.f15985;
                c63013.getClass();
                Object objM118122 = c63013.m11812(Boolean.FALSE, "doubleClick");
                "get(...)";
                objM118122.getClass();
                checkBox5.setChecked(((Boolean) objM118122).booleanValue());
                EditText editText12 = (EditText) viewInflate3.findViewById(R.id.repetition_size);
                C6301 c63014 = c5837.f15985;
                c63014.getClass();
                editText12.setText(String.valueOf((Integer) c63014.m11812(50, "size")));
                ((Button) viewInflate3.findViewById(R.id.repetition_save)).setOnClickListener(new ViewOnClickListenerC5839(editText12, dialogC63003, checkBox5, c5837, 0));
                dialogC63003.setContentView(viewInflate3);
                dialogC63003.show();
                return;
            case 8:
                AbstractC6293 abstractC6293 = ((C6144) obj).f16753;
                if (abstractC6293 == null || (onClickListenerMo11193 = abstractC6293.mo11193()) == null) {
                    return;
                }
                onClickListenerMo11193.onClick(view);
                return;
            case 9:
                DirectoryUiInfo directoryUiInfo = (DirectoryUiInfo) obj;
                try {
                    Context context6 = view.getContext();
                    MainSettingActivity mainSettingActivity = context6 instanceof MainSettingActivity ? (MainSettingActivity) context6 : null;
                    if (mainSettingActivity == null) {
                        return;
                    }
                    String itemName = directoryUiInfo.getItemName();
                    "getItemName(...)";
                    itemName.getClass();
                    mainSettingActivity.setTitleCenterText(itemName);
                    Bundle bundle = new Bundle();
                    bundle.putString("TAG", directoryUiInfo.getItemName());
                    AbstractC2313 abstractC2313M4449 = C6150.f16767.m4449();
                    "getParentFragmentManager(...)";
                    AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338M4365 = abstractC2313M4449.m4365(directoryUiInfo.getItemName());
                    if (abstractComponentCallbacksC2338M4365 == null) {
                        abstractComponentCallbacksC2338M4365 = new C6151(directoryUiInfo);
                        abstractComponentCallbacksC2338M4365.m4429(bundle);
                    }
                    C2332 c2332 = new C2332(abstractC2313M4449);
                    c2332.f6845 = R.anim.slide_in_from_right;
                    c2332.f6844 = R.anim.slide_out_to_left;
                    c2332.f6843 = R.anim.fragment_pop_enter;
                    c2332.f6842 = R.anim.fragment_pop_exit;
                    if (!c2332.f6854) {
                        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
                    }
                    c2332.f6855 = true;
                    c2332.f6858 = null;
                    MainSettingActivity.Companion.getClass();
                    c2332.m4421(R.id.itemList_container, abstractComponentCallbacksC2338M4365, directoryUiInfo.getItemName());
                    c2332.m4418(false);
                    return;
                } catch (Exception e) {
                    AbstractC6157.m11575(e);
                    return;
                }
            case 10:
                MainSettingActivity.setTitleBarAttribute$lambda$1((MainSettingActivity) obj, view);
                return;
            case 11:
                ((C6151) obj).m4433().onBackPressed();
                return;
            case 12:
                AbstractC8804.f24777.execute(new RunnableC6163((ViewOnClickListenerC6162) obj, i3));
                return;
            case 13:
                C8675.m14361(view.getContext(), ((C6338) obj).f17457);
                AbstractC6154.m11561("\u8def\u5f84\u5df2\u590d\u5236");
                return;
            case 14:
                C8675.m14361(view.getContext(), ((C6344) obj).f17471);
                AbstractC6154.m11561("\u8def\u5f84\u5df2\u590d\u5236");
                return;
            case 15:
                AbstractC6333.m11887((Context) obj);
                return;
            case 16:
                C6376 c6376 = (C6376) obj;
                Context context7 = view.getContext();
                DialogC6300 dialogC63004 = new DialogC6300(context7);
                View viewInflate4 = LayoutInflater.from(context7).inflate(R.layout.text_send_change, (ViewGroup) null, false);
                EditText editText13 = (EditText) viewInflate4.findViewById(R.id.messageTextPrefix_edit);
                C6301 c63015 = c6376.f17513;
                editText13.setText((CharSequence) c63015.m11811("prefix"));
                EditText editText14 = (EditText) viewInflate4.findViewById(R.id.messageTextSuffix_edit);
                editText14.setText((CharSequence) c63015.m11811("suffix"));
                EditText editText15 = (EditText) viewInflate4.findViewById(R.id.time_format);
                editText15.setText((CharSequence) c63015.m11811("time_format"));
                ((Button) viewInflate4.findViewById(R.id.save_send_text_btn)).setOnClickListener(new ViewOnClickListenerC6375(c6376, editText13, editText14, editText15, dialogC63004));
                dialogC63004.setContentView(viewInflate4);
                dialogC63004.show();
                return;
            case 17:
                ((DialogC6300) obj).dismiss();
                return;
            case 18:
                C6447 c6447 = (C6447) obj;
                if (c6447.f17682 == null) {
                    c6447.f17682 = new C6301("AtTextSummaryChange");
                }
                Context context8 = view.getContext();
                DialogC6300 dialogC63005 = new DialogC6300(context8);
                View viewInflate5 = LayoutInflater.from(context8).inflate(R.layout.set_at_text_summary, (ViewGroup) null, false);
                EditText editText16 = (EditText) viewInflate5.findViewById(R.id.at_text_summary_edit);
                editText16.setText((String) c6447.f17682.m11811("summary"));
                ((Button) viewInflate5.findViewById(R.id.save_at_text_summary_btn)).setOnClickListener(new ViewOnClickListenerC5543(c6447, editText16, dialogC63005, i2));
                dialogC63005.setContentView(viewInflate5);
                dialogC63005.show();
                return;
            case 19:
                ((C8239) obj).m13747();
                C8197 c8197M13690 = C8197.m13690("\u6b63\u5728\u626b\u63cf\u8868\u60c5\u6587\u4ef6...");
                c8197M13690.f22576 = new C7546(14);
                c8197M13690.m13694();
                new Thread(new RunnableC1898(13)).start();
                return;
            case 20:
                C8712 c8712 = (C8712) obj;
                int i5 = C8712.f24573;
                C8881 c8881 = new C8881(new C2358(c8712, 23));
                c8881.m14523(c8712.f24575.m14643(String.class, "TroopUinList"));
                c8881.f25030.mo13705("\u4eca\u65e5\u672a\u6253\u5361\u7684\u7fa4\u804a\u4f1a\u7acb\u523b\u6253\u5361");
                c8881.m14522();
                return;
            case 21:
                C8710 c8710 = (C8710) obj;
                C8881 c88812 = new C8881(new C2358(c8710, 24));
                c88812.m14523(c8710.f24569.m14643(String.class, "TroopUinList"));
                c88812.f25030.mo13705("\u4eca\u65e5\u672a\u6253\u5361\u7684\u7fa4\u804a\u4f1a\u7acb\u523b\u6253\u5361");
                c88812.m14522();
                return;
            case 22:
                C8708 c8708 = (C8708) obj;
                C8881 c88813 = new C8881(new C2358(c8708, 25));
                c88813.m14523(c8708.f24565.m14643(String.class, "TroopUinList"));
                c88813.f25030.mo13705("\u4eca\u65e5\u672a\u6253\u5361\u7684\u7fa4\u804a\u4f1a\u7acb\u523b\u6253\u5361");
                c88813.m14522();
                return;
            case 23:
                int i6 = C8721.f24585;
                C8207.m13712("\u70b9\u51fb\u53d1\u9001\u540e\u4f1a\u7acb\u523b\u53d1\u9001\u4e00\u6761QQ\u7a7a\u95f4\u8fdb\u884c\u6d4b\u8bd5,\u4e0e\u5176\u4ed6\u7a7a\u95f4\u529f\u80fd\u6709\u8054\u52a8\u8c03\u8bd5\u914d\u5408\u6027", "\u624b\u52a8\u53d1\u9001\u8fdb\u884c\u6d4b\u8bd5").mo13702("\u53d1\u9001", new C8700((C8721) obj, i));
                return;
            case 24:
                ((C8748) obj).f24654.m14386();
                return;
            case 25:
                String str = C8773.f24710;
                C8207.m13712("\u624b\u52a8\u5907\u4efd\u4e0d\u4f1a\u541e\u566c\u4eca\u65e5\u65e7\u5907\u4efd \u4eca\u65e5\u5907\u4efd\u5c06\u5728\u7b2c\u4e8c\u5929\u81ea\u52a8\u5220\u9664\n\n\u5907\u4efd\u8def\u5f84\uff1a" + C8773.f24711, "\u624b\u52a8\u5907\u4efd\u6d4b\u8bd5").mo13702("\u5f00\u59cb\u5907\u4efd", new C8700((C8773) obj, 2));
                return;
            case 26:
                C8232 c8232 = (C8232) obj;
                if (c8232 != null) {
                    c8232.m13739();
                    return;
                }
                return;
            case 27:
                C8873 c8873 = (C8873) obj;
                LinkedHashMap linkedHashMap = c8873.f25011.f25068;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (((Boolean) entry.getValue()).booleanValue()) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                List listM8804 = AbstractC4343.m8804(linkedHashMap2.keySet());
                if (listM8804.isEmpty()) {
                    AbstractC6154.m11561("\u8bf7\u5148\u9009\u62e9\u597d\u53cb");
                    return;
                }
                C8207 c8207 = new C8207();
                c8207.f22615 = "\u786e\u8ba4\u5220\u9664";
                c8207.mo13704();
                c8207.f22627 = "\u786e\u5b9a\u8981\u5220\u9664 " + listM8804.size() + " \u4f4d\u597d\u53cb\u5417\uff1f\n\u6b64\u64cd\u4f5c\u4e0d\u53ef\u64a4\u9500\uff01";
                c8207.mo13704();
                c8207.mo13702("\u786e\u8ba4\u5220\u9664", new C5546(c8873, 3, listM8804));
                c8207.f22630 = "\u53d6\u6d88";
                c8207.mo13704();
                c8207.m13714();
                return;
            case 28:
                C7827 c7827 = (C7827) obj;
                LinkedHashMap linkedHashMap3 = ((C8907) c7827.f21371).f25091;
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
                    if (((Boolean) entry2.getValue()).booleanValue()) {
                        linkedHashMap4.put(entry2.getKey(), entry2.getValue());
                    }
                }
                List listM88042 = AbstractC4343.m8804(linkedHashMap4.keySet());
                if (listM88042.isEmpty()) {
                    AbstractC6154.m11561("\u8bf7\u5148\u9009\u62e9\u7fa4");
                    return;
                }
                C8207 c82072 = new C8207();
                c82072.f22615 = "\u786e\u8ba4\u9000\u51fa";
                c82072.mo13704();
                c82072.f22627 = "\u786e\u5b9a\u8981\u9000\u51fa " + listM88042.size() + " \u4e2a\u7fa4\u5417\uff1f\n\u6b64\u64cd\u4f5c\u4e0d\u53ef\u64a4\u9500\uff01";
                c82072.mo13704();
                c82072.mo13702("\u786e\u8ba4\u9000\u51fa", new C5546(c7827, i2, listM88042));
                c82072.f22630 = "\u53d6\u6d88";
                c82072.mo13704();
                c82072.m13714();
                return;
            default:
                ((Switch) obj).setChecked(!r0.isChecked());
                return;
        }
    }
}
