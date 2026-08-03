.class public final L۟/h8$b;
.super L۟/h8$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = L۟/h8;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic ۥ۟:L۟/h8;


# direct methods
.method public constructor <init>(L۟/h8;)V
    .locals 0

    iput-object p1, p0, L۟/h8$b;->ۥ۟:L۟/h8;

    invoke-direct {p0, p1}, L۟/h8$a;-><init>(L۟/h8;)V

    return-void
.end method


# virtual methods
.method public final ۥ(Landroid/graphics/Canvas;)V
    .locals 2

    iget-object v0, p0, L۟/h8$b;->ۥ۟:L۟/h8;

    iget-boolean v1, v0, L۟/h8;->ۥۣ۟:Z

    iget-object v0, v0, L۟/h8;->ۥ۟ۡ:Landroid/graphics/Paint;

    if-eqz v1, :cond_0

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    goto :goto_0

    :cond_0
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    :goto_0
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    invoke-super {p0, p1}, L۟/h8$a;->ۥ(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public final ۥ۟(Landroid/graphics/Canvas;)V
    .locals 2

    iget-object v0, p0, L۟/h8$b;->ۥ۟:L۟/h8;

    iget-boolean v1, v0, L۟/h8;->ۥۣ۟:Z

    if-eqz v1, :cond_0

    iget-object v1, v0, L۟/h8;->ۥ۟ۡ:Landroid/graphics/Paint;

    iget-object v0, v0, L۟/h8;->ۥ۟ۨ:Landroid/graphics/PorterDuffXfermode;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    invoke-super {p0, p1}, L۟/h8$a;->ۥ۟(Landroid/graphics/Canvas;)V

    iget-object p1, p0, L۟/h8$b;->ۥ۟:L۟/h8;

    iget-object p1, p1, L۟/h8;->ۥ۟ۡ:Landroid/graphics/Paint;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    :cond_0
    return-void
.end method

.method public final ۥ۟۟(Landroid/graphics/Canvas;)V
    .locals 2

    iget-object v0, p0, L۟/h8$b;->ۥ۟:L۟/h8;

    iget-boolean v1, v0, L۟/h8;->ۥۣ۟:Z

    iget-object v0, v0, L۟/h8;->ۥ۟ۡ:Landroid/graphics/Paint;

    if-eqz v1, :cond_0

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    goto :goto_0

    :cond_0
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    :goto_0
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    invoke-super {p0, p1}, L۟/h8$a;->ۥ۟۟(Landroid/graphics/Canvas;)V

    return-void
.end method
