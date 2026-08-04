.class public abstract Lyyds/ᛵᛸᛷᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final synthetic ᛵᛸᛸᛷ:J


# instance fields
.field private volatile synthetic _size$volatile:I

.field public ᛲᲈᲁ:[Lyyds/ᛷᲇᛷᲇ;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 2
    .line 3
    const-class v1, Lyyds/ᛵᛸᛷᲁ;

    .line 4
    .line 5
    const-string v2, "_size$volatile"

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    sput-wide v0, Lyyds/ᛵᛸᛷᲁ;->ᛵᛸᛸᛷ:J

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ(Lyyds/ᛷᲇᛷᲇ;)V
    .locals 6

    .line 1
    move-object v0, p0

    .line 2
    check-cast v0, Lyyds/ᲀᲁᛶᲀ;

    .line 3
    .line 4
    invoke-virtual {p1, v0}, Lyyds/ᛷᲇᛷᲇ;->ᲇᲈᛵᛷ(Lyyds/ᲀᲁᛶᲀ;)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lyyds/ᛵᛸᛷᲁ;->ᛲᲈᲁ:[Lyyds/ᛷᲇᛷᲇ;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x4

    .line 12
    new-array v0, v0, [Lyyds/ᛷᲇᛷᲇ;

    .line 13
    .line 14
    iput-object v0, p0, Lyyds/ᛵᛸᛷᲁ;->ᛲᲈᲁ:[Lyyds/ᛷᲇᛷᲇ;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {p0}, Lyyds/ᛵᛸᛷᲁ;->ᛵᛸᛸᛷ()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    array-length v2, v0

    .line 22
    if-lt v1, v2, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0}, Lyyds/ᛵᛸᛷᲁ;->ᛵᛸᛸᛷ()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    mul-int/lit8 v1, v1, 0x2

    .line 29
    .line 30
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, [Lyyds/ᛷᲇᛷᲇ;

    .line 35
    .line 36
    iput-object v0, p0, Lyyds/ᛵᛸᛷᲁ;->ᛲᲈᲁ:[Lyyds/ᛷᲇᛷᲇ;

    .line 37
    .line 38
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lyyds/ᛵᛸᛷᲁ;->ᛵᛸᛸᛷ()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    add-int/lit8 v2, v1, 0x1

    .line 43
    .line 44
    sget-object v3, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 45
    .line 46
    sget-wide v4, Lyyds/ᛵᛸᛷᲁ;->ᛵᛸᛸᛷ:J

    .line 47
    .line 48
    invoke-virtual {v3, p0, v4, v5, v2}, Lsun/misc/Unsafe;->putIntVolatile(Ljava/lang/Object;JI)V

    .line 49
    .line 50
    .line 51
    aput-object p1, v0, v1

    .line 52
    .line 53
    iput v1, p1, Lyyds/ᛷᲇᛷᲇ;->ᲇᲈᛵᛷ:I

    .line 54
    .line 55
    :goto_1
    if-gtz v1, :cond_2

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_2
    iget-object p1, p0, Lyyds/ᛵᛸᛷᲁ;->ᛲᲈᲁ:[Lyyds/ᛷᲇᛷᲇ;

    .line 59
    .line 60
    add-int/lit8 v0, v1, -0x1

    .line 61
    .line 62
    div-int/lit8 v0, v0, 0x2

    .line 63
    .line 64
    aget-object v2, p1, v0

    .line 65
    .line 66
    aget-object p1, p1, v1

    .line 67
    .line 68
    invoke-virtual {v2, p1}, Lyyds/ᛷᲇᛷᲇ;->compareTo(Ljava/lang/Object;)I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    if-gtz p1, :cond_3

    .line 73
    .line 74
    :goto_2
    return-void

    .line 75
    :cond_3
    invoke-virtual {p0, v1, v0}, Lyyds/ᛵᛸᛷᲁ;->ᲇᲈᛵᛷ(II)V

    .line 76
    .line 77
    .line 78
    move v1, v0

    .line 79
    goto :goto_1
.end method

.method public final ᛵᛸᛸᛷ()I
    .locals 3

    .line 1
    sget-object v0, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 2
    .line 3
    sget-wide v1, Lyyds/ᛵᛸᛷᲁ;->ᛵᛸᛸᛷ:J

    .line 4
    .line 5
    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getIntVolatile(Ljava/lang/Object;J)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final ᲀᛲᛳᲀ(I)Lyyds/ᛷᲇᛷᲇ;
    .locals 7

    .line 1
    iget-object v0, p0, Lyyds/ᛵᛸᛷᲁ;->ᛲᲈᲁ:[Lyyds/ᛷᲇᛷᲇ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lyyds/ᛵᛸᛷᲁ;->ᛵᛸᛸᛷ()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, -0x1

    .line 8
    add-int/2addr v1, v2

    .line 9
    sget-object v3, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 10
    .line 11
    sget-wide v4, Lyyds/ᛵᛸᛷᲁ;->ᛵᛸᛸᛷ:J

    .line 12
    .line 13
    invoke-virtual {v3, p0, v4, v5, v1}, Lsun/misc/Unsafe;->putIntVolatile(Ljava/lang/Object;JI)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lyyds/ᛵᛸᛷᲁ;->ᛵᛸᛸᛷ()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-ge p1, v1, :cond_6

    .line 21
    .line 22
    invoke-virtual {p0}, Lyyds/ᛵᛸᛷᲁ;->ᛵᛸᛸᛷ()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    invoke-virtual {p0, p1, v1}, Lyyds/ᛵᛸᛷᲁ;->ᲇᲈᛵᛷ(II)V

    .line 27
    .line 28
    .line 29
    add-int/lit8 v1, p1, -0x1

    .line 30
    .line 31
    div-int/lit8 v1, v1, 0x2

    .line 32
    .line 33
    if-lez p1, :cond_2

    .line 34
    .line 35
    aget-object v3, v0, p1

    .line 36
    .line 37
    aget-object v4, v0, v1

    .line 38
    .line 39
    invoke-virtual {v3, v4}, Lyyds/ᛷᲇᛷᲇ;->compareTo(Ljava/lang/Object;)I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-gez v3, :cond_2

    .line 44
    .line 45
    invoke-virtual {p0, p1, v1}, Lyyds/ᛵᛸᛷᲁ;->ᲇᲈᛵᛷ(II)V

    .line 46
    .line 47
    .line 48
    :goto_0
    if-gtz v1, :cond_0

    .line 49
    .line 50
    goto :goto_3

    .line 51
    :cond_0
    iget-object p1, p0, Lyyds/ᛵᛸᛷᲁ;->ᛲᲈᲁ:[Lyyds/ᛷᲇᛷᲇ;

    .line 52
    .line 53
    add-int/lit8 v3, v1, -0x1

    .line 54
    .line 55
    div-int/lit8 v3, v3, 0x2

    .line 56
    .line 57
    aget-object v4, p1, v3

    .line 58
    .line 59
    aget-object p1, p1, v1

    .line 60
    .line 61
    invoke-virtual {v4, p1}, Lyyds/ᛷᲇᛷᲇ;->compareTo(Ljava/lang/Object;)I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-gtz p1, :cond_1

    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_1
    invoke-virtual {p0, v1, v3}, Lyyds/ᛵᛸᛷᲁ;->ᲇᲈᛵᛷ(II)V

    .line 69
    .line 70
    .line 71
    move v1, v3

    .line 72
    goto :goto_0

    .line 73
    :cond_2
    :goto_1
    mul-int/lit8 v1, p1, 0x2

    .line 74
    .line 75
    add-int/lit8 v3, v1, 0x1

    .line 76
    .line 77
    invoke-virtual {p0}, Lyyds/ᛵᛸᛷᲁ;->ᛵᛸᛸᛷ()I

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    if-lt v3, v4, :cond_3

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_3
    iget-object v4, p0, Lyyds/ᛵᛸᛷᲁ;->ᛲᲈᲁ:[Lyyds/ᛷᲇᛷᲇ;

    .line 85
    .line 86
    add-int/lit8 v1, v1, 0x2

    .line 87
    .line 88
    invoke-virtual {p0}, Lyyds/ᛵᛸᛷᲁ;->ᛵᛸᛸᛷ()I

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    if-ge v1, v5, :cond_4

    .line 93
    .line 94
    aget-object v5, v4, v1

    .line 95
    .line 96
    aget-object v6, v4, v3

    .line 97
    .line 98
    invoke-virtual {v5, v6}, Lyyds/ᛷᲇᛷᲇ;->compareTo(Ljava/lang/Object;)I

    .line 99
    .line 100
    .line 101
    move-result v5

    .line 102
    if-gez v5, :cond_4

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_4
    move v1, v3

    .line 106
    :goto_2
    aget-object v3, v4, p1

    .line 107
    .line 108
    aget-object v4, v4, v1

    .line 109
    .line 110
    invoke-virtual {v3, v4}, Lyyds/ᛷᲇᛷᲇ;->compareTo(Ljava/lang/Object;)I

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    if-gtz v3, :cond_5

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_5
    invoke-virtual {p0, p1, v1}, Lyyds/ᛵᛸᛷᲁ;->ᲇᲈᛵᛷ(II)V

    .line 118
    .line 119
    .line 120
    move p1, v1

    .line 121
    goto :goto_1

    .line 122
    :cond_6
    :goto_3
    invoke-virtual {p0}, Lyyds/ᛵᛸᛷᲁ;->ᛵᛸᛸᛷ()I

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    aget-object p1, v0, p1

    .line 127
    .line 128
    const/4 v1, 0x0

    .line 129
    invoke-virtual {p1, v1}, Lyyds/ᛷᲇᛷᲇ;->ᲇᲈᛵᛷ(Lyyds/ᲀᲁᛶᲀ;)V

    .line 130
    .line 131
    .line 132
    iput v2, p1, Lyyds/ᛷᲇᛷᲇ;->ᲇᲈᛵᛷ:I

    .line 133
    .line 134
    invoke-virtual {p0}, Lyyds/ᛵᛸᛷᲁ;->ᛵᛸᛸᛷ()I

    .line 135
    .line 136
    .line 137
    move-result p0

    .line 138
    aput-object v1, v0, p0

    .line 139
    .line 140
    return-object p1
.end method

.method public final ᲇᲈᛵᛷ(II)V
    .locals 2

    .line 1
    iget-object p0, p0, Lyyds/ᛵᛸᛷᲁ;->ᛲᲈᲁ:[Lyyds/ᛷᲇᛷᲇ;

    .line 2
    .line 3
    aget-object v0, p0, p2

    .line 4
    .line 5
    aget-object v1, p0, p1

    .line 6
    .line 7
    aput-object v0, p0, p1

    .line 8
    .line 9
    aput-object v1, p0, p2

    .line 10
    .line 11
    iput p1, v0, Lyyds/ᛷᲇᛷᲇ;->ᲇᲈᛵᛷ:I

    .line 12
    .line 13
    iput p2, v1, Lyyds/ᛷᲇᛷᲇ;->ᲇᲈᛵᛷ:I

    .line 14
    .line 15
    return-void
.end method
