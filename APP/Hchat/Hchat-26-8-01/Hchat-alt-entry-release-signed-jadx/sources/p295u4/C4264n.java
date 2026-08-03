package p295u4;

import java.util.concurrent.ConcurrentHashMap;
import p326w4.InterfaceC4684d;

/* JADX INFO: renamed from: u4.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4264n {

    /* JADX INFO: renamed from: a */
    public int f13960a;

    /* JADX INFO: renamed from: b */
    public InterfaceC4684d f13961b;

    /* JADX INFO: renamed from: c */
    public C4261k f13962c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C4265o)) {
            return false;
        }
        int i9 = this.f13960a;
        InterfaceC4684d interfaceC4684d = this.f13961b;
        C4261k c4261k = this.f13962c;
        ConcurrentHashMap concurrentHashMap = C4265o.f13963j;
        return ((C4265o) obj).m8559e(i9, interfaceC4684d, c4261k);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int i9 = this.f13960a;
        InterfaceC4684d interfaceC4684d = this.f13961b;
        C4261k c4261k = this.f13962c;
        ConcurrentHashMap concurrentHashMap = C4265o.f13963j;
        return ((interfaceC4684d.hashCode() + ((c4261k != null ? c4261k.hashCode() : 0) * 31)) * 31) + i9;
    }
}
