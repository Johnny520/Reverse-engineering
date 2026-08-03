.class public final LYue/ۥۢۡۢۨ$ۥ۟;
.super LYue/ۥ۠ۢۧ۟;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۢۡۢۨ;->ۥ۟۟۟ۥ(LYue/ۥۣۢ۟ۦ;)LYue/ۥۣۢ۟ۦ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic ۥ۟۟۠ۤ:LYue/ۥۢۡۢۨ;


# direct methods
.method public constructor <init>(LYue/ۥۣۢ۟ۦ;LYue/ۥۢۡۢۨ;)V
    .locals 0

    iput-object p2, p0, LYue/ۥۢۡۢۨ$ۥ۟;->ۥ۟۟۠ۤ:LYue/ۥۢۡۢۨ;

    invoke-direct {p0, p1}, LYue/ۥ۠ۢۧ۟;-><init>(LYue/ۥۣۢ۟ۦ;)V

    return-void
.end method


# virtual methods
.method public ۥ۟۟ۢۢ(LYue/ۥۣ۟ۢۨ;J)J
    .locals 1
    .param p1    # LYue/ۥۣ۟ۢۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "sink"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, LYue/ۥۢۡۢۨ$ۥ۟;->ۥ۟۟۠ۤ:LYue/ۥۢۡۢۨ;

    invoke-virtual {v0, p2, p3}, LYue/ۥۢۡۢۨ;->ۥ۟۟۟ۦ(J)J

    move-result-wide p2

    invoke-super {p0, p1, p2, p3}, LYue/ۥ۠ۢۧ۟;->ۥ۟۟ۢۢ(LYue/ۥۣ۟ۢۨ;J)J

    move-result-wide p1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide p1

    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    new-instance p1, Ljava/io/InterruptedIOException;

    const-string p2, "interrupted"

    invoke-direct {p1, p2}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
