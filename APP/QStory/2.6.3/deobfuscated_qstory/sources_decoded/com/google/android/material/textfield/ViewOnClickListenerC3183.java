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
import com.davemorrissey.labs.subscaleview.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC4344;
import kotlin.reflect.jvm.internal.types.AbstractC4922;
import lin.xposed.hook.javaplugin.view.C5547;
import lin.xposed.hook.javaplugin.view.ViewOnClickListenerC5544;
import lin.xposed.hook.view.main.MainSettingActivity;
import lin.xposed.hook.view.main.itemview.info.DirectoryUiInfo;
import p006.C6117;
import p006.C6118;
import p008.RunnableC6159;
import p008.ViewOnClickListenerC6158;
import p009.C6178;
import p010.AbstractC6185;
import p010.AbstractC6188;
import p026.AbstractC6311;
import p028.DialogC6319;
import p029.C6320;
import p029.C6321;
import p034.AbstractC6347;
import p036.AbstractC6358;
import p036.C6356;
import p036.C6360;
import p039.C6395;
import p039.ViewOnClickListenerC6404;
import p040.C6437;
import p144.C7547;
import p193.C7828;
import p257.C8198;
import p257.C8205;
import p257.C8208;
import p257.C8228;
import p257.C8233;
import p257.C8240;
import p287.AbstractC8405;
import p319.C8675;
import p319.C8677;
import p319.C8679;
import p321.C8698;
import p322.C8702;
import p322.C8703;
import p328.C8755;
import p335.AbstractC8789;
import p354.C8886;
import p355.C8890;
import p355.C8898;
import top.suzhelan.qstory.hook.item.C5884;
import top.suzhelan.qstory.hook.item.C5887;
import top.suzhelan.qstory.hook.item.C5928;
import top.suzhelan.qstory.hook.item.ViewOnClickListenerC5912;
import top.suzhelan.qstory.hook.item.chat.C5834;
import top.suzhelan.qstory.hook.item.chat.C5842;
import top.suzhelan.qstory.hook.item.chat.C5859;
import top.suzhelan.qstory.hook.item.chat.C5868;
import top.suzhelan.qstory.hook.item.chat.ViewOnClickListenerC5832;
import top.suzhelan.qstory.hook.item.chat.ViewOnClickListenerC5843;

