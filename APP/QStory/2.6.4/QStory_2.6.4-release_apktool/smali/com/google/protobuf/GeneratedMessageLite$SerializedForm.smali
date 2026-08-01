.class public final Lcom/google/protobuf/GeneratedMessageLite$SerializedForm;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/GeneratedMessageLite;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "SerializedForm"
.end annotation


# static fields
.field private static final serialVersionUID:J


# instance fields
.field private final asBytes:[B

.field private final messageClass:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private final messageClassName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$SerializedForm;->messageClass:Ljava/lang/Class;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$SerializedForm;->messageClassName:Ljava/lang/String;

    .line 19
    .line 20
    invoke-interface {p1}, Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;->toByteArray()[B

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, Lcom/google/protobuf/GeneratedMessageLite$SerializedForm;->asBytes:[B

    .line 25
    .line 26
    return-void
.end method

.method public static of(Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;)Lcom/google/protobuf/GeneratedMessageLite$SerializedForm;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/protobuf/GeneratedMessageLite$SerializedForm;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite$SerializedForm;-><init>(Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private resolveMessageClass()Ljava/lang/Class;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$SerializedForm;->messageClass:Ljava/lang/Class;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object p0, p0, Lcom/google/protobuf/GeneratedMessageLite$SerializedForm;->messageClassName:Ljava/lang/String;

    .line 6
    .line 7
    const-class v0, Lcom/google/protobuf/GeneratedMessageLite$SerializedForm;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-static {p0, v1, v0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const-class v0, Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_0
    new-instance p0, Ljava/lang/ClassNotFoundException;

    .line 28
    .line 29
    invoke-direct {p0}, Ljava/lang/ClassNotFoundException;-><init>()V

    .line 30
    .line 31
    .line 32
    throw p0

    .line 33
    :cond_1
    return-object v0
.end method


# virtual methods
.method public readResolve()Ljava/lang/Object;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageLite$SerializedForm;->resolveMessageClass()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    const-string v2, "DEFAULT_INSTANCE"

    .line 7
    .line 8
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 21
    .line 22
    invoke-interface {v1}, Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;->newBuilderForType()Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    iget-object v2, p0, Lcom/google/protobuf/GeneratedMessageLite$SerializedForm;->asBytes:[B

    .line 27
    .line 28
    invoke-interface {v1, v2}, Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;->mergeFrom([B)Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;

    .line 29
    .line 30
    .line 31
    invoke-interface {v1}, Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;->buildPartial()Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 32
    .line 33
    .line 34
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    return-object p0

    .line 36
    :catch_0
    move-exception p0

    .line 37
    goto :goto_0

    .line 38
    :catch_1
    move-exception p0

    .line 39
    goto :goto_1

    .line 40
    :catch_2
    move-exception v1

    .line 41
    goto :goto_2

    .line 42
    :catch_3
    move-exception v1

    .line 43
    goto :goto_3

    .line 44
    :catch_4
    move-exception v1

    .line 45
    goto :goto_4

    .line 46
    :goto_0
    const-string v1, "Unable to understand proto buffer"

    .line 47
    .line 48
    invoke-static {v1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    return-object v0

    .line 52
    :goto_1
    const-string v1, "Unable to call parsePartialFrom"

    .line 53
    .line 54
    invoke-static {v1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 55
    .line 56
    .line 57
    return-object v0

    .line 58
    :goto_2
    const-string v2, "Unable to call DEFAULT_INSTANCE in "

    .line 59
    .line 60
    iget-object p0, p0, Lcom/google/protobuf/GeneratedMessageLite$SerializedForm;->messageClassName:Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {v2, p0, v1}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    return-object v0

    .line 66
    :goto_3
    const-string v2, "Unable to find DEFAULT_INSTANCE in "

    .line 67
    .line 68
    iget-object p0, p0, Lcom/google/protobuf/GeneratedMessageLite$SerializedForm;->messageClassName:Ljava/lang/String;

    .line 69
    .line 70
    invoke-static {v2, p0, v1}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 71
    .line 72
    .line 73
    return-object v0

    .line 74
    :goto_4
    const-string v2, "Unable to find proto buffer class: "

    .line 75
    .line 76
    iget-object p0, p0, Lcom/google/protobuf/GeneratedMessageLite$SerializedForm;->messageClassName:Ljava/lang/String;

    .line 77
    .line 78
    invoke-static {v2, p0, v1}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    return-object v0
.end method
