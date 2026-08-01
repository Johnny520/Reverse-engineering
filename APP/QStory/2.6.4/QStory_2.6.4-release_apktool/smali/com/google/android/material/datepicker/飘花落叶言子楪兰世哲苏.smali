.class public final synthetic Lcom/google/android/material/datepicker/飘花落叶言子楪兰世哲苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Lcom/google/android/material/datepicker/飘花落叶言子楪兰苏哲世;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/material/datepicker/飘花落叶言子楪兰苏哲世;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/google/android/material/datepicker/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Lcom/google/android/material/datepicker/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲兰世苏:Lcom/google/android/material/datepicker/飘花落叶言子楪兰苏哲世;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/google/android/material/datepicker/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, Lcom/google/android/material/datepicker/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲兰世苏:Lcom/google/android/material/datepicker/飘花落叶言子楪兰苏哲世;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lcom/google/android/material/datepicker/飘花落叶言子楪兰苏哲世;->飘花落叶言子兰世楪苏哲:Landroid/widget/Button;

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/google/android/material/datepicker/飘花落叶言子楪兰苏哲世;->飘花落叶言子世苏哲兰楪()Lcom/google/android/material/datepicker/DateSelector;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Lcom/google/android/material/datepicker/DateSelector;->飘花落叶言子世楪兰哲苏()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lcom/google/android/material/datepicker/飘花落叶言子楪兰苏哲世;->飘花落叶言子兰楪哲世苏:Lcom/google/android/material/internal/CheckableImageButton;

    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/google/android/material/internal/CheckableImageButton;->toggle()V

    .line 25
    .line 26
    .line 27
    iget p1, p0, Lcom/google/android/material/datepicker/飘花落叶言子楪兰苏哲世;->飘花落叶言子哲苏兰世楪:I

    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    if-ne p1, v0, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move v1, v0

    .line 34
    :goto_0
    iput v1, p0, Lcom/google/android/material/datepicker/飘花落叶言子楪兰苏哲世;->飘花落叶言子哲苏兰世楪:I

    .line 35
    .line 36
    iget-object p1, p0, Lcom/google/android/material/datepicker/飘花落叶言子楪兰苏哲世;->飘花落叶言子兰楪哲世苏:Lcom/google/android/material/internal/CheckableImageButton;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Lcom/google/android/material/datepicker/飘花落叶言子楪兰苏哲世;->飘花落叶言子世哲楪兰苏(Lcom/google/android/material/internal/CheckableImageButton;)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Lcom/google/android/material/datepicker/飘花落叶言子楪兰苏哲世;->飘花落叶言子兰楪哲世苏:Lcom/google/android/material/internal/CheckableImageButton;

    .line 42
    .line 43
    invoke-virtual {p0, p1}, Lcom/google/android/material/datepicker/飘花落叶言子楪兰苏哲世;->飘花落叶言子世哲苏楪兰(Lcom/google/android/material/internal/CheckableImageButton;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/google/android/material/datepicker/飘花落叶言子楪兰苏哲世;->飘花落叶言子世哲楪苏兰()V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :pswitch_0
    iget-object v0, p0, Lcom/google/android/material/datepicker/飘花落叶言子楪兰苏哲世;->飘花落叶言子哲楪兰苏世:Ljava/util/LinkedHashSet;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_1

    .line 61
    .line 62
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    check-cast v2, Landroid/view/View$OnClickListener;

    .line 67
    .line 68
    invoke-interface {v2, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_1
    invoke-virtual {p0, v1, v1}, Landroidx/fragment/app/飘花落叶言子楪哲苏世兰;->飘花落叶言子世苏楪兰哲(ZZ)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :pswitch_1
    iget-object p1, p0, Lcom/google/android/material/datepicker/飘花落叶言子楪兰苏哲世;->飘花落叶言子哲楪兰世苏:Ljava/util/LinkedHashSet;

    .line 77
    .line 78
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-nez v0, :cond_2

    .line 87
    .line 88
    invoke-virtual {p0, v1, v1}, Landroidx/fragment/app/飘花落叶言子楪哲苏世兰;->飘花落叶言子世苏楪兰哲(ZZ)V

    .line 89
    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    if-eqz p1, :cond_3

    .line 97
    .line 98
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰()V

    .line 99
    .line 100
    .line 101
    :goto_2
    return-void

    .line 102
    :cond_3
    invoke-virtual {p0}, Lcom/google/android/material/datepicker/飘花落叶言子楪兰苏哲世;->飘花落叶言子世苏哲兰楪()Lcom/google/android/material/datepicker/DateSelector;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    const/4 p0, 0x0

    .line 110
    throw p0

    .line 111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
