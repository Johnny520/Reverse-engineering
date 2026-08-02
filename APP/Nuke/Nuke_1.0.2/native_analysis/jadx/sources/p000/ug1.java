package p000;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ug1 extends AbstractC0696sj {

    /* JADX INFO: renamed from: i */
    public final int f11290i;

    /* JADX INFO: renamed from: j */
    public final int f11291j;

    /* JADX INFO: renamed from: k */
    public final String f11292k;

    /* JADX INFO: renamed from: l */
    public final int f11293l;

    /* JADX INFO: renamed from: m */
    public final ArrayList f11294m;

    /* JADX INFO: renamed from: n */
    public final hx2 f11295n;

    public ug1(DexKitBridge dexKitBridge, int i, int i2, int i3, int i4, String str, int i5, ArrayList arrayList) {
        super(dexKitBridge, i, i2);
        this.f11290i = i3;
        this.f11291j = i4;
        this.f11292k = str;
        this.f11293l = i5;
        this.f11294m = arrayList;
        this.f11295n = new hx2(new C0159ea(15, this));
        new hx2(new tg1(dexKitBridge, this, i2, 0));
        new hx2(new tg1(dexKitBridge, this, i2, 2));
        new hx2(new tg1(dexKitBridge, this, i2, 1));
        new hx2(new C0705ss(dexKitBridge, this, i2, i, 9));
        new hx2(new C0705ss(dexKitBridge, this, i2, i, 4));
        new hx2(new C0705ss(dexKitBridge, this, i2, i, 8));
        new hx2(new C0705ss(dexKitBridge, this, i2, i, 7));
        new hx2(new C0705ss(dexKitBridge, this, i2, i, 5));
        new hx2(new C0705ss(dexKitBridge, this, i2, i, 6));
        new hx2(new C0705ss(dexKitBridge, this, i2, i, 11));
        new hx2(new C0705ss(dexKitBridge, this, i2, i, 10));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ug1) && t11.m5086l(((ug1) obj).f11292k, this.f11292k);
    }

    public final int hashCode() {
        return this.f11292k.hashCode();
    }

    /* JADX INFO: renamed from: k */
    public final g80 m5492k() {
        return (g80) this.f11295n.getValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f11291j;
        if (i != 0) {
            sb.append(Modifier.toString(i) + " ");
        }
        sb.append(m5492k().f3349d);
        sb.append(" ");
        sb.append(m5492k().f3346a);
        sb.append(".");
        sb.append(m5492k().f3347b);
        sb.append("(");
        return hk1.m2211j(sb, AbstractC0142du.m1165u0(m5492k().f3348c, ", ", null, null, null, 62), ")");
    }
}
