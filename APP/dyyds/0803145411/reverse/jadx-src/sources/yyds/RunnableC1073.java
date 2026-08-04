package yyds;

import java.util.WeakHashMap;

/* JADX INFO: renamed from: yyds.ᛵᛴᛵᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1073 implements Runnable {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f4953;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2352 f4954;

    public /* synthetic */ RunnableC1073(AbstractC2352 abstractC2352, int i) {
        this.f4953 = i;
        this.f4954 = abstractC2352;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f4953;
        AbstractC2352 abstractC2352 = this.f4954;
        switch (i) {
            case 0:
                C2045 c2045 = abstractC2352.f11543;
                if (c2045 != null) {
                    c2045.setListSelectionHidden(true);
                    c2045.requestLayout();
                }
                break;
            default:
                C2045 c20452 = abstractC2352.f11543;
                if (c20452 != null) {
                    WeakHashMap weakHashMap = AbstractC1640.f8352;
                    if (c20452.isAttachedToWindow() && abstractC2352.f11543.getCount() > abstractC2352.f11543.getChildCount() && abstractC2352.f11543.getChildCount() <= abstractC2352.f11546) {
                        abstractC2352.f11541.setInputMethodMode(2);
                        abstractC2352.show();
                        break;
                    }
                }
                break;
        }
    }
}
