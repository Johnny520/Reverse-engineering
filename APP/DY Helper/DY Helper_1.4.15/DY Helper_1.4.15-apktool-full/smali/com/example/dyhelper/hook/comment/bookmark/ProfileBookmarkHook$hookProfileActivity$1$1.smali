.class public final Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook$hookProfileActivity$1$1;
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
    iput-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook$hookProfileActivity$1$1;->$this_runCatching:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;

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
    .locals 6

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
    :goto_0
    move-object v1, p1

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    goto :goto_0

    .line 16
    :goto_1
    if-nez v1, :cond_1

    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    iget-object v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook$hookProfileActivity$1$1;->$this_runCatching:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;

    .line 20
    .line 21
    const/4 v4, 0x4

    .line 22
    const/4 v5, 0x0

    .line 23
    const-string v2, "onCreate"

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    invoke-static/range {v0 .. v5}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->scheduleAttach$default(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;Landroid/app/Activity;Ljava/lang/String;IILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;

    .line 30
    .line 31
    invoke-virtual {p0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->requestInject(Landroid/app/Activity;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method
