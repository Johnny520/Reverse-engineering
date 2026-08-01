.class public final synthetic Lq0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroidx/compose/ui/platform/AndroidComposeView;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/platform/AndroidComposeView;I)V
    .locals 0

    .line 1
    iput p2, p0, Lq0;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lq0;->ζ:Landroidx/compose/ui/platform/AndroidComposeView;

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
    .locals 3

    .line 1
    iget v0, p0, Lq0;->ε:I

    .line 2
    .line 3
    iget-object p0, p0, Lq0;->ζ:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRoot()Lyp0;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-static {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->ν(Lyp0;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    const/4 v0, 0x0

    .line 17
    iput-boolean v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->В:Z

    .line 18
    .line 19
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->ч:Landroid/view/MotionEvent;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/16 v2, 0xa

    .line 29
    .line 30
    if-ne v1, v2, :cond_0

    .line 31
    .line 32
    invoke-virtual {p0, v0}, Landroidx/compose/ui/platform/AndroidComposeView;->Η(Landroid/view/MotionEvent;)I

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const-string p0, "The ACTION_HOVER_EXIT event was not cleared."

    .line 37
    .line 38
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    :goto_0
    return-void

    .line 42
    :pswitch_1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->μ:Lw6;

    .line 43
    .line 44
    sget-object v0, Landroidx/compose/ui/platform/AndroidComposeView;->М:Ljava/lang/Class;

    .line 45
    .line 46
    const-string v0, "AndroidOwner:outOfFrameExecutor"

    .line 47
    .line 48
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    :goto_1
    :try_start_0
    invoke-virtual {p0}, Lw6;->isEmpty()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_1

    .line 56
    .line 57
    invoke-virtual {p0}, Lw6;->removeLast()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    check-cast v0, Lp70;

    .line 62
    .line 63
    invoke-interface {v0}, Lp70;->invoke()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :catchall_0
    move-exception p0

    .line 72
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 73
    .line 74
    .line 75
    throw p0

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
