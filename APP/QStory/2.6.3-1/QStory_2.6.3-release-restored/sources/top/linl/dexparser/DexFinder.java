package top.linl.dexparser;

import androidx.fragment.app.RunnableC3179;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import lin.xposed.hook.javaplugin.controller.C6364;
import net.bytebuddy.description.method.MethodDescription;
import p399.RunnableC9832;
import top.linl.dexparser.bean.ids.DexMethodId;
import top.linl.dexparser.bean.ids.DexTypeId;
import top.linl.dexparser.util.DexTypeUtils;
import top.linl.dexparser.util.FileUtils;
import top.suzhelan.qstory.hook.item.RunnableC6769;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class DexFinder {
    private Builder builder;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public interface OnProgress {
        void init(int i);

        void parse(int i, String str);
    }

    public /* synthetic */ DexFinder(int i) {
        this();
    }

    public static Builder builder(ClassLoader classLoader, String str) {
        return new Builder(classLoader, str);
    }

    private ArrayList<Method> findMethodAppearedString(String str) throws InterruptedException {
        ArrayList<Method> arrayList = new ArrayList<>();
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(Builder.mThreadSize);
        Iterator<DexParser> it = getDexParsersList().iterator();
        while (it.hasNext()) {
            executorServiceNewFixedThreadPool.execute(new RunnableC6769(this, arrayList, it.next(), str, 4));
        }
        executorServiceNewFixedThreadPool.shutdown();
        executorServiceNewFixedThreadPool.awaitTermination(15L, TimeUnit.SECONDS);
        return arrayList;
    }

    private ArrayList<Method> findStringInWhichMethodAppears(DexParser dexParser, String str) {
        ArrayList<Method> arrayList = new ArrayList<>();
        for (DexMethodId dexMethodId : dexParser.dexMethodIdsList) {
            if (dexMethodId.getUsedStringList() != null) {
                Iterator<Integer> it = dexMethodId.getUsedStringList().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (dexParser.dexStringIdsList[it.next().intValue()].getString(dexParser).contains(str)) {
                            String string = dexParser.dexStringIdsList[dexMethodId.name_idx].getString(dexParser);
                            if (!string.equals(MethodDescription.CONSTRUCTOR_INTERNAL_NAME) && !string.equals("<cinit>")) {
                                String string2 = dexParser.dexStringIdsList[dexParser.dexTypeIdsList[dexMethodId.class_ids].descriptor_idx].getString(dexParser);
                                DexTypeId[] methodParams = dexMethodId.getMethodParams(dexParser);
                                Class<?> clsFindClass = DexTypeUtils.findClass(string2);
                                int length = methodParams.length;
                                Class<?>[] clsArr = new Class[length];
                                for (int i = 0; i < length; i++) {
                                    clsArr[i] = DexTypeUtils.findClass(dexParser.dexStringIdsList[methodParams[i].descriptor_idx].getString(dexParser));
                                }
                                arrayList.add(clsFindClass.getDeclaredMethod(string, clsArr));
                            }
                        }
                    }
                }
            }
        }
        System.gc();
        return arrayList;
    }

    public static ArrayList<DexParser> getDexParsersList() {
        return Builder.dexParsersList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$findMethodAppearedString$1(ArrayList arrayList, DexParser dexParser, String str) {
        try {
            arrayList.addAll(findStringInWhichMethodAppears(dexParser, str));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$testFindMethodString$0(File file, ArrayList arrayList, String str) {
        try {
            arrayList.addAll(testFindStringInWhichMethodAppears((DexParser) FileUtils.readFileObject(file), str));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$useLocalLookupMethodString$2(File file, ArrayList arrayList, String str) {
        try {
            arrayList.addAll(findStringInWhichMethodAppears((DexParser) FileUtils.readFileObject(file), str));
        } catch (Exception unused) {
        }
    }

    private ArrayList<String> testFindStringInWhichMethodAppears(DexParser dexParser, String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (DexMethodId dexMethodId : dexParser.dexMethodIdsList) {
            if (dexMethodId.getUsedStringList() != null) {
                Iterator<Integer> it = dexMethodId.getUsedStringList().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (dexParser.dexStringIdsList[it.next().intValue()].getString(dexParser).contains(str)) {
                            String string = dexParser.dexStringIdsList[dexMethodId.name_idx].getString(dexParser);
                            String string2 = dexParser.dexStringIdsList[dexParser.dexTypeIdsList[dexMethodId.class_ids].descriptor_idx].getString(dexParser);
                            DexTypeId[] methodParams = dexMethodId.getMethodParams(dexParser);
                            String strConversionTypeName = DexTypeUtils.conversionTypeName(string2);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("DeclareClass", strConversionTypeName);
                            jSONObject.put("MethodName", string);
                            JSONArray jSONArray = new JSONArray();
                            for (DexTypeId dexTypeId : methodParams) {
                                jSONArray.add(DexTypeUtils.conversionTypeName(dexTypeId.getString(dexParser)));
                            }
                            jSONObject.put("Params", jSONArray);
                            jSONObject.put("ReturnType", DexTypeUtils.conversionTypeName(dexMethodId.getReturnType(dexParser).getString(dexParser)));
                            arrayList.add(jSONObject.toString());
                        }
                    }
                }
            }
        }
        System.gc();
        return arrayList;
    }

    private ArrayList<Method> useLocalLookupMethodString(String str) throws InterruptedException {
        ArrayList<Method> arrayList = new ArrayList<>();
        File[] cacheList = this.builder.getCacheList();
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(Builder.mThreadSize);
        for (File file : cacheList) {
            executorServiceNewFixedThreadPool.execute(new RunnableC9832(this, file, arrayList, str, 0));
        }
        executorServiceNewFixedThreadPool.shutdown();
        executorServiceNewFixedThreadPool.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        return arrayList;
    }

    public void close() {
        this.builder.close();
    }

    public ArrayList<Method> findMethodString(String str) {
        return this.builder.cachedLocally() ? useLocalLookupMethodString(str) : findMethodAppearedString(str);
    }

    public ArrayList<String> testFindMethodString(String str) throws InterruptedException {
        ArrayList<String> arrayList = new ArrayList<>();
        File[] cacheList = this.builder.getCacheList();
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(3);
        for (File file : cacheList) {
            executorServiceNewFixedThreadPool.execute(new RunnableC9832(this, file, arrayList, str, 1));
        }
        executorServiceNewFixedThreadPool.shutdown();
        executorServiceNewFixedThreadPool.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        return arrayList;
    }

    private DexFinder() {
    }

    public static Builder builder(String str) {
        return new Builder(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void init() {
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class Builder {
        private static final ArrayList<DexParser> dexParsersList = new ArrayList<>();
        public static int mThreadSize = 3;
        private final String apkPath;
        private final ZipFile apkZipFile;
        private String cachePath;
        private final DexFinder dexFinder;
        private OnProgress mOnProgress;

        public Builder(ClassLoader classLoader, String str) {
            DexTypeUtils.setClassLoader(classLoader);
            DexFinder dexFinder = new DexFinder(0);
            this.dexFinder = dexFinder;
            dexFinder.builder = this;
            this.apkPath = str;
            this.apkZipFile = new ZipFile(str);
        }

        private boolean cacheToPath(DexParser dexParser) {
            FileUtils.writeObjectToFile(this.cachePath + "/" + (dexParser.getDexName() + ".parser"), dexParser);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean cachedLocally() {
            return this.cachePath != null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void close() {
            if (cachedLocally()) {
                FileUtils.deleteFile(new File(this.cachePath));
            }
            System.gc();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public File[] getCacheList() {
            return new File(this.cachePath).listFiles(new C6364(1));
        }

        private void initializeDexParserList() throws InterruptedException, IOException {
            FileInputStream fileInputStream = new FileInputStream(new File(this.apkPath));
            ZipInputStream zipInputStream = new ZipInputStream(fileInputStream);
            ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(mThreadSize);
            Enumeration<? extends ZipEntry> enumerationEntries = this.apkZipFile.entries();
            ArrayList arrayList = new ArrayList();
            while (enumerationEntries.hasMoreElements()) {
                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                if (!zipEntryNextElement.isDirectory() && zipEntryNextElement.getName().endsWith(".dex")) {
                    arrayList.add(zipEntryNextElement);
                }
            }
            OnProgress onProgress = this.mOnProgress;
            if (onProgress != null) {
                onProgress.init(arrayList.size());
            }
            AtomicInteger atomicInteger = new AtomicInteger();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                executorServiceNewFixedThreadPool.submit(new RunnableC3179(this, (ZipEntry) it.next(), atomicInteger, 13));
            }
            executorServiceNewFixedThreadPool.shutdown();
            while (!executorServiceNewFixedThreadPool.isTerminated()) {
                Thread.sleep(1L);
            }
            System.out.println("init end");
            zipInputStream.close();
            fileInputStream.close();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$getCacheList$0(File file) {
            return file.isFile() && file.getName().endsWith(".parser");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$initializeDexParserList$1(ZipEntry zipEntry, AtomicInteger atomicInteger) {
            try {
                InputStream inputStream = this.apkZipFile.getInputStream(zipEntry);
                byte[] allByte = FileUtils.readAllByte(inputStream, (int) zipEntry.getSize());
                inputStream.close();
                DexParser dexParser = new DexParser(allByte, zipEntry.getName());
                dexParser.startParse();
                if (cachedLocally()) {
                    cacheToPath(dexParser);
                } else {
                    DexFinder.getDexParsersList().add(dexParser);
                }
                System.gc();
                OnProgress onProgress = this.mOnProgress;
                if (onProgress != null) {
                    onProgress.parse(atomicInteger.getAndIncrement(), zipEntry.getName());
                }
            } catch (IOException unused) {
            }
        }

        public DexFinder build() throws InterruptedException, IOException {
            initializeDexParserList();
            this.dexFinder.init();
            return this.dexFinder;
        }

        public Builder setCachePath(String str) {
            this.cachePath = str;
            return this;
        }

        public Builder setOnProgress(OnProgress onProgress) {
            this.mOnProgress = onProgress;
            return this;
        }

        public Builder setThreadNumber(int i) {
            mThreadSize = i;
            return this;
        }

        public Builder(String str) {
            DexFinder dexFinder = new DexFinder(0);
            this.dexFinder = dexFinder;
            dexFinder.builder = this;
            this.apkPath = str;
            this.apkZipFile = new ZipFile(str);
        }
    }
}
