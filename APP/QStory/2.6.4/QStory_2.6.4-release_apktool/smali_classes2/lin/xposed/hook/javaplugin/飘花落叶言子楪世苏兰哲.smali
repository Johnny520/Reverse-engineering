.class public final synthetic Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic 飘花落叶言子楪世哲苏兰:Llin/xposed/hook/javaplugin/bean/MessageData;

.field public final synthetic 飘花落叶言子楪世苏兰哲:Ljava/lang/String;

.field public final synthetic 飘花落叶言子楪世苏哲兰:Llin/xposed/hook/javaplugin/controller/PluginLoader;


# direct methods
.method public synthetic constructor <init>(Llin/xposed/hook/javaplugin/controller/PluginLoader;Ljava/lang/String;Llin/xposed/hook/javaplugin/bean/MessageData;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Llin/xposed/hook/javaplugin/controller/PluginLoader;

    .line 5
    .line 6
    iput-object p2, p0, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Llin/xposed/hook/javaplugin/bean/MessageData;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Llin/xposed/hook/javaplugin/bean/MessageData;

    .line 4
    .line 5
    iget-object p0, p0, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Llin/xposed/hook/javaplugin/controller/PluginLoader;

    .line 6
    .line 7
    invoke-static {p0, v0, v1}, Llin/xposed/hook/javaplugin/OnMsgMenuCreateAPI;->飘花落叶言子楪苏世兰哲(Llin/xposed/hook/javaplugin/controller/PluginLoader;Ljava/lang/String;Llin/xposed/hook/javaplugin/bean/MessageData;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method
