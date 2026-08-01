package lin.xposed.hook.javaplugin.dialog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.recyclerview.widget.C2473;
import com.davemorrissey.labs.subscaleview.R;
import io.ktor.client.plugins.AbstractC3933;
import java.util.ArrayList;
import kotlin.collections.AbstractC4345;
import kotlin.reflect.jvm.internal.types.AbstractC4922;
import lin.xposed.hook.javaplugin.view.PluginItemView;
import lin.xposed.hook.view.main.MainSettingActivity;
import lin.xposed.hook.view.main.itemview.ClearLoginInformation;
import lin.xposed.hook.view.main.itemview.ManageFriends;
import lin.xposed.hook.view.main.itemview.ManageTroops;
import lin.xposed.hook.view.main.itemview.NoticeLog;
import lin.xposed.hook.view.main.itemview.Update;
import lin.xposed.hook.view.main.itemview.UpdateLog;
import p009.AbstractC6183;
import p010.AbstractC6185;
import p028.DialogC6319;
import p034.AbstractC6347;
import p039.C6414;
import p251.SharedPreferencesC8176;
import p257.C8233;
import p273.AbstractC8340;
import p273.C8339;
import p287.AbstractC8405;
import p316.C8667;
import p326.C8744;
import p329.InterfaceC8769;
import p330.C8777;
import p330.C8778;
import p354.C8888;
import p391.C9095;
import top.suzhelan.qstory.hook.item.ViewOnClickListenerC5912;
import top.suzhelan.qstory.hook.item.mcp.config.C5871;
import top.suzhelan.qstory.hook.item.mcp.config.C5872;
import top.suzhelan.qstory.hook.item.mcp.config.C5873;

