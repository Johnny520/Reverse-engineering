.class public final synthetic Lrm;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Le51;


# instance fields
.field public final synthetic α:I

.field public final synthetic β:Landroidx/activity/ComponentActivity;


# direct methods
.method public synthetic constructor <init>(Landroidx/activity/ComponentActivity;I)V
    .locals 0

    .line 1
    iput p2, p0, Lrm;->α:I

    .line 2
    .line 3
    iput-object p1, p0, Lrm;->β:Landroidx/activity/ComponentActivity;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final α()V
    .locals 9

    .line 1
    iget v0, p0, Lrm;->α:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lrm;->β:Landroidx/activity/ComponentActivity;

    .line 7
    .line 8
    check-cast p0, Landroidx/fragment/app/FragmentActivity;

    .line 9
    .line 10
    iget-object p0, p0, Landroidx/fragment/app/FragmentActivity;->ψ:Ln;

    .line 11
    .line 12
    iget-object p0, p0, Ln;->ζ:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Lp60;

    .line 15
    .line 16
    iget-object v0, p0, Lp60;->ω:Lb70;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-virtual {v0, p0, p0, v1}, Lb70;->β(Lp60;Lxb;Ln60;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_0
    iget-object p0, p0, Lrm;->β:Landroidx/activity/ComponentActivity;

    .line 24
    .line 25
    iget-object v0, p0, Landroidx/activity/ComponentActivity;->ι:Ln5;

    .line 26
    .line 27
    iget-object v0, v0, Ln5;->η:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, Ln5;

    .line 30
    .line 31
    const-string v1, "android:support:activity-result"

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ln5;->ν(Ljava/lang/String;)Landroid/os/Bundle;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    iget-object p0, p0, Landroidx/activity/ComponentActivity;->ξ:Lsm;

    .line 40
    .line 41
    iget-object v1, p0, Lsm;->β:Ljava/util/HashMap;

    .line 42
    .line 43
    iget-object v2, p0, Lsm;->α:Ljava/util/HashMap;

    .line 44
    .line 45
    iget-object v3, p0, Lsm;->η:Landroid/os/Bundle;

    .line 46
    .line 47
    const-string v4, "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS"

    .line 48
    .line 49
    invoke-virtual {v0, v4}, Landroid/os/Bundle;->getIntegerArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    const-string v5, "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS"

    .line 54
    .line 55
    invoke-virtual {v0, v5}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    if-eqz v5, :cond_2

    .line 60
    .line 61
    if-nez v4, :cond_0

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_0
    const-string v6, "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS"

    .line 65
    .line 66
    invoke-virtual {v0, v6}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    iput-object v6, p0, Lsm;->δ:Ljava/util/ArrayList;

    .line 71
    .line 72
    const-string v6, "KEY_COMPONENT_ACTIVITY_PENDING_RESULT"

    .line 73
    .line 74
    invoke-virtual {v0, v6}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-virtual {v3, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 79
    .line 80
    .line 81
    const/4 v0, 0x0

    .line 82
    :goto_0
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 83
    .line 84
    .line 85
    move-result v6

    .line 86
    if-ge v0, v6, :cond_2

    .line 87
    .line 88
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    check-cast v6, Ljava/lang/String;

    .line 93
    .line 94
    invoke-virtual {v1, v6}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v7

    .line 98
    if-eqz v7, :cond_1

    .line 99
    .line 100
    invoke-virtual {v1, v6}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v7

    .line 104
    check-cast v7, Ljava/lang/Integer;

    .line 105
    .line 106
    invoke-virtual {v3, v6}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 107
    .line 108
    .line 109
    move-result v6

    .line 110
    if-nez v6, :cond_1

    .line 111
    .line 112
    invoke-virtual {v2, v7}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    :cond_1
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v6

    .line 119
    check-cast v6, Ljava/lang/Integer;

    .line 120
    .line 121
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 122
    .line 123
    .line 124
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v7

    .line 128
    check-cast v7, Ljava/lang/String;

    .line 129
    .line 130
    invoke-virtual {v2, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    iget-object v8, p0, Lsm;->β:Ljava/util/HashMap;

    .line 134
    .line 135
    invoke-virtual {v8, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    add-int/lit8 v0, v0, 0x1

    .line 139
    .line 140
    goto :goto_0

    .line 141
    :cond_2
    :goto_1
    return-void

    .line 142
    nop

    .line 143
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
