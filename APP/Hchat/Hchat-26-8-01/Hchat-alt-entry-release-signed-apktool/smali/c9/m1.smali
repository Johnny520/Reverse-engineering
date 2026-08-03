.class public final synthetic Lc9/m1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Landroid/widget/AdapterView$OnItemLongClickListener;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Landroid/widget/AdapterView$OnItemLongClickListener;

.field public final synthetic d:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/Object;Landroid/widget/AdapterView$OnItemLongClickListener;Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc9/m1;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lc9/m1;->b:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Lc9/m1;->c:Landroid/widget/AdapterView$OnItemLongClickListener;

    .line 9
    .line 10
    iput-object p4, p0, Lc9/m1;->d:Landroid/content/Context;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final onItemLongClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)Z
    .locals 11

    .line 1
    sget-object v1, Lc9/d2;->l:Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    sget-object v0, Lc9/d2;->a:Lc9/d2;

    .line 4
    .line 5
    :try_start_0
    invoke-virtual {p1, p3}, Landroid/widget/AdapterView;->getItemAtPosition(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    goto :goto_0

    .line 10
    :catchall_0
    move-exception v0

    .line 11
    new-instance v2, Lsf/f;

    .line 12
    .line 13
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    move-object v0, v2

    .line 17
    :goto_0
    nop

    .line 18
    instance-of v2, v0, Lsf/f;

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    move-object v0, v4

    .line 24
    :cond_0
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-static {v0}, Lc9/d2;->i(Ljava/lang/Object;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    :cond_1
    move-object v7, v4

    .line 31
    invoke-static {v7}, Lc9/d2;->q(Ljava/lang/String;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    iget-object v8, p0, Lc9/m1;->b:Ljava/lang/Object;

    .line 36
    .line 37
    const/4 v9, 0x0

    .line 38
    if-nez v0, :cond_4

    .line 39
    .line 40
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-static {v0}, Lc9/d2;->l(Landroid/content/Context;)Landroid/app/Activity;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    if-eqz v0, :cond_5

    .line 49
    .line 50
    new-instance v2, Lc9/u1;

    .line 51
    .line 52
    if-nez v7, :cond_2

    .line 53
    .line 54
    const-string v7, ""

    .line 55
    .line 56
    :cond_2
    iget-object v4, p0, Lc9/m1;->a:Ljava/lang/String;

    .line 57
    .line 58
    invoke-direct {v2, v0, v7, v4, v8}, Lc9/u1;-><init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iget-object v2, p0, Lc9/m1;->c:Landroid/widget/AdapterView$OnItemLongClickListener;

    .line 65
    .line 66
    if-eqz v2, :cond_3

    .line 67
    .line 68
    move-object v3, p1

    .line 69
    move-object v4, p2

    .line 70
    move v5, p3

    .line 71
    move-wide v6, p4

    .line 72
    :try_start_1
    invoke-interface/range {v2 .. v7}, Landroid/widget/AdapterView$OnItemLongClickListener;->onItemLongClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)Z

    .line 73
    .line 74
    .line 75
    move-result v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 76
    goto :goto_1

    .line 77
    :catchall_1
    move-exception v0

    .line 78
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    .line 79
    .line 80
    .line 81
    throw v0

    .line 82
    :cond_3
    :goto_1
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    .line 83
    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_4
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-static {v0}, Lc9/d2;->l(Landroid/content/Context;)Landroid/app/Activity;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    if-eqz v6, :cond_5

    .line 95
    .line 96
    sget-object v0, Lc9/d2;->n:Landroid/os/Handler;

    .line 97
    .line 98
    new-instance v5, Lb9/c;

    .line 99
    .line 100
    const/4 v10, 0x4

    .line 101
    iget-object v9, p0, Lc9/m1;->d:Landroid/content/Context;

    .line 102
    .line 103
    invoke-direct/range {v5 .. v10}, Lb9/c;-><init>(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 107
    .line 108
    .line 109
    const/4 v9, 0x1

    .line 110
    :cond_5
    :goto_2
    return v9
.end method