/* JADX INFO: renamed from: lin.xposed.hook.javaplugin.dialog.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC5533 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15280;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f15280) {
            case 0:
                PluginDialog.lambda$initViews$5(view);
                return;
            case 1:
                PluginDialog.lambda$setupPluginList$6(view);
                return;
            case 2:
                PluginItemView.lambda$bindPluginInfoData$1(view);
                return;
            case 3:
                ClearLoginInformation.getOnClick$lambda$0(view);
                return;
            case 4:
                ManageFriends.getOnClick$lambda$0(view);
                return;
            case 5:
                ManageTroops.getOnClick$lambda$0(view);
                return;
            case 6:
                NoticeLog.getOnClick$lambda$0(view);
                return;
            case 7:
                Update.lambda$showUpdateDialog$2(view);
                return;
            case 8:
                UpdateLog.getOnClick$lambda$0(view);
                return;
            case 9:
                Context context = view.getContext();
                AbstractC8405.m13972(1309);
                context.getClass();
                AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵呜");
                DialogC6319 dialogC6319 = new DialogC6319(context);
                dialogC6319.m11833(dialogC6319.m11834());
                View viewInflate = LayoutInflater.from(context).inflate(R.layout.set_redpacket_params, (ViewGroup) null, false);
                AbstractC8405.m13972(2632);
                viewInflate.getClass();
                View viewFindViewById = viewInflate.findViewById(R.id.tv_grabHbParamTitle);
                AbstractC8405.m13972(1280);
                viewFindViewById.getClass();
                ((TextView) viewFindViewById).setText(AbstractC8405.m13972(2633));
                View viewFindViewById2 = viewInflate.findViewById(R.id.delay_hb_edit);
                AbstractC8405.m13972(1280);
                viewFindViewById2.getClass();
                EditText editText = (EditText) viewFindViewById2;
                EditText editText2 = (EditText) AbstractC6183.m11570(viewInflate, R.id.redpack_blacklistTroop, 1280);
                EditText editText3 = (EditText) AbstractC6183.m11570(viewInflate, R.id.redpack_blacklistText, 1280);
                EditText editText4 = (EditText) AbstractC6183.m11570(viewInflate, R.id.hb_reply, 1280);
                EditText editText5 = (EditText) AbstractC6183.m11570(viewInflate, R.id.hb_reply_delay, 1280);
                CheckBox checkBox = (CheckBox) AbstractC6183.m11570(viewInflate, R.id.grab_hb_toast, 1280);
                CheckBox checkBox2 = (CheckBox) AbstractC6183.m11570(viewInflate, R.id.grab_fail_toast, 1280);
                CheckBox checkBox3 = (CheckBox) AbstractC6183.m11570(viewInflate, R.id.ordinary_hb_checkbox, 1280);
                CheckBox checkBox4 = (CheckBox) AbstractC6183.m11570(viewInflate, R.id.exclusive_hb_checkbox, 1280);
                EditText editText6 = (EditText) AbstractC6183.m11570(viewInflate, R.id.hb_average, 1280);
                Button button = (Button) AbstractC6183.m11570(viewInflate, R.id.save_red_pack_param_btn, 1280);
                C9095 c9095 = C8744.f24644;
                String strM13973 = AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜喵呜呜喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜喵喵");
                c9095.getClass();
                SharedPreferencesC8176 sharedPreferencesC8176 = c9095.f25489;
                editText.setText(String.valueOf(Long.parseLong(String.valueOf(sharedPreferencesC8176.getInt(strM13973, 0)))));
                editText2.setText(c9095.m14678(AbstractC8405.m13972(1056), ""));
                editText3.setText(c9095.m14678(AbstractC8405.m13972(1057), ""));
                editText4.setText(c9095.m14678(AbstractC8405.m13972(1058), ""));
                editText5.setText(String.valueOf(Long.parseLong(String.valueOf(sharedPreferencesC8176.getInt(AbstractC8405.m13972(1963), 0)))));
                checkBox.setChecked(sharedPreferencesC8176.getBoolean(AbstractC8405.m13972(1061), true));
                checkBox2.setChecked(sharedPreferencesC8176.getBoolean(AbstractC8405.m13972(1960), false));
                checkBox3.setChecked(sharedPreferencesC8176.getBoolean(AbstractC8405.m13972(1062), true));
                checkBox4.setChecked(sharedPreferencesC8176.getBoolean(AbstractC8405.m13972(1063), false));
                editText6.setText(String.valueOf(Long.parseLong(String.valueOf(sharedPreferencesC8176.getInt(AbstractC8405.m13972(1060), 0)))));
                button.setOnClickListener(new ViewOnClickListenerC5912(editText, editText2, editText3, editText4, editText5, checkBox, checkBox2, checkBox3, checkBox4, editText6, dialogC6319));
                dialogC6319.setContentView(viewInflate);
                dialogC6319.show();
                return;
            case 10:
                MainSettingActivity.setTitleBarAttribute$lambda$0(view);
                return;
            case 11:
                C8667.f24453.dismiss();
                return;
            case 12:
                String str = C6414.f17594;
                if (AbstractC4922.m9890(view.getContext(), C6414.f17594)) {
                    AbstractC6185.m11592(AbstractC8405.m13972(102));
                    return;
                } else {
                    AbstractC6185.m11592(AbstractC8405.m13972(103));
                    return;
                }
            case 13:
                if (AbstractC4922.m9890(view.getContext(), AbstractC3933.m8315().concat(AbstractC8405.m13973("喵呜喵呜呜呜喵喵~喵喵呜喵喵呜喵呜~喵喵喵呜喵喵呜呜~喵喵喵喵呜喵呜呜~喵呜喵喵呜喵呜喵")))) {
                    AbstractC6185.m11592(AbstractC8405.m13972(102));
                    return;
                } else {
                    AbstractC6185.m11592(AbstractC8405.m13972(103));
                    return;
                }
            case 14:
                AbstractC6185.m11592(AbstractC8405.m13972(229));
                return;
            case 15:
                AbstractC6185.m11592(AbstractC8405.m13972(229));
                return;
            case 16:
                if (AbstractC4922.m9890(view.getContext(), AbstractC0455.m1166().concat(AbstractC8405.m13972(496)))) {
                    AbstractC6185.m11592(AbstractC8405.m13972(102));
                    return;
                } else {
                    AbstractC6185.m11592(AbstractC8405.m13972(103));
                    return;
                }
            case 17:
                return;
            case 18:
                C5873 c5873 = C5871.f16030;
                Context context2 = view.getContext();
                AbstractC8405.m13972(1309);
                context2.getClass();
                c5873.getClass();
                AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵呜");
                AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵呜");
                ArrayList arrayListM11276 = C5873.m11276();
                ArrayList arrayList = new ArrayList(AbstractC4345.m8822(arrayListM11276, 10));
                int i = 0;
                for (Object obj : arrayListM11276) {
                    int i2 = i + 1;
                    if (i < 0) {
                        AbstractC6347.m11920();
                        throw null;
                    }
                    InterfaceC8769 interfaceC8769 = (InterfaceC8769) obj;
                    String id = interfaceC8769.getId();
                    String title = interfaceC8769.getTitle();
                    String strMo14453 = interfaceC8769.mo14453();
                    C5873 c58732 = C5871.f16030;
                    String id2 = interfaceC8769.getId();
                    c58732.getClass();
                    arrayList.add(new C5872(i, id, title, strMo14453, C5873.m11275(id2)));
                    i = i2;
                }
                C8888 c8888 = new C8888(new ArrayList(arrayList));
                C2473 c2473 = new C2473(new C8778(c8888));
                C8233 c8233M13752 = C8233.m13752();
                c8233M13752.f22722 = new C8777(c8888, c2473);
                c8233M13752.m13753();
                c8233M13752.f22727 = (int) (context2.getResources().getDisplayMetrics().widthPixels * 0.92f);
                c8233M13752.m13753();
                c8233M13752.f22717 = context2.getColor(R.color.mcp_config_mask);
                c8233M13752.m13753();
                c8233M13752.m13754();
                return;
            default:
                AbstractC6185.m11592(AbstractC8405.m13972(1147));
                return;
        }
    }

    public /* synthetic */ ViewOnClickListenerC5533(int i) {
        this.f15280 = i;
    }

    public /* synthetic */ ViewOnClickListenerC5533(AbstractC8340 abstractC8340, C8339 c8339) {
        this.f15280 = 17;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    private final void m10830(View view) {
    }
}
