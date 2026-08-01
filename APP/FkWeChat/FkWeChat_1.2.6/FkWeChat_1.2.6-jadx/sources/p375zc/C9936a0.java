package p375zc;

import ad.AbstractC0256f1;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p329wc.InterfaceC9218f;
import p376zd.C9987e;

/* JADX INFO: renamed from: zc.a0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9936a0 extends AbstractC9956k0 {

    /* JADX INFO: renamed from: q */
    public final boolean f33477q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC9218f f33478r;

    /* JADX INFO: renamed from: s */
    public final String f33479s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9936a0(Object obj, boolean z10, InterfaceC9218f interfaceC9218f) {
        super(null);
        obj.getClass();
        this.f33477q = z10;
        this.f33478r = interfaceC9218f;
        this.f33479s = obj.toString();
        if (interfaceC9218f == null || interfaceC9218f.mo35897k()) {
            return;
        }
        C9987e.m38645a("Failed requirement.");
        throw null;
    }

    @Override // p375zc.AbstractC9956k0
    /* JADX INFO: renamed from: a */
    public String mo38506a() {
        return this.f33479s;
    }

    @Override // p375zc.AbstractC9956k0
    /* JADX INFO: renamed from: c */
    public boolean mo38507c() {
        return this.f33477q;
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC9218f m38508e() {
        return this.f33478r;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9936a0.class != obj.getClass()) {
            return false;
        }
        C9936a0 c9936a0 = (C9936a0) obj;
        return mo38507c() == c9936a0.mo38507c() && AbstractC1061t.m3842c(mo38506a(), c9936a0.mo38506a());
    }

    public int hashCode() {
        return (Boolean.hashCode(mo38507c()) * 31) + mo38506a().hashCode();
    }

    @Override // p375zc.AbstractC9956k0
    public String toString() {
        if (!mo38507c()) {
            return mo38506a();
        }
        StringBuilder sb2 = new StringBuilder();
        AbstractC0256f1.m754c(sb2, mo38506a());
        return sb2.toString();
    }

    public /* synthetic */ C9936a0(Object obj, boolean z10, InterfaceC9218f interfaceC9218f, int i10, AbstractC1043k abstractC1043k) {
        this(obj, z10, (i10 & 4) != 0 ? null : interfaceC9218f);
    }
}
