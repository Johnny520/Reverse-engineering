package io.ktor.websocket;

import com.alibaba.fastjson2.AbstractC3738;
import com.android.p002dx.p005io.Opcodes;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.channels.AbstractC6037;
import kotlinx.coroutines.channels.C6022;
import kotlinx.coroutines.channels.C6023;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.channels.InterfaceC6031;
import kotlinx.coroutines.channels.InterfaceC6032;
import kotlinx.coroutines.channels.InterfaceC6044;
import kotlinx.p010io.AbstractC6310;
import kotlinx.p010io.C6309;
import kotlinx.p010io.InterfaceC6316;
import p068.InterfaceC7383;
import p074.AbstractC7684;
import p079.InterfaceC7691;
import p414.InterfaceC9970;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.websocket.DefaultWebSocketSessionImpl$runIncomingProcessor$1", m556f = "DefaultWebSocketSession.kt", m557l = {377, 183, 236, 189, 190, 192, Opcodes.REM_DOUBLE_2ADDR, Opcodes.OR_INT_LIT8, 236, 236, 236, 236}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class DefaultWebSocketSessionImpl$runIncomingProcessor$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC6032 $ponger;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    final /* synthetic */ C5093 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultWebSocketSessionImpl$runIncomingProcessor$1(C5093 c5093, InterfaceC6032 interfaceC6032, InterfaceC5189<? super DefaultWebSocketSessionImpl$runIncomingProcessor$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c5093;
        this.$ponger = interfaceC6032;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        DefaultWebSocketSessionImpl$runIncomingProcessor$1 defaultWebSocketSessionImpl$runIncomingProcessor$1 = new DefaultWebSocketSessionImpl$runIncomingProcessor$1(this.this$0, this.$ponger, interfaceC5189);
        defaultWebSocketSessionImpl$runIncomingProcessor$1.L$0 = obj;
        return defaultWebSocketSessionImpl$runIncomingProcessor$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((DefaultWebSocketSessionImpl$runIncomingProcessor$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:207:0x0431, code lost:
    
        r25 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0243, code lost:
    
        if (io.ktor.websocket.AbstractC5089.m9273(r0, r4, r27) == r3) goto L187;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0081: MOVE (r4 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:130), block:B:20:0x007f */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0305 A[Catch: all -> 0x0453, TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x0453, blocks: (B:93:0x02d5, B:103:0x0305, B:114:0x0357), top: B:195:0x02d5 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x040b A[Catch: all -> 0x0442, TryCatch #1 {all -> 0x0442, blocks: (B:116:0x03a8, B:126:0x03bd, B:136:0x03fb, B:138:0x040b, B:147:0x0446, B:148:0x0452, B:129:0x03c6, B:130:0x03cb, B:131:0x03cc, B:132:0x03d3, B:133:0x03db, B:135:0x03ec), top: B:192:0x03a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0446 A[Catch: all -> 0x0442, TryCatch #1 {all -> 0x0442, blocks: (B:116:0x03a8, B:126:0x03bd, B:136:0x03fb, B:138:0x040b, B:147:0x0446, B:148:0x0452, B:129:0x03c6, B:130:0x03cb, B:131:0x03cc, B:132:0x03d3, B:133:0x03db, B:135:0x03ec), top: B:192:0x03a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:213:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:215:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a3 A[Catch: all -> 0x0051, TryCatch #6 {all -> 0x0051, blocks: (B:11:0x0047, B:45:0x019b, B:47:0x01a3, B:49:0x01b3, B:50:0x01cf, B:52:0x01d3, B:54:0x01db, B:56:0x01e7, B:57:0x01e9, B:60:0x0208, B:74:0x0256, B:76:0x025a, B:78:0x0260, B:84:0x028c, B:86:0x0290, B:89:0x02ab, B:33:0x011b), top: B:193:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0208 A[Catch: all -> 0x0051, PHI: r2 r4 r12 r15
  0x0208: PHI (r2v29 kotlin.飘花落叶言子楪兰苏哲世) = (r2v0 kotlin.飘花落叶言子楪兰苏哲世), (r2v30 kotlin.飘花落叶言子楪兰苏哲世), (r2v30 kotlin.飘花落叶言子楪兰苏哲世) binds: [B:33:0x011b, B:53:0x01d9, B:58:0x0204] A[DONT_GENERATE, DONT_INLINE]
  0x0208: PHI (r4v43 kotlin.jvm.internal.Ref$ObjectRef) = 
  (r4v19 kotlin.jvm.internal.Ref$ObjectRef)
  (r4v45 kotlin.jvm.internal.Ref$ObjectRef)
  (r4v45 kotlin.jvm.internal.Ref$ObjectRef)
 binds: [B:33:0x011b, B:53:0x01d9, B:58:0x0204] A[DONT_GENERATE, DONT_INLINE]
  0x0208: PHI (r12v21 kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲) = 
  (r12v7 kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲)
  (r12v22 kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲)
  (r12v22 kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲)
 binds: [B:33:0x011b, B:53:0x01d9, B:58:0x0204] A[DONT_GENERATE, DONT_INLINE]
  0x0208: PHI (r15v27 kotlin.jvm.internal.Ref$BooleanRef) = 
  (r15v13 kotlin.jvm.internal.Ref$BooleanRef)
  (r15v28 kotlin.jvm.internal.Ref$BooleanRef)
  (r15v28 kotlin.jvm.internal.Ref$BooleanRef)
 binds: [B:33:0x011b, B:53:0x01d9, B:58:0x0204] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #6 {all -> 0x0051, blocks: (B:11:0x0047, B:45:0x019b, B:47:0x01a3, B:49:0x01b3, B:50:0x01cf, B:52:0x01d3, B:54:0x01db, B:56:0x01e7, B:57:0x01e9, B:60:0x0208, B:74:0x0256, B:76:0x025a, B:78:0x0260, B:84:0x028c, B:86:0x0290, B:89:0x02ab, B:33:0x011b), top: B:193:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02d9 A[Catch: all -> 0x00b5, TRY_ENTER, TryCatch #9 {all -> 0x00b5, blocks: (B:95:0x02d9, B:97:0x02dd, B:98:0x02df, B:100:0x02e3, B:101:0x02ea, B:105:0x0309, B:107:0x0317, B:112:0x034a, B:113:0x0356, B:22:0x00a9), top: B:197:0x00a9 }] */
    /* JADX WARN: Type inference failed for: r0v103 */
    /* JADX WARN: Type inference failed for: r0v105 */
    /* JADX WARN: Type inference failed for: r0v110 */
    /* JADX WARN: Type inference failed for: r0v111 */
    /* JADX WARN: Type inference failed for: r0v112 */
    /* JADX WARN: Type inference failed for: r0v113 */
    /* JADX WARN: Type inference failed for: r0v47, types: [T, io.ktor.websocket.飘花落叶言子楪苏兰哲世, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r0v69 */
    /* JADX WARN: Type inference failed for: r0v74 */
    /* JADX WARN: Type inference failed for: r0v94, types: [java.lang.Object, kotlinx.coroutines.channels.飘花落叶言子楪世哲兰苏] */
    /* JADX WARN: Type inference failed for: r0v95 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r4v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v58 */
    /* JADX WARN: Type inference failed for: r8v13, types: [kotlinx.coroutines.channels.飘花落叶言子楪世兰苏哲, kotlinx.coroutines.channels.飘花落叶言子楪兰苏哲世] */
    /* JADX WARN: Type inference failed for: r8v18, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:102:0x02f8 -> B:144:0x043c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:141:0x042a -> B:142:0x042d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C6008 c6008;
        Ref$ObjectRef ref$ObjectRef;
        Ref$ObjectRef ref$ObjectRef2;
        Ref$BooleanRef ref$BooleanRef;
        InterfaceC6031 interfaceC6031Mo9106;
        Throwable th;
        Ref$ObjectRef ref$ObjectRef3;
        InterfaceC6233 interfaceC6233;
        Ref$ObjectRef ref$ObjectRef4;
        C5093 c5093;
        InterfaceC6032 interfaceC6032;
        InterfaceC6044 interfaceC6044;
        C5093 c50932;
        InterfaceC6233 interfaceC62332;
        Ref$ObjectRef ref$ObjectRef5;
        Object objM10823;
        InterfaceC6032 interfaceC60322;
        Ref$ObjectRef ref$ObjectRef6;
        Ref$ObjectRef ref$ObjectRef7;
        InterfaceC6044 interfaceC60442;
        Ref$ObjectRef ref$ObjectRef8;
        Ref$ObjectRef ref$ObjectRef9;
        C5093 c50933;
        InterfaceC6233 interfaceC62333;
        ?? r13;
        ?? r4;
        ?? r0;
        Object c5091;
        Object c5110;
        Iterator it;
        ?? r02;
        InterfaceC6032 interfaceC60323;
        char c;
        ?? it2;
        C6008 c60082 = C6008.f15084;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = 1;
        CancellationException cancellationException = null;
        try {
            try {
                try {
                } catch (Throwable th2) {
                    th = th2;
                    c6008 = c60082;
                }
            } catch (Throwable th3) {
                th = th3;
                c6008 = c60082;
                ref$ObjectRef2 = ref$ObjectRef;
            }
        } catch (ClosedSendChannelException unused) {
            ref$ObjectRef3 = ref$ObjectRef2;
            this.$ponger.mo8994(null);
            this.this$0.f13139.mo8994(null);
            if (ref$BooleanRef.element) {
            }
        } catch (Throwable th4) {
            th = th4;
            ref$ObjectRef3 = ref$ObjectRef2;
            try {
                this.$ponger.mo8994(null);
                this.this$0.f13139.m10801(th, false);
                this.$ponger.mo8994(null);
                this.this$0.f13139.mo8994(null);
                if (ref$BooleanRef.element) {
                }
            } catch (Throwable th5) {
                this.$ponger.mo8994(null);
                this.this$0.f13139.mo8994(null);
                if (ref$BooleanRef.element) {
                    throw th5;
                }
                C5093 c50934 = this.this$0;
                C5095 c5095 = new C5095(CloseReason$Codes.CLOSED_ABNORMALLY, "Connection was closed without close frame");
                this.L$0 = th5;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = null;
                this.label = 12;
                if (AbstractC5089.m9273(c50934, c5095, this) != coroutineSingletons) {
                    throw th5;
                }
            }
        }
        switch (this.label) {
            case 0:
                AbstractC6017.m10769(obj);
                interfaceC6233 = (InterfaceC6233) this.L$0;
                ref$ObjectRef4 = new Ref$ObjectRef();
                ref$ObjectRef3 = new Ref$ObjectRef();
                ref$BooleanRef = new Ref$BooleanRef();
                try {
                    interfaceC6031Mo9106 = this.this$0.f13140.mo9106();
                    c5093 = this.this$0;
                    interfaceC6032 = this.$ponger;
                    try {
                        it2 = interfaceC6031Mo9106.iterator();
                        this.L$0 = interfaceC6233;
                        this.L$1 = ref$ObjectRef4;
                        this.L$2 = ref$ObjectRef3;
                        this.L$3 = ref$BooleanRef;
                        this.L$4 = c5093;
                        this.L$5 = interfaceC6032;
                        this.L$6 = interfaceC6031Mo9106;
                        this.L$7 = it2;
                        this.L$8 = cancellationException;
                        this.label = i;
                        C6023 c6023 = (C6023) it2;
                        objM10823 = c6023.m10823(this);
                        if (objM10823 != coroutineSingletons) {
                            interfaceC62332 = interfaceC6233;
                            interfaceC6044 = c6023;
                            C5093 c50935 = c5093;
                            ref$ObjectRef5 = ref$ObjectRef4;
                            ref$ObjectRef2 = ref$ObjectRef3;
                            c50932 = c50935;
                            if (((Boolean) objM10823).booleanValue()) {
                                C6008 c60083 = c60082;
                                CancellationException cancellationException2 = cancellationException;
                                interfaceC6031Mo9106.mo10815(cancellationException2);
                                this.$ponger.mo8994(cancellationException2);
                                this.this$0.f13139.mo8994(cancellationException2);
                                if (ref$BooleanRef.element) {
                                    return c60083;
                                }
                                C5093 c50936 = this.this$0;
                                C5095 c50952 = new C5095(CloseReason$Codes.CLOSED_ABNORMALLY, "Connection was closed without close frame");
                                this.L$0 = cancellationException2;
                                this.L$1 = cancellationException2;
                                this.L$2 = cancellationException2;
                                this.L$3 = cancellationException2;
                                this.L$4 = cancellationException2;
                                this.L$5 = cancellationException2;
                                this.L$6 = cancellationException2;
                                this.L$7 = cancellationException2;
                                this.label = 9;
                                if (AbstractC5089.m9273(c50936, c50952, this) != coroutineSingletons) {
                                    return c60083;
                                }
                            } else {
                                r02 = (C6023) interfaceC6044;
                                AbstractC5112 abstractC5112 = (AbstractC5112) r02.m10821();
                                InterfaceC9970 interfaceC9970 = AbstractC5092.f13129;
                                if (AbstractC3738.m6854(interfaceC9970)) {
                                    interfaceC9970.trace("WebSocketSession(" + interfaceC62332 + ") receiving frame " + abstractC5112);
                                }
                                if (!(abstractC5112 instanceof C5110)) {
                                    if (abstractC5112 instanceof C5114) {
                                        InterfaceC6032 interfaceC60324 = (InterfaceC6032) c50932.pinger;
                                        if (interfaceC60324 != null) {
                                            this.L$0 = interfaceC62332;
                                            this.L$1 = ref$ObjectRef5;
                                            this.L$2 = ref$ObjectRef2;
                                            this.L$3 = ref$BooleanRef;
                                            this.L$4 = c50932;
                                            this.L$5 = interfaceC6032;
                                            this.L$6 = interfaceC6031Mo9106;
                                            this.L$7 = r02;
                                            this.label = 4;
                                            if (interfaceC60324.mo8992(abstractC5112, this) == coroutineSingletons) {
                                            }
                                            Ref$ObjectRef ref$ObjectRef10 = ref$ObjectRef5;
                                            ref$ObjectRef6 = ref$ObjectRef2;
                                            interfaceC60322 = interfaceC6032;
                                            ref$ObjectRef7 = ref$ObjectRef10;
                                            r02 = r02;
                                        }
                                        c6008 = c60082;
                                        InterfaceC6233 interfaceC62334 = interfaceC62332;
                                        r13 = r02;
                                        interfaceC6233 = interfaceC62334;
                                        C5093 c50937 = c50932;
                                        ref$ObjectRef3 = ref$ObjectRef2;
                                        ref$ObjectRef4 = ref$ObjectRef5;
                                        c5093 = c50937;
                                        c60082 = c6008;
                                        i = 1;
                                        cancellationException = null;
                                        it2 = r13;
                                        this.L$0 = interfaceC6233;
                                        this.L$1 = ref$ObjectRef4;
                                        this.L$2 = ref$ObjectRef3;
                                        this.L$3 = ref$BooleanRef;
                                        this.L$4 = c5093;
                                        this.L$5 = interfaceC6032;
                                        this.L$6 = interfaceC6031Mo9106;
                                        this.L$7 = it2;
                                        this.L$8 = cancellationException;
                                        this.label = i;
                                        C6023 c60232 = (C6023) it2;
                                        objM10823 = c60232.m10823(this);
                                        if (objM10823 != coroutineSingletons) {
                                        }
                                    } else if (abstractC5112 instanceof C5113) {
                                        this.L$0 = interfaceC62332;
                                        this.L$1 = ref$ObjectRef5;
                                        this.L$2 = ref$ObjectRef2;
                                        this.L$3 = ref$BooleanRef;
                                        this.L$4 = c50932;
                                        this.L$5 = interfaceC6032;
                                        this.L$6 = interfaceC6031Mo9106;
                                        this.L$7 = r02;
                                        this.label = 5;
                                        if (interfaceC6032.mo8992(abstractC5112, this) == coroutineSingletons) {
                                        }
                                        Ref$ObjectRef ref$ObjectRef102 = ref$ObjectRef5;
                                        ref$ObjectRef6 = ref$ObjectRef2;
                                        interfaceC60322 = interfaceC6032;
                                        ref$ObjectRef7 = ref$ObjectRef102;
                                        r02 = r02;
                                    } else {
                                        InterfaceC6316 interfaceC6316 = (InterfaceC6316) ref$ObjectRef2.element;
                                        this.L$0 = interfaceC62332;
                                        this.L$1 = ref$ObjectRef5;
                                        this.L$2 = ref$ObjectRef2;
                                        this.L$3 = ref$BooleanRef;
                                        this.L$4 = c50932;
                                        this.L$5 = interfaceC6032;
                                        this.L$6 = interfaceC6031Mo9106;
                                        this.L$7 = r02;
                                        this.L$8 = abstractC5112;
                                        this.label = 6;
                                        if (C5093.m9275(c50932, interfaceC6316, abstractC5112, this) != coroutineSingletons) {
                                            Ref$ObjectRef ref$ObjectRef11 = ref$ObjectRef2;
                                            r4 = r02;
                                            r0 = abstractC5112;
                                            c50933 = c50932;
                                            ref$ObjectRef9 = ref$ObjectRef5;
                                            interfaceC62333 = interfaceC62332;
                                            ref$ObjectRef8 = ref$ObjectRef11;
                                            try {
                                                if (!r0.f13183) {
                                                    if (ref$ObjectRef9.element == null) {
                                                        ref$ObjectRef9.element = r0;
                                                    }
                                                    if (ref$ObjectRef8.element == null) {
                                                        ref$ObjectRef8.element = new C6309();
                                                    }
                                                    Object obj2 = ref$ObjectRef8.element;
                                                    obj2.getClass();
                                                    byte[] bArr = r0.f13181;
                                                    AbstractC7684.m12642((InterfaceC6316) obj2, bArr, 0, bArr.length);
                                                    Ref$ObjectRef ref$ObjectRef12 = ref$ObjectRef8;
                                                    r13 = r4;
                                                    ref$ObjectRef4 = ref$ObjectRef9;
                                                    ref$ObjectRef3 = ref$ObjectRef12;
                                                    c6008 = c60082;
                                                    interfaceC6233 = interfaceC62333;
                                                    c5093 = c50933;
                                                } else if (ref$ObjectRef9.element == null) {
                                                    ?? r8 = c50933.f13139;
                                                    Iterator it3 = c50933.f13136.iterator();
                                                    if (it3.hasNext()) {
                                                        it3.next().getClass();
                                                        throw new ClassCastException();
                                                    }
                                                    this.L$0 = interfaceC62333;
                                                    this.L$1 = ref$ObjectRef9;
                                                    this.L$2 = ref$ObjectRef8;
                                                    this.L$3 = ref$BooleanRef;
                                                    this.L$4 = c50933;
                                                    this.L$5 = interfaceC6032;
                                                    this.L$6 = interfaceC6031Mo9106;
                                                    this.L$7 = r4;
                                                    this.L$8 = null;
                                                    this.label = 7;
                                                    if (r8.mo8992(r0, this) != coroutineSingletons) {
                                                        Ref$ObjectRef ref$ObjectRef13 = ref$ObjectRef8;
                                                        Ref$ObjectRef ref$ObjectRef14 = ref$ObjectRef9;
                                                        C5093 c50938 = c50933;
                                                        InterfaceC6233 interfaceC62335 = interfaceC62333;
                                                        ?? r03 = r4;
                                                        c5093 = c50938;
                                                        ref$ObjectRef3 = ref$ObjectRef13;
                                                        c6008 = c60082;
                                                        interfaceC6032 = interfaceC6032;
                                                        ref$ObjectRef4 = ref$ObjectRef14;
                                                        r13 = r03;
                                                        interfaceC6233 = interfaceC62335;
                                                    }
                                                } else {
                                                    try {
                                                        Object obj3 = ref$ObjectRef8.element;
                                                        obj3.getClass();
                                                        byte[] bArr2 = r0.f13181;
                                                        AbstractC7684.m12642((InterfaceC6316) obj3, bArr2, 0, bArr2.length);
                                                        Object obj4 = ref$ObjectRef9.element;
                                                        obj4.getClass();
                                                        FrameType frameType = ((AbstractC5112) obj4).f13182;
                                                        Object obj5 = ref$ObjectRef8.element;
                                                        obj5.getClass();
                                                        byte[] bArrM11188 = AbstractC6310.m11188((C6309) ((InterfaceC6316) obj5), -1);
                                                        Object obj6 = ref$ObjectRef9.element;
                                                        obj6.getClass();
                                                        boolean z = ((AbstractC5112) obj6).f13180;
                                                        Object obj7 = ref$ObjectRef9.element;
                                                        obj7.getClass();
                                                        boolean z2 = ((AbstractC5112) obj7).f13179;
                                                        Object obj8 = ref$ObjectRef9.element;
                                                        obj8.getClass();
                                                        boolean z3 = ((AbstractC5112) obj8).f13178;
                                                        C5108 c5108 = C5108.f13176;
                                                        frameType.getClass();
                                                        int i2 = AbstractC5109.f13177[frameType.ordinal()];
                                                        if (i2 == 1) {
                                                            c5091 = new C5091(true, FrameType.BINARY, bArrM11188, z, z2, z3);
                                                        } else if (i2 == 2) {
                                                            c5091 = new C5111(true, FrameType.TEXT, bArrM11188, z, z2, z3);
                                                        } else {
                                                            if (i2 != 3) {
                                                                c = 4;
                                                                if (i2 == 4) {
                                                                    c5110 = new C5113(bArrM11188);
                                                                } else {
                                                                    if (i2 != 5) {
                                                                        throw new NoWhenBranchMatchedException();
                                                                    }
                                                                    c5110 = new C5114(bArrM11188, c5108);
                                                                }
                                                            } else {
                                                                c = 4;
                                                                c5110 = new C5110(bArrM11188);
                                                            }
                                                            ref$ObjectRef9.element = null;
                                                            C6022 c6022 = c50933.f13139;
                                                            it = c50933.f13136.iterator();
                                                            if (!it.hasNext()) {
                                                                it.next().getClass();
                                                                throw new ClassCastException();
                                                            }
                                                            this.L$0 = interfaceC62333;
                                                            this.L$1 = ref$ObjectRef9;
                                                            this.L$2 = ref$ObjectRef8;
                                                            this.L$3 = ref$BooleanRef;
                                                            this.L$4 = c50933;
                                                            this.L$5 = interfaceC6032;
                                                            this.L$6 = interfaceC6031Mo9106;
                                                            this.L$7 = r4;
                                                            this.L$8 = null;
                                                            this.label = 8;
                                                            if (c6022.mo8992(c5110, this) != coroutineSingletons) {
                                                                r02 = r4;
                                                                ref$ObjectRef2 = ref$ObjectRef8;
                                                                interfaceC60323 = interfaceC6032;
                                                                interfaceC6032 = interfaceC60323;
                                                                interfaceC62332 = interfaceC62333;
                                                                ref$ObjectRef5 = ref$ObjectRef9;
                                                                c50932 = c50933;
                                                                InterfaceC6233 interfaceC623342 = interfaceC62332;
                                                                r13 = r02;
                                                                interfaceC6233 = interfaceC623342;
                                                                C5093 c509372 = c50932;
                                                                ref$ObjectRef3 = ref$ObjectRef2;
                                                                ref$ObjectRef4 = ref$ObjectRef5;
                                                                c5093 = c509372;
                                                            }
                                                        }
                                                        c5110 = c5091;
                                                        ref$ObjectRef9.element = null;
                                                        C6022 c60222 = c50933.f13139;
                                                        it = c50933.f13136.iterator();
                                                        if (!it.hasNext()) {
                                                        }
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                        th = th;
                                                        ref$ObjectRef2 = ref$ObjectRef8;
                                                        try {
                                                            throw th;
                                                        } catch (Throwable th7) {
                                                            AbstractC6037.m10837(interfaceC6031Mo9106, th);
                                                            throw th7;
                                                        }
                                                    }
                                                    c6008 = c60082;
                                                }
                                                c60082 = c6008;
                                                i = 1;
                                                cancellationException = null;
                                                it2 = r13;
                                                this.L$0 = interfaceC6233;
                                                this.L$1 = ref$ObjectRef4;
                                                this.L$2 = ref$ObjectRef3;
                                                this.L$3 = ref$BooleanRef;
                                                this.L$4 = c5093;
                                                this.L$5 = interfaceC6032;
                                                this.L$6 = interfaceC6031Mo9106;
                                                this.L$7 = it2;
                                                this.L$8 = cancellationException;
                                                this.label = i;
                                                C6023 c602322 = (C6023) it2;
                                                objM10823 = c602322.m10823(this);
                                                if (objM10823 != coroutineSingletons) {
                                                }
                                            } catch (Throwable th8) {
                                                th = th8;
                                                c6008 = c60082;
                                            }
                                        }
                                    }
                                    Ref$ObjectRef ref$ObjectRef15 = ref$ObjectRef7;
                                    interfaceC6032 = interfaceC60322;
                                    ref$ObjectRef2 = ref$ObjectRef6;
                                    ref$ObjectRef5 = ref$ObjectRef15;
                                    c6008 = c60082;
                                    InterfaceC6233 interfaceC6233422 = interfaceC62332;
                                    r13 = r02;
                                    interfaceC6233 = interfaceC6233422;
                                    C5093 c5093722 = c50932;
                                    ref$ObjectRef3 = ref$ObjectRef2;
                                    ref$ObjectRef4 = ref$ObjectRef5;
                                    c5093 = c5093722;
                                    c60082 = c6008;
                                    i = 1;
                                    cancellationException = null;
                                    it2 = r13;
                                    this.L$0 = interfaceC6233;
                                    this.L$1 = ref$ObjectRef4;
                                    this.L$2 = ref$ObjectRef3;
                                    this.L$3 = ref$BooleanRef;
                                    this.L$4 = c5093;
                                    this.L$5 = interfaceC6032;
                                    this.L$6 = interfaceC6031Mo9106;
                                    this.L$7 = it2;
                                    this.L$8 = cancellationException;
                                    this.label = i;
                                    C6023 c6023222 = (C6023) it2;
                                    objM10823 = c6023222.m10823(this);
                                    if (objM10823 != coroutineSingletons) {
                                    }
                                } else if (!c50932.f13135.m10800()) {
                                    C6022 c60223 = c50932.f13135;
                                    C5095 c5095M9270 = AbstractC5089.m9270((C5110) abstractC5112);
                                    if (c5095M9270 == null) {
                                        c5095M9270 = AbstractC5092.f13126;
                                    }
                                    C5110 c51102 = new C5110(c5095M9270);
                                    this.L$0 = ref$ObjectRef2;
                                    this.L$1 = ref$BooleanRef;
                                    this.L$2 = interfaceC6031Mo9106;
                                    this.L$3 = null;
                                    this.L$4 = null;
                                    this.L$5 = null;
                                    this.L$6 = null;
                                    this.L$7 = null;
                                    this.label = 2;
                                    if (c60223.mo8992(c51102, this) != coroutineSingletons) {
                                        ref$BooleanRef.element = true;
                                        try {
                                            interfaceC6031Mo9106.mo10815(null);
                                            this.$ponger.mo8994(null);
                                            this.this$0.f13139.mo8994(null);
                                            if (!ref$BooleanRef.element) {
                                                C5093 c50939 = this.this$0;
                                                C5095 c50953 = new C5095(CloseReason$Codes.CLOSED_ABNORMALLY, "Connection was closed without close frame");
                                                this.L$0 = c60082;
                                                this.L$1 = null;
                                                this.L$2 = null;
                                                this.L$3 = null;
                                                this.L$4 = null;
                                                this.L$5 = null;
                                                this.L$6 = null;
                                                this.L$7 = null;
                                                this.label = 3;
                                                break;
                                            }
                                            return c60082;
                                        } catch (ClosedSendChannelException unused2) {
                                            c6008 = c60082;
                                            ref$ObjectRef3 = ref$ObjectRef2;
                                            this.$ponger.mo8994(null);
                                            this.this$0.f13139.mo8994(null);
                                            if (ref$BooleanRef.element) {
                                            }
                                        } catch (Throwable th9) {
                                            th = th9;
                                            c6008 = c60082;
                                            ref$ObjectRef3 = ref$ObjectRef2;
                                            this.$ponger.mo8994(null);
                                            this.this$0.f13139.m10801(th, false);
                                            this.$ponger.mo8994(null);
                                            this.this$0.f13139.mo8994(null);
                                            if (ref$BooleanRef.element) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable th10) {
                        c6008 = c60082;
                        th = th10;
                        ref$ObjectRef2 = ref$ObjectRef3;
                        throw th;
                    }
                } catch (ClosedSendChannelException unused3) {
                    c6008 = c60082;
                    this.$ponger.mo8994(null);
                    this.this$0.f13139.mo8994(null);
                    if (ref$BooleanRef.element) {
                        return c6008;
                    }
                    C5093 c509310 = this.this$0;
                    C5095 c50954 = new C5095(CloseReason$Codes.CLOSED_ABNORMALLY, "Connection was closed without close frame");
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.L$8 = null;
                    this.label = 10;
                    if (AbstractC5089.m9273(c509310, c50954, this) != coroutineSingletons) {
                        return c6008;
                    }
                } catch (Throwable th11) {
                    th = th11;
                    c6008 = c60082;
                    this.$ponger.mo8994(null);
                    this.this$0.f13139.m10801(th, false);
                    this.$ponger.mo8994(null);
                    this.this$0.f13139.mo8994(null);
                    if (ref$BooleanRef.element) {
                        return c6008;
                    }
                    C5093 c509311 = this.this$0;
                    C5095 c50955 = new C5095(CloseReason$Codes.CLOSED_ABNORMALLY, "Connection was closed without close frame");
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.L$8 = null;
                    this.label = 11;
                    if (AbstractC5089.m9273(c509311, c50955, this) != coroutineSingletons) {
                        return c6008;
                    }
                }
                return coroutineSingletons;
            case 1:
                interfaceC6044 = (InterfaceC6044) this.L$7;
                interfaceC6031Mo9106 = (InterfaceC6031) this.L$6;
                InterfaceC6032 interfaceC60325 = (InterfaceC6032) this.L$5;
                c50932 = (C5093) this.L$4;
                ref$BooleanRef = (Ref$BooleanRef) this.L$3;
                Ref$ObjectRef ref$ObjectRef16 = (Ref$ObjectRef) this.L$2;
                Ref$ObjectRef ref$ObjectRef17 = (Ref$ObjectRef) this.L$1;
                interfaceC62332 = (InterfaceC6233) this.L$0;
                AbstractC6017.m10769(obj);
                interfaceC6032 = interfaceC60325;
                ref$ObjectRef2 = ref$ObjectRef16;
                ref$ObjectRef5 = ref$ObjectRef17;
                objM10823 = obj;
                if (((Boolean) objM10823).booleanValue()) {
                }
                return coroutineSingletons;
            case 2:
                interfaceC6031Mo9106 = (InterfaceC6031) this.L$2;
                ref$BooleanRef = (Ref$BooleanRef) this.L$1;
                ref$ObjectRef2 = (Ref$ObjectRef) this.L$0;
                AbstractC6017.m10769(obj);
                ref$BooleanRef.element = true;
                interfaceC6031Mo9106.mo10815(null);
                this.$ponger.mo8994(null);
                this.this$0.f13139.mo8994(null);
                if (!ref$BooleanRef.element) {
                }
                return c60082;
            case 3:
                C6008 c60084 = (C6008) this.L$0;
                AbstractC6017.m10769(obj);
                return c60084;
            case 4:
                InterfaceC6044 interfaceC60443 = (InterfaceC6044) this.L$7;
                interfaceC6031Mo9106 = (InterfaceC6031) this.L$6;
                interfaceC60322 = (InterfaceC6032) this.L$5;
                c50932 = (C5093) this.L$4;
                ref$BooleanRef = (Ref$BooleanRef) this.L$3;
                ref$ObjectRef6 = (Ref$ObjectRef) this.L$2;
                ref$ObjectRef7 = (Ref$ObjectRef) this.L$1;
                interfaceC62332 = (InterfaceC6233) this.L$0;
                interfaceC60442 = interfaceC60443;
                AbstractC6017.m10769(obj);
                r02 = interfaceC60442;
                Ref$ObjectRef ref$ObjectRef152 = ref$ObjectRef7;
                interfaceC6032 = interfaceC60322;
                ref$ObjectRef2 = ref$ObjectRef6;
                ref$ObjectRef5 = ref$ObjectRef152;
                c6008 = c60082;
                InterfaceC6233 interfaceC62334222 = interfaceC62332;
                r13 = r02;
                interfaceC6233 = interfaceC62334222;
                C5093 c50937222 = c50932;
                ref$ObjectRef3 = ref$ObjectRef2;
                ref$ObjectRef4 = ref$ObjectRef5;
                c5093 = c50937222;
                c60082 = c6008;
                i = 1;
                cancellationException = null;
                it2 = r13;
                this.L$0 = interfaceC6233;
                this.L$1 = ref$ObjectRef4;
                this.L$2 = ref$ObjectRef3;
                this.L$3 = ref$BooleanRef;
                this.L$4 = c5093;
                this.L$5 = interfaceC6032;
                this.L$6 = interfaceC6031Mo9106;
                this.L$7 = it2;
                this.L$8 = cancellationException;
                this.label = i;
                C6023 c60232222 = (C6023) it2;
                objM10823 = c60232222.m10823(this);
                if (objM10823 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 5:
                InterfaceC6044 interfaceC60444 = (InterfaceC6044) this.L$7;
                interfaceC6031Mo9106 = (InterfaceC6031) this.L$6;
                interfaceC60322 = (InterfaceC6032) this.L$5;
                c50932 = (C5093) this.L$4;
                ref$BooleanRef = (Ref$BooleanRef) this.L$3;
                ref$ObjectRef6 = (Ref$ObjectRef) this.L$2;
                ref$ObjectRef7 = (Ref$ObjectRef) this.L$1;
                interfaceC62332 = (InterfaceC6233) this.L$0;
                interfaceC60442 = interfaceC60444;
                AbstractC6017.m10769(obj);
                r02 = interfaceC60442;
                Ref$ObjectRef ref$ObjectRef1522 = ref$ObjectRef7;
                interfaceC6032 = interfaceC60322;
                ref$ObjectRef2 = ref$ObjectRef6;
                ref$ObjectRef5 = ref$ObjectRef1522;
                c6008 = c60082;
                InterfaceC6233 interfaceC623342222 = interfaceC62332;
                r13 = r02;
                interfaceC6233 = interfaceC623342222;
                C5093 c509372222 = c50932;
                ref$ObjectRef3 = ref$ObjectRef2;
                ref$ObjectRef4 = ref$ObjectRef5;
                c5093 = c509372222;
                c60082 = c6008;
                i = 1;
                cancellationException = null;
                it2 = r13;
                this.L$0 = interfaceC6233;
                this.L$1 = ref$ObjectRef4;
                this.L$2 = ref$ObjectRef3;
                this.L$3 = ref$BooleanRef;
                this.L$4 = c5093;
                this.L$5 = interfaceC6032;
                this.L$6 = interfaceC6031Mo9106;
                this.L$7 = it2;
                this.L$8 = cancellationException;
                this.label = i;
                C6023 c602322222 = (C6023) it2;
                objM10823 = c602322222.m10823(this);
                if (objM10823 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 6:
                AbstractC5112 abstractC51122 = (AbstractC5112) this.L$8;
                InterfaceC6044 interfaceC60445 = (InterfaceC6044) this.L$7;
                interfaceC6031Mo9106 = (InterfaceC6031) this.L$6;
                InterfaceC6032 interfaceC60326 = (InterfaceC6032) this.L$5;
                C5093 c509312 = (C5093) this.L$4;
                ref$BooleanRef = (Ref$BooleanRef) this.L$3;
                ref$ObjectRef8 = (Ref$ObjectRef) this.L$2;
                Ref$ObjectRef ref$ObjectRef18 = (Ref$ObjectRef) this.L$1;
                InterfaceC6233 interfaceC62336 = (InterfaceC6233) this.L$0;
                try {
                    AbstractC6017.m10769(obj);
                    interfaceC6032 = interfaceC60326;
                    ref$ObjectRef9 = ref$ObjectRef18;
                    c50933 = c509312;
                    interfaceC62333 = interfaceC62336;
                    r0 = abstractC51122;
                    r4 = interfaceC60445;
                    if (!r0.f13183) {
                    }
                    c60082 = c6008;
                    i = 1;
                    cancellationException = null;
                    it2 = r13;
                    this.L$0 = interfaceC6233;
                    this.L$1 = ref$ObjectRef4;
                    this.L$2 = ref$ObjectRef3;
                    this.L$3 = ref$BooleanRef;
                    this.L$4 = c5093;
                    this.L$5 = interfaceC6032;
                    this.L$6 = interfaceC6031Mo9106;
                    this.L$7 = it2;
                    this.L$8 = cancellationException;
                    this.label = i;
                    C6023 c6023222222 = (C6023) it2;
                    objM10823 = c6023222222.m10823(this);
                    if (objM10823 != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                } catch (Throwable th12) {
                    th = th12;
                    c6008 = c60082;
                    ref$ObjectRef2 = ref$ObjectRef8;
                    th = th;
                    throw th;
                }
            case 7:
                InterfaceC6044 interfaceC60446 = (InterfaceC6044) this.L$7;
                interfaceC6031Mo9106 = (InterfaceC6031) this.L$6;
                InterfaceC6032 interfaceC60327 = (InterfaceC6032) this.L$5;
                C5093 c509313 = (C5093) this.L$4;
                ref$BooleanRef = (Ref$BooleanRef) this.L$3;
                Ref$ObjectRef ref$ObjectRef19 = (Ref$ObjectRef) this.L$2;
                Ref$ObjectRef ref$ObjectRef20 = (Ref$ObjectRef) this.L$1;
                InterfaceC6233 interfaceC62337 = (InterfaceC6233) this.L$0;
                AbstractC6017.m10769(obj);
                c5093 = c509313;
                ref$ObjectRef3 = ref$ObjectRef19;
                c6008 = c60082;
                interfaceC6032 = interfaceC60327;
                ref$ObjectRef4 = ref$ObjectRef20;
                r13 = interfaceC60446;
                interfaceC6233 = interfaceC62337;
                c60082 = c6008;
                i = 1;
                cancellationException = null;
                it2 = r13;
                this.L$0 = interfaceC6233;
                this.L$1 = ref$ObjectRef4;
                this.L$2 = ref$ObjectRef3;
                this.L$3 = ref$BooleanRef;
                this.L$4 = c5093;
                this.L$5 = interfaceC6032;
                this.L$6 = interfaceC6031Mo9106;
                this.L$7 = it2;
                this.L$8 = cancellationException;
                this.label = i;
                C6023 c60232222222 = (C6023) it2;
                objM10823 = c60232222222.m10823(this);
                if (objM10823 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 8:
                InterfaceC6044 interfaceC60447 = (InterfaceC6044) this.L$7;
                interfaceC6031Mo9106 = (InterfaceC6031) this.L$6;
                interfaceC60323 = (InterfaceC6032) this.L$5;
                c50933 = (C5093) this.L$4;
                ref$BooleanRef = (Ref$BooleanRef) this.L$3;
                ref$ObjectRef2 = (Ref$ObjectRef) this.L$2;
                ref$ObjectRef9 = (Ref$ObjectRef) this.L$1;
                interfaceC62333 = (InterfaceC6233) this.L$0;
                AbstractC6017.m10769(obj);
                c6008 = c60082;
                r02 = interfaceC60447;
                interfaceC6032 = interfaceC60323;
                interfaceC62332 = interfaceC62333;
                ref$ObjectRef5 = ref$ObjectRef9;
                c50932 = c50933;
                InterfaceC6233 interfaceC6233422222 = interfaceC62332;
                r13 = r02;
                interfaceC6233 = interfaceC6233422222;
                C5093 c5093722222 = c50932;
                ref$ObjectRef3 = ref$ObjectRef2;
                ref$ObjectRef4 = ref$ObjectRef5;
                c5093 = c5093722222;
                c60082 = c6008;
                i = 1;
                cancellationException = null;
                it2 = r13;
                this.L$0 = interfaceC6233;
                this.L$1 = ref$ObjectRef4;
                this.L$2 = ref$ObjectRef3;
                this.L$3 = ref$BooleanRef;
                this.L$4 = c5093;
                this.L$5 = interfaceC6032;
                this.L$6 = interfaceC6031Mo9106;
                this.L$7 = it2;
                this.L$8 = cancellationException;
                this.label = i;
                C6023 c602322222222 = (C6023) it2;
                objM10823 = c602322222222.m10823(this);
                if (objM10823 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 9:
                AbstractC6017.m10769(obj);
                return c60082;
            case 10:
            case 11:
                AbstractC6017.m10769(obj);
                return c60082;
            case 12:
                Throwable th13 = (Throwable) this.L$0;
                AbstractC6017.m10769(obj);
                throw th13;
            default:
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
