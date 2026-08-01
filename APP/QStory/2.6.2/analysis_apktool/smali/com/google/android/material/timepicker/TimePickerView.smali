.class Lcom/google/android/material/timepicker/TimePickerView;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final synthetic 飘花落叶言子世苏哲兰楪:I


# instance fields
.field public final 飘花落叶言子世苏哲楪兰:Lcom/google/android/material/timepicker/ClockHandView;

.field public final 飘花落叶言子世苏楪兰哲:Lcom/google/android/material/chip/Chip;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    .line 4
    .line 5
    new-instance p2, Lcom/google/android/material/timepicker/飘花落叶言子楪哲世苏兰;

    .line 6
    .line 7
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const v0, 0x240c00b6

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v0, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    const p1, 0x240901ef

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lcom/google/android/material/timepicker/ClockFaceView;

    .line 28
    .line 29
    const v0, 0x240901f4

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Lcom/google/android/material/button/MaterialButtonToggleGroup;

    .line 37
    .line 38
    new-instance v1, Lcom/google/android/material/timepicker/飘花落叶言子楪苏兰世哲;

    .line 39
    .line 40
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, Lcom/google/android/material/button/MaterialButtonToggleGroup;->addOnButtonCheckedListener(Lcom/google/android/material/button/飘花落叶言子楪苏哲兰世;)V

    .line 44
    .line 45
    .line 46
    const v0, 0x240901f9

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, Lcom/google/android/material/chip/Chip;

    .line 54
    .line 55
    const v1, 0x240901f6

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    check-cast v1, Lcom/google/android/material/chip/Chip;

    .line 63
    .line 64
    iput-object v1, p0, Lcom/google/android/material/timepicker/TimePickerView;->飘花落叶言子世苏楪兰哲:Lcom/google/android/material/chip/Chip;

    .line 65
    .line 66
    const v2, 0x240901f0

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    check-cast v2, Lcom/google/android/material/timepicker/ClockHandView;

    .line 74
    .line 75
    iput-object v2, p0, Lcom/google/android/material/timepicker/TimePickerView;->飘花落叶言子世苏哲楪兰:Lcom/google/android/material/timepicker/ClockHandView;

    .line 76
    .line 77
    new-instance v2, Lcom/google/android/material/timepicker/飘花落叶言子楪苏兰哲世;

    .line 78
    .line 79
    invoke-direct {v2, p0}, Lcom/google/android/material/timepicker/飘花落叶言子楪苏兰哲世;-><init>(Lcom/google/android/material/timepicker/TimePickerView;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1, v2}, Lcom/google/android/material/timepicker/ClockFaceView;->setOnEnterKeyPressedListener(Lcom/google/android/material/timepicker/飘花落叶言子楪世哲苏兰;)V

    .line 83
    .line 84
    .line 85
    new-instance p1, Landroid/view/GestureDetector;

    .line 86
    .line 87
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    new-instance v2, Lcom/google/android/material/timepicker/飘花落叶言子楪哲世兰苏;

    .line 92
    .line 93
    invoke-direct {v2}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    .line 94
    .line 95
    .line 96
    invoke-direct {p1, p0, v2}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    .line 97
    .line 98
    .line 99
    new-instance p0, Landroidx/appcompat/widget/飘花落叶言子哲苏世兰楪;

    .line 100
    .line 101
    const/4 v2, 0x1

    .line 102
    invoke-direct {p0, p1, v2}, Landroidx/appcompat/widget/飘花落叶言子哲苏世兰楪;-><init>(Ljava/lang/Object;I)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, p0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1, p0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 109
    .line 110
    .line 111
    const/16 p0, 0xc

    .line 112
    .line 113
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    const p1, 0x240902ea

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, p1, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    const/16 p0, 0xa

    .line 124
    .line 125
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    invoke-virtual {v1, p1, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 136
    .line 137
    .line 138
    const-string p0, "android.view.View"

    .line 139
    .line 140
    invoke-virtual {v0, p0}, Lcom/google/android/material/chip/Chip;->setAccessibilityClassName(Ljava/lang/CharSequence;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v1, p0}, Lcom/google/android/material/chip/Chip;->setAccessibilityClassName(Ljava/lang/CharSequence;)V

    .line 144
    .line 145
    .line 146
    return-void
.end method


# virtual methods
.method public addOnRotateListener(Lcom/google/android/material/timepicker/飘花落叶言子楪苏世哲兰;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/timepicker/TimePickerView;->飘花落叶言子世苏哲楪兰:Lcom/google/android/material/timepicker/ClockHandView;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/google/android/material/timepicker/ClockHandView;->addOnRotateListener(Lcom/google/android/material/timepicker/飘花落叶言子楪苏世哲兰;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onVisibilityChanged(Landroid/view/View;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/View;->onVisibilityChanged(Landroid/view/View;I)V

    .line 2
    .line 3
    .line 4
    if-ne p1, p0, :cond_0

    .line 5
    .line 6
    if-nez p2, :cond_0

    .line 7
    .line 8
    iget-object p0, p0, Lcom/google/android/material/timepicker/TimePickerView;->飘花落叶言子世苏楪兰哲:Lcom/google/android/material/chip/Chip;

    .line 9
    .line 10
    const/16 p1, 0x8

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Landroid/view/View;->sendAccessibilityEvent(I)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public setOnActionUpListener(Lcom/google/android/material/timepicker/飘花落叶言子楪世兰哲苏;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/timepicker/TimePickerView;->飘花落叶言子世苏哲楪兰:Lcom/google/android/material/timepicker/ClockHandView;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/google/android/material/timepicker/ClockHandView;->setOnActionUpListener(Lcom/google/android/material/timepicker/飘花落叶言子楪世兰哲苏;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setOnDoubleTapListener(Lcom/google/android/material/timepicker/飘花落叶言子楪哲苏世兰;)V
    .locals 0

    .line 1
    return-void
.end method

.method public setOnPeriodChangeListener(Lcom/google/android/material/timepicker/飘花落叶言子楪哲苏兰世;)V
    .locals 0

    .line 1
    return-void
.end method
