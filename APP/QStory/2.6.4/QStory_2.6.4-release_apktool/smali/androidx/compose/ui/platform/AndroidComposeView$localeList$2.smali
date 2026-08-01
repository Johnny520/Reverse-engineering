.class final Landroidx/compose/ui/platform/AndroidComposeView$localeList$2;
.super Lkotlin/jvm/internal/Lambda;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u5170\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u4e16\u54f2\u5170\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2;",
        "invoke",
        "()L\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u4e16\u54f2\u5170\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2;",
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
.field final synthetic this$0:Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView$localeList$2;->this$0:Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    .line 83
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView$localeList$2;->invoke()L飘花落叶言子苏世哲兰楪/飘花落叶言子楪世苏兰哲;

    move-result-object p0

    return-object p0
.end method

.method public final invoke()L飘花落叶言子苏世哲兰楪/飘花落叶言子楪世苏兰哲;
    .locals 5

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView$localeList$2;->this$0:Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;->getConfiguration()Landroid/content/res/Configuration;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Landroid/content/res/Configuration;->getLocales()Landroid/os/LocaleList;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    new-instance v0, Landroidx/core/os/飘花落叶言子楪苏哲世兰;

    .line 12
    .line 13
    new-instance v1, Landroidx/core/os/飘花落叶言子楪苏哲兰世;

    .line 14
    .line 15
    invoke-direct {v1, p0}, Landroidx/core/os/飘花落叶言子楪苏哲兰世;-><init>(Landroid/os/LocaleList;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1}, Landroidx/core/os/飘花落叶言子楪苏哲世兰;-><init>(Landroidx/core/os/飘花落叶言子楪苏哲兰世;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/os/LocaleList;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-eqz p0, :cond_0

    .line 26
    .line 27
    invoke-static {}, Landroid/os/LocaleList;->getDefault()Landroid/os/LocaleList;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    new-instance v0, Landroidx/core/os/飘花落叶言子楪苏哲世兰;

    .line 32
    .line 33
    new-instance v1, Landroidx/core/os/飘花落叶言子楪苏哲兰世;

    .line 34
    .line 35
    invoke-direct {v1, p0}, Landroidx/core/os/飘花落叶言子楪苏哲兰世;-><init>(Landroid/os/LocaleList;)V

    .line 36
    .line 37
    .line 38
    invoke-direct {v0, v1}, Landroidx/core/os/飘花落叶言子楪苏哲世兰;-><init>(Landroidx/core/os/飘花落叶言子楪苏哲兰世;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    iget-object p0, v0, Landroidx/core/os/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:Landroidx/core/os/飘花落叶言子楪苏哲兰世;

    .line 42
    .line 43
    iget-object v0, p0, Landroidx/core/os/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Landroid/os/LocaleList;

    .line 44
    .line 45
    invoke-virtual {v0}, Landroid/os/LocaleList;->size()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    new-instance v1, Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 52
    .line 53
    .line 54
    const/4 v2, 0x0

    .line 55
    :goto_0
    if-ge v2, v0, :cond_1

    .line 56
    .line 57
    new-instance v3, L飘花落叶言子苏世哲兰楪/飘花落叶言子楪世苏哲兰;

    .line 58
    .line 59
    iget-object v4, p0, Landroidx/core/os/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Landroid/os/LocaleList;

    .line 60
    .line 61
    invoke-virtual {v4, v2}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    invoke-direct {v3, v4}, L飘花落叶言子苏世哲兰楪/飘花落叶言子楪世苏哲兰;-><init>(Ljava/util/Locale;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    add-int/lit8 v2, v2, 0x1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_1
    new-instance p0, L飘花落叶言子苏世哲兰楪/飘花落叶言子楪世苏兰哲;

    .line 78
    .line 79
    invoke-direct {p0, v1}, L飘花落叶言子苏世哲兰楪/飘花落叶言子楪世苏兰哲;-><init>(Ljava/util/List;)V

    .line 80
    .line 81
    .line 82
    return-object p0
.end method
