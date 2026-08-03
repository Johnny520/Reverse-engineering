package Yue;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: Yue.ۥۣۡۥۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6594 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f16920 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f16921 = -2;

    /* JADX INFO: renamed from: ۥ */
    public final DataSetObservable f2158 = new DataSetObservable();

    /* JADX INFO: renamed from: ۥ۟ */
    public DataSetObserver f2159;

    @Deprecated
    /* JADX INFO: renamed from: ۥ */
    public void m3054(@InterfaceC6391 View view, int i, @InterfaceC6391 Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void mo1900(@InterfaceC6391 ViewGroup viewGroup, int i, @InterfaceC6391 Object obj) {
        m3054(viewGroup, i, obj);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m20921(@InterfaceC6391 View view) {
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public void mo15687(@InterfaceC6391 ViewGroup viewGroup) {
        m20921(viewGroup);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public abstract int m20922();

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int m20923(@InterfaceC6391 Object obj) {
        return -1;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public CharSequence m20924(int i) {
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public float m20925(int i) {
        return 1.0f;
    }

    @InterfaceC6391
    @Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public Object m20926(@InterfaceC6391 View view, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public Object mo15688(@InterfaceC6391 ViewGroup viewGroup, int i) {
        return m20926(viewGroup, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public abstract boolean mo15689(@InterfaceC6391 View view, @InterfaceC6391 Object obj);

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m20927() {
        synchronized (this) {
            try {
                DataSetObserver dataSetObserver = this.f2159;
                if (dataSetObserver != null) {
                    dataSetObserver.onChanged();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f2158.notifyChanged();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m20928(@InterfaceC6391 DataSetObserver dataSetObserver) {
        this.f2158.registerObserver(dataSetObserver);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public void mo15690(@InterfaceC6490 Parcelable parcelable, @InterfaceC6490 ClassLoader classLoader) {
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public Parcelable mo15691() {
        return null;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m20929(@InterfaceC6391 View view, int i, @InterfaceC6391 Object obj) {
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠ */
    public void mo15692(@InterfaceC6391 ViewGroup viewGroup, int i, @InterfaceC6391 Object obj) {
        m20929(viewGroup, i, obj);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public void m20930(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f2159 = dataSetObserver;
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void m20931(@InterfaceC6391 View view) {
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠ */
    public void mo15693(@InterfaceC6391 ViewGroup viewGroup) {
        m20931(viewGroup);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public void m20932(@InterfaceC6391 DataSetObserver dataSetObserver) {
        this.f2158.unregisterObserver(dataSetObserver);
    }
}
