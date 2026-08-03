.class public final La/oc;
.super La/a2;
.source "SourceFile"


# instance fields
.field public a:La/e3;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, La/a2;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(La/B6;)I
    .locals 3

    iget-object v0, p0, La/oc;->a:La/e3;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, La/e3;->b(La/B6;)I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    const/4 v2, 0x2

    invoke-virtual {p1, v2}, La/B6;->i(I)V

    const/4 v2, 0x1

    invoke-virtual {p1, v2, v0}, La/B6;->a(II)V

    invoke-virtual {p1, v1, v1}, La/B6;->a(II)V

    invoke-virtual {p1}, La/B6;->e()I

    move-result v0

    invoke-virtual {p1, v0}, La/B6;->f(I)V

    return v0
.end method
