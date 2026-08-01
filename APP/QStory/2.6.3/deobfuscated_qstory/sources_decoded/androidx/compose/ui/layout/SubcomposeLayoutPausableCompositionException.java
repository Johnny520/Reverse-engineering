package androidx.compose.ui.layout;

import androidx.collection.AbstractC0278;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC4344;
import kotlin.collections.builders.ListBuilder;
import kotlin.text.AbstractC5145;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.implementation.auxiliary.TypeProxy;
import p009.AbstractC6183;
import p034.AbstractC6347;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\f8VX\u0096\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/layout/SubcomposeLayoutPausableCompositionException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "Landroidx/collection/飘花落叶言子楪苏兰哲世;", "operations", "", "slotId", "", "cause", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroidx/collection/飘花落叶言子楪苏兰哲世;Ljava/lang/Object;Ljava/lang/Throwable;)V", "", "", "operationsList", "()Ljava/util/List;", "Landroidx/collection/飘花落叶言子楪苏兰哲世;", TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR, "getMessage", "()Ljava/lang/String;", "getMessage$annotations", "()V", "message", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class SubcomposeLayoutPausableCompositionException extends IllegalStateException {
    private final AbstractC0278 operations;
    private final Object slotId;

    public SubcomposeLayoutPausableCompositionException(AbstractC0278 abstractC0278, Object obj, Throwable th) {
        super(th);
        this.operations = abstractC0278;
        this.slotId = obj;
    }

    private final List<String> operationsList() {
        ListBuilder listBuilderM11911 = AbstractC6347.m11911();
        for (int i = this.operations.f985 - 1; i >= 0; i += -1) {
            int iM856 = this.operations.m856(i);
            listBuilderM11911.add(i + ": " + (iM856 == 0 ? "CancelPausedPrecomposition" : iM856 == 1 ? "ReuseForceSyncDeactivation" : iM856 == 2 ? "ReuseScheduleOutOfFrameDeactivation" : iM856 == 3 ? "ReuseSyncDeactivation" : iM856 == 4 ? "ReuseDeactivationViaHost" : iM856 == 5 ? "TookFromPrecomposeMap" : iM856 == 6 ? "Subcompose" : iM856 == 7 ? "SubcomposeNew" : iM856 == 8 ? "SubcomposePausable" : iM856 == 9 ? "SubcomposeForceReuse" : iM856 == 10 ? "DeactivateOutOfFrame" : iM856 == 11 ? "DeactivateOutOfFrameCancelled" : iM856 == 12 ? "SlotToReusedFromOnDeactivate" : iM856 == 13 ? "SlotToReusedFromOnReuse" : iM856 == 14 ? "Reused" : iM856 == 15 ? "ResumePaused" : iM856 == 16 ? "PausePaused" : iM856 == 17 ? "ApplyPaused" : AbstractC6183.m11588(iM856, "Unexpected ")));
        }
        return listBuilderM11911.build();
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return AbstractC5145.m10177("\n            |slotid=" + this.slotId + ". Last operations:\n            |" + AbstractC4344.m8810(operationsList(), "\n", null, null, null, 62) + "\n            ");
    }

    public static /* synthetic */ void getMessage$annotations() {
    }
}
