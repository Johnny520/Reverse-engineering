.class public final LYue/ۥ۟ۢ۟ۤ$ۥ۟۟۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣۢ۟ۦ;


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nAsyncTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout$source$1\n+ 2 AsyncTimeout.kt\nokio/AsyncTimeout\n*L\n1#1,331:1\n146#2,11:332\n146#2,11:343\n*S KotlinDebug\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout$source$1\n*L\n128#1:332,11\n132#1:343,11\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۟ۢ۟ۤ;->ۥۣ۟۟ۡ(LYue/ۥۣۢ۟ۦ;)LYue/ۥۣۢ۟ۦ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAsyncTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout$source$1\n+ 2 AsyncTimeout.kt\nokio/AsyncTimeout\n*L\n1#1,331:1\n146#2,11:332\n146#2,11:343\n*S KotlinDebug\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout$source$1\n*L\n128#1:332,11\n132#1:343,11\n*E\n"
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥ۟ۢ۟ۤ;

.field public final synthetic ۥ۟۟۠ۤ:LYue/ۥۣۢ۟ۦ;


# direct methods
.method public constructor <init>(LYue/ۥ۟ۢ۟ۤ;LYue/ۥۣۢ۟ۦ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥ۟ۢ۟ۤ$ۥ۟۟۟;->ۥۣ۟۟۠:LYue/ۥ۟ۢ۟ۤ;

    iput-object p2, p0, LYue/ۥ۟ۢ۟ۤ$ۥ۟۟۟;->ۥ۟۟۠ۤ:LYue/ۥۣۢ۟ۦ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 3

    iget-object v0, p0, LYue/ۥ۟ۢ۟ۤ$ۥ۟۟۟;->ۥۣ۟۟۠:LYue/ۥ۟ۢ۟ۤ;

    iget-object v1, p0, LYue/ۥ۟ۢ۟ۤ$ۥ۟۟۟;->ۥ۟۟۠ۤ:LYue/ۥۣۢ۟ۦ;

    invoke-virtual {v0}, LYue/ۥ۟ۢ۟ۤ;->ۥ۟۟ۡ()V

    :try_start_0
    invoke-interface {v1}, LYue/ۥۣۢ۟ۦ;->close()V

    sget-object v1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, LYue/ۥ۟ۢ۟ۤ;->ۥ۟۟ۡ۟()Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LYue/ۥ۟ۢ۟ۤ;->ۥۣ۟۟۠(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    :catchall_0
    move-exception v1

    goto :goto_1

    :catch_0
    move-exception v1

    :try_start_1
    invoke-virtual {v0}, LYue/ۥ۟ۢ۟ۤ;->ۥ۟۟ۡ۟()Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0, v1}, LYue/ۥ۟ۢ۟ۤ;->ۥۣ۟۟۠(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v1

    :goto_0
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    invoke-virtual {v0}, LYue/ۥ۟ۢ۟ۤ;->ۥ۟۟ۡ۟()Z

    throw v1
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AsyncTimeout.source("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥ۟ۢ۟ۤ$ۥ۟۟۟;->ۥ۟۟۠ۤ:LYue/ۥۣۢ۟ۦ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic ۥ()LYue/ۥۢۡۤۧ;
    .locals 1

    invoke-virtual {p0}, LYue/ۥ۟ۢ۟ۤ$ۥ۟۟۟;->ۥ۟()LYue/ۥ۟ۢ۟ۤ;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟()LYue/ۥ۟ۢ۟ۤ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۢ۟ۤ$ۥ۟۟۟;->ۥۣ۟۟۠:LYue/ۥ۟ۢ۟ۤ;

    return-object v0
.end method

.method public ۥ۟۟ۢۢ(LYue/ۥۣ۟ۢۨ;J)J
    .locals 2
    .param p1    # LYue/ۥۣ۟ۢۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "sink"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥ۟ۢ۟ۤ$ۥ۟۟۟;->ۥۣ۟۟۠:LYue/ۥ۟ۢ۟ۤ;

    iget-object v1, p0, LYue/ۥ۟ۢ۟ۤ$ۥ۟۟۟;->ۥ۟۟۠ۤ:LYue/ۥۣۢ۟ۦ;

    invoke-virtual {v0}, LYue/ۥ۟ۢ۟ۤ;->ۥ۟۟ۡ()V

    :try_start_0
    invoke-interface {v1, p1, p2, p3}, LYue/ۥۣۢ۟ۦ;->ۥ۟۟ۢۢ(LYue/ۥۣ۟ۢۨ;J)J

    move-result-wide p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, LYue/ۥ۟ۢ۟ۤ;->ۥ۟۟ۡ۟()Z

    move-result p3

    if-nez p3, :cond_0

    return-wide p1

    :cond_0
    const/4 p1, 0x0

    invoke-virtual {v0, p1}, LYue/ۥ۟ۢ۟ۤ;->ۥۣ۟۟۠(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    :try_start_1
    invoke-virtual {v0}, LYue/ۥ۟ۢ۟ۤ;->ۥ۟۟ۡ۟()Z

    move-result p2

    if-nez p2, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0, p1}, LYue/ۥ۟ۢ۟ۤ;->ۥۣ۟۟۠(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    :goto_0
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    invoke-virtual {v0}, LYue/ۥ۟ۢ۟ۤ;->ۥ۟۟ۡ۟()Z

    throw p1
.end method
