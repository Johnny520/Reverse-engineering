.class public final Lxhss/ᛱᲇᲈᛶ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final ᛱᛱᛲᲇ:Z

.field public final ᛳᲁᲇᛸ:Lxhss/ᲇᛶᲁᛶ;

.field public ᛷᛴᛷᛱ:I

.field public final ᛷᛵᛵᲈ:Lxhss/ᲇᲇᲈᛷ;

.field public final ᲀᲇᛳᲁ:Lxhss/ᛱᲇᲈᛶ;

.field public final ᲇᛴᲇᛵ:I

.field public final ᲇᛶᛴᲀ:Lxhss/ᛱᲇᲈᛶ;


# direct methods
.method public constructor <init>(Lxhss/ᲇᲇᲈᛷ;ZLxhss/ᲇᛶᲁᛶ;Lxhss/ᛱᲇᲈᛶ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᛱᲇᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲇᲈᛷ;

    .line 5
    .line 6
    iput-boolean p2, p0, Lxhss/ᛱᲇᲈᛶ;->ᛱᛱᛲᲇ:Z

    .line 7
    .line 8
    iput-object p3, p0, Lxhss/ᛱᲇᲈᛶ;->ᛳᲁᲇᛸ:Lxhss/ᲇᛶᲁᛶ;

    .line 9
    .line 10
    iget p1, p3, Lxhss/ᲇᛶᲁᛶ;->ᛳᲁᲇᛸ:I

    .line 11
    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    const/4 p1, -0x1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    add-int/lit8 p1, p1, -0x2

    .line 17
    .line 18
    :goto_0
    iput p1, p0, Lxhss/ᛱᲇᲈᛶ;->ᲇᛴᲇᛵ:I

    .line 19
    .line 20
    iput-object p4, p0, Lxhss/ᛱᲇᲈᛶ;->ᲇᛶᛴᲀ:Lxhss/ᛱᲇᲈᛶ;

    .line 21
    .line 22
    if-eqz p4, :cond_1

    .line 23
    .line 24
    iput-object p0, p4, Lxhss/ᛱᲇᲈᛶ;->ᲀᲇᛳᲁ:Lxhss/ᛱᲇᲈᛶ;

    .line 25
    .line 26
    :cond_1
    return-void
.end method

.method public static ᛱᛱᛲᲇ(Lxhss/ᛱᲇᲈᛶ;Lxhss/ᛱᲇᲈᛶ;Lxhss/ᛱᲇᲈᛶ;Lxhss/ᛱᲇᲈᛶ;)I
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    const-string v0, "RuntimeVisibleAnnotations"

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lxhss/ᛱᲇᲈᛶ;->ᛷᛵᛵᲈ(Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    :goto_0
    if-eqz p1, :cond_1

    .line 12
    .line 13
    const-string v0, "RuntimeInvisibleAnnotations"

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Lxhss/ᛱᲇᲈᛶ;->ᛷᛵᛵᲈ(Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    add-int/2addr p0, p1

    .line 20
    :cond_1
    if-eqz p2, :cond_2

    .line 21
    .line 22
    const-string p1, "RuntimeVisibleTypeAnnotations"

    .line 23
    .line 24
    invoke-virtual {p2, p1}, Lxhss/ᛱᲇᲈᛶ;->ᛷᛵᛵᲈ(Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    add-int/2addr p0, p1

    .line 29
    :cond_2
    if-eqz p3, :cond_3

    .line 30
    .line 31
    const-string p1, "RuntimeInvisibleTypeAnnotations"

    .line 32
    .line 33
    invoke-virtual {p3, p1}, Lxhss/ᛱᲇᲈᛶ;->ᛷᛵᛵᲈ(Ljava/lang/String;)I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    add-int/2addr p1, p0

    .line 38
    return p1

    .line 39
    :cond_3
    return p0
.end method

.method public static ᛳᲁᲇᛸ(Ljava/lang/String;[Lxhss/ᛱᲇᲈᛶ;I)I
    .locals 4

    .line 1
    mul-int/lit8 v0, p2, 0x2

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x7

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :goto_0
    if-ge v2, p2, :cond_1

    .line 8
    .line 9
    aget-object v3, p1, v2

    .line 10
    .line 11
    if-nez v3, :cond_0

    .line 12
    .line 13
    move v3, v1

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    invoke-virtual {v3, p0}, Lxhss/ᛱᲇᲈᛶ;->ᛷᛵᛵᲈ(Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    add-int/lit8 v3, v3, -0x8

    .line 20
    .line 21
    :goto_1
    add-int/2addr v0, v3

    .line 22
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    return v0
.end method

.method public static ᛷᛴᛷᛱ(Lxhss/ᲇᲇᲈᛷ;Ljava/lang/String;Lxhss/ᛱᲇᲈᛶ;)Lxhss/ᛱᲇᲈᛶ;
    .locals 2

    .line 1
    new-instance v0, Lxhss/ᲇᛶᲁᛶ;

    .line 2
    .line 3
    invoke-direct {v0}, Lxhss/ᲇᛶᲁᛶ;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lxhss/ᲇᲇᲈᛷ;->ᛸᛲᲀᛵ(Ljava/lang/String;)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    invoke-virtual {v0, p1}, Lxhss/ᲇᛶᲁᛶ;->ᛸᛷᲈᲈ(I)V

    .line 11
    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    invoke-virtual {v0, p1}, Lxhss/ᲇᛶᲁᛶ;->ᛸᛷᲈᲈ(I)V

    .line 15
    .line 16
    .line 17
    new-instance p1, Lxhss/ᛱᲇᲈᛶ;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {p1, p0, v1, v0, p2}, Lxhss/ᛱᲇᲈᛶ;-><init>(Lxhss/ᲇᲇᲈᛷ;ZLxhss/ᲇᛶᲁᛶ;Lxhss/ᛱᲇᲈᛶ;)V

    .line 21
    .line 22
    .line 23
    return-object p1
.end method

.method public static ᛸᛴᛶᛳ(I[Lxhss/ᛱᲇᲈᛶ;ILxhss/ᲇᛶᲁᛶ;)V
    .locals 6

    .line 1
    mul-int/lit8 v0, p2, 0x2

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :goto_0
    const/4 v3, 0x0

    .line 8
    if-ge v2, p2, :cond_1

    .line 9
    .line 10
    aget-object v4, p1, v2

    .line 11
    .line 12
    if-nez v4, :cond_0

    .line 13
    .line 14
    move v3, v1

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    invoke-virtual {v4, v3}, Lxhss/ᛱᲇᲈᛶ;->ᛷᛵᛵᲈ(Ljava/lang/String;)I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    add-int/lit8 v3, v3, -0x8

    .line 21
    .line 22
    :goto_1
    add-int/2addr v0, v3

    .line 23
    add-int/lit8 v2, v2, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    invoke-virtual {p3, p0}, Lxhss/ᲇᛶᲁᛶ;->ᛸᛷᲈᲈ(I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p3, v0}, Lxhss/ᲇᛶᲁᛶ;->ᛸᛲᲀᛵ(I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p3, p2}, Lxhss/ᲇᛶᲁᛶ;->ᲀᲇᛳᲁ(I)V

    .line 33
    .line 34
    .line 35
    move p0, v1

    .line 36
    :goto_2
    if-ge p0, p2, :cond_4

    .line 37
    .line 38
    aget-object v0, p1, p0

    .line 39
    .line 40
    move v2, v1

    .line 41
    move-object v4, v3

    .line 42
    :goto_3
    if-eqz v0, :cond_2

    .line 43
    .line 44
    invoke-virtual {v0}, Lxhss/ᛱᲇᲈᛶ;->ᲈᛳᲀ()V

    .line 45
    .line 46
    .line 47
    add-int/lit8 v2, v2, 0x1

    .line 48
    .line 49
    iget-object v4, v0, Lxhss/ᛱᲇᲈᛶ;->ᲇᛶᛴᲀ:Lxhss/ᛱᲇᲈᛶ;

    .line 50
    .line 51
    move-object v5, v4

    .line 52
    move-object v4, v0

    .line 53
    move-object v0, v5

    .line 54
    goto :goto_3

    .line 55
    :cond_2
    invoke-virtual {p3, v2}, Lxhss/ᲇᛶᲁᛶ;->ᛸᛷᲈᲈ(I)V

    .line 56
    .line 57
    .line 58
    :goto_4
    if-eqz v4, :cond_3

    .line 59
    .line 60
    iget-object v0, v4, Lxhss/ᛱᲇᲈᛶ;->ᛳᲁᲇᛸ:Lxhss/ᲇᛶᲁᛶ;

    .line 61
    .line 62
    iget-object v2, v0, Lxhss/ᲇᛶᲁᛶ;->ᛱᛱᛲᲇ:[B

    .line 63
    .line 64
    iget v0, v0, Lxhss/ᲇᛶᲁᛶ;->ᛳᲁᲇᛸ:I

    .line 65
    .line 66
    invoke-virtual {p3, v2, v1, v0}, Lxhss/ᲇᛶᲁᛶ;->ᛸᛴᛶᛳ([BII)V

    .line 67
    .line 68
    .line 69
    iget-object v4, v4, Lxhss/ᛱᲇᲈᛶ;->ᲀᲇᛳᲁ:Lxhss/ᛱᲇᲈᛶ;

    .line 70
    .line 71
    goto :goto_4

    .line 72
    :cond_3
    add-int/lit8 p0, p0, 0x1

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_4
    return-void
.end method

.method public static ᲀᲇᛳᲁ(Lxhss/ᲇᲇᲈᛷ;Lxhss/ᛱᲇᲈᛶ;Lxhss/ᛱᲇᲈᛶ;Lxhss/ᛱᲇᲈᛶ;Lxhss/ᛱᲇᲈᛶ;Lxhss/ᲇᛶᲁᛶ;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const-string v0, "RuntimeVisibleAnnotations"

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lxhss/ᲇᲇᲈᛷ;->ᛸᛲᲀᛵ(Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p1, v0, p5}, Lxhss/ᛱᲇᲈᛶ;->ᲇᛶᛴᲀ(ILxhss/ᲇᛶᲁᛶ;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    if-eqz p2, :cond_1

    .line 13
    .line 14
    const-string p1, "RuntimeInvisibleAnnotations"

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lxhss/ᲇᲇᲈᛷ;->ᛸᛲᲀᛵ(Ljava/lang/String;)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-virtual {p2, p1, p5}, Lxhss/ᛱᲇᲈᛶ;->ᲇᛶᛴᲀ(ILxhss/ᲇᛶᲁᛶ;)V

    .line 21
    .line 22
    .line 23
    :cond_1
    if-eqz p3, :cond_2

    .line 24
    .line 25
    const-string p1, "RuntimeVisibleTypeAnnotations"

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lxhss/ᲇᲇᲈᛷ;->ᛸᛲᲀᛵ(Ljava/lang/String;)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    invoke-virtual {p3, p1, p5}, Lxhss/ᛱᲇᲈᛶ;->ᲇᛶᛴᲀ(ILxhss/ᲇᛶᲁᛶ;)V

    .line 32
    .line 33
    .line 34
    :cond_2
    if-eqz p4, :cond_3

    .line 35
    .line 36
    const-string p1, "RuntimeInvisibleTypeAnnotations"

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Lxhss/ᲇᲇᲈᛷ;->ᛸᛲᲀᛵ(Ljava/lang/String;)I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    invoke-virtual {p4, p0, p5}, Lxhss/ᛱᲇᲈᛶ;->ᲇᛶᛴᲀ(ILxhss/ᲇᛶᲁᛶ;)V

    .line 43
    .line 44
    .line 45
    :cond_3
    return-void
.end method

.method public static ᲇᛴᲇᛵ(Lxhss/ᲇᲇᲈᛷ;ILxhss/ᲇᛶᲁᛶ;Ljava/lang/String;Lxhss/ᛱᲇᲈᛶ;)Lxhss/ᛱᲇᲈᛶ;
    .locals 4

    .line 1
    new-instance v0, Lxhss/ᲇᛶᲁᛶ;

    .line 2
    .line 3
    invoke-direct {v0}, Lxhss/ᲇᛶᲁᛶ;-><init>()V

    .line 4
    .line 5
    .line 6
    ushr-int/lit8 v1, p1, 0x18

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    if-eq v1, v2, :cond_0

    .line 12
    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    packed-switch v1, :pswitch_data_1

    .line 17
    .line 18
    .line 19
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 22
    .line 23
    .line 24
    throw p0

    .line 25
    :pswitch_0
    invoke-virtual {v0, p1}, Lxhss/ᲇᛶᲁᛶ;->ᛸᛲᲀᛵ(I)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :pswitch_1
    invoke-virtual {v0, v1}, Lxhss/ᲇᛶᲁᛶ;->ᲀᲇᛳᲁ(I)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :pswitch_2
    const v3, 0xffff00

    .line 34
    .line 35
    .line 36
    and-int/2addr p1, v3

    .line 37
    shr-int/lit8 p1, p1, 0x8

    .line 38
    .line 39
    invoke-virtual {v0, v1, p1}, Lxhss/ᲇᛶᲁᛶ;->ᛷᛴᛷᛱ(II)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    :pswitch_3
    ushr-int/lit8 p1, p1, 0x10

    .line 44
    .line 45
    invoke-virtual {v0, p1}, Lxhss/ᲇᛶᲁᛶ;->ᛸᛷᲈᲈ(I)V

    .line 46
    .line 47
    .line 48
    :goto_0
    const/4 p1, 0x0

    .line 49
    if-nez p2, :cond_1

    .line 50
    .line 51
    invoke-virtual {v0, p1}, Lxhss/ᲇᛶᲁᛶ;->ᲀᲇᛳᲁ(I)V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    iget-object v1, p2, Lxhss/ᲇᛶᲁᛶ;->ᛱᛱᛲᲇ:[B

    .line 56
    .line 57
    iget p2, p2, Lxhss/ᲇᛶᲁᛶ;->ᛳᲁᲇᛸ:I

    .line 58
    .line 59
    aget-byte v3, v1, p2

    .line 60
    .line 61
    mul-int/lit8 v3, v3, 0x2

    .line 62
    .line 63
    add-int/2addr v3, v2

    .line 64
    invoke-virtual {v0, v1, p2, v3}, Lxhss/ᲇᛶᲁᛶ;->ᛸᛴᛶᛳ([BII)V

    .line 65
    .line 66
    .line 67
    :goto_1
    invoke-virtual {p0, p3}, Lxhss/ᲇᲇᲈᛷ;->ᛸᛲᲀᛵ(Ljava/lang/String;)I

    .line 68
    .line 69
    .line 70
    move-result p2

    .line 71
    invoke-virtual {v0, p2}, Lxhss/ᲇᛶᲁᛶ;->ᛸᛷᲈᲈ(I)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, p1}, Lxhss/ᲇᛶᲁᛶ;->ᛸᛷᲈᲈ(I)V

    .line 75
    .line 76
    .line 77
    new-instance p1, Lxhss/ᛱᲇᲈᛶ;

    .line 78
    .line 79
    invoke-direct {p1, p0, v2, v0, p4}, Lxhss/ᛱᲇᲈᛶ;-><init>(Lxhss/ᲇᲇᲈᛷ;ZLxhss/ᲇᛶᲁᛶ;Lxhss/ᛱᲇᲈᛶ;)V

    .line 80
    .line 81
    .line 82
    return-object p1

    .line 83
    :pswitch_data_0
    .packed-switch 0x10
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_3
        :pswitch_2
    .end packed-switch

    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    :pswitch_data_1
    .packed-switch 0x42
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final ᛷᛵᛵᲈ(Ljava/lang/String;)I
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lxhss/ᛱᲇᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲇᲈᛷ;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lxhss/ᲇᲇᲈᛷ;->ᛸᛲᲀᛵ(Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    :cond_0
    const/16 p1, 0x8

    .line 9
    .line 10
    :goto_0
    if-eqz p0, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Lxhss/ᛱᲇᲈᛶ;->ᛳᲁᲇᛸ:Lxhss/ᲇᛶᲁᛶ;

    .line 13
    .line 14
    iget v0, v0, Lxhss/ᲇᛶᲁᛶ;->ᛳᲁᲇᛸ:I

    .line 15
    .line 16
    add-int/2addr p1, v0

    .line 17
    iget-object p0, p0, Lxhss/ᛱᲇᲈᛶ;->ᲇᛶᛴᲀ:Lxhss/ᛱᲇᲈᛶ;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    return p1
.end method

.method public final ᛸᛲᲀᛵ(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 8

    .line 1
    iget v0, p0, Lxhss/ᛱᲇᲈᛶ;->ᛷᛴᛷᛱ:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lxhss/ᛱᲇᲈᛶ;->ᛷᛴᛷᛱ:I

    .line 6
    .line 7
    iget-boolean v0, p0, Lxhss/ᛱᲇᲈᛶ;->ᛱᛱᛲᲇ:Z

    .line 8
    .line 9
    iget-object v1, p0, Lxhss/ᛱᲇᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲇᲈᛷ;

    .line 10
    .line 11
    iget-object p0, p0, Lxhss/ᛱᲇᲈᛶ;->ᛳᲁᲇᛸ:Lxhss/ᲇᛶᲁᛶ;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1, p2}, Lxhss/ᲇᲇᲈᛷ;->ᛸᛲᲀᛵ(Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    invoke-virtual {p0, p2}, Lxhss/ᲇᛶᲁᛶ;->ᛸᛷᲈᲈ(I)V

    .line 20
    .line 21
    .line 22
    :cond_0
    instance-of p2, p1, Ljava/lang/String;

    .line 23
    .line 24
    if-eqz p2, :cond_1

    .line 25
    .line 26
    check-cast p1, Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v1, p1}, Lxhss/ᲇᲇᲈᛷ;->ᛸᛲᲀᛵ(Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    const/16 p2, 0x73

    .line 33
    .line 34
    invoke-virtual {p0, p2, p1}, Lxhss/ᲇᛶᲁᛶ;->ᛷᛴᛷᛱ(II)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    instance-of p2, p1, Ljava/lang/Byte;

    .line 39
    .line 40
    const/16 v0, 0x42

    .line 41
    .line 42
    const/4 v2, 0x3

    .line 43
    if-eqz p2, :cond_2

    .line 44
    .line 45
    check-cast p1, Ljava/lang/Byte;

    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/Byte;->byteValue()B

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    invoke-virtual {v1, v2, p1}, Lxhss/ᲇᲇᲈᛷ;->ᲇᛴᲇᛵ(II)Lxhss/ᛳᛴᛶᛷ;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iget p1, p1, Lxhss/ᛳᛴᛶᛷ;->ᛷᛵᛵᲈ:I

    .line 56
    .line 57
    invoke-virtual {p0, v0, p1}, Lxhss/ᲇᛶᲁᛶ;->ᛷᛴᛷᛱ(II)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_2
    instance-of p2, p1, Ljava/lang/Boolean;

    .line 62
    .line 63
    const/16 v3, 0x5a

    .line 64
    .line 65
    if-eqz p2, :cond_3

    .line 66
    .line 67
    check-cast p1, Ljava/lang/Boolean;

    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    invoke-virtual {v1, v2, p1}, Lxhss/ᲇᲇᲈᛷ;->ᲇᛴᲇᛵ(II)Lxhss/ᛳᛴᛶᛷ;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    iget p1, p1, Lxhss/ᛳᛴᛶᛷ;->ᛷᛵᛵᲈ:I

    .line 78
    .line 79
    invoke-virtual {p0, v3, p1}, Lxhss/ᲇᛶᲁᛶ;->ᛷᛴᛷᛱ(II)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_3
    instance-of p2, p1, Ljava/lang/Character;

    .line 84
    .line 85
    const/16 v4, 0x43

    .line 86
    .line 87
    if-eqz p2, :cond_4

    .line 88
    .line 89
    check-cast p1, Ljava/lang/Character;

    .line 90
    .line 91
    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    invoke-virtual {v1, v2, p1}, Lxhss/ᲇᲇᲈᛷ;->ᲇᛴᲇᛵ(II)Lxhss/ᛳᛴᛶᛷ;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    iget p1, p1, Lxhss/ᛳᛴᛶᛷ;->ᛷᛵᛵᲈ:I

    .line 100
    .line 101
    invoke-virtual {p0, v4, p1}, Lxhss/ᲇᛶᲁᛶ;->ᛷᛴᛷᛱ(II)V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :cond_4
    instance-of p2, p1, Ljava/lang/Short;

    .line 106
    .line 107
    const/16 v5, 0x53

    .line 108
    .line 109
    if-eqz p2, :cond_5

    .line 110
    .line 111
    check-cast p1, Ljava/lang/Short;

    .line 112
    .line 113
    invoke-virtual {p1}, Ljava/lang/Short;->shortValue()S

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    invoke-virtual {v1, v2, p1}, Lxhss/ᲇᲇᲈᛷ;->ᲇᛴᲇᛵ(II)Lxhss/ᛳᛴᛶᛷ;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    iget p1, p1, Lxhss/ᛳᛴᛶᛷ;->ᛷᛵᛵᲈ:I

    .line 122
    .line 123
    invoke-virtual {p0, v5, p1}, Lxhss/ᲇᛶᲁᛶ;->ᛷᛴᛷᛱ(II)V

    .line 124
    .line 125
    .line 126
    return-void

    .line 127
    :cond_5
    instance-of p2, p1, Lxhss/ᲀᛲᲀᲈ;

    .line 128
    .line 129
    if-eqz p2, :cond_6

    .line 130
    .line 131
    check-cast p1, Lxhss/ᲀᛲᲀᲈ;

    .line 132
    .line 133
    invoke-virtual {p1}, Lxhss/ᲀᛲᲀᲈ;->ᲇᛴᲇᛵ()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    invoke-virtual {v1, p1}, Lxhss/ᲇᲇᲈᛷ;->ᛸᛲᲀᛵ(Ljava/lang/String;)I

    .line 138
    .line 139
    .line 140
    move-result p1

    .line 141
    const/16 p2, 0x63

    .line 142
    .line 143
    invoke-virtual {p0, p2, p1}, Lxhss/ᲇᛶᲁᛶ;->ᛷᛴᛷᛱ(II)V

    .line 144
    .line 145
    .line 146
    return-void

    .line 147
    :cond_6
    instance-of p2, p1, [B

    .line 148
    .line 149
    const/4 v6, 0x0

    .line 150
    const/16 v7, 0x5b

    .line 151
    .line 152
    if-eqz p2, :cond_7

    .line 153
    .line 154
    check-cast p1, [B

    .line 155
    .line 156
    array-length p2, p1

    .line 157
    invoke-virtual {p0, v7, p2}, Lxhss/ᲇᛶᲁᛶ;->ᛷᛴᛷᛱ(II)V

    .line 158
    .line 159
    .line 160
    array-length p2, p1

    .line 161
    :goto_0
    if-ge v6, p2, :cond_e

    .line 162
    .line 163
    aget-byte v3, p1, v6

    .line 164
    .line 165
    invoke-virtual {v1, v2, v3}, Lxhss/ᲇᲇᲈᛷ;->ᲇᛴᲇᛵ(II)Lxhss/ᛳᛴᛶᛷ;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    iget v3, v3, Lxhss/ᛳᛴᛶᛷ;->ᛷᛵᛵᲈ:I

    .line 170
    .line 171
    invoke-virtual {p0, v0, v3}, Lxhss/ᲇᛶᲁᛶ;->ᛷᛴᛷᛱ(II)V

    .line 172
    .line 173
    .line 174
    add-int/lit8 v6, v6, 0x1

    .line 175
    .line 176
    goto :goto_0

    .line 177
    :cond_7
    instance-of p2, p1, [Z

    .line 178
    .line 179
    if-eqz p2, :cond_8

    .line 180
    .line 181
    check-cast p1, [Z

    .line 182
    .line 183
    array-length p2, p1

    .line 184
    invoke-virtual {p0, v7, p2}, Lxhss/ᲇᛶᲁᛶ;->ᛷᛴᛷᛱ(II)V

    .line 185
    .line 186
    .line 187
    array-length p2, p1

    .line 188
    :goto_1
    if-ge v6, p2, :cond_e

    .line 189
    .line 190
    aget-boolean v0, p1, v6

    .line 191
    .line 192
    invoke-virtual {v1, v2, v0}, Lxhss/ᲇᲇᲈᛷ;->ᲇᛴᲇᛵ(II)Lxhss/ᛳᛴᛶᛷ;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    iget v0, v0, Lxhss/ᛳᛴᛶᛷ;->ᛷᛵᛵᲈ:I

    .line 197
    .line 198
    invoke-virtual {p0, v3, v0}, Lxhss/ᲇᛶᲁᛶ;->ᛷᛴᛷᛱ(II)V

    .line 199
    .line 200
    .line 201
    add-int/lit8 v6, v6, 0x1

    .line 202
    .line 203
    goto :goto_1

    .line 204
    :cond_8
    instance-of p2, p1, [S

    .line 205
    .line 206
    if-eqz p2, :cond_9

    .line 207
    .line 208
    check-cast p1, [S

    .line 209
    .line 210
    array-length p2, p1

    .line 211
    invoke-virtual {p0, v7, p2}, Lxhss/ᲇᛶᲁᛶ;->ᛷᛴᛷᛱ(II)V

    .line 212
    .line 213
    .line 214
    array-length p2, p1

    .line 215
    :goto_2
    if-ge v6, p2, :cond_e

    .line 216
    .line 217
    aget-short v0, p1, v6

    .line 218
    .line 219
    invoke-virtual {v1, v2, v0}, Lxhss/ᲇᲇᲈᛷ;->ᲇᛴᲇᛵ(II)Lxhss/ᛳᛴᛶᛷ;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    iget v0, v0, Lxhss/ᛳᛴᛶᛷ;->ᛷᛵᛵᲈ:I

    .line 224
    .line 225
    invoke-virtual {p0, v5, v0}, Lxhss/ᲇᛶᲁᛶ;->ᛷᛴᛷᛱ(II)V

    .line 226
    .line 227
    .line 228
    add-int/lit8 v6, v6, 0x1

    .line 229
    .line 230
    goto :goto_2

    .line 231
    :cond_9
    instance-of p2, p1, [C

    .line 232
    .line 233
    if-eqz p2, :cond_a

    .line 234
    .line 235
    check-cast p1, [C

    .line 236
    .line 237
    array-length p2, p1

    .line 238
    invoke-virtual {p0, v7, p2}, Lxhss/ᲇᛶᲁᛶ;->ᛷᛴᛷᛱ(II)V

    .line 239
    .line 240
    .line 241
    array-length p2, p1

    .line 242
    :goto_3
    if-ge v6, p2, :cond_e

    .line 243
    .line 244
    aget-char v0, p1, v6

    .line 245
    .line 246
    invoke-virtual {v1, v2, v0}, Lxhss/ᲇᲇᲈᛷ;->ᲇᛴᲇᛵ(II)Lxhss/ᛳᛴᛶᛷ;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    iget v0, v0, Lxhss/ᛳᛴᛶᛷ;->ᛷᛵᛵᲈ:I

    .line 251
    .line 252
    invoke-virtual {p0, v4, v0}, Lxhss/ᲇᛶᲁᛶ;->ᛷᛴᛷᛱ(II)V

    .line 253
    .line 254
    .line 255
    add-int/lit8 v6, v6, 0x1

    .line 256
    .line 257
    goto :goto_3

    .line 258
    :cond_a
    instance-of p2, p1, [I

    .line 259
    .line 260
    if-eqz p2, :cond_b

    .line 261
    .line 262
    check-cast p1, [I

    .line 263
    .line 264
    array-length p2, p1

    .line 265
    invoke-virtual {p0, v7, p2}, Lxhss/ᲇᛶᲁᛶ;->ᛷᛴᛷᛱ(II)V

    .line 266
    .line 267
    .line 268
    array-length p2, p1

    .line 269
    :goto_4
    if-ge v6, p2, :cond_e

    .line 270
    .line 271
    aget v0, p1, v6

    .line 272
    .line 273
    invoke-virtual {v1, v2, v0}, Lxhss/ᲇᲇᲈᛷ;->ᲇᛴᲇᛵ(II)Lxhss/ᛳᛴᛶᛷ;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    iget v0, v0, Lxhss/ᛳᛴᛶᛷ;->ᛷᛵᛵᲈ:I

    .line 278
    .line 279
    const/16 v3, 0x49

    .line 280
    .line 281
    invoke-virtual {p0, v3, v0}, Lxhss/ᲇᛶᲁᛶ;->ᛷᛴᛷᛱ(II)V

    .line 282
    .line 283
    .line 284
    add-int/lit8 v6, v6, 0x1

    .line 285
    .line 286
    goto :goto_4

    .line 287
    :cond_b
    instance-of p2, p1, [J

    .line 288
    .line 289
    if-eqz p2, :cond_c

    .line 290
    .line 291
    check-cast p1, [J

    .line 292
    .line 293
    array-length p2, p1

    .line 294
    invoke-virtual {p0, v7, p2}, Lxhss/ᲇᛶᲁᛶ;->ᛷᛴᛷᛱ(II)V

    .line 295
    .line 296
    .line 297
    array-length p2, p1

    .line 298
    :goto_5
    if-ge v6, p2, :cond_e

    .line 299
    .line 300
    aget-wide v2, p1, v6

    .line 301
    .line 302
    const/4 v0, 0x5

    .line 303
    invoke-virtual {v1, v2, v3, v0}, Lxhss/ᲇᲇᲈᛷ;->ᛷᛴᛷᛱ(JI)Lxhss/ᛳᛴᛶᛷ;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    iget v0, v0, Lxhss/ᛳᛴᛶᛷ;->ᛷᛵᛵᲈ:I

    .line 308
    .line 309
    const/16 v2, 0x4a

    .line 310
    .line 311
    invoke-virtual {p0, v2, v0}, Lxhss/ᲇᛶᲁᛶ;->ᛷᛴᛷᛱ(II)V

    .line 312
    .line 313
    .line 314
    add-int/lit8 v6, v6, 0x1

    .line 315
    .line 316
    goto :goto_5

    .line 317
    :cond_c
    instance-of p2, p1, [F

    .line 318
    .line 319
    if-eqz p2, :cond_d

    .line 320
    .line 321
    check-cast p1, [F

    .line 322
    .line 323
    array-length p2, p1

    .line 324
    invoke-virtual {p0, v7, p2}, Lxhss/ᲇᛶᲁᛶ;->ᛷᛴᛷᛱ(II)V

    .line 325
    .line 326
    .line 327
    array-length p2, p1

    .line 328
    :goto_6
    if-ge v6, p2, :cond_e

    .line 329
    .line 330
    aget v0, p1, v6

    .line 331
    .line 332
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 333
    .line 334
    .line 335
    const/4 v2, 0x4

    .line 336
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 337
    .line 338
    .line 339
    move-result v0

    .line 340
    invoke-virtual {v1, v2, v0}, Lxhss/ᲇᲇᲈᛷ;->ᲇᛴᲇᛵ(II)Lxhss/ᛳᛴᛶᛷ;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    iget v0, v0, Lxhss/ᛳᛴᛶᛷ;->ᛷᛵᛵᲈ:I

    .line 345
    .line 346
    const/16 v2, 0x46

    .line 347
    .line 348
    invoke-virtual {p0, v2, v0}, Lxhss/ᲇᛶᲁᛶ;->ᛷᛴᛷᛱ(II)V

    .line 349
    .line 350
    .line 351
    add-int/lit8 v6, v6, 0x1

    .line 352
    .line 353
    goto :goto_6

    .line 354
    :cond_d
    instance-of p2, p1, [D

    .line 355
    .line 356
    if-eqz p2, :cond_f

    .line 357
    .line 358
    check-cast p1, [D

    .line 359
    .line 360
    array-length p2, p1

    .line 361
    invoke-virtual {p0, v7, p2}, Lxhss/ᲇᛶᲁᛶ;->ᛷᛴᛷᛱ(II)V

    .line 362
    .line 363
    .line 364
    array-length p2, p1

    .line 365
    :goto_7
    if-ge v6, p2, :cond_e

    .line 366
    .line 367
    aget-wide v2, p1, v6

    .line 368
    .line 369
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 370
    .line 371
    .line 372
    const/4 v0, 0x6

    .line 373
    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    .line 374
    .line 375
    .line 376
    move-result-wide v2

    .line 377
    invoke-virtual {v1, v2, v3, v0}, Lxhss/ᲇᲇᲈᛷ;->ᛷᛴᛷᛱ(JI)Lxhss/ᛳᛴᛶᛷ;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    iget v0, v0, Lxhss/ᛳᛴᛶᛷ;->ᛷᛵᛵᲈ:I

    .line 382
    .line 383
    const/16 v2, 0x44

    .line 384
    .line 385
    invoke-virtual {p0, v2, v0}, Lxhss/ᲇᛶᲁᛶ;->ᛷᛴᛷᛱ(II)V

    .line 386
    .line 387
    .line 388
    add-int/lit8 v6, v6, 0x1

    .line 389
    .line 390
    goto :goto_7

    .line 391
    :cond_e
    return-void

    .line 392
    :cond_f
    invoke-virtual {v1, p1}, Lxhss/ᲇᲇᲈᛷ;->ᛱᛱᛲᲇ(Ljava/lang/Object;)Lxhss/ᛳᛴᛶᛷ;

    .line 393
    .line 394
    .line 395
    move-result-object p1

    .line 396
    const-string p2, ".s.IFJDCS"

    .line 397
    .line 398
    iget v0, p1, Lxhss/ᛳᛴᛶᛷ;->ᛱᛱᛲᲇ:I

    .line 399
    .line 400
    invoke-virtual {p2, v0}, Ljava/lang/String;->charAt(I)C

    .line 401
    .line 402
    .line 403
    move-result p2

    .line 404
    iget p1, p1, Lxhss/ᛳᛴᛶᛷ;->ᛷᛵᛵᲈ:I

    .line 405
    .line 406
    invoke-virtual {p0, p2, p1}, Lxhss/ᲇᛶᲁᛶ;->ᛷᛴᛷᛱ(II)V

    .line 407
    .line 408
    .line 409
    return-void
.end method

.method public final ᛸᛷᲈᲈ(Ljava/lang/String;)Lxhss/ᛱᲇᲈᛶ;
    .locals 3

    .line 1
    iget v0, p0, Lxhss/ᛱᲇᲈᛶ;->ᛷᛴᛷᛱ:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lxhss/ᛱᲇᲈᛶ;->ᛷᛴᛷᛱ:I

    .line 6
    .line 7
    iget-boolean v0, p0, Lxhss/ᛱᲇᲈᛶ;->ᛱᛱᛲᲇ:Z

    .line 8
    .line 9
    iget-object v1, p0, Lxhss/ᛱᲇᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲇᲈᛷ;

    .line 10
    .line 11
    iget-object p0, p0, Lxhss/ᛱᲇᲈᛶ;->ᛳᲁᲇᛸ:Lxhss/ᲇᛶᲁᛶ;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1, p1}, Lxhss/ᲇᲇᲈᛷ;->ᛸᛲᲀᛵ(Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    invoke-virtual {p0, p1}, Lxhss/ᲇᛶᲁᛶ;->ᛸᛷᲈᲈ(I)V

    .line 20
    .line 21
    .line 22
    :cond_0
    const/16 p1, 0x5b

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-virtual {p0, p1, v0}, Lxhss/ᲇᛶᲁᛶ;->ᛷᛴᛷᛱ(II)V

    .line 26
    .line 27
    .line 28
    new-instance p1, Lxhss/ᛱᲇᲈᛶ;

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    invoke-direct {p1, v1, v0, p0, v2}, Lxhss/ᛱᲇᲈᛶ;-><init>(Lxhss/ᲇᲇᲈᛷ;ZLxhss/ᲇᛶᲁᛶ;Lxhss/ᛱᲇᲈᛶ;)V

    .line 32
    .line 33
    .line 34
    return-object p1
.end method

.method public final ᲇᛶᛴᲀ(ILxhss/ᲇᛶᲁᛶ;)V
    .locals 5

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x0

    .line 4
    move v3, v1

    .line 5
    :goto_0
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lxhss/ᛱᲇᲈᛶ;->ᲈᛳᲀ()V

    .line 8
    .line 9
    .line 10
    iget-object v2, p0, Lxhss/ᛱᲇᲈᛶ;->ᛳᲁᲇᛸ:Lxhss/ᲇᛶᲁᛶ;

    .line 11
    .line 12
    iget v2, v2, Lxhss/ᲇᛶᲁᛶ;->ᛳᲁᲇᛸ:I

    .line 13
    .line 14
    add-int/2addr v0, v2

    .line 15
    add-int/lit8 v3, v3, 0x1

    .line 16
    .line 17
    iget-object v2, p0, Lxhss/ᛱᲇᲈᛶ;->ᲇᛶᛴᲀ:Lxhss/ᛱᲇᲈᛶ;

    .line 18
    .line 19
    move-object v4, v2

    .line 20
    move-object v2, p0

    .line 21
    move-object p0, v4

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {p2, p1}, Lxhss/ᲇᛶᲁᛶ;->ᛸᛷᲈᲈ(I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p2, v0}, Lxhss/ᲇᛶᲁᛶ;->ᛸᛲᲀᛵ(I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p2, v3}, Lxhss/ᲇᛶᲁᛶ;->ᛸᛷᲈᲈ(I)V

    .line 30
    .line 31
    .line 32
    :goto_1
    if-eqz v2, :cond_1

    .line 33
    .line 34
    iget-object p0, v2, Lxhss/ᛱᲇᲈᛶ;->ᛳᲁᲇᛸ:Lxhss/ᲇᛶᲁᛶ;

    .line 35
    .line 36
    iget-object p1, p0, Lxhss/ᲇᛶᲁᛶ;->ᛱᛱᛲᲇ:[B

    .line 37
    .line 38
    iget p0, p0, Lxhss/ᲇᛶᲁᛶ;->ᛳᲁᲇᛸ:I

    .line 39
    .line 40
    invoke-virtual {p2, p1, v1, p0}, Lxhss/ᲇᛶᲁᛶ;->ᛸᛴᛶᛳ([BII)V

    .line 41
    .line 42
    .line 43
    iget-object v2, v2, Lxhss/ᛱᲇᲈᛶ;->ᲀᲇᛳᲁ:Lxhss/ᛱᲇᲈᛶ;

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    return-void
.end method

.method public final ᲈᛳᲀ()V
    .locals 3

    .line 1
    const/4 v0, -0x1

    .line 2
    iget v1, p0, Lxhss/ᛱᲇᲈᛶ;->ᲇᛴᲇᛵ:I

    .line 3
    .line 4
    if-eq v1, v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lxhss/ᛱᲇᲈᛶ;->ᛳᲁᲇᛸ:Lxhss/ᲇᛶᲁᛶ;

    .line 7
    .line 8
    iget-object v0, v0, Lxhss/ᲇᛶᲁᛶ;->ᛱᛱᛲᲇ:[B

    .line 9
    .line 10
    iget p0, p0, Lxhss/ᛱᲇᲈᛶ;->ᛷᛴᛷᛱ:I

    .line 11
    .line 12
    ushr-int/lit8 v2, p0, 0x8

    .line 13
    .line 14
    int-to-byte v2, v2

    .line 15
    aput-byte v2, v0, v1

    .line 16
    .line 17
    add-int/lit8 v1, v1, 0x1

    .line 18
    .line 19
    int-to-byte p0, p0

    .line 20
    aput-byte p0, v0, v1

    .line 21
    .line 22
    :cond_0
    return-void
.end method
