.class public Lxhss/ᛸᛴᛴᛶ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;
.implements Landroid/content/DialogInterface$OnDismissListener;
.implements Landroid/content/ComponentCallbacks;
.implements Landroid/view/View$OnCreateContextMenuListener;
.implements Lxhss/ᛴᛷᲀᲁ;
.implements Lxhss/ᲁᲇᛸᲀ;
.implements Lxhss/ᛱᲈᛴᛲ;
.implements Lxhss/ᛱᛶᲁᛶ;


# static fields
.field public static final ᛸᛶᲈᛶ:Ljava/lang/Object;


# instance fields
.field public final ᛱᛱᛲᲇ:Ljava/lang/String;

.field public final ᛳᲁᲇᛸ:Lxhss/ᛷᛱᛳᲁ;

.field public ᛷᛴᛷᛱ:Landroidx/lifecycle/ᛷᛵᛵᲈ;

.field public final ᛷᛵᛵᲈ:I

.field public ᛷᲁᲁ:Z

.field public final ᛸᛲᲀᛵ:Lxhss/ᛳᛲᛶᛱ;

.field public final ᛸᛴᛶᛳ:Lxhss/ᲇᛵᛲᲁ;

.field public ᛸᛷᲈᲈ:I

.field public final ᲀᲇᛳᲁ:Ljava/util/ArrayList;

.field public final ᲇᛴᲇᛵ:Lxhss/ᛱᛷᛸᲁ;

.field public ᲇᛶᛴᲀ:Lxhss/ᛳᛱᛲᲀ;

