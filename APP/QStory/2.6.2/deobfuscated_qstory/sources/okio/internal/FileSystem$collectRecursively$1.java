package okio.internal;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: renamed from: okio.internal.-FileSystem$collectRecursively$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "okio.internal.-FileSystem", f = "FileSystem.kt", l = {116, 135, 145}, m = "collectRecursively", v = 1)
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

    public FileSystem$collectRecursively$1(InterfaceC4356<? super FileSystem$collectRecursively$1> interfaceC4356) {
        super(interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC5570.m10880(null, null, false, false, this);
    }
}
