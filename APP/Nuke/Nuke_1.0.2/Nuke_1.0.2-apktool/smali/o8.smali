.class public final Lo8;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Landroid/view/View$OnDragListener;
.implements Leb0;


# instance fields
.field public final a:Lgb0;

.field public final b:Ljg;

.field public final c:Ln8;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lgb0;

    .line 5
    .line 6
    invoke-direct {v0}, Lth1;-><init>()V

    .line 7
    .line 8
    .line 9
    const-wide/16 v1, 0x0

    .line 10
    .line 11
    iput-wide v1, v0, Lgb0;->x:J

    .line 12
    .line 13
    iput-object v0, p0, Lo8;->a:Lgb0;

    .line 14
    .line 15
    new-instance v0, Ljg;

    .line 16
    .line 17
    invoke-direct {v0}, Ljg;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lo8;->b:Ljg;

    .line 21
    .line 22
    new-instance v0, Ln8;

    .line 23
    .line 24
    invoke-direct {v0, p0}, Ln8;-><init>(Lo8;)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lo8;->c:Ln8;

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final onDrag(Landroid/view/View;Landroid/view/DragEvent;)Z
    .locals 4

    .line 1
    new-instance p1, Ln4;

    .line 2
    .line 3
    const/16 v0, 0xe

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Ln4;-><init>(ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p2}, Landroid/view/DragEvent;->getAction()I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    sget-object v0, Lc43;->h:Lc43;

    .line 13
    .line 14
    iget-object v1, p0, Lo8;->b:Ljg;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    iget-object p0, p0, Lo8;->a:Lgb0;

    .line 18
    .line 19
    packed-switch p2, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    return v2

    .line 23
    :pswitch_0
    invoke-virtual {p0}, Lgb0;->O0()V

    .line 24
    .line 25
    .line 26
    return v2

    .line 27
    :pswitch_1
    invoke-virtual {p0}, Lgb0;->N0()V

    .line 28
    .line 29
    .line 30
    return v2

    .line 31
    :pswitch_2
    new-instance p2, Lv5;

    .line 32
    .line 33
    const/16 v3, 0xa

    .line 34
    .line 35
    invoke-direct {p2, v3, p1}, Lv5;-><init>(ILjava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p2, p0}, Lv5;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-eq p1, v0, :cond_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    invoke-static {p0, p2}, Ltb3;->f(Ld43;Lin0;)V

    .line 46
    .line 47
    .line 48
    :goto_0
    invoke-virtual {v1}, Ljg;->clear()V

    .line 49
    .line 50
    .line 51
    return v2

    .line 52
    :pswitch_3
    invoke-virtual {p0}, Lgb0;->M0()Z

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    return p0

    .line 57
    :pswitch_4
    invoke-virtual {p0, p1}, Lgb0;->P0(Ln4;)V

    .line 58
    .line 59
    .line 60
    return v2

    .line 61
    :pswitch_5
    new-instance p2, Ly62;

    .line 62
    .line 63
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 64
    .line 65
    .line 66
    new-instance v2, Lfb0;

    .line 67
    .line 68
    invoke-direct {v2, p1, p0, p2}, Lfb0;-><init>(Ln4;Lgb0;Ly62;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2, p0}, Lfb0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    if-eq p1, v0, :cond_1

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_1
    invoke-static {p0, v2}, Ltb3;->f(Ld43;Lin0;)V

    .line 79
    .line 80
    .line 81
    :goto_1
    iget-boolean p0, p2, Ly62;->h:Z

    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    new-instance p1, Ldg;

    .line 87
    .line 88
    invoke-direct {p1, v1}, Ldg;-><init>(Ljg;)V

    .line 89
    .line 90
    .line 91
    :goto_2
    invoke-virtual {p1}, Ldg;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result p2

    .line 95
    if-eqz p2, :cond_2

    .line 96
    .line 97
    invoke-virtual {p1}, Ldg;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    check-cast p2, Lgb0;

    .line 102
    .line 103
    invoke-virtual {p2}, Lgb0;->Q0()V

    .line 104
    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_2
    return p0

    .line 108
    nop

    .line 109
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
