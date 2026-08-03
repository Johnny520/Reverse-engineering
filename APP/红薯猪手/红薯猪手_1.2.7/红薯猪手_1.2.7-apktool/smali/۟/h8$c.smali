.class public final L۟/h8$c;
.super L۟/h8$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = L۟/h8;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public final synthetic ۥ۟:L۟/h8;


# direct methods
.method public constructor <init>(L۟/h8;)V
    .locals 0

    iput-object p1, p0, L۟/h8$c;->ۥ۟:L۟/h8;

    invoke-direct {p0, p1}, L۟/h8$a;-><init>(L۟/h8;)V

    return-void
.end method


# virtual methods
.method public final ۥ(Landroid/graphics/Canvas;)V
    .locals 2

    iget-object v0, p0, L۟/h8$c;->ۥ۟:L۟/h8;

    iget-object v0, v0, L۟/h8;->ۥ۟ۡ:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    invoke-super {p0, p1}, L۟/h8$a;->ۥ(Landroid/graphics/Canvas;)V

    return-void
.end method
