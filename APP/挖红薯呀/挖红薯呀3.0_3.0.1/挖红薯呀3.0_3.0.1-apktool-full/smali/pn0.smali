.class public final Lpn0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# instance fields
.field public final a:Lug0;

.field public final b:Lug0;

.field public c:I

.field public d:I


# direct methods
.method public constructor <init>(Ljo0;Ld80;Lgo0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object p1, Lv20;->a:Lug0;

    .line 5
    .line 6
    new-instance p1, Lug0;

    .line 7
    .line 8
    invoke-direct {p1}, Lug0;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lpn0;->a:Lug0;

    .line 12
    .line 13
    new-instance p1, Lvg0;

    .line 14
    .line 15
    invoke-direct {p1}, Lvg0;-><init>()V

    .line 16
    .line 17
    .line 18
    new-instance p1, Lug0;

    .line 19
    .line 20
    invoke-direct {p1}, Lug0;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lpn0;->b:Lug0;

    .line 24
    .line 25
    const p1, 0x7fffffff

    .line 26
    .line 27
    .line 28
    iput p1, p0, Lpn0;->c:I

    .line 29
    .line 30
    const/high16 p1, -0x80000000

    .line 31
    .line 32
    iput p1, p0, Lpn0;->d:I

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 14

    .line 1
    const v0, 0x7fffffff

    .line 2
    .line 3
    .line 4
    iput v0, p0, Lpn0;->c:I

    .line 5
    .line 6
    const/high16 v0, -0x80000000

    .line 7
    .line 8
    iput v0, p0, Lpn0;->d:I

    .line 9
    .line 10
    iget-object v0, p0, Lpn0;->b:Lug0;

    .line 11
    .line 12
    invoke-virtual {v0}, Lug0;->c()V

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, Lpn0;->a:Lug0;

    .line 16
    .line 17
    iget-object v0, p0, Lu20;->a:[J

    .line 18
    .line 19
    array-length v1, v0

    .line 20
    add-int/lit8 v1, v1, -0x2

    .line 21
    .line 22
    if-ltz v1, :cond_4

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    move v3, v2

    .line 26
    :goto_0
    aget-wide v4, v0, v3

    .line 27
    .line 28
    not-long v6, v4

    .line 29
    const/4 v8, 0x7

    .line 30
    shl-long/2addr v6, v8

    .line 31
    and-long/2addr v6, v4

    .line 32
    const-wide v8, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    and-long/2addr v6, v8

    .line 38
    cmp-long v6, v6, v8

    .line 39
    .line 40
    if-eqz v6, :cond_3

    .line 41
    .line 42
    sub-int v6, v3, v1

    .line 43
    .line 44
    not-int v6, v6

    .line 45
    ushr-int/lit8 v6, v6, 0x1f

    .line 46
    .line 47
    const/16 v7, 0x8

    .line 48
    .line 49
    rsub-int/lit8 v6, v6, 0x8

    .line 50
    .line 51
    move v8, v2

    .line 52
    :goto_1
    if-ge v8, v6, :cond_2

    .line 53
    .line 54
    const-wide/16 v9, 0xff

    .line 55
    .line 56
    and-long/2addr v9, v4

    .line 57
    const-wide/16 v11, 0x80

    .line 58
    .line 59
    cmp-long v9, v9, v11

    .line 60
    .line 61
    if-gez v9, :cond_1

    .line 62
    .line 63
    shl-int/lit8 v9, v3, 0x3

    .line 64
    .line 65
    add-int/2addr v9, v8

    .line 66
    iget-object v10, p0, Lu20;->b:[I

    .line 67
    .line 68
    aget v10, v10, v9

    .line 69
    .line 70
    iget-object v10, p0, Lu20;->c:[Ljava/lang/Object;

    .line 71
    .line 72
    aget-object v10, v10, v9

    .line 73
    .line 74
    check-cast v10, Ljava/util/List;

    .line 75
    .line 76
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    .line 77
    .line 78
    .line 79
    move-result v11

    .line 80
    move v12, v2

    .line 81
    :goto_2
    if-ge v12, v11, :cond_0

    .line 82
    .line 83
    invoke-interface {v10, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v13

    .line 87
    check-cast v13, Lc80;

    .line 88
    .line 89
    invoke-interface {v13}, Lc80;->cancel()V

    .line 90
    .line 91
    .line 92
    add-int/lit8 v12, v12, 0x1

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_0
    invoke-virtual {p0, v9}, Lug0;->h(I)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    :cond_1
    shr-long/2addr v4, v7

    .line 99
    add-int/lit8 v8, v8, 0x1

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_2
    if-ne v6, v7, :cond_4

    .line 103
    .line 104
    :cond_3
    if-eq v3, v1, :cond_4

    .line 105
    .line 106
    add-int/lit8 v3, v3, 0x1

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_4
    return-void
.end method
