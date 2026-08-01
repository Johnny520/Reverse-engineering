.class public final La1/b;
.super LD/h;
.source "SourceFile"


# instance fields
.field public final d:Ljava/lang/String;

.field public e:I

.field public final f:Z


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 5
    invoke-direct {p0, p1, v1, v0}, La1/b;-><init>(Ljava/lang/String;IZ)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IZ)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, LL/d;->o(ILjava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, La1/b;->d:Ljava/lang/String;

    .line 3
    iput p2, p0, La1/b;->e:I

    .line 4
    iput-boolean p3, p0, La1/b;->f:Z

    return-void
.end method


# virtual methods
.method public final Y(LS/b;)I
    .locals 7

    .line 1
    iget-object v0, p0, La1/b;->d:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    iget v1, p0, La1/b;->e:I

    .line 12
    .line 13
    const/4 v2, 0x5

    .line 14
    if-eq v1, v2, :cond_0

    .line 15
    .line 16
    iput v2, p0, La1/b;->e:I

    .line 17
    .line 18
    :cond_0
    invoke-virtual {p1, v0}, LS/b;->c(Ljava/lang/CharSequence;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v1, p0, La1/b;->e:I

    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    if-eq v1, v2, :cond_3

    .line 26
    .line 27
    const/4 v3, 0x2

    .line 28
    if-eq v1, v3, :cond_4

    .line 29
    .line 30
    const/4 v2, 0x3

    .line 31
    if-eq v1, v2, :cond_1

    .line 32
    .line 33
    const/4 v3, 0x4

    .line 34
    if-eq v1, v3, :cond_4

    .line 35
    .line 36
    const/4 v2, 0x5

    .line 37
    if-ne v1, v2, :cond_2

    .line 38
    .line 39
    :cond_1
    move v2, v3

    .line 40
    goto :goto_0

    .line 41
    :cond_2
    const/4 p1, 0x0

    .line 42
    throw p1

    .line 43
    :cond_3
    const/4 v2, 0x0

    .line 44
    :cond_4
    :goto_0
    const/4 v1, 0x3

    .line 45
    invoke-virtual {p1, v1}, LS/b;->j(I)V

    .line 46
    .line 47
    .line 48
    const/4 v1, 0x0

    .line 49
    invoke-virtual {p1, v1, v0}, LS/b;->a(II)V

    .line 50
    .line 51
    .line 52
    const/4 v0, 0x2

    .line 53
    iget-boolean v3, p0, La1/b;->f:Z

    .line 54
    .line 55
    if-eqz v3, :cond_5

    .line 56
    .line 57
    const/4 v4, 0x0

    .line 58
    const/4 v5, 0x1

    .line 59
    invoke-virtual {p1, v5, v4}, LS/b;->h(II)V

    .line 60
    .line 61
    .line 62
    iget-object v4, p1, LS/b;->a:Ljava/nio/ByteBuffer;

    .line 63
    .line 64
    iget v6, p1, LS/b;->b:I

    .line 65
    .line 66
    sub-int/2addr v6, v5

    .line 67
    iput v6, p1, LS/b;->b:I

    .line 68
    .line 69
    int-to-byte v3, v3

    .line 70
    invoke-virtual {v4, v6, v3}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 71
    .line 72
    .line 73
    iget-object v3, p1, LS/b;->d:[I

    .line 74
    .line 75
    invoke-virtual {p1}, LS/b;->g()I

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    aput v4, v3, v0

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    :goto_1
    if-eqz v2, :cond_6

    .line 86
    .line 87
    const/4 v0, 0x1

    .line 88
    invoke-virtual {p1, v0, v1}, LS/b;->h(II)V

    .line 89
    .line 90
    .line 91
    iget-object v1, p1, LS/b;->a:Ljava/nio/ByteBuffer;

    .line 92
    .line 93
    iget v3, p1, LS/b;->b:I

    .line 94
    .line 95
    sub-int/2addr v3, v0

    .line 96
    iput v3, p1, LS/b;->b:I

    .line 97
    .line 98
    invoke-virtual {v1, v3, v2}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 99
    .line 100
    .line 101
    iget-object v1, p1, LS/b;->d:[I

    .line 102
    .line 103
    invoke-virtual {p1}, LS/b;->g()I

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    aput v2, v1, v0

    .line 108
    .line 109
    :cond_6
    invoke-virtual {p1}, LS/b;->e()I

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    invoke-virtual {p1, v0}, LS/b;->f(I)V

    .line 114
    .line 115
    .line 116
    return v0

    .line 117
    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 118
    .line 119
    const-string v0, "value must not be null"

    .line 120
    .line 121
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    throw p1
.end method
