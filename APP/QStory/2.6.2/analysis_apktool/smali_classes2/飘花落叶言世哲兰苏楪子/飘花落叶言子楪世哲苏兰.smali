.class public abstract L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field private exceptionCollectionTool:L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏兰哲;

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
    iput-boolean v0, p0, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;->isLoad:Z

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;->hasUiPath:Z

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final getExceptionCollectionToolInstance()L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏兰哲;
    .locals 1

    .line 1
    iget-object v0, p0, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;->exceptionCollectionTool:L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v0, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏兰哲;

    .line 7
    .line 8
    invoke-direct {v0, p0}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏兰哲;-><init>(L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;->exceptionCollectionTool:L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏兰哲;

    .line 12
    .line 13
    return-object v0
.end method

.method public final getItemPath()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;->itemPath:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public hasPath()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;->hasUiPath:Z

    .line 2
    .line 3
    return p0
.end method

.method public hashCode()I
    .locals 0

    .line 1
    invoke-virtual {p0}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;->getItemPath()Ljava/lang/String;

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
    iput-object p1, p0, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;->itemPath:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public isLoadedByDefault()Z
    .locals 0

    .line 1
    instance-of p0, p0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世哲兰苏;

    .line 2
    .line 3
    return p0
.end method

.method public abstract loadHook(Ljava/lang/ClassLoader;)V
.end method

.method public setHasUiPath(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;->hasUiPath:Z

    .line 2
    .line 3
    return-void
.end method

.method public startLoadHook()V
    .locals 1

    .line 1
    iget-boolean v0, p0, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;->isLoad:Z

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
    iput-boolean v0, p0, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;->isLoad:Z

    .line 8
    .line 9
    sget-object v0, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏哲兰;

    .line 10
    .line 11
    invoke-virtual {p0, v0}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;->loadHook(Ljava/lang/ClassLoader;)V
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
    invoke-virtual {p0}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;->getExceptionCollectionToolInstance()L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏兰哲;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0, v0}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-wide v1, -0x36a54cd7051405a7L    # -2.381705676682098E45

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
    iget-object v1, p0, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;->itemPath:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const/16 v1, 0x27

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-wide v1, -0x36a54ccf051405a7L    # -2.3817165657178394E45

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    iget-boolean v1, p0, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;->hasUiPath:Z

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-wide v1, -0x36a54cbc051405a7L    # -2.3817424271777254E45

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    iget-boolean v1, p0, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;->isLoad:Z

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-wide v1, -0x36a54ca6051405a7L    # -2.3817723720260144E45

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    iget-object p0, p0, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;->exceptionCollectionTool:L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏兰哲;

    .line 75
    .line 76
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const/16 p0, 0x7d

    .line 80
    .line 81
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    return-object p0
.end method
