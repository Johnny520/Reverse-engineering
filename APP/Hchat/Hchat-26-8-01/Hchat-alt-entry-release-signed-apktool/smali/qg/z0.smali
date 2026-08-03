.class public final Lqg/z0;
.super Lqg/e1;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final j:Lwf/c;


# direct methods
.method public constructor <init>(Lwf/g;Lfg/p;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Lqg/a;-><init>(Lwf/g;Z)V

    .line 3
    .line 4
    .line 5
    invoke-static {p2, p0, p0}, Lfb/v0;->j(Lfg/p;Lwf/c;Lwf/c;)Lwf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, Lqg/z0;->j:Lwf/c;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final T()V
    .locals 2

    .line 1
    iget-object v0, p0, Lqg/z0;->j:Lwf/c;

    .line 2
    .line 3
    :try_start_0
    invoke-static {v0}, Lfb/v0;->x(Lwf/c;)Lwf/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 8
    .line 9
    invoke-static {v1, v0}, Lvg/a;->h(Ljava/lang/Object;Lwf/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    new-instance v1, Lsf/f;

    .line 15
    .line 16
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v1}, Lqg/a;->resumeWith(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    throw v0
.end method
