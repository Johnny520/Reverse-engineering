.class public final LYue/ۥ۠ۨۦۣ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMainDispatchers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainDispatchers.kt\nkotlinx/coroutines/internal/MainDispatchersKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,137:1\n1#2:138\n*E\n"
.end annotation


# static fields
.field public static final ۥ:Ljava/lang/String; = "kotlinx.coroutines.fast.service.loader"
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final ۥ(Ljava/lang/Throwable;Ljava/lang/String;)LYue/ۥۡۡۡۨ;
    .locals 0

    if-eqz p0, :cond_0

    throw p0

    :cond_0
    invoke-static {}, LYue/ۥ۠ۨۦۣ;->ۥ۟۟۟۟()Ljava/lang/Void;

    new-instance p0, LYue/ۥ۠ۦۧۤ;

    invoke-direct {p0}, LYue/ۥ۠ۦۧۤ;-><init>()V

    throw p0
.end method

.method public static synthetic ۥ۟(Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)LYue/ۥۡۡۡۨ;
    .locals 1

    and-int/lit8 p3, p2, 0x1

    const/4 v0, 0x0

    if-eqz p3, :cond_0

    move-object p0, v0

    :cond_0
    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_1

    move-object p1, v0

    :cond_1
    invoke-static {p0, p1}, LYue/ۥ۠ۨۦۣ;->ۥ(Ljava/lang/Throwable;Ljava/lang/String;)LYue/ۥۡۡۡۨ;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۥ۟۟()V
    .locals 0

    return-void
.end method

.method public static final ۥ۟۟۟(LYue/ۥ۠ۨۥۥ;)Z
    .locals 0
    .param p0    # LYue/ۥ۠ۨۥۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۥۦۧ;
    .end annotation

    invoke-virtual {p0}, LYue/ۥ۠ۨۥۥ;->ۥ۟۟ۧ۟()LYue/ۥ۠ۨۥۥ;

    move-result-object p0

    instance-of p0, p0, LYue/ۥۡۡۡۨ;

    return p0
.end method

.method public static final ۥ۟۟۟۟()Ljava/lang/Void;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. \'kotlinx-coroutines-android\' and ensure it has the same version as \'kotlinx-coroutines-core\'"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final ۥ۟۟۟۠(LYue/ۥ۠ۨۦۡ;Ljava/util/List;)LYue/ۥ۠ۨۥۥ;
    .locals 0
    .param p0    # LYue/ۥ۠ۨۦۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۥۦۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e8\u06e6\u06e1;",
            "Ljava/util/List<",
            "+",
            "LYue/\u06e5\u06e0\u06e8\u06e6\u06e1;",
            ">;)",
            "LYue/\u06e5\u06e0\u06e8\u06e5\u06e5;"
        }
    .end annotation

    :try_start_0
    invoke-interface {p0, p1}, LYue/ۥ۠ۨۦۡ;->ۥ۟(Ljava/util/List;)LYue/ۥ۠ۨۥۥ;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-interface {p0}, LYue/ۥ۠ۨۦۡ;->ۥ()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, LYue/ۥ۠ۨۦۣ;->ۥ(Ljava/lang/Throwable;Ljava/lang/String;)LYue/ۥۡۡۡۨ;

    move-result-object p0

    :goto_0
    return-object p0
.end method
