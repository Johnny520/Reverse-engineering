.class public final Lxhss/ᛵᛷᲀᛱ;
.super Lxhss/ᲇᛷᛱᛸ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᲇᲁᲀᲇ;


# instance fields
.field public final ᛳᲁᲇᛸ:Lxhss/ᛱᛴᛲᛴ;

.field public final ᲇᛴᲇᛵ:J


# direct methods
.method public constructor <init>(Lxhss/ᛱᛴᛲᛴ;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᛵᛷᲀᛱ;->ᛳᲁᲇᛸ:Lxhss/ᛱᛴᛲᛴ;

    .line 5
    .line 6
    iput-wide p2, p0, Lxhss/ᛵᛷᲀᛱ;->ᲇᛴᲇᛵ:J

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

.method public final ᛳᲁᲇᛸ()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lxhss/ᛵᛷᲀᛱ;->ᲇᛴᲇᛵ:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final ᛷᛵᛵᲈ()Lxhss/ᛲᲁᲈᛲ;
    .locals 0

    .line 1
    sget-object p0, Lxhss/ᛲᲁᲈᛲ;->ᲇᛴᲇᛵ:Lxhss/ᛳᲁᲁᛲ;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᛸᛴᛶᛳ(JLxhss/ᛴᛲᛴᛶ;)J
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string p1, "Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final ᲀᲇᛳᲁ()Lxhss/ᲀᛶᛷᛳ;
    .locals 1

    .line 1
    new-instance v0, Lxhss/ᲁᛸᛵᛳ;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lxhss/ᲁᛸᛵᛳ;-><init>(Lxhss/ᲇᲁᲀᲇ;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final ᲇᛴᲇᛵ()Lxhss/ᛱᛴᛲᛴ;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛵᛷᲀᛱ;->ᛳᲁᲇᛸ:Lxhss/ᛱᛴᛲᛴ;

    .line 2
    .line 3
    return-object p0
.end method
