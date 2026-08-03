.class public Lcom/skyhand/hookhand/dialog/view/SwitchButton;
.super Landroid/view/View;
.source "SourceFile"

# interfaces
.implements Landroid/widget/Checkable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;,
        Lcom/skyhand/hookhand/dialog/view/SwitchButton$d;
    }
.end annotation


# static fields
.field public static final ۥۣ۠:I

.field public static final ۥۣۡ:I


# instance fields
.field public ۥ:I

.field public ۥ۟:I

.field public ۥ۟۟:I

.field public ۥ۟۠:F

.field public ۥ۟ۡ:F

.field public ۥ۟ۢ:F

.field public ۥۣ۟:F

.field public ۥ۟ۤ:F

.field public ۥ۟ۥ:F

.field public ۥ۟ۦ:F

.field public ۥ۟ۧ:I

.field public ۥ۟ۨ:I

.field public ۥ۠:I

.field public ۥ۠۟:I

.field public ۥ۠۠:I

.field public ۥ۠ۡ:I

.field public ۥ۠ۢ:F

.field public ۥۣ۠:I

.field public ۥ۠ۤ:I

.field public ۥ۠ۥ:F

.field public ۥ۠ۦ:F

.field public ۥ۠ۧ:F

.field public ۥ۠ۨ:F

.field public ۥۡ:I

.field public ۥۡ۟:I

.field public ۥۡ۠:F

.field public ۥۡۡ:F

.field public ۥۡۢ:Landroid/graphics/Paint;

.field public ۥۣۡ:Landroid/graphics/Paint;

.field public ۥۡۤ:Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;

.field public ۥۡۥ:Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;

.field public ۥۡۦ:Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;

.field public ۥۡۧ:I

.field public ۥۡۨ:Landroid/animation/ValueAnimator;

.field public final ۥۢ:Landroid/animation/ArgbEvaluator;

.field public ۥۢ۟:Z

.field public ۥۢ۠:Z

.field public ۥۢۡ:Z

.field public ۥۢۢ:Z

.field public ۥۣۢ:Z

.field public ۥۢۤ:Z

.field public ۥۢۥ:Z

.field public ۥۢۦ:Lcom/skyhand/hookhand/dialog/view/SwitchButton$d;

.field public ۥۢۧ:J

.field public ۥۢۨ:Lcom/skyhand/hookhand/dialog/view/SwitchButton$a;

.field public ۥۣ:Lcom/skyhand/hookhand/dialog/view/SwitchButton$b;

.field public ۥۣ۟:Lcom/skyhand/hookhand/dialog/view/SwitchButton$c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    const/high16 v0, 0x42680000    # 58.0f

    .line 2
    .line 3
    invoke-static {v0}, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟(F)F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    float-to-int v0, v0

    .line 8
    sput v0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۣ۠:I

    .line 9
    .line 10
    const/high16 v0, 0x42100000    # 36.0f

    .line 11
    .line 12
    invoke-static {v0}, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟(F)F

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    float-to-int v0, v0

    .line 17
    sput v0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۣۡ:I

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    const/4 p1, 0x0

    iput p1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۧ:I

    new-instance v0, Landroid/animation/ArgbEvaluator;

    invoke-direct {v0}, Landroid/animation/ArgbEvaluator;-><init>()V

    iput-object v0, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۢ:Landroid/animation/ArgbEvaluator;

    iput-boolean p1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۣۢ:Z

    iput-boolean p1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۢۤ:Z

    iput-boolean p1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۢۥ:Z

    new-instance p1, Lcom/skyhand/hookhand/dialog/view/SwitchButton$a;

    invoke-direct {p1, p0}, Lcom/skyhand/hookhand/dialog/view/SwitchButton$a;-><init>(Lcom/skyhand/hookhand/dialog/view/SwitchButton;)V

    iput-object p1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۢۨ:Lcom/skyhand/hookhand/dialog/view/SwitchButton$a;

    new-instance p1, Lcom/skyhand/hookhand/dialog/view/SwitchButton$b;

    invoke-direct {p1, p0}, Lcom/skyhand/hookhand/dialog/view/SwitchButton$b;-><init>(Lcom/skyhand/hookhand/dialog/view/SwitchButton;)V

    iput-object p1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۣ:Lcom/skyhand/hookhand/dialog/view/SwitchButton$b;

    new-instance p1, Lcom/skyhand/hookhand/dialog/view/SwitchButton$c;

    invoke-direct {p1, p0}, Lcom/skyhand/hookhand/dialog/view/SwitchButton$c;-><init>(Lcom/skyhand/hookhand/dialog/view/SwitchButton;)V

    iput-object p1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۣ۟:Lcom/skyhand/hookhand/dialog/view/SwitchButton$c;

    invoke-virtual {p0}, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟۟()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    const/4 p1, 0x0

    iput p1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۧ:I

    new-instance p2, Landroid/animation/ArgbEvaluator;

    invoke-direct {p2}, Landroid/animation/ArgbEvaluator;-><init>()V

    iput-object p2, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۢ:Landroid/animation/ArgbEvaluator;

    iput-boolean p1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۣۢ:Z

    iput-boolean p1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۢۤ:Z

    iput-boolean p1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۢۥ:Z

    new-instance p1, Lcom/skyhand/hookhand/dialog/view/SwitchButton$a;

    invoke-direct {p1, p0}, Lcom/skyhand/hookhand/dialog/view/SwitchButton$a;-><init>(Lcom/skyhand/hookhand/dialog/view/SwitchButton;)V

    iput-object p1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۢۨ:Lcom/skyhand/hookhand/dialog/view/SwitchButton$a;

    new-instance p1, Lcom/skyhand/hookhand/dialog/view/SwitchButton$b;

    invoke-direct {p1, p0}, Lcom/skyhand/hookhand/dialog/view/SwitchButton$b;-><init>(Lcom/skyhand/hookhand/dialog/view/SwitchButton;)V

    iput-object p1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۣ:Lcom/skyhand/hookhand/dialog/view/SwitchButton$b;

    new-instance p1, Lcom/skyhand/hookhand/dialog/view/SwitchButton$c;

    invoke-direct {p1, p0}, Lcom/skyhand/hookhand/dialog/view/SwitchButton$c;-><init>(Lcom/skyhand/hookhand/dialog/view/SwitchButton;)V

    iput-object p1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۣ۟:Lcom/skyhand/hookhand/dialog/view/SwitchButton$c;

    invoke-virtual {p0}, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟۟()V

    return-void
