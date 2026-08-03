.class public abstract Lparty/iroiro/luajava/JuaAPI;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lparty/iroiro/luajava/JuaAPI$ExecutableWrapper;,
        Lparty/iroiro/luajava/JuaAPI$OptionalField;
    }
.end annotation


# static fields
.field private static final COMMA_SPLIT:Ljava/util/regex/Pattern;

.field private static final CONSTRUCTORS_CACHE:Lparty/iroiro/luajava/util/LRUCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lparty/iroiro/luajava/util/LRUCache<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Boolean;",
            "[",
            "Ljava/lang/reflect/Constructor<",
            "*>;>;"
        }
    .end annotation
.end field

.field private static final CONSTRUCTOR_CACHE:Lparty/iroiro/luajava/util/LRUCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lparty/iroiro/luajava/util/LRUCache<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Constructor<",
            "*>;>;"
        }
    .end annotation
.end field

.field static final CONSTRUCTOR_WRAPPER:Lparty/iroiro/luajava/JuaAPI$ExecutableWrapper;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lparty/iroiro/luajava/JuaAPI$ExecutableWrapper<",
            "Ljava/lang/reflect/Constructor<",
            "*>;>;"
        }
    .end annotation
.end field

.field private static final JAVA_LIB_CACHE:Lparty/iroiro/luajava/util/LRUCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lparty/iroiro/luajava/util/LRUCache<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Method;",
            ">;"
        }
    .end annotation
.end field

.field private static final MEMBER_METHOD_CACHE:Lparty/iroiro/luajava/util/LRUCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lparty/iroiro/luajava/util/LRUCache<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/reflect/Method;",
            ">;"
        }
    .end annotation
.end field

.field private static final METHOD_CACHE:Lparty/iroiro/luajava/util/LRUCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lparty/iroiro/luajava/util/LRUCache<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Method;",
            ">;"
        }
    .end annotation
.end field

.field static final METHOD_WRAPPER:Lparty/iroiro/luajava/JuaAPI$ExecutableWrapper;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lparty/iroiro/luajava/JuaAPI$ExecutableWrapper<",
            "Ljava/lang/reflect/Method;",
            ">;"
        }
    .end annotation
.end field

