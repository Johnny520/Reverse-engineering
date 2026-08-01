.class public Llin/xposed/hook/javaplugin/bean/PluginInfo;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field private date:Ljava/lang/String;

.field private iconPath:Ljava/lang/String;

.field private interpreter:Lbsh/Interpreter;

.field private pluginAuthor:Ljava/lang/String;

.field private pluginDesc:Ljava/lang/String;

.field private pluginID:Ljava/lang/String;

.field private pluginLocalPath:Ljava/lang/String;

.field private pluginName:Ljava/lang/String;

.field private pluginVersion:Ljava/lang/String;

.field private previewPaths:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private tags:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public getDate()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Llin/xposed/hook/javaplugin/bean/PluginInfo;->date:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getIconPath()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Llin/xposed/hook/javaplugin/bean/PluginInfo;->iconPath:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getInterpreter()Lbsh/Interpreter;
    .locals 0

    .line 1
    iget-object p0, p0, Llin/xposed/hook/javaplugin/bean/PluginInfo;->interpreter:Lbsh/Interpreter;

    .line 2
    .line 3
    return-object p0
.end method

.method public getPluginAuthor()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Llin/xposed/hook/javaplugin/bean/PluginInfo;->pluginAuthor:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getPluginDesc()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Llin/xposed/hook/javaplugin/bean/PluginInfo;->pluginDesc:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getPluginID()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Llin/xposed/hook/javaplugin/bean/PluginInfo;->pluginID:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getPluginLocalPath()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Llin/xposed/hook/javaplugin/bean/PluginInfo;->pluginLocalPath:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getPluginName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Llin/xposed/hook/javaplugin/bean/PluginInfo;->pluginName:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getPluginVersion()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Llin/xposed/hook/javaplugin/bean/PluginInfo;->pluginVersion:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getPreviewPaths()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Llin/xposed/hook/javaplugin/bean/PluginInfo;->previewPaths:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public getTags()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Llin/xposed/hook/javaplugin/bean/PluginInfo;->tags:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public setDate(Ljava/lang/String;)Llin/xposed/hook/javaplugin/bean/PluginInfo;
    .locals 0

    .line 1
    iput-object p1, p0, Llin/xposed/hook/javaplugin/bean/PluginInfo;->date:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public setIconPath(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Llin/xposed/hook/javaplugin/bean/PluginInfo;->iconPath:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setInterpreter(Lbsh/Interpreter;)V
    .locals 0

    .line 1
    iput-object p1, p0, Llin/xposed/hook/javaplugin/bean/PluginInfo;->interpreter:Lbsh/Interpreter;

    .line 2
    .line 3
    return-void
.end method

.method public setPluginAuthor(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Llin/xposed/hook/javaplugin/bean/PluginInfo;->pluginAuthor:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setPluginDesc(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Llin/xposed/hook/javaplugin/bean/PluginInfo;->pluginDesc:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setPluginID(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Llin/xposed/hook/javaplugin/bean/PluginInfo;->pluginID:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setPluginLocalPath(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Llin/xposed/hook/javaplugin/bean/PluginInfo;->pluginLocalPath:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setPluginName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Llin/xposed/hook/javaplugin/bean/PluginInfo;->pluginName:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setPluginVersion(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Llin/xposed/hook/javaplugin/bean/PluginInfo;->pluginVersion:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setPreviewPaths(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Llin/xposed/hook/javaplugin/bean/PluginInfo;->previewPaths:Ljava/util/List;

    .line 2
    .line 3
    return-void
.end method

.method public setTags(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Llin/xposed/hook/javaplugin/bean/PluginInfo;->tags:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method
