package org.luckypray.dexkit.util;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6557;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class DexSignUtil$getConstructorSign$1$1 extends Lambda implements InterfaceC6557 {
    public static final DexSignUtil$getConstructorSign$1$1 INSTANCE = new DexSignUtil$getConstructorSign$1$1();

    public DexSignUtil$getConstructorSign$1$1() {
        super(1);
    }

    @Override // p052.InterfaceC6557
    public final CharSequence invoke(Class<?> cls) {
        cls.getClass();
        return AbstractC5730.m11073(cls);
    }
}
