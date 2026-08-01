package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public final class b implements android.view.View.OnKeyListener {
    public final /* synthetic */ androidx.appcompat.widget.SearchView a;

    public b(androidx.appcompat.widget.SearchView r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(android.view.View r8, int r9, android.view.KeyEvent r10) {
            r7 = this;
            androidx.appcompat.widget.SearchView r0 = r7.a
            androidx.appcompat.widget.SearchView$SearchAutoComplete r1 = r0.p
            android.app.SearchableInfo r2 = r0.b0
            r3 = 0
            if (r2 != 0) goto Lb
            goto L9f
        Lb:
            boolean r2 = r1.isPopupShowing()
            r4 = 66
            r5 = 1
            if (r2 == 0) goto L6c
            int r2 = r1.getListSelection()
            r6 = -1
            if (r2 == r6) goto L6c
            android.app.SearchableInfo r8 = r0.b0
            if (r8 != 0) goto L21
            goto L9f
        L21:
            we r8 = r0.O
            if (r8 != 0) goto L27
            goto L9f
        L27:
            int r8 = r10.getAction()
            if (r8 != 0) goto L9f
            boolean r8 = r10.hasNoModifiers()
            if (r8 == 0) goto L9f
            if (r9 == r4) goto L64
            r8 = 84
            if (r9 == r8) goto L64
            r8 = 61
            if (r9 != r8) goto L3e
            goto L64
        L3e:
            r8 = 21
            if (r9 == r8) goto L4f
            r10 = 22
            if (r9 != r10) goto L47
            goto L4f
        L47:
            r8 = 19
            if (r9 != r8) goto L9f
            r1.getListSelection()
            return r3
        L4f:
            if (r9 != r8) goto L53
            r8 = r3
            goto L57
        L53:
            int r8 = r1.length()
        L57:
            r1.setSelection(r8)
            r1.setListSelection(r3)
            r1.clearListSelection()
            r1.a()
            return r5
        L64:
            int r8 = r1.getListSelection()
            r0.n(r8)
            return r5
        L6c:
            android.text.Editable r2 = r1.getText()
            int r2 = android.text.TextUtils.getTrimmedLength(r2)
            if (r2 != 0) goto L77
            goto L9f
        L77:
            boolean r2 = r10.hasNoModifiers()
            if (r2 == 0) goto L9f
            int r10 = r10.getAction()
            if (r10 != r5) goto L9f
            if (r9 != r4) goto L9f
            r8.cancelLongPress()
            android.text.Editable r8 = r1.getText()
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "android.intent.action.SEARCH"
            r10 = 0
            android.content.Intent r8 = r0.j(r9, r10, r10, r8)
            android.content.Context r9 = r0.getContext()
            r9.startActivity(r8)
            return r5
        L9f:
            return r3
    }
}
