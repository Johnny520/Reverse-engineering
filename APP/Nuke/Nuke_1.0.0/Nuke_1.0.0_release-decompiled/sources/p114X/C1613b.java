package p114X;

import java.util.Collection;
import java.util.List;
import me.dartcv.nuke.BuildConfig;
import p112W2.InterfaceC1601c;

/* JADX INFO: renamed from: X.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1613b implements InterfaceC1601c {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f5555d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Collection f5556e;

    public /* synthetic */ C1613b(int i5, Collection collection) {
        this.f5555d = i5;
        this.f5556e = collection;
    }

    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        boolean zContains;
        switch (this.f5555d) {
            case 0:
                zContains = this.f5556e.contains(obj);
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                zContains = this.f5556e.contains(obj);
                break;
            default:
                zContains = ((List) obj).retainAll(this.f5556e);
                break;
        }
        return Boolean.valueOf(zContains);
    }
}
