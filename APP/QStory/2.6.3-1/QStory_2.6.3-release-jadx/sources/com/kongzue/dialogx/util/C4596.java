package com.kongzue.dialogx.util;

import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: renamed from: com.kongzue.dialogx.util.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4596 extends ContextWrapper {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ClassLoader f12056;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f12057;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4596(Context context, int i) {
        super(context);
        this.f12057 = i;
        switch (i) {
            case 1:
                super(context);
                this.f12056 = new C4595(context.getClassLoader(), 3);
                break;
            default:
                this.f12056 = new C4595(context.getClassLoader(), 0);
                break;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final ClassLoader getClassLoader() {
        int i = this.f12057;
        ClassLoader classLoader = this.f12056;
        switch (i) {
            case 0:
                C4595 c4595 = (C4595) classLoader;
                if (c4595 == null) {
                    break;
                }
                break;
            default:
                C4595 c45952 = (C4595) classLoader;
                if (c45952 == null) {
                    break;
                }
                break;
        }
        return super.getClassLoader();
    }
}
