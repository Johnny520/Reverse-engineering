package p000;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: sr */
/* JADX INFO: loaded from: classes.dex */
public final class C2513sr extends FrameLayout implements InterfaceC2316oa {

    /* JADX INFO: renamed from: a */
    public final CollapsibleActionView f8802a;

    /* JADX WARN: Multi-variable type inference failed */
    public C2513sr(View view) {
        super(view.getContext());
        this.f8802a = (CollapsibleActionView) view;
        addView(view);
    }
}
