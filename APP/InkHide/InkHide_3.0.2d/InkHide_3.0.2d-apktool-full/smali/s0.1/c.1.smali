.class public final synthetic Ls0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Li/q1;


# direct methods
.method public synthetic constructor <init>(Li/q1;I)V
    .locals 0

    .line 1
    iput p2, p0, Ls0/c;->b:I

    iput-object p1, p0, Ls0/c;->c:Li/q1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 5

    .line 1
    iget p1, p0, Ls0/c;->b:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Ls0/l;

    .line 7
    .line 8
    iget-object v0, p0, Ls0/c;->c:Li/q1;

    .line 9
    .line 10
    iget-object v1, v0, Li/q1;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ls0/g;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    iget-object v1, v1, Ln0/b;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 17
    .line 18
    const-string v2, "\u9009\u62e9\u8054\u7cfb\u4eba"

    .line 19
    .line 20
    const-string v3, "\u6dfb\u52a0"

    .line 21
    .line 22
    iget-object v4, v0, Li/q1;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v4, Landroid/app/Activity;

    .line 25
    .line 26
    invoke-direct {p1, v4, v1, v2, v3}, Ls0/l;-><init>(Landroid/app/Activity;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    new-instance v1, Ls0/b;

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    invoke-direct {v1, v0, v2}, Ls0/b;-><init>(Li/q1;I)V

    .line 33
    .line 34
    .line 35
    iput-object v1, p1, Ls0/l;->m:Ls0/b;

    .line 36
    .line 37
    invoke-virtual {p1}, Ls0/l;->h()V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    const-string p1, "listAdapter"

    .line 42
    .line 43
    invoke-static {p1}, LN0/g;->g(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const/4 p1, 0x0

    .line 47
    throw p1

    .line 48
    :pswitch_0
    iget-object p1, p0, Ls0/c;->c:Li/q1;

    .line 49
    .line 50
    iget-object v0, p1, Li/q1;->a:Landroid/view/View;

    .line 51
    .line 52
    check-cast v0, Lt0/e;

    .line 53
    .line 54
    invoke-virtual {v0}, Lt0/c;->a()V

    .line 55
    .line 56
    .line 57
    iget-object v0, p1, Li/q1;->g:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 60
    .line 61
    const/4 v1, 0x0

    .line 62
    const/4 v2, 0x1

    .line 63
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-nez v0, :cond_1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    iget-object v0, p1, Li/q1;->e:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v0, Ljava/util/concurrent/ExecutorService;

    .line 73
    .line 74
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 75
    .line 76
    .line 77
    iget-object p1, p1, Li/q1;->f:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast p1, Ls0/f;

    .line 80
    .line 81
    invoke-virtual {p1}, Landroid/util/LruCache;->evictAll()V

    .line 82
    .line 83
    .line 84
    :goto_0
    return-void

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
