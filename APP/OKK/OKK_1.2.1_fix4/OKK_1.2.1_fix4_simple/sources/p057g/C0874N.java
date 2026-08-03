package p057g;

import android.text.StaticLayout;
import android.widget.TextView;
import p001A0.AbstractC0016B;

/* JADX INFO: renamed from: g.N */
/* JADX INFO: loaded from: classes.dex */
public final class C0874N extends C0872M {
    public C0874N() {
    }

    @Override // p057g.C0872M, p057g.AbstractC0876O
    /* JADX INFO: renamed from: a */
    public void mo2194a(StaticLayout.Builder r1, TextView r2) {
        r1.setTextDirection(AbstractC0016B.m32e(r2));
    }

    @Override // p057g.AbstractC0876O
    /* JADX INFO: renamed from: b */
    public boolean mo2198b(TextView r1) {
        return AbstractC0016B.m46s(r1);
    }
}
