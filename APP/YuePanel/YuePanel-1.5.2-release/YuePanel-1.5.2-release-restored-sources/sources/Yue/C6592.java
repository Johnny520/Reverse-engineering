package Yue;

import java.util.Collection;

/* JADX INFO: renamed from: Yue.ۥۣۡۥۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7470(version = "1.1")
public final class C6592 implements InterfaceC3827 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final Class<?> f16918;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public final String f16919;

    public C6592(@InterfaceC6399 Class<?> cls, @InterfaceC6399 String str) {
        C5499.m17103(cls, "jClass");
        C5499.m17103(str, "moduleName");
        this.f16918 = cls;
        this.f16919 = str;
    }

    public boolean equals(@InterfaceC6489 Object obj) {
        return (obj instanceof C6592) && C5499.m17094(mo10566(), ((C6592) obj).mo10566());
    }

    public int hashCode() {
        return mo10566().hashCode();
    }

    @InterfaceC6399
    public String toString() {
        return mo10566().toString() + C7071.f2662;
    }

    @Override // Yue.InterfaceC5589
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ */
    public Collection<InterfaceC5584<?>> mo10593() {
        throw new C5670();
    }

    @Override // Yue.InterfaceC3827
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public Class<?> mo10566() {
        return this.f16918;
    }
}
