.class public final LYue/ۥۣ۠ۡ۟$ۥ۟;
.super LYue/ۥ۠ۢۧ۟;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nExchange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Exchange.kt\nokhttp3/internal/connection/Exchange$ResponseBodySource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,333:1\n1#2:334\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣ۠ۡ۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "\u06e5\u06df"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nExchange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Exchange.kt\nokhttp3/internal/connection/Exchange$ResponseBodySource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,333:1\n1#2:334\n*E\n"
.end annotation


# instance fields
.field public final ۥ۟۟۠ۤ:J

.field public ۥ۟۟۠ۥ:J

.field public ۥ۟۟۠ۦ:Z

.field public ۥ۟۟۠ۧ:Z

.field public ۥ۟۟۠ۨ:Z

.field public final synthetic ۥ۟۟ۡ:LYue/ۥۣ۠ۡ۟;


# direct methods
.method public constructor <init>(LYue/ۥۣ۠ۡ۟;LYue/ۥۣۢ۟ۦ;J)V
    .locals 1
    .param p1    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e2\u06df\u06e3\u06e6;",
            "J)V"
        }
    .end annotation

    const-string v0, "delegate"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LYue/ۥۣ۠ۡ۟$ۥ۟;->ۥ۟۟ۡ:LYue/ۥۣ۠ۡ۟;

    invoke-direct {p0, p2}, LYue/ۥ۠ۢۧ۟;-><init>(LYue/ۥۣۢ۟ۦ;)V

    iput-wide p3, p0, LYue/ۥۣ۠ۡ۟$ۥ۟;->ۥ۟۟۠ۤ:J

    const/4 p1, 0x1

    iput-boolean p1, p0, LYue/ۥۣ۠ۡ۟$ۥ۟;->ۥ۟۟۠ۦ:Z

    const-wide/16 p1, 0x0

    cmp-long p1, p3, p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, LYue/ۥۣ۠ۡ۟$ۥ۟;->ۥ۟۟۟(Ljava/io/IOException;)Ljava/io/IOException;

    :cond_0
    return-void
.end method


