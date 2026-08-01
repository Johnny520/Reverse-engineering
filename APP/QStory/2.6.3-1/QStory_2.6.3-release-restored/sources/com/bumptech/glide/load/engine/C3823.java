package com.bumptech.glide.load.engine;

import android.os.SystemClock;
import android.util.Log;
import androidx.appcompat.app.C0955;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC3792;
import com.bumptech.glide.load.data.InterfaceC3794;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import p238.AbstractC8815;
import p244.C8865;
import p246.InterfaceC8881;
import p302.InterfaceC9222;
import p302.InterfaceC9225;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3823 implements InterfaceC3824, InterfaceC3825 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public volatile Object f9811;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public volatile C3827 f9812;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public volatile C8865 f9813;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public volatile C3826 f9814;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final RunnableC3847 f9815;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public volatile int f9816;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C3843 f9817;

    public C3823(C3843 c3843, RunnableC3847 runnableC3847) {
        this.f9817 = c3843;
        this.f9815 = runnableC3847;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3824
    public final void cancel() {
        C8865 c8865 = this.f9813;
        if (c8865 != null) {
            c8865.f22531.cancel();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m7034(Object obj) throws Throwable {
        Throwable th;
        int i = AbstractC8815.f22409;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        try {
            InterfaceC3792 interfaceC3792M7442 = this.f9817.f9905.m7444().m7442(obj);
            Object objMo6986 = interfaceC3792M7442.mo6986();
            InterfaceC9225 interfaceC9225M7064 = this.f9817.m7064(objMo6986);
            C0955 c0955 = new C0955(interfaceC9225M7064, objMo6986, this.f9817.f9918, 8);
            InterfaceC9222 interfaceC9222 = this.f9813.f22533;
            C3843 c3843 = this.f9817;
            C3826 c3826 = new C3826(interfaceC9222, c3843.f9908);
            InterfaceC8881 interfaceC8881M7046 = c3843.f9914.m7046();
            interfaceC8881M7046.mo12215(c3826, c0955);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + c3826 + ", data: " + obj + ", encoder: " + interfaceC9225M7064 + ", duration: " + AbstractC8815.m14026(jElapsedRealtimeNanos));
            }
            if (interfaceC8881M7046.mo12213(c3826) != null) {
                this.f9814 = c3826;
                this.f9812 = new C3827(Collections.singletonList(this.f9813.f22533), this.f9817, this);
                this.f9813.f22531.mo6992();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.f9814 + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.f9815.mo7035(this.f9813.f22533, interfaceC3792M7442.mo6986(), this.f9813.f22531, this.f9813.f22531.mo6991(), this.f9813.f22533);
                return false;
            } catch (Throwable th2) {
                th = th2;
                z = true;
                if (z) {
                    throw th;
                }
                this.f9813.f22531.mo6992();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3825
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo7035(InterfaceC9222 interfaceC9222, Object obj, InterfaceC3794 interfaceC3794, DataSource dataSource, InterfaceC9222 interfaceC92222) {
        this.f9815.mo7035(interfaceC9222, obj, interfaceC3794, this.f9813.f22531.mo6991(), interfaceC9222);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    @Override // com.bumptech.glide.load.engine.InterfaceC3824
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo7029() {
        if (this.f9811 != null) {
            Object obj = this.f9811;
            this.f9811 = null;
            try {
            } catch (IOException e) {
                if (Log.isLoggable("SourceGenerator", 3)) {
                    Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e);
                }
            }
            if (m7034(obj)) {
                if (this.f9812 == null || !this.f9812.mo7029()) {
                    this.f9812 = null;
                    this.f9813 = null;
                    boolean z = false;
                    while (!z && this.f9816 < this.f9817.m7066().size()) {
                        ArrayList arrayListM7066 = this.f9817.m7066();
                        int i = this.f9816;
                        this.f9816 = i + 1;
                        this.f9813 = (C8865) arrayListM7066.get(i);
                        if (this.f9813 != null && (this.f9817.f9913.m7070(this.f9813.f22531.mo6991()) || this.f9817.m7065(this.f9813.f22531.mo6993()) != null)) {
                            this.f9813.f22531.mo6990(this.f9817.f9912, new C3817(this, this.f9813));
                            z = true;
                        }
                    }
                    return z;
                }
            }
        }
        return true;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3825
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo7036(InterfaceC9222 interfaceC9222, Exception exc, InterfaceC3794 interfaceC3794, DataSource dataSource) {
        this.f9815.mo7036(interfaceC9222, exc, interfaceC3794, this.f9813.f22531.mo6991());
    }
}
