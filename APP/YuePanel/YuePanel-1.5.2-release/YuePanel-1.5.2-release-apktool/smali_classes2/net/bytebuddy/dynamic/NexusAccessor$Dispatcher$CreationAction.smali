.class public final enum Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher$CreationAction;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Ljava/security/PrivilegedAction;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "CreationAction"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher$CreationAction;",
        ">;",
        "Ljava/security/PrivilegedAction<",
        "Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher$CreationAction;

.field public static final enum INSTANCE:Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher$CreationAction;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher$CreationAction;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher$CreationAction;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher$CreationAction;->INSTANCE:Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher$CreationAction;

    filled-new-array {v0}, [Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher$CreationAction;

    move-result-object v0

    sput-object v0, Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher$CreationAction;->$VALUES:[Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher$CreationAction;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher$CreationAction;
    .locals 1

    const-class v0, Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher$CreationAction;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher$CreationAction;

    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher$CreationAction;
    .locals 1

    sget-object v0, Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher$CreationAction;->$VALUES:[Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher$CreationAction;

    invoke-virtual {v0}, [Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher$CreationAction;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher$CreationAction;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic run()Ljava/lang/Object;
    .locals 1
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "Exception should not be rethrown but trigger a fallback."
        value = {
            "REC_CATCH_EXCEPTION"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher$CreationAction;->run()Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher;

    move-result-object v0

    return-object v0
.end method

.method public run()Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher;
    .locals 13
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "Exception should not be rethrown but trigger a fallback."
        value = {
            "REC_CATCH_EXCEPTION"
        }
    .end annotation

    .line 2
    const-class v0, Ljava/lang/ref/Reference;

    const-string v1, "clean"

    const-class v2, Ljava/lang/Object;

    const-class v3, Ljava/lang/ref/ReferenceQueue;

    const-class v4, Ljava/lang/ClassLoader;

    const-class v5, Ljava/lang/String;

    const-string v6, "register"

    const-class v7, Lnet/bytebuddy/dynamic/Nexus;

    const-string v8, "net.bytebuddy.nexus.disabled"

    invoke-static {v8}, Ljava/lang/Boolean;->getBoolean(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_0

    .line 3
    new-instance v0, Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher$Unavailable;

    const-string v1, "Nexus injection was explicitly disabled"

    invoke-direct {v0, v1}, Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher$Unavailable;-><init>(Ljava/lang/String;)V

    return-object v0

    .line 4
    :cond_0
    :try_start_0
    new-instance v8, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection;

    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    move-result-object v9

    sget-object v10, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy;->NO_PROTECTION_DOMAIN:Ljava/security/ProtectionDomain;

    invoke-direct {v8, v9, v10}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection;-><init>(Ljava/lang/ClassLoader;Ljava/security/ProtectionDomain;)V

    .line 5
    invoke-static {v7}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v9

    invoke-static {v7}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForClassLoader;->read(Ljava/lang/Class;)[B

    move-result-object v10

    invoke-static {v9, v10}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v9

    invoke-virtual {v8, v9}, Lnet/bytebuddy/dynamic/loading/ClassInjector$AbstractBase;->inject(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v8

    .line 6
    invoke-static {v7}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v9

    invoke-interface {v8, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Class;

    .line 7
    new-instance v9, Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher$Available;

    sget-object v10, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v5, v4, v3, v10, v2}, [Ljava/lang/Class;

    move-result-object v10

    invoke-virtual {v8, v6, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v10

    filled-new-array {v0}, [Ljava/lang/Class;

    move-result-object v11

    .line 8
    invoke-virtual {v8, v1, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v8

    invoke-direct {v9, v10, v8}, Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher$Available;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v9

    :catch_0
    move-exception v8

    .line 9
    :try_start_1
    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    move-result-object v9

    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v9, v7}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    .line 10
    :try_start_2
    const-class v8, Lnet/bytebuddy/dynamic/NexusAccessor;

    invoke-static {v8}, Lnet/bytebuddy/utility/JavaModule;->ofType(Ljava/lang/Class;)Lnet/bytebuddy/utility/JavaModule;

    move-result-object v8

    invoke-static {v7}, Lnet/bytebuddy/utility/JavaModule;->ofType(Ljava/lang/Class;)Lnet/bytebuddy/utility/JavaModule;

    move-result-object v9

    if-eqz v8, :cond_1

    .line 11
    invoke-virtual {v8, v9}, Lnet/bytebuddy/utility/JavaModule;->canRead(Lnet/bytebuddy/utility/JavaModule;)Z

    move-result v10

    if-nez v10, :cond_1

    .line 12
    const-string v10, "java.lang.Module"

    invoke-static {v10}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v10

    .line 13
    const-string v11, "addReads"

    filled-new-array {v10}, [Ljava/lang/Class;

    move-result-object v12

    invoke-virtual {v10, v11, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v10

    invoke-virtual {v8}, Lnet/bytebuddy/utility/JavaModule;->unwrap()Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v9}, Lnet/bytebuddy/utility/JavaModule;->unwrap()Ljava/lang/Object;

    move-result-object v9

    filled-new-array {v9}, [Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v10, v8, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_1

    .line 14
    :cond_1
    :goto_0
    new-instance v8, Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher$Available;

    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v5, v4, v3, v9, v2}, [Ljava/lang/Class;

    move-result-object v2

    .line 15
    invoke-virtual {v7, v6, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    filled-new-array {v0}, [Ljava/lang/Class;

    move-result-object v0

    .line 16
    invoke-virtual {v7, v1, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-direct {v8, v2, v0}, Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher$Available;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    return-object v8

    .line 17
    :goto_1
    new-instance v1, Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher$Unavailable;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher$Unavailable;-><init>(Ljava/lang/String;)V

    return-object v1

    .line 18
    :catch_2
    new-instance v0, Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher$Unavailable;

    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher$Unavailable;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
