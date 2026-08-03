.class public LYue/ۥۡۡۥۣ$ۥ۟۟۟ۢ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۡۥۣ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u06e5\u06df\u06df\u06df\u06e2"
.end annotation


# instance fields
.field public ۥ:F

.field public ۥ۟:F

.field public ۥ۟۟:I

.field public ۥ۟۟۟:I

.field public final ۥ۟۟۟۟:Ljava/lang/String;

.field public final ۥ۟۟۟۠:Ljava/lang/String;

.field public final ۥ۟۟۟ۡ:Ljava/lang/String;

.field public final ۥ۟۟۟ۢ:Ljava/lang/String;

.field public final synthetic ۥۣ۟۟۟:LYue/ۥۡۡۥۣ;


# direct methods
.method public constructor <init>(LYue/ۥۡۡۥۣ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۢ;->ۥۣ۟۟۟:LYue/ۥۡۡۥۣ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 p1, 0x7fc00000    # Float.NaN

    iput p1, p0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۢ;->ۥ:F

    iput p1, p0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۢ;->ۥ۟:F

    const/4 p1, -0x1

    iput p1, p0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۢ;->ۥ۟۟:I

    iput p1, p0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۢ;->ۥ۟۟۟:I

    const-string p1, "motion.progress"

    iput-object p1, p0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۢ;->ۥ۟۟۟۟:Ljava/lang/String;

    const-string p1, "motion.velocity"

    iput-object p1, p0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۢ;->ۥ۟۟۟۠:Ljava/lang/String;

    const-string p1, "motion.StartState"

    iput-object p1, p0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۢ;->ۥ۟۟۟ۡ:Ljava/lang/String;

    const-string p1, "motion.EndState"

    iput-object p1, p0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۢ;->ۥ۟۟۟ۢ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public ۥ()V
    .locals 4

    iget v0, p0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۢ;->ۥ۟۟:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    iget v2, p0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۢ;->ۥ۟۟۟:I

    if-eq v2, v1, :cond_3

    :cond_0
    if-ne v0, v1, :cond_1

    iget-object v0, p0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۢ;->ۥۣ۟۟۟:LYue/ۥۡۡۥۣ;

    iget v2, p0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۢ;->ۥ۟۟۟:I

    invoke-virtual {v0, v2}, LYue/ۥۡۡۥۣ;->ۥۣ۟۟ۤ(I)V

    goto :goto_0

    :cond_1
    iget v2, p0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۢ;->ۥ۟۟۟:I

    if-ne v2, v1, :cond_2

    iget-object v2, p0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۢ;->ۥۣ۟۟۟:LYue/ۥۡۡۥۣ;

    invoke-virtual {v2, v0, v1, v1}, LYue/ۥۡۡۥۣ;->setState(III)V

    goto :goto_0

    :cond_2
    iget-object v3, p0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۢ;->ۥۣ۟۟۟:LYue/ۥۡۡۥۣ;

    invoke-virtual {v3, v0, v2}, LYue/ۥۡۡۥۣ;->ۥ۟۟ۤ(II)V

    :goto_0
    iget-object v0, p0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۢ;->ۥۣ۟۟۟:LYue/ۥۡۡۥۣ;

    sget-object v2, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۤ;->ۥ۟۟۠ۤ:LYue/ۥۡۡۥۣ$ۥ۟۟۟ۤ;

    invoke-virtual {v0, v2}, LYue/ۥۡۡۥۣ;->setState(LYue/ۥۡۡۥۣ$ۥ۟۟۟ۤ;)V

    :cond_3
    iget v0, p0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۢ;->ۥ۟:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_5

    iget v0, p0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۢ;->ۥ:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_4

    return-void

    :cond_4
    iget-object v0, p0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۢ;->ۥۣ۟۟۟:LYue/ۥۡۡۥۣ;

    iget v1, p0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۢ;->ۥ:F

    invoke-virtual {v0, v1}, LYue/ۥۡۡۥۣ;->setProgress(F)V

    return-void

    :cond_5
    iget-object v0, p0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۢ;->ۥۣ۟۟۟:LYue/ۥۡۡۥۣ;

    iget v2, p0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۢ;->ۥ:F

    iget v3, p0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۢ;->ۥ۟:F

    invoke-virtual {v0, v2, v3}, LYue/ۥۡۡۥۣ;->ۥۣ۟۟ۨ(FF)V

    const/high16 v0, 0x7fc00000    # Float.NaN

    iput v0, p0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۢ;->ۥ:F

    iput v0, p0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۢ;->ۥ۟:F

    iput v1, p0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۢ;->ۥ۟۟:I

    iput v1, p0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۢ;->ۥ۟۟۟:I

    return-void
.end method

.method public ۥ۟()Landroid/os/Bundle;
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "motion.progress"

    iget v2, p0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۢ;->ۥ:F

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    const-string v1, "motion.velocity"

    iget v2, p0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۢ;->ۥ۟:F

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    const-string v1, "motion.StartState"

    iget v2, p0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۢ;->ۥ۟۟:I

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "motion.EndState"

    iget v2, p0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۢ;->ۥ۟۟۟:I

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    return-object v0
.end method

.method public ۥ۟۟()V
    .locals 1

    iget-object v0, p0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۢ;->ۥۣ۟۟۟:LYue/ۥۡۡۥۣ;

    invoke-static {v0}, LYue/ۥۡۡۥۣ;->ۥ۟۟۟۠(LYue/ۥۡۡۥۣ;)I

    move-result v0

    iput v0, p0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۢ;->ۥ۟۟۟:I

    iget-object v0, p0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۢ;->ۥۣ۟۟۟:LYue/ۥۡۡۥۣ;

    invoke-static {v0}, LYue/ۥۡۡۥۣ;->ۥ۟۟۟ۡ(LYue/ۥۡۡۥۣ;)I

    move-result v0

    iput v0, p0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۢ;->ۥ۟۟:I

    iget-object v0, p0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۢ;->ۥۣ۟۟۟:LYue/ۥۡۡۥۣ;

    invoke-virtual {v0}, LYue/ۥۡۡۥۣ;->getVelocity()F

    move-result v0

    iput v0, p0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۢ;->ۥ۟:F

    iget-object v0, p0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۢ;->ۥۣ۟۟۟:LYue/ۥۡۡۥۣ;

    invoke-virtual {v0}, LYue/ۥۡۡۥۣ;->getProgress()F

    move-result v0

    iput v0, p0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۢ;->ۥ:F

    return-void
.end method

.method public ۥ۟۟۟(I)V
    .locals 0

    iput p1, p0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۢ;->ۥ۟۟۟:I

    return-void
.end method

.method public ۥ۟۟۟۟(F)V
    .locals 0

    iput p1, p0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۢ;->ۥ:F

    return-void
.end method

.method public ۥ۟۟۟۠(I)V
    .locals 0

    iput p1, p0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۢ;->ۥ۟۟:I

    return-void
.end method

.method public ۥ۟۟۟ۡ(Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "motion.progress"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v0

    iput v0, p0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۢ;->ۥ:F

    const-string v0, "motion.velocity"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v0

    iput v0, p0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۢ;->ۥ۟:F

    const-string v0, "motion.StartState"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۢ;->ۥ۟۟:I

    const-string v0, "motion.EndState"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۢ;->ۥ۟۟۟:I

    return-void
.end method

.method public ۥ۟۟۟ۢ(F)V
    .locals 0

    iput p1, p0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۢ;->ۥ۟:F

    return-void
.end method
