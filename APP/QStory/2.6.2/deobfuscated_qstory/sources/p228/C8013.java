package p228;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p286.C8396;

/* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8013 implements InterfaceC8032 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Set f22137 = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC8032 f22138;

    public C8013(InterfaceC8032 interfaceC8032) {
        this.f22138 = interfaceC8032;
    }

    @Override // p228.InterfaceC8032
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo13473(Object obj) {
        return f22137.contains(((Uri) obj).getScheme());
    }

    @Override // p228.InterfaceC8032
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C8035 mo13474(Object obj, int i, int i2, C8396 c8396) {
        return this.f22138.mo13474(new C8036(((Uri) obj).toString()), i, i2, c8396);
    }
}
