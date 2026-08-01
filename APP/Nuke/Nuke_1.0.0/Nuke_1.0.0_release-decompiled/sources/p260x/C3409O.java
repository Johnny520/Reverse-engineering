package p260x;

import java.util.List;
import p238t.AbstractC3204b;

/* JADX INFO: renamed from: x.O */
/* JADX INFO: loaded from: classes.dex */
public final class C3409O {

    /* JADX INFO: renamed from: a */
    public final List f10658a;

    /* JADX INFO: renamed from: b */
    public final List[] f10659b;

    /* JADX INFO: renamed from: c */
    public int f10660c;

    /* JADX INFO: renamed from: d */
    public int f10661d;

    /* JADX INFO: renamed from: e */
    public boolean f10662e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C3410P f10663f;

    public C3409O(C3410P c3410p, List list) {
        this.f10663f = c3410p;
        this.f10658a = list;
        this.f10659b = new List[list.size()];
        if (list.isEmpty()) {
            AbstractC3204b.m5475a("NestedPrefetchController shouldn't be created with no states");
        }
    }
}
