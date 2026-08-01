.class public final Lz9;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# instance fields
.field public final a:[B

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:I

.field public final j:I

.field public final k:[I

.field public final l:[Ljava/lang/String;

.field public final m:Ljava/util/HashMap;


# direct methods
.method public constructor <init>([B)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lz9;->m:Ljava/util/HashMap;

    .line 10
    .line 11
    iput-object p1, p0, Lz9;->a:[B

    .line 12
    .line 13
    const/16 p1, 0x38

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lz9;->o(I)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    iput p1, p0, Lz9;->b:I

    .line 20
    .line 21
    const/16 v0, 0x3c

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Lz9;->o(I)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iput v0, p0, Lz9;->c:I

    .line 28
    .line 29
    const/16 v0, 0x40

    .line 30
    .line 31
    invoke-virtual {p0, v0}, Lz9;->o(I)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    iput v0, p0, Lz9;->d:I

    .line 36
    .line 37
    const/16 v0, 0x44

    .line 38
    .line 39
    invoke-virtual {p0, v0}, Lz9;->o(I)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    iput v0, p0, Lz9;->e:I

    .line 44
    .line 45
    const/16 v0, 0x48

    .line 46
    .line 47
    invoke-virtual {p0, v0}, Lz9;->o(I)I

    .line 48
    .line 49
    .line 50
    const/16 v0, 0x4c

    .line 51
    .line 52
    invoke-virtual {p0, v0}, Lz9;->o(I)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iput v0, p0, Lz9;->f:I

    .line 57
    .line 58
    const/16 v0, 0x58

    .line 59
    .line 60
    invoke-virtual {p0, v0}, Lz9;->o(I)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iput v0, p0, Lz9;->g:I

    .line 65
    .line 66
    const/16 v0, 0x5c

    .line 67
    .line 68
    invoke-virtual {p0, v0}, Lz9;->o(I)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    iput v0, p0, Lz9;->h:I

    .line 73
    .line 74
    const/16 v0, 0x60

    .line 75
    .line 76
    invoke-virtual {p0, v0}, Lz9;->o(I)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    iput v0, p0, Lz9;->i:I

    .line 81
    .line 82
    const/16 v0, 0x64

    .line 83
    .line 84
    invoke-virtual {p0, v0}, Lz9;->o(I)I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    iput v0, p0, Lz9;->j:I

    .line 89
    .line 90
    const/4 v0, 0x0

    .line 91
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    new-array v1, v1, [I

    .line 96
    .line 97
    iput-object v1, p0, Lz9;->k:[I

    .line 98
    .line 99
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    new-array p1, p1, [Ljava/lang/String;

    .line 104
    .line 105
    iput-object p1, p0, Lz9;->l:[Ljava/lang/String;

    .line 106
    .line 107
    :goto_0
    iget p1, p0, Lz9;->b:I

    .line 108
    .line 109
    if-ge v0, p1, :cond_0

    .line 110
    .line 111
    iget-object p1, p0, Lz9;->k:[I

    .line 112
    .line 113
    iget v1, p0, Lz9;->c:I

    .line 114
    .line 115
    mul-int/lit8 v2, v0, 0x4

    .line 116
    .line 117
    add-int/2addr v2, v1

    .line 118
    invoke-virtual {p0, v2}, Lz9;->o(I)I

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    aput v1, p1, v0

    .line 123
    .line 124
    add-int/lit8 v0, v0, 0x1

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_0
    return-void
.end method

.method public static a(Lz9;I)Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Lz9;->h:I

    .line 2
    .line 3
    mul-int/lit8 p1, p1, 0x8

    .line 4
    .line 5
    add-int/2addr p1, v0

    .line 6
    add-int/lit8 p1, p1, 0x4

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lz9;->o(I)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    invoke-virtual {p0, p1}, Lz9;->k(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static b(Lz9;I)I
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lz9;->f(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-gez p1, :cond_0

    .line 6
    .line 7
    const/4 p0, -0x1

    .line 8
    return p0

    .line 9
    :cond_0
    iget v0, p0, Lz9;->f:I

    .line 10
    .line 11
    mul-int/lit8 p1, p1, 0xc

    .line 12
    .line 13
    add-int/2addr p1, v0

    .line 14
    add-int/lit8 p1, p1, 0x8

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lz9;->o(I)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-nez p1, :cond_1

    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    return p0

    .line 24
    :cond_1
    invoke-virtual {p0, p1}, Lz9;->o(I)I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    return p0
.end method

.method public static c(Lz9;I)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lz9;->f(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-gez p1, :cond_0

    .line 6
    .line 7
    const-string p0, ""

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    iget v0, p0, Lz9;->f:I

    .line 11
    .line 12
    mul-int/lit8 p1, p1, 0xc

    .line 13
    .line 14
    add-int/2addr p1, v0

    .line 15
    add-int/lit8 p1, p1, 0x4

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lz9;->o(I)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    invoke-virtual {p0, p1}, Lz9;->l(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method


# virtual methods
.method public final d(Ljava/lang/String;I)Z
    .locals 5

    .line 1
    const/4 v0, -0x1

    .line 2
    iget-object v1, p0, Lz9;->a:[B

    .line 3
    .line 4
    if-lez p2, :cond_0

    .line 5
    .line 6
    add-int/lit8 v2, p2, 0x10

    .line 7
    .line 8
    array-length v3, v1

    .line 9
    if-le v2, v3, :cond_1

    .line 10
    .line 11
    :cond_0
    move v2, v0

    .line 12
    :cond_1
    if-gtz v2, :cond_2

    .line 13
    .line 14
    goto :goto_2

    .line 15
    :cond_2
    add-int/lit8 p2, p2, 0xc

    .line 16
    .line 17
    invoke-virtual {p0, p2}, Lz9;->o(I)I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    array-length v3, v1

    .line 22
    mul-int/lit8 p2, p2, 0x2

    .line 23
    .line 24
    add-int/2addr p2, v2

    .line 25
    invoke-static {v3, p2}, Ljava/lang/Math;->min(II)I

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    :goto_0
    add-int/lit8 v3, v2, 0x1

    .line 30
    .line 31
    if-ge v3, p2, :cond_6

    .line 32
    .line 33
    aget-byte v3, v1, v2

    .line 34
    .line 35
    and-int/lit16 v3, v3, 0xff

    .line 36
    .line 37
    const/16 v4, 0x1a

    .line 38
    .line 39
    if-ne v3, v4, :cond_3

    .line 40
    .line 41
    add-int/lit8 v4, v2, 0x4

    .line 42
    .line 43
    if-gt v4, p2, :cond_3

    .line 44
    .line 45
    add-int/lit8 v3, v2, 0x2

    .line 46
    .line 47
    invoke-virtual {p0, v3}, Lz9;->n(I)I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    goto :goto_1

    .line 52
    :cond_3
    const/16 v4, 0x1b

    .line 53
    .line 54
    if-ne v3, v4, :cond_4

    .line 55
    .line 56
    add-int/lit8 v3, v2, 0x6

    .line 57
    .line 58
    if-gt v3, p2, :cond_4

    .line 59
    .line 60
    add-int/lit8 v3, v2, 0x2

    .line 61
    .line 62
    invoke-virtual {p0, v3}, Lz9;->o(I)I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    goto :goto_1

    .line 67
    :cond_4
    move v3, v0

    .line 68
    :goto_1
    if-ltz v3, :cond_5

    .line 69
    .line 70
    invoke-virtual {p0, v3}, Lz9;->k(I)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    if-eqz v3, :cond_5

    .line 79
    .line 80
    const/4 p0, 0x1

    .line 81
    return p0

    .line 82
    :cond_5
    add-int/lit8 v2, v2, 0x2

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_6
    :goto_2
    const/4 p0, 0x0

    .line 86
    return p0
.end method

.method public final e(ILba;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget v1, p0, Lz9;->i:I

    .line 3
    .line 4
    if-ge v0, v1, :cond_2

    .line 5
    .line 6
    mul-int/lit8 v1, v0, 0x20

    .line 7
    .line 8
    iget v2, p0, Lz9;->j:I

    .line 9
    .line 10
    add-int/2addr v1, v2

    .line 11
    invoke-virtual {p0, v1}, Lz9;->o(I)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eq v2, p1, :cond_0

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    add-int/lit8 v1, v1, 0x18

    .line 19
    .line 20
    invoke-virtual {p0, v1}, Lz9;->o(I)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-lez v1, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0, v1, p2}, Lz9;->g(ILba;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    return-void
.end method

.method public final f(I)I
    .locals 1

    .line 1
    if-ltz p1, :cond_1

    .line 2
    .line 3
    iget v0, p0, Lz9;->g:I

    .line 4
    .line 5
    if-lt p1, v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    mul-int/lit8 p1, p1, 0x8

    .line 9
    .line 10
    iget v0, p0, Lz9;->h:I

    .line 11
    .line 12
    add-int/2addr p1, v0

    .line 13
    add-int/lit8 p1, p1, 0x2

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lz9;->n(I)I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :cond_1
    :goto_0
    const/4 p0, -0x1

    .line 21
    return p0
.end method

.method public final g(ILba;)V
    .locals 6

    .line 1
    new-instance v0, Laa;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput p1, v0, Laa;->a:I

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lz9;->i(Laa;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    invoke-virtual {p0, v0}, Lz9;->i(Laa;)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-virtual {p0, v0}, Lz9;->i(Laa;)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-virtual {p0, v0}, Lz9;->i(Laa;)I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    const/4 v4, 0x0

    .line 25
    :goto_0
    add-int v5, p1, v1

    .line 26
    .line 27
    if-ge v4, v5, :cond_0

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Lz9;->i(Laa;)I

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v0}, Lz9;->i(Laa;)I

    .line 33
    .line 34
    .line 35
    add-int/lit8 v4, v4, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    invoke-virtual {p0, v0, v2, p2}, Lz9;->h(Laa;ILba;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v0, v3, p2}, Lz9;->h(Laa;ILba;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final h(Laa;ILba;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    if-ge v0, p2, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lz9;->i(Laa;)I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    add-int/2addr v1, v2

    .line 10
    invoke-virtual {p0, p1}, Lz9;->i(Laa;)I

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lz9;->i(Laa;)I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-ltz v1, :cond_0

    .line 18
    .line 19
    iget v3, p0, Lz9;->g:I

    .line 20
    .line 21
    if-ge v1, v3, :cond_0

    .line 22
    .line 23
    invoke-interface {p3, v1, v2}, Lba;->a(II)V

    .line 24
    .line 25
    .line 26
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    return-void
.end method

.method public final i(Laa;)I
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget v2, p1, Laa;->a:I

    .line 4
    .line 5
    iget-object v3, p0, Lz9;->a:[B

    .line 6
    .line 7
    array-length v4, v3

    .line 8
    if-ge v2, v4, :cond_1

    .line 9
    .line 10
    const/16 v4, 0x23

    .line 11
    .line 12
    if-ge v0, v4, :cond_1

    .line 13
    .line 14
    add-int/lit8 v4, v2, 0x1

    .line 15
    .line 16
    iput v4, p1, Laa;->a:I

    .line 17
    .line 18
    aget-byte v2, v3, v2

    .line 19
    .line 20
    and-int/lit8 v3, v2, 0x7f

    .line 21
    .line 22
    shl-int/2addr v3, v0

    .line 23
    or-int/2addr v1, v3

    .line 24
    and-int/lit16 v2, v2, 0x80

    .line 25
    .line 26
    if-nez v2, :cond_0

    .line 27
    .line 28
    return v1

    .line 29
    :cond_0
    add-int/lit8 v0, v0, 0x7

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    return v1
.end method

.method public final j(ILo4;)V
    .locals 5

    .line 1
    const-string v0, "Lcom/tencent/mobileqq/mini/api/IMiniAppService;"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lz9;->m(Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, -0x1

    .line 8
    if-gez v0, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    const/4 v2, 0x0

    .line 12
    :goto_0
    iget v3, p0, Lz9;->g:I

    .line 13
    .line 14
    if-ge v2, v3, :cond_2

    .line 15
    .line 16
    mul-int/lit8 v3, v2, 0x8

    .line 17
    .line 18
    iget v4, p0, Lz9;->h:I

    .line 19
    .line 20
    add-int/2addr v3, v4

    .line 21
    invoke-virtual {p0, v3}, Lz9;->n(I)I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-ne v4, v0, :cond_1

    .line 26
    .line 27
    add-int/lit8 v3, v3, 0x4

    .line 28
    .line 29
    invoke-virtual {p0, v3}, Lz9;->o(I)I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    invoke-virtual {p0, v3}, Lz9;->k(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    const-string v4, "createMiniAppEntryManager"

    .line 38
    .line 39
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_1

    .line 44
    .line 45
    move v1, v2

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    :goto_1
    new-instance v0, Lb7;

    .line 51
    .line 52
    invoke-direct {v0, p0, p2, v1}, Lb7;-><init>(Lz9;Lo4;I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, p1, v0}, Lz9;->e(ILba;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public final k(I)Ljava/lang/String;
    .locals 7

    .line 1
    if-ltz p1, :cond_9

    .line 2
    .line 3
    iget v0, p0, Lz9;->b:I

    .line 4
    .line 5
    if-lt p1, v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_5

    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Lz9;->l:[Ljava/lang/String;

    .line 10
    .line 11
    aget-object v1, v0, p1

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    return-object v1

    .line 16
    :cond_1
    iget-object v1, p0, Lz9;->k:[I

    .line 17
    .line 18
    aget v1, v1, p1

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    :goto_0
    iget-object v3, p0, Lz9;->a:[B

    .line 22
    .line 23
    array-length v4, v3

    .line 24
    if-ge v1, v4, :cond_3

    .line 25
    .line 26
    const/16 v4, 0x23

    .line 27
    .line 28
    if-ge v2, v4, :cond_3

    .line 29
    .line 30
    add-int/lit8 v4, v1, 0x1

    .line 31
    .line 32
    aget-byte v1, v3, v1

    .line 33
    .line 34
    and-int/lit16 v1, v1, 0x80

    .line 35
    .line 36
    if-nez v1, :cond_2

    .line 37
    .line 38
    move v1, v4

    .line 39
    goto :goto_1

    .line 40
    :cond_2
    add-int/lit8 v2, v2, 0x7

    .line 41
    .line 42
    move v1, v4

    .line 43
    goto :goto_0

    .line 44
    :cond_3
    :goto_1
    new-instance p0, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 47
    .line 48
    .line 49
    :goto_2
    array-length v2, v3

    .line 50
    if-ge v1, v2, :cond_8

    .line 51
    .line 52
    add-int/lit8 v2, v1, 0x1

    .line 53
    .line 54
    aget-byte v4, v3, v1

    .line 55
    .line 56
    and-int/lit16 v5, v4, 0xff

    .line 57
    .line 58
    if-nez v5, :cond_4

    .line 59
    .line 60
    goto :goto_4

    .line 61
    :cond_4
    and-int/lit16 v6, v4, 0x80

    .line 62
    .line 63
    if-nez v6, :cond_5

    .line 64
    .line 65
    int-to-char v1, v5

    .line 66
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_5
    and-int/lit16 v5, v4, 0xe0

    .line 71
    .line 72
    const/16 v6, 0xc0

    .line 73
    .line 74
    if-ne v5, v6, :cond_6

    .line 75
    .line 76
    array-length v5, v3

    .line 77
    if-ge v2, v5, :cond_6

    .line 78
    .line 79
    add-int/lit8 v1, v1, 0x2

    .line 80
    .line 81
    aget-byte v2, v3, v2

    .line 82
    .line 83
    and-int/lit8 v2, v2, 0x3f

    .line 84
    .line 85
    and-int/lit8 v4, v4, 0x1f

    .line 86
    .line 87
    shl-int/lit8 v4, v4, 0x6

    .line 88
    .line 89
    or-int/2addr v2, v4

    .line 90
    int-to-char v2, v2

    .line 91
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_6
    add-int/lit8 v5, v1, 0x2

    .line 96
    .line 97
    array-length v6, v3

    .line 98
    if-ge v5, v6, :cond_7

    .line 99
    .line 100
    aget-byte v2, v3, v2

    .line 101
    .line 102
    and-int/lit8 v2, v2, 0x3f

    .line 103
    .line 104
    add-int/lit8 v1, v1, 0x3

    .line 105
    .line 106
    aget-byte v5, v3, v5

    .line 107
    .line 108
    and-int/lit8 v5, v5, 0x3f

    .line 109
    .line 110
    and-int/lit8 v4, v4, 0xf

    .line 111
    .line 112
    shl-int/lit8 v4, v4, 0xc

    .line 113
    .line 114
    shl-int/lit8 v2, v2, 0x6

    .line 115
    .line 116
    or-int/2addr v2, v4

    .line 117
    or-int/2addr v2, v5

    .line 118
    int-to-char v2, v2

    .line 119
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_7
    :goto_3
    move v1, v2

    .line 124
    goto :goto_2

    .line 125
    :cond_8
    :goto_4
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    aput-object p0, v0, p1

    .line 130
    .line 131
    return-object p0

    .line 132
    :cond_9
    :goto_5
    const-string p0, ""

    .line 133
    .line 134
    return-object p0
.end method

.method public final l(I)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lz9;->m:Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/String;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    if-ltz p1, :cond_2

    .line 17
    .line 18
    iget v0, p0, Lz9;->d:I

    .line 19
    .line 20
    if-lt p1, v0, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    mul-int/lit8 v0, p1, 0x4

    .line 24
    .line 25
    iget v2, p0, Lz9;->e:I

    .line 26
    .line 27
    add-int/2addr v0, v2

    .line 28
    invoke-virtual {p0, v0}, Lz9;->o(I)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-virtual {p0, v0}, Lz9;->k(I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {v1, p1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    return-object p0

    .line 44
    :cond_2
    :goto_0
    const-string p0, ""

    .line 45
    .line 46
    return-object p0
.end method

.method public final m(Ljava/lang/String;)I
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget v1, p0, Lz9;->d:I

    .line 3
    .line 4
    if-ge v0, v1, :cond_1

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lz9;->l(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    return v0

    .line 17
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 p0, -0x1

    .line 21
    return p0
.end method

.method public final n(I)I
    .locals 2

    .line 1
    if-ltz p1, :cond_1

    .line 2
    .line 3
    add-int/lit8 v0, p1, 0x1

    .line 4
    .line 5
    iget-object p0, p0, Lz9;->a:[B

    .line 6
    .line 7
    array-length v1, p0

    .line 8
    if-lt v0, v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    aget-byte p1, p0, p1

    .line 12
    .line 13
    and-int/lit16 p1, p1, 0xff

    .line 14
    .line 15
    aget-byte p0, p0, v0

    .line 16
    .line 17
    and-int/lit16 p0, p0, 0xff

    .line 18
    .line 19
    shl-int/lit8 p0, p0, 0x8

    .line 20
    .line 21
    or-int/2addr p0, p1

    .line 22
    return p0

    .line 23
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 24
    return p0
.end method

.method public final o(I)I
    .locals 3

    .line 1
    if-ltz p1, :cond_1

    .line 2
    .line 3
    add-int/lit8 v0, p1, 0x3

    .line 4
    .line 5
    iget-object p0, p0, Lz9;->a:[B

    .line 6
    .line 7
    array-length v1, p0

    .line 8
    if-lt v0, v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    aget-byte v1, p0, p1

    .line 12
    .line 13
    and-int/lit16 v1, v1, 0xff

    .line 14
    .line 15
    add-int/lit8 v2, p1, 0x1

    .line 16
    .line 17
    aget-byte v2, p0, v2

    .line 18
    .line 19
    and-int/lit16 v2, v2, 0xff

    .line 20
    .line 21
    shl-int/lit8 v2, v2, 0x8

    .line 22
    .line 23
    or-int/2addr v1, v2

    .line 24
    add-int/lit8 p1, p1, 0x2

    .line 25
    .line 26
    aget-byte p1, p0, p1

    .line 27
    .line 28
    and-int/lit16 p1, p1, 0xff

    .line 29
    .line 30
    shl-int/lit8 p1, p1, 0x10

    .line 31
    .line 32
    or-int/2addr p1, v1

    .line 33
    aget-byte p0, p0, v0

    .line 34
    .line 35
    and-int/lit16 p0, p0, 0xff

    .line 36
    .line 37
    shl-int/lit8 p0, p0, 0x18

    .line 38
    .line 39
    or-int/2addr p0, p1

    .line 40
    return p0

    .line 41
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 42
    return p0
.end method
