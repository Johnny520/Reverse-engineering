package p000;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: us */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0784us extends AbstractC0696sj {

    /* JADX INFO: renamed from: i */
    public final int f11456i;

    /* JADX INFO: renamed from: j */
    public final String f11457j;

    /* JADX INFO: renamed from: k */
    public final Integer f11458k;

    /* JADX INFO: renamed from: l */
    public final ArrayList f11459l;

    /* JADX INFO: renamed from: m */
    public final ArrayList f11460m;

    /* JADX INFO: renamed from: n */
    public final ArrayList f11461n;

    /* JADX INFO: renamed from: o */
    public final hx2 f11462o;

    /* JADX INFO: renamed from: p */
    public final hx2 f11463p;

    /* JADX INFO: renamed from: q */
    public final hx2 f11464q;

    public C0784us(DexKitBridge dexKitBridge, int i, int i2, int i3, String str, Integer num, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        super(dexKitBridge, i, i2);
        this.f11456i = i3;
        this.f11457j = str;
        this.f11458k = num;
        this.f11459l = arrayList;
        this.f11460m = arrayList2;
        this.f11461n = arrayList3;
        this.f11462o = new hx2(new C0159ea(5, this));
        this.f11463p = new hx2(new C0747ts(this, dexKitBridge, i2));
        this.f11464q = new hx2(new C0747ts(dexKitBridge, this, i2, 1));
        new hx2(new C0747ts(dexKitBridge, this, i2, 2));
        new hx2(new C0747ts(dexKitBridge, this, i2, 0));
        new hx2(new C0705ss(dexKitBridge, this, i2, i, 0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0784us) {
            return t11.m5086l(this.f11457j, ((C0784us) obj).f11457j);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11457j.hashCode();
    }

    /* JADX INFO: renamed from: k */
    public final u70 m5573k() {
        return (u70) this.f11462o.getValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f11456i;
        if (i > 0) {
            sb.append(Modifier.toString(i) + " ");
        }
        sb.append("class " + m5573k().f11124a);
        C0784us c0784us = (C0784us) this.f11463p.getValue();
        if (c0784us != null) {
            sb.append(" extends ");
            sb.append(c0784us.m5573k().f11124a);
        }
        if (this.f11459l.size() > 0) {
            sb.append(" implements ");
            sb.append(AbstractC0142du.m1165u0((C0858ws) this.f11464q.getValue(), ", ", null, null, C0799v6.f11775x, 30));
        }
        return sb.toString();
    }
}
