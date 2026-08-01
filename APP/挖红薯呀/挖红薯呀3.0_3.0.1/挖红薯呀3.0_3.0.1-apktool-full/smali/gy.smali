.class public final Lgy;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic d:I

.field public e:Ljava/lang/Runnable;

.field public final synthetic f:Lrk;


# direct methods
.method public constructor <init>(Lfa0;Ljava/lang/Runnable;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lgy;->d:I

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgy;->f:Lrk;

    iput-object p2, p0, Lgy;->e:Ljava/lang/Runnable;

    return-void
.end method

.method public constructor <init>(Lwc;Lhy;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lgy;->d:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lgy;->e:Ljava/lang/Runnable;

    .line 8
    .line 9
    iput-object p2, p0, Lgy;->f:Lrk;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Lgy;->d:I

    .line 2
    .line 3
    iget-object v1, p0, Lgy;->f:Lrk;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object v0, v1

    .line 9
    check-cast v0, Lfa0;

    .line 10
    .line 11
    iget-object v2, v0, Lfa0;->g:Lrk;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    :cond_0
    :try_start_0
    iget-object v3, p0, Lgy;->e:Ljava/lang/Runnable;

    .line 15
    .line 16
    invoke-interface {v3}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v3

    .line 21
    sget-object v4, Lfs;->d:Lfs;

    .line 22
    .line 23
    invoke-static {v4, v3}, Lo30;->t(Lpk;Ljava/lang/Throwable;)V

    .line 24
    .line 25
    .line 26
    :goto_0
    invoke-virtual {v0}, Lfa0;->j()Ljava/lang/Runnable;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    if-nez v3, :cond_1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    iput-object v3, p0, Lgy;->e:Ljava/lang/Runnable;

    .line 34
    .line 35
    add-int/lit8 v1, v1, 0x1

    .line 36
    .line 37
    const/16 v3, 0x10

    .line 38
    .line 39
    if-lt v1, v3, :cond_0

    .line 40
    .line 41
    invoke-virtual {v2, v0}, Lrk;->f(Lpk;)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_0

    .line 46
    .line 47
    invoke-virtual {v2, v0, p0}, Lrk;->e(Lpk;Ljava/lang/Runnable;)V

    .line 48
    .line 49
    .line 50
    :goto_1
    return-void

    .line 51
    :pswitch_0
    iget-object p0, p0, Lgy;->e:Ljava/lang/Runnable;

    .line 52
    .line 53
    check-cast p0, Lwc;

    .line 54
    .line 55
    check-cast v1, Lhy;

    .line 56
    .line 57
    invoke-virtual {p0, v1}, Lwc;->H(Lrk;)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
