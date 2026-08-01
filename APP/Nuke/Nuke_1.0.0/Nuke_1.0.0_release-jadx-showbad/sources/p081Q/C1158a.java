package p081Q;

import java.util.Collection;
import java.util.List;
import me.dartcv.nuke.BuildConfig;
import p029F0.AbstractC0389a0;
import p029F0.AbstractC0391b0;
import p056K2.C0891q;
import p112W2.InterfaceC1601c;

/* JADX INFO: renamed from: Q.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1158a implements InterfaceC1601c {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f3798d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f3799e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f3800f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1158a(int i5, int i6, AbstractC0391b0 abstractC0391b0) {
        this.f3798d = i6;
        this.f3799e = abstractC0391b0;
        this.f3800f = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        switch (this.f3798d) {
            case 0:
                AbstractC0389a0.m658i((AbstractC0389a0) obj, (AbstractC0391b0) this.f3799e, 0, -this.f3800f);
                return C0891q.f2780a;
            case BuildConfig.VERSION_CODE /* 1 */:
                AbstractC0389a0.m658i((AbstractC0389a0) obj, (AbstractC0391b0) this.f3799e, -this.f3800f, 0);
                return C0891q.f2780a;
            default:
                return Boolean.valueOf(((List) obj).addAll(this.f3800f, (Collection) this.f3799e));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ C1158a(int i5, Collection collection) {
        this.f3798d = 2;
        this.f3800f = i5;
        this.f3799e = collection;
    }
}
