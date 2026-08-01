.class Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$2;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mr/elaris/InAppSettingsCornerTimeColorPage;->showDialog(Lcom/mr/elaris/InAppSettings;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic val$alphaLabel:Landroid/widget/TextView;

.field final synthetic val$brightnessLabel:Landroid/widget/TextView;

.field final synthetic val$hex:Landroid/widget/TextView;

.field final synthetic val$previewDark:Landroid/widget/TextView;

.field final synthetic val$previewLight:Landroid/widget/TextView;

.field final synthetic val$previewTimestamp:J

.field final synthetic val$selectedPattern:[Ljava/lang/String;

.field final synthetic val$state:Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$PickerState;


# direct methods
.method public constructor <init>(Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$PickerState;[Ljava/lang/String;JLandroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$2;->val$state:Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$PickerState;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$2;->val$selectedPattern:[Ljava/lang/String;

    .line 4
    .line 5
    iput-wide p3, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$2;->val$previewTimestamp:J

    .line 6
    .line 7
    iput-object p5, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$2;->val$previewLight:Landroid/widget/TextView;

    .line 8
    .line 9
    iput-object p6, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$2;->val$previewDark:Landroid/widget/TextView;

    .line 10
    .line 11
    iput-object p7, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$2;->val$hex:Landroid/widget/TextView;

    .line 12
    .line 13
    iput-object p8, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$2;->val$brightnessLabel:Landroid/widget/TextView;

    .line 14
    .line 15
    iput-object p9, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$2;->val$alphaLabel:Landroid/widget/TextView;

    .line 16
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$2;->val$state:Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$PickerState;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$PickerState;->color()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$2;->val$selectedPattern:[Ljava/lang/String;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    aget-object v1, v1, v2

    .line 11
    .line 12
    iget-wide v2, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$2;->val$previewTimestamp:J

    .line 13
    .line 14
    sget v4, Lg1;->a:I

    .line 15
    .line 16
    invoke-static {v2, v3, v1}, Lp2;->a(JLjava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iget-object v2, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$2;->val$previewLight:Landroid/widget/TextView;

    .line 21
    .line 22
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 23
    .line 24
    .line 25
    iget-object v2, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$2;->val$previewDark:Landroid/widget/TextView;

    .line 26
    .line 27
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$2;->val$previewLight:Landroid/widget/TextView;

    .line 31
    .line 32
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$2;->val$previewDark:Landroid/widget/TextView;

    .line 36
    .line 37
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 38
    .line 39
    .line 40
    iget-object v1, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$2;->val$hex:Landroid/widget/TextView;

    .line 41
    .line 42
    invoke-static {v0}, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage;->c(I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 47
    .line 48
    .line 49
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$2;->val$brightnessLabel:Landroid/widget/TextView;

    .line 50
    .line 51
    sget-object v1, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 52
    .line 53
    iget-object v2, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$2;->val$state:Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$PickerState;

    .line 54
    .line 55
    iget-object v2, v2, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$PickerState;->hsv:[F

    .line 56
    .line 57
    const/4 v3, 0x2

    .line 58
    aget v2, v2, v3

    .line 59
    .line 60
    const/high16 v3, 0x42c80000    # 100.0f

    .line 61
    .line 62
    mul-float/2addr v2, v3

    .line 63
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    const-string v4, "\u4eae\u5ea6 %d%%"

    .line 76
    .line 77
    invoke-static {v1, v4, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 82
    .line 83
    .line 84
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$2;->val$alphaLabel:Landroid/widget/TextView;

    .line 85
    .line 86
    iget-object p0, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$2;->val$state:Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$PickerState;

    .line 87
    .line 88
    iget p0, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$PickerState;->alpha:I

    .line 89
    .line 90
    int-to-float p0, p0

    .line 91
    mul-float/2addr p0, v3

    .line 92
    const/high16 v2, 0x437f0000    # 255.0f

    .line 93
    .line 94
    div-float/2addr p0, v2

    .line 95
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 96
    .line 97
    .line 98
    move-result p0

    .line 99
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    const-string v2, "\u900f\u660e\u5ea6 %d%%"

    .line 108
    .line 109
    invoke-static {v1, v2, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 114
    .line 115
    .line 116
    return-void
.end method
