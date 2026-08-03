.class public final synthetic Ln2/x;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Landroid/view/Choreographer$FrameCallback;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroidx/profileinstaller/ProfileInstallerInitializer;Landroid/content/Context;)V
    .locals 0

    .line 1
    const/4 p1, 0x2

    .line 2
    iput p1, p0, Ln2/x;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Ln2/x;->h:Ljava/lang/Object;

    .line 8
    .line 9
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Runnable;I)V
    .locals 0

    .line 10
    iput p2, p0, Ln2/x;->g:I

    iput-object p1, p0, Ln2/x;->h:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final doFrame(J)V
    .locals 3

    .line 1
    iget v0, p0, Ln2/x;->g:I

    .line 2
    .line 3
    iget-object v1, p0, Ln2/x;->h:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast v1, Landroid/content/Context;

    .line 9
    .line 10
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 11
    .line 12
    const/16 p2, 0x1c

    .line 13
    .line 14
    if-lt p1, p2, :cond_0

    .line 15
    .line 16
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-static {p1}, Lh3/c;->b(Landroid/os/Looper;)Landroid/os/Handler;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance p1, Landroid/os/Handler;

    .line 26
    .line 27
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 32
    .line 33
    .line 34
    :goto_0
    new-instance p2, Ljava/util/Random;

    .line 35
    .line 36
    invoke-direct {p2}, Ljava/util/Random;-><init>()V

    .line 37
    .line 38
    .line 39
    const/16 v0, 0x3e8

    .line 40
    .line 41
    const/4 v2, 0x1

    .line 42
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    invoke-virtual {p2, v0}, Ljava/util/Random;->nextInt(I)I

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    new-instance v0, Lc9/p1;

    .line 51
    .line 52
    const/4 v2, 0x3

    .line 53
    invoke-direct {v0, v1, v2}, Lc9/p1;-><init>(Landroid/content/Context;I)V

    .line 54
    .line 55
    .line 56
    add-int/lit16 p2, p2, 0x1388

    .line 57
    .line 58
    int-to-long v1, p2

    .line 59
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :pswitch_0
    check-cast v1, Lqg/g;

    .line 64
    .line 65
    sget-object v0, Lqg/c0;->a:Lxg/e;

    .line 66
    .line 67
    sget-object v0, Lvg/m;->a:Lrg/e;

    .line 68
    .line 69
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {v1, v0, p1}, Lqg/g;->B(Lqg/p;Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :pswitch_1
    check-cast v1, Ljava/lang/Runnable;

    .line 78
    .line 79
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
