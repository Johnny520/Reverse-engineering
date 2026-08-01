package lin.xposed.hook.javaplugin.api;

import android.app.Activity;
import android.text.TextUtils;
import androidx.appcompat.app.C0955;
import androidx.compose.foundation.draganddrop.AbstractC1298;
import androidx.compose.runtime.internal.C2080;
import com.alibaba.fastjson2.InterfaceC3749;
import com.alibaba.fastjson2.JSONObject;
import com.bumptech.glide.AbstractC3887;
import com.bumptech.glide.AbstractC3897;
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
import kotlin.InterfaceC6016;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.jvm.internal.AbstractC5894;
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
import lin.xposed.hook.util.p011qq.CreateElement;
import lin.xposed.hook.util.p011qq.Hook_cookie;
import lin.xposed.hook.util.p011qq.QQEnvTool;
import lin.xposed.hook.util.p011qq.QQFriendTool;
import lin.xposed.hook.util.p011qq.QQMsgService;
import lin.xposed.hook.util.p011qq.QQNTSendMsgUtils;
import lin.xposed.hook.util.p011qq.QQNTTroopTool;
import lin.xposed.hook.util.p011qq.QQSessionUtils;
import p019.AbstractC6918;
import p023.C6954;
import p023.C6956;
import p023.C6960;
import p023.C6972;
import p023.C6976;
import p023.C6980;
import p025.AbstractC7012;
import p026.AbstractC7014;
import p026.AbstractC7017;
import p026.C7018;
import p027.C7032;
import p040.AbstractC7138;
import p049.AbstractC7165;
import p049.AbstractC7166;
import p049.C7164;
import p050.AbstractC7176;
import p052.AbstractC7187;
import p053.AbstractC7199;
import p054.C7214;
import p069.AbstractC7390;
import p154.AbstractC8359;
import p154.C8360;
import p303.AbstractC9234;
import p336.AbstractC9513;
import p336.C9514;
import p336.C9515;
import p355.C9637;
import p362.AbstractC9664;
import p362.AbstractC9666;
import p362.C9665;
import p368.C9693;
import p405.AbstractC9919;
import p405.C9915;
import p405.C9917;
import p405.C9921;
import top.suzhelan.qstory.hook.item.C6755;
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
        MessageData message = obj instanceof MessageData ? (MessageData) obj : ((PluginMessageCallbackAPI) AbstractC7138.f17769.get(PluginMessageCallbackAPI.class)).parseMessage(obj);
        Object groupContact = message.IsGroup ? QQSessionUtils.QQNT.getGroupContact(message.GroupUin) : QQSessionUtils.QQNT.getFriendContact(message.UserUin);
        try {
            if (obj instanceof MessageData) {
                obj = message.msg;
            }
            Long l = (Long) AbstractC7165.m12418(Long.TYPE, AbstractC9234.m14532("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜喵喵喵喵呜~喵喵喵喵喵喵喵呜"), obj);
            l.getClass();
            ArrayList arrayList = new ArrayList();
            arrayList.add(l);
            QQMsgService.deleteMsg(groupContact, arrayList);
        } catch (Exception e) {
            this.errorOutput.m157e(e);
        }
    }

    public void error(Throwable th) {
        this.errorOutput.m157e(th);
    }

    public void eval(String str) {
        try {
            this.pluginLoader.eval(str);
        } catch (Exception e) {
            this.errorOutput.m157e(e);
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
        MessageData message = obj instanceof MessageData ? (MessageData) obj : ((PluginMessageCallbackAPI) AbstractC7138.f17769.get(PluginMessageCallbackAPI.class)).parseMessage(obj);
        Object objCreateContact2 = PluginSendMsgTool.createContact(message.GroupUin, message.UserUin);
        Long l = (Long) AbstractC7165.m12418(Long.TYPE, AbstractC9234.m14532("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜喵喵喵喵呜~喵喵喵喵喵喵喵呜"), message.msg);
        l.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(l);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(objCreateContact);
        QQNTSendMsgUtils.forwardMsg(arrayList, objCreateContact2, arrayList2);
    }

    public Activity getActivity() {
        return AbstractC3887.m7213();
    }

    public long getBKN(String str) {
        return Hook_cookie.getBkn(str);
    }

    public boolean getBoolean(String str, String str2, boolean z) {
        Object objM954 = new C0955(this.pluginLoader.getJavaPluginInfo().getPluginID(), str).m954(str2);
        if (objM954 instanceof Boolean) {
            return ((Boolean) objM954).booleanValue();
        }
        if (objM954 instanceof String) {
            try {
                return Boolean.parseBoolean((String) objM954);
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
        Object objM954 = new C0955(this.pluginLoader.getJavaPluginInfo().getPluginID(), str).m954(str2);
        if (objM954 instanceof Number) {
            return ((Number) objM954).doubleValue();
        }
        if (objM954 instanceof String) {
            try {
                return Double.parseDouble((String) objM954);
            } catch (Exception unused) {
            }
        }
        return d;
    }

    public float getFloat(String str, String str2, float f) {
        Object objM954 = new C0955(this.pluginLoader.getJavaPluginInfo().getPluginID(), str).m954(str2);
        if (objM954 instanceof Number) {
            return ((Number) objM954).floatValue();
        }
        if (objM954 instanceof String) {
            try {
                return Float.parseFloat((String) objM954);
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
        return C7214.f17893;
    }

    public String getGTK(String str) {
        return Hook_cookie.getG_TK(str);
    }

    public GroupInfo getGroupInfo(String str) {
        Object objM12146 = AbstractC7012.m12146(984);
        C9921 c9921M15231 = C9921.m15231(objM12146.getClass());
        c9921M15231.f25826 = AbstractC9234.m14531(1232);
        c9921M15231.m15234(String.class);
        Object objM15233 = c9921M15231.m15233(objM12146, str);
        GroupInfo groupInfo = new GroupInfo();
        groupInfo.GroupUin = (String) XposedHelpers.getObjectField(objM15233, AbstractC9234.m14531(1223));
        groupInfo.GroupName = (String) XposedHelpers.getObjectField(objM15233, AbstractC9234.m14531(1228));
        groupInfo.GroupOwner = (String) XposedHelpers.getObjectField(objM15233, AbstractC9234.m14531(1231));
        groupInfo.IsOwnerOrAdmin = AbstractC9666.m15061(objM15233);
        String str2 = (String) AbstractC7165.m12418(String.class, AbstractC9234.m14531(1230), objM15233);
        ArrayList<String> arrayList = new ArrayList<>();
        if (str2 != null) {
            for (String str3 : str2.split(AbstractC9234.m14532("喵喵呜喵呜呜呜呜~喵喵喵喵呜喵喵呜"))) {
                if (!TextUtils.isEmpty(str3)) {
                    arrayList.add(str3);
                }
            }
        } else {
            arrayList.addAll(AbstractC9666.m15062(str));
        }
        arrayList.add(groupInfo.GroupOwner);
        groupInfo.AdminList = arrayList;
        groupInfo.sourceInfo = objM15233;
        return groupInfo;
    }

    public ArrayList<GroupInfo> getGroupList() {
        return AbstractC7390.m12606();
    }

    public ArrayList<GroupMemberInfo> getGroupMemberList(String str) {
        return C9665.m15054(str);
    }

    public String getGroupRKey() {
        return C7214.f17894;
    }

    public int getInt(String str, String str2, int i) {
        Object objM954 = new C0955(this.pluginLoader.getJavaPluginInfo().getPluginID(), str).m954(str2);
        if (objM954 instanceof Number) {
            return ((Number) objM954).intValue();
        }
        if (objM954 instanceof String) {
            try {
                return Integer.parseInt((String) objM954);
            } catch (Exception unused) {
            }
        }
        return i;
    }

    public long getLong(String str, String str2, long j) {
        Object objM954 = new C0955(this.pluginLoader.getJavaPluginInfo().getPluginID(), str).m954(str2);
        if (objM954 instanceof Number) {
            return ((Number) objM954).longValue();
        }
        if (objM954 instanceof String) {
            try {
                return Long.parseLong((String) objM954);
            } catch (Exception unused) {
            }
        }
        return j;
    }

    public GroupMemberInfo getMemberInfo(String str, String str2) {
        C9665 c9665 = C9665.f25285;
        AbstractC9234.m14532("喵喵喵呜喵呜喵喵~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜呜喵呜~喵喵喵呜喵呜喵呜");
        str.getClass();
        AbstractC9234.m14532("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵");
        str2.getClass();
        try {
            c9665.getClass();
            Object objM15055 = C9665.m15055(str, str2);
            if (objM15055 == null) {
                return null;
            }
            GroupMemberInfo groupMemberInfo = new GroupMemberInfo();
            groupMemberInfo.sourceInfo = objM15055;
            Object objectField = XposedHelpers.getObjectField(objM15055, AbstractC9234.m14531(2834));
            AbstractC9234.m14531(1954);
            objectField.getClass();
            groupMemberInfo.Join_Time = ((Long) objectField).longValue();
            Object objectField2 = XposedHelpers.getObjectField(objM15055, AbstractC9234.m14531(2835));
            AbstractC9234.m14531(1954);
            objectField2.getClass();
            groupMemberInfo.Last_AvtivityTime = ((Long) objectField2).longValue();
            Object objectField3 = XposedHelpers.getObjectField(objM15055, AbstractC9234.m14531(2836));
            AbstractC9234.m14531(1559);
            objectField3.getClass();
            groupMemberInfo.UserUin = (String) objectField3;
            try {
                Object objectField4 = XposedHelpers.getObjectField(objM15055, AbstractC9234.m14531(2837));
                AbstractC9234.m14531(1866);
                objectField4.getClass();
                groupMemberInfo.UserLevel = ((Integer) objectField4).intValue();
            } catch (Throwable unused) {
                Object objectField5 = XposedHelpers.getObjectField(objM15055, AbstractC9234.m14531(2838));
                AbstractC9234.m14531(1866);
                objectField5.getClass();
                groupMemberInfo.UserLevel = ((Integer) objectField5).intValue();
            }
            groupMemberInfo.NickName = C9665.m15052(objM15055);
            Object objectField6 = XposedHelpers.getObjectField(objM15055, AbstractC9234.m14531(2839));
            AbstractC9234.m14531(1559);
            objectField6.getClass();
            groupMemberInfo.UserName = (String) objectField6;
            Object objectField7 = XposedHelpers.getObjectField(objM15055, AbstractC9234.m14532("喵喵喵喵喵喵喵呜~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜呜喵~喵喵喵喵呜呜喵呜"));
            if (objectField7 == null) {
                objectField7 = AbstractC9234.m14532("喵喵呜呜呜呜呜喵~喵喵呜呜喵喵喵喵~喵喵呜呜喵呜呜呜~喵喵呜喵呜喵呜喵~喵喵呜喵喵喵喵喵~喵喵呜呜呜呜呜喵");
            }
            groupMemberInfo.IsOwner = AbstractC9234.m14532("喵喵呜呜呜呜喵喵~喵喵呜喵喵喵呜喵~喵喵呜呜喵呜喵喵~喵喵呜喵呜呜喵呜~喵喵呜呜喵呜呜呜").equals(objectField7.toString());
            groupMemberInfo.IsAdmin = AbstractC9234.m14532("喵喵呜呜喵喵呜喵~喵喵呜呜喵喵喵呜~喵喵呜呜喵呜呜呜~喵喵呜喵喵喵喵呜~喵喵呜喵呜喵呜呜").equals(objectField7.toString());
            return groupMemberInfo;
        } catch (Exception e) {
            String strM14531 = AbstractC9234.m14531(2833);
            String str3 = AbstractC7017.f17361;
            AbstractC7017.m12164(strM14531, e.toString(), e, true);
            return null;
        }
    }

    public String getMemberName(String str, String str2) {
        return C9665.m15051(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public List<MessageData> getMessageList(String str, String str2, int i) {
        C9515 c9515;
        Object objCreateContact = PluginSendMsgTool.createContact(str, str2);
        AbstractC9234.m14532("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵呜喵喵~喵喵喵喵呜呜呜呜~喵喵喵呜喵呜喵呜");
        objCreateContact.getClass();
        try {
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Object objM14964 = AbstractC9513.m14964();
            if (objM14964 == null) {
                c9515 = new C9515(-1, AbstractC9234.m14531(2798), new ArrayList());
            } else {
                Object objM14965 = AbstractC9513.m14965(i, objCreateContact);
                Object objM14966 = AbstractC9513.m14966(new C9514(ref$ObjectRef, countDownLatch, 1));
                C7164 c7164M12413 = C7164.m12413(objM14964.getClass());
                c7164M12413.f17803.f3963 = AbstractC9234.m14531(2799);
                c7164M12413.f17803.f3964 = new Class[]{AbstractC7166.m12425(AbstractC9234.m14531(2800)), AbstractC7166.m12425(AbstractC9234.m14531(2801))};
                c7164M12413.m12415(objM14964, objM14965, objM14966);
                countDownLatch.await();
                c9515 = (C9515) ref$ObjectRef.element;
                if (c9515 == null) {
                    c9515 = new C9515(-1, AbstractC9234.m14531(2802), new ArrayList());
                }
            }
        } catch (Exception e) {
            String str3 = AbstractC9234.m14531(2803) + e.getMessage();
            String str4 = AbstractC7017.f17361;
            AbstractC7017.m12164(str3, e.toString(), e, true);
            c9515 = new C9515(-1, AbstractC9234.m14531(2804) + e.getMessage(), new ArrayList());
        }
        ArrayList arrayList = new ArrayList();
        PluginMessageCallbackAPI pluginMessageCallbackAPI = (PluginMessageCallbackAPI) AbstractC7138.f17769.get(PluginMessageCallbackAPI.class);
        for (Object obj : c9515.f24839) {
            if (!pluginMessageCallbackAPI.isGrayMessage(obj)) {
                arrayList.add(pluginMessageCallbackAPI.parseMessage(obj));
            }
        }
        return arrayList;
    }

    public NewFriendInfo getNewFriendInfo(String str) {
        C9637 c9637 = C9637.f25139;
        String uidFromUin = QQEnvTool.getUidFromUin(str);
        c9637.getClass();
        AbstractC9234.m14532("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜呜呜呜喵");
        uidFromUin.getClass();
        try {
            Object objM15037 = C9637.m15037();
            if (objM15037 != null) {
                C7164 c7164M12413 = C7164.m12413(objM15037.getClass());
                String strM14531 = AbstractC9234.m14531(1601);
                C2080 c2080 = c7164M12413.f17803;
                c2080.f3963 = strM14531;
                c2080.f3964 = new Class[]{String.class, String.class};
                Object objM12415 = c7164M12413.m12415(objM15037, uidFromUin, AbstractC9234.m14531(1590));
                if (objM12415 != null) {
                    NewFriendInfo newFriendInfo = new NewFriendInfo();
                    Object objM12418 = AbstractC7165.m12418(String.class, AbstractC9234.m14532("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵"), objM12415);
                    AbstractC9234.m14531(1588);
                    objM12418.getClass();
                    Object objM124182 = AbstractC7165.m12418(String.class, AbstractC9234.m14532("喵喵喵呜呜呜喵呜~喵喵喵呜呜呜喵喵~喵喵喵呜呜喵喵呜~喵喵喵喵喵喵呜呜"), objM12415);
                    AbstractC9234.m14531(1588);
                    objM124182.getClass();
                    Object objM124183 = AbstractC7165.m12418(String.class, AbstractC9234.m14532("喵喵喵喵喵喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜喵喵呜~喵喵喵呜喵呜呜呜~喵喵喵喵喵呜呜呜"), objM12415);
                    AbstractC9234.m14531(1588);
                    objM124183.getClass();
                    String strM14532 = AbstractC9234.m14532("喵喵喵呜喵喵呜喵~喵喵喵呜喵喵呜喵~喵喵喵呜呜呜呜呜");
                    Class cls = Integer.TYPE;
                    Object objM124184 = AbstractC7165.m12418(cls, strM14532, objM12415);
                    AbstractC9234.m14531(1588);
                    objM124184.getClass();
                    int iIntValue = ((Number) objM124184).intValue();
                    Object objM124185 = AbstractC7165.m12418(cls, AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵呜喵"), objM12415);
                    AbstractC9234.m14531(1588);
                    objM124185.getClass();
                    int iIntValue2 = ((Number) objM124185).intValue();
                    newFriendInfo.uin = (String) objM12418;
                    newFriendInfo.nickname = (String) objM124182;
                    newFriendInfo.remark = (String) objM124183;
                    newFriendInfo.age = iIntValue;
                    newFriendInfo.sex = iIntValue2;
                    return newFriendInfo;
                }
            }
            return null;
        } catch (Exception e) {
            String strM145312 = AbstractC9234.m14531(623);
            String str2 = AbstractC7017.f17361;
            AbstractC7017.m12164(strM145312, e.toString(), e, true);
            return null;
        }
    }

    public List<NewFriendInfo> getNewFriendList() {
        C9637.f25139.getClass();
        return C9637.m15036();
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
            Object obj = ((JSONObject) new C0955(this.pluginLoader.getJavaPluginInfo().getPluginID(), str).f663).get(str2);
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
        int i = AbstractC7199.f17871;
        File file = new File(strResolvePath);
        if (!file.exists()) {
            file.getParentFile().mkdirs();
        }
        C6956 c6956 = new C6956(new C6972());
        C2080 c2080 = new C2080(6);
        c2080.m2711(str);
        c2080.f3963 = C6980.m12107(map).m12108();
        try {
            C6960 c6960M12193 = new C7032(c6956, new C6954(c2080)).m12193();
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(c6960M12193.f17115.m12077());
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int i2 = bufferedInputStream.read(bArr);
                            if (i2 == -1) {
                                bufferedInputStream.close();
                                bufferedOutputStream.close();
                                c6960M12193.close();
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
            throw new RuntimeException(AbstractC9234.m14531(30) + str + AbstractC9234.m14531(31) + strResolvePath, e);
        }
    }

    public String httpGet(String str, Map<String, String> map) {
        int i = AbstractC7199.f17871;
        try {
            C6956 c6956 = new C6956(new C6972());
            C2080 c2080 = new C2080(6);
            c2080.m2711(str);
            c2080.f3963 = C6980.m12107(map).m12108();
            c2080.m2718("GET", null);
            C6960 c6960M12193 = new C7032(c6956, new C6954(c2080)).m12193();
            String strM12078 = c6960M12193.f17115.m12078();
            c6960M12193.close();
            return strM12078;
        } catch (IOException e) {
            String strM14532 = AbstractC9234.m14532("喵喵喵呜呜喵呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜呜呜喵~喵喵喵呜呜喵喵喵");
            String str2 = AbstractC7017.f17361;
            AbstractC7017.m12164(strM14532, e.toString(), e, true);
            return "";
        }
    }

    public String httpPost(String str, Map<String, String> map) {
        int i = AbstractC7199.f17871;
        try {
            C6956 c6956 = new C6956(new C6972());
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                key.getClass();
                value.getClass();
                arrayList.add(AbstractC6918.m12006(key, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
                arrayList2.add(AbstractC6918.m12006(value, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
            }
            C2080 c2080 = new C2080(6);
            c2080.m2711(str);
            c2080.m2726(AbstractC9234.m14531(25), AbstractC9234.m14531(29));
            c2080.m2726(AbstractC9234.m14532("喵喵呜呜喵喵呜喵~喵喵喵呜喵呜呜喵~喵喵喵呜呜喵喵呜~喵喵喵喵呜呜喵呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜喵喵喵"), AbstractC9234.m14532("喵呜喵呜呜喵喵呜~喵呜喵呜呜喵呜喵~喵呜喵呜喵喵喵喵"));
            c2080.m2726(AbstractC9234.m14531(27), AbstractC9234.m14531(28));
            c2080.m2718("POST", new C6976(arrayList, arrayList2));
            C6960 c6960M12193 = new C7032(c6956, new C6954(c2080)).m12193();
            String strM12078 = c6960M12193.f17115.m12078();
            c6960M12193.close();
            return strM12078;
        } catch (IOException e) {
            String strM14532 = AbstractC9234.m14532("喵喵喵呜呜喵呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜呜呜喵~喵喵喵呜呜喵喵喵");
            String str2 = AbstractC7017.f17361;
            AbstractC7017.m12164(strM14532, e.toString(), e, true);
            return "";
        }
    }

    public String httpPostJson(String str, String str2) {
        return AbstractC7199.m12512(str, str2, null);
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
            this.errorOutput.m157e(th);
        }
    }

    public ClassLoader loadAar(String str) {
        ClassLoader classLoader;
        String strResolvePath = resolvePath(str);
        ClassLoader classLoader2 = AbstractC7166.f17806;
        ConcurrentHashMap concurrentHashMap = AbstractC8359.f20752;
        String strM1725 = AbstractC1298.m1725(strResolvePath);
        if (strM1725 == null) {
            classLoader = null;
        } else {
            classLoader = (ClassLoader) AbstractC8359.f20751.computeIfAbsent(AbstractC8359.m13314(classLoader2, "aar", strM1725), new C8360(strResolvePath, 2, classLoader2));
        }
        this.pluginLoader.addClassLoader(classLoader);
        return classLoader;
    }

    public ClassLoader loadDex(String str) {
        ClassLoader classLoader;
        String strResolvePath = resolvePath(str);
        ClassLoader classLoader2 = AbstractC7166.f17806;
        ConcurrentHashMap concurrentHashMap = AbstractC8359.f20752;
        String strM1725 = AbstractC1298.m1725(strResolvePath);
        if (strM1725 == null) {
            classLoader = null;
        } else {
            classLoader = (ClassLoader) AbstractC8359.f20751.computeIfAbsent(AbstractC8359.m13314(classLoader2, "dex", strM1725), new C8360(strResolvePath, 1, classLoader2));
        }
        this.pluginLoader.addClassLoader(classLoader);
        return classLoader;
    }

    public ClassLoader loadJar(String str) {
        ClassLoader classLoader;
        String strResolvePath = resolvePath(str);
        ClassLoader classLoader2 = AbstractC7166.f17806;
        ConcurrentHashMap concurrentHashMap = AbstractC8359.f20752;
        String strM1725 = AbstractC1298.m1725(strResolvePath);
        if (strM1725 == null) {
            classLoader = null;
        } else {
            classLoader = (ClassLoader) AbstractC8359.f20751.computeIfAbsent(AbstractC8359.m13314(classLoader2, "jar", strM1725), new C8360(strResolvePath, 0, classLoader2));
        }
        this.pluginLoader.addClassLoader(classLoader);
        return classLoader;
    }

    public void log(Object obj) {
        this.errorOutput.log(obj);
    }

    public void putBoolean(String str, String str2, boolean z) {
        C0955 c0955 = new C0955(this.pluginLoader.getJavaPluginInfo().getPluginID(), str);
        c0955.m932(Boolean.valueOf(z), str2);
        c0955.m919();
    }

    public void putDouble(String str, String str2, double d) {
        new C0955(this.pluginLoader.getJavaPluginInfo().getPluginID(), str).m932(Double.valueOf(d), str2);
    }

    public void putFloat(String str, String str2, float f) {
        new C0955(this.pluginLoader.getJavaPluginInfo().getPluginID(), str).m932(Float.valueOf(f), str2);
    }

    public void putInt(String str, String str2, int i) {
        C0955 c0955 = new C0955(this.pluginLoader.getJavaPluginInfo().getPluginID(), str);
        c0955.m932(Integer.valueOf(i), str2);
        c0955.m919();
    }

    public void putLong(String str, String str2, long j) {
        C0955 c0955 = new C0955(this.pluginLoader.getJavaPluginInfo().getPluginID(), str);
        c0955.m932(Long.valueOf(j), str2);
        c0955.m919();
    }

    public void putString(String str, String str2, String str3) {
        C0955 c0955 = new C0955(this.pluginLoader.getJavaPluginInfo().getPluginID(), str);
        c0955.m932(str3, str2);
        c0955.m919();
    }

    public byte[] readFileBytes(String str) {
        return AbstractC5894.m10588(new File(resolvePath(str)));
    }

    public String readFileText(String str) {
        return AbstractC5894.m10587(resolvePath(str));
    }

    public void removeItem(String str, String str2) {
        this.pluginLoader.dialogItemMap.remove(str2);
    }

    public void removeItemByName(String str) {
        this.pluginLoader.dialogItemMap.remove(str);
    }

    public void replyEmoji(Object obj, int i, String str) {
        MessageData message = obj instanceof MessageData ? (MessageData) obj : ((PluginMessageCallbackAPI) AbstractC7138.f17769.get(PluginMessageCallbackAPI.class)).parseMessage(obj);
        if (!message.IsGroup) {
            C6755.m11869(AbstractC9234.m14531(603));
            return;
        }
        String str2 = message.GroupUin;
        try {
            if (obj instanceof MessageData) {
                obj = message.msg;
            }
            AbstractC7176.m12485(str2, ((Long) AbstractC7165.m12418(Long.TYPE, AbstractC9234.m14532("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜呜呜喵呜呜~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜喵呜"), obj)).longValue(), str, i);
        } catch (Exception e) {
            this.errorOutput.m157e(e);
        }
    }

    public void revokeMsg(Object obj) {
        MessageData message = obj instanceof MessageData ? (MessageData) obj : ((PluginMessageCallbackAPI) AbstractC7138.f17769.get(PluginMessageCallbackAPI.class)).parseMessage(obj);
        Object groupContact = message.IsGroup ? QQSessionUtils.QQNT.getGroupContact(message.GroupUin) : QQSessionUtils.QQNT.getFriendContact(message.UserUin);
        try {
            if (obj instanceof MessageData) {
                obj = message.msg;
            }
            QQMsgService.recallMsg(groupContact, ((Long) AbstractC7165.m12418(Long.TYPE, AbstractC9234.m14532("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜喵喵喵喵呜~喵喵喵喵喵喵喵呜"), obj)).longValue());
        } catch (Exception e) {
            this.errorOutput.m157e(e);
        }
    }

    public String scanImageText(String str) {
        try {
            return C9693.m15088(resolvePath(str));
        } catch (Exception e) {
            this.errorOutput.m157e(e);
            return "";
        }
    }

    public List<OcrText> scanImageTextDetail(String str) {
        try {
            return C9693.m15087(resolvePath(str));
        } catch (Exception e) {
            this.errorOutput.m157e(e);
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
            Object objCallMethod = XposedHelpers.callMethod(QQEnvTool.getAppRuntime(), AbstractC9234.m14531(602), new Class[]{String.class}, new Object[]{(String) AbstractC7165.m12416(AbstractC7166.m12425(AbstractC9234.m14531(600)), String.class, AbstractC9234.m14531(601))});
            int i2 = AbstractC7187.f17853;
            Class cls = Void.TYPE;
            Class cls2 = Integer.TYPE;
            if (i2 >= 13350) {
                C9921 c9921M15231 = C9921.m15231(objCallMethod.getClass());
                c9921M15231.m15234(String.class, String.class, cls2);
                c9921M15231.f25828 = cls;
                c9921M15231.m15235(objCallMethod, str2, str, Integer.valueOf(i));
                return;
            }
            if (i2 >= 12290) {
                C9921 c9921M152312 = C9921.m15231(objCallMethod.getClass());
                c9921M152312.m15234(cls2, String.class, String.class);
                c9921M152312.f25828 = cls;
                c9921M152312.m15235(objCallMethod, Integer.valueOf(i), str2, str);
                return;
            }
            C9921 c9921M152313 = C9921.m15231(objCallMethod.getClass());
            c9921M152313.m15234(String.class, String.class, cls2);
            c9921M152313.f25828 = cls;
            c9921M152313.m15235(objCallMethod, str2, str, Integer.valueOf(i));
        } catch (Exception e) {
            this.errorOutput.m157e(e);
        }
    }

    public void sendPic(String str, String str2, String str3) {
        QQNTSendMsgUtils.sendPic(PluginSendMsgTool.createContact(str, str2), resolvePath(str3));
    }

    public void sendProto(String str, String str2) {
        try {
            JSONObject jSONObjectM6934 = InterfaceC3749.m6934(str2);
            C7018 c7018 = new C7018();
            c7018.m12171(jSONObjectM6934);
            AbstractC1298.m1712(str, c7018.m12169());
        } catch (Exception e) {
            this.errorOutput.m157e(e);
        }
    }

    public void sendReply(String str, Object obj, String str2) {
        Object groupContact = QQSessionUtils.QQNT.getGroupContact(str);
        if (obj instanceof MessageData) {
            obj = ((MessageData) obj).msg;
        }
        try {
            Object objCreateReplyElement = CreateElement.createReplyElement(((Long) AbstractC7165.m12418(Long.TYPE, AbstractC9234.m14532("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜喵喵喵喵呜~喵喵喵喵喵喵喵呜"), obj)).longValue());
            ArrayList<Object> compoundMessages = PluginSendMsgTool.parseCompoundMessages(str, str2);
            compoundMessages.add(0, objCreateReplyElement);
            QQNTSendMsgUtils.sendMsg(groupContact, compoundMessages);
        } catch (Exception e) {
            this.errorOutput.m157e(e);
        }
    }

    public void sendSticker(String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str4)) {
            str4 = AbstractC9234.m14531(364);
        }
        Object objCreateContact = PluginSendMsgTool.createContact(str, str2);
        Object objCreateEmojiElement = CreateElement.createEmojiElement(resolvePath(str3));
        Object objM15222 = C9915.m15222(AbstractC7166.m12425(AbstractC9234.m14531(178)), AbstractC9234.m14531(282), objCreateEmojiElement);
        C9915.m15223(objM15222, AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵喵呜喵呜~喵喵喵喵喵呜喵喵~喵喵喵呜呜呜呜喵~喵喵喵呜呜喵喵喵"), str4);
        C9915.m15223(objM15222, AbstractC9234.m14531(141), 0);
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
        InterfaceC6016 interfaceC6016 = AbstractC9664.f25282;
        AbstractC9234.m14532("喵喵喵喵喵呜呜呜~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜喵呜~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜喵呜");
        str.getClass();
        AbstractC9234.m14532("喵喵喵呜呜呜呜喵~喵喵喵呜喵喵喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜喵呜喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
        str2.getClass();
        AbstractC9234.m14532("喵喵喵呜呜呜喵呜~喵喵喵呜呜呜喵喵~喵喵喵呜呜喵喵呜~喵喵喵喵喵喵呜呜");
        str3.getClass();
        Object appRuntime = QQEnvTool.getAppRuntime();
        appRuntime.getClass();
        Object objM7397 = AbstractC3897.m7397(appRuntime, AbstractC9234.m14531(602), (String) AbstractC9664.f25282.getValue());
        Class clsM15228 = AbstractC9919.m15228(AbstractC9234.m14531(2852));
        clsM15228.getClass();
        Object objM15226 = C9917.m15226(clsM15228, new Object[0]);
        objM15226.getClass();
        AbstractC3897.m7365(objM15226, AbstractC9234.m14532("喵喵喵呜呜呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜呜喵呜"), str3);
        AbstractC3897.m7365(objM15226, AbstractC9234.m14531(2836), str2);
        AbstractC3897.m7365(objM15226, AbstractC9234.m14531(1223), str);
        ArrayList arrayListM12471 = AbstractC7176.m12471(objM15226);
        ArrayList arrayListM124712 = AbstractC7176.m12471(1);
        C9921 c9921M15230 = C9921.m15230(objM7397);
        c9921M15230.m15234(String.class, ArrayList.class, ArrayList.class);
        c9921M15230.m15235(objM7397, str, arrayListM12471, arrayListM124712);
    }

    public void setTitle(String str, String str2, String str3) {
        C9665 c9665 = C9665.f25285;
        AbstractC9234.m14532("喵喵喵喵喵呜呜呜~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜喵呜~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜喵呜");
        str.getClass();
        AbstractC9234.m14532("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵");
        str2.getClass();
        AbstractC9234.m14532("喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵喵呜喵喵~喵喵喵喵喵喵喵喵");
        str3.getClass();
        try {
            if (AbstractC7187.f17853 < 12290) {
                QQNTTroopTool.setGroupMemberTitle(str, str2, str3);
                return;
            }
            Object runtimeService = QQEnvTool.getRuntimeService(AbstractC9919.m15228(AbstractC9234.m14531(2845)), "");
            C9921 c9921M15230 = C9921.m15230(runtimeService);
            c9921M15230.f25826 = AbstractC9234.m14531(2846);
            c9921M15230.f25828 = String.class;
            c9921M15230.m15234(String.class, String.class);
            Object objM15235 = c9921M15230.m15235(runtimeService, str, str2);
            AbstractC9234.m14531(1559);
            objM15235.getClass();
            C7018 c7018 = new C7018();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(AbstractC9234.m14532("喵呜喵喵喵喵呜喵"), 2300);
            jSONObject.put(AbstractC9234.m14532("喵呜喵喵喵喵喵呜"), 2);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(AbstractC9234.m14532("喵呜喵喵喵喵呜喵"), Long.valueOf(Long.parseLong(str)));
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(AbstractC9234.m14532("喵呜喵喵喵喵呜喵"), Long.valueOf(Long.parseLong(str2)));
            jSONObject3.put(AbstractC9234.m14532("喵呜喵喵喵呜呜喵"), str3);
            jSONObject3.put(AbstractC9234.m14532("喵呜喵喵喵呜喵呜"), 4294967295L);
            jSONObject3.put(AbstractC9234.m14532("喵呜喵喵喵呜喵喵"), (String) objM15235);
            jSONObject2.put(AbstractC9234.m14532("喵呜喵喵喵喵喵喵"), jSONObject3);
            jSONObject.put(AbstractC9234.m14532("喵呜喵喵喵呜呜呜"), jSONObject2);
            c7018.m12171(jSONObject);
            String strM14531 = AbstractC9234.m14531(2847);
            byte[] bArrM12169 = c7018.m12169();
            AbstractC9234.m14531(2848);
            bArrM12169.getClass();
            AbstractC1298.m1712(strM14531, bArrM12169);
        } catch (Exception e) {
            String strM145312 = AbstractC9234.m14531(2833);
            String str4 = AbstractC7017.f17361;
            AbstractC7017.m12164(strM145312, e.toString(), e, true);
        }
    }

    public void toast(Object obj) {
        AbstractC7014.m12151(obj);
    }

    public void writeBytesToFile(String str, byte[] bArr) {
        AbstractC5894.m10570(resolvePath(str), bArr);
    }

    public void writeTextAppendToFile(String str, String str2) {
        AbstractC5894.m10615(resolvePath(str), str2, true);
    }

    public void writeTextToFile(String str, String str2) {
        AbstractC5894.m10615(resolvePath(str), str2, false);
    }

    public String httpPostJson(String str, Map<String, String> map, String str2) {
        return AbstractC7199.m12512(str, str2, map);
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
        return (String) new C0955(this.pluginLoader.getJavaPluginInfo().getPluginID(), str).m954(str2);
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
        return AbstractC7199.m12509(str);
    }

    @Deprecated(since = "发送表情 参数三为表情id")
    public void sendAntEmo(String str, String str2, int i) {
    }

    @Deprecated(since = "弃用了")
    public void sendShow(String str, String str2, int i) {
    }

    public void httpDownload(String str, String str2) {
        AbstractC7199.m12511(str, resolvePath(str2));
    }

    public String httpPost(String str, Map<String, String> map, Map<String, String> map2) {
        int i = AbstractC7199.f17871;
        try {
            C6956 c6956 = new C6956(new C6972());
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                key.getClass();
                value.getClass();
                arrayList.add(AbstractC6918.m12006(key, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
                arrayList2.add(AbstractC6918.m12006(value, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
            }
            C2080 c2080 = new C2080(6);
            c2080.m2711(str);
            c2080.f3963 = C6980.m12107(map).m12108();
            c2080.m2718("POST", new C6976(arrayList, arrayList2));
            C6960 c6960M12193 = new C7032(c6956, new C6954(c2080)).m12193();
            String strM12078 = c6960M12193.f17115.m12078();
            c6960M12193.close();
            return strM12078;
        } catch (IOException e) {
            String strM14532 = AbstractC9234.m14532("喵喵喵呜呜喵呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜呜呜喵~喵喵喵呜呜喵喵喵");
            String str2 = AbstractC7017.f17361;
            AbstractC7017.m12164(strM14532, e.toString(), e, true);
            return "";
        }
    }
}
