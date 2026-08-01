package io.ktor.server.engine;

import androidx.appcompat.app.C0923;
import androidx.compose.foundation.text.C1819;
import androidx.window.area.C3391;
import com.bumptech.glide.AbstractC3888;
import io.ktor.client.plugins.sse.C4736;
import io.ktor.http.content.AbstractC4819;
import io.ktor.http.content.AbstractC4826;
import io.ktor.http.content.AbstractC4827;
import io.ktor.http.content.AbstractC4828;
import io.ktor.http.content.AbstractC4829;
import io.ktor.server.application.C4890;
import io.ktor.server.application.InterfaceC4889;
import io.ktor.server.cio.C4915;
import io.ktor.server.cio.C4917;
import io.ktor.server.response.C4965;
import io.ktor.server.response.C4967;
import io.ktor.server.response.InterfaceC4966;
import io.ktor.server.websocket.C5008;
import io.ktor.util.C5041;
import io.ktor.util.C5043;
import io.ktor.util.cio.ChannelWriteException;
import io.ktor.utils.p007io.AbstractC5076;
import io.ktor.utils.p007io.AbstractC5078;
import io.ktor.utils.p007io.InterfaceC5079;
import io.ktor.utils.p007io.InterfaceC5084;
import java.io.IOException;
import kotlin.AbstractC6017;
import kotlin.AbstractC6019;
import kotlin.C6008;
import kotlin.InterfaceC6016;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5925;
import kotlinx.coroutines.AbstractC6227;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6248;
import p075.C7686;
import p111.C8036;
import p111.ExecutorC8037;
import p252.AbstractC8944;
import p252.C8926;
import p252.C8954;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.server.engine.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4940 implements InterfaceC4966 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final C5041 f12823;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f12824;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC6016 f12825 = AbstractC6019.m10773(new C3391(this));

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C4967 f12826;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C8926 f12827;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f12828;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C4915 f12829;

    static {
        InterfaceC5919 interfaceC5919M9471;
        InterfaceC5925 interfaceC5925Mo9476 = AbstractC5228.f13320.mo9476(AbstractC4940.class);
        try {
            interfaceC5919M9471 = AbstractC5228.m9471(AbstractC4940.class);
        } catch (Throwable unused) {
            interfaceC5919M9471 = null;
        }
        f12823 = new C5041("EngineResponse", new C7686(interfaceC5925Mo9476, interfaceC5919M9471));
    }

    public AbstractC4940(C4915 c4915) {
        this.f12829 = c4915;
        C4890 c4890 = c4915.f12749;
        C4967 c4967 = new C4967(c4890.f12685);
        C4967 c49672 = c4890.f12684;
        c49672.getClass();
        c4967.f13012.clear();
        if (c4967.f13013 != 0) {
            C6755.m11870("Check failed.");
            throw null;
        }
        c4967.m9132(c49672);
        this.f12826 = c4967;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bd A[Catch: all -> 0x00f8, TRY_LEAVE, TryCatch #1 {all -> 0x00f8, blocks: (B:37:0x00b5, B:39:0x00bd), top: B:62:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f2 A[Catch: all -> 0x003d, TryCatch #2 {all -> 0x003d, blocks: (B:14:0x0038, B:43:0x00d6, B:47:0x00ec, B:48:0x00f1, B:49:0x00f2, B:50:0x00f7, B:21:0x0057, B:29:0x007f, B:31:0x008e, B:33:0x0099), top: B:64:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [io.ktor.utils.io.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object m9068(AbstractC4940 abstractC4940, InterfaceC5084 interfaceC5084, ContinuationImpl continuationImpl) {
        BaseApplicationResponse$respondFromChannel$1 baseApplicationResponse$respondFromChannel$1;
        InterfaceC5079 interfaceC5079;
        Long l;
        InterfaceC5079 interfaceC50792;
        AbstractC4940 abstractC49402;
        Long l2;
        InterfaceC5079 interfaceC50793;
        long j;
        long jLongValue;
        long j2;
        if (continuationImpl instanceof BaseApplicationResponse$respondFromChannel$1) {
            baseApplicationResponse$respondFromChannel$1 = (BaseApplicationResponse$respondFromChannel$1) continuationImpl;
            int i = baseApplicationResponse$respondFromChannel$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                baseApplicationResponse$respondFromChannel$1.label = i - Integer.MIN_VALUE;
            } else {
                baseApplicationResponse$respondFromChannel$1 = new BaseApplicationResponse$respondFromChannel$1(abstractC4940, continuationImpl);
            }
        }
        Object objMo9046 = baseApplicationResponse$respondFromChannel$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r2 = baseApplicationResponse$respondFromChannel$1.label;
        try {
            if (r2 == 0) {
                AbstractC6017.m10769(objMo9046);
                baseApplicationResponse$respondFromChannel$1.L$0 = abstractC4940;
                baseApplicationResponse$respondFromChannel$1.L$1 = interfaceC5084;
                baseApplicationResponse$respondFromChannel$1.label = 1;
                objMo9046 = abstractC4940.mo9046(baseApplicationResponse$respondFromChannel$1);
                if (objMo9046 != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (r2 != 1) {
                if (r2 != 2) {
                    if (r2 != 3) {
                        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = baseApplicationResponse$respondFromChannel$1.J$0;
                    l2 = (Long) baseApplicationResponse$respondFromChannel$1.L$2;
                    interfaceC50793 = (InterfaceC5079) baseApplicationResponse$respondFromChannel$1.L$1;
                    abstractC49402 = (AbstractC4940) baseApplicationResponse$respondFromChannel$1.L$0;
                    AbstractC6017.m10769(objMo9046);
                    long jLongValue2 = ((Number) objMo9046).longValue();
                    jLongValue = l2.longValue();
                    j2 = j + jLongValue2;
                    abstractC49402.getClass();
                    if (jLongValue >= j2) {
                        throw new BaseApplicationResponse$BodyLengthIsTooLong(jLongValue);
                    }
                    if (jLongValue > j2) {
                        throw new BaseApplicationResponse$BodyLengthIsTooSmall(jLongValue, j2);
                    }
                    interfaceC50792 = interfaceC50793;
                    AbstractC5076.m9225(interfaceC50792);
                    return C6008.f15084;
                }
                Long l3 = (Long) baseApplicationResponse$respondFromChannel$1.L$3;
                InterfaceC5079 interfaceC50794 = (InterfaceC5079) baseApplicationResponse$respondFromChannel$1.L$2;
                interfaceC5084 = (InterfaceC5084) baseApplicationResponse$respondFromChannel$1.L$1;
                AbstractC4940 abstractC49403 = (AbstractC4940) baseApplicationResponse$respondFromChannel$1.L$0;
                AbstractC6017.m10769(objMo9046);
                interfaceC5079 = interfaceC50794;
                l = l3;
                abstractC4940 = abstractC49403;
                interfaceC50792 = interfaceC5079;
                try {
                    long jLongValue3 = ((Number) objMo9046).longValue();
                    if (l != null) {
                        baseApplicationResponse$respondFromChannel$1.L$0 = abstractC4940;
                        baseApplicationResponse$respondFromChannel$1.L$1 = interfaceC50792;
                        baseApplicationResponse$respondFromChannel$1.L$2 = l;
                        baseApplicationResponse$respondFromChannel$1.L$3 = null;
                        baseApplicationResponse$respondFromChannel$1.J$0 = jLongValue3;
                        baseApplicationResponse$respondFromChannel$1.label = 3;
                        objMo9046 = AbstractC5076.m9240(interfaceC5084, 1L, baseApplicationResponse$respondFromChannel$1);
                        if (objMo9046 != coroutineSingletons) {
                            abstractC49402 = abstractC4940;
                            l2 = l;
                            interfaceC50793 = interfaceC50792;
                            j = jLongValue3;
                            long jLongValue22 = ((Number) objMo9046).longValue();
                            jLongValue = l2.longValue();
                            j2 = j + jLongValue22;
                            abstractC49402.getClass();
                            if (jLongValue >= j2) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    AbstractC5076.m9225(interfaceC50792);
                    return C6008.f15084;
                } catch (Throwable th) {
                    th = th;
                    r2 = interfaceC50792;
                    try {
                        AbstractC5078.m9251(r2, th);
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC5076.m9225(r2);
                        throw th2;
                    }
                }
            }
            interfaceC5084 = (InterfaceC5084) baseApplicationResponse$respondFromChannel$1.L$1;
            abstractC4940 = (AbstractC4940) baseApplicationResponse$respondFromChannel$1.L$0;
            AbstractC6017.m10769(objMo9046);
            InterfaceC5079 interfaceC50795 = (InterfaceC5079) objMo9046;
            C0923 c0923 = ((C4917) abstractC4940).f12760;
            String[] strArr = AbstractC8944.f22758;
            String strM821 = c0923.m821("Content-Length");
            Long l4 = strM821 != null ? new Long(Long.parseLong(strM821)) : null;
            C6248 c6248 = AbstractC6227.f15374;
            BaseApplicationResponse$respondFromChannel$2$copied$1 baseApplicationResponse$respondFromChannel$2$copied$1 = new BaseApplicationResponse$respondFromChannel$2$copied$1(interfaceC5084, interfaceC50795, l4, null);
            baseApplicationResponse$respondFromChannel$1.L$0 = abstractC4940;
            baseApplicationResponse$respondFromChannel$1.L$1 = interfaceC5084;
            baseApplicationResponse$respondFromChannel$1.L$2 = interfaceC50795;
            baseApplicationResponse$respondFromChannel$1.L$3 = l4;
            baseApplicationResponse$respondFromChannel$1.label = 2;
            Object objM11029 = AbstractC6231.m11029(c6248, baseApplicationResponse$respondFromChannel$2$copied$1, baseApplicationResponse$respondFromChannel$1);
            if (objM11029 != coroutineSingletons) {
                interfaceC5079 = interfaceC50795;
                l = l4;
                objMo9046 = objM11029;
                interfaceC50792 = interfaceC5079;
                long jLongValue32 = ((Number) objMo9046).longValue();
                if (l != null) {
                }
                AbstractC5076.m9225(interfaceC50792);
                return C6008.f15084;
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
    
        if (kotlinx.coroutines.AbstractC6231.m11029(r8, r2, r0) == r1) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v0, types: [io.ktor.server.engine.飘花落叶言子楪苏世哲兰] */
    /* JADX WARN: Type inference failed for: r6v1, types: [io.ktor.utils.io.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, kotlin.飘花落叶言子楪兰苏哲世] */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object m9069(AbstractC4940 abstractC4940, AbstractC4827 abstractC4827, ContinuationImpl continuationImpl) {
        BaseApplicationResponse$respondWriteChannelContent$1 baseApplicationResponse$respondWriteChannelContent$1;
        InterfaceC5079 interfaceC5079;
        if (continuationImpl instanceof BaseApplicationResponse$respondWriteChannelContent$1) {
            baseApplicationResponse$respondWriteChannelContent$1 = (BaseApplicationResponse$respondWriteChannelContent$1) continuationImpl;
            int i = baseApplicationResponse$respondWriteChannelContent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                baseApplicationResponse$respondWriteChannelContent$1.label = i - Integer.MIN_VALUE;
            } else {
                baseApplicationResponse$respondWriteChannelContent$1 = new BaseApplicationResponse$respondWriteChannelContent$1(abstractC4940, continuationImpl);
            }
        }
        Object objMo9046 = baseApplicationResponse$respondWriteChannelContent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = baseApplicationResponse$respondWriteChannelContent$1.label;
        try {
            try {
                if (i2 == 0) {
                    AbstractC6017.m10769(objMo9046);
                    baseApplicationResponse$respondWriteChannelContent$1.L$0 = abstractC4827;
                    baseApplicationResponse$respondWriteChannelContent$1.label = 1;
                    objMo9046 = abstractC4940.mo9046(baseApplicationResponse$respondWriteChannelContent$1);
                    if (objMo9046 != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    interfaceC5079 = (InterfaceC5079) baseApplicationResponse$respondWriteChannelContent$1.L$0;
                    AbstractC6017.m10769(objMo9046);
                    AbstractC5076.m9225(interfaceC5079);
                    abstractC4940 = C6008.f15084;
                    return abstractC4940;
                }
                abstractC4827 = (AbstractC4827) baseApplicationResponse$respondWriteChannelContent$1.L$0;
                AbstractC6017.m10769(objMo9046);
                interfaceC5079 = (InterfaceC5079) objMo9046;
                C8036 c8036 = AbstractC6227.f15375;
                ExecutorC8037 executorC8037 = ExecutorC8037.f19570;
                BaseApplicationResponse$respondWriteChannelContent$2$1 baseApplicationResponse$respondWriteChannelContent$2$1 = new BaseApplicationResponse$respondWriteChannelContent$2$1(abstractC4827, interfaceC5079, null);
                baseApplicationResponse$respondWriteChannelContent$1.L$0 = interfaceC5079;
                baseApplicationResponse$respondWriteChannelContent$1.label = 2;
            } catch (IOException e) {
                throw new ChannelWriteException(null, e, 1, null);
            }
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        if (r5.mo9043((io.ktor.server.websocket.C5008) r6, r0) == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0071, code lost:
    
        if (r5.mo9042(r7, r0) == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0086, code lost:
    
        if (m9069(r5, (io.ktor.http.content.AbstractC4827) r6, r0) == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c2, code lost:
    
        if (r5.mo9047(r0) == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d6, code lost:
    
        if (r5.mo9048(r6, r0) == r1) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object m9070(AbstractC4940 abstractC4940, AbstractC4819 abstractC4819, ContinuationImpl continuationImpl) throws Throwable {
        BaseApplicationResponse$respondOutgoingContent$1 baseApplicationResponse$respondOutgoingContent$1;
        InterfaceC5084 interfaceC5084;
        AbstractC4940 abstractC49402;
        if (continuationImpl instanceof BaseApplicationResponse$respondOutgoingContent$1) {
            baseApplicationResponse$respondOutgoingContent$1 = (BaseApplicationResponse$respondOutgoingContent$1) continuationImpl;
            int i = baseApplicationResponse$respondOutgoingContent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                baseApplicationResponse$respondOutgoingContent$1.label = i - Integer.MIN_VALUE;
            } else {
                baseApplicationResponse$respondOutgoingContent$1 = new BaseApplicationResponse$respondOutgoingContent$1(abstractC4940, continuationImpl);
            }
        }
        Object obj = baseApplicationResponse$respondOutgoingContent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (baseApplicationResponse$respondOutgoingContent$1.label) {
            case 0:
                AbstractC6017.m10769(obj);
                if (abstractC4819 instanceof C5008) {
                    abstractC4940.m9071(abstractC4819);
                    baseApplicationResponse$respondOutgoingContent$1.L$0 = abstractC4940;
                    baseApplicationResponse$respondOutgoingContent$1.label = 1;
                } else if (abstractC4819 instanceof AbstractC4828) {
                    byte[] bArrMo8846 = ((AbstractC4828) abstractC4819).mo8846();
                    abstractC4940.m9071(abstractC4819);
                    baseApplicationResponse$respondOutgoingContent$1.L$0 = abstractC4940;
                    baseApplicationResponse$respondOutgoingContent$1.label = 2;
                } else {
                    if (!(abstractC4819 instanceof AbstractC4827)) {
                        if (!(abstractC4819 instanceof AbstractC4826)) {
                            if (abstractC4819 instanceof AbstractC4829) {
                                abstractC4940.m9071(abstractC4819);
                                baseApplicationResponse$respondOutgoingContent$1.L$0 = abstractC4940;
                                baseApplicationResponse$respondOutgoingContent$1.label = 5;
                            } else {
                                if (!(abstractC4819 instanceof C4736)) {
                                    C5043.m9170();
                                    return null;
                                }
                                AbstractC4819 abstractC48192 = ((C4736) abstractC4819).f12453;
                                baseApplicationResponse$respondOutgoingContent$1.L$0 = abstractC4940;
                                baseApplicationResponse$respondOutgoingContent$1.label = 6;
                            }
                            break;
                        } else {
                            InterfaceC5084 interfaceC5084Mo8845 = ((AbstractC4826) abstractC4819).mo8845();
                            try {
                                abstractC4940.m9071(abstractC4819);
                                baseApplicationResponse$respondOutgoingContent$1.L$0 = abstractC4940;
                                baseApplicationResponse$respondOutgoingContent$1.L$1 = interfaceC5084Mo8845;
                                baseApplicationResponse$respondOutgoingContent$1.label = 4;
                                if (m9068(abstractC4940, interfaceC5084Mo8845, baseApplicationResponse$respondOutgoingContent$1) != coroutineSingletons) {
                                    abstractC49402 = abstractC4940;
                                    interfaceC5084 = interfaceC5084Mo8845;
                                    AbstractC5076.m9226(interfaceC5084);
                                    abstractC4940 = abstractC49402;
                                    abstractC4940.f12828 = true;
                                    return C6008.f15084;
                                }
                            } catch (Throwable th) {
                                th = th;
                                interfaceC5084 = interfaceC5084Mo8845;
                                AbstractC5076.m9226(interfaceC5084);
                                throw th;
                            }
                        }
                        return coroutineSingletons;
                    }
                    abstractC4940.m9071(abstractC4819);
                    baseApplicationResponse$respondOutgoingContent$1.L$0 = abstractC4940;
                    baseApplicationResponse$respondOutgoingContent$1.label = 3;
                }
                break;
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
                abstractC4940 = (AbstractC4940) baseApplicationResponse$respondOutgoingContent$1.L$0;
                AbstractC6017.m10769(obj);
                abstractC4940.f12828 = true;
                return C6008.f15084;
            case 4:
                interfaceC5084 = (InterfaceC5084) baseApplicationResponse$respondOutgoingContent$1.L$1;
                abstractC49402 = (AbstractC4940) baseApplicationResponse$respondOutgoingContent$1.L$0;
                try {
                    AbstractC6017.m10769(obj);
                    AbstractC5076.m9226(interfaceC5084);
                    abstractC4940 = abstractC49402;
                    abstractC4940.f12828 = true;
                    return C6008.f15084;
                } catch (Throwable th2) {
                    th = th2;
                    AbstractC5076.m9226(interfaceC5084);
                    throw th;
                }
            default:
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    @Override // io.ktor.server.response.InterfaceC4968
    /* JADX INFO: renamed from: getCookies */
    public final C4965 mo964getCookies() {
        return (C4965) this.f12825.getValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public abstract Object mo9042(byte[] bArr, ContinuationImpl continuationImpl);

    @Override // io.ktor.server.response.InterfaceC4966
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C4967 mo940() {
        return this.f12826;
    }

    @Override // io.ktor.server.response.InterfaceC4968
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final /* bridge */ /* synthetic */ InterfaceC4889 mo941() {
        return this.f12829;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m9071(AbstractC4819 abstractC4819) {
        C8954 c8954Mo8842;
        abstractC4819.getClass();
        if (this.f12824) {
            throw new IllegalStateException() { // from class: io.ktor.server.engine.BaseApplicationResponse$ResponseAlreadySentException
            };
        }
        int i = 1;
        this.f12824 = true;
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        C8926 c8926Mo8839 = abstractC4819.mo8839();
        if (c8926Mo8839 != null) {
            mo958(c8926Mo8839);
        } else if (this.f12827 == null) {
            c8926Mo8839 = C8926.f22696;
            mo958(c8926Mo8839);
        }
        abstractC4819.mo8841().mo8914(new C1819(ref$BooleanRef, abstractC4819, this, i));
        Long lMo8843 = abstractC4819.mo8843();
        if (lMo8843 != null) {
            C4917 c4917 = (C4917) this;
            String[] strArr = AbstractC8944.f22758;
            long jLongValue = lMo8843.longValue();
            String[] strArr2 = AbstractC4936.f12817;
            c4917.f12760.m849("Content-Length", (0 > jLongValue || jLongValue >= 1024) ? String.valueOf(jLongValue) : AbstractC4936.f12817[(int) jLongValue], false);
        } else if (!ref$BooleanRef.element && !(abstractC4819 instanceof C5008)) {
            if (abstractC4819 instanceof AbstractC4829) {
                String[] strArr3 = AbstractC8944.f22758;
                ((C4917) this).f12760.m849("Content-Length", "0", false);
            } else {
                String[] strArr4 = AbstractC8944.f22758;
                ((C4917) this).f12760.m849("Transfer-Encoding", "chunked", false);
            }
        }
        String[] strArr5 = AbstractC8944.f22758;
        C0923 c0923 = ((C4917) this).f12760;
        if (c0923.m821("Content-Type") == null && (c8954Mo8842 = abstractC4819.mo8842()) != null) {
            c0923.m849("Content-Type", c8954Mo8842.toString(), false);
        }
        C4915 c4915 = this.f12829;
        String strMo8915 = c4915.f12746.mo944().mo8915("Connection");
        if (strMo8915 == null || c4915.f12745.f12760.m821("Connection") != null) {
            return;
        }
        if (strMo8915.equalsIgnoreCase("close")) {
            AbstractC3888.m7249(this, "Connection", "close");
        } else if (strMo8915.equalsIgnoreCase("keep-alive")) {
            AbstractC3888.m7249(this, "Connection", "keep-alive");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public abstract Object mo9043(C5008 c5008, ContinuationImpl continuationImpl);

    @Override // io.ktor.server.response.InterfaceC4968
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final boolean mo952() {
        return this.f12824;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public abstract Object mo9046(ContinuationImpl continuationImpl);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public abstract Object mo9047(ContinuationImpl continuationImpl);

    @Override // io.ktor.server.response.InterfaceC4968
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo957() {
        return this.f12828;
    }

    @Override // io.ktor.server.response.InterfaceC4968
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo958(C8926 c8926) {
        c8926.getClass();
        this.f12827 = c8926;
        ((C4917) this).f12757 = c8926;
    }

    @Override // io.ktor.server.response.InterfaceC4968
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final C8926 mo959() {
        return this.f12827;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public abstract Object mo9048(AbstractC4819 abstractC4819, ContinuationImpl continuationImpl);
}
