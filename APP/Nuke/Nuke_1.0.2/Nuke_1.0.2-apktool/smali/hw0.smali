.class public final Lhw0;
.super Ltw2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lin0;


# instance fields
.field public final synthetic l:I

.field public m:I

.field public final synthetic n:Ljava/lang/Object;

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V
    .locals 0

    .line 1
    iput p5, p0, Lhw0;->l:I

    .line 2
    .line 3
    iput-object p1, p0, Lhw0;->n:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lhw0;->o:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lhw0;->p:Ljava/lang/Object;

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-direct {p0, p1, p4}, Ltw2;-><init>(ILt00;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lhw0;->l:I

    .line 2
    .line 3
    sget-object v1, La83;->a:La83;

    .line 4
    .line 5
    iget-object v2, p0, Lhw0;->p:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, Lhw0;->o:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object p0, p0, Lhw0;->n:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object v8, p1

    .line 15
    check-cast v8, Lt00;

    .line 16
    .line 17
    new-instance v4, Lhw0;

    .line 18
    .line 19
    move-object v5, p0

    .line 20
    check-cast v5, Lvn1;

    .line 21
    .line 22
    move-object v6, v3

    .line 23
    check-cast v6, Lih2;

    .line 24
    .line 25
    move-object v7, v2

    .line 26
    check-cast v7, Ljava/lang/String;

    .line 27
    .line 28
    const/4 v9, 0x1

    .line 29
    invoke-direct/range {v4 .. v9}, Lhw0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v4, v1}, Lhw0;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0

    .line 37
    :pswitch_0
    move-object v6, p1

    .line 38
    check-cast v6, Lt00;

    .line 39
    .line 40
    move-object p1, v2

    .line 41
    new-instance v2, Lhw0;

    .line 42
    .line 43
    check-cast p0, Ljw0;

    .line 44
    .line 45
    move-object v4, v3

    .line 46
    check-cast v4, Lk82;

    .line 47
    .line 48
    move-object v5, p1

    .line 49
    check-cast v5, Ltw0;

    .line 50
    .line 51
    const/4 v7, 0x0

    .line 52
    move-object v3, p0

    .line 53
    invoke-direct/range {v2 .. v7}, Lhw0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2, v1}, Lhw0;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lhw0;->l:I

    .line 2
    .line 3
    iget-object v1, p0, Lhw0;->p:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Lhw0;->n:Ljava/lang/Object;

    .line 6
    .line 7
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    sget-object v4, Lk20;->h:Lk20;

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    iget-object v6, p0, Lhw0;->o:Ljava/lang/Object;

    .line 13
    .line 14
    const/4 v7, 0x0

    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast v6, Lih2;

    .line 19
    .line 20
    iget v0, p0, Lhw0;->m:I

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    if-ne v0, v5, :cond_0

    .line 25
    .line 26
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-static {v3}, Ls;->l(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    move-object p1, v7

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    check-cast v2, Lvn1;

    .line 39
    .line 40
    iget-object p1, v2, Lvn1;->d:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, Ldf2;

    .line 43
    .line 44
    iget-object p1, p1, Ldf2;->h:Lgh2;

    .line 45
    .line 46
    iget-object v0, v6, Lih2;->b:Ljava/lang/String;

    .line 47
    .line 48
    new-instance v3, Lhh2;

    .line 49
    .line 50
    iget-object v2, v2, Lvn1;->b:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v2, Lu22;

    .line 53
    .line 54
    iget-object v2, v2, Lu22;->a:Lth2;

    .line 55
    .line 56
    iget-object v7, v2, Lth2;->c:Ljava/lang/String;

    .line 57
    .line 58
    iget-object v2, v2, Lth2;->d:Ljava/lang/String;

    .line 59
    .line 60
    invoke-direct {v3, v7, v2, v0}, Lhh2;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    iget-object v0, v6, Lih2;->a:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v1, Ljava/lang/String;

    .line 66
    .line 67
    const-string v2, "property"

    .line 68
    .line 69
    invoke-static {v1, v2}, Lrp0;->R(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    iput v5, p0, Lhw0;->m:I

    .line 73
    .line 74
    invoke-interface {p1, v3, v0, v1, p0}, Lgh2;->j(Lhh2;Ljava/lang/Object;Ljava/lang/String;Lhw0;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    if-ne p1, v4, :cond_2

    .line 79
    .line 80
    move-object p1, v4

    .line 81
    :cond_2
    :goto_0
    return-object p1

    .line 82
    :pswitch_0
    iget v0, p0, Lhw0;->m:I

    .line 83
    .line 84
    if-eqz v0, :cond_4

    .line 85
    .line 86
    if-ne v0, v5, :cond_3

    .line 87
    .line 88
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_3
    invoke-static {v3}, Ls;->l(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    move-object p1, v7

    .line 96
    goto :goto_1

    .line 97
    :cond_4
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    check-cast v2, Ljw0;

    .line 101
    .line 102
    check-cast v6, Lk82;

    .line 103
    .line 104
    check-cast v1, Ltw0;

    .line 105
    .line 106
    new-instance p1, Lgw0;

    .line 107
    .line 108
    invoke-direct {p1, v2, v1, v7}, Lgw0;-><init>(Ljw0;Ltw0;Lt00;)V

    .line 109
    .line 110
    .line 111
    iput v5, p0, Lhw0;->m:I

    .line 112
    .line 113
    invoke-static {v2, v6, v1, p1, p0}, Ljw0;->a(Ljw0;Lk82;Ltw0;Lnn0;Lu00;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    if-ne p1, v4, :cond_5

    .line 118
    .line 119
    move-object p1, v4

    .line 120
    :cond_5
    :goto_1
    return-object p1

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
