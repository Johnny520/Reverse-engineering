.class public final Lcom/esotericsoftware/kryo/util/NoGenerics;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lcom/esotericsoftware/kryo/util/Generics;


# static fields
.field public static final INSTANCE:Lcom/esotericsoftware/kryo/util/Generics;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/esotericsoftware/kryo/util/NoGenerics;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/esotericsoftware/kryo/util/NoGenerics;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/esotericsoftware/kryo/util/NoGenerics;->INSTANCE:Lcom/esotericsoftware/kryo/util/Generics;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public buildHierarchy(Ljava/lang/Class;)Lcom/esotericsoftware/kryo/util/Generics$GenericsHierarchy;
    .locals 0

    .line 1
    sget-object p0, Lcom/esotericsoftware/kryo/util/Generics$GenericsHierarchy;->EMPTY:Lcom/esotericsoftware/kryo/util/Generics$GenericsHierarchy;

    .line 2
    .line 3
    return-object p0
.end method

.method public getGenericTypesSize()I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public nextGenericClass()Ljava/lang/Class;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public nextGenericTypes()[Lcom/esotericsoftware/kryo/util/Generics$GenericType;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public popGenericType()V
    .locals 0

    .line 1
    return-void
.end method

.method public popTypeVariables(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public pushGenericType(Lcom/esotericsoftware/kryo/util/Generics$GenericType;)V
    .locals 0

    .line 1
    return-void
.end method

.method public pushTypeVariables(Lcom/esotericsoftware/kryo/util/Generics$GenericsHierarchy;[Lcom/esotericsoftware/kryo/util/Generics$GenericType;)I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public resolveTypeVariable(Ljava/lang/reflect/TypeVariable;)Ljava/lang/Class;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method
