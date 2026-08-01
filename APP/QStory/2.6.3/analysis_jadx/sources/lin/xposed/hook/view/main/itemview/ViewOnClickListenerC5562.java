package lin.xposed.hook.view.main.itemview;

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
import androidx.compose.foundation.C1060;
import androidx.compose.foundation.lazy.C0755;
import androidx.compose.foundation.lazy.layout.C0679;
import androidx.compose.runtime.internal.C1251;
import androidx.recyclerview.widget.AbstractC2484;
import com.alibaba.fastjson2.JSONObject;
import com.bumptech.glide.AbstractC3056;
import com.davemorrissey.labs.subscaleview.R;
import com.kongzue.dialogx.dialogs.WaitDialog$TYPE;
import com.kongzue.dialogx.interfaces.AbstractC3738;
import com.kongzue.dialogx.interfaces.RunnableC3742;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.AbstractC5062;
import lin.xposed.hook.javaplugin.bean.GroupInfo;
import lin.xposed.hook.util.qq.CreateElement;
import lin.xposed.hook.util.qq.LegacyQQSendTool;
import lin.xposed.hook.util.qq.QQNTSendMsgUtils;
import lin.xposed.hook.util.qq.QQSessionUtils;
import p009.C6169;
import p009.C6174;
import p010.AbstractC6185;
import p022.AbstractC6306;
import p028.DialogC6319;
import p029.C6320;
import p032.DialogC6330;
import p033.AbstractC6336;
import p033.AbstractC6337;
import p034.AbstractC6347;
import p034.C6348;
import p034.C6350;
import p034.C6352;
import p034.DialogInterfaceOnClickListenerC6339;
import p039.C6388;
import p052.InterfaceC6558;
import p087.C7068;
import p217.AbstractC7969;
import p217.InterfaceC7964;
import p257.C8198;
import p257.C8200;
import p257.C8233;
import p257.C8240;
import p287.AbstractC8405;
import p315.C8663;
import p323.C8707;
import p323.C8708;
import p323.C8714;
import p323.C8728;
import p342.C8817;
import p343.C8819;
import p354.AbstractC8874;
import p354.AbstractC8882;
import p354.C8875;
import p354.C8876;
import p354.C8877;
import p354.C8880;
import p354.C8881;
import p354.C8886;
import p354.C8888;
import p385.C9066;
import p385.C9072;
import p386.C9077;
import p388.C9082;
import top.suzhelan.plugin.sdk.online.entity.Message;
import top.suzhelan.plugin.sdk.online.net.PluginSdkConfig;
import top.suzhelan.plugin.sdk.online.presenter.C5807;
import top.suzhelan.qstory.hook.item.C5925;
import top.suzhelan.qstory.hook.item.mcp.config.C5871;
import top.suzhelan.qstory.hook.item.mcp.config.C5873;
import top.suzhelan.qstory.hook.plugin.entity.NewFriendInfo;
import top.suzhelan.qstory.ui.views.DialogXRecycleView;
import top.suzhelan.sticker.sdk.entity.OnlineStickerInfo;
import top.yukonga.miuix.kmp.utils.C6057;

