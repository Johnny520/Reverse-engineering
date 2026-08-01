package lin.xposed.hook.javaplugin.dialog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.C2473;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.AbstractC3065;
import com.davemorrissey.labs.subscaleview.R;
import io.ktor.client.plugins.AbstractC3932;
import java.util.ArrayList;
import kotlin.collections.AbstractC4344;
import kotlin.reflect.jvm.internal.AbstractC5061;
import lin.xposed.hook.javaplugin.view.PluginItemView;
import lin.xposed.hook.view.main.MainSettingActivity;
import lin.xposed.hook.view.main.itemview.ClearLoginInformation;
import lin.xposed.hook.view.main.itemview.ManageFriends;
import lin.xposed.hook.view.main.itemview.ManageTroops;
import lin.xposed.hook.view.main.itemview.NoticeLog;
import lin.xposed.hook.view.main.itemview.Update;
import lin.xposed.hook.view.main.itemview.UpdateLog;
import p007.AbstractC6136;
import p010.AbstractC6154;
import p027.DialogC6300;
import p038.C6397;
import p251.SharedPreferencesC8175;
import p253.AbstractC8189;
import p257.C8232;
import p273.AbstractC8339;
import p273.C8338;
import p316.C8675;
import p322.C8726;
import p325.InterfaceC8761;
import p329.C8786;
import p329.C8787;
import p356.C8909;
import p391.C9114;
import top.suzhelan.qstory.hook.item.ViewOnClickListenerC5906;
import top.suzhelan.qstory.hook.item.mcp.config.C5866;
import top.suzhelan.qstory.hook.item.mcp.config.C5867;
import top.suzhelan.qstory.hook.item.mcp.config.C5868;

