.class public final Lu80;
.super Ltw2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic l:I

.field public final synthetic m:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lt00;I)V
    .locals 0

    .line 1
    iput p3, p0, Lu80;->l:I

    .line 2
    .line 3
    iput-object p1, p0, Lu80;->m:Ljava/lang/Object;

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
    iget v0, p0, Lu80;->l:I

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
    invoke-virtual {p0, p2, p1}, Lu80;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lu80;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lu80;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-object v1

    .line 22
    :pswitch_0
    invoke-virtual {p0, p2, p1}, Lu80;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, Lu80;

    .line 27
    .line 28
    invoke-virtual {p0, v1}, Lu80;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :pswitch_1
    invoke-virtual {p0, p2, p1}, Lu80;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    check-cast p0, Lu80;

    .line 38
    .line 39
    invoke-virtual {p0, v1}, Lu80;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final p(Lt00;Ljava/lang/Object;)Lt00;
    .locals 1

    .line 1
    iget p2, p0, Lu80;->l:I

    .line 2
    .line 3
    iget-object p0, p0, Lu80;->m:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch p2, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p2, Lu80;

    .line 9
    .line 10
    check-cast p0, Landroid/content/Context;

    .line 11
    .line 12
    const/4 v0, 0x2

    .line 13
    invoke-direct {p2, p0, p1, v0}, Lu80;-><init>(Ljava/lang/Object;Lt00;I)V

    .line 14
    .line 15
    .line 16
    return-object p2

    .line 17
    :pswitch_0
    new-instance p2, Lu80;

    .line 18
    .line 19
    check-cast p0, Lp02;

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    invoke-direct {p2, p0, p1, v0}, Lu80;-><init>(Ljava/lang/Object;Lt00;I)V

    .line 23
    .line 24
    .line 25
    return-object p2

    .line 26
    :pswitch_1
    new-instance p2, Lu80;

    .line 27
    .line 28
    check-cast p0, Lsz0;

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    invoke-direct {p2, p0, p1, v0}, Lu80;-><init>(Ljava/lang/Object;Lt00;I)V

    .line 32
    .line 33
    .line 34
    return-object p2

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lu80;->l:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    sget-object p1, Lsq1;->a:Lsq1;

    .line 11
    .line 12
    iget-object p0, p0, Lu80;->m:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Landroid/content/Context;

    .line 15
    .line 16
    invoke-virtual {p1, p0}, Lsq1;->d(Landroid/content/Context;)V

    .line 17
    .line 18
    .line 19
    sget-boolean p0, Lsq1;->f:Z

    .line 20
    .line 21
    if-nez p0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    sget-object p0, Lsq1;->b:Ls00;

    .line 25
    .line 26
    new-instance p1, Llk0;

    .line 27
    .line 28
    const/4 v0, 0x2

    .line 29
    invoke-direct {p1, v0, v1, v0}, Llk0;-><init>(ILt00;I)V

    .line 30
    .line 31
    .line 32
    const/4 v0, 0x3

    .line 33
    invoke-static {p0, v1, p1, v0}, Lp7;->A(Lj20;La20;Lmn0;I)Lzt2;

    .line 34
    .line 35
    .line 36
    :goto_0
    sget-object p0, La83;->a:La83;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_0
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-object p0, p0, Lu80;->m:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p0, Lp02;

    .line 45
    .line 46
    iget-object p1, p0, Lp02;->b:Landroid/content/Context;

    .line 47
    .line 48
    iget-object v0, p0, Lp02;->c:Lrm2;

    .line 49
    .line 50
    const-class v2, Landroid/view/textclassifier/TextClassificationManager;

    .line 51
    .line 52
    invoke-virtual {p1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    check-cast v2, Landroid/view/textclassifier/TextClassificationManager;

    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_2

    .line 63
    .line 64
    const/4 v3, 0x1

    .line 65
    if-ne v0, v3, :cond_1

    .line 66
    .line 67
    const-string v0, "textview"

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_1
    invoke-static {}, Lc80;->s()V

    .line 71
    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_2
    const-string v0, "edittext"

    .line 75
    .line 76
    :goto_1
    invoke-static {}, Lp90;->C()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-static {p1, v0}, Lp90;->i(Ljava/lang/String;Ljava/lang/String;)Landroid/view/textclassifier/TextClassificationContext$Builder;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-static {p1}, Lp90;->j(Landroid/view/textclassifier/TextClassificationContext$Builder;)Landroid/view/textclassifier/TextClassificationContext;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-static {v2, p1}, Lp90;->k(Landroid/view/textclassifier/TextClassificationManager;Landroid/view/textclassifier/TextClassificationContext;)Landroid/view/textclassifier/TextClassifier;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    iput-object v1, p0, Lp02;->f:Landroid/view/textclassifier/TextClassifier;

    .line 96
    .line 97
    :goto_2
    return-object v1

    .line 98
    :pswitch_1
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    iget-object p0, p0, Lu80;->m:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast p0, Lsz0;

    .line 104
    .line 105
    invoke-static {p0}, Lsz0;->k(Lsz0;)Ljava/io/File;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-static {}, Leu;->E()Lpb1;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-static {p0, p0, p1}, Lsz0;->s(Ljava/io/File;Ljava/io/File;Lpb1;)V

    .line 114
    .line 115
    .line 116
    invoke-static {p1}, Leu;->z(Lpb1;)Lpb1;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-static {p0}, Ldu;->z0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    return-object p0

    .line 125
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
