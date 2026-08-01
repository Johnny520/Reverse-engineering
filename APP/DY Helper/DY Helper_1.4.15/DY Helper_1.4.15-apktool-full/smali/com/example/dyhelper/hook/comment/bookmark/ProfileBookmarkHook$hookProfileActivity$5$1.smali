.class public final Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook$hookProfileActivity$5$1;
.super Lm01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->hookProfileActivity(Ljava/lang/ClassLoader;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $this_runCatching:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;


# direct methods
.method public constructor <init>(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook$hookProfileActivity$5$1;->$this_runCatching:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;

    .line 2
    .line 3
    invoke-direct {p0}, Lm01;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lk01;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lk01;->β:Ljava/lang/Object;

    .line 5
    .line 6
    instance-of v1, v0, Landroid/app/Activity;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    check-cast v0, Landroid/app/Activity;

    .line 12
    .line 13
    move-object v4, v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v4, v2

    .line 16
    :goto_0
    if-nez v4, :cond_1

    .line 17
    .line 18
    goto :goto_2

    .line 19
    :cond_1
    iget-object p1, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-static {p1}, Lg7;->б([Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    instance-of v0, p1, Ljava/lang/Boolean;

    .line 29
    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    move-object v2, p1

    .line 33
    check-cast v2, Ljava/lang/Boolean;

    .line 34
    .line 35
    :cond_2
    if-eqz v2, :cond_3

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    goto :goto_1

    .line 42
    :cond_3
    const/4 p1, 0x0

    .line 43
    :goto_1
    if-eqz p1, :cond_4

    .line 44
    .line 45
    iget-object v3, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook$hookProfileActivity$5$1;->$this_runCatching:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;

    .line 46
    .line 47
    const/4 v7, 0x4

    .line 48
    const/4 v8, 0x0

    .line 49
    const-string v5, "onWindowFocusChanged"

    .line 50
    .line 51
    const/4 v6, 0x0

    .line 52
    invoke-static/range {v3 .. v8}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->scheduleAttach$default(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;Landroid/app/Activity;Ljava/lang/String;IILjava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;

    .line 56
    .line 57
    invoke-virtual {p0, v4}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->requestInject(Landroid/app/Activity;)V

    .line 58
    .line 59
    .line 60
    :cond_4
    :goto_2
    return-void
.end method
