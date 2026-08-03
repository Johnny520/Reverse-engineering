.class public final LYue/ۥ۠ۢۤۧ$ۥ۟۟۟ۦ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣۣ۠ۢ;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۠ۢۤۧ$ۥ۟۟۟ۦ;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LYue/\u06e5\u06e0\u06e2\u06e3\u06e3<",
        "TT;>;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$transformWhile$1\n*L\n1#1,141:1\n120#2:142\n*E\n"
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥۣ۠ۢۤ;

.field public final synthetic ۥ۟۟۠ۤ:LYue/ۥۣۣ۠ۢ;


# direct methods
.method public constructor <init>(LYue/ۥۣ۠ۢۤ;LYue/ۥۣۣ۠ۢ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥ۠ۢۤۧ$ۥ۟۟۟ۦ$ۥ;->ۥۣ۟۟۠:LYue/ۥۣ۠ۢۤ;

    iput-object p2, p0, LYue/ۥ۠ۢۤۧ$ۥ۟۟۟ۦ$ۥ;->ۥ۟۟۠ۤ:LYue/ۥۣۣ۠ۢ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ۟۟۟۟(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 4
    .param p2    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, LYue/ۥ۠ۢۤۧ$ۥ۟۟۟ۦ$ۥ$ۥ;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LYue/ۥ۠ۢۤۧ$ۥ۟۟۟ۦ$ۥ$ۥ;

    iget v1, v0, LYue/ۥ۠ۢۤۧ$ۥ۟۟۟ۦ$ۥ$ۥ;->ۥ۟۟۠ۥ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LYue/ۥ۠ۢۤۧ$ۥ۟۟۟ۦ$ۥ$ۥ;->ۥ۟۟۠ۥ:I

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥ۠ۢۤۧ$ۥ۟۟۟ۦ$ۥ$ۥ;

    invoke-direct {v0, p0, p2}, LYue/ۥ۠ۢۤۧ$ۥ۟۟۟ۦ$ۥ$ۥ;-><init>(LYue/ۥ۠ۢۤۧ$ۥ۟۟۟ۦ$ۥ;LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    iget-object p2, v0, LYue/ۥ۠ۢۤۧ$ۥ۟۟۟ۦ$ۥ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LYue/ۥ۠ۢۤۧ$ۥ۟۟۟ۦ$ۥ$ۥ;->ۥ۟۟۠ۥ:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, LYue/ۥ۠ۢۤۧ$ۥ۟۟۟ۦ$ۥ$ۥ;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast p1, LYue/ۥ۠ۢۤۧ$ۥ۟۟۟ۦ$ۥ;

    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    iget-object p2, p0, LYue/ۥ۠ۢۤۧ$ۥ۟۟۟ۦ$ۥ;->ۥۣ۟۟۠:LYue/ۥۣ۠ۢۤ;

    iget-object v2, p0, LYue/ۥ۠ۢۤۧ$ۥ۟۟۟ۦ$ۥ;->ۥ۟۟۠ۤ:LYue/ۥۣۣ۠ۢ;

    iput-object p0, v0, LYue/ۥ۠ۢۤۧ$ۥ۟۟۟ۦ$ۥ$ۥ;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput v3, v0, LYue/ۥ۠ۢۤۧ$ۥ۟۟۟ۦ$ۥ$ۥ;->ۥ۟۟۠ۥ:I

    const/4 v3, 0x6

    invoke-static {v3}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟۟(I)V

    invoke-interface {p2, v2, p1, v0}, LYue/ۥۣ۠ۢۤ;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    const/4 p1, 0x7

    invoke-static {p1}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟۟(I)V

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p0

    :goto_1
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_4

    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1

    :cond_4
    new-instance p2, LYue/ۥ۟۟۠ۡ;

    invoke-direct {p2, p1}, LYue/ۥ۟۟۠ۡ;-><init>(LYue/ۥۣۣ۠ۢ;)V

    throw p2
.end method
