.class public LYue/ۥۢۥ۠ۨ;
.super Landroid/graphics/drawable/Drawable;


# instance fields
.field public final ۥ:Landroid/graphics/Paint;

.field public final ۥ۟:Ljava/lang/String;

.field public final ۥ۟۟:I

.field public final ۥ۟۟۟:I

.field public final ۥ۟۟۟۟:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x30d

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 3

    const/16 v0, 0xfa

    const/16 v1, 0xc8

    const/high16 v2, -0x3e100000    # -30.0f

    .line 1
    invoke-direct {p0, p1, v2, v0, v1}, LYue/ۥۢۥ۠ۨ;-><init>(Ljava/lang/String;FII)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;FII)V
    .locals 0

    .line 2
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 3
    iput-object p1, p0, LYue/ۥۢۥ۠ۨ;->ۥ۟:Ljava/lang/String;

    .line 4
    iput p2, p0, LYue/ۥۢۥ۠ۨ;->ۥ۟۟۟۟:F

    .line 5
    iput p3, p0, LYue/ۥۢۥ۠ۨ;->ۥ۟۟:I

    .line 6
    iput p4, p0, LYue/ۥۢۥ۠ۨ;->ۥ۟۟۟:I

    .line 7
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, LYue/ۥۢۥ۠ۨ;->ۥ:Landroid/graphics/Paint;

    const/4 p2, 0x1

    .line 8
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    const p2, -0x3f3f40

    .line 9
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    const/high16 p2, 0x42200000    # 40.0f

    .line 10
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setTextSize(F)V

    const/16 p2, 0x46

    .line 11
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setAlpha(I)V

    return-void
.end method


# virtual methods
.method public native draw(Landroid/graphics/Canvas;)V
.end method

.method public native getOpacity()I
.end method

.method public native setAlpha(I)V
.end method

.method public native setColorFilter(Landroid/graphics/ColorFilter;)V
.end method

.method public native ۥ(Landroid/view/View;)V
.end method

.method public native ۥ۟(I)V
.end method

.method public native ۥ۟۟(I)V
.end method
