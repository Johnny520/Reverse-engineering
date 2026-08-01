package lin.xposed.hook.view.main;

import com.bumptech.glide.AbstractC3056;
import kotlin.Metadata;
import kotlin.enums.AbstractC4363;
import kotlin.enums.InterfaceC4364;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"lin/xposed/hook/view/main/SearchHelper$MatchType", "", "Llin/xposed/hook/view/main/SearchHelper$MatchType;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "FUNCTION", "DIRECTORY", "GROUP", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class SearchHelper$MatchType {
    private static final /* synthetic */ InterfaceC4364 $ENTRIES;
    private static final /* synthetic */ SearchHelper$MatchType[] $VALUES;
    public static final SearchHelper$MatchType FUNCTION = new SearchHelper$MatchType(AbstractC3056.m6668(-3937688998458426791L), 0);
    public static final SearchHelper$MatchType DIRECTORY = new SearchHelper$MatchType(AbstractC3056.m6668(-3937688899674178983L), 1);
    public static final SearchHelper$MatchType GROUP = new SearchHelper$MatchType(AbstractC3056.m6668(-3937688942623851943L), 2);

    private static final /* synthetic */ SearchHelper$MatchType[] $values() {
        return new SearchHelper$MatchType[]{FUNCTION, DIRECTORY, GROUP};
    }

    static {
        SearchHelper$MatchType[] searchHelper$MatchTypeArr$values = $values();
        $VALUES = searchHelper$MatchTypeArr$values;
        $ENTRIES = AbstractC4363.m8876(searchHelper$MatchTypeArr$values);
    }

    private SearchHelper$MatchType(String str, int i) {
    }

    public static InterfaceC4364 getEntries() {
        return $ENTRIES;
    }

    public static SearchHelper$MatchType valueOf(String str) {
        return (SearchHelper$MatchType) Enum.valueOf(SearchHelper$MatchType.class, str);
    }

    public static SearchHelper$MatchType[] values() {
        return (SearchHelper$MatchType[]) $VALUES.clone();
    }
}
