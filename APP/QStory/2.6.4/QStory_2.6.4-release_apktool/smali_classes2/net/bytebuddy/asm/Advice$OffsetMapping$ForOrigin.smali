.class public Lnet/bytebuddy/asm/Advice$OffsetMapping$ForOrigin;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/asm/Advice$OffsetMapping;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$OffsetMapping;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForOrigin"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/Advice$OffsetMapping$ForOrigin$Factory;,
        Lnet/bytebuddy/asm/Advice$OffsetMapping$ForOrigin$Renderer;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field private static final DELIMITER:C = '#'

.field private static final ESCAPE:C = '\\'


# instance fields
.field private final renderers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnet/bytebuddy/asm/Advice$OffsetMapping$ForOrigin$Renderer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lnet/bytebuddy/asm/Advice$OffsetMapping$ForOrigin$Renderer;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForOrigin;->renderers:Ljava/util/List;

    .line 5
    .line 6
    return-void
.end method

.method public static parse(Ljava/lang/String;)Lnet/bytebuddy/asm/Advice$OffsetMapping;
    .locals 9

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForOrigin;

    .line 10
    .line 11
    sget-object v0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForOrigin$Renderer$ForStringRepresentation;->INSTANCE:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForOrigin$Renderer$ForStringRepresentation;

    .line 12
    .line 13
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-direct {p0, v0}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForOrigin;-><init>(Ljava/util/List;)V

    .line 18
    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 28
    .line 29
    .line 30
    const/16 v1, 0x23

    .line 31
    .line 32
    invoke-virtual {p0, v1}, Ljava/lang/String;->indexOf(I)I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    const/4 v3, 0x0

    .line 37
    move v4, v3

    .line 38
    :goto_0
    const/4 v5, -0x1

    .line 39
    if-eq v2, v5, :cond_7

    .line 40
    .line 41
    if-eqz v2, :cond_2

    .line 42
    .line 43
    add-int/lit8 v5, v2, -0x1

    .line 44
    .line 45
    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    const/16 v7, 0x5c

    .line 50
    .line 51
    if-ne v6, v7, :cond_2

    .line 52
    .line 53
    const/4 v6, 0x1

    .line 54
    if-eq v2, v6, :cond_1

    .line 55
    .line 56
    add-int/lit8 v6, v2, -0x2

    .line 57
    .line 58
    invoke-virtual {p0, v6}, Ljava/lang/String;->charAt(I)C

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    if-eq v6, v7, :cond_2

    .line 63
    .line 64
    :cond_1
    new-instance v6, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForOrigin$Renderer$ForConstantValue;

    .line 65
    .line 66
    invoke-static {v3, v5}, Ljava/lang/Math;->max(II)I

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    invoke-virtual {p0, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    const-string v5, "#"

    .line 75
    .line 76
    invoke-virtual {v4, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    invoke-direct {v6, v4}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForOrigin$Renderer$ForConstantValue;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    add-int/lit8 v2, v2, 0x1

    .line 87
    .line 88
    :goto_1
    move v4, v2

    .line 89
    goto/16 :goto_3

    .line 90
    .line 91
    :cond_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    add-int/lit8 v6, v2, 0x1

    .line 96
    .line 97
    if-eq v5, v6, :cond_6

    .line 98
    .line 99
    new-instance v5, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForOrigin$Renderer$ForConstantValue;

    .line 100
    .line 101
    invoke-virtual {p0, v4, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    const-string v7, "\\\\"

    .line 106
    .line 107
    const-string v8, "\\"

    .line 108
    .line 109
    invoke-virtual {v4, v7, v8}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    invoke-direct {v5, v4}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForOrigin$Renderer$ForConstantValue;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0, v6}, Ljava/lang/String;->charAt(I)C

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    const/16 v5, 0x64

    .line 124
    .line 125
    if-eq v4, v5, :cond_5

    .line 126
    .line 127
    const/16 v5, 0x6d

    .line 128
    .line 129
    if-eq v4, v5, :cond_4

    .line 130
    .line 131
    const/16 v5, 0x70

    .line 132
    .line 133
    if-eq v4, v5, :cond_3

    .line 134
    .line 135
    packed-switch v4, :pswitch_data_0

    .line 136
    .line 137
    .line 138
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 139
    .line 140
    invoke-virtual {p0, v6}, Ljava/lang/String;->charAt(I)C

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    new-instance v2, Ljava/lang/StringBuilder;

    .line 145
    .line 146
    const-string v3, "Illegal sort descriptor "

    .line 147
    .line 148
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    const-string v1, " for "

    .line 155
    .line 156
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    throw v0

    .line 170
    :pswitch_0
    sget-object v4, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForOrigin$Renderer$ForTypeName;->INSTANCE:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForOrigin$Renderer$ForTypeName;

    .line 171
    .line 172
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    goto :goto_2

    .line 176
    :pswitch_1
    sget-object v4, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForOrigin$Renderer$ForJavaSignature;->INSTANCE:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForOrigin$Renderer$ForJavaSignature;

    .line 177
    .line 178
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    goto :goto_2

    .line 182
    :pswitch_2
    sget-object v4, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForOrigin$Renderer$ForReturnTypeName;->INSTANCE:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForOrigin$Renderer$ForReturnTypeName;

    .line 183
    .line 184
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    goto :goto_2

    .line 188
    :cond_3
    sget-object v4, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForOrigin$Renderer$ForPropertyName;->INSTANCE:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForOrigin$Renderer$ForPropertyName;

    .line 189
    .line 190
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    goto :goto_2

    .line 194
    :cond_4
    sget-object v4, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForOrigin$Renderer$ForMethodName;->INSTANCE:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForOrigin$Renderer$ForMethodName;

    .line 195
    .line 196
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    goto :goto_2

    .line 200
    :cond_5
    sget-object v4, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForOrigin$Renderer$ForDescriptor;->INSTANCE:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForOrigin$Renderer$ForDescriptor;

    .line 201
    .line 202
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    :goto_2
    add-int/lit8 v2, v2, 0x2

    .line 206
    .line 207
    goto :goto_1

    .line 208
    :goto_3
    invoke-virtual {p0, v1, v4}, Ljava/lang/String;->indexOf(II)I

    .line 209
    .line 210
    .line 211
    move-result v2

    .line 212
    goto/16 :goto_0

    .line 213
    .line 214
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 215
    .line 216
    new-instance v1, Ljava/lang/StringBuilder;

    .line 217
    .line 218
    const-string v3, "Missing sort descriptor for "

    .line 219
    .line 220
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    const-string p0, " at index "

    .line 227
    .line 228
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object p0

    .line 238
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    throw v0

    .line 242
    :cond_7
    new-instance v1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForOrigin$Renderer$ForConstantValue;

    .line 243
    .line 244
    invoke-virtual {p0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object p0

    .line 248
    invoke-direct {v1, p0}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForOrigin$Renderer$ForConstantValue;-><init>(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    new-instance p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForOrigin;

    .line 255
    .line 256
    invoke-direct {p0, v0}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForOrigin;-><init>(Ljava/util/List;)V

    .line 257
    .line 258
    .line 259
    return-object p0

    .line 260
    nop

    .line 261
    :pswitch_data_0
    .packed-switch 0x72
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-nez p1, :cond_1

    .line 7
    .line 8
    return v1

    .line 9
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-eq v2, v3, :cond_2

    .line 18
    .line 19
    return v1

    .line 20
    :cond_2
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForOrigin;->renderers:Ljava/util/List;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForOrigin;

    .line 23
    .line 24
    iget-object p1, p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForOrigin;->renderers:Ljava/util/List;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-nez p0, :cond_3

    .line 31
    .line 32
    return v1

    .line 33
    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    mul-int/lit8 v0, v0, 0x1f

    .line 10
    .line 11
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForOrigin;->renderers:Ljava/util/List;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    add-int/2addr p0, v0

    .line 18
    return p0
.end method

.method public resolve(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/asm/Advice$ArgumentHandler;Lnet/bytebuddy/asm/Advice$OffsetMapping$Sort;)Lnet/bytebuddy/asm/Advice$OffsetMapping$Target;
    .locals 0

    .line 1
    new-instance p3, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForOrigin;->renderers:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result p4

    .line 16
    if-eqz p4, :cond_0

    .line 17
    .line 18
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p4

    .line 22
    check-cast p4, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForOrigin$Renderer;

    .line 23
    .line 24
    invoke-interface {p4, p1, p2}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForOrigin$Renderer;->apply(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p4

    .line 28
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-static {p0}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForStackManipulation;->of(Ljava/lang/Object;)Lnet/bytebuddy/asm/Advice$OffsetMapping$Target;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0
.end method
