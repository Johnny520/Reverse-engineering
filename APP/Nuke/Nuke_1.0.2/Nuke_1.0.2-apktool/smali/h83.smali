.class public final Lh83;
.super Lu92;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lht2;


# instance fields
.field public final j:Lvf1;

.field public final k:J


# direct methods
.method public constructor <init>(Lvf1;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh83;->j:Lvf1;

    .line 5
    .line 6
    iput-wide p2, p0, Lh83;->k:J

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()Lo23;
    .locals 0

    .line 1
    sget-object p0, Lo23;->d:Ln23;

    .line 2
    .line 3
    return-object p0
.end method

.method public final c()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lh83;->k:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final close()V
    .locals 0

    .line 1
    return-void
.end method

.method public final e()Lvf1;
    .locals 0

    .line 1
    iget-object p0, p0, Lh83;->j:Lvf1;

    .line 2
    .line 3
    return-object p0
.end method

.method public final g()Lon;
    .locals 1

    .line 1
    new-instance v0, Lo52;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lo52;-><init>(Lht2;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final n(Lfn;J)J
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 5
    .line 6
    const-string p1, "Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)"

    .line 7
    .line 8
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    throw p0
.end method
