.class public final Lz80;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Ljava/util/ArrayList;

.field public final β:I

.field public γ:I

.field public final δ:Ljava/util/ArrayList;

.field public final ε:Ln11;

.field public final ζ:Lh22;


# direct methods
.method public constructor <init>(ILjava/util/ArrayList;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lz80;->α:Ljava/util/ArrayList;

    .line 5
    .line 6
    iput p1, p0, Lz80;->β:I

    .line 7
    .line 8
    if-ltz p1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const-string p1, "Invalid start index"

    .line 12
    .line 13
    invoke-static {p1}, Lpi1;->α(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :goto_0
    new-instance p1, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lz80;->δ:Ljava/util/ArrayList;

    .line 22
    .line 23
    new-instance p1, Ln11;

    .line 24
    .line 25
    invoke-direct {p1}, Ln11;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    const/4 v0, 0x0

    .line 33
    move v1, v0

    .line 34
    :goto_1
    if-ge v0, p2, :cond_1

    .line 35
    .line 36
    iget-object v2, p0, Lz80;->α:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    check-cast v2, Lyo0;

    .line 43
    .line 44
    iget v3, v2, Lyo0;->γ:I

    .line 45
    .line 46
    iget v2, v2, Lyo0;->δ:I

    .line 47
    .line 48
    new-instance v4, Lkc0;

    .line 49
    .line 50
    invoke-direct {v4, v0, v1, v2}, Lkc0;-><init>(III)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1, v3, v4}, Ln11;->η(ILjava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    add-int/2addr v1, v2

    .line 57
    add-int/lit8 v0, v0, 0x1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    iput-object p1, p0, Lz80;->ε:Ln11;

    .line 61
    .line 62
    new-instance p1, Ly80;

    .line 63
    .line 64
    invoke-direct {p1, p0}, Ly80;-><init>(Lz80;)V

    .line 65
    .line 66
    .line 67
    new-instance p2, Lh22;

    .line 68
    .line 69
    invoke-direct {p2, p1}, Lh22;-><init>(Lp70;)V

    .line 70
    .line 71
    .line 72
    iput-object p2, p0, Lz80;->ζ:Lh22;

    .line 73
    .line 74
    return-void
.end method


# virtual methods
.method public final α(II)Z
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    iget-object v0, v0, Lz80;->ε:Ln11;

    .line 6
    .line 7
    move/from16 v2, p1

    .line 8
    .line 9
    invoke-virtual {v0, v2}, Lsm0;->β(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, Lkc0;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    if-eqz v2, :cond_4

    .line 17
    .line 18
    iget v4, v2, Lkc0;->β:I

    .line 19
    .line 20
    iget v5, v2, Lkc0;->γ:I

    .line 21
    .line 22
    sub-int v5, v1, v5

    .line 23
    .line 24
    iput v1, v2, Lkc0;->γ:I

    .line 25
    .line 26
    if-eqz v5, :cond_3

    .line 27
    .line 28
    iget-object v1, v0, Lsm0;->γ:[Ljava/lang/Object;

    .line 29
    .line 30
    iget-object v0, v0, Lsm0;->α:[J

    .line 31
    .line 32
    array-length v6, v0

    .line 33
    add-int/lit8 v6, v6, -0x2

    .line 34
    .line 35
    if-ltz v6, :cond_3

    .line 36
    .line 37
    move v7, v3

    .line 38
    :goto_0
    aget-wide v8, v0, v7

    .line 39
    .line 40
    not-long v10, v8

    .line 41
    const/4 v12, 0x7

    .line 42
    shl-long/2addr v10, v12

    .line 43
    and-long/2addr v10, v8

    .line 44
    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    and-long/2addr v10, v12

    .line 50
    cmp-long v10, v10, v12

    .line 51
    .line 52
    if-eqz v10, :cond_2

    .line 53
    .line 54
    sub-int v10, v7, v6

    .line 55
    .line 56
    not-int v10, v10

    .line 57
    ushr-int/lit8 v10, v10, 0x1f

    .line 58
    .line 59
    const/16 v11, 0x8

    .line 60
    .line 61
    rsub-int/lit8 v10, v10, 0x8

    .line 62
    .line 63
    move v12, v3

    .line 64
    :goto_1
    if-ge v12, v10, :cond_1

    .line 65
    .line 66
    const-wide/16 v13, 0xff

    .line 67
    .line 68
    and-long/2addr v13, v8

    .line 69
    const-wide/16 v15, 0x80

    .line 70
    .line 71
    cmp-long v13, v13, v15

    .line 72
    .line 73
    if-gez v13, :cond_0

    .line 74
    .line 75
    shl-int/lit8 v13, v7, 0x3

    .line 76
    .line 77
    add-int/2addr v13, v12

    .line 78
    aget-object v13, v1, v13

    .line 79
    .line 80
    check-cast v13, Lkc0;

    .line 81
    .line 82
    iget v14, v13, Lkc0;->β:I

    .line 83
    .line 84
    if-lt v14, v4, :cond_0

    .line 85
    .line 86
    invoke-virtual {v13, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v14

    .line 90
    if-nez v14, :cond_0

    .line 91
    .line 92
    iget v14, v13, Lkc0;->β:I

    .line 93
    .line 94
    add-int/2addr v14, v5

    .line 95
    if-ltz v14, :cond_0

    .line 96
    .line 97
    iput v14, v13, Lkc0;->β:I

    .line 98
    .line 99
    :cond_0
    shr-long/2addr v8, v11

    .line 100
    add-int/lit8 v12, v12, 0x1

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_1
    if-ne v10, v11, :cond_3

    .line 104
    .line 105
    :cond_2
    if-eq v7, v6, :cond_3

    .line 106
    .line 107
    add-int/lit8 v7, v7, 0x1

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_3
    const/4 v0, 0x1

    .line 111
    return v0

    .line 112
    :cond_4
    return v3
.end method
