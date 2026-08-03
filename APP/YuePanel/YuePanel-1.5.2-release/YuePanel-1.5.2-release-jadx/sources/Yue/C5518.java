package Yue;

import Yue.C6922;
import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: Yue.ۥ۠ۥۨۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5518 implements InterfaceC5517 {

    /* JADX INFO: renamed from: ۥ */
    public static final InterfaceC5517 f1546 = new C5518();

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static float m17148(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt != view) {
                float fM27347 = C8273.m27347(childAt);
                if (fM27347 > f) {
                    f = fM27347;
                }
            }
        }
        return f;
    }

    @Override // Yue.InterfaceC5517
    /* JADX INFO: renamed from: ۥ */
    public void mo2262(View view) {
        Object tag = view.getTag(C6922.C6925.f20010);
        if (tag instanceof Float) {
            C8273.m27453(view, ((Float) tag).floatValue());
        }
        view.setTag(C6922.C6925.f20010, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    @Override // Yue.InterfaceC5517
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo2263(View view) {
    }

    @Override // Yue.InterfaceC5517
    /* JADX INFO: renamed from: ۥ۟۟ */
    public void mo17146(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
    }

    @Override // Yue.InterfaceC5517
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public void mo17147(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
        if (z && view.getTag(C6922.C6925.f20010) == null) {
            Float fValueOf = Float.valueOf(C8273.m27347(view));
            C8273.m27453(view, m17148(recyclerView, view) + 1.0f);
            view.setTag(C6922.C6925.f20010, fValueOf);
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }
}
