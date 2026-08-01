package p107V1;

import android.net.Uri;
import com.bumptech.glide.load.data.C1931a;
import com.bumptech.glide.load.data.C1943m;
import com.bumptech.glide.load.data.InterfaceC1934d;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import me.dartcv.nuke.BuildConfig;
import p078P1.C1147i;
import p189k2.C2452b;

/* JADX INFO: renamed from: V1.C */
/* JADX INFO: loaded from: classes.dex */
public final class C1500C implements InterfaceC1518q {

    /* JADX INFO: renamed from: b */
    public static final Set f5231b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));

    /* JADX INFO: renamed from: a */
    public final Object f5232a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1500C(C1499B c1499b) {
        this.f5232a = c1499b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p107V1.InterfaceC1518q
    /* JADX INFO: renamed from: a */
    public final boolean mo2773a(Object obj) {
        return f5231b.contains(((Uri) obj).getScheme());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p107V1.InterfaceC1518q
    /* JADX INFO: renamed from: b */
    public final C1517p mo2774b(Object obj, int i5, int i6, C1147i c1147i) {
        InterfaceC1934d c1931a;
        Uri uri = (Uri) obj;
        C2452b c2452b = new C2452b(uri);
        C1499B c1499b = (C1499B) this.f5232a;
        switch (c1499b.f5228d) {
            case 0:
                c1931a = new C1931a(c1499b.f5229e, uri, c1499b.f5230f, 0);
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                c1931a = new C1931a(c1499b.f5229e, uri, c1499b.f5230f, 1);
                break;
            default:
                c1931a = new C1943m(c1499b.f5229e, uri, c1499b.f5230f);
                break;
        }
        return new C1517p(c2452b, c1931a);
    }
}
