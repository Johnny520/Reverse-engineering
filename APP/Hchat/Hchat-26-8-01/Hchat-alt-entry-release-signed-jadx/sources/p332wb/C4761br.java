package p332wb;

import android.view.View;
import android.view.ViewGroup;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: wb.br */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4761br {

    /* JADX INFO: renamed from: a */
    public final View f16122a;

    /* JADX INFO: renamed from: b */
    public final int f16123b;

    /* JADX INFO: renamed from: c */
    public final ViewGroup.LayoutParams f16124c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4761br(View view, int i9, ViewGroup.LayoutParams layoutParams) {
        this.f16122a = view;
        this.f16123b = i9;
        this.f16124c = layoutParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4761br)) {
            return false;
        }
        C4761br c4761br = (C4761br) obj;
        return this.f16122a.equals(c4761br.f16122a) && this.f16123b == c4761br.f16123b && this.f16124c.equals(c4761br.f16124c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f16124c.hashCode() + AbstractC0921a.m2242e(this.f16123b, this.f16122a.hashCode() * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ContentChild(view=" + this.f16122a + ", index=" + this.f16123b + ", layoutParams=" + this.f16124c + ")";
    }
}
