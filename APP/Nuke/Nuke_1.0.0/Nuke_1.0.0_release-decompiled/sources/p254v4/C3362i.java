package p254v4;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import org.luckypray.dexkit.DexKitBridge;
import p001A0.C0102b;
import p032F3.AbstractC0453a;
import p049I2.AbstractC0797o;
import p056K2.C0887m;
import p061L2.AbstractC0973m;
import p117X2.AbstractC1665j;
import p277z4.C3523a;

/* JADX INFO: renamed from: v4.i */
/* JADX INFO: loaded from: classes.dex */
public final class C3362i extends AbstractC0453a {

    /* JADX INFO: renamed from: e */
    public final int f10437e;

    /* JADX INFO: renamed from: f */
    public final String f10438f;

    /* JADX INFO: renamed from: g */
    public final Integer f10439g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f10440h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f10441i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f10442j;

    /* JADX INFO: renamed from: k */
    public final C0887m f10443k;

    /* JADX INFO: renamed from: l */
    public final C0887m f10444l;

    /* JADX INFO: renamed from: m */
    public final C0887m f10445m;

    public C3362i(DexKitBridge dexKitBridge, int i5, int i6, int i7, String str, Integer num, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        super(dexKitBridge, i5, i6);
        this.f10437e = i7;
        this.f10438f = str;
        this.f10439g = num;
        this.f10440h = arrayList;
        this.f10441i = arrayList2;
        this.f10442j = arrayList3;
        this.f10443k = AbstractC0797o.m1396u(new C0102b(17, this));
        this.f10444l = AbstractC0797o.m1396u(new C3360g(this, dexKitBridge, i6));
        this.f10445m = AbstractC0797o.m1396u(new C3360g(dexKitBridge, this, i6, 1));
        AbstractC0797o.m1396u(new C3360g(dexKitBridge, this, i6, 2));
        AbstractC0797o.m1396u(new C3360g(dexKitBridge, this, i6, 0));
        AbstractC0797o.m1396u(new C3359f(dexKitBridge, this, i6, i5, 0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3362i) {
            return AbstractC1665j.m2981a(this.f10438f, ((C3362i) obj).f10438f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10438f.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i5 = this.f10437e;
        if (i5 > 0) {
            sb.append(Modifier.toString(i5) + " ");
        }
        sb.append("class " + ((C3523a) this.f10443k.getValue()).f10980a);
        C3362i c3362i = (C3362i) this.f10444l.getValue();
        if (c3362i != null) {
            sb.append(" extends ");
            sb.append(((C3523a) c3362i.f10443k.getValue()).f10980a);
        }
        if (this.f10440h.size() > 0) {
            sb.append(" implements ");
            sb.append(AbstractC0973m.m2016W((C3363j) this.f10445m.getValue(), ", ", null, null, C3361h.f10436e, 30));
        }
        String string = sb.toString();
        AbstractC1665j.m2984d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
