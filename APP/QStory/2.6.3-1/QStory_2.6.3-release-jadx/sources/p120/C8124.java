package p120;

import java.util.Arrays;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.text.Regex;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: 飘花落叶言世苏楪子兰哲.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8124 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC8109[] f19765;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC7387 f19766;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Collection f19767;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Regex f19768;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C5523 f19769;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C8124(C5523 c5523, InterfaceC8109[] interfaceC8109Arr, InterfaceC7387 interfaceC7387) {
        this(c5523, null, null, interfaceC7387, (InterfaceC8109[]) Arrays.copyOf(interfaceC8109Arr, interfaceC8109Arr.length));
        c5523.getClass();
    }

    public /* synthetic */ C8124(C5523 c5523, InterfaceC8109[] interfaceC8109Arr) {
        this(c5523, interfaceC8109Arr, C8125.f19777);
    }

    public C8124(C5523 c5523, Regex regex, Collection collection, InterfaceC7387 interfaceC7387, InterfaceC8109... interfaceC8109Arr) {
        this.f19769 = c5523;
        this.f19768 = regex;
        this.f19767 = collection;
        this.f19766 = interfaceC7387;
        this.f19765 = interfaceC8109Arr;
    }

    public /* synthetic */ C8124(Collection collection, InterfaceC8109[] interfaceC8109Arr) {
        this(collection, interfaceC8109Arr, C8125.f19772);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C8124(Collection collection, InterfaceC8109[] interfaceC8109Arr, InterfaceC7387 interfaceC7387) {
        this(null, null, collection, interfaceC7387, (InterfaceC8109[]) Arrays.copyOf(interfaceC8109Arr, interfaceC8109Arr.length));
        collection.getClass();
    }
}
