package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.appcompat.app.C0108;
import androidx.core.util.InterfaceC2186;
import com.bumptech.glide.Registry$MissingComponentException;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.data.InterfaceC2960;
import io.ktor.util.C4211;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p222.AbstractC7989;
import p228.C8036;
import p233.InterfaceC8077;
import p286.C8397;
import p286.InterfaceC8393;
import p286.InterfaceC8399;
import p286.InterfaceC8400;
import p286.InterfaceC8401;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3012 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String f9575;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC2186 f9576;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC8077 f9577;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f9578;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Class f9579;

    public C3012(Class cls, Class cls2, Class cls3, List list, InterfaceC8077 interfaceC8077, InterfaceC2186 interfaceC2186) {
        this.f9579 = cls;
        this.f9578 = list;
        this.f9577 = interfaceC8077;
        this.f9576 = interfaceC2186;
        this.f9575 = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.f9579 + ", decoders=" + this.f9578 + ", transcoder=" + this.f9577 + '}';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC2989 m6508(InterfaceC2960 interfaceC2960, int i, int i2, C8397 c8397, List list) throws GlideException {
        List list2 = this.f9578;
        int size = list2.size();
        InterfaceC2989 interfaceC2989Mo6524 = null;
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC8400 interfaceC8400 = (InterfaceC8400) list2.get(i3);
            try {
                if (interfaceC8400.mo6525(interfaceC2960.mo6426(), c8397)) {
                    interfaceC2989Mo6524 = interfaceC8400.mo6524(interfaceC2960.mo6426(), i, i2, c8397);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + interfaceC8400, e);
                }
                list.add(e);
            }
            if (interfaceC2989Mo6524 != null) {
                break;
            }
        }
        if (interfaceC2989Mo6524 != null) {
            return interfaceC2989Mo6524;
        }
        throw new GlideException(this.f9575, new ArrayList(list));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC2989 m6509(int i, int i2, InterfaceC2960 interfaceC2960, C2985 c2985, C8397 c8397) {
        InterfaceC2989 interfaceC2989Mo6535;
        InterfaceC8399 interfaceC8399;
        EncodeStrategy encodeStrategyMo293;
        InterfaceC8401 interfaceC8401M2849;
        InterfaceC2989 interfaceC2989;
        boolean z;
        boolean z2;
        boolean z3;
        Object c2994;
        InterfaceC2186 interfaceC2186 = this.f9576;
        List list = (List) interfaceC2186.acquire();
        AbstractC7989.m13469(list, "Argument must not be null");
        try {
            InterfaceC2989 interfaceC2989M6508 = m6508(interfaceC2960, i, i2, c8397, list);
            interfaceC2186.mo3989(list);
            RunnableC3015 runnableC3015 = (RunnableC3015) c2985.f9439;
            DataSource dataSource = (DataSource) c2985.f9440;
            C3011 c3011 = runnableC3015.f9620;
            Class<?> cls = interfaceC2989M6508.get().getClass();
            if (dataSource != DataSource.RESOURCE_DISK_CACHE) {
                InterfaceC8399 interfaceC8399M6503 = c3011.m6503(cls);
                interfaceC8399 = interfaceC8399M6503;
                interfaceC2989Mo6535 = interfaceC8399M6503.mo6535(runnableC3015.f9614, interfaceC2989M6508, runnableC3015.f9603, runnableC3015.f9602);
            } else {
                interfaceC2989Mo6535 = interfaceC2989M6508;
                interfaceC8399 = null;
            }
            if (!interfaceC2989M6508.equals(interfaceC2989Mo6535)) {
                interfaceC2989M6508.recycle();
            }
            if (c3011.f9560.m6884().f9805.m2849(interfaceC2989Mo6535.mo6470()) != null) {
                interfaceC8401M2849 = c3011.f9560.m6884().f9805.m2849(interfaceC2989Mo6535.mo6470());
                if (interfaceC8401M2849 == null) {
                    final Class clsMo6470 = interfaceC2989Mo6535.mo6470();
                    throw new Registry$MissingComponentException(clsMo6470) { // from class: com.bumptech.glide.Registry$NoResultEncoderAvailableException
                        {
                            super("Failed to find result encoder for resource class: " + clsMo6470 + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
                        }
                    };
                }
                encodeStrategyMo293 = interfaceC8401M2849.mo293(runnableC3015.f9600);
            } else {
                encodeStrategyMo293 = EncodeStrategy.NONE;
                interfaceC8401M2849 = null;
            }
            InterfaceC8393 interfaceC8393 = runnableC3015.f9598;
            ArrayList arrayListM6506 = c3011.m6506();
            int size = arrayListM6506.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    interfaceC2989 = null;
                    z = false;
                    break;
                }
                interfaceC2989 = null;
                if (((C8036) arrayListM6506.get(i3)).f22188.equals(interfaceC8393)) {
                    z = true;
                    break;
                }
                i3++;
            }
            switch (runnableC3015.f9601.f9583) {
                case 0:
                case 1:
                    z2 = false;
                    break;
                default:
                    z2 = ((!z && dataSource == DataSource.DATA_DISK_CACHE) || dataSource == DataSource.LOCAL) && encodeStrategyMo293 == EncodeStrategy.TRANSFORMED;
                    break;
            }
            if (z2) {
                if (interfaceC8401M2849 == null) {
                    final Class<?> cls2 = interfaceC2989Mo6535.get().getClass();
                    throw new Registry$MissingComponentException(cls2) { // from class: com.bumptech.glide.Registry$NoResultEncoderAvailableException
                        {
                            super("Failed to find result encoder for resource class: " + cls2 + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
                        }
                    };
                }
                int i4 = AbstractC3010.f9554[encodeStrategyMo293.ordinal()];
                if (i4 == 1) {
                    z3 = true;
                    c2994 = new C2994(runnableC3015.f9598, runnableC3015.f9615);
                } else {
                    if (i4 != 2) {
                        C4211.m8604(encodeStrategyMo293, "Unknown strategy: ");
                        return interfaceC2989;
                    }
                    z3 = true;
                    c2994 = new C2987(c3011.f9560.f9821, runnableC3015.f9598, runnableC3015.f9615, runnableC3015.f9603, runnableC3015.f9602, interfaceC8399, cls, runnableC3015.f9600);
                }
                C2990 c2990 = (C2990) C2990.f9461.acquire();
                c2990.f9462 = false;
                c2990.f9464 = z3;
                c2990.f9463 = interfaceC2989Mo6535;
                C0108 c0108 = runnableC3015.f9616;
                c0108.f319 = c2994;
                c0108.f320 = interfaceC8401M2849;
                c0108.f318 = c2990;
                interfaceC2989Mo6535 = c2990;
            }
            return this.f9577.mo340(interfaceC2989Mo6535, c8397);
        } catch (Throwable th) {
            interfaceC2186.mo3989(list);
            throw th;
        }
    }
}
