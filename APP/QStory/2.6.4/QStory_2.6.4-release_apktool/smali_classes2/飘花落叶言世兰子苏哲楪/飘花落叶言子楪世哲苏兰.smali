.class public abstract L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世哲苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field private exceptionCollectionTool:L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;

.field private hasUiPath:Z

.field private isLoad:Z

.field private itemPath:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世哲苏兰;->isLoad:Z

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世哲苏兰;->hasUiPath:Z

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final getExceptionCollectionToolInstance()L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;
    .locals 1

    .line 1
    iget-object v0, p0, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世哲苏兰;->exceptionCollectionTool:L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v0, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;

    .line 7
    .line 8
    invoke-direct {v0, p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;-><init>(L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世哲苏兰;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世哲苏兰;->exceptionCollectionTool:L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;

    .line 12
    .line 13
    return-object v0
.end method

.method public final getItemPath()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世哲苏兰;->itemPath:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public hasPath()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世哲苏兰;->hasUiPath:Z

    .line 2
    .line 3
    return p0
.end method

.method public hashCode()I
    .locals 0

    .line 1
    invoke-virtual {p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世哲苏兰;->getItemPath()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final initPath(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世哲苏兰;->itemPath:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public isLoadedByDefault()Z
    .locals 0

    .line 1
    instance-of p0, p0, L飘花落叶言世哲楪兰苏子/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    return p0
.end method

.method public abstract loadHook(Ljava/lang/ClassLoader;)V
.end method

.method public setHasUiPath(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世哲苏兰;->hasUiPath:Z

    .line 2
    .line 3
    return-void
.end method

.method public startLoadHook()V
    .locals 1

    .line 1
    iget-boolean v0, p0, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世哲苏兰;->isLoad:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    :try_start_0
    iput-boolean v0, p0, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世哲苏兰;->isLoad:Z

    .line 8
    .line 9
    sget-object v0, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏哲兰;

    .line 10
    .line 11
    invoke-virtual {p0, v0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世哲苏兰;->loadHook(Ljava/lang/ClassLoader;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :catchall_0
    move-exception v0

    .line 16
    invoke-virtual {p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世哲苏兰;->getExceptionCollectionToolInstance()L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0, v0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x2f5

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
    iget-object v1, p0, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世哲苏兰;->itemPath:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const/16 v1, 0x27

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const/16 v1, 0x2f6

    .line 26
    .line 27
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    iget-boolean v1, p0, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世哲苏兰;->hasUiPath:Z

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const/16 v1, 0x2f7

    .line 40
    .line 41
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-boolean v1, p0, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世哲苏兰;->isLoad:Z

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const/16 v1, 0x2f8

    .line 54
    .line 55
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    iget-object p0, p0, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世哲苏兰;->exceptionCollectionTool:L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;

    .line 63
    .line 64
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const/16 p0, 0x7d

    .line 68
    .line 69
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0
.end method
