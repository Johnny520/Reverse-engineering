package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.recyclerview.widget.C1206k;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.recyclerview.widget.z */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1221z extends RecyclerView.AbstractC1172i {

    /* JADX INFO: renamed from: g */
    public boolean f5203g;

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1172i
    /* JADX INFO: renamed from: a */
    public final boolean mo2818a(RecyclerView.AbstractC1163A abstractC1163A, RecyclerView.AbstractC1163A abstractC1163A2, RecyclerView.AbstractC1172i.b bVar, RecyclerView.AbstractC1172i.b bVar2) {
        int i;
        int i2;
        int i3 = bVar.f4923a;
        int i4 = bVar.f4924b;
        if (abstractC1163A2.m2809o()) {
            int i5 = bVar.f4923a;
            i2 = bVar.f4924b;
            i = i5;
        } else {
            i = bVar2.f4923a;
            i2 = bVar2.f4924b;
        }
        C1206k c1206k = (C1206k) this;
        if (abstractC1163A == abstractC1163A2) {
            return c1206k.mo2962g(abstractC1163A, i3, i4, i, i2);
        }
        View view = abstractC1163A.f4891a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        c1206k.m2966l(abstractC1163A);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        c1206k.m2966l(abstractC1163A2);
        float f = -((int) ((i - i3) - translationX));
        View view2 = abstractC1163A2.f4891a;
        view2.setTranslationX(f);
        view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList<C1206k.a> arrayList = c1206k.f5104k;
        C1206k.a aVar = new C1206k.a();
        aVar.f5112a = abstractC1163A;
        aVar.f5113b = abstractC1163A2;
        aVar.f5114c = i3;
        aVar.f5115d = i4;
        aVar.f5116e = i;
        aVar.f5117f = i2;
        arrayList.add(aVar);
        return true;
    }

    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: g */
    public abstract boolean mo2962g(RecyclerView.AbstractC1163A abstractC1163A, int i, int i2, int i3, int i4);
}
