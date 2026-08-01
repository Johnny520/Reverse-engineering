.class public final Landroidx/savedstate/Recreator;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛷᲁᲇᲀ;


# instance fields
.field public final ᛱᛱᛲᲇ:Lxhss/ᛱᛶᲁᛶ;


# direct methods
.method public constructor <init>(Lxhss/ᛱᛶᲁᛶ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/savedstate/Recreator;->ᛱᛱᛲᲇ:Lxhss/ᛱᛶᲁᛶ;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final ᛷᛵᛵᲈ(Lxhss/ᛴᛷᲀᲁ;Lxhss/ᲈᲀᛵᛸ;)V
    .locals 2

    .line 1
    const-string v0, "Class "

    .line 2
    .line 3
    sget-object v1, Lxhss/ᲈᲀᛵᛸ;->ON_CREATE:Lxhss/ᲈᲀᛵᛸ;

    .line 4
    .line 5
    if-ne p2, v1, :cond_3

    .line 6
    .line 7
    invoke-interface {p1}, Lxhss/ᛴᛷᲀᲁ;->ᲇᛴᲇᛵ()Landroidx/lifecycle/ᛷᛵᛵᲈ;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1, p0}, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᲇᛶᛴᲀ(Lxhss/ᛱᲀᛲᲁ;)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Landroidx/savedstate/Recreator;->ᛱᛱᛲᲇ:Lxhss/ᛱᛶᲁᛶ;

    .line 15
    .line 16
    invoke-interface {p0}, Lxhss/ᛱᛶᲁᛶ;->ᛷᛵᛵᲈ()Lxhss/ᲇᛸᛲᲁ;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const-string p2, "androidx.savedstate.Restarter"

    .line 21
    .line 22
    invoke-virtual {p1, p2}, Lxhss/ᲇᛸᛲᲁ;->ᛷᛵᛵᲈ(Ljava/lang/String;)Landroid/os/Bundle;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    if-nez p1, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const-string p2, "classes_to_restore"

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    if-eqz p1, :cond_2

    .line 36
    .line 37
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    if-nez p2, :cond_1

    .line 46
    .line 47
    :goto_0
    return-void

    .line 48
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    check-cast p1, Ljava/lang/String;

    .line 53
    .line 54
    :try_start_0
    const-class p2, Landroidx/savedstate/Recreator;

    .line 55
    .line 56
    invoke-virtual {p2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    const/4 v1, 0x0

    .line 61
    invoke-static {p1, v1, p2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    const-class v1, Lxhss/ᛶᛱᛸᛴ;

    .line 66
    .line 67
    invoke-virtual {p2, v1}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    move-result-object p2
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2

    .line 71
    const/4 v1, 0x0

    .line 72
    :try_start_1
    invoke-virtual {p2, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 73
    .line 74
    .line 75
    move-result-object p2
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    .line 76
    const/4 v0, 0x1

    .line 77
    invoke-virtual {p2, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 78
    .line 79
    .line 80
    :try_start_2
    invoke-virtual {p2, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    check-cast p2, Lxhss/ᛶᛱᛸᛴ;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 85
    .line 86
    move-object p1, p0

    .line 87
    check-cast p1, Lxhss/ᲁᲇᛸᲀ;

    .line 88
    .line 89
    invoke-interface {p1}, Lxhss/ᲁᲇᛸᲀ;->ᛳᲁᲇᛸ()Lxhss/ᲈᲀᲀᛱ;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-interface {p0}, Lxhss/ᛱᛶᲁᛶ;->ᛷᛵᛵᲈ()Lxhss/ᲇᛸᛲᲁ;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    new-instance p0, Ljava/util/HashSet;

    .line 100
    .line 101
    throw v1

    .line 102
    :catch_0
    move-exception p0

    .line 103
    new-instance p2, Ljava/lang/RuntimeException;

    .line 104
    .line 105
    new-instance v0, Ljava/lang/StringBuilder;

    .line 106
    .line 107
    const-string v1, "Failed to instantiate "

    .line 108
    .line 109
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-direct {p2, p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 120
    .line 121
    .line 122
    throw p2

    .line 123
    :catch_1
    move-exception p0

    .line 124
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 125
    .line 126
    invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p2

    .line 130
    new-instance v1, Ljava/lang/StringBuilder;

    .line 131
    .line 132
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    const-string p2, " must have default constructor in order to be automatically recreated"

    .line 139
    .line 140
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p2

    .line 147
    invoke-direct {p1, p2, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 148
    .line 149
    .line 150
    throw p1

    .line 151
    :catch_2
    move-exception p0

    .line 152
    new-instance p2, Ljava/lang/RuntimeException;

    .line 153
    .line 154
    const-string v1, " wasn\'t found"

    .line 155
    .line 156
    invoke-static {v0, p1, v1}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛶᛴᲈ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    invoke-direct {p2, p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 161
    .line 162
    .line 163
    throw p2

    .line 164
    :cond_2
    const-string p0, "Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\""

    .line 165
    .line 166
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    return-void

    .line 170
    :cond_3
    new-instance p0, Ljava/lang/AssertionError;

    .line 171
    .line 172
    const-string p1, "Next event must be ON_CREATE"

    .line 173
    .line 174
    invoke-direct {p0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    throw p0
.end method
