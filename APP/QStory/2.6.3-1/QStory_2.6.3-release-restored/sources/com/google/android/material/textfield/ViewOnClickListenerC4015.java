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
import androidx.compose.p001ui.platform.RunnableC2733;
import androidx.fragment.app.AbstractC3146;
import androidx.fragment.app.AbstractComponentCallbacksC3171;
import androidx.fragment.app.C3165;
import androidx.fragment.app.C3191;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC5176;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import lin.xposed.hook.javaplugin.view.C6378;
import lin.xposed.hook.javaplugin.view.ViewOnClickListenerC6375;
import lin.xposed.hook.view.main.MainSettingActivity;
import lin.xposed.hook.view.main.itemview.info.DirectoryUiInfo;
import p022.C6946;
import p022.C6947;
import p024.RunnableC6988;
import p024.ViewOnClickListenerC6987;
import p025.C7007;
import p026.AbstractC7014;
import p026.AbstractC7017;
import p042.AbstractC7140;
import p044.DialogC7148;
import p045.C7149;
import p045.C7150;
import p050.AbstractC7176;
import p052.AbstractC7187;
import p052.C7185;
import p052.C7189;
import p055.C7224;
import p055.ViewOnClickListenerC7233;
import p056.C7266;
import p160.C8376;
import p209.C8657;
import p273.C9027;
import p273.C9034;
import p273.C9037;
import p273.C9057;
import p273.C9062;
import p273.C9069;
import p335.C9504;
import p335.C9506;
import p335.C9508;
import p337.C9527;
import p338.C9531;
import p338.C9532;
import p344.C9584;
import p351.AbstractC9618;
import p370.C9715;
import p371.C9719;
import p371.C9727;
import top.suzhelan.qstory.hook.item.C6714;
import top.suzhelan.qstory.hook.item.C6717;
import top.suzhelan.qstory.hook.item.C6758;
import top.suzhelan.qstory.hook.item.ViewOnClickListenerC6742;
import top.suzhelan.qstory.hook.item.chat.C6664;
import top.suzhelan.qstory.hook.item.chat.C6672;
import top.suzhelan.qstory.hook.item.chat.C6689;
import top.suzhelan.qstory.hook.item.chat.C6698;
import top.suzhelan.qstory.hook.item.chat.ViewOnClickListenerC6662;
import top.suzhelan.qstory.hook.item.chat.ViewOnClickListenerC6673;

