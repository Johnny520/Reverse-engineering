package org.luckypray.dexkit.util;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p068.InterfaceC7387;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m151d2 = {"<anonymous>", "", "it", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "invoke"}, m152k = 3, m153mv = {1, 5, 1}, m155xi = 48)
final class DexSignUtil$getConstructorSign$1$1 extends Lambda implements InterfaceC7387 {
    public static final DexSignUtil$getConstructorSign$1$1 INSTANCE = new DexSignUtil$getConstructorSign$1$1();

    public DexSignUtil$getConstructorSign$1$1() {
        super(1);
    }

    @Override // p068.InterfaceC7387
    public final CharSequence invoke(Class<?> cls) {
        cls.getClass();
        return AbstractC6561.m11689(cls);
    }
}
