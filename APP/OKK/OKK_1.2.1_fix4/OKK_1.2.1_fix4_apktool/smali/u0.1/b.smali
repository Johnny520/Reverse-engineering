.class public final Lu0/b;
.super Lu/b;
.source "SourceFile"


# instance fields
.field public final synthetic e:Lf0/P;

.field public final synthetic f:Lu0/d;


# direct methods
.method public constructor <init>(Lu0/d;Lf0/P;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu0/b;->f:Lu0/d;

    iput-object p2, p0, Lu0/b;->e:Lf0/P;

    return-void
.end method


# virtual methods
.method public final f(I)V
    .locals 2

    iget-object v0, p0, Lu0/b;->f:Lu0/d;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lu0/d;->m:Z

    iget-object v0, p0, Lu0/b;->e:Lf0/P;

    invoke-virtual {v0, p1}, Lf0/P;->M(I)V

    return-void
.end method

.method public final g(Landroid/graphics/Typeface;)V
    .locals 2

    iget-object v0, p0, Lu0/b;->f:Lu0/d;

    iget v1, v0, Lu0/d;->c:I

    invoke-static {p1, v1}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p1

    iput-object p1, v0, Lu0/d;->n:Landroid/graphics/Typeface;

    const/4 p1, 0x1

    iput-boolean p1, v0, Lu0/d;->m:Z

    iget-object p1, v0, Lu0/d;->n:Landroid/graphics/Typeface;

    const/4 v0, 0x0

    iget-object v1, p0, Lu0/b;->e:Lf0/P;

    invoke-virtual {v1, p1, v0}, Lf0/P;->N(Landroid/graphics/Typeface;Z)V

    return-void
.end method
