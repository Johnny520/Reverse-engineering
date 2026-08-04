package yyds;

/* JADX INFO: renamed from: yyds.ᲈᛳᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2617 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public boolean f12864;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final EnumC0868 f12865;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final ViewOnLayoutChangeListenerC0605 f12866;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public boolean f12867;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final ViewOnAttachStateChangeListenerC1217 f12868;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public int f12869;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public String f12870;

    public C2617(EnumC0868 enumC0868, ViewOnLayoutChangeListenerC0605 viewOnLayoutChangeListenerC0605, ViewOnAttachStateChangeListenerC1217 viewOnAttachStateChangeListenerC1217) {
        AbstractC2328.m4341(-1076103628882798L);
        AbstractC2328.m4341(-1076125103719278L);
        AbstractC2328.m4341(-1076189528228718L);
        this.f12865 = enumC0868;
        this.f12866 = viewOnLayoutChangeListenerC0605;
        this.f12868 = viewOnAttachStateChangeListenerC1217;
        this.f12870 = null;
        this.f12864 = false;
        this.f12869 = 0;
        this.f12867 = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2617) {
            C2617 c2617 = (C2617) obj;
            if (this.f12865 == c2617.f12865 && this.f12866 == c2617.f12866 && this.f12868 == c2617.f12868 && AbstractC1544.m3188(this.f12870, c2617.f12870) && this.f12864 == c2617.f12864 && this.f12869 == c2617.f12869 && this.f12867 == c2617.f12867) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f12868.hashCode() + ((this.f12866.hashCode() + (this.f12865.hashCode() * 31)) * 31)) * 31;
        String str = this.f12870;
        return Boolean.hashCode(this.f12867) + AbstractC2104.m4018(this.f12869, AbstractC2104.m4021((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f12864), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-1076404276593518L));
        sb.append(this.f12865);
        sb.append(AbstractC2328.m4341(-1076481586004846L));
        sb.append(this.f12866);
        sb.append(AbstractC2328.m4341(-1076558895416174L));
        sb.append(this.f12868);
        sb.append(AbstractC2328.m4341(-1076636204827502L));
        AbstractC0897.m2002(sb, this.f12870, -1076730694108014L);
        AbstractC2104.m4017(sb, this.f12864, -1076773643780974L);
        AbstractC2104.m4007(sb, this.f12869, -1076850953192302L);
        return AbstractC0897.m1986(sb, this.f12867, ')');
    }
}
