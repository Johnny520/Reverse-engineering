.class public abstract Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;
.super Lcom/google/protobuf/GeneratedMessage;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lcom/google/protobuf/飘花落叶言楪哲世兰苏子;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/GeneratedMessage;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "ExtendableMessage"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageT:",
        "Lcom/google/protobuf/GeneratedMessage$ExtendableMessage<",
        "TMessageT;>;>",
        "Lcom/google/protobuf/GeneratedMessage;",
        "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u54f2\u4e16\u5170\u82cf\u5b50;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private final extensions:Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u82cf\u5170\u4e16\u54f2\u5b50;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;->extensions:Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/protobuf/GeneratedMessage$\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2;",
            ")V"
        }
    .end annotation

    .line 12
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage;-><init>(Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;)V

    .line 13
    invoke-static {p1}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;->access$400(Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;)Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;

    move-result-object p1

    iput-object p1, p0, Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;->extensions:Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;

    return-void
.end method

.method public static synthetic access$600(Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;)Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;->extensions:Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;

    .line 2
    .line 3
    return-object p0
.end method

.method private verifyContainingType(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;)V
    .locals 0

    .line 1
    iget-object p1, p1, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子世楪苏兰哲:Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getDescriptorForType()Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-ne p1, p0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const-string p0, "FieldDescriptor does not match message type."

    .line 11
    .line 12
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method private verifyExtensionContainingType(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;)V
    .locals 2

    .line 1
    iget-object v0, p1, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子世楪苏兰哲:Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getDescriptorForType()Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v1, "Extension is for type \""

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p1, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子世楪苏兰哲:Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 18
    .line 19
    iget-object p1, p1, Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string p1, "\" which does not match message type \""

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getDescriptorForType()Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/String;

    .line 34
    .line 35
    const-string p1, "\"."

    .line 36
    .line 37
    invoke-static {v0, p0, p1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public extensionsAreInitialized()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;->extensions:Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪哲兰世苏()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final extensionsIterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u54f2\u4e16\u82cf\u5b50\u5170;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/google/protobuf/飘花落叶言楪哲世苏兰子;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;->extensions:Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcom/google/protobuf/飘花落叶言楪哲世苏兰子;-><init>(Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public extensionsSerializedSize()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;->extensions:Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪哲苏世兰()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public extensionsSerializedSizeAsMessageSet()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;->extensions:Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪苏兰世哲()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getAllFields()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5b50\u5170\u4e16\u82cf\u54f2;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, v0}, Lcom/google/protobuf/GeneratedMessage;->access$800(Lcom/google/protobuf/GeneratedMessage;Z)Ljava/util/Map;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;->getExtensionFields()Ljava/util/Map;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-interface {v0, p0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public getAllFieldsRaw()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5b50\u5170\u4e16\u82cf\u54f2;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, v0}, Lcom/google/protobuf/GeneratedMessage;->access$800(Lcom/google/protobuf/GeneratedMessage;Z)Ljava/util/Map;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;->getExtensionFields()Ljava/util/Map;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-interface {v0, p0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/google/protobuf/飘花落叶言楪哲世兰苏子;->getDefaultInstanceForType()Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public abstract synthetic getDefaultInstanceForType()Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
.end method

.method public bridge synthetic getExtension(Lcom/google/protobuf/飘花落叶言楪世兰子哲苏;)Ljava/lang/Object;
    .locals 0

    .line 59
    invoke-super {p0, p1}, Lcom/google/protobuf/飘花落叶言楪哲世兰苏子;->getExtension(Lcom/google/protobuf/飘花落叶言楪世兰子哲苏;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic getExtension(Lcom/google/protobuf/飘花落叶言楪世兰子哲苏;I)Ljava/lang/Object;
    .locals 0

    .line 56
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/飘花落叶言楪哲世兰苏子;->getExtension(Lcom/google/protobuf/飘花落叶言楪世兰子哲苏;I)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final getExtension(Lcom/google/protobuf/飘花落叶言楪世兰苏子哲;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u4e16\u5170\u82cf\u5b50\u54f2;",
            ")TT;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lcom/google/protobuf/GeneratedMessage;->access$500(Lcom/google/protobuf/飘花落叶言楪世兰苏子哲;)Lcom/google/protobuf/飘花落叶言楪世兰子哲苏;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言楪世兰子哲苏;->飘花落叶言子楪世哲苏兰()Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-direct {p0, v0}, Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;->verifyExtensionContainingType(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;)V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;->extensions:Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪苏哲兰世(Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    if-nez p0, :cond_2

    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪苏兰世哲()Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-eqz p0, :cond_0

    .line 25
    .line 26
    sget-object p0, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;->飘花落叶言子楪兰世哲苏:Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_0
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪哲兰苏世()Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    sget-object v1, Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;->MESSAGE:Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;

    .line 34
    .line 35
    if-ne p0, v1, :cond_1

    .line 36
    .line 37
    check-cast p1, Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;

    .line 38
    .line 39
    iget-object p0, p1, Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;->飘花落叶言子楪世哲苏兰:Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    .line 40
    .line 41
    return-object p0

    .line 42
    :cond_1
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪哲世兰苏()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {p1, p0}, Lcom/google/protobuf/飘花落叶言楪世兰子哲苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    :cond_2
    invoke-virtual {p1, p0}, Lcom/google/protobuf/飘花落叶言楪世兰子哲苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0
.end method

.method public final getExtension(Lcom/google/protobuf/飘花落叶言楪世兰苏子哲;I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u4e16\u5170\u82cf\u5b50\u54f2;",
            "I)TT;"
        }
    .end annotation

    .line 60
    invoke-static {p1}, Lcom/google/protobuf/GeneratedMessage;->access$500(Lcom/google/protobuf/飘花落叶言楪世兰苏子哲;)Lcom/google/protobuf/飘花落叶言楪世兰子哲苏;

    move-result-object p1

    .line 61
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言楪世兰子哲苏;->飘花落叶言子楪世哲苏兰()Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;

    move-result-object v0

    .line 62
    invoke-direct {p0, v0}, Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;->verifyExtensionContainingType(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;)V

    .line 63
    iget-object p0, p0, Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;->extensions:Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;

    .line 64
    invoke-virtual {p0, v0, p2}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪哲世苏兰(Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;I)Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/google/protobuf/飘花落叶言楪世兰子哲苏;->飘花落叶言子楪世哲兰苏(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic getExtension(Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;)Ljava/lang/Object;
    .locals 0

    .line 57
    invoke-super {p0, p1}, Lcom/google/protobuf/飘花落叶言楪哲世兰苏子;->getExtension(Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic getExtension(Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;I)Ljava/lang/Object;
    .locals 0

    .line 58
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/飘花落叶言楪哲世兰苏子;->getExtension(Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;I)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic getExtensionCount(Lcom/google/protobuf/飘花落叶言楪世兰子哲苏;)I
    .locals 0

    .line 20
    invoke-super {p0, p1}, Lcom/google/protobuf/飘花落叶言楪哲世兰苏子;->getExtensionCount(Lcom/google/protobuf/飘花落叶言楪世兰子哲苏;)I

    move-result p0

    return p0
.end method

.method public final getExtensionCount(Lcom/google/protobuf/飘花落叶言楪世兰苏子哲;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u4e16\u5170\u82cf\u5b50\u54f2;",
            ")I"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lcom/google/protobuf/GeneratedMessage;->access$500(Lcom/google/protobuf/飘花落叶言楪世兰苏子哲;)Lcom/google/protobuf/飘花落叶言楪世兰子哲苏;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言楪世兰子哲苏;->飘花落叶言子楪世哲苏兰()Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;->verifyExtensionContainingType(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;)V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;->extensions:Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪哲世兰苏(Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;)I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0
.end method

.method public bridge synthetic getExtensionCount(Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;)I
    .locals 0

    .line 19
    invoke-super {p0, p1}, Lcom/google/protobuf/飘花落叶言楪哲世兰苏子;->getExtensionCount(Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;)I

    move-result p0

    return p0
.end method

.method public getExtensionFields()Ljava/util/Map;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5b50\u5170\u4e16\u82cf\u54f2;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;->extensions:Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪苏哲世兰()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getField(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p1, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪哲兰苏世:Lcom/google/protobuf/DescriptorProtos$FieldDescriptorProto;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/protobuf/DescriptorProtos$FieldDescriptorProto;->hasExtendee()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_3

    .line 8
    .line 9
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;->verifyContainingType(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;)V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;->extensions:Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪苏哲兰世(Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    if-nez p0, :cond_2

    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪苏兰世哲()Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-eqz p0, :cond_0

    .line 25
    .line 26
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_0
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪哲兰苏世()Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    sget-object v0, Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;->MESSAGE:Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;

    .line 34
    .line 35
    if-ne p0, v0, :cond_1

    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪兰世苏哲()Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-static {p0}, Lcom/google/protobuf/飘花落叶言楪世苏兰哲子;->getDefaultInstance(Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;)Lcom/google/protobuf/飘花落叶言楪世苏兰哲子;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0

    .line 46
    :cond_1
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪哲世兰苏()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    :cond_2
    return-object p0

    .line 51
    :cond_3
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessage;->getField(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0
.end method

.method public getRepeatedField(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p1, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪哲兰苏世:Lcom/google/protobuf/DescriptorProtos$FieldDescriptorProto;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/protobuf/DescriptorProtos$FieldDescriptorProto;->hasExtendee()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;->verifyContainingType(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;)V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;->extensions:Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;

    .line 13
    .line 14
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪哲世苏兰(Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessage;->getRepeatedField(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method

.method public getRepeatedFieldCount(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;)I
    .locals 1

    .line 1
    iget-object v0, p1, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪哲兰苏世:Lcom/google/protobuf/DescriptorProtos$FieldDescriptorProto;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/protobuf/DescriptorProtos$FieldDescriptorProto;->hasExtendee()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;->verifyContainingType(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;)V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;->extensions:Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪哲世兰苏(Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;)I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0

    .line 19
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessage;->getRepeatedFieldCount(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0
.end method

.method public bridge synthetic hasExtension(Lcom/google/protobuf/飘花落叶言楪世兰子哲苏;)Z
    .locals 0

    .line 20
    invoke-super {p0, p1}, Lcom/google/protobuf/飘花落叶言楪哲世兰苏子;->hasExtension(Lcom/google/protobuf/飘花落叶言楪世兰子哲苏;)Z

    move-result p0

    return p0
.end method

.method public final hasExtension(Lcom/google/protobuf/飘花落叶言楪世兰苏子哲;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u4e16\u5170\u82cf\u5b50\u54f2;",
            ")Z"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lcom/google/protobuf/GeneratedMessage;->access$500(Lcom/google/protobuf/飘花落叶言楪世兰苏子哲;)Lcom/google/protobuf/飘花落叶言楪世兰子哲苏;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言楪世兰子哲苏;->飘花落叶言子楪世哲苏兰()Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;->verifyExtensionContainingType(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;)V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;->extensions:Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪哲苏兰世(Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0
.end method

.method public bridge synthetic hasExtension(Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;)Z
    .locals 0

    .line 19
    invoke-super {p0, p1}, Lcom/google/protobuf/飘花落叶言楪哲世兰苏子;->hasExtension(Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;)Z

    move-result p0

    return p0
.end method

.method public hasField(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;)Z
    .locals 1

    .line 1
    iget-object v0, p1, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪哲兰苏世:Lcom/google/protobuf/DescriptorProtos$FieldDescriptorProto;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/protobuf/DescriptorProtos$FieldDescriptorProto;->hasExtendee()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;->verifyContainingType(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;)V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;->extensions:Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪哲苏兰世(Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0

    .line 19
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessage;->hasField(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0
.end method

.method public isInitialized()Z
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessage;->isInitialized()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;->extensionsAreInitialized()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method public makeExtensionsImmutable()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/google/protobuf/GeneratedMessage;->warnPre22Gencode(Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;->extensions:Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪兰苏世哲()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;->newBuilderForType()Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public abstract synthetic newBuilderForType()Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
.end method

.method public newExtensionSerializer()Lcom/google/protobuf/飘花落叶言楪哲世子苏兰;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;->extensions:Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object p0, Lcom/google/protobuf/飘花落叶言楪哲世兰子苏;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言楪哲世兰子苏;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    new-instance v0, Lcom/google/protobuf/飘花落叶言楪哲世子兰苏;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-direct {v0, p0, v1}, Lcom/google/protobuf/飘花落叶言楪哲世子兰苏;-><init>(Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;Z)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public newExtensionWriter()Lcom/google/protobuf/飘花落叶言楪哲世子兰苏;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u54f2\u4e16\u5b50\u5170\u82cf;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    new-instance v0, Lcom/google/protobuf/飘花落叶言楪哲世子兰苏;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/google/protobuf/飘花落叶言楪哲世子兰苏;-><init>(Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;Z)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public newMessageSetExtensionSerializer()Lcom/google/protobuf/飘花落叶言楪哲世子苏兰;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;->extensions:Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object p0, Lcom/google/protobuf/飘花落叶言楪哲世兰子苏;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言楪哲世兰子苏;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    new-instance v0, Lcom/google/protobuf/飘花落叶言楪哲世子兰苏;

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-direct {v0, p0, v1}, Lcom/google/protobuf/飘花落叶言楪哲世子兰苏;-><init>(Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;Z)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public newMessageSetExtensionWriter()Lcom/google/protobuf/飘花落叶言楪哲世子兰苏;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u54f2\u4e16\u5b50\u5170\u82cf;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/google/protobuf/飘花落叶言楪哲世子兰苏;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/google/protobuf/飘花落叶言楪哲世子兰苏;-><init>(Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;Z)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;->toBuilder()Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public abstract synthetic toBuilder()Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
.end method
