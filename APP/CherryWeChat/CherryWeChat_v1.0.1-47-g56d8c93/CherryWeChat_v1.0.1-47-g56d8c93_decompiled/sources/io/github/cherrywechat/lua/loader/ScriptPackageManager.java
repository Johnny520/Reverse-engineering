package io.github.cherrywechat.lua.loader;

import android.app.Activity;
import android.app.AndroidAppHelper;
import android.content.Context;
import io.github.cherrywechat.application.MainApplication;
import io.github.cherrywechat.lua.LuaEngine;
import io.github.cherrywechat.lua.api.CherryAPI;
import io.github.cherrywechat.lua.loader.ScriptPackageManager;
import java.io.File;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import p000.AbstractC0213Ey;
import p000.AbstractC0295Gu;
import p000.AbstractC0585Nj;
import p000.AbstractC0621Oc;
import p000.AbstractC0671Pj;
import p000.AbstractC2374ph;
import p000.AbstractC2453ra;
import p000.AbstractC2607uz;
import p000.AbstractC2675wh;
import p000.C0297Gw;
import p000.C1456gf;
import p000.C2390px;

/* JADX INFO: loaded from: classes.dex */
public final class ScriptPackageManager {
    private static final String TAG = AbstractC0295Gu.m625r(-353686261856309L);
    private static final String PACKAGES_DIR = AbstractC0295Gu.m625r(-352127188727861L);
    public static final ScriptPackageManager INSTANCE = new ScriptPackageManager();
    private static final ConcurrentHashMap<String, ScriptPackage> loadedPackages = new ConcurrentHashMap<>();

    private ScriptPackageManager() {
    }

    private final void setupScriptGlobals(ScriptPackage scriptPackage) {
        LuaEngine luaEngine = LuaEngine.INSTANCE;
        luaEngine.setGlobal(AbstractC0295Gu.m625r(-379271382038581L), scriptPackage.getId());
        luaEngine.setGlobal(AbstractC0295Gu.m625r(-379310036744245L), scriptPackage.getVersion());
        luaEngine.setGlobal(AbstractC0295Gu.m625r(-378820410472501L), scriptPackage.getName());
        luaEngine.setGlobal(AbstractC0295Gu.m625r(-378867655112757L), scriptPackage.getAuthor());
        luaEngine.setGlobal(AbstractC0295Gu.m625r(-378923489687605L), scriptPackage.getPath());
        try {
            luaEngine.setGlobal(AbstractC0295Gu.m625r(-378962144393269L), C1456gf.m2783A());
            luaEngine.setGlobal(AbstractC0295Gu.m625r(-379000799098933L), C1456gf.m2791I());
            luaEngine.setGlobal(AbstractC0295Gu.m625r(-379026568902709L), C1456gf.m2783A().getClassLoader());
        } catch (Exception e) {
            AbstractC0213Ey.m411i(-379056633673781L, -359905374500917L, e);
        }
        CherryAPI cherryAPI = CherryAPI.INSTANCE;
        Context contextCurrentApplication = MainApplication.f5549a;
        if (contextCurrentApplication == null && (contextCurrentApplication = C1456gf.f5172p) == null) {
            contextCurrentApplication = AndroidAppHelper.currentApplication();
            AbstractC0295Gu.m625r(-836852902787125L);
        }
        cherryAPI.setCurrentContext(contextCurrentApplication);
        WeakReference weakReference = C1456gf.f5173q;
        cherryAPI.setCurrentActivity(weakReference != null ? (Activity) weakReference.get() : null);
    }

