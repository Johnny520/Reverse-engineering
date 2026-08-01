package androidx.appcompat.widget;

/* JADX INFO: renamed from: androidx.appcompat.widget.ᲇᛶᛵᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC0004 implements android.view.View.OnKeyListener {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ androidx.appcompat.widget.SearchView f219;

    public ViewOnKeyListenerC0004(androidx.appcompat.widget.SearchView r1) {
            r0 = this;
            r0.<init>()
            r0.f219 = r1
            return
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(android.view.View r7, int r8, android.view.KeyEvent r9) {
            r6 = this;
            androidx.appcompat.widget.SearchView r6 = r6.f219
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r6.f161
            android.app.SearchableInfo r1 = r6.f159
            r2 = 0
            if (r1 != 0) goto Lb
            goto La8
        Lb:
            boolean r1 = r0.isPopupShowing()
            r3 = 66
            r4 = 1
            if (r1 == 0) goto L75
            int r1 = r0.getListSelection()
            r5 = -1
            if (r1 == r5) goto L75
            android.app.SearchableInfo r7 = r6.f159
            if (r7 != 0) goto L21
            goto La8
        L21:
            ᛱᛷᲇᛳ r7 = r6.f126
            if (r7 != 0) goto L27
            goto La8
        L27:
            int r7 = r9.getAction()
            if (r7 != 0) goto La8
            boolean r7 = r9.hasNoModifiers()
            if (r7 == 0) goto La8
            if (r8 == r3) goto L6d
            r7 = 84
            if (r8 == r7) goto L6d
            r7 = 61
            if (r8 != r7) goto L3e
            goto L6d
        L3e:
            r6 = 21
            if (r8 == r6) goto L4f
            r7 = 22
            if (r8 != r7) goto L47
            goto L4f
        L47:
            r6 = 19
            if (r8 != r6) goto La8
            r0.getListSelection()
            return r2
        L4f:
            if (r8 != r6) goto L53
            r6 = r2
            goto L57
        L53:
            int r6 = r0.length()
        L57:
            r0.setSelection(r6)
            r0.setListSelection(r2)
            r0.clearListSelection()
            androidx.appcompat.widget.AbstractC0002.m81(r0, r4)
            boolean r6 = r0.enoughToFilter()
            if (r6 == 0) goto L6c
            r0.showDropDown()
        L6c:
            return r4
        L6d:
            int r7 = r0.getListSelection()
            r6.m47(r7)
            return r4
        L75:
            android.text.Editable r1 = r0.getText()
            int r1 = android.text.TextUtils.getTrimmedLength(r1)
            if (r1 != 0) goto L80
            goto La8
        L80:
            boolean r1 = r9.hasNoModifiers()
            if (r1 == 0) goto La8
            int r9 = r9.getAction()
            if (r9 != r4) goto La8
            if (r8 != r3) goto La8
            r7.cancelLongPress()
            android.text.Editable r7 = r0.getText()
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "android.intent.action.SEARCH"
            r9 = 0
            android.content.Intent r7 = r6.m48(r8, r9, r9, r7)
            android.content.Context r6 = r6.getContext()
            r6.startActivity(r7)
            return r4
        La8:
            return r2
    }
}
