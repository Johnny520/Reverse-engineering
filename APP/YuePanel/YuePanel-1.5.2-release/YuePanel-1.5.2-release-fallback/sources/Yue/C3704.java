package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۧۦۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5336(24)
public final class C3704 implements Yue.InterfaceC3703 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final android.os.LocaleList f11828;

    public C3704(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            android.os.LocaleList r1 = (android.os.LocaleList) r1
            r0.f11828 = r1
            return
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            android.os.LocaleList r0 = r1.f11828
            Yue.ۥ۠ۧۦۧ r2 = (Yue.InterfaceC3703) r2
            java.lang.Object r2 = r2.mo14922()
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // Yue.InterfaceC3703
    public java.util.Locale get(int r2) {
            r1 = this;
            android.os.LocaleList r0 = r1.f11828
            java.util.Locale r2 = r0.get(r2)
            return r2
    }

    public int hashCode() {
            r1 = this;
            android.os.LocaleList r0 = r1.f11828
            int r0 = r0.hashCode()
            return r0
    }

    @Override // Yue.InterfaceC3703
    public boolean isEmpty() {
            r1 = this;
            android.os.LocaleList r0 = r1.f11828
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // Yue.InterfaceC3703
    public int size() {
            r1 = this;
            android.os.LocaleList r0 = r1.f11828
            int r0 = r0.size()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            android.os.LocaleList r0 = r1.f11828
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // Yue.InterfaceC3703
    /* JADX INFO: renamed from: ۥ */
    public int mo14920(java.util.Locale r2) {
            r1 = this;
            android.os.LocaleList r0 = r1.f11828
            int r2 = r0.indexOf(r2)
            return r2
    }

    @Override // Yue.InterfaceC3703
    /* JADX INFO: renamed from: ۥ۟ */
    public java.lang.String mo14921() {
            r1 = this;
            android.os.LocaleList r0 = r1.f11828
            java.lang.String r0 = r0.toLanguageTags()
            return r0
    }

    @Override // Yue.InterfaceC3703
    /* JADX INFO: renamed from: ۥ۟۟ */
    public java.lang.Object mo14922() {
            r1 = this;
            android.os.LocaleList r0 = r1.f11828
            return r0
    }

    @Override // Yue.InterfaceC3703
    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public java.util.Locale mo14923(@Yue.InterfaceC4410 java.lang.String[] r2) {
            r1 = this;
            android.os.LocaleList r0 = r1.f11828
            java.util.Locale r2 = r0.getFirstMatch(r2)
            return r2
    }
}
