package yyds;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: yyds.ᛲᛴᲈᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0342 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final AbstractFragmentC1695 f1788;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Object f1789 = new Object();

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public boolean f1790;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public boolean f1791;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public C0119 f1792;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public boolean f1793;

    public AbstractC0342(AbstractFragmentC1695 abstractFragmentC1695) {
        this.f1788 = abstractFragmentC1695;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m1027() {
        AbstractFragmentC1695 abstractFragmentC1695 = this.f1788;
        if (AbstractC0879.m1968(abstractFragmentC1695.getActivity())) {
            return;
        }
        RunnableC0309 runnableC0309 = new RunnableC0309(13, this);
        Bundle arguments = abstractFragmentC1695.getArguments();
        ArrayList parcelableArrayList = arguments == null ? null : Build.VERSION.SDK_INT >= 33 ? arguments.getParcelableArrayList("request_permissions", AbstractC0333.class) : arguments.getParcelableArrayList("request_permissions");
        if (parcelableArrayList != null) {
            Iterator it = parcelableArrayList.iterator();
            while (it.hasNext()) {
                ((AbstractC0333) it.next()).getClass();
            }
        }
        Handler handler = AbstractC1143.f5238;
        AbstractC1143.f5238.postAtTime(runnableC0309, this.f1789, SystemClock.uptimeMillis());
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public void mo1028(int i) {
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public void mo1029(int i) {
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public abstract void mo1030(Activity activity, ArrayList arrayList, int i);
}
