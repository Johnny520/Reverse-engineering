package androidx.compose.p001ui.viewinterop;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ViewFactoryHolder<T extends android.view.View> extends androidx.compose.p001ui.viewinterop.AndroidViewHolder {

    /* JADX INFO: renamed from: σ */
    public static final /* synthetic */ int f981 = 0;

    /* JADX INFO: renamed from: ο */
    public p000.a80 f982;

    /* JADX INFO: renamed from: π */
    public p000.a80 f983;

    /* JADX INFO: renamed from: ρ */
    public p000.a80 f984;

    private final void setSavableRegistryEntry(p000.xp1 r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: κ */
    public static final void m411(androidx.compose.p001ui.viewinterop.ViewFactoryHolder r1) {
            r0 = 0
            r1.setSavableRegistryEntry(r0)
            return
    }

    public final p000.w21 getDispatcher() {
            r0 = this;
            r0 = 0
            return r0
    }

    public final p000.a80 getReleaseBlock() {
            r0 = this;
            a80 r0 = r0.f984
            return r0
    }

    public final p000.a80 getResetBlock() {
            r0 = this;
            a80 r0 = r0.f983
            return r0
    }

    public /* bridge */ /* synthetic */ androidx.compose.p001ui.platform.AbstractComposeView getSubCompositionView() {
            r0 = this;
            r0 = 0
            return r0
    }

    public final p000.a80 getUpdateBlock() {
            r0 = this;
            a80 r0 = r0.f982
            return r0
    }

    public android.view.View getViewRoot() {
            r0 = this;
            return r0
    }

    public final void setReleaseBlock(p000.a80 r2) {
            r1 = this;
            r1.f984 = r2
            i92 r2 = new i92
            r0 = 0
            r2.<init>(r1, r0)
            r1.setRelease(r2)
            return
    }

    public final void setResetBlock(p000.a80 r2) {
            r1 = this;
            r1.f983 = r2
            i92 r2 = new i92
            r0 = 1
            r2.<init>(r1, r0)
            r1.setReset(r2)
            return
    }

    public final void setUpdateBlock(p000.a80 r2) {
            r1 = this;
            r1.f982 = r2
            i92 r2 = new i92
            r0 = 2
            r2.<init>(r1, r0)
            r1.setUpdate(r2)
            return
    }
}
