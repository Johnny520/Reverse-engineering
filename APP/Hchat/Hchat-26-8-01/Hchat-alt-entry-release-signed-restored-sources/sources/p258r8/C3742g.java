package p258r8;

import android.content.Context;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import org.luckypray.dexkit.DexKitBridge;
import p077f8.C1083c;
import p099h.Hchat.dexkit.DexBridgeHolder;
import p099h.Hchat.dexkit.DexFinder;
import p300ub.C4301a;
import p317vb.C4546c;

/* JADX INFO: renamed from: r8.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3742g {

    /* JADX INFO: renamed from: a */
    public final Context f12143a;

    /* JADX INFO: renamed from: b */
    public final Context f12144b;

    /* JADX INFO: renamed from: c */
    public final ClassLoader f12145c;

    /* JADX INFO: renamed from: d */
    public final DexKitBridge f12146d;

    /* JADX INFO: renamed from: e */
    public final DexFinder f12147e;

    /* JADX INFO: renamed from: f */
    public final C1083c f12148f;

    /* JADX INFO: renamed from: g */
    public final C4301a f12149g;

    /* JADX INFO: renamed from: h */
    public final DexBridgeHolder f12150h;

    /* JADX INFO: renamed from: i */
    public final C4546c f12151i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3742g(Context context, Context context2, ClassLoader classLoader, XC_LoadPackage.LoadPackageParam loadPackageParam, DexKitBridge dexKitBridge, DexFinder dexFinder, C1083c c1083c, C4301a c4301a, DexBridgeHolder dexBridgeHolder, C4546c c4546c) {
        classLoader.getClass();
        dexKitBridge.getClass();
        c1083c.getClass();
        c4301a.getClass();
        c4546c.getClass();
        this.f12143a = context;
        this.f12144b = context2;
        this.f12145c = classLoader;
        this.f12146d = dexKitBridge;
        this.f12147e = dexFinder;
        this.f12148f = c1083c;
        this.f12149g = c4301a;
        this.f12150h = dexBridgeHolder;
        this.f12151i = c4546c;
    }
}
