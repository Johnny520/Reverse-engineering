package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: BroadcastChannel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m115d2 = {"BroadcastChannel", "Lkotlinx/coroutines/channels/BroadcastChannel;", "E", "capacity", "", "kotlinx-coroutines-core"}, m116k = 2, m117mv = {1, 6, 0}, m119xi = 48)
public final class BroadcastChannelKt {
    public static final <E> kotlinx.coroutines.channels.BroadcastChannel<E> BroadcastChannel(int r2) {
            switch(r2) {
                case -2: goto L23;
                case -1: goto L1b;
                case 0: goto L13;
                case 2147483647: goto Lb;
                default: goto L3;
            }
        L3:
            kotlinx.coroutines.channels.ArrayBroadcastChannel r0 = new kotlinx.coroutines.channels.ArrayBroadcastChannel
            r0.<init>(r2)
            kotlinx.coroutines.channels.BroadcastChannel r0 = (kotlinx.coroutines.channels.BroadcastChannel) r0
            goto L30
        Lb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported UNLIMITED capacity for BroadcastChannel"
            r0.<init>(r1)
            throw r0
        L13:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported 0 capacity for BroadcastChannel"
            r0.<init>(r1)
            throw r0
        L1b:
            kotlinx.coroutines.channels.ConflatedBroadcastChannel r0 = new kotlinx.coroutines.channels.ConflatedBroadcastChannel
            r0.<init>()
            kotlinx.coroutines.channels.BroadcastChannel r0 = (kotlinx.coroutines.channels.BroadcastChannel) r0
            goto L30
        L23:
            kotlinx.coroutines.channels.ArrayBroadcastChannel r0 = new kotlinx.coroutines.channels.ArrayBroadcastChannel
            kotlinx.coroutines.channels.Channel$Factory r1 = kotlinx.coroutines.channels.Channel.Factory
            int r1 = r1.getCHANNEL_DEFAULT_CAPACITY$kotlinx_coroutines_core()
            r0.<init>(r1)
            kotlinx.coroutines.channels.BroadcastChannel r0 = (kotlinx.coroutines.channels.BroadcastChannel) r0
        L30:
            return r0
    }
}
