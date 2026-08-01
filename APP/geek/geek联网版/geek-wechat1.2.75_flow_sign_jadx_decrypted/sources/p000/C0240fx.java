package p000;

import androidx.activity.C0029a;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: renamed from: fx */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0240fx extends AbstractC0513n8 implements InterfaceC0379jm, InterfaceC0110cn, InterfaceC0077bq {

    /* JADX INFO: renamed from: g */
    public final int f1843g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f1844h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0240fx(int i, Object obj) {
        super(obj, C0029a.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", false);
        this.f1844h = i;
        this.f1843g = 0;
    }

    @Override // p000.InterfaceC0379jm
    /* JADX INFO: renamed from: a */
    public final Object mo474a() {
        switch (this.f1844h) {
            case Base64.DEFAULT /* 0 */:
                ((C0029a) this.f3240b).m113d();
                break;
            default:
                ((C0029a) this.f3240b).m113d();
                break;
        }
        return C0893xh.f5258n;
    }

    @Override // p000.InterfaceC0110cn
    /* JADX INFO: renamed from: b */
    public final int mo653b() {
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC0077bq m1116d() {
        q00.f3767a.getClass();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0240fx) {
            C0240fx c0240fx = (C0240fx) obj;
            return this.f3242d.equals(c0240fx.f3242d) && this.f3243e.equals(c0240fx.f3243e) && this.f1843g == c0240fx.f1843g && AbstractC0493mp.m1853c(this.f3240b, c0240fx.f3240b) && m1928c().equals(c0240fx.m1928c());
        }
        if (!(obj instanceof C0240fx)) {
            return false;
        }
        InterfaceC0077bq interfaceC0077bq = this.f3239a;
        if (interfaceC0077bq == null) {
            m1116d();
            this.f3239a = this;
            interfaceC0077bq = this;
        }
        return obj.equals(interfaceC0077bq);
    }

    public final int hashCode() {
        m1928c();
        return this.f3243e.hashCode() + g40.m1142e(this.f3242d, m1928c().hashCode() * 31, 31);
    }

    public final String toString() {
        InterfaceC0077bq interfaceC0077bq = this.f3239a;
        if (interfaceC0077bq == null) {
            m1116d();
            this.f3239a = this;
            interfaceC0077bq = this;
        }
        if (interfaceC0077bq != this) {
            return interfaceC0077bq.toString();
        }
        String str = this.f3242d;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : g40.m1147j("function ", str, " (Kotlin reflection is not available)");
    }
}
