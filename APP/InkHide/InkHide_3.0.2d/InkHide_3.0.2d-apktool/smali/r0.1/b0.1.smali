.class public final synthetic Lr0/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, Lr0/b0;->b:I

    iput-object p1, p0, Lr0/b0;->c:Ljava/lang/Object;

    iput-object p2, p0, Lr0/b0;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object v1, p0, Lr0/b0;->c:Ljava/lang/Object;

    .line 3
    .line 4
    iget-object v2, p0, Lr0/b0;->d:Ljava/lang/Object;

    .line 5
    .line 6
    iget v3, p0, Lr0/b0;->b:I

    .line 7
    .line 8
    packed-switch v3, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast v2, Ls0/p;

    .line 12
    .line 13
    iget p1, v2, Ln0/a;->b:I

    .line 14
    .line 15
    check-cast v1, Li/t;

    .line 16
    .line 17
    invoke-static {v1, p1}, Li/t;->b(Li/t;I)V

    .line 18
    .line 19
    .line 20
    return v0

    .line 21
    :pswitch_0
    check-cast v2, Ls0/e;

    .line 22
    .line 23
    iget p1, v2, Ln0/a;->b:I

    .line 24
    .line 25
    check-cast v1, Li/q1;

    .line 26
    .line 27
    invoke-static {v1, p1}, Li/q1;->a(Li/q1;I)V

    .line 28
    .line 29
    .line 30
    return v0

    .line 31
    :pswitch_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 32
    .line 33
    .line 34
    move-result-wide v3

    .line 35
    check-cast v1, Landroid/view/View$OnLongClickListener;

    .line 36
    .line 37
    invoke-interface {v1, p1}, Landroid/view/View$OnLongClickListener;->onLongClick(Landroid/view/View;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    sget-object v6, Lr0/H0;->g0:Ljava/util/List;

    .line 50
    .line 51
    check-cast v2, Lr0/H0;

    .line 52
    .line 53
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    const-string v6, "conversation original longClick"

    .line 57
    .line 58
    invoke-static {v6, v3, v4, v5}, Lr0/H0;->b1(Ljava/lang/String;JLjava/lang/String;)V

    .line 59
    .line 60
    .line 61
    if-eqz p1, :cond_0

    .line 62
    .line 63
    new-instance v3, LA0/r;

    .line 64
    .line 65
    const/16 v4, 0x9

    .line 66
    .line 67
    invoke-direct {v3, v2, p1, v1, v4}, LA0/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, v3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 71
    .line 72
    .line 73
    :cond_0
    return v0

    .line 74
    :pswitch_2
    check-cast v1, Landroid/view/View$OnLongClickListener;

    .line 75
    .line 76
    if-nez p1, :cond_1

    .line 77
    .line 78
    invoke-interface {v1, p1}, Landroid/view/View$OnLongClickListener;->onLongClick(Landroid/view/View;)Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    goto :goto_0

    .line 83
    :cond_1
    check-cast v2, Lr0/d0;

    .line 84
    .line 85
    invoke-static {v2, p1, v1}, Lr0/d0;->f(Lr0/d0;Landroid/view/View;Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 89
    .line 90
    .line 91
    move-result-wide v3

    .line 92
    invoke-interface {v1, p1}, Landroid/view/View$OnLongClickListener;->onLongClick(Landroid/view/View;)Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    const-string v6, "contact original longClick"

    .line 105
    .line 106
    invoke-static {v6, v3, v4, v5}, Lr0/d0;->J0(Ljava/lang/String;JLjava/lang/String;)V

    .line 107
    .line 108
    .line 109
    new-instance v3, LA0/r;

    .line 110
    .line 111
    const/4 v4, 0x6

    .line 112
    invoke-direct {v3, v2, p1, v1, v4}, LA0/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1, v3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 116
    .line 117
    .line 118
    move p1, v0

    .line 119
    :goto_0
    return p1

    .line 120
    nop

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
