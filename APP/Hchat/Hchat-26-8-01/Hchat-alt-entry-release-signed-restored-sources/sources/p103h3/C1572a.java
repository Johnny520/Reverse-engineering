package p103h3;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: renamed from: h3.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1572a extends ClickableSpan {

    /* JADX INFO: renamed from: g */
    public final int f5234g;

    /* JADX INFO: renamed from: h */
    public final C1578g f5235h;

    /* JADX INFO: renamed from: i */
    public final int f5236i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1572a(int i9, C1578g c1578g, int i10) {
        this.f5234g = i9;
        this.f5235h = c1578g;
        this.f5236i = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f5234g);
        this.f5235h.f5248a.performAction(this.f5236i, bundle);
    }
}
