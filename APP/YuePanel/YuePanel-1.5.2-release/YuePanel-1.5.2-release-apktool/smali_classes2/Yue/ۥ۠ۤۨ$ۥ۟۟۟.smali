.class public final LYue/ۥ۠ۤۨ$ۥ۟۟۟;
.super LYue/ۥ۟ۢ۟ۤ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۤۨ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "\u06e5\u06df\u06df\u06df"
.end annotation


# instance fields
.field public final synthetic ۥ۟۟۠۟:LYue/ۥ۠ۤۨ;


# direct methods
.method public constructor <init>(LYue/ۥ۠ۤۨ;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۠ۤۨ$ۥ۟۟۟;->ۥ۟۟۠۟:LYue/ۥ۠ۤۨ;

    invoke-direct {p0}, LYue/ۥ۟ۢ۟ۤ;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ۟۟ۡ۠(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2
    .param p1    # Ljava/io/IOException;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Ljava/net/SocketTimeoutException;

    const-string v1, "timeout"

    invoke-direct {v0, v1}, Ljava/net/SocketTimeoutException;-><init>(Ljava/lang/String;)V

    if-eqz p1, :cond_0

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    :cond_0
    return-object v0
.end method

.method public ۥ۟۟ۡۤ()V
    .locals 2

    iget-object v0, p0, LYue/ۥ۠ۤۨ$ۥ۟۟۟;->ۥ۟۟۠۟:LYue/ۥ۠ۤۨ;

    sget-object v1, LYue/ۥ۠ۡ۠ۢ;->ۥ۟۟ۡۢ:LYue/ۥ۠ۡ۠ۢ;

    invoke-virtual {v0, v1}, LYue/ۥ۠ۤۨ;->ۥ۟۟۟۠(LYue/ۥ۠ۡ۠ۢ;)V

    iget-object v0, p0, LYue/ۥ۠ۤۨ$ۥ۟۟۟;->ۥ۟۟۠۟:LYue/ۥ۠ۤۨ;

    invoke-virtual {v0}, LYue/ۥ۠ۤۨ;->ۥ۟۟۟ۢ()LYue/ۥ۠ۤۧۦ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥ۠ۤۧۦ;->ۥ۟۟ۨۤ()V

    return-void
.end method

.method public final ۥ۟۟ۡۦ()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥ۟ۢ۟ۤ;->ۥ۟۟ۡ۟()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LYue/ۥ۠ۤۨ$ۥ۟۟۟;->ۥ۟۟ۡ۠(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    throw v0
.end method
