package p000;

import android.view.View;
import android.view.ViewGroup;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: renamed from: sz */
/* JADX INFO: loaded from: classes.dex */
public final class C0725sz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4375a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0799uz f4376b;

    public /* synthetic */ C0725sz(AbstractC0799uz abstractC0799uz, int i) {
        this.f4375a = i;
        this.f4376b = abstractC0799uz;
    }

    /* JADX INFO: renamed from: a */
    public final int m2385a(View view) {
        int right;
        int i;
        switch (this.f4375a) {
            case Base64.DEFAULT /* 0 */:
                C0836vz c0836vz = (C0836vz) view.getLayoutParams();
                right = view.getRight() + ((C0836vz) view.getLayoutParams()).f5018b.right;
                i = ((ViewGroup.MarginLayoutParams) c0836vz).rightMargin;
                break;
            default:
                C0836vz c0836vz2 = (C0836vz) view.getLayoutParams();
                right = view.getBottom() + ((C0836vz) view.getLayoutParams()).f5018b.bottom;
                i = ((ViewGroup.MarginLayoutParams) c0836vz2).bottomMargin;
                break;
        }
        return right + i;
    }

    /* JADX INFO: renamed from: b */
    public final int m2386b(View view) {
        int left;
        int i;
        switch (this.f4375a) {
            case Base64.DEFAULT /* 0 */:
                C0836vz c0836vz = (C0836vz) view.getLayoutParams();
                left = view.getLeft() - ((C0836vz) view.getLayoutParams()).f5018b.left;
                i = ((ViewGroup.MarginLayoutParams) c0836vz).leftMargin;
                break;
            default:
                C0836vz c0836vz2 = (C0836vz) view.getLayoutParams();
                left = view.getTop() - ((C0836vz) view.getLayoutParams()).f5018b.top;
                i = ((ViewGroup.MarginLayoutParams) c0836vz2).topMargin;
                break;
        }
        return left - i;
    }

    /* JADX INFO: renamed from: c */
    public final int m2387c() {
        int i;
        int iM2510D;
        switch (this.f4375a) {
            case Base64.DEFAULT /* 0 */:
                AbstractC0799uz abstractC0799uz = this.f4376b;
                i = abstractC0799uz.f4868n;
                iM2510D = abstractC0799uz.m2510D();
                break;
            default:
                AbstractC0799uz abstractC0799uz2 = this.f4376b;
                i = abstractC0799uz2.f4869o;
                iM2510D = abstractC0799uz2.m2508B();
                break;
        }
        return i - iM2510D;
    }

    /* JADX INFO: renamed from: d */
    public final int m2388d() {
        switch (this.f4375a) {
            case Base64.DEFAULT /* 0 */:
                return this.f4376b.m2509C();
            default:
                return this.f4376b.m2511E();
        }
    }
}
