.class public final LYue/ۥ۠۟ۡۨ$ۥ۟۟$ۥ;
.super LYue/ۥ۠ۢۧ۟;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۠۟ۡۨ$ۥ۟۟;->ۥ۟۟۟ۥ(I)LYue/ۥۣۢ۟ۦ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public ۥ۟۟۠ۤ:Z

.field public final synthetic ۥ۟۟۠ۥ:LYue/ۥ۠۟ۡۨ;

.field public final synthetic ۥ۟۟۠ۦ:LYue/ۥ۠۟ۡۨ$ۥ۟۟;


# direct methods
.method public constructor <init>(LYue/ۥۣۢ۟ۦ;LYue/ۥ۠۟ۡۨ;LYue/ۥ۠۟ۡۨ$ۥ۟۟;)V
    .locals 0

    iput-object p2, p0, LYue/ۥ۠۟ۡۨ$ۥ۟۟$ۥ;->ۥ۟۟۠ۥ:LYue/ۥ۠۟ۡۨ;

    iput-object p3, p0, LYue/ۥ۠۟ۡۨ$ۥ۟۟$ۥ;->ۥ۟۟۠ۦ:LYue/ۥ۠۟ۡۨ$ۥ۟۟;

    invoke-direct {p0, p1}, LYue/ۥ۠ۢۧ۟;-><init>(LYue/ۥۣۢ۟ۦ;)V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 3

    invoke-super {p0}, LYue/ۥ۠ۢۧ۟;->close()V

    iget-boolean v0, p0, LYue/ۥ۠۟ۡۨ$ۥ۟۟$ۥ;->ۥ۟۟۠ۤ:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥ۠۟ۡۨ$ۥ۟۟$ۥ;->ۥ۟۟۠ۤ:Z

    iget-object v0, p0, LYue/ۥ۠۟ۡۨ$ۥ۟۟$ۥ;->ۥ۟۟۠ۥ:LYue/ۥ۠۟ۡۨ;

    iget-object v1, p0, LYue/ۥ۠۟ۡۨ$ۥ۟۟$ۥ;->ۥ۟۟۠ۦ:LYue/ۥ۠۟ۡۨ$ۥ۟۟;

    monitor-enter v0

    :try_start_0
    invoke-virtual {v1}, LYue/ۥ۠۟ۡۨ$ۥ۟۟;->ۥ۟۟۟۠()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v1, v2}, LYue/ۥ۠۟ۡۨ$ۥ۟۟;->ۥ۟۟۟ۨ(I)V

    invoke-virtual {v1}, LYue/ۥ۠۟ۡۨ$ۥ۟۟;->ۥ۟۟۟۠()I

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v1}, LYue/ۥ۠۟ۡۨ$ۥ۟۟;->ۥۣ۟۟۟()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0, v1}, LYue/ۥ۠۟ۡۨ;->ۥ۟۟ۦ(LYue/ۥ۠۟ۡۨ$ۥ۟۟;)Z

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    sget-object v1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0

    throw v1

    :cond_1
    :goto_2
    return-void
.end method
