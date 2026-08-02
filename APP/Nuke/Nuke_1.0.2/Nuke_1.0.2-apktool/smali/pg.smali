.class public final synthetic Lpg;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lin0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Lsz1;


# direct methods
.method public synthetic constructor <init>(Lsz1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lpg;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lpg;->i:Lsz1;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lpg;->h:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, La83;->a:La83;

    .line 5
    .line 6
    iget-object p0, p0, Lpg;->i:Lsz1;

    .line 7
    .line 8
    check-cast p1, Lrz1;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    invoke-static {p1, p0, v1, v1}, Lrz1;->g(Lrz1;Lsz1;II)V

    .line 14
    .line 15
    .line 16
    return-object v2

    .line 17
    :pswitch_0
    invoke-static {p1, p0, v1, v1}, Lrz1;->i(Lrz1;Lsz1;II)V

    .line 18
    .line 19
    .line 20
    return-object v2

    .line 21
    :pswitch_1
    invoke-static {p1, p0, v1, v1}, Lrz1;->i(Lrz1;Lsz1;II)V

    .line 22
    .line 23
    .line 24
    return-object v2

    .line 25
    :pswitch_2
    invoke-static {p1, p0, v1, v1}, Lrz1;->g(Lrz1;Lsz1;II)V

    .line 26
    .line 27
    .line 28
    return-object v2

    .line 29
    :pswitch_3
    invoke-virtual {p1}, Lrz1;->e()Ld61;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sget-object v1, Ld61;->h:Ld61;

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    const/4 v4, 0x0

    .line 37
    if-eq v0, v1, :cond_1

    .line 38
    .line 39
    invoke-virtual {p1}, Lrz1;->f()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    invoke-virtual {p1}, Lrz1;->f()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iget v1, p0, Lsz1;->h:I

    .line 51
    .line 52
    sub-int/2addr v0, v1

    .line 53
    int-to-long v0, v0

    .line 54
    const/16 v5, 0x20

    .line 55
    .line 56
    shl-long/2addr v0, v5

    .line 57
    invoke-static {p1, p0}, Lrz1;->a(Lrz1;Lsz1;)V

    .line 58
    .line 59
    .line 60
    iget-wide v5, p0, Lsz1;->l:J

    .line 61
    .line 62
    invoke-static {v0, v1, v5, v6}, Lz01;->c(JJ)J

    .line 63
    .line 64
    .line 65
    move-result-wide v0

    .line 66
    invoke-virtual {p0, v0, v1, v3, v4}, Lsz1;->f0(JFLin0;)V

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_1
    :goto_0
    invoke-static {p1, p0}, Lrz1;->a(Lrz1;Lsz1;)V

    .line 71
    .line 72
    .line 73
    iget-wide v0, p0, Lsz1;->l:J

    .line 74
    .line 75
    const-wide/16 v5, 0x0

    .line 76
    .line 77
    invoke-static {v5, v6, v0, v1}, Lz01;->c(JJ)J

    .line 78
    .line 79
    .line 80
    move-result-wide v0

    .line 81
    invoke-virtual {p0, v0, v1, v3, v4}, Lsz1;->f0(JFLin0;)V

    .line 82
    .line 83
    .line 84
    :goto_1
    return-object v2

    .line 85
    :pswitch_4
    invoke-static {p1, p0, v1, v1}, Lrz1;->i(Lrz1;Lsz1;II)V

    .line 86
    .line 87
    .line 88
    return-object v2

    .line 89
    :pswitch_5
    invoke-static {p1, p0, v1, v1}, Lrz1;->i(Lrz1;Lsz1;II)V

    .line 90
    .line 91
    .line 92
    return-object v2

    .line 93
    :pswitch_6
    invoke-static {p1, p0, v1, v1}, Lrz1;->i(Lrz1;Lsz1;II)V

    .line 94
    .line 95
    .line 96
    return-object v2

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
