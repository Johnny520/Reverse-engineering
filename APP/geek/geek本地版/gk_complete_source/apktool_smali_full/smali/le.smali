.class public abstract Lle;
.super Ljava/lang/Object;


# static fields
.field public static final a:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-class v0, Lkotlinx/coroutines/CoroutineExceptionHandler;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v0, v1}, Ljava/util/ServiceLoader;->load(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/ServiceLoader;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/util/ServiceLoader;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "<this>"

    .line 16
    .line 17
    invoke-static {v1, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    new-instance v1, Ll20;

    .line 21
    .line 22
    invoke-direct {v1, v0}, Ll20;-><init>(Ljava/util/Iterator;)V

    .line 23
    .line 24
    .line 25
    new-instance v0, Lbc;

    .line 26
    .line 27
    invoke-direct {v0, v1}, Lbc;-><init>(Ll20;)V

    .line 28
    .line 29
    .line 30
    invoke-static {v0}, Lj20;->I(Li20;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    sput-object v0, Lle;->a:Ljava/util/List;

    .line 35
    .line 36
    return-void
.end method
