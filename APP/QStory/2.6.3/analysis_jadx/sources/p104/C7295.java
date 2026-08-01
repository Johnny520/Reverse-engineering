package p104;

import java.util.Arrays;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.text.Regex;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: 飘花落叶言世苏楪子兰哲.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7295 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC7280[] f19420;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC6558 f19421;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Collection f19422;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Regex f19423;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4691 f19424;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7295(C4691 c4691, InterfaceC7280[] interfaceC7280Arr, InterfaceC6558 interfaceC6558) {
        this(c4691, null, null, interfaceC6558, (InterfaceC7280[]) Arrays.copyOf(interfaceC7280Arr, interfaceC7280Arr.length));
        c4691.getClass();
    }

    public /* synthetic */ C7295(C4691 c4691, InterfaceC7280[] interfaceC7280Arr) {
        this(c4691, interfaceC7280Arr, C7296.f19432);
    }

    public C7295(C4691 c4691, Regex regex, Collection collection, InterfaceC6558 interfaceC6558, InterfaceC7280... interfaceC7280Arr) {
        this.f19424 = c4691;
        this.f19423 = regex;
        this.f19422 = collection;
        this.f19421 = interfaceC6558;
        this.f19420 = interfaceC7280Arr;
    }

    public /* synthetic */ C7295(Collection collection, InterfaceC7280[] interfaceC7280Arr) {
        this(collection, interfaceC7280Arr, C7296.f19427);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7295(Collection collection, InterfaceC7280[] interfaceC7280Arr, InterfaceC6558 interfaceC6558) {
        this(null, null, collection, interfaceC6558, (InterfaceC7280[]) Arrays.copyOf(interfaceC7280Arr, interfaceC7280Arr.length));
        collection.getClass();
    }
}
