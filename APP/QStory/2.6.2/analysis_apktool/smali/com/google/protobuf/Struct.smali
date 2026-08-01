.class public final Lcom/google/protobuf/Struct;
.super Lcom/google/protobuf/GeneratedMessage;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lcom/google/protobuf/飘花落叶言世兰哲子苏楪;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lcom/google/protobuf/Struct;

.field public static final FIELDS_FIELD_NUMBER:I = 0x1

.field private static final PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u696a\u82cf\u5170\u5b50;"
        }
    .end annotation
.end field

.field private static final serialVersionUID:J


# instance fields
.field private fields_:Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u696a\u5170\u54f2\u82cf\u5b50;"
        }
    .end annotation
.end field

.field private memoizedIsInitialized:B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lcom/google/protobuf/RuntimeVersion$RuntimeDomain;->PUBLIC:Lcom/google/protobuf/RuntimeVersion$RuntimeDomain;

    .line 2
    .line 3
    const-string v1, "Struct"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/google/protobuf/飘花落叶言世兰子苏楪哲;->飘花落叶言子楪世苏哲兰(Lcom/google/protobuf/RuntimeVersion$RuntimeDomain;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lcom/google/protobuf/Struct;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/google/protobuf/Struct;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/google/protobuf/Struct;->DEFAULT_INSTANCE:Lcom/google/protobuf/Struct;

    .line 14
    .line 15
    new-instance v0, Lcom/google/protobuf/飘花落叶言世兰苏哲子楪;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lcom/google/protobuf/Struct;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 21
    .line 22
    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 9
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    const/4 v0, -0x1

    .line 10
    iput-byte v0, p0, Lcom/google/protobuf/Struct;->memoizedIsInitialized:B

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/protobuf/GeneratedMessage$\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage;-><init>(Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, -0x1

    .line 5
    iput-byte p1, p0, Lcom/google/protobuf/Struct;->memoizedIsInitialized:B

    .line 6
    .line 7
    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;Lcom/google/protobuf/飘花落叶言世兰苏哲子楪;)V
    .locals 0

    .line 8
    invoke-direct {p0, p1}, Lcom/google/protobuf/Struct;-><init>(Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;)V

    return-void
.end method

.method public static synthetic access$302(Lcom/google/protobuf/Struct;Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;)Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/protobuf/Struct;->fields_:Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$400(Lcom/google/protobuf/Struct;)Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/protobuf/Struct;->internalGetFields()Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static getDefaultInstance()Lcom/google/protobuf/Struct;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/Struct;->DEFAULT_INSTANCE:Lcom/google/protobuf/Struct;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/飘花落叶言世兰哲楪子苏;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 2
    .line 3
    return-object v0
.end method

.method private internalGetFields()Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u696a\u5170\u54f2\u82cf\u5b50;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/Struct;->fields_:Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    sget-object p0, Lcom/google/protobuf/飘花落叶言世兰哲子楪苏;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;

    .line 6
    .line 7
    new-instance v0, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;

    .line 8
    .line 9
    sget-object v1, Lcom/google/protobuf/MapField$StorageMode;->MAP:Lcom/google/protobuf/MapField$StorageMode;

    .line 10
    .line 11
    sget-object v2, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 12
    .line 13
    invoke-direct {v0, p0, v1, v2}, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;-><init>(Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;Lcom/google/protobuf/MapField$StorageMode;Ljava/util/Map;)V

    .line 14
    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_0
    return-object p0
.end method

.method public static newBuilder()Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 12
    sget-object v0, Lcom/google/protobuf/Struct;->DEFAULT_INSTANCE:Lcom/google/protobuf/Struct;

    invoke-virtual {v0}, Lcom/google/protobuf/Struct;->toBuilder()Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/google/protobuf/Struct;)Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/Struct;->DEFAULT_INSTANCE:Lcom/google/protobuf/Struct;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/protobuf/Struct;->toBuilder()Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p0}, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/Struct;)Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/google/protobuf/Struct;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/Struct;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 2
    .line 3
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessage;->parseDelimitedWithIOException(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Ljava/io/InputStream;)Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/google/protobuf/Struct;

    .line 8
    .line 9
    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/Struct;
    .locals 1

    .line 10
    sget-object v0, Lcom/google/protobuf/Struct;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 11
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessage;->parseDelimitedWithIOException(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Ljava/io/InputStream;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/Struct;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/Struct;
    .locals 2

    .line 17
    sget-object v0, Lcom/google/protobuf/Struct;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    check-cast v0, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;

    .line 18
    sget-object v1, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;

    .line 19
    invoke-virtual {v0, p0, v1}, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    move-result-object p0

    .line 20
    check-cast p0, Lcom/google/protobuf/Struct;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/Struct;
    .locals 1

    .line 21
    sget-object v0, Lcom/google/protobuf/Struct;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    check-cast v0, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;

    .line 22
    invoke-virtual {v0, p0, p1}, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    move-result-object p0

    .line 23
    check-cast p0, Lcom/google/protobuf/Struct;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;)Lcom/google/protobuf/Struct;
    .locals 1

    .line 35
    sget-object v0, Lcom/google/protobuf/Struct;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 36
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;)Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/Struct;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/Struct;
    .locals 1

    .line 37
    sget-object v0, Lcom/google/protobuf/Struct;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 38
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/Struct;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/google/protobuf/Struct;
    .locals 1

    .line 31
    sget-object v0, Lcom/google/protobuf/Struct;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 32
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Ljava/io/InputStream;)Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/Struct;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/Struct;
    .locals 1

    .line 33
    sget-object v0, Lcom/google/protobuf/Struct;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 34
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Ljava/io/InputStream;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/Struct;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;)Lcom/google/protobuf/Struct;
    .locals 2

    .line 1
    sget-object v0, Lcom/google/protobuf/Struct;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 2
    .line 3
    check-cast v0, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;

    .line 4
    .line 5
    sget-object v1, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;

    .line 6
    .line 7
    invoke-virtual {v0, p0, v1}, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲(Ljava/nio/ByteBuffer;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Lcom/google/protobuf/Struct;

    .line 12
    .line 13
    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/Struct;
    .locals 1

    .line 14
    sget-object v0, Lcom/google/protobuf/Struct;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    check-cast v0, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;

    .line 15
    invoke-virtual {v0, p0, p1}, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲(Ljava/nio/ByteBuffer;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    move-result-object p0

    .line 16
    check-cast p0, Lcom/google/protobuf/Struct;

    return-object p0
.end method

.method public static parseFrom([B)Lcom/google/protobuf/Struct;
    .locals 2

    .line 24
    sget-object v0, Lcom/google/protobuf/Struct;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    check-cast v0, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;

    .line 25
    sget-object v1, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;

    .line 26
    invoke-virtual {v0, p0, v1}, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏([BLcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    move-result-object p0

    .line 27
    check-cast p0, Lcom/google/protobuf/Struct;

    return-object p0
.end method

.method public static parseFrom([BLcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/Struct;
    .locals 1

    .line 28
    sget-object v0, Lcom/google/protobuf/Struct;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    check-cast v0, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;

    .line 29
    invoke-virtual {v0, p0, p1}, Lcom/google/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏([BLcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    move-result-object p0

    .line 30
    check-cast p0, Lcom/google/protobuf/Struct;

    return-object p0
.end method

.method public static parser()Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u696a\u82cf\u5170\u5b50;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/google/protobuf/Struct;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public containsFields(Ljava/lang/String;)Z
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/google/protobuf/Struct;->internalGetFields()Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪苏世哲兰()Ljava/util/Map;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-interface {p0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    const-string p0, "map key"

    .line 17
    .line 18
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/google/protobuf/Struct;

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    invoke-super {p0, p1}, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0

    .line 14
    :cond_1
    check-cast p1, Lcom/google/protobuf/Struct;

    .line 15
    .line 16
    invoke-direct {p0}, Lcom/google/protobuf/Struct;->internalGetFields()Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-direct {p1}, Lcom/google/protobuf/Struct;->internalGetFields()Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v1, v2}, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/4 v2, 0x0

    .line 29
    if-nez v1, :cond_2

    .line 30
    .line 31
    return v2

    .line 32
    :cond_2
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    if-nez p0, :cond_3

    .line 45
    .line 46
    return v2

    .line 47
    :cond_3
    return v0
.end method

.method public getDefaultInstanceForType()Lcom/google/protobuf/Struct;
    .locals 0

    .line 7
    sget-object p0, Lcom/google/protobuf/Struct;->DEFAULT_INSTANCE:Lcom/google/protobuf/Struct;

    return-object p0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;
    .locals 0

    .line 6
    invoke-virtual {p0}, Lcom/google/protobuf/Struct;->getDefaultInstanceForType()Lcom/google/protobuf/Struct;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/Struct;->getDefaultInstanceForType()Lcom/google/protobuf/Struct;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;
    .locals 0

    .line 1
    sget-object p0, Lcom/google/protobuf/飘花落叶言世兰哲楪子苏;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 2
    .line 3
    return-object p0
.end method

.method public getFields()Ljava/util/Map;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/google/protobuf/Value;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/Struct;->getFieldsMap()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getFieldsCount()I
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/protobuf/Struct;->internalGetFields()Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪苏世哲兰()Ljava/util/Map;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-interface {p0}, Ljava/util/Map;->size()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public getFieldsMap()Ljava/util/Map;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/google/protobuf/Value;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/google/protobuf/Struct;->internalGetFields()Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪苏世哲兰()Ljava/util/Map;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public getFieldsOrDefault(Ljava/lang/String;Lcom/google/protobuf/Value;)Lcom/google/protobuf/Value;
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/google/protobuf/Struct;->internalGetFields()Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪苏世哲兰()Ljava/util/Map;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-interface {p0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, Lcom/google/protobuf/Value;

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_0
    return-object p2

    .line 25
    :cond_1
    const-string p0, "map key"

    .line 26
    .line 27
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const/4 p0, 0x0

    .line 31
    return-object p0
.end method

.method public getFieldsOrThrow(Ljava/lang/String;)Lcom/google/protobuf/Value;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    invoke-direct {p0}, Lcom/google/protobuf/Struct;->internalGetFields()Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪苏世哲兰()Ljava/util/Map;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-interface {p0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, Lcom/google/protobuf/Value;

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_0
    invoke-static {}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰()V

    .line 26
    .line 27
    .line 28
    return-object v0

    .line 29
    :cond_1
    const-string p0, "map key"

    .line 30
    .line 31
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-object v0
.end method

.method public getParserForType()Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u696a\u82cf\u5170\u5b50;"
        }
    .end annotation

    .line 1
    sget-object p0, Lcom/google/protobuf/Struct;->PARSER:Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    .line 2
    .line 3
    return-object p0
.end method

.method public getSerializedSize()I
    .locals 5

    .line 1
    iget v0, p0, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰;->memoizedSize:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    invoke-direct {p0}, Lcom/google/protobuf/Struct;->internalGetFields()Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪苏世哲兰()Ljava/util/Map;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/4 v1, 0x0

    .line 24
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Ljava/util/Map$Entry;

    .line 35
    .line 36
    sget-object v3, Lcom/google/protobuf/飘花落叶言世兰哲子楪苏;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;

    .line 37
    .line 38
    invoke-virtual {v3}, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->newBuilderForType()Lcom/google/protobuf/飘花落叶言世楪哲子苏兰$飘花落叶言子楪世苏哲兰;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    check-cast v4, Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {v3, v4}, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰$飘花落叶言子楪世苏哲兰;->setKey(Ljava/lang/Object;)Lcom/google/protobuf/飘花落叶言世楪哲子苏兰$飘花落叶言子楪世苏哲兰;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    check-cast v2, Lcom/google/protobuf/Value;

    .line 57
    .line 58
    invoke-virtual {v3, v2}, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰$飘花落叶言子楪世苏哲兰;->setValue(Ljava/lang/Object;)Lcom/google/protobuf/飘花落叶言世楪哲子苏兰$飘花落叶言子楪世苏哲兰;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {v2}, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰$飘花落叶言子楪世苏哲兰;->buildPartial()Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    const/4 v3, 0x1

    .line 67
    invoke-static {v3, v2}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪苏世兰哲(ILcom/google/protobuf/飘花落叶言世苏哲子楪兰;)I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    add-int/2addr v1, v2

    .line 72
    goto :goto_0

    .line 73
    :cond_1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;->getSerializedSize()I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    add-int/2addr v0, v1

    .line 82
    iput v0, p0, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰;->memoizedSize:I

    .line 83
    .line 84
    return v0
.end method

.method public hashCode()I
    .locals 4

    .line 1
    iget v0, p0, Lcom/google/protobuf/飘花落叶言子楪世兰苏哲;->memoizedHashCode:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return v0

    .line 6
    :cond_0
    invoke-static {}, Lcom/google/protobuf/Struct;->getDescriptor()Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    add-int/lit16 v0, v0, 0x30b

    .line 15
    .line 16
    invoke-direct {p0}, Lcom/google/protobuf/Struct;->internalGetFields()Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪苏世哲兰()Ljava/util/Map;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_1

    .line 29
    .line 30
    const/4 v1, 0x1

    .line 31
    const/16 v2, 0x35

    .line 32
    .line 33
    const/16 v3, 0x25

    .line 34
    .line 35
    invoke-static {v0, v3, v1, v2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    invoke-direct {p0}, Lcom/google/protobuf/Struct;->internalGetFields()Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->hashCode()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    add-int/2addr v0, v1

    .line 48
    :cond_1
    mul-int/lit8 v0, v0, 0x1d

    .line 49
    .line 50
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;->hashCode()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    add-int/2addr v1, v0

    .line 59
    iput v1, p0, Lcom/google/protobuf/飘花落叶言子楪世兰苏哲;->memoizedHashCode:I

    .line 60
    .line 61
    return v1
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;
    .locals 2

    .line 1
    sget-object p0, Lcom/google/protobuf/飘花落叶言世兰哲楪子苏;->飘花落叶言子楪世苏兰哲:Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;

    .line 2
    .line 3
    const-class v0, Lcom/google/protobuf/Struct;

    .line 4
    .line 5
    const-class v1, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;

    .line 6
    .line 7
    invoke-virtual {p0, v0, v1}, Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;->飘花落叶言子楪世哲苏兰(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method public internalGetMapFieldReflection(I)Lcom/google/protobuf/飘花落叶言世苏子哲楪兰;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, v0, :cond_0

    .line 3
    .line 4
    invoke-direct {p0}, Lcom/google/protobuf/Struct;->internalGetFields()Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0

    .line 9
    :cond_0
    const-string p0, "Invalid map field number: "

    .line 10
    .line 11
    invoke-static {p1, p0}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    return-object p0
.end method

.method public final isInitialized()Z
    .locals 2

    .line 1
    iget-byte v0, p0, Lcom/google/protobuf/Struct;->memoizedIsInitialized:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return p0

    .line 11
    :cond_1
    iput-byte v1, p0, Lcom/google/protobuf/Struct;->memoizedIsInitialized:B

    .line 12
    .line 13
    return v1
.end method

.method public newBuilderForType()Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 10
    invoke-static {}, Lcom/google/protobuf/Struct;->newBuilder()Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public newBuilderForType(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    new-instance p0, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, p1, v0}, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;-><init>(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;Lcom/google/protobuf/飘花落叶言世兰苏哲子楪;)V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;
    .locals 0

    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/Struct;->newBuilderForType()Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 11
    invoke-virtual {p0}, Lcom/google/protobuf/Struct;->newBuilderForType()Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 8
    invoke-virtual {p0, p1}, Lcom/google/protobuf/Struct;->newBuilderForType(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public toBuilder()Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;
    .locals 2

    .line 1
    sget-object v0, Lcom/google/protobuf/Struct;->DEFAULT_INSTANCE:Lcom/google/protobuf/Struct;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-ne p0, v0, :cond_0

    .line 5
    .line 6
    new-instance p0, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;

    .line 7
    .line 8
    invoke-direct {p0, v1}, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;-><init>(Lcom/google/protobuf/飘花落叶言世兰苏哲子楪;)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance v0, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;-><init>(Lcom/google/protobuf/飘花落叶言世兰苏哲子楪;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p0}, Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/Struct;)Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;
    .locals 0

    .line 22
    invoke-virtual {p0}, Lcom/google/protobuf/Struct;->toBuilder()Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 23
    invoke-virtual {p0}, Lcom/google/protobuf/Struct;->toBuilder()Lcom/google/protobuf/Struct$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public writeTo(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/google/protobuf/Struct;->internalGetFields()Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/google/protobuf/飘花落叶言世兰哲子楪苏;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-static {p1, v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage;->serializeStringMapTo(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;->writeTo(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method
