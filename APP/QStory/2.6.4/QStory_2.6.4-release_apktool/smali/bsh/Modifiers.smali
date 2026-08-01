.class public Lbsh/Modifiers;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/lang/Cloneable;


# static fields
.field private static final ACCESS_MODIFIERS:I = 0x7

.field public static final CLASS:I = 0x0

.field public static final CONST:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final CONSTRUCTOR:I = 0x5

.field public static final FIELD:I = 0x3

.field public static final INTERFACE:I = 0x1

.field public static final METHOD:I = 0x2

.field public static final PARAMETER:I = 0x4

.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private context:I

.field private modifiers:I

.field private type:Ljava/lang/String;

.field private valid:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    const/16 v1, 0x11

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lbsh/Modifiers;->CONST:Ljava/util/Map;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const-string v2, "public"

    .line 16
    .line 17
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x2

    .line 21
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const-string v2, "private"

    .line 26
    .line 27
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    const/4 v1, 0x4

    .line 31
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const-string v2, "protected"

    .line 36
    .line 37
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    const/16 v1, 0x8

    .line 41
    .line 42
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    const-string v2, "static"

    .line 47
    .line 48
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    const/16 v1, 0x10

    .line 52
    .line 53
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    const-string v2, "final"

    .line 58
    .line 59
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    const/16 v1, 0x20

    .line 63
    .line 64
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    const-string v2, "synchronized"

    .line 69
    .line 70
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    const/16 v1, 0x40

    .line 74
    .line 75
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    const-string v2, "volatile"

    .line 80
    .line 81
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    const/16 v1, 0x80

    .line 85
    .line 86
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    const-string v2, "transient"

    .line 91
    .line 92
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    const/16 v1, 0x100

    .line 96
    .line 97
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    const-string v2, "native"

    .line 102
    .line 103
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    const/16 v1, 0x200

    .line 107
    .line 108
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    const-string v2, "interface"

    .line 113
    .line 114
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    const/16 v1, 0x400

    .line 118
    .line 119
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    const-string v2, "abstract"

    .line 124
    .line 125
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    const/16 v1, 0x800

    .line 129
    .line 130
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    const-string v2, "strict"

    .line 135
    .line 136
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    const/16 v1, 0x1000

    .line 140
    .line 141
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    const-string v2, "synthetic"

    .line 146
    .line 147
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    const/16 v1, 0x2000

    .line 151
    .line 152
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    const-string v2, "annotation"

    .line 157
    .line 158
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    const/16 v1, 0x4000

    .line 162
    .line 163
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    const-string v2, "enum"

    .line 168
    .line 169
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    const v1, 0x8000

    .line 173
    .line 174
    .line 175
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    const-string v2, "mandated"

    .line 180
    .line 181
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    const/high16 v1, 0x10000

    .line 185
    .line 186
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    const-string v2, "default"

    .line 191
    .line 192
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lbsh/Modifiers;->modifiers:I

    .line 6
    .line 7
    invoke-direct {p0, p1}, Lbsh/Modifiers;->appliedContext(I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private appliedContext(I)V
    .locals 2

    .line 1
    iput p1, p0, Lbsh/Modifiers;->context:I

    .line 2
    .line 3
    if-eqz p1, :cond_5

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    if-eq p1, v0, :cond_4

    .line 7
    .line 8
    const/4 v0, 0x2

    .line 9
    if-eq p1, v0, :cond_3

    .line 10
    .line 11
    const/4 v0, 0x3

    .line 12
    if-eq p1, v0, :cond_2

    .line 13
    .line 14
    const/4 v0, 0x4

    .line 15
    if-eq p1, v0, :cond_1

    .line 16
    .line 17
    const/4 v0, 0x5

    .line 18
    if-eq p1, v0, :cond_0

    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    iput p1, p0, Lbsh/Modifiers;->valid:I

    .line 22
    .line 23
    const-string p1, "Unknown"

    .line 24
    .line 25
    iput-object p1, p0, Lbsh/Modifiers;->type:Ljava/lang/String;

    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    invoke-static {}, Ljava/lang/reflect/Modifier;->constructorModifiers()I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    iput p1, p0, Lbsh/Modifiers;->valid:I

    .line 33
    .line 34
    const-string p1, "Constructor"

    .line 35
    .line 36
    iput-object p1, p0, Lbsh/Modifiers;->type:Ljava/lang/String;

    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    invoke-static {}, Ljava/lang/reflect/Modifier;->parameterModifiers()I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    iput p1, p0, Lbsh/Modifiers;->valid:I

    .line 44
    .line 45
    const-string p1, "Parameter"

    .line 46
    .line 47
    iput-object p1, p0, Lbsh/Modifiers;->type:Ljava/lang/String;

    .line 48
    .line 49
    return-void

    .line 50
    :cond_2
    invoke-static {}, Ljava/lang/reflect/Modifier;->fieldModifiers()I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    sget-object v0, Lbsh/Modifiers;->CONST:Ljava/util/Map;

    .line 55
    .line 56
    const-string v1, "enum"

    .line 57
    .line 58
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, Ljava/lang/Integer;

    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    or-int/2addr p1, v0

    .line 69
    iput p1, p0, Lbsh/Modifiers;->valid:I

    .line 70
    .line 71
    const-string p1, "Field"

    .line 72
    .line 73
    iput-object p1, p0, Lbsh/Modifiers;->type:Ljava/lang/String;

    .line 74
    .line 75
    return-void

    .line 76
    :cond_3
    invoke-static {}, Ljava/lang/reflect/Modifier;->methodModifiers()I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    sget-object v0, Lbsh/Modifiers;->CONST:Ljava/util/Map;

    .line 81
    .line 82
    const-string v1, "default"

    .line 83
    .line 84
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    check-cast v0, Ljava/lang/Integer;

    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    or-int/2addr p1, v0

    .line 95
    iput p1, p0, Lbsh/Modifiers;->valid:I

    .line 96
    .line 97
    const-string p1, "Method"

    .line 98
    .line 99
    iput-object p1, p0, Lbsh/Modifiers;->type:Ljava/lang/String;

    .line 100
    .line 101
    return-void

    .line 102
    :cond_4
    invoke-static {}, Ljava/lang/reflect/Modifier;->interfaceModifiers()I

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    iput p1, p0, Lbsh/Modifiers;->valid:I

    .line 107
    .line 108
    const-string p1, "Interface"

    .line 109
    .line 110
    iput-object p1, p0, Lbsh/Modifiers;->type:Ljava/lang/String;

    .line 111
    .line 112
    return-void

    .line 113
    :cond_5
    invoke-static {}, Ljava/lang/reflect/Modifier;->classModifiers()I

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    iput p1, p0, Lbsh/Modifiers;->valid:I

    .line 118
    .line 119
    const-string p1, "Class"

    .line 120
    .line 121
    iput-object p1, p0, Lbsh/Modifiers;->type:Ljava/lang/String;

    .line 122
    .line 123
    return-void
.end method

.method private toModifier(Ljava/lang/String;)I
    .locals 1

    .line 43
    sget-object p0, Lbsh/Modifiers;->CONST:Ljava/util/Map;

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    if-eqz p0, :cond_0

    .line 44
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0

    .line 45
    :cond_0
    const-string p0, "Unknown modifier: \'"

    const-string v0, "\'"

    .line 46
    invoke-static {p0, p1, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 47
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    const/4 p0, 0x0

    return p0
.end method

.method private toModifier(I)Ljava/lang/String;
    .locals 2

    .line 1
    sget-object p0, Lbsh/Modifiers;->CONST:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Ljava/lang/String;

    .line 22
    .line 23
    sget-object v1, Lbsh/Modifiers;->CONST:Ljava/util/Map;

    .line 24
    .line 25
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Ljava/lang/Integer;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-ne p1, v1, :cond_0

    .line 36
    .line 37
    return-object v0

    .line 38
    :cond_1
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method


# virtual methods
.method public addModifier(I)V
    .locals 2

    .line 1
    iget v0, p0, Lbsh/Modifiers;->valid:I

    .line 2
    .line 3
    and-int/2addr v0, p1

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    const/4 v0, 0x7

    .line 7
    if-ge p1, v0, :cond_1

    .line 8
    .line 9
    iget v0, p0, Lbsh/Modifiers;->modifiers:I

    .line 10
    .line 11
    and-int/lit8 v1, v0, 0x7

    .line 12
    .line 13
    if-lez v1, :cond_1

    .line 14
    .line 15
    or-int v1, v0, p1

    .line 16
    .line 17
    if-ne v1, v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const-string p0, "public/private/protected cannot be used in combination."

    .line 21
    .line 22
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    :goto_0
    iget v0, p0, Lbsh/Modifiers;->modifiers:I

    .line 27
    .line 28
    or-int/2addr p1, v0

    .line 29
    iput p1, p0, Lbsh/Modifiers;->modifiers:I

    .line 30
    .line 31
    return-void

    .line 32
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, Lbsh/Modifiers;->type:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v1, " cannot be declared \'"

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-direct {p0, p1}, Lbsh/Modifiers;->toModifier(I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    const-string p1, "\'"

    .line 52
    .line 53
    invoke-static {v0, p0, p1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public addModifier(Ljava/lang/String;)V
    .locals 0

    .line 61
    invoke-direct {p0, p1}, Lbsh/Modifiers;->toModifier(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {p0, p1}, Lbsh/Modifiers;->addModifier(I)V

    return-void
.end method

.method public addModifiers(I)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    :goto_0
    if-gt v0, p1, :cond_1

    .line 3
    .line 4
    and-int v1, p1, v0

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lbsh/Modifiers;->addModifier(I)V

    .line 9
    .line 10
    .line 11
    :cond_0
    mul-int/lit8 v0, v0, 0x2

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_1
    return-void
.end method

.method public changeContext(I)V
    .locals 2

    .line 1
    iget v0, p0, Lbsh/Modifiers;->modifiers:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput v1, p0, Lbsh/Modifiers;->modifiers:I

    .line 5
    .line 6
    invoke-direct {p0, p1}, Lbsh/Modifiers;->appliedContext(I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lbsh/Modifiers;->addModifiers(I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public clone()Lbsh/Modifiers;
    .locals 0

    .line 1
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lbsh/Modifiers;

    .line 6
    .line 7
    return-object p0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 0

    .line 8
    invoke-virtual {p0}, Lbsh/Modifiers;->clone()Lbsh/Modifiers;

    move-result-object p0

    return-object p0
.end method

.method public getModifiers()I
    .locals 0

    .line 1
    iget p0, p0, Lbsh/Modifiers;->modifiers:I

    .line 2
    .line 3
    return p0
.end method

.method public hasModifier(I)Z
    .locals 0

    .line 10
    iget p0, p0, Lbsh/Modifiers;->modifiers:I

    and-int/2addr p0, p1

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public hasModifier(Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lbsh/Modifiers;->toModifier(Ljava/lang/String;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0, p1}, Lbsh/Modifiers;->hasModifier(I)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public isAppliedContext(I)Z
    .locals 0

    .line 1
    iget p0, p0, Lbsh/Modifiers;->context:I

    .line 2
    .line 3
    if-ne p0, p1, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public setConstant()V
    .locals 1

    .line 1
    const/16 v0, 0x19

    .line 2
    .line 3
    iput v0, p0, Lbsh/Modifiers;->modifiers:I

    .line 4
    .line 5
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Modifiers: "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lbsh/Modifiers;->modifiers:I

    .line 9
    .line 10
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->toString(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    iget v1, p0, Lbsh/Modifiers;->modifiers:I

    .line 18
    .line 19
    sget-object v2, Lbsh/Modifiers;->CONST:Ljava/util/Map;

    .line 20
    .line 21
    const-string v3, "enum"

    .line 22
    .line 23
    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    check-cast v3, Ljava/lang/Integer;

    .line 28
    .line 29
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    and-int/2addr v1, v3

    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    const-string p0, " enum"

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    iget p0, p0, Lbsh/Modifiers;->modifiers:I

    .line 40
    .line 41
    const-string v1, "default"

    .line 42
    .line 43
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    check-cast v1, Ljava/lang/Integer;

    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    and-int/2addr p0, v1

    .line 54
    if-eqz p0, :cond_1

    .line 55
    .line 56
    const-string p0, " default"

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    const-string p0, ""

    .line 60
    .line 61
    :goto_0
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0
.end method
