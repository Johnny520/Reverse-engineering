.class public final synthetic Lc9/r0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILandroid/app/Activity;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 19
    iput p1, p0, Lc9/r0;->g:I

    iput-object p3, p0, Lc9/r0;->i:Ljava/lang/Object;

    iput-object p2, p0, Lc9/r0;->h:Ljava/lang/Object;

    iput-object p4, p0, Lc9/r0;->j:Ljava/lang/Object;

    iput-object p5, p0, Lc9/r0;->k:Ljava/lang/Object;

    iput-object p6, p0, Lc9/r0;->l:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lgg/u;Landroid/widget/FrameLayout;Lc9/a1;Landroid/view/ViewGroup;Lfg/a;)V
    .locals 1

    .line 1
    const/16 v0, 0x1b

    .line 2
    .line 3
    iput v0, p0, Lc9/r0;->g:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lc9/r0;->l:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p2, p0, Lc9/r0;->j:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p3, p0, Lc9/r0;->i:Ljava/lang/Object;

    .line 13
    .line 14
    iput-object p4, p0, Lc9/r0;->k:Ljava/lang/Object;

    .line 15
    .line 16
    iput-object p5, p0, Lc9/r0;->h:Ljava/lang/Object;

    .line 17
    .line 18
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 20
    iput p6, p0, Lc9/r0;->g:I

    iput-object p1, p0, Lc9/r0;->i:Ljava/lang/Object;

    iput-object p2, p0, Lc9/r0;->j:Ljava/lang/Object;

    iput-object p3, p0, Lc9/r0;->k:Ljava/lang/Object;

    iput-object p4, p0, Lc9/r0;->h:Ljava/lang/Object;

    iput-object p5, p0, Lc9/r0;->l:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final e()Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, Lc9/r0;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/Context;

    .line 4
    .line 5
    iget-object v1, p0, Lc9/r0;->j:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Li0/a1;

    .line 8
    .line 9
    iget-object v2, p0, Lc9/r0;->k:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Le9/c;

    .line 12
    .line 13
    iget-object v3, p0, Lc9/r0;->h:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, Le9/s;

    .line 16
    .line 17
    iget-object v4, p0, Lc9/r0;->l:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v4, Li0/a1;

    .line 20
    .line 21
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    check-cast v5, Ljava/util/List;

    .line 26
    .line 27
    new-instance v6, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v7

    .line 40
    if-eqz v7, :cond_1

    .line 41
    .line 42
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    move-object v8, v7

    .line 47
    check-cast v8, Le9/c;

    .line 48
    .line 49
    iget-object v8, v8, Le9/c;->b:Ljava/lang/String;

    .line 50
    .line 51
    iget-object v9, v2, Le9/c;->b:Ljava/lang/String;

    .line 52
    .line 53
    invoke-static {v8, v9}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v8

    .line 57
    if-nez v8, :cond_0

    .line 58
    .line 59
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    invoke-static {v3, v1, v6}, Lwb/ho;->m0(Le9/s;Li0/a1;Ljava/util/List;)V

    .line 64
    .line 65
    .line 66
    const-string v1, "\u89c4\u5219\u5df2\u5220\u9664"

    .line 67
    .line 68
    const/4 v2, 0x0

    .line 69
    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 74
    .line 75
    .line 76
    sget-object v0, Lwb/m2;->c:Lwb/m2;

    .line 77
    .line 78
    invoke-interface {v4, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 82
    .line 83
    return-object v0
.end method

.method private final f()Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lc9/r0;->i:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Li0/a1;

    .line 6
    .line 7
    iget-object v2, v0, Lc9/r0;->j:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Lx8/r;

    .line 10
    .line 11
    iget-object v3, v0, Lc9/r0;->k:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v3, Li0/a1;

    .line 14
    .line 15
    iget-object v4, v0, Lc9/r0;->h:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v4, Li0/a1;

    .line 18
    .line 19
    iget-object v5, v0, Lc9/r0;->l:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v5, Li0/a1;

    .line 22
    .line 23
    new-instance v6, Lx8/b;

    .line 24
    .line 25
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 26
    .line 27
    .line 28
    move-result-wide v7

    .line 29
    invoke-static {v7, v8}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v7

    .line 33
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v8

    .line 37
    check-cast v8, Ljava/util/List;

    .line 38
    .line 39
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 40
    .line 41
    .line 42
    move-result v8

    .line 43
    add-int/lit8 v8, v8, 0x1

    .line 44
    .line 45
    const-string v9, "\u89c4\u5219 "

    .line 46
    .line 47
    invoke-static {v8, v9}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v8

    .line 51
    new-instance v9, Lx8/s;

    .line 52
    .line 53
    const/4 v10, 0x0

    .line 54
    const/16 v11, 0x1f

    .line 55
    .line 56
    invoke-direct {v9, v11, v10, v10}, Lx8/s;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-static {v9}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object v26

    .line 63
    const/4 v9, 0x1

    .line 64
    const-string v10, ""

    .line 65
    .line 66
    const/4 v12, 0x0

    .line 67
    const/4 v13, 0x0

    .line 68
    sget-object v14, Ltf/v;->g:Ltf/v;

    .line 69
    .line 70
    const/16 v18, 0x0

    .line 71
    .line 72
    const/16 v19, 0x0

    .line 73
    .line 74
    const/16 v22, 0x0

    .line 75
    .line 76
    const-wide/16 v23, 0x0

    .line 77
    .line 78
    const/16 v25, 0x0

    .line 79
    .line 80
    move-object v11, v10

    .line 81
    move-object v15, v14

    .line 82
    move-object/from16 v16, v14

    .line 83
    .line 84
    move-object/from16 v17, v14

    .line 85
    .line 86
    move-object/from16 v20, v10

    .line 87
    .line 88
    move-object/from16 v21, v10

    .line 89
    .line 90
    invoke-direct/range {v6 .. v26}, Lx8/b;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;IILjava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;IILjava/lang/String;Ljava/lang/String;IJZLjava/util/List;)V

    .line 91
    .line 92
    .line 93
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v8

    .line 97
    check-cast v8, Ljava/util/List;

    .line 98
    .line 99
    invoke-static {v8, v6}, Ltf/m;->G1(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 100
    .line 101
    .line 102
    move-result-object v8

    .line 103
    invoke-static {v2, v1, v8}, Lwb/ho;->B(Lx8/r;Li0/a1;Ljava/util/ArrayList;)V

    .line 104
    .line 105
    .line 106
    invoke-interface {v3, v7}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    invoke-interface {v4, v6}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    const-string v1, "ruleEditor"

    .line 113
    .line 114
    invoke-interface {v5, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 118
    .line 119
    return-object v1
.end method

.method private final g()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, Lc9/r0;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lqg/t;

    .line 4
    .line 5
    iget-object v1, p0, Lc9/r0;->j:Ljava/lang/Object;

    .line 6
    .line 7
    move-object v6, v1

    .line 8
    check-cast v6, Li0/a1;

    .line 9
    .line 10
    iget-object v1, p0, Lc9/r0;->k:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v3, v1

    .line 13
    check-cast v3, Landroid/content/Context;

    .line 14
    .line 15
    iget-object v1, p0, Lc9/r0;->h:Ljava/lang/Object;

    .line 16
    .line 17
    move-object v4, v1

    .line 18
    check-cast v4, Lfb/q1;

    .line 19
    .line 20
    iget-object v1, p0, Lc9/r0;->l:Ljava/lang/Object;

    .line 21
    .line 22
    move-object v5, v1

    .line 23
    check-cast v5, Li0/a1;

    .line 24
    .line 25
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 26
    .line 27
    invoke-interface {v6, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    new-instance v2, Lf0/b;

    .line 31
    .line 32
    const/4 v7, 0x0

    .line 33
    const/16 v8, 0xa

    .line 34
    .line 35
    invoke-direct/range {v2 .. v8}, Lf0/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 36
    .line 37
    .line 38
    const/4 v1, 0x3

    .line 39
    const/4 v3, 0x0

    .line 40
    invoke-static {v0, v3, v2, v1}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 41
    .line 42
    .line 43
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 44
    .line 45
    return-object v0
.end method

.method private final h()Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lc9/r0;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lqg/t;

    .line 4
    .line 5
    iget-object v1, p0, Lc9/r0;->j:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Li0/a1;

    .line 8
    .line 9
    iget-object v2, p0, Lc9/r0;->k:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Li0/a1;

    .line 12
    .line 13
    iget-object v3, p0, Lc9/r0;->h:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, Lr/z;

    .line 16
    .line 17
    iget-object v4, p0, Lc9/r0;->l:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v4, Ljava/util/List;

    .line 20
    .line 21
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-interface {v1, v5}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    invoke-static {v2, v1}, Lwb/y2;->Q(Li0/a1;Z)V

    .line 28
    .line 29
    .line 30
    new-instance v1, Lci/j;

    .line 31
    .line 32
    const/16 v2, 0x16

    .line 33
    .line 34
    const/4 v5, 0x0

    .line 35
    invoke-direct {v1, v3, v4, v5, v2}, Lci/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 36
    .line 37
    .line 38
    const/4 v2, 0x3

    .line 39
    invoke-static {v0, v5, v1, v2}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 40
    .line 41
    .line 42
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 43
    .line 44
    return-object v0
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lc9/r0;->g:I

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    const/4 v3, 0x3

    .line 7
    const/4 v4, 0x1

    .line 8
    const/4 v5, 0x0

    .line 9
    const/4 v6, 0x0

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object v0, v1, Lc9/r0;->l:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lgg/u;

    .line 16
    .line 17
    iget-object v2, v1, Lc9/r0;->j:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, Landroid/widget/FrameLayout;

    .line 20
    .line 21
    iget-object v3, v1, Lc9/r0;->i:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v3, Lc9/a1;

    .line 24
    .line 25
    iget-object v4, v1, Lc9/r0;->k:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v4, Landroid/view/ViewGroup;

    .line 28
    .line 29
    iget-object v6, v1, Lc9/r0;->h:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v6, Lfg/a;

    .line 32
    .line 33
    :try_start_0
    iget-object v0, v0, Lgg/u;->g:Ljava/lang/Object;

    .line 34
    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    check-cast v0, Ly1/c1;

    .line 38
    .line 39
    invoke-virtual {v0}, Ly1/a;->f()V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const-string v0, "compose"

    .line 44
    .line 45
    invoke-static {v0}, Lgg/l;->g(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    :catchall_0
    :goto_0
    :try_start_1
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    instance-of v7, v0, Landroid/view/ViewGroup;

    .line 54
    .line 55
    if-eqz v7, :cond_1

    .line 56
    .line 57
    move-object v5, v0

    .line 58
    check-cast v5, Landroid/view/ViewGroup;

    .line 59
    .line 60
    :cond_1
    if-eqz v5, :cond_2

    .line 61
    .line 62
    invoke-virtual {v5, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 63
    .line 64
    .line 65
    :catchall_1
    :cond_2
    :try_start_2
    invoke-static {v2}, Lx6/d;->p(Landroid/view/View;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 66
    .line 67
    .line 68
    :catchall_2
    :try_start_3
    invoke-static {v4}, Lx6/d;->p(Landroid/view/View;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 69
    .line 70
    .line 71
    :catchall_3
    :try_start_4
    iget-object v0, v3, Lc9/a1;->h:Landroidx/lifecycle/s;

    .line 72
    .line 73
    iget-object v2, v0, Landroidx/lifecycle/s;->c:Landroidx/lifecycle/l;

    .line 74
    .line 75
    sget-object v4, Landroidx/lifecycle/l;->g:Landroidx/lifecycle/l;

    .line 76
    .line 77
    if-eq v2, v4, :cond_3

    .line 78
    .line 79
    const-string v2, "setCurrentState"

    .line 80
    .line 81
    invoke-virtual {v0, v2}, Landroidx/lifecycle/s;->c(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v4}, Landroidx/lifecycle/s;->e(Landroidx/lifecycle/l;)V

    .line 85
    .line 86
    .line 87
    :cond_3
    iget-object v0, v3, Lc9/a1;->k:Lr3/a;

    .line 88
    .line 89
    invoke-virtual {v0}, Lr3/a;->a()V

    .line 90
    .line 91
    .line 92
    iget-object v0, v3, Lc9/a1;->j:Landroidx/lifecycle/e0;

    .line 93
    .line 94
    invoke-virtual {v0}, Landroidx/lifecycle/e0;->a()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 95
    .line 96
    .line 97
    :catchall_4
    :try_start_5
    invoke-interface {v6}, Lfg/a;->invoke()Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 98
    .line 99
    .line 100
    :catchall_5
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 101
    .line 102
    return-object v0

    .line 103
    :pswitch_0
    invoke-direct {v1}, Lc9/r0;->h()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    return-object v0

    .line 108
    :pswitch_1
    invoke-direct {v1}, Lc9/r0;->g()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    return-object v0

    .line 113
    :pswitch_2
    invoke-direct {v1}, Lc9/r0;->f()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    return-object v0

    .line 118
    :pswitch_3
    invoke-direct {v1}, Lc9/r0;->e()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    return-object v0

    .line 123
    :pswitch_4
    iget-object v0, v1, Lc9/r0;->i:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v0, Landroid/content/Context;

    .line 126
    .line 127
    iget-object v2, v1, Lc9/r0;->j:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v2, Li0/a1;

    .line 130
    .line 131
    iget-object v3, v1, Lc9/r0;->k:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v3, Lx9/f;

    .line 134
    .line 135
    iget-object v4, v1, Lc9/r0;->h:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v4, Lx9/e;

    .line 138
    .line 139
    iget-object v5, v1, Lc9/r0;->l:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v5, Li0/a1;

    .line 142
    .line 143
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v7

    .line 147
    check-cast v7, Ljava/util/List;

    .line 148
    .line 149
    new-instance v8, Ljava/util/ArrayList;

    .line 150
    .line 151
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 152
    .line 153
    .line 154
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 155
    .line 156
    .line 157
    move-result-object v7

    .line 158
    :cond_4
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 159
    .line 160
    .line 161
    move-result v9

    .line 162
    if-eqz v9, :cond_5

    .line 163
    .line 164
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v9

    .line 168
    move-object v10, v9

    .line 169
    check-cast v10, Lx9/f;

    .line 170
    .line 171
    iget-object v10, v10, Lx9/f;->a:Ljava/lang/String;

    .line 172
    .line 173
    iget-object v11, v3, Lx9/f;->a:Ljava/lang/String;

    .line 174
    .line 175
    invoke-static {v10, v11}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v10

    .line 179
    if-nez v10, :cond_4

    .line 180
    .line 181
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    goto :goto_1

    .line 185
    :cond_5
    invoke-static {v4, v2, v8}, Lwb/ho;->K1(Lx9/e;Li0/a1;Ljava/util/List;)V

    .line 186
    .line 187
    .line 188
    const-string v2, "\u5173\u952e\u8bcd\u5df2\u5220\u9664"

    .line 189
    .line 190
    invoke-static {v0, v2, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 195
    .line 196
    .line 197
    sget-object v0, Lwb/p4;->a:Lwb/p4;

    .line 198
    .line 199
    invoke-interface {v5, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    :goto_2
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 203
    .line 204
    return-object v0

    .line 205
    :pswitch_5
    iget-object v0, v1, Lc9/r0;->i:Ljava/lang/Object;

    .line 206
    .line 207
    check-cast v0, Lwb/d6;

    .line 208
    .line 209
    iget-object v2, v1, Lc9/r0;->j:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast v2, Landroid/content/SharedPreferences;

    .line 212
    .line 213
    iget-object v3, v1, Lc9/r0;->k:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast v3, Li0/a1;

    .line 216
    .line 217
    iget-object v4, v1, Lc9/r0;->h:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast v4, Li0/a1;

    .line 220
    .line 221
    iget-object v6, v1, Lc9/r0;->l:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast v6, Li0/a1;

    .line 224
    .line 225
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v7

    .line 229
    check-cast v7, Ljava/util/List;

    .line 230
    .line 231
    invoke-interface {v7}, Ljava/util/Collection;->size()I

    .line 232
    .line 233
    .line 234
    move-result v7

    .line 235
    iget v0, v0, Lwb/d6;->a:I

    .line 236
    .line 237
    if-ltz v0, :cond_7

    .line 238
    .line 239
    if-ge v0, v7, :cond_7

    .line 240
    .line 241
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v7

    .line 245
    check-cast v7, Ljava/util/List;

    .line 246
    .line 247
    invoke-interface {v7, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v7

    .line 251
    check-cast v7, Laa/h;

    .line 252
    .line 253
    iget-object v7, v7, Laa/h;->a:Ljava/lang/String;

    .line 254
    .line 255
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v8

    .line 259
    check-cast v8, Ljava/util/List;

    .line 260
    .line 261
    invoke-static {v8}, Ltf/m;->R1(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 262
    .line 263
    .line 264
    move-result-object v8

    .line 265
    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    check-cast v0, Ljava/util/List;

    .line 273
    .line 274
    new-instance v9, Ljava/util/ArrayList;

    .line 275
    .line 276
    invoke-static {v0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 277
    .line 278
    .line 279
    move-result v10

    .line 280
    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 281
    .line 282
    .line 283
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 288
    .line 289
    .line 290
    move-result v10

    .line 291
    if-eqz v10, :cond_6

    .line 292
    .line 293
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v10

    .line 297
    move-object v11, v10

    .line 298
    check-cast v11, Laa/a;

    .line 299
    .line 300
    iget-object v10, v11, Laa/a;->g:Ljava/util/Set;

    .line 301
    .line 302
    invoke-static {v10, v7}, Ltf/d0;->S(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 303
    .line 304
    .line 305
    move-result-object v17

    .line 306
    const/16 v21, 0x0

    .line 307
    .line 308
    const/16 v22, 0x7bf

    .line 309
    .line 310
    const/4 v12, 0x0

    .line 311
    const/4 v13, 0x0

    .line 312
    const/4 v14, 0x0

    .line 313
    const/4 v15, 0x0

    .line 314
    const/16 v16, 0x0

    .line 315
    .line 316
    const/16 v18, 0x0

    .line 317
    .line 318
    const/16 v19, 0x0

    .line 319
    .line 320
    const/16 v20, 0x0

    .line 321
    .line 322
    invoke-static/range {v11 .. v22}, Laa/a;->a(Laa/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/Set;ZZLjava/util/Set;Ljava/lang/String;I)Laa/a;

    .line 323
    .line 324
    .line 325
    move-result-object v10

    .line 326
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    goto :goto_3

    .line 330
    :cond_6
    invoke-interface {v3, v8}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 331
    .line 332
    .line 333
    invoke-interface {v4, v9}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 334
    .line 335
    .line 336
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    const-string v2, "message_block_templates"

    .line 341
    .line 342
    invoke-static {v8}, La2/a;->g(Ljava/util/List;)Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object v3

    .line 346
    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    const-string v2, "message_block_bindings"

    .line 351
    .line 352
    invoke-static {v9}, La2/a;->e(Ljava/util/List;)Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v3

    .line 356
    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 361
    .line 362
    .line 363
    :cond_7
    invoke-interface {v6, v5}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 364
    .line 365
    .line 366
    goto/16 :goto_2

    .line 367
    .line 368
    :pswitch_6
    iget-object v0, v1, Lc9/r0;->i:Ljava/lang/Object;

    .line 369
    .line 370
    check-cast v0, Landroid/content/Context;

    .line 371
    .line 372
    iget-object v2, v1, Lc9/r0;->j:Ljava/lang/Object;

    .line 373
    .line 374
    check-cast v2, Lqg/t;

    .line 375
    .line 376
    iget-object v4, v1, Lc9/r0;->k:Ljava/lang/Object;

    .line 377
    .line 378
    move-object v8, v4

    .line 379
    check-cast v8, Li0/a1;

    .line 380
    .line 381
    iget-object v4, v1, Lc9/r0;->h:Ljava/lang/Object;

    .line 382
    .line 383
    move-object v9, v4

    .line 384
    check-cast v9, Li0/a1;

    .line 385
    .line 386
    iget-object v4, v1, Lc9/r0;->l:Ljava/lang/Object;

    .line 387
    .line 388
    move-object v10, v4

    .line 389
    check-cast v10, Li0/a1;

    .line 390
    .line 391
    invoke-interface {v8}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object v4

    .line 395
    check-cast v4, Ljava/lang/String;

    .line 396
    .line 397
    invoke-static {v4}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 398
    .line 399
    .line 400
    move-result-object v4

    .line 401
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object v4

    .line 405
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 406
    .line 407
    .line 408
    move-result v4

    .line 409
    if-nez v4, :cond_9

    .line 410
    .line 411
    invoke-interface {v9}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    move-result-object v4

    .line 415
    check-cast v4, Ljava/lang/String;

    .line 416
    .line 417
    invoke-static {v4}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 418
    .line 419
    .line 420
    move-result-object v4

    .line 421
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v4

    .line 425
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 426
    .line 427
    .line 428
    move-result v4

    .line 429
    if-eqz v4, :cond_8

    .line 430
    .line 431
    goto :goto_4

    .line 432
    :cond_8
    new-instance v0, Lx8/y;

    .line 433
    .line 434
    const-string v4, "\u67e5\u8be2\u4e2d"

    .line 435
    .line 436
    const-string v5, "\u6b63\u5728\u67e5\u8be2\u5c0f\u667a\u63a7\u5236\u53f0..."

    .line 437
    .line 438
    invoke-direct {v0, v4, v5, v6}, Lx8/y;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 439
    .line 440
    .line 441
    invoke-interface {v10, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 442
    .line 443
    .line 444
    new-instance v7, Lc0/m;

    .line 445
    .line 446
    const/16 v12, 0x12

    .line 447
    .line 448
    const/4 v11, 0x0

    .line 449
    invoke-direct/range {v7 .. v12}, Lc0/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 450
    .line 451
    .line 452
    invoke-static {v2, v11, v7, v3}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 453
    .line 454
    .line 455
    goto :goto_5

    .line 456
    :cond_9
    :goto_4
    const-string v2, "\u8bf7\u5148\u767b\u5f55\u5e76\u9009\u62e9\u667a\u80fd\u4f53"

    .line 457
    .line 458
    invoke-static {v0, v2, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 459
    .line 460
    .line 461
    move-result-object v0

    .line 462
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 463
    .line 464
    .line 465
    :goto_5
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 466
    .line 467
    return-object v0

    .line 468
    :pswitch_7
    iget-object v0, v1, Lc9/r0;->i:Ljava/lang/Object;

    .line 469
    .line 470
    check-cast v0, Lx8/r;

    .line 471
    .line 472
    iget-object v2, v1, Lc9/r0;->j:Ljava/lang/Object;

    .line 473
    .line 474
    check-cast v2, Landroid/content/Context;

    .line 475
    .line 476
    iget-object v3, v1, Lc9/r0;->k:Ljava/lang/Object;

    .line 477
    .line 478
    check-cast v3, Li0/a1;

    .line 479
    .line 480
    iget-object v4, v1, Lc9/r0;->h:Ljava/lang/Object;

    .line 481
    .line 482
    check-cast v4, Li0/a1;

    .line 483
    .line 484
    iget-object v5, v1, Lc9/r0;->l:Ljava/lang/Object;

    .line 485
    .line 486
    check-cast v5, Li0/a1;

    .line 487
    .line 488
    const-string v7, "\u65b0\u914d\u7f6e"

    .line 489
    .line 490
    invoke-static {v3, v7}, Lwb/ho;->u(Li0/a1;Ljava/lang/String;)Ljava/lang/String;

    .line 491
    .line 492
    .line 493
    move-result-object v9

    .line 494
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 495
    .line 496
    .line 497
    move-result-object v7

    .line 498
    check-cast v7, Ljava/util/List;

    .line 499
    .line 500
    new-instance v8, Lx8/u;

    .line 501
    .line 502
    const-string v10, ""

    .line 503
    .line 504
    const-string v11, "https://api.siliconflow.cn/v1"

    .line 505
    .line 506
    const-string v12, "/chat/completions"

    .line 507
    .line 508
    const-string v13, "deepseek-ai/DeepSeek-V3"

    .line 509
    .line 510
    const-string v14, ""

    .line 511
    .line 512
    const/16 v15, 0xa

    .line 513
    .line 514
    invoke-direct/range {v8 .. v15}, Lx8/u;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 515
    .line 516
    .line 517
    invoke-static {v7, v8}, Ltf/m;->G1(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 518
    .line 519
    .line 520
    move-result-object v7

    .line 521
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    move-result-object v4

    .line 525
    check-cast v4, Ljava/lang/String;

    .line 526
    .line 527
    invoke-virtual {v0, v4, v7}, Lx8/r;->n(Ljava/lang/String;Ljava/util/List;)V

    .line 528
    .line 529
    .line 530
    invoke-virtual {v0}, Lx8/r;->p()Ljava/util/List;

    .line 531
    .line 532
    .line 533
    move-result-object v0

    .line 534
    invoke-interface {v3, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 535
    .line 536
    .line 537
    invoke-interface {v5, v9}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 538
    .line 539
    .line 540
    const-string v0, "\u5df2\u65b0\u589e "

    .line 541
    .line 542
    invoke-virtual {v0, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 543
    .line 544
    .line 545
    move-result-object v0

    .line 546
    invoke-static {v2, v0, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 547
    .line 548
    .line 549
    move-result-object v0

    .line 550
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 551
    .line 552
    .line 553
    goto/16 :goto_2

    .line 554
    .line 555
    :pswitch_8
    iget-object v0, v1, Lc9/r0;->i:Ljava/lang/Object;

    .line 556
    .line 557
    check-cast v0, Ljava/lang/String;

    .line 558
    .line 559
    iget-object v2, v1, Lc9/r0;->j:Ljava/lang/Object;

    .line 560
    .line 561
    check-cast v2, Ljava/lang/String;

    .line 562
    .line 563
    iget-object v3, v1, Lc9/r0;->k:Ljava/lang/Object;

    .line 564
    .line 565
    check-cast v3, Landroid/content/Context;

    .line 566
    .line 567
    iget-object v4, v1, Lc9/r0;->h:Ljava/lang/Object;

    .line 568
    .line 569
    check-cast v4, Li0/a1;

    .line 570
    .line 571
    iget-object v5, v1, Lc9/r0;->l:Ljava/lang/Object;

    .line 572
    .line 573
    check-cast v5, Li0/a1;

    .line 574
    .line 575
    invoke-interface {v4, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 576
    .line 577
    .line 578
    invoke-interface {v5, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 579
    .line 580
    .line 581
    const-string v0, "\u5df2\u6062\u590d\u4e3a\u5168\u5c40\u6587\u672c"

    .line 582
    .line 583
    invoke-static {v3, v0, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 584
    .line 585
    .line 586
    move-result-object v0

    .line 587
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 588
    .line 589
    .line 590
    goto/16 :goto_2

    .line 591
    .line 592
    :pswitch_9
    iget-object v0, v1, Lc9/r0;->i:Ljava/lang/Object;

    .line 593
    .line 594
    check-cast v0, Landroid/content/Context;

    .line 595
    .line 596
    iget-object v2, v1, Lc9/r0;->j:Ljava/lang/Object;

    .line 597
    .line 598
    check-cast v2, Li0/a1;

    .line 599
    .line 600
    iget-object v3, v1, Lc9/r0;->k:Ljava/lang/Object;

    .line 601
    .line 602
    check-cast v3, Li0/a1;

    .line 603
    .line 604
    iget-object v4, v1, Lc9/r0;->h:Ljava/lang/Object;

    .line 605
    .line 606
    check-cast v4, Li0/a1;

    .line 607
    .line 608
    iget-object v5, v1, Lc9/r0;->l:Ljava/lang/Object;

    .line 609
    .line 610
    check-cast v5, Li0/a1;

    .line 611
    .line 612
    sget-object v7, Lwb/ho;->w:Ljava/util/List;

    .line 613
    .line 614
    sget-object v8, Ljg/d;->g:Ljg/a;

    .line 615
    .line 616
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 617
    .line 618
    .line 619
    move-result v8

    .line 620
    sget-object v9, Ljg/d;->g:Ljg/a;

    .line 621
    .line 622
    invoke-virtual {v9, v8}, Ljg/a;->g(I)I

    .line 623
    .line 624
    .line 625
    move-result v8

    .line 626
    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 627
    .line 628
    .line 629
    move-result-object v7

    .line 630
    check-cast v7, Ljava/lang/String;

    .line 631
    .line 632
    invoke-interface {v2, v7}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 633
    .line 634
    .line 635
    sget-object v2, Lwb/ho;->x:Ljava/util/List;

    .line 636
    .line 637
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 638
    .line 639
    .line 640
    move-result v7

    .line 641
    invoke-virtual {v9, v7}, Ljg/a;->g(I)I

    .line 642
    .line 643
    .line 644
    move-result v7

    .line 645
    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 646
    .line 647
    .line 648
    move-result-object v2

    .line 649
    check-cast v2, Ljava/lang/String;

    .line 650
    .line 651
    invoke-interface {v3, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 652
    .line 653
    .line 654
    sget-object v2, Lwb/ho;->y:Ljava/util/List;

    .line 655
    .line 656
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 657
    .line 658
    .line 659
    move-result v3

    .line 660
    invoke-virtual {v9, v3}, Ljg/a;->g(I)I

    .line 661
    .line 662
    .line 663
    move-result v3

    .line 664
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 665
    .line 666
    .line 667
    move-result-object v2

    .line 668
    check-cast v2, Ljava/lang/String;

    .line 669
    .line 670
    invoke-interface {v4, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 671
    .line 672
    .line 673
    sget-object v2, Lwb/ho;->z:Ljava/util/List;

    .line 674
    .line 675
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 676
    .line 677
    .line 678
    move-result v3

    .line 679
    invoke-virtual {v9, v3}, Ljg/a;->g(I)I

    .line 680
    .line 681
    .line 682
    move-result v3

    .line 683
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 684
    .line 685
    .line 686
    move-result-object v2

    .line 687
    check-cast v2, Ljava/lang/String;

    .line 688
    .line 689
    invoke-interface {v5, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 690
    .line 691
    .line 692
    const-string v2, "\u5df2\u968f\u673a\u586b\u5145\u672c\u7fa4\u5361\u7247"

    .line 693
    .line 694
    invoke-static {v0, v2, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 695
    .line 696
    .line 697
    move-result-object v0

    .line 698
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 699
    .line 700
    .line 701
    goto/16 :goto_2

    .line 702
    .line 703
    :pswitch_a
    iget-object v0, v1, Lc9/r0;->i:Ljava/lang/Object;

    .line 704
    .line 705
    check-cast v0, Lwb/l4;

    .line 706
    .line 707
    iget-object v2, v1, Lc9/r0;->j:Ljava/lang/Object;

    .line 708
    .line 709
    check-cast v2, Landroid/content/SharedPreferences;

    .line 710
    .line 711
    iget-object v3, v1, Lc9/r0;->k:Ljava/lang/Object;

    .line 712
    .line 713
    check-cast v3, Li0/a1;

    .line 714
    .line 715
    iget-object v4, v1, Lc9/r0;->h:Ljava/lang/Object;

    .line 716
    .line 717
    check-cast v4, Li0/a1;

    .line 718
    .line 719
    iget-object v5, v1, Lc9/r0;->l:Ljava/lang/Object;

    .line 720
    .line 721
    check-cast v5, Li0/a1;

    .line 722
    .line 723
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 724
    .line 725
    .line 726
    move-result-object v6

    .line 727
    check-cast v6, Ljava/util/List;

    .line 728
    .line 729
    invoke-interface {v6}, Ljava/util/Collection;->size()I

    .line 730
    .line 731
    .line 732
    move-result v6

    .line 733
    check-cast v0, Lwb/k4;

    .line 734
    .line 735
    iget v0, v0, Lwb/k4;->a:I

    .line 736
    .line 737
    if-ltz v0, :cond_c

    .line 738
    .line 739
    if-ge v0, v6, :cond_c

    .line 740
    .line 741
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 742
    .line 743
    .line 744
    move-result-object v6

    .line 745
    check-cast v6, Ljava/util/List;

    .line 746
    .line 747
    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 748
    .line 749
    .line 750
    move-result-object v6

    .line 751
    check-cast v6, Lq9/g;

    .line 752
    .line 753
    iget-object v6, v6, Lq9/g;->a:Ljava/lang/String;

    .line 754
    .line 755
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 756
    .line 757
    .line 758
    move-result-object v7

    .line 759
    check-cast v7, Ljava/util/List;

    .line 760
    .line 761
    invoke-static {v7}, Ltf/m;->R1(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 762
    .line 763
    .line 764
    move-result-object v7

    .line 765
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 766
    .line 767
    .line 768
    invoke-interface {v3, v7}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 769
    .line 770
    .line 771
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 772
    .line 773
    .line 774
    move-result-object v0

    .line 775
    check-cast v0, Ljava/util/List;

    .line 776
    .line 777
    new-instance v7, Ljava/util/ArrayList;

    .line 778
    .line 779
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 780
    .line 781
    .line 782
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 783
    .line 784
    .line 785
    move-result-object v0

    .line 786
    :cond_a
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 787
    .line 788
    .line 789
    move-result v8

    .line 790
    if-eqz v8, :cond_b

    .line 791
    .line 792
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 793
    .line 794
    .line 795
    move-result-object v8

    .line 796
    move-object v9, v8

    .line 797
    check-cast v9, Lq9/h;

    .line 798
    .line 799
    iget-object v9, v9, Lq9/h;->c:Ljava/lang/String;

    .line 800
    .line 801
    invoke-static {v9, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 802
    .line 803
    .line 804
    move-result v9

    .line 805
    if-nez v9, :cond_a

    .line 806
    .line 807
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 808
    .line 809
    .line 810
    goto :goto_6

    .line 811
    :cond_b
    invoke-interface {v4, v7}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 812
    .line 813
    .line 814
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 815
    .line 816
    .line 817
    move-result-object v0

    .line 818
    const-string v2, "group_rename_templates"

    .line 819
    .line 820
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 821
    .line 822
    .line 823
    move-result-object v3

    .line 824
    check-cast v3, Ljava/util/List;

    .line 825
    .line 826
    invoke-static {v3}, Lx6/d;->v(Ljava/util/List;)Ljava/lang/String;

    .line 827
    .line 828
    .line 829
    move-result-object v3

    .line 830
    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 831
    .line 832
    .line 833
    move-result-object v0

    .line 834
    const-string v2, "group_rename_template_bindings"

    .line 835
    .line 836
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 837
    .line 838
    .line 839
    move-result-object v3

    .line 840
    check-cast v3, Ljava/util/List;

    .line 841
    .line 842
    invoke-static {v3}, Lx6/d;->t(Ljava/util/List;)Ljava/lang/String;

    .line 843
    .line 844
    .line 845
    move-result-object v3

    .line 846
    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 847
    .line 848
    .line 849
    move-result-object v0

    .line 850
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 851
    .line 852
    .line 853
    :cond_c
    sget-object v0, Lwb/h4;->d:Lwb/h4;

    .line 854
    .line 855
    invoke-interface {v5, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 856
    .line 857
    .line 858
    goto/16 :goto_2

    .line 859
    .line 860
    :pswitch_b
    iget-object v0, v1, Lc9/r0;->i:Ljava/lang/Object;

    .line 861
    .line 862
    move-object v2, v0

    .line 863
    check-cast v2, Ljava/lang/String;

    .line 864
    .line 865
    iget-object v0, v1, Lc9/r0;->j:Ljava/lang/Object;

    .line 866
    .line 867
    move-object v3, v0

    .line 868
    check-cast v3, Lx8/r;

    .line 869
    .line 870
    iget-object v0, v1, Lc9/r0;->k:Ljava/lang/Object;

    .line 871
    .line 872
    move-object v4, v0

    .line 873
    check-cast v4, Landroid/content/Context;

    .line 874
    .line 875
    iget-object v0, v1, Lc9/r0;->h:Ljava/lang/Object;

    .line 876
    .line 877
    check-cast v0, Li0/a1;

    .line 878
    .line 879
    iget-object v5, v1, Lc9/r0;->l:Ljava/lang/Object;

    .line 880
    .line 881
    check-cast v5, Li0/a1;

    .line 882
    .line 883
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 884
    .line 885
    .line 886
    move-result-object v7

    .line 887
    check-cast v7, Ljava/util/Set;

    .line 888
    .line 889
    invoke-interface {v7, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 890
    .line 891
    .line 892
    move-result v7

    .line 893
    if-eqz v7, :cond_d

    .line 894
    .line 895
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 896
    .line 897
    .line 898
    move-result-object v7

    .line 899
    check-cast v7, Ljava/util/Set;

    .line 900
    .line 901
    invoke-static {v7, v2}, Ltf/d0;->S(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 902
    .line 903
    .line 904
    move-result-object v7

    .line 905
    goto :goto_7

    .line 906
    :cond_d
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 907
    .line 908
    .line 909
    move-result-object v7

    .line 910
    check-cast v7, Ljava/util/Set;

    .line 911
    .line 912
    invoke-static {v7, v2}, Ltf/d0;->V(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 913
    .line 914
    .line 915
    move-result-object v7

    .line 916
    :goto_7
    invoke-interface {v0, v7}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 917
    .line 918
    .line 919
    invoke-interface {v5}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 920
    .line 921
    .line 922
    move-result-object v0

    .line 923
    check-cast v0, Ljava/lang/String;

    .line 924
    .line 925
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 926
    .line 927
    .line 928
    const-string v5, "zhilia_model_favorites_v1"

    .line 929
    .line 930
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 931
    .line 932
    .line 933
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 934
    .line 935
    .line 936
    move-result-object v0

    .line 937
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 938
    .line 939
    .line 940
    move-result-object v0

    .line 941
    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 942
    .line 943
    invoke-virtual {v0, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 944
    .line 945
    .line 946
    move-result-object v8

    .line 947
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 948
    .line 949
    .line 950
    :try_start_6
    new-instance v0, Lorg/json/JSONObject;

    .line 951
    .line 952
    const-string v9, ""

    .line 953
    .line 954
    invoke-virtual {v3, v5, v9}, Lx8/r;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 955
    .line 956
    .line 957
    move-result-object v9

    .line 958
    invoke-direct {v0, v9}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 959
    .line 960
    .line 961
    goto :goto_8

    .line 962
    :catchall_6
    move-exception v0

    .line 963
    new-instance v9, Lsf/f;

    .line 964
    .line 965
    invoke-direct {v9, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 966
    .line 967
    .line 968
    move-object v0, v9

    .line 969
    :goto_8
    new-instance v9, Lorg/json/JSONObject;

    .line 970
    .line 971
    invoke-direct {v9}, Lorg/json/JSONObject;-><init>()V

    .line 972
    .line 973
    .line 974
    instance-of v10, v0, Lsf/f;

    .line 975
    .line 976
    if-eqz v10, :cond_e

    .line 977
    .line 978
    move-object v0, v9

    .line 979
    :cond_e
    check-cast v0, Lorg/json/JSONObject;

    .line 980
    .line 981
    new-instance v9, Lorg/json/JSONArray;

    .line 982
    .line 983
    invoke-direct {v9}, Lorg/json/JSONArray;-><init>()V

    .line 984
    .line 985
    .line 986
    new-instance v10, Ljava/util/ArrayList;

    .line 987
    .line 988
    invoke-static {v7}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 989
    .line 990
    .line 991
    move-result v11

    .line 992
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 993
    .line 994
    .line 995
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 996
    .line 997
    .line 998
    move-result-object v11

    .line 999
    :goto_9
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 1000
    .line 1001
    .line 1002
    move-result v12

    .line 1003
    if-eqz v12, :cond_f

    .line 1004
    .line 1005
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v12

    .line 1009
    check-cast v12, Ljava/lang/String;

    .line 1010
    .line 1011
    invoke-static {v12, v10}, Lj8/b;->r(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 1012
    .line 1013
    .line 1014
    goto :goto_9

    .line 1015
    :cond_f
    new-instance v11, Ljava/util/ArrayList;

    .line 1016
    .line 1017
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 1018
    .line 1019
    .line 1020
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v10

    .line 1024
    :cond_10
    :goto_a
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 1025
    .line 1026
    .line 1027
    move-result v12

    .line 1028
    if-eqz v12, :cond_11

    .line 1029
    .line 1030
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v12

    .line 1034
    move-object v13, v12

    .line 1035
    check-cast v13, Ljava/lang/String;

    .line 1036
    .line 1037
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 1038
    .line 1039
    .line 1040
    move-result v13

    .line 1041
    if-lez v13, :cond_10

    .line 1042
    .line 1043
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1044
    .line 1045
    .line 1046
    goto :goto_a

    .line 1047
    :cond_11
    invoke-static {v11}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 1048
    .line 1049
    .line 1050
    move-result-object v10

    .line 1051
    invoke-static {v10}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v10

    .line 1055
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v10

    .line 1059
    :goto_b
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 1060
    .line 1061
    .line 1062
    move-result v11

    .line 1063
    if-eqz v11, :cond_12

    .line 1064
    .line 1065
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1066
    .line 1067
    .line 1068
    move-result-object v11

    .line 1069
    check-cast v11, Ljava/lang/String;

    .line 1070
    .line 1071
    invoke-virtual {v9, v11}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 1072
    .line 1073
    .line 1074
    goto :goto_b

    .line 1075
    :cond_12
    invoke-virtual {v0, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1076
    .line 1077
    .line 1078
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v0

    .line 1082
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1083
    .line 1084
    .line 1085
    invoke-virtual {v3, v5, v0}, Lx8/r;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 1086
    .line 1087
    .line 1088
    invoke-interface {v7, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1089
    .line 1090
    .line 1091
    move-result v0

    .line 1092
    if-eqz v0, :cond_13

    .line 1093
    .line 1094
    const-string v0, "\u5df2\u6536\u85cf\u6a21\u578b"

    .line 1095
    .line 1096
    goto :goto_c

    .line 1097
    :cond_13
    const-string v0, "\u5df2\u53d6\u6d88\u6536\u85cf"

    .line 1098
    .line 1099
    :goto_c
    invoke-static {v4, v0, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1100
    .line 1101
    .line 1102
    move-result-object v0

    .line 1103
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1104
    .line 1105
    .line 1106
    goto/16 :goto_2

    .line 1107
    .line 1108
    :pswitch_c
    iget-object v0, v1, Lc9/r0;->i:Ljava/lang/Object;

    .line 1109
    .line 1110
    move-object v8, v0

    .line 1111
    check-cast v8, Li0/a1;

    .line 1112
    .line 1113
    iget-object v0, v1, Lc9/r0;->j:Ljava/lang/Object;

    .line 1114
    .line 1115
    move-object v9, v0

    .line 1116
    check-cast v9, Li0/a1;

    .line 1117
    .line 1118
    iget-object v0, v1, Lc9/r0;->k:Ljava/lang/Object;

    .line 1119
    .line 1120
    move-object v10, v0

    .line 1121
    check-cast v10, Landroid/content/SharedPreferences;

    .line 1122
    .line 1123
    iget-object v0, v1, Lc9/r0;->h:Ljava/lang/Object;

    .line 1124
    .line 1125
    move-object v11, v0

    .line 1126
    check-cast v11, Li0/a1;

    .line 1127
    .line 1128
    iget-object v0, v1, Lc9/r0;->l:Ljava/lang/Object;

    .line 1129
    .line 1130
    move-object v12, v0

    .line 1131
    check-cast v12, Li0/a1;

    .line 1132
    .line 1133
    new-instance v0, Lwb/bp;

    .line 1134
    .line 1135
    const-string v3, "\u65e7\u7248\u5168\u5c40\u8bbe\u7f6e"

    .line 1136
    .line 1137
    const-string v4, "\u672a\u547d\u4e2d\u9002\u7528\u804a\u5929\u65f6\u7ee7\u7eed\u4f7f\u7528\u4e0b\u65b9\u5168\u5c40\u8bbe\u7f6e"

    .line 1138
    .line 1139
    invoke-direct {v0, v3, v2, v4}, Lwb/bp;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 1140
    .line 1141
    .line 1142
    invoke-static {v0}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 1143
    .line 1144
    .line 1145
    move-result-object v0

    .line 1146
    invoke-interface {v8}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1147
    .line 1148
    .line 1149
    move-result-object v3

    .line 1150
    check-cast v3, Ljava/util/List;

    .line 1151
    .line 1152
    new-instance v4, Ljava/util/ArrayList;

    .line 1153
    .line 1154
    invoke-static {v3}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 1155
    .line 1156
    .line 1157
    move-result v7

    .line 1158
    invoke-direct {v4, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 1159
    .line 1160
    .line 1161
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v3

    .line 1165
    move v7, v6

    .line 1166
    :goto_d
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1167
    .line 1168
    .line 1169
    move-result v13

    .line 1170
    if-eqz v13, :cond_16

    .line 1171
    .line 1172
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1173
    .line 1174
    .line 1175
    move-result-object v13

    .line 1176
    add-int/lit8 v14, v7, 0x1

    .line 1177
    .line 1178
    if-ltz v7, :cond_15

    .line 1179
    .line 1180
    check-cast v13, Lna/j;

    .line 1181
    .line 1182
    iget-object v15, v13, Lna/j;->b:Ljava/lang/String;

    .line 1183
    .line 1184
    invoke-static {v15}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1185
    .line 1186
    .line 1187
    move-result v16

    .line 1188
    if-eqz v16, :cond_14

    .line 1189
    .line 1190
    const-string v15, "\u6a21\u677f "

    .line 1191
    .line 1192
    invoke-static {v14, v15}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 1193
    .line 1194
    .line 1195
    move-result-object v15

    .line 1196
    :cond_14
    invoke-static {v13}, Lwb/ho;->u5(Lna/j;)Ljava/lang/String;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v13

    .line 1200
    new-instance v2, Lwb/bp;

    .line 1201
    .line 1202
    invoke-direct {v2, v15, v7, v13}, Lwb/bp;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 1203
    .line 1204
    .line 1205
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1206
    .line 1207
    .line 1208
    move v7, v14

    .line 1209
    const/4 v2, -0x1

    .line 1210
    goto :goto_d

    .line 1211
    :cond_15
    invoke-static {}, La/a;->Q0()V

    .line 1212
    .line 1213
    .line 1214
    throw v5

    .line 1215
    :cond_16
    invoke-static {v0, v4}, Ltf/m;->F1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 1216
    .line 1217
    .line 1218
    move-result-object v0

    .line 1219
    invoke-interface {v8}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1220
    .line 1221
    .line 1222
    move-result-object v2

    .line 1223
    check-cast v2, Ljava/util/List;

    .line 1224
    .line 1225
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1226
    .line 1227
    .line 1228
    move-result-object v2

    .line 1229
    :goto_e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1230
    .line 1231
    .line 1232
    move-result v3

    .line 1233
    if-eqz v3, :cond_18

    .line 1234
    .line 1235
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1236
    .line 1237
    .line 1238
    move-result-object v3

    .line 1239
    check-cast v3, Lna/j;

    .line 1240
    .line 1241
    iget-object v3, v3, Lna/j;->a:Ljava/lang/String;

    .line 1242
    .line 1243
    invoke-interface {v9}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1244
    .line 1245
    .line 1246
    move-result-object v4

    .line 1247
    check-cast v4, Ljava/lang/String;

    .line 1248
    .line 1249
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1250
    .line 1251
    .line 1252
    move-result v3

    .line 1253
    if-eqz v3, :cond_17

    .line 1254
    .line 1255
    goto :goto_f

    .line 1256
    :cond_17
    add-int/lit8 v6, v6, 0x1

    .line 1257
    .line 1258
    goto :goto_e

    .line 1259
    :cond_18
    const/4 v6, -0x1

    .line 1260
    :goto_f
    const-string v2, "\u9ed8\u8ba4\u89c4\u5219"

    .line 1261
    .line 1262
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1263
    .line 1264
    .line 1265
    move-result-object v3

    .line 1266
    if-ltz v6, :cond_19

    .line 1267
    .line 1268
    move-object v5, v3

    .line 1269
    :cond_19
    if-eqz v5, :cond_1a

    .line 1270
    .line 1271
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 1272
    .line 1273
    .line 1274
    move-result v3

    .line 1275
    goto :goto_10

    .line 1276
    :cond_1a
    const/4 v3, -0x1

    .line 1277
    :goto_10
    new-instance v7, Lwb/eh;

    .line 1278
    .line 1279
    invoke-direct/range {v7 .. v12}, Lwb/eh;-><init>(Li0/a1;Li0/a1;Landroid/content/SharedPreferences;Li0/a1;Li0/a1;)V

    .line 1280
    .line 1281
    .line 1282
    new-instance v4, Lwb/cp;

    .line 1283
    .line 1284
    invoke-direct {v4, v2, v0, v3, v7}, Lwb/cp;-><init>(Ljava/lang/String;Ljava/util/ArrayList;ILfg/l;)V

    .line 1285
    .line 1286
    .line 1287
    invoke-interface {v12, v4}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 1288
    .line 1289
    .line 1290
    goto/16 :goto_2

    .line 1291
    .line 1292
    :pswitch_d
    iget-object v0, v1, Lc9/r0;->i:Ljava/lang/Object;

    .line 1293
    .line 1294
    check-cast v0, Landroid/content/SharedPreferences;

    .line 1295
    .line 1296
    iget-object v2, v1, Lc9/r0;->j:Ljava/lang/Object;

    .line 1297
    .line 1298
    check-cast v2, Ljava/lang/String;

    .line 1299
    .line 1300
    iget-object v3, v1, Lc9/r0;->k:Ljava/lang/Object;

    .line 1301
    .line 1302
    check-cast v3, Landroid/content/Context;

    .line 1303
    .line 1304
    iget-object v4, v1, Lc9/r0;->h:Ljava/lang/Object;

    .line 1305
    .line 1306
    check-cast v4, Lfg/a;

    .line 1307
    .line 1308
    iget-object v5, v1, Lc9/r0;->l:Ljava/lang/Object;

    .line 1309
    .line 1310
    check-cast v5, Li0/a1;

    .line 1311
    .line 1312
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 1313
    .line 1314
    .line 1315
    move-result-object v0

    .line 1316
    invoke-interface {v5}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1317
    .line 1318
    .line 1319
    move-result-object v5

    .line 1320
    check-cast v5, Ljava/util/Set;

    .line 1321
    .line 1322
    move-object v7, v5

    .line 1323
    check-cast v7, Ljava/lang/Iterable;

    .line 1324
    .line 1325
    const-string v8, ";;;"

    .line 1326
    .line 1327
    const/4 v11, 0x0

    .line 1328
    const/16 v12, 0x3e

    .line 1329
    .line 1330
    const/4 v9, 0x0

    .line 1331
    const/4 v10, 0x0

    .line 1332
    invoke-static/range {v7 .. v12}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 1333
    .line 1334
    .line 1335
    move-result-object v5

    .line 1336
    invoke-interface {v0, v2, v5}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 1337
    .line 1338
    .line 1339
    move-result-object v0

    .line 1340
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 1341
    .line 1342
    .line 1343
    const-string v0, "\u6807\u7b7e\u5df2\u4fdd\u5b58"

    .line 1344
    .line 1345
    invoke-static {v3, v0, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1346
    .line 1347
    .line 1348
    move-result-object v0

    .line 1349
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1350
    .line 1351
    .line 1352
    invoke-interface {v4}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 1353
    .line 1354
    .line 1355
    goto/16 :goto_2

    .line 1356
    .line 1357
    :pswitch_e
    iget-object v0, v1, Lc9/r0;->i:Ljava/lang/Object;

    .line 1358
    .line 1359
    check-cast v0, Lfg/l;

    .line 1360
    .line 1361
    iget-object v2, v1, Lc9/r0;->j:Ljava/lang/Object;

    .line 1362
    .line 1363
    check-cast v2, Lwb/mu;

    .line 1364
    .line 1365
    iget-object v3, v1, Lc9/r0;->k:Ljava/lang/Object;

    .line 1366
    .line 1367
    check-cast v3, Landroid/content/Context;

    .line 1368
    .line 1369
    iget-object v4, v1, Lc9/r0;->h:Ljava/lang/Object;

    .line 1370
    .line 1371
    check-cast v4, Li0/a1;

    .line 1372
    .line 1373
    iget-object v5, v1, Lc9/r0;->l:Ljava/lang/Object;

    .line 1374
    .line 1375
    check-cast v5, Li0/a1;

    .line 1376
    .line 1377
    iget-object v7, v2, Lwb/mu;->b:Lua/h;

    .line 1378
    .line 1379
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1380
    .line 1381
    .line 1382
    move-result-object v2

    .line 1383
    check-cast v2, Ljava/lang/Boolean;

    .line 1384
    .line 1385
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1386
    .line 1387
    .line 1388
    move-result v11

    .line 1389
    invoke-interface {v5}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1390
    .line 1391
    .line 1392
    move-result-object v2

    .line 1393
    move-object v12, v2

    .line 1394
    check-cast v12, Ljava/lang/String;

    .line 1395
    .line 1396
    const/4 v13, 0x7

    .line 1397
    const/4 v8, 0x0

    .line 1398
    const/4 v9, 0x0

    .line 1399
    const/4 v10, 0x0

    .line 1400
    invoke-static/range {v7 .. v13}, Lua/h;->a(Lua/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;I)Lua/h;

    .line 1401
    .line 1402
    .line 1403
    move-result-object v2

    .line 1404
    invoke-interface {v0, v2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1405
    .line 1406
    .line 1407
    const-string v0, "\u9002\u7528\u804a\u5929\u5df2\u4fdd\u5b58"

    .line 1408
    .line 1409
    invoke-static {v3, v0, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1410
    .line 1411
    .line 1412
    move-result-object v0

    .line 1413
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1414
    .line 1415
    .line 1416
    goto/16 :goto_2

    .line 1417
    .line 1418
    :pswitch_f
    iget-object v0, v1, Lc9/r0;->i:Ljava/lang/Object;

    .line 1419
    .line 1420
    check-cast v0, Lfg/p;

    .line 1421
    .line 1422
    iget-object v2, v1, Lc9/r0;->j:Ljava/lang/Object;

    .line 1423
    .line 1424
    check-cast v2, Li0/a1;

    .line 1425
    .line 1426
    iget-object v4, v1, Lc9/r0;->k:Ljava/lang/Object;

    .line 1427
    .line 1428
    check-cast v4, Li0/a1;

    .line 1429
    .line 1430
    iget-object v5, v1, Lc9/r0;->h:Ljava/lang/Object;

    .line 1431
    .line 1432
    check-cast v5, Landroid/content/Context;

    .line 1433
    .line 1434
    iget-object v7, v1, Lc9/r0;->l:Ljava/lang/Object;

    .line 1435
    .line 1436
    check-cast v7, Li0/a1;

    .line 1437
    .line 1438
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1439
    .line 1440
    .line 1441
    move-result-object v2

    .line 1442
    check-cast v2, Ljava/lang/Boolean;

    .line 1443
    .line 1444
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1445
    .line 1446
    .line 1447
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1448
    .line 1449
    .line 1450
    move-result-object v4

    .line 1451
    check-cast v4, Ljava/lang/String;

    .line 1452
    .line 1453
    invoke-static {v4}, Log/t;->f0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 1454
    .line 1455
    .line 1456
    move-result-object v4

    .line 1457
    if-eqz v4, :cond_1b

    .line 1458
    .line 1459
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 1460
    .line 1461
    .line 1462
    move-result v3

    .line 1463
    const/16 v4, 0x12c

    .line 1464
    .line 1465
    invoke-static {v3, v6, v4}, Lr9/e0;->r(III)I

    .line 1466
    .line 1467
    .line 1468
    move-result v3

    .line 1469
    :cond_1b
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1470
    .line 1471
    .line 1472
    move-result-object v3

    .line 1473
    invoke-interface {v0, v2, v3}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1474
    .line 1475
    .line 1476
    move-result-object v0

    .line 1477
    check-cast v0, Lrb/a;

    .line 1478
    .line 1479
    invoke-static {v5, v7, v0}, Lwb/ho;->t4(Landroid/content/Context;Li0/a1;Lrb/a;)V

    .line 1480
    .line 1481
    .line 1482
    goto/16 :goto_2

    .line 1483
    .line 1484
    :pswitch_10
    iget-object v0, v1, Lc9/r0;->i:Ljava/lang/Object;

    .line 1485
    .line 1486
    check-cast v0, Lfg/l;

    .line 1487
    .line 1488
    iget-object v2, v1, Lc9/r0;->j:Ljava/lang/Object;

    .line 1489
    .line 1490
    check-cast v2, Lwb/hq;

    .line 1491
    .line 1492
    iget-object v3, v1, Lc9/r0;->k:Ljava/lang/Object;

    .line 1493
    .line 1494
    check-cast v3, Landroid/content/Context;

    .line 1495
    .line 1496
    iget-object v4, v1, Lc9/r0;->h:Ljava/lang/Object;

    .line 1497
    .line 1498
    check-cast v4, Li0/a1;

    .line 1499
    .line 1500
    iget-object v5, v1, Lc9/r0;->l:Ljava/lang/Object;

    .line 1501
    .line 1502
    check-cast v5, Li0/a1;

    .line 1503
    .line 1504
    iget-object v7, v2, Lwb/hq;->b:Lna/i;

    .line 1505
    .line 1506
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1507
    .line 1508
    .line 1509
    move-result-object v2

    .line 1510
    check-cast v2, Ljava/lang/Boolean;

    .line 1511
    .line 1512
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1513
    .line 1514
    .line 1515
    move-result v11

    .line 1516
    invoke-interface {v5}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1517
    .line 1518
    .line 1519
    move-result-object v2

    .line 1520
    move-object v12, v2

    .line 1521
    check-cast v12, Ljava/lang/String;

    .line 1522
    .line 1523
    const/4 v13, 0x7

    .line 1524
    const/4 v8, 0x0

    .line 1525
    const/4 v9, 0x0

    .line 1526
    const/4 v10, 0x0

    .line 1527
    invoke-static/range {v7 .. v13}, Lna/i;->a(Lna/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;I)Lna/i;

    .line 1528
    .line 1529
    .line 1530
    move-result-object v2

    .line 1531
    invoke-interface {v0, v2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1532
    .line 1533
    .line 1534
    const-string v0, "\u9002\u7528\u804a\u5929\u5df2\u4fdd\u5b58"

    .line 1535
    .line 1536
    invoke-static {v3, v0, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1537
    .line 1538
    .line 1539
    move-result-object v0

    .line 1540
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1541
    .line 1542
    .line 1543
    goto/16 :goto_2

    .line 1544
    .line 1545
    :pswitch_11
    iget-object v0, v1, Lc9/r0;->i:Ljava/lang/Object;

    .line 1546
    .line 1547
    check-cast v0, Landroid/content/Context;

    .line 1548
    .line 1549
    iget-object v2, v1, Lc9/r0;->j:Ljava/lang/Object;

    .line 1550
    .line 1551
    check-cast v2, Lfg/l;

    .line 1552
    .line 1553
    iget-object v3, v1, Lc9/r0;->k:Ljava/lang/Object;

    .line 1554
    .line 1555
    check-cast v3, Li0/a1;

    .line 1556
    .line 1557
    iget-object v4, v1, Lc9/r0;->h:Ljava/lang/Object;

    .line 1558
    .line 1559
    check-cast v4, Li0/a1;

    .line 1560
    .line 1561
    iget-object v5, v1, Lc9/r0;->l:Ljava/lang/Object;

    .line 1562
    .line 1563
    check-cast v5, Li0/a1;

    .line 1564
    .line 1565
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1566
    .line 1567
    .line 1568
    move-result-object v3

    .line 1569
    check-cast v3, Lwb/s0;

    .line 1570
    .line 1571
    if-nez v3, :cond_1c

    .line 1572
    .line 1573
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1574
    .line 1575
    .line 1576
    move-result-object v3

    .line 1577
    check-cast v3, Ljava/util/Set;

    .line 1578
    .line 1579
    invoke-interface {v3}, Ljava/util/Set;->isEmpty()Z

    .line 1580
    .line 1581
    .line 1582
    move-result v3

    .line 1583
    if-eqz v3, :cond_1c

    .line 1584
    .line 1585
    invoke-interface {v5}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1586
    .line 1587
    .line 1588
    move-result-object v3

    .line 1589
    check-cast v3, Ljava/lang/Boolean;

    .line 1590
    .line 1591
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1592
    .line 1593
    .line 1594
    move-result v3

    .line 1595
    if-nez v3, :cond_1c

    .line 1596
    .line 1597
    const-string v2, "\u8bf7\u5148\u9009\u62e9\u7fa4\u804a"

    .line 1598
    .line 1599
    invoke-static {v0, v2, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1600
    .line 1601
    .line 1602
    move-result-object v0

    .line 1603
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1604
    .line 1605
    .line 1606
    goto :goto_11

    .line 1607
    :cond_1c
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1608
    .line 1609
    .line 1610
    move-result-object v0

    .line 1611
    check-cast v0, Ljava/util/Set;

    .line 1612
    .line 1613
    check-cast v0, Ljava/lang/Iterable;

    .line 1614
    .line 1615
    invoke-static {v0}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1616
    .line 1617
    .line 1618
    move-result-object v0

    .line 1619
    invoke-interface {v2, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1620
    .line 1621
    .line 1622
    :goto_11
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 1623
    .line 1624
    return-object v0

    .line 1625
    :pswitch_12
    iget-object v0, v1, Lc9/r0;->i:Ljava/lang/Object;

    .line 1626
    .line 1627
    check-cast v0, Lwb/v0;

    .line 1628
    .line 1629
    iget-object v2, v1, Lc9/r0;->j:Ljava/lang/Object;

    .line 1630
    .line 1631
    check-cast v2, Landroid/content/Context;

    .line 1632
    .line 1633
    iget-object v3, v1, Lc9/r0;->k:Ljava/lang/Object;

    .line 1634
    .line 1635
    check-cast v3, Lfg/l;

    .line 1636
    .line 1637
    iget-object v4, v1, Lc9/r0;->h:Ljava/lang/Object;

    .line 1638
    .line 1639
    check-cast v4, Li0/a1;

    .line 1640
    .line 1641
    iget-object v5, v1, Lc9/r0;->l:Ljava/lang/Object;

    .line 1642
    .line 1643
    check-cast v5, Li0/a1;

    .line 1644
    .line 1645
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1646
    .line 1647
    .line 1648
    move-result-object v4

    .line 1649
    check-cast v4, Ljava/util/List;

    .line 1650
    .line 1651
    new-instance v7, Ljava/util/ArrayList;

    .line 1652
    .line 1653
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 1654
    .line 1655
    .line 1656
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1657
    .line 1658
    .line 1659
    move-result-object v4

    .line 1660
    :cond_1d
    :goto_12
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1661
    .line 1662
    .line 1663
    move-result v8

    .line 1664
    if-eqz v8, :cond_1e

    .line 1665
    .line 1666
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1667
    .line 1668
    .line 1669
    move-result-object v8

    .line 1670
    move-object v9, v8

    .line 1671
    check-cast v9, Lwb/s0;

    .line 1672
    .line 1673
    invoke-interface {v5}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1674
    .line 1675
    .line 1676
    move-result-object v10

    .line 1677
    check-cast v10, Ljava/util/Set;

    .line 1678
    .line 1679
    iget-object v9, v9, Lwb/s0;->a:Ljava/lang/String;

    .line 1680
    .line 1681
    invoke-interface {v10, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1682
    .line 1683
    .line 1684
    move-result v9

    .line 1685
    if-eqz v9, :cond_1d

    .line 1686
    .line 1687
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1688
    .line 1689
    .line 1690
    goto :goto_12

    .line 1691
    :cond_1e
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1692
    .line 1693
    .line 1694
    move-result v4

    .line 1695
    if-eqz v4, :cond_1f

    .line 1696
    .line 1697
    iget-boolean v0, v0, Lwb/v0;->c:Z

    .line 1698
    .line 1699
    if-nez v0, :cond_1f

    .line 1700
    .line 1701
    const-string v0, "\u8bf7\u9009\u62e9\u8054\u7cfb\u4eba"

    .line 1702
    .line 1703
    invoke-static {v2, v0, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1704
    .line 1705
    .line 1706
    move-result-object v0

    .line 1707
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1708
    .line 1709
    .line 1710
    goto :goto_13

    .line 1711
    :cond_1f
    invoke-interface {v3, v7}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1712
    .line 1713
    .line 1714
    :goto_13
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 1715
    .line 1716
    return-object v0

    .line 1717
    :pswitch_13
    iget-object v0, v1, Lc9/r0;->i:Ljava/lang/Object;

    .line 1718
    .line 1719
    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1720
    .line 1721
    iget-object v2, v1, Lc9/r0;->j:Ljava/lang/Object;

    .line 1722
    .line 1723
    check-cast v2, Landroid/widget/FrameLayout;

    .line 1724
    .line 1725
    iget-object v3, v1, Lc9/r0;->k:Ljava/lang/Object;

    .line 1726
    .line 1727
    check-cast v3, Landroid/view/ViewGroup;

    .line 1728
    .line 1729
    iget-object v6, v1, Lc9/r0;->h:Ljava/lang/Object;

    .line 1730
    .line 1731
    check-cast v6, Lc9/a1;

    .line 1732
    .line 1733
    iget-object v7, v1, Lc9/r0;->l:Ljava/lang/Object;

    .line 1734
    .line 1735
    check-cast v7, Lgg/u;

    .line 1736
    .line 1737
    invoke-virtual {v0, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 1738
    .line 1739
    .line 1740
    move-result v0

    .line 1741
    if-nez v0, :cond_23

    .line 1742
    .line 1743
    :try_start_7
    iget-object v0, v7, Lgg/u;->g:Ljava/lang/Object;

    .line 1744
    .line 1745
    if-eqz v0, :cond_20

    .line 1746
    .line 1747
    check-cast v0, Ly1/c1;

    .line 1748
    .line 1749
    invoke-virtual {v0}, Ly1/a;->f()V

    .line 1750
    .line 1751
    .line 1752
    goto :goto_14

    .line 1753
    :cond_20
    const-string v0, "compose"

    .line 1754
    .line 1755
    invoke-static {v0}, Lgg/l;->g(Ljava/lang/String;)V

    .line 1756
    .line 1757
    .line 1758
    throw v5
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 1759
    :catchall_7
    :goto_14
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 1760
    .line 1761
    .line 1762
    move-result-object v0

    .line 1763
    if-ne v0, v3, :cond_21

    .line 1764
    .line 1765
    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 1766
    .line 1767
    .line 1768
    :cond_21
    invoke-static {v2}, Lx6/d;->p(Landroid/view/View;)V

    .line 1769
    .line 1770
    .line 1771
    invoke-static {v3}, Lx6/d;->p(Landroid/view/View;)V

    .line 1772
    .line 1773
    .line 1774
    iget-object v0, v6, Lc9/a1;->h:Landroidx/lifecycle/s;

    .line 1775
    .line 1776
    iget-object v2, v0, Landroidx/lifecycle/s;->c:Landroidx/lifecycle/l;

    .line 1777
    .line 1778
    sget-object v3, Landroidx/lifecycle/l;->g:Landroidx/lifecycle/l;

    .line 1779
    .line 1780
    if-eq v2, v3, :cond_22

    .line 1781
    .line 1782
    const-string v2, "setCurrentState"

    .line 1783
    .line 1784
    invoke-virtual {v0, v2}, Landroidx/lifecycle/s;->c(Ljava/lang/String;)V

    .line 1785
    .line 1786
    .line 1787
    invoke-virtual {v0, v3}, Landroidx/lifecycle/s;->e(Landroidx/lifecycle/l;)V

    .line 1788
    .line 1789
    .line 1790
    :cond_22
    iget-object v0, v6, Lc9/a1;->k:Lr3/a;

    .line 1791
    .line 1792
    invoke-virtual {v0}, Lr3/a;->a()V

    .line 1793
    .line 1794
    .line 1795
    iget-object v0, v6, Lc9/a1;->j:Landroidx/lifecycle/e0;

    .line 1796
    .line 1797
    invoke-virtual {v0}, Landroidx/lifecycle/e0;->a()V

    .line 1798
    .line 1799
    .line 1800
    :cond_23
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 1801
    .line 1802
    return-object v0

    .line 1803
    :pswitch_14
    iget-object v0, v1, Lc9/r0;->i:Ljava/lang/Object;

    .line 1804
    .line 1805
    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1806
    .line 1807
    iget-object v2, v1, Lc9/r0;->j:Ljava/lang/Object;

    .line 1808
    .line 1809
    check-cast v2, Landroid/widget/FrameLayout;

    .line 1810
    .line 1811
    iget-object v3, v1, Lc9/r0;->k:Ljava/lang/Object;

    .line 1812
    .line 1813
    check-cast v3, Landroid/view/ViewGroup;

    .line 1814
    .line 1815
    iget-object v6, v1, Lc9/r0;->h:Ljava/lang/Object;

    .line 1816
    .line 1817
    check-cast v6, Lc9/a1;

    .line 1818
    .line 1819
    iget-object v7, v1, Lc9/r0;->l:Ljava/lang/Object;

    .line 1820
    .line 1821
    check-cast v7, Lgg/u;

    .line 1822
    .line 1823
    invoke-virtual {v0, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 1824
    .line 1825
    .line 1826
    move-result v0

    .line 1827
    if-nez v0, :cond_27

    .line 1828
    .line 1829
    :try_start_8
    iget-object v0, v7, Lgg/u;->g:Ljava/lang/Object;

    .line 1830
    .line 1831
    if-eqz v0, :cond_24

    .line 1832
    .line 1833
    check-cast v0, Ly1/c1;

    .line 1834
    .line 1835
    invoke-virtual {v0}, Ly1/a;->f()V

    .line 1836
    .line 1837
    .line 1838
    goto :goto_15

    .line 1839
    :cond_24
    const-string v0, "compose"

    .line 1840
    .line 1841
    invoke-static {v0}, Lgg/l;->g(Ljava/lang/String;)V

    .line 1842
    .line 1843
    .line 1844
    throw v5
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    .line 1845
    :catchall_8
    :goto_15
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 1846
    .line 1847
    .line 1848
    move-result-object v0

    .line 1849
    if-ne v0, v3, :cond_25

    .line 1850
    .line 1851
    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 1852
    .line 1853
    .line 1854
    :cond_25
    invoke-static {v2}, Lx6/d;->p(Landroid/view/View;)V

    .line 1855
    .line 1856
    .line 1857
    invoke-static {v3}, Lx6/d;->p(Landroid/view/View;)V

    .line 1858
    .line 1859
    .line 1860
    iget-object v0, v6, Lc9/a1;->h:Landroidx/lifecycle/s;

    .line 1861
    .line 1862
    iget-object v2, v0, Landroidx/lifecycle/s;->c:Landroidx/lifecycle/l;

    .line 1863
    .line 1864
    sget-object v3, Landroidx/lifecycle/l;->g:Landroidx/lifecycle/l;

    .line 1865
    .line 1866
    if-eq v2, v3, :cond_26

    .line 1867
    .line 1868
    const-string v2, "setCurrentState"

    .line 1869
    .line 1870
    invoke-virtual {v0, v2}, Landroidx/lifecycle/s;->c(Ljava/lang/String;)V

    .line 1871
    .line 1872
    .line 1873
    invoke-virtual {v0, v3}, Landroidx/lifecycle/s;->e(Landroidx/lifecycle/l;)V

    .line 1874
    .line 1875
    .line 1876
    :cond_26
    iget-object v0, v6, Lc9/a1;->k:Lr3/a;

    .line 1877
    .line 1878
    invoke-virtual {v0}, Lr3/a;->a()V

    .line 1879
    .line 1880
    .line 1881
    iget-object v0, v6, Lc9/a1;->j:Landroidx/lifecycle/e0;

    .line 1882
    .line 1883
    invoke-virtual {v0}, Landroidx/lifecycle/e0;->a()V

    .line 1884
    .line 1885
    .line 1886
    :cond_27
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 1887
    .line 1888
    return-object v0

    .line 1889
    :pswitch_15
    iget-object v0, v1, Lc9/r0;->i:Ljava/lang/Object;

    .line 1890
    .line 1891
    check-cast v0, Lf9/h;

    .line 1892
    .line 1893
    iget-object v2, v1, Lc9/r0;->j:Ljava/lang/Object;

    .line 1894
    .line 1895
    check-cast v2, Lfg/p;

    .line 1896
    .line 1897
    iget-object v3, v1, Lc9/r0;->k:Ljava/lang/Object;

    .line 1898
    .line 1899
    check-cast v3, Li0/a1;

    .line 1900
    .line 1901
    iget-object v4, v1, Lc9/r0;->h:Ljava/lang/Object;

    .line 1902
    .line 1903
    check-cast v4, Li0/a1;

    .line 1904
    .line 1905
    iget-object v5, v1, Lc9/r0;->l:Ljava/lang/Object;

    .line 1906
    .line 1907
    check-cast v5, Li0/a1;

    .line 1908
    .line 1909
    iget-boolean v0, v0, Lf9/h;->d:Z

    .line 1910
    .line 1911
    if-eqz v0, :cond_28

    .line 1912
    .line 1913
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1914
    .line 1915
    .line 1916
    move-result-object v0

    .line 1917
    check-cast v0, Ljava/lang/String;

    .line 1918
    .line 1919
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1920
    .line 1921
    .line 1922
    move-result-object v0

    .line 1923
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1924
    .line 1925
    .line 1926
    move-result-object v0

    .line 1927
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1928
    .line 1929
    .line 1930
    move-result v0

    .line 1931
    if-eqz v0, :cond_28

    .line 1932
    .line 1933
    const-string v0, "\u8bf7\u8f93\u5165\u91d1\u989d"

    .line 1934
    .line 1935
    invoke-interface {v4, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 1936
    .line 1937
    .line 1938
    goto :goto_16

    .line 1939
    :cond_28
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1940
    .line 1941
    .line 1942
    move-result-object v0

    .line 1943
    check-cast v0, Ljava/lang/String;

    .line 1944
    .line 1945
    invoke-interface {v5}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1946
    .line 1947
    .line 1948
    move-result-object v3

    .line 1949
    check-cast v3, Ljava/lang/String;

    .line 1950
    .line 1951
    invoke-interface {v2, v0, v3}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1952
    .line 1953
    .line 1954
    :goto_16
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 1955
    .line 1956
    return-object v0

    .line 1957
    :pswitch_16
    iget-object v0, v1, Lc9/r0;->i:Ljava/lang/Object;

    .line 1958
    .line 1959
    move-object v2, v0

    .line 1960
    check-cast v2, Lp8/o;

    .line 1961
    .line 1962
    iget-object v0, v1, Lc9/r0;->j:Ljava/lang/Object;

    .line 1963
    .line 1964
    check-cast v0, Ljava/lang/reflect/Method;

    .line 1965
    .line 1966
    iget-object v3, v1, Lc9/r0;->k:Ljava/lang/Object;

    .line 1967
    .line 1968
    check-cast v3, Ljava/lang/reflect/Method;

    .line 1969
    .line 1970
    iget-object v7, v1, Lc9/r0;->h:Ljava/lang/Object;

    .line 1971
    .line 1972
    check-cast v7, Lp8/s;

    .line 1973
    .line 1974
    iget-object v8, v1, Lc9/r0;->l:Ljava/lang/Object;

    .line 1975
    .line 1976
    :try_start_9
    new-array v9, v6, [Ljava/lang/Object;

    .line 1977
    .line 1978
    invoke-static {v0, v5, v9}, Lh/Hchat/utils/KavaReflector;->invokeOrThrow(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1979
    .line 1980
    .line 1981
    move-result-object v0

    .line 1982
    if-eqz v0, :cond_29

    .line 1983
    .line 1984
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 1985
    .line 1986
    .line 1987
    move-result-object v9

    .line 1988
    invoke-virtual {v9, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 1989
    .line 1990
    .line 1991
    move-result v9

    .line 1992
    if-nez v9, :cond_2a

    .line 1993
    .line 1994
    :cond_29
    move v4, v6

    .line 1995
    goto :goto_17

    .line 1996
    :cond_2a
    iget-object v6, v7, Lp8/s;->e:Ljava/lang/Object;

    .line 1997
    .line 1998
    const/4 v9, 0x2

    .line 1999
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2000
    .line 2001
    .line 2002
    move-result-object v9

    .line 2003
    filled-new-array {v6, v9, v5, v8}, [Ljava/lang/Object;

    .line 2004
    .line 2005
    .line 2006
    move-result-object v5

    .line 2007
    invoke-static {v3, v0, v5}, Lh/Hchat/utils/KavaReflector;->invokeOrThrow(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 2008
    .line 2009
    .line 2010
    goto :goto_17

    .line 2011
    :catchall_9
    move-exception v0

    .line 2012
    goto :goto_18

    .line 2013
    :goto_17
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2014
    .line 2015
    .line 2016
    move-result-object v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    .line 2017
    goto :goto_19

    .line 2018
    :goto_18
    new-instance v3, Lsf/f;

    .line 2019
    .line 2020
    invoke-direct {v3, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 2021
    .line 2022
    .line 2023
    move-object v0, v3

    .line 2024
    :goto_19
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 2025
    .line 2026
    .line 2027
    move-result-object v3

    .line 2028
    if-eqz v3, :cond_2b

    .line 2029
    .line 2030
    iget-object v2, v2, Lp8/o;->b:Lfg/p;

    .line 2031
    .line 2032
    iget-object v4, v7, Lp8/s;->a:Ljava/lang/String;

    .line 2033
    .line 2034
    const-string v5, "\u8c03\u7528\u5fae\u4fe1\u670b\u53cb\u5708\u539f\u56fe\u4e0b\u8f7d\u5931\u8d25: "

    .line 2035
    .line 2036
    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 2037
    .line 2038
    .line 2039
    move-result-object v4

    .line 2040
    invoke-interface {v2, v4, v3}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2041
    .line 2042
    .line 2043
    :cond_2b
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2044
    .line 2045
    instance-of v3, v0, Lsf/f;

    .line 2046
    .line 2047
    if-eqz v3, :cond_2c

    .line 2048
    .line 2049
    move-object v0, v2

    .line 2050
    :cond_2c
    check-cast v0, Ljava/lang/Boolean;

    .line 2051
    .line 2052
    return-object v0

    .line 2053
    :pswitch_17
    iget-object v0, v1, Lc9/r0;->i:Ljava/lang/Object;

    .line 2054
    .line 2055
    move-object v2, v0

    .line 2056
    check-cast v2, Lp8/o;

    .line 2057
    .line 2058
    iget-object v0, v1, Lc9/r0;->j:Ljava/lang/Object;

    .line 2059
    .line 2060
    check-cast v0, Ljava/lang/reflect/Method;

    .line 2061
    .line 2062
    iget-object v3, v1, Lc9/r0;->k:Ljava/lang/Object;

    .line 2063
    .line 2064
    check-cast v3, Ljava/lang/reflect/Method;

    .line 2065
    .line 2066
    iget-object v7, v1, Lc9/r0;->h:Ljava/lang/Object;

    .line 2067
    .line 2068
    check-cast v7, Lp8/s;

    .line 2069
    .line 2070
    iget-object v8, v1, Lc9/r0;->l:Ljava/lang/Object;

    .line 2071
    .line 2072
    check-cast v8, Ljava/lang/String;

    .line 2073
    .line 2074
    :try_start_a
    new-array v9, v6, [Ljava/lang/Object;

    .line 2075
    .line 2076
    invoke-static {v0, v5, v9}, Lh/Hchat/utils/KavaReflector;->invokeOrThrow(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 2077
    .line 2078
    .line 2079
    move-result-object v0

    .line 2080
    if-eqz v0, :cond_30

    .line 2081
    .line 2082
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 2083
    .line 2084
    .line 2085
    move-result-object v9

    .line 2086
    invoke-virtual {v9, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 2087
    .line 2088
    .line 2089
    move-result v9

    .line 2090
    if-nez v9, :cond_2d

    .line 2091
    .line 2092
    goto :goto_1c

    .line 2093
    :cond_2d
    iget-object v10, v7, Lp8/s;->e:Ljava/lang/Object;

    .line 2094
    .line 2095
    iget-object v6, v7, Lp8/s;->a:Ljava/lang/String;

    .line 2096
    .line 2097
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2098
    .line 2099
    .line 2100
    move-result-object v11

    .line 2101
    invoke-static {v8}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2102
    .line 2103
    .line 2104
    move-result v4

    .line 2105
    if-eqz v4, :cond_2e

    .line 2106
    .line 2107
    move-object v12, v6

    .line 2108
    goto :goto_1a

    .line 2109
    :cond_2e
    move-object v12, v8

    .line 2110
    :goto_1a
    sget-object v13, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2111
    .line 2112
    sget-object v14, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 2113
    .line 2114
    const/16 v4, 0x1f

    .line 2115
    .line 2116
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2117
    .line 2118
    .line 2119
    move-result-object v15

    .line 2120
    move-object/from16 v16, v6

    .line 2121
    .line 2122
    filled-new-array/range {v10 .. v16}, [Ljava/lang/Object;

    .line 2123
    .line 2124
    .line 2125
    move-result-object v4

    .line 2126
    invoke-static {v3, v0, v4}, Lh/Hchat/utils/KavaReflector;->invokeOrThrow(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 2127
    .line 2128
    .line 2129
    move-result-object v0

    .line 2130
    instance-of v3, v0, Ljava/lang/Boolean;

    .line 2131
    .line 2132
    if-eqz v3, :cond_2f

    .line 2133
    .line 2134
    move-object v5, v0

    .line 2135
    check-cast v5, Ljava/lang/Boolean;

    .line 2136
    .line 2137
    goto :goto_1b

    .line 2138
    :catchall_a
    move-exception v0

    .line 2139
    goto :goto_1d

    .line 2140
    :cond_2f
    :goto_1b
    invoke-static {v5, v14}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2141
    .line 2142
    .line 2143
    move-result v6

    .line 2144
    :cond_30
    :goto_1c
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2145
    .line 2146
    .line 2147
    move-result-object v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_a

    .line 2148
    goto :goto_1e

    .line 2149
    :goto_1d
    new-instance v3, Lsf/f;

    .line 2150
    .line 2151
    invoke-direct {v3, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 2152
    .line 2153
    .line 2154
    move-object v0, v3

    .line 2155
    :goto_1e
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 2156
    .line 2157
    .line 2158
    move-result-object v3

    .line 2159
    if-eqz v3, :cond_31

    .line 2160
    .line 2161
    iget-object v2, v2, Lp8/o;->b:Lfg/p;

    .line 2162
    .line 2163
    iget-object v4, v7, Lp8/s;->a:Ljava/lang/String;

    .line 2164
    .line 2165
    const-string v5, "\u8c03\u7528\u5fae\u4fe1\u670b\u53cb\u5708\u89c6\u9891\u4e0b\u8f7d\u5931\u8d25: "

    .line 2166
    .line 2167
    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 2168
    .line 2169
    .line 2170
    move-result-object v4

    .line 2171
    invoke-interface {v2, v4, v3}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2172
    .line 2173
    .line 2174
    :cond_31
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2175
    .line 2176
    instance-of v3, v0, Lsf/f;

    .line 2177
    .line 2178
    if-eqz v3, :cond_32

    .line 2179
    .line 2180
    move-object v0, v2

    .line 2181
    :cond_32
    check-cast v0, Ljava/lang/Boolean;

    .line 2182
    .line 2183
    return-object v0

    .line 2184
    :pswitch_18
    iget-object v0, v1, Lc9/r0;->i:Ljava/lang/Object;

    .line 2185
    .line 2186
    move-object v7, v0

    .line 2187
    check-cast v7, Lia/a0;

    .line 2188
    .line 2189
    iget-object v0, v1, Lc9/r0;->h:Ljava/lang/Object;

    .line 2190
    .line 2191
    check-cast v0, Landroid/app/Activity;

    .line 2192
    .line 2193
    iget-object v2, v1, Lc9/r0;->j:Ljava/lang/Object;

    .line 2194
    .line 2195
    check-cast v2, Lp8/l;

    .line 2196
    .line 2197
    iget-object v3, v1, Lc9/r0;->k:Ljava/lang/Object;

    .line 2198
    .line 2199
    move-object v8, v3

    .line 2200
    check-cast v8, Ljava/lang/String;

    .line 2201
    .line 2202
    iget-object v3, v1, Lc9/r0;->l:Ljava/lang/Object;

    .line 2203
    .line 2204
    check-cast v3, Lia/c;

    .line 2205
    .line 2206
    const-string v4, "\u670b\u53cb\u5708\u4f2a\u4e92\u52a8\u672a\u627e\u5230\u672c\u5730\u8bb0\u5f55: "

    .line 2207
    .line 2208
    iget-object v14, v7, Lia/a0;->k:Ljava/lang/Object;

    .line 2209
    .line 2210
    monitor-enter v14

    .line 2211
    :try_start_b
    invoke-virtual {v7, v8}, Lia/a0;->m(Ljava/lang/String;)Lp8/f;

    .line 2212
    .line 2213
    .line 2214
    move-result-object v9

    .line 2215
    iget-object v9, v9, Lp8/f;->b:Ljava/lang/Object;

    .line 2216
    .line 2217
    if-nez v9, :cond_33

    .line 2218
    .line 2219
    iget-object v3, v7, Lia/a0;->d:Lab/b;

    .line 2220
    .line 2221
    new-instance v9, Ljava/lang/StringBuilder;

    .line 2222
    .line 2223
    invoke-direct {v9, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2224
    .line 2225
    .line 2226
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2227
    .line 2228
    .line 2229
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2230
    .line 2231
    .line 2232
    move-result-object v4

    .line 2233
    invoke-virtual {v3, v4, v5}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2234
    .line 2235
    .line 2236
    goto :goto_1f

    .line 2237
    :catchall_b
    move-exception v0

    .line 2238
    goto :goto_20

    .line 2239
    :cond_33
    iget-object v4, v7, Lia/a0;->b:Lb5/c;

    .line 2240
    .line 2241
    invoke-virtual {v4, v8}, Lb5/c;->l(Ljava/lang/String;)Lia/c;

    .line 2242
    .line 2243
    .line 2244
    move-result-object v4

    .line 2245
    invoke-static {v3, v4}, Lia/a0;->j(Lia/c;Lia/c;)Lia/c;

    .line 2246
    .line 2247
    .line 2248
    move-result-object v11

    .line 2249
    invoke-virtual {v7, v4}, Lia/a0;->d(Lia/c;)Lia/c;

    .line 2250
    .line 2251
    .line 2252
    move-result-object v10

    .line 2253
    invoke-virtual {v7}, Lia/a0;->f()Z

    .line 2254
    .line 2255
    .line 2256
    move-result v12

    .line 2257
    invoke-virtual {v7}, Lia/a0;->e()Z

    .line 2258
    .line 2259
    .line 2260
    move-result v13

    .line 2261
    invoke-virtual/range {v7 .. v13}, Lia/a0;->h(Ljava/lang/String;Ljava/lang/Object;Lia/c;Lia/c;ZZ)Z

    .line 2262
    .line 2263
    .line 2264
    move-result v6

    .line 2265
    if-eqz v6, :cond_34

    .line 2266
    .line 2267
    iget-object v3, v7, Lia/a0;->b:Lb5/c;

    .line 2268
    .line 2269
    invoke-virtual {v3, v8, v4}, Lb5/c;->a(Ljava/lang/String;Lia/c;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_b

    .line 2270
    .line 2271
    .line 2272
    :cond_34
    :goto_1f
    monitor-exit v14

    .line 2273
    if-eqz v6, :cond_36

    .line 2274
    .line 2275
    iget-object v2, v2, Lp8/l;->d:Ljava/lang/ref/WeakReference;

    .line 2276
    .line 2277
    if-eqz v2, :cond_35

    .line 2278
    .line 2279
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 2280
    .line 2281
    .line 2282
    move-result-object v2

    .line 2283
    move-object v5, v2

    .line 2284
    check-cast v5, Landroid/view/View;

    .line 2285
    .line 2286
    :cond_35
    invoke-virtual {v7, v0, v5}, Lia/a0;->n(Landroid/app/Activity;Landroid/view/View;)V

    .line 2287
    .line 2288
    .line 2289
    :cond_36
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 2290
    .line 2291
    return-object v0

    .line 2292
    :goto_20
    monitor-exit v14

    .line 2293
    throw v0

    .line 2294
    :pswitch_19
    iget-object v0, v1, Lc9/r0;->i:Ljava/lang/Object;

    .line 2295
    .line 2296
    check-cast v0, Lc9/o2;

    .line 2297
    .line 2298
    iget-object v2, v1, Lc9/r0;->h:Ljava/lang/Object;

    .line 2299
    .line 2300
    check-cast v2, Landroid/app/Activity;

    .line 2301
    .line 2302
    iget-object v3, v1, Lc9/r0;->j:Ljava/lang/Object;

    .line 2303
    .line 2304
    check-cast v3, Lfg/a;

    .line 2305
    .line 2306
    iget-object v7, v1, Lc9/r0;->k:Ljava/lang/Object;

    .line 2307
    .line 2308
    check-cast v7, Li0/a1;

    .line 2309
    .line 2310
    iget-object v8, v1, Lc9/r0;->l:Ljava/lang/Object;

    .line 2311
    .line 2312
    check-cast v8, Lfg/a;

    .line 2313
    .line 2314
    instance-of v9, v0, Lc9/f1;

    .line 2315
    .line 2316
    if-eqz v9, :cond_37

    .line 2317
    .line 2318
    check-cast v0, Lc9/f1;

    .line 2319
    .line 2320
    iget-object v0, v0, Lc9/f1;->b:Ljava/lang/String;

    .line 2321
    .line 2322
    invoke-interface {v7}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 2323
    .line 2324
    .line 2325
    move-result-object v4

    .line 2326
    check-cast v4, Ljava/lang/String;

    .line 2327
    .line 2328
    invoke-static {v2, v0, v4}, Lc9/o2;->s(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z

    .line 2329
    .line 2330
    .line 2331
    move-result v0

    .line 2332
    goto/16 :goto_2b

    .line 2333
    .line 2334
    :cond_37
    instance-of v9, v0, Lc9/g1;

    .line 2335
    .line 2336
    if-eqz v9, :cond_4a

    .line 2337
    .line 2338
    check-cast v0, Lc9/g1;

    .line 2339
    .line 2340
    iget-object v0, v0, Lc9/g1;->b:Ljava/lang/String;

    .line 2341
    .line 2342
    invoke-interface {v7}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 2343
    .line 2344
    .line 2345
    move-result-object v7

    .line 2346
    check-cast v7, Ljava/lang/String;

    .line 2347
    .line 2348
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2349
    .line 2350
    .line 2351
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2352
    .line 2353
    .line 2354
    sget-object v9, Lc9/o2;->a:Ljava/lang/Object;

    .line 2355
    .line 2356
    monitor-enter v9

    .line 2357
    :try_start_c
    invoke-static {}, Lc9/o2;->a()Ljava/lang/String;

    .line 2358
    .line 2359
    .line 2360
    move-result-object v10

    .line 2361
    invoke-static {v10}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2362
    .line 2363
    .line 2364
    move-result v11

    .line 2365
    if-eqz v11, :cond_38

    .line 2366
    .line 2367
    goto/16 :goto_2a

    .line 2368
    .line 2369
    :cond_38
    invoke-static {v2, v10}, Lc9/o2;->j(Landroid/content/Context;Ljava/lang/String;)Ljava/util/List;

    .line 2370
    .line 2371
    .line 2372
    move-result-object v11

    .line 2373
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2374
    .line 2375
    .line 2376
    move-result-object v0

    .line 2377
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 2378
    .line 2379
    .line 2380
    move-result-object v0

    .line 2381
    if-eqz v7, :cond_3a

    .line 2382
    .line 2383
    invoke-static {v7}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2384
    .line 2385
    .line 2386
    move-result-object v7

    .line 2387
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 2388
    .line 2389
    .line 2390
    move-result-object v7

    .line 2391
    if-eqz v7, :cond_3a

    .line 2392
    .line 2393
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 2394
    .line 2395
    .line 2396
    move-result v12

    .line 2397
    if-lez v12, :cond_39

    .line 2398
    .line 2399
    goto :goto_21

    .line 2400
    :cond_39
    move-object v7, v5

    .line 2401
    :goto_21
    move-object v14, v7

    .line 2402
    goto :goto_22

    .line 2403
    :catchall_c
    move-exception v0

    .line 2404
    goto/16 :goto_2d

    .line 2405
    .line 2406
    :cond_3a
    move-object v14, v5

    .line 2407
    :goto_22
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2408
    .line 2409
    .line 2410
    move-result-object v7

    .line 2411
    move v12, v6

    .line 2412
    :goto_23
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 2413
    .line 2414
    .line 2415
    move-result v13

    .line 2416
    if-eqz v13, :cond_3c

    .line 2417
    .line 2418
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2419
    .line 2420
    .line 2421
    move-result-object v13

    .line 2422
    check-cast v13, Lc9/a;

    .line 2423
    .line 2424
    iget-object v13, v13, Lc9/a;->a:Ljava/lang/String;

    .line 2425
    .line 2426
    invoke-static {v13, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2427
    .line 2428
    .line 2429
    move-result v13

    .line 2430
    if-eqz v13, :cond_3b

    .line 2431
    .line 2432
    move v7, v12

    .line 2433
    goto :goto_24

    .line 2434
    :cond_3b
    add-int/lit8 v12, v12, 0x1

    .line 2435
    .line 2436
    goto :goto_23

    .line 2437
    :cond_3c
    const/4 v7, -0x1

    .line 2438
    :goto_24
    if-ltz v7, :cond_47

    .line 2439
    .line 2440
    if-nez v14, :cond_3d

    .line 2441
    .line 2442
    move v12, v4

    .line 2443
    goto :goto_26

    .line 2444
    :cond_3d
    invoke-virtual {v14, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2445
    .line 2446
    .line 2447
    move-result v12

    .line 2448
    if-nez v12, :cond_40

    .line 2449
    .line 2450
    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    .line 2451
    .line 2452
    .line 2453
    move-result v12

    .line 2454
    if-eqz v12, :cond_3e

    .line 2455
    .line 2456
    goto :goto_25

    .line 2457
    :cond_3e
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2458
    .line 2459
    .line 2460
    move-result-object v12

    .line 2461
    :cond_3f
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 2462
    .line 2463
    .line 2464
    move-result v13

    .line 2465
    if-eqz v13, :cond_40

    .line 2466
    .line 2467
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2468
    .line 2469
    .line 2470
    move-result-object v13

    .line 2471
    check-cast v13, Lc9/a;

    .line 2472
    .line 2473
    iget-object v13, v13, Lc9/a;->a:Ljava/lang/String;

    .line 2474
    .line 2475
    invoke-static {v13, v14}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2476
    .line 2477
    .line 2478
    move-result v13

    .line 2479
    if-eqz v13, :cond_3f

    .line 2480
    .line 2481
    invoke-static {v0, v11}, Lc9/o2;->f(Ljava/lang/String;Ljava/util/List;)Ljava/util/Set;

    .line 2482
    .line 2483
    .line 2484
    move-result-object v12

    .line 2485
    invoke-interface {v12, v14}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 2486
    .line 2487
    .line 2488
    move-result v12

    .line 2489
    xor-int/2addr v12, v4

    .line 2490
    goto :goto_26

    .line 2491
    :cond_40
    :goto_25
    move v12, v6

    .line 2492
    :goto_26
    if-nez v12, :cond_41

    .line 2493
    .line 2494
    goto :goto_2a

    .line 2495
    :cond_41
    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    .line 2496
    .line 2497
    .line 2498
    move-result v12

    .line 2499
    if-eqz v12, :cond_42

    .line 2500
    .line 2501
    move v15, v6

    .line 2502
    goto :goto_29

    .line 2503
    :cond_42
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2504
    .line 2505
    .line 2506
    move-result-object v12

    .line 2507
    move v13, v6

    .line 2508
    :goto_27
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 2509
    .line 2510
    .line 2511
    move-result v15

    .line 2512
    if-eqz v15, :cond_46

    .line 2513
    .line 2514
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2515
    .line 2516
    .line 2517
    move-result-object v15

    .line 2518
    check-cast v15, Lc9/a;

    .line 2519
    .line 2520
    iget-object v4, v15, Lc9/a;->c:Ljava/lang/String;

    .line 2521
    .line 2522
    invoke-static {v4, v14}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2523
    .line 2524
    .line 2525
    move-result v4

    .line 2526
    if-eqz v4, :cond_43

    .line 2527
    .line 2528
    iget-object v4, v15, Lc9/a;->a:Ljava/lang/String;

    .line 2529
    .line 2530
    invoke-static {v4, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2531
    .line 2532
    .line 2533
    move-result v4

    .line 2534
    if-nez v4, :cond_43

    .line 2535
    .line 2536
    const/4 v4, 0x1

    .line 2537
    goto :goto_28

    .line 2538
    :cond_43
    move v4, v6

    .line 2539
    :goto_28
    if-eqz v4, :cond_44

    .line 2540
    .line 2541
    add-int/lit8 v13, v13, 0x1

    .line 2542
    .line 2543
    if-ltz v13, :cond_45

    .line 2544
    .line 2545
    :cond_44
    const/4 v4, 0x1

    .line 2546
    goto :goto_27

    .line 2547
    :cond_45
    invoke-static {}, La/a;->P0()V

    .line 2548
    .line 2549
    .line 2550
    throw v5

    .line 2551
    :cond_46
    move v15, v13

    .line 2552
    :goto_29
    new-instance v0, Ljava/util/ArrayList;

    .line 2553
    .line 2554
    invoke-direct {v0, v11}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 2555
    .line 2556
    .line 2557
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2558
    .line 2559
    .line 2560
    move-result-object v4

    .line 2561
    move-object v11, v4

    .line 2562
    check-cast v11, Lc9/a;

    .line 2563
    .line 2564
    const/16 v22, 0x0

    .line 2565
    .line 2566
    const/16 v23, 0xff3

    .line 2567
    .line 2568
    const/4 v12, 0x0

    .line 2569
    const/4 v13, 0x0

    .line 2570
    const/16 v16, 0x0

    .line 2571
    .line 2572
    const/16 v17, 0x0

    .line 2573
    .line 2574
    const/16 v18, 0x0

    .line 2575
    .line 2576
    const/16 v19, 0x0

    .line 2577
    .line 2578
    const/16 v20, 0x0

    .line 2579
    .line 2580
    const/16 v21, 0x0

    .line 2581
    .line 2582
    invoke-static/range {v11 .. v23}, Lc9/a;->a(Lc9/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;ZLjava/lang/String;ZZZI)Lc9/a;

    .line 2583
    .line 2584
    .line 2585
    move-result-object v4

    .line 2586
    invoke-virtual {v0, v7, v4}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 2587
    .line 2588
    .line 2589
    invoke-static {v0}, Lc9/o2;->l(Ljava/util/List;)Ljava/util/ArrayList;

    .line 2590
    .line 2591
    .line 2592
    move-result-object v0

    .line 2593
    invoke-static {v2, v10, v0}, Lc9/o2;->r(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;)Z

    .line 2594
    .line 2595
    .line 2596
    move-result v6
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_c

    .line 2597
    :cond_47
    :goto_2a
    monitor-exit v9

    .line 2598
    move v0, v6

    .line 2599
    :goto_2b
    if-eqz v0, :cond_48

    .line 2600
    .line 2601
    const-string v4, "\u804a\u5929\u5206\u7ec4\u5df2\u66f4\u65b0"

    .line 2602
    .line 2603
    goto :goto_2c

    .line 2604
    :cond_48
    const-string v4, "\u66f4\u65b0\u804a\u5929\u5206\u7ec4\u5931\u8d25"

    .line 2605
    .line 2606
    :goto_2c
    invoke-static {v2, v4}, Lc9/j1;->p(Landroid/app/Activity;Ljava/lang/String;)V

    .line 2607
    .line 2608
    .line 2609
    if-eqz v0, :cond_49

    .line 2610
    .line 2611
    invoke-static {v8}, Lc9/j1;->n(Lfg/a;)V

    .line 2612
    .line 2613
    .line 2614
    invoke-interface {v3}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 2615
    .line 2616
    .line 2617
    :cond_49
    sget-object v5, Lsf/n;->a:Lsf/n;

    .line 2618
    .line 2619
    goto :goto_2e

    .line 2620
    :goto_2d
    monitor-exit v9

    .line 2621
    throw v0

    .line 2622
    :cond_4a
    invoke-static {}, Lokio/a;->k()V

    .line 2623
    .line 2624
    .line 2625
    :goto_2e
    return-object v5

    .line 2626
    :pswitch_1a
    iget-object v0, v1, Lc9/r0;->i:Ljava/lang/Object;

    .line 2627
    .line 2628
    check-cast v0, Lc9/a1;

    .line 2629
    .line 2630
    iget-object v2, v1, Lc9/r0;->j:Ljava/lang/Object;

    .line 2631
    .line 2632
    check-cast v2, Landroid/widget/FrameLayout;

    .line 2633
    .line 2634
    iget-object v3, v1, Lc9/r0;->k:Ljava/lang/Object;

    .line 2635
    .line 2636
    check-cast v3, Landroid/view/ViewGroup;

    .line 2637
    .line 2638
    iget-object v4, v1, Lc9/r0;->h:Ljava/lang/Object;

    .line 2639
    .line 2640
    check-cast v4, Landroid/app/Activity;

    .line 2641
    .line 2642
    iget-object v6, v1, Lc9/r0;->l:Ljava/lang/Object;

    .line 2643
    .line 2644
    check-cast v6, Lgg/u;

    .line 2645
    .line 2646
    :try_start_d
    iget-object v6, v6, Lgg/u;->g:Ljava/lang/Object;

    .line 2647
    .line 2648
    if-eqz v6, :cond_4b

    .line 2649
    .line 2650
    check-cast v6, Ly1/c1;

    .line 2651
    .line 2652
    invoke-virtual {v6}, Ly1/a;->f()V

    .line 2653
    .line 2654
    .line 2655
    goto :goto_2f

    .line 2656
    :cond_4b
    const-string v6, "compose"

    .line 2657
    .line 2658
    invoke-static {v6}, Lgg/l;->g(Ljava/lang/String;)V

    .line 2659
    .line 2660
    .line 2661
    throw v5
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_d

    .line 2662
    :catchall_d
    :goto_2f
    :try_start_e
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2663
    .line 2664
    .line 2665
    move-result-object v6

    .line 2666
    instance-of v7, v6, Landroid/view/ViewGroup;

    .line 2667
    .line 2668
    if-eqz v7, :cond_4c

    .line 2669
    .line 2670
    move-object v5, v6

    .line 2671
    check-cast v5, Landroid/view/ViewGroup;

    .line 2672
    .line 2673
    :cond_4c
    if-eqz v5, :cond_4d

    .line 2674
    .line 2675
    invoke-virtual {v5, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_e

    .line 2676
    .line 2677
    .line 2678
    :catchall_e
    :cond_4d
    invoke-static {v2}, Lx6/d;->p(Landroid/view/View;)V

    .line 2679
    .line 2680
    .line 2681
    invoke-static {v3}, Lx6/d;->p(Landroid/view/View;)V

    .line 2682
    .line 2683
    .line 2684
    iget-object v2, v0, Lc9/a1;->h:Landroidx/lifecycle/s;

    .line 2685
    .line 2686
    iget-object v3, v2, Landroidx/lifecycle/s;->c:Landroidx/lifecycle/l;

    .line 2687
    .line 2688
    sget-object v5, Landroidx/lifecycle/l;->g:Landroidx/lifecycle/l;

    .line 2689
    .line 2690
    if-eq v3, v5, :cond_4e

    .line 2691
    .line 2692
    const-string v3, "setCurrentState"

    .line 2693
    .line 2694
    invoke-virtual {v2, v3}, Landroidx/lifecycle/s;->c(Ljava/lang/String;)V

    .line 2695
    .line 2696
    .line 2697
    invoke-virtual {v2, v5}, Landroidx/lifecycle/s;->e(Landroidx/lifecycle/l;)V

    .line 2698
    .line 2699
    .line 2700
    :cond_4e
    iget-object v2, v0, Lc9/a1;->k:Lr3/a;

    .line 2701
    .line 2702
    invoke-virtual {v2}, Lr3/a;->a()V

    .line 2703
    .line 2704
    .line 2705
    iget-object v0, v0, Lc9/a1;->j:Landroidx/lifecycle/e0;

    .line 2706
    .line 2707
    invoke-virtual {v0}, Landroidx/lifecycle/e0;->a()V

    .line 2708
    .line 2709
    .line 2710
    sget-object v0, Lc9/j1;->b:Ljava/util/Map;

    .line 2711
    .line 2712
    invoke-interface {v0, v4}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2713
    .line 2714
    .line 2715
    goto/16 :goto_2

    .line 2716
    .line 2717
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
