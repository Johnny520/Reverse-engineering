package p057g;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: g.N */
/* JADX INFO: loaded from: classes.dex */
public final class C0874N extends C0872M {
    @Override // p057g.C0872M, p057g.AbstractC0876O
    /* JADX INFO: renamed from: a */
    public void mo2194a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // p057g.AbstractC0876O
    /* JADX INFO: renamed from: b */
    public boolean mo2198b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
