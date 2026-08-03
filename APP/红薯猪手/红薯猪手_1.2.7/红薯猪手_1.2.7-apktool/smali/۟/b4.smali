.class public final L۟/b4;
.super L۟/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u06df/f<",
        "Landroid/widget/ImageView;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(L۟/z7;Landroid/widget/ImageView;L۟/w8;Ljava/lang/String;L۟/f0;Z)V
    .locals 6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p6

    invoke-direct/range {v0 .. v5}, L۟/f;-><init>(L۟/z7;Ljava/lang/Object;L۟/w8;Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public final ۥ()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, L۟/f;->ۥ۟ۨ:Z

    return-void
.end method

.method public final ۥ۟(Landroid/graphics/Bitmap;L۟/z7$e;)V
    .locals 7

    if-eqz p1, :cond_1

    iget-object v0, p0, L۟/f;->ۥ۟۟:L۟/f$a;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/widget/ImageView;

    if-nez v1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, L۟/f;->ۥ:L۟/z7;

    iget-object v2, v0, L۟/z7;->ۥ۟۟:Landroid/content/Context;

    iget-boolean v6, v0, L۟/z7;->ۥ۟ۧ:Z

    iget-boolean v5, p0, L۟/f;->ۥ۟۠:Z

    move-object v3, p1

    move-object v4, p2

    invoke-static/range {v1 .. v6}, L۟/a8;->ۥ۟(Landroid/widget/ImageView;Landroid/content/Context;Landroid/graphics/Bitmap;L۟/z7$e;ZZ)V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/AssertionError;

    const/4 p2, 0x1

    new-array p2, p2, [Ljava/lang/Object;

    const/4 v0, 0x0

    aput-object p0, p2, v0

    const-string v0, "Attempted to complete action with no result!\n%s"

    invoke-static {v0, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
.end method

.method public final ۥ۟۟()V
    .locals 2

    iget-object v0, p0, L۟/f;->ۥ۟۟:L۟/f$a;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget v1, p0, L۟/f;->ۥۣ۟:I

    if-eqz v1, :cond_1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    :cond_1
    iget-object v1, p0, L۟/f;->ۥ۟ۤ:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_2

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_2
    :goto_0
    return-void
.end method
