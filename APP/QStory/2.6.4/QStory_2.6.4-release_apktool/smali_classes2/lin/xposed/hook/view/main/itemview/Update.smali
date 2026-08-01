.class public Llin/xposed/hook/view/main/itemview/Update;
.super Llin/xposed/hook/view/main/itemview/base/OtherViewItemInfo;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field private static hasUpdate:Ltop/suzhelan/qstory/entity/HasUpdate;

.field private static updateInfoList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ltop/suzhelan/qstory/entity/UpdateInfo;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Llin/xposed/hook/view/main/itemview/base/OtherViewItemInfo;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static detectUpdates()V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/Thread;

    .line 2
    .line 3
    new-instance v1, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰哲世;

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    invoke-direct {v1, v2}, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰哲世;-><init>(I)V

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static getLatestVersionCode()I
    .locals 1

    .line 1
    :try_start_0
    sget-object v0, Llin/xposed/hook/view/main/itemview/Update;->hasUpdate:Ltop/suzhelan/qstory/entity/HasUpdate;

    .line 2
    .line 3
    invoke-virtual {v0}, Ltop/suzhelan/qstory/entity/HasUpdate;->getVersion()I

    .line 4
    .line 5
    .line 6
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    return v0

    .line 8
    :catch_0
    const/4 v0, 0x0

    .line 9
    return v0
.end method

.method public static getLatestVersionName()Ljava/lang/String;
    .locals 2

    .line 1
    :try_start_0
    sget-object v0, Llin/xposed/hook/view/main/itemview/Update;->updateInfoList:Ljava/util/List;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Ltop/suzhelan/qstory/entity/UpdateInfo;

    .line 9
    .line 10
    invoke-virtual {v0}, Ltop/suzhelan/qstory/entity/UpdateInfo;->getVersionName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    return-object v0

    .line 15
    :catch_0
    const-string v0, "\u55b5\u545c\u55b5\u55b5\u545c\u545c\u55b5\u55b5"

    .line 16
    .line 17
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0
.end method

.method public static getUpdateLog()Ljava/lang/String;
    .locals 4

    .line 1
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Llin/xposed/hook/view/main/itemview/Update;->updateInfoList:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Ltop/suzhelan/qstory/entity/UpdateInfo;

    .line 23
    .line 24
    const-string v3, "\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c"

    .line 25
    .line 26
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2}, Ltop/suzhelan/qstory/entity/UpdateInfo;->getVersionName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v3, "\u55b5\u545c\u545c\u545c\u545c\u55b5\u55b5\u545c"

    .line 41
    .line 42
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2}, Ltop/suzhelan/qstory/entity/UpdateInfo;->getUpdateLog()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string v2, "\u55b5\u545c\u545c\u545c\u545c\u55b5\u55b5\u545c~\u55b5\u545c\u545c\u545c\u545c\u545c\u545c\u545c"

    .line 57
    .line 58
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 70
    return-object v0

    .line 71
    :catch_0
    const/16 v0, 0x3f1

    .line 72
    .line 73
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    return-object v0
.end method

.method public static getUpdateUrl()Ljava/lang/String;
    .locals 3

    .line 1
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x3f0

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
    sget-object v1, Llin/xposed/hook/view/main/itemview/Update;->updateInfoList:Ljava/util/List;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Ltop/suzhelan/qstory/entity/UpdateInfo;

    .line 23
    .line 24
    invoke-virtual {v1}, Ltop/suzhelan/qstory/entity/UpdateInfo;->getVersionCode()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    return-object v0

    .line 36
    :catch_0
    const/4 v0, 0x0

    .line 37
    return-object v0
.end method

.method public static hasUpdate()Z
    .locals 1

    .line 1
    :try_start_0
    sget-object v0, Llin/xposed/hook/view/main/itemview/Update;->hasUpdate:Ltop/suzhelan/qstory/entity/HasUpdate;

    .line 2
    .line 3
    invoke-virtual {v0}, Ltop/suzhelan/qstory/entity/HasUpdate;->getHasUpdate()Z

    .line 4
    .line 5
    .line 6
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    return v0

    .line 8
    :catch_0
    const/4 v0, 0x0

    .line 9
    return v0
.end method

