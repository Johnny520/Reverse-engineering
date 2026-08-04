package yyds;

import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: renamed from: yyds.ᛴᲁᛷᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0959 extends ContextWrapper {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C1932 f4438;

    public C0959(Context context) {
        super(context);
        this.f4438 = new C1932(context.getClassLoader());
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final ClassLoader getClassLoader() {
        return this.f4438;
    }
}
