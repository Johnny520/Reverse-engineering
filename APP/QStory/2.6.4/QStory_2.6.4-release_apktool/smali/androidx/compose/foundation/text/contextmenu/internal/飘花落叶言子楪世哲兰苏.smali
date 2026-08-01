.class public final synthetic Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪世哲兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    sget-object v1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object p0, p0, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p0, Landroid/content/Context;

    .line 13
    .line 14
    check-cast v2, Landroid/view/textclassifier/TextClassification;

    .line 15
    .line 16
    invoke-virtual {v2}, Landroid/view/textclassifier/TextClassification;->getText()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v0, 0x0

    .line 28
    :goto_0
    invoke-virtual {v2}, Landroid/view/textclassifier/TextClassification;->getIntent()Landroid/content/Intent;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    const/high16 v3, 0xc000000

    .line 33
    .line 34
    invoke-static {p0, v0, v2, v3}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 39
    .line 40
    const/16 v2, 0x22

    .line 41
    .line 42
    if-lt v0, v2, :cond_1

    .line 43
    .line 44
    :try_start_0
    invoke-static {}, Landroid/app/ActivityOptions;->makeBasic()Landroid/app/ActivityOptions;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-static {v0}, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世兰苏哲(Landroid/app/ActivityOptions;)Landroid/app/ActivityOptions;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0}, Landroid/app/ActivityOptions;->toBundle()Landroid/os/Bundle;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-static {p0, v0}, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲苏世兰(Landroid/app/PendingIntent;Landroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/app/PendingIntent$CanceledException; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :catch_0
    move-exception v0

    .line 61
    new-instance v2, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    const-string v3, "error sending pendingIntent: "

    .line 64
    .line 65
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string p0, " error: "

    .line 72
    .line 73
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    const-string v0, "TextClassification"

    .line 84
    .line 85
    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_1
    invoke-virtual {p0}, Landroid/app/PendingIntent;->send()V

    .line 90
    .line 91
    .line 92
    :goto_1
    return-object v1

    .line 93
    :pswitch_0
    check-cast p0, L飘花落叶言子世楪苏哲兰/飘花落叶言子楪世哲兰苏;

    .line 94
    .line 95
    check-cast v2, L飘花落叶言子世楪苏哲兰/飘花落叶言子楪苏世哲兰;

    .line 96
    .line 97
    iget-object p0, p0, L飘花落叶言子世楪苏哲兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;

    .line 98
    .line 99
    invoke-interface {p0, v2}, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    return-object v1

    .line 103
    :pswitch_1
    check-cast p0, Landroidx/compose/foundation/text/contextmenu/provider/飘花落叶言子楪世兰哲苏;

    .line 104
    .line 105
    check-cast v2, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;

    .line 106
    .line 107
    invoke-interface {v2}, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;->invoke()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    check-cast v0, Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;

    .line 112
    .line 113
    invoke-interface {p0, v0}, Landroidx/compose/foundation/text/contextmenu/provider/飘花落叶言子楪世兰哲苏;->飘花落叶言子哲楪世兰苏(Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;)J

    .line 114
    .line 115
    .line 116
    move-result-wide v0

    .line 117
    invoke-static {v0, v1}, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪苏兰哲(J)J

    .line 118
    .line 119
    .line 120
    move-result-wide v0

    .line 121
    new-instance p0, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏哲兰世;

    .line 122
    .line 123
    invoke-direct {p0, v0, v1}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏哲兰世;-><init>(J)V

    .line 124
    .line 125
    .line 126
    return-object p0

    .line 127
    :pswitch_2
    check-cast p0, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 128
    .line 129
    check-cast v2, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;

    .line 130
    .line 131
    invoke-interface {v2}, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;->invoke()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    iput-object v0, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 136
    .line 137
    return-object v1

    .line 138
    nop

    .line 139
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
