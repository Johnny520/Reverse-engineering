package androidx.fragment.app;

import android.view.View;
import androidx.core.view.AbstractC2270;
import java.util.Collection;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6558;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010'\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\"\u0010\u0002\u001a\u001e\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u00060\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "entry", "", "", "kotlin.jvm.PlatformType", "Landroid/view/View;", "invoke", "(Ljava/util/Map$Entry;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class DefaultSpecialEffectsController$retainMatchingViews$1 extends Lambda implements InterfaceC6558 {
    final /* synthetic */ Collection<String> $names;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultSpecialEffectsController$retainMatchingViews$1(Collection<String> collection) {
        super(1);
        this.$names = collection;
    }

    @Override // p052.InterfaceC6558
    public final Boolean invoke(Map.Entry<String, View> entry) {
        entry.getClass();
        Collection<String> collection = this.$names;
        View value = entry.getValue();
        WeakHashMap weakHashMap = AbstractC2270.f6594;
        return Boolean.valueOf(AbstractC4344.m8806(collection, value.getTransitionName()));
    }
}
