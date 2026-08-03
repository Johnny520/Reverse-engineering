package io.github.cherrywechat.lua.loader;

import android.app.Activity;
import android.app.AndroidAppHelper;
import android.content.Context;
import io.github.cherrywechat.application.MainApplication;
import io.github.cherrywechat.lua.LuaEngine;
import io.github.cherrywechat.lua.api.CherryAPI;
import java.io.File;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import p000.AbstractC0213Ey;
import p000.AbstractC0295Gu;
import p000.AbstractC0585Nj;
import p000.AbstractC0621Oc;
import p000.AbstractC2374ph;
import p000.AbstractC2453ra;
import p000.AbstractC2607uz;
import p000.AbstractC2675wh;
import p000.C0297Gw;
import p000.C1456gf;
import p000.C2390px;

/* JADX INFO: loaded from: classes.dex */
public final class ScriptPackageManager {
    public static final ScriptPackageManager INSTANCE = null;
    private static final String PACKAGES_DIR = null;
    private static final String TAG = null;
    private static final ConcurrentHashMap<String, ScriptPackage> loadedPackages = null;

    public static final class ScriptPackage {
        private final String author;
        private final String description;

        /* JADX INFO: renamed from: id */
        private final String f5563id;
        private boolean isRunning;
        private final String name;
        private final String path;
        private final String version;

        public ScriptPackage(String r3, String r4, String r5, String r6, String r7, String r8, boolean r9) {
            AbstractC0295Gu.m625r(-382149010126901L);
            AbstractC0295Gu.m625r(-382161895028789L);
            AbstractC0295Gu.m625r(-382183369865269L);
            AbstractC0295Gu.m625r(-382217729603637L);
            AbstractC0295Gu.m625r(-382247794374709L);
            AbstractC0295Gu.m625r(-382299333982261L);
            this.f5563id = r3;
            this.name = r4;
            this.version = r5;
            this.author = r6;
            this.description = r7;
            this.path = r8;
            this.isRunning = r9;
        }

        public static /* synthetic */ ScriptPackage copy$default(ScriptPackage r0, String r1, String r2, String r3, String r4, String r5, String r6, boolean r7, int r8, Object r9) {
            if ((r8 & 1) == 0) goto L6;
            r1 = r0.f5563id;
        L6:
            if ((r8 & 2) == 0) goto L9;
            r2 = r0.name;
        L9:
            if ((r8 & 4) == 0) goto L12;
            r3 = r0.version;
        L12:
            if ((r8 & 8) == 0) goto L15;
            r4 = r0.author;
        L15:
            if ((r8 & 16) == 0) goto L18;
            r5 = r0.description;
        L18:
            if ((r8 & 32) == 0) goto L21;
            r6 = r0.path;
        L21:
            if ((r8 & 64) == 0) goto L23;
            r7 = r0.isRunning;
        L23:
            String r82 = r6;
            boolean r92 = r7;
            String r62 = r4;
            String r72 = r5;
            String r52 = r3;
            String r32 = r1;
            return r0.copy(r32, r2, r52, r62, r72, r82, r92);
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

        public final ScriptPackage copy(String r11, String r12, String r13, String r14, String r15, String r16, boolean r17) {
            AbstractC0295Gu.m625r(-380791800461365L);
            AbstractC0295Gu.m625r(-380804685363253L);
            AbstractC0295Gu.m625r(-380826160199733L);
            AbstractC0295Gu.m625r(-380860519938101L);
            AbstractC0295Gu.m625r(-380890584709173L);
            AbstractC0295Gu.m625r(-380942124316725L);
            return new ScriptPackage(r11, r12, r13, r14, r15, r16, r17);
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof ScriptPackage) == true) goto L8;
            return false;
        L8:
            ScriptPackage r52 = (ScriptPackage) r5;
            if (AbstractC0585Nj.m1134a(this.f5563id, r52.f5563id) == true) goto L12;
            return false;
        L12:
            if (AbstractC0585Nj.m1134a(this.name, r52.name) == true) goto L15;
            return false;
        L15:
            if (AbstractC0585Nj.m1134a(this.version, r52.version) == true) goto L18;
            return false;
        L18:
            if (AbstractC0585Nj.m1134a(this.author, r52.author) == true) goto L21;
            return false;
        L21:
            if (AbstractC0585Nj.m1134a(this.description, r52.description) == true) goto L24;
            return false;
        L24:
            if (AbstractC0585Nj.m1134a(this.path, r52.path) == true) goto L27;
            return false;
        L27:
            if (this.isRunning == r52.isRunning) goto L29;
            return false;
        L29:
            return true;
        }

