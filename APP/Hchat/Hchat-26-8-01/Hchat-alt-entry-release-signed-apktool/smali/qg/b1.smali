.class public final Lqg/b1;
.super Lwf/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lqg/r0;


# static fields
.field public static final h:Lqg/b1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lqg/b1;

    .line 2
    .line 3
    sget-object v1, Lqg/q;->h:Lqg/q;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lwf/a;-><init>(Lwf/f;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lqg/b1;->h:Lqg/b1;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/concurrent/CancellationException;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final b()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final c(ZZLp8/p;)Lqg/d0;
    .locals 0

    .line 1
    sget-object p1, Lqg/c1;->g:Lqg/c1;

    .line 2
    .line 3
    return-object p1
.end method

.method public final g(Lyf/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "This job is always active"

    .line 4
    .line 5
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
.end method

.method public final h()Ljava/util/concurrent/CancellationException;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v1, "This job is always active"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

.method public final l(Lqg/y0;)Lqg/j;
    .locals 0

    .line 1
    sget-object p1, Lqg/c1;->g:Lqg/c1;

    .line 2
    .line 3
    return-object p1
.end method

.method public final o(Lfg/l;)Lqg/d0;
    .locals 0

    .line 1
    sget-object p1, Lqg/c1;->g:Lqg/c1;

    .line 2
    .line 3
    return-object p1
.end method

.method public final start()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "NonCancellable"

    .line 2
    .line 3
    return-object v0
.end method
