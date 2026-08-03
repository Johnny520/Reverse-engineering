package r9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements android.text.TextWatcher {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gg.s f11644g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f11645h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f11646i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f11647j;

    public c0(gg.s r1, android.widget.TextView r2, android.widget.EditText r3, android.widget.EditText r4) {
            r0 = this;
            r0.<init>()
            r0.f11644g = r1
            r0.f11645h = r2
            r0.f11646i = r3
            r0.f11647j = r4
            return
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable r1) {
            r0 = this;
            return
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            return
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            gg.s r1 = r0.f11644g
            r2 = -1
            r1.f4562g = r2
            android.widget.EditText r1 = r0.f11646i
            android.widget.EditText r2 = r0.f11647j
            java.util.List r1 = r9.d0.I0(r1, r2)
            int r1 = r1.size()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "搜索结果: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            android.widget.TextView r2 = r0.f11645h
            r2.setText(r1)
            return
    }
}
