package io.ktor.util.pipeline;

import kotlin.Result;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import p079.InterfaceC7692;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.util.pipeline.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5032 implements InterfaceC5189, InterfaceC7692 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C5033 f13026;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f13027 = Integer.MIN_VALUE;

    public C5032(C5033 c5033) {
        this.f13026 = c5033;
    }

    @Override // p079.InterfaceC7692
    public final InterfaceC7692 getCallerFrame() {
        InterfaceC5189 interfaceC5189 = C5035.f13035;
        int i = this.f13027;
        C5033 c5033 = this.f13026;
        if (i == Integer.MIN_VALUE) {
            this.f13027 = c5033.f13030;
        }
        int i2 = this.f13027;
        if (i2 < 0) {
            this.f13027 = Integer.MIN_VALUE;
            interfaceC5189 = null;
        } else {
            try {
                InterfaceC5189 interfaceC51892 = c5033.f13028[i2];
                if (interfaceC51892 != null) {
                    this.f13027 = i2 - 1;
                    interfaceC5189 = interfaceC51892;
                }
            } catch (Throwable unused) {
            }
        }
        if (interfaceC5189 instanceof InterfaceC7692) {
            return (InterfaceC7692) interfaceC5189;
        }
        return null;
    }

    @Override // kotlin.coroutines.InterfaceC5189
    public final InterfaceC5192 getContext() {
        C5033 c5033 = this.f13026;
        InterfaceC5189[] interfaceC5189Arr = c5033.f13028;
        int i = c5033.f13030;
        InterfaceC5189 interfaceC5189 = interfaceC5189Arr[i];
        if (interfaceC5189 != this && interfaceC5189 != null) {
            return interfaceC5189.getContext();
        }
        int i2 = i - 1;
        while (i2 >= 0) {
            int i3 = i2 - 1;
            InterfaceC5189 interfaceC51892 = interfaceC5189Arr[i2];
            if (interfaceC51892 != this && interfaceC51892 != null) {
                return interfaceC51892.getContext();
            }
            i2 = i3;
        }
        C6755.m11870("Not started");
        return null;
    }

    @Override // kotlin.coroutines.InterfaceC5189
    public final void resumeWith(Object obj) {
        boolean zM9310isFailureimpl = Result.m9310isFailureimpl(obj);
        C5033 c5033 = this.f13026;
        if (!zM9310isFailureimpl) {
            c5033.m9144(false);
            return;
        }
        Throwable thM9307exceptionOrNullimpl = Result.m9307exceptionOrNullimpl(obj);
        thM9307exceptionOrNullimpl.getClass();
        c5033.m9143(Result.m9304constructorimpl(new Result.Failure(thM9307exceptionOrNullimpl)));
    }
}
