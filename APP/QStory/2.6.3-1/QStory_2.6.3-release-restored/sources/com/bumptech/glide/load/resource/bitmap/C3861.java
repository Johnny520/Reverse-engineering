package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.appcompat.app.C0923;
import androidx.appcompat.app.C0955;
import com.bumptech.glide.load.engine.InterfaceC3821;
import com.bumptech.glide.load.engine.bitmap_recycle.C3806;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3811;
import com.google.protobuf.C4363;
import java.io.InputStream;
import java.util.ArrayDeque;
import p238.C8810;
import p250.C8910;
import p251.C8917;
import p302.C9226;
import p302.InterfaceC9229;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3861 implements InterfaceC9229 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f9991;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f9992;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f9993;

    public C3861(Resources resources, InterfaceC9229 interfaceC9229) {
        this.f9993 = 0;
        this.f9991 = resources;
        this.f9992 = interfaceC9229;
    }

    @Override // p302.InterfaceC9229
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC3821 mo7084(Object obj, int i, int i2, C9226 c9226) {
        boolean z;
        C3865 c3865;
        C8810 c8810;
        switch (this.f9993) {
            case 0:
                InterfaceC3821 interfaceC3821Mo7084 = ((InterfaceC9229) this.f9992).mo7084(obj, i, i2, c9226);
                Resources resources = (Resources) this.f9991;
                if (interfaceC3821Mo7084 == null) {
                    return null;
                }
                return new C3858(resources, interfaceC3821Mo7084);
            case 1:
                InterfaceC3821 interfaceC3821M14125 = ((C8917) this.f9992).m14125((Uri) obj, c9226);
                if (interfaceC3821M14125 == null) {
                    return null;
                }
                return AbstractC3870.m7139((InterfaceC3811) this.f9991, (Drawable) ((C8910) interfaceC3821M14125).get(), i, i2);
            default:
                InputStream inputStream = (InputStream) obj;
                if (inputStream instanceof C3865) {
                    c3865 = (C3865) inputStream;
                    z = false;
                } else {
                    z = true;
                    c3865 = new C3865(inputStream, (C3806) this.f9991);
                }
                ArrayDeque arrayDeque = C8810.f22400;
                synchronized (arrayDeque) {
                    c8810 = (C8810) arrayDeque.poll();
                    break;
                }
                if (c8810 == null) {
                    c8810 = new C8810();
                }
                C8810 c88102 = c8810;
                c88102.f22402 = c3865;
                C4363 c4363 = new C4363(c88102);
                C0923 c0923 = new C0923(c3865, 17, c88102);
                try {
                    C3872 c3872 = (C3872) this.f9992;
                    C3858 c3858M7144 = c3872.m7144(new C0955(c4363, c3872.f10029, c3872.f10030), i, i2, c9226, c0923);
                    c88102.f22401 = null;
                    c88102.f22402 = null;
                    synchronized (arrayDeque) {
                        arrayDeque.offer(c88102);
                        break;
                    }
                    if (z) {
                        c3865.m7108();
                    }
                    return c3858M7144;
                } catch (Throwable th) {
                    c88102.f22401 = null;
                    c88102.f22402 = null;
                    ArrayDeque arrayDeque2 = C8810.f22400;
                    synchronized (arrayDeque2) {
                        arrayDeque2.offer(c88102);
                        if (!z) {
                            throw th;
                        }
                        c3865.m7108();
                        throw th;
                    }
                }
        }
    }

    @Override // p302.InterfaceC9229
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo7085(Object obj, C9226 c9226) {
        switch (this.f9993) {
            case 0:
                return ((InterfaceC9229) this.f9992).mo7085(obj, c9226);
            case 1:
                return "android.resource".equals(((Uri) obj).getScheme());
            default:
                return true;
        }
    }

    public /* synthetic */ C3861(Object obj, int i, Object obj2) {
        this.f9993 = i;
        this.f9992 = obj;
        this.f9991 = obj2;
    }
}
