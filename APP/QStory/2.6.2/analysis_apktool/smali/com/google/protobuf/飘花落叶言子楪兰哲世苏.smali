.class public final Lcom/google/protobuf/飘花落叶言子楪兰哲世苏;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/protobuf/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 3

    .line 1
    iget p0, p0, Lcom/google/protobuf/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lcom/google/protobuf/飘花落叶言楪子哲兰世苏;

    .line 7
    .line 8
    check-cast p2, Lcom/google/protobuf/飘花落叶言楪子哲兰世苏;

    .line 9
    .line 10
    iget-object p0, p1, Lcom/google/protobuf/飘花落叶言楪子哲兰世苏;->飘花落叶言子楪哲兰苏世:Lcom/google/protobuf/DescriptorProtos$EnumValueDescriptorProto;

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$EnumValueDescriptorProto;->getNumber()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    iget-object p1, p2, Lcom/google/protobuf/飘花落叶言楪子哲兰世苏;->飘花落叶言子楪哲兰苏世:Lcom/google/protobuf/DescriptorProtos$EnumValueDescriptorProto;

    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$EnumValueDescriptorProto;->getNumber()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    invoke-static {p0, p1}, Ljava/lang/Integer;->compare(II)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0

    .line 27
    :pswitch_0
    check-cast p1, Lcom/google/protobuf/ByteString;

    .line 28
    .line 29
    check-cast p2, Lcom/google/protobuf/ByteString;

    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/google/protobuf/ByteString;->iterator()Lcom/google/protobuf/飘花落叶言子世楪哲苏兰;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {p2}, Lcom/google/protobuf/ByteString;->iterator()Lcom/google/protobuf/飘花落叶言子世楪哲苏兰;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_1

    .line 50
    .line 51
    invoke-interface {p0}, Lcom/google/protobuf/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪世苏兰哲()B

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    invoke-static {v1}, Lcom/google/protobuf/ByteString;->access$200(B)I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    invoke-interface {v0}, Lcom/google/protobuf/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪世苏兰哲()B

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    invoke-static {v2}, Lcom/google/protobuf/ByteString;->access$200(B)I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    invoke-static {v1, v2}, Ljava/lang/Integer;->compare(II)I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_0

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_1
    invoke-virtual {p1}, Lcom/google/protobuf/ByteString;->size()I

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    invoke-virtual {p2}, Lcom/google/protobuf/ByteString;->size()I

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    invoke-static {p0, p1}, Ljava/lang/Integer;->compare(II)I

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    :goto_0
    return v1

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
