package lin.xposed.hook.view.main.itemview;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.compose.foundation.C1898;
import androidx.compose.foundation.lazy.C1596;
import androidx.compose.foundation.lazy.layout.C1520;
import androidx.compose.runtime.internal.C2086;
import androidx.recyclerview.widget.AbstractC3317;
import com.alibaba.fastjson2.JSONObject;
import com.bumptech.glide.AbstractC3888;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.kongzue.dialogx.dialogs.WaitDialog$TYPE;
import com.kongzue.dialogx.interfaces.AbstractC4570;
import com.kongzue.dialogx.interfaces.RunnableC4574;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.AbstractC5894;
import lin.xposed.hook.javaplugin.bean.GroupInfo;
import lin.xposed.hook.util.p011qq.CreateElement;
import lin.xposed.hook.util.p011qq.LegacyQQSendTool;
import lin.xposed.hook.util.p011qq.QQNTSendMsgUtils;
import lin.xposed.hook.util.p011qq.QQSessionUtils;
import p025.C6998;
import p025.C7003;
import p026.AbstractC7014;
import p038.AbstractC7135;
import p044.DialogC7148;
import p045.C7149;
import p048.DialogC7159;
import p049.AbstractC7165;
import p049.AbstractC7166;
import p050.AbstractC7176;
import p050.C7177;
import p050.C7179;
import p050.C7181;
import p050.DialogInterfaceOnClickListenerC7168;
import p055.C7217;
import p068.InterfaceC7387;
import p103.C7897;
import p233.AbstractC8798;
import p233.InterfaceC8793;
import p273.C9027;
import p273.C9029;
import p273.C9062;
import p273.C9069;
import p303.AbstractC9234;
import p331.C9492;
import p339.C9536;
import p339.C9537;
import p339.C9543;
import p339.C9557;
import p358.C9646;
import p359.C9648;
import p370.AbstractC9703;
import p370.AbstractC9711;
import p370.C9704;
import p370.C9705;
import p370.C9706;
import p370.C9709;
import p370.C9710;
import p370.C9715;
import p370.C9717;
import p401.C9895;
import p401.C9901;
import p402.C9906;
import p404.C9911;
import top.suzhelan.plugin.sdk.online.entity.Message;
import top.suzhelan.plugin.sdk.online.net.PluginSdkConfig;
import top.suzhelan.plugin.sdk.online.presenter.C6637;
import top.suzhelan.qstory.hook.item.C6755;
import top.suzhelan.qstory.hook.item.mcp.config.C6701;
import top.suzhelan.qstory.hook.item.mcp.config.C6703;
import top.suzhelan.qstory.hook.plugin.entity.NewFriendInfo;
import top.suzhelan.qstory.p015ui.views.DialogXRecycleView;
import top.suzhelan.sticker.sdk.entity.OnlineStickerInfo;
import top.yukonga.miuix.kmp.utils.C6886;

