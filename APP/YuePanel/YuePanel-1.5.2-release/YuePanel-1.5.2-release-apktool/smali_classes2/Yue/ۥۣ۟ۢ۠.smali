.class public final LYue/ۥۣ۟ۢ۠;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۠ۥۦۤ;


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nBridgeInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BridgeInterceptor.kt\nokhttp3/internal/http/BridgeInterceptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,117:1\n1864#2,3:118\n*S KotlinDebug\n*F\n+ 1 BridgeInterceptor.kt\nokhttp3/internal/http/BridgeInterceptor\n*L\n111#1:118,3\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBridgeInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BridgeInterceptor.kt\nokhttp3/internal/http/BridgeInterceptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,117:1\n1864#2,3:118\n*S KotlinDebug\n*F\n+ 1 BridgeInterceptor.kt\nokhttp3/internal/http/BridgeInterceptor\n*L\n111#1:118,3\n*E\n"
.end annotation


# instance fields
.field public final ۥ۟:LYue/ۥ۟ۧۦ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥ۟ۧۦ;)V
    .locals 1
    .param p1    # LYue/ۥ۟ۧۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "cookieJar"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۣ۟ۢ۠;->ۥ۟:LYue/ۥ۟ۧۦ;

    return-void
.end method


# virtual methods
.method public ۥ(LYue/ۥ۠ۥۦۤ$ۥ;)LYue/ۥۡۦۧ;
    .locals 12
    .param p1    # LYue/ۥ۠ۥۦۤ$ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "chain"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LYue/ۥ۠ۥۦۤ$ۥ;->ۥ۟()LYue/ۥۡۦۤۧ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥۡۦۤۧ;->ۥ۟۟۟ۨ()LYue/ۥۡۦۤۧ$ۥ;

    move-result-object v1

    invoke-virtual {v0}, LYue/ۥۡۦۤۧ;->ۥ۟۟۟۠()LYue/ۥۡۦۥ;

    move-result-object v2

    const-wide/16 v3, -0x1

    const-string v5, "Content-Type"

    const-string v6, "Content-Length"

    if-eqz v2, :cond_2

    invoke-virtual {v2}, LYue/ۥۡۦۥ;->ۥ۟()LYue/ۥۡ۠ۥۨ;

    move-result-object v7

    if-eqz v7, :cond_0

    invoke-virtual {v7}, LYue/ۥۡ۠ۥۨ;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v5, v7}, LYue/ۥۡۦۤۧ$ۥ;->ۥ۟۟۟ۨ(Ljava/lang/String;Ljava/lang/String;)LYue/ۥۡۦۤۧ$ۥ;

    :cond_0
    invoke-virtual {v2}, LYue/ۥۡۦۥ;->ۥ()J

    move-result-wide v7

    cmp-long v2, v7, v3

    const-string v9, "Transfer-Encoding"

    if-eqz v2, :cond_1

    invoke-static {v7, v8}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v6, v2}, LYue/ۥۡۦۤۧ$ۥ;->ۥ۟۟۟ۨ(Ljava/lang/String;Ljava/lang/String;)LYue/ۥۡۦۤۧ$ۥ;

    invoke-virtual {v1, v9}, LYue/ۥۡۦۤۧ$ۥ;->ۥۣ۟۟۠(Ljava/lang/String;)LYue/ۥۡۦۤۧ$ۥ;

    goto :goto_0

    :cond_1
    const-string v2, "chunked"

    invoke-virtual {v1, v9, v2}, LYue/ۥۡۦۤۧ$ۥ;->ۥ۟۟۟ۨ(Ljava/lang/String;Ljava/lang/String;)LYue/ۥۡۦۤۧ$ۥ;

    invoke-virtual {v1, v6}, LYue/ۥۡۦۤۧ$ۥ;->ۥۣ۟۟۠(Ljava/lang/String;)LYue/ۥۡۦۤۧ$ۥ;

    :cond_2
    :goto_0
    const-string v2, "Host"

    invoke-virtual {v0, v2}, LYue/ۥۡۦۤۧ;->ۥۣ۟۟۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-nez v7, :cond_3

    invoke-virtual {v0}, LYue/ۥۡۦۤۧ;->ۥ۟۟۠۠()LYue/ۥ۠ۤۨۥ;

    move-result-object v7

    invoke-static {v7, v8, v9, v10}, LYue/ۥۣۢۥ۟;->ۥ۟۟ۤ(LYue/ۥ۠ۤۨۥ;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v2, v7}, LYue/ۥۡۦۤۧ$ۥ;->ۥ۟۟۟ۨ(Ljava/lang/String;Ljava/lang/String;)LYue/ۥۡۦۤۧ$ۥ;

    :cond_3
    const-string v2, "Connection"

    invoke-virtual {v0, v2}, LYue/ۥۡۦۤۧ;->ۥۣ۟۟۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_4

    const-string v7, "Keep-Alive"

    invoke-virtual {v1, v2, v7}, LYue/ۥۡۦۤۧ$ۥ;->ۥ۟۟۟ۨ(Ljava/lang/String;Ljava/lang/String;)LYue/ۥۡۦۤۧ$ۥ;

    :cond_4
    const-string v2, "Accept-Encoding"

    invoke-virtual {v0, v2}, LYue/ۥۡۦۤۧ;->ۥۣ۟۟۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v11, "gzip"

    if-nez v7, :cond_5

    const-string v7, "Range"

    invoke-virtual {v0, v7}, LYue/ۥۡۦۤۧ;->ۥۣ۟۟۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_5

    invoke-virtual {v1, v2, v11}, LYue/ۥۡۦۤۧ$ۥ;->ۥ۟۟۟ۨ(Ljava/lang/String;Ljava/lang/String;)LYue/ۥۡۦۤۧ$ۥ;

    move v8, v9

    :cond_5
    iget-object v2, p0, LYue/ۥۣ۟ۢ۠;->ۥ۟:LYue/ۥ۟ۧۦ;

    invoke-virtual {v0}, LYue/ۥۡۦۤۧ;->ۥ۟۟۠۠()LYue/ۥ۠ۤۨۥ;

    move-result-object v7

    invoke-interface {v2, v7}, LYue/ۥ۟ۧۦ;->ۥ(LYue/ۥ۠ۤۨۥ;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v7

    xor-int/2addr v7, v9

    if-eqz v7, :cond_6

    const-string v7, "Cookie"

    invoke-virtual {p0, v2}, LYue/ۥۣ۟ۢ۠;->ۥ۟(Ljava/util/List;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v7, v2}, LYue/ۥۡۦۤۧ$ۥ;->ۥ۟۟۟ۨ(Ljava/lang/String;Ljava/lang/String;)LYue/ۥۡۦۤۧ$ۥ;

    :cond_6
    const-string v2, "User-Agent"

    invoke-virtual {v0, v2}, LYue/ۥۡۦۤۧ;->ۥۣ۟۟۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_7

    const-string v7, "okhttp/4.12.0"

    invoke-virtual {v1, v2, v7}, LYue/ۥۡۦۤۧ$ۥ;->ۥ۟۟۟ۨ(Ljava/lang/String;Ljava/lang/String;)LYue/ۥۡۦۤۧ$ۥ;

    :cond_7
    invoke-virtual {v1}, LYue/ۥۡۦۤۧ$ۥ;->ۥ۟()LYue/ۥۡۦۤۧ;

    move-result-object v1

    invoke-interface {p1, v1}, LYue/ۥ۠ۥۦۤ$ۥ;->ۥۣ۟۟۟(LYue/ۥۡۦۤۧ;)LYue/ۥۡۦۧ;

    move-result-object p1

    iget-object v1, p0, LYue/ۥۣ۟ۢ۠;->ۥ۟:LYue/ۥ۟ۧۦ;

    invoke-virtual {v0}, LYue/ۥۡۦۤۧ;->ۥ۟۟۠۠()LYue/ۥ۠ۤۨۥ;

    move-result-object v2

    invoke-virtual {p1}, LYue/ۥۡۦۧ;->ۥ۟۟ۤۢ()LYue/ۥ۠ۤۢۢ;

    move-result-object v7

    invoke-static {v1, v2, v7}, LYue/ۥ۠ۤۨۡ;->ۥ۟۟۟ۡ(LYue/ۥ۟ۧۦ;LYue/ۥ۠ۤۨۥ;LYue/ۥ۠ۤۢۢ;)V

    invoke-virtual {p1}, LYue/ۥۡۦۧ;->ۥ۟۟ۥۡ()LYue/ۥۡۦۧ$ۥ;

    move-result-object v1

    invoke-virtual {v1, v0}, LYue/ۥۡۦۧ$ۥ;->ۥۣ۟۟ۡ(LYue/ۥۡۦۤۧ;)LYue/ۥۡۦۧ$ۥ;

    move-result-object v0

    if-eqz v8, :cond_8

    const-string v1, "Content-Encoding"

    const/4 v2, 0x2

    invoke-static {p1, v1, v10, v2, v10}, LYue/ۥۡۦۧ;->ۥۣ۟۟ۤ(LYue/ۥۡۦۧ;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v11, v7, v9}, LYue/ۥۢ۠ۢۤ;->ۥ۟۠ۡۢ(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-static {p1}, LYue/ۥ۠ۤۨۡ;->ۥ۟۟(LYue/ۥۡۦۧ;)Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-virtual {p1}, LYue/ۥۡۦۧ;->ۥ۟۟ۡۡ()LYue/ۥۡۦۧ۟;

    move-result-object v7

    if-eqz v7, :cond_8

    new-instance v8, LYue/ۥ۠ۤ۠۠;

    invoke-virtual {v7}, LYue/ۥۡۦۧ۟;->ۥ۟۟ۢ()LYue/ۥۣۣ۟۠;

    move-result-object v7

    invoke-direct {v8, v7}, LYue/ۥ۠ۤ۠۠;-><init>(LYue/ۥۣۢ۟ۦ;)V

    invoke-virtual {p1}, LYue/ۥۡۦۧ;->ۥ۟۟ۤۢ()LYue/ۥ۠ۤۢۢ;

    move-result-object v7

    invoke-virtual {v7}, LYue/ۥ۠ۤۢۢ;->ۥۣ۟۟۟()LYue/ۥ۠ۤۢۢ$ۥ;

    move-result-object v7

    invoke-virtual {v7, v1}, LYue/ۥ۠ۤۢۢ$ۥ;->ۥ۟۟۟ۦ(Ljava/lang/String;)LYue/ۥ۠ۤۢۢ$ۥ;

    move-result-object v1

    invoke-virtual {v1, v6}, LYue/ۥ۠ۤۢۢ$ۥ;->ۥ۟۟۟ۦ(Ljava/lang/String;)LYue/ۥ۠ۤۢۢ$ۥ;

    move-result-object v1

    invoke-virtual {v1}, LYue/ۥ۠ۤۢۢ$ۥ;->ۥۣ۟۟۟()LYue/ۥ۠ۤۢۢ;

    move-result-object v1

    invoke-virtual {v0, v1}, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۠ۦ(LYue/ۥ۠ۤۢۢ;)LYue/ۥۡۦۧ$ۥ;

    invoke-static {p1, v5, v10, v2, v10}, LYue/ۥۡۦۧ;->ۥۣ۟۟ۤ(LYue/ۥۡۦۧ;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance v1, LYue/ۥۡۦ۠ۨ;

    invoke-static {v8}, LYue/ۥۣۡۡ;->ۥ۟۟۟۟(LYue/ۥۣۢ۟ۦ;)LYue/ۥۣۣ۟۠;

    move-result-object v2

    invoke-direct {v1, p1, v3, v4, v2}, LYue/ۥۡۦ۠ۨ;-><init>(Ljava/lang/String;JLYue/ۥۣۣ۟۠;)V

    invoke-virtual {v0, v1}, LYue/ۥۡۦۧ$ۥ;->ۥ۟(LYue/ۥۡۦۧ۟;)LYue/ۥۡۦۧ$ۥ;

    :cond_8
    invoke-virtual {v0}, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟()LYue/ۥۡۦۧ;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟(Ljava/util/List;)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LYue/\u06e5\u06df\u06e7\u06e5\u06e8;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v3, v1, 0x1

    if-gez v1, :cond_0

    invoke-static {}, LYue/ۥ۟ۥۣۡ;->ۥۣ۟۟۟()V

    :cond_0
    check-cast v2, LYue/ۥ۟ۧۥۨ;

    if-lez v1, :cond_1

    const-string v1, "; "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    invoke-virtual {v2}, LYue/ۥ۟ۧۥۨ;->ۥ۟۟۠ۢ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x3d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, LYue/ۥ۟ۧۥۨ;->ۥ۟۟ۡ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move v1, v3

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "StringBuilder().apply(builderAction).toString()"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
