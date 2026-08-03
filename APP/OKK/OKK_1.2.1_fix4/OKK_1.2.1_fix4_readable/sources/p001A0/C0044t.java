package p001A0;

import android.content.res.TypedArray;
import android.util.SparseArray;
import p018J0.C0234d;

/* JADX INFO: renamed from: A0.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0044t {

    /* JADX INFO: renamed from: a */
    public final SparseArray f112a = new SparseArray();

    /* JADX INFO: renamed from: b */
    public final C0045u f113b;

    /* JADX INFO: renamed from: c */
    public final int f114c;

    /* JADX INFO: renamed from: d */
    public final int f115d;

    public C0044t(C0045u c0045u, C0234d c0234d) {
        this.f113b = c0045u;
        TypedArray typedArray = (TypedArray) c0234d.f475c;
        this.f114c = typedArray.getResourceId(28, 0);
        this.f115d = typedArray.getResourceId(52, 0);
    }
}
