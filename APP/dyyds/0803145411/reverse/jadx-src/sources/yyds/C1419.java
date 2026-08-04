package yyds;

import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: yyds.ᛶᲀᲈᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1419 implements InterfaceC2633, InterfaceC2662 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public volatile C1199 f6705;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public volatile C0440 f6706;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public volatile int f6707;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public volatile Object f6708;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C1008 f6709;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public volatile C0768 f6710;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final RunnableC1650 f6711;

    public C1419(C1008 c1008, RunnableC1650 runnableC1650) {
        this.f6709 = c1008;
        this.f6711 = runnableC1650;
    }

    @Override // yyds.InterfaceC2633
    public final void cancel() {
        C1199 c1199 = this.f6705;
        if (c1199 != null) {
            c1199.f5473.cancel();
        }
    }

    @Override // yyds.InterfaceC2662
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void mo2883(InterfaceC1410 interfaceC1410, Object obj, InterfaceC0724 interfaceC0724, int i, InterfaceC1410 interfaceC14102) {
        this.f6711.mo2883(interfaceC1410, obj, interfaceC0724, this.f6705.f5473.mo513(), interfaceC1410);
    }

    @Override // yyds.InterfaceC2662
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void mo2884(InterfaceC1410 interfaceC1410, Exception exc, InterfaceC0724 interfaceC0724, int i) {
        this.f6711.mo2884(interfaceC1410, exc, interfaceC0724, this.f6705.f5473.mo513());
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final boolean m2885(Object obj) throws Throwable {
        Throwable th;
        int i = AbstractC1382.f6429;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        try {
            InterfaceC0740 interfaceC0740M3227 = this.f6709.f4594.m4645().m3227(obj);
            Object objMo245 = interfaceC0740M3227.mo245();
            InterfaceC1081 interfaceC1081M2189 = this.f6709.m2189(objMo245);
            C0644 c0644 = new C0644(interfaceC1081M2189, objMo245, this.f6709.f4583, 9);
            InterfaceC1410 interfaceC1410 = this.f6705.f5472;
            C1008 c1008 = this.f6709;
            C0440 c0440 = new C0440(interfaceC1410, c1008.f4580);
            InterfaceC0594 interfaceC0594M1635 = c1008.f4581.m1635();
            interfaceC0594M1635.mo948(c0440, c0644);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + c0440 + ", data: " + obj + ", encoder: " + interfaceC1081M2189 + ", duration: " + AbstractC1382.m2794(jElapsedRealtimeNanos));
            }
            if (interfaceC0594M1635.mo949(c0440) != null) {
                this.f6706 = c0440;
                this.f6710 = new C0768(Collections.singletonList(this.f6705.f5472), this.f6709, this);
                this.f6705.f5473.mo512();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.f6706 + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.f6711.mo2883(this.f6705.f5472, interfaceC0740M3227.mo245(), this.f6705.f5473, this.f6705.f5473.mo513(), this.f6705.f5472);
                return false;
            } catch (Throwable th2) {
                th = th2;
                z = true;
                if (z) {
                    throw th;
                }
                this.f6705.f5473.mo512();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    @Override // yyds.InterfaceC2633
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo1721() {
        if (this.f6708 != null) {
            Object obj = this.f6708;
            this.f6708 = null;
            try {
            } catch (IOException e) {
                if (Log.isLoggable("SourceGenerator", 3)) {
                    Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e);
                }
            }
            if (m2885(obj)) {
                if (this.f6710 == null || !this.f6710.mo1721()) {
                    this.f6710 = null;
                    this.f6705 = null;
                    boolean z = false;
                    while (!z && this.f6707 < this.f6709.m2187().size()) {
                        ArrayList arrayListM2187 = this.f6709.m2187();
                        int i = this.f6707;
                        this.f6707 = i + 1;
                        this.f6705 = (C1199) arrayListM2187.get(i);
                        if (this.f6705 != null && (this.f6709.f4595.m4360(this.f6705.f5473.mo513()) || this.f6709.m2188(this.f6705.f5473.mo417()) != null)) {
                            this.f6705.f5473.mo514(this.f6709.f4586, new C0119(this, 10, this.f6705));
                            z = true;
                        }
                    }
                    return z;
                }
            }
        }
        return true;
    }
}
