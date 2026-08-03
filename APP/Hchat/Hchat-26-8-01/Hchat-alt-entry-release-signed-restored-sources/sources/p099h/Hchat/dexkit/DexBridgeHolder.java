package p099h.Hchat.dexkit;

import ch.C0568c;
import ch.C0570e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.luckypray.dexkit.DexKitBridge;
import p025bc.AbstractC0255e;
import p062e8.C0827a;
import p086fh.C1243a;
import p086fh.C1253k;
import p115hh.C1724i;
import p115hh.C1730o;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class DexBridgeHolder {
    private static final String TAG = "[Hchat:DexBridgeHolder]";
    private final String apkPath;
    private final DexFinder dexFinder;
    private final DexKitBridge dexKitBridge;
    private final ClassLoader hostClassLoader;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DexBridgeHolder(DexKitBridge dexKitBridge, DexFinder dexFinder, ClassLoader classLoader, String str) {
        this.dexKitBridge = dexKitBridge;
        this.dexFinder = dexFinder;
        this.hostClassLoader = classLoader;
        this.apkPath = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public List<String> findClassesByStrings(String... strArr) {
        ArrayList arrayList = new ArrayList();
        if (this.dexKitBridge != null && strArr != null) {
            try {
                C0568c c0568c = new C0568c();
                C1243a c1243a = new C1243a();
                List listAsList = Arrays.asList(strArr);
                listAsList.getClass();
                C1243a.m3357r0(c1243a, listAsList);
                c0568c.f1762h = c1243a;
                Iterator it = this.dexKitBridge.findClass(c0568c).iterator();
                while (it.hasNext()) {
                    arrayList.add(((C1724i) it.next()).m4345p().f8327g);
                }
            } catch (Throwable th2) {
                AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:DexBridgeHolder] findClassesByStrings 失败: "), th2);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public List<C0827a> findMethodsByStrings(String... strArr) {
        ArrayList arrayList = new ArrayList();
        if (this.dexKitBridge != null && strArr != null) {
            try {
                C0570e c0570e = new C0570e();
                C1253k c1253k = new C1253k();
                c1253k.m3376t0(Arrays.asList(strArr));
                c0570e.f1764h = c1253k;
                for (C1730o c1730o : this.dexKitBridge.findMethod(c0570e)) {
                    arrayList.add(new C0827a(c1730o.m4348p().f8333g, c1730o.m4348p().f8334h));
                }
            } catch (Throwable th2) {
                AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:DexBridgeHolder] findMethodsByStrings 失败: "), th2);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getApkPath() {
        return this.apkPath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DexFinder getDexFinder() {
        return this.dexFinder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DexKitBridge getDexKitBridge() {
        return this.dexKitBridge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ClassLoader getHostClassLoader() {
        return this.hostClassLoader;
    }
}
