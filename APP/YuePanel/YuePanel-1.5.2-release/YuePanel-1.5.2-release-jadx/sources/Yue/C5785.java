package Yue;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: renamed from: Yue.ۥ۠ۧۦۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7113(24)
public final class C5785 implements InterfaceC5784 {

    /* JADX INFO: renamed from: ۥ */
    public final LocaleList f1684;

    public C5785(Object obj) {
        this.f1684 = (LocaleList) obj;
    }

    public boolean equals(Object obj) {
        return this.f1684.equals(((InterfaceC5784) obj).mo17922());
    }

    @Override // Yue.InterfaceC5784
    public Locale get(int i) {
        return this.f1684.get(i);
    }

    public int hashCode() {
        return this.f1684.hashCode();
    }

    @Override // Yue.InterfaceC5784
    public boolean isEmpty() {
        return this.f1684.isEmpty();
    }

    @Override // Yue.InterfaceC5784
    public int size() {
        return this.f1684.size();
    }

    public String toString() {
        return this.f1684.toString();
    }

    @Override // Yue.InterfaceC5784
    /* JADX INFO: renamed from: ۥ */
    public int mo2452(Locale locale) {
        return this.f1684.indexOf(locale);
    }

    @Override // Yue.InterfaceC5784
    /* JADX INFO: renamed from: ۥ۟ */
    public String mo2453() {
        return this.f1684.toLanguageTags();
    }

    @Override // Yue.InterfaceC5784
    /* JADX INFO: renamed from: ۥ۟۟ */
    public Object mo17922() {
        return this.f1684;
    }

    @Override // Yue.InterfaceC5784
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public Locale mo17923(@InterfaceC6391 String[] strArr) {
        return this.f1684.getFirstMatch(strArr);
    }
}
