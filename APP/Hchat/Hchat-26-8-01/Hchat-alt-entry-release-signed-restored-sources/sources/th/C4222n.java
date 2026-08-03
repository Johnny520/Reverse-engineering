package th;

import ai.AbstractC0090c;
import ai.C0089b;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: th.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4222n implements InterfaceC4221m {

    /* JADX INFO: renamed from: g */
    public final Object f13888g = new Object();

    /* JADX INFO: renamed from: h */
    public final LinkedHashMap f13889h = new LinkedHashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // th.InterfaceC4221m
    /* JADX INFO: renamed from: e */
    public final C0089b mo8482e(String str, String str2) {
        C0089b c0089b;
        str.getClass();
        str2.getClass();
        synchronized (this.f13888g) {
            try {
                LinkedHashMap linkedHashMap = this.f13889h;
                Object objM501a = linkedHashMap.get(str);
                if (objM501a == null) {
                    objM501a = AbstractC0090c.m501a(str2);
                    linkedHashMap.put(str, objM501a);
                }
                c0089b = (C0089b) objM501a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c0089b;
    }
}
