package okhttp3.internal.connection;

import kotlin.Metadata;
import okhttp3.internal.connection.RoutePlanner;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0016J\b\u0010\u000f\u001a\u00020\fH\u0016J\b\u0010\u0010\u001a\u00020\fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\n¨\u0006\u0011"}, m16758d2 = {"Lokhttp3/internal/connection/ReusePlan;", "Lokhttp3/internal/connection/RoutePlanner$Plan;", "connection", "Lokhttp3/internal/connection/RealConnection;", "<init>", "(Lokhttp3/internal/connection/RealConnection;)V", "getConnection", "()Lokhttp3/internal/connection/RealConnection;", "isReady", _UrlKt.FRAGMENT_ENCODE_SET, "()Z", "connectTcp", _UrlKt.FRAGMENT_ENCODE_SET, "connectTlsEtc", "handleSuccess", "cancel", "retry", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public final class ReusePlan implements RoutePlanner.Plan {
    private final RealConnection connection;
    private final boolean isReady;

    public ReusePlan(RealConnection realConnection) {
        realConnection.getClass();
        this.connection = realConnection;
        this.isReady = true;
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan, okhttp3.internal.http.ExchangeCodec.Carrier
    /* JADX INFO: renamed from: cancel, reason: merged with bridge method [inline-methods] */
    public Void mo39015cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    public Void connectTcp() {
        throw new IllegalStateException("already connected");
    }

    public Void connectTlsEtc() {
        throw new IllegalStateException("already connected");
    }

    public final RealConnection getConnection() {
        return this.connection;
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* JADX INFO: renamed from: handleSuccess */
    public RealConnection mo39016handleSuccess() {
        return this.connection;
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* JADX INFO: renamed from: isReady, reason: from getter */
    public boolean getIsReady() {
        return this.isReady;
    }

    public Void retry() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* JADX INFO: renamed from: connectTcp, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ RoutePlanner.ConnectResult mo39019connectTcp() {
        return (RoutePlanner.ConnectResult) connectTcp();
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* JADX INFO: renamed from: connectTlsEtc, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ RoutePlanner.ConnectResult mo39020connectTlsEtc() {
        return (RoutePlanner.ConnectResult) connectTlsEtc();
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* JADX INFO: renamed from: retry */
    public /* bridge */ /* synthetic */ RoutePlanner.Plan mo39017retry() {
        return (RoutePlanner.Plan) retry();
    }
}