/* JADX INFO: renamed from: com.google.android.material.textfield.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC3183 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f10688;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f10689;

    public /* synthetic */ ViewOnClickListenerC3183(Object obj, int i) {
        this.f10689 = i;
        this.f10688 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View.OnClickListener onClickListenerMo11247;
        int i = this.f10689;
        int i2 = 4;
        int i3 = 0;
        Object obj = this.f10688;
        switch (i) {
            case 0:
                C3179 c3179 = (C3179) obj;
                EditText editText = c3179.f10680;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (view.hasFocus()) {
                    c3179.f10680.requestFocus();
                }
                if (text != null) {
                    text.clear();
                }
                c3179.m7255();
                return;
            case 1:
                ((C3199) obj).m7276();
                return;
            case 2:
                C3189 c3189 = (C3189) obj;
                EditText editText2 = c3189.f10743;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = c3189.f10743;
                boolean z = editText3 != null && (editText3.getTransformationMethod() instanceof PasswordTransformationMethod);
                EditText editText4 = c3189.f10743;
                if (z) {
                    editText4.setTransformationMethod(null);
                } else {
                    editText4.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                if (selectionEnd >= 0) {
                    c3189.f10743.setSelection(selectionEnd);
                }
                c3189.m7255();
                return;
            case 3:
                C5928 c5928 = (C5928) obj;
                if (c5928.f16116 == null) {
                    c5928.f16116 = new C6321(AbstractC8405.m13973("喵喵呜呜喵呜喵喵~喵喵喵喵喵呜呜呜~喵喵喵呜呜喵呜呜~喵喵喵喵呜喵呜喵~喵喵呜喵呜呜喵呜~喵喵喵喵呜呜呜喵"), AbstractC8405.m13972(1067)); /* decoded: m13972(1067)=LIN_XPOSED_QQ */ /* decoded-inline: GrabHb */
                }
                Context context = view.getContext();
                DialogC6319 dialogC6319 = new DialogC6319(context);
                dialogC6319.m11833(dialogC6319.m11834());
                View viewInflate = LayoutInflater.from(context).inflate(R.layout.set_redpacket_params, (ViewGroup) null, false);
                ((TextView) viewInflate.findViewById(R.id.tv_grabHbParamTitle)).setText(AbstractC8405.m13972(1055)); /* decoded: m13972(1055)=抢红包参数(新) */
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
                editText5.setText(String.valueOf(Long.parseLong(String.valueOf(c5928.f16116.m11840(0, AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜喵呜呜喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜喵喵")))))); /* decoded-inline: delay */
                editText6.setText((CharSequence) c5928.f16116.m11840(null, AbstractC8405.m13972(1056))); /* decoded: m13972(1056)=blacklistTroop */
                editText7.setText((CharSequence) c5928.f16116.m11840(null, AbstractC8405.m13972(1057))); /* decoded: m13972(1057)=blacklistText */
                editText8.setText((CharSequence) c5928.f16116.m11840(null, AbstractC8405.m13972(1058))); /* decoded: m13972(1058)=replyText */
                editText9.setText(String.valueOf(Long.parseLong(String.valueOf(c5928.f16116.m11840(0, AbstractC8405.m13972(1059)))))); /* decoded: m13972(1059)=replyDelay */
                editText10.setText(String.valueOf(Long.parseLong(String.valueOf(c5928.f16116.m11840(0, AbstractC8405.m13972(1060)))))); /* decoded: m13972(1060)=expectAmount */
                C6321 c6321 = c5928.f16116;
                String strM13972 = AbstractC8405.m13972(1061); /* decoded: m13972(1061)=grabToast */
                Boolean bool = Boolean.TRUE;
                checkBox.setChecked(((Boolean) c6321.m11840(bool, strM13972)).booleanValue());
                checkBox2.setChecked(((Boolean) c5928.f16116.m11840(bool, AbstractC8405.m13972(1062))).booleanValue()); /* decoded: m13972(1062)=ordinary */
                checkBox3.setChecked(((Boolean) c5928.f16116.m11840(Boolean.FALSE, AbstractC8405.m13972(1063))).booleanValue()); /* decoded: m13972(1063)=exclusiveRedEnvelopes */
                button.setOnClickListener(new ViewOnClickListenerC5912(c5928, editText5, editText6, editText7, editText8, editText9, editText10, checkBox, checkBox2, checkBox3, dialogC6319));
                dialogC6319.setContentView(viewInflate);
                dialogC6319.show();
                return;
            case 4:
                C5887 c5887 = (C5887) obj;
                Context context2 = view.getContext();
                AbstractC8405.m13972(1309); /* decoded: m13972(1309)=getContext(...) */
                context2.getClass();
                String[] strArr = (String[]) c5887.f16064.keySet().toArray(new String[0]);
                C8205 c8205M13718 = C8205.m13718();
                c8205M13718.f22614 = AbstractC8405.m13972(1883); /* decoded: m13972(1883)=篡改图片显示大小 */
                c8205M13718.m13727();
                c8205M13718.m13728(strArr);
                c8205M13718.f22608 = new C5884(c5887);
                c8205M13718.m13731();
                return;
            case 5:
                C5859 c5859 = (C5859) obj;
                int i4 = C5859.f16017;
                Context context3 = AbstractC6358.f17507;
                AbstractC8405.m13972(2157); /* decoded: m13972(2157)=getHostAppContext(...) */
                context3.getClass();
                AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵呜"); /* decoded-inline: context */
                C8228 c8228 = new C8228();
                c8228.f22614 = AbstractC8405.m13972(2155); /* decoded: m13972(2155)=设置输入框提示文字 */
                c8228.mo13721();
                c8228.f22626 = AbstractC8405.m13972(2156); /* decoded: m13972(2156)=设置新提示词后需要重启生效 */
                c8228.mo13721();
                c8228.f22627 = c5859.m11264();
                c8228.mo13721();
                c8228.f22629 = AbstractC8405.m13973("呜喵喵呜喵呜呜喵~呜呜呜呜呜喵呜喵~呜呜呜喵呜呜喵喵~呜喵喵喵呜呜呜喵~呜呜喵呜喵喵呜呜~呜呜呜喵喵呜喵喵"); /* decoded-inline: 取消 */
                c8228.mo13721();
                c8228.f22625 = AbstractC8405.m13973("呜喵喵呜喵呜呜呜~呜呜喵喵呜喵呜喵~呜呜呜喵喵呜呜呜~呜喵喵喵呜呜喵呜~呜呜喵喵呜喵喵喵~呜呜呜呜喵呜喵喵"); /* decoded-inline: 保存 */
                c8228.mo13721();
                c8228.f22623 = new C5868(c5859, i3);
                c8228.m13731();
                return;
            case 6:
                C5842 c5842 = (C5842) obj;
                if (c5842.f15998 == null) {
                    c5842.f15998 = new C6320(AbstractC8405.m13972(2212)); /* decoded: m13972(2212)=Repetition */
                }
                Context context4 = view.getContext();
                AbstractC8405.m13972(1309); /* decoded: m13972(1309)=getContext(...) */
                context4.getClass();
                DialogC6319 dialogC63192 = new DialogC6319(context4);
                View viewInflate2 = LayoutInflater.from(context4).inflate(R.layout.repetition_params, (ViewGroup) null, false);
                CheckBox checkBox4 = (CheckBox) viewInflate2.findViewById(R.id.repetition_doubleClick);
                C6320 c6320 = c5842.f15998;
                c6320.getClass();
                Object objM11840 = c6320.m11840(Boolean.FALSE, AbstractC8405.m13972(2206)); /* decoded: m13972(2206)=doubleClick */
                AbstractC8405.m13972(1548); /* decoded: m13972(1548)=get(...) */
                objM11840.getClass();
                checkBox4.setChecked(((Boolean) objM11840).booleanValue());
                EditText editText11 = (EditText) viewInflate2.findViewById(R.id.repetition_size);
                C6320 c63202 = c5842.f15998;
                c63202.getClass();
                editText11.setText(String.valueOf((Integer) c63202.m11840(26, AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵喵呜呜喵呜")))); /* decoded-inline: size */
                ((Button) viewInflate2.findViewById(R.id.repetition_save)).setOnClickListener(new ViewOnClickListenerC5843(editText11, dialogC63192, c5842, context4, checkBox4, 0));
                dialogC63192.setContentView(viewInflate2);
                dialogC63192.show();
                return;
            case 7:
                C5834 c5834 = (C5834) obj;
                if (c5834.f15975 == null) {
                    c5834.f15975 = new C6320(AbstractC8405.m13972(2223)); /* decoded: m13972(2223)=RepetitionPlus */
                }
                Context context5 = view.getContext();
                AbstractC8405.m13972(1309); /* decoded: m13972(1309)=getContext(...) */
                context5.getClass();
                DialogC6319 dialogC63193 = new DialogC6319(context5);
                View viewInflate3 = LayoutInflater.from(context5).inflate(R.layout.repetition_params, (ViewGroup) null, false);
                CheckBox checkBox5 = (CheckBox) viewInflate3.findViewById(R.id.repetition_doubleClick);
                C6320 c63203 = c5834.f15975;
                c63203.getClass();
                Object objM118402 = c63203.m11840(Boolean.FALSE, AbstractC8405.m13972(2206)); /* decoded: m13972(2206)=doubleClick */
                AbstractC8405.m13972(1548); /* decoded: m13972(1548)=get(...) */
                objM118402.getClass();
                checkBox5.setChecked(((Boolean) objM118402).booleanValue());
                EditText editText12 = (EditText) viewInflate3.findViewById(R.id.repetition_size);
                C6320 c63204 = c5834.f15975;
                c63204.getClass();
                editText12.setText(String.valueOf((Integer) c63204.m11840(50, AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵喵呜呜喵呜")))); /* decoded-inline: size */
                ((Button) viewInflate3.findViewById(R.id.repetition_save)).setOnClickListener(new ViewOnClickListenerC5832(editText12, dialogC63193, checkBox5, c5834, 0));
                dialogC63193.setContentView(viewInflate3);
                dialogC63193.show();
                return;
            case 8:
                ((C6118) obj).m4443().onBackPressed();
                return;
            case 9:
                AbstractC8789.f24756.execute(new RunnableC6159((ViewOnClickListenerC6158) obj, i3));
                return;
            case 10:
                AbstractC6311 abstractC6311 = ((C6178) obj).f17000;
                if (abstractC6311 == null || (onClickListenerMo11247 = abstractC6311.mo11247()) == null) {
                    return;
                }
                onClickListenerMo11247.onClick(view);
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
                    AbstractC8405.m13972(1294); /* decoded: m13972(1294)=getItemName(...) */
                    itemName.getClass();
                    mainSettingActivity.setTitleCenterText(itemName);
                    Bundle bundle = new Bundle();
                    bundle.putString(AbstractC8405.m13973("喵喵呜喵喵呜呜呜~喵喵呜呜喵呜喵喵~喵喵呜呜呜呜喵呜"), directoryUiInfo.getItemName()); /* decoded-inline: TAG */
                    AbstractC2313 abstractC2313M4459 = C6117.f16696.m4459();
                    AbstractC8405.m13972(1295); /* decoded: m13972(1295)=getParentFragmentManager(...) */
                    AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338M4375 = abstractC2313M4459.m4375(directoryUiInfo.getItemName());
                    if (abstractComponentCallbacksC2338M4375 == null) {
                        abstractComponentCallbacksC2338M4375 = new C6118(directoryUiInfo);
                        abstractComponentCallbacksC2338M4375.m4439(bundle);
                    }
                    C2332 c2332 = new C2332(abstractC2313M4459);
                    c2332.f6846 = R.anim.slide_in_from_right;
                    c2332.f6845 = R.anim.slide_out_to_left;
                    c2332.f6844 = R.anim.fragment_pop_enter;
                    c2332.f6843 = R.anim.fragment_pop_exit;
                    if (!c2332.f6855) {
                        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
                    }
                    c2332.f6856 = true;
                    c2332.f6859 = null;
                    MainSettingActivity.Companion.getClass();
                    c2332.m4431(R.id.itemList_container, abstractComponentCallbacksC2338M4375, directoryUiInfo.getItemName());
                    c2332.m4428(false);
                    return;
                } catch (Exception e) {
                    AbstractC6188.m11606(e);
                    return;
                }
            case 12:
                MainSettingActivity.setTitleBarAttribute$lambda$1((MainSettingActivity) obj, view);
                return;
            case 13:
                ((DialogC6319) obj).dismiss();
                return;
            case 14:
                AbstractC4922.m9890(view.getContext(), ((C6356) obj).f17504);
                AbstractC6185.m11592(AbstractC8405.m13972(79)); /* decoded: m13972(79)=路径已复制 */
                return;
            case 15:
                AbstractC4922.m9890(view.getContext(), ((C6360) obj).f17515);
                AbstractC6185.m11592(AbstractC8405.m13972(79)); /* decoded: m13972(79)=路径已复制 */
                return;
            case 16:
                AbstractC6347.m11906((Context) obj);
                return;
            case 17:
                C6395 c6395 = (C6395) obj;
                Context context7 = view.getContext();
                DialogC6319 dialogC63194 = new DialogC6319(context7);
                View viewInflate4 = LayoutInflater.from(context7).inflate(R.layout.text_send_change, (ViewGroup) null, false);
                EditText editText13 = (EditText) viewInflate4.findViewById(R.id.messageTextPrefix_edit);
                C6320 c63205 = c6395.f17559;
                editText13.setText((CharSequence) c63205.m11839(AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵喵喵呜呜呜~喵喵喵呜呜呜呜呜~喵喵喵喵呜呜呜喵~喵喵喵喵呜呜喵喵~喵喵喵呜喵呜喵喵"))); /* decoded-inline: prefix */
                EditText editText14 = (EditText) viewInflate4.findViewById(R.id.messageTextSuffix_edit);
                editText14.setText((CharSequence) c63205.m11839(AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵呜呜喵喵~喵喵喵呜喵呜喵喵"))); /* decoded-inline: suffix */
                EditText editText15 = (EditText) viewInflate4.findViewById(R.id.time_format);
                editText15.setText((CharSequence) c63205.m11839(AbstractC8405.m13972(243))); /* decoded: m13972(243)=time_format */
                ((Button) viewInflate4.findViewById(R.id.save_send_text_btn)).setOnClickListener(new ViewOnClickListenerC6404(c6395, editText13, editText14, editText15, dialogC63194));
                dialogC63194.setContentView(viewInflate4);
                dialogC63194.show();
                return;
            case 18:
                C6437 c6437 = (C6437) obj;
                if (c6437.f17634 == null) {
                    c6437.f17634 = new C6320(AbstractC8405.m13972(514)); /* decoded: m13972(514)=AtTextSummaryChange */
                }
                Context context8 = view.getContext();
                DialogC6319 dialogC63195 = new DialogC6319(context8);
                View viewInflate5 = LayoutInflater.from(context8).inflate(R.layout.set_at_text_summary, (ViewGroup) null, false);
                EditText editText16 = (EditText) viewInflate5.findViewById(R.id.at_text_summary_edit);
                editText16.setText((String) c6437.f17634.m11839(AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵喵呜喵呜~喵喵喵喵喵呜喵喵~喵喵喵呜呜呜呜喵~喵喵喵呜呜喵喵喵"))); /* decoded-inline: summary */
                ((Button) viewInflate5.findViewById(R.id.save_at_text_summary_btn)).setOnClickListener(new ViewOnClickListenerC5544(c6437, editText16, dialogC63195, i2));
                dialogC63195.setContentView(viewInflate5);
                dialogC63195.show();
                return;
            case 19:
                C8679 c8679 = (C8679) obj;
                int i5 = C8679.f24483;
                C8898 c8898 = new C8898(new C2358(c8679, 23));
                c8898.m14542(c8679.f24485.m14680(String.class, AbstractC8405.m13972(1207))); /* decoded: m13972(1207)=TroopUinList */
                c8898.f25081.mo13722(AbstractC8405.m13972(1213)); /* decoded: m13972(1213)=今日未打卡的群聊会立刻打卡 */
                c8898.m14541();
                return;
            case 20:
                C8677 c8677 = (C8677) obj;
                C8898 c88982 = new C8898(new C2358(c8677, 24));
                c88982.m14542(c8677.f24479.m14680(String.class, AbstractC8405.m13972(1207))); /* decoded: m13972(1207)=TroopUinList */
                c88982.f25081.mo13722(AbstractC8405.m13972(1213)); /* decoded: m13972(1213)=今日未打卡的群聊会立刻打卡 */
                c88982.m14541();
                return;
            case 21:
                C8675 c8675 = (C8675) obj;
                C8898 c88983 = new C8898(new C2358(c8675, 25));
                c88983.m14542(c8675.f24475.m14680(String.class, AbstractC8405.m13972(1207))); /* decoded: m13972(1207)=TroopUinList */
                c88983.f25081.mo13722(AbstractC8405.m13972(1213)); /* decoded: m13972(1213)=今日未打卡的群聊会立刻打卡 */
                c88983.m14541();
                return;
            case 22:
                ((C8698) obj).f24521.m14434();
                return;
            case 23:
                int i6 = C8702.f24528;
                C8208.m13729(AbstractC8405.m13972(1192), AbstractC8405.m13972(1191)).mo13719(AbstractC8405.m13973("呜喵喵呜喵呜呜喵~呜呜呜呜呜喵呜喵~呜呜呜喵呜喵呜呜~呜喵喵喵喵喵喵呜~呜呜呜喵喵呜喵呜~呜呜呜喵呜呜喵呜"), new C8703((C8702) obj, i3)); /* decoded: m13972(1192)=点击发送后会立刻发送一条QQ空间进行测试,与其他空间功能有联动调试配合性 ; m13972(1191)=手动发送进行测试 */ /* decoded-inline: 发送 */
                return;
            case 24:
                ((C8240) obj).m13764();
                C8198 c8198M13707 = C8198.m13707(AbstractC8405.m13972(2766)); /* decoded: m13972(2766)=正在扫描表情文件... */
                c8198M13707.f22575 = new C7547(21);
                c8198M13707.m13711();
                new Thread(new RunnableC1898(14)).start();
                return;
            case 25:
                String str = C8755.f24674;
                C8208.m13729(AbstractC8405.m13972(2273) + C8755.f24675, AbstractC8405.m13972(2272)).mo13719(AbstractC8405.m13972(2274), new C8703((C8755) obj, 2)); /* decoded: m13972(2273)=手动备份不会吞噬今日旧备份 今日备份将在第二天自动删除\n\n备份路径： ; m13972(2272)=手动备份测试 ; m13972(2274)=开始备份 */
                return;
            case 26:
                C8233 c8233 = (C8233) obj;
                if (c8233 != null) {
                    c8233.m13755();
                    return;
                }
                return;
            case 27:
                ((Switch) obj).setChecked(!r0.isChecked());
                return;
            case 28:
                C8890 c8890 = (C8890) obj;
                LinkedHashMap linkedHashMap = c8890.f25062.f25029;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (((Boolean) entry.getValue()).booleanValue()) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                List listM8797 = AbstractC4344.m8797(linkedHashMap2.keySet());
                if (listM8797.isEmpty()) {
                    AbstractC6185.m11592(AbstractC8405.m13972(3106)); /* decoded: m13972(3106)=请先选择好友 */
                    return;
                }
                C8208 c8208 = new C8208();
                c8208.f22614 = AbstractC8405.m13972(747); /* decoded: m13972(747)=确认删除 */
                c8208.mo13721();
                c8208.f22626 = AbstractC8405.m13972(3107) + listM8797.size() + AbstractC8405.m13972(3108); /* decoded: m13972(3107)=确定要删除  ; m13972(3108)= 位好友吗？\n此操作不可撤销！ */
                c8208.mo13721();
                c8208.mo13719(AbstractC8405.m13972(747), new C5547(c8890, 3, listM8797)); /* decoded: m13972(747)=确认删除 */
                c8208.f22629 = AbstractC8405.m13973("呜喵喵呜喵呜呜喵~呜呜呜呜呜喵呜喵~呜呜呜喵呜呜喵喵~呜喵喵喵呜呜呜喵~呜呜喵呜喵喵呜呜~呜呜呜喵喵呜喵喵"); /* decoded-inline: 取消 */
                c8208.mo13721();
                c8208.m13731();
                return;
            default:
                C7828 c7828 = (C7828) obj;
                LinkedHashMap linkedHashMap3 = ((C8886) c7828.f21368).f25052;
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
                    if (((Boolean) entry2.getValue()).booleanValue()) {
                        linkedHashMap4.put(entry2.getKey(), entry2.getValue());
                    }
                }
                List listM87972 = AbstractC4344.m8797(linkedHashMap4.keySet());
                if (listM87972.isEmpty()) {
                    AbstractC6185.m11592(AbstractC8405.m13972(3121)); /* decoded: m13972(3121)=请先选择群 */
                    return;
                }
                C8208 c82082 = new C8208();
                c82082.f22614 = AbstractC8405.m13972(3122); /* decoded: m13972(3122)=确认退出 */
                c82082.mo13721();
                c82082.f22626 = AbstractC8405.m13972(3123) + listM87972.size() + AbstractC8405.m13972(3124); /* decoded: m13972(3123)=确定要退出  ; m13972(3124)= 个群吗？\n此操作不可撤销！ */
                c82082.mo13721();
                c82082.mo13719(AbstractC8405.m13972(3122), new C5547(c7828, i2, listM87972)); /* decoded: m13972(3122)=确认退出 */
                c82082.f22629 = AbstractC8405.m13973("呜喵喵呜喵呜呜喵~呜呜呜呜呜喵呜喵~呜呜呜喵呜呜喵喵~呜喵喵喵呜呜呜喵~呜呜喵呜喵喵呜呜~呜呜呜喵喵呜喵喵"); /* decoded-inline: 取消 */
                c82082.mo13721();
                c82082.m13731();
                return;
        }
    }
}
