.class public final LYue/ۥ۠ۢۥۢ$ۥ۟۟۠۟$ۥ;
.super LYue/ۥۢ۠ۦ;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۢۤ;


# annotations
.annotation runtime LYue/ۥۣ۟ۨۨ;
    c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5$1"
    f = "Zip.kt"
    i = {}
    l = {
        0x14d
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۠ۢۥۢ$ۥ۟۟۠۟;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e2\u06e0\u06e6;",
        "LYue/\u06e5\u06e0\u06e3\u06e2\u06e4<",
        "LYue/\u06e5\u06e0\u06e2\u06e3\u06e3<",
        "-TR;>;[",
        "Ljava/lang/Object;",
        "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
        "-",
        "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,332:1\n221#2,8:333\n*E\n"
.end annotation


# instance fields
.field public ۥۣ۟۟۠:I

.field public synthetic ۥ۟۟۠ۤ:Ljava/lang/Object;

.field public synthetic ۥ۟۟۠ۥ:Ljava/lang/Object;

.field public final synthetic ۥ۟۟۠ۦ:LYue/ۥۣ۠ۢۨ;


# direct methods
.method public constructor <init>(LYue/ۥ۟ۧۤۢ;LYue/ۥۣ۠ۢۨ;)V
    .locals 0

    iput-object p2, p0, LYue/ۥ۠ۢۥۢ$ۥ۟۟۠۟$ۥ;->ۥ۟۟۠ۦ:LYue/ۥۣ۠ۢۨ;

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, LYue/ۥۢ۠ۦ;-><init>(ILYue/ۥ۟ۧۤۢ;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LYue/ۥ۠ۢۥۢ$ۥ۟۟۠۟$ۥ;->ۥۣ۟۟۠:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    iget-object p1, p0, LYue/ۥ۠ۢۥۢ$ۥ۟۟۠۟$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, LYue/ۥۣۣ۠ۢ;

    iget-object p1, p0, LYue/ۥ۠ۢۥۢ$ۥ۟۟۠۟$ۥ;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    check-cast p1, [Ljava/lang/Object;

    iget-object v3, p0, LYue/ۥ۠ۢۥۢ$ۥ۟۟۠۟$ۥ;->ۥ۟۟۠ۦ:LYue/ۥۣ۠ۢۨ;

    const/4 v1, 0x0

    aget-object v5, p1, v1

    aget-object v6, p1, v2

    const/4 v1, 0x2

    aget-object v7, p1, v1

    const/4 v1, 0x3

    aget-object v8, p1, v1

    const/4 v1, 0x4

    aget-object v9, p1, v1

    iput v2, p0, LYue/ۥ۠ۢۥۢ$ۥ۟۟۠۟$ۥ;->ۥۣ۟۟۠:I

    const/4 p1, 0x6

    invoke-static {p1}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟۟(I)V

    move-object v10, p0

    invoke-interface/range {v3 .. v10}, LYue/ۥۣ۠ۢۨ;->ۥۣ۟۟۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const/4 v1, 0x7

    invoke-static {v1}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟۟(I)V

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1
.end method

.method public bridge synthetic ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYue/ۥۣۣ۠ۢ;

    check-cast p2, [Ljava/lang/Object;

    check-cast p3, LYue/ۥ۟ۧۤۢ;

    invoke-virtual {p0, p1, p2, p3}, LYue/ۥ۠ۢۥۢ$ۥ۟۟۠۟$ۥ;->ۥ۟۟۠ۦ(LYue/ۥۣۣ۠ۢ;[Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟۠ۦ(LYue/ۥۣۣ۠ۢ;[Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 2
    .param p1    # LYue/ۥۣۣ۠ۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # [Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e3<",
            "-TR;>;[",
            "Ljava/lang/Object;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۠ۢۥۢ$ۥ۟۟۠۟$ۥ;

    iget-object v1, p0, LYue/ۥ۠ۢۥۢ$ۥ۟۟۠۟$ۥ;->ۥ۟۟۠ۦ:LYue/ۥۣ۠ۢۨ;

    invoke-direct {v0, p3, v1}, LYue/ۥ۠ۢۥۢ$ۥ۟۟۠۟$ۥ;-><init>(LYue/ۥ۟ۧۤۢ;LYue/ۥۣ۠ۢۨ;)V

    iput-object p1, v0, LYue/ۥ۠ۢۥۢ$ۥ۟۟۠۟$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput-object p2, v0, LYue/ۥ۠ۢۥۢ$ۥ۟۟۠۟$ۥ;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    invoke-virtual {v0, p1}, LYue/ۥ۠ۢۥۢ$ۥ۟۟۠۟$ۥ;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
