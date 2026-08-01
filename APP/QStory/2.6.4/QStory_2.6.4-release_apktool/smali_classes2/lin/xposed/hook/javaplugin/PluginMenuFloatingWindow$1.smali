.class Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow$1;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世哲苏子兰楪/飘花落叶言子楪世兰苏哲;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow;


# direct methods
.method public constructor <init>(Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow;)V
    .locals 0

    .line 1
    iput-object p1, p0, Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow$1;->this$0:Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private synthetic lambda$hide$1()V
    .locals 0

    .line 1
    iget-object p0, p0, Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow$1;->this$0:Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow;

    .line 2
    .line 3
    invoke-static {p0}, Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow;->飘花落叶言子楪苏世兰哲(Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private synthetic lambda$show$0()V
    .locals 0

    .line 1
    iget-object p0, p0, Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow$1;->this$0:Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow;

    .line 2
    .line 3
    invoke-static {p0}, Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow;->飘花落叶言子楪苏哲世兰(Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic 飘花落叶言子楪世苏兰哲(Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow$1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow$1;->lambda$show$0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic 飘花落叶言子楪世苏哲兰(Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow$1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow$1;->lambda$hide$1()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public hide()V
    .locals 3

    .line 1
    iget-object v0, p0, Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow$1;->this$0:Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow;

    .line 2
    .line 3
    invoke-static {v0}, Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow;->飘花落叶言子楪苏世哲兰(Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Landroid/os/Handler;

    .line 10
    .line 11
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 16
    .line 17
    .line 18
    new-instance v1, Llin/xposed/hook/javaplugin/飘花落叶言子楪世哲兰苏;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-direct {v1, p0, v2}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世哲兰苏;-><init>(Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow$1;I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public show()V
    .locals 4

    .line 1
    iget-object v0, p0, Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow$1;->this$0:Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow;

    .line 2
    .line 3
    invoke-static {v0}, Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow;->飘花落叶言子楪苏世哲兰(Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Landroid/os/Handler;

    .line 10
    .line 11
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 16
    .line 17
    .line 18
    new-instance v1, Llin/xposed/hook/javaplugin/飘花落叶言子楪世哲兰苏;

    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    invoke-direct {v1, p0, v2}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世哲兰苏;-><init>(Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow$1;I)V

    .line 22
    .line 23
    .line 24
    const-wide/16 v2, 0x12c

    .line 25
    .line 26
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void
.end method
