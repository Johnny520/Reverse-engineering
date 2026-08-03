package p000a;

import android.os.LocaleList;

/* JADX INFO: renamed from: a.L9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0210L9 implements InterfaceC0192K9 {

    /* JADX INFO: renamed from: a */
    public final LocaleList f697a;

    public C0210L9(LocaleList localeList) {
        this.f697a = localeList;
    }

    @Override // p000a.InterfaceC0192K9
    /* JADX INFO: renamed from: a */
    public final Object mo527a() {
        return this.f697a;
    }

    public final boolean equals(Object obj) {
        return this.f697a.equals(((InterfaceC0192K9) obj).mo527a());
    }

    public final int hashCode() {
        return this.f697a.hashCode();
    }

    public final String toString() {
        return this.f697a.toString();
    }
}
