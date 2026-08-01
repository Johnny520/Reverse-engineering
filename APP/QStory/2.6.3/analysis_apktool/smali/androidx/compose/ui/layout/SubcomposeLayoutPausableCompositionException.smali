.class final Landroidx/compose/ui/layout/SubcomposeLayoutPausableCompositionException;
.super Ljava/lang/IllegalStateException;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0008\n\u0008\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u000fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0010R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u000c8VX\u0096\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0016"
    }
    d2 = {
        "Landroidx/compose/ui/layout/SubcomposeLayoutPausableCompositionException;",
        "Ljava/lang/IllegalStateException;",
        "Lkotlin/IllegalStateException;",
        "Landroidx/collection/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;",
        "operations",
        "",
        "slotId",
        "",
        "cause",
        "<init>",
        "(Landroidx/collection/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;Ljava/lang/Object;Ljava/lang/Throwable;)V",
        "",
        "",
        "operationsList",
        "()Ljava/util/List;",
        "Landroidx/collection/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;",
        "Ljava/lang/Object;",
        "getMessage",
        "()Ljava/lang/String;",
        "getMessage$annotations",
        "()V",
        "message",
        "ui"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final operations:Landroidx/collection/飘花落叶言子楪苏兰哲世;

.field private final slotId:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroidx/collection/飘花落叶言子楪苏兰哲世;Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-direct {p0, p3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/layout/SubcomposeLayoutPausableCompositionException;->operations:Landroidx/collection/飘花落叶言子楪苏兰哲世;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/ui/layout/SubcomposeLayoutPausableCompositionException;->slotId:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public static synthetic getMessage$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method private final operationsList()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏世兰()Lkotlin/collections/builders/ListBuilder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Landroidx/compose/ui/layout/SubcomposeLayoutPausableCompositionException;->operations:Landroidx/collection/飘花落叶言子楪苏兰哲世;

    .line 6
    .line 7
    iget v1, v1, Landroidx/collection/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:I

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    sub-int/2addr v1, v2

    .line 11
    :goto_0
    if-ltz v1, :cond_12

    .line 12
    .line 13
    iget-object v3, p0, Landroidx/compose/ui/layout/SubcomposeLayoutPausableCompositionException;->operations:Landroidx/collection/飘花落叶言子楪苏兰哲世;

    .line 14
    .line 15
    invoke-virtual {v3, v1}, Landroidx/collection/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰(I)I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-nez v3, :cond_0

    .line 20
    .line 21
    const-string v3, "CancelPausedPrecomposition"

    .line 22
    .line 23
    goto/16 :goto_1

    .line 24
    .line 25
    :cond_0
    if-ne v3, v2, :cond_1

    .line 26
    .line 27
    const-string v3, "ReuseForceSyncDeactivation"

    .line 28
    .line 29
    goto/16 :goto_1

    .line 30
    .line 31
    :cond_1
    const/4 v4, 0x2

    .line 32
    if-ne v3, v4, :cond_2

    .line 33
    .line 34
    const-string v3, "ReuseScheduleOutOfFrameDeactivation"

    .line 35
    .line 36
    goto/16 :goto_1

    .line 37
    .line 38
    :cond_2
    const/4 v4, 0x3

    .line 39
    if-ne v3, v4, :cond_3

    .line 40
    .line 41
    const-string v3, "ReuseSyncDeactivation"

    .line 42
    .line 43
    goto/16 :goto_1

    .line 44
    .line 45
    :cond_3
    const/4 v4, 0x4

    .line 46
    if-ne v3, v4, :cond_4

    .line 47
    .line 48
    const-string v3, "ReuseDeactivationViaHost"

    .line 49
    .line 50
    goto/16 :goto_1

    .line 51
    .line 52
    :cond_4
    const/4 v4, 0x5

    .line 53
    if-ne v3, v4, :cond_5

    .line 54
    .line 55
    const-string v3, "TookFromPrecomposeMap"

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_5
    const/4 v4, 0x6

    .line 59
    if-ne v3, v4, :cond_6

    .line 60
    .line 61
    const-string v3, "Subcompose"

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_6
    const/4 v4, 0x7

    .line 65
    if-ne v3, v4, :cond_7

    .line 66
    .line 67
    const-string v3, "SubcomposeNew"

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_7
    const/16 v4, 0x8

    .line 71
    .line 72
    if-ne v3, v4, :cond_8

    .line 73
    .line 74
    const-string v3, "SubcomposePausable"

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_8
    const/16 v4, 0x9

    .line 78
    .line 79
    if-ne v3, v4, :cond_9

    .line 80
    .line 81
    const-string v3, "SubcomposeForceReuse"

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_9
    const/16 v4, 0xa

    .line 85
    .line 86
    if-ne v3, v4, :cond_a

    .line 87
    .line 88
    const-string v3, "DeactivateOutOfFrame"

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_a
    const/16 v4, 0xb

    .line 92
    .line 93
    if-ne v3, v4, :cond_b

    .line 94
    .line 95
    const-string v3, "DeactivateOutOfFrameCancelled"

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_b
    const/16 v4, 0xc

    .line 99
    .line 100
    if-ne v3, v4, :cond_c

    .line 101
    .line 102
    const-string v3, "SlotToReusedFromOnDeactivate"

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_c
    const/16 v4, 0xd

    .line 106
    .line 107
    if-ne v3, v4, :cond_d

    .line 108
    .line 109
    const-string v3, "SlotToReusedFromOnReuse"

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_d
    const/16 v4, 0xe

    .line 113
    .line 114
    if-ne v3, v4, :cond_e

    .line 115
    .line 116
    const-string v3, "Reused"

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_e
    const/16 v4, 0xf

    .line 120
    .line 121
    if-ne v3, v4, :cond_f

    .line 122
    .line 123
    const-string v3, "ResumePaused"

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_f
    const/16 v4, 0x10

    .line 127
    .line 128
    if-ne v3, v4, :cond_10

    .line 129
    .line 130
    const-string v3, "PausePaused"

    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_10
    const/16 v4, 0x11

    .line 134
    .line 135
    if-ne v3, v4, :cond_11

    .line 136
    .line 137
    const-string v3, "ApplyPaused"

    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_11
    const-string v4, "Unexpected "

    .line 141
    .line 142
    invoke-static {v3, v4}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    :goto_1
    new-instance v4, Ljava/lang/StringBuilder;

    .line 147
    .line 148
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    const-string v5, ": "

    .line 155
    .line 156
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    add-int/lit8 v1, v1, -0x1

    .line 170
    .line 171
    goto/16 :goto_0

    .line 172
    .line 173
    :cond_12
    invoke-virtual {v0}, Lkotlin/collections/builders/ListBuilder;->build()Ljava/util/List;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    return-object p0
.end method


# virtual methods
.method public getMessage()Ljava/lang/String;
    .locals 8

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "\n            |slotid="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Landroidx/compose/ui/layout/SubcomposeLayoutPausableCompositionException;->slotId:Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ". Last operations:\n            |"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-direct {p0}, Landroidx/compose/ui/layout/SubcomposeLayoutPausableCompositionException;->operationsList()Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    const/4 v6, 0x0

    .line 23
    const/16 v7, 0x3e

    .line 24
    .line 25
    const-string v3, "\n"

    .line 26
    .line 27
    const/4 v4, 0x0

    .line 28
    const/4 v5, 0x0

    .line 29
    invoke-static/range {v2 .. v7}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子哲兰楪苏世(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string p0, "\n            "

    .line 37
    .line 38
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-static {p0}, Lkotlin/text/飘花落叶言子楪哲苏兰世;->飘花落叶言子世哲楪兰苏(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0
.end method
