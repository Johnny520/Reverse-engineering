package p000;

import android.view.View;
import android.view.ViewGroup;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: renamed from: lz */
/* JADX INFO: loaded from: classes.dex */
public final class C0466lz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3119a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0540nz f3120b;

    public /* synthetic */ C0466lz(AbstractC0540nz abstractC0540nz, int i) {
        this.f3119a = i;
        this.f3120b = abstractC0540nz;
    }

    /* JADX INFO: renamed from: a */
    public final int m1768a(View view) {
        int right;
        int i;
        switch (this.f3119a) {
            case Base64.DEFAULT /* 0 */:
                C0577oz c0577oz = (C0577oz) view.getLayoutParams();
                right = view.getRight() + ((C0577oz) view.getLayoutParams()).f3622b.right;
                i = ((ViewGroup.MarginLayoutParams) c0577oz).rightMargin;
                break;
            default:
                C0577oz c0577oz2 = (C0577oz) view.getLayoutParams();
                right = view.getBottom() + ((C0577oz) view.getLayoutParams()).f3622b.bottom;
                i = ((ViewGroup.MarginLayoutParams) c0577oz2).bottomMargin;
                break;
        }
        return right + i;
    }

    /* JADX INFO: renamed from: b */
    public final int m1769b(View view) {
        int left;
        int i;
        switch (this.f3119a) {
            case Base64.DEFAULT /* 0 */:
                C0577oz c0577oz = (C0577oz) view.getLayoutParams();
                left = view.getLeft() - ((C0577oz) view.getLayoutParams()).f3622b.left;
                i = ((ViewGroup.MarginLayoutParams) c0577oz).leftMargin;
                break;
            default:
                C0577oz c0577oz2 = (C0577oz) view.getLayoutParams();
                left = view.getTop() - ((C0577oz) view.getLayoutParams()).f3622b.top;
                i = ((ViewGroup.MarginLayoutParams) c0577oz2).topMargin;
                break;
        }
        return left - i;
    }

    /* JADX INFO: renamed from: c */
    public final int m1770c() {
        int i;
        int iM1962D;
        switch (this.f3119a) {
            case Base64.DEFAULT /* 0 */:
                AbstractC0540nz abstractC0540nz = this.f3120b;
                i = abstractC0540nz.f3468n;
                iM1962D = abstractC0540nz.m1962D();
                break;
            default:
                AbstractC0540nz abstractC0540nz2 = this.f3120b;
                i = abstractC0540nz2.f3469o;
                iM1962D = abstractC0540nz2.m1960B();
                break;
        }
        return i - iM1962D;
    }

    /* JADX INFO: renamed from: d */
    public final int m1771d() {
        switch (this.f3119a) {
            case Base64.DEFAULT /* 0 */:
                return this.f3120b.m1961C();
            default:
                return this.f3120b.m1963E();
        }
    }
}
