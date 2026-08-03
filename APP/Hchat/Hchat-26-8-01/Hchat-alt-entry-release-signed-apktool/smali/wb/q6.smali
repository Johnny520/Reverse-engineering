.class public final Lwb/q6;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lgg/u;

.field public final synthetic c:Lgg/q;

.field public final synthetic d:Li0/j1;

.field public final synthetic e:Lgg/u;

.field public final synthetic f:Lgg/q;

.field public final synthetic g:Lwb/o6;

.field public final synthetic h:Ljava/util/ArrayList;

.field public final synthetic i:Landroid/view/ViewGroup;

.field public final synthetic j:Lc9/a1;


# direct methods
.method public synthetic constructor <init>(Lgg/u;Lgg/q;Li0/j1;Lgg/u;Lgg/q;Lwb/o6;Ljava/util/ArrayList;Landroid/view/ViewGroup;Lc9/a1;I)V
    .locals 0

    .line 1
    iput p10, p0, Lwb/q6;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/q6;->b:Lgg/u;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/q6;->c:Lgg/q;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/q6;->d:Li0/j1;

    .line 8
    .line 9
    iput-object p4, p0, Lwb/q6;->e:Lgg/u;

    .line 10
    .line 11
    iput-object p5, p0, Lwb/q6;->f:Lgg/q;

    .line 12
    .line 13
    iput-object p6, p0, Lwb/q6;->g:Lwb/o6;

    .line 14
    .line 15
    iput-object p7, p0, Lwb/q6;->h:Ljava/util/ArrayList;

    .line 16
    .line 17
    iput-object p8, p0, Lwb/q6;->i:Landroid/view/ViewGroup;

    .line 18
    .line 19
    iput-object p9, p0, Lwb/q6;->j:Lc9/a1;

    .line 20
    .line 21
    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    .line 22
    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 14

    .line 1
    iget v0, p0, Lwb/q6;->a:I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object v4, p0, Lwb/q6;->b:Lgg/u;

    .line 10
    .line 11
    iget-object v0, v4, Lgg/u;->g:Ljava/lang/Object;

    .line 12
    .line 13
    const/4 v10, 0x0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    check-cast v0, Landroid/widget/FrameLayout;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v8, p0, Lwb/q6;->i:Landroid/view/ViewGroup;

    .line 26
    .line 27
    iget-object v9, p0, Lwb/q6;->j:Lc9/a1;

    .line 28
    .line 29
    iget-object v1, p0, Lwb/q6;->c:Lgg/q;

    .line 30
    .line 31
    iget-object v2, p0, Lwb/q6;->d:Li0/j1;

    .line 32
    .line 33
    iget-object v3, p0, Lwb/q6;->e:Lgg/u;

    .line 34
    .line 35
    iget-object v5, p0, Lwb/q6;->f:Lgg/q;

    .line 36
    .line 37
    iget-object v6, p0, Lwb/q6;->g:Lwb/o6;

    .line 38
    .line 39
    iget-object v7, p0, Lwb/q6;->h:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-static/range {v1 .. v9}, La7/a;->c(Lgg/q;Li0/j1;Lgg/u;Lgg/u;Lgg/q;Lwb/o6;Ljava/util/ArrayList;Landroid/view/ViewGroup;Lc9/a1;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, v10}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    :goto_0
    return-void

    .line 48
    :cond_1
    const-string p1, "page"

    .line 49
    .line 50
    invoke-static {p1}, Lgg/l;->g(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw v10

    .line 54
    :pswitch_0
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    array-length v1, v0

    .line 60
    const/4 v2, 0x0

    .line 61
    :goto_1
    const/4 v3, 0x0

    .line 62
    if-ge v2, v1, :cond_3

    .line 63
    .line 64
    aget-object v4, v0, v2

    .line 65
    .line 66
    instance-of v5, v4, Landroid/view/KeyEvent;

    .line 67
    .line 68
    if-eqz v5, :cond_2

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_3
    move-object v4, v3

    .line 75
    :goto_2
    instance-of v0, v4, Landroid/view/KeyEvent;

    .line 76
    .line 77
    if-eqz v0, :cond_4

    .line 78
    .line 79
    check-cast v4, Landroid/view/KeyEvent;

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_4
    move-object v4, v3

    .line 83
    :goto_3
    if-eqz v4, :cond_8

    .line 84
    .line 85
    invoke-virtual {v4}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    const/4 v1, 0x4

    .line 90
    if-ne v0, v1, :cond_8

    .line 91
    .line 92
    iget-object v8, p0, Lwb/q6;->b:Lgg/u;

    .line 93
    .line 94
    iget-object v0, v8, Lgg/u;->g:Ljava/lang/Object;

    .line 95
    .line 96
    if-eqz v0, :cond_7

    .line 97
    .line 98
    check-cast v0, Landroid/widget/FrameLayout;

    .line 99
    .line 100
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    if-nez v0, :cond_5

    .line 105
    .line 106
    goto :goto_4

    .line 107
    :cond_5
    invoke-virtual {v4}, Landroid/view/KeyEvent;->getAction()I

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    const/4 v1, 0x1

    .line 112
    if-ne v0, v1, :cond_6

    .line 113
    .line 114
    iget-object v12, p0, Lwb/q6;->i:Landroid/view/ViewGroup;

    .line 115
    .line 116
    iget-object v13, p0, Lwb/q6;->j:Lc9/a1;

    .line 117
    .line 118
    iget-object v5, p0, Lwb/q6;->c:Lgg/q;

    .line 119
    .line 120
    iget-object v6, p0, Lwb/q6;->d:Li0/j1;

    .line 121
    .line 122
    iget-object v7, p0, Lwb/q6;->e:Lgg/u;

    .line 123
    .line 124
    iget-object v9, p0, Lwb/q6;->f:Lgg/q;

    .line 125
    .line 126
    iget-object v10, p0, Lwb/q6;->g:Lwb/o6;

    .line 127
    .line 128
    iget-object v11, p0, Lwb/q6;->h:Ljava/util/ArrayList;

    .line 129
    .line 130
    invoke-static/range {v5 .. v13}, La7/a;->c(Lgg/q;Li0/j1;Lgg/u;Lgg/u;Lgg/q;Lwb/o6;Ljava/util/ArrayList;Landroid/view/ViewGroup;Lc9/a1;)V

    .line 131
    .line 132
    .line 133
    :cond_6
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 134
    .line 135
    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    goto :goto_4

    .line 139
    :cond_7
    const-string p1, "page"

    .line 140
    .line 141
    invoke-static {p1}, Lgg/l;->g(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    throw v3

    .line 145
    :cond_8
    :goto_4
    return-void

    .line 146
    nop

    .line 147
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
