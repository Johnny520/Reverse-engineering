.class public final synthetic Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo$$serializer$annotationImpl$kotlinx_serialization_protobuf_ProtoNumber$0;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世苏兰哲;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo$$serializer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x32
.end annotation


# instance fields
.field private final synthetic number:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo$$serializer$annotationImpl$kotlinx_serialization_protobuf_ProtoNumber$0;->number:I

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final synthetic annotationType()Ljava/lang/Class;
    .locals 0

    .line 1
    const-class p0, L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    check-cast p1, L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世苏兰哲;

    .line 7
    .line 8
    invoke-interface {p0}, L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世苏兰哲;->number()I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    invoke-interface {p1}, L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世苏兰哲;->number()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-eq p0, p1, :cond_1

    .line 17
    .line 18
    :goto_0
    const/4 p0, 0x0

    .line 19
    return p0

    .line 20
    :cond_1
    const/4 p0, 0x1

    .line 21
    return p0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    const-wide v0, -0x36a5872f051405a7L    # -2.3613758469527734E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    mul-int/lit8 v0, v0, 0x7f

    .line 15
    .line 16
    iget p0, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo$$serializer$annotationImpl$kotlinx_serialization_protobuf_ProtoNumber$0;->number:I

    .line 17
    .line 18
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    xor-int/2addr p0, v0

    .line 23
    return p0
.end method

.method public final synthetic number()I
    .locals 0

    .line 1
    iget p0, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo$$serializer$annotationImpl$kotlinx_serialization_protobuf_ProtoNumber$0;->number:I

    .line 2
    .line 3
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-wide v1, -0x36a58716051405a7L    # -2.3614098751894655E45

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
    iget p0, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo$$serializer$annotationImpl$kotlinx_serialization_protobuf_ProtoNumber$0;->number:I

    .line 19
    .line 20
    const/16 v1, 0x29

    .line 21
    .line 22
    invoke-static {v0, p0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰世苏(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method
