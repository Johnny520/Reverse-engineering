.class public Lcom/esotericsoftware/kryo/util/DefaultClassResolver;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lcom/esotericsoftware/kryo/ClassResolver;


# static fields
.field public static final NAME:B = -0x1t


# instance fields
.field protected classToNameId:Lcom/esotericsoftware/kryo/util/IdentityObjectIntMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/esotericsoftware/kryo/util/IdentityObjectIntMap<",
            "Ljava/lang/Class;",
            ">;"
        }
    .end annotation
.end field

.field protected final classToRegistration:Lcom/esotericsoftware/kryo/util/IdentityMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/esotericsoftware/kryo/util/IdentityMap<",
            "Ljava/lang/Class;",
            "Lcom/esotericsoftware/kryo/Registration;",
            ">;"
        }
    .end annotation
.end field

.field protected final idToRegistration:Lcom/esotericsoftware/kryo/util/IntMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/esotericsoftware/kryo/util/IntMap<",
            "Lcom/esotericsoftware/kryo/Registration;",
            ">;"
        }
    .end annotation
.end field

.field protected kryo:Lcom/esotericsoftware/kryo/Kryo;

.field private memoizedClass:Ljava/lang/Class;

.field private memoizedClassId:I

.field private memoizedClassIdValue:Lcom/esotericsoftware/kryo/Registration;

.field private memoizedClassValue:Lcom/esotericsoftware/kryo/Registration;

.field protected nameIdToClass:Lcom/esotericsoftware/kryo/util/IntMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/esotericsoftware/kryo/util/IntMap<",
            "Ljava/lang/Class;",
            ">;"
        }
    .end annotation
.end field

.field protected nameToClass:Lcom/esotericsoftware/kryo/util/ObjectMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/esotericsoftware/kryo/util/ObjectMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Class;",
            ">;"
        }
    .end annotation
.end field

.field protected nextNameId:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/esotericsoftware/kryo/util/IntMap;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/esotericsoftware/kryo/util/IntMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/esotericsoftware/kryo/util/DefaultClassResolver;->idToRegistration:Lcom/esotericsoftware/kryo/util/IntMap;

    .line 10
    .line 11
    new-instance v0, Lcom/esotericsoftware/kryo/util/IdentityMap;

    .line 12
    .line 13
    invoke-direct {v0}, Lcom/esotericsoftware/kryo/util/IdentityMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/esotericsoftware/kryo/util/DefaultClassResolver;->classToRegistration:Lcom/esotericsoftware/kryo/util/IdentityMap;

    .line 17
    .line 18
    const/4 v0, -0x1

    .line 19
    iput v0, p0, Lcom/esotericsoftware/kryo/util/DefaultClassResolver;->memoizedClassId:I

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public getRegistration(I)Lcom/esotericsoftware/kryo/Registration;
    .locals 0

    .line 23
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/DefaultClassResolver;->idToRegistration:Lcom/esotericsoftware/kryo/util/IntMap;

    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/util/IntMap;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/esotericsoftware/kryo/Registration;

    return-object p0
.end method

