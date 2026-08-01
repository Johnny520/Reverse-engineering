.class public Llin/xposed/hook/view/main/itemview/info/DirectoryUiInfo;
.super Llin/xposed/hook/view/main/itemview/info/BaseItemUiInfo;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public groupWrapperList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Llin/xposed/hook/view/main/itemview/info/ItemUiInfoGroupWrapper;",
            ">;"
        }
    .end annotation
.end field

.field public rightText:Ljava/lang/CharSequence;

.field public uiInfoList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Llin/xposed/hook/view/main/itemview/info/BaseItemUiInfo;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>([Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Llin/xposed/hook/view/main/itemview/info/BaseItemUiInfo;-><init>([Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Llin/xposed/hook/view/main/itemview/info/DirectoryUiInfo;->uiInfoList:Ljava/util/List;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Llin/xposed/hook/view/main/itemview/info/DirectoryUiInfo;->groupWrapperList:Ljava/util/List;

    .line 17
    .line 18
    array-length v0, p1

    .line 19
    const/4 v1, 0x3

    .line 20
    if-lt v0, v1, :cond_0

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    aget-object v0, p1, v0

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    aget-object p1, p1, v1

    .line 27
    .line 28
    filled-new-array {v0, p1}, [Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p0, Llin/xposed/hook/view/main/itemview/info/BaseItemUiInfo;->paths:[Ljava/lang/String;

    .line 33
    .line 34
    :cond_0
    return-void
.end method


# virtual methods
.method public addGroupWrapper(Llin/xposed/hook/view/main/itemview/info/ItemUiInfoGroupWrapper;)V
    .locals 3

    .line 1
    iget-object v0, p0, Llin/xposed/hook/view/main/itemview/info/DirectoryUiInfo;->groupWrapperList:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoGroupWrapper;

    .line 18
    .line 19
    invoke-virtual {v1}, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoGroupWrapper;->getGroupName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {p1}, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoGroupWrapper;->getGroupName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    return-void

    .line 34
    :cond_1
    iget-object p0, p0, Llin/xposed/hook/view/main/itemview/info/DirectoryUiInfo;->groupWrapperList:Ljava/util/List;

    .line 35
    .line 36
    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public addItemUiInfo(Llin/xposed/hook/view/main/itemview/info/BaseItemUiInfo;)V
    .locals 0

    .line 1
    iget-object p0, p0, Llin/xposed/hook/view/main/itemview/info/DirectoryUiInfo;->uiInfoList:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

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
    const-wide v1, -0x36a56407051405a7L    # -2.3736260121619272E45

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
    iget-object v1, p0, Llin/xposed/hook/view/main/itemview/info/DirectoryUiInfo;->rightText:Ljava/lang/CharSequence;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-wide v1, -0x36a563fa051405a7L    # -2.373643706845007E45

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Llin/xposed/hook/view/main/itemview/info/DirectoryUiInfo;->uiInfoList:Ljava/util/List;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-wide v1, -0x36a563e8051405a7L    # -2.3736682071754254E45

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    iget-object p0, p0, Llin/xposed/hook/view/main/itemview/info/DirectoryUiInfo;->groupWrapperList:Ljava/util/List;

    .line 53
    .line 54
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const/16 p0, 0x7d

    .line 58
    .line 59
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0
.end method