.field public ᲈᛳᲀ:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lxhss/ᛸᛴᛴᛶ;->ᛷᛵᛵᲈ:I

    .line 6
    .line 7
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iput-object v1, p0, Lxhss/ᛸᛴᛴᛶ;->ᛱᛱᛲᲇ:Ljava/lang/String;

    .line 16
    .line 17
    new-instance v1, Lxhss/ᛷᛱᛳᲁ;

    .line 18
    .line 19
    const/4 v2, 0x5

    .line 20
    invoke-direct {v1, v2}, Lxhss/ᛷᛱᛳᲁ;-><init>(I)V

    .line 21
    .line 22
    .line 23
    iput-object v1, p0, Lxhss/ᛸᛴᛴᛶ;->ᛳᲁᲇᛸ:Lxhss/ᛷᛱᛳᲁ;

    .line 24
    .line 25
    sget-object v1, Lxhss/ᛱᛷᛸᲁ;->ᲇᛶᛴᲀ:Lxhss/ᛱᛷᛸᲁ;

    .line 26
    .line 27
    iput-object v1, p0, Lxhss/ᛸᛴᛴᛶ;->ᲇᛴᲇᛵ:Lxhss/ᛱᛷᛸᲁ;

    .line 28
    .line 29
    new-instance v1, Lxhss/ᛲᲈᛱᛳ;

    .line 30
    .line 31
    invoke-direct {v1}, Lxhss/ᛲᲈᛱᛳ;-><init>()V

    .line 32
    .line 33
    .line 34
    new-instance v1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 35
    .line 36
    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 37
    .line 38
    .line 39
    new-instance v1, Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object v1, p0, Lxhss/ᛸᛴᛴᛶ;->ᲀᲇᛳᲁ:Ljava/util/ArrayList;

    .line 45
    .line 46
    new-instance v1, Lxhss/ᲇᛵᛲᲁ;

    .line 47
    .line 48
    const/16 v2, 0xa

    .line 49
    .line 50
    invoke-direct {v1, v2, p0}, Lxhss/ᲇᛵᛲᲁ;-><init>(ILjava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iput-object v1, p0, Lxhss/ᛸᛴᛴᛶ;->ᛸᛴᛶᛳ:Lxhss/ᲇᛵᛲᲁ;

    .line 54
    .line 55
    new-instance v1, Landroidx/lifecycle/ᛷᛵᛵᲈ;

    .line 56
    .line 57
    invoke-direct {v1, p0}, Landroidx/lifecycle/ᛷᛵᛵᲈ;-><init>(Lxhss/ᛴᛷᲀᲁ;)V

    .line 58
    .line 59
    .line 60
    iput-object v1, p0, Lxhss/ᛸᛴᛴᛶ;->ᛷᛴᛷᛱ:Landroidx/lifecycle/ᛷᛵᛵᲈ;

    .line 61
    .line 62
    new-instance v1, Lxhss/ᛳᛱᛲᲀ;

    .line 63
    .line 64
    invoke-direct {v1, p0}, Lxhss/ᛳᛱᛲᲀ;-><init>(Lxhss/ᛱᛶᲁᛶ;)V

    .line 65
    .line 66
    .line 67
    iput-object v1, p0, Lxhss/ᛸᛴᛴᛶ;->ᲇᛶᛴᲀ:Lxhss/ᛳᛱᛲᲀ;

    .line 68
    .line 69
    iget-object v1, p0, Lxhss/ᛸᛴᛴᛶ;->ᲀᲇᛳᲁ:Ljava/util/ArrayList;

    .line 70
    .line 71
    iget-object v2, p0, Lxhss/ᛸᛴᛴᛶ;->ᛸᛴᛶᛳ:Lxhss/ᲇᛵᛲᲁ;

    .line 72
    .line 73
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-nez v3, :cond_3

    .line 78
    .line 79
    iget v3, p0, Lxhss/ᛸᛴᛴᛶ;->ᛷᛵᛵᲈ:I

    .line 80
    .line 81
    if-ltz v3, :cond_2

    .line 82
    .line 83
    iget-object v1, v2, Lxhss/ᲇᛵᛲᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v1, Lxhss/ᛸᛴᛴᛶ;

    .line 86
    .line 87
    iget-object v2, v1, Lxhss/ᛸᛴᛴᛶ;->ᲇᛶᛴᲀ:Lxhss/ᛳᛱᛲᲀ;

    .line 88
    .line 89
    iget-object v3, v2, Lxhss/ᛳᛱᛲᲀ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v3, Lxhss/ᛱᛶᲁᛶ;

    .line 92
    .line 93
    invoke-interface {v3}, Lxhss/ᛴᛷᲀᲁ;->ᲇᛴᲇᛵ()Landroidx/lifecycle/ᛷᛵᛵᲈ;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    iget-object v5, v4, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᛱᛱᛲᲇ:Lxhss/ᛱᛷᛸᲁ;

    .line 98
    .line 99
    sget-object v6, Lxhss/ᛱᛷᛸᲁ;->ᛳᲁᲇᛸ:Lxhss/ᛱᛷᛸᲁ;

    .line 100
    .line 101
    if-ne v5, v6, :cond_1

    .line 102
    .line 103
    new-instance v5, Landroidx/savedstate/Recreator;

    .line 104
    .line 105
    invoke-direct {v5, v3}, Landroidx/savedstate/Recreator;-><init>(Lxhss/ᛱᛶᲁᛶ;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v4, v5}, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᛷᛵᛵᲈ(Lxhss/ᛱᲀᛲᲁ;)V

    .line 109
    .line 110
    .line 111
    iget-object v2, v2, Lxhss/ᛳᛱᛲᲀ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v2, Lxhss/ᲇᛸᛲᲁ;

    .line 114
    .line 115
    iget-boolean v3, v2, Lxhss/ᲇᛸᛲᲁ;->ᛱᛱᛲᲇ:Z

    .line 116
    .line 117
    if-nez v3, :cond_0

    .line 118
    .line 119
    new-instance v3, Lxhss/ᲇᲁᛱᲈ;

    .line 120
    .line 121
    invoke-direct {v3, v2}, Lxhss/ᲇᲁᛱᲈ;-><init>(Lxhss/ᲇᛸᛲᲁ;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v4, v3}, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᛷᛵᛵᲈ(Lxhss/ᛱᲀᛲᲁ;)V

    .line 125
    .line 126
    .line 127
    const/4 v3, 0x1

    .line 128
    iput-boolean v3, v2, Lxhss/ᲇᛸᛲᲁ;->ᛱᛱᛲᲇ:Z

    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_0
    const-string v2, "SavedStateRegistry was already attached."

    .line 132
    .line 133
    invoke-static {v2}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_1
    const-string v2, "Restarter must be created only during owner\'s initialization stage"

    .line 138
    .line 139
    invoke-static {v2}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    :goto_0
    invoke-static {v1}, Lxhss/ᛸᛶᛳᛷ;->ᛷᛴᛷᛱ(Lxhss/ᛱᛶᲁᛶ;)V

    .line 143
    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_2
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    :cond_3
    :goto_1
    new-instance v1, Lxhss/ᛴᲈᲀᲇ;

    .line 150
    .line 151
    const/4 v2, 0x0

    .line 152
    invoke-direct {v1, v2, p0}, Lxhss/ᛴᲈᲀᲇ;-><init>(ILjava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    new-instance v1, Lxhss/ᛳᛲᛶᛱ;

    .line 156
    .line 157
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 158
    .line 159
    .line 160
    iput-object v1, p0, Lxhss/ᛸᛴᛴᛶ;->ᛸᛲᲀᛵ:Lxhss/ᛳᛲᛶᛱ;

    .line 161
    .line 162
    iput v0, p0, Lxhss/ᛸᛴᛴᛶ;->ᛸᛷᲈᲈ:I

    .line 163
    .line 164
    new-instance v0, Lxhss/ᛳᛴᲀᲁ;

    .line 165
    .line 166
    invoke-direct {v0, p0}, Lxhss/ᛳᛴᲀᲁ;-><init>(Lxhss/ᛸᛴᛴᛶ;)V

    .line 167
    .line 168
    .line 169
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    if-eq p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_0
    const/4 p0, 0x1

    .line 6
    return p0
.end method

.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    new-instance p2, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string p3, "Fragment "

    .line 6
    .line 7
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string p0, " not attached to an activity."

    .line 14
    .line 15
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p1
.end method

.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    iget-boolean p1, p0, Lxhss/ᛸᛴᛴᛶ;->ᲈᛳᲀ:Z

    .line 2
    .line 3
    if-nez p1, :cond_1

    .line 4
    .line 5
    const/4 p1, 0x3

    .line 6
    invoke-static {p1}, Lxhss/ᛷᛱᛳᲁ;->ᛶᲇᲈᛸ(I)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lxhss/ᛸᛴᛴᛶ;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {p0}, Lxhss/ᛸᛴᛴᛶ;->ᛷᛴᛷᛱ()V

    .line 16
    .line 17
    .line 18
    :cond_1
    return-void
.end method

.method public final onLowMemory()V
    .locals 0

    .line 1
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x80

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v1, "{"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v1, "} ("

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    iget-object p0, p0, Lxhss/ᛸᛴᛴᛶ;->ᛱᛱᛲᲇ:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string p0, ")"

    .line 46
    .line 47
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0
.end method

.method public final ᛱᛱᛲᲇ()Lxhss/ᛱᛱᛷᛸ;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "Fragment "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string p0, " not attached to a context."

    .line 14
    .line 15
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw v0
.end method

.method public final ᛳᲁᲇᛸ()Lxhss/ᲈᲀᲀᛱ;
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v0, "Can\'t access ViewModels from detached fragment"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final ᛷᛴᛷᛱ()V
    .locals 11

    .line 1
    iget-boolean v0, p0, Lxhss/ᛸᛴᛴᛶ;->ᛷᲁᲁ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lxhss/ᛸᛴᛴᛶ;->ᛷᲁᲁ:Z

    .line 8
    .line 9
    iput-boolean v0, p0, Lxhss/ᛸᛴᛴᛶ;->ᲈᛳᲀ:Z

    .line 10
    .line 11
    iget v1, p0, Lxhss/ᛸᛴᛴᛶ;->ᛸᛷᲈᲈ:I

    .line 12
    .line 13
    const/4 v2, -0x1

    .line 14
    if-ltz v1, :cond_2

    .line 15
    .line 16
    invoke-virtual {p0}, Lxhss/ᛸᛴᛴᛶ;->ᲇᛶᛴᲀ()Lxhss/ᛷᛱᛳᲁ;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget v1, p0, Lxhss/ᛸᛴᛴᛶ;->ᛸᛷᲈᲈ:I

    .line 21
    .line 22
    if-ltz v1, :cond_1

    .line 23
    .line 24
    iget-object v0, v0, Lxhss/ᛷᛱᛳᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Ljava/util/ArrayList;

    .line 27
    .line 28
    monitor-enter v0

    .line 29
    :try_start_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    iput v2, p0, Lxhss/ᛸᛴᛴᛶ;->ᛸᛷᲈᲈ:I

    .line 31
    .line 32
    return-void

    .line 33
    :catchall_0
    move-exception p0

    .line 34
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 35
    throw p0

    .line 36
    :cond_1
    const-string p0, "Bad id: "

    .line 37
    .line 38
    invoke-static {p0, v1}, Lxhss/ᛴᛸᛲᛳ;->ᛶᲇᲈᛸ(Ljava/lang/String;I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᲀᲇᛳᲁ(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_2
    invoke-virtual {p0}, Lxhss/ᛸᛴᛴᛶ;->ᲇᛶᛴᲀ()Lxhss/ᛷᛱᛳᲁ;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    new-instance v3, Lxhss/ᲇᲀᛵᛵ;

    .line 51
    .line 52
    invoke-direct {v3, v1}, Lxhss/ᲇᲀᛵᛵ;-><init>(Lxhss/ᛷᛱᛳᲁ;)V

    .line 53
    .line 54
    .line 55
    new-instance v1, Lxhss/ᛲᛵᛸᲇ;

    .line 56
    .line 57
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 58
    .line 59
    .line 60
    const/4 v4, 0x3

    .line 61
    iput v4, v1, Lxhss/ᛲᛵᛸᲇ;->ᛷᛵᛵᲈ:I

    .line 62
    .line 63
    iput-object p0, v1, Lxhss/ᛲᛵᛸᲇ;->ᛱᛱᛲᲇ:Lxhss/ᛸᛴᛴᛶ;

    .line 64
    .line 65
    iget-object p0, v3, Lxhss/ᲇᲀᛵᛵ;->ᛷᛵᛵᲈ:Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    const/4 p0, 0x0

    .line 71
    iput p0, v1, Lxhss/ᛲᛵᛸᲇ;->ᛳᲁᲇᛸ:I

    .line 72
    .line 73
    iput p0, v1, Lxhss/ᛲᛵᛸᲇ;->ᲇᛴᲇᛵ:I

    .line 74
    .line 75
    iput p0, v1, Lxhss/ᛲᛵᛸᲇ;->ᛷᛴᛷᛱ:I

    .line 76
    .line 77
    iput p0, v1, Lxhss/ᛲᛵᛸᲇ;->ᲇᛶᛴᲀ:I

    .line 78
    .line 79
    iget-object v1, v3, Lxhss/ᲇᲀᛵᛵ;->ᛱᛱᛲᲇ:Lxhss/ᛷᛱᛳᲁ;

    .line 80
    .line 81
    iget-boolean v4, v3, Lxhss/ᲇᲀᛵᛵ;->ᛳᲁᲇᛸ:Z

    .line 82
    .line 83
    if-nez v4, :cond_9

    .line 84
    .line 85
    const/4 v4, 0x2

    .line 86
    invoke-static {v4}, Lxhss/ᛷᛱᛳᲁ;->ᛶᲇᲈᛸ(I)Z

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    if-eqz v4, :cond_8

    .line 91
    .line 92
    invoke-virtual {v3}, Lxhss/ᲇᲀᛵᛵ;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    new-instance v4, Lxhss/ᲁᲀᲈᛶ;

    .line 96
    .line 97
    invoke-direct {v4}, Lxhss/ᲁᲀᲈᛶ;-><init>()V

    .line 98
    .line 99
    .line 100
    new-instance v5, Ljava/io/PrintWriter;

    .line 101
    .line 102
    invoke-direct {v5, v4}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 103
    .line 104
    .line 105
    const-string v4, "  "

    .line 106
    .line 107
    iget-object v6, v3, Lxhss/ᲇᲀᛵᛵ;->ᛷᛵᛵᲈ:Ljava/util/ArrayList;

    .line 108
    .line 109
    invoke-virtual {v5, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    const-string v7, "mName="

    .line 113
    .line 114
    invoke-virtual {v5, v7}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    const/4 v7, 0x0

    .line 118
    invoke-virtual {v5, v7}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    const-string v7, " mIndex="

    .line 122
    .line 123
    invoke-virtual {v5, v7}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    iget v7, v3, Lxhss/ᲇᲀᛵᛵ;->ᲇᛴᲇᛵ:I

    .line 127
    .line 128
    invoke-virtual {v5, v7}, Ljava/io/PrintWriter;->print(I)V

    .line 129
    .line 130
    .line 131
    const-string v7, " mCommitted="

    .line 132
    .line 133
    invoke-virtual {v5, v7}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    iget-boolean v7, v3, Lxhss/ᲇᲀᛵᛵ;->ᛳᲁᲇᛸ:Z

    .line 137
    .line 138
    invoke-virtual {v5, v7}, Ljava/io/PrintWriter;->println(Z)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 142
    .line 143
    .line 144
    move-result v7

    .line 145
    if-nez v7, :cond_7

    .line 146
    .line 147
    invoke-virtual {v5, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    const-string v7, "Operations:"

    .line 151
    .line 152
    invoke-virtual {v5, v7}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 156
    .line 157
    .line 158
    move-result v7

    .line 159
    :goto_0
    if-ge p0, v7, :cond_7

    .line 160
    .line 161
    invoke-virtual {v6, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v8

    .line 165
    check-cast v8, Lxhss/ᛲᛵᛸᲇ;

    .line 166
    .line 167
    iget v9, v8, Lxhss/ᛲᛵᛸᲇ;->ᛷᛵᛵᲈ:I

    .line 168
    .line 169
    packed-switch v9, :pswitch_data_0

    .line 170
    .line 171
    .line 172
    new-instance v9, Ljava/lang/StringBuilder;

    .line 173
    .line 174
    const-string v10, "cmd="

    .line 175
    .line 176
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    iget v10, v8, Lxhss/ᛲᛵᛸᲇ;->ᛷᛵᛵᲈ:I

    .line 180
    .line 181
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v9

    .line 188
    goto :goto_1

    .line 189
    :pswitch_0
    const-string v9, "OP_SET_MAX_LIFECYCLE"

    .line 190
    .line 191
    goto :goto_1

    .line 192
    :pswitch_1
    const-string v9, "UNSET_PRIMARY_NAV"

    .line 193
    .line 194
    goto :goto_1

    .line 195
    :pswitch_2
    const-string v9, "SET_PRIMARY_NAV"

    .line 196
    .line 197
    goto :goto_1

    .line 198
    :pswitch_3
    const-string v9, "ATTACH"

    .line 199
    .line 200
    goto :goto_1

    .line 201
    :pswitch_4
    const-string v9, "DETACH"

    .line 202
    .line 203
    goto :goto_1

    .line 204
    :pswitch_5
    const-string v9, "SHOW"

    .line 205
    .line 206
    goto :goto_1

    .line 207
    :pswitch_6
    const-string v9, "HIDE"

    .line 208
    .line 209
    goto :goto_1

    .line 210
    :pswitch_7
    const-string v9, "REMOVE"

    .line 211
    .line 212
    goto :goto_1

    .line 213
    :pswitch_8
    const-string v9, "REPLACE"

    .line 214
    .line 215
    goto :goto_1

    .line 216
    :pswitch_9
    const-string v9, "ADD"

    .line 217
    .line 218
    goto :goto_1

    .line 219
    :pswitch_a
    const-string v9, "NULL"

    .line 220
    .line 221
    :goto_1
    invoke-virtual {v5, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    const-string v10, "  Op #"

    .line 225
    .line 226
    invoke-virtual {v5, v10}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v5, p0}, Ljava/io/PrintWriter;->print(I)V

    .line 230
    .line 231
    .line 232
    const-string v10, ": "

    .line 233
    .line 234
    invoke-virtual {v5, v10}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v5, v9}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    const-string v9, " "

    .line 241
    .line 242
    invoke-virtual {v5, v9}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    iget-object v9, v8, Lxhss/ᛲᛵᛸᲇ;->ᛱᛱᛲᲇ:Lxhss/ᛸᛴᛴᛶ;

    .line 246
    .line 247
    invoke-virtual {v5, v9}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    iget v9, v8, Lxhss/ᛲᛵᛸᲇ;->ᛳᲁᲇᛸ:I

    .line 251
    .line 252
    if-nez v9, :cond_3

    .line 253
    .line 254
    iget v9, v8, Lxhss/ᛲᛵᛸᲇ;->ᲇᛴᲇᛵ:I

    .line 255
    .line 256
    if-eqz v9, :cond_4

    .line 257
    .line 258
    :cond_3
    invoke-virtual {v5, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    const-string v9, "enterAnim=#"

    .line 262
    .line 263
    invoke-virtual {v5, v9}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    iget v9, v8, Lxhss/ᛲᛵᛸᲇ;->ᛳᲁᲇᛸ:I

    .line 267
    .line 268
    invoke-static {v9}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v9

    .line 272
    invoke-virtual {v5, v9}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    const-string v9, " exitAnim=#"

    .line 276
    .line 277
    invoke-virtual {v5, v9}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    iget v9, v8, Lxhss/ᛲᛵᛸᲇ;->ᲇᛴᲇᛵ:I

    .line 281
    .line 282
    invoke-static {v9}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v9

    .line 286
    invoke-virtual {v5, v9}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    :cond_4
    iget v9, v8, Lxhss/ᛲᛵᛸᲇ;->ᛷᛴᛷᛱ:I

    .line 290
    .line 291
    if-nez v9, :cond_5

    .line 292
    .line 293
    iget v9, v8, Lxhss/ᛲᛵᛸᲇ;->ᲇᛶᛴᲀ:I

    .line 294
    .line 295
    if-eqz v9, :cond_6

    .line 296
    .line 297
    :cond_5
    invoke-virtual {v5, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    const-string v9, "popEnterAnim=#"

    .line 301
    .line 302
    invoke-virtual {v5, v9}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    iget v9, v8, Lxhss/ᛲᛵᛸᲇ;->ᛷᛴᛷᛱ:I

    .line 306
    .line 307
    invoke-static {v9}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v9

    .line 311
    invoke-virtual {v5, v9}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    const-string v9, " popExitAnim=#"

    .line 315
    .line 316
    invoke-virtual {v5, v9}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    iget v8, v8, Lxhss/ᛲᛵᛸᲇ;->ᲇᛶᛴᲀ:I

    .line 320
    .line 321
    invoke-static {v8}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v8

    .line 325
    invoke-virtual {v5, v8}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    :cond_6
    add-int/lit8 p0, p0, 0x1

    .line 329
    .line 330
    goto/16 :goto_0

    .line 331
    .line 332
    :cond_7
    invoke-virtual {v5}, Ljava/io/PrintWriter;->close()V

    .line 333
    .line 334
    .line 335
    :cond_8
    iput-boolean v0, v3, Lxhss/ᲇᲀᛵᛵ;->ᛳᲁᲇᛸ:Z

    .line 336
    .line 337
    iput v2, v3, Lxhss/ᲇᲀᛵᛵ;->ᲇᛴᲇᛵ:I

    .line 338
    .line 339
    iget-object p0, v1, Lxhss/ᛷᛱᛳᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 340
    .line 341
    check-cast p0, Ljava/util/ArrayList;

    .line 342
    .line 343
    monitor-enter p0

    .line 344
    :try_start_2
    monitor-exit p0

    .line 345
    goto :goto_2

    .line 346
    :catchall_1
    move-exception v0

    .line 347
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 348
    throw v0

    .line 349
    :cond_9
    const-string p0, "commit already called"

    .line 350
    .line 351
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    :goto_2
    return-void

    .line 355
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ᛷᛵᛵᲈ()Lxhss/ᲇᛸᛲᲁ;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛸᛴᛴᛶ;->ᲇᛶᛴᲀ:Lxhss/ᛳᛱᛲᲀ;

    .line 2
    .line 3
    iget-object p0, p0, Lxhss/ᛳᛱᛲᲀ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Lxhss/ᲇᛸᛲᲁ;

    .line 6
    .line 7
    return-object p0
.end method

.method public final ᲇᛴᲇᛵ()Landroidx/lifecycle/ᛷᛵᛵᲈ;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛸᛴᛴᛶ;->ᛷᛴᛷᛱ:Landroidx/lifecycle/ᛷᛵᛵᲈ;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᲇᛶᛴᲀ()Lxhss/ᛷᛱᛳᲁ;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "Fragment "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string p0, " not associated with a fragment manager."

    .line 14
    .line 15
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw v0
.end method
