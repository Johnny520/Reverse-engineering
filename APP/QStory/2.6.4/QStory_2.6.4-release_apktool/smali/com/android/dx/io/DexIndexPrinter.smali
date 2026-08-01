.class public final Lcom/android/dx/io/DexIndexPrinter;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field private final dex:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

.field private final tableOfContents:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 5
    .line 6
    invoke-direct {v0, p1}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;-><init>(Ljava/io/File;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/android/dx/io/DexIndexPrinter;->dex:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 10
    .line 11
    iget-object p1, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;

    .line 12
    .line 13
    iput-object p1, p0, Lcom/android/dx/io/DexIndexPrinter;->tableOfContents:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;

    .line 14
    .line 15
    return-void
.end method

.method public static main([Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/android/dx/io/DexIndexPrinter;

    .line 2
    .line 3
    new-instance v1, Ljava/io/File;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    aget-object p0, p0, v2

    .line 7
    .line 8
    invoke-direct {v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1}, Lcom/android/dx/io/DexIndexPrinter;-><init>(Ljava/io/File;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {v0}, Lcom/android/dx/io/DexIndexPrinter;->printMap()V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0}, Lcom/android/dx/io/DexIndexPrinter;->printStrings()V

    .line 18
    .line 19
    .line 20
    invoke-direct {v0}, Lcom/android/dx/io/DexIndexPrinter;->printTypeIds()V

    .line 21
    .line 22
    .line 23
    invoke-direct {v0}, Lcom/android/dx/io/DexIndexPrinter;->printProtoIds()V

    .line 24
    .line 25
    .line 26
    invoke-direct {v0}, Lcom/android/dx/io/DexIndexPrinter;->printFieldIds()V

    .line 27
    .line 28
    .line 29
    invoke-direct {v0}, Lcom/android/dx/io/DexIndexPrinter;->printMethodIds()V

    .line 30
    .line 31
    .line 32
    invoke-direct {v0}, Lcom/android/dx/io/DexIndexPrinter;->printTypeLists()V

    .line 33
    .line 34
    .line 35
    invoke-direct {v0}, Lcom/android/dx/io/DexIndexPrinter;->printClassDefs()V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method private printClassDefs()V
    .locals 5

    .line 1
    iget-object p0, p0, Lcom/android/dx/io/DexIndexPrinter;->dex:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;

    .line 7
    .line 8
    iget-object v0, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;

    .line 9
    .line 10
    invoke-virtual {v0}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏哲兰()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    sget-object p0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 17
    .line 18
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance v0, Lcom/google/protobuf/飘花落叶言世兰楪子哲苏;

    .line 24
    .line 25
    invoke-direct {v0, p0}, Lcom/google/protobuf/飘花落叶言世兰楪子哲苏;-><init>(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;)V

    .line 26
    .line 27
    .line 28
    move-object p0, v0

    .line 29
    :goto_0
    const/4 v0, 0x0

    .line 30
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世兰哲苏;

    .line 41
    .line 42
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 43
    .line 44
    new-instance v3, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    const-string v4, "class def "

    .line 47
    .line 48
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v4, ": "

    .line 55
    .line 56
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {v2, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    add-int/lit8 v0, v0, 0x1

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_1
    return-void
.end method

.method private printFieldIds()V
    .locals 5

    .line 1
    iget-object p0, p0, Lcom/android/dx/io/DexIndexPrinter;->dex:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 2
    .line 3
    iget-object p0, p0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏世兰哲:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏哲兰世;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/util/AbstractList;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/4 v0, 0x0

    .line 10
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪哲苏世兰;

    .line 21
    .line 22
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 23
    .line 24
    new-instance v3, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string v4, "field "

    .line 27
    .line 28
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v4, ": "

    .line 35
    .line 36
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v2, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    add-int/lit8 v0, v0, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    return-void
.end method

.method private printMap()V
    .locals 6

    .line 1
    iget-object p0, p0, Lcom/android/dx/io/DexIndexPrinter;->tableOfContents:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;

    .line 2
    .line 3
    iget-object p0, p0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰苏世哲:[L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;

    .line 4
    .line 5
    array-length v0, p0

    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    if-ge v1, v0, :cond_1

    .line 8
    .line 9
    aget-object v2, p0, v1

    .line 10
    .line 11
    iget v3, v2, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:I

    .line 12
    .line 13
    const/4 v4, -0x1

    .line 14
    if-eq v3, v4, :cond_0

    .line 15
    .line 16
    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 17
    .line 18
    new-instance v4, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v5, "section "

    .line 21
    .line 22
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget-short v5, v2, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲苏兰世:S

    .line 26
    .line 27
    invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v5, " off="

    .line 35
    .line 36
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    iget v5, v2, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:I

    .line 40
    .line 41
    invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v5, " size="

    .line 49
    .line 50
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    iget v5, v2, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 54
    .line 55
    invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v5, " byteCount="

    .line 63
    .line 64
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    iget v2, v2, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪兰世苏哲:I

    .line 68
    .line 69
    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-virtual {v3, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_1
    return-void
.end method

.method private printMethodIds()V
    .locals 5

    .line 1
    iget-object p0, p0, Lcom/android/dx/io/DexIndexPrinter;->dex:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 2
    .line 3
    iget-object p0, p0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏哲世兰:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏哲兰世;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/util/AbstractList;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/4 v0, 0x0

    .line 10
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪哲兰世苏;

    .line 21
    .line 22
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 23
    .line 24
    new-instance v3, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string v4, "methodId "

    .line 27
    .line 28
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v4, ": "

    .line 35
    .line 36
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v2, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    add-int/lit8 v0, v0, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    return-void
.end method

.method private printProtoIds()V
    .locals 5

    .line 1
    iget-object p0, p0, Lcom/android/dx/io/DexIndexPrinter;->dex:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 2
    .line 3
    iget-object p0, p0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏世哲兰:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏哲兰世;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/util/AbstractList;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/4 v0, 0x0

    .line 10
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪哲兰苏世;

    .line 21
    .line 22
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 23
    .line 24
    new-instance v3, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string v4, "proto "

    .line 27
    .line 28
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v4, ": "

    .line 35
    .line 36
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v2, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    add-int/lit8 v0, v0, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    return-void
.end method

.method private printStrings()V
    .locals 5

    .line 1
    iget-object p0, p0, Lcom/android/dx/io/DexIndexPrinter;->dex:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 2
    .line 3
    iget-object p0, p0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏哲兰世;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/util/AbstractList;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/4 v0, 0x0

    .line 10
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Ljava/lang/String;

    .line 21
    .line 22
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 23
    .line 24
    new-instance v3, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string v4, "string "

    .line 27
    .line 28
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v4, ": "

    .line 35
    .line 36
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v2, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    add-int/lit8 v0, v0, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    return-void
.end method

.method private printTypeIds()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/android/dx/io/DexIndexPrinter;->dex:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 2
    .line 3
    iget-object v0, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰苏哲:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏哲兰世;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/AbstractList;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, Ljava/lang/Integer;

    .line 21
    .line 22
    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 23
    .line 24
    const-string v4, "type "

    .line 25
    .line 26
    const-string v5, ": "

    .line 27
    .line 28
    invoke-static {v1, v4, v5}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲苏世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    iget-object v5, p0, Lcom/android/dx/io/DexIndexPrinter;->dex:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 33
    .line 34
    iget-object v5, v5, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏哲兰世;

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    invoke-virtual {v5, v2}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏哲兰世;->get(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    check-cast v2, Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {v3, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    add-int/lit8 v1, v1, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    return-void
.end method

.method private printTypeLists()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/android/dx/io/DexIndexPrinter;->tableOfContents:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;

    .line 2
    .line 3
    iget-object v0, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏兰世哲:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;

    .line 4
    .line 5
    iget v0, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:I

    .line 6
    .line 7
    const/4 v1, -0x1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    sget-object p0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 11
    .line 12
    const-string v0, "No type lists"

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v1, p0, Lcom/android/dx/io/DexIndexPrinter;->dex:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 19
    .line 20
    invoke-virtual {v1, v0}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏(I)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-object v0, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Ljava/nio/ByteBuffer;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    move v2, v1

    .line 28
    :goto_0
    iget-object v3, p0, Lcom/android/dx/io/DexIndexPrinter;->tableOfContents:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;

    .line 29
    .line 30
    iget-object v3, v3, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏兰世哲:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;

    .line 31
    .line 32
    iget v3, v3, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 33
    .line 34
    if-ge v2, v3, :cond_3

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    sget-object v4, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 41
    .line 42
    new-instance v5, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    const-string v6, "Type list i="

    .line 45
    .line 46
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v6, ", size="

    .line 53
    .line 54
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v6, ", elements="

    .line 61
    .line 62
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    invoke-virtual {v4, v5}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    move v4, v1

    .line 73
    :goto_1
    if-ge v4, v3, :cond_1

    .line 74
    .line 75
    sget-object v5, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 76
    .line 77
    iget-object v6, p0, Lcom/android/dx/io/DexIndexPrinter;->dex:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 78
    .line 79
    iget-object v6, v6, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰哲苏:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏哲兰世;

    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getShort()S

    .line 82
    .line 83
    .line 84
    move-result v7

    .line 85
    invoke-virtual {v6, v7}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏哲兰世;->get(I)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    check-cast v6, Ljava/lang/String;

    .line 90
    .line 91
    const-string v7, " "

    .line 92
    .line 93
    invoke-virtual {v7, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v6

    .line 97
    invoke-virtual {v5, v6}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    add-int/lit8 v4, v4, 0x1

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_1
    rem-int/lit8 v3, v3, 0x2

    .line 104
    .line 105
    const/4 v4, 0x1

    .line 106
    if-ne v3, v4, :cond_2

    .line 107
    .line 108
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getShort()S

    .line 109
    .line 110
    .line 111
    :cond_2
    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 112
    .line 113
    invoke-virtual {v3}, Ljava/io/PrintStream;->println()V

    .line 114
    .line 115
    .line 116
    add-int/lit8 v2, v2, 0x1

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_3
    return-void
.end method
