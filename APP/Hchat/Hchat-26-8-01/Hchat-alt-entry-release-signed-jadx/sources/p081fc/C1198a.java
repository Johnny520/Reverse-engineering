package p081fc;

import ae.C0070a;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import p014b.C0126e;
import p025bc.InterfaceC0254d;
import p110hc.InterfaceC1705b;

/* JADX INFO: renamed from: fc.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1198a implements InterfaceC0254d {

    /* JADX INFO: renamed from: b */
    public final String f4025b;

    /* JADX INFO: renamed from: c */
    public final C0126e f4026c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1198a(String str, Map map, Map map2) {
        C0126e c0126e;
        this.f4025b = str;
        if (map2.isEmpty() && map.isEmpty()) {
            c0126e = InterfaceC1705b.f5690a;
        } else {
            TreeMap treeMap = new TreeMap(Comparator.comparingInt(new C0070a(10)).reversed());
            treeMap.putAll(map2);
            c0126e = new C0126e(map, 15, treeMap);
        }
        this.f4026c = c0126e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p025bc.InterfaceC0254d
    /* JADX INFO: renamed from: a */
    public final boolean mo1009a() {
        return this.f4026c != InterfaceC1705b.f5690a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p025bc.InterfaceC0254d
    /* JADX INFO: renamed from: b */
    public final String mo1010b() {
        return this.f4025b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p025bc.InterfaceC0254d
    /* JADX INFO: renamed from: c */
    public final C0126e mo1011c() {
        return this.f4026c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f4025b;
    }
}
