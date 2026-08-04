.class public final Lyyds/ᛸᛸᛱᲀ;
.super Lyyds/ᛲᛶᲀ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛷᛷᛳᛷ;


# instance fields
.field public final ᛲᛴᛳᛲ:J

.field public final ᲇᲈᛵᛷ:Lyyds/ᛴᛲᲁᲈ;


# direct methods
.method public constructor <init>(Lyyds/ᛴᛲᲁᲈ;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛸᛸᛱᲀ;->ᲇᲈᛵᛷ:Lyyds/ᛴᛲᲁᲈ;

    .line 5
    .line 6
    iput-wide p2, p0, Lyyds/ᛸᛸᛱᲀ;->ᛲᛴᛳᛲ:J

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

.method public final ᛳᲁᲁᲇ()Lyyds/ᛴᲇᛸ;
    .locals 1

    .line 1
    new-instance v0, Lyyds/ᲀᲀᛵᲈ;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lyyds/ᲀᲀᛵᲈ;-><init>(Lyyds/ᛷᛷᛳᛷ;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final ᛶᛷᛲᲁ()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lyyds/ᛸᛸᛱᲀ;->ᛲᛴᛳᛲ:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final ᛶᛸᲀᲁ(JLyyds/ᛷᛲᲈᛲ;)J
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

.method public final ᛷᲈᲈᲁ()Lyyds/ᛴᛲᲁᲈ;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛸᛸᛱᲀ;->ᲇᲈᛵᛷ:Lyyds/ᛴᛲᲁᲈ;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᲀᛲᛳᲀ()Lyyds/ᲈᲁᛴᛲ;
    .locals 0

    .line 1
    sget-object p0, Lyyds/ᲈᲁᛴᛲ;->ᲇᲈᛵᛷ:Lyyds/ᛶᲁᲁᲁ;

    .line 2
    .line 3
    return-object p0
.end method