        public final boolean exists() {
            if (new File(this.path).exists() == true) goto L5;
            return false;
        L5:
            if (getMainFile().exists() == false) goto L10;
            return true;
        L10:
            return false;
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
            int r0 = this.f5563id.hashCode() * 31;
            int r02 = AbstractC2374ph.m4810g(this.name, r0, 31);
            int r03 = AbstractC2374ph.m4810g(this.version, r02, 31);
            int r04 = AbstractC2374ph.m4810g(this.author, r03, 31);
            int r05 = AbstractC2374ph.m4810g(this.description, r04, 31);
            int r06 = AbstractC2374ph.m4810g(this.path, r05, 31);
            return Boolean.hashCode(this.isRunning) + r06;
        }

        public final boolean isRunning() {
            return this.isRunning;
        }

        public final void setRunning(boolean r1) {
            this.isRunning = r1;
        }

        public String toString() {
            StringBuilder r0 = new StringBuilder();
            r0.append(AbstractC0295Gu.m625r(-380963599153205L));
            AbstractC2374ph.m4817n(r0, this.f5563id, -380491152750645L);
            AbstractC2374ph.m4817n(r0, this.name, -380525512489013L);
            AbstractC2374ph.m4817n(r0, this.version, -380572757129269L);
            AbstractC2374ph.m4817n(r0, this.author, -380615706802229L);
            AbstractC2374ph.m4817n(r0, this.description, -380680131311669L);
            AbstractC2374ph.m4817n(r0, this.path, -381264246863925L);
            r0.append(this.isRunning);
            r0.append(')');
            return r0.toString();
        }

