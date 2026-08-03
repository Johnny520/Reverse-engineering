.class public final LYue/ۥۣ۟ۥۧ$ۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۟ۦۡ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣ۟ۥۧ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "\u06e5\u06df"
.end annotation


# instance fields
.field public final ۥ:LYue/ۥ۠۟ۡۨ$ۥ۟;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟:LYue/ۥۣۢ۟ۡ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟:LYue/ۥۣۢ۟ۡ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public ۥ۟۟۟:Z

.field public final synthetic ۥ۟۟۟۟:LYue/ۥۣ۟ۥۧ;


# direct methods
.method public constructor <init>(LYue/ۥۣ۟ۥۧ;LYue/ۥ۠۟ۡۨ$ۥ۟;)V
    .locals 1
    .param p1    # LYue/ۥۣ۟ۥۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06df\u06e1\u06e8$\u06e5\u06df;",
            ")V"
        }
    .end annotation

    const-string v0, "editor"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LYue/ۥۣ۟ۥۧ$ۥ۟;->ۥ۟۟۟۟:LYue/ۥۣ۟ۥۧ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LYue/ۥۣ۟ۥۧ$ۥ۟;->ۥ:LYue/ۥ۠۟ۡۨ$ۥ۟;

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, LYue/ۥ۠۟ۡۨ$ۥ۟;->ۥ۟۟۟۠(I)LYue/ۥۣۢ۟ۡ;

    move-result-object p2

    iput-object p2, p0, LYue/ۥۣ۟ۥۧ$ۥ۟;->ۥ۟:LYue/ۥۣۢ۟ۡ;

    new-instance v0, LYue/ۥۣ۟ۥۧ$ۥ۟$ۥ;

    invoke-direct {v0, p1, p0, p2}, LYue/ۥۣ۟ۥۧ$ۥ۟$ۥ;-><init>(LYue/ۥۣ۟ۥۧ;LYue/ۥۣ۟ۥۧ$ۥ۟;LYue/ۥۣۢ۟ۡ;)V

    iput-object v0, p0, LYue/ۥۣ۟ۥۧ$ۥ۟;->ۥ۟۟:LYue/ۥۣۢ۟ۡ;

    return-void
.end method

.method public static final synthetic ۥ(LYue/ۥۣ۟ۥۧ$ۥ۟;)LYue/ۥ۠۟ۡۨ$ۥ۟;
    .locals 0

    iget-object p0, p0, LYue/ۥۣ۟ۥۧ$ۥ۟;->ۥ:LYue/ۥ۠۟ۡۨ$ۥ۟;

    return-object p0
.end method


# virtual methods
.method public final ۥ۟()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥۣ۟ۥۧ$ۥ۟;->ۥ۟۟۟:Z

    return v0
.end method

.method public final ۥ۟۟(Z)V
    .locals 0

    iput-boolean p1, p0, LYue/ۥۣ۟ۥۧ$ۥ۟;->ۥ۟۟۟:Z

    return-void
.end method

.method public ۥ۟۟۠()LYue/ۥۣۢ۟ۡ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۟ۥۧ$ۥ۟;->ۥ۟۟:LYue/ۥۣۢ۟ۡ;

    return-object v0
.end method

.method public ۥ۟۟۠۟()V
    .locals 3

    iget-object v0, p0, LYue/ۥۣ۟ۥۧ$ۥ۟;->ۥ۟۟۟۟:LYue/ۥۣ۟ۥۧ;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, LYue/ۥۣ۟ۥۧ$ۥ۟;->ۥ۟۟۟:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    :try_start_1
    iput-boolean v1, p0, LYue/ۥۣ۟ۥۧ$ۥ۟;->ۥ۟۟۟:Z

    invoke-virtual {v0}, LYue/ۥۣ۟ۥۧ;->ۥ۟۟۠()I

    move-result v2

    add-int/2addr v2, v1

    invoke-virtual {v0, v2}, LYue/ۥۣ۟ۥۧ;->ۥ۟۟ۢۧ(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    iget-object v0, p0, LYue/ۥۣ۟ۥۧ$ۥ۟;->ۥ۟:LYue/ۥۣۢ۟ۡ;

    invoke-static {v0}, LYue/ۥۣۢۥ۟;->ۥ۟۟۠(Ljava/io/Closeable;)V

    :try_start_2
    iget-object v0, p0, LYue/ۥۣ۟ۥۧ$ۥ۟;->ۥ:LYue/ۥ۠۟ۡۨ$ۥ۟;

    invoke-virtual {v0}, LYue/ۥ۠۟ۡۨ$ۥ۟;->ۥ()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method
