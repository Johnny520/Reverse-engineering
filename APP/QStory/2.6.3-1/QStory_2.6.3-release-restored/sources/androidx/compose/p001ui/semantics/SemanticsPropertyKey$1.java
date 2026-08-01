package androidx.compose.p001ui.semantics;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p068.InterfaceC7383;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u0004\n\u0002\b\u0006\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u00012\b\u0010\u0002\u001a\u0004\u0018\u0001H\u00012\u0006\u0010\u0003\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m151d2 = {"<anonymous>", "T", "parentValue", "childValue", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
public final class SemanticsPropertyKey$1 extends Lambda implements InterfaceC7383 {
    public static final SemanticsPropertyKey$1 INSTANCE = new SemanticsPropertyKey$1();

    public SemanticsPropertyKey$1() {
        super(2);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(Object obj, Object obj2) {
        return obj == null ? obj2 : obj;
    }
}
