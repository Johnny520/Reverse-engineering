package p278t3;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: renamed from: t3.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8104g implements InterfaceC8103f {

    /* JADX INFO: renamed from: a */
    public final LocaleList f27047a;

    public C8104g(Object obj) {
        this.f27047a = (LocaleList) obj;
    }

    @Override // p278t3.InterfaceC8103f
    /* JADX INFO: renamed from: a */
    public Object mo31323a() {
        return this.f27047a;
    }

    public boolean equals(Object obj) {
        return this.f27047a.equals(((InterfaceC8103f) obj).mo31323a());
    }

    @Override // p278t3.InterfaceC8103f
    public Locale get(int i10) {
        return this.f27047a.get(i10);
    }

    public int hashCode() {
        return this.f27047a.hashCode();
    }

    public String toString() {
        return this.f27047a.toString();
    }
}
