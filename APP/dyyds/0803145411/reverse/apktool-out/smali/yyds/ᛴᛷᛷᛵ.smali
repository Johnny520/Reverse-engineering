.class public final Lyyds/ᛴᛷᛷᛵ;
.super Lyyds/ᛸᲀᛷᛱ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛲᲇᲁᛴ;


# instance fields
.field public final synthetic ᛱᛳᲇ:[Lyyds/ᲈᛱᲀᛸ;

.field public ᛱᲈᲁ:Lyyds/ᛳᲀᛸᛸ;

.field public ᛲᛲᲈᲈ:I

.field public ᛲᛳᛶᲁ:Lyyds/ᲈᛶᛷᲀ;

.field public final synthetic ᛳᲁᲁᲇ:Lyyds/ᛳᲀᛸᛸ;

.field public ᛶᛷᛲᲁ:[Lyyds/ᲈᛱᲀᛸ;

.field public ᛷᛲᲈᛱ:I

.field public ᛷᛵᲇᲀ:I

.field public ᛷᲈᲈᲁ:I

.field public final synthetic ᲇᛱᛲ:Lyyds/ᲈᛶᛷᲀ;


# direct methods
.method public constructor <init>([Lyyds/ᲈᛱᲀᛸ;Lyyds/ᛳᲀᛸᛸ;Lyyds/ᲈᛶᛷᲀ;Lyyds/ᛲᛱᛶᛸ;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyyds/ᛴᛷᛷᛵ;->ᛱᛳᲇ:[Lyyds/ᲈᛱᲀᛸ;

    .line 2
    .line 3
    iput-object p2, p0, Lyyds/ᛴᛷᛷᛵ;->ᛳᲁᲁᲇ:Lyyds/ᛳᲀᛸᛸ;

    .line 4
    .line 5
    iput-object p3, p0, Lyyds/ᛴᛷᛷᛵ;->ᲇᛱᛲ:Lyyds/ᲈᛶᛷᲀ;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lyyds/ᛸᲀᛷᛱ;-><init>(ILyyds/ᛲᛱᛶᛸ;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lyyds/ᛴᛷᛷᛵ;->ᛲᛲᲈᲈ:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x1

    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    if-eq v0, v3, :cond_0

    .line 9
    .line 10
    if-ne v0, v2, :cond_1

    .line 11
    .line 12
    :cond_0
    iget v0, p0, Lyyds/ᛴᛷᛷᛵ;->ᛷᛵᲇᲀ:I

    .line 13
    .line 14
    iget v4, p0, Lyyds/ᛴᛷᛷᛵ;->ᛷᛲᲈᛱ:I

    .line 15
    .line 16
    iget v5, p0, Lyyds/ᛴᛷᛷᛵ;->ᛷᲈᲈᲁ:I

    .line 17
    .line 18
    iget-object v6, p0, Lyyds/ᛴᛷᛷᛵ;->ᛲᛳᛶᲁ:Lyyds/ᲈᛶᛷᲀ;

    .line 19
    .line 20
    iget-object v7, p0, Lyyds/ᛴᛷᛷᛵ;->ᛱᲈᲁ:Lyyds/ᛳᲀᛸᛸ;

    .line 21
    .line 22
    iget-object v8, p0, Lyyds/ᛴᛷᛷᛵ;->ᛶᛷᛲᲁ:[Lyyds/ᲈᛱᲀᛸ;

    .line 23
    .line 24
    invoke-static {p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 29
    .line 30
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-object v1

    .line 34
    :cond_2
    invoke-static {p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, Lyyds/ᛴᛷᛷᛵ;->ᛱᛳᲇ:[Lyyds/ᲈᛱᲀᛸ;

    .line 38
    .line 39
    array-length v0, p1

    .line 40
    const/4 v4, 0x0

    .line 41
    iget-object v5, p0, Lyyds/ᛴᛷᛷᛵ;->ᛳᲁᲁᲇ:Lyyds/ᛳᲀᛸᛸ;

    .line 42
    .line 43
    iget-object v6, p0, Lyyds/ᛴᛷᛷᛵ;->ᲇᛱᛲ:Lyyds/ᲈᛶᛷᲀ;

    .line 44
    .line 45
    move-object v8, p1

    .line 46
    move p1, v4

    .line 47
    move-object v7, v5

    .line 48
    :goto_0
    if-ge v4, v0, :cond_7

    .line 49
    .line 50
    aget-object v5, v8, v4

    .line 51
    .line 52
    add-int/lit8 v9, p1, 0x1

    .line 53
    .line 54
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    if-eqz v5, :cond_6

    .line 59
    .line 60
    sget-object v10, Lyyds/ᛸᛴᲁᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛸᛴᲁᛴ;

    .line 61
    .line 62
    if-eq v5, v3, :cond_5

    .line 63
    .line 64
    if-ne v5, v2, :cond_4

    .line 65
    .line 66
    iput-object v8, p0, Lyyds/ᛴᛷᛷᛵ;->ᛶᛷᛲᲁ:[Lyyds/ᲈᛱᲀᛸ;

    .line 67
    .line 68
    iput-object v7, p0, Lyyds/ᛴᛷᛷᛵ;->ᛱᲈᲁ:Lyyds/ᛳᲀᛸᛸ;

    .line 69
    .line 70
    iput-object v6, p0, Lyyds/ᛴᛷᛷᛵ;->ᛲᛳᛶᲁ:Lyyds/ᲈᛶᛷᲀ;

    .line 71
    .line 72
    iput v9, p0, Lyyds/ᛴᛷᛷᛵ;->ᛷᲈᲈᲁ:I

    .line 73
    .line 74
    iput v4, p0, Lyyds/ᛴᛷᛷᛵ;->ᛷᛲᲈᛱ:I

    .line 75
    .line 76
    iput v0, p0, Lyyds/ᛴᛷᛷᛵ;->ᛷᛵᲇᲀ:I

    .line 77
    .line 78
    iput v2, p0, Lyyds/ᛴᛷᛷᛵ;->ᛲᛲᲈᲈ:I

    .line 79
    .line 80
    invoke-virtual {v7, v6, p1, p0}, Lyyds/ᛳᲀᛸᛸ;->ᛲᛴᛳᛲ(Lyyds/ᲈᛶᛷᲀ;ILyyds/ᛶᛴᲀᛲ;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    if-ne p1, v10, :cond_3

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_3
    move v5, v9

    .line 88
    :goto_1
    move p1, v5

    .line 89
    goto :goto_3

    .line 90
    :cond_4
    invoke-static {}, Lyyds/ᛱᛸᛶᛲ;->ᛷᲈᲈᲁ()V

    .line 91
    .line 92
    .line 93
    return-object v1

    .line 94
    :cond_5
    iput-object v8, p0, Lyyds/ᛴᛷᛷᛵ;->ᛶᛷᛲᲁ:[Lyyds/ᲈᛱᲀᛸ;

    .line 95
    .line 96
    iput-object v7, p0, Lyyds/ᛴᛷᛷᛵ;->ᛱᲈᲁ:Lyyds/ᛳᲀᛸᛸ;

    .line 97
    .line 98
    iput-object v6, p0, Lyyds/ᛴᛷᛷᛵ;->ᛲᛳᛶᲁ:Lyyds/ᲈᛶᛷᲀ;

    .line 99
    .line 100
    iput v9, p0, Lyyds/ᛴᛷᛷᛵ;->ᛷᲈᲈᲁ:I

    .line 101
    .line 102
    iput v4, p0, Lyyds/ᛴᛷᛷᛵ;->ᛷᛲᲈᛱ:I

    .line 103
    .line 104
    iput v0, p0, Lyyds/ᛴᛷᛷᛵ;->ᛷᛵᲇᲀ:I

    .line 105
    .line 106
    iput v3, p0, Lyyds/ᛴᛷᛷᛵ;->ᛲᛲᲈᲈ:I

    .line 107
    .line 108
    invoke-virtual {v7, v6, p1, p0}, Lyyds/ᛳᲀᛸᛸ;->ᲇᲈᛵᛷ(Lyyds/ᲈᛶᛷᲀ;ILyyds/ᛶᛴᲀᛲ;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    if-ne p1, v10, :cond_3

    .line 113
    .line 114
    :goto_2
    return-object v10

    .line 115
    :cond_6
    move p1, v9

    .line 116
    :goto_3
    add-int/2addr v4, v3

    .line 117
    goto :goto_0

    .line 118
    :cond_7
    sget-object p0, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 119
    .line 120
    return-object p0
.end method

.method public final ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;
    .locals 2

    .line 1
    new-instance p1, Lyyds/ᛴᛷᛷᛵ;

    .line 2
    .line 3
    iget-object v0, p0, Lyyds/ᛴᛷᛷᛵ;->ᛳᲁᲁᲇ:Lyyds/ᛳᲀᛸᛸ;

    .line 4
    .line 5
    iget-object v1, p0, Lyyds/ᛴᛷᛷᛵ;->ᲇᛱᛲ:Lyyds/ᲈᛶᛷᲀ;

    .line 6
    .line 7
    iget-object p0, p0, Lyyds/ᛴᛷᛷᛵ;->ᛱᛳᲇ:[Lyyds/ᲈᛱᲀᛸ;

    .line 8
    .line 9
    invoke-direct {p1, p0, v0, v1, p2}, Lyyds/ᛴᛷᛷᛵ;-><init>([Lyyds/ᲈᛱᲀᛸ;Lyyds/ᛳᲀᛸᛸ;Lyyds/ᲈᛶᛷᲀ;Lyyds/ᛲᛱᛶᛸ;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final ᛶᛷᛲᲁ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lyyds/ᛱᲇᛶᛵ;

    .line 2
    .line 3
    check-cast p2, Lyyds/ᛲᛱᛶᛸ;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lyyds/ᛴᛷᛷᛵ;->ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lyyds/ᛴᛷᛷᛵ;

    .line 10
    .line 11
    sget-object p1, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lyyds/ᛴᛷᛷᛵ;->ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
