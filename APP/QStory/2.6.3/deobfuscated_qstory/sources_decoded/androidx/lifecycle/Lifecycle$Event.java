package androidx.lifecycle;

import androidx.collection.C0276;
import io.ktor.util.C4211;
import kotlin.Metadata;
import kotlin.enums.AbstractC4364;
import kotlin.enums.InterfaceC4365;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0011\u0010\b\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"androidx/lifecycle/Lifecycle$Event", "", "Landroidx/lifecycle/Lifecycle$Event;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "Landroidx/lifecycle/Lifecycle$State;", "getTargetState", "()Landroidx/lifecycle/Lifecycle$State;", "targetState", "Companion", "androidx/lifecycle/飘花落叶言子楪兰世哲苏", "ON_CREATE", "ON_START", "ON_RESUME", "ON_PAUSE", "ON_STOP", "ON_DESTROY", "ON_ANY", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Lifecycle$Event {
    private static final /* synthetic */ InterfaceC4365 $ENTRIES;
    private static final /* synthetic */ Lifecycle$Event[] $VALUES;
    public static final C2397 Companion;
    public static final Lifecycle$Event ON_CREATE = new Lifecycle$Event("ON_CREATE", 0);
    public static final Lifecycle$Event ON_START = new Lifecycle$Event("ON_START", 1);
    public static final Lifecycle$Event ON_RESUME = new Lifecycle$Event("ON_RESUME", 2);
    public static final Lifecycle$Event ON_PAUSE = new Lifecycle$Event("ON_PAUSE", 3);
    public static final Lifecycle$Event ON_STOP = new Lifecycle$Event("ON_STOP", 4);
    public static final Lifecycle$Event ON_DESTROY = new Lifecycle$Event("ON_DESTROY", 5);
    public static final Lifecycle$Event ON_ANY = new Lifecycle$Event("ON_ANY", 6);

    private static final /* synthetic */ Lifecycle$Event[] $values() {
        return new Lifecycle$Event[]{ON_CREATE, ON_START, ON_RESUME, ON_PAUSE, ON_STOP, ON_DESTROY, ON_ANY};
    }

    static {
        Lifecycle$Event[] lifecycle$EventArr$values = $values();
        $VALUES = lifecycle$EventArr$values;
        $ENTRIES = AbstractC4364.m8866(lifecycle$EventArr$values);
        Companion = new C2397();
    }

    private Lifecycle$Event(String str, int i) {
    }

    public static final Lifecycle$Event downFrom(Lifecycle$State lifecycle$State) {
        Companion.getClass();
        return C2397.m4512(lifecycle$State);
    }

    public static final Lifecycle$Event downTo(Lifecycle$State lifecycle$State) {
        Companion.getClass();
        lifecycle$State.getClass();
        int i = AbstractC2398.f7038[lifecycle$State.ordinal()];
        if (i == 1) {
            return ON_STOP;
        }
        if (i == 2) {
            return ON_PAUSE;
        }
        if (i != 4) {
            return null;
        }
        return ON_DESTROY;
    }

    public static InterfaceC4365 getEntries() {
        return $ENTRIES;
    }

    public static final Lifecycle$Event upFrom(Lifecycle$State lifecycle$State) {
        Companion.getClass();
        return C2397.m4511(lifecycle$State);
    }

    public static final Lifecycle$Event upTo(Lifecycle$State lifecycle$State) {
        Companion.getClass();
        return C2397.m4510(lifecycle$State);
    }

    public static Lifecycle$Event valueOf(String str) {
        return (Lifecycle$Event) Enum.valueOf(Lifecycle$Event.class, str);
    }

    public static Lifecycle$Event[] values() {
        return (Lifecycle$Event[]) $VALUES.clone();
    }

    public final Lifecycle$State getTargetState() {
        switch (AbstractC2401.f7045[ordinal()]) {
            case 1:
            case 2:
                return Lifecycle$State.CREATED;
            case 3:
            case 4:
                return Lifecycle$State.STARTED;
            case 5:
                return Lifecycle$State.RESUMED;
            case 6:
                return Lifecycle$State.DESTROYED;
            case 7:
                C0276.m838(this, " has no target state");
                return null;
            default:
                C4211.m8611();
                return null;
        }
    }
}
