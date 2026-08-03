.class public La/Yg;
.super La/f8;
.source "SourceFile"


# instance fields
.field public g0:I

.field public h0:I

.field public i0:I

.field public j0:I

.field public k0:I

.field public l0:I

.field public m0:Z

.field public n0:I

.field public o0:I

.field public final p0:La/e2$a;

.field public q0:La/e2$b;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, La/f8;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, La/Yg;->g0:I

    iput v0, p0, La/Yg;->h0:I

    iput v0, p0, La/Yg;->i0:I

    iput v0, p0, La/Yg;->j0:I

    iput v0, p0, La/Yg;->k0:I

    iput v0, p0, La/Yg;->l0:I

    iput-boolean v0, p0, La/Yg;->m0:Z

    iput v0, p0, La/Yg;->n0:I

    iput v0, p0, La/Yg;->o0:I

    new-instance v0, La/e2$a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, La/Yg;->p0:La/e2$a;

    const/4 v0, 0x0

    iput-object v0, p0, La/Yg;->q0:La/e2$b;

    return-void
.end method


# virtual methods
.method public final B()V
    .locals 2

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, La/f8;->f0:I

    if-ge v0, v1, :cond_0

    iget-object v1, p0, La/f8;->e0:[La/N3;

    aget-object v1, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public C(IIII)V
    .locals 0

    return-void
.end method

.method public final D(La/N3;La/N3$a;ILa/N3$a;I)V
    .locals 2

    :goto_0
    iget-object v0, p0, La/Yg;->q0:La/e2$b;

    if-nez v0, :cond_0

    iget-object v1, p0, La/N3;->K:La/N3;

    if-eqz v1, :cond_0

    check-cast v1, La/O3;

    iget-object v0, v1, La/O3;->h0:La/e2$b;

    iput-object v0, p0, La/Yg;->q0:La/e2$b;

    goto :goto_0

    :cond_0
    iget-object v1, p0, La/Yg;->p0:La/e2$a;

    iput-object p2, v1, La/e2$a;->a:La/N3$a;

    iput-object p4, v1, La/e2$a;->b:La/N3$a;

    iput p3, v1, La/e2$a;->c:I

    iput p5, v1, La/e2$a;->d:I

    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout$b;

    invoke-virtual {v0, p1, v1}, Landroidx/constraintlayout/widget/ConstraintLayout$b;->a(La/N3;La/e2$a;)V

    iget p2, v1, La/e2$a;->e:I

    invoke-virtual {p1, p2}, La/N3;->y(I)V

    iget p2, v1, La/e2$a;->f:I

    invoke-virtual {p1, p2}, La/N3;->v(I)V

    iget-boolean p2, v1, La/e2$a;->h:Z

    iput-boolean p2, p1, La/N3;->w:Z

    iget p2, v1, La/e2$a;->g:I

    iput p2, p1, La/N3;->R:I

    if-lez p2, :cond_1

    const/4 p2, 0x1

    goto :goto_1

    :cond_1
    const/4 p2, 0x0

    :goto_1
    iput-boolean p2, p1, La/N3;->w:Z

    return-void
.end method