    /* JADX INFO: renamed from: createPackageTemplate-BWLJW6A, reason: not valid java name */
    public final Object m5476createPackageTemplateBWLJW6A(Context context, String str, String str2, String str3) {
        AbstractC0295Gu.m625r(-359402863327285L);
        AbstractC0295Gu.m625r(-359437223065653L);
        AbstractC0295Gu.m625r(-359480172738613L);
        AbstractC0295Gu.m625r(-359501647575093L);
        File file = new File(getPackagesDir(context), str);
        if (file.exists()) {
            return new C0297Gw(new IllegalArgumentException(AbstractC0295Gu.m625r(-359531712346165L).concat(str)));
        }
        try {
            file.mkdirs();
            AbstractC2675wh.m5246i0(new File(file, AbstractC0295Gu.m625r(-359089330714677L)), AbstractC2607uz.m5118D(AbstractC0295Gu.m625r(-359132280387637L) + str2 + AbstractC0295Gu.m625r(-359231064635445L) + str3 + AbstractC0295Gu.m625r(-357818020395061L) + str + AbstractC0295Gu.m625r(-357358458894389L)));
            AbstractC2675wh.m5246i0(new File(file, AbstractC0295Gu.m625r(-357418588436533L)), AbstractC2607uz.m5118D(AbstractC0295Gu.m625r(-357457243142197L) + str2 + AbstractC0295Gu.m625r(-357547437455413L) + str3 + AbstractC0295Gu.m625r(-358204567451701L) + str2 + AbstractC0295Gu.m625r(-357998409021493L) + str2 + AbstractC0295Gu.m625r(-355752141125685L) + str2 + AbstractC0295Gu.m625r(-354721348974645L)));
            File file2 = new File(file, AbstractC0295Gu.m625r(-353381319178293L));
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(AbstractC0295Gu.m625r(-353419973883957L));
            sb.append(str3);
            sb.append(AbstractC0295Gu.m625r(-353445743687733L));
            AbstractC2675wh.m5246i0(file2, sb.toString());
            String absolutePath = file.getAbsolutePath();
            AbstractC0295Gu.m625r(-353475808458805L);
            ScriptPackage scriptPackageLoadPackageInfo = loadPackageInfo(absolutePath);
            if (scriptPackageLoadPackageInfo == null) {
                return new C0297Gw(new IllegalStateException(AbstractC0295Gu.m625r(-353016246958133L)));
            }
            AbstractC0295Gu.m625r(-353123621140533L);
            AbstractC0295Gu.m625r(-353213815453749L);
            return scriptPackageLoadPackageInfo;
        } catch (Exception e) {
            AbstractC2675wh.m5239b0(file);
            AbstractC0295Gu.m625r(-353879535384629L);
            AbstractC0295Gu.m625r(-353969729697845L);
            return new C0297Gw(e);
        }
    }

    /* JADX INFO: renamed from: executePackage-gIAlu-s, reason: not valid java name */
    public final Object m5478executePackagegIAlus(Context context, String str) {
        AbstractC0295Gu.m625r(-380426728241205L);
        AbstractC0295Gu.m625r(-379911332165685L);
        ScriptPackage scriptPackageLoadPackageInfo = loadedPackages.get(str);
        if (scriptPackageLoadPackageInfo == null) {
            String absolutePath = new File(getPackagesDir(context), str).getAbsolutePath();
            AbstractC0295Gu.m625r(-379954281838645L);
            scriptPackageLoadPackageInfo = loadPackageInfo(absolutePath);
        }
        return scriptPackageLoadPackageInfo == null ? new C0297Gw(new IllegalArgumentException(AbstractC0295Gu.m625r(-380044476151861L).concat(str))) : m5477executePackagegIAlus(context, scriptPackageLoadPackageInfo);
    }

    public final List<ScriptPackage> getLoadedPackages() {
        Collection<ScriptPackage> collectionValues = loadedPackages.values();
        AbstractC0295Gu.m625r(-353566002772021L);
        return AbstractC2453ra.m4908r0(collectionValues);
    }

