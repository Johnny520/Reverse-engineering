.class public final Lk2;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Lww;

.field public final synthetic f:Lmh;


# direct methods
.method public synthetic constructor <init>(Lww;Lmh;I)V
    .locals 0

    .line 1
    iput p3, p0, Lk2;->d:I

    .line 2
    .line 3
    iput-object p1, p0, Lk2;->e:Lww;

    .line 4
    .line 5
    iput-object p2, p0, Lk2;->f:Lmh;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lk2;->d:I

    .line 2
    .line 3
    sget-object v1, Lna1;->a:Lna1;

    .line 4
    .line 5
    iget-object v2, p0, Lk2;->f:Lmh;

    .line 6
    .line 7
    iget-object p0, p0, Lk2;->e:Lww;

    .line 8
    .line 9
    const/4 v3, 0x2

    .line 10
    const/4 v4, 0x1

    .line 11
    const/4 v5, 0x0

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p1, Lji;

    .line 16
    .line 17
    check-cast p2, Ljava/lang/Number;

    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    and-int/lit8 v0, p2, 0x3

    .line 24
    .line 25
    if-eq v0, v3, :cond_0

    .line 26
    .line 27
    move v0, v4

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v0, v5

    .line 30
    :goto_0
    and-int/2addr p2, v4

    .line 31
    check-cast p1, Lpi;

    .line 32
    .line 33
    invoke-virtual {p1, p2, v0}, Lpi;->O(IZ)Z

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    if-eqz p2, :cond_1

    .line 38
    .line 39
    sget-object p2, Lm2;->a:Lln0;

    .line 40
    .line 41
    new-instance p2, Lk2;

    .line 42
    .line 43
    invoke-direct {p2, p0, v2, v5}, Lk2;-><init>(Lww;Lmh;I)V

    .line 44
    .line 45
    .line 46
    const p0, -0x1b6383e2

    .line 47
    .line 48
    .line 49
    invoke-static {p0, p2, p1}, Lkl;->w(ILex;Lji;)Lmh;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    const/16 p2, 0x1b6

    .line 54
    .line 55
    invoke-static {p0, p1, p2}, Lm2;->b(Lmh;Lji;I)V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    invoke-virtual {p1}, Lpi;->R()V

    .line 60
    .line 61
    .line 62
    :goto_1
    return-object v1

    .line 63
    :pswitch_0
    check-cast p1, Lji;

    .line 64
    .line 65
    check-cast p2, Ljava/lang/Number;

    .line 66
    .line 67
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 68
    .line 69
    .line 70
    move-result p2

    .line 71
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    and-int/lit8 v6, p2, 0x3

    .line 76
    .line 77
    if-eq v6, v3, :cond_2

    .line 78
    .line 79
    move v3, v4

    .line 80
    goto :goto_2

    .line 81
    :cond_2
    move v3, v5

    .line 82
    :goto_2
    and-int/2addr p2, v4

    .line 83
    check-cast p1, Lpi;

    .line 84
    .line 85
    invoke-virtual {p1, p2, v3}, Lpi;->O(IZ)Z

    .line 86
    .line 87
    .line 88
    move-result p2

    .line 89
    if-eqz p2, :cond_4

    .line 90
    .line 91
    if-nez p0, :cond_3

    .line 92
    .line 93
    const p0, -0x41afc885

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, p0}, Lpi;->W(I)V

    .line 97
    .line 98
    .line 99
    :goto_3
    invoke-virtual {p1, v5}, Lpi;->p(Z)V

    .line 100
    .line 101
    .line 102
    goto :goto_4

    .line 103
    :cond_3
    const p2, 0x2f6df146

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1, p2}, Lpi;->W(I)V

    .line 107
    .line 108
    .line 109
    invoke-interface {p0, p1, v0}, Lww;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    goto :goto_3

    .line 113
    :goto_4
    invoke-virtual {v2, p1, v0}, Lmh;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    goto :goto_5

    .line 117
    :cond_4
    invoke-virtual {p1}, Lpi;->R()V

    .line 118
    .line 119
    .line 120
    :goto_5
    return-object v1

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
