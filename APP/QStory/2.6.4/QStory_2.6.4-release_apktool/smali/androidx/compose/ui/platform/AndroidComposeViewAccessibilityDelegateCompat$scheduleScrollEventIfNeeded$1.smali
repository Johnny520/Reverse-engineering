.class final Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1;
.super Lkotlin/jvm/internal/Lambda;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u5170\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "invoke",
        "()V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation


# instance fields
.field final synthetic $scrollObservationScope:Landroidx/compose/ui/platform/飘花落叶言子哲苏楪兰世;

.field final synthetic this$0:Landroidx/compose/ui/platform/飘花落叶言子楪兰哲世苏;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/platform/飘花落叶言子哲苏楪兰世;Landroidx/compose/ui/platform/飘花落叶言子楪兰哲世苏;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1;->$scrollObservationScope:Landroidx/compose/ui/platform/飘花落叶言子哲苏楪兰世;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1;->this$0:Landroidx/compose/ui/platform/飘花落叶言子楪兰哲世苏;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    .line 219
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1;->invoke()V

    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    return-object p0
.end method

.method public final invoke()V
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1;->$scrollObservationScope:Landroidx/compose/ui/platform/飘花落叶言子哲苏楪兰世;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/compose/ui/platform/飘花落叶言子哲苏楪兰世;->飘花落叶言子楪兰世哲苏:Landroidx/compose/ui/semantics/飘花落叶言子楪苏哲世兰;

    .line 4
    .line 5
    iget-object v2, v0, Landroidx/compose/ui/platform/飘花落叶言子哲苏楪兰世;->飘花落叶言子楪兰苏世哲:Landroidx/compose/ui/semantics/飘花落叶言子楪苏哲世兰;

    .line 6
    .line 7
    iget-object v3, v0, Landroidx/compose/ui/platform/飘花落叶言子哲苏楪兰世;->飘花落叶言子楪哲兰苏世:Ljava/lang/Float;

    .line 8
    .line 9
    iget-object v0, v0, Landroidx/compose/ui/platform/飘花落叶言子哲苏楪兰世;->飘花落叶言子楪兰世苏哲:Ljava/lang/Float;

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    iget-object v5, v1, Landroidx/compose/ui/semantics/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;

    .line 17
    .line 18
    invoke-interface {v5}, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;->invoke()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    check-cast v5, Ljava/lang/Number;

    .line 23
    .line 24
    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    sub-float/2addr v5, v3

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move v5, v4

    .line 35
    :goto_0
    if-eqz v2, :cond_1

    .line 36
    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    iget-object v3, v2, Landroidx/compose/ui/semantics/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;

    .line 40
    .line 41
    invoke-interface {v3}, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;->invoke()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    check-cast v3, Ljava/lang/Number;

    .line 46
    .line 47
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    sub-float/2addr v3, v0

    .line 56
    goto :goto_1

    .line 57
    :cond_1
    move v3, v4

    .line 58
    :goto_1
    cmpg-float v0, v5, v4

    .line 59
    .line 60
    if-nez v0, :cond_2

    .line 61
    .line 62
    cmpg-float v0, v3, v4

    .line 63
    .line 64
    if-nez v0, :cond_2

    .line 65
    .line 66
    goto/16 :goto_2

    .line 67
    .line 68
    :cond_2
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1;->this$0:Landroidx/compose/ui/platform/飘花落叶言子楪兰哲世苏;

    .line 69
    .line 70
    iget-object v3, p0, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1;->$scrollObservationScope:Landroidx/compose/ui/platform/飘花落叶言子哲苏楪兰世;

    .line 71
    .line 72
    iget v3, v3, Landroidx/compose/ui/platform/飘花落叶言子哲苏楪兰世;->飘花落叶言子楪哲苏兰世:I

    .line 73
    .line 74
    sget-object v4, Landroidx/compose/ui/platform/飘花落叶言子楪兰哲世苏;->飘花落叶言子苏世楪哲兰:Landroidx/collection/飘花落叶言子世楪哲兰苏;

    .line 75
    .line 76
    invoke-virtual {v0, v3}, Landroidx/compose/ui/platform/飘花落叶言子楪兰哲世苏;->飘花落叶言子世楪哲苏兰(I)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    iget-object v3, p0, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1;->this$0:Landroidx/compose/ui/platform/飘花落叶言子楪兰哲世苏;

    .line 81
    .line 82
    invoke-virtual {v3}, Landroidx/compose/ui/platform/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪兰世苏哲()Landroidx/collection/飘花落叶言子楪哲世兰苏;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    iget-object v4, p0, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1;->this$0:Landroidx/compose/ui/platform/飘花落叶言子楪兰哲世苏;

    .line 87
    .line 88
    iget v4, v4, Landroidx/compose/ui/platform/飘花落叶言子楪兰哲世苏;->飘花落叶言子世楪苏兰哲:I

    .line 89
    .line 90
    invoke-virtual {v3, v4}, Landroidx/collection/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    check-cast v3, Landroidx/compose/ui/semantics/飘花落叶言子楪哲兰世苏;

    .line 95
    .line 96
    if-eqz v3, :cond_3

    .line 97
    .line 98
    iget-object v4, p0, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1;->this$0:Landroidx/compose/ui/platform/飘花落叶言子楪兰哲世苏;

    .line 99
    .line 100
    :try_start_0
    iget-object v5, v4, Landroidx/compose/ui/platform/飘花落叶言子楪兰哲世苏;->飘花落叶言子世楪哲兰苏:L飘花落叶言子哲世苏楪兰/飘花落叶言子楪世兰哲苏;

    .line 101
    .line 102
    if-eqz v5, :cond_3

    .line 103
    .line 104
    invoke-virtual {v4, v3}, Landroidx/compose/ui/platform/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏兰世哲(Landroidx/compose/ui/semantics/飘花落叶言子楪哲兰世苏;)Landroid/graphics/Rect;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    invoke-virtual {v5, v3}, L飘花落叶言子哲世苏楪兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰(Landroid/graphics/Rect;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 109
    .line 110
    .line 111
    :catch_0
    :cond_3
    iget-object v3, p0, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1;->this$0:Landroidx/compose/ui/platform/飘花落叶言子楪兰哲世苏;

    .line 112
    .line 113
    invoke-virtual {v3}, Landroidx/compose/ui/platform/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪兰世苏哲()Landroidx/collection/飘花落叶言子楪哲世兰苏;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    iget-object v4, p0, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1;->this$0:Landroidx/compose/ui/platform/飘花落叶言子楪兰哲世苏;

    .line 118
    .line 119
    iget v4, v4, Landroidx/compose/ui/platform/飘花落叶言子楪兰哲世苏;->飘花落叶言子世楪哲苏兰:I

    .line 120
    .line 121
    invoke-virtual {v3, v4}, Landroidx/collection/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    check-cast v3, Landroidx/compose/ui/semantics/飘花落叶言子楪哲兰世苏;

    .line 126
    .line 127
    if-eqz v3, :cond_4

    .line 128
    .line 129
    iget-object v4, p0, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1;->this$0:Landroidx/compose/ui/platform/飘花落叶言子楪兰哲世苏;

    .line 130
    .line 131
    :try_start_1
    iget-object v5, v4, Landroidx/compose/ui/platform/飘花落叶言子楪兰哲世苏;->飘花落叶言子世楪兰苏哲:L飘花落叶言子哲世苏楪兰/飘花落叶言子楪世兰哲苏;

    .line 132
    .line 133
    if-eqz v5, :cond_4

    .line 134
    .line 135
    invoke-virtual {v4, v3}, Landroidx/compose/ui/platform/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏兰世哲(Landroidx/compose/ui/semantics/飘花落叶言子楪哲兰世苏;)Landroid/graphics/Rect;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    invoke-virtual {v5, v3}, L飘花落叶言子哲世苏楪兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰(Landroid/graphics/Rect;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    .line 140
    .line 141
    .line 142
    :catch_1
    :cond_4
    iget-object v3, p0, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1;->this$0:Landroidx/compose/ui/platform/飘花落叶言子楪兰哲世苏;

    .line 143
    .line 144
    iget-object v3, v3, Landroidx/compose/ui/platform/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪兰世苏哲:Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;

    .line 145
    .line 146
    invoke-virtual {v3}, Landroid/view/View;->invalidate()V

    .line 147
    .line 148
    .line 149
    iget-object v3, p0, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1;->this$0:Landroidx/compose/ui/platform/飘花落叶言子楪兰哲世苏;

    .line 150
    .line 151
    invoke-virtual {v3}, Landroidx/compose/ui/platform/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪兰世苏哲()Landroidx/collection/飘花落叶言子楪哲世兰苏;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    invoke-virtual {v3, v0}, Landroidx/collection/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    check-cast v3, Landroidx/compose/ui/semantics/飘花落叶言子楪哲兰世苏;

    .line 160
    .line 161
    if-eqz v3, :cond_7

    .line 162
    .line 163
    iget-object v3, v3, Landroidx/compose/ui/semantics/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/semantics/飘花落叶言子楪哲苏兰世;

    .line 164
    .line 165
    if-eqz v3, :cond_7

    .line 166
    .line 167
    iget-object v3, v3, Landroidx/compose/ui/semantics/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰:Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;

    .line 168
    .line 169
    if-eqz v3, :cond_7

    .line 170
    .line 171
    iget-object v4, p0, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1;->this$0:Landroidx/compose/ui/platform/飘花落叶言子楪兰哲世苏;

    .line 172
    .line 173
    if-eqz v1, :cond_5

    .line 174
    .line 175
    iget-object v5, v4, Landroidx/compose/ui/platform/飘花落叶言子楪兰哲世苏;->飘花落叶言子世苏楪哲兰:Landroidx/collection/飘花落叶言子世楪兰苏哲;

    .line 176
    .line 177
    invoke-virtual {v5, v0, v1}, Landroidx/collection/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪苏世兰哲(ILjava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    :cond_5
    if-eqz v2, :cond_6

    .line 181
    .line 182
    iget-object v5, v4, Landroidx/compose/ui/platform/飘花落叶言子楪兰哲世苏;->飘花落叶言子世苏楪兰哲:Landroidx/collection/飘花落叶言子世楪兰苏哲;

    .line 183
    .line 184
    invoke-virtual {v5, v0, v2}, Landroidx/collection/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪苏世兰哲(ILjava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    :cond_6
    invoke-virtual {v4, v3}, Landroidx/compose/ui/platform/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪兰哲世苏(Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;)V

    .line 188
    .line 189
    .line 190
    :cond_7
    :goto_2
    if-eqz v1, :cond_8

    .line 191
    .line 192
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1;->$scrollObservationScope:Landroidx/compose/ui/platform/飘花落叶言子哲苏楪兰世;

    .line 193
    .line 194
    iget-object v1, v1, Landroidx/compose/ui/semantics/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;

    .line 195
    .line 196
    invoke-interface {v1}, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;->invoke()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    check-cast v1, Ljava/lang/Float;

    .line 201
    .line 202
    iput-object v1, v0, Landroidx/compose/ui/platform/飘花落叶言子哲苏楪兰世;->飘花落叶言子楪哲兰苏世:Ljava/lang/Float;

    .line 203
    .line 204
    :cond_8
    if-eqz v2, :cond_9

    .line 205
    .line 206
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1;->$scrollObservationScope:Landroidx/compose/ui/platform/飘花落叶言子哲苏楪兰世;

    .line 207
    .line 208
    iget-object v0, v2, Landroidx/compose/ui/semantics/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;

    .line 209
    .line 210
    invoke-interface {v0}, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;->invoke()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    check-cast v0, Ljava/lang/Float;

    .line 215
    .line 216
    iput-object v0, p0, Landroidx/compose/ui/platform/飘花落叶言子哲苏楪兰世;->飘花落叶言子楪兰世苏哲:Ljava/lang/Float;

    .line 217
    .line 218
    :cond_9
    return-void
.end method
