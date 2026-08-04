.class public final Lyyds/ᛴᲀᲁᛸ;
.super Lyyds/ᛱᛷᛸᛲ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛲᲇᲁᛴ;


# instance fields
.field public ᛲᛴᛳᛲ:I

.field public final synthetic ᛶᛷᛲᲁ:Ljava/lang/Class;

.field public synthetic ᲇᲇᲇᛱ:Ljava/lang/Object;

.field public ᲇᲈᛵᛷ:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Lyyds/ᛲᛱᛶᛸ;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyyds/ᛴᲀᲁᛸ;->ᛶᛷᛲᲁ:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lyyds/ᛱᛷᛸᛲ;-><init>(Lyyds/ᛲᛱᛶᛸ;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lyyds/ᛴᲀᲁᛸ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lyyds/ᛸᛲᲇᛶ;

    .line 4
    .line 5
    iget v1, p0, Lyyds/ᛴᲀᲁᛸ;->ᛲᛴᛳᛲ:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, Lyyds/ᛴᲀᲁᛸ;->ᲇᲈᛵᛷ:Ljava/lang/Class;

    .line 13
    .line 14
    invoke-static {p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_0
    const-wide p0, -0x38ca5e68a836eL

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const/4 p0, 0x0

    .line 31
    return-object p0

    .line 32
    :cond_1
    invoke-static {p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lyyds/ᛴᲀᲁᛸ;->ᛶᛷᛲᲁ:Ljava/lang/Class;

    .line 36
    .line 37
    move-object v1, p1

    .line 38
    :goto_0
    sget-object p1, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 39
    .line 40
    if-eqz v1, :cond_5

    .line 41
    .line 42
    const-class v3, Ljava/lang/Object;

    .line 43
    .line 44
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-nez v3, :cond_5

    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    const-wide v4, -0x38c8ee68a836eL

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    invoke-static {v3}, Lyyds/ᲀᲀᛷᛸ;->ᛵᛶᛲᲀ([Ljava/lang/Object;)Lyyds/ᛵᲈᛴᛷ;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    iput-object v0, p0, Lyyds/ᛴᲀᲁᛸ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 67
    .line 68
    iput-object v1, p0, Lyyds/ᛴᲀᲁᛸ;->ᲇᲈᛵᛷ:Ljava/lang/Class;

    .line 69
    .line 70
    iput v2, p0, Lyyds/ᛴᲀᲁᛸ;->ᛲᛴᛳᛲ:I

    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    invoke-interface {v3}, Lyyds/ᛵᲈᛴᛷ;->iterator()Ljava/util/Iterator;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    sget-object v5, Lyyds/ᛸᛴᲁᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛸᛴᲁᛴ;

    .line 84
    .line 85
    if-nez v4, :cond_2

    .line 86
    .line 87
    move-object v3, p1

    .line 88
    goto :goto_1

    .line 89
    :cond_2
    iput-object v3, v0, Lyyds/ᛸᛲᲇᛶ;->ᛲᛴᛳᛲ:Ljava/util/Iterator;

    .line 90
    .line 91
    const/4 v3, 0x2

    .line 92
    iput v3, v0, Lyyds/ᛸᛲᲇᛶ;->ᲀᛲᛳᲀ:I

    .line 93
    .line 94
    iput-object p0, v0, Lyyds/ᛸᛲᲇᛶ;->ᲇᲇᲇᛱ:Lyyds/ᛲᛱᛶᛸ;

    .line 95
    .line 96
    move-object v3, v5

    .line 97
    :goto_1
    if-ne v3, v5, :cond_3

    .line 98
    .line 99
    move-object p1, v3

    .line 100
    :cond_3
    if-ne p1, v5, :cond_4

    .line 101
    .line 102
    return-object v5

    .line 103
    :cond_4
    :goto_2
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    goto :goto_0

    .line 108
    :cond_5
    return-object p1
.end method

.method public final ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;
    .locals 1

    .line 1
    new-instance v0, Lyyds/ᛴᲀᲁᛸ;

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᛴᲀᲁᛸ;->ᛶᛷᛲᲁ:Ljava/lang/Class;

    .line 4
    .line 5
    invoke-direct {v0, p0, p2}, Lyyds/ᛴᲀᲁᛸ;-><init>(Ljava/lang/Class;Lyyds/ᛲᛱᛶᛸ;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lyyds/ᛴᲀᲁᛸ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final ᛶᛷᛲᲁ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lyyds/ᛸᛲᲇᛶ;

    .line 2
    .line 3
    check-cast p2, Lyyds/ᛲᛱᛶᛸ;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lyyds/ᛴᲀᲁᛸ;->ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lyyds/ᛴᲀᲁᛸ;

    .line 10
    .line 11
    sget-object p1, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lyyds/ᛴᲀᲁᛸ;->ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
