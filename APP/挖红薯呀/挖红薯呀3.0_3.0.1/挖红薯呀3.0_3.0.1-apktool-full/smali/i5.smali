.class public final Li5;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Li5;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Li5;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Lrr0;Lik;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Li5;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, Lna1;->a:Lna1;

    .line 5
    .line 6
    sget-object v3, Lzk;->d:Lzk;

    .line 7
    .line 8
    iget-object p0, p0, Li5;->b:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    new-instance v0, Le;

    .line 14
    .line 15
    check-cast p0, Lkm;

    .line 16
    .line 17
    const/4 v4, 0x5

    .line 18
    invoke-direct {v0, p1, p0, v1, v4}, Le;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lik;I)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0, p2}, Lp30;->w(Lww;Lik;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    if-ne p0, v3, :cond_0

    .line 26
    .line 27
    move-object v2, p0

    .line 28
    :cond_0
    return-object v2

    .line 29
    :pswitch_0
    check-cast p0, Ldg;

    .line 30
    .line 31
    iget-boolean v0, p0, Ln;->x:Z

    .line 32
    .line 33
    const/4 v8, 0x0

    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    iget-object v0, p0, Ldg;->O:Lhw;

    .line 37
    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    new-instance v0, Lag;

    .line 41
    .line 42
    const/4 v1, 0x0

    .line 43
    invoke-direct {v0, p0, v1}, Lag;-><init>(Ldg;I)V

    .line 44
    .line 45
    .line 46
    move-object v7, v0

    .line 47
    goto :goto_0

    .line 48
    :cond_1
    move-object v7, v8

    .line 49
    :goto_0
    new-instance v6, Lbg;

    .line 50
    .line 51
    invoke-direct {v6, p0, v8}, Lbg;-><init>(Ldg;Lik;)V

    .line 52
    .line 53
    .line 54
    new-instance v9, Lag;

    .line 55
    .line 56
    const/4 v0, 0x1

    .line 57
    invoke-direct {v9, p0, v0}, Lag;-><init>(Ldg;I)V

    .line 58
    .line 59
    .line 60
    sget-object p0, Lm61;->a:Lnq;

    .line 61
    .line 62
    new-instance v4, Le7;

    .line 63
    .line 64
    const/4 v10, 0x0

    .line 65
    const/4 v11, 0x2

    .line 66
    move-object v5, p1

    .line 67
    invoke-direct/range {v4 .. v11}, Le7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lik;I)V

    .line 68
    .line 69
    .line 70
    invoke-static {v4, p2}, Lp30;->w(Lww;Lik;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    if-ne p0, v3, :cond_2

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_2
    move-object p0, v2

    .line 78
    :goto_1
    if-ne p0, v3, :cond_3

    .line 79
    .line 80
    move-object v2, p0

    .line 81
    :cond_3
    return-object v2

    .line 82
    :pswitch_1
    move-object v5, p1

    .line 83
    new-instance p1, Lh5;

    .line 84
    .line 85
    check-cast p0, Lj5;

    .line 86
    .line 87
    invoke-direct {p1, p0, v1}, Lh5;-><init>(Lj5;Lik;)V

    .line 88
    .line 89
    .line 90
    invoke-static {v5, p1, p2}, Lp30;->o(Lrr0;Lww;Lik;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    if-ne p0, v3, :cond_4

    .line 95
    .line 96
    move-object v2, p0

    .line 97
    :cond_4
    return-object v2

    .line 98
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
