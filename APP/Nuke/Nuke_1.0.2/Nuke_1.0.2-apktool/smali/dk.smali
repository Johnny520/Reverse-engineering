.class public final Ldk;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Ln92;
.implements Lz93;


# instance fields
.field public final synthetic h:I

.field public i:I

.field public j:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ldk;->h:I

    .line 34
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object v0, p0, Ldk;->j:Ljava/lang/Object;

    const/16 v0, 0x64

    .line 37
    iput v0, p0, Ldk;->i:I

    return-void
.end method

.method public synthetic constructor <init>(BI)V
    .locals 0

    .line 40
    iput p2, p0, Ldk;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ldk;->h:I

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    new-instance v0, Lv01;

    invoke-direct {v0, p1}, Lv01;-><init>(I)V

    iput-object v0, p0, Ldk;->j:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(IILjava/lang/Object;)V
    .locals 0

    .line 31
    iput p2, p0, Ldk;->h:I

    iput-object p3, p0, Ldk;->j:Ljava/lang/Object;

    iput p1, p0, Ldk;->i:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(ILgd0;)V
    .locals 2

    const/16 v0, 0xe

    iput v0, p0, Ldk;->h:I

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput p1, p0, Ldk;->i:I

    .line 45
    new-instance v0, Lkj1;

    new-instance v1, Lxj0;

    invoke-direct {v1, p1, p2}, Lxj0;-><init>(ILgd0;)V

    invoke-direct {v0, v1}, Lkj1;-><init>(Lsj0;)V

    iput-object v0, p0, Ldk;->j:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lf31;Lqb2;)V
    .locals 0

    const/4 p1, 0x7

    iput p1, p0, Ldk;->h:I

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p2, p0, Ldk;->j:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/16 v0, 0x9

    iput v0, p0, Ldk;->h:I

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput p2, p0, Ldk;->i:I

    .line 48
    iput-object p1, p0, Ldk;->j:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 1

    const/16 v0, 0xc

    iput v0, p0, Ldk;->h:I

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-object p1, p0, Ldk;->j:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>([B)V
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Ldk;->h:I

    .line 3
    .line 4
    array-length v0, p1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-ltz v0, :cond_1

    .line 10
    .line 11
    array-length v2, p1

    .line 12
    if-gt v0, v2, :cond_0

    .line 13
    .line 14
    iput-object p1, p0, Ldk;->j:Ljava/lang/Object;

    .line 15
    .line 16
    iput v0, p0, Ldk;->i:I

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    const-string p0, "end > bytes.length"

    .line 20
    .line 21
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw v1

    .line 25
    :cond_1
    const-string p0, "end < start"

    .line 26
    .line 27
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw v1
.end method

.method public static final c(Ldk;Lz40;Lrj;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, Ldk;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lqb2;

    .line 4
    .line 5
    instance-of v1, p2, Ln41;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move-object v1, p2

    .line 10
    check-cast v1, Ln41;

    .line 11
    .line 12
    iget v2, v1, Ln41;->r:I

    .line 13
    .line 14
    const/high16 v3, -0x80000000

    .line 15
    .line 16
    and-int v4, v2, v3

    .line 17
    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    sub-int/2addr v2, v3

    .line 21
    iput v2, v1, Ln41;->r:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v1, Ln41;

    .line 25
    .line 26
    invoke-direct {v1, p0, p2}, Ln41;-><init>(Ldk;Lrj;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object p2, v1, Ln41;->p:Ljava/lang/Object;

    .line 30
    .line 31
    iget v2, v1, Ln41;->r:I

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x6

    .line 35
    const/4 v5, 0x0

    .line 36
    const/4 v6, 0x7

    .line 37
    const/4 v7, 0x4

    .line 38
    const/4 v8, 0x1

    .line 39
    if-eqz v2, :cond_4

    .line 40
    .line 41
    if-ne v2, v8, :cond_3

    .line 42
    .line 43
    iget p0, v1, Ln41;->o:I

    .line 44
    .line 45
    iget-object p1, v1, Ln41;->n:Ljava/lang/String;

    .line 46
    .line 47
    iget-object v0, v1, Ln41;->m:Ljava/util/LinkedHashMap;

    .line 48
    .line 49
    iget-object v2, v1, Ln41;->l:Ldk;

    .line 50
    .line 51
    iget-object v9, v1, Ln41;->k:Lz40;

    .line 52
    .line 53
    invoke-static {p2}, Lfg1;->T(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    check-cast p2, Lj31;

    .line 57
    .line 58
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    iget-object p1, v2, Ldk;->j:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p1, Lqb2;

    .line 64
    .line 65
    invoke-virtual {p1}, Lqb2;->f()B

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-eq p1, v7, :cond_2

    .line 70
    .line 71
    if-ne p1, v6, :cond_1

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_1
    iget-object p0, v2, Ldk;->j:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p0, Lqb2;

    .line 77
    .line 78
    const-string p1, "Expected end of the object or comma"

    .line 79
    .line 80
    invoke-static {p0, p1, v5, v4}, Lqb2;->m(Lqb2;Ljava/lang/String;II)V

    .line 81
    .line 82
    .line 83
    throw v3

    .line 84
    :cond_2
    move v5, p0

    .line 85
    move-object p0, v2

    .line 86
    goto :goto_1

    .line 87
    :cond_3
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 88
    .line 89
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    return-object v3

    .line 93
    :cond_4
    invoke-static {p2}, Lfg1;->T(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, v4}, Lqb2;->g(B)B

    .line 97
    .line 98
    .line 99
    move-result p2

    .line 100
    invoke-virtual {v0}, Lqb2;->p()B

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    if-eq v2, v7, :cond_8

    .line 105
    .line 106
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 107
    .line 108
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 109
    .line 110
    .line 111
    move-object v9, p1

    .line 112
    move p1, p2

    .line 113
    :goto_1
    iget-object p2, p0, Ldk;->j:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast p2, Lqb2;

    .line 116
    .line 117
    invoke-virtual {p2}, Lqb2;->c()Z

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    if-eqz v2, :cond_5

    .line 122
    .line 123
    invoke-virtual {p2}, Lqb2;->j()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    const/4 v2, 0x5

    .line 128
    invoke-virtual {p2, v2}, Lqb2;->g(B)B

    .line 129
    .line 130
    .line 131
    iput-object v9, v1, Ln41;->k:Lz40;

    .line 132
    .line 133
    iput-object p0, v1, Ln41;->l:Ldk;

    .line 134
    .line 135
    iput-object v0, v1, Ln41;->m:Ljava/util/LinkedHashMap;

    .line 136
    .line 137
    iput-object p1, v1, Ln41;->n:Ljava/lang/String;

    .line 138
    .line 139
    iput v5, v1, Ln41;->o:I

    .line 140
    .line 141
    iput v8, v1, Ln41;->r:I

    .line 142
    .line 143
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    iput-object v1, v9, Lz40;->i:Lt00;

    .line 147
    .line 148
    sget-object p0, Lk20;->h:Lk20;

    .line 149
    .line 150
    return-object p0

    .line 151
    :cond_5
    move-object v2, p0

    .line 152
    :goto_2
    iget-object p0, v2, Ldk;->j:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast p0, Lqb2;

    .line 155
    .line 156
    if-ne p1, v4, :cond_6

    .line 157
    .line 158
    invoke-virtual {p0, v6}, Lqb2;->g(B)B

    .line 159
    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_6
    if-eq p1, v7, :cond_7

    .line 163
    .line 164
    :goto_3
    new-instance p0, Ld41;

    .line 165
    .line 166
    invoke-direct {p0, v0}, Ld41;-><init>(Ljava/util/Map;)V

    .line 167
    .line 168
    .line 169
    return-object p0

    .line 170
    :cond_7
    const-string p1, "object"

    .line 171
    .line 172
    invoke-static {p0, p1}, Lp7;->x(Lqb2;Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    throw v3

    .line 176
    :cond_8
    const-string p0, "Unexpected leading comma"

    .line 177
    .line 178
    invoke-static {v0, p0, v5, v4}, Lqb2;->m(Lqb2;Ljava/lang/String;II)V

    .line 179
    .line 180
    .line 181
    throw v3
.end method

.method public static h(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Ldk;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    invoke-virtual/range {p0 .. p1}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-static {v2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    :goto_0
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    const/4 v5, 0x1

    .line 18
    const/4 v6, 0x2

    .line 19
    if-eq v4, v6, :cond_0

    .line 20
    .line 21
    if-eq v4, v5, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    if-ne v4, v6, :cond_24

    .line 25
    .line 26
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    const-string v7, "gradient"

    .line 34
    .line 35
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v8

    .line 39
    const/4 v9, 0x3

    .line 40
    const/4 v10, 0x0

    .line 41
    if-nez v8, :cond_2

    .line 42
    .line 43
    const-string v5, "selector"

    .line 44
    .line 45
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    if-eqz v5, :cond_1

    .line 50
    .line 51
    invoke-static {v0, v2, v3, v1}, Lvu;->b(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    new-instance v1, Ldk;

    .line 56
    .line 57
    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    invoke-direct {v1, v0, v9, v10}, Ldk;-><init>(IILjava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    return-object v1

    .line 65
    :cond_1
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 66
    .line 67
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    new-instance v2, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string v1, ": unsupported complex color tag "

    .line 80
    .line 81
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    throw v0

    .line 95
    :cond_2
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v7

    .line 103
    if-eqz v7, :cond_23

    .line 104
    .line 105
    const/4 v4, 0x0

    .line 106
    sget-object v7, Lg52;->b:[I

    .line 107
    .line 108
    if-nez v1, :cond_3

    .line 109
    .line 110
    invoke-virtual {v0, v3, v7}, Landroid/content/res/Resources;->obtainAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 111
    .line 112
    .line 113
    move-result-object v7

    .line 114
    goto :goto_1

    .line 115
    :cond_3
    invoke-virtual {v1, v3, v7, v4, v4}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    :goto_1
    const-string v8, "http://schemas.android.com/apk/res/android"

    .line 120
    .line 121
    const-string v11, "startX"

    .line 122
    .line 123
    invoke-interface {v2, v8, v11}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v11

    .line 127
    const/4 v12, 0x0

    .line 128
    if-eqz v11, :cond_4

    .line 129
    .line 130
    const/16 v11, 0x8

    .line 131
    .line 132
    invoke-virtual {v7, v11, v12}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 133
    .line 134
    .line 135
    move-result v11

    .line 136
    move v14, v11

    .line 137
    goto :goto_2

    .line 138
    :cond_4
    move v14, v12

    .line 139
    :goto_2
    const-string v11, "startY"

    .line 140
    .line 141
    invoke-interface {v2, v8, v11}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v11

    .line 145
    if-eqz v11, :cond_5

    .line 146
    .line 147
    const/16 v11, 0x9

    .line 148
    .line 149
    invoke-virtual {v7, v11, v12}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 150
    .line 151
    .line 152
    move-result v11

    .line 153
    move v15, v11

    .line 154
    goto :goto_3

    .line 155
    :cond_5
    move v15, v12

    .line 156
    :goto_3
    const-string v11, "endX"

    .line 157
    .line 158
    invoke-interface {v2, v8, v11}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v11

    .line 162
    if-eqz v11, :cond_6

    .line 163
    .line 164
    const/16 v11, 0xa

    .line 165
    .line 166
    invoke-virtual {v7, v11, v12}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 167
    .line 168
    .line 169
    move-result v11

    .line 170
    move/from16 v16, v11

    .line 171
    .line 172
    goto :goto_4

    .line 173
    :cond_6
    move/from16 v16, v12

    .line 174
    .line 175
    :goto_4
    const-string v11, "endY"

    .line 176
    .line 177
    invoke-interface {v2, v8, v11}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v11

    .line 181
    if-eqz v11, :cond_7

    .line 182
    .line 183
    const/16 v11, 0xb

    .line 184
    .line 185
    invoke-virtual {v7, v11, v12}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 186
    .line 187
    .line 188
    move-result v11

    .line 189
    move/from16 v17, v11

    .line 190
    .line 191
    goto :goto_5

    .line 192
    :cond_7
    move/from16 v17, v12

    .line 193
    .line 194
    :goto_5
    const-string v11, "centerX"

    .line 195
    .line 196
    invoke-interface {v2, v8, v11}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v11

    .line 200
    if-eqz v11, :cond_8

    .line 201
    .line 202
    invoke-virtual {v7, v9, v12}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 203
    .line 204
    .line 205
    move-result v11

    .line 206
    goto :goto_6

    .line 207
    :cond_8
    move v11, v12

    .line 208
    :goto_6
    const-string v13, "centerY"

    .line 209
    .line 210
    invoke-interface {v2, v8, v13}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v13

    .line 214
    if-eqz v13, :cond_9

    .line 215
    .line 216
    const/4 v13, 0x4

    .line 217
    invoke-virtual {v7, v13, v12}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 218
    .line 219
    .line 220
    move-result v13

    .line 221
    goto :goto_7

    .line 222
    :cond_9
    move v13, v12

    .line 223
    :goto_7
    const-string v10, "type"

    .line 224
    .line 225
    invoke-interface {v2, v8, v10}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v10

    .line 229
    if-eqz v10, :cond_a

    .line 230
    .line 231
    invoke-virtual {v7, v6, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 232
    .line 233
    .line 234
    move-result v10

    .line 235
    goto :goto_8

    .line 236
    :cond_a
    move v10, v4

    .line 237
    :goto_8
    const-string v6, "startColor"

    .line 238
    .line 239
    invoke-interface {v2, v8, v6}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v6

    .line 243
    if-eqz v6, :cond_b

    .line 244
    .line 245
    invoke-virtual {v7, v4, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 246
    .line 247
    .line 248
    move-result v6

    .line 249
    goto :goto_9

    .line 250
    :cond_b
    move v6, v4

    .line 251
    :goto_9
    const-string v9, "centerColor"

    .line 252
    .line 253
    invoke-interface {v2, v8, v9}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v19

    .line 257
    if-eqz v19, :cond_c

    .line 258
    .line 259
    move/from16 v19, v5

    .line 260
    .line 261
    goto :goto_a

    .line 262
    :cond_c
    move/from16 v19, v4

    .line 263
    .line 264
    :goto_a
    invoke-interface {v2, v8, v9}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v9

    .line 268
    if-eqz v9, :cond_d

    .line 269
    .line 270
    const/4 v9, 0x7

    .line 271
    invoke-virtual {v7, v9, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 272
    .line 273
    .line 274
    move-result v9

    .line 275
    goto :goto_b

    .line 276
    :cond_d
    move v9, v4

    .line 277
    :goto_b
    const-string v12, "endColor"

    .line 278
    .line 279
    invoke-interface {v2, v8, v12}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v12

    .line 283
    if-eqz v12, :cond_e

    .line 284
    .line 285
    invoke-virtual {v7, v5, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 286
    .line 287
    .line 288
    move-result v12

    .line 289
    :goto_c
    move/from16 v21, v5

    .line 290
    .line 291
    goto :goto_d

    .line 292
    :cond_e
    move v12, v4

    .line 293
    goto :goto_c

    .line 294
    :goto_d
    const-string v5, "tileMode"

    .line 295
    .line 296
    invoke-interface {v2, v8, v5}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v5

    .line 300
    if-eqz v5, :cond_f

    .line 301
    .line 302
    const/4 v5, 0x6

    .line 303
    invoke-virtual {v7, v5, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 304
    .line 305
    .line 306
    move-result v5

    .line 307
    goto :goto_e

    .line 308
    :cond_f
    move v5, v4

    .line 309
    :goto_e
    const-string v4, "gradientRadius"

    .line 310
    .line 311
    invoke-interface {v2, v8, v4}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v4

    .line 315
    if-eqz v4, :cond_10

    .line 316
    .line 317
    const/4 v4, 0x5

    .line 318
    const/4 v8, 0x0

    .line 319
    invoke-virtual {v7, v4, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 320
    .line 321
    .line 322
    move-result v4

    .line 323
    move v8, v4

    .line 324
    goto :goto_f

    .line 325
    :cond_10
    const/4 v8, 0x0

    .line 326
    :goto_f
    invoke-virtual {v7}, Landroid/content/res/TypedArray;->recycle()V

    .line 327
    .line 328
    .line 329
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    .line 330
    .line 331
    .line 332
    move-result v4

    .line 333
    add-int/lit8 v4, v4, 0x1

    .line 334
    .line 335
    new-instance v7, Ljava/util/ArrayList;

    .line 336
    .line 337
    move-object/from16 v22, v2

    .line 338
    .line 339
    const/16 v2, 0x14

    .line 340
    .line 341
    invoke-direct {v7, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 342
    .line 343
    .line 344
    move/from16 v23, v8

    .line 345
    .line 346
    new-instance v8, Ljava/util/ArrayList;

    .line 347
    .line 348
    invoke-direct {v8, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 349
    .line 350
    .line 351
    :goto_10
    invoke-interface/range {v22 .. v22}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 352
    .line 353
    .line 354
    move-result v2

    .line 355
    move/from16 v24, v14

    .line 356
    .line 357
    move/from16 v14, v21

    .line 358
    .line 359
    if-eq v2, v14, :cond_17

    .line 360
    .line 361
    invoke-interface/range {v22 .. v22}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    .line 362
    .line 363
    .line 364
    move-result v14

    .line 365
    move/from16 v25, v15

    .line 366
    .line 367
    if-ge v14, v4, :cond_11

    .line 368
    .line 369
    const/4 v15, 0x3

    .line 370
    if-eq v2, v15, :cond_18

    .line 371
    .line 372
    :cond_11
    const/4 v15, 0x2

    .line 373
    if-eq v2, v15, :cond_13

    .line 374
    .line 375
    :cond_12
    :goto_11
    move/from16 v14, v24

    .line 376
    .line 377
    move/from16 v15, v25

    .line 378
    .line 379
    const/16 v21, 0x1

    .line 380
    .line 381
    goto :goto_10

    .line 382
    :cond_13
    if-gt v14, v4, :cond_12

    .line 383
    .line 384
    invoke-interface/range {v22 .. v22}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object v2

    .line 388
    const-string v14, "item"

    .line 389
    .line 390
    invoke-virtual {v2, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 391
    .line 392
    .line 393
    move-result v2

    .line 394
    if-nez v2, :cond_14

    .line 395
    .line 396
    goto :goto_11

    .line 397
    :cond_14
    sget-object v2, Lg52;->c:[I

    .line 398
    .line 399
    if-nez v1, :cond_15

    .line 400
    .line 401
    invoke-virtual {v0, v3, v2}, Landroid/content/res/Resources;->obtainAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 402
    .line 403
    .line 404
    move-result-object v2

    .line 405
    const/4 v14, 0x0

    .line 406
    goto :goto_12

    .line 407
    :cond_15
    const/4 v14, 0x0

    .line 408
    invoke-virtual {v1, v3, v2, v14, v14}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 409
    .line 410
    .line 411
    move-result-object v2

    .line 412
    :goto_12
    invoke-virtual {v2, v14}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 413
    .line 414
    .line 415
    move-result v15

    .line 416
    const/4 v14, 0x1

    .line 417
    invoke-virtual {v2, v14}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 418
    .line 419
    .line 420
    move-result v21

    .line 421
    if-eqz v15, :cond_16

    .line 422
    .line 423
    if-eqz v21, :cond_16

    .line 424
    .line 425
    const/4 v15, 0x0

    .line 426
    invoke-virtual {v2, v15, v15}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 427
    .line 428
    .line 429
    move-result v26

    .line 430
    const/4 v15, 0x0

    .line 431
    invoke-virtual {v2, v14, v15}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 432
    .line 433
    .line 434
    move-result v27

    .line 435
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 436
    .line 437
    .line 438
    invoke-static/range {v26 .. v26}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 439
    .line 440
    .line 441
    move-result-object v2

    .line 442
    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 443
    .line 444
    .line 445
    invoke-static/range {v27 .. v27}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 446
    .line 447
    .line 448
    move-result-object v2

    .line 449
    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 450
    .line 451
    .line 452
    goto :goto_11

    .line 453
    :cond_16
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 454
    .line 455
    invoke-interface/range {v22 .. v22}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    move-result-object v1

    .line 459
    new-instance v2, Ljava/lang/StringBuilder;

    .line 460
    .line 461
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 462
    .line 463
    .line 464
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 465
    .line 466
    .line 467
    const-string v1, ": <item> tag requires a \'color\' attribute and a \'offset\' attribute!"

    .line 468
    .line 469
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 470
    .line 471
    .line 472
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 473
    .line 474
    .line 475
    move-result-object v1

    .line 476
    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 477
    .line 478
    .line 479
    throw v0

    .line 480
    :cond_17
    move/from16 v25, v15

    .line 481
    .line 482
    :cond_18
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 483
    .line 484
    .line 485
    move-result v0

    .line 486
    if-lez v0, :cond_19

    .line 487
    .line 488
    new-instance v0, Luo;

    .line 489
    .line 490
    invoke-direct {v0, v8, v7}, Luo;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 491
    .line 492
    .line 493
    goto :goto_13

    .line 494
    :cond_19
    const/4 v0, 0x0

    .line 495
    :goto_13
    if-eqz v0, :cond_1a

    .line 496
    .line 497
    :goto_14
    const/4 v14, 0x1

    .line 498
    goto :goto_15

    .line 499
    :cond_1a
    if-eqz v19, :cond_1b

    .line 500
    .line 501
    new-instance v0, Luo;

    .line 502
    .line 503
    invoke-direct {v0, v6, v9, v12}, Luo;-><init>(III)V

    .line 504
    .line 505
    .line 506
    goto :goto_14

    .line 507
    :cond_1b
    new-instance v0, Luo;

    .line 508
    .line 509
    invoke-direct {v0, v6, v12}, Luo;-><init>(II)V

    .line 510
    .line 511
    .line 512
    goto :goto_14

    .line 513
    :goto_15
    if-eq v10, v14, :cond_1f

    .line 514
    .line 515
    const/4 v15, 0x2

    .line 516
    if-eq v10, v15, :cond_1e

    .line 517
    .line 518
    new-instance v13, Landroid/graphics/LinearGradient;

    .line 519
    .line 520
    iget-object v1, v0, Luo;->a:[I

    .line 521
    .line 522
    iget-object v0, v0, Luo;->b:[F

    .line 523
    .line 524
    if-eq v5, v14, :cond_1d

    .line 525
    .line 526
    if-eq v5, v15, :cond_1c

    .line 527
    .line 528
    sget-object v2, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 529
    .line 530
    :goto_16
    move-object/from16 v19, v0

    .line 531
    .line 532
    move-object/from16 v18, v1

    .line 533
    .line 534
    move-object/from16 v20, v2

    .line 535
    .line 536
    move/from16 v14, v24

    .line 537
    .line 538
    move/from16 v15, v25

    .line 539
    .line 540
    goto :goto_17

    .line 541
    :cond_1c
    sget-object v2, Landroid/graphics/Shader$TileMode;->MIRROR:Landroid/graphics/Shader$TileMode;

    .line 542
    .line 543
    goto :goto_16

    .line 544
    :cond_1d
    sget-object v2, Landroid/graphics/Shader$TileMode;->REPEAT:Landroid/graphics/Shader$TileMode;

    .line 545
    .line 546
    goto :goto_16

    .line 547
    :goto_17
    invoke-direct/range {v13 .. v20}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    .line 548
    .line 549
    .line 550
    goto :goto_1a

    .line 551
    :cond_1e
    new-instance v1, Landroid/graphics/SweepGradient;

    .line 552
    .line 553
    iget-object v2, v0, Luo;->a:[I

    .line 554
    .line 555
    iget-object v0, v0, Luo;->b:[F

    .line 556
    .line 557
    invoke-direct {v1, v11, v13, v2, v0}, Landroid/graphics/SweepGradient;-><init>(FF[I[F)V

    .line 558
    .line 559
    .line 560
    move-object v13, v1

    .line 561
    goto :goto_1a

    .line 562
    :cond_1f
    const/16 v20, 0x0

    .line 563
    .line 564
    cmpg-float v1, v23, v20

    .line 565
    .line 566
    if-lez v1, :cond_22

    .line 567
    .line 568
    const/4 v15, 0x2

    .line 569
    new-instance v18, Landroid/graphics/RadialGradient;

    .line 570
    .line 571
    iget-object v1, v0, Luo;->a:[I

    .line 572
    .line 573
    iget-object v0, v0, Luo;->b:[F

    .line 574
    .line 575
    const/4 v14, 0x1

    .line 576
    if-eq v5, v14, :cond_21

    .line 577
    .line 578
    if-eq v5, v15, :cond_20

    .line 579
    .line 580
    sget-object v2, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 581
    .line 582
    :goto_18
    move-object/from16 v22, v1

    .line 583
    .line 584
    move-object/from16 v24, v2

    .line 585
    .line 586
    move/from16 v19, v11

    .line 587
    .line 588
    move/from16 v20, v13

    .line 589
    .line 590
    move/from16 v21, v23

    .line 591
    .line 592
    move-object/from16 v23, v0

    .line 593
    .line 594
    goto :goto_19

    .line 595
    :cond_20
    sget-object v2, Landroid/graphics/Shader$TileMode;->MIRROR:Landroid/graphics/Shader$TileMode;

    .line 596
    .line 597
    goto :goto_18

    .line 598
    :cond_21
    sget-object v2, Landroid/graphics/Shader$TileMode;->REPEAT:Landroid/graphics/Shader$TileMode;

    .line 599
    .line 600
    goto :goto_18

    .line 601
    :goto_19
    invoke-direct/range {v18 .. v24}, Landroid/graphics/RadialGradient;-><init>(FFF[I[FLandroid/graphics/Shader$TileMode;)V

    .line 602
    .line 603
    .line 604
    move-object/from16 v13, v18

    .line 605
    .line 606
    :goto_1a
    new-instance v0, Ldk;

    .line 607
    .line 608
    const/4 v14, 0x0

    .line 609
    const/4 v15, 0x3

    .line 610
    invoke-direct {v0, v14, v15, v13}, Ldk;-><init>(IILjava/lang/Object;)V

    .line 611
    .line 612
    .line 613
    return-object v0

    .line 614
    :cond_22
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 615
    .line 616
    const-string v1, "<gradient> tag requires \'gradientRadius\' attribute with radial type"

    .line 617
    .line 618
    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 619
    .line 620
    .line 621
    throw v0

    .line 622
    :cond_23
    move-object/from16 v22, v2

    .line 623
    .line 624
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 625
    .line 626
    invoke-interface/range {v22 .. v22}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    .line 627
    .line 628
    .line 629
    move-result-object v1

    .line 630
    new-instance v2, Ljava/lang/StringBuilder;

    .line 631
    .line 632
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 633
    .line 634
    .line 635
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 636
    .line 637
    .line 638
    const-string v1, ": invalid gradient color tag "

    .line 639
    .line 640
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 641
    .line 642
    .line 643
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 644
    .line 645
    .line 646
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 647
    .line 648
    .line 649
    move-result-object v1

    .line 650
    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 651
    .line 652
    .line 653
    throw v0

    .line 654
    :cond_24
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 655
    .line 656
    const-string v1, "No start tag found"

    .line 657
    .line 658
    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 659
    .line 660
    .line 661
    throw v0
.end method


# virtual methods
.method public d(FFFFFFF)V
    .locals 3

    .line 1
    iget v0, p0, Ldk;->i:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x7

    .line 4
    .line 5
    iget-object v1, p0, Ldk;->j:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, [F

    .line 8
    .line 9
    array-length v2, v1

    .line 10
    if-gt v0, v2, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    array-length v2, v1

    .line 14
    mul-int/lit8 v2, v2, 0x2

    .line 15
    .line 16
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([FI)[F

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iput-object v0, p0, Ldk;->j:Ljava/lang/Object;

    .line 25
    .line 26
    :goto_0
    iget-object v0, p0, Ldk;->j:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, [F

    .line 29
    .line 30
    iget v1, p0, Ldk;->i:I

    .line 31
    .line 32
    add-int/lit8 v2, v1, 0x1

    .line 33
    .line 34
    iput v2, p0, Ldk;->i:I

    .line 35
    .line 36
    aput p1, v0, v1

    .line 37
    .line 38
    add-int/lit8 p1, v1, 0x2

    .line 39
    .line 40
    iput p1, p0, Ldk;->i:I

    .line 41
    .line 42
    aput p2, v0, v2

    .line 43
    .line 44
    add-int/lit8 p2, v1, 0x3

    .line 45
    .line 46
    iput p2, p0, Ldk;->i:I

    .line 47
    .line 48
    aput p3, v0, p1

    .line 49
    .line 50
    add-int/lit8 p1, v1, 0x4

    .line 51
    .line 52
    iput p1, p0, Ldk;->i:I

    .line 53
    .line 54
    aput p4, v0, p2

    .line 55
    .line 56
    add-int/lit8 p2, v1, 0x5

    .line 57
    .line 58
    iput p2, p0, Ldk;->i:I

    .line 59
    .line 60
    aput p5, v0, p1

    .line 61
    .line 62
    add-int/lit8 p1, v1, 0x6

    .line 63
    .line 64
    iput p1, p0, Ldk;->i:I

    .line 65
    .line 66
    aput p6, v0, p2

    .line 67
    .line 68
    add-int/lit8 v1, v1, 0x7

    .line 69
    .line 70
    iput v1, p0, Ldk;->i:I

    .line 71
    .line 72
    aput p7, v0, p1

    .line 73
    .line 74
    return-void
.end method

.method public e(J)V
    .locals 4

    .line 1
    invoke-virtual {p0, p1, p2}, Ldk;->g(J)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget v0, p0, Ldk;->i:I

    .line 8
    .line 9
    iget-object v1, p0, Ldk;->j:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, [J

    .line 12
    .line 13
    array-length v2, v1

    .line 14
    if-lt v0, v2, :cond_0

    .line 15
    .line 16
    add-int/lit8 v2, v0, 0x1

    .line 17
    .line 18
    array-length v3, v1

    .line 19
    mul-int/lit8 v3, v3, 0x2

    .line 20
    .line 21
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    iput-object v1, p0, Ldk;->j:Ljava/lang/Object;

    .line 30
    .line 31
    :cond_0
    aput-wide p1, v1, v0

    .line 32
    .line 33
    iget p1, p0, Ldk;->i:I

    .line 34
    .line 35
    if-lt v0, p1, :cond_1

    .line 36
    .line 37
    add-int/lit8 v0, v0, 0x1

    .line 38
    .line 39
    iput v0, p0, Ldk;->i:I

    .line 40
    .line 41
    :cond_1
    return-void
.end method

.method public f(II)V
    .locals 3

    .line 1
    iget-object v0, p0, Ldk;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lv01;

    .line 4
    .line 5
    iget v1, v0, Lv01;->j:I

    .line 6
    .line 7
    if-lt p1, v1, :cond_0

    .line 8
    .line 9
    sub-int v1, p1, v1

    .line 10
    .line 11
    :goto_0
    if-ltz v1, :cond_0

    .line 12
    .line 13
    const/4 v2, -0x1

    .line 14
    invoke-virtual {v0, v2}, Lv01;->e(I)V

    .line 15
    .line 16
    .line 17
    add-int/lit8 v1, v1, -0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {v0, p1, p2}, Lv01;->g(II)V

    .line 21
    .line 22
    .line 23
    iget p1, p0, Ldk;->i:I

    .line 24
    .line 25
    add-int/lit8 p2, p2, 0x1

    .line 26
    .line 27
    if-ge p1, p2, :cond_1

    .line 28
    .line 29
    iput p2, p0, Ldk;->i:I

    .line 30
    .line 31
    :cond_1
    return-void
.end method

.method public g(J)Z
    .locals 6

    .line 1
    iget v0, p0, Ldk;->i:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    move v2, v1

    .line 5
    :goto_0
    if-ge v2, v0, :cond_1

    .line 6
    .line 7
    iget-object v3, p0, Ldk;->j:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, [J

    .line 10
    .line 11
    aget-wide v4, v3, v2

    .line 12
    .line 13
    cmp-long v3, v4, p1

    .line 14
    .line 15
    if-nez v3, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    return v1
.end method

.method public i(Ld92;Lov1;)Ld92;
    .locals 2

    .line 1
    new-instance p2, Ljava/io/ByteArrayOutputStream;

    .line 2
    .line 3
    invoke-direct {p2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ld92;->get()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Landroid/graphics/Bitmap;

    .line 11
    .line 12
    iget-object v1, p0, Ldk;->j:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Landroid/graphics/Bitmap$CompressFormat;

    .line 15
    .line 16
    iget p0, p0, Ldk;->i:I

    .line 17
    .line 18
    invoke-virtual {v0, v1, p0, p2}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 19
    .line 20
    .line 21
    invoke-interface {p1}, Ld92;->e()V

    .line 22
    .line 23
    .line 24
    new-instance p0, Lwc;

    .line 25
    .line 26
    invoke-virtual {p2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-direct {p0, p1}, Lwc;-><init>([B)V

    .line 31
    .line 32
    .line 33
    return-object p0
.end method

.method public j(II)V
    .locals 2

    .line 1
    add-int/2addr p2, p1

    .line 2
    iget-object v0, p0, Ldk;->j:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, [C

    .line 5
    .line 6
    array-length v1, v0

    .line 7
    if-gt v1, p2, :cond_1

    .line 8
    .line 9
    mul-int/lit8 p1, p1, 0x2

    .line 10
    .line 11
    if-ge p2, p1, :cond_0

    .line 12
    .line 13
    move p2, p1

    .line 14
    :cond_0
    invoke-static {v0, p2}, Ljava/util/Arrays;->copyOf([CI)[C

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, Ldk;->j:Ljava/lang/Object;

    .line 19
    .line 20
    :cond_1
    return-void
.end method

.method public k()I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public l(ILwg;)V
    .locals 8

    .line 1
    :goto_0
    shr-int/lit8 v0, p1, 0x1

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Ldk;->j:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, [Lwg;

    .line 8
    .line 9
    aget-object v1, v1, v0

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-wide v2, v1, Lwg;->g:J

    .line 15
    .line 16
    iget-wide v4, p2, Lwg;->g:J

    .line 17
    .line 18
    const-wide/16 v6, 0x0

    .line 19
    .line 20
    sub-long/2addr v4, v2

    .line 21
    invoke-static {v6, v7, v4, v5}, Lt11;->p(JJ)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-lez v2, :cond_0

    .line 26
    .line 27
    iput p1, v1, Lwg;->f:I

    .line 28
    .line 29
    iget-object v2, p0, Ldk;->j:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v2, [Lwg;

    .line 32
    .line 33
    aput-object v1, v2, p1

    .line 34
    .line 35
    move p1, v0

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    iget-object p0, p0, Ldk;->j:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p0, [Lwg;

    .line 40
    .line 41
    aput-object p2, p0, p1

    .line 42
    .line 43
    iput p1, p2, Lwg;->f:I

    .line 44
    .line 45
    return-void
.end method

.method public m()Lj31;
    .locals 9

    .line 1
    iget-object v0, p0, Ldk;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lqb2;

    .line 4
    .line 5
    invoke-virtual {v0}, Lqb2;->p()B

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, v2}, Ldk;->o(Z)Li41;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_0
    const/4 v3, 0x0

    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0, v3}, Ldk;->o(Z)Li41;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0

    .line 25
    :cond_1
    const/4 v4, 0x6

    .line 26
    const/4 v5, 0x0

    .line 27
    if-ne v1, v4, :cond_c

    .line 28
    .line 29
    iget v1, p0, Ldk;->i:I

    .line 30
    .line 31
    add-int/2addr v1, v2

    .line 32
    iput v1, p0, Ldk;->i:I

    .line 33
    .line 34
    const/16 v2, 0xc8

    .line 35
    .line 36
    if-ne v1, v2, :cond_5

    .line 37
    .line 38
    new-instance v0, Lm41;

    .line 39
    .line 40
    invoke-direct {v0, p0, v5}, Lm41;-><init>(Ldk;Lt00;)V

    .line 41
    .line 42
    .line 43
    new-instance v1, Lz40;

    .line 44
    .line 45
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object v0, v1, Lz40;->h:Lm41;

    .line 49
    .line 50
    iput-object v1, v1, Lz40;->i:Lt00;

    .line 51
    .line 52
    sget-object v2, Lp7;->c:Lk20;

    .line 53
    .line 54
    iput-object v2, v1, Lz40;->j:Ljava/lang/Object;

    .line 55
    .line 56
    :cond_2
    :goto_0
    iget-object v0, v1, Lz40;->j:Ljava/lang/Object;

    .line 57
    .line 58
    iget-object v3, v1, Lz40;->i:Lt00;

    .line 59
    .line 60
    if-nez v3, :cond_3

    .line 61
    .line 62
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    check-cast v0, Lj31;

    .line 66
    .line 67
    goto/16 :goto_3

    .line 68
    .line 69
    :cond_3
    invoke-static {v2, v0}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    if-eqz v4, :cond_4

    .line 74
    .line 75
    :try_start_0
    iget-object v0, v1, Lz40;->h:Lm41;

    .line 76
    .line 77
    const/4 v4, 0x3

    .line 78
    invoke-static {v4, v0}, Lxe1;->f(ILjava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    new-instance v4, Lm41;

    .line 82
    .line 83
    iget-object v0, v0, Lm41;->l:Ldk;

    .line 84
    .line 85
    invoke-direct {v4, v0, v3}, Lm41;-><init>(Ldk;Lt00;)V

    .line 86
    .line 87
    .line 88
    iput-object v1, v4, Lm41;->k:Lz40;

    .line 89
    .line 90
    sget-object v0, La83;->a:La83;

    .line 91
    .line 92
    invoke-virtual {v4, v0}, Lm41;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 96
    sget-object v4, Lk20;->h:Lk20;

    .line 97
    .line 98
    if-eq v0, v4, :cond_2

    .line 99
    .line 100
    invoke-interface {v3, v0}, Lt00;->h(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :catchall_0
    move-exception v0

    .line 105
    new-instance v4, Lx92;

    .line 106
    .line 107
    invoke-direct {v4, v0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 108
    .line 109
    .line 110
    invoke-interface {v3, v4}, Lt00;->h(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_4
    iput-object v2, v1, Lz40;->j:Ljava/lang/Object;

    .line 115
    .line 116
    invoke-interface {v3, v0}, Lt00;->h(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_5
    invoke-virtual {v0, v4}, Lqb2;->g(B)B

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    invoke-virtual {v0}, Lqb2;->p()B

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    const/4 v6, 0x4

    .line 129
    if-eq v2, v6, :cond_b

    .line 130
    .line 131
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 132
    .line 133
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 134
    .line 135
    .line 136
    :cond_6
    invoke-virtual {v0}, Lqb2;->c()Z

    .line 137
    .line 138
    .line 139
    move-result v7

    .line 140
    const/4 v8, 0x7

    .line 141
    if-eqz v7, :cond_8

    .line 142
    .line 143
    invoke-virtual {v0}, Lqb2;->j()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    const/4 v7, 0x5

    .line 148
    invoke-virtual {v0, v7}, Lqb2;->g(B)B

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0}, Ldk;->m()Lj31;

    .line 152
    .line 153
    .line 154
    move-result-object v7

    .line 155
    invoke-interface {v2, v1, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0}, Lqb2;->f()B

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    if-eq v1, v6, :cond_6

    .line 163
    .line 164
    if-ne v1, v8, :cond_7

    .line 165
    .line 166
    goto :goto_1

    .line 167
    :cond_7
    const-string p0, "Expected end of the object or comma"

    .line 168
    .line 169
    invoke-static {v0, p0, v3, v4}, Lqb2;->m(Lqb2;Ljava/lang/String;II)V

    .line 170
    .line 171
    .line 172
    throw v5

    .line 173
    :cond_8
    :goto_1
    if-ne v1, v4, :cond_9

    .line 174
    .line 175
    invoke-virtual {v0, v8}, Lqb2;->g(B)B

    .line 176
    .line 177
    .line 178
    goto :goto_2

    .line 179
    :cond_9
    if-eq v1, v6, :cond_a

    .line 180
    .line 181
    :goto_2
    new-instance v0, Ld41;

    .line 182
    .line 183
    invoke-direct {v0, v2}, Ld41;-><init>(Ljava/util/Map;)V

    .line 184
    .line 185
    .line 186
    :goto_3
    iget v1, p0, Ldk;->i:I

    .line 187
    .line 188
    add-int/lit8 v1, v1, -0x1

    .line 189
    .line 190
    iput v1, p0, Ldk;->i:I

    .line 191
    .line 192
    return-object v0

    .line 193
    :cond_a
    const-string p0, "object"

    .line 194
    .line 195
    invoke-static {v0, p0}, Lp7;->x(Lqb2;Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    throw v5

    .line 199
    :cond_b
    const-string p0, "Unexpected leading comma"

    .line 200
    .line 201
    invoke-static {v0, p0, v3, v4}, Lqb2;->m(Lqb2;Ljava/lang/String;II)V

    .line 202
    .line 203
    .line 204
    throw v5

    .line 205
    :cond_c
    const/16 v2, 0x8

    .line 206
    .line 207
    if-ne v1, v2, :cond_d

    .line 208
    .line 209
    invoke-virtual {p0}, Ldk;->n()Lz21;

    .line 210
    .line 211
    .line 212
    move-result-object p0

    .line 213
    return-object p0

    .line 214
    :cond_d
    invoke-static {v1}, Leu;->d0(B)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object p0

    .line 218
    const-string v1, "Cannot read Json element because of unexpected "

    .line 219
    .line 220
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    invoke-static {v0, p0, v3, v4}, Lqb2;->m(Lqb2;Ljava/lang/String;II)V

    .line 225
    .line 226
    .line 227
    throw v5
.end method

.method public n()Lz21;
    .locals 8

    .line 1
    iget-object v0, p0, Ldk;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lqb2;

    .line 4
    .line 5
    invoke-virtual {v0}, Lqb2;->f()B

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {v0}, Lqb2;->p()B

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v5, 0x4

    .line 16
    if-eq v2, v5, :cond_6

    .line 17
    .line 18
    new-instance v2, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    :cond_0
    :goto_0
    invoke-virtual {v0}, Lqb2;->c()Z

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    const/16 v7, 0x9

    .line 28
    .line 29
    if-eqz v6, :cond_3

    .line 30
    .line 31
    invoke-virtual {p0}, Ldk;->m()Lj31;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Lqb2;->f()B

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eq v1, v5, :cond_0

    .line 43
    .line 44
    if-ne v1, v7, :cond_1

    .line 45
    .line 46
    const/4 v6, 0x1

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    move v6, v3

    .line 49
    :goto_1
    iget v7, v0, Lqb2;->b:I

    .line 50
    .line 51
    if-eqz v6, :cond_2

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    const-string p0, "Expected end of the array or comma"

    .line 55
    .line 56
    invoke-static {v0, p0, v7, v5}, Lqb2;->m(Lqb2;Ljava/lang/String;II)V

    .line 57
    .line 58
    .line 59
    throw v4

    .line 60
    :cond_3
    const/16 p0, 0x8

    .line 61
    .line 62
    if-ne v1, p0, :cond_4

    .line 63
    .line 64
    invoke-virtual {v0, v7}, Lqb2;->g(B)B

    .line 65
    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_4
    if-eq v1, v5, :cond_5

    .line 69
    .line 70
    :goto_2
    new-instance p0, Lz21;

    .line 71
    .line 72
    invoke-direct {p0, v2}, Lz21;-><init>(Ljava/util/List;)V

    .line 73
    .line 74
    .line 75
    return-object p0

    .line 76
    :cond_5
    const-string p0, "array"

    .line 77
    .line 78
    invoke-static {v0, p0}, Lp7;->x(Lqb2;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    throw v4

    .line 82
    :cond_6
    const-string p0, "Unexpected leading comma"

    .line 83
    .line 84
    const/4 v1, 0x6

    .line 85
    invoke-static {v0, p0, v3, v1}, Lqb2;->m(Lqb2;Ljava/lang/String;II)V

    .line 86
    .line 87
    .line 88
    throw v4
.end method

.method public o(Z)Li41;
    .locals 1

    .line 1
    iget-object p0, p0, Ldk;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lqb2;

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lqb2;->k()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p0}, Lqb2;->j()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    :goto_0
    if-nez p1, :cond_1

    .line 17
    .line 18
    const-string v0, "null"

    .line 19
    .line 20
    invoke-static {p0, v0}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    sget-object p0, Lz31;->INSTANCE:Lz31;

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_1
    new-instance v0, Lw31;

    .line 30
    .line 31
    invoke-direct {v0, p0, p1}, Lw31;-><init>(Ljava/io/Serializable;Z)V

    .line 32
    .line 33
    .line 34
    return-object v0
.end method

.method public p()V
    .locals 4

    .line 1
    sget-object v0, Lrq;->c:Lrq;

    .line 2
    .line 3
    iget-object p0, p0, Ldk;->j:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, [C

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    monitor-enter v0

    .line 14
    :try_start_0
    iget v1, v0, Lrq;->b:I

    .line 15
    .line 16
    array-length v2, p0

    .line 17
    add-int/2addr v2, v1

    .line 18
    sget v3, Lig;->a:I

    .line 19
    .line 20
    if-ge v2, v3, :cond_0

    .line 21
    .line 22
    array-length v2, p0

    .line 23
    add-int/2addr v1, v2

    .line 24
    iput v1, v0, Lrq;->b:I

    .line 25
    .line 26
    iget-object v1, v0, Lrq;->a:Lag;

    .line 27
    .line 28
    invoke-virtual {v1, p0}, Lag;->addLast(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception p0

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    :goto_0
    monitor-exit v0

    .line 35
    return-void

    .line 36
    :goto_1
    monitor-exit v0

    .line 37
    throw p0
.end method

.method public q(JLnd;Lnd;Lnd;)Lnd;
    .locals 6

    .line 1
    iget-object p0, p0, Ldk;->j:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    check-cast v0, Lkj1;

    .line 5
    .line 6
    move-wide v1, p1

    .line 7
    move-object v3, p3

    .line 8
    move-object v4, p4

    .line 9
    move-object v5, p5

    .line 10
    invoke-virtual/range {v0 .. v5}, Lkj1;->q(JLnd;Lnd;Lnd;)Lnd;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public r()I
    .locals 0

    .line 1
    iget p0, p0, Ldk;->i:I

    .line 2
    .line 3
    return p0
.end method

.method public s(JLnd;Lnd;Lnd;)Lnd;
    .locals 6

    .line 1
    iget-object p0, p0, Ldk;->j:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    check-cast v0, Lkj1;

    .line 5
    .line 6
    move-wide v1, p1

    .line 7
    move-object v3, p3

    .line 8
    move-object v4, p4

    .line 9
    move-object v5, p5

    .line 10
    invoke-virtual/range {v0 .. v5}, Lkj1;->s(JLnd;Lnd;Lnd;)Lnd;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget v0, p0, Ldk;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    new-instance v0, Ljava/lang/String;

    .line 12
    .line 13
    iget-object v1, p0, Ldk;->j:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, [C

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    iget p0, p0, Ldk;->i:I

    .line 19
    .line 20
    invoke-direct {v0, v1, v2, p0}, Ljava/lang/String;-><init>([CII)V

    .line 21
    .line 22
    .line 23
    return-object v0

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_0
    .end packed-switch
.end method

.method public u(J)V
    .locals 5

    .line 1
    iget v0, p0, Ldk;->i:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :goto_0
    if-ge v1, v0, :cond_2

    .line 5
    .line 6
    iget-object v2, p0, Ldk;->j:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v2, [J

    .line 9
    .line 10
    aget-wide v3, v2, v1

    .line 11
    .line 12
    cmp-long v2, p1, v3

    .line 13
    .line 14
    if-nez v2, :cond_1

    .line 15
    .line 16
    iget p1, p0, Ldk;->i:I

    .line 17
    .line 18
    add-int/lit8 p1, p1, -0x1

    .line 19
    .line 20
    :goto_1
    if-ge v1, p1, :cond_0

    .line 21
    .line 22
    iget-object p2, p0, Ldk;->j:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p2, [J

    .line 25
    .line 26
    add-int/lit8 v0, v1, 0x1

    .line 27
    .line 28
    aget-wide v2, p2, v0

    .line 29
    .line 30
    aput-wide v2, p2, v1

    .line 31
    .line 32
    move v1, v0

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    iget p1, p0, Ldk;->i:I

    .line 35
    .line 36
    add-int/lit8 p1, p1, -0x1

    .line 37
    .line 38
    iput p1, p0, Ldk;->i:I

    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    return-void
.end method

.method public v(Lwg;)V
    .locals 9

    .line 1
    iget v0, p1, Lwg;->f:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_6

    .line 5
    .line 6
    iget v2, p0, Ldk;->i:I

    .line 7
    .line 8
    iget-object v3, p0, Ldk;->j:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v3, [Lwg;

    .line 11
    .line 12
    aget-object v3, v3, v2

    .line 13
    .line 14
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iput v1, p1, Lwg;->f:I

    .line 18
    .line 19
    iget-object v1, p0, Ldk;->j:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, [Lwg;

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    aput-object v4, v1, v2

    .line 25
    .line 26
    add-int/lit8 v2, v2, -0x1

    .line 27
    .line 28
    iput v2, p0, Ldk;->i:I

    .line 29
    .line 30
    if-ne p1, v3, :cond_0

    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    iget-wide v1, p1, Lwg;->g:J

    .line 34
    .line 35
    iget-wide v4, v3, Lwg;->g:J

    .line 36
    .line 37
    sub-long/2addr v4, v1

    .line 38
    const-wide/16 v1, 0x0

    .line 39
    .line 40
    invoke-static {v1, v2, v4, v5}, Lt11;->p(JJ)I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-nez p1, :cond_1

    .line 45
    .line 46
    iget-object p0, p0, Ldk;->j:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p0, [Lwg;

    .line 49
    .line 50
    aput-object v3, p0, v0

    .line 51
    .line 52
    iput v0, v3, Lwg;->f:I

    .line 53
    .line 54
    return-void

    .line 55
    :cond_1
    if-gez p1, :cond_5

    .line 56
    .line 57
    :goto_0
    shl-int/lit8 p1, v0, 0x1

    .line 58
    .line 59
    add-int/lit8 v4, p1, 0x1

    .line 60
    .line 61
    iget v5, p0, Ldk;->i:I

    .line 62
    .line 63
    if-gt v4, v5, :cond_3

    .line 64
    .line 65
    iget-object v5, p0, Ldk;->j:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v5, [Lwg;

    .line 68
    .line 69
    aget-object p1, v5, p1

    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    iget-object v5, p0, Ldk;->j:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v5, [Lwg;

    .line 77
    .line 78
    aget-object v4, v5, v4

    .line 79
    .line 80
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    iget-wide v5, p1, Lwg;->g:J

    .line 84
    .line 85
    iget-wide v7, v4, Lwg;->g:J

    .line 86
    .line 87
    sub-long/2addr v7, v5

    .line 88
    invoke-static {v1, v2, v7, v8}, Lt11;->p(JJ)I

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    if-gez v5, :cond_2

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_2
    move-object p1, v4

    .line 96
    goto :goto_1

    .line 97
    :cond_3
    if-gt p1, v5, :cond_4

    .line 98
    .line 99
    iget-object v4, p0, Ldk;->j:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v4, [Lwg;

    .line 102
    .line 103
    aget-object p1, v4, p1

    .line 104
    .line 105
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    :goto_1
    iget-wide v4, v3, Lwg;->g:J

    .line 109
    .line 110
    iget-wide v6, p1, Lwg;->g:J

    .line 111
    .line 112
    sub-long/2addr v6, v4

    .line 113
    invoke-static {v1, v2, v6, v7}, Lt11;->p(JJ)I

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    if-lez v4, :cond_4

    .line 118
    .line 119
    iget v4, p1, Lwg;->f:I

    .line 120
    .line 121
    iput v0, p1, Lwg;->f:I

    .line 122
    .line 123
    iget-object v5, p0, Ldk;->j:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v5, [Lwg;

    .line 126
    .line 127
    aput-object p1, v5, v0

    .line 128
    .line 129
    move v0, v4

    .line 130
    goto :goto_0

    .line 131
    :cond_4
    iget-object p0, p0, Ldk;->j:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast p0, [Lwg;

    .line 134
    .line 135
    aput-object v3, p0, v0

    .line 136
    .line 137
    iput v0, v3, Lwg;->f:I

    .line 138
    .line 139
    return-void

    .line 140
    :cond_5
    invoke-virtual {p0, v0, v3}, Ldk;->l(ILwg;)V

    .line 141
    .line 142
    .line 143
    return-void

    .line 144
    :cond_6
    const-string p0, "Failed requirement."

    .line 145
    .line 146
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    return-void
.end method

.method public w(Ljava/lang/String;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget v1, p0, Ldk;->i:I

    .line 12
    .line 13
    invoke-virtual {p0, v1, v0}, Ldk;->j(II)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Ldk;->j:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, [C

    .line 19
    .line 20
    iget v2, p0, Ldk;->i:I

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    invoke-virtual {p1, v3, v4, v1, v2}, Ljava/lang/String;->getChars(II[CI)V

    .line 28
    .line 29
    .line 30
    iget p1, p0, Ldk;->i:I

    .line 31
    .line 32
    add-int/2addr p1, v0

    .line 33
    iput p1, p0, Ldk;->i:I

    .line 34
    .line 35
    return-void
.end method
