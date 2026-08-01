.class public final Lcom/example/dyhelper/beta/BetaNativeBridge;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final β:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/example/dyhelper/beta/BetaNativeBridge;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    new-instance v0, Lo7;

    .line 10
    .line 11
    const/4 v1, 0x7

    .line 12
    invoke-direct {v0, v1}, Lo7;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sget-object v1, Lqq0;->ε:Lqq0;

    .line 16
    .line 17
    invoke-static {v1, v0}, Lln0;->Σ(Lqq0;Lp70;)Loq0;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sput-object v0, Lcom/example/dyhelper/beta/BetaNativeBridge;->β:Ljava/lang/Object;

    .line 22
    .line 23
    return-void
.end method

.method private static final native nativeAllowChapterSkip()Z
.end method

.method private static final native nativeAllowCleanMode()Z
.end method

.method private static final native nativeAllowCommentBookmark()Z
.end method

.method private static final native nativeAllowConversationDelete()Z
.end method

.method private static final native nativeAllowDurationAlert()Z
.end method

.method private static final native nativeAllowGroupApply()Z
.end method

.method private static final native nativeAllowHiddenContact()Z
.end method

.method private static final native nativeAllowLocalFeature()Z
.end method

.method private static final native nativeAllowPetElfCamp()Z
.end method

.method private static final native nativeAllowPetElfTask()Z
.end method

.method private static final native nativeAllowSpark()Z
.end method

.method private static final native nativeAllowTabFilter()Z
.end method

.method private static final native nativeAllowUiSurface()Z
.end method

.method private static final native nativeAllowVoiceReplace()Z
.end method

.method private static final native nativeCreateApplyPayload(Ljava/lang/String;J)Ljava/lang/String;
.end method

