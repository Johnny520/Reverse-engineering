.class public final LYue/ۥۣۢ۠۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nStateFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,430:1\n1#2:431\n*E\n"
.end annotation


# static fields
.field public static final ۥ:LYue/ۥۢ۠ۦۢ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟:LYue/ۥۢ۠ۦۢ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LYue/ۥۢ۠ۦۢ;

    const-string v1, "NONE"

    invoke-direct {v0, v1}, LYue/ۥۢ۠ۦۢ;-><init>(Ljava/lang/String;)V

    sput-object v0, LYue/ۥۣۢ۠۟;->ۥ:LYue/ۥۢ۠ۦۢ;

    new-instance v0, LYue/ۥۢ۠ۦۢ;

    const-string v1, "PENDING"

    invoke-direct {v0, v1}, LYue/ۥۢ۠ۦۢ;-><init>(Ljava/lang/String;)V

    sput-object v0, LYue/ۥۣۢ۠۟;->ۥ۟:LYue/ۥۢ۠ۦۢ;

    return-void
.end method

.method public static final ۥ(Ljava/lang/Object;)LYue/ۥۡۡۧۦ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "LYue/\u06e5\u06e1\u06e1\u06e7\u06e6<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, LYue/ۥۢ۠۟ۢ;

    if-nez p0, :cond_0

    sget-object p0, LYue/ۥۡۢۧ;->ۥ:LYue/ۥۢ۠ۦۢ;

    :cond_0
    invoke-direct {v0, p0}, LYue/ۥۢ۠۟ۢ;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static final synthetic ۥ۟()LYue/ۥۢ۠ۦۢ;
    .locals 1

    sget-object v0, LYue/ۥۣۢ۠۟;->ۥ:LYue/ۥۢ۠ۦۢ;

    return-object v0
.end method

.method public static final synthetic ۥ۟۟()LYue/ۥۢ۠ۦۢ;
    .locals 1

    sget-object v0, LYue/ۥۣۢ۠۟;->ۥ۟:LYue/ۥۢ۠ۦۢ;

    return-object v0
.end method

.method public static final ۥ۟۟۟(LYue/ۥۢ۠۟ۡ;LYue/ۥ۟ۧۦۥ;ILYue/ۥۣۣ۟;)LYue/ۥۣ۠ۢۡ;
    .locals 1
    .param p0    # LYue/ۥۢ۠۟ۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥۣۣ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e2\u06e0\u06df\u06e1<",
            "+TT;>;",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;",
            "I",
            "LYue/\u06e5\u06df\u06e3\u06e3;",
            ")",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TT;>;"
        }
    .end annotation

    if-ltz p2, :cond_0

    const/4 v0, 0x2

    if-ge p2, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, -0x2

    if-ne p2, v0, :cond_1

    :goto_0
    sget-object v0, LYue/ۥۣۣ۟;->ۥ۟۟۠ۤ:LYue/ۥۣۣ۟;

    if-ne p3, v0, :cond_1

    return-object p0

    :cond_1
    invoke-static {p0, p1, p2, p3}, LYue/ۥۡۨۨۢ;->ۥ۟۟۟۟(LYue/ۥۡۨۨ۠;LYue/ۥ۟ۧۦۥ;ILYue/ۥۣۣ۟;)LYue/ۥۣ۠ۢۡ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۟۟(LYue/ۥۡۡۧۦ;LYue/ۥۣ۠ۡ۟;)Ljava/lang/Object;
    .locals 2
    .param p0    # LYue/ۥۡۡۧۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e1\u06e1\u06e7\u06e6<",
            "TT;>;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-TT;+TT;>;)TT;"
        }
    .end annotation

    :cond_0
    invoke-interface {p0}, LYue/ۥۡۡۧۦ;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p0, v0, v1}, LYue/ۥۡۡۧۦ;->ۥ۟۟۟ۦ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0
.end method

.method public static synthetic ۥ۟۟۟۠()V
    .locals 0

    return-void
.end method

.method public static synthetic ۥ۟۟۟ۡ()V
    .locals 0

    return-void
.end method

.method public static final ۥ۟۟۟ۢ(LYue/ۥۡۡۧۦ;LYue/ۥۣ۠ۡ۟;)V
    .locals 2
    .param p0    # LYue/ۥۡۡۧۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e1\u06e1\u06e7\u06e6<",
            "TT;>;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-TT;+TT;>;)V"
        }
    .end annotation

    :cond_0
    invoke-interface {p0}, LYue/ۥۡۡۧۦ;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p0, v0, v1}, LYue/ۥۡۡۧۦ;->ۥ۟۟۟ۦ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void
.end method

.method public static final ۥۣ۟۟۟(LYue/ۥۡۡۧۦ;LYue/ۥۣ۠ۡ۟;)Ljava/lang/Object;
    .locals 2
    .param p0    # LYue/ۥۡۡۧۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e1\u06e1\u06e7\u06e6<",
            "TT;>;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-TT;+TT;>;)TT;"
        }
    .end annotation

    :cond_0
    invoke-interface {p0}, LYue/ۥۡۡۧۦ;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p0, v0, v1}, LYue/ۥۡۡۧۦ;->ۥ۟۟۟ۦ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object v1
.end method
