.class public final Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook$hookProfileFragments$1$1$1$1;
.super Lm01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->hookProfileFragments(Ljava/lang/ClassLoader;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $cls:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field final synthetic $this_runCatching:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;


# direct methods
.method public constructor <init>(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook$hookProfileFragments$1$1$1$1;->$this_runCatching:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook$hookProfileFragments$1$1$1$1;->$cls:Ljava/lang/Class;

    .line 4
    .line 5
    invoke-direct {p0}, Lm01;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lk01;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook$hookProfileFragments$1$1$1$1;->$this_runCatching:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;

    .line 5
    .line 6
    iget-object p1, p1, Lk01;->β:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook$hookProfileFragments$1$1$1$1;->$cls:Ljava/lang/Class;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const-string v1, ".onResume"

    .line 15
    .line 16
    invoke-virtual {p0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-static {v0, p1, p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->access$cacheProfileFromFragment(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method
