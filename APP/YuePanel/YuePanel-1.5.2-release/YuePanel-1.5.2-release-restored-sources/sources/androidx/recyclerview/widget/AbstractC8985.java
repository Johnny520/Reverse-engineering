package androidx.recyclerview.widget;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import androidx.recyclerview.widget.C8946;
import androidx.recyclerview.widget.C8947;
import androidx.recyclerview.widget.C8961;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.AbstractC8938;
import java.util.List;

/* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8985<T, VH extends RecyclerView.AbstractC8938> extends RecyclerView.AbstractC8909<VH> {

    /* JADX INFO: renamed from: ۥ */
    public final C8947<T> f3977;

    /* JADX INFO: renamed from: ۥ۟ */
    public final C8947.InterfaceC1762<T> f3978;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۠$ۥ */
    public class C1778 implements C8947.InterfaceC1762<T> {
        public C1778() {
        }

        @Override // androidx.recyclerview.widget.C8947.InterfaceC1762
        /* JADX INFO: renamed from: ۥ */
        public void mo4974(@InterfaceC6391 List<T> list, @InterfaceC6391 List<T> list2) {
            AbstractC8985.this.m30692(list, list2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC8985(@InterfaceC6391 C8961.AbstractC8963<T> abstractC8963) {
        C1778 c1778 = new C1778();
        this.f3978 = c1778;
        C8947<T> c8947 = new C8947<>(new C1759(this), new C8946.C1760(abstractC8963).m4968());
        this.f3977 = c8947;
        c8947.m4970(c1778);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8909
    public int getItemCount() {
        return this.f3977.m4971().size();
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟ */
    public List<T> m5000() {
        return this.f3977.m4971();
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public T m30691(int i) {
        return this.f3977.m4971().get(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m30692(@InterfaceC6391 List<T> list, @InterfaceC6391 List<T> list2) {
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m30693(@InterfaceC6490 List<T> list) {
        this.f3977.m30525(list);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m30694(@InterfaceC6490 List<T> list, @InterfaceC6490 Runnable runnable) {
        this.f3977.m30526(list, runnable);
    }

    public AbstractC8985(@InterfaceC6391 C8946<T> c8946) {
        C1778 c1778 = new C1778();
        this.f3978 = c1778;
        C8947<T> c8947 = new C8947<>(new C1759(this), c8946);
        this.f3977 = c8947;
        c8947.m4970(c1778);
    }
}
