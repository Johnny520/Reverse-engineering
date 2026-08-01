package androidx.compose.p001ui.graphics;

import kotlin.Metadata;
import kotlin.enums.AbstractC5196;
import kotlin.enums.InterfaceC5197;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m151d2 = {"androidx/compose/ui/graphics/PathIterator$ConicEvaluation", "", "Landroidx/compose/ui/graphics/PathIterator$ConicEvaluation;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "AsConic", "AsQuadratics", "ui-graphics"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
public final class PathIterator$ConicEvaluation {
    private static final /* synthetic */ InterfaceC5197 $ENTRIES;
    private static final /* synthetic */ PathIterator$ConicEvaluation[] $VALUES;
    public static final PathIterator$ConicEvaluation AsConic = new PathIterator$ConicEvaluation("AsConic", 0);
    public static final PathIterator$ConicEvaluation AsQuadratics = new PathIterator$ConicEvaluation("AsQuadratics", 1);

    private static final /* synthetic */ PathIterator$ConicEvaluation[] $values() {
        return new PathIterator$ConicEvaluation[]{AsConic, AsQuadratics};
    }

    static {
        PathIterator$ConicEvaluation[] pathIterator$ConicEvaluationArr$values = $values();
        $VALUES = pathIterator$ConicEvaluationArr$values;
        $ENTRIES = AbstractC5196.m9425(pathIterator$ConicEvaluationArr$values);
    }

    private PathIterator$ConicEvaluation(String str, int i) {
    }

    public static InterfaceC5197 getEntries() {
        return $ENTRIES;
    }

    public static PathIterator$ConicEvaluation valueOf(String str) {
        return (PathIterator$ConicEvaluation) Enum.valueOf(PathIterator$ConicEvaluation.class, str);
    }

    public static PathIterator$ConicEvaluation[] values() {
        return (PathIterator$ConicEvaluation[]) $VALUES.clone();
    }
}
