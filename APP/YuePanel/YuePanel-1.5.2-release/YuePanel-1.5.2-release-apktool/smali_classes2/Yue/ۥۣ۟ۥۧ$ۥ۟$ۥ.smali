.class public final LYue/ۥۣ۟ۥۧ$ۥ۟$ۥ;
.super LYue/ۥ۠ۢۧ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۣ۟ۥۧ$ۥ۟;-><init>(LYue/ۥۣ۟ۥۧ;LYue/ۥ۠۟ۡۨ$ۥ۟;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic ۥ۟۟۠ۤ:LYue/ۥۣ۟ۥۧ;

.field public final synthetic ۥ۟۟۠ۥ:LYue/ۥۣ۟ۥۧ$ۥ۟;


# direct methods
.method public constructor <init>(LYue/ۥۣ۟ۥۧ;LYue/ۥۣ۟ۥۧ$ۥ۟;LYue/ۥۣۢ۟ۡ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۣ۟ۥۧ$ۥ۟$ۥ;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۥۧ;

    iput-object p2, p0, LYue/ۥۣ۟ۥۧ$ۥ۟$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۣ۟ۥۧ$ۥ۟;

    invoke-direct {p0, p3}, LYue/ۥ۠ۢۧ;-><init>(LYue/ۥۣۢ۟ۡ;)V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۟ۥۧ$ۥ۟$ۥ;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۥۧ;

    iget-object v1, p0, LYue/ۥۣ۟ۥۧ$ۥ۟$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۣ۟ۥۧ$ۥ۟;

    monitor-enter v0

    :try_start_0
    invoke-virtual {v1}, LYue/ۥۣ۟ۥۧ$ۥ۟;->ۥ۟()Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    const/4 v2, 0x1

    :try_start_1
    invoke-virtual {v1, v2}, LYue/ۥۣ۟ۥۧ$ۥ۟;->ۥ۟۟(Z)V

    invoke-virtual {v0}, LYue/ۥۣ۟ۥۧ;->ۥ۟۟۠ۡ()I

    move-result v1

    add-int/2addr v1, v2

    invoke-virtual {v0, v1}, LYue/ۥۣ۟ۥۧ;->ۥ۟۟ۢۨ(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    invoke-super {p0}, LYue/ۥ۠ۢۧ;->close()V

    iget-object v0, p0, LYue/ۥۣ۟ۥۧ$ۥ۟$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۣ۟ۥۧ$ۥ۟;

    invoke-static {v0}, LYue/ۥۣ۟ۥۧ$ۥ۟;->ۥ(LYue/ۥۣ۟ۥۧ$ۥ۟;)LYue/ۥ۠۟ۡۨ$ۥ۟;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥ۠۟ۡۨ$ۥ۟;->ۥ۟()V

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method
