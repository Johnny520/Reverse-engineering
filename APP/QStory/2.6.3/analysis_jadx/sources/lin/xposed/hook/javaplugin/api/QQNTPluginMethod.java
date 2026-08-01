package lin.xposed.hook.javaplugin.api;

import android.app.Activity;
import android.text.TextUtils;
import androidx.appcompat.app.C0108;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.compose.runtime.internal.C1245;
import com.alibaba.fastjson2.InterfaceC2916;
import com.alibaba.fastjson2.JSONObject;
import com.bumptech.glide.AbstractC3055;
import com.bumptech.glide.AbstractC3065;
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
import kotlin.InterfaceC5184;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.jvm.internal.AbstractC5062;
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
import p003.AbstractC6089;
import p007.C6125;
import p007.C6127;
import p007.C6131;
import p007.C6143;
import p007.C6147;
import p007.C6151;
import p009.AbstractC6183;
import p010.AbstractC6185;
import p010.AbstractC6188;
import p010.C6189;
import p011.C6203;
import p024.AbstractC6309;
import p033.AbstractC6336;
import p033.AbstractC6337;
import p033.C6335;
import p034.AbstractC6347;
import p036.AbstractC6358;
import p037.AbstractC6370;
import p038.C6385;
import p053.AbstractC6561;
import p138.AbstractC7530;
import p138.C7531;
import p287.AbstractC8405;
import p320.AbstractC8684;
import p320.C8685;
import p320.C8686;
import p339.C8808;
import p346.AbstractC8835;
import p346.AbstractC8837;
import p346.C8836;
import p352.C8864;
import p389.AbstractC9090;
import p389.C9086;
import p389.C9088;
import p389.C9092;
import top.suzhelan.qstory.hook.item.C5925;
import top.suzhelan.qstory.hook.plugin.entity.NewFriendInfo;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
        MessageData message = obj instanceof MessageData ? (MessageData) obj : ((PluginMessageCallbackAPI) AbstractC6309.f17424.get(PluginMessageCallbackAPI.class)).parseMessage(obj);
        Object groupContact = message.IsGroup ? QQSessionUtils.QQNT.getGroupContact(message.GroupUin) : QQSessionUtils.QQNT.getFriendContact(message.UserUin);
        try {
            if (obj instanceof MessageData) {
                obj = message.msg;
            }
            Long l = (Long) AbstractC6336.m11859(Long.TYPE, AbstractC8405.m13973("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜喵喵喵喵呜~喵喵喵喵喵喵喵呜"), obj);
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
        MessageData message = obj instanceof MessageData ? (MessageData) obj : ((PluginMessageCallbackAPI) AbstractC6309.f17424.get(PluginMessageCallbackAPI.class)).parseMessage(obj);
        Object objCreateContact2 = PluginSendMsgTool.createContact(message.GroupUin, message.UserUin);
        Long l = (Long) AbstractC6336.m11859(Long.TYPE, AbstractC8405.m13973("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜喵喵喵喵呜~喵喵喵喵喵喵喵呜"), message.msg);
        l.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(l);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(objCreateContact);
        QQNTSendMsgUtils.forwardMsg(arrayList, objCreateContact2, arrayList2);
    }

    public Activity getActivity() {
        return AbstractC3055.m6653();
    }

    public long getBKN(String str) {
        return Hook_cookie.getBkn(str);
    }

    public boolean getBoolean(String str, String str2, boolean z) {
        Object objM394 = new C0108(this.pluginLoader.getJavaPluginInfo().getPluginID(), str).m394(str2);
        if (objM394 instanceof Boolean) {
            return ((Boolean) objM394).booleanValue();
        }
        if (objM394 instanceof String) {
            try {
                return Boolean.parseBoolean((String) objM394);
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
        Object objM394 = new C0108(this.pluginLoader.getJavaPluginInfo().getPluginID(), str).m394(str2);
        if (objM394 instanceof Number) {
            return ((Number) objM394).doubleValue();
        }
        if (objM394 instanceof String) {
            try {
                return Double.parseDouble((String) objM394);
            } catch (Exception unused) {
            }
        }
        return d;
    }

    public float getFloat(String str, String str2, float f) {
        Object objM394 = new C0108(this.pluginLoader.getJavaPluginInfo().getPluginID(), str).m394(str2);
        if (objM394 instanceof Number) {
            return ((Number) objM394).floatValue();
        }
        if (objM394 instanceof String) {
            try {
                return Float.parseFloat((String) objM394);
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
        return C6385.f17548;
    }

    public String getGTK(String str) {
        return Hook_cookie.getG_TK(str);
    }

    public GroupInfo getGroupInfo(String str) {
        Object objM11587 = AbstractC6183.m11587(984);
        C9092 c9092M14672 = C9092.m14672(objM11587.getClass());
        c9092M14672.f25481 = AbstractC8405.m13972(1232);
        c9092M14672.m14675(String.class);
        Object objM14674 = c9092M14672.m14674(objM11587, str);
        GroupInfo groupInfo = new GroupInfo();
        groupInfo.GroupUin = (String) XposedHelpers.getObjectField(objM14674, AbstractC8405.m13972(1223));
        groupInfo.GroupName = (String) XposedHelpers.getObjectField(objM14674, AbstractC8405.m13972(1228));
        groupInfo.GroupOwner = (String) XposedHelpers.getObjectField(objM14674, AbstractC8405.m13972(1231));
        groupInfo.IsOwnerOrAdmin = AbstractC8837.m14502(objM14674);
        String str2 = (String) AbstractC6336.m11859(String.class, AbstractC8405.m13972(1230), objM14674);
        ArrayList<String> arrayList = new ArrayList<>();
        if (str2 != null) {
            for (String str3 : str2.split(AbstractC8405.m13973("喵喵呜喵呜呜呜呜~喵喵喵喵呜喵喵呜"))) {
                if (!TextUtils.isEmpty(str3)) {
                    arrayList.add(str3);
                }
            }
        } else {
            arrayList.addAll(AbstractC8837.m14503(str));
        }
        arrayList.add(groupInfo.GroupOwner);
        groupInfo.AdminList = arrayList;
        groupInfo.sourceInfo = objM14674;
        return groupInfo;
    }

    public ArrayList<GroupInfo> getGroupList() {
        return AbstractC6561.m12047();
    }

    public ArrayList<GroupMemberInfo> getGroupMemberList(String str) {
        return C8836.m14495(str);
    }

    public String getGroupRKey() {
        return C6385.f17549;
    }

    public int getInt(String str, String str2, int i) {
        Object objM394 = new C0108(this.pluginLoader.getJavaPluginInfo().getPluginID(), str).m394(str2);
        if (objM394 instanceof Number) {
            return ((Number) objM394).intValue();
        }
        if (objM394 instanceof String) {
            try {
                return Integer.parseInt((String) objM394);
            } catch (Exception unused) {
            }
        }
        return i;
    }

    public long getLong(String str, String str2, long j) {
        Object objM394 = new C0108(this.pluginLoader.getJavaPluginInfo().getPluginID(), str).m394(str2);
        if (objM394 instanceof Number) {
            return ((Number) objM394).longValue();
        }
        if (objM394 instanceof String) {
            try {
                return Long.parseLong((String) objM394);
            } catch (Exception unused) {
            }
        }
        return j;
    }

    public GroupMemberInfo getMemberInfo(String str, String str2) {
        C8836 c8836 = C8836.f24940;
        AbstractC8405.m13973("喵喵喵呜喵呜喵喵~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜呜喵呜~喵喵喵呜喵呜喵呜");
        str.getClass();
        AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵");
        str2.getClass();
        try {
            c8836.getClass();
            Object objM14496 = C8836.m14496(str, str2);
            if (objM14496 == null) {
                return null;
            }
            GroupMemberInfo groupMemberInfo = new GroupMemberInfo();
            groupMemberInfo.sourceInfo = objM14496;
            Object objectField = XposedHelpers.getObjectField(objM14496, AbstractC8405.m13972(2834));
            AbstractC8405.m13972(1954);
            objectField.getClass();
            groupMemberInfo.Join_Time = ((Long) objectField).longValue();
            Object objectField2 = XposedHelpers.getObjectField(objM14496, AbstractC8405.m13972(2835));
            AbstractC8405.m13972(1954);
            objectField2.getClass();
            groupMemberInfo.Last_AvtivityTime = ((Long) objectField2).longValue();
            Object objectField3 = XposedHelpers.getObjectField(objM14496, AbstractC8405.m13972(2836));
            AbstractC8405.m13972(1559);
            objectField3.getClass();
            groupMemberInfo.UserUin = (String) objectField3;
            try {
                Object objectField4 = XposedHelpers.getObjectField(objM14496, AbstractC8405.m13972(2837));
                AbstractC8405.m13972(1866);
                objectField4.getClass();
                groupMemberInfo.UserLevel = ((Integer) objectField4).intValue();
            } catch (Throwable unused) {
                Object objectField5 = XposedHelpers.getObjectField(objM14496, AbstractC8405.m13972(2838));
                AbstractC8405.m13972(1866);
                objectField5.getClass();
                groupMemberInfo.UserLevel = ((Integer) objectField5).intValue();
            }
            groupMemberInfo.NickName = C8836.m14493(objM14496);
            Object objectField6 = XposedHelpers.getObjectField(objM14496, AbstractC8405.m13972(2839));
            AbstractC8405.m13972(1559);
            objectField6.getClass();
            groupMemberInfo.UserName = (String) objectField6;
            Object objectField7 = XposedHelpers.getObjectField(objM14496, AbstractC8405.m13973("喵喵喵喵喵喵喵呜~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜呜喵~喵喵喵喵呜呜喵呜"));
            if (objectField7 == null) {
                objectField7 = AbstractC8405.m13973("喵喵呜呜呜呜呜喵~喵喵呜呜喵喵喵喵~喵喵呜呜喵呜呜呜~喵喵呜喵呜喵呜喵~喵喵呜喵喵喵喵喵~喵喵呜呜呜呜呜喵");
            }
            groupMemberInfo.IsOwner = AbstractC8405.m13973("喵喵呜呜呜呜喵喵~喵喵呜喵喵喵呜喵~喵喵呜呜喵呜喵喵~喵喵呜喵呜呜喵呜~喵喵呜呜喵呜呜呜").equals(objectField7.toString());
            groupMemberInfo.IsAdmin = AbstractC8405.m13973("喵喵呜呜喵喵呜喵~喵喵呜呜喵喵喵呜~喵喵呜呜喵呜呜呜~喵喵呜喵喵喵喵呜~喵喵呜喵呜喵呜呜").equals(objectField7.toString());
            return groupMemberInfo;
        } catch (Exception e) {
            String strM13972 = AbstractC8405.m13972(2833);
            String str3 = AbstractC6188.f17016;
            AbstractC6188.m11605(strM13972, e.toString(), e, true);
            return null;
        }
    }

    public String getMemberName(String str, String str2) {
        return C8836.m14492(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public List<MessageData> getMessageList(String str, String str2, int i) {
        C8686 c8686;
        Object objCreateContact = PluginSendMsgTool.createContact(str, str2);
        AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵呜喵喵~喵喵喵喵呜呜呜呜~喵喵喵呜喵呜喵呜");
        objCreateContact.getClass();
        try {
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Object objM14405 = AbstractC8684.m14405();
            if (objM14405 == null) {
                c8686 = new C8686(-1, AbstractC8405.m13972(2798), new ArrayList());
            } else {
                Object objM14406 = AbstractC8684.m14406(i, objCreateContact);
                Object objM14407 = AbstractC8684.m14407(new C8685(ref$ObjectRef, countDownLatch, 1));
                C6335 c6335M11854 = C6335.m11854(objM14405.getClass());
                c6335M11854.f17458.f3618 = AbstractC8405.m13972(2799);
                c6335M11854.f17458.f3619 = new Class[]{AbstractC6337.m11866(AbstractC8405.m13972(2800)), AbstractC6337.m11866(AbstractC8405.m13972(2801))};
                c6335M11854.m11856(objM14405, objM14406, objM14407);
                countDownLatch.await();
                c8686 = (C8686) ref$ObjectRef.element;
                if (c8686 == null) {
                    c8686 = new C8686(-1, AbstractC8405.m13972(2802), new ArrayList());
                }
            }
        } catch (Exception e) {
            String str3 = AbstractC8405.m13972(2803) + e.getMessage();
            String str4 = AbstractC6188.f17016;
            AbstractC6188.m11605(str3, e.toString(), e, true);
            c8686 = new C8686(-1, AbstractC8405.m13972(2804) + e.getMessage(), new ArrayList());
        }
        ArrayList arrayList = new ArrayList();
        PluginMessageCallbackAPI pluginMessageCallbackAPI = (PluginMessageCallbackAPI) AbstractC6309.f17424.get(PluginMessageCallbackAPI.class);
        for (Object obj : c8686.f24494) {
            if (!pluginMessageCallbackAPI.isGrayMessage(obj)) {
                arrayList.add(pluginMessageCallbackAPI.parseMessage(obj));
            }
        }
        return arrayList;
    }

    public NewFriendInfo getNewFriendInfo(String str) {
        C8808 c8808 = C8808.f24794;
        String uidFromUin = QQEnvTool.getUidFromUin(str);
        c8808.getClass();
        AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜呜呜呜喵");
        uidFromUin.getClass();
        try {
            Object objM14478 = C8808.m14478();
            if (objM14478 != null) {
                C6335 c6335M11854 = C6335.m11854(objM14478.getClass());
                String strM13972 = AbstractC8405.m13972(1601);
                C1245 c1245 = c6335M11854.f17458;
                c1245.f3618 = strM13972;
                c1245.f3619 = new Class[]{String.class, String.class};
                Object objM11856 = c6335M11854.m11856(objM14478, uidFromUin, AbstractC8405.m13972(1590));
                if (objM11856 != null) {
                    NewFriendInfo newFriendInfo = new NewFriendInfo();
                    Object objM11859 = AbstractC6336.m11859(String.class, AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵"), objM11856);
                    AbstractC8405.m13972(1588);
                    objM11859.getClass();
                    Object objM118592 = AbstractC6336.m11859(String.class, AbstractC8405.m13973("喵喵喵呜呜呜喵呜~喵喵喵呜呜呜喵喵~喵喵喵呜呜喵喵呜~喵喵喵喵喵喵呜呜"), objM11856);
                    AbstractC8405.m13972(1588);
                    objM118592.getClass();
                    Object objM118593 = AbstractC6336.m11859(String.class, AbstractC8405.m13973("喵喵喵喵喵喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜喵喵呜~喵喵喵呜喵呜呜呜~喵喵喵喵喵呜呜呜"), objM11856);
                    AbstractC8405.m13972(1588);
                    objM118593.getClass();
                    String strM13973 = AbstractC8405.m13973("喵喵喵呜喵喵呜喵~喵喵喵呜喵喵呜喵~喵喵喵呜呜呜呜呜");
                    Class cls = Integer.TYPE;
                    Object objM118594 = AbstractC6336.m11859(cls, strM13973, objM11856);
                    AbstractC8405.m13972(1588);
                    objM118594.getClass();
                    int iIntValue = ((Number) objM118594).intValue();
                    Object objM118595 = AbstractC6336.m11859(cls, AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵呜喵"), objM11856);
                    AbstractC8405.m13972(1588);
                    objM118595.getClass();
                    int iIntValue2 = ((Number) objM118595).intValue();
                    newFriendInfo.uin = (String) objM11859;
                    newFriendInfo.nickname = (String) objM118592;
                    newFriendInfo.remark = (String) objM118593;
                    newFriendInfo.age = iIntValue;
                    newFriendInfo.sex = iIntValue2;
                    return newFriendInfo;
                }
            }
            return null;
        } catch (Exception e) {
            String strM139722 = AbstractC8405.m13972(623);
            String str2 = AbstractC6188.f17016;
            AbstractC6188.m11605(strM139722, e.toString(), e, true);
            return null;
        }
    }

    public List<NewFriendInfo> getNewFriendList() {
        C8808.f24794.getClass();
        return C8808.m14477();
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
        return "";
    }

    public void httpDownload(String str, String str2, Map<String, String> map) {
        String strResolvePath = resolvePath(str2);
        int i = AbstractC6370.f17526;
        File file = new File(strResolvePath);
        if (!file.exists()) {
            file.getParentFile().mkdirs();
        }
        C6127 c6127 = new C6127(new C6143());
        C1245 c1245 = new C1245(6);
        c1245.m2151(str);
        c1245.f3618 = C6151.m11548(map).m11549();
        try {
            C6131 c6131M11634 = new C6203(c6127, new C6125(c1245)).m11634();
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(c6131M11634.f16770.m11518());
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int i2 = bufferedInputStream.read(bArr);
                            if (i2 == -1) {
                                bufferedInputStream.close();
                                bufferedOutputStream.close();
                                c6131M11634.close();
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
            throw new RuntimeException(AbstractC8405.m13972(30) + str + AbstractC8405.m13972(31) + strResolvePath, e);
        }
    }

    public String httpGet(String str, Map<String, String> map) {
        int i = AbstractC6370.f17526;
        try {
            C6127 c6127 = new C6127(new C6143());
            C1245 c1245 = new C1245(6);
            c1245.m2151(str);
            c1245.f3618 = C6151.m11548(map).m11549();
            c1245.m2158("GET", null);
            C6131 c6131M11634 = new C6203(c6127, new C6125(c1245)).m11634();
            String strM11519 = c6131M11634.f16770.m11519();
            c6131M11634.close();
            return strM11519;
        } catch (IOException e) {
            String strM13973 = AbstractC8405.m13973("喵喵喵呜呜喵呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜呜呜喵~喵喵喵呜呜喵喵喵");
            String str2 = AbstractC6188.f17016;
            AbstractC6188.m11605(strM13973, e.toString(), e, true);
            return "";
        }
    }

    public String httpPost(String str, Map<String, String> map) {
        int i = AbstractC6370.f17526;
        try {
            C6127 c6127 = new C6127(new C6143());
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                key.getClass();
                value.getClass();
                arrayList.add(AbstractC6089.m11447(key, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
                arrayList2.add(AbstractC6089.m11447(value, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
            }
            C1245 c1245 = new C1245(6);
            c1245.m2151(str);
            c1245.m2166(AbstractC8405.m13972(25), AbstractC8405.m13972(29));
            c1245.m2166(AbstractC8405.m13973("喵喵呜呜喵喵呜喵~喵喵喵呜喵呜呜喵~喵喵喵呜呜喵喵呜~喵喵喵喵呜呜喵呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜喵喵喵"), AbstractC8405.m13973("喵呜喵呜呜喵喵呜~喵呜喵呜呜喵呜喵~喵呜喵呜喵喵喵喵"));
            c1245.m2166(AbstractC8405.m13972(27), AbstractC8405.m13972(28));
            c1245.m2158("POST", new C6147(arrayList, arrayList2));
            C6131 c6131M11634 = new C6203(c6127, new C6125(c1245)).m11634();
            String strM11519 = c6131M11634.f16770.m11519();
            c6131M11634.close();
            return strM11519;
        } catch (IOException e) {
            String strM13973 = AbstractC8405.m13973("喵喵喵呜呜喵呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜呜呜喵~喵喵喵呜呜喵喵喵");
            String str2 = AbstractC6188.f17016;
            AbstractC6188.m11605(strM13973, e.toString(), e, true);
            return "";
        }
    }

    public String httpPostJson(String str, String str2) {
        return AbstractC6370.m11953(str, str2, null);
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
        ClassLoader classLoader2 = AbstractC6337.f17461;
        ConcurrentHashMap concurrentHashMap = AbstractC7530.f20407;
        String strM1165 = AbstractC0455.m1165(strResolvePath);
        if (strM1165 == null) {
            classLoader = null;
        } else {
            classLoader = (ClassLoader) AbstractC7530.f20406.computeIfAbsent(AbstractC7530.m12755(classLoader2, "aar", strM1165), new C7531(strResolvePath, 2, classLoader2));
        }
        this.pluginLoader.addClassLoader(classLoader);
        return classLoader;
    }

    public ClassLoader loadDex(String str) {
        ClassLoader classLoader;
        String strResolvePath = resolvePath(str);
        ClassLoader classLoader2 = AbstractC6337.f17461;
        ConcurrentHashMap concurrentHashMap = AbstractC7530.f20407;
        String strM1165 = AbstractC0455.m1165(strResolvePath);
        if (strM1165 == null) {
            classLoader = null;
        } else {
            classLoader = (ClassLoader) AbstractC7530.f20406.computeIfAbsent(AbstractC7530.m12755(classLoader2, "dex", strM1165), new C7531(strResolvePath, 1, classLoader2));
        }
        this.pluginLoader.addClassLoader(classLoader);
        return classLoader;
    }

    public ClassLoader loadJar(String str) {
        ClassLoader classLoader;
        String strResolvePath = resolvePath(str);
        ClassLoader classLoader2 = AbstractC6337.f17461;
        ConcurrentHashMap concurrentHashMap = AbstractC7530.f20407;
        String strM1165 = AbstractC0455.m1165(strResolvePath);
        if (strM1165 == null) {
            classLoader = null;
        } else {
            classLoader = (ClassLoader) AbstractC7530.f20406.computeIfAbsent(AbstractC7530.m12755(classLoader2, "jar", strM1165), new C7531(strResolvePath, 0, classLoader2));
        }
        this.pluginLoader.addClassLoader(classLoader);
        return classLoader;
    }

    public void log(Object obj) {
        this.errorOutput.log(obj);
    }

    public void putBoolean(String str, String str2, boolean z) {
        C0108 c0108 = new C0108(this.pluginLoader.getJavaPluginInfo().getPluginID(), str);
        c0108.m372(Boolean.valueOf(z), str2);
        c0108.m359();
    }

    public void putDouble(String str, String str2, double d) {
        new C0108(this.pluginLoader.getJavaPluginInfo().getPluginID(), str).m372(Double.valueOf(d), str2);
    }

    public void putFloat(String str, String str2, float f) {
        new C0108(this.pluginLoader.getJavaPluginInfo().getPluginID(), str).m372(Float.valueOf(f), str2);
    }

    public void putInt(String str, String str2, int i) {
        C0108 c0108 = new C0108(this.pluginLoader.getJavaPluginInfo().getPluginID(), str);
        c0108.m372(Integer.valueOf(i), str2);
        c0108.m359();
    }

    public void putLong(String str, String str2, long j) {
        C0108 c0108 = new C0108(this.pluginLoader.getJavaPluginInfo().getPluginID(), str);
        c0108.m372(Long.valueOf(j), str2);
        c0108.m359();
    }

    public void putString(String str, String str2, String str3) {
        C0108 c0108 = new C0108(this.pluginLoader.getJavaPluginInfo().getPluginID(), str);
        c0108.m372(str3, str2);
        c0108.m359();
    }

    public byte[] readFileBytes(String str) {
        return AbstractC5062.m10029(new File(resolvePath(str)));
    }

    public String readFileText(String str) {
        return AbstractC5062.m10028(resolvePath(str));
    }

    public void removeItem(String str, String str2) {
        this.pluginLoader.dialogItemMap.remove(str2);
    }

    public void removeItemByName(String str) {
        this.pluginLoader.dialogItemMap.remove(str);
    }

    public void replyEmoji(Object obj, int i, String str) {
        MessageData message = obj instanceof MessageData ? (MessageData) obj : ((PluginMessageCallbackAPI) AbstractC6309.f17424.get(PluginMessageCallbackAPI.class)).parseMessage(obj);
        if (!message.IsGroup) {
            C5925.m11310(AbstractC8405.m13972(603));
            return;
        }
        String str2 = message.GroupUin;
        try {
            if (obj instanceof MessageData) {
                obj = message.msg;
            }
            AbstractC6347.m11926(str2, ((Long) AbstractC6336.m11859(Long.TYPE, AbstractC8405.m13973("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜呜呜喵呜呜~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜喵呜"), obj)).longValue(), str, i);
        } catch (Exception e) {
            this.errorOutput.e(e);
        }
    }

    public void revokeMsg(Object obj) {
        MessageData message = obj instanceof MessageData ? (MessageData) obj : ((PluginMessageCallbackAPI) AbstractC6309.f17424.get(PluginMessageCallbackAPI.class)).parseMessage(obj);
        Object groupContact = message.IsGroup ? QQSessionUtils.QQNT.getGroupContact(message.GroupUin) : QQSessionUtils.QQNT.getFriendContact(message.UserUin);
        try {
            if (obj instanceof MessageData) {
                obj = message.msg;
            }
            QQMsgService.recallMsg(groupContact, ((Long) AbstractC6336.m11859(Long.TYPE, AbstractC8405.m13973("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜喵喵喵喵呜~喵喵喵喵喵喵喵呜"), obj)).longValue());
        } catch (Exception e) {
            this.errorOutput.e(e);
        }
    }

    public String scanImageText(String str) {
        try {
            return C8864.m14529(resolvePath(str));
        } catch (Exception e) {
            this.errorOutput.e(e);
            return "";
        }
    }

    public List<OcrText> scanImageTextDetail(String str) {
        try {
            return C8864.m14528(resolvePath(str));
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
            Object objCallMethod = XposedHelpers.callMethod(QQEnvTool.getAppRuntime(), AbstractC8405.m13972(602), new Class[]{String.class}, new Object[]{(String) AbstractC6336.m11857(AbstractC6337.m11866(AbstractC8405.m13972(600)), String.class, AbstractC8405.m13972(601))});
            int i2 = AbstractC6358.f17508;
            Class cls = Void.TYPE;
            Class cls2 = Integer.TYPE;
            if (i2 >= 13350) {
                C9092 c9092M14672 = C9092.m14672(objCallMethod.getClass());
                c9092M14672.m14675(String.class, String.class, cls2);
                c9092M14672.f25483 = cls;
                c9092M14672.m14676(objCallMethod, str2, str, Integer.valueOf(i));
                return;
            }
            if (i2 >= 12290) {
                C9092 c9092M146722 = C9092.m14672(objCallMethod.getClass());
                c9092M146722.m14675(cls2, String.class, String.class);
                c9092M146722.f25483 = cls;
                c9092M146722.m14676(objCallMethod, Integer.valueOf(i), str2, str);
                return;
            }
            C9092 c9092M146723 = C9092.m14672(objCallMethod.getClass());
            c9092M146723.m14675(String.class, String.class, cls2);
            c9092M146723.f25483 = cls;
            c9092M146723.m14676(objCallMethod, str2, str, Integer.valueOf(i));
        } catch (Exception e) {
            this.errorOutput.e(e);
        }
    }

    public void sendPic(String str, String str2, String str3) {
        QQNTSendMsgUtils.sendPic(PluginSendMsgTool.createContact(str, str2), resolvePath(str3));
    }

    public void sendProto(String str, String str2) {
        try {
            JSONObject jSONObjectM6374 = InterfaceC2916.m6374(str2);
            C6189 c6189 = new C6189();
            c6189.m11612(jSONObjectM6374);
            AbstractC0455.m1152(str, c6189.m11610());
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
            Object objCreateReplyElement = CreateElement.createReplyElement(((Long) AbstractC6336.m11859(Long.TYPE, AbstractC8405.m13973("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜喵喵喵喵呜~喵喵喵喵喵喵喵呜"), obj)).longValue());
            ArrayList<Object> compoundMessages = PluginSendMsgTool.parseCompoundMessages(str, str2);
            compoundMessages.add(0, objCreateReplyElement);
            QQNTSendMsgUtils.sendMsg(groupContact, compoundMessages);
        } catch (Exception e) {
            this.errorOutput.e(e);
        }
    }

    public void sendSticker(String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str4)) {
            str4 = AbstractC8405.m13972(364);
        }
        Object objCreateContact = PluginSendMsgTool.createContact(str, str2);
        Object objCreateEmojiElement = CreateElement.createEmojiElement(resolvePath(str3));
        Object objM14663 = C9086.m14663(AbstractC6337.m11866(AbstractC8405.m13972(178)), AbstractC8405.m13972(282), objCreateEmojiElement);
        C9086.m14664(objM14663, AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵喵呜喵呜~喵喵喵喵喵呜喵喵~喵喵喵呜呜呜呜喵~喵喵喵呜呜喵喵喵"), str4);
        C9086.m14664(objM14663, AbstractC8405.m13972(141), 0);
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
        InterfaceC5184 interfaceC5184 = AbstractC8835.f24937;
        AbstractC8405.m13973("喵喵喵喵喵呜呜呜~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜喵呜~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜喵呜");
        str.getClass();
        AbstractC8405.m13973("喵喵喵呜呜呜呜喵~喵喵喵呜喵喵喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜喵呜喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
        str2.getClass();
        AbstractC8405.m13973("喵喵喵呜呜呜喵呜~喵喵喵呜呜呜喵喵~喵喵喵呜呜喵喵呜~喵喵喵喵喵喵呜呜");
        str3.getClass();
        Object appRuntime = QQEnvTool.getAppRuntime();
        appRuntime.getClass();
        Object objM6837 = AbstractC3065.m6837(appRuntime, AbstractC8405.m13972(602), (String) AbstractC8835.f24937.getValue());
        Class clsM14669 = AbstractC9090.m14669(AbstractC8405.m13972(2852));
        clsM14669.getClass();
        Object objM14667 = C9088.m14667(clsM14669, new Object[0]);
        objM14667.getClass();
        AbstractC3065.m6805(objM14667, AbstractC8405.m13973("喵喵喵呜呜呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜呜喵呜"), str3);
        AbstractC3065.m6805(objM14667, AbstractC8405.m13972(2836), str2);
        AbstractC3065.m6805(objM14667, AbstractC8405.m13972(1223), str);
        ArrayList arrayListM11912 = AbstractC6347.m11912(objM14667);
        ArrayList arrayListM119122 = AbstractC6347.m11912(1);
        C9092 c9092M14671 = C9092.m14671(objM6837);
        c9092M14671.m14675(String.class, ArrayList.class, ArrayList.class);
        c9092M14671.m14676(objM6837, str, arrayListM11912, arrayListM119122);
    }

    public void setTitle(String str, String str2, String str3) {
        C8836 c8836 = C8836.f24940;
        AbstractC8405.m13973("喵喵喵喵喵呜呜呜~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜喵呜~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜喵呜");
        str.getClass();
        AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵");
        str2.getClass();
        AbstractC8405.m13973("喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵喵呜喵喵~喵喵喵喵喵喵喵喵");
        str3.getClass();
        try {
            if (AbstractC6358.f17508 < 12290) {
                QQNTTroopTool.setGroupMemberTitle(str, str2, str3);
                return;
            }
            Object runtimeService = QQEnvTool.getRuntimeService(AbstractC9090.m14669(AbstractC8405.m13972(2845)), "");
            C9092 c9092M14671 = C9092.m14671(runtimeService);
            c9092M14671.f25481 = AbstractC8405.m13972(2846);
            c9092M14671.f25483 = String.class;
            c9092M14671.m14675(String.class, String.class);
            Object objM14676 = c9092M14671.m14676(runtimeService, str, str2);
            AbstractC8405.m13972(1559);
            objM14676.getClass();
            C6189 c6189 = new C6189();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(AbstractC8405.m13973("喵呜喵喵喵喵呜喵"), 2300);
            jSONObject.put(AbstractC8405.m13973("喵呜喵喵喵喵喵呜"), 2);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(AbstractC8405.m13973("喵呜喵喵喵喵呜喵"), Long.valueOf(Long.parseLong(str)));
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(AbstractC8405.m13973("喵呜喵喵喵喵呜喵"), Long.valueOf(Long.parseLong(str2)));
            jSONObject3.put(AbstractC8405.m13973("喵呜喵喵喵呜呜喵"), str3);
            jSONObject3.put(AbstractC8405.m13973("喵呜喵喵喵呜喵呜"), 4294967295L);
            jSONObject3.put(AbstractC8405.m13973("喵呜喵喵喵呜喵喵"), (String) objM14676);
            jSONObject2.put(AbstractC8405.m13973("喵呜喵喵喵喵喵喵"), jSONObject3);
            jSONObject.put(AbstractC8405.m13973("喵呜喵喵喵呜呜呜"), jSONObject2);
            c6189.m11612(jSONObject);
            String strM13972 = AbstractC8405.m13972(2847);
            byte[] bArrM11610 = c6189.m11610();
            AbstractC8405.m13972(2848);
            bArrM11610.getClass();
            AbstractC0455.m1152(strM13972, bArrM11610);
        } catch (Exception e) {
            String strM139722 = AbstractC8405.m13972(2833);
            String str4 = AbstractC6188.f17016;
            AbstractC6188.m11605(strM139722, e.toString(), e, true);
        }
    }

    public void toast(Object obj) {
        AbstractC6185.m11592(obj);
    }

    public void writeBytesToFile(String str, byte[] bArr) {
        AbstractC5062.m10011(resolvePath(str), bArr);
    }

    public void writeTextAppendToFile(String str, String str2) {
        AbstractC5062.m10056(resolvePath(str), str2, true);
    }

    public void writeTextToFile(String str, String str2) {
        AbstractC5062.m10056(resolvePath(str), str2, false);
    }

    public String httpPostJson(String str, Map<String, String> map, String str2) {
        return AbstractC6370.m11953(str, str2, map);
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
        return (String) new C0108(this.pluginLoader.getJavaPluginInfo().getPluginID(), str).m394(str2);
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
        return AbstractC6370.m11950(str);
    }

    @Deprecated(since = "发送表情 参数三为表情id")
    public void sendAntEmo(String str, String str2, int i) {
    }

    @Deprecated(since = "弃用了")
    public void sendShow(String str, String str2, int i) {
    }

    public void httpDownload(String str, String str2) {
        AbstractC6370.m11952(str, resolvePath(str2));
    }

    public String httpPost(String str, Map<String, String> map, Map<String, String> map2) {
        int i = AbstractC6370.f17526;
        try {
            C6127 c6127 = new C6127(new C6143());
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                key.getClass();
                value.getClass();
                arrayList.add(AbstractC6089.m11447(key, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
                arrayList2.add(AbstractC6089.m11447(value, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
            }
            C1245 c1245 = new C1245(6);
            c1245.m2151(str);
            c1245.f3618 = C6151.m11548(map).m11549();
            c1245.m2158("POST", new C6147(arrayList, arrayList2));
            C6131 c6131M11634 = new C6203(c6127, new C6125(c1245)).m11634();
            String strM11519 = c6131M11634.f16770.m11519();
            c6131M11634.close();
            return strM11519;
        } catch (IOException e) {
            String strM13973 = AbstractC8405.m13973("喵喵喵呜呜喵呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜呜呜喵~喵喵喵呜呜喵喵喵");
            String str2 = AbstractC6188.f17016;
            AbstractC6188.m11605(strM13973, e.toString(), e, true);
            return "";
        }
    }
}
