.class public final synthetic Landroidx/activity/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/activity/c;->a:I

    iput-object p2, p0, Landroidx/activity/c;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Landroid/os/Bundle;
    .locals 5

    .line 1
    iget v0, p0, Landroidx/activity/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/activity/c;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroidx/lifecycle/F;

    .line 9
    .line 10
    invoke-static {v0}, Landroidx/lifecycle/F;->a(Landroidx/lifecycle/F;)Landroid/os/Bundle;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0

    .line 15
    :pswitch_0
    iget-object v0, p0, Landroidx/activity/c;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Le/i;

    .line 18
    .line 19
    new-instance v1, Landroid/os/Bundle;

    .line 20
    .line 21
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 22
    .line 23
    .line 24
    iget-object v0, v0, Landroidx/activity/g;->j:Landroidx/activity/e;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    new-instance v2, Ljava/util/ArrayList;

    .line 30
    .line 31
    iget-object v3, v0, Landroidx/activity/e;->c:Ljava/util/HashMap;

    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 38
    .line 39
    .line 40
    const-string v4, "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS"

    .line 41
    .line 42
    invoke-virtual {v1, v4, v2}, Landroid/os/Bundle;->putIntegerArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 43
    .line 44
    .line 45
    new-instance v2, Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-virtual {v3}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 52
    .line 53
    .line 54
    const-string v3, "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS"

    .line 55
    .line 56
    invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 57
    .line 58
    .line 59
    new-instance v2, Ljava/util/ArrayList;

    .line 60
    .line 61
    iget-object v3, v0, Landroidx/activity/e;->e:Ljava/util/ArrayList;

    .line 62
    .line 63
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 64
    .line 65
    .line 66
    const-string v3, "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS"

    .line 67
    .line 68
    invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 69
    .line 70
    .line 71
    iget-object v2, v0, Landroidx/activity/e;->h:Landroid/os/Bundle;

    .line 72
    .line 73
    invoke-virtual {v2}, Landroid/os/Bundle;->clone()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    check-cast v2, Landroid/os/Bundle;

    .line 78
    .line 79
    const-string v3, "KEY_COMPONENT_ACTIVITY_PENDING_RESULT"

    .line 80
    .line 81
    invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 82
    .line 83
    .line 84
    const-string v2, "KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT"

    .line 85
    .line 86
    iget-object v0, v0, Landroidx/activity/e;->a:Ljava/util/Random;

    .line 87
    .line 88
    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 89
    .line 90
    .line 91
    return-object v1

    .line 92
    nop

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
