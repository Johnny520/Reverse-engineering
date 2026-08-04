.class public final Lyyds/ᲁᛸᲁ;
.super Lyyds/ᛴᛱᲈᛷ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᲇᲇᲇᛱ:Lyyds/ᛳᲀᛱᲀ;


# direct methods
.method public constructor <init>(Lyyds/ᛳᲀᛱᲀ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lyyds/ᲀᛶᲁᛵ;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᲁᛸᲁ;->ᲇᲇᲇᛱ:Lyyds/ᛳᲀᛱᲀ;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ(Ljava/lang/String;Lyyds/ᛷᛸᛸᛳ;Ljava/lang/Object;Lyyds/ᛸᛴᛷᲇ;)V
    .locals 2

    .line 1
    iget-object p2, p0, Lyyds/ᲁᛸᲁ;->ᲇᲇᲇᛱ:Lyyds/ᛳᲀᛱᲀ;

    .line 2
    .line 3
    iget-object p2, p2, Lyyds/ᛳᲀᛱᲀ;->ᛲᲈᲁ:Ljava/util/List;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p3, p4}, Lyyds/ᛴᛱᲈᛷ;->ᛷᲈᲈᲁ(Ljava/lang/String;Ljava/lang/Object;Lyyds/ᛸᛴᛷᲇ;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x1

    .line 17
    if-ne v0, v1, :cond_1

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    check-cast p2, Ljava/lang/Integer;

    .line 25
    .line 26
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    invoke-virtual {p0, p2, p1, p3, p4}, Lyyds/ᲀᛶᲁᛵ;->ᲀᛲᛳᲀ(ILjava/lang/String;Ljava/lang/Object;Lyyds/ᛸᛴᛷᲇ;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_1
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, Ljava/lang/Integer;

    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    invoke-virtual {p0, v0, p1, p3, p4}, Lyyds/ᲀᛶᲁᛵ;->ᲀᛲᛳᲀ(ILjava/lang/String;Ljava/lang/Object;Lyyds/ᛸᛴᛷᲇ;)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    :goto_1
    return-void
.end method

.method public final ᛵᛸᛸᛷ()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲁᛸᲁ;->ᲇᲇᲇᛱ:Lyyds/ᛳᲀᛱᲀ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lyyds/ᛳᲀᛱᲀ;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final ᛶᛷᛲᲁ()Z
    .locals 1

    .line 1
    iget-object p0, p0, Lyyds/ᲁᛸᲁ;->ᲇᲇᲇᛱ:Lyyds/ᛳᲀᛱᲀ;

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᛳᲀᛱᲀ;->ᛲᲈᲁ:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    const/4 v0, 0x1

    .line 10
    if-ne p0, v0, :cond_0

    .line 11
    .line 12
    return v0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method
