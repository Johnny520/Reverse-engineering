package io.ktor.network.sockets;

import androidx.activity.AbstractC0900;
import com.alibaba.fastjson2.C3775;
import com.materialkolor.dynamiccolor.C4639;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.AbstractC6227;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.channels.InterfaceC6032;
import kotlinx.coroutines.sync.C6212;
import kotlinx.coroutines.sync.InterfaceC6215;
import p068.InterfaceC7387;
import p111.C8036;
import p111.ExecutorC8037;
import p307.AbstractC9322;
import sun.misc.Unsafe;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.network.sockets.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4863 implements InterfaceC6032 {
    private volatile /* synthetic */ int closed;
    private volatile /* synthetic */ Object closedCause;
    private volatile /* synthetic */ Object onCloseHandler;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12644 = AtomicReferenceFieldUpdater.newUpdater(C4863.class, Object.class, "onCloseHandler");

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final /* synthetic */ long f12643 = AbstractC9322.f23936.objectFieldOffset(C4863.class.getDeclaredField("onCloseHandler"));

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12642 = AtomicIntegerFieldUpdater.newUpdater(C4863.class, "closed");

    @Override // kotlinx.coroutines.channels.InterfaceC6032
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final void mo8991(InterfaceC7387 interfaceC7387) {
        String str;
        Unsafe unsafe;
        long j;
        C4639 c4639 = AbstractC4842.f12618;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12644;
        while (true) {
            atomicReferenceFieldUpdater.getClass();
            Unsafe unsafe2 = AbstractC9322.f23936;
            long j2 = f12643;
            C4863 c4863 = this;
            InterfaceC7387 interfaceC73872 = interfaceC7387;
            if (unsafe2.compareAndSwapObject(c4863, j2, (Object) null, interfaceC73872)) {
                return;
            }
            if (unsafe2.getObjectVolatile(c4863, j2) != null) {
                Object obj = c4863.onCloseHandler;
                C4639 c46392 = AbstractC4842.f12619;
                if (obj != c46392) {
                    InterfaceC7387 interfaceC73873 = (InterfaceC7387) c4863.onCloseHandler;
                    if (interfaceC73873 == c4639) {
                        str = "Another handler was already registered and successfully invoked";
                    } else {
                        str = "Another handler was already registered: " + interfaceC73873;
                    }
                    C6755.m11870(str);
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f12644;
                do {
                    atomicReferenceFieldUpdater2.getClass();
                    unsafe = AbstractC9322.f23936;
                    j = f12643;
                    if (unsafe.compareAndSwapObject(c4863, j, c46392, c4639)) {
                        interfaceC73872.invoke(c4863.closedCause);
                        return;
                    }
                } while (unsafe.getObjectVolatile(c4863, j) == c46392);
                C6755.m11869("Failed requirement.");
                return;
            }
            this = c4863;
            interfaceC7387 = interfaceC73872;
        }
    }

    @Override // kotlinx.coroutines.channels.InterfaceC6032
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object mo8992(Object obj, InterfaceC5189 interfaceC5189) {
        if (obj == null) {
            return m8993(interfaceC5189);
        }
        C3775.m6954();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m8993(InterfaceC5189 interfaceC5189) throws Throwable {
        DatagramSendChannel$send$1 datagramSendChannel$send$1;
        Throwable th;
        InterfaceC6215 interfaceC6215;
        if (interfaceC5189 instanceof DatagramSendChannel$send$1) {
            datagramSendChannel$send$1 = (DatagramSendChannel$send$1) interfaceC5189;
            int i = datagramSendChannel$send$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                datagramSendChannel$send$1.label = i - Integer.MIN_VALUE;
            } else {
                datagramSendChannel$send$1 = new DatagramSendChannel$send$1(this, interfaceC5189);
            }
        }
        Object obj = datagramSendChannel$send$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = datagramSendChannel$send$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            datagramSendChannel$send$1.L$0 = this;
            datagramSendChannel$send$1.L$1 = null;
            datagramSendChannel$send$1.L$2 = null;
            datagramSendChannel$send$1.label = 1;
            throw null;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            interfaceC6215 = (InterfaceC6215) datagramSendChannel$send$1.L$0;
            try {
                AbstractC6017.m10769(obj);
                ((C6212) interfaceC6215).m10991(null);
                return C6008.f15084;
            } catch (Throwable th2) {
                th = th2;
                ((C6212) interfaceC6215).m10991(null);
                throw th;
            }
        }
        InterfaceC6215 interfaceC62152 = (InterfaceC6215) datagramSendChannel$send$1.L$2;
        if (datagramSendChannel$send$1.L$1 != null) {
            C3775.m6954();
            return null;
        }
        C4863 c4863 = (C4863) datagramSendChannel$send$1.L$0;
        AbstractC6017.m10769(obj);
        try {
            C8036 c8036 = AbstractC6227.f15375;
            ExecutorC8037 executorC8037 = ExecutorC8037.f19570;
            try {
                DatagramSendChannel$send$2$1 datagramSendChannel$send$2$1 = new DatagramSendChannel$send$2$1(null, c4863, null);
                datagramSendChannel$send$1.L$0 = interfaceC62152;
                datagramSendChannel$send$1.L$1 = null;
                datagramSendChannel$send$1.L$2 = null;
                datagramSendChannel$send$1.label = 2;
                if (AbstractC6231.m11029(executorC8037, datagramSendChannel$send$2$1, datagramSendChannel$send$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                interfaceC6215 = interfaceC62152;
                ((C6212) interfaceC6215).m10991(null);
                return C6008.f15084;
            } catch (Throwable th3) {
                th = th3;
                interfaceC6215 = interfaceC62152;
                ((C6212) interfaceC6215).m10991(null);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // kotlinx.coroutines.channels.InterfaceC6032
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean mo8994(Throwable th) {
        if (!f12642.compareAndSet(this, 0, 1)) {
            return false;
        }
        this.closedCause = null;
        throw null;
    }

    @Override // kotlinx.coroutines.channels.InterfaceC6032
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final Object mo8995(Object obj) {
        AbstractC0900.m697(C6008.f15084);
        throw null;
    }
}