/* JADX INFO: renamed from: lin.xposed.hook.view.main.itemview.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC5562 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f15331;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f15332;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15333;

    public /* synthetic */ ViewOnClickListenerC5562(File file, DialogC6319 dialogC6319) {
        this.f15333 = 3;
        this.f15332 = file;
        this.f15331 = dialogC6319;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String strConcat;
        GroupInfo groupInfo;
        String str;
        int i = 1;
        int i2 = 0;
        switch (this.f15333) {
            case 0:
                Update.lambda$showUpdateDialog$3((DialogC6319) this.f15331, (View.OnClickListener) this.f15332, view);
                return;
            case 1:
                ((C6169) this.f15331).f16963.invoke((C6174) this.f15332);
                return;
            case 2:
                Dialog dialog = (Dialog) this.f15331;
                Context context = (Context) this.f15332;
                if (AbstractC6306.f17413.equals(AbstractC8405.m13972(565))) {
                    AbstractC6185.m11592(AbstractC8405.m13972(566));
                    return;
                } else {
                    dialog.setContentView(AbstractC6306.m11827(dialog, context, AbstractC6306.f17413));
                    return;
                }
            case 3:
                File file = (File) this.f15332;
                DialogC6319 dialogC6319 = (DialogC6319) this.f15331;
                AbstractC5062.m10052(file);
                dialogC6319.dismiss();
                return;
            case 4:
                DialogC6330 dialogC6330 = (DialogC6330) this.f15331;
                String str2 = (String) this.f15332;
                C0679 c0679 = dialogC6330.f17442;
                if (c0679 != null) {
                    C6388 c6388 = (C6388) c0679.f1895;
                    TextView textView = ((DialogC6330) c0679.f1896).f17444;
                    if (!str2.equals(AbstractC8405.m13973("呜喵喵呜喵呜呜喵~呜呜呜呜喵喵喵喵~呜呜喵喵呜喵喵呜~呜喵喵喵喵喵喵呜~呜呜呜呜喵喵呜喵~呜呜喵喵喵喵喵呜"))) {
                        Calendar calendar = Calendar.getInstance();
                        calendar.add(10, Integer.parseInt(str2.substring(0, str2.indexOf(AbstractC8405.m13973("呜喵喵呜喵呜呜喵~呜呜喵喵喵呜喵呜~呜呜呜呜喵呜喵呜~呜喵喵喵呜呜呜喵~呜呜呜呜喵喵呜喵~呜呜喵呜呜喵呜喵")))));
                        c6388.f17552.m11836(Long.valueOf(calendar.getTimeInMillis()), AbstractC8405.m13972(275));
                        textView.setText(AbstractC8405.m13973("呜喵喵呜喵呜呜喵~呜呜呜呜呜呜喵喵~呜呜喵呜喵喵呜呜~呜喵喵喵呜呜喵喵~呜呜喵呜呜喵喵喵~呜呜呜呜喵呜喵呜~喵呜喵喵喵喵喵呜") + ((calendar.getTimeInMillis() - System.currentTimeMillis()) / 3600000) + AbstractC8405.m13973("呜喵喵呜喵呜喵呜~呜呜呜喵喵喵呜喵~呜呜喵喵呜呜喵喵"));
                        StringBuilder sb = new StringBuilder();
                        sb.append(AbstractC8405.m13973("呜喵喵呜喵呜呜喵~呜呜喵喵喵呜喵呜~呜呜呜呜呜呜喵喵~呜喵喵喵呜呜喵呜~呜呜呜呜呜喵喵呜~呜呜喵喵喵呜喵喵~喵呜喵喵喵喵喵呜"));
                        Date date = new Date(((Long) c6388.f17552.m11839(AbstractC8405.m13972(275))).longValue());
                        String strM13972 = AbstractC8405.m13972(281);
                        try {
                            strConcat = new SimpleDateFormat(strM13972).format(date);
                        } catch (Exception unused) {
                            strConcat = AbstractC8405.m13972(272).concat(strM13972);
                        }
                        sb.append(strConcat);
                        sb.append(AbstractC8405.m13973("喵呜喵呜喵喵呜呜~呜喵喵呜喵喵呜喵~呜呜喵喵喵喵喵呜~呜呜呜呜呜喵呜呜~呜喵喵喵喵喵呜呜~呜呜呜呜喵喵喵呜~呜呜呜呜呜呜呜喵"));
                        AbstractC6185.m11592(sb.toString());
                        break;
                    } else {
                        C6320 c6320 = c6388.f17552;
                        c6320.getClass();
                        c6320.f17431 = new JSONObject();
                        textView.setText(AbstractC8405.m13972(277));
                        AbstractC6185.m11592(AbstractC8405.m13972(280));
                    }
                    c6388.f17552.m11836(str2, AbstractC8405.m13972(276));
                    c6388.f17552.mo11835();
                    return;
                }
                return;
            case 5:
                Context context2 = (Context) this.f15331;
                RadioGroup radioGroup = (RadioGroup) this.f15332;
                EditText editText = new EditText(context2);
                new AlertDialog.Builder(context2, AbstractC6347.m11899(context2) ? 2 : 3).setTitle(AbstractC8405.m13972(360)).setView(editText).setNeutralButton(AbstractC8405.m13972(361), new DialogInterfaceOnClickListenerC6339(editText, radioGroup, context2, i)).show();
                return;
            case 6:
                C6350 c6350 = (C6350) this.f15331;
                String str3 = (String) this.f15332;
                C6350.f17487 = 0;
                c6350.m11935(str3);
                Iterator it = c6350.f17495.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).setBackgroundColor(c6350.getResources().getColor(R.color.bg_plugin, null));
                }
                view.setBackground(c6350.getResources().getDrawable(R.drawable.menu_item_base, null));
                return;
            case 7:
                C6352 c6352 = (C6352) this.f15331;
                C6348 c6348 = (C6348) this.f15332;
                if (c6348.f17485 == 2) {
                    return;
                }
                if (AbstractC3056.m6696()) {
                    Object objCreateEmojiElement = CreateElement.createEmojiElement(c6348.f17486);
                    try {
                        Object objM11859 = AbstractC6336.m11859(AbstractC6337.m11866(AbstractC8405.m13972(178)), AbstractC8405.m13972(282), objCreateEmojiElement);
                        AbstractC6336.m11865(objM11859, AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵喵呜喵呜~喵喵喵喵喵呜喵喵~喵喵喵呜呜呜呜喵~喵喵喵呜呜喵喵喵"), AbstractC8405.m13972(364));
                        AbstractC6336.m11865(objM11859, AbstractC8405.m13972(141), 0);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(objCreateEmojiElement);
                        QQNTSendMsgUtils.sendMsg(QQSessionUtils.getCurrentContact(), arrayList);
                    } catch (Exception e) {
                        C5925.m11313(e);
                        return;
                    }
                } else {
                    Object objBuilderPic = LegacyQQSendTool.MsgBuilder.builderPic(QQSessionUtils.getCurrentSessionInfo(), c6348.f17486);
                    LegacyQQSendTool.setPicText(objBuilderPic, AbstractC8405.m13972(364));
                    LegacyQQSendTool.sendPic(QQSessionUtils.getCurrentSessionInfo(), objBuilderPic);
                }
                c6352.f17499.setClickable(false);
                c6352.f17499.setOnTouchListener(null);
                synchronized (AbstractC6347.class) {
                    C6350 c63502 = AbstractC6347.f17481;
                    if (c63502 != null) {
                        c63502.dismiss();
                    }
                    break;
                }
                return;
            case 8:
                C6388 c63882 = (C6388) this.f15331;
                Activity activity = (Activity) ((ImageView) this.f15332).getContext();
                c63882.f17552 = new C6320(AbstractC8405.m13972(271));
                DialogC6330 dialogC63302 = new DialogC6330(activity, new String[]{AbstractC8405.m13972(273), AbstractC8405.m13972(274), AbstractC8405.m13973("喵呜喵喵呜喵呜呜~呜喵喵呜喵喵喵喵~呜呜喵喵呜喵呜喵~呜呜呜喵喵呜呜呜~呜喵喵喵喵喵呜呜~呜呜呜呜呜喵呜呜~呜呜喵呜喵呜呜呜"), AbstractC8405.m13973("喵呜喵喵喵喵喵呜~呜喵喵呜喵喵喵喵~呜呜喵喵呜喵呜喵~呜呜呜喵喵呜呜呜~呜喵喵喵喵喵呜呜~呜呜呜呜呜喵呜呜~呜呜喵呜喵呜呜呜"), AbstractC8405.m13973("呜喵喵呜喵呜呜喵~呜呜呜呜喵喵喵喵~呜呜喵喵呜喵喵呜~呜喵喵喵喵喵喵呜~呜呜呜呜喵喵呜喵~呜呜喵喵喵喵喵呜")});
                TextView textView2 = dialogC63302.f17444;
                Long l = (Long) c63882.f17552.m11839(AbstractC8405.m13972(275));
                Date date2 = new Date();
                if (l == null || date2.getTime() > l.longValue()) {
                    C6320 c63202 = c63882.f17552;
                    c63202.getClass();
                    c63202.f17431 = new JSONObject();
                    c63882.f17552.m11836(AbstractC8405.m13973("呜喵喵呜喵呜呜喵~呜呜呜呜喵喵喵喵~呜呜喵喵呜喵喵呜~呜喵喵喵喵喵喵呜~呜呜呜呜喵喵呜喵~呜呜喵喵喵喵喵呜"), AbstractC8405.m13972(276));
                    textView2.setText(AbstractC8405.m13972(277));
                } else {
                    long jLongValue = l.longValue() - date2.getTime();
                    long j = jLongValue / 3600000;
                    textView2.setText(AbstractC8405.m13973("呜喵喵呜喵呜呜喵~呜呜呜呜呜呜喵喵~呜呜喵呜喵喵呜呜~呜喵喵喵呜呜喵喵~呜呜喵呜呜喵喵喵~呜呜呜呜喵呜喵呜~喵呜喵喵喵喵喵呜") + j + AbstractC8405.m13973("呜喵喵呜喵呜喵呜~呜呜呜喵喵喵呜喵~呜呜喵喵呜呜喵喵") + ((jLongValue - (3600000 * j)) / 60000) + AbstractC8405.m13973("呜喵喵呜喵呜呜喵~呜呜呜呜呜呜喵呜~呜呜呜呜呜呜喵喵"));
                }
                dialogC63302.f17443 = (String) c63882.f17552.m11839(AbstractC8405.m13972(276));
                dialogC63302.f17442 = new C0679(c63882, 4, dialogC63302);
                dialogC63302.show();
                return;
            case 9:
                AbstractC2484 abstractC2484 = (AbstractC2484) this.f15331;
                AbstractC7969 abstractC7969 = (AbstractC7969) this.f15332;
                int bindingAdapterPosition = abstractC2484.getBindingAdapterPosition();
                if (bindingAdapterPosition == -1) {
                    return;
                }
                view.getClass();
                InterfaceC7964 interfaceC7964 = abstractC7969.f22041;
                if (interfaceC7964 != null) {
                    interfaceC7964.mo1478(abstractC7969, view, bindingAdapterPosition);
                    return;
                }
                return;
            case 10:
                DialogXRecycleView dialogXRecycleView = (DialogXRecycleView) this.f15331;
                ImageView imageView = (ImageView) this.f15332;
                if (dialogXRecycleView.getVisibility() == 8) {
                    dialogXRecycleView.setVisibility(0);
                    imageView.setImageResource(android.R.drawable.arrow_up_float);
                    return;
                } else {
                    dialogXRecycleView.setVisibility(8);
                    imageView.setImageResource(android.R.drawable.arrow_down_float);
                    return;
                }
            case 11:
                ((C8728) this.f15331).f24598.invoke((File) this.f15332);
                return;
            case 12:
                List<C8714> list = (List) this.f15331;
                C8714 c8714 = (C8714) this.f15332;
                for (C8714 c87142 : list) {
                    c87142.f24548.setChecked(c87142 == c8714);
                }
                return;
            case 13:
                C8888 c8888 = (C8888) this.f15331;
                C8233 c8233 = (C8233) this.f15332;
                C5873 c5873 = C5871.f16030;
                ArrayList arrayListM14539 = c8888.m14539();
                c5873.getClass();
                C5873.m11272(arrayListM14539);
                C5873.m11274(c5873);
                AbstractC6185.m11592(AbstractC8405.m13972(2291));
                if (c8233 != null) {
                    c8233.m13755();
                    return;
                }
                return;
            case 14:
                TextView textView3 = (TextView) this.f15331;
                String str4 = (String) this.f15332;
                Object systemService = textView3.getContext().getSystemService(AbstractC8405.m13972(46));
                AbstractC8405.m13972(2292);
                systemService.getClass();
                ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(AbstractC8405.m13972(2293), str4));
                AbstractC6185.m11592(AbstractC8405.m13972(2294));
                return;
            case 15:
                ((C7068) ((C8817) this.f15331).f24820).invoke((File) this.f15332);
                return;
            case 16:
                C8819 c8819 = (C8819) this.f15331;
                OnlineStickerInfo onlineStickerInfo = (OnlineStickerInfo) this.f15332;
                InterfaceC6558 interfaceC6558 = c8819.f24824;
                if (interfaceC6558 != null) {
                    interfaceC6558.invoke(onlineStickerInfo);
                    return;
                }
                return;
            case 17:
                C8663 c8663 = (C8663) this.f15331;
                C8877 c8877 = (C8877) this.f15332;
                int absoluteAdapterPosition = c8663.getAbsoluteAdapterPosition();
                if (absoluteAdapterPosition != -1) {
                    Object obj = c8877.f22042.get(absoluteAdapterPosition);
                    C8876 c8876 = obj instanceof C8876 ? (C8876) obj : null;
                    if (c8876 == null) {
                        return;
                    }
                    NewFriendInfo newFriendInfo = c8876.f25024;
                    String str5 = newFriendInfo.uin;
                    c8877.f25029.put(str5, Boolean.valueOf(!AbstractC4395.m8907(r2.get(str5), Boolean.TRUE)));
                    c8877.m4804(absoluteAdapterPosition);
                    int i3 = newFriendInfo.categoryId;
                    for (Object obj2 : c8877.f22042) {
                        int i4 = i2 + 1;
                        if (i2 < 0) {
                            AbstractC6347.m11920();
                            throw null;
                        }
                        AbstractC8874 abstractC8874 = (AbstractC8874) obj2;
                        if ((abstractC8874 instanceof C8875) && ((C8875) abstractC8874).f25023 == i3) {
                            c8877.m4804(i2);
                        }
                        i2 = i4;
                    }
                    C0755 c0755 = c8877.f25028;
                    if (c0755 != null) {
                        c0755.invoke();
                        return;
                    }
                    return;
                }
                return;
            case 18:
                C8663 c86632 = (C8663) this.f15331;
                C8817 c8817 = (C8817) this.f15332;
                int absoluteAdapterPosition2 = c86632.getAbsoluteAdapterPosition();
                if (absoluteAdapterPosition2 == -1 || (groupInfo = (GroupInfo) c8817.f22042.get(absoluteAdapterPosition2)) == null || (str = groupInfo.GroupUin) == null) {
                    return;
                }
                ((LinkedHashMap) c8817.f24820).put(str, Boolean.valueOf(!AbstractC4395.m8907(r1.get(str), Boolean.TRUE)));
                c8817.m4804(absoluteAdapterPosition2);
                return;
            case 19:
                C8663 c86633 = (C8663) this.f15331;
                C8886 c8886 = (C8886) this.f15332;
                int absoluteAdapterPosition3 = c86633.getAbsoluteAdapterPosition();
                if (absoluteAdapterPosition3 != -1) {
                    Object obj3 = c8886.f22042.get(absoluteAdapterPosition3);
                    C8880 c8880 = obj3 instanceof C8880 ? (C8880) obj3 : null;
                    if (c8880 == null) {
                        return;
                    }
                    GroupInfo groupInfo2 = c8880.f25038;
                    boolean z = c8880.f25037;
                    if (z) {
                        return;
                    }
                    String str6 = groupInfo2.GroupUin;
                    c8886.f25052.put(str6, Boolean.valueOf(!AbstractC4395.m8907(r3.get(str6), Boolean.TRUE)));
                    c8886.m4804(absoluteAdapterPosition3);
                    if (z) {
                        i = 0;
                    } else if (groupInfo2.IsOwnerOrAdmin) {
                        i = 1;
                    }
                    for (Object obj4 : c8886.f22042) {
                        int i5 = i2 + 1;
                        if (i2 < 0) {
                            AbstractC6347.m11920();
                            throw null;
                        }
                        AbstractC8882 abstractC8882 = (AbstractC8882) obj4;
                        if ((abstractC8882 instanceof C8881) && ((C8881) abstractC8882).f25042 == i) {
                            c8886.m4804(i2);
                        }
                        i2 = i5;
                    }
                    C0755 c07552 = c8886.f25051;
                    if (c07552 != null) {
                        c07552.invoke();
                        return;
                    }
                    return;
                }
                return;
            case 20:
                C1251 c1251 = (C1251) this.f15331;
                C8817 c88172 = (C8817) this.f15332;
                EditText editText2 = (EditText) c1251.f3636;
                if (editText2 == null) {
                    AbstractC4395.m8908("inputEdit");
                    throw null;
                }
                Editable text = editText2.getText();
                if (text != null && text.length() != 0) {
                    C8198.m13707("正在发送");
                    C5807 c5807 = (C5807) c1251.f3629;
                    EditText editText3 = (EditText) c1251.f3636;
                    if (editText3 != null) {
                        c5807.m11223(editText3.getText().toString(), (String) c1251.f3630, new C1060(c1251, 14, c88172));
                        return;
                    } else {
                        AbstractC4395.m8908("inputEdit");
                        throw null;
                    }
                }
                C8198 c8198M13709 = C8198.m13709();
                if (c8198M13709 == null) {
                    new C8198();
                    return;
                }
                WaitDialog$TYPE waitDialog$TYPE = WaitDialog$TYPE.WARNING;
                c8198M13709.f22574 = "你还没有输入内容哦";
                if (c8198M13709.f22580 != waitDialog$TYPE) {
                    c8198M13709.f22578 = waitDialog$TYPE.ordinal();
                    c8198M13709.f22580 = waitDialog$TYPE;
                    if (c8198M13709.m13713() != null) {
                        C8200 c8200M13713 = c8198M13709.m13713();
                        c8200M13713.getClass();
                        AbstractC3738.m8030(new RunnableC3742(c8200M13713, 17, waitDialog$TYPE));
                    }
                }
                c8198M13709.m13711();
                if (c8198M13709.m13713() == null) {
                    c8198M13709.m13712();
                    return;
                }
                return;
            case 21:
                ((C6057) ((C8817) this.f15331).f24820).invoke((C9072) this.f15332);
                return;
            case 22:
                ((C9077) ((C8819) this.f15331).f24824).invoke((Message) this.f15332);
                return;
            case 23:
                C9066 c9066 = (C9066) this.f15331;
                C9082 c9082 = (C9082) this.f15332;
                C8198.m13707("下载中...");
                String str7 = PluginSdkConfig.getDOWNLOAD_DIR() + "/" + c9066.getPluginInfo().getName() + ".zip";
                c9082.f25457.m11218(c9066, str7, new C7068(c9082, 11, str7));
                return;
            default:
                C8663 c86634 = (C8663) this.f15331;
                C9066 c90662 = (C9066) this.f15332;
                Context context3 = c86634.itemView.getContext();
                context3.getClass();
                C1251 c12512 = new C1251(context3, c90662.getPluginInfo().getName(), c90662.getPluginId());
                int i6 = (int) (((double) context3.getResources().getDisplayMetrics().heightPixels) * 0.8d);
                C8240 c8240 = (C8240) c12512.f3628;
                c8240.f11590 = i6;
                c8240.m13763();
                c8240.f22772 = false;
                c8240.f22764 = new C8707(c12512);
                c8240.m13763();
                c8240.m13761(new C8708(c12512, i));
                c8240.m13760();
                return;
        }
    }

    public /* synthetic */ ViewOnClickListenerC5562(Object obj, int i, Object obj2) {
        this.f15333 = i;
        this.f15331 = obj;
        this.f15332 = obj2;
    }
}
