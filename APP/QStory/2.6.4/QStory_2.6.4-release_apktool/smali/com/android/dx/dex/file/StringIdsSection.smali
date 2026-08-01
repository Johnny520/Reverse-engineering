.class public final Lcom/android/dx/dex/file/StringIdsSection;
.super Lcom/android/dx/dex/file/UniformItemSection;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field private final strings:Ljava/util/TreeMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/TreeMap<",
            "Lcom/android/dx/rop/cst/CstString;",
            "Lcom/android/dx/dex/file/StringIdItem;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/android/dx/dex/file/DexFile;)V
    .locals 2

    .line 1
    const-string v0, "string_ids"

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
    iput-object p1, p0, Lcom/android/dx/dex/file/StringIdsSection;->strings:Ljava/util/TreeMap;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
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
    iget-object p0, p0, Lcom/android/dx/dex/file/StringIdsSection;->strings:Ljava/util/TreeMap;

    .line 8
    .line 9
    check-cast p1, Lcom/android/dx/rop/cst/CstString;

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
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

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

.method public indexOf(Lcom/android/dx/rop/cst/CstString;)I
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
    iget-object p0, p0, Lcom/android/dx/dex/file/StringIdsSection;->strings:Ljava/util/TreeMap;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Lcom/android/dx/dex/file/StringIdItem;

    .line 14
    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/android/dx/dex/file/IndexedItem;->getIndex()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0

    .line 22
    :cond_0
    const-string p0, "not found"

    .line 23
    .line 24
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return v0

    .line 28
    :cond_1
    const-string p0, "string == null"

    .line 29
    .line 30
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return v0
.end method

.method public declared-synchronized intern(Lcom/android/dx/dex/file/StringIdItem;)Lcom/android/dx/dex/file/StringIdItem;
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
    invoke-virtual {p1}, Lcom/android/dx/dex/file/StringIdItem;->getValue()Lcom/android/dx/rop/cst/CstString;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Lcom/android/dx/dex/file/StringIdsSection;->strings:Ljava/util/TreeMap;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lcom/android/dx/dex/file/StringIdItem;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    monitor-exit p0

    .line 22
    return-object v1

    .line 23
    :cond_0
    :try_start_1
    iget-object v1, p0, Lcom/android/dx/dex/file/StringIdsSection;->strings:Ljava/util/TreeMap;

    .line 24
    .line 25
    invoke-virtual {v1, v0, p1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    .line 27
    .line 28
    monitor-exit p0

    .line 29
    return-object p1

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    :try_start_2
    new-instance p1, Ljava/lang/NullPointerException;

    .line 33
    .line 34
    const-string v0, "string == null"

    .line 35
    .line 36
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw p1

    .line 40
    :goto_0
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 41
    throw p1
.end method

.method public intern(Lcom/android/dx/rop/cst/CstString;)Lcom/android/dx/dex/file/StringIdItem;
    .locals 1

    .line 42
    new-instance v0, Lcom/android/dx/dex/file/StringIdItem;

    invoke-direct {v0, p1}, Lcom/android/dx/dex/file/StringIdItem;-><init>(Lcom/android/dx/rop/cst/CstString;)V

    invoke-virtual {p0, v0}, Lcom/android/dx/dex/file/StringIdsSection;->intern(Lcom/android/dx/dex/file/StringIdItem;)Lcom/android/dx/dex/file/StringIdItem;

    move-result-object p0

    return-object p0
.end method

.method public intern(Ljava/lang/String;)Lcom/android/dx/dex/file/StringIdItem;
    .locals 2

    .line 43
    new-instance v0, Lcom/android/dx/dex/file/StringIdItem;

    new-instance v1, Lcom/android/dx/rop/cst/CstString;

    invoke-direct {v1, p1}, Lcom/android/dx/rop/cst/CstString;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lcom/android/dx/dex/file/StringIdItem;-><init>(Lcom/android/dx/rop/cst/CstString;)V

    invoke-virtual {p0, v0}, Lcom/android/dx/dex/file/StringIdsSection;->intern(Lcom/android/dx/dex/file/StringIdItem;)Lcom/android/dx/dex/file/StringIdItem;

    move-result-object p0

    return-object p0
.end method

.method public declared-synchronized intern(Lcom/android/dx/rop/cst/CstNat;)V
    .locals 1

    monitor-enter p0

    .line 44
    :try_start_0
    invoke-virtual {p1}, Lcom/android/dx/rop/cst/CstNat;->getName()Lcom/android/dx/rop/cst/CstString;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/android/dx/dex/file/StringIdsSection;->intern(Lcom/android/dx/rop/cst/CstString;)Lcom/android/dx/dex/file/StringIdItem;

    .line 45
    invoke-virtual {p1}, Lcom/android/dx/rop/cst/CstNat;->getDescriptor()Lcom/android/dx/rop/cst/CstString;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/android/dx/dex/file/StringIdsSection;->intern(Lcom/android/dx/rop/cst/CstString;)Lcom/android/dx/dex/file/StringIdItem;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

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
    iget-object p0, p0, Lcom/android/dx/dex/file/StringIdsSection;->strings:Ljava/util/TreeMap;

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
    .locals 2

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/StringIdsSection;->strings:Ljava/util/TreeMap;

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
    check-cast v1, Lcom/android/dx/dex/file/StringIdItem;

    .line 23
    .line 24
    invoke-virtual {v1, v0}, Lcom/android/dx/dex/file/IndexedItem;->setIndex(I)V

    .line 25
    .line 26
    .line 27
    add-int/lit8 v0, v0, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    return-void
.end method

.method public writeHeaderPart(Lcom/android/dx/util/AnnotatedOutput;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/dex/file/Section;->throwIfNotPrepared()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/android/dx/dex/file/StringIdsSection;->strings:Ljava/util/TreeMap;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/TreeMap;->size()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p0}, Lcom/android/dx/dex/file/Section;->getFileOffset()I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    :goto_0
    invoke-interface {p1}, Lcom/android/dx/util/AnnotatedOutput;->annotates()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    new-instance v1, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string v2, "string_ids_size: "

    .line 27
    .line 28
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, Lcom/android/dx/util/Hex;->u4(I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    const/4 v2, 0x4

    .line 43
    invoke-interface {p1, v2, v1}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 44
    .line 45
    .line 46
    new-instance v1, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    const-string v3, "string_ids_off:  "

    .line 49
    .line 50
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-static {p0, v1, p1, v2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪哲苏兰(ILjava/lang/StringBuilder;Lcom/android/dx/util/AnnotatedOutput;I)V

    .line 54
    .line 55
    .line 56
    :cond_1
    invoke-interface {p1, v0}, Lcom/android/dx/util/Output;->writeInt(I)V

    .line 57
    .line 58
    .line 59
    invoke-interface {p1, p0}, Lcom/android/dx/util/Output;->writeInt(I)V

    .line 60
    .line 61
    .line 62
    return-void
.end method
