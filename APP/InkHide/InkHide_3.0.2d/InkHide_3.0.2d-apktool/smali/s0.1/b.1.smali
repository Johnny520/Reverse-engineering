.class public final synthetic Ls0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM0/l;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Li/q1;


# direct methods
.method public synthetic constructor <init>(Li/q1;I)V
    .locals 0

    .line 1
    iput p2, p0, Ls0/b;->a:I

    iput-object p1, p0, Ls0/b;->b:Li/q1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Ls0/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lcom/lu/wxmask/bean/MaskItemBean;

    .line 7
    .line 8
    const-string v0, "maskItemBean"

    .line 9
    .line 10
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Ls0/b;->b:Li/q1;

    .line 14
    .line 15
    iget-object v1, v0, Li/q1;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Ls0/g;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    const-string v3, "listAdapter"

    .line 21
    .line 22
    if-eqz v1, :cond_5

    .line 23
    .line 24
    iget-object v1, v1, Ln0/b;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-eqz v4, :cond_2

    .line 44
    .line 45
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    check-cast v4, Lcom/lu/wxmask/bean/MaskItemBean;

    .line 50
    .line 51
    invoke-virtual {v4}, Lcom/lu/wxmask/bean/MaskItemBean;->getMaskId()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-virtual {p1}, Lcom/lu/wxmask/bean/MaskItemBean;->getMaskId()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    invoke-static {v4, v5}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-eqz v4, :cond_1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_2
    :goto_0
    iget-object v1, v0, Li/q1;->c:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v1, Ls0/g;

    .line 69
    .line 70
    if-eqz v1, :cond_4

    .line 71
    .line 72
    filled-new-array {p1}, [Lcom/lu/wxmask/bean/MaskItemBean;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    iget-object v1, v1, Ln0/b;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 77
    .line 78
    invoke-static {v1, p1}, LF0/q;->f0(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    iget-object p1, v0, Li/q1;->c:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast p1, Ls0/g;

    .line 84
    .line 85
    if-eqz p1, :cond_3

    .line 86
    .line 87
    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 88
    .line 89
    .line 90
    :goto_1
    sget-object p1, LE0/i;->a:LE0/i;

    .line 91
    .line 92
    return-object p1

    .line 93
    :cond_3
    invoke-static {v3}, LN0/g;->g(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    throw v2

    .line 97
    :cond_4
    invoke-static {v3}, LN0/g;->g(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    throw v2

    .line 101
    :cond_5
    invoke-static {v3}, LN0/g;->g(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    throw v2

    .line 105
    :pswitch_0
    check-cast p1, Lt0/c;

    .line 106
    .line 107
    const-string v0, "it"

    .line 108
    .line 109
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    iget-object p1, p0, Ls0/b;->b:Li/q1;

    .line 113
    .line 114
    iget-object v0, p1, Li/q1;->g:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 117
    .line 118
    const/4 v1, 0x0

    .line 119
    const/4 v2, 0x1

    .line 120
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-nez v0, :cond_6

    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_6
    iget-object v0, p1, Li/q1;->e:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v0, Ljava/util/concurrent/ExecutorService;

    .line 130
    .line 131
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 132
    .line 133
    .line 134
    iget-object p1, p1, Li/q1;->f:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast p1, Ls0/f;

    .line 137
    .line 138
    invoke-virtual {p1}, Landroid/util/LruCache;->evictAll()V

    .line 139
    .line 140
    .line 141
    :goto_2
    sget-object p1, LE0/i;->a:LE0/i;

    .line 142
    .line 143
    return-object p1

    .line 144
    nop

    .line 145
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
