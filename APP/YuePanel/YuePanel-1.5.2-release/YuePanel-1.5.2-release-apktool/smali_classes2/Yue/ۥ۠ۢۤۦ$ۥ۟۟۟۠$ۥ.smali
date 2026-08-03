.class public final LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۠$ۥ;
.super LYue/ۥ۟ۧۤۤ;
.source "SourceFile"


# annotations
.annotation runtime LYue/ۥۣ۟ۨۨ;
    c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1"
    f = "Errors.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x1,
        0x1,
        0x1,
        0x1
    }
    l = {
        0x75,
        0x77
    }
    m = "collect"
    n = {
        "this",
        "$this$retryWhen_u24lambda_u2d2",
        "attempt",
        "shallRetry",
        "this",
        "$this$retryWhen_u24lambda_u2d2",
        "cause",
        "attempt"
    }
    s = {
        "L$0",
        "L$1",
        "J$0",
        "I$0",
        "L$0",
        "L$1",
        "L$2",
        "J$0"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۠;->ۥ(LYue/ۥۣۣ۠ۢ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,112:1\n*E\n"
.end annotation


# instance fields
.field public synthetic ۥۣ۟۟۠:Ljava/lang/Object;

.field public ۥ۟۟۠ۤ:I

.field public final synthetic ۥ۟۟۠ۥ:LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۠;

.field public ۥ۟۟۠ۦ:Ljava/lang/Object;

.field public ۥ۟۟۠ۧ:Ljava/lang/Object;

.field public ۥ۟۟۠ۨ:Ljava/lang/Object;

.field public ۥ۟۟ۡ:J

.field public ۥ۟۟ۡ۟:I


# direct methods
.method public constructor <init>(LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۠;LYue/ۥ۟ۧۤۢ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۠;

    invoke-direct {p0, p2}, LYue/ۥ۟ۧۤۤ;-><init>(LYue/ۥ۟ۧۤۢ;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iput-object p1, p0, LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۠$ۥ;->ۥۣ۟۟۠:Ljava/lang/Object;

    iget p1, p0, LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۠$ۥ;->ۥ۟۟۠ۤ:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۠$ۥ;->ۥ۟۟۠ۤ:I

    iget-object p1, p0, LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۠;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, LYue/ۥ۠ۢۤۦ$ۥ۟۟۟۠;->ۥ(LYue/ۥۣۣ۠ۢ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
