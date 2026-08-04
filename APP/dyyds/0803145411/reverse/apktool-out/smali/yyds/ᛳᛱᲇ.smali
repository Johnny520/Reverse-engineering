.class public final Lyyds/ᛳᛱᲇ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛲᲈᲁ:Lyyds/ᛶᛲᛷ;


# virtual methods
.method public final ᛲᲈᲁ(Ljava/lang/String;[B)V
    .locals 8

    .line 1
    array-length v0, p2

    .line 2
    array-length v1, p2

    .line 3
    int-to-long v2, v1

    .line 4
    const-wide/16 v4, 0x0

    .line 5
    .line 6
    int-to-long v6, v0

    .line 7
    invoke-static/range {v2 .. v7}, Lyyds/ᛶᲁᛵᛲ;->ᛲᲈᲁ(JJJ)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lyyds/ᛳᛶᛳᲁ;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v1, v2, v0, p2}, Lyyds/ᛳᛶᛳᲁ;-><init>(Lyyds/ᛴᛲᲁᲈ;I[B)V

    .line 14
    .line 15
    .line 16
    new-instance p2, Ljava/util/ArrayList;

    .line 17
    .line 18
    const/16 v0, 0x14

    .line 19
    .line 20
    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 21
    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    new-array v0, v0, [Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    check-cast p2, [Ljava/lang/String;

    .line 31
    .line 32
    new-instance v0, Lyyds/ᛷᲀᲇᲈ;

    .line 33
    .line 34
    invoke-direct {v0}, Lyyds/ᛷᲀᲇᲈ;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p1}, Lyyds/ᛷᲀᲇᲈ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const-string p1, "PUT"

    .line 41
    .line 42
    invoke-virtual {v0, p1, v1}, Lyyds/ᛷᲀᲇᲈ;->ᲀᛲᛳᲀ(Ljava/lang/String;Lyyds/ᛳᛸᲀᛵ;)V

    .line 43
    .line 44
    .line 45
    new-instance p1, Lyyds/ᲀᲈᛷᛷ;

    .line 46
    .line 47
    const/4 v1, 0x2

    .line 48
    invoke-direct {p1, v1}, Lyyds/ᲀᲈᛷᛷ;-><init>(I)V

    .line 49
    .line 50
    .line 51
    iget-object v1, p1, Lyyds/ᲀᲈᛷᛷ;->ᛲᲈᲁ:Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-static {v1, p2}, Lyyds/ᛶᲁᛶᲁ;->ᛵᲀᲈᛴ(Ljava/util/AbstractCollection;[Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iput-object p1, v0, Lyyds/ᛷᲀᲇᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 57
    .line 58
    new-instance p1, Lyyds/ᲀᲁᲁ;

    .line 59
    .line 60
    invoke-direct {p1, v0}, Lyyds/ᲀᲁᲁ;-><init>(Lyyds/ᛷᲀᲇᲈ;)V

    .line 61
    .line 62
    .line 63
    iget-object p0, p0, Lyyds/ᛳᛱᲇ;->ᛲᲈᲁ:Lyyds/ᛶᛲᛷ;

    .line 64
    .line 65
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    new-instance p2, Lyyds/ᲈᲀᛱᛷ;

    .line 69
    .line 70
    invoke-direct {p2, p0, p1}, Lyyds/ᲈᲀᛱᛷ;-><init>(Lyyds/ᛶᛲᛷ;Lyyds/ᲀᲁᲁ;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p2}, Lyyds/ᲈᲀᛱᛷ;->ᲇᲈᛵᛷ()Lyyds/ᛴᛴᛷᲁ;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-static {p0}, Lyyds/ᛷᛸ;->ᛲᛲᲈᲈ(Lyyds/ᛴᛴᛷᲁ;)V

    .line 78
    .line 79
    .line 80
    return-void
.end method
