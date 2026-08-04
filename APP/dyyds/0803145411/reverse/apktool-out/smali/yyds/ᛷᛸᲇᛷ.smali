.class public final Lyyds/ᛷᛸᲇᛷ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛲᛴᛳᛲ:I

.field public ᛲᲈᲁ:I

.field public final ᛵᛸᛸᛷ:Lyyds/ᛷᲇᛵᛵ;

.field public ᲀᛲᛳᲀ:Lyyds/ᛷᲇᛵᛵ;

.field public ᲇᲇᲇᛱ:I

.field public ᲇᲈᛵᛷ:Lyyds/ᛷᲇᛵᛵ;


# direct methods
.method public constructor <init>(Lyyds/ᛷᲇᛵᛵ;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput v0, p0, Lyyds/ᛷᛸᲇᛷ;->ᛲᲈᲁ:I

    .line 6
    .line 7
    iput-object p1, p0, Lyyds/ᛷᛸᲇᛷ;->ᛵᛸᛸᛷ:Lyyds/ᛷᲇᛵᛵ;

    .line 8
    .line 9
    iput-object p1, p0, Lyyds/ᛷᛸᲇᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛷᲇᛵᛵ;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ(I)I
    .locals 4

    .line 1
    iget-object v0, p0, Lyyds/ᛷᛸᲇᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛷᲇᛵᛵ;

    .line 2
    .line 3
    iget-object v0, v0, Lyyds/ᛷᲇᛵᛵ;->ᛲᲈᲁ:Landroid/util/SparseArray;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lyyds/ᛷᲇᛵᛵ;

    .line 10
    .line 11
    iget v1, p0, Lyyds/ᛷᛸᲇᛷ;->ᛲᲈᲁ:I

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    const/4 v3, 0x2

    .line 15
    if-eq v1, v3, :cond_1

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Lyyds/ᛷᛸᲇᛷ;->ᛵᛸᛸᛷ()V

    .line 20
    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    iput v3, p0, Lyyds/ᛷᛸᲇᛷ;->ᛲᲈᲁ:I

    .line 24
    .line 25
    iput-object v0, p0, Lyyds/ᛷᛸᲇᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛷᲇᛵᛵ;

    .line 26
    .line 27
    iput v2, p0, Lyyds/ᛷᛸᲇᛷ;->ᲇᲇᲇᛱ:I

    .line 28
    .line 29
    :goto_0
    move v2, v3

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    if-eqz v0, :cond_2

    .line 32
    .line 33
    iput-object v0, p0, Lyyds/ᛷᛸᲇᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛷᲇᛵᛵ;

    .line 34
    .line 35
    iget v0, p0, Lyyds/ᛷᛸᲇᛷ;->ᲇᲇᲇᛱ:I

    .line 36
    .line 37
    add-int/2addr v0, v2

    .line 38
    iput v0, p0, Lyyds/ᛷᛸᲇᛷ;->ᲇᲇᲇᛱ:I

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    const v0, 0xfe0e

    .line 42
    .line 43
    .line 44
    if-ne p1, v0, :cond_3

    .line 45
    .line 46
    invoke-virtual {p0}, Lyyds/ᛷᛸᲇᛷ;->ᛵᛸᛸᛷ()V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_3
    const v0, 0xfe0f

    .line 51
    .line 52
    .line 53
    if-ne p1, v0, :cond_4

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_4
    iget-object v0, p0, Lyyds/ᛷᛸᲇᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛷᲇᛵᛵ;

    .line 57
    .line 58
    iget-object v1, v0, Lyyds/ᛷᲇᛵᛵ;->ᛵᛸᛸᛷ:Lyyds/ᛳᲈᲁᲁ;

    .line 59
    .line 60
    if-eqz v1, :cond_7

    .line 61
    .line 62
    iget v1, p0, Lyyds/ᛷᛸᲇᛷ;->ᲇᲇᲇᛱ:I

    .line 63
    .line 64
    const/4 v3, 0x3

    .line 65
    if-ne v1, v2, :cond_6

    .line 66
    .line 67
    invoke-virtual {p0}, Lyyds/ᛷᛸᲇᛷ;->ᲀᛲᛳᲀ()Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_5

    .line 72
    .line 73
    iget-object v0, p0, Lyyds/ᛷᛸᲇᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛷᲇᛵᛵ;

    .line 74
    .line 75
    iput-object v0, p0, Lyyds/ᛷᛸᲇᛷ;->ᲇᲈᛵᛷ:Lyyds/ᛷᲇᛵᛵ;

    .line 76
    .line 77
    invoke-virtual {p0}, Lyyds/ᛷᛸᲇᛷ;->ᛵᛸᛸᛷ()V

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_5
    invoke-virtual {p0}, Lyyds/ᛷᛸᲇᛷ;->ᛵᛸᛸᛷ()V

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_6
    iput-object v0, p0, Lyyds/ᛷᛸᲇᛷ;->ᲇᲈᛵᛷ:Lyyds/ᛷᲇᛵᛵ;

    .line 86
    .line 87
    invoke-virtual {p0}, Lyyds/ᛷᛸᲇᛷ;->ᛵᛸᛸᛷ()V

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_7
    invoke-virtual {p0}, Lyyds/ᛷᛸᲇᛷ;->ᛵᛸᛸᛷ()V

    .line 92
    .line 93
    .line 94
    :goto_1
    iput p1, p0, Lyyds/ᛷᛸᲇᛷ;->ᛲᛴᛳᛲ:I

    .line 95
    .line 96
    return v2
.end method

.method public final ᛵᛸᛸᛷ()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lyyds/ᛷᛸᲇᛷ;->ᛲᲈᲁ:I

    .line 3
    .line 4
    iget-object v0, p0, Lyyds/ᛷᛸᲇᛷ;->ᛵᛸᛸᛷ:Lyyds/ᛷᲇᛵᛵ;

    .line 5
    .line 6
    iput-object v0, p0, Lyyds/ᛷᛸᲇᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛷᲇᛵᛵ;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput v0, p0, Lyyds/ᛷᛸᲇᛷ;->ᲇᲇᲇᛱ:I

    .line 10
    .line 11
    return-void
.end method

.method public final ᲀᛲᛳᲀ()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lyyds/ᛷᛸᲇᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛷᲇᛵᛵ;

    .line 2
    .line 3
    iget-object v0, v0, Lyyds/ᛷᲇᛵᛵ;->ᛵᛸᛸᛷ:Lyyds/ᛳᲈᲁᲁ;

    .line 4
    .line 5
    invoke-virtual {v0}, Lyyds/ᛳᲈᲁᲁ;->ᛵᛸᛸᛷ()Lyyds/ᛴᲁᛷᛷ;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x6

    .line 10
    invoke-virtual {v0, v1}, Lyyds/ᛸᲀᛷᲀ;->ᛲᲈᲁ(I)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iget-object v3, v0, Lyyds/ᛸᲀᛷᲀ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v3, Ljava/nio/ByteBuffer;

    .line 20
    .line 21
    iget v0, v0, Lyyds/ᛸᲀᛷᲀ;->ᲀᛲᛳᲀ:I

    .line 22
    .line 23
    add-int/2addr v1, v0

    .line 24
    invoke-virtual {v3, v1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    return v2

    .line 31
    :cond_0
    iget p0, p0, Lyyds/ᛷᛸᲇᛷ;->ᛲᛴᛳᛲ:I

    .line 32
    .line 33
    const v0, 0xfe0f

    .line 34
    .line 35
    .line 36
    if-ne p0, v0, :cond_1

    .line 37
    .line 38
    return v2

    .line 39
    :cond_1
    const/4 p0, 0x0

    .line 40
    return p0
.end method
