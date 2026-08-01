package lin.xposed.hook.view.main;

import kotlin.Metadata;
import kotlin.enums.AbstractC5196;
import kotlin.enums.InterfaceC5197;
import net.bytebuddy.description.method.MethodDescription;
import p303.AbstractC9234;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m151d2 = {"lin/xposed/hook/view/main/SearchHelper$MatchType", "", "Llin/xposed/hook/view/main/SearchHelper$MatchType;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "FUNCTION", "DIRECTORY", "GROUP", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class SearchHelper$MatchType {
    private static final /* synthetic */ InterfaceC5197 $ENTRIES;
    private static final /* synthetic */ SearchHelper$MatchType[] $VALUES;
    public static final SearchHelper$MatchType FUNCTION = new SearchHelper$MatchType(AbstractC9234.m14531(1310), 0);
    public static final SearchHelper$MatchType DIRECTORY = new SearchHelper$MatchType(AbstractC9234.m14531(1311), 1);
    public static final SearchHelper$MatchType GROUP = new SearchHelper$MatchType(AbstractC9234.m14532("喵喵呜呜喵呜喵喵~喵喵呜喵喵呜呜呜~喵喵呜呜喵呜喵呜~喵喵呜呜呜呜喵呜~喵喵呜呜喵呜喵呜"), 2);

    private static final /* synthetic */ SearchHelper$MatchType[] $values() {
        return new SearchHelper$MatchType[]{FUNCTION, DIRECTORY, GROUP};
    }

    static {
        SearchHelper$MatchType[] searchHelper$MatchTypeArr$values = $values();
        $VALUES = searchHelper$MatchTypeArr$values;
        $ENTRIES = AbstractC5196.m9425(searchHelper$MatchTypeArr$values);
    }

    private SearchHelper$MatchType(String str, int i) {
    }

    public static InterfaceC5197 getEntries() {
        return $ENTRIES;
    }

    public static SearchHelper$MatchType valueOf(String str) {
        return (SearchHelper$MatchType) Enum.valueOf(SearchHelper$MatchType.class, str);
    }

    public static SearchHelper$MatchType[] values() {
        return (SearchHelper$MatchType[]) $VALUES.clone();
    }
}
