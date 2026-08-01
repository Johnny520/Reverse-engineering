package kotlinx.coroutines.debug.internal;

/* JADX INFO: compiled from: DebugProbesImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\bÀ\u0002\u0018\u00002\u00020\u0014:\u0002\u0095\u0001B\t\b\u0002¢\u0006\u0004\b\u0001\u0010\u0002J3\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0015\u0010\u0016J@\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\b\b\u0000\u0010\u0017*\u00020\u00142\u001e\b\u0004\u0010\u001b\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00028\u00000\u0018H\u0082\b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001e\u0010\u000eJ\u0013\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u000f¢\u0006\u0004\b \u0010\u0012J)\u0010$\u001a\b\u0012\u0004\u0012\u00020\"0\u000f2\u0006\u0010!\u001a\u00020\u00102\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u000f¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020&2\u0006\u0010!\u001a\u00020\u0010¢\u0006\u0004\b'\u0010(J5\u0010,\u001a\b\u0012\u0004\u0012\u00020\"0\u000f2\u0006\u0010)\u001a\u00020&2\b\u0010+\u001a\u0004\u0018\u00010*2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u000fH\u0002¢\u0006\u0004\b,\u0010-J?\u00102\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020.012\u0006\u0010/\u001a\u00020.2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\"0\u00132\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u000fH\u0002¢\u0006\u0004\b2\u00103J3\u00105\u001a\u00020.2\u0006\u00104\u001a\u00020.2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\"0\u00132\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u000fH\u0002¢\u0006\u0004\b5\u00106J\u001d\u00109\u001a\u0010\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\f\u0018\u000107H\u0002¢\u0006\u0004\b9\u0010:J\u0015\u0010=\u001a\u00020&2\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020\f¢\u0006\u0004\b?\u0010\u0002J%\u0010A\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\"0\u000fH\u0002¢\u0006\u0004\bA\u0010BJ\u001b\u0010D\u001a\u00020\f2\n\u0010C\u001a\u0006\u0012\u0002\b\u00030\u0019H\u0002¢\u0006\u0004\bD\u0010EJ)\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0000¢\u0006\u0004\bF\u0010GJ\u001b\u0010K\u001a\u00020\f2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0000¢\u0006\u0004\bI\u0010JJ\u001b\u0010M\u001a\u00020\f2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0000¢\u0006\u0004\bL\u0010JJ'\u0010P\u001a\b\u0012\u0004\u0012\u00020\"0\u000f\"\b\b\u0000\u0010\u0003*\u00020N2\u0006\u0010O\u001a\u00028\u0000H\u0002¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020\fH\u0002¢\u0006\u0004\bR\u0010\u0002J\u000f\u0010S\u001a\u00020\fH\u0002¢\u0006\u0004\bS\u0010\u0002J\r\u0010T\u001a\u00020\f¢\u0006\u0004\bT\u0010\u0002J\u001f\u0010V\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020U2\u0006\u0010)\u001a\u00020&H\u0002¢\u0006\u0004\bV\u0010WJ#\u0010X\u001a\u00020\f2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010)\u001a\u00020&H\u0002¢\u0006\u0004\bX\u0010YJ/\u0010X\u001a\u00020\f2\n\u0010C\u001a\u0006\u0012\u0002\b\u00030\u00192\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010)\u001a\u00020&H\u0002¢\u0006\u0004\bX\u0010ZJ;\u0010b\u001a\u00020\f*\u00020;2\u0012\u0010]\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\\0[2\n\u0010`\u001a\u00060^j\u0002`_2\u0006\u0010a\u001a\u00020&H\u0002¢\u0006\u0004\bb\u0010cJ\u0017\u0010d\u001a\u000208*\u0006\u0012\u0002\b\u00030\u0019H\u0002¢\u0006\u0004\bd\u0010eJ\u001d\u0010C\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0019*\u0006\u0012\u0002\b\u00030\u0004H\u0002¢\u0006\u0004\bC\u0010fJ\u001a\u0010C\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0019*\u00020UH\u0082\u0010¢\u0006\u0004\bC\u0010gJ\u0016\u0010h\u001a\u0004\u0018\u00010U*\u00020UH\u0082\u0010¢\u0006\u0004\bh\u0010iJ\u001b\u0010j\u001a\u0004\u0018\u00010\u0006*\b\u0012\u0004\u0012\u00020\"0\u000fH\u0002¢\u0006\u0004\bj\u0010kJ\u0013\u0010l\u001a\u00020&*\u00020\u0014H\u0002¢\u0006\u0004\bl\u0010mR\u0014\u0010n\u001a\u00020&8\u0002X\u0082T¢\u0006\u0006\n\u0004\bn\u0010oR \u0010q\u001a\u000e\u0012\u0004\u0012\u00020U\u0012\u0004\u0012\u00020\\0p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u001e\u0010v\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00190s8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bt\u0010uR$\u0010w\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0019\u0012\u0004\u0012\u0002080p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010rR\u0014\u0010y\u001a\u00020x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0014\u0010|\u001a\u00020{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}R\"\u0010~\u001a\u0010\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\f\u0018\u0001078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR)\u0010\u0080\u0001\u001a\u0002088\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0019\u0010\u0086\u0001\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0017\u0010\u0089\u0001\u001a\u0002088@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0088\u0001\u0010\u0083\u0001R)\u0010\u008a\u0001\u001a\u0002088\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008a\u0001\u0010\u0081\u0001\u001a\u0006\b\u008b\u0001\u0010\u0083\u0001\"\u0006\b\u008c\u0001\u0010\u0085\u0001R\u001b\u0010\u008d\u0001\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\"\u0010\u0092\u0001\u001a\u00020&*\u00020;8BX\u0082\u0004¢\u0006\u000f\u0012\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0005\b\u008f\u0001\u0010>R\u001b\u0010\u0093\u0001\u001a\u000208*\u00020\"8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001¨\u0006\u0096\u0001"}, m115d2 = {"Lkotlinx/coroutines/debug/internal/DebugProbesImpl;", "<init>", "()V", "T", "Lkotlin/coroutines/Continuation;", "completion", "Lkotlinx/coroutines/debug/internal/StackTraceFrame;", "frame", "createOwner", "(Lkotlin/coroutines/Continuation;Lkotlinx/coroutines/debug/internal/StackTraceFrame;)Lkotlin/coroutines/Continuation;", "Ljava/io/PrintStream;", "out", "", "dumpCoroutines", "(Ljava/io/PrintStream;)V", "", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfo;", "dumpCoroutinesInfo", "()Ljava/util/List;", "", "", "dumpCoroutinesInfoAsJsonAndReferences", "()[Ljava/lang/Object;", "R", "Lkotlin/Function2;", "Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;", "Lkotlin/coroutines/CoroutineContext;", "create", "dumpCoroutinesInfoImpl", "(Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "dumpCoroutinesSynchronized", "Lkotlinx/coroutines/debug/internal/DebuggerInfo;", "dumpDebuggerInfo", "info", "Ljava/lang/StackTraceElement;", "coroutineTrace", "enhanceStackTraceWithThreadDump", "(Lkotlinx/coroutines/debug/internal/DebugCoroutineInfo;Ljava/util/List;)Ljava/util/List;", "", "enhanceStackTraceWithThreadDumpAsJson", "(Lkotlinx/coroutines/debug/internal/DebugCoroutineInfo;)Ljava/lang/String;", "state", "Ljava/lang/Thread;", "thread", "enhanceStackTraceWithThreadDumpImpl", "(Ljava/lang/String;Ljava/lang/Thread;Ljava/util/List;)Ljava/util/List;", "", "indexOfResumeWith", "actualTrace", "Lkotlin/Pair;", "findContinuationStartIndex", "(I[Ljava/lang/StackTraceElement;Ljava/util/List;)Lkotlin/Pair;", "frameIndex", "findIndexOfFrame", "(I[Ljava/lang/StackTraceElement;Ljava/util/List;)I", "Lkotlin/Function1;", "", "getDynamicAttach", "()Lkotlin/jvm/functions/Function1;", "Lkotlinx/coroutines/Job;", "job", "hierarchyToString", "(Lkotlinx/coroutines/Job;)Ljava/lang/String;", "install", "frames", "printStackTrace", "(Ljava/io/PrintStream;Ljava/util/List;)V", "owner", "probeCoroutineCompleted", "(Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;)V", "probeCoroutineCreated$kotlinx_coroutines_core", "(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "probeCoroutineCreated", "probeCoroutineResumed$kotlinx_coroutines_core", "(Lkotlin/coroutines/Continuation;)V", "probeCoroutineResumed", "probeCoroutineSuspended$kotlinx_coroutines_core", "probeCoroutineSuspended", "", "throwable", "sanitizeStackTrace", "(Ljava/lang/Throwable;)Ljava/util/List;", "startWeakRefCleanerThread", "stopWeakRefCleanerThread", "uninstall", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "updateRunningState", "(Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;Ljava/lang/String;)V", "updateState", "(Lkotlin/coroutines/Continuation;Ljava/lang/String;)V", "(Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;Lkotlin/coroutines/Continuation;Ljava/lang/String;)V", "", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", "map", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "indent", "build", "(Lkotlinx/coroutines/Job;Ljava/util/Map;Ljava/lang/StringBuilder;Ljava/lang/String;)V", "isFinished", "(Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;)Z", "(Lkotlin/coroutines/Continuation;)Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;", "(Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;", "realCaller", "(Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "toStackTraceFrame", "(Ljava/util/List;)Lkotlinx/coroutines/debug/internal/StackTraceFrame;", "toStringWithQuotes", "(Ljava/lang/Object;)Ljava/lang/String;", "ARTIFICIAL_FRAME_MESSAGE", "Ljava/lang/String;", "Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;", "callerInfoCache", "Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;", "", "getCapturedCoroutines", "()Ljava/util/Set;", "capturedCoroutines", "capturedCoroutinesMap", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "coroutineStateLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "Ljava/text/SimpleDateFormat;", "dateFormat", "Ljava/text/SimpleDateFormat;", "dynamicAttach", "Lkotlin/jvm/functions/Function1;", "enableCreationStackTraces", "Z", "getEnableCreationStackTraces", "()Z", "setEnableCreationStackTraces", "(Z)V", "installations", "I", "isInstalled$kotlinx_coroutines_core", "isInstalled", "sanitizeStackTraces", "getSanitizeStackTraces", "setSanitizeStackTraces", "weakRefCleanerThread", "Ljava/lang/Thread;", "getDebugString", "getDebugString$annotations", "(Lkotlinx/coroutines/Job;)V", "debugString", "isInternalMethod", "(Ljava/lang/StackTraceElement;)Z", "CoroutineOwner", "kotlinx-coroutines-core"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
public final class DebugProbesImpl {
    private static final java.lang.String ARTIFICIAL_FRAME_MESSAGE = "Coroutine creation stacktrace";
    public static final kotlinx.coroutines.debug.internal.DebugProbesImpl INSTANCE = null;
    private static final kotlinx.coroutines.debug.internal.ConcurrentWeakMap<kotlin.coroutines.jvm.internal.CoroutineStackFrame, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl> callerInfoCache = null;
    private static final kotlinx.coroutines.debug.internal.ConcurrentWeakMap<kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?>, java.lang.Boolean> capturedCoroutinesMap = null;
    private static final java.util.concurrent.locks.ReentrantReadWriteLock coroutineStateLock = null;
    private static final java.text.SimpleDateFormat dateFormat = null;
    private static final /* synthetic */ kotlinx.coroutines.debug.internal.DebugProbesImpl.SequenceNumberRefVolatile debugProbesImpl$SequenceNumberRefVolatile = null;
    private static final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> dynamicAttach = null;
    private static boolean enableCreationStackTraces;
    private static volatile int installations;
    private static boolean sanitizeStackTraces;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater sequenceNumber$FU = null;
    private static java.lang.Thread weakRefCleanerThread;

    /* JADX INFO: compiled from: DebugProbesImpl.kt */
    @kotlin.Metadata(m114d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\n\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001e\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016ø\u0001\u0000¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, m115d2 = {"Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;", "T", "Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "delegate", "info", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", "frame", "(Lkotlin/coroutines/Continuation;Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)V", "callerFrame", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "getStackTraceElement", "Ljava/lang/StackTraceElement;", "resumeWith", "", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "toString", "", "kotlinx-coroutines-core"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
    private static final class CoroutineOwner<T> implements kotlin.coroutines.Continuation<T>, kotlin.coroutines.jvm.internal.CoroutineStackFrame {
        public final kotlin.coroutines.Continuation<T> delegate;
        private final kotlin.coroutines.jvm.internal.CoroutineStackFrame frame;
        public final kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl info;

        public CoroutineOwner(kotlin.coroutines.Continuation<? super T> r1, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r2, kotlin.coroutines.jvm.internal.CoroutineStackFrame r3) {
                r0 = this;
                r0.<init>()
                r0.delegate = r1
                r0.info = r2
                r0.frame = r3
                return
        }

        @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
        public kotlin.coroutines.jvm.internal.CoroutineStackFrame getCallerFrame() {
                r1 = this;
                kotlin.coroutines.jvm.internal.CoroutineStackFrame r0 = r1.frame
                if (r0 != 0) goto L6
                r0 = 0
                goto La
            L6:
                kotlin.coroutines.jvm.internal.CoroutineStackFrame r0 = r0.getCallerFrame()
            La:
                return r0
        }

        @Override // kotlin.coroutines.Continuation
        public kotlin.coroutines.CoroutineContext getContext() {
                r1 = this;
                kotlin.coroutines.Continuation<T> r0 = r1.delegate
                kotlin.coroutines.CoroutineContext r0 = r0.getContext()
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
        public java.lang.StackTraceElement getStackTraceElement() {
                r1 = this;
                kotlin.coroutines.jvm.internal.CoroutineStackFrame r0 = r1.frame
                if (r0 != 0) goto L6
                r0 = 0
                goto La
            L6:
                java.lang.StackTraceElement r0 = r0.getStackTraceElement()
            La:
                return r0
        }

        @Override // kotlin.coroutines.Continuation
        public void resumeWith(java.lang.Object r2) {
                r1 = this;
                kotlinx.coroutines.debug.internal.DebugProbesImpl r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE
                kotlinx.coroutines.debug.internal.DebugProbesImpl.access$probeCoroutineCompleted(r0, r1)
                kotlin.coroutines.Continuation<T> r0 = r1.delegate
                r0.resumeWith(r2)
                return
        }

        public java.lang.String toString() {
                r1 = this;
                kotlin.coroutines.Continuation<T> r0 = r1.delegate
                java.lang.String r0 = r0.toString()
                return r0
        }
    }



    static {
            kotlinx.coroutines.debug.internal.DebugProbesImpl r0 = new kotlinx.coroutines.debug.internal.DebugProbesImpl
            r0.<init>()
            kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE = r0
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy/MM/dd HH:mm:ss"
            r0.<init>(r1)
            kotlinx.coroutines.debug.internal.DebugProbesImpl.dateFormat = r0
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap r0 = new kotlinx.coroutines.debug.internal.ConcurrentWeakMap
            r1 = 0
            r2 = 0
            r3 = 1
            r0.<init>(r2, r3, r1)
            kotlinx.coroutines.debug.internal.DebugProbesImpl.capturedCoroutinesMap = r0
            kotlinx.coroutines.debug.internal.DebugProbesImpl$SequenceNumberRefVolatile r0 = new kotlinx.coroutines.debug.internal.DebugProbesImpl$SequenceNumberRefVolatile
            r1 = 0
            r0.<init>(r1)
            kotlinx.coroutines.debug.internal.DebugProbesImpl.debugProbesImpl$SequenceNumberRefVolatile = r0
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = new java.util.concurrent.locks.ReentrantReadWriteLock
            r0.<init>()
            kotlinx.coroutines.debug.internal.DebugProbesImpl.coroutineStateLock = r0
            kotlinx.coroutines.debug.internal.DebugProbesImpl.sanitizeStackTraces = r3
            kotlinx.coroutines.debug.internal.DebugProbesImpl.enableCreationStackTraces = r3
            kotlinx.coroutines.debug.internal.DebugProbesImpl r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE
            kotlin.jvm.functions.Function1 r0 = r0.getDynamicAttach()
            kotlinx.coroutines.debug.internal.DebugProbesImpl.dynamicAttach = r0
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap r0 = new kotlinx.coroutines.debug.internal.ConcurrentWeakMap
            r0.<init>(r3)
            kotlinx.coroutines.debug.internal.DebugProbesImpl.callerInfoCache = r0
            java.lang.Class<kotlinx.coroutines.debug.internal.DebugProbesImpl$SequenceNumberRefVolatile> r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.SequenceNumberRefVolatile.class
            java.lang.String r1 = "sequenceNumber"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r0, r1)
            kotlinx.coroutines.debug.internal.DebugProbesImpl.sequenceNumber$FU = r0
            return
    }

    private DebugProbesImpl() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ kotlinx.coroutines.debug.internal.ConcurrentWeakMap access$getCallerInfoCache$p() {
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap<kotlin.coroutines.jvm.internal.CoroutineStackFrame, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl> r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.callerInfoCache
            return r0
    }

    public static final /* synthetic */ boolean access$isFinished(kotlinx.coroutines.debug.internal.DebugProbesImpl r1, kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner r2) {
            boolean r0 = r1.isFinished(r2)
            return r0
    }

    public static final /* synthetic */ void access$probeCoroutineCompleted(kotlinx.coroutines.debug.internal.DebugProbesImpl r0, kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner r1) {
            r0.probeCoroutineCompleted(r1)
            return
    }

    private final void build(kotlinx.coroutines.Job r9, java.util.Map<kotlinx.coroutines.Job, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl> r10, java.lang.StringBuilder r11, java.lang.String r12) {
            r8 = this;
            java.lang.Object r0 = r10.get(r9)
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r0 = (kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl) r0
            r1 = 0
            java.lang.String r2 = "\t"
            r3 = 10
            if (r0 != 0) goto L34
            boolean r4 = r9 instanceof kotlinx.coroutines.internal.ScopeCoroutine
            if (r4 != 0) goto L32
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r4 = r4.append(r12)
            java.lang.String r5 = r8.getDebugString(r9)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r3 = r3.toString()
            r11.append(r3)
            java.lang.String r1 = kotlin.jvm.internal.Intrinsics.stringPlus(r12, r2)
            goto L76
        L32:
            r1 = r12
            goto L76
        L34:
            java.util.List r4 = r0.lastObservedStackTrace()
            java.lang.Object r4 = kotlin.collections.CollectionsKt.firstOrNull(r4)
            java.lang.StackTraceElement r4 = (java.lang.StackTraceElement) r4
            java.lang.String r5 = r0.getState()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.StringBuilder r6 = r6.append(r12)
            java.lang.String r7 = r8.getDebugString(r9)
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r7 = ", continuation is "
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r5)
            java.lang.String r7 = " at line "
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r4)
            java.lang.StringBuilder r3 = r6.append(r3)
            java.lang.String r3 = r3.toString()
            r11.append(r3)
            java.lang.String r1 = kotlin.jvm.internal.Intrinsics.stringPlus(r12, r2)
        L76:
            kotlin.sequences.Sequence r2 = r9.getChildren()
            java.util.Iterator r2 = r2.iterator()
        L7e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L8e
            java.lang.Object r3 = r2.next()
            kotlinx.coroutines.Job r3 = (kotlinx.coroutines.Job) r3
            r8.build(r3, r10, r11, r1)
            goto L7e
        L8e:
            return
    }

    private final <T> kotlin.coroutines.Continuation<T> createOwner(kotlin.coroutines.Continuation<? super T> r5, kotlinx.coroutines.debug.internal.StackTraceFrame r6) {
            r4 = this;
            boolean r0 = r4.isInstalled$kotlinx_coroutines_core()
            if (r0 != 0) goto L7
            return r5
        L7:
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r0 = new kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl
            kotlin.coroutines.CoroutineContext r1 = r5.getContext()
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = kotlinx.coroutines.debug.internal.DebugProbesImpl.sequenceNumber$FU
            kotlinx.coroutines.debug.internal.DebugProbesImpl$SequenceNumberRefVolatile r3 = kotlinx.coroutines.debug.internal.DebugProbesImpl.debugProbesImpl$SequenceNumberRefVolatile
            long r2 = r2.incrementAndGet(r3)
            r0.<init>(r1, r6, r2)
            kotlinx.coroutines.debug.internal.DebugProbesImpl$CoroutineOwner r1 = new kotlinx.coroutines.debug.internal.DebugProbesImpl$CoroutineOwner
            r2 = r6
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r2 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r2
            r1.<init>(r5, r0, r2)
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap<kotlinx.coroutines.debug.internal.DebugProbesImpl$CoroutineOwner<?>, java.lang.Boolean> r2 = kotlinx.coroutines.debug.internal.DebugProbesImpl.capturedCoroutinesMap
            java.util.Map r2 = (java.util.Map) r2
            r3 = 1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r2.put(r1, r3)
            boolean r2 = r4.isInstalled$kotlinx_coroutines_core()
            if (r2 != 0) goto L37
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap<kotlinx.coroutines.debug.internal.DebugProbesImpl$CoroutineOwner<?>, java.lang.Boolean> r2 = kotlinx.coroutines.debug.internal.DebugProbesImpl.capturedCoroutinesMap
            r2.clear()
        L37:
            r2 = r1
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            return r2
    }

    private final <R> java.util.List<R> dumpCoroutinesInfoImpl(kotlin.jvm.functions.Function2<? super kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?>, ? super kotlin.coroutines.CoroutineContext, ? extends R> r11) {
            r10 = this;
            r0 = 0
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = kotlinx.coroutines.debug.internal.DebugProbesImpl.coroutineStateLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r1.readLock()
            int r3 = r1.getWriteHoldCount()
            r4 = 0
            if (r3 != 0) goto L13
            int r3 = r1.getReadHoldCount()
            goto L14
        L13:
            r3 = r4
        L14:
            r5 = r4
        L15:
            if (r5 >= r3) goto L1d
            int r5 = r5 + 1
            r2.unlock()
            goto L15
        L1d:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r1.writeLock()
            r1.lock()
            r5 = 0
            r6 = 1
            kotlinx.coroutines.debug.internal.DebugProbesImpl r7 = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE     // Catch: java.lang.Throwable -> L75
            boolean r7 = r7.isInstalled$kotlinx_coroutines_core()     // Catch: java.lang.Throwable -> L75
            if (r7 == 0) goto L68
            kotlinx.coroutines.debug.internal.DebugProbesImpl r7 = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE     // Catch: java.lang.Throwable -> L75
            java.util.Set r7 = r7.getCapturedCoroutines()     // Catch: java.lang.Throwable -> L75
            java.lang.Iterable r7 = (java.lang.Iterable) r7     // Catch: java.lang.Throwable -> L75
            kotlin.sequences.Sequence r7 = kotlin.collections.CollectionsKt.asSequence(r7)     // Catch: java.lang.Throwable -> L75
            r8 = 0
            kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfoImpl$lambda-12$$inlined$sortedBy$1 r9 = new kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfoImpl$lambda-12$$inlined$sortedBy$1     // Catch: java.lang.Throwable -> L75
            r9.<init>()     // Catch: java.lang.Throwable -> L75
            java.util.Comparator r9 = (java.util.Comparator) r9     // Catch: java.lang.Throwable -> L75
            kotlin.sequences.Sequence r9 = kotlin.sequences.SequencesKt.sortedWith(r7, r9)     // Catch: java.lang.Throwable -> L75
            kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfoImpl$1$3 r7 = new kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfoImpl$1$3     // Catch: java.lang.Throwable -> L75
            r7.<init>(r11)     // Catch: java.lang.Throwable -> L75
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7     // Catch: java.lang.Throwable -> L75
            kotlin.sequences.Sequence r7 = kotlin.sequences.SequencesKt.mapNotNull(r9, r7)     // Catch: java.lang.Throwable -> L75
            java.util.List r7 = kotlin.sequences.SequencesKt.toList(r7)     // Catch: java.lang.Throwable -> L75
            kotlin.jvm.internal.InlineMarker.finallyStart(r6)
        L59:
            if (r4 >= r3) goto L61
            int r4 = r4 + 1
            r2.lock()
            goto L59
        L61:
            r1.unlock()
            kotlin.jvm.internal.InlineMarker.finallyEnd(r6)
            return r7
        L68:
            r7 = 0
            java.lang.String r8 = "Debug probes are not installed"
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L75
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L75
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L75
            throw r7     // Catch: java.lang.Throwable -> L75
        L75:
            r5 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r6)
        L79:
            if (r4 >= r3) goto L81
            int r4 = r4 + 1
            r2.lock()
            goto L79
        L81:
            r1.unlock()
            kotlin.jvm.internal.InlineMarker.finallyEnd(r6)
            throw r5
    }

    private final void dumpCoroutinesSynchronized(java.io.PrintStream r18) {
            r17 = this;
            r1 = r18
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.coroutineStateLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r0.readLock()
            int r3 = r0.getWriteHoldCount()
            if (r3 != 0) goto L13
            int r3 = r0.getReadHoldCount()
            goto L14
        L13:
            r3 = 0
        L14:
            r5 = 0
        L15:
            if (r5 >= r3) goto L1d
            int r5 = r5 + 1
            r2.unlock()
            goto L15
        L1d:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r5 = r0.writeLock()
            r5.lock()
            r0 = 0
            kotlinx.coroutines.debug.internal.DebugProbesImpl r6 = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE     // Catch: java.lang.Throwable -> L116
            boolean r6 = r6.isInstalled$kotlinx_coroutines_core()     // Catch: java.lang.Throwable -> L116
            if (r6 == 0) goto L107
            java.lang.String r6 = "Coroutines dump "
            java.text.SimpleDateFormat r7 = kotlinx.coroutines.debug.internal.DebugProbesImpl.dateFormat     // Catch: java.lang.Throwable -> L116
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L116
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> L116
            java.lang.String r7 = r7.format(r8)     // Catch: java.lang.Throwable -> L116
            java.lang.String r6 = kotlin.jvm.internal.Intrinsics.stringPlus(r6, r7)     // Catch: java.lang.Throwable -> L116
            r1.print(r6)     // Catch: java.lang.Throwable -> L116
            kotlinx.coroutines.debug.internal.DebugProbesImpl r6 = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE     // Catch: java.lang.Throwable -> L116
            java.util.Set r6 = r6.getCapturedCoroutines()     // Catch: java.lang.Throwable -> L116
            java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch: java.lang.Throwable -> L116
            kotlin.sequences.Sequence r6 = kotlin.collections.CollectionsKt.asSequence(r6)     // Catch: java.lang.Throwable -> L116
            kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesSynchronized$1$2 r7 = kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesSynchronized$1$2.INSTANCE     // Catch: java.lang.Throwable -> L116
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7     // Catch: java.lang.Throwable -> L116
            kotlin.sequences.Sequence r6 = kotlin.sequences.SequencesKt.filter(r6, r7)     // Catch: java.lang.Throwable -> L116
            r7 = 0
            kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesSynchronized$lambda-19$$inlined$sortedBy$1 r8 = new kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesSynchronized$lambda-19$$inlined$sortedBy$1     // Catch: java.lang.Throwable -> L116
            r8.<init>()     // Catch: java.lang.Throwable -> L116
            java.util.Comparator r8 = (java.util.Comparator) r8     // Catch: java.lang.Throwable -> L116
            kotlin.sequences.Sequence r8 = kotlin.sequences.SequencesKt.sortedWith(r6, r8)     // Catch: java.lang.Throwable -> L116
            r6 = r8
            r7 = 0
            java.util.Iterator r8 = r6.iterator()     // Catch: java.lang.Throwable -> L116
        L6b:
            boolean r9 = r8.hasNext()     // Catch: java.lang.Throwable -> L116
            if (r9 == 0) goto Lf5
            java.lang.Object r9 = r8.next()     // Catch: java.lang.Throwable -> L116
            r10 = r9
            kotlinx.coroutines.debug.internal.DebugProbesImpl$CoroutineOwner r10 = (kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner) r10     // Catch: java.lang.Throwable -> L116
            r11 = 0
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r12 = r10.info     // Catch: java.lang.Throwable -> L116
            java.util.List r13 = r12.lastObservedStackTrace()     // Catch: java.lang.Throwable -> L116
            kotlinx.coroutines.debug.internal.DebugProbesImpl r14 = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE     // Catch: java.lang.Throwable -> L116
            java.lang.String r15 = r12.getState()     // Catch: java.lang.Throwable -> L116
            java.lang.Thread r4 = r12.lastObservedThread     // Catch: java.lang.Throwable -> L116
            java.util.List r4 = r14.enhanceStackTraceWithThreadDumpImpl(r15, r4, r13)     // Catch: java.lang.Throwable -> L116
            java.lang.String r14 = r12.getState()     // Catch: java.lang.Throwable -> L116
            java.lang.String r15 = "RUNNING"
            boolean r14 = kotlin.jvm.internal.Intrinsics.areEqual(r14, r15)     // Catch: java.lang.Throwable -> L116
            if (r14 == 0) goto La4
            if (r4 != r13) goto La4
            java.lang.String r14 = r12.getState()     // Catch: java.lang.Throwable -> L116
            java.lang.String r15 = " (Last suspension stacktrace, not an actual stacktrace)"
            java.lang.String r14 = kotlin.jvm.internal.Intrinsics.stringPlus(r14, r15)     // Catch: java.lang.Throwable -> L116
            goto La8
        La4:
            java.lang.String r14 = r12.getState()     // Catch: java.lang.Throwable -> L116
        La8:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L116
            r15.<init>()     // Catch: java.lang.Throwable -> L116
            r16 = r0
            java.lang.String r0 = "\n\nCoroutine "
            java.lang.StringBuilder r0 = r15.append(r0)     // Catch: java.lang.Throwable -> L116
            kotlin.coroutines.Continuation<T> r15 = r10.delegate     // Catch: java.lang.Throwable -> L116
            java.lang.StringBuilder r0 = r0.append(r15)     // Catch: java.lang.Throwable -> L116
            java.lang.String r15 = ", state: "
            java.lang.StringBuilder r0 = r0.append(r15)     // Catch: java.lang.Throwable -> L116
            java.lang.StringBuilder r0 = r0.append(r14)     // Catch: java.lang.Throwable -> L116
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L116
            r1.print(r0)     // Catch: java.lang.Throwable -> L116
            boolean r0 = r13.isEmpty()     // Catch: java.lang.Throwable -> L116
            if (r0 == 0) goto Lec
            java.lang.String r0 = "\n\tat "
            java.lang.String r15 = "Coroutine creation stacktrace"
            java.lang.StackTraceElement r15 = kotlinx.coroutines.internal.StackTraceRecoveryKt.artificialFrame(r15)     // Catch: java.lang.Throwable -> L116
            java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r0, r15)     // Catch: java.lang.Throwable -> L116
            r1.print(r0)     // Catch: java.lang.Throwable -> L116
            kotlinx.coroutines.debug.internal.DebugProbesImpl r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE     // Catch: java.lang.Throwable -> L116
            java.util.List r15 = r12.getCreationStackTrace()     // Catch: java.lang.Throwable -> L116
            r0.printStackTrace(r1, r15)     // Catch: java.lang.Throwable -> L116
            goto Lf1
        Lec:
            kotlinx.coroutines.debug.internal.DebugProbesImpl r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE     // Catch: java.lang.Throwable -> L116
            r0.printStackTrace(r1, r4)     // Catch: java.lang.Throwable -> L116
        Lf1:
            r0 = r16
            goto L6b
        Lf5:
            r16 = r0
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L116
            r4 = 0
        Lfb:
            if (r4 >= r3) goto L103
            int r4 = r4 + 1
            r2.lock()
            goto Lfb
        L103:
            r5.unlock()
            return
        L107:
            r16 = r0
            r0 = 0
            java.lang.String r4 = "Debug probes are not installed"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L116
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L116
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L116
            throw r0     // Catch: java.lang.Throwable -> L116
        L116:
            r0 = move-exception
            r4 = 0
        L118:
            if (r4 >= r3) goto L120
            int r4 = r4 + 1
            r2.lock()
            goto L118
        L120:
            r5.unlock()
            throw r0
    }

    private final java.util.List<java.lang.StackTraceElement> enhanceStackTraceWithThreadDumpImpl(java.lang.String r17, java.lang.Thread r18, java.util.List<java.lang.StackTraceElement> r19) {
            r16 = this;
            r1 = r16
            r2 = r19
            java.lang.String r0 = "RUNNING"
            r3 = r17
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r0)
            if (r0 == 0) goto Lca
            if (r18 != 0) goto L12
            goto Lca
        L12:
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L21
            r0 = r1
            kotlinx.coroutines.debug.internal.DebugProbesImpl r0 = (kotlinx.coroutines.debug.internal.DebugProbesImpl) r0     // Catch: java.lang.Throwable -> L21
            r4 = 0
            java.lang.StackTraceElement[] r5 = r18.getStackTrace()     // Catch: java.lang.Throwable -> L21
            java.lang.Object r0 = kotlin.Result.m8669constructorimpl(r5)     // Catch: java.lang.Throwable -> L21
            goto L2c
        L21:
            r0 = move-exception
            kotlin.Result$Companion r4 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m8669constructorimpl(r0)
        L2c:
            boolean r4 = kotlin.Result.m8675isFailureimpl(r0)
            if (r4 == 0) goto L33
            r0 = 0
        L33:
            java.lang.StackTraceElement[] r0 = (java.lang.StackTraceElement[]) r0
            if (r0 != 0) goto L38
            return r2
        L38:
            r4 = r0
            r5 = 0
            int r6 = r4.length
            r7 = 0
            r8 = r7
        L3d:
            r9 = -1
            r10 = 1
            if (r8 >= r6) goto L72
            r11 = r8
            int r8 = r8 + 1
            r12 = r4[r11]
            r13 = 0
            java.lang.String r14 = r12.getClassName()
            java.lang.String r15 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl"
            boolean r14 = kotlin.jvm.internal.Intrinsics.areEqual(r14, r15)
            if (r14 == 0) goto L6d
            java.lang.String r14 = r12.getMethodName()
            java.lang.String r15 = "resumeWith"
            boolean r14 = kotlin.jvm.internal.Intrinsics.areEqual(r14, r15)
            if (r14 == 0) goto L6d
            java.lang.String r14 = r12.getFileName()
            java.lang.String r15 = "ContinuationImpl.kt"
            boolean r14 = kotlin.jvm.internal.Intrinsics.areEqual(r14, r15)
            if (r14 == 0) goto L6d
            r14 = r10
            goto L6e
        L6d:
            r14 = r7
        L6e:
            if (r14 == 0) goto L3d
            goto L73
        L72:
            r11 = r9
        L73:
            r4 = r11
            kotlin.Pair r5 = r1.findContinuationStartIndex(r4, r0, r2)
            java.lang.Object r6 = r5.component1()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            java.lang.Object r5 = r5.component2()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            if (r6 != r9) goto L93
            return r2
        L93:
            int r8 = r19.size()
            int r8 = r8 + r4
            int r8 = r8 - r6
            int r8 = r8 - r10
            int r8 = r8 - r5
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r8)
            int r10 = r4 - r5
        La2:
            if (r7 >= r10) goto Lb0
            r11 = r7
            int r7 = r7 + 1
            r12 = r9
            java.util.Collection r12 = (java.util.Collection) r12
            r13 = r0[r11]
            r12.add(r13)
            goto La2
        Lb0:
            int r7 = r6 + 1
            int r10 = r19.size()
        Lb6:
            if (r7 >= r10) goto Lc6
            r11 = r7
            int r7 = r7 + 1
            r12 = r9
            java.util.Collection r12 = (java.util.Collection) r12
            java.lang.Object r13 = r2.get(r11)
            r12.add(r13)
            goto Lb6
        Lc6:
            r7 = r9
            java.util.List r7 = (java.util.List) r7
            return r7
        Lca:
            return r2
    }

    private final kotlin.Pair<java.lang.Integer, java.lang.Integer> findContinuationStartIndex(int r8, java.lang.StackTraceElement[] r9, java.util.List<java.lang.StackTraceElement> r10) {
            r7 = this;
            r0 = 0
            r1 = r0
        L2:
            r2 = -1
            r3 = 3
            if (r1 >= r3) goto L24
            int r3 = r1 + 1
            r4 = 0
            kotlinx.coroutines.debug.internal.DebugProbesImpl r5 = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE
            int r6 = r8 + (-1)
            int r6 = r6 - r1
            int r5 = r5.findIndexOfFrame(r6, r9, r10)
            if (r5 == r2) goto L21
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            kotlin.Pair r0 = kotlin.TuplesKt.m122to(r0, r2)
            return r0
        L21:
            r1 = r3
            goto L2
        L24:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            kotlin.Pair r0 = kotlin.TuplesKt.m122to(r1, r0)
            return r0
    }

    private final int findIndexOfFrame(int r12, java.lang.StackTraceElement[] r13, java.util.List<java.lang.StackTraceElement> r14) {
            r11 = this;
            java.lang.Object r0 = kotlin.collections.ArraysKt.getOrNull(r13, r12)
            java.lang.StackTraceElement r0 = (java.lang.StackTraceElement) r0
            r1 = -1
            if (r0 != 0) goto La
            return r1
        La:
            r2 = r14
            r3 = 0
            r4 = 0
            java.util.Iterator r5 = r2.iterator()
        L11:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L54
            java.lang.Object r6 = r5.next()
            r7 = r6
            java.lang.StackTraceElement r7 = (java.lang.StackTraceElement) r7
            r8 = 0
            java.lang.String r9 = r7.getFileName()
            java.lang.String r10 = r0.getFileName()
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r9, r10)
            if (r9 == 0) goto L4b
            java.lang.String r9 = r7.getClassName()
            java.lang.String r10 = r0.getClassName()
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r9, r10)
            if (r9 == 0) goto L4b
            java.lang.String r9 = r7.getMethodName()
            java.lang.String r10 = r0.getMethodName()
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r9, r10)
            if (r9 == 0) goto L4b
            r9 = 1
            goto L4c
        L4b:
            r9 = 0
        L4c:
            if (r9 == 0) goto L51
            r1 = r4
            goto L55
        L51:
            int r4 = r4 + 1
            goto L11
        L54:
        L55:
            return r1
    }

    private final java.util.Set<kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?>> getCapturedCoroutines() {
            r1 = this;
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap<kotlinx.coroutines.debug.internal.DebugProbesImpl$CoroutineOwner<?>, java.lang.Boolean> r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.capturedCoroutinesMap
            java.util.Set r0 = r0.keySet()
            return r0
    }

    private final java.lang.String getDebugString(kotlinx.coroutines.Job r2) {
            r1 = this;
            boolean r0 = r2 instanceof kotlinx.coroutines.JobSupport
            if (r0 == 0) goto Lc
            r0 = r2
            kotlinx.coroutines.JobSupport r0 = (kotlinx.coroutines.JobSupport) r0
            java.lang.String r0 = r0.toDebugString()
            goto L10
        Lc:
            java.lang.String r0 = r2.toString()
        L10:
            return r0
    }

    private static /* synthetic */ void getDebugString$annotations(kotlinx.coroutines.Job r0) {
            return
    }

    private final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> getDynamicAttach() {
            r6 = this;
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L2f
            r0 = r6
            kotlinx.coroutines.debug.internal.DebugProbesImpl r0 = (kotlinx.coroutines.debug.internal.DebugProbesImpl) r0     // Catch: java.lang.Throwable -> L2f
            r1 = 0
            java.lang.String r2 = "kotlinx.coroutines.debug.internal.ByteBuddyDynamicAttach"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L2f
            java.lang.reflect.Constructor[] r3 = r2.getConstructors()     // Catch: java.lang.Throwable -> L2f
            r4 = 0
            r3 = r3[r4]     // Catch: java.lang.Throwable -> L2f
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r4 = r3.newInstance(r4)     // Catch: java.lang.Throwable -> L2f
            if (r4 == 0) goto L27
            r5 = 1
            java.lang.Object r4 = kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(r4, r5)     // Catch: java.lang.Throwable -> L2f
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r0 = kotlin.Result.m8669constructorimpl(r4)     // Catch: java.lang.Throwable -> L2f
            goto L3a
        L27:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L2f
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Function1<kotlin.Boolean, kotlin.Unit>"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L2f
            throw r4     // Catch: java.lang.Throwable -> L2f
        L2f:
            r0 = move-exception
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m8669constructorimpl(r0)
        L3a:
            boolean r1 = kotlin.Result.m8675isFailureimpl(r0)
            if (r1 == 0) goto L41
            r0 = 0
        L41:
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            return r0
    }

    private final boolean isFinished(kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?> r4) {
            r3 = this;
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r0 = r4.info
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            if (r0 != 0) goto La
            r0 = 0
            goto L14
        La:
            kotlinx.coroutines.Job$Key r1 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Key r1 = (kotlin.coroutines.CoroutineContext.Key) r1
            kotlin.coroutines.CoroutineContext$Element r0 = r0.get(r1)
            kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
        L14:
            r1 = 0
            if (r0 != 0) goto L18
            return r1
        L18:
            boolean r2 = r0.isCompleted()
            if (r2 != 0) goto L1f
            return r1
        L1f:
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap<kotlinx.coroutines.debug.internal.DebugProbesImpl$CoroutineOwner<?>, java.lang.Boolean> r1 = kotlinx.coroutines.debug.internal.DebugProbesImpl.capturedCoroutinesMap
            r1.remove(r4)
            r1 = 1
            return r1
    }

    private final boolean isInternalMethod(java.lang.StackTraceElement r6) {
            r5 = this;
            java.lang.String r0 = r6.getClassName()
            r1 = 2
            r2 = 0
            java.lang.String r3 = "kotlinx.coroutines"
            r4 = 0
            boolean r0 = kotlin.text.StringsKt.startsWith$default(r0, r3, r4, r1, r2)
            return r0
    }

    private final kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?> owner(kotlin.coroutines.Continuation<?> r3) {
            r2 = this;
            boolean r0 = r3 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            r1 = 0
            if (r0 == 0) goto L9
            r0 = r3
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r0 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r0
            goto La
        L9:
            r0 = r1
        La:
            if (r0 != 0) goto Ld
            goto L11
        Ld:
            kotlinx.coroutines.debug.internal.DebugProbesImpl$CoroutineOwner r1 = r2.owner(r0)
        L11:
            return r1
    }

    private final kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?> owner(kotlin.coroutines.jvm.internal.CoroutineStackFrame r3) {
            r2 = this;
            r0 = r3
        L1:
            boolean r1 = r0 instanceof kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner
            if (r1 == 0) goto L8
            kotlinx.coroutines.debug.internal.DebugProbesImpl$CoroutineOwner r0 = (kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner) r0
            goto Lf
        L8:
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r0 = r0.getCallerFrame()
            if (r0 != 0) goto L1
            r0 = 0
        Lf:
            return r0
    }

    private final void printStackTrace(java.io.PrintStream r8, java.util.List<java.lang.StackTraceElement> r9) {
            r7 = this;
            r0 = r9
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = 0
            java.util.Iterator r2 = r0.iterator()
        L8:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L21
            java.lang.Object r3 = r2.next()
            r4 = r3
            java.lang.StackTraceElement r4 = (java.lang.StackTraceElement) r4
            r5 = 0
            java.lang.String r6 = "\n\tat "
            java.lang.String r6 = kotlin.jvm.internal.Intrinsics.stringPlus(r6, r4)
            r8.print(r6)
            goto L8
        L21:
            return
    }

    private final void probeCoroutineCompleted(kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?> r3) {
            r2 = this;
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap<kotlinx.coroutines.debug.internal.DebugProbesImpl$CoroutineOwner<?>, java.lang.Boolean> r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.capturedCoroutinesMap
            r0.remove(r3)
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r0 = r3.info
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r0 = r0.getLastObservedFrame$kotlinx_coroutines_core()
            if (r0 != 0) goto Lf
            r0 = 0
            goto L13
        Lf:
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r0 = r2.realCaller(r0)
        L13:
            if (r0 != 0) goto L16
            return
        L16:
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap<kotlin.coroutines.jvm.internal.CoroutineStackFrame, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl> r1 = kotlinx.coroutines.debug.internal.DebugProbesImpl.callerInfoCache
            r1.remove(r0)
            return
    }

    private final kotlin.coroutines.jvm.internal.CoroutineStackFrame realCaller(kotlin.coroutines.jvm.internal.CoroutineStackFrame r3) {
            r2 = this;
            r0 = r3
        L1:
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r0 = r0.getCallerFrame()
            if (r0 != 0) goto L9
            r0 = 0
            return r0
        L9:
            java.lang.StackTraceElement r1 = r0.getStackTraceElement()
            if (r1 == 0) goto L1
            return r0
    }

    private final <T extends java.lang.Throwable> java.util.List<java.lang.StackTraceElement> sanitizeStackTrace(T r12) {
            r11 = this;
            java.lang.StackTraceElement[] r0 = r12.getStackTrace()
            int r1 = r0.length
            r2 = r0
            r3 = 0
            int r4 = r2.length
            r5 = -1
            int r4 = r4 + r5
            if (r4 < 0) goto L21
        Lc:
            r6 = r4
            int r4 = r4 + r5
            r7 = r2[r6]
            r8 = 0
            java.lang.String r9 = r7.getClassName()
            java.lang.String r10 = "kotlin.coroutines.jvm.internal.DebugProbesKt"
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r9, r10)
            if (r7 == 0) goto L1f
            r5 = r6
            goto L22
        L1f:
            if (r4 >= 0) goto Lc
        L21:
        L22:
            r2 = r5
            boolean r3 = kotlinx.coroutines.debug.internal.DebugProbesImpl.sanitizeStackTraces
            java.lang.String r4 = "Coroutine creation stacktrace"
            if (r3 != 0) goto L49
            int r3 = r1 - r2
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r3)
            r6 = 0
        L31:
            if (r6 >= r3) goto L46
            int r7 = r6 + 1
            r8 = 0
            if (r6 != 0) goto L3d
            java.lang.StackTraceElement r9 = kotlinx.coroutines.internal.StackTraceRecoveryKt.artificialFrame(r4)
            goto L41
        L3d:
            int r9 = r6 + r2
            r9 = r0[r9]
        L41:
            r5.add(r9)
            r6 = r7
            goto L31
        L46:
            java.util.List r5 = (java.util.List) r5
            return r5
        L49:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r5 = r1 - r2
            int r5 = r5 + 1
            r3.<init>(r5)
            r5 = r3
            java.util.Collection r5 = (java.util.Collection) r5
            java.lang.StackTraceElement r4 = kotlinx.coroutines.internal.StackTraceRecoveryKt.artificialFrame(r4)
            r5.add(r4)
            int r4 = r2 + 1
        L5e:
            if (r4 >= r1) goto Lb3
            r5 = r0[r4]
            boolean r5 = r11.isInternalMethod(r5)
            if (r5 == 0) goto La8
            r5 = r3
            java.util.Collection r5 = (java.util.Collection) r5
            r6 = r0[r4]
            r5.add(r6)
            int r5 = r4 + 1
        L72:
            if (r5 >= r1) goto L7f
            r6 = r0[r5]
            boolean r6 = r11.isInternalMethod(r6)
            if (r6 == 0) goto L7f
            int r5 = r5 + 1
            goto L72
        L7f:
            int r6 = r5 + (-1)
        L81:
            if (r6 <= r4) goto L8e
            r7 = r0[r6]
            java.lang.String r7 = r7.getFileName()
            if (r7 != 0) goto L8e
            int r6 = r6 + (-1)
            goto L81
        L8e:
            if (r6 <= r4) goto L9c
            int r7 = r5 + (-1)
            if (r6 >= r7) goto L9c
            r7 = r3
            java.util.Collection r7 = (java.util.Collection) r7
            r8 = r0[r6]
            r7.add(r8)
        L9c:
            r7 = r3
            java.util.Collection r7 = (java.util.Collection) r7
            int r8 = r5 + (-1)
            r8 = r0[r8]
            r7.add(r8)
            r4 = r5
            goto L5e
        La8:
            r5 = r3
            java.util.Collection r5 = (java.util.Collection) r5
            r6 = r0[r4]
            r5.add(r6)
            int r4 = r4 + 1
            goto L5e
        Lb3:
            r5 = r3
            java.util.List r5 = (java.util.List) r5
            return r5
    }

    private final void startWeakRefCleanerThread() {
            r9 = this;
            kotlinx.coroutines.debug.internal.DebugProbesImpl$startWeakRefCleanerThread$1 r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.C08891.INSTANCE
            r6 = r0
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r7 = 21
            r8 = 0
            r1 = 0
            r2 = 1
            r3 = 0
            java.lang.String r4 = "Coroutines Debugger Cleaner"
            r5 = 0
            java.lang.Thread r0 = kotlin.concurrent.ThreadsKt.thread$default(r1, r2, r3, r4, r5, r6, r7, r8)
            kotlinx.coroutines.debug.internal.DebugProbesImpl.weakRefCleanerThread = r0
            return
    }

    private final void stopWeakRefCleanerThread() {
            r2 = this;
            java.lang.Thread r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.weakRefCleanerThread
            if (r0 != 0) goto L5
            return
        L5:
            r1 = 0
            kotlinx.coroutines.debug.internal.DebugProbesImpl.weakRefCleanerThread = r1
            r0.interrupt()
            r0.join()
            return
    }

    private final kotlinx.coroutines.debug.internal.StackTraceFrame toStackTraceFrame(java.util.List<java.lang.StackTraceElement> r11) {
            r10 = this;
            r0 = 0
            r1 = r11
            r2 = 0
            r3 = r0
            boolean r4 = r1.isEmpty()
            if (r4 != 0) goto L2a
            int r4 = r1.size()
            java.util.ListIterator r4 = r1.listIterator(r4)
        L12:
            boolean r5 = r4.hasPrevious()
            if (r5 == 0) goto L2a
            java.lang.Object r5 = r4.previous()
            java.lang.StackTraceElement r5 = (java.lang.StackTraceElement) r5
            r6 = r3
            r7 = 0
            kotlinx.coroutines.debug.internal.StackTraceFrame r8 = new kotlinx.coroutines.debug.internal.StackTraceFrame
            r9 = r6
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r9 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r9
            r8.<init>(r9, r5)
            r3 = r8
            goto L12
        L2a:
            return r3
    }

    private final java.lang.String toStringWithQuotes(java.lang.Object r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 34
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    private final void updateRunningState(kotlin.coroutines.jvm.internal.CoroutineStackFrame r7, java.lang.String r8) {
            r6 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.coroutineStateLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            r0.lock()
            r1 = 0
            kotlinx.coroutines.debug.internal.DebugProbesImpl r2 = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE     // Catch: java.lang.Throwable -> L6d
            boolean r2 = r2.isInstalled$kotlinx_coroutines_core()     // Catch: java.lang.Throwable -> L6d
            if (r2 != 0) goto L16
            r0.unlock()
            return
        L16:
            r2 = 0
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap<kotlin.coroutines.jvm.internal.CoroutineStackFrame, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl> r3 = kotlinx.coroutines.debug.internal.DebugProbesImpl.callerInfoCache     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r3 = r3.remove(r7)     // Catch: java.lang.Throwable -> L6d
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r3 = (kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl) r3     // Catch: java.lang.Throwable -> L6d
            if (r3 == 0) goto L23
            r2 = r3
            goto L4d
        L23:
            kotlinx.coroutines.debug.internal.DebugProbesImpl r4 = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE     // Catch: java.lang.Throwable -> L6d
            kotlinx.coroutines.debug.internal.DebugProbesImpl$CoroutineOwner r4 = r4.owner(r7)     // Catch: java.lang.Throwable -> L6d
            r5 = 0
            if (r4 != 0) goto L2e
            r4 = r5
            goto L30
        L2e:
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r4 = r4.info     // Catch: java.lang.Throwable -> L6d
        L30:
            if (r4 != 0) goto L36
            r0.unlock()
            return
        L36:
            r2 = r4
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r4 = r2.getLastObservedFrame$kotlinx_coroutines_core()     // Catch: java.lang.Throwable -> L6d
            if (r4 != 0) goto L3e
        L3d:
            goto L45
        L3e:
            kotlinx.coroutines.debug.internal.DebugProbesImpl r5 = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE     // Catch: java.lang.Throwable -> L6d
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r5 = r5.realCaller(r4)     // Catch: java.lang.Throwable -> L6d
            goto L3d
        L45:
            r4 = r5
            if (r4 == 0) goto L4d
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap<kotlin.coroutines.jvm.internal.CoroutineStackFrame, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl> r5 = kotlinx.coroutines.debug.internal.DebugProbesImpl.callerInfoCache     // Catch: java.lang.Throwable -> L6d
            r5.remove(r4)     // Catch: java.lang.Throwable -> L6d
        L4d:
            r4 = r7
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4     // Catch: java.lang.Throwable -> L6d
            r2.updateState$kotlinx_coroutines_core(r8, r4)     // Catch: java.lang.Throwable -> L6d
            kotlinx.coroutines.debug.internal.DebugProbesImpl r4 = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE     // Catch: java.lang.Throwable -> L6d
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r4 = r4.realCaller(r7)     // Catch: java.lang.Throwable -> L6d
            if (r4 != 0) goto L5f
            r0.unlock()
            return
        L5f:
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap<kotlin.coroutines.jvm.internal.CoroutineStackFrame, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl> r5 = kotlinx.coroutines.debug.internal.DebugProbesImpl.callerInfoCache     // Catch: java.lang.Throwable -> L6d
            java.util.Map r5 = (java.util.Map) r5     // Catch: java.lang.Throwable -> L6d
            r5.put(r4, r2)     // Catch: java.lang.Throwable -> L6d
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L6d
            r0.unlock()
            return
        L6d:
            r1 = move-exception
            r0.unlock()
            throw r1
    }

    private final void updateState(kotlin.coroutines.Continuation<?> r5, java.lang.String r6) {
            r4 = this;
            boolean r0 = r4.isInstalled$kotlinx_coroutines_core()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.String r0 = "RUNNING"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r0)
            if (r0 == 0) goto L2b
            kotlin.KotlinVersion r0 = kotlin.KotlinVersion.CURRENT
            r1 = 3
            r2 = 30
            r3 = 1
            boolean r0 = r0.isAtLeast(r3, r1, r2)
            if (r0 == 0) goto L2b
            boolean r0 = r5 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r0 == 0) goto L23
            r0 = r5
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r0 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r0
            goto L24
        L23:
            r0 = 0
        L24:
            if (r0 != 0) goto L27
            return
        L27:
            r4.updateRunningState(r0, r6)
            return
        L2b:
            kotlinx.coroutines.debug.internal.DebugProbesImpl$CoroutineOwner r0 = r4.owner(r5)
            if (r0 != 0) goto L32
            return
        L32:
            r4.updateState(r0, r5, r6)
            return
    }

    private final void updateState(kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?> r4, kotlin.coroutines.Continuation<?> r5, java.lang.String r6) {
            r3 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.coroutineStateLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            r0.lock()
            r1 = 0
            kotlinx.coroutines.debug.internal.DebugProbesImpl r2 = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE     // Catch: java.lang.Throwable -> L22
            boolean r2 = r2.isInstalled$kotlinx_coroutines_core()     // Catch: java.lang.Throwable -> L22
            if (r2 != 0) goto L16
            r0.unlock()
            return
        L16:
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r2 = r4.info     // Catch: java.lang.Throwable -> L22
            r2.updateState$kotlinx_coroutines_core(r6, r5)     // Catch: java.lang.Throwable -> L22
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L22
            r0.unlock()
            return
        L22:
            r1 = move-exception
            r0.unlock()
            throw r1
    }

    public final void dumpCoroutines(java.io.PrintStream r3) {
            r2 = this;
            monitor-enter(r3)
            r0 = 0
            kotlinx.coroutines.debug.internal.DebugProbesImpl r1 = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE     // Catch: java.lang.Throwable -> Lc
            r1.dumpCoroutinesSynchronized(r3)     // Catch: java.lang.Throwable -> Lc
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r3)
            return
        Lc:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    public final java.util.List<kotlinx.coroutines.debug.internal.DebugCoroutineInfo> dumpCoroutinesInfo() {
            r10 = this;
            r0 = r10
            r1 = 0
            java.util.concurrent.locks.ReentrantReadWriteLock r2 = kotlinx.coroutines.debug.internal.DebugProbesImpl.coroutineStateLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r2.readLock()
            int r4 = r2.getWriteHoldCount()
            r5 = 0
            if (r4 != 0) goto L14
            int r4 = r2.getReadHoldCount()
            goto L15
        L14:
            r4 = r5
        L15:
            r6 = r5
        L16:
            if (r6 >= r4) goto L1e
            int r6 = r6 + 1
            r3.unlock()
            goto L16
        L1e:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r2 = r2.writeLock()
            r2.lock()
            r6 = 0
            kotlinx.coroutines.debug.internal.DebugProbesImpl r7 = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE     // Catch: java.lang.Throwable -> L71
            boolean r7 = r7.isInstalled$kotlinx_coroutines_core()     // Catch: java.lang.Throwable -> L71
            if (r7 == 0) goto L64
            kotlinx.coroutines.debug.internal.DebugProbesImpl r7 = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE     // Catch: java.lang.Throwable -> L71
            java.util.Set r7 = r7.getCapturedCoroutines()     // Catch: java.lang.Throwable -> L71
            java.lang.Iterable r7 = (java.lang.Iterable) r7     // Catch: java.lang.Throwable -> L71
            kotlin.sequences.Sequence r7 = kotlin.collections.CollectionsKt.asSequence(r7)     // Catch: java.lang.Throwable -> L71
            r8 = 0
            kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfoImpl$lambda-12$$inlined$sortedBy$1 r9 = new kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfoImpl$lambda-12$$inlined$sortedBy$1     // Catch: java.lang.Throwable -> L71
            r9.<init>()     // Catch: java.lang.Throwable -> L71
            java.util.Comparator r9 = (java.util.Comparator) r9     // Catch: java.lang.Throwable -> L71
            kotlin.sequences.Sequence r9 = kotlin.sequences.SequencesKt.sortedWith(r7, r9)     // Catch: java.lang.Throwable -> L71
            kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfo$$inlined$dumpCoroutinesInfoImpl$1 r7 = new kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfo$$inlined$dumpCoroutinesInfoImpl$1     // Catch: java.lang.Throwable -> L71
            r7.<init>()     // Catch: java.lang.Throwable -> L71
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7     // Catch: java.lang.Throwable -> L71
            kotlin.sequences.Sequence r7 = kotlin.sequences.SequencesKt.mapNotNull(r9, r7)     // Catch: java.lang.Throwable -> L71
            java.util.List r7 = kotlin.sequences.SequencesKt.toList(r7)     // Catch: java.lang.Throwable -> L71
        L57:
            if (r5 >= r4) goto L5f
            int r5 = r5 + 1
            r3.lock()
            goto L57
        L5f:
            r2.unlock()
            return r7
        L64:
            r7 = 0
            java.lang.String r8 = "Debug probes are not installed"
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L71
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L71
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L71
            throw r7     // Catch: java.lang.Throwable -> L71
        L71:
            r6 = move-exception
        L72:
            if (r5 >= r4) goto L7a
            int r5 = r5 + 1
            r3.lock()
            goto L72
        L7a:
            r2.unlock()
            throw r6
    }

    public final java.lang.Object[] dumpCoroutinesInfoAsJsonAndReferences() {
            r15 = this;
            java.util.List r0 = r15.dumpCoroutinesInfo()
            int r1 = r0.size()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r1)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r1)
            java.util.Iterator r5 = r0.iterator()
        L1b:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto Ld4
            java.lang.Object r6 = r5.next()
            kotlinx.coroutines.debug.internal.DebugCoroutineInfo r6 = (kotlinx.coroutines.debug.internal.DebugCoroutineInfo) r6
            kotlin.coroutines.CoroutineContext r7 = r6.getContext()
            kotlinx.coroutines.CoroutineName$Key r8 = kotlinx.coroutines.CoroutineName.Key
            kotlin.coroutines.CoroutineContext$Key r8 = (kotlin.coroutines.CoroutineContext.Key) r8
            kotlin.coroutines.CoroutineContext$Element r8 = r7.get(r8)
            kotlinx.coroutines.CoroutineName r8 = (kotlinx.coroutines.CoroutineName) r8
            r9 = 0
            if (r8 != 0) goto L3a
        L38:
            r8 = r9
            goto L45
        L3a:
            java.lang.String r8 = r8.getName()
            if (r8 != 0) goto L41
            goto L38
        L41:
            java.lang.String r8 = r15.toStringWithQuotes(r8)
        L45:
            kotlinx.coroutines.CoroutineDispatcher$Key r10 = kotlinx.coroutines.CoroutineDispatcher.Key
            kotlin.coroutines.CoroutineContext$Key r10 = (kotlin.coroutines.CoroutineContext.Key) r10
            kotlin.coroutines.CoroutineContext$Element r10 = r7.get(r10)
            kotlinx.coroutines.CoroutineDispatcher r10 = (kotlinx.coroutines.CoroutineDispatcher) r10
            if (r10 != 0) goto L53
            r10 = r9
            goto L57
        L53:
            java.lang.String r10 = r15.toStringWithQuotes(r10)
        L57:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "\n                {\n                    \"name\": "
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.StringBuilder r11 = r11.append(r8)
            java.lang.String r12 = ",\n                    \"id\": "
            java.lang.StringBuilder r11 = r11.append(r12)
            kotlinx.coroutines.CoroutineId$Key r12 = kotlinx.coroutines.CoroutineId.Key
            kotlin.coroutines.CoroutineContext$Key r12 = (kotlin.coroutines.CoroutineContext.Key) r12
            kotlin.coroutines.CoroutineContext$Element r12 = r7.get(r12)
            kotlinx.coroutines.CoroutineId r12 = (kotlinx.coroutines.CoroutineId) r12
            if (r12 != 0) goto L7c
            goto L84
        L7c:
            long r12 = r12.getId()
            java.lang.Long r9 = java.lang.Long.valueOf(r12)
        L84:
            java.lang.StringBuilder r9 = r11.append(r9)
            java.lang.String r11 = ",\n                    \"dispatcher\": "
            java.lang.StringBuilder r9 = r9.append(r11)
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r11 = ",\n                    \"sequenceNumber\": "
            java.lang.StringBuilder r9 = r9.append(r11)
            long r11 = r6.getSequenceNumber()
            java.lang.StringBuilder r9 = r9.append(r11)
            java.lang.String r11 = ",\n                    \"state\": \""
            java.lang.StringBuilder r9 = r9.append(r11)
            java.lang.String r11 = r6.getState()
            java.lang.StringBuilder r9 = r9.append(r11)
            java.lang.String r11 = "\"\n                } \n                "
            java.lang.StringBuilder r9 = r9.append(r11)
            java.lang.String r9 = r9.toString()
            java.lang.String r9 = kotlin.text.StringsKt.trimIndent(r9)
            r4.add(r9)
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r9 = r6.getLastObservedFrame()
            r3.add(r9)
            java.lang.Thread r9 = r6.getLastObservedThread()
            r2.add(r9)
            goto L1b
        Ld4:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r6 = 91
            java.lang.StringBuilder r5 = r5.append(r6)
            r6 = r4
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            r13 = 63
            r14 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            java.lang.String r6 = kotlin.collections.CollectionsKt.joinToString$default(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.StringBuilder r5 = r5.append(r6)
            r6 = 93
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r6 = r2
            java.util.Collection r6 = (java.util.Collection) r6
            r7 = 0
            r8 = r6
            r9 = 0
            java.lang.Thread[] r10 = new java.lang.Thread[r9]
            java.lang.Object[] r10 = r8.toArray(r10)
            java.lang.String r11 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            if (r10 == 0) goto L13e
        L10f:
            r6 = r3
            java.util.Collection r6 = (java.util.Collection) r6
            r7 = 0
            r8 = r6
            kotlin.coroutines.jvm.internal.CoroutineStackFrame[] r12 = new kotlin.coroutines.jvm.internal.CoroutineStackFrame[r9]
            java.lang.Object[] r12 = r8.toArray(r12)
            if (r12 == 0) goto L138
        L11e:
            r6 = r0
            java.util.Collection r6 = (java.util.Collection) r6
            r7 = 0
            r8 = r6
            kotlinx.coroutines.debug.internal.DebugCoroutineInfo[] r9 = new kotlinx.coroutines.debug.internal.DebugCoroutineInfo[r9]
            java.lang.Object[] r9 = r8.toArray(r9)
            if (r9 == 0) goto L132
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r10, r12, r9}
            return r5
        L132:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            r5.<init>(r11)
            throw r5
        L138:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            r5.<init>(r11)
            throw r5
        L13e:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            r5.<init>(r11)
            throw r5
    }

    public final java.util.List<kotlinx.coroutines.debug.internal.DebuggerInfo> dumpDebuggerInfo() {
            r10 = this;
            r0 = r10
            r1 = 0
            java.util.concurrent.locks.ReentrantReadWriteLock r2 = kotlinx.coroutines.debug.internal.DebugProbesImpl.coroutineStateLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r2.readLock()
            int r4 = r2.getWriteHoldCount()
            r5 = 0
            if (r4 != 0) goto L14
            int r4 = r2.getReadHoldCount()
            goto L15
        L14:
            r4 = r5
        L15:
            r6 = r5
        L16:
            if (r6 >= r4) goto L1e
            int r6 = r6 + 1
            r3.unlock()
            goto L16
        L1e:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r2 = r2.writeLock()
            r2.lock()
            r6 = 0
            kotlinx.coroutines.debug.internal.DebugProbesImpl r7 = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE     // Catch: java.lang.Throwable -> L71
            boolean r7 = r7.isInstalled$kotlinx_coroutines_core()     // Catch: java.lang.Throwable -> L71
            if (r7 == 0) goto L64
            kotlinx.coroutines.debug.internal.DebugProbesImpl r7 = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE     // Catch: java.lang.Throwable -> L71
            java.util.Set r7 = r7.getCapturedCoroutines()     // Catch: java.lang.Throwable -> L71
            java.lang.Iterable r7 = (java.lang.Iterable) r7     // Catch: java.lang.Throwable -> L71
            kotlin.sequences.Sequence r7 = kotlin.collections.CollectionsKt.asSequence(r7)     // Catch: java.lang.Throwable -> L71
            r8 = 0
            kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfoImpl$lambda-12$$inlined$sortedBy$1 r9 = new kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfoImpl$lambda-12$$inlined$sortedBy$1     // Catch: java.lang.Throwable -> L71
            r9.<init>()     // Catch: java.lang.Throwable -> L71
            java.util.Comparator r9 = (java.util.Comparator) r9     // Catch: java.lang.Throwable -> L71
            kotlin.sequences.Sequence r9 = kotlin.sequences.SequencesKt.sortedWith(r7, r9)     // Catch: java.lang.Throwable -> L71
            kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpDebuggerInfo$$inlined$dumpCoroutinesInfoImpl$1 r7 = new kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpDebuggerInfo$$inlined$dumpCoroutinesInfoImpl$1     // Catch: java.lang.Throwable -> L71
            r7.<init>()     // Catch: java.lang.Throwable -> L71
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7     // Catch: java.lang.Throwable -> L71
            kotlin.sequences.Sequence r7 = kotlin.sequences.SequencesKt.mapNotNull(r9, r7)     // Catch: java.lang.Throwable -> L71
            java.util.List r7 = kotlin.sequences.SequencesKt.toList(r7)     // Catch: java.lang.Throwable -> L71
        L57:
            if (r5 >= r4) goto L5f
            int r5 = r5 + 1
            r3.lock()
            goto L57
        L5f:
            r2.unlock()
            return r7
        L64:
            r7 = 0
            java.lang.String r8 = "Debug probes are not installed"
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L71
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L71
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L71
            throw r7     // Catch: java.lang.Throwable -> L71
        L71:
            r6 = move-exception
        L72:
            if (r5 >= r4) goto L7a
            int r5 = r5 + 1
            r3.lock()
            goto L72
        L7a:
            r2.unlock()
            throw r6
    }

    public final java.util.List<java.lang.StackTraceElement> enhanceStackTraceWithThreadDump(kotlinx.coroutines.debug.internal.DebugCoroutineInfo r3, java.util.List<java.lang.StackTraceElement> r4) {
            r2 = this;
            java.lang.String r0 = r3.getState()
            java.lang.Thread r1 = r3.getLastObservedThread()
            java.util.List r0 = r2.enhanceStackTraceWithThreadDumpImpl(r0, r1, r4)
            return r0
    }

    public final java.lang.String enhanceStackTraceWithThreadDumpAsJson(kotlinx.coroutines.debug.internal.DebugCoroutineInfo r13) {
            r12 = this;
            java.util.List r0 = r13.lastObservedStackTrace()
            java.util.List r0 = r12.enhanceStackTraceWithThreadDump(r13, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r1 = (java.util.List) r1
            java.util.Iterator r2 = r0.iterator()
        L13:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L7b
            java.lang.Object r3 = r2.next()
            java.lang.StackTraceElement r3 = (java.lang.StackTraceElement) r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "\n                {\n                    \"declaringClass\": \""
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = r3.getClassName()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = "\",\n                    \"methodName\": \""
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = r3.getMethodName()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = "\",\n                    \"fileName\": "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = r3.getFileName()
            if (r5 != 0) goto L51
            r5 = 0
            goto L55
        L51:
            java.lang.String r5 = r12.toStringWithQuotes(r5)
        L55:
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = ",\n                    \"lineNumber\": "
            java.lang.StringBuilder r4 = r4.append(r5)
            int r5 = r3.getLineNumber()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = "\n                }\n                "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = kotlin.text.StringsKt.trimIndent(r4)
            r1.add(r4)
            goto L13
        L7b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 91
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r1
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            r10 = 63
            r11 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            java.lang.String r3 = kotlin.collections.CollectionsKt.joinToString$default(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = 93
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            return r2
    }

    public final boolean getEnableCreationStackTraces() {
            r1 = this;
            boolean r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.enableCreationStackTraces
            return r0
    }

    public final boolean getSanitizeStackTraces() {
            r1 = this;
            boolean r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.sanitizeStackTraces
            return r0
    }

    public final java.lang.String hierarchyToString(kotlinx.coroutines.Job r17) {
            r16 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.coroutineStateLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            int r2 = r0.getWriteHoldCount()
            if (r2 != 0) goto L11
            int r2 = r0.getReadHoldCount()
            goto L12
        L11:
            r2 = 0
        L12:
            r4 = 0
        L13:
            if (r4 >= r2) goto L1b
            int r4 = r4 + 1
            r1.unlock()
            goto L13
        L1b:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r4 = r0.writeLock()
            r4.lock()
            r0 = 0
            kotlinx.coroutines.debug.internal.DebugProbesImpl r5 = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE     // Catch: java.lang.Throwable -> Lec
            boolean r5 = r5.isInstalled$kotlinx_coroutines_core()     // Catch: java.lang.Throwable -> Lec
            if (r5 == 0) goto Ldb
            kotlinx.coroutines.debug.internal.DebugProbesImpl r5 = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE     // Catch: java.lang.Throwable -> Lec
            java.util.Set r5 = r5.getCapturedCoroutines()     // Catch: java.lang.Throwable -> Lec
            java.lang.Iterable r5 = (java.lang.Iterable) r5     // Catch: java.lang.Throwable -> Lec
            r6 = 0
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lec
            r7.<init>()     // Catch: java.lang.Throwable -> Lec
            java.util.Collection r7 = (java.util.Collection) r7     // Catch: java.lang.Throwable -> Lec
            r8 = r5
            r9 = 0
            java.util.Iterator r10 = r8.iterator()     // Catch: java.lang.Throwable -> Lec
        L42:
            boolean r11 = r10.hasNext()     // Catch: java.lang.Throwable -> Lec
            if (r11 == 0) goto L69
            java.lang.Object r11 = r10.next()     // Catch: java.lang.Throwable -> Lec
            r12 = r11
            kotlinx.coroutines.debug.internal.DebugProbesImpl$CoroutineOwner r12 = (kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner) r12     // Catch: java.lang.Throwable -> Lec
            r13 = 0
            kotlin.coroutines.Continuation<T> r14 = r12.delegate     // Catch: java.lang.Throwable -> Lec
            kotlin.coroutines.CoroutineContext r14 = r14.getContext()     // Catch: java.lang.Throwable -> Lec
            kotlinx.coroutines.Job$Key r15 = kotlinx.coroutines.Job.Key     // Catch: java.lang.Throwable -> Lec
            kotlin.coroutines.CoroutineContext$Key r15 = (kotlin.coroutines.CoroutineContext.Key) r15     // Catch: java.lang.Throwable -> Lec
            kotlin.coroutines.CoroutineContext$Element r14 = r14.get(r15)     // Catch: java.lang.Throwable -> Lec
            if (r14 == 0) goto L62
            r14 = 1
            goto L63
        L62:
            r14 = 0
        L63:
            if (r14 == 0) goto L42
            r7.add(r11)     // Catch: java.lang.Throwable -> Lec
            goto L42
        L69:
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Throwable -> Lec
            java.lang.Iterable r7 = (java.lang.Iterable) r7     // Catch: java.lang.Throwable -> Lec
            r5 = r7
            r6 = 0
            r7 = 10
            int r7 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r5, r7)     // Catch: java.lang.Throwable -> Lec
            int r7 = kotlin.collections.MapsKt.mapCapacity(r7)     // Catch: java.lang.Throwable -> Lec
            r8 = 16
            int r7 = kotlin.ranges.RangesKt.coerceAtLeast(r7, r8)     // Catch: java.lang.Throwable -> Lec
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> Lec
            r8.<init>(r7)     // Catch: java.lang.Throwable -> Lec
            java.util.Map r8 = (java.util.Map) r8     // Catch: java.lang.Throwable -> Lec
            r9 = r5
            r10 = 0
            java.util.Iterator r11 = r9.iterator()     // Catch: java.lang.Throwable -> Lec
        L8e:
            boolean r12 = r11.hasNext()     // Catch: java.lang.Throwable -> Lec
            if (r12 == 0) goto Lb0
            java.lang.Object r12 = r11.next()     // Catch: java.lang.Throwable -> Lec
            r13 = r12
            kotlinx.coroutines.debug.internal.DebugProbesImpl$CoroutineOwner r13 = (kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner) r13     // Catch: java.lang.Throwable -> Lec
            r14 = 0
            kotlin.coroutines.Continuation<T> r15 = r13.delegate     // Catch: java.lang.Throwable -> Lec
            kotlin.coroutines.CoroutineContext r15 = r15.getContext()     // Catch: java.lang.Throwable -> Lec
            kotlinx.coroutines.Job r15 = kotlinx.coroutines.JobKt.getJob(r15)     // Catch: java.lang.Throwable -> Lec
            r13 = r12
            kotlinx.coroutines.debug.internal.DebugProbesImpl$CoroutineOwner r13 = (kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner) r13     // Catch: java.lang.Throwable -> Lec
            r14 = 0
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r3 = r13.info     // Catch: java.lang.Throwable -> Lec
            r8.put(r15, r3)     // Catch: java.lang.Throwable -> Lec
            goto L8e
        Lb0:
            r3 = r8
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lec
            r5.<init>()     // Catch: java.lang.Throwable -> Lec
            r6 = r5
            r7 = 0
            kotlinx.coroutines.debug.internal.DebugProbesImpl r8 = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE     // Catch: java.lang.Throwable -> Lec
            java.lang.String r9 = ""
            r10 = r17
            r8.build(r10, r3, r6, r9)     // Catch: java.lang.Throwable -> Lea
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> Lea
            java.lang.String r6 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)     // Catch: java.lang.Throwable -> Lea
            r3 = 0
        Lcf:
            if (r3 >= r2) goto Ld7
            int r3 = r3 + 1
            r1.lock()
            goto Lcf
        Ld7:
            r4.unlock()
            return r5
        Ldb:
            r10 = r17
            r3 = 0
            java.lang.String r5 = "Debug probes are not installed"
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lea
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> Lea
            r3.<init>(r5)     // Catch: java.lang.Throwable -> Lea
            throw r3     // Catch: java.lang.Throwable -> Lea
        Lea:
            r0 = move-exception
            goto Lef
        Lec:
            r0 = move-exception
            r10 = r17
        Lef:
            r3 = 0
        Lf0:
            if (r3 >= r2) goto Lf8
            int r3 = r3 + 1
            r1.lock()
            goto Lf0
        Lf8:
            r4.unlock()
            throw r0
    }

    public final void install() {
            r7 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.coroutineStateLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            int r2 = r0.getWriteHoldCount()
            r3 = 0
            if (r2 != 0) goto L12
            int r2 = r0.getReadHoldCount()
            goto L13
        L12:
            r2 = r3
        L13:
            r4 = r3
        L14:
            if (r4 >= r2) goto L1c
            int r4 = r4 + 1
            r1.unlock()
            goto L14
        L1c:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            r4 = 0
            int r5 = kotlinx.coroutines.debug.internal.DebugProbesImpl.installations     // Catch: java.lang.Throwable -> L70
            r6 = 1
            int r5 = r5 + r6
            kotlinx.coroutines.debug.internal.DebugProbesImpl.installations = r5     // Catch: java.lang.Throwable -> L70
            int r5 = kotlinx.coroutines.debug.internal.DebugProbesImpl.installations     // Catch: java.lang.Throwable -> L70
            if (r5 <= r6) goto L3a
        L2e:
            if (r3 >= r2) goto L36
            int r3 = r3 + 1
            r1.lock()
            goto L2e
        L36:
            r0.unlock()
            return
        L3a:
            kotlinx.coroutines.debug.internal.DebugProbesImpl r5 = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE     // Catch: java.lang.Throwable -> L70
            r5.startWeakRefCleanerThread()     // Catch: java.lang.Throwable -> L70
            kotlinx.coroutines.debug.internal.AgentInstallationType r5 = kotlinx.coroutines.debug.internal.AgentInstallationType.INSTANCE     // Catch: java.lang.Throwable -> L70
            boolean r5 = r5.isInstalledStatically$kotlinx_coroutines_core()     // Catch: java.lang.Throwable -> L70
            if (r5 == 0) goto L53
        L47:
            if (r3 >= r2) goto L4f
            int r3 = r3 + 1
            r1.lock()
            goto L47
        L4f:
            r0.unlock()
            return
        L53:
            kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> r5 = kotlinx.coroutines.debug.internal.DebugProbesImpl.dynamicAttach     // Catch: java.lang.Throwable -> L70
            if (r5 != 0) goto L58
        L57:
            goto L60
        L58:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Throwable -> L70
            r5.invoke(r6)     // Catch: java.lang.Throwable -> L70
            goto L57
        L60:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L70
        L64:
            if (r3 >= r2) goto L6c
            int r3 = r3 + 1
            r1.lock()
            goto L64
        L6c:
            r0.unlock()
            return
        L70:
            r4 = move-exception
        L71:
            if (r3 >= r2) goto L79
            int r3 = r3 + 1
            r1.lock()
            goto L71
        L79:
            r0.unlock()
            throw r4
    }

    public final boolean isInstalled$kotlinx_coroutines_core() {
            r1 = this;
            int r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.installations
            if (r0 <= 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public final <T> kotlin.coroutines.Continuation<T> probeCoroutineCreated$kotlinx_coroutines_core(kotlin.coroutines.Continuation<? super T> r4) {
            r3 = this;
            boolean r0 = r3.isInstalled$kotlinx_coroutines_core()
            if (r0 != 0) goto L7
            return r4
        L7:
            kotlinx.coroutines.debug.internal.DebugProbesImpl$CoroutineOwner r0 = r3.owner(r4)
            if (r0 == 0) goto Le
            return r4
        Le:
            boolean r1 = kotlinx.coroutines.debug.internal.DebugProbesImpl.enableCreationStackTraces
            if (r1 == 0) goto L22
            java.lang.Exception r1 = new java.lang.Exception
            r1.<init>()
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.util.List r1 = r3.sanitizeStackTrace(r1)
            kotlinx.coroutines.debug.internal.StackTraceFrame r1 = r3.toStackTraceFrame(r1)
            goto L26
        L22:
            r1 = 0
            r2 = r1
            kotlinx.coroutines.debug.internal.StackTraceFrame r2 = (kotlinx.coroutines.debug.internal.StackTraceFrame) r2
        L26:
            kotlin.coroutines.Continuation r2 = r3.createOwner(r4, r1)
            return r2
    }

    public final void probeCoroutineResumed$kotlinx_coroutines_core(kotlin.coroutines.Continuation<?> r2) {
            r1 = this;
            java.lang.String r0 = "RUNNING"
            r1.updateState(r2, r0)
            return
    }

    public final void probeCoroutineSuspended$kotlinx_coroutines_core(kotlin.coroutines.Continuation<?> r2) {
            r1 = this;
            java.lang.String r0 = "SUSPENDED"
            r1.updateState(r2, r0)
            return
    }

    public final void setEnableCreationStackTraces(boolean r1) {
            r0 = this;
            kotlinx.coroutines.debug.internal.DebugProbesImpl.enableCreationStackTraces = r1
            return
    }

    public final void setSanitizeStackTraces(boolean r1) {
            r0 = this;
            kotlinx.coroutines.debug.internal.DebugProbesImpl.sanitizeStackTraces = r1
            return
    }

    public final void uninstall() {
            r7 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.coroutineStateLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            int r2 = r0.getWriteHoldCount()
            r3 = 0
            if (r2 != 0) goto L12
            int r2 = r0.getReadHoldCount()
            goto L13
        L12:
            r2 = r3
        L13:
            r4 = r3
        L14:
            if (r4 >= r2) goto L1c
            int r4 = r4 + 1
            r1.unlock()
            goto L14
        L1c:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            r4 = 0
            kotlinx.coroutines.debug.internal.DebugProbesImpl r5 = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE     // Catch: java.lang.Throwable -> L8f
            boolean r5 = r5.isInstalled$kotlinx_coroutines_core()     // Catch: java.lang.Throwable -> L8f
            if (r5 == 0) goto L82
            int r5 = kotlinx.coroutines.debug.internal.DebugProbesImpl.installations     // Catch: java.lang.Throwable -> L8f
            int r5 = r5 + (-1)
            kotlinx.coroutines.debug.internal.DebugProbesImpl.installations = r5     // Catch: java.lang.Throwable -> L8f
            int r5 = kotlinx.coroutines.debug.internal.DebugProbesImpl.installations     // Catch: java.lang.Throwable -> L8f
            if (r5 == 0) goto L42
        L36:
            if (r3 >= r2) goto L3e
            int r3 = r3 + 1
            r1.lock()
            goto L36
        L3e:
            r0.unlock()
            return
        L42:
            kotlinx.coroutines.debug.internal.DebugProbesImpl r5 = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE     // Catch: java.lang.Throwable -> L8f
            r5.stopWeakRefCleanerThread()     // Catch: java.lang.Throwable -> L8f
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap<kotlinx.coroutines.debug.internal.DebugProbesImpl$CoroutineOwner<?>, java.lang.Boolean> r5 = kotlinx.coroutines.debug.internal.DebugProbesImpl.capturedCoroutinesMap     // Catch: java.lang.Throwable -> L8f
            r5.clear()     // Catch: java.lang.Throwable -> L8f
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap<kotlin.coroutines.jvm.internal.CoroutineStackFrame, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl> r5 = kotlinx.coroutines.debug.internal.DebugProbesImpl.callerInfoCache     // Catch: java.lang.Throwable -> L8f
            r5.clear()     // Catch: java.lang.Throwable -> L8f
            kotlinx.coroutines.debug.internal.AgentInstallationType r5 = kotlinx.coroutines.debug.internal.AgentInstallationType.INSTANCE     // Catch: java.lang.Throwable -> L8f
            boolean r5 = r5.isInstalledStatically$kotlinx_coroutines_core()     // Catch: java.lang.Throwable -> L8f
            if (r5 == 0) goto L65
        L59:
            if (r3 >= r2) goto L61
            int r3 = r3 + 1
            r1.lock()
            goto L59
        L61:
            r0.unlock()
            return
        L65:
            kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> r5 = kotlinx.coroutines.debug.internal.DebugProbesImpl.dynamicAttach     // Catch: java.lang.Throwable -> L8f
            if (r5 != 0) goto L6a
        L69:
            goto L72
        L6a:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L8f
            r5.invoke(r6)     // Catch: java.lang.Throwable -> L8f
            goto L69
        L72:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L8f
        L76:
            if (r3 >= r2) goto L7e
            int r3 = r3 + 1
            r1.lock()
            goto L76
        L7e:
            r0.unlock()
            return
        L82:
            r5 = 0
            java.lang.String r6 = "Agent was not installed"
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L8f
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L8f
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L8f
            throw r5     // Catch: java.lang.Throwable -> L8f
        L8f:
            r4 = move-exception
        L90:
            if (r3 >= r2) goto L98
            int r3 = r3 + 1
            r1.lock()
            goto L90
        L98:
            r0.unlock()
            throw r4
    }
}
