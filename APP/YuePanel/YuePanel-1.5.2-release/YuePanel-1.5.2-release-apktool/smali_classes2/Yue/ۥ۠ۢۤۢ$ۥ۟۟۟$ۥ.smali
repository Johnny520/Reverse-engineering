.class public final LYue/ۥ۠ۢۤۢ$ۥ۟۟۟$ۥ;
.super LYue/ۥ۟ۧۤۤ;
.source "SourceFile"


# annotations
.annotation runtime LYue/ۥۣ۟ۨۨ;
    c = "kotlinx.coroutines.flow.FlowKt__CountKt$count$4"
    f = "Count.kt"
    i = {
        0x0
    }
    l = {
        0x1f
    }
    m = "emit"
    n = {
        "this"
    }
    s = {
        "L$0"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۠ۢۤۢ$ۥ۟۟۟;->ۥ۟۟۟۟(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public ۥۣ۟۟۠:Ljava/lang/Object;

.field public synthetic ۥ۟۟۠ۤ:Ljava/lang/Object;

.field public final synthetic ۥ۟۟۠ۥ:LYue/ۥ۠ۢۤۢ$ۥ۟۟۟;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e2\u06e4\u06e2$\u06e5\u06df\u06df\u06df<",
            "TT;>;"
        }
    .end annotation
.end field

.field public ۥ۟۟۠ۦ:I


# direct methods
.method public constructor <init>(LYue/ۥ۠ۢۤۢ$ۥ۟۟۟;LYue/ۥ۟ۧۤۢ;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e2\u06e4\u06e2$\u06e5\u06df\u06df\u06df<",
            "-TT;>;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e0\u06e2\u06e4\u06e2$\u06e5\u06df\u06df\u06df$\u06e5;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۠ۢۤۢ$ۥ۟۟۟$ۥ;->ۥ۟۟۠ۥ:LYue/ۥ۠ۢۤۢ$ۥ۟۟۟;

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

    iput-object p1, p0, LYue/ۥ۠ۢۤۢ$ۥ۟۟۟$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iget p1, p0, LYue/ۥ۠ۢۤۢ$ۥ۟۟۟$ۥ;->ۥ۟۟۠ۦ:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LYue/ۥ۠ۢۤۢ$ۥ۟۟۟$ۥ;->ۥ۟۟۠ۦ:I

    iget-object p1, p0, LYue/ۥ۠ۢۤۢ$ۥ۟۟۟$ۥ;->ۥ۟۟۠ۥ:LYue/ۥ۠ۢۤۢ$ۥ۟۟۟;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, LYue/ۥ۠ۢۤۢ$ۥ۟۟۟;->ۥ۟۟۟۟(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
