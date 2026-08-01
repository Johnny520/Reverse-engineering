package p018D;

import java.util.List;
import p061L2.C0981u;
import p164g1.AbstractC2179a;

/* JADX INFO: renamed from: D.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0254c {

    /* JADX INFO: renamed from: b */
    public static final C0254c f840b = new C0254c(C0981u.f3047d);

    /* JADX INFO: renamed from: a */
    public final Object f841a;

    public C0254c(List list) {
        this.f841a = list;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    public final String toString() {
        return "TextContextMenuData(components=" + AbstractC2179a.m4007a(this.f841a, "\n\t", null, 56) + ')';
    }
}