        public /* synthetic */ ScriptPackage(String r10, String r11, String r12, String r13, String r14, String r15, boolean r16, int r17, AbstractC0621Oc r18) {
            if ((r17 & 64) == 0) goto L6;
            boolean r8 = false;
        L7:
            this(r10, r11, r12, r13, r14, r15, r8);
            return;
        L6:
            r8 = r16;
            goto L7
        }
    }

    static {
        TAG = AbstractC0295Gu.m625r(-353686261856309L);
        PACKAGES_DIR = AbstractC0295Gu.m625r(-352127188727861L);
        INSTANCE = new ScriptPackageManager();
        loadedPackages = new ConcurrentHashMap();
    }

    private ScriptPackageManager() {
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m3536a(File r0) {
        return listPackages$lambda$1(r0);
    }

    private static final boolean listPackages$lambda$1(File r0) {
        return r0.isDirectory();
    }

    private final void setupScriptGlobals(ScriptPackage r5) {
        LuaEngine r0 = LuaEngine.INSTANCE;
        r0.setGlobal(AbstractC0295Gu.m625r(-379271382038581L), r5.getId());
        r0.setGlobal(AbstractC0295Gu.m625r(-379310036744245L), r5.getVersion());
        r0.setGlobal(AbstractC0295Gu.m625r(-378820410472501L), r5.getName());
        r0.setGlobal(AbstractC0295Gu.m625r(-378867655112757L), r5.getAuthor());
        r0.setGlobal(AbstractC0295Gu.m625r(-378923489687605L), r5.getPath());
        r0.setGlobal(AbstractC0295Gu.m625r(-378962144393269L), C1456gf.m2783A());     // Catch: Exception -> L5
        r0.setGlobal(AbstractC0295Gu.m625r(-379000799098933L), C1456gf.m2791I());     // Catch: Exception -> L5
        r0.setGlobal(AbstractC0295Gu.m625r(-379026568902709L), C1456gf.m2783A().getClassLoader());     // Catch: Exception -> L5
    L7:
        CherryAPI r52 = CherryAPI.INSTANCE;
        Context r02 = MainApplication.f5549a;
        if (r02 != null) goto L14;
        r02 = C1456gf.f5172p;
        if (r02 != null) goto L14;
        r02 = AndroidAppHelper.currentApplication();
        AbstractC0295Gu.m625r(-836852902787125L);
    L14:
        r52.setCurrentContext(r02);
        WeakReference r03 = C1456gf.f5173q;
        if (r03 == null) goto L17;
        Activity r04 = (Activity) r03.get();
    L18:
        r52.setCurrentActivity(r04);
        return;
    L17:
        r04 = null;
    L5:
        e = move-exception;
        AbstractC0213Ey.m411i(-379056633673781L, -359905374500917L, e);
        goto L7
    }

    /* JADX INFO: renamed from: createPackageTemplate-BWLJW6A, reason: not valid java name */
    public final Object m5476createPackageTemplateBWLJW6A(Context r5, String r6, String r7, String r8) {
        AbstractC0295Gu.m625r(-359402863327285L);
        AbstractC0295Gu.m625r(-359437223065653L);
        AbstractC0295Gu.m625r(-359480172738613L);
        AbstractC0295Gu.m625r(-359501647575093L);
        File r0 = new File(getPackagesDir(r5), r6);
        if (r0.exists() == true) goto L5;
        r0.mkdirs();     // Catch: Exception -> L10
        AbstractC2675wh.m5246i0(new File(r0, AbstractC0295Gu.m625r(-359089330714677L)), AbstractC2607uz.m5118D(AbstractC0295Gu.m625r(-359132280387637L) + r7 + AbstractC0295Gu.m625r(-359231064635445L) + r8 + AbstractC0295Gu.m625r(-357818020395061L) + r6 + AbstractC0295Gu.m625r(-357358458894389L)));     // Catch: Exception -> L10
        AbstractC2675wh.m5246i0(new File(r0, AbstractC0295Gu.m625r(-357418588436533L)), AbstractC2607uz.m5118D(AbstractC0295Gu.m625r(-357457243142197L) + r7 + AbstractC0295Gu.m625r(-357547437455413L) + r8 + AbstractC0295Gu.m625r(-358204567451701L) + r7 + AbstractC0295Gu.m625r(-357998409021493L) + r7 + AbstractC0295Gu.m625r(-355752141125685L) + r7 + AbstractC0295Gu.m625r(-354721348974645L)));     // Catch: Exception -> L10
        File r52 = new File(r0, AbstractC0295Gu.m625r(-353381319178293L));     // Catch: Exception -> L10
        StringBuilder r62 = new StringBuilder();     // Catch: Exception -> L10
        r62.append(r7);     // Catch: Exception -> L10
        r62.append(AbstractC0295Gu.m625r(-353419973883957L));     // Catch: Exception -> L10
        r62.append(r8);     // Catch: Exception -> L10
        r62.append(AbstractC0295Gu.m625r(-353445743687733L));     // Catch: Exception -> L10
        AbstractC2675wh.m5246i0(r52, r62.toString());     // Catch: Exception -> L10
        String r53 = r0.getAbsolutePath();     // Catch: Exception -> L10
        AbstractC0295Gu.m625r(-353475808458805L);     // Catch: Exception -> L10
        ScriptPackage r54 = loadPackageInfo(r53);     // Catch: Exception -> L10
        if (r54 == null) goto L9;
        AbstractC0295Gu.m625r(-353123621140533L);     // Catch: Exception -> L10
        AbstractC0295Gu.m625r(-353213815453749L);     // Catch: Exception -> L10
        return r54;
    L9:
        return new C0297Gw(new IllegalStateException(AbstractC0295Gu.m625r(-353016246958133L)));
    L10:
        e = move-exception;
        AbstractC2675wh.m5239b0(r0);
        AbstractC0295Gu.m625r(-353879535384629L);
        AbstractC0295Gu.m625r(-353969729697845L);
        return new C0297Gw(e);
    L5:
        return new C0297Gw(new IllegalArgumentException(AbstractC0295Gu.m625r(-359531712346165L).concat(r6)));
    }

    /* JADX INFO: renamed from: executePackage-gIAlu-s, reason: not valid java name */
    public final Object m5478executePackagegIAlus(Context r4, String r5) {
        AbstractC0295Gu.m625r(-380426728241205L);
        AbstractC0295Gu.m625r(-379911332165685L);
        ScriptPackage r0 = loadedPackages.get(r5);
        if (r0 != null) goto L5;
        String r02 = new File(getPackagesDir(r4), r5).getAbsolutePath();
        AbstractC0295Gu.m625r(-379954281838645L);
        r0 = loadPackageInfo(r02);
    L5:
        if (r0 != null) goto L9;
        return new C0297Gw(new IllegalArgumentException(AbstractC0295Gu.m625r(-380044476151861L).concat(r5)));
    L9:
        return m5477executePackagegIAlus(r4, r0);
    }

    public final List<ScriptPackage> getLoadedPackages() {
        Collection<ScriptPackage> r0 = loadedPackages.values();
        AbstractC0295Gu.m625r(-353566002772021L);
        return AbstractC2453ra.m4908r0(r0);
    }

    public final File getPackagesDir(Context r4) {
        AbstractC0295Gu.m625r(-381320081438773L);
        File r0 = new File(r4.getFilesDir(), AbstractC0295Gu.m625r(-381354441177141L));
        if (r0.exists() == true) goto L5;
        r0.mkdirs();
    L5:
        return r0;
    }

    /* JADX INFO: renamed from: installPackage-gIAlu-s, reason: not valid java name */
    public final Object m5479installPackagegIAlus(Context r4, File r5) {
        AbstractC0295Gu.m625r(-360506669922357L);
        AbstractC0295Gu.m625r(-360541029660725L);
        String r0 = r5.getAbsolutePath();
        AbstractC0295Gu.m625r(-360583979333685L);
        ScriptPackage r02 = loadPackageInfo(r0);
        if (r02 == null) goto L5;
        File r1 = new File(getPackagesDir(r4), r02.getId());
    L10:
        e = move-exception;
        AbstractC0295Gu.m625r(-358939006859317L);
        AbstractC0295Gu.m625r(-358479445358645L);
        return new C0297Gw(e);
    L8:
        if (r1.exists() == false) goto L12;
        AbstractC2675wh.m5239b0(r1);     // Catch: Exception -> L10
    L12:
        AbstractC2675wh.m5237Z(r5, r1);     // Catch: Exception -> L10
        String r42 = r1.getAbsolutePath();     // Catch: Exception -> L10
        AbstractC0295Gu.m625r(-360193137309749L);     // Catch: Exception -> L10
        ScriptPackage r43 = loadPackageInfo(r42);     // Catch: Exception -> L10
        if (r43 == null) goto L15;
        AbstractC0295Gu.m625r(-358762913200181L);     // Catch: Exception -> L10
        AbstractC0295Gu.m625r(-358853107513397L);     // Catch: Exception -> L10
        r43.getName();     // Catch: Exception -> L10
        return r43;
    L15:
        return new C0297Gw(new IllegalStateException(AbstractC0295Gu.m625r(-360283331622965L)));
    L5:
        return new C0297Gw(new IllegalArgumentException(AbstractC0295Gu.m625r(-360124417833013L)));
    }

    public final boolean isPackageRunning(String r3) {
        AbstractC0295Gu.m625r(-353643312183349L);
        return loadedPackages.containsKey(r3);
    }

    public final List<ScriptPackage> listPackages(Context r8) {
        AbstractC0295Gu.m625r(-381410275751989L);
        File r82 = getPackagesDir(r8);
        ArrayList r0 = new ArrayList();
        File[] r83 = r82.listFiles(new C2390px(1));
        if (r83 == null) goto L11;
        int r1 = r83.length;
        int r2 = 0;
    L5:
        if (r2 >= r1) goto L11;
        File r3 = r83[r2];
        ScriptPackageManager r4 = INSTANCE;
        String r32 = r3.getAbsolutePath();
        AbstractC0295Gu.m625r(-381444635490357L);
        ScriptPackage r33 = r4.loadPackageInfo(r32);
        if (r33 == null) goto L9;
        r0.add(r33);
    L9:
        r2 = r2 + 1;
    L11:
        return AbstractC2453ra.m4904n0(r0, new ScriptPackageManager$listPackages$$inlined$sortedBy$1());
    }

    public final ScriptPackage loadPackageInfo(String r12) {
        AbstractC0295Gu.m625r(-380985073989685L);
        File r1 = new File(r12);
        if (r1.exists() == true) goto L5;
    L35:
        return null;
    L5:
        if (r1.isDirectory() == false) goto L35;
        if (new File(r1, AbstractC0295Gu.m625r(-381036613597237L)).exists() == true) goto L11;
        AbstractC0295Gu.m625r(-381075268302901L);
        AbstractC0295Gu.m625r(-381165462616117L);
        return null;
    L11:
        File r0 = new File(r1, AbstractC0295Gu.m625r(-379614979422261L));
        Properties r2 = new Properties();
        if (r0.exists() == true) goto L40;
    L26:
        File r02 = new File(r1, AbstractC0295Gu.m625r(-379864087525429L));
        if (r02.exists() == true) goto L38;
        String r03 = r2.getProperty(AbstractC0295Gu.m625r(-379357281384501L), AbstractC0295Gu.m625r(-379408820992053L));
    L31:
        String r8 = r03;
        String r4 = r2.getProperty(AbstractC0295Gu.m625r(-379413115959349L), r1.getName());
        AbstractC0295Gu.m625r(-379426000861237L);
        String r5 = r2.getProperty(AbstractC0295Gu.m625r(-379499015305269L), r1.getName());
        AbstractC0295Gu.m625r(-379520490141749L);
        String r6 = r2.getProperty(AbstractC0295Gu.m625r(-379593504585781L), AbstractC0295Gu.m625r(-380177620138037L));
        AbstractC0295Gu.m625r(-380203389941813L);
        String r7 = r2.getProperty(AbstractC0295Gu.m625r(-380276404385845L), AbstractC0295Gu.m625r(-380306469156917L));
        AbstractC0295Gu.m625r(-380340828895285L);
        return new ScriptPackage(r4, r5, r6, r7, r8, r12, loadedPackages.containsKey(r2.getProperty(AbstractC0295Gu.m625r(-380413843339317L), r1.getName())));
    L38:
        r03 = AbstractC2675wh.m5244g0(r02);     // Catch: Exception -> L30
    L30:
        r03 = AbstractC0295Gu.m625r(-379352986417205L);
        goto L31
    L40:
        FileInputStream r3 = new FileInputStream(r0);     // Catch: Exception -> L17
        r2.load(r3);     // Catch: Throwable -> L19
        r3.close();     // Catch: Exception -> L17
        goto L26
    L19:
        th = move-exception;
        throw th;     // Catch: Throwable -> L22
    L22:
        th = move-exception;
        AbstractC0585Nj.m1138f(r3, th);     // Catch: Exception -> L17
        throw th;     // Catch: Exception -> L17
    L17:
        e = move-exception;
        AbstractC0213Ey.m411i(-379657929095221L, -379748123408437L, e);
        goto L26
    }

    public final void stopAllPackages() {
        Collection<ScriptPackage> r0 = loadedPackages.values();
        AbstractC0295Gu.m625r(-359699216070709L);
        Iterator<T> r02 = r0.iterator();
    L4:
        if (r02.hasNext() == false) goto L6;
        ((ScriptPackage) r02.next()).setRunning(false);
        goto L4
    L6:
        loadedPackages.clear();
        AbstractC0295Gu.m625r(-359776525482037L);
        AbstractC0295Gu.m625r(-360416475609141L);
    }

    public final boolean stopPackage(String r3) {
        AbstractC0295Gu.m625r(-360038518487093L);
        ScriptPackage r32 = loadedPackages.remove(r3);
        if (r32 == null) goto L6;
        r32.setRunning(false);
        AbstractC0295Gu.m625r(-360081468160053L);
        AbstractC0295Gu.m625r(-359621906659381L);
        r32.getName();
        return true;
    L6:
        return false;
    }

    public final boolean uninstallPackage(Context r3, String r4) {
        AbstractC0295Gu.m625r(-358591114508341L);
        AbstractC0295Gu.m625r(-358625474246709L);
        stopPackage(r4);
        File r0 = new File(getPackagesDir(r3), r4);
        if (r0.exists() == false) goto L8;
        boolean r32 = AbstractC2675wh.m5239b0(r0);
        if (r32 == false) goto L7;
        AbstractC0295Gu.m625r(-358668423919669L);
        AbstractC0295Gu.m625r(-359308374046773L);
    L7:
        return r32;
    L8:
        return false;
    }

    /* JADX INFO: renamed from: executePackage-gIAlu-s, reason: not valid java name */
    public final Object m5477executePackagegIAlus(Context r4, ScriptPackage r5) {
        AbstractC0295Gu.m625r(-380130375497781L);
        AbstractC0295Gu.m625r(-378515467794485L);
        if (r5.exists() == false) goto L5;
        AbstractC0295Gu.m625r(-378644316813365L);
        AbstractC0295Gu.m625r(-378734511126581L);
        r5.getName();
        AbstractC0295Gu.m625r(-378270654658613L);
        r5.getId();
        LuaEngine r0 = LuaEngine.INSTANCE;     // Catch: Exception -> L10
        if (r0.isInitialized() == true) goto L12;
        LuaEngine.init$default(r0, r4, null, 2, null);     // Catch: Exception -> L10
    L12:
        setupScriptGlobals(r5);     // Catch: Exception -> L10
        Object r42 = r0.m5465executeIoAF18A(AbstractC2675wh.m5244g0(r5.getMainFile()));     // Catch: Exception -> L10
        if ((r42 instanceof C0297Gw) == true) goto L15;
        r5.setRunning(true);     // Catch: Exception -> L10
        loadedPackages.put(r5.getId(), r5);     // Catch: Exception -> L10
        AbstractC0295Gu.m625r(-378283539560501L);     // Catch: Exception -> L10
        AbstractC0295Gu.m625r(-378373733873717L);     // Catch: Exception -> L10
        r5.getName();     // Catch: Exception -> L10
    L15:
        return r42;
    L10:
        e = move-exception;
        AbstractC0295Gu.m625r(-379060928641077L);
        AbstractC0295Gu.m625r(-379151122954293L);
        r5.getName();
        return new C0297Gw(e);
    L5:
        return new C0297Gw(new IllegalArgumentException(AbstractC0295Gu.m625r(-378532647663669L) + r5.getId()));
    }
}
