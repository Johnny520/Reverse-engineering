.class public final synthetic Lwb/li;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/Context;

.field public final synthetic i:Landroid/content/SharedPreferences;

.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Li0/a1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lwb/li;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/li;->h:Landroid/content/Context;

    .line 8
    .line 9
    iput-object p2, p0, Lwb/li;->i:Landroid/content/SharedPreferences;

    .line 10
    .line 11
    iput-object p3, p0, Lwb/li;->j:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p4, p0, Lwb/li;->k:Li0/a1;

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Li0/a1;Landroid/content/SharedPreferences;Ljava/lang/String;)V
    .locals 1

    .line 16
    const/4 v0, 0x0

    iput v0, p0, Lwb/li;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/li;->h:Landroid/content/Context;

    iput-object p2, p0, Lwb/li;->k:Li0/a1;

    iput-object p3, p0, Lwb/li;->i:Landroid/content/SharedPreferences;

    iput-object p4, p0, Lwb/li;->j:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/SharedPreferences;Ljava/lang/String;Landroid/content/Context;Li0/a1;)V
    .locals 1

    .line 17
    const/4 v0, 0x2

    iput v0, p0, Lwb/li;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/li;->i:Landroid/content/SharedPreferences;

    iput-object p2, p0, Lwb/li;->j:Ljava/lang/String;

    iput-object p3, p0, Lwb/li;->h:Landroid/content/Context;

    iput-object p4, p0, Lwb/li;->k:Li0/a1;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lwb/li;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/li;->k:Li0/a1;

    .line 7
    .line 8
    const-string v1, ""

    .line 9
    .line 10
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lwb/li;->i:Landroid/content/SharedPreferences;

    .line 14
    .line 15
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v2, p0, Lwb/li;->j:Ljava/lang/String;

    .line 20
    .line 21
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 26
    .line 27
    .line 28
    const-string v0, "\u94c3\u58f0\u5df2\u6e05\u7a7a"

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    iget-object v2, p0, Lwb/li;->h:Landroid/content/Context;

    .line 32
    .line 33
    invoke-static {v2, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 38
    .line 39
    .line 40
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 41
    .line 42
    return-object v0

    .line 43
    :pswitch_0
    iget-object v2, p0, Lwb/li;->h:Landroid/content/Context;

    .line 44
    .line 45
    instance-of v0, v2, Landroid/app/Activity;

    .line 46
    .line 47
    if-eqz v0, :cond_0

    .line 48
    .line 49
    move-object v0, v2

    .line 50
    check-cast v0, Landroid/app/Activity;

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    const/4 v0, 0x0

    .line 54
    :goto_0
    if-nez v0, :cond_1

    .line 55
    .line 56
    const-string v0, "\u5f53\u524d\u9875\u9762\u65e0\u6cd5\u6253\u5f00\u6587\u4ef6\u9009\u62e9\u5668"

    .line 57
    .line 58
    const/4 v1, 0x0

    .line 59
    invoke-static {v2, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_1
    sget-object v7, Lwb/vq;->a:Lwb/vq;

    .line 68
    .line 69
    new-instance v1, Lwb/oi;

    .line 70
    .line 71
    const/4 v6, 0x0

    .line 72
    iget-object v3, p0, Lwb/li;->i:Landroid/content/SharedPreferences;

    .line 73
    .line 74
    iget-object v4, p0, Lwb/li;->j:Ljava/lang/String;

    .line 75
    .line 76
    iget-object v5, p0, Lwb/li;->k:Li0/a1;

    .line 77
    .line 78
    invoke-direct/range {v1 .. v6}, Lwb/oi;-><init>(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Li0/a1;I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v7, v0, v1}, Lwb/vq;->c(Landroid/app/Activity;Lfg/l;)V

    .line 82
    .line 83
    .line 84
    :goto_1
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 85
    .line 86
    return-object v0

    .line 87
    :pswitch_1
    iget-object v2, p0, Lwb/li;->h:Landroid/content/Context;

    .line 88
    .line 89
    instance-of v0, v2, Landroid/app/Activity;

    .line 90
    .line 91
    if-eqz v0, :cond_2

    .line 92
    .line 93
    move-object v0, v2

    .line 94
    check-cast v0, Landroid/app/Activity;

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_2
    const/4 v0, 0x0

    .line 98
    :goto_2
    if-nez v0, :cond_3

    .line 99
    .line 100
    const-string v0, "\u5f53\u524d\u9875\u9762\u65e0\u6cd5\u6253\u5f00\u94c3\u58f0\u9009\u62e9\u5668"

    .line 101
    .line 102
    const/4 v1, 0x0

    .line 103
    invoke-static {v2, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 108
    .line 109
    .line 110
    goto :goto_3

    .line 111
    :cond_3
    sget-object v7, Lwb/vq;->a:Lwb/vq;

    .line 112
    .line 113
    iget-object v5, p0, Lwb/li;->k:Li0/a1;

    .line 114
    .line 115
    invoke-interface {v5}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    move-object v8, v1

    .line 120
    check-cast v8, Ljava/lang/String;

    .line 121
    .line 122
    new-instance v1, Lwb/oi;

    .line 123
    .line 124
    const/4 v6, 0x1

    .line 125
    iget-object v3, p0, Lwb/li;->i:Landroid/content/SharedPreferences;

    .line 126
    .line 127
    iget-object v4, p0, Lwb/li;->j:Ljava/lang/String;

    .line 128
    .line 129
    invoke-direct/range {v1 .. v6}, Lwb/oi;-><init>(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Li0/a1;I)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v7, v0, v8, v1}, Lwb/vq;->d(Landroid/app/Activity;Ljava/lang/String;Lfg/l;)V

    .line 133
    .line 134
    .line 135
    :goto_3
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 136
    .line 137
    return-object v0

    .line 138
    nop

    .line 139
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