.end method

.method private setCheckedViewState(Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;)V
    .locals 1

    iget v0, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟۠:F

    iput v0, p1, Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;->ۥ۟۠:F

    iget v0, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۠:I

    iput v0, p1, Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;->ۥ۟:I

    iget v0, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۠۠:I

    iput v0, p1, Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;->ۥ۟۟:I

    iget v0, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۡ:F

    iput v0, p1, Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;->ۥ:F

    iget-object p1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۢ:Landroid/graphics/Paint;

    iget v0, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡ۟:I

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method

.method private setUncheckViewState(Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p1, Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;->ۥ۟۠:F

    iget v0, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟ۨ:I

    iput v0, p1, Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;->ۥ۟:I

    const/4 v0, 0x0

    iput v0, p1, Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;->ۥ۟۟:I

    iget v0, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡ۠:F

    iput v0, p1, Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;->ۥ:F

    iget-object p1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۢ:Landroid/graphics/Paint;

    iget v0, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡ:I

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method

.method public static ۥ۟(F)F
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0, p0}, L۟/c4;->ۥۣ۟(IF)F

    .line 3
    .line 4
    .line 5
    move-result p0

    .line 6
    return p0
.end method


# virtual methods
.method public final isChecked()Z
    .locals 1

    iget-boolean v0, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۢ۟:Z

    return v0
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 13

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۣۡ:Landroid/graphics/Paint;

    .line 5
    .line 6
    iget v1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۠۟:I

    .line 7
    .line 8
    int-to-float v1, v1

    .line 9
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۣۡ:Landroid/graphics/Paint;

    .line 13
    .line 14
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۣۡ:Landroid/graphics/Paint;

    .line 20
    .line 21
    iget v1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟ۧ:I

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 24
    .line 25
    .line 26
    iget v3, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟ۢ:F

    .line 27
    .line 28
    iget v4, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۣ۟:F

    .line 29
    .line 30
    iget v5, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟ۤ:F

    .line 31
    .line 32
    iget v6, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟ۥ:F

    .line 33
    .line 34
    iget v8, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟۠:F

    .line 35
    .line 36
    iget-object v9, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۣۡ:Landroid/graphics/Paint;

    .line 37
    .line 38
    move-object v2, p1

    .line 39
    move v7, v8

    .line 40
    invoke-virtual/range {v2 .. v9}, Landroid/graphics/Canvas;->drawRoundRect(FFFFFFLandroid/graphics/Paint;)V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۣۡ:Landroid/graphics/Paint;

    .line 44
    .line 45
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۣۡ:Landroid/graphics/Paint;

    .line 51
    .line 52
    iget v1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟ۨ:I

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 55
    .line 56
    .line 57
    iget v3, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟ۢ:F

    .line 58
    .line 59
    iget v4, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۣ۟:F

    .line 60
    .line 61
    iget v5, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟ۤ:F

    .line 62
    .line 63
    iget v6, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟ۥ:F

    .line 64
    .line 65
    iget v8, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟۠:F

    .line 66
    .line 67
    iget-object v9, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۣۡ:Landroid/graphics/Paint;

    .line 68
    .line 69
    move-object v2, p1

    .line 70
    move v7, v8

    .line 71
    invoke-virtual/range {v2 .. v9}, Landroid/graphics/Canvas;->drawRoundRect(FFFFFFLandroid/graphics/Paint;)V

    .line 72
    .line 73
    .line 74
    iget-boolean v0, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۢۢ:Z

    .line 75
    .line 76
    if-eqz v0, :cond_0

    .line 77
    .line 78
    iget v0, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۣ۠:I

    .line 79
    .line 80
    iget v1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۠ۤ:I

    .line 81
    .line 82
    int-to-float v1, v1

    .line 83
    iget v2, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟ۤ:F

    .line 84
    .line 85
    iget v3, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۠ۥ:F

    .line 86
    .line 87
    sub-float/2addr v2, v3

    .line 88
    iget v3, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟ۦ:F

    .line 89
    .line 90
    iget v4, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۠ۦ:F

    .line 91
    .line 92
    iget-object v5, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۣۡ:Landroid/graphics/Paint;

    .line 93
    .line 94
    sget-object v6, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 95
    .line 96
    invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v5, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v5, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1, v2, v3, v4, v5}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 106
    .line 107
    .line 108
    :cond_0
    iget-object v0, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۤ:Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;

    .line 109
    .line 110
    iget v0, v0, Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;->ۥ۟۠:F

    .line 111
    .line 112
    const/high16 v1, 0x3f000000    # 0.5f

    .line 113
    .line 114
    mul-float/2addr v0, v1

    .line 115
    iget-object v1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۣۡ:Landroid/graphics/Paint;

    .line 116
    .line 117
    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 118
    .line 119
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 120
    .line 121
    .line 122
    iget-object v1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۣۡ:Landroid/graphics/Paint;

    .line 123
    .line 124
    iget-object v2, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۤ:Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;

    .line 125
    .line 126
    iget v2, v2, Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;->ۥ۟:I

    .line 127
    .line 128
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 129
    .line 130
    .line 131
    iget-object v1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۣۡ:Landroid/graphics/Paint;

    .line 132
    .line 133
    iget v2, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۠۟:I

    .line 134
    .line 135
    int-to-float v2, v2

    .line 136
    const/high16 v3, 0x40000000    # 2.0f

    .line 137
    .line 138
    mul-float v4, v0, v3

    .line 139
    .line 140
    add-float/2addr v4, v2

    .line 141
    invoke-virtual {v1, v4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 142
    .line 143
    .line 144
    iget v1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟ۢ:F

    .line 145
    .line 146
    add-float v5, v1, v0

    .line 147
    .line 148
    iget v1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۣ۟:F

    .line 149
    .line 150
    add-float v6, v1, v0

    .line 151
    .line 152
    iget v1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟ۤ:F

    .line 153
    .line 154
    sub-float v7, v1, v0

    .line 155
    .line 156
    iget v1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟ۥ:F

    .line 157
    .line 158
    sub-float v8, v1, v0

    .line 159
    .line 160
    iget v10, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟۠:F

    .line 161
    .line 162
    iget-object v11, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۣۡ:Landroid/graphics/Paint;

    .line 163
    .line 164
    move-object v4, p1

    .line 165
    move v9, v10

    .line 166
    invoke-virtual/range {v4 .. v11}, Landroid/graphics/Canvas;->drawRoundRect(FFFFFFLandroid/graphics/Paint;)V

    .line 167
    .line 168
    .line 169
    iget-object v0, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۣۡ:Landroid/graphics/Paint;

    .line 170
    .line 171
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 172
    .line 173
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 174
    .line 175
    .line 176
    iget-object v0, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۣۡ:Landroid/graphics/Paint;

    .line 177
    .line 178
    const/high16 v1, 0x3f800000    # 1.0f

    .line 179
    .line 180
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 181
    .line 182
    .line 183
    iget v5, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟ۢ:F

    .line 184
    .line 185
    iget v6, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۣ۟:F

    .line 186
    .line 187
    iget v0, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟۠:F

    .line 188
    .line 189
    mul-float/2addr v0, v3

    .line 190
    add-float v7, v0, v5

    .line 191
    .line 192
    add-float v8, v0, v6

    .line 193
    .line 194
    const/high16 v9, 0x42b40000    # 90.0f

    .line 195
    .line 196
    const/high16 v10, 0x43340000    # 180.0f

    .line 197
    .line 198
    iget-object v12, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۣۡ:Landroid/graphics/Paint;

    .line 199
    .line 200
    const/4 v11, 0x1

    .line 201
    move-object v4, p1

    .line 202
    invoke-virtual/range {v4 .. v12}, Landroid/graphics/Canvas;->drawArc(FFFFFFZLandroid/graphics/Paint;)V

    .line 203
    .line 204
    .line 205
    iget v0, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟ۢ:F

    .line 206
    .line 207
    iget v2, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟۠:F

    .line 208
    .line 209
    add-float v5, v0, v2

    .line 210
    .line 211
    iget v6, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۣ۟:F

    .line 212
    .line 213
    iget-object v0, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۤ:Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;

    .line 214
    .line 215
    iget v7, v0, Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;->ۥ:F

    .line 216
    .line 217
    mul-float/2addr v2, v3

    .line 218
    add-float v8, v2, v6

    .line 219
    .line 220
    iget-object v9, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۣۡ:Landroid/graphics/Paint;

    .line 221
    .line 222
    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 223
    .line 224
    .line 225
    iget-boolean v0, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۢۢ:Z

    .line 226
    .line 227
    if-eqz v0, :cond_1

    .line 228
    .line 229
    iget-object v0, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۤ:Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;

    .line 230
    .line 231
    iget v0, v0, Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;->ۥ۟۟:I

    .line 232
    .line 233
    iget v2, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۠ۡ:I

    .line 234
    .line 235
    int-to-float v2, v2

    .line 236
    iget v3, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟ۢ:F

    .line 237
    .line 238
    iget v4, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟۠:F

    .line 239
    .line 240
    add-float/2addr v3, v4

    .line 241
    iget v4, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۠ۧ:F

    .line 242
    .line 243
    sub-float v6, v3, v4

    .line 244
    .line 245
    iget v4, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟ۦ:F

    .line 246
    .line 247
    iget v5, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۠ۢ:F

    .line 248
    .line 249
    sub-float v7, v4, v5

    .line 250
    .line 251
    iget v8, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۠ۨ:F

    .line 252
    .line 253
    sub-float v8, v3, v8

    .line 254
    .line 255
    add-float v9, v4, v5

    .line 256
    .line 257
    iget-object v10, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۣۡ:Landroid/graphics/Paint;

    .line 258
    .line 259
    sget-object v3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 260
    .line 261
    invoke-virtual {v10, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v10, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v10, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 268
    .line 269
    .line 270
    move-object v5, p1

    .line 271
    invoke-virtual/range {v5 .. v10}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 272
    .line 273
    .line 274
    :cond_1
    iget-object v0, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۤ:Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;

    .line 275
    .line 276
    iget v0, v0, Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;->ۥ:F

    .line 277
    .line 278
    iget v2, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟ۦ:F

    .line 279
    .line 280
    iget v3, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟ۡ:F

    .line 281
    .line 282
    iget-object v4, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۢ:Landroid/graphics/Paint;

    .line 283
    .line 284
    invoke-virtual {p1, v0, v2, v3, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 285
    .line 286
    .line 287
    iget-object v3, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۣۡ:Landroid/graphics/Paint;

    .line 288
    .line 289
    sget-object v4, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 290
    .line 291
    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 292
    .line 293
    .line 294
    iget-object v3, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۣۡ:Landroid/graphics/Paint;

    .line 295
    .line 296
    invoke-virtual {v3, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 297
    .line 298
    .line 299
    iget-object v1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۣۡ:Landroid/graphics/Paint;

    .line 300
    .line 301
    const v3, -0x222223

    .line 302
    .line 303
    .line 304
    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 305
    .line 306
    .line 307
    iget v1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟ۡ:F

    .line 308
    .line 309
    iget-object v3, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۣۡ:Landroid/graphics/Paint;

    .line 310
    .line 311
    invoke-virtual {p1, v0, v2, v1, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 312
    .line 313
    .line 314
    return-void
.end method

.method public final onMeasure(II)V
    .locals 4

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    const/high16 v2, -0x80000000

    const/high16 v3, 0x40000000    # 2.0f

    if-eqz v0, :cond_0

    if-ne v0, v2, :cond_1

    :cond_0
    sget p1, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۣ۠:I

    invoke-static {p1, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    :cond_1
    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_3

    :cond_2
    sget p2, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۣۡ:I

    invoke-static {p2, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    :cond_3
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    return-void
.end method

.method public final onSizeChanged(IIII)V
    .locals 2

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    iget p3, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ:I

    iget p4, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟:I

    add-int/2addr p3, p4

    iget p4, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۠۟:I

    invoke-static {p3, p4}, Ljava/lang/Math;->max(II)I

    move-result p3

    int-to-float p3, p3

    int-to-float p2, p2

    sub-float/2addr p2, p3

    sub-float p4, p2, p3

    int-to-float p1, p1

    sub-float/2addr p1, p3

    const/high16 v0, 0x3f000000    # 0.5f

    mul-float/2addr p4, v0

    iput p4, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟۠:F

    iget v1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۠۟:I

    int-to-float v1, v1

    sub-float v1, p4, v1

    iput v1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟ۡ:F

    iput p3, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟ۢ:F

    iput p3, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۣ۟:F

    iput p1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟ۤ:F

    iput p2, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟ۥ:F

    add-float/2addr p2, p3

    mul-float/2addr p2, v0

    iput p2, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟ۦ:F

    add-float/2addr p3, p4

    iput p3, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡ۠:F

    sub-float/2addr p1, p4

    iput p1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۡ:F

    invoke-virtual {p0}, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->isChecked()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۤ:Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;

    invoke-direct {p0, p1}, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->setCheckedViewState(Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۤ:Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;

    invoke-direct {p0, p1}, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->setUncheckViewState(Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;)V

    :goto_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۢۤ:Z

    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 11

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v2, 0x1

    .line 14
    if-eqz v0, :cond_15

    .line 15
    .line 16
    const/high16 v3, 0x3f800000    # 1.0f

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    const/4 v5, 0x3

    .line 20
    const/4 v6, 0x2

    .line 21
    if-eq v0, v2, :cond_a

    .line 22
    .line 23
    if-eq v0, v6, :cond_5

    .line 24
    .line 25
    if-eq v0, v5, :cond_1

    .line 26
    .line 27
    goto/16 :goto_7

    .line 28
    .line 29
    :cond_1
    iput-boolean v1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۣۢ:Z

    .line 30
    .line 31
    iget-object p1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۢۨ:Lcom/skyhand/hookhand/dialog/view/SwitchButton$a;

    .line 32
    .line 33
    invoke-virtual {p0, p1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 34
    .line 35
    .line 36
    iget p1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۧ:I

    .line 37
    .line 38
    if-eq p1, v2, :cond_3

    .line 39
    .line 40
    if-ne p1, v5, :cond_2

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    move v0, v1

    .line 44
    goto :goto_1

    .line 45
    :cond_3
    :goto_0
    move v0, v2

    .line 46
    :goto_1
    if-nez v0, :cond_14

    .line 47
    .line 48
    if-ne p1, v6, :cond_4

    .line 49
    .line 50
    move v1, v2

    .line 51
    :cond_4
    if-eqz v1, :cond_16

    .line 52
    .line 53
    goto/16 :goto_6

    .line 54
    .line 55
    :cond_5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    iget v0, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۧ:I

    .line 60
    .line 61
    if-eq v0, v2, :cond_7

    .line 62
    .line 63
    if-ne v0, v5, :cond_6

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_6
    move v5, v1

    .line 67
    goto :goto_3

    .line 68
    :cond_7
    :goto_2
    move v5, v2

    .line 69
    :goto_3
    if-eqz v5, :cond_8

    .line 70
    .line 71
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    int-to-float v0, v0

    .line 76
    div-float/2addr p1, v0

    .line 77
    invoke-static {v3, p1}, Ljava/lang/Math;->min(FF)F

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    invoke-static {v4, p1}, Ljava/lang/Math;->max(FF)F

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    iget-object v0, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۤ:Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;

    .line 86
    .line 87
    iget v1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡ۠:F

    .line 88
    .line 89
    iget v3, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۡ:F

    .line 90
    .line 91
    sub-float/2addr v3, v1

    .line 92
    mul-float/2addr v3, p1

    .line 93
    add-float/2addr v3, v1

    .line 94
    iput v3, v0, Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;->ۥ:F

    .line 95
    .line 96
    goto/16 :goto_7

    .line 97
    .line 98
    :cond_8
    if-ne v0, v6, :cond_9

    .line 99
    .line 100
    move v1, v2

    .line 101
    :cond_9
    if-eqz v1, :cond_16

    .line 102
    .line 103
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    int-to-float v0, v0

    .line 108
    div-float/2addr p1, v0

    .line 109
    invoke-static {v3, p1}, Ljava/lang/Math;->min(FF)F

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    invoke-static {v4, p1}, Ljava/lang/Math;->max(FF)F

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    iget-object v0, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۤ:Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;

    .line 118
    .line 119
    iget v1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡ۠:F

    .line 120
    .line 121
    iget v3, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۡ:F

    .line 122
    .line 123
    sub-float/2addr v3, v1

    .line 124
    mul-float/2addr v3, p1

    .line 125
    add-float/2addr v3, v1

    .line 126
    iput v3, v0, Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;->ۥ:F

    .line 127
    .line 128
    iget-object v1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۢ:Landroid/animation/ArgbEvaluator;

    .line 129
    .line 130
    iget v3, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟ۨ:I

    .line 131
    .line 132
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    iget v4, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۠:I

    .line 137
    .line 138
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    invoke-virtual {v1, p1, v3, v4}, Landroid/animation/ArgbEvaluator;->evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    check-cast p1, Ljava/lang/Integer;

    .line 147
    .line 148
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 149
    .line 150
    .line 151
    move-result p1

    .line 152
    iput p1, v0, Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;->ۥ۟:I

    .line 153
    .line 154
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 155
    .line 156
    .line 157
    goto/16 :goto_7

    .line 158
    .line 159
    :cond_a
    iput-boolean v1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۣۢ:Z

    .line 160
    .line 161
    iget-object v0, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۢۨ:Lcom/skyhand/hookhand/dialog/view/SwitchButton$a;

    .line 162
    .line 163
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 164
    .line 165
    .line 166
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 167
    .line 168
    .line 169
    move-result-wide v7

    .line 170
    iget-wide v9, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۢۧ:J

    .line 171
    .line 172
    sub-long/2addr v7, v9

    .line 173
    const-wide/16 v9, 0x12c

    .line 174
    .line 175
    cmp-long v0, v7, v9

    .line 176
    .line 177
    if-gtz v0, :cond_b

    .line 178
    .line 179
    invoke-virtual {p0}, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->toggle()V

    .line 180
    .line 181
    .line 182
    goto/16 :goto_7

    .line 183
    .line 184
    :cond_b
    iget v0, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۧ:I

    .line 185
    .line 186
    if-ne v0, v6, :cond_c

    .line 187
    .line 188
    move v6, v2

    .line 189
    goto :goto_4

    .line 190
    :cond_c
    move v6, v1

    .line 191
    :goto_4
    if-eqz v6, :cond_11

    .line 192
    .line 193
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 194
    .line 195
    .line 196
    move-result p1

    .line 197
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    int-to-float v0, v0

    .line 202
    div-float/2addr p1, v0

    .line 203
    invoke-static {v3, p1}, Ljava/lang/Math;->min(FF)F

    .line 204
    .line 205
    .line 206
    move-result p1

    .line 207
    invoke-static {v4, p1}, Ljava/lang/Math;->max(FF)F

    .line 208
    .line 209
    .line 210
    move-result p1

    .line 211
    const/high16 v0, 0x3f000000    # 0.5f

    .line 212
    .line 213
    cmpl-float p1, p1, v0

    .line 214
    .line 215
    if-lez p1, :cond_d

    .line 216
    .line 217
    move v1, v2

    .line 218
    :cond_d
    invoke-virtual {p0}, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->isChecked()Z

    .line 219
    .line 220
    .line 221
    move-result p1

    .line 222
    if-ne v1, p1, :cond_e

    .line 223
    .line 224
    goto :goto_6

    .line 225
    :cond_e
    iput-boolean v1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۢ۟:Z

    .line 226
    .line 227
    iget-object p1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۨ:Landroid/animation/ValueAnimator;

    .line 228
    .line 229
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->isRunning()Z

    .line 230
    .line 231
    .line 232
    move-result p1

    .line 233
    if-eqz p1, :cond_f

    .line 234
    .line 235
    iget-object p1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۨ:Landroid/animation/ValueAnimator;

    .line 236
    .line 237
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->cancel()V

    .line 238
    .line 239
    .line 240
    :cond_f
    const/4 p1, 0x4

    .line 241
    iput p1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۧ:I

    .line 242
    .line 243
    iget-object p1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۥ:Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;

    .line 244
    .line 245
    iget-object v0, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۤ:Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;

    .line 246
    .line 247
    invoke-static {p1, v0}, Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;->ۥ(Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {p0}, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->isChecked()Z

    .line 251
    .line 252
    .line 253
    move-result p1

    .line 254
    if-eqz p1, :cond_10

    .line 255
    .line 256
    iget-object p1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۦ:Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;

    .line 257
    .line 258
    invoke-direct {p0, p1}, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->setCheckedViewState(Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;)V

    .line 259
    .line 260
    .line 261
    goto :goto_5

    .line 262
    :cond_10
    iget-object p1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۦ:Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;

    .line 263
    .line 264
    invoke-direct {p0, p1}, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->setUncheckViewState(Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;)V

    .line 265
    .line 266
    .line 267
    :goto_5
    iget-object p1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۨ:Landroid/animation/ValueAnimator;

    .line 268
    .line 269
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    .line 270
    .line 271
    .line 272
    goto :goto_7

    .line 273
    :cond_11
    if-eq v0, v2, :cond_12

    .line 274
    .line 275
    if-ne v0, v5, :cond_13

    .line 276
    .line 277
    :cond_12
    move v1, v2

    .line 278
    :cond_13
    if-eqz v1, :cond_16

    .line 279
    .line 280
    :cond_14
    :goto_6
    invoke-virtual {p0}, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟۠()V

    .line 281
    .line 282
    .line 283
    goto :goto_7

    .line 284
    :cond_15
    iput-boolean v2, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۣۢ:Z

    .line 285
    .line 286
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 287
    .line 288
    .line 289
    move-result-wide v0

    .line 290
    iput-wide v0, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۢۧ:J

    .line 291
    .line 292
    iget-object p1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۢۨ:Lcom/skyhand/hookhand/dialog/view/SwitchButton$a;

    .line 293
    .line 294
    invoke-virtual {p0, p1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 295
    .line 296
    .line 297
    iget-object p1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۢۨ:Lcom/skyhand/hookhand/dialog/view/SwitchButton$a;

    .line 298
    .line 299
    const-wide/16 v0, 0x64

    .line 300
    .line 301
    invoke-virtual {p0, p1, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 302
    .line 303
    .line 304
    :cond_16
    :goto_7
    return v2
.end method

.method public setCheckColor(I)V
    .locals 0

    iput p1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۠:I

    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    return-void
.end method

.method public setChecked(Z)V
    .locals 1

    iget-boolean v0, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۢ۠:Z

    invoke-virtual {p0, p1, v0}, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟ۡ(ZZ)V

    return-void
.end method

.method public setEnableEffect(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۢ۠:Z

    return-void
.end method

.method public setOnCheckedChangeListener(Lcom/skyhand/hookhand/dialog/view/SwitchButton$d;)V
    .locals 0

    iput-object p1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۢۦ:Lcom/skyhand/hookhand/dialog/view/SwitchButton$d;

    return-void
.end method

.method public final setOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 0

    return-void
.end method

.method public final setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V
    .locals 0

    return-void
.end method

.method public final setPadding(IIII)V
    .locals 0

    const/4 p1, 0x0

    invoke-super {p0, p1, p1, p1, p1}, Landroid/view/View;->setPadding(IIII)V

    return-void
.end method

.method public setShadowEffect(Z)V
    .locals 4

    iget-boolean v0, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۢۡ:Z

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۢۡ:Z

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۢ:Landroid/graphics/Paint;

    iget v1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ:I

    int-to-float v1, v1

    iget v2, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟:I

    int-to-float v2, v2

    iget v3, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟۟:I

    invoke-virtual {p1, v1, v0, v2, v3}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۢ:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v0, v0, v1}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    :goto_0
    return-void
.end method

.method public setShowIndicator(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۢۢ:Z

    return-void
.end method

.method public final toggle()V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟ۡ(ZZ)V

    return-void
.end method

.method public final ۥ()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۢۦ:Lcom/skyhand/hookhand/dialog/view/SwitchButton$d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_4

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    iput-boolean v2, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۢۥ:Z

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->isChecked()Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    check-cast v0, L۟/y;

    .line 14
    .line 15
    iget v4, v0, L۟/y;->ۥ:I

    .line 16
    .line 17
    const/4 v5, 0x6

    .line 18
    packed-switch v4, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    goto/16 :goto_1

    .line 22
    .line 23
    :pswitch_0
    iget-object v4, v0, L۟/y;->ۥ۟:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v4, L۟/p0;

    .line 26
    .line 27
    iget-object v0, v0, L۟/y;->ۥ۟۟:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, L۟/r1;

    .line 30
    .line 31
    sget v6, L۟/r1;->ۥ۟:I

    .line 32
    .line 33
    const/4 v6, 0x5

    .line 34
    new-array v6, v6, [B

    .line 35
    .line 36
    fill-array-data v6, :array_0

    .line 37
    .line 38
    .line 39
    new-array v7, v5, [B

    .line 40
    .line 41
    fill-array-data v7, :array_1

    .line 42
    .line 43
    .line 44
    invoke-static {v6, v7}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    invoke-static {v6, v4}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    new-array v6, v5, [B

    .line 52
    .line 53
    fill-array-data v6, :array_2

    .line 54
    .line 55
    .line 56
    new-array v7, v5, [B

    .line 57
    .line 58
    fill-array-data v7, :array_3

    .line 59
    .line 60
    .line 61
    invoke-static {v6, v7}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    invoke-static {v6, v0}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    iput-object v6, v4, L۟/p0;->ۥ۟ۥ:Ljava/lang/Boolean;

    .line 73
    .line 74
    iget-object v6, v4, L۟/p0;->ۥ۟ۦ:L۟/g3;

    .line 75
    .line 76
    if-eqz v6, :cond_0

    .line 77
    .line 78
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 79
    .line 80
    .line 81
    move-result-object v7

    .line 82
    invoke-interface {v6, v7}, L۟/g3;->ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    :cond_0
    iget-object v6, v4, L۟/p0;->ۥ۟:Ljava/lang/String;

    .line 86
    .line 87
    invoke-static {v6}, L۟/ta;->ۥ۠ۦ(Ljava/lang/CharSequence;)Z

    .line 88
    .line 89
    .line 90
    move-result v6

    .line 91
    xor-int/2addr v2, v6

    .line 92
    if-eqz v2, :cond_4

    .line 93
    .line 94
    sget-object v2, L۟/d1;->ۥ:L۟/kb;

    .line 95
    .line 96
    invoke-static {}, L۟/d1$b;->ۥ()L۟/x3;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    iget-object v6, v4, L۟/p0;->ۥ۟:Ljava/lang/String;

    .line 101
    .line 102
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    invoke-interface {v2, v6, v3}, L۟/x3;->ۥ۟(Ljava/lang/String;Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    iget-object v2, v4, L۟/p0;->ۥ۟:Ljava/lang/String;

    .line 110
    .line 111
    const/4 v3, 0x3

    .line 112
    new-array v3, v3, [B

    .line 113
    .line 114
    fill-array-data v3, :array_4

    .line 115
    .line 116
    .line 117
    new-array v4, v5, [B

    .line 118
    .line 119
    fill-array-data v4, :array_5

    .line 120
    .line 121
    .line 122
    invoke-static {v3, v4}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    invoke-static {v3, v2}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    iget-object v3, v0, L۟/r1;->ۥ:Ljava/util/List;

    .line 130
    .line 131
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    move v4, v1

    .line 136
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 137
    .line 138
    .line 139
    move-result v5

    .line 140
    if-eqz v5, :cond_4

    .line 141
    .line 142
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v5

    .line 146
    add-int/lit8 v6, v4, 0x1

    .line 147
    .line 148
    if-ltz v4, :cond_2

    .line 149
    .line 150
    check-cast v5, L۟/p0;

    .line 151
    .line 152
    iget-object v5, v5, L۟/p0;->ۥ۟ۢ:Ljava/lang/String;

    .line 153
    .line 154
    invoke-static {v5, v2}, L۟/h4;->ۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v5

    .line 158
    if-eqz v5, :cond_1

    .line 159
    .line 160
    invoke-virtual {v0, v4}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    .line 161
    .line 162
    .line 163
    :cond_1
    move v4, v6

    .line 164
    goto :goto_0

    .line 165
    :cond_2
    new-instance v0, Ljava/lang/ArithmeticException;

    .line 166
    .line 167
    const-string v1, "Index overflow has happened."

    .line 168
    .line 169
    invoke-direct {v0, v1}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    throw v0

    .line 173
    :goto_1
    iget-object v2, v0, L۟/y;->ۥ۟:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast v2, Lcom/skyhand/hookhand/dialog/view/SwitchButton;

    .line 176
    .line 177
    iget-object v0, v0, L۟/y;->ۥ۟۟:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v0, Lcom/skyhand/redbookhelper/MainActivity;

    .line 180
    .line 181
    sget-object v3, Lcom/skyhand/redbookhelper/MainActivity;->ۥۣ۟:L۟/kb;

    .line 182
    .line 183
    new-array v3, v5, [B

    .line 184
    .line 185
    fill-array-data v3, :array_6

    .line 186
    .line 187
    .line 188
    new-array v4, v5, [B

    .line 189
    .line 190
    fill-array-data v4, :array_7

    .line 191
    .line 192
    .line 193
    invoke-static {v3, v4}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v3

    .line 197
    invoke-static {v3, v0}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v2}, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->isChecked()Z

    .line 201
    .line 202
    .line 203
    move-result v3

    .line 204
    if-eqz v3, :cond_3

    .line 205
    .line 206
    new-instance v3, L۟/w6;

    .line 207
    .line 208
    const/16 v4, 0xc

    .line 209
    .line 210
    new-array v4, v4, [B

    .line 211
    .line 212
    fill-array-data v4, :array_8

    .line 213
    .line 214
    .line 215
    new-array v6, v5, [B

    .line 216
    .line 217
    fill-array-data v6, :array_9

    .line 218
    .line 219
    .line 220
    invoke-static {v4, v6}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v4

    .line 224
    const v6, 0x7f040001

    .line 225
    .line 226
    .line 227
    invoke-virtual {v0, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v6

    .line 231
    const/16 v7, 0xe

    .line 232
    .line 233
    new-array v7, v7, [B

    .line 234
    .line 235
    fill-array-data v7, :array_a

    .line 236
    .line 237
    .line 238
    new-array v5, v5, [B

    .line 239
    .line 240
    fill-array-data v5, :array_b

    .line 241
    .line 242
    .line 243
    invoke-static {v7, v5}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v5

    .line 247
    invoke-static {v5, v6}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    invoke-direct {v3, v0, v4, v6}, L۟/w6;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 251
    .line 252
    .line 253
    new-instance v4, L۟/k5;

    .line 254
    .line 255
    invoke-direct {v4, v0}, L۟/k5;-><init>(Lcom/skyhand/redbookhelper/MainActivity;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v3, v4}, L۟/gb;->ۥ۠ۡ(L۟/f3;)V

    .line 259
    .line 260
    .line 261
    new-instance v0, L۟/l5;

    .line 262
    .line 263
    invoke-direct {v0, v2}, L۟/l5;-><init>(Lcom/skyhand/hookhand/dialog/view/SwitchButton;)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v3, v0}, L۟/gb;->ۥ۠۟(L۟/f3;)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v3}, L۟/ya;->show()V

    .line 270
    .line 271
    .line 272
    goto :goto_2

    .line 273
    :cond_3
    invoke-virtual {v0, v1}, Lcom/skyhand/redbookhelper/MainActivity;->ۥ(Z)V

    .line 274
    .line 275
    .line 276
    :cond_4
    :goto_2
    iput-boolean v1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۢۥ:Z

    .line 277
    .line 278
    return-void

    .line 279
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch

    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    :array_0
    .array-data 1
        0x42t
        -0x6t
        -0x4ct
        0x43t
        -0x40t
    .end array-data

    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    nop

    .line 293
    :array_1
    .array-data 1
        0x66t
        -0x6dt
        -0x40t
        0x26t
        -0x53t
        -0x3bt
    .end array-data

    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    nop

    .line 301
    :array_2
    .array-data 1
        -0x17t
        0x78t
        -0x6ct
        0x5at
        0x7et
        -0x43t
    .end array-data

    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    nop

    .line 309
    :array_3
    .array-data 1
        -0x63t
        0x10t
        -0x3t
        0x29t
        0x5at
        -0x73t
    .end array-data

    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    nop

    .line 317
    :array_4
    .array-data 1
        0x7t
        0x76t
        0x66t
    .end array-data

    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    :array_5
    .array-data 1
        0x6ct
        0x13t
        0x1ft
        0x74t
        -0x1t
        -0x36t
    .end array-data

    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    nop

    .line 331
    :array_6
    .array-data 1
        0x1bt
        -0x77t
        0x29t
        0x3at
        0xdt
        -0x52t
    .end array-data

    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    nop

    .line 339
    :array_7
    .array-data 1
        0x6ft
        -0x1ft
        0x40t
        0x49t
        0x29t
        -0x62t
    .end array-data

    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    nop

    .line 347
    :array_8
    .array-data 1
        -0x42t
        0x11t
        0x37t
        -0x2et
        -0x29t
        0x5bt
        -0x41t
        0x12t
        0xdt
        -0x2dt
        -0x6t
        0x6at
    .end array-data

    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    :array_9
    .array-data 1
        0x59t
        -0x63t
        -0x63t
        0x34t
        0x5et
        -0x30t
    .end array-data

    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    nop

    .line 365
    :array_a
    .array-data 1
        -0x11t
        -0x35t
        -0x4dt
        0x68t
        0xft
        0x3ct
        -0x1ft
        -0x40t
        -0x60t
        0x13t
        0x55t
        0x60t
        -0x5at
        -0x79t
    .end array-data

    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    nop

    .line 377
    :array_b
    .array-data 1
        -0x78t
        -0x52t
        -0x39t
        0x3bt
        0x7bt
        0x4et
    .end array-data
.end method

.method public final ۥ۟۟()V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۢۡ:Z

    .line 3
    .line 4
    const v1, -0x555556

    .line 5
    .line 6
    .line 7
    iput v1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۣ۠:I

    .line 8
    .line 9
    const/high16 v1, 0x3fc00000    # 1.5f

    .line 10
    .line 11
    invoke-static {v1}, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟(F)F

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    float-to-int v2, v2

    .line 16
    iput v2, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۠ۤ:I

    .line 17
    .line 18
    const/high16 v2, 0x41200000    # 10.0f

    .line 19
    .line 20
    invoke-static {v2}, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟(F)F

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    iput v2, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۠ۥ:F

    .line 25
    .line 26
    const/high16 v2, 0x40800000    # 4.0f

    .line 27
    .line 28
    invoke-static {v2}, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟(F)F

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    iput v3, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۠ۦ:F

    .line 33
    .line 34
    invoke-static {v2}, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟(F)F

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    iput v3, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۠ۧ:F

    .line 39
    .line 40
    invoke-static {v2}, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟(F)F

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    iput v2, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۠ۨ:F

    .line 45
    .line 46
    const/high16 v2, 0x40a00000    # 5.0f

    .line 47
    .line 48
    invoke-static {v2}, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟(F)F

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    float-to-int v2, v2

    .line 53
    iput v2, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ:I

    .line 54
    .line 55
    invoke-static {v1}, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟(F)F

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    float-to-int v1, v1

    .line 60
    iput v1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟:I

    .line 61
    .line 62
    const/high16 v1, 0x33000000

    .line 63
    .line 64
    iput v1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟۟:I

    .line 65
    .line 66
    const v1, -0x222223

    .line 67
    .line 68
    .line 69
    iput v1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟ۨ:I

    .line 70
    .line 71
    sget v1, L۟/ya;->ۥ۠۟:I

    .line 72
    .line 73
    iput v1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۠:I

    .line 74
    .line 75
    const/high16 v1, 0x3f800000    # 1.0f

    .line 76
    .line 77
    invoke-static {v1}, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟(F)F

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    float-to-int v2, v2

    .line 82
    iput v2, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۠۟:I

    .line 83
    .line 84
    const/4 v2, -0x1

    .line 85
    iput v2, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۠۠:I

    .line 86
    .line 87
    invoke-static {v1}, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟(F)F

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    float-to-int v1, v1

    .line 92
    iput v1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۠ۡ:I

    .line 93
    .line 94
    const/high16 v1, 0x40c00000    # 6.0f

    .line 95
    .line 96
    invoke-static {v1}, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟(F)F

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    iput v1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۠ۢ:F

    .line 101
    .line 102
    iput v2, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡ:I

    .line 103
    .line 104
    iput v2, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡ۟:I

    .line 105
    .line 106
    iput-boolean v0, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۢ۟:Z

    .line 107
    .line 108
    iput-boolean v0, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۢۢ:Z

    .line 109
    .line 110
    iput v2, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟ۧ:I

    .line 111
    .line 112
    const/4 v1, 0x1

    .line 113
    iput-boolean v1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۢ۠:Z

    .line 114
    .line 115
    new-instance v3, Landroid/graphics/Paint;

    .line 116
    .line 117
    invoke-direct {v3, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 118
    .line 119
    .line 120
    iput-object v3, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۣۡ:Landroid/graphics/Paint;

    .line 121
    .line 122
    new-instance v3, Landroid/graphics/Paint;

    .line 123
    .line 124
    invoke-direct {v3, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 125
    .line 126
    .line 127
    iput-object v3, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۢ:Landroid/graphics/Paint;

    .line 128
    .line 129
    invoke-virtual {v3, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 130
    .line 131
    .line 132
    iget-boolean v2, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۢۡ:Z

    .line 133
    .line 134
    if-eqz v2, :cond_0

    .line 135
    .line 136
    iget-object v2, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۢ:Landroid/graphics/Paint;

    .line 137
    .line 138
    iget v3, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ:I

    .line 139
    .line 140
    int-to-float v3, v3

    .line 141
    const/4 v4, 0x0

    .line 142
    iget v5, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟:I

    .line 143
    .line 144
    int-to-float v5, v5

    .line 145
    iget v6, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟۟:I

    .line 146
    .line 147
    invoke-virtual {v2, v3, v4, v5, v6}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 148
    .line 149
    .line 150
    :cond_0
    new-instance v2, Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;

    .line 151
    .line 152
    invoke-direct {v2}, Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;-><init>()V

    .line 153
    .line 154
    .line 155
    iput-object v2, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۤ:Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;

    .line 156
    .line 157
    new-instance v2, Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;

    .line 158
    .line 159
    invoke-direct {v2}, Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;-><init>()V

    .line 160
    .line 161
    .line 162
    iput-object v2, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۥ:Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;

    .line 163
    .line 164
    new-instance v2, Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;

    .line 165
    .line 166
    invoke-direct {v2}, Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;-><init>()V

    .line 167
    .line 168
    .line 169
    iput-object v2, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۦ:Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;

    .line 170
    .line 171
    const/4 v2, 0x2

    .line 172
    new-array v2, v2, [F

    .line 173
    .line 174
    fill-array-data v2, :array_0

    .line 175
    .line 176
    .line 177
    invoke-static {v2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    iput-object v2, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۨ:Landroid/animation/ValueAnimator;

    .line 182
    .line 183
    const/16 v3, 0xc8

    .line 184
    .line 185
    int-to-long v3, v3

    .line 186
    invoke-virtual {v2, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 187
    .line 188
    .line 189
    iget-object v2, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۨ:Landroid/animation/ValueAnimator;

    .line 190
    .line 191
    invoke-virtual {v2, v0}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 192
    .line 193
    .line 194
    iget-object v2, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۨ:Landroid/animation/ValueAnimator;

    .line 195
    .line 196
    iget-object v3, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۣ:Lcom/skyhand/hookhand/dialog/view/SwitchButton$b;

    .line 197
    .line 198
    invoke-virtual {v2, v3}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 199
    .line 200
    .line 201
    iget-object v2, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۨ:Landroid/animation/ValueAnimator;

    .line 202
    .line 203
    iget-object v3, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۣ۟:Lcom/skyhand/hookhand/dialog/view/SwitchButton$c;

    .line 204
    .line 205
    invoke-virtual {v2, v3}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 206
    .line 207
    .line 208
    invoke-super {p0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {p0, v0, v0, v0, v0}, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->setPadding(IIII)V

    .line 212
    .line 213
    .line 214
    const/4 v0, 0x0

    .line 215
    invoke-virtual {p0, v1, v0}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 216
    .line 217
    .line 218
    return-void

    .line 219
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public final ۥ۟۠()V
    .locals 5

    .line 1
    iget v0, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۧ:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    move v1, v2

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v1, v3

    .line 11
    :goto_0
    const/4 v4, 0x3

    .line 12
    if-nez v1, :cond_3

    .line 13
    .line 14
    if-eq v0, v2, :cond_2

    .line 15
    .line 16
    if-ne v0, v4, :cond_1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    move v2, v3

    .line 20
    :cond_2
    :goto_1
    if-eqz v2, :cond_6

    .line 21
    .line 22
    :cond_3
    iget-object v0, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۨ:Landroid/animation/ValueAnimator;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_4

    .line 29
    .line 30
    iget-object v0, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۨ:Landroid/animation/ValueAnimator;

    .line 31
    .line 32
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 33
    .line 34
    .line 35
    :cond_4
    iput v4, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۧ:I

    .line 36
    .line 37
    iget-object v0, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۥ:Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;

    .line 38
    .line 39
    iget-object v1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۤ:Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;

    .line 40
    .line 41
    invoke-static {v0, v1}, Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;->ۥ(Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->isChecked()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_5

    .line 49
    .line 50
    iget-object v0, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۦ:Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;

    .line 51
    .line 52
    invoke-direct {p0, v0}, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->setCheckedViewState(Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;)V

    .line 53
    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_5
    iget-object v0, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۦ:Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;

    .line 57
    .line 58
    invoke-direct {p0, v0}, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->setUncheckViewState(Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;)V

    .line 59
    .line 60
    .line 61
    :goto_2
    iget-object v0, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۨ:Landroid/animation/ValueAnimator;

    .line 62
    .line 63
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 64
    .line 65
    .line 66
    :cond_6
    return-void
.end method

.method public final ۥ۟ۡ(ZZ)V
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۢۥ:Z

    if-nez v0, :cond_9

    iget-boolean v0, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۢۤ:Z

    if-nez v0, :cond_2

    iget-boolean p1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۢ۟:Z

    xor-int/lit8 p1, p1, 0x1

    iput-boolean p1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۢ۟:Z

    if-eqz p2, :cond_1

    invoke-virtual {p0}, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ()V

    :cond_1
    return-void

    :cond_2
    iget-object v0, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۨ:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۨ:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_3
    iget-boolean v0, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۢ۠:Z

    if-eqz v0, :cond_6

    if-nez p1, :cond_4

    goto :goto_1

    :cond_4
    const/4 p1, 0x5

    iput p1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۧ:I

    iget-object p1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۥ:Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;

    iget-object p2, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۤ:Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;

    invoke-static {p1, p2}, Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;->ۥ(Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;)V

    invoke-virtual {p0}, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->isChecked()Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۦ:Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;

    invoke-direct {p0, p1}, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->setUncheckViewState(Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;)V

    goto :goto_0

    :cond_5
    iget-object p1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۦ:Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;

    invoke-direct {p0, p1}, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->setCheckedViewState(Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;)V

    :goto_0
    iget-object p1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۨ:Landroid/animation/ValueAnimator;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    return-void

    :cond_6
    :goto_1
    iget-boolean p1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۢ۟:Z

    xor-int/lit8 p1, p1, 0x1

    iput-boolean p1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۢ۟:Z

    invoke-virtual {p0}, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->isChecked()Z

    move-result p1

    if-eqz p1, :cond_7

    iget-object p1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۤ:Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;

    invoke-direct {p0, p1}, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->setCheckedViewState(Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;)V

    goto :goto_2

    :cond_7
    iget-object p1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۤ:Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;

    invoke-direct {p0, p1}, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->setUncheckViewState(Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;)V

    :goto_2
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    if-eqz p2, :cond_8

    invoke-virtual {p0}, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ()V

    :cond_8
    return-void

    :cond_9
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "should NOT switch the state in method: [onCheckedChanged]!"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
