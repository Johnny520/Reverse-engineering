package lin.xposed.hook.javaplugin.util;

import android.text.TextUtils;
import androidx.activity.AbstractC0900;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lin.xposed.hook.util.p011qq.CreateElement;
import lin.xposed.hook.util.p011qq.QQEnvTool;
import lin.xposed.hook.util.p011qq.QQFriendTool;
import lin.xposed.hook.util.p011qq.QQSessionUtils;
import p025.AbstractC7012;
import p026.AbstractC7017;
import p049.AbstractC7165;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class PluginSendMsgTool {
    public static Object createContact(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return QQSessionUtils.QQNT.getFriendContact(str2);
        }
        if (TextUtils.isEmpty(str2)) {
            return QQSessionUtils.QQNT.getGroupContact(str);
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        if (QQFriendTool.isFriend(str2)) {
            return QQSessionUtils.QQNT.getFriendContact(str2);
        }
        QQSessionUtils.QQNT.prepareTroopMemberStrangerTempChat(str, QQEnvTool.getUidFromUin(str2));
        return QQSessionUtils.QQNT.getContact(100, QQEnvTool.getUidFromUin(str2));
    }

    public static int getChatType() {
        try {
            Object currentContact = QQSessionUtils.getCurrentContact();
            return ((Integer) AbstractC7165.m12418(Integer.TYPE, "chatType", currentContact)).intValue();
        } catch (Exception unused) {
            return 0;
        }
    }

    public static String getCurrentFriendUin() {
        try {
            Object currentContact = QQSessionUtils.getCurrentContact();
            return ((Integer) AbstractC7165.m12418(Integer.TYPE, "chatType", currentContact)).intValue() == 1 ? QQEnvTool.getUinFromUid((String) AbstractC7165.m12418(String.class, "peerUid", currentContact)) : "";
        } catch (Exception e) {
            String strM14531 = "plugin api";
            String str = AbstractC7017.f17361;
            AbstractC7017.m12164(strM14531, e.toString(), e, true);
            return "";
        }
    }

    public static String getCurrentGroupUin() {
        try {
            Object currentContact = QQSessionUtils.getCurrentContact();
            return ((Integer) AbstractC7165.m12418(Integer.TYPE, "chatType", currentContact)).intValue() == 1 ? "" : (String) AbstractC7165.m12418(String.class, "peerUid", currentContact);
        } catch (Exception e) {
            String strM14531 = "plugin api";
            String str = AbstractC7017.f17361;
            AbstractC7017.m12164(strM14531, e.toString(), e, true);
            return "";
        }
    }

    public static ArrayList<Object> parseCompoundMessages(String str, String str2) {
        List<FindResult> listSplit = split(str2);
        ArrayList<Object> arrayList = new ArrayList<>();
        for (FindResult findResult : listSplit) {
            if (findResult.type == 0) {
                arrayList.add(CreateElement.createTextElement(findResult.content));
            } else if (findResult.type == 1) {
                if (findResult.key.equals("PicUrl")) {
                    arrayList.add(CreateElement.createPicElement(findResult.content));
                } else if (findResult.key.equals("AtQQ")) {
                    String uidFromUin = findResult.content;
                    if (!uidFromUin.equals("0")) {
                        uidFromUin = QQEnvTool.getUidFromUin(uidFromUin);
                    }
                    if (uidFromUin.isEmpty()) {
                        arrayList.add(CreateElement.createTextElement("@艾特失败"));
                    } else {
                        arrayList.add(CreateElement.createAtTextElement(str, uidFromUin));
                    }
                }
            }
        }
        return arrayList;
    }

    public static List<FindResult> split(String str) {
        Matcher matcher = Pattern.compile("\\[[^\\[\\]]*=[^\\[\\]]*\\]").matcher(str);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (matcher.find()) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            String strSubstring = str.substring(i2, iStart);
            String strSubstring2 = str.substring(iStart + 1, iEnd - 1);
            if (!strSubstring.isEmpty()) {
                FindResult findResult = new FindResult(i);
                findResult.type = 0;
                findResult.content = strSubstring;
                arrayList.add(findResult);
            }
            int iIndexOf = strSubstring2.indexOf("=");
            if (iIndexOf != -1) {
                FindResult findResult2 = new FindResult(i);
                findResult2.type = 1;
                findResult2.key = strSubstring2.substring(0, iIndexOf);
                findResult2.content = strSubstring2.substring(iIndexOf + 1);
                arrayList.add(findResult2);
            } else {
                FindResult findResult3 = new FindResult(i);
                findResult3.type = 0;
                findResult3.content = "[" + strSubstring2 + "]";
                arrayList.add(findResult3);
            }
            i2 = iEnd;
        }
        if (i2 < str.length()) {
            FindResult findResult4 = new FindResult(i);
            findResult4.type = 0;
            findResult4.content = str.substring(i2);
            arrayList.add(findResult4);
        }
        return arrayList;
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class FindResult {
        private String content;
        private String key;
        private int type;

        public /* synthetic */ FindResult(int i) {
            this();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("FindResult{type=");
            AbstractC7012.m12137(sb, this.type, 732);
            sb.append(this.content);
            sb.append('\'');
            sb.append(", key='");
            return AbstractC0900.m711(sb, this.key, "'}");
        }

        private FindResult() {
        }
    }
}
