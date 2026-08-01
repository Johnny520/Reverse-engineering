.class public abstract Lc0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ld0/b;

.field public static b:Ld0/b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lc0/c;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const-class v1, Lc0/c;

    .line 7
    .line 8
    invoke-static {v1}, Ljava/lang/reflect/Proxy;->isProxyClass(Ljava/lang/Class;)Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const-class v2, Ld0/b;

    .line 19
    .line 20
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    new-instance v3, Lc0/d;

    .line 25
    .line 26
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object v0, v3, Lc0/d;->a:Lc0/c;

    .line 30
    .line 31
    invoke-static {v1, v2, v3}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Ld0/b;

    .line 36
    .line 37
    :cond_0
    sput-object v0, Lc0/e;->a:Ld0/b;

    .line 38
    .line 39
    sput-object v0, Lc0/e;->b:Ld0/b;

    .line 40
    .line 41
    return-void
.end method
