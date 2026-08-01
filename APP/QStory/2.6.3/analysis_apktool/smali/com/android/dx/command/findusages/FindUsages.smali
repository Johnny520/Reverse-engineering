.class public final Lcom/android/dx/command/findusages/FindUsages;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field private final codeReader:Lcom/android/dx/io/CodeReader;

.field private currentClass:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世兰哲苏;

.field private currentMethod:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世哲兰苏;

.field private final dex:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;

.field private final fieldIds:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final methodIds:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final out:Ljava/io/PrintWriter;


# direct methods
.method public constructor <init>(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;Ljava/lang/String;Ljava/lang/String;Ljava/io/PrintWriter;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/android/dx/io/CodeReader;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/android/dx/io/CodeReader;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/android/dx/command/findusages/FindUsages;->codeReader:Lcom/android/dx/io/CodeReader;

    .line 10
    .line 11
    iput-object p1, p0, Lcom/android/dx/command/findusages/FindUsages;->dex:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;

    .line 12
    .line 13
    iput-object p4, p0, Lcom/android/dx/command/findusages/FindUsages;->out:Ljava/io/PrintWriter;

    .line 14
    .line 15
    new-instance v0, Ljava/util/HashSet;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 18
    .line 19
    .line 20
    new-instance v1, Ljava/util/HashSet;

    .line 21
    .line 22
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-static {p2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-static {p3}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 30
    .line 31
    .line 32
    move-result-object p3

    .line 33
    iget-object v2, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏哲兰世;

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    :goto_0
    invoke-virtual {v2}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏哲兰世;->size()I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-ge v3, v4, :cond_2

    .line 41
    .line 42
    invoke-virtual {v2, v3}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏哲兰世;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    check-cast v4, Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {p2, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    invoke-virtual {v5}, Ljava/util/regex/Matcher;->matches()Z

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    if-eqz v5, :cond_0

    .line 57
    .line 58
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    invoke-virtual {v0, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    :cond_0
    invoke-virtual {p3, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->matches()Z

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    if-eqz v4, :cond_1

    .line 74
    .line 75
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_2
    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    .line 86
    .line 87
    .line 88
    move-result p2

    .line 89
    if-nez p2, :cond_6

    .line 90
    .line 91
    invoke-virtual {v1}, Ljava/util/HashSet;->isEmpty()Z

    .line 92
    .line 93
    .line 94
    move-result p2

    .line 95
    if-eqz p2, :cond_3

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_3
    new-instance p2, Ljava/util/HashSet;

    .line 99
    .line 100
    invoke-direct {p2}, Ljava/util/HashSet;-><init>()V

    .line 101
    .line 102
    .line 103
    iput-object p2, p0, Lcom/android/dx/command/findusages/FindUsages;->methodIds:Ljava/util/Set;

    .line 104
    .line 105
    new-instance p2, Ljava/util/HashSet;

    .line 106
    .line 107
    invoke-direct {p2}, Ljava/util/HashSet;-><init>()V

    .line 108
    .line 109
    .line 110
    iput-object p2, p0, Lcom/android/dx/command/findusages/FindUsages;->fieldIds:Ljava/util/Set;

    .line 111
    .line 112
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 117
    .line 118
    .line 119
    move-result p3

    .line 120
    if-eqz p3, :cond_5

    .line 121
    .line 122
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p3

    .line 126
    check-cast p3, Ljava/lang/Integer;

    .line 127
    .line 128
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 129
    .line 130
    .line 131
    iget-object v0, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰苏哲:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏哲兰世;

    .line 132
    .line 133
    invoke-static {v0, p3}, Ljava/util/Collections;->binarySearch(Ljava/util/List;Ljava/lang/Object;)I

    .line 134
    .line 135
    .line 136
    move-result p3

    .line 137
    if-gez p3, :cond_4

    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_4
    iget-object v0, p0, Lcom/android/dx/command/findusages/FindUsages;->methodIds:Ljava/util/Set;

    .line 141
    .line 142
    invoke-direct {p0, p1, v1, p3}, Lcom/android/dx/command/findusages/FindUsages;->getMethodIds(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;Ljava/util/Set;I)Ljava/util/Set;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    invoke-interface {v0, v2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 147
    .line 148
    .line 149
    iget-object v0, p0, Lcom/android/dx/command/findusages/FindUsages;->fieldIds:Ljava/util/Set;

    .line 150
    .line 151
    invoke-direct {p0, p1, v1, p3}, Lcom/android/dx/command/findusages/FindUsages;->getFieldIds(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;Ljava/util/Set;I)Ljava/util/Set;

    .line 152
    .line 153
    .line 154
    move-result-object p3

    .line 155
    invoke-interface {v0, p3}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 156
    .line 157
    .line 158
    goto :goto_1

    .line 159
    :cond_5
    iget-object p2, p0, Lcom/android/dx/command/findusages/FindUsages;->codeReader:Lcom/android/dx/io/CodeReader;

    .line 160
    .line 161
    new-instance p3, Lcom/android/dx/command/findusages/FindUsages$1;

    .line 162
    .line 163
    invoke-direct {p3, p0, p4, p1}, Lcom/android/dx/command/findusages/FindUsages$1;-><init>(Lcom/android/dx/command/findusages/FindUsages;Ljava/io/PrintWriter;L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p2, p3}, Lcom/android/dx/io/CodeReader;->setFieldVisitor(Lcom/android/dx/io/CodeReader$Visitor;)V

    .line 167
    .line 168
    .line 169
    iget-object p2, p0, Lcom/android/dx/command/findusages/FindUsages;->codeReader:Lcom/android/dx/io/CodeReader;

    .line 170
    .line 171
    new-instance p3, Lcom/android/dx/command/findusages/FindUsages$2;

    .line 172
    .line 173
    invoke-direct {p3, p0, p4, p1}, Lcom/android/dx/command/findusages/FindUsages$2;-><init>(Lcom/android/dx/command/findusages/FindUsages;Ljava/io/PrintWriter;L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {p2, p3}, Lcom/android/dx/io/CodeReader;->setMethodVisitor(Lcom/android/dx/io/CodeReader$Visitor;)V

    .line 177
    .line 178
    .line 179
    return-void

    .line 180
    :cond_6
    :goto_2
    const/4 p1, 0x0

    .line 181
    iput-object p1, p0, Lcom/android/dx/command/findusages/FindUsages;->fieldIds:Ljava/util/Set;

    .line 182
    .line 183
    iput-object p1, p0, Lcom/android/dx/command/findusages/FindUsages;->methodIds:Ljava/util/Set;

    .line 184
    .line 185
    return-void
.end method

.method public static synthetic access$000(Lcom/android/dx/command/findusages/FindUsages;)Ljava/util/Set;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/command/findusages/FindUsages;->fieldIds:Ljava/util/Set;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$100(Lcom/android/dx/command/findusages/FindUsages;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/android/dx/command/findusages/FindUsages;->location()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic access$200(Lcom/android/dx/command/findusages/FindUsages;)Ljava/util/Set;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/command/findusages/FindUsages;->methodIds:Ljava/util/Set;

    .line 2
    .line 3
    return-object p0
.end method

.method private findAssignableTypes(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;I)Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5b50\u54f2\u5170\u82cf\u4e16/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;",
            "I)",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    invoke-virtual {p0, p2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object p2, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰世哲苏;

    .line 17
    .line 18
    iget-object p2, p2, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰世苏哲;

    .line 19
    .line 20
    invoke-virtual {p2}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏哲兰()Z

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    if-nez p2, :cond_0

    .line 25
    .line 26
    sget-object p1, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 27
    .line 28
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    new-instance p2, Lcom/google/protobuf/飘花落叶言世兰楪子哲苏;

    .line 34
    .line 35
    invoke-direct {p2, p1}, Lcom/google/protobuf/飘花落叶言世兰楪子哲苏;-><init>(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;)V

    .line 36
    .line 37
    .line 38
    move-object p1, p2

    .line 39
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    if-eqz p2, :cond_5

    .line 44
    .line 45
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    check-cast p2, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世兰哲苏;

    .line 50
    .line 51
    iget v0, p2, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲:I

    .line 52
    .line 53
    iget v1, p2, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰:I

    .line 54
    .line 55
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {p0, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_2

    .line 64
    .line 65
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    invoke-virtual {p0, p2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_2
    iget-object v0, p2, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;

    .line 74
    .line 75
    iget p2, p2, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏:I

    .line 76
    .line 77
    if-nez p2, :cond_3

    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    sget-object p2, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲兰苏世:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰苏世哲;

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_3
    invoke-virtual {v0, p2}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏(I)L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰世哲;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    invoke-virtual {p2}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲兰苏()L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰苏世哲;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    :goto_1
    iget-object p2, p2, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲兰世苏:[S

    .line 94
    .line 95
    array-length v0, p2

    .line 96
    const/4 v2, 0x0

    .line 97
    :goto_2
    if-ge v2, v0, :cond_1

    .line 98
    .line 99
    aget-short v3, p2, v2

    .line 100
    .line 101
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    invoke-virtual {p0, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    if-eqz v3, :cond_4

    .line 110
    .line 111
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    invoke-virtual {p0, p2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_5
    return-object p0
.end method

.method private getFieldIds(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;Ljava/util/Set;I)Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5b50\u54f2\u5170\u82cf\u4e16/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;I)",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p1, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏世兰哲:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏哲兰世;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/util/AbstractList;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const/4 v0, 0x0

    .line 13
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲苏世兰;

    .line 24
    .line 25
    iget v2, v1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世苏哲:I

    .line 26
    .line 27
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-interface {p2, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    iget v1, v1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰世苏:I

    .line 38
    .line 39
    if-ne p3, v1, :cond_0

    .line 40
    .line 41
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {p0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    return-object p0
.end method

.method private getMethodIds(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;Ljava/util/Set;I)Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5b50\u54f2\u5170\u82cf\u4e16/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;I)",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p3}, Lcom/android/dx/command/findusages/FindUsages;->findAssignableTypes(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;I)Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    new-instance p3, Ljava/util/HashSet;

    .line 6
    .line 7
    invoke-direct {p3}, Ljava/util/HashSet;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-object p1, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏哲世兰:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏哲兰世;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/util/AbstractList;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const/4 v0, 0x0

    .line 17
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲兰世苏;

    .line 28
    .line 29
    iget v2, v1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪兰世苏哲:I

    .line 30
    .line 31
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-interface {p2, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_0

    .line 40
    .line 41
    iget v1, v1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲兰世苏:I

    .line 42
    .line 43
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-interface {p0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_0

    .line 52
    .line 53
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {p3, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    return-object p3
.end method

.method private location()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/android/dx/command/findusages/FindUsages;->dex:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;

    .line 2
    .line 3
    iget-object v0, v0, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰哲苏:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏哲兰世;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/android/dx/command/findusages/FindUsages;->currentClass:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世兰哲苏;

    .line 6
    .line 7
    iget v1, v1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰:I

    .line 8
    .line 9
    invoke-virtual {v0, v1}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏哲兰世;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/String;

    .line 14
    .line 15
    iget-object v1, p0, Lcom/android/dx/command/findusages/FindUsages;->currentMethod:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世哲兰苏;

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    iget-object v2, p0, Lcom/android/dx/command/findusages/FindUsages;->dex:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;

    .line 20
    .line 21
    iget-object v2, v2, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏哲世兰:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏哲兰世;

    .line 22
    .line 23
    iget v1, v1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:I

    .line 24
    .line 25
    invoke-virtual {v2, v1}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏哲兰世;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲兰世苏;

    .line 30
    .line 31
    const-string v2, "."

    .line 32
    .line 33
    invoke-static {v0, v2}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iget-object p0, p0, Lcom/android/dx/command/findusages/FindUsages;->dex:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;

    .line 38
    .line 39
    iget-object p0, p0, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏哲兰世;

    .line 40
    .line 41
    iget v1, v1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪兰世苏哲:I

    .line 42
    .line 43
    invoke-virtual {p0, v1}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏哲兰世;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    check-cast p0, Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :cond_0
    return-object v0
.end method


# virtual methods
.method public findUsages()V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/android/dx/command/findusages/FindUsages;->fieldIds:Ljava/util/Set;

    .line 2
    .line 3
    if-eqz v0, :cond_9

    .line 4
    .line 5
    iget-object v0, p0, Lcom/android/dx/command/findusages/FindUsages;->methodIds:Ljava/util/Set;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_3

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/android/dx/command/findusages/FindUsages;->dex:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object v1, v0, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰世哲苏;

    .line 17
    .line 18
    iget-object v1, v1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰世苏哲;

    .line 19
    .line 20
    invoke-virtual {v1}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏哲兰()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    new-instance v1, Lcom/google/protobuf/飘花落叶言世兰楪子哲苏;

    .line 34
    .line 35
    invoke-direct {v1, v0}, Lcom/google/protobuf/飘花落叶言世兰楪子哲苏;-><init>(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;)V

    .line 36
    .line 37
    .line 38
    move-object v0, v1

    .line 39
    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    const/4 v2, 0x0

    .line 44
    if-eqz v1, :cond_8

    .line 45
    .line 46
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    check-cast v1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世兰哲苏;

    .line 51
    .line 52
    iput-object v1, p0, Lcom/android/dx/command/findusages/FindUsages;->currentClass:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世兰哲苏;

    .line 53
    .line 54
    iput-object v2, p0, Lcom/android/dx/command/findusages/FindUsages;->currentMethod:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世哲兰苏;

    .line 55
    .line 56
    iget v2, v1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰:I

    .line 57
    .line 58
    if-nez v2, :cond_3

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    iget-object v2, p0, Lcom/android/dx/command/findusages/FindUsages;->dex:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;

    .line 62
    .line 63
    invoke-virtual {v2, v1}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰苏哲(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世兰哲苏;)L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世兰苏哲;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    iget-object v2, v1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:[L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世哲苏兰;

    .line 68
    .line 69
    array-length v3, v2

    .line 70
    iget-object v4, v1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:[L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世哲苏兰;

    .line 71
    .line 72
    array-length v5, v4

    .line 73
    add-int/2addr v3, v5

    .line 74
    new-array v5, v3, [L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世哲苏兰;

    .line 75
    .line 76
    array-length v6, v2

    .line 77
    const/4 v7, 0x0

    .line 78
    invoke-static {v2, v7, v5, v7, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 79
    .line 80
    .line 81
    array-length v2, v2

    .line 82
    array-length v6, v4

    .line 83
    invoke-static {v4, v7, v5, v2, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 84
    .line 85
    .line 86
    move v2, v7

    .line 87
    :goto_1
    if-ge v2, v3, :cond_5

    .line 88
    .line 89
    aget-object v4, v5, v2

    .line 90
    .line 91
    iget v4, v4, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 92
    .line 93
    iget-object v6, p0, Lcom/android/dx/command/findusages/FindUsages;->fieldIds:Ljava/util/Set;

    .line 94
    .line 95
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object v8

    .line 99
    invoke-interface {v6, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v6

    .line 103
    if-eqz v6, :cond_4

    .line 104
    .line 105
    iget-object v6, p0, Lcom/android/dx/command/findusages/FindUsages;->out:Ljava/io/PrintWriter;

    .line 106
    .line 107
    new-instance v8, Ljava/lang/StringBuilder;

    .line 108
    .line 109
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 110
    .line 111
    .line 112
    invoke-direct {p0}, Lcom/android/dx/command/findusages/FindUsages;->location()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v9

    .line 116
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    const-string v9, " field declared "

    .line 120
    .line 121
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    iget-object v9, p0, Lcom/android/dx/command/findusages/FindUsages;->dex:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;

    .line 125
    .line 126
    iget-object v9, v9, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏世兰哲:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏哲兰世;

    .line 127
    .line 128
    invoke-virtual {v9, v4}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏哲兰世;->get(I)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    invoke-virtual {v6, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_5
    iget-object v2, v1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰:[L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世哲兰苏;

    .line 146
    .line 147
    array-length v3, v2

    .line 148
    iget-object v1, v1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏:[L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世哲兰苏;

    .line 149
    .line 150
    array-length v4, v1

    .line 151
    add-int/2addr v3, v4

    .line 152
    new-array v4, v3, [L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世哲兰苏;

    .line 153
    .line 154
    array-length v5, v2

    .line 155
    invoke-static {v2, v7, v4, v7, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 156
    .line 157
    .line 158
    array-length v2, v2

    .line 159
    array-length v5, v1

    .line 160
    invoke-static {v1, v7, v4, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 161
    .line 162
    .line 163
    :goto_2
    if-ge v7, v3, :cond_2

    .line 164
    .line 165
    aget-object v1, v4, v7

    .line 166
    .line 167
    iput-object v1, p0, Lcom/android/dx/command/findusages/FindUsages;->currentMethod:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世哲兰苏;

    .line 168
    .line 169
    iget v2, v1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:I

    .line 170
    .line 171
    iget-object v5, p0, Lcom/android/dx/command/findusages/FindUsages;->methodIds:Ljava/util/Set;

    .line 172
    .line 173
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 174
    .line 175
    .line 176
    move-result-object v6

    .line 177
    invoke-interface {v5, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v5

    .line 181
    if-eqz v5, :cond_6

    .line 182
    .line 183
    iget-object v5, p0, Lcom/android/dx/command/findusages/FindUsages;->out:Ljava/io/PrintWriter;

    .line 184
    .line 185
    new-instance v6, Ljava/lang/StringBuilder;

    .line 186
    .line 187
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 188
    .line 189
    .line 190
    invoke-direct {p0}, Lcom/android/dx/command/findusages/FindUsages;->location()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v8

    .line 194
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    const-string v8, " method declared "

    .line 198
    .line 199
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    iget-object v8, p0, Lcom/android/dx/command/findusages/FindUsages;->dex:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;

    .line 203
    .line 204
    iget-object v8, v8, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏哲世兰:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏哲兰世;

    .line 205
    .line 206
    invoke-virtual {v8, v2}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏哲兰世;->get(I)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    invoke-virtual {v5, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    :cond_6
    iget v2, v1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰:I

    .line 221
    .line 222
    if-eqz v2, :cond_7

    .line 223
    .line 224
    iget-object v2, p0, Lcom/android/dx/command/findusages/FindUsages;->codeReader:Lcom/android/dx/io/CodeReader;

    .line 225
    .line 226
    iget-object v5, p0, Lcom/android/dx/command/findusages/FindUsages;->dex:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;

    .line 227
    .line 228
    invoke-virtual {v5, v1}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰哲苏(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世哲兰苏;)L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏哲世兰;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    iget-object v1, v1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世兰苏哲:[S

    .line 233
    .line 234
    invoke-virtual {v2, v1}, Lcom/android/dx/io/CodeReader;->visitAll([S)V

    .line 235
    .line 236
    .line 237
    :cond_7
    add-int/lit8 v7, v7, 0x1

    .line 238
    .line 239
    goto :goto_2

    .line 240
    :cond_8
    iput-object v2, p0, Lcom/android/dx/command/findusages/FindUsages;->currentClass:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世兰哲苏;

    .line 241
    .line 242
    iput-object v2, p0, Lcom/android/dx/command/findusages/FindUsages;->currentMethod:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世哲兰苏;

    .line 243
    .line 244
    :cond_9
    :goto_3
    return-void
.end method
