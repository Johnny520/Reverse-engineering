package p000a;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: a.gh */
/* JADX INFO: loaded from: classes.dex */
public final class C0601gh {

    /* JADX INFO: renamed from: a */
    public static volatile boolean f2227a;

    /* JADX INFO: renamed from: b */
    public static volatile List<String> f2228b = C0439Y5.f1645a;

    /* JADX INFO: renamed from: a */
    public static final List<File> m1439a() {
        File[] fileArrListFiles;
        File fileM1440b = m1440b();
        boolean zIsEmpty = f2228b.isEmpty();
        C0439Y5 c0439y5 = C0439Y5.f1645a;
        if (zIsEmpty || (fileArrListFiles = fileM1440b.listFiles()) == null) {
            return c0439y5;
        }
        ArrayList arrayList = new ArrayList();
        for (File file : fileArrListFiles) {
            if (file.isDirectory()) {
                String name = file.getName();
                C0631i9.m1481d(name, "getName(...)");
                if (m1441c(name)) {
                    arrayList.add(file);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static final File m1440b() {
        Context context = C0889w1.f3488p;
        if (context != null) {
            File dataDir = context.getDataDir();
            C0631i9.m1481d(dataDir, "getDataDir(...)");
            return dataDir;
        }
        if (!f2227a) {
            f2227a = true;
            C0908x1.m2197e("WechatPaths", "AppContext 未就绪，回退默认 data 分区");
        }
        return new File(Environment.getDataDirectory(), "data/com.tencent.mm");
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m1441c(String str) {
        if (str.length() != 0 && !f2228b.isEmpty()) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            C0631i9.m1481d(lowerCase, "toLowerCase(...)");
            List<String> list = f2228b;
            if (!list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (C0034Be.m94I(lowerCase, (String) it.next(), false)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
