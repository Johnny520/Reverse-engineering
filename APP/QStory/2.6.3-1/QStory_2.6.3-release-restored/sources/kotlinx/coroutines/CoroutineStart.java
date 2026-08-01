package kotlinx.coroutines;

import androidx.compose.foundation.draganddrop.AbstractC1298;
import androidx.window.area.AbstractC3400;
import io.ktor.util.C5043;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.enums.AbstractC5196;
import kotlin.enums.InterfaceC5197;
import kotlin.jvm.internal.AbstractC5220;
import kotlinx.coroutines.internal.AbstractC6185;
import net.bytebuddy.description.method.MethodDescription;
import p068.InterfaceC7383;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JV\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00052\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00062\u0006\u0010\n\u001a\u00028\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0087\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, m151d2 = {"Lkotlinx/coroutines/CoroutineStart;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "R", "T", "Lkotlin/Function2;", "Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;", "", "block", "receiver", "completion", "Lkotlin/飘花落叶言子楪兰苏哲世;", "invoke", "(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V", "", "isLazy", "()Z", "isLazy$annotations", "()V", "DEFAULT", "LAZY", "ATOMIC", "UNDISPATCHED", "kotlinx-coroutines-core"}, m152k = 1, m153mv = {2, 2, 0}, m155xi = 48)
public final class CoroutineStart {
    private static final /* synthetic */ InterfaceC5197 $ENTRIES;
    private static final /* synthetic */ CoroutineStart[] $VALUES;
    public static final CoroutineStart DEFAULT = new CoroutineStart("DEFAULT", 0);
    public static final CoroutineStart LAZY = new CoroutineStart("LAZY", 1);
    public static final CoroutineStart ATOMIC = new CoroutineStart("ATOMIC", 2);
    public static final CoroutineStart UNDISPATCHED = new CoroutineStart("UNDISPATCHED", 3);

    private static final /* synthetic */ CoroutineStart[] $values() {
        return new CoroutineStart[]{DEFAULT, LAZY, ATOMIC, UNDISPATCHED};
    }

    static {
        CoroutineStart[] coroutineStartArr$values = $values();
        $VALUES = coroutineStartArr$values;
        $ENTRIES = AbstractC5196.m9425(coroutineStartArr$values);
    }

    private CoroutineStart(String str, int i) {
    }

    public static InterfaceC5197 getEntries() {
        return $ENTRIES;
    }

    public static CoroutineStart valueOf(String str) {
        return (CoroutineStart) Enum.valueOf(CoroutineStart.class, str);
    }

    public static CoroutineStart[] values() {
        return (CoroutineStart[]) $VALUES.clone();
    }

    public final <R, T> void invoke(InterfaceC7383 block, R receiver, InterfaceC5189<? super T> completion) {
        Object objInvoke;
        int i = AbstractC6232.f15388[ordinal()];
        if (i == 1) {
            AbstractC1298.m1705(block, receiver, completion);
            return;
        }
        if (i == 2) {
            block.getClass();
            completion.getClass();
            AbstractC3400.m5624(AbstractC3400.m5651(block, receiver, completion)).resumeWith(Result.m9304constructorimpl(C6008.f15084));
            return;
        }
        if (i != 3) {
            if (i == 4) {
                return;
            }
            C5043.m9170();
            return;
        }
        completion.getClass();
        try {
            InterfaceC5192 context = completion.getContext();
            Object objM10927 = AbstractC6185.m10927(context, null);
            try {
                if (block instanceof BaseContinuationImpl) {
                    AbstractC5220.m9447(2, block);
                    objInvoke = block.invoke(receiver, completion);
                } else {
                    objInvoke = AbstractC3400.m5626(block, receiver, completion);
                }
                AbstractC6185.m10930(context, objM10927);
                if (objInvoke != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    completion.resumeWith(Result.m9304constructorimpl(objInvoke));
                }
            } catch (Throwable th) {
                AbstractC6185.m10930(context, objM10927);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (th instanceof DispatchException) {
                th = ((DispatchException) th).getCause();
            }
            completion.resumeWith(Result.m9304constructorimpl(AbstractC6017.m10770(th)));
        }
    }

    public final boolean isLazy() {
        return this == LAZY;
    }

    public static /* synthetic */ void isLazy$annotations() {
    }
}