/* JADX INFO: renamed from: com.google.android.material.textfield.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC4015 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f11033;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f11034;

    public /* synthetic */ ViewOnClickListenerC4015(Object obj, int i) {
        this.f11034 = i;
        this.f11033 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View.OnClickListener onClickListenerMo11806;
        int i = this.f11034;
        int i2 = 4;
        int i3 = 0;
        Object obj = this.f11033;
        switch (i) {
            case 0:
                C4011 c4011 = (C4011) obj;
                EditText editText = c4011.f11025;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (view.hasFocus()) {
                    c4011.f11025.requestFocus();
                }
                if (text != null) {
                    text.clear();
                }
                c4011.m7814();
                return;
            case 1:
                ((C4031) obj).m7835();
                return;
            case 2:
                C4021 c4021 = (C4021) obj;
                EditText editText2 = c4021.f11088;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = c4021.f11088;
                boolean z = editText3 != null && (editText3.getTransformationMethod() instanceof PasswordTransformationMethod);
                EditText editText4 = c4021.f11088;
                if (z) {
                    editText4.setTransformationMethod(null);
                } else {
                    editText4.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                if (selectionEnd >= 0) {
                    c4021.f11088.setSelection(selectionEnd);
                }
                c4021.m7814();
                return;
            case 3:
                C6758 c6758 = (C6758) obj;
                if (c6758.f16461 == null) {
                    c6758.f16461 = new C7150("GrabHb", "LIN_XPOSED_QQ");
                }
                Context context = view.getContext();
                DialogC7148 dialogC7148 = new DialogC7148(context);
                dialogC7148.m12392(dialogC7148.m12393());
                View viewInflate = LayoutInflater.from(context).inflate(C0328R.layout.set_redpacket_params, (ViewGroup) null, false);
                ((TextView) viewInflate.findViewById(C0328R.id.tv_grabHbParamTitle)).setText("抢红包参数(新)");
                EditText editText5 = (EditText) viewInflate.findViewById(C0328R.id.delay_hb_edit);
                EditText editText6 = (EditText) viewInflate.findViewById(C0328R.id.redpack_blacklistTroop);
                EditText editText7 = (EditText) viewInflate.findViewById(C0328R.id.redpack_blacklistText);
                EditText editText8 = (EditText) viewInflate.findViewById(C0328R.id.hb_reply);
                EditText editText9 = (EditText) viewInflate.findViewById(C0328R.id.hb_reply_delay);
                EditText editText10 = (EditText) viewInflate.findViewById(C0328R.id.hb_average);
                CheckBox checkBox = (CheckBox) viewInflate.findViewById(C0328R.id.grab_hb_toast);
                CheckBox checkBox2 = (CheckBox) viewInflate.findViewById(C0328R.id.ordinary_hb_checkbox);
                CheckBox checkBox3 = (CheckBox) viewInflate.findViewById(C0328R.id.exclusive_hb_checkbox);
                Button button = (Button) viewInflate.findViewById(C0328R.id.save_red_pack_param_btn);
                editText5.setText(String.valueOf(Long.parseLong(String.valueOf(c6758.f16461.m12399(0, "delay")))));
                editText6.setText((CharSequence) c6758.f16461.m12399(null, "blacklistTroop"));
                editText7.setText((CharSequence) c6758.f16461.m12399(null, "blacklistText"));
                editText8.setText((CharSequence) c6758.f16461.m12399(null, "replyText"));
                editText9.setText(String.valueOf(Long.parseLong(String.valueOf(c6758.f16461.m12399(0, "replyDelay")))));
                editText10.setText(String.valueOf(Long.parseLong(String.valueOf(c6758.f16461.m12399(0, "expectAmount")))));
                C7150 c7150 = c6758.f16461;
                String strM14531 = "grabToast";
                Boolean bool = Boolean.TRUE;
                checkBox.setChecked(((Boolean) c7150.m12399(bool, strM14531)).booleanValue());
                checkBox2.setChecked(((Boolean) c6758.f16461.m12399(bool, "ordinary")).booleanValue());
                checkBox3.setChecked(((Boolean) c6758.f16461.m12399(Boolean.FALSE, "exclusiveRedEnvelopes")).booleanValue());
                button.setOnClickListener(new ViewOnClickListenerC6742(c6758, editText5, editText6, editText7, editText8, editText9, editText10, checkBox, checkBox2, checkBox3, dialogC7148));
                dialogC7148.setContentView(viewInflate);
                dialogC7148.show();
                return;
            case 4:
                C6717 c6717 = (C6717) obj;
                Context context2 = view.getContext();
                "getContext(...)";
                context2.getClass();
                String[] strArr = (String[]) c6717.f16409.keySet().toArray(new String[0]);
                C9034 c9034M14277 = C9034.m14277();
                c9034M14277.f22959 = "篡改图片显示大小";
                c9034M14277.m14286();
                c9034M14277.m14287(strArr);
                c9034M14277.f22953 = new C6714(c6717);
                c9034M14277.m14290();
                return;
            case 5:
                C6689 c6689 = (C6689) obj;
                int i4 = C6689.f16362;
                Context context3 = AbstractC7187.f17852;
                "getHostAppContext(...)";
                context3.getClass();
                "context";
                C9057 c9057 = new C9057();
                c9057.f22959 = "设置输入框提示文字";
                c9057.mo14280();
                c9057.f22971 = "设置新提示词后需要重启生效";
                c9057.mo14280();
                c9057.f22972 = c6689.m11823();
                c9057.mo14280();
                c9057.f22974 = "取消";
                c9057.mo14280();
                c9057.f22970 = "保存";
                c9057.mo14280();
                c9057.f22968 = new C6698(c6689, i3);
                c9057.m14290();
                return;
            case 6:
                C6672 c6672 = (C6672) obj;
                if (c6672.f16343 == null) {
                    c6672.f16343 = new C7149("Repetition");
                }
                Context context4 = view.getContext();
                "getContext(...)";
                context4.getClass();
                DialogC7148 dialogC71482 = new DialogC7148(context4);
                View viewInflate2 = LayoutInflater.from(context4).inflate(C0328R.layout.repetition_params, (ViewGroup) null, false);
                CheckBox checkBox4 = (CheckBox) viewInflate2.findViewById(C0328R.id.repetition_doubleClick);
                C7149 c7149 = c6672.f16343;
                c7149.getClass();
                Object objM12399 = c7149.m12399(Boolean.FALSE, "doubleClick");
                "get(...)";
                objM12399.getClass();
                checkBox4.setChecked(((Boolean) objM12399).booleanValue());
                EditText editText11 = (EditText) viewInflate2.findViewById(C0328R.id.repetition_size);
                C7149 c71492 = c6672.f16343;
                c71492.getClass();
                editText11.setText(String.valueOf((Integer) c71492.m12399(26, "size")));
                ((Button) viewInflate2.findViewById(C0328R.id.repetition_save)).setOnClickListener(new ViewOnClickListenerC6673(editText11, dialogC71482, c6672, context4, checkBox4, 0));
                dialogC71482.setContentView(viewInflate2);
                dialogC71482.show();
                return;
            case 7:
                C6664 c6664 = (C6664) obj;
                if (c6664.f16320 == null) {
                    c6664.f16320 = new C7149("RepetitionPlus");
                }
                Context context5 = view.getContext();
                "getContext(...)";
                context5.getClass();
                DialogC7148 dialogC71483 = new DialogC7148(context5);
                View viewInflate3 = LayoutInflater.from(context5).inflate(C0328R.layout.repetition_params, (ViewGroup) null, false);
                CheckBox checkBox5 = (CheckBox) viewInflate3.findViewById(C0328R.id.repetition_doubleClick);
                C7149 c71493 = c6664.f16320;
                c71493.getClass();
                Object objM123992 = c71493.m12399(Boolean.FALSE, "doubleClick");
                "get(...)";
                objM123992.getClass();
                checkBox5.setChecked(((Boolean) objM123992).booleanValue());
                EditText editText12 = (EditText) viewInflate3.findViewById(C0328R.id.repetition_size);
                C7149 c71494 = c6664.f16320;
                c71494.getClass();
                editText12.setText(String.valueOf((Integer) c71494.m12399(50, "size")));
                ((Button) viewInflate3.findViewById(C0328R.id.repetition_save)).setOnClickListener(new ViewOnClickListenerC6662(editText12, dialogC71483, checkBox5, c6664, 0));
                dialogC71483.setContentView(viewInflate3);
                dialogC71483.show();
                return;
            case 8:
                ((C6947) obj).m5003().onBackPressed();
                return;
            case 9:
                AbstractC9618.f25101.execute(new RunnableC6988((ViewOnClickListenerC6987) obj, i3));
                return;
            case 10:
                AbstractC7140 abstractC7140 = ((C7007) obj).f17345;
                if (abstractC7140 == null || (onClickListenerMo11806 = abstractC7140.mo11806()) == null) {
                    return;
                }
                onClickListenerMo11806.onClick(view);
                return;
            case 11:
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
                    AbstractC3146 abstractC3146M5019 = C6946.f17041.m5019();
                    "getParentFragmentManager(...)";
                    AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171M4935 = abstractC3146M5019.m4935(directoryUiInfo.getItemName());
                    if (abstractComponentCallbacksC3171M4935 == null) {
                        abstractComponentCallbacksC3171M4935 = new C6947(directoryUiInfo);
                        abstractComponentCallbacksC3171M4935.m4999(bundle);
                    }
                    C3165 c3165 = new C3165(abstractC3146M5019);
                    c3165.f7191 = C0328R.anim.slide_in_from_right;
                    c3165.f7190 = C0328R.anim.slide_out_to_left;
                    c3165.f7189 = C0328R.anim.fragment_pop_enter;
                    c3165.f7188 = C0328R.anim.fragment_pop_exit;
                    if (!c3165.f7200) {
                        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
                    }
                    c3165.f7201 = true;
                    c3165.f7204 = null;
                    MainSettingActivity.Companion.getClass();
                    c3165.m4991(C0328R.id.itemList_container, abstractComponentCallbacksC3171M4935, directoryUiInfo.getItemName());
                    c3165.m4988(false);
                    return;
                } catch (Exception e) {
                    AbstractC7017.m12165(e);
                    return;
                }
            case 12:
                MainSettingActivity.setTitleBarAttribute$lambda$1((MainSettingActivity) obj, view);
                return;
            case 13:
                ((DialogC7148) obj).dismiss();
                return;
            case 14:
                AbstractC5754.m10449(view.getContext(), ((C7185) obj).f17849);
                AbstractC7014.m12151("路径已复制");
                return;
            case 15:
                AbstractC5754.m10449(view.getContext(), ((C7189) obj).f17860);
                AbstractC7014.m12151("路径已复制");
                return;
            case 16:
                AbstractC7176.m12465((Context) obj);
                return;
            case 17:
                C7224 c7224 = (C7224) obj;
                Context context7 = view.getContext();
                DialogC7148 dialogC71484 = new DialogC7148(context7);
                View viewInflate4 = LayoutInflater.from(context7).inflate(C0328R.layout.text_send_change, (ViewGroup) null, false);
                EditText editText13 = (EditText) viewInflate4.findViewById(C0328R.id.messageTextPrefix_edit);
                C7149 c71495 = c7224.f17904;
                editText13.setText((CharSequence) c71495.m12398("prefix"));
                EditText editText14 = (EditText) viewInflate4.findViewById(C0328R.id.messageTextSuffix_edit);
                editText14.setText((CharSequence) c71495.m12398("suffix"));
                EditText editText15 = (EditText) viewInflate4.findViewById(C0328R.id.time_format);
                editText15.setText((CharSequence) c71495.m12398("time_format"));
                ((Button) viewInflate4.findViewById(C0328R.id.save_send_text_btn)).setOnClickListener(new ViewOnClickListenerC7233(c7224, editText13, editText14, editText15, dialogC71484));
                dialogC71484.setContentView(viewInflate4);
                dialogC71484.show();
                return;
            case 18:
                C7266 c7266 = (C7266) obj;
                if (c7266.f17979 == null) {
                    c7266.f17979 = new C7149("AtTextSummaryChange");
                }
                Context context8 = view.getContext();
                DialogC7148 dialogC71485 = new DialogC7148(context8);
                View viewInflate5 = LayoutInflater.from(context8).inflate(C0328R.layout.set_at_text_summary, (ViewGroup) null, false);
                EditText editText16 = (EditText) viewInflate5.findViewById(C0328R.id.at_text_summary_edit);
                editText16.setText((String) c7266.f17979.m12398("summary"));
                ((Button) viewInflate5.findViewById(C0328R.id.save_at_text_summary_btn)).setOnClickListener(new ViewOnClickListenerC6375(c7266, editText16, dialogC71485, i2));
                dialogC71485.setContentView(viewInflate5);
                dialogC71485.show();
                return;
            case 19:
                C9508 c9508 = (C9508) obj;
                int i5 = C9508.f24828;
                C9727 c9727 = new C9727(new C3191(c9508, 23));
                c9727.m15101(c9508.f24830.m15239(String.class, "TroopUinList"));
                c9727.f25426.mo14281("今日未打卡的群聊会立刻打卡");
                c9727.m15100();
                return;
            case 20:
                C9506 c9506 = (C9506) obj;
                C9727 c97272 = new C9727(new C3191(c9506, 24));
                c97272.m15101(c9506.f24824.m15239(String.class, "TroopUinList"));
                c97272.f25426.mo14281("今日未打卡的群聊会立刻打卡");
                c97272.m15100();
                return;
            case 21:
                C9504 c9504 = (C9504) obj;
                C9727 c97273 = new C9727(new C3191(c9504, 25));
                c97273.m15101(c9504.f24820.m15239(String.class, "TroopUinList"));
                c97273.f25426.mo14281("今日未打卡的群聊会立刻打卡");
                c97273.m15100();
                return;
            case 22:
                ((C9527) obj).f24866.m14993();
                return;
            case 23:
                int i6 = C9531.f24873;
                C9037.m14288("点击发送后会立刻发送一条QQ空间进行测试,与其他空间功能有联动调试配合性", "手动发送进行测试").mo14278("发送", new C9532((C9531) obj, i3));
                return;
            case 24:
                ((C9069) obj).m14323();
                C9027 c9027M14266 = C9027.m14266("正在扫描表情文件...");
                c9027M14266.f22920 = new C8376(21);
                c9027M14266.m14270();
                new Thread(new RunnableC2733(14)).start();
                return;
            case 25:
                String str = C9584.f25019;
                C9037.m14288("手动备份不会吞噬今日旧备份 今日备份将在第二天自动删除\n\n备份路径：" + C9584.f25020, "手动备份测试").mo14278("开始备份", new C9532((C9584) obj, 2));
                return;
            case 26:
                C9062 c9062 = (C9062) obj;
                if (c9062 != null) {
                    c9062.m14314();
                    return;
                }
                return;
            case 27:
                ((Switch) obj).setChecked(!r0.isChecked());
                return;
            case 28:
                C9719 c9719 = (C9719) obj;
                LinkedHashMap linkedHashMap = c9719.f25407.f25374;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (((Boolean) entry.getValue()).booleanValue()) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                List listM9356 = AbstractC5176.m9356(linkedHashMap2.keySet());
                if (listM9356.isEmpty()) {
                    AbstractC7014.m12151("请先选择好友");
                    return;
                }
                C9037 c9037 = new C9037();
                c9037.f22959 = "确认删除";
                c9037.mo14280();
                c9037.f22971 = "确定要删除 " + listM9356.size() + " 位好友吗？\n此操作不可撤销！";
                c9037.mo14280();
                c9037.mo14278("确认删除", new C6378(c9719, 3, listM9356));
                c9037.f22974 = "取消";
                c9037.mo14280();
                c9037.m14290();
                return;
            default:
                C8657 c8657 = (C8657) obj;
                LinkedHashMap linkedHashMap3 = ((C9715) c8657.f21713).f25397;
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
                    if (((Boolean) entry2.getValue()).booleanValue()) {
                        linkedHashMap4.put(entry2.getKey(), entry2.getValue());
                    }
                }
                List listM93562 = AbstractC5176.m9356(linkedHashMap4.keySet());
                if (listM93562.isEmpty()) {
                    AbstractC7014.m12151("请先选择群");
                    return;
                }
                C9037 c90372 = new C9037();
                c90372.f22959 = "确认退出";
                c90372.mo14280();
                c90372.f22971 = "确定要退出 " + listM93562.size() + " 个群吗？\n此操作不可撤销！";
                c90372.mo14280();
                c90372.mo14278("确认退出", new C6378(c8657, i2, listM93562));
                c90372.f22974 = "取消";
                c90372.mo14280();
                c90372.m14290();
                return;
        }
    }
}
