.class public final synthetic Lwb/xs;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/Context;

.field public final synthetic i:Lfb/c;

.field public final synthetic j:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lfb/c;Li0/a1;I)V
    .locals 0

    .line 1
    iput p4, p0, Lwb/xs;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/xs;->h:Landroid/content/Context;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/xs;->i:Lfb/c;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/xs;->j:Li0/a1;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lwb/xs;->g:I

    .line 2
    .line 3
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object v4, p0, Lwb/xs;->j:Li0/a1;

    .line 8
    .line 9
    iget-object v5, p0, Lwb/xs;->i:Lfb/c;

    .line 10
    .line 11
    iget-object v6, p0, Lwb/xs;->h:Landroid/content/Context;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    sget-object v0, Lfb/o1;->a:Landroid/os/Handler;

    .line 17
    .line 18
    iget-object v0, v5, Lfb/c;->b:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    if-eqz v5, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    sget-object v5, Lfb/o1;->a:Landroid/os/Handler;

    .line 42
    .line 43
    new-instance v7, Leb/w;

    .line 44
    .line 45
    const/4 v8, 0x3

    .line 46
    invoke-direct {v7, v0, v6, v8}, Leb/w;-><init>(Ljava/lang/String;Landroid/content/Context;I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v5, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 50
    .line 51
    .line 52
    :goto_0
    const-string v0, "\u5f00\u59cb\u6717\u8bfb"

    .line 53
    .line 54
    invoke-static {v6, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 59
    .line 60
    .line 61
    invoke-interface {v4, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    return-object v1

    .line 65
    :pswitch_0
    const-string v0, "clipboard"

    .line 66
    .line 67
    invoke-virtual {v6, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    instance-of v7, v0, Landroid/content/ClipboardManager;

    .line 72
    .line 73
    if-eqz v7, :cond_1

    .line 74
    .line 75
    check-cast v0, Landroid/content/ClipboardManager;

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_1
    move-object v0, v2

    .line 79
    :goto_1
    if-eqz v0, :cond_2

    .line 80
    .line 81
    const-string v7, "\u63d2\u4ef6 Agent \u6d88\u606f"

    .line 82
    .line 83
    iget-object v5, v5, Lfb/c;->b:Ljava/lang/String;

    .line 84
    .line 85
    invoke-static {v7, v5}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    invoke-virtual {v0, v5}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 90
    .line 91
    .line 92
    :cond_2
    const-string v0, "\u6d88\u606f\u5df2\u590d\u5236"

    .line 93
    .line 94
    invoke-static {v6, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 99
    .line 100
    .line 101
    invoke-interface {v4, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    return-object v1

    .line 105
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
