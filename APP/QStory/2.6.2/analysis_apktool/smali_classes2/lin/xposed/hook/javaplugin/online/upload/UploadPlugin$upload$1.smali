.class final Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;->upload(Llin/xposed/hook/javaplugin/bean/PluginInfo;)Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u5170\u82cf;",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "<anonymous>",
        "(Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u5170\u82cf;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;
    c = "lin.xposed.hook.javaplugin.online.upload.UploadPlugin$upload$1"
    f = "UploadPlugin.kt"
    l = {
        0x58
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic $plugin:Llin/xposed/hook/javaplugin/bean/PluginInfo;

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;


# direct methods
.method public constructor <init>(Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;Llin/xposed/hook/javaplugin/bean/PluginInfo;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;",
            "Llin/xposed/hook/javaplugin/bean/PluginInfo;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1;->this$0:Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;

    .line 2
    .line 3
    iput-object p2, p0, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1;->$plugin:Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "*>;)",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p1, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1;

    .line 2
    .line 3
    iget-object v0, p0, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1;->this$0:Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;

    .line 4
    .line 5
    iget-object p0, p0, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1;->$plugin:Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 6
    .line 7
    invoke-direct {p1, v0, p0, p2}, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1;-><init>(Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;Llin/xposed/hook/javaplugin/bean/PluginInfo;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 14
    check-cast p1, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    check-cast p2, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1, p2}, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1;->invoke(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invoke(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u5170\u82cf;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1;->create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1;->label:I

    .line 4
    .line 5
    sget-object v2, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    if-ne v1, v3, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1;->L$2:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Ltop/suzhelan/plugin/sdk/online/net/QSResult;

    .line 16
    .line 17
    iget-object v0, p0, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1;->L$1:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Ljava/io/File;

    .line 20
    .line 21
    iget-object p0, p0, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1;->L$0:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p0, Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return-object v2

    .line 29
    :cond_0
    const-wide p0, -0x36a57f60051405a7L    # -2.3640967447586732E45

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    invoke-static {p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return-object v4

    .line 42
    :cond_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    const-wide v5, -0x36a53ce3051405a7L    # -2.3872645294281184E45

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-static {p1}, Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰哲世(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    const-wide v7, -0x36a57f30051405a7L    # -2.364162078973122E45

    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    invoke-static {v7, v8}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    invoke-static {p1}, Ltop/suzhelan/plugin/sdk/online/net/PluginSdkConfig;->setDOWNLOAD_DIR(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-static {}, Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世苏兰()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    const-wide v7, -0x36a53cea051405a7L    # -2.3872550015218446E45

    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    invoke-static {v7, v8}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-virtual {p1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-static {p1}, Ltop/suzhelan/plugin/sdk/online/net/PluginSdkConfig;->setINSTALL_DIR(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-static {}, Llin/xposed/hook/util/qq/QQEnvTool;->getCurrentUin()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    const-wide v7, -0x36a57f28051405a7L    # -2.3641729680088635E45

    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    invoke-static {v7, v8}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    invoke-static {p1}, Ltop/suzhelan/plugin/sdk/online/net/PluginSdkConfig;->setUSER_UIN(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-static {}, Llin/xposed/hook/util/qq/QQEnvTool;->getCurrentAccountNickName()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    const-wide v7, -0x36a57f1b051405a7L    # -2.3641906626919434E45

    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    invoke-static {v7, v8}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    invoke-static {p1}, Ltop/suzhelan/plugin/sdk/online/net/PluginSdkConfig;->setUSER_NICKNAME(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    iget-object p1, p0, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1;->this$0:Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;

    .line 129
    .line 130
    invoke-static {p1}, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;->access$getWaitDialog$p(Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;)L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    invoke-virtual {p1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰苏哲楪()V

    .line 135
    .line 136
    .line 137
    iget-object p1, p0, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1;->this$0:Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;

    .line 138
    .line 139
    invoke-static {p1}, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;->access$getWaitDialog$p(Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;)L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    const-wide v7, -0x36a57efa051405a7L    # -2.364235579964377E45

    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    invoke-static {v7, v8}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    iput-object v1, p1, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰苏哲楪:Ljava/lang/CharSequence;

    .line 153
    .line 154
    invoke-virtual {p1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰楪苏哲()V

    .line 155
    .line 156
    .line 157
    iget-object p1, p0, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1;->$plugin:Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 158
    .line 159
    invoke-static {p1}, Llin/xposed/hook/javaplugin/controller/PluginManager;->stopPlugin(Llin/xposed/hook/javaplugin/bean/PluginInfo;)V

    .line 160
    .line 161
    .line 162
    iget-object p1, p0, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1;->$plugin:Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 163
    .line 164
    invoke-static {v4, p1}, Llin/xposed/hook/javaplugin/controller/PluginManager;->loadPlugin(Llin/xposed/hook/javaplugin/view/PluginItemView;Llin/xposed/hook/javaplugin/bean/PluginInfo;)Z

    .line 165
    .line 166
    .line 167
    move-result p1

    .line 168
    if-nez p1, :cond_2

    .line 169
    .line 170
    const-wide p0, -0x36a57f8d051405a7L    # -2.3640354939326274E45

    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    invoke-static {p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    const-wide v0, -0x36a57eef051405a7L    # -2.3642505523885215E45

    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    invoke-static {p1, p0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰哲苏楪(Ljava/lang/CharSequence;Ljava/lang/String;)L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 189
    .line 190
    .line 191
    return-object v2

    .line 192
    :cond_2
    iget-object p1, p0, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1;->$plugin:Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 193
    .line 194
    invoke-static {p1}, Llin/xposed/hook/javaplugin/controller/PluginManager;->stopPlugin(Llin/xposed/hook/javaplugin/bean/PluginInfo;)V

    .line 195
    .line 196
    .line 197
    iget-object p1, p0, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1;->this$0:Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;

    .line 198
    .line 199
    invoke-static {p1}, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;->access$getWaitDialog$p(Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;)L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    const-wide v7, -0x36a57ed1051405a7L    # -2.364291386272552E45

    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    invoke-static {v7, v8}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    iput-object v1, p1, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰苏哲楪:Ljava/lang/CharSequence;

    .line 213
    .line 214
    invoke-virtual {p1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰楪苏哲()V

    .line 215
    .line 216
    .line 217
    iget-object p1, p0, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1;->$plugin:Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 218
    .line 219
    invoke-virtual {p1}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginLocalPath()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    new-instance v1, Ljava/io/File;

    .line 224
    .line 225
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v5

    .line 229
    invoke-static {v5}, Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰哲世(Ljava/lang/String;)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v5

    .line 233
    new-instance v6, Ljava/lang/StringBuilder;

    .line 234
    .line 235
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 236
    .line 237
    .line 238
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 239
    .line 240
    .line 241
    move-result-wide v7

    .line 242
    invoke-virtual {v6, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    const-wide v7, -0x36a54eea051405a7L    # -2.380982916934758E45

    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    invoke-static {v7, v8}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v7

    .line 254
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v6

    .line 261
    invoke-direct {v1, v5, v6}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v5

    .line 268
    invoke-static {p1, v5}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(Ljava/lang/String;Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    iget-object p1, p0, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1;->this$0:Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;

    .line 272
    .line 273
    invoke-static {p1}, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;->access$getWaitDialog$p(Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;)L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;

    .line 274
    .line 275
    .line 276
    move-result-object p1

    .line 277
    const-wide v5, -0x36a57ed8051405a7L    # -2.3642818583662782E45

    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v5

    .line 286
    iput-object v5, p1, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰苏哲楪:Ljava/lang/CharSequence;

    .line 287
    .line 288
    invoke-virtual {p1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰楪苏哲()V

    .line 289
    .line 290
    .line 291
    iget-object p1, p0, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1;->this$0:Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;

    .line 292
    .line 293
    invoke-static {p1, v1}, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;->access$uploadToNet(Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;Ljava/io/File;)Ltop/suzhelan/plugin/sdk/online/net/QSResult;

    .line 294
    .line 295
    .line 296
    move-result-object p1

    .line 297
    iget-object v1, p0, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1;->this$0:Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;

    .line 298
    .line 299
    invoke-static {v1}, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;->access$getWaitDialog$p(Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;)L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    const/4 v5, 0x0

    .line 304
    iput-boolean v5, v1, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪苏兰哲:Z

    .line 305
    .line 306
    new-instance v5, L飘花落叶言楪哲世兰子苏/飘花落叶言子世哲楪苏兰;

    .line 307
    .line 308
    const/4 v6, 0x2

    .line 309
    invoke-direct {v5, v1, v6}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世哲楪苏兰;-><init>(L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;I)V

    .line 310
    .line 311
    .line 312
    invoke-static {v5}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子世苏楪兰哲(Ljava/lang/Runnable;)V

    .line 313
    .line 314
    .line 315
    sget-object v1, Lkotlinx/coroutines/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世兰苏哲;

    .line 316
    .line 317
    sget-object v1, Lkotlinx/coroutines/internal/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏哲子楪兰/飘花落叶言子楪世哲兰苏;

    .line 318
    .line 319
    new-instance v5, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1$1;

    .line 320
    .line 321
    invoke-direct {v5, p1, v4}, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1$1;-><init>(Ltop/suzhelan/plugin/sdk/online/net/QSResult;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 322
    .line 323
    .line 324
    iput-object v4, p0, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1;->L$0:Ljava/lang/Object;

    .line 325
    .line 326
    iput-object v4, p0, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1;->L$1:Ljava/lang/Object;

    .line 327
    .line 328
    iput-object v4, p0, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1;->L$2:Ljava/lang/Object;

    .line 329
    .line 330
    iput v3, p0, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1;->label:I

    .line 331
    .line 332
    invoke-static {v1, v5, p0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世哲楪兰苏(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object p0

    .line 336
    if-ne p0, v0, :cond_3

    .line 337
    .line 338
    return-object v0

    .line 339
    :cond_3
    return-object v2
.end method
