.class public final Llk0;
.super Ltw2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic l:I

.field public m:I


# direct methods
.method public synthetic constructor <init>(ILt00;I)V
    .locals 0

    .line 1
    iput p3, p0, Llk0;->l:I

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Ltw2;-><init>(ILt00;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Llk0;->l:I

    .line 2
    .line 3
    sget-object v1, La83;->a:La83;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Lj20;

    .line 9
    .line 10
    check-cast p2, Lt00;

    .line 11
    .line 12
    invoke-virtual {p0, p2, p1}, Llk0;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Llk0;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Llk0;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Lj20;

    .line 24
    .line 25
    check-cast p2, Lt00;

    .line 26
    .line 27
    invoke-virtual {p0, p2, p1}, Llk0;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Llk0;

    .line 32
    .line 33
    invoke-virtual {p0, v1}, Llk0;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :pswitch_1
    check-cast p1, Ljava/lang/Number;

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    check-cast p2, Lt00;

    .line 45
    .line 46
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p0, p2, p1}, Llk0;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    check-cast p0, Llk0;

    .line 55
    .line 56
    invoke-virtual {p0, v1}, Llk0;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final p(Lt00;Ljava/lang/Object;)Lt00;
    .locals 2

    .line 1
    iget p0, p0, Llk0;->l:I

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    packed-switch p0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    new-instance p0, Llk0;

    .line 8
    .line 9
    invoke-direct {p0, v0, p1, v0}, Llk0;-><init>(ILt00;I)V

    .line 10
    .line 11
    .line 12
    return-object p0

    .line 13
    :pswitch_0
    new-instance p0, Llk0;

    .line 14
    .line 15
    const/4 p2, 0x1

    .line 16
    invoke-direct {p0, v0, p1, p2}, Llk0;-><init>(ILt00;I)V

    .line 17
    .line 18
    .line 19
    return-object p0

    .line 20
    :pswitch_1
    new-instance p0, Llk0;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-direct {p0, v0, p1, v1}, Llk0;-><init>(ILt00;I)V

    .line 24
    .line 25
    .line 26
    check-cast p2, Ljava/lang/Number;

    .line 27
    .line 28
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    iput p1, p0, Llk0;->m:I

    .line 33
    .line 34
    return-object p0

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Llk0;->l:I

    .line 2
    .line 3
    sget-object v1, La83;->a:La83;

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    sget-object v4, Lk20;->h:Lk20;

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget v0, p0, Llk0;->m:I

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    if-ne v0, v5, :cond_0

    .line 19
    .line 20
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-static {v2}, Ls;->l(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    move-object v1, v3

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    sget-object p1, Lsq1;->a:Lsq1;

    .line 33
    .line 34
    iput v5, p0, Llk0;->m:I

    .line 35
    .line 36
    invoke-virtual {p1, p0}, Lsq1;->h(Lu00;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    if-ne p0, v4, :cond_2

    .line 41
    .line 42
    move-object v1, v4

    .line 43
    :cond_2
    :goto_0
    return-object v1

    .line 44
    :pswitch_0
    iget v0, p0, Llk0;->m:I

    .line 45
    .line 46
    if-eqz v0, :cond_4

    .line 47
    .line 48
    if-ne v0, v5, :cond_3

    .line 49
    .line 50
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_3
    invoke-static {v2}, Ls;->l(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    move-object v1, v3

    .line 58
    goto :goto_1

    .line 59
    :cond_4
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    sget-object p1, Lsq1;->a:Lsq1;

    .line 63
    .line 64
    sget-object p1, Lsq1;->p:Lhv;

    .line 65
    .line 66
    if-eqz p1, :cond_7

    .line 67
    .line 68
    sget-object v0, Lsq1;->o:Ljn;

    .line 69
    .line 70
    if-eqz v0, :cond_6

    .line 71
    .line 72
    iput v5, p0, Llk0;->m:I

    .line 73
    .line 74
    invoke-static {p1, v0, p0}, Lsq1;->a(Lhv;Lfq;Lu00;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    if-ne p0, v4, :cond_5

    .line 79
    .line 80
    move-object v1, v4

    .line 81
    :cond_5
    :goto_1
    return-object v1

    .line 82
    :cond_6
    const-string p0, "messageQueue"

    .line 83
    .line 84
    invoke-static {p0}, Lt11;->S(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    throw v3

    .line 88
    :cond_7
    const-string p0, "messageDispatchReady"

    .line 89
    .line 90
    invoke-static {p0}, Lt11;->S(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw v3

    .line 94
    :pswitch_1
    iget p0, p0, Llk0;->m:I

    .line 95
    .line 96
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    if-lez p0, :cond_8

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_8
    const/4 v5, 0x0

    .line 103
    :goto_2
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    return-object p0

    .line 108
    nop

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
