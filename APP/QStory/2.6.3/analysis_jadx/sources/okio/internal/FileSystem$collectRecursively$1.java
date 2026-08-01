package okio.internal;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: renamed from: okio.internal.-FileSystem$collectRecursively$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "okio.internal.-FileSystem", f = "FileSystem.kt", l = {116, 135, 145}, m = "collectRecursively", v = 1)
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final class FileSystem$collectRecursively$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    boolean Z$0;
    boolean Z$1;
    int label;
    /* synthetic */ Object result;

    public FileSystem$collectRecursively$1(InterfaceC4357<? super FileSystem$collectRecursively$1> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC5571.m10937(null, null, false, false, this);
    }
}
