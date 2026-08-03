.class Lcom/tendcloud/tenddata/az$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tendcloud/tenddata/az;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field private bsslist:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tendcloud/tenddata/az$a;",
            ">;"
        }
    .end annotation
.end field

.field private bssmap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/tendcloud/tenddata/az$a;",
            ">;"
        }
    .end annotation
.end field

.field private poiId:J

.field public final synthetic this$0:Lcom/tendcloud/tenddata/az;

.field private timestamp:I


# direct methods
.method public constructor <init>(Lcom/tendcloud/tenddata/az;)V
    .locals 0

    iput-object p1, p0, Lcom/tendcloud/tenddata/az$c;->this$0:Lcom/tendcloud/tenddata/az;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public cloneFingerprint()Lcom/tendcloud/tenddata/az$c;
    .locals 4

    new-instance v0, Lcom/tendcloud/tenddata/az$c;

    iget-object v1, p0, Lcom/tendcloud/tenddata/az$c;->this$0:Lcom/tendcloud/tenddata/az;

    invoke-direct {v0, v1}, Lcom/tendcloud/tenddata/az$c;-><init>(Lcom/tendcloud/tenddata/az;)V

    iget v1, p0, Lcom/tendcloud/tenddata/az$c;->timestamp:I

    invoke-virtual {v0, v1}, Lcom/tendcloud/tenddata/az$c;->setTimestamp(I)V

    iget-wide v1, p0, Lcom/tendcloud/tenddata/az$c;->poiId:J

    invoke-virtual {v0, v1, v2}, Lcom/tendcloud/tenddata/az$c;->setPoiId(J)V

    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    iget-object v2, p0, Lcom/tendcloud/tenddata/az$c;->bsslist:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/tendcloud/tenddata/az$a;

    invoke-virtual {v3}, Lcom/tendcloud/tenddata/az$a;->cloneBssEntry()Lcom/tendcloud/tenddata/az$a;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Lcom/tendcloud/tenddata/az$c;->setBsslist(Ljava/util/List;)V

    return-object v0
.end method

.method public getBsslist()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/tendcloud/tenddata/az$a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/tendcloud/tenddata/az$c;->bsslist:Ljava/util/List;

    return-object v0
.end method

.method public getBssmap(Z)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/tendcloud/tenddata/az$a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/tendcloud/tenddata/az$c;->bssmap:Ljava/util/Map;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_1

    :cond_0
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/tendcloud/tenddata/az$c;->bssmap:Ljava/util/Map;

    iget-object p1, p0, Lcom/tendcloud/tenddata/az$c;->bsslist:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tendcloud/tenddata/az$a;

    iget-object v1, p0, Lcom/tendcloud/tenddata/az$c;->bssmap:Ljava/util/Map;

    invoke-virtual {v0}, Lcom/tendcloud/tenddata/az$a;->getBssid()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/tendcloud/tenddata/az$c;->bssmap:Ljava/util/Map;

    return-object p1
.end method

.method public getPoiId()J
    .locals 2

    iget-wide v0, p0, Lcom/tendcloud/tenddata/az$c;->poiId:J

    return-wide v0
.end method

.method public getTimestamp()I
    .locals 1

    iget v0, p0, Lcom/tendcloud/tenddata/az$c;->timestamp:I

    return v0
.end method

.method public setBsslist(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tendcloud/tenddata/az$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/tendcloud/tenddata/az$c;->bsslist:Ljava/util/List;

    return-void
.end method

.method public setPoiId(J)V
    .locals 0

    iput-wide p1, p0, Lcom/tendcloud/tenddata/az$c;->poiId:J

    return-void
.end method

.method public setTimestamp(I)V
    .locals 0

    iput p1, p0, Lcom/tendcloud/tenddata/az$c;->timestamp:I

    return-void
.end method