.method private static final native nativeGetApplyKeyMaterial()[B
.end method

.method private static final native nativeGetBetaListUrls()[Ljava/lang/String;
.end method

.method private static final native nativeIsRuntimeTrusted()Z
.end method

.method private static final native nativeQueryUiState()Ljava/lang/String;
.end method

.method private static final native nativeRefreshSession(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
.end method

.method private static final native nativeReset()V
.end method

.method private static final native nativeRestoreSession(Ljava/lang/String;Ljava/lang/String;)Z
.end method

.method public static α()Z
    .locals 3

    .line 1
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->σ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    :try_start_0
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->nativeAllowChapterSkip()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    new-instance v1, Leo1;

    .line 18
    .line 19
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    move-object v0, v1

    .line 23
    :goto_0
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 24
    .line 25
    instance-of v2, v0, Leo1;

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    move-object v0, v1

    .line 30
    :cond_0
    check-cast v0, Ljava/lang/Boolean;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    const/4 v0, 0x1

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const/4 v0, 0x0

    .line 41
    :goto_1
    return v0
.end method

.method public static β()Z
    .locals 3

    .line 1
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->σ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    :try_start_0
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->nativeAllowCleanMode()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    new-instance v1, Leo1;

    .line 18
    .line 19
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    move-object v0, v1

    .line 23
    :goto_0
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 24
    .line 25
    instance-of v2, v0, Leo1;

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    move-object v0, v1

    .line 30
    :cond_0
    check-cast v0, Ljava/lang/Boolean;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    const/4 v0, 0x1

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const/4 v0, 0x0

    .line 41
    :goto_1
    return v0
.end method

.method public static γ()Z
    .locals 3

    .line 1
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->σ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    :try_start_0
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->nativeAllowCommentBookmark()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    new-instance v1, Leo1;

    .line 18
    .line 19
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    move-object v0, v1

    .line 23
    :goto_0
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 24
    .line 25
    instance-of v2, v0, Leo1;

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    move-object v0, v1

    .line 30
    :cond_0
    check-cast v0, Ljava/lang/Boolean;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    const/4 v0, 0x1

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const/4 v0, 0x0

    .line 41
    :goto_1
    return v0
.end method

.method public static δ()Z
    .locals 3

    .line 1
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->σ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    :try_start_0
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->nativeAllowConversationDelete()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    new-instance v1, Leo1;

    .line 18
    .line 19
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    move-object v0, v1

    .line 23
    :goto_0
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 24
    .line 25
    instance-of v2, v0, Leo1;

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    move-object v0, v1

    .line 30
    :cond_0
    check-cast v0, Ljava/lang/Boolean;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    const/4 v0, 0x1

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const/4 v0, 0x0

    .line 41
    :goto_1
    return v0
.end method

.method public static ε()Z
    .locals 3

    .line 1
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->σ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    :try_start_0
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->nativeAllowDurationAlert()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    new-instance v1, Leo1;

    .line 18
    .line 19
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    move-object v0, v1

    .line 23
    :goto_0
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 24
    .line 25
    instance-of v2, v0, Leo1;

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    move-object v0, v1

    .line 30
    :cond_0
    check-cast v0, Ljava/lang/Boolean;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    const/4 v0, 0x1

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const/4 v0, 0x0

    .line 41
    :goto_1
    return v0
.end method

.method public static ζ()Z
    .locals 3

    .line 1
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->σ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    :try_start_0
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->nativeAllowGroupApply()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    new-instance v1, Leo1;

    .line 18
    .line 19
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    move-object v0, v1

    .line 23
    :goto_0
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 24
    .line 25
    instance-of v2, v0, Leo1;

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    move-object v0, v1

    .line 30
    :cond_0
    check-cast v0, Ljava/lang/Boolean;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    const/4 v0, 0x1

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const/4 v0, 0x0

    .line 41
    :goto_1
    return v0
.end method

.method public static η()Z
    .locals 3

    .line 1
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->σ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    :try_start_0
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->nativeAllowHiddenContact()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    new-instance v1, Leo1;

    .line 18
    .line 19
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    move-object v0, v1

    .line 23
    :goto_0
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 24
    .line 25
    instance-of v2, v0, Leo1;

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    move-object v0, v1

    .line 30
    :cond_0
    check-cast v0, Ljava/lang/Boolean;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    const/4 v0, 0x1

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const/4 v0, 0x0

    .line 41
    :goto_1
    return v0
.end method

.method public static θ()Z
    .locals 3

    .line 1
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->σ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    :try_start_0
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->nativeAllowLocalFeature()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    new-instance v1, Leo1;

    .line 18
    .line 19
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    move-object v0, v1

    .line 23
    :goto_0
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 24
    .line 25
    instance-of v2, v0, Leo1;

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    move-object v0, v1

    .line 30
    :cond_0
    check-cast v0, Ljava/lang/Boolean;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    const/4 v0, 0x1

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const/4 v0, 0x0

    .line 41
    :goto_1
    return v0
.end method

.method public static ι()Z
    .locals 3

    .line 1
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->σ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    :try_start_0
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->nativeAllowPetElfCamp()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    new-instance v1, Leo1;

    .line 18
    .line 19
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    move-object v0, v1

    .line 23
    :goto_0
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 24
    .line 25
    instance-of v2, v0, Leo1;

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    move-object v0, v1

    .line 30
    :cond_0
    check-cast v0, Ljava/lang/Boolean;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    const/4 v0, 0x1

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const/4 v0, 0x0

    .line 41
    :goto_1
    return v0
.end method

.method public static κ()Z
    .locals 3

    .line 1
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->σ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    :try_start_0
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->nativeAllowPetElfTask()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    new-instance v1, Leo1;

    .line 18
    .line 19
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    move-object v0, v1

    .line 23
    :goto_0
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 24
    .line 25
    instance-of v2, v0, Leo1;

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    move-object v0, v1

    .line 30
    :cond_0
    check-cast v0, Ljava/lang/Boolean;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    const/4 v0, 0x1

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const/4 v0, 0x0

    .line 41
    :goto_1
    return v0
.end method

.method public static λ()Z
    .locals 3

    .line 1
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->σ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    :try_start_0
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->nativeAllowSpark()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    new-instance v1, Leo1;

    .line 18
    .line 19
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    move-object v0, v1

    .line 23
    :goto_0
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 24
    .line 25
    instance-of v2, v0, Leo1;

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    move-object v0, v1

    .line 30
    :cond_0
    check-cast v0, Ljava/lang/Boolean;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    const/4 v0, 0x1

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const/4 v0, 0x0

    .line 41
    :goto_1
    return v0
.end method

.method public static μ()Z
    .locals 3

    .line 1
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->σ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    :try_start_0
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->nativeAllowTabFilter()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    new-instance v1, Leo1;

    .line 18
    .line 19
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    move-object v0, v1

    .line 23
    :goto_0
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 24
    .line 25
    instance-of v2, v0, Leo1;

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    move-object v0, v1

    .line 30
    :cond_0
    check-cast v0, Ljava/lang/Boolean;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    const/4 v0, 0x1

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const/4 v0, 0x0

    .line 41
    :goto_1
    return v0
.end method

.method public static ν()Z
    .locals 3

    .line 1
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->σ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    :try_start_0
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->nativeAllowUiSurface()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    new-instance v1, Leo1;

    .line 18
    .line 19
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    move-object v0, v1

    .line 23
    :goto_0
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 24
    .line 25
    instance-of v2, v0, Leo1;

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    move-object v0, v1

    .line 30
    :cond_0
    check-cast v0, Ljava/lang/Boolean;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    const/4 v0, 0x1

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const/4 v0, 0x0

    .line 41
    :goto_1
    return v0
.end method

.method public static ξ()Z
    .locals 3

    .line 1
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->σ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    :try_start_0
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->nativeAllowVoiceReplace()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    new-instance v1, Leo1;

    .line 18
    .line 19
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    move-object v0, v1

    .line 23
    :goto_0
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 24
    .line 25
    instance-of v2, v0, Leo1;

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    move-object v0, v1

    .line 30
    :cond_0
    check-cast v0, Ljava/lang/Boolean;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    const/4 v0, 0x1

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const/4 v0, 0x0

    .line 41
    :goto_1
    return v0
.end method

.method public static ο()[Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->σ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-array v0, v1, [Ljava/lang/String;

    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_0
    :try_start_0
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->nativeGetBetaListUrls()[Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    new-instance v2, Leo1;

    .line 18
    .line 19
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    move-object v0, v2

    .line 23
    :goto_0
    new-array v1, v1, [Ljava/lang/String;

    .line 24
    .line 25
    instance-of v2, v0, Leo1;

    .line 26
    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    move-object v0, v1

    .line 30
    :cond_1
    check-cast v0, [Ljava/lang/String;

    .line 31
    .line 32
    return-object v0
.end method

.method public static π(Ljava/lang/String;[B)Ljava/lang/String;
    .locals 6

    .line 1
    array-length v0, p1

    .line 2
    const/16 v1, 0x30

    .line 3
    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    const/16 v2, 0x20

    .line 8
    .line 9
    invoke-static {p1, v0, v2}, Lg7;->Ρ([BII)[B

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-static {p1, v2, v1}, Lg7;->Ρ([BII)[B

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    :try_start_0
    const-string v1, "AES/CBC/PKCS5Padding"

    .line 18
    .line 19
    invoke-static {v1}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    new-instance v2, Ljavax/crypto/spec/SecretKeySpec;

    .line 24
    .line 25
    const-string v4, "AES"

    .line 26
    .line 27
    invoke-direct {v2, v3, v4}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 28
    .line 29
    .line 30
    new-instance v4, Ljavax/crypto/spec/IvParameterSpec;

    .line 31
    .line 32
    invoke-direct {v4, p1}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    .line 33
    .line 34
    .line 35
    const/4 v5, 0x1

    .line 36
    invoke-virtual {v1, v5, v2, v4}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 37
    .line 38
    .line 39
    invoke-static {}, Ljava/util/Base64;->getUrlEncoder()Ljava/util/Base64$Encoder;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    sget-object v4, Lmf;->α:Ljava/nio/charset/Charset;

    .line 44
    .line 45
    invoke-virtual {p0, v4}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, p0}, Ljavax/crypto/Cipher;->doFinal([B)[B

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-virtual {v2, p0}, Ljava/util/Base64$Encoder;->encodeToString([B)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    .line 62
    .line 63
    array-length v1, v3

    .line 64
    invoke-static {v3, v0, v1, v0}, Ljava/util/Arrays;->fill([BIIB)V

    .line 65
    .line 66
    .line 67
    array-length v1, p1

    .line 68
    invoke-static {p1, v0, v1, v0}, Ljava/util/Arrays;->fill([BIIB)V

    .line 69
    .line 70
    .line 71
    return-object p0

    .line 72
    :catchall_0
    move-exception p0

    .line 73
    array-length v1, v3

    .line 74
    invoke-static {v3, v0, v1, v0}, Ljava/util/Arrays;->fill([BIIB)V

    .line 75
    .line 76
    .line 77
    array-length v1, p1

    .line 78
    invoke-static {p1, v0, v1, v0}, Ljava/util/Arrays;->fill([BIIB)V

    .line 79
    .line 80
    .line 81
    throw p0

    .line 82
    :cond_0
    const-string p0, "invalid apply material"

    .line 83
    .line 84
    invoke-static {p0}, Lγ;->ν(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    const/4 p0, 0x0

    .line 88
    return-object p0
.end method

.method public static ρ(JLjava/lang/String;)Lh9;
    .locals 8

    .line 1
    const-string v0, "generate failed: "

    .line 2
    .line 3
    const-string v1, "DYHBETA:"

    .line 4
    .line 5
    invoke-static {p2}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-static {p2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const-string v3, ""

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    if-nez v2, :cond_6

    .line 21
    .line 22
    const-string v2, "0"

    .line 23
    .line 24
    invoke-virtual {p2, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    goto/16 :goto_4

    .line 31
    .line 32
    :cond_0
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->σ()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-nez v2, :cond_1

    .line 37
    .line 38
    new-instance p0, Lh9;

    .line 39
    .line 40
    const-string p1, "native protection unavailable"

    .line 41
    .line 42
    invoke-direct {p0, v3, p1, v4}, Lh9;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 43
    .line 44
    .line 45
    return-object p0

    .line 46
    :cond_1
    :try_start_0
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->nativeGetApplyKeyMaterial()[B

    .line 47
    .line 48
    .line 49
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    goto :goto_0

    .line 51
    :catchall_0
    move-exception v2

    .line 52
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    const-string v5, "apply key material unavailable: "

    .line 57
    .line 58
    invoke-static {v5, v2}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    const/4 v5, 0x4

    .line 63
    const-string v6, "r2c07920444d2b8e4"

    .line 64
    .line 65
    const/4 v7, 0x0

    .line 66
    invoke-static {v6, v2, v7, v5, v7}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    move-object v2, v7

    .line 70
    :goto_0
    if-nez v2, :cond_2

    .line 71
    .line 72
    new-instance p0, Lh9;

    .line 73
    .line 74
    const-string p1, "key material unavailable"

    .line 75
    .line 76
    invoke-direct {p0, v3, p1, v4}, Lh9;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 77
    .line 78
    .line 79
    return-object p0

    .line 80
    :cond_2
    :try_start_1
    array-length v5, v2

    .line 81
    const/16 v6, 0x30

    .line 82
    .line 83
    if-eq v5, v6, :cond_3

    .line 84
    .line 85
    new-instance p0, Lh9;

    .line 86
    .line 87
    const-string p1, "invalid key material"

    .line 88
    .line 89
    invoke-direct {p0, v3, p1, v4}, Lh9;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 90
    .line 91
    .line 92
    array-length p1, v2

    .line 93
    invoke-static {v2, v4, p1, v4}, Ljava/util/Arrays;->fill([BIIB)V

    .line 94
    .line 95
    .line 96
    return-object p0

    .line 97
    :catchall_1
    move-exception p0

    .line 98
    goto :goto_2

    .line 99
    :cond_3
    :try_start_2
    invoke-static {p2, p0, p1}, Lcom/example/dyhelper/beta/BetaNativeBridge;->nativeCreateApplyPayload(Ljava/lang/String;J)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    if-eqz p1, :cond_4

    .line 108
    .line 109
    new-instance p0, Lh9;

    .line 110
    .line 111
    const-string p1, "payload unavailable"

    .line 112
    .line 113
    invoke-direct {p0, v3, p1, v4}, Lh9;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 114
    .line 115
    .line 116
    array-length p1, v2

    .line 117
    invoke-static {v2, v4, p1, v4}, Ljava/util/Arrays;->fill([BIIB)V

    .line 118
    .line 119
    .line 120
    return-object p0

    .line 121
    :cond_4
    :try_start_3
    invoke-static {p0, v2}, Lcom/example/dyhelper/beta/BetaNativeBridge;->π(Ljava/lang/String;[B)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    if-eqz p1, :cond_5

    .line 130
    .line 131
    new-instance p0, Lh9;

    .line 132
    .line 133
    const-string p1, "encrypt failed"

    .line 134
    .line 135
    invoke-direct {p0, v3, p1, v4}, Lh9;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 136
    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_5
    new-instance p1, Lh9;

    .line 140
    .line 141
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    const-string p2, "apply code generated"

    .line 146
    .line 147
    const/4 v1, 0x1

    .line 148
    invoke-direct {p1, p0, p2, v1}, Lh9;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 149
    .line 150
    .line 151
    move-object p0, p1

    .line 152
    :goto_1
    array-length p1, v2

    .line 153
    invoke-static {v2, v4, p1, v4}, Ljava/util/Arrays;->fill([BIIB)V

    .line 154
    .line 155
    .line 156
    goto :goto_3

    .line 157
    :goto_2
    :try_start_4
    new-instance p1, Lh9;

    .line 158
    .line 159
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    new-instance p2, Ljava/lang/StringBuilder;

    .line 164
    .line 165
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    invoke-direct {p1, v3, p0, v4}, Lh9;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 176
    .line 177
    .line 178
    array-length p0, v2

    .line 179
    invoke-static {v2, v4, p0, v4}, Ljava/util/Arrays;->fill([BIIB)V

    .line 180
    .line 181
    .line 182
    move-object p0, p1

    .line 183
    :goto_3
    return-object p0

    .line 184
    :catchall_2
    move-exception p0

    .line 185
    array-length p1, v2

    .line 186
    invoke-static {v2, v4, p1, v4}, Ljava/util/Arrays;->fill([BIIB)V

    .line 187
    .line 188
    .line 189
    throw p0

    .line 190
    :cond_6
    :goto_4
    new-instance p0, Lh9;

    .line 191
    .line 192
    const-string p1, "UID invalid"

    .line 193
    .line 194
    invoke-direct {p0, v3, p1, v4}, Lh9;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 195
    .line 196
    .line 197
    return-object p0
.end method

.method public static σ()Z
    .locals 5

    .line 1
    sget-object v0, Lcom/example/dyhelper/beta/BetaNativeBridge;->β:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-interface {v0}, Loq0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    :try_start_0
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->nativeIsRuntimeTrusted()Z

    .line 18
    .line 19
    .line 20
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    return v0

    .line 22
    :catchall_0
    move-exception v0

    .line 23
    sget-object v2, Lcom/example/dyhelper/beta/BetaNativeBridge;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 24
    .line 25
    const/4 v3, 0x1

    .line 26
    invoke-virtual {v2, v1, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const-string v2, "native runtime check failed: "

    .line 37
    .line 38
    invoke-static {v2, v0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const/4 v2, 0x4

    .line 43
    const-string v3, "r2c07920444d2b8e4"

    .line 44
    .line 45
    const/4 v4, 0x0

    .line 46
    invoke-static {v3, v0, v4, v2, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    :cond_1
    :goto_0
    return v1
.end method

.method public static τ()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->σ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->nativeQueryUiState()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :cond_0
    const-string v0, "0\nunavailable"

    .line 13
    .line 14
    return-object v0
.end method

.method public static υ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->σ()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-static {p0, p1}, Lcom/example/dyhelper/beta/BetaNativeBridge;->nativeRefreshSession(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :cond_0
    const-string p0, "beta native protection unavailable"

    .line 16
    .line 17
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    return-object p0
.end method

.method public static φ()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->σ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->nativeReset()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public static χ(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->σ()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    return p0

    .line 12
    :cond_0
    invoke-static {p0, p1}, Lcom/example/dyhelper/beta/BetaNativeBridge;->nativeRestoreSession(Ljava/lang/String;Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method
