.class public final LYue/ۥۡۢۦۨ;
.super Ljava/net/ProxySelector;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nNullProxySelector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NullProxySelector.kt\nokhttp3/internal/proxy/NullProxySelector\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,36:1\n1#2:37\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nNullProxySelector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NullProxySelector.kt\nokhttp3/internal/proxy/NullProxySelector\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,36:1\n1#2:37\n*E\n"
.end annotation


# static fields
.field public static final ۥ:LYue/ۥۡۢۦۨ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LYue/ۥۡۢۦۨ;

    invoke-direct {v0}, LYue/ۥۡۢۦۨ;-><init>()V

    sput-object v0, LYue/ۥۡۢۦۨ;->ۥ:LYue/ۥۡۢۦۨ;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/net/ProxySelector;-><init>()V

    return-void
.end method


# virtual methods
.method public connectFailed(Ljava/net/URI;Ljava/net/SocketAddress;Ljava/io/IOException;)V
    .locals 0
    .param p1    # Ljava/net/URI;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p2    # Ljava/net/SocketAddress;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p3    # Ljava/io/IOException;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    return-void
.end method

.method public select(Ljava/net/URI;)Ljava/util/List;
    .locals 1
    .param p1    # Ljava/net/URI;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/net/URI;",
            ")",
            "Ljava/util/List<",
            "Ljava/net/Proxy;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_0

    sget-object p1, Ljava/net/Proxy;->NO_PROXY:Ljava/net/Proxy;

    invoke-static {p1}, LYue/ۥ۟ۥۡۢ;->ۥ۟۟۟ۥ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "uri must not be null"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
