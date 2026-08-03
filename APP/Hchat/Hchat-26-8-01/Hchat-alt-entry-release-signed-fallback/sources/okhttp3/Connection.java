package okhttp3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface Connection {
    okhttp3.Handshake handshake();

    okhttp3.Protocol protocol();

    okhttp3.Route route();

    java.net.Socket socket();
}
