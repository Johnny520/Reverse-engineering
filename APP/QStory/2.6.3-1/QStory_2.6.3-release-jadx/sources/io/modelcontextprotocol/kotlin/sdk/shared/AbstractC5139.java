package io.modelcontextprotocol.kotlin.sdk.shared;

import androidx.activity.compose.C0849;
import androidx.activity.compose.C0851;
import androidx.window.area.C3391;
import io.ktor.client.plugins.AbstractC4765;
import io.ktor.util.C5039;
import io.ktor.util.C5043;
import io.modelcontextprotocol.kotlin.sdk.ErrorCode$Defined;
import io.modelcontextprotocol.kotlin.sdk.McpError;
import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import io.modelcontextprotocol.kotlin.sdk.server.AbstractC5127;
import io.modelcontextprotocol.kotlin.sdk.server.C5122;
import io.modelcontextprotocol.kotlin.sdk.server.C5128;
import io.modelcontextprotocol.kotlin.sdk.server.C5131;
import java.util.LinkedHashMap;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC5220;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import kotlinx.coroutines.C6270;
import p068.InterfaceC7372;
import p068.InterfaceC7380;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p072.C7489;
import p072.C7503;
import p072.C7507;
import p072.C7508;
import p072.C7577;
import p072.C7590;
import p072.InterfaceC7625;
import p072.InterfaceC7665;
import p104.AbstractC7988;
import p105.InterfaceC8013;
import p265.InterfaceC8989;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.modelcontextprotocol.kotlin.sdk.shared.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5139 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public InterfaceC5141 f13227;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C5131 f13228;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final LinkedHashMap f13226 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final LinkedHashMap f13225 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final LinkedHashMap f13224 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final LinkedHashMap f13223 = new LinkedHashMap();

    public AbstractC5139(C5131 c5131) {
        this.f13228 = c5131;
        m9297(Method$Defined.NotificationsProgress, new C5133(this, 0));
        m9296(AbstractC5228.m9471(C7577.class), Method$Defined.Ping, new Protocol$2(null));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m9293(AbstractC5139 abstractC5139, C7508 c7508, C7503 c7503) {
        LinkedHashMap linkedHashMap = abstractC5139.f13224;
        InterfaceC7665 interfaceC7665 = c7508 != null ? c7508.f18434 : null;
        InterfaceC7383 interfaceC7383 = (InterfaceC7383) linkedHashMap.get(interfaceC7665);
        if (interfaceC7383 == null) {
            AbstractC7988 abstractC7988M9302 = AbstractC5143.m9302();
            abstractC7988M9302.getClass();
            new Error("Received a response for an unknown message ID: ".concat(abstractC7988M9302.m12983(AbstractC4765.m8872(C7508.Companion.serializer()), c7508)));
            return;
        }
        AbstractC5220.m9449(linkedHashMap).remove(interfaceC7665);
        AbstractC5220.m9449(abstractC5139.f13223).remove(interfaceC7665);
        if (c7508 != null) {
            interfaceC7383.invoke(c7508, null);
        } else if (c7503 != null) {
            interfaceC7383.invoke(null, new McpError(c7503.f18421.getCode(), c7503.f18420, c7503.f18419));
        } else {
            C6755.m11870("Check failed.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00e7 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #2 {all -> 0x0055, blocks: (B:22:0x0051, B:27:0x005c, B:48:0x00d6, B:50:0x00e7, B:45:0x00c6), top: B:69:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9294(AbstractC5139 abstractC5139, C7507 c7507, ContinuationImpl continuationImpl) {
        Protocol$onRequest$1 protocol$onRequest$1;
        final C7507 c75072;
        InterfaceC5141 interfaceC5141;
        final C7507 c75073 = c7507;
        abstractC5139.getClass();
        if (continuationImpl instanceof Protocol$onRequest$1) {
            protocol$onRequest$1 = (Protocol$onRequest$1) continuationImpl;
            int i = protocol$onRequest$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                protocol$onRequest$1.label = i - Integer.MIN_VALUE;
            } else {
                protocol$onRequest$1 = new Protocol$onRequest$1(abstractC5139, continuationImpl);
            }
        }
        Object objInvoke = protocol$onRequest$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = protocol$onRequest$1.label;
        C6008 c6008 = C6008.f15084;
        final int i3 = 4;
        final int i4 = 3;
        final int i5 = 2;
        final int i6 = 1;
        try {
            try {
                if (i2 == 0) {
                    AbstractC6017.m10769(objInvoke);
                    InterfaceC8989 interfaceC8989 = AbstractC5143.f13236;
                    interfaceC8989.mo9606(new InterfaceC7372() { // from class: io.modelcontextprotocol.kotlin.sdk.shared.飘花落叶言子楪世苏兰哲
                        @Override // p068.InterfaceC7372
                        public final Object invoke() {
                            int i7 = i4;
                            C7507 c75074 = c75073;
                            switch (i7) {
                                case 0:
                                    return "Request handled successfully: " + c75074.f18428 + " (id: " + c75074.f18429 + ')';
                                case 1:
                                    return "Error handling request: " + c75074.f18428 + " (id: " + c75074.f18429 + ')';
                                case 2:
                                    return "Failed to send error response for request: " + c75074.f18428 + " (id: " + c75074.f18429 + ')';
                                case 3:
                                    return "Received request: " + c75074.f18428 + " (id: " + c75074.f18429 + ')';
                                default:
                                    return "No handler found for request: " + c75074.f18428;
                            }
                        }
                    });
                    InterfaceC7380 interfaceC7380 = (InterfaceC7380) abstractC5139.f13226.get(c75073.f18428);
                    if (interfaceC7380 == null) {
                        interfaceC7380 = null;
                    }
                    if (interfaceC7380 == null) {
                        interfaceC8989.mo9606(new InterfaceC7372() { // from class: io.modelcontextprotocol.kotlin.sdk.shared.飘花落叶言子楪世苏兰哲
                            @Override // p068.InterfaceC7372
                            public final Object invoke() {
                                int i7 = i3;
                                C7507 c75074 = c75073;
                                switch (i7) {
                                    case 0:
                                        return "Request handled successfully: " + c75074.f18428 + " (id: " + c75074.f18429 + ')';
                                    case 1:
                                        return "Error handling request: " + c75074.f18428 + " (id: " + c75074.f18429 + ')';
                                    case 2:
                                        return "Failed to send error response for request: " + c75074.f18428 + " (id: " + c75074.f18429 + ')';
                                    case 3:
                                        return "Received request: " + c75074.f18428 + " (id: " + c75074.f18429 + ')';
                                    default:
                                        return "No handler found for request: " + c75074.f18428;
                                }
                            }
                        });
                        InterfaceC5141 interfaceC51412 = abstractC5139.f13227;
                        if (interfaceC51412 != null) {
                            C7508 c7508 = new C7508(c75073.f18429, null, new C7503(ErrorCode$Defined.MethodNotFound, "Server does not support " + c75073.f18428), 6);
                            protocol$onRequest$1.label = 1;
                            if (((AbstractC5142) interfaceC51412).m9301(c7508, protocol$onRequest$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    } else {
                        C5144 c5144 = new C5144();
                        protocol$onRequest$1.L$0 = c75073;
                        protocol$onRequest$1.label = 2;
                        objInvoke = interfaceC7380.invoke(c75073, c5144, protocol$onRequest$1);
                        if (objInvoke == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        InterfaceC7625 interfaceC7625 = (InterfaceC7625) objInvoke;
                        final int i7 = 0;
                        AbstractC5143.f13236.mo9606(new InterfaceC7372() { // from class: io.modelcontextprotocol.kotlin.sdk.shared.飘花落叶言子楪世苏兰哲
                            @Override // p068.InterfaceC7372
                            public final Object invoke() {
                                int i72 = i7;
                                C7507 c75074 = c75073;
                                switch (i72) {
                                    case 0:
                                        return "Request handled successfully: " + c75074.f18428 + " (id: " + c75074.f18429 + ')';
                                    case 1:
                                        return "Error handling request: " + c75074.f18428 + " (id: " + c75074.f18429 + ')';
                                    case 2:
                                        return "Failed to send error response for request: " + c75074.f18428 + " (id: " + c75074.f18429 + ')';
                                    case 3:
                                        return "Received request: " + c75074.f18428 + " (id: " + c75074.f18429 + ')';
                                    default:
                                        return "No handler found for request: " + c75074.f18428;
                                }
                            }
                        });
                        interfaceC5141 = abstractC5139.f13227;
                        if (interfaceC5141 != null) {
                        }
                    }
                } else if (i2 == 1) {
                    AbstractC6017.m10769(objInvoke);
                } else if (i2 == 2) {
                    c75073 = (C7507) protocol$onRequest$1.L$0;
                    AbstractC6017.m10769(objInvoke);
                    InterfaceC7625 interfaceC76252 = (InterfaceC7625) objInvoke;
                    final int i72 = 0;
                    AbstractC5143.f13236.mo9606(new InterfaceC7372() { // from class: io.modelcontextprotocol.kotlin.sdk.shared.飘花落叶言子楪世苏兰哲
                        @Override // p068.InterfaceC7372
                        public final Object invoke() {
                            int i722 = i72;
                            C7507 c75074 = c75073;
                            switch (i722) {
                                case 0:
                                    return "Request handled successfully: " + c75074.f18428 + " (id: " + c75074.f18429 + ')';
                                case 1:
                                    return "Error handling request: " + c75074.f18428 + " (id: " + c75074.f18429 + ')';
                                case 2:
                                    return "Failed to send error response for request: " + c75074.f18428 + " (id: " + c75074.f18429 + ')';
                                case 3:
                                    return "Received request: " + c75074.f18428 + " (id: " + c75074.f18429 + ')';
                                default:
                                    return "No handler found for request: " + c75074.f18428;
                            }
                        }
                    });
                    interfaceC5141 = abstractC5139.f13227;
                    if (interfaceC5141 != null) {
                        C7508 c75082 = new C7508(c75073.f18429, interfaceC76252, null, 10);
                        protocol$onRequest$1.L$0 = c75073;
                        protocol$onRequest$1.label = 3;
                        if (((AbstractC5142) interfaceC5141).m9301(c75082, protocol$onRequest$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else if (i2 == 3) {
                    AbstractC6017.m10769(objInvoke);
                } else {
                    if (i2 != 4) {
                        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c75072 = (C7507) protocol$onRequest$1.L$0;
                    try {
                        AbstractC6017.m10769(objInvoke);
                    } catch (Throwable th) {
                        th = th;
                        AbstractC5143.f13236.mo9614(th, new InterfaceC7372() { // from class: io.modelcontextprotocol.kotlin.sdk.shared.飘花落叶言子楪世苏兰哲
                            @Override // p068.InterfaceC7372
                            public final Object invoke() {
                                int i722 = i5;
                                C7507 c75074 = c75072;
                                switch (i722) {
                                    case 0:
                                        return "Request handled successfully: " + c75074.f18428 + " (id: " + c75074.f18429 + ')';
                                    case 1:
                                        return "Error handling request: " + c75074.f18428 + " (id: " + c75074.f18429 + ')';
                                    case 2:
                                        return "Failed to send error response for request: " + c75074.f18428 + " (id: " + c75074.f18429 + ')';
                                    case 3:
                                        return "Received request: " + c75074.f18428 + " (id: " + c75074.f18429 + ')';
                                    default:
                                        return "No handler found for request: " + c75074.f18428;
                                }
                            }
                        });
                    }
                }
            } catch (Throwable th2) {
                AbstractC5143.f13236.mo9614(th2, new C3391(14));
            }
        } catch (Throwable th3) {
            AbstractC5143.f13236.mo9614(th3, new InterfaceC7372() { // from class: io.modelcontextprotocol.kotlin.sdk.shared.飘花落叶言子楪世苏兰哲
                @Override // p068.InterfaceC7372
                public final Object invoke() {
                    int i722 = i6;
                    C7507 c75074 = c75073;
                    switch (i722) {
                        case 0:
                            return "Request handled successfully: " + c75074.f18428 + " (id: " + c75074.f18429 + ')';
                        case 1:
                            return "Error handling request: " + c75074.f18428 + " (id: " + c75074.f18429 + ')';
                        case 2:
                            return "Failed to send error response for request: " + c75074.f18428 + " (id: " + c75074.f18429 + ')';
                        case 3:
                            return "Received request: " + c75074.f18428 + " (id: " + c75074.f18429 + ')';
                        default:
                            return "No handler found for request: " + c75074.f18428;
                    }
                }
            });
            try {
                InterfaceC5141 interfaceC51413 = abstractC5139.f13227;
                if (interfaceC51413 != null) {
                    InterfaceC7665 interfaceC7665 = c75073.f18429;
                    ErrorCode$Defined errorCode$Defined = ErrorCode$Defined.InternalError;
                    String message = th3.getMessage();
                    if (message == null) {
                        message = "Internal error";
                    }
                    C7508 c75083 = new C7508(interfaceC7665, null, new C7503(errorCode$Defined, message), 6);
                    protocol$onRequest$1.L$0 = c75073;
                    protocol$onRequest$1.label = 4;
                    if (((AbstractC5142) interfaceC51413).m9301(c75083, protocol$onRequest$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                c75072 = c75073;
                AbstractC5143.f13236.mo9614(th, new InterfaceC7372() { // from class: io.modelcontextprotocol.kotlin.sdk.shared.飘花落叶言子楪世苏兰哲
                    @Override // p068.InterfaceC7372
                    public final Object invoke() {
                        int i722 = i5;
                        C7507 c75074 = c75072;
                        switch (i722) {
                            case 0:
                                return "Request handled successfully: " + c75074.f18428 + " (id: " + c75074.f18429 + ')';
                            case 1:
                                return "Error handling request: " + c75074.f18428 + " (id: " + c75074.f18429 + ')';
                            case 2:
                                return "Failed to send error response for request: " + c75074.f18428 + " (id: " + c75074.f18429 + ')';
                            case 3:
                                return "Received request: " + c75074.f18428 + " (id: " + c75074.f18429 + ')';
                            default:
                                return "No handler found for request: " + c75074.f18428;
                        }
                    }
                });
            }
        }
        return c6008;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9295(AbstractC5139 abstractC5139, final C7489 c7489, ContinuationImpl continuationImpl) {
        Protocol$onNotification$1 protocol$onNotification$1;
        abstractC5139.getClass();
        if (continuationImpl instanceof Protocol$onNotification$1) {
            protocol$onNotification$1 = (Protocol$onNotification$1) continuationImpl;
            int i = protocol$onNotification$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                protocol$onNotification$1.label = i - Integer.MIN_VALUE;
            } else {
                protocol$onNotification$1 = new Protocol$onNotification$1(abstractC5139, continuationImpl);
            }
        }
        Object obj = protocol$onNotification$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = protocol$onNotification$1.label;
        C6008 c6008 = C6008.f15084;
        final int i3 = 1;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC6017.m10769(obj);
                return c6008;
            }
            AbstractC6017.m10769(obj);
            InterfaceC8989 interfaceC8989 = AbstractC5143.f13236;
            final int i4 = 0;
            interfaceC8989.mo9606(new InterfaceC7372() { // from class: io.modelcontextprotocol.kotlin.sdk.shared.飘花落叶言子楪世哲苏兰
                @Override // p068.InterfaceC7372
                public final Object invoke() {
                    int i5 = i4;
                    C7489 c74892 = c7489;
                    switch (i5) {
                        case 0:
                            return "Received notification: " + c74892.f18405;
                        case 1:
                            return "No handler found for notification: " + c74892.f18405;
                        default:
                            return "Error handling notification: " + c74892.f18405;
                    }
                }
            });
            InterfaceC7383 interfaceC7383 = (InterfaceC7383) abstractC5139.f13225.get(c7489.f18405);
            InterfaceC7383 interfaceC73832 = interfaceC7383 != null ? interfaceC7383 : null;
            if (interfaceC73832 == null) {
                interfaceC8989.mo9606(new InterfaceC7372() { // from class: io.modelcontextprotocol.kotlin.sdk.shared.飘花落叶言子楪世哲苏兰
                    @Override // p068.InterfaceC7372
                    public final Object invoke() {
                        int i5 = i3;
                        C7489 c74892 = c7489;
                        switch (i5) {
                            case 0:
                                return "Received notification: " + c74892.f18405;
                            case 1:
                                return "No handler found for notification: " + c74892.f18405;
                            default:
                                return "Error handling notification: " + c74892.f18405;
                        }
                    }
                });
                return c6008;
            }
            protocol$onNotification$1.L$0 = c7489;
            protocol$onNotification$1.label = 1;
            return interfaceC73832.invoke(c7489, protocol$onNotification$1) == coroutineSingletons ? coroutineSingletons : c6008;
        } catch (Throwable th) {
            final int i5 = 2;
            AbstractC5143.f13236.mo9614(th, new InterfaceC7372() { // from class: io.modelcontextprotocol.kotlin.sdk.shared.飘花落叶言子楪世哲苏兰
                @Override // p068.InterfaceC7372
                public final Object invoke() {
                    int i52 = i5;
                    C7489 c74892 = c7489;
                    switch (i52) {
                        case 0:
                            return "Received notification: " + c74892.f18405;
                        case 1:
                            return "No handler found for notification: " + c74892.f18405;
                        default:
                            return "Error handling notification: " + c74892.f18405;
                    }
                }
            });
            return c6008;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b9  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m9296(InterfaceC5919 interfaceC5919, Method$Defined method$Defined, InterfaceC7380 interfaceC7380) {
        String str;
        interfaceC5919.getClass();
        method$Defined.getClass();
        InterfaceC8989 interfaceC8989 = AbstractC5127.f13198;
        interfaceC8989.mo9606(new C5122(0, method$Defined));
        String value = method$Defined.getValue();
        int iHashCode = value.hashCode();
        C7590 c7590 = ((C5128) this).f13203;
        switch (iHashCode) {
            case -362279138:
                if (value.equals("prompts/list")) {
                    if (c7590.f18542 == null) {
                        C5043.m9156(method$Defined, "Server does not support prompts (required for ");
                    }
                }
                InterfaceC8013 interfaceC8013M10428 = AbstractC5754.m10428(AbstractC5143.m9302().f19472, interfaceC5919);
                this.f13226.put(method$Defined.getValue(), new Protocol$setRequestHandler$1(interfaceC8013M10428, interfaceC7380, null));
                break;
            case -299086606:
                if (value.equals("logging/setLevel") && c7590.f18543 == null) {
                    C5043.m9156(method$Defined, "Server does not support logging (required for ");
                }
                InterfaceC8013 interfaceC8013M104282 = AbstractC5754.m10428(AbstractC5143.m9302().f19472, interfaceC5919);
                this.f13226.put(method$Defined.getValue(), new Protocol$setRequestHandler$1(interfaceC8013M104282, interfaceC7380, null));
                break;
            case 3441010:
                str = "ping";
                value.equals(str);
                InterfaceC8013 interfaceC8013M1042822 = AbstractC5754.m10428(AbstractC5143.m9302().f19472, interfaceC5919);
                this.f13226.put(method$Defined.getValue(), new Protocol$setRequestHandler$1(interfaceC8013M1042822, interfaceC7380, null));
                break;
            case 473012035:
                if (value.equals("sampling/createMessage") && c7590.f18544 == null) {
                    interfaceC8989.mo9617(new C3391(9));
                    C5043.m9156(method$Defined, "Server does not support sampling (required for ");
                }
                InterfaceC8013 interfaceC8013M10428222 = AbstractC5754.m10428(AbstractC5143.m9302().f19472, interfaceC5919);
                this.f13226.put(method$Defined.getValue(), new Protocol$setRequestHandler$1(interfaceC8013M10428222, interfaceC7380, null));
                break;
            case 498659858:
                if (value.equals("tools/call")) {
                    if (c7590.f18540 == null) {
                        C5043.m9156(method$Defined, "Server does not support tools (required for ");
                    }
                }
                InterfaceC8013 interfaceC8013M104282222 = AbstractC5754.m10428(AbstractC5143.m9302().f19472, interfaceC5919);
                this.f13226.put(method$Defined.getValue(), new Protocol$setRequestHandler$1(interfaceC8013M104282222, interfaceC7380, null));
                break;
            case 498935890:
                if (value.equals("tools/list")) {
                }
                InterfaceC8013 interfaceC8013M1042822222 = AbstractC5754.m10428(AbstractC5143.m9302().f19472, interfaceC5919);
                this.f13226.put(method$Defined.getValue(), new Protocol$setRequestHandler$1(interfaceC8013M1042822222, interfaceC7380, null));
                break;
            case 812012104:
                if (value.equals("resources/list")) {
                    if (c7590.f18541 == null) {
                        C5043.m9156(method$Defined, "Server does not support resources (required for ");
                    }
                }
                InterfaceC8013 interfaceC8013M10428222222 = AbstractC5754.m10428(AbstractC5143.m9302().f19472, interfaceC5919);
                this.f13226.put(method$Defined.getValue(), new Protocol$setRequestHandler$1(interfaceC8013M10428222222, interfaceC7380, null));
                break;
            case 812186432:
                if (value.equals("resources/read")) {
                }
                InterfaceC8013 interfaceC8013M104282222222 = AbstractC5754.m10428(AbstractC5143.m9302().f19472, interfaceC5919);
                this.f13226.put(method$Defined.getValue(), new Protocol$setRequestHandler$1(interfaceC8013M104282222222, interfaceC7380, null));
                break;
            case 871091088:
                str = "initialize";
                value.equals(str);
                InterfaceC8013 interfaceC8013M1042822222222 = AbstractC5754.m10428(AbstractC5143.m9302().f19472, interfaceC5919);
                this.f13226.put(method$Defined.getValue(), new Protocol$setRequestHandler$1(interfaceC8013M1042822222222, interfaceC7380, null));
                break;
            case 1382903518:
                if (value.equals("resources/templates/list")) {
                }
                InterfaceC8013 interfaceC8013M10428222222222 = AbstractC5754.m10428(AbstractC5143.m9302().f19472, interfaceC5919);
                this.f13226.put(method$Defined.getValue(), new Protocol$setRequestHandler$1(interfaceC8013M10428222222222, interfaceC7380, null));
                break;
            case 1650876630:
                if (value.equals("prompts/get")) {
                }
                InterfaceC8013 interfaceC8013M104282222222222 = AbstractC5754.m10428(AbstractC5143.m9302().f19472, interfaceC5919);
                this.f13226.put(method$Defined.getValue(), new Protocol$setRequestHandler$1(interfaceC8013M104282222222222, interfaceC7380, null));
                break;
            default:
                InterfaceC8013 interfaceC8013M1042822222222222 = AbstractC5754.m10428(AbstractC5143.m9302().f19472, interfaceC5919);
                this.f13226.put(method$Defined.getValue(), new Protocol$setRequestHandler$1(interfaceC8013M1042822222222222, interfaceC7380, null));
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m9297(Method$Defined method$Defined, InterfaceC7387 interfaceC7387) {
        method$Defined.getClass();
        this.f13225.put(method$Defined.getValue(), new Protocol$setNotificationHandler$1(interfaceC7387, null));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Object m9298(InterfaceC5141 interfaceC5141, InterfaceC5189 interfaceC5189) {
        InterfaceC7383 abstractTransport$onMessage$old$1;
        this.f13227 = interfaceC5141;
        C5140 c5140 = new C5140(this, 4);
        AbstractC5138 abstractC5138 = (AbstractC5138) interfaceC5141;
        abstractC5138.getClass();
        abstractC5138.f13222 = new C0851(abstractC5138.f13222, c5140);
        AbstractC5138 abstractC51382 = (AbstractC5138) interfaceC5141;
        abstractC51382.f13221 = new C0849(abstractC51382.f13221, 21, new C5039(this, 2));
        Protocol$connect$4 protocol$connect$4 = new Protocol$connect$4(this, null);
        C6270 c6270 = abstractC51382.f13220;
        boolean zMo11117 = c6270.mo11117();
        if (zMo11117) {
            abstractTransport$onMessage$old$1 = abstractC51382.f13219;
        } else {
            if (zMo11117) {
                C5043.m9170();
                return null;
            }
            abstractTransport$onMessage$old$1 = new AbstractTransport$onMessage$old$1(null);
        }
        abstractC51382.f13219 = new AbstractTransport$onMessage$1(abstractTransport$onMessage$old$1, protocol$connect$4, null);
        C6008 c6008 = C6008.f15084;
        c6270.m11147(c6008);
        Object objM9299 = AbstractC5142.m9299((AbstractC5142) interfaceC5141, (ContinuationImpl) interfaceC5189);
        return objM9299 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM9299 : c6008;
    }
}
