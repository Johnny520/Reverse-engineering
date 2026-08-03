package p096g8;

import java.util.concurrent.CopyOnWriteArrayList;
import p003a2.C0014a;
import p089g1.C1275d;
import p210o8.C3080d;

/* JADX INFO: renamed from: g8.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1366g {

    /* JADX INFO: renamed from: a */
    public final C3080d f4525a;

    /* JADX INFO: renamed from: b */
    public final C1363d f4526b;

    /* JADX INFO: renamed from: c */
    public final C1275d f4527c;

    /* JADX INFO: renamed from: d */
    public final CopyOnWriteArrayList f4528d = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: e */
    public volatile boolean f4529e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1366g(C3080d c3080d, C1363d c1363d, C1275d c1275d) {
        this.f4525a = c3080d;
        this.f4526b = c1363d;
        this.f4527c = c1275d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C0014a m3683a(InterfaceC1365f interfaceC1365f) {
        this.f4528d.addIfAbsent(interfaceC1365f);
        return new C0014a(14);
    }
}
