package p027E4;

import com.bumptech.glide.AbstractC1923e;
import java.lang.reflect.Method;
import p118X3.C1706p;
import p118X3.C1707q;

/* JADX INFO: renamed from: E4.H */
/* JADX INFO: loaded from: classes.dex */
public final class C0294H extends AbstractC0315b0 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f944d;

    /* JADX INFO: renamed from: e */
    public final Method f945e;

    /* JADX INFO: renamed from: f */
    public final int f946f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0294H(Method method, int i5, int i6) {
        this.f944d = i6;
        this.f945e = method;
        this.f946f = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p027E4.AbstractC0315b0
    /* JADX INFO: renamed from: a */
    public final void mo515a(C0303Q c0303q, Object obj) {
        switch (this.f944d) {
            case 0:
                C1707q c1707q = (C1707q) obj;
                if (c1707q == null) {
                    throw AbstractC0315b0.m543n(this.f945e, this.f946f, "Headers parameter must not be null.", new Object[0]);
                }
                C1706p c1706p = c0303q.f973f;
                c1706p.getClass();
                int size = c1707q.size();
                for (int i5 = 0; i5 < size; i5++) {
                    AbstractC1923e.m3477o(c1706p, c1707q.m3039b(i5), c1707q.m3041d(i5));
                }
                return;
            default:
                if (obj == null) {
                    throw AbstractC0315b0.m543n(this.f945e, this.f946f, "@Url parameter is null.", new Object[0]);
                }
                c0303q.f970c = obj.toString();
                return;
        }
    }
}
