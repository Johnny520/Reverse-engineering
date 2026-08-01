.class public final synthetic Lj9;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Object;

.field public final synthetic η:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Lj9;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lj9;->ζ:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lj9;->η:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 2

    .line 1
    iget p1, p0, Lj9;->ε:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lj9;->ζ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Landroid/os/Handler;

    .line 9
    .line 10
    iget-object p0, p0, Lj9;->η:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Lub1;

    .line 13
    .line 14
    invoke-virtual {p1, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    iget-object p1, p0, Lj9;->ζ:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p1, Lum1;

    .line 21
    .line 22
    iget-object p0, p0, Lj9;->η:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p0, Landroid/graphics/Bitmap;

    .line 25
    .line 26
    iget-object v0, p1, Lum1;->ε:Ljava/lang/Object;

    .line 27
    .line 28
    if-eq v0, p0, :cond_0

    .line 29
    .line 30
    check-cast v0, Landroid/graphics/Bitmap;

    .line 31
    .line 32
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-nez p0, :cond_0

    .line 37
    .line 38
    iget-object p0, p1, Lum1;->ε:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p0, Landroid/graphics/Bitmap;

    .line 41
    .line 42
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->recycle()V

    .line 43
    .line 44
    .line 45
    :cond_0
    return-void

    .line 46
    :pswitch_1
    iget-object p1, p0, Lj9;->ζ:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 49
    .line 50
    iget-object p0, p0, Lj9;->η:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p0, Lo7;

    .line 53
    .line 54
    const/4 v0, 0x0

    .line 55
    const/4 v1, 0x1

    .line 56
    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-eqz p1, :cond_1

    .line 61
    .line 62
    :try_start_0
    invoke-virtual {p0}, Lo7;->invoke()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    sget-object p0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :catchall_0
    move-exception p0

    .line 69
    new-instance p1, Leo1;

    .line 70
    .line 71
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 72
    .line 73
    .line 74
    move-object p0, p1

    .line 75
    :goto_0
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    if-eqz p0, :cond_1

    .line 80
    .line 81
    const-string p1, "r24de9f070d18b34b"

    .line 82
    .line 83
    const-string v0, "\u516c\u544a\u5f39\u7a97\u5173\u95ed \u56de\u8c03\u6267\u884c\u5931\u8d25"

    .line 84
    .line 85
    invoke-static {p1, v0, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 86
    .line 87
    .line 88
    :cond_1
    return-void

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
