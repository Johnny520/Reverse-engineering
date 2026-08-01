.class public final synthetic Lry0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ldz0;

.field public final synthetic η:Landroid/widget/TextView;

.field public final synthetic θ:Landroid/widget/Button;

.field public final synthetic ι:Landroid/widget/Button;

.field public final synthetic κ:Landroid/widget/TextView;


# direct methods
.method public synthetic constructor <init>(ILdz0;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 0

    .line 1
    iput p1, p0, Lry0;->ε:I

    .line 2
    .line 3
    iput-object p2, p0, Lry0;->ζ:Ldz0;

    .line 4
    .line 5
    iput-object p5, p0, Lry0;->η:Landroid/widget/TextView;

    .line 6
    .line 7
    iput-object p3, p0, Lry0;->θ:Landroid/widget/Button;

    .line 8
    .line 9
    iput-object p4, p0, Lry0;->ι:Landroid/widget/Button;

    .line 10
    .line 11
    iput-object p6, p0, Lry0;->κ:Landroid/widget/TextView;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 9

    .line 1
    iget p1, p0, Lry0;->ε:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lry0;->ζ:Ldz0;

    .line 7
    .line 8
    iget-object v0, p1, Ldz0;->η:Ljava/util/LinkedHashSet;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    iget-object v2, p1, Ldz0;->β:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-ne v1, v3, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->clear()V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->clear()V

    .line 27
    .line 28
    .line 29
    invoke-static {v2}, Lyh;->Κ(Ljava/util/Collection;)Lxm0;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-static {v0, v1}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    iget-object v0, p0, Lry0;->η:Landroid/widget/TextView;

    .line 37
    .line 38
    iget-object v1, p0, Lry0;->θ:Landroid/widget/Button;

    .line 39
    .line 40
    iget-object v2, p0, Lry0;->ι:Landroid/widget/Button;

    .line 41
    .line 42
    iget-object p0, p0, Lry0;->κ:Landroid/widget/TextView;

    .line 43
    .line 44
    invoke-static {p1, v0, v1, v2, p0}, Ldz0;->μ(Ldz0;Landroid/widget/TextView;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/TextView;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :pswitch_0
    iget-object v8, p0, Lry0;->κ:Landroid/widget/TextView;

    .line 49
    .line 50
    iget-object v4, p0, Lry0;->ζ:Ldz0;

    .line 51
    .line 52
    iget v3, v4, Ldz0;->λ:I

    .line 53
    .line 54
    iget-object v5, p0, Lry0;->θ:Landroid/widget/Button;

    .line 55
    .line 56
    iget-object v6, p0, Lry0;->ι:Landroid/widget/Button;

    .line 57
    .line 58
    iget-object v7, p0, Lry0;->η:Landroid/widget/TextView;

    .line 59
    .line 60
    invoke-static/range {v3 .. v8}, Ldz0;->λ(ILdz0;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :pswitch_1
    new-instance p1, Ljava/util/LinkedHashSet;

    .line 65
    .line 66
    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 67
    .line 68
    .line 69
    iget-object v0, p0, Lry0;->ζ:Ldz0;

    .line 70
    .line 71
    iget-object v1, v0, Ldz0;->β:Ljava/util/ArrayList;

    .line 72
    .line 73
    iget-object v2, v0, Ldz0;->η:Ljava/util/LinkedHashSet;

    .line 74
    .line 75
    invoke-static {v1}, Lyh;->Κ(Ljava/util/Collection;)Lxm0;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-virtual {v1}, Lvm0;->iterator()Ljava/util/Iterator;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    :cond_1
    :goto_1
    move-object v3, v1

    .line 84
    check-cast v3, Lwm0;

    .line 85
    .line 86
    iget-boolean v4, v3, Lwm0;->η:Z

    .line 87
    .line 88
    if-eqz v4, :cond_2

    .line 89
    .line 90
    invoke-virtual {v3}, Lwm0;->nextInt()I

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    invoke-virtual {v2, v4}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    if-nez v4, :cond_1

    .line 103
    .line 104
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    invoke-virtual {p1, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_2
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->clear()V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v2, p1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 116
    .line 117
    .line 118
    iget-object p1, p0, Lry0;->η:Landroid/widget/TextView;

    .line 119
    .line 120
    iget-object v1, p0, Lry0;->θ:Landroid/widget/Button;

    .line 121
    .line 122
    iget-object v2, p0, Lry0;->ι:Landroid/widget/Button;

    .line 123
    .line 124
    iget-object p0, p0, Lry0;->κ:Landroid/widget/TextView;

    .line 125
    .line 126
    invoke-static {v0, p1, v1, v2, p0}, Ldz0;->μ(Ldz0;Landroid/widget/TextView;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/TextView;)V

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    nop

    .line 131
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
