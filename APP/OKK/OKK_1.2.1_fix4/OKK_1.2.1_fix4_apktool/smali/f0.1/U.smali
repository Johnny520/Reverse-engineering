.class public final Lf0/U;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# instance fields
.field public final synthetic a:Landroid/widget/TextView;

.field public final synthetic b:Landroid/widget/SeekBar;


# direct methods
.method public constructor <init>(Landroid/widget/TextView;Landroid/widget/SeekBar;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf0/U;->a:Landroid/widget/TextView;

    iput-object p2, p0, Lf0/U;->b:Landroid/widget/SeekBar;

    return-void
.end method


# virtual methods
.method public final onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 3

    if-nez p3, :cond_0

    return-void

    :cond_0
    sget-object p1, Lc0/B1;->a:Lc0/B1;

    const/16 p1, 0x55

    const/4 p3, 0x1

    invoke-static {p2, p3, p1}, LA0/p;->p(III)I

    move-result p1

    int-to-float p1, p1

    const/high16 p2, 0x42c80000    # 100.0f

    div-float/2addr p1, p2

    invoke-static {p1}, Lc0/B1;->c(F)F

    move-result p1

    iget-object p2, p0, Lf0/U;->a:Landroid/widget/TextView;

    const/16 v0, 0x64

    int-to-float v0, v0

    mul-float/2addr v0, p1

    float-to-int v0, v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "\u4e0d\u900f\u660e\u5ea6 "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "%"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-static {p1}, Lc0/B1;->c(F)F

    move-result p1

    sput p1, Lc0/B1;->e:F

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    sput-wide v0, Lc0/B1;->c:J

    sget-object p2, Lc0/h1;->a:Lc0/h1;

    invoke-static {p1}, Lc0/B1;->d(F)Ljava/lang/String;

    move-result-object v0

    const-string v1, "theme_wallpaper_alpha"

    invoke-virtual {p2, v1, v0, p3}, Lc0/h1;->f(Ljava/lang/String;Ljava/lang/String;Z)V

    sget-object p2, Lc0/G1;->a:Ljava/lang/Object;

    invoke-static {p1}, Lc0/B1;->c(F)F

    move-result p1

    sget-object p2, Lc0/G1;->e:Landroid/os/Handler;

    new-instance p3, Lc0/C1;

    invoke-direct {p3, p1}, Lc0/C1;-><init>(F)V

    invoke-virtual {p2, p3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    return-void
.end method

.method public final onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 4

    sget-object p1, Lc0/B1;->a:Lc0/B1;

    iget-object p1, p0, Lf0/U;->b:Landroid/widget/SeekBar;

    invoke-virtual {p1}, Landroid/widget/ProgressBar;->getProgress()I

    move-result p1

    const/4 v0, 0x1

    const/16 v1, 0x55

    invoke-static {p1, v0, v1}, LA0/p;->p(III)I

    move-result p1

    int-to-float p1, p1

    const/high16 v0, 0x42c80000    # 100.0f

    div-float/2addr p1, v0

    invoke-static {p1}, Lc0/B1;->c(F)F

    move-result p1

    invoke-static {p1}, Lc0/B1;->c(F)F

    move-result p1

    sget-object v0, Lc0/h1;->a:Lc0/h1;

    invoke-static {p1}, Lc0/B1;->d(F)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const-string v3, "theme_wallpaper_alpha"

    invoke-virtual {v0, v3, v1, v2}, Lc0/h1;->f(Ljava/lang/String;Ljava/lang/String;Z)V

    sput p1, Lc0/B1;->e:F

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    sput-wide v0, Lc0/B1;->c:J

    sget-object v0, Lc0/G1;->a:Ljava/lang/Object;

    invoke-static {p1}, Lc0/B1;->c(F)F

    move-result p1

    sget-object v0, Lc0/G1;->e:Landroid/os/Handler;

    new-instance v1, Lc0/C1;

    invoke-direct {v1, p1}, Lc0/C1;-><init>(F)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
