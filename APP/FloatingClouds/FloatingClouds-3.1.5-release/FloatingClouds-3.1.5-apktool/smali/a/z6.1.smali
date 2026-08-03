.class public final La/z6;
.super La/Z1;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public b:La/a2;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, La/z6;->a:I

    invoke-direct {p0}, La/Z1;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(La/B6;)I
    .locals 3

    iget v0, p0, La/z6;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La/z6;->b:La/a2;

    check-cast v0, La/pb;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, La/pb;->b(La/B6;)I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    const/4 v2, 0x7

    invoke-virtual {p1, v2}, La/B6;->i(I)V

    const/4 v2, 0x6

    invoke-virtual {p1, v2, v0}, La/B6;->a(II)V

    const/4 v0, 0x4

    invoke-virtual {p1, v0, v1}, La/B6;->a(II)V

    const/4 v0, 0x3

    invoke-virtual {p1, v0, v1}, La/B6;->a(II)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0, v1}, La/B6;->a(II)V

    invoke-virtual {p1, v1, v1}, La/B6;->a(II)V

    invoke-virtual {p1}, La/B6;->e()I

    move-result v0

    invoke-virtual {p1, v0}, La/B6;->f(I)V

    return v0

    :pswitch_0
    iget-object v0, p0, La/z6;->b:La/a2;

    check-cast v0, La/t6;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, La/t6;->b(La/B6;)I

    move-result v0

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    const/4 v2, 0x7

    invoke-virtual {p1, v2}, La/B6;->i(I)V

    const/4 v2, 0x6

    invoke-virtual {p1, v2, v0}, La/B6;->a(II)V

    const/4 v0, 0x4

    invoke-virtual {p1, v0, v1}, La/B6;->a(II)V

    const/4 v0, 0x3

    invoke-virtual {p1, v0, v1}, La/B6;->a(II)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0, v1}, La/B6;->a(II)V

    invoke-virtual {p1, v1, v1}, La/B6;->a(II)V

    invoke-virtual {p1}, La/B6;->e()I

    move-result v0

    invoke-virtual {p1, v0}, La/B6;->f(I)V

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
