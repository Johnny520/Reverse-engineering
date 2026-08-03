.class public final Lrg/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public h:Ljava/lang/Runnable;

.field public final synthetic i:Lqg/p;


# direct methods
.method public constructor <init>(Lqg/g;Lrg/e;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lrg/d;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lrg/d;->h:Ljava/lang/Runnable;

    .line 8
    .line 9
    iput-object p2, p0, Lrg/d;->i:Lqg/p;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Lvg/g;Ljava/lang/Runnable;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lrg/d;->g:I

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrg/d;->i:Lqg/p;

    iput-object p2, p0, Lrg/d;->h:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Lrg/d;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lrg/d;->i:Lqg/p;

    .line 7
    .line 8
    check-cast v0, Lvg/g;

    .line 9
    .line 10
    iget-object v1, v0, Lvg/g;->j:Lqg/p;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    :cond_0
    :try_start_0
    iget-object v3, p0, Lrg/d;->h:Ljava/lang/Runnable;

    .line 14
    .line 15
    invoke-interface {v3}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception v3

    .line 20
    sget-object v4, Lwf/h;->g:Lwf/h;

    .line 21
    .line 22
    invoke-static {v3, v4}, Lqg/v;->m(Ljava/lang/Throwable;Lwf/g;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    invoke-virtual {v0}, Lvg/g;->z()Ljava/lang/Runnable;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    if-nez v3, :cond_1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    iput-object v3, p0, Lrg/d;->h:Ljava/lang/Runnable;

    .line 33
    .line 34
    add-int/lit8 v2, v2, 0x1

    .line 35
    .line 36
    const/16 v3, 0x10

    .line 37
    .line 38
    if-lt v2, v3, :cond_0

    .line 39
    .line 40
    invoke-virtual {v1, v0}, Lqg/p;->x(Lwf/g;)Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-eqz v3, :cond_0

    .line 45
    .line 46
    invoke-virtual {v1, v0, p0}, Lqg/p;->w(Lwf/g;Ljava/lang/Runnable;)V

    .line 47
    .line 48
    .line 49
    :goto_1
    return-void

    .line 50
    :pswitch_0
    iget-object v0, p0, Lrg/d;->h:Ljava/lang/Runnable;

    .line 51
    .line 52
    check-cast v0, Lqg/g;

    .line 53
    .line 54
    iget-object v1, p0, Lrg/d;->i:Lqg/p;

    .line 55
    .line 56
    check-cast v1, Lrg/e;

    .line 57
    .line 58
    sget-object v2, Lsf/n;->a:Lsf/n;

    .line 59
    .line 60
    invoke-virtual {v0, v1, v2}, Lqg/g;->B(Lqg/p;Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
