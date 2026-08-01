package lin.xposed.hook.javaplugin.util;

import android.text.TextUtils;
import androidx.activity.AbstractC0053;
import com.bumptech.glide.AbstractC3056;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lin.xposed.hook.util.qq.CreateElement;
import lin.xposed.hook.util.qq.QQEnvTool;
import lin.xposed.hook.util.qq.QQFriendTool;
import lin.xposed.hook.util.qq.QQSessionUtils;
import p007.AbstractC6136;
import p010.AbstractC6157;
import p032.AbstractC6317;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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
            return ((Integer) AbstractC6317.m11831(Integer.TYPE, AbstractC3056.m6668(-3937565801616508327L), currentContact)).intValue();
        } catch (Exception unused) {
            return 0;
        }
    }

    public static String getCurrentFriendUin() {
        try {
            Object currentContact = QQSessionUtils.getCurrentContact();
            return ((Integer) AbstractC6317.m11831(Integer.TYPE, AbstractC3056.m6668(-3937565801616508327L), currentContact)).intValue() == 1 ? QQEnvTool.getUinFromUid((String) AbstractC6317.m11831(String.class, AbstractC3056.m6668(-3937592177010673063L), currentContact)) : AbstractC3056.m6668(-3937561979095614887L);
        } catch (Exception e) {
            String strM6668 = AbstractC3056.m6668(-3937640864759940519L);
            String str = AbstractC6157.f16779;
            AbstractC6157.m11574(strM6668, e.toString(), e, true);
            return AbstractC3056.m6668(-3937561979095614887L);
        }
    }

    public static String getCurrentGroupUin() {
        try {
            Object currentContact = QQSessionUtils.getCurrentContact();
            return ((Integer) AbstractC6317.m11831(Integer.TYPE, AbstractC3056.m6668(-3937565801616508327L), currentContact)).intValue() == 1 ? AbstractC3056.m6668(-3937561979095614887L) : (String) AbstractC6317.m11831(String.class, AbstractC3056.m6668(-3937592177010673063L), currentContact);
        } catch (Exception e) {
            String strM6668 = AbstractC3056.m6668(-3937640864759940519L);
            String str = AbstractC6157.f16779;
            AbstractC6157.m11574(strM6668, e.toString(), e, true);
            return AbstractC3056.m6668(-3937561979095614887L);
        }
    }

    public static ArrayList<Object> parseCompoundMessages(String str, String str2) {
        List<FindResult> listSplit = split(str2);
        ArrayList<Object> arrayList = new ArrayList<>();
        for (FindResult findResult : listSplit) {
            if (findResult.type == 0) {
                arrayList.add(CreateElement.createTextElement(findResult.content));
            } else if (findResult.type == 1) {
                if (findResult.key.equals(AbstractC3056.m6668(-3937640808925365671L))) {
                    arrayList.add(CreateElement.createPicElement(findResult.content));
                } else if (findResult.key.equals(AbstractC3056.m6668(-3937640804630398375L))) {
                    String uidFromUin = findResult.content;
                    if (!uidFromUin.equals(AbstractC3056.m6668(-3937561652678100391L))) {
                        uidFromUin = QQEnvTool.getUidFromUin(uidFromUin);
                    }
                    if (uidFromUin.isEmpty()) {
                        arrayList.add(CreateElement.createTextElement(AbstractC3056.m6668(-3937640826105234855L)));
                    } else {
                        arrayList.add(CreateElement.createAtTextElement(str, uidFromUin));
                    }
                }
            }
        }
        return arrayList;
    }

    public static List<FindResult> split(String str) {
        Matcher matcher = Pattern.compile(AbstractC3056.m6668(-3937640748795823527L)).matcher(str);
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
            int iIndexOf = strSubstring2.indexOf(AbstractC3056.m6668(-3937597597259400615L));
            if (iIndexOf != -1) {
                FindResult findResult2 = new FindResult(i);
                findResult2.type = 1;
                findResult2.key = strSubstring2.substring(0, iIndexOf);
                findResult2.content = strSubstring2.substring(iIndexOf + 1);
                arrayList.add(findResult2);
            } else {
                FindResult findResult3 = new FindResult(i);
                findResult3.type = 0;
                StringBuilder sb = new StringBuilder();
                AbstractC6136.m11544(-3937640705846150567L, sb, strSubstring2);
                sb.append(AbstractC3056.m6668(-3937618801512940967L));
                findResult3.content = sb.toString();
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

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static class FindResult {
        private String content;
        private String key;
        private int type;

        public /* synthetic */ FindResult(int i) {
            this();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractC3056.m6668(-3937641015083795879L));
            AbstractC6136.m11533(sb, this.type, -3937640950659286439L);
            sb.append(this.content);
            sb.append('\'');
            sb.append(AbstractC3056.m6668(-3937640967839155623L));
            return AbstractC0053.m146(sb, this.key, "'}");
        }

        private FindResult() {
        }
    }
}
