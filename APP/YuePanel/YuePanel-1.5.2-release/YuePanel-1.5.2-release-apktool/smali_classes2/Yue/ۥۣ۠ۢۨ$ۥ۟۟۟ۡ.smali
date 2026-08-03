.class public final LYue/ۥۣ۠ۢۨ$ۥ۟۟۟ۡ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۢۡ;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۣ۠ۢۨ;->ۥ۟۟۟ۤ([Ljava/lang/Object;)LYue/ۥۣ۠ۢۡ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
        "TT;>;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,112:1\n156#2:113\n157#2,2:115\n159#2:118\n13536#3:114\n13537#3:117\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n156#1:114\n156#1:117\n*E\n"
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:[Ljava/lang/Object;


# direct methods
.method public constructor <init>([Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۣ۠ۢۨ$ۥ۟۟۟ۡ;->ۥۣ۟۟۠:[Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ(LYue/ۥۣۣ۠ۢ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 7
    .param p1    # LYue/ۥۣۣ۠ۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e3<",
            "-TT;>;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, LYue/ۥۣ۠ۢۨ$ۥ۟۟۟ۡ$ۥ;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LYue/ۥۣ۠ۢۨ$ۥ۟۟۟ۡ$ۥ;

    iget v1, v0, LYue/ۥۣ۠ۢۨ$ۥ۟۟۟ۡ$ۥ;->ۥ۟۟۠ۤ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LYue/ۥۣ۠ۢۨ$ۥ۟۟۟ۡ$ۥ;->ۥ۟۟۠ۤ:I

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥۣ۠ۢۨ$ۥ۟۟۟ۡ$ۥ;

    invoke-direct {v0, p0, p2}, LYue/ۥۣ۠ۢۨ$ۥ۟۟۟ۡ$ۥ;-><init>(LYue/ۥۣ۠ۢۨ$ۥ۟۟۟ۡ;LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    iget-object p2, v0, LYue/ۥۣ۠ۢۨ$ۥ۟۟۟ۡ$ۥ;->ۥۣ۟۟۠:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LYue/ۥۣ۠ۢۨ$ۥ۟۟۟ۡ$ۥ;->ۥ۟۟۠ۤ:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget p1, v0, LYue/ۥۣ۠ۢۨ$ۥ۟۟۟ۡ$ۥ;->ۥ۟۟ۡ:I

    iget v2, v0, LYue/ۥۣ۠ۢۨ$ۥ۟۟۟ۡ$ۥ;->ۥ۟۟۠ۨ:I

    iget-object v4, v0, LYue/ۥۣ۠ۢۨ$ۥ۟۟۟ۡ$ۥ;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    check-cast v4, [Ljava/lang/Object;

    iget-object v5, v0, LYue/ۥۣ۠ۢۨ$ۥ۟۟۟ۡ$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    check-cast v5, LYue/ۥۣۣ۠ۢ;

    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    move-object p2, v5

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    iget-object p2, p0, LYue/ۥۣ۠ۢۨ$ۥ۟۟۟ۡ;->ۥۣ۟۟۠:[Ljava/lang/Object;

    array-length v2, p2

    const/4 v4, 0x0

    move-object v6, p2

    move-object p2, p1

    move p1, v2

    move v2, v4

    move-object v4, v6

    :goto_1
    if-ge v2, p1, :cond_4

    aget-object v5, v4, v2

    iput-object p2, v0, LYue/ۥۣ۠ۢۨ$ۥ۟۟۟ۡ$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    iput-object v4, v0, LYue/ۥۣ۠ۢۨ$ۥ۟۟۟ۡ$ۥ;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    iput v2, v0, LYue/ۥۣ۠ۢۨ$ۥ۟۟۟ۡ$ۥ;->ۥ۟۟۠ۨ:I

    iput p1, v0, LYue/ۥۣ۠ۢۨ$ۥ۟۟۟ۡ$ۥ;->ۥ۟۟ۡ:I

    iput v3, v0, LYue/ۥۣ۠ۢۨ$ۥ۟۟۟ۡ$ۥ;->ۥ۟۟۠ۤ:I

    invoke-interface {p2, v5, v0}, LYue/ۥۣۣ۠ۢ;->ۥ۟۟۟۟(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_3

    return-object v1

    :cond_3
    :goto_2
    add-int/2addr v2, v3

    goto :goto_1

    :cond_4
    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1
.end method
