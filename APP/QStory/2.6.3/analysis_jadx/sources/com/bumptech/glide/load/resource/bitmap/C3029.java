package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.appcompat.app.C0076;
import androidx.appcompat.app.C0108;
import com.bumptech.glide.load.engine.InterfaceC2989;
import com.bumptech.glide.load.engine.bitmap_recycle.C2974;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC2979;
import com.google.protobuf.C3531;
import java.io.InputStream;
import java.util.ArrayDeque;
import p222.C7981;
import p234.C8081;
import p235.C8088;
import p286.C8397;
import p286.InterfaceC8400;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3029 implements InterfaceC8400 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f9646;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f9647;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f9648;

    public C3029(Resources resources, InterfaceC8400 interfaceC8400) {
        this.f9648 = 0;
        this.f9646 = resources;
        this.f9647 = interfaceC8400;
    }

    @Override // p286.InterfaceC8400
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC2989 mo6524(Object obj, int i, int i2, C8397 c8397) {
        boolean z;
        C3033 c3033;
        C7981 c7981;
        switch (this.f9648) {
            case 0:
                InterfaceC2989 interfaceC2989Mo6524 = ((InterfaceC8400) this.f9647).mo6524(obj, i, i2, c8397);
                Resources resources = (Resources) this.f9646;
                if (interfaceC2989Mo6524 == null) {
                    return null;
                }
                return new C3026(resources, interfaceC2989Mo6524);
            case 1:
                InterfaceC2989 interfaceC2989M13566 = ((C8088) this.f9647).m13566((Uri) obj, c8397);
                if (interfaceC2989M13566 == null) {
                    return null;
                }
                return AbstractC3038.m6579((InterfaceC2979) this.f9646, (Drawable) ((C8081) interfaceC2989M13566).get(), i, i2);
            default:
                InputStream inputStream = (InputStream) obj;
                if (inputStream instanceof C3033) {
                    c3033 = (C3033) inputStream;
                    z = false;
                } else {
                    z = true;
                    c3033 = new C3033(inputStream, (C2974) this.f9646);
                }
                ArrayDeque arrayDeque = C7981.f22055;
                synchronized (arrayDeque) {
                    c7981 = (C7981) arrayDeque.poll();
                    break;
                }
                if (c7981 == null) {
                    c7981 = new C7981();
                }
                C7981 c79812 = c7981;
                c79812.f22057 = c3033;
                C3531 c3531 = new C3531(c79812);
                C0076 c0076 = new C0076(c3033, 17, c79812);
                try {
                    C3040 c3040 = (C3040) this.f9647;
                    C3026 c3026M6584 = c3040.m6584(new C0108(c3531, c3040.f9684, c3040.f9685), i, i2, c8397, c0076);
                    c79812.f22056 = null;
                    c79812.f22057 = null;
                    synchronized (arrayDeque) {
                        arrayDeque.offer(c79812);
                        break;
                    }
                    if (z) {
                        c3033.m6548();
                    }
                    return c3026M6584;
                } catch (Throwable th) {
                    c79812.f22056 = null;
                    c79812.f22057 = null;
                    ArrayDeque arrayDeque2 = C7981.f22055;
                    synchronized (arrayDeque2) {
                        arrayDeque2.offer(c79812);
                        if (!z) {
                            throw th;
                        }
                        c3033.m6548();
                        throw th;
                    }
                }
        }
    }

    @Override // p286.InterfaceC8400
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo6525(Object obj, C8397 c8397) {
        switch (this.f9648) {
            case 0:
                return ((InterfaceC8400) this.f9647).mo6525(obj, c8397);
            case 1:
                return "android.resource".equals(((Uri) obj).getScheme());
            default:
                return true;
        }
    }

    public /* synthetic */ C3029(Object obj, int i, Object obj2) {
        this.f9648 = i;
        this.f9647 = obj;
        this.f9646 = obj2;
    }
}
