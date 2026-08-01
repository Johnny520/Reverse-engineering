package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.appcompat.app.C0108;
import androidx.core.util.InterfaceC2186;
import com.bumptech.glide.Registry$MissingComponentException;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.data.InterfaceC2959;
import io.ktor.util.C4210;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p222.AbstractC7988;
import p228.C8035;
import p233.InterfaceC8076;
import p286.C8396;
import p286.InterfaceC8392;
import p286.InterfaceC8398;
import p286.InterfaceC8399;
import p286.InterfaceC8400;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3011 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String f9573;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC2186 f9574;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC8076 f9575;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f9576;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Class f9577;

    public C3011(Class cls, Class cls2, Class cls3, List list, InterfaceC8076 interfaceC8076, InterfaceC2186 interfaceC2186) {
        this.f9577 = cls;
        this.f9576 = list;
        this.f9575 = interfaceC8076;
        this.f9574 = interfaceC2186;
        this.f9573 = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.f9577 + ", decoders=" + this.f9576 + ", transcoder=" + this.f9575 + '}';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC2988 m6448(InterfaceC2959 interfaceC2959, int i, int i2, C8396 c8396, List list) throws GlideException {
        List list2 = this.f9576;
        int size = list2.size();
        InterfaceC2988 interfaceC2988Mo6464 = null;
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC8399 interfaceC8399 = (InterfaceC8399) list2.get(i3);
            try {
                if (interfaceC8399.mo6465(interfaceC2959.mo6368(), c8396)) {
                    interfaceC2988Mo6464 = interfaceC8399.mo6464(interfaceC2959.mo6368(), i, i2, c8396);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + interfaceC8399, e);
                }
                list.add(e);
            }
            if (interfaceC2988Mo6464 != null) {
                break;
            }
        }
        if (interfaceC2988Mo6464 != null) {
            return interfaceC2988Mo6464;
        }
        throw new GlideException(this.f9573, new ArrayList(list));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC2988 m6449(int i, int i2, InterfaceC2959 interfaceC2959, C2984 c2984, C8396 c8396) {
        InterfaceC2988 interfaceC2988Mo6475;
        InterfaceC8398 interfaceC8398;
        EncodeStrategy encodeStrategyMo292;
        InterfaceC8400 interfaceC8400M2839;
        InterfaceC2988 interfaceC2988;
        boolean z;
        boolean z2;
        boolean z3;
        Object c2993;
        InterfaceC2186 interfaceC2186 = this.f9574;
        List list = (List) interfaceC2186.acquire();
        AbstractC7988.m13441(list, "Argument must not be null");
        try {
            InterfaceC2988 interfaceC2988M6448 = m6448(interfaceC2959, i, i2, c8396, list);
            interfaceC2186.mo3979(list);
            RunnableC3014 runnableC3014 = (RunnableC3014) c2984.f9437;
            DataSource dataSource = (DataSource) c2984.f9438;
            C3010 c3010 = runnableC3014.f9618;
            Class<?> cls = interfaceC2988M6448.get().getClass();
            if (dataSource != DataSource.RESOURCE_DISK_CACHE) {
                InterfaceC8398 interfaceC8398M6443 = c3010.m6443(cls);
                interfaceC8398 = interfaceC8398M6443;
                interfaceC2988Mo6475 = interfaceC8398M6443.mo6475(runnableC3014.f9612, interfaceC2988M6448, runnableC3014.f9601, runnableC3014.f9600);
            } else {
                interfaceC2988Mo6475 = interfaceC2988M6448;
                interfaceC8398 = null;
            }
            if (!interfaceC2988M6448.equals(interfaceC2988Mo6475)) {
                interfaceC2988M6448.recycle();
            }
            if (c3010.f9558.m6897().f9800.m2839(interfaceC2988Mo6475.mo6412()) != null) {
                interfaceC8400M2839 = c3010.f9558.m6897().f9800.m2839(interfaceC2988Mo6475.mo6412());
                if (interfaceC8400M2839 == null) {
                    final Class clsMo6412 = interfaceC2988Mo6475.mo6412();
                    throw new Registry$MissingComponentException(clsMo6412) { // from class: com.bumptech.glide.Registry$NoResultEncoderAvailableException
                        {
                            super("Failed to find result encoder for resource class: " + clsMo6412 + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
                        }
                    };
                }
                encodeStrategyMo292 = interfaceC8400M2839.mo292(runnableC3014.f9598);
            } else {
                encodeStrategyMo292 = EncodeStrategy.NONE;
                interfaceC8400M2839 = null;
            }
            InterfaceC8392 interfaceC8392 = runnableC3014.f9596;
            ArrayList arrayListM6446 = c3010.m6446();
            int size = arrayListM6446.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    interfaceC2988 = null;
                    z = false;
                    break;
                }
                interfaceC2988 = null;
                if (((C8035) arrayListM6446.get(i3)).f22191.equals(interfaceC8392)) {
                    z = true;
                    break;
                }
                i3++;
            }
            switch (runnableC3014.f9599.f9581) {
                case 0:
                case 1:
                    z2 = false;
                    break;
                default:
                    z2 = ((!z && dataSource == DataSource.DATA_DISK_CACHE) || dataSource == DataSource.LOCAL) && encodeStrategyMo292 == EncodeStrategy.TRANSFORMED;
                    break;
            }
            if (z2) {
                if (interfaceC8400M2839 == null) {
                    final Class<?> cls2 = interfaceC2988Mo6475.get().getClass();
                    throw new Registry$MissingComponentException(cls2) { // from class: com.bumptech.glide.Registry$NoResultEncoderAvailableException
                        {
                            super("Failed to find result encoder for resource class: " + cls2 + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
                        }
                    };
                }
                int i4 = AbstractC3009.f9552[encodeStrategyMo292.ordinal()];
                if (i4 == 1) {
                    z3 = true;
                    c2993 = new C2993(runnableC3014.f9596, runnableC3014.f9613);
                } else {
                    if (i4 != 2) {
                        C4210.m8614(encodeStrategyMo292, "Unknown strategy: ");
                        return interfaceC2988;
                    }
                    z3 = true;
                    c2993 = new C2986(c3010.f9558.f9816, runnableC3014.f9596, runnableC3014.f9613, runnableC3014.f9601, runnableC3014.f9600, interfaceC8398, cls, runnableC3014.f9598);
                }
                C2989 c2989 = (C2989) C2989.f9459.acquire();
                c2989.f9460 = false;
                c2989.f9462 = z3;
                c2989.f9461 = interfaceC2988Mo6475;
                C0108 c0108 = runnableC3014.f9614;
                c0108.f319 = c2993;
                c0108.f320 = interfaceC8400M2839;
                c0108.f318 = c2989;
                interfaceC2988Mo6475 = c2989;
            }
            return this.f9575.mo339(interfaceC2988Mo6475, c8396);
        } catch (Throwable th) {
            interfaceC2186.mo3979(list);
            throw th;
        }
    }
}
