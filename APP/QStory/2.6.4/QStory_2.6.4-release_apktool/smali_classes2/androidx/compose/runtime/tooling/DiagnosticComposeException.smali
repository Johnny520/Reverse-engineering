.class public final Landroidx/compose/runtime/tooling/DiagnosticComposeException;
.super Ljava/lang/RuntimeException;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006JB\u0010\r\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u000c\"\u0004\u0008\u0000\u0010\u0007\"\u0006\u0008\u0001\u0010\u0008\u0018\u0001*\u0008\u0012\u0004\u0012\u00028\u00000\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\nH\u0082\u0008\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0012R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "Landroidx/compose/runtime/tooling/DiagnosticComposeException;",
        "Ljava/lang/RuntimeException;",
        "Lkotlin/RuntimeException;",
        "Landroidx/compose/runtime/tooling/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;",
        "trace",
        "<init>",
        "(Landroidx/compose/runtime/tooling/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;)V",
        "T",
        "R",
        "",
        "Lkotlin/Function1;",
        "map",
        "",
        "mapToArray",
        "(Ljava/util/List;L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u5170\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;)[Ljava/lang/Object;",
        "",
        "fillInStackTrace",
        "()Ljava/lang/Throwable;",
        "Landroidx/compose/runtime/tooling/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;",
        "",
        "getMessage",
        "()Ljava/lang/String;",
        "message",
        "runtime"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final trace:Landroidx/compose/runtime/tooling/飘花落叶言子楪世苏哲兰;


