package org.luckypray.dexkit;

import af.C0328a;
import af.C0333f;
import af.C0334g;
import af.C0335h;
import af.C0336i;
import af.C0338k;
import af.C0339l;
import af.C0340m;
import cf.C1530c0;
import cf.C1532d0;
import cf.C1533e;
import cf.C1535f;
import cf.C1538g0;
import cf.C1539h;
import cf.C1541i;
import cf.C1544j0;
import cf.C1546k0;
import cf.C1556u;
import cf.C1557v;
import java.io.Closeable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1067w;
import p172l8.C4700i0;
import p185m8.AbstractC5067b0;
import p185m8.AbstractC5106t;
import p211o8.AbstractC5661b;
import p376zd.C10010p0;
import ve.C8928a;
import ve.C8929b;
import ve.C8930c;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 T2\u00020\u0001:\u0001UB\u0011\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0017\b\u0012\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u0004\u0010\tB\u0019\b\u0012\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0004\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001d\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00192\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00028\u00000\u001aH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001fH\u0004¢\u0006\u0004\b\"\u0010!J\u0015\u0010%\u001a\u00020\u00102\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u00020\u00132\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0015\u0010-\u001a\u00020\u00162\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020\u00102\u0006\u00100\u001a\u00020/H\u0000¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00132\u0006\u00100\u001a\u00020/H\u0000¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\u00162\u0006\u00100\u001a\u00020/H\u0000¢\u0006\u0004\b5\u00106J\u001d\u0010:\u001a\b\u0012\u0004\u0012\u000209082\u0006\u00107\u001a\u00020\u001bH\u0000¢\u0006\u0004\b:\u0010;J\u001d\u0010=\u001a\b\u0012\u0004\u0012\u000209082\u0006\u0010<\u001a\u00020\u001bH\u0000¢\u0006\u0004\b=\u0010;J\u001d\u0010?\u001a\b\u0012\u0004\u0012\u000209082\u0006\u0010>\u001a\u00020\u001bH\u0000¢\u0006\u0004\b?\u0010;J!\u0010A\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u0001082\u0006\u0010@\u001a\u00020\u001bH\u0000¢\u0006\u0004\bA\u0010;J#\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020908082\u0006\u0010>\u001a\u00020\u001bH\u0000¢\u0006\u0004\bB\u0010;J\u0017\u0010C\u001a\u00020\u00132\u0006\u0010@\u001a\u00020\u001bH\u0000¢\u0006\u0004\bC\u0010DJ\u0017\u0010E\u001a\u00020\u00132\u0006\u0010@\u001a\u00020\u001bH\u0000¢\u0006\u0004\bE\u0010DJ\u001d\u0010F\u001a\b\u0012\u0004\u0012\u00020\u0002082\u0006\u0010@\u001a\u00020\u001bH\u0000¢\u0006\u0004\bF\u0010;J\u001d\u0010H\u001a\b\u0012\u0004\u0012\u00020G082\u0006\u0010@\u001a\u00020\u001bH\u0000¢\u0006\u0004\bH\u0010;J\u0017\u0010I\u001a\u00020\u00132\u0006\u0010@\u001a\u00020\u001bH\u0000¢\u0006\u0004\bI\u0010DJ\u0017\u0010J\u001a\u00020\u00132\u0006\u0010@\u001a\u00020\u001bH\u0000¢\u0006\u0004\bJ\u0010DJ\u001d\u0010L\u001a\b\u0012\u0004\u0012\u00020K082\u0006\u0010@\u001a\u00020\u001bH\u0000¢\u0006\u0004\bL\u0010;R\u0016\u0010O\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010S\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010R¨\u0006V"}, m16758d2 = {"Lorg/luckypray/dexkit/DexKitBridge;", "Ljava/io/Closeable;", _UrlKt.FRAGMENT_ENCODE_SET, "apkPath", "<init>", "(Ljava/lang/String;)V", _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, "dexBytesArray", "([[B)V", "Ljava/lang/ClassLoader;", "classLoader", _UrlKt.FRAGMENT_ENCODE_SET, "useMemoryDexFile", "(Ljava/lang/ClassLoader;Z)V", "encodeBytes", "Laf/g;", "b0", "([B)Laf/g;", "Laf/l;", "n0", "([B)Laf/l;", "Laf/i;", "d0", "([B)Laf/i;", "T", "Lkotlin/Function1;", _UrlKt.FRAGMENT_ENCODE_SET, "block", "R0", "(La9/l;)Ljava/lang/Object;", "Ll8/i0;", "close", "()V", "finalize", "Lve/a;", "findClass", "X", "(Lve/a;)Laf/g;", "Lve/c;", "findMethod", "j0", "(Lve/c;)Laf/l;", "Lve/b;", "findField", "c0", "(Lve/b;)Laf/i;", _UrlKt.FRAGMENT_ENCODE_SET, "encodeIdArray", "P0", "([J)Laf/g;", "F0", "([J)Laf/l;", "w0", "([J)Laf/i;", "classId", _UrlKt.FRAGMENT_ENCODE_SET, "Laf/a;", "r0", "(J)Ljava/util/List;", "fieldId", "v0", "methodId", "E0", "encodeId", "O0", "N0", "q0", "(J)Laf/l;", "D0", "M0", "Laf/m;", "L0", "Q0", "S0", _UrlKt.FRAGMENT_ENCODE_SET, "J0", "q", "J", "token", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "r", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "lifecycleLock", "s", "a", "dexkit-android_release"}, m16759k = 1, m16760mv = {1, 5, 1}, m16762xi = 48)
public final class DexKitBridge implements Closeable {

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public volatile long token;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public final ReentrantReadWriteLock lifecycleLock;

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitBridge$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class C5802b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC5661b.m22869d(((C0333f) obj).m1020h(), ((C0333f) obj2).m1020h());
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitBridge$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class C5803c extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ byte[] f18183r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5803c(byte[] bArr) {
            super(1);
            this.f18183r = bArr;
        }

