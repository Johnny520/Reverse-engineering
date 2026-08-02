.class public final Lpf0;
.super Lw51;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lin0;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:Lrf0;

.field public final synthetic k:J


# direct methods
.method public synthetic constructor <init>(Lrf0;JI)V
    .locals 0

    .line 1
    iput p4, p0, Lpf0;->i:I

    .line 2
    .line 3
    iput-object p1, p0, Lpf0;->j:Lrf0;

    .line 4
    .line 5
    iput-wide p2, p0, Lpf0;->k:J

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Lw51;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lpf0;->i:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x1

    .line 6
    iget-object v4, p0, Lpf0;->j:Lrf0;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, Lif0;

    .line 12
    .line 13
    iget-object p0, v4, Lrf0;->D:Lr5;

    .line 14
    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {v4}, Lrf0;->M0()Lr5;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    if-nez p0, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    iget-object p0, v4, Lrf0;->D:Lr5;

    .line 26
    .line 27
    invoke-virtual {v4}, Lrf0;->M0()Lr5;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {p0, v0}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-eqz p0, :cond_2

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-eqz p0, :cond_4

    .line 43
    .line 44
    if-eq p0, v3, :cond_4

    .line 45
    .line 46
    if-ne p0, v2, :cond_3

    .line 47
    .line 48
    iget-object p0, v4, Lrf0;->z:Lph0;

    .line 49
    .line 50
    iget-object p0, p0, Lph0;->a:Lz33;

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_3
    invoke-static {}, Lc80;->s()V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_4
    :goto_0
    new-instance v1, Lz01;

    .line 58
    .line 59
    const-wide/16 p0, 0x0

    .line 60
    .line 61
    invoke-direct {v1, p0, p1}, Lz01;-><init>(J)V

    .line 62
    .line 63
    .line 64
    :goto_1
    return-object v1

    .line 65
    :pswitch_0
    check-cast p1, Lif0;

    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-eqz p1, :cond_6

    .line 72
    .line 73
    if-eq p1, v3, :cond_6

    .line 74
    .line 75
    if-ne p1, v2, :cond_5

    .line 76
    .line 77
    iget-object p1, v4, Lrf0;->z:Lph0;

    .line 78
    .line 79
    iget-object p1, p1, Lph0;->a:Lz33;

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_5
    invoke-static {}, Lc80;->s()V

    .line 83
    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_6
    :goto_2
    new-instance v1, Lh11;

    .line 87
    .line 88
    iget-wide p0, p0, Lpf0;->k:J

    .line 89
    .line 90
    invoke-direct {v1, p0, p1}, Lh11;-><init>(J)V

    .line 91
    .line 92
    .line 93
    :goto_3
    return-object v1

    .line 94
    nop

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
