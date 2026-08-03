.class public final La/e2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/e2$a;,
        La/e2$b;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "La/N3;",
            ">;"
        }
    .end annotation
.end field

.field public final b:La/e2$a;

.field public final c:La/O3;


# direct methods
.method public constructor <init>(La/O3;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, La/e2;->a:Ljava/util/ArrayList;

    new-instance v0, La/e2$a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, La/e2;->b:La/e2$a;

    iput-object p1, p0, La/e2;->c:La/O3;

    return-void
.end method


# virtual methods
.method public final a(La/e2$b;La/N3;Z)Z
    .locals 7

    iget-object v0, p2, La/N3;->J:[La/N3$a;

    const/4 v1, 0x0

    aget-object v2, v0, v1

    iget-object v3, p0, La/e2;->b:La/e2$a;

    iput-object v2, v3, La/e2$a;->a:La/N3$a;

    const/4 v2, 0x1

    aget-object v0, v0, v2

    iput-object v0, v3, La/e2$a;->b:La/N3$a;

    invoke-virtual {p2}, La/N3;->l()I

    move-result v0

    iput v0, v3, La/e2$a;->c:I

    invoke-virtual {p2}, La/N3;->i()I

    move-result v0

    iput v0, v3, La/e2$a;->d:I

    iput-boolean v1, v3, La/e2$a;->i:Z

    iput-boolean p3, v3, La/e2$a;->j:Z

    iget-object p3, v3, La/e2$a;->a:La/N3$a;

    sget-object v0, La/N3$a;->c:La/N3$a;

    if-ne p3, v0, :cond_0

    move p3, v2

    goto :goto_0

    :cond_0
    move p3, v1

    :goto_0
    iget-object v4, v3, La/e2$a;->b:La/N3$a;

    if-ne v4, v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    const/4 v4, 0x0

    if-eqz p3, :cond_2

    iget p3, p2, La/N3;->N:F

    cmpl-float p3, p3, v4

    if-lez p3, :cond_2

    move p3, v2

    goto :goto_2

    :cond_2
    move p3, v1

    :goto_2
    if-eqz v0, :cond_3

    iget v0, p2, La/N3;->N:F

    cmpl-float v0, v0, v4

    if-lez v0, :cond_3

    move v0, v2

    goto :goto_3

    :cond_3
    move v0, v1

    :goto_3
    sget-object v4, La/N3$a;->a:La/N3$a;

    iget-object v5, p2, La/N3;->l:[I

    const/4 v6, 0x4

    if-eqz p3, :cond_4

    aget p3, v5, v1

    if-ne p3, v6, :cond_4

    iput-object v4, v3, La/e2$a;->a:La/N3$a;

    :cond_4
    if-eqz v0, :cond_5

    aget p3, v5, v2

    if-ne p3, v6, :cond_5

    iput-object v4, v3, La/e2$a;->b:La/N3$a;

    :cond_5
    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout$b;

    invoke-virtual {p1, p2, v3}, Landroidx/constraintlayout/widget/ConstraintLayout$b;->a(La/N3;La/e2$a;)V

    iget p1, v3, La/e2$a;->e:I

    invoke-virtual {p2, p1}, La/N3;->y(I)V

    iget p1, v3, La/e2$a;->f:I

    invoke-virtual {p2, p1}, La/N3;->v(I)V

    iget-boolean p1, v3, La/e2$a;->h:Z

    iput-boolean p1, p2, La/N3;->w:Z

    iget p1, v3, La/e2$a;->g:I

    iput p1, p2, La/N3;->R:I

    if-lez p1, :cond_6

    goto :goto_4

    :cond_6
    move v2, v1

    :goto_4
    iput-boolean v2, p2, La/N3;->w:Z

    iput-boolean v1, v3, La/e2$a;->j:Z

    iget-boolean p1, v3, La/e2$a;->i:Z

    return p1
.end method

.method public final b(La/O3;II)V
    .locals 3

    iget v0, p1, La/N3;->S:I

    iget v1, p1, La/N3;->T:I

    const/4 v2, 0x0

    iput v2, p1, La/N3;->S:I

    iput v2, p1, La/N3;->T:I

    invoke-virtual {p1, p2}, La/N3;->y(I)V

    invoke-virtual {p1, p3}, La/N3;->v(I)V

    if-gez v0, :cond_0

    iput v2, p1, La/N3;->S:I

    goto :goto_0

    :cond_0
    iput v0, p1, La/N3;->S:I

    :goto_0
    if-gez v1, :cond_1

    iput v2, p1, La/N3;->T:I

    goto :goto_1

    :cond_1
    iput v1, p1, La/N3;->T:I

    :goto_1
    iget-object p1, p0, La/e2;->c:La/O3;

    invoke-virtual {p1}, La/O3;->B()V

    return-void
.end method
