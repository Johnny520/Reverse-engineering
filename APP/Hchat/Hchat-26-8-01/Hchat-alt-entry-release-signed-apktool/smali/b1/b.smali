.class public final Lb1/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Landroid/view/View$OnDragListener;
.implements Lb1/c;


# instance fields
.field public final a:Lb1/h;

.field public final b:Lf/f;

.field public final c:Lb1/a;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lb1/h;

    .line 5
    .line 6
    invoke-direct {v0}, Ly0/n;-><init>()V

    .line 7
    .line 8
    .line 9
    const-wide/16 v1, 0x0

    .line 10
    .line 11
    iput-wide v1, v0, Lb1/h;->w:J

    .line 12
    .line 13
    iput-object v0, p0, Lb1/b;->a:Lb1/h;

    .line 14
    .line 15
    new-instance v0, Lf/f;

    .line 16
    .line 17
    invoke-direct {v0}, Lf/f;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lb1/b;->b:Lf/f;

    .line 21
    .line 22
    new-instance v0, Lb1/a;

    .line 23
    .line 24
    invoke-direct {v0, p0}, Lb1/a;-><init>(Lb1/b;)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lb1/b;->c:Lb1/a;

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final onDrag(Landroid/view/View;Landroid/view/DragEvent;)Z
    .locals 5

    .line 1
    new-instance p1, Landroidx/lifecycle/x;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-direct {p1, p2, v0}, Landroidx/lifecycle/x;-><init>(Ljava/lang/Object;I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Landroid/view/DragEvent;->getAction()I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    sget-object v0, Lx1/d2;->g:Lx1/d2;

    .line 12
    .line 13
    iget-object v1, p0, Lb1/b;->b:Lf/f;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    iget-object v3, p0, Lb1/b;->a:Lb1/h;

    .line 17
    .line 18
    packed-switch p2, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    return v2

    .line 22
    :pswitch_0
    invoke-virtual {v3}, Lb1/h;->m1()V

    .line 23
    .line 24
    .line 25
    return v2

    .line 26
    :pswitch_1
    invoke-virtual {v3}, Lb1/h;->l1()V

    .line 27
    .line 28
    .line 29
    return v2

    .line 30
    :pswitch_2
    new-instance p2, Lb1/f;

    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    invoke-direct {p2, p1, v4}, Lb1/f;-><init>(Ljava/lang/Object;I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p2, v3}, Lb1/f;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    if-eq p1, v0, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-static {v3, p2}, Lx1/k;->B(Lx1/e2;Lfg/l;)V

    .line 44
    .line 45
    .line 46
    :goto_0
    invoke-virtual {v1}, Lf/f;->clear()V

    .line 47
    .line 48
    .line 49
    return v2

    .line 50
    :pswitch_3
    invoke-virtual {v3}, Lb1/h;->k1()Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    return p1

    .line 55
    :pswitch_4
    invoke-virtual {v3, p1}, Lb1/h;->n1(Landroidx/lifecycle/x;)V

    .line 56
    .line 57
    .line 58
    return v2

    .line 59
    :pswitch_5
    new-instance p2, Lgg/q;

    .line 60
    .line 61
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 62
    .line 63
    .line 64
    new-instance v2, Lb1/e;

    .line 65
    .line 66
    invoke-direct {v2, p1, v3, p2}, Lb1/e;-><init>(Landroidx/lifecycle/x;Lb1/h;Lgg/q;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2, v3}, Lb1/e;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    if-eq p1, v0, :cond_1

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_1
    invoke-static {v3, v2}, Lx1/k;->B(Lx1/e2;Lfg/l;)V

    .line 77
    .line 78
    .line 79
    :goto_1
    iget-boolean p1, p2, Lgg/q;->g:Z

    .line 80
    .line 81
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    new-instance p2, Lf/a;

    .line 85
    .line 86
    invoke-direct {p2, v1}, Lf/a;-><init>(Lf/f;)V

    .line 87
    .line 88
    .line 89
    :goto_2
    invoke-virtual {p2}, Lf/a;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-eqz v0, :cond_2

    .line 94
    .line 95
    invoke-virtual {p2}, Lf/a;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    check-cast v0, Lb1/h;

    .line 100
    .line 101
    invoke-virtual {v0}, Lb1/h;->o1()V

    .line 102
    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_2
    return p1

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
