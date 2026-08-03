.class public final Lwb/dr;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lwb/p3;
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final g:Landroid/view/View;

.field public final h:Landroid/view/ViewGroup;

.field public final i:Landroid/view/ViewGroup;

.field public final j:I

.field public final k:Landroid/view/ViewGroup$LayoutParams;

.field public final l:Landroid/graphics/drawable/Drawable;

.field public final m:Landroid/view/View;

.field public final n:Ljava/util/ArrayList;

.field public final o:Landroid/widget/FrameLayout;

.field public final p:Landroid/widget/FrameLayout;

.field public final q:Ly1/c1;

.field public final r:Lc9/a1;

.field public final s:Landroid/view/View;

.field public final t:Lwb/zh;

.field public final u:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(Landroid/view/View;Landroid/view/ViewGroup;Landroid/view/ViewGroup;ILandroid/view/ViewGroup$LayoutParams;Landroid/graphics/drawable/Drawable;Landroid/view/View;Ljava/util/ArrayList;Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;Ly1/c1;Lc9/a1;Landroid/view/View;Lwb/zh;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb/dr;->g:Landroid/view/View;

    .line 5
    .line 6
    iput-object p2, p0, Lwb/dr;->h:Landroid/view/ViewGroup;

    .line 7
    .line 8
    iput-object p3, p0, Lwb/dr;->i:Landroid/view/ViewGroup;

    .line 9
    .line 10
    iput p4, p0, Lwb/dr;->j:I

    .line 11
    .line 12
    iput-object p5, p0, Lwb/dr;->k:Landroid/view/ViewGroup$LayoutParams;

    .line 13
    .line 14
    iput-object p6, p0, Lwb/dr;->l:Landroid/graphics/drawable/Drawable;

    .line 15
    .line 16
    iput-object p7, p0, Lwb/dr;->m:Landroid/view/View;

    .line 17
    .line 18
    iput-object p8, p0, Lwb/dr;->n:Ljava/util/ArrayList;

    .line 19
    .line 20
    iput-object p9, p0, Lwb/dr;->o:Landroid/widget/FrameLayout;

    .line 21
    .line 22
    iput-object p10, p0, Lwb/dr;->p:Landroid/widget/FrameLayout;

    .line 23
    .line 24
    iput-object p11, p0, Lwb/dr;->q:Ly1/c1;

    .line 25
    .line 26
    iput-object p12, p0, Lwb/dr;->r:Lc9/a1;

    .line 27
    .line 28
    iput-object p13, p0, Lwb/dr;->s:Landroid/view/View;

    .line 29
    .line 30
    iput-object p14, p0, Lwb/dr;->t:Lwb/zh;

    .line 31
    .line 32
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 33
    .line 34
    const/4 p2, 0x1

    .line 35
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, Lwb/dr;->u:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 12

    .line 1
    iget-object v1, p0, Lwb/dr;->q:Ly1/c1;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object v3, p0, Lwb/dr;->u:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 6
    .line 7
    invoke-virtual {v3, v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object v0, p0, Lwb/dr;->s:Landroid/view/View;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 19
    .line 20
    .line 21
    :cond_1
    iget-object v4, p0, Lwb/dr;->i:Landroid/view/ViewGroup;

    .line 22
    .line 23
    if-eq v4, v0, :cond_2

    .line 24
    .line 25
    invoke-virtual {v4, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 26
    .line 27
    .line 28
    :cond_2
    :try_start_0
    invoke-virtual {v1}, Ly1/a;->f()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    .line 31
    :catchall_0
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    instance-of v2, v0, Landroid/view/ViewGroup;

    .line 36
    .line 37
    if-eqz v2, :cond_3

    .line 38
    .line 39
    check-cast v0, Landroid/view/ViewGroup;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_3
    const/4 v0, 0x0

    .line 43
    :goto_0
    if-eqz v0, :cond_4

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 46
    .line 47
    .line 48
    :cond_4
    :try_start_1
    sget-object v0, Lwb/fr;->a:Lwb/fr;

    .line 49
    .line 50
    iget-object v2, p0, Lwb/dr;->g:Landroid/view/View;

    .line 51
    .line 52
    iget-object v3, p0, Lwb/dr;->h:Landroid/view/ViewGroup;

    .line 53
    .line 54
    iget v5, p0, Lwb/dr;->j:I

    .line 55
    .line 56
    iget-object v6, p0, Lwb/dr;->k:Landroid/view/ViewGroup$LayoutParams;

    .line 57
    .line 58
    iget-object v7, p0, Lwb/dr;->l:Landroid/graphics/drawable/Drawable;

    .line 59
    .line 60
    iget-object v8, p0, Lwb/dr;->m:Landroid/view/View;

    .line 61
    .line 62
    iget-object v9, p0, Lwb/dr;->n:Ljava/util/ArrayList;

    .line 63
    .line 64
    iget-object v10, p0, Lwb/dr;->o:Landroid/widget/FrameLayout;

    .line 65
    .line 66
    iget-object v11, p0, Lwb/dr;->p:Landroid/widget/FrameLayout;

    .line 67
    .line 68
    invoke-static/range {v2 .. v11}, Lwb/fr;->c(Landroid/view/View;Landroid/view/ViewGroup;Landroid/view/ViewGroup;ILandroid/view/ViewGroup$LayoutParams;Landroid/graphics/drawable/Drawable;Landroid/view/View;Ljava/util/ArrayList;Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;)V

    .line 69
    .line 70
    .line 71
    sget-object v0, Lsf/n;->a:Lsf/n;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :catchall_1
    move-exception v0

    .line 75
    new-instance v2, Lsf/f;

    .line 76
    .line 77
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 78
    .line 79
    .line 80
    move-object v0, v2

    .line 81
    :goto_1
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    if-eqz v0, :cond_5

    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    const-string v3, "[Hchat:Script] \u6062\u590d\u6a21\u5757\u60ac\u6d6e\u5e95\u680f\u5931\u8d25: "

    .line 92
    .line 93
    invoke-static {v3, v2, v0}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 94
    .line 95
    .line 96
    :cond_5
    invoke-static {v1}, Lx6/d;->p(Landroid/view/View;)V

    .line 97
    .line 98
    .line 99
    iget-object v0, p0, Lwb/dr;->r:Lc9/a1;

    .line 100
    .line 101
    iget-object v1, v0, Lc9/a1;->h:Landroidx/lifecycle/s;

    .line 102
    .line 103
    iget-object v2, v1, Landroidx/lifecycle/s;->c:Landroidx/lifecycle/l;

    .line 104
    .line 105
    sget-object v3, Landroidx/lifecycle/l;->g:Landroidx/lifecycle/l;

    .line 106
    .line 107
    if-eq v2, v3, :cond_6

    .line 108
    .line 109
    invoke-virtual {v1, v3}, Landroidx/lifecycle/s;->g(Landroidx/lifecycle/l;)V

    .line 110
    .line 111
    .line 112
    :cond_6
    iget-object v1, v0, Lc9/a1;->k:Lr3/a;

    .line 113
    .line 114
    invoke-virtual {v1}, Lr3/a;->a()V

    .line 115
    .line 116
    .line 117
    iget-object v0, v0, Lc9/a1;->j:Landroidx/lifecycle/e0;

    .line 118
    .line 119
    invoke-virtual {v0}, Landroidx/lifecycle/e0;->a()V

    .line 120
    .line 121
    .line 122
    iget-object v0, p0, Lwb/dr;->t:Lwb/zh;

    .line 123
    .line 124
    invoke-virtual {v0}, Lwb/zh;->invoke()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    return-void
.end method

.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lwb/dr;->a()V

    .line 5
    .line 6
    .line 7
    return-void
.end method
