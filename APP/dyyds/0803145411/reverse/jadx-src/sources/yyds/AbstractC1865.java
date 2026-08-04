package yyds;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.kongzue.dialogx.interfaces.AbstractC0041;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* JADX INFO: renamed from: yyds.ᛸᲀᛷᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1865 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public int f9364;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public int f9365;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public Object f9366;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public int f9367;

    public AbstractC1865(int i) {
        if (AbstractC0041.m264() == null) {
            WeakReference weakReference = AbstractC1655.f8450;
            Log.e(">>>", "DialogX.init: 初始化异常，context 为 null 或未初始化，详情请查看 https://github.com/kongzue/DialogX/wiki");
        } else {
            this.f9365 = i;
            this.f9366 = AbstractC0879.m1961(AbstractC0041.m264()).inflate(i, (ViewGroup) new RelativeLayout(AbstractC0041.m264()), false);
        }
    }

    public boolean hasNext() {
        return this.f9365 < ((C0728) this.f9366).f3397;
    }

    public void remove() {
        C0728 c0728 = (C0728) this.f9366;
        m3647();
        if (this.f9367 == -1) {
            C0188.m800("Call next() before removing element from the iterator.");
            return;
        }
        c0728.m1672();
        c0728.m1669(this.f9367);
        this.f9367 = -1;
        this.f9364 = c0728.f3405;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public void m3644() {
        while (true) {
            int i = this.f9365;
            C0728 c0728 = (C0728) this.f9366;
            if (i >= c0728.f3397 || c0728.f3400[i] >= 0) {
                return;
            } else {
                this.f9365 = i + 1;
            }
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public int m3645(int i) {
        if (i < this.f9364) {
            return ((ByteBuffer) this.f9366).getShort(this.f9367 + i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public void m3646(ViewGroup viewGroup, AbstractC0041 abstractC0041) {
        if (m3648() == null || m3648().getParent() == viewGroup || viewGroup.getTag(-109) == m3648().toString()) {
            return;
        }
        if (m3648().getParent() != null) {
            ((ViewGroup) m3648().getParent()).removeView(m3648());
        }
        ViewGroup.LayoutParams layoutParams = m3648().getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        }
        viewGroup.addView(m3648(), layoutParams);
        mo890(abstractC0041, m3648());
        View viewM3648 = m3648();
        if (abstractC0041.hashCode() == this.f9367 && viewM3648.hashCode() == this.f9364) {
            return;
        }
        this.f9367 = abstractC0041.hashCode();
        this.f9364 = viewM3648.hashCode();
        m3648();
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public void m3647() {
        if (((C0728) this.f9366).f3405 != this.f9364) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public abstract void mo890(AbstractC0041 abstractC0041, View view);

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public View m3648() {
        View view = (View) this.f9366;
        if (view != null) {
            return view;
        }
        View viewInflate = AbstractC0879.m1961(AbstractC0041.m264()).inflate(this.f9365, (ViewGroup) new RelativeLayout(AbstractC0041.m264()), false);
        this.f9366 = viewInflate;
        return viewInflate;
    }

    public AbstractC1865() {
        if (C1586.f8037 == null) {
            C1586.f8037 = new C1586();
        }
    }

    public AbstractC1865(View view) {
        this.f9366 = view;
    }
}
