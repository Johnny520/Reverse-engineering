.class public final enum Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader$Resolver$CreationAction;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Ljava/security/PrivilegedAction;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader$Resolver;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "CreationAction"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader$Resolver$CreationAction;",
        ">;",
        "Ljava/security/PrivilegedAction<",
        "Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader$Resolver;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader$Resolver$CreationAction;

.field public static final enum INSTANCE:Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader$Resolver$CreationAction;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader$Resolver$CreationAction;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader$Resolver$CreationAction;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader$Resolver$CreationAction;->INSTANCE:Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader$Resolver$CreationAction;

    filled-new-array {v0}, [Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader$Resolver$CreationAction;

    move-result-object v0

    sput-object v0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader$Resolver$CreationAction;->$VALUES:[Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader$Resolver$CreationAction;

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

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader$Resolver$CreationAction;
    .locals 1

    const-class v0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader$Resolver$CreationAction;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader$Resolver$CreationAction;

    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader$Resolver$CreationAction;
    .locals 1

    sget-object v0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader$Resolver$CreationAction;->$VALUES:[Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader$Resolver$CreationAction;

    invoke-virtual {v0}, [Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader$Resolver$CreationAction;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader$Resolver$CreationAction;

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
    invoke-virtual {p0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader$Resolver$CreationAction;->run()Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader$Resolver;

    move-result-object v0

    return-object v0
.end method

.method public run()Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader$Resolver;
    .locals 7
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "Exception should not be rethrown but trigger a fallback."
        value = {
            "REC_CATCH_EXCEPTION"
        }
    .end annotation

    .line 2
    const-class v0, Ljava/lang/String;

    :try_start_0
    const-string v1, "java.lang.Module"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v1, v2, v3}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v1

    .line 3
    new-instance v2, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader$Resolver$ForModuleSystem;

    const-class v4, Ljava/lang/Class;

    const-string v5, "getModule"

    invoke-virtual {v4, v5, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    const-string v5, "isExported"

    filled-new-array {v0}, [Ljava/lang/Class;

    move-result-object v6

    .line 4
    invoke-virtual {v1, v5, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    const-string v6, "addExports"

    filled-new-array {v0, v1}, [Ljava/lang/Class;

    move-result-object v0

    .line 5
    invoke-virtual {v1, v6, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const-class v1, Ljava/lang/ClassLoader;

    const-string v6, "getUnnamedModule"

    .line 6
    invoke-virtual {v1, v6, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-direct {v2, v4, v5, v0, v1}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader$Resolver$ForModuleSystem;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    .line 7
    :catch_0
    sget-object v0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader$Resolver$NoOp;->INSTANCE:Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader$Resolver$NoOp;

    return-object v0
.end method
