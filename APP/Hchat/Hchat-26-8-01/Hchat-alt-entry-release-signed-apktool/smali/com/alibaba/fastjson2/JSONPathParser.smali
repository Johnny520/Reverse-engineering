.class Lcom/alibaba/fastjson2/JSONPathParser;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field final dollar:Z

.field final jsonReader:Lcom/alibaba/fastjson2/JSONReader;

.field final path:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONPathParser;->path:Ljava/lang/String;

    .line 5
    .line 6
    sget-object v0, Lcom/alibaba/fastjson2/JSONPath;->PARSE_CONTEXT:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 7
    .line 8
    invoke-static {p1, v0}, Lcom/alibaba/fastjson2/JSONReader;->of(Ljava/lang/String;Lcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/JSONReader;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONPathParser;->jsonReader:Lcom/alibaba/fastjson2/JSONReader;

    .line 13
    .line 14
    iget-char v0, p1, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 15
    .line 16
    const/16 v1, 0x2d

    .line 17
    .line 18
    if-eq v0, v1, :cond_1

    .line 19
    .line 20
    const/16 v1, 0x24

    .line 21
    .line 22
    if-ne v0, v1, :cond_0

    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->next()V

    .line 25
    .line 26
    .line 27
    const/4 p1, 0x1

    .line 28
    iput-boolean p1, p0, Lcom/alibaba/fastjson2/JSONPathParser;->dollar:Z

    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    const/4 p1, 0x0

    .line 32
    iput-boolean p1, p0, Lcom/alibaba/fastjson2/JSONPathParser;->dollar:Z

    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    const-string p1, "not support \'-\'"

    .line 36
    .line 37
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const/4 p1, 0x0

    .line 41
    throw p1
.end method

.method private parseArrayAccess()Lcom/alibaba/fastjson2/JSONPathSegment;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONPathParser;->jsonReader:Lcom/alibaba/fastjson2/JSONReader;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->next()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONPathParser;->jsonReader:Lcom/alibaba/fastjson2/JSONReader;

    .line 7
    .line 8
    iget-char v1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 9
    .line 10
    const/16 v2, 0x22

    .line 11
    .line 12
    const-string v3, "TODO : "

    .line 13
    .line 14
    if-eq v1, v2, :cond_3

    .line 15
    .line 16
    const/16 v2, 0x27

    .line 17
    .line 18
    if-eq v1, v2, :cond_3

    .line 19
    .line 20
    const/16 v2, 0x2a

    .line 21
    .line 22
    if-eq v1, v2, :cond_2

    .line 23
    .line 24
    const-string v2, "not support range index \':\'"

    .line 25
    .line 26
    packed-switch v1, :pswitch_data_0

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONPathParser;->jsonReader:Lcom/alibaba/fastjson2/JSONReader;

    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->current()C

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    invoke-static {v0, v3}, Lah/a;->t(ILjava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    const/4 v0, 0x0

    .line 39
    return-object v0

    .line 40
    :pswitch_0
    invoke-static {v2}, Lah/a;->w(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :pswitch_1
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->readInt32Value()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONPathParser;->jsonReader:Lcom/alibaba/fastjson2/JSONReader;

    .line 49
    .line 50
    iget-char v3, v1, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 51
    .line 52
    const/16 v4, 0x3a

    .line 53
    .line 54
    if-eq v3, v4, :cond_1

    .line 55
    .line 56
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->isNumber()Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-nez v1, :cond_0

    .line 61
    .line 62
    invoke-static {v0}, Lcom/alibaba/fastjson2/JSONPathSegmentIndex;->of(I)Lcom/alibaba/fastjson2/JSONPathSegmentIndex;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    goto :goto_1

    .line 67
    :cond_0
    const-string v0, "not support"

    .line 68
    .line 69
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_1
    invoke-static {v2}, Lah/a;->w(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_2
    const-string v0, "not support *"

    .line 78
    .line 79
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_3
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->readString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONPathParser;->jsonReader:Lcom/alibaba/fastjson2/JSONReader;

    .line 88
    .line 89
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->current()C

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    const/16 v2, 0x5d

    .line 94
    .line 95
    if-ne v1, v2, :cond_5

    .line 96
    .line 97
    new-instance v1, Lcom/alibaba/fastjson2/JSONPathSegmentName;

    .line 98
    .line 99
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64(Ljava/lang/String;)J

    .line 100
    .line 101
    .line 102
    move-result-wide v2

    .line 103
    invoke-direct {v1, v0, v2, v3}, Lcom/alibaba/fastjson2/JSONPathSegmentName;-><init>(Ljava/lang/String;J)V

    .line 104
    .line 105
    .line 106
    move-object v0, v1

    .line 107
    :goto_1
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONPathParser;->jsonReader:Lcom/alibaba/fastjson2/JSONReader;

    .line 108
    .line 109
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfArrayEnd()Z

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    if-eqz v1, :cond_4

    .line 114
    .line 115
    return-object v0

    .line 116
    :cond_4
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONPathParser;->jsonReader:Lcom/alibaba/fastjson2/JSONReader;

    .line 117
    .line 118
    const-string v1, "jsonpath syntax error"

    .line 119
    .line 120
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_5
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONPathParser;->jsonReader:Lcom/alibaba/fastjson2/JSONReader;

    .line 129
    .line 130
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->isString()Z

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    if-eqz v0, :cond_6

    .line 135
    .line 136
    const-string v0, "not support multi name"

    .line 137
    .line 138
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    goto :goto_0

    .line 142
    :cond_6
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONPathParser;->jsonReader:Lcom/alibaba/fastjson2/JSONReader;

    .line 143
    .line 144
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->current()C

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    invoke-static {v0, v3}, Lah/a;->t(ILjava/lang/String;)V

    .line 149
    .line 150
    .line 151
    goto :goto_0

    .line 152
    nop

    .line 153
    :pswitch_data_0
    .packed-switch 0x30
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private parseProperty()Lcom/alibaba/fastjson2/JSONPathSegment;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONPathParser;->jsonReader:Lcom/alibaba/fastjson2/JSONReader;

    .line 2
    .line 3
    iget-char v1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 4
    .line 5
    const/16 v2, 0x2a

    .line 6
    .line 7
    if-eq v1, v2, :cond_2

    .line 8
    .line 9
    const/16 v2, 0x2e

    .line 10
    .line 11
    if-eq v1, v2, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->readFieldNameHashCodeUnquote()J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONPathParser;->jsonReader:Lcom/alibaba/fastjson2/JSONReader;

    .line 18
    .line 19
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->getFieldName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONPathParser;->jsonReader:Lcom/alibaba/fastjson2/JSONReader;

    .line 24
    .line 25
    iget-char v3, v3, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 26
    .line 27
    const/16 v4, 0x28

    .line 28
    .line 29
    if-eq v3, v4, :cond_0

    .line 30
    .line 31
    new-instance v3, Lcom/alibaba/fastjson2/JSONPathSegmentName;

    .line 32
    .line 33
    invoke-direct {v3, v2, v0, v1}, Lcom/alibaba/fastjson2/JSONPathSegmentName;-><init>(Ljava/lang/String;J)V

    .line 34
    .line 35
    .line 36
    return-object v3

    .line 37
    :cond_0
    const-string v0, "not support jsonpath function"

    .line 38
    .line 39
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :goto_0
    const/4 v0, 0x0

    .line 43
    return-object v0

    .line 44
    :cond_1
    const-string v0, "not support jsonpath .."

    .line 45
    .line 46
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    const-string v0, "not support *"

    .line 51
    .line 52
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0
.end method


# virtual methods
.method public parse()Lcom/alibaba/fastjson2/JSONPath;
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/JSONPathParser;->dollar:Z

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONPathParser;->jsonReader:Lcom/alibaba/fastjson2/JSONReader;

    .line 8
    .line 9
    iget-char v0, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    sget-object v0, Lcom/alibaba/fastjson2/JSONPath;->ROOT:Lcom/alibaba/fastjson2/JSONPath;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    :goto_0
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONPathParser;->jsonReader:Lcom/alibaba/fastjson2/JSONReader;

    .line 22
    .line 23
    iget-char v3, v2, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 24
    .line 25
    if-eq v3, v1, :cond_8

    .line 26
    .line 27
    const/16 v4, 0x2e

    .line 28
    .line 29
    if-ne v3, v4, :cond_1

    .line 30
    .line 31
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->next()V

    .line 32
    .line 33
    .line 34
    invoke-direct {p0}, Lcom/alibaba/fastjson2/JSONPathParser;->parseProperty()Lcom/alibaba/fastjson2/JSONPathSegment;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const/16 v4, 0x5b

    .line 40
    .line 41
    if-ne v3, v4, :cond_2

    .line 42
    .line 43
    invoke-direct {p0}, Lcom/alibaba/fastjson2/JSONPathParser;->parseArrayAccess()Lcom/alibaba/fastjson2/JSONPathSegment;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    goto :goto_1

    .line 48
    :cond_2
    const/16 v4, 0x61

    .line 49
    .line 50
    if-lt v3, v4, :cond_3

    .line 51
    .line 52
    const/16 v4, 0x7a

    .line 53
    .line 54
    if-le v3, v4, :cond_5

    .line 55
    .line 56
    :cond_3
    const/16 v4, 0x41

    .line 57
    .line 58
    if-lt v3, v4, :cond_4

    .line 59
    .line 60
    const/16 v4, 0x5a

    .line 61
    .line 62
    if-le v3, v4, :cond_5

    .line 63
    .line 64
    :cond_4
    const/16 v4, 0x5f

    .line 65
    .line 66
    if-ne v3, v4, :cond_6

    .line 67
    .line 68
    :cond_5
    invoke-direct {p0}, Lcom/alibaba/fastjson2/JSONPathParser;->parseProperty()Lcom/alibaba/fastjson2/JSONPathSegment;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    goto :goto_1

    .line 73
    :cond_6
    const/16 v4, 0x40

    .line 74
    .line 75
    if-ne v3, v4, :cond_7

    .line 76
    .line 77
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->next()V

    .line 78
    .line 79
    .line 80
    sget-object v2, Lcom/alibaba/fastjson2/JSONPathSegment$SelfSegment;->INSTANCE:Lcom/alibaba/fastjson2/JSONPathSegment$SelfSegment;

    .line 81
    .line 82
    :goto_1
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_7
    const-string v0, "not support "

    .line 87
    .line 88
    invoke-static {v3, v0}, Lah/a;->g(ILjava/lang/String;)V

    .line 89
    .line 90
    .line 91
    const/4 v0, 0x0

    .line 92
    return-object v0

    .line 93
    :cond_8
    new-instance v1, Lcom/alibaba/fastjson2/JSONPath;

    .line 94
    .line 95
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONPathParser;->path:Ljava/lang/String;

    .line 96
    .line 97
    const/4 v3, 0x0

    .line 98
    invoke-direct {v1, v2, v0, v3, v3}, Lcom/alibaba/fastjson2/JSONPath;-><init>(Ljava/lang/String;Ljava/util/List;ZZ)V

    .line 99
    .line 100
    .line 101
    return-object v1
.end method
