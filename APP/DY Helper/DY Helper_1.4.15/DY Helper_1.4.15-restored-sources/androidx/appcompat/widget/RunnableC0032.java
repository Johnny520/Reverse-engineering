package androidx.appcompat.widget;

/* JADX INFO: renamed from: androidx.appcompat.widget.ε */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0032 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f815;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f816;

    public /* synthetic */ RunnableC0032(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f815 = r1
            r0.f816 = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            int r0 = r1.f815
            switch(r0) {
                case 0: goto L15;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r1.f816
            androidx.appcompat.widget.θ r1 = (androidx.appcompat.widget.C0035) r1
            androidx.appcompat.widget.DropDownListView r1 = r1.f834
            if (r1 == 0) goto L14
            r0 = 1
            r1.setListSelectionHidden(r0)
            r1.requestLayout()
        L14:
            return
        L15:
            java.lang.Object r1 = r1.f816
            androidx.appcompat.widget.DropDownListView r1 = (androidx.appcompat.widget.DropDownListView) r1
            r0 = 0
            r1.f617 = r0
            r1.drawableStateChanged()
            return
    }
}
