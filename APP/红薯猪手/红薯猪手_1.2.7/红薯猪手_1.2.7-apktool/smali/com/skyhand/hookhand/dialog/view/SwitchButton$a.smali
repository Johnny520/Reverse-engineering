.class public final Lcom/skyhand/hookhand/dialog/view/SwitchButton$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/skyhand/hookhand/dialog/view/SwitchButton;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥ:Lcom/skyhand/hookhand/dialog/view/SwitchButton;


# direct methods
.method public constructor <init>(Lcom/skyhand/hookhand/dialog/view/SwitchButton;)V
    .locals 0

    iput-object p1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton$a;->ۥ:Lcom/skyhand/hookhand/dialog/view/SwitchButton;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton$a;->ۥ:Lcom/skyhand/hookhand/dialog/view/SwitchButton;

    .line 2
    .line 3
    sget v1, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۣ۠:I

    .line 4
    .line 5
    iget v1, v0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۧ:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    move v4, v3

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v4, v2

    .line 14
    :goto_0
    if-nez v4, :cond_6

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    move v2, v3

    .line 19
    :cond_1
    if-eqz v2, :cond_2

    .line 20
    .line 21
    goto :goto_2

    .line 22
    :cond_2
    iget-boolean v1, v0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۣۢ:Z

    .line 23
    .line 24
    if-nez v1, :cond_3

    .line 25
    .line 26
    goto :goto_2

    .line 27
    :cond_3
    iget-object v1, v0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۨ:Landroid/animation/ValueAnimator;

    .line 28
    .line 29
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->isRunning()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_4

    .line 34
    .line 35
    iget-object v1, v0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۨ:Landroid/animation/ValueAnimator;

    .line 36
    .line 37
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->cancel()V

    .line 38
    .line 39
    .line 40
    :cond_4
    iput v3, v0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۧ:I

    .line 41
    .line 42
    iget-object v1, v0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۥ:Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;

    .line 43
    .line 44
    iget-object v2, v0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۤ:Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;

    .line 45
    .line 46
    invoke-static {v1, v2}, Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;->ۥ(Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;)V

    .line 47
    .line 48
    .line 49
    iget-object v1, v0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۦ:Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;

    .line 50
    .line 51
    iget-object v2, v0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۤ:Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;

    .line 52
    .line 53
    invoke-static {v1, v2}, Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;->ۥ(Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->isChecked()Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_5

    .line 61
    .line 62
    iget-object v1, v0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۦ:Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;

    .line 63
    .line 64
    iget v2, v0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۠:I

    .line 65
    .line 66
    iput v2, v1, Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;->ۥ۟:I

    .line 67
    .line 68
    iget v3, v0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۡ:F

    .line 69
    .line 70
    iput v3, v1, Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;->ۥ:F

    .line 71
    .line 72
    iput v2, v1, Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;->ۥ۟۟:I

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_5
    iget-object v1, v0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۦ:Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;

    .line 76
    .line 77
    iget v2, v0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟ۨ:I

    .line 78
    .line 79
    iput v2, v1, Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;->ۥ۟:I

    .line 80
    .line 81
    iget v2, v0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡ۠:F

    .line 82
    .line 83
    iput v2, v1, Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;->ۥ:F

    .line 84
    .line 85
    iget v2, v0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟۠:F

    .line 86
    .line 87
    iput v2, v1, Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;->ۥ۟۠:F

    .line 88
    .line 89
    :goto_1
    iget-object v0, v0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۨ:Landroid/animation/ValueAnimator;

    .line 90
    .line 91
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 92
    .line 93
    .line 94
    :cond_6
    :goto_2
    return-void
.end method
