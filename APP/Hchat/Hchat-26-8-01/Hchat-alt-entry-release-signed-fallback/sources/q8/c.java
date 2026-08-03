package q8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements android.view.View.OnLongClickListener {
    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            goto La
        L4:
            android.content.Context r4 = r4.getContext()     // Catch: java.lang.Throwable -> L11
            if (r4 != 0) goto Lb
        La:
            return r0
        Lb:
            r1 = 0
            a7.a.S(r4, r1, r0)     // Catch: java.lang.Throwable -> L11
            r4 = 1
            return r4
        L11:
            r4 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:SettingsInjector] [PlusLongPress] 长按打开失败: "
            r1.<init>(r2)
            bc.e.s(r4, r1, r4)
            return r0
    }
}
