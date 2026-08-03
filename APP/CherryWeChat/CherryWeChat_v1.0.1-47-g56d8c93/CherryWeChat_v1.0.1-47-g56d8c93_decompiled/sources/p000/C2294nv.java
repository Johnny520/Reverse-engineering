package p000;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC1160i;

/* JADX INFO: renamed from: nv */
/* JADX INFO: loaded from: classes.dex */
public final class C2294nv implements InterfaceC1002XD {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8045a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC1160i f8046b;

    public /* synthetic */ C2294nv(AbstractC1160i abstractC1160i, int i) {
        this.f8045a = i;
        this.f8046b = abstractC1160i;
    }

    @Override // p000.InterfaceC1002XD
    /* JADX INFO: renamed from: a */
    public final int mo1896a() {
        int width;
        int paddingRight;
        switch (this.f8045a) {
            case 0:
                AbstractC1160i abstractC1160i = this.f8046b;
                width = abstractC1160i.getWidth();
                paddingRight = abstractC1160i.getPaddingRight();
                break;
            default:
                AbstractC1160i abstractC1160i2 = this.f8046b;
                width = abstractC1160i2.getHeight();
                paddingRight = abstractC1160i2.getPaddingBottom();
                break;
        }
        return width - paddingRight;
    }

    @Override // p000.InterfaceC1002XD
    /* JADX INFO: renamed from: b */
    public final int mo1897b(View view) {
        int decoratedLeft;
        int i;
        switch (this.f8045a) {
            case 0:
                C2431qv c2431qv = (C2431qv) view.getLayoutParams();
                decoratedLeft = this.f8046b.getDecoratedLeft(view);
                i = ((ViewGroup.MarginLayoutParams) c2431qv).leftMargin;
                break;
            default:
                C2431qv c2431qv2 = (C2431qv) view.getLayoutParams();
                decoratedLeft = this.f8046b.getDecoratedTop(view);
                i = ((ViewGroup.MarginLayoutParams) c2431qv2).topMargin;
                break;
        }
        return decoratedLeft - i;
    }

    @Override // p000.InterfaceC1002XD
    /* JADX INFO: renamed from: c */
    public final View mo1898c(int i) {
        switch (this.f8045a) {
        }
        return this.f8046b.getChildAt(i);
    }

    @Override // p000.InterfaceC1002XD
    /* JADX INFO: renamed from: d */
    public final int mo1899d() {
        switch (this.f8045a) {
            case 0:
                return this.f8046b.getPaddingLeft();
            default:
                return this.f8046b.getPaddingTop();
        }
    }

    @Override // p000.InterfaceC1002XD
    /* JADX INFO: renamed from: e */
    public final int mo1900e(View view) {
        int decoratedRight;
        int i;
        switch (this.f8045a) {
            case 0:
                C2431qv c2431qv = (C2431qv) view.getLayoutParams();
                decoratedRight = this.f8046b.getDecoratedRight(view);
                i = ((ViewGroup.MarginLayoutParams) c2431qv).rightMargin;
                break;
            default:
                C2431qv c2431qv2 = (C2431qv) view.getLayoutParams();
                decoratedRight = this.f8046b.getDecoratedBottom(view);
                i = ((ViewGroup.MarginLayoutParams) c2431qv2).bottomMargin;
                break;
        }
        return decoratedRight + i;
    }
}
