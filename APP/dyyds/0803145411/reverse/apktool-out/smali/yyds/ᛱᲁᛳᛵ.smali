.class public final Lyyds/ᛱᲁᛳᛵ;
.super Lyyds/ᛱᲀᲈᛲ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᲇᲇᲇᛱ:[Ljava/lang/Object;


# instance fields
.field public ᛲᛴᛳᛲ:I

.field public ᲀᛲᛳᲀ:I

.field public ᲇᲈᛵᛷ:[Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    sput-object v0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲇᲇᛱ:[Ljava/lang/Object;

    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 27
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    .line 28
    sget-object v0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲇᲇᛱ:[Ljava/lang/Object;

    iput-object v0, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    sget-object p1, Lyyds/ᛱᲁᛳᛵ;->ᲇᲇᲇᛱ:[Ljava/lang/Object;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    if-lez p1, :cond_1

    .line 10
    .line 11
    new-array p1, p1, [Ljava/lang/Object;

    .line 12
    .line 13
    :goto_0
    iput-object p1, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 14
    .line 15
    return-void

    .line 16
    :cond_1
    const-string p0, "Illegal Capacity: "

    .line 17
    .line 18
    invoke-static {p1, p0}, Lyyds/ᛴᛷᛷᲇ;->ᛲᛳᛶᲁ(ILjava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    throw p0
.end method


# virtual methods
.method public final add(ILjava/lang/Object;)V
    .locals 7

    .line 1
    iget v0, p0, Lyyds/ᛱᲁᛳᛵ;->ᛲᛴᛳᛲ:I

    .line 2
    .line 3
    if-ltz p1, :cond_7

    .line 4
    .line 5
    if-gt p1, v0, :cond_7

    .line 6
    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, p2}, Lyyds/ᛱᲁᛳᛵ;->addLast(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    if-nez p1, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0, p2}, Lyyds/ᛱᲁᛳᛵ;->addFirst(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    invoke-virtual {p0}, Lyyds/ᛱᲁᛳᛵ;->ᛲᛳᛶᲁ()V

    .line 20
    .line 21
    .line 22
    iget v0, p0, Lyyds/ᛱᲁᛳᛵ;->ᛲᛴᛳᛲ:I

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    add-int/2addr v0, v1

    .line 26
    invoke-virtual {p0, v0}, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ(I)V

    .line 27
    .line 28
    .line 29
    iget v0, p0, Lyyds/ᛱᲁᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 30
    .line 31
    add-int/2addr v0, p1

    .line 32
    invoke-virtual {p0, v0}, Lyyds/ᛱᲁᛳᛵ;->ᛱᲈᲁ(I)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget v2, p0, Lyyds/ᛱᲁᛳᛵ;->ᛲᛴᛳᛲ:I

    .line 37
    .line 38
    add-int/lit8 v3, v2, 0x1

    .line 39
    .line 40
    shr-int/2addr v3, v1

    .line 41
    iget v4, p0, Lyyds/ᛱᲁᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 42
    .line 43
    const/4 v5, 0x0

    .line 44
    if-ge p1, v3, :cond_5

    .line 45
    .line 46
    if-nez v0, :cond_2

    .line 47
    .line 48
    iget-object p1, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 49
    .line 50
    array-length p1, p1

    .line 51
    sub-int/2addr p1, v1

    .line 52
    goto :goto_0

    .line 53
    :cond_2
    add-int/lit8 p1, v0, -0x1

    .line 54
    .line 55
    :goto_0
    if-nez v4, :cond_3

    .line 56
    .line 57
    iget-object v0, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 58
    .line 59
    array-length v0, v0

    .line 60
    sub-int/2addr v0, v1

    .line 61
    goto :goto_1

    .line 62
    :cond_3
    add-int/lit8 v0, v4, -0x1

    .line 63
    .line 64
    :goto_1
    iget-object v2, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 65
    .line 66
    if-lt p1, v4, :cond_4

    .line 67
    .line 68
    aget-object v3, v2, v4

    .line 69
    .line 70
    aput-object v3, v2, v0

    .line 71
    .line 72
    add-int/lit8 v3, v4, 0x1

    .line 73
    .line 74
    add-int/lit8 v5, p1, 0x1

    .line 75
    .line 76
    invoke-static {v4, v3, v5, v2, v2}, Lyyds/ᲀᲀᛷᛸ;->ᛶᲈᛴᲈ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_4
    add-int/lit8 v3, v4, -0x1

    .line 81
    .line 82
    array-length v6, v2

    .line 83
    invoke-static {v3, v4, v6, v2, v2}, Lyyds/ᲀᲀᛷᛸ;->ᛶᲈᛴᲈ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    iget-object v2, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 87
    .line 88
    array-length v3, v2

    .line 89
    sub-int/2addr v3, v1

    .line 90
    aget-object v4, v2, v5

    .line 91
    .line 92
    aput-object v4, v2, v3

    .line 93
    .line 94
    add-int/lit8 v3, p1, 0x1

    .line 95
    .line 96
    invoke-static {v5, v1, v3, v2, v2}, Lyyds/ᲀᲀᛷᛸ;->ᛶᲈᛴᲈ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    :goto_2
    iget-object v2, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 100
    .line 101
    aput-object p2, v2, p1

    .line 102
    .line 103
    iput v0, p0, Lyyds/ᛱᲁᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 104
    .line 105
    goto :goto_4

    .line 106
    :cond_5
    add-int/2addr v2, v4

    .line 107
    invoke-virtual {p0, v2}, Lyyds/ᛱᲁᛳᛵ;->ᛱᲈᲁ(I)I

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    iget-object v2, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 112
    .line 113
    if-ge v0, p1, :cond_6

    .line 114
    .line 115
    add-int/lit8 v3, v0, 0x1

    .line 116
    .line 117
    invoke-static {v3, v0, p1, v2, v2}, Lyyds/ᲀᲀᛷᛸ;->ᛶᲈᛴᲈ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    goto :goto_3

    .line 121
    :cond_6
    invoke-static {v1, v5, p1, v2, v2}, Lyyds/ᲀᲀᛷᛸ;->ᛶᲈᛴᲈ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    iget-object p1, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 125
    .line 126
    array-length v2, p1

    .line 127
    sub-int/2addr v2, v1

    .line 128
    aget-object v2, p1, v2

    .line 129
    .line 130
    aput-object v2, p1, v5

    .line 131
    .line 132
    add-int/lit8 v2, v0, 0x1

    .line 133
    .line 134
    array-length v3, p1

    .line 135
    sub-int/2addr v3, v1

    .line 136
    invoke-static {v2, v0, v3, p1, p1}, Lyyds/ᲀᲀᛷᛸ;->ᛶᲈᛴᲈ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    :goto_3
    iget-object p1, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 140
    .line 141
    aput-object p2, p1, v0

    .line 142
    .line 143
    :goto_4
    iget p1, p0, Lyyds/ᛱᲁᛳᛵ;->ᛲᛴᛳᛲ:I

    .line 144
    .line 145
    add-int/2addr p1, v1

    .line 146
    iput p1, p0, Lyyds/ᛱᲁᛳᛵ;->ᛲᛴᛳᛲ:I

    .line 147
    .line 148
    return-void

    .line 149
    :cond_7
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    .line 150
    .line 151
    const-string p2, "index: "

    .line 152
    .line 153
    const-string v1, ", size: "

    .line 154
    .line 155
    invoke-static {p1, v0, p2, v1}, Lyyds/ᛴᛷᛷᲇ;->ᛱᲈᲁ(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    invoke-direct {p0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    throw p0
.end method

.method public final add(Ljava/lang/Object;)Z
    .locals 0

    .line 163
    invoke-virtual {p0, p1}, Lyyds/ᛱᲁᛳᛵ;->addLast(Ljava/lang/Object;)V

    const/4 p0, 0x1

    return p0
.end method

.method public final addAll(ILjava/util/Collection;)Z
    .locals 8

    .line 1
    iget v0, p0, Lyyds/ᛱᲁᛳᛵ;->ᛲᛴᛳᛲ:I

    .line 2
    .line 3
    if-ltz p1, :cond_b

    .line 4
    .line 5
    if-gt p1, v0, :cond_b

    .line 6
    .line 7
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    return v1

    .line 15
    :cond_0
    iget v0, p0, Lyyds/ᛱᲁᛳᛵ;->ᛲᛴᛳᛲ:I

    .line 16
    .line 17
    if-ne p1, v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0, p2}, Lyyds/ᛱᲁᛳᛵ;->addAll(Ljava/util/Collection;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0

    .line 24
    :cond_1
    invoke-virtual {p0}, Lyyds/ᛱᲁᛳᛵ;->ᛲᛳᛶᲁ()V

    .line 25
    .line 26
    .line 27
    iget v0, p0, Lyyds/ᛱᲁᛳᛵ;->ᛲᛴᛳᛲ:I

    .line 28
    .line 29
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    add-int/2addr v2, v0

    .line 34
    invoke-virtual {p0, v2}, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ(I)V

    .line 35
    .line 36
    .line 37
    iget v0, p0, Lyyds/ᛱᲁᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 38
    .line 39
    iget v2, p0, Lyyds/ᛱᲁᛳᛵ;->ᛲᛴᛳᛲ:I

    .line 40
    .line 41
    add-int/2addr v2, v0

    .line 42
    invoke-virtual {p0, v2}, Lyyds/ᛱᲁᛳᛵ;->ᛱᲈᲁ(I)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget v2, p0, Lyyds/ᛱᲁᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 47
    .line 48
    add-int/2addr v2, p1

    .line 49
    invoke-virtual {p0, v2}, Lyyds/ᛱᲁᛳᛵ;->ᛱᲈᲁ(I)I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    iget v4, p0, Lyyds/ᛱᲁᛳᛵ;->ᛲᛴᛳᛲ:I

    .line 58
    .line 59
    const/4 v5, 0x1

    .line 60
    add-int/2addr v4, v5

    .line 61
    shr-int/2addr v4, v5

    .line 62
    if-ge p1, v4, :cond_6

    .line 63
    .line 64
    iget p1, p0, Lyyds/ᛱᲁᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 65
    .line 66
    sub-int v0, p1, v3

    .line 67
    .line 68
    iget-object v4, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 69
    .line 70
    if-lt v2, p1, :cond_4

    .line 71
    .line 72
    if-ltz v0, :cond_2

    .line 73
    .line 74
    invoke-static {v0, p1, v2, v4, v4}, Lyyds/ᲀᲀᛷᛸ;->ᛶᲈᛴᲈ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_2
    array-length v6, v4

    .line 79
    add-int/2addr v0, v6

    .line 80
    sub-int v6, v2, p1

    .line 81
    .line 82
    array-length v7, v4

    .line 83
    sub-int/2addr v7, v0

    .line 84
    if-lt v7, v6, :cond_3

    .line 85
    .line 86
    invoke-static {v0, p1, v2, v4, v4}, Lyyds/ᲀᲀᛷᛸ;->ᛶᲈᛴᲈ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_3
    add-int v6, p1, v7

    .line 91
    .line 92
    invoke-static {v0, p1, v6, v4, v4}, Lyyds/ᲀᲀᛷᛸ;->ᛶᲈᛴᲈ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    iget-object p1, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 96
    .line 97
    iget v4, p0, Lyyds/ᛱᲁᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 98
    .line 99
    add-int/2addr v4, v7

    .line 100
    invoke-static {v1, v4, v2, p1, p1}, Lyyds/ᲀᲀᛷᛸ;->ᛶᲈᛴᲈ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_4
    array-length v6, v4

    .line 105
    invoke-static {v0, p1, v6, v4, v4}, Lyyds/ᲀᲀᛷᛸ;->ᛶᲈᛴᲈ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    iget-object p1, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 109
    .line 110
    if-lt v3, v2, :cond_5

    .line 111
    .line 112
    array-length v4, p1

    .line 113
    sub-int/2addr v4, v3

    .line 114
    invoke-static {v4, v1, v2, p1, p1}, Lyyds/ᲀᲀᛷᛸ;->ᛶᲈᛴᲈ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_5
    array-length v4, p1

    .line 119
    sub-int/2addr v4, v3

    .line 120
    invoke-static {v4, v1, v3, p1, p1}, Lyyds/ᲀᲀᛷᛸ;->ᛶᲈᛴᲈ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    iget-object p1, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 124
    .line 125
    invoke-static {v1, v3, v2, p1, p1}, Lyyds/ᲀᲀᛷᛸ;->ᛶᲈᛴᲈ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    :goto_0
    iput v0, p0, Lyyds/ᛱᲁᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 129
    .line 130
    sub-int/2addr v2, v3

    .line 131
    invoke-virtual {p0, v2}, Lyyds/ᛱᲁᛳᛵ;->ᲇᲇᲇᛱ(I)I

    .line 132
    .line 133
    .line 134
    move-result p1

    .line 135
    invoke-virtual {p0, p1, p2}, Lyyds/ᛱᲁᛳᛵ;->ᲀᛲᛳᲀ(ILjava/util/Collection;)V

    .line 136
    .line 137
    .line 138
    return v5

    .line 139
    :cond_6
    add-int p1, v2, v3

    .line 140
    .line 141
    iget-object v4, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 142
    .line 143
    if-ge v2, v0, :cond_9

    .line 144
    .line 145
    add-int/2addr v3, v0

    .line 146
    array-length v6, v4

    .line 147
    if-gt v3, v6, :cond_7

    .line 148
    .line 149
    invoke-static {p1, v2, v0, v4, v4}, Lyyds/ᲀᲀᛷᛸ;->ᛶᲈᛴᲈ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_7
    array-length v6, v4

    .line 154
    if-lt p1, v6, :cond_8

    .line 155
    .line 156
    array-length v1, v4

    .line 157
    sub-int/2addr p1, v1

    .line 158
    invoke-static {p1, v2, v0, v4, v4}, Lyyds/ᲀᲀᛷᛸ;->ᛶᲈᛴᲈ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_8
    array-length v6, v4

    .line 163
    sub-int/2addr v3, v6

    .line 164
    sub-int v3, v0, v3

    .line 165
    .line 166
    invoke-static {v1, v3, v0, v4, v4}, Lyyds/ᲀᲀᛷᛸ;->ᛶᲈᛴᲈ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    iget-object v0, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 170
    .line 171
    invoke-static {p1, v2, v3, v0, v0}, Lyyds/ᲀᲀᛷᛸ;->ᛶᲈᛴᲈ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    goto :goto_1

    .line 175
    :cond_9
    invoke-static {v3, v1, v0, v4, v4}, Lyyds/ᲀᲀᛷᛸ;->ᛶᲈᛴᲈ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    iget-object v0, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 179
    .line 180
    array-length v4, v0

    .line 181
    if-lt p1, v4, :cond_a

    .line 182
    .line 183
    array-length v1, v0

    .line 184
    sub-int/2addr p1, v1

    .line 185
    array-length v1, v0

    .line 186
    invoke-static {p1, v2, v1, v0, v0}, Lyyds/ᲀᲀᛷᛸ;->ᛶᲈᛴᲈ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    goto :goto_1

    .line 190
    :cond_a
    array-length v4, v0

    .line 191
    sub-int/2addr v4, v3

    .line 192
    array-length v6, v0

    .line 193
    invoke-static {v1, v4, v6, v0, v0}, Lyyds/ᲀᲀᛷᛸ;->ᛶᲈᛴᲈ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    iget-object v0, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 197
    .line 198
    array-length v1, v0

    .line 199
    sub-int/2addr v1, v3

    .line 200
    invoke-static {p1, v2, v1, v0, v0}, Lyyds/ᲀᲀᛷᛸ;->ᛶᲈᛴᲈ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    :goto_1
    invoke-virtual {p0, v2, p2}, Lyyds/ᛱᲁᛳᛵ;->ᲀᛲᛳᲀ(ILjava/util/Collection;)V

    .line 204
    .line 205
    .line 206
    return v5

    .line 207
    :cond_b
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    .line 208
    .line 209
    const-string p2, "index: "

    .line 210
    .line 211
    const-string v1, ", size: "

    .line 212
    .line 213
    invoke-static {p1, v0, p2, v1}, Lyyds/ᛴᛷᛷᲇ;->ᛱᲈᲁ(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    invoke-direct {p0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    throw p0
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 2

    .line 221
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return p0

    .line 222
    :cond_0
    invoke-virtual {p0}, Lyyds/ᛱᲁᛳᛵ;->ᛲᛳᛶᲁ()V

    .line 223
    iget v0, p0, Lyyds/ᛱᲁᛳᛵ;->ᛲᛴᛳᛲ:I

    .line 224
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v1

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ(I)V

    .line 225
    iget v0, p0, Lyyds/ᛱᲁᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 226
    iget v1, p0, Lyyds/ᛱᲁᛳᛵ;->ᛲᛴᛳᛲ:I

    add-int/2addr v1, v0

    .line 227
    invoke-virtual {p0, v1}, Lyyds/ᛱᲁᛳᛵ;->ᛱᲈᲁ(I)I

    move-result v0

    invoke-virtual {p0, v0, p1}, Lyyds/ᛱᲁᛳᛵ;->ᲀᛲᛳᲀ(ILjava/util/Collection;)V

    const/4 p0, 0x1

    return p0
.end method

.method public final addFirst(Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lyyds/ᛱᲁᛳᛵ;->ᛲᛳᛶᲁ()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lyyds/ᛱᲁᛳᛵ;->ᛲᛴᛳᛲ:I

    .line 5
    .line 6
    add-int/lit8 v0, v0, 0x1

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ(I)V

    .line 9
    .line 10
    .line 11
    iget v0, p0, Lyyds/ᛱᲁᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 16
    .line 17
    array-length v0, v0

    .line 18
    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 19
    .line 20
    iput v0, p0, Lyyds/ᛱᲁᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 21
    .line 22
    iget-object v1, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 23
    .line 24
    aput-object p1, v1, v0

    .line 25
    .line 26
    iget p1, p0, Lyyds/ᛱᲁᛳᛵ;->ᛲᛴᛳᛲ:I

    .line 27
    .line 28
    add-int/lit8 p1, p1, 0x1

    .line 29
    .line 30
    iput p1, p0, Lyyds/ᛱᲁᛳᛵ;->ᛲᛴᛳᛲ:I

    .line 31
    .line 32
    return-void
.end method

.method public final addLast(Ljava/lang/Object;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lyyds/ᛱᲁᛳᛵ;->ᛲᛳᛶᲁ()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lyyds/ᛱᲁᛳᛵ;->ᛲᛴᛳᛲ:I

    .line 5
    .line 6
    add-int/lit8 v0, v0, 0x1

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ(I)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 12
    .line 13
    iget v1, p0, Lyyds/ᛱᲁᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 14
    .line 15
    iget v2, p0, Lyyds/ᛱᲁᛳᛵ;->ᛲᛴᛳᛲ:I

    .line 16
    .line 17
    add-int/2addr v2, v1

    .line 18
    invoke-virtual {p0, v2}, Lyyds/ᛱᲁᛳᛵ;->ᛱᲈᲁ(I)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    aput-object p1, v0, v1

    .line 23
    .line 24
    iget p1, p0, Lyyds/ᛱᲁᛳᛵ;->ᛲᛴᛳᛲ:I

    .line 25
    .line 26
    add-int/lit8 p1, p1, 0x1

    .line 27
    .line 28
    iput p1, p0, Lyyds/ᛱᲁᛳᛵ;->ᛲᛴᛳᛲ:I

    .line 29
    .line 30
    return-void
.end method

.method public final clear()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lyyds/ᛱᲁᛳᛵ;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lyyds/ᛱᲁᛳᛵ;->ᛲᛳᛶᲁ()V

    .line 8
    .line 9
    .line 10
    iget v0, p0, Lyyds/ᛱᲁᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 11
    .line 12
    iget v1, p0, Lyyds/ᛱᲁᛳᛵ;->ᛲᛴᛳᛲ:I

    .line 13
    .line 14
    add-int/2addr v1, v0

    .line 15
    invoke-virtual {p0, v1}, Lyyds/ᛱᲁᛳᛵ;->ᛱᲈᲁ(I)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iget v1, p0, Lyyds/ᛱᲁᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 20
    .line 21
    invoke-virtual {p0, v1, v0}, Lyyds/ᛱᲁᛳᛵ;->ᛶᛷᛲᲁ(II)V

    .line 22
    .line 23
    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    iput v0, p0, Lyyds/ᛱᲁᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 26
    .line 27
    iput v0, p0, Lyyds/ᛱᲁᛳᛵ;->ᛲᛴᛳᛲ:I

    .line 28
    .line 29
    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lyyds/ᛱᲁᛳᛵ;->indexOf(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 p1, -0x1

    .line 6
    if-eq p0, p1, :cond_0

    .line 7
    .line 8
    const/4 p0, 0x1

    .line 9
    return p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lyyds/ᛱᲁᛳᛵ;->ᛲᛴᛳᛲ:I

    .line 2
    .line 3
    if-ltz p1, :cond_0

    .line 4
    .line 5
    if-ge p1, v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 8
    .line 9
    iget v1, p0, Lyyds/ᛱᲁᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 10
    .line 11
    add-int/2addr v1, p1

    .line 12
    invoke-virtual {p0, v1}, Lyyds/ᛱᲁᛳᛵ;->ᛱᲈᲁ(I)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    aget-object p0, v0, p0

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_0
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    .line 20
    .line 21
    const-string v1, "index: "

    .line 22
    .line 23
    const-string v2, ", size: "

    .line 24
    .line 25
    invoke-static {p1, v0, v1, v2}, Lyyds/ᛴᛷᛷᲇ;->ᛱᲈᲁ(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-direct {p0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p0
.end method

.method public final indexOf(Ljava/lang/Object;)I
    .locals 4

    .line 1
    iget v0, p0, Lyyds/ᛱᲁᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iget v1, p0, Lyyds/ᛱᲁᛳᛵ;->ᛲᛴᛳᛲ:I

    .line 4
    .line 5
    add-int/2addr v1, v0

    .line 6
    invoke-virtual {p0, v1}, Lyyds/ᛱᲁᛳᛵ;->ᛱᲈᲁ(I)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iget v1, p0, Lyyds/ᛱᲁᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 11
    .line 12
    if-ge v1, v0, :cond_1

    .line 13
    .line 14
    :goto_0
    if-ge v1, v0, :cond_5

    .line 15
    .line 16
    iget-object v2, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 17
    .line 18
    aget-object v2, v2, v1

    .line 19
    .line 20
    invoke-static {p1, v2}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    iget p0, p0, Lyyds/ᛱᲁᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 27
    .line 28
    :goto_1
    sub-int/2addr v1, p0

    .line 29
    return v1

    .line 30
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    invoke-virtual {p0}, Lyyds/ᛱᲁᛳᛵ;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-nez v1, :cond_5

    .line 38
    .line 39
    iget v1, p0, Lyyds/ᛱᲁᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 40
    .line 41
    if-lt v1, v0, :cond_5

    .line 42
    .line 43
    iget-object v2, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 44
    .line 45
    array-length v2, v2

    .line 46
    :goto_2
    if-ge v1, v2, :cond_3

    .line 47
    .line 48
    iget-object v3, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 49
    .line 50
    aget-object v3, v3, v1

    .line 51
    .line 52
    invoke-static {p1, v3}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-eqz v3, :cond_2

    .line 57
    .line 58
    iget p0, p0, Lyyds/ᛱᲁᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_3
    const/4 v1, 0x0

    .line 65
    :goto_3
    if-ge v1, v0, :cond_5

    .line 66
    .line 67
    iget-object v2, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 68
    .line 69
    aget-object v2, v2, v1

    .line 70
    .line 71
    invoke-static {p1, v2}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    if-eqz v2, :cond_4

    .line 76
    .line 77
    iget-object p1, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 78
    .line 79
    array-length p1, p1

    .line 80
    add-int/2addr v1, p1

    .line 81
    iget p0, p0, Lyyds/ᛱᲁᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_5
    const/4 p0, -0x1

    .line 88
    return p0
.end method

.method public final isEmpty()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyyds/ᛱᲁᛳᛵ;->ᛲᲈᲁ()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public final lastIndexOf(Ljava/lang/Object;)I
    .locals 4

    .line 1
    iget v0, p0, Lyyds/ᛱᲁᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iget v1, p0, Lyyds/ᛱᲁᛳᛵ;->ᛲᛴᛳᛲ:I

    .line 4
    .line 5
    add-int/2addr v1, v0

    .line 6
    invoke-virtual {p0, v1}, Lyyds/ᛱᲁᛳᛵ;->ᛱᲈᲁ(I)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iget v1, p0, Lyyds/ᛱᲁᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 11
    .line 12
    const/4 v2, -0x1

    .line 13
    if-ge v1, v0, :cond_1

    .line 14
    .line 15
    add-int/lit8 v0, v0, -0x1

    .line 16
    .line 17
    if-gt v1, v0, :cond_5

    .line 18
    .line 19
    :goto_0
    iget-object v3, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 20
    .line 21
    aget-object v3, v3, v0

    .line 22
    .line 23
    invoke-static {p1, v3}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    iget p0, p0, Lyyds/ᛱᲁᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 30
    .line 31
    :goto_1
    sub-int/2addr v0, p0

    .line 32
    return v0

    .line 33
    :cond_0
    if-eq v0, v1, :cond_5

    .line 34
    .line 35
    add-int/lit8 v0, v0, -0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    invoke-virtual {p0}, Lyyds/ᛱᲁᛳᛵ;->isEmpty()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-nez v1, :cond_5

    .line 43
    .line 44
    iget v1, p0, Lyyds/ᛱᲁᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 45
    .line 46
    if-lt v1, v0, :cond_5

    .line 47
    .line 48
    add-int/lit8 v0, v0, -0x1

    .line 49
    .line 50
    :goto_2
    iget-object v1, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 51
    .line 52
    if-ge v2, v0, :cond_3

    .line 53
    .line 54
    aget-object v1, v1, v0

    .line 55
    .line 56
    invoke-static {p1, v1}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_2

    .line 61
    .line 62
    iget-object p1, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 63
    .line 64
    array-length p1, p1

    .line 65
    add-int/2addr v0, p1

    .line 66
    iget p0, p0, Lyyds/ᛱᲁᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    add-int/lit8 v0, v0, -0x1

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_3
    array-length v0, v1

    .line 73
    add-int/lit8 v0, v0, -0x1

    .line 74
    .line 75
    iget v1, p0, Lyyds/ᛱᲁᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 76
    .line 77
    if-gt v1, v0, :cond_5

    .line 78
    .line 79
    :goto_3
    iget-object v3, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 80
    .line 81
    aget-object v3, v3, v0

    .line 82
    .line 83
    invoke-static {p1, v3}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    if-eqz v3, :cond_4

    .line 88
    .line 89
    iget p0, p0, Lyyds/ᛱᲁᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_4
    if-eq v0, v1, :cond_5

    .line 93
    .line 94
    add-int/lit8 v0, v0, -0x1

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_5
    return v2
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lyyds/ᛱᲁᛳᛵ;->indexOf(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, -0x1

    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    return p0

    .line 10
    :cond_0
    invoke-virtual {p0, p1}, Lyyds/ᛱᲁᛳᛵ;->ᛵᛸᛸᛷ(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 11

    .line 1
    invoke-virtual {p0}, Lyyds/ᛱᲁᛳᛵ;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_8

    .line 7
    .line 8
    iget-object v0, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 9
    .line 10
    array-length v0, v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto/16 :goto_7

    .line 14
    .line 15
    :cond_0
    iget v0, p0, Lyyds/ᛱᲁᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 16
    .line 17
    iget v2, p0, Lyyds/ᛱᲁᛳᛵ;->ᛲᛴᛳᛲ:I

    .line 18
    .line 19
    add-int/2addr v2, v0

    .line 20
    invoke-virtual {p0, v2}, Lyyds/ᛱᲁᛳᛵ;->ᛱᲈᲁ(I)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget v2, p0, Lyyds/ᛱᲁᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    const/4 v4, 0x1

    .line 28
    if-ge v2, v0, :cond_3

    .line 29
    .line 30
    move v5, v2

    .line 31
    :goto_0
    iget-object v6, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 32
    .line 33
    if-ge v2, v0, :cond_2

    .line 34
    .line 35
    aget-object v6, v6, v2

    .line 36
    .line 37
    invoke-interface {p1, v6}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v7

    .line 41
    if-nez v7, :cond_1

    .line 42
    .line 43
    iget-object v7, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 44
    .line 45
    add-int/lit8 v8, v5, 0x1

    .line 46
    .line 47
    aput-object v6, v7, v5

    .line 48
    .line 49
    move v5, v8

    .line 50
    goto :goto_1

    .line 51
    :cond_1
    move v1, v4

    .line 52
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    invoke-static {v6, v5, v0, v3}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    goto :goto_6

    .line 59
    :cond_3
    iget-object v5, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 60
    .line 61
    array-length v5, v5

    .line 62
    move v7, v1

    .line 63
    move v6, v2

    .line 64
    :goto_2
    if-ge v2, v5, :cond_5

    .line 65
    .line 66
    iget-object v8, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 67
    .line 68
    aget-object v9, v8, v2

    .line 69
    .line 70
    aput-object v3, v8, v2

    .line 71
    .line 72
    invoke-interface {p1, v9}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v8

    .line 76
    if-nez v8, :cond_4

    .line 77
    .line 78
    iget-object v8, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 79
    .line 80
    add-int/lit8 v10, v6, 0x1

    .line 81
    .line 82
    aput-object v9, v8, v6

    .line 83
    .line 84
    move v6, v10

    .line 85
    goto :goto_3

    .line 86
    :cond_4
    move v7, v4

    .line 87
    :goto_3
    add-int/lit8 v2, v2, 0x1

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_5
    invoke-virtual {p0, v6}, Lyyds/ᛱᲁᛳᛵ;->ᛱᲈᲁ(I)I

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    move v5, v2

    .line 95
    :goto_4
    if-ge v1, v0, :cond_7

    .line 96
    .line 97
    iget-object v2, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 98
    .line 99
    aget-object v6, v2, v1

    .line 100
    .line 101
    aput-object v3, v2, v1

    .line 102
    .line 103
    invoke-interface {p1, v6}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-nez v2, :cond_6

    .line 108
    .line 109
    iget-object v2, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 110
    .line 111
    aput-object v6, v2, v5

    .line 112
    .line 113
    invoke-virtual {p0, v5}, Lyyds/ᛱᲁᛳᛵ;->ᛲᛴᛳᛲ(I)I

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    goto :goto_5

    .line 118
    :cond_6
    move v7, v4

    .line 119
    :goto_5
    add-int/lit8 v1, v1, 0x1

    .line 120
    .line 121
    goto :goto_4

    .line 122
    :cond_7
    move v1, v7

    .line 123
    :goto_6
    if-eqz v1, :cond_8

    .line 124
    .line 125
    invoke-virtual {p0}, Lyyds/ᛱᲁᛳᛵ;->ᛲᛳᛶᲁ()V

    .line 126
    .line 127
    .line 128
    iget p1, p0, Lyyds/ᛱᲁᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 129
    .line 130
    sub-int/2addr v5, p1

    .line 131
    invoke-virtual {p0, v5}, Lyyds/ᛱᲁᛳᛵ;->ᲇᲇᲇᛱ(I)I

    .line 132
    .line 133
    .line 134
    move-result p1

    .line 135
    iput p1, p0, Lyyds/ᛱᲁᛳᛵ;->ᛲᛴᛳᛲ:I

    .line 136
    .line 137
    :cond_8
    :goto_7
    return v1
.end method

.method public final removeFirst()Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lyyds/ᛱᲁᛳᛵ;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lyyds/ᛱᲁᛳᛵ;->ᛲᛳᛶᲁ()V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 11
    .line 12
    iget v1, p0, Lyyds/ᛱᲁᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 13
    .line 14
    aget-object v2, v0, v1

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    aput-object v3, v0, v1

    .line 18
    .line 19
    invoke-virtual {p0, v1}, Lyyds/ᛱᲁᛳᛵ;->ᛲᛴᛳᛲ(I)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iput v0, p0, Lyyds/ᛱᲁᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 24
    .line 25
    iget v0, p0, Lyyds/ᛱᲁᛳᛵ;->ᛲᛴᛳᛲ:I

    .line 26
    .line 27
    add-int/lit8 v0, v0, -0x1

    .line 28
    .line 29
    iput v0, p0, Lyyds/ᛱᲁᛳᛵ;->ᛲᛴᛳᛲ:I

    .line 30
    .line 31
    return-object v2

    .line 32
    :cond_0
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 33
    .line 34
    const-string v0, "ArrayDeque is empty."

    .line 35
    .line 36
    invoke-direct {p0, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw p0
.end method

.method public final removeLast()Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lyyds/ᛱᲁᛳᛵ;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lyyds/ᛱᲁᛳᛵ;->ᛲᛳᛶᲁ()V

    .line 8
    .line 9
    .line 10
    iget v0, p0, Lyyds/ᛱᲁᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 11
    .line 12
    invoke-static {p0}, Lyyds/ᲈᛸᲁᛶ;->ᛳᲁᲁᲇ(Ljava/util/List;)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    add-int/2addr v1, v0

    .line 17
    invoke-virtual {p0, v1}, Lyyds/ᛱᲁᛳᛵ;->ᛱᲈᲁ(I)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iget-object v1, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 22
    .line 23
    aget-object v2, v1, v0

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    aput-object v3, v1, v0

    .line 27
    .line 28
    iget v0, p0, Lyyds/ᛱᲁᛳᛵ;->ᛲᛴᛳᛲ:I

    .line 29
    .line 30
    add-int/lit8 v0, v0, -0x1

    .line 31
    .line 32
    iput v0, p0, Lyyds/ᛱᲁᛳᛵ;->ᛲᛴᛳᛲ:I

    .line 33
    .line 34
    return-object v2

    .line 35
    :cond_0
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 36
    .line 37
    const-string v0, "ArrayDeque is empty."

    .line 38
    .line 39
    invoke-direct {p0, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw p0
.end method

.method public final removeRange(II)V
    .locals 7

    .line 1
    iget v0, p0, Lyyds/ᛱᲁᛳᛵ;->ᛲᛴᛳᛲ:I

    .line 2
    .line 3
    invoke-static {p1, p2, v0}, Lyyds/ᲀᛳᛳᛱ;->ᛵᛸᛸᛷ(III)V

    .line 4
    .line 5
    .line 6
    sub-int v0, p2, p1

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget v1, p0, Lyyds/ᛱᲁᛳᛵ;->ᛲᛴᛳᛲ:I

    .line 12
    .line 13
    if-ne v0, v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Lyyds/ᛱᲁᛳᛵ;->clear()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    const/4 v1, 0x1

    .line 20
    if-ne v0, v1, :cond_2

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Lyyds/ᛱᲁᛳᛵ;->ᛵᛸᛸᛷ(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_2
    invoke-virtual {p0}, Lyyds/ᛱᲁᛳᛵ;->ᛲᛳᛶᲁ()V

    .line 27
    .line 28
    .line 29
    iget v2, p0, Lyyds/ᛱᲁᛳᛵ;->ᛲᛴᛳᛲ:I

    .line 30
    .line 31
    sub-int/2addr v2, p2

    .line 32
    iget v3, p0, Lyyds/ᛱᲁᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 33
    .line 34
    iget v4, p0, Lyyds/ᛱᲁᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 35
    .line 36
    if-ge p1, v2, :cond_4

    .line 37
    .line 38
    add-int/lit8 v2, p1, -0x1

    .line 39
    .line 40
    add-int/2addr v2, v3

    .line 41
    invoke-virtual {p0, v2}, Lyyds/ᛱᲁᛳᛵ;->ᛱᲈᲁ(I)I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    sub-int/2addr p2, v1

    .line 46
    add-int/2addr p2, v4

    .line 47
    invoke-virtual {p0, p2}, Lyyds/ᛱᲁᛳᛵ;->ᛱᲈᲁ(I)I

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    :goto_0
    if-lez p1, :cond_3

    .line 52
    .line 53
    add-int/lit8 v1, v2, 0x1

    .line 54
    .line 55
    add-int/lit8 v3, p2, 0x1

    .line 56
    .line 57
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    invoke-static {p1, v3}, Ljava/lang/Math;->min(II)I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    iget-object v4, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 66
    .line 67
    sub-int/2addr p2, v3

    .line 68
    add-int/lit8 v5, p2, 0x1

    .line 69
    .line 70
    sub-int/2addr v2, v3

    .line 71
    add-int/lit8 v6, v2, 0x1

    .line 72
    .line 73
    invoke-static {v5, v6, v1, v4, v4}, Lyyds/ᲀᲀᛷᛸ;->ᛶᲈᛴᲈ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0, v2}, Lyyds/ᛱᲁᛳᛵ;->ᲇᲇᲇᛱ(I)I

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    invoke-virtual {p0, p2}, Lyyds/ᛱᲁᛳᛵ;->ᲇᲇᲇᛱ(I)I

    .line 81
    .line 82
    .line 83
    move-result p2

    .line 84
    sub-int/2addr p1, v3

    .line 85
    goto :goto_0

    .line 86
    :cond_3
    iget p1, p0, Lyyds/ᛱᲁᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 87
    .line 88
    add-int/2addr p1, v0

    .line 89
    invoke-virtual {p0, p1}, Lyyds/ᛱᲁᛳᛵ;->ᛱᲈᲁ(I)I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    iget p2, p0, Lyyds/ᛱᲁᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 94
    .line 95
    invoke-virtual {p0, p2, p1}, Lyyds/ᛱᲁᛳᛵ;->ᛶᛷᛲᲁ(II)V

    .line 96
    .line 97
    .line 98
    iput p1, p0, Lyyds/ᛱᲁᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_4
    add-int/2addr v3, p2

    .line 102
    invoke-virtual {p0, v3}, Lyyds/ᛱᲁᛳᛵ;->ᛱᲈᲁ(I)I

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    add-int/2addr v4, p1

    .line 107
    invoke-virtual {p0, v4}, Lyyds/ᛱᲁᛳᛵ;->ᛱᲈᲁ(I)I

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    iget v2, p0, Lyyds/ᛱᲁᛳᛵ;->ᛲᛴᛳᛲ:I

    .line 112
    .line 113
    :goto_1
    sub-int/2addr v2, p2

    .line 114
    if-lez v2, :cond_5

    .line 115
    .line 116
    iget-object p2, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 117
    .line 118
    array-length v3, p2

    .line 119
    sub-int/2addr v3, v1

    .line 120
    array-length p2, p2

    .line 121
    sub-int/2addr p2, p1

    .line 122
    invoke-static {v3, p2}, Ljava/lang/Math;->min(II)I

    .line 123
    .line 124
    .line 125
    move-result p2

    .line 126
    invoke-static {v2, p2}, Ljava/lang/Math;->min(II)I

    .line 127
    .line 128
    .line 129
    move-result p2

    .line 130
    iget-object v3, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 131
    .line 132
    add-int v4, v1, p2

    .line 133
    .line 134
    invoke-static {p1, v1, v4, v3, v3}, Lyyds/ᲀᲀᛷᛸ;->ᛶᲈᛴᲈ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0, v4}, Lyyds/ᛱᲁᛳᛵ;->ᛱᲈᲁ(I)I

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    add-int/2addr p1, p2

    .line 142
    invoke-virtual {p0, p1}, Lyyds/ᛱᲁᛳᛵ;->ᛱᲈᲁ(I)I

    .line 143
    .line 144
    .line 145
    move-result p1

    .line 146
    goto :goto_1

    .line 147
    :cond_5
    iget p1, p0, Lyyds/ᛱᲁᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 148
    .line 149
    iget p2, p0, Lyyds/ᛱᲁᛳᛵ;->ᛲᛴᛳᛲ:I

    .line 150
    .line 151
    add-int/2addr p2, p1

    .line 152
    invoke-virtual {p0, p2}, Lyyds/ᛱᲁᛳᛵ;->ᛱᲈᲁ(I)I

    .line 153
    .line 154
    .line 155
    move-result p1

    .line 156
    sub-int p2, p1, v0

    .line 157
    .line 158
    invoke-virtual {p0, p2}, Lyyds/ᛱᲁᛳᛵ;->ᲇᲇᲇᛱ(I)I

    .line 159
    .line 160
    .line 161
    move-result p2

    .line 162
    invoke-virtual {p0, p2, p1}, Lyyds/ᛱᲁᛳᛵ;->ᛶᛷᛲᲁ(II)V

    .line 163
    .line 164
    .line 165
    :goto_2
    iget p1, p0, Lyyds/ᛱᲁᛳᛵ;->ᛲᛴᛳᛲ:I

    .line 166
    .line 167
    sub-int/2addr p1, v0

    .line 168
    iput p1, p0, Lyyds/ᛱᲁᛳᛵ;->ᛲᛴᛳᛲ:I

    .line 169
    .line 170
    return-void
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 11

    .line 1
    invoke-virtual {p0}, Lyyds/ᛱᲁᛳᛵ;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_8

    .line 7
    .line 8
    iget-object v0, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 9
    .line 10
    array-length v0, v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto/16 :goto_7

    .line 14
    .line 15
    :cond_0
    iget v0, p0, Lyyds/ᛱᲁᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 16
    .line 17
    iget v2, p0, Lyyds/ᛱᲁᛳᛵ;->ᛲᛴᛳᛲ:I

    .line 18
    .line 19
    add-int/2addr v2, v0

    .line 20
    invoke-virtual {p0, v2}, Lyyds/ᛱᲁᛳᛵ;->ᛱᲈᲁ(I)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget v2, p0, Lyyds/ᛱᲁᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    const/4 v4, 0x1

    .line 28
    if-ge v2, v0, :cond_3

    .line 29
    .line 30
    move v5, v2

    .line 31
    :goto_0
    iget-object v6, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 32
    .line 33
    if-ge v2, v0, :cond_2

    .line 34
    .line 35
    aget-object v6, v6, v2

    .line 36
    .line 37
    invoke-interface {p1, v6}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v7

    .line 41
    if-eqz v7, :cond_1

    .line 42
    .line 43
    iget-object v7, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 44
    .line 45
    add-int/lit8 v8, v5, 0x1

    .line 46
    .line 47
    aput-object v6, v7, v5

    .line 48
    .line 49
    move v5, v8

    .line 50
    goto :goto_1

    .line 51
    :cond_1
    move v1, v4

    .line 52
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    invoke-static {v6, v5, v0, v3}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    goto :goto_6

    .line 59
    :cond_3
    iget-object v5, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 60
    .line 61
    array-length v5, v5

    .line 62
    move v7, v1

    .line 63
    move v6, v2

    .line 64
    :goto_2
    if-ge v2, v5, :cond_5

    .line 65
    .line 66
    iget-object v8, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 67
    .line 68
    aget-object v9, v8, v2

    .line 69
    .line 70
    aput-object v3, v8, v2

    .line 71
    .line 72
    invoke-interface {p1, v9}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v8

    .line 76
    if-eqz v8, :cond_4

    .line 77
    .line 78
    iget-object v8, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 79
    .line 80
    add-int/lit8 v10, v6, 0x1

    .line 81
    .line 82
    aput-object v9, v8, v6

    .line 83
    .line 84
    move v6, v10

    .line 85
    goto :goto_3

    .line 86
    :cond_4
    move v7, v4

    .line 87
    :goto_3
    add-int/lit8 v2, v2, 0x1

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_5
    invoke-virtual {p0, v6}, Lyyds/ᛱᲁᛳᛵ;->ᛱᲈᲁ(I)I

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    move v5, v2

    .line 95
    :goto_4
    if-ge v1, v0, :cond_7

    .line 96
    .line 97
    iget-object v2, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 98
    .line 99
    aget-object v6, v2, v1

    .line 100
    .line 101
    aput-object v3, v2, v1

    .line 102
    .line 103
    invoke-interface {p1, v6}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-eqz v2, :cond_6

    .line 108
    .line 109
    iget-object v2, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 110
    .line 111
    aput-object v6, v2, v5

    .line 112
    .line 113
    invoke-virtual {p0, v5}, Lyyds/ᛱᲁᛳᛵ;->ᛲᛴᛳᛲ(I)I

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    goto :goto_5

    .line 118
    :cond_6
    move v7, v4

    .line 119
    :goto_5
    add-int/lit8 v1, v1, 0x1

    .line 120
    .line 121
    goto :goto_4

    .line 122
    :cond_7
    move v1, v7

    .line 123
    :goto_6
    if-eqz v1, :cond_8

    .line 124
    .line 125
    invoke-virtual {p0}, Lyyds/ᛱᲁᛳᛵ;->ᛲᛳᛶᲁ()V

    .line 126
    .line 127
    .line 128
    iget p1, p0, Lyyds/ᛱᲁᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 129
    .line 130
    sub-int/2addr v5, p1

    .line 131
    invoke-virtual {p0, v5}, Lyyds/ᛱᲁᛳᛵ;->ᲇᲇᲇᛱ(I)I

    .line 132
    .line 133
    .line 134
    move-result p1

    .line 135
    iput p1, p0, Lyyds/ᛱᲁᛳᛵ;->ᛲᛴᛳᛲ:I

    .line 136
    .line 137
    :cond_8
    :goto_7
    return v1
.end method

.method public final set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lyyds/ᛱᲁᛳᛵ;->ᛲᛴᛳᛲ:I

    .line 2
    .line 3
    if-ltz p1, :cond_0

    .line 4
    .line 5
    if-ge p1, v0, :cond_0

    .line 6
    .line 7
    iget v0, p0, Lyyds/ᛱᲁᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 8
    .line 9
    add-int/2addr v0, p1

    .line 10
    invoke-virtual {p0, v0}, Lyyds/ᛱᲁᛳᛵ;->ᛱᲈᲁ(I)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iget-object p0, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 15
    .line 16
    aget-object v0, p0, p1

    .line 17
    .line 18
    aput-object p2, p0, p1

    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_0
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    .line 22
    .line 23
    const-string p2, "index: "

    .line 24
    .line 25
    const-string v1, ", size: "

    .line 26
    .line 27
    invoke-static {p1, v0, p2, v1}, Lyyds/ᛴᛷᛷᲇ;->ᛱᲈᲁ(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-direct {p0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p0
.end method

.method public final toArray()[Ljava/lang/Object;
    .locals 1

    .line 74
    invoke-virtual {p0}, Lyyds/ᛱᲁᛳᛵ;->ᛲᲈᲁ()I

    move-result v0

    .line 75
    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lyyds/ᛱᲁᛳᛵ;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 5

    .line 1
    array-length v0, p1

    .line 2
    iget v1, p0, Lyyds/ᛱᲁᛳᛵ;->ᛲᛴᛳᛲ:I

    .line 3
    .line 4
    if-lt v0, v1, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p1, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, [Ljava/lang/Object;

    .line 20
    .line 21
    :goto_0
    iget v0, p0, Lyyds/ᛱᲁᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 22
    .line 23
    iget v1, p0, Lyyds/ᛱᲁᛳᛵ;->ᛲᛴᛳᛲ:I

    .line 24
    .line 25
    add-int/2addr v1, v0

    .line 26
    invoke-virtual {p0, v1}, Lyyds/ᛱᲁᛳᛵ;->ᛱᲈᲁ(I)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget v1, p0, Lyyds/ᛱᲁᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 31
    .line 32
    if-ge v1, v0, :cond_1

    .line 33
    .line 34
    iget-object v2, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 35
    .line 36
    const/4 v3, 0x2

    .line 37
    invoke-static {v1, v0, v3, v2, p1}, Lyyds/ᲀᲀᛷᛸ;->ᛵᲀᲈᛴ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    invoke-virtual {p0}, Lyyds/ᛱᲁᛳᛵ;->isEmpty()Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-nez v1, :cond_2

    .line 46
    .line 47
    iget-object v1, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 48
    .line 49
    iget v2, p0, Lyyds/ᛱᲁᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 50
    .line 51
    array-length v3, v1

    .line 52
    const/4 v4, 0x0

    .line 53
    invoke-static {v4, v2, v3, v1, p1}, Lyyds/ᲀᲀᛷᛸ;->ᛶᲈᛴᲈ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object v1, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 57
    .line 58
    array-length v2, v1

    .line 59
    iget v3, p0, Lyyds/ᛱᲁᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 60
    .line 61
    sub-int/2addr v2, v3

    .line 62
    invoke-static {v2, v4, v0, v1, p1}, Lyyds/ᲀᲀᛷᛸ;->ᛶᲈᛴᲈ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    :cond_2
    :goto_1
    iget p0, p0, Lyyds/ᛱᲁᛳᛵ;->ᛲᛴᛳᛲ:I

    .line 66
    .line 67
    array-length v0, p1

    .line 68
    if-ge p0, v0, :cond_3

    .line 69
    .line 70
    const/4 v0, 0x0

    .line 71
    aput-object v0, p1, p0

    .line 72
    .line 73
    :cond_3
    return-object p1
.end method

.method public final ᛱᲈᲁ(I)I
    .locals 1

    .line 1
    iget-object p0, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 2
    .line 3
    array-length v0, p0

    .line 4
    if-lt p1, v0, :cond_0

    .line 5
    .line 6
    array-length p0, p0

    .line 7
    sub-int/2addr p1, p0

    .line 8
    :cond_0
    return p1
.end method

.method public final ᛲᛳᛶᲁ()V
    .locals 1

    .line 1
    iget v0, p0, Ljava/util/AbstractList;->modCount:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Ljava/util/AbstractList;->modCount:I

    .line 6
    .line 7
    return-void
.end method

.method public final ᛲᛴᛳᛲ(I)I
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 2
    .line 3
    array-length p0, p0

    .line 4
    add-int/lit8 p0, p0, -0x1

    .line 5
    .line 6
    if-ne p1, p0, :cond_0

    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    return p0

    .line 10
    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 11
    .line 12
    return p1
.end method

.method public final ᛲᲈᲁ()I
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᛱᲁᛳᛵ;->ᛲᛴᛳᛲ:I

    .line 2
    .line 3
    return p0
.end method

.method public final ᛵᛸᛸᛷ(I)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lyyds/ᛱᲁᛳᛵ;->ᛲᛴᛳᛲ:I

    .line 2
    .line 3
    if-ltz p1, :cond_5

    .line 4
    .line 5
    if-ge p1, v0, :cond_5

    .line 6
    .line 7
    invoke-static {p0}, Lyyds/ᲈᛸᲁᛶ;->ᛳᲁᲁᲇ(Ljava/util/List;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-ne p1, v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Lyyds/ᛱᲁᛳᛵ;->removeLast()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_0
    if-nez p1, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0}, Lyyds/ᛱᲁᛳᛵ;->removeFirst()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0

    .line 25
    :cond_1
    invoke-virtual {p0}, Lyyds/ᛱᲁᛳᛵ;->ᛲᛳᛶᲁ()V

    .line 26
    .line 27
    .line 28
    iget v0, p0, Lyyds/ᛱᲁᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 29
    .line 30
    add-int/2addr v0, p1

    .line 31
    invoke-virtual {p0, v0}, Lyyds/ᛱᲁᛳᛵ;->ᛱᲈᲁ(I)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    iget-object v1, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 36
    .line 37
    aget-object v2, v1, v0

    .line 38
    .line 39
    iget v3, p0, Lyyds/ᛱᲁᛳᛵ;->ᛲᛴᛳᛲ:I

    .line 40
    .line 41
    const/4 v4, 0x1

    .line 42
    shr-int/2addr v3, v4

    .line 43
    iget v5, p0, Lyyds/ᛱᲁᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 44
    .line 45
    const/4 v6, 0x0

    .line 46
    const/4 v7, 0x0

    .line 47
    if-ge p1, v3, :cond_3

    .line 48
    .line 49
    if-lt v0, v5, :cond_2

    .line 50
    .line 51
    add-int/lit8 p1, v5, 0x1

    .line 52
    .line 53
    invoke-static {p1, v5, v0, v1, v1}, Lyyds/ᲀᲀᛷᛸ;->ᛶᲈᛴᲈ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    invoke-static {v4, v7, v0, v1, v1}, Lyyds/ᲀᲀᛷᛸ;->ᛶᲈᛴᲈ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iget-object p1, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 61
    .line 62
    array-length v0, p1

    .line 63
    sub-int/2addr v0, v4

    .line 64
    aget-object v0, p1, v0

    .line 65
    .line 66
    aput-object v0, p1, v7

    .line 67
    .line 68
    iget v0, p0, Lyyds/ᛱᲁᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 69
    .line 70
    add-int/lit8 v1, v0, 0x1

    .line 71
    .line 72
    array-length v3, p1

    .line 73
    sub-int/2addr v3, v4

    .line 74
    invoke-static {v1, v0, v3, p1, p1}, Lyyds/ᲀᲀᛷᛸ;->ᛶᲈᛴᲈ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    :goto_0
    iget-object p1, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 78
    .line 79
    iget v0, p0, Lyyds/ᛱᲁᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 80
    .line 81
    aput-object v6, p1, v0

    .line 82
    .line 83
    invoke-virtual {p0, v0}, Lyyds/ᛱᲁᛳᛵ;->ᛲᛴᛳᛲ(I)I

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    iput p1, p0, Lyyds/ᛱᲁᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_3
    invoke-static {p0}, Lyyds/ᲈᛸᲁᛶ;->ᛳᲁᲁᲇ(Ljava/util/List;)I

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    add-int/2addr p1, v5

    .line 95
    invoke-virtual {p0, p1}, Lyyds/ᛱᲁᛳᛵ;->ᛱᲈᲁ(I)I

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    iget-object v1, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 100
    .line 101
    if-gt v0, p1, :cond_4

    .line 102
    .line 103
    add-int/lit8 v3, v0, 0x1

    .line 104
    .line 105
    add-int/lit8 v5, p1, 0x1

    .line 106
    .line 107
    invoke-static {v0, v3, v5, v1, v1}, Lyyds/ᲀᲀᛷᛸ;->ᛶᲈᛴᲈ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_4
    add-int/lit8 v3, v0, 0x1

    .line 112
    .line 113
    array-length v5, v1

    .line 114
    invoke-static {v0, v3, v5, v1, v1}, Lyyds/ᲀᲀᛷᛸ;->ᛶᲈᛴᲈ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    iget-object v0, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 118
    .line 119
    array-length v1, v0

    .line 120
    sub-int/2addr v1, v4

    .line 121
    aget-object v3, v0, v7

    .line 122
    .line 123
    aput-object v3, v0, v1

    .line 124
    .line 125
    add-int/lit8 v1, p1, 0x1

    .line 126
    .line 127
    invoke-static {v7, v4, v1, v0, v0}, Lyyds/ᲀᲀᛷᛸ;->ᛶᲈᛴᲈ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    :goto_1
    iget-object v0, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 131
    .line 132
    aput-object v6, v0, p1

    .line 133
    .line 134
    :goto_2
    iget p1, p0, Lyyds/ᛱᲁᛳᛵ;->ᛲᛴᛳᛲ:I

    .line 135
    .line 136
    sub-int/2addr p1, v4

    .line 137
    iput p1, p0, Lyyds/ᛱᲁᛳᛵ;->ᛲᛴᛳᛲ:I

    .line 138
    .line 139
    return-object v2

    .line 140
    :cond_5
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    .line 141
    .line 142
    const-string v1, "index: "

    .line 143
    .line 144
    const-string v2, ", size: "

    .line 145
    .line 146
    invoke-static {p1, v0, v1, v2}, Lyyds/ᛴᛷᛷᲇ;->ᛱᲈᲁ(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    invoke-direct {p0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    throw p0
.end method

.method public final ᛶᛷᛲᲁ(II)V
    .locals 3

    .line 1
    iget-object v0, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-ge p1, p2, :cond_0

    .line 5
    .line 6
    invoke-static {v0, p1, p2, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    array-length v2, v0

    .line 11
    invoke-static {v0, p1, v2, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    invoke-static {p0, p1, p2, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final ᲀᛲᛳᲀ(ILjava/util/Collection;)V
    .locals 4

    .line 1
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 6
    .line 7
    array-length v1, v1

    .line 8
    :goto_0
    if-ge p1, v1, :cond_0

    .line 9
    .line 10
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    iget-object v2, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    aput-object v3, v2, p1

    .line 23
    .line 24
    add-int/lit8 p1, p1, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iget p1, p0, Lyyds/ᛱᲁᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    :goto_1
    if-ge v1, p1, :cond_1

    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    iget-object v2, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 39
    .line 40
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    aput-object v3, v2, v1

    .line 45
    .line 46
    add-int/lit8 v1, v1, 0x1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    iget p1, p0, Lyyds/ᛱᲁᛳᛵ;->ᛲᛴᛳᛲ:I

    .line 50
    .line 51
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    add-int/2addr p2, p1

    .line 56
    iput p2, p0, Lyyds/ᛱᲁᛳᛵ;->ᛲᛴᛳᛲ:I

    .line 57
    .line 58
    return-void
.end method

.method public final ᲇᲇᲇᛱ(I)I
    .locals 0

    .line 1
    if-gez p1, :cond_0

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 4
    .line 5
    array-length p0, p0

    .line 6
    add-int/2addr p1, p0

    .line 7
    :cond_0
    return p1
.end method

.method public final ᲇᲈᛵᛷ(I)V
    .locals 4

    .line 1
    if-ltz p1, :cond_6

    .line 2
    .line 3
    iget-object v0, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 4
    .line 5
    array-length v1, v0

    .line 6
    if-gt p1, v1, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    sget-object v1, Lyyds/ᛱᲁᛳᛵ;->ᲇᲇᲇᛱ:[Ljava/lang/Object;

    .line 10
    .line 11
    if-ne v0, v1, :cond_2

    .line 12
    .line 13
    const/16 v0, 0xa

    .line 14
    .line 15
    if-ge p1, v0, :cond_1

    .line 16
    .line 17
    move p1, v0

    .line 18
    :cond_1
    new-array p1, p1, [Ljava/lang/Object;

    .line 19
    .line 20
    iput-object p1, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 21
    .line 22
    return-void

    .line 23
    :cond_2
    array-length v1, v0

    .line 24
    shr-int/lit8 v2, v1, 0x1

    .line 25
    .line 26
    add-int/2addr v1, v2

    .line 27
    sub-int v2, v1, p1

    .line 28
    .line 29
    if-gez v2, :cond_3

    .line 30
    .line 31
    move v1, p1

    .line 32
    :cond_3
    const v2, 0x7ffffff7

    .line 33
    .line 34
    .line 35
    sub-int v3, v1, v2

    .line 36
    .line 37
    if-lez v3, :cond_5

    .line 38
    .line 39
    if-le p1, v2, :cond_4

    .line 40
    .line 41
    const v1, 0x7fffffff

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_4
    move v1, v2

    .line 46
    :cond_5
    :goto_0
    new-array p1, v1, [Ljava/lang/Object;

    .line 47
    .line 48
    iget v1, p0, Lyyds/ᛱᲁᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 49
    .line 50
    array-length v2, v0

    .line 51
    const/4 v3, 0x0

    .line 52
    invoke-static {v3, v1, v2, v0, p1}, Lyyds/ᲀᲀᛷᛸ;->ᛶᲈᛴᲈ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 56
    .line 57
    array-length v1, v0

    .line 58
    iget v2, p0, Lyyds/ᛱᲁᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 59
    .line 60
    sub-int/2addr v1, v2

    .line 61
    invoke-static {v1, v3, v2, v0, p1}, Lyyds/ᲀᲀᛷᛸ;->ᛶᲈᛴᲈ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iput v3, p0, Lyyds/ᛱᲁᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 65
    .line 66
    iput-object p1, p0, Lyyds/ᛱᲁᛳᛵ;->ᲇᲈᛵᛷ:[Ljava/lang/Object;

    .line 67
    .line 68
    return-void

    .line 69
    :cond_6
    const-string p0, "Deque is too big."

    .line 70
    .line 71
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    return-void
.end method