/* JADX INFO: renamed from: lin.xposed.hook.javaplugin.dialog.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC5532 implements View.OnClickListener {

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
                AbstractC3056.m6668(-3937689067177903527L);
                context.getClass();
                AbstractC3056.m6668(-3937616005489231271L);
                DialogC6300 dialogC6300 = new DialogC6300(context);
                dialogC6300.m11805(dialogC6300.m11806());
                View viewInflate = LayoutInflater.from(context).inflate(R.layout.set_redpacket_params, (ViewGroup) null, false);
                AbstractC3056.m6668(-3937822580531266983L);
                viewInflate.getClass();
                View viewFindViewById = viewInflate.findViewById(R.id.tv_grabHbParamTitle);
                AbstractC3056.m6668(-3937691541079066023L);
                viewFindViewById.getClass();
                ((TextView) viewFindViewById).setText(AbstractC3056.m6668(-3937822602006103463L));
                View viewFindViewById2 = viewInflate.findViewById(R.id.delay_hb_edit);
                AbstractC3056.m6668(-3937691541079066023L);
                viewFindViewById2.getClass();
                EditText editText = (EditText) viewFindViewById2;
                EditText editText2 = (EditText) AbstractC6136.m11537(viewInflate, R.id.redpack_blacklistTroop, -3937691541079066023L);
                EditText editText3 = (EditText) AbstractC6136.m11537(viewInflate, R.id.redpack_blacklistText, -3937691541079066023L);
                EditText editText4 = (EditText) AbstractC6136.m11537(viewInflate, R.id.hb_reply, -3937691541079066023L);
                EditText editText5 = (EditText) AbstractC6136.m11537(viewInflate, R.id.hb_reply_delay, -3937691541079066023L);
                CheckBox checkBox = (CheckBox) AbstractC6136.m11537(viewInflate, R.id.grab_hb_toast, -3937691541079066023L);
                CheckBox checkBox2 = (CheckBox) AbstractC6136.m11537(viewInflate, R.id.grab_fail_toast, -3937691541079066023L);
                CheckBox checkBox3 = (CheckBox) AbstractC6136.m11537(viewInflate, R.id.ordinary_hb_checkbox, -3937691541079066023L);
                CheckBox checkBox4 = (CheckBox) AbstractC6136.m11537(viewInflate, R.id.exclusive_hb_checkbox, -3937691541079066023L);
                EditText editText6 = (EditText) AbstractC6136.m11537(viewInflate, R.id.hb_average, -3937691541079066023L);
                Button button = (Button) AbstractC6136.m11537(viewInflate, R.id.save_red_pack_param_btn, -3937691541079066023L);
                C9114 c9114 = C8726.f24598;
                String strM6668 = AbstractC3056.m6668(-3937662610179360167L);
                c9114.getClass();
                SharedPreferencesC8175 sharedPreferencesC8175 = c9114.f25485;
                editText.setText(String.valueOf(Long.parseLong(String.valueOf(sharedPreferencesC8175.getInt(strM6668, 0)))));
                editText2.setText(c9114.m14641(AbstractC3056.m6668(-3937662532869948839L), AbstractC3056.m6668(-3937561979095614887L)));
                editText3.setText(c9114.m14641(AbstractC3056.m6668(-3937662459855504807L), AbstractC3056.m6668(-3937561979095614887L)));
                editText4.setText(c9114.m14641(AbstractC3056.m6668(-3937662485625308583L), AbstractC3056.m6668(-3937561979095614887L)));
                editText5.setText(String.valueOf(Long.parseLong(String.valueOf(sharedPreferencesC8175.getInt(AbstractC3056.m6668(-3937758409424897447L), 0)))));
                checkBox.setChecked(sharedPreferencesC8175.getBoolean(AbstractC3056.m6668(-3937662253697074599L), true));
                checkBox2.setChecked(sharedPreferencesC8175.getBoolean(AbstractC3056.m6668(-3937758619878294951L), false));
                checkBox3.setChecked(sharedPreferencesC8175.getBoolean(AbstractC3056.m6668(-3937662296646747559L), true));
                checkBox4.setChecked(sharedPreferencesC8175.getBoolean(AbstractC3056.m6668(-3937662163502761383L), false));
                editText6.setText(String.valueOf(Long.parseLong(String.valueOf(sharedPreferencesC8175.getInt(AbstractC3056.m6668(-3937662300941714855L), 0)))));
                button.setOnClickListener(new ViewOnClickListenerC5906(editText, editText2, editText3, editText4, editText5, checkBox, checkBox2, checkBox3, checkBox4, editText6, dialogC6300));
                dialogC6300.setContentView(viewInflate);
                dialogC6300.show();
                return;
            case 10:
                MainSettingActivity.setTitleBarAttribute$lambda$0(view);
                return;
            case 11:
                String str = C6397.f17549;
                if (C8675.m14361(view.getContext(), C6397.f17549)) {
                    AbstractC6154.m11561(AbstractC3056.m6668(-3937569070086620583L));
                    return;
                } else {
                    AbstractC6154.m11561(AbstractC3056.m6668(-3937569057201718695L));
                    return;
                }
            case 12:
                if (C8675.m14361(view.getContext(), AbstractC3932.m8313().concat(AbstractC3056.m6668(-3937574185392670119L)))) {
                    AbstractC6154.m11561(AbstractC3056.m6668(-3937569070086620583L));
                    return;
                } else {
                    AbstractC6154.m11561(AbstractC3056.m6668(-3937569057201718695L));
                    return;
                }
            case 13:
                AbstractC6154.m11561(AbstractC3056.m6668(-3937586975805277607L));
                return;
            case 14:
                AbstractC6154.m11561(AbstractC3056.m6668(-3937586975805277607L));
                return;
            case 15:
                AbstractC3065.f9797.dismiss();
                return;
            case 16:
                if (C8675.m14361(view.getContext(), AbstractC5061.m10021().concat(AbstractC3056.m6668(-3937610718384489895L)))) {
                    AbstractC6154.m11561(AbstractC3056.m6668(-3937569070086620583L));
                    return;
                } else {
                    AbstractC6154.m11561(AbstractC3056.m6668(-3937569057201718695L));
                    return;
                }
            case 17:
                return;
            case 18:
                AbstractC6154.m11561(AbstractC3056.m6668(-3937668429860046247L));
                return;
            default:
                C5868 c5868 = C5866.f16023;
                Context context2 = view.getContext();
                AbstractC3056.m6668(-3937689067177903527L);
                context2.getClass();
                c5868.getClass();
                AbstractC3056.m6668(-3937616005489231271L);
                AbstractC3056.m6668(-3937616005489231271L);
                ArrayList arrayListM11214 = C5868.m11214();
                ArrayList arrayList = new ArrayList(AbstractC4344.m8832(arrayListM11214, 10));
                int i = 0;
                for (Object obj : arrayListM11214) {
                    int i2 = i + 1;
                    if (i < 0) {
                        AbstractC8189.m13662();
                        throw null;
                    }
                    InterfaceC8761 interfaceC8761 = (InterfaceC8761) obj;
                    String id = interfaceC8761.getId();
                    String title = interfaceC8761.getTitle();
                    String strMo14419 = interfaceC8761.mo14419();
                    C5868 c58682 = C5866.f16023;
                    String id2 = interfaceC8761.getId();
                    c58682.getClass();
                    arrayList.add(new C5867(i, id, title, strMo14419, C5868.m11213(id2)));
                    i = i2;
                }
                C8909 c8909 = new C8909(new ArrayList(arrayList));
                C2473 c2473 = new C2473(new C8787(c8909));
                C8232 c8232M13736 = C8232.m13736();
                c8232M13736.f22723 = new C8786(c8909, c2473);
                c8232M13736.m13737();
                c8232M13736.f22728 = (int) (context2.getResources().getDisplayMetrics().widthPixels * 0.92f);
                c8232M13736.m13737();
                c8232M13736.f22718 = context2.getColor(R.color.mcp_config_mask);
                c8232M13736.m13737();
                c8232M13736.m13738();
                return;
        }
    }

    public /* synthetic */ ViewOnClickListenerC5532(int i) {
        this.f15280 = i;
    }

    public /* synthetic */ ViewOnClickListenerC5532(AbstractC8339 abstractC8339, C8338 c8338) {
        this.f15280 = 17;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    private final void m10773(View view) {
    }
}
