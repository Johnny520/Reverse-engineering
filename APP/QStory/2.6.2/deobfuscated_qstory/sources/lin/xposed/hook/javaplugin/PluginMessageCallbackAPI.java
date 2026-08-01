package lin.xposed.hook.javaplugin;

import android.os.Environment;
import android.text.TextUtils;
import androidx.activity.AbstractC0053;
import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedHelpers;
import java.io.File;
import java.util.ArrayList;
import lin.xposed.hook.javaplugin.bean.MessageData;
import lin.xposed.hook.javaplugin.util.PluginMessageTool;
import lin.xposed.hook.util.qq.Hook_cookie;
import lin.xposed.hook.util.qq.QQEmotionUtils;
import lin.xposed.hook.util.qq.QQEnvTool;
import lin.xposed.hook.util.qq.QQMessageUtils;
import p010.AbstractC6157;
import p026.AbstractC6298;
import p032.AbstractC6314;
import p032.AbstractC6317;
import p053.AbstractC6560;
import p338.C8810;
import top.suzhelan.qstory.hook.api.C5816;
import top.suzhelan.qstory.hook.api.InterfaceC5814;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class PluginMessageCallbackAPI extends AbstractC6298 {
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
        ArrayList arrayList = (ArrayList) AbstractC6317.m11831(ArrayList.class, "elements", obj);
        String strM6668 = "senderUin";
        Class cls = Long.TYPE;
        long jLongValue = ((Long) AbstractC6317.m11831(cls, strM6668, obj)).longValue();
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList arrayList3 = new ArrayList();
        boolean z = false;
        boolean z2 = false;
        for (Object obj2 : arrayList) {
            String strM66682 = "elementType";
            Class cls2 = Integer.TYPE;
            Integer num = (Integer) AbstractC6317.m11831(cls2, strM66682, obj2);
            messageData.MessageType = num.intValue();
            if (num.intValue() == 1) {
                Object objM11816 = AbstractC6314.m11816(obj2, "getTextElement");
                messageData.MessageContent = AbstractC0053.m146(new StringBuilder(), messageData.MessageContent, (String) AbstractC6314.m11816(objM11816, "getContent"));
                if (((Integer) AbstractC6317.m11831(cls2, "atType", objM11816)).intValue() == 2) {
                    arrayList2.add(QQEnvTool.getUinFromUid((String) AbstractC6317.m11831(String.class, "atNtUid", objM11816)));
                }
                messageData.MessageType = 1;
                z = true;
            } else if (num.intValue() == 2) {
                Object objM118162 = AbstractC6314.m11816(obj2, "getPicElement");
                String str = (String) AbstractC6317.m11831(String.class, "fileName", objM118162);
                String str2 = Environment.getExternalStorageDirectory() + "/Android/data/com.tencent.mobileqq/Tencent/MobileQQ/photo/" + str;
                if (!new File(str2).exists()) {
                    str2 = Environment.getExternalStorageDirectory() + "/Android/data/com.tencent.mobileqq/Tencent/QQ_Images/QQEditPic/" + str;
                }
                String upperCase = ((String) AbstractC6317.m11831(String.class, "md5HexStr", objM118162)).toUpperCase();
                String picElementUrl = QQMessageUtils.getPicElementUrl(messageData.IsGroup ? 2 : 1, objM118162);
                messageData.PicUrlList.add(picElementUrl);
                messageData.MessageContent += "[PicUrl=" + picElementUrl + "]";
                messageData.LocalPath = str2;
                messageData.FileName = str;
                arrayList3.add(upperCase);
                messageData.MessageType = 1;
                z2 = true;
            } else if (num.intValue() == 3) {
                Object objCallMethod = XposedHelpers.callMethod(obj2, "getFileElement", new Object[0]);
                String str3 = (String) AbstractC6317.m11831(String.class, "fileName", objCallMethod);
                long jLongValue2 = ((Long) AbstractC6317.m11831(cls, "fileSize", objCallMethod)).longValue();
                messageData.LocalPath = (String) AbstractC6317.m11831(String.class, "filePath", objCallMethod);
                messageData.FileName = str3;
                messageData.FileSize = jLongValue2;
                messageData.MessageType = 7;
            } else if (num.intValue() == 6) {
                messageData.MessageContent += QQEmotionUtils.smallFaceElementToStrCode(XposedHelpers.callMethod(obj2, "getFaceElement", new Object[0]));
                messageData.MessageType = 1;
            } else if (num.intValue() == 5) {
                Object objCallMethod2 = XposedHelpers.callMethod(obj2, "getVideoElement", new Object[0]);
                String videoUrl = PluginMessageTool.getVideoUrl(String.valueOf(jLongValue), objCallMethod2);
                long jLongValue3 = ((Long) AbstractC6317.m11831(cls, "fileSize", objCallMethod2)).longValue();
                String str4 = (String) AbstractC6317.m11831(String.class, "fileName", objCallMethod2);
                messageData.MessageContent = videoUrl;
                messageData.FileUrl = videoUrl;
                messageData.FileName = str4;
                messageData.FileSize = jLongValue3;
                messageData.MessageType = 5;
            } else if (num.intValue() == 10) {
                messageData.MessageContent = (String) AbstractC6317.m11831(String.class, "bytesData", XposedHelpers.callMethod(obj2, "getArkElement", new Object[0]));
                messageData.MessageType = 2;
            } else if (num.intValue() == 4) {
                Object objCallMethod3 = XposedHelpers.callMethod(obj2, "getPttElement", new Object[0]);
                String str5 = (String) AbstractC6317.m11831(String.class, "fileName", objCallMethod3);
                long jLongValue4 = ((Long) AbstractC6317.m11831(cls, "fileSize", objCallMethod3)).longValue();
                String audioUrl = PluginMessageTool.getAudioUrl(String.valueOf(jLongValue), objCallMethod3);
                messageData.LocalPath = Environment.getExternalStorageDirectory() + "/Android/data/com.tencent.mobileqq/Tencent/MobileQQ/" + Hook_cookie.getMyuin() + "/ptt/" + str5;
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
        ArrayList arrayList = (ArrayList) AbstractC6317.m11831(ArrayList.class, "records", obj);
        if (arrayList == null || arrayList.isEmpty()) {
            messageData.ReplyTo = "";
            return;
        }
        Object obj2 = arrayList.get(0);
        messageData.ReplyTo = String.valueOf(((Long) AbstractC6317.m11831(Long.TYPE, "senderUin", obj2)).longValue());
        messageData.RecordMsg = parseMessage(obj2);
        messageData.MessageType = 6;
    }

    public boolean isGrayMessage(Object obj) {
        try {
            for (Object obj2 : (ArrayList) AbstractC6317.m11831(ArrayList.class, "elements", obj)) {
                if (((Integer) AbstractC6317.m11831(Integer.TYPE, "elementType", obj2)).intValue() == 8) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // p026.AbstractC6296
    public void loadHook(ClassLoader classLoader) {
        if (AbstractC6560.m12011()) {
            C5816.addAPIMessageListener(new InterfaceC5814() { // from class: lin.xposed.hook.javaplugin.飘花落叶言子楪世兰苏哲
                @Override // top.suzhelan.qstory.hook.api.InterfaceC5814
                /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
                public final void mo10807(Object obj) {
                    this.f15313.lambda$loadHook$0(obj);
                }
            });
        }
    }

    public MessageData parseMessage(Object obj) {
        try {
            MessageData messageData = new MessageData();
            messageData.PicUrlList = new ArrayList<>();
            String strM6668 = "senderUin";
            Class cls = Long.TYPE;
            long jLongValue = ((Long) AbstractC6317.m11831(cls, strM6668, obj)).longValue();
            long jLongValue2 = ((Long) AbstractC6317.m11831(cls, "msgTime", obj)).longValue();
            String str = (String) AbstractC6317.m11831(String.class, "peerUid", obj);
            int iIntValue = ((Integer) AbstractC6317.m11831(Integer.TYPE, "chatType", obj)).intValue();
            messageData.UserUin = String.valueOf(jLongValue);
            messageData.MessageTime = jLongValue2 * 1000;
            messageData.msg = obj;
            messageData.IsSend = String.valueOf(jLongValue).equals(QQEnvTool.getCurrentUin());
            messageData.MessageContent = "";
            if (iIntValue == 1 || iIntValue == 100) {
                messageData.GroupUin = "";
                messageData.PeerUin = String.valueOf(((Long) AbstractC6317.m11831(cls, "peerUin", obj)).longValue());
                messageData.IsGroup = false;
                messageData.SenderNickName = C8810.m14456(String.valueOf(str));
            } else {
                messageData.PeerUin = String.valueOf(((Long) AbstractC6317.m11831(cls, "peerUin", obj)).longValue());
                messageData.GroupUin = str;
                messageData.IsGroup = true;
                messageData.GroupName = (String) AbstractC6317.m11831(String.class, "peerName", obj);
                String str2 = (String) AbstractC6317.m11831(String.class, "sendMemberName", obj);
                if (TextUtils.isEmpty(str2)) {
                    str2 = (String) AbstractC6317.m11831(String.class, "sendNickName", obj);
                }
                messageData.SenderNickName = str2;
            }
            parseMessageContent(messageData, obj);
            parseReplyMessage(messageData, obj);
            return messageData;
        } catch (Exception e) {
            AbstractC6157.m11575(e);
            return null;
        }
    }
}
