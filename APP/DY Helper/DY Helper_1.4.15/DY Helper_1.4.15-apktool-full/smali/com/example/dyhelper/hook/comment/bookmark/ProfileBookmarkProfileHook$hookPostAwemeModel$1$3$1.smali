.class public final Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook$hookPostAwemeModel$1$3$1;
.super Lm01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->hookPostAwemeModel(Ljava/lang/ClassLoader;)V
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
    iput-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook$hookPostAwemeModel$1$3$1;->$this_runCatching:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;

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
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook$hookPostAwemeModel$1$3$1;->$this_runCatching:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;

    .line 5
    .line 6
    iget-object v0, p1, Lk01;->β:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object p1, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Lg7;->б([Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-static {p0, v0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->access$handleFeedItemListFromModel(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method