    public final File getPackagesDir(Context context) {
        AbstractC0295Gu.m625r(-381320081438773L);
        File file = new File(context.getFilesDir(), AbstractC0295Gu.m625r(-381354441177141L));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX INFO: renamed from: installPackage-gIAlu-s, reason: not valid java name */
    public final Object m5479installPackagegIAlus(Context context, File file) {
        AbstractC0295Gu.m625r(-360506669922357L);
        AbstractC0295Gu.m625r(-360541029660725L);
        String absolutePath = file.getAbsolutePath();
        AbstractC0295Gu.m625r(-360583979333685L);
        ScriptPackage scriptPackageLoadPackageInfo = loadPackageInfo(absolutePath);
        if (scriptPackageLoadPackageInfo == null) {
            return new C0297Gw(new IllegalArgumentException(AbstractC0295Gu.m625r(-360124417833013L)));
        }
        File file2 = new File(getPackagesDir(context), scriptPackageLoadPackageInfo.getId());
        try {
            if (file2.exists()) {
                AbstractC2675wh.m5239b0(file2);
            }
            AbstractC2675wh.m5237Z(file, file2);
            String absolutePath2 = file2.getAbsolutePath();
            AbstractC0295Gu.m625r(-360193137309749L);
            ScriptPackage scriptPackageLoadPackageInfo2 = loadPackageInfo(absolutePath2);
            if (scriptPackageLoadPackageInfo2 == null) {
                return new C0297Gw(new IllegalStateException(AbstractC0295Gu.m625r(-360283331622965L)));
            }
            AbstractC0295Gu.m625r(-358762913200181L);
            AbstractC0295Gu.m625r(-358853107513397L);
            scriptPackageLoadPackageInfo2.getName();
            return scriptPackageLoadPackageInfo2;
        } catch (Exception e) {
            AbstractC0295Gu.m625r(-358939006859317L);
            AbstractC0295Gu.m625r(-358479445358645L);
            return new C0297Gw(e);
        }
    }

    public final boolean isPackageRunning(String str) {
        AbstractC0295Gu.m625r(-353643312183349L);
        return loadedPackages.containsKey(str);
    }

    public final List<ScriptPackage> listPackages(Context context) {
        AbstractC0295Gu.m625r(-381410275751989L);
        File packagesDir = getPackagesDir(context);
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = packagesDir.listFiles(new C2390px(1));
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                ScriptPackageManager scriptPackageManager = INSTANCE;
                String absolutePath = file.getAbsolutePath();
                AbstractC0295Gu.m625r(-381444635490357L);
                ScriptPackage scriptPackageLoadPackageInfo = scriptPackageManager.loadPackageInfo(absolutePath);
                if (scriptPackageLoadPackageInfo != null) {
                    arrayList.add(scriptPackageLoadPackageInfo);
                }
            }
        }
        return AbstractC2453ra.m4904n0(arrayList, new Comparator() { // from class: io.github.cherrywechat.lua.loader.ScriptPackageManager$listPackages$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return AbstractC0671Pj.m1346d(((ScriptPackageManager.ScriptPackage) t).getName(), ((ScriptPackageManager.ScriptPackage) t2).getName());
            }
        });
    }

    public final ScriptPackage loadPackageInfo(String str) {
        String strM625r;
        AbstractC0295Gu.m625r(-380985073989685L);
        File file = new File(str);
        if (!file.exists() || !file.isDirectory()) {
            return null;
        }
        if (!new File(file, AbstractC0295Gu.m625r(-381036613597237L)).exists()) {
            AbstractC0295Gu.m625r(-381075268302901L);
            AbstractC0295Gu.m625r(-381165462616117L);
            return null;
        }
        File file2 = new File(file, AbstractC0295Gu.m625r(-379614979422261L));
        Properties properties = new Properties();
        if (file2.exists()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file2);
                try {
                    properties.load(fileInputStream);
                    fileInputStream.close();
                } finally {
                }
            } catch (Exception e) {
                AbstractC0213Ey.m411i(-379657929095221L, -379748123408437L, e);
            }
        }
        File file3 = new File(file, AbstractC0295Gu.m625r(-379864087525429L));
        if (file3.exists()) {
            try {
                strM625r = AbstractC2675wh.m5244g0(file3);
            } catch (Exception unused) {
                strM625r = AbstractC0295Gu.m625r(-379352986417205L);
            }
        } else {
            strM625r = properties.getProperty(AbstractC0295Gu.m625r(-379357281384501L), AbstractC0295Gu.m625r(-379408820992053L));
        }
        String str2 = strM625r;
        String property = properties.getProperty(AbstractC0295Gu.m625r(-379413115959349L), file.getName());
        AbstractC0295Gu.m625r(-379426000861237L);
        String property2 = properties.getProperty(AbstractC0295Gu.m625r(-379499015305269L), file.getName());
        AbstractC0295Gu.m625r(-379520490141749L);
        String property3 = properties.getProperty(AbstractC0295Gu.m625r(-379593504585781L), AbstractC0295Gu.m625r(-380177620138037L));
        AbstractC0295Gu.m625r(-380203389941813L);
        String property4 = properties.getProperty(AbstractC0295Gu.m625r(-380276404385845L), AbstractC0295Gu.m625r(-380306469156917L));
        AbstractC0295Gu.m625r(-380340828895285L);
        return new ScriptPackage(property, property2, property3, property4, str2, str, loadedPackages.containsKey(properties.getProperty(AbstractC0295Gu.m625r(-380413843339317L), file.getName())));
    }

    public final void stopAllPackages() {
        Collection<ScriptPackage> collectionValues = loadedPackages.values();
        AbstractC0295Gu.m625r(-359699216070709L);
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            ((ScriptPackage) it.next()).setRunning(false);
        }
        loadedPackages.clear();
        AbstractC0295Gu.m625r(-359776525482037L);
        AbstractC0295Gu.m625r(-360416475609141L);
    }

    public final boolean stopPackage(String str) {
        AbstractC0295Gu.m625r(-360038518487093L);
        ScriptPackage scriptPackageRemove = loadedPackages.remove(str);
        if (scriptPackageRemove == null) {
            return false;
        }
        scriptPackageRemove.setRunning(false);
        AbstractC0295Gu.m625r(-360081468160053L);
        AbstractC0295Gu.m625r(-359621906659381L);
        scriptPackageRemove.getName();
        return true;
    }

    public final boolean uninstallPackage(Context context, String str) {
        AbstractC0295Gu.m625r(-358591114508341L);
        AbstractC0295Gu.m625r(-358625474246709L);
        stopPackage(str);
        File file = new File(getPackagesDir(context), str);
        if (!file.exists()) {
            return false;
        }
        boolean zM5239b0 = AbstractC2675wh.m5239b0(file);
        if (zM5239b0) {
            AbstractC0295Gu.m625r(-358668423919669L);
            AbstractC0295Gu.m625r(-359308374046773L);
        }
        return zM5239b0;
    }

    public static final class ScriptPackage {
        private final String author;
        private final String description;

        /* JADX INFO: renamed from: id */
        private final String f5563id;
        private boolean isRunning;
        private final String name;
        private final String path;
        private final String version;

        public ScriptPackage(String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
            AbstractC0295Gu.m625r(-382149010126901L);
            AbstractC0295Gu.m625r(-382161895028789L);
            AbstractC0295Gu.m625r(-382183369865269L);
            AbstractC0295Gu.m625r(-382217729603637L);
            AbstractC0295Gu.m625r(-382247794374709L);
            AbstractC0295Gu.m625r(-382299333982261L);
            this.f5563id = str;
            this.name = str2;
            this.version = str3;
            this.author = str4;
            this.description = str5;
            this.path = str6;
            this.isRunning = z;
        }

        public static /* synthetic */ ScriptPackage copy$default(ScriptPackage scriptPackage, String str, String str2, String str3, String str4, String str5, String str6, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = scriptPackage.f5563id;
            }
            if ((i & 2) != 0) {
                str2 = scriptPackage.name;
            }
            if ((i & 4) != 0) {
                str3 = scriptPackage.version;
            }
            if ((i & 8) != 0) {
                str4 = scriptPackage.author;
            }
            if ((i & 16) != 0) {
                str5 = scriptPackage.description;
            }
            if ((i & 32) != 0) {
                str6 = scriptPackage.path;
            }
            if ((i & 64) != 0) {
                z = scriptPackage.isRunning;
            }
            String str7 = str6;
            boolean z2 = z;
            String str8 = str5;
            String str9 = str3;
            return scriptPackage.copy(str, str2, str9, str4, str8, str7, z2);
        }

        public final String component1() {
            return this.f5563id;
        }

        public final String component2() {
            return this.name;
        }

        public final String component3() {
            return this.version;
        }

        public final String component4() {
            return this.author;
        }

        public final String component5() {
            return this.description;
        }

        public final String component6() {
            return this.path;
        }

        public final boolean component7() {
            return this.isRunning;
        }

        public final ScriptPackage copy(String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
            AbstractC0295Gu.m625r(-380791800461365L);
            AbstractC0295Gu.m625r(-380804685363253L);
            AbstractC0295Gu.m625r(-380826160199733L);
            AbstractC0295Gu.m625r(-380860519938101L);
            AbstractC0295Gu.m625r(-380890584709173L);
            AbstractC0295Gu.m625r(-380942124316725L);
            return new ScriptPackage(str, str2, str3, str4, str5, str6, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ScriptPackage)) {
                return false;
            }
            ScriptPackage scriptPackage = (ScriptPackage) obj;
            return AbstractC0585Nj.m1134a(this.f5563id, scriptPackage.f5563id) && AbstractC0585Nj.m1134a(this.name, scriptPackage.name) && AbstractC0585Nj.m1134a(this.version, scriptPackage.version) && AbstractC0585Nj.m1134a(this.author, scriptPackage.author) && AbstractC0585Nj.m1134a(this.description, scriptPackage.description) && AbstractC0585Nj.m1134a(this.path, scriptPackage.path) && this.isRunning == scriptPackage.isRunning;
        }

        public final boolean exists() {
            return new File(this.path).exists() && getMainFile().exists();
        }

        public final String getAuthor() {
            return this.author;
        }

        public final File getDescFile() {
            return new File(this.path, AbstractC0295Gu.m625r(-380753145755701L));
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getId() {
            return this.f5563id;
        }

        public final File getInfoFile() {
            return new File(this.path, AbstractC0295Gu.m625r(-380710196082741L));
        }

        public final File getMainFile() {
            return new File(this.path, AbstractC0295Gu.m625r(-382320808818741L));
        }

        public final String getName() {
            return this.name;
        }

        public final String getPath() {
            return this.path;
        }

        public final String getVersion() {
            return this.version;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isRunning) + AbstractC2374ph.m4810g(this.path, AbstractC2374ph.m4810g(this.description, AbstractC2374ph.m4810g(this.author, AbstractC2374ph.m4810g(this.version, AbstractC2374ph.m4810g(this.name, this.f5563id.hashCode() * 31, 31), 31), 31), 31), 31);
        }

        public final boolean isRunning() {
            return this.isRunning;
        }

        public final void setRunning(boolean z) {
            this.isRunning = z;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractC0295Gu.m625r(-380963599153205L));
            AbstractC2374ph.m4817n(sb, this.f5563id, -380491152750645L);
            AbstractC2374ph.m4817n(sb, this.name, -380525512489013L);
            AbstractC2374ph.m4817n(sb, this.version, -380572757129269L);
            AbstractC2374ph.m4817n(sb, this.author, -380615706802229L);
            AbstractC2374ph.m4817n(sb, this.description, -380680131311669L);
            AbstractC2374ph.m4817n(sb, this.path, -381264246863925L);
            sb.append(this.isRunning);
            sb.append(')');
            return sb.toString();
        }

        public /* synthetic */ ScriptPackage(String str, String str2, String str3, String str4, String str5, String str6, boolean z, int i, AbstractC0621Oc abstractC0621Oc) {
            this(str, str2, str3, str4, str5, str6, (i & 64) != 0 ? false : z);
        }
    }

    /* JADX INFO: renamed from: executePackage-gIAlu-s, reason: not valid java name */
    public final Object m5477executePackagegIAlus(Context context, ScriptPackage scriptPackage) {
        AbstractC0295Gu.m625r(-380130375497781L);
        AbstractC0295Gu.m625r(-378515467794485L);
        if (!scriptPackage.exists()) {
            return new C0297Gw(new IllegalArgumentException(AbstractC0295Gu.m625r(-378532647663669L) + scriptPackage.getId()));
        }
        AbstractC0295Gu.m625r(-378644316813365L);
        AbstractC0295Gu.m625r(-378734511126581L);
        scriptPackage.getName();
        AbstractC0295Gu.m625r(-378270654658613L);
        scriptPackage.getId();
        try {
            LuaEngine luaEngine = LuaEngine.INSTANCE;
            if (!luaEngine.isInitialized()) {
                LuaEngine.init$default(luaEngine, context, null, 2, null);
            }
            setupScriptGlobals(scriptPackage);
            Object objM5465executeIoAF18A = luaEngine.m5465executeIoAF18A(AbstractC2675wh.m5244g0(scriptPackage.getMainFile()));
            if (!(objM5465executeIoAF18A instanceof C0297Gw)) {
                scriptPackage.setRunning(true);
                loadedPackages.put(scriptPackage.getId(), scriptPackage);
                AbstractC0295Gu.m625r(-378283539560501L);
                AbstractC0295Gu.m625r(-378373733873717L);
                scriptPackage.getName();
            }
            return objM5465executeIoAF18A;
        } catch (Exception e) {
            AbstractC0295Gu.m625r(-379060928641077L);
            AbstractC0295Gu.m625r(-379151122954293L);
            scriptPackage.getName();
            return new C0297Gw(e);
        }
    }
}
