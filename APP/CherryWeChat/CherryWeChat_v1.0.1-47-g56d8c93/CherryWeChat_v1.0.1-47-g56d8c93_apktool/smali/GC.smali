.class public final LGC;
.super LFb;
.source ""


# instance fields
.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:LIC;

.field public f:I


# direct methods
.method public constructor <init>(LIC;LFb;)V
    .locals 0

    iput-object p1, p0, LGC;->e:LIC;

    invoke-direct {p0, p2}, LFb;-><init>(LEb;)V

    return-void
.end method


# virtual methods
.method public final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, LGC;->d:Ljava/lang/Object;

    iget p1, p0, LGC;->f:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LGC;->f:I

    iget-object p1, p0, LGC;->e:LIC;

    invoke-static {p1, p0}, LIC;->a(LIC;LFb;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
