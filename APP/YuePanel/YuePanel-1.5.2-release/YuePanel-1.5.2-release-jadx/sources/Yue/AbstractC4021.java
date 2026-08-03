package Yue;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.nmmedit.protect.NativeUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4021<T> extends RecyclerView.AbstractC8909<C4022> {

    /* JADX INFO: renamed from: ۥ */
    public SparseArray<C4022> f632 = new SparseArray<>();

    /* JADX INFO: renamed from: ۥ۟ */
    public List<T> f633 = new ArrayList();

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public InterfaceC0308<T> f8086;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public InterfaceC0309<T> f8087;

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۡۢ$ۥ */
    public interface InterfaceC0308<T> {
        /* JADX INFO: renamed from: ۥ */
        void mo239(T t, int i);
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۡۢ$ۥ۟ */
    public interface InterfaceC0309<T> {
        /* JADX INFO: renamed from: ۥ */
        boolean mo238(T t, int i);
    }

    static {
        NativeUtil.classesInit0(678);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static native /* synthetic */ void m983(AbstractC4021 abstractC4021, Object obj, int i, View view);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ boolean m11359(AbstractC4021 abstractC4021, Object obj, int i, View view);

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8909
    public native int getItemCount();

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8909
    public native /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.AbstractC8938 abstractC8938, int i);

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8909
    @InterfaceC6391
    public native /* bridge */ /* synthetic */ RecyclerView.AbstractC8938 onCreateViewHolder(ViewGroup viewGroup, int i);

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8909
    public native /* bridge */ /* synthetic */ void onViewRecycled(RecyclerView.AbstractC8938 abstractC8938);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public native void m11360(int i, T t);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public native void m11361(List<T> list);

    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public abstract void mo9514(C4022 c4022, T t, int i);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public native void m11362(int i);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public native void m11363();

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public native void m11364();

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public native List<T> m11365();

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public native T m11366(int i);

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public abstract int mo9515();

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public native View m11367(int i);

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final native /* synthetic */ void m11368(Object obj, int i, View view);

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final native /* synthetic */ boolean m11369(Object obj, int i, View view);

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public native void m11370(C4022 c4022, int i);

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public native C4022 m11371(ViewGroup viewGroup, int i);

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public native void m11372(C4022 c4022);

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public native void m11373(List<T> list);

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public native void m11374(InterfaceC0308<T> interfaceC0308);

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public native void m11375(InterfaceC0309<T> interfaceC0309);
}
