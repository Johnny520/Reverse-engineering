package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۢۨۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public class C2771 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4544
    public final java.util.Collection<androidx.fragment.app.Fragment> f9060;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4544
    public final java.util.Map<java.lang.String, Yue.C2771> f9061;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4544
    public final java.util.Map<java.lang.String, androidx.lifecycle.ViewModelStore> f9062;

    public C2771(@Yue.InterfaceC4544 java.util.Collection<androidx.fragment.app.Fragment> r1, @Yue.InterfaceC4544 java.util.Map<java.lang.String, Yue.C2771> r2, @Yue.InterfaceC4544 java.util.Map<java.lang.String, androidx.lifecycle.ViewModelStore> r3) {
            r0 = this;
            r0.<init>()
            r0.f9060 = r1
            r0.f9061 = r2
            r0.f9062 = r3
            return
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public java.util.Map<java.lang.String, Yue.C2771> m12128() {
            r1 = this;
            java.util.Map<java.lang.String, Yue.ۥ۠ۢۨۥ> r0 = r1.f9061
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public java.util.Collection<androidx.fragment.app.Fragment> m12129() {
            r1 = this;
            java.util.Collection<androidx.fragment.app.Fragment> r0 = r1.f9060
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public java.util.Map<java.lang.String, androidx.lifecycle.ViewModelStore> m12130() {
            r1 = this;
            java.util.Map<java.lang.String, androidx.lifecycle.ViewModelStore> r0 = r1.f9062
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean m12131(androidx.fragment.app.Fragment r2) {
            r1 = this;
            java.util.Collection<androidx.fragment.app.Fragment> r0 = r1.f9060
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            boolean r2 = r0.contains(r2)
            return r2
    }
}
