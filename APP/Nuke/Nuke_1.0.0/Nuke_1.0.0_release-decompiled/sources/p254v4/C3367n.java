package p254v4;

import java.util.ArrayList;
import java.util.Iterator;
import me.dartcv.nuke.BuildConfig;
import org.luckypray.dexkit.DexKitBridge;
import p032F3.AbstractC0453a;
import p061L2.AbstractC0973m;
import p061L2.AbstractC0974n;
import p112W2.InterfaceC1599a;
import p117X2.AbstractC1666k;

/* JADX INFO: renamed from: v4.n */
/* JADX INFO: loaded from: classes.dex */
public final class C3367n extends AbstractC1666k implements InterfaceC1599a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f10456e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ DexKitBridge f10457f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C3368o f10458g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f10459h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3367n(DexKitBridge dexKitBridge, C3368o c3368o, int i5, int i6) {
        super(0);
        this.f10456e = i6;
        this.f10457f = dexKitBridge;
        this.f10458g = c3368o;
        this.f10459h = i5;
    }

    @Override // p112W2.InterfaceC1599a
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        int i5 = this.f10456e;
        int i6 = this.f10459h;
        C3368o c3368o = this.f10458g;
        DexKitBridge dexKitBridge = this.f10457f;
        switch (i5) {
            case 0:
                C3363j c3363jM5006D = dexKitBridge.m5006D(new long[]{AbstractC0453a.m738c(i6, c3368o.f10460e)});
                return (C3362i) (c3363jM5006D.isEmpty() ? null : c3363jM5006D.first());
            case BuildConfig.VERSION_CODE /* 1 */:
                ArrayList arrayList = c3368o.f10464i;
                ArrayList arrayList2 = new ArrayList(AbstractC0974n.m2029K(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Long.valueOf(AbstractC0453a.m738c(i6, ((Number) it.next()).intValue())));
                }
                return dexKitBridge.m5006D(AbstractC0973m.m2025f0(arrayList2));
            default:
                C3363j c3363jM5006D2 = dexKitBridge.m5006D(new long[]{AbstractC0453a.m738c(i6, c3368o.f10463h)});
                return (C3362i) (c3363jM5006D2.isEmpty() ? null : c3363jM5006D2.first());
        }
    }
}
