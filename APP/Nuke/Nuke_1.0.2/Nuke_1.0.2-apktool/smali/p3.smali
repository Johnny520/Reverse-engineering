.class public final Lp3;
.super Lqp0;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final synthetic t:I

.field public u:I

.field public v:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lp3;->t:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final D(Lmj0;)I
    .locals 6

    .line 1
    iget v0, p0, Lp3;->t:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    const/4 v4, 0x2

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget v0, p0, Lp3;->u:I

    .line 11
    .line 12
    iget p0, p0, Lp3;->v:I

    .line 13
    .line 14
    invoke-virtual {p1, v4}, Lmj0;->m(I)V

    .line 15
    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1, v1, v2}, Lmj0;->k(II)V

    .line 20
    .line 21
    .line 22
    iget-object v4, p1, Lmj0;->a:Ljava/nio/ByteBuffer;

    .line 23
    .line 24
    iget v5, p1, Lmj0;->b:I

    .line 25
    .line 26
    sub-int/2addr v5, v1

    .line 27
    iput v5, p1, Lmj0;->b:I

    .line 28
    .line 29
    invoke-virtual {v4, v5, p0}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v3}, Lmj0;->l(I)V

    .line 33
    .line 34
    .line 35
    :cond_0
    if-eqz v0, :cond_1

    .line 36
    .line 37
    invoke-virtual {p1, v1, v2}, Lmj0;->k(II)V

    .line 38
    .line 39
    .line 40
    iget-object p0, p1, Lmj0;->a:Ljava/nio/ByteBuffer;

    .line 41
    .line 42
    iget v3, p1, Lmj0;->b:I

    .line 43
    .line 44
    sub-int/2addr v3, v1

    .line 45
    iput v3, p1, Lmj0;->b:I

    .line 46
    .line 47
    invoke-virtual {p0, v3, v0}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, v2}, Lmj0;->l(I)V

    .line 51
    .line 52
    .line 53
    :cond_1
    invoke-virtual {p1}, Lmj0;->g()I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    invoke-virtual {p1, p0}, Lmj0;->i(I)V

    .line 58
    .line 59
    .line 60
    return p0

    .line 61
    :pswitch_0
    iget v0, p0, Lp3;->u:I

    .line 62
    .line 63
    iget p0, p0, Lp3;->v:I

    .line 64
    .line 65
    if-eq p0, v3, :cond_3

    .line 66
    .line 67
    if-ne p0, v4, :cond_2

    .line 68
    .line 69
    move p0, v3

    .line 70
    goto :goto_0

    .line 71
    :cond_2
    const/4 p0, 0x0

    .line 72
    throw p0

    .line 73
    :cond_3
    move p0, v2

    .line 74
    :goto_0
    invoke-virtual {p1, v4}, Lmj0;->m(I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1, v1, v2}, Lmj0;->k(II)V

    .line 78
    .line 79
    .line 80
    iget-object v4, p1, Lmj0;->a:Ljava/nio/ByteBuffer;

    .line 81
    .line 82
    iget v5, p1, Lmj0;->b:I

    .line 83
    .line 84
    sub-int/2addr v5, v1

    .line 85
    iput v5, p1, Lmj0;->b:I

    .line 86
    .line 87
    invoke-virtual {v4, v5, v0}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1, v2}, Lmj0;->l(I)V

    .line 91
    .line 92
    .line 93
    if-eqz p0, :cond_4

    .line 94
    .line 95
    invoke-virtual {p1, p0}, Lmj0;->a(B)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1, v3}, Lmj0;->l(I)V

    .line 99
    .line 100
    .line 101
    :cond_4
    invoke-virtual {p1}, Lmj0;->g()I

    .line 102
    .line 103
    .line 104
    move-result p0

    .line 105
    invoke-virtual {p1, p0}, Lmj0;->i(I)V

    .line 106
    .line 107
    .line 108
    return p0

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
