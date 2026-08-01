.class public Lcom/android/dx/cf/code/OneLocalsArray;
.super Lcom/android/dx/cf/code/LocalsArray;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field private final locals:[Lcom/android/dx/rop/type/TypeBearer;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    const/4 v0, 0x0

    .line 6
    :goto_0
    invoke-direct {p0, v0}, Lcom/android/dx/cf/code/LocalsArray;-><init>(Z)V

    .line 7
    .line 8
    .line 9
    new-array p1, p1, [Lcom/android/dx/rop/type/TypeBearer;

    .line 10
    .line 11
    iput-object p1, p0, Lcom/android/dx/cf/code/OneLocalsArray;->locals:[Lcom/android/dx/rop/type/TypeBearer;

    .line 12
    .line 13
    return-void
.end method

.method private static throwSimException(ILjava/lang/String;)Lcom/android/dx/rop/type/TypeBearer;
    .locals 3

    .line 1
    new-instance v0, Lcom/android/dx/cf/code/SimException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "local "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p0}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string p0, ": "

    .line 18
    .line 19
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-direct {v0, p0}, Lcom/android/dx/cf/code/SimException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw v0
.end method


# virtual methods
.method public annotate(Lcom/android/dex/util/ExceptionWithContext;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lcom/android/dx/cf/code/OneLocalsArray;->locals:[Lcom/android/dx/rop/type/TypeBearer;

    .line 3
    .line 4
    array-length v2, v1

    .line 5
    if-ge v0, v2, :cond_1

    .line 6
    .line 7
    aget-object v1, v1, v0

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    const-string v1, "<invalid>"

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :goto_1
    new-instance v2, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v3, "locals["

    .line 21
    .line 22
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-static {v0}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v3, "]: "

    .line 33
    .line 34
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {p1, v1}, Lcom/android/dex/util/ExceptionWithContext;->addContext(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    add-int/lit8 v0, v0, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    return-void
.end method

.method public bridge synthetic copy()Lcom/android/dx/cf/code/LocalsArray;
    .locals 0

    .line 19
    invoke-virtual {p0}, Lcom/android/dx/cf/code/OneLocalsArray;->copy()Lcom/android/dx/cf/code/OneLocalsArray;

    move-result-object p0

    return-object p0
.end method

.method public copy()Lcom/android/dx/cf/code/OneLocalsArray;
    .locals 4

    .line 1
    new-instance v0, Lcom/android/dx/cf/code/OneLocalsArray;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/android/dx/cf/code/OneLocalsArray;->locals:[Lcom/android/dx/rop/type/TypeBearer;

    .line 4
    .line 5
    array-length v1, v1

    .line 6
    invoke-direct {v0, v1}, Lcom/android/dx/cf/code/OneLocalsArray;-><init>(I)V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lcom/android/dx/cf/code/OneLocalsArray;->locals:[Lcom/android/dx/rop/type/TypeBearer;

    .line 10
    .line 11
    iget-object v1, v0, Lcom/android/dx/cf/code/OneLocalsArray;->locals:[Lcom/android/dx/rop/type/TypeBearer;

    .line 12
    .line 13
    array-length v2, p0

    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-static {p0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public get(I)Lcom/android/dx/rop/type/TypeBearer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/code/OneLocalsArray;->locals:[Lcom/android/dx/rop/type/TypeBearer;

    .line 2
    .line 3
    aget-object p0, p0, p1

    .line 4
    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const-string p0, "invalid"

    .line 8
    .line 9
    invoke-static {p1, p0}, Lcom/android/dx/cf/code/OneLocalsArray;->throwSimException(ILjava/lang/String;)Lcom/android/dx/rop/type/TypeBearer;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    :cond_0
    return-object p0
.end method

.method public getCategory1(I)Lcom/android/dx/rop/type/TypeBearer;
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lcom/android/dx/cf/code/OneLocalsArray;->get(I)Lcom/android/dx/rop/type/TypeBearer;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Lcom/android/dx/rop/type/TypeBearer;->getType()Lcom/android/dx/rop/type/Type;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lcom/android/dx/rop/type/Type;->isUninitialized()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    const-string p0, "uninitialized instance"

    .line 16
    .line 17
    invoke-static {p1, p0}, Lcom/android/dx/cf/code/OneLocalsArray;->throwSimException(ILjava/lang/String;)Lcom/android/dx/rop/type/TypeBearer;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :cond_0
    invoke-virtual {v0}, Lcom/android/dx/rop/type/Type;->isCategory2()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    const-string p0, "category-2"

    .line 29
    .line 30
    invoke-static {p1, p0}, Lcom/android/dx/cf/code/OneLocalsArray;->throwSimException(ILjava/lang/String;)Lcom/android/dx/rop/type/TypeBearer;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    :cond_1
    return-object p0
.end method

.method public getCategory2(I)Lcom/android/dx/rop/type/TypeBearer;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/android/dx/cf/code/OneLocalsArray;->get(I)Lcom/android/dx/rop/type/TypeBearer;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Lcom/android/dx/rop/type/TypeBearer;->getType()Lcom/android/dx/rop/type/Type;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lcom/android/dx/rop/type/Type;->isCategory1()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const-string p0, "category-1"

    .line 16
    .line 17
    invoke-static {p1, p0}, Lcom/android/dx/cf/code/OneLocalsArray;->throwSimException(ILjava/lang/String;)Lcom/android/dx/rop/type/TypeBearer;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    :cond_0
    return-object p0
.end method

.method public getMaxLocals()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/code/OneLocalsArray;->locals:[Lcom/android/dx/rop/type/TypeBearer;

    .line 2
    .line 3
    array-length p0, p0

    .line 4
    return p0
.end method

.method public getOrNull(I)Lcom/android/dx/rop/type/TypeBearer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/code/OneLocalsArray;->locals:[Lcom/android/dx/rop/type/TypeBearer;

    .line 2
    .line 3
    aget-object p0, p0, p1

    .line 4
    .line 5
    return-object p0
.end method

.method public getPrimary()Lcom/android/dx/cf/code/OneLocalsArray;
    .locals 0

    .line 1
    return-object p0
.end method

.method public invalidate(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/util/MutabilityControl;->throwIfImmutable()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/android/dx/cf/code/OneLocalsArray;->locals:[Lcom/android/dx/rop/type/TypeBearer;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    aput-object v0, p0, p1

    .line 8
    .line 9
    return-void
.end method

.method public makeInitialized(Lcom/android/dx/rop/type/Type;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/code/OneLocalsArray;->locals:[Lcom/android/dx/rop/type/TypeBearer;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_0
    invoke-virtual {p0}, Lcom/android/dx/util/MutabilityControl;->throwIfImmutable()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/android/dx/rop/type/Type;->getInitializedType()Lcom/android/dx/rop/type/Type;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const/4 v2, 0x0

    .line 15
    :goto_0
    if-ge v2, v0, :cond_2

    .line 16
    .line 17
    iget-object v3, p0, Lcom/android/dx/cf/code/OneLocalsArray;->locals:[Lcom/android/dx/rop/type/TypeBearer;

    .line 18
    .line 19
    aget-object v4, v3, v2

    .line 20
    .line 21
    if-ne v4, p1, :cond_1

    .line 22
    .line 23
    aput-object v1, v3, v2

    .line 24
    .line 25
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    :goto_1
    return-void
.end method

.method public merge(Lcom/android/dx/cf/code/LocalsArray;)Lcom/android/dx/cf/code/LocalsArray;
    .locals 1

    .line 24
    instance-of v0, p1, Lcom/android/dx/cf/code/OneLocalsArray;

    if-eqz v0, :cond_0

    .line 25
    check-cast p1, Lcom/android/dx/cf/code/OneLocalsArray;

    invoke-virtual {p0, p1}, Lcom/android/dx/cf/code/OneLocalsArray;->merge(Lcom/android/dx/cf/code/OneLocalsArray;)Lcom/android/dx/cf/code/OneLocalsArray;

    move-result-object p0

    return-object p0

    .line 26
    :cond_0
    invoke-virtual {p1, p0}, Lcom/android/dx/cf/code/LocalsArray;->merge(Lcom/android/dx/cf/code/LocalsArray;)Lcom/android/dx/cf/code/LocalsArray;

    move-result-object p0

    return-object p0
.end method

.method public merge(Lcom/android/dx/cf/code/OneLocalsArray;)Lcom/android/dx/cf/code/OneLocalsArray;
    .locals 2

    .line 1
    :try_start_0
    invoke-static {p0, p1}, Lcom/android/dx/cf/code/Merger;->mergeLocals(Lcom/android/dx/cf/code/OneLocalsArray;Lcom/android/dx/cf/code/OneLocalsArray;)Lcom/android/dx/cf/code/OneLocalsArray;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catch Lcom/android/dx/cf/code/SimException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-object p0

    .line 6
    :catch_0
    move-exception v0

    .line 7
    const-string v1, "underlay locals:"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lcom/android/dex/util/ExceptionWithContext;->addContext(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/android/dx/cf/code/OneLocalsArray;->annotate(Lcom/android/dex/util/ExceptionWithContext;)V

    .line 13
    .line 14
    .line 15
    const-string p0, "overlay locals:"

    .line 16
    .line 17
    invoke-virtual {v0, p0}, Lcom/android/dex/util/ExceptionWithContext;->addContext(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0}, Lcom/android/dx/cf/code/OneLocalsArray;->annotate(Lcom/android/dex/util/ExceptionWithContext;)V

    .line 21
    .line 22
    .line 23
    throw v0
.end method

.method public mergeWithSubroutineCaller(Lcom/android/dx/cf/code/LocalsArray;I)Lcom/android/dx/cf/code/LocalsArraySet;
    .locals 1

    .line 1
    new-instance v0, Lcom/android/dx/cf/code/LocalsArraySet;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/cf/code/OneLocalsArray;->getMaxLocals()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    invoke-direct {v0, p0}, Lcom/android/dx/cf/code/LocalsArraySet;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1, p2}, Lcom/android/dx/cf/code/LocalsArraySet;->mergeWithSubroutineCaller(Lcom/android/dx/cf/code/LocalsArray;I)Lcom/android/dx/cf/code/LocalsArraySet;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public set(ILcom/android/dx/rop/type/TypeBearer;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/util/MutabilityControl;->throwIfImmutable()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-interface {p2}, Lcom/android/dx/rop/type/TypeBearer;->getFrameType()Lcom/android/dx/rop/type/TypeBearer;

    .line 5
    .line 6
    .line 7
    move-result-object p2
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    if-ltz p1, :cond_2

    .line 9
    .line 10
    invoke-interface {p2}, Lcom/android/dx/rop/type/TypeBearer;->getType()Lcom/android/dx/rop/type/Type;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Lcom/android/dx/rop/type/Type;->isCategory2()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, Lcom/android/dx/cf/code/OneLocalsArray;->locals:[Lcom/android/dx/rop/type/TypeBearer;

    .line 22
    .line 23
    add-int/lit8 v2, p1, 0x1

    .line 24
    .line 25
    aput-object v1, v0, v2

    .line 26
    .line 27
    :cond_0
    iget-object v0, p0, Lcom/android/dx/cf/code/OneLocalsArray;->locals:[Lcom/android/dx/rop/type/TypeBearer;

    .line 28
    .line 29
    aput-object p2, v0, p1

    .line 30
    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    add-int/lit8 p1, p1, -0x1

    .line 34
    .line 35
    aget-object p2, v0, p1

    .line 36
    .line 37
    if-eqz p2, :cond_1

    .line 38
    .line 39
    invoke-interface {p2}, Lcom/android/dx/rop/type/TypeBearer;->getType()Lcom/android/dx/rop/type/Type;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-virtual {p2}, Lcom/android/dx/rop/type/Type;->isCategory2()Z

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    if-eqz p2, :cond_1

    .line 48
    .line 49
    iget-object p0, p0, Lcom/android/dx/cf/code/OneLocalsArray;->locals:[Lcom/android/dx/rop/type/TypeBearer;

    .line 50
    .line 51
    aput-object v1, p0, p1

    .line 52
    .line 53
    :cond_1
    return-void

    .line 54
    :cond_2
    const-string p0, "idx < 0"

    .line 55
    .line 56
    invoke-static {p0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :catch_0
    const-string p0, "type == null"

    .line 61
    .line 62
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public set(Lcom/android/dx/rop/code/RegisterSpec;)V
    .locals 1

    .line 66
    invoke-virtual {p1}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    move-result v0

    invoke-virtual {p0, v0, p1}, Lcom/android/dx/cf/code/OneLocalsArray;->set(ILcom/android/dx/rop/type/TypeBearer;)V

    return-void
.end method

.method public toHuman()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    iget-object v2, p0, Lcom/android/dx/cf/code/OneLocalsArray;->locals:[Lcom/android/dx/rop/type/TypeBearer;

    .line 8
    .line 9
    array-length v3, v2

    .line 10
    if-ge v1, v3, :cond_1

    .line 11
    .line 12
    aget-object v2, v2, v1

    .line 13
    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    const-string v2, "<invalid>"

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    :goto_1
    new-instance v3, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    const-string v4, "locals["

    .line 26
    .line 27
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-static {v1}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v4, "]: "

    .line 38
    .line 39
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v2, "\n"

    .line 46
    .line 47
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    add-int/lit8 v1, v1, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0
.end method
