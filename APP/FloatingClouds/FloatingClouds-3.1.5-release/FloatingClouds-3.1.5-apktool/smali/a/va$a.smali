.class public final La/va$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/va;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(Landroid/os/Vibrator;I)V
    .locals 8

    const/4 v0, 0x0

    const/16 v1, 0x64

    invoke-static {p1, v0, v1}, La/Oc;->C(III)I

    move-result p1

    const-wide/16 v2, 0x1e

    if-gtz p1, :cond_0

    goto :goto_0

    :cond_0
    const-wide/16 v4, 0x10e

    int-to-long v6, p1

    mul-long/2addr v6, v4

    int-to-long v0, v1

    div-long/2addr v6, v0

    add-long/2addr v2, v6

    :goto_0
    invoke-virtual {p0}, Landroid/os/Vibrator;->hasAmplitudeControl()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    if-gtz p1, :cond_1

    goto :goto_1

    :cond_1
    mul-int/lit16 v1, p1, 0xfe

    mul-int/2addr v1, p1

    div-int/lit16 v1, v1, 0x2710

    add-int/2addr v1, v0

    const/16 p1, 0xff

    invoke-static {v1, v0, p1}, La/Oc;->C(III)I

    move-result v0

    :goto_1
    invoke-static {v2, v3, v0}, Landroid/os/VibrationEffect;->createOneShot(JI)Landroid/os/VibrationEffect;

    move-result-object p1

    goto :goto_2

    :cond_2
    const/4 p1, -0x1

    invoke-static {v2, v3, p1}, Landroid/os/VibrationEffect;->createOneShot(JI)Landroid/os/VibrationEffect;

    move-result-object p1

    :goto_2
    sget-object v0, La/va;->h:Landroid/media/AudioAttributes;

    invoke-virtual {p0, p1, v0}, Landroid/os/Vibrator;->vibrate(Landroid/os/VibrationEffect;Landroid/media/AudioAttributes;)V

    return-void
.end method
