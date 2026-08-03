.class public final synthetic Ly1/j;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ly1/t;


# direct methods
.method public synthetic constructor <init>(Ly1/t;I)V
    .locals 0

    .line 1
    iput p2, p0, Ly1/j;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Ly1/j;->h:Ly1/t;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Ly1/j;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ly1/j;->h:Ly1/t;

    .line 7
    .line 8
    invoke-virtual {v0}, Ly1/t;->getRoot()Lx1/f0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, Ly1/t;->p(Lx1/f0;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget-object v0, p0, Ly1/j;->h:Ly1/t;

    .line 17
    .line 18
    invoke-virtual {v0}, Ly1/t;->getRoot()Lx1/f0;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v0}, Ly1/t;->p(Lx1/f0;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_1
    const/4 v0, 0x0

    .line 27
    iget-object v1, p0, Ly1/j;->h:Ly1/t;

    .line 28
    .line 29
    iput-boolean v0, v1, Ly1/t;->K0:Z

    .line 30
    .line 31
    iget-object v0, v1, Ly1/t;->C0:Landroid/view/MotionEvent;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    const/16 v3, 0xa

    .line 41
    .line 42
    if-ne v2, v3, :cond_0

    .line 43
    .line 44
    invoke-virtual {v1, v0}, Ly1/t;->K(Landroid/view/MotionEvent;)I

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    const-string v0, "The ACTION_HOVER_EXIT event was not cleared."

    .line 49
    .line 50
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    :goto_0
    return-void

    .line 54
    :pswitch_2
    iget-object v0, p0, Ly1/j;->h:Ly1/t;

    .line 55
    .line 56
    iget-object v0, v0, Ly1/t;->o:Ltf/k;

    .line 57
    .line 58
    const-string v1, "AndroidOwner:outOfFrameExecutor"

    .line 59
    .line 60
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    :goto_1
    :try_start_0
    invoke-virtual {v0}, Ltf/k;->isEmpty()Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-nez v1, :cond_1

    .line 68
    .line 69
    invoke-virtual {v0}, Ltf/k;->removeLast()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    check-cast v1, Lfg/a;

    .line 74
    .line 75
    invoke-interface {v1}, Lfg/a;->invoke()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :catchall_0
    move-exception v0

    .line 80
    goto :goto_2

    .line 81
    :cond_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :goto_2
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 86
    .line 87
    .line 88
    throw v0

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
