.class final Landroidx/compose/ui/window/AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/window/AndroidPopup_androidKt$Popup$popupLayout$1$1$1;->invoke(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u5170\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "invoke",
        "(Landroidx/compose/runtime/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u54f2\u4e16\u5170;I)V",
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
.field final synthetic $currentContent$delegate:Landroidx/compose/runtime/飘花落叶言子哲兰世楪苏;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u54f2\u5170\u4e16\u696a\u82cf;"
        }
    .end annotation
.end field

.field final synthetic $this_apply:Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;Landroidx/compose/runtime/飘花落叶言子哲兰世楪苏;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/window/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u4e16\u54f2\u82cf;",
            "Landroidx/compose/runtime/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u54f2\u5170\u4e16\u696a\u82cf;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/window/AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1;->$this_apply:Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/ui/window/AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1;->$currentContent$delegate:Landroidx/compose/runtime/飘花落叶言子哲兰世楪苏;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 202
    check-cast p1, Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/window/AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1;->invoke(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)V

    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    return-object p0
.end method

.method public final invoke(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)V
    .locals 12

    .line 1
    and-int/lit8 v0, p2, 0x3

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    move v0, v3

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v0, v2

    .line 11
    :goto_0
    and-int/2addr p2, v3

    .line 12
    check-cast p1, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;

    .line 13
    .line 14
    invoke-virtual {p1, p2, v0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世哲兰楪苏(IZ)Z

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    if-eqz p2, :cond_8

    .line 19
    .line 20
    invoke-virtual {p1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世哲楪兰苏()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    sget-object v0, Landroidx/compose/runtime/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/飘花落叶言子楪世哲兰苏;

    .line 25
    .line 26
    if-ne p2, v0, :cond_1

    .line 27
    .line 28
    sget-object p2, Landroidx/compose/ui/window/AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1$1$1;->INSTANCE:Landroidx/compose/ui/window/AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1$1$1;

    .line 29
    .line 30
    invoke-virtual {p1, p2}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏世哲兰楪(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    check-cast p2, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;

    .line 34
    .line 35
    sget-object v1, Landroidx/compose/ui/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/飘花落叶言子楪哲世苏兰;

    .line 36
    .line 37
    invoke-static {v1, v2, p2}, Landroidx/compose/ui/semantics/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;ZL飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    iget-object v1, p0, Landroidx/compose/ui/window/AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1;->$this_apply:Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;

    .line 42
    .line 43
    invoke-virtual {p1, v1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    iget-object v4, p0, Landroidx/compose/ui/window/AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1;->$this_apply:Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;

    .line 48
    .line 49
    invoke-virtual {p1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世哲楪兰苏()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    if-nez v1, :cond_2

    .line 54
    .line 55
    if-ne v5, v0, :cond_3

    .line 56
    .line 57
    :cond_2
    new-instance v5, Landroidx/compose/ui/window/AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1$2$1;

    .line 58
    .line 59
    invoke-direct {v5, v4}, Landroidx/compose/ui/window/AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1$2$1;-><init>(Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, v5}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏世哲兰楪(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    :cond_3
    check-cast v5, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;

    .line 66
    .line 67
    invoke-static {p2, v5}, Landroidx/compose/ui/layout/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪哲苏世兰(Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    iget-object p2, p0, Landroidx/compose/ui/window/AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1;->$this_apply:Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;

    .line 72
    .line 73
    invoke-virtual {p2}, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->getCanCalculatePosition()Z

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    const/high16 v1, 0x3f800000    # 1.0f

    .line 78
    .line 79
    if-eqz p2, :cond_4

    .line 80
    .line 81
    move v7, v1

    .line 82
    goto :goto_1

    .line 83
    :cond_4
    const/4 p2, 0x0

    .line 84
    move v7, p2

    .line 85
    :goto_1
    cmpg-float p2, v7, v1

    .line 86
    .line 87
    if-nez p2, :cond_5

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_5
    const/4 v10, 0x1

    .line 91
    const v11, 0x7effb

    .line 92
    .line 93
    .line 94
    const/4 v8, 0x0

    .line 95
    const/4 v9, 0x0

    .line 96
    invoke-static/range {v6 .. v11}, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪哲兰苏世(Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;FFLandroidx/compose/ui/graphics/飘花落叶言子世兰楪哲苏;ZI)Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    :goto_2
    iget-object p0, p0, Landroidx/compose/ui/window/AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1;->$currentContent$delegate:Landroidx/compose/runtime/飘花落叶言子哲兰世楪苏;

    .line 101
    .line 102
    sget-object p2, Landroidx/compose/ui/window/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/飘花落叶言子楪兰世苏哲;

    .line 103
    .line 104
    invoke-interface {p0}, Landroidx/compose/runtime/飘花落叶言子哲兰世楪苏;->getValue()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    check-cast p0, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;

    .line 109
    .line 110
    invoke-virtual {p1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世哲楪兰苏()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    if-ne p2, v0, :cond_6

    .line 115
    .line 116
    sget-object p2, Landroidx/compose/ui/window/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Landroidx/compose/ui/window/飘花落叶言子楪世苏兰哲;

    .line 117
    .line 118
    invoke-virtual {p1, p2}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏世哲兰楪(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    :cond_6
    check-cast p2, Landroidx/compose/ui/layout/飘花落叶言子世兰苏楪哲;

    .line 122
    .line 123
    iget-wide v0, p1, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世兰苏哲楪:J

    .line 124
    .line 125
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    invoke-virtual {p1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏兰哲世()Landroidx/compose/runtime/internal/飘花落叶言子楪苏哲世兰;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    invoke-static {p1, v6}, Landroidx/compose/ui/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;)Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    sget-object v5, Landroidx/compose/ui/node/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:Landroidx/compose/ui/node/飘花落叶言子楪世兰哲苏;

    .line 138
    .line 139
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    sget-object v5, Landroidx/compose/ui/node/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;

    .line 143
    .line 144
    invoke-virtual {p1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏楪哲兰世()V

    .line 145
    .line 146
    .line 147
    iget-boolean v6, p1, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世兰苏楪哲:Z

    .line 148
    .line 149
    if-eqz v6, :cond_7

    .line 150
    .line 151
    invoke-virtual {p1, v5}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏兰世哲(L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;)V

    .line 152
    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_7
    invoke-virtual {p1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏哲楪世兰()V

    .line 156
    .line 157
    .line 158
    :goto_3
    sget-object v5, Landroidx/compose/ui/node/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;

    .line 159
    .line 160
    invoke-static {p1, p2, v5}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子世哲苏兰楪(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;Ljava/lang/Object;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;)V

    .line 161
    .line 162
    .line 163
    sget-object p2, Landroidx/compose/ui/node/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;

    .line 164
    .line 165
    invoke-static {p1, v1, p2}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子世哲苏兰楪(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;Ljava/lang/Object;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;)V

    .line 166
    .line 167
    .line 168
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 169
    .line 170
    .line 171
    move-result-object p2

    .line 172
    sget-object v0, Landroidx/compose/ui/node/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世哲兰:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;

    .line 173
    .line 174
    invoke-static {p1, p2, v0}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子世哲苏兰楪(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;Ljava/lang/Object;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;)V

    .line 175
    .line 176
    .line 177
    sget-object p2, Landroidx/compose/ui/node/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;

    .line 178
    .line 179
    invoke-static {p1, p2}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子世苏楪兰哲(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)V

    .line 180
    .line 181
    .line 182
    sget-object p2, Landroidx/compose/ui/node/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;

    .line 183
    .line 184
    invoke-static {p1, v4, p2}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子世哲苏兰楪(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;Ljava/lang/Object;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;)V

    .line 185
    .line 186
    .line 187
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 188
    .line 189
    .line 190
    move-result-object p2

    .line 191
    invoke-interface {p0, p1, p2}, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    invoke-virtual {p1, v3}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲苏兰世(Z)V

    .line 195
    .line 196
    .line 197
    return-void

    .line 198
    :cond_8
    invoke-virtual {p1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世兰楪哲苏()V

    .line 199
    .line 200
    .line 201
    return-void
.end method
