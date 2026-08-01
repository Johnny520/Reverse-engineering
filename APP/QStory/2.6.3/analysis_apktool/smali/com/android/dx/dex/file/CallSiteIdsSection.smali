.class public final Lcom/android/dx/dex/file/CallSiteIdsSection;
.super Lcom/android/dx/dex/file/UniformItemSection;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field private final callSiteIds:Ljava/util/TreeMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/TreeMap<",
            "Lcom/android/dx/rop/cst/CstCallSiteRef;",
            "Lcom/android/dx/dex/file/CallSiteIdItem;",
            ">;"
        }
    .end annotation
.end field

.field private final callSites:Ljava/util/TreeMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/TreeMap<",
            "Lcom/android/dx/rop/cst/CstCallSite;",
            "Lcom/android/dx/dex/file/CallSiteItem;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/android/dx/dex/file/DexFile;)V
    .locals 2

    .line 1
    const-string v0, "call_site_ids"

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-direct {p0, v0, p1, v1}, Lcom/android/dx/dex/file/UniformItemSection;-><init>(Ljava/lang/String;Lcom/android/dx/dex/file/DexFile;I)V

    .line 5
    .line 6
    .line 7
    new-instance p1, Ljava/util/TreeMap;

    .line 8
    .line 9
    invoke-direct {p1}, Ljava/util/TreeMap;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lcom/android/dx/dex/file/CallSiteIdsSection;->callSiteIds:Ljava/util/TreeMap;

    .line 13
    .line 14
    new-instance p1, Ljava/util/TreeMap;

    .line 15
    .line 16
    invoke-direct {p1}, Ljava/util/TreeMap;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lcom/android/dx/dex/file/CallSiteIdsSection;->callSites:Ljava/util/TreeMap;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public addCallSiteItem(Lcom/android/dx/rop/cst/CstCallSite;Lcom/android/dx/dex/file/CallSiteItem;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/android/dx/dex/file/CallSiteIdsSection;->callSites:Ljava/util/TreeMap;

    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const-string p0, "callSiteItem == null"

    .line 12
    .line 13
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_1
    const-string p0, "callSite == null"

    .line 18
    .line 19
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public get(Lcom/android/dx/rop/cst/Constant;)Lcom/android/dx/dex/file/IndexedItem;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/android/dx/dex/file/Section;->throwIfNotPrepared()V

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Lcom/android/dx/dex/file/CallSiteIdsSection;->callSiteIds:Ljava/util/TreeMap;

    .line 8
    .line 9
    check-cast p1, Lcom/android/dx/rop/cst/CstCallSiteRef;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Lcom/android/dx/dex/file/IndexedItem;

    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    const-string p0, "not found"

    .line 21
    .line 22
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_1
    const-string p0, "cst == null"

    .line 27
    .line 28
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-object v0
.end method

.method public getCallSiteItem(Lcom/android/dx/rop/cst/CstCallSite;)Lcom/android/dx/dex/file/CallSiteItem;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p0, p0, Lcom/android/dx/dex/file/CallSiteIdsSection;->callSites:Ljava/util/TreeMap;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lcom/android/dx/dex/file/CallSiteItem;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "callSite == null"

    .line 13
    .line 14
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public declared-synchronized intern(Lcom/android/dx/rop/cst/CstCallSiteRef;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    :try_start_0
    invoke-virtual {p0}, Lcom/android/dx/dex/file/Section;->throwIfPrepared()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/android/dx/dex/file/CallSiteIdsSection;->callSiteIds:Ljava/util/TreeMap;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lcom/android/dx/dex/file/CallSiteIdItem;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    new-instance v0, Lcom/android/dx/dex/file/CallSiteIdItem;

    .line 18
    .line 19
    invoke-direct {v0, p1}, Lcom/android/dx/dex/file/CallSiteIdItem;-><init>(Lcom/android/dx/rop/cst/CstCallSiteRef;)V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lcom/android/dx/dex/file/CallSiteIdsSection;->callSiteIds:Ljava/util/TreeMap;

    .line 23
    .line 24
    invoke-virtual {v1, p1, v0}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    :goto_0
    monitor-exit p0

    .line 31
    return-void

    .line 32
    :cond_1
    :try_start_1
    new-instance p1, Ljava/lang/NullPointerException;

    .line 33
    .line 34
    const-string v0, "cstRef"

    .line 35
    .line 36
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw p1

    .line 40
    :goto_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 41
    throw p1
.end method

.method public items()Ljava/util/Collection;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "+",
            "Lcom/android/dx/dex/file/Item;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/CallSiteIdsSection;->callSiteIds:Ljava/util/TreeMap;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public orderItems()V
    .locals 3

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/CallSiteIdsSection;->callSiteIds:Ljava/util/TreeMap;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const/4 v0, 0x0

    .line 12
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Lcom/android/dx/dex/file/CallSiteIdItem;

    .line 23
    .line 24
    add-int/lit8 v2, v0, 0x1

    .line 25
    .line 26
    invoke-virtual {v1, v0}, Lcom/android/dx/dex/file/IndexedItem;->setIndex(I)V

    .line 27
    .line 28
    .line 29
    move v0, v2

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    return-void
.end method
