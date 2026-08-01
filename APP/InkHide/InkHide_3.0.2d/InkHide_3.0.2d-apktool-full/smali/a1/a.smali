.class public final La1/a;
.super LD/h;
.source "SourceFile"


# instance fields
.field public final synthetic d:I

.field public e:I

.field public f:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, La1/a;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final Y(LS/b;)I
    .locals 6

    .line 1
    iget v0, p0, La1/a;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    invoke-virtual {p1, v0}, LS/b;->j(I)V

    .line 8
    .line 9
    .line 10
    iget v0, p0, La1/a;->f:I

    .line 11
    .line 12
    const/4 v1, 0x4

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-virtual {p1, v1, v2}, LS/b;->h(II)V

    .line 15
    .line 16
    .line 17
    iget-object v3, p1, LS/b;->a:Ljava/nio/ByteBuffer;

    .line 18
    .line 19
    iget v4, p1, LS/b;->b:I

    .line 20
    .line 21
    sub-int/2addr v4, v1

    .line 22
    iput v4, p1, LS/b;->b:I

    .line 23
    .line 24
    invoke-virtual {v3, v4, v0}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 25
    .line 26
    .line 27
    iget-object v0, p1, LS/b;->d:[I

    .line 28
    .line 29
    invoke-virtual {p1}, LS/b;->g()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    const/4 v4, 0x1

    .line 34
    aput v3, v0, v4

    .line 35
    .line 36
    iget v0, p0, La1/a;->e:I

    .line 37
    .line 38
    invoke-virtual {p1, v1, v2}, LS/b;->h(II)V

    .line 39
    .line 40
    .line 41
    iget-object v3, p1, LS/b;->a:Ljava/nio/ByteBuffer;

    .line 42
    .line 43
    iget v4, p1, LS/b;->b:I

    .line 44
    .line 45
    sub-int/2addr v4, v1

    .line 46
    iput v4, p1, LS/b;->b:I

    .line 47
    .line 48
    invoke-virtual {v3, v4, v0}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 49
    .line 50
    .line 51
    iget-object v0, p1, LS/b;->d:[I

    .line 52
    .line 53
    invoke-virtual {p1}, LS/b;->g()I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    aput v1, v0, v2

    .line 58
    .line 59
    invoke-virtual {p1}, LS/b;->e()I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    invoke-virtual {p1, v0}, LS/b;->f(I)V

    .line 64
    .line 65
    .line 66
    return v0

    .line 67
    :pswitch_0
    iget v0, p0, La1/a;->e:I

    .line 68
    .line 69
    iget v1, p0, La1/a;->f:I

    .line 70
    .line 71
    const/4 v2, 0x1

    .line 72
    if-eq v1, v2, :cond_1

    .line 73
    .line 74
    const/4 v3, 0x2

    .line 75
    if-ne v1, v3, :cond_0

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_0
    const/4 p1, 0x0

    .line 79
    throw p1

    .line 80
    :cond_1
    const/4 v2, 0x0

    .line 81
    :goto_0
    const/4 v1, 0x2

    .line 82
    invoke-virtual {p1, v1}, LS/b;->j(I)V

    .line 83
    .line 84
    .line 85
    const/4 v1, 0x4

    .line 86
    const/4 v3, 0x0

    .line 87
    invoke-virtual {p1, v1, v3}, LS/b;->h(II)V

    .line 88
    .line 89
    .line 90
    iget-object v4, p1, LS/b;->a:Ljava/nio/ByteBuffer;

    .line 91
    .line 92
    iget v5, p1, LS/b;->b:I

    .line 93
    .line 94
    sub-int/2addr v5, v1

    .line 95
    iput v5, p1, LS/b;->b:I

    .line 96
    .line 97
    invoke-virtual {v4, v5, v0}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 98
    .line 99
    .line 100
    iget-object v0, p1, LS/b;->d:[I

    .line 101
    .line 102
    invoke-virtual {p1}, LS/b;->g()I

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    aput v1, v0, v3

    .line 107
    .line 108
    if-eqz v2, :cond_2

    .line 109
    .line 110
    const/4 v0, 0x1

    .line 111
    invoke-virtual {p1, v0, v3}, LS/b;->h(II)V

    .line 112
    .line 113
    .line 114
    iget-object v1, p1, LS/b;->a:Ljava/nio/ByteBuffer;

    .line 115
    .line 116
    iget v3, p1, LS/b;->b:I

    .line 117
    .line 118
    sub-int/2addr v3, v0

    .line 119
    iput v3, p1, LS/b;->b:I

    .line 120
    .line 121
    invoke-virtual {v1, v3, v2}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 122
    .line 123
    .line 124
    iget-object v1, p1, LS/b;->d:[I

    .line 125
    .line 126
    invoke-virtual {p1}, LS/b;->g()I

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    aput v2, v1, v0

    .line 131
    .line 132
    :cond_2
    invoke-virtual {p1}, LS/b;->e()I

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    invoke-virtual {p1, v0}, LS/b;->f(I)V

    .line 137
    .line 138
    .line 139
    return v0

    .line 140
    nop

    .line 141
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
