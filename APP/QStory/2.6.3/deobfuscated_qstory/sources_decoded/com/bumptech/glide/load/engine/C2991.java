package com.bumptech.glide.load.engine;

import android.os.SystemClock;
import android.util.Log;
import androidx.appcompat.app.C0108;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC2960;
import com.bumptech.glide.load.data.InterfaceC2962;
import java.util.Collections;
import p222.AbstractC7986;
import p228.C8036;
import p230.InterfaceC8052;
import p286.InterfaceC8393;
import p286.InterfaceC8396;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2991 implements InterfaceC2992, InterfaceC2993 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public volatile Object f9466;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public volatile C2995 f9467;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public volatile C8036 f9468;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public volatile C2994 f9469;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final RunnableC3015 f9470;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public volatile int f9471;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C3011 f9472;

    public C2991(C3011 c3011, RunnableC3015 runnableC3015) {
        this.f9472 = c3011;
        this.f9470 = runnableC3015;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2992
    public final void cancel() {
        C8036 c8036 = this.f9468;
        if (c8036 != null) {
            c8036.f22186.cancel();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m6474(Object obj) throws Throwable {
        Throwable th;
        int i = AbstractC7986.f22064;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        try {
            InterfaceC2960 interfaceC2960M6882 = this.f9472.f9560.m6884().m6882(obj);
            Object objMo6426 = interfaceC2960M6882.mo6426();
            InterfaceC8396 interfaceC8396M6504 = this.f9472.m6504(objMo6426);
            C0108 c0108 = new C0108(interfaceC8396M6504, objMo6426, this.f9472.f9573, 8);
            InterfaceC8393 interfaceC8393 = this.f9468.f22188;
            C3011 c3011 = this.f9472;
            C2994 c2994 = new C2994(interfaceC8393, c3011.f9563);
            InterfaceC8052 interfaceC8052M6486 = c3011.f9569.m6486();
            interfaceC8052M6486.mo11656(c2994, c0108);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + c2994 + ", data: " + obj + ", encoder: " + interfaceC8396M6504 + ", duration: " + AbstractC7986.m13467(jElapsedRealtimeNanos));
            }
            if (interfaceC8052M6486.mo11654(c2994) != null) {
                this.f9469 = c2994;
                this.f9467 = new C2995(Collections.singletonList(this.f9468.f22188), this.f9472, this);
                this.f9468.f22186.mo6432();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.f9469 + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.f9470.mo6475(this.f9468.f22188, interfaceC2960M6882.mo6426(), this.f9468.f22186, this.f9468.f22186.mo6431(), this.f9468.f22188);
                return false;
            } catch (Throwable th2) {
                th = th2;
                z = true;
                if (z) {
                    throw th;
                }
                this.f9468.f22186.mo6432();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2993
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo6475(InterfaceC8393 interfaceC8393, Object obj, InterfaceC2962 interfaceC2962, DataSource dataSource, InterfaceC8393 interfaceC83932) {
        this.f9470.mo6475(interfaceC8393, obj, interfaceC2962, this.f9468.f22186.mo6431(), interfaceC8393);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    @Override // com.bumptech.glide.load.engine.InterfaceC2992
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo6469() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f9466
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L20
            java.lang.Object r0 = r5.f9466
            r5.f9466 = r1
            boolean r0 = r5.m6474(r0)     // Catch: java.io.IOException -> L11
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
            com.bumptech.glide.load.engine.飘花落叶言子楪世哲苏兰 r0 = r5.f9467
            if (r0 == 0) goto L2d
            com.bumptech.glide.load.engine.飘花落叶言子楪世哲苏兰 r0 = r5.f9467
            boolean r0 = r0.mo6469()
            if (r0 == 0) goto L2d
        L2c:
            return r2
        L2d:
            r5.f9467 = r1
            r5.f9468 = r1
            r0 = 0
        L32:
            if (r0 != 0) goto L90
            int r1 = r5.f9471
            com.bumptech.glide.load.engine.飘花落叶言子楪苏世哲兰 r3 = r5.f9472
            java.util.ArrayList r3 = r3.m6506()
            int r3 = r3.size()
            if (r1 >= r3) goto L90
            com.bumptech.glide.load.engine.飘花落叶言子楪苏世哲兰 r1 = r5.f9472
            java.util.ArrayList r1 = r1.m6506()
            int r3 = r5.f9471
            int r4 = r3 + 1
            r5.f9471 = r4
            java.lang.Object r1 = r1.get(r3)
            飘花落叶言楪世子哲兰苏.飘花落叶言子楪哲苏兰世 r1 = (p228.C8036) r1
            r5.f9468 = r1
            飘花落叶言楪世子哲兰苏.飘花落叶言子楪哲苏兰世 r1 = r5.f9468
            if (r1 == 0) goto L32
            com.bumptech.glide.load.engine.飘花落叶言子楪苏世哲兰 r1 = r5.f9472
            com.bumptech.glide.load.engine.飘花落叶言子楪苏兰哲世 r1 = r1.f9568
            飘花落叶言楪世子哲兰苏.飘花落叶言子楪哲苏兰世 r3 = r5.f9468
            com.bumptech.glide.load.data.飘花落叶言子楪世哲兰苏 r3 = r3.f22186
            com.bumptech.glide.load.DataSource r3 = r3.mo6431()
            boolean r1 = r1.m6510(r3)
            if (r1 != 0) goto L7c
            com.bumptech.glide.load.engine.飘花落叶言子楪苏世哲兰 r1 = r5.f9472
            飘花落叶言楪世子哲兰苏.飘花落叶言子楪哲苏兰世 r3 = r5.f9468
            com.bumptech.glide.load.data.飘花落叶言子楪世哲兰苏 r3 = r3.f22186
            java.lang.Class r3 = r3.mo6433()
            com.bumptech.glide.load.engine.飘花落叶言子楪兰哲苏世 r1 = r1.m6505(r3)
            if (r1 == 0) goto L32
        L7c:
            飘花落叶言楪世子哲兰苏.飘花落叶言子楪哲苏兰世 r0 = r5.f9468
            飘花落叶言楪世子哲兰苏.飘花落叶言子楪哲苏兰世 r1 = r5.f9468
            com.bumptech.glide.load.data.飘花落叶言子楪世哲兰苏 r1 = r1.f22186
            com.bumptech.glide.load.engine.飘花落叶言子楪苏世哲兰 r3 = r5.f9472
            com.bumptech.glide.Priority r3 = r3.f9567
            com.bumptech.glide.load.engine.飘花落叶言子世楪兰哲苏 r4 = new com.bumptech.glide.load.engine.飘花落叶言子世楪兰哲苏
            r4.<init>(r5, r0)
            r1.mo6430(r3, r4)
            r0 = r2
            goto L32
        L90:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.C2991.mo6469():boolean");
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2993
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo6476(InterfaceC8393 interfaceC8393, Exception exc, InterfaceC2962 interfaceC2962, DataSource dataSource) {
        this.f9470.mo6476(interfaceC8393, exc, interfaceC2962, this.f9468.f22186.mo6431());
    }
}
