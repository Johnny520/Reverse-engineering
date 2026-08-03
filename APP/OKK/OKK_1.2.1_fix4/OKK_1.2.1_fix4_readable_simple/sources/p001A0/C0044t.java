package p001A0;

import android.content.res.TypedArray;
import android.util.SparseArray;
import p018J0.C0234d;

/* JADX INFO: renamed from: A0.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0044t {

    /* JADX INFO: renamed from: a */
    public final SparseArray f112a;

    /* JADX INFO: renamed from: b */
    public final C0045u f113b;

    /* JADX INFO: renamed from: c */
    public final int f114c;

    /* JADX INFO: renamed from: d */
    public final int f115d;

    public C0044t(C0045u r2, C0234d r3) {
        this.f112a = new SparseArray();
        this.f113b = r2;
        TypedArray r22 = (TypedArray) r3.f475c;
        this.f114c = r22.getResourceId(28, 0);
        this.f115d = r22.getResourceId(52, 0);
    }
}
