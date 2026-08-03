.class public final LYue/ۥۣۡۡۤ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nDebugMetadata.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugMetadata.kt\nkotlin/coroutines/jvm/internal/ModuleNameRetriever\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۣۡۡۤ$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDebugMetadata.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugMetadata.kt\nkotlin/coroutines/jvm/internal/ModuleNameRetriever\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"
.end annotation


# static fields
.field public static final ۥ:LYue/ۥۣۡۡۤ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟:LYue/ۥۣۡۡۤ$ۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static ۥ۟۟:LYue/ۥۣۡۡۤ$ۥ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LYue/ۥۣۡۡۤ;

    invoke-direct {v0}, LYue/ۥۣۡۡۤ;-><init>()V

    sput-object v0, LYue/ۥۣۡۡۤ;->ۥ:LYue/ۥۣۡۡۤ;

    new-instance v0, LYue/ۥۣۡۡۤ$ۥ;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1, v1}, LYue/ۥۣۡۡۤ$ۥ;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    sput-object v0, LYue/ۥۣۡۡۤ;->ۥ۟:LYue/ۥۣۡۡۤ$ۥ;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ(LYue/ۥ۟ۢۥۢ;)LYue/ۥۣۡۡۤ$ۥ;
    .locals 4

    :try_start_0
    const-class v0, Ljava/lang/Class;

    const-string v1, "getModule"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    const-string v3, "java.lang.Module"

    invoke-virtual {v1, v3}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-string v3, "getDescriptor"

    invoke-virtual {v1, v3, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p1

    const-string v3, "java.lang.module.ModuleDescriptor"

    invoke-virtual {p1, v3}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    const-string v3, "name"

    invoke-virtual {p1, v3, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    new-instance v2, LYue/ۥۣۡۡۤ$ۥ;

    invoke-direct {v2, v0, v1, p1}, LYue/ۥۣۡۡۤ$ۥ;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    sput-object v2, LYue/ۥۣۡۡۤ;->ۥ۟۟:LYue/ۥۣۡۡۤ$ۥ;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    :catch_0
    sget-object p1, LYue/ۥۣۡۡۤ;->ۥ۟:LYue/ۥۣۡۡۤ$ۥ;

    sput-object p1, LYue/ۥۣۡۡۤ;->ۥ۟۟:LYue/ۥۣۡۡۤ$ۥ;

    return-object p1
.end method

.method public final ۥ۟(LYue/ۥ۟ۢۥۢ;)Ljava/lang/String;
    .locals 3
    .param p1    # LYue/ۥ۟ۢۥۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    const-string v0, "continuation"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LYue/ۥۣۡۡۤ;->ۥ۟۟:LYue/ۥۣۡۡۤ$ۥ;

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, LYue/ۥۣۡۡۤ;->ۥ(LYue/ۥ۟ۢۥۢ;)LYue/ۥۣۡۡۤ$ۥ;

    move-result-object v0

    :cond_0
    sget-object v1, LYue/ۥۣۡۡۤ;->ۥ۟:LYue/ۥۣۡۡۤ$ۥ;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    return-object v2

    :cond_1
    iget-object v1, v0, LYue/ۥۣۡۡۤ$ۥ;->ۥ:Ljava/lang/reflect/Method;

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {v1, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_2
    move-object p1, v2

    :goto_0
    if-nez p1, :cond_3

    return-object v2

    :cond_3
    iget-object v1, v0, LYue/ۥۣۡۡۤ$ۥ;->ۥ۟:Ljava/lang/reflect/Method;

    if-eqz v1, :cond_4

    invoke-virtual {v1, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_4
    move-object p1, v2

    :goto_1
    if-nez p1, :cond_5

    return-object v2

    :cond_5
    iget-object v0, v0, LYue/ۥۣۡۡۤ$ۥ;->ۥ۟۟:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_6

    invoke-virtual {v0, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_2

    :cond_6
    move-object p1, v2

    :goto_2
    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_7

    move-object v2, p1

    check-cast v2, Ljava/lang/String;

    :cond_7
    return-object v2
.end method
