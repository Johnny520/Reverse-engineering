.class public Lcom/esotericsoftware/kryo/serializers/RecordSerializer;
.super Lcom/esotericsoftware/kryo/serializers/ImmutableSerializer;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/esotericsoftware/kryo/serializers/RecordSerializer$RecordComponent;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/esotericsoftware/kryo/serializers/ImmutableSerializer<",
        "TT;>;"
    }
.end annotation


# static fields
.field private static final CONSTRUCTOR:Ljava/lang/ClassValue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ClassValue<",
            "Ljava/lang/reflect/Constructor<",
            "*>;>;"
        }
    .end annotation
.end field

.field private static final GET_NAME:Ljava/lang/reflect/Method;

.field private static final GET_RECORD_COMPONENTS:Ljava/lang/reflect/Method;

.field private static final GET_TYPE:Ljava/lang/reflect/Method;

.field private static final IS_RECORD:Ljava/lang/reflect/Method;

.field private static final RECORD_COMPONENTS:Ljava/lang/ClassValue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ClassValue<",
            "[",
            "Lcom/esotericsoftware/kryo/serializers/RecordSerializer$RecordComponent;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private fixedFieldTypes:Z


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    const-class v0, Ljava/lang/Class;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    const-string v2, "java.lang.reflect.RecordComponent"

    .line 5
    .line 6
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    const-string v3, "isRecord"

    .line 11
    .line 12
    invoke-virtual {v0, v3, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    const-string v4, "getRecordComponents"

    .line 17
    .line 18
    invoke-virtual {v0, v4, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v4, "getName"

    .line 23
    .line 24
    invoke-virtual {v2, v4, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    const-string v5, "getType"

    .line 29
    .line 30
    invoke-virtual {v2, v5, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 31
    .line 32
    .line 33
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    move-object v2, v1

    .line 35
    move-object v1, v3

    .line 36
    goto :goto_0

    .line 37
    :catch_0
    move-object v0, v1

    .line 38
    move-object v2, v0

    .line 39
    move-object v4, v2

    .line 40
    :goto_0
    sput-object v1, Lcom/esotericsoftware/kryo/serializers/RecordSerializer;->IS_RECORD:Ljava/lang/reflect/Method;

    .line 41
    .line 42
    sput-object v0, Lcom/esotericsoftware/kryo/serializers/RecordSerializer;->GET_RECORD_COMPONENTS:Ljava/lang/reflect/Method;

    .line 43
    .line 44
    sput-object v4, Lcom/esotericsoftware/kryo/serializers/RecordSerializer;->GET_NAME:Ljava/lang/reflect/Method;

    .line 45
    .line 46
    sput-object v2, Lcom/esotericsoftware/kryo/serializers/RecordSerializer;->GET_TYPE:Ljava/lang/reflect/Method;

    .line 47
    .line 48
    new-instance v0, Lcom/esotericsoftware/kryo/serializers/RecordSerializer$1;

    .line 49
    .line 50
    invoke-direct {v0}, Lcom/esotericsoftware/kryo/serializers/RecordSerializer$1;-><init>()V

    .line 51
    .line 52
    .line 53
    sput-object v0, Lcom/esotericsoftware/kryo/serializers/RecordSerializer;->CONSTRUCTOR:Ljava/lang/ClassValue;

    .line 54
    .line 55
    new-instance v0, Lcom/esotericsoftware/kryo/serializers/RecordSerializer$2;

    .line 56
    .line 57
    invoke-direct {v0}, Lcom/esotericsoftware/kryo/serializers/RecordSerializer$2;-><init>()V

    .line 58
    .line 59
    .line 60
    sput-object v0, Lcom/esotericsoftware/kryo/serializers/RecordSerializer;->RECORD_COMPONENTS:Ljava/lang/ClassValue;

    .line 61
    .line 62
    return-void
.end method

.method public constructor <init>()V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
        forRemoval = true
    .end annotation

    .line 37
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/serializers/ImmutableSerializer;-><init>()V

    const/4 v0, 0x0

    .line 38
    iput-boolean v0, p0, Lcom/esotericsoftware/kryo/serializers/RecordSerializer;->fixedFieldTypes:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/serializers/ImmutableSerializer;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/esotericsoftware/kryo/serializers/RecordSerializer;->fixedFieldTypes:Z

    .line 6
    .line 7
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/serializers/RecordSerializer;->isRecord(Ljava/lang/Class;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    new-instance p0, Lcom/esotericsoftware/kryo/KryoException;

    .line 15
    .line 16
    new-instance v0, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string p1, " is not a record"

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/KryoException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw p0
.end method

.method public static synthetic access$000(Ljava/lang/Class;Ljava/util/Comparator;)[Lcom/esotericsoftware/kryo/serializers/RecordSerializer$RecordComponent;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/esotericsoftware/kryo/serializers/RecordSerializer;->recordComponents(Ljava/lang/Class;Ljava/util/Comparator;)[Lcom/esotericsoftware/kryo/serializers/RecordSerializer$RecordComponent;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic access$100(Ljava/lang/Class;[Lcom/esotericsoftware/kryo/serializers/RecordSerializer$RecordComponent;)Ljava/lang/reflect/Constructor;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/esotericsoftware/kryo/serializers/RecordSerializer;->getCanonicalConstructor(Ljava/lang/Class;[Lcom/esotericsoftware/kryo/serializers/RecordSerializer$RecordComponent;)Ljava/lang/reflect/Constructor;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static getCanonicalConstructor(Ljava/lang/Class;[Lcom/esotericsoftware/kryo/serializers/RecordSerializer$RecordComponent;)Ljava/lang/reflect/Constructor;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;[",
            "Lcom/esotericsoftware/kryo/serializers/RecordSerializer$RecordComponent;",
            ")",
            "Ljava/lang/reflect/Constructor<",
            "TT;>;"
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-static {p1}, Ljava/util/Arrays;->stream([Ljava/lang/Object;)Ljava/util/stream/Stream;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, Lcom/esotericsoftware/kryo/serializers/飘花落叶言子楪世苏兰哲;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, v1}, Lcom/esotericsoftware/kryo/serializers/飘花落叶言子楪世苏兰哲;-><init>(I)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1, v0}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    new-instance v0, Lcom/esotericsoftware/kryo/serializers/飘花落叶言子楪世哲苏兰;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-interface {p1, v0}, Ljava/util/stream/Stream;->toArray(Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, [Ljava/lang/Class;

    .line 25
    .line 26
    invoke-static {p0, p1}, Lcom/esotericsoftware/kryo/serializers/RecordSerializer;->getCanonicalConstructor(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 27
    .line 28
    .line 29
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    return-object p0

    .line 31
    :catchall_0
    move-exception p1

    .line 32
    new-instance v0, Lcom/esotericsoftware/kryo/KryoException;

    .line 33
    .line 34
    invoke-direct {v0, p1}, Lcom/esotericsoftware/kryo/KryoException;-><init>(Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    new-instance p1, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    const-string v1, "Could not retrieve record canonical constructor ("

    .line 40
    .line 41
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string p0, ")"

    .line 52
    .line 53
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {v0, p0}, Lcom/esotericsoftware/kryo/KryoException;->addTrace(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw v0
.end method

.method private static getCanonicalConstructor(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;[",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/reflect/Constructor<",
            "TT;>;"
        }
    .end annotation

    const/4 v0, 0x1

    .line 64
    :try_start_0
    invoke-virtual {p0, p1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    const/4 v2, 0x0

    .line 65
    invoke-virtual {v1, v2}, Ljava/lang/reflect/Constructor;->canAccess(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 66
    invoke-virtual {v1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object v1

    .line 67
    :catch_0
    invoke-virtual {p0, p1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p0

    .line 68
    invoke-virtual {p0, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    return-object p0
.end method

.method private invokeCanonicalConstructor(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+TT;>;[",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    .line 1
    :try_start_0
    sget-object p0, Lcom/esotericsoftware/kryo/serializers/RecordSerializer;->CONSTRUCTOR:Ljava/lang/ClassValue;

    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世兰哲苏(Ljava/lang/ClassValue;Ljava/lang/Class;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/reflect/Constructor;

    .line 8
    .line 9
    invoke-virtual {p0, p2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    return-object p0

    .line 14
    :catchall_0
    move-exception p0

    .line 15
    new-instance p2, Lcom/esotericsoftware/kryo/KryoException;

    .line 16
    .line 17
    invoke-direct {p2, p0}, Lcom/esotericsoftware/kryo/KryoException;-><init>(Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    new-instance p0, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v0, "Could not construct type ("

    .line 23
    .line 24
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string p1, ")"

    .line 35
    .line 36
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {p2, p0}, Lcom/esotericsoftware/kryo/KryoException;->addTrace(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw p2
.end method

.method private isRecord(Ljava/lang/Class;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    :try_start_0
    sget-object p0, Lcom/esotericsoftware/kryo/serializers/RecordSerializer;->IS_RECORD:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, p1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 11
    .line 12
    .line 13
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    return p0

    .line 15
    :catchall_0
    new-instance p0, Lcom/esotericsoftware/kryo/KryoException;

    .line 16
    .line 17
    new-instance v0, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string v1, "Could not determine type ("

    .line 20
    .line 21
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string p1, ")"

    .line 28
    .line 29
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/KryoException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw p0
.end method

.method private static synthetic lambda$getCanonicalConstructor$0(I)[Ljava/lang/Class;
    .locals 0

    .line 1
    new-array p0, p0, [Ljava/lang/Class;

    .line 2
    .line 3
    return-object p0
.end method

.method private static recordComponents(Ljava/lang/Class;Ljava/util/Comparator;)[Lcom/esotericsoftware/kryo/serializers/RecordSerializer$RecordComponent;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/util/Comparator<",
            "Lcom/esotericsoftware/kryo/serializers/RecordSerializer$RecordComponent;",
            ">;)[",
            "Lcom/esotericsoftware/kryo/serializers/RecordSerializer$RecordComponent;"
        }
    .end annotation

    .line 1
    :try_start_0
    sget-object v0, Lcom/esotericsoftware/kryo/serializers/RecordSerializer;->GET_RECORD_COMPONENTS:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, [Ljava/lang/Object;

    .line 9
    .line 10
    array-length v2, v0

    .line 11
    new-array v2, v2, [Lcom/esotericsoftware/kryo/serializers/RecordSerializer$RecordComponent;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    :goto_0
    array-length v4, v0

    .line 15
    if-ge v3, v4, :cond_0

    .line 16
    .line 17
    aget-object v4, v0, v3

    .line 18
    .line 19
    new-instance v5, Lcom/esotericsoftware/kryo/serializers/RecordSerializer$RecordComponent;

    .line 20
    .line 21
    sget-object v6, Lcom/esotericsoftware/kryo/serializers/RecordSerializer;->GET_NAME:Ljava/lang/reflect/Method;

    .line 22
    .line 23
    invoke-virtual {v6, v4, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    check-cast v6, Ljava/lang/String;

    .line 28
    .line 29
    sget-object v7, Lcom/esotericsoftware/kryo/serializers/RecordSerializer;->GET_TYPE:Ljava/lang/reflect/Method;

    .line 30
    .line 31
    invoke-virtual {v7, v4, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    check-cast v4, Ljava/lang/Class;

    .line 36
    .line 37
    invoke-direct {v5, p0, v6, v4, v3}, Lcom/esotericsoftware/kryo/serializers/RecordSerializer$RecordComponent;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;I)V

    .line 38
    .line 39
    .line 40
    aput-object v5, v2, v3

    .line 41
    .line 42
    add-int/lit8 v3, v3, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception p1

    .line 46
    goto :goto_1

    .line 47
    :cond_0
    if-eqz p1, :cond_1

    .line 48
    .line 49
    invoke-static {v2, p1}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    .line 52
    :cond_1
    return-object v2

    .line 53
    :goto_1
    new-instance v0, Lcom/esotericsoftware/kryo/KryoException;

    .line 54
    .line 55
    invoke-direct {v0, p1}, Lcom/esotericsoftware/kryo/KryoException;-><init>(Ljava/lang/Throwable;)V

    .line 56
    .line 57
    .line 58
    new-instance p1, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    const-string v1, "Could not retrieve record components ("

    .line 61
    .line 62
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string p0, ")"

    .line 73
    .line 74
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-virtual {v0, p0}, Lcom/esotericsoftware/kryo/KryoException;->addTrace(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw v0
.end method

.method public static synthetic 飘花落叶言子楪世苏哲兰(I)[Ljava/lang/Class;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/esotericsoftware/kryo/serializers/RecordSerializer;->lambda$getCanonicalConstructor$0(I)[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public read(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/esotericsoftware/kryo/Kryo;",
            "Lcom/esotericsoftware/kryo/io/Input;",
            "Ljava/lang/Class<",
            "+TT;>;)TT;"
        }
    .end annotation

    .line 1
    const-string v0, ")"

    .line 2
    .line 3
    const-string v1, " ("

    .line 4
    .line 5
    sget-object v2, Lcom/esotericsoftware/kryo/serializers/RecordSerializer;->RECORD_COMPONENTS:Ljava/lang/ClassValue;

    .line 6
    .line 7
    invoke-static {v2, p3}, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世兰哲苏(Ljava/lang/ClassValue;Ljava/lang/Class;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    check-cast v2, [Lcom/esotericsoftware/kryo/serializers/RecordSerializer$RecordComponent;

    .line 12
    .line 13
    array-length v3, v2

    .line 14
    new-array v3, v3, [Ljava/lang/Object;

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    :goto_0
    array-length v5, v2

    .line 18
    if-ge v4, v5, :cond_4

    .line 19
    .line 20
    aget-object v5, v2, v4

    .line 21
    .line 22
    invoke-virtual {v5}, Lcom/esotericsoftware/kryo/serializers/RecordSerializer$RecordComponent;->name()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v6

    .line 26
    invoke-virtual {v5}, Lcom/esotericsoftware/kryo/serializers/RecordSerializer$RecordComponent;->type()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object v7

    .line 30
    :try_start_0
    sget-boolean v8, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 31
    .line 32
    if-eqz v8, :cond_0

    .line 33
    .line 34
    const-string v8, "kryo"

    .line 35
    .line 36
    new-instance v9, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    .line 41
    const-string v10, "Read property: "

    .line 42
    .line 43
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v10

    .line 56
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v9

    .line 66
    invoke-static {v8, v9}, Lcom/esotericsoftware/minlog/Log;->trace(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :catchall_0
    move-exception p0

    .line 71
    goto :goto_4

    .line 72
    :catch_0
    move-exception p0

    .line 73
    goto :goto_5

    .line 74
    :cond_0
    :goto_1
    invoke-virtual {v7}, Ljava/lang/Class;->isPrimitive()Z

    .line 75
    .line 76
    .line 77
    move-result v8

    .line 78
    if-eqz v8, :cond_1

    .line 79
    .line 80
    invoke-virtual {v5}, Lcom/esotericsoftware/kryo/serializers/RecordSerializer$RecordComponent;->index()I

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    invoke-virtual {p1, p2, v7}, Lcom/esotericsoftware/kryo/Kryo;->readObject(Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v7

    .line 88
    aput-object v7, v3, v5

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_1
    iget-boolean v8, p0, Lcom/esotericsoftware/kryo/serializers/RecordSerializer;->fixedFieldTypes:Z

    .line 92
    .line 93
    if-nez v8, :cond_3

    .line 94
    .line 95
    invoke-virtual {p1, v7}, Lcom/esotericsoftware/kryo/Kryo;->isFinal(Ljava/lang/Class;)Z

    .line 96
    .line 97
    .line 98
    move-result v8

    .line 99
    if-eqz v8, :cond_2

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_2
    invoke-virtual {v5}, Lcom/esotericsoftware/kryo/serializers/RecordSerializer$RecordComponent;->index()I

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    invoke-virtual {p1, p2}, Lcom/esotericsoftware/kryo/Kryo;->readClassAndObject(Lcom/esotericsoftware/kryo/io/Input;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v7

    .line 110
    aput-object v7, v3, v5

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_3
    :goto_2
    invoke-virtual {v5}, Lcom/esotericsoftware/kryo/serializers/RecordSerializer$RecordComponent;->index()I

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    invoke-virtual {p1, p2, v7}, Lcom/esotericsoftware/kryo/Kryo;->readObjectOrNull(Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v7

    .line 121
    aput-object v7, v3, v5
    :try_end_0
    .catch Lcom/esotericsoftware/kryo/KryoException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 122
    .line 123
    :goto_3
    add-int/lit8 v4, v4, 0x1

    .line 124
    .line 125
    goto :goto_0

    .line 126
    :goto_4
    new-instance p1, Lcom/esotericsoftware/kryo/KryoException;

    .line 127
    .line 128
    invoke-direct {p1, p0}, Lcom/esotericsoftware/kryo/KryoException;-><init>(Ljava/lang/Throwable;)V

    .line 129
    .line 130
    .line 131
    invoke-static {v6, v1}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲苏兰世(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    invoke-virtual {p3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p2

    .line 139
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    invoke-virtual {p1, p0}, Lcom/esotericsoftware/kryo/KryoException;->addTrace(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    throw p1

    .line 153
    :goto_5
    invoke-static {v6, v1}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲苏兰世(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    invoke-virtual {p3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p2

    .line 161
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/KryoException;->addTrace(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    throw p0

    .line 175
    :cond_4
    invoke-direct {p0, p3, v3}, Lcom/esotericsoftware/kryo/serializers/RecordSerializer;->invokeCanonicalConstructor(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    return-object p0
.end method

.method public setFixedFieldTypes(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/esotericsoftware/kryo/serializers/RecordSerializer;->fixedFieldTypes:Z

    .line 2
    .line 3
    return-void
.end method

.method public write(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Object;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/esotericsoftware/kryo/Kryo;",
            "Lcom/esotericsoftware/kryo/io/Output;",
            "TT;)V"
        }
    .end annotation

    .line 1
    const-string v0, ")"

    .line 2
    .line 3
    const-string v1, " ("

    .line 4
    .line 5
    sget-object v2, Lcom/esotericsoftware/kryo/serializers/RecordSerializer;->RECORD_COMPONENTS:Ljava/lang/ClassValue;

    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    invoke-static {v2, v3}, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲苏世兰(Ljava/lang/ClassValue;Ljava/lang/Class;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, [Lcom/esotericsoftware/kryo/serializers/RecordSerializer$RecordComponent;

    .line 16
    .line 17
    array-length v3, v2

    .line 18
    const/4 v4, 0x0

    .line 19
    :goto_0
    if-ge v4, v3, :cond_4

    .line 20
    .line 21
    aget-object v5, v2, v4

    .line 22
    .line 23
    invoke-virtual {v5}, Lcom/esotericsoftware/kryo/serializers/RecordSerializer$RecordComponent;->type()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    invoke-virtual {v5}, Lcom/esotericsoftware/kryo/serializers/RecordSerializer$RecordComponent;->name()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v7

    .line 31
    :try_start_0
    sget-boolean v8, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 32
    .line 33
    if-eqz v8, :cond_0

    .line 34
    .line 35
    const-string v8, "kryo"

    .line 36
    .line 37
    new-instance v9, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    .line 42
    const-string v10, "Write property: "

    .line 43
    .line 44
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v10

    .line 57
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v9

    .line 67
    invoke-static {v8, v9}, Lcom/esotericsoftware/minlog/Log;->trace(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :catchall_0
    move-exception p0

    .line 72
    goto :goto_4

    .line 73
    :catch_0
    move-exception p0

    .line 74
    goto :goto_5

    .line 75
    :cond_0
    :goto_1
    invoke-virtual {v6}, Ljava/lang/Class;->isPrimitive()Z

    .line 76
    .line 77
    .line 78
    move-result v8

    .line 79
    if-eqz v8, :cond_1

    .line 80
    .line 81
    invoke-virtual {v5, p3}, Lcom/esotericsoftware/kryo/serializers/RecordSerializer$RecordComponent;->getValue(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    invoke-virtual {p1, p2, v5}, Lcom/esotericsoftware/kryo/Kryo;->writeObject(Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_1
    iget-boolean v8, p0, Lcom/esotericsoftware/kryo/serializers/RecordSerializer;->fixedFieldTypes:Z

    .line 90
    .line 91
    if-nez v8, :cond_3

    .line 92
    .line 93
    invoke-virtual {p1, v6}, Lcom/esotericsoftware/kryo/Kryo;->isFinal(Ljava/lang/Class;)Z

    .line 94
    .line 95
    .line 96
    move-result v8

    .line 97
    if-eqz v8, :cond_2

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_2
    invoke-virtual {v5, p3}, Lcom/esotericsoftware/kryo/serializers/RecordSerializer$RecordComponent;->getValue(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    invoke-virtual {p1, p2, v5}, Lcom/esotericsoftware/kryo/Kryo;->writeClassAndObject(Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_3
    :goto_2
    invoke-virtual {v5, p3}, Lcom/esotericsoftware/kryo/serializers/RecordSerializer$RecordComponent;->getValue(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    invoke-virtual {p1, p2, v5, v6}, Lcom/esotericsoftware/kryo/Kryo;->writeObjectOrNull(Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Object;Ljava/lang/Class;)V
    :try_end_0
    .catch Lcom/esotericsoftware/kryo/KryoException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 113
    .line 114
    .line 115
    :goto_3
    add-int/lit8 v4, v4, 0x1

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :goto_4
    new-instance p1, Lcom/esotericsoftware/kryo/KryoException;

    .line 119
    .line 120
    invoke-direct {p1, p0}, Lcom/esotericsoftware/kryo/KryoException;-><init>(Ljava/lang/Throwable;)V

    .line 121
    .line 122
    .line 123
    invoke-static {v7, v1}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲苏兰世(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p2

    .line 131
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    invoke-virtual {p1, p0}, Lcom/esotericsoftware/kryo/KryoException;->addTrace(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    throw p1

    .line 145
    :goto_5
    invoke-static {v7, v1}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲苏兰世(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p2

    .line 153
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/KryoException;->addTrace(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    throw p0

    .line 167
    :cond_4
    return-void
.end method
