.class public final La/J2;
.super La/a2;
.source "SourceFile"


# instance fields
.field public final a:Landroid/graphics/Typeface;

.field public final b:La/R0;

.field public c:Z


# direct methods
.method public constructor <init>(La/R0;Landroid/graphics/Typeface;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, La/J2;->a:Landroid/graphics/Typeface;

    iput-object p1, p0, La/J2;->b:La/R0;

    return-void
.end method


# virtual methods
.method public final d(I)V
    .locals 1

    iget-boolean p1, p0, La/J2;->c:Z

    if-nez p1, :cond_0

    iget-object p1, p0, La/J2;->b:La/R0;

    iget-object p1, p1, La/R0;->a:Ljava/lang/Object;

    check-cast p1, La/n3;

    iget-object v0, p0, La/J2;->a:Landroid/graphics/Typeface;

    invoke-virtual {p1, v0}, La/n3;->j(Landroid/graphics/Typeface;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, La/n3;->h(Z)V

    :cond_0
    return-void
.end method

.method public final e(Landroid/graphics/Typeface;Z)V
    .locals 0

    iget-boolean p2, p0, La/J2;->c:Z

    if-nez p2, :cond_0

    iget-object p2, p0, La/J2;->b:La/R0;

    iget-object p2, p2, La/R0;->a:Ljava/lang/Object;

    check-cast p2, La/n3;

    invoke-virtual {p2, p1}, La/n3;->j(Landroid/graphics/Typeface;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, La/n3;->h(Z)V

    :cond_0
    return-void
.end method
