.class final Lj/n;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/util/BitSet;

.field private final b:Lj/o;

.field private c:I

.field private final d:Lj/o;

.field private e:Z


# direct methods
.method constructor <init>(Lj/o;Ljava/util/BitSet;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj/n;->b:Lj/o;

    iput-object p2, p0, Lj/n;->a:Ljava/util/BitSet;

    const/4 p2, 0x0

    iput p2, p0, Lj/n;->c:I

    new-instance p2, Lj/o;

    invoke-virtual {p1}, Ln/e;->B()I

    move-result p1

    invoke-direct {p2, p1}, Lj/o;-><init>(I)V

    iput-object p2, p0, Lj/n;->d:Lj/o;

    iput-boolean p3, p0, Lj/n;->e:Z

    return-void
.end method

.method static a(Lj/n;I)V
    .locals 4

    iget-object v0, p0, Lj/n;->b:Lj/o;

    invoke-static {v0, p1}, Lj/o;->F(Lj/o;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj/m;

    const/4 v1, 0x0

    iget-object v2, p0, Lj/n;->a:Ljava/util/BitSet;

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v2, p1}, Ljava/util/BitSet;->get(I)Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    if-eqz v2, :cond_2

    iget v2, p0, Lj/n;->c:I

    invoke-virtual {v0, v2}, Lj/m;->r(I)Lj/m;

    move-result-object v0

    iget-boolean v2, p0, Lj/n;->e:Z

    if-nez v2, :cond_2

    iget v2, p0, Lj/n;->c:I

    invoke-virtual {v0}, Lj/m;->g()I

    move-result v3

    add-int/2addr v3, v2

    iput v3, p0, Lj/n;->c:I

    :cond_2
    iput-boolean v1, p0, Lj/n;->e:Z

    iget-object p0, p0, Lj/n;->d:Lj/o;

    invoke-static {p0, p1, v0}, Lj/o;->G(Lj/o;ILj/m;)V

    return-void
.end method

.method static b(Lj/n;)Lj/o;
    .locals 1

    iget-object v0, p0, Lj/n;->b:Lj/o;

    invoke-virtual {v0}, Ln/j;->e()Z

    move-result v0

    iget-object p0, p0, Lj/n;->d:Lj/o;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ln/j;->g()V

    :cond_0
    return-object p0
.end method
