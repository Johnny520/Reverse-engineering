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
import p303.AbstractC9234;

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
            return ((Integer) AbstractC7165.m12418(Integer.TYPE, AbstractC9234.m14531(125), currentContact)).intValue();
        } catch (Exception unused) {
            return 0;
        }
    }

    public static String getCurrentFriendUin() {
        try {
            Object currentContact = QQSessionUtils.getCurrentContact();
            return ((Integer) AbstractC7165.m12418(Integer.TYPE, AbstractC9234.m14531(125), currentContact)).intValue() == 1 ? QQEnvTool.getUinFromUid((String) AbstractC7165.m12418(String.class, AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵呜呜喵喵喵喵~喵喵喵喵喵呜喵呜~喵喵喵喵喵呜喵呜"), currentContact)) : "";
        } catch (Exception e) {
            String strM14531 = AbstractC9234.m14531(733);
            String str = AbstractC7017.f17361;
            AbstractC7017.m12164(strM14531, e.toString(), e, true);
            return "";
        }
    }

    public static String getCurrentGroupUin() {
        try {
            Object currentContact = QQSessionUtils.getCurrentContact();
            return ((Integer) AbstractC7165.m12418(Integer.TYPE, AbstractC9234.m14531(125), currentContact)).intValue() == 1 ? "" : (String) AbstractC7165.m12418(String.class, AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵呜呜喵喵喵喵~喵喵喵喵喵呜喵呜~喵喵喵喵喵呜喵呜"), currentContact);
        } catch (Exception e) {
            String strM14531 = AbstractC9234.m14531(733);
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
                if (findResult.key.equals(AbstractC9234.m14532("喵喵呜喵喵喵呜呜~喵喵喵呜呜呜喵喵~喵喵喵呜呜喵喵呜~喵喵呜呜呜呜喵呜~喵喵喵呜喵呜呜呜~喵喵喵喵喵喵喵喵"))) {
                    arrayList.add(CreateElement.createPicElement(findResult.content));
                } else if (findResult.key.equals(AbstractC9234.m14532("喵喵呜呜喵喵呜喵~喵喵喵喵喵喵喵呜~喵喵呜喵呜喵呜呜~喵喵呜呜呜喵喵呜"))) {
                    String uidFromUin = findResult.content;
                    if (!uidFromUin.equals(AbstractC9234.m14532("喵呜喵喵喵喵呜呜"))) {
                        uidFromUin = QQEnvTool.getUidFromUin(uidFromUin);
                    }
                    if (uidFromUin.isEmpty()) {
                        arrayList.add(CreateElement.createTextElement(AbstractC9234.m14531(734)));
                    } else {
                        arrayList.add(CreateElement.createAtTextElement(str, uidFromUin));
                    }
                }
            }
        }
        return arrayList;
    }

    public static List<FindResult> split(String str) {
        Matcher matcher = Pattern.compile(AbstractC9234.m14531(735)).matcher(str);
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
            int iIndexOf = strSubstring2.indexOf(AbstractC9234.m14532("喵呜喵喵呜呜呜喵"));
            if (iIndexOf != -1) {
                FindResult findResult2 = new FindResult(i);
                findResult2.type = 1;
                findResult2.key = strSubstring2.substring(0, iIndexOf);
                findResult2.content = strSubstring2.substring(iIndexOf + 1);
                arrayList.add(findResult2);
            } else {
                FindResult findResult3 = new FindResult(i);
                findResult3.type = 0;
                findResult3.content = AbstractC9234.m14532("喵喵呜喵呜喵喵喵") + strSubstring2 + AbstractC9234.m14532("喵喵呜喵呜呜呜喵");
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
            sb.append(AbstractC9234.m14531(731));
            AbstractC7012.m12137(sb, this.type, 732);
            sb.append(this.content);
            sb.append('\'');
            sb.append(AbstractC9234.m14532("喵呜喵呜呜呜呜呜~喵呜喵呜喵呜喵呜~喵喵喵呜喵喵喵呜~喵喵喵喵呜呜喵呜~喵喵喵呜呜呜喵喵~喵呜喵呜喵喵喵呜~喵呜喵喵喵呜呜喵"));
            return AbstractC0900.m711(sb, this.key, "'}");
        }

        private FindResult() {
        }
    }
}
