.class public final synthetic Lau1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/app/Activity;

.field public final synthetic η:Ljava/lang/String;

.field public final synthetic θ:Z


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Ljava/lang/String;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lau1;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lau1;->ζ:Landroid/app/Activity;

    .line 8
    .line 9
    iput-object p2, p0, Lau1;->η:Ljava/lang/String;

    .line 10
    .line 11
    iput-boolean p3, p0, Lau1;->θ:Z

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(ZLandroid/app/Activity;Ljava/lang/String;)V
    .locals 1

    .line 14
    const/4 v0, 0x0

    iput v0, p0, Lau1;->ε:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lau1;->θ:Z

    iput-object p2, p0, Lau1;->ζ:Landroid/app/Activity;

    iput-object p3, p0, Lau1;->η:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Lau1;->ε:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-boolean v2, p0, Lau1;->θ:Z

    .line 5
    .line 6
    iget-object v3, p0, Lau1;->η:Ljava/lang/String;

    .line 7
    .line 8
    iget-object p0, p0, Lau1;->ζ:Landroid/app/Activity;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    :try_start_0
    invoke-static {p0, v3, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 18
    .line 19
    .line 20
    sget-object v0, Lf82;->α:Landroid/os/Handler;

    .line 21
    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    invoke-static {p0}, Lf82;->ν(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception p0

    .line 29
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    :cond_0
    :goto_0
    return-void

    .line 33
    :pswitch_0
    if-eqz v2, :cond_1

    .line 34
    .line 35
    :try_start_1
    invoke-static {p0}, Lx9;->ο(Landroid/content/Context;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 36
    .line 37
    .line 38
    :catchall_1
    invoke-static {p0, v3, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 43
    .line 44
    .line 45
    sget-object p0, Lbv1;->β:Landroid/app/AlertDialog;

    .line 46
    .line 47
    if-eqz p0, :cond_2

    .line 48
    .line 49
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    invoke-static {p0, v3, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 58
    .line 59
    .line 60
    :cond_2
    :goto_1
    return-void

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
