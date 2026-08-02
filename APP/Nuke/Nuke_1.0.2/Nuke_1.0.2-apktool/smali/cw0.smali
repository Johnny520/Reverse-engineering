.class public final Lcw0;
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

.field public final synthetic q:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V
    .locals 0

    .line 1
    iput p6, p0, Lcw0;->l:I

    .line 2
    .line 3
    iput-object p1, p0, Lcw0;->n:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lcw0;->o:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lcw0;->p:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p4, p0, Lcw0;->q:Ljava/lang/Object;

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    invoke-direct {p0, p1, p5}, Ltw2;-><init>(ILt00;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lcw0;->l:I

    .line 2
    .line 3
    sget-object v1, La83;->a:La83;

    .line 4
    .line 5
    iget-object v2, p0, Lcw0;->q:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, Lcw0;->p:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, p0, Lcw0;->o:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object p0, p0, Lcw0;->n:Ljava/lang/Object;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    move-object v10, p1

    .line 17
    check-cast v10, Lt00;

    .line 18
    .line 19
    new-instance v5, Lcw0;

    .line 20
    .line 21
    move-object v6, p0

    .line 22
    check-cast v6, Lvn1;

    .line 23
    .line 24
    move-object v7, v4

    .line 25
    check-cast v7, Lih2;

    .line 26
    .line 27
    move-object v8, v3

    .line 28
    check-cast v8, Ljava/lang/String;

    .line 29
    .line 30
    move-object v9, v2

    .line 31
    check-cast v9, Ljava/util/ArrayList;

    .line 32
    .line 33
    const/4 v11, 0x1

    .line 34
    invoke-direct/range {v5 .. v11}, Lcw0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v5, v1}, Lcw0;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0

    .line 42
    :pswitch_0
    move-object v7, p1

    .line 43
    check-cast v7, Lt00;

    .line 44
    .line 45
    move-object p1, v2

    .line 46
    new-instance v2, Lcw0;

    .line 47
    .line 48
    check-cast p0, Ljw0;

    .line 49
    .line 50
    check-cast v4, Lk82;

    .line 51
    .line 52
    move-object v5, v3

    .line 53
    check-cast v5, Ltw0;

    .line 54
    .line 55
    move-object v6, p1

    .line 56
    check-cast v6, Lhg2;

    .line 57
    .line 58
    const/4 v8, 0x0

    .line 59
    move-object v3, p0

    .line 60
    invoke-direct/range {v2 .. v8}, Lcw0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2, v1}, Lcw0;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    return-object p0

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget v0, p0, Lcw0;->l:I

    .line 2
    .line 3
    iget-object v1, p0, Lcw0;->q:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Lcw0;->p:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, Lcw0;->n:Ljava/lang/Object;

    .line 8
    .line 9
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 10
    .line 11
    sget-object v5, Lk20;->h:Lk20;

    .line 12
    .line 13
    const/4 v6, 0x1

    .line 14
    iget-object v7, p0, Lcw0;->o:Ljava/lang/Object;

    .line 15
    .line 16
    const/4 v8, 0x0

    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    check-cast v7, Lih2;

    .line 21
    .line 22
    iget v0, p0, Lcw0;->m:I

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    if-ne v0, v6, :cond_0

    .line 27
    .line 28
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-static {v4}, Ls;->l(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    move-object p1, v8

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    check-cast v3, Lvn1;

    .line 41
    .line 42
    iget-object p1, v3, Lvn1;->d:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, Ldf2;

    .line 45
    .line 46
    iget-object v8, p1, Ldf2;->h:Lgh2;

    .line 47
    .line 48
    iget-object p1, v7, Lih2;->b:Ljava/lang/String;

    .line 49
    .line 50
    new-instance v9, Lhh2;

    .line 51
    .line 52
    iget-object v0, v3, Lvn1;->b:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v0, Lu22;

    .line 55
    .line 56
    iget-object v0, v0, Lu22;->a:Lth2;

    .line 57
    .line 58
    iget-object v3, v0, Lth2;->c:Ljava/lang/String;

    .line 59
    .line 60
    iget-object v0, v0, Lth2;->d:Ljava/lang/String;

    .line 61
    .line 62
    invoke-direct {v9, v3, v0, p1}, Lhh2;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    iget-object v10, v7, Lih2;->a:Ljava/lang/Object;

    .line 66
    .line 67
    move-object v11, v2

    .line 68
    check-cast v11, Ljava/lang/String;

    .line 69
    .line 70
    const-string p1, "method"

    .line 71
    .line 72
    invoke-static {v11, p1}, Lrp0;->R(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    move-object v12, v1

    .line 76
    check-cast v12, Ljava/util/ArrayList;

    .line 77
    .line 78
    iput v6, p0, Lcw0;->m:I

    .line 79
    .line 80
    move-object v13, p0

    .line 81
    invoke-interface/range {v8 .. v13}, Lgh2;->a(Lhh2;Ljava/lang/Object;Ljava/lang/String;Ljava/util/ArrayList;Lcw0;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    if-ne p1, v5, :cond_2

    .line 86
    .line 87
    move-object p1, v5

    .line 88
    :cond_2
    :goto_0
    return-object p1

    .line 89
    :pswitch_0
    move-object v13, p0

    .line 90
    iget p0, v13, Lcw0;->m:I

    .line 91
    .line 92
    if-eqz p0, :cond_4

    .line 93
    .line 94
    if-ne p0, v6, :cond_3

    .line 95
    .line 96
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_3
    invoke-static {v4}, Ls;->l(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    move-object p1, v8

    .line 104
    goto :goto_1

    .line 105
    :cond_4
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    check-cast v3, Ljw0;

    .line 109
    .line 110
    check-cast v7, Lk82;

    .line 111
    .line 112
    check-cast v2, Ltw0;

    .line 113
    .line 114
    new-instance p0, Lbw0;

    .line 115
    .line 116
    check-cast v1, Lhg2;

    .line 117
    .line 118
    invoke-direct {p0, v3, v2, v1, v8}, Lbw0;-><init>(Ljw0;Ltw0;Lhg2;Lt00;)V

    .line 119
    .line 120
    .line 121
    iput v6, v13, Lcw0;->m:I

    .line 122
    .line 123
    invoke-static {v3, v7, v2, p0, v13}, Ljw0;->a(Ljw0;Lk82;Ltw0;Lnn0;Lu00;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    if-ne p1, v5, :cond_5

    .line 128
    .line 129
    move-object p1, v5

    .line 130
    :cond_5
    :goto_1
    return-object p1

    .line 131
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
