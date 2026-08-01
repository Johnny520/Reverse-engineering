.class public final Lcom/google/protobuf/飘花落叶言子世楪苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lcom/google/protobuf/飘花落叶言子世楪苏兰哲;
.implements Lcom/google/protobuf/飘花落叶言世子楪哲苏兰;
.implements Lcom/google/protobuf/飘花落叶言世哲子苏楪兰;


# instance fields
.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lcom/google/protobuf/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance p0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 10
    .line 11
    .line 12
    new-instance p0, Ljava/util/Stack;

    .line 13
    .line 14
    invoke-direct {p0}, Ljava/util/Stack;-><init>()V

    .line 15
    .line 16
    .line 17
    new-instance p0, Ljava/util/HashMap;

    .line 18
    .line 19
    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 23
    iput p1, p0, Lcom/google/protobuf/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪哲苏兰世:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public 飘花落叶言子楪世哲苏兰(I)Lcom/google/protobuf/飘花落叶言世子楪苏兰哲;
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    invoke-static {p1}, Lcom/google/protobuf/Syntax;->forNumber(I)Lcom/google/protobuf/Syntax;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_1
    invoke-static {p1}, Lcom/google/protobuf/NullValue;->forNumber(I)Lcom/google/protobuf/NullValue;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :pswitch_2
    invoke-static {p1}, Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;->forNumber(I)Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_3
    invoke-static {p1}, Lcom/google/protobuf/DescriptorProtos$Edition;->forNumber(I)Lcom/google/protobuf/DescriptorProtos$Edition;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public 飘花落叶言子楪世苏兰哲()V
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p0
.end method

.method public 飘花落叶言子楪世苏哲兰(I[BI)[B
    .locals 1

    .line 1
    iget p0, p0, Lcom/google/protobuf/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p0, p3, [B

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-static {p2, p1, p0, v0, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 10
    .line 11
    .line 12
    return-object p0

    .line 13
    :pswitch_0
    add-int/2addr p3, p1

    .line 14
    invoke-static {p2, p1, p3}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
