package io.ktor.utils.p007io;

import java.io.EOFException;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.p010io.AbstractC6310;
import p074.AbstractC7684;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.utils.io.ByteReadChannelOperationsKt", m556f = "ByteReadChannelOperations.kt", m557l = {468}, m558m = "readFully")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class ByteReadChannelOperationsKt$readFully$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public ByteReadChannelOperationsKt$readFully$1(InterfaceC5189<? super ByteReadChannelOperationsKt$readFully$1> interfaceC5189) {
        super(interfaceC5189);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x005a -> B:24:0x006f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x006d -> B:23:0x006e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws EOFException {
        int i;
        byte[] bArr;
        int i2;
        InterfaceC5084 interfaceC5084;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        if (this instanceof ByteReadChannelOperationsKt$readFully$1) {
            int i3 = this.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                this.label = i3 - Integer.MIN_VALUE;
            } else {
                this = new ByteReadChannelOperationsKt$readFully$1(this);
            }
        }
        Object obj2 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = this.label;
        InterfaceC5084 interfaceC50842 = null;
        if (i4 == 0) {
            AbstractC6017.m10769(obj2);
            if (interfaceC50842.mo9200()) {
                throw new EOFException("Channel is already closed");
            }
            i = 0;
            bArr = null;
            i2 = 0;
            interfaceC5084 = null;
            if (i >= i2) {
            }
        } else {
            if (i4 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$1;
            i2 = this.I$0;
            bArr = (byte[]) this.L$1;
            InterfaceC5084 interfaceC50843 = (InterfaceC5084) this.L$0;
            AbstractC6017.m10769(obj2);
            interfaceC5084 = interfaceC50843;
            if (interfaceC5084.mo9200()) {
                int iMin = Math.min(i2 - i, (int) AbstractC7684.m12638(interfaceC5084.mo9202())) + i;
                AbstractC6310.m11182(interfaceC5084.mo9202(), bArr, i, iMin);
                i = iMin;
                if (i >= i2) {
                    return C6008.f15084;
                }
                if (interfaceC5084.mo9202().mo11163()) {
                    this.L$0 = interfaceC5084;
                    this.L$1 = bArr;
                    this.I$0 = i2;
                    this.I$1 = i;
                    this.label = 1;
                    if (interfaceC5084.mo9201(1, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    interfaceC50843 = interfaceC5084;
                    interfaceC5084 = interfaceC50843;
                }
                if (interfaceC5084.mo9200()) {
                    throw new EOFException("Channel is already closed");
                }
            }
        }
    }
}
