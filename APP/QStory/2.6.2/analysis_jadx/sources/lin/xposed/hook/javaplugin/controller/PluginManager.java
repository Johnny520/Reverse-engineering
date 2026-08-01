package lin.xposed.hook.javaplugin.controller;

import androidx.activity.AbstractC0053;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.fragment.app.RunnableC2346;
import bsh.BshMethod;
import bsh.Interpreter;
import com.bumptech.glide.AbstractC3056;
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
import lin.xposed.hook.javaplugin.PluginOutput;
import lin.xposed.hook.javaplugin.bean.PluginInfo;
import lin.xposed.hook.javaplugin.view.PluginItemView;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import p010.AbstractC6154;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class PluginManager {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Map<String, PluginLoader> pluginLoaderMap = new ConcurrentHashMap();
    private static final ExecutorService pluginCallbackMethodTaskExecutor = Executors.newCachedThreadPool();

    private static String buildMethodSign(String str, Object... objArr) {
        if (objArr == null) {
            objArr = new Class[0];
        }
        StringBuilder sbM149 = AbstractC0053.m149(str);
        sbM149.append(AbstractC3056.m6668(-3937587577100699047L));
        sbM149.append(objArr.length);
        sbM149.append(AbstractC3056.m6668(-3937587482611418535L));
        return sbM149.toString();
    }

    private static boolean checkPluginTime(PluginInfo pluginInfo) {
        if (pluginInfo.getDate() == null) {
            return false;
        }
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendPattern = new DateTimeFormatterBuilder().appendPattern(AbstractC3056.m6668(-3937629766564447655L));
        ChronoField chronoField = ChronoField.MONTH_OF_YEAR;
        SignStyle signStyle = SignStyle.NORMAL;
        DateTimeFormatter formatter = dateTimeFormatterBuilderAppendPattern.appendValue(chronoField, 1, 2, signStyle).appendLiteral(SignatureVisitor.SUPER).appendValue(ChronoField.DAY_OF_MONTH, 1, 2, signStyle).toFormatter();
        return LocalDate.parse(pluginInfo.getDate(), formatter).isAfter(LocalDate.parse(AbstractC3056.m6668(-3937629689255036327L), formatter));
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
        pluginCallbackMethodTaskExecutor.execute(new RunnableC2346(pluginLoader, str, objArr, 1));
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
            new PluginOutput(pluginLoader.getJavaPluginInfo()).e(th);
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
            new PluginOutput(javaPluginInfo).e(th);
        }
    }

    public static synchronized boolean loadPlugin(PluginItemView pluginItemView, PluginInfo pluginInfo) {
        try {
            if (!checkPluginTime(pluginInfo)) {
                if (pluginItemView != null) {
                    pluginItemView.notificationError();
                }
                AbstractC6154.m11561(AbstractC3056.m6668(-3937629985607779751L) + pluginInfo.getPluginName() + AbstractC3056.m6668(-3937629972722877863L));
                return false;
            }
            Map<String, PluginLoader> map = pluginLoaderMap;
            if (map.containsKey(pluginInfo.getPluginID())) {
                if (pluginItemView != null) {
                    pluginItemView.notificationError();
                }
                AbstractC6154.m11561(AbstractC3056.m6668(-3937629861053728167L) + pluginInfo.getPluginID());
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
            properties.load(new FileReader(new File(file, AbstractC3056.m6668(-3937630251895752103L))));
            pluginInfo.setPluginID(properties.getProperty(AbstractC3056.m6668(-3937592030981784999L), UUID.randomUUID().toString().replace(AbstractC3056.m6668(-3937630191766209959L), AbstractC3056.m6668(-3937561979095614887L))));
            pluginInfo.setPluginName(properties.getProperty(AbstractC3056.m6668(-3937597717518484903L), null));
            pluginInfo.setPluginAuthor(properties.getProperty(AbstractC3056.m6668(-3937630200356144551L), null));
            pluginInfo.setPluginVersion(properties.getProperty(AbstractC3056.m6668(-3937630092981962151L), null));
            pluginInfo.setDate(properties.getProperty(AbstractC3056.m6668(-3937630127341700519L), null));
            pluginInfo.setTags(properties.getProperty(AbstractC3056.m6668(-3937630114456798631L), AbstractC3056.m6668(-3937561979095614887L)));
            pluginInfo.setPluginLocalPath(file.getAbsolutePath());
            File file2 = new File(file, AbstractC3056.m6668(-3937630032852420007L));
            if (file2.exists()) {
                pluginInfo.setPluginDesc(AbstractC0455.m1142(file2.getAbsolutePath()));
            }
            File file3 = new File(file, AbstractC3056.m6668(-3937630037147387303L));
            if (file3.exists() && file3.isDirectory() && (fileArrListFiles = file3.listFiles()) != null) {
                int length = fileArrListFiles.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    File file4 = fileArrListFiles[i];
                    if (file4.getName().startsWith(AbstractC3056.m6668(-3937629964132943271L))) {
                        pluginInfo.setIconPath(file4.getAbsolutePath());
                        break;
                    }
                    i++;
                }
                for (File file5 : fileArrListFiles) {
                    if (!file5.getName().startsWith(AbstractC3056.m6668(-3937629964132943271L))) {
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
