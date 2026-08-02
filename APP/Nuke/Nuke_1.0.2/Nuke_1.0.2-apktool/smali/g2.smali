.class public final Lg2;
.super Ltw2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic l:I

.field public m:I

.field public final synthetic n:Lbk1;

.field public final synthetic o:Lz22;


# direct methods
.method public synthetic constructor <init>(Lbk1;Lz22;Lt00;I)V
    .locals 0

    .line 13
    iput p4, p0, Lg2;->l:I

    iput-object p1, p0, Lg2;->n:Lbk1;

    iput-object p2, p0, Lg2;->o:Lz22;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ltw2;-><init>(ILt00;)V

    return-void
.end method

.method public constructor <init>(Lz22;Lbk1;Lt00;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lg2;->l:I

    .line 3
    .line 4
    iput-object p1, p0, Lg2;->o:Lz22;

    .line 5
    .line 6
    iput-object p2, p0, Lg2;->n:Lbk1;

    .line 7
    .line 8
    const/4 p1, 0x2

    .line 9
    invoke-direct {p0, p1, p3}, Ltw2;-><init>(ILt00;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lg2;->l:I

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
    invoke-virtual {p0, p2, p1}, Lg2;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lg2;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lg2;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p2, p1}, Lg2;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lg2;

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lg2;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_1
    invoke-virtual {p0, p2, p1}, Lg2;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, Lg2;

    .line 39
    .line 40
    invoke-virtual {p0, v1}, Lg2;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final p(Lt00;Ljava/lang/Object;)Lt00;
    .locals 2

    .line 1
    iget p2, p0, Lg2;->l:I

    .line 2
    .line 3
    iget-object v0, p0, Lg2;->o:Lz22;

    .line 4
    .line 5
    iget-object p0, p0, Lg2;->n:Lbk1;

    .line 6
    .line 7
    packed-switch p2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p2, Lg2;

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    invoke-direct {p2, p0, v0, p1, v1}, Lg2;-><init>(Lbk1;Lz22;Lt00;I)V

    .line 14
    .line 15
    .line 16
    return-object p2

    .line 17
    :pswitch_0
    new-instance p2, Lg2;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {p2, p0, v0, p1, v1}, Lg2;-><init>(Lbk1;Lz22;Lt00;I)V

    .line 21
    .line 22
    .line 23
    return-object p2

    .line 24
    :pswitch_1
    new-instance p2, Lg2;

    .line 25
    .line 26
    invoke-direct {p2, v0, p0, p1}, Lg2;-><init>(Lz22;Lbk1;Lt00;)V

    .line 27
    .line 28
    .line 29
    return-object p2

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lg2;->l:I

    .line 2
    .line 3
    sget-object v1, La83;->a:La83;

    .line 4
    .line 5
    iget-object v2, p0, Lg2;->o:Lz22;

    .line 6
    .line 7
    iget-object v3, p0, Lg2;->n:Lbk1;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 11
    .line 12
    sget-object v6, Lk20;->h:Lk20;

    .line 13
    .line 14
    const/4 v7, 0x1

    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    iget v0, p0, Lg2;->m:I

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    if-ne v0, v7, :cond_0

    .line 23
    .line 24
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {v5}, Ls;->l(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    move-object v1, v4

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iput v7, p0, Lg2;->m:I

    .line 37
    .line 38
    invoke-virtual {v3, v2, p0}, Lbk1;->a(Lj11;Lt00;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    if-ne p0, v6, :cond_2

    .line 43
    .line 44
    move-object v1, v6

    .line 45
    :cond_2
    :goto_0
    return-object v1

    .line 46
    :pswitch_0
    iget v0, p0, Lg2;->m:I

    .line 47
    .line 48
    if-eqz v0, :cond_4

    .line 49
    .line 50
    if-ne v0, v7, :cond_3

    .line 51
    .line 52
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_3
    invoke-static {v5}, Ls;->l(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    move-object v1, v4

    .line 60
    goto :goto_1

    .line 61
    :cond_4
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iput v7, p0, Lg2;->m:I

    .line 65
    .line 66
    invoke-virtual {v3, v2, p0}, Lbk1;->a(Lj11;Lt00;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    if-ne p0, v6, :cond_5

    .line 71
    .line 72
    move-object v1, v6

    .line 73
    :cond_5
    :goto_1
    return-object v1

    .line 74
    :pswitch_1
    iget v0, p0, Lg2;->m:I

    .line 75
    .line 76
    if-eqz v0, :cond_7

    .line 77
    .line 78
    if-ne v0, v7, :cond_6

    .line 79
    .line 80
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_6
    invoke-static {v5}, Ls;->l(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    move-object v1, v4

    .line 88
    goto :goto_2

    .line 89
    :cond_7
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    new-instance p1, La32;

    .line 93
    .line 94
    invoke-direct {p1, v2}, La32;-><init>(Lz22;)V

    .line 95
    .line 96
    .line 97
    iput v7, p0, Lg2;->m:I

    .line 98
    .line 99
    invoke-virtual {v3, p1, p0}, Lbk1;->a(Lj11;Lt00;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    if-ne p0, v6, :cond_8

    .line 104
    .line 105
    move-object v1, v6

    .line 106
    :cond_8
    :goto_2
    return-object v1

    .line 107
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
