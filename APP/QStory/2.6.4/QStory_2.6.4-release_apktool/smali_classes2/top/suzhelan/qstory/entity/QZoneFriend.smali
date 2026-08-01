.class public Ltop/suzhelan/qstory/entity/QZoneFriend;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltop/suzhelan/qstory/entity/QZoneFriend$MayknowDTO;,
        Ltop/suzhelan/qstory/entity/QZoneFriend$Friend;,
        Ltop/suzhelan/qstory/entity/QZoneFriend$GpnamesDTO;
    }
.end annotation


# instance fields
.field private gpnames:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ltop/suzhelan/qstory/entity/QZoneFriend$GpnamesDTO;",
            ">;"
        }
    .end annotation

    .annotation runtime L飘花落叶言楪子苏哲世兰/飘花落叶言子楪世哲兰苏;
        name = "gpnames"
    .end annotation
.end field

.field private list:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ltop/suzhelan/qstory/entity/QZoneFriend$Friend;",
            ">;"
        }
    .end annotation

    .annotation runtime L飘花落叶言楪子苏哲世兰/飘花落叶言子楪世哲兰苏;
        name = "list"
    .end annotation
.end field

.field private mayknow:Ltop/suzhelan/qstory/entity/QZoneFriend$MayknowDTO;
    .annotation runtime L飘花落叶言楪子苏哲世兰/飘花落叶言子楪世哲兰苏;
        name = "mayknow"
    .end annotation
.end field

.field private speciallist:Ljava/lang/Object;
    .annotation runtime L飘花落叶言楪子苏哲世兰/飘花落叶言子楪世哲兰苏;
        name = "speciallist"
    .end annotation
.end field


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
.method public getGpnames()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ltop/suzhelan/qstory/entity/QZoneFriend$GpnamesDTO;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Ltop/suzhelan/qstory/entity/QZoneFriend;->gpnames:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public getList()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ltop/suzhelan/qstory/entity/QZoneFriend$Friend;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Ltop/suzhelan/qstory/entity/QZoneFriend;->list:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public getMayknow()Ltop/suzhelan/qstory/entity/QZoneFriend$MayknowDTO;
    .locals 0

    .line 1
    iget-object p0, p0, Ltop/suzhelan/qstory/entity/QZoneFriend;->mayknow:Ltop/suzhelan/qstory/entity/QZoneFriend$MayknowDTO;

    .line 2
    .line 3
    return-object p0
.end method

.method public getSpeciallist()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Ltop/suzhelan/qstory/entity/QZoneFriend;->speciallist:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public setGpnames(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ltop/suzhelan/qstory/entity/QZoneFriend$GpnamesDTO;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Ltop/suzhelan/qstory/entity/QZoneFriend;->gpnames:Ljava/util/List;

    .line 2
    .line 3
    return-void
.end method

.method public setList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ltop/suzhelan/qstory/entity/QZoneFriend$Friend;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Ltop/suzhelan/qstory/entity/QZoneFriend;->list:Ljava/util/List;

    .line 2
    .line 3
    return-void
.end method

.method public setMayknow(Ltop/suzhelan/qstory/entity/QZoneFriend$MayknowDTO;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ltop/suzhelan/qstory/entity/QZoneFriend;->mayknow:Ltop/suzhelan/qstory/entity/QZoneFriend$MayknowDTO;

    .line 2
    .line 3
    return-void
.end method

.method public setSpeciallist(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ltop/suzhelan/qstory/entity/QZoneFriend;->speciallist:Ljava/lang/Object;

    .line 2
    .line 3
    return-void
.end method
