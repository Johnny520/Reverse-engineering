.class public final Lxh;
.super Ltw2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic l:I

.field public m:Lxk1;

.field public n:I

.field public final synthetic o:Lxk1;


# direct methods
.method public synthetic constructor <init>(Lxk1;Lt00;I)V
    .locals 0

    .line 1
    iput p3, p0, Lxh;->l:I

    .line 2
    .line 3
    iput-object p1, p0, Lxh;->o:Lxk1;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p2}, Ltw2;-><init>(ILt00;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lxh;->l:I

    .line 2
    .line 3
    sget-object v1, La83;->a:La83;

    .line 4
    .line 5
    check-cast p1, Lj20;

    .line 6
    .line 7
    check-cast p2, Lt00;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p2, p1}, Lxh;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lxh;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lxh;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p2, p1}, Lxh;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lxh;

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lxh;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final p(Lt00;Ljava/lang/Object;)Lt00;
    .locals 1

    .line 1
    iget p2, p0, Lxh;->l:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p2, Lxh;

    .line 7
    .line 8
    iget-object p0, p0, Lxh;->o:Lxk1;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p2, p0, p1, v0}, Lxh;-><init>(Lxk1;Lt00;I)V

    .line 12
    .line 13
    .line 14
    return-object p2

    .line 15
    :pswitch_0
    new-instance p2, Lxh;

    .line 16
    .line 17
    iget-object p0, p0, Lxh;->o:Lxk1;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    invoke-direct {p2, p0, p1, v0}, Lxh;-><init>(Lxk1;Lt00;I)V

    .line 21
    .line 22
    .line 23
    return-object p2

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lxh;->l:I

    .line 2
    .line 3
    sget-object v1, La83;->a:La83;

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    sget-object v3, Lk20;->h:Lk20;

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    iget-object v5, p0, Lxh;->o:Lxk1;

    .line 11
    .line 12
    const/4 v6, 0x2

    .line 13
    const/4 v7, 0x0

    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    iget v0, p0, Lxh;->n:I

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    if-ne v0, v4, :cond_0

    .line 22
    .line 23
    iget-object v5, p0, Lxh;->m:Lxk1;

    .line 24
    .line 25
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-static {v2}, Ls;->l(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    move-object v1, v7

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    sget-object p1, Lj33;->a:Lj33;

    .line 38
    .line 39
    invoke-interface {v5, p1}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    sget-object p1, Lo90;->a:Lc60;

    .line 43
    .line 44
    sget-object p1, Lt50;->j:Lt50;

    .line 45
    .line 46
    new-instance v0, Lsb;

    .line 47
    .line 48
    const/4 v2, 0x3

    .line 49
    invoke-direct {v0, v6, v7, v2}, Lsb;-><init>(ILt00;I)V

    .line 50
    .line 51
    .line 52
    iput-object v5, p0, Lxh;->m:Lxk1;

    .line 53
    .line 54
    iput v4, p0, Lxh;->n:I

    .line 55
    .line 56
    invoke-static {p1, v0, p0}, Lp7;->R(La20;Lmn0;Lt00;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    if-ne p1, v3, :cond_2

    .line 61
    .line 62
    move-object v1, v3

    .line 63
    goto :goto_1

    .line 64
    :cond_2
    :goto_0
    check-cast p1, Lk33;

    .line 65
    .line 66
    invoke-interface {v5, p1}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    :goto_1
    return-object v1

    .line 70
    :pswitch_0
    iget v0, p0, Lxh;->n:I

    .line 71
    .line 72
    if-eqz v0, :cond_4

    .line 73
    .line 74
    if-ne v0, v4, :cond_3

    .line 75
    .line 76
    iget-object v5, p0, Lxh;->m:Lxk1;

    .line 77
    .line 78
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_3
    invoke-static {v2}, Ls;->l(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    move-object v1, v7

    .line 86
    goto :goto_3

    .line 87
    :cond_4
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    sget-object p1, Lv62;->a:Lv62;

    .line 91
    .line 92
    invoke-interface {v5, p1}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    sget-object p1, Lo90;->a:Lc60;

    .line 96
    .line 97
    sget-object p1, Lt50;->j:Lt50;

    .line 98
    .line 99
    new-instance v0, Lsb;

    .line 100
    .line 101
    invoke-direct {v0, v6, v7, v6}, Lsb;-><init>(ILt00;I)V

    .line 102
    .line 103
    .line 104
    iput-object v5, p0, Lxh;->m:Lxk1;

    .line 105
    .line 106
    iput v4, p0, Lxh;->n:I

    .line 107
    .line 108
    invoke-static {p1, v0, p0}, Lp7;->R(La20;Lmn0;Lt00;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    if-ne p1, v3, :cond_5

    .line 113
    .line 114
    move-object v1, v3

    .line 115
    goto :goto_3

    .line 116
    :cond_5
    :goto_2
    check-cast p1, Lw62;

    .line 117
    .line 118
    invoke-interface {v5, p1}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    :goto_3
    return-object v1

    .line 122
    nop

    .line 123
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
