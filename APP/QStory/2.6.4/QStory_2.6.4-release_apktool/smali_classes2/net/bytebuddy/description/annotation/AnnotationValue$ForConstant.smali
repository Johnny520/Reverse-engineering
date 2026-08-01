.class public Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;
.super Lnet/bytebuddy/description/annotation/AnnotationValue$AbstractBase;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/description/annotation/AnnotationValue;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForConstant"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$Loaded;,
        Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<U:",
        "Ljava/lang/Object;",
        ">",
        "Lnet/bytebuddy/description/annotation/AnnotationValue$AbstractBase<",
        "TU;TU;>;"
    }
.end annotation


# instance fields
.field private transient synthetic hashCode:I

.field private final propertyDelegate:Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate;

.field private final value:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TU;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TU;",
            "Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/description/annotation/AnnotationValue$AbstractBase;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;->value:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;->propertyDelegate:Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate;

    .line 7
    .line 8
    return-void
.end method

.method public static of(B)Lnet/bytebuddy/description/annotation/AnnotationValue;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(B)",
            "Lnet/bytebuddy/description/annotation/AnnotationValue<",
            "Ljava/lang/Byte;",
            "Ljava/lang/Byte;",
            ">;"
        }
    .end annotation

    .line 242
    new-instance v0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;

    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p0

    sget-object v1, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate$ForNonArrayType;->BYTE:Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate$ForNonArrayType;

    invoke-direct {v0, p0, v1}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;-><init>(Ljava/lang/Object;Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate;)V

    return-object v0
.end method

.method public static of(C)Lnet/bytebuddy/description/annotation/AnnotationValue;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(C)",
            "Lnet/bytebuddy/description/annotation/AnnotationValue<",
            "Ljava/lang/Character;",
            "Ljava/lang/Character;",
            ">;"
        }
    .end annotation

    .line 244
    new-instance v0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;

    invoke-static {p0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p0

    sget-object v1, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate$ForNonArrayType;->CHARACTER:Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate$ForNonArrayType;

    invoke-direct {v0, p0, v1}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;-><init>(Ljava/lang/Object;Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate;)V

    return-object v0
.end method

.method public static of(D)Lnet/bytebuddy/description/annotation/AnnotationValue;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(D)",
            "Lnet/bytebuddy/description/annotation/AnnotationValue<",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    .line 248
    new-instance v0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;

    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    sget-object p1, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate$ForNonArrayType;->DOUBLE:Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate$ForNonArrayType;

    invoke-direct {v0, p0, p1}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;-><init>(Ljava/lang/Object;Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate;)V

    return-object v0
.end method

.method public static of(F)Lnet/bytebuddy/description/annotation/AnnotationValue;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)",
            "Lnet/bytebuddy/description/annotation/AnnotationValue<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    .line 247
    new-instance v0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    sget-object v1, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate$ForNonArrayType;->FLOAT:Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate$ForNonArrayType;

    invoke-direct {v0, p0, v1}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;-><init>(Ljava/lang/Object;Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate;)V

    return-object v0
.end method

.method public static of(I)Lnet/bytebuddy/description/annotation/AnnotationValue;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lnet/bytebuddy/description/annotation/AnnotationValue<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 245
    new-instance v0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    sget-object v1, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate$ForNonArrayType;->INTEGER:Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate$ForNonArrayType;

    invoke-direct {v0, p0, v1}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;-><init>(Ljava/lang/Object;Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate;)V

    return-object v0
.end method

.method public static of(J)Lnet/bytebuddy/description/annotation/AnnotationValue;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Lnet/bytebuddy/description/annotation/AnnotationValue<",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 246
    new-instance v0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    sget-object p1, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate$ForNonArrayType;->LONG:Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate$ForNonArrayType;

    invoke-direct {v0, p0, p1}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;-><init>(Ljava/lang/Object;Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate;)V

    return-object v0
.end method

