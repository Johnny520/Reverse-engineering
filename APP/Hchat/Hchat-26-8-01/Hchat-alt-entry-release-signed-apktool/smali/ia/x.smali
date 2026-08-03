.class public final synthetic Lia/x;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lia/a0;


# direct methods
.method public synthetic constructor <init>(Lia/a0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lia/x;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lia/x;->h:Lia/a0;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lia/x;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lia/x;->h:Lia/a0;

    .line 7
    .line 8
    iget-object v0, v1, Lia/a0;->b:Lb5/c;

    .line 9
    .line 10
    invoke-virtual {v0}, Lb5/c;->d()Ljava/util/LinkedHashSet;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Ljava/lang/String;

    .line 29
    .line 30
    iget-object v3, v1, Lia/a0;->b:Lb5/c;

    .line 31
    .line 32
    invoke-virtual {v3, v2}, Lb5/c;->l(Ljava/lang/String;)Lia/c;

    .line 33
    .line 34
    .line 35
    move-result-object v8

    .line 36
    iget-object v9, v1, Lia/a0;->k:Ljava/lang/Object;

    .line 37
    .line 38
    monitor-enter v9

    .line 39
    :try_start_0
    invoke-virtual {v1, v2}, Lia/a0;->m(Ljava/lang/String;)Lp8/f;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    iget-object v3, v3, Lp8/f;->b:Ljava/lang/Object;

    .line 44
    .line 45
    if-eqz v3, :cond_0

    .line 46
    .line 47
    invoke-virtual {v1, v8}, Lia/a0;->d(Lia/c;)Lia/c;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-static {v8}, Lia/a0;->g(Lia/c;)Lia/c;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    invoke-virtual {v1}, Lia/a0;->f()Z

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    invoke-virtual {v1}, Lia/a0;->e()Z

    .line 60
    .line 61
    .line 62
    move-result v7

    .line 63
    invoke-virtual/range {v1 .. v7}, Lia/a0;->h(Ljava/lang/String;Ljava/lang/Object;Lia/c;Lia/c;ZZ)Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-eqz v3, :cond_0

    .line 68
    .line 69
    iget-object v3, v1, Lia/a0;->b:Lb5/c;

    .line 70
    .line 71
    invoke-virtual {v3, v2, v8}, Lb5/c;->a(Ljava/lang/String;Lia/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :catchall_0
    move-exception v0

    .line 76
    goto :goto_2

    .line 77
    :cond_0
    :goto_1
    monitor-exit v9

    .line 78
    goto :goto_0

    .line 79
    :goto_2
    monitor-exit v9

    .line 80
    throw v0

    .line 81
    :cond_1
    invoke-static {}, Lia/a0;->c()Landroid/app/Activity;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    if-eqz v0, :cond_2

    .line 86
    .line 87
    const/4 v2, 0x0

    .line 88
    invoke-virtual {v1, v0, v2}, Lia/a0;->n(Landroid/app/Activity;Landroid/view/View;)V

    .line 89
    .line 90
    .line 91
    :cond_2
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 92
    .line 93
    return-object v0

    .line 94
    :pswitch_0
    iget-object v0, p0, Lia/x;->h:Lia/a0;

    .line 95
    .line 96
    const-string v1, "androidx.recyclerview.widget.RecyclerView"

    .line 97
    .line 98
    iget-object v0, v0, Lia/a0;->a:Lr8/g;

    .line 99
    .line 100
    iget-object v0, v0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 101
    .line 102
    invoke-static {v1, v0}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    return-object v0

    .line 107
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
