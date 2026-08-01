.class public final synthetic Lvg;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lv90;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lvg;->d:I

    .line 2
    .line 3
    iput-object p2, p0, Lvg;->e:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lvg;->f:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final e(Lx90;Lq90;)V
    .locals 7

    .line 1
    iget p1, p0, Lvg;->d:I

    .line 2
    .line 3
    iget-object v0, p0, Lvg;->f:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, Lvg;->e:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Lde0;

    .line 11
    .line 12
    check-cast v0, Lr90;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Lde0;->a:Lug;

    .line 18
    .line 19
    iget-object v1, p0, Lde0;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 20
    .line 21
    sget-object v2, Lq90;->Companion:Lo90;

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    const/4 v3, 0x4

    .line 31
    const/4 v4, 0x3

    .line 32
    const/4 v5, 0x0

    .line 33
    const/4 v6, 0x2

    .line 34
    if-eq v2, v6, :cond_2

    .line 35
    .line 36
    if-eq v2, v4, :cond_1

    .line 37
    .line 38
    if-eq v2, v3, :cond_0

    .line 39
    .line 40
    move-object v2, v5

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    sget-object v2, Lq90;->ON_RESUME:Lq90;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    sget-object v2, Lq90;->ON_START:Lq90;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    sget-object v2, Lq90;->ON_CREATE:Lq90;

    .line 49
    .line 50
    :goto_0
    if-ne p2, v2, :cond_3

    .line 51
    .line 52
    invoke-virtual {v1, v5}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Lug;->run()V

    .line 56
    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_3
    sget-object v2, Lq90;->ON_DESTROY:Lq90;

    .line 60
    .line 61
    if-ne p2, v2, :cond_4

    .line 62
    .line 63
    invoke-virtual {p0}, Lde0;->a()V

    .line 64
    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_4
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    if-eq p0, v6, :cond_7

    .line 72
    .line 73
    if-eq p0, v4, :cond_6

    .line 74
    .line 75
    if-eq p0, v3, :cond_5

    .line 76
    .line 77
    move-object v2, v5

    .line 78
    goto :goto_1

    .line 79
    :cond_5
    sget-object v2, Lq90;->ON_PAUSE:Lq90;

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_6
    sget-object v2, Lq90;->ON_STOP:Lq90;

    .line 83
    .line 84
    :cond_7
    :goto_1
    if-ne p2, v2, :cond_8

    .line 85
    .line 86
    invoke-virtual {v1, v5}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1}, Lug;->run()V

    .line 90
    .line 91
    .line 92
    :cond_8
    :goto_2
    return-void

    .line 93
    :pswitch_0
    check-cast p0, Lbl0;

    .line 94
    .line 95
    check-cast v0, Lgh;

    .line 96
    .line 97
    sget-object p1, Lq90;->ON_CREATE:Lq90;

    .line 98
    .line 99
    if-ne p2, p1, :cond_9

    .line 100
    .line 101
    invoke-static {v0}, Lz0;->g(Lgh;)Landroid/window/OnBackInvokedDispatcher;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0, p1}, Lbl0;->b(Landroid/window/OnBackInvokedDispatcher;)V

    .line 109
    .line 110
    .line 111
    :cond_9
    return-void

    .line 112
    nop

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
