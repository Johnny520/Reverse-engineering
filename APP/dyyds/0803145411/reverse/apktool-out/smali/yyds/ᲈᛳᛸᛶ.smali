.class public final Lyyds/ᲈᛳᛸᛶ;
.super Lyyds/ᛴᲀᛴᛵ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛶᛷᛲᲁ:Lyyds/ᛳᛱᛱ;


# direct methods
.method public constructor <init>(Lyyds/ᛳᛱᛱ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lyyds/ᛳᲁᛱ;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᲈᛳᛸᛶ;->ᛶᛷᛲᲁ:Lyyds/ᛳᛱᛱ;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final ᛲᛲᲈᲈ(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lyyds/ᛴᲀᛴᛵ;->ᲇᲇᲇᛱ:Lyyds/ᛴᲈᛱᛷ;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 p1, 0x0

    .line 7
    :goto_0
    invoke-virtual {p1}, Lyyds/ᛴᲈᛱᛷ;->ᲀᛲᛱᛱ()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    instance-of v0, p1, Lyyds/ᛲᛸᛶᛳ;

    .line 12
    .line 13
    iget-object p0, p0, Lyyds/ᲈᛳᛸᛶ;->ᛶᛷᛲᲁ:Lyyds/ᛳᛱᛱ;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    check-cast p1, Lyyds/ᛲᛸᛶᛳ;

    .line 18
    .line 19
    iget-object p1, p1, Lyyds/ᛲᛸᛶᛳ;->ᛲᲈᲁ:Ljava/lang/Throwable;

    .line 20
    .line 21
    new-instance v0, Lyyds/ᲈᛵᛵᛴ;

    .line 22
    .line 23
    invoke-direct {v0, p1}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v0}, Lyyds/ᛸᲀᛱᛴ;->ᛱᲈᲁ(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    invoke-static {p1}, Lyyds/ᛲᛷᛵᲇ;->ᛶᛳᛶᛵ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p0, p1}, Lyyds/ᛸᲀᛱᛴ;->ᛱᲈᲁ(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final ᛷᛵᲇᲀ()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method
