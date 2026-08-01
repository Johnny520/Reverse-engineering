package io.ktor.client.engine.cio;

import io.ktor.http.cio.AbstractC4805;
import io.ktor.http.cio.C4795;
import io.ktor.http.cio.C4799;
import io.ktor.http.cio.C4806;
import io.ktor.http.cio.internals.C4786;
import io.ktor.utils.p007io.AbstractC5076;
import io.ktor.utils.p007io.C5081;
import io.ktor.utils.p007io.InterfaceC5079;
import io.ktor.utils.p007io.InterfaceC5084;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import kotlin.AbstractC6017;
import kotlin.AbstractC6019;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;
import p252.AbstractC8944;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.engine.cio.UtilsKt", m556f = "utils.kt", m557l = {238, 239, 241, 248}, m558m = "startTunnel")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class UtilsKt$startTunnel$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public UtilsKt$startTunnel$1(InterfaceC5189<? super UtilsKt$startTunnel$1> interfaceC5189) {
        super(interfaceC5189);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d1 A[Catch: all -> 0x004e, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x004e, blocks: (B:51:0x00d1, B:21:0x004a, B:36:0x008b, B:67:0x00f5, B:68:0x00fc, B:26:0x0059, B:33:0x007e, B:29:0x0069, B:70:0x0105), top: B:81:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f5 A[Catch: all -> 0x004e, TRY_ENTER, TryCatch #5 {all -> 0x004e, blocks: (B:51:0x00d1, B:21:0x004a, B:36:0x008b, B:67:0x00f5, B:68:0x00fc, B:26:0x0059, B:33:0x007e, B:29:0x0069, B:70:0x0105), top: B:81:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x008f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C4799 c4799;
        InterfaceC5084 interfaceC5084;
        C4795 c4795;
        Closeable closeable;
        Throwable th;
        C4799 c47992;
        Closeable closeable2;
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new UtilsKt$startTunnel$1(this);
        }
        Object objM8926 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        Object obj2 = this.label;
        try {
            if (obj2 == 0) {
                AbstractC6017.m10769(objM8926);
                new C4799();
                throw null;
            }
            if (obj2 == 1) {
                c4799 = (C4799) this.L$2;
                InterfaceC5084 interfaceC50842 = (InterfaceC5084) this.L$1;
                InterfaceC5079 interfaceC5079 = (InterfaceC5079) this.L$0;
                AbstractC6017.m10769(objM8926);
                this.L$0 = interfaceC50842;
                this.L$1 = c4799;
                this.L$2 = null;
                this.label = 2;
                if (((C5081) interfaceC5079).m9259(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                interfaceC5084 = interfaceC50842;
            } else if (obj2 == 2) {
                c4799 = (C4799) this.L$1;
                interfaceC5084 = (InterfaceC5084) this.L$0;
                AbstractC6017.m10769(objM8926);
            } else {
                if (obj2 == 3) {
                    c4799 = (C4799) this.L$1;
                    interfaceC5084 = (InterfaceC5084) this.L$0;
                    AbstractC6017.m10769(objM8926);
                    c4795 = (C4795) objM8926;
                    if (c4795 != null) {
                        throw new EOFException("Failed to parse CONNECT response: unexpected EOF");
                    }
                    try {
                        if (c4795.f12541 / 200 != 1) {
                            throw new IOException("Can not establish tunnel connection");
                        }
                        C4806 c4806 = c4795.f12562;
                        String[] strArr = AbstractC8944.f22758;
                        C4786 c4786M8939 = c4806.m8939("Content-Length");
                        closeable2 = c4795;
                        if (c4786M8939 != null) {
                            long j = Long.parseLong(c4786M8939.toString());
                            this.L$0 = c4799;
                            this.L$1 = c4795;
                            this.I$0 = 0;
                            this.label = 4;
                            Object objM9240 = AbstractC5076.m9240(interfaceC5084, j, this);
                            if (objM9240 != coroutineSingletons) {
                                closeable = c4795;
                                objM8926 = objM9240;
                                c47992 = c4799;
                                new Long(((Number) objM8926).longValue());
                                c4799 = c47992;
                                closeable2 = closeable;
                            }
                            return coroutineSingletons;
                        }
                        if (closeable2 != null) {
                        }
                        c4799.getClass();
                        return C6008.f15084;
                    } catch (Throwable th2) {
                        closeable = c4795;
                        th = th2;
                        c47992 = c4799;
                        if (closeable != null) {
                        }
                        throw th;
                    }
                }
                if (obj2 != 4) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                closeable = (Closeable) this.L$1;
                c47992 = (C4799) this.L$0;
                try {
                    AbstractC6017.m10769(objM8926);
                    closeable = closeable;
                    new Long(((Number) objM8926).longValue());
                    c4799 = c47992;
                    closeable2 = closeable;
                    if (closeable2 != null) {
                        closeable2.close();
                    }
                    c4799.getClass();
                    return C6008.f15084;
                } catch (Throwable th3) {
                    th = th3;
                    if (closeable != null) {
                        try {
                            try {
                                closeable.close();
                            } catch (Throwable th4) {
                                AbstractC6019.m10775(th, th4);
                            }
                        } catch (Throwable th5) {
                            try {
                                throw th5;
                            } catch (Throwable th6) {
                                obj2 = c47992;
                                th = th6;
                                obj2.getClass();
                                throw th;
                            }
                        }
                    }
                    throw th;
                }
            }
            this.L$0 = interfaceC5084;
            this.L$1 = c4799;
            this.label = 3;
            objM8926 = AbstractC4805.m8926(interfaceC5084, this);
            if (objM8926 != coroutineSingletons) {
                c4795 = (C4795) objM8926;
                if (c4795 != null) {
                }
            }
            return coroutineSingletons;
        } catch (Throwable th7) {
            th = th7;
        }
    }
}
