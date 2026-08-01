.class public final Lr0/L1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/hardware/SensorEventListener;


# instance fields
.field public final synthetic a:Lr0/M1;

.field public final synthetic b:Landroid/content/Context;


# direct methods
.method public constructor <init>(Lr0/M1;Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr0/L1;->a:Lr0/M1;

    .line 5
    .line 6
    iput-object p2, p0, Lr0/L1;->b:Landroid/content/Context;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 6

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_0

    .line 4
    .line 5
    :cond_0
    iget-object v0, p1, Landroid/hardware/SensorEvent;->sensor:Landroid/hardware/Sensor;

    .line 6
    .line 7
    if-eqz v0, :cond_4

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/hardware/Sensor;->getType()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x1

    .line 14
    if-ne v0, v1, :cond_4

    .line 15
    .line 16
    sget-boolean v0, Lz0/i;->a:Z

    .line 17
    .line 18
    invoke-static {}, Lz0/g;->s()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_4

    .line 23
    .line 24
    invoke-static {}, Lz0/g;->k()Lcom/lu/wxmask/bean/OptionData;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Lcom/lu/wxmask/bean/OptionData;->getShakeHideTemporary()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_4

    .line 33
    .line 34
    invoke-static {}, Lz0/g;->p()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    iget-object v0, p1, Landroid/hardware/SensorEvent;->values:[F

    .line 42
    .line 43
    const-string v2, "values"

    .line 44
    .line 45
    invoke-static {v0, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const/4 v3, 0x0

    .line 49
    invoke-static {v0, v3}, LF0/h;->e0([FI)Ljava/lang/Float;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    if-eqz v0, :cond_4

    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    iget-object v3, p1, Landroid/hardware/SensorEvent;->values:[F

    .line 60
    .line 61
    invoke-static {v3, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-static {v3, v1}, LF0/h;->e0([FI)Ljava/lang/Float;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    if-eqz v1, :cond_4

    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    iget-object p1, p1, Landroid/hardware/SensorEvent;->values:[F

    .line 75
    .line 76
    invoke-static {p1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    const/4 v2, 0x2

    .line 80
    invoke-static {p1, v2}, LF0/h;->e0([FI)Ljava/lang/Float;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    if-eqz p1, :cond_4

    .line 85
    .line 86
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    mul-float/2addr v0, v0

    .line 91
    mul-float/2addr v1, v1

    .line 92
    add-float/2addr v1, v0

    .line 93
    mul-float/2addr p1, p1

    .line 94
    add-float/2addr p1, v1

    .line 95
    float-to-double v0, p1

    .line 96
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    .line 97
    .line 98
    .line 99
    move-result-wide v0

    .line 100
    double-to-float p1, v0

    .line 101
    const v0, 0x411ce80a

    .line 102
    .line 103
    .line 104
    div-float/2addr p1, v0

    .line 105
    const v0, 0x402ccccd    # 2.7f

    .line 106
    .line 107
    .line 108
    cmpg-float p1, p1, v0

    .line 109
    .line 110
    if-gez p1, :cond_2

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 114
    .line 115
    .line 116
    move-result-wide v0

    .line 117
    iget-object p1, p0, Lr0/L1;->a:Lr0/M1;

    .line 118
    .line 119
    iget-wide v2, p1, Lr0/M1;->d:J

    .line 120
    .line 121
    sub-long v2, v0, v2

    .line 122
    .line 123
    const-wide/16 v4, 0x4b0

    .line 124
    .line 125
    cmp-long v2, v2, v4

    .line 126
    .line 127
    if-gez v2, :cond_3

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_3
    iput-wide v0, p1, Lr0/M1;->d:J

    .line 131
    .line 132
    iget-object p1, p0, Lr0/L1;->b:Landroid/content/Context;

    .line 133
    .line 134
    invoke-static {p1}, Lr0/M1;->d(Landroid/content/Context;)V

    .line 135
    .line 136
    .line 137
    :cond_4
    :goto_0
    return-void
.end method
