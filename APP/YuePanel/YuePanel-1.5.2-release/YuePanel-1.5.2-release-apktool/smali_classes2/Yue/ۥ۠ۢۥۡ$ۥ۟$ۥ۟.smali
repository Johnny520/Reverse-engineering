.class public final LYue/ۥ۠ۢۥۡ$ۥ۟$ۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣۣ۠ۢ;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۠ۢۥۡ$ۥ۟;->ۥ(LYue/ۥۣۣ۠ۢ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LYue/\u06e5\u06e0\u06e2\u06e3\u06e3;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,222:1\n21#2:223\n35#2:224\n22#2:225\n*E\n"
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥۣۣ۠ۢ;


# direct methods
.method public constructor <init>(LYue/ۥۣۣ۠ۢ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥ۠ۢۥۡ$ۥ۟$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۣۣ۠ۢ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 3
    .param p2    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    const/4 v0, 0x4

    invoke-static {v0}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟۟(I)V

    new-instance v0, LYue/ۥ۠ۢۥۡ$ۥ۟$ۥ۟$ۥ;

    invoke-direct {v0, p0, p2}, LYue/ۥ۠ۢۥۡ$ۥ۟$ۥ۟$ۥ;-><init>(LYue/ۥ۠ۢۥۡ$ۥ۟$ۥ۟;LYue/ۥ۟ۧۤۢ;)V

    const/4 v0, 0x5

    invoke-static {v0}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟۟(I)V

    iget-object v0, p0, LYue/ۥ۠ۢۥۡ$ۥ۟$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۣۣ۠ۢ;

    const/4 v1, 0x3

    const-string v2, "R"

    invoke-static {v1, v2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠ۨ(ILjava/lang/String;)V

    instance-of v1, p1, Ljava/lang/Object;

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    invoke-static {v1}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟۟(I)V

    invoke-interface {v0, p1, p2}, LYue/ۥۣۣ۠ۢ;->ۥ۟۟۟۟(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-static {p1}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟۟(I)V

    :cond_0
    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1
.end method

.method public final ۥ۟۟۟۟(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 5
    .param p2    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    instance-of v0, p2, LYue/ۥ۠ۢۥۡ$ۥ۟$ۥ۟$ۥ;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LYue/ۥ۠ۢۥۡ$ۥ۟$ۥ۟$ۥ;

    iget v1, v0, LYue/ۥ۠ۢۥۡ$ۥ۟$ۥ۟$ۥ;->ۥ۟۟۠ۤ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LYue/ۥ۠ۢۥۡ$ۥ۟$ۥ۟$ۥ;->ۥ۟۟۠ۤ:I

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥ۠ۢۥۡ$ۥ۟$ۥ۟$ۥ;

    invoke-direct {v0, p0, p2}, LYue/ۥ۠ۢۥۡ$ۥ۟$ۥ۟$ۥ;-><init>(LYue/ۥ۠ۢۥۡ$ۥ۟$ۥ۟;LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    iget-object p2, v0, LYue/ۥ۠ۢۥۡ$ۥ۟$ۥ۟$ۥ;->ۥۣ۟۟۠:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LYue/ۥ۠ۢۥۡ$ۥ۟$ۥ۟$ۥ;->ۥ۟۟۠ۤ:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    iget-object p2, p0, LYue/ۥ۠ۢۥۡ$ۥ۟$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۣۣ۠ۢ;

    const/4 v2, 0x3

    const-string v4, "R"

    invoke-static {v2, v4}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠ۨ(ILjava/lang/String;)V

    instance-of v2, p1, Ljava/lang/Object;

    if-eqz v2, :cond_3

    iput v3, v0, LYue/ۥ۠ۢۥۡ$ۥ۟$ۥ۟$ۥ;->ۥ۟۟۠ۤ:I

    invoke-interface {p2, p1, v0}, LYue/ۥۣۣ۠ۢ;->ۥ۟۟۟۟(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1
.end method
