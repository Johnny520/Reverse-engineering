.class public final Lir0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# instance fields
.field public final a:Ljava/util/List;

.field public final b:Ld;

.field public final c:I

.field public d:I


# direct methods
.method public constructor <init>(Ljava/util/List;Ld;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lir0;->a:Ljava/util/List;

    .line 5
    .line 6
    iput-object p2, p0, Lir0;->b:Ld;

    .line 7
    .line 8
    invoke-virtual {p0}, Lir0;->a()Landroid/view/MotionEvent;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    const/4 v0, 0x0

    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getClassification()I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move p2, v0

    .line 21
    :goto_0
    iput p2, p0, Lir0;->c:I

    .line 22
    .line 23
    invoke-virtual {p0}, Lir0;->a()Landroid/view/MotionEvent;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    if-eqz p2, :cond_1

    .line 28
    .line 29
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getButtonState()I

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-virtual {p0}, Lir0;->a()Landroid/view/MotionEvent;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    if-eqz p2, :cond_2

    .line 37
    .line 38
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getMetaState()I

    .line 39
    .line 40
    .line 41
    :cond_2
    invoke-virtual {p0}, Lir0;->a()Landroid/view/MotionEvent;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    const/4 v1, 0x3

    .line 46
    const/4 v2, 0x2

    .line 47
    const/4 v3, 0x1

    .line 48
    if-eqz p2, :cond_6

    .line 49
    .line 50
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-eqz p1, :cond_5

    .line 55
    .line 56
    if-eq p1, v3, :cond_4

    .line 57
    .line 58
    if-eq p1, v2, :cond_3

    .line 59
    .line 60
    packed-switch p1, :pswitch_data_0

    .line 61
    .line 62
    .line 63
    goto :goto_4

    .line 64
    :pswitch_0
    const/4 v0, 0x5

    .line 65
    goto :goto_4

    .line 66
    :pswitch_1
    const/4 v0, 0x4

    .line 67
    goto :goto_4

    .line 68
    :pswitch_2
    const/4 v0, 0x6

    .line 69
    goto :goto_4

    .line 70
    :cond_3
    :pswitch_3
    move v0, v1

    .line 71
    goto :goto_4

    .line 72
    :cond_4
    :goto_1
    :pswitch_4
    move v0, v2

    .line 73
    goto :goto_4

    .line 74
    :cond_5
    :goto_2
    :pswitch_5
    move v0, v3

    .line 75
    goto :goto_4

    .line 76
    :cond_6
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 77
    .line 78
    .line 79
    move-result p2

    .line 80
    :goto_3
    if-ge v0, p2, :cond_3

    .line 81
    .line 82
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    check-cast v4, Lnr0;

    .line 87
    .line 88
    invoke-static {v4}, Lw60;->k(Lnr0;)Z

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    if-eqz v5, :cond_7

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_7
    invoke-static {v4}, Lw60;->i(Lnr0;)Z

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    if-eqz v4, :cond_8

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_8
    add-int/lit8 v0, v0, 0x1

    .line 103
    .line 104
    goto :goto_3

    .line 105
    :goto_4
    iput v0, p0, Lir0;->d:I

    .line 106
    .line 107
    return-void

    .line 108
    nop

    .line 109
    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a()Landroid/view/MotionEvent;
    .locals 0

    .line 1
    iget-object p0, p0, Lir0;->b:Ld;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Ld;->f:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ld;

    .line 8
    .line 9
    iget-object p0, p0, Ld;->f:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Landroid/view/MotionEvent;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return-object p0
.end method
