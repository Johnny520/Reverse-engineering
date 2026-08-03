package Yue;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۧۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5746<D> {

    /* JADX INFO: renamed from: ۥ */
    public int f1647;

    /* JADX INFO: renamed from: ۥ۟ */
    public InterfaceC5747<D> f1648;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public InterfaceC0858<D> f14249;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public Context f14250;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean f14251 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean f14252 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public boolean f14253 = true;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean f14254 = false;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean f14255 = false;

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۧۥ$ۥ */
    public final class C0857 extends ContentObserver {
        public C0857() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            C5746.this.m17819();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۧۥ$ۥ۟ */
    public interface InterfaceC0858<D> {
        /* JADX INFO: renamed from: ۥ */
        void m2423(@InterfaceC6391 C5746<D> c5746);
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۧۥ$ۥ۟۟, reason: contains not printable characters */
    public interface InterfaceC5747<D> {
        /* JADX INFO: renamed from: ۥ */
        void mo2424(@InterfaceC6391 C5746<D> c5746, @InterfaceC6490 D d);
    }

    public C5746(@InterfaceC6391 Context context) {
        this.f14250 = context.getApplicationContext();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        C4326.m1290(this, sb);
        sb.append(" id=");
        sb.append(this.f1647);
        sb.append("}");
        return sb.toString();
    }

    @InterfaceC5922
    /* JADX INFO: renamed from: ۥ */
    public void m2421() {
        this.f14252 = true;
        m17818();
    }

    @InterfaceC5922
    /* JADX INFO: renamed from: ۥ۟ */
    public boolean m2422() {
        return mo9060();
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m17809() {
        this.f14255 = false;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public String m17810(@InterfaceC6490 D d) {
        StringBuilder sb = new StringBuilder(64);
        C4326.m1290(d, sb);
        sb.append("}");
        return sb.toString();
    }

    @InterfaceC5922
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m17811() {
        InterfaceC0858<D> interfaceC0858 = this.f14249;
        if (interfaceC0858 != null) {
            interfaceC0858.m2423(this);
        }
    }

    @InterfaceC5922
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public void mo12295(@InterfaceC6490 D d) {
        InterfaceC5747<D> interfaceC5747 = this.f1648;
        if (interfaceC5747 != null) {
            interfaceC5747.mo2424(this, d);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public void mo9059(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f1647);
        printWriter.print(" mListener=");
        printWriter.println(this.f1648);
        if (this.f14251 || this.f14254 || this.f14255) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f14251);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f14254);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f14255);
        }
        if (this.f14252 || this.f14253) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f14252);
            printWriter.print(" mReset=");
            printWriter.println(this.f14253);
        }
    }

    @InterfaceC5922
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m17812() {
        mo9061();
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public Context m17813() {
        return this.f14250;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public int m17814() {
        return this.f1647;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public boolean m17815() {
        return this.f14252;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public boolean m17816() {
        return this.f14253;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public boolean m17817() {
        return this.f14251;
    }

    @InterfaceC5922
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void m17818() {
    }

    @InterfaceC5922
    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public boolean mo9060() {
        return false;
    }

    @InterfaceC5922
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m17819() {
        if (this.f14251) {
            m17812();
        } else {
            this.f14254 = true;
        }
    }

    @InterfaceC5922
    /* JADX INFO: renamed from: ۥ۟۟۠۠ */
    public void mo9061() {
    }

    @InterfaceC5922
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public void mo12296() {
    }

    @InterfaceC5922
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
    public void mo12297() {
    }

    @InterfaceC5922
    /* JADX INFO: renamed from: ۥۣ۟۟۠ */
    public void mo12298() {
    }

    @InterfaceC5922
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public void m17820(int i, @InterfaceC6391 InterfaceC5747<D> interfaceC5747) {
        if (this.f1648 != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f1648 = interfaceC5747;
        this.f1647 = i;
    }

    @InterfaceC5922
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public void m17821(@InterfaceC6391 InterfaceC0858<D> interfaceC0858) {
        if (this.f14249 != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f14249 = interfaceC0858;
    }

    @InterfaceC5922
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public void m17822() {
        mo12296();
        this.f14253 = true;
        this.f14251 = false;
        this.f14252 = false;
        this.f14254 = false;
        this.f14255 = false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public void m17823() {
        if (this.f14255) {
            m17819();
        }
    }

    @InterfaceC5922
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final void m17824() {
        this.f14251 = true;
        this.f14253 = false;
        this.f14252 = false;
        mo12297();
    }

    @InterfaceC5922
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public void m17825() {
        this.f14251 = false;
        mo12298();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public boolean m17826() {
        boolean z = this.f14254;
        this.f14254 = false;
        this.f14255 |= z;
        return z;
    }

    @InterfaceC5922
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public void m17827(@InterfaceC6391 InterfaceC5747<D> interfaceC5747) {
        InterfaceC5747<D> interfaceC57472 = this.f1648;
        if (interfaceC57472 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (interfaceC57472 != interfaceC5747) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.f1648 = null;
    }

    @InterfaceC5922
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public void m17828(@InterfaceC6391 InterfaceC0858<D> interfaceC0858) {
        InterfaceC0858<D> interfaceC08582 = this.f14249;
        if (interfaceC08582 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (interfaceC08582 != interfaceC0858) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.f14249 = null;
    }
}
