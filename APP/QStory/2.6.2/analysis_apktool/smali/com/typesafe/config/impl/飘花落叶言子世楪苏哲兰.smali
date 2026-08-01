.class public final Lcom/typesafe/config/impl/飘花落叶言子世楪苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final 飘花落叶言子楪世哲苏兰:Ljava/io/DataOutputStream;

.field public final 飘花落叶言子楪世苏兰哲:Ljava/io/ByteArrayOutputStream;

.field public final 飘花落叶言子楪世苏哲兰:Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;


# direct methods
.method public constructor <init>(Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/typesafe/config/impl/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世苏哲兰:Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;

    .line 5
    .line 6
    new-instance p1, Ljava/io/ByteArrayOutputStream;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lcom/typesafe/config/impl/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世苏兰哲:Ljava/io/ByteArrayOutputStream;

    .line 12
    .line 13
    new-instance v0, Ljava/io/DataOutputStream;

    .line 14
    .line 15
    invoke-direct {v0, p1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lcom/typesafe/config/impl/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世哲苏兰:Ljava/io/DataOutputStream;

    .line 19
    .line 20
    return-void
.end method
