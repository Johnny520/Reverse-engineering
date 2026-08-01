.class public final synthetic Lbsh/飘花落叶言子楪兰世苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Ljava/lang/Class;

.field public final synthetic 飘花落叶言子楪哲兰苏世:Ljava/util/ArrayList;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Class;Ljava/util/ArrayList;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lbsh/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲苏兰世:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lbsh/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Class;

    .line 8
    .line 9
    iput-object p2, p0, Lbsh/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:Ljava/util/ArrayList;

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/ArrayList;Ljava/lang/Class;)V
    .locals 1

    .line 12
    const/4 v0, 0x0

    iput v0, p0, Lbsh/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲苏兰世:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbsh/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:Ljava/util/ArrayList;

    iput-object p2, p0, Lbsh/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 5

    .line 1
    iget v0, p0, Lbsh/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget-object v1, p0, Lbsh/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object p0, p0, Lbsh/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Class;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Ljava/lang/reflect/Field;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-nez v2, :cond_1

    .line 21
    .line 22
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isTransient(I)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-nez p0, :cond_1

    .line 37
    .line 38
    const-string p0, "this$0"

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-eqz p0, :cond_0

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    :cond_1
    :goto_0
    return-void

    .line 55
    :pswitch_0
    check-cast p1, Ljava/lang/reflect/Method;

    .line 56
    .line 57
    invoke-interface {v1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    new-instance v1, Lbsh/飘花落叶言子楪兰世哲苏;

    .line 62
    .line 63
    const/4 v2, 0x0

    .line 64
    invoke-direct {v1, p1, v2}, Lbsh/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/Object;I)V

    .line 65
    .line 66
    .line 67
    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    new-instance v1, Lbsh/飘花落叶言子楪兰苏世哲;

    .line 72
    .line 73
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->sorted(Ljava/util/Comparator;)Ljava/util/stream/Stream;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    new-instance v1, Lbsh/飘花落叶言子楪哲世兰苏;

    .line 81
    .line 82
    const/4 v3, 0x1

    .line 83
    invoke-direct {v1, v3}, Lbsh/飘花落叶言子楪哲世兰苏;-><init>(I)V

    .line 84
    .line 85
    .line 86
    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->toArray(Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    check-cast v0, [Ljava/lang/reflect/Method;

    .line 91
    .line 92
    array-length v1, v0

    .line 93
    if-nez v1, :cond_3

    .line 94
    .line 95
    invoke-static {p0}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/Class;)Lbsh/Modifiers;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    const-string v4, "abstract"

    .line 100
    .line 101
    invoke-virtual {v1, v4}, Lbsh/Modifiers;->hasModifier(Ljava/lang/String;)Z

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    if-eqz v1, :cond_2

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_2
    new-instance v0, Ljava/lang/RuntimeException;

    .line 109
    .line 110
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    new-instance v2, Ljava/lang/StringBuilder;

    .line 127
    .line 128
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    const-string p0, " is not abstract and does not override abstract method "

    .line 135
    .line 136
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    const-string p0, "() in "

    .line 143
    .line 144
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    throw v0

    .line 158
    :cond_3
    :goto_1
    array-length p0, v0

    .line 159
    if-lez p0, :cond_5

    .line 160
    .line 161
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 162
    .line 163
    .line 164
    move-result p0

    .line 165
    aget-object v0, v0, v2

    .line 166
    .line 167
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    and-int/lit8 p0, p0, 0x7

    .line 176
    .line 177
    and-int/lit8 v0, v0, 0x7

    .line 178
    .line 179
    if-eq v0, p0, :cond_5

    .line 180
    .line 181
    const/4 v1, 0x2

    .line 182
    if-eq p0, v1, :cond_5

    .line 183
    .line 184
    if-eq v0, v3, :cond_5

    .line 185
    .line 186
    if-nez p0, :cond_4

    .line 187
    .line 188
    if-eq v0, v1, :cond_4

    .line 189
    .line 190
    goto :goto_2

    .line 191
    :cond_4
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    const-string p1, "Cannot reduce the visibility of the inherited method from "

    .line 196
    .line 197
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    :cond_5
    :goto_2
    return-void

    .line 205
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