# virtual methods
.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-boolean v0, p0, LYue/ۥۣ۠ۡ۟$ۥ۟;->ۥ۟۟۠ۨ:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥۣ۠ۡ۟$ۥ۟;->ۥ۟۟۠ۨ:Z

    :try_start_0
    invoke-super {p0}, LYue/ۥ۠ۢۧ۟;->close()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LYue/ۥۣ۠ۡ۟$ۥ۟;->ۥ۟۟۟(Ljava/io/IOException;)Ljava/io/IOException;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-virtual {p0, v0}, LYue/ۥۣ۠ۡ۟$ۥ۟;->ۥ۟۟۟(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    throw v0
.end method

.method public final ۥ۟۟۟(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/io/IOException;",
            ">(TE;)TE;"
        }
    .end annotation

    iget-boolean v0, p0, LYue/ۥۣ۠ۡ۟$ۥ۟;->ۥ۟۟۠ۧ:Z

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥۣ۠ۡ۟$ۥ۟;->ۥ۟۟۠ۧ:Z

    if-nez p1, :cond_1

    iget-boolean v0, p0, LYue/ۥۣ۠ۡ۟$ۥ۟;->ۥ۟۟۠ۦ:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, LYue/ۥۣ۠ۡ۟$ۥ۟;->ۥ۟۟۠ۦ:Z

    iget-object v0, p0, LYue/ۥۣ۠ۡ۟$ۥ۟;->ۥ۟۟ۡ:LYue/ۥۣ۠ۡ۟;

    invoke-virtual {v0}, LYue/ۥۣ۠ۡ۟;->ۥۣ۟۟۟()LYue/ۥ۠ۡۡ۟;

    move-result-object v0

    iget-object v1, p0, LYue/ۥۣ۠ۡ۟$ۥ۟;->ۥ۟۟ۡ:LYue/ۥۣ۠ۡ۟;

    invoke-virtual {v1}, LYue/ۥۣ۠ۡ۟;->ۥ۟۟۟ۡ()LYue/ۥۡۦ۠ۤ;

    move-result-object v1

    invoke-virtual {v0, v1}, LYue/ۥ۠ۡۡ۟;->ۥ۟۟۠ۦ(LYue/ۥۣ۟ۦۣ;)V

    :cond_1
    iget-object v2, p0, LYue/ۥۣ۠ۡ۟$ۥ۟;->ۥ۟۟ۡ:LYue/ۥۣ۠ۡ۟;

    iget-wide v3, p0, LYue/ۥۣ۠ۡ۟$ۥ۟;->ۥ۟۟۠ۥ:J

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v7, p1

    invoke-virtual/range {v2 .. v7}, LYue/ۥۣ۠ۡ۟;->ۥ(JZZLjava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟ۢۢ(LYue/ۥۣ۟ۢۨ;J)J
    .locals 7
    .param p1    # LYue/ۥۣ۟ۢۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "sink"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LYue/ۥۣ۠ۡ۟$ۥ۟;->ۥ۟۟۠ۨ:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_5

    :try_start_0
    invoke-virtual {p0}, LYue/ۥ۠ۢۧ۟;->ۥ۟۟()LYue/ۥۣۢ۟ۦ;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, LYue/ۥۣۢ۟ۦ;->ۥ۟۟ۢۢ(LYue/ۥۣ۟ۢۨ;J)J

    move-result-wide p1

    iget-boolean p3, p0, LYue/ۥۣ۠ۡ۟$ۥ۟;->ۥ۟۟۠ۦ:Z

    if-eqz p3, :cond_0

    const/4 p3, 0x0

    iput-boolean p3, p0, LYue/ۥۣ۠ۡ۟$ۥ۟;->ۥ۟۟۠ۦ:Z

    iget-object p3, p0, LYue/ۥۣ۠ۡ۟$ۥ۟;->ۥ۟۟ۡ:LYue/ۥۣ۠ۡ۟;

    invoke-virtual {p3}, LYue/ۥۣ۠ۡ۟;->ۥۣ۟۟۟()LYue/ۥ۠ۡۡ۟;

    move-result-object p3

    iget-object v0, p0, LYue/ۥۣ۠ۡ۟$ۥ۟;->ۥ۟۟ۡ:LYue/ۥۣ۠ۡ۟;

    invoke-virtual {v0}, LYue/ۥۣ۠ۡ۟;->ۥ۟۟۟ۡ()LYue/ۥۡۦ۠ۤ;

    move-result-object v0

    invoke-virtual {p3, v0}, LYue/ۥ۠ۡۡ۟;->ۥ۟۟۠ۦ(LYue/ۥۣ۟ۦۣ;)V

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_0
    :goto_0
    const-wide/16 v0, -0x1

    cmp-long p3, p1, v0

    const/4 v2, 0x0

    if-nez p3, :cond_1

    invoke-virtual {p0, v2}, LYue/ۥۣ۠ۡ۟$ۥ۟;->ۥ۟۟۟(Ljava/io/IOException;)Ljava/io/IOException;

    return-wide v0

    :cond_1
    iget-wide v3, p0, LYue/ۥۣ۠ۡ۟$ۥ۟;->ۥ۟۟۠ۥ:J

    add-long/2addr v3, p1

    iget-wide v5, p0, LYue/ۥۣ۠ۡ۟$ۥ۟;->ۥ۟۟۠ۤ:J

    cmp-long p3, v5, v0

    if-eqz p3, :cond_3

    cmp-long p3, v3, v5

    if-gtz p3, :cond_2

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/net/ProtocolException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "expected "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v0, p0, LYue/ۥۣ۠ۡ۟$ۥ۟;->ۥ۟۟۠ۤ:J

    invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p3, " bytes but received "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_1
    iput-wide v3, p0, LYue/ۥۣ۠ۡ۟$ۥ۟;->ۥ۟۟۠ۥ:J

    cmp-long p3, v3, v5

    if-nez p3, :cond_4

    invoke-virtual {p0, v2}, LYue/ۥۣ۠ۡ۟$ۥ۟;->ۥ۟۟۟(Ljava/io/IOException;)Ljava/io/IOException;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_4
    return-wide p1

    :goto_2
    invoke-virtual {p0, p1}, LYue/ۥۣ۠ۡ۟$ۥ۟;->ۥ۟۟۟(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
