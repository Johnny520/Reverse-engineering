.class public abstract Lcom/example/dyhelper/hook/panel/BaseIconView;
.super Landroid/view/View;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final ε:Landroid/graphics/Paint;

.field public final ζ:Landroid/graphics/Path;

.field public η:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 5
    .line 6
    .line 7
    new-instance p1, Landroid/graphics/Paint;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-direct {p1, v0}, Landroid/graphics/Paint;-><init>(I)V

    .line 11
    .line 12
    .line 13
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 16
    .line 17
    .line 18
    sget-object v0, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 21
    .line 22
    .line 23
    sget-object v0, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lcom/example/dyhelper/hook/panel/BaseIconView;->ε:Landroid/graphics/Paint;

    .line 29
    .line 30
    new-instance p1, Landroid/graphics/Path;

    .line 31
    .line 32
    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Lcom/example/dyhelper/hook/panel/BaseIconView;->ζ:Landroid/graphics/Path;

    .line 36
    .line 37
    const p1, -0xe9e7dd

    .line 38
    .line 39
    .line 40
    iput p1, p0, Lcom/example/dyhelper/hook/panel/BaseIconView;->η:I

    .line 41
    .line 42
    return-void
.end method


# virtual methods
.method public final getIconColor()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/example/dyhelper/hook/panel/BaseIconView;->η:I

    .line 2
    .line 3
    return p0
.end method

.method public final getPaint()Landroid/graphics/Paint;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/panel/BaseIconView;->ε:Landroid/graphics/Paint;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getPath()Landroid/graphics/Path;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/panel/BaseIconView;->ζ:Landroid/graphics/Path;

    .line 2
    .line 3
    return-object p0
.end method

.method public final setIconColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/example/dyhelper/hook/panel/BaseIconView;->η:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
