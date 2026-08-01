.class public final synthetic Lv9;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lxw;


# instance fields
.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lv9;->d:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget p0, p0, Lv9;->d:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lo7;

    .line 7
    .line 8
    check-cast p2, Lji;

    .line 9
    .line 10
    check-cast p3, Ljava/lang/Integer;

    .line 11
    .line 12
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    invoke-static {p1, p2, p0}, Loh;->f(Lo7;Lji;I)Lna1;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    check-cast p1, Lo7;

    .line 22
    .line 23
    check-cast p2, Lji;

    .line 24
    .line 25
    check-cast p3, Ljava/lang/Integer;

    .line 26
    .line 27
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    invoke-static {p1, p2, p0}, Loh;->i(Lo7;Lji;I)Lna1;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    check-cast p1, Ljw0;

    .line 37
    .line 38
    check-cast p2, Lji;

    .line 39
    .line 40
    check-cast p3, Ljava/lang/Integer;

    .line 41
    .line 42
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    invoke-static {p1, p2, p0}, Loh;->b(Ljw0;Lji;I)Lna1;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    :pswitch_2
    check-cast p1, Ljw0;

    .line 52
    .line 53
    check-cast p2, Lji;

    .line 54
    .line 55
    check-cast p3, Ljava/lang/Integer;

    .line 56
    .line 57
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    invoke-static {p1, p2, p0}, Loh;->l(Ljw0;Lji;I)Lna1;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    return-object p0

    .line 66
    :pswitch_3
    check-cast p1, Ljw0;

    .line 67
    .line 68
    check-cast p2, Lji;

    .line 69
    .line 70
    check-cast p3, Ljava/lang/Integer;

    .line 71
    .line 72
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    invoke-static {p1, p2, p0}, Loh;->j(Ljw0;Lji;I)Lna1;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    return-object p0

    .line 81
    :pswitch_4
    move-object v0, p1

    .line 82
    check-cast v0, Lzd0;

    .line 83
    .line 84
    check-cast p2, Lsd0;

    .line 85
    .line 86
    check-cast p3, Lpj;

    .line 87
    .line 88
    iget-wide p0, p3, Lpj;->a:J

    .line 89
    .line 90
    invoke-interface {p2, p0, p1}, Lsd0;->e(J)Lxq0;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    iget v1, p0, Lxq0;->d:I

    .line 95
    .line 96
    iget v2, p0, Lxq0;->e:I

    .line 97
    .line 98
    new-instance v4, Lw9;

    .line 99
    .line 100
    const/4 p1, 0x0

    .line 101
    invoke-direct {v4, p1}, Lw9;-><init>(I)V

    .line 102
    .line 103
    .line 104
    new-instance v5, Lx9;

    .line 105
    .line 106
    invoke-direct {v5, p0, p1}, Lx9;-><init>(Lxq0;I)V

    .line 107
    .line 108
    .line 109
    sget-object v3, Lis;->d:Lis;

    .line 110
    .line 111
    invoke-interface/range {v0 .. v5}, Lzd0;->E(IILjava/util/Map;Lsw;Lsw;)Lyd0;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    return-object p0

    .line 116
    nop

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
