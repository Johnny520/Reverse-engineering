.class public final Lbsh/classpath/飘花落叶言子楪苏兰哲世;
.super Lbsh/classpath/飘花落叶言子楪世苏哲兰;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static 飘花落叶言子楪兰世苏哲:Lbsh/classpath/飘花落叶言子楪苏兰哲世;


# instance fields
.field public 飘花落叶言子楪哲兰苏世:Lbsh/classpath/DiscreteFilesClassLoader$ClassSourceMap;


# virtual methods
.method public final findClass(Ljava/lang/String;)Ljava/lang/Class;
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/classpath/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰苏世:Lbsh/classpath/DiscreteFilesClassLoader$ClassSourceMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lbsh/classpath/DiscreteFilesClassLoader$ClassSourceMap;->get(Ljava/lang/Object;)Lbsh/classpath/飘花落叶言子楪苏世兰哲;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lbsh/classpath/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)[B

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object p0, p0, Lbsh/classpath/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Lbsh/classpath/ClassManagerImpl;

    .line 16
    .line 17
    iget-object v1, p0, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲兰苏:L飘花落叶言子兰哲苏楪世/飘花落叶言子楪世哲苏兰;

    .line 18
    .line 19
    invoke-static {p1, v0, v1}, L飘花落叶言子兰哲苏楪世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;[BLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object p0, p0, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲兰苏:L飘花落叶言子兰哲苏楪世/飘花落叶言子楪世哲苏兰;

    .line 24
    .line 25
    iget-object p0, p0, L飘花落叶言子兰哲苏楪世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/ConcurrentHashMap;

    .line 26
    .line 27
    invoke-virtual {p0, p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    return-object v0

    .line 31
    :cond_0
    invoke-super {p0, p1}, Lbsh/classpath/飘花落叶言子楪世苏哲兰;->findClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, "for files: "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Lbsh/classpath/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰苏世:Lbsh/classpath/DiscreteFilesClassLoader$ClassSourceMap;

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method
