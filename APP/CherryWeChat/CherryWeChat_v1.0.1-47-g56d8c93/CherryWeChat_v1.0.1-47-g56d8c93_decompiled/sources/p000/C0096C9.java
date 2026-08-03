package p000;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: C9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0096C9 extends AbstractC2614v5 {

    /* JADX INFO: renamed from: b */
    public final int f216b;

    /* JADX INFO: renamed from: c */
    public final String f217c;

    /* JADX INFO: renamed from: d */
    public final Integer f218d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f219e;

    /* JADX INFO: renamed from: f */
    public final C1251cA f220f;

    /* JADX INFO: renamed from: g */
    public final C1251cA f221g;

    /* JADX INFO: renamed from: h */
    public final C1251cA f222h;

    public C0096C9(DexKitBridge dexKitBridge, int i, int i2, int i3, String str, Integer num, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        super(dexKitBridge, i, i2);
        this.f216b = i3;
        this.f217c = str;
        this.f218d = num;
        this.f219e = arrayList;
        this.f220f = new C1251cA(new C2790z9(0, this));
        this.f221g = new C1251cA(new C0010A9(this, dexKitBridge, i2));
        this.f222h = new C1251cA(new C0010A9(dexKitBridge, this, i2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0096C9) {
            return AbstractC0585Nj.m1134a(this.f217c, ((C0096C9) obj).f217c);
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final C0106Cd m144g() {
        return (C0106Cd) this.f220f.getValue();
    }

    public final int hashCode() {
        return this.f217c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f216b;
        if (i > 0) {
            sb.append(Modifier.toString(i) + " ");
        }
        sb.append("class " + m144g().f249a);
        C0096C9 c0096c9 = (C0096C9) this.f221g.getValue();
        if (c0096c9 != null) {
            sb.append(" extends ");
            sb.append(c0096c9.m144g().f249a);
        }
        if (this.f219e.size() > 0) {
            sb.append(" implements ");
            sb.append(AbstractC2453ra.m4901k0((C0139D9) this.f222h.getValue(), ", ", null, null, C0053B9.f116c, 30));
        }
        return sb.toString();
    }
}
