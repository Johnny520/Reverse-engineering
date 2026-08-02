.class public final Lr8;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lr8;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lr8;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ls12;Lt00;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lr8;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, Lk20;->h:Lk20;

    .line 5
    .line 6
    iget-object p0, p0, Lr8;->b:Ljava/lang/Object;

    .line 7
    .line 8
    sget-object v3, La83;->a:La83;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p0, Lkz2;

    .line 14
    .line 15
    new-instance v0, Lu0;

    .line 16
    .line 17
    invoke-direct {v0, p1, p0, v1}, Lu0;-><init>(Ls12;Lkz2;Lt00;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0, p2}, Lte;->u(Lmn0;Lt00;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    if-ne p0, v2, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move-object p0, v3

    .line 28
    :goto_0
    if-ne p0, v2, :cond_1

    .line 29
    .line 30
    move-object v3, p0

    .line 31
    :cond_1
    return-object v3

    .line 32
    :pswitch_0
    check-cast p0, Lb03;

    .line 33
    .line 34
    iget-object v0, p0, Lb03;->A:Ler2;

    .line 35
    .line 36
    iget-object p0, p0, Lb03;->z:Lzz2;

    .line 37
    .line 38
    invoke-static {p1, v0, p0, p2}, Lp40;->j(Ls12;Ler2;Lkz2;Lt00;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    if-ne p0, v2, :cond_2

    .line 43
    .line 44
    move-object v3, p0

    .line 45
    :cond_2
    return-object v3

    .line 46
    :pswitch_1
    new-instance v4, Le2;

    .line 47
    .line 48
    move-object v6, p0

    .line 49
    check-cast v6, Lvy2;

    .line 50
    .line 51
    const/4 v11, 0x0

    .line 52
    const/4 v12, 0x6

    .line 53
    const/4 v5, 0x1

    .line 54
    const-class v7, Lvy2;

    .line 55
    .line 56
    const-string v8, "tryShowContextMenu"

    .line 57
    .line 58
    const-string v9, "tryShowContextMenu-k-4lQ0M(J)V"

    .line 59
    .line 60
    const/4 v10, 0x0

    .line 61
    invoke-direct/range {v4 .. v12}, Le2;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 62
    .line 63
    .line 64
    new-instance p0, Lq8;

    .line 65
    .line 66
    const/4 v0, 0x1

    .line 67
    invoke-direct {p0, v4, v1, v0}, Lq8;-><init>(Ljava/lang/Object;Lt00;I)V

    .line 68
    .line 69
    .line 70
    invoke-static {p1, p0, p2}, Lsp0;->p(Ls12;Lmn0;Lt00;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    if-ne p0, v2, :cond_3

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_3
    move-object p0, v3

    .line 78
    :goto_1
    if-ne p0, v2, :cond_4

    .line 79
    .line 80
    move-object v3, p0

    .line 81
    :cond_4
    return-object v3

    .line 82
    :pswitch_2
    new-instance v0, Lym2;

    .line 83
    .line 84
    check-cast p0, Law2;

    .line 85
    .line 86
    invoke-direct {v0, p0, v1}, Lym2;-><init>(Law2;Lt00;)V

    .line 87
    .line 88
    .line 89
    invoke-static {p1, v0, p2}, Lsp0;->p(Ls12;Lmn0;Lt00;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    if-ne p0, v2, :cond_5

    .line 94
    .line 95
    move-object v3, p0

    .line 96
    :cond_5
    return-object v3

    .line 97
    :pswitch_3
    new-instance v0, Lq8;

    .line 98
    .line 99
    check-cast p0, Ln10;

    .line 100
    .line 101
    const/4 v4, 0x2

    .line 102
    invoke-direct {v0, p0, v1, v4}, Lq8;-><init>(Ljava/lang/Object;Lt00;I)V

    .line 103
    .line 104
    .line 105
    check-cast p1, Lzw2;

    .line 106
    .line 107
    invoke-virtual {p1, v0, p2}, Lzw2;->M0(Lmn0;Lt00;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    if-ne p0, v2, :cond_6

    .line 112
    .line 113
    move-object v3, p0

    .line 114
    :cond_6
    return-object v3

    .line 115
    :pswitch_4
    new-instance v0, Lq8;

    .line 116
    .line 117
    check-cast p0, Ls8;

    .line 118
    .line 119
    const/4 v4, 0x0

    .line 120
    invoke-direct {v0, p0, v1, v4}, Lq8;-><init>(Ljava/lang/Object;Lt00;I)V

    .line 121
    .line 122
    .line 123
    invoke-static {p1, v0, p2}, Lsp0;->p(Ls12;Lmn0;Lt00;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    if-ne p0, v2, :cond_7

    .line 128
    .line 129
    move-object v3, p0

    .line 130
    :cond_7
    return-object v3

    .line 131
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
