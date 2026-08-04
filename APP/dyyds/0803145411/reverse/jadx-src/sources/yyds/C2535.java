package yyds;

import android.animation.ValueAnimator;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: yyds.ᲇᲁᲁᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2535 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public String f12479;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public boolean f12480;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final ViewOnAttachStateChangeListenerC1310 f12481;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public WeakReference f12482;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final EnumC2097 f12483;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public EnumC0868 f12484;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public EnumC1796 f12485;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public ValueAnimator f12486;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public boolean f12487;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final WeakReference f12488;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public boolean f12489;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public Boolean f12490;

    public C2535(WeakReference weakReference, EnumC2097 enumC2097, WeakReference weakReference2, Boolean bool, ViewOnAttachStateChangeListenerC1310 viewOnAttachStateChangeListenerC1310) {
        EnumC1796 enumC1796 = EnumC1796.f9062;
        AbstractC2328.m4341(-999395512976238L);
        AbstractC2328.m4341(-999416987812718L);
        AbstractC2328.m4341(-999438462649198L);
        AbstractC2328.m4341(-999477117354862L);
        AbstractC2328.m4341(-999502887158638L);
        this.f12482 = weakReference;
        this.f12483 = enumC2097;
        this.f12488 = weakReference2;
        this.f12490 = bool;
        this.f12481 = viewOnAttachStateChangeListenerC1310;
        this.f12489 = false;
        this.f12484 = null;
        this.f12479 = null;
        this.f12480 = false;
        this.f12487 = true;
        this.f12485 = enumC1796;
        this.f12486 = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2535) {
            C2535 c2535 = (C2535) obj;
            if (this.f12482.equals(c2535.f12482) && this.f12483 == c2535.f12483 && this.f12488.equals(c2535.f12488) && AbstractC1544.m3188(this.f12490, c2535.f12490) && this.f12481 == c2535.f12481 && this.f12489 == c2535.f12489 && this.f12484 == c2535.f12484 && AbstractC1544.m3188(this.f12479, c2535.f12479) && this.f12480 == c2535.f12480 && this.f12487 == c2535.f12487 && this.f12485 == c2535.f12485 && AbstractC1544.m3188(this.f12486, c2535.f12486)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f12488.hashCode() + ((this.f12483.hashCode() + (this.f12482.hashCode() * 31)) * 31)) * 31;
        Boolean bool = this.f12490;
        int iM4021 = AbstractC2104.m4021((this.f12481.hashCode() + ((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31)) * 31, 31, this.f12489);
        EnumC0868 enumC0868 = this.f12484;
        int iHashCode2 = (iM4021 + (enumC0868 == null ? 0 : enumC0868.hashCode())) * 31;
        String str = this.f12479;
        int iHashCode3 = (this.f12485.hashCode() + AbstractC2104.m4021(AbstractC2104.m4021((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f12480), 31, this.f12487)) * 31;
        ValueAnimator valueAnimator = this.f12486;
        return iHashCode3 + (valueAnimator != null ? valueAnimator.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-999764880163694L));
        sb.append(this.f12482);
        sb.append(AbstractC2328.m4341(-999846484542318L));
        sb.append(this.f12483);
        sb.append(AbstractC2328.m4341(-999880844280686L));
        sb.append(this.f12488);
        sb.append(AbstractC2328.m4341(-999932383888238L));
        sb.append(this.f12490);
        sb.append(AbstractC2328.m4341(-999983923495790L));
        sb.append(this.f12481);
        sb.append(AbstractC2328.m4341(-1000022578201454L));
        AbstractC2104.m4017(sb, this.f12489, -1000091297678190L);
        sb.append(this.f12484);
        sb.append(AbstractC2328.m4341(-1000164312122222L));
        AbstractC0897.m2002(sb, this.f12479, -1000233031598958L);
        AbstractC2104.m4017(sb, this.f12480, -1000310341010286L);
        AbstractC2104.m4017(sb, this.f12487, -1000400535323502L);
        sb.append(this.f12485);
        sb.append(AbstractC2328.m4341(-1000456369898350L));
        sb.append(this.f12486);
        sb.append(')');
        return sb.toString();
    }
}
