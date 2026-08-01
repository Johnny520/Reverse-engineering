package com.kongzue.dialogx.util;

import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: renamed from: com.kongzue.dialogx.util.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3764 extends ContextWrapper {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ClassLoader f11711;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f11712;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3764(Context context, int i) {
        super(context);
        this.f11712 = i;
        switch (i) {
            case 1:
                super(context);
                this.f11711 = new C3763(context.getClassLoader(), 3);
                break;
            default:
                this.f11711 = new C3763(context.getClassLoader(), 0);
                break;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final ClassLoader getClassLoader() {
        int i = this.f11712;
        ClassLoader classLoader = this.f11711;
        switch (i) {
            case 0:
                C3763 c3763 = (C3763) classLoader;
                if (c3763 == null) {
                    break;
                }
                break;
            default:
                C3763 c37632 = (C3763) classLoader;
                if (c37632 == null) {
                    break;
                }
                break;
        }
        return super.getClassLoader();
    }
}
