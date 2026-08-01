package p018J;

import java.util.LinkedHashMap;
import org.luckypray.dexkit.DexKitBridge;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: J.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0157b {

    /* JADX INFO: renamed from: a */
    public final Object f470a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0157b() {
        this.f470a = new LinkedHashMap();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static long m338a(int i2, int i3) {
        return ((long) i3) | (((long) i2) << 32);
    }

    public AbstractC0157b(DexKitBridge dexKitBridge, int i2, int i3) {
        AbstractC0223g.m418e(dexKitBridge, "bridge");
        this.f470a = dexKitBridge;
    }
}
