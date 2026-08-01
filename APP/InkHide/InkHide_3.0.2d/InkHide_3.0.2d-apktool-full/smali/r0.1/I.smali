.class public final synthetic Lr0/I;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lr0/d0;

.field public final synthetic b:LN0/k;

.field public final synthetic c:[J

.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Landroid/widget/ListView;

.field public final synthetic g:Landroid/view/View;

.field public final synthetic h:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Lr0/d0;LN0/k;[JI[JLjava/lang/Object;Landroid/widget/ListView;Landroid/view/View;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr0/I;->a:Lr0/d0;

    iput-object p2, p0, Lr0/I;->b:LN0/k;

    iput-object p3, p0, Lr0/I;->c:[J

    iput p4, p0, Lr0/I;->d:I

    iput-object p6, p0, Lr0/I;->e:Ljava/lang/Object;

    iput-object p7, p0, Lr0/I;->f:Landroid/widget/ListView;

    iput-object p8, p0, Lr0/I;->g:Landroid/view/View;

    iput-object p9, p0, Lr0/I;->h:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    iget-object v1, p0, Lr0/I;->a:Lr0/d0;

    .line 2
    .line 3
    iget-object v4, p0, Lr0/I;->e:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v5, p0, Lr0/I;->f:Landroid/widget/ListView;

    .line 6
    .line 7
    iget-object v6, p0, Lr0/I;->g:Landroid/view/View;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    move v3, v2

    .line 11
    const/4 v2, 0x0

    .line 12
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-static {v4, v5, v6}, Lr0/d0;->R0(Ljava/lang/Object;Landroid/widget/ListView;Landroid/view/View;)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-static {v0}, Lr0/d0;->Y(Landroid/view/View;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-ne v0, v3, :cond_0

    .line 26
    .line 27
    move v0, v3

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v0, v2

    .line 30
    :goto_0
    invoke-virtual {v1, v4, v5, v6}, Lr0/d0;->o(Ljava/lang/Object;Landroid/widget/ListView;Landroid/view/View;)V

    .line 31
    .line 32
    .line 33
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 34
    .line 35
    .line 36
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    goto :goto_1

    .line 38
    :catchall_0
    move-exception v0

    .line 39
    new-instance v7, LE0/d;

    .line 40
    .line 41
    invoke-direct {v7, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 42
    .line 43
    .line 44
    move-object v0, v7

    .line 45
    :goto_1
    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 46
    .line 47
    instance-of v8, v0, LE0/d;

    .line 48
    .line 49
    if-eqz v8, :cond_1

    .line 50
    .line 51
    move-object v0, v7

    .line 52
    :cond_1
    check-cast v0, Ljava/lang/Boolean;

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-object v7, p0, Lr0/I;->b:LN0/k;

    .line 59
    .line 60
    if-eqz v0, :cond_2

    .line 61
    .line 62
    iget-boolean v0, v7, LN0/k;->a:Z

    .line 63
    .line 64
    if-nez v0, :cond_2

    .line 65
    .line 66
    iput-boolean v3, v7, LN0/k;->a:Z

    .line 67
    .line 68
    iget-object v3, p0, Lr0/I;->c:[J

    .line 69
    .line 70
    aget-wide v8, v3, v2

    .line 71
    .line 72
    new-instance v0, Lr0/M;

    .line 73
    .line 74
    invoke-direct/range {v0 .. v6}, Lr0/M;-><init>(Lr0/d0;I[JLjava/lang/Object;Landroid/widget/ListView;Landroid/view/View;)V

    .line 75
    .line 76
    .line 77
    iget-object v3, p0, Lr0/I;->h:Landroid/view/View;

    .line 78
    .line 79
    invoke-virtual {v3, v0, v8, v9}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 80
    .line 81
    .line 82
    :cond_2
    iget v0, p0, Lr0/I;->d:I

    .line 83
    .line 84
    const/4 v3, 0x3

    .line 85
    if-ne v0, v3, :cond_3

    .line 86
    .line 87
    iget-boolean v0, v7, LN0/k;->a:Z

    .line 88
    .line 89
    if-nez v0, :cond_3

    .line 90
    .line 91
    iput-boolean v2, v1, Lr0/d0;->s:Z

    .line 92
    .line 93
    :cond_3
    return-void
.end method
