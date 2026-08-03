.class public final LYue/ۥۣ۟ۦۨ$ۥ;
.super LYue/ۥ۟ۧۤۤ;
.source "SourceFile"


# annotations
.annotation runtime LYue/ۥۣ۟ۨۨ;
    c = "kotlinx.coroutines.flow.CallbackFlowBuilder"
    f = "Builders.kt"
    i = {
        0x0
    }
    l = {
        0x150
    }
    m = "collectTo"
    n = {
        "scope"
    }
    s = {
        "L$0"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۣ۟ۦۨ;->ۥ۟۟۟ۡ(LYue/ۥۡۥۡۤ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public ۥۣ۟۟۠:Ljava/lang/Object;

.field public synthetic ۥ۟۟۠ۤ:Ljava/lang/Object;

.field public final synthetic ۥ۟۟۠ۥ:LYue/ۥۣ۟ۦۨ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06df\u06e3\u06e6\u06e8<",
            "TT;>;"
        }
    .end annotation
.end field

.field public ۥ۟۟۠ۦ:I


# direct methods
.method public constructor <init>(LYue/ۥۣ۟ۦۨ;LYue/ۥ۟ۧۤۢ;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e3\u06e6\u06e8<",
            "TT;>;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06df\u06e3\u06e6\u06e8$\u06e5;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۣ۟ۦۨ$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۣ۟ۦۨ;

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

    iput-object p1, p0, LYue/ۥۣ۟ۦۨ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iget p1, p0, LYue/ۥۣ۟ۦۨ$ۥ;->ۥ۟۟۠ۦ:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LYue/ۥۣ۟ۦۨ$ۥ;->ۥ۟۟۠ۦ:I

    iget-object p1, p0, LYue/ۥۣ۟ۦۨ$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۣ۟ۦۨ;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, LYue/ۥۣ۟ۦۨ;->ۥ۟۟۟ۡ(LYue/ۥۡۥۡۤ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
