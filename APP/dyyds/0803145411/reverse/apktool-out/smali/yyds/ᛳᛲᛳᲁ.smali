.class public final Lyyds/ᛳᛲᛳᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/util/Iterator;
.implements Lyyds/ᛳᛱᲇᛴ;


# instance fields
.field public final synthetic ᛱᲈᲁ:Lyyds/ᛶᲀᛴᛵ;

.field public ᛲᛴᛳᛲ:I

.field public ᛶᛷᛲᲁ:I

.field public ᲀᛲᛳᲀ:I

.field public ᲇᲇᲇᛱ:Lyyds/ᲈᲈᲀᲈ;

.field public ᲇᲈᛵᛷ:I


# direct methods
.method public constructor <init>(Lyyds/ᛶᲀᛴᛵ;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛳᛲᛳᲁ;->ᛱᲈᲁ:Lyyds/ᛶᲀᛴᛵ;

    .line 5
    .line 6
    const/4 v0, -0x1

    .line 7
    iput v0, p0, Lyyds/ᛳᛲᛳᲁ;->ᲀᛲᛳᲀ:I

    .line 8
    .line 9
    iget-object p1, p1, Lyyds/ᛶᲀᛴᛵ;->ᛲᲈᲁ:Ljava/lang/CharSequence;

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-static {v0, v0, p1}, Lyyds/ᛳᛵᲀ;->ᲀᛲᛳᲀ(III)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    iput p1, p0, Lyyds/ᛳᛲᛳᲁ;->ᲇᲈᛵᛷ:I

    .line 21
    .line 22
    iput p1, p0, Lyyds/ᛳᛲᛳᲁ;->ᛲᛴᛳᛲ:I

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    .line 1
    iget v0, p0, Lyyds/ᛳᛲᛳᲁ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Lyyds/ᛳᛲᛳᲁ;->ᛲᲈᲁ()V

    .line 7
    .line 8
    .line 9
    :cond_0
    iget p0, p0, Lyyds/ᛳᛲᛳᲁ;->ᲀᛲᛳᲀ:I

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    if-ne p0, v0, :cond_1

    .line 13
    .line 14
    return v0

    .line 15
    :cond_1
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lyyds/ᛳᛲᛳᲁ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Lyyds/ᛳᛲᛳᲁ;->ᛲᲈᲁ()V

    .line 7
    .line 8
    .line 9
    :cond_0
    iget v0, p0, Lyyds/ᛳᛲᛳᲁ;->ᲀᛲᛳᲀ:I

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Lyyds/ᛳᛲᛳᲁ;->ᲇᲇᲇᛱ:Lyyds/ᲈᲈᲀᲈ;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    iput-object v2, p0, Lyyds/ᛳᛲᛳᲁ;->ᲇᲇᲇᛱ:Lyyds/ᲈᲈᲀᲈ;

    .line 17
    .line 18
    iput v1, p0, Lyyds/ᛳᛲᛳᲁ;->ᲀᛲᛳᲀ:I

    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_1
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 22
    .line 23
    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 24
    .line 25
    .line 26
    throw p0
.end method

.method public final remove()V
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "Operation is not supported for read-only collection"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final ᛲᲈᲁ()V
    .locals 8

    .line 1
    iget-object v0, p0, Lyyds/ᛳᛲᛳᲁ;->ᛱᲈᲁ:Lyyds/ᛶᲀᛴᛵ;

    .line 2
    .line 3
    iget-object v1, v0, Lyyds/ᛶᲀᛴᛵ;->ᛲᲈᲁ:Ljava/lang/CharSequence;

    .line 4
    .line 5
    iget v2, p0, Lyyds/ᛳᛲᛳᲁ;->ᛲᛴᛳᛲ:I

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-gez v2, :cond_0

    .line 9
    .line 10
    iput v3, p0, Lyyds/ᛳᛲᛳᲁ;->ᲀᛲᛳᲀ:I

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    iput-object v0, p0, Lyyds/ᛳᛲᛳᲁ;->ᲇᲇᲇᛱ:Lyyds/ᲈᲈᲀᲈ;

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget v4, v0, Lyyds/ᛶᲀᛴᛵ;->ᛵᛸᛸᛷ:I

    .line 17
    .line 18
    const/4 v5, -0x1

    .line 19
    const/4 v6, 0x1

    .line 20
    if-lez v4, :cond_1

    .line 21
    .line 22
    iget v7, p0, Lyyds/ᛳᛲᛳᲁ;->ᛶᛷᛲᲁ:I

    .line 23
    .line 24
    add-int/2addr v7, v6

    .line 25
    iput v7, p0, Lyyds/ᛳᛲᛳᲁ;->ᛶᛷᛲᲁ:I

    .line 26
    .line 27
    if-ge v7, v4, :cond_2

    .line 28
    .line 29
    :cond_1
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-le v2, v4, :cond_3

    .line 34
    .line 35
    :cond_2
    new-instance v0, Lyyds/ᲈᲈᲀᲈ;

    .line 36
    .line 37
    iget v2, p0, Lyyds/ᛳᛲᛳᲁ;->ᲇᲈᛵᛷ:I

    .line 38
    .line 39
    invoke-static {v1}, Lyyds/ᛲᲇᛸᲇ;->ᛵᲀᛵᛸ(Ljava/lang/CharSequence;)I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    invoke-direct {v0, v2, v1, v6}, Lyyds/ᲇᲁᲁᲁ;-><init>(III)V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, Lyyds/ᛳᛲᛳᲁ;->ᲇᲇᲇᛱ:Lyyds/ᲈᲈᲀᲈ;

    .line 47
    .line 48
    iput v5, p0, Lyyds/ᛳᛲᛳᲁ;->ᛲᛴᛳᛲ:I

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_3
    iget-object v0, v0, Lyyds/ᛶᲀᛴᛵ;->ᲀᛲᛳᲀ:Lyyds/ᛲᲇᲁᛴ;

    .line 52
    .line 53
    iget v2, p0, Lyyds/ᛳᛲᛳᲁ;->ᛲᛴᛳᛲ:I

    .line 54
    .line 55
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-interface {v0, v1, v2}, Lyyds/ᛲᲇᲁᛴ;->ᛶᛷᛲᲁ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    check-cast v0, Lkotlin/Pair;

    .line 64
    .line 65
    if-nez v0, :cond_4

    .line 66
    .line 67
    new-instance v0, Lyyds/ᲈᲈᲀᲈ;

    .line 68
    .line 69
    iget v2, p0, Lyyds/ᛳᛲᛳᲁ;->ᲇᲈᛵᛷ:I

    .line 70
    .line 71
    invoke-static {v1}, Lyyds/ᛲᲇᛸᲇ;->ᛵᲀᛵᛸ(Ljava/lang/CharSequence;)I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    invoke-direct {v0, v2, v1, v6}, Lyyds/ᲇᲁᲁᲁ;-><init>(III)V

    .line 76
    .line 77
    .line 78
    iput-object v0, p0, Lyyds/ᛳᛲᛳᲁ;->ᲇᲇᲇᛱ:Lyyds/ᲈᲈᲀᲈ;

    .line 79
    .line 80
    iput v5, p0, Lyyds/ᛳᛲᛳᲁ;->ᛲᛴᛳᛲ:I

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_4
    invoke-virtual {v0}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    check-cast v1, Ljava/lang/Number;

    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    invoke-virtual {v0}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    check-cast v0, Ljava/lang/Number;

    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    iget v2, p0, Lyyds/ᛳᛲᛳᲁ;->ᲇᲈᛵᛷ:I

    .line 104
    .line 105
    invoke-static {v2, v1}, Lyyds/ᛳᛵᲀ;->ᛷᛵᲇᲀ(II)Lyyds/ᲈᲈᲀᲈ;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    iput-object v2, p0, Lyyds/ᛳᛲᛳᲁ;->ᲇᲇᲇᛱ:Lyyds/ᲈᲈᲀᲈ;

    .line 110
    .line 111
    add-int/2addr v1, v0

    .line 112
    iput v1, p0, Lyyds/ᛳᛲᛳᲁ;->ᲇᲈᛵᛷ:I

    .line 113
    .line 114
    if-nez v0, :cond_5

    .line 115
    .line 116
    move v3, v6

    .line 117
    :cond_5
    add-int/2addr v1, v3

    .line 118
    iput v1, p0, Lyyds/ᛳᛲᛳᲁ;->ᛲᛴᛳᛲ:I

    .line 119
    .line 120
    :goto_0
    iput v6, p0, Lyyds/ᛳᛲᛳᲁ;->ᲀᛲᛳᲀ:I

    .line 121
    .line 122
    return-void
.end method
