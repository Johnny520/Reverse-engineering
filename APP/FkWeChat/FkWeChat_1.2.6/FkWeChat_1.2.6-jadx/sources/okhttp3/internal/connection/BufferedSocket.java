package okhttp3.internal.connection;

import kotlin.Metadata;
import p376zd.InterfaceC10020u0;
import p376zd.InterfaceC10022v0;
import p376zd.InterfaceC10024w0;
import p376zd.InterfaceC9997j;
import p376zd.InterfaceC9999k;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\nÀ\u0006\u0003"}, m16758d2 = {"Lokhttp3/internal/connection/BufferedSocket;", "Lzd/v0;", "Lzd/k;", "getSource", "()Lzd/k;", "source", "Lzd/j;", "getSink", "()Lzd/j;", "sink", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public interface BufferedSocket extends InterfaceC10022v0 {
    @Override // p376zd.InterfaceC10022v0
    /* synthetic */ void cancel();

    @Override // p376zd.InterfaceC10022v0
    InterfaceC9997j getSink();

    @Override // p376zd.InterfaceC10022v0
    /* synthetic */ InterfaceC10020u0 getSink();

    @Override // p376zd.InterfaceC10022v0
    InterfaceC9999k getSource();

    @Override // p376zd.InterfaceC10022v0
    /* synthetic */ InterfaceC10024w0 getSource();
}
