.class public final Lnb/u;
.super Landroid/content/BroadcastReceiver;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lnb/u;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lnb/u;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .line 1
    iget p1, p0, Lnb/u;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    :goto_0
    const-string v0, "h.Hchat.action.EXACT_TASK"

    .line 15
    .line 16
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-nez p1, :cond_1

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    const-string p1, "h.Hchat.extra.EXACT_TASK_KEY"

    .line 24
    .line 25
    invoke-virtual {p2, p1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    if-nez p1, :cond_2

    .line 30
    .line 31
    const-string p1, ""

    .line 32
    .line 33
    :cond_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_3

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_3
    iget-object v0, p0, Lnb/u;->b:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Lo8/j;

    .line 43
    .line 44
    const-string v1, "h.Hchat.extra.EXACT_TASK_TOKEN"

    .line 45
    .line 46
    const-wide/high16 v2, -0x8000000000000000L

    .line 47
    .line 48
    invoke-virtual {p2, v1, v2, v3}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 49
    .line 50
    .line 51
    move-result-wide v1

    .line 52
    invoke-virtual {v0, v1, v2, p1}, Lo8/j;->b(JLjava/lang/String;)V

    .line 53
    .line 54
    .line 55
    :goto_1
    return-void

    .line 56
    :pswitch_0
    iget-object p1, p0, Lnb/u;->b:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p1, Lnb/w;

    .line 59
    .line 60
    const/4 v0, 0x0

    .line 61
    if-eqz p2, :cond_4

    .line 62
    .line 63
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    goto :goto_2

    .line 68
    :cond_4
    move-object v1, v0

    .line 69
    :goto_2
    const-string v2, "android.media.VOLUME_CHANGED_ACTION"

    .line 70
    .line 71
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-nez v1, :cond_5

    .line 76
    .line 77
    goto :goto_4

    .line 78
    :cond_5
    const-string v1, "android.media.EXTRA_VOLUME_STREAM_TYPE"

    .line 79
    .line 80
    const/4 v2, -0x1

    .line 81
    invoke-virtual {p2, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    const/4 v3, 0x3

    .line 86
    if-eq v1, v3, :cond_6

    .line 87
    .line 88
    goto :goto_4

    .line 89
    :cond_6
    const-string v1, "android.media.EXTRA_VOLUME_STREAM_VALUE"

    .line 90
    .line 91
    invoke-virtual {p2, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    const-string v3, "android.media.EXTRA_PREV_VOLUME_STREAM_VALUE"

    .line 96
    .line 97
    invoke-virtual {p2, v3, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 98
    .line 99
    .line 100
    move-result p2

    .line 101
    if-ltz v1, :cond_a

    .line 102
    .line 103
    if-ltz p2, :cond_a

    .line 104
    .line 105
    if-ne v1, p2, :cond_7

    .line 106
    .line 107
    goto :goto_4

    .line 108
    :cond_7
    iget-object v2, p1, Lnb/w;->x:Ljava/lang/Integer;

    .line 109
    .line 110
    if-nez v2, :cond_8

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_8
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    if-ne v2, v1, :cond_9

    .line 118
    .line 119
    iput-object v0, p1, Lnb/w;->x:Ljava/lang/Integer;

    .line 120
    .line 121
    goto :goto_4

    .line 122
    :cond_9
    :goto_3
    iget-object v0, p1, Lnb/w;->b:Landroid/os/Handler;

    .line 123
    .line 124
    new-instance v2, Lnb/t;

    .line 125
    .line 126
    invoke-direct {v2, v1, p2, p1}, Lnb/t;-><init>(IILnb/w;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 130
    .line 131
    .line 132
    :cond_a
    :goto_4
    return-void

    .line 133
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
