.class public Lcom/kongzue/dialogx/wrapper/ModuleClassLoader;
.super Ljava/lang/ClassLoader;
.source "SourceFile"


# static fields
.field private static instance:Lcom/kongzue/dialogx/wrapper/ModuleClassLoader;


# instance fields
.field private final moduleLoader:Ljava/lang/ClassLoader;


# direct methods
.method private constructor <init>(Ljava/lang/ClassLoader;)V
    .locals 0

    invoke-direct {p0, p1}, Ljava/lang/ClassLoader;-><init>(Ljava/lang/ClassLoader;)V

    iput-object p1, p0, Lcom/kongzue/dialogx/wrapper/ModuleClassLoader;->moduleLoader:Ljava/lang/ClassLoader;

    return-void
.end method

.method public static getInstance()Lcom/kongzue/dialogx/wrapper/ModuleClassLoader;
    .locals 2

    sget-object v0, Lcom/kongzue/dialogx/wrapper/ModuleClassLoader;->instance:Lcom/kongzue/dialogx/wrapper/ModuleClassLoader;

    if-nez v0, :cond_0

    new-instance v0, Lcom/kongzue/dialogx/wrapper/ModuleClassLoader;

    const-class v1, Lcom/kongzue/dialogx/wrapper/ModuleClassLoader;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/kongzue/dialogx/wrapper/ModuleClassLoader;-><init>(Ljava/lang/ClassLoader;)V

    sput-object v0, Lcom/kongzue/dialogx/wrapper/ModuleClassLoader;->instance:Lcom/kongzue/dialogx/wrapper/ModuleClassLoader;

    :cond_0
    sget-object v0, Lcom/kongzue/dialogx/wrapper/ModuleClassLoader;->instance:Lcom/kongzue/dialogx/wrapper/ModuleClassLoader;

    return-object v0
.end method


# virtual methods
.method public loadClass(Ljava/lang/String;Z)Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z)",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/kongzue/dialogx/wrapper/ModuleClassLoader;->moduleLoader:Ljava/lang/ClassLoader;

    invoke-virtual {v0, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    return-object v0

    :catchall_0
    :cond_0
    invoke-super {p0, p1, p2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;Z)Ljava/lang/Class;

    move-result-object p1

    return-object p1
.end method
