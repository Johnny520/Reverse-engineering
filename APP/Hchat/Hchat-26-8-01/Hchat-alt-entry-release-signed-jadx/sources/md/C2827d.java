package md;

import ae.C0076g;
import java.util.Map;
import java.util.function.Consumer;

/* JADX INFO: renamed from: md.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2827d implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9214a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2829f f9215b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2827d(C2829f c2829f, int i9) {
        this.f9214a = i9;
        this.f9215b = c2829f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f9214a) {
            case 0:
                C2829f c2829f = this.f9215b;
                C2825b c2825b = C2825b.f9205t;
                C2826c c2826c = (C2826c) c2829f.mo6237c(c2825b);
                if (c2826c == null) {
                    c2826c = new C2826c(c2825b);
                    c2829f.m6243i(new C0076g(c2826c, 12));
                }
                c2826c.f9213h.add(obj);
                break;
            default:
                ((Map) obj).putAll(this.f9215b.f9220b);
                break;
        }
    }
}
