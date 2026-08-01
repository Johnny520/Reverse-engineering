.class public final Le2;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnDragListener;
.implements Lkv;


# instance fields
.field public final α:Lmv;

.field public final β:Ld7;

.field public final γ:Ld2;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lmv;

    .line 5
    .line 6
    invoke-direct {v0}, Lq01;-><init>()V

    .line 7
    .line 8
    .line 9
    const-wide/16 v1, 0x0

    .line 10
    .line 11
    iput-wide v1, v0, Lmv;->φ:J

    .line 12
    .line 13
    iput-object v0, p0, Le2;->α:Lmv;

    .line 14
    .line 15
    new-instance v0, Ld7;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, v1}, Ld7;-><init>(I)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Le2;->β:Ld7;

    .line 22
    .line 23
    new-instance v0, Ld2;

    .line 24
    .line 25
    invoke-direct {v0, p0}, Ld2;-><init>(Le2;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Le2;->γ:Ld2;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final onDrag(Landroid/view/View;Landroid/view/DragEvent;)Z
    .locals 4

    .line 1
    new-instance p1, Ln;

    .line 2
    .line 3
    const/16 v0, 0xe

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Ln;-><init>(ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p2}, Landroid/view/DragEvent;->getAction()I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    sget-object v0, Lw52;->ε:Lw52;

    .line 13
    .line 14
    iget-object v1, p0, Le2;->β:Ld7;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    iget-object p0, p0, Le2;->α:Lmv;

    .line 18
    .line 19
    packed-switch p2, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    return v2

    .line 23
    :pswitch_0
    invoke-virtual {p0}, Lmv;->Д()V

    .line 24
    .line 25
    .line 26
    return v2

    .line 27
    :pswitch_1
    invoke-virtual {p0}, Lmv;->Г()V

    .line 28
    .line 29
    .line 30
    return v2

    .line 31
    :pswitch_2
    new-instance p2, Lb0;

    .line 32
    .line 33
    const/16 v3, 0x9

    .line 34
    .line 35
    invoke-direct {p2, v3, p1}, Lb0;-><init>(ILjava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p2, p0}, Lb0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-static {p0, p2}, Lg81;->ψ(Lx52;La80;)V

    .line 46
    .line 47
    .line 48
    :goto_0
    invoke-virtual {v1}, Ld7;->clear()V

    .line 49
    .line 50
    .line 51
    return v2

    .line 52
    :pswitch_3
    invoke-virtual {p0}, Lmv;->В()Z

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    return p0

    .line 57
    :pswitch_4
    invoke-virtual {p0, p1}, Lmv;->Е(Ln;)V

    .line 58
    .line 59
    .line 60
    return v2

    .line 61
    :pswitch_5
    new-instance p2, Lqm1;

    .line 62
    .line 63
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 64
    .line 65
    .line 66
    new-instance v2, Lb0;

    .line 67
    .line 68
    invoke-direct {v2, p1, p0, p2}, Lb0;-><init>(Ln;Lmv;Lqm1;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2, p0}, Lb0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-static {p0, v2}, Lg81;->ψ(Lx52;La80;)V

    .line 79
    .line 80
    .line 81
    :goto_1
    iget-boolean p0, p2, Lqm1;->ε:Z

    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    new-instance p1, Ly6;

    .line 87
    .line 88
    invoke-direct {p1, v1}, Ly6;-><init>(Ld7;)V

    .line 89
    .line 90
    .line 91
    :goto_2
    invoke-virtual {p1}, Ly6;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result p2

    .line 95
    if-eqz p2, :cond_2

    .line 96
    .line 97
    invoke-virtual {p1}, Ly6;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    check-cast p2, Lmv;

    .line 102
    .line 103
    invoke-virtual {p2}, Lmv;->Ж()V

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
