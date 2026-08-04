.class public final Lyyds/ᛳᛸᲁᲈ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛳᛵᛳ;


# instance fields
.field public final ᛲᛴᛳᛲ:Lyyds/ᛲᲇᲁᛴ;

.field public final ᲀᛲᛳᲀ:Lyyds/ᛲᲈᲁᛲ;

.field public final ᲇᲇᲇᛱ:Lyyds/ᛱᛲᛶᛱ;

.field public final ᲇᲈᛵᛷ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lyyds/ᛲᲈᲁᛲ;Ljava/lang/String;Lyyds/ᛲᲇᲁᛴ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛳᛸᲁᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛲᲈᲁᛲ;

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᛳᛸᲁᲈ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lyyds/ᛳᛸᲁᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛲᲇᲁᛴ;

    .line 9
    .line 10
    new-instance p1, Lyyds/ᛵᲇᛵᲇ;

    .line 11
    .line 12
    const/16 p2, 0x10

    .line 13
    .line 14
    invoke-direct {p1, p2, p0}, Lyyds/ᛵᲇᛵᲇ;-><init>(ILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    new-instance p2, Lyyds/ᛱᛲᛶᛱ;

    .line 18
    .line 19
    invoke-direct {p2, p1}, Lyyds/ᛱᛲᛶᛱ;-><init>(Lyyds/ᲁᛶᲁᲀ;)V

    .line 20
    .line 21
    .line 22
    iput-object p2, p0, Lyyds/ᛳᛸᲁᲈ;->ᲇᲇᲇᛱ:Lyyds/ᛱᛲᛶᛱ;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 1
    iget-object p0, p0, Lyyds/ᛳᛸᲁᲈ;->ᲇᲇᲇᛱ:Lyyds/ᛱᛲᛶᛱ;

    .line 2
    .line 3
    iget-object v0, p0, Lyyds/ᛱᛲᛶᛱ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 4
    .line 5
    sget-object v1, Lyyds/ᛷᛶᲇᲁ;->ᛶᛷᛲᲁ:Lyyds/ᛷᛶᲇᲁ;

    .line 6
    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lyyds/ᛱᛲᛶᛱ;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Lyyds/ᛱᛵᛷ;

    .line 14
    .line 15
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final ᛲᛶᛱᲈ(ZLyyds/ᛲᲇᲁᛴ;Lyyds/ᛶᛴᲀᛲ;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object p1, p3, Lyyds/ᛶᛴᲀᛲ;->ᲇᲈᛵᛷ:Lyyds/ᲁᛴᛲ;

    .line 2
    .line 3
    sget-object v0, Lyyds/ᛶᲇᛱᛱ;->ᲇᲈᛵᛷ:Lyyds/ᛷᛶᲇᲁ;

    .line 4
    .line 5
    invoke-interface {p1, v0}, Lyyds/ᲁᛴᛲ;->ᛷᛸᲇᛶ(Lyyds/ᲁᛸᛲᲁ;)Lyyds/ᲁᛶᛱᛴ;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lyyds/ᛶᲇᛱᛱ;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iget-object p1, p1, Lyyds/ᛶᲇᛱᛱ;->ᲀᛲᛳᲀ:Lyyds/ᛶᛲᛳᛶ;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object p1, v0

    .line 18
    :goto_0
    if-eqz p1, :cond_1

    .line 19
    .line 20
    invoke-interface {p2, p1, p3}, Lyyds/ᛲᲇᲁᛴ;->ᛶᛷᛲᲁ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0

    .line 25
    :cond_1
    new-instance p1, Lyyds/ᛶᛲᛳᛶ;

    .line 26
    .line 27
    iget-object v1, p0, Lyyds/ᛳᛸᲁᲈ;->ᲇᲇᲇᛱ:Lyyds/ᛱᛲᛶᛱ;

    .line 28
    .line 29
    invoke-virtual {v1}, Lyyds/ᛱᛲᛶᛱ;->getValue()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Lyyds/ᛱᛵᛷ;

    .line 34
    .line 35
    iget-object p0, p0, Lyyds/ᛳᛸᲁᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛲᲇᲁᛴ;

    .line 36
    .line 37
    invoke-direct {p1, p0, v1}, Lyyds/ᛶᛲᛳᛶ;-><init>(Lyyds/ᛲᲇᲁᛴ;Lyyds/ᛱᛵᛷ;)V

    .line 38
    .line 39
    .line 40
    new-instance p0, Lyyds/ᛶᲇᛱᛱ;

    .line 41
    .line 42
    invoke-direct {p0, p1}, Lyyds/ᛶᲇᛱᛱ;-><init>(Lyyds/ᛶᛲᛳᛶ;)V

    .line 43
    .line 44
    .line 45
    new-instance v1, Lyyds/ᛱᲁᛴᛴ;

    .line 46
    .line 47
    const/16 v2, 0xa

    .line 48
    .line 49
    invoke-direct {v1, p2, p1, v0, v2}, Lyyds/ᛱᲁᛴᛴ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;I)V

    .line 50
    .line 51
    .line 52
    invoke-static {p0, v1, p3}, Lyyds/ᲀᲀᛸᛱ;->ᛶᛳᛶᛵ(Lyyds/ᲁᛴᛲ;Lyyds/ᛲᲇᲁᛴ;Lyyds/ᛲᛱᛶᛸ;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0
.end method
