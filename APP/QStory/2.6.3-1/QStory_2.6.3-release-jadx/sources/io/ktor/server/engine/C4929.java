package io.ktor.server.engine;

import com.materialkolor.dynamiccolor.C4639;
import io.ktor.server.application.AbstractC4892;
import io.ktor.server.application.C4890;
import io.ktor.server.application.InterfaceC4887;
import io.ktor.server.application.InterfaceC4889;
import io.ktor.util.C5041;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5925;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6270;
import kotlinx.coroutines.C6292;
import kotlinx.coroutines.InterfaceC6273;
import p075.C7686;
import p252.C8926;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.server.engine.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4929 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4639 f12786;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f12787;

    static {
        InterfaceC5919 interfaceC5919M9471;
        ShutDownUrl$Companion$ApplicationCallPlugin$1.INSTANCE.getClass();
        InterfaceC5925 interfaceC5925Mo9476 = AbstractC5228.f13320.mo9476(AbstractC4892.class);
        try {
            interfaceC5919M9471 = AbstractC5228.m9471(AbstractC4892.class);
        } catch (Throwable unused) {
            interfaceC5919M9471 = null;
        }
        new C5041("shutdown.url", new C7686(interfaceC5925Mo9476, interfaceC5919M9471));
    }

    public C4929(String str, C4639 c4639) {
        this.f12787 = str;
        this.f12786 = c4639;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m9058(InterfaceC4889 interfaceC4889, ContinuationImpl continuationImpl) throws Throwable {
        ShutDownUrl$doShutdown$1 shutDownUrl$doShutdown$1;
        Throwable th;
        InterfaceC5192 interfaceC5192;
        Object obj;
        InterfaceC5919 interfaceC5919M9471;
        if (continuationImpl instanceof ShutDownUrl$doShutdown$1) {
            shutDownUrl$doShutdown$1 = (ShutDownUrl$doShutdown$1) continuationImpl;
            int i = shutDownUrl$doShutdown$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                shutDownUrl$doShutdown$1.label = i - Integer.MIN_VALUE;
            } else {
                shutDownUrl$doShutdown$1 = new ShutDownUrl$doShutdown$1(this, continuationImpl);
            }
        }
        Object obj2 = shutDownUrl$doShutdown$1.result;
        Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = shutDownUrl$doShutdown$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            interfaceC5192 = (InterfaceC6273) shutDownUrl$doShutdown$1.L$0;
            try {
                AbstractC6017.m10769(obj2);
                ((C6292) interfaceC5192).mo10815(null);
                return C6008.f15084;
            } catch (Throwable th2) {
                th = th2;
                ((C6292) interfaceC5192).mo10815(null);
                throw th;
            }
        }
        AbstractC6017.m10769(obj2);
        C4890 c4890Mo9019 = interfaceC4889.mo9019();
        c4890Mo9019.getClass();
        ((C4924) c4890Mo9019.f12686).f12782.warn("Shutdown URL was called: server is going down");
        C4890 c4890Mo90192 = interfaceC4889.mo9019();
        InterfaceC4887 interfaceC4887 = c4890Mo90192.f12686;
        this.f12786.invoke(interfaceC4889);
        Integer num = 0;
        int iIntValue = num.intValue();
        C6270 c6270M11049 = AbstractC6231.m11049();
        AbstractC6231.m11036(interfaceC4889.mo9019(), null, null, new ShutDownUrl$doShutdown$2(c6270M11049, c4890Mo90192, interfaceC4887, iIntValue, null), 3);
        try {
            obj = C8926.f22687;
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            InterfaceC5925 interfaceC5925Mo9476 = AbstractC5228.f13320.mo9476(C8926.class);
            try {
                interfaceC5919M9471 = AbstractC5228.m9471(C8926.class);
            } catch (Throwable unused) {
                interfaceC5919M9471 = null;
            }
            C7686 c7686 = new C7686(interfaceC5925Mo9476, interfaceC5919M9471);
            shutDownUrl$doShutdown$1.L$0 = c6270M11049;
            shutDownUrl$doShutdown$1.label = 1;
            if (interfaceC4889.mo9021(obj, c7686, shutDownUrl$doShutdown$1) == obj3) {
                return obj3;
            }
            interfaceC5192 = c6270M11049;
            ((C6292) interfaceC5192).mo10815(null);
            return C6008.f15084;
        } catch (Throwable th4) {
            th = th4;
            interfaceC5192 = c6270M11049;
            ((C6292) interfaceC5192).mo10815(null);
            throw th;
        }
    }
}
