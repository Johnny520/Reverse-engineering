.class public final synthetic Lr0/i1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Z

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Le0/a;Landroid/view/KeyEvent$Callback;ZI)V
    .locals 0

    .line 1
    iput p4, p0, Lr0/i1;->a:I

    iput-object p1, p0, Lr0/i1;->c:Ljava/lang/Object;

    iput-object p2, p0, Lr0/i1;->d:Ljava/lang/Object;

    iput-boolean p3, p0, Lr0/i1;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ZLs0/J;Lz0/b;)V
    .locals 1

    .line 2
    const/4 v0, 0x2

    iput v0, p0, Lr0/i1;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lr0/i1;->b:Z

    iput-object p2, p0, Lr0/i1;->c:Ljava/lang/Object;

    iput-object p3, p0, Lr0/i1;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Lr0/i1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lr0/i1;->d:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lz0/b;

    .line 9
    .line 10
    iget-boolean v1, p0, Lr0/i1;->b:Z

    .line 11
    .line 12
    iget-object v2, p0, Lr0/i1;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Ls0/J;

    .line 15
    .line 16
    invoke-static {v1, v2, v0}, Ls0/J;->n(ZLs0/J;Lz0/b;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    iget-object v0, p0, Lr0/i1;->c:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lr0/A1;

    .line 23
    .line 24
    iget-object v1, p0, Lr0/i1;->d:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Landroid/app/Activity;

    .line 27
    .line 28
    iget-boolean v2, p0, Lr0/i1;->b:Z

    .line 29
    .line 30
    invoke-virtual {v0, v1, v2}, Lr0/A1;->d(Landroid/app/Activity;Z)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :pswitch_1
    iget-object v0, p0, Lr0/i1;->d:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, Landroid/widget/AbsListView;

    .line 37
    .line 38
    iget-object v1, p0, Lr0/i1;->c:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v1, Lr0/l1;

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-static {v0}, Lr0/l1;->B(Landroid/widget/AbsListView;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_3

    .line 50
    .line 51
    :try_start_0
    invoke-virtual {v0}, Landroid/widget/AdapterView;->getAdapter()Landroid/widget/Adapter;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    instance-of v2, v1, Landroid/widget/ListAdapter;

    .line 56
    .line 57
    if-eqz v2, :cond_0

    .line 58
    .line 59
    check-cast v1, Landroid/widget/ListAdapter;

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    const/4 v1, 0x0

    .line 63
    :goto_0
    const/4 v2, 0x0

    .line 64
    if-eqz v1, :cond_1

    .line 65
    .line 66
    const-string v3, "notifyDataSetChanged"

    .line 67
    .line 68
    new-array v4, v2, [Ljava/lang/Object;

    .line 69
    .line 70
    invoke-static {v1, v3, v4}, Lc0/f;->a(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    .line 72
    .line 73
    :cond_1
    iget-boolean v3, p0, Lr0/i1;->b:Z

    .line 74
    .line 75
    if-eqz v3, :cond_2

    .line 76
    .line 77
    if-eqz v1, :cond_2

    .line 78
    .line 79
    :try_start_1
    const-string v3, "setAdapter"

    .line 80
    .line 81
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-static {v0, v3, v1}, Lc0/f;->a(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    :cond_2
    invoke-virtual {v0}, Landroid/widget/AbsListView;->invalidateViews()V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, Landroid/widget/AbsListView;->requestLayout()V

    .line 92
    .line 93
    .line 94
    const-string v1, "layoutChildren"

    .line 95
    .line 96
    new-array v2, v2, [Ljava/lang/Object;

    .line 97
    .line 98
    sget-object v3, Lc0/f;->b:Ld0/b;

    .line 99
    .line 100
    invoke-interface {v3, v0, v1, v2}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 101
    .line 102
    .line 103
    :catchall_0
    :cond_3
    return-void

    .line 104
    nop

    .line 105
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