.method public static jumpToBrowserUpdates(Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0xc2

    .line 7
    .line 8
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 13
    .line 14
    .line 15
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {v0, p0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 20
    .line 21
    .line 22
    invoke-static {}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰苏哲世()Landroid/app/Activity;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method private static lambda$detectUpdates$0()V
    .locals 4

    .line 1
    :try_start_0
    invoke-static {}, L飘花落叶言苏哲楪兰世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰()L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/16 v1, 0x108

    .line 6
    .line 7
    invoke-interface {v0, v1}, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(I)Lretrofit2/飘花落叶言子楪世兰苏哲;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Lretrofit2/飘花落叶言子楪世兰苏哲;->execute()Lretrofit2/飘花落叶言子世兰楪哲苏;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v0, v0, Lretrofit2/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Ltop/suzhelan/qstory/entity/QSResult;

    .line 18
    .line 19
    invoke-virtual {v0}, Ltop/suzhelan/qstory/entity/QSResult;->getData()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Ltop/suzhelan/qstory/entity/HasUpdate;

    .line 24
    .line 25
    sput-object v0, Llin/xposed/hook/view/main/itemview/Update;->hasUpdate:Ltop/suzhelan/qstory/entity/HasUpdate;

    .line 26
    .line 27
    invoke-virtual {v0}, Ltop/suzhelan/qstory/entity/HasUpdate;->getHasUpdate()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    invoke-static {}, L飘花落叶言苏哲楪兰世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰()L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世哲苏兰;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-interface {v0, v1}, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(I)Lretrofit2/飘花落叶言子楪世兰苏哲;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-interface {v0}, Lretrofit2/飘花落叶言子楪世兰苏哲;->execute()Lretrofit2/飘花落叶言子世兰楪哲苏;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iget-object v0, v0, Lretrofit2/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Ltop/suzhelan/qstory/entity/QSResult;

    .line 48
    .line 49
    invoke-virtual {v0}, Ltop/suzhelan/qstory/entity/QSResult;->getData()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, Ljava/util/List;

    .line 54
    .line 55
    sput-object v0, Llin/xposed/hook/view/main/itemview/Update;->updateInfoList:Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 56
    .line 57
    :cond_0
    return-void

    .line 58
    :catch_0
    move-exception v0

    .line 59
    const/16 v1, 0x3f5

    .line 60
    .line 61
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    sget-object v2, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    const/4 v3, 0x1

    .line 72
    invoke-static {v1, v2, v0, v3}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method private synthetic lambda$getOnClick$4(Landroid/view/View;)V
    .locals 2

    .line 1
    const/16 v0, 0x3f4

    .line 2
    .line 3
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, L飘花落叶言楪哲苏世子兰/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰楪哲苏(Ljava/lang/String;)L飘花落叶言楪哲苏世子兰/飘花落叶言子世兰楪苏哲;

    .line 8
    .line 9
    .line 10
    invoke-static {}, L飘花落叶言苏哲楪兰世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰()L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世哲苏兰;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/16 v1, 0x108

    .line 15
    .line 16
    invoke-interface {v0, v1}, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(I)Lretrofit2/飘花落叶言子楪世兰苏哲;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v1, Llin/xposed/hook/view/main/itemview/Update$1;

    .line 21
    .line 22
    invoke-direct {v1, p0, p1}, Llin/xposed/hook/view/main/itemview/Update$1;-><init>(Llin/xposed/hook/view/main/itemview/Update;Landroid/view/View;)V

    .line 23
    .line 24
    .line 25
    invoke-interface {v0, v1}, Lretrofit2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰(Lretrofit2/飘花落叶言子楪苏世兰哲;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method private static synthetic lambda$showUpdateDialog$1(Landroid/view/View$OnClickListener;Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-interface {p0, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    .line 5
    .line 6
    .line 7
    :cond_0
    return-void
.end method

.method private static synthetic lambda$showUpdateDialog$2(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {}, Llin/xposed/hook/view/main/itemview/Update;->getUpdateUrl()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Llin/xposed/hook/view/main/itemview/Update;->jumpToBrowserUpdates(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private static synthetic lambda$showUpdateDialog$3(L飘花落叶言世哲楪苏子兰/飘花落叶言子楪世苏哲兰;Landroid/view/View$OnClickListener;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    invoke-interface {p1, p2}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    return-void
.end method

.method public static mandatoryUpdate()Z
    .locals 1

    .line 1
    :try_start_0
    sget-object v0, Llin/xposed/hook/view/main/itemview/Update;->hasUpdate:Ltop/suzhelan/qstory/entity/HasUpdate;

    .line 2
    .line 3
    invoke-virtual {v0}, Ltop/suzhelan/qstory/entity/HasUpdate;->isForceUpdate()Z

    .line 4
    .line 5
    .line 6
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    return v0

    .line 8
    :catch_0
    const/4 v0, 0x0

    .line 9
    return v0
.end method

.method public static showUpdateDialog(Landroid/app/Activity;Landroid/view/View$OnClickListener;)V
    .locals 8

    .line 1
    new-instance v0, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    invoke-direct {v0, p0}, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪世苏哲兰;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世哲兰苏;

    .line 7
    .line 8
    invoke-direct {v1, p1}, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世哲兰苏;-><init>(Landroid/view/View$OnClickListener;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 12
    .line 13
    .line 14
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const v1, 0x240c0100

    .line 19
    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-virtual {p0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Landroid/view/ViewGroup;

    .line 28
    .line 29
    const v1, 0x240903bf

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Landroid/widget/TextView;

    .line 37
    .line 38
    const v2, 0x240903be

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    check-cast v2, Landroid/widget/TextView;

    .line 46
    .line 47
    const v4, 0x24090173

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    check-cast v4, Landroid/widget/Button;

    .line 55
    .line 56
    const v5, 0x240900bd

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    check-cast v5, Landroid/widget/Button;

    .line 64
    .line 65
    invoke-static {}, Llin/xposed/hook/view/main/itemview/Update;->mandatoryUpdate()Z

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    if-eqz v6, :cond_0

    .line 70
    .line 71
    const/16 v6, 0x8

    .line 72
    .line 73
    invoke-virtual {v5, v6}, Landroid/view/View;->setVisibility(I)V

    .line 74
    .line 75
    .line 76
    const v7, 0x240903c9

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    invoke-virtual {v7, v6}, Landroid/view/View;->setVisibility(I)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v3}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, v3}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 90
    .line 91
    .line 92
    :cond_0
    new-instance v6, Llin/xposed/hook/javaplugin/dialog/飘花落叶言子楪世哲苏兰;

    .line 93
    .line 94
    const/4 v7, 0x7

    .line 95
    invoke-direct {v6, v7}, Llin/xposed/hook/javaplugin/dialog/飘花落叶言子楪世哲苏兰;-><init>(I)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v4, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 99
    .line 100
    .line 101
    new-instance v4, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;

    .line 102
    .line 103
    invoke-direct {v4, v0, v3, p1}, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v5, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 107
    .line 108
    .line 109
    invoke-static {}, Llin/xposed/hook/view/main/itemview/Update;->getUpdateLog()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 114
    .line 115
    .line 116
    new-instance p1, Ljava/lang/StringBuilder;

    .line 117
    .line 118
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 119
    .line 120
    .line 121
    const/16 v2, 0x3f2

    .line 122
    .line 123
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-static {}, Llin/xposed/hook/view/main/itemview/Update;->getLatestVersionName()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0, p0}, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪世苏哲兰;->setContentView(Landroid/view/View;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 148
    .line 149
    .line 150
    return-void
.end method

.method public static bridge synthetic 飘花落叶言子楪世兰哲苏(Ltop/suzhelan/qstory/entity/HasUpdate;)V
    .locals 0

    .line 1
    sput-object p0, Llin/xposed/hook/view/main/itemview/Update;->hasUpdate:Ltop/suzhelan/qstory/entity/HasUpdate;

    .line 2
    .line 3
    return-void
.end method

.method public static synthetic 飘花落叶言子楪世兰苏哲()V
    .locals 0

    .line 1
    invoke-static {}, Llin/xposed/hook/view/main/itemview/Update;->lambda$detectUpdates$0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic 飘花落叶言子楪世哲兰苏(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0}, Llin/xposed/hook/view/main/itemview/Update;->lambda$showUpdateDialog$2(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic 飘花落叶言子楪世哲苏兰(Llin/xposed/hook/view/main/itemview/Update;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Llin/xposed/hook/view/main/itemview/Update;->lambda$getOnClick$4(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic 飘花落叶言子楪世苏兰哲(Landroid/view/View$OnClickListener;Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Llin/xposed/hook/view/main/itemview/Update;->lambda$showUpdateDialog$1(Landroid/view/View$OnClickListener;Landroid/content/DialogInterface;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic 飘花落叶言子楪世苏哲兰(L飘花落叶言世哲楪苏子兰/飘花落叶言子楪世苏哲兰;Landroid/view/View$OnClickListener;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Llin/xposed/hook/view/main/itemview/Update;->lambda$showUpdateDialog$3(L飘花落叶言世哲楪苏子兰/飘花落叶言子楪世苏哲兰;Landroid/view/View$OnClickListener;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static bridge synthetic 飘花落叶言子楪苏世哲兰(Ljava/util/List;)V
    .locals 0

    .line 1
    sput-object p0, Llin/xposed/hook/view/main/itemview/Update;->updateInfoList:Ljava/util/List;

    .line 2
    .line 3
    return-void
.end method


# virtual methods
.method public getLeftText()Ljava/lang/String;
    .locals 0

    .line 1
    const/16 p0, 0x3f3

    .line 2
    .line 3
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getOnClick()Landroid/view/View$OnClickListener;
    .locals 2

    .line 1
    new-instance v0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, p0, v1}, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世苏兰哲;-><init>(Llin/xposed/hook/view/main/itemview/base/OtherViewItemInfo;I)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method
