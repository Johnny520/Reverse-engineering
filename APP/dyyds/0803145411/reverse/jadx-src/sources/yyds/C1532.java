package yyds;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: yyds.ᛷᛴᛵᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1532 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final TextView f7364;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final LinearLayout f7365;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final ImageView f7366;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final TextView f7367;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final TextView f7368;

    public C1532(LinearLayout linearLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3) {
        AbstractC2328.m4341(-118407526253422L);
        AbstractC2328.m4341(-118429001089902L);
        AbstractC2328.m4341(-118463360828270L);
        AbstractC2328.m4341(-118514900435822L);
        AbstractC2328.m4341(-118544965206894L);
        this.f7365 = linearLayout;
        this.f7366 = imageView;
        this.f7367 = textView;
        this.f7368 = textView2;
        this.f7364 = textView3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1532)) {
            return false;
        }
        C1532 c1532 = (C1532) obj;
        return this.f7365.equals(c1532.f7365) && this.f7366.equals(c1532.f7366) && this.f7367.equals(c1532.f7367) && this.f7368.equals(c1532.f7368) && this.f7364.equals(c1532.f7364);
    }

    public final int hashCode() {
        return this.f7364.hashCode() + ((this.f7368.hashCode() + ((this.f7367.hashCode() + ((this.f7366.hashCode() + (this.f7365.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return AbstractC2328.m4341(-118802663244654L) + this.f7365 + AbstractC2328.m4341(-118871382721390L) + this.f7366 + AbstractC2328.m4341(-118918627361646L) + this.f7367 + AbstractC2328.m4341(-118983051871086L) + this.f7368 + AbstractC2328.m4341(-119026001544046L) + this.f7364 + ')';
    }
}
