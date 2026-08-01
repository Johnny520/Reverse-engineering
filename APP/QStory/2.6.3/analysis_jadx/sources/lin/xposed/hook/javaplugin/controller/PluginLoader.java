package lin.xposed.hook.javaplugin.controller;

import bsh.BshMethod;
import bsh.Interpreter;
import bsh.NameSpace;
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
import kotlin.reflect.jvm.internal.AbstractC5062;
import lin.xposed.hook.javaplugin.api.QQNTPluginMethod;
import lin.xposed.hook.javaplugin.bean.PluginInfo;
import lin.xposed.hook.util.qq.QQEnvTool;
import p033.AbstractC6337;
import p036.AbstractC6358;
import p287.AbstractC8405;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(638), String.class, String.class, String.class), qQNTPluginMethod));
        String strM13973 = AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵喵喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵呜喵喵喵喵呜~喵喵喵喵呜喵呜呜~喵喵喵呜呜喵喵喵");
        Class cls = Integer.TYPE;
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(strM13973, String.class, String.class, cls), qQNTPluginMethod));
        String strM13972 = AbstractC8405.m13972(639);
        Class cls2 = Boolean.TYPE;
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(strM13972, String.class, String.class, cls2), qQNTPluginMethod));
        String strM139732 = AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵喵喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵呜喵喵呜喵喵~喵喵喵喵呜喵呜喵~喵喵喵喵喵喵呜喵~喵喵喵喵喵呜呜喵");
        Class cls3 = Long.TYPE;
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(strM139732, String.class, String.class, cls3), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(640), String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(640), String.class, String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13973("喵喵喵呜喵呜喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵呜喵喵喵喵呜~喵喵喵喵呜喵呜呜~喵喵喵呜呜喵喵喵"), String.class, String.class, cls), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(641), String.class, String.class, cls2), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13973("喵喵喵呜喵呜喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵呜喵喵呜喵喵~喵喵喵喵呜喵呜喵~喵喵喵喵喵喵呜喵~喵喵喵喵喵呜呜喵"), String.class, String.class, cls3), qQNTPluginMethod));
        String strM139722 = AbstractC8405.m13972(642);
        Class cls4 = Float.TYPE;
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(strM139722, String.class, String.class, cls4), qQNTPluginMethod));
        String strM139723 = AbstractC8405.m13972(643);
        Class cls5 = Double.TYPE;
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(strM139723, String.class, String.class, cls5), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(644), String.class, String.class, cls4), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(645), String.class, String.class, cls5), qQNTPluginMethod));
    }

    private void registerFileMethod(NameSpace nameSpace, QQNTPluginMethod qQNTPluginMethod) {
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(668), String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(669), String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(670), String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(671), String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(672), String.class, byte[].class), qQNTPluginMethod));
    }

    private static void registerGetInfoMethod(NameSpace nameSpace, QQNTPluginMethod qQNTPluginMethod) {
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(613), String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(614), String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(615), null), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(616), String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(617), String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(618), String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(511), null), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(619), null), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(620), null), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(621), null), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(622), String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(623), String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(624), null), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(625), String.class, String.class, Integer.TYPE), qQNTPluginMethod));
    }

    private void registerHttpMethod(NameSpace nameSpace, QQNTPluginMethod qQNTPluginMethod) {
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13973("喵喵喵呜呜喵呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜呜呜喵~喵喵喵呜呜喵喵喵~喵喵呜喵喵喵呜喵~喵喵喵喵呜喵喵呜~喵喵喵呜喵呜喵呜"), String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13973("喵喵喵呜呜喵呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜呜呜喵~喵喵喵呜呜喵喵喵~喵喵呜喵喵喵呜喵~喵喵喵喵呜喵喵呜~喵喵喵呜喵呜喵呜"), String.class, Map.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(652), String.class, Map.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(652), String.class, Map.class, Map.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(653), String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(653), String.class, Map.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(654), String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(654), String.class, String.class, Map.class), qQNTPluginMethod));
    }

    private void registerMenuMethod(NameSpace nameSpace, QQNTPluginMethod qQNTPluginMethod) {
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13973("喵喵喵呜喵喵呜喵~喵喵喵呜喵喵喵呜~喵喵喵呜呜呜呜喵~喵喵呜喵喵喵喵呜~喵喵喵呜喵喵喵呜~喵喵喵喵呜喵喵呜~喵喵喵喵呜呜喵喵"), String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13973("喵喵喵呜喵喵呜喵~喵喵喵呜喵喵喵呜~喵喵喵呜呜呜呜喵~喵喵呜喵喵喵喵呜~喵喵喵呜喵喵喵呜~喵喵喵喵呜喵喵呜~喵喵喵喵呜呜喵喵"), String.class, String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(634), String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(635), String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(635), String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(636), String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(637), String.class, String.class), qQNTPluginMethod));
    }

    private void registerOcrMethod(NameSpace nameSpace, QQNTPluginMethod qQNTPluginMethod) {
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(673), String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(674), String.class), qQNTPluginMethod));
    }

    private void registerOtherMethod(NameSpace nameSpace, QQNTPluginMethod qQNTPluginMethod) {
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13973("喵喵喵喵喵呜呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵呜呜喵呜呜~喵喵喵呜喵喵喵呜"), Object.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(82), null), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13973("喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵喵呜呜喵喵"), String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13973("喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵喵呜呜喵喵~喵喵呜喵喵喵喵呜~喵喵喵喵呜喵喵呜~喵喵喵呜呜喵喵呜"), String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13973("喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵喵呜呜喵喵~喵喵呜喵呜呜呜呜~喵喵喵喵呜呜喵呜~喵喵喵呜喵喵呜呜"), String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13973("喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵喵呜呜喵喵~喵喵呜喵喵呜喵喵~喵喵喵喵呜呜喵呜~喵喵喵呜喵喵呜呜"), String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13973("喵喵喵呜喵呜呜喵~喵喵喵喵喵喵呜呜~喵喵喵呜呜喵呜呜~喵喵喵喵喵呜喵喵"), String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13973("喵喵喵呜喵呜呜喵~喵喵喵喵喵呜呜呜~喵喵喵喵呜喵喵喵~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜呜呜"), Throwable.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13973("喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜呜呜喵呜"), Object.class), qQNTPluginMethod));
    }

    private void registerPluginImports() {
        this.pluginInfo.getInterpreter().getNameSpace().importPackage(AbstractC8405.m13972(675));
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
        nameSpace.setVariable(AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵呜"), AbstractC6358.f17507);
        nameSpace.setVariable(AbstractC8405.m13972(629), this.pluginInfo.getPluginID());
        nameSpace.setVariable(AbstractC8405.m13973("喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵"), AbstractC6358.f17507.getClassLoader());
        nameSpace.setVariable(AbstractC8405.m13973("喵喵喵呜喵喵呜喵~喵喵喵喵喵呜喵呜~喵喵喵喵呜喵呜喵~喵喵呜呜呜喵喵喵~喵喵喵喵喵呜喵喵~喵喵喵呜呜喵喵喵~喵喵喵喵呜喵喵呜"), this.pluginInfo.getPluginLocalPath());
        nameSpace.setVariable(AbstractC8405.m13973("喵喵喵呜呜呜呜喵~喵喵喵喵呜呜喵喵~喵喵呜喵呜呜呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜喵呜呜"), QQEnvTool.getCurrentUin());
    }

    private void registerSKeyMethod(NameSpace nameSpace, QQNTPluginMethod qQNTPluginMethod) {
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(646), null), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(647), null), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(648), null), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13973("喵喵喵呜喵呜喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵呜呜呜喵呜呜~喵喵喵喵呜呜呜喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜喵喵喵"), null), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(649), String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(650), null), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(651), String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13973("喵喵喵呜喵呜喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵呜喵呜喵呜喵~喵喵呜喵呜呜呜喵~喵喵呜喵喵喵呜喵"), String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13973("喵喵喵呜喵呜喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵呜喵呜呜呜呜~喵喵呜呜喵喵喵呜~喵喵呜喵喵呜呜呜"), String.class), qQNTPluginMethod));
    }

    private void registerSendMsgMethod(NameSpace nameSpace, QQNTPluginMethod qQNTPluginMethod) {
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵呜喵呜喵喵喵~喵喵喵呜呜呜呜呜~喵喵喵喵喵呜呜喵"), String.class, String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵呜呜喵呜喵呜~喵喵喵喵喵呜喵呜~喵喵喵喵喵喵呜喵"), String.class, String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(655), String.class, String.class, String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(656), String.class, String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(657), String.class, String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(658), String.class), qQNTPluginMethod));
        String strM13972 = AbstractC8405.m13972(658);
        Class cls = Integer.TYPE;
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(strM13972, String.class, cls), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(659), String.class, Object.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵呜呜喵呜喵呜~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵喵喵"), String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(660), Object.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(660), Object.class, cls, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(661), String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(662), String.class, String.class, Object.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(663), String.class, String.class, cls), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(664), String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(665), String.class, String.class, cls), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(666), String.class, String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(667), String.class, String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵呜呜喵喵喵呜~喵喵喵喵喵呜喵呜~喵喵喵呜喵喵喵呜"), Object.class, String.class), qQNTPluginMethod));
    }

    private void registerTroopMethod(NameSpace nameSpace, QQNTPluginMethod qQNTPluginMethod) {
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵呜喵呜喵呜呜~喵喵喵喵喵呜喵喵~喵喵喵呜呜呜呜喵~喵喵喵喵喵呜喵呜"), String.class, String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(630), String.class, String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(631), Object.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(632), Object.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13972(633), String.class, String.class, Integer.TYPE), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC8405.m13973("喵喵喵呜呜喵喵喵~喵喵喵呜呜呜喵喵~喵喵喵呜呜喵喵呜~喵喵喵喵喵喵呜呜"), String.class, String.class, Boolean.TYPE), qQNTPluginMethod));
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
        String str = this.pluginInfo.getPluginLocalPath() + AbstractC8405.m13972(626);
        if (!new File(str).exists()) {
            C5925.m11307(AbstractC8405.m13972(627));
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
            this.pluginInfo.getInterpreter().eval(AbstractC5062.m10028(str));
        } finally {
        }
    }

    public void onLoad() {
        PluginManager.invokeToPluginMethod(this, AbstractC8405.m13973("喵喵喵呜呜呜喵喵~喵喵喵呜呜喵呜呜~喵喵呜呜喵呜呜喵~喵喵喵喵喵呜呜呜~喵喵喵喵喵呜喵喵~喵喵喵喵呜喵喵喵"), new Object[0]);
    }

    public void stopPlugin() {
        PluginManager.invokeToPluginMethod(this, AbstractC8405.m13972(628), new Object[0]);
        this.pluginInfo.getInterpreter().getNameSpace().clear();
    }

    public String toString() {
        return AbstractC8405.m13972(676) + this.pluginInfo + AbstractC8405.m13972(677) + this.dialogItemMap + '}';
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class FixClassLoader extends ClassLoader {
        private final List<ClassLoader> loaders;

        private FixClassLoader() {
            super(ClassLoader.getSystemClassLoader());
            ArrayList arrayList = new ArrayList();
            this.loaders = arrayList;
            arrayList.add(AbstractC6337.f17460);
            arrayList.add(AbstractC6337.f17461);
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