.method public getRegistration(Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Registration;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/DefaultClassResolver;->memoizedClass:Ljava/lang/Class;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/DefaultClassResolver;->memoizedClassValue:Lcom/esotericsoftware/kryo/Registration;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/DefaultClassResolver;->classToRegistration:Lcom/esotericsoftware/kryo/util/IdentityMap;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lcom/esotericsoftware/kryo/util/IdentityMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lcom/esotericsoftware/kryo/Registration;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iput-object p1, p0, Lcom/esotericsoftware/kryo/util/DefaultClassResolver;->memoizedClass:Ljava/lang/Class;

    .line 19
    .line 20
    iput-object v0, p0, Lcom/esotericsoftware/kryo/util/DefaultClassResolver;->memoizedClassValue:Lcom/esotericsoftware/kryo/Registration;

    .line 21
    .line 22
    :cond_1
    return-object v0
.end method

.method public getTypeByName(Ljava/lang/String;)Ljava/lang/Class;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/DefaultClassResolver;->nameToClass:Lcom/esotericsoftware/kryo/util/ObjectMap;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/util/ObjectMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ljava/lang/Class;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return-object p0
.end method

.method public readClass(Lcom/esotericsoftware/kryo/io/Input;)Lcom/esotericsoftware/kryo/Registration;
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p1, v0}, Lcom/esotericsoftware/kryo/io/Input;->readVarInt(Z)I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-eqz v1, :cond_5

    .line 7
    .line 8
    if-eq v1, v0, :cond_4

    .line 9
    .line 10
    iget v0, p0, Lcom/esotericsoftware/kryo/util/DefaultClassResolver;->memoizedClassId:I

    .line 11
    .line 12
    const-string v2, ": "

    .line 13
    .line 14
    const-string v3, "Read class "

    .line 15
    .line 16
    const-string v4, "kryo"

    .line 17
    .line 18
    if-ne v1, v0, :cond_1

    .line 19
    .line 20
    sget-boolean v0, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    new-instance v0, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    add-int/lit8 v1, v1, -0x2

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/DefaultClassResolver;->memoizedClassIdValue:Lcom/esotericsoftware/kryo/Registration;

    .line 38
    .line 39
    invoke-virtual {v1}, Lcom/esotericsoftware/kryo/Registration;->getType()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-static {v1}, Lcom/esotericsoftware/kryo/util/Util;->className(Ljava/lang/Class;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/io/Input;->position()I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    invoke-static {p1}, Lcom/esotericsoftware/kryo/util/Util;->pos(I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-static {v4, p1}, Lcom/esotericsoftware/minlog/Log;->trace(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    :cond_0
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/DefaultClassResolver;->memoizedClassIdValue:Lcom/esotericsoftware/kryo/Registration;

    .line 69
    .line 70
    return-object p0

    .line 71
    :cond_1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/DefaultClassResolver;->idToRegistration:Lcom/esotericsoftware/kryo/util/IntMap;

    .line 72
    .line 73
    add-int/lit8 v5, v1, -0x2

    .line 74
    .line 75
    invoke-virtual {v0, v5}, Lcom/esotericsoftware/kryo/util/IntMap;->get(I)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    check-cast v0, Lcom/esotericsoftware/kryo/Registration;

    .line 80
    .line 81
    if-eqz v0, :cond_3

    .line 82
    .line 83
    sget-boolean v6, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 84
    .line 85
    if-eqz v6, :cond_2

    .line 86
    .line 87
    invoke-static {v5, v3, v2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲苏世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-virtual {v0}, Lcom/esotericsoftware/kryo/Registration;->getType()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    invoke-static {v3}, Lcom/esotericsoftware/kryo/util/Util;->className(Ljava/lang/Class;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/io/Input;->position()I

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    invoke-static {p1}, Lcom/esotericsoftware/kryo/util/Util;->pos(I)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-static {v4, p1}, Lcom/esotericsoftware/minlog/Log;->trace(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    :cond_2
    iput v1, p0, Lcom/esotericsoftware/kryo/util/DefaultClassResolver;->memoizedClassId:I

    .line 121
    .line 122
    iput-object v0, p0, Lcom/esotericsoftware/kryo/util/DefaultClassResolver;->memoizedClassIdValue:Lcom/esotericsoftware/kryo/Registration;

    .line 123
    .line 124
    return-object v0

    .line 125
    :cond_3
    new-instance p0, Lcom/esotericsoftware/kryo/KryoException;

    .line 126
    .line 127
    const-string p1, "Encountered unregistered class ID: "

    .line 128
    .line 129
    invoke-static {v5, p1}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/KryoException;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    throw p0

    .line 137
    :cond_4
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/util/DefaultClassResolver;->readName(Lcom/esotericsoftware/kryo/io/Input;)Lcom/esotericsoftware/kryo/Registration;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    return-object p0

    .line 142
    :cond_5
    sget-boolean v1, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 143
    .line 144
    const/4 v2, 0x0

    .line 145
    if-nez v1, :cond_6

    .line 146
    .line 147
    sget-boolean v1, Lcom/esotericsoftware/minlog/Log;->DEBUG:Z

    .line 148
    .line 149
    if-eqz v1, :cond_7

    .line 150
    .line 151
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/DefaultClassResolver;->kryo:Lcom/esotericsoftware/kryo/Kryo;

    .line 152
    .line 153
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/Kryo;->getDepth()I

    .line 154
    .line 155
    .line 156
    move-result p0

    .line 157
    if-ne p0, v0, :cond_7

    .line 158
    .line 159
    :cond_6
    const-string p0, "Read"

    .line 160
    .line 161
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/io/Input;->position()I

    .line 162
    .line 163
    .line 164
    move-result p1

    .line 165
    invoke-static {p0, v2, p1}, Lcom/esotericsoftware/kryo/util/Util;->log(Ljava/lang/String;Ljava/lang/Object;I)V

    .line 166
    .line 167
    .line 168
    :cond_7
    return-object v2
.end method

.method public readName(Lcom/esotericsoftware/kryo/io/Input;)Lcom/esotericsoftware/kryo/Registration;
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p1, v0}, Lcom/esotericsoftware/kryo/io/Input;->readVarInt(Z)I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/DefaultClassResolver;->nameIdToClass:Lcom/esotericsoftware/kryo/util/IntMap;

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    new-instance v1, Lcom/esotericsoftware/kryo/util/IntMap;

    .line 11
    .line 12
    invoke-direct {v1}, Lcom/esotericsoftware/kryo/util/IntMap;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v1, p0, Lcom/esotericsoftware/kryo/util/DefaultClassResolver;->nameIdToClass:Lcom/esotericsoftware/kryo/util/IntMap;

    .line 16
    .line 17
    :cond_0
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/DefaultClassResolver;->nameIdToClass:Lcom/esotericsoftware/kryo/util/IntMap;

    .line 18
    .line 19
    invoke-virtual {v1, v0}, Lcom/esotericsoftware/kryo/util/IntMap;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Ljava/lang/Class;

    .line 24
    .line 25
    const-string v2, "kryo"

    .line 26
    .line 27
    if-nez v1, :cond_4

    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/io/Input;->readString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/util/DefaultClassResolver;->getTypeByName(Ljava/lang/String;)Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    if-nez v3, :cond_2

    .line 38
    .line 39
    const/4 v3, 0x0

    .line 40
    :try_start_0
    iget-object v4, p0, Lcom/esotericsoftware/kryo/util/DefaultClassResolver;->kryo:Lcom/esotericsoftware/kryo/Kryo;

    .line 41
    .line 42
    invoke-virtual {v4}, Lcom/esotericsoftware/kryo/Kryo;->getClassLoader()Ljava/lang/ClassLoader;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    invoke-static {v1, v3, v4}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-result-object v3
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    goto :goto_0

    .line 51
    :catch_0
    move-exception v4

    .line 52
    :try_start_1
    const-class v5, Lcom/esotericsoftware/kryo/Kryo;

    .line 53
    .line 54
    invoke-virtual {v5}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    invoke-static {v1, v3, v5}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object v3
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 62
    :goto_0
    iget-object v4, p0, Lcom/esotericsoftware/kryo/util/DefaultClassResolver;->nameToClass:Lcom/esotericsoftware/kryo/util/ObjectMap;

    .line 63
    .line 64
    if-nez v4, :cond_1

    .line 65
    .line 66
    new-instance v4, Lcom/esotericsoftware/kryo/util/ObjectMap;

    .line 67
    .line 68
    invoke-direct {v4}, Lcom/esotericsoftware/kryo/util/ObjectMap;-><init>()V

    .line 69
    .line 70
    .line 71
    iput-object v4, p0, Lcom/esotericsoftware/kryo/util/DefaultClassResolver;->nameToClass:Lcom/esotericsoftware/kryo/util/ObjectMap;

    .line 72
    .line 73
    :cond_1
    iget-object v4, p0, Lcom/esotericsoftware/kryo/util/DefaultClassResolver;->nameToClass:Lcom/esotericsoftware/kryo/util/ObjectMap;

    .line 74
    .line 75
    invoke-virtual {v4, v1, v3}, Lcom/esotericsoftware/kryo/util/ObjectMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :catch_1
    new-instance p0, Lcom/esotericsoftware/kryo/KryoException;

    .line 80
    .line 81
    const-string p1, "Unable to find class: "

    .line 82
    .line 83
    invoke-static {p1, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-direct {p0, p1, v4}, Lcom/esotericsoftware/kryo/KryoException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 88
    .line 89
    .line 90
    throw p0

    .line 91
    :cond_2
    :goto_1
    iget-object v4, p0, Lcom/esotericsoftware/kryo/util/DefaultClassResolver;->nameIdToClass:Lcom/esotericsoftware/kryo/util/IntMap;

    .line 92
    .line 93
    invoke-virtual {v4, v0, v3}, Lcom/esotericsoftware/kryo/util/IntMap;->put(ILjava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    sget-boolean v0, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 97
    .line 98
    if-eqz v0, :cond_3

    .line 99
    .line 100
    new-instance v0, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    const-string v4, "Read class name: "

    .line 103
    .line 104
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/io/Input;->position()I

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    invoke-static {p1}, Lcom/esotericsoftware/kryo/util/Util;->pos(I)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    invoke-static {v2, p1}, Lcom/esotericsoftware/minlog/Log;->trace(Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    :cond_3
    move-object v1, v3

    .line 129
    goto :goto_2

    .line 130
    :cond_4
    sget-boolean v3, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 131
    .line 132
    if-eqz v3, :cond_5

    .line 133
    .line 134
    const-string v3, "Read class name reference "

    .line 135
    .line 136
    const-string v4, ": "

    .line 137
    .line 138
    invoke-static {v0, v3, v4}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲苏世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-static {v1}, Lcom/esotericsoftware/kryo/util/Util;->className(Ljava/lang/Class;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/io/Input;->position()I

    .line 150
    .line 151
    .line 152
    move-result p1

    .line 153
    invoke-static {p1}, Lcom/esotericsoftware/kryo/util/Util;->pos(I)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    invoke-static {v2, p1}, Lcom/esotericsoftware/minlog/Log;->trace(Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    :cond_5
    :goto_2
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/DefaultClassResolver;->kryo:Lcom/esotericsoftware/kryo/Kryo;

    .line 168
    .line 169
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/Kryo;->getRegistration(Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Registration;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    return-object p0
.end method

.method public register(Lcom/esotericsoftware/kryo/Registration;)Lcom/esotericsoftware/kryo/Registration;
    .locals 5

    .line 1
    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lcom/esotericsoftware/kryo/util/DefaultClassResolver;->memoizedClassId:I

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    iput-object v1, p0, Lcom/esotericsoftware/kryo/util/DefaultClassResolver;->memoizedClass:Ljava/lang/Class;

    .line 6
    .line 7
    if-eqz p1, :cond_4

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/Registration;->getId()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const-string v2, ")"

    .line 14
    .line 15
    const-string v3, " ("

    .line 16
    .line 17
    const-string v4, "kryo"

    .line 18
    .line 19
    if-eq v1, v0, :cond_1

    .line 20
    .line 21
    sget-boolean v0, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    new-instance v0, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const-string v1, "Register class ID "

    .line 28
    .line 29
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/Registration;->getId()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v1, ": "

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/Registration;->getType()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-static {v1}, Lcom/esotericsoftware/kryo/util/Util;->className(Ljava/lang/Class;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/Registration;->getSerializer()Lcom/esotericsoftware/kryo/Serializer;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-static {v4, v0}, Lcom/esotericsoftware/minlog/Log;->trace(Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    :cond_0
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/DefaultClassResolver;->idToRegistration:Lcom/esotericsoftware/kryo/util/IntMap;

    .line 84
    .line 85
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/Registration;->getId()I

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    invoke-virtual {v0, v1, p1}, Lcom/esotericsoftware/kryo/util/IntMap;->put(ILjava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_1
    sget-boolean v0, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 94
    .line 95
    if-eqz v0, :cond_2

    .line 96
    .line 97
    new-instance v0, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    const-string v1, "Register class name: "

    .line 100
    .line 101
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/Registration;->getType()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-static {v1}, Lcom/esotericsoftware/kryo/util/Util;->className(Ljava/lang/Class;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/Registration;->getSerializer()Lcom/esotericsoftware/kryo/Serializer;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-static {v4, v0}, Lcom/esotericsoftware/minlog/Log;->trace(Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/DefaultClassResolver;->classToRegistration:Lcom/esotericsoftware/kryo/util/IdentityMap;

    .line 144
    .line 145
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/Registration;->getType()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    invoke-virtual {v0, v1, p1}, Lcom/esotericsoftware/kryo/util/ObjectMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/Registration;->getType()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-static {v0}, Lcom/esotericsoftware/kryo/util/Util;->getWrapperClass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/Registration;->getType()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    if-eq v0, v1, :cond_3

    .line 165
    .line 166
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/DefaultClassResolver;->classToRegistration:Lcom/esotericsoftware/kryo/util/IdentityMap;

    .line 167
    .line 168
    invoke-virtual {p0, v0, p1}, Lcom/esotericsoftware/kryo/util/ObjectMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    :cond_3
    return-object p1

    .line 172
    :cond_4
    const-string p0, "registration cannot be null."

    .line 173
    .line 174
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    return-object v1
.end method

.method public registerImplicit(Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Registration;
    .locals 3

    .line 1
    new-instance v0, Lcom/esotericsoftware/kryo/Registration;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/DefaultClassResolver;->kryo:Lcom/esotericsoftware/kryo/Kryo;

    .line 4
    .line 5
    invoke-virtual {v1, p1}, Lcom/esotericsoftware/kryo/Kryo;->getDefaultSerializer(Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Serializer;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, -0x1

    .line 10
    invoke-direct {v0, p1, v1, v2}, Lcom/esotericsoftware/kryo/Registration;-><init>(Ljava/lang/Class;Lcom/esotericsoftware/kryo/Serializer;I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/util/DefaultClassResolver;->register(Lcom/esotericsoftware/kryo/Registration;)Lcom/esotericsoftware/kryo/Registration;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public reset()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/DefaultClassResolver;->kryo:Lcom/esotericsoftware/kryo/Kryo;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/esotericsoftware/kryo/Kryo;->isRegistrationRequired()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_2

    .line 8
    .line 9
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/DefaultClassResolver;->classToNameId:Lcom/esotericsoftware/kryo/util/IdentityObjectIntMap;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/16 v1, 0x800

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->clear(I)V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/DefaultClassResolver;->nameIdToClass:Lcom/esotericsoftware/kryo/util/IntMap;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/esotericsoftware/kryo/util/IntMap;->clear()V

    .line 23
    .line 24
    .line 25
    :cond_1
    const/4 v0, 0x0

    .line 26
    iput v0, p0, Lcom/esotericsoftware/kryo/util/DefaultClassResolver;->nextNameId:I

    .line 27
    .line 28
    :cond_2
    return-void
.end method

.method public setKryo(Lcom/esotericsoftware/kryo/Kryo;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/esotericsoftware/kryo/util/DefaultClassResolver;->kryo:Lcom/esotericsoftware/kryo/Kryo;

    .line 2
    .line 3
    return-void
.end method

.method public unregister(I)Lcom/esotericsoftware/kryo/Registration;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/DefaultClassResolver;->idToRegistration:Lcom/esotericsoftware/kryo/util/IntMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/esotericsoftware/kryo/util/IntMap;->remove(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/esotericsoftware/kryo/Registration;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/DefaultClassResolver;->classToRegistration:Lcom/esotericsoftware/kryo/util/IdentityMap;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/Registration;->getType()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Lcom/esotericsoftware/kryo/util/ObjectMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    const/4 v0, -0x1

    .line 21
    iput v0, p0, Lcom/esotericsoftware/kryo/util/DefaultClassResolver;->memoizedClassId:I

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    iput-object v0, p0, Lcom/esotericsoftware/kryo/util/DefaultClassResolver;->memoizedClass:Ljava/lang/Class;

    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/Registration;->getType()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {v0}, Lcom/esotericsoftware/kryo/util/Util;->getWrapperClass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/Registration;->getType()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    if-eq v0, v1, :cond_0

    .line 39
    .line 40
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/DefaultClassResolver;->classToRegistration:Lcom/esotericsoftware/kryo/util/IdentityMap;

    .line 41
    .line 42
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/util/ObjectMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    :cond_0
    return-object p1
.end method

.method public writeClass(Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Registration;
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-nez p2, :cond_2

    .line 3
    .line 4
    sget-boolean p2, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    sget-boolean p2, Lcom/esotericsoftware/minlog/Log;->DEBUG:Z

    .line 10
    .line 11
    if-eqz p2, :cond_1

    .line 12
    .line 13
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/DefaultClassResolver;->kryo:Lcom/esotericsoftware/kryo/Kryo;

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/Kryo;->getDepth()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-ne p0, v0, :cond_1

    .line 20
    .line 21
    :cond_0
    const-string p0, "Write"

    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/io/Output;->position()I

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    invoke-static {p0, v1, p2}, Lcom/esotericsoftware/kryo/util/Util;->log(Ljava/lang/String;Ljava/lang/Object;I)V

    .line 28
    .line 29
    .line 30
    :cond_1
    const/4 p0, 0x0

    .line 31
    invoke-virtual {p1, p0}, Lcom/esotericsoftware/kryo/io/Output;->writeByte(B)V

    .line 32
    .line 33
    .line 34
    return-object v1

    .line 35
    :cond_2
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/DefaultClassResolver;->kryo:Lcom/esotericsoftware/kryo/Kryo;

    .line 36
    .line 37
    invoke-virtual {v1, p2}, Lcom/esotericsoftware/kryo/Kryo;->getRegistration(Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Registration;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v1}, Lcom/esotericsoftware/kryo/Registration;->getId()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    const/4 v3, -0x1

    .line 46
    if-ne v2, v3, :cond_3

    .line 47
    .line 48
    invoke-virtual {p0, p1, p2, v1}, Lcom/esotericsoftware/kryo/util/DefaultClassResolver;->writeName(Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Class;Lcom/esotericsoftware/kryo/Registration;)V

    .line 49
    .line 50
    .line 51
    return-object v1

    .line 52
    :cond_3
    sget-boolean p0, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 53
    .line 54
    if-eqz p0, :cond_4

    .line 55
    .line 56
    new-instance p0, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    const-string v2, "Write class "

    .line 59
    .line 60
    invoke-direct {p0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1}, Lcom/esotericsoftware/kryo/Registration;->getId()I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v2, ": "

    .line 71
    .line 72
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-static {p2}, Lcom/esotericsoftware/kryo/util/Util;->className(Ljava/lang/Class;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/io/Output;->position()I

    .line 83
    .line 84
    .line 85
    move-result p2

    .line 86
    invoke-static {p2}, Lcom/esotericsoftware/kryo/util/Util;->pos(I)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    const-string p2, "kryo"

    .line 98
    .line 99
    invoke-static {p2, p0}, Lcom/esotericsoftware/minlog/Log;->trace(Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    :cond_4
    invoke-virtual {v1}, Lcom/esotericsoftware/kryo/Registration;->getId()I

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    add-int/lit8 p0, p0, 0x2

    .line 107
    .line 108
    invoke-virtual {p1, p0, v0}, Lcom/esotericsoftware/kryo/io/Output;->writeVarInt(IZ)I

    .line 109
    .line 110
    .line 111
    return-object v1
.end method

.method public writeName(Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Class;Lcom/esotericsoftware/kryo/Registration;)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p1, v0}, Lcom/esotericsoftware/kryo/io/Output;->writeByte(I)V

    .line 3
    .line 4
    .line 5
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/DefaultClassResolver;->classToNameId:Lcom/esotericsoftware/kryo/util/IdentityObjectIntMap;

    .line 6
    .line 7
    const-string v2, "kryo"

    .line 8
    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    const/4 v3, -0x1

    .line 12
    invoke-virtual {v1, p2, v3}, Lcom/esotericsoftware/kryo/util/IdentityObjectIntMap;->get(Ljava/lang/Object;I)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eq v1, v3, :cond_1

    .line 17
    .line 18
    sget-boolean p0, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 19
    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    const-string p0, "Write class name reference "

    .line 23
    .line 24
    const-string p3, ": "

    .line 25
    .line 26
    invoke-static {v1, p0, p3}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲苏世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-static {p2}, Lcom/esotericsoftware/kryo/util/Util;->className(Ljava/lang/Class;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/io/Output;->position()I

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    invoke-static {p2}, Lcom/esotericsoftware/kryo/util/Util;->pos(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-static {v2, p0}, Lcom/esotericsoftware/minlog/Log;->trace(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    :cond_0
    invoke-virtual {p1, v1, v0}, Lcom/esotericsoftware/kryo/io/Output;->writeVarInt(IZ)I

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_1
    sget-boolean v1, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 60
    .line 61
    if-eqz v1, :cond_2

    .line 62
    .line 63
    new-instance v1, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    const-string v3, "Write class name: "

    .line 66
    .line 67
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-static {p2}, Lcom/esotericsoftware/kryo/util/Util;->className(Ljava/lang/Class;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/io/Output;->position()I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    invoke-static {v3}, Lcom/esotericsoftware/kryo/util/Util;->pos(I)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-static {v2, v1}, Lcom/esotericsoftware/minlog/Log;->trace(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    :cond_2
    iget v1, p0, Lcom/esotericsoftware/kryo/util/DefaultClassResolver;->nextNameId:I

    .line 96
    .line 97
    add-int/lit8 v2, v1, 0x1

    .line 98
    .line 99
    iput v2, p0, Lcom/esotericsoftware/kryo/util/DefaultClassResolver;->nextNameId:I

    .line 100
    .line 101
    iget-object v2, p0, Lcom/esotericsoftware/kryo/util/DefaultClassResolver;->classToNameId:Lcom/esotericsoftware/kryo/util/IdentityObjectIntMap;

    .line 102
    .line 103
    if-nez v2, :cond_3

    .line 104
    .line 105
    new-instance v2, Lcom/esotericsoftware/kryo/util/IdentityObjectIntMap;

    .line 106
    .line 107
    invoke-direct {v2}, Lcom/esotericsoftware/kryo/util/IdentityObjectIntMap;-><init>()V

    .line 108
    .line 109
    .line 110
    iput-object v2, p0, Lcom/esotericsoftware/kryo/util/DefaultClassResolver;->classToNameId:Lcom/esotericsoftware/kryo/util/IdentityObjectIntMap;

    .line 111
    .line 112
    :cond_3
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/DefaultClassResolver;->classToNameId:Lcom/esotericsoftware/kryo/util/IdentityObjectIntMap;

    .line 113
    .line 114
    invoke-virtual {p0, p2, v1}, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->put(Ljava/lang/Object;I)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1, v1, v0}, Lcom/esotericsoftware/kryo/io/Output;->writeVarInt(IZ)I

    .line 118
    .line 119
    .line 120
    invoke-virtual {p3}, Lcom/esotericsoftware/kryo/Registration;->isTypeNameAscii()Z

    .line 121
    .line 122
    .line 123
    move-result p0

    .line 124
    if-eqz p0, :cond_4

    .line 125
    .line 126
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    invoke-virtual {p1, p0}, Lcom/esotericsoftware/kryo/io/Output;->writeAscii(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :cond_4
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    invoke-virtual {p1, p0}, Lcom/esotericsoftware/kryo/io/Output;->writeString(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    return-void
.end method
