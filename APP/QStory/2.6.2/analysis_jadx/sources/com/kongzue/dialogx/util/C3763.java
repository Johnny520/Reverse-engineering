package com.kongzue.dialogx.util;

import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: renamed from: com.kongzue.dialogx.util.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3763 extends ContextWrapper {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ClassLoader f11706;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f11707;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3763(Context context, int i) {
        super(context);
        this.f11707 = i;
        switch (i) {
            case 1:
                super(context);
                this.f11706 = new C3762(context.getClassLoader(), 3);
                break;
            default:
                this.f11706 = new C3762(context.getClassLoader(), 0);
                break;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final ClassLoader getClassLoader() {
        int i = this.f11707;
        ClassLoader classLoader = this.f11706;
        switch (i) {
            case 0:
                C3762 c3762 = (C3762) classLoader;
                if (c3762 == null) {
                    break;
                }
                break;
            default:
                C3762 c37622 = (C3762) classLoader;
                if (c37622 == null) {
                    break;
                }
                break;
        }
        return super.getClassLoader();
    }
}
