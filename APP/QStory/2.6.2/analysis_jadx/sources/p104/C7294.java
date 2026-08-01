package p104;

import java.util.Arrays;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.text.Regex;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: 飘花落叶言世苏楪子兰哲.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7294 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC7279[] f19425;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC6557 f19426;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Collection f19427;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Regex f19428;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4690 f19429;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7294(C4690 c4690, InterfaceC7279[] interfaceC7279Arr, InterfaceC6557 interfaceC6557) {
        this(c4690, null, null, interfaceC6557, (InterfaceC7279[]) Arrays.copyOf(interfaceC7279Arr, interfaceC7279Arr.length));
        c4690.getClass();
    }

    public /* synthetic */ C7294(C4690 c4690, InterfaceC7279[] interfaceC7279Arr) {
        this(c4690, interfaceC7279Arr, C7295.f19437);
    }

    public C7294(C4690 c4690, Regex regex, Collection collection, InterfaceC6557 interfaceC6557, InterfaceC7279... interfaceC7279Arr) {
        this.f19429 = c4690;
        this.f19428 = regex;
        this.f19427 = collection;
        this.f19426 = interfaceC6557;
        this.f19425 = interfaceC7279Arr;
    }

    public /* synthetic */ C7294(Collection collection, InterfaceC7279[] interfaceC7279Arr) {
        this(collection, interfaceC7279Arr, C7295.f19432);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7294(Collection collection, InterfaceC7279[] interfaceC7279Arr, InterfaceC6557 interfaceC6557) {
        this(null, null, collection, interfaceC6557, (InterfaceC7279[]) Arrays.copyOf(interfaceC7279Arr, interfaceC7279Arr.length));
        collection.getClass();
    }
}
