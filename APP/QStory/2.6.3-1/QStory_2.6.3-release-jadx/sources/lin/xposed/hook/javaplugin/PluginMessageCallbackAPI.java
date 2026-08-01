package lin.xposed.hook.javaplugin;

import android.os.Environment;
import android.text.TextUtils;
import androidx.activity.AbstractC0900;
import com.bumptech.glide.AbstractC3888;
import de.robv.android.xposed.XposedHelpers;
import java.io.File;
import java.util.ArrayList;
import lin.xposed.hook.javaplugin.bean.MessageData;
import lin.xposed.hook.javaplugin.util.PluginMessageTool;
import lin.xposed.hook.util.p011qq.Hook_cookie;
import lin.xposed.hook.util.p011qq.QQEmotionUtils;
import lin.xposed.hook.util.p011qq.QQEnvTool;
import lin.xposed.hook.util.p011qq.QQMessageUtils;
import p026.AbstractC7017;
import p042.AbstractC7145;
import p049.AbstractC7162;
import p049.AbstractC7165;
import p303.AbstractC9234;
import p355.C9637;
import top.suzhelan.qstory.hook.api.C6647;
import top.suzhelan.qstory.hook.api.InterfaceC6645;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class PluginMessageCallbackAPI extends AbstractC7145 {
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadHook$0(Object obj) {
        MessageData message;
        PluginCallback.onCallbackOnRawMsg(obj);
        if (isGrayMessage(obj) || (message = parseMessage(obj)) == null) {
            return;
        }
        PluginCallback.onMessage(message);
    }

    private void parseMessageContent(MessageData messageData, Object obj) {
        ArrayList arrayList = (ArrayList) AbstractC7165.m12418(ArrayList.class, AbstractC9234.m14531(152), obj);
        String strM14531 = AbstractC9234.m14531(483);
        Class cls = Long.TYPE;
        long jLongValue = ((Long) AbstractC7165.m12418(cls, strM14531, obj)).longValue();
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList arrayList3 = new ArrayList();
        boolean z = false;
        boolean z2 = false;
        for (Object obj2 : arrayList) {
            String strM145312 = AbstractC9234.m14531(338);
            Class cls2 = Integer.TYPE;
            Integer num = (Integer) AbstractC7165.m12418(cls2, strM145312, obj2);
            messageData.MessageType = num.intValue();
            if (num.intValue() == 1) {
                Object objM12403 = AbstractC7162.m12403(obj2, AbstractC9234.m14531(247));
                messageData.MessageContent = AbstractC0900.m711(new StringBuilder(), messageData.MessageContent, (String) AbstractC7162.m12403(objM12403, AbstractC9234.m14531(339)));
                if (((Integer) AbstractC7165.m12418(cls2, AbstractC9234.m14532("喵喵喵呜喵喵呜喵~喵喵喵喵喵喵喵呜~喵喵呜喵呜呜呜喵~喵喵喵呜喵喵喵呜~喵喵喵呜喵呜喵呜~喵喵喵喵呜喵喵呜"), objM12403)).intValue() == 2) {
                    arrayList2.add(QQEnvTool.getUinFromUid((String) AbstractC7165.m12418(String.class, AbstractC9234.m14532("喵喵喵呜喵喵呜喵~喵喵喵喵喵喵喵呜~喵喵呜呜喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵呜呜喵喵喵喵~喵喵喵喵喵呜喵呜~喵喵喵喵喵呜喵呜"), objM12403)));
                }
                messageData.MessageType = 1;
                z = true;
            } else if (num.intValue() == 2) {
                Object objM124032 = AbstractC7162.m12403(obj2, AbstractC9234.m14531(140));
                String str = (String) AbstractC7165.m12418(String.class, AbstractC9234.m14531(587), objM124032);
                String str2 = Environment.getExternalStorageDirectory() + AbstractC9234.m14531(588) + str;
                if (!new File(str2).exists()) {
                    str2 = Environment.getExternalStorageDirectory() + AbstractC9234.m14531(589) + str;
                }
                String upperCase = ((String) AbstractC7165.m12418(String.class, AbstractC9234.m14531(179), objM124032)).toUpperCase();
                String picElementUrl = QQMessageUtils.getPicElementUrl(messageData.IsGroup ? 2 : 1, objM124032);
                messageData.PicUrlList.add(picElementUrl);
                messageData.MessageContent += AbstractC9234.m14531(590) + picElementUrl + AbstractC9234.m14532("喵喵呜喵呜呜呜喵");
                messageData.LocalPath = str2;
                messageData.FileName = str;
                arrayList3.add(upperCase);
                messageData.MessageType = 1;
                z2 = true;
            } else if (num.intValue() == 3) {
                Object objCallMethod = XposedHelpers.callMethod(obj2, AbstractC9234.m14531(591), new Object[0]);
                String str3 = (String) AbstractC7165.m12418(String.class, AbstractC9234.m14531(587), objCallMethod);
                long jLongValue2 = ((Long) AbstractC7165.m12418(cls, AbstractC9234.m14531(592), objCallMethod)).longValue();
                messageData.LocalPath = (String) AbstractC7165.m12418(String.class, AbstractC9234.m14531(593), objCallMethod);
                messageData.FileName = str3;
                messageData.FileSize = jLongValue2;
                messageData.MessageType = 7;
            } else if (num.intValue() == 6) {
                messageData.MessageContent += QQEmotionUtils.smallFaceElementToStrCode(XposedHelpers.callMethod(obj2, AbstractC9234.m14531(594), new Object[0]));
                messageData.MessageType = 1;
            } else if (num.intValue() == 5) {
                Object objCallMethod2 = XposedHelpers.callMethod(obj2, AbstractC9234.m14531(595), new Object[0]);
                String videoUrl = PluginMessageTool.getVideoUrl(String.valueOf(jLongValue), objCallMethod2);
                long jLongValue3 = ((Long) AbstractC7165.m12418(cls, AbstractC9234.m14531(592), objCallMethod2)).longValue();
                String str4 = (String) AbstractC7165.m12418(String.class, AbstractC9234.m14531(587), objCallMethod2);
                messageData.MessageContent = videoUrl;
                messageData.FileUrl = videoUrl;
                messageData.FileName = str4;
                messageData.FileSize = jLongValue3;
                messageData.MessageType = 5;
            } else if (num.intValue() == 10) {
                messageData.MessageContent = (String) AbstractC7165.m12418(String.class, AbstractC9234.m14531(154), XposedHelpers.callMethod(obj2, AbstractC9234.m14531(153), new Object[0]));
                messageData.MessageType = 2;
            } else if (num.intValue() == 4) {
                Object objCallMethod3 = XposedHelpers.callMethod(obj2, AbstractC9234.m14531(596), new Object[0]);
                String str5 = (String) AbstractC7165.m12418(String.class, AbstractC9234.m14531(587), objCallMethod3);
                long jLongValue4 = ((Long) AbstractC7165.m12418(cls, AbstractC9234.m14531(592), objCallMethod3)).longValue();
                String audioUrl = PluginMessageTool.getAudioUrl(String.valueOf(jLongValue), objCallMethod3);
                messageData.LocalPath = Environment.getExternalStorageDirectory() + AbstractC9234.m14531(597) + Hook_cookie.getMyuin() + AbstractC9234.m14532("喵呜喵呜呜呜喵喵~喵喵喵喵喵呜喵呜~喵喵喵喵呜呜呜喵~喵喵喵呜呜呜喵喵~喵呜喵喵呜喵呜喵") + str5;
                messageData.MessageContent = audioUrl;
                messageData.FileName = str5;
                messageData.FileUrl = audioUrl;
                messageData.FileSize = jLongValue4;
                messageData.MessageType = 4;
            }
        }
        if (z && z2) {
            messageData.MessageType = 3;
        }
        messageData.PicList = (String[]) arrayList3.toArray(new String[0]);
        messageData.mAtList = arrayList2;
        messageData.AtList = (String[]) arrayList2.toArray(new String[0]);
    }

    private void parseReplyMessage(MessageData messageData, Object obj) {
        ArrayList arrayList = (ArrayList) AbstractC7165.m12418(ArrayList.class, AbstractC9234.m14532("喵喵喵喵喵喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵呜呜喵喵呜~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜呜呜~喵喵喵喵呜喵喵喵~喵喵喵呜喵喵呜喵"), obj);
        if (arrayList == null || arrayList.isEmpty()) {
            messageData.ReplyTo = "";
            return;
        }
        Object obj2 = arrayList.get(0);
        messageData.ReplyTo = String.valueOf(((Long) AbstractC7165.m12418(Long.TYPE, AbstractC9234.m14531(483), obj2)).longValue());
        messageData.RecordMsg = parseMessage(obj2);
        messageData.MessageType = 6;
    }

    public boolean isGrayMessage(Object obj) {
        try {
            for (Object obj2 : (ArrayList) AbstractC7165.m12418(ArrayList.class, AbstractC9234.m14531(152), obj)) {
                if (((Integer) AbstractC7165.m12418(Integer.TYPE, AbstractC9234.m14531(338), obj2)).intValue() == 8) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // p042.AbstractC7143
    public void loadHook(ClassLoader classLoader) {
        if (AbstractC3888.m7256()) {
            C6647.addAPIMessageListener(new InterfaceC6645() { // from class: lin.xposed.hook.javaplugin.飘花落叶言子楪世兰苏哲
                @Override // top.suzhelan.qstory.hook.api.InterfaceC6645
                /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
                public final void mo11423(Object obj) {
                    this.f15658.lambda$loadHook$0(obj);
                }
            });
        }
    }

    public MessageData parseMessage(Object obj) {
        try {
            MessageData messageData = new MessageData();
            messageData.PicUrlList = new ArrayList<>();
            String strM14531 = AbstractC9234.m14531(483);
            Class cls = Long.TYPE;
            long jLongValue = ((Long) AbstractC7165.m12418(cls, strM14531, obj)).longValue();
            long jLongValue2 = ((Long) AbstractC7165.m12418(cls, AbstractC9234.m14532("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜呜呜呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵呜~喵喵喵喵喵呜喵喵"), obj)).longValue();
            String str = (String) AbstractC7165.m12418(String.class, AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵呜呜喵喵喵喵~喵喵喵喵喵呜喵呜~喵喵喵喵喵呜喵呜"), obj);
            int iIntValue = ((Integer) AbstractC7165.m12418(Integer.TYPE, AbstractC9234.m14531(125), obj)).intValue();
            messageData.UserUin = String.valueOf(jLongValue);
            messageData.MessageTime = jLongValue2 * 1000;
            messageData.msg = obj;
            messageData.IsSend = String.valueOf(jLongValue).equals(QQEnvTool.getCurrentUin());
            messageData.MessageContent = "";
            if (iIntValue == 1 || iIntValue == 100) {
                messageData.GroupUin = "";
                messageData.PeerUin = String.valueOf(((Long) AbstractC7165.m12418(cls, AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵呜呜喵喵喵喵~喵喵喵喵喵呜喵呜~喵喵喵喵呜呜呜呜"), obj)).longValue());
                messageData.IsGroup = false;
                messageData.SenderNickName = C9637.m15038(String.valueOf(str));
            } else {
                messageData.PeerUin = String.valueOf(((Long) AbstractC7165.m12418(cls, AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵呜呜喵喵喵喵~喵喵喵喵喵呜喵呜~喵喵喵喵呜呜呜呜"), obj)).longValue());
                messageData.GroupUin = str;
                messageData.IsGroup = true;
                messageData.GroupName = (String) AbstractC7165.m12418(String.class, AbstractC9234.m14531(584), obj);
                String str2 = (String) AbstractC7165.m12418(String.class, AbstractC9234.m14531(585), obj);
                if (TextUtils.isEmpty(str2)) {
                    str2 = (String) AbstractC7165.m12418(String.class, AbstractC9234.m14531(586), obj);
                }
                messageData.SenderNickName = str2;
            }
            parseMessageContent(messageData, obj);
            parseReplyMessage(messageData, obj);
            return messageData;
        } catch (Exception e) {
            AbstractC7017.m12165(e);
            return null;
        }
    }
}
