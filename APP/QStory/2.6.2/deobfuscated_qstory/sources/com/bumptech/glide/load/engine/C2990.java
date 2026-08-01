package com.bumptech.glide.load.engine;

import android.os.SystemClock;
import android.util.Log;
import androidx.appcompat.app.C0108;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC2959;
import com.bumptech.glide.load.data.InterfaceC2961;
import java.util.Collections;
import p222.AbstractC7985;
import p228.C8035;
import p230.InterfaceC8051;
import p286.InterfaceC8392;
import p286.InterfaceC8395;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2990 implements InterfaceC2991, InterfaceC2992 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public volatile Object f9464;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public volatile C2994 f9465;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public volatile C8035 f9466;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public volatile C2993 f9467;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final RunnableC3014 f9468;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public volatile int f9469;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C3010 f9470;

    public C2990(C3010 c3010, RunnableC3014 runnableC3014) {
        this.f9470 = c3010;
        this.f9468 = runnableC3014;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2991
    public final void cancel() {
        C8035 c8035 = this.f9466;
        if (c8035 != null) {
            c8035.f22189.cancel();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m6416(Object obj) throws Throwable {
        Throwable th;
        int i = AbstractC7985.f22067;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        try {
            InterfaceC2959 interfaceC2959M6895 = this.f9470.f9558.m6897().m6895(obj);
            Object objMo6368 = interfaceC2959M6895.mo6368();
            InterfaceC8395 interfaceC8395M6444 = this.f9470.m6444(objMo6368);
            C0108 c0108 = new C0108(interfaceC8395M6444, objMo6368, this.f9470.f9571, 8);
            InterfaceC8392 interfaceC8392 = this.f9466.f22191;
            C3010 c3010 = this.f9470;
            C2993 c2993 = new C2993(interfaceC8392, c3010.f9561);
            InterfaceC8051 interfaceC8051M6428 = c3010.f9567.m6428();
            interfaceC8051M6428.mo11635(c2993, c0108);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + c2993 + ", data: " + obj + ", encoder: " + interfaceC8395M6444 + ", duration: " + AbstractC7985.m13439(jElapsedRealtimeNanos));
            }
            if (interfaceC8051M6428.mo11638(c2993) != null) {
                this.f9467 = c2993;
                this.f9465 = new C2994(Collections.singletonList(this.f9466.f22191), this.f9470, this);
                this.f9466.f22189.mo6374();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.f9467 + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.f9468.mo6417(this.f9466.f22191, interfaceC2959M6895.mo6368(), this.f9466.f22189, this.f9466.f22189.mo6373(), this.f9466.f22191);
                return false;
            } catch (Throwable th2) {
                th = th2;
                z = true;
                if (z) {
                    throw th;
                }
                this.f9466.f22189.mo6374();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2992
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo6417(InterfaceC8392 interfaceC8392, Object obj, InterfaceC2961 interfaceC2961, DataSource dataSource, InterfaceC8392 interfaceC83922) {
        this.f9468.mo6417(interfaceC8392, obj, interfaceC2961, this.f9466.f22189.mo6373(), interfaceC8392);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    @Override // com.bumptech.glide.load.engine.InterfaceC2991
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo6411() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f9464
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L20
            java.lang.Object r0 = r5.f9464
            r5.f9464 = r1
            boolean r0 = r5.m6416(r0)     // Catch: java.io.IOException -> L11
            if (r0 != 0) goto L20
            goto L2c
        L11:
            r0 = move-exception
            r3 = 3
            java.lang.String r4 = "SourceGenerator"
            boolean r3 = android.util.Log.isLoggable(r4, r3)
            if (r3 == 0) goto L20
            java.lang.String r3 = "Failed to properly rewind or write data to cache"
            android.util.Log.d(r4, r3, r0)
        L20:
            com.bumptech.glide.load.engine.飘花落叶言子楪世哲苏兰 r0 = r5.f9465
            if (r0 == 0) goto L2d
            com.bumptech.glide.load.engine.飘花落叶言子楪世哲苏兰 r0 = r5.f9465
            boolean r0 = r0.mo6411()
            if (r0 == 0) goto L2d
        L2c:
            return r2
        L2d:
            r5.f9465 = r1
            r5.f9466 = r1
            r0 = 0
        L32:
            if (r0 != 0) goto L90
            int r1 = r5.f9469
            com.bumptech.glide.load.engine.飘花落叶言子楪苏世哲兰 r3 = r5.f9470
            java.util.ArrayList r3 = r3.m6446()
            int r3 = r3.size()
            if (r1 >= r3) goto L90
            com.bumptech.glide.load.engine.飘花落叶言子楪苏世哲兰 r1 = r5.f9470
            java.util.ArrayList r1 = r1.m6446()
            int r3 = r5.f9469
            int r4 = r3 + 1
            r5.f9469 = r4
            java.lang.Object r1 = r1.get(r3)
            飘花落叶言楪世子哲兰苏.飘花落叶言子楪哲苏兰世 r1 = (p228.C8035) r1
            r5.f9466 = r1
            飘花落叶言楪世子哲兰苏.飘花落叶言子楪哲苏兰世 r1 = r5.f9466
            if (r1 == 0) goto L32
            com.bumptech.glide.load.engine.飘花落叶言子楪苏世哲兰 r1 = r5.f9470
            com.bumptech.glide.load.engine.飘花落叶言子楪苏兰哲世 r1 = r1.f9566
            飘花落叶言楪世子哲兰苏.飘花落叶言子楪哲苏兰世 r3 = r5.f9466
            com.bumptech.glide.load.data.飘花落叶言子楪世哲兰苏 r3 = r3.f22189
            com.bumptech.glide.load.DataSource r3 = r3.mo6373()
            boolean r1 = r1.m6450(r3)
            if (r1 != 0) goto L7c
            com.bumptech.glide.load.engine.飘花落叶言子楪苏世哲兰 r1 = r5.f9470
            飘花落叶言楪世子哲兰苏.飘花落叶言子楪哲苏兰世 r3 = r5.f9466
            com.bumptech.glide.load.data.飘花落叶言子楪世哲兰苏 r3 = r3.f22189
            java.lang.Class r3 = r3.mo6375()
            com.bumptech.glide.load.engine.飘花落叶言子楪兰哲苏世 r1 = r1.m6445(r3)
            if (r1 == 0) goto L32
        L7c:
            飘花落叶言楪世子哲兰苏.飘花落叶言子楪哲苏兰世 r0 = r5.f9466
            飘花落叶言楪世子哲兰苏.飘花落叶言子楪哲苏兰世 r1 = r5.f9466
            com.bumptech.glide.load.data.飘花落叶言子楪世哲兰苏 r1 = r1.f22189
            com.bumptech.glide.load.engine.飘花落叶言子楪苏世哲兰 r3 = r5.f9470
            com.bumptech.glide.Priority r3 = r3.f9565
            com.bumptech.glide.load.engine.飘花落叶言子世楪兰哲苏 r4 = new com.bumptech.glide.load.engine.飘花落叶言子世楪兰哲苏
            r4.<init>(r5, r0)
            r1.mo6372(r3, r4)
            r0 = r2
            goto L32
        L90:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.C2990.mo6411():boolean");
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2992
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo6418(InterfaceC8392 interfaceC8392, Exception exc, InterfaceC2961 interfaceC2961, DataSource dataSource) {
        this.f9468.mo6418(interfaceC8392, exc, interfaceC2961, this.f9466.f22189.mo6373());
    }
}
