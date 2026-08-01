package p216od;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import me.yun.fkwechat.core.config.AppConfig;
import p183m6.SharedPreferencesC5046p;
import p315vd.AbstractC8924d;

/* JADX INFO: renamed from: od.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C5738g {

    /* JADX INFO: renamed from: f */
    public static C5738g f18084f;

    /* JADX INFO: renamed from: a */
    public final List f18085a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b */
    public final Map f18086b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c */
    public final ExecutorService f18087c = Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()));

    /* JADX INFO: renamed from: d */
    public SharedPreferencesC5046p f18088d;

    /* JADX INFO: renamed from: e */
    public File f18089e;

    public C5738g() {
        this.f18088d = null;
        Context context = AppConfig.hostContext;
        if (context != null) {
            this.f18088d = new SharedPreferencesC5046p.a(context, "FkWeChat_Plugins_Loader").m20406a();
        } else {
            AbstractC8924d.m34263c("PluginManager", "Host context is null");
        }
    }

    /* JADX INFO: renamed from: c */
    public static synchronized C5738g m23203c() {
        try {
            if (f18084f == null) {
                f18084f = new C5738g();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f18084f;
    }

    /* JADX INFO: renamed from: b */
    public void m23204b(C5733b c5733b) {
        if (c5733b == null) {
            return;
        }
        m23215n(c5733b);
        SharedPreferencesC5046p sharedPreferencesC5046p = this.f18088d;
        if (sharedPreferencesC5046p != null) {
            sharedPreferencesC5046p.remove(c5733b.f18079e);
        }
        this.f18085a.remove(c5733b);
    }

    /* JADX INFO: renamed from: d */
    public List m23205d() {
        return new ArrayList(this.f18085a);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m23206e(File file) {
        return new File(file, "main.java").exists() && new File(file, "info.prop").exists();
    }

    /* JADX INFO: renamed from: f */
    public void m23207f(File file) {
        this.f18089e = file;
        if (!file.exists()) {
            file.mkdirs();
        }
        m23211j();
    }

    /* JADX INFO: renamed from: g */
    public boolean m23208g(C5733b c5733b) {
        if (c5733b == null) {
            return false;
        }
        return this.f18088d.getBoolean(c5733b.f18079e, false);
    }

    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean m23209h(C5733b c5733b) {
        if (c5733b == null) {
            return false;
        }
        try {
            C5732a c5732a = new C5732a(c5733b);
            if (c5732a.m23185a()) {
                this.f18086b.put(c5733b.f18079e, c5732a);
                return true;
            }
        } catch (Throwable th) {
            AbstractC5736e.m23198c(c5733b, "Failed to load plugin", th);
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public void m23211j() {
        File[] fileArrListFiles;
        Iterator it = this.f18085a.iterator();
        while (it.hasNext()) {
            m23215n((C5733b) it.next());
        }
        this.f18086b.clear();
        this.f18085a.clear();
        File file = this.f18089e;
        if (file == null || !file.exists() || (fileArrListFiles = this.f18089e.listFiles()) == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory() && m23206e(file2)) {
                final C5733b c5733b = new C5733b(file2);
                this.f18085a.add(c5733b);
                if (m23208g(c5733b)) {
                    this.f18087c.execute(new Runnable() { // from class: od.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f18082q.m23209h(c5733b);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m23212k(C5733b c5733b, boolean z10) {
        if (c5733b == null) {
            return;
        }
        this.f18088d.putBoolean(c5733b.f18079e, z10);
        if (z10) {
            m23209h(c5733b);
        } else {
            m23215n(c5733b);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m23213l() {
        File[] fileArrListFiles;
        File file = this.f18089e;
        if (file == null || !file.exists() || (fileArrListFiles = this.f18089e.listFiles()) == null) {
            return;
        }
        HashMap map = new HashMap();
        for (C5733b c5733b : this.f18085a) {
            map.put(c5733b.f18079e, c5733b);
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory() && m23206e(file2)) {
                String absolutePath = file2.getAbsolutePath();
                hashSet.add(absolutePath);
                if (map.containsKey(absolutePath)) {
                    C5733b c5733b2 = new C5733b(file2);
                    c5733b2.m23195e();
                    arrayList.add(c5733b2);
                } else {
                    arrayList.add(new C5733b(file2));
                }
            }
        }
        this.f18085a.clear();
        this.f18085a.addAll(arrayList);
    }

    /* JADX INFO: renamed from: m */
    public void m23214m() {
        File file = this.f18089e;
        if (file == null || !file.exists()) {
            return;
        }
        File[] fileArrListFiles = this.f18089e.listFiles();
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        HashSet hashSet = new HashSet();
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory() && m23206e(file2)) {
                hashSet.add(file2.getAbsolutePath());
            }
        }
        for (C5733b c5733b : this.f18085a) {
            String strM23193c = c5733b.m23193c();
            if (hashSet.contains(strM23193c)) {
                hashSet.remove(strM23193c);
            } else {
                m23215n(c5733b);
                this.f18085a.remove(c5733b);
            }
        }
        for (File file3 : fileArrListFiles) {
            if (hashSet.contains(file3.getAbsolutePath())) {
                C5733b c5733b2 = new C5733b(file3);
                this.f18085a.add(c5733b2);
                if (m23208g(c5733b2)) {
                    m23209h(c5733b2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m23215n(C5733b c5733b) {
        C5732a c5732a;
        if (c5733b == null || (c5732a = (C5732a) this.f18086b.remove(c5733b.f18079e)) == null) {
            return;
        }
        c5732a.m23190f();
    }
}
