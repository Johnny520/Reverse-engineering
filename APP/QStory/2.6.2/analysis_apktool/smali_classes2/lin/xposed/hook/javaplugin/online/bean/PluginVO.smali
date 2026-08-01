.class public Llin/xposed/hook/javaplugin/online/bean/PluginVO;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private app:Ljava/lang/String;

.field private cloudId:J

.field private createTime:Ljava/util/Date;

.field private downloadCount:I

.field private pluginInfo:Llin/xposed/hook/javaplugin/bean/PluginInfo;

.field private type:I


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
.method public getApp()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Llin/xposed/hook/javaplugin/online/bean/PluginVO;->app:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getCloudId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Llin/xposed/hook/javaplugin/online/bean/PluginVO;->cloudId:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getCreateTime()Ljava/util/Date;
    .locals 0

    .line 1
    iget-object p0, p0, Llin/xposed/hook/javaplugin/online/bean/PluginVO;->createTime:Ljava/util/Date;

    .line 2
    .line 3
    return-object p0
.end method

.method public getDownloadCount()I
    .locals 0

    .line 1
    iget p0, p0, Llin/xposed/hook/javaplugin/online/bean/PluginVO;->downloadCount:I

    .line 2
    .line 3
    return p0
.end method

.method public getPluginInfo()Llin/xposed/hook/javaplugin/bean/PluginInfo;
    .locals 0

    .line 1
    iget-object p0, p0, Llin/xposed/hook/javaplugin/online/bean/PluginVO;->pluginInfo:Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 2
    .line 3
    return-object p0
.end method

.method public getType()I
    .locals 0

    .line 1
    iget p0, p0, Llin/xposed/hook/javaplugin/online/bean/PluginVO;->type:I

    .line 2
    .line 3
    return p0
.end method

.method public setApp(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Llin/xposed/hook/javaplugin/online/bean/PluginVO;->app:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setCloudId(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Llin/xposed/hook/javaplugin/online/bean/PluginVO;->cloudId:J

    .line 2
    .line 3
    return-void
.end method

.method public setCreateTime(Ljava/util/Date;)V
    .locals 0

    .line 1
    iput-object p1, p0, Llin/xposed/hook/javaplugin/online/bean/PluginVO;->createTime:Ljava/util/Date;

    .line 2
    .line 3
    return-void
.end method

.method public setDownloadCount(I)V
    .locals 0

    .line 1
    iput p1, p0, Llin/xposed/hook/javaplugin/online/bean/PluginVO;->downloadCount:I

    .line 2
    .line 3
    return-void
.end method

.method public setPluginInfo(Llin/xposed/hook/javaplugin/bean/PluginInfo;)V
    .locals 0

    .line 1
    iput-object p1, p0, Llin/xposed/hook/javaplugin/online/bean/PluginVO;->pluginInfo:Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 2
    .line 3
    return-void
.end method

.method public setType(I)V
    .locals 0

    .line 1
    iput p1, p0, Llin/xposed/hook/javaplugin/online/bean/PluginVO;->type:I

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/alibaba/fastjson2/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method
