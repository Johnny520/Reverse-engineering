.class Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


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
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x2ca

    .line 7
    .line 8
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    iget v1, p0, Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;->type:I

    .line 16
    .line 17
    const/16 v2, 0x2cb

    .line 18
    .line 19
    invoke-static {v0, v1, v2}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰哲世苏(Ljava/lang/StringBuilder;II)V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;->content:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const/16 v1, 0x27

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v1, "\u55b5\u545c\u55b5\u545c\u545c\u545c\u545c\u545c~\u55b5\u545c\u55b5\u545c\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u545c\u55b5\u545c\u55b5\u55b5\u55b5\u545c~\u55b5\u545c\u55b5\u55b5\u55b5\u545c\u545c\u55b5"

    .line 33
    .line 34
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    iget-object p0, p0, Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;->key:Ljava/lang/String;

    .line 42
    .line 43
    const-string v1, "\'}"

    .line 44
    .line 45
    invoke-static {v0, p0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0
.end method
