.class public final Lf0/T;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# instance fields
.field public final synthetic a:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf0/T;->a:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public final onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 0

    sget-object p1, Lf0/V;->a:Lf0/V;

    sget-object p1, Lc0/v1;->b:Lc0/x1;

    const/4 p1, 0x0

    const/16 p3, 0x2d

    invoke-static {p2, p1, p3}, LA0/p;->p(III)I

    move-result p1

    int-to-float p1, p1

    const/high16 p2, 0x42c80000    # 100.0f

    div-float/2addr p1, p2

    const p2, 0x3d4ccccd    # 0.05f

    add-float/2addr p1, p2

    const/high16 p3, 0x3f000000    # 0.5f

    invoke-static {p1, p2, p3}, LA0/p;->o(FFF)F

    move-result p1

    invoke-static {p1}, Lf0/V;->e(F)Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Lf0/T;->a:Landroid/widget/TextView;

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    return-void
.end method

.method public final onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    return-void
.end method
