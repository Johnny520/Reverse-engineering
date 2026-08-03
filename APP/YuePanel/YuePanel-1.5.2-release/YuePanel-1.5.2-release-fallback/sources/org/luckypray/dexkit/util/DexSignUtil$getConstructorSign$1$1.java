package org.luckypray.dexkit.util;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC4201(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
public final class DexSignUtil$getConstructorSign$1$1 extends Yue.AbstractC3560 implements Yue.InterfaceC2825<java.lang.Class<?>, java.lang.CharSequence> {
    public static final org.luckypray.dexkit.util.DexSignUtil$getConstructorSign$1$1 INSTANCE = null;

    static {
            org.luckypray.dexkit.util.DexSignUtil$getConstructorSign$1$1 r0 = new org.luckypray.dexkit.util.DexSignUtil$getConstructorSign$1$1
            r0.<init>()
            org.luckypray.dexkit.util.DexSignUtil$getConstructorSign$1$1.INSTANCE = r0
            return
    }

    public DexSignUtil$getConstructorSign$1$1() {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.CharSequence invoke2(java.lang.Class<?> r2) {
            r1 = this;
            java.lang.String r0 = "it"
            Yue.C3329.m13905(r2, r0)
            java.lang.String r2 = org.luckypray.dexkit.util.DexSignUtil.getTypeSign(r2)
            return r2
    }

    @Override // Yue.InterfaceC2825
    public /* bridge */ /* synthetic */ java.lang.CharSequence invoke(java.lang.Class<?> r1) {
            r0 = this;
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.CharSequence r1 = r0.invoke2(r1)
            return r1
    }
}
