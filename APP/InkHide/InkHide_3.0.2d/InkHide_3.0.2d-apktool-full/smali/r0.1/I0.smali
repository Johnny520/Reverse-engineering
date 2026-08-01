.class public final Lr0/I0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# instance fields
.field public b:I

.field public final synthetic c:Landroid/view/View;

.field public final synthetic d:Lr0/L0;


# direct methods
.method public constructor <init>(Landroid/view/View;Lr0/L0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr0/I0;->c:Landroid/view/View;

    .line 5
    .line 6
    iput-object p2, p0, Lr0/I0;->d:Lr0/L0;

    .line 7
    .line 8
    const/4 p1, 0x6

    .line 9
    iput p1, p0, Lr0/I0;->b:I

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final onPreDraw()Z
    .locals 8

    .line 1
    iget-object v0, p0, Lr0/I0;->c:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto/16 :goto_2

    .line 14
    .line 15
    :cond_0
    iget-object v1, p0, Lr0/I0;->d:Lr0/L0;

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Lr0/L0;->y(Landroid/view/View;)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    if-eqz v2, :cond_7

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Lr0/L0;->N(Landroid/view/View;)Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    const/4 v4, 0x0

    .line 28
    if-nez v3, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    invoke-static {v2}, Lr0/L0;->B(Landroid/view/View;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    if-nez v3, :cond_2

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    new-instance v5, Ljava/lang/ref/WeakReference;

    .line 39
    .line 40
    invoke-direct {v5, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Lr0/L0;->n()Ljava/util/Set;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-interface {v2}, Ljava/util/Set;->isEmpty()Z

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    if-eqz v5, :cond_3

    .line 52
    .line 53
    :goto_0
    move v2, v4

    .line 54
    goto :goto_1

    .line 55
    :cond_3
    invoke-virtual {v1, v3, v2}, Lr0/L0;->x(Ljava/lang/Object;Ljava/util/Set;)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-eqz v2, :cond_5

    .line 60
    .line 61
    iget-object v1, v1, Lr0/L0;->e:Ljava/util/Set;

    .line 62
    .line 63
    invoke-interface {v1, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    if-eqz v5, :cond_4

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_4
    :try_start_0
    invoke-interface {v1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    const-string v5, "notifyDataSetChanged"

    .line 74
    .line 75
    new-array v6, v4, [Ljava/lang/Object;

    .line 76
    .line 77
    sget-object v7, Lc0/f;->b:Ld0/b;

    .line 78
    .line 79
    invoke-interface {v7, v3, v5, v6}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    .line 81
    .line 82
    :catchall_0
    invoke-interface {v1, v3}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    :cond_5
    :goto_1
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-virtual {v1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-eqz v1, :cond_6

    .line 94
    .line 95
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-virtual {v1, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 100
    .line 101
    .line 102
    :cond_6
    if-eqz v2, :cond_7

    .line 103
    .line 104
    return v4

    .line 105
    :cond_7
    iget v1, p0, Lr0/I0;->b:I

    .line 106
    .line 107
    add-int/lit8 v1, v1, -0x1

    .line 108
    .line 109
    iput v1, p0, Lr0/I0;->b:I

    .line 110
    .line 111
    if-gtz v1, :cond_8

    .line 112
    .line 113
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    invoke-virtual {v1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    if-eqz v1, :cond_8

    .line 122
    .line 123
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 128
    .line 129
    .line 130
    :cond_8
    :goto_2
    const/4 v0, 0x1

    .line 131
    return v0
.end method
