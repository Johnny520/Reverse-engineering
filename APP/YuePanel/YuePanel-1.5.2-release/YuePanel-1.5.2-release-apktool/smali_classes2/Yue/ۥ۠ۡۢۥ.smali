.class public final LYue/ۥ۠ۡۢۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nExceptionsConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExceptionsConstructor.kt\nkotlinx/coroutines/internal/ExceptionsConstructorKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,110:1\n70#1:113\n70#1:114\n70#1:115\n70#1:116\n1#2:111\n6516#3:112\n12861#3,3:117\n*S KotlinDebug\n*F\n+ 1 ExceptionsConstructor.kt\nkotlinx/coroutines/internal/ExceptionsConstructorKt\n*L\n54#1:113\n59#1:114\n61#1:115\n64#1:116\n41#1:112\n76#1:117,3\n*E\n"
.end annotation


# static fields
.field public static final ۥ:I

.field public static final ۥ۟:LYue/ۥ۟ۧۨۦ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Ljava/lang/Throwable;

    const/4 v1, -0x1

    invoke-static {v0, v1}, LYue/ۥ۠ۡۢۥ;->ۥ۟۟۟۠(Ljava/lang/Class;I)I

    move-result v0

    sput v0, LYue/ۥ۠ۡۢۥ;->ۥ:I

    :try_start_0
    invoke-static {}, LYue/ۥ۠ۡۦۨ;->ۥ()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, LYue/ۥۢۥۡ;->ۥ:LYue/ۥۢۥۡ;

    goto :goto_0

    :cond_0
    sget-object v0, LYue/ۥ۟ۤۧۤ;->ۥ:LYue/ۥ۟ۤۧۤ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    sget-object v0, LYue/ۥۢۥۡ;->ۥ:LYue/ۥۢۥۡ;

    :goto_0
    sput-object v0, LYue/ۥ۠ۡۢۥ;->ۥ۟:LYue/ۥ۟ۧۨۦ;

    return-void
.end method

