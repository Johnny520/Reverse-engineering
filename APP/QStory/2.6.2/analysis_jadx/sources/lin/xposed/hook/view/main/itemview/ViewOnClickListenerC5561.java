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
import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.compose.foundation.lazy.C0755;
import androidx.compose.foundation.lazy.layout.C0679;
import androidx.compose.runtime.internal.C1251;
import androidx.recyclerview.widget.AbstractC2484;
import com.alibaba.fastjson2.JSONObject;
import com.bumptech.glide.AbstractC3056;
import com.davemorrissey.labs.subscaleview.R;
import com.kongzue.dialogx.dialogs.WaitDialog$TYPE;
import com.kongzue.dialogx.interfaces.AbstractC3737;
import com.kongzue.dialogx.interfaces.RunnableC3741;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC4394;
import lin.xposed.hook.javaplugin.bean.GroupInfo;
import lin.xposed.hook.util.qq.CreateElement;
import lin.xposed.hook.util.qq.LegacyQQSendTool;
import lin.xposed.hook.util.qq.QQNTSendMsgUtils;
import lin.xposed.hook.util.qq.QQSessionUtils;
import p007.C6135;
import p007.C6143;
import p010.AbstractC6154;
import p027.DialogC6300;
import p028.C6301;
import p031.DialogC6311;
import p032.AbstractC6317;
import p032.AbstractC6318;
import p033.AbstractC6333;
import p033.C6327;
import p033.C6329;
import p033.C6331;
import p033.DialogInterfaceOnClickListenerC6320;
import p038.C6418;
import p040.AbstractC6431;
import p052.InterfaceC6557;
import p053.AbstractC6560;
import p087.C7067;
import p217.AbstractC7968;
import p217.InterfaceC7963;
import p253.AbstractC8189;
import p257.C8197;
import p257.C8199;
import p257.C8232;
import p257.C8239;
import p315.C8671;
import p319.C8684;
import p319.C8685;
import p319.C8690;
import p319.C8705;
import p341.C8816;
import p343.C8831;
import p356.AbstractC8895;
import p356.AbstractC8903;
import p356.C8896;
import p356.C8897;
import p356.C8898;
import p356.C8901;
import p356.C8902;
import p356.C8907;
import p356.C8909;
import p385.C9090;
import p386.C9094;
import p388.C9099;
import p388.C9105;
import top.suzhelan.plugin.sdk.online.entity.Message;
import top.suzhelan.plugin.sdk.online.net.PluginSdkConfig;
import top.suzhelan.plugin.sdk.online.presenter.C5806;
import top.suzhelan.qstory.hook.item.C5919;
import top.suzhelan.qstory.hook.item.mcp.config.C5866;
import top.suzhelan.qstory.hook.item.mcp.config.C5868;
import top.suzhelan.qstory.hook.plugin.entity.NewFriendInfo;
import top.suzhelan.qstory.ui.views.DialogXRecycleView;
import top.suzhelan.sticker.sdk.entity.OnlineStickerInfo;
import top.yukonga.miuix.kmp.utils.C6051;

