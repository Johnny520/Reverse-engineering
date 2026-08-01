package androidx.compose.p001ui.layout;

import androidx.collection.AbstractC1125;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5176;
import kotlin.collections.builders.ListBuilder;
import kotlin.text.AbstractC5977;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.implementation.auxiliary.TypeProxy;
import p025.AbstractC7012;
import p050.AbstractC7176;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\f8VX\u0096\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m151d2 = {"Landroidx/compose/ui/layout/SubcomposeLayoutPausableCompositionException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "Landroidx/collection/飘花落叶言子楪苏兰哲世;", "operations", "", "slotId", "", "cause", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroidx/collection/飘花落叶言子楪苏兰哲世;Ljava/lang/Object;Ljava/lang/Throwable;)V", "", "", "operationsList", "()Ljava/util/List;", "Landroidx/collection/飘花落叶言子楪苏兰哲世;", TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR, "getMessage", "()Ljava/lang/String;", "getMessage$annotations", "()V", "message", "ui"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
final class SubcomposeLayoutPausableCompositionException extends IllegalStateException {
    private final AbstractC1125 operations;
    private final Object slotId;

    public SubcomposeLayoutPausableCompositionException(AbstractC1125 abstractC1125, Object obj, Throwable th) {
        super(th);
        this.operations = abstractC1125;
        this.slotId = obj;
    }

    private final List<String> operationsList() {
        ListBuilder listBuilderM12470 = AbstractC7176.m12470();
        for (int i = this.operations.f1330 - 1; i >= 0; i += -1) {
            int iM1416 = this.operations.m1416(i);
            listBuilderM12470.add(i + ": " + (iM1416 == 0 ? "CancelPausedPrecomposition" : iM1416 == 1 ? "ReuseForceSyncDeactivation" : iM1416 == 2 ? "ReuseScheduleOutOfFrameDeactivation" : iM1416 == 3 ? "ReuseSyncDeactivation" : iM1416 == 4 ? "ReuseDeactivationViaHost" : iM1416 == 5 ? "TookFromPrecomposeMap" : iM1416 == 6 ? "Subcompose" : iM1416 == 7 ? "SubcomposeNew" : iM1416 == 8 ? "SubcomposePausable" : iM1416 == 9 ? "SubcomposeForceReuse" : iM1416 == 10 ? "DeactivateOutOfFrame" : iM1416 == 11 ? "DeactivateOutOfFrameCancelled" : iM1416 == 12 ? "SlotToReusedFromOnDeactivate" : iM1416 == 13 ? "SlotToReusedFromOnReuse" : iM1416 == 14 ? "Reused" : iM1416 == 15 ? "ResumePaused" : iM1416 == 16 ? "PausePaused" : iM1416 == 17 ? "ApplyPaused" : AbstractC7012.m12147(iM1416, "Unexpected ")));
        }
        return listBuilderM12470.build();
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return AbstractC5977.m10736("\n            |slotid=" + this.slotId + ". Last operations:\n            |" + AbstractC5176.m9369(operationsList(), "\n", null, null, null, 62) + "\n            ");
    }

    public static /* synthetic */ void getMessage$annotations() {
    }
}
