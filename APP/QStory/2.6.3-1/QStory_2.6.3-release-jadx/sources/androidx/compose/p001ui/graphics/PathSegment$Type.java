package androidx.compose.p001ui.graphics;

import kotlin.Metadata;
import kotlin.enums.AbstractC5196;
import kotlin.enums.InterfaceC5197;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m151d2 = {"androidx/compose/ui/graphics/PathSegment$Type", "", "Landroidx/compose/ui/graphics/PathSegment$Type;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "Move", "Line", "Quadratic", "Conic", "Cubic", "Close", "Done", "ui-graphics"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
public final class PathSegment$Type {
    private static final /* synthetic */ InterfaceC5197 $ENTRIES;
    private static final /* synthetic */ PathSegment$Type[] $VALUES;
    public static final PathSegment$Type Move = new PathSegment$Type("Move", 0);
    public static final PathSegment$Type Line = new PathSegment$Type("Line", 1);
    public static final PathSegment$Type Quadratic = new PathSegment$Type("Quadratic", 2);
    public static final PathSegment$Type Conic = new PathSegment$Type("Conic", 3);
    public static final PathSegment$Type Cubic = new PathSegment$Type("Cubic", 4);
    public static final PathSegment$Type Close = new PathSegment$Type("Close", 5);
    public static final PathSegment$Type Done = new PathSegment$Type("Done", 6);

    private static final /* synthetic */ PathSegment$Type[] $values() {
        return new PathSegment$Type[]{Move, Line, Quadratic, Conic, Cubic, Close, Done};
    }

    static {
        PathSegment$Type[] pathSegment$TypeArr$values = $values();
        $VALUES = pathSegment$TypeArr$values;
        $ENTRIES = AbstractC5196.m9425(pathSegment$TypeArr$values);
    }

    private PathSegment$Type(String str, int i) {
    }

    public static InterfaceC5197 getEntries() {
        return $ENTRIES;
    }

    public static PathSegment$Type valueOf(String str) {
        return (PathSegment$Type) Enum.valueOf(PathSegment$Type.class, str);
    }

    public static PathSegment$Type[] values() {
        return (PathSegment$Type[]) $VALUES.clone();
    }
}
