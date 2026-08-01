package p000;

import androidx.activity.C0029a;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: renamed from: xw */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0908xw extends AbstractC0142d8 implements InterfaceC0303hm, InterfaceC0024an, InterfaceC0901xp {

    /* JADX INFO: renamed from: g */
    public final int f5214g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f5215h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0908xw(int i, Object obj) {
        super(obj, C0029a.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", false);
        this.f5215h = i;
        this.f5214g = 0;
    }

    @Override // p000.InterfaceC0303hm
    /* JADX INFO: renamed from: a */
    public final Object mo10a() {
        switch (this.f5215h) {
            case Base64.DEFAULT /* 0 */:
                ((C0029a) this.f1400b).m128d();
                break;
            default:
                ((C0029a) this.f1400b).m128d();
                break;
        }
        return C0819vh.f4855n;
    }

    @Override // p000.InterfaceC0024an
    /* JADX INFO: renamed from: b */
    public final int mo115b() {
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC0901xp m2638d() {
        j00.f2515a.getClass();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0908xw) {
            C0908xw c0908xw = (C0908xw) obj;
            return this.f1402d.equals(c0908xw.f1402d) && this.f1403e.equals(c0908xw.f1403e) && this.f5214g == c0908xw.f5214g && AbstractC0346ip.m1497i(this.f1400b, c0908xw.f1400b) && m927c().equals(c0908xw.m927c());
        }
        if (!(obj instanceof C0908xw)) {
            return false;
        }
        InterfaceC0901xp interfaceC0901xp = this.f1399a;
        if (interfaceC0901xp == null) {
            m2638d();
            this.f1399a = this;
            interfaceC0901xp = this;
        }
        return obj.equals(interfaceC0901xp);
    }

    public final int hashCode() {
        m927c();
        return this.f1403e.hashCode() + z30.m2760e(this.f1402d, m927c().hashCode() * 31, 31);
    }

    public final String toString() {
        InterfaceC0901xp interfaceC0901xp = this.f1399a;
        if (interfaceC0901xp == null) {
            m2638d();
            this.f1399a = this;
            interfaceC0901xp = this;
        }
        if (interfaceC0901xp != this) {
            return interfaceC0901xp.toString();
        }
        String str = this.f1402d;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : z30.m2765j("function ", str, " (Kotlin reflection is not available)");
    }
}
