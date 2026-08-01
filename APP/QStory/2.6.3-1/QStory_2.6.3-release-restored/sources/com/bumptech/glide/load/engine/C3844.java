package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.appcompat.app.C0955;
import androidx.core.util.InterfaceC3019;
import com.bumptech.glide.Registry$MissingComponentException;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.data.InterfaceC3792;
import io.ktor.util.C5043;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p238.AbstractC8818;
import p244.C8865;
import p249.InterfaceC8906;
import p302.C9226;
import p302.InterfaceC9222;
import p302.InterfaceC9228;
import p302.InterfaceC9229;
import p302.InterfaceC9230;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3844 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String f9920;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC3019 f9921;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC8906 f9922;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f9923;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Class f9924;

    public C3844(Class cls, Class cls2, Class cls3, List list, InterfaceC8906 interfaceC8906, InterfaceC3019 interfaceC3019) {
        this.f9924 = cls;
        this.f9923 = list;
        this.f9922 = interfaceC8906;
        this.f9921 = interfaceC3019;
        this.f9920 = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.f9924 + ", decoders=" + this.f9923 + ", transcoder=" + this.f9922 + '}';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC3821 m7068(InterfaceC3792 interfaceC3792, int i, int i2, C9226 c9226, List list) throws GlideException {
        List list2 = this.f9923;
        int size = list2.size();
        InterfaceC3821 interfaceC3821Mo7084 = null;
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC9229 interfaceC9229 = (InterfaceC9229) list2.get(i3);
            try {
                if (interfaceC9229.mo7085(interfaceC3792.mo6986(), c9226)) {
                    interfaceC3821Mo7084 = interfaceC9229.mo7084(interfaceC3792.mo6986(), i, i2, c9226);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + interfaceC9229, e);
                }
                list.add(e);
            }
            if (interfaceC3821Mo7084 != null) {
                break;
            }
        }
        if (interfaceC3821Mo7084 != null) {
            return interfaceC3821Mo7084;
        }
        throw new GlideException(this.f9920, new ArrayList(list));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC3821 m7069(int i, int i2, InterfaceC3792 interfaceC3792, C3817 c3817, C9226 c9226) {
        InterfaceC3821 interfaceC3821Mo7095;
        InterfaceC9228 interfaceC9228;
        EncodeStrategy encodeStrategyMo853;
        InterfaceC9230 interfaceC9230M3409;
        InterfaceC3821 interfaceC3821;
        boolean z;
        boolean z2;
        boolean z3;
        Object c3826;
        InterfaceC3019 interfaceC3019 = this.f9921;
        List list = (List) interfaceC3019.acquire();
        AbstractC8818.m14028(list, "Argument must not be null");
        try {
            InterfaceC3821 interfaceC3821M7068 = m7068(interfaceC3792, i, i2, c9226, list);
            interfaceC3019.mo4549(list);
            RunnableC3847 runnableC3847 = (RunnableC3847) c3817.f9784;
            DataSource dataSource = (DataSource) c3817.f9785;
            C3843 c3843 = runnableC3847.f9965;
            Class<?> cls = interfaceC3821M7068.get().getClass();
            if (dataSource != DataSource.RESOURCE_DISK_CACHE) {
                InterfaceC9228 interfaceC9228M7063 = c3843.m7063(cls);
                interfaceC9228 = interfaceC9228M7063;
                interfaceC3821Mo7095 = interfaceC9228M7063.mo7095(runnableC3847.f9959, interfaceC3821M7068, runnableC3847.f9948, runnableC3847.f9947);
            } else {
                interfaceC3821Mo7095 = interfaceC3821M7068;
                interfaceC9228 = null;
            }
            if (!interfaceC3821M7068.equals(interfaceC3821Mo7095)) {
                interfaceC3821M7068.recycle();
            }
            if (c3843.f9905.m7444().f10150.m3409(interfaceC3821Mo7095.mo7030()) != null) {
                interfaceC9230M3409 = c3843.f9905.m7444().f10150.m3409(interfaceC3821Mo7095.mo7030());
                if (interfaceC9230M3409 == null) {
                    final Class clsMo7030 = interfaceC3821Mo7095.mo7030();
                    throw new Registry$MissingComponentException(clsMo7030) { // from class: com.bumptech.glide.Registry$NoResultEncoderAvailableException
                        {
                            super("Failed to find result encoder for resource class: " + clsMo7030 + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
                        }
                    };
                }
                encodeStrategyMo853 = interfaceC9230M3409.mo853(runnableC3847.f9945);
            } else {
                encodeStrategyMo853 = EncodeStrategy.NONE;
                interfaceC9230M3409 = null;
            }
            InterfaceC9222 interfaceC9222 = runnableC3847.f9943;
            ArrayList arrayListM7066 = c3843.m7066();
            int size = arrayListM7066.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    interfaceC3821 = null;
                    z = false;
                    break;
                }
                interfaceC3821 = null;
                if (((C8865) arrayListM7066.get(i3)).f22533.equals(interfaceC9222)) {
                    z = true;
                    break;
                }
                i3++;
            }
            switch (runnableC3847.f9946.f9928) {
                case 0:
                case 1:
                    z2 = false;
                    break;
                default:
                    z2 = ((!z && dataSource == DataSource.DATA_DISK_CACHE) || dataSource == DataSource.LOCAL) && encodeStrategyMo853 == EncodeStrategy.TRANSFORMED;
                    break;
            }
            if (z2) {
                if (interfaceC9230M3409 == null) {
                    final Class<?> cls2 = interfaceC3821Mo7095.get().getClass();
                    throw new Registry$MissingComponentException(cls2) { // from class: com.bumptech.glide.Registry$NoResultEncoderAvailableException
                        {
                            super("Failed to find result encoder for resource class: " + cls2 + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
                        }
                    };
                }
                int i4 = AbstractC3842.f9899[encodeStrategyMo853.ordinal()];
                if (i4 == 1) {
                    z3 = true;
                    c3826 = new C3826(runnableC3847.f9943, runnableC3847.f9960);
                } else {
                    if (i4 != 2) {
                        C5043.m9163(encodeStrategyMo853, "Unknown strategy: ");
                        return interfaceC3821;
                    }
                    z3 = true;
                    c3826 = new C3819(c3843.f9905.f10166, runnableC3847.f9943, runnableC3847.f9960, runnableC3847.f9948, runnableC3847.f9947, interfaceC9228, cls, runnableC3847.f9945);
                }
                C3822 c3822 = (C3822) C3822.f9806.acquire();
                c3822.f9807 = false;
                c3822.f9809 = z3;
                c3822.f9808 = interfaceC3821Mo7095;
                C0955 c0955 = runnableC3847.f9961;
                c0955.f664 = c3826;
                c0955.f665 = interfaceC9230M3409;
                c0955.f663 = c3822;
                interfaceC3821Mo7095 = c3822;
            }
            return this.f9922.mo900(interfaceC3821Mo7095, c9226);
        } catch (Throwable th) {
            interfaceC3019.mo4549(list);
            throw th;
        }
    }
}
