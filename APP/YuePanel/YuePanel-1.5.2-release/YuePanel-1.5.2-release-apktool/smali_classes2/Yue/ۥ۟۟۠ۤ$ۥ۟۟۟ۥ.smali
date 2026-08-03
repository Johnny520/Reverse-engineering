.class public final LYue/ۥ۟۟۠ۤ$ۥ۟۟۟ۥ;
.super LYue/ۥ۟ۧۤۤ;
.source "SourceFile"


# annotations
.annotation runtime LYue/ۥۣ۟ۨۨ;
    c = "kotlinx.coroutines.channels.AbstractChannel"
    f = "AbstractChannel.kt"
    i = {}
    l = {
        0x279
    }
    m = "receiveCatching-JP2dKIU"
    n = {}
    s = {}
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۟۟۠ۤ;->ۥ۟۟۠ۧ(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public synthetic ۥۣ۟۟۠:Ljava/lang/Object;

.field public final synthetic ۥ۟۟۠ۤ:LYue/ۥ۟۟۠ۤ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06df\u06df\u06e0\u06e4<",
            "TE;>;"
        }
    .end annotation
.end field

.field public ۥ۟۟۠ۥ:I


# direct methods
.method public constructor <init>(LYue/ۥ۟۟۠ۤ;LYue/ۥ۟ۧۤۢ;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06df\u06e0\u06e4<",
            "TE;>;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06df\u06df\u06e0\u06e4$\u06e5\u06df\u06df\u06df\u06e5;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۟۟۠ۤ$ۥ۟۟۟ۥ;->ۥ۟۟۠ۤ:LYue/ۥ۟۟۠ۤ;

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

    iput-object p1, p0, LYue/ۥ۟۟۠ۤ$ۥ۟۟۟ۥ;->ۥۣ۟۟۠:Ljava/lang/Object;

    iget p1, p0, LYue/ۥ۟۟۠ۤ$ۥ۟۟۟ۥ;->ۥ۟۟۠ۥ:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LYue/ۥ۟۟۠ۤ$ۥ۟۟۟ۥ;->ۥ۟۟۠ۥ:I

    iget-object p1, p0, LYue/ۥ۟۟۠ۤ$ۥ۟۟۟ۥ;->ۥ۟۟۠ۤ:LYue/ۥ۟۟۠ۤ;

    invoke-virtual {p1, p0}, LYue/ۥ۟۟۠ۤ;->ۥ۟۟۠ۧ(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    invoke-static {p1}, LYue/ۥ۟ۤۢ۟;->ۥ۟(Ljava/lang/Object;)LYue/ۥ۟ۤۢ۟;

    move-result-object p1

    return-object p1
.end method
