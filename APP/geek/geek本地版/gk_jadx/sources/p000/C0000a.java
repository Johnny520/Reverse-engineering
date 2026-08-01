package p000;

import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;

/* JADX INFO: renamed from: a */
/* JADX INFO: loaded from: classes.dex */
public final class C0000a implements ya0 {

    /* JADX INFO: renamed from: a */
    public boolean f0a = false;

    /* JADX INFO: renamed from: b */
    public int f1b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ActionBarContextView f2c;

    public C0000a(ActionBarContextView actionBarContextView) {
        this.f2c = actionBarContextView;
    }

    @Override // p000.ya0
    /* JADX INFO: renamed from: a */
    public final void mo0a() {
        if (this.f0a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.f2c;
        actionBarContextView.f238f = null;
        super/*android.view.View*/.setVisibility(this.f1b);
    }

    @Override // p000.ya0
    /* JADX INFO: renamed from: b */
    public final void mo1b(View view) {
        this.f0a = true;
    }

    @Override // p000.ya0
    /* JADX INFO: renamed from: c */
    public final void mo2c() {
        super/*android.view.View*/.setVisibility(0);
        this.f0a = false;
    }
}
