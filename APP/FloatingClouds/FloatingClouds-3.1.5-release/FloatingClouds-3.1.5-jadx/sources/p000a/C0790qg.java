package p000a;

import android.view.View;
import p000a.C0866ug;

/* JADX INFO: renamed from: a.qg */
/* JADX INFO: loaded from: classes.dex */
public final class C0790qg extends C0866ug.b<Boolean> {
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // p000a.C0866ug.b
    /* JADX INFO: renamed from: a */
    public final Boolean mo1846a(View view) {
        return Boolean.valueOf(C0866ug.g.m2058d(view));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.view.View, java.lang.Object] */
    @Override // p000a.C0866ug.b
    /* JADX INFO: renamed from: b */
    public final void mo1847b(View view, Boolean bool) {
        C0866ug.g.m2064j(view, bool.booleanValue());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // p000a.C0866ug.b
    /* JADX INFO: renamed from: d */
    public final boolean mo1848d(Boolean bool, Boolean bool2) {
        Boolean bool3 = bool;
        Boolean bool4 = bool2;
        return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
    }
}
