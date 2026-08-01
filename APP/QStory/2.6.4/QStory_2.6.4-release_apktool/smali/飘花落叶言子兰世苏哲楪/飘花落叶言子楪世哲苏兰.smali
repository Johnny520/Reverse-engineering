.class public interface abstract L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世哲苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/lang/AutoCloseable;


# virtual methods
.method public abstract getBlob(I)[B
.end method

.method public abstract getColumnCount()I
.end method

.method public abstract getColumnName(I)Ljava/lang/String;
.end method

.method public abstract getLong(I)J
.end method

.method public abstract isNull(I)Z
.end method

.method public abstract reset()V
.end method

.method public 飘花落叶言子世兰苏楪哲()Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p0, v0}, L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世哲苏兰;->getLong(I)J

    .line 3
    .line 4
    .line 5
    move-result-wide v1

    .line 6
    const-wide/16 v3, 0x0

    .line 7
    .line 8
    cmp-long p0, v1, v3

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x1

    .line 13
    return p0

    .line 14
    :cond_0
    return v0
.end method

.method public abstract 飘花落叶言子世哲苏兰楪(ILjava/lang/String;)V
.end method

.method public abstract 飘花落叶言子哲世楪兰苏([B)V
.end method

.method public abstract 飘花落叶言子哲苏楪世兰()Z
.end method

.method public abstract 飘花落叶言子楪世兰苏哲(IJ)V
.end method

.method public abstract 飘花落叶言子楪苏世兰哲(I)V
.end method

.method public abstract 飘花落叶言子楪苏兰哲世()V
.end method

.method public abstract 飘花落叶言子苏哲世兰楪(I)Ljava/lang/String;
.end method
