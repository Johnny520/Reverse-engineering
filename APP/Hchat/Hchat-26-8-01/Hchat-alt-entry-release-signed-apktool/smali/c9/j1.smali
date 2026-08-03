.class public final Lc9/j1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Lc9/j1;

.field public static final b:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lc9/j1;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lc9/j1;->a:Lc9/j1;

    .line 7
    .line 8
    invoke-static {}, Lp/a;->p()Ljava/util/Map;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sput-object v0, Lc9/j1;->b:Ljava/util/Map;

    .line 13
    .line 14
    return-void
.end method

.method public static final m(Lc9/o2;Landroid/app/Activity;Lfg/a;Lfg/a;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Ljava/util/Set;)V
    .locals 2

    .line 1
    instance-of v0, p0, Lc9/g1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, Lc9/g1;

    .line 7
    .line 8
    iget-object v0, v0, Lc9/g1;->b:Ljava/lang/String;

    .line 9
    .line 10
    invoke-interface {p8, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    :goto_0
    check-cast p8, Ljava/util/Collection;

    .line 20
    .line 21
    invoke-static {p1, p8}, Lc9/o2;->e(Landroid/content/Context;Ljava/util/Collection;)Z

    .line 22
    .line 23
    .line 24
    move-result p8

    .line 25
    if-eqz p8, :cond_1

    .line 26
    .line 27
    const-string v1, "\u804a\u5929\u5206\u7ec4\u5df2\u5220\u9664"

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    const-string v1, "\u5220\u9664\u804a\u5929\u5206\u7ec4\u5931\u8d25"

    .line 31
    .line 32
    :goto_1
    invoke-static {p1, v1}, Lc9/j1;->p(Landroid/app/Activity;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    if-nez p8, :cond_2

    .line 36
    .line 37
    return-void

    .line 38
    :cond_2
    invoke-static {p3}, Lc9/j1;->n(Lfg/a;)V

    .line 39
    .line 40
    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    invoke-interface {p2}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_3
    invoke-static {p1, p0, p4, p5, p6}, Lc9/j1;->o(Landroid/app/Activity;Lc9/o2;Li0/a1;Li0/a1;Li0/a1;)V

    .line 48
    .line 49
    .line 50
    sget-object p0, Lc9/e1;->h:Lc9/e1;

    .line 51
    .line 52
    invoke-interface {p7, p0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public static final n(Lfg/a;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-interface {p0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    goto :goto_0

    .line 6
    :catchall_0
    move-exception p0

    .line 7
    new-instance v0, Lsf/f;

    .line 8
    .line 9
    invoke-direct {v0, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    move-object p0, v0

    .line 13
    :goto_0
    invoke-static {p0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, "[Hchat:ConversationGroup] \u5237\u65b0\u804a\u5929\u5206\u7ec4\u5931\u8d25: "

    .line 24
    .line 25
    invoke-static {v1, v0, p0}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method public static final o(Landroid/app/Activity;Lc9/o2;Li0/a1;Li0/a1;Li0/a1;)V
    .locals 4

    .line 1
    invoke-static {p0}, Lc9/o2;->i(Landroid/content/Context;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p2, p0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Ljava/util/List;

    .line 13
    .line 14
    invoke-static {p1, p0}, Lc9/j1;->s(Lc9/o2;Ljava/util/List;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-interface {p3, p0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-interface {p4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, Ljava/util/Set;

    .line 26
    .line 27
    check-cast p0, Ljava/lang/Iterable;

    .line 28
    .line 29
    new-instance p1, Ljava/util/LinkedHashSet;

    .line 30
    .line 31
    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result p3

    .line 42
    if-eqz p3, :cond_4

    .line 43
    .line 44
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p3

    .line 48
    move-object v0, p3

    .line 49
    check-cast v0, Ljava/lang/String;

    .line 50
    .line 51
    invoke-interface {p2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    check-cast v1, Ljava/util/List;

    .line 56
    .line 57
    const/4 v2, 0x0

    .line 58
    if-eqz v1, :cond_1

    .line 59
    .line 60
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-eqz v3, :cond_1

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_1
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-eqz v3, :cond_3

    .line 76
    .line 77
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    check-cast v3, Lc9/a;

    .line 82
    .line 83
    iget-object v3, v3, Lc9/a;->a:Ljava/lang/String;

    .line 84
    .line 85
    invoke-static {v3, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    if-eqz v3, :cond_2

    .line 90
    .line 91
    const/4 v2, 0x1

    .line 92
    :cond_3
    :goto_1
    if-eqz v2, :cond_0

    .line 93
    .line 94
    invoke-interface {p1, p3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_4
    invoke-interface {p4, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    return-void
.end method

.method public static final p(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static s(Lc9/o2;Ljava/util/List;)Ljava/lang/String;
    .locals 4

    .line 1
    instance-of v0, p0, Lc9/f1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lc9/f1;

    .line 6
    .line 7
    iget-object p0, p0, Lc9/f1;->b:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {p0, p1}, Lc9/o2;->d(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    instance-of v0, p0, Lc9/g1;

    .line 15
    .line 16
    if-eqz v0, :cond_4

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v1, 0x0

    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    move-object v2, v0

    .line 34
    check-cast v2, Lc9/a;

    .line 35
    .line 36
    iget-object v2, v2, Lc9/a;->a:Ljava/lang/String;

    .line 37
    .line 38
    move-object v3, p0

    .line 39
    check-cast v3, Lc9/g1;

    .line 40
    .line 41
    iget-object v3, v3, Lc9/g1;->b:Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {v2, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    move-object v0, v1

    .line 51
    :goto_0
    check-cast v0, Lc9/a;

    .line 52
    .line 53
    if-eqz v0, :cond_3

    .line 54
    .line 55
    iget-object p0, v0, Lc9/a;->c:Ljava/lang/String;

    .line 56
    .line 57
    return-object p0

    .line 58
    :cond_3
    return-object v1

    .line 59
    :cond_4
    invoke-static {}, Lokio/a;->k()V

    .line 60
    .line 61
    .line 62
    const/4 p0, 0x0

    .line 63
    return-object p0
.end method

.method public static t(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 6

    .line 1
    invoke-static {p0}, Lc9/o2;->l(Ljava/util/List;)Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    move-object v2, v1

    .line 25
    check-cast v2, Lc9/a;

    .line 26
    .line 27
    iget-object v2, v2, Lc9/a;->c:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {v0, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    if-nez v3, :cond_0

    .line 34
    .line 35
    new-instance v3, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    :cond_0
    check-cast v3, Ljava/util/List;

    .line 44
    .line 45
    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 52
    .line 53
    .line 54
    new-instance v1, Ljava/util/HashSet;

    .line 55
    .line 56
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 57
    .line 58
    .line 59
    const/4 v4, 0x0

    .line 60
    sget-object v5, Ltf/t;->g:Ltf/t;

    .line 61
    .line 62
    const/4 v3, 0x0

    .line 63
    invoke-static/range {v0 .. v5}, Lc9/j1;->u(Ljava/util/LinkedHashMap;Ljava/util/HashSet;Ljava/util/ArrayList;Ljava/lang/String;ILjava/util/List;)V

    .line 64
    .line 65
    .line 66
    return-object v2
.end method

.method public static final u(Ljava/util/LinkedHashMap;Ljava/util/HashSet;Ljava/util/ArrayList;Ljava/lang/String;ILjava/util/List;)V
    .locals 10

    .line 1
    invoke-virtual {p0, p3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    check-cast p3, Ljava/util/List;

    .line 6
    .line 7
    if-nez p3, :cond_0

    .line 8
    .line 9
    sget-object p3, Ltf/t;->g:Ltf/t;

    .line 10
    .line 11
    :cond_0
    new-instance v0, Lc9/h1;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, v1}, Lc9/h1;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-static {p3, v0}, Ltf/m;->K1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object p3

    .line 21
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p3

    .line 25
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Lc9/a;

    .line 36
    .line 37
    iget-object v1, v0, Lc9/a;->a:Ljava/lang/String;

    .line 38
    .line 39
    iget-object v2, v0, Lc9/a;->b:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {p1, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-nez v1, :cond_1

    .line 46
    .line 47
    move-object v3, p0

    .line 48
    move-object v4, p1

    .line 49
    move-object v5, p2

    .line 50
    goto :goto_1

    .line 51
    :cond_1
    invoke-static {p5, v2}, Ltf/m;->G1(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    new-instance v1, Lc9/c1;

    .line 56
    .line 57
    iget-object v9, v0, Lc9/a;->a:Ljava/lang/String;

    .line 58
    .line 59
    const/4 v7, 0x0

    .line 60
    const/16 v8, 0x3e

    .line 61
    .line 62
    const-string v4, " / "

    .line 63
    .line 64
    const/4 v5, 0x0

    .line 65
    const/4 v6, 0x0

    .line 66
    invoke-static/range {v3 .. v8}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    invoke-direct {v1, p4, v9, v2, v4}, Lc9/c1;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    iget-object v6, v0, Lc9/a;->a:Ljava/lang/String;

    .line 77
    .line 78
    add-int/lit8 v7, p4, 0x1

    .line 79
    .line 80
    move-object v4, p1

    .line 81
    move-object v5, p2

    .line 82
    move-object v8, v3

    .line 83
    move-object v3, p0

    .line 84
    invoke-static/range {v3 .. v8}, Lc9/j1;->u(Ljava/util/LinkedHashMap;Ljava/util/HashSet;Ljava/util/ArrayList;Ljava/lang/String;ILjava/util/List;)V

    .line 85
    .line 86
    .line 87
    :goto_1
    move-object p0, v3

    .line 88
    move-object p1, v4

    .line 89
    move-object p2, v5

    .line 90
    goto :goto_0

    .line 91
    :cond_2
    return-void
.end method

.method public static v(Landroid/app/Activity;Ljava/lang/String;Lfg/a;)V
    .locals 15

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-static/range {p1 .. p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_b

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_b

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    goto/16 :goto_5

    .line 34
    .line 35
    :cond_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-nez v1, :cond_1

    .line 48
    .line 49
    new-instance v1, Lac/l;

    .line 50
    .line 51
    const/4 v3, 0x5

    .line 52
    move-object/from16 v4, p2

    .line 53
    .line 54
    invoke-direct {v1, v3, p0, v4, v0}, Lac/l;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_1
    move-object/from16 v4, p2

    .line 62
    .line 63
    invoke-static {v0}, Lc9/d2;->q(Ljava/lang/String;)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    const/4 v6, 0x0

    .line 68
    const/4 v7, 0x0

    .line 69
    if-nez v1, :cond_2

    .line 70
    .line 71
    new-instance v1, Lc9/f1;

    .line 72
    .line 73
    invoke-direct {v1, v0}, Lc9/f1;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    :goto_0
    move-object v3, v1

    .line 77
    goto :goto_2

    .line 78
    :cond_2
    invoke-static {p0}, Lc9/o2;->i(Landroid/content/Context;)Ljava/util/List;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    if-eqz v3, :cond_4

    .line 91
    .line 92
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    move-object v5, v3

    .line 97
    check-cast v5, Lc9/a;

    .line 98
    .line 99
    iget-object v5, v5, Lc9/a;->a:Ljava/lang/String;

    .line 100
    .line 101
    invoke-static {v5}, Lc9/d2;->F(Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    invoke-virtual {v5, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    if-eqz v5, :cond_3

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_4
    move-object v3, v7

    .line 113
    :goto_1
    check-cast v3, Lc9/a;

    .line 114
    .line 115
    if-nez v3, :cond_5

    .line 116
    .line 117
    const-string v1, "\u804a\u5929\u5206\u7ec4\u4e0d\u5b58\u5728"

    .line 118
    .line 119
    invoke-static {p0, v1, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 124
    .line 125
    .line 126
    move-object v3, v7

    .line 127
    goto :goto_2

    .line 128
    :cond_5
    new-instance v1, Lc9/g1;

    .line 129
    .line 130
    iget-object v3, v3, Lc9/a;->a:Ljava/lang/String;

    .line 131
    .line 132
    invoke-direct {v1, v3}, Lc9/g1;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    goto :goto_0

    .line 136
    :goto_2
    if-eqz v3, :cond_b

    .line 137
    .line 138
    sget-object v8, Lc9/j1;->b:Ljava/util/Map;

    .line 139
    .line 140
    invoke-interface {v8, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    check-cast v1, Lc9/d1;

    .line 145
    .line 146
    if-eqz v1, :cond_6

    .line 147
    .line 148
    invoke-interface {v1}, Lc9/d1;->close()V

    .line 149
    .line 150
    .line 151
    :cond_6
    move-object v2, v0

    .line 152
    new-instance v0, Lc9/k0;

    .line 153
    .line 154
    const/4 v5, 0x1

    .line 155
    move-object v1, p0

    .line 156
    invoke-direct/range {v0 .. v5}, Lc9/k0;-><init>(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 157
    .line 158
    .line 159
    new-instance v9, Ls0/d;

    .line 160
    .line 161
    const v1, 0x50fc293e

    .line 162
    .line 163
    .line 164
    const/4 v10, 0x1

    .line 165
    invoke-direct {v9, v1, v0, v10}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    if-eqz v0, :cond_7

    .line 173
    .line 174
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    goto :goto_3

    .line 179
    :cond_7
    move-object v0, v7

    .line 180
    :goto_3
    instance-of v1, v0, Landroid/view/ViewGroup;

    .line 181
    .line 182
    if-eqz v1, :cond_8

    .line 183
    .line 184
    move-object v7, v0

    .line 185
    check-cast v7, Landroid/view/ViewGroup;

    .line 186
    .line 187
    :cond_8
    move-object v5, v7

    .line 188
    if-eqz v5, :cond_a

    .line 189
    .line 190
    new-instance v1, Lc9/a1;

    .line 191
    .line 192
    const/4 v0, 0x0

    .line 193
    invoke-direct {v1, v0}, Lc9/a1;-><init>(I)V

    .line 194
    .line 195
    .line 196
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 197
    .line 198
    invoke-direct {v0, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 199
    .line 200
    .line 201
    new-instance v4, Landroid/widget/FrameLayout;

    .line 202
    .line 203
    invoke-direct {v4, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v4, v6}, Landroid/view/View;->setBackgroundColor(I)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v4, v10}, Landroid/view/View;->setClickable(Z)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v4, v10}, Landroid/view/View;->setFocusable(Z)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v4, v10}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 216
    .line 217
    .line 218
    new-instance v3, Landroid/view/ViewGroup$LayoutParams;

    .line 219
    .line 220
    const/4 v11, -0x1

    .line 221
    invoke-direct {v3, v11, v11}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v4, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 225
    .line 226
    .line 227
    invoke-static {v5, v1, v1, v1, v1}, Lx6/d;->H(Landroid/view/View;Landroidx/lifecycle/q;Lu3/c;Lc9/a1;Lc9/a1;)V

    .line 228
    .line 229
    .line 230
    invoke-static {v4, v1, v1, v1, v1}, Lx6/d;->H(Landroid/view/View;Landroidx/lifecycle/q;Lu3/c;Lc9/a1;Lc9/a1;)V

    .line 231
    .line 232
    .line 233
    iget-boolean v3, v1, Lc9/a1;->l:Z

    .line 234
    .line 235
    if-nez v3, :cond_9

    .line 236
    .line 237
    iget-object v3, v1, Lc9/a1;->i:Lp4/t;

    .line 238
    .line 239
    sget-object v6, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 240
    .line 241
    invoke-virtual {v3, v6}, Lp4/t;->F(Landroid/os/Bundle;)V

    .line 242
    .line 243
    .line 244
    iput-boolean v10, v1, Lc9/a1;->l:Z

    .line 245
    .line 246
    :cond_9
    iget-object v3, v1, Lc9/a1;->h:Landroidx/lifecycle/s;

    .line 247
    .line 248
    const-string v6, "setCurrentState"

    .line 249
    .line 250
    invoke-virtual {v3, v6}, Landroidx/lifecycle/s;->c(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    sget-object v7, Landroidx/lifecycle/l;->i:Landroidx/lifecycle/l;

    .line 254
    .line 255
    invoke-virtual {v3, v7}, Landroidx/lifecycle/s;->e(Landroidx/lifecycle/l;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v3, v6}, Landroidx/lifecycle/s;->c(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    sget-object v7, Landroidx/lifecycle/l;->j:Landroidx/lifecycle/l;

    .line 262
    .line 263
    invoke-virtual {v3, v7}, Landroidx/lifecycle/s;->e(Landroidx/lifecycle/l;)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v3, v6}, Landroidx/lifecycle/s;->c(Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    sget-object v6, Landroidx/lifecycle/l;->k:Landroidx/lifecycle/l;

    .line 270
    .line 271
    invoke-virtual {v3, v6}, Landroidx/lifecycle/s;->e(Landroidx/lifecycle/l;)V

    .line 272
    .line 273
    .line 274
    new-instance v6, Lgg/u;

    .line 275
    .line 276
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 277
    .line 278
    .line 279
    move-object v3, v1

    .line 280
    move-object v1, v0

    .line 281
    new-instance v0, Lc9/p0;

    .line 282
    .line 283
    const/4 v7, 0x0

    .line 284
    move-object v2, p0

    .line 285
    invoke-direct/range {v0 .. v7}, Lc9/p0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 286
    .line 287
    .line 288
    move-object v12, v4

    .line 289
    move-object v7, v5

    .line 290
    move-object v13, v6

    .line 291
    move-object v6, v1

    .line 292
    new-instance v14, Ly1/c1;

    .line 293
    .line 294
    invoke-direct {v14, p0}, Ly1/c1;-><init>(Landroid/app/Activity;)V

    .line 295
    .line 296
    .line 297
    invoke-static {v14, v3, v3, v3, v3}, Lx6/d;->H(Landroid/view/View;Landroidx/lifecycle/q;Lu3/c;Lc9/a1;Lc9/a1;)V

    .line 298
    .line 299
    .line 300
    sget-object v1, Ly1/r1;->h:Ly1/r1;

    .line 301
    .line 302
    invoke-virtual {v14, v1}, Ly1/a;->setViewCompositionStrategy(Ly1/k2;)V

    .line 303
    .line 304
    .line 305
    move-object v4, v0

    .line 306
    new-instance v0, Lc9/q0;

    .line 307
    .line 308
    const/4 v5, 0x0

    .line 309
    move-object v1, v3

    .line 310
    move-object v3, v9

    .line 311
    invoke-direct/range {v0 .. v5}, Lc9/q0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 312
    .line 313
    .line 314
    move-object v1, v0

    .line 315
    move-object v0, v4

    .line 316
    new-instance v3, Ls0/d;

    .line 317
    .line 318
    const v4, 0x1452d006

    .line 319
    .line 320
    .line 321
    invoke-direct {v3, v4, v1, v10}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {v14, v3}, Ly1/c1;->setContent(Lfg/p;)V

    .line 325
    .line 326
    .line 327
    iput-object v14, v13, Lgg/u;->g:Ljava/lang/Object;

    .line 328
    .line 329
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 330
    .line 331
    invoke-direct {v1, v11, v11}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v12, v14, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 335
    .line 336
    .line 337
    invoke-virtual {v7, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v12}, Landroid/view/View;->requestFocus()Z

    .line 341
    .line 342
    .line 343
    new-instance v1, Lc9/i1;

    .line 344
    .line 345
    invoke-direct {v1, v0, v6}, Lc9/i1;-><init>(Lc9/p0;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    .line 346
    .line 347
    .line 348
    goto :goto_4

    .line 349
    :cond_a
    sget-object v1, Lc9/b1;->a:Lc9/b1;

    .line 350
    .line 351
    :goto_4
    invoke-interface {v1}, Lc9/d1;->a()Z

    .line 352
    .line 353
    .line 354
    move-result v0

    .line 355
    if-eqz v0, :cond_b

    .line 356
    .line 357
    check-cast v8, Ljava/util/Map;

    .line 358
    .line 359
    invoke-interface {v8, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    :cond_b
    :goto_5
    return-void
.end method


# virtual methods
.method public final a(IILfg/a;Li0/h0;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 31

    .line 1
    move/from16 v6, p1

    .line 2
    .line 3
    move-object/from16 v0, p4

    .line 4
    .line 5
    const v1, 0x31fe6e7e

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Li0/h0;->b0(I)Li0/h0;

    .line 9
    .line 10
    .line 11
    and-int/lit8 v1, v6, 0x6

    .line 12
    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    invoke-virtual/range {p4 .. p5}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    const/4 v1, 0x4

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v1, 0x2

    .line 24
    :goto_0
    or-int/2addr v1, v6

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    move v1, v6

    .line 27
    :goto_1
    and-int/lit8 v3, v6, 0x30

    .line 28
    .line 29
    if-nez v3, :cond_3

    .line 30
    .line 31
    move-object/from16 v3, p6

    .line 32
    .line 33
    invoke-virtual {v0, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-eqz v4, :cond_2

    .line 38
    .line 39
    const/16 v4, 0x20

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_2
    const/16 v4, 0x10

    .line 43
    .line 44
    :goto_2
    or-int/2addr v1, v4

    .line 45
    goto :goto_3

    .line 46
    :cond_3
    move-object/from16 v3, p6

    .line 47
    .line 48
    :goto_3
    and-int/lit16 v4, v6, 0x180

    .line 49
    .line 50
    move-object/from16 v11, p3

    .line 51
    .line 52
    if-nez v4, :cond_5

    .line 53
    .line 54
    invoke-virtual {v0, v11}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    if-eqz v4, :cond_4

    .line 59
    .line 60
    const/16 v4, 0x100

    .line 61
    .line 62
    goto :goto_4

    .line 63
    :cond_4
    const/16 v4, 0x80

    .line 64
    .line 65
    :goto_4
    or-int/2addr v1, v4

    .line 66
    :cond_5
    and-int/lit8 v4, p2, 0x8

    .line 67
    .line 68
    if-eqz v4, :cond_7

    .line 69
    .line 70
    or-int/lit16 v1, v1, 0xc00

    .line 71
    .line 72
    :cond_6
    move/from16 v5, p7

    .line 73
    .line 74
    goto :goto_6

    .line 75
    :cond_7
    and-int/lit16 v5, v6, 0xc00

    .line 76
    .line 77
    if-nez v5, :cond_6

    .line 78
    .line 79
    move/from16 v5, p7

    .line 80
    .line 81
    invoke-virtual {v0, v5}, Li0/h0;->g(Z)Z

    .line 82
    .line 83
    .line 84
    move-result v7

    .line 85
    if-eqz v7, :cond_8

    .line 86
    .line 87
    const/16 v7, 0x800

    .line 88
    .line 89
    goto :goto_5

    .line 90
    :cond_8
    const/16 v7, 0x400

    .line 91
    .line 92
    :goto_5
    or-int/2addr v1, v7

    .line 93
    :goto_6
    and-int/lit16 v7, v1, 0x493

    .line 94
    .line 95
    const/16 v8, 0x492

    .line 96
    .line 97
    const/4 v13, 0x0

    .line 98
    const/4 v14, 0x1

    .line 99
    if-eq v7, v8, :cond_9

    .line 100
    .line 101
    move v7, v14

    .line 102
    goto :goto_7

    .line 103
    :cond_9
    move v7, v13

    .line 104
    :goto_7
    and-int/lit8 v8, v1, 0x1

    .line 105
    .line 106
    invoke-virtual {v0, v8, v7}, Li0/h0;->S(IZ)Z

    .line 107
    .line 108
    .line 109
    move-result v7

    .line 110
    if-eqz v7, :cond_10

    .line 111
    .line 112
    if-eqz v4, :cond_a

    .line 113
    .line 114
    move v8, v14

    .line 115
    goto :goto_8

    .line 116
    :cond_a
    move v8, v5

    .line 117
    :goto_8
    sget-object v4, Ly0/l;->a:Ly0/l;

    .line 118
    .line 119
    const/high16 v5, 0x3f800000    # 1.0f

    .line 120
    .line 121
    invoke-static {v4, v5}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 122
    .line 123
    .line 124
    move-result-object v7

    .line 125
    const/16 v9, 0xa

    .line 126
    .line 127
    int-to-float v15, v9

    .line 128
    invoke-static {v15}, Lv/e;->a(F)Lv/d;

    .line 129
    .line 130
    .line 131
    move-result-object v9

    .line 132
    invoke-static {v7, v9}, Lc1/h;->b(Ly0/o;Lf1/r0;)Ly0/o;

    .line 133
    .line 134
    .line 135
    move-result-object v7

    .line 136
    const/4 v10, 0x0

    .line 137
    const/16 v12, 0xe

    .line 138
    .line 139
    const/4 v9, 0x0

    .line 140
    invoke-static/range {v7 .. v12}, Lk/n;->j(Ly0/o;ZLjava/lang/String;Ln/k;Lfg/a;I)Ly0/o;

    .line 141
    .line 142
    .line 143
    move-result-object v7

    .line 144
    move/from16 v30, v8

    .line 145
    .line 146
    const/16 v8, 0xb

    .line 147
    .line 148
    int-to-float v8, v8

    .line 149
    invoke-static {v7, v15, v8}, Lp/d;->m(Ly0/o;FF)Ly0/o;

    .line 150
    .line 151
    .line 152
    move-result-object v7

    .line 153
    sget-object v8, Ly0/b;->q:Ly0/f;

    .line 154
    .line 155
    sget-object v9, Lp/j;->a:Lp/c;

    .line 156
    .line 157
    const/16 v10, 0x30

    .line 158
    .line 159
    invoke-static {v9, v8, v0, v10}, Lp/d1;->a(Lp/g;Ly0/f;Li0/h0;I)Lp/e1;

    .line 160
    .line 161
    .line 162
    move-result-object v8

    .line 163
    iget-wide v9, v0, Li0/h0;->T:J

    .line 164
    .line 165
    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    .line 166
    .line 167
    .line 168
    move-result v9

    .line 169
    invoke-virtual {v0}, Li0/h0;->l()Ls0/h;

    .line 170
    .line 171
    .line 172
    move-result-object v10

    .line 173
    invoke-static {v0, v7}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 174
    .line 175
    .line 176
    move-result-object v7

    .line 177
    sget-object v11, Lx1/g;->f:Lx1/f;

    .line 178
    .line 179
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    sget-object v11, Lx1/f;->b:Lx1/y;

    .line 183
    .line 184
    invoke-virtual {v0}, Li0/h0;->d0()V

    .line 185
    .line 186
    .line 187
    iget-boolean v12, v0, Li0/h0;->S:Z

    .line 188
    .line 189
    if-eqz v12, :cond_b

    .line 190
    .line 191
    invoke-virtual {v0, v11}, Li0/h0;->k(Lfg/a;)V

    .line 192
    .line 193
    .line 194
    goto :goto_9

    .line 195
    :cond_b
    invoke-virtual {v0}, Li0/h0;->n0()V

    .line 196
    .line 197
    .line 198
    :goto_9
    sget-object v12, Lx1/f;->e:Lx1/e;

    .line 199
    .line 200
    invoke-static {v12, v0, v8}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    sget-object v8, Lx1/f;->d:Lx1/e;

    .line 204
    .line 205
    invoke-static {v8, v0, v10}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 209
    .line 210
    .line 211
    move-result-object v9

    .line 212
    sget-object v10, Lx1/f;->f:Lx1/e;

    .line 213
    .line 214
    invoke-static {v10, v0, v9}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    sget-object v9, Lx1/f;->g:Lx1/d;

    .line 218
    .line 219
    invoke-static {v9, v0}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 220
    .line 221
    .line 222
    sget-object v15, Lx1/f;->c:Lx1/e;

    .line 223
    .line 224
    invoke-static {v15, v0, v7}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    float-to-double v2, v5

    .line 228
    const-wide/16 v16, 0x0

    .line 229
    .line 230
    cmpl-double v2, v2, v16

    .line 231
    .line 232
    if-lez v2, :cond_c

    .line 233
    .line 234
    goto :goto_a

    .line 235
    :cond_c
    const-string v2, "invalid weight; must be greater than zero"

    .line 236
    .line 237
    invoke-static {v2}, Lq/a;->a(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    :goto_a
    new-instance v2, Lp/q0;

    .line 241
    .line 242
    invoke-direct {v2, v5, v14}, Lp/q0;-><init>(FZ)V

    .line 243
    .line 244
    .line 245
    sget-object v3, Lp/j;->c:Lp/e;

    .line 246
    .line 247
    sget-object v7, Ly0/b;->s:Ly0/e;

    .line 248
    .line 249
    invoke-static {v3, v7, v0, v13}, Lp/s;->a(Lp/i;Ly0/e;Li0/h0;I)Lp/t;

    .line 250
    .line 251
    .line 252
    move-result-object v3

    .line 253
    iget-wide v5, v0, Li0/h0;->T:J

    .line 254
    .line 255
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 256
    .line 257
    .line 258
    move-result v5

    .line 259
    invoke-virtual {v0}, Li0/h0;->l()Ls0/h;

    .line 260
    .line 261
    .line 262
    move-result-object v6

    .line 263
    invoke-static {v0, v2}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 264
    .line 265
    .line 266
    move-result-object v2

    .line 267
    invoke-virtual {v0}, Li0/h0;->d0()V

    .line 268
    .line 269
    .line 270
    iget-boolean v7, v0, Li0/h0;->S:Z

    .line 271
    .line 272
    if-eqz v7, :cond_d

    .line 273
    .line 274
    invoke-virtual {v0, v11}, Li0/h0;->k(Lfg/a;)V

    .line 275
    .line 276
    .line 277
    goto :goto_b

    .line 278
    :cond_d
    invoke-virtual {v0}, Li0/h0;->n0()V

    .line 279
    .line 280
    .line 281
    :goto_b
    invoke-static {v12, v0, v3}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 282
    .line 283
    .line 284
    invoke-static {v8, v0, v6}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 285
    .line 286
    .line 287
    invoke-static {v5, v0, v10, v0, v9}, Lj8/b;->p(ILi0/h0;Lx1/e;Li0/h0;Lx1/d;)V

    .line 288
    .line 289
    .line 290
    invoke-static {v15, v0, v2}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    if-eqz v30, :cond_e

    .line 294
    .line 295
    const v2, -0x4f2a012

    .line 296
    .line 297
    .line 298
    invoke-virtual {v0, v2}, Li0/h0;->a0(I)V

    .line 299
    .line 300
    .line 301
    sget-object v2, Lbi/d;->a:Li0/m2;

    .line 302
    .line 303
    invoke-virtual {v0, v2}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v2

    .line 307
    check-cast v2, Lbi/b;

    .line 308
    .line 309
    invoke-virtual {v2}, Lbi/b;->g()J

    .line 310
    .line 311
    .line 312
    move-result-wide v2

    .line 313
    invoke-virtual {v0, v13}, Li0/h0;->p(Z)V

    .line 314
    .line 315
    .line 316
    :goto_c
    move-wide v9, v2

    .line 317
    goto :goto_d

    .line 318
    :cond_e
    const v2, -0x4f15066

    .line 319
    .line 320
    .line 321
    invoke-virtual {v0, v2}, Li0/h0;->a0(I)V

    .line 322
    .line 323
    .line 324
    sget-object v2, Lbi/d;->a:Li0/m2;

    .line 325
    .line 326
    invoke-virtual {v0, v2}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v2

    .line 330
    check-cast v2, Lbi/b;

    .line 331
    .line 332
    invoke-virtual {v2}, Lbi/b;->g()J

    .line 333
    .line 334
    .line 335
    move-result-wide v2

    .line 336
    const v5, 0x3ec28f5c    # 0.38f

    .line 337
    .line 338
    .line 339
    invoke-static {v2, v3, v5}, Lf1/w;->b(JF)J

    .line 340
    .line 341
    .line 342
    move-result-wide v2

    .line 343
    invoke-virtual {v0, v13}, Li0/h0;->p(Z)V

    .line 344
    .line 345
    .line 346
    goto :goto_c

    .line 347
    :goto_d
    const/16 v2, 0xf

    .line 348
    .line 349
    invoke-static {v2}, Lx6/d;->D(I)J

    .line 350
    .line 351
    .line 352
    move-result-wide v11

    .line 353
    sget-object v13, Lm2/k;->j:Lm2/k;

    .line 354
    .line 355
    and-int/lit8 v2, v1, 0xe

    .line 356
    .line 357
    const v3, 0x186000

    .line 358
    .line 359
    .line 360
    or-int v27, v2, v3

    .line 361
    .line 362
    const/16 v28, 0x0

    .line 363
    .line 364
    const v29, 0x3ffaa

    .line 365
    .line 366
    .line 367
    const/4 v8, 0x0

    .line 368
    move v2, v14

    .line 369
    const/4 v14, 0x0

    .line 370
    const-wide/16 v15, 0x0

    .line 371
    .line 372
    const/16 v17, 0x0

    .line 373
    .line 374
    const-wide/16 v18, 0x0

    .line 375
    .line 376
    const/16 v20, 0x0

    .line 377
    .line 378
    const/16 v21, 0x0

    .line 379
    .line 380
    const/16 v22, 0x0

    .line 381
    .line 382
    const/16 v23, 0x0

    .line 383
    .line 384
    const/16 v24, 0x0

    .line 385
    .line 386
    const/16 v25, 0x0

    .line 387
    .line 388
    move-object/from16 v7, p5

    .line 389
    .line 390
    move-object/from16 v26, v0

    .line 391
    .line 392
    invoke-static/range {v7 .. v29}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 393
    .line 394
    .line 395
    sget-object v3, Lbi/d;->a:Li0/m2;

    .line 396
    .line 397
    invoke-virtual {v0, v3}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object v3

    .line 401
    check-cast v3, Lbi/b;

    .line 402
    .line 403
    invoke-virtual {v3}, Lbi/b;->h()J

    .line 404
    .line 405
    .line 406
    move-result-wide v5

    .line 407
    if-eqz v30, :cond_f

    .line 408
    .line 409
    const/high16 v3, 0x3f800000    # 1.0f

    .line 410
    .line 411
    goto :goto_e

    .line 412
    :cond_f
    const v3, 0x3ee66666    # 0.45f

    .line 413
    .line 414
    .line 415
    :goto_e
    invoke-static {v5, v6, v3}, Lf1/w;->b(JF)J

    .line 416
    .line 417
    .line 418
    move-result-wide v9

    .line 419
    const/16 v3, 0xc

    .line 420
    .line 421
    invoke-static {v3}, Lx6/d;->D(I)J

    .line 422
    .line 423
    .line 424
    move-result-wide v11

    .line 425
    const/4 v3, 0x2

    .line 426
    int-to-float v3, v3

    .line 427
    const/16 v19, 0x0

    .line 428
    .line 429
    const/16 v20, 0xd

    .line 430
    .line 431
    const/16 v16, 0x0

    .line 432
    .line 433
    const/16 v18, 0x0

    .line 434
    .line 435
    move/from16 v17, v3

    .line 436
    .line 437
    move-object v15, v4

    .line 438
    invoke-static/range {v15 .. v20}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 439
    .line 440
    .line 441
    move-result-object v8

    .line 442
    shr-int/lit8 v1, v1, 0x3

    .line 443
    .line 444
    and-int/lit8 v1, v1, 0xe

    .line 445
    .line 446
    or-int/lit16 v1, v1, 0x6030

    .line 447
    .line 448
    const/16 v28, 0x0

    .line 449
    .line 450
    const v29, 0x3ffe8

    .line 451
    .line 452
    .line 453
    const/4 v13, 0x0

    .line 454
    const/4 v14, 0x0

    .line 455
    const-wide/16 v15, 0x0

    .line 456
    .line 457
    const/16 v17, 0x0

    .line 458
    .line 459
    const-wide/16 v18, 0x0

    .line 460
    .line 461
    const/16 v20, 0x0

    .line 462
    .line 463
    const/16 v21, 0x0

    .line 464
    .line 465
    const/16 v22, 0x0

    .line 466
    .line 467
    const/16 v23, 0x0

    .line 468
    .line 469
    const/16 v24, 0x0

    .line 470
    .line 471
    const/16 v25, 0x0

    .line 472
    .line 473
    move-object/from16 v7, p6

    .line 474
    .line 475
    move-object/from16 v26, v0

    .line 476
    .line 477
    move/from16 v27, v1

    .line 478
    .line 479
    invoke-static/range {v7 .. v29}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 480
    .line 481
    .line 482
    invoke-virtual {v0, v2}, Li0/h0;->p(Z)V

    .line 483
    .line 484
    .line 485
    invoke-virtual {v0, v2}, Li0/h0;->p(Z)V

    .line 486
    .line 487
    .line 488
    move/from16 v5, v30

    .line 489
    .line 490
    goto :goto_f

    .line 491
    :cond_10
    invoke-virtual {v0}, Li0/h0;->V()V

    .line 492
    .line 493
    .line 494
    :goto_f
    invoke-virtual {v0}, Li0/h0;->t()Li0/r1;

    .line 495
    .line 496
    .line 497
    move-result-object v8

    .line 498
    if-eqz v8, :cond_11

    .line 499
    .line 500
    new-instance v0, Lc9/l0;

    .line 501
    .line 502
    move-object/from16 v1, p0

    .line 503
    .line 504
    move/from16 v6, p1

    .line 505
    .line 506
    move/from16 v7, p2

    .line 507
    .line 508
    move-object/from16 v4, p3

    .line 509
    .line 510
    move-object/from16 v2, p5

    .line 511
    .line 512
    move-object/from16 v3, p6

    .line 513
    .line 514
    invoke-direct/range {v0 .. v7}, Lc9/l0;-><init>(Lc9/j1;Ljava/lang/String;Ljava/lang/String;Lfg/a;ZII)V

    .line 515
    .line 516
    .line 517
    iput-object v0, v8, Li0/r1;->d:Lfg/p;

    .line 518
    .line 519
    :cond_11
    return-void
.end method

.method public final b(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lfg/l;Lfg/l;Lfg/a;Lfg/a;Li0/h0;I)V
    .locals 35

    .line 1
    move-object/from16 v4, p3

    .line 2
    .line 3
    move-object/from16 v6, p5

    .line 4
    .line 5
    move-object/from16 v11, p8

    .line 6
    .line 7
    const v0, 0x30e2678a

    .line 8
    .line 9
    .line 10
    invoke-virtual {v11, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 11
    .line 12
    .line 13
    move-object/from16 v2, p1

    .line 14
    .line 15
    invoke-virtual {v11, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v1, 0x4

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    move v0, v1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v0, 0x2

    .line 25
    :goto_0
    or-int v0, p9, v0

    .line 26
    .line 27
    move-object/from16 v12, p2

    .line 28
    .line 29
    invoke-virtual {v11, v12}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eqz v3, :cond_1

    .line 34
    .line 35
    const/16 v3, 0x20

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    const/16 v3, 0x10

    .line 39
    .line 40
    :goto_1
    or-int/2addr v0, v3

    .line 41
    invoke-virtual {v11, v4}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_2

    .line 46
    .line 47
    const/16 v3, 0x100

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    const/16 v3, 0x80

    .line 51
    .line 52
    :goto_2
    or-int/2addr v0, v3

    .line 53
    move-object/from16 v10, p4

    .line 54
    .line 55
    invoke-virtual {v11, v10}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-eqz v3, :cond_3

    .line 60
    .line 61
    const/16 v3, 0x800

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_3
    const/16 v3, 0x400

    .line 65
    .line 66
    :goto_3
    or-int/2addr v0, v3

    .line 67
    invoke-virtual {v11, v6}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-eqz v3, :cond_4

    .line 72
    .line 73
    const/16 v3, 0x4000

    .line 74
    .line 75
    goto :goto_4

    .line 76
    :cond_4
    const/16 v3, 0x2000

    .line 77
    .line 78
    :goto_4
    or-int/2addr v0, v3

    .line 79
    move-object/from16 v3, p6

    .line 80
    .line 81
    invoke-virtual {v11, v3}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v7

    .line 85
    if-eqz v7, :cond_5

    .line 86
    .line 87
    const/high16 v7, 0x20000

    .line 88
    .line 89
    goto :goto_5

    .line 90
    :cond_5
    const/high16 v7, 0x10000

    .line 91
    .line 92
    :goto_5
    or-int/2addr v0, v7

    .line 93
    move-object/from16 v7, p7

    .line 94
    .line 95
    invoke-virtual {v11, v7}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v8

    .line 99
    if-eqz v8, :cond_6

    .line 100
    .line 101
    const/high16 v8, 0x100000

    .line 102
    .line 103
    goto :goto_6

    .line 104
    :cond_6
    const/high16 v8, 0x80000

    .line 105
    .line 106
    :goto_6
    or-int/2addr v0, v8

    .line 107
    const v8, 0x92493

    .line 108
    .line 109
    .line 110
    and-int/2addr v8, v0

    .line 111
    const v9, 0x92492

    .line 112
    .line 113
    .line 114
    const/4 v13, 0x0

    .line 115
    const/4 v14, 0x1

    .line 116
    if-eq v8, v9, :cond_7

    .line 117
    .line 118
    move v8, v14

    .line 119
    goto :goto_7

    .line 120
    :cond_7
    move v8, v13

    .line 121
    :goto_7
    and-int/lit8 v9, v0, 0x1

    .line 122
    .line 123
    invoke-virtual {v11, v9, v8}, Li0/h0;->S(IZ)Z

    .line 124
    .line 125
    .line 126
    move-result v8

    .line 127
    if-eqz v8, :cond_11

    .line 128
    .line 129
    and-int/lit8 v8, v0, 0xe

    .line 130
    .line 131
    if-eq v8, v1, :cond_8

    .line 132
    .line 133
    move v8, v13

    .line 134
    goto :goto_8

    .line 135
    :cond_8
    move v8, v14

    .line 136
    :goto_8
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v9

    .line 140
    sget-object v5, Li0/l;->a:Li0/e;

    .line 141
    .line 142
    if-nez v8, :cond_9

    .line 143
    .line 144
    if-ne v9, v5, :cond_a

    .line 145
    .line 146
    :cond_9
    invoke-static {v2}, Lc9/j1;->t(Ljava/util/List;)Ljava/util/ArrayList;

    .line 147
    .line 148
    .line 149
    move-result-object v9

    .line 150
    invoke-virtual {v11, v9}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    :cond_a
    check-cast v9, Ljava/util/List;

    .line 154
    .line 155
    sget-object v8, Ly0/l;->a:Ly0/l;

    .line 156
    .line 157
    const/high16 v15, 0x3f800000    # 1.0f

    .line 158
    .line 159
    invoke-static {v8, v15}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    const/16 v15, 0x244

    .line 164
    .line 165
    int-to-float v15, v15

    .line 166
    move-object/from16 v17, v9

    .line 167
    .line 168
    const/4 v9, 0x0

    .line 169
    invoke-static {v1, v9, v15, v14}, Lp/h1;->g(Ly0/o;FFI)Ly0/o;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    sget-object v15, Lp/j;->c:Lp/e;

    .line 174
    .line 175
    sget-object v9, Ly0/b;->s:Ly0/e;

    .line 176
    .line 177
    invoke-static {v15, v9, v11, v13}, Lp/s;->a(Lp/i;Ly0/e;Li0/h0;I)Lp/t;

    .line 178
    .line 179
    .line 180
    move-result-object v9

    .line 181
    iget-wide v13, v11, Li0/h0;->T:J

    .line 182
    .line 183
    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    .line 184
    .line 185
    .line 186
    move-result v13

    .line 187
    invoke-virtual {v11}, Li0/h0;->l()Ls0/h;

    .line 188
    .line 189
    .line 190
    move-result-object v14

    .line 191
    invoke-static {v11, v1}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    sget-object v20, Lx1/g;->f:Lx1/f;

    .line 196
    .line 197
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    sget-object v15, Lx1/f;->b:Lx1/y;

    .line 201
    .line 202
    invoke-virtual {v11}, Li0/h0;->d0()V

    .line 203
    .line 204
    .line 205
    iget-boolean v2, v11, Li0/h0;->S:Z

    .line 206
    .line 207
    if-eqz v2, :cond_b

    .line 208
    .line 209
    invoke-virtual {v11, v15}, Li0/h0;->k(Lfg/a;)V

    .line 210
    .line 211
    .line 212
    goto :goto_9

    .line 213
    :cond_b
    invoke-virtual {v11}, Li0/h0;->n0()V

    .line 214
    .line 215
    .line 216
    :goto_9
    sget-object v2, Lx1/f;->e:Lx1/e;

    .line 217
    .line 218
    invoke-static {v2, v11, v9}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    sget-object v2, Lx1/f;->d:Lx1/e;

    .line 222
    .line 223
    invoke-static {v2, v11, v14}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    sget-object v9, Lx1/f;->f:Lx1/e;

    .line 231
    .line 232
    invoke-static {v9, v11, v2}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    sget-object v2, Lx1/f;->g:Lx1/d;

    .line 236
    .line 237
    invoke-static {v2, v11}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 238
    .line 239
    .line 240
    sget-object v2, Lx1/f;->c:Lx1/e;

    .line 241
    .line 242
    invoke-static {v2, v11, v1}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    const-string v1, "\u6dfb\u52a0\u804a\u5929\u5206\u7ec4"

    .line 246
    .line 247
    const/16 v2, 0x36

    .line 248
    .line 249
    sget-object v7, Lc9/j1;->a:Lc9/j1;

    .line 250
    .line 251
    invoke-virtual {v7, v1, v11, v2}, Lc9/j1;->r(Ljava/lang/String;Li0/h0;I)V

    .line 252
    .line 253
    .line 254
    shr-int/lit8 v1, v0, 0x3

    .line 255
    .line 256
    and-int/lit8 v2, v1, 0xe

    .line 257
    .line 258
    or-int/lit16 v2, v2, 0x6030

    .line 259
    .line 260
    and-int/lit16 v1, v1, 0x380

    .line 261
    .line 262
    or-int/2addr v1, v2

    .line 263
    const/16 v9, 0x8

    .line 264
    .line 265
    const-string v13, "\u5206\u7ec4\u540d\u79f0"

    .line 266
    .line 267
    const/4 v14, 0x0

    .line 268
    move-object/from16 v16, v8

    .line 269
    .line 270
    move-object/from16 v2, v17

    .line 271
    .line 272
    const/4 v15, 0x0

    .line 273
    const/16 v17, 0x4

    .line 274
    .line 275
    move v8, v1

    .line 276
    const/4 v1, 0x0

    .line 277
    invoke-virtual/range {v7 .. v14}, Lc9/j1;->g(IILfg/l;Li0/h0;Ljava/lang/String;Ljava/lang/String;Ly0/o;)V

    .line 278
    .line 279
    .line 280
    move-object/from16 v31, v7

    .line 281
    .line 282
    sget-object v7, Lbi/d;->a:Li0/m2;

    .line 283
    .line 284
    invoke-virtual {v11, v7}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v7

    .line 288
    check-cast v7, Lbi/b;

    .line 289
    .line 290
    invoke-virtual {v7}, Lbi/b;->h()J

    .line 291
    .line 292
    .line 293
    move-result-wide v9

    .line 294
    const/16 v7, 0xc

    .line 295
    .line 296
    invoke-static {v7}, Lx6/d;->D(I)J

    .line 297
    .line 298
    .line 299
    move-result-wide v11

    .line 300
    move/from16 v8, v17

    .line 301
    .line 302
    int-to-float v8, v8

    .line 303
    int-to-float v7, v7

    .line 304
    const/16 v19, 0x0

    .line 305
    .line 306
    const/16 v21, 0x4

    .line 307
    .line 308
    move/from16 v20, v8

    .line 309
    .line 310
    move/from16 v18, v7

    .line 311
    .line 312
    move/from16 v17, v8

    .line 313
    .line 314
    invoke-static/range {v16 .. v21}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 315
    .line 316
    .line 317
    move-result-object v8

    .line 318
    const/16 v28, 0x0

    .line 319
    .line 320
    const v29, 0x3ffe8

    .line 321
    .line 322
    .line 323
    const-string v7, "\u4e0a\u7ea7\u5206\u7ec4"

    .line 324
    .line 325
    const/4 v13, 0x0

    .line 326
    move/from16 v18, v15

    .line 327
    .line 328
    move-object/from16 v17, v16

    .line 329
    .line 330
    const-wide/16 v15, 0x0

    .line 331
    .line 332
    move-object/from16 v19, v17

    .line 333
    .line 334
    const/16 v17, 0x0

    .line 335
    .line 336
    move/from16 v20, v18

    .line 337
    .line 338
    move-object/from16 v21, v19

    .line 339
    .line 340
    const-wide/16 v18, 0x0

    .line 341
    .line 342
    move/from16 v24, v20

    .line 343
    .line 344
    const/16 v20, 0x0

    .line 345
    .line 346
    move-object/from16 v25, v21

    .line 347
    .line 348
    const/16 v21, 0x0

    .line 349
    .line 350
    const/16 v26, 0x4000

    .line 351
    .line 352
    const/16 v22, 0x0

    .line 353
    .line 354
    const/high16 v27, 0x3f800000    # 1.0f

    .line 355
    .line 356
    const/16 v23, 0x0

    .line 357
    .line 358
    move/from16 v32, v24

    .line 359
    .line 360
    const/16 v24, 0x0

    .line 361
    .line 362
    move-object/from16 v33, v25

    .line 363
    .line 364
    const/16 v25, 0x0

    .line 365
    .line 366
    move/from16 v34, v27

    .line 367
    .line 368
    const/16 v27, 0x6036

    .line 369
    .line 370
    move-object/from16 v26, p8

    .line 371
    .line 372
    move-object/from16 v3, v33

    .line 373
    .line 374
    move/from16 v1, v34

    .line 375
    .line 376
    invoke-static/range {v7 .. v29}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 377
    .line 378
    .line 379
    move-object/from16 v11, v26

    .line 380
    .line 381
    invoke-static {v3, v1}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 382
    .line 383
    .line 384
    move-result-object v3

    .line 385
    float-to-double v7, v1

    .line 386
    const-wide/16 v9, 0x0

    .line 387
    .line 388
    cmpl-double v7, v7, v9

    .line 389
    .line 390
    if-lez v7, :cond_c

    .line 391
    .line 392
    goto :goto_a

    .line 393
    :cond_c
    const-string v7, "invalid weight; must be greater than zero"

    .line 394
    .line 395
    invoke-static {v7}, Lq/a;->a(Ljava/lang/String;)V

    .line 396
    .line 397
    .line 398
    :goto_a
    new-instance v7, Lp/q0;

    .line 399
    .line 400
    const/4 v15, 0x0

    .line 401
    invoke-direct {v7, v1, v15}, Lp/q0;-><init>(FZ)V

    .line 402
    .line 403
    .line 404
    invoke-interface {v3, v7}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 405
    .line 406
    .line 407
    move-result-object v1

    .line 408
    const/16 v3, 0x118

    .line 409
    .line 410
    int-to-float v3, v3

    .line 411
    const/4 v7, 0x0

    .line 412
    const/4 v8, 0x1

    .line 413
    invoke-static {v1, v7, v3, v8}, Lp/h1;->g(Ly0/o;FFI)Ly0/o;

    .line 414
    .line 415
    .line 416
    move-result-object v7

    .line 417
    and-int/lit16 v1, v0, 0x380

    .line 418
    .line 419
    const/16 v3, 0x100

    .line 420
    .line 421
    if-ne v1, v3, :cond_d

    .line 422
    .line 423
    move v13, v8

    .line 424
    goto :goto_b

    .line 425
    :cond_d
    move v13, v15

    .line 426
    :goto_b
    const v1, 0xe000

    .line 427
    .line 428
    .line 429
    and-int/2addr v1, v0

    .line 430
    const/16 v3, 0x4000

    .line 431
    .line 432
    if-ne v1, v3, :cond_e

    .line 433
    .line 434
    move v15, v8

    .line 435
    :cond_e
    or-int v1, v13, v15

    .line 436
    .line 437
    invoke-virtual {v11, v2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 438
    .line 439
    .line 440
    move-result v3

    .line 441
    or-int/2addr v1, v3

    .line 442
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object v3

    .line 446
    if-nez v1, :cond_f

    .line 447
    .line 448
    if-ne v3, v5, :cond_10

    .line 449
    .line 450
    :cond_f
    new-instance v3, Lc9/y0;

    .line 451
    .line 452
    const/4 v1, 0x0

    .line 453
    invoke-direct {v3, v2, v4, v6, v1}, Lc9/y0;-><init>(Ljava/util/List;Ljava/lang/String;Lfg/l;I)V

    .line 454
    .line 455
    .line 456
    invoke-virtual {v11, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 457
    .line 458
    .line 459
    :cond_10
    move-object v15, v3

    .line 460
    check-cast v15, Lfg/l;

    .line 461
    .line 462
    const/16 v17, 0x0

    .line 463
    .line 464
    const/16 v18, 0x1fe

    .line 465
    .line 466
    move/from16 v30, v8

    .line 467
    .line 468
    const/4 v8, 0x0

    .line 469
    const/4 v9, 0x0

    .line 470
    const/4 v10, 0x0

    .line 471
    const/4 v11, 0x0

    .line 472
    const/4 v12, 0x0

    .line 473
    const/4 v13, 0x0

    .line 474
    const/4 v14, 0x0

    .line 475
    move-object/from16 v16, p8

    .line 476
    .line 477
    move/from16 v1, v30

    .line 478
    .line 479
    invoke-static/range {v7 .. v18}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 480
    .line 481
    .line 482
    shr-int/lit8 v2, v0, 0xc

    .line 483
    .line 484
    and-int/lit8 v2, v2, 0x70

    .line 485
    .line 486
    const v3, 0x30186

    .line 487
    .line 488
    .line 489
    or-int/2addr v2, v3

    .line 490
    shr-int/lit8 v0, v0, 0x9

    .line 491
    .line 492
    and-int/lit16 v0, v0, 0x1c00

    .line 493
    .line 494
    or-int v13, v2, v0

    .line 495
    .line 496
    const/16 v14, 0x10

    .line 497
    .line 498
    const-string v9, "\u6dfb\u52a0"

    .line 499
    .line 500
    const/4 v11, 0x0

    .line 501
    move-object/from16 v8, p6

    .line 502
    .line 503
    move-object/from16 v10, p7

    .line 504
    .line 505
    move-object/from16 v12, p8

    .line 506
    .line 507
    move-object/from16 v7, v31

    .line 508
    .line 509
    invoke-virtual/range {v7 .. v14}, Lc9/j1;->f(Lfg/a;Ljava/lang/String;Lfg/a;ZLi0/h0;II)V

    .line 510
    .line 511
    .line 512
    move-object v11, v12

    .line 513
    invoke-virtual {v11, v1}, Li0/h0;->p(Z)V

    .line 514
    .line 515
    .line 516
    goto :goto_c

    .line 517
    :cond_11
    invoke-virtual {v11}, Li0/h0;->V()V

    .line 518
    .line 519
    .line 520
    :goto_c
    invoke-virtual {v11}, Li0/h0;->t()Li0/r1;

    .line 521
    .line 522
    .line 523
    move-result-object v10

    .line 524
    if-eqz v10, :cond_12

    .line 525
    .line 526
    new-instance v0, Lc9/d0;

    .line 527
    .line 528
    move-object/from16 v1, p0

    .line 529
    .line 530
    move-object/from16 v2, p1

    .line 531
    .line 532
    move-object/from16 v3, p2

    .line 533
    .line 534
    move-object/from16 v5, p4

    .line 535
    .line 536
    move-object/from16 v7, p6

    .line 537
    .line 538
    move-object/from16 v8, p7

    .line 539
    .line 540
    move/from16 v9, p9

    .line 541
    .line 542
    invoke-direct/range {v0 .. v9}, Lc9/d0;-><init>(Lc9/j1;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lfg/l;Lfg/l;Lfg/a;Lfg/a;I)V

    .line 543
    .line 544
    .line 545
    iput-object v0, v10, Li0/r1;->d:Lfg/p;

    .line 546
    .line 547
    :cond_12
    return-void
.end method

.method public final c(Ljava/lang/String;Ljava/lang/String;Lfg/a;Lfg/a;Li0/h0;I)V
    .locals 25

    .line 1
    move-object/from16 v5, p5

    .line 2
    .line 3
    const v0, 0x44293903

    .line 4
    .line 5
    .line 6
    invoke-virtual {v5, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 7
    .line 8
    .line 9
    and-int/lit8 v0, p6, 0x6

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    move-object/from16 v0, p1

    .line 14
    .line 15
    invoke-virtual {v5, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    const/4 v1, 0x4

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v1, 0x2

    .line 24
    :goto_0
    or-int v1, p6, v1

    .line 25
    .line 26
    :goto_1
    move-object/from16 v2, p3

    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_1
    move-object/from16 v0, p1

    .line 30
    .line 31
    move/from16 v1, p6

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :goto_2
    invoke-virtual {v5, v2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_2

    .line 39
    .line 40
    const/16 v3, 0x100

    .line 41
    .line 42
    goto :goto_3

    .line 43
    :cond_2
    const/16 v3, 0x80

    .line 44
    .line 45
    :goto_3
    or-int/2addr v1, v3

    .line 46
    move-object/from16 v3, p4

    .line 47
    .line 48
    invoke-virtual {v5, v3}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-eqz v4, :cond_3

    .line 53
    .line 54
    const/16 v4, 0x800

    .line 55
    .line 56
    goto :goto_4

    .line 57
    :cond_3
    const/16 v4, 0x400

    .line 58
    .line 59
    :goto_4
    or-int/2addr v1, v4

    .line 60
    and-int/lit16 v4, v1, 0x493

    .line 61
    .line 62
    const/16 v6, 0x492

    .line 63
    .line 64
    const/4 v7, 0x0

    .line 65
    const/4 v8, 0x1

    .line 66
    if-eq v4, v6, :cond_4

    .line 67
    .line 68
    move v4, v8

    .line 69
    goto :goto_5

    .line 70
    :cond_4
    move v4, v7

    .line 71
    :goto_5
    and-int/lit8 v6, v1, 0x1

    .line 72
    .line 73
    invoke-virtual {v5, v6, v4}, Li0/h0;->S(IZ)Z

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    if-eqz v4, :cond_6

    .line 78
    .line 79
    sget-object v4, Ly0/l;->a:Ly0/l;

    .line 80
    .line 81
    const/high16 v6, 0x3f800000    # 1.0f

    .line 82
    .line 83
    invoke-static {v4, v6}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 84
    .line 85
    .line 86
    move-result-object v9

    .line 87
    sget-object v10, Lp/j;->c:Lp/e;

    .line 88
    .line 89
    sget-object v11, Ly0/b;->s:Ly0/e;

    .line 90
    .line 91
    invoke-static {v10, v11, v5, v7}, Lp/s;->a(Lp/i;Ly0/e;Li0/h0;I)Lp/t;

    .line 92
    .line 93
    .line 94
    move-result-object v7

    .line 95
    iget-wide v10, v5, Li0/h0;->T:J

    .line 96
    .line 97
    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    .line 98
    .line 99
    .line 100
    move-result v10

    .line 101
    invoke-virtual {v5}, Li0/h0;->l()Ls0/h;

    .line 102
    .line 103
    .line 104
    move-result-object v11

    .line 105
    invoke-static {v5, v9}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 106
    .line 107
    .line 108
    move-result-object v9

    .line 109
    sget-object v12, Lx1/g;->f:Lx1/f;

    .line 110
    .line 111
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    sget-object v12, Lx1/f;->b:Lx1/y;

    .line 115
    .line 116
    invoke-virtual {v5}, Li0/h0;->d0()V

    .line 117
    .line 118
    .line 119
    iget-boolean v13, v5, Li0/h0;->S:Z

    .line 120
    .line 121
    if-eqz v13, :cond_5

    .line 122
    .line 123
    invoke-virtual {v5, v12}, Li0/h0;->k(Lfg/a;)V

    .line 124
    .line 125
    .line 126
    goto :goto_6

    .line 127
    :cond_5
    invoke-virtual {v5}, Li0/h0;->n0()V

    .line 128
    .line 129
    .line 130
    :goto_6
    sget-object v12, Lx1/f;->e:Lx1/e;

    .line 131
    .line 132
    invoke-static {v12, v5, v7}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    sget-object v7, Lx1/f;->d:Lx1/e;

    .line 136
    .line 137
    invoke-static {v7, v5, v11}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 141
    .line 142
    .line 143
    move-result-object v7

    .line 144
    sget-object v10, Lx1/f;->f:Lx1/e;

    .line 145
    .line 146
    invoke-static {v10, v5, v7}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    sget-object v7, Lx1/f;->g:Lx1/d;

    .line 150
    .line 151
    invoke-static {v7, v5}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 152
    .line 153
    .line 154
    sget-object v7, Lx1/f;->c:Lx1/e;

    .line 155
    .line 156
    invoke-static {v7, v5, v9}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    sget-object v7, Lbi/d;->a:Li0/m2;

    .line 160
    .line 161
    invoke-virtual {v5, v7}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v7

    .line 165
    check-cast v7, Lbi/b;

    .line 166
    .line 167
    invoke-virtual {v7}, Lbi/b;->h()J

    .line 168
    .line 169
    .line 170
    move-result-wide v9

    .line 171
    const/16 v7, 0xe

    .line 172
    .line 173
    invoke-static {v7}, Lx6/d;->D(I)J

    .line 174
    .line 175
    .line 176
    move-result-wide v11

    .line 177
    invoke-static {v4, v6}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 178
    .line 179
    .line 180
    move-result-object v4

    .line 181
    const/16 v6, 0x8

    .line 182
    .line 183
    int-to-float v6, v6

    .line 184
    const/4 v7, 0x0

    .line 185
    invoke-static {v4, v7, v6, v8}, Lp/d;->n(Ly0/o;FFI)Ly0/o;

    .line 186
    .line 187
    .line 188
    move-result-object v4

    .line 189
    and-int/lit8 v6, v1, 0xe

    .line 190
    .line 191
    or-int/lit16 v6, v6, 0x6030

    .line 192
    .line 193
    const/16 v21, 0x0

    .line 194
    .line 195
    const v22, 0x3ffe8

    .line 196
    .line 197
    .line 198
    move/from16 v20, v6

    .line 199
    .line 200
    const/4 v6, 0x0

    .line 201
    const/4 v7, 0x0

    .line 202
    move-wide v2, v9

    .line 203
    move v10, v8

    .line 204
    const-wide/16 v8, 0x0

    .line 205
    .line 206
    move v13, v10

    .line 207
    const/4 v10, 0x0

    .line 208
    move v14, v1

    .line 209
    move-object v1, v4

    .line 210
    move-wide v4, v11

    .line 211
    const-wide/16 v11, 0x0

    .line 212
    .line 213
    move v15, v13

    .line 214
    const/4 v13, 0x0

    .line 215
    move/from16 v16, v14

    .line 216
    .line 217
    const/4 v14, 0x0

    .line 218
    move/from16 v17, v15

    .line 219
    .line 220
    const/4 v15, 0x0

    .line 221
    move/from16 v18, v16

    .line 222
    .line 223
    const/16 v16, 0x0

    .line 224
    .line 225
    move/from16 v19, v17

    .line 226
    .line 227
    const/16 v17, 0x0

    .line 228
    .line 229
    move/from16 v23, v18

    .line 230
    .line 231
    const/16 v18, 0x0

    .line 232
    .line 233
    move-object/from16 v19, p5

    .line 234
    .line 235
    move/from16 v24, v23

    .line 236
    .line 237
    invoke-static/range {v0 .. v22}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 238
    .line 239
    .line 240
    move/from16 v14, v24

    .line 241
    .line 242
    shr-int/lit8 v0, v14, 0x3

    .line 243
    .line 244
    and-int/lit8 v0, v0, 0x70

    .line 245
    .line 246
    const v1, 0x30186

    .line 247
    .line 248
    .line 249
    or-int/2addr v0, v1

    .line 250
    and-int/lit16 v1, v14, 0x1c00

    .line 251
    .line 252
    or-int v6, v0, v1

    .line 253
    .line 254
    const/16 v7, 0x10

    .line 255
    .line 256
    sget-object v0, Lc9/j1;->a:Lc9/j1;

    .line 257
    .line 258
    const/4 v4, 0x0

    .line 259
    move-object/from16 v2, p2

    .line 260
    .line 261
    move-object/from16 v1, p3

    .line 262
    .line 263
    move-object/from16 v3, p4

    .line 264
    .line 265
    move-object/from16 v5, p5

    .line 266
    .line 267
    invoke-virtual/range {v0 .. v7}, Lc9/j1;->f(Lfg/a;Ljava/lang/String;Lfg/a;ZLi0/h0;II)V

    .line 268
    .line 269
    .line 270
    const/4 v10, 0x1

    .line 271
    invoke-virtual {v5, v10}, Li0/h0;->p(Z)V

    .line 272
    .line 273
    .line 274
    goto :goto_7

    .line 275
    :cond_6
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 276
    .line 277
    .line 278
    :goto_7
    invoke-virtual {v5}, Li0/h0;->t()Li0/r1;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    if-eqz v0, :cond_7

    .line 283
    .line 284
    new-instance v1, Lc9/c0;

    .line 285
    .line 286
    const/4 v8, 0x0

    .line 287
    move-object/from16 v2, p0

    .line 288
    .line 289
    move-object/from16 v3, p1

    .line 290
    .line 291
    move-object/from16 v4, p2

    .line 292
    .line 293
    move-object/from16 v5, p3

    .line 294
    .line 295
    move-object/from16 v6, p4

    .line 296
    .line 297
    move/from16 v7, p6

    .line 298
    .line 299
    invoke-direct/range {v1 .. v8}, Lc9/c0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 300
    .line 301
    .line 302
    iput-object v1, v0, Li0/r1;->d:Lfg/p;

    .line 303
    .line 304
    :cond_7
    return-void
.end method

.method public final d(Ljava/util/List;Ljava/util/Set;Lfg/l;Lfg/a;Lfg/a;Li0/h0;I)V
    .locals 36

    .line 1
    move-object/from16 v3, p2

    .line 2
    .line 3
    move-object/from16 v4, p3

    .line 4
    .line 5
    move-object/from16 v10, p6

    .line 6
    .line 7
    const v0, 0x220bbcd7

    .line 8
    .line 9
    .line 10
    invoke-virtual {v10, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 11
    .line 12
    .line 13
    move-object/from16 v2, p1

    .line 14
    .line 15
    invoke-virtual {v10, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v1, 0x4

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    move v0, v1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v0, 0x2

    .line 25
    :goto_0
    or-int v0, p7, v0

    .line 26
    .line 27
    invoke-virtual {v10, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    if-eqz v5, :cond_1

    .line 32
    .line 33
    const/16 v5, 0x20

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    const/16 v5, 0x10

    .line 37
    .line 38
    :goto_1
    or-int/2addr v0, v5

    .line 39
    invoke-virtual {v10, v4}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    if-eqz v5, :cond_2

    .line 44
    .line 45
    const/16 v5, 0x100

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_2
    const/16 v5, 0x80

    .line 49
    .line 50
    :goto_2
    or-int/2addr v0, v5

    .line 51
    move-object/from16 v5, p4

    .line 52
    .line 53
    invoke-virtual {v10, v5}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v8

    .line 57
    if-eqz v8, :cond_3

    .line 58
    .line 59
    const/16 v8, 0x800

    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_3
    const/16 v8, 0x400

    .line 63
    .line 64
    :goto_3
    or-int/2addr v0, v8

    .line 65
    move-object/from16 v8, p5

    .line 66
    .line 67
    invoke-virtual {v10, v8}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v9

    .line 71
    if-eqz v9, :cond_4

    .line 72
    .line 73
    const/16 v9, 0x4000

    .line 74
    .line 75
    goto :goto_4

    .line 76
    :cond_4
    const/16 v9, 0x2000

    .line 77
    .line 78
    :goto_4
    or-int/2addr v0, v9

    .line 79
    and-int/lit16 v9, v0, 0x2493

    .line 80
    .line 81
    const/16 v11, 0x2492

    .line 82
    .line 83
    const/4 v12, 0x0

    .line 84
    const/4 v13, 0x1

    .line 85
    if-eq v9, v11, :cond_5

    .line 86
    .line 87
    move v9, v13

    .line 88
    goto :goto_5

    .line 89
    :cond_5
    move v9, v12

    .line 90
    :goto_5
    and-int/lit8 v11, v0, 0x1

    .line 91
    .line 92
    invoke-virtual {v10, v11, v9}, Li0/h0;->S(IZ)Z

    .line 93
    .line 94
    .line 95
    move-result v9

    .line 96
    if-eqz v9, :cond_f

    .line 97
    .line 98
    and-int/lit8 v9, v0, 0xe

    .line 99
    .line 100
    if-eq v9, v1, :cond_6

    .line 101
    .line 102
    move v1, v12

    .line 103
    goto :goto_6

    .line 104
    :cond_6
    move v1, v13

    .line 105
    :goto_6
    invoke-virtual {v10}, Li0/h0;->P()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v9

    .line 109
    sget-object v11, Li0/l;->a:Li0/e;

    .line 110
    .line 111
    if-nez v1, :cond_7

    .line 112
    .line 113
    if-ne v9, v11, :cond_8

    .line 114
    .line 115
    :cond_7
    invoke-static {v2}, Lc9/j1;->t(Ljava/util/List;)Ljava/util/ArrayList;

    .line 116
    .line 117
    .line 118
    move-result-object v9

    .line 119
    invoke-virtual {v10, v9}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    :cond_8
    move-object v1, v9

    .line 123
    check-cast v1, Ljava/util/List;

    .line 124
    .line 125
    sget-object v14, Ly0/l;->a:Ly0/l;

    .line 126
    .line 127
    const/high16 v9, 0x3f800000    # 1.0f

    .line 128
    .line 129
    invoke-static {v14, v9}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 130
    .line 131
    .line 132
    move-result-object v15

    .line 133
    const/16 v6, 0x244

    .line 134
    .line 135
    int-to-float v6, v6

    .line 136
    move-object/from16 v21, v11

    .line 137
    .line 138
    const/4 v11, 0x0

    .line 139
    invoke-static {v15, v11, v6, v13}, Lp/h1;->g(Ly0/o;FFI)Ly0/o;

    .line 140
    .line 141
    .line 142
    move-result-object v6

    .line 143
    sget-object v15, Lp/j;->c:Lp/e;

    .line 144
    .line 145
    sget-object v7, Ly0/b;->s:Ly0/e;

    .line 146
    .line 147
    invoke-static {v15, v7, v10, v12}, Lp/s;->a(Lp/i;Ly0/e;Li0/h0;I)Lp/t;

    .line 148
    .line 149
    .line 150
    move-result-object v7

    .line 151
    iget-wide v11, v10, Li0/h0;->T:J

    .line 152
    .line 153
    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    .line 154
    .line 155
    .line 156
    move-result v11

    .line 157
    invoke-virtual {v10}, Li0/h0;->l()Ls0/h;

    .line 158
    .line 159
    .line 160
    move-result-object v12

    .line 161
    invoke-static {v10, v6}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 162
    .line 163
    .line 164
    move-result-object v6

    .line 165
    sget-object v15, Lx1/g;->f:Lx1/f;

    .line 166
    .line 167
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    sget-object v15, Lx1/f;->b:Lx1/y;

    .line 171
    .line 172
    invoke-virtual {v10}, Li0/h0;->d0()V

    .line 173
    .line 174
    .line 175
    iget-boolean v9, v10, Li0/h0;->S:Z

    .line 176
    .line 177
    if-eqz v9, :cond_9

    .line 178
    .line 179
    invoke-virtual {v10, v15}, Li0/h0;->k(Lfg/a;)V

    .line 180
    .line 181
    .line 182
    goto :goto_7

    .line 183
    :cond_9
    invoke-virtual {v10}, Li0/h0;->n0()V

    .line 184
    .line 185
    .line 186
    :goto_7
    sget-object v9, Lx1/f;->e:Lx1/e;

    .line 187
    .line 188
    invoke-static {v9, v10, v7}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    sget-object v7, Lx1/f;->d:Lx1/e;

    .line 192
    .line 193
    invoke-static {v7, v10, v12}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 197
    .line 198
    .line 199
    move-result-object v7

    .line 200
    sget-object v9, Lx1/f;->f:Lx1/e;

    .line 201
    .line 202
    invoke-static {v9, v10, v7}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    sget-object v7, Lx1/f;->g:Lx1/d;

    .line 206
    .line 207
    invoke-static {v7, v10}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 208
    .line 209
    .line 210
    sget-object v7, Lx1/f;->c:Lx1/e;

    .line 211
    .line 212
    invoke-static {v7, v10, v6}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    const-string v6, "\u5220\u9664\u591a\u4e2a"

    .line 216
    .line 217
    const/16 v7, 0x36

    .line 218
    .line 219
    sget-object v9, Lc9/j1;->a:Lc9/j1;

    .line 220
    .line 221
    invoke-virtual {v9, v6, v10, v7}, Lc9/j1;->r(Ljava/lang/String;Li0/h0;I)V

    .line 222
    .line 223
    .line 224
    invoke-interface {v3}, Ljava/util/Set;->size()I

    .line 225
    .line 226
    .line 227
    move-result v6

    .line 228
    const-string v7, "\u5df2\u9009\u62e9 "

    .line 229
    .line 230
    const-string v11, " \u4e2a\u5206\u7ec4"

    .line 231
    .line 232
    invoke-static {v6, v7, v11}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v6

    .line 236
    sget-object v7, Lbi/d;->a:Li0/m2;

    .line 237
    .line 238
    invoke-virtual {v10, v7}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v7

    .line 242
    check-cast v7, Lbi/b;

    .line 243
    .line 244
    invoke-virtual {v7}, Lbi/b;->h()J

    .line 245
    .line 246
    .line 247
    move-result-wide v11

    .line 248
    const/16 v7, 0xd

    .line 249
    .line 250
    invoke-static {v7}, Lx6/d;->D(I)J

    .line 251
    .line 252
    .line 253
    move-result-wide v26

    .line 254
    const/4 v7, 0x6

    .line 255
    int-to-float v7, v7

    .line 256
    const/16 v19, 0x7

    .line 257
    .line 258
    const/4 v15, 0x0

    .line 259
    const/16 v16, 0x0

    .line 260
    .line 261
    const/16 v17, 0x0

    .line 262
    .line 263
    move/from16 v18, v7

    .line 264
    .line 265
    invoke-static/range {v14 .. v19}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 266
    .line 267
    .line 268
    move-result-object v7

    .line 269
    move-object v15, v9

    .line 270
    move-wide/from16 v9, v26

    .line 271
    .line 272
    const/16 v26, 0x0

    .line 273
    .line 274
    const v27, 0x3ffe8

    .line 275
    .line 276
    .line 277
    move-object v5, v6

    .line 278
    move-object v6, v7

    .line 279
    move-wide v7, v11

    .line 280
    const/4 v11, 0x0

    .line 281
    const/4 v12, 0x0

    .line 282
    move/from16 v16, v13

    .line 283
    .line 284
    move-object/from16 v17, v14

    .line 285
    .line 286
    const-wide/16 v13, 0x0

    .line 287
    .line 288
    move-object/from16 v18, v15

    .line 289
    .line 290
    const/4 v15, 0x0

    .line 291
    move/from16 v19, v16

    .line 292
    .line 293
    move-object/from16 v28, v17

    .line 294
    .line 295
    const-wide/16 v16, 0x0

    .line 296
    .line 297
    move-object/from16 v29, v18

    .line 298
    .line 299
    const/16 v18, 0x0

    .line 300
    .line 301
    move/from16 v30, v19

    .line 302
    .line 303
    const/16 v19, 0x0

    .line 304
    .line 305
    const/16 v31, 0x20

    .line 306
    .line 307
    const/16 v20, 0x0

    .line 308
    .line 309
    move-object/from16 v32, v21

    .line 310
    .line 311
    const/16 v21, 0x0

    .line 312
    .line 313
    const/16 v33, 0x100

    .line 314
    .line 315
    const/16 v22, 0x0

    .line 316
    .line 317
    const/16 v34, 0x0

    .line 318
    .line 319
    const/16 v23, 0x0

    .line 320
    .line 321
    const/high16 v35, 0x3f800000    # 1.0f

    .line 322
    .line 323
    const/16 v25, 0x6030

    .line 324
    .line 325
    move-object/from16 v24, p6

    .line 326
    .line 327
    move-object/from16 v3, v28

    .line 328
    .line 329
    move/from16 v2, v35

    .line 330
    .line 331
    const/4 v4, 0x0

    .line 332
    invoke-static/range {v5 .. v27}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 333
    .line 334
    .line 335
    move-object/from16 v10, v24

    .line 336
    .line 337
    invoke-static {v3, v2}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 338
    .line 339
    .line 340
    move-result-object v3

    .line 341
    float-to-double v5, v2

    .line 342
    const-wide/16 v7, 0x0

    .line 343
    .line 344
    cmpl-double v5, v5, v7

    .line 345
    .line 346
    if-lez v5, :cond_a

    .line 347
    .line 348
    goto :goto_8

    .line 349
    :cond_a
    const-string v5, "invalid weight; must be greater than zero"

    .line 350
    .line 351
    invoke-static {v5}, Lq/a;->a(Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    :goto_8
    new-instance v5, Lp/q0;

    .line 355
    .line 356
    const/4 v6, 0x0

    .line 357
    invoke-direct {v5, v2, v6}, Lp/q0;-><init>(FZ)V

    .line 358
    .line 359
    .line 360
    invoke-interface {v3, v5}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 361
    .line 362
    .line 363
    move-result-object v2

    .line 364
    const/16 v3, 0x17c

    .line 365
    .line 366
    int-to-float v3, v3

    .line 367
    const/4 v5, 0x1

    .line 368
    invoke-static {v2, v4, v3, v5}, Lp/h1;->g(Ly0/o;FFI)Ly0/o;

    .line 369
    .line 370
    .line 371
    move-result-object v2

    .line 372
    invoke-virtual {v10, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 373
    .line 374
    .line 375
    move-result v3

    .line 376
    and-int/lit8 v4, v0, 0x70

    .line 377
    .line 378
    const/16 v5, 0x20

    .line 379
    .line 380
    if-eq v4, v5, :cond_b

    .line 381
    .line 382
    move v12, v6

    .line 383
    goto :goto_9

    .line 384
    :cond_b
    const/4 v12, 0x1

    .line 385
    :goto_9
    or-int/2addr v3, v12

    .line 386
    and-int/lit16 v4, v0, 0x380

    .line 387
    .line 388
    const/16 v5, 0x100

    .line 389
    .line 390
    if-ne v4, v5, :cond_c

    .line 391
    .line 392
    const/4 v12, 0x1

    .line 393
    goto :goto_a

    .line 394
    :cond_c
    move v12, v6

    .line 395
    :goto_a
    or-int/2addr v3, v12

    .line 396
    invoke-virtual {v10}, Li0/h0;->P()Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v4

    .line 400
    if-nez v3, :cond_e

    .line 401
    .line 402
    move-object/from16 v3, v32

    .line 403
    .line 404
    if-ne v4, v3, :cond_d

    .line 405
    .line 406
    goto :goto_b

    .line 407
    :cond_d
    move-object/from16 v5, p2

    .line 408
    .line 409
    move-object/from16 v6, p3

    .line 410
    .line 411
    goto :goto_c

    .line 412
    :cond_e
    :goto_b
    new-instance v4, Lb0/s;

    .line 413
    .line 414
    const/4 v3, 0x4

    .line 415
    move-object/from16 v5, p2

    .line 416
    .line 417
    move-object/from16 v6, p3

    .line 418
    .line 419
    invoke-direct {v4, v1, v5, v6, v3}, Lb0/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 420
    .line 421
    .line 422
    invoke-virtual {v10, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 423
    .line 424
    .line 425
    :goto_c
    move-object v13, v4

    .line 426
    check-cast v13, Lfg/l;

    .line 427
    .line 428
    const/4 v15, 0x0

    .line 429
    const/16 v16, 0x1fe

    .line 430
    .line 431
    const/4 v6, 0x0

    .line 432
    const/4 v7, 0x0

    .line 433
    const/4 v8, 0x0

    .line 434
    const/4 v9, 0x0

    .line 435
    const/4 v10, 0x0

    .line 436
    const/4 v11, 0x0

    .line 437
    const/4 v12, 0x0

    .line 438
    move-object/from16 v14, p6

    .line 439
    .line 440
    move-object v5, v2

    .line 441
    invoke-static/range {v5 .. v16}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 442
    .line 443
    .line 444
    shr-int/lit8 v1, v0, 0x6

    .line 445
    .line 446
    and-int/lit8 v1, v1, 0x70

    .line 447
    .line 448
    const v2, 0x30186

    .line 449
    .line 450
    .line 451
    or-int/2addr v1, v2

    .line 452
    shr-int/lit8 v0, v0, 0x3

    .line 453
    .line 454
    and-int/lit16 v0, v0, 0x1c00

    .line 455
    .line 456
    or-int v11, v1, v0

    .line 457
    .line 458
    const/16 v12, 0x10

    .line 459
    .line 460
    const-string v7, "\u7ee7\u7eed"

    .line 461
    .line 462
    const/4 v9, 0x0

    .line 463
    move-object/from16 v6, p4

    .line 464
    .line 465
    move-object/from16 v8, p5

    .line 466
    .line 467
    move-object/from16 v10, p6

    .line 468
    .line 469
    move-object/from16 v5, v29

    .line 470
    .line 471
    invoke-virtual/range {v5 .. v12}, Lc9/j1;->f(Lfg/a;Ljava/lang/String;Lfg/a;ZLi0/h0;II)V

    .line 472
    .line 473
    .line 474
    const/4 v5, 0x1

    .line 475
    invoke-virtual {v10, v5}, Li0/h0;->p(Z)V

    .line 476
    .line 477
    .line 478
    goto :goto_d

    .line 479
    :cond_f
    invoke-virtual {v10}, Li0/h0;->V()V

    .line 480
    .line 481
    .line 482
    :goto_d
    invoke-virtual {v10}, Li0/h0;->t()Li0/r1;

    .line 483
    .line 484
    .line 485
    move-result-object v9

    .line 486
    if-eqz v9, :cond_10

    .line 487
    .line 488
    new-instance v0, Lc9/z0;

    .line 489
    .line 490
    const/4 v8, 0x0

    .line 491
    move-object/from16 v1, p0

    .line 492
    .line 493
    move-object/from16 v2, p1

    .line 494
    .line 495
    move-object/from16 v3, p2

    .line 496
    .line 497
    move-object/from16 v4, p3

    .line 498
    .line 499
    move-object/from16 v5, p4

    .line 500
    .line 501
    move-object/from16 v6, p5

    .line 502
    .line 503
    move/from16 v7, p7

    .line 504
    .line 505
    invoke-direct/range {v0 .. v8}, Lc9/z0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Set;Ljava/lang/Object;Lfg/a;Lfg/a;II)V

    .line 506
    .line 507
    .line 508
    iput-object v0, v9, Li0/r1;->d:Lfg/p;

    .line 509
    .line 510
    :cond_10
    return-void
.end method

.method public final e(Ljava/lang/String;Lfg/a;Ly0/o;ZLi0/h0;II)V
    .locals 29

    .line 1
    move-object/from16 v4, p3

    .line 2
    .line 3
    move-object/from16 v0, p5

    .line 4
    .line 5
    move/from16 v1, p6

    .line 6
    .line 7
    const v2, -0x1c8e838

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v2}, Li0/h0;->b0(I)Li0/h0;

    .line 11
    .line 12
    .line 13
    and-int/lit8 v2, v1, 0x6

    .line 14
    .line 15
    const/4 v3, 0x2

    .line 16
    if-nez v2, :cond_1

    .line 17
    .line 18
    move-object/from16 v2, p1

    .line 19
    .line 20
    invoke-virtual {v0, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-eqz v5, :cond_0

    .line 25
    .line 26
    const/4 v5, 0x4

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move v5, v3

    .line 29
    :goto_0
    or-int/2addr v5, v1

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move-object/from16 v2, p1

    .line 32
    .line 33
    move v5, v1

    .line 34
    :goto_1
    and-int/lit8 v6, v1, 0x30

    .line 35
    .line 36
    move-object/from16 v11, p2

    .line 37
    .line 38
    if-nez v6, :cond_3

    .line 39
    .line 40
    invoke-virtual {v0, v11}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    if-eqz v6, :cond_2

    .line 45
    .line 46
    const/16 v6, 0x20

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_2
    const/16 v6, 0x10

    .line 50
    .line 51
    :goto_2
    or-int/2addr v5, v6

    .line 52
    :cond_3
    and-int/lit16 v6, v1, 0x180

    .line 53
    .line 54
    if-nez v6, :cond_5

    .line 55
    .line 56
    invoke-virtual {v0, v4}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    if-eqz v6, :cond_4

    .line 61
    .line 62
    const/16 v6, 0x100

    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_4
    const/16 v6, 0x80

    .line 66
    .line 67
    :goto_3
    or-int/2addr v5, v6

    .line 68
    :cond_5
    and-int/lit8 v6, p7, 0x8

    .line 69
    .line 70
    if-eqz v6, :cond_7

    .line 71
    .line 72
    or-int/lit16 v5, v5, 0xc00

    .line 73
    .line 74
    :cond_6
    move/from16 v7, p4

    .line 75
    .line 76
    goto :goto_5

    .line 77
    :cond_7
    and-int/lit16 v7, v1, 0xc00

    .line 78
    .line 79
    if-nez v7, :cond_6

    .line 80
    .line 81
    move/from16 v7, p4

    .line 82
    .line 83
    invoke-virtual {v0, v7}, Li0/h0;->g(Z)Z

    .line 84
    .line 85
    .line 86
    move-result v8

    .line 87
    if-eqz v8, :cond_8

    .line 88
    .line 89
    const/16 v8, 0x800

    .line 90
    .line 91
    goto :goto_4

    .line 92
    :cond_8
    const/16 v8, 0x400

    .line 93
    .line 94
    :goto_4
    or-int/2addr v5, v8

    .line 95
    :goto_5
    and-int/lit16 v8, v5, 0x493

    .line 96
    .line 97
    const/16 v9, 0x492

    .line 98
    .line 99
    const/4 v13, 0x1

    .line 100
    const/4 v14, 0x0

    .line 101
    if-eq v8, v9, :cond_9

    .line 102
    .line 103
    move v8, v13

    .line 104
    goto :goto_6

    .line 105
    :cond_9
    move v8, v14

    .line 106
    :goto_6
    and-int/lit8 v9, v5, 0x1

    .line 107
    .line 108
    invoke-virtual {v0, v9, v8}, Li0/h0;->S(IZ)Z

    .line 109
    .line 110
    .line 111
    move-result v8

    .line 112
    if-eqz v8, :cond_e

    .line 113
    .line 114
    if-eqz v6, :cond_a

    .line 115
    .line 116
    move/from16 v28, v14

    .line 117
    .line 118
    goto :goto_7

    .line 119
    :cond_a
    move/from16 v28, v7

    .line 120
    .line 121
    :goto_7
    const/16 v6, 0x2c

    .line 122
    .line 123
    int-to-float v6, v6

    .line 124
    const/4 v7, 0x0

    .line 125
    invoke-static {v4, v6, v7, v3}, Lp/h1;->g(Ly0/o;FFI)Ly0/o;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    const/16 v6, 0xa

    .line 130
    .line 131
    int-to-float v6, v6

    .line 132
    invoke-static {v6}, Lv/e;->a(F)Lv/d;

    .line 133
    .line 134
    .line 135
    move-result-object v6

    .line 136
    invoke-static {v3, v6}, Lc1/h;->b(Ly0/o;Lf1/r0;)Ly0/o;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    if-eqz v28, :cond_b

    .line 141
    .line 142
    const v6, 0x4d3dc8ec    # 1.9900384E8f

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0, v6}, Li0/h0;->a0(I)V

    .line 146
    .line 147
    .line 148
    sget-object v6, Lbi/d;->a:Li0/m2;

    .line 149
    .line 150
    invoke-virtual {v0, v6}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v6

    .line 154
    check-cast v6, Lbi/b;

    .line 155
    .line 156
    invoke-virtual {v6}, Lbi/b;->j()J

    .line 157
    .line 158
    .line 159
    move-result-wide v6

    .line 160
    invoke-virtual {v0, v14}, Li0/h0;->p(Z)V

    .line 161
    .line 162
    .line 163
    goto :goto_8

    .line 164
    :cond_b
    const v6, 0x4d3f0f83    # 2.0034155E8f

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0, v6}, Li0/h0;->a0(I)V

    .line 168
    .line 169
    .line 170
    sget-object v6, Lbi/d;->a:Li0/m2;

    .line 171
    .line 172
    invoke-virtual {v0, v6}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v6

    .line 176
    check-cast v6, Lbi/b;

    .line 177
    .line 178
    invoke-virtual {v6}, Lbi/b;->k()J

    .line 179
    .line 180
    .line 181
    move-result-wide v6

    .line 182
    invoke-virtual {v0, v14}, Li0/h0;->p(Z)V

    .line 183
    .line 184
    .line 185
    :goto_8
    sget-object v8, Lf1/c0;->b:Lf1/m0;

    .line 186
    .line 187
    invoke-static {v3, v6, v7, v8}, Lk/n;->g(Ly0/o;JLf1/r0;)Ly0/o;

    .line 188
    .line 189
    .line 190
    move-result-object v7

    .line 191
    const/4 v10, 0x0

    .line 192
    const/16 v12, 0xf

    .line 193
    .line 194
    const/4 v8, 0x0

    .line 195
    const/4 v9, 0x0

    .line 196
    invoke-static/range {v7 .. v12}, Lk/n;->j(Ly0/o;ZLjava/lang/String;Ln/k;Lfg/a;I)Ly0/o;

    .line 197
    .line 198
    .line 199
    move-result-object v3

    .line 200
    const/4 v6, 0x6

    .line 201
    int-to-float v6, v6

    .line 202
    const/16 v7, 0x8

    .line 203
    .line 204
    int-to-float v7, v7

    .line 205
    invoke-static {v3, v6, v7}, Lp/d;->m(Ly0/o;FF)Ly0/o;

    .line 206
    .line 207
    .line 208
    move-result-object v3

    .line 209
    sget-object v6, Ly0/b;->k:Ly0/g;

    .line 210
    .line 211
    invoke-static {v6, v14}, Lp/o;->d(Ly0/g;Z)Lv1/n0;

    .line 212
    .line 213
    .line 214
    move-result-object v6

    .line 215
    iget-wide v7, v0, Li0/h0;->T:J

    .line 216
    .line 217
    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    .line 218
    .line 219
    .line 220
    move-result v7

    .line 221
    invoke-virtual {v0}, Li0/h0;->l()Ls0/h;

    .line 222
    .line 223
    .line 224
    move-result-object v8

    .line 225
    invoke-static {v0, v3}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 226
    .line 227
    .line 228
    move-result-object v3

    .line 229
    sget-object v9, Lx1/g;->f:Lx1/f;

    .line 230
    .line 231
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 232
    .line 233
    .line 234
    sget-object v9, Lx1/f;->b:Lx1/y;

    .line 235
    .line 236
    invoke-virtual {v0}, Li0/h0;->d0()V

    .line 237
    .line 238
    .line 239
    iget-boolean v10, v0, Li0/h0;->S:Z

    .line 240
    .line 241
    if-eqz v10, :cond_c

    .line 242
    .line 243
    invoke-virtual {v0, v9}, Li0/h0;->k(Lfg/a;)V

    .line 244
    .line 245
    .line 246
    goto :goto_9

    .line 247
    :cond_c
    invoke-virtual {v0}, Li0/h0;->n0()V

    .line 248
    .line 249
    .line 250
    :goto_9
    sget-object v9, Lx1/f;->e:Lx1/e;

    .line 251
    .line 252
    invoke-static {v9, v0, v6}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    sget-object v6, Lx1/f;->d:Lx1/e;

    .line 256
    .line 257
    invoke-static {v6, v0, v8}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 261
    .line 262
    .line 263
    move-result-object v6

    .line 264
    sget-object v7, Lx1/f;->f:Lx1/e;

    .line 265
    .line 266
    invoke-static {v7, v0, v6}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    sget-object v6, Lx1/f;->g:Lx1/d;

    .line 270
    .line 271
    invoke-static {v6, v0}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 272
    .line 273
    .line 274
    sget-object v6, Lx1/f;->c:Lx1/e;

    .line 275
    .line 276
    invoke-static {v6, v0, v3}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    if-eqz v28, :cond_d

    .line 280
    .line 281
    const v3, 0x1b3f0fe4

    .line 282
    .line 283
    .line 284
    invoke-virtual {v0, v3}, Li0/h0;->a0(I)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v0, v14}, Li0/h0;->p(Z)V

    .line 288
    .line 289
    .line 290
    sget-wide v6, Lf1/w;->c:J

    .line 291
    .line 292
    :goto_a
    move-wide v7, v6

    .line 293
    goto :goto_b

    .line 294
    :cond_d
    const v3, 0x1b405c2c

    .line 295
    .line 296
    .line 297
    invoke-virtual {v0, v3}, Li0/h0;->a0(I)V

    .line 298
    .line 299
    .line 300
    sget-object v3, Lbi/d;->a:Li0/m2;

    .line 301
    .line 302
    invoke-virtual {v0, v3}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v3

    .line 306
    check-cast v3, Lbi/b;

    .line 307
    .line 308
    invoke-virtual {v3}, Lbi/b;->g()J

    .line 309
    .line 310
    .line 311
    move-result-wide v6

    .line 312
    invoke-virtual {v0, v14}, Li0/h0;->p(Z)V

    .line 313
    .line 314
    .line 315
    goto :goto_a

    .line 316
    :goto_b
    const/16 v3, 0xd

    .line 317
    .line 318
    invoke-static {v3}, Lx6/d;->D(I)J

    .line 319
    .line 320
    .line 321
    move-result-wide v9

    .line 322
    sget-object v11, Lm2/k;->j:Lm2/k;

    .line 323
    .line 324
    new-instance v15, Lt2/k;

    .line 325
    .line 326
    const/4 v3, 0x3

    .line 327
    invoke-direct {v15, v3}, Lt2/k;-><init>(I)V

    .line 328
    .line 329
    .line 330
    and-int/lit8 v3, v5, 0xe

    .line 331
    .line 332
    const v5, 0x186000

    .line 333
    .line 334
    .line 335
    or-int v25, v3, v5

    .line 336
    .line 337
    const/16 v26, 0x0

    .line 338
    .line 339
    const v27, 0x3fbaa

    .line 340
    .line 341
    .line 342
    const/4 v6, 0x0

    .line 343
    const/4 v12, 0x0

    .line 344
    move v3, v13

    .line 345
    const-wide/16 v13, 0x0

    .line 346
    .line 347
    const-wide/16 v16, 0x0

    .line 348
    .line 349
    const/16 v18, 0x0

    .line 350
    .line 351
    const/16 v19, 0x0

    .line 352
    .line 353
    const/16 v20, 0x0

    .line 354
    .line 355
    const/16 v21, 0x0

    .line 356
    .line 357
    const/16 v22, 0x0

    .line 358
    .line 359
    const/16 v23, 0x0

    .line 360
    .line 361
    move-object/from16 v24, v0

    .line 362
    .line 363
    move-object v5, v2

    .line 364
    invoke-static/range {v5 .. v27}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 365
    .line 366
    .line 367
    invoke-virtual {v0, v3}, Li0/h0;->p(Z)V

    .line 368
    .line 369
    .line 370
    move/from16 v5, v28

    .line 371
    .line 372
    goto :goto_c

    .line 373
    :cond_e
    invoke-virtual {v0}, Li0/h0;->V()V

    .line 374
    .line 375
    .line 376
    move v5, v7

    .line 377
    :goto_c
    invoke-virtual {v0}, Li0/h0;->t()Li0/r1;

    .line 378
    .line 379
    .line 380
    move-result-object v9

    .line 381
    if-eqz v9, :cond_f

    .line 382
    .line 383
    new-instance v0, Lc9/f0;

    .line 384
    .line 385
    const/4 v8, 0x1

    .line 386
    move-object/from16 v2, p1

    .line 387
    .line 388
    move-object/from16 v3, p2

    .line 389
    .line 390
    move/from16 v7, p7

    .line 391
    .line 392
    move v6, v1

    .line 393
    move-object/from16 v1, p0

    .line 394
    .line 395
    invoke-direct/range {v0 .. v8}, Lc9/f0;-><init>(Ljava/lang/Object;Ljava/lang/String;Lfg/a;Ly0/o;ZIII)V

    .line 396
    .line 397
    .line 398
    iput-object v0, v9, Li0/r1;->d:Lfg/p;

    .line 399
    .line 400
    :cond_f
    return-void
.end method

.method public final f(Lfg/a;Ljava/lang/String;Lfg/a;ZLi0/h0;II)V
    .locals 21

    .line 1
    move-object/from16 v5, p5

    .line 2
    .line 3
    move/from16 v8, p6

    .line 4
    .line 5
    const v0, -0x5882a6b

    .line 6
    .line 7
    .line 8
    invoke-virtual {v5, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 9
    .line 10
    .line 11
    and-int/lit8 v0, v8, 0x6

    .line 12
    .line 13
    const-string v1, "\u53d6\u6d88"

    .line 14
    .line 15
    const/4 v2, 0x4

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {v5, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    move v0, v2

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v0, 0x2

    .line 27
    :goto_0
    or-int/2addr v0, v8

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    move v0, v8

    .line 30
    :goto_1
    and-int/lit8 v3, v8, 0x30

    .line 31
    .line 32
    if-nez v3, :cond_3

    .line 33
    .line 34
    move-object/from16 v3, p1

    .line 35
    .line 36
    invoke-virtual {v5, v3}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-eqz v4, :cond_2

    .line 41
    .line 42
    const/16 v4, 0x20

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_2
    const/16 v4, 0x10

    .line 46
    .line 47
    :goto_2
    or-int/2addr v0, v4

    .line 48
    goto :goto_3

    .line 49
    :cond_3
    move-object/from16 v3, p1

    .line 50
    .line 51
    :goto_3
    and-int/lit16 v4, v8, 0x180

    .line 52
    .line 53
    move-object/from16 v9, p2

    .line 54
    .line 55
    if-nez v4, :cond_5

    .line 56
    .line 57
    invoke-virtual {v5, v9}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    if-eqz v4, :cond_4

    .line 62
    .line 63
    const/16 v4, 0x100

    .line 64
    .line 65
    goto :goto_4

    .line 66
    :cond_4
    const/16 v4, 0x80

    .line 67
    .line 68
    :goto_4
    or-int/2addr v0, v4

    .line 69
    :cond_5
    and-int/lit16 v4, v8, 0xc00

    .line 70
    .line 71
    move-object/from16 v10, p3

    .line 72
    .line 73
    if-nez v4, :cond_7

    .line 74
    .line 75
    invoke-virtual {v5, v10}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    if-eqz v4, :cond_6

    .line 80
    .line 81
    const/16 v4, 0x800

    .line 82
    .line 83
    goto :goto_5

    .line 84
    :cond_6
    const/16 v4, 0x400

    .line 85
    .line 86
    :goto_5
    or-int/2addr v0, v4

    .line 87
    :cond_7
    and-int/lit8 v4, p7, 0x10

    .line 88
    .line 89
    if-eqz v4, :cond_9

    .line 90
    .line 91
    or-int/lit16 v0, v0, 0x6000

    .line 92
    .line 93
    :cond_8
    move/from16 v6, p4

    .line 94
    .line 95
    :goto_6
    move v11, v0

    .line 96
    goto :goto_8

    .line 97
    :cond_9
    and-int/lit16 v6, v8, 0x6000

    .line 98
    .line 99
    if-nez v6, :cond_8

    .line 100
    .line 101
    move/from16 v6, p4

    .line 102
    .line 103
    invoke-virtual {v5, v6}, Li0/h0;->g(Z)Z

    .line 104
    .line 105
    .line 106
    move-result v7

    .line 107
    if-eqz v7, :cond_a

    .line 108
    .line 109
    const/16 v7, 0x4000

    .line 110
    .line 111
    goto :goto_7

    .line 112
    :cond_a
    const/16 v7, 0x2000

    .line 113
    .line 114
    :goto_7
    or-int/2addr v0, v7

    .line 115
    goto :goto_6

    .line 116
    :goto_8
    and-int/lit16 v0, v11, 0x2493

    .line 117
    .line 118
    const/16 v7, 0x2492

    .line 119
    .line 120
    const/4 v12, 0x1

    .line 121
    if-eq v0, v7, :cond_b

    .line 122
    .line 123
    move v0, v12

    .line 124
    goto :goto_9

    .line 125
    :cond_b
    const/4 v0, 0x0

    .line 126
    :goto_9
    and-int/lit8 v7, v11, 0x1

    .line 127
    .line 128
    invoke-virtual {v5, v7, v0}, Li0/h0;->S(IZ)Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-eqz v0, :cond_10

    .line 133
    .line 134
    if-eqz v4, :cond_c

    .line 135
    .line 136
    move v13, v12

    .line 137
    goto :goto_a

    .line 138
    :cond_c
    move v13, v6

    .line 139
    :goto_a
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 140
    .line 141
    const/high16 v14, 0x3f800000    # 1.0f

    .line 142
    .line 143
    invoke-static {v0, v14}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 144
    .line 145
    .line 146
    move-result-object v15

    .line 147
    const/16 v0, 0xa

    .line 148
    .line 149
    int-to-float v0, v0

    .line 150
    int-to-float v2, v2

    .line 151
    const/16 v20, 0x5

    .line 152
    .line 153
    const/16 v16, 0x0

    .line 154
    .line 155
    const/16 v18, 0x0

    .line 156
    .line 157
    move/from16 v17, v0

    .line 158
    .line 159
    move/from16 v19, v2

    .line 160
    .line 161
    invoke-static/range {v15 .. v20}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    const/16 v2, 0x8

    .line 166
    .line 167
    int-to-float v2, v2

    .line 168
    invoke-static {v2}, Lp/j;->g(F)Lp/h;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    sget-object v4, Ly0/b;->p:Ly0/f;

    .line 173
    .line 174
    const/4 v6, 0x6

    .line 175
    invoke-static {v2, v4, v5, v6}, Lp/d1;->a(Lp/g;Ly0/f;Li0/h0;I)Lp/e1;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    iget-wide v6, v5, Li0/h0;->T:J

    .line 180
    .line 181
    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    .line 182
    .line 183
    .line 184
    move-result v4

    .line 185
    invoke-virtual {v5}, Li0/h0;->l()Ls0/h;

    .line 186
    .line 187
    .line 188
    move-result-object v6

    .line 189
    invoke-static {v5, v0}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    sget-object v7, Lx1/g;->f:Lx1/f;

    .line 194
    .line 195
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    sget-object v7, Lx1/f;->b:Lx1/y;

    .line 199
    .line 200
    invoke-virtual {v5}, Li0/h0;->d0()V

    .line 201
    .line 202
    .line 203
    iget-boolean v15, v5, Li0/h0;->S:Z

    .line 204
    .line 205
    if-eqz v15, :cond_d

    .line 206
    .line 207
    invoke-virtual {v5, v7}, Li0/h0;->k(Lfg/a;)V

    .line 208
    .line 209
    .line 210
    goto :goto_b

    .line 211
    :cond_d
    invoke-virtual {v5}, Li0/h0;->n0()V

    .line 212
    .line 213
    .line 214
    :goto_b
    sget-object v7, Lx1/f;->e:Lx1/e;

    .line 215
    .line 216
    invoke-static {v7, v5, v2}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    sget-object v2, Lx1/f;->d:Lx1/e;

    .line 220
    .line 221
    invoke-static {v2, v5, v6}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    sget-object v4, Lx1/f;->f:Lx1/e;

    .line 229
    .line 230
    invoke-static {v4, v5, v2}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    sget-object v2, Lx1/f;->g:Lx1/d;

    .line 234
    .line 235
    invoke-static {v2, v5}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 236
    .line 237
    .line 238
    sget-object v2, Lx1/f;->c:Lx1/e;

    .line 239
    .line 240
    invoke-static {v2, v5, v0}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    float-to-double v6, v14

    .line 244
    const-wide/16 v15, 0x0

    .line 245
    .line 246
    cmpl-double v0, v6, v15

    .line 247
    .line 248
    const-string v17, "invalid weight; must be greater than zero"

    .line 249
    .line 250
    if-lez v0, :cond_e

    .line 251
    .line 252
    goto :goto_c

    .line 253
    :cond_e
    invoke-static/range {v17 .. v17}, Lq/a;->a(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    :goto_c
    new-instance v3, Lp/q0;

    .line 257
    .line 258
    invoke-direct {v3, v14, v12}, Lp/q0;-><init>(FZ)V

    .line 259
    .line 260
    .line 261
    and-int/lit8 v0, v11, 0xe

    .line 262
    .line 263
    or-int/lit16 v0, v0, 0x6000

    .line 264
    .line 265
    and-int/lit8 v2, v11, 0x70

    .line 266
    .line 267
    or-int v6, v0, v2

    .line 268
    .line 269
    const/16 v7, 0x8

    .line 270
    .line 271
    sget-object v0, Lc9/j1;->a:Lc9/j1;

    .line 272
    .line 273
    const/4 v4, 0x0

    .line 274
    move-object/from16 v2, p1

    .line 275
    .line 276
    invoke-virtual/range {v0 .. v7}, Lc9/j1;->e(Ljava/lang/String;Lfg/a;Ly0/o;ZLi0/h0;II)V

    .line 277
    .line 278
    .line 279
    float-to-double v1, v14

    .line 280
    cmpl-double v1, v1, v15

    .line 281
    .line 282
    if-lez v1, :cond_f

    .line 283
    .line 284
    goto :goto_d

    .line 285
    :cond_f
    invoke-static/range {v17 .. v17}, Lq/a;->a(Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    :goto_d
    new-instance v3, Lp/q0;

    .line 289
    .line 290
    invoke-direct {v3, v14, v12}, Lp/q0;-><init>(FZ)V

    .line 291
    .line 292
    .line 293
    shr-int/lit8 v1, v11, 0x6

    .line 294
    .line 295
    and-int/lit8 v2, v1, 0xe

    .line 296
    .line 297
    or-int/lit16 v2, v2, 0x6000

    .line 298
    .line 299
    and-int/lit8 v1, v1, 0x70

    .line 300
    .line 301
    or-int/2addr v1, v2

    .line 302
    shr-int/lit8 v2, v11, 0x3

    .line 303
    .line 304
    and-int/lit16 v2, v2, 0x1c00

    .line 305
    .line 306
    or-int v6, v1, v2

    .line 307
    .line 308
    const/4 v7, 0x0

    .line 309
    move-object/from16 v5, p5

    .line 310
    .line 311
    move-object v1, v9

    .line 312
    move-object v2, v10

    .line 313
    move v4, v13

    .line 314
    invoke-virtual/range {v0 .. v7}, Lc9/j1;->e(Ljava/lang/String;Lfg/a;Ly0/o;ZLi0/h0;II)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v5, v12}, Li0/h0;->p(Z)V

    .line 318
    .line 319
    .line 320
    goto :goto_e

    .line 321
    :cond_10
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 322
    .line 323
    .line 324
    move v4, v6

    .line 325
    :goto_e
    invoke-virtual {v5}, Li0/h0;->t()Li0/r1;

    .line 326
    .line 327
    .line 328
    move-result-object v9

    .line 329
    if-eqz v9, :cond_11

    .line 330
    .line 331
    new-instance v0, Lc9/f0;

    .line 332
    .line 333
    move-object/from16 v1, p0

    .line 334
    .line 335
    move-object/from16 v2, p1

    .line 336
    .line 337
    move-object/from16 v3, p2

    .line 338
    .line 339
    move/from16 v7, p7

    .line 340
    .line 341
    move v5, v4

    .line 342
    move v6, v8

    .line 343
    move-object/from16 v4, p3

    .line 344
    .line 345
    invoke-direct/range {v0 .. v7}, Lc9/f0;-><init>(Lc9/j1;Lfg/a;Ljava/lang/String;Lfg/a;ZII)V

    .line 346
    .line 347
    .line 348
    iput-object v0, v9, Li0/r1;->d:Lfg/p;

    .line 349
    .line 350
    :cond_11
    return-void
.end method

.method public final g(IILfg/l;Li0/h0;Ljava/lang/String;Ljava/lang/String;Ly0/o;)V
    .locals 25

    .line 1
    move/from16 v6, p1

    .line 2
    .line 3
    move-object/from16 v0, p4

    .line 4
    .line 5
    move-object/from16 v3, p6

    .line 6
    .line 7
    const v1, 0x518ce42

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Li0/h0;->b0(I)Li0/h0;

    .line 11
    .line 12
    .line 13
    and-int/lit8 v1, v6, 0x6

    .line 14
    .line 15
    if-nez v1, :cond_1

    .line 16
    .line 17
    invoke-virtual/range {p4 .. p5}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    const/4 v1, 0x4

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v1, 0x2

    .line 26
    :goto_0
    or-int/2addr v1, v6

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move v1, v6

    .line 29
    :goto_1
    and-int/lit8 v2, v6, 0x30

    .line 30
    .line 31
    if-nez v2, :cond_3

    .line 32
    .line 33
    invoke-virtual {v0, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    const/16 v2, 0x20

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_2
    const/16 v2, 0x10

    .line 43
    .line 44
    :goto_2
    or-int/2addr v1, v2

    .line 45
    :cond_3
    and-int/lit16 v2, v6, 0x180

    .line 46
    .line 47
    move-object/from16 v8, p3

    .line 48
    .line 49
    if-nez v2, :cond_5

    .line 50
    .line 51
    invoke-virtual {v0, v8}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_4

    .line 56
    .line 57
    const/16 v2, 0x100

    .line 58
    .line 59
    goto :goto_3

    .line 60
    :cond_4
    const/16 v2, 0x80

    .line 61
    .line 62
    :goto_3
    or-int/2addr v1, v2

    .line 63
    :cond_5
    and-int/lit8 v2, p2, 0x8

    .line 64
    .line 65
    if-eqz v2, :cond_7

    .line 66
    .line 67
    or-int/lit16 v1, v1, 0xc00

    .line 68
    .line 69
    :cond_6
    move-object/from16 v4, p7

    .line 70
    .line 71
    goto :goto_5

    .line 72
    :cond_7
    and-int/lit16 v4, v6, 0xc00

    .line 73
    .line 74
    if-nez v4, :cond_6

    .line 75
    .line 76
    move-object/from16 v4, p7

    .line 77
    .line 78
    invoke-virtual {v0, v4}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    if-eqz v5, :cond_8

    .line 83
    .line 84
    const/16 v5, 0x800

    .line 85
    .line 86
    goto :goto_4

    .line 87
    :cond_8
    const/16 v5, 0x400

    .line 88
    .line 89
    :goto_4
    or-int/2addr v1, v5

    .line 90
    :goto_5
    and-int/lit16 v5, v1, 0x493

    .line 91
    .line 92
    const/16 v7, 0x492

    .line 93
    .line 94
    if-eq v5, v7, :cond_9

    .line 95
    .line 96
    const/4 v5, 0x1

    .line 97
    goto :goto_6

    .line 98
    :cond_9
    const/4 v5, 0x0

    .line 99
    :goto_6
    and-int/lit8 v7, v1, 0x1

    .line 100
    .line 101
    invoke-virtual {v0, v7, v5}, Li0/h0;->S(IZ)Z

    .line 102
    .line 103
    .line 104
    move-result v5

    .line 105
    if-eqz v5, :cond_b

    .line 106
    .line 107
    if-eqz v2, :cond_a

    .line 108
    .line 109
    sget-object v2, Ly0/l;->a:Ly0/l;

    .line 110
    .line 111
    goto :goto_7

    .line 112
    :cond_a
    move-object v2, v4

    .line 113
    :goto_7
    new-instance v9, Li2/n0;

    .line 114
    .line 115
    sget-object v4, Lbi/d;->a:Li0/m2;

    .line 116
    .line 117
    invoke-virtual {v0, v4}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    check-cast v5, Lbi/b;

    .line 122
    .line 123
    invoke-virtual {v5}, Lbi/b;->g()J

    .line 124
    .line 125
    .line 126
    move-result-wide v10

    .line 127
    const/16 v5, 0xf

    .line 128
    .line 129
    invoke-static {v5}, Lx6/d;->D(I)J

    .line 130
    .line 131
    .line 132
    move-result-wide v12

    .line 133
    const-wide/16 v18, 0x0

    .line 134
    .line 135
    const v20, 0xfffffc

    .line 136
    .line 137
    .line 138
    const/4 v14, 0x0

    .line 139
    const-wide/16 v15, 0x0

    .line 140
    .line 141
    const/16 v17, 0x0

    .line 142
    .line 143
    invoke-direct/range {v9 .. v20}, Li2/n0;-><init>(JJLm2/k;JIJI)V

    .line 144
    .line 145
    .line 146
    new-instance v5, Lf1/t0;

    .line 147
    .line 148
    invoke-virtual {v0, v4}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v7

    .line 152
    check-cast v7, Lbi/b;

    .line 153
    .line 154
    invoke-virtual {v7}, Lbi/b;->j()J

    .line 155
    .line 156
    .line 157
    move-result-wide v10

    .line 158
    invoke-direct {v5, v10, v11}, Lf1/t0;-><init>(J)V

    .line 159
    .line 160
    .line 161
    const/high16 v7, 0x3f800000    # 1.0f

    .line 162
    .line 163
    invoke-static {v2, v7}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 164
    .line 165
    .line 166
    move-result-object v7

    .line 167
    const/16 v10, 0xa

    .line 168
    .line 169
    int-to-float v10, v10

    .line 170
    invoke-static {v10}, Lv/e;->a(F)Lv/d;

    .line 171
    .line 172
    .line 173
    move-result-object v10

    .line 174
    invoke-static {v7, v10}, Lc1/h;->b(Ly0/o;Lf1/r0;)Ly0/o;

    .line 175
    .line 176
    .line 177
    move-result-object v7

    .line 178
    invoke-virtual {v0, v4}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v4

    .line 182
    check-cast v4, Lbi/b;

    .line 183
    .line 184
    invoke-virtual {v4}, Lbi/b;->k()J

    .line 185
    .line 186
    .line 187
    move-result-wide v10

    .line 188
    sget-object v4, Lf1/c0;->b:Lf1/m0;

    .line 189
    .line 190
    invoke-static {v7, v10, v11, v4}, Lk/n;->g(Ly0/o;JLf1/r0;)Ly0/o;

    .line 191
    .line 192
    .line 193
    move-result-object v4

    .line 194
    const/16 v7, 0xc

    .line 195
    .line 196
    int-to-float v7, v7

    .line 197
    const/16 v10, 0xb

    .line 198
    .line 199
    int-to-float v10, v10

    .line 200
    invoke-static {v4, v7, v10}, Lp/d;->m(Ly0/o;FF)Ly0/o;

    .line 201
    .line 202
    .line 203
    move-result-object v4

    .line 204
    new-instance v7, Lc9/i0;

    .line 205
    .line 206
    const/4 v10, 0x0

    .line 207
    move-object/from16 v11, p5

    .line 208
    .line 209
    invoke-direct {v7, v10, v11, v3}, Lc9/i0;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    const v10, 0x1ef0f8ff

    .line 213
    .line 214
    .line 215
    invoke-static {v10, v7, v0}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 216
    .line 217
    .line 218
    move-result-object v20

    .line 219
    and-int/lit8 v7, v1, 0xe

    .line 220
    .line 221
    const/high16 v10, 0x6000000

    .line 222
    .line 223
    or-int/2addr v7, v10

    .line 224
    shr-int/lit8 v1, v1, 0x3

    .line 225
    .line 226
    and-int/lit8 v1, v1, 0x70

    .line 227
    .line 228
    or-int v22, v7, v1

    .line 229
    .line 230
    const/high16 v23, 0x30000

    .line 231
    .line 232
    const/16 v24, 0x3ed8

    .line 233
    .line 234
    const/4 v10, 0x0

    .line 235
    const/4 v12, 0x0

    .line 236
    const/4 v13, 0x0

    .line 237
    const/4 v14, 0x1

    .line 238
    const/4 v15, 0x0

    .line 239
    const/16 v16, 0x0

    .line 240
    .line 241
    const/16 v17, 0x0

    .line 242
    .line 243
    const/16 v18, 0x0

    .line 244
    .line 245
    move-object/from16 v21, v0

    .line 246
    .line 247
    move-object/from16 v19, v5

    .line 248
    .line 249
    move-object v7, v11

    .line 250
    move-object v11, v9

    .line 251
    move-object v9, v4

    .line 252
    invoke-static/range {v7 .. v24}, Lw/i;->a(Ljava/lang/String;Lfg/l;Ly0/o;ZLi2/n0;Lw/p0;Lw/o0;ZIILj8/o;Lfg/l;Lf1/s;Lfg/q;Li0/h0;III)V

    .line 253
    .line 254
    .line 255
    move-object v5, v2

    .line 256
    goto :goto_8

    .line 257
    :cond_b
    invoke-virtual/range {p4 .. p4}, Li0/h0;->V()V

    .line 258
    .line 259
    .line 260
    move-object v5, v4

    .line 261
    :goto_8
    invoke-virtual/range {p4 .. p4}, Li0/h0;->t()Li0/r1;

    .line 262
    .line 263
    .line 264
    move-result-object v8

    .line 265
    if-eqz v8, :cond_c

    .line 266
    .line 267
    new-instance v0, Lc9/j0;

    .line 268
    .line 269
    move-object/from16 v1, p0

    .line 270
    .line 271
    move/from16 v7, p2

    .line 272
    .line 273
    move-object/from16 v4, p3

    .line 274
    .line 275
    move-object/from16 v2, p5

    .line 276
    .line 277
    invoke-direct/range {v0 .. v7}, Lc9/j0;-><init>(Lc9/j1;Ljava/lang/String;Ljava/lang/String;Lfg/l;Ly0/o;II)V

    .line 278
    .line 279
    .line 280
    iput-object v0, v8, Li0/r1;->d:Lfg/p;

    .line 281
    .line 282
    :cond_c
    return-void
.end method

.method public final h(Landroid/content/Context;Ls0/d;Li0/h0;I)V
    .locals 7

    .line 1
    const v0, -0x54e1e919

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x4

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x2

    .line 16
    :goto_0
    or-int/2addr v0, p4

    .line 17
    and-int/lit8 v1, v0, 0x13

    .line 18
    .line 19
    const/16 v2, 0x12

    .line 20
    .line 21
    const/4 v3, 0x1

    .line 22
    if-eq v1, v2, :cond_1

    .line 23
    .line 24
    move v1, v3

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    const/4 v1, 0x0

    .line 27
    :goto_1
    and-int/2addr v0, v3

    .line 28
    invoke-virtual {p3, v0, v1}, Li0/h0;->S(IZ)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iget v0, v0, Landroid/content/res/Configuration;->uiMode:I

    .line 43
    .line 44
    and-int/lit8 v0, v0, 0x30

    .line 45
    .line 46
    const/16 v1, 0x20

    .line 47
    .line 48
    if-ne v0, v1, :cond_2

    .line 49
    .line 50
    invoke-static {}, Lbi/d;->a()Lbi/b;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    goto :goto_2

    .line 55
    :cond_2
    invoke-static {}, Lbi/d;->b()Lbi/b;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    :goto_2
    const/4 v2, 0x0

    .line 60
    const/16 v5, 0xc00

    .line 61
    .line 62
    const/4 v1, 0x0

    .line 63
    move-object v3, p2

    .line 64
    move-object v4, p3

    .line 65
    invoke-static/range {v0 .. v5}, Lig/a;->b(Lbi/b;Lbi/l;ZLs0/d;Li0/h0;I)V

    .line 66
    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_3
    invoke-virtual {p3}, Li0/h0;->V()V

    .line 70
    .line 71
    .line 72
    :goto_3
    invoke-virtual {p3}, Li0/h0;->t()Li0/r1;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    if-eqz v0, :cond_4

    .line 77
    .line 78
    new-instance v1, Lb0/k;

    .line 79
    .line 80
    const/4 v6, 0x2

    .line 81
    move-object v2, p0

    .line 82
    move-object v3, p1

    .line 83
    move-object v4, p2

    .line 84
    move v5, p4

    .line 85
    invoke-direct/range {v1 .. v6}, Lb0/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lsf/b;II)V

    .line 86
    .line 87
    .line 88
    iput-object v1, v0, Li0/r1;->d:Lfg/p;

    .line 89
    .line 90
    :cond_4
    return-void
.end method

.method public final i(IILfg/a;Li0/h0;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 34

    .line 1
    move/from16 v4, p1

    .line 2
    .line 3
    move/from16 v7, p2

    .line 4
    .line 5
    move-object/from16 v12, p4

    .line 6
    .line 7
    move-object/from16 v3, p6

    .line 8
    .line 9
    move/from16 v5, p7

    .line 10
    .line 11
    const v0, 0x5c27069

    .line 12
    .line 13
    .line 14
    invoke-virtual {v12, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 15
    .line 16
    .line 17
    and-int/lit8 v0, v7, 0x6

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    invoke-virtual/range {p4 .. p5}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    const/4 v0, 0x4

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v0, 0x2

    .line 30
    :goto_0
    or-int/2addr v0, v7

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move v0, v7

    .line 33
    :goto_1
    and-int/lit8 v1, v7, 0x30

    .line 34
    .line 35
    if-nez v1, :cond_3

    .line 36
    .line 37
    invoke-virtual {v12, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    const/16 v1, 0x20

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_2
    const/16 v1, 0x10

    .line 47
    .line 48
    :goto_2
    or-int/2addr v0, v1

    .line 49
    :cond_3
    and-int/lit16 v1, v7, 0x180

    .line 50
    .line 51
    if-nez v1, :cond_5

    .line 52
    .line 53
    invoke-virtual {v12, v4}, Li0/h0;->d(I)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_4

    .line 58
    .line 59
    const/16 v1, 0x100

    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_4
    const/16 v1, 0x80

    .line 63
    .line 64
    :goto_3
    or-int/2addr v0, v1

    .line 65
    :cond_5
    invoke-virtual {v12, v5}, Li0/h0;->g(Z)Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_6

    .line 70
    .line 71
    const/16 v1, 0x800

    .line 72
    .line 73
    goto :goto_4

    .line 74
    :cond_6
    const/16 v1, 0x400

    .line 75
    .line 76
    :goto_4
    or-int/2addr v0, v1

    .line 77
    move-object/from16 v6, p3

    .line 78
    .line 79
    invoke-virtual {v12, v6}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-eqz v1, :cond_7

    .line 84
    .line 85
    const/16 v1, 0x4000

    .line 86
    .line 87
    goto :goto_5

    .line 88
    :cond_7
    const/16 v1, 0x2000

    .line 89
    .line 90
    :goto_5
    or-int/2addr v0, v1

    .line 91
    and-int/lit16 v1, v0, 0x2493

    .line 92
    .line 93
    const/16 v2, 0x2492

    .line 94
    .line 95
    if-eq v1, v2, :cond_8

    .line 96
    .line 97
    const/4 v1, 0x1

    .line 98
    goto :goto_6

    .line 99
    :cond_8
    const/4 v1, 0x0

    .line 100
    :goto_6
    and-int/lit8 v2, v0, 0x1

    .line 101
    .line 102
    invoke-virtual {v12, v2, v1}, Li0/h0;->S(IZ)Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    if-eqz v1, :cond_f

    .line 107
    .line 108
    sget-object v1, Ly0/l;->a:Ly0/l;

    .line 109
    .line 110
    const/high16 v2, 0x3f800000    # 1.0f

    .line 111
    .line 112
    invoke-static {v1, v2}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 113
    .line 114
    .line 115
    move-result-object v10

    .line 116
    const/16 v11, 0xa

    .line 117
    .line 118
    int-to-float v13, v11

    .line 119
    invoke-static {v13}, Lv/e;->a(F)Lv/d;

    .line 120
    .line 121
    .line 122
    move-result-object v14

    .line 123
    invoke-static {v10, v14}, Lc1/h;->b(Ly0/o;Lf1/r0;)Ly0/o;

    .line 124
    .line 125
    .line 126
    move-result-object v10

    .line 127
    const/16 v16, 0x0

    .line 128
    .line 129
    const/16 v18, 0xf

    .line 130
    .line 131
    const/4 v14, 0x0

    .line 132
    const/4 v15, 0x0

    .line 133
    move-object/from16 v17, v6

    .line 134
    .line 135
    move v6, v13

    .line 136
    move-object v13, v10

    .line 137
    invoke-static/range {v13 .. v18}, Lk/n;->j(Ly0/o;ZLjava/lang/String;Ln/k;Lfg/a;I)Ly0/o;

    .line 138
    .line 139
    .line 140
    move-result-object v10

    .line 141
    const/4 v13, 0x6

    .line 142
    if-le v4, v13, :cond_9

    .line 143
    .line 144
    goto :goto_7

    .line 145
    :cond_9
    move v13, v4

    .line 146
    :goto_7
    mul-int/lit8 v13, v13, 0xe

    .line 147
    .line 148
    add-int/2addr v13, v11

    .line 149
    int-to-float v11, v13

    .line 150
    invoke-static {v10, v11, v6, v6, v6}, Lp/d;->o(Ly0/o;FFFF)Ly0/o;

    .line 151
    .line 152
    .line 153
    move-result-object v6

    .line 154
    sget-object v10, Ly0/b;->q:Ly0/f;

    .line 155
    .line 156
    sget-object v11, Lp/j;->a:Lp/c;

    .line 157
    .line 158
    const/16 v13, 0x30

    .line 159
    .line 160
    invoke-static {v11, v10, v12, v13}, Lp/d1;->a(Lp/g;Ly0/f;Li0/h0;I)Lp/e1;

    .line 161
    .line 162
    .line 163
    move-result-object v10

    .line 164
    iget-wide v13, v12, Li0/h0;->T:J

    .line 165
    .line 166
    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    .line 167
    .line 168
    .line 169
    move-result v11

    .line 170
    invoke-virtual {v12}, Li0/h0;->l()Ls0/h;

    .line 171
    .line 172
    .line 173
    move-result-object v13

    .line 174
    invoke-static {v12, v6}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 175
    .line 176
    .line 177
    move-result-object v6

    .line 178
    sget-object v14, Lx1/g;->f:Lx1/f;

    .line 179
    .line 180
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    sget-object v14, Lx1/f;->b:Lx1/y;

    .line 184
    .line 185
    invoke-virtual {v12}, Li0/h0;->d0()V

    .line 186
    .line 187
    .line 188
    iget-boolean v15, v12, Li0/h0;->S:Z

    .line 189
    .line 190
    if-eqz v15, :cond_a

    .line 191
    .line 192
    invoke-virtual {v12, v14}, Li0/h0;->k(Lfg/a;)V

    .line 193
    .line 194
    .line 195
    goto :goto_8

    .line 196
    :cond_a
    invoke-virtual {v12}, Li0/h0;->n0()V

    .line 197
    .line 198
    .line 199
    :goto_8
    sget-object v15, Lx1/f;->e:Lx1/e;

    .line 200
    .line 201
    invoke-static {v15, v12, v10}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    sget-object v10, Lx1/f;->d:Lx1/e;

    .line 205
    .line 206
    invoke-static {v10, v12, v13}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 210
    .line 211
    .line 212
    move-result-object v11

    .line 213
    sget-object v13, Lx1/f;->f:Lx1/e;

    .line 214
    .line 215
    invoke-static {v13, v12, v11}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    sget-object v11, Lx1/f;->g:Lx1/d;

    .line 219
    .line 220
    invoke-static {v11, v12}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 221
    .line 222
    .line 223
    sget-object v8, Lx1/f;->c:Lx1/e;

    .line 224
    .line 225
    invoke-static {v8, v12, v6}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    move-object/from16 v17, v10

    .line 229
    .line 230
    float-to-double v9, v2

    .line 231
    const-wide/16 v18, 0x0

    .line 232
    .line 233
    cmpl-double v9, v9, v18

    .line 234
    .line 235
    if-lez v9, :cond_b

    .line 236
    .line 237
    goto :goto_9

    .line 238
    :cond_b
    const-string v9, "invalid weight; must be greater than zero"

    .line 239
    .line 240
    invoke-static {v9}, Lq/a;->a(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    :goto_9
    new-instance v9, Lp/q0;

    .line 244
    .line 245
    const/4 v6, 0x1

    .line 246
    invoke-direct {v9, v2, v6}, Lp/q0;-><init>(FZ)V

    .line 247
    .line 248
    .line 249
    sget-object v2, Lp/j;->c:Lp/e;

    .line 250
    .line 251
    sget-object v10, Ly0/b;->s:Ly0/e;

    .line 252
    .line 253
    const/4 v6, 0x0

    .line 254
    invoke-static {v2, v10, v12, v6}, Lp/s;->a(Lp/i;Ly0/e;Li0/h0;I)Lp/t;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    iget-wide v6, v12, Li0/h0;->T:J

    .line 259
    .line 260
    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    .line 261
    .line 262
    .line 263
    move-result v6

    .line 264
    invoke-virtual {v12}, Li0/h0;->l()Ls0/h;

    .line 265
    .line 266
    .line 267
    move-result-object v7

    .line 268
    invoke-static {v12, v9}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 269
    .line 270
    .line 271
    move-result-object v9

    .line 272
    invoke-virtual {v12}, Li0/h0;->d0()V

    .line 273
    .line 274
    .line 275
    iget-boolean v10, v12, Li0/h0;->S:Z

    .line 276
    .line 277
    if-eqz v10, :cond_c

    .line 278
    .line 279
    invoke-virtual {v12, v14}, Li0/h0;->k(Lfg/a;)V

    .line 280
    .line 281
    .line 282
    goto :goto_a

    .line 283
    :cond_c
    invoke-virtual {v12}, Li0/h0;->n0()V

    .line 284
    .line 285
    .line 286
    :goto_a
    invoke-static {v15, v12, v2}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 287
    .line 288
    .line 289
    move-object/from16 v2, v17

    .line 290
    .line 291
    invoke-static {v2, v12, v7}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    invoke-static {v6, v12, v13, v12, v11}, Lj8/b;->p(ILi0/h0;Lx1/e;Li0/h0;Lx1/d;)V

    .line 295
    .line 296
    .line 297
    invoke-static {v8, v12, v9}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 298
    .line 299
    .line 300
    sget-object v2, Lbi/d;->a:Li0/m2;

    .line 301
    .line 302
    invoke-virtual {v12, v2}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v6

    .line 306
    check-cast v6, Lbi/b;

    .line 307
    .line 308
    invoke-virtual {v6}, Lbi/b;->g()J

    .line 309
    .line 310
    .line 311
    move-result-wide v10

    .line 312
    const/16 v6, 0xf

    .line 313
    .line 314
    invoke-static {v6}, Lx6/d;->D(I)J

    .line 315
    .line 316
    .line 317
    move-result-wide v6

    .line 318
    sget-object v14, Lm2/k;->j:Lm2/k;

    .line 319
    .line 320
    and-int/lit8 v8, v0, 0xe

    .line 321
    .line 322
    const v9, 0x186000

    .line 323
    .line 324
    .line 325
    or-int v28, v8, v9

    .line 326
    .line 327
    const/16 v29, 0x0

    .line 328
    .line 329
    const v30, 0x3ffaa

    .line 330
    .line 331
    .line 332
    const/4 v9, 0x0

    .line 333
    const/4 v15, 0x0

    .line 334
    const/4 v8, 0x0

    .line 335
    const-wide/16 v16, 0x0

    .line 336
    .line 337
    const/4 v13, 0x1

    .line 338
    const/16 v18, 0x0

    .line 339
    .line 340
    const-wide/16 v19, 0x0

    .line 341
    .line 342
    const/16 v21, 0x0

    .line 343
    .line 344
    const/16 v22, 0x0

    .line 345
    .line 346
    const/16 v23, 0x0

    .line 347
    .line 348
    const/16 v24, 0x0

    .line 349
    .line 350
    const/16 v25, 0x0

    .line 351
    .line 352
    const/16 v26, 0x0

    .line 353
    .line 354
    move-object/from16 v27, v12

    .line 355
    .line 356
    move/from16 v31, v8

    .line 357
    .line 358
    move-object/from16 v8, p5

    .line 359
    .line 360
    move-wide/from16 v32, v6

    .line 361
    .line 362
    move/from16 v6, v31

    .line 363
    .line 364
    move v7, v13

    .line 365
    move-wide/from16 v12, v32

    .line 366
    .line 367
    invoke-static/range {v8 .. v30}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 368
    .line 369
    .line 370
    move-object/from16 v12, v27

    .line 371
    .line 372
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 373
    .line 374
    .line 375
    move-result v8

    .line 376
    if-nez v8, :cond_d

    .line 377
    .line 378
    move-object/from16 v8, p5

    .line 379
    .line 380
    invoke-virtual {v3, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 381
    .line 382
    .line 383
    move-result v9

    .line 384
    if-nez v9, :cond_d

    .line 385
    .line 386
    const v9, -0x15850225

    .line 387
    .line 388
    .line 389
    invoke-virtual {v12, v9}, Li0/h0;->a0(I)V

    .line 390
    .line 391
    .line 392
    invoke-virtual {v12, v2}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object v2

    .line 396
    check-cast v2, Lbi/b;

    .line 397
    .line 398
    invoke-virtual {v2}, Lbi/b;->h()J

    .line 399
    .line 400
    .line 401
    move-result-wide v10

    .line 402
    const/16 v2, 0xc

    .line 403
    .line 404
    invoke-static {v2}, Lx6/d;->D(I)J

    .line 405
    .line 406
    .line 407
    move-result-wide v13

    .line 408
    shr-int/lit8 v0, v0, 0x3

    .line 409
    .line 410
    and-int/lit8 v0, v0, 0xe

    .line 411
    .line 412
    or-int/lit16 v0, v0, 0x6000

    .line 413
    .line 414
    const/16 v29, 0x0

    .line 415
    .line 416
    const v30, 0x3ffea

    .line 417
    .line 418
    .line 419
    const/4 v9, 0x0

    .line 420
    move-wide v12, v13

    .line 421
    const/4 v14, 0x0

    .line 422
    const/4 v15, 0x0

    .line 423
    const-wide/16 v16, 0x0

    .line 424
    .line 425
    const/16 v18, 0x0

    .line 426
    .line 427
    const-wide/16 v19, 0x0

    .line 428
    .line 429
    const/16 v21, 0x0

    .line 430
    .line 431
    const/16 v22, 0x0

    .line 432
    .line 433
    const/16 v23, 0x0

    .line 434
    .line 435
    const/16 v24, 0x0

    .line 436
    .line 437
    const/16 v25, 0x0

    .line 438
    .line 439
    const/16 v26, 0x0

    .line 440
    .line 441
    move-object/from16 v27, p4

    .line 442
    .line 443
    move/from16 v28, v0

    .line 444
    .line 445
    move-object v8, v3

    .line 446
    invoke-static/range {v8 .. v30}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 447
    .line 448
    .line 449
    move-object/from16 v12, v27

    .line 450
    .line 451
    invoke-virtual {v12, v6}, Li0/h0;->p(Z)V

    .line 452
    .line 453
    .line 454
    goto :goto_b

    .line 455
    :cond_d
    const v0, -0x1581aa41

    .line 456
    .line 457
    .line 458
    invoke-virtual {v12, v0}, Li0/h0;->a0(I)V

    .line 459
    .line 460
    .line 461
    invoke-virtual {v12, v6}, Li0/h0;->p(Z)V

    .line 462
    .line 463
    .line 464
    :goto_b
    invoke-virtual {v12, v7}, Li0/h0;->p(Z)V

    .line 465
    .line 466
    .line 467
    const/16 v0, 0x16

    .line 468
    .line 469
    int-to-float v0, v0

    .line 470
    invoke-static {v1, v0}, Lp/h1;->j(Ly0/o;F)Ly0/o;

    .line 471
    .line 472
    .line 473
    move-result-object v9

    .line 474
    if-eqz v5, :cond_e

    .line 475
    .line 476
    sget-object v0, Lh2/a;->g:Lh2/a;

    .line 477
    .line 478
    :goto_c
    move-object v8, v0

    .line 479
    goto :goto_d

    .line 480
    :cond_e
    sget-object v0, Lh2/a;->h:Lh2/a;

    .line 481
    .line 482
    goto :goto_c

    .line 483
    :goto_d
    const/4 v11, 0x0

    .line 484
    const/16 v13, 0x1b0

    .line 485
    .line 486
    const/4 v10, 0x0

    .line 487
    invoke-static/range {v8 .. v13}, Lsh/s;->d(Lh2/a;Ly0/o;Lsh/i;ZLi0/h0;I)V

    .line 488
    .line 489
    .line 490
    invoke-virtual {v12, v7}, Li0/h0;->p(Z)V

    .line 491
    .line 492
    .line 493
    goto :goto_e

    .line 494
    :cond_f
    invoke-virtual {v12}, Li0/h0;->V()V

    .line 495
    .line 496
    .line 497
    :goto_e
    invoke-virtual {v12}, Li0/h0;->t()Li0/r1;

    .line 498
    .line 499
    .line 500
    move-result-object v8

    .line 501
    if-eqz v8, :cond_10

    .line 502
    .line 503
    new-instance v0, Lc9/l0;

    .line 504
    .line 505
    move-object/from16 v1, p0

    .line 506
    .line 507
    move/from16 v7, p2

    .line 508
    .line 509
    move-object/from16 v6, p3

    .line 510
    .line 511
    move-object/from16 v2, p5

    .line 512
    .line 513
    move-object/from16 v3, p6

    .line 514
    .line 515
    invoke-direct/range {v0 .. v7}, Lc9/l0;-><init>(Lc9/j1;Ljava/lang/String;Ljava/lang/String;IZLfg/a;I)V

    .line 516
    .line 517
    .line 518
    iput-object v0, v8, Li0/r1;->d:Lfg/p;

    .line 519
    .line 520
    :cond_10
    return-void
.end method

.method public final j(Ljava/util/List;Lc9/o2;Ljava/lang/String;Ljava/lang/String;Lfg/l;Lfg/l;Lfg/a;Lfg/a;Lfg/a;Li0/h0;I)V
    .locals 42

    .line 1
    move-object/from16 v2, p1

    .line 2
    .line 3
    move-object/from16 v3, p2

    .line 4
    .line 5
    move-object/from16 v4, p3

    .line 6
    .line 7
    move-object/from16 v5, p4

    .line 8
    .line 9
    move-object/from16 v6, p5

    .line 10
    .line 11
    move-object/from16 v7, p6

    .line 12
    .line 13
    move-object/from16 v12, p10

    .line 14
    .line 15
    const v0, 0x45326fd5

    .line 16
    .line 17
    .line 18
    invoke-virtual {v12, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v12, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v1, 0x4

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    move v0, v1

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v0, 0x2

    .line 31
    :goto_0
    or-int v0, p11, v0

    .line 32
    .line 33
    invoke-virtual {v12, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v8

    .line 37
    const/16 v9, 0x20

    .line 38
    .line 39
    if-eqz v8, :cond_1

    .line 40
    .line 41
    move v8, v9

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const/16 v8, 0x10

    .line 44
    .line 45
    :goto_1
    or-int/2addr v0, v8

    .line 46
    invoke-virtual {v12, v4}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v8

    .line 50
    if-eqz v8, :cond_2

    .line 51
    .line 52
    const/16 v8, 0x100

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    const/16 v8, 0x80

    .line 56
    .line 57
    :goto_2
    or-int/2addr v0, v8

    .line 58
    invoke-virtual {v12, v5}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    if-eqz v8, :cond_3

    .line 63
    .line 64
    const/16 v8, 0x800

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_3
    const/16 v8, 0x400

    .line 68
    .line 69
    :goto_3
    or-int/2addr v0, v8

    .line 70
    invoke-virtual {v12, v6}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v8

    .line 74
    if-eqz v8, :cond_4

    .line 75
    .line 76
    const/16 v8, 0x4000

    .line 77
    .line 78
    goto :goto_4

    .line 79
    :cond_4
    const/16 v8, 0x2000

    .line 80
    .line 81
    :goto_4
    or-int/2addr v0, v8

    .line 82
    invoke-virtual {v12, v7}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v8

    .line 86
    if-eqz v8, :cond_5

    .line 87
    .line 88
    const/high16 v8, 0x20000

    .line 89
    .line 90
    goto :goto_5

    .line 91
    :cond_5
    const/high16 v8, 0x10000

    .line 92
    .line 93
    :goto_5
    or-int/2addr v0, v8

    .line 94
    move-object/from16 v8, p7

    .line 95
    .line 96
    invoke-virtual {v12, v8}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v13

    .line 100
    if-eqz v13, :cond_6

    .line 101
    .line 102
    const/high16 v13, 0x100000

    .line 103
    .line 104
    goto :goto_6

    .line 105
    :cond_6
    const/high16 v13, 0x80000

    .line 106
    .line 107
    :goto_6
    or-int/2addr v0, v13

    .line 108
    move-object/from16 v13, p8

    .line 109
    .line 110
    invoke-virtual {v12, v13}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v14

    .line 114
    if-eqz v14, :cond_7

    .line 115
    .line 116
    const/high16 v14, 0x800000

    .line 117
    .line 118
    goto :goto_7

    .line 119
    :cond_7
    const/high16 v14, 0x400000

    .line 120
    .line 121
    :goto_7
    or-int/2addr v0, v14

    .line 122
    move-object/from16 v14, p9

    .line 123
    .line 124
    invoke-virtual {v12, v14}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v15

    .line 128
    if-eqz v15, :cond_8

    .line 129
    .line 130
    const/high16 v15, 0x4000000

    .line 131
    .line 132
    goto :goto_8

    .line 133
    :cond_8
    const/high16 v15, 0x2000000

    .line 134
    .line 135
    :goto_8
    or-int/2addr v0, v15

    .line 136
    const v15, 0x2492493

    .line 137
    .line 138
    .line 139
    and-int/2addr v15, v0

    .line 140
    const v10, 0x2492492

    .line 141
    .line 142
    .line 143
    if-eq v15, v10, :cond_9

    .line 144
    .line 145
    const/4 v10, 0x1

    .line 146
    goto :goto_9

    .line 147
    :cond_9
    const/4 v10, 0x0

    .line 148
    :goto_9
    and-int/lit8 v15, v0, 0x1

    .line 149
    .line 150
    invoke-virtual {v12, v15, v10}, Li0/h0;->S(IZ)Z

    .line 151
    .line 152
    .line 153
    move-result v10

    .line 154
    if-eqz v10, :cond_24

    .line 155
    .line 156
    and-int/lit8 v10, v0, 0xe

    .line 157
    .line 158
    if-eq v10, v1, :cond_a

    .line 159
    .line 160
    const/4 v10, 0x0

    .line 161
    goto :goto_a

    .line 162
    :cond_a
    const/4 v10, 0x1

    .line 163
    :goto_a
    and-int/lit8 v15, v0, 0x70

    .line 164
    .line 165
    if-eq v15, v9, :cond_b

    .line 166
    .line 167
    const/16 v18, 0x0

    .line 168
    .line 169
    goto :goto_b

    .line 170
    :cond_b
    const/16 v18, 0x1

    .line 171
    .line 172
    :goto_b
    or-int v10, v10, v18

    .line 173
    .line 174
    invoke-virtual {v12}, Li0/h0;->P()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v9

    .line 178
    move/from16 v19, v15

    .line 179
    .line 180
    sget-object v15, Li0/l;->a:Li0/e;

    .line 181
    .line 182
    const/4 v11, 0x0

    .line 183
    if-nez v10, :cond_c

    .line 184
    .line 185
    if-ne v9, v15, :cond_10

    .line 186
    .line 187
    :cond_c
    invoke-static {v2}, Lc9/j1;->t(Ljava/util/List;)Ljava/util/ArrayList;

    .line 188
    .line 189
    .line 190
    move-result-object v9

    .line 191
    instance-of v10, v3, Lc9/f1;

    .line 192
    .line 193
    if-eqz v10, :cond_d

    .line 194
    .line 195
    goto :goto_d

    .line 196
    :cond_d
    move-object v10, v3

    .line 197
    check-cast v10, Lc9/g1;

    .line 198
    .line 199
    iget-object v10, v10, Lc9/g1;->b:Ljava/lang/String;

    .line 200
    .line 201
    invoke-static {v10, v2}, Lc9/o2;->f(Ljava/lang/String;Ljava/util/List;)Ljava/util/Set;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    invoke-static {v1, v10}, Ltf/d0;->V(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    new-instance v10, Lc9/c1;

    .line 210
    .line 211
    const-string v14, "\u5fae\u4fe1\u9996\u9875"

    .line 212
    .line 213
    const-string v2, "\u4f5c\u4e3a\u4e00\u7ea7\u5206\u7ec4"

    .line 214
    .line 215
    const/4 v8, 0x0

    .line 216
    invoke-direct {v10, v8, v11, v14, v2}, Lc9/c1;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    invoke-static {v10}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    new-instance v8, Ljava/util/ArrayList;

    .line 224
    .line 225
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 229
    .line 230
    .line 231
    move-result-object v9

    .line 232
    :goto_c
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 233
    .line 234
    .line 235
    move-result v10

    .line 236
    if-eqz v10, :cond_f

    .line 237
    .line 238
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v10

    .line 242
    move-object v14, v10

    .line 243
    check-cast v14, Lc9/c1;

    .line 244
    .line 245
    iget-object v14, v14, Lc9/c1;->a:Ljava/lang/String;

    .line 246
    .line 247
    if-eqz v14, :cond_e

    .line 248
    .line 249
    invoke-interface {v1, v14}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    move-result v14

    .line 253
    if-eqz v14, :cond_e

    .line 254
    .line 255
    goto :goto_c

    .line 256
    :cond_e
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    goto :goto_c

    .line 260
    :cond_f
    invoke-static {v2, v8}, Ltf/m;->F1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    move-object v9, v1

    .line 265
    :goto_d
    invoke-virtual {v12, v9}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 266
    .line 267
    .line 268
    :cond_10
    check-cast v9, Ljava/util/List;

    .line 269
    .line 270
    invoke-static {v4}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 271
    .line 272
    .line 273
    move-result-object v1

    .line 274
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 279
    .line 280
    invoke-static {v2, v1, v2}, Lj8/b;->l(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v1

    .line 284
    new-instance v2, Ljava/util/ArrayList;

    .line 285
    .line 286
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 287
    .line 288
    .line 289
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 290
    .line 291
    .line 292
    move-result-object v8

    .line 293
    :goto_e
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 294
    .line 295
    .line 296
    move-result v9

    .line 297
    if-eqz v9, :cond_14

    .line 298
    .line 299
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v9

    .line 303
    move-object v10, v9

    .line 304
    check-cast v10, Lc9/c1;

    .line 305
    .line 306
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 307
    .line 308
    .line 309
    move-result v14

    .line 310
    if-nez v14, :cond_11

    .line 311
    .line 312
    move-object/from16 v24, v8

    .line 313
    .line 314
    goto :goto_10

    .line 315
    :cond_11
    iget-object v14, v10, Lc9/c1;->b:Ljava/lang/String;

    .line 316
    .line 317
    sget-object v11, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 318
    .line 319
    move-object/from16 v24, v8

    .line 320
    .line 321
    const/4 v8, 0x0

    .line 322
    invoke-static {v11, v14, v11, v1, v8}, Lbc/e;->u(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;Z)Z

    .line 323
    .line 324
    .line 325
    move-result v14

    .line 326
    if-nez v14, :cond_13

    .line 327
    .line 328
    iget-object v10, v10, Lc9/c1;->c:Ljava/lang/String;

    .line 329
    .line 330
    invoke-static {v10, v11, v1, v8}, Lbc/e;->t(Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;Z)Z

    .line 331
    .line 332
    .line 333
    move-result v10

    .line 334
    if-eqz v10, :cond_12

    .line 335
    .line 336
    goto :goto_10

    .line 337
    :cond_12
    :goto_f
    move-object/from16 v8, v24

    .line 338
    .line 339
    const/4 v11, 0x0

    .line 340
    goto :goto_e

    .line 341
    :cond_13
    :goto_10
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 342
    .line 343
    .line 344
    goto :goto_f

    .line 345
    :cond_14
    sget-object v1, Ly1/i0;->a:Li0/u;

    .line 346
    .line 347
    invoke-virtual {v12, v1}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v1

    .line 351
    check-cast v1, Landroid/content/res/Configuration;

    .line 352
    .line 353
    iget v1, v1, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 354
    .line 355
    int-to-float v1, v1

    .line 356
    sget-object v8, Ly0/l;->a:Ly0/l;

    .line 357
    .line 358
    const/high16 v9, 0x3f800000    # 1.0f

    .line 359
    .line 360
    invoke-static {v8, v9}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 361
    .line 362
    .line 363
    move-result-object v10

    .line 364
    const v11, 0x3f47ae14    # 0.78f

    .line 365
    .line 366
    .line 367
    mul-float/2addr v1, v11

    .line 368
    const/4 v11, 0x0

    .line 369
    const/4 v14, 0x1

    .line 370
    invoke-static {v10, v11, v1, v14}, Lp/h1;->g(Ly0/o;FFI)Ly0/o;

    .line 371
    .line 372
    .line 373
    move-result-object v1

    .line 374
    sget-object v10, Lp/j;->c:Lp/e;

    .line 375
    .line 376
    sget-object v11, Ly0/b;->s:Ly0/e;

    .line 377
    .line 378
    const/4 v14, 0x0

    .line 379
    invoke-static {v10, v11, v12, v14}, Lp/s;->a(Lp/i;Ly0/e;Li0/h0;I)Lp/t;

    .line 380
    .line 381
    .line 382
    move-result-object v10

    .line 383
    move-object v11, v15

    .line 384
    iget-wide v14, v12, Li0/h0;->T:J

    .line 385
    .line 386
    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    .line 387
    .line 388
    .line 389
    move-result v14

    .line 390
    invoke-virtual {v12}, Li0/h0;->l()Ls0/h;

    .line 391
    .line 392
    .line 393
    move-result-object v15

    .line 394
    invoke-static {v12, v1}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 395
    .line 396
    .line 397
    move-result-object v1

    .line 398
    sget-object v25, Lx1/g;->f:Lx1/f;

    .line 399
    .line 400
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 401
    .line 402
    .line 403
    sget-object v9, Lx1/f;->b:Lx1/y;

    .line 404
    .line 405
    invoke-virtual {v12}, Li0/h0;->d0()V

    .line 406
    .line 407
    .line 408
    move-object/from16 v26, v11

    .line 409
    .line 410
    iget-boolean v11, v12, Li0/h0;->S:Z

    .line 411
    .line 412
    if-eqz v11, :cond_15

    .line 413
    .line 414
    invoke-virtual {v12, v9}, Li0/h0;->k(Lfg/a;)V

    .line 415
    .line 416
    .line 417
    goto :goto_11

    .line 418
    :cond_15
    invoke-virtual {v12}, Li0/h0;->n0()V

    .line 419
    .line 420
    .line 421
    :goto_11
    sget-object v9, Lx1/f;->e:Lx1/e;

    .line 422
    .line 423
    invoke-static {v9, v12, v10}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 424
    .line 425
    .line 426
    sget-object v9, Lx1/f;->d:Lx1/e;

    .line 427
    .line 428
    invoke-static {v9, v12, v15}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 429
    .line 430
    .line 431
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 432
    .line 433
    .line 434
    move-result-object v9

    .line 435
    sget-object v10, Lx1/f;->f:Lx1/e;

    .line 436
    .line 437
    invoke-static {v10, v12, v9}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 438
    .line 439
    .line 440
    sget-object v9, Lx1/f;->g:Lx1/d;

    .line 441
    .line 442
    invoke-static {v9, v12}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 443
    .line 444
    .line 445
    sget-object v9, Lx1/f;->c:Lx1/e;

    .line 446
    .line 447
    invoke-static {v9, v12, v1}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 448
    .line 449
    .line 450
    instance-of v1, v3, Lc9/f1;

    .line 451
    .line 452
    if-eqz v1, :cond_16

    .line 453
    .line 454
    const-string v1, "\u9009\u62e9\u5f53\u524d\u4f1a\u8bdd\u6240\u5c5e\u5206\u7ec4"

    .line 455
    .line 456
    goto :goto_14

    .line 457
    :cond_16
    instance-of v1, v3, Lc9/g1;

    .line 458
    .line 459
    if-eqz v1, :cond_23

    .line 460
    .line 461
    invoke-interface/range {p1 .. p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 462
    .line 463
    .line 464
    move-result-object v1

    .line 465
    :cond_17
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 466
    .line 467
    .line 468
    move-result v9

    .line 469
    if-eqz v9, :cond_18

    .line 470
    .line 471
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 472
    .line 473
    .line 474
    move-result-object v9

    .line 475
    move-object v10, v9

    .line 476
    check-cast v10, Lc9/a;

    .line 477
    .line 478
    iget-object v10, v10, Lc9/a;->a:Ljava/lang/String;

    .line 479
    .line 480
    move-object v11, v3

    .line 481
    check-cast v11, Lc9/g1;

    .line 482
    .line 483
    iget-object v11, v11, Lc9/g1;->b:Ljava/lang/String;

    .line 484
    .line 485
    invoke-static {v10, v11}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 486
    .line 487
    .line 488
    move-result v10

    .line 489
    if-eqz v10, :cond_17

    .line 490
    .line 491
    goto :goto_12

    .line 492
    :cond_18
    const/4 v9, 0x0

    .line 493
    :goto_12
    check-cast v9, Lc9/a;

    .line 494
    .line 495
    if-eqz v9, :cond_19

    .line 496
    .line 497
    iget-object v11, v9, Lc9/a;->b:Ljava/lang/String;

    .line 498
    .line 499
    goto :goto_13

    .line 500
    :cond_19
    const/4 v11, 0x0

    .line 501
    :goto_13
    if-nez v11, :cond_1a

    .line 502
    .line 503
    const-string v11, ""

    .line 504
    .line 505
    :cond_1a
    const-string v1, "\u79fb\u52a8\u5206\u7ec4\uff1a"

    .line 506
    .line 507
    invoke-virtual {v1, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 508
    .line 509
    .line 510
    move-result-object v1

    .line 511
    :goto_14
    sget-object v9, Lbi/d;->a:Li0/m2;

    .line 512
    .line 513
    invoke-virtual {v12, v9}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    move-result-object v10

    .line 517
    check-cast v10, Lbi/b;

    .line 518
    .line 519
    invoke-virtual {v10}, Lbi/b;->h()J

    .line 520
    .line 521
    .line 522
    move-result-wide v10

    .line 523
    const/16 v14, 0xd

    .line 524
    .line 525
    invoke-static {v14}, Lx6/d;->D(I)J

    .line 526
    .line 527
    .line 528
    move-result-wide v14

    .line 529
    move-object/from16 v23, v1

    .line 530
    .line 531
    const/high16 v1, 0x3f800000    # 1.0f

    .line 532
    .line 533
    invoke-static {v8, v1}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 534
    .line 535
    .line 536
    move-result-object v27

    .line 537
    const/4 v1, 0x4

    .line 538
    int-to-float v1, v1

    .line 539
    const/16 v32, 0x7

    .line 540
    .line 541
    const/16 v28, 0x0

    .line 542
    .line 543
    const/16 v29, 0x0

    .line 544
    .line 545
    const/16 v30, 0x0

    .line 546
    .line 547
    move/from16 v31, v1

    .line 548
    .line 549
    invoke-static/range {v27 .. v32}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 550
    .line 551
    .line 552
    move-result-object v1

    .line 553
    const/16 v29, 0x0

    .line 554
    .line 555
    const v30, 0x3ffe8

    .line 556
    .line 557
    .line 558
    move-wide v12, v14

    .line 559
    const/4 v14, 0x0

    .line 560
    const/4 v15, 0x0

    .line 561
    const/16 v21, 0x800

    .line 562
    .line 563
    const/16 v27, 0x0

    .line 564
    .line 565
    const-wide/16 v16, 0x0

    .line 566
    .line 567
    const/16 v28, 0x20

    .line 568
    .line 569
    const/16 v18, 0x0

    .line 570
    .line 571
    move/from16 v31, v19

    .line 572
    .line 573
    const/high16 v32, 0x20000

    .line 574
    .line 575
    const-wide/16 v19, 0x0

    .line 576
    .line 577
    move/from16 v33, v21

    .line 578
    .line 579
    const/16 v21, 0x0

    .line 580
    .line 581
    const/16 v34, 0x0

    .line 582
    .line 583
    const/16 v22, 0x0

    .line 584
    .line 585
    move-object/from16 v35, v8

    .line 586
    .line 587
    move-object/from16 v8, v23

    .line 588
    .line 589
    const/16 v23, 0x0

    .line 590
    .line 591
    const/16 v36, 0x1

    .line 592
    .line 593
    const/16 v24, 0x0

    .line 594
    .line 595
    const/high16 v37, 0x3f800000    # 1.0f

    .line 596
    .line 597
    const/16 v25, 0x0

    .line 598
    .line 599
    move-object/from16 v38, v26

    .line 600
    .line 601
    const/16 v26, 0x0

    .line 602
    .line 603
    move/from16 v39, v28

    .line 604
    .line 605
    const/16 v28, 0x6030

    .line 606
    .line 607
    move-object v3, v9

    .line 608
    move-object v9, v1

    .line 609
    move-object v1, v3

    .line 610
    move-object/from16 v27, p10

    .line 611
    .line 612
    move/from16 v40, v31

    .line 613
    .line 614
    move-object/from16 v3, v35

    .line 615
    .line 616
    move/from16 v5, v37

    .line 617
    .line 618
    move-object/from16 v41, v38

    .line 619
    .line 620
    invoke-static/range {v8 .. v30}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 621
    .line 622
    .line 623
    shr-int/lit8 v8, v0, 0xc

    .line 624
    .line 625
    and-int/lit16 v8, v8, 0x380

    .line 626
    .line 627
    or-int/lit16 v9, v8, 0x6036

    .line 628
    .line 629
    const/16 v10, 0x8

    .line 630
    .line 631
    sget-object v8, Lc9/j1;->a:Lc9/j1;

    .line 632
    .line 633
    const-string v13, "\u7ba1\u7406\u804a\u5929\u5206\u7ec4"

    .line 634
    .line 635
    const-string v14, "\u65b0\u5efa\u3001\u5220\u9664\u3001\u5bfc\u5165\u4e0e\u5bfc\u51fa"

    .line 636
    .line 637
    const/4 v15, 0x0

    .line 638
    move-object/from16 v11, p7

    .line 639
    .line 640
    move-object/from16 v12, p10

    .line 641
    .line 642
    invoke-virtual/range {v8 .. v15}, Lc9/j1;->a(IILfg/a;Li0/h0;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 643
    .line 644
    .line 645
    shr-int/lit8 v9, v0, 0x6

    .line 646
    .line 647
    and-int/lit8 v9, v9, 0xe

    .line 648
    .line 649
    or-int/lit16 v9, v9, 0x180

    .line 650
    .line 651
    shr-int/lit8 v10, v0, 0x9

    .line 652
    .line 653
    and-int/lit8 v10, v10, 0x70

    .line 654
    .line 655
    or-int/2addr v9, v10

    .line 656
    invoke-virtual {v8, v4, v6, v12, v9}, Lc9/j1;->q(Ljava/lang/String;Lfg/l;Li0/h0;I)V

    .line 657
    .line 658
    .line 659
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 660
    .line 661
    .line 662
    move-result v9

    .line 663
    if-eqz v9, :cond_1c

    .line 664
    .line 665
    const v2, -0x7f55817b

    .line 666
    .line 667
    .line 668
    invoke-virtual {v12, v2}, Li0/h0;->a0(I)V

    .line 669
    .line 670
    .line 671
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->isEmpty()Z

    .line 672
    .line 673
    .line 674
    move-result v2

    .line 675
    if-eqz v2, :cond_1b

    .line 676
    .line 677
    const-string v2, "\u6682\u65e0\u804a\u5929\u5206\u7ec4"

    .line 678
    .line 679
    goto :goto_15

    .line 680
    :cond_1b
    const-string v2, "\u6ca1\u6709\u5339\u914d\u7684\u804a\u5929\u5206\u7ec4"

    .line 681
    .line 682
    :goto_15
    invoke-virtual {v12, v1}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 683
    .line 684
    .line 685
    move-result-object v1

    .line 686
    check-cast v1, Lbi/b;

    .line 687
    .line 688
    invoke-virtual {v1}, Lbi/b;->h()J

    .line 689
    .line 690
    .line 691
    move-result-wide v10

    .line 692
    invoke-static {v3, v5}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 693
    .line 694
    .line 695
    move-result-object v1

    .line 696
    const/16 v3, 0x1c

    .line 697
    .line 698
    int-to-float v3, v3

    .line 699
    const/4 v5, 0x1

    .line 700
    const/4 v9, 0x0

    .line 701
    invoke-static {v1, v9, v3, v5}, Lp/d;->n(Ly0/o;FFI)Ly0/o;

    .line 702
    .line 703
    .line 704
    move-result-object v9

    .line 705
    new-instance v1, Lt2/k;

    .line 706
    .line 707
    const/4 v3, 0x3

    .line 708
    invoke-direct {v1, v3}, Lt2/k;-><init>(I)V

    .line 709
    .line 710
    .line 711
    const/16 v29, 0x0

    .line 712
    .line 713
    const v30, 0x3fbf8

    .line 714
    .line 715
    .line 716
    const-wide/16 v12, 0x0

    .line 717
    .line 718
    const/4 v14, 0x0

    .line 719
    const/4 v15, 0x0

    .line 720
    const-wide/16 v16, 0x0

    .line 721
    .line 722
    const-wide/16 v19, 0x0

    .line 723
    .line 724
    const/16 v21, 0x0

    .line 725
    .line 726
    const/16 v22, 0x0

    .line 727
    .line 728
    const/16 v23, 0x0

    .line 729
    .line 730
    const/16 v24, 0x0

    .line 731
    .line 732
    const/16 v25, 0x0

    .line 733
    .line 734
    const/16 v26, 0x0

    .line 735
    .line 736
    const/16 v28, 0x30

    .line 737
    .line 738
    move-object/from16 v27, p10

    .line 739
    .line 740
    move-object/from16 v18, v1

    .line 741
    .line 742
    move-object v1, v8

    .line 743
    move-object v8, v2

    .line 744
    invoke-static/range {v8 .. v30}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 745
    .line 746
    .line 747
    move-object/from16 v12, v27

    .line 748
    .line 749
    const/4 v8, 0x0

    .line 750
    invoke-virtual {v12, v8}, Li0/h0;->p(Z)V

    .line 751
    .line 752
    .line 753
    move v2, v5

    .line 754
    move-object/from16 v5, p2

    .line 755
    .line 756
    goto/16 :goto_1c

    .line 757
    .line 758
    :cond_1c
    move-object v1, v8

    .line 759
    const/4 v8, 0x1

    .line 760
    const/4 v9, 0x0

    .line 761
    const v10, -0x7f50449c

    .line 762
    .line 763
    .line 764
    invoke-virtual {v12, v10}, Li0/h0;->a0(I)V

    .line 765
    .line 766
    .line 767
    invoke-static {v3, v5}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 768
    .line 769
    .line 770
    move-result-object v3

    .line 771
    float-to-double v10, v5

    .line 772
    const-wide/16 v13, 0x0

    .line 773
    .line 774
    cmpl-double v10, v10, v13

    .line 775
    .line 776
    if-lez v10, :cond_1d

    .line 777
    .line 778
    goto :goto_16

    .line 779
    :cond_1d
    const-string v10, "invalid weight; must be greater than zero"

    .line 780
    .line 781
    invoke-static {v10}, Lq/a;->a(Ljava/lang/String;)V

    .line 782
    .line 783
    .line 784
    :goto_16
    new-instance v10, Lp/q0;

    .line 785
    .line 786
    const/4 v14, 0x0

    .line 787
    invoke-direct {v10, v5, v14}, Lp/q0;-><init>(FZ)V

    .line 788
    .line 789
    .line 790
    invoke-interface {v3, v10}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 791
    .line 792
    .line 793
    move-result-object v3

    .line 794
    const/16 v5, 0x168

    .line 795
    .line 796
    int-to-float v5, v5

    .line 797
    invoke-static {v3, v9, v5, v8}, Lp/h1;->g(Ly0/o;FFI)Ly0/o;

    .line 798
    .line 799
    .line 800
    move-result-object v3

    .line 801
    invoke-virtual {v12, v2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 802
    .line 803
    .line 804
    move-result v5

    .line 805
    and-int/lit16 v9, v0, 0x1c00

    .line 806
    .line 807
    const/16 v10, 0x800

    .line 808
    .line 809
    if-ne v9, v10, :cond_1e

    .line 810
    .line 811
    move v14, v8

    .line 812
    goto :goto_17

    .line 813
    :cond_1e
    const/4 v14, 0x0

    .line 814
    :goto_17
    or-int/2addr v5, v14

    .line 815
    move/from16 v9, v40

    .line 816
    .line 817
    const/16 v10, 0x20

    .line 818
    .line 819
    if-eq v9, v10, :cond_1f

    .line 820
    .line 821
    const/4 v14, 0x0

    .line 822
    goto :goto_18

    .line 823
    :cond_1f
    move v14, v8

    .line 824
    :goto_18
    or-int/2addr v5, v14

    .line 825
    const/high16 v9, 0x70000

    .line 826
    .line 827
    and-int/2addr v9, v0

    .line 828
    const/high16 v10, 0x20000

    .line 829
    .line 830
    if-ne v9, v10, :cond_20

    .line 831
    .line 832
    move v14, v8

    .line 833
    goto :goto_19

    .line 834
    :cond_20
    const/4 v14, 0x0

    .line 835
    :goto_19
    or-int/2addr v5, v14

    .line 836
    invoke-virtual {v12}, Li0/h0;->P()Ljava/lang/Object;

    .line 837
    .line 838
    .line 839
    move-result-object v9

    .line 840
    if-nez v5, :cond_22

    .line 841
    .line 842
    move-object/from16 v11, v41

    .line 843
    .line 844
    if-ne v9, v11, :cond_21

    .line 845
    .line 846
    goto :goto_1a

    .line 847
    :cond_21
    move-object/from16 v5, p2

    .line 848
    .line 849
    move-object/from16 v10, p4

    .line 850
    .line 851
    goto :goto_1b

    .line 852
    :cond_22
    :goto_1a
    new-instance v9, Lc9/k;

    .line 853
    .line 854
    move-object/from16 v5, p2

    .line 855
    .line 856
    move-object/from16 v10, p4

    .line 857
    .line 858
    invoke-direct {v9, v2, v10, v5, v7}, Lc9/k;-><init>(Ljava/util/ArrayList;Ljava/lang/String;Lc9/o2;Lfg/l;)V

    .line 859
    .line 860
    .line 861
    invoke-virtual {v12, v9}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 862
    .line 863
    .line 864
    :goto_1b
    move-object/from16 v16, v9

    .line 865
    .line 866
    check-cast v16, Lfg/l;

    .line 867
    .line 868
    const/16 v18, 0x0

    .line 869
    .line 870
    const/16 v19, 0x1fe

    .line 871
    .line 872
    const/4 v9, 0x0

    .line 873
    const/4 v10, 0x0

    .line 874
    const/4 v11, 0x0

    .line 875
    const/4 v12, 0x0

    .line 876
    const/4 v13, 0x0

    .line 877
    const/4 v14, 0x0

    .line 878
    const/4 v15, 0x0

    .line 879
    move-object/from16 v17, p10

    .line 880
    .line 881
    move v2, v8

    .line 882
    move-object v8, v3

    .line 883
    invoke-static/range {v8 .. v19}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 884
    .line 885
    .line 886
    move-object/from16 v12, v17

    .line 887
    .line 888
    const/4 v8, 0x0

    .line 889
    invoke-virtual {v12, v8}, Li0/h0;->p(Z)V

    .line 890
    .line 891
    .line 892
    :goto_1c
    shr-int/lit8 v3, v0, 0x12

    .line 893
    .line 894
    and-int/lit8 v3, v3, 0x70

    .line 895
    .line 896
    const v8, 0x36186

    .line 897
    .line 898
    .line 899
    or-int/2addr v3, v8

    .line 900
    shr-int/lit8 v0, v0, 0xf

    .line 901
    .line 902
    and-int/lit16 v0, v0, 0x1c00

    .line 903
    .line 904
    or-int v14, v3, v0

    .line 905
    .line 906
    const/4 v15, 0x0

    .line 907
    const-string v10, "\u786e\u5b9a"

    .line 908
    .line 909
    const/4 v12, 0x1

    .line 910
    move-object/from16 v9, p8

    .line 911
    .line 912
    move-object/from16 v11, p9

    .line 913
    .line 914
    move-object/from16 v13, p10

    .line 915
    .line 916
    move-object v8, v1

    .line 917
    invoke-virtual/range {v8 .. v15}, Lc9/j1;->f(Lfg/a;Ljava/lang/String;Lfg/a;ZLi0/h0;II)V

    .line 918
    .line 919
    .line 920
    move-object v12, v13

    .line 921
    invoke-virtual {v12, v2}, Li0/h0;->p(Z)V

    .line 922
    .line 923
    .line 924
    goto :goto_1d

    .line 925
    :cond_23
    invoke-static {}, Lokio/a;->k()V

    .line 926
    .line 927
    .line 928
    return-void

    .line 929
    :cond_24
    move-object v5, v3

    .line 930
    invoke-virtual {v12}, Li0/h0;->V()V

    .line 931
    .line 932
    .line 933
    :goto_1d
    invoke-virtual {v12}, Li0/h0;->t()Li0/r1;

    .line 934
    .line 935
    .line 936
    move-result-object v12

    .line 937
    if-eqz v12, :cond_25

    .line 938
    .line 939
    new-instance v0, Lc9/e0;

    .line 940
    .line 941
    move-object/from16 v1, p0

    .line 942
    .line 943
    move-object/from16 v2, p1

    .line 944
    .line 945
    move-object/from16 v8, p7

    .line 946
    .line 947
    move-object/from16 v9, p8

    .line 948
    .line 949
    move-object/from16 v10, p9

    .line 950
    .line 951
    move/from16 v11, p11

    .line 952
    .line 953
    move-object v3, v5

    .line 954
    move-object/from16 v5, p4

    .line 955
    .line 956
    invoke-direct/range {v0 .. v11}, Lc9/e0;-><init>(Lc9/j1;Ljava/util/List;Lc9/o2;Ljava/lang/String;Ljava/lang/String;Lfg/l;Lfg/l;Lfg/a;Lfg/a;Lfg/a;I)V

    .line 957
    .line 958
    .line 959
    iput-object v0, v12, Li0/r1;->d:Lfg/p;

    .line 960
    .line 961
    :cond_25
    return-void
.end method

.method public final k(Ljava/util/List;Lfg/a;Lfg/a;Lfg/a;Lfg/a;Lfg/a;Lfg/a;Li0/h0;I)V
    .locals 18

    .line 1
    move-object/from16 v4, p8

    .line 2
    .line 3
    const v0, -0x15d8a2cc

    .line 4
    .line 5
    .line 6
    invoke-virtual {v4, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 7
    .line 8
    .line 9
    move-object/from16 v12, p1

    .line 10
    .line 11
    invoke-virtual {v4, v12}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x4

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x2

    .line 20
    :goto_0
    or-int v0, p9, v0

    .line 21
    .line 22
    move-object/from16 v3, p2

    .line 23
    .line 24
    invoke-virtual {v4, v3}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    const/16 v1, 0x20

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    const/16 v1, 0x10

    .line 34
    .line 35
    :goto_1
    or-int/2addr v0, v1

    .line 36
    move-object/from16 v8, p3

    .line 37
    .line 38
    invoke-virtual {v4, v8}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    const/16 v1, 0x100

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    const/16 v1, 0x80

    .line 48
    .line 49
    :goto_2
    or-int/2addr v0, v1

    .line 50
    move-object/from16 v9, p4

    .line 51
    .line 52
    invoke-virtual {v4, v9}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    const/16 v1, 0x800

    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_3
    const/16 v1, 0x400

    .line 62
    .line 63
    :goto_3
    or-int/2addr v0, v1

    .line 64
    move-object/from16 v10, p5

    .line 65
    .line 66
    invoke-virtual {v4, v10}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-eqz v1, :cond_4

    .line 71
    .line 72
    const/16 v1, 0x4000

    .line 73
    .line 74
    goto :goto_4

    .line 75
    :cond_4
    const/16 v1, 0x2000

    .line 76
    .line 77
    :goto_4
    or-int/2addr v0, v1

    .line 78
    move-object/from16 v11, p6

    .line 79
    .line 80
    invoke-virtual {v4, v11}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-eqz v1, :cond_5

    .line 85
    .line 86
    const/high16 v1, 0x20000

    .line 87
    .line 88
    goto :goto_5

    .line 89
    :cond_5
    const/high16 v1, 0x10000

    .line 90
    .line 91
    :goto_5
    or-int/2addr v0, v1

    .line 92
    move-object/from16 v13, p7

    .line 93
    .line 94
    invoke-virtual {v4, v13}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-eqz v1, :cond_6

    .line 99
    .line 100
    const/high16 v1, 0x100000

    .line 101
    .line 102
    goto :goto_6

    .line 103
    :cond_6
    const/high16 v1, 0x80000

    .line 104
    .line 105
    :goto_6
    or-int v14, v0, v1

    .line 106
    .line 107
    const v0, 0x92493

    .line 108
    .line 109
    .line 110
    and-int/2addr v0, v14

    .line 111
    const v1, 0x92492

    .line 112
    .line 113
    .line 114
    const/4 v2, 0x0

    .line 115
    const/4 v15, 0x1

    .line 116
    if-eq v0, v1, :cond_7

    .line 117
    .line 118
    move v0, v15

    .line 119
    goto :goto_7

    .line 120
    :cond_7
    move v0, v2

    .line 121
    :goto_7
    and-int/lit8 v1, v14, 0x1

    .line 122
    .line 123
    invoke-virtual {v4, v1, v0}, Li0/h0;->S(IZ)Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-eqz v0, :cond_9

    .line 128
    .line 129
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 130
    .line 131
    const/high16 v1, 0x3f800000    # 1.0f

    .line 132
    .line 133
    invoke-static {v0, v1}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 134
    .line 135
    .line 136
    move-result-object v5

    .line 137
    const/16 v6, 0x230

    .line 138
    .line 139
    int-to-float v6, v6

    .line 140
    const/4 v7, 0x0

    .line 141
    invoke-static {v5, v7, v6, v15}, Lp/h1;->g(Ly0/o;FFI)Ly0/o;

    .line 142
    .line 143
    .line 144
    move-result-object v5

    .line 145
    sget-object v6, Lp/j;->c:Lp/e;

    .line 146
    .line 147
    sget-object v7, Ly0/b;->s:Ly0/e;

    .line 148
    .line 149
    invoke-static {v6, v7, v4, v2}, Lp/s;->a(Lp/i;Ly0/e;Li0/h0;I)Lp/t;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    iget-wide v6, v4, Li0/h0;->T:J

    .line 154
    .line 155
    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    .line 156
    .line 157
    .line 158
    move-result v6

    .line 159
    invoke-virtual {v4}, Li0/h0;->l()Ls0/h;

    .line 160
    .line 161
    .line 162
    move-result-object v7

    .line 163
    invoke-static {v4, v5}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 164
    .line 165
    .line 166
    move-result-object v5

    .line 167
    sget-object v16, Lx1/g;->f:Lx1/f;

    .line 168
    .line 169
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    sget-object v1, Lx1/f;->b:Lx1/y;

    .line 173
    .line 174
    invoke-virtual {v4}, Li0/h0;->d0()V

    .line 175
    .line 176
    .line 177
    move/from16 v17, v15

    .line 178
    .line 179
    iget-boolean v15, v4, Li0/h0;->S:Z

    .line 180
    .line 181
    if-eqz v15, :cond_8

    .line 182
    .line 183
    invoke-virtual {v4, v1}, Li0/h0;->k(Lfg/a;)V

    .line 184
    .line 185
    .line 186
    goto :goto_8

    .line 187
    :cond_8
    invoke-virtual {v4}, Li0/h0;->n0()V

    .line 188
    .line 189
    .line 190
    :goto_8
    sget-object v1, Lx1/f;->e:Lx1/e;

    .line 191
    .line 192
    invoke-static {v1, v4, v2}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    sget-object v1, Lx1/f;->d:Lx1/e;

    .line 196
    .line 197
    invoke-static {v1, v4, v7}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    sget-object v2, Lx1/f;->f:Lx1/e;

    .line 205
    .line 206
    invoke-static {v2, v4, v1}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    sget-object v1, Lx1/f;->g:Lx1/d;

    .line 210
    .line 211
    invoke-static {v1, v4}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 212
    .line 213
    .line 214
    sget-object v1, Lx1/f;->c:Lx1/e;

    .line 215
    .line 216
    invoke-static {v1, v4, v5}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    const-string v1, "\u7ba1\u7406\u804a\u5929\u5206\u7ec4"

    .line 220
    .line 221
    const/16 v2, 0x36

    .line 222
    .line 223
    move-object v5, v0

    .line 224
    sget-object v0, Lc9/j1;->a:Lc9/j1;

    .line 225
    .line 226
    invoke-virtual {v0, v1, v4, v2}, Lc9/j1;->r(Ljava/lang/String;Li0/h0;I)V

    .line 227
    .line 228
    .line 229
    shl-int/lit8 v1, v14, 0x3

    .line 230
    .line 231
    and-int/lit16 v1, v1, 0x380

    .line 232
    .line 233
    or-int/lit16 v1, v1, 0x6036

    .line 234
    .line 235
    const/16 v2, 0x8

    .line 236
    .line 237
    move-object v6, v5

    .line 238
    const-string v5, "\u65b0\u5efa\u5206\u7ec4"

    .line 239
    .line 240
    move-object v7, v6

    .line 241
    const-string v6, "\u521b\u5efa\u4e00\u7ea7\u6216\u591a\u7ea7\u804a\u5929\u5206\u7ec4"

    .line 242
    .line 243
    move-object v15, v7

    .line 244
    const/4 v7, 0x0

    .line 245
    move-object v8, v15

    .line 246
    const/high16 v15, 0x3f800000    # 1.0f

    .line 247
    .line 248
    invoke-virtual/range {v0 .. v7}, Lc9/j1;->a(IILfg/a;Li0/h0;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 249
    .line 250
    .line 251
    invoke-interface {v12}, Ljava/util/Collection;->isEmpty()Z

    .line 252
    .line 253
    .line 254
    move-result v1

    .line 255
    xor-int/lit8 v7, v1, 0x1

    .line 256
    .line 257
    shr-int/lit8 v1, v14, 0x3

    .line 258
    .line 259
    and-int/lit16 v1, v1, 0x380

    .line 260
    .line 261
    or-int/lit16 v1, v1, 0x6036

    .line 262
    .line 263
    const/4 v2, 0x0

    .line 264
    const-string v5, "\u5220\u9664\u591a\u4e2a"

    .line 265
    .line 266
    const-string v6, "\u9009\u62e9\u4e00\u4e2a\u6216\u591a\u4e2a\u804a\u5929\u5206\u7ec4\u5220\u9664"

    .line 267
    .line 268
    move-object/from16 v4, p8

    .line 269
    .line 270
    move-object v3, v9

    .line 271
    invoke-virtual/range {v0 .. v7}, Lc9/j1;->a(IILfg/a;Li0/h0;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 272
    .line 273
    .line 274
    shr-int/lit8 v1, v14, 0x6

    .line 275
    .line 276
    and-int/lit16 v1, v1, 0x380

    .line 277
    .line 278
    or-int/lit16 v1, v1, 0x6036

    .line 279
    .line 280
    const/16 v2, 0x8

    .line 281
    .line 282
    const-string v5, "\u5bfc\u5165"

    .line 283
    .line 284
    const-string v6, "\u4ece\u804a\u5929\u5206\u7ec4\u6587\u4ef6\u6062\u590d\u914d\u7f6e"

    .line 285
    .line 286
    const/4 v7, 0x0

    .line 287
    move-object v3, v10

    .line 288
    invoke-virtual/range {v0 .. v7}, Lc9/j1;->a(IILfg/a;Li0/h0;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 289
    .line 290
    .line 291
    shr-int/lit8 v1, v14, 0x9

    .line 292
    .line 293
    and-int/lit16 v1, v1, 0x380

    .line 294
    .line 295
    or-int/lit16 v1, v1, 0x6036

    .line 296
    .line 297
    const-string v5, "\u5bfc\u51fa"

    .line 298
    .line 299
    const-string v6, "\u5c06\u5f53\u524d\u8d26\u53f7\u7684\u804a\u5929\u5206\u7ec4\u4fdd\u5b58\u5230\u6587\u4ef6"

    .line 300
    .line 301
    move-object v3, v11

    .line 302
    invoke-virtual/range {v0 .. v7}, Lc9/j1;->a(IILfg/a;Li0/h0;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 303
    .line 304
    .line 305
    invoke-interface {v12}, Ljava/util/Collection;->isEmpty()Z

    .line 306
    .line 307
    .line 308
    move-result v1

    .line 309
    xor-int/lit8 v7, v1, 0x1

    .line 310
    .line 311
    and-int/lit16 v1, v14, 0x380

    .line 312
    .line 313
    or-int/lit16 v1, v1, 0x6036

    .line 314
    .line 315
    const/4 v2, 0x0

    .line 316
    const-string v5, "\u5168\u90e8\u5220\u9664"

    .line 317
    .line 318
    const-string v6, "\u5220\u9664\u5f53\u524d\u8d26\u53f7\u7684\u5168\u90e8\u804a\u5929\u5206\u7ec4"

    .line 319
    .line 320
    move-object/from16 v3, p3

    .line 321
    .line 322
    invoke-virtual/range {v0 .. v7}, Lc9/j1;->a(IILfg/a;Li0/h0;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 323
    .line 324
    .line 325
    invoke-static {v8, v15}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    const/16 v1, 0x8

    .line 330
    .line 331
    int-to-float v2, v1

    .line 332
    const/4 v4, 0x0

    .line 333
    const/16 v5, 0xd

    .line 334
    .line 335
    const/4 v1, 0x0

    .line 336
    const/4 v3, 0x0

    .line 337
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 338
    .line 339
    .line 340
    move-result-object v2

    .line 341
    shr-int/lit8 v0, v14, 0xf

    .line 342
    .line 343
    and-int/lit8 v0, v0, 0x70

    .line 344
    .line 345
    or-int/lit16 v10, v0, 0x186

    .line 346
    .line 347
    const/16 v11, 0x7f8

    .line 348
    .line 349
    const-string v0, "\u8fd4\u56de"

    .line 350
    .line 351
    const/4 v3, 0x0

    .line 352
    const/4 v5, 0x0

    .line 353
    const/4 v6, 0x0

    .line 354
    const/4 v7, 0x0

    .line 355
    const/4 v8, 0x0

    .line 356
    move-object/from16 v9, p8

    .line 357
    .line 358
    move-object v1, v13

    .line 359
    invoke-static/range {v0 .. v11}, Lsh/s;->o(Ljava/lang/String;Lfg/a;Ly0/o;ZFFFLsh/q1;Lp/z0;Li0/h0;II)V

    .line 360
    .line 361
    .line 362
    move-object v4, v9

    .line 363
    move/from16 v0, v17

    .line 364
    .line 365
    invoke-virtual {v4, v0}, Li0/h0;->p(Z)V

    .line 366
    .line 367
    .line 368
    goto :goto_9

    .line 369
    :cond_9
    invoke-virtual {v4}, Li0/h0;->V()V

    .line 370
    .line 371
    .line 372
    :goto_9
    invoke-virtual {v4}, Li0/h0;->t()Li0/r1;

    .line 373
    .line 374
    .line 375
    move-result-object v0

    .line 376
    if-eqz v0, :cond_a

    .line 377
    .line 378
    new-instance v1, Lc9/d0;

    .line 379
    .line 380
    const/4 v11, 0x0

    .line 381
    move-object/from16 v2, p0

    .line 382
    .line 383
    move-object/from16 v4, p2

    .line 384
    .line 385
    move-object/from16 v5, p3

    .line 386
    .line 387
    move-object/from16 v6, p4

    .line 388
    .line 389
    move-object/from16 v7, p5

    .line 390
    .line 391
    move-object/from16 v8, p6

    .line 392
    .line 393
    move-object/from16 v9, p7

    .line 394
    .line 395
    move/from16 v10, p9

    .line 396
    .line 397
    move-object v3, v12

    .line 398
    invoke-direct/range {v1 .. v11}, Lc9/d0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lfg/a;Lsf/b;Lsf/b;Lsf/b;Lsf/b;Lsf/b;II)V

    .line 399
    .line 400
    .line 401
    iput-object v1, v0, Li0/r1;->d:Lfg/p;

    .line 402
    .line 403
    :cond_a
    return-void
.end method

.method public final l(Landroid/app/Activity;Lc9/o2;Lfg/a;Lfg/a;Lfg/a;Li0/h0;I)V
    .locals 19

    .line 1
    move-object/from16 v1, p2

    .line 2
    .line 3
    move-object/from16 v13, p6

    .line 4
    .line 5
    move/from16 v14, p7

    .line 6
    .line 7
    const v0, -0x54849dbc

    .line 8
    .line 9
    .line 10
    invoke-virtual {v13, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 11
    .line 12
    .line 13
    and-int/lit8 v0, v14, 0x6

    .line 14
    .line 15
    move-object/from16 v2, p1

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {v13, v2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    const/4 v0, 0x4

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v0, 0x2

    .line 28
    :goto_0
    or-int/2addr v0, v14

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move v0, v14

    .line 31
    :goto_1
    and-int/lit8 v3, v14, 0x30

    .line 32
    .line 33
    const/16 v4, 0x20

    .line 34
    .line 35
    if-nez v3, :cond_4

    .line 36
    .line 37
    and-int/lit8 v3, v14, 0x40

    .line 38
    .line 39
    if-nez v3, :cond_2

    .line 40
    .line 41
    invoke-virtual {v13, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    goto :goto_2

    .line 46
    :cond_2
    invoke-virtual {v13, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    :goto_2
    if-eqz v3, :cond_3

    .line 51
    .line 52
    move v3, v4

    .line 53
    goto :goto_3

    .line 54
    :cond_3
    const/16 v3, 0x10

    .line 55
    .line 56
    :goto_3
    or-int/2addr v0, v3

    .line 57
    :cond_4
    and-int/lit16 v3, v14, 0x180

    .line 58
    .line 59
    move-object/from16 v9, p3

    .line 60
    .line 61
    if-nez v3, :cond_6

    .line 62
    .line 63
    invoke-virtual {v13, v9}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-eqz v3, :cond_5

    .line 68
    .line 69
    const/16 v3, 0x100

    .line 70
    .line 71
    goto :goto_4

    .line 72
    :cond_5
    const/16 v3, 0x80

    .line 73
    .line 74
    :goto_4
    or-int/2addr v0, v3

    .line 75
    :cond_6
    and-int/lit16 v3, v14, 0xc00

    .line 76
    .line 77
    move-object/from16 v5, p4

    .line 78
    .line 79
    if-nez v3, :cond_8

    .line 80
    .line 81
    invoke-virtual {v13, v5}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    if-eqz v3, :cond_7

    .line 86
    .line 87
    const/16 v3, 0x800

    .line 88
    .line 89
    goto :goto_5

    .line 90
    :cond_7
    const/16 v3, 0x400

    .line 91
    .line 92
    :goto_5
    or-int/2addr v0, v3

    .line 93
    :cond_8
    and-int/lit16 v3, v14, 0x6000

    .line 94
    .line 95
    move-object/from16 v12, p5

    .line 96
    .line 97
    if-nez v3, :cond_a

    .line 98
    .line 99
    invoke-virtual {v13, v12}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    if-eqz v3, :cond_9

    .line 104
    .line 105
    const/16 v3, 0x4000

    .line 106
    .line 107
    goto :goto_6

    .line 108
    :cond_9
    const/16 v3, 0x2000

    .line 109
    .line 110
    :goto_6
    or-int/2addr v0, v3

    .line 111
    :cond_a
    move v15, v0

    .line 112
    and-int/lit16 v0, v15, 0x2493

    .line 113
    .line 114
    const/16 v3, 0x2492

    .line 115
    .line 116
    if-eq v0, v3, :cond_b

    .line 117
    .line 118
    const/4 v0, 0x1

    .line 119
    goto :goto_7

    .line 120
    :cond_b
    const/4 v0, 0x0

    .line 121
    :goto_7
    and-int/lit8 v3, v15, 0x1

    .line 122
    .line 123
    invoke-virtual {v13, v3, v0}, Li0/h0;->S(IZ)Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-eqz v0, :cond_28

    .line 128
    .line 129
    and-int/lit8 v0, v15, 0x70

    .line 130
    .line 131
    if-eq v0, v4, :cond_d

    .line 132
    .line 133
    and-int/lit8 v3, v15, 0x40

    .line 134
    .line 135
    if-eqz v3, :cond_c

    .line 136
    .line 137
    invoke-virtual {v13, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    if-eqz v3, :cond_c

    .line 142
    .line 143
    goto :goto_8

    .line 144
    :cond_c
    const/4 v3, 0x0

    .line 145
    goto :goto_9

    .line 146
    :cond_d
    :goto_8
    const/4 v3, 0x1

    .line 147
    :goto_9
    invoke-virtual {v13}, Li0/h0;->P()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v8

    .line 151
    sget-object v10, Li0/l;->a:Li0/e;

    .line 152
    .line 153
    if-nez v3, :cond_e

    .line 154
    .line 155
    if-ne v8, v10, :cond_f

    .line 156
    .line 157
    :cond_e
    invoke-static {v2}, Lc9/o2;->i(Landroid/content/Context;)Ljava/util/List;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    invoke-static {v3}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 162
    .line 163
    .line 164
    move-result-object v8

    .line 165
    invoke-virtual {v13, v8}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    :cond_f
    check-cast v8, Li0/a1;

    .line 169
    .line 170
    if-eq v0, v4, :cond_11

    .line 171
    .line 172
    and-int/lit8 v3, v15, 0x40

    .line 173
    .line 174
    if-eqz v3, :cond_10

    .line 175
    .line 176
    invoke-virtual {v13, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result v3

    .line 180
    if-eqz v3, :cond_10

    .line 181
    .line 182
    goto :goto_a

    .line 183
    :cond_10
    const/4 v3, 0x0

    .line 184
    goto :goto_b

    .line 185
    :cond_11
    :goto_a
    const/4 v3, 0x1

    .line 186
    :goto_b
    invoke-virtual {v13}, Li0/h0;->P()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v11

    .line 190
    if-nez v3, :cond_12

    .line 191
    .line 192
    if-ne v11, v10, :cond_13

    .line 193
    .line 194
    :cond_12
    sget-object v3, Lc9/e1;->g:Lc9/e1;

    .line 195
    .line 196
    invoke-static {v3}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 197
    .line 198
    .line 199
    move-result-object v11

    .line 200
    invoke-virtual {v13, v11}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    :cond_13
    check-cast v11, Li0/a1;

    .line 204
    .line 205
    if-eq v0, v4, :cond_15

    .line 206
    .line 207
    and-int/lit8 v3, v15, 0x40

    .line 208
    .line 209
    if-eqz v3, :cond_14

    .line 210
    .line 211
    invoke-virtual {v13, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v3

    .line 215
    if-eqz v3, :cond_14

    .line 216
    .line 217
    goto :goto_c

    .line 218
    :cond_14
    const/4 v3, 0x0

    .line 219
    goto :goto_d

    .line 220
    :cond_15
    :goto_c
    const/4 v3, 0x1

    .line 221
    :goto_d
    invoke-virtual {v13}, Li0/h0;->P()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v6

    .line 225
    const-string v17, ""

    .line 226
    .line 227
    if-nez v3, :cond_16

    .line 228
    .line 229
    if-ne v6, v10, :cond_17

    .line 230
    .line 231
    :cond_16
    invoke-static/range {v17 .. v17}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 232
    .line 233
    .line 234
    move-result-object v6

    .line 235
    invoke-virtual {v13, v6}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    :cond_17
    check-cast v6, Li0/a1;

    .line 239
    .line 240
    invoke-interface {v8}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v3

    .line 244
    check-cast v3, Ljava/util/List;

    .line 245
    .line 246
    if-eq v0, v4, :cond_19

    .line 247
    .line 248
    and-int/lit8 v18, v15, 0x40

    .line 249
    .line 250
    if-eqz v18, :cond_18

    .line 251
    .line 252
    invoke-virtual {v13, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    move-result v18

    .line 256
    if-eqz v18, :cond_18

    .line 257
    .line 258
    goto :goto_e

    .line 259
    :cond_18
    const/16 v18, 0x0

    .line 260
    .line 261
    goto :goto_f

    .line 262
    :cond_19
    :goto_e
    const/16 v18, 0x1

    .line 263
    .line 264
    :goto_f
    invoke-virtual {v13, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    move-result v3

    .line 268
    or-int v3, v18, v3

    .line 269
    .line 270
    invoke-virtual {v13}, Li0/h0;->P()Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v7

    .line 274
    if-nez v3, :cond_1a

    .line 275
    .line 276
    if-ne v7, v10, :cond_1b

    .line 277
    .line 278
    :cond_1a
    invoke-interface {v8}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v3

    .line 282
    check-cast v3, Ljava/util/List;

    .line 283
    .line 284
    invoke-static {v1, v3}, Lc9/j1;->s(Lc9/o2;Ljava/util/List;)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v3

    .line 288
    invoke-static {v3}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 289
    .line 290
    .line 291
    move-result-object v7

    .line 292
    invoke-virtual {v13, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 293
    .line 294
    .line 295
    :cond_1b
    move-object v3, v7

    .line 296
    check-cast v3, Li0/a1;

    .line 297
    .line 298
    if-eq v0, v4, :cond_1d

    .line 299
    .line 300
    and-int/lit8 v7, v15, 0x40

    .line 301
    .line 302
    if-eqz v7, :cond_1c

    .line 303
    .line 304
    invoke-virtual {v13, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 305
    .line 306
    .line 307
    move-result v7

    .line 308
    if-eqz v7, :cond_1c

    .line 309
    .line 310
    goto :goto_10

    .line 311
    :cond_1c
    const/4 v7, 0x0

    .line 312
    goto :goto_11

    .line 313
    :cond_1d
    :goto_10
    const/4 v7, 0x1

    .line 314
    :goto_11
    invoke-virtual {v13}, Li0/h0;->P()Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v4

    .line 318
    if-nez v7, :cond_1e

    .line 319
    .line 320
    if-ne v4, v10, :cond_1f

    .line 321
    .line 322
    :cond_1e
    invoke-static/range {v17 .. v17}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 323
    .line 324
    .line 325
    move-result-object v4

    .line 326
    invoke-virtual {v13, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 327
    .line 328
    .line 329
    :cond_1f
    check-cast v4, Li0/a1;

    .line 330
    .line 331
    const/16 v7, 0x20

    .line 332
    .line 333
    if-eq v0, v7, :cond_21

    .line 334
    .line 335
    and-int/lit8 v7, v15, 0x40

    .line 336
    .line 337
    if-eqz v7, :cond_20

    .line 338
    .line 339
    invoke-virtual {v13, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    move-result v7

    .line 343
    if-eqz v7, :cond_20

    .line 344
    .line 345
    goto :goto_12

    .line 346
    :cond_20
    const/4 v7, 0x0

    .line 347
    goto :goto_13

    .line 348
    :cond_21
    :goto_12
    const/4 v7, 0x1

    .line 349
    :goto_13
    invoke-virtual {v13}, Li0/h0;->P()Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v2

    .line 353
    if-nez v7, :cond_22

    .line 354
    .line 355
    if-ne v2, v10, :cond_23

    .line 356
    .line 357
    :cond_22
    const/4 v2, 0x0

    .line 358
    invoke-static {v2}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 359
    .line 360
    .line 361
    move-result-object v2

    .line 362
    invoke-virtual {v13, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 363
    .line 364
    .line 365
    :cond_23
    check-cast v2, Li0/a1;

    .line 366
    .line 367
    const/16 v7, 0x20

    .line 368
    .line 369
    if-eq v0, v7, :cond_25

    .line 370
    .line 371
    and-int/lit8 v0, v15, 0x40

    .line 372
    .line 373
    if-eqz v0, :cond_24

    .line 374
    .line 375
    invoke-virtual {v13, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 376
    .line 377
    .line 378
    move-result v0

    .line 379
    if-eqz v0, :cond_24

    .line 380
    .line 381
    goto :goto_14

    .line 382
    :cond_24
    const/16 v16, 0x0

    .line 383
    .line 384
    goto :goto_15

    .line 385
    :cond_25
    :goto_14
    const/16 v16, 0x1

    .line 386
    .line 387
    :goto_15
    invoke-virtual {v13}, Li0/h0;->P()Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v0

    .line 391
    if-nez v16, :cond_26

    .line 392
    .line 393
    if-ne v0, v10, :cond_27

    .line 394
    .line 395
    :cond_26
    sget-object v0, Ltf/v;->g:Ltf/v;

    .line 396
    .line 397
    invoke-static {v0}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 398
    .line 399
    .line 400
    move-result-object v0

    .line 401
    invoke-virtual {v13, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 402
    .line 403
    .line 404
    :cond_27
    check-cast v0, Li0/a1;

    .line 405
    .line 406
    move-object v10, v8

    .line 407
    move-object v8, v4

    .line 408
    move-object v4, v11

    .line 409
    move-object v11, v0

    .line 410
    new-instance v0, Lc9/s0;

    .line 411
    .line 412
    move-object v7, v5

    .line 413
    move-object v5, v9

    .line 414
    move-object v9, v2

    .line 415
    move-object v2, v6

    .line 416
    move-object/from16 v6, p1

    .line 417
    .line 418
    invoke-direct/range {v0 .. v12}, Lc9/s0;-><init>(Lc9/o2;Li0/a1;Li0/a1;Li0/a1;Lfg/a;Landroid/app/Activity;Lfg/a;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Lfg/a;)V

    .line 419
    .line 420
    .line 421
    const v1, 0x752c6e83

    .line 422
    .line 423
    .line 424
    invoke-static {v1, v0, v13}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 425
    .line 426
    .line 427
    move-result-object v0

    .line 428
    shl-int/lit8 v1, v15, 0x12

    .line 429
    .line 430
    const/high16 v2, 0xe000000

    .line 431
    .line 432
    and-int/2addr v1, v2

    .line 433
    or-int/lit16 v1, v1, 0x186

    .line 434
    .line 435
    const/16 v18, 0xc00

    .line 436
    .line 437
    move-object v15, v0

    .line 438
    const/4 v0, 0x0

    .line 439
    move/from16 v17, v1

    .line 440
    .line 441
    const-string v1, "\u804a\u5929\u5206\u7ec4"

    .line 442
    .line 443
    const-wide/16 v2, 0x0

    .line 444
    .line 445
    const-wide/16 v4, 0x0

    .line 446
    .line 447
    const-wide/16 v6, 0x0

    .line 448
    .line 449
    const/4 v8, 0x0

    .line 450
    const-wide/16 v10, 0x0

    .line 451
    .line 452
    const-wide/16 v12, 0x0

    .line 453
    .line 454
    const/4 v14, 0x0

    .line 455
    move-object/from16 v9, p3

    .line 456
    .line 457
    move-object/from16 v16, p6

    .line 458
    .line 459
    invoke-static/range {v0 .. v18}, Loh/h;->d(Ly0/o;Ljava/lang/String;JJJZLfg/a;JJZLs0/d;Li0/h0;II)V

    .line 460
    .line 461
    .line 462
    goto :goto_16

    .line 463
    :cond_28
    invoke-virtual/range {p6 .. p6}, Li0/h0;->V()V

    .line 464
    .line 465
    .line 466
    :goto_16
    invoke-virtual/range {p6 .. p6}, Li0/h0;->t()Li0/r1;

    .line 467
    .line 468
    .line 469
    move-result-object v8

    .line 470
    if-eqz v8, :cond_29

    .line 471
    .line 472
    new-instance v0, Lc9/t0;

    .line 473
    .line 474
    move-object/from16 v1, p0

    .line 475
    .line 476
    move-object/from16 v2, p1

    .line 477
    .line 478
    move-object/from16 v3, p2

    .line 479
    .line 480
    move-object/from16 v4, p3

    .line 481
    .line 482
    move-object/from16 v5, p4

    .line 483
    .line 484
    move-object/from16 v6, p5

    .line 485
    .line 486
    move/from16 v7, p7

    .line 487
    .line 488
    invoke-direct/range {v0 .. v7}, Lc9/t0;-><init>(Lc9/j1;Landroid/app/Activity;Lc9/o2;Lfg/a;Lfg/a;Lfg/a;I)V

    .line 489
    .line 490
    .line 491
    iput-object v0, v8, Li0/r1;->d:Lfg/p;

    .line 492
    .line 493
    :cond_29
    return-void
.end method

.method public final q(Ljava/lang/String;Lfg/l;Li0/h0;I)V
    .locals 9

    .line 1
    const v0, -0x29c178f1

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 5
    .line 6
    .line 7
    and-int/lit8 v0, p4, 0x6

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p3, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x4

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x2

    .line 20
    :goto_0
    or-int/2addr v0, p4

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move v0, p4

    .line 23
    :goto_1
    and-int/lit8 v1, p4, 0x30

    .line 24
    .line 25
    if-nez v1, :cond_3

    .line 26
    .line 27
    invoke-virtual {p3, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    const/16 v1, 0x20

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_2
    const/16 v1, 0x10

    .line 37
    .line 38
    :goto_2
    or-int/2addr v0, v1

    .line 39
    :cond_3
    and-int/lit16 v1, p4, 0x180

    .line 40
    .line 41
    if-nez v1, :cond_5

    .line 42
    .line 43
    invoke-virtual {p3, p0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    if-eqz v5, :cond_4

    .line 48
    .line 49
    const/16 v5, 0x100

    .line 50
    .line 51
    goto :goto_3

    .line 52
    :cond_4
    const/16 v5, 0x80

    .line 53
    .line 54
    :goto_3
    or-int/2addr v0, v5

    .line 55
    :cond_5
    and-int/lit16 v5, v0, 0x93

    .line 56
    .line 57
    const/16 v6, 0x92

    .line 58
    .line 59
    const/4 v7, 0x1

    .line 60
    if-eq v5, v6, :cond_6

    .line 61
    .line 62
    move v5, v7

    .line 63
    goto :goto_4

    .line 64
    :cond_6
    const/4 v5, 0x0

    .line 65
    :goto_4
    and-int/lit8 v6, v0, 0x1

    .line 66
    .line 67
    invoke-virtual {p3, v6, v5}, Li0/h0;->S(IZ)Z

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    if-eqz v5, :cond_7

    .line 72
    .line 73
    const/16 v5, 0x8

    .line 74
    .line 75
    int-to-float v5, v5

    .line 76
    sget-object v6, Ly0/l;->a:Ly0/l;

    .line 77
    .line 78
    const/4 v8, 0x0

    .line 79
    invoke-static {v6, v8, v5, v7}, Lp/d;->n(Ly0/o;FFI)Ly0/o;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    and-int/lit8 v5, v0, 0xe

    .line 84
    .line 85
    or-int/lit16 v5, v5, 0xc30

    .line 86
    .line 87
    shl-int/lit8 v6, v0, 0x3

    .line 88
    .line 89
    and-int/lit16 v6, v6, 0x380

    .line 90
    .line 91
    or-int/2addr v5, v6

    .line 92
    const v6, 0xe000

    .line 93
    .line 94
    .line 95
    shl-int/lit8 v0, v0, 0x6

    .line 96
    .line 97
    and-int/2addr v0, v6

    .line 98
    or-int/2addr v0, v5

    .line 99
    const/4 v2, 0x0

    .line 100
    const-string v6, "\u641c\u7d22\u804a\u5929\u5206\u7ec4"

    .line 101
    .line 102
    move-object v5, p1

    .line 103
    move-object v3, p2

    .line 104
    move-object v4, p3

    .line 105
    move v1, v0

    .line 106
    move-object v0, p0

    .line 107
    invoke-virtual/range {v0 .. v7}, Lc9/j1;->g(IILfg/l;Li0/h0;Ljava/lang/String;Ljava/lang/String;Ly0/o;)V

    .line 108
    .line 109
    .line 110
    goto :goto_5

    .line 111
    :cond_7
    invoke-virtual {p3}, Li0/h0;->V()V

    .line 112
    .line 113
    .line 114
    :goto_5
    invoke-virtual {p3}, Li0/h0;->t()Li0/r1;

    .line 115
    .line 116
    .line 117
    move-result-object v6

    .line 118
    if-eqz v6, :cond_8

    .line 119
    .line 120
    new-instance v0, Lb0/r;

    .line 121
    .line 122
    const/4 v5, 0x1

    .line 123
    move-object v1, p0

    .line 124
    move-object v2, p1

    .line 125
    move-object v3, p2

    .line 126
    move v4, p4

    .line 127
    invoke-direct/range {v0 .. v5}, Lb0/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 128
    .line 129
    .line 130
    iput-object v0, v6, Li0/r1;->d:Lfg/p;

    .line 131
    .line 132
    :cond_8
    return-void
.end method

.method public final r(Ljava/lang/String;Li0/h0;I)V
    .locals 23

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    const v1, -0x71d547b8

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, Li0/h0;->b0(I)Li0/h0;

    .line 7
    .line 8
    .line 9
    and-int/lit8 v1, p3, 0x3

    .line 10
    .line 11
    const/4 v2, 0x2

    .line 12
    if-eq v1, v2, :cond_0

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v1, 0x0

    .line 17
    :goto_0
    and-int/lit8 v2, p3, 0x1

    .line 18
    .line 19
    invoke-virtual {v0, v2, v1}, Li0/h0;->S(IZ)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    sget-object v1, Lbi/d;->a:Li0/m2;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Lbi/b;

    .line 32
    .line 33
    invoke-virtual {v1}, Lbi/b;->g()J

    .line 34
    .line 35
    .line 36
    move-result-wide v2

    .line 37
    const/16 v1, 0x10

    .line 38
    .line 39
    invoke-static {v1}, Lx6/d;->D(I)J

    .line 40
    .line 41
    .line 42
    move-result-wide v4

    .line 43
    sget-object v6, Lm2/k;->j:Lm2/k;

    .line 44
    .line 45
    sget-object v1, Ly0/l;->a:Ly0/l;

    .line 46
    .line 47
    const/high16 v7, 0x3f800000    # 1.0f

    .line 48
    .line 49
    invoke-static {v1, v7}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 50
    .line 51
    .line 52
    move-result-object v8

    .line 53
    const/16 v1, 0xa

    .line 54
    .line 55
    int-to-float v12, v1

    .line 56
    const/4 v13, 0x7

    .line 57
    const/4 v9, 0x0

    .line 58
    const/4 v10, 0x0

    .line 59
    const/4 v11, 0x0

    .line 60
    invoke-static/range {v8 .. v13}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    const/16 v21, 0x0

    .line 65
    .line 66
    const v22, 0x3ffa8

    .line 67
    .line 68
    .line 69
    const/4 v7, 0x0

    .line 70
    const-wide/16 v8, 0x0

    .line 71
    .line 72
    const/4 v10, 0x0

    .line 73
    const-wide/16 v11, 0x0

    .line 74
    .line 75
    const/4 v13, 0x0

    .line 76
    const/4 v14, 0x0

    .line 77
    const/4 v15, 0x0

    .line 78
    const/16 v16, 0x0

    .line 79
    .line 80
    const/16 v17, 0x0

    .line 81
    .line 82
    const/16 v18, 0x0

    .line 83
    .line 84
    const v20, 0x186036

    .line 85
    .line 86
    .line 87
    move-object/from16 v19, v0

    .line 88
    .line 89
    move-object/from16 v0, p1

    .line 90
    .line 91
    invoke-static/range {v0 .. v22}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_1
    invoke-virtual/range {p2 .. p2}, Li0/h0;->V()V

    .line 96
    .line 97
    .line 98
    :goto_1
    invoke-virtual/range {p2 .. p2}, Li0/h0;->t()Li0/r1;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    if-eqz v0, :cond_2

    .line 103
    .line 104
    new-instance v1, Lb0/q;

    .line 105
    .line 106
    const/4 v2, 0x3

    .line 107
    move-object/from16 v3, p0

    .line 108
    .line 109
    move-object/from16 v4, p1

    .line 110
    .line 111
    move/from16 v5, p3

    .line 112
    .line 113
    invoke-direct {v1, v3, v4, v5, v2}, Lb0/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 114
    .line 115
    .line 116
    iput-object v1, v0, Li0/r1;->d:Lfg/p;

    .line 117
    .line 118
    return-void

    .line 119
    :cond_2
    move-object/from16 v3, p0

    .line 120
    .line 121
    return-void
.end method
