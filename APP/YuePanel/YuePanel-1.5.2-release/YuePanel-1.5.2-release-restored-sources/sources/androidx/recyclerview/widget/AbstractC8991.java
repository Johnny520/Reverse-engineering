package androidx.recyclerview.widget;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۠ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8991 extends RecyclerView.AbstractC8914 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final boolean f30320 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final String f30321 = "SimpleItemAnimator";

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public boolean f30322 = true;

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8914
    /* JADX INFO: renamed from: ۥ */
    public boolean mo4919(@InterfaceC6391 RecyclerView.AbstractC8938 abstractC8938, @InterfaceC6490 RecyclerView.AbstractC8914.C8916 c8916, @InterfaceC6391 RecyclerView.AbstractC8914.C8916 c89162) {
        int i;
        int i2;
        return (c8916 == null || ((i = c8916.f3884) == (i2 = c89162.f3884) && c8916.f3885 == c89162.f3885)) ? mo30554(abstractC8938) : mo30556(abstractC8938, i, c8916.f3885, i2, c89162.f3885);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8914
    /* JADX INFO: renamed from: ۥ۟ */
    public boolean mo4920(@InterfaceC6391 RecyclerView.AbstractC8938 abstractC8938, @InterfaceC6391 RecyclerView.AbstractC8938 abstractC89382, @InterfaceC6391 RecyclerView.AbstractC8914.C8916 c8916, @InterfaceC6391 RecyclerView.AbstractC8914.C8916 c89162) {
        int i;
        int i2;
        int i3 = c8916.f3884;
        int i4 = c8916.f3885;
        if (abstractC89382.shouldIgnore()) {
            int i5 = c8916.f3884;
            i2 = c8916.f3885;
            i = i5;
        } else {
            i = c89162.f3884;
            i2 = c89162.f3885;
        }
        return mo30555(abstractC8938, abstractC89382, i3, i4, i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8914
    /* JADX INFO: renamed from: ۥ۟۟ */
    public boolean mo30271(@InterfaceC6391 RecyclerView.AbstractC8938 abstractC8938, @InterfaceC6391 RecyclerView.AbstractC8914.C8916 c8916, @InterfaceC6490 RecyclerView.AbstractC8914.C8916 c89162) {
        int i = c8916.f3884;
        int i2 = c8916.f3885;
        View view = abstractC8938.itemView;
        int left = c89162 == null ? view.getLeft() : c89162.f3884;
        int top = c89162 == null ? view.getTop() : c89162.f3885;
        if (abstractC8938.isRemoved() || (i == left && i2 == top)) {
            return mo30557(abstractC8938);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return mo30556(abstractC8938, i, i2, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8914
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public boolean mo30272(@InterfaceC6391 RecyclerView.AbstractC8938 abstractC8938, @InterfaceC6391 RecyclerView.AbstractC8914.C8916 c8916, @InterfaceC6391 RecyclerView.AbstractC8914.C8916 c89162) {
        int i = c8916.f3884;
        int i2 = c89162.f3884;
        if (i != i2 || c8916.f3885 != c89162.f3885) {
            return mo30556(abstractC8938, i, c8916.f3885, i2, c89162.f3885);
        }
        m30730(abstractC8938);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8914
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public boolean mo30273(@InterfaceC6391 RecyclerView.AbstractC8938 abstractC8938) {
        return !this.f30322 || abstractC8938.isInvalid();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ */
    public abstract boolean mo30554(RecyclerView.AbstractC8938 abstractC8938);

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ */
    public abstract boolean mo30555(RecyclerView.AbstractC8938 abstractC8938, RecyclerView.AbstractC8938 abstractC89382, int i, int i2, int i3, int i4);

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ */
    public abstract boolean mo30556(RecyclerView.AbstractC8938 abstractC8938, int i, int i2, int i3, int i4);

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ */
    public abstract boolean mo30557(RecyclerView.AbstractC8938 abstractC8938);

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public final void m30726(RecyclerView.AbstractC8938 abstractC8938) {
        m30735(abstractC8938);
        m30275(abstractC8938);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public final void m30727(RecyclerView.AbstractC8938 abstractC8938) {
        m30736(abstractC8938);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public final void m30728(RecyclerView.AbstractC8938 abstractC8938, boolean z) {
        m30737(abstractC8938, z);
        m30275(abstractC8938);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public final void m30729(RecyclerView.AbstractC8938 abstractC8938, boolean z) {
        m30738(abstractC8938, z);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public final void m30730(RecyclerView.AbstractC8938 abstractC8938) {
        m30739(abstractC8938);
        m30275(abstractC8938);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public final void m30731(RecyclerView.AbstractC8938 abstractC8938) {
        m30740(abstractC8938);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public final void m30732(RecyclerView.AbstractC8938 abstractC8938) {
        m30741(abstractC8938);
        m30275(abstractC8938);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public final void m30733(RecyclerView.AbstractC8938 abstractC8938) {
        m30742(abstractC8938);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public boolean m30734() {
        return this.f30322;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public void m30735(RecyclerView.AbstractC8938 abstractC8938) {
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public void m30736(RecyclerView.AbstractC8938 abstractC8938) {
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public void m30737(RecyclerView.AbstractC8938 abstractC8938, boolean z) {
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public void m30738(RecyclerView.AbstractC8938 abstractC8938, boolean z) {
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public void m30739(RecyclerView.AbstractC8938 abstractC8938) {
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public void m30740(RecyclerView.AbstractC8938 abstractC8938) {
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m30741(RecyclerView.AbstractC8938 abstractC8938) {
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m30742(RecyclerView.AbstractC8938 abstractC8938) {
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public void m30743(boolean z) {
        this.f30322 = z;
    }
}
