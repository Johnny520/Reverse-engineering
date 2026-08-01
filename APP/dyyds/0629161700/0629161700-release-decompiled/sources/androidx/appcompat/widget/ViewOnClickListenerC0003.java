package androidx.appcompat.widget;

/* JADX INFO: renamed from: androidx.appcompat.widget.ᛷᲁᛳᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0003 implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ androidx.appcompat.widget.SearchView f218;

    public ViewOnClickListenerC0003(androidx.appcompat.widget.SearchView r1) {
            r0 = this;
            r0.<init>()
            r0.f218 = r1
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r3) {
            r2 = this;
            androidx.appcompat.widget.SearchView r2 = r2.f218
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.f161
            android.widget.ImageView r1 = r2.f149
            if (r3 != r1) goto L1b
            r3 = 0
            r2.m49(r3)
            r0.requestFocus()
            r3 = 1
            r0.setImeVisibility(r3)
            android.view.View$OnClickListener r3 = r2.f163
            if (r3 == 0) goto L7b
            r3.onClick(r2)
            return
        L1b:
            android.widget.ImageView r1 = r2.f158
            if (r3 != r1) goto L23
            r2.m46()
            return
        L23:
            android.widget.ImageView r1 = r2.f154
            if (r3 != r1) goto L2b
            r2.m51()
            return
        L2b:
            android.widget.ImageView r1 = r2.f164
            if (r3 != r1) goto L76
            android.app.SearchableInfo r3 = r2.f159
            if (r3 != 0) goto L34
            goto L7b
        L34:
            boolean r0 = r3.getVoiceSearchLaunchWebSearch()     // Catch: android.content.ActivityNotFoundException -> L6e
            if (r0 == 0) goto L5a
            android.content.Intent r0 = r2.f147     // Catch: android.content.ActivityNotFoundException -> L6e
            android.content.Intent r1 = new android.content.Intent     // Catch: android.content.ActivityNotFoundException -> L6e
            r1.<init>(r0)     // Catch: android.content.ActivityNotFoundException -> L6e
            android.content.ComponentName r3 = r3.getSearchActivity()     // Catch: android.content.ActivityNotFoundException -> L6e
            java.lang.String r0 = "calling_package"
            if (r3 != 0) goto L4b
            r3 = 0
            goto L4f
        L4b:
            java.lang.String r3 = r3.flattenToShortString()     // Catch: android.content.ActivityNotFoundException -> L6e
        L4f:
            r1.putExtra(r0, r3)     // Catch: android.content.ActivityNotFoundException -> L6e
            android.content.Context r2 = r2.getContext()     // Catch: android.content.ActivityNotFoundException -> L6e
            r2.startActivity(r1)     // Catch: android.content.ActivityNotFoundException -> L6e
            return
        L5a:
            boolean r0 = r3.getVoiceSearchLaunchRecognizer()     // Catch: android.content.ActivityNotFoundException -> L6e
            if (r0 == 0) goto L7b
            android.content.Intent r0 = r2.f146     // Catch: android.content.ActivityNotFoundException -> L6e
            android.content.Intent r3 = r2.m54(r0, r3)     // Catch: android.content.ActivityNotFoundException -> L6e
            android.content.Context r2 = r2.getContext()     // Catch: android.content.ActivityNotFoundException -> L6e
            r2.startActivity(r3)     // Catch: android.content.ActivityNotFoundException -> L6e
            return
        L6e:
            java.lang.String r2 = "SearchView"
            java.lang.String r3 = "Could not find voice search activity"
            android.util.Log.w(r2, r3)
            return
        L76:
            if (r3 != r0) goto L7b
            androidx.appcompat.widget.AbstractC0002.m80(r0)
        L7b:
            return
    }
}
