.class final Landroidx/compose/ui/node/AlignmentLines$recalculate$1;
.super Lkotlin/jvm/internal/Lambda;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Landroidx/compose/ui/node/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2;",
        "childOwner",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "invoke",
        "(Landroidx/compose/ui/node/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/compose/ui/node/飘花落叶言子楪世苏哲兰;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/node/飘花落叶言子楪世苏哲兰;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/node/AlignmentLines$recalculate$1;->this$0:Landroidx/compose/ui/node/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 143
    check-cast p1, Landroidx/compose/ui/node/飘花落叶言子楪世苏兰哲;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/node/AlignmentLines$recalculate$1;->invoke(Landroidx/compose/ui/node/飘花落叶言子楪世苏兰哲;)V

    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    return-object p0
.end method

.method public final invoke(Landroidx/compose/ui/node/飘花落叶言子楪世苏兰哲;)V
    .locals 5

    .line 1
    invoke-interface {p1}, Landroidx/compose/ui/node/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲世苏兰()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const v1, 0x7fffffff

    .line 6
    .line 7
    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    goto/16 :goto_3

    .line 11
    .line 12
    :cond_0
    invoke-interface {p1}, Landroidx/compose/ui/node/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰()Landroidx/compose/ui/node/飘花落叶言子楪世苏哲兰;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-boolean v0, v0, Landroidx/compose/ui/node/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Z

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-interface {p1}, Landroidx/compose/ui/node/飘花落叶言子楪世苏兰哲;->飘花落叶言子世苏兰楪哲()V

    .line 21
    .line 22
    .line 23
    :cond_1
    invoke-interface {p1}, Landroidx/compose/ui/node/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰()Landroidx/compose/ui/node/飘花落叶言子楪世苏哲兰;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget-object v0, v0, Landroidx/compose/ui/node/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰:Ljava/util/HashMap;

    .line 28
    .line 29
    iget-object v1, p0, Landroidx/compose/ui/node/AlignmentLines$recalculate$1;->this$0:Landroidx/compose/ui/node/飘花落叶言子楪世苏哲兰;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_2

    .line 44
    .line 45
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    check-cast v2, Ljava/util/Map$Entry;

    .line 50
    .line 51
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    check-cast v3, Landroidx/compose/ui/layout/飘花落叶言子楪世苏哲兰;

    .line 56
    .line 57
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    check-cast v2, Ljava/lang/Number;

    .line 62
    .line 63
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    invoke-interface {p1}, Landroidx/compose/ui/node/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲()Landroidx/compose/ui/node/飘花落叶言子楪兰世哲苏;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    invoke-static {v1, v3, v2, v4}, Landroidx/compose/ui/node/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/node/飘花落叶言子楪世苏哲兰;Landroidx/compose/ui/layout/飘花落叶言子楪世苏哲兰;ILandroidx/compose/ui/node/飘花落叶言子苏世楪哲兰;)V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_2
    invoke-interface {p1}, Landroidx/compose/ui/node/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲()Landroidx/compose/ui/node/飘花落叶言子楪兰世哲苏;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    iget-object p1, p1, Landroidx/compose/ui/node/飘花落叶言子苏世楪哲兰;->飘花落叶言子世苏哲兰楪:Landroidx/compose/ui/node/飘花落叶言子苏世楪哲兰;

    .line 80
    .line 81
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    :goto_1
    iget-object v0, p0, Landroidx/compose/ui/node/AlignmentLines$recalculate$1;->this$0:Landroidx/compose/ui/node/飘花落叶言子楪世苏哲兰;

    .line 85
    .line 86
    iget-object v0, v0, Landroidx/compose/ui/node/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/node/飘花落叶言子楪世苏兰哲;

    .line 87
    .line 88
    invoke-interface {v0}, Landroidx/compose/ui/node/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲()Landroidx/compose/ui/node/飘花落叶言子楪兰世哲苏;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-nez v0, :cond_4

    .line 97
    .line 98
    iget-object v0, p0, Landroidx/compose/ui/node/AlignmentLines$recalculate$1;->this$0:Landroidx/compose/ui/node/飘花落叶言子楪世苏哲兰;

    .line 99
    .line 100
    invoke-virtual {v0, p1}, Landroidx/compose/ui/node/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Landroidx/compose/ui/node/飘花落叶言子苏世楪哲兰;)Ljava/util/Map;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    check-cast v0, Ljava/lang/Iterable;

    .line 109
    .line 110
    iget-object v1, p0, Landroidx/compose/ui/node/AlignmentLines$recalculate$1;->this$0:Landroidx/compose/ui/node/飘花落叶言子楪世苏哲兰;

    .line 111
    .line 112
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    if-eqz v2, :cond_3

    .line 121
    .line 122
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    check-cast v2, Landroidx/compose/ui/layout/飘花落叶言子楪世苏哲兰;

    .line 127
    .line 128
    invoke-virtual {v1, p1, v2}, Landroidx/compose/ui/node/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(Landroidx/compose/ui/node/飘花落叶言子苏世楪哲兰;Landroidx/compose/ui/layout/飘花落叶言子楪世苏哲兰;)I

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    invoke-static {v1, v2, v3, p1}, Landroidx/compose/ui/node/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/node/飘花落叶言子楪世苏哲兰;Landroidx/compose/ui/layout/飘花落叶言子楪世苏哲兰;ILandroidx/compose/ui/node/飘花落叶言子苏世楪哲兰;)V

    .line 133
    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_3
    iget-object p1, p1, Landroidx/compose/ui/node/飘花落叶言子苏世楪哲兰;->飘花落叶言子世苏哲兰楪:Landroidx/compose/ui/node/飘花落叶言子苏世楪哲兰;

    .line 137
    .line 138
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_4
    :goto_3
    return-void
.end method
