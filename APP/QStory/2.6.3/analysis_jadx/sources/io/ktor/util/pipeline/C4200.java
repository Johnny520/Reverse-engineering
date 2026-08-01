package io.ktor.util.pipeline;

import kotlin.Result;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.InterfaceC4360;
import p063.InterfaceC6863;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: io.ktor.util.pipeline.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4200 implements InterfaceC4357, InterfaceC6863 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C4201 f12681;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f12682 = Integer.MIN_VALUE;

    public C4200(C4201 c4201) {
        this.f12681 = c4201;
    }

    @Override // p063.InterfaceC6863
    public final InterfaceC6863 getCallerFrame() {
        InterfaceC4357 interfaceC4357 = C4203.f12690;
        int i = this.f12682;
        C4201 c4201 = this.f12681;
        if (i == Integer.MIN_VALUE) {
            this.f12682 = c4201.f12685;
        }
        int i2 = this.f12682;
        if (i2 < 0) {
            this.f12682 = Integer.MIN_VALUE;
            interfaceC4357 = null;
        } else {
            try {
                InterfaceC4357 interfaceC43572 = c4201.f12683[i2];
                if (interfaceC43572 != null) {
                    this.f12682 = i2 - 1;
                    interfaceC4357 = interfaceC43572;
                }
            } catch (Throwable unused) {
            }
        }
        if (interfaceC4357 instanceof InterfaceC6863) {
            return (InterfaceC6863) interfaceC4357;
        }
        return null;
    }

    @Override // kotlin.coroutines.InterfaceC4357
    public final InterfaceC4360 getContext() {
        C4201 c4201 = this.f12681;
        InterfaceC4357[] interfaceC4357Arr = c4201.f12683;
        int i = c4201.f12685;
        InterfaceC4357 interfaceC4357 = interfaceC4357Arr[i];
        if (interfaceC4357 != this && interfaceC4357 != null) {
            return interfaceC4357.getContext();
        }
        int i2 = i - 1;
        while (i2 >= 0) {
            int i3 = i2 - 1;
            InterfaceC4357 interfaceC43572 = interfaceC4357Arr[i2];
            if (interfaceC43572 != this && interfaceC43572 != null) {
                return interfaceC43572.getContext();
            }
            i2 = i3;
        }
        C5925.m11311("Not started");
        return null;
    }

    @Override // kotlin.coroutines.InterfaceC4357
    public final void resumeWith(Object obj) {
        boolean zM8751isFailureimpl = Result.m8751isFailureimpl(obj);
        C4201 c4201 = this.f12681;
        if (!zM8751isFailureimpl) {
            c4201.m8585(false);
            return;
        }
        Throwable thM8748exceptionOrNullimpl = Result.m8748exceptionOrNullimpl(obj);
        thM8748exceptionOrNullimpl.getClass();
        c4201.m8584(Result.m8745constructorimpl(new Result.Failure(thM8748exceptionOrNullimpl)));
    }
}
