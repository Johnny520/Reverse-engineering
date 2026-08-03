.class public final LYue/ۥ۠ۢۤۨ$ۥ۟۟۟۟$ۥ;
.super LYue/ۥ۟ۧۤۤ;
.source "SourceFile"


# annotations
.annotation runtime LYue/ۥۣ۟ۨۨ;
    c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1"
    f = "Merge.kt"
    i = {}
    l = {
        0x50
    }
    m = "emit"
    n = {}
    s = {}
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۠ۢۤۨ$ۥ۟۟۟۟;->ۥ(LYue/ۥۣ۠ۢۡ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public synthetic ۥۣ۟۟۠:Ljava/lang/Object;

.field public final synthetic ۥ۟۟۠ۤ:LYue/ۥ۠ۢۤۨ$ۥ۟۟۟۟;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e2\u06e4\u06e8$\u06e5\u06df\u06df\u06df\u06df<",
            "TT;>;"
        }
    .end annotation
.end field

.field public ۥ۟۟۠ۥ:I


# direct methods
.method public constructor <init>(LYue/ۥ۠ۢۤۨ$ۥ۟۟۟۟;LYue/ۥ۟ۧۤۢ;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e2\u06e4\u06e8$\u06e5\u06df\u06df\u06df\u06df<",
            "-TT;>;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e0\u06e2\u06e4\u06e8$\u06e5\u06df\u06df\u06df\u06df$\u06e5;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۠ۢۤۨ$ۥ۟۟۟۟$ۥ;->ۥ۟۟۠ۤ:LYue/ۥ۠ۢۤۨ$ۥ۟۟۟۟;

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

    iput-object p1, p0, LYue/ۥ۠ۢۤۨ$ۥ۟۟۟۟$ۥ;->ۥۣ۟۟۠:Ljava/lang/Object;

    iget p1, p0, LYue/ۥ۠ۢۤۨ$ۥ۟۟۟۟$ۥ;->ۥ۟۟۠ۥ:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LYue/ۥ۠ۢۤۨ$ۥ۟۟۟۟$ۥ;->ۥ۟۟۠ۥ:I

    iget-object p1, p0, LYue/ۥ۠ۢۤۨ$ۥ۟۟۟۟$ۥ;->ۥ۟۟۠ۤ:LYue/ۥ۠ۢۤۨ$ۥ۟۟۟۟;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, LYue/ۥ۠ۢۤۨ$ۥ۟۟۟۟;->ۥ(LYue/ۥۣ۠ۢۡ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