        /* JADX INFO: renamed from: a */
        public final byte[] m23408a(long j10) {
            return DexKitBridge.INSTANCE.m23384B(j10, this.f18183r);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            return m23408a(((Number) obj).longValue());
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitBridge$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class C5804d implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC5661b.m22869d(((C0335h) obj).m1043g(), ((C0335h) obj2).m1043g());
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitBridge$e */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class C5805e extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ byte[] f18184r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5805e(byte[] bArr) {
            super(1);
            this.f18184r = bArr;
        }

        /* JADX INFO: renamed from: a */
        public final byte[] m23409a(long j10) {
            return DexKitBridge.INSTANCE.m23385C(j10, this.f18184r);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            return m23409a(((Number) obj).longValue());
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitBridge$f */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class C5806f implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC5661b.m22869d(((C0338k) obj).m1066h(), ((C0338k) obj2).m1066h());
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitBridge$g */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class C5807g extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ byte[] f18185r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5807g(byte[] bArr) {
            super(1);
            this.f18185r = bArr;
        }

        /* JADX INFO: renamed from: a */
        public final byte[] m23410a(long j10) {
            return DexKitBridge.INSTANCE.m23386D(j10, this.f18185r);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            return m23410a(((Number) obj).longValue());
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitBridge$h */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class C5808h extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ long f18186r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5808h(long j10) {
            super(1);
            this.f18186r = j10;
        }

        /* JADX INFO: renamed from: a */
        public final byte[] m23411a(long j10) {
            return DexKitBridge.INSTANCE.m23387E(j10, this.f18186r);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            return m23411a(((Number) obj).longValue());
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitBridge$i */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class C5809i extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ long f18187r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5809i(long j10) {
            super(1);
            this.f18187r = j10;
        }

        /* JADX INFO: renamed from: a */
        public final byte[] m23412a(long j10) {
            return DexKitBridge.INSTANCE.m23388F(j10, this.f18187r);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            return m23412a(((Number) obj).longValue());
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitBridge$j */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class C5810j extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ long f18188r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5810j(long j10) {
            super(1);
            this.f18188r = j10;
        }

        /* JADX INFO: renamed from: a */
        public final byte[] m23413a(long j10) {
            return DexKitBridge.INSTANCE.m23390H(j10, this.f18188r);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            return m23413a(((Number) obj).longValue());
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitBridge$k */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class C5811k extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ long[] f18189r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5811k(long[] jArr) {
            super(1);
            this.f18189r = jArr;
        }

        /* JADX INFO: renamed from: a */
        public final byte[] m23414a(long j10) {
            return DexKitBridge.INSTANCE.m23391I(j10, this.f18189r);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            return m23414a(((Number) obj).longValue());
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitBridge$l */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class C5812l extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ long f18190r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5812l(long j10) {
            super(1);
            this.f18190r = j10;
        }

        /* JADX INFO: renamed from: a */
        public final byte[] m23415a(long j10) {
            return DexKitBridge.INSTANCE.m23392J(j10, this.f18190r);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            return m23415a(((Number) obj).longValue());
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitBridge$m */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class C5813m extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ long f18191r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5813m(long j10) {
            super(1);
            this.f18191r = j10;
        }

        /* JADX INFO: renamed from: a */
        public final byte[] m23416a(long j10) {
            return DexKitBridge.INSTANCE.m23393K(j10, this.f18191r);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            return m23416a(((Number) obj).longValue());
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitBridge$n */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class C5814n extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ long[] f18192r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5814n(long[] jArr) {
            super(1);
            this.f18192r = jArr;
        }

        /* JADX INFO: renamed from: a */
        public final byte[] m23417a(long j10) {
            return DexKitBridge.INSTANCE.m23394L(j10, this.f18192r);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            return m23417a(((Number) obj).longValue());
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitBridge$o */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class C5815o extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ long f18193r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5815o(long j10) {
            super(1);
            this.f18193r = j10;
        }

        /* JADX INFO: renamed from: a */
        public final int[] m23418a(long j10) {
            return DexKitBridge.INSTANCE.m23395M(j10, this.f18193r);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            return m23418a(((Number) obj).longValue());
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitBridge$p */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class C5816p extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ long f18194r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5816p(long j10) {
            super(1);
            this.f18194r = j10;
        }

        /* JADX INFO: renamed from: a */
        public final byte[] m23419a(long j10) {
            return DexKitBridge.INSTANCE.m23396N(j10, this.f18194r);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            return m23419a(((Number) obj).longValue());
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitBridge$q */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class C5817q extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ long f18195r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5817q(long j10) {
            super(1);
            this.f18195r = j10;
        }

        /* JADX INFO: renamed from: a */
        public final String[] m23420a(long j10) {
            return DexKitBridge.INSTANCE.m23397O(j10, this.f18195r);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            return m23420a(((Number) obj).longValue());
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitBridge$r */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class C5818r extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ long f18196r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5818r(long j10) {
            super(1);
            this.f18196r = j10;
        }

        /* JADX INFO: renamed from: a */
        public final byte[] m23421a(long j10) {
            return DexKitBridge.INSTANCE.m23398P(j10, this.f18196r);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            return m23421a(((Number) obj).longValue());
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitBridge$s */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class C5819s extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ long f18197r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5819s(long j10) {
            super(1);
            this.f18197r = j10;
        }

        /* JADX INFO: renamed from: a */
        public final String[] m23422a(long j10) {
            return DexKitBridge.INSTANCE.m23399Q(j10, this.f18197r);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            return m23422a(((Number) obj).longValue());
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitBridge$t */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class C5820t extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ long[] f18198r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5820t(long[] jArr) {
            super(1);
            this.f18198r = jArr;
        }

        /* JADX INFO: renamed from: a */
        public final byte[] m23423a(long j10) {
            return DexKitBridge.INSTANCE.m23389G(j10, this.f18198r);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            return m23423a(((Number) obj).longValue());
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitBridge$u */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class C5821u extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ long f18199r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5821u(long j10) {
            super(1);
            this.f18199r = j10;
        }

        /* JADX INFO: renamed from: a */
        public final byte[] m23424a(long j10) {
            return DexKitBridge.INSTANCE.m23407z(j10, this.f18199r);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            return m23424a(((Number) obj).longValue());
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitBridge$v */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class C5822v extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ long f18200r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5822v(long j10) {
            super(1);
            this.f18200r = j10;
        }

        /* JADX INFO: renamed from: a */
        public final byte[] m23425a(long j10) {
            return DexKitBridge.INSTANCE.m23383A(j10, this.f18200r);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            return m23425a(((Number) obj).longValue());
        }
    }

    public DexKitBridge(String str) {
        this.lifecycleLock = new ReentrantReadWriteLock();
        this.token = INSTANCE.m23400R(str);
    }

    private static final native byte[] nativeBatchFindClassUsingStrings(long j10, byte[] bArr);

    private static final native byte[] nativeBatchFindMethodUsingStrings(long j10, byte[] bArr);

    private static final native void nativeExportDexFile(long j10, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeFieldGetMethods(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeFieldPutMethods(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeFindClass(long j10, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeFindField(long j10, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeFindMethod(long j10, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetCallMethods(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetClassAnnotations(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetClassByIds(long j10, long[] jArr);

    private static final native byte[] nativeGetClassData(long j10, String str);

    private static final native int nativeGetDexNum(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetFieldAnnotations(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetFieldByIds(long j10, long[] jArr);

    private static final native byte[] nativeGetFieldData(long j10, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetInvokeMethods(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetMethodAnnotations(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetMethodByIds(long j10, long[] jArr);

    private static final native byte[] nativeGetMethodData(long j10, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int[] nativeGetMethodOpCodes(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetMethodUsingFields(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native String[] nativeGetMethodUsingStrings(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetParameterAnnotations(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native String[] nativeGetParameterNames(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long nativeInitDexKit(String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long nativeInitDexKitByBytesArray(byte[][] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long nativeInitDexKitByClassLoader(ClassLoader classLoader, boolean z10);

    private static final native void nativeInitFullCache(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void nativeRelease(long j10);

    private static final native void nativeSetMaxConcurrentQueries(long j10, int i10);

    private static final native void nativeSetThreadNum(long j10, int i10);

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ C0339l m23339D0(long encodeId) {
        byte[] bArr = (byte[]) m23349R0(new C5812l(encodeId));
        C1532d0.a aVar = C1532d0.f4502f;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.getClass();
        C1532d0 c1532d0M6004a = aVar.m6004a(byteBufferWrap);
        C0339l c0339l = new C0339l();
        int iM6001n = c1532d0M6004a.m6001n();
        for (int i10 = 0; i10 < iM6001n; i10++) {
            C0338k.a aVar2 = C0338k.f913u;
            C1530c0 c1530c0M6002o = c1532d0M6004a.m6002o(i10);
            c1530c0M6002o.getClass();
            c0339l.add(aVar2.m1073a(this, c1530c0M6002o));
        }
        return c0339l;
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ List m23340E0(long methodId) {
        byte[] bArr = (byte[]) m23349R0(new C5813m(methodId));
        C1535f.a aVar = C1535f.f4505f;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.getClass();
        C1535f c1535fM6025a = aVar.m6025a(byteBufferWrap);
        ArrayList arrayList = new ArrayList();
        int iM6024p = c1535fM6025a.m6024p();
        for (int i10 = 0; i10 < iM6024p; i10++) {
            C0328a.a aVar2 = C0328a.f830i;
            C1533e c1533eM6022n = c1535fM6025a.m6022n(i10);
            c1533eM6022n.getClass();
            arrayList.add(aVar2.m1005a(this, c1533eM6022n));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ C0339l m23341F0(long[] encodeIdArray) {
        encodeIdArray.getClass();
        byte[] bArr = (byte[]) m23349R0(new C5814n(encodeIdArray));
        C1532d0.a aVar = C1532d0.f4502f;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.getClass();
        C1532d0 c1532d0M6004a = aVar.m6004a(byteBufferWrap);
        C0339l c0339l = new C0339l();
        int iM6001n = c1532d0M6004a.m6001n();
        for (int i10 = 0; i10 < iM6001n; i10++) {
            C0338k.a aVar2 = C0338k.f913u;
            C1530c0 c1530c0M6002o = c1532d0M6004a.m6002o(i10);
            c1530c0M6002o.getClass();
            c0339l.add(aVar2.m1073a(this, c1530c0M6002o));
        }
        return c0339l;
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ List m23342J0(long encodeId) {
        return AbstractC5106t.m20709T0((int[]) m23349R0(new C5815o(encodeId)));
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ List m23343L0(long encodeId) {
        byte[] bArr = (byte[]) m23349R0(new C5816p(encodeId));
        C1546k0.a aVar = C1546k0.f4516f;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.getClass();
        C1546k0 c1546k0M6097a = aVar.m6097a(byteBufferWrap);
        ArrayList arrayList = new ArrayList();
        int iM6094n = c1546k0M6097a.m6094n();
        for (int i10 = 0; i10 < iM6094n; i10++) {
            C0340m.a aVar2 = C0340m.f973c;
            C1544j0 c1544j0M6095o = c1546k0M6097a.m6095o(i10);
            c1544j0M6095o.getClass();
            arrayList.add(aVar2.m1090a(this, c1544j0M6095o));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ List m23344M0(long encodeId) {
        return AbstractC5106t.m20713V0((Object[]) m23349R0(new C5817q(encodeId)));
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ List m23345N0(long methodId) {
        byte[] bArr = (byte[]) m23349R0(new C5818r(methodId));
        C1538g0.a aVar = C1538g0.f4508f;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.getClass();
        C1538g0 c1538g0M6050a = aVar.m6050a(byteBufferWrap);
        ArrayList arrayList = new ArrayList();
        int iM6049p = c1538g0M6050a.m6049p();
        for (int i10 = 0; i10 < iM6049p; i10++) {
            C1535f c1535fM6047n = c1538g0M6050a.m6047n(i10);
            c1535fM6047n.getClass();
            ArrayList arrayList2 = new ArrayList();
            int iM6024p = c1535fM6047n.m6024p();
            for (int i11 = 0; i11 < iM6024p; i11++) {
                C0328a.a aVar2 = C0328a.f830i;
                C1533e c1533eM6022n = c1535fM6047n.m6022n(i11);
                c1533eM6022n.getClass();
                arrayList2.add(aVar2.m1005a(this, c1533eM6022n));
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ List m23346O0(long encodeId) {
        String[] strArr = (String[]) m23349R0(new C5819s(encodeId));
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(str);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ C0334g m23347P0(long[] encodeIdArray) {
        encodeIdArray.getClass();
        byte[] bArr = (byte[]) m23349R0(new C5820t(encodeIdArray));
        C1541i.a aVar = C1541i.f4511f;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.getClass();
        C1541i c1541iM6075a = aVar.m6075a(byteBufferWrap);
        C0334g c0334g = new C0334g();
        int iM6074p = c1541iM6075a.m6074p();
        for (int i10 = 0; i10 < iM6074p; i10++) {
            C0333f.a aVar2 = C0333f.f848q;
            C1539h c1539hM6072n = c1541iM6075a.m6072n(i10);
            c1539hM6072n.getClass();
            c0334g.add(aVar2.m1027a(this, c1539hM6072n));
        }
        return c0334g;
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ C0339l m23348Q0(long encodeId) {
        byte[] bArr = (byte[]) m23349R0(new C5821u(encodeId));
        C1532d0.a aVar = C1532d0.f4502f;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.getClass();
        C1532d0 c1532d0M6004a = aVar.m6004a(byteBufferWrap);
        C0339l c0339l = new C0339l();
        int iM6001n = c1532d0M6004a.m6001n();
        for (int i10 = 0; i10 < iM6001n; i10++) {
            C0338k.a aVar2 = C0338k.f913u;
            C1530c0 c1530c0M6002o = c1532d0M6004a.m6002o(i10);
            c1530c0M6002o.getClass();
            c0339l.add(aVar2.m1073a(this, c1530c0M6002o));
        }
        return c0339l;
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ Object m23349R0(InterfaceC0184l block) {
        block.getClass();
        ReentrantReadWriteLock.ReadLock lock = this.lifecycleLock.readLock();
        lock.lock();
        try {
            long j10 = this.token;
            if (j10 != 0) {
                return block.mo27m(Long.valueOf(j10));
            }
            throw new IllegalStateException("DexKitBridge is not valid");
        } finally {
            lock.unlock();
        }
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ C0339l m23350S0(long encodeId) {
        byte[] bArr = (byte[]) m23349R0(new C5822v(encodeId));
        C1532d0.a aVar = C1532d0.f4502f;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.getClass();
        C1532d0 c1532d0M6004a = aVar.m6004a(byteBufferWrap);
        C0339l c0339l = new C0339l();
        int iM6001n = c1532d0M6004a.m6001n();
        for (int i10 = 0; i10 < iM6001n; i10++) {
            C0338k.a aVar2 = C0338k.f913u;
            C1530c0 c1530c0M6002o = c1532d0M6004a.m6002o(i10);
            c1530c0M6002o.getClass();
            c0339l.add(aVar2.m1073a(this, c1530c0M6002o));
        }
        return c0339l;
    }

    /* JADX INFO: renamed from: X */
    public final C0334g m23351X(C8928a findClass) {
        findClass.getClass();
        return m23352b0(findClass.m35949d());
    }

    /* JADX INFO: renamed from: b0 */
    public final C0334g m23352b0(byte[] encodeBytes) {
        byte[] bArr = (byte[]) m23349R0(new C5803c(encodeBytes));
        C1541i.a aVar = C1541i.f4511f;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.getClass();
        C1541i c1541iM6075a = aVar.m6075a(byteBufferWrap);
        C0334g c0334g = new C0334g();
        int iM6074p = c1541iM6075a.m6074p();
        for (int i10 = 0; i10 < iM6074p; i10++) {
            C0333f.a aVar2 = C0333f.f848q;
            C1539h c1539hM6072n = c1541iM6075a.m6072n(i10);
            c1539hM6072n.getClass();
            c0334g.add(aVar2.m1027a(this, c1539hM6072n));
        }
        if (c0334g.size() > 1) {
            AbstractC5067b0.m20482D(c0334g, new C5802b());
        }
        return c0334g;
    }

    /* JADX INFO: renamed from: c0 */
    public final C0336i m23353c0(C8929b findField) {
        findField.getClass();
        return m23354d0(findField.m35949d());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.lifecycleLock;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i10 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i11 = 0; i11 < readHoldCount; i11++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            long j10 = this.token;
            if (j10 == 0) {
                return;
            }
            this.token = 0L;
            INSTANCE.m23403U(j10);
            C4700i0 c4700i0 = C4700i0.f13910a;
            while (i10 < readHoldCount) {
                lock.lock();
                i10++;
            }
            writeLock.unlock();
        } finally {
            while (i10 < readHoldCount) {
                lock.lock();
                i10++;
            }
            writeLock.unlock();
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final C0336i m23354d0(byte[] encodeBytes) {
        byte[] bArr = (byte[]) m23349R0(new C5805e(encodeBytes));
        C1557v.a aVar = C1557v.f4527f;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.getClass();
        C1557v c1557vM6147a = aVar.m6147a(byteBufferWrap);
        C0336i c0336i = new C0336i();
        int iM6146p = c1557vM6147a.m6146p();
        for (int i10 = 0; i10 < iM6146p; i10++) {
            C0335h.a aVar2 = C0335h.f880n;
            C1556u c1556uM6144n = c1557vM6147a.m6144n(i10);
            c1556uM6144n.getClass();
            c0336i.add(aVar2.m1049a(this, c1556uM6144n));
        }
        if (c0336i.size() > 1) {
            AbstractC5067b0.m20482D(c0336i, new C5804d());
        }
        return c0336i;
    }

    public final void finalize() {
        close();
    }

    /* JADX INFO: renamed from: j0 */
    public final C0339l m23355j0(C8930c findMethod) {
        findMethod.getClass();
        return m23356n0(findMethod.m35949d());
    }

    /* JADX INFO: renamed from: n0 */
    public final C0339l m23356n0(byte[] encodeBytes) {
        byte[] bArr = (byte[]) m23349R0(new C5807g(encodeBytes));
        C1532d0.a aVar = C1532d0.f4502f;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.getClass();
        C1532d0 c1532d0M6004a = aVar.m6004a(byteBufferWrap);
        C0339l c0339l = new C0339l();
        int iM6001n = c1532d0M6004a.m6001n();
        for (int i10 = 0; i10 < iM6001n; i10++) {
            C0338k.a aVar2 = C0338k.f913u;
            C1530c0 c1530c0M6002o = c1532d0M6004a.m6002o(i10);
            c1530c0M6002o.getClass();
            c0339l.add(aVar2.m1073a(this, c1530c0M6002o));
        }
        if (c0339l.size() > 1) {
            AbstractC5067b0.m20482D(c0339l, new C5806f());
        }
        return c0339l;
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C0339l m23357q0(long encodeId) {
        byte[] bArr = (byte[]) m23349R0(new C5808h(encodeId));
        C1532d0.a aVar = C1532d0.f4502f;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.getClass();
        C1532d0 c1532d0M6004a = aVar.m6004a(byteBufferWrap);
        C0339l c0339l = new C0339l();
        int iM6001n = c1532d0M6004a.m6001n();
        for (int i10 = 0; i10 < iM6001n; i10++) {
            C0338k.a aVar2 = C0338k.f913u;
            C1530c0 c1530c0M6002o = c1532d0M6004a.m6002o(i10);
            c1530c0M6002o.getClass();
            c0339l.add(aVar2.m1073a(this, c1530c0M6002o));
        }
        return c0339l;
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ List m23358r0(long classId) {
        byte[] bArr = (byte[]) m23349R0(new C5809i(classId));
        C1535f.a aVar = C1535f.f4505f;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.getClass();
        C1535f c1535fM6025a = aVar.m6025a(byteBufferWrap);
        ArrayList arrayList = new ArrayList();
        int iM6024p = c1535fM6025a.m6024p();
        for (int i10 = 0; i10 < iM6024p; i10++) {
            C0328a.a aVar2 = C0328a.f830i;
            C1533e c1533eM6022n = c1535fM6025a.m6022n(i10);
            c1533eM6022n.getClass();
            arrayList.add(aVar2.m1005a(this, c1533eM6022n));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ List m23359v0(long fieldId) {
        byte[] bArr = (byte[]) m23349R0(new C5810j(fieldId));
        C1535f.a aVar = C1535f.f4505f;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.getClass();
        C1535f c1535fM6025a = aVar.m6025a(byteBufferWrap);
        ArrayList arrayList = new ArrayList();
        int iM6024p = c1535fM6025a.m6024p();
        for (int i10 = 0; i10 < iM6024p; i10++) {
            C0328a.a aVar2 = C0328a.f830i;
            C1533e c1533eM6022n = c1535fM6025a.m6022n(i10);
            c1533eM6022n.getClass();
            arrayList.add(aVar2.m1005a(this, c1533eM6022n));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ C0336i m23360w0(long[] encodeIdArray) {
        encodeIdArray.getClass();
        byte[] bArr = (byte[]) m23349R0(new C5811k(encodeIdArray));
        C1557v.a aVar = C1557v.f4527f;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.getClass();
        C1557v c1557vM6147a = aVar.m6147a(byteBufferWrap);
        C0336i c0336i = new C0336i();
        int iM6146p = c1557vM6147a.m6146p();
        for (int i10 = 0; i10 < iM6146p; i10++) {
            C0335h.a aVar2 = C0335h.f880n;
            C1556u c1556uM6144n = c1557vM6147a.m6144n(i10);
            c1556uM6144n.getClass();
            c0336i.add(aVar2.m1049a(this, c1556uM6144n));
        }
        return c0336i;
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitBridge$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: A */
        public final byte[] m23383A(long j10, long j11) {
            return DexKitBridge.nativeFieldPutMethods(j10, j11);
        }

        /* JADX INFO: renamed from: B */
        public final byte[] m23384B(long j10, byte[] bArr) {
            return DexKitBridge.nativeFindClass(j10, bArr);
        }

        /* JADX INFO: renamed from: C */
        public final byte[] m23385C(long j10, byte[] bArr) {
            return DexKitBridge.nativeFindField(j10, bArr);
        }

        /* JADX INFO: renamed from: D */
        public final byte[] m23386D(long j10, byte[] bArr) {
            return DexKitBridge.nativeFindMethod(j10, bArr);
        }

        /* JADX INFO: renamed from: E */
        public final byte[] m23387E(long j10, long j11) {
            return DexKitBridge.nativeGetCallMethods(j10, j11);
        }

        /* JADX INFO: renamed from: F */
        public final byte[] m23388F(long j10, long j11) {
            return DexKitBridge.nativeGetClassAnnotations(j10, j11);
        }

        /* JADX INFO: renamed from: G */
        public final byte[] m23389G(long j10, long[] jArr) {
            return DexKitBridge.nativeGetClassByIds(j10, jArr);
        }

        /* JADX INFO: renamed from: H */
        public final byte[] m23390H(long j10, long j11) {
            return DexKitBridge.nativeGetFieldAnnotations(j10, j11);
        }

        /* JADX INFO: renamed from: I */
        public final byte[] m23391I(long j10, long[] jArr) {
            return DexKitBridge.nativeGetFieldByIds(j10, jArr);
        }

        /* JADX INFO: renamed from: J */
        public final byte[] m23392J(long j10, long j11) {
            return DexKitBridge.nativeGetInvokeMethods(j10, j11);
        }

        /* JADX INFO: renamed from: K */
        public final byte[] m23393K(long j10, long j11) {
            return DexKitBridge.nativeGetMethodAnnotations(j10, j11);
        }

        /* JADX INFO: renamed from: L */
        public final byte[] m23394L(long j10, long[] jArr) {
            return DexKitBridge.nativeGetMethodByIds(j10, jArr);
        }

        /* JADX INFO: renamed from: M */
        public final int[] m23395M(long j10, long j11) {
            return DexKitBridge.nativeGetMethodOpCodes(j10, j11);
        }

        /* JADX INFO: renamed from: N */
        public final byte[] m23396N(long j10, long j11) {
            return DexKitBridge.nativeGetMethodUsingFields(j10, j11);
        }

        /* JADX INFO: renamed from: O */
        public final String[] m23397O(long j10, long j11) {
            return DexKitBridge.nativeGetMethodUsingStrings(j10, j11);
        }

        /* JADX INFO: renamed from: P */
        public final byte[] m23398P(long j10, long j11) {
            return DexKitBridge.nativeGetParameterAnnotations(j10, j11);
        }

        /* JADX INFO: renamed from: Q */
        public final String[] m23399Q(long j10, long j11) {
            return DexKitBridge.nativeGetParameterNames(j10, j11);
        }

        /* JADX INFO: renamed from: R */
        public final long m23400R(String str) {
            return DexKitBridge.nativeInitDexKit(str);
        }

        /* JADX INFO: renamed from: S */
        public final long m23401S(byte[][] bArr) {
            return DexKitBridge.nativeInitDexKitByBytesArray(bArr);
        }

        /* JADX INFO: renamed from: T */
        public final long m23402T(ClassLoader classLoader, boolean z10) {
            return DexKitBridge.nativeInitDexKitByClassLoader(classLoader, z10);
        }

        /* JADX INFO: renamed from: U */
        public final void m23403U(long j10) {
            DexKitBridge.nativeRelease(j10);
        }

        /* JADX INFO: renamed from: w */
        public final DexKitBridge m23404w(ClassLoader classLoader, boolean z10) {
            classLoader.getClass();
            AbstractC1043k abstractC1043k = null;
            try {
                if (Class.forName("dalvik.system.BaseDexClassLoader").isInstance(classLoader)) {
                    return new DexKitBridge(classLoader, z10, abstractC1043k);
                }
                C10010p0.m38820a("classLoader must be a BaseDexClassLoader (e.g. PathClassLoader/DexClassLoader)");
                return null;
            } catch (ClassNotFoundException unused) {
                C10010p0.m38820a("This method requires Android runtime");
                return null;
            }
        }

        /* JADX INFO: renamed from: x */
        public final DexKitBridge m23405x(String str) {
            str.getClass();
            return new DexKitBridge(str, (AbstractC1043k) null);
        }

        /* JADX INFO: renamed from: y */
        public final DexKitBridge m23406y(byte[][] bArr) {
            bArr.getClass();
            return new DexKitBridge(bArr, (AbstractC1043k) null);
        }

        /* JADX INFO: renamed from: z */
        public final byte[] m23407z(long j10, long j11) {
            return DexKitBridge.nativeFieldGetMethods(j10, j11);
        }

        public Companion() {
        }
    }

    public /* synthetic */ DexKitBridge(String str, AbstractC1043k abstractC1043k) {
        this(str);
    }

    public /* synthetic */ DexKitBridge(byte[][] bArr, AbstractC1043k abstractC1043k) {
        this(bArr);
    }

    public /* synthetic */ DexKitBridge(ClassLoader classLoader, boolean z10, AbstractC1043k abstractC1043k) {
        this(classLoader, z10);
    }

    public DexKitBridge(byte[][] bArr) {
        this.lifecycleLock = new ReentrantReadWriteLock();
        this.token = INSTANCE.m23401S(bArr);
    }

    public DexKitBridge(ClassLoader classLoader, boolean z10) {
        this.lifecycleLock = new ReentrantReadWriteLock();
        this.token = INSTANCE.m23402T(classLoader, z10);
    }
}