/* JADX INFO: renamed from: lin.xposed.hook.view.main.itemview.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC5561 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f15331;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f15332;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15333;

    public /* synthetic */ ViewOnClickListenerC5561(File file, DialogC6300 dialogC6300) {
        this.f15333 = 8;
        this.f15332 = file;
        this.f15331 = dialogC6300;
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
                Update.lambda$showUpdateDialog$3((DialogC6300) this.f15331, (View.OnClickListener) this.f15332, view);
                return;
            case 1:
                ((C6135) this.f15331).f16724.invoke((C6143) this.f15332);
                return;
            case 2:
                DialogC6311 dialogC6311 = (DialogC6311) this.f15331;
                String str2 = (String) this.f15332;
                C0679 c0679 = dialogC6311.f17393;
                if (c0679 != null) {
                    C6418 c6418 = (C6418) c0679.f1894;
                    TextView textView = ((DialogC6311) c0679.f1895).f17395;
                    if (!str2.equals(AbstractC3056.m6668(-3937581662930732455L))) {
                        Calendar calendar = Calendar.getInstance();
                        calendar.add(10, Integer.parseInt(str2.substring(0, str2.indexOf(AbstractC3056.m6668(-3937581319333348775L)))));
                        c6418.f17581.m11808(Long.valueOf(calendar.getTimeInMillis()), AbstractC3056.m6668(-3937581572736419239L));
                        textView.setText(AbstractC3056.m6668(-3937581529786746279L) + ((calendar.getTimeInMillis() - System.currentTimeMillis()) / 3600000) + AbstractC3056.m6668(-3937581443887400359L));
                        StringBuilder sb = new StringBuilder();
                        sb.append(AbstractC3056.m6668(-3937581229139035559L));
                        Date date = new Date(((Long) c6418.f17581.m11811(AbstractC3056.m6668(-3937581572736419239L))).longValue());
                        String strM6668 = AbstractC3056.m6668(-3937581211959166375L);
                        try {
                            strConcat = new SimpleDateFormat(strM6668).format(date);
                        } catch (Exception unused) {
                            strConcat = AbstractC3056.m6668(-3937581718765307303L).concat(strM6668);
                        }
                        sb.append(strConcat);
                        sb.append(AbstractC3056.m6668(-3937581160419558823L));
                        AbstractC6154.m11561(sb.toString());
                        break;
                    } else {
                        C6301 c6301 = c6418.f17581;
                        c6301.getClass();
                        c6301.f17382 = new JSONObject();
                        textView.setText(AbstractC3056.m6668(-3937581486837073319L));
                        AbstractC6154.m11561(AbstractC3056.m6668(-3937581289268577703L));
                    }
                    c6418.f17581.m11808(str2, AbstractC3056.m6668(-3937581619981059495L));
                    c6418.f17581.mo11807();
                    return;
                }
                return;
            case 3:
                Context context = (Context) this.f15331;
                RadioGroup radioGroup = (RadioGroup) this.f15332;
                EditText editText = new EditText(context);
                new AlertDialog.Builder(context, AbstractC6333.m11886(context) ? 2 : 3).setTitle(AbstractC3056.m6668(-3937589956512581031L)).setView(editText).setNeutralButton(AbstractC3056.m6668(-3937589947922646439L), new DialogInterfaceOnClickListenerC6320(editText, radioGroup, context, i)).show();
                return;
            case 4:
                C6327 c6327 = (C6327) this.f15331;
                String str3 = (String) this.f15332;
                C6327.f17431 = 0;
                c6327.m11882(str3);
                Iterator it = c6327.f17439.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).setBackgroundColor(c6327.getResources().getColor(R.color.bg_plugin, null));
                }
                view.setBackground(c6327.getResources().getDrawable(R.drawable.menu_item_base, null));
                return;
            case 5:
                C6331 c6331 = (C6331) this.f15331;
                C6329 c6329 = (C6329) this.f15332;
                if (c6329.f17443 == 2) {
                    return;
                }
                if (AbstractC6560.m12011()) {
                    Object objCreateEmojiElement = CreateElement.createEmojiElement(c6329.f17444);
                    try {
                        Object objM11831 = AbstractC6317.m11831(AbstractC6318.m11838(AbstractC3056.m6668(-3937575778825536935L)), AbstractC3056.m6668(-3937581143239689639L), objCreateEmojiElement);
                        AbstractC6317.m11837(objM11831, AbstractC3056.m6668(-3937579751670285735L), AbstractC3056.m6668(-3937589935037744551L));
                        AbstractC6317.m11837(objM11831, AbstractC3056.m6668(-3937579592756495783L), 0);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(objCreateEmojiElement);
                        QQNTSendMsgUtils.sendMsg(QQSessionUtils.getCurrentContact(), arrayList);
                    } catch (Exception e) {
                        C5919.m11252(e);
                        return;
                    }
                } else {
                    Object objBuilderPic = LegacyQQSendTool.MsgBuilder.builderPic(QQSessionUtils.getCurrentSessionInfo(), c6329.f17444);
                    LegacyQQSendTool.setPicText(objBuilderPic, AbstractC3056.m6668(-3937589935037744551L));
                    LegacyQQSendTool.sendPic(QQSessionUtils.getCurrentSessionInfo(), objBuilderPic);
                }
                c6331.f17446.setClickable(false);
                c6331.f17446.setOnTouchListener(null);
                String str4 = AbstractC6333.f17448;
                synchronized (AbstractC6333.class) {
                    C6327 c63272 = AbstractC6333.f17447;
                    if (c63272 != null) {
                        c63272.dismiss();
                    }
                    break;
                }
                return;
            case 6:
                C6418 c64182 = (C6418) this.f15331;
                Activity activity = (Activity) ((ImageView) this.f15332).getContext();
                c64182.f17581 = new C6301(AbstractC3056.m6668(-3937581783189816743L));
                DialogC6311 dialogC63112 = new DialogC6311(activity, new String[]{AbstractC3056.m6668(-3937581757420012967L), AbstractC3056.m6668(-3937581641455895975L), AbstractC3056.m6668(-3937581628570994087L), AbstractC3056.m6668(-3937581680110601639L), AbstractC3056.m6668(-3937581662930732455L)});
                TextView textView2 = dialogC63112.f17395;
                Long l = (Long) c64182.f17581.m11811(AbstractC3056.m6668(-3937581572736419239L));
                Date date2 = new Date();
                if (l == null || date2.getTime() > l.longValue()) {
                    C6301 c63012 = c64182.f17581;
                    c63012.getClass();
                    c63012.f17382 = new JSONObject();
                    c64182.f17581.m11808(AbstractC3056.m6668(-3937581662930732455L), AbstractC3056.m6668(-3937581619981059495L));
                    textView2.setText(AbstractC3056.m6668(-3937581486837073319L));
                } else {
                    long jLongValue = l.longValue() - date2.getTime();
                    long j = jLongValue / 3600000;
                    textView2.setText(AbstractC3056.m6668(-3937581529786746279L) + j + AbstractC3056.m6668(-3937581443887400359L) + ((jLongValue - (3600000 * j)) / 60000) + AbstractC3056.m6668(-3937581418117596583L));
                }
                dialogC63112.f17394 = (String) c64182.f17581.m11811(AbstractC3056.m6668(-3937581619981059495L));
                dialogC63112.f17393 = new C0679(c64182, 5, dialogC63112);
                dialogC63112.show();
                return;
            case 7:
                Dialog dialog = (Dialog) this.f15331;
                Context context2 = (Context) this.f15332;
                if (AbstractC6431.f17619.equals(AbstractC3056.m6668(-3937621107910378919L))) {
                    AbstractC6154.m11561(AbstractC3056.m6668(-3937621047780836775L));
                    return;
                } else {
                    dialog.setContentView(AbstractC6431.m11934(dialog, context2, AbstractC6431.f17619));
                    return;
                }
            case 8:
                File file = (File) this.f15332;
                DialogC6300 dialogC6300 = (DialogC6300) this.f15331;
                AbstractC0455.m1161(file);
                dialogC6300.dismiss();
                return;
            case 9:
                AbstractC2484 abstractC2484 = (AbstractC2484) this.f15331;
                AbstractC7968 abstractC7968 = (AbstractC7968) this.f15332;
                int bindingAdapterPosition = abstractC2484.getBindingAdapterPosition();
                if (bindingAdapterPosition == -1) {
                    return;
                }
                view.getClass();
                InterfaceC7963 interfaceC7963 = abstractC7968.f22044;
                if (interfaceC7963 != null) {
                    interfaceC7963.mo1468(abstractC7968, view, bindingAdapterPosition);
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
                ((C8705) this.f15331).f24548.invoke((File) this.f15332);
                return;
            case 12:
                List<C8690> list = (List) this.f15331;
                C8690 c8690 = (C8690) this.f15332;
                for (C8690 c86902 : list) {
                    c86902.f24499.setChecked(c86902 == c8690);
                }
                return;
            case 13:
                C8909 c8909 = (C8909) this.f15331;
                C8232 c8232 = (C8232) this.f15332;
                C5868 c5868 = C5866.f16023;
                ArrayList arrayListM14529 = c8909.m14529();
                c5868.getClass();
                C5868.m11210(arrayListM14529);
                C5868.m11212(c5868);
                AbstractC6154.m11561(AbstractC3056.m6668(-3937791867220133287L));
                if (c8232 != null) {
                    c8232.m13739();
                    return;
                }
                return;
            case 14:
                TextView textView3 = (TextView) this.f15331;
                String str5 = (String) this.f15332;
                Object systemService = textView3.getContext().getSystemService(AbstractC3056.m6668(-3937556494422377895L));
                AbstractC3056.m6668(-3937791875810067879L);
                systemService.getClass();
                ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(AbstractC3056.m6668(-3937791523622749607L), str5));
                AbstractC6154.m11561(AbstractC3056.m6668(-3937791429133469095L));
                return;
            case 15:
                C8816 c8816 = (C8816) this.f15331;
                OnlineStickerInfo onlineStickerInfo = (OnlineStickerInfo) this.f15332;
                InterfaceC6557 interfaceC6557 = c8816.f24802;
                if (interfaceC6557 != null) {
                    interfaceC6557.invoke(onlineStickerInfo);
                    return;
                }
                return;
            case 16:
                ((C7067) ((C8831) this.f15331).f24839).invoke((File) this.f15332);
                return;
            case 17:
                C8671 c8671 = (C8671) this.f15331;
                C8898 c8898 = (C8898) this.f15332;
                int absoluteAdapterPosition = c8671.getAbsoluteAdapterPosition();
                if (absoluteAdapterPosition != -1) {
                    Object obj = c8898.f22045.get(absoluteAdapterPosition);
                    C8897 c8897 = obj instanceof C8897 ? (C8897) obj : null;
                    if (c8897 == null) {
                        return;
                    }
                    NewFriendInfo newFriendInfo = c8897.f25063;
                    String str6 = newFriendInfo.uin;
                    LinkedHashMap linkedHashMap = c8898.f25068;
                    linkedHashMap.put(str6, Boolean.valueOf(true ^ AbstractC4394.m8917(linkedHashMap.get(str6), Boolean.TRUE)));
                    c8898.m4794(absoluteAdapterPosition);
                    int i3 = newFriendInfo.categoryId;
                    for (Object obj2 : c8898.f22045) {
                        int i4 = i2 + 1;
                        if (i2 < 0) {
                            AbstractC8189.m13662();
                            throw null;
                        }
                        AbstractC8895 abstractC8895 = (AbstractC8895) obj2;
                        if ((abstractC8895 instanceof C8896) && ((C8896) abstractC8895).f25062 == i3) {
                            c8898.m4794(i2);
                        }
                        i2 = i4;
                    }
                    C0755 c0755 = c8898.f25067;
                    if (c0755 != null) {
                        c0755.invoke();
                        return;
                    }
                    return;
                }
                return;
            case 18:
                C8671 c86712 = (C8671) this.f15331;
                C8831 c8831 = (C8831) this.f15332;
                int absoluteAdapterPosition2 = c86712.getAbsoluteAdapterPosition();
                if (absoluteAdapterPosition2 == -1 || (groupInfo = (GroupInfo) c8831.f22045.get(absoluteAdapterPosition2)) == null || (str = groupInfo.GroupUin) == null) {
                    return;
                }
                ((LinkedHashMap) c8831.f24839).put(str, Boolean.valueOf(!AbstractC4394.m8917(r3.get(str), Boolean.TRUE)));
                c8831.m4794(absoluteAdapterPosition2);
                return;
            case 19:
                C8671 c86713 = (C8671) this.f15331;
                C8907 c8907 = (C8907) this.f15332;
                int absoluteAdapterPosition3 = c86713.getAbsoluteAdapterPosition();
                if (absoluteAdapterPosition3 != -1) {
                    Object obj3 = c8907.f22045.get(absoluteAdapterPosition3);
                    C8901 c8901 = obj3 instanceof C8901 ? (C8901) obj3 : null;
                    if (c8901 == null) {
                        return;
                    }
                    GroupInfo groupInfo2 = c8901.f25077;
                    boolean z = c8901.f25076;
                    if (z) {
                        return;
                    }
                    String str7 = groupInfo2.GroupUin;
                    c8907.f25091.put(str7, Boolean.valueOf(!AbstractC4394.m8917(r9.get(str7), Boolean.TRUE)));
                    c8907.m4794(absoluteAdapterPosition3);
                    if (z) {
                        i = 0;
                    } else if (groupInfo2.IsOwnerOrAdmin) {
                        i = 1;
                    }
                    for (Object obj4 : c8907.f22045) {
                        int i5 = i2 + 1;
                        if (i2 < 0) {
                            AbstractC8189.m13662();
                            throw null;
                        }
                        AbstractC8903 abstractC8903 = (AbstractC8903) obj4;
                        if ((abstractC8903 instanceof C8902) && ((C8902) abstractC8903).f25081 == i) {
                            c8907.m4794(i2);
                        }
                        i2 = i5;
                    }
                    C0755 c07552 = c8907.f25090;
                    if (c07552 != null) {
                        c07552.invoke();
                        return;
                    }
                    return;
                }
                return;
            case 20:
                C1251 c1251 = (C1251) this.f15331;
                C8831 c88312 = (C8831) this.f15332;
                EditText editText2 = (EditText) c1251.f3635;
                if (editText2 == null) {
                    AbstractC4394.m8918("inputEdit");
                    throw null;
                }
                Editable text = editText2.getText();
                if (text != null && text.length() != 0) {
                    C8197.m13690("正在发送");
                    C5806 c5806 = (C5806) c1251.f3628;
                    EditText editText3 = (EditText) c1251.f3635;
                    if (editText3 != null) {
                        c5806.m11166(editText3.getText().toString(), (String) c1251.f3629, new C1060(c1251, 14, c88312));
                        return;
                    } else {
                        AbstractC4394.m8918("inputEdit");
                        throw null;
                    }
                }
                C8197 c8197M13692 = C8197.m13692();
                if (c8197M13692 == null) {
                    new C8197();
                    return;
                }
                WaitDialog$TYPE waitDialog$TYPE = WaitDialog$TYPE.WARNING;
                c8197M13692.f22575 = "你还没有输入内容哦";
                if (c8197M13692.f22581 != waitDialog$TYPE) {
                    c8197M13692.f22579 = waitDialog$TYPE.ordinal();
                    c8197M13692.f22581 = waitDialog$TYPE;
                    if (c8197M13692.m13696() != null) {
                        C8199 c8199M13696 = c8197M13692.m13696();
                        c8199M13696.getClass();
                        AbstractC3737.m8043(new RunnableC3741(c8199M13696, 17, waitDialog$TYPE));
                    }
                }
                c8197M13692.m13694();
                if (c8197M13692.m13696() == null) {
                    c8197M13692.m13695();
                    return;
                }
                return;
            case 21:
                ((C6051) ((C8831) this.f15331).f24839).invoke((C9105) this.f15332);
                return;
            case 22:
                ((C9090) ((C8816) this.f15331).f24802).invoke((Message) this.f15332);
                return;
            case 23:
                C9099 c9099 = (C9099) this.f15331;
                C9094 c9094 = (C9094) this.f15332;
                C8197.m13690("下载中...");
                String str8 = PluginSdkConfig.getDOWNLOAD_DIR() + "/" + c9099.getPluginInfo().getName() + ".zip";
                c9094.f25406.m11161(c9099, str8, new C7067(c9094, 11, str8));
                return;
            default:
                C8671 c86714 = (C8671) this.f15331;
                C9099 c90992 = (C9099) this.f15332;
                Context context3 = c86714.itemView.getContext();
                context3.getClass();
                C1251 c12512 = new C1251(context3, c90992.getPluginInfo().getName(), c90992.getPluginId());
                int i6 = (int) (((double) context3.getResources().getDisplayMetrics().heightPixels) * 0.8d);
                C8239 c8239 = (C8239) c12512.f3627;
                c8239.f11585 = i6;
                c8239.m13746();
                c8239.f22773 = false;
                c8239.f22765 = new C8684(c12512);
                c8239.m13746();
                C8685 c8685 = new C8685(c12512, i);
                c8239.f22768 = c8685;
                if (c8239.f11579) {
                    c8685.mo8079(c8239.f22767);
                }
                c8239.m13744();
                return;
        }
    }

    public /* synthetic */ ViewOnClickListenerC5561(Object obj, int i, Object obj2) {
        this.f15333 = i;
        this.f15331 = obj;
        this.f15332 = obj2;
    }
}
