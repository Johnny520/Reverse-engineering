package com.kongzue.dialogx.util.views;

/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public class DialogScrollView extends android.widget.ScrollView implements xhss.InterfaceC0455 {

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public boolean f96;

    public DialogScrollView(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public DialogScrollView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // xhss.InterfaceC0455
    public int getScrollDistance() {
            r0 = this;
            int r0 = r0.getScrollY()
            return r0
    }

    @Override // android.widget.ScrollView, android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            boolean r0 = r1.f96
            if (r0 == 0) goto L6
            r1 = 0
            return r1
        L6:
            boolean r1 = super.onTouchEvent(r2)
            return r1
    }

    @Override // xhss.InterfaceC0455
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final void mo66(boolean r1) {
            r0 = this;
            r0.f96 = r1
            return
    }

    @Override // xhss.InterfaceC0455
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final boolean mo67() {
            r2 = this;
            r0 = 0
            android.view.View r1 = r2.getChildAt(r0)
            if (r1 == 0) goto L13
            int r1 = r1.getHeight()
            int r2 = r2.getHeight()
            if (r2 >= r1) goto L13
            r2 = 1
            return r2
        L13:
            return r0
    }
}
