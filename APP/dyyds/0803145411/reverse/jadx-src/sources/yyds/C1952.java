package yyds;

/* JADX INFO: renamed from: yyds.ᲀᛲᲈᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1952 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public boolean f9802;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final EnumC2097 f9803;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final ViewOnLayoutChangeListenerC0605 f9804;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final ViewOnAttachStateChangeListenerC1217 f9805;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public int f9806;

    public C1952(EnumC2097 enumC2097, ViewOnLayoutChangeListenerC0605 viewOnLayoutChangeListenerC0605, ViewOnAttachStateChangeListenerC1217 viewOnAttachStateChangeListenerC1217) {
        AbstractC2328.m4341(-941353324938094L);
        AbstractC2328.m4341(-941374799774574L);
        AbstractC2328.m4341(-941439224284014L);
        this.f9803 = enumC2097;
        this.f9804 = viewOnLayoutChangeListenerC0605;
        this.f9805 = viewOnAttachStateChangeListenerC1217;
        this.f9806 = 0;
        this.f9802 = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1952) {
            C1952 c1952 = (C1952) obj;
            if (this.f9803 == c1952.f9803 && this.f9804 == c1952.f9804 && this.f9805 == c1952.f9805 && this.f9806 == c1952.f9806 && this.f9802 == c1952.f9802) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9802) + AbstractC2104.m4018(this.f9806, (this.f9805.hashCode() + ((this.f9804.hashCode() + (this.f9803.hashCode() * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-941653972648814L));
        sb.append(this.f9803);
        sb.append(AbstractC2328.m4341(-941731282060142L));
        sb.append(this.f9804);
        sb.append(AbstractC2328.m4341(-941808591471470L));
        sb.append(this.f9805);
        sb.append(AbstractC2328.m4341(-941885900882798L));
        AbstractC2104.m4007(sb, this.f9806, -941967505261422L);
        return AbstractC0897.m1986(sb, this.f9802, ')');
    }
}
