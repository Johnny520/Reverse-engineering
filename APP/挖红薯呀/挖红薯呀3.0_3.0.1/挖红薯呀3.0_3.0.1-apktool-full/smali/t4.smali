.class public final synthetic Lt4;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lt4;->d:I

    .line 2
    .line 3
    iput-object p2, p0, Lt4;->e:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lt4;->f:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Lt4;->d:I

    .line 2
    .line 3
    iget-object v1, p0, Lt4;->f:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, Lt4;->e:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Landroid/content/Context;

    .line 11
    .line 12
    check-cast v1, Lsw;

    .line 13
    .line 14
    invoke-static {p0, v1}, Lwb1;->l(Landroid/content/Context;Lsw;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    check-cast p0, Lhw;

    .line 19
    .line 20
    check-cast v1, Landroid/content/Context;

    .line 21
    .line 22
    invoke-static {p0, v1}, Lhk0;->f(Lhw;Landroid/content/Context;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_1
    check-cast p0, Landroid/app/Dialog;

    .line 27
    .line 28
    check-cast v1, Landroid/content/Context;

    .line 29
    .line 30
    invoke-static {p0, v1}, Lob0;->g(Landroid/app/Dialog;Landroid/content/Context;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :pswitch_2
    check-cast p0, Lm90;

    .line 35
    .line 36
    check-cast v1, Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {p0, v1}, Lm90;->a(Lm90;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :pswitch_3
    check-cast p0, Lm90;

    .line 43
    .line 44
    check-cast v1, Ln90$a;

    .line 45
    .line 46
    invoke-static {p0, v1}, Lm90;->c(Lm90;Ln90$a;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :pswitch_4
    check-cast p0, Lm00;

    .line 51
    .line 52
    check-cast v1, Landroid/graphics/Bitmap;

    .line 53
    .line 54
    invoke-static {p0, v1}, Lm00;->g(Lm00;Landroid/graphics/Bitmap;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :pswitch_5
    check-cast p0, Landroid/widget/ImageView;

    .line 59
    .line 60
    check-cast v1, Landroid/graphics/Bitmap;

    .line 61
    .line 62
    invoke-static {p0, v1}, Lm00;->o0(Landroid/widget/ImageView;Landroid/graphics/Bitmap;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :pswitch_6
    check-cast p0, Ljava/lang/String;

    .line 67
    .line 68
    check-cast v1, Lsw;

    .line 69
    .line 70
    invoke-static {p0, v1}, Lvz;->c(Ljava/lang/String;Lsw;)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :pswitch_7
    check-cast p0, Lkp;

    .line 75
    .line 76
    check-cast v1, Llp$a;

    .line 77
    .line 78
    invoke-static {p0, v1}, Lkp;->d(Lkp;Llp$a;)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :pswitch_8
    check-cast p0, Ltop/anjao2024/xp1whs/MainActivity;

    .line 83
    .line 84
    check-cast v1, Lbl0;

    .line 85
    .line 86
    invoke-virtual {p0}, Lgh;->getLifecycle()Ls90;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    new-instance v2, Lvg;

    .line 91
    .line 92
    const/4 v3, 0x0

    .line 93
    invoke-direct {v2, v3, v1, p0}, Lvg;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, v2}, Ls90;->a(Lw90;)V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :pswitch_9
    check-cast p0, Lv4;

    .line 101
    .line 102
    check-cast v1, Landroid/util/LongSparseArray;

    .line 103
    .line 104
    invoke-static {p0, v1}, Ls91;->v(Lv4;Landroid/util/LongSparseArray;)V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    nop

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