.method public static of(Ljava/lang/Object;)Lnet/bytebuddy/description/annotation/AnnotationValue;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Lnet/bytebuddy/description/annotation/AnnotationValue<",
            "**>;"
        }
    .end annotation

    .line 1
    instance-of v0, p0, Ljava/lang/Boolean;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ljava/lang/Boolean;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    invoke-static {p0}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;->of(Z)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    instance-of v0, p0, Ljava/lang/Byte;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    check-cast p0, Ljava/lang/Byte;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Byte;->byteValue()B

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    invoke-static {p0}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;->of(B)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :cond_1
    instance-of v0, p0, Ljava/lang/Short;

    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    check-cast p0, Ljava/lang/Short;

    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/lang/Short;->shortValue()S

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    invoke-static {p0}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;->of(S)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0

    .line 46
    :cond_2
    instance-of v0, p0, Ljava/lang/Character;

    .line 47
    .line 48
    if-eqz v0, :cond_3

    .line 49
    .line 50
    check-cast p0, Ljava/lang/Character;

    .line 51
    .line 52
    invoke-virtual {p0}, Ljava/lang/Character;->charValue()C

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    invoke-static {p0}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;->of(C)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0

    .line 61
    :cond_3
    instance-of v0, p0, Ljava/lang/Integer;

    .line 62
    .line 63
    if-eqz v0, :cond_4

    .line 64
    .line 65
    check-cast p0, Ljava/lang/Integer;

    .line 66
    .line 67
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    invoke-static {p0}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;->of(I)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0

    .line 76
    :cond_4
    instance-of v0, p0, Ljava/lang/Long;

    .line 77
    .line 78
    if-eqz v0, :cond_5

    .line 79
    .line 80
    check-cast p0, Ljava/lang/Long;

    .line 81
    .line 82
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 83
    .line 84
    .line 85
    move-result-wide v0

    .line 86
    invoke-static {v0, v1}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;->of(J)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :cond_5
    instance-of v0, p0, Ljava/lang/Float;

    .line 92
    .line 93
    if-eqz v0, :cond_6

    .line 94
    .line 95
    check-cast p0, Ljava/lang/Float;

    .line 96
    .line 97
    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    .line 98
    .line 99
    .line 100
    move-result p0

    .line 101
    invoke-static {p0}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;->of(F)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    return-object p0

    .line 106
    :cond_6
    instance-of v0, p0, Ljava/lang/Double;

    .line 107
    .line 108
    if-eqz v0, :cond_7

    .line 109
    .line 110
    check-cast p0, Ljava/lang/Double;

    .line 111
    .line 112
    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    .line 113
    .line 114
    .line 115
    move-result-wide v0

    .line 116
    invoke-static {v0, v1}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;->of(D)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    return-object p0

    .line 121
    :cond_7
    instance-of v0, p0, Ljava/lang/String;

    .line 122
    .line 123
    if-eqz v0, :cond_8

    .line 124
    .line 125
    check-cast p0, Ljava/lang/String;

    .line 126
    .line 127
    invoke-static {p0}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;->of(Ljava/lang/String;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    return-object p0

    .line 132
    :cond_8
    instance-of v0, p0, [Z

    .line 133
    .line 134
    if-eqz v0, :cond_9

    .line 135
    .line 136
    check-cast p0, [Z

    .line 137
    .line 138
    invoke-static {p0}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;->of([Z)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    return-object p0

    .line 143
    :cond_9
    instance-of v0, p0, [B

    .line 144
    .line 145
    if-eqz v0, :cond_a

    .line 146
    .line 147
    check-cast p0, [B

    .line 148
    .line 149
    invoke-static {p0}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;->of([B)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    return-object p0

    .line 154
    :cond_a
    instance-of v0, p0, [S

    .line 155
    .line 156
    if-eqz v0, :cond_b

    .line 157
    .line 158
    check-cast p0, [S

    .line 159
    .line 160
    invoke-static {p0}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;->of([S)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    return-object p0

    .line 165
    :cond_b
    instance-of v0, p0, [C

    .line 166
    .line 167
    if-eqz v0, :cond_c

    .line 168
    .line 169
    check-cast p0, [C

    .line 170
    .line 171
    invoke-static {p0}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;->of([C)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    return-object p0

    .line 176
    :cond_c
    instance-of v0, p0, [I

    .line 177
    .line 178
    if-eqz v0, :cond_d

    .line 179
    .line 180
    check-cast p0, [I

    .line 181
    .line 182
    invoke-static {p0}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;->of([I)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    return-object p0

    .line 187
    :cond_d
    instance-of v0, p0, [J

    .line 188
    .line 189
    if-eqz v0, :cond_e

    .line 190
    .line 191
    check-cast p0, [J

    .line 192
    .line 193
    invoke-static {p0}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;->of([J)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    return-object p0

    .line 198
    :cond_e
    instance-of v0, p0, [F

    .line 199
    .line 200
    if-eqz v0, :cond_f

    .line 201
    .line 202
    check-cast p0, [F

    .line 203
    .line 204
    invoke-static {p0}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;->of([F)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    return-object p0

    .line 209
    :cond_f
    instance-of v0, p0, [D

    .line 210
    .line 211
    if-eqz v0, :cond_10

    .line 212
    .line 213
    check-cast p0, [D

    .line 214
    .line 215
    invoke-static {p0}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;->of([D)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 216
    .line 217
    .line 218
    move-result-object p0

    .line 219
    return-object p0

    .line 220
    :cond_10
    instance-of v0, p0, [Ljava/lang/String;

    .line 221
    .line 222
    if-eqz v0, :cond_11

    .line 223
    .line 224
    check-cast p0, [Ljava/lang/String;

    .line 225
    .line 226
    invoke-static {p0}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;->of([Ljava/lang/String;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 227
    .line 228
    .line 229
    move-result-object p0

    .line 230
    return-object p0

    .line 231
    :cond_11
    const-string v0, "Not a constant annotation value: "

    .line 232
    .line 233
    invoke-static {p0, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object p0

    .line 237
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    const/4 p0, 0x0

    .line 241
    return-object p0
.end method

.method public static of(Ljava/lang/String;)Lnet/bytebuddy/description/annotation/AnnotationValue;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lnet/bytebuddy/description/annotation/AnnotationValue<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 249
    new-instance v0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;

    sget-object v1, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate$ForNonArrayType;->STRING:Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate$ForNonArrayType;

    invoke-direct {v0, p0, v1}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;-><init>(Ljava/lang/Object;Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate;)V

    return-object v0
.end method

.method public static of(S)Lnet/bytebuddy/description/annotation/AnnotationValue;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(S)",
            "Lnet/bytebuddy/description/annotation/AnnotationValue<",
            "Ljava/lang/Short;",
            "Ljava/lang/Short;",
            ">;"
        }
    .end annotation

    .line 243
    new-instance v0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;

    invoke-static {p0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p0

    sget-object v1, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate$ForNonArrayType;->SHORT:Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate$ForNonArrayType;

    invoke-direct {v0, p0, v1}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;-><init>(Ljava/lang/Object;Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate;)V

    return-object v0
.end method

.method public static of(Z)Lnet/bytebuddy/description/annotation/AnnotationValue;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lnet/bytebuddy/description/annotation/AnnotationValue<",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 259
    new-instance v0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    sget-object v1, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate$ForNonArrayType;->BOOLEAN:Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate$ForNonArrayType;

    invoke-direct {v0, p0, v1}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;-><init>(Ljava/lang/Object;Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate;)V

    return-object v0
.end method

.method public static varargs of([B)Lnet/bytebuddy/description/annotation/AnnotationValue;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)",
            "Lnet/bytebuddy/description/annotation/AnnotationValue<",
            "[B[B>;"
        }
    .end annotation

    .line 251
    new-instance v0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;

    sget-object v1, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate$ForArrayType;->BYTE:Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate$ForArrayType;

    invoke-direct {v0, p0, v1}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;-><init>(Ljava/lang/Object;Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate;)V

    return-object v0
.end method

.method public static varargs of([C)Lnet/bytebuddy/description/annotation/AnnotationValue;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([C)",
            "Lnet/bytebuddy/description/annotation/AnnotationValue<",
            "[C[C>;"
        }
    .end annotation

    .line 253
    new-instance v0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;

    sget-object v1, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate$ForArrayType;->CHARACTER:Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate$ForArrayType;

    invoke-direct {v0, p0, v1}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;-><init>(Ljava/lang/Object;Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate;)V

    return-object v0
.end method

.method public static varargs of([D)Lnet/bytebuddy/description/annotation/AnnotationValue;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([D)",
            "Lnet/bytebuddy/description/annotation/AnnotationValue<",
            "[D[D>;"
        }
    .end annotation

    .line 257
    new-instance v0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;

    sget-object v1, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate$ForArrayType;->DOUBLE:Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate$ForArrayType;

    invoke-direct {v0, p0, v1}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;-><init>(Ljava/lang/Object;Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate;)V

    return-object v0
.end method

.method public static varargs of([F)Lnet/bytebuddy/description/annotation/AnnotationValue;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([F)",
            "Lnet/bytebuddy/description/annotation/AnnotationValue<",
            "[F[F>;"
        }
    .end annotation

    .line 256
    new-instance v0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;

    sget-object v1, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate$ForArrayType;->FLOAT:Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate$ForArrayType;

    invoke-direct {v0, p0, v1}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;-><init>(Ljava/lang/Object;Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate;)V

    return-object v0
.end method

.method public static varargs of([I)Lnet/bytebuddy/description/annotation/AnnotationValue;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([I)",
            "Lnet/bytebuddy/description/annotation/AnnotationValue<",
            "[I[I>;"
        }
    .end annotation

    .line 254
    new-instance v0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;

    sget-object v1, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate$ForArrayType;->INTEGER:Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate$ForArrayType;

    invoke-direct {v0, p0, v1}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;-><init>(Ljava/lang/Object;Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate;)V

    return-object v0
.end method

.method public static varargs of([J)Lnet/bytebuddy/description/annotation/AnnotationValue;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([J)",
            "Lnet/bytebuddy/description/annotation/AnnotationValue<",
            "[J[J>;"
        }
    .end annotation

    .line 255
    new-instance v0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;

    sget-object v1, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate$ForArrayType;->LONG:Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate$ForArrayType;

    invoke-direct {v0, p0, v1}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;-><init>(Ljava/lang/Object;Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate;)V

    return-object v0
.end method

.method public static varargs of([Ljava/lang/String;)Lnet/bytebuddy/description/annotation/AnnotationValue;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            ")",
            "Lnet/bytebuddy/description/annotation/AnnotationValue<",
            "[",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 258
    new-instance v0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;

    sget-object v1, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate$ForArrayType;->STRING:Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate$ForArrayType;

    invoke-direct {v0, p0, v1}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;-><init>(Ljava/lang/Object;Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate;)V

    return-object v0
.end method

.method public static varargs of([S)Lnet/bytebuddy/description/annotation/AnnotationValue;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([S)",
            "Lnet/bytebuddy/description/annotation/AnnotationValue<",
            "[S[S>;"
        }
    .end annotation

    .line 252
    new-instance v0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;

    sget-object v1, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate$ForArrayType;->SHORT:Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate$ForArrayType;

    invoke-direct {v0, p0, v1}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;-><init>(Ljava/lang/Object;Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate;)V

    return-object v0
.end method

.method public static varargs of([Z)Lnet/bytebuddy/description/annotation/AnnotationValue;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([Z)",
            "Lnet/bytebuddy/description/annotation/AnnotationValue<",
            "[Z[Z>;"
        }
    .end annotation

    .line 250
    new-instance v0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;

    sget-object v1, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate$ForArrayType;->BOOLEAN:Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate$ForArrayType;

    invoke-direct {v0, p0, v1}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;-><init>(Ljava/lang/Object;Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate;)V

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    if-eq p0, p1, :cond_1

    .line 2
    .line 3
    instance-of v0, p1, Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;->propertyDelegate:Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate;

    .line 8
    .line 9
    iget-object p0, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;->value:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p1, Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 12
    .line 13
    invoke-interface {p1}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-interface {v0, p0, p1}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 p0, 0x0

    .line 25
    return p0

    .line 26
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 27
    return p0
.end method

.method public filter(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/description/annotation/AnnotationValue;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            ")",
            "Lnet/bytebuddy/description/annotation/AnnotationValue<",
            "TU;TU;>;"
        }
    .end annotation

    .line 1
    invoke-interface {p2}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-interface {p2}, Lnet/bytebuddy/description/type/TypeDescription;->asBoxed()Lnet/bytebuddy/description/type/TypeDescription;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    iget-object v0, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;->value:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {p2, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-eqz p2, :cond_0

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    iget-object p2, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;->value:Ljava/lang/Object;

    .line 23
    .line 24
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    invoke-virtual {p2}, Ljava/lang/Class;->isArray()Z

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    if-eqz p2, :cond_1

    .line 33
    .line 34
    new-instance p2, Lnet/bytebuddy/description/annotation/AnnotationValue$ForMismatchedType;

    .line 35
    .line 36
    sget-object v0, Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;->CURRENT:Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;

    .line 37
    .line 38
    iget-object p0, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;->value:Ljava/lang/Object;

    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {p0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-static {p0}, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;->of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-virtual {v0, p0}, Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;->toArrayErrorString(Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-direct {p2, p1, p0}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForMismatchedType;-><init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return-object p2

    .line 64
    :cond_1
    iget-object p2, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;->value:Ljava/lang/Object;

    .line 65
    .line 66
    instance-of p2, p2, Ljava/lang/Enum;

    .line 67
    .line 68
    if-eqz p2, :cond_2

    .line 69
    .line 70
    new-instance p2, Lnet/bytebuddy/description/annotation/AnnotationValue$ForMismatchedType;

    .line 71
    .line 72
    new-instance v0, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 75
    .line 76
    .line 77
    iget-object v1, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;->value:Ljava/lang/Object;

    .line 78
    .line 79
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const/16 v1, 0x2e

    .line 91
    .line 92
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    iget-object p0, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;->value:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast p0, Ljava/lang/Enum;

    .line 98
    .line 99
    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-direct {p2, p1, p0}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForMismatchedType;-><init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    return-object p2

    .line 114
    :cond_2
    new-instance p2, Lnet/bytebuddy/description/annotation/AnnotationValue$ForMismatchedType;

    .line 115
    .line 116
    new-instance v0, Ljava/lang/StringBuilder;

    .line 117
    .line 118
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 119
    .line 120
    .line 121
    sget-object v1, Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;->CURRENT:Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;

    .line 122
    .line 123
    iget-object v2, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;->value:Ljava/lang/Object;

    .line 124
    .line 125
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    invoke-virtual {v1, v2}, Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;->toTypeErrorString(Ljava/lang/Class;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    const/16 v1, 0x5b

    .line 137
    .line 138
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    iget-object p0, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;->value:Ljava/lang/Object;

    .line 142
    .line 143
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    const/16 p0, 0x5d

    .line 147
    .line 148
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    invoke-direct {p2, p1, p0}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForMismatchedType;-><init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    return-object p2
.end method

.method public getSort()Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;->value:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDescription;->asUnboxed()Lnet/bytebuddy/description/type/TypeDescription;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {p0}, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;->of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public getState()Lnet/bytebuddy/description/annotation/AnnotationValue$State;
    .locals 0

    .line 1
    sget-object p0, Lnet/bytebuddy/description/annotation/AnnotationValue$State;->RESOLVED:Lnet/bytebuddy/description/annotation/AnnotationValue$State;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 2
    .annotation runtime Lnet/bytebuddy/build/CachedReturnPlugin$Enhance;
        value = "hashCode"
    .end annotation

    .line 1
    iget v0, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;->hashCode:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    iget-object v0, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;->propertyDelegate:Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate;

    .line 8
    .line 9
    iget-object v1, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;->value:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-interface {v0, v1}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate;->hashCode(Ljava/lang/Object;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    :goto_0
    if-nez v0, :cond_1

    .line 16
    .line 17
    iget p0, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;->hashCode:I

    .line 18
    .line 19
    return p0

    .line 20
    :cond_1
    iput v0, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;->hashCode:I

    .line 21
    .line 22
    return v0
.end method

.method public load(Ljava/lang/ClassLoader;)Lnet/bytebuddy/description/annotation/AnnotationValue$Loaded;
    .locals 1
    .param p1    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            ")",
            "Lnet/bytebuddy/description/annotation/AnnotationValue$Loaded<",
            "TU;>;"
        }
    .end annotation

    .line 1
    new-instance p1, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$Loaded;

    .line 2
    .line 3
    iget-object v0, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;->value:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;->propertyDelegate:Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate;

    .line 6
    .line 7
    invoke-direct {p1, v0, p0}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$Loaded;-><init>(Ljava/lang/Object;Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public resolve()Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TU;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;->value:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;->propertyDelegate:Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;->value:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-interface {v0, p0}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method
