.class public final Lf5;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Landroid/view/View$OnDragListener;
.implements Lqp;


# instance fields
.field public final a:Lsp;

.field public final b:Le9;

.field public final c:Le5;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lsp;

    .line 5
    .line 6
    invoke-direct {v0}, Loe0;-><init>()V

    .line 7
    .line 8
    .line 9
    const-wide/16 v1, 0x0

    .line 10
    .line 11
    iput-wide v1, v0, Lsp;->t:J

    .line 12
    .line 13
    iput-object v0, p0, Lf5;->a:Lsp;

    .line 14
    .line 15
    new-instance v0, Le9;

    .line 16
    .line 17
    invoke-direct {v0}, Le9;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lf5;->b:Le9;

    .line 21
    .line 22
    new-instance v0, Le5;

    .line 23
    .line 24
    invoke-direct {v0, p0}, Le5;-><init>(Lf5;)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lf5;->c:Le5;

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final onDrag(Landroid/view/View;Landroid/view/DragEvent;)Z
    .locals 4

    .line 1
    new-instance p1, Lx1;

    .line 2
    .line 3
    const/16 v0, 0x9

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lx1;-><init>(ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p2}, Landroid/view/DragEvent;->getAction()I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    sget-object v1, Lg91;->d:Lg91;

    .line 13
    .line 14
    iget-object v2, p0, Lf5;->b:Le9;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    iget-object p0, p0, Lf5;->a:Lsp;

    .line 18
    .line 19
    packed-switch p2, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    return v3

    .line 23
    :pswitch_0
    invoke-virtual {p0}, Lsp;->y0()V

    .line 24
    .line 25
    .line 26
    return v3

    .line 27
    :pswitch_1
    invoke-virtual {p0}, Lsp;->x0()V

    .line 28
    .line 29
    .line 30
    return v3

    .line 31
    :pswitch_2
    new-instance p2, Ls2;

    .line 32
    .line 33
    invoke-direct {p2, v0, p1}, Ls2;-><init>(ILjava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p2, p0}, Ls2;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    if-eq p1, v1, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-static {p0, p2}, Lr60;->F(Lh91;Lsw;)V

    .line 44
    .line 45
    .line 46
    :goto_0
    invoke-virtual {v2}, Le9;->clear()V

    .line 47
    .line 48
    .line 49
    return v3

    .line 50
    :pswitch_3
    invoke-virtual {p0}, Lsp;->w0()Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    return p0

    .line 55
    :pswitch_4
    invoke-virtual {p0, p1}, Lsp;->z0(Lx1;)V

    .line 56
    .line 57
    .line 58
    return v3

    .line 59
    :pswitch_5
    new-instance p2, Lvt0;

    .line 60
    .line 61
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 62
    .line 63
    .line 64
    new-instance v0, Ls2;

    .line 65
    .line 66
    invoke-direct {v0, p1, p0, p2}, Ls2;-><init>(Lx1;Lsp;Lvt0;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, p0}, Ls2;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    if-eq p1, v1, :cond_1

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_1
    invoke-static {p0, v0}, Lr60;->F(Lh91;Lsw;)V

    .line 77
    .line 78
    .line 79
    :goto_1
    iget-boolean p0, p2, Lvt0;->d:Z

    .line 80
    .line 81
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    new-instance p1, Lz8;

    .line 85
    .line 86
    invoke-direct {p1, v2}, Lz8;-><init>(Le9;)V

    .line 87
    .line 88
    .line 89
    :goto_2
    invoke-virtual {p1}, Lz8;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result p2

    .line 93
    if-eqz p2, :cond_2

    .line 94
    .line 95
    invoke-virtual {p1}, Lz8;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    check-cast p2, Lsp;

    .line 100
    .line 101
    invoke-virtual {p2}, Lsp;->A0()V

    .line 102
    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_2
    return p0

    .line 106
    nop

    .line 107
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
