.class public final Le/r;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Le/r;->a:I

    iput-object p2, p0, Le/r;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    .line 1
    const-string v0, "android.intent.action.SCREEN_OFF"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget v2, p0, Le/r;->a:I

    .line 5
    .line 6
    packed-switch v2, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object p1, v1

    .line 17
    :goto_0
    const-string v0, "com.lu.wxmask.action.CONFIG_CHANGED"

    .line 18
    .line 19
    invoke-static {p1, v0}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-nez p1, :cond_1

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    const-string p1, "sourcePid"

    .line 27
    .line 28
    const/4 v0, -0x1

    .line 29
    invoke-virtual {p2, p1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    if-ne p1, p2, :cond_2

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    iget-object p1, p0, Le/r;->b:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, Landroid/content/Context;

    .line 43
    .line 44
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    const-string p2, "config changed broadcast received"

    .line 49
    .line 50
    filled-new-array {p2, p1}, [Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-static {p1}, Li0/a;->a([Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    sget-boolean p1, Lz0/i;->a:Z

    .line 58
    .line 59
    invoke-static {}, Lz0/g;->J()V

    .line 60
    .line 61
    .line 62
    invoke-static {v1}, Lz0/g;->q(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    sget-object p1, Lz0/d;->a:Lz0/c;

    .line 66
    .line 67
    sput-object v1, Lz0/d;->c:Lz0/b;

    .line 68
    .line 69
    sput-object v1, Lz0/d;->d:Ljava/lang/String;

    .line 70
    .line 71
    invoke-static {}, Lz0/g;->a()V

    .line 72
    .line 73
    .line 74
    :goto_1
    return-void

    .line 75
    :pswitch_0
    if-eqz p2, :cond_3

    .line 76
    .line 77
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    :cond_3
    invoke-static {v1, v0}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result p2

    .line 85
    if-eqz p2, :cond_4

    .line 86
    .line 87
    if-eqz p1, :cond_4

    .line 88
    .line 89
    iget-object p2, p0, Le/r;->b:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast p2, Lr0/M1;

    .line 92
    .line 93
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    invoke-static {p1}, Lr0/M1;->d(Landroid/content/Context;)V

    .line 97
    .line 98
    .line 99
    :cond_4
    return-void

    .line 100
    :pswitch_1
    if-eqz p2, :cond_5

    .line 101
    .line 102
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    :cond_5
    invoke-static {v1, v0}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    if-eqz p1, :cond_6

    .line 111
    .line 112
    iget-object p1, p0, Le/r;->b:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast p1, Lr0/y;

    .line 115
    .line 116
    const/4 p2, 0x1

    .line 117
    iput-boolean p2, p1, Lr0/y;->e:Z

    .line 118
    .line 119
    iget-object p1, p1, Lr0/y;->d:Lr0/w;

    .line 120
    .line 121
    if-eqz p1, :cond_6

    .line 122
    .line 123
    const-string p2, "screen-off"

    .line 124
    .line 125
    invoke-virtual {p1, p2}, Lr0/w;->j(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    :cond_6
    return-void

    .line 129
    :pswitch_2
    iget-object p1, p0, Le/r;->b:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast p1, Landroidx/fragment/app/g;

    .line 132
    .line 133
    invoke-virtual {p1}, Landroidx/fragment/app/g;->h()V

    .line 134
    .line 135
    .line 136
    return-void

    .line 137
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
