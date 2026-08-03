.class public final Lmp;
.super LFb;
.source ""


# instance fields
.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Lnp;

.field public f:I


# direct methods
.method public constructor <init>(Lnp;LFb;)V
    .locals 0

    iput-object p1, p0, Lmp;->e:Lnp;

    invoke-direct {p0, p2}, LFb;-><init>(LEb;)V

    return-void
.end method


# virtual methods
.method public final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lmp;->d:Ljava/lang/Object;

    iget p1, p0, Lmp;->f:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lmp;->f:I

    iget-object p1, p0, Lmp;->e:Lnp;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lnp;->a(Lnp;Ljava/lang/String;LFb;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
