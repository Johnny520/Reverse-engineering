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

    public C0096C9(DexKitBridge r1, int r2, int r3, int r4, String r5, Integer r6, ArrayList r7, ArrayList r8, ArrayList r9) {
        super(r1, r2, r3);
        this.f216b = r4;
        this.f217c = r5;
        this.f218d = r6;
        this.f219e = r7;
        this.f220f = new C1251cA(new C2790z9(0, this));
        this.f221g = new C1251cA(new C0010A9(this, r1, r3));
        this.f222h = new C1251cA(new C0010A9(r1, this, r3));
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L6;
        return true;
    L6:
        if ((r3 instanceof C0096C9) == false) goto L10;
        String r32 = ((C0096C9) r3).f217c;
        if (AbstractC0585Nj.m1134a(this.f217c, r32) == false) goto L12;
        return true;
    L12:
        return false;
    L10:
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
        StringBuilder r0 = new StringBuilder();
        int r1 = this.f216b;
        if (r1 <= 0) goto L5;
        r0.append(Modifier.toString(r1) + " ");
    L5:
        r0.append("class " + m144g().f249a);
        C0096C9 r12 = (C0096C9) this.f221g.getValue();
        if (r12 == null) goto L9;
        r0.append(" extends ");
        r0.append(r12.m144g().f249a);
    L9:
        if (this.f219e.size() <= 0) goto L12;
        r0.append(" implements ");
        r0.append(AbstractC2453ra.m4901k0((C0139D9) this.f222h.getValue(), ", ", null, null, C0053B9.f116c, 30));
    L12:
        return r0.toString();
    }
}