/* JADX INFO: renamed from: lin.xposed.hook.view.main.itemview.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC6392 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f15676;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f15677;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15678;

    public /* synthetic */ ViewOnClickListenerC6392(File file, DialogC7148 dialogC7148) {
        this.f15678 = 3;
        this.f15677 = file;
        this.f15676 = dialogC7148;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String strConcat;
        GroupInfo groupInfo;
        String str;
        int i = 1;
        int i2 = 0;
        switch (this.f15678) {
            case 0:
                Update.lambda$showUpdateDialog$3((DialogC7148) this.f15676, (View.OnClickListener) this.f15677, view);
                return;
            case 1:
                ((C6998) this.f15676).f17308.invoke((C7003) this.f15677);
                return;
            case 2:
                Dialog dialog = (Dialog) this.f15676;
                Context context = (Context) this.f15677;
                if (AbstractC7135.f17758.equals(AbstractC9234.m14531(565))) {
                    AbstractC7014.m12151(AbstractC9234.m14531(566));
                    return;
                } else {
                    dialog.setContentView(AbstractC7135.m12386(dialog, context, AbstractC7135.f17758));
                    return;
                }
            case 3:
                File file = (File) this.f15677;
                DialogC7148 dialogC7148 = (DialogC7148) this.f15676;
                AbstractC5894.m10611(file);
                dialogC7148.dismiss();
                return;
            case 4:
                DialogC7159 dialogC7159 = (DialogC7159) this.f15676;
                String str2 = (String) this.f15677;
                C1520 c1520 = dialogC7159.f17787;
                if (c1520 != null) {
                    C7217 c7217 = (C7217) c1520.f2240;
                    TextView textView = ((DialogC7159) c1520.f2241).f17789;
                    if (!str2.equals(AbstractC9234.m14532("呜喵喵呜喵呜呜喵~呜呜呜呜喵喵喵喵~呜呜喵喵呜喵喵呜~呜喵喵喵喵喵喵呜~呜呜呜呜喵喵呜喵~呜呜喵喵喵喵喵呜"))) {
                        Calendar calendar = Calendar.getInstance();
                        calendar.add(10, Integer.parseInt(str2.substring(0, str2.indexOf(AbstractC9234.m14532("呜喵喵呜喵呜呜喵~呜呜喵喵喵呜喵呜~呜呜呜呜喵呜喵呜~呜喵喵喵呜呜呜喵~呜呜呜呜喵喵呜喵~呜呜喵呜呜喵呜喵")))));
                        c7217.f17897.m12395(Long.valueOf(calendar.getTimeInMillis()), AbstractC9234.m14531(275));
                        textView.setText(AbstractC9234.m14532("呜喵喵呜喵呜呜喵~呜呜呜呜呜呜喵喵~呜呜喵呜喵喵呜呜~呜喵喵喵呜呜喵喵~呜呜喵呜呜喵喵喵~呜呜呜呜喵呜喵呜~喵呜喵喵喵喵喵呜") + ((calendar.getTimeInMillis() - System.currentTimeMillis()) / 3600000) + AbstractC9234.m14532("呜喵喵呜喵呜喵呜~呜呜呜喵喵喵呜喵~呜呜喵喵呜呜喵喵"));
                        StringBuilder sb = new StringBuilder();
                        sb.append(AbstractC9234.m14532("呜喵喵呜喵呜呜喵~呜呜喵喵喵呜喵呜~呜呜呜呜呜呜喵喵~呜喵喵喵呜呜喵呜~呜呜呜呜呜喵喵呜~呜呜喵喵喵呜喵喵~喵呜喵喵喵喵喵呜"));
                        Date date = new Date(((Long) c7217.f17897.m12398(AbstractC9234.m14531(275))).longValue());
                        String strM14531 = AbstractC9234.m14531(281);
                        try {
                            strConcat = new SimpleDateFormat(strM14531).format(date);
                        } catch (Exception unused) {
                            strConcat = AbstractC9234.m14531(272).concat(strM14531);
                        }
                        sb.append(strConcat);
                        sb.append(AbstractC9234.m14532("喵呜喵呜喵喵呜呜~呜喵喵呜喵喵呜喵~呜呜喵喵喵喵喵呜~呜呜呜呜呜喵呜呜~呜喵喵喵喵喵呜呜~呜呜呜呜喵喵喵呜~呜呜呜呜呜呜呜喵"));
                        AbstractC7014.m12151(sb.toString());
                        break;
                    } else {
                        C7149 c7149 = c7217.f17897;
                        c7149.getClass();
                        c7149.f17776 = new JSONObject();
                        textView.setText(AbstractC9234.m14531(277));
                        AbstractC7014.m12151(AbstractC9234.m14531(280));
                    }
                    c7217.f17897.m12395(str2, AbstractC9234.m14531(276));
                    c7217.f17897.mo12394();
                    return;
                }
                return;
            case 5:
                Context context2 = (Context) this.f15676;
                RadioGroup radioGroup = (RadioGroup) this.f15677;
                EditText editText = new EditText(context2);
                new AlertDialog.Builder(context2, AbstractC7176.m12458(context2) ? 2 : 3).setTitle(AbstractC9234.m14531(360)).setView(editText).setNeutralButton(AbstractC9234.m14531(361), new DialogInterfaceOnClickListenerC7168(editText, radioGroup, context2, i)).show();
                return;
            case 6:
                C7179 c7179 = (C7179) this.f15676;
                String str3 = (String) this.f15677;
                C7179.f17832 = 0;
                c7179.m12494(str3);
                Iterator it = c7179.f17840.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).setBackgroundColor(c7179.getResources().getColor(C0328R.color.bg_plugin, null));
                }
                view.setBackground(c7179.getResources().getDrawable(C0328R.drawable.menu_item_base, null));
                return;
            case 7:
                C7181 c7181 = (C7181) this.f15676;
                C7177 c7177 = (C7177) this.f15677;
                if (c7177.f17830 == 2) {
                    return;
                }
                if (AbstractC3888.m7256()) {
                    Object objCreateEmojiElement = CreateElement.createEmojiElement(c7177.f17831);
                    try {
                        Object objM12418 = AbstractC7165.m12418(AbstractC7166.m12425(AbstractC9234.m14531(178)), AbstractC9234.m14531(282), objCreateEmojiElement);
                        AbstractC7165.m12424(objM12418, AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵喵呜喵呜~喵喵喵喵喵呜喵喵~喵喵喵呜呜呜呜喵~喵喵喵呜呜喵喵喵"), AbstractC9234.m14531(364));
                        AbstractC7165.m12424(objM12418, AbstractC9234.m14531(141), 0);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(objCreateEmojiElement);
                        QQNTSendMsgUtils.sendMsg(QQSessionUtils.getCurrentContact(), arrayList);
                    } catch (Exception e) {
                        C6755.m11872(e);
                        return;
                    }
                } else {
                    Object objBuilderPic = LegacyQQSendTool.MsgBuilder.builderPic(QQSessionUtils.getCurrentSessionInfo(), c7177.f17831);
                    LegacyQQSendTool.setPicText(objBuilderPic, AbstractC9234.m14531(364));
                    LegacyQQSendTool.sendPic(QQSessionUtils.getCurrentSessionInfo(), objBuilderPic);
                }
                c7181.f17844.setClickable(false);
                c7181.f17844.setOnTouchListener(null);
                synchronized (AbstractC7176.class) {
                    C7179 c71792 = AbstractC7176.f17826;
                    if (c71792 != null) {
                        c71792.dismiss();
                    }
                    break;
                }
                return;
            case 8:
                C7217 c72172 = (C7217) this.f15676;
                Activity activity = (Activity) ((ImageView) this.f15677).getContext();
                c72172.f17897 = new C7149(AbstractC9234.m14531(271));
                DialogC7159 dialogC71592 = new DialogC7159(activity, new String[]{AbstractC9234.m14531(273), AbstractC9234.m14531(274), AbstractC9234.m14532("喵呜喵喵呜喵呜呜~呜喵喵呜喵喵喵喵~呜呜喵喵呜喵呜喵~呜呜呜喵喵呜呜呜~呜喵喵喵喵喵呜呜~呜呜呜呜呜喵呜呜~呜呜喵呜喵呜呜呜"), AbstractC9234.m14532("喵呜喵喵喵喵喵呜~呜喵喵呜喵喵喵喵~呜呜喵喵呜喵呜喵~呜呜呜喵喵呜呜呜~呜喵喵喵喵喵呜呜~呜呜呜呜呜喵呜呜~呜呜喵呜喵呜呜呜"), AbstractC9234.m14532("呜喵喵呜喵呜呜喵~呜呜呜呜喵喵喵喵~呜呜喵喵呜喵喵呜~呜喵喵喵喵喵喵呜~呜呜呜呜喵喵呜喵~呜呜喵喵喵喵喵呜")});
                TextView textView2 = dialogC71592.f17789;
                Long l = (Long) c72172.f17897.m12398(AbstractC9234.m14531(275));
                Date date2 = new Date();
                if (l == null || date2.getTime() > l.longValue()) {
                    C7149 c71492 = c72172.f17897;
                    c71492.getClass();
                    c71492.f17776 = new JSONObject();
                    c72172.f17897.m12395(AbstractC9234.m14532("呜喵喵呜喵呜呜喵~呜呜呜呜喵喵喵喵~呜呜喵喵呜喵喵呜~呜喵喵喵喵喵喵呜~呜呜呜呜喵喵呜喵~呜呜喵喵喵喵喵呜"), AbstractC9234.m14531(276));
                    textView2.setText(AbstractC9234.m14531(277));
                } else {
                    long jLongValue = l.longValue() - date2.getTime();
                    long j = jLongValue / 3600000;
                    textView2.setText(AbstractC9234.m14532("呜喵喵呜喵呜呜喵~呜呜呜呜呜呜喵喵~呜呜喵呜喵喵呜呜~呜喵喵喵呜呜喵喵~呜呜喵呜呜喵喵喵~呜呜呜呜喵呜喵呜~喵呜喵喵喵喵喵呜") + j + AbstractC9234.m14532("呜喵喵呜喵呜喵呜~呜呜呜喵喵喵呜喵~呜呜喵喵呜呜喵喵") + ((jLongValue - (3600000 * j)) / 60000) + AbstractC9234.m14532("呜喵喵呜喵呜呜喵~呜呜呜呜呜呜喵呜~呜呜呜呜呜呜喵喵"));
                }
                dialogC71592.f17788 = (String) c72172.f17897.m12398(AbstractC9234.m14531(276));
                dialogC71592.f17787 = new C1520(c72172, 4, dialogC71592);
                dialogC71592.show();
                return;
            case 9:
                AbstractC3317 abstractC3317 = (AbstractC3317) this.f15676;
                AbstractC8798 abstractC8798 = (AbstractC8798) this.f15677;
                int bindingAdapterPosition = abstractC3317.getBindingAdapterPosition();
                if (bindingAdapterPosition == -1) {
                    return;
                }
                view.getClass();
                InterfaceC8793 interfaceC8793 = abstractC8798.f22386;
                if (interfaceC8793 != null) {
                    interfaceC8793.mo2038(abstractC8798, view, bindingAdapterPosition);
                    return;
                }
                return;
            case 10:
                DialogXRecycleView dialogXRecycleView = (DialogXRecycleView) this.f15676;
                ImageView imageView = (ImageView) this.f15677;
                if (dialogXRecycleView.getVisibility() == 8) {
                    dialogXRecycleView.setVisibility(0);
                    imageView.setImageResource(R.drawable.arrow_up_float);
                    return;
                } else {
                    dialogXRecycleView.setVisibility(8);
                    imageView.setImageResource(R.drawable.arrow_down_float);
                    return;
                }
            case 11:
                ((C9557) this.f15676).f24943.invoke((File) this.f15677);
                return;
            case 12:
                List<C9543> list = (List) this.f15676;
                C9543 c9543 = (C9543) this.f15677;
                for (C9543 c95432 : list) {
                    c95432.f24893.setChecked(c95432 == c9543);
                }
                return;
            case 13:
                C9717 c9717 = (C9717) this.f15676;
                C9062 c9062 = (C9062) this.f15677;
                C6703 c6703 = C6701.f16375;
                ArrayList arrayListM15098 = c9717.m15098();
                c6703.getClass();
                C6703.m11831(arrayListM15098);
                C6703.m11833(c6703);
                AbstractC7014.m12151(AbstractC9234.m14531(2291));
                if (c9062 != null) {
                    c9062.m14314();
                    return;
                }
                return;
            case 14:
                TextView textView3 = (TextView) this.f15676;
                String str4 = (String) this.f15677;
                Object systemService = textView3.getContext().getSystemService(AbstractC9234.m14531(46));
                AbstractC9234.m14531(2292);
                systemService.getClass();
                ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(AbstractC9234.m14531(2293), str4));
                AbstractC7014.m12151(AbstractC9234.m14531(2294));
                return;
            case 15:
                ((C7897) ((C9646) this.f15676).f25165).invoke((File) this.f15677);
                return;
            case 16:
                C9648 c9648 = (C9648) this.f15676;
                OnlineStickerInfo onlineStickerInfo = (OnlineStickerInfo) this.f15677;
                InterfaceC7387 interfaceC7387 = c9648.f25169;
                if (interfaceC7387 != null) {
                    interfaceC7387.invoke(onlineStickerInfo);
                    return;
                }
                return;
            case 17:
                C9492 c9492 = (C9492) this.f15676;
                C9706 c9706 = (C9706) this.f15677;
                int absoluteAdapterPosition = c9492.getAbsoluteAdapterPosition();
                if (absoluteAdapterPosition != -1) {
                    Object obj = c9706.f22387.get(absoluteAdapterPosition);
                    C9705 c9705 = obj instanceof C9705 ? (C9705) obj : null;
                    if (c9705 == null) {
                        return;
                    }
                    NewFriendInfo newFriendInfo = c9705.f25369;
                    String str5 = newFriendInfo.uin;
                    c9706.f25374.put(str5, Boolean.valueOf(!AbstractC5227.m9466(r2.get(str5), Boolean.TRUE)));
                    c9706.m5364(absoluteAdapterPosition);
                    int i3 = newFriendInfo.categoryId;
                    for (Object obj2 : c9706.f22387) {
                        int i4 = i2 + 1;
                        if (i2 < 0) {
                            AbstractC7176.m12479();
                            throw null;
                        }
                        AbstractC9703 abstractC9703 = (AbstractC9703) obj2;
                        if ((abstractC9703 instanceof C9704) && ((C9704) abstractC9703).f25368 == i3) {
                            c9706.m5364(i2);
                        }
                        i2 = i4;
                    }
                    C1596 c1596 = c9706.f25373;
                    if (c1596 != null) {
                        c1596.invoke();
                        return;
                    }
                    return;
                }
                return;
            case 18:
                C9492 c94922 = (C9492) this.f15676;
                C9646 c9646 = (C9646) this.f15677;
                int absoluteAdapterPosition2 = c94922.getAbsoluteAdapterPosition();
                if (absoluteAdapterPosition2 == -1 || (groupInfo = (GroupInfo) c9646.f22387.get(absoluteAdapterPosition2)) == null || (str = groupInfo.GroupUin) == null) {
                    return;
                }
                ((LinkedHashMap) c9646.f25165).put(str, Boolean.valueOf(!AbstractC5227.m9466(r1.get(str), Boolean.TRUE)));
                c9646.m5364(absoluteAdapterPosition2);
                return;
            case 19:
                C9492 c94923 = (C9492) this.f15676;
                C9715 c9715 = (C9715) this.f15677;
                int absoluteAdapterPosition3 = c94923.getAbsoluteAdapterPosition();
                if (absoluteAdapterPosition3 != -1) {
                    Object obj3 = c9715.f22387.get(absoluteAdapterPosition3);
                    C9709 c9709 = obj3 instanceof C9709 ? (C9709) obj3 : null;
                    if (c9709 == null) {
                        return;
                    }
                    GroupInfo groupInfo2 = c9709.f25383;
                    boolean z = c9709.f25382;
                    if (z) {
                        return;
                    }
                    String str6 = groupInfo2.GroupUin;
                    c9715.f25397.put(str6, Boolean.valueOf(!AbstractC5227.m9466(r3.get(str6), Boolean.TRUE)));
                    c9715.m5364(absoluteAdapterPosition3);
                    if (z) {
                        i = 0;
                    } else if (groupInfo2.IsOwnerOrAdmin) {
                        i = 1;
                    }
                    for (Object obj4 : c9715.f22387) {
                        int i5 = i2 + 1;
                        if (i2 < 0) {
                            AbstractC7176.m12479();
                            throw null;
                        }
                        AbstractC9711 abstractC9711 = (AbstractC9711) obj4;
                        if ((abstractC9711 instanceof C9710) && ((C9710) abstractC9711).f25387 == i) {
                            c9715.m5364(i2);
                        }
                        i2 = i5;
                    }
                    C1596 c15962 = c9715.f25396;
                    if (c15962 != null) {
                        c15962.invoke();
                        return;
                    }
                    return;
                }
                return;
            case 20:
                C2086 c2086 = (C2086) this.f15676;
                C9646 c96462 = (C9646) this.f15677;
                EditText editText2 = (EditText) c2086.f3981;
                if (editText2 == null) {
                    AbstractC5227.m9467("inputEdit");
                    throw null;
                }
                Editable text = editText2.getText();
                if (text != null && text.length() != 0) {
                    C9027.m14266("正在发送");
                    C6637 c6637 = (C6637) c2086.f3974;
                    EditText editText3 = (EditText) c2086.f3981;
                    if (editText3 != null) {
                        c6637.m11782(editText3.getText().toString(), (String) c2086.f3975, new C1898(c2086, 14, c96462));
                        return;
                    } else {
                        AbstractC5227.m9467("inputEdit");
                        throw null;
                    }
                }
                C9027 c9027M14268 = C9027.m14268();
                if (c9027M14268 == null) {
                    new C9027();
                    return;
                }
                WaitDialog$TYPE waitDialog$TYPE = WaitDialog$TYPE.WARNING;
                c9027M14268.f22919 = "你还没有输入内容哦";
                if (c9027M14268.f22925 != waitDialog$TYPE) {
                    c9027M14268.f22923 = waitDialog$TYPE.ordinal();
                    c9027M14268.f22925 = waitDialog$TYPE;
                    if (c9027M14268.m14272() != null) {
                        C9029 c9029M14272 = c9027M14268.m14272();
                        c9029M14272.getClass();
                        AbstractC4570.m8589(new RunnableC4574(c9029M14272, 17, waitDialog$TYPE));
                    }
                }
                c9027M14268.m14270();
                if (c9027M14268.m14272() == null) {
                    c9027M14268.m14271();
                    return;
                }
                return;
            case 21:
                ((C6886) ((C9646) this.f15676).f25165).invoke((C9901) this.f15677);
                return;
            case 22:
                ((C9906) ((C9648) this.f15676).f25169).invoke((Message) this.f15677);
                return;
            case 23:
                C9895 c9895 = (C9895) this.f15676;
                C9911 c9911 = (C9911) this.f15677;
                C9027.m14266("下载中...");
                String str7 = PluginSdkConfig.getDOWNLOAD_DIR() + "/" + c9895.getPluginInfo().getName() + ".zip";
                c9911.f25802.m11777(c9895, str7, new C7897(c9911, 11, str7));
                return;
            default:
                C9492 c94924 = (C9492) this.f15676;
                C9895 c98952 = (C9895) this.f15677;
                Context context3 = c94924.itemView.getContext();
                context3.getClass();
                C2086 c20862 = new C2086(context3, c98952.getPluginInfo().getName(), c98952.getPluginId());
                int i6 = (int) (((double) context3.getResources().getDisplayMetrics().heightPixels) * 0.8d);
                C9069 c9069 = (C9069) c20862.f3973;
                c9069.f11935 = i6;
                c9069.m14322();
                c9069.f23117 = false;
                c9069.f23109 = new C9536(c20862);
                c9069.m14322();
                c9069.m14320(new C9537(c20862, i));
                c9069.m14319();
                return;
        }
    }

    public /* synthetic */ ViewOnClickListenerC6392(Object obj, int i, Object obj2) {
        this.f15678 = i;
        this.f15676 = obj;
        this.f15677 = obj2;
    }
}
