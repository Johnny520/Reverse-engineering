.class final Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

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
    const/16 p0, 0x4ed

    .line 30
    .line 31
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-object v4

    .line 39
    :cond_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    const-string p1, "\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5"

    .line 43
    .line 44
    invoke-static {p1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-static {v1}, Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世兰苏(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    const/16 v5, 0x4ee

    .line 53
    .line 54
    invoke-static {v5}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-static {v1}, Ltop/suzhelan/plugin/sdk/online/net/PluginSdkConfig;->setDOWNLOAD_DIR(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-static {}, Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲苏世兰()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    const-string v5, "\u55b5\u545c\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u545c\u55b5\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c"

    .line 68
    .line 69
    invoke-static {v5}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    invoke-virtual {v1, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-static {v1}, Ltop/suzhelan/plugin/sdk/online/net/PluginSdkConfig;->setINSTALL_DIR(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-static {}, Llin/xposed/hook/util/qq/QQEnvTool;->getCurrentUin()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    const/16 v5, 0x4ef

    .line 85
    .line 86
    invoke-static {v5}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    invoke-static {v1}, Ltop/suzhelan/plugin/sdk/online/net/PluginSdkConfig;->setUSER_UIN(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-static {}, Llin/xposed/hook/util/qq/QQEnvTool;->getCurrentAccountNickName()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    const/16 v5, 0x4f0

    .line 100
    .line 101
    invoke-static {v5}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    invoke-static {v1}, Ltop/suzhelan/plugin/sdk/online/net/PluginSdkConfig;->setUSER_NICKNAME(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    iget-object v1, p0, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1;->this$0:Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;

    .line 111
    .line 112
    invoke-static {v1}, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;->access$getWaitDialog$p(Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;)L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-virtual {v1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰苏哲楪()V

    .line 117
    .line 118
    .line 119
    iget-object v1, p0, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1;->this$0:Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;

    .line 120
    .line 121
    invoke-static {v1}, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;->access$getWaitDialog$p(Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;)L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    const/16 v5, 0x4f1

    .line 126
    .line 127
    invoke-static {v5}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v5

    .line 131
    iput-object v5, v1, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰苏哲楪:Ljava/lang/CharSequence;

    .line 132
    .line 133
    invoke-virtual {v1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰楪苏哲()V

    .line 134
    .line 135
    .line 136
    iget-object v1, p0, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1;->$plugin:Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 137
    .line 138
    invoke-static {v1}, Llin/xposed/hook/javaplugin/controller/PluginManager;->stopPlugin(Llin/xposed/hook/javaplugin/bean/PluginInfo;)V

    .line 139
    .line 140
    .line 141
    iget-object v1, p0, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1;->$plugin:Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 142
    .line 143
    invoke-static {v4, v1}, Llin/xposed/hook/javaplugin/controller/PluginManager;->loadPlugin(Llin/xposed/hook/javaplugin/view/PluginItemView;Llin/xposed/hook/javaplugin/bean/PluginInfo;)Z

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    if-nez v1, :cond_2

    .line 148
    .line 149
    const/16 p0, 0x4ea

    .line 150
    .line 151
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    const/16 p1, 0x4f2

    .line 156
    .line 157
    invoke-static {p1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    invoke-static {p1, p0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰哲苏楪(Ljava/lang/CharSequence;Ljava/lang/String;)L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 162
    .line 163
    .line 164
    return-object v2

    .line 165
    :cond_2
    iget-object v1, p0, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1;->$plugin:Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 166
    .line 167
    invoke-static {v1}, Llin/xposed/hook/javaplugin/controller/PluginManager;->stopPlugin(Llin/xposed/hook/javaplugin/bean/PluginInfo;)V

    .line 168
    .line 169
    .line 170
    iget-object v1, p0, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1;->this$0:Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;

    .line 171
    .line 172
    invoke-static {v1}, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;->access$getWaitDialog$p(Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;)L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    const/16 v5, 0x4f3

    .line 177
    .line 178
    invoke-static {v5}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v5

    .line 182
    iput-object v5, v1, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰苏哲楪:Ljava/lang/CharSequence;

    .line 183
    .line 184
    invoke-virtual {v1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰楪苏哲()V

    .line 185
    .line 186
    .line 187
    iget-object v1, p0, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1;->$plugin:Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 188
    .line 189
    invoke-virtual {v1}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginLocalPath()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    new-instance v5, Ljava/io/File;

    .line 194
    .line 195
    invoke-static {p1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    invoke-static {p1}, Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世兰苏(Ljava/lang/String;)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    new-instance v6, Ljava/lang/StringBuilder;

    .line 204
    .line 205
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 206
    .line 207
    .line 208
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 209
    .line 210
    .line 211
    move-result-wide v7

    .line 212
    invoke-virtual {v6, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    const-string v7, "\u55b5\u545c\u55b5\u545c\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u55b5"

    .line 216
    .line 217
    invoke-static {v7}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v7

    .line 221
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v6

    .line 228
    invoke-direct {v5, p1, v6}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    invoke-static {v1, p1}, L飘花落叶言世子哲苏兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子世苏楪兰哲(Ljava/lang/String;Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    iget-object p1, p0, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1;->this$0:Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;

    .line 239
    .line 240
    invoke-static {p1}, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;->access$getWaitDialog$p(Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;)L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;

    .line 241
    .line 242
    .line 243
    move-result-object p1

    .line 244
    const/16 v1, 0x4f4

    .line 245
    .line 246
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    iput-object v1, p1, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰苏哲楪:Ljava/lang/CharSequence;

    .line 251
    .line 252
    invoke-virtual {p1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰楪苏哲()V

    .line 253
    .line 254
    .line 255
    iget-object p1, p0, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1;->this$0:Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;

    .line 256
    .line 257
    invoke-static {p1, v5}, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;->access$uploadToNet(Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;Ljava/io/File;)Ltop/suzhelan/plugin/sdk/online/net/QSResult;

    .line 258
    .line 259
    .line 260
    move-result-object p1

    .line 261
    iget-object v1, p0, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1;->this$0:Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;

    .line 262
    .line 263
    invoke-static {v1}, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;->access$getWaitDialog$p(Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;)L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    const/4 v5, 0x0

    .line 268
    iput-boolean v5, v1, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪苏兰哲:Z

    .line 269
    .line 270
    new-instance v5, L飘花落叶言楪哲世兰子苏/飘花落叶言子世哲楪苏兰;

    .line 271
    .line 272
    const/4 v6, 0x2

    .line 273
    invoke-direct {v5, v1, v6}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世哲楪苏兰;-><init>(L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;I)V

    .line 274
    .line 275
    .line 276
    invoke-static {v5}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子世苏楪兰哲(Ljava/lang/Runnable;)V

    .line 277
    .line 278
    .line 279
    sget-object v1, Lkotlinx/coroutines/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世兰苏哲;

    .line 280
    .line 281
    sget-object v1, Lkotlinx/coroutines/internal/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏哲子楪兰/飘花落叶言子楪世哲兰苏;

    .line 282
    .line 283
    new-instance v5, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1$1;

    .line 284
    .line 285
    invoke-direct {v5, p1, v4}, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1$1;-><init>(Ltop/suzhelan/plugin/sdk/online/net/QSResult;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 286
    .line 287
    .line 288
    iput-object v4, p0, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1;->L$0:Ljava/lang/Object;

    .line 289
    .line 290
    iput-object v4, p0, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1;->L$1:Ljava/lang/Object;

    .line 291
    .line 292
    iput-object v4, p0, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1;->L$2:Ljava/lang/Object;

    .line 293
    .line 294
    iput v3, p0, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1;->label:I

    .line 295
    .line 296
    invoke-static {v1, v5, p0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世哲楪兰苏(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object p0

    .line 300
    if-ne p0, v0, :cond_3

    .line 301
    .line 302
    return-object v0

    .line 303
    :cond_3
    return-object v2
.end method
