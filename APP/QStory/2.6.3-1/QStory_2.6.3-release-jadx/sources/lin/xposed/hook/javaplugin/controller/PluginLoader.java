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
import kotlin.reflect.jvm.internal.AbstractC5894;
import lin.xposed.hook.javaplugin.api.QQNTPluginMethod;
import lin.xposed.hook.javaplugin.bean.PluginInfo;
import lin.xposed.hook.util.p011qq.QQEnvTool;
import p049.AbstractC7166;
import p052.AbstractC7187;
import p303.AbstractC9234;
import top.suzhelan.qstory.hook.item.C6755;

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
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(638), String.class, String.class, String.class), qQNTPluginMethod));
        String strM14532 = AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵喵喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵呜喵喵喵喵呜~喵喵喵喵呜喵呜呜~喵喵喵呜呜喵喵喵");
        Class cls = Integer.TYPE;
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(strM14532, String.class, String.class, cls), qQNTPluginMethod));
        String strM14531 = AbstractC9234.m14531(639);
        Class cls2 = Boolean.TYPE;
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(strM14531, String.class, String.class, cls2), qQNTPluginMethod));
        String strM145322 = AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵喵喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵呜喵喵呜喵喵~喵喵喵喵呜喵呜喵~喵喵喵喵喵喵呜喵~喵喵喵喵喵呜呜喵");
        Class cls3 = Long.TYPE;
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(strM145322, String.class, String.class, cls3), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(640), String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(640), String.class, String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14532("喵喵喵呜喵呜喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵呜喵喵喵喵呜~喵喵喵喵呜喵呜呜~喵喵喵呜呜喵喵喵"), String.class, String.class, cls), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(641), String.class, String.class, cls2), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14532("喵喵喵呜喵呜喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵呜喵喵呜喵喵~喵喵喵喵呜喵呜喵~喵喵喵喵喵喵呜喵~喵喵喵喵喵呜呜喵"), String.class, String.class, cls3), qQNTPluginMethod));
        String strM145312 = AbstractC9234.m14531(642);
        Class cls4 = Float.TYPE;
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(strM145312, String.class, String.class, cls4), qQNTPluginMethod));
        String strM145313 = AbstractC9234.m14531(643);
        Class cls5 = Double.TYPE;
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(strM145313, String.class, String.class, cls5), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(644), String.class, String.class, cls4), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(645), String.class, String.class, cls5), qQNTPluginMethod));
    }

    private void registerFileMethod(NameSpace nameSpace, QQNTPluginMethod qQNTPluginMethod) {
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(668), String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(669), String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(670), String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(671), String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(672), String.class, byte[].class), qQNTPluginMethod));
    }

    private static void registerGetInfoMethod(NameSpace nameSpace, QQNTPluginMethod qQNTPluginMethod) {
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(613), String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(614), String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(615), null), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(616), String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(617), String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(618), String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(511), null), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(619), null), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(620), null), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(621), null), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(622), String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(623), String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(624), null), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(625), String.class, String.class, Integer.TYPE), qQNTPluginMethod));
    }

    private void registerHttpMethod(NameSpace nameSpace, QQNTPluginMethod qQNTPluginMethod) {
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14532("喵喵喵呜呜喵呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜呜呜喵~喵喵喵呜呜喵喵喵~喵喵呜喵喵喵呜喵~喵喵喵喵呜喵喵呜~喵喵喵呜喵呜喵呜"), String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14532("喵喵喵呜呜喵呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜呜呜喵~喵喵喵呜呜喵喵喵~喵喵呜喵喵喵呜喵~喵喵喵喵呜喵喵呜~喵喵喵呜喵呜喵呜"), String.class, Map.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(652), String.class, Map.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(652), String.class, Map.class, Map.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(653), String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(653), String.class, Map.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(654), String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(654), String.class, String.class, Map.class), qQNTPluginMethod));
    }

    private void registerMenuMethod(NameSpace nameSpace, QQNTPluginMethod qQNTPluginMethod) {
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14532("喵喵喵呜喵喵呜喵~喵喵喵呜喵喵喵呜~喵喵喵呜呜呜呜喵~喵喵呜喵喵喵喵呜~喵喵喵呜喵喵喵呜~喵喵喵喵呜喵喵呜~喵喵喵喵呜呜喵喵"), String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14532("喵喵喵呜喵喵呜喵~喵喵喵呜喵喵喵呜~喵喵喵呜呜呜呜喵~喵喵呜喵喵喵喵呜~喵喵喵呜喵喵喵呜~喵喵喵喵呜喵喵呜~喵喵喵喵呜呜喵喵"), String.class, String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(634), String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(635), String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(635), String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(636), String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(637), String.class, String.class), qQNTPluginMethod));
    }

    private void registerOcrMethod(NameSpace nameSpace, QQNTPluginMethod qQNTPluginMethod) {
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(673), String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(674), String.class), qQNTPluginMethod));
    }

    private void registerOtherMethod(NameSpace nameSpace, QQNTPluginMethod qQNTPluginMethod) {
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14532("喵喵喵喵喵呜呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵呜呜喵呜呜~喵喵喵呜喵喵喵呜"), Object.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(82), null), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14532("喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵喵呜呜喵喵"), String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14532("喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵喵呜呜喵喵~喵喵呜喵喵喵喵呜~喵喵喵喵呜喵喵呜~喵喵喵呜呜喵喵呜"), String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14532("喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵喵呜呜喵喵~喵喵呜喵呜呜呜呜~喵喵喵喵呜呜喵呜~喵喵喵呜喵喵呜呜"), String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14532("喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵喵呜呜喵喵~喵喵呜喵喵呜喵喵~喵喵喵喵呜呜喵呜~喵喵喵呜喵喵呜呜"), String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14532("喵喵喵呜喵呜呜喵~喵喵喵喵喵喵呜呜~喵喵喵呜呜喵呜呜~喵喵喵喵喵呜喵喵"), String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14532("喵喵喵呜喵呜呜喵~喵喵喵喵喵呜呜呜~喵喵喵喵呜喵喵喵~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜呜呜"), Throwable.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14532("喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜呜呜喵呜"), Object.class), qQNTPluginMethod));
    }

    private void registerPluginImports() {
        this.pluginInfo.getInterpreter().getNameSpace().importPackage(AbstractC9234.m14531(675));
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
        nameSpace.setVariable(AbstractC9234.m14532("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵呜"), AbstractC7187.f17852);
        nameSpace.setVariable(AbstractC9234.m14531(629), this.pluginInfo.getPluginID());
        nameSpace.setVariable(AbstractC9234.m14532("喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵"), AbstractC7187.f17852.getClassLoader());
        nameSpace.setVariable(AbstractC9234.m14532("喵喵喵呜喵喵呜喵~喵喵喵喵喵呜喵呜~喵喵喵喵呜喵呜喵~喵喵呜呜呜喵喵喵~喵喵喵喵喵呜喵喵~喵喵喵呜呜喵喵喵~喵喵喵喵呜喵喵呜"), this.pluginInfo.getPluginLocalPath());
        nameSpace.setVariable(AbstractC9234.m14532("喵喵喵呜呜呜呜喵~喵喵喵喵呜呜喵喵~喵喵呜喵呜呜呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜喵呜呜"), QQEnvTool.getCurrentUin());
    }

    private void registerSKeyMethod(NameSpace nameSpace, QQNTPluginMethod qQNTPluginMethod) {
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(646), null), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(647), null), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(648), null), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14532("喵喵喵呜喵呜喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵呜呜呜喵呜呜~喵喵喵喵呜呜呜喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜喵喵喵"), null), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(649), String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(650), null), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(651), String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14532("喵喵喵呜喵呜喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵呜喵呜喵呜喵~喵喵呜喵呜呜呜喵~喵喵呜喵喵喵呜喵"), String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14532("喵喵喵呜喵呜喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵呜喵呜呜呜呜~喵喵呜呜喵喵喵呜~喵喵呜喵喵呜呜呜"), String.class), qQNTPluginMethod));
    }

    private void registerSendMsgMethod(NameSpace nameSpace, QQNTPluginMethod qQNTPluginMethod) {
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵呜喵呜喵喵喵~喵喵喵呜呜呜呜呜~喵喵喵喵喵呜呜喵"), String.class, String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵呜呜喵呜喵呜~喵喵喵喵喵呜喵呜~喵喵喵喵喵喵呜喵"), String.class, String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(655), String.class, String.class, String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(656), String.class, String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(657), String.class, String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(658), String.class), qQNTPluginMethod));
        String strM14531 = AbstractC9234.m14531(658);
        Class cls = Integer.TYPE;
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(strM14531, String.class, cls), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(659), String.class, Object.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵呜呜喵呜喵呜~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵喵喵"), String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(660), Object.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(660), Object.class, cls, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(661), String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(662), String.class, String.class, Object.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(663), String.class, String.class, cls), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(664), String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(665), String.class, String.class, cls), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(666), String.class, String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(667), String.class, String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵呜呜喵喵喵呜~喵喵喵喵喵呜喵呜~喵喵喵呜喵喵喵呜"), Object.class, String.class), qQNTPluginMethod));
    }

    private void registerTroopMethod(NameSpace nameSpace, QQNTPluginMethod qQNTPluginMethod) {
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵呜喵呜喵呜呜~喵喵喵喵喵呜喵喵~喵喵喵呜呜呜呜喵~喵喵喵喵喵呜喵呜"), String.class, String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(630), String.class, String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(631), Object.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(632), Object.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14531(633), String.class, String.class, Integer.TYPE), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC9234.m14532("喵喵喵呜呜喵喵喵~喵喵喵呜呜呜喵喵~喵喵喵呜呜喵喵呜~喵喵喵喵喵喵呜呜"), String.class, String.class, Boolean.TYPE), qQNTPluginMethod));
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
        String str = this.pluginInfo.getPluginLocalPath() + AbstractC9234.m14531(626);
        if (!new File(str).exists()) {
            C6755.m11866(AbstractC9234.m14531(627));
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
            this.pluginInfo.getInterpreter().eval(AbstractC5894.m10587(str));
        } finally {
        }
    }

    public void onLoad() {
        PluginManager.invokeToPluginMethod(this, AbstractC9234.m14532("喵喵喵呜呜呜喵喵~喵喵喵呜呜喵呜呜~喵喵呜呜喵呜呜喵~喵喵喵喵喵呜呜呜~喵喵喵喵喵呜喵喵~喵喵喵喵呜喵喵喵"), new Object[0]);
    }

    public void stopPlugin() {
        PluginManager.invokeToPluginMethod(this, AbstractC9234.m14531(628), new Object[0]);
        this.pluginInfo.getInterpreter().getNameSpace().clear();
    }

    public String toString() {
        return AbstractC9234.m14531(676) + this.pluginInfo + AbstractC9234.m14531(677) + this.dialogItemMap + '}';
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class FixClassLoader extends ClassLoader {
        private final List<ClassLoader> loaders;

        private FixClassLoader() {
            super(ClassLoader.getSystemClassLoader());
            ArrayList arrayList = new ArrayList();
            this.loaders = arrayList;
            arrayList.add(AbstractC7166.f17805);
            arrayList.add(AbstractC7166.f17806);
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
