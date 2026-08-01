.class Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llin/xposed/hook/javaplugin/util/PluginSendMsgTool;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "FindResult"
.end annotation


# instance fields
.field private content:Ljava/lang/String;

.field private key:Ljava/lang/String;

.field private type:I


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static bridge synthetic 飘花落叶言子楪世兰哲苏(Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;I)V
    .locals 0

    .line 1
    iput p1, p0, Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;->type:I

    .line 2
    .line 3
    return-void
.end method

.method public static bridge synthetic 飘花落叶言子楪世兰苏哲(Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;->key:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public static bridge synthetic 飘花落叶言子楪世哲兰苏(Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;->content:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public static bridge synthetic 飘花落叶言子楪世哲苏兰(Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;)I
    .locals 0

    .line 1
    iget p0, p0, Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;->type:I

    .line 2
    .line 3
    return p0
.end method

.method public static bridge synthetic 飘花落叶言子楪世苏兰哲(Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;->key:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static bridge synthetic 飘花落叶言子楪世苏哲兰(Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;->content:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-wide v1, -0x36a54fa4051405a7L    # -2.3807297468537687E45

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget v1, p0, Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;->type:I

    .line 19
    .line 20
    const-wide v2, -0x36a54f95051405a7L    # -2.380750163795784E45

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    invoke-static {v0, v1, v2, v3}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子世楪哲苏兰(Ljava/lang/StringBuilder;IJ)V

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;->content:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const/16 v1, 0x27

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-wide v1, -0x36a54f99051405a7L    # -2.3807447192779132E45

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    iget-object p0, p0, Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;->key:Ljava/lang/String;

    .line 51
    .line 52
    const-string v1, "\'}"

    .line 53
    .line 54
    invoke-static {v0, p0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世哲苏(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0
.end method
