.class public final Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook$hookUserProfileActivity$1$3;
.super Lm01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->hookUserProfileActivity(Ljava/lang/ClassLoader;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $this_runCatching:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;


# direct methods
.method public constructor <init>(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook$hookUserProfileActivity$1$3;->$this_runCatching:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;

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
    .locals 3

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
    goto :goto_0

    .line 14
    :cond_0
    move-object v0, v2

    .line 15
    :goto_0
    if-nez v0, :cond_1

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_1
    iget-object p1, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, Lg7;->б([Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    instance-of v1, p1, Ljava/lang/Boolean;

    .line 28
    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    move-object v2, p1

    .line 32
    check-cast v2, Ljava/lang/Boolean;

    .line 33
    .line 34
    :cond_2
    if-eqz v2, :cond_3

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eqz p1, :cond_3

    .line 41
    .line 42
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook$hookUserProfileActivity$1$3;->$this_runCatching:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;

    .line 43
    .line 44
    const-string p1, "UserProfileActivity.onWindowFocusChanged"

    .line 45
    .line 46
    invoke-static {p0, v0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->access$cacheCurrentProfileInfo(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;Landroid/app/Activity;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    :cond_3
    :goto_1
    return-void
.end method
