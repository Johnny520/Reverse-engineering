package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public final class a implements android.view.View.OnClickListener {
    public final /* synthetic */ androidx.appcompat.widget.SearchView a;

    public a(androidx.appcompat.widget.SearchView r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r4) {
            r3 = this;
            androidx.appcompat.widget.SearchView r0 = r3.a
            androidx.appcompat.widget.SearchView$SearchAutoComplete r1 = r0.p
            android.widget.ImageView r2 = r0.t
            if (r4 != r2) goto L1b
            r4 = 0
            r0.w(r4)
            r1.requestFocus()
            r4 = 1
            r1.setImeVisibility(r4)
            android.view.View$OnClickListener r4 = r0.L
            if (r4 == 0) goto L7b
            r4.onClick(r0)
            return
        L1b:
            android.widget.ImageView r2 = r0.v
            if (r4 != r2) goto L23
            r0.m()
            return
        L23:
            android.widget.ImageView r2 = r0.u
            if (r4 != r2) goto L2b
            r0.q()
            return
        L2b:
            android.widget.ImageView r2 = r0.w
            if (r4 != r2) goto L76
            android.app.SearchableInfo r4 = r0.b0
            if (r4 != 0) goto L34
            goto L7b
        L34:
            boolean r1 = r4.getVoiceSearchLaunchWebSearch()     // Catch: android.content.ActivityNotFoundException -> L6e
            if (r1 == 0) goto L5a
            android.content.Intent r1 = r0.H     // Catch: android.content.ActivityNotFoundException -> L6e
            android.content.Intent r2 = new android.content.Intent     // Catch: android.content.ActivityNotFoundException -> L6e
            r2.<init>(r1)     // Catch: android.content.ActivityNotFoundException -> L6e
            android.content.ComponentName r4 = r4.getSearchActivity()     // Catch: android.content.ActivityNotFoundException -> L6e
            java.lang.String r1 = "calling_package"
            if (r4 != 0) goto L4b
            r4 = 0
            goto L4f
        L4b:
            java.lang.String r4 = r4.flattenToShortString()     // Catch: android.content.ActivityNotFoundException -> L6e
        L4f:
            r2.putExtra(r1, r4)     // Catch: android.content.ActivityNotFoundException -> L6e
            android.content.Context r4 = r0.getContext()     // Catch: android.content.ActivityNotFoundException -> L6e
            r4.startActivity(r2)     // Catch: android.content.ActivityNotFoundException -> L6e
            return
        L5a:
            boolean r1 = r4.getVoiceSearchLaunchRecognizer()     // Catch: android.content.ActivityNotFoundException -> L6e
            if (r1 == 0) goto L7b
            android.content.Intent r1 = r0.I     // Catch: android.content.ActivityNotFoundException -> L6e
            android.content.Intent r4 = r0.k(r1, r4)     // Catch: android.content.ActivityNotFoundException -> L6e
            android.content.Context r0 = r0.getContext()     // Catch: android.content.ActivityNotFoundException -> L6e
            r0.startActivity(r4)     // Catch: android.content.ActivityNotFoundException -> L6e
            return
        L6e:
            java.lang.String r4 = "SearchView"
            java.lang.String r0 = "Could not find voice search activity"
            android.util.Log.w(r4, r0)
            return
        L76:
            if (r4 != r1) goto L7b
            r0.l()
        L7b:
            return
    }
}
