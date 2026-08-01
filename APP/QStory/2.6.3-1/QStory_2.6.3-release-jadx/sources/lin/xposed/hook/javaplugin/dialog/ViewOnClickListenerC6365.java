package lin.xposed.hook.javaplugin.dialog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import androidx.compose.foundation.draganddrop.AbstractC1298;
import androidx.recyclerview.widget.C3306;
import com.davemorrissey.labs.subscaleview.C0328R;
import io.ktor.client.plugins.AbstractC4765;
import java.util.ArrayList;
import kotlin.collections.AbstractC5177;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import lin.xposed.hook.javaplugin.view.PluginItemView;
import lin.xposed.hook.view.main.MainSettingActivity;
import lin.xposed.hook.view.main.itemview.ClearLoginInformation;
import lin.xposed.hook.view.main.itemview.ManageFriends;
import lin.xposed.hook.view.main.itemview.ManageTroops;
import lin.xposed.hook.view.main.itemview.NoticeLog;
import lin.xposed.hook.view.main.itemview.Update;
import lin.xposed.hook.view.main.itemview.UpdateLog;
import p025.AbstractC7012;
import p026.AbstractC7014;
import p044.DialogC7148;
import p050.AbstractC7176;
import p055.C7243;
import p267.SharedPreferencesC9005;
import p273.C9062;
import p289.AbstractC9169;
import p289.C9168;
import p303.AbstractC9234;
import p332.C9496;
import p342.C9573;
import p345.InterfaceC9598;
import p346.C9606;
import p346.C9607;
import p370.C9717;
import p407.C9924;
import top.suzhelan.qstory.hook.item.ViewOnClickListenerC6742;
import top.suzhelan.qstory.hook.item.mcp.config.C6701;
import top.suzhelan.qstory.hook.item.mcp.config.C6702;
import top.suzhelan.qstory.hook.item.mcp.config.C6703;

