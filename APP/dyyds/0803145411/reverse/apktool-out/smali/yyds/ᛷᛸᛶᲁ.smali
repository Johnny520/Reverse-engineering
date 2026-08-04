.class public Lyyds/ᛷᛸᛶᲁ;
.super Lyyds/ᛱᛸᲁᲇ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛶᲁᛵᛷ;


# instance fields
.field public final ᲇᲇᲇᛱ:Lyyds/ᛲᛱᛶᛸ;


# direct methods
.method public constructor <init>(Lyyds/ᲁᛴᛲ;Lyyds/ᛲᛱᛶᛸ;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, p1, v0}, Lyyds/ᛱᛸᲁᲇ;-><init>(Lyyds/ᲁᛴᛲ;Z)V

    .line 3
    .line 4
    .line 5
    iput-object p2, p0, Lyyds/ᛷᛸᛶᲁ;->ᲇᲇᲇᛱ:Lyyds/ᛲᛱᛶᛸ;

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final ᛱᛸᲁᲇ()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public ᛲᛲᲈᲈ(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛷᛸᛶᲁ;->ᲇᲇᲇᛱ:Lyyds/ᛲᛱᛶᛸ;

    .line 2
    .line 3
    invoke-static {p1}, Lyyds/ᛲᲇᲁᛳ;->ᛷᲈᲈᲁ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {p0, p1}, Lyyds/ᛲᛱᛶᛸ;->ᛱᲈᲁ(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public ᛲᛳᛶᲁ(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛷᛸᛶᲁ;->ᲇᲇᲇᛱ:Lyyds/ᛲᛱᛶᛸ;

    .line 2
    .line 3
    invoke-static {p0}, Lyyds/ᛶᛶᲁᲇ;->ᛷᲈᲈᲁ(Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p1}, Lyyds/ᛲᲇᲁᛳ;->ᛷᲈᲈᲁ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1, p0}, Lyyds/ᛲᛸᲈᲈ;->ᛲᛳᛶᲁ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final ᲇᲈᛵᛷ()Lyyds/ᛶᲁᛵᛷ;
    .locals 1

    .line 1
    iget-object p0, p0, Lyyds/ᛷᛸᛶᲁ;->ᲇᲇᲇᛱ:Lyyds/ᛲᛱᛶᛸ;

    .line 2
    .line 3
    instance-of v0, p0, Lyyds/ᛶᲁᛵᛷ;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, Lyyds/ᛶᲁᛵᛷ;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method
