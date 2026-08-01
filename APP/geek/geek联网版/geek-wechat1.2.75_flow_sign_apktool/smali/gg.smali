.class public final Lgg;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:Llp;

.field public final synthetic e:Lhg;


# direct methods
.method public constructor <init>(Lhg;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lgg;->e:Lhg;

    .line 5
    .line 6
    const/4 v0, -0x1

    .line 7
    iput v0, p0, Lgg;->a:I

    .line 8
    .line 9
    iget-object p1, p1, Lhg;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p1, Ljava/lang/CharSequence;

    .line 12
    .line 13
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-static {v0, p1}, Lju;->e(II)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    iput p1, p0, Lgg;->b:I

    .line 23
    .line 24
    iput p1, p0, Lgg;->c:I

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 7

    .line 1
    iget-object v0, p0, Lgg;->e:Lhg;

    .line 2
    .line 3
    iget-object v1, v0, Lhg;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/lang/CharSequence;

    .line 6
    .line 7
    iget v2, p0, Lgg;->c:I

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    if-gez v2, :cond_0

    .line 11
    .line 12
    iput v3, p0, Lgg;->a:I

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Lgg;->d:Llp;

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    const/4 v5, -0x1

    .line 23
    const/4 v6, 0x1

    .line 24
    if-le v2, v4, :cond_1

    .line 25
    .line 26
    new-instance v0, Llp;

    .line 27
    .line 28
    iget v2, p0, Lgg;->b:I

    .line 29
    .line 30
    invoke-static {v1}, Li50;->B(Ljava/lang/CharSequence;)I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    invoke-direct {v0, v2, v1, v6}, Ljp;-><init>(III)V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, Lgg;->d:Llp;

    .line 38
    .line 39
    iput v5, p0, Lgg;->c:I

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    iget-object v0, v0, Lhg;->c:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, Lqh;

    .line 45
    .line 46
    iget v2, p0, Lgg;->c:I

    .line 47
    .line 48
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {v0, v1, v2}, Lqh;->e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, Lsx;

    .line 57
    .line 58
    if-nez v0, :cond_2

    .line 59
    .line 60
    new-instance v0, Llp;

    .line 61
    .line 62
    iget v2, p0, Lgg;->b:I

    .line 63
    .line 64
    invoke-static {v1}, Li50;->B(Ljava/lang/CharSequence;)I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    invoke-direct {v0, v2, v1, v6}, Ljp;-><init>(III)V

    .line 69
    .line 70
    .line 71
    iput-object v0, p0, Lgg;->d:Llp;

    .line 72
    .line 73
    iput v5, p0, Lgg;->c:I

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_2
    iget-object v1, v0, Lsx;->a:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v1, Ljava/lang/Number;

    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    iget-object v0, v0, Lsx;->b:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v0, Ljava/lang/Number;

    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    iget v2, p0, Lgg;->b:I

    .line 93
    .line 94
    const/high16 v4, -0x80000000

    .line 95
    .line 96
    if-gt v1, v4, :cond_3

    .line 97
    .line 98
    sget-object v2, Llp;->d:Llp;

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_3
    new-instance v4, Llp;

    .line 102
    .line 103
    add-int/lit8 v5, v1, -0x1

    .line 104
    .line 105
    invoke-direct {v4, v2, v5, v6}, Ljp;-><init>(III)V

    .line 106
    .line 107
    .line 108
    move-object v2, v4

    .line 109
    :goto_0
    iput-object v2, p0, Lgg;->d:Llp;

    .line 110
    .line 111
    add-int/2addr v1, v0

    .line 112
    iput v1, p0, Lgg;->b:I

    .line 113
    .line 114
    if-nez v0, :cond_4

    .line 115
    .line 116
    move v3, v6

    .line 117
    :cond_4
    add-int/2addr v1, v3

    .line 118
    iput v1, p0, Lgg;->c:I

    .line 119
    .line 120
    :goto_1
    iput v6, p0, Lgg;->a:I

    .line 121
    .line 122
    return-void
.end method

.method public final hasNext()Z
    .locals 2

    .line 1
    iget v0, p0, Lgg;->a:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Lgg;->a()V

    .line 7
    .line 8
    .line 9
    :cond_0
    iget v0, p0, Lgg;->a:I

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    if-ne v0, v1, :cond_1

    .line 13
    .line 14
    return v1

    .line 15
    :cond_1
    const/4 v0, 0x0

    .line 16
    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lgg;->a:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Lgg;->a()V

    .line 7
    .line 8
    .line 9
    :cond_0
    iget v0, p0, Lgg;->a:I

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Lgg;->d:Llp;

    .line 14
    .line 15
    const-string v2, "null cannot be cast to non-null type kotlin.ranges.IntRange"

    .line 16
    .line 17
    invoke-static {v2, v0}, Lmp;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    iput-object v2, p0, Lgg;->d:Llp;

    .line 22
    .line 23
    iput v1, p0, Lgg;->a:I

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 27
    .line 28
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 29
    .line 30
    .line 31
    throw v0
.end method

.method public final remove()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v1, "Operation is not supported for read-only collection"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method
