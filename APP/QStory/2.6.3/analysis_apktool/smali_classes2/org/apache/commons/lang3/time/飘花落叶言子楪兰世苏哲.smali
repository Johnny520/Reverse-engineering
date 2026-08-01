.class public final Lorg/apache/commons/lang3/time/飘花落叶言子楪兰世苏哲;
.super Lorg/apache/commons/lang3/time/飘花落叶言子楪哲苏世兰;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final 飘花落叶言子楪世哲苏兰:Ljava/util/TreeMap;

.field public final 飘花落叶言子楪世苏兰哲:Ljava/util/Locale;


# direct methods
.method public constructor <init>(Ljava/util/Locale;)V
    .locals 14

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/TreeMap;

    .line 5
    .line 6
    sget-object v1, Ljava/lang/String;->CASE_INSENSITIVE_ORDER:Ljava/util/Comparator;

    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/util/TreeMap;-><init>(Ljava/util/Comparator;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lorg/apache/commons/lang3/time/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世哲苏兰:Ljava/util/TreeMap;

    .line 12
    .line 13
    sget v0, Lorg/apache/commons/lang3/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    move-object v0, p1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    :goto_0
    iput-object v0, p0, Lorg/apache/commons/lang3/time/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏兰哲:Ljava/util/Locale;

    .line 24
    .line 25
    const-string v0, "((?iu)[+-]\\d{4}|GMT[+-]\\d{1,2}:\\d{2}"

    .line 26
    .line 27
    invoke-static {v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪苏哲兰(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    new-instance v1, Ljava/util/TreeSet;

    .line 32
    .line 33
    invoke-static {}, Lorg/apache/commons/lang3/time/FastDateParser;->access$500()Ljava/util/Comparator;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-direct {v1, v2}, Ljava/util/TreeSet;-><init>(Ljava/util/Comparator;)V

    .line 38
    .line 39
    .line 40
    invoke-static {p1}, Ljava/text/DateFormatSymbols;->getInstance(Ljava/util/Locale;)Ljava/text/DateFormatSymbols;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v2}, Ljava/text/DateFormatSymbols;->getZoneStrings()[[Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    array-length v3, v2

    .line 49
    const/4 v4, 0x0

    .line 50
    move v5, v4

    .line 51
    :goto_1
    const-string v6, "GMT"

    .line 52
    .line 53
    const/4 v7, 0x1

    .line 54
    if-ge v5, v3, :cond_6

    .line 55
    .line 56
    aget-object v8, v2, v5

    .line 57
    .line 58
    aget-object v9, v8, v4

    .line 59
    .line 60
    invoke-virtual {v9, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    if-eqz v6, :cond_1

    .line 65
    .line 66
    goto :goto_4

    .line 67
    :cond_1
    invoke-static {v9}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    new-instance v9, Lorg/apache/commons/lang3/time/飘花落叶言子楪哲兰苏世;

    .line 72
    .line 73
    invoke-direct {v9, v6, v4}, Lorg/apache/commons/lang3/time/飘花落叶言子楪哲兰苏世;-><init>(Ljava/util/TimeZone;Z)V

    .line 74
    .line 75
    .line 76
    move v10, v7

    .line 77
    move-object v11, v9

    .line 78
    :goto_2
    array-length v12, v8

    .line 79
    if-ge v10, v12, :cond_5

    .line 80
    .line 81
    const/4 v12, 0x3

    .line 82
    if-eq v10, v12, :cond_3

    .line 83
    .line 84
    const/4 v12, 0x5

    .line 85
    if-eq v10, v12, :cond_2

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_2
    move-object v11, v9

    .line 89
    goto :goto_3

    .line 90
    :cond_3
    new-instance v11, Lorg/apache/commons/lang3/time/飘花落叶言子楪哲兰苏世;

    .line 91
    .line 92
    invoke-direct {v11, v6, v7}, Lorg/apache/commons/lang3/time/飘花落叶言子楪哲兰苏世;-><init>(Ljava/util/TimeZone;Z)V

    .line 93
    .line 94
    .line 95
    :goto_3
    aget-object v12, v8, v10

    .line 96
    .line 97
    if-eqz v12, :cond_4

    .line 98
    .line 99
    invoke-virtual {v1, v12}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v13

    .line 103
    if-eqz v13, :cond_4

    .line 104
    .line 105
    iget-object v13, p0, Lorg/apache/commons/lang3/time/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世哲苏兰:Ljava/util/TreeMap;

    .line 106
    .line 107
    invoke-virtual {v13, v12, v11}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    :cond_4
    add-int/lit8 v10, v10, 0x1

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_5
    :goto_4
    add-int/lit8 v5, v5, 0x1

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_6
    invoke-static {}, Ljava/util/TimeZone;->getAvailableIDs()[Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    if-eqz v2, :cond_7

    .line 121
    .line 122
    invoke-static {v2}, Ljava/util/Arrays;->sort([Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    :cond_7
    array-length v3, v2

    .line 126
    :goto_5
    if-ge v4, v3, :cond_a

    .line 127
    .line 128
    aget-object v5, v2, v4

    .line 129
    .line 130
    invoke-virtual {v5, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 131
    .line 132
    .line 133
    move-result v8

    .line 134
    if-eqz v8, :cond_8

    .line 135
    .line 136
    goto :goto_6

    .line 137
    :cond_8
    invoke-static {v5}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    .line 138
    .line 139
    .line 140
    move-result-object v5

    .line 141
    invoke-virtual {v5, p1}, Ljava/util/TimeZone;->getDisplayName(Ljava/util/Locale;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v8

    .line 145
    invoke-virtual {v1, v8}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v9

    .line 149
    if-eqz v9, :cond_9

    .line 150
    .line 151
    iget-object v9, p0, Lorg/apache/commons/lang3/time/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世哲苏兰:Ljava/util/TreeMap;

    .line 152
    .line 153
    new-instance v10, Lorg/apache/commons/lang3/time/飘花落叶言子楪哲兰苏世;

    .line 154
    .line 155
    invoke-virtual {v5}, Ljava/util/TimeZone;->observesDaylightTime()Z

    .line 156
    .line 157
    .line 158
    move-result v11

    .line 159
    invoke-direct {v10, v5, v11}, Lorg/apache/commons/lang3/time/飘花落叶言子楪哲兰苏世;-><init>(Ljava/util/TimeZone;Z)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v9, v8, v10}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    :cond_9
    :goto_6
    add-int/lit8 v4, v4, 0x1

    .line 166
    .line 167
    goto :goto_5

    .line 168
    :cond_a
    new-instance p1, Lorg/apache/commons/lang3/time/飘花落叶言子楪苏哲世兰;

    .line 169
    .line 170
    invoke-direct {p1, v0, v7}, Lorg/apache/commons/lang3/time/飘花落叶言子楪苏哲世兰;-><init>(Ljava/lang/StringBuilder;I)V

    .line 171
    .line 172
    .line 173
    invoke-interface {v1, p1}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 174
    .line 175
    .line 176
    const-string p1, ")"

    .line 177
    .line 178
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    invoke-static {p1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    iput-object p1, p0, Lorg/apache/commons/lang3/time/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏哲兰:Ljava/util/regex/Pattern;

    .line 190
    .line 191
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "TimeZoneStrategy [locale="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lorg/apache/commons/lang3/time/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏兰哲:Ljava/util/Locale;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", tzNames="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lorg/apache/commons/lang3/time/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世哲苏兰:Ljava/util/TreeMap;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", pattern="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, Lorg/apache/commons/lang3/time/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏哲兰:Ljava/util/regex/Pattern;

    .line 29
    .line 30
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string p0, "]"

    .line 34
    .line 35
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method

.method public final 飘花落叶言子楪世哲苏兰(Ljava/util/Calendar;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-static {p2}, Lorg/apache/commons/lang3/time/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/util/TimeZone;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Ljava/util/Calendar;->setTimeZone(Ljava/util/TimeZone;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget-object p0, p0, Lorg/apache/commons/lang3/time/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世哲苏兰:Ljava/util/TreeMap;

    .line 12
    .line 13
    invoke-virtual {p0, p2}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lorg/apache/commons/lang3/time/飘花落叶言子楪哲兰苏世;

    .line 18
    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    new-instance v0, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const/16 v1, 0x2e

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {p0, v0}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Lorg/apache/commons/lang3/time/飘花落叶言子楪哲兰苏世;

    .line 43
    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    invoke-virtual {p2}, Ljava/lang/String;->toCharArray()[C

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    array-length v1, p1

    .line 54
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-static {p1}, Ljava/util/Arrays;->toString([C)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    new-instance v2, Ljava/util/TreeSet;

    .line 63
    .line 64
    invoke-virtual {p0}, Ljava/util/TreeMap;->keySet()Ljava/util/Set;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-direct {v2, p0}, Ljava/util/TreeSet;-><init>(Ljava/util/Collection;)V

    .line 69
    .line 70
    .line 71
    filled-new-array {p2, v1, p1, v2}, [Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    const-string p1, "Can\'t find time zone \'%s\' (%d %s) in %s"

    .line 76
    .line 77
    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw v0

    .line 85
    :cond_2
    :goto_0
    const/16 p0, 0x10

    .line 86
    .line 87
    iget p2, v0, Lorg/apache/commons/lang3/time/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲:I

    .line 88
    .line 89
    invoke-virtual {p1, p0, p2}, Ljava/util/Calendar;->set(II)V

    .line 90
    .line 91
    .line 92
    iget-object p0, v0, Lorg/apache/commons/lang3/time/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:Ljava/util/TimeZone;

    .line 93
    .line 94
    invoke-virtual {p0}, Ljava/util/TimeZone;->getRawOffset()I

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    const/16 p2, 0xf

    .line 99
    .line 100
    invoke-virtual {p1, p2, p0}, Ljava/util/Calendar;->set(II)V

    .line 101
    .line 102
    .line 103
    return-void
.end method
