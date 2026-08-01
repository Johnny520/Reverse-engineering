.class public final Lv62;
.super Lbo1;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lrx1;


# instance fields
.field public final ζ:Lez0;

.field public final η:J


# direct methods
.method public constructor <init>(Lez0;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv62;->ζ:Lez0;

    .line 5
    .line 6
    iput-wide p2, p0, Lv62;->η:J

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 0

    .line 1
    return-void
.end method

.method public final α()Lm42;
    .locals 0

    .line 1
    sget-object p0, Lm42;->δ:Ll42;

    .line 2
    .line 3
    return-object p0
.end method

.method public final β(JLsc;)J
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

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

.method public final η()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lv62;->η:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final θ()Lez0;
    .locals 0

    .line 1
    iget-object p0, p0, Lv62;->ζ:Lez0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final κ()Lad;
    .locals 1

    .line 1
    new-instance v0, Lrk1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lrk1;-><init>(Lrx1;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