.field private static final OBJECT_FIELD_CACHE:Lparty/iroiro/luajava/util/LRUCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lparty/iroiro/luajava/util/LRUCache<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            "Lparty/iroiro/luajava/JuaAPI$OptionalField;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lparty/iroiro/luajava/util/LRUCache;

    const/16 v1, 0x19

    const/4 v2, 0x5

    const/4 v3, 0x4

    invoke-direct {v0, v1, v2, v3}, Lparty/iroiro/luajava/util/LRUCache;-><init>(III)V

    sput-object v0, Lparty/iroiro/luajava/JuaAPI;->JAVA_LIB_CACHE:Lparty/iroiro/luajava/util/LRUCache;

    new-instance v0, Lparty/iroiro/luajava/util/LRUCache;

    const/4 v4, 0x1

    invoke-direct {v0, v1, v4, v3}, Lparty/iroiro/luajava/util/LRUCache;-><init>(III)V

    sput-object v0, Lparty/iroiro/luajava/JuaAPI;->CONSTRUCTORS_CACHE:Lparty/iroiro/luajava/util/LRUCache;

    new-instance v0, Lparty/iroiro/luajava/util/LRUCache;

    const/16 v4, 0xa

    invoke-direct {v0, v1, v4, v3}, Lparty/iroiro/luajava/util/LRUCache;-><init>(III)V

    sput-object v0, Lparty/iroiro/luajava/JuaAPI;->MEMBER_METHOD_CACHE:Lparty/iroiro/luajava/util/LRUCache;

    new-instance v0, Lparty/iroiro/luajava/util/LRUCache;

    invoke-direct {v0, v1, v4, v3}, Lparty/iroiro/luajava/util/LRUCache;-><init>(III)V

    sput-object v0, Lparty/iroiro/luajava/JuaAPI;->OBJECT_FIELD_CACHE:Lparty/iroiro/luajava/util/LRUCache;

    new-instance v0, Lparty/iroiro/luajava/util/LRUCache;

    invoke-direct {v0, v1, v2, v3}, Lparty/iroiro/luajava/util/LRUCache;-><init>(III)V

    sput-object v0, Lparty/iroiro/luajava/JuaAPI;->CONSTRUCTOR_CACHE:Lparty/iroiro/luajava/util/LRUCache;

    new-instance v0, Lparty/iroiro/luajava/util/LRUCache;

    const/16 v2, 0x32

    invoke-direct {v0, v1, v2, v3}, Lparty/iroiro/luajava/util/LRUCache;-><init>(III)V

    sput-object v0, Lparty/iroiro/luajava/JuaAPI;->METHOD_CACHE:Lparty/iroiro/luajava/util/LRUCache;

    const-string v0, ","

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lparty/iroiro/luajava/JuaAPI;->COMMA_SPLIT:Ljava/util/regex/Pattern;

    new-instance v0, Lparty/iroiro/luajava/JuaAPI$2;

    invoke-direct {v0}, Lparty/iroiro/luajava/JuaAPI$2;-><init>()V

    sput-object v0, Lparty/iroiro/luajava/JuaAPI;->CONSTRUCTOR_WRAPPER:Lparty/iroiro/luajava/JuaAPI$ExecutableWrapper;

    new-instance v0, Lparty/iroiro/luajava/JuaAPI$3;

    invoke-direct {v0}, Lparty/iroiro/luajava/JuaAPI$3;-><init>()V

    sput-object v0, Lparty/iroiro/luajava/JuaAPI;->METHOD_WRAPPER:Lparty/iroiro/luajava/JuaAPI$ExecutableWrapper;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static addNameMatching(Ljava/lang/Class;Ljava/lang/String;Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/reflect/Method;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object p0

    array-length v0, p0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p0, v1

    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v3

    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getModifiers()I

    move-result v4

    and-int/2addr v3, v4

    invoke-static {v3}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {p2, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static allocateDirect(I)Ljava/nio/ByteBuffer;
    .locals 0

    invoke-static {p0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object p0

    return-object p0
.end method

.method public static arrayIndex(ILjava/lang/Object;I)I
    .locals 1

    invoke-static {p0}, Lparty/iroiro/luajava/Jua;->get(I)Lparty/iroiro/luajava/AbstractLua;

    move-result-object p0

    const/4 v0, 0x1

    sub-int/2addr p2, v0

    :try_start_0
    invoke-static {p1, p2}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {p0, p1, p2}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception p1

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->error(Ljava/lang/Throwable;)I

    move-result p0

    return p0
.end method

.method public static arrayLength(Ljava/lang/Object;)I
    .locals 0

    :try_start_0
    invoke-static {p0}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    const/4 p0, -0x1

    return p0
.end method

.method public static arrayNew(ILjava/lang/Object;I)I
    .locals 7

    invoke-static {p0}, Lparty/iroiro/luajava/Jua;->get(I)Lparty/iroiro/luajava/AbstractLua;

    move-result-object p0

    instance-of v0, p1, Ljava/lang/Class;

    const/4 v1, -0x1

    if-eqz v0, :cond_4

    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    if-eq p1, v0, :cond_4

    check-cast p1, Ljava/lang/Class;

    if-ltz p2, :cond_0

    invoke-static {p1, p2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->pushJavaArray(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    neg-int v0, p2

    new-array v0, v0, [I

    move v2, p2

    :goto_0
    if-gt v2, v1, :cond_3

    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->isNumber(I)Z

    move-result v3

    const-string v4, "bad argument #"

    if-nez v3, :cond_1

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sub-int/2addr v2, p2

    add-int/lit8 v2, v2, 0x2

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " to \'java.array\' (expecting number)"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    return v1

    :cond_1
    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->toNumber(I)D

    move-result-wide v5

    double-to-int v3, v5

    if-gez v3, :cond_2

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sub-int/2addr v2, p2

    add-int/lit8 v2, v2, 0x2

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " to \'java.array\' (expecting non negative)"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    return v1

    :cond_2
    sub-int v4, v2, p2

    aput v3, v0, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    invoke-static {p1, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->pushJavaArray(Ljava/lang/Object;)V

    :goto_1
    const/4 p0, 0x1

    return p0

    :cond_4
    const-string p1, "bad argument #1 to \'java.array\' (expecting Class<?>)"

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    return v1
.end method

.method public static arrayNewIndex(ILjava/lang/Object;I)I
    .locals 2

    invoke-static {p0}, Lparty/iroiro/luajava/Jua;->get(I)Lparty/iroiro/luajava/AbstractLua;

    move-result-object p0

    add-int/lit8 p2, p2, -0x1

    :try_start_0
    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->getTop()I

    move-result v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Lparty/iroiro/luajava/Lua;->toObject(ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1, p2, v0}, Ljava/lang/reflect/Array;->set(Ljava/lang/Object;ILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p0, 0x0

    return p0

    :catch_0
    move-exception p1

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->error(Ljava/lang/Throwable;)I

    move-result p0

    return p0
.end method

.method public static classIndex(ILjava/lang/Class;Ljava/lang/String;)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            ")I"
        }
    .end annotation

    invoke-static {p0}, Lparty/iroiro/luajava/Jua;->get(I)Lparty/iroiro/luajava/AbstractLua;

    move-result-object p0

    const-string v0, "class"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->pushJavaObject(Ljava/lang/Object;)V

    return v1

    :cond_0
    const/4 v0, 0x0

    invoke-static {p0, p1, v0, p2}, Lparty/iroiro/luajava/JuaAPI;->fieldIndex(Lparty/iroiro/luajava/Lua;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)I

    move-result v0

    if-ne v0, v1, :cond_1

    return v1

    :cond_1
    :try_start_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x24

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lparty/iroiro/luajava/util/ClassUtils;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->pushJavaClass(Ljava/lang/Class;)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return v1

    :catch_0
    return v0
.end method

.method public static classInvoke(ILjava/lang/Class;Ljava/lang/String;I)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            "I)I"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-static {p0, p1, v0, p2, p3}, Lparty/iroiro/luajava/JuaAPI;->methodInvoke(ILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;I)I

    move-result p0

    return p0
.end method

.method public static classInvoke(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)I
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I)I"
        }
    .end annotation

    const/4 v2, 0x0

    move v0, p0

    move-object v1, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    .line 2
    invoke-static/range {v0 .. v5}, Lparty/iroiro/luajava/JuaAPI;->methodInvoke(ILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;I)I

    move-result p0

    return p0
.end method

.method public static classNew(ILjava/lang/Object;I)I
    .locals 4

    invoke-static {p0}, Lparty/iroiro/luajava/Jua;->get(I)Lparty/iroiro/luajava/AbstractLua;

    move-result-object p0

    instance-of v0, p1, Ljava/lang/Class;

    const/4 v1, -0x1

    if-eqz v0, :cond_3

    check-cast p1, Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Class;->isInterface()Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    filled-new-array {p1}, [Ljava/lang/Class;

    move-result-object p1

    sget-object p2, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {p0, p1, p2}, Lparty/iroiro/luajava/Lua;->createProxy([Ljava/lang/Class;Lparty/iroiro/luajava/Lua$Conversion;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->pushJavaObject(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p0, 0x1

    return p0

    :catch_0
    move-exception p1

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->error(Ljava/lang/Throwable;)I

    move-result p0

    return p0

    :cond_0
    new-array p2, p2, [Ljava/lang/Object;

    sget-object v0, Lparty/iroiro/luajava/JuaAPI;->CONSTRUCTORS_CACHE:Lparty/iroiro/luajava/util/LRUCache;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, p1, v2}, Lparty/iroiro/luajava/util/LRUCache;->get(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Ljava/lang/reflect/Constructor;

    if-nez v3, :cond_1

    invoke-virtual {p1}, Ljava/lang/Class;->getConstructors()[Ljava/lang/reflect/Constructor;

    move-result-object v3

    invoke-virtual {v0, p1, v2, v3}, Lparty/iroiro/luajava/util/LRUCache;->put(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    sget-object p1, Lparty/iroiro/luajava/JuaAPI;->CONSTRUCTOR_WRAPPER:Lparty/iroiro/luajava/JuaAPI$ExecutableWrapper;

    invoke-static {p0, v3, p1, p2}, Lparty/iroiro/luajava/JuaAPI;->matchMethod(Lparty/iroiro/luajava/Lua;[Ljava/lang/Object;Lparty/iroiro/luajava/JuaAPI$ExecutableWrapper;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/reflect/Constructor;

    if-eqz p1, :cond_2

    invoke-static {p0, p2, p1}, Lparty/iroiro/luajava/JuaAPI;->construct(Lparty/iroiro/luajava/Lua;[Ljava/lang/Object;Ljava/lang/reflect/Constructor;)I

    move-result p0

    return p0

    :cond_2
    const-string p1, "no matching constructor found"

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    return v1

    :cond_3
    const-string p1, "bad argument #1 to java.new (expecting Class<?>)"

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    return v1
.end method

.method public static classNewIndex(ILjava/lang/Class;Ljava/lang/String;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            ")I"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {p0, p1, v0, p2}, Lparty/iroiro/luajava/JuaAPI;->fieldNewIndex(ILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method private static construct(Lparty/iroiro/luajava/Lua;[Ljava/lang/Object;Ljava/lang/reflect/Constructor;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lparty/iroiro/luajava/Lua;",
            "[",
            "Ljava/lang/Object;",
            "Ljava/lang/reflect/Constructor<",
            "*>;)I"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p2, p1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->pushJavaObject(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p0, 0x1

    return p0

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_1

    :catch_2
    move-exception p1

    goto :goto_1

    :goto_0
    invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->error(Ljava/lang/Throwable;)I

    move-result p0

    return p0

    :goto_1
    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->error(Ljava/lang/Throwable;)I

    move-result p0

    return p0
.end method

.method private static convertBoxedNumber(Ljava/lang/Number;Ljava/lang/Class;)Ljava/lang/Number;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Number;",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/Number;"
        }
    .end annotation

    const-class v0, Ljava/lang/Byte;

    if-ne v0, p1, :cond_0

    invoke-virtual {p0}, Ljava/lang/Number;->byteValue()B

    move-result p0

    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p0

    return-object p0

    :cond_0
    const-class v0, Ljava/lang/Short;

    if-ne v0, p1, :cond_1

    invoke-virtual {p0}, Ljava/lang/Number;->shortValue()S

    move-result p0

    invoke-static {p0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p0

    return-object p0

    :cond_1
    const-class v0, Ljava/lang/Integer;

    if-ne v0, p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    :cond_2
    const-class v0, Ljava/lang/Long;

    if-ne v0, p1, :cond_3

    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0

    :cond_3
    const-class v0, Ljava/lang/Float;

    if-ne v0, p1, :cond_4

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    return-object p0

    :cond_4
    const-class v0, Ljava/lang/Double;

    if-ne v0, p1, :cond_5

    invoke-virtual {p0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    return-object p0

    :cond_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Unsupported conversion"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static convertFromLua(Lparty/iroiro/luajava/Lua;Ljava/lang/Class;I)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lparty/iroiro/luajava/Lua;",
            "Ljava/lang/Class<",
            "*>;I)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-interface {p0, p2}, Lparty/iroiro/luajava/Lua;->type(I)Lparty/iroiro/luajava/Lua$LuaType;

    move-result-object v0

    sget-object v1, Lparty/iroiro/luajava/Lua$LuaType;->NIL:Lparty/iroiro/luajava/Lua$LuaType;

    if-ne v0, v1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Class;->isPrimitive()Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Primitive not accepting null values"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    sget-object v1, Lparty/iroiro/luajava/Lua$LuaType;->BOOLEAN:Lparty/iroiro/luajava/Lua$LuaType;

    const-class v2, Ljava/lang/Boolean;

    if-ne v0, v1, :cond_3

    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-eq p1, v0, :cond_2

    invoke-virtual {p1, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_13

    :cond_2
    invoke-interface {p0, p2}, Lparty/iroiro/luajava/Lua;->toBoolean(I)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    :cond_3
    sget-object v1, Lparty/iroiro/luajava/Lua$LuaType;->STRING:Lparty/iroiro/luajava/Lua$LuaType;

    if-ne v0, v1, :cond_5

    const-class v0, Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p0, p2}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_4
    const-class v0, Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_13

    invoke-interface {p0, p2}, Lparty/iroiro/luajava/Lua;->toBuffer(I)Ljava/nio/ByteBuffer;

    move-result-object p0

    return-object p0

    :cond_5
    sget-object v1, Lparty/iroiro/luajava/Lua$LuaType;->NUMBER:Lparty/iroiro/luajava/Lua$LuaType;

    const-class v3, Ljava/lang/Object;

    const-class v4, Ljava/lang/Number;

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-ne v0, v1, :cond_c

    invoke-virtual {p1}, Ljava/lang/Class;->isPrimitive()Z

    move-result v0

    if-nez v0, :cond_a

    invoke-virtual {v4, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_6

    goto :goto_0

    :cond_6
    const-class v0, Ljava/lang/Character;

    if-ne v0, p1, :cond_7

    invoke-interface {p0, p2}, Lparty/iroiro/luajava/Lua;->toNumber(I)D

    move-result-wide p0

    double-to-int p0, p0

    int-to-char p0, p0

    invoke-static {p0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p0

    return-object p0

    :cond_7
    if-ne v2, p1, :cond_9

    invoke-interface {p0, p2}, Lparty/iroiro/luajava/Lua;->toNumber(I)D

    move-result-wide p0

    const-wide/16 v0, 0x0

    cmpl-double p0, p0, v0

    if-eqz p0, :cond_8

    move v5, v6

    :cond_8
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    :cond_9
    if-ne p1, v3, :cond_13

    invoke-interface {p0, p2}, Lparty/iroiro/luajava/Lua;->toNumber(I)D

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    return-object p0

    :cond_a
    :goto_0
    invoke-interface {p0, p2}, Lparty/iroiro/luajava/Lua;->isInteger(I)Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {p0, p2}, Lparty/iroiro/luajava/Lua;->toInteger(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    goto :goto_1

    :cond_b
    invoke-interface {p0, p2}, Lparty/iroiro/luajava/Lua;->toNumber(I)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    :goto_1
    invoke-static {p0, p1}, Lparty/iroiro/luajava/JuaAPI;->convertNumber(Ljava/lang/Number;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_c
    sget-object v1, Lparty/iroiro/luajava/Lua$LuaType;->USERDATA:Lparty/iroiro/luajava/Lua$LuaType;

    if-ne v0, v1, :cond_e

    invoke-interface {p0, p2}, Lparty/iroiro/luajava/Lua;->toJavaObject(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_13

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_d

    return-object v0

    :cond_d
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_13

    check-cast v0, Ljava/lang/Number;

    invoke-static {v0, p1}, Lparty/iroiro/luajava/JuaAPI;->convertNumber(Ljava/lang/Number;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_e
    sget-object v1, Lparty/iroiro/luajava/Lua$LuaType;->TABLE:Lparty/iroiro/luajava/Lua$LuaType;

    if-ne v0, v1, :cond_12

    const-class v0, Ljava/util/List;

    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-interface {p0, p2}, Lparty/iroiro/luajava/Lua;->toList(I)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_f
    invoke-virtual {p1}, Ljava/lang/Class;->isArray()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-virtual {p1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v0

    if-ne v0, v3, :cond_10

    invoke-interface {p0, p2}, Lparty/iroiro/luajava/Lua;->toList(I)Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p0, Ljava/util/List;

    new-array p1, v5, [Ljava/lang/Object;

    invoke-interface {p0, p1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_10
    const-class v0, Ljava/util/Map;

    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-interface {p0, p2}, Lparty/iroiro/luajava/Lua;->toMap(I)Ljava/util/Map;

    move-result-object p0

    return-object p0

    :cond_11
    invoke-virtual {p1}, Ljava/lang/Class;->isInterface()Z

    move-result v0

    if-eqz v0, :cond_13

    invoke-virtual {p1}, Ljava/lang/Class;->isAnnotation()Z

    move-result v0

    if-nez v0, :cond_13

    invoke-interface {p0, p2}, Lparty/iroiro/luajava/Lua;->pushValue(I)V

    filled-new-array {p1}, [Ljava/lang/Class;

    move-result-object p1

    sget-object p2, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {p0, p1, p2}, Lparty/iroiro/luajava/Lua;->createProxy([Ljava/lang/Class;Lparty/iroiro/luajava/Lua$Conversion;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_12
    sget-object v1, Lparty/iroiro/luajava/Lua$LuaType;->FUNCTION:Lparty/iroiro/luajava/Lua$LuaType;

    if-ne v0, v1, :cond_13

    filled-new-array {p1}, [Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lparty/iroiro/luajava/util/ClassUtils;->getLuaFunctionalDescriptor([Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_13

    invoke-interface {p0, p2}, Lparty/iroiro/luajava/Lua;->pushValue(I)V

    invoke-interface {p0, v5, v6}, Lparty/iroiro/luajava/Lua;->createTable(II)V

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->getTop()I

    move-result p2

    sub-int/2addr p2, v6

    invoke-interface {p0, p2}, Lparty/iroiro/luajava/Lua;->insert(I)V

    const/4 p2, -0x2

    invoke-interface {p0, p2, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    filled-new-array {p1}, [Ljava/lang/Class;

    move-result-object p1

    sget-object p2, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {p0, p1, p2}, Lparty/iroiro/luajava/Lua;->createProxy([Ljava/lang/Class;Lparty/iroiro/luajava/Lua$Conversion;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_13
    const-class v0, Lparty/iroiro/luajava/value/LuaValue;

    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_14

    invoke-interface {p0, p2}, Lparty/iroiro/luajava/Lua;->pushValue(I)V

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->get()Lparty/iroiro/luajava/value/LuaValue;

    move-result-object p0

    return-object p0

    :cond_14
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    const-string p2, "Unable to convert to "

    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static convertNumber(Ljava/lang/Number;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Number;",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Class;->isPrimitive()Z

    move-result v0

    if-eqz v0, :cond_8

    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-ne v0, p1, :cond_1

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    :cond_1
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    if-ne v0, p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Number;->byteValue()B

    move-result p0

    int-to-char p0, p0

    invoke-static {p0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p0

    return-object p0

    :cond_2
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    if-ne v0, p1, :cond_3

    invoke-virtual {p0}, Ljava/lang/Number;->byteValue()B

    move-result p0

    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p0

    return-object p0

    :cond_3
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    if-ne v0, p1, :cond_4

    invoke-virtual {p0}, Ljava/lang/Number;->shortValue()S

    move-result p0

    invoke-static {p0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p0

    return-object p0

    :cond_4
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne v0, p1, :cond_5

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    :cond_5
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-ne v0, p1, :cond_6

    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0

    :cond_6
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-ne v0, p1, :cond_7

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    return-object p0

    :cond_7
    invoke-virtual {p0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    return-object p0

    :cond_8
    invoke-static {p0, p1}, Lparty/iroiro/luajava/JuaAPI;->convertBoxedNumber(Ljava/lang/Number;Ljava/lang/Class;)Ljava/lang/Number;

    move-result-object p0

    return-object p0
.end method

.method public static fieldIndex(Lparty/iroiro/luajava/Lua;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lparty/iroiro/luajava/Lua;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Object;",
            "Ljava/lang/String;",
            ")I"
        }
    .end annotation

    const/4 v0, 0x2

    const/4 v1, 0x0

    :try_start_0
    sget-object v2, Lparty/iroiro/luajava/JuaAPI;->OBJECT_FIELD_CACHE:Lparty/iroiro/luajava/util/LRUCache;

    invoke-virtual {v2, p1, p3}, Lparty/iroiro/luajava/util/LRUCache;->get(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lparty/iroiro/luajava/JuaAPI$OptionalField;

    if-nez v3, :cond_0

    invoke-virtual {p1, p3}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v3

    new-instance v4, Lparty/iroiro/luajava/JuaAPI$OptionalField;

    invoke-direct {v4, v3, v1}, Lparty/iroiro/luajava/JuaAPI$OptionalField;-><init>(Ljava/lang/reflect/Field;Lparty/iroiro/luajava/JuaAPI$1;)V

    invoke-virtual {v2, p1, p3, v4}, Lparty/iroiro/luajava/util/LRUCache;->put(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v3, v3, Lparty/iroiro/luajava/JuaAPI$OptionalField;->field:Ljava/lang/reflect/Field;

    if-nez v3, :cond_1

    return v0

    :cond_1
    :goto_0
    invoke-virtual {v3, p2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    sget-object v2, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {p0, p2, v2}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p0, 0x1

    return p0

    :catch_0
    sget-object p0, Lparty/iroiro/luajava/JuaAPI;->OBJECT_FIELD_CACHE:Lparty/iroiro/luajava/util/LRUCache;

    new-instance p2, Lparty/iroiro/luajava/JuaAPI$OptionalField;

    invoke-direct {p2, v1, v1}, Lparty/iroiro/luajava/JuaAPI$OptionalField;-><init>(Ljava/lang/reflect/Field;Lparty/iroiro/luajava/JuaAPI$1;)V

    invoke-virtual {p0, p1, p3, p2}, Lparty/iroiro/luajava/util/LRUCache;->put(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return v0
.end method

.method private static fieldNewIndex(ILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Object;",
            "Ljava/lang/String;",
            ")I"
        }
    .end annotation

    invoke-static {p0}, Lparty/iroiro/luajava/Jua;->get(I)Lparty/iroiro/luajava/AbstractLua;

    move-result-object p0

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, Lparty/iroiro/luajava/JuaAPI;->OBJECT_FIELD_CACHE:Lparty/iroiro/luajava/util/LRUCache;

    invoke-virtual {v1, p1, p3}, Lparty/iroiro/luajava/util/LRUCache;->get(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lparty/iroiro/luajava/JuaAPI$OptionalField;

    if-nez v2, :cond_0

    invoke-virtual {p1, p3}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    new-instance v3, Lparty/iroiro/luajava/JuaAPI$OptionalField;

    invoke-direct {v3, v2, v0}, Lparty/iroiro/luajava/JuaAPI$OptionalField;-><init>(Ljava/lang/reflect/Field;Lparty/iroiro/luajava/JuaAPI$1;)V

    invoke-virtual {v1, p1, p3, v3}, Lparty/iroiro/luajava/util/LRUCache;->put(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :catch_0
    move-exception p2

    goto :goto_1

    :catch_1
    move-exception p2

    goto :goto_1

    :catch_2
    move-exception p2

    goto :goto_1

    :cond_0
    iget-object v2, v2, Lparty/iroiro/luajava/JuaAPI$OptionalField;->field:Ljava/lang/reflect/Field;

    if-nez v2, :cond_1

    new-instance p2, Ljava/lang/NoSuchFieldException;

    invoke-direct {p2, p3}, Ljava/lang/NoSuchFieldException;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, p2}, Lparty/iroiro/luajava/Lua;->error(Ljava/lang/Throwable;)I

    move-result p0

    return p0

    :cond_1
    :goto_0
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v1

    const/4 v3, 0x3

    invoke-static {p0, v1, v3}, Lparty/iroiro/luajava/JuaAPI;->convertFromLua(Lparty/iroiro/luajava/Lua;Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v2, p2, v1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p0, 0x0

    return p0

    :goto_1
    sget-object v1, Lparty/iroiro/luajava/JuaAPI;->OBJECT_FIELD_CACHE:Lparty/iroiro/luajava/util/LRUCache;

    new-instance v2, Lparty/iroiro/luajava/JuaAPI$OptionalField;

    invoke-direct {v2, v0, v0}, Lparty/iroiro/luajava/JuaAPI$OptionalField;-><init>(Ljava/lang/reflect/Field;Lparty/iroiro/luajava/JuaAPI$1;)V

    invoke-virtual {v1, p1, p3, v2}, Lparty/iroiro/luajava/util/LRUCache;->put(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {p0, p2}, Lparty/iroiro/luajava/Lua;->error(Ljava/lang/Throwable;)I

    move-result p0

    return p0
.end method

.method public static freeThreadId(I)I
    .locals 2

    invoke-static {p0}, Lparty/iroiro/luajava/Jua;->get(I)Lparty/iroiro/luajava/AbstractLua;

    move-result-object p0

    invoke-virtual {p0}, Lparty/iroiro/luajava/AbstractLua;->getMainState()Lparty/iroiro/luajava/AbstractLua;

    move-result-object v0

    if-eq v0, p0, :cond_0

    invoke-virtual {p0}, Lparty/iroiro/luajava/AbstractLua;->close()V

    const/4 p0, 0x0

    return p0

    :cond_0
    new-instance p0, Lparty/iroiro/luajava/LuaException;

    sget-object v0, Lparty/iroiro/luajava/LuaException$LuaError;->MEMORY:Lparty/iroiro/luajava/LuaException$LuaError;

    const-string v1, "unable to detach a main state"

    invoke-direct {p0, v0, v1}, Lparty/iroiro/luajava/LuaException;-><init>(Lparty/iroiro/luajava/LuaException$LuaError;Ljava/lang/String;)V

    throw p0
.end method

.method public static getClasses(Ljava/lang/String;)[Ljava/lang/Class;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_2

    :cond_0
    sget-object v1, Lparty/iroiro/luajava/JuaAPI;->COMMA_SPLIT:Ljava/util/regex/Pattern;

    invoke-virtual {v1, p0}, Ljava/util/regex/Pattern;->split(Ljava/lang/CharSequence;)[Ljava/lang/String;

    move-result-object p0

    array-length v1, p0

    new-array v1, v1, [Ljava/lang/Class;

    :goto_0
    array-length v2, p0

    if-ge v0, v2, :cond_1

    :try_start_0
    aget-object v2, p0, v0

    invoke-static {v2}, Lparty/iroiro/luajava/util/ClassUtils;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    aput-object v2, v1, v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    const/4 v2, 0x0

    aput-object v2, v1, v0

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-object v1

    :cond_2
    :goto_2
    new-array p0, v0, [Ljava/lang/Class;

    return-object p0
.end method

.method public static javaImport(ILjava/lang/String;)I
    .locals 0

    invoke-static {p0}, Lparty/iroiro/luajava/Jua;->get(I)Lparty/iroiro/luajava/AbstractLua;

    move-result-object p0

    :try_start_0
    invoke-static {p1}, Lparty/iroiro/luajava/util/ClassUtils;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->pushJavaClass(Ljava/lang/Class;)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p0, 0x1

    return p0

    :catch_0
    move-exception p1

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->error(Ljava/lang/Throwable;)I

    move-result p0

    return p0
.end method

.method private static juaFunctionCall(ILjava/lang/Object;I)I
    .locals 0

    invoke-static {p0}, Lparty/iroiro/luajava/Jua;->get(I)Lparty/iroiro/luajava/AbstractLua;

    move-result-object p0

    instance-of p2, p1, Lparty/iroiro/luajava/JFunction;

    if-eqz p2, :cond_0

    check-cast p1, Lparty/iroiro/luajava/JFunction;

    invoke-interface {p1, p0}, Lparty/iroiro/luajava/JFunction;->__call(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0

    :cond_0
    const-string p1, "error invoking object (expecting a JFunction)"

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    const/4 p0, -0x1

    return p0
.end method

.method public static load(ILjava/lang/String;)I
    .locals 3

    invoke-static {p0}, Lparty/iroiro/luajava/Jua;->get(I)Lparty/iroiro/luajava/AbstractLua;

    move-result-object p0

    :try_start_0
    invoke-virtual {p0, p1}, Lparty/iroiro/luajava/AbstractLua;->loadExternal(Ljava/lang/String;)V
    :try_end_0
    .catch Lparty/iroiro/luajava/LuaException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "\n  no module \'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\': "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lparty/iroiro/luajava/AbstractLua;->push(Ljava/lang/String;)V

    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static loadLib(ILjava/lang/String;Ljava/lang/String;)I
    .locals 6

    const-string v0, "\n  no method \'"

    invoke-static {p0}, Lparty/iroiro/luajava/Jua;->get(I)Lparty/iroiro/luajava/AbstractLua;

    move-result-object p0

    const/4 v1, 0x2

    :try_start_0
    sget-object v2, Lparty/iroiro/luajava/JuaAPI;->JAVA_LIB_CACHE:Lparty/iroiro/luajava/util/LRUCache;

    invoke-virtual {v2, p1, p2}, Lparty/iroiro/luajava/util/LRUCache;->get(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/reflect/Method;

    if-nez v3, :cond_0

    invoke-static {p1}, Lparty/iroiro/luajava/util/ClassUtils;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    const-class v4, Lparty/iroiro/luajava/Lua;

    filled-new-array {v4}, [Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v3, p2, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    :cond_0
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v4

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne v4, v5, :cond_1

    invoke-virtual {v2, p1, p2, v3}, Lparty/iroiro/luajava/util/LRUCache;->put(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance p1, Lparty/iroiro/luajava/JuaAPI$1;

    invoke-direct {p1, v3}, Lparty/iroiro/luajava/JuaAPI$1;-><init>(Ljava/lang/reflect/Method;)V

    invoke-virtual {p0, p1}, Lparty/iroiro/luajava/AbstractLua;->push(Lparty/iroiro/luajava/JFunction;)V

    const/4 p0, 0x1

    return p0

    :cond_1
    invoke-virtual {p0}, Lparty/iroiro/luajava/AbstractLua;->pushNil()V

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\': not returning int values"

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lparty/iroiro/luajava/AbstractLua;->push(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    return v1

    :catch_0
    invoke-virtual {p0}, Lparty/iroiro/luajava/AbstractLua;->pushNil()V

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "\': no such method"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lparty/iroiro/luajava/AbstractLua;->push(Ljava/lang/String;)V

    return v1
.end method

.method public static loadModule(ILjava/lang/String;)I
    .locals 2

    const/16 v0, 0x2e

    invoke-virtual {p1, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-static {p0}, Lparty/iroiro/luajava/Jua;->get(I)Lparty/iroiro/luajava/AbstractLua;

    move-result-object p0

    invoke-virtual {p0}, Lparty/iroiro/luajava/AbstractLua;->pushNil()V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "\n  no method \'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\': invalid name"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lparty/iroiro/luajava/AbstractLua;->push(Ljava/lang/String;)V

    const/4 p0, 0x2

    return p0

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v1, p1}, Lparty/iroiro/luajava/JuaAPI;->loadLib(ILjava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method private static looseGetClass(Lparty/iroiro/luajava/Lua;I)Ljava/lang/Class;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lparty/iroiro/luajava/Lua;",
            "I)",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->isUserdata(I)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->toJavaObject(I)Ljava/lang/Object;

    move-result-object p0

    instance-of p1, p0, Ljava/lang/Class;

    if-eqz p1, :cond_0

    check-cast p0, Ljava/lang/Class;

    return-object p0

    :cond_0
    return-object v1

    :cond_1
    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_2

    :try_start_0
    invoke-static {p0}, Lparty/iroiro/luajava/util/ClassUtils;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    :cond_2
    return-object v1
.end method

.method public static luaify(I)I
    .locals 2

    invoke-static {p0}, Lparty/iroiro/luajava/Jua;->get(I)Lparty/iroiro/luajava/AbstractLua;

    move-result-object p0

    const/4 v0, -0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toJavaObject(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v1, Lparty/iroiro/luajava/Lua$Conversion;->FULL:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {p0, v0, v1}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V

    :cond_0
    const/4 p0, 0x1

    return p0
.end method

.method private static matchMethod(Lparty/iroiro/luajava/Lua;[Ljava/lang/Object;Lparty/iroiro/luajava/JuaAPI$ExecutableWrapper;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lparty/iroiro/luajava/Lua;",
            "[TT;",
            "Lparty/iroiro/luajava/JuaAPI$ExecutableWrapper<",
            "TT;>;[",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    .line 1
    array-length v0, p1

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_2

    aget-object v3, p1, v2

    .line 2
    invoke-interface {p2, v3}, Lparty/iroiro/luajava/JuaAPI$ExecutableWrapper;->getParameterTypes(Ljava/lang/Object;)[Ljava/lang/Class;

    move-result-object v4

    .line 3
    array-length v5, v4

    array-length v6, p3

    if-ne v5, v6, :cond_1

    move v5, v1

    .line 4
    :goto_1
    :try_start_0
    array-length v6, p3

    if-eq v5, v6, :cond_0

    .line 5
    aget-object v6, v4, v5

    array-length v7, p3

    neg-int v7, v7

    add-int/2addr v7, v5

    invoke-static {p0, v6, v7}, Lparty/iroiro/luajava/JuaAPI;->convertFromLua(Lparty/iroiro/luajava/Lua;Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v6

    aput-object v6, p3, v5
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_0
    return-object v3

    :catch_0
    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method private static matchMethod(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Constructor;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/reflect/Constructor<",
            "*>;"
        }
    .end annotation

    .line 6
    sget-object v0, Lparty/iroiro/luajava/JuaAPI;->CONSTRUCTOR_CACHE:Lparty/iroiro/luajava/util/LRUCache;

    invoke-virtual {v0, p0, p1}, Lparty/iroiro/luajava/util/LRUCache;->get(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/reflect/Constructor;

    if-eqz v1, :cond_0

    return-object v1

    .line 7
    :cond_0
    invoke-static {p1}, Lparty/iroiro/luajava/JuaAPI;->getClasses(Ljava/lang/String;)[Ljava/lang/Class;

    move-result-object v1

    .line 8
    :try_start_0
    invoke-virtual {p0, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    .line 9
    invoke-virtual {v0, p0, p1, v1}, Lparty/iroiro/luajava/util/LRUCache;->put(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private static matchMethod(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Method;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/reflect/Method;"
        }
    .end annotation

    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",,"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 11
    sget-object v1, Lparty/iroiro/luajava/JuaAPI;->METHOD_CACHE:Lparty/iroiro/luajava/util/LRUCache;

    invoke-virtual {v1, p0, v0}, Lparty/iroiro/luajava/util/LRUCache;->get(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/reflect/Method;

    if-eqz v2, :cond_0

    return-object v2

    .line 12
    :cond_0
    invoke-static {p2}, Lparty/iroiro/luajava/JuaAPI;->getClasses(Ljava/lang/String;)[Ljava/lang/Class;

    move-result-object p2

    .line 13
    :try_start_0
    invoke-virtual {p0, p1, p2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    .line 14
    invoke-virtual {v1, p0, v0, p1}, Lparty/iroiro/luajava/util/LRUCache;->put(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static methodInvoke(ILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;I)I
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Object;",
            "Ljava/lang/String;",
            "I)I"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lparty/iroiro/luajava/Jua;->get(I)Lparty/iroiro/luajava/AbstractLua;

    move-result-object p0

    .line 2
    new-array p4, p4, [Ljava/lang/Object;

    .line 3
    sget-object v0, Lparty/iroiro/luajava/JuaAPI;->MEMBER_METHOD_CACHE:Lparty/iroiro/luajava/util/LRUCache;

    invoke-virtual {v0, p1, p3}, Lparty/iroiro/luajava/util/LRUCache;->get(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    if-nez v0, :cond_2

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object v2, p1

    .line 5
    :goto_0
    invoke-virtual {v2}, Ljava/lang/Class;->getModifiers()I

    move-result v3

    invoke-static {v3}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    move-result v3

    if-nez v3, :cond_0

    .line 6
    invoke-virtual {v2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v2

    goto :goto_0

    .line 7
    :cond_0
    invoke-static {v2, p3, v0}, Lparty/iroiro/luajava/JuaAPI;->addNameMatching(Ljava/lang/Class;Ljava/lang/String;Ljava/util/List;)V

    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 9
    invoke-virtual {p1}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    move-result-object v2

    array-length v3, v2

    move v4, v1

    :goto_1
    if-ge v4, v3, :cond_1

    aget-object v5, v2, v4

    .line 10
    invoke-static {v5, p3, v0}, Lparty/iroiro/luajava/JuaAPI;->addNameMatching(Ljava/lang/Class;Ljava/lang/String;Ljava/util/List;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 11
    :cond_1
    new-array v2, v1, [Ljava/lang/reflect/Method;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/reflect/Method;

    .line 12
    sget-object v2, Lparty/iroiro/luajava/JuaAPI;->MEMBER_METHOD_CACHE:Lparty/iroiro/luajava/util/LRUCache;

    invoke-virtual {v2, p1, p3, v0}, Lparty/iroiro/luajava/util/LRUCache;->put(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 13
    :cond_2
    sget-object v2, Lparty/iroiro/luajava/JuaAPI;->METHOD_WRAPPER:Lparty/iroiro/luajava/JuaAPI$ExecutableWrapper;

    invoke-static {p0, v0, v2, p4}, Lparty/iroiro/luajava/JuaAPI;->matchMethod(Lparty/iroiro/luajava/Lua;[Ljava/lang/Object;Lparty/iroiro/luajava/JuaAPI$ExecutableWrapper;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/reflect/Method;

    if-nez v2, :cond_4

    .line 14
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v2, "no matching method found: "

    invoke-direct {p2, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "."

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p4}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    array-length p1, v0

    :goto_2
    if-ge v1, p1, :cond_3

    aget-object p3, v0, v1

    .line 17
    const-string p4, "\n"

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 18
    :cond_3
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    const/4 p0, -0x1

    return p0

    .line 19
    :cond_4
    invoke-static {p0, v2, p2, p4}, Lparty/iroiro/luajava/JuaAPI;->methodInvoke(Lparty/iroiro/luajava/Lua;Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public static methodInvoke(ILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;I)I
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Object;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I)I"
        }
    .end annotation

    .line 20
    invoke-static {p0}, Lparty/iroiro/luajava/Jua;->get(I)Lparty/iroiro/luajava/AbstractLua;

    move-result-object p0

    .line 21
    const-string v0, "new"

    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, -0x1

    if-eqz v0, :cond_2

    if-nez p2, :cond_1

    .line 22
    invoke-static {p1, p4}, Lparty/iroiro/luajava/JuaAPI;->matchMethod(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Constructor;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 23
    new-array p2, p5, [Ljava/lang/Object;

    .line 24
    filled-new-array {p1}, [Ljava/lang/reflect/Constructor;

    move-result-object p3

    sget-object p4, Lparty/iroiro/luajava/JuaAPI;->CONSTRUCTOR_WRAPPER:Lparty/iroiro/luajava/JuaAPI$ExecutableWrapper;

    invoke-static {p0, p3, p4, p2}, Lparty/iroiro/luajava/JuaAPI;->matchMethod(Lparty/iroiro/luajava/Lua;[Ljava/lang/Object;Lparty/iroiro/luajava/JuaAPI$ExecutableWrapper;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    if-eqz p3, :cond_0

    .line 25
    invoke-static {p0, p2, p1}, Lparty/iroiro/luajava/JuaAPI;->construct(Lparty/iroiro/luajava/Lua;[Ljava/lang/Object;Ljava/lang/reflect/Constructor;)I

    move-result p0

    return p0

    .line 26
    :cond_0
    const-string p1, "no matching constructor found"

    invoke-virtual {p0, p1}, Lparty/iroiro/luajava/AbstractLua;->push(Ljava/lang/String;)V

    return v1

    .line 27
    :cond_1
    const-string p1, "bad argument to constructor (Class<?> expected, got Object)"

    invoke-virtual {p0, p1}, Lparty/iroiro/luajava/AbstractLua;->push(Ljava/lang/String;)V

    return v1

    .line 28
    :cond_2
    invoke-static {p1, p3, p4}, Lparty/iroiro/luajava/JuaAPI;->matchMethod(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 29
    const-string v2, "("

    const-string v3, "."

    const-string v4, "no matching method found: "

    if-eqz v0, :cond_5

    .line 30
    new-array p5, p5, [Ljava/lang/Object;

    .line 31
    filled-new-array {v0}, [Ljava/lang/reflect/Method;

    move-result-object v5

    sget-object v6, Lparty/iroiro/luajava/JuaAPI;->METHOD_WRAPPER:Lparty/iroiro/luajava/JuaAPI$ExecutableWrapper;

    invoke-static {p0, v5, v6, p5}, Lparty/iroiro/luajava/JuaAPI;->matchMethod(Lparty/iroiro/luajava/Lua;[Ljava/lang/Object;Lparty/iroiro/luajava/JuaAPI$ExecutableWrapper;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_4

    .line 32
    invoke-virtual {p1}, Ljava/lang/Class;->isInterface()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 33
    invoke-static {p0, v0, p2, p5}, Lparty/iroiro/luajava/JuaAPI;->specialInvoke(Lparty/iroiro/luajava/AbstractLua;Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)I

    move-result p0

    return p0

    .line 34
    :cond_3
    invoke-static {p0, v0, p2, p5}, Lparty/iroiro/luajava/JuaAPI;->methodInvoke(Lparty/iroiro/luajava/Lua;Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)I

    move-result p0

    return p0

    .line 35
    :cond_4
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "): "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    invoke-static {p5}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 37
    :cond_5
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ")"

    .line 38
    invoke-static {p2, p4, p1}, LEy;->h(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 39
    :goto_0
    invoke-virtual {p0, p1}, Lparty/iroiro/luajava/AbstractLua;->push(Ljava/lang/String;)V

    return v1
.end method

.method public static methodInvoke(Lparty/iroiro/luajava/Lua;Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)I
    .locals 0

    .line 43
    :try_start_0
    invoke-virtual {p1, p2, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return p0

    .line 44
    :cond_0
    sget-object p2, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {p0, p1, p2}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V

    const/4 p0, 0x1

    return p0

    :catch_0
    move-exception p1

    .line 45
    invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->error(Ljava/lang/Throwable;)I

    move-result p0

    return p0

    :catch_1
    move-exception p1

    .line 46
    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->error(Ljava/lang/Throwable;)I

    move-result p0

    return p0
.end method

.method public static objectIndex(ILjava/lang/Object;Ljava/lang/String;)I
    .locals 1

    invoke-static {p0}, Lparty/iroiro/luajava/Jua;->get(I)Lparty/iroiro/luajava/AbstractLua;

    move-result-object p0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {p0, v0, p1, p2}, Lparty/iroiro/luajava/JuaAPI;->fieldIndex(Lparty/iroiro/luajava/Lua;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method public static objectInvoke(ILjava/lang/Object;Ljava/lang/String;I)I
    .locals 1

    if-nez p2, :cond_0

    .line 1
    invoke-static {p0, p1, p3}, Lparty/iroiro/luajava/JuaAPI;->juaFunctionCall(ILjava/lang/Object;I)I

    move-result p0

    return p0

    .line 2
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {p0, v0, p1, p2, p3}, Lparty/iroiro/luajava/JuaAPI;->methodInvoke(ILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;I)I

    move-result p0

    return p0
.end method

.method public static objectInvoke(ILjava/lang/Object;Ljava/lang/String;Ljava/lang/String;I)I
    .locals 8

    const/16 v0, 0x3a

    .line 3
    invoke-virtual {p2, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    move v2, p0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move v7, p4

    invoke-static/range {v2 .. v7}, Lparty/iroiro/luajava/JuaAPI;->methodInvoke(ILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;I)I

    move-result p0

    return p0

    :cond_0
    move v1, p0

    move-object v3, p1

    move-object v5, p2

    move-object v6, p3

    move v7, p4

    const/4 p0, 0x0

    .line 5
    invoke-virtual {v5, p0, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    add-int/lit8 v0, v0, 0x1

    .line 6
    invoke-virtual {v5, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    .line 7
    :try_start_0
    invoke-static {p0}, Lparty/iroiro/luajava/util/ClassUtils;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    move-object v5, v6

    move v6, v7

    invoke-static/range {v1 .. v6}, Lparty/iroiro/luajava/JuaAPI;->methodInvoke(ILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;I)I

    move-result p0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    move-exception v0

    move-object p0, v0

    .line 8
    invoke-static {v1}, Lparty/iroiro/luajava/Jua;->get(I)Lparty/iroiro/luajava/AbstractLua;

    move-result-object p1

    invoke-virtual {p1, p0}, Lparty/iroiro/luajava/AbstractLua;->error(Ljava/lang/Throwable;)I

    move-result p0

    return p0
.end method

.method public static objectNewIndex(ILjava/lang/Object;Ljava/lang/String;)I
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {p0, v0, p1, p2}, Lparty/iroiro/luajava/JuaAPI;->fieldNewIndex(ILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method public static proxy(I)I
    .locals 6

    invoke-static {p0}, Lparty/iroiro/luajava/Jua;->get(I)Lparty/iroiro/luajava/AbstractLua;

    move-result-object p0

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->getTop()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    new-instance v2, Ljava/util/LinkedList;

    invoke-direct {v2}, Ljava/util/LinkedList;-><init>()V

    move v3, v1

    :goto_0
    if-gt v3, v0, :cond_1

    invoke-static {p0, v3}, Lparty/iroiro/luajava/JuaAPI;->looseGetClass(Lparty/iroiro/luajava/Lua;I)Ljava/lang/Class;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Ljava/lang/Class;->isInterface()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {v2, v4}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "bad argument #"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " to \'java.proxy\' (expecting an interface)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    const/4 p0, -0x1

    return p0

    :cond_1
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Class;

    invoke-virtual {v2, v0}, Ljava/util/LinkedList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Class;

    sget-object v2, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {p0, v0, v2}, Lparty/iroiro/luajava/Lua;->createProxy([Ljava/lang/Class;Lparty/iroiro/luajava/Lua$Conversion;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->pushJavaObject(Ljava/lang/Object;)V

    return v1
.end method

.method private static specialInvoke(Lparty/iroiro/luajava/AbstractLua;Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)I
    .locals 0

    :try_start_0
    invoke-virtual {p0, p2, p1, p3}, Lparty/iroiro/luajava/AbstractLua;->invokeSpecial(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    sget-object p2, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-virtual {p0, p1, p2}, Lparty/iroiro/luajava/AbstractLua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V

    const/4 p0, 0x1

    return p0

    :catchall_0
    move-exception p1

    invoke-virtual {p0, p1}, Lparty/iroiro/luajava/AbstractLua;->error(Ljava/lang/Throwable;)I

    move-result p0

    return p0
.end method

.method public static threadNewId(IJ)I
    .locals 0

    invoke-static {p0, p1, p2}, Lparty/iroiro/luajava/AbstractLua;->adopt(IJ)I

    move-result p0

    return p0
.end method

.method public static unwrap(ILjava/lang/Object;)I
    .locals 2

    invoke-static {p0}, Lparty/iroiro/luajava/Jua;->get(I)Lparty/iroiro/luajava/AbstractLua;

    move-result-object p0

    :try_start_0
    invoke-static {p1}, Ljava/lang/reflect/Proxy;->getInvocationHandler(Ljava/lang/Object;)Ljava/lang/reflect/InvocationHandler;

    move-result-object p1

    instance-of v0, p1, Lparty/iroiro/luajava/LuaProxy;

    if-eqz v0, :cond_1

    check-cast p1, Lparty/iroiro/luajava/LuaProxy;

    iget-object v0, p1, Lparty/iroiro/luajava/LuaProxy;->L:Lparty/iroiro/luajava/AbstractLua;

    iget-object v0, v0, Lparty/iroiro/luajava/AbstractLua;->mainThread:Lparty/iroiro/luajava/AbstractLua;

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->getMainState()Lparty/iroiro/luajava/Lua;

    move-result-object v1

    if-ne v0, v1, :cond_0

    iget p1, p1, Lparty/iroiro/luajava/LuaProxy;->ref:I

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->refGet(I)V

    const/4 p0, 0x1

    return p0

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_1

    :cond_0
    const-string p1, "Proxied table is on different states"

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const-string p1, "No a LuaProxy backed object"

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    const/4 p0, -0x1

    return p0

    :goto_1
    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->error(Ljava/lang/Throwable;)I

    move-result p0

    return p0
.end method
