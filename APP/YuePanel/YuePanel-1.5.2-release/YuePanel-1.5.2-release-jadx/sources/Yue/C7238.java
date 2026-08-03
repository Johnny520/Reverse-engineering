package Yue;

import Yue.C6934;
import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: Yue.ۥۡۧۤۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7238 {

    /* JADX INFO: renamed from: ۥ */
    public Context f2759;

    /* JADX INFO: renamed from: ۥ۟ */
    public int f2760;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public ViewGroup f21876;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public View f21877;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public Runnable f21878;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public Runnable f21879;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C7238(@InterfaceC6391 ViewGroup viewGroup) {
        this.f2760 = -1;
        this.f21876 = viewGroup;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static C7238 m22666(@InterfaceC6391 ViewGroup viewGroup) {
        return (C7238) viewGroup.getTag(C6934.C1117.f20097);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static C7238 m22667(@InterfaceC6391 ViewGroup viewGroup, @InterfaceC5683 int i, @InterfaceC6391 Context context) {
        SparseArray sparseArray = (SparseArray) viewGroup.getTag(C6934.C1117.f20102);
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            viewGroup.setTag(C6934.C1117.f20102, sparseArray);
        }
        C7238 c7238 = (C7238) sparseArray.get(i);
        if (c7238 != null) {
            return c7238;
        }
        C7238 c72382 = new C7238(viewGroup, i, context);
        sparseArray.put(i, c72382);
        return c72382;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static void m22668(@InterfaceC6391 ViewGroup viewGroup, @InterfaceC6490 C7238 c7238) {
        viewGroup.setTag(C6934.C1117.f20097, c7238);
    }

    /* JADX INFO: renamed from: ۥ */
    public void m3524() {
        if (this.f2760 > 0 || this.f21877 != null) {
            m22669().removeAllViews();
            if (this.f2760 > 0) {
                LayoutInflater.from(this.f2759).inflate(this.f2760, this.f21876);
            } else {
                this.f21876.addView(this.f21877);
            }
        }
        Runnable runnable = this.f21878;
        if (runnable != null) {
            runnable.run();
        }
        m22668(this.f21876, this);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m3525() {
        Runnable runnable;
        if (m22666(this.f21876) != this || (runnable = this.f21879) == null) {
            return;
        }
        runnable.run();
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public ViewGroup m22669() {
        return this.f21876;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean m22670() {
        return this.f2760 > 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m22671(@InterfaceC6490 Runnable runnable) {
        this.f21878 = runnable;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m22672(@InterfaceC6490 Runnable runnable) {
        this.f21879 = runnable;
    }

    public C7238(ViewGroup viewGroup, int i, Context context) {
        this.f2759 = context;
        this.f21876 = viewGroup;
        this.f2760 = i;
    }

    public C7238(@InterfaceC6391 ViewGroup viewGroup, @InterfaceC6391 View view) {
        this.f2760 = -1;
        this.f21876 = viewGroup;
        this.f21877 = view;
    }
}
