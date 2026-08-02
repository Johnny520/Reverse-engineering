package p000;

import java.lang.reflect.Modifier;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ji0 extends AbstractC0696sj {

    /* JADX INFO: renamed from: i */
    public final int f5046i;

    /* JADX INFO: renamed from: j */
    public final int f5047j;

    /* JADX INFO: renamed from: k */
    public final String f5048k;

    /* JADX INFO: renamed from: l */
    public final int f5049l;

    /* JADX INFO: renamed from: m */
    public final hx2 f5050m;

    public ji0(DexKitBridge dexKitBridge, int i, int i2, int i3, int i4, String str, int i5) {
        super(dexKitBridge, i, i2);
        this.f5046i = i3;
        this.f5047j = i4;
        this.f5048k = str;
        this.f5049l = i5;
        this.f5050m = new hx2(new C0159ea(9, this));
        new hx2(new ii0(dexKitBridge, this, i2, 0));
        new hx2(new ii0(dexKitBridge, this, i2, 1));
        new hx2(new C0705ss(dexKitBridge, this, i2, i, 1));
        new hx2(new C0705ss(dexKitBridge, this, i2, i, 2));
        new hx2(new C0705ss(dexKitBridge, this, i2, i, 3));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ji0) && t11.m5086l(((ji0) obj).f5048k, this.f5048k);
    }

    public final int hashCode() {
        return this.f5048k.hashCode();
    }

    /* JADX INFO: renamed from: k */
    public final y70 m2501k() {
        return (y70) this.f5050m.getValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f5047j;
        if (i > 0) {
            sb.append(Modifier.toString(i) + " ");
        }
        sb.append(m2501k().f13329c);
        sb.append(" ");
        sb.append(m2501k().f13327a);
        sb.append(".");
        sb.append(m2501k().f13328b);
        return sb.toString();
    }
}
