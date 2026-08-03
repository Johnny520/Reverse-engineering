package Yue;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: Yue.ۥۣ۠۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C5110 extends RecyclerView.AbstractC8938 {
    public C5110(@InterfaceC6391 FrameLayout frameLayout) {
        super(frameLayout);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟ */
    public static C5110 m1923(@InterfaceC6391 ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(C8273.m27331());
        frameLayout.setSaveEnabled(false);
        return new C5110(frameLayout);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public FrameLayout m15772() {
        return (FrameLayout) this.itemView;
    }
}
