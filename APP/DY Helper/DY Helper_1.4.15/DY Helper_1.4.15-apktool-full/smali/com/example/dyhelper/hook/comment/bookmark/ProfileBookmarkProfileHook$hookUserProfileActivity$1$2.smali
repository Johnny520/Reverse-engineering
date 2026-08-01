.class public final Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook$hookUserProfileActivity$1$2;
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
    iput-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook$hookUserProfileActivity$1$2;->$this_runCatching:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;

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
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p1, Lk01;->β:Ljava/lang/Object;

    .line 5
    .line 6
    instance-of v0, p1, Landroid/app/Activity;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    check-cast p1, Landroid/app/Activity;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    :goto_0
    if-nez p1, :cond_1

    .line 15
    .line 16
    return-void

    .line 17
    :cond_1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook$hookUserProfileActivity$1$2;->$this_runCatching:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;

    .line 18
    .line 19
    const-string v0, "UserProfileActivity.onResume"

    .line 20
    .line 21
    invoke-static {p0, p1, v0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->access$cacheCurrentProfileInfo(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;Landroid/app/Activity;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method
