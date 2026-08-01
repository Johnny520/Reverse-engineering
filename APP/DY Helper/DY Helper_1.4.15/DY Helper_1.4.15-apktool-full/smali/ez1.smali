.class public final synthetic Lez1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnDragListener;


# instance fields
.field public final synthetic α:Landroid/widget/LinearLayout;

.field public final synthetic β:Landroid/app/Activity;

.field public final synthetic γ:Lxx;

.field public final synthetic δ:Z

.field public final synthetic ε:Lgz1;

.field public final synthetic ζ:Lky1;

.field public final synthetic η:Lcu1;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/LinearLayout;Landroid/app/Activity;Lxx;ZLgz1;Lky1;Lcu1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lez1;->α:Landroid/widget/LinearLayout;

    .line 5
    .line 6
    iput-object p2, p0, Lez1;->β:Landroid/app/Activity;

    .line 7
    .line 8
    iput-object p3, p0, Lez1;->γ:Lxx;

    .line 9
    .line 10
    iput-boolean p4, p0, Lez1;->δ:Z

    .line 11
    .line 12
    iput-object p5, p0, Lez1;->ε:Lgz1;

    .line 13
    .line 14
    iput-object p6, p0, Lez1;->ζ:Lky1;

    .line 15
    .line 16
    iput-object p7, p0, Lez1;->η:Lcu1;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final onDrag(Landroid/view/View;Landroid/view/DragEvent;)Z
    .locals 6

    .line 1
    sget-object p1, Ljz1;->α:Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lez1;->α:Landroid/widget/LinearLayout;

    .line 7
    .line 8
    invoke-static {p1, p2}, Ljz1;->θ(Landroid/view/View;Landroid/view/DragEvent;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2}, Landroid/view/DragEvent;->getAction()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x3

    .line 16
    if-eq v0, v1, :cond_3

    .line 17
    .line 18
    iget-object v1, p0, Lez1;->β:Landroid/app/Activity;

    .line 19
    .line 20
    iget-object v2, p0, Lez1;->γ:Lxx;

    .line 21
    .line 22
    const/16 v3, 0xc

    .line 23
    .line 24
    const/4 v4, 0x4

    .line 25
    if-eq v0, v4, :cond_1

    .line 26
    .line 27
    const/4 v5, 0x5

    .line 28
    if-eq v0, v5, :cond_0

    .line 29
    .line 30
    const/4 v5, 0x6

    .line 31
    if-eq v0, v5, :cond_1

    .line 32
    .line 33
    goto/16 :goto_5

    .line 34
    .line 35
    :cond_0
    iget-object p0, v2, Lxx;->μ:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v3, v1, p0}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {p1, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 42
    .line 43
    .line 44
    goto/16 :goto_5

    .line 45
    .line 46
    :cond_1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 47
    .line 48
    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 49
    .line 50
    .line 51
    iget-object v0, v2, Lxx;->Α:Ljava/lang/String;

    .line 52
    .line 53
    iget-boolean p0, p0, Lez1;->δ:Z

    .line 54
    .line 55
    if-eqz p0, :cond_2

    .line 56
    .line 57
    iget-object p0, v2, Lxx;->κ:Ljava/lang/String;

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    iget-object p0, v2, Lxx;->σ:Ljava/lang/String;

    .line 61
    .line 62
    :goto_0
    invoke-static {v3, v1, v0, p0}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-virtual {p1, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p2}, Landroid/view/DragEvent;->getAction()I

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    if-ne p0, v4, :cond_a

    .line 74
    .line 75
    invoke-static {}, Ljz1;->ω()V

    .line 76
    .line 77
    .line 78
    goto/16 :goto_5

    .line 79
    .line 80
    :cond_3
    invoke-virtual {p2}, Landroid/view/DragEvent;->getLocalState()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    instance-of p2, p1, Lky1;

    .line 85
    .line 86
    const/4 v0, 0x0

    .line 87
    if-eqz p2, :cond_4

    .line 88
    .line 89
    check-cast p1, Lky1;

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_4
    move-object p1, v0

    .line 93
    :goto_1
    if-nez p1, :cond_5

    .line 94
    .line 95
    goto :goto_5

    .line 96
    :cond_5
    iget-object p2, p0, Lez1;->ε:Lgz1;

    .line 97
    .line 98
    iget-object p2, p2, Lgz1;->α:Ljava/lang/String;

    .line 99
    .line 100
    const-string v1, "__ungrouped__"

    .line 101
    .line 102
    invoke-virtual {p2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    if-nez v1, :cond_6

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_6
    move-object p2, v0

    .line 110
    :goto_2
    if-nez p2, :cond_7

    .line 111
    .line 112
    sget-object p2, Lry1;->α:Lry1;

    .line 113
    .line 114
    invoke-static {p1, v0}, Lry1;->А(Lky1;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    goto :goto_4

    .line 118
    :cond_7
    sget-object v0, Lry1;->α:Lry1;

    .line 119
    .line 120
    iget-object v0, p0, Lez1;->ζ:Lky1;

    .line 121
    .line 122
    invoke-static {v0}, Lry1;->ｐ(Lky1;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    const-string v1, "spark_person_groups_v1"

    .line 127
    .line 128
    invoke-static {}, Lui1;->Α()Z

    .line 129
    .line 130
    .line 131
    move-result v2

    .line 132
    if-nez v2, :cond_8

    .line 133
    .line 134
    goto :goto_4

    .line 135
    :cond_8
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    .line 136
    .line 137
    const-string v3, "{}"

    .line 138
    .line 139
    invoke-static {v1, v3}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    invoke-direct {v2, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 144
    .line 145
    .line 146
    goto :goto_3

    .line 147
    :catchall_0
    move-exception v2

    .line 148
    new-instance v3, Leo1;

    .line 149
    .line 150
    invoke-direct {v3, v2}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 151
    .line 152
    .line 153
    move-object v2, v3

    .line 154
    :goto_3
    new-instance v3, Lorg/json/JSONObject;

    .line 155
    .line 156
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 157
    .line 158
    .line 159
    instance-of v4, v2, Leo1;

    .line 160
    .line 161
    if-eqz v4, :cond_9

    .line 162
    .line 163
    move-object v2, v3

    .line 164
    :cond_9
    check-cast v2, Lorg/json/JSONObject;

    .line 165
    .line 166
    sget-object v3, Lry1;->α:Lry1;

    .line 167
    .line 168
    invoke-static {p1}, Lry1;->ｐ(Lky1;)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    invoke-virtual {v2, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 173
    .line 174
    .line 175
    sget-object v3, Lui1;->α:Ljava/lang/Object;

    .line 176
    .line 177
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    invoke-static {v1, v2}, Lui1;->Ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    invoke-static {p1, p2, v0}, Lry1;->Я(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    :goto_4
    iget-object p0, p0, Lez1;->η:Lcu1;

    .line 191
    .line 192
    invoke-virtual {p0}, Lcu1;->invoke()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    :cond_a
    :goto_5
    const/4 p0, 0x1

    .line 196
    return p0
.end method
