.class final synthetic Lkotlinx/serialization/protobuf/internal/ProtobufDecoder$elementMarker$1;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/FunctionReferenceImpl;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u5170\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 7

    .line 1
    const-string v5, "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z"

    .line 2
    .line 3
    const/4 v6, 0x0

    .line 4
    const/4 v1, 0x2

    .line 5
    const-class v3, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲世苏兰;

    .line 6
    .line 7
    const-string v4, "readIfAbsent"

    .line 8
    .line 9
    move-object v0, p0

    .line 10
    move-object v2, p1

    .line 11
    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke(L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;I)Ljava/lang/Boolean;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lkotlin/jvm/internal/CallableReference;->receiver:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲世苏兰;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-interface {p1, p2}, L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰(I)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x0

    .line 16
    if-nez v0, :cond_2

    .line 17
    .line 18
    invoke-interface {p1, p2}, L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世兰哲(I)L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-interface {p1}, L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;->getKind()Landroidx/window/area/飘花落叶言子楪世兰哲苏;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    sget-object v0, L飘花落叶言世哲子楪苏兰/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世兰苏哲:L飘花落叶言世哲子楪苏兰/飘花落叶言子楪苏哲世兰;

    .line 27
    .line 28
    invoke-static {p2, v0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const/4 v2, 0x1

    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    sget-object v0, L飘花落叶言世哲子楪苏兰/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲兰苏:L飘花落叶言世哲子楪苏兰/飘花落叶言子楪苏哲世兰;

    .line 36
    .line 37
    invoke-static {p2, v0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    if-eqz p2, :cond_0

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_0
    invoke-interface {p1}, L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰()Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-eqz p1, :cond_2

    .line 49
    .line 50
    iput-boolean v2, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰哲苏世:Z

    .line 51
    .line 52
    :goto_0
    move v1, v2

    .line 53
    goto :goto_2

    .line 54
    :cond_1
    :goto_1
    iput-boolean v1, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰哲苏世:Z

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    :goto_2
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 62
    check-cast p1, L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lkotlinx/serialization/protobuf/internal/ProtobufDecoder$elementMarker$1;->invoke(L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;I)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method
