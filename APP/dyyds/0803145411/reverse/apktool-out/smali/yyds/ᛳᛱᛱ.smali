.class public final Lyyds/ᛳᛱᛱ;
.super Lyyds/ᛸᲀᛱᛴ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛷᛲᲈᛱ:Lyyds/ᛴᲈᛱᛷ;


# direct methods
.method public constructor <init>(Lyyds/ᛲᛱᛶᛸ;Lyyds/ᛴᲈᛱᛷ;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0, p1}, Lyyds/ᛸᲀᛱᛴ;-><init>(ILyyds/ᛲᛱᛶᛸ;)V

    .line 3
    .line 4
    .line 5
    iput-object p2, p0, Lyyds/ᛳᛱᛱ;->ᛷᛲᲈᛱ:Lyyds/ᛴᲈᛱᛷ;

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final ᛳᛸᛴᛶ(Lyyds/ᛴᲈᛱᛷ;)Ljava/lang/Throwable;
    .locals 1

    .line 1
    iget-object p0, p0, Lyyds/ᛳᛱᛱ;->ᛷᛲᲈᛱ:Lyyds/ᛴᲈᛱᛷ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lyyds/ᛴᲈᛱᛷ;->ᲀᛲᛱᛱ()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    instance-of v0, p0, Lyyds/ᛶᛴᲀᛳ;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    move-object v0, p0

    .line 12
    check-cast v0, Lyyds/ᛶᛴᲀᛳ;

    .line 13
    .line 14
    invoke-virtual {v0}, Lyyds/ᛶᛴᲀᛳ;->ᲀᛲᛳᲀ()Ljava/lang/Throwable;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_0
    instance-of v0, p0, Lyyds/ᛲᛸᛶᛳ;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    check-cast p0, Lyyds/ᛲᛸᛶᛳ;

    .line 26
    .line 27
    iget-object p0, p0, Lyyds/ᛲᛸᛶᛳ;->ᛲᲈᲁ:Ljava/lang/Throwable;

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_1
    invoke-virtual {p1}, Lyyds/ᛴᲈᛱᛷ;->ᛵᛶᛲᲀ()Ljava/util/concurrent/CancellationException;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public final ᛷᛸᲇᛶ()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "AwaitContinuation"

    .line 2
    .line 3
    return-object p0
.end method
