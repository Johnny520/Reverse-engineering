.class public final Lcom/android/dx/command/grep/Grep;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field private final codeReader:Lcom/android/dx/io/CodeReader;

.field private count:I

.field private currentClass:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世兰哲苏;

.field private currentMethod:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世哲兰苏;

.field private final dex:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;

.field private final out:Ljava/io/PrintWriter;

.field private final stringIds:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;Ljava/util/regex/Pattern;Ljava/io/PrintWriter;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/android/dx/io/CodeReader;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/android/dx/io/CodeReader;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/android/dx/command/grep/Grep;->codeReader:Lcom/android/dx/io/CodeReader;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    iput v1, p0, Lcom/android/dx/command/grep/Grep;->count:I

    .line 13
    .line 14
    iput-object p1, p0, Lcom/android/dx/command/grep/Grep;->dex:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;

    .line 15
    .line 16
    iput-object p3, p0, Lcom/android/dx/command/grep/Grep;->out:Ljava/io/PrintWriter;

    .line 17
    .line 18
    invoke-direct {p0, p1, p2}, Lcom/android/dx/command/grep/Grep;->getStringIds(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;Ljava/util/regex/Pattern;)Ljava/util/Set;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Lcom/android/dx/command/grep/Grep;->stringIds:Ljava/util/Set;

    .line 23
    .line 24
    new-instance p1, Lcom/android/dx/command/grep/Grep$1;

    .line 25
    .line 26
    invoke-direct {p1, p0}, Lcom/android/dx/command/grep/Grep$1;-><init>(Lcom/android/dx/command/grep/Grep;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p1}, Lcom/android/dx/io/CodeReader;->setStringVisitor(Lcom/android/dx/io/CodeReader$Visitor;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public static synthetic access$000(Lcom/android/dx/command/grep/Grep;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/android/dx/command/grep/Grep;->encounterString(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private encounterString(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/android/dx/command/grep/Grep;->stringIds:Ljava/util/Set;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/android/dx/command/grep/Grep;->out:Ljava/io/PrintWriter;

    .line 14
    .line 15
    new-instance v1, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0}, Lcom/android/dx/command/grep/Grep;->location()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v2, " "

    .line 28
    .line 29
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget-object v2, p0, Lcom/android/dx/command/grep/Grep;->dex:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;

    .line 33
    .line 34
    iget-object v2, v2, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏哲兰世;

    .line 35
    .line 36
    invoke-virtual {v2, p1}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏哲兰世;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {v0, p1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    iget p1, p0, Lcom/android/dx/command/grep/Grep;->count:I

    .line 53
    .line 54
    add-int/lit8 p1, p1, 0x1

    .line 55
    .line 56
    iput p1, p0, Lcom/android/dx/command/grep/Grep;->count:I

    .line 57
    .line 58
    :cond_0
    return-void
.end method

.method private getStringIds(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;Ljava/util/regex/Pattern;)Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5b50\u54f2\u5170\u82cf\u4e16/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;",
            "Ljava/util/regex/Pattern;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p1, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏哲兰世;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/util/AbstractList;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const/4 v0, 0x0

    .line 13
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {p2, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {p0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    return-object p0
.end method

.method private location()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/android/dx/command/grep/Grep;->dex:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;

    .line 2
    .line 3
    iget-object v0, v0, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰哲苏:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏哲兰世;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/android/dx/command/grep/Grep;->currentClass:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世兰哲苏;

    .line 6
    .line 7
    iget v1, v1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰:I

    .line 8
    .line 9
    invoke-virtual {v0, v1}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏哲兰世;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/String;

    .line 14
    .line 15
    iget-object v1, p0, Lcom/android/dx/command/grep/Grep;->currentMethod:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世哲兰苏;

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    iget-object v2, p0, Lcom/android/dx/command/grep/Grep;->dex:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;

    .line 20
    .line 21
    iget-object v2, v2, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏哲世兰:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏哲兰世;

    .line 22
    .line 23
    iget v1, v1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:I

    .line 24
    .line 25
    invoke-virtual {v2, v1}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏哲兰世;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲兰世苏;

    .line 30
    .line 31
    const-string v2, "."

    .line 32
    .line 33
    invoke-static {v0, v2}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲苏兰世(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iget-object p0, p0, Lcom/android/dx/command/grep/Grep;->dex:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;

    .line 38
    .line 39
    iget-object p0, p0, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏哲兰世;

    .line 40
    .line 41
    iget v1, v1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪兰世苏哲:I

    .line 42
    .line 43
    invoke-virtual {p0, v1}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏哲兰世;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    check-cast p0, Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :cond_0
    return-object v0
.end method

.method private readArray(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;)V
    .locals 5

    .line 1
    const/16 v0, 0x1c

    .line 2
    .line 3
    invoke-virtual {p1, v0}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰(I)V

    .line 4
    .line 5
    .line 6
    const/4 v1, -0x1

    .line 7
    iput v1, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲:I

    .line 8
    .line 9
    iget-object v1, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏哲兰;

    .line 10
    .line 11
    invoke-static {v1}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子苏哲世楪兰(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏哲兰;)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x0

    .line 16
    :goto_0
    if-ge v2, v1, :cond_2

    .line 17
    .line 18
    invoke-virtual {p1}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    const/16 v4, 0x17

    .line 23
    .line 24
    if-eq v3, v4, :cond_1

    .line 25
    .line 26
    if-eq v3, v0, :cond_0

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_0
    invoke-direct {p0, p1}, Lcom/android/dx/command/grep/Grep;->readArray(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;)V

    .line 30
    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    invoke-virtual {p1}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世兰哲苏()I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    invoke-direct {p0, v3}, Lcom/android/dx/command/grep/Grep;->encounterString(I)V

    .line 38
    .line 39
    .line 40
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    return-void
.end method


# virtual methods
.method public grep()I
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/android/dx/command/grep/Grep;->dex:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v1, v0, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰世哲苏;

    .line 7
    .line 8
    iget-object v1, v1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰世苏哲;

    .line 9
    .line 10
    invoke-virtual {v1}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏哲兰()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance v1, Lcom/google/protobuf/飘花落叶言世兰楪子哲苏;

    .line 24
    .line 25
    invoke-direct {v1, v0}, Lcom/google/protobuf/飘花落叶言世兰楪子哲苏;-><init>(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;)V

    .line 26
    .line 27
    .line 28
    move-object v0, v1

    .line 29
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    const/4 v2, 0x0

    .line 34
    if-eqz v1, :cond_5

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世兰哲苏;

    .line 41
    .line 42
    iput-object v1, p0, Lcom/android/dx/command/grep/Grep;->currentClass:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世兰哲苏;

    .line 43
    .line 44
    iput-object v2, p0, Lcom/android/dx/command/grep/Grep;->currentMethod:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世哲兰苏;

    .line 45
    .line 46
    iget v2, v1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰:I

    .line 47
    .line 48
    if-nez v2, :cond_2

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    iget-object v2, p0, Lcom/android/dx/command/grep/Grep;->dex:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;

    .line 52
    .line 53
    invoke-virtual {v2, v1}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰苏哲(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世兰哲苏;)L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世兰苏哲;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    iget v1, v1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲兰世:I

    .line 58
    .line 59
    if-eqz v1, :cond_3

    .line 60
    .line 61
    new-instance v3, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;

    .line 62
    .line 63
    iget-object v4, p0, Lcom/android/dx/command/grep/Grep;->dex:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;

    .line 64
    .line 65
    invoke-virtual {v4, v1}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏(I)L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰世哲;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-direct {v3, v1}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;-><init>(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏哲兰;)V

    .line 70
    .line 71
    .line 72
    invoke-direct {p0, v3}, Lcom/android/dx/command/grep/Grep;->readArray(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;)V

    .line 73
    .line 74
    .line 75
    :cond_3
    iget-object v1, v2, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰:[L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世哲兰苏;

    .line 76
    .line 77
    array-length v3, v1

    .line 78
    iget-object v2, v2, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏:[L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世哲兰苏;

    .line 79
    .line 80
    array-length v4, v2

    .line 81
    add-int/2addr v3, v4

    .line 82
    new-array v4, v3, [L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世哲兰苏;

    .line 83
    .line 84
    array-length v5, v1

    .line 85
    const/4 v6, 0x0

    .line 86
    invoke-static {v1, v6, v4, v6, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 87
    .line 88
    .line 89
    array-length v1, v1

    .line 90
    array-length v5, v2

    .line 91
    invoke-static {v2, v6, v4, v1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 92
    .line 93
    .line 94
    :goto_1
    if-ge v6, v3, :cond_1

    .line 95
    .line 96
    aget-object v1, v4, v6

    .line 97
    .line 98
    iput-object v1, p0, Lcom/android/dx/command/grep/Grep;->currentMethod:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世哲兰苏;

    .line 99
    .line 100
    iget v2, v1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰:I

    .line 101
    .line 102
    if-eqz v2, :cond_4

    .line 103
    .line 104
    iget-object v2, p0, Lcom/android/dx/command/grep/Grep;->codeReader:Lcom/android/dx/io/CodeReader;

    .line 105
    .line 106
    iget-object v5, p0, Lcom/android/dx/command/grep/Grep;->dex:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;

    .line 107
    .line 108
    invoke-virtual {v5, v1}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰哲苏(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世哲兰苏;)L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏哲世兰;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    iget-object v1, v1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世兰苏哲:[S

    .line 113
    .line 114
    invoke-virtual {v2, v1}, Lcom/android/dx/io/CodeReader;->visitAll([S)V

    .line 115
    .line 116
    .line 117
    :cond_4
    add-int/lit8 v6, v6, 0x1

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_5
    iput-object v2, p0, Lcom/android/dx/command/grep/Grep;->currentClass:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世兰哲苏;

    .line 121
    .line 122
    iput-object v2, p0, Lcom/android/dx/command/grep/Grep;->currentMethod:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世哲兰苏;

    .line 123
    .line 124
    iget p0, p0, Lcom/android/dx/command/grep/Grep;->count:I

    .line 125
    .line 126
    return p0
.end method
