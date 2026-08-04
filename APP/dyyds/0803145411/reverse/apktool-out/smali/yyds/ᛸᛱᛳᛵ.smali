.class public final Lyyds/ᛸᛱᛳᛵ;
.super Lyyds/ᛴᛵᛲᲇ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᲇᲇᲇᛱ:I


# direct methods
.method public constructor <init>(Lyyds/ᛳᛴᲀᛷ;Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lyyds/ᛴᛵᛲᲇ;-><init>(Lyyds/ᛳᛴᲀᛷ;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lyyds/ᛸᛱᛳᛵ;->ᲇᲇᲇᛱ:I

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lyyds/ᛴᛵᛲᲇ;->ᛲᛴᛳᛲ:Z

    .line 3
    .line 4
    return-void
.end method

.method public final getColumnCount()I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyyds/ᛴᛵᛲᲇ;->ᛲᲈᲁ()V

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    return p0
.end method

.method public final getColumnName(I)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyyds/ᛴᛵᛲᲇ;->ᛲᲈᲁ()V

    .line 2
    .line 3
    .line 4
    const/16 p0, 0x15

    .line 5
    .line 6
    const-string p1, "no row"

    .line 7
    .line 8
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᲀᛲᛲᲇ(ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public final getLong(I)J
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyyds/ᛴᛵᛲᲇ;->ᛲᲈᲁ()V

    .line 2
    .line 3
    .line 4
    const/16 p0, 0x15

    .line 5
    .line 6
    const-string p1, "no row"

    .line 7
    .line 8
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᲀᛲᛲᲇ(ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public final isNull(I)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyyds/ᛴᛵᛲᲇ;->ᛲᲈᲁ()V

    .line 2
    .line 3
    .line 4
    const/16 p0, 0x15

    .line 5
    .line 6
    const-string p1, "no row"

    .line 7
    .line 8
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᲀᛲᛲᲇ(ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public final ᛱᲈᲁ(I)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyyds/ᛴᛵᛲᲇ;->ᛲᲈᲁ()V

    .line 2
    .line 3
    .line 4
    const/16 p0, 0x15

    .line 5
    .line 6
    const-string p1, "no row"

    .line 7
    .line 8
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᲀᛲᛲᲇ(ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public final ᛵᛸᛸᛷ(I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyyds/ᛴᛵᛲᲇ;->ᛲᲈᲁ()V

    .line 2
    .line 3
    .line 4
    const/16 p0, 0x19

    .line 5
    .line 6
    const-string p1, "column index out of range"

    .line 7
    .line 8
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᲀᛲᛲᲇ(ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public final ᛵᲀᛵᛸ()Z
    .locals 6

    .line 1
    iget v0, p0, Lyyds/ᛸᛱᛳᛵ;->ᲇᲇᲇᛱ:I

    .line 2
    .line 3
    invoke-static {v0}, Lyyds/ᲀᲁᲈᲇ;->ᛶᛸᲀᲁ(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    iget-object p0, p0, Lyyds/ᛴᛵᛲᲇ;->ᲀᛲᛳᲀ:Lyyds/ᛳᛴᲀᛷ;

    .line 9
    .line 10
    if-eqz v0, :cond_6

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    if-eq v0, v2, :cond_5

    .line 14
    .line 15
    const/4 v2, 0x2

    .line 16
    if-eq v0, v2, :cond_4

    .line 17
    .line 18
    const/4 v2, 0x3

    .line 19
    if-eq v0, v2, :cond_3

    .line 20
    .line 21
    const/4 v2, 0x4

    .line 22
    if-ne v0, v2, :cond_2

    .line 23
    .line 24
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget-object v2, p0, Lyyds/ᛳᛴᲀᛷ;->ᲀᛲᛳᲀ:Landroid/database/sqlite/SQLiteDatabase;

    .line 29
    .line 30
    sget-object v3, Lyyds/ᛳᛴᲀᛷ;->ᲇᲇᲇᛱ:Lyyds/ᛴᛳᲈᛵ;

    .line 31
    .line 32
    invoke-interface {v3}, Lyyds/ᛴᛳᲈᛵ;->getValue()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    check-cast v4, Ljava/lang/reflect/Method;

    .line 37
    .line 38
    if-eqz v4, :cond_1

    .line 39
    .line 40
    sget-object v4, Lyyds/ᛳᛴᲀᛷ;->ᛲᛴᛳᛲ:Lyyds/ᛴᛳᲈᛵ;

    .line 41
    .line 42
    invoke-interface {v4}, Lyyds/ᛴᛳᲈᛵ;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    check-cast v5, Ljava/lang/reflect/Method;

    .line 47
    .line 48
    if-eqz v5, :cond_1

    .line 49
    .line 50
    invoke-interface {v3}, Lyyds/ᛴᛳᲈᛵ;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    check-cast p0, Ljava/lang/reflect/Method;

    .line 55
    .line 56
    invoke-interface {v4}, Lyyds/ᛴᛳᲈᛵ;->getValue()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    check-cast v3, Ljava/lang/reflect/Method;

    .line 61
    .line 62
    const/4 v4, 0x0

    .line 63
    invoke-virtual {v3, v2, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    if-eqz v2, :cond_0

    .line 68
    .line 69
    filled-new-array {v0, v4, v0, v4}, [Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {p0, v2, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_0
    const-string p0, "Required value was null."

    .line 78
    .line 79
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_1
    invoke-virtual {p0}, Lyyds/ᛳᛴᲀᛷ;->ᛲᲈᲁ()V

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_2
    invoke-static {}, Lyyds/ᛱᛸᛶᛲ;->ᛷᲈᲈᲁ()V

    .line 88
    .line 89
    .line 90
    return v1

    .line 91
    :cond_3
    invoke-virtual {p0}, Lyyds/ᛳᛴᲀᛷ;->ᲇᲇᲇᛱ()V

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_4
    invoke-virtual {p0}, Lyyds/ᛳᛴᲀᛷ;->ᛲᲈᲁ()V

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_5
    invoke-virtual {p0}, Lyyds/ᛳᛴᲀᛷ;->ᛶᛷᛲᲁ()V

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_6
    invoke-virtual {p0}, Lyyds/ᛳᛴᲀᛷ;->ᛳᲁᲁᲇ()V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0}, Lyyds/ᛳᛴᲀᛷ;->ᛶᛷᛲᲁ()V

    .line 107
    .line 108
    .line 109
    :goto_0
    return v1
.end method

.method public final ᲀᛲᛲᲇ(ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyyds/ᛴᛵᛲᲇ;->ᛲᲈᲁ()V

    .line 2
    .line 3
    .line 4
    const/16 p0, 0x19

    .line 5
    .line 6
    const-string p1, "column index out of range"

    .line 7
    .line 8
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᲀᛲᛲᲇ(ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public final ᲇᲈᛵᛷ(IJ)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyyds/ᛴᛵᛲᲇ;->ᛲᲈᲁ()V

    .line 2
    .line 3
    .line 4
    const/16 p0, 0x19

    .line 5
    .line 6
    const-string p1, "column index out of range"

    .line 7
    .line 8
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᲀᛲᛲᲇ(ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method
