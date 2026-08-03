.class public final LLs;
.super LFb;
.source ""


# instance fields
.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:LNs;

.field public f:I


# direct methods
.method public constructor <init>(LNs;LFb;)V
    .locals 0

    iput-object p1, p0, LLs;->e:LNs;

    invoke-direct {p0, p2}, LFb;-><init>(LEb;)V

    return-void
.end method


# virtual methods
.method public final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iput-object p1, p0, LLs;->d:Ljava/lang/Object;

    iget p1, p0, LLs;->f:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LLs;->f:I

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    iget-object v0, p0, LLs;->e:LNs;

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v6, p0

    invoke-virtual/range {v0 .. v6}, LNs;->b(Ljava/lang/String;Ljava/lang/String;JLfj;LFb;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