.method public static final synthetic ۥ(Ljava/lang/Class;)LYue/ۥۣ۠ۡ۟;
    .locals 0

    invoke-static {p0}, LYue/ۥ۠ۡۢۥ;->ۥ۟(Ljava/lang/Class;)LYue/ۥۣ۠ۡ۟;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟(Ljava/lang/Class;)LYue/ۥۣ۠ۡ۟;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Throwable;",
            ">(",
            "Ljava/lang/Class<",
            "TE;>;)",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "Ljava/lang/Throwable;",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation

    sget-object v0, LYue/ۥ۠ۡۢۥ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥ۠ۡۢۥ$ۥ۟;

    sget v1, LYue/ۥ۠ۡۢۥ;->ۥ:I

    const/4 v2, 0x0

    invoke-static {p0, v2}, LYue/ۥ۠ۡۢۥ;->ۥ۟۟۟۠(Ljava/lang/Class;I)I

    move-result v2

    if-eq v1, v2, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getConstructors()[Ljava/lang/reflect/Constructor;

    move-result-object p0

    new-instance v1, LYue/ۥ۠ۡۢۥ$ۥ;

    invoke-direct {v1}, LYue/ۥ۠ۡۢۥ$ۥ;-><init>()V

    invoke-static {p0, v1}, LYue/ۥ۟ۢ۟۠;->ۥ۠ۤۡۧ([Ljava/lang/Object;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/reflect/Constructor;

    invoke-static {v1}, LYue/ۥ۠ۡۢۥ;->ۥ۟۟(Ljava/lang/reflect/Constructor;)LYue/ۥۣ۠ۡ۟;

    move-result-object v1

    if-eqz v1, :cond_1

    return-object v1

    :cond_2
    return-object v0
.end method

.method public static final ۥ۟۟(Ljava/lang/reflect/Constructor;)LYue/ۥۣ۠ۡ۟;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Constructor<",
            "*>;)",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "Ljava/lang/Throwable;",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v0

    array-length v1, v0

    if-eqz v1, :cond_3

    const-class v2, Ljava/lang/Throwable;

    const-class v3, Ljava/lang/String;

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eq v1, v5, :cond_1

    const/4 v7, 0x2

    if-eq v1, v7, :cond_0

    goto :goto_0

    :cond_0
    aget-object v1, v0, v4

    invoke-static {v1, v3}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    aget-object v0, v0, v5

    invoke-static {v0, v2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    new-instance v6, LYue/ۥ۠ۡۢۥ$ۥ۟۟;

    invoke-direct {v6, p0}, LYue/ۥ۠ۡۢۥ$ۥ۟۟;-><init>(Ljava/lang/reflect/Constructor;)V

    goto :goto_0

    :cond_1
    aget-object v0, v0, v4

    invoke-static {v0, v2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v6, LYue/ۥ۠ۡۢۥ$ۥ۟۟۟;

    invoke-direct {v6, p0}, LYue/ۥ۠ۡۢۥ$ۥ۟۟۟;-><init>(Ljava/lang/reflect/Constructor;)V

    goto :goto_0

    :cond_2
    invoke-static {v0, v3}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    new-instance v6, LYue/ۥ۠ۡۢۥ$ۥ۟۟۟۟;

    invoke-direct {v6, p0}, LYue/ۥ۠ۡۢۥ$ۥ۟۟۟۟;-><init>(Ljava/lang/reflect/Constructor;)V

    goto :goto_0

    :cond_3
    new-instance v6, LYue/ۥ۠ۡۢۥ$ۥ۟۟۟۠;

    invoke-direct {v6, p0}, LYue/ۥ۠ۡۢۥ$ۥ۟۟۟۠;-><init>(Ljava/lang/reflect/Constructor;)V

    :cond_4
    :goto_0
    return-object v6
.end method

.method public static final ۥ۟۟۟(Ljava/lang/Class;I)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;I)I"
        }
    .end annotation

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v4, v0, v2

    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v4

    invoke-static {v4}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v4

    xor-int/lit8 v4, v4, 0x1

    if-eqz v4, :cond_1

    add-int/lit8 v3, v3, 0x1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    add-int/2addr p1, v3

    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object p0

    if-nez p0, :cond_0

    return p1
.end method

.method public static synthetic ۥ۟۟۟۟(Ljava/lang/Class;IILjava/lang/Object;)I
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, LYue/ۥ۠ۡۢۥ;->ۥ۟۟۟(Ljava/lang/Class;I)I

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟۟۠(Ljava/lang/Class;I)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;I)I"
        }
    .end annotation

    invoke-static {p0}, LYue/ۥ۠ۦۣ۠;->ۥۣ۟۟۟(Ljava/lang/Class;)LYue/ۥ۠ۦۢۢ;

    :try_start_0
    sget-object v0, LYue/ۥۡۦۧۤ;->ۥ۟۟۠ۤ:LYue/ۥۡۦۧۤ$ۥ;

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v1}, LYue/ۥ۠ۡۢۥ;->ۥ۟۟۟۟(Ljava/lang/Class;IILjava/lang/Object;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-static {p0}, LYue/ۥۡۦۧۤ;->ۥ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    sget-object v0, LYue/ۥۡۦۧۤ;->ۥ۟۟۠ۤ:LYue/ۥۡۦۧۤ$ۥ;

    invoke-static {p0}, LYue/ۥۡۦۧۥ;->ۥ(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, LYue/ۥۡۦۧۤ;->ۥ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p0}, LYue/ۥۡۦۧۤ;->ۥۣ۟۟۟(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move-object p0, p1

    :cond_0
    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟۟ۡ(LYue/ۥۣ۠ۡ۟;)LYue/ۥۣ۠ۡ۟;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "Ljava/lang/Throwable;",
            "+",
            "Ljava/lang/Throwable;",
            ">;)",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "Ljava/lang/Throwable;",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۠ۡۢۥ$ۥ۟۟۟ۡ;

    invoke-direct {v0, p0}, LYue/ۥ۠ۡۢۥ$ۥ۟۟۟ۡ;-><init>(LYue/ۥۣ۠ۡ۟;)V

    return-object v0
.end method

.method public static final ۥ۟۟۟ۢ(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    .locals 2
    .param p0    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Throwable;",
            ">(TE;)TE;"
        }
    .end annotation

    instance-of v0, p0, LYue/ۥ۟ۧۦۤ;

    if-eqz v0, :cond_1

    :try_start_0
    sget-object v0, LYue/ۥۡۦۧۤ;->ۥ۟۟۠ۤ:LYue/ۥۡۦۧۤ$ۥ;

    check-cast p0, LYue/ۥ۟ۧۦۤ;

    invoke-interface {p0}, LYue/ۥ۟ۧۦۤ;->ۥ()Ljava/lang/Throwable;

    move-result-object p0

    invoke-static {p0}, LYue/ۥۡۦۧۤ;->ۥ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    sget-object v0, LYue/ۥۡۦۧۤ;->ۥ۟۟۠ۤ:LYue/ۥۡۦۧۤ$ۥ;

    invoke-static {p0}, LYue/ۥۡۦۧۥ;->ۥ(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, LYue/ۥۡۦۧۤ;->ۥ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    :goto_0
    invoke-static {p0}, LYue/ۥۡۦۧۤ;->ۥۣ۟۟۟(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    :cond_0
    check-cast p0, Ljava/lang/Throwable;

    return-object p0

    :cond_1
    sget-object v0, LYue/ۥ۠ۡۢۥ;->ۥ۟:LYue/ۥ۟ۧۨۦ;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, LYue/ۥ۟ۧۨۦ;->ۥ(Ljava/lang/Class;)LYue/ۥۣ۠ۡ۟;

    move-result-object v0

    invoke-interface {v0, p0}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Throwable;

    return-object p0
.end method
