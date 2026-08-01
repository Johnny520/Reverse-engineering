.class public Llin/xposed/hook/view/main/itemview/Update;
.super Llin/xposed/hook/view/main/itemview/base/OtherViewItemInfo;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


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
    const-wide v0, -0x36a56430051405a7L    # -2.373570205853752E45

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0
.end method

.method public static getUpdateLog()Ljava/lang/String;
    .locals 5

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
    const-wide v3, -0x36a52cce051405a7L    # -2.3928682994465724E45

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2}, Ltop/suzhelan/qstory/entity/UpdateInfo;->getVersionName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-wide v3, -0x36a50696051405a7L    # -2.4061855901583903E45

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2}, Ltop/suzhelan/qstory/entity/UpdateInfo;->getUpdateLog()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-wide v2, -0x36a54862051405a7L    # -2.383258725404725E45

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 79
    return-object v0

    .line 80
    :catch_0
    const-wide v0, -0x36a56432051405a7L    # -2.3735674835948168E45

    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
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
    const-wide v1, -0x36a5647b051405a7L    # -2.373468121143676E45

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
    sget-object v1, Llin/xposed/hook/view/main/itemview/Update;->updateInfoList:Ljava/util/List;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Ltop/suzhelan/qstory/entity/UpdateInfo;

    .line 26
    .line 27
    invoke-virtual {v1}, Ltop/suzhelan/qstory/entity/UpdateInfo;->getVersionCode()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    return-object v0

    .line 39
    :catch_0
    const/4 v0, 0x0

    .line 40
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
    .locals 3

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 4
    .line 5
    .line 6
    const-wide v1, -0x36a5115f051405a7L    # -2.4024275116981154E45

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
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 16
    .line 17
    .line 18
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {v0, p0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 23
    .line 24
    .line 25
    invoke-static {}, L飘花落叶言子楪世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪苏兰哲()Landroid/app/Activity;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method private static lambda$detectUpdates$0()V
    .locals 4

    .line 1
    :try_start_0
    invoke-static {}, L飘花落叶言苏哲子兰楪世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏()L飘花落叶言苏哲子兰世楪/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/16 v1, 0x106

    .line 6
    .line 7
    invoke-interface {v0, v1}, L飘花落叶言苏哲子兰世楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰(I)Lretrofit2/飘花落叶言子楪世兰苏哲;

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
    invoke-static {}, L飘花落叶言苏哲子兰楪世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏()L飘花落叶言苏哲子兰世楪/飘花落叶言子楪世兰苏哲;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-interface {v0, v1}, L飘花落叶言苏哲子兰世楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(I)Lretrofit2/飘花落叶言子楪世兰苏哲;

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
    const-wide v1, -0x36a5641e051405a7L    # -2.3735947061841705E45

    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    sget-object v2, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    const/4 v3, 0x1

    .line 75
    invoke-static {v1, v2, v0, v3}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method private synthetic lambda$getOnClick$4(Landroid/view/View;)V
    .locals 2

    .line 1
    const-wide v0, -0x36a56414051405a7L    # -2.3736083174788473E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰楪哲苏(Ljava/lang/String;)L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;

    .line 11
    .line 12
    .line 13
    invoke-static {}, L飘花落叶言苏哲子兰楪世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏()L飘花落叶言苏哲子兰世楪/飘花落叶言子楪世兰苏哲;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const/16 v1, 0x106

    .line 18
    .line 19
    invoke-interface {v0, v1}, L飘花落叶言苏哲子兰世楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰(I)Lretrofit2/飘花落叶言子楪世兰苏哲;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    new-instance v1, Llin/xposed/hook/view/main/itemview/Update$1;

    .line 24
    .line 25
    invoke-direct {v1, p0, p1}, Llin/xposed/hook/view/main/itemview/Update$1;-><init>(Llin/xposed/hook/view/main/itemview/Update;Landroid/view/View;)V

    .line 26
    .line 27
    .line 28
    invoke-interface {v0, v1}, Lretrofit2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲兰世(Lretrofit2/飘花落叶言子楪苏世兰哲;)V

    .line 29
    .line 30
    .line 31
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

.method private static synthetic lambda$showUpdateDialog$3(L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;Landroid/view/View$OnClickListener;Landroid/view/View;)V
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
    new-instance v0, L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    invoke-direct {v0, p0}, L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;-><init>(Landroid/content/Context;)V

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
    const-wide v2, -0x36a56420051405a7L    # -2.373591983925235E45

    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-static {}, Llin/xposed/hook/view/main/itemview/Update;->getLatestVersionName()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0, p0}, L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;->setContentView(Landroid/view/View;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 151
    .line 152
    .line 153
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

.method public static synthetic 飘花落叶言子楪世苏哲兰(L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;Landroid/view/View$OnClickListener;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Llin/xposed/hook/view/main/itemview/Update;->lambda$showUpdateDialog$3(L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;Landroid/view/View$OnClickListener;Landroid/view/View;)V

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
    .locals 2

    .line 1
    const-wide v0, -0x36a5642f051405a7L    # -2.3735715669832198E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public getOnClick()Landroid/view/View$OnClickListener;
    .locals 2

    .line 1
    new-instance v0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, p0, v1}, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世苏哲兰;-><init>(Llin/xposed/hook/view/main/itemview/base/OtherViewItemInfo;I)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method
