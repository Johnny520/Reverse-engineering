package androidx.compose.ui.platform.actionmodecallback;

import android.R;
import io.ktor.util.C4211;
import kotlin.Metadata;
import kotlin.enums.AbstractC4364;
import kotlin.enums.InterfaceC4365;
import net.bytebuddy.description.method.MethodDescription;
import p213.AbstractC7952;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u000f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/platform/actionmodecallback/MenuItemOption;", "", "id", "", "order", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;III)V", "getId", "()I", "getOrder", "Copy", "Paste", "Cut", "SelectAll", "Autofill", "titleResource", "getTitleResource", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MenuItemOption {
    private static final /* synthetic */ InterfaceC4365 $ENTRIES;
    private static final /* synthetic */ MenuItemOption[] $VALUES;
    private final int id;
    private final int order;
    public static final MenuItemOption Copy = new MenuItemOption("Copy", 0, R.id.copy, 0);
    public static final MenuItemOption Paste = new MenuItemOption("Paste", 1, R.id.paste, 1);
    public static final MenuItemOption Cut = new MenuItemOption("Cut", 2, R.id.cut, 2);
    public static final MenuItemOption SelectAll = new MenuItemOption("SelectAll", 3, R.id.selectAll, 3);
    public static final MenuItemOption Autofill = new MenuItemOption("Autofill", 4, R.id.autofill, 4);

    private static final /* synthetic */ MenuItemOption[] $values() {
        return new MenuItemOption[]{Copy, Paste, Cut, SelectAll, Autofill};
    }

    static {
        MenuItemOption[] menuItemOptionArr$values = $values();
        $VALUES = menuItemOptionArr$values;
        $ENTRIES = AbstractC4364.m8866(menuItemOptionArr$values);
    }

    private MenuItemOption(String str, int i, int i2, int i3) {
        this.id = i2;
        this.order = i3;
    }

    public static InterfaceC4365 getEntries() {
        return $ENTRIES;
    }

    public static MenuItemOption valueOf(String str) {
        return (MenuItemOption) Enum.valueOf(MenuItemOption.class, str);
    }

    public static MenuItemOption[] values() {
        return (MenuItemOption[]) $VALUES.clone();
    }

    public final int getId() {
        return this.id;
    }

    public final int getOrder() {
        return this.order;
    }

    public final int getTitleResource() {
        int i = AbstractC7952.f22018[ordinal()];
        if (i == 1) {
            return R.string.copy;
        }
        if (i == 2) {
            return R.string.paste;
        }
        if (i == 3) {
            return R.string.cut;
        }
        if (i == 4) {
            return R.string.selectAll;
        }
        if (i == 5) {
            return R.string.autofill;
        }
        C4211.m8611();
        return 0;
    }
}
