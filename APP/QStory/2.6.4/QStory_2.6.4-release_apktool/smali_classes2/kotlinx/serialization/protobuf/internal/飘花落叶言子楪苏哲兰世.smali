.class public final Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪苏哲兰世;
.super Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲世苏兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public 飘花落叶言子世楪苏兰哲:I


# virtual methods
.method public final 飘花落叶言子世楪苏哲兰(L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;)I
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰世苏哲:Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;

    .line 5
    .line 6
    iget-boolean v0, p1, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object p1, p1, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰:Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪世苏哲兰;

    .line 11
    .line 12
    iget v0, p1, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 13
    .line 14
    iget p1, p1, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:I

    .line 15
    .line 16
    sub-int/2addr v0, p1

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    const/4 p0, -0x1

    .line 20
    return p0

    .line 21
    :cond_0
    iget p1, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪苏哲兰世;->飘花落叶言子世楪苏兰哲:I

    .line 22
    .line 23
    add-int/lit8 v0, p1, 0x1

    .line 24
    .line 25
    iput v0, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪苏哲兰世;->飘花落叶言子世楪苏兰哲:I

    .line 26
    .line 27
    return p1
.end method

.method public final 飘花落叶言子哲楪世兰苏(J)Ljava/lang/String;
    .locals 0

    .line 1
    new-instance p0, Lkotlinx/serialization/SerializationException;

    .line 2
    .line 3
    const-string p1, "Packing only supports primitive number types. The actual reading is for string."

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lkotlinx/serialization/SerializationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final 飘花落叶言子哲楪兰世苏(L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;I)J
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-wide/16 p0, 0x4c2c

    .line 5
    .line 6
    return-wide p0
.end method

.method public final 飘花落叶言子楪世苏兰哲(L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;)L飘花落叶言世哲子楪兰苏/飘花落叶言子楪世苏哲兰;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p0, Lkotlinx/serialization/SerializationException;

    .line 5
    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    const-string v1, "Packing only supports primitive number types. The input type however was a struct: "

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-direct {p0, p1}, Lkotlinx/serialization/SerializationException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p0
.end method
