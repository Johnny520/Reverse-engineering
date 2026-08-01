.class public final Lz00;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lz00;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/view/View;Llc0;Ld4;Landroid/animation/ValueAnimator;)V
    .locals 0

    const/4 p2, 0x1

    iput p2, p0, Lz00;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz00;->b:Ljava/lang/Object;

    iput-object p3, p0, Lz00;->c:Ljava/lang/Object;

    iput-object p4, p0, Lz00;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget v0, p0, Lz00;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lz00;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroid/view/View;

    .line 9
    .line 10
    iget-object v1, p0, Lz00;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ld4;

    .line 13
    .line 14
    invoke-static {v0, v1}, Lhc0;->h(Landroid/view/View;Ld4;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lz00;->d:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Landroid/animation/ValueAnimator;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_0
    :try_start_0
    iget-object v0, p0, Lz00;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Lzk;

    .line 28
    .line 29
    invoke-virtual {v0}, Lzk;->call()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    goto :goto_0

    .line 34
    :catch_0
    const/4 v0, 0x0

    .line 35
    :goto_0
    iget-object v1, p0, Lz00;->c:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v1, Lal;

    .line 38
    .line 39
    iget-object v2, p0, Lz00;->d:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v2, Landroid/os/Handler;

    .line 42
    .line 43
    new-instance v3, Lh1;

    .line 44
    .line 45
    const/16 v4, 0x8

    .line 46
    .line 47
    const/4 v5, 0x0

    .line 48
    invoke-direct {v3, v1, v0, v4, v5}, Lh1;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
