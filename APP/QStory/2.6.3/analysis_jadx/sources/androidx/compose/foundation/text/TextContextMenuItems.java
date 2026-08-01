package androidx.compose.foundation.text;

import android.R;
import android.content.res.Resources;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.ui.platform.AbstractC1835;
import kotlin.Metadata;
import kotlin.enums.AbstractC4364;
import kotlin.enums.InterfaceC4365;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.implementation.auxiliary.TypeProxy;
import p121.AbstractC7386;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/text/TextContextMenuItems;", "", "", "key", "stringId", "drawableId", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;ILjava/lang/Object;II)V", "", "resolvedString", "(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)Ljava/lang/String;", TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR, "getKey", "()Ljava/lang/Object;", "I", "getStringId-9Hzcbyc", "()I", "getDrawableId-3I4p1mQ", "Cut", "Copy", "Paste", "SelectAll", "Autofill", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TextContextMenuItems {
    private static final /* synthetic */ InterfaceC4365 $ENTRIES;
    private static final /* synthetic */ TextContextMenuItems[] $VALUES;
    private final int drawableId;
    private final Object key;
    private final int stringId;
    public static final TextContextMenuItems Cut = new TextContextMenuItems("Cut", 0, AbstractC7386.f20029, R.string.cut, R.attr.actionModeCutDrawable);
    public static final TextContextMenuItems Copy = new TextContextMenuItems("Copy", 1, AbstractC7386.f20028, R.string.copy, R.attr.actionModeCopyDrawable);
    public static final TextContextMenuItems Paste = new TextContextMenuItems("Paste", 2, AbstractC7386.f20027, R.string.paste, R.attr.actionModePasteDrawable);
    public static final TextContextMenuItems SelectAll = new TextContextMenuItems("SelectAll", 3, AbstractC7386.f20026, R.string.selectAll, R.attr.actionModeSelectAllDrawable);
    public static final TextContextMenuItems Autofill = new TextContextMenuItems("Autofill", 4, AbstractC7386.f20025, R.string.autofill, 0);

    private static final /* synthetic */ TextContextMenuItems[] $values() {
        return new TextContextMenuItems[]{Cut, Copy, Paste, SelectAll, Autofill};
    }

    static {
        TextContextMenuItems[] textContextMenuItemsArr$values = $values();
        $VALUES = textContextMenuItemsArr$values;
        $ENTRIES = AbstractC4364.m8866(textContextMenuItemsArr$values);
    }

    private TextContextMenuItems(String str, int i, Object obj, int i2, int i3) {
        this.key = obj;
        this.stringId = i2;
        this.drawableId = i3;
    }

    public static InterfaceC4365 getEntries() {
        return $ENTRIES;
    }

    public static TextContextMenuItems valueOf(String str) {
        return (TextContextMenuItems) Enum.valueOf(TextContextMenuItems.class, str);
    }

    public static TextContextMenuItems[] values() {
        return (TextContextMenuItems[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: getDrawableId-3I4p1mQ, reason: not valid java name and from getter */
    public final int getDrawableId() {
        return this.drawableId;
    }

    public final Object getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: getStringId-9Hzcbyc, reason: not valid java name and from getter */
    public final int getStringId() {
        return this.stringId;
    }

    public final String resolvedString(InterfaceC1373 interfaceC1373, int i) {
        return ((Resources) ((C1324) interfaceC1373).m2383(AbstractC1835.f5335)).getString(this.stringId);
    }
}
