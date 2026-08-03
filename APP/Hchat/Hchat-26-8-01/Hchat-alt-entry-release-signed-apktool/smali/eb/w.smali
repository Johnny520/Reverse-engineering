.class public final synthetic Leb/w;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p3, p0, Leb/w;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Leb/w;->i:Landroid/content/Context;

    .line 4
    .line 5
    iput-object p2, p0, Leb/w;->h:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Landroid/content/Context;I)V
    .locals 0

    .line 11
    iput p3, p0, Leb/w;->g:I

    iput-object p1, p0, Leb/w;->h:Ljava/lang/String;

    iput-object p2, p0, Leb/w;->i:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Leb/w;->g:I

    .line 2
    .line 3
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, p0, Leb/w;->h:Ljava/lang/String;

    .line 7
    .line 8
    iget-object v4, p0, Leb/w;->i:Landroid/content/Context;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    invoke-static {v4, v3, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    :try_start_0
    invoke-static {v4, v3, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception v0

    .line 30
    new-instance v1, Lsf/f;

    .line 31
    .line 32
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    :goto_0
    invoke-static {v1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    const-string v2, "[Hchat:KeywordNotification] Toast\u5931\u8d25: "

    .line 46
    .line 47
    invoke-static {v2, v1, v0}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    :cond_0
    return-void

    .line 51
    :pswitch_1
    :try_start_1
    sget-object v0, Lfb/g1;->a:Lfb/g1;

    .line 52
    .line 53
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-static {v4, v3}, Lfb/g1;->e(Landroid/content/Context;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    new-instance v0, Ljava/io/File;

    .line 63
    .line 64
    invoke-static {v4}, Lfb/g1;->a(Landroid/content/Context;)Ljava/io/File;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-static {v3}, Lfb/g1;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    invoke-direct {v0, v2, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-static {v0}, Ldg/l;->b0(Ljava/io/File;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :catchall_1
    move-exception v0

    .line 80
    new-instance v1, Lsf/f;

    .line 81
    .line 82
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 83
    .line 84
    .line 85
    :goto_1
    invoke-static {v1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    if-eqz v0, :cond_1

    .line 90
    .line 91
    const-string v1, "[Hchat:ScriptAgent] \u6e05\u7406\u7a7a\u4f1a\u8bdd\u5931\u8d25: "

    .line 92
    .line 93
    invoke-static {v1, v3, v0}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 94
    .line 95
    .line 96
    :cond_1
    return-void

    .line 97
    :pswitch_2
    const-string v0, "\u5df2\u5b8c\u6210\uff0c\u4f46\u4f1a\u8bdd\u4fdd\u5b58\u5931\u8d25"

    .line 98
    .line 99
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    const/4 v1, 0x1

    .line 104
    invoke-static {v4, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :pswitch_3
    invoke-static {v4, v3, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :pswitch_4
    sput-object v3, Lfb/o1;->d:Ljava/lang/String;

    .line 121
    .line 122
    sget-boolean v0, Lfb/o1;->c:Z

    .line 123
    .line 124
    if-eqz v0, :cond_2

    .line 125
    .line 126
    invoke-static {v3}, Lfb/o1;->a(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_2
    sget-object v0, Lfb/o1;->b:Landroid/speech/tts/TextToSpeech;

    .line 131
    .line 132
    if-eqz v0, :cond_3

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_3
    new-instance v0, Landroid/speech/tts/TextToSpeech;

    .line 136
    .line 137
    invoke-virtual {v4}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    new-instance v2, Lfb/m1;

    .line 142
    .line 143
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 144
    .line 145
    .line 146
    invoke-direct {v0, v1, v2}, Landroid/speech/tts/TextToSpeech;-><init>(Landroid/content/Context;Landroid/speech/tts/TextToSpeech$OnInitListener;)V

    .line 147
    .line 148
    .line 149
    sput-object v0, Lfb/o1;->b:Landroid/speech/tts/TextToSpeech;

    .line 150
    .line 151
    :goto_2
    return-void

    .line 152
    :pswitch_5
    invoke-static {v4, v3}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->n(Landroid/content/Context;Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    return-void

    .line 156
    :pswitch_6
    invoke-static {v4, v3}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->x(Landroid/content/Context;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    return-void

    .line 160
    :pswitch_7
    invoke-static {v4, v3}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->v(Landroid/content/Context;Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    return-void

    .line 164
    nop

    .line 165
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
