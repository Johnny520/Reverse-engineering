package af;

import bf.AbstractC1118a;
import cf.C1527b;
import cf.C1531d;
import org.luckypray.dexkit.DexKitBridge;
import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: af.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0329b extends AbstractC1118a {

    /* JADX INFO: renamed from: f */
    public static final a f837f = new a(null);

    /* JADX INFO: renamed from: d */
    public final String f838d;

    /* JADX INFO: renamed from: e */
    public final C0331d f839e;

    public C0329b(DexKitBridge dexKitBridge, String str, C0331d c0331d) {
        super(dexKitBridge, 0, 0, 6, null);
        this.f838d = str;
        this.f839e = c0331d;
    }

    public String toString() {
        return this.f838d + " = " + this.f839e;
    }

    /* JADX INFO: renamed from: af.b$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C0329b m1007a(DexKitBridge dexKitBridge, C1527b c1527b) {
            dexKitBridge.getClass();
            c1527b.getClass();
            C1531d c1531dM5960o = c1527b.m5960o(new C1531d());
            c1531dM5960o.getClass();
            String strM5959n = c1527b.m5959n();
            strM5959n.getClass();
            return new C0329b(dexKitBridge, strM5959n, C0331d.f843c.m1011b(dexKitBridge, c1531dM5960o), null);
        }

        public a() {
        }
    }

    public /* synthetic */ C0329b(DexKitBridge dexKitBridge, String str, C0331d c0331d, AbstractC1043k abstractC1043k) {
        this(dexKitBridge, str, c0331d);
    }
}
