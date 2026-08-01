package p099gc;

import com.alibaba.fastjson2.codec.FieldInfo;
import ec.InterfaceC2156m;
import p010a9.InterfaceC0188p;
import p010a9.InterfaceC0189q;
import p024b9.C1055q;
import p098g9.InterfaceC2552f;
import p145jc.AbstractC3807g0;
import p145jc.C3801d0;

/* JADX INFO: renamed from: gc.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2737f {

    /* JADX INFO: renamed from: a */
    public static final C2743l f7173a = new C2743l(-1, null, null, 0);

    /* JADX INFO: renamed from: b */
    public static final int f7174b = AbstractC3807g0.m15167e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);

    /* JADX INFO: renamed from: c */
    public static final int f7175c = AbstractC3807g0.m15167e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, null);

    /* JADX INFO: renamed from: d */
    public static final C3801d0 f7176d = new C3801d0("BUFFERED");

    /* JADX INFO: renamed from: e */
    public static final C3801d0 f7177e = new C3801d0("SHOULD_BUFFER");

    /* JADX INFO: renamed from: f */
    public static final C3801d0 f7178f = new C3801d0("S_RESUMING_BY_RCV");

    /* JADX INFO: renamed from: g */
    public static final C3801d0 f7179g = new C3801d0("RESUMING_BY_EB");

    /* JADX INFO: renamed from: h */
    public static final C3801d0 f7180h = new C3801d0("POISONED");

    /* JADX INFO: renamed from: i */
    public static final C3801d0 f7181i = new C3801d0("DONE_RCV");

    /* JADX INFO: renamed from: j */
    public static final C3801d0 f7182j = new C3801d0("INTERRUPTED_SEND");

    /* JADX INFO: renamed from: k */
    public static final C3801d0 f7183k = new C3801d0("INTERRUPTED_RCV");

    /* JADX INFO: renamed from: l */
    public static final C3801d0 f7184l = new C3801d0("CHANNEL_CLOSED");

    /* JADX INFO: renamed from: m */
    public static final C3801d0 f7185m = new C3801d0("SUSPEND");

    /* JADX INFO: renamed from: n */
    public static final C3801d0 f7186n = new C3801d0("SUSPEND_NO_WAITER");

    /* JADX INFO: renamed from: o */
    public static final C3801d0 f7187o = new C3801d0("FAILED");

    /* JADX INFO: renamed from: p */
    public static final C3801d0 f7188p = new C3801d0("NO_RECEIVE_RESULT");

    /* JADX INFO: renamed from: q */
    public static final C3801d0 f7189q = new C3801d0("CLOSE_HANDLER_CLOSED");

    /* JADX INFO: renamed from: r */
    public static final C3801d0 f7190r = new C3801d0("CLOSE_HANDLER_INVOKED");

    /* JADX INFO: renamed from: s */
    public static final C3801d0 f7191s = new C3801d0("NO_CLOSE_CAUSE");

    /* JADX INFO: renamed from: gc.f$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class a extends C1055q implements InterfaceC0188p {

        /* JADX INFO: renamed from: y */
        public static final a f7192y = new a();

        public a() {
            super(2, AbstractC2737f.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        @Override // p010a9.InterfaceC0188p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m9830y(((Number) obj).longValue(), (C2743l) obj2);
        }

        /* JADX INFO: renamed from: y */
        public final C2743l m9830y(long j10, C2743l c2743l) {
            return AbstractC2737f.m9827x(j10, c2743l);
        }
    }

    /* JADX INFO: renamed from: A */
    public static final long m9801A(int i10) {
        if (i10 == 0) {
            return 0L;
        }
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        return Long.MAX_VALUE;
    }

    /* JADX INFO: renamed from: B */
    public static final boolean m9802B(InterfaceC2156m interfaceC2156m, Object obj, InterfaceC0189q interfaceC0189q) {
        Object objMo7835o = interfaceC2156m.mo7835o(obj, null, interfaceC0189q);
        if (objMo7835o == null) {
            return false;
        }
        interfaceC2156m.mo7832Q(objMo7835o);
        return true;
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ boolean m9803C(InterfaceC2156m interfaceC2156m, Object obj, InterfaceC0189q interfaceC0189q, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            interfaceC0189q = null;
        }
        return m9802B(interfaceC2156m, obj, interfaceC0189q);
    }

    /* JADX INFO: renamed from: v */
    public static final long m9825v(long j10, boolean z10) {
        return (z10 ? FieldInfo.RECORD : 0L) + j10;
    }

    /* JADX INFO: renamed from: w */
    public static final long m9826w(long j10, int i10) {
        return (((long) i10) << 60) + j10;
    }

    /* JADX INFO: renamed from: x */
    public static final C2743l m9827x(long j10, C2743l c2743l) {
        return new C2743l(j10, c2743l, c2743l.m9861y(), 0);
    }

    /* JADX INFO: renamed from: y */
    public static final InterfaceC2552f m9828y() {
        return a.f7192y;
    }

    /* JADX INFO: renamed from: z */
    public static final C3801d0 m9829z() {
        return f7184l;
    }
}
