package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.appcompat.app.C0076;
import androidx.appcompat.app.C0108;
import com.bumptech.glide.load.engine.InterfaceC2988;
import com.bumptech.glide.load.engine.bitmap_recycle.C2973;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC2978;
import com.google.protobuf.C3530;
import java.io.InputStream;
import java.util.ArrayDeque;
import p222.C7980;
import p234.C8080;
import p235.C8087;
import p286.C8396;
import p286.InterfaceC8399;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3028 implements InterfaceC8399 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f9644;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f9645;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f9646;

    public C3028(Resources resources, InterfaceC8399 interfaceC8399) {
        this.f9646 = 0;
        this.f9644 = resources;
        this.f9645 = interfaceC8399;
    }

    @Override // p286.InterfaceC8399
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC2988 mo6464(Object obj, int i, int i2, C8396 c8396) {
        boolean z;
        C3032 c3032;
        C7980 c7980;
        switch (this.f9646) {
            case 0:
                InterfaceC2988 interfaceC2988Mo6464 = ((InterfaceC8399) this.f9645).mo6464(obj, i, i2, c8396);
                Resources resources = (Resources) this.f9644;
                if (interfaceC2988Mo6464 == null) {
                    return null;
                }
                return new C3025(resources, interfaceC2988Mo6464);
            case 1:
                InterfaceC2988 interfaceC2988M13537 = ((C8087) this.f9645).m13537((Uri) obj, c8396);
                if (interfaceC2988M13537 == null) {
                    return null;
                }
                return AbstractC3037.m6519((InterfaceC2978) this.f9644, (Drawable) ((C8080) interfaceC2988M13537).get(), i, i2);
            default:
                InputStream inputStream = (InputStream) obj;
                if (inputStream instanceof C3032) {
                    c3032 = (C3032) inputStream;
                    z = false;
                } else {
                    z = true;
                    c3032 = new C3032(inputStream, (C2973) this.f9644);
                }
                ArrayDeque arrayDeque = C7980.f22058;
                synchronized (arrayDeque) {
                    c7980 = (C7980) arrayDeque.poll();
                    break;
                }
                if (c7980 == null) {
                    c7980 = new C7980();
                }
                C7980 c79802 = c7980;
                c79802.f22060 = c3032;
                C3530 c3530 = new C3530(c79802);
                C0076 c0076 = new C0076(c3032, 17, c79802);
                try {
                    C3039 c3039 = (C3039) this.f9645;
                    C3025 c3025M6524 = c3039.m6524(new C0108(c3530, c3039.f9682, c3039.f9683), i, i2, c8396, c0076);
                    c79802.f22059 = null;
                    c79802.f22060 = null;
                    synchronized (arrayDeque) {
                        arrayDeque.offer(c79802);
                        break;
                    }
                    if (z) {
                        c3032.m6488();
                    }
                    return c3025M6524;
                } catch (Throwable th) {
                    c79802.f22059 = null;
                    c79802.f22060 = null;
                    ArrayDeque arrayDeque2 = C7980.f22058;
                    synchronized (arrayDeque2) {
                        arrayDeque2.offer(c79802);
                        if (!z) {
                            throw th;
                        }
                        c3032.m6488();
                        throw th;
                    }
                }
        }
    }

    @Override // p286.InterfaceC8399
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo6465(Object obj, C8396 c8396) {
        switch (this.f9646) {
            case 0:
                return ((InterfaceC8399) this.f9645).mo6465(obj, c8396);
            case 1:
                return "android.resource".equals(((Uri) obj).getScheme());
            default:
                return true;
        }
    }

    public /* synthetic */ C3028(Object obj, int i, Object obj2) {
        this.f9646 = i;
        this.f9645 = obj;
        this.f9644 = obj2;
    }
}
