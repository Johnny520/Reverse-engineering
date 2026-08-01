package p072;

import io.ktor.client.plugins.AbstractC4765;
import io.modelcontextprotocol.kotlin.sdk.LoggingLevel;
import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import kotlin.InterfaceC6016;
import kotlin.jvm.internal.AbstractC5227;
import p103.AbstractC7973;
import p103.C7958;
import p103.C7964;
import p103.InterfaceC7908;
import p104.C7979;
import p104.C7981;
import p105.InterfaceC8013;
import p106.InterfaceC8015;
import p106.InterfaceC8016;
import p106.InterfaceC8017;
import p106.InterfaceC8018;
import p107.InterfaceC8020;
import p160.C8376;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪子世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C7636 implements InterfaceC7908 {
    private static final InterfaceC8020 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7636 f18591;

    static {
        C7636 c7636 = new C7636();
        f18591 = c7636;
        C7958 c7958 = new C7958("io.modelcontextprotocol.kotlin.sdk.LoggingMessageNotification", c7636, 5);
        c7958.m12968("level", false);
        c7958.m12968("logger", true);
        c7958.m12968("data", true);
        c7958.m12968("_meta", true);
        c7958.m12968("method", true);
        descriptor = c7958;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p103.InterfaceC7908
    public final InterfaceC8013[] childSerializers() {
        C7979 c7979 = C7979.f19457;
        return new InterfaceC8013[]{C7651.f18604[0].getValue(), AbstractC4765.m8872(C7964.f19434), c7979, c7979, C7621.f18577};
    }

    @Override // p105.InterfaceC8013
    public final Object deserialize(InterfaceC8016 interfaceC8016) {
        InterfaceC8020 interfaceC8020 = descriptor;
        InterfaceC8018 interfaceC8018Mo11235 = interfaceC8016.mo11235(interfaceC8020);
        InterfaceC6016[] interfaceC6016Arr = C7651.f18604;
        interfaceC8018Mo11235.getClass();
        boolean z = true;
        int i = 0;
        LoggingLevel loggingLevel = null;
        String str = null;
        C7981 c7981 = null;
        C7981 c79812 = null;
        InterfaceC7645 interfaceC7645 = null;
        while (z) {
            int iMo11277 = interfaceC8018Mo11235.mo11277(interfaceC8020);
            if (iMo11277 == -1) {
                z = false;
            } else if (iMo11277 == 0) {
                loggingLevel = (LoggingLevel) interfaceC8018Mo11235.mo11233(interfaceC8020, 0, (InterfaceC8013) interfaceC6016Arr[0].getValue(), loggingLevel);
                i |= 1;
            } else if (iMo11277 == 1) {
                str = (String) interfaceC8018Mo11235.mo11234(interfaceC8020, 1, C7964.f19434, str);
                i |= 2;
            } else if (iMo11277 == 2) {
                c7981 = (C7981) interfaceC8018Mo11235.mo11233(interfaceC8020, 2, C7979.f19457, c7981);
                i |= 4;
            } else if (iMo11277 == 3) {
                c79812 = (C7981) interfaceC8018Mo11235.mo11233(interfaceC8020, 3, C7979.f19457, c79812);
                i |= 8;
            } else {
                if (iMo11277 != 4) {
                    C8376.m13326(iMo11277);
                    return null;
                }
                interfaceC7645 = (InterfaceC7645) interfaceC8018Mo11235.mo11233(interfaceC8020, 4, C7621.f18577, interfaceC7645);
                i |= 16;
            }
        }
        interfaceC8018Mo11235.mo11237(interfaceC8020);
        return new C7651(i, loggingLevel, str, c7981, c79812, interfaceC7645);
    }

    @Override // p105.InterfaceC8013
    public final InterfaceC8020 getDescriptor() {
        return descriptor;
    }

    @Override // p105.InterfaceC8013
    public final void serialize(InterfaceC8015 interfaceC8015, Object obj) {
        C7651 c7651 = (C7651) obj;
        c7651.getClass();
        InterfaceC8020 interfaceC8020 = descriptor;
        InterfaceC8017 interfaceC8017Mo11269 = interfaceC8015.mo11269(interfaceC8020);
        InterfaceC8013 interfaceC8013 = (InterfaceC8013) C7651.f18604[0].getValue();
        LoggingLevel loggingLevel = c7651.f18609;
        InterfaceC7645 interfaceC7645 = c7651.f18605;
        C7981 c7981 = c7651.f18606;
        C7981 c79812 = c7651.f18607;
        String str = c7651.f18608;
        interfaceC8017Mo11269.mo11278(interfaceC8020, 0, interfaceC8013, loggingLevel);
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || str != null) {
            interfaceC8017Mo11269.mo11274(interfaceC8020, 1, C7964.f19434, str);
        }
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || !AbstractC5227.m9466(c79812, AbstractC7431.f18321)) {
            interfaceC8017Mo11269.mo11278(interfaceC8020, 2, C7979.f19457, c79812);
        }
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || !AbstractC5227.m9466(c7981, AbstractC7431.f18321)) {
            interfaceC8017Mo11269.mo11278(interfaceC8020, 3, C7979.f19457, c7981);
        }
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || interfaceC7645 != Method$Defined.NotificationsMessage) {
            interfaceC8017Mo11269.mo11278(interfaceC8020, 4, C7621.f18577, interfaceC7645);
        }
        interfaceC8017Mo11269.mo11270(interfaceC8020);
    }

    @Override // p103.InterfaceC7908
    public final InterfaceC8013[] typeParametersSerializers() {
        return AbstractC7973.f19448;
    }
}
