package lin.xposed.hook.javaplugin.controller;

import androidx.compose.foundation.draganddrop.AbstractC0455;
import bsh.BshMethod;
import bsh.Interpreter;
import bsh.NameSpace;
import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedBridge;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lin.xposed.hook.javaplugin.api.QQNTPluginMethod;
import lin.xposed.hook.javaplugin.bean.PluginInfo;
import lin.xposed.hook.util.qq.QQEnvTool;
import p032.AbstractC6318;
import p035.AbstractC6340;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class PluginLoader {
    private final PluginInfo pluginInfo;
    public final Map<String, BshMethod> methodCache = new HashMap();
    public final Map<String, String> dialogItemMap = new LinkedHashMap();
    public final Map<String, String> temporaryItemMap = new LinkedHashMap();
    public final Map<String, String> msgMenuItemMap = new LinkedHashMap();

    public PluginLoader(PluginInfo pluginInfo) {
        this.pluginInfo = pluginInfo;
        Interpreter interpreter = new Interpreter();
        interpreter.setClassLoader(new FixClassLoader(0));
        pluginInfo.setInterpreter(interpreter);
    }

    private void registerDataStorageMethod(NameSpace nameSpace, QQNTPluginMethod qQNTPluginMethod) {
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("putString", String.class, String.class, String.class), qQNTPluginMethod));
        String strM6668 = "putInt";
        Class cls = Integer.TYPE;
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(strM6668, String.class, String.class, cls), qQNTPluginMethod));
        String strM66682 = "putBoolean";
        Class cls2 = Boolean.TYPE;
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(strM66682, String.class, String.class, cls2), qQNTPluginMethod));
        String strM66683 = "putLong";
        Class cls3 = Long.TYPE;
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(strM66683, String.class, String.class, cls3), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("getString", String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("getString", String.class, String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("getInt", String.class, String.class, cls), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("getBoolean", String.class, String.class, cls2), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("getLong", String.class, String.class, cls3), qQNTPluginMethod));
        String strM66684 = "getFloat";
        Class cls4 = Float.TYPE;
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(strM66684, String.class, String.class, cls4), qQNTPluginMethod));
        String strM66685 = "getDouble";
        Class cls5 = Double.TYPE;
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(strM66685, String.class, String.class, cls5), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("putFloat", String.class, String.class, cls4), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("putDouble", String.class, String.class, cls5), qQNTPluginMethod));
    }

    private void registerFileMethod(NameSpace nameSpace, QQNTPluginMethod qQNTPluginMethod) {
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("readFileText", String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("writeTextToFile", String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("writeTextAppendToFile", String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("readFileBytes", String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("writeBytesToFile", String.class, byte[].class), qQNTPluginMethod));
    }

    private static void registerGetInfoMethod(NameSpace nameSpace, QQNTPluginMethod qQNTPluginMethod) {
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("getMemberName", String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("getGroupInfo", String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("getGroupList", null), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("getMemberInfo", String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("getGroupMemberList", String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("getForbiddenList", String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("getChatType", null), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("getCurrentFriendUin", null), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("getCurrentGroupUin", null), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("getFriendList", null), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("isFriend", String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("getNewFriendInfo", String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("getNewFriendList", null), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("getMessageList", String.class, String.class, Integer.TYPE), qQNTPluginMethod));
    }

    private void registerHttpMethod(NameSpace nameSpace, QQNTPluginMethod qQNTPluginMethod) {
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("httpGet", String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("httpGet", String.class, Map.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("httpPost", String.class, Map.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("httpPost", String.class, Map.class, Map.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("httpPostJson", String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("httpPostJson", String.class, Map.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("httpDownload", String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("httpDownload", String.class, String.class, Map.class), qQNTPluginMethod));
    }

    private void registerMenuMethod(NameSpace nameSpace, QQNTPluginMethod qQNTPluginMethod) {
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("addItem", String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("addItem", String.class, String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("addTemporaryItem", String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("removeItem", String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("removeItem", String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("removeItemByName", String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("addMenuItem", String.class, String.class), qQNTPluginMethod));
    }

    private void registerOcrMethod(NameSpace nameSpace, QQNTPluginMethod qQNTPluginMethod) {
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("scanImageText", String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("scanImageTextDetail", String.class), qQNTPluginMethod));
    }

    private void registerOtherMethod(NameSpace nameSpace, QQNTPluginMethod qQNTPluginMethod) {
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("toast", Object.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("getActivity", null), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("load", String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("loadDex", String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("loadJar", String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("loadAar", String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("eval", String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("error", Throwable.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("log", Object.class), qQNTPluginMethod));
    }

    private void registerPluginImports() {
        this.pluginInfo.getInterpreter().getNameSpace().importPackage("lin.xposed.hook.javaplugin.bean");
    }

    private void registerPluginInterfaces() {
        NameSpace nameSpace = this.pluginInfo.getInterpreter().getNameSpace();
        QQNTPluginMethod qQNTPluginMethod = new QQNTPluginMethod(this);
        registerGetInfoMethod(nameSpace, qQNTPluginMethod);
        registerSendMsgMethod(nameSpace, qQNTPluginMethod);
        registerSKeyMethod(nameSpace, qQNTPluginMethod);
        registerTroopMethod(nameSpace, qQNTPluginMethod);
        registerMenuMethod(nameSpace, qQNTPluginMethod);
        registerDataStorageMethod(nameSpace, qQNTPluginMethod);
        registerHttpMethod(nameSpace, qQNTPluginMethod);
        registerOtherMethod(nameSpace, qQNTPluginMethod);
        registerFileMethod(nameSpace, qQNTPluginMethod);
        registerOcrMethod(nameSpace, qQNTPluginMethod);
    }

    private void registerPluginVariables() {
        NameSpace nameSpace = this.pluginInfo.getInterpreter().getNameSpace();
        nameSpace.setVariable("context", AbstractC6340.f17460);
        nameSpace.setVariable("pluginID", this.pluginInfo.getPluginID());
        nameSpace.setVariable("loader", AbstractC6340.f17460.getClassLoader());
        nameSpace.setVariable("appPath", this.pluginInfo.getPluginLocalPath());
        nameSpace.setVariable("myUin", QQEnvTool.getCurrentUin());
    }

    private void registerSKeyMethod(NameSpace nameSpace, QQNTPluginMethod qQNTPluginMethod) {
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("getGroupRKey", null), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("getFriendRKey", null), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("getRealSkey", null), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("getSkey", null), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("getPskey", String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("getSuperkey", null), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("getPT4Token", String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("getBKN", String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("getGTK", String.class), qQNTPluginMethod));
    }

    private void registerSendMsgMethod(NameSpace nameSpace, QQNTPluginMethod qQNTPluginMethod) {
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("sendMsg", String.class, String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("sendPic", String.class, String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("sendSticker", String.class, String.class, String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("sendCard", String.class, String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("sendFile", String.class, String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("sendLike", String.class), qQNTPluginMethod));
        String strM6668 = "sendLike";
        Class cls = Integer.TYPE;
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(strM6668, String.class, cls), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("sendReply", String.class, Object.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("sendPai", String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("replyEmoji", Object.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("replyEmoji", Object.class, cls, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("sendProto", String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("forwardMsg", String.class, String.class, Object.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("sendAntEmo", String.class, String.class, cls), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("sendShake", String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("sendShow", String.class, String.class, cls), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("sendVoice", String.class, String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("sendVideo", String.class, String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("sendTip", Object.class, String.class), qQNTPluginMethod));
    }

    private void registerTroopMethod(NameSpace nameSpace, QQNTPluginMethod qQNTPluginMethod) {
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("setCard", String.class, String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("setTitle", String.class, String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("revokeMsg", Object.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("deleteMsg", Object.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("forbidden", String.class, String.class, Integer.TYPE), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod("kick", String.class, String.class, Boolean.TYPE), qQNTPluginMethod));
    }

    public synchronized void addClassLoader(ClassLoader classLoader) {
        this.pluginInfo.getInterpreter().addClassLoader(classLoader);
    }

    public synchronized void eval(String str) {
        try {
            this.pluginInfo.getInterpreter().eval(str);
        } finally {
        }
    }

    public PluginInfo getJavaPluginInfo() {
        return this.pluginInfo;
    }

    public void loadPlugin() throws IOException {
        String str = this.pluginInfo.getPluginLocalPath() + "/main.java";
        if (!new File(str).exists()) {
            C5919.m11246("\u811a\u672cmain.java\u6587\u4ef6\u4e0d\u5b58\u5728");
            return;
        }
        registerPluginVariables();
        registerPluginInterfaces();
        registerPluginImports();
        loadPluginByPath(str);
        onLoad();
    }

    public synchronized void loadPluginByPath(String str) {
        try {
            this.pluginInfo.getInterpreter().eval(AbstractC0455.m1142(str));
        } finally {
        }
    }

    public void onLoad() {
        PluginManager.invokeToPluginMethod(this, "onLoad", new Object[0]);
    }

    public void stopPlugin() {
        PluginManager.invokeToPluginMethod(this, "onUnLoad", new Object[0]);
        this.pluginInfo.getInterpreter().getNameSpace().clear();
    }

    public String toString() {
        return "PluginLoader{pluginInfo=" + this.pluginInfo + ", dialogItemMap=" + this.dialogItemMap + '}';
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static class FixClassLoader extends ClassLoader {
        private final List<ClassLoader> loaders;

        private FixClassLoader() {
            super(ClassLoader.getSystemClassLoader());
            ArrayList arrayList = new ArrayList();
            this.loaders = arrayList;
            arrayList.add(AbstractC6318.f17411);
            arrayList.add(AbstractC6318.f17412);
            arrayList.add(XposedBridge.class.getClassLoader());
        }

        @Override // java.lang.ClassLoader
        public Class<?> findClass(String str) throws ClassNotFoundException {
            Iterator<ClassLoader> it = this.loaders.iterator();
            while (it.hasNext()) {
                try {
                    return it.next().loadClass(str);
                } catch (Exception unused) {
                }
            }
            throw new ClassNotFoundException(str);
        }

        @Override // java.lang.ClassLoader
        public URL getResource(String str) {
            Iterator<ClassLoader> it = this.loaders.iterator();
            while (it.hasNext()) {
                URL resource = it.next().getResource(str);
                if (resource != null) {
                    return resource;
                }
            }
            return super.getResource(str);
        }

        @Override // java.lang.ClassLoader
        public Enumeration<URL> getResources(String str) throws IOException {
            ArrayList arrayList = new ArrayList();
            Iterator<ClassLoader> it = this.loaders.iterator();
            while (it.hasNext()) {
                Enumeration<URL> resources = it.next().getResources(str);
                while (resources.hasMoreElements()) {
                    arrayList.add(resources.nextElement());
                }
            }
            return Collections.enumeration(arrayList);
        }

        @Override // java.lang.ClassLoader
        public Class<?> loadClass(String str, boolean z) throws ClassNotFoundException {
            Iterator<ClassLoader> it = this.loaders.iterator();
            while (it.hasNext()) {
                try {
                    return it.next().loadClass(str);
                } catch (Exception unused) {
                }
            }
            throw new ClassNotFoundException(str);
        }

        public /* synthetic */ FixClassLoader(int i) {
            this();
        }
    }
}
