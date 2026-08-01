.class final Lcom/mr/elaris/InAppSettingsBackNavigator;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# static fields
.field private static final BACK_CALLBACK_PRIORITY:I = 0xf4240

.field private static final BACK_DEBOUNCE_MS:J = 0xdcL


# instance fields
.field private backCallback:Ljava/lang/Object;

.field private currentCategory:Ljava/lang/String;

.field private lastBackAt:J

.field private final pageStack:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final settings:Lcom/mr/elaris/InAppSettings;


# direct methods
.method public constructor <init>(Lcom/mr/elaris/InAppSettings;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/mr/elaris/InAppSettingsBackNavigator;->pageStack:Ljava/util/List;

    .line 10
    .line 11
    iput-object p1, p0, Lcom/mr/elaris/InAppSettingsBackNavigator;->settings:Lcom/mr/elaris/InAppSettings;

    .line 12
    .line 13
    return-void
.end method

.method public static bridge synthetic a(Lcom/mr/elaris/InAppSettingsBackNavigator;)Lcom/mr/elaris/InAppSettings;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/mr/elaris/InAppSettingsBackNavigator;->settings:Lcom/mr/elaris/InAppSettings;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public goBack(Ljava/lang/String;)V
    .locals 6

    .line 1
    const-string v0, "settings back route reason="

    .line 2
    .line 3
    const-string v1, " depth="

    .line 4
    .line 5
    invoke-static {v0, p1, v1}, La;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsBackNavigator;->pageStack:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v0, " current="

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsBackNavigator;->currentCategory:Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-static {p1}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 40
    .line 41
    .line 42
    move-result-wide v0

    .line 43
    iget-wide v2, p0, Lcom/mr/elaris/InAppSettingsBackNavigator;->lastBackAt:J

    .line 44
    .line 45
    sub-long v2, v0, v2

    .line 46
    .line 47
    const-wide/16 v4, 0xdc

    .line 48
    .line 49
    cmp-long p1, v2, v4

    .line 50
    .line 51
    if-gez p1, :cond_0

    .line 52
    .line 53
    iget-object p0, p0, Lcom/mr/elaris/InAppSettingsBackNavigator;->settings:Lcom/mr/elaris/InAppSettings;

    .line 54
    .line 55
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->refocusAfterBackDebounce()V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_0
    iput-wide v0, p0, Lcom/mr/elaris/InAppSettingsBackNavigator;->lastBackAt:J

    .line 60
    .line 61
    iget-object p1, p0, Lcom/mr/elaris/InAppSettingsBackNavigator;->pageStack:Ljava/util/List;

    .line 62
    .line 63
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    const/4 v0, 0x0

    .line 68
    const/4 v1, -0x1

    .line 69
    if-eqz p1, :cond_1

    .line 70
    .line 71
    iget-object p1, p0, Lcom/mr/elaris/InAppSettingsBackNavigator;->currentCategory:Ljava/lang/String;

    .line 72
    .line 73
    if-eqz p1, :cond_1

    .line 74
    .line 75
    iput-object v0, p0, Lcom/mr/elaris/InAppSettingsBackNavigator;->currentCategory:Ljava/lang/String;

    .line 76
    .line 77
    iget-object p0, p0, Lcom/mr/elaris/InAppSettingsBackNavigator;->settings:Lcom/mr/elaris/InAppSettings;

    .line 78
    .line 79
    invoke-virtual {p0, v1}, Lcom/mr/elaris/InAppSettings;->showHomeFromNavigation(I)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_1
    iget-object p1, p0, Lcom/mr/elaris/InAppSettingsBackNavigator;->pageStack:Ljava/util/List;

    .line 84
    .line 85
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    if-eqz p1, :cond_2

    .line 90
    .line 91
    iget-object p0, p0, Lcom/mr/elaris/InAppSettingsBackNavigator;->settings:Lcom/mr/elaris/InAppSettings;

    .line 92
    .line 93
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->restoreQQFromNavigation()V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :cond_2
    iget-object p1, p0, Lcom/mr/elaris/InAppSettingsBackNavigator;->pageStack:Ljava/util/List;

    .line 98
    .line 99
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    iget-object v2, p0, Lcom/mr/elaris/InAppSettingsBackNavigator;->pageStack:Ljava/util/List;

    .line 104
    .line 105
    const/4 v3, 0x1

    .line 106
    if-gt p1, v3, :cond_3

    .line 107
    .line 108
    invoke-interface {v2}, Ljava/util/List;->clear()V

    .line 109
    .line 110
    .line 111
    iput-object v0, p0, Lcom/mr/elaris/InAppSettingsBackNavigator;->currentCategory:Ljava/lang/String;

    .line 112
    .line 113
    iget-object p0, p0, Lcom/mr/elaris/InAppSettingsBackNavigator;->settings:Lcom/mr/elaris/InAppSettings;

    .line 114
    .line 115
    invoke-virtual {p0, v1}, Lcom/mr/elaris/InAppSettings;->showHomeFromNavigation(I)V

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :cond_3
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    sub-int/2addr p1, v3

    .line 124
    invoke-interface {v2, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    iget-object p1, p0, Lcom/mr/elaris/InAppSettingsBackNavigator;->pageStack:Ljava/util/List;

    .line 128
    .line 129
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    sub-int/2addr v0, v3

    .line 134
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    check-cast p1, Ljava/lang/String;

    .line 139
    .line 140
    :try_start_0
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsBackNavigator;->settings:Lcom/mr/elaris/InAppSettings;

    .line 141
    .line 142
    invoke-virtual {v0, p1, v1}, Lcom/mr/elaris/InAppSettings;->showCategoryFromNavigation(Ljava/lang/String;I)V

    .line 143
    .line 144
    .line 145
    iput-object p1, p0, Lcom/mr/elaris/InAppSettingsBackNavigator;->currentCategory:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 146
    .line 147
    return-void

    .line 148
    :catchall_0
    move-exception v0

    .line 149
    new-instance v2, Ljava/lang/StringBuilder;

    .line 150
    .line 151
    const-string v3, "back to category failed "

    .line 152
    .line 153
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    const-string v3, ": "

    .line 160
    .line 161
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    invoke-static {v2}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    iget-object v2, p0, Lcom/mr/elaris/InAppSettingsBackNavigator;->settings:Lcom/mr/elaris/InAppSettings;

    .line 175
    .line 176
    invoke-virtual {v2, p1, v0, v1}, Lcom/mr/elaris/InAppSettings;->showCategoryErrorFromNavigation(Ljava/lang/String;Ljava/lang/Throwable;I)V

    .line 177
    .line 178
    .line 179
    iput-object p1, p0, Lcom/mr/elaris/InAppSettingsBackNavigator;->currentCategory:Ljava/lang/String;

    .line 180
    .line 181
    return-void
.end method

.method public handleBackCallbackInvocation(Ljava/lang/reflect/Method;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "onBackInvoked"

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    const/4 v1, 0x0

    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    return-object v1

    .line 15
    :cond_0
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettingsBackNavigator;->wasBackHandledRecently()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    return-object v1

    .line 22
    :cond_1
    iget-object p1, p0, Lcom/mr/elaris/InAppSettingsBackNavigator;->settings:Lcom/mr/elaris/InAppSettings;

    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/mr/elaris/InAppSettings;->isBackNavigationEligible()Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-eqz p1, :cond_2

    .line 29
    .line 30
    iget-object p0, p0, Lcom/mr/elaris/InAppSettingsBackNavigator;->settings:Lcom/mr/elaris/InAppSettings;

    .line 31
    .line 32
    invoke-virtual {p0, v0}, Lcom/mr/elaris/InAppSettings;->handleBackInsideElarisFromNavigation(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    :cond_2
    return-object v1
.end method

.method public keepCategoryBackTarget(Ljava/lang/String;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iput-object p1, p0, Lcom/mr/elaris/InAppSettingsBackNavigator;->currentCategory:Ljava/lang/String;

    .line 11
    .line 12
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsBackNavigator;->pageStack:Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object v1, p0, Lcom/mr/elaris/InAppSettingsBackNavigator;->pageStack:Ljava/util/List;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    add-int/lit8 v0, v0, -0x1

    .line 31
    .line 32
    iget-object v1, p0, Lcom/mr/elaris/InAppSettingsBackNavigator;->pageStack:Ljava/util/List;

    .line 33
    .line 34
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-nez v1, :cond_2

    .line 43
    .line 44
    iget-object p0, p0, Lcom/mr/elaris/InAppSettingsBackNavigator;->pageStack:Ljava/util/List;

    .line 45
    .line 46
    invoke-interface {p0, v0, p1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    :cond_2
    :goto_0
    return-void
.end method

.method public recordBackHandled()V
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iput-wide v0, p0, Lcom/mr/elaris/InAppSettingsBackNavigator;->lastBackAt:J

    .line 6
    .line 7
    return-void
.end method

.method public refreshCurrentPage()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsBackNavigator;->settings:Lcom/mr/elaris/InAppSettings;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/mr/elaris/InAppSettings;->keepElarisPageFocused()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsBackNavigator;->currentCategory:Ljava/lang/String;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-lez v2, :cond_0

    .line 16
    .line 17
    iget-object v2, p0, Lcom/mr/elaris/InAppSettingsBackNavigator;->settings:Lcom/mr/elaris/InAppSettings;

    .line 18
    .line 19
    invoke-virtual {v2, v0, v1}, Lcom/mr/elaris/InAppSettings;->showCategoryFromNavigation(Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lcom/mr/elaris/InAppSettingsBackNavigator;->currentCategory:Ljava/lang/String;

    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    iget-object p0, p0, Lcom/mr/elaris/InAppSettingsBackNavigator;->settings:Lcom/mr/elaris/InAppSettings;

    .line 26
    .line 27
    invoke-virtual {p0, v1}, Lcom/mr/elaris/InAppSettings;->showHomeFromNavigation(I)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public registerBackCallback()V
    .locals 6

    .line 1
    :try_start_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x21

    .line 4
    .line 5
    if-lt v0, v1, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsBackNavigator;->backCallback:Ljava/lang/Object;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string v0, "android.window.OnBackInvokedCallback"

    .line 13
    .line 14
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-class v1, Lcom/mr/elaris/InAppSettings;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    new-instance v3, Lcom/mr/elaris/InAppSettingsBackNavigator$1;

    .line 29
    .line 30
    invoke-direct {v3, p0}, Lcom/mr/elaris/InAppSettingsBackNavigator$1;-><init>(Lcom/mr/elaris/InAppSettingsBackNavigator;)V

    .line 31
    .line 32
    .line 33
    invoke-static {v1, v2, v3}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iget-object v2, p0, Lcom/mr/elaris/InAppSettingsBackNavigator;->settings:Lcom/mr/elaris/InAppSettings;

    .line 38
    .line 39
    iget-object v2, v2, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 40
    .line 41
    const-class v3, Landroid/app/Activity;

    .line 42
    .line 43
    const-string v4, "getOnBackInvokedDispatcher"

    .line 44
    .line 45
    const/4 v5, 0x0

    .line 46
    invoke-virtual {v3, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-virtual {v3, v2, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    const-string v4, "registerOnBackInvokedCallback"

    .line 59
    .line 60
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 61
    .line 62
    filled-new-array {v5, v0}, [Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v3, v4, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    const v3, 0xf4240

    .line 71
    .line 72
    .line 73
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    filled-new-array {v3, v1}, [Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-virtual {v0, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    iput-object v1, p0, Lcom/mr/elaris/InAppSettingsBackNavigator;->backCallback:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    .line 86
    :cond_1
    :goto_0
    return-void

    .line 87
    :catchall_0
    move-exception p0

    .line 88
    const-string v0, "settings"

    .line 89
    .line 90
    const-string v1, "register-back-callback"

    .line 91
    .line 92
    invoke-static {v0, v1, p0}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 93
    .line 94
    .line 95
    return-void
.end method

.method public resetForAttach()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsBackNavigator;->pageStack:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lcom/mr/elaris/InAppSettingsBackNavigator;->currentCategory:Ljava/lang/String;

    .line 8
    .line 9
    const-wide/16 v0, 0x0

    .line 10
    .line 11
    iput-wide v0, p0, Lcom/mr/elaris/InAppSettingsBackNavigator;->lastBackAt:J

    .line 12
    .line 13
    return-void
.end method

.method public showCategory(Ljava/lang/String;Z)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eqz p2, :cond_1

    .line 3
    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/mr/elaris/InAppSettingsBackNavigator;->pageStack:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, Lcom/mr/elaris/InAppSettingsBackNavigator;->pageStack:Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    sub-int/2addr v2, v0

    .line 19
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p2

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/mr/elaris/InAppSettingsBackNavigator;->pageStack:Ljava/util/List;

    .line 33
    .line 34
    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    .line 37
    goto :goto_2

    .line 38
    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    const-string v2, "open category failed "

    .line 41
    .line 42
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v2, ": "

    .line 49
    .line 50
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-static {v1}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    iget-object v1, p0, Lcom/mr/elaris/InAppSettingsBackNavigator;->settings:Lcom/mr/elaris/InAppSettings;

    .line 64
    .line 65
    invoke-virtual {v1, p1, p2, v0}, Lcom/mr/elaris/InAppSettings;->showCategoryErrorFromNavigation(Ljava/lang/String;Ljava/lang/Throwable;I)V

    .line 66
    .line 67
    .line 68
    iput-object p1, p0, Lcom/mr/elaris/InAppSettingsBackNavigator;->currentCategory:Ljava/lang/String;

    .line 69
    .line 70
    return-void

    .line 71
    :cond_1
    :goto_2
    const-string v1, "settings category route category="

    .line 72
    .line 73
    const-string v2, " depth="

    .line 74
    .line 75
    invoke-static {v1, p1, v2}, La;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    iget-object v2, p0, Lcom/mr/elaris/InAppSettingsBackNavigator;->pageStack:Ljava/util/List;

    .line 80
    .line 81
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const-string v2, " add="

    .line 89
    .line 90
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    invoke-static {p2}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    iget-object p2, p0, Lcom/mr/elaris/InAppSettingsBackNavigator;->settings:Lcom/mr/elaris/InAppSettings;

    .line 104
    .line 105
    invoke-virtual {p2, p1, v0}, Lcom/mr/elaris/InAppSettings;->showCategoryFromNavigation(Ljava/lang/String;I)V

    .line 106
    .line 107
    .line 108
    iput-object p1, p0, Lcom/mr/elaris/InAppSettingsBackNavigator;->currentCategory:Ljava/lang/String;

    .line 109
    .line 110
    return-void
.end method

.method public unregisterBackCallback()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsBackNavigator;->backCallback:Ljava/lang/Object;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-object v1, p0, Lcom/mr/elaris/InAppSettingsBackNavigator;->backCallback:Ljava/lang/Object;

    .line 5
    .line 6
    :try_start_0
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 7
    .line 8
    const/16 v3, 0x21

    .line 9
    .line 10
    if-lt v2, v3, :cond_3

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    const-string v2, "android.window.OnBackInvokedCallback"

    .line 16
    .line 17
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    iget-object p0, p0, Lcom/mr/elaris/InAppSettingsBackNavigator;->settings:Lcom/mr/elaris/InAppSettings;

    .line 22
    .line 23
    iget-object p0, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 24
    .line 25
    const-class v3, Landroid/app/Activity;

    .line 26
    .line 27
    const-string v4, "getOnBackInvokedDispatcher"

    .line 28
    .line 29
    invoke-virtual {v3, v4, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-virtual {v3, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    const-string v3, "unregisterOnBackInvokedCallback"

    .line 42
    .line 43
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v1, v3, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v1, p0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :catchall_0
    move-exception p0

    .line 60
    instance-of v0, p0, Ljava/lang/reflect/InvocationTargetException;

    .line 61
    .line 62
    if-eqz v0, :cond_1

    .line 63
    .line 64
    move-object v1, p0

    .line 65
    check-cast v1, Ljava/lang/reflect/InvocationTargetException;

    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    if-eqz v2, :cond_1

    .line 72
    .line 73
    invoke-virtual {v1}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    goto :goto_0

    .line 78
    :cond_1
    move-object v1, p0

    .line 79
    :goto_0
    instance-of v2, v1, Ljava/lang/IllegalArgumentException;

    .line 80
    .line 81
    if-nez v2, :cond_3

    .line 82
    .line 83
    instance-of v1, v1, Ljava/lang/IllegalStateException;

    .line 84
    .line 85
    if-nez v1, :cond_3

    .line 86
    .line 87
    if-eqz v0, :cond_2

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_2
    const-string v0, "settings"

    .line 91
    .line 92
    const-string v1, "unregister-back-callback"

    .line 93
    .line 94
    invoke-static {v0, v1, p0}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 95
    .line 96
    .line 97
    :cond_3
    :goto_1
    return-void
.end method

.method public wasBackHandledRecently()Z
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/mr/elaris/InAppSettingsBackNavigator;->lastBackAt:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long p0, v0, v2

    .line 6
    .line 7
    if-lez p0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 10
    .line 11
    .line 12
    move-result-wide v2

    .line 13
    sub-long/2addr v2, v0

    .line 14
    const-wide/16 v0, 0xdc

    .line 15
    .line 16
    cmp-long p0, v2, v0

    .line 17
    .line 18
    if-gez p0, :cond_0

    .line 19
    .line 20
    const/4 p0, 0x1

    .line 21
    return p0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return p0
.end method
