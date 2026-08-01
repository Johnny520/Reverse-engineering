package p313v9;

import java.util.Collection;
import p024b9.AbstractC1061t;
import p081fa.InterfaceC2394v;
import p185m8.AbstractC5114x;
import p186m9.EnumC5132m;
import p343xa.EnumC9476f;

/* JADX INFO: renamed from: v9.c0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8860c0 extends AbstractC8864e0 implements InterfaceC2394v {

    /* JADX INFO: renamed from: b */
    public final Class f29424b;

    /* JADX INFO: renamed from: c */
    public final Collection f29425c;

    /* JADX INFO: renamed from: d */
    public final boolean f29426d;

    public C8860c0(Class cls) {
        cls.getClass();
        this.f29424b = cls;
        this.f29425c = AbstractC5114x.m20800o();
    }

    @Override // p313v9.AbstractC8864e0
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public Class mo34021U() {
        return this.f29424b;
    }

    @Override // p081fa.InterfaceC2375d
    public Collection getAnnotations() {
        return this.f29425c;
    }

    @Override // p081fa.InterfaceC2394v
    public EnumC5132m getType() {
        if (AbstractC1061t.m3842c(mo34021U(), Void.TYPE)) {
            return null;
        }
        return EnumC9476f.m36912c(mo34021U().getName()).m36916j();
    }

    @Override // p081fa.InterfaceC2375d
    /* JADX INFO: renamed from: k */
    public boolean mo8604k() {
        return this.f29426d;
    }
}
