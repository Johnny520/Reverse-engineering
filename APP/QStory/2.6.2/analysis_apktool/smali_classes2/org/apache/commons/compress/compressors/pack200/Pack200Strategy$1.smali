.class final enum Lorg/apache/commons/compress/compressors/pack200/Pack200Strategy$1;
.super Lorg/apache/commons/compress/compressors/pack200/Pack200Strategy;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/commons/compress/compressors/pack200/Pack200Strategy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4011
    name = null
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lorg/apache/commons/compress/compressors/pack200/Pack200Strategy;-><init>(Ljava/lang/String;ILorg/apache/commons/compress/compressors/pack200/Pack200Strategy$1;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public newStreamBridge()Lorg/apache/commons/compress/compressors/pack200/飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    new-instance p0, Lorg/apache/commons/compress/compressors/pack200/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, v0}, Ljava/io/FilterOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method
