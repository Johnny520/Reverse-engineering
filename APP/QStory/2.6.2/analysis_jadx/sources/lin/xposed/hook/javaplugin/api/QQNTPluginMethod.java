package lin.xposed.hook.javaplugin.api;

import android.app.Activity;
import android.text.TextUtils;
import androidx.appcompat.app.C0108;
import androidx.collection.C0276;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.compose.runtime.internal.C1245;
import com.alibaba.fastjson2.InterfaceC2915;
import com.alibaba.fastjson2.JSONObject;
import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedHelpers;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import kotlin.InterfaceC5183;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.jvm.internal.AbstractC5061;
import lin.xposed.hook.javaplugin.PluginMessageCallbackAPI;
import lin.xposed.hook.javaplugin.PluginOutput;
import lin.xposed.hook.javaplugin.bean.FriendInfo;
import lin.xposed.hook.javaplugin.bean.GroupBanInfo;
import lin.xposed.hook.javaplugin.bean.GroupInfo;
import lin.xposed.hook.javaplugin.bean.GroupMemberInfo;
import lin.xposed.hook.javaplugin.bean.MessageData;
import lin.xposed.hook.javaplugin.bean.OcrText;
import lin.xposed.hook.javaplugin.controller.PluginLoader;
import lin.xposed.hook.javaplugin.dialog.PluginMenuDialog;
import lin.xposed.hook.javaplugin.util.PluginSendMsgTool;
import lin.xposed.hook.util.qq.CreateElement;
import lin.xposed.hook.util.qq.Hook_cookie;
import lin.xposed.hook.util.qq.QQEnvTool;
import lin.xposed.hook.util.qq.QQFriendTool;
import lin.xposed.hook.util.qq.QQMsgService;
import lin.xposed.hook.util.qq.QQNTSendMsgUtils;
import lin.xposed.hook.util.qq.QQNTTroopTool;
import lin.xposed.hook.util.qq.QQSessionUtils;
import p004.AbstractC6098;
import p007.AbstractC6136;
import p010.AbstractC6154;
import p010.AbstractC6157;
import p010.C6158;
import p013.C6177;
import p015.C6198;
import p015.C6200;
import p015.C6204;
import p015.C6216;
import p015.C6220;
import p015.C6224;
import p024.AbstractC6291;
import p032.AbstractC6317;
import p032.AbstractC6318;
import p032.C6316;
import p035.AbstractC6340;
import p036.AbstractC6353;
import p037.C6368;
import p138.AbstractC7529;
import p138.C7530;
import p175.AbstractC7738;
import p253.AbstractC8189;
import p338.C8810;
import p342.C8824;
import p346.AbstractC8848;
import p346.AbstractC8850;
import p346.C8849;
import p350.AbstractC8866;
import p350.C8867;
import p350.C8868;
import p392.AbstractC9121;
import p392.AbstractC9124;
import p392.C9117;
import p392.C9119;
import p392.C9125;
import top.suzhelan.qstory.hook.item.C5919;
import top.suzhelan.qstory.hook.plugin.entity.NewFriendInfo;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class QQNTPluginMethod {
    private final PluginOutput errorOutput;
    private final PluginLoader pluginLoader;

    public QQNTPluginMethod(PluginLoader pluginLoader) {
        this.pluginLoader = pluginLoader;
        this.errorOutput = new PluginOutput(pluginLoader.getJavaPluginInfo());
    }

    private String resolvePath(String str) {
        return new File(str).isAbsolute() ? str : new File(this.pluginLoader.getJavaPluginInfo().getPluginLocalPath(), str).getAbsolutePath();
    }

    public String addItem(String str, String str2) {
        this.pluginLoader.dialogItemMap.put(str, str2);
        PluginMenuDialog currentInstance = PluginMenuDialog.getCurrentInstance();
        if (currentInstance != null) {
            currentInstance.noticeViewUpdate();
        }
        return str2;
    }

    public String addMenuItem(String str, String str2) {
        this.pluginLoader.msgMenuItemMap.put(str, str2);
        return str2;
    }

    public void addTemporaryItem(String str, String str2) {
        this.pluginLoader.temporaryItemMap.put(str, str2);
        PluginMenuDialog currentInstance = PluginMenuDialog.getCurrentInstance();
        if (currentInstance != null) {
            currentInstance.noticeViewUpdate();
        }
    }

    public void deleteMsg(Object obj) {
        MessageData message = obj instanceof MessageData ? (MessageData) obj : ((PluginMessageCallbackAPI) AbstractC6291.f17375.get(PluginMessageCallbackAPI.class)).parseMessage(obj);
        Object groupContact = message.IsGroup ? QQSessionUtils.QQNT.getGroupContact(message.GroupUin) : QQSessionUtils.QQNT.getFriendContact(message.UserUin);
        try {
            if (obj instanceof MessageData) {
                obj = message.msg;
            }
            Long l = (Long) AbstractC6317.m11831(Long.TYPE, AbstractC3056.m6668(-3937565221795923367L), obj);
            l.getClass();
            ArrayList arrayList = new ArrayList();
            arrayList.add(l);
            QQMsgService.deleteMsg(groupContact, arrayList);
        } catch (Exception e) {
            this.errorOutput.e(e);
        }
    }

    public void error(Throwable th) {
        this.errorOutput.e(th);
    }

    public void eval(String str) {
        try {
            this.pluginLoader.eval(str);
        } catch (Exception e) {
            this.errorOutput.e(e);
        }
    }

    public void forbidden(String str, String str2, int i) {
        if (!TextUtils.isEmpty(str2)) {
            QQNTTroopTool.shutUp(str, str2, i);
            return;
        }
        if (i <= 1) {
            QQNTTroopTool.shutUpAll(str, i == 1);
        } else {
            QQNTTroopTool.shutUpAll(str, i);
        }
    }

    public void forwardMsg(String str, String str2, Object obj) {
        Object objCreateContact = PluginSendMsgTool.createContact(str, str2);
        MessageData message = obj instanceof MessageData ? (MessageData) obj : ((PluginMessageCallbackAPI) AbstractC6291.f17375.get(PluginMessageCallbackAPI.class)).parseMessage(obj);
        Object objCreateContact2 = PluginSendMsgTool.createContact(message.GroupUin, message.UserUin);
        Long l = (Long) AbstractC6317.m11831(Long.TYPE, AbstractC3056.m6668(-3937565221795923367L), message.msg);
        l.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(l);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(objCreateContact);
        QQNTSendMsgUtils.forwardMsg(arrayList, objCreateContact2, arrayList2);
    }

    public Activity getActivity() {
        return AbstractC7738.m13031();
    }

    public long getBKN(String str) {
        return Hook_cookie.getBkn(str);
    }

    public boolean getBoolean(String str, String str2, boolean z) {
        Object objM392 = new C0108(this.pluginLoader.getJavaPluginInfo().getPluginID(), str).m392(str2);
        if (objM392 instanceof Boolean) {
            return ((Boolean) objM392).booleanValue();
        }
        if (objM392 instanceof String) {
            try {
                return Boolean.parseBoolean((String) objM392);
            } catch (Exception unused) {
            }
        }
        return z;
    }

    public int getChatType() {
        return PluginSendMsgTool.getChatType();
    }

    public String getCurrentFriendUin() {
        return PluginSendMsgTool.getCurrentFriendUin();
    }

    public String getCurrentGroupUin() {
        return PluginSendMsgTool.getCurrentGroupUin();
    }

    public double getDouble(String str, String str2, double d) {
        Object objM392 = new C0108(this.pluginLoader.getJavaPluginInfo().getPluginID(), str).m392(str2);
        if (objM392 instanceof Number) {
            return ((Number) objM392).doubleValue();
        }
        if (objM392 instanceof String) {
            try {
                return Double.parseDouble((String) objM392);
            } catch (Exception unused) {
            }
        }
        return d;
    }

    public float getFloat(String str, String str2, float f) {
        Object objM392 = new C0108(this.pluginLoader.getJavaPluginInfo().getPluginID(), str).m392(str2);
        if (objM392 instanceof Number) {
            return ((Number) objM392).floatValue();
        }
        if (objM392 instanceof String) {
            try {
                return Float.parseFloat((String) objM392);
            } catch (Exception unused) {
            }
        }
        return f;
    }

    public ArrayList<GroupBanInfo> getForbiddenList(String str) {
        return (ArrayList) QQNTTroopTool.getProhibitList(str);
    }

    public ArrayList<FriendInfo> getFriendList() {
        return QQFriendTool.getAllFriend();
    }

    public String getFriendRKey() {
        return C6368.f17502;
    }

    public String getGTK(String str) {
        return Hook_cookie.getG_TK(str);
    }

    public GroupInfo getGroupInfo(String str) {
        Object objM14669 = AbstractC9124.m14669(str);
        GroupInfo groupInfo = new GroupInfo();
        groupInfo.GroupUin = (String) XposedHelpers.getObjectField(objM14669, AbstractC3056.m6668(-3937678540213061031L));
        groupInfo.GroupName = (String) XposedHelpers.getObjectField(objM14669, AbstractC3056.m6668(-3937678063471691175L));
        groupInfo.GroupOwner = (String) XposedHelpers.getObjectField(objM14669, AbstractC3056.m6668(-3937677951802541479L));
        groupInfo.IsOwnerOrAdmin = AbstractC8850.m14487(objM14669);
        String str2 = (String) AbstractC6317.m11831(String.class, AbstractC3056.m6668(-3937678029111952807L), objM14669);
        ArrayList<String> arrayList = new ArrayList<>();
        if (str2 != null) {
            for (String str3 : str2.split(AbstractC3056.m6668(-3937661416178451879L))) {
                if (!TextUtils.isEmpty(str3)) {
                    arrayList.add(str3);
                }
            }
        } else {
            arrayList.addAll(AbstractC8850.m14488(str));
        }
        arrayList.add(groupInfo.GroupOwner);
        groupInfo.AdminList = arrayList;
        groupInfo.sourceInfo = objM14669;
        return groupInfo;
    }

    public ArrayList<GroupInfo> getGroupList() {
        return AbstractC9124.m14671();
    }

    public ArrayList<GroupMemberInfo> getGroupMemberList(String str) {
        return C8849.m14480(str);
    }

    public String getGroupRKey() {
        return C6368.f17503;
    }

    public int getInt(String str, String str2, int i) {
        Object objM392 = new C0108(this.pluginLoader.getJavaPluginInfo().getPluginID(), str).m392(str2);
        if (objM392 instanceof Number) {
            return ((Number) objM392).intValue();
        }
        if (objM392 instanceof String) {
            try {
                return Integer.parseInt((String) objM392);
            } catch (Exception unused) {
            }
        }
        return i;
    }

    public long getLong(String str, String str2, long j) {
        Object objM392 = new C0108(this.pluginLoader.getJavaPluginInfo().getPluginID(), str).m392(str2);
        if (objM392 instanceof Number) {
            return ((Number) objM392).longValue();
        }
        if (objM392 instanceof String) {
            try {
                return Long.parseLong((String) objM392);
            } catch (Exception unused) {
            }
        }
        return j;
    }

    public GroupMemberInfo getMemberInfo(String str, String str2) {
        C8849 c8849 = C8849.f24955;
        AbstractC6136.m11546(-3937824753784718759L, -3937586675157566887L, str);
        str2.getClass();
        try {
            c8849.getClass();
            Object objM14481 = C8849.m14481(str, str2);
            if (objM14481 == null) {
                return null;
            }
            GroupMemberInfo groupMemberInfo = new GroupMemberInfo();
            groupMemberInfo.sourceInfo = objM14481;
            Object objectField = XposedHelpers.getObjectField(objM14481, AbstractC3056.m6668(-3937277287188399527L));
            AbstractC3056.m6668(-3937759461691884967L);
            objectField.getClass();
            groupMemberInfo.Join_Time = ((Long) objectField).longValue();
            Object objectField2 = XposedHelpers.getObjectField(objM14481, AbstractC3056.m6668(-3937277330138072487L));
            AbstractC3056.m6668(-3937759461691884967L);
            objectField2.getClass();
            groupMemberInfo.Last_AvtivityTime = ((Long) objectField2).longValue();
            Object objectField3 = XposedHelpers.getObjectField(objM14481, AbstractC3056.m6668(-3937277231353824679L));
            AbstractC3056.m6668(-3937713569966327207L);
            objectField3.getClass();
            groupMemberInfo.UserUin = (String) objectField3;
            try {
                Object objectField4 = XposedHelpers.getObjectField(objM14481, AbstractC3056.m6668(-3937277136864544167L));
                AbstractC3056.m6668(-3937753135205057959L);
                objectField4.getClass();
                groupMemberInfo.UserLevel = ((Integer) objectField4).intValue();
            } catch (Throwable unused) {
                Object objectField5 = XposedHelpers.getObjectField(objM14481, AbstractC3056.m6668(-3937277089619903911L));
                AbstractC3056.m6668(-3937753135205057959L);
                objectField5.getClass();
                groupMemberInfo.UserLevel = ((Integer) objectField5).intValue();
            }
            groupMemberInfo.NickName = C8849.m14478(objM14481);
            Object objectField6 = XposedHelpers.getObjectField(objM14481, AbstractC3056.m6668(-3937277098209838503L));
            AbstractC3056.m6668(-3937713569966327207L);
            objectField6.getClass();
            groupMemberInfo.UserName = (String) objectField6;
            Object objectField7 = XposedHelpers.getObjectField(objM14481, AbstractC3056.m6668(-3937796316806251943L));
            if (objectField7 == null) {
                objectField7 = AbstractC3056.m6668(-3937796286741480871L);
            }
            groupMemberInfo.IsOwner = AbstractC3056.m6668(-3937796338281088423L).equals(objectField7.toString());
            groupMemberInfo.IsAdmin = AbstractC3056.m6668(-3937796260971677095L).equals(objectField7.toString());
            return groupMemberInfo;
        } catch (Exception e) {
            String strM6668 = AbstractC3056.m6668(-3937277351612908967L);
            String str3 = AbstractC6157.f16779;
            AbstractC6157.m11574(strM6668, e.toString(), e, true);
            return null;
        }
    }

    public String getMemberName(String str, String str2) {
        return C8849.m14477(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public List<MessageData> getMessageList(String str, String str2, int i) {
        C8868 c8868;
        Object objCreateContact = PluginSendMsgTool.createContact(str, str2);
        AbstractC3056.m6668(-3937783440494298535L);
        objCreateContact.getClass();
        int i2 = 1;
        try {
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Object objM14512 = AbstractC8866.m14512();
            if (objM14512 == null) {
                c8868 = new C8868(-1, AbstractC3056.m6668(-3937826493246473639L), new ArrayList());
            } else {
                Object objM14513 = AbstractC8866.m14513(i, objCreateContact);
                Object objM14514 = AbstractC8866.m14514(new C8867(ref$ObjectRef, countDownLatch, i2));
                C6316 c6316M11826 = C6316.m11826(objM14512.getClass());
                c6316M11826.f17409.f3617 = AbstractC3056.m6668(-3937826428821964199L);
                c6316M11826.f17409.f3618 = new Class[]{AbstractC6318.m11838(AbstractC3056.m6668(-3937826441706866087L)), AbstractC6318.m11838(AbstractC3056.m6668(-3937826235548435879L))};
                c6316M11826.m11828(objM14512, objM14513, objM14514);
                countDownLatch.await();
                c8868 = (C8868) ref$ObjectRef.element;
                if (c8868 == null) {
                    c8868 = new C8868(-1, AbstractC3056.m6668(-3937280602903152039L), new ArrayList());
                }
            }
        } catch (Exception e) {
            String str3 = AbstractC3056.m6668(-3937280529888708007L) + e.getMessage();
            String str4 = AbstractC6157.f16779;
            AbstractC6157.m11574(str3, e.toString(), e, true);
            c8868 = new C8868(-1, AbstractC3056.m6668(-3937280370974918055L) + e.getMessage(), new ArrayList());
        }
        ArrayList arrayList = new ArrayList();
        PluginMessageCallbackAPI pluginMessageCallbackAPI = (PluginMessageCallbackAPI) AbstractC6291.f17375.get(PluginMessageCallbackAPI.class);
        for (Object obj : c8868.f24980) {
            if (!pluginMessageCallbackAPI.isGrayMessage(obj)) {
                arrayList.add(pluginMessageCallbackAPI.parseMessage(obj));
            }
        }
        return arrayList;
    }

    public NewFriendInfo getNewFriendInfo(String str) {
        C8810 c8810 = C8810.f24796;
        String uidFromUin = QQEnvTool.getUidFromUin(str);
        c8810.getClass();
        AbstractC3056.m6668(-3937636127411013031L);
        uidFromUin.getClass();
        try {
            Object objM14455 = C8810.m14455();
            if (objM14455 != null) {
                C6316 c6316M11826 = C6316.m11826(objM14455.getClass());
                String strM6668 = AbstractC3056.m6668(-3937726785580696999L);
                C1245 c1245 = c6316M11826.f17409;
                c1245.f3617 = strM6668;
                c1245.f3618 = new Class[]{String.class, String.class};
                Object objM11828 = c6316M11826.m11828(objM14455, uidFromUin, AbstractC3056.m6668(-3937727597329515943L));
                if (objM11828 != null) {
                    NewFriendInfo newFriendInfo = new NewFriendInfo();
                    Object objM11831 = AbstractC6317.m11831(String.class, AbstractC3056.m6668(-3937586675157566887L), objM11828);
                    AbstractC3056.m6668(-3937727850732586407L);
                    objM11831.getClass();
                    Object objM118312 = AbstractC6317.m11831(String.class, AbstractC3056.m6668(-3937727773423175079L), objM11828);
                    AbstractC3056.m6668(-3937727850732586407L);
                    objM118312.getClass();
                    Object objM118313 = AbstractC6317.m11831(String.class, AbstractC3056.m6668(-3937727760538273191L), objM11828);
                    AbstractC3056.m6668(-3937727850732586407L);
                    objM118313.getClass();
                    String strM66682 = AbstractC3056.m6668(-3937727653164090791L);
                    Class cls = Integer.TYPE;
                    Object objM118314 = AbstractC6317.m11831(cls, strM66682, objM11828);
                    AbstractC3056.m6668(-3937727850732586407L);
                    objM118314.getClass();
                    int iIntValue = ((Number) objM118314).intValue();
                    Object objM118315 = AbstractC6317.m11831(cls, AbstractC3056.m6668(-3937727704703698343L), objM11828);
                    AbstractC3056.m6668(-3937727850732586407L);
                    objM118315.getClass();
                    int iIntValue2 = ((Number) objM118315).intValue();
                    newFriendInfo.uin = (String) objM11831;
                    newFriendInfo.nickname = (String) objM118312;
                    newFriendInfo.remark = (String) objM118313;
                    newFriendInfo.age = iIntValue;
                    newFriendInfo.sex = iIntValue2;
                    return newFriendInfo;
                }
            }
            return null;
        } catch (Exception e) {
            String strM66683 = AbstractC3056.m6668(-3937616396331255207L);
            String str2 = AbstractC6157.f16779;
            AbstractC6157.m11574(strM66683, e.toString(), e, true);
            return null;
        }
    }

    public List<NewFriendInfo> getNewFriendList() {
        C8810.f24796.getClass();
        return C8810.m14454();
    }

    public String getPT4Token(String str) {
        return Hook_cookie.getPt4Token(str);
    }

    public String getPskey(String str) {
        return Hook_cookie.getPskey(str);
    }

    public String getRealSkey() {
        return QQEnvTool.getRealSkey();
    }

    public String getSkey() {
        return Hook_cookie.getSkey();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3 */
    public String getString(String str, String str2, String str3) {
        try {
            Object obj = ((JSONObject) new C0108(this.pluginLoader.getJavaPluginInfo().getPluginID(), str).f318).get(str2);
            if (obj != null) {
                str3 = obj;
            }
        } catch (Exception unused) {
        }
        return (String) str3;
    }

    public String getSuperkey() {
        return AbstractC3056.m6668(-3937561979095614887L);
    }

    public void httpDownload(String str, String str2, Map<String, String> map) {
        String strResolvePath = resolvePath(str2);
        int i = AbstractC6353.f17480;
        File file = new File(strResolvePath);
        if (!file.exists()) {
            file.getParentFile().mkdirs();
        }
        C6200 c6200 = new C6200(new C6216());
        C1245 c1245 = new C1245(6);
        c1245.m2141(str);
        c1245.f3617 = C6224.m11677(map).m11678();
        try {
            C6204 c6204M11615 = new C6177(c6200, new C6198(c1245)).m11615();
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(c6204M11615.f17009.m11647());
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int i2 = bufferedInputStream.read(bArr);
                            if (i2 == -1) {
                                bufferedInputStream.close();
                                bufferedOutputStream.close();
                                c6204M11615.close();
                                return;
                            }
                            bufferedOutputStream.write(bArr, 0, i2);
                            bufferedOutputStream.flush();
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            AbstractC6136.m11544(-3937558805114783143L, sb, str);
            C0276.m847(AbstractC6136.m11557(-3937558697740600743L, sb, strResolvePath), e);
        }
    }

    public String httpGet(String str, Map<String, String> map) {
        int i = AbstractC6353.f17480;
        try {
            C6200 c6200 = new C6200(new C6216());
            C1245 c1245 = new C1245(6);
            c1245.m2141(str);
            c1245.f3617 = C6224.m11677(map).m11678();
            c1245.m2148("GET", null);
            C6204 c6204M11615 = new C6177(c6200, new C6198(c1245)).m11615();
            String strM11648 = c6204M11615.f17009.m11648();
            c6204M11615.close();
            return strM11648;
        } catch (IOException e) {
            String strM6668 = AbstractC3056.m6668(-3937561291900847527L);
            String str2 = AbstractC6157.f16779;
            AbstractC6157.m11574(strM6668, e.toString(), e, true);
            return AbstractC3056.m6668(-3937561979095614887L);
        }
    }

    public String httpPost(String str, Map<String, String> map) {
        int i = AbstractC6353.f17480;
        try {
            C6200 c6200 = new C6200(new C6216());
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                key.getClass();
                value.getClass();
                arrayList.add(AbstractC6098.m11454(key, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
                arrayList2.add(AbstractC6098.m11454(value, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
            }
            C1245 c1245 = new C1245(6);
            c1245.m2141(str);
            c1245.m2156(AbstractC3056.m6668(-3937559956166018471L), AbstractC3056.m6668(-3937559286151120295L));
            c1245.m2156(AbstractC3056.m6668(-3937559419295106471L), AbstractC3056.m6668(-3937559311920924071L));
            c1245.m2156(AbstractC3056.m6668(-3937559294741054887L), AbstractC3056.m6668(-3937559238906480039L));
            c1245.m2148("POST", new C6220(arrayList, arrayList2));
            C6204 c6204M11615 = new C6177(c6200, new C6198(c1245)).m11615();
            String strM11648 = c6204M11615.f17009.m11648();
            c6204M11615.close();
            return strM11648;
        } catch (IOException e) {
            String strM6668 = AbstractC3056.m6668(-3937561291900847527L);
            String str2 = AbstractC6157.f16779;
            AbstractC6157.m11574(strM6668, e.toString(), e, true);
            return AbstractC3056.m6668(-3937561979095614887L);
        }
    }

    public String httpPostJson(String str, String str2) {
        return AbstractC6353.m11905(str, str2, null);
    }

    public boolean isFriend(String str) {
        return QQFriendTool.isFriend(str);
    }

    public void kick(String str, String str2, boolean z) {
        QQNTTroopTool.kickMember(str, str2, z);
    }

    public void load(String str) {
        try {
            this.pluginLoader.loadPluginByPath(resolvePath(str));
        } catch (Throwable th) {
            this.errorOutput.e(th);
        }
    }

    public ClassLoader loadAar(String str) {
        ClassLoader classLoader;
        String strResolvePath = resolvePath(str);
        ClassLoader classLoader2 = AbstractC6318.f17412;
        ConcurrentHashMap concurrentHashMap = AbstractC7529.f20412;
        String strM13049 = AbstractC7738.m13049(strResolvePath);
        if (strM13049 == null) {
            classLoader = null;
        } else {
            classLoader = (ClassLoader) AbstractC7529.f20411.computeIfAbsent(AbstractC7529.m12726(classLoader2, "aar", strM13049), new C7530(strResolvePath, 2, classLoader2));
        }
        this.pluginLoader.addClassLoader(classLoader);
        return classLoader;
    }

    public ClassLoader loadDex(String str) {
        ClassLoader classLoader;
        String strResolvePath = resolvePath(str);
        ClassLoader classLoader2 = AbstractC6318.f17412;
        ConcurrentHashMap concurrentHashMap = AbstractC7529.f20412;
        String strM13049 = AbstractC7738.m13049(strResolvePath);
        if (strM13049 == null) {
            classLoader = null;
        } else {
            classLoader = (ClassLoader) AbstractC7529.f20411.computeIfAbsent(AbstractC7529.m12726(classLoader2, "dex", strM13049), new C7530(strResolvePath, 1, classLoader2));
        }
        this.pluginLoader.addClassLoader(classLoader);
        return classLoader;
    }

    public ClassLoader loadJar(String str) {
        ClassLoader classLoader;
        String strResolvePath = resolvePath(str);
        ClassLoader classLoader2 = AbstractC6318.f17412;
        ConcurrentHashMap concurrentHashMap = AbstractC7529.f20412;
        String strM13049 = AbstractC7738.m13049(strResolvePath);
        if (strM13049 == null) {
            classLoader = null;
        } else {
            classLoader = (ClassLoader) AbstractC7529.f20411.computeIfAbsent(AbstractC7529.m12726(classLoader2, "jar", strM13049), new C7530(strResolvePath, 0, classLoader2));
        }
        this.pluginLoader.addClassLoader(classLoader);
        return classLoader;
    }

    public void log(Object obj) {
        this.errorOutput.log(obj);
    }

    public void putBoolean(String str, String str2, boolean z) {
        C0108 c0108 = new C0108(this.pluginLoader.getJavaPluginInfo().getPluginID(), str);
        c0108.m371(Boolean.valueOf(z), str2);
        c0108.m358();
    }

    public void putDouble(String str, String str2, double d) {
        new C0108(this.pluginLoader.getJavaPluginInfo().getPluginID(), str).m371(Double.valueOf(d), str2);
    }

    public void putFloat(String str, String str2, float f) {
        new C0108(this.pluginLoader.getJavaPluginInfo().getPluginID(), str).m371(Float.valueOf(f), str2);
    }

    public void putInt(String str, String str2, int i) {
        C0108 c0108 = new C0108(this.pluginLoader.getJavaPluginInfo().getPluginID(), str);
        c0108.m371(Integer.valueOf(i), str2);
        c0108.m358();
    }

    public void putLong(String str, String str2, long j) {
        C0108 c0108 = new C0108(this.pluginLoader.getJavaPluginInfo().getPluginID(), str);
        c0108.m371(Long.valueOf(j), str2);
        c0108.m358();
    }

    public void putString(String str, String str2, String str3) {
        C0108 c0108 = new C0108(this.pluginLoader.getJavaPluginInfo().getPluginID(), str);
        c0108.m371(str3, str2);
        c0108.m358();
    }

    public byte[] readFileBytes(String str) {
        return AbstractC0455.m1144(new File(resolvePath(str)));
    }

    public String readFileText(String str) {
        return AbstractC0455.m1142(resolvePath(str));
    }

    public void removeItem(String str, String str2) {
        this.pluginLoader.dialogItemMap.remove(str2);
    }

    public void removeItemByName(String str) {
        this.pluginLoader.dialogItemMap.remove(str);
    }

    public void replyEmoji(Object obj, int i, String str) {
        MessageData message = obj instanceof MessageData ? (MessageData) obj : ((PluginMessageCallbackAPI) AbstractC6291.f17375.get(PluginMessageCallbackAPI.class)).parseMessage(obj);
        if (!message.IsGroup) {
            C5919.m11249(AbstractC3056.m6668(-3937617826555364775L));
            return;
        }
        String str2 = message.GroupUin;
        try {
            if (obj instanceof MessageData) {
                obj = message.msg;
            }
            AbstractC8189.m13666(str2, ((Long) AbstractC6317.m11831(Long.TYPE, AbstractC3056.m6668(-3937617766425822631L), obj)).longValue(), str, i);
        } catch (Exception e) {
            this.errorOutput.e(e);
        }
    }

    public void revokeMsg(Object obj) {
        MessageData message = obj instanceof MessageData ? (MessageData) obj : ((PluginMessageCallbackAPI) AbstractC6291.f17375.get(PluginMessageCallbackAPI.class)).parseMessage(obj);
        Object groupContact = message.IsGroup ? QQSessionUtils.QQNT.getGroupContact(message.GroupUin) : QQSessionUtils.QQNT.getFriendContact(message.UserUin);
        try {
            if (obj instanceof MessageData) {
                obj = message.msg;
            }
            QQMsgService.recallMsg(groupContact, ((Long) AbstractC6317.m11831(Long.TYPE, AbstractC3056.m6668(-3937565221795923367L), obj)).longValue());
        } catch (Exception e) {
            this.errorOutput.e(e);
        }
    }

    public String scanImageText(String str) {
        try {
            return C8824.m14469(resolvePath(str));
        } catch (Exception e) {
            this.errorOutput.e(e);
            return AbstractC3056.m6668(-3937561979095614887L);
        }
    }

    public List<OcrText> scanImageTextDetail(String str) {
        try {
            return C8824.m14468(resolvePath(str));
        } catch (Exception e) {
            this.errorOutput.e(e);
            return new ArrayList();
        }
    }

    public void sendCard(String str, String str2, String str3) {
        QQNTSendMsgUtils.sendCard(PluginSendMsgTool.createContact(str, str2), str3);
    }

    public void sendFile(String str, String str2, String str3) {
        QQNTSendMsgUtils.sendFile(PluginSendMsgTool.createContact(str, str2), resolvePath(str3));
    }

    public void sendLike(String str) {
        QQFriendTool.sendLike(str, 20);
    }

    public void sendMsg(String str, String str2, String str3) {
        QQNTSendMsgUtils.sendMsg(PluginSendMsgTool.createContact(str, str2), PluginSendMsgTool.parseCompoundMessages(str, str3));
    }

    public void sendPai(String str, String str2) {
        int i;
        try {
            if (TextUtils.isEmpty(str)) {
                i = 1;
                str = str2;
            } else {
                i = 2;
            }
            Object objCallMethod = XposedHelpers.callMethod(QQEnvTool.getAppRuntime(), AbstractC3056.m6668(-3937617848030201255L), new Class[]{String.class}, new Object[]{(String) AbstractC6317.m11829(AbstractC6318.m11838(AbstractC3056.m6668(-3937618144382944679L)), String.class, AbstractC3056.m6668(-3937617938224514471L))});
            int i2 = AbstractC6340.f17461;
            Class cls = Void.TYPE;
            Class cls2 = Integer.TYPE;
            if (i2 >= 13350) {
                C9125 c9125M14680 = C9125.m14680(objCallMethod.getClass());
                c9125M14680.m14683(String.class, String.class, cls2);
                c9125M14680.f25506 = cls;
                c9125M14680.m14684(objCallMethod, str2, str, Integer.valueOf(i));
                return;
            }
            if (i2 >= 12290) {
                C9125 c9125M146802 = C9125.m14680(objCallMethod.getClass());
                c9125M146802.m14683(cls2, String.class, String.class);
                c9125M146802.f25506 = cls;
                c9125M146802.m14684(objCallMethod, Integer.valueOf(i), str2, str);
                return;
            }
            C9125 c9125M146803 = C9125.m14680(objCallMethod.getClass());
            c9125M146803.m14683(String.class, String.class, cls2);
            c9125M146803.f25506 = cls;
            c9125M146803.m14684(objCallMethod, str2, str, Integer.valueOf(i));
        } catch (Exception e) {
            this.errorOutput.e(e);
        }
    }

    public void sendPic(String str, String str2, String str3) {
        QQNTSendMsgUtils.sendPic(PluginSendMsgTool.createContact(str, str2), resolvePath(str3));
    }

    public void sendProto(String str, String str2) {
        try {
            JSONObject jSONObjectM6316 = InterfaceC2915.m6316(str2);
            C6158 c6158 = new C6158();
            c6158.m11581(jSONObjectM6316);
            AbstractC0455.m1141(str, c6158.m11579());
        } catch (Exception e) {
            this.errorOutput.e(e);
        }
    }

    public void sendReply(String str, Object obj, String str2) {
        Object groupContact = QQSessionUtils.QQNT.getGroupContact(str);
        if (obj instanceof MessageData) {
            obj = ((MessageData) obj).msg;
        }
        try {
            Object objCreateReplyElement = CreateElement.createReplyElement(((Long) AbstractC6317.m11831(Long.TYPE, AbstractC3056.m6668(-3937565221795923367L), obj)).longValue());
            ArrayList<Object> compoundMessages = PluginSendMsgTool.parseCompoundMessages(str, str2);
            compoundMessages.add(0, objCreateReplyElement);
            QQNTSendMsgUtils.sendMsg(groupContact, compoundMessages);
        } catch (Exception e) {
            this.errorOutput.e(e);
        }
    }

    public void sendSticker(String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str4)) {
            str4 = AbstractC3056.m6668(-3937589935037744551L);
        }
        Object objCreateContact = PluginSendMsgTool.createContact(str, str2);
        Object objCreateEmojiElement = CreateElement.createEmojiElement(resolvePath(str3));
        Object objM14649 = C9117.m14649(AbstractC6318.m11838(AbstractC3056.m6668(-3937575778825536935L)), AbstractC3056.m6668(-3937581143239689639L), objCreateEmojiElement);
        C9117.m14650(objM14649, AbstractC3056.m6668(-3937579751670285735L), str4);
        C9117.m14650(objM14649, AbstractC3056.m6668(-3937579592756495783L), 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(objCreateEmojiElement);
        QQNTSendMsgUtils.sendMsg(objCreateContact, arrayList);
    }

    public void sendVideo(String str, String str2, String str3) {
        QQNTSendMsgUtils.sendVideo(PluginSendMsgTool.createContact(str, str2), resolvePath(str3));
    }

    public void sendVoice(String str, String str2, String str3) {
        QQNTSendMsgUtils.sendVoice(PluginSendMsgTool.createContact(str, str2), resolvePath(str3));
    }

    public void setCard(String str, String str2, String str3) {
        InterfaceC5183 interfaceC5183 = AbstractC8848.f24952;
        AbstractC6136.m11546(-3937706981486495143L, -3937275805424682407L, str);
        str2.getClass();
        AbstractC3056.m6668(-3937727773423175079L);
        str3.getClass();
        Object appRuntime = QQEnvTool.getAppRuntime();
        appRuntime.getClass();
        Object objM10031 = AbstractC5061.m10031(appRuntime, AbstractC3056.m6668(-3937617848030201255L), (String) AbstractC8848.f24952.getValue());
        Class clsM14657 = AbstractC9121.m14657(AbstractC3056.m6668(-3937275801129715111L));
        clsM14657.getClass();
        Object objM14655 = C9119.m14655(clsM14657, new Object[0]);
        objM14655.getClass();
        AbstractC5061.m10018(objM14655, AbstractC3056.m6668(-3937597717518484903L), str3);
        AbstractC5061.m10018(objM14655, AbstractC3056.m6668(-3937277231353824679L), str2);
        AbstractC5061.m10018(objM14655, AbstractC3056.m6668(-3937678540213061031L), str);
        ArrayList arrayListM13670 = AbstractC8189.m13670(objM14655);
        ArrayList arrayListM136702 = AbstractC8189.m13670(1);
        C9125 c9125M14679 = C9125.m14679(objM10031);
        c9125M14679.m14683(String.class, ArrayList.class, ArrayList.class);
        c9125M14679.m14684(objM10031, str, arrayListM13670, arrayListM136702);
    }

    public void setTitle(String str, String str2, String str3) {
        C8849 c8849 = C8849.f24955;
        AbstractC6136.m11546(-3937706981486495143L, -3937586675157566887L, str);
        str2.getClass();
        AbstractC3056.m6668(-3937706470385386919L);
        str3.getClass();
        try {
            if (AbstractC6340.f17461 < 12290) {
                QQNTTroopTool.setGroupMemberTitle(str, str2, str3);
                return;
            }
            Object runtimeService = QQEnvTool.getRuntimeService(AbstractC9121.m14657(AbstractC3056.m6668(-3937276522684220839L)), AbstractC3056.m6668(-3937561979095614887L));
            C9125 c9125M14679 = C9125.m14679(runtimeService);
            c9125M14679.f25504 = AbstractC3056.m6668(-3937276256396248487L);
            c9125M14679.f25506 = String.class;
            c9125M14679.m14683(String.class, String.class);
            Object objM14684 = c9125M14679.m14684(runtimeService, str, str2);
            AbstractC3056.m6668(-3937713569966327207L);
            objM14684.getClass();
            C6158 c6158 = new C6158();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(AbstractC3056.m6668(-3937595638754313639L), 2300);
            jSONObject.put(AbstractC3056.m6668(-3937595612984509863L), 2);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(AbstractC3056.m6668(-3937595638754313639L), Long.valueOf(Long.parseLong(str)));
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(AbstractC3056.m6668(-3937595638754313639L), Long.valueOf(Long.parseLong(str2)));
            jSONObject3.put(AbstractC3056.m6668(-3937595535675098535L), str3);
            jSONObject3.put(AbstractC3056.m6668(-3937276230626444711L), 4294967295L);
            jSONObject3.put(AbstractC3056.m6668(-3937827966420256167L), (String) objM14684);
            jSONObject2.put(AbstractC3056.m6668(-3937595621574444455L), jSONObject3);
            jSONObject.put(AbstractC3056.m6668(-3937595527085163943L), jSONObject2);
            c6158.m11581(jSONObject);
            String strM6668 = AbstractC3056.m6668(-3937276204856640935L);
            byte[] bArrM11579 = c6158.m11579();
            AbstractC3056.m6668(-3937276136137164199L);
            bArrM11579.getClass();
            AbstractC0455.m1141(strM6668, bArrM11579);
        } catch (Exception e) {
            String strM66682 = AbstractC3056.m6668(-3937277351612908967L);
            String str4 = AbstractC6157.f16779;
            AbstractC6157.m11574(strM66682, e.toString(), e, true);
        }
    }

    public void toast(Object obj) {
        AbstractC6154.m11561(obj);
    }

    public void writeBytesToFile(String str, byte[] bArr) {
        AbstractC0455.m1146(resolvePath(str), bArr);
    }

    public void writeTextAppendToFile(String str, String str2) {
        AbstractC0455.m1145(resolvePath(str), str2, true);
    }

    public void writeTextToFile(String str, String str2) {
        AbstractC0455.m1145(resolvePath(str), str2, false);
    }

    public String httpPostJson(String str, Map<String, String> map, String str2) {
        return AbstractC6353.m11905(str, str2, map);
    }

    public void sendLike(String str, int i) {
        QQFriendTool.sendLike(str, i);
    }

    public void removeItem(String str) {
        this.pluginLoader.dialogItemMap.remove(str);
    }

    public String addItem(String str, String str2, String str3) {
        addItem(str, str2);
        return str2;
    }

    public String getString(String str, String str2) {
        return (String) new C0108(this.pluginLoader.getJavaPluginInfo().getPluginID(), str).m392(str2);
    }

    @Deprecated(since = "弃用了")
    public void sendShake(String str) {
    }

    @Deprecated(since = "弃用了")
    public void sendTip(Object obj, String str) {
    }

    public void replyEmoji(Object obj, String str) {
        replyEmoji(obj, 1, str);
    }

    public String httpGet(String str) {
        return AbstractC6353.m11902(str);
    }

    @Deprecated(since = "发送表情 参数三为表情id")
    public void sendAntEmo(String str, String str2, int i) {
    }

    @Deprecated(since = "弃用了")
    public void sendShow(String str, String str2, int i) {
    }

    public void httpDownload(String str, String str2) {
        AbstractC6353.m11904(str, resolvePath(str2));
    }

    public String httpPost(String str, Map<String, String> map, Map<String, String> map2) {
        int i = AbstractC6353.f17480;
        try {
            C6200 c6200 = new C6200(new C6216());
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                key.getClass();
                value.getClass();
                arrayList.add(AbstractC6098.m11454(key, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
                arrayList2.add(AbstractC6098.m11454(value, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
            }
            C1245 c1245 = new C1245(6);
            c1245.m2141(str);
            c1245.f3617 = C6224.m11677(map).m11678();
            c1245.m2148("POST", new C6220(arrayList, arrayList2));
            C6204 c6204M11615 = new C6177(c6200, new C6198(c1245)).m11615();
            String strM11648 = c6204M11615.f17009.m11648();
            c6204M11615.close();
            return strM11648;
        } catch (IOException e) {
            String strM6668 = AbstractC3056.m6668(-3937561291900847527L);
            String str2 = AbstractC6157.f16779;
            AbstractC6157.m11574(strM6668, e.toString(), e, true);
            return AbstractC3056.m6668(-3937561979095614887L);
        }
    }
}
