package io.ktor.network.tls;

import com.android.p002dx.p005io.Opcodes;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import io.ktor.network.sockets.InterfaceC4854;
import io.ktor.utils.p007io.AbstractC5076;
import io.ktor.utils.p007io.AbstractC5078;
import io.ktor.utils.p007io.C5081;
import io.ktor.utils.p007io.InterfaceC5079;
import io.ktor.utils.p007io.InterfaceC5084;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.p010io.InterfaceC6313;
import p025.AbstractC7012;
import p074.AbstractC7684;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.network.tls.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4867 {
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e3, code lost:
    
        if (((io.ktor.utils.p007io.C5081) r7).m9259(r0) != r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041 A[PHI: r7 r8
  0x0041: PHI (r7v12 io.ktor.network.tls.飘花落叶言子楪苏兰世哲) = (r7v9 io.ktor.network.tls.飘花落叶言子楪苏兰世哲), (r7v15 io.ktor.network.tls.飘花落叶言子楪苏兰世哲) binds: [B:30:0x00c5, B:14:0x0036] A[DONT_GENERATE, DONT_INLINE]
  0x0041: PHI (r8v11 io.ktor.utils.io.飘花落叶言子楪哲苏世兰) = (r8v8 io.ktor.utils.io.飘花落叶言子楪哲苏世兰), (r8v16 io.ktor.utils.io.飘花落叶言子楪哲苏世兰) binds: [B:30:0x00c5, B:14:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b2 A[PHI: r7 r8
  0x00b2: PHI (r7v9 io.ktor.network.tls.飘花落叶言子楪苏兰世哲) = (r7v6 io.ktor.network.tls.飘花落叶言子楪苏兰世哲), (r7v11 io.ktor.network.tls.飘花落叶言子楪苏兰世哲) binds: [B:27:0x00af, B:16:0x0046] A[DONT_GENERATE, DONT_INLINE]
  0x00b2: PHI (r8v8 io.ktor.utils.io.飘花落叶言子楪哲苏世兰) = (r8v5 io.ktor.utils.io.飘花落叶言子楪哲苏世兰), (r8v10 io.ktor.utils.io.飘花落叶言子楪哲苏世兰) binds: [B:27:0x00af, B:16:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d8 A[PHI: r7
  0x00d8: PHI (r7v16 io.ktor.utils.io.飘花落叶言子楪哲苏世兰) = (r7v13 io.ktor.utils.io.飘花落叶言子楪哲苏世兰), (r7v20 io.ktor.utils.io.飘花落叶言子楪哲苏世兰) binds: [B:33:0x00d5, B:13:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m8996(InterfaceC5079 interfaceC5079, C4875 c4875, ContinuationImpl continuationImpl) {
        RenderKt$writeRecord$1 renderKt$writeRecord$1;
        byte code;
        InterfaceC5079 interfaceC50792;
        C4875 c48752;
        byte code2;
        short sM12638;
        InterfaceC5079 interfaceC50793;
        InterfaceC6313 interfaceC6313;
        if (continuationImpl instanceof RenderKt$writeRecord$1) {
            renderKt$writeRecord$1 = (RenderKt$writeRecord$1) continuationImpl;
            int i = renderKt$writeRecord$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                renderKt$writeRecord$1.label = i - Integer.MIN_VALUE;
            } else {
                renderKt$writeRecord$1 = new RenderKt$writeRecord$1(continuationImpl);
            }
        }
        Object obj = renderKt$writeRecord$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (renderKt$writeRecord$1.label) {
            case 0:
                AbstractC6017.m10769(obj);
                byte code3 = (byte) c4875.f12668.getCode();
                renderKt$writeRecord$1.L$0 = interfaceC5079;
                renderKt$writeRecord$1.L$1 = c4875;
                renderKt$writeRecord$1.label = 1;
                if (AbstractC5078.m9249(interfaceC5079, code3, renderKt$writeRecord$1) != coroutineSingletons) {
                    code = (byte) (c4875.f12667.getCode() >> 8);
                    renderKt$writeRecord$1.L$0 = interfaceC5079;
                    renderKt$writeRecord$1.L$1 = c4875;
                    renderKt$writeRecord$1.label = 2;
                    if (AbstractC5078.m9249(interfaceC5079, code, renderKt$writeRecord$1) != coroutineSingletons) {
                        C4875 c48753 = c4875;
                        interfaceC50792 = interfaceC5079;
                        c48752 = c48753;
                        code2 = (byte) c48752.f12667.getCode();
                        renderKt$writeRecord$1.L$0 = interfaceC50792;
                        renderKt$writeRecord$1.L$1 = c48752;
                        renderKt$writeRecord$1.label = 3;
                        if (AbstractC5078.m9249(interfaceC50792, code2, renderKt$writeRecord$1) != coroutineSingletons) {
                            sM12638 = (short) AbstractC7684.m12638(c48752.f12666);
                            renderKt$writeRecord$1.L$0 = interfaceC50792;
                            renderKt$writeRecord$1.L$1 = c48752;
                            renderKt$writeRecord$1.label = 4;
                            if (AbstractC5078.m9253(interfaceC50792, sM12638, renderKt$writeRecord$1) != coroutineSingletons) {
                                InterfaceC5079 interfaceC50794 = interfaceC50792;
                                C4875 c48754 = c48752;
                                interfaceC50793 = interfaceC50794;
                                interfaceC6313 = c48754.f12666;
                                renderKt$writeRecord$1.L$0 = interfaceC50793;
                                renderKt$writeRecord$1.L$1 = null;
                                renderKt$writeRecord$1.label = 5;
                                if (AbstractC5078.m9246(interfaceC50793, interfaceC6313, renderKt$writeRecord$1) != coroutineSingletons) {
                                    renderKt$writeRecord$1.L$0 = null;
                                    renderKt$writeRecord$1.label = 6;
                                }
                            }
                        }
                    }
                    break;
                }
                return coroutineSingletons;
            case 1:
                c4875 = (C4875) renderKt$writeRecord$1.L$1;
                interfaceC5079 = (InterfaceC5079) renderKt$writeRecord$1.L$0;
                AbstractC6017.m10769(obj);
                code = (byte) (c4875.f12667.getCode() >> 8);
                renderKt$writeRecord$1.L$0 = interfaceC5079;
                renderKt$writeRecord$1.L$1 = c4875;
                renderKt$writeRecord$1.label = 2;
                if (AbstractC5078.m9249(interfaceC5079, code, renderKt$writeRecord$1) != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 2:
                c48752 = (C4875) renderKt$writeRecord$1.L$1;
                interfaceC50792 = (InterfaceC5079) renderKt$writeRecord$1.L$0;
                AbstractC6017.m10769(obj);
                code2 = (byte) c48752.f12667.getCode();
                renderKt$writeRecord$1.L$0 = interfaceC50792;
                renderKt$writeRecord$1.L$1 = c48752;
                renderKt$writeRecord$1.label = 3;
                if (AbstractC5078.m9249(interfaceC50792, code2, renderKt$writeRecord$1) != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 3:
                c48752 = (C4875) renderKt$writeRecord$1.L$1;
                interfaceC50792 = (InterfaceC5079) renderKt$writeRecord$1.L$0;
                AbstractC6017.m10769(obj);
                sM12638 = (short) AbstractC7684.m12638(c48752.f12666);
                renderKt$writeRecord$1.L$0 = interfaceC50792;
                renderKt$writeRecord$1.L$1 = c48752;
                renderKt$writeRecord$1.label = 4;
                if (AbstractC5078.m9253(interfaceC50792, sM12638, renderKt$writeRecord$1) != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 4:
                c48752 = (C4875) renderKt$writeRecord$1.L$1;
                interfaceC50792 = (InterfaceC5079) renderKt$writeRecord$1.L$0;
                AbstractC6017.m10769(obj);
                InterfaceC5079 interfaceC507942 = interfaceC50792;
                C4875 c487542 = c48752;
                interfaceC50793 = interfaceC507942;
                interfaceC6313 = c487542.f12666;
                renderKt$writeRecord$1.L$0 = interfaceC50793;
                renderKt$writeRecord$1.L$1 = null;
                renderKt$writeRecord$1.label = 5;
                if (AbstractC5078.m9246(interfaceC50793, interfaceC6313, renderKt$writeRecord$1) != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 5:
                interfaceC50793 = (InterfaceC5079) renderKt$writeRecord$1.L$0;
                AbstractC6017.m10769(obj);
                renderKt$writeRecord$1.L$0 = null;
                renderKt$writeRecord$1.label = 6;
                break;
            case 6:
                AbstractC6017.m10769(obj);
                return C6008.f15084;
            default:
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Enum m8997(InterfaceC5084 interfaceC5084, ContinuationImpl continuationImpl) {
        ParserKt$readTLSVersion$1 parserKt$readTLSVersion$1;
        C4872 c4872;
        if (continuationImpl instanceof ParserKt$readTLSVersion$1) {
            parserKt$readTLSVersion$1 = (ParserKt$readTLSVersion$1) continuationImpl;
            int i = parserKt$readTLSVersion$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                parserKt$readTLSVersion$1.label = i - Integer.MIN_VALUE;
            } else {
                parserKt$readTLSVersion$1 = new ParserKt$readTLSVersion$1(continuationImpl);
            }
        }
        Object obj = parserKt$readTLSVersion$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = parserKt$readTLSVersion$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            C4872 c48722 = TLSVersion.Companion;
            parserKt$readTLSVersion$1.L$0 = c48722;
            parserKt$readTLSVersion$1.label = 1;
            Object objM8999 = m8999(interfaceC5084, parserKt$readTLSVersion$1);
            if (objM8999 == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = objM8999;
            c4872 = c48722;
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c4872 = (C4872) parserKt$readTLSVersion$1.L$0;
            AbstractC6017.m10769(obj);
        }
        int iIntValue = ((Number) obj).intValue() & Opcodes.MAX_VALUE;
        c4872.getClass();
        if (768 <= iIntValue && iIntValue < 772) {
            return (TLSVersion) TLSVersion.byOrdinal.get(iIntValue - Opcodes.FILL_ARRAY_DATA_PAYLOAD);
        }
        C6755.m11869(AbstractC7012.m12147(iIntValue, "Invalid TLS version code "));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m8998(InterfaceC5084 interfaceC5084, ContinuationImpl continuationImpl) throws TLSException {
        ParserKt$readTLSRecord$1 parserKt$readTLSRecord$1;
        InterfaceC5084 interfaceC50842;
        C4876 c4876;
        TLSRecordType tLSRecordType;
        Object objM8999;
        TLSRecordType tLSRecordType2;
        TLSVersion tLSVersion;
        InterfaceC5084 interfaceC50843;
        int iIntValue;
        TLSRecordType tLSRecordType3;
        if (continuationImpl instanceof ParserKt$readTLSRecord$1) {
            parserKt$readTLSRecord$1 = (ParserKt$readTLSRecord$1) continuationImpl;
            int i = parserKt$readTLSRecord$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                parserKt$readTLSRecord$1.label = i - Integer.MIN_VALUE;
            } else {
                parserKt$readTLSRecord$1 = new ParserKt$readTLSRecord$1(continuationImpl);
            }
        }
        Object objM8997 = parserKt$readTLSRecord$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = parserKt$readTLSRecord$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(objM8997);
            C4876 c48762 = TLSRecordType.Companion;
            parserKt$readTLSRecord$1.L$0 = interfaceC5084;
            parserKt$readTLSRecord$1.L$1 = c48762;
            parserKt$readTLSRecord$1.label = 1;
            Object objM9239 = AbstractC5076.m9239(interfaceC5084, parserKt$readTLSRecord$1);
            if (objM9239 != coroutineSingletons) {
                interfaceC50842 = interfaceC5084;
                c4876 = c48762;
                objM8997 = objM9239;
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                tLSRecordType = (TLSRecordType) parserKt$readTLSRecord$1.L$1;
                interfaceC50842 = (InterfaceC5084) parserKt$readTLSRecord$1.L$0;
                AbstractC6017.m10769(objM8997);
                TLSVersion tLSVersion2 = (TLSVersion) objM8997;
                parserKt$readTLSRecord$1.L$0 = interfaceC50842;
                parserKt$readTLSRecord$1.L$1 = tLSRecordType;
                parserKt$readTLSRecord$1.L$2 = tLSVersion2;
                parserKt$readTLSRecord$1.label = 3;
                objM8999 = m8999(interfaceC50842, parserKt$readTLSRecord$1);
                if (objM8999 != coroutineSingletons) {
                    InterfaceC5084 interfaceC50844 = interfaceC50842;
                    tLSRecordType2 = tLSRecordType;
                    tLSVersion = tLSVersion2;
                    objM8997 = objM8999;
                    interfaceC50843 = interfaceC50844;
                    iIntValue = ((Number) objM8997).intValue() & Opcodes.MAX_VALUE;
                    if (iIntValue <= 18432) {
                    }
                }
                return coroutineSingletons;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tLSVersion = (TLSVersion) parserKt$readTLSRecord$1.L$1;
                tLSRecordType3 = (TLSRecordType) parserKt$readTLSRecord$1.L$0;
                AbstractC6017.m10769(objM8997);
                return new C4875(tLSRecordType3, tLSVersion, (InterfaceC6313) objM8997);
            }
            tLSVersion = (TLSVersion) parserKt$readTLSRecord$1.L$2;
            tLSRecordType2 = (TLSRecordType) parserKt$readTLSRecord$1.L$1;
            interfaceC50843 = (InterfaceC5084) parserKt$readTLSRecord$1.L$0;
            AbstractC6017.m10769(objM8997);
            iIntValue = ((Number) objM8997).intValue() & Opcodes.MAX_VALUE;
            if (iIntValue <= 18432) {
                throw new TLSException(AbstractC7012.m12147(iIntValue, "Illegal TLS frame size: "), null, 2, null);
            }
            parserKt$readTLSRecord$1.L$0 = tLSRecordType2;
            parserKt$readTLSRecord$1.L$1 = tLSVersion;
            parserKt$readTLSRecord$1.L$2 = null;
            parserKt$readTLSRecord$1.label = 4;
            objM8997 = AbstractC5076.m9229(interfaceC50843, iIntValue, parserKt$readTLSRecord$1);
            if (objM8997 != coroutineSingletons) {
                tLSRecordType3 = tLSRecordType2;
                return new C4875(tLSRecordType3, tLSVersion, (InterfaceC6313) objM8997);
            }
            return coroutineSingletons;
        }
        c4876 = (C4876) parserKt$readTLSRecord$1.L$1;
        interfaceC50842 = (InterfaceC5084) parserKt$readTLSRecord$1.L$0;
        AbstractC6017.m10769(objM8997);
        int iByteValue = ((Number) objM8997).byteValue() & DefaultClassResolver.NAME;
        c4876.getClass();
        tLSRecordType = (iByteValue < 0 || iByteValue >= 256) ? null : TLSRecordType.byCode[iByteValue];
        if (tLSRecordType == null) {
            C6755.m11869(AbstractC7012.m12147(iByteValue, "Invalid TLS record type code: "));
            return null;
        }
        parserKt$readTLSRecord$1.L$0 = interfaceC50842;
        parserKt$readTLSRecord$1.L$1 = tLSRecordType;
        parserKt$readTLSRecord$1.label = 2;
        objM8997 = m8997(interfaceC50842, parserKt$readTLSRecord$1);
        if (objM8997 != coroutineSingletons) {
            TLSVersion tLSVersion22 = (TLSVersion) objM8997;
            parserKt$readTLSRecord$1.L$0 = interfaceC50842;
            parserKt$readTLSRecord$1.L$1 = tLSRecordType;
            parserKt$readTLSRecord$1.L$2 = tLSVersion22;
            parserKt$readTLSRecord$1.label = 3;
            objM8999 = m8999(interfaceC50842, parserKt$readTLSRecord$1);
            if (objM8999 != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m8999(InterfaceC5084 interfaceC5084, ContinuationImpl continuationImpl) {
        ParserKt$readShortCompatible$1 parserKt$readShortCompatible$1;
        int i;
        if (continuationImpl instanceof ParserKt$readShortCompatible$1) {
            parserKt$readShortCompatible$1 = (ParserKt$readShortCompatible$1) continuationImpl;
            int i2 = parserKt$readShortCompatible$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                parserKt$readShortCompatible$1.label = i2 - Integer.MIN_VALUE;
            } else {
                parserKt$readShortCompatible$1 = new ParserKt$readShortCompatible$1(continuationImpl);
            }
        }
        Object objM9239 = parserKt$readShortCompatible$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = parserKt$readShortCompatible$1.label;
        if (i3 == 0) {
            AbstractC6017.m10769(objM9239);
            parserKt$readShortCompatible$1.L$0 = interfaceC5084;
            parserKt$readShortCompatible$1.label = 1;
            objM9239 = AbstractC5076.m9239(interfaceC5084, parserKt$readShortCompatible$1);
            if (objM9239 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = parserKt$readShortCompatible$1.I$0;
            AbstractC6017.m10769(objM9239);
            return new Integer((i << 8) + (((Number) objM9239).byteValue() & DefaultClassResolver.NAME));
        }
        interfaceC5084 = (InterfaceC5084) parserKt$readShortCompatible$1.L$0;
        AbstractC6017.m10769(objM9239);
        int iByteValue = ((Number) objM9239).byteValue() & DefaultClassResolver.NAME;
        parserKt$readShortCompatible$1.L$0 = null;
        parserKt$readShortCompatible$1.I$0 = iByteValue;
        parserKt$readShortCompatible$1.label = 2;
        Object objM92392 = AbstractC5076.m9239(interfaceC5084, parserKt$readShortCompatible$1);
        if (objM92392 != coroutineSingletons) {
            objM9239 = objM92392;
            i = iByteValue;
            return new Integer((i << 8) + (((Number) objM9239).byteValue() & DefaultClassResolver.NAME));
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9000(InterfaceC4854 interfaceC4854, C5081 c5081, C5081 c50812, AbstractC4867 abstractC4867, ContinuationImpl continuationImpl) throws TLSException {
        TLSClientSessionJvmKt$openTLSSession$1 tLSClientSessionJvmKt$openTLSSession$1;
        if (continuationImpl instanceof TLSClientSessionJvmKt$openTLSSession$1) {
            tLSClientSessionJvmKt$openTLSSession$1 = (TLSClientSessionJvmKt$openTLSSession$1) continuationImpl;
            int i = tLSClientSessionJvmKt$openTLSSession$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tLSClientSessionJvmKt$openTLSSession$1.label = i - Integer.MIN_VALUE;
            } else {
                tLSClientSessionJvmKt$openTLSSession$1 = new TLSClientSessionJvmKt$openTLSSession$1(continuationImpl);
            }
        }
        Object obj = tLSClientSessionJvmKt$openTLSSession$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = tLSClientSessionJvmKt$openTLSSession$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            c5081.getClass();
            c50812.getClass();
            abstractC4867.getClass();
            throw null;
        }
        if (i2 != 1) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC4873 abstractC4873 = (AbstractC4873) tLSClientSessionJvmKt$openTLSSession$1.L$2;
        InterfaceC5192 interfaceC5192 = (InterfaceC5192) tLSClientSessionJvmKt$openTLSSession$1.L$1;
        InterfaceC4854 interfaceC48542 = (InterfaceC4854) tLSClientSessionJvmKt$openTLSSession$1.L$0;
        try {
            AbstractC6017.m10769(obj);
            abstractC4873.getClass();
            return new C4870(null, null, interfaceC48542, interfaceC5192);
        } catch (ClosedSendChannelException e) {
            throw new TLSException("Negotiation failed due to EOS", e);
        }
    }
}
