.class public final Lu3/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Landroidx/lifecycle/o;


# instance fields
.field public final synthetic g:I

.field public final h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lu3/c;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lu3/a;->g:I

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lu3/a;->h:Ljava/lang/Object;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>([Landroidx/lifecycle/h;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lu3/a;->g:I

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Lu3/a;->h:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b(Landroidx/lifecycle/q;Landroidx/lifecycle/k;)V
    .locals 3

    .line 1
    iget v0, p0, Lu3/a;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lu3/a;->h:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, [Landroidx/lifecycle/h;

    .line 14
    .line 15
    array-length p2, p1

    .line 16
    const/4 v0, 0x0

    .line 17
    const/4 v1, 0x0

    .line 18
    if-gtz p2, :cond_1

    .line 19
    .line 20
    array-length p2, p1

    .line 21
    if-gtz p2, :cond_0

    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    aget-object p1, p1, v1

    .line 25
    .line 26
    throw v0

    .line 27
    :cond_1
    aget-object p1, p1, v1

    .line 28
    .line 29
    throw v0

    .line 30
    :pswitch_0
    sget-object v0, Landroidx/lifecycle/k;->ON_CREATE:Landroidx/lifecycle/k;

    .line 31
    .line 32
    if-ne p2, v0, :cond_5

    .line 33
    .line 34
    invoke-interface {p1}, Landroidx/lifecycle/q;->f()Landroidx/lifecycle/s;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1, p0}, Landroidx/lifecycle/s;->f(Landroidx/lifecycle/p;)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Lu3/a;->h:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p1, Lu3/c;

    .line 44
    .line 45
    invoke-interface {p1}, Lu3/c;->b()Lm/a;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    const-string p2, "androidx.savedstate.Restarter"

    .line 50
    .line 51
    invoke-virtual {p1, p2}, Lm/a;->l(Ljava/lang/String;)Landroid/os/Bundle;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    if-nez p1, :cond_2

    .line 56
    .line 57
    goto/16 :goto_0

    .line 58
    .line 59
    :cond_2
    const-string p2, "classes_to_restore"

    .line 60
    .line 61
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    if-eqz p1, :cond_4

    .line 66
    .line 67
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    if-nez p2, :cond_3

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    check-cast p1, Ljava/lang/String;

    .line 83
    .line 84
    const-string p2, "Class "

    .line 85
    .line 86
    :try_start_0
    const-class v0, Lu3/a;

    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    const/4 v1, 0x0

    .line 93
    invoke-static {p1, v1, v0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    const-class v1, Lu3/b;

    .line 98
    .line 99
    invoke-virtual {v0, v1}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2

    .line 104
    .line 105
    .line 106
    const/4 v1, 0x0

    .line 107
    :try_start_1
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 108
    .line 109
    .line 110
    move-result-object p2
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    .line 111
    const/4 v0, 0x1

    .line 112
    invoke-virtual {p2, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 113
    .line 114
    .line 115
    :try_start_2
    invoke-virtual {p2, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p2

    .line 119
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    new-instance p2, Ljava/lang/ClassCastException;

    .line 123
    .line 124
    invoke-direct {p2}, Ljava/lang/ClassCastException;-><init>()V

    .line 125
    .line 126
    .line 127
    throw p2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 128
    :catch_0
    move-exception p2

    .line 129
    const-string v0, "Failed to instantiate "

    .line 130
    .line 131
    invoke-static {v0, p1}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    invoke-static {p1, p2}, Lah/a;->p(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 136
    .line 137
    .line 138
    goto :goto_0

    .line 139
    :catch_1
    move-exception p1

    .line 140
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 141
    .line 142
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    new-instance v2, Ljava/lang/StringBuilder;

    .line 147
    .line 148
    invoke-direct {v2, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    const-string p2, " must have default constructor in order to be automatically recreated"

    .line 155
    .line 156
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object p2

    .line 163
    invoke-direct {v1, p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 164
    .line 165
    .line 166
    throw v1

    .line 167
    :catch_2
    move-exception v0

    .line 168
    const-string v1, " wasn\'t found"

    .line 169
    .line 170
    invoke-static {p2, p1, v1}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    invoke-static {p1, v0}, Lah/a;->p(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 175
    .line 176
    .line 177
    goto :goto_0

    .line 178
    :cond_4
    const-string p1, "SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\""

    .line 179
    .line 180
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    goto :goto_0

    .line 184
    :cond_5
    const-string p1, "Next event must be ON_CREATE"

    .line 185
    .line 186
    invoke-static {p1}, Lj8/o;->f(Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    :goto_0
    return-void

    .line 190
    nop

    .line 191
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
