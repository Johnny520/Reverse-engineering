.class public final Ld6/m;
.super Ljava/lang/ThreadLocal;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Ld6/m;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final initialValue()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Ld6/m;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Ly1/n0;

    .line 7
    .line 8
    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    invoke-static {v2}, La/a;->C(Landroid/os/Looper;)Landroid/os/Handler;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-direct {v0, v1, v2}, Ly1/n0;-><init>(Landroid/view/Choreographer;Landroid/os/Handler;)V

    .line 23
    .line 24
    .line 25
    iget-object v1, v0, Ly1/n0;->r:Li0/d;

    .line 26
    .line 27
    invoke-static {v0, v1}, Lf8/i;->q0(Lwf/e;Lwf/g;)Lwf/g;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const-string v0, "no Looper on this thread"

    .line 33
    .line 34
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    :goto_0
    return-object v0

    .line 39
    :pswitch_0
    new-instance v0, Lu4/n;

    .line 40
    .line 41
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 42
    .line 43
    .line 44
    return-object v0

    .line 45
    :pswitch_1
    new-instance v0, Ljava/util/Random;

    .line 46
    .line 47
    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    .line 48
    .line 49
    .line 50
    return-object v0

    .line 51
    :pswitch_2
    const/16 v0, 0x100

    .line 52
    .line 53
    new-array v0, v0, [C

    .line 54
    .line 55
    return-object v0

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
