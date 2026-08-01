package io.ktor.serialization;

import com.alibaba.fastjson2.C3775;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.InterfaceC6150;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.serialization.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4882 implements InterfaceC6150 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6150 f12675;

    public C4882(InterfaceC6150 interfaceC6150) {
        this.f12675 = interfaceC6150;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC6150
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, InterfaceC5189 interfaceC5189) {
        ContentConverterKt$deserialize$$inlined$map$1$2$1 contentConverterKt$deserialize$$inlined$map$1$2$1;
        if (interfaceC5189 instanceof ContentConverterKt$deserialize$$inlined$map$1$2$1) {
            contentConverterKt$deserialize$$inlined$map$1$2$1 = (ContentConverterKt$deserialize$$inlined$map$1$2$1) interfaceC5189;
            int i = contentConverterKt$deserialize$$inlined$map$1$2$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                contentConverterKt$deserialize$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
            } else {
                contentConverterKt$deserialize$$inlined$map$1$2$1 = new ContentConverterKt$deserialize$$inlined$map$1$2$1(this, interfaceC5189);
            }
        }
        Object obj2 = contentConverterKt$deserialize$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = contentConverterKt$deserialize$$inlined$map$1$2$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj2);
            if (obj != null) {
                C3775.m6954();
                return null;
            }
            contentConverterKt$deserialize$$inlined$map$1$2$1.L$0 = this.f12675;
            contentConverterKt$deserialize$$inlined$map$1$2$1.label = 1;
            throw null;
        }
        if (i2 == 1) {
            InterfaceC6150 interfaceC6150 = (InterfaceC6150) contentConverterKt$deserialize$$inlined$map$1$2$1.L$0;
            AbstractC6017.m10769(obj2);
            contentConverterKt$deserialize$$inlined$map$1$2$1.L$0 = null;
            contentConverterKt$deserialize$$inlined$map$1$2$1.label = 2;
            if (interfaceC6150.emit(obj2, contentConverterKt$deserialize$$inlined$map$1$2$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj2);
        }
        return C6008.f15084;
    }
}
