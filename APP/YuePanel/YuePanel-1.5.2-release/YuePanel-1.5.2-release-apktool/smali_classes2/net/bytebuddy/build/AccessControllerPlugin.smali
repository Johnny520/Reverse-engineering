.class public Lnet/bytebuddy/build/AccessControllerPlugin;
.super Lnet/bytebuddy/build/Plugin$ForElementMatcher;
.source "SourceFile"

# interfaces
.implements Lnet/bytebuddy/build/Plugin$Factory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/build/AccessControllerPlugin$Enhance;,
        Lnet/bytebuddy/build/AccessControllerPlugin$AccessControlWrapper;,
        Lnet/bytebuddy/build/AccessControllerPlugin$Initializer;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field private static final ACCESS_CONTROLLER:Ljava/lang/String; = "java.security.AccessController"

.field private static final EMPTY:[Ljava/lang/Object;

.field private static final NAME:Ljava/lang/String; = "ACCESS_CONTROLLER"

.field private static final SIGNATURES:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;",
            "Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final property:Ljava/lang/String;
    .annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling;
        value = .enum Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;->REVERSE_NULLABILITY:Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 17

    const/4 v0, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/Object;

    sput-object v4, Lnet/bytebuddy/build/AccessControllerPlugin;->EMPTY:[Ljava/lang/Object;

    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    sput-object v4, Lnet/bytebuddy/build/AccessControllerPlugin;->SIGNATURES:Ljava/util/Map;

    new-instance v5, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    const-class v6, Ljava/lang/Object;

    invoke-static {v6}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v7

    const-class v8, Ljava/security/PrivilegedAction;

    invoke-static {v8}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v9

    new-array v10, v2, [Lnet/bytebuddy/description/type/TypeDescription;

    aput-object v9, v10, v3

    const-string v9, "doPrivileged"

    invoke-direct {v5, v9, v7, v10}, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;[Lnet/bytebuddy/description/type/TypeDescription;)V

    new-instance v7, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    invoke-static {v6}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v10

    invoke-static {v8}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v11

    new-array v12, v2, [Lnet/bytebuddy/description/type/TypeDescription;

    aput-object v11, v12, v3

    invoke-direct {v7, v9, v10, v12}, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;[Lnet/bytebuddy/description/type/TypeDescription;)V

    invoke-interface {v4, v5, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v5, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    invoke-static {v6}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v7

    invoke-static {v8}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v10

    new-array v11, v2, [Lnet/bytebuddy/description/type/TypeDescription;

    aput-object v10, v11, v3

    const-string v10, "doPrivilegedWithCombiner"

    invoke-direct {v5, v10, v7, v11}, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;[Lnet/bytebuddy/description/type/TypeDescription;)V

    new-instance v7, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    invoke-static {v6}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v11

    invoke-static {v8}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v12

    new-array v13, v2, [Lnet/bytebuddy/description/type/TypeDescription;

    aput-object v12, v13, v3

    invoke-direct {v7, v10, v11, v13}, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;[Lnet/bytebuddy/description/type/TypeDescription;)V

    invoke-interface {v4, v5, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v5, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    invoke-static {v6}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v7

    invoke-static {v8}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v11

    invoke-static {v6}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v12

    new-array v13, v1, [Lnet/bytebuddy/description/type/TypeDescription;

    aput-object v11, v13, v3

    aput-object v12, v13, v2

    invoke-direct {v5, v9, v7, v13}, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;[Lnet/bytebuddy/description/type/TypeDescription;)V

    new-instance v7, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    invoke-static {v6}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v11

    invoke-static {v8}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v12

    sget-object v13, Lnet/bytebuddy/utility/JavaType;->ACCESS_CONTROL_CONTEXT:Lnet/bytebuddy/utility/JavaType;

    invoke-virtual {v13}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v14

    new-array v15, v1, [Lnet/bytebuddy/description/type/TypeDescription;

    aput-object v12, v15, v3

    aput-object v14, v15, v2

    invoke-direct {v7, v9, v11, v15}, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;[Lnet/bytebuddy/description/type/TypeDescription;)V

    invoke-interface {v4, v5, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v5, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    invoke-static {v6}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v7

    invoke-static {v8}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v11

    invoke-static {v6}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v12

    const-class v14, [Ljava/security/Permission;

    invoke-static {v14}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v15

    new-array v1, v0, [Lnet/bytebuddy/description/type/TypeDescription;

    aput-object v11, v1, v3

    aput-object v12, v1, v2

    const/4 v11, 0x2

    aput-object v15, v1, v11

    invoke-direct {v5, v9, v7, v1}, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;[Lnet/bytebuddy/description/type/TypeDescription;)V

    new-instance v1, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    invoke-static {v6}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v7

    invoke-static {v8}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v12

    invoke-virtual {v13}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v15

    invoke-static {v14}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v16

    new-array v11, v0, [Lnet/bytebuddy/description/type/TypeDescription;

    aput-object v12, v11, v3

    aput-object v15, v11, v2

    const/4 v12, 0x2

    aput-object v16, v11, v12

    invoke-direct {v1, v9, v7, v11}, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;[Lnet/bytebuddy/description/type/TypeDescription;)V

    invoke-interface {v4, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    invoke-static {v6}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v5

    invoke-static {v8}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v7

    invoke-static {v6}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v11

    invoke-static {v14}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v15

    new-array v12, v0, [Lnet/bytebuddy/description/type/TypeDescription;

    aput-object v7, v12, v3

    aput-object v11, v12, v2

    const/4 v7, 0x2

    aput-object v15, v12, v7

    invoke-direct {v1, v10, v5, v12}, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;[Lnet/bytebuddy/description/type/TypeDescription;)V

    new-instance v5, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    invoke-static {v6}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v11

    invoke-static {v8}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v8

    invoke-virtual {v13}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v12

    invoke-static {v14}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v15

    new-array v7, v0, [Lnet/bytebuddy/description/type/TypeDescription;

    aput-object v8, v7, v3

    aput-object v12, v7, v2

    const/4 v8, 0x2

    aput-object v15, v7, v8

    invoke-direct {v5, v10, v11, v7}, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;[Lnet/bytebuddy/description/type/TypeDescription;)V

    invoke-interface {v4, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    invoke-static {v6}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v5

    const-class v7, Ljava/security/PrivilegedExceptionAction;

    invoke-static {v7}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v8

    new-array v11, v2, [Lnet/bytebuddy/description/type/TypeDescription;

    aput-object v8, v11, v3

    invoke-direct {v1, v9, v5, v11}, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;[Lnet/bytebuddy/description/type/TypeDescription;)V

    new-instance v5, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    invoke-static {v6}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v8

    invoke-static {v7}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v11

    new-array v12, v2, [Lnet/bytebuddy/description/type/TypeDescription;

    aput-object v11, v12, v3

    invoke-direct {v5, v9, v8, v12}, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;[Lnet/bytebuddy/description/type/TypeDescription;)V

    invoke-interface {v4, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    invoke-static {v6}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v5

    invoke-static {v7}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v8

    new-array v11, v2, [Lnet/bytebuddy/description/type/TypeDescription;

    aput-object v8, v11, v3

    invoke-direct {v1, v10, v5, v11}, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;[Lnet/bytebuddy/description/type/TypeDescription;)V

    new-instance v5, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    invoke-static {v6}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v8

    invoke-static {v7}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v11

    new-array v12, v2, [Lnet/bytebuddy/description/type/TypeDescription;

    aput-object v11, v12, v3

    invoke-direct {v5, v10, v8, v12}, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;[Lnet/bytebuddy/description/type/TypeDescription;)V

    invoke-interface {v4, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    invoke-static {v6}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v5

    invoke-static {v7}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v8

    invoke-static {v6}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v11

    const/4 v12, 0x2

    new-array v15, v12, [Lnet/bytebuddy/description/type/TypeDescription;

    aput-object v8, v15, v3

    aput-object v11, v15, v2

    invoke-direct {v1, v9, v5, v15}, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;[Lnet/bytebuddy/description/type/TypeDescription;)V

    new-instance v5, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    invoke-static {v6}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v8

    invoke-static {v7}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v11

    invoke-virtual {v13}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v15

    new-array v0, v12, [Lnet/bytebuddy/description/type/TypeDescription;

    aput-object v11, v0, v3

    aput-object v15, v0, v2

    invoke-direct {v5, v9, v8, v0}, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;[Lnet/bytebuddy/description/type/TypeDescription;)V

    invoke-interface {v4, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    invoke-static {v6}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v1

    invoke-static {v7}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v5

    invoke-static {v6}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v8

    invoke-static {v14}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v11

    const/4 v12, 0x3

    new-array v15, v12, [Lnet/bytebuddy/description/type/TypeDescription;

    aput-object v5, v15, v3

    aput-object v8, v15, v2

    const/4 v5, 0x2

    aput-object v11, v15, v5

    invoke-direct {v0, v9, v1, v15}, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;[Lnet/bytebuddy/description/type/TypeDescription;)V

    new-instance v1, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    invoke-static {v6}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v8

    invoke-static {v7}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v11

    invoke-virtual {v13}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v15

    invoke-static {v14}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v16

    new-array v5, v12, [Lnet/bytebuddy/description/type/TypeDescription;

    aput-object v11, v5, v3

    aput-object v15, v5, v2

    const/4 v11, 0x2

    aput-object v16, v5, v11

    invoke-direct {v1, v9, v8, v5}, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;[Lnet/bytebuddy/description/type/TypeDescription;)V

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    invoke-static {v6}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v1

    invoke-static {v7}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v5

    invoke-static {v6}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v8

    invoke-static {v14}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v9

    new-array v15, v12, [Lnet/bytebuddy/description/type/TypeDescription;

    aput-object v5, v15, v3

    aput-object v8, v15, v2

    aput-object v9, v15, v11

    invoke-direct {v0, v10, v1, v15}, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;[Lnet/bytebuddy/description/type/TypeDescription;)V

    new-instance v1, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    invoke-static {v6}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v5

    invoke-static {v7}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v7

    invoke-virtual {v13}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v8

    invoke-static {v14}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v9

    new-array v12, v12, [Lnet/bytebuddy/description/type/TypeDescription;

    aput-object v7, v12, v3

    aput-object v8, v12, v2

    aput-object v9, v12, v11

    invoke-direct {v1, v10, v5, v12}, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;[Lnet/bytebuddy/description/type/TypeDescription;)V

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    invoke-static {v6}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v1

    new-array v5, v3, [Lnet/bytebuddy/description/type/TypeDescription;

    const-string v6, "getContext"

    invoke-direct {v0, v6, v1, v5}, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;[Lnet/bytebuddy/description/type/TypeDescription;)V

    new-instance v1, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    invoke-virtual {v13}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v5

    new-array v7, v3, [Lnet/bytebuddy/description/type/TypeDescription;

    invoke-direct {v1, v6, v5, v7}, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;[Lnet/bytebuddy/description/type/TypeDescription;)V

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    invoke-static {v1}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v5

    const-class v6, Ljava/security/Permission;

    invoke-static {v6}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v7

    new-array v8, v2, [Lnet/bytebuddy/description/type/TypeDescription;

    aput-object v7, v8, v3

    const-string v7, "checkPermission"

    invoke-direct {v0, v7, v5, v8}, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;[Lnet/bytebuddy/description/type/TypeDescription;)V

    new-instance v5, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    invoke-static {v1}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v1

    invoke-static {v6}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v6

    new-array v2, v2, [Lnet/bytebuddy/description/type/TypeDescription;

    aput-object v6, v2, v3

    invoke-direct {v5, v7, v1, v2}, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;[Lnet/bytebuddy/description/type/TypeDescription;)V

    invoke-interface {v4, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lnet/bytebuddy/build/AccessControllerPlugin;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation runtime Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Priority;
        value = 0x7fffffff
    .end annotation

    .line 2
    const-class v0, Lnet/bytebuddy/build/AccessControllerPlugin$Enhance;

    invoke-static {v0}, Lnet/bytebuddy/matcher/ElementMatchers;->isAnnotatedWith(Ljava/lang/Class;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v0

    invoke-static {v0}, Lnet/bytebuddy/matcher/ElementMatchers;->declaresMethod(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v0

    invoke-direct {p0, v0}, Lnet/bytebuddy/build/Plugin$ForElementMatcher;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;)V

    .line 3
    iput-object p1, p0, Lnet/bytebuddy/build/AccessControllerPlugin;->property:Ljava/lang/String;

    return-void
.end method

.method public static synthetic access$000()Ljava/util/Map;
    .locals 1

    sget-object v0, Lnet/bytebuddy/build/AccessControllerPlugin;->SIGNATURES:Ljava/util/Map;

    return-object v0
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/dynamic/DynamicType$Builder;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "*>;",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Lnet/bytebuddy/dynamic/ClassFileLocator;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "*>;"
        }
    .end annotation

    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "Collision is unlikely and buffer overhead not justified."
        value = {
            "SBSC_USE_STRINGBUFFER_CONCATENATION"
        }
    .end annotation

    const/4 p3, 0x1

    const/4 v0, 0x0

    const-string v1, "ACCESS_CONTROLLER"

    :goto_0
    invoke-interface {p2}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredFields()Lnet/bytebuddy/description/field/FieldList;

    move-result-object v2

    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v3

    invoke-interface {v2, v3}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    move-result-object v2

    check-cast v2, Lnet/bytebuddy/description/field/FieldList;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "$"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const/4 v3, 0x3

    new-array v3, v3, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForField;

    sget-object v4, Lnet/bytebuddy/description/modifier/Visibility;->PRIVATE:Lnet/bytebuddy/description/modifier/Visibility;

    aput-object v4, v3, v0

    sget-object v4, Lnet/bytebuddy/description/modifier/Ownership;->STATIC:Lnet/bytebuddy/description/modifier/Ownership;

    aput-object v4, v3, p3

    sget-object v4, Lnet/bytebuddy/description/modifier/FieldManifestation;->FINAL:Lnet/bytebuddy/description/modifier/FieldManifestation;

    const/4 v5, 0x2

    aput-object v4, v3, v5

    invoke-interface {p1, v1, v2, v3}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineField(Ljava/lang/String;Ljava/lang/reflect/Type;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForField;)Lnet/bytebuddy/dynamic/DynamicType$Builder$FieldDefinition$Optional$Valuable;

    move-result-object p1

    new-instance v2, Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredMethods;

    invoke-direct {v2}, Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredMethods;-><init>()V

    const-class v3, Lnet/bytebuddy/build/AccessControllerPlugin$Enhance;

    invoke-static {v3}, Lnet/bytebuddy/matcher/ElementMatchers;->isAnnotatedWith(Ljava/lang/Class;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v3

    new-instance v4, Lnet/bytebuddy/build/AccessControllerPlugin$AccessControlWrapper;

    invoke-direct {v4, v1}, Lnet/bytebuddy/build/AccessControllerPlugin$AccessControlWrapper;-><init>(Ljava/lang/String;)V

    new-array p3, p3, [Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredMethods$MethodVisitorWrapper;

    aput-object v4, p3, v0

    invoke-virtual {v2, v3, p3}, Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredMethods;->method(Lnet/bytebuddy/matcher/ElementMatcher;[Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredMethods$MethodVisitorWrapper;)Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredMethods;

    move-result-object p3

    invoke-interface {p1, p3}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->visit(Lnet/bytebuddy/asm/AsmVisitorWrapper;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    move-result-object p1

    iget-object p3, p0, Lnet/bytebuddy/build/AccessControllerPlugin;->property:Ljava/lang/String;

    if-nez p3, :cond_1

    new-instance p3, Lnet/bytebuddy/build/AccessControllerPlugin$Initializer$WithoutProperty;

    invoke-direct {p3, p2, v1}, Lnet/bytebuddy/build/AccessControllerPlugin$Initializer$WithoutProperty;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    new-instance v0, Lnet/bytebuddy/build/AccessControllerPlugin$Initializer$WithProperty;

    invoke-direct {v0, p2, v1, p3}, Lnet/bytebuddy/build/AccessControllerPlugin$Initializer$WithProperty;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/String;Ljava/lang/String;)V

    move-object p3, v0

    :goto_1
    invoke-interface {p1, p3}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->initializer(Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    move-result-object p1

    return-object p1
.end method

.method public close()V
    .locals 0

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Lnet/bytebuddy/build/Plugin$ForElementMatcher;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x1

    if-ne p0, p1, :cond_1

    return v0

    :cond_1
    if-nez p1, :cond_2

    return v1

    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/build/AccessControllerPlugin;->property:Ljava/lang/String;

    check-cast p1, Lnet/bytebuddy/build/AccessControllerPlugin;

    iget-object p1, p1, Lnet/bytebuddy/build/AccessControllerPlugin;->property:Ljava/lang/String;

    if-eqz p1, :cond_4

    if-eqz v2, :cond_5

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v1

    :cond_4
    if-eqz v2, :cond_6

    :cond_5
    return v1

    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 2

    invoke-super {p0}, Lnet/bytebuddy/build/Plugin$ForElementMatcher;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/build/AccessControllerPlugin;->property:Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    :cond_0
    return v0
.end method

.method public make()Lnet/bytebuddy/build/Plugin;
    .locals 0

    return-object p0
.end method
