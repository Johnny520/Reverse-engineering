package androidx.fragment.app;

import android.view.View;
import androidx.core.view.AbstractC3103;
import java.util.Collection;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.collections.AbstractC5176;
import kotlin.jvm.internal.Lambda;
import p068.InterfaceC7387;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010'\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\"\u0010\u0002\u001a\u001e\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u00060\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, m151d2 = {"<anonymous>", "", "entry", "", "", "kotlin.jvm.PlatformType", "Landroid/view/View;", "invoke", "(Ljava/util/Map$Entry;)Ljava/lang/Boolean;"}, m152k = 3, m153mv = {1, 8, 0}, m155xi = 48)
final class DefaultSpecialEffectsController$retainMatchingViews$1 extends Lambda implements InterfaceC7387 {
    final /* synthetic */ Collection<String> $names;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultSpecialEffectsController$retainMatchingViews$1(Collection<String> collection) {
        super(1);
        this.$names = collection;
    }

    @Override // p068.InterfaceC7387
    public final Boolean invoke(Map.Entry<String, View> entry) {
        entry.getClass();
        Collection<String> collection = this.$names;
        View value = entry.getValue();
        WeakHashMap weakHashMap = AbstractC3103.f6939;
        return Boolean.valueOf(AbstractC5176.m9365(collection, value.getTransitionName()));
    }
}