/* JADX INFO: renamed from: lin.xposed.hook.javaplugin.dialog.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC6365 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15625;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f15625) {
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
                AbstractC9234.m14531(1309);
                context.getClass();
                AbstractC9234.m14532("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵呜");
                DialogC7148 dialogC7148 = new DialogC7148(context);
                dialogC7148.m12392(dialogC7148.m12393());
                View viewInflate = LayoutInflater.from(context).inflate(C0328R.layout.set_redpacket_params, (ViewGroup) null, false);
                AbstractC9234.m14531(2632);
                viewInflate.getClass();
                View viewFindViewById = viewInflate.findViewById(C0328R.id.tv_grabHbParamTitle);
                AbstractC9234.m14531(1280);
                viewFindViewById.getClass();
                ((TextView) viewFindViewById).setText(AbstractC9234.m14531(2633));
                View viewFindViewById2 = viewInflate.findViewById(C0328R.id.delay_hb_edit);
                AbstractC9234.m14531(1280);
                viewFindViewById2.getClass();
                EditText editText = (EditText) viewFindViewById2;
                EditText editText2 = (EditText) AbstractC7012.m12129(viewInflate, C0328R.id.redpack_blacklistTroop, 1280);
                EditText editText3 = (EditText) AbstractC7012.m12129(viewInflate, C0328R.id.redpack_blacklistText, 1280);
                EditText editText4 = (EditText) AbstractC7012.m12129(viewInflate, C0328R.id.hb_reply, 1280);
                EditText editText5 = (EditText) AbstractC7012.m12129(viewInflate, C0328R.id.hb_reply_delay, 1280);
                CheckBox checkBox = (CheckBox) AbstractC7012.m12129(viewInflate, C0328R.id.grab_hb_toast, 1280);
                CheckBox checkBox2 = (CheckBox) AbstractC7012.m12129(viewInflate, C0328R.id.grab_fail_toast, 1280);
                CheckBox checkBox3 = (CheckBox) AbstractC7012.m12129(viewInflate, C0328R.id.ordinary_hb_checkbox, 1280);
                CheckBox checkBox4 = (CheckBox) AbstractC7012.m12129(viewInflate, C0328R.id.exclusive_hb_checkbox, 1280);
                EditText editText6 = (EditText) AbstractC7012.m12129(viewInflate, C0328R.id.hb_average, 1280);
                Button button = (Button) AbstractC7012.m12129(viewInflate, C0328R.id.save_red_pack_param_btn, 1280);
                C9924 c9924 = C9573.f24989;
                String strM14532 = AbstractC9234.m14532("喵喵喵呜喵呜呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜喵呜呜喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜喵喵");
                c9924.getClass();
                SharedPreferencesC9005 sharedPreferencesC9005 = c9924.f25834;
                editText.setText(String.valueOf(Long.parseLong(String.valueOf(sharedPreferencesC9005.getInt(strM14532, 0)))));
                editText2.setText(c9924.m15237(AbstractC9234.m14531(1056), ""));
                editText3.setText(c9924.m15237(AbstractC9234.m14531(1057), ""));
                editText4.setText(c9924.m15237(AbstractC9234.m14531(1058), ""));
                editText5.setText(String.valueOf(Long.parseLong(String.valueOf(sharedPreferencesC9005.getInt(AbstractC9234.m14531(1963), 0)))));
                checkBox.setChecked(sharedPreferencesC9005.getBoolean(AbstractC9234.m14531(1061), true));
                checkBox2.setChecked(sharedPreferencesC9005.getBoolean(AbstractC9234.m14531(1960), false));
                checkBox3.setChecked(sharedPreferencesC9005.getBoolean(AbstractC9234.m14531(1062), true));
                checkBox4.setChecked(sharedPreferencesC9005.getBoolean(AbstractC9234.m14531(1063), false));
                editText6.setText(String.valueOf(Long.parseLong(String.valueOf(sharedPreferencesC9005.getInt(AbstractC9234.m14531(1060), 0)))));
                button.setOnClickListener(new ViewOnClickListenerC6742(editText, editText2, editText3, editText4, editText5, checkBox, checkBox2, checkBox3, checkBox4, editText6, dialogC7148));
                dialogC7148.setContentView(viewInflate);
                dialogC7148.show();
                return;
            case 10:
                MainSettingActivity.setTitleBarAttribute$lambda$0(view);
                return;
            case 11:
                C9496.f24798.dismiss();
                return;
            case 12:
                String str = C7243.f17939;
                if (AbstractC5754.m10449(view.getContext(), C7243.f17939)) {
                    AbstractC7014.m12151(AbstractC9234.m14531(102));
                    return;
                } else {
                    AbstractC7014.m12151(AbstractC9234.m14531(103));
                    return;
                }
            case 13:
                if (AbstractC5754.m10449(view.getContext(), AbstractC4765.m8874().concat(AbstractC9234.m14532("喵呜喵呜呜呜喵喵~喵喵呜喵喵呜喵呜~喵喵喵呜喵喵呜呜~喵喵喵喵呜喵呜呜~喵呜喵喵呜喵呜喵")))) {
                    AbstractC7014.m12151(AbstractC9234.m14531(102));
                    return;
                } else {
                    AbstractC7014.m12151(AbstractC9234.m14531(103));
                    return;
                }
            case 14:
                AbstractC7014.m12151(AbstractC9234.m14531(229));
                return;
            case 15:
                AbstractC7014.m12151(AbstractC9234.m14531(229));
                return;
            case 16:
                if (AbstractC5754.m10449(view.getContext(), AbstractC1298.m1726().concat(AbstractC9234.m14531(496)))) {
                    AbstractC7014.m12151(AbstractC9234.m14531(102));
                    return;
                } else {
                    AbstractC7014.m12151(AbstractC9234.m14531(103));
                    return;
                }
            case 17:
                return;
            case 18:
                C6703 c6703 = C6701.f16375;
                Context context2 = view.getContext();
                AbstractC9234.m14531(1309);
                context2.getClass();
                c6703.getClass();
                AbstractC9234.m14532("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵呜");
                AbstractC9234.m14532("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵呜");
                ArrayList arrayListM11835 = C6703.m11835();
                ArrayList arrayList = new ArrayList(AbstractC5177.m9381(arrayListM11835, 10));
                int i = 0;
                for (Object obj : arrayListM11835) {
                    int i2 = i + 1;
                    if (i < 0) {
                        AbstractC7176.m12479();
                        throw null;
                    }
                    InterfaceC9598 interfaceC9598 = (InterfaceC9598) obj;
                    String id = interfaceC9598.getId();
                    String title = interfaceC9598.getTitle();
                    String strMo15012 = interfaceC9598.mo15012();
                    C6703 c67032 = C6701.f16375;
                    String id2 = interfaceC9598.getId();
                    c67032.getClass();
                    arrayList.add(new C6702(i, id, title, strMo15012, C6703.m11834(id2)));
                    i = i2;
                }
                C9717 c9717 = new C9717(new ArrayList(arrayList));
                C3306 c3306 = new C3306(new C9607(c9717));
                C9062 c9062M14311 = C9062.m14311();
                c9062M14311.f23067 = new C9606(c9717, c3306);
                c9062M14311.m14312();
                c9062M14311.f23072 = (int) (context2.getResources().getDisplayMetrics().widthPixels * 0.92f);
                c9062M14311.m14312();
                c9062M14311.f23062 = context2.getColor(C0328R.color.mcp_config_mask);
                c9062M14311.m14312();
                c9062M14311.m14313();
                return;
            default:
                AbstractC7014.m12151(AbstractC9234.m14531(1147));
                return;
        }
    }

    public /* synthetic */ ViewOnClickListenerC6365(int i) {
        this.f15625 = i;
    }

    public /* synthetic */ ViewOnClickListenerC6365(AbstractC9169 abstractC9169, C9168 c9168) {
        this.f15625 = 17;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    private final void m11389(View view) {
    }
}