# direct methods
.method public constructor <init>(Landroidx/compose/runtime/tooling/飘花落叶言子楪世苏哲兰;)V
    .locals 12

    .line 1
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/runtime/tooling/DiagnosticComposeException;->trace:Landroidx/compose/runtime/tooling/飘花落叶言子楪世苏哲兰;

    .line 5
    .line 6
    iget-boolean v0, p1, Landroidx/compose/runtime/tooling/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Z

    .line 7
    .line 8
    if-nez v0, :cond_8

    .line 9
    .line 10
    const/16 v0, 0x9

    .line 11
    .line 12
    new-array v1, v0, [I

    .line 13
    .line 14
    fill-array-data v1, :array_0

    .line 15
    .line 16
    .line 17
    iget-object p1, p1, Landroidx/compose/runtime/tooling/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 18
    .line 19
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    new-instance v3, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    const/4 v4, 0x0

    .line 29
    move v5, v4

    .line 30
    :goto_0
    const/4 v6, 0x1

    .line 31
    if-ge v5, v2, :cond_6

    .line 32
    .line 33
    add-int/lit8 v7, v5, 0x1

    .line 34
    .line 35
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v8

    .line 39
    check-cast v8, Landroidx/compose/runtime/tooling/飘花落叶言子楪世哲苏兰;

    .line 40
    .line 41
    iget v9, v8, Landroidx/compose/runtime/tooling/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 42
    .line 43
    move v10, v4

    .line 44
    :goto_1
    if-ge v10, v0, :cond_1

    .line 45
    .line 46
    aget v11, v1, v10

    .line 47
    .line 48
    if-ne v9, v11, :cond_0

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_0
    add-int/lit8 v10, v10, 0x1

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    const/4 v10, -0x1

    .line 55
    :goto_2
    if-ltz v10, :cond_2

    .line 56
    .line 57
    goto :goto_3

    .line 58
    :cond_2
    iget v9, v8, Landroidx/compose/runtime/tooling/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 59
    .line 60
    const/16 v10, 0x64

    .line 61
    .line 62
    if-ne v9, v10, :cond_5

    .line 63
    .line 64
    add-int/lit8 v5, v5, 0x2

    .line 65
    .line 66
    if-ge v5, v2, :cond_3

    .line 67
    .line 68
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    check-cast v5, Landroidx/compose/runtime/tooling/飘花落叶言子楪世哲苏兰;

    .line 73
    .line 74
    iget v5, v5, Landroidx/compose/runtime/tooling/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 75
    .line 76
    const/16 v8, 0x3e8

    .line 77
    .line 78
    if-ne v5, v8, :cond_3

    .line 79
    .line 80
    goto :goto_4

    .line 81
    :cond_3
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    if-eqz v5, :cond_4

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_4
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    sub-int/2addr v5, v6

    .line 93
    invoke-interface {v3, v5}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_5
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    :goto_3
    move v5, v7

    .line 101
    goto :goto_0

    .line 102
    :cond_6
    :goto_4
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    new-array v0, p1, [Ljava/lang/StackTraceElement;

    .line 107
    .line 108
    :goto_5
    if-ge v4, p1, :cond_7

    .line 109
    .line 110
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    check-cast v1, Landroidx/compose/runtime/tooling/飘花落叶言子楪世哲苏兰;

    .line 115
    .line 116
    new-instance v2, Ljava/lang/StackTraceElement;

    .line 117
    .line 118
    new-instance v5, Ljava/lang/StringBuilder;

    .line 119
    .line 120
    const-string v7, "m$"

    .line 121
    .line 122
    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    iget v1, v1, Landroidx/compose/runtime/tooling/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 126
    .line 127
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    const-string v5, "SourceFile"

    .line 135
    .line 136
    const-string v7, "$$compose"

    .line 137
    .line 138
    invoke-direct {v2, v7, v1, v5, v6}, Ljava/lang/StackTraceElement;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 139
    .line 140
    .line 141
    aput-object v2, v0, v4

    .line 142
    .line 143
    add-int/lit8 v4, v4, 0x1

    .line 144
    .line 145
    goto :goto_5

    .line 146
    :cond_7
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->setStackTrace([Ljava/lang/StackTraceElement;)V

    .line 147
    .line 148
    .line 149
    :cond_8
    return-void

    .line 150
    nop

    .line 151
    :array_0
    .array-data 4
        0xc9
        0xca
        0xcc
        0xce
        0xcf
        0x7d
        -0x7f
        0x78cc281
        0xc8
    .end array-data
.end method

.method private final mapToArray(Ljava/util/List;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)[Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "+TT;>;",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u5170\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;",
            ")[TR;"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰()V

    .line 5
    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    throw p0
.end method


# virtual methods
.method public fillInStackTrace()Ljava/lang/Throwable;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/StackTraceElement;

    .line 3
    .line 4
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->setStackTrace([Ljava/lang/StackTraceElement;)V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/tooling/DiagnosticComposeException;->trace:Landroidx/compose/runtime/tooling/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    iget-boolean v0, v0, Landroidx/compose/runtime/tooling/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Z

    .line 4
    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v1, "Composition stack when thrown:\n"

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Landroidx/compose/runtime/tooling/DiagnosticComposeException;->trace:Landroidx/compose/runtime/tooling/飘花落叶言子楪世苏哲兰;

    .line 15
    .line 16
    invoke-static {}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏兰世哲()Lkotlin/collections/builders/ListBuilder;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iget-object p0, p0, Landroidx/compose/runtime/tooling/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    new-instance v2, Lkotlin/collections/飘花落叶言子世楪哲兰苏;

    .line 26
    .line 27
    invoke-direct {v2, p0}, Lkotlin/collections/飘花落叶言子世楪哲兰苏;-><init>(Ljava/util/List;)V

    .line 28
    .line 29
    .line 30
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    const/4 v3, 0x0

    .line 35
    move v4, v3

    .line 36
    :goto_0
    if-ge v4, p0, :cond_0

    .line 37
    .line 38
    invoke-virtual {v2, v4}, Lkotlin/collections/飘花落叶言子世楪哲兰苏;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    check-cast v5, Landroidx/compose/runtime/tooling/飘花落叶言子楪世哲苏兰;

    .line 43
    .line 44
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    add-int/lit8 v4, v4, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    invoke-virtual {v1}, Lkotlin/collections/builders/ListBuilder;->build()Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    new-instance v1, Lkotlin/collections/飘花落叶言子世楪哲兰苏;

    .line 58
    .line 59
    invoke-direct {v1, p0}, Lkotlin/collections/飘花落叶言子世楪哲兰苏;-><init>(Ljava/util/List;)V

    .line 60
    .line 61
    .line 62
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    :goto_1
    if-ge v3, p0, :cond_1

    .line 67
    .line 68
    invoke-virtual {v1, v3}, Lkotlin/collections/飘花落叶言子世楪哲兰苏;->get(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    check-cast v2, Ljava/lang/String;

    .line 73
    .line 74
    const-string v4, "\tat "

    .line 75
    .line 76
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const/16 v2, 0xa

    .line 83
    .line 84
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    add-int/lit8 v3, v3, 0x1

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    return-object p0

    .line 95
    :cond_2
    const-string p0, "Composition stack when thrown:"

    .line 96
    .line 97
    return-object p0
.end method
