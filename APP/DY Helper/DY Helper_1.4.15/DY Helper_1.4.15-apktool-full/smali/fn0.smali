.class public final synthetic Lfn0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lp70;

.field public final synthetic η:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(ILp70;Landroid/app/Activity;)V
    .locals 0

    .line 1
    iput p1, p0, Lfn0;->ε:I

    .line 2
    .line 3
    iput-object p2, p0, Lfn0;->ζ:Lp70;

    .line 4
    .line 5
    iput-object p3, p0, Lfn0;->η:Landroid/app/Activity;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Lfn0;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lfn0;->ζ:Lp70;

    .line 7
    .line 8
    iget-object p0, p0, Lfn0;->η:Landroid/app/Activity;

    .line 9
    .line 10
    sget-object v1, Lwg1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    :try_start_0
    invoke-interface {v0}, Lp70;->invoke()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    .line 16
    :goto_0
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 17
    .line 18
    .line 19
    goto :goto_1

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    :try_start_1
    const-string v3, "rc62a71041a7416a5"

    .line 22
    .line 23
    const-string v4, "\u706b\u661f\u53d1\u9001\u6d4b\u8bd5\u5f02\u5e38"

    .line 24
    .line 25
    invoke-static {v3, v4, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    new-instance v3, Ltx0;

    .line 29
    .line 30
    const/4 v4, 0x4

    .line 31
    invoke-direct {v3, p0, v0, v4}, Ltx0;-><init>(Landroid/app/Activity;Ljava/lang/Throwable;I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v3}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :goto_1
    return-void

    .line 39
    :catchall_1
    move-exception p0

    .line 40
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 41
    .line 42
    .line 43
    throw p0

    .line 44
    :pswitch_0
    iget-object v0, p0, Lfn0;->ζ:Lp70;

    .line 45
    .line 46
    :try_start_2
    invoke-interface {v0}, Lp70;->invoke()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 50
    goto :goto_2

    .line 51
    :catchall_2
    move-exception v0

    .line 52
    new-instance v1, Leo1;

    .line 53
    .line 54
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 55
    .line 56
    .line 57
    move-object v0, v1

    .line 58
    :goto_2
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    if-eqz v0, :cond_0

    .line 63
    .line 64
    const-string v1, "DYHelper"

    .line 65
    .line 66
    const-string v2, "\u5206\u4eab\u9762\u677f\u5feb\u6377\u64cd\u4f5c\u6267\u884c\u5931\u8d25"

    .line 67
    .line 68
    invoke-static {v1, v2, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 69
    .line 70
    .line 71
    iget-object p0, p0, Lfn0;->η:Landroid/app/Activity;

    .line 72
    .line 73
    if-eqz p0, :cond_0

    .line 74
    .line 75
    const-string v0, "\u64cd\u4f5c\u6267\u884c\u5931\u8d25"

    .line 76
    .line 77
    const/4 v1, 0x0

    .line 78
    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 83
    .line 84
    .line 85
    :cond_0
    return-void

    .line 86
    nop

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
