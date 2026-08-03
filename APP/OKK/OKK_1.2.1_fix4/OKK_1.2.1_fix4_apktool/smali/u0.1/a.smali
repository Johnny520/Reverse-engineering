.class public final Lu0/a;
.super Lf0/P;
.source "SourceFile"


# instance fields
.field public final b:Landroid/graphics/Typeface;

.field public final c:LD/d;

.field public d:Z


# direct methods
.method public constructor <init>(LD/d;Landroid/graphics/Typeface;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lu0/a;->b:Landroid/graphics/Typeface;

    iput-object p1, p0, Lu0/a;->c:LD/d;

    return-void
.end method


# virtual methods
.method public final M(I)V
    .locals 1

    iget-boolean p1, p0, Lu0/a;->d:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lu0/a;->c:LD/d;

    iget-object p1, p1, LD/d;->b:Ljava/lang/Object;

    check-cast p1, Ls0/b;

    iget-object v0, p0, Lu0/a;->b:Landroid/graphics/Typeface;

    invoke-virtual {p1, v0}, Ls0/b;->j(Landroid/graphics/Typeface;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ls0/b;->h(Z)V

    :cond_0
    return-void
.end method

.method public final N(Landroid/graphics/Typeface;Z)V
    .locals 0

    iget-boolean p2, p0, Lu0/a;->d:Z

    if-nez p2, :cond_0

    iget-object p2, p0, Lu0/a;->c:LD/d;

    iget-object p2, p2, LD/d;->b:Ljava/lang/Object;

    check-cast p2, Ls0/b;

    invoke-virtual {p2, p1}, Ls0/b;->j(Landroid/graphics/Typeface;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Ls0/b;->h(Z)V

    :cond_0
    return-void
.end method
