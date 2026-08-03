.class public final LYue/ۥۢۡۡۦ;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ۥ:LYue/ۥۢ۠ۦۢ;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟:LYue/ۥۣ۠ۢۢ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "Ljava/lang/Object;",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5$\u06e5\u06df;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static final ۥ۟۟:LYue/ۥۣ۠ۢۢ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "LYue/\u06e5\u06e2\u06e1\u06e1\u06e4<",
            "*>;",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5$\u06e5\u06df;",
            "LYue/\u06e5\u06e2\u06e1\u06e1\u06e4<",
            "*>;>;"
        }
    .end annotation
.end field

.field public static final ۥ۟۟۟:LYue/ۥۣ۠ۢۢ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "LYue/\u06e5\u06e2\u06e1\u06e2\u06e4;",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5$\u06e5\u06df;",
            "LYue/\u06e5\u06e2\u06e1\u06e2\u06e4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LYue/ۥۢ۠ۦۢ;

    const-string v1, "NO_THREAD_ELEMENTS"

    invoke-direct {v0, v1}, LYue/ۥۢ۠ۦۢ;-><init>(Ljava/lang/String;)V

    sput-object v0, LYue/ۥۢۡۡۦ;->ۥ:LYue/ۥۢ۠ۦۢ;

    sget-object v0, LYue/ۥۢۡۡۦ$ۥ;->ۥۣ۟۟۠:LYue/ۥۢۡۡۦ$ۥ;

    sput-object v0, LYue/ۥۢۡۡۦ;->ۥ۟:LYue/ۥۣ۠ۢۢ;

    sget-object v0, LYue/ۥۢۡۡۦ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۢۡۡۦ$ۥ۟;

    sput-object v0, LYue/ۥۢۡۡۦ;->ۥ۟۟:LYue/ۥۣ۠ۢۢ;

    sget-object v0, LYue/ۥۢۡۡۦ$ۥ۟۟;->ۥۣ۟۟۠:LYue/ۥۢۡۡۦ$ۥ۟۟;

    sput-object v0, LYue/ۥۢۡۡۦ;->ۥ۟۟۟:LYue/ۥۣ۠ۢۢ;

    return-void
.end method

.method public static final ۥ(LYue/ۥ۟ۧۦۥ;Ljava/lang/Object;)V
    .locals 2
    .param p0    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    sget-object v0, LYue/ۥۢۡۡۦ;->ۥ:LYue/ۥۢ۠ۦۢ;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    instance-of v0, p1, LYue/ۥۢۡۢۤ;

    if-eqz v0, :cond_1

    check-cast p1, LYue/ۥۢۡۢۤ;

    invoke-virtual {p1, p0}, LYue/ۥۢۡۢۤ;->ۥ۟(LYue/ۥ۟ۧۦۥ;)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    sget-object v1, LYue/ۥۢۡۡۦ;->ۥ۟۟:LYue/ۥۣ۠ۢۢ;

    invoke-interface {p0, v0, v1}, LYue/ۥ۟ۧۦۥ;->fold(Ljava/lang/Object;LYue/ۥۣ۠ۢۢ;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    check-cast v0, LYue/ۥۢۡۡۤ;

    invoke-interface {v0, p0, p1}, LYue/ۥۢۡۡۤ;->ۥ۟۟ۢۨ(LYue/ۥ۟ۧۦۥ;Ljava/lang/Object;)V

    :goto_0
    return-void

    :cond_2
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final ۥ۟(LYue/ۥ۟ۧۦۥ;)Ljava/lang/Object;
    .locals 2
    .param p0    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, LYue/ۥۢۡۡۦ;->ۥ۟:LYue/ۥۣ۠ۢۢ;

    invoke-interface {p0, v0, v1}, LYue/ۥ۟ۧۦۥ;->fold(Ljava/lang/Object;LYue/ۥۣ۠ۢۢ;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    return-object p0
.end method

.method public static final ۥ۟۟(LYue/ۥ۟ۧۦۥ;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p0    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    if-nez p1, :cond_0

    invoke-static {p0}, LYue/ۥۢۡۡۦ;->ۥ۟(LYue/ۥ۟ۧۦۥ;)Ljava/lang/Object;

    move-result-object p1

    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    if-ne p1, v0, :cond_1

    sget-object p0, LYue/ۥۢۡۡۦ;->ۥ:LYue/ۥۢ۠ۦۢ;

    goto :goto_0

    :cond_1
    instance-of v0, p1, Ljava/lang/Integer;

    if-eqz v0, :cond_2

    new-instance v0, LYue/ۥۢۡۢۤ;

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-direct {v0, p0, p1}, LYue/ۥۢۡۢۤ;-><init>(LYue/ۥ۟ۧۦۥ;I)V

    sget-object p1, LYue/ۥۢۡۡۦ;->ۥ۟۟۟:LYue/ۥۣ۠ۢۢ;

    invoke-interface {p0, v0, p1}, LYue/ۥ۟ۧۦۥ;->fold(Ljava/lang/Object;LYue/ۥۣ۠ۢۢ;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_0

    :cond_2
    check-cast p1, LYue/ۥۢۡۡۤ;

    invoke-interface {p1, p0}, LYue/ۥۢۡۡۤ;->ۥ۟۟ۡۦ(LYue/ۥ۟ۧۦۥ;)Ljava/lang/Object;

    move-result-object p0

    :goto_0
    return-object p0
.end method
