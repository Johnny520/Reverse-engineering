package lin.xposed.hook.javaplugin.controller;

import androidx.activity.AbstractC0900;
import androidx.fragment.app.RunnableC3179;
import bsh.BshMethod;
import bsh.Interpreter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.SignStyle;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.reflect.jvm.internal.AbstractC5894;
import lin.xposed.hook.javaplugin.PluginOutput;
import lin.xposed.hook.javaplugin.bean.PluginInfo;
import lin.xposed.hook.javaplugin.view.PluginItemView;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import p026.AbstractC7014;
import p303.AbstractC9234;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class PluginManager {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Map<String, PluginLoader> pluginLoaderMap = new ConcurrentHashMap();
    private static final ExecutorService pluginCallbackMethodTaskExecutor = Executors.newCachedThreadPool();

    private static String buildMethodSign(String str, Object... objArr) {
        if (objArr == null) {
            objArr = new Class[0];
        }
        StringBuilder sbM700 = AbstractC0900.m700(str);
        sbM700.append(AbstractC9234.m14532("喵呜喵呜呜喵呜呜"));
        sbM700.append(objArr.length);
        sbM700.append(AbstractC9234.m14532("喵呜喵呜呜喵呜喵"));
        return sbM700.toString();
    }

    private static boolean checkPluginTime(PluginInfo pluginInfo) {
        if (pluginInfo.getDate() == null) {
            return false;
        }
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendPattern = new DateTimeFormatterBuilder().appendPattern(AbstractC9234.m14532("喵喵喵喵呜喵呜喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵呜呜~喵喵喵呜喵喵喵呜~喵呜喵喵呜喵喵喵"));
        ChronoField chronoField = ChronoField.MONTH_OF_YEAR;
        SignStyle signStyle = SignStyle.NORMAL;
        DateTimeFormatter formatter = dateTimeFormatterBuilderAppendPattern.appendValue(chronoField, 1, 2, signStyle).appendLiteral(SignatureVisitor.SUPER).appendValue(ChronoField.DAY_OF_MONTH, 1, 2, signStyle).toFormatter();
        return LocalDate.parse(pluginInfo.getDate(), formatter).isAfter(LocalDate.parse(AbstractC9234.m14531(683), formatter));
    }

    public static Collection<PluginLoader> getAllRunningPluginLoader() {
        return pluginLoaderMap.values();
    }

    public static void invokeInAllScriptCallbackMethod(String str, Object... objArr) {
        Iterator<PluginLoader> it = pluginLoaderMap.values().iterator();
        while (it.hasNext()) {
            invokeToPluginMethod(it.next(), str, objArr);
        }
    }

    public static void invokeToPluginMethod(PluginLoader pluginLoader, String str, Object... objArr) {
        pluginCallbackMethodTaskExecutor.execute(new RunnableC3179(pluginLoader, str, objArr, 1));
    }

    public static Object invokeToPluginMethodAndGetInvokeResult(PluginLoader pluginLoader, String str, Object... objArr) {
        try {
            Interpreter interpreter = pluginLoader.getJavaPluginInfo().getInterpreter();
            Map<String, BshMethod> map = pluginLoader.methodCache;
            String strBuildMethodSign = buildMethodSign(str, objArr);
            if (map.containsKey(strBuildMethodSign)) {
                return map.get(strBuildMethodSign).invoke(objArr, interpreter);
            }
            for (BshMethod bshMethod : interpreter.getNameSpace().getMethods()) {
                if (bshMethod.getName().equals(str) && bshMethod.getParameterTypes().length == objArr.length) {
                    return bshMethod.invoke(objArr, interpreter);
                }
            }
            return null;
        } catch (Throwable th) {
            new PluginOutput(pluginLoader.getJavaPluginInfo()).m157e(th);
            return null;
        }
    }

    public static boolean isRunning(String str) {
        return pluginLoaderMap.containsKey(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$invokeToPluginMethod$0(PluginLoader pluginLoader, String str, Object[] objArr) {
        PluginInfo javaPluginInfo = pluginLoader.getJavaPluginInfo();
        try {
            Interpreter interpreter = javaPluginInfo.getInterpreter();
            for (BshMethod bshMethod : interpreter.getNameSpace().getMethods()) {
                if (bshMethod.getName().equals(str) && bshMethod.getParameterTypes().length == objArr.length) {
                    bshMethod.invoke(objArr, interpreter);
                    return;
                }
            }
        } catch (Throwable th) {
            new PluginOutput(javaPluginInfo).m157e(th);
        }
    }

    public static synchronized boolean loadPlugin(PluginItemView pluginItemView, PluginInfo pluginInfo) {
        try {
            if (!checkPluginTime(pluginInfo)) {
                if (pluginItemView != null) {
                    pluginItemView.notificationError();
                }
                AbstractC7014.m12151(AbstractC9234.m14531(680) + pluginInfo.getPluginName() + AbstractC9234.m14531(681));
                return false;
            }
            Map<String, PluginLoader> map = pluginLoaderMap;
            if (map.containsKey(pluginInfo.getPluginID())) {
                if (pluginItemView != null) {
                    pluginItemView.notificationError();
                }
                AbstractC7014.m12151(AbstractC9234.m14531(682) + pluginInfo.getPluginID());
                return false;
            }
            try {
                PluginLoader pluginLoader = new PluginLoader(pluginInfo);
                pluginLoader.loadPlugin();
                map.put(pluginInfo.getPluginID(), pluginLoader);
                return true;
            } catch (Throwable unused) {
                if (pluginItemView != null) {
                    pluginItemView.notificationError();
                }
                return false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static PluginInfo newPluginInfo(File file) {
        File[] fileArrListFiles;
        Properties properties = new Properties();
        PluginInfo pluginInfo = new PluginInfo();
        try {
            properties.load(new FileReader(new File(file, AbstractC9234.m14531(678))));
            pluginInfo.setPluginID(properties.getProperty(AbstractC9234.m14532("喵喵喵呜呜喵呜喵~喵喵喵呜喵喵喵呜"), UUID.randomUUID().toString().replace(AbstractC9234.m14532("喵呜喵呜呜呜呜喵"), "")));
            pluginInfo.setPluginName(properties.getProperty(AbstractC9234.m14532("喵喵喵呜呜呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜呜喵呜"), null));
            pluginInfo.setPluginAuthor(properties.getProperty(AbstractC9234.m14532("喵喵喵呜喵喵呜喵~喵喵喵喵喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵喵喵喵喵~喵喵喵喵呜喵呜喵~喵喵喵呜呜呜呜喵"), null));
            pluginInfo.setPluginVersion(properties.getProperty(AbstractC9234.m14532("喵喵喵喵喵呜喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜喵喵喵~喵喵喵呜呜喵呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵呜呜~喵喵喵喵呜呜呜呜"), null));
            pluginInfo.setDate(properties.getProperty(AbstractC9234.m14532("喵喵喵呜喵呜呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵呜呜喵呜"), null));
            pluginInfo.setTags(properties.getProperty(AbstractC9234.m14532("喵喵喵喵喵呜呜呜~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜呜"), ""));
            pluginInfo.setPluginLocalPath(file.getAbsolutePath());
            File file2 = new File(file, AbstractC9234.m14531(679));
            if (file2.exists()) {
                pluginInfo.setPluginDesc(AbstractC5894.m10587(file2.getAbsolutePath()));
            }
            File file3 = new File(file, AbstractC9234.m14532("喵喵喵呜呜喵呜喵~喵喵喵呜呜喵喵喵~喵喵喵呜呜喵呜呜~喵喵喵喵呜呜呜呜~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜呜"));
            if (file3.exists() && file3.isDirectory() && (fileArrListFiles = file3.listFiles()) != null) {
                int length = fileArrListFiles.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    File file4 = fileArrListFiles[i];
                    if (file4.getName().startsWith(AbstractC9234.m14532("喵喵喵呜呜喵呜喵~喵喵喵呜喵呜呜喵~喵喵喵呜喵呜喵呜~喵喵喵喵喵呜呜喵"))) {
                        pluginInfo.setIconPath(file4.getAbsolutePath());
                        break;
                    }
                    i++;
                }
                for (File file5 : fileArrListFiles) {
                    if (!file5.getName().startsWith(AbstractC9234.m14532("喵喵喵呜呜喵呜喵~喵喵喵呜喵呜呜喵~喵喵喵呜喵呜喵呜~喵喵喵喵喵呜呜喵"))) {
                        List<String> previewPaths = pluginInfo.getPreviewPaths();
                        if (previewPaths == null) {
                            previewPaths = new ArrayList<>();
                            pluginInfo.setPreviewPaths(previewPaths);
                        }
                        previewPaths.add(file5.getAbsolutePath());
                    }
                }
                if (pluginInfo.getPreviewPaths() != null) {
                    Collections.sort(pluginInfo.getPreviewPaths());
                }
            }
            return pluginInfo;
        } catch (IOException unused) {
            return null;
        }
    }

    public static void stopAllPlugin() {
        Iterator<PluginLoader> it = getAllRunningPluginLoader().iterator();
        while (it.hasNext()) {
            stopPlugin(it.next().getJavaPluginInfo());
        }
        pluginLoaderMap.clear();
    }

    public static void stopPlugin(PluginInfo pluginInfo) {
        String pluginID = pluginInfo.getPluginID();
        Map<String, PluginLoader> map = pluginLoaderMap;
        PluginLoader pluginLoader = map.get(pluginID);
        if (pluginLoader == null) {
            return;
        }
        pluginLoader.stopPlugin();
        map.remove(pluginID);
    }
}
