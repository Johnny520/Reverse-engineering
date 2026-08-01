package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class aa extends defpackage.x {
    public final /* synthetic */ int d;
    public final /* synthetic */ java.lang.Object e;

    public /* synthetic */ aa(int r1, java.lang.Object r2) {
            r0 = this;
            r0.d = r1
            r0.e = r2
            r0.<init>()
            return
    }

    @Override // defpackage.x
    public void c(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            int r0 = r1.d
            switch(r0) {
                case 0: goto L9;
                default: goto L5;
            }
        L5:
            super.c(r2, r3)
            return
        L9:
            super.c(r2, r3)
            java.lang.Object r2 = r1.e
            com.google.android.material.internal.CheckableImageButton r2 = (com.google.android.material.internal.CheckableImageButton) r2
            boolean r2 = r2.d
            r3.setChecked(r2)
            return
    }

    @Override // defpackage.x
    public final void d(android.view.View r7, defpackage.j0 r8) {
            r6 = this;
            int r0 = r6.d
            java.lang.Object r1 = r6.e
            android.view.View$AccessibilityDelegate r2 = r6.a
            switch(r0) {
                case 0: goto L88;
                case 1: goto L48;
                case 2: goto L16;
                default: goto L9;
            }
        L9:
            android.view.accessibility.AccessibilityNodeInfo r8 = r8.a
            r2.onInitializeAccessibilityNodeInfo(r7, r8)
            com.google.android.material.internal.NavigationMenuItemView r1 = (com.google.android.material.internal.NavigationMenuItemView) r1
            boolean r7 = r1.x
            r8.setCheckable(r7)
            return
        L16:
            android.view.accessibility.AccessibilityNodeInfo r8 = r8.a
            r2.onInitializeAccessibilityNodeInfo(r7, r8)
            ut r1 = (defpackage.ut) r1
            android.view.View r7 = r1.c0
            int r7 = r7.getVisibility()
            if (r7 != 0) goto L35
            android.content.Context r7 = r1.z()
            android.content.res.Resources r7 = r7.getResources()
            r0 = 2131755145(0x7f100089, float:1.914116E38)
            java.lang.String r7 = r7.getString(r0)
            goto L44
        L35:
            android.content.Context r7 = r1.z()
            android.content.res.Resources r7 = r7.getResources()
            r0 = 2131755143(0x7f100087, float:1.9141157E38)
            java.lang.String r7 = r7.getString(r0)
        L44:
            r8.setHintText(r7)
            return
        L48:
            android.view.accessibility.AccessibilityNodeInfo r0 = r8.a
            r2.onInitializeAccessibilityNodeInfo(r7, r0)
            com.google.android.material.button.MaterialButtonToggleGroup r1 = (com.google.android.material.button.MaterialButtonToggleGroup) r1
            int r0 = com.google.android.material.button.MaterialButtonToggleGroup.k
            boolean r0 = r7 instanceof com.google.android.material.button.MaterialButton
            r2 = 0
            r3 = -1
            if (r0 != 0) goto L58
            goto L7b
        L58:
            r0 = r2
            r4 = r0
        L5a:
            int r5 = r1.getChildCount()
            if (r0 >= r5) goto L7b
            android.view.View r5 = r1.getChildAt(r0)
            if (r5 != r7) goto L68
            r3 = r4
            goto L7b
        L68:
            android.view.View r5 = r1.getChildAt(r0)
            boolean r5 = r5 instanceof com.google.android.material.button.MaterialButton
            if (r5 == 0) goto L78
            boolean r5 = r1.c(r0)
            if (r5 == 0) goto L78
            int r4 = r4 + 1
        L78:
            int r0 = r0 + 1
            goto L5a
        L7b:
            com.google.android.material.button.MaterialButton r7 = (com.google.android.material.button.MaterialButton) r7
            boolean r7 = r7.o
            r0 = 1
            i0 r7 = defpackage.i0.a(r7, r2, r0, r3, r0)
            r8.f(r7)
            return
        L88:
            android.view.accessibility.AccessibilityNodeInfo r8 = r8.a
            r2.onInitializeAccessibilityNodeInfo(r7, r8)
            com.google.android.material.internal.CheckableImageButton r1 = (com.google.android.material.internal.CheckableImageButton) r1
            boolean r7 = r1.e
            r8.setCheckable(r7)
            boolean r7 = r1.d
            r8.setChecked(r7)
            return
    }
}
