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
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937615399898842535L), String.class, String.class, String.class), qQNTPluginMethod));
        String strM6668 = AbstractC3056.m6668(-3937615305409562023L);
        Class cls = Integer.TYPE;
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(strM6668, String.class, String.class, cls), qQNTPluginMethod));
        String strM66682 = AbstractC3056.m6668(-3937615335474333095L);
        Class cls2 = Boolean.TYPE;
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(strM66682, String.class, String.class, cls2), qQNTPluginMethod));
        String strM66683 = AbstractC3056.m6668(-3937615279639758247L);
        Class cls3 = Long.TYPE;
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(strM66683, String.class, String.class, cls3), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937615176560543143L), String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937615176560543143L), String.class, String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937615219510216103L), String.class, String.class, cls), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937615112136033703L), String.class, String.class, cls2), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937615125020935591L), String.class, String.class, cls3), qQNTPluginMethod));
        String strM66684 = AbstractC3056.m6668(-3937615021941720487L);
        Class cls4 = Float.TYPE;
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(strM66684, String.class, String.class, cls4), qQNTPluginMethod));
        String strM66685 = AbstractC3056.m6668(-3937615060596426151L);
        Class cls5 = Double.TYPE;
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(strM66685, String.class, String.class, cls5), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937632558293190055L), String.class, String.class, cls4), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937632493868680615L), String.class, String.class, cls5), qQNTPluginMethod));
    }

    private void registerFileMethod(NameSpace nameSpace, QQNTPluginMethod qQNTPluginMethod) {
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937630982040192423L), String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937631003515028903L), String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937630934795552167L), String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937630788766664103L), String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937630711457252775L), String.class, byte[].class), qQNTPluginMethod));
    }

    private static void registerGetInfoMethod(NameSpace nameSpace, QQNTPluginMethod qQNTPluginMethod) {
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937617117885760935L), String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937617074936087975L), String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937616958971970983L), null), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937616877367592359L), String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937616834417919399L), String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937616744223606183L), String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937609185081165223L), null), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937616679799096743L), null), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937616662619227559L), null), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937616572424914343L), null), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937616529475241383L), String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937616396331255207L), String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937616331906745767L), null), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937616267482236327L), String.class, String.class, Integer.TYPE), qQNTPluginMethod));
    }

    private void registerHttpMethod(NameSpace nameSpace, QQNTPluginMethod qQNTPluginMethod) {
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937632115911558567L), String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937632115911558567L), String.class, Map.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937632012832343463L), String.class, Map.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937632012832343463L), String.class, Map.class, Map.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937632051487049127L), String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937632051487049127L), String.class, Map.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937631935522932135L), String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937631935522932135L), String.class, String.class, Map.class), qQNTPluginMethod));
    }

    private void registerMenuMethod(NameSpace nameSpace, QQNTPluginMethod qQNTPluginMethod) {
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937615704841520551L), String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937615704841520551L), String.class, String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937615601762305447L), String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937615502978057639L), String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937615502978057639L), String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937615550222697895L), String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937615382718973351L), String.class, String.class), qQNTPluginMethod));
    }

    private void registerOcrMethod(NameSpace nameSpace, QQNTPluginMethod qQNTPluginMethod) {
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937630647032743335L), String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937630569723332007L), String.class), qQNTPluginMethod));
    }

    private void registerOtherMethod(NameSpace nameSpace, QQNTPluginMethod qQNTPluginMethod) {
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937631282687903143L), Object.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937570908332623271L), null), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937631171018753447L), String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937631226853328295L), String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937631123774113191L), String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937631158133851559L), String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937631055054636455L), String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937631042169734567L), Throwable.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937631067939538343L), Object.class), qQNTPluginMethod));
    }

    private void registerPluginImports() {
        this.pluginInfo.getInterpreter().getNameSpace().importPackage(AbstractC3056.m6668(-3937630483823986087L));
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
        nameSpace.setVariable(AbstractC3056.m6668(-3937616005489231271L), AbstractC6340.f17460);
        nameSpace.setVariable(AbstractC3056.m6668(-3937616039848969639L), this.pluginInfo.getPluginID());
        nameSpace.setVariable(AbstractC3056.m6668(-3937615941064721831L), AbstractC6340.f17460.getClassLoader());
        nameSpace.setVariable(AbstractC3056.m6668(-3937615971129492903L), this.pluginInfo.getPluginLocalPath());
        nameSpace.setVariable(AbstractC3056.m6668(-3937615868050277799L), QQEnvTool.getCurrentUin());
    }

    private void registerSKeyMethod(NameSpace nameSpace, QQNTPluginMethod qQNTPluginMethod) {
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937632536818353575L), null), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937632420854236583L), null), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937632343544825255L), null), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937632292005217703L), null), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937632326364956071L), String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937632227580708263L), null), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937632244760577447L), String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937632193220969895L), String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937632085846787495L), String.class), qQNTPluginMethod));
    }

    private void registerSendMsgMethod(NameSpace nameSpace, QQNTPluginMethod qQNTPluginMethod) {
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937579786030024103L), String.class, String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937631888278291879L), String.class, String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937631922638030247L), String.class, String.class, String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937631802378945959L), String.class, String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937631737954436519L), String.class, String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937631776609142183L), String.class), qQNTPluginMethod));
        String strM6668 = AbstractC3056.m6668(-3937631776609142183L);
        Class cls = Integer.TYPE;
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(strM6668, String.class, cls), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937631677824894375L), String.class, Object.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937631686414828967L), String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937631583335613863L), Object.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937631583335613863L), Object.class, cls, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937631630580254119L), String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937631570450711975L), String.class, String.class, Object.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937631445896660391L), String.class, String.class, cls), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937631493141300647L), String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937631433011758503L), String.class, String.class, cls), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937631334227510695L), String.class, String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937631342817445287L), String.class, String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937631248328164775L), Object.class, String.class), qQNTPluginMethod));
    }

    private void registerTroopMethod(NameSpace nameSpace, QQNTPluginMethod qQNTPluginMethod) {
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937615859460343207L), String.class, String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937615893820081575L), String.class, String.class, String.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937615829395572135L), Object.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937615734906291623L), Object.class), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937615743496226215L), String.class, String.class, Integer.TYPE), qQNTPluginMethod));
        nameSpace.setMethod(new BshMethod(QQNTPluginMethod.class.getMethod(AbstractC3056.m6668(-3937615649006945703L), String.class, String.class, Boolean.TYPE), qQNTPluginMethod));
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
        String str = this.pluginInfo.getPluginLocalPath() + AbstractC3056.m6668(-3937616194467792295L);
        if (!new File(str).exists()) {
            C5919.m11246(AbstractC3056.m6668(-3937616138633217447L));
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
        PluginManager.invokeToPluginMethod(this, AbstractC3056.m6668(-3937616074208708007L), new Object[0]);
    }

    public void stopPlugin() {
        PluginManager.invokeToPluginMethod(this, AbstractC3056.m6668(-3937616104273479079L), new Object[0]);
        this.pluginInfo.getInterpreter().getNameSpace().clear();
    }

    public String toString() {
        return AbstractC3056.m6668(-3937630346385032615L) + this.pluginInfo + AbstractC3056.m6668(-3937630316320261543L) + this.dialogItemMap + '}';
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
