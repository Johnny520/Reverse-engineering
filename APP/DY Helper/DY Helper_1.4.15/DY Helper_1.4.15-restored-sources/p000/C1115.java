package p000;

/* JADX INFO: renamed from: н */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C1115 extends android.text.style.ClickableSpan {

    /* JADX INFO: renamed from: ε */
    public final int f13448;

    /* JADX INFO: renamed from: ζ */
    public final p000.C1128 f13449;

    /* JADX INFO: renamed from: η */
    public final int f13450;

    public C1115(int r1, p000.C1128 r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f13448 = r1
            r0.f13449 = r2
            r0.f13450 = r3
            return
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(android.view.View r3) {
            r2 = this;
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r0 = "ACCESSIBILITY_CLICKABLE_SPAN_ID"
            int r1 = r2.f13448
            r3.putInt(r0, r1)
            int r0 = r2.f13450
            э r2 = r2.f13449
            android.view.accessibility.AccessibilityNodeInfo r2 = r2.f13478
            r2.performAction(r0, r3)
            return
    }
}
